; This file contains routines that PROGRAMMER needs to interpret the
; "gramar" file directly.  See the file "macros" for equivalent
; functions used when using a compiled version of the grammar.
;
; The functions in this file do not work correctly, and it appears
; unlikely that they will in the near future.  Common LISP does not
; allow a "computed goto" which the ":" function relies heavily on.
; Fortunately the compiled version of the grammar works fine.
;
; 	Keldon (09/15/1999)

(DEFUN-FEXPR PDEFINE (A) 
       ;;THIS PDEFINE MERELY PUT THE PROGRAMMAR FUNCTION ON THE
       ;;PROPERTY LIST OF THE PARSE NAME UNDER THE INDICATOR
       ;;'INTERPRET. IT ALSO ADDS THE TAGS FAIL AND RETURN. NOTE THAT
       ;;THE PDEFINE BODY IS SIMILIAR TO PROG BODY. THIS SETS UP
       ;;INTERPRETED PROGRAMMAR EXECUTIONS
       (S3TF (CAR A) 'INTERPRET
		(APPEND '(PROG) (CDR A)
		       (LIST 'FAIL
			     '(RETURN 'FAIL)
			     'RETURN
			     '(RETURN 'RETURN)))))

(DEFUN INTERPRET (UNIT) 
       ;; INTERPRET IS THE FUNCTION WHICH 'CALLS' AN INTERPRETED
       ;;PROGRAMMAR PROGRAM.  IT FIRST DECLARES AND INITIALIZES ALL
       ;;THE RELAVENT VARIABLES THEN IT EXECUTES THE PROGRAMMAR BODY
       ;;AS A PROG NOTE THE USE OF "RE". IT IS SET TO A NODE ONE
       ;;WISHES TO BE THE INITIAL DAUGHTER OF THIS NODE - ONLY CONJ
       ;;NEEDS THIS HACK
       (PROG (FE H ME NB C SM CUT NN T1 T2 T3) 
	     (SETQ NN T)
	     (SETQ CUT END)
	     (SETQ C (BUILDNODE (SETQ FE (REVERSE R3ST))	       ;FEATURE LIST
				(SETQ NB (OR (NB RE) N))	       ;BEGINNING IN SENTENCE OF THIS NODE
				N				       ;SENTENCE POINTER JUST AFTER THIS NODE
				(SETQ H RE)			       ;DAUGHTERS OF THIS NODE
				NIL))				       ;SEMANTIC JAZZ
	     (SETR 'PARENT PARENT C)				       ;SET PARENT REGISTER
	     (COND ((EQ (EVAL (THGET UNIT 'INTERPRET))
			'RETURN)
		    (GO RETURN)))				       ;APPLY THE PROGRAMMAR PROGRAM
	FAIL (SETQ MES ME)
	     (SETQ N (OR (N RE) NB))				       ;RESET SENTENCE POINTER
	     (RETURN NIL)
	RETURN
	     (SETQ MES ME)
	     (RETURN (REBUILD (REVERSE FE) NB N H SM C)))) 

(DEFUN-FEXPR : (&REST BRANCH) 
       (COND ((EVAL (CAR BRANCH))				       ;EVALUATE BRANCH CONDITION
	      (COND ((AND (NULL NN) (CDDDR BRANCH))
		     (GOCHECK (CDDR BRANCH)))			       ;IF TRUE AND NO MORE SENTENCE REMAINS
		    (T (GOCHECK BRANCH))))			       ;AND IF THIRD BRANCH GIVEN,THEN GO TO THIRD
	     (T (GOCHECK (CDR BRANCH))))) 			       ;BRANCH 2ND BRANCH

(DEFUN GOCHECK (LABEL) 
       ;;THE GOCHECK FUNCTION CHECKS THE BRANCHES OF THE PROGRAMMAR
       ;;CONDITIONAL IF THE BRANCH IS NIL, GOCHECK MERELY RETURNS IF
       ;;THE BRANCH IS NON-ATOMIC, IT IS TAKEN AS A FAILURE MESAGE
       ;;GOCHECK PUTS THE MESAGE ON THE MESSAGE LIST AND GOES TO
       ;;FAIL(IN GINTERP) IF THE BRANCH IS ATOMIC, GOCHECK GOES TO IT
       ;;REMEMBER THAT THE GO LEADS TO A POINT SOMEWHERE IN THE
       ;;PROGRAMMAR PROGRAM UNLESS IT IS 'FAIL OR 'RETURN
       (COND ((NULL (CADR LABEL)) T)
	     ((ATOM (CADR LABEL)) (GO (CADR LABEL)))
	     (T (M (CADR LABEL)) (GO FAIL)))) 

(DEFUN-FEXPR GOCOND (A) 
       ;;GOCOND GOES TO THE 1ST OR 2ND OF TWO TAGS DEPENDING IF THERE
       ;;REMAINS ANY MORE OF THE SENTENCE YET TO BE PARSED
       (COND (NN (GO (CAR A))) (T (GO (CADR A))))) 
