;;;; -*- indent-tabs-mode: nil -*-
;;;
;;; cusp-loader.lisp --- Compile and load the Slime backend.
;;;
;;; Created 2003, James Bielman <jamesjb@jamesjb.com>
;;;
;;; This code has been placed in the Public Domain.  All warranties
;;; are disclaimed.
;;;

;; If you want customize the source- or fasl-directory you can set
;; cusp-loader:*source-directory* resp. cusp-loader:*fasl-directory*
;; before loading this files. (you also need to create the
;; cusp-loader package.)
;; E.g.:
;;
;;   (make-package :cusp-loader)
;;   (defparameter cusp-loader::*fasl-directory* "/tmp/fasl/")
;;   (load ".../cusp-loader.lisp")

(cl:defpackage :cusp-loader
  (:use :cl)
  (:export :init
           :dump-image
           :*source-directory*
           :*fasl-directory*))

(cl:in-package :cusp-loader)

(defvar *source-directory*
  (make-pathname :name nil :type nil
                 :defaults (or *load-pathname* *default-pathname-defaults*))
  "The directory where to look for the source.")

(defparameter *sysdep-files*
  #+cmu '(cusp-source-path-parser cusp-source-file-cache cusp-cmucl)
  #+scl '(cusp-source-path-parser cusp-source-file-cache cusp-scl)
  #+sbcl '(cusp-source-path-parser cusp-source-file-cache
           cusp-sbcl cusp-gray)
  #+clozure '(metering cusp-ccl cusp-gray)
  #+lispworks '(cusp-lispworks cusp-gray)
  #+allegro '(cusp-allegro cusp-gray)
  #+clisp '(xref metering cusp-clisp cusp-gray)
  #+armedbear '(cusp-abcl)
  #+cormanlisp '(cusp-corman cusp-gray)
  #+ecl '(cusp-source-path-parser cusp-source-file-cache cusp-ecl cusp-gray))

(defparameter *implementation-features*
  '(:allegro :lispworks :sbcl :clozure :cmu :clisp :ccl :corman :cormanlisp
    :armedbear :gcl :ecl :scl))

(defparameter *os-features*
  '(:macosx :linux :windows :mswindows :win32 :solaris :darwin :sunos :hpux
    :unix))

(defparameter *architecture-features*
  '(:powerpc :ppc :x86 :x86-64 :amd64 :i686 :i586 :i486 :pc386 :iapx386
    :sparc64 :sparc :hppa64 :hppa))

