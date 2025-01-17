;;; -*- Mode:Common-Lisp; Package:(REGEX (COMMON-LISP)); Base:10 -*-
;;;
;;; This code was written by:
;;;
;;;    Lawrence E. Freil <lef@nscf.org>
;;;    National Science Center Foundation
;;;    Augusta, Georgia 30909
;;;
;;; If you modify this code, please comment your modifications
;;; clearly and inform the author of any improvements so they
;;; can be incorporated in future releases.
;;;
;;;  TAR:  Thomas A. Russ <tar@isi.edu>
;;;        USC Information Sciences Institute
;;;        4676 Admiralty Way
;;;        Marina del Rey, CA 90292
;;;
;;; nregex.lisp - My 4/8/92 attempt at a Lisp based regular expression
;;;               parser. 
;;;    TAR      - 11/1/96 modified to allow case insenstive alphabetic
;;;               character matching.  Controlled by value of special
;;;               variable *regex-case-sensitive-p*.
;;;    TAR     -  Fixed problem with infinite loop when leading character
;;;               is "*" or "+".  Print error message and ignore it.
;;;    TAR     -  4/1/97 changed *standard-output* to *trace-output* in 
;;;               INFO macro.  Changed *standard-output* to *error-output*
;;;               in error message formats.
;;;    TAR     -  5/30/97 fixed another place where *regex-case-sensitive-p*
;;;               needed to be referenced.
;;;    TAR     -  2/10/98 added a simplified interface for wildcard matches
;;;               that uses "*" to match any number of characters and "?" to
;;;               match any specific character.  Logically these are the
;;;               same as the regular expressions ".*" and ".", but use a
;;;               different syntax.
;;; 
;;;               This regular expression parser operates by taking a
;;;               regular expression and breaking it down into a list
;;;               consisting of lisp expressions and flags.  The list
;;;               of lisp expressions is then taken in turned into a
;;;               lambda expression that can be later applied to a
;;;               string argument for parsing.

(defpackage "REGEX" (:use "COMMON-LISP")
	    (:export "REGEX" "REGEX-COMPILE" "*REGEX-CASE-SENSITIVE-P*"
		     "WILDCARD" "WILDCARD-COMPILE"))
(in-package "REGEX")

;;;
;;; First we create a copy of macros to help debug the beast

(eval-when (load eval compile)
  (defvar *regex-debug* nil)		; Set to nil for no debugging code
 )

(defmacro info (message &rest args)
  (if *regex-debug*
      `(format *trace-output* ,message ,@args)))

;;;
;;; Declare the global variables for storing the paren index list.
;;;  These should be bound in the caller for thread-safe operation:
(defvar *regex-groups* (make-array 10))
(defvar *regex-groupings* 0)
  ;; Added:  TAR 11/1/96
(defvar *regex-case-sensitive-p* t
 "Determines whether alphabetic character tests are case sensitive or not")

;;;
;;; Declare a simple interface for testing.  You probably wouldn't want
;;; to use this interface unless you were just calling this once.
;;;
(defun regex (expression string)
  "Usage: (regex <expression> <string)
   This function will call regex-compile on the expression and then apply
   the string to the returned lambda list."
  #+:lucid (declare (optimize (speed 1) (safety 2)))  ;; Lucid compiler bug
  (let ((findit (cond ((stringp expression)
		       (regex-compile expression))
		      ((listp expression)
		       expression)))
	(result nil)
	(*regex-groups* (make-array 10))
	(*regex-groupings* 0))
    (if (not (funcall (if (functionp findit)
			  findit
			(eval `(function ,findit))) string))
	(return-from regex nil))
    (if (= *regex-groupings* 0)
	(return-from regex t))
    (dotimes (i *regex-groupings*)
      (push (funcall 'subseq 
		     string 
		     (car (aref *regex-groups* i))
		     (cadr (aref *regex-groups* i)))
	    result))
    (reverse result)))

