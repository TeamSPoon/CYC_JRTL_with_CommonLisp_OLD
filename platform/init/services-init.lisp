;;; -*- Mode: LISP; Package: CYC; Syntax: ANSI-Common-Lisp -*-

(in-package "CYC")

;;; LarKC
(cvs-id "$Id: services-init.lisp 146227 2013-06-26 21:56:23Z tbrussea $")
;;; OpenCYC
;;; (cvs-id "$Id: services-init.lisp 126640 2008-12-04 13:39:36Z builder $")

(csetq *gc-reports* nil)

;;; LarKC

#|

(load-from-cyc-home "init/cyc-init.lisp")

(load-from-cyc-home "init/port-init.lisp")

|#

;;; OpenCYC

(load "init/cyc-init.lisp")

(load "init/port-init.lisp")


(boolean (princ ";;  At this point the cyc http server is running and you can access
;;  Cyc directly via the local web browser.
;;  http://localhost:3602/cgi-bin/cyccgi/cg?cb-start
;;  You can browse cyc via the Guest account or perform updates by
;;  logging on as CycAdminstrator.
"))

