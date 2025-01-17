;;; -*- Mode: LISP; Package: CYC; Syntax: ANSI-Common-Lisp -*-

(in-package "CYC")

(cvs-id "$Id: jrtl-release-init.lisp 129137 2009-11-05 03:40:25Z rck $")

;;; change the values out for a valid license (the key here is expired)
(csetq *master-license-key* "d928-2826-1787-5fe9-6d31")
(pwhen-feature :Cyc-ResearchCyc
  (pwhen-feature :SL2Java
    (csetq *master-license-key* "d928-2826-1787-5fe9-6d31")))

#-Ignore
(progn
(csetq *stanford-ner-host* "localhost")
(csetq *stanford-ner-port* 6666)

(pif
  (fboundp 'start-ner-server)

  (start-ner-server *stanford-ner-port*)

  (cunwind-protect
      (format t "Starting Named Entity Recognizer.~%")
      (run-external-process
       "java"
       `("-server" "-Xmx1024m"
         "-XX:MaxPermSize=512m"
         "-cp" "data/parsers/stanford-ner-cyc-2006-09-18/stanford-ner.jar"
         "edu.stanford.nlp.ie.NERServer"
         "-loadClassifier" "data/parsers/stanford-ner-cyc-2006-09-18/classifiers/ner-eng-ie.crf-7-muc-distsim.ser.gz"
         ,(to-string *stanford-ner-port*)) *NULL-INPUT* *NULL-OUTPUT* *ERROR-OUTPUT*)
      (sleep 20)
      (progn))))


(load "init/jrtl-init.lisp")

(load "init/release-specific-init.lisp")



