;;; -*- Mode: lisp; indent-tabs-mode: nil; outline-regexp: ";;;;;*" -*-
;;;
;;; slime-backend.lisp --- SLIME backend interface.
;;;
;;; Created by James Bielman in 2003. Released into the public domain.
;;;
;;;; Frontmatter
;;;
;;; This file defines the functions that must be implemented
;;; separately for each Lisp. Each is declared as a generic function
;;; for which cusp-<implementation>.lisp provides methods.

(defpackage :cusp-backend
  (:use :common-lisp)
  (:export #:sldb-condition
           #:compiler-condition
           #:original-condition
           #:message
           #:source-context
           #:condition
           #:severity
           #:with-compilation-hooks
           #:location
           #:location-p
           #:location-buffer
           #:location-position
           #:position-p
           #:position-pos
           #:print-output-to-string
           #:quit-lisp
           #:references
           #:unbound-slot-filler
           #:declaration-arglist
           #:type-specifier-arglist
           ;; interrupt macro for the backend
           #:*pending-slime-interrupts*
           #:check-slime-interrupts
           #:*interrupt-queued-handler*
           ;; inspector related symbols
           #:emacs-inspect
           #:label-value-line
           #:label-value-line*
           
           #:with-struct
           ))

(defpackage :cusp-mop
  (:use)
  (:export
   ;; classes
   #:standard-generic-function
   #:standard-slot-definition
   #:standard-method
   #:standard-class
   #:eql-specializer
   #:eql-specializer-object
   ;; standard-class readers
   #:class-default-initargs
   #:class-direct-default-initargs
   #:class-direct-slots
   #:class-direct-subclasses
   #:class-direct-superclasses
   #:class-finalized-p
   #:class-name
   #:class-precedence-list
   #:class-prototype
   #:class-slots
   #:specializer-direct-methods
   ;; generic function readers
   #:generic-function-argument-precedence-order
   #:generic-function-declarations
   #:generic-function-lambda-list
   #:generic-function-methods
   #:generic-function-method-class
   #:generic-function-method-combination
   #:generic-function-name
   ;; method readers
   #:method-generic-function
   #:method-function
   #:method-lambda-list
   #:method-specializers
   #:method-qualifiers
   ;; slot readers
   #:slot-definition-allocation
   #:slot-definition-documentation
   #:slot-definition-initargs
   #:slot-definition-initform
   #:slot-definition-initfunction
   #:slot-definition-name
   #:slot-definition-type
   #:slot-definition-readers
   #:slot-definition-writers
   #:slot-boundp-using-class
   #:slot-value-using-class
   #:slot-makunbound-using-class
   ;; generic function protocol
   #:compute-applicable-methods-using-classes
   #:finalize-inheritance))

(in-package :cusp-backend)


;;;; Metacode

(defparameter *interface-functions* '()
  "The names of all interface functions.")

(defparameter *unimplemented-interfaces* '()
  "List of interface functions that are not implemented.
DEFINTERFACE adds to this list and DEFIMPLEMENTATION removes.")

(defmacro definterface (name args documentation &rest default-body)
  "Define an interface function for the backend to implement.
A function is defined with NAME, ARGS, and DOCUMENTATION.  This
function first looks for a function to call in NAME's property list
that is indicated by 'IMPLEMENTATION; failing that, it looks for a
function indicated by 'DEFAULT. If neither is present, an error is
signaled.

If a DEFAULT-BODY is supplied, then a function with the same body and
ARGS will be added to NAME's property list as the property indicated
by 'DEFAULT.

Backends implement these functions using DEFIMPLEMENTATION."
  (check-type documentation string "a documentation string")
  (assert (every #'symbolp args) ()
          "Complex lambda-list not supported: ~S ~S" name args)
  (labels ((gen-default-impl ()
             `(setf (get ',name 'default) (lambda ,args ,@default-body)))
           (args-as-list (args)
             (destructuring-bind (req opt key rest) (parse-lambda-list args)
               `(,@req ,@opt 
                       ,@(loop for k in key append `(,(kw k) ,k)) 
                       ,@(or rest '(())))))
           (parse-lambda-list (args)
             (parse args '(&optional &key &rest) 
                    (make-array 4 :initial-element nil)))
           (parse (args keywords vars)
             (cond ((null args) 
                    (reverse (map 'list #'reverse vars)))
                   ((member (car args) keywords)
                    (parse (cdr args) (cdr (member (car args) keywords)) vars))
                   (t (push (car args) (aref vars (length keywords)))
                      (parse (cdr args) keywords vars))))
           (kw (s) (intern (string s) :keyword)))
    `(progn 
       (defun ,name ,args
         ,documentation
         (let ((f (or (get ',name 'implementation)
                      (get ',name 'default))))
           (cond (f (apply f ,@(args-as-list args)))
                 (t (error "~S not implemented" ',name)))))
       (pushnew ',name *interface-functions*)
       ,(if (null default-body)
            `(pushnew ',name *unimplemented-interfaces*)
            (gen-default-impl))
       ;; see <http://www.franz.com/support/documentation/6.2/doc/pages/variables/compiler/s_cltl1-compile-file-toplevel-compatibility-p_s.htm>
       (eval-when (:compile-toplevel :load-toplevel :execute)
         (export ',name :cusp-backend))
       ',name)))

(defmacro defimplementation (name args &body body)
  (assert (every #'symbolp args) ()
          "Complex lambda-list not supported: ~S ~S" name args)
  `(progn
     (setf (get ',name 'implementation) (lambda ,args ,@body))
     (if (member ',name *interface-functions*)
         (setq *unimplemented-interfaces*
               (remove ',name *unimplemented-interfaces*))
         (warn "DEFIMPLEMENTATION of undefined interface (~S)" ',name))
     ',name))

(defun warn-unimplemented-interfaces ()
  "Warn the user about unimplemented backend features.
The portable code calls this function at startup."
  (let ((*print-pretty* t))
    (warn "These Cusp interfaces are unimplemented:~% ~:<~{~A~^ ~:_~}~:>"
          (list (sort (copy-list *unimplemented-interfaces*) #'string<)))))

(defun import-to-cusp-mop (symbol-list)
  (dolist (sym symbol-list)
    (let* ((cusp-mop-sym (find-symbol (symbol-name sym) :cusp-mop)))
      (when cusp-mop-sym
        (unintern cusp-mop-sym :cusp-mop))
      (import sym :cusp-mop)
      (export sym :cusp-mop))))

(defun import-cusp-mop-symbols (package except)
  "Import the mop symbols from PACKAGE to CUSP-MOP.
EXCEPT is a list of symbol names which should be ignored."
  (do-symbols (s :cusp-mop)
    (unless (member s except :test #'string=)
      (let ((real-symbol (find-symbol (string s) package)))
        (assert real-symbol () "Symbol ~A not found in package ~A" s package)
        (unintern s :cusp-mop)
        (import real-symbol :cusp-mop)
        (export real-symbol :cusp-mop)))))

(defvar *gray-stream-symbols*
  '(:fundamental-character-output-stream
    :stream-write-char
    :stream-write-string
    :stream-fresh-line
    :stream-force-output
    :stream-finish-output
    :fundamental-character-input-stream
    :stream-read-char
    :stream-peek-char
    :stream-read-line
    ;; STREAM-FILE-POSITION is not available on all implementations, or
    ;; partially under a different name.
    ; :stream-file-posiion
    :stream-listen
    :stream-unread-char
    :stream-clear-input
    :stream-line-column
    :stream-read-char-no-hang
    ;; STREAM-LINE-LENGTH is an extension to gray streams that's apparently
    ;; supported by CMUCL, OpenMCL, SBCL and SCL.
    #+(or cmu openmcl sbcl scl)
    :stream-line-length))

(defun import-from (package symbol-names &optional (to-package *package*))
  "Import the list of SYMBOL-NAMES found in the package PACKAGE."
  (dolist (name symbol-names)
    (multiple-value-bind (symbol found) (find-symbol (string name) package)
      (assert found () "Symbol ~A not found in package ~A" name package)
      (import symbol to-package))))


;;;; Utilities

(defmacro with-struct ((conc-name &rest names) obj &body body)
  "Like with-slots but works only for structs."
  (flet ((reader (slot) (intern (concatenate 'string
					     (symbol-name conc-name)
					     (symbol-name slot))
				(symbol-package conc-name))))
    (let ((tmp (gensym "OO-")))
    ` (let ((,tmp ,obj))
        (symbol-macrolet
            ,(loop for name in names collect 
                   (typecase name
                     (symbol `(,name (,(reader name) ,tmp)))
                     (cons `(,(first name) (,(reader (second name)) ,tmp)))
                     (t (error "Malformed syntax in WITH-STRUCT: ~A" name))))
          ,@body)))))

(defun with-symbol (name package)
  "Generate a form suitable for testing with #+."
  (if (find-symbol (string name) (string package))
      '(:and)
      '(:or)))


;;;; TCP server

(definterface create-socket (host port)
  "Create a listening TCP socket on interface HOST and port PORT .")

(definterface local-port (socket)
  "Return the local port number of SOCKET.")

(definterface close-socket (socket)
  "Close the socket SOCKET.")

(definterface accept-connection (socket &key external-format
                                        buffering timeout)
   "Accept a client connection on the listening socket SOCKET.  
Return a stream for the new connection.")

(definterface add-sigio-handler (socket fn)
  "Call FN whenever SOCKET is readable.")

(definterface remove-sigio-handlers (socket)
  "Remove all sigio handlers for SOCKET.")

(definterface add-fd-handler (socket fn)
  "Call FN when Lisp is waiting for input and SOCKET is readable.")

(definterface remove-fd-handlers (socket)
  "Remove all fd-handlers for SOCKET.")

(definterface preferred-communication-style ()
  "Return one of the symbols :spawn, :sigio, :fd-handler, or NIL."
  nil)

(definterface set-stream-timeout (stream timeout)
  "Set the 'stream 'timeout.  The timeout is either the real number
  specifying the timeout in seconds or 'nil for no timeout."
  (declare (ignore stream timeout))
  nil)

;;; Base condition for networking errors.
(define-condition network-error (simple-error) ())

(definterface emacs-connected ()
   "Hook called when the first connection from Emacs is established.
Called from the INIT-FN of the socket server that accepts the
connection.

This is intended for setting up extra context, e.g. to discover
that the calling thread is the one that interacts with Emacs."
   nil)


;;;; Unix signals

(defconstant +sigint+ 2)

(definterface call-without-interrupts (fn)
  "Call FN in a context where interrupts are disabled."
  (funcall fn))

(definterface getpid ()
  "Return the (Unix) process ID of this superior Lisp.")

(definterface install-sigint-handler (function)
  "Call FUNCTION on SIGINT (instead of invoking the debugger).
Return old signal handler."
  (declare (ignore function))
  nil)

(definterface call-with-user-break-handler (handler function)
  "Install the break handler HANDLER while executing FUNCTION."
  (let ((old-handler (install-sigint-handler handler)))
    (unwind-protect (funcall function)
      (install-sigint-handler old-handler))))

(definterface quit-lisp ()
  "Exit the current lisp image.")

(definterface lisp-implementation-type-name ()
  "Return a short name for the Lisp implementation."
  (lisp-implementation-type))


;; pathnames are sooo useless

(definterface filename-to-pathname (filename)
  "Return a pathname for FILENAME.
A filename in Emacs may for example contain asterisks which should not
be translated to wildcards."
  (parse-namestring filename))

(definterface pathname-to-filename (pathname)
  "Return the filename for PATHNAME."
  (namestring pathname))

(definterface default-directory ()
  "Return the default directory."
  (directory-namestring (truename *default-pathname-defaults*)))

(definterface set-default-directory (directory)
  "Set the default directory.
This is used to resolve filenames without directory component."
  (setf *default-pathname-defaults* (truename (merge-pathnames directory)))
  (default-directory))


(definterface call-with-syntax-hooks (fn)
  "Call FN with hooks to handle special syntax."
  (funcall fn))

(definterface default-readtable-alist ()
  "Return a suitable initial value for CUSP:*READTABLE-ALIST*."
  '())


;;;; Compilation

(definterface call-with-compilation-hooks (func)
  "Call FUNC with hooks to record compiler conditions.")

(defmacro with-compilation-hooks ((&rest ignore) &body body)
  "Execute BODY as in CALL-WITH-COMPILATION-HOOKS."
  (declare (ignore ignore))
  `(call-with-compilation-hooks (lambda () (progn ,@body))))

(definterface cusp-compile-string (string &key buffer position filename
                                           policy)
  "Compile source from STRING.
During compilation, compiler conditions must be trapped and
resignalled as COMPILER-CONDITIONs.

If supplied, BUFFER and POSITION specify the source location in Emacs.

Additionally, if POSITION is supplied, it must be added to source
positions reported in compiler conditions.

If FILENAME is specified it may be used by certain implementations to
rebind *DEFAULT-PATHNAME-DEFAULTS* which may improve the recording of
source information.

If POLICY is supplied, and non-NIL, it may be used by certain
implementations to compile with a debug optimization quality of its
value.

Should return T on successfull compilation, NIL otherwise.
")

(definterface cusp-compile-file (input-file output-file load-p 
                                             external-format)
   "Compile INPUT-FILE signalling COMPILE-CONDITIONs.
If LOAD-P is true, load the file after compilation.
EXTERNAL-FORMAT is a value returned by find-external-format or
:default.

Should return OUTPUT-TRUENAME, WARNINGS-P and FAILURE-p
like `compile-file'")

(deftype severity () 
  '(member :error :read-error :warning :style-warning :note :redefinition))

;; Base condition type for compiler errors, warnings and notes.
(define-condition compiler-condition (condition)
  ((original-condition
    ;; The original condition thrown by the compiler if appropriate.
    ;; May be NIL if a compiler does not report using conditions.
    :type (or null condition)
    :initarg :original-condition
    :accessor original-condition)

   (severity :type severity
             :initarg :severity
             :accessor severity)

   (message :initarg :message
            :accessor message)

   ;; Macro expansion history etc. which may be helpful in some cases
   ;; but is often very verbose.
   (source-context :initarg :source-context
                   :type (or null string)
                   :initform nil
                   :accessor source-context)

   (references :initarg :references
               :initform nil
               :accessor references)

   (location :initarg :location
             :accessor location)))

(definterface find-external-format (coding-system)
  "Return a \"external file format designator\" for CODING-SYSTEM.
CODING-SYSTEM is Emacs-style coding system name (a string),
e.g. \"latin-1-unix\"."
  (if (equal coding-system "iso-latin-1-unix")
      :default
      nil))

(definterface guess-external-format (pathname)
  "Detect the external format for the file with name pathname.
Return nil if the file contains no special markers."
  ;; Look for a Emacs-style -*- coding: ... -*- or Local Variable: section.
  (with-open-file (s pathname :if-does-not-exist nil
                     :external-format (or (find-external-format "latin-1-unix")
                                          :default))
    (if s 
        (or (let* ((line (read-line s nil))
                   (p (search "-*-" line)))
              (when p
                (let* ((start (+ p (length "-*-")))
                       (end (search "-*-" line :start2 start)))
                  (when end
                    (%search-coding line start end)))))
            (let* ((len (file-length s))
                   (buf (make-string (min len 3000))))
              (file-position s (- len (length buf)))
              (read-sequence buf s)
              (let ((start (search "Local Variables:" buf :from-end t))
                    (end (search "End:" buf :from-end t)))
                (and start end (< start end)
                     (%search-coding buf start end))))))))

(defun %search-coding (str start end)
  (let ((p (search "coding:" str :start2 start :end2 end)))
    (when p
      (incf p (length "coding:"))
      (loop while (and (< p end)
                       (member (aref str p) '(#\space #\tab)))
            do (incf p))
      (let ((end (position-if (lambda (c) (find c '(#\space #\tab #\newline)))
                              str :start p)))
        (find-external-format (subseq str p end))))))


;;;; Streams

(definterface make-output-stream (write-string)
  "Return a new character output stream.
The stream calls WRITE-STRING when output is ready.")

(definterface make-input-stream (read-string)
  "Return a new character input stream.
The stream calls READ-STRING when input is needed.")


;;;; Documentation

(definterface arglist (name)
   "Return the lambda list for the symbol NAME. NAME can also be
a lisp function object, on lisps which support this.

The result can be a list or the :not-available keyword if the
arglist cannot be determined."
   (declare (ignore name))
   :not-available)

(defgeneric declaration-arglist (decl-identifier)
  (:documentation
   "Return the argument list of the declaration specifier belonging to the
declaration identifier DECL-IDENTIFIER. If the arglist cannot be determined,
the keyword :NOT-AVAILABLE is returned.

The different CUSP backends can specialize this generic function to
include implementation-dependend declaration specifiers, or to provide
additional information on the specifiers defined in ANSI Common Lisp.")
  (:method (decl-identifier)
    (case decl-identifier
      (dynamic-extent '(&rest vars))
      (ignore         '(&rest vars))
      (ignorable      '(&rest vars))
      (special        '(&rest vars))
      (inline         '(&rest function-names))
      (notinline      '(&rest function-names))
      (declaration    '(&rest names))
      (optimize       '(&any compilation-speed debug safety space speed))  
      (type           '(type-specifier &rest args))
      (ftype          '(type-specifier &rest function-names))
      (otherwise
       (flet ((typespec-p (symbol) (member :type (describe-symbol-for-emacs symbol))))
         (cond ((and (symbolp decl-identifier) (typespec-p decl-identifier))
                '(&rest vars))
               ((and (listp decl-identifier) (typespec-p (first decl-identifier)))
                '(&rest vars))
               (t :not-available)))))))

(defgeneric type-specifier-arglist (typespec-operator)
  (:documentation
   "Return the argument list of the type specifier belonging to
TYPESPEC-OPERATOR.. If the arglist cannot be determined, the keyword
:NOT-AVAILABLE is returned.

The different CUSP backends can specialize this generic function to
include implementation-dependend declaration specifiers, or to provide
additional information on the specifiers defined in ANSI Common Lisp.")
  (:method (typespec-operator)
    (declare (special *type-specifier-arglists*)) ; defined at end of file.
    (typecase typespec-operator
      (symbol (or (cdr (assoc typespec-operator *type-specifier-arglists*))
                  :not-available))
      (t :not-available))))

(definterface function-name (function)
  "Return the name of the function object FUNCTION.

The result is either a symbol, a list, or NIL if no function name is available."
  (declare (ignore function))
  nil)

(definterface macroexpand-all (form)
   "Recursively expand all macros in FORM.
Return the resulting form.")

(definterface compiler-macroexpand-1 (form &optional env)
  "Call the compiler-macro for form.
If FORM is a function call for which a compiler-macro has been
defined, invoke the expander function using *macroexpand-hook* and
return the results and T.  Otherwise, return the original form and
NIL."
  (let ((fun (and (consp form) (compiler-macro-function (car form)))))
    (if fun
	(let ((result (funcall *macroexpand-hook* fun form env)))
          (values result (not (eq result form))))
	(values form nil))))

(definterface compiler-macroexpand (form &optional env)
  "Repetitively call `compiler-macroexpand-1'."
  (labels ((frob (form expanded)
	     (multiple-value-bind (new-form newly-expanded)
		 (compiler-macroexpand-1 form env)
	       (if newly-expanded
		   (frob new-form t)
		   (values new-form expanded)))))
    (frob form env)))

(definterface format-string-expand (control-string)
  "Expand the format string CONTROL-STRING."
  (macroexpand `(formatter ,control-string)))

(definterface describe-symbol-for-emacs (symbol)
   "Return a property list describing SYMBOL.

The property list has an entry for each interesting aspect of the
symbol. The recognised keys are:

  :VARIABLE :FUNCTION :SETF :SPECIAL-OPERATOR :MACRO :COMPILER-MACRO
  :TYPE :CLASS :ALIEN-TYPE :ALIEN-STRUCT :ALIEN-UNION :ALIEN-ENUM

The value of each property is the corresponding documentation string,
or :NOT-DOCUMENTED. It is legal to include keys not listed here (but
slime-print-apropos in Emacs must know about them).

Properties should be included if and only if they are applicable to
the symbol. For example, only (and all) fbound symbols should include
the :FUNCTION property.

Example:
\(describe-symbol-for-emacs 'vector)
  => (:CLASS :NOT-DOCUMENTED
      :TYPE :NOT-DOCUMENTED
      :FUNCTION \"Constructs a simple-vector from the given objects.\")")

(definterface describe-definition (name type)
  "Describe the definition NAME of TYPE.
TYPE can be any value returned by DESCRIBE-SYMBOL-FOR-EMACS.

Return a documentation string, or NIL if none is available.")


;;;; Debugging

(definterface install-debugger-globally (function)
  "Install FUNCTION as the debugger for all threads/processes. This
usually involves setting *DEBUGGER-HOOK* and, if the implementation
permits, hooking into BREAK as well."
  (setq *debugger-hook* function))

(definterface call-with-debugging-environment (debugger-loop-fn)
   "Call DEBUGGER-LOOP-FN in a suitable debugging environment.

This function is called recursively at each debug level to invoke the
debugger loop. The purpose is to setup any necessary environment for
other debugger callbacks that will be called within the debugger loop.

For example, this is a reasonable place to compute a backtrace, switch
to safe reader/printer settings, and so on.")

(definterface call-with-debugger-hook (hook fun)
  "Call FUN and use HOOK as debugger hook. HOOK can be NIL.

HOOK should be called for both BREAK and INVOKE-DEBUGGER."
  (let ((*debugger-hook* hook))
    (funcall fun)))

(define-condition sldb-condition (condition)
  ((original-condition
    :initarg :original-condition
    :accessor original-condition))
  (:report (lambda (condition stream)
             (format stream "Condition in debugger code~@[: ~A~]" 
                     (original-condition condition))))
  (:documentation
   "Wrapper for conditions that should not be debugged.

When a condition arises from the internals of the debugger, it is not
desirable to debug it -- we'd risk entering an endless loop trying to
debug the debugger! Instead, such conditions can be reported to the
user without (re)entering the debugger by wrapping them as
`sldb-condition's."))

;;; The following functions in this section are supposed to be called
;;; within the dynamic contour of CALL-WITH-DEBUGGING-ENVIRONMENT only.

(definterface compute-backtrace (start end)
   "Returns a backtrace of the condition currently being debugged,
that is an ordered list consisting of frames. ``Ordered list''
means that an integer I can be mapped back to the i-th frame of this
backtrace.

START and END are zero-based indices constraining the number of frames
returned. Frame zero is defined as the frame which invoked the
debugger. If END is nil, return the frames from START to the end of
the stack.")

(definterface print-frame (frame stream)
  "Print frame to stream.")

(definterface frame-restartable-p (frame)
  "Is the frame FRAME restartable?.
Return T if `restart-frame' can safely be called on the frame."
  (declare (ignore frame))
  nil)

(definterface frame-source-location (frame-number)
  "Return the source location for the frame associated to FRAME-NUMBER.")

(definterface frame-catch-tags (frame-number)
  "Return a list of catch tags for being printed in a debugger stack
frame."
  (declare (ignore frame-number))
  '())

(definterface frame-locals (frame-number)
  "Return a list of ((&key NAME ID VALUE) ...) where each element of
the list represents a local variable in the stack frame associated to
FRAME-NUMBER.

NAME, a symbol; the name of the local variable.

ID, an integer; used as primary key for the local variable, unique
relatively to the frame under operation.

value, an object; the value of the local variable.")

(definterface frame-var-value (frame-number var-id)
  "Return the value of the local variable associated to VAR-ID
relatively to the frame associated to FRAME-NUMBER.")

(definterface disassemble-frame (frame-number)
  "Disassemble the code for the FRAME-NUMBER.
The output should be written to standard output.
FRAME-NUMBER is a non-negative integer.")

(definterface eval-in-frame (form frame-number)
   "Evaluate a Lisp form in the lexical context of a stack frame
in the debugger.

FRAME-NUMBER must be a positive integer with 0 indicating the
frame which invoked the debugger.

The return value is the result of evaulating FORM in the
appropriate context.")

(definterface return-from-frame (frame-number form)
  "Unwind the stack to the frame FRAME-NUMBER and return the value(s)
produced by evaluating FORM in the frame context to its caller.

Execute any clean-up code from unwind-protect forms above the frame
during unwinding.

Return a string describing the error if it's not possible to return
from the frame.")

(definterface restart-frame (frame-number)
  "Restart execution of the frame FRAME-NUMBER with the same arguments
as it was called originally.")

(definterface format-sldb-condition (condition)
  "Format a condition for display in SLDB."
  (princ-to-string condition))

(definterface condition-extras (condition)
  "Return a list of extra for the debugger.
The allowed elements are of the form:
  (:SHOW-FRAME-SOURCE frame-number)
  (:REFERENCES &rest refs)
"
  (declare (ignore condition))
  '())

(definterface activate-stepping (frame-number)
  "Prepare the frame FRAME-NUMBER for stepping.")

(definterface sldb-break-on-return (frame-number)
  "Set a breakpoint in the frame FRAME-NUMBER.")

(definterface sldb-break-at-start (symbol)
  "Set a breakpoint on the beginning of the function for SYMBOL.")
  
(definterface sldb-stepper-condition-p (condition)
  "Return true if SLDB was invoked due to a single-stepping condition,
false otherwise. "
  (declare (ignore condition))
  nil)

(definterface sldb-step-into ()
  "Step into the current single-stepper form.")

(definterface sldb-step-next ()
  "Step to the next form in the current function.")

(definterface sldb-step-out ()
  "Stop single-stepping temporarily, but resume it once the current function
returns.")


;;;; Definition finding

(defstruct (:location (:type list) :named
                      (:constructor make-location
                                    (buffer position &optional hints)))
  buffer position
  ;; Hints is a property list optionally containing:
  ;;   :snippet SOURCE-TEXT
  ;;     This is a snippet of the actual source text at the start of
  ;;     the definition, which could be used in a text search.
  hints)

(defstruct (:error (:type list) :named (:constructor)) message)
(defstruct (:file (:type list) :named (:constructor)) name)
(defstruct (:buffer (:type list) :named (:constructor)) name)
(defstruct (:position (:type list) :named (:constructor)) pos)

(definterface find-definitions (name)
   "Return a list ((DSPEC LOCATION) ...) for NAME's definitions.

NAME is a \"definition specifier\".

DSPEC is a \"definition specifier\" describing the
definition, e.g., FOO or (METHOD FOO (STRING NUMBER)) or
\(DEFVAR FOO).

LOCATION is the source location for the definition.")

(definterface find-source-location (object)
  "Returns the source location of OBJECT, or NIL.

That is the source location of the underlying datastructure of
OBJECT. E.g. on a STANDARD-OBJECT, the source location of the
respective DEFCLASS definition is returned, on a STRUCTURE-CLASS the
respective DEFSTRUCT definition, and so on."
  ;; This returns one source location and not a list of locations. It's
  ;; supposed to return the location of the DEFGENERIC definition on
  ;; #'SOME-GENERIC-FUNCTION.
  )


(definterface buffer-first-change (filename)
  "Called for effect the first time FILENAME's buffer is modified."
  (declare (ignore filename))
  nil)



;;;; XREF

(definterface who-calls (function-name)
  "Return the call sites of FUNCTION-NAME (a symbol).
The results is a list ((DSPEC LOCATION) ...)."
  (declare (ignore function-name))
  :not-implemented)

(definterface calls-who (function-name)
  "Return the call sites of FUNCTION-NAME (a symbol).
The results is a list ((DSPEC LOCATION) ...)."
  (declare (ignore function-name))
  :not-implemented)

(definterface who-references (variable-name)
  "Return the locations where VARIABLE-NAME (a symbol) is referenced.
See WHO-CALLS for a description of the return value."
  (declare (ignore variable-name))
  :not-implemented)

(definterface who-binds (variable-name)
  "Return the locations where VARIABLE-NAME (a symbol) is bound.
See WHO-CALLS for a description of the return value."
  (declare (ignore variable-name))
  :not-implemented)

(definterface who-sets (variable-name)
  "Return the locations where VARIABLE-NAME (a symbol) is set.
See WHO-CALLS for a description of the return value."
  (declare (ignore variable-name))
  :not-implemented)

(definterface who-macroexpands (macro-name)
  "Return the locations where MACRO-NAME (a symbol) is expanded.
See WHO-CALLS for a description of the return value."
  (declare (ignore macro-name))
  :not-implemented)

(definterface who-specializes (class-name)
  "Return the locations where CLASS-NAME (a symbol) is specialized.
See WHO-CALLS for a description of the return value."
  (declare (ignore class-name))
  :not-implemented)

;;; Simpler variants.

(definterface list-callers (function-name)
  "List the callers of FUNCTION-NAME.
This function is like WHO-CALLS except that it is expected to use
lower-level means. Whereas WHO-CALLS is usually implemented with
special compiler support, LIST-CALLERS is usually implemented by
groveling for constants in function objects throughout the heap.

The return value is as for WHO-CALLS.")

(definterface list-callees (function-name)
  "List the functions called by FUNCTION-NAME.
See LIST-CALLERS for a description of the return value.")


;;;; Profiling

;;; The following functions define a minimal profiling interface.

(definterface profile (fname)
  "Marks symbol FNAME for profiling.")

(definterface profiled-functions ()
  "Returns a list of profiled functions.")

(definterface unprofile (fname)
  "Marks symbol FNAME as not profiled.")

(definterface unprofile-all ()
  "Marks all currently profiled functions as not profiled."
  (dolist (f (profiled-functions))
    (unprofile f)))

(definterface profile-report ()
  "Prints profile report.")

(definterface profile-reset ()
  "Resets profile counters.")

(definterface profile-package (package callers-p methods)
  "Wrap profiling code around all functions in PACKAGE.  If a function
is already profiled, then unprofile and reprofile (useful to notice
function redefinition.)

If CALLERS-P is T names have counts of the most common calling
functions recorded.

When called with arguments :METHODS T, profile all methods of all
generic functions having names in the given package.  Generic functions
themselves, that is, their dispatch functions, are left alone.")


;;;; Inspector

(defgeneric emacs-inspect (object)
  (:documentation
   "Explain to Emacs how to inspect OBJECT.

Returns a list specifying how to render the object for inspection.

Every element of the list must be either a string, which will be
inserted into the buffer as is, or a list of the form:

 (:value object &optional format) - Render an inspectable
 object. If format is provided it must be a string and will be
 rendered in place of the value, otherwise use princ-to-string.

 (:newline) - Render a \\n

 (:action label lambda &key (refresh t)) - Render LABEL (a text
 string) which when clicked will call LAMBDA. If REFRESH is
 non-NIL the currently inspected object will be re-inspected
 after calling the lambda.
"))

(defmethod emacs-inspect ((object t))
  "Generic method for inspecting any kind of object.

Since we don't know how to deal with OBJECT we simply dump the
output of CL:DESCRIBE."
   `("Type: " (:value ,(type-of object)) (:newline)
     "Don't know how to inspect the object, dumping output of CL:DESCRIBE:"
     (:newline) (:newline)
     ,(with-output-to-string (desc) (describe object desc))))

;;; Utilities for inspector methods.
;;; 
(defun label-value-line (label value &key (newline t))
  "Create a control list which prints \"LABEL: VALUE\" in the inspector.
If NEWLINE is non-NIL a `(:newline)' is added to the result."
  (list* (princ-to-string label) ": " `(:value ,value)
         (if newline '((:newline)) nil)))

(defmacro label-value-line* (&rest label-values)
  ` (append ,@(loop for (label value) in label-values
                    collect `(label-value-line ,label ,value))))

(definterface describe-primitive-type (object)
  "Return a string describing the primitive type of object."
  (declare (ignore object))
  "N/A")


;;;; Multithreading
;;;
;;; The default implementations are sufficient for non-multiprocessing
;;; implementations.

(definterface initialize-multiprocessing (continuation)
   "Initialize multiprocessing, if necessary and then invoke CONTINUATION.

Depending on the impleimentaion, this function may never return."
   (funcall continuation))

(definterface spawn (fn &key name)
  "Create a new thread to call FN.")

(definterface thread-id (thread)
  "Return an Emacs-parsable object to identify THREAD.

Ids should be comparable with equal, i.e.:
 (equal (thread-id <t1>) (thread-id <t2>)) <==> (eq <t1> <t2>)"
  thread)

(definterface find-thread (id)
  "Return the thread for ID.
ID should be an id previously obtained with THREAD-ID.
Can return nil if the thread no longer exists."
  (declare (ignore id))
  (current-thread))

(definterface thread-name (thread)
   "Return the name of THREAD.

Thread names are be single-line strings and are meaningful to the
user. They do not have to be unique."
   (declare (ignore thread))
   "The One True Thread")

(definterface thread-status (thread)
   "Return a string describing THREAD's state."
   (declare (ignore thread))
   "")

(definterface thread-description (thread)
  "Return a string describing THREAD."
  (declare (ignore thread))
  "")

(definterface set-thread-description (thread description)
  "Set THREAD's description to DESCRIPTION."
  (declare (ignore thread description))
  "")

(definterface thread-attributes (thread)
  "Return a plist of implementation-dependent attributes for THREAD"
  (declare (ignore thread))
  '())

(definterface make-lock (&key name)
   "Make a lock for thread synchronization.
Only one thread may hold the lock (via CALL-WITH-LOCK-HELD) at a time
but that thread may hold it more than once."
   (declare (ignore name))
   :null-lock)

(definterface call-with-lock-held (lock function)
   "Call FUNCTION with LOCK held, queueing if necessary."
   (declare (ignore lock)
            (type function function))
   (funcall function))

(definterface current-thread ()
  "Return the currently executing thread."
  0)

(definterface all-threads ()
  "Return a fresh list of all threads.")

(definterface thread-alive-p (thread)
  "Test if THREAD is termintated."
  (member thread (all-threads)))

(definterface interrupt-thread (thread fn)
  "Cause THREAD to execute FN.")

(definterface kill-thread (thread)
  "Kill THREAD."
  (declare (ignore thread))
  nil)

(definterface send (thread object)
  "Send OBJECT to thread THREAD.")

(definterface receive (&optional timeout)
  "Return the next message from current thread's mailbox."
  (receive-if (constantly t) timeout))

(definterface receive-if (predicate &optional timeout)
  "Return the first message satisfiying PREDICATE.")

(definterface set-default-initial-binding (var form)
  "Initialize special variable VAR by default with FORM.

Some implementations initialize certain variables in each newly
created thread.  This function sets the form which is used to produce
the initial value."
  (set var (eval form)))

;; List of delayed interrupts.  
;; This should only have thread-local bindings, so no init form.
(defvar *pending-slime-interrupts*)

(defun check-slime-interrupts ()
  "Execute pending interrupts if any.
This should be called periodically in operations which
can take a long time to complete.
Return a boolean indicating whether any interrupts was processed."
  (when (and (boundp '*pending-slime-interrupts*)
             *pending-slime-interrupts*)
    (funcall (pop *pending-slime-interrupts*))
    t))

(defvar *interrupt-queued-handler* nil
  "Function to call on queued interrupts.
Interrupts get queued when an interrupt occurs while interrupt
handling is disabled.

Backends can use this function to abort slow operations.")

(definterface wait-for-input (streams &optional timeout)
  "Wait for input on a list of streams.  Return those that are ready.
STREAMS is a list of streams
TIMEOUT nil, t, or real number. If TIMEOUT is t, return
those streams which are ready immediately, without waiting.
If TIMEOUT is a number and no streams is ready after TIMEOUT seconds,
return nil.

Return :interrupt if an interrupt occurs while waiting."
  (assert (member timeout '(nil t)))
  (cond #+(or)
        ((null (cdr streams)) 
         (wait-for-one-stream (car streams) timeout))
        (t
         (wait-for-streams streams timeout))))

(defun wait-for-streams (streams timeout)
  (loop
   (when (check-slime-interrupts) (return :interrupt))
   (let ((ready (remove-if-not #'stream-readable-p streams)))
     (when ready (return ready)))
   (when timeout (return nil))
   (sleep 0.1)))

;; Note: Usually we can't interrupt PEEK-CHAR cleanly.
(defun wait-for-one-stream (stream timeout)
  (ecase timeout
    ((nil)
     (cond ((check-slime-interrupts) :interrupt)
           (t (peek-char nil stream nil nil) 
              (list stream))))
    ((t) 
     (let ((c (read-char-no-hang stream nil nil)))
       (cond (c 
              (unread-char c stream) 
              (list stream))
             (t '()))))))

(defun stream-readable-p (stream)
  (let ((c (read-char-no-hang stream nil :eof)))
    (cond ((not c) nil)
          ((eq c :eof) t)
          (t (unread-char c stream) t))))

(definterface toggle-trace (spec)
  "Toggle tracing of the function(s) given with SPEC.
SPEC can be:
 (setf NAME)                            ; a setf function
 (:defmethod NAME QUALIFIER... (SPECIALIZER...)) ; a specific method
 (:defgeneric NAME)                     ; a generic function with all methods
 (:call CALLER CALLEE)                  ; trace calls from CALLER to CALLEE.
 (:labels TOPLEVEL LOCAL) 
 (:flet TOPLEVEL LOCAL) ")


;;;; Weak datastructures

(definterface make-weak-key-hash-table (&rest args)
  "Like MAKE-HASH-TABLE, but weak w.r.t. the keys."
  (apply #'make-hash-table args))

(definterface make-weak-value-hash-table (&rest args)
  "Like MAKE-HASH-TABLE, but weak w.r.t. the values."
  (apply #'make-hash-table args))

(definterface hash-table-weakness (hashtable)
  "Return nil or one of :key :value :key-or-value :key-and-value"
  (declare (ignore hashtable))
  nil)


;;;; Character names

(definterface character-completion-set (prefix matchp)
  "Return a list of names of characters that match PREFIX."
  ;; Handle the standard and semi-standard characters.
  (loop for name in '("Newline" "Space" "Tab" "Page" "Rubout"
                      "Linefeed" "Return" "Backspace")
     when (funcall matchp prefix name)
     collect name))


(defparameter *type-specifier-arglists*
  '((and                . (&rest type-specifiers))
    (array              . (&optional element-type dimension-spec))
    (base-string        . (&optional size))
    (bit-vector         . (&optional size))
    (complex            . (&optional type-specifier))
    (cons               . (&optional car-typespec cdr-typespec))
    (double-float       . (&optional lower-limit upper-limit))
    (eql                . (object))
    (float              . (&optional lower-limit upper-limit))
    (function           . (&optional arg-typespec value-typespec))
    (integer            . (&optional lower-limit upper-limit))
    (long-float         . (&optional lower-limit upper-limit))
    (member             . (&rest eql-objects))
    (mod                . (n))
    (not                . (type-specifier))
    (or                 . (&rest type-specifiers))
    (rational           . (&optional lower-limit upper-limit))
    (real               . (&optional lower-limit upper-limit))
    (satisfies          . (predicate-symbol))
    (short-float        . (&optional lower-limit upper-limit))
    (signed-byte        . (&optional size))
    (simple-array       . (&optional element-type dimension-spec))
    (simple-base-string . (&optional size))
    (simple-bit-vector  . (&optional size))
    (simple-string      . (&optional size))
    (single-float       . (&optional lower-limit upper-limit))
    (simple-vector      . (&optional size))
    (string             . (&optional size))
    (unsigned-byte      . (&optional size))
    (values             . (&rest typespecs))
    (vector             . (&optional element-type size))
    ))

;;; Heap dumps

(definterface save-image (filename &optional restart-function)
  "Save a heap image to the file FILENAME.
RESTART-FUNCTION, if non-nil, should be called when the image is loaded.")


  