(defun wildcard (expression string)
  "Usage: (wildcard <expression> <string)
   This function will call wildcard-compile on the expression and then apply
   the string to the returned lambda list."
  #+:lucid (declare (optimize (speed 1) (safety 2)))  ;; Lucid compiler bug
  (let ((findit (cond ((stringp expression)
		       (wildcard-compile expression))
		      ((listp expression)
		       expression)))
	(result nil)
	(*regex-groups* (make-array 10))
	(*regex-groupings* 0))
    (if (not (funcall (if (functionp findit)
			  findit
			(eval `(function ,findit))) string))
	(return-from wildcard nil))
    (if (= *regex-groupings* 0)
	(return-from wildcard t))
    (dotimes (i *regex-groupings*)
      (push (funcall 'subseq 
		     string 
		     (car (aref *regex-groups* i))
		     (cadr (aref *regex-groups* i)))
	    result))
    (reverse result)))

;;;
;;; Declare some simple macros to make the code more readable.
;;;
(defvar *regex-special-chars* "?*+.()[]\\${}")
(defvar *wildcard-special-chars* "?*\\")

(defmacro add-exp (list)
  "Add an item to the end of expression"
  `(setf expression (append expression ,list)))

;;;
;;; Now for the main regex compiler routine.
;;;
(defun regex-compile (source &key (anchored nil))
  "Usage: (regex-compile <expression> [ :anchored (t/nil) ])
       This function take a regular expression (supplied as source) and
       compiles this into a lambda list that a string argument can then
       be applied to.  It is also possible to compile this lambda list
       for better performance or to save it as a named function for later
       use"
  #+:lucid (declare (optimize (speed 0) (safety 2) (compilation-speed 0)))  ;; Lucid compiler bug
  (info "Now entering regex-compile with \"~A\"~%" source)
  ;;
  ;; This routine works in two parts.
  ;; The first pass take the regular expression and produces a list of 
  ;; operators and lisp expressions for the entire regular expression.  
  ;; The second pass takes this list and produces the lambda expression.
  (let ((expression '())		; holder for expressions
	(group 1)			; Current group index
	(group-stack nil)		; Stack of current group endings
	(result nil)			; holder for built expression.
	(fast-first nil)		; holder for quick unanchored scan
	(source-length (length source))); input length
    ;;
    ;; If the expression was an empty string then it always
    ;; matches (so lets leave early)
    ;;
    (if (= source-length 0)
	(return-from regex-compile
		     '(lambda (&rest args)
			(declare (ignore args))
			t)))
    ;;
    ;; If the first character is a caret then set the anchored
    ;; flags and remove them from the expression string.
    ;;
    (cond ((eql (char source 0) #\^)
	   (setf source (subseq source 1))
	   (setf anchored t)
	   (decf source-length)))
    ;;
    ;; If the leading character(s) are pluses or asterisks, then
    ;; complain and remove them from the expression string.
    ;;

    (do ((i 0 (1+ i)))			; TAR 4/1/97
	((or (= i source-length)
	     (not (member (char source i) '(#\+ #\* #\?))))
	 (if (/= i 0)
	     (progn 
	       (setq source (subseq source i))
	       (decf source-length i)
	       (warn "Leading `*', `+' or `?' regular expression characters don't make sense!~%They have been discarded.")))
	   ))

    ;; If the expression is now an empty string then it always
    ;; matches (so lets leave early)

    (if (= source-length 0)
	(return-from regex-compile
		     '(lambda (&rest args)
			(declare (ignore args))
		       t)))    

    ;;
    ;; If the first sequence is .* then also set the anchored flags.
    ;; (This is purely for optimization, it will work without this).
    ;;
    (if (>= source-length 2)
	(if (string= source ".*" :start1 0 :end1 2)
	    (setf anchored t)))
    ;;
    ;; Also, If this is not an anchored search and the first character is
    ;; a literal, then do a quick scan to see if it is even in the string.
    ;; If not then we can issue a quick nil, 
    ;; otherwise we can start the search at the matching character to skip
    ;; the checks of the non-matching characters anyway.
    ;;
    ;; If I really wanted to speed up this section of code it would be 
    ;; easy to recognize the case of a fairly long multi-character literal
    ;; and generate a Boyer-Moore search for the entire literal. 
    ;;
    ;; I generate the code to do a loop because on CMU Lisp this is about
    ;; twice as fast a calling position.
    ;;
    (if (and (not anchored)
	     (not (position (char source 0) *regex-special-chars*))
	     (not (and (> source-length 1)
		       (position (char source 1) *regex-special-chars*))))
	(setf fast-first `((if (not (dotimes (i length nil)
				       ;; TAR:  ",(if ...)" was "eql"  5/30/97
				     (if (,(if *regex-case-sensitive-p*
						'char=
					        'char-equal)
					      (char string i)
					      ,(char source 0))
					 (return (setf start i)))))
			      (return-from final-return nil)))))
    ;;
    ;; Generate the very first expression to save the starting index
    ;; so that group 0 will be the entire string matched always
    ;;
    (add-exp '((setf (aref *regex-groups* 0)
		     (list index nil))))
    ;;
    ;; Loop over each character in the regular expression building the
    ;; expression list as we go.
    ;;
    (do ((eindex 0 (1+ eindex)))
	((= eindex source-length))
      (let ((current (char source eindex)))
	(info "Now processing character ~A index = ~A~%" current eindex)
	(case current
	  ((#\.)
	   ;;
	   ;; Generate code for a single wild character
	   ;;
	   (add-exp '((if (>= index length)
			  (return-from compare nil)
			(incf index)))))
	  ((#\$)
	   ;;
	   ;; If this is the last character of the expression then
	   ;; anchor the end of the expression, otherwise let it slide
	   ;; as a standard character (even though it should be quoted).
	   ;;
	   (if (= eindex (1- source-length))
	       (add-exp '((if (not (= index length))
			      (return-from compare nil))))
	     (add-exp '((if (not (and (< index length)
				      (eql (char string index) #\$)))
			    (return-from compare nil)
			  (incf index))))))
	  ((#\*)
	   (add-exp '(ASTRISK)))

	  ((#\+)
	   (add-exp '(PLUS)))

	  ((#\?)
	   (add-exp '(QUESTION)))

	  ((#\()
	   ;;
	   ;; Start a grouping.
	   ;;
	   (incf group)
	   (push group group-stack)
	   (add-exp `((setf (aref *regex-groups* ,(1- group)) 
			    (list index nil))))
	   (add-exp `(,group)))
	  ((#\))
	   ;;
	   ;; End a grouping
	   ;;
	   (let ((group (pop group-stack)))
	     (add-exp `((setf (cadr (aref *regex-groups* ,(1- group)))
			      index)))
	     (add-exp `(,(- group)))))
	  ((#\[)
	   ;;
	   ;; Start of a range operation.
	   ;; Generate a bit-vector that has one bit per possible character
	   ;; and then on each character or range, set the possible bits.
	   ;;
	   ;; If the first character is carat then invert the set.
	   (let* ((invert (eql (char source (1+ eindex)) #\^))
		  (bitstring (make-array 256 :element-type 'bit
					     :initial-element
					        (if invert 1 0)))
		  (set-char (if invert 0 1)))
	     (if invert (incf eindex))
	     (do ((x (1+ eindex) (1+ x)))
		 ((eql (char source x) #\]) (setf eindex x))
	       (info "Building range with character ~A~%" (char source x))
	       (cond ((and (eql (char source (1+ x)) #\-)
			   (not (eql (char source (+ x 2)) #\])))
		      (if (>= (char-code (char source x))
			      (char-code (char source (+ 2 x))))
			  (error "Invalid range \"~A-~A\".  Ranges must be in acending order"
				 (char source x) (char source (+ 2 x))))
		      (do ((j (char-code (char source x)) (1+ j)))
		       ((> j (char-code (char source (+ 2 x))))
			(incf x 2))
			(info "Setting bit for char ~A code ~A~%" (code-char j) j)
			;; TAR:  ",(if ...)" was first case only  2/23/98
			(if *regex-case-sensitive-p*
			    (setf (sbit bitstring j) set-char)
			  (setf (sbit bitstring 
				      (char-code
				       (char-upcase (code-char j))))
			        set-char
				(sbit bitstring 
				      (char-code
				       (char-downcase (code-char j))))
				set-char))
			))
		     (t
		      (cond ((not (eql (char source x) #\]))
			     (let ((char (char source x)))
			       ;;
			       ;; If the character is quoted then find out what
			       ;; it should have been
			       ;;
			       (if (eql (char source x) #\\ )
				   (let ((length))
				     (multiple-value-setq (char length)
					 (regex-quoted (subseq source x) invert))
				     (incf x length)))
			       (info "Setting bit for char ~A code ~A~%" char (char-code char))
			       (cond ((null char) nil) ;; Missing character after \
				     ((vectorp char) (bit-ior bitstring char t))
				     (t (setf (sbit bitstring (char-code (char source x)))
					  set-char)))))))))
	     (add-exp `((let ((range ,bitstring))
			  (if (>= index length)
			      (return-from compare nil))
			  (if (= 1 (sbit range (char-code (char string index))))
			      (incf index)
			    (return-from compare nil)))))))
	  ((#\\ )
	   ;;
	   ;; Intreprete the next character as a special, range, octal, group or 
           ;; just the character itself.
	   ;;
	   (let ((length)
		 (value))
	     (multiple-value-setq (value length)
		 (regex-quoted (subseq source (1+ eindex)) nil))
	     (cond ((null value) nil)	;; Missing character after \
		   ((listp value)
		    (add-exp value))
		   ((characterp value)
		    (add-exp `((if (not (and (< index length)
					     (eql (char string index) 
						  ,value)))
				   (return-from compare nil)
				 (incf index)))))
		   ((vectorp value)
		    (add-exp `((let ((range ,value))
				 (if (>= index length)
				     (return-from compare nil))
				 (if (= 1 (sbit range (char-code (char string index))))
				     (incf index)
				   (return-from compare nil)))))))
	     (incf eindex length)))
	  (t
	   ;;
	   ;; We have a literal character.  
	   ;; Scan to see how many we have and if it is more than one
	   ;; generate a string= verses as single eql.
	   ;;
	   (let* ((lit "")
		  (term (dotimes (litindex (- source-length eindex) nil)
			  (let ((litchar (char source (+ eindex litindex))))
			    (if (position litchar *regex-special-chars*)
				(return litchar)
			      (progn
				(info "Now adding ~A index ~A to lit~%" litchar 
				      litindex)
				(setf lit (concatenate 'string lit 
						       (string litchar)))))))))
	     (if (= (length lit) 1)
		 (add-exp `((if (not (and (< index length)
					  ;; TAR:  ",(if ...)" was "eql"  11/1/96
					  (,(if *regex-case-sensitive-p*
						'char=
					        'char-equal)
					   (char string index) ,current)))
				(return-from compare nil)
			      (incf index))))
	       ;;
	       ;; If we have a multi-character literal then we must
	       ;; check to see if the next character (if there is one)
	       ;; is an astrisk or a plus.  If so then we must not use this
	       ;; character in the big literal.
	       (progn 
		 (if (or (eql term #\*) (eql term #\+))
		     (setf lit (subseq lit 0 (1- (length lit)))))
		 (add-exp `((if (< length (+ index ,(length lit)))
				(return-from compare nil))
			    ;; TAR:  ",(if ...)" was "string="   11/1/96
			    (if (not (,(if *regex-case-sensitive-p*
					   'string= 
					   'string-equal)
				      string ,lit :start1 index
					      :end1 (+ index ,(length lit))))
				(return-from compare nil)
			      (incf index ,(length lit)))))))
	     (incf eindex (1- (length lit))))))))
    ;;
    ;; Plug end of list to return t.  If we made it this far then
    ;; We have matched!
    (add-exp '((setf (cadr (aref *regex-groups* 0))
		     index)))
    (add-exp '((return-from final-return t)))
    ;;
;;;    (print expression)
    ;;
    ;; Now take the expression list and turn it into a lambda expression
    ;; replacing the special flags with lisp code.
    ;; For example:  A BEGIN needs to be replace by an expression that
    ;; saves the current index, then evaluates everything till it gets to
    ;; the END then save the new index if it didn't fail.
    ;; On an ASTRISK I need to take the previous expression and wrap
    ;; it in a do that will evaluate the expression till an error
    ;; occurs and then another do that encompases the remainder of the
    ;; regular expression and iterates decrementing the index by one
    ;; of the matched expression sizes and then returns nil.  After
    ;; the last expression insert a form that does a return t so that
    ;; if the entire nested sub-expression succeeds then the loop
    ;; is broken manually.
    ;; 
    (setf result (copy-tree nil))
    ;;
    ;; Reversing the current expression makes building up the 
    ;; lambda list easier due to the nexting of expressions when 
    ;; and astrisk has been encountered.
    (setf expression (reverse expression))
    (do ((elt 0 (1+ elt)))
	((>= elt (length expression)))
      (let ((piece (nth elt expression)))
	;;
	;; Now check for PLUS, if so then ditto the expression and then let the
	;; ASTRISK below handle the rest.
	;;
	(cond ((eql piece 'PLUS)
	       (cond ((listp (nth (1+ elt) expression))
		      (setf result (append (list (nth (1+ elt) expression))
					   result)))
		     ;;
		     ;; duplicate the entire group
		     ;; NOTE: This hasn't been implemented yet!!
		     (t
		      (format *error-output* "GROUP repeat hasn't been implemented yet~%")))))
	(cond ((listp piece)		;Just append the list
	       (setf result (append (list piece) result)))
	      ((eql piece 'QUESTION)	; Wrap it in a block that won't fail
	       (cond ((listp (nth (1+ elt) expression))
		      (setf result 
			    (append `((progn (block compare
						    ,(nth (1+ elt) 
							  expression))
					     t))
				    result))
		      (incf elt))
		     ;;
		     ;; This is a QUESTION on an entire group which
		     ;; hasn't been implemented yet!!!
		     ;;
		     (t
		      (format *error-output* "Optional groups not implemented yet~%"))))
	      ((or (eql piece 'ASTRISK) ; Do the wild thing!
		   (eql piece 'PLUS))
	       (cond ((listp (nth (1+ elt) expression))
		      ;;
		      ;; This is a single character wild card so
		      ;; do the simple form.
		      ;;
		      (setf result 
			    `((let ((oindex index))
				(block compare
				       (do ()
					   (nil)
					 ,(nth (1+ elt) expression)))
				(do ((start index (1- start)))
				    ((< start oindex) nil)
				  (let ((index start))
				    (block compare
					   ,@result))))))
		      (incf elt))
		     (t
		      ;;
		      ;; This is a subgroup repeated so I must build
		      ;; the loop using several values.
		      ;;
		      ))
	       )
	      (t t))))			; Just ignore everything else.
    ;;
    ;; Now wrap the result in a lambda list that can then be 
    ;; invoked or compiled, however the user wishes.
    ;;
    (if anchored
	(setf result
	      `(lambda (string &key (start 0) (end (length string)))
		 (setf *regex-groupings* ,group)
		 (block final-return
			(block compare
			       (let ((index start)
				     (length end))
				 ,@result)))))
      (setf result
	    `(lambda (string &key (start 0) (end (length string)))
	       (setf *regex-groupings* ,group)
	       (block final-return
		      (let ((length end))
			,@fast-first
			(do ((marker start (1+ marker)))
			    ((> marker end) nil)
			  (let ((index marker))
			    (if (block compare
				       ,@result)
				(return t)))))))))))


;;;
;;; Define a function that will take a quoted character and return
;;; what the real character should be plus how much of the source
;;; string was used.  If the result is a set of characters, return an
;;; array of bits indicating which characters should be set.  If the
;;; expression is one of the sub-group matches return a
;;; list-expression that will provide the match.  
;;;
(defun regex-quoted (char-string &optional (invert nil))
  "Usage: (regex-quoted <char-string> &optional invert)
       Returns either the quoted character or a simple bit vector of bits set for
       the matching values and the used length of <char-string>"
  (when (string= "" char-string)
    (warn "Quote Character `\\' is not followed by another character.  Disregarding.")
    (return-from regex-quoted (values nil 0)))
  (let ((first (char char-string 0))
	(result (char char-string 0))
	(used-length 1))
    (cond ((eql first #\n)
	   (setf result #\NewLine))
	  ((or (eql first #\c)
	       (eql first #\r))
	   (setf result #\Return))
	  ((eql first #\t)
	   (setf result #\Tab))
	  ((eql first #\d)
	   ;; Digits:  0-9
	   (setf result #*0000000000000000000000000000000000000000000000001111111111000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000))
	  ((eql first #\D)
	   (setf result #*1111111111111111111111111111111111111111111111110000000000111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111))
	  ((eql first #\w)
	   ;; Word Constituents:  digits, letters, underscore    NOT HYPHEN!
	   (setf result #*0000000000000000000000000000000000000000000000001111111111000000011111111111111111111111111000010111111111111111111111111110000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000))
	  ((eql first #\W)
	   (setf result #*1111111111111111111111111111111111111111111111110000000000111111100000000000000000000000000111101000000000000000000000000001111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111))
	  ((eql first #\b)
	   ;; Word boundaries:  Tab Space . , ! :
	   (setf result #*0000000001000000000000000000000011000000000010100000000000100000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000))
	  ((eql first #\B)
	   (setf result #*1111111110111111111111111111111100111111111101011111111111011111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111))
	  ((eql first #\s)
	   ;; Space characters:  Tab Newline Space Return
	   (setf result #*0000000001100100000000000000000010000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000))
	  ((eql first #\S)
	   (setf result #*1111111110011011111111111111111101111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111))
	  ((and (>= (char-code first) (char-code #\0))
		(<= (char-code first) (char-code #\9)))
	   (if (and (> (length char-string) 2)
		    (and (>= (char-code (char char-string 1)) (char-code #\0))
			 (<= (char-code (char char-string 1)) (char-code #\9))
			 (>= (char-code (char char-string 2)) (char-code #\0))
			 (<= (char-code (char char-string 2)) (char-code #\9))))
	       ;;
	       ;; It is a single character specified in octal
	       ;;
	       (progn 
		 (setf result (do ((x 0 (1+ x))
				   (return 0))
				  ((= x 2) return)
				(setf return (+ (* return 8)
						(- (char-code (char char-string x))
						   (char-code #\0))))))
		 (setf used-length 3))
	     ;;
	     ;; We have a group number replacement.
	     ;;
	     (let ((group (- (char-code first) (char-code #\0))))
	       (setf result `((let ((nstring (subseq string (car (aref *regex-groups* ,group))
						     (cadr (aref *regex-groups* ,group)))))
				(if (< length (+ index (length nstring)))
				    (return-from compare nil))
				(if (not (string= string nstring
						  :start1 index
						  :end1 (+ index (length nstring))))
				    (return-from compare nil)
				  (incf index (length nstring)))))))))
	  (t 
	   (setf result first)))
    (if (and (vectorp result) invert)
	(bit-xor result #*1111111110011111111111111111111101111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111 t))
    (values result used-length)))


;;;
;;; Now for the main wildcard compiler routine.
;;;
(defun wildcard-compile (source &key (anchored nil))
  "Usage: (wildcard-compile <expression> [ :anchored (t/nil) ])
       This function take a regular expression (supplied as source) and
       compiles this into a lambda list that a string argument can then
       be applied to.  It is also possible to compile this lambda list
       for better performance or to save it as a named function for later
       use"
  #+:lucid (declare (optimize (speed 0) (safety 2) (compilation-speed 0)))  ;; Lucid compiler bug
  (info "Now entering wildcard-compile with \"~A\"~%" source)
  ;;
  ;; This routine works in two parts.
  ;; The first pass take the regular expression and produces a list of 
  ;; operators and lisp expressions for the entire regular expression.  
  ;; The second pass takes this list and produces the lambda expression.
  (let ((expression '())		; holder for expressions
	(group 1)			; Current group index
	(result nil)			; holder for built expression.
	(fast-first nil)		; holder for quick unanchored scan
	(source-length (length source))); input length
    ;;
    ;; If the expression was an empty string then it alway
    ;; matches (so lets leave early)
    ;;
    (if (= source-length 0)
	(return-from wildcard-compile
		     '(lambda (&rest args)
			(declare (ignore args))
			t)))
    ;;
    ;; If the first sequence is * then also set the anchored flags.
    ;; (This is purely for optimization, it will work without this).
    ;;
    (if (char= (char source 0) #\*)
	(setf anchored t))
    ;;
    ;; Also, If this is not an anchored search and the first character is
    ;; a literal, then do a quick scan to see if it is even in the string.
    ;; If not then we can issue a quick nil, 
    ;; otherwise we can start the search at the matching character to skip
    ;; the checks of the non-matching characters anyway.
    ;;
    ;; If I really wanted to speed up this section of code it would be 
    ;; easy to recognize the case of a fairly long multi-character literal
    ;; and generate a Boyer-Moore search for the entire literal. 
    ;;
    ;; I generate the code to do a loop because on CMU Lisp this is about
    ;; twice as fast a calling position.
    ;;
    (if (and (not anchored)
	     (not (position (char source 0) *wildcard-special-chars*))
	     (not (and (> source-length 1)
		       (position (char source 1) *wildcard-special-chars*))))
	(setf fast-first `((if (not (dotimes (i length nil)
				       ;; TAR:  ",(if ...)" was "eql"  5/30/97
				     (if (,(if *regex-case-sensitive-p*
						'char=
					        'char-equal)
					      (char string i)
					      ,(char source 0))
					 (return (setf start i)))))
			      (return-from final-return nil)))))
    ;;
    ;; Generate the very first expression to save the starting index
    ;; so that group 0 will be the entire string matched always
    ;;
    (add-exp '((setf (aref *regex-groups* 0)
		     (list index nil))))
    ;;
    ;; Loop over each character in the regular expression building the
    ;; expression list as we go.
    ;;
    (do ((eindex 0 (1+ eindex)))
	((= eindex source-length))
      (let ((current (char source eindex)))
	(info "Now processing character ~A index = ~A~%" current eindex)
	(case current
	  ((#\?)
	   ;;
	   ;; Generate code for a single wild character
	   ;;
	   (add-exp '((if (>= index length)
			  (return-from compare nil)
			(incf index)))))

	  ((#\*)
	   (add-exp '((if (>= index length)
			  (return-from compare nil)
			(incf index))))
	   (add-exp '(ASTRISK)))
	  ((#\\ )
	   ;;
	   ;; Intreprete the next character as just the character itself.
	   ;;
	   (if (= eindex (- source-length 1))
	       (format *error-output* "Quote character `\\' at the end of the string isn't followed by any~%  other character!  Ignoring it.")
	     (progn 
	       (add-exp `((if (not (and (< index length)
					(eql (char string index) 
					     ,(char source (+ eindex 1)))))
			      (return-from compare nil)
			    (incf index))))
	       (incf eindex))))
	  (t
	   ;;
	   ;; We have a literal character.  
	   ;; Scan to see how many we have and if it is more than one
	   ;; generate a string= verses as single eql.
	   ;;
	   (let* ((lit "")
		  (term (dotimes (litindex (- source-length eindex) nil)
			  (let ((litchar (char source (+ eindex litindex))))
			    (if (position litchar *wildcard-special-chars*)
				(return litchar)
			      (progn
				(info "Now adding ~A index ~A to lit~%" litchar 
				      litindex)
				(setf lit (concatenate 'string lit 
						       (string litchar)))))))))
	     (if (= (length lit) 1)
		 (add-exp `((if (not (and (< index length)
					  ;; TAR:  ",(if ...)" was "eql"  11/1/96
					  (,(if *regex-case-sensitive-p*
						'char=
					        'char-equal)
					   (char string index) ,current)))
				(return-from compare nil)
			      (incf index))))
	       ;;
	       ;; If we have a multi-character literal then we must
	       ;; check to see if the next character (if there is one)
	       ;; is an astrisk or a plus.  If so then we must not use this
	       ;; character in the big literal.
	       (progn 
		 (if (or (eql term #\*) (eql term #\+))
		     (setf lit (subseq lit 0 (1- (length lit)))))
		 (add-exp `((if (< length (+ index ,(length lit)))
				(return-from compare nil))
			    ;; TAR:  ",(if ...)" was "string="   11/1/96
			    (if (not (,(if *regex-case-sensitive-p*
					   'string= 
					   'string-equal)
				      string ,lit :start1 index
					      :end1 (+ index ,(length lit))))
				(return-from compare nil)
			      (incf index ,(length lit)))))))
	     (incf eindex (1- (length lit))))))))
    ;;
    ;; Plug end of list to return t.  If we made it this far then
    ;; We have matched!
    (add-exp '((setf (cadr (aref *regex-groups* 0))
		     index)))
    (add-exp '((return-from final-return t)))
    ;;
;;;    (print expression)
    ;;
    ;; Now take the expression list and turn it into a lambda expression
    ;; replacing the special flags with lisp code.
    ;; For example:  A BEGIN needs to be replace by an expression that
    ;; saves the current index, then evaluates everything till it gets to
    ;; the END then save the new index if it didn't fail.
    ;; On an ASTRISK I need to take the previous expression and wrap
    ;; it in a do that will evaluate the expression till an error
    ;; occurs and then another do that encompases the remainder of the
    ;; regular expression and iterates decrementing the index by one
    ;; of the matched expression sizes and then returns nil.  After
    ;; the last expression insert a form that does a return t so that
    ;; if the entire nested sub-expression succeeds then the loop
    ;; is broken manually.
    ;; 
    (setf result (copy-tree nil))
    ;;
    ;; Reversing the current expression makes building up the 
    ;; lambda list easier due to the nexting of expressions when 
    ;; and astrisk has been encountered.
    (setf expression (reverse expression))
    (do ((elt 0 (1+ elt)))
	((>= elt (length expression)))
      (let ((piece (nth elt expression)))
	(cond ((listp piece)		;Just append the list
	       (setf result (append (list piece) result)))
	      ((eql piece 'ASTRISK) ; Do the wild thing!
	       (cond ((listp (nth (1+ elt) expression))
		      ;;
		      ;; This is a single character wild card so
		      ;; do the simple form.
		      ;;
		      (setf result 
			    `((let ((oindex index))
				(block compare
				       (do ()
					   (nil)
					 ,(nth (1+ elt) expression)))
				(do ((start index (1- start)))
				    ((< start oindex) nil)
				  (let ((index start))
				    (block compare
					   ,@result))))))
		      (incf elt))
		     (t
		      ;;
		      ;; This is a subgroup repeated so I must build
		      ;; the loop using several values.
		      ;;
		      ))
	       )
	      (t t))))			; Just ignore everything else.
    ;;
    ;; Now wrap the result in a lambda list that can then be 
    ;; invoked or compiled, however the user wishes.
    ;;
    (if anchored
	(setf result
	      `(lambda (string &key (start 0) (end (length string)))
		 (setf *regex-groupings* ,group)
		 (block final-return
			(block compare
			       (let ((index start)
				     (length end))
				 ,@result)))))
      (setf result
	    `(lambda (string &key (start 0) (end (length string)))
	       (setf *regex-groupings* ,group)
	       (block final-return
		      (let ((length end))
			,@fast-first
			(do ((marker start (1+ marker)))
			    ((> marker end) nil)
			  (let ((index marker))
			    (if (block compare
				       ,@result)
				(return t))))))))) ))