(defun lisp-version-string ()
  #+(or clozure cmu) (substitute-if #\_ (lambda (x) (find x " /"))
                                    (lisp-implementation-version))
  #+(or cormanlisp scl sbcl ecl)       (lisp-implementation-version)
  #+lispworks (lisp-implementation-version)
  #+allegro   (format nil "~A~A~A~A"
                      excl::*common-lisp-version-number*
                      (if (eq 'h 'H) "A" "M")     ; ANSI vs MoDeRn
                      (if (member :64bit *features*) "-64bit" "")
                      (excl:ics-target-case
                       (:-ics "")
                       (:+ics "-ics")))
  #+clisp     (let ((s (lisp-implementation-version)))
                (subseq s 0 (position #\space s)))
  #+armedbear (lisp-implementation-version))

(defun unique-dir-name ()
  "Return a name that can be used as a directory name that is
unique to a Lisp implementation, Lisp implementation version,
operating system, and hardware architecture."
  (flet ((first-of (features)
           (loop for f in features
                 when (find f *features*) return it))
         (maybe-warn (value fstring &rest args)
           (cond (value)
                 (t (apply #'warn fstring args)
                    "unknown"))))
    (let ((lisp (maybe-warn (first-of *implementation-features*)
                            "No implementation feature found in ~a."
                            *implementation-features*))
          (os   (maybe-warn (first-of *os-features*)
                            "No os feature found in ~a." *os-features*))
          (arch (maybe-warn (first-of *architecture-features*)
                            "No architecture feature found in ~a."
                            *architecture-features*))
          (version (maybe-warn (lisp-version-string)
                               "Don't know how to get Lisp ~
                                implementation version.")))
      (format nil "~(~@{~a~^-~}~)" lisp version os arch))))

(defun file-newer-p (new-file old-file)
  "Returns true if NEW-FILE is newer than OLD-FILE."
  (> (file-write-date new-file) (file-write-date old-file)))

(defun slime-version-string ()
  "Return a string identifying the SLIME version.
Return nil if nothing appropriate is available."
  (with-open-file (s (merge-pathnames "ChangeLog" *source-directory*)
                     :if-does-not-exist nil)
    (and s (symbol-name (read s)))))

(defun default-fasl-dir ()
  (merge-pathnames
   (make-pathname
    :directory `(:relative ".slime" "fasl"
                 ,@(if (slime-version-string) (list (slime-version-string)))
                 ,(unique-dir-name)))
   (user-homedir-pathname)))

(defun binary-pathname (src-pathname binary-dir)
  "Return the pathname where SRC-PATHNAME's binary should be compiled."
  (let ((cfp (compile-file-pathname src-pathname)))
    (merge-pathnames (make-pathname :name (pathname-name cfp)
                                    :type (pathname-type cfp))
                     binary-dir)))

(defun handle-loadtime-error (condition binary-pathname)
  (pprint-logical-block (*error-output* () :per-line-prefix ";; ")
    (format *error-output*
            "~%Error while loading: ~A~%Condition: ~A~%Aborting.~%"
            binary-pathname condition))
  (when (equal (directory-namestring binary-pathname)
               (directory-namestring (default-fasl-dir)))
    (ignore-errors (delete-file binary-pathname)))
  (abort))

(defun compile-files (files fasl-dir load)
  "Compile each file in FILES if the source is newer than its
corresponding binary, or the file preceding it was recompiled.
If LOAD is true, load the fasl file."
  (let ((needs-recompile nil))
    (dolist (src files)
      (let ((dest (binary-pathname src fasl-dir)))
        (handler-case
            (progn
              (when (or needs-recompile
                        (not (probe-file dest))
                        (file-newer-p src dest))
                ;; need a to recompile src-pathname, so we'll
                ;; need to recompile everything after this too.
                (setq needs-recompile t)
                (ensure-directories-exist dest)
                (compile-file src :output-file dest :print nil :verbose t))
              (when load
                (load dest :verbose t)))
          ;; Fail as early as possible
          (serious-condition (c)
            (handle-loadtime-error c dest)))))))

#+(or cormanlisp ecl)
(defun compile-files (files fasl-dir load)
  "Corman Lisp and ECL have trouble with compiled files."
  (declare (ignore fasl-dir))
  (when load
    (dolist (file files)
      (load file :verbose t)
      (force-output))))

(defun load-user-init-file ()
  "Load the user init file, return NIL if it does not exist."
  (load (merge-pathnames (user-homedir-pathname)
                         (make-pathname :name ".cusp" :type "lisp"))
        :if-does-not-exist nil))

(defun load-site-init-file (dir)
  (load (make-pathname :name "site-init" :type "lisp"
                       :defaults dir)
        :if-does-not-exist nil))

(defun src-files (names src-dir)
  (mapcar (lambda (name)
            (make-pathname :name (string-downcase name) :type "lisp"
                           :defaults src-dir))
          names))

(defvar *cusp-files* `(cusp-backend ,@*sysdep-files* cusp))

(defvar *contribs* '(cusp-c-p-c cusp-arglists cusp-fuzzy
                     cusp-fancy-inspector
                     cusp-presentations cusp-presentation-streams
                     #+(or asdf sbcl) cusp-asdf
                     cusp-package-fu
                     cusp-sbcl-exts
                     )
  "List of names for contrib modules.")

(defvar *fasl-directory* (default-fasl-dir)
  "The directory where fasl files should be placed.")

(defun append-dir (absolute name)
  (merge-pathnames 
   (make-pathname :directory `(:relative ,name) :defaults absolute)
   absolute))

(defun contrib-dir (base-dir)
  (append-dir base-dir "contrib"))

(defun q (s) (read-from-string s))

(defun load-cusp (&key (src-dir *source-directory*)
                   (fasl-dir *fasl-directory*))
  (compile-files (src-files *cusp-files* src-dir) fasl-dir t)
  (funcall (q "cusp::before-init")
           (slime-version-string)
           (list (contrib-dir fasl-dir)
                 (contrib-dir src-dir))))

(defun compile-contribs (&key (src-dir (contrib-dir *source-directory*))
                         (fasl-dir (contrib-dir *fasl-directory*))
                         load)
  (compile-files (src-files *contribs* src-dir) fasl-dir load))
  
(defun loadup ()
  (load-cusp)
  (compile-contribs :load t))

(defun setup ()
  (load-site-init-file *source-directory*)
  (load-user-init-file)
  (eval `(pushnew 'compile-contribs ,(q "cusp::*after-init-hook*")))
  (funcall (q "cusp::init")))

(defun init (&key delete reload load-contribs (setup t))
  "Load CUSP and initialize some global variables.
If DELETE is true, delete any existing CUSP packages.
If RELOAD is true, reload CUSP, even if the CUSP package already exists.
If LOAD-CONTRIBS is true, load all contribs
If SETUP is true, load user init files and initialize some
global variabes in CUSP."
  (when (and delete (find-package :cusp))
    (mapc #'delete-package '(:cusp :cusp-io-package :cusp-backend)))
  (cond ((or (not (find-package :cusp)) reload)
         (load-cusp))
        (t 
         (warn "Not reloading CUSP.  Package already exists.")))
  (when load-contribs
    (compile-contribs :load t))
  (when setup
    (setup)))

(defun dump-image (filename)
  (init :setup nil)
  (funcall (q "cusp-backend:save-image") filename))
