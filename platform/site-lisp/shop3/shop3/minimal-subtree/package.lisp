(in-package :common-lisp-user)

(defpackage shop3-minimal-subtree
  (:nicknames #:shop-minimal-subtree #:subtree #:shop2-minimal-subtree)
  (:shadowing-import-from #:plan-tree #:tree-node-task #:tree-node)
  (:export #:find-failed-task)
  (:use common-lisp iterate shop3 plan-tree))
