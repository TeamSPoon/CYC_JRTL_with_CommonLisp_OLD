
;;;********************************************************************************
;;;
;;;               MORPHO  - code for morphological analysis
;;;
;;;           includes ETAOIN, the input handler for the system
;;;
;;;********************************************************************************

;; my experimental version...
(defun etao_UNUSED  nil
      (prog (WORD NEWWORD CHAR ALTN ALREADY-BLGING-NEWWRD WRD LAST NEXT Y WORD1 X RD POSS)
	    THRU
	    (SETQ SENT (SETQ WORD (SETQ PUNCT (SETQ POSS NIL))))
	    (PRINT 'READY)
	    (TERPRI)
	  CHAR
	    (COND ((EQUAL (PEEK-CHAR) #\U007E)  ; TILDE
		   (READ-CHAR)
		   (ERT)
		   (GO THRU))) ; BREAK
	    (SETQ CHAR (ASCII (CHAR-UPCASE (READ-CHAR))))
	    (COND ((EQ CHAR '| |) (setq WORD (cons WORD CHAR))) ;DELIMITER
		  ((EQ CHAR RUBOUT)
		   (COND (WORD
			  (PRINC (CAR WORD))
			  (SETQ WORD (CDR WORD)))
			 (SENT
			  (PRINT (CAR SENT))
			  (SETQ SENT (CDR SENT))))
		   (GO CHAR))
		  ((EQ CHAR CARRET) (setq WORD (cons WORD CHAR)))
		  ((MEMQ CHAR PUNCL)
		   (SETQ PUNCT CHAR) ;DELIMITER
		   (AND WORD (setq WORD (cons WORD CHAR))))
		  (t
		   (setq WORD (cons WORD CHAR))
		   (print WORD)
		   (go CHAR)))

	    (print WORD)
	    (AND WORD (go THRU))))

 ;	 (print (format nil ">>>~s>> " CHAR))
 ;	 (go THRU)))


(DEFUN ETAOIN  NIL
      (PROG (WORD NEWWORD CHAR ALTN ALREADY-BLGING-NEWWRD WRD LAST NEXT Y WORD1 X RD POSS)
	    ;; WORD is accumulating letters in a word, and SENT accumulates
	    ;; words in a sentence.  Both have to be reversed to make sense.
	    THRU
	    (SETQ SENT (SETQ WORD (SETQ PUNCT (SETQ POSS NIL))))
	    (show-response)
	    (PRINTC "Human:")
	    (NOP (TERPRI))
	    (FORCE-OUTPUT)
	    CHAR
	    (COND ((EQUAL (PEEK-CHAR-REMOTE) #\U007E) ; TILDE
		   (READ-CHAR-REMOTE)
		   (ERT)
		   (GO THRU))) ; BREAK
	    (COND ((EQUAL (PEEK-CHAR-REMOTE) #\U0040) (read-char-remote) (go OUT))) ; COMMERCIAL_AT
	    (SETQ CHAR (ASCII (CHAR-UPCASE (READ-CHAR-REMOTE))))
	    (COND ((EQ CHAR '| |) (GO WORD)) ;DELIMITER
		  ((EQ CHAR RUBOUT)
		   (COND (WORD
			  (PRINC (CAR WORD))
			  (SETQ WORD (CDR WORD)))
			 (SENT
			  (PRINT (CAR SENT))
			  (SETQ SENT (CDR SENT))))
		   (GO CHAR))
		  ((EQ CHAR CARRET) (GO WORD))
		  ((MEMQ CHAR PUNCL)
		   (SETQ PUNCT CHAR)  ;DELIMITER
		   (AND WORD (GO WORD))
		   (GO PUNC)))
	    (AND
	      (OR (AND (EQ CHAR '|"|)  ;; "
			       (NOT ALREADY-BLGING-NEWWRD)
			       (SETQ NEWWORD (SETQ ALREADY-BLGING-NEWWRD T))
			       (GO CHAR))
		  (AND (EQ CHAR '|"|)   ;; "
				    ALREADY-BLGING-NEWWRD
				    (NOT (SETQ ALREADY-BLGING-NEWWRD NIL))
				    (GO WORD))
 ;WITHIN THIS "AND" ARE ALL THE CHARACTERS THAT
				(NUMBERP CHAR)
 ;ARE UNDERSTOOD BY THE SYSTEM
				(AND (EQ CHAR '|=|) (NULL WORD))
				(MEMQ CHAR VOWEL)
				(MEMQ CHAR CONSO))
			   (SETQ WORD (CONS CHAR WORD)))
		      (GO CHAR)
	DO   (show-response)
		      (PRINT 'READY2)
		      (TERPRI)
		      (MAPC #'(LAMBDA (X) (PRINT2 X)) (REVERSE SENT))
	     (PRINT2 " ") ;; was princ
	     (MAPC #'PRINT2 (REVERSE WORD)) ;; was princ
		      (GO CHAR)
	WORD (COND ((NULL WORD) (GO CHAR))
			    ((EQUAL WORD '(P L E H)) (HELP) (GO THRU))
			    ((AND (SETQ WRD (LIST (READLIST (REVERSE WORD))))
				  (NUMBERP (SETQ WRD (CAR WRD))))
			     (SETQ SENT (CONS WRD SENT))
			     (BUILDWORD	WRD
					(OR (AND (ZEROP (SUB1 WRD))
						 '(NUM NS))
					    '(NUM))
					(LIST 'NUM WRD)
					NIL))
 ;NO ROOT FOR NUMBERS
			    ((NULL WRD) (SETQ WRD (REVERSE WORD)) (GO NO))
			    ((G3T WRD 'FEATURES))
 ;IF A WORD HAS FEATURES, IT'S PROPERTIES
			    ((SETQ X (G3T WRD 'IRREGULAR))
 ;ARE ALL SET UP IN THE DICTIONARY
			     (BUILDWORD	WRD
					(SHRDLU-MOD (G3T (CAR X) 'FEATURES)
						    (CDR X))
					(SM X)
					(CAR X)))
			    ((EQ (CAR (LAST WORD)) '=)
			     (BUILDWORD	WRD
			       (COND ((MEMQ '|"| WORD)    ;; "
						     '(PROPN NS POSS))
					       ('(PROPN NS)))
					      '((PROPN T))
					      NIL))
			     ((GO CUT)))
			    (GO WRD)

	     ;;;---------------------------------------------
	     ;;;              MORPHOLOGY CODE
	     ;;;--------------------------------------------
	CUT  (COND ((STA WORD '(T \" N))    ;; "
				     (SETQ RD (CDDDR WORD))
				     (SETQ WORD (CONS '* WORD))
				     (GO TRY))
		   ((STA WORD '(S \"))   ;; "
					   (SETQ WORD (CDDR WORD))
					   (SETQ POSS WRD)
					   (GO WORD))
		   ((STA WORD '(\"))    ;; "
						 (SETQ WORD (CDR WORD))
						 (SETQ POSS WRD)
						 (GO WORD))
					       ((STA WORD '(Y L))
						     (SETQ RD (CDDR WORD))
						     (GO LY))
					       ((STA WORD '(G N I)) (SETQ RD (CDDDR WORD)))
					       ((STA WORD '(D E)) (SETQ RD (CDDR WORD)))
					       ((STA WORD '(N E)) (SETQ RD (CDDR WORD)))
					       ((STA WORD '(R E)) (SETQ RD (CDDR WORD)))
					       ((STA WORD '(T S E)) (SETQ RD (CDDDR WORD)))
					       ((STA WORD '(S))
						     (SETQ RD (CDR WORD))
						     (GO SIB))
					       (T (GO NO)))
					       (SETQ LAST (CAR RD))
					       (SETQ NEXT (CADR RD))
					       (COND ((AND (MEMQ LAST CONSO)
							   (NOT (MEMQ LAST LIQUID))
							   (EQ LAST NEXT))
						      (SETQ RD (CDR RD)))
						     ((EQ LAST '|I|)
						      (SETQ RD (CONS '|Y| (CDR RD))))
						     ((OR (AND (MEMQ LAST CONSO)
							       (MEMQ NEXT VOWEL)
							       (NOT (EQ NEXT '|E|))
							       (MEMQ (CADDR RD) CONSO))
							  (AND (MEMQ LAST LIQUID)
							       (MEMQ NEXT CONSO)
							       (NOT (MEMQ NEXT LIQUID)))
							  (AND (EQ LAST '|H|) (EQ NEXT '|T|))
							  (AND (MEMQ LAST '(C G S J V Z))
							       (OR (MEMQ NEXT LIQUID)
								   (AND	(MEMQ NEXT VOWEL)
									(MEMQ (CADDR RD) VOWEL)))))
						      (SETQ RD (CONS '|E| RD))))
					       (GO TRY)
					       LY
					       (COND ((AND (MEMQ (CAR RD) VOWEL)
							   (NOT (EQ (CAR RD) '|E|))
							   (MEMQ (CADR RD) CONSO))
						      (SETQ RD (CONS '|E| RD))))
					       (COND ((MEMQ 'ADJ
							    (G3T (SETQ ROOT (READLIST (REVERSE RD)))
								   'FEATURES))
						      (BUILDWORD WRD
								 '(ADV VBAD)
								 NIL
 ;TEMP NIL SEMANTICS
								 ROOT)
 ;ROOT IS THE ADJECTIVE
						      (GO WRD)))
					       (GO NO)
					       SIB
					       (SETQ LAST (CAR RD))
					       (SETQ NEXT (CADR RD))
					       (COND ((NOT (EQ LAST '|E|)))
						     ((EQ NEXT '|I|)
						      (SETQ RD (CONS '|Y| (CDDR RD))))
						     ((EQ NEXT '|X|) (SETQ RD (CDR RD)))
						     ((AND (EQ NEXT '|H|)
							   (NOT (EQ (CADDR RD) '|T|)))
						      (SETQ RD (CDR RD)))
						     ((AND (MEMQ NEXT '(S Z))
							   (EQ NEXT (CADDR RD)))
						      (SETQ RD (CDDR RD))))
					       TRY
					       (COND
						     ((OR
							    (SETQ FEATURES
								       (G3T (SETQ ROOT (READLIST (REVERSE RD)))
									      'FEATURES))
							    (AND (SETQ X (G3T ROOT 'IRREGULAR))
								 (SETQ FEATURES
									    (SHRDLU-MOD	(G3T (SETQ ROOT (CAR X))
											       'FEATURES)
											(CDR X)))))
						      (BUILDWORD WRD
								 (SHRDLU-MOD FEATURES (G3T (CAR WORD) 'MOD))
								 (G3T ROOT 'SEMANTICS)
								 ROOT))
						     ((EQ (CAR RD) '|E|) (SETQ RD (CDR RD)) (GO TRY))
						     ((GO NO)))

;;;----------------------------------------------------
;;;  BUILD UP THE PROCESSED LIST OF WORDS TO BE RETURNED
;;;----------------------------------------------------
					       WRD
					       (SETQ
						     SENT
							  (COND	(POSS
								 (COND ((OR (MEMQ 'NOUN
										  (SETQ	FEATURES
											     (G3T WRD
												    'FEATURES)))
 ;IF IT'S A NOUN
									    (MEMQ 'PROPN FEATURES))
 ;OR A PROPER NOUN
									(BUILDWORD POSS
										   (APPEND (MEET FEATURES
 ;MARK IT AS POSSESSIVE
												 (G3T	'POSS
													'ELIM))
											   '(POSS))
										   (G3T WRD
											  'SEMANTICS)
										   ROOT)
									(CONS POSS SENT))
	      ((BUILDWORD '\"S               ;; "
 ; CAN WE GENERALIZE IT???
										   '(VB BE V3PS PRES)
										   (G3T 'BE
											  'SEMANTICS)
										   'BE)
				                  (CONS '\"S (CONS WRD SENT)))))    ;; "
									      ((CONS WRD SENT))))
              PUNC
                                 (COND
									(PUNCT (COND ((AND (EQ PUNCT '?) (NULL SENT))
										      (HELP)
										      (GO THRU))
										     ((MEMQ PUNCT FINAL)
										      (RETURN (CAR (SETQ SAVESENT
													      (CONS (REVERSE SENT)
 ;RETURN POINT !!!!!!!!!!!!!
														    PUNCT)))))
										     ((SETQ SENT (CONS PUNCT SENT))))))
								       (SETQ PUNCT NIL)
								       (SETQ WORD (SETQ POSS NIL))
								       (GO CHAR)
					 NO
								       (COND
									(NEWWORD (BUILDWORD WRD
											    '(NOUN NS)
											    '((NOUN (SMNEWNOUN))
											      (PROPN (SMNEWPROPN)))
											    WRD)
										 (OR ALTN (SETQ NEWWORD NIL))
										 (GO WRD)))
								       (TERPRI)
	     (SAY "*SORRY I DON'T KNOW THE WORD \"")     ;; "
									(PRINT3 WRD)
	     (PRINT3 "\".")                 ;; "
										(TERPRI)
										;; replaced to make more sense with modern keyboards
										;; and remote usage.  -ts.
										(say please continue the sentence\:)
										(apply-say (reverse (cons " ..." sent)))
										(purge-cmd-buffer)
;	     (SAY PLEASE TYPE <Enter> AND CONTINUE THE SENTENCE.)
;	NOGO (OR (CHAR= (READ-CHAR-REMOTE) (CODE-CHAR 10.)) (GO NOGO))))
	     (SETQ PUNCT NIL WORD NIL)
										(GO DO)
        OUT  (print (format nil "~A:~A" SENT WORD))))

(DEFUN PROPNAME (X) (EQ (CAR (EXPLODE X)) '=))

(DEFUN BUILDWORD (WORD FEATURES SEMANTICS ROOT)
									(S3TF WORD 'FEATURES FEATURES)
									(S3TF WORD 'SEMANTICS (OR SMN SEMANTICS))
									(AND ROOT (S3TF WORD 'ROOT ROOT))
									WORD)

(SETQ CARRET #\NEWLINE)

(DEFUN ETNEW NIL
       (AND (EQ (CAR WORD) '|"|)
	    (EQ (CAR (LAST WORD)) '|"|)   ;; "
										 (SETQ WRD (READLIST (CDR (REVERSE (CDR WORD)))))
										 (BUILDWORD WRD
											    '(NOUN NS)
											    '((NOUN (NEWWORD)))
											    NIL)))

(SETQ FINAL '(\. ? !))

(SETQ CONSO '(B C D F G H J K L M N P Q R S T V W X Z))


(SETQ LIQUID '(L R S Z V))

(SETQ PUNCL '(\. ? \: \; !))

(SETQ RUBOUT #\RUBOUT)

(DEFUN UNDEFINED NIL (PROGN (PRINC (WORD N)) (ERT UNDEFINED)))

(DEFUN UPPERCASE-IFY-CHAR (CHAR) (COND ((CHAR>= #\Z CHAR #\A) (CHAR- CHAR (CODE-CHAR 32))) (T CHAR)))

(SETQ VOWEL '(NIL A E I O U Y))

(SETQ SPACE-CHAR #\Space  )
