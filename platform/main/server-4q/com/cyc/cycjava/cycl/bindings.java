package com.cyc.cycjava.cycl;


import static com.cyc.cycjava.cycl.constant_handles.reader_make_constant_shell;
import static com.cyc.cycjava.cycl.cyc_testing.generic_testing.define_test_case_table_int;
import static com.cyc.cycjava.cycl.el_utilities.el_empty_set_p;
import static com.cyc.cycjava.cycl.el_utilities.el_extensional_set_p;
import static com.cyc.cycjava.cycl.el_utilities.extensional_set_elements;
import static com.cyc.cycjava.cycl.el_utilities.make_el_extensional_set;
import static com.cyc.cycjava.cycl.el_utilities.make_el_formula;
import static com.cyc.cycjava.cycl.el_utilities.possibly_naut_p;
import static com.cyc.cycjava.cycl.subl_macro_promotions.declare_defglobal;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.cons;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.list;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.rplaca;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality.equal;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.delete;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.find_if;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.length;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.nreverse;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.remove;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.remove_if;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.symbol_function;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types.consp;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types.listp;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.arg2;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.multiple_value_list;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.resetMultipleValues;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.values;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeBoolean;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeInteger;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeString;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeSymbol;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.destructuring_bind_must_consp;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.assoc;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.member;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.nsublis;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.nsubst;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.rassoc;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.set_difference;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.sublis;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.subst;
import static com.cyc.tool.subl.util.SubLFiles.declareFunction;
import static com.cyc.tool.subl.util.SubLFiles.defconstant;
import static com.cyc.tool.subl.util.SubLFiles.deflexical;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.BinaryFunction;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Mapping;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.UnaryFunction;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLSystemTrampolineFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;


public final class bindings extends SubLTranslatedFile {
    public static final SubLFile me = new bindings();

    public static final String myName = "com.cyc.cycjava.cycl.bindings";

    public static final String myFingerPrint = "702c04017a90169619700dc168954a43e9477a7ff0ab30105c411ed52c8c9b2a";





    // defconstant
    public static final SubLSymbol $dont_care_variable_binding_value$ = makeSymbol("*DONT-CARE-VARIABLE-BINDING-VALUE*");



    // deflexical
    /**
     * Dummy unification binding list indicating unification success, with no
     * variables.
     */
    private static final SubLSymbol $unification_success_token$ = makeSymbol("*UNIFICATION-SUCCESS-TOKEN*");

    // Internal Constants
    public static final SubLSymbol HL_IDENTITY_BINDING = makeSymbol("HL-IDENTITY-BINDING");



    public static final SubLSymbol $hl_identity_binding_caching_state$ = makeSymbol("*HL-IDENTITY-BINDING-CACHING-STATE*");

    private static final SubLSymbol HL_IDENTITY_BINDINGS = makeSymbol("HL-IDENTITY-BINDINGS");

    private static final SubLSymbol $hl_identity_bindings_caching_state$ = makeSymbol("*HL-IDENTITY-BINDINGS-CACHING-STATE*");

    private static final SubLList $list5 = cons(makeSymbol("A"), makeSymbol("B"));

    private static final SubLSymbol BINDING_P = makeSymbol("BINDING-P");

    private static final SubLSymbol BINDING_LIST_P = makeSymbol("BINDING-LIST-P");

    private static final SubLSymbol VARIABLE_TO_VARIABLE_BINDING_P = makeSymbol("VARIABLE-TO-VARIABLE-BINDING-P");

    private static final SubLSymbol INFERENCE_BINDING_P = makeSymbol("INFERENCE-BINDING-P");

    private static final SubLSymbol INFERENCE_BINDING_SET_P = makeSymbol("INFERENCE-BINDING-SET-P");

    private static final SubLObject $$ELInferenceBindingFn = reader_make_constant_shell(makeString("ELInferenceBindingFn"));

    private static final SubLObject $$TheTermBindingFn = reader_make_constant_shell(makeString("TheTermBindingFn"));

    public static final SubLSymbol KB_BINDING_P = makeSymbol("KB-BINDING-P");

    public static final SubLSymbol KB_BINDING_SET_P = makeSymbol("KB-BINDING-SET-P");

    private static final SubLSymbol $sym15$BINDING_EQUAL_MODULO_EL_VAR_NAMES_ = makeSymbol("BINDING-EQUAL-MODULO-EL-VAR-NAMES?");

    private static final SubLSymbol $sym16$BINDINGS_EQUAL_ = makeSymbol("BINDINGS-EQUAL?");



    private static final SubLSymbol VARIABLE_BINDING_VARIABLE = makeSymbol("VARIABLE-BINDING-VARIABLE");

    private static final SubLSymbol VARIABLE_BINDING_VALUE = makeSymbol("VARIABLE-BINDING-VALUE");

    private static final SubLList $list20 = cons(makeSymbol("VARIABLE"), makeSymbol("VALUE"));

    private static final SubLSymbol BINDINGS_P = makeSymbol("BINDINGS-P");

    private static final SubLSymbol VARIABLE_MAP_P = makeSymbol("VARIABLE-MAP-P");

    public static final SubLList $list23 = cons(makeSymbol("A-VAR"), makeSymbol("C-VALUE"));

    private static final SubLString $str24$Incomplete_variable_map__a_applie = makeString("Incomplete variable map ~a applied to ~a");

    private static final SubLList $list25 = cons(makeSymbol("B-VAR"), makeSymbol("C-VALUE"));

    private static final SubLList $list26 = cons(makeSymbol("POTENTIALLY-LOOPY-VARIABLE"), makeSymbol("POTENTIALLY-LOOPY-VALUE"));

    private static final SubLList $list27 = cons(makeSymbol("VAR"), makeSymbol("LOOPY-VALUE"));



    private static final SubLSymbol $dummy_binding$ = makeSymbol("*DUMMY-BINDING*");



    private static final SubLSymbol KB_SET_OF_BINDING_SETS_P = makeSymbol("KB-SET-OF-BINDING-SETS-P");

    private static final SubLSymbol BINDING_LISTS_P = makeSymbol("BINDING-LISTS-P");

    private static final SubLList $list33 = cons(makeSymbol("VAR"), makeSymbol("VALUE"));

    private static final SubLSymbol INFERENCE_SET_OF_BINDING_SETS_P = makeSymbol("INFERENCE-SET-OF-BINDING-SETS-P");

    private static final SubLSymbol KB_BINDING_VARIABLE = makeSymbol("KB-BINDING-VARIABLE");

    private static final SubLSymbol KB_BINDING_VALUE = makeSymbol("KB-BINDING-VALUE");

    private static final SubLSymbol $sym37$EL_VAR_ = makeSymbol("EL-VAR?");

    private static final SubLSymbol KB_BINDING_SET_VALUES = makeSymbol("KB-BINDING-SET-VALUES");

    private static final SubLString $str39$_A_is_neither_EL_VAR__nor_FORT_P_ = makeString("~A is neither EL-VAR? nor FORT-P.");



    private static final SubLString $str41$Some_element_of__A_is_not_a_KB_BI = makeString("Some element of ~A is not a KB-BINDING-P");

    private static final SubLString $str42$Some_element_of__A_is_not_a_KB_BI = makeString("Some element of ~A is not a KB-BINDING-SET-P");

    private static final SubLSymbol TRANSFER_VARIABLE_MAP_TO_BINDINGS = makeSymbol("TRANSFER-VARIABLE-MAP-TO-BINDINGS");













    private static final SubLList $list50 = list(list(list(list(cons(makeSymbol("?X"), makeSymbol("?Y"))), list(cons(makeSymbol("?X"), reader_make_constant_shell(makeString("December"))))), list(cons(makeSymbol("?Y"), reader_make_constant_shell(makeString("December"))))));

    private static final SubLSymbol TRANSFER_VARIABLE_MAP_TO_BINDINGS_FILTERED = makeSymbol("TRANSFER-VARIABLE-MAP-TO-BINDINGS-FILTERED");

    private static final SubLList $list52 = list(list(list(list(cons(makeSymbol("?X"), makeSymbol("?Y"))), list(cons(makeSymbol("?X"), reader_make_constant_shell(makeString("December"))), cons(makeSymbol("?Z"), reader_make_constant_shell(makeString("February"))))), list(cons(makeSymbol("?Y"), reader_make_constant_shell(makeString("December"))))));

    private static final SubLSymbol TRANSFER_VARIABLE_MAP_TO_BINDINGS_BACKWARDS = makeSymbol("TRANSFER-VARIABLE-MAP-TO-BINDINGS-BACKWARDS");

    private static final SubLList $list54 = list(list(list(list(cons(makeSymbol("?Y"), makeSymbol("?X"))), list(cons(makeSymbol("?X"), reader_make_constant_shell(makeString("December"))))), list(cons(makeSymbol("?Y"), reader_make_constant_shell(makeString("December"))))));

    private static final SubLSymbol COMPOSE_BINDINGS = makeSymbol("COMPOSE-BINDINGS");

    private static final SubLList $list56 = list(list(list(list(cons(makeSymbol("?X"), makeSymbol("?A")), cons(makeSymbol("?Y"), makeSymbol("?B")), cons(makeSymbol("?Z"), makeSymbol("?C"))), list(cons(makeSymbol("?A"), reader_make_constant_shell(makeString("January"))), cons(makeSymbol("?C"), reader_make_constant_shell(makeString("February"))))), list(cons(makeSymbol("?X"), reader_make_constant_shell(makeString("January"))), cons(makeSymbol("?Z"), reader_make_constant_shell(makeString("February"))))));

    private static final SubLSymbol COMPOSE_BINDINGS_FILTERED = makeSymbol("COMPOSE-BINDINGS-FILTERED");

    private static final SubLList $list58 = list(list(list(list(cons(makeSymbol("?X"), makeSymbol("?A")), cons(makeSymbol("?Y"), makeSymbol("?B")), cons(makeSymbol("?Z"), makeSymbol("?C"))), list(cons(makeSymbol("?A"), reader_make_constant_shell(makeString("January"))), cons(makeSymbol("?C"), reader_make_constant_shell(makeString("February"))), cons(makeSymbol("?D"), reader_make_constant_shell(makeString("March"))))), list(cons(makeSymbol("?X"), reader_make_constant_shell(makeString("January"))), cons(makeSymbol("?Z"), reader_make_constant_shell(makeString("February"))))));



    private static final SubLList $list60 = list(new SubLObject[]{ list(list(FIVE_INTEGER), NIL), list(list(makeString("xyz")), NIL), list(list(list(reader_make_constant_shell(makeString("TheSet")), reader_make_constant_shell(makeString("TheEmptySet")))), NIL), list(list(reader_make_constant_shell(makeString("Collection"))), NIL), list(list(list(reader_make_constant_shell(makeString("ELInferenceBindingFn")), reader_make_constant_shell(makeString("Collection")), makeSymbol("?X"))), NIL), list(list(list(reader_make_constant_shell(makeString("ELInferenceBindingFn")), reader_make_constant_shell(makeString("Collection")), reader_make_constant_shell(makeString("Thing")), reader_make_constant_shell(makeString("Predicate")))), NIL), list(list(list(reader_make_constant_shell(makeString("ELInferenceBindingFn")), reader_make_constant_shell(makeString("TheAssertionSentence")), list(reader_make_constant_shell(makeString("isa")), reader_make_constant_shell(makeString("Predicate")), reader_make_constant_shell(makeString("Collection"))))), NIL), list(list(list(reader_make_constant_shell(makeString("ELInferenceBindingFn")), makeSymbol("?X"), reader_make_constant_shell(makeString("Predicate")))), T), list(list(list(reader_make_constant_shell(makeString("ELInferenceBindingFn")), makeSymbol("?Y"), makeString("whatever"))), T), list(list(list(reader_make_constant_shell(makeString("TheTermBindingFn")), reader_make_constant_shell(makeString("TheAssertionSentence")), list(reader_make_constant_shell(makeString("isa")), reader_make_constant_shell(makeString("Predicate")), reader_make_constant_shell(makeString("Collection"))))), T), list(list(list(reader_make_constant_shell(makeString("TheTermBindingFn")), makeSymbol("?X"), reader_make_constant_shell(makeString("Predicate")))), NIL) });

    private static final SubLList $list61 = list(new SubLObject[]{ list(list(FIVE_INTEGER), NIL), list(list(makeString("xyz")), NIL), list(list(list(reader_make_constant_shell(makeString("TheSet")), reader_make_constant_shell(makeString("TheEmptySet")))), NIL), list(list(reader_make_constant_shell(makeString("Collection"))), NIL), list(list(list(reader_make_constant_shell(makeString("TheSet")), list(reader_make_constant_shell(makeString("TheSet")), FIVE_INTEGER, SIX_INTEGER, SEVEN_INTEGER))), NIL), list(list(NIL), NIL), list(list(reader_make_constant_shell(makeString("TheEmptySet"))), T), list(list(list(reader_make_constant_shell(makeString("TheSet")), list(reader_make_constant_shell(makeString("ELInferenceBindingFn")), makeSymbol("?X"), reader_make_constant_shell(makeString("Collection"))))), T), list(list(list(reader_make_constant_shell(makeString("TheSet")), list(reader_make_constant_shell(makeString("ELInferenceBindingFn")), makeSymbol("?Y"), makeString("hello")))), T), list(list(list(reader_make_constant_shell(makeString("TheSet")), list(reader_make_constant_shell(makeString("ELInferenceBindingFn")), makeSymbol("?Y"), makeString("hello")), list(reader_make_constant_shell(makeString("ELInferenceBindingFn")), makeSymbol("?X"), reader_make_constant_shell(makeString("February"))))), T), list(list(list(reader_make_constant_shell(makeString("TheSet")), list(reader_make_constant_shell(makeString("TheTermBindingFn")), reader_make_constant_shell(makeString("TheCurrentKBNumber")), makeInteger(1180)))), T), list(list(list(reader_make_constant_shell(makeString("TheSet")), list(reader_make_constant_shell(makeString("TheTermBindingFn")), reader_make_constant_shell(makeString("TheCurrentKBNumber")), makeInteger(1180)), list(reader_make_constant_shell(makeString("TheTermBindingFn")), reader_make_constant_shell(makeString("TheAssertionSentence")), list(reader_make_constant_shell(makeString("isa")), reader_make_constant_shell(makeString("Predicate")), reader_make_constant_shell(makeString("Collection")))))), T) });

    private static final SubLList $list62 = list(new SubLObject[]{ list(list(FIVE_INTEGER), NIL), list(list(makeString("xyz")), NIL), list(list(list(reader_make_constant_shell(makeString("TheSet")), reader_make_constant_shell(makeString("TheEmptySet")))), T), list(list(reader_make_constant_shell(makeString("Collection"))), NIL), list(list(list(reader_make_constant_shell(makeString("TheSet")), list(reader_make_constant_shell(makeString("TheSet")), reader_make_constant_shell(makeString("TheEmptySet"))))), NIL), list(list(list(reader_make_constant_shell(makeString("TheSet")), list(reader_make_constant_shell(makeString("TheSet")), FIVE_INTEGER, SIX_INTEGER, SEVEN_INTEGER))), NIL), list(list(NIL), NIL), list(list(reader_make_constant_shell(makeString("TheEmptySet"))), T), list(list(list(reader_make_constant_shell(makeString("TheEmptySet")))), NIL), list(list(list(reader_make_constant_shell(makeString("TheSet")), list(reader_make_constant_shell(makeString("ELInferenceBindingFn")), makeSymbol("?X"), reader_make_constant_shell(makeString("Collection"))))), NIL), list(list(list(reader_make_constant_shell(makeString("TheSet")), list(reader_make_constant_shell(makeString("TheTermBindingFn")), reader_make_constant_shell(makeString("TheAssertionSentence")), list(reader_make_constant_shell(makeString("isa")), reader_make_constant_shell(makeString("Predicate")), reader_make_constant_shell(makeString("Collection")))))), NIL), list(list(list(reader_make_constant_shell(makeString("TheSet")), list(reader_make_constant_shell(makeString("TheSet")), list(reader_make_constant_shell(makeString("ELInferenceBindingFn")), makeSymbol("?X"), reader_make_constant_shell(makeString("Collection")))))), T), list(list(list(reader_make_constant_shell(makeString("TheSet")), list(reader_make_constant_shell(makeString("TheSet")), list(reader_make_constant_shell(makeString("TheTermBindingFn")), reader_make_constant_shell(makeString("TheAssertionSentence")), list(reader_make_constant_shell(makeString("isa")), reader_make_constant_shell(makeString("Predicate")), reader_make_constant_shell(makeString("Collection"))))))), T) });

    private static final SubLSymbol INFERENCIFY_KB_SET_OF_BINDING_SETS = makeSymbol("INFERENCIFY-KB-SET-OF-BINDING-SETS");

    private static final SubLList $list64 = list(list(list(reader_make_constant_shell(makeString("TheEmptySet"))), NIL), list(list(list(reader_make_constant_shell(makeString("TheSet")), reader_make_constant_shell(makeString("TheEmptySet")))), list(NIL)), list(list(list(reader_make_constant_shell(makeString("TheSet")), list(reader_make_constant_shell(makeString("TheSet")), list(reader_make_constant_shell(makeString("ELInferenceBindingFn")), makeSymbol("?X"), reader_make_constant_shell(makeString("Collection")))))), list(list(cons(makeSymbol("?X"), reader_make_constant_shell(makeString("Collection")))))), list(list(list(reader_make_constant_shell(makeString("TheSet")), list(reader_make_constant_shell(makeString("TheSet")), list(reader_make_constant_shell(makeString("ELInferenceBindingFn")), makeSymbol("?Y"), makeString("hello")), list(reader_make_constant_shell(makeString("ELInferenceBindingFn")), makeSymbol("?X"), reader_make_constant_shell(makeString("Predicate")))))), list(list(cons(makeSymbol("?Y"), makeString("hello")), cons(makeSymbol("?X"), reader_make_constant_shell(makeString("Predicate")))))), list(list(list(reader_make_constant_shell(makeString("TheSet")), list(reader_make_constant_shell(makeString("TheSet")), list(reader_make_constant_shell(makeString("ELInferenceBindingFn")), makeSymbol("?Y"), makeString("hello"))), list(reader_make_constant_shell(makeString("TheSet")), list(reader_make_constant_shell(makeString("ELInferenceBindingFn")), makeSymbol("?X"), reader_make_constant_shell(makeString("Predicate")))))), list(list(cons(makeSymbol("?Y"), makeString("hello"))), list(cons(makeSymbol("?X"), reader_make_constant_shell(makeString("Predicate")))))), list(list(list(reader_make_constant_shell(makeString("TheSet")), list(reader_make_constant_shell(makeString("TheSet")), list(reader_make_constant_shell(makeString("TheTermBindingFn")), reader_make_constant_shell(makeString("TheCurrentKBNumber")), makeInteger(1180))))), list(list(cons(reader_make_constant_shell(makeString("TheCurrentKBNumber")), makeInteger(1180))))), list(list(list(reader_make_constant_shell(makeString("TheSet")), list(reader_make_constant_shell(makeString("TheSet")), list(reader_make_constant_shell(makeString("TheTermBindingFn")), reader_make_constant_shell(makeString("TheCurrentKBNumber")), makeInteger(1180)), list(reader_make_constant_shell(makeString("TheTermBindingFn")), reader_make_constant_shell(makeString("TheAssertionSentence")), list(reader_make_constant_shell(makeString("isa")), reader_make_constant_shell(makeString("Predicate")), reader_make_constant_shell(makeString("Collection"))))))), list(list(cons(reader_make_constant_shell(makeString("TheCurrentKBNumber")), makeInteger(1180)), list(reader_make_constant_shell(makeString("TheAssertionSentence")), reader_make_constant_shell(makeString("isa")), reader_make_constant_shell(makeString("Predicate")), reader_make_constant_shell(makeString("Collection")))))), list(list(list(reader_make_constant_shell(makeString("TheSet")), list(reader_make_constant_shell(makeString("TheSet")), list(reader_make_constant_shell(makeString("TheTermBindingFn")), reader_make_constant_shell(makeString("TheCurrentKBNumber")), makeInteger(1180))), list(reader_make_constant_shell(makeString("TheSet")), list(reader_make_constant_shell(makeString("TheTermBindingFn")), reader_make_constant_shell(makeString("TheAssertionSentence")), list(reader_make_constant_shell(makeString("isa")), reader_make_constant_shell(makeString("Predicate")), reader_make_constant_shell(makeString("Collection"))))))), list(list(cons(reader_make_constant_shell(makeString("TheCurrentKBNumber")), makeInteger(1180))), list(list(reader_make_constant_shell(makeString("TheAssertionSentence")), reader_make_constant_shell(makeString("isa")), reader_make_constant_shell(makeString("Predicate")), reader_make_constant_shell(makeString("Collection")))))));

    private static final SubLSymbol KBIFY_SET_OF_BINDING_SETS = makeSymbol("KBIFY-SET-OF-BINDING-SETS");

    private static final SubLSymbol TEST_KBIFIED_SET_OF_BINDING_SETS = makeSymbol("TEST-KBIFIED-SET-OF-BINDING-SETS");

    public static final SubLList $list67 = list(list(list(NIL), reader_make_constant_shell(makeString("TheEmptySet"))), list(list(list(NIL)), list(reader_make_constant_shell(makeString("TheSet")), reader_make_constant_shell(makeString("TheEmptySet")))), list(list(list(list(cons(makeSymbol("?X"), reader_make_constant_shell(makeString("Collection")))))), list(reader_make_constant_shell(makeString("TheSet")), list(reader_make_constant_shell(makeString("TheSet")), list(reader_make_constant_shell(makeString("ELInferenceBindingFn")), makeSymbol("?X"), reader_make_constant_shell(makeString("Collection")))))), list(list(list(list(cons(makeSymbol("?Y"), makeString("hello")), cons(makeSymbol("?X"), reader_make_constant_shell(makeString("Predicate")))))), list(reader_make_constant_shell(makeString("TheSet")), list(reader_make_constant_shell(makeString("TheSet")), list(reader_make_constant_shell(makeString("ELInferenceBindingFn")), makeSymbol("?Y"), makeString("hello")), list(reader_make_constant_shell(makeString("ELInferenceBindingFn")), makeSymbol("?X"), reader_make_constant_shell(makeString("Predicate")))))), list(list(list(list(cons(makeSymbol("?Y"), makeString("hello"))), list(cons(makeSymbol("?X"), reader_make_constant_shell(makeString("Predicate")))))), list(reader_make_constant_shell(makeString("TheSet")), list(reader_make_constant_shell(makeString("TheSet")), list(reader_make_constant_shell(makeString("ELInferenceBindingFn")), makeSymbol("?Y"), makeString("hello"))), list(reader_make_constant_shell(makeString("TheSet")), list(reader_make_constant_shell(makeString("ELInferenceBindingFn")), makeSymbol("?X"), reader_make_constant_shell(makeString("Predicate")))))), list(list(list(list(cons(reader_make_constant_shell(makeString("TheCurrentKBNumber")), makeInteger(1180))))), list(reader_make_constant_shell(makeString("TheSet")), list(reader_make_constant_shell(makeString("TheSet")), list(reader_make_constant_shell(makeString("TheTermBindingFn")), reader_make_constant_shell(makeString("TheCurrentKBNumber")), makeInteger(1180))))), list(list(list(list(cons(reader_make_constant_shell(makeString("TheCurrentKBNumber")), makeInteger(1180)), list(reader_make_constant_shell(makeString("TheAssertionSentence")), reader_make_constant_shell(makeString("isa")), reader_make_constant_shell(makeString("Predicate")), reader_make_constant_shell(makeString("Collection")))))), list(reader_make_constant_shell(makeString("TheSet")), list(reader_make_constant_shell(makeString("TheSet")), list(reader_make_constant_shell(makeString("TheTermBindingFn")), reader_make_constant_shell(makeString("TheCurrentKBNumber")), makeInteger(1180)), list(reader_make_constant_shell(makeString("TheTermBindingFn")), reader_make_constant_shell(makeString("TheAssertionSentence")), list(reader_make_constant_shell(makeString("isa")), reader_make_constant_shell(makeString("Predicate")), reader_make_constant_shell(makeString("Collection"))))))), list(list(list(list(cons(reader_make_constant_shell(makeString("TheCurrentKBNumber")), makeInteger(1180))), list(list(reader_make_constant_shell(makeString("TheAssertionSentence")), reader_make_constant_shell(makeString("isa")), reader_make_constant_shell(makeString("Predicate")), reader_make_constant_shell(makeString("Collection")))))), list(reader_make_constant_shell(makeString("TheSet")), list(reader_make_constant_shell(makeString("TheSet")), list(reader_make_constant_shell(makeString("TheTermBindingFn")), reader_make_constant_shell(makeString("TheCurrentKBNumber")), makeInteger(1180))), list(reader_make_constant_shell(makeString("TheSet")), list(reader_make_constant_shell(makeString("TheTermBindingFn")), reader_make_constant_shell(makeString("TheAssertionSentence")), list(reader_make_constant_shell(makeString("isa")), reader_make_constant_shell(makeString("Predicate")), reader_make_constant_shell(makeString("Collection"))))))));

    private static final SubLSymbol KBIFY_INFERENCE_SET_OF_BINDING_SETS = makeSymbol("KBIFY-INFERENCE-SET-OF-BINDING-SETS");

    public static final SubLList $list69 = list(list(list(NIL), reader_make_constant_shell(makeString("TheEmptySet"))), list(list(list(NIL)), list(reader_make_constant_shell(makeString("TheSet")), reader_make_constant_shell(makeString("TheEmptySet")))), list(list(list(list(cons(makeSymbol("?X"), reader_make_constant_shell(makeString("Collection")))))), list(reader_make_constant_shell(makeString("TheSet")), list(reader_make_constant_shell(makeString("TheSet")), list(reader_make_constant_shell(makeString("ELInferenceBindingFn")), makeSymbol("?X"), reader_make_constant_shell(makeString("Collection")))))), list(list(list(list(cons(makeSymbol("?Y"), makeString("hello")), cons(makeSymbol("?X"), reader_make_constant_shell(makeString("Predicate")))))), list(reader_make_constant_shell(makeString("TheSet")), list(reader_make_constant_shell(makeString("TheSet")), list(reader_make_constant_shell(makeString("ELInferenceBindingFn")), makeSymbol("?Y"), makeString("hello")), list(reader_make_constant_shell(makeString("ELInferenceBindingFn")), makeSymbol("?X"), reader_make_constant_shell(makeString("Predicate")))))), list(list(list(list(cons(makeSymbol("?Y"), makeString("hello"))), list(cons(makeSymbol("?X"), reader_make_constant_shell(makeString("Predicate")))))), list(reader_make_constant_shell(makeString("TheSet")), list(reader_make_constant_shell(makeString("TheSet")), list(reader_make_constant_shell(makeString("ELInferenceBindingFn")), makeSymbol("?Y"), makeString("hello"))), list(reader_make_constant_shell(makeString("TheSet")), list(reader_make_constant_shell(makeString("ELInferenceBindingFn")), makeSymbol("?X"), reader_make_constant_shell(makeString("Predicate")))))));

    private static final SubLSymbol KB_BINDING_SET_VARIABLES = makeSymbol("KB-BINDING-SET-VARIABLES");

    public static final SubLList $list71 = list(list(list(list(reader_make_constant_shell(makeString("TheSet")), list(reader_make_constant_shell(makeString("ELInferenceBindingFn")), makeSymbol("?X"), reader_make_constant_shell(makeString("Collection"))))), list(makeSymbol("?X"))), list(list(list(reader_make_constant_shell(makeString("TheSet")), list(reader_make_constant_shell(makeString("ELInferenceBindingFn")), makeSymbol("?Y"), makeString("hello")), list(reader_make_constant_shell(makeString("ELInferenceBindingFn")), makeSymbol("?X"), reader_make_constant_shell(makeString("Predicate"))))), list(makeSymbol("?Y"), makeSymbol("?X"))), list(list(list(reader_make_constant_shell(makeString("TheSet")), list(reader_make_constant_shell(makeString("TheTermBindingFn")), reader_make_constant_shell(makeString("TheCurrentKBNumber")), makeInteger(1180)))), list(reader_make_constant_shell(makeString("TheCurrentKBNumber")))), list(list(list(reader_make_constant_shell(makeString("TheSet")), list(reader_make_constant_shell(makeString("TheTermBindingFn")), reader_make_constant_shell(makeString("TheCurrentKBNumber")), makeInteger(1180)), list(reader_make_constant_shell(makeString("TheTermBindingFn")), reader_make_constant_shell(makeString("TheAssertionSentence")), list(reader_make_constant_shell(makeString("isa")), reader_make_constant_shell(makeString("Predicate")), reader_make_constant_shell(makeString("Collection")))))), list(reader_make_constant_shell(makeString("TheCurrentKBNumber")), reader_make_constant_shell(makeString("TheAssertionSentence")))));

    private static final SubLList $list72 = list(list(list(list(reader_make_constant_shell(makeString("TheSet")), list(reader_make_constant_shell(makeString("ELInferenceBindingFn")), makeSymbol("?X"), reader_make_constant_shell(makeString("Collection"))))), list(reader_make_constant_shell(makeString("Collection")))), list(list(list(reader_make_constant_shell(makeString("TheSet")), list(reader_make_constant_shell(makeString("ELInferenceBindingFn")), makeSymbol("?Y"), makeString("hello")), list(reader_make_constant_shell(makeString("ELInferenceBindingFn")), makeSymbol("?X"), reader_make_constant_shell(makeString("Predicate"))))), list(makeString("hello"), reader_make_constant_shell(makeString("Predicate")))), list(list(list(reader_make_constant_shell(makeString("TheSet")), list(reader_make_constant_shell(makeString("TheTermBindingFn")), reader_make_constant_shell(makeString("TheCurrentKBNumber")), makeInteger(1180)))), list(makeInteger(1180))), list(list(list(reader_make_constant_shell(makeString("TheSet")), list(reader_make_constant_shell(makeString("TheTermBindingFn")), reader_make_constant_shell(makeString("TheCurrentKBNumber")), makeInteger(1180)), list(reader_make_constant_shell(makeString("TheTermBindingFn")), reader_make_constant_shell(makeString("TheAssertionSentence")), list(reader_make_constant_shell(makeString("isa")), reader_make_constant_shell(makeString("Predicate")), reader_make_constant_shell(makeString("Collection")))))), list(makeInteger(1180), list(reader_make_constant_shell(makeString("isa")), reader_make_constant_shell(makeString("Predicate")), reader_make_constant_shell(makeString("Collection"))))));

    public static SubLObject clear_hl_identity_binding() {
        final SubLObject cs = $hl_identity_binding_caching_state$.getGlobalValue();
        if (NIL != cs) {
            memoization_state.caching_state_clear(cs);
        }
        return NIL;
    }

    public static SubLObject remove_hl_identity_binding(final SubLObject n) {
        return memoization_state.caching_state_remove_function_results_with_args($hl_identity_binding_caching_state$.getGlobalValue(), list(n), UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject hl_identity_binding_internal(final SubLObject n) {
        assert NIL != subl_promotions.non_negative_integer_p(n) : "subl_promotions.non_negative_integer_p(n) " + "CommonSymbols.NIL != subl_promotions.non_negative_integer_p(n) " + n;
        final SubLObject variable = variables.find_variable_by_id(n);
        return make_variable_binding(variable, variable);
    }

    public static SubLObject hl_identity_binding(final SubLObject n) {
        SubLObject caching_state = $hl_identity_binding_caching_state$.getGlobalValue();
        if (NIL == caching_state) {
            caching_state = memoization_state.create_global_caching_state_for_name(HL_IDENTITY_BINDING, $hl_identity_binding_caching_state$, NIL, EQL, ONE_INTEGER, TEN_INTEGER);
        }
        SubLObject results = memoization_state.caching_state_lookup(caching_state, n, memoization_state.$memoized_item_not_found$.getGlobalValue());
        if (results.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            results = arg2(resetMultipleValues(), multiple_value_list(hl_identity_binding_internal(n)));
            memoization_state.caching_state_put(caching_state, n, results, UNPROVIDED);
        }
        return memoization_state.caching_results(results);
    }

    public static SubLObject clear_hl_identity_bindings() {
        final SubLObject cs = $hl_identity_bindings_caching_state$.getGlobalValue();
        if (NIL != cs) {
            memoization_state.caching_state_clear(cs);
        }
        return NIL;
    }

    public static SubLObject remove_hl_identity_bindings(final SubLObject n) {
        return memoization_state.caching_state_remove_function_results_with_args($hl_identity_bindings_caching_state$.getGlobalValue(), list(n), UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject hl_identity_bindings_internal(final SubLObject n) {
        assert NIL != subl_promotions.non_negative_integer_p(n) : "subl_promotions.non_negative_integer_p(n) " + "CommonSymbols.NIL != subl_promotions.non_negative_integer_p(n) " + n;
        if (n.isZero()) {
            return NIL;
        }
        final SubLObject n_1 = number_utilities.f_1_(n);
        final SubLObject variable = variables.find_variable_by_id(n_1);
        return add_variable_binding(variable, variable, hl_identity_bindings(n_1));
    }

    public static SubLObject hl_identity_bindings(final SubLObject n) {
        SubLObject caching_state = $hl_identity_bindings_caching_state$.getGlobalValue();
        if (NIL == caching_state) {
            caching_state = memoization_state.create_global_caching_state_for_name(HL_IDENTITY_BINDINGS, $hl_identity_bindings_caching_state$, NIL, EQL, ONE_INTEGER, TEN_INTEGER);
        }
        SubLObject results = memoization_state.caching_state_lookup(caching_state, n, memoization_state.$memoized_item_not_found$.getGlobalValue());
        if (results.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            results = arg2(resetMultipleValues(), multiple_value_list(hl_identity_bindings_internal(n)));
            memoization_state.caching_state_put(caching_state, n, results, UNPROVIDED);
        }
        return memoization_state.caching_results(results);
    }

    public static SubLObject binding_p(final SubLObject v_object) {
        return consp(v_object);
    }

    public static SubLObject variable_to_variable_binding_p(final SubLObject v_object) {
        if (NIL != binding_p(v_object)) {
            SubLObject a = NIL;
            SubLObject b = NIL;
            destructuring_bind_must_consp(v_object, v_object, $list5);
            a = v_object.first();
            final SubLObject current = b = v_object.rest();
            return makeBoolean((NIL != cycl_variables.cyc_varP(a)) && (NIL != cycl_variables.cyc_varP(b)));
        }
        return NIL;
    }

    public static SubLObject bindings_p(final SubLObject v_object) {
        return binding_list_p(v_object);
    }

    public static SubLObject binding_list_p(final SubLObject v_object) {
        return makeBoolean((NIL != list_utilities.non_dotted_list_p(v_object)) && (NIL != list_utilities.every_in_list(BINDING_P, v_object, UNPROVIDED)));
    }

    public static SubLObject non_empty_binding_list_p(final SubLObject v_object) {
        return makeBoolean((NIL != v_object) && (NIL != binding_list_p(v_object)));
    }

    public static SubLObject binding_lists_p(final SubLObject v_object) {
        return makeBoolean((NIL != list_utilities.non_dotted_list_p(v_object)) && (NIL != list_utilities.every_in_list(BINDING_LIST_P, v_object, UNPROVIDED)));
    }

    public static SubLObject variable_map_p(final SubLObject v_object) {
        return makeBoolean((NIL != binding_list_p(v_object)) && (NIL != list_utilities.every_in_list(VARIABLE_TO_VARIABLE_BINDING_P, v_object, UNPROVIDED)));
    }

    public static SubLObject inference_binding_p(final SubLObject v_object) {
        return makeBoolean((NIL != binding_p(v_object)) && (NIL != cycl_variables.el_varP(variable_binding_variable(v_object))));
    }

    public static SubLObject inference_binding_set_p(final SubLObject v_object) {
        return makeBoolean((NIL == v_object) || ((NIL != list_utilities.non_dotted_list_p(v_object)) && (NIL != list_utilities.every_in_list(symbol_function(INFERENCE_BINDING_P), v_object, UNPROVIDED))));
    }

    public static SubLObject inference_set_of_binding_sets_p(final SubLObject v_object) {
        return makeBoolean((NIL == v_object) || ((NIL != list_utilities.non_dotted_list_p(v_object)) && (NIL != list_utilities.every_in_list(symbol_function(INFERENCE_BINDING_SET_P), v_object, UNPROVIDED))));
    }

    public static SubLObject kb_binding_p(final SubLObject v_object) {
        return makeBoolean((NIL != kb_inference_binding_p(v_object)) || (NIL != kb_the_term_binding_p(v_object)));
    }

    public static SubLObject kb_inference_binding_p(final SubLObject v_object) {
        return makeBoolean((NIL != cycl_utilities.naut_with_functor_p(v_object, $$ELInferenceBindingFn)) && (NIL != cycl_variables.el_varP(cycl_utilities.nat_arg1(v_object, UNPROVIDED))));
    }

    public static SubLObject kb_the_term_binding_p(final SubLObject v_object) {
        return makeBoolean((NIL != cycl_utilities.naut_with_functor_p(v_object, $$TheTermBindingFn)) && (NIL != forts.fort_p(cycl_utilities.nat_arg1(v_object, UNPROVIDED))));
    }

    public static SubLObject kb_binding_set_p(final SubLObject v_object) {
        return makeBoolean((NIL != el_empty_set_p(v_object)) || (((NIL != possibly_naut_p(v_object)) && (NIL != el_extensional_set_p(v_object))) && (NIL != list_utilities.every_in_list(symbol_function(KB_BINDING_P), extensional_set_elements(v_object), UNPROVIDED))));
    }

    public static SubLObject kb_set_of_binding_sets_p(final SubLObject v_object) {
        return makeBoolean((NIL != el_empty_set_p(v_object)) || (((NIL != possibly_naut_p(v_object)) && (NIL != el_extensional_set_p(v_object))) && (NIL != list_utilities.every_in_list(symbol_function(KB_BINDING_SET_P), extensional_set_elements(v_object), UNPROVIDED))));
    }

    public static SubLObject subst_bindings(final SubLObject v_bindings, final SubLObject v_object) {
        return NIL != binding_list_p(v_bindings) ? apply_bindings(v_bindings, v_object) : v_object;
    }

    public static SubLObject equal_bindings(final SubLObject bindings_1, final SubLObject bindings_2) {
        return bindings_equalP(bindings_1, bindings_2);
    }

    public static SubLObject bindings_equalP(final SubLObject bindings_1, final SubLObject bindings_2) {
        return list_utilities.fast_sets_equalP(bindings_1, bindings_2, symbol_function(EQUAL));
    }

    public static SubLObject bindings_equal_modulo_el_var_namesP(final SubLObject bindings_1, final SubLObject bindings_2) {
        return list_utilities.fast_sets_equalP(bindings_1, bindings_2, $sym15$BINDING_EQUAL_MODULO_EL_VAR_NAMES_);
    }

    public static SubLObject binding_equal_modulo_el_var_namesP(final SubLObject binding1, final SubLObject binding2) {
        return makeBoolean(variable_binding_variable(binding1).equal(variable_binding_variable(binding2)) && (NIL != czer_utilities.equal_modulo_el_var_names(variable_binding_value(binding1), variable_binding_value(binding2))));
    }

    public static SubLObject lists_of_binding_lists_equalP(final SubLObject blists_1, final SubLObject blists_2) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if ((NIL != list_utilities.lengthL(blists_1, list_utilities.$magic_hashing_cutoff$.getDynamicValue(thread), UNPROVIDED)) && (NIL != list_utilities.lengthL(blists_2, list_utilities.$magic_hashing_cutoff$.getDynamicValue(thread), UNPROVIDED))) {
            return list_utilities.sets_equalP(blists_1, blists_2, $sym16$BINDINGS_EQUAL_);
        }
        final SubLObject equal_bindings = keyhash_utilities.fast_intersection(blists_1, blists_2, symbol_function(EQUAL), UNPROVIDED, UNPROVIDED);
        final SubLObject diff_1 = list_utilities.fast_set_difference(blists_1, equal_bindings, symbol_function(EQUAL));
        final SubLObject diff_2 = list_utilities.fast_set_difference(blists_2, equal_bindings, symbol_function(EQUAL));
        return list_utilities.sets_equalP(diff_1, diff_2, $sym16$BINDINGS_EQUAL_);
    }

    public static SubLObject compare_lists_of_binding_lists(final SubLObject blists_1, final SubLObject blists_2) {
        final SubLObject equal_bindings = keyhash_utilities.fast_intersection(blists_1, blists_2, symbol_function(EQUAL), UNPROVIDED, UNPROVIDED);
        final SubLObject diff_1 = list_utilities.fast_set_difference(blists_1, equal_bindings, symbol_function(EQUAL));
        final SubLObject diff_2 = list_utilities.fast_set_difference(blists_2, equal_bindings, symbol_function(EQUAL));
        return values(set_difference(diff_1, diff_2, $sym16$BINDINGS_EQUAL_, UNPROVIDED), set_difference(diff_2, diff_1, $sym16$BINDINGS_EQUAL_, UNPROVIDED));
    }

    public static SubLObject variable_bound_p(final SubLObject variable, final SubLObject v_bindings) {
        return list_utilities.sublisp_boolean(get_variable_binding(variable, v_bindings));
    }

    public static SubLObject variable_lookup(final SubLObject variable, final SubLObject v_bindings) {
        return variable_binding_value(get_variable_binding(variable, v_bindings));
    }

    public static SubLObject add_variable_binding(final SubLObject variable, final SubLObject value, final SubLObject v_bindings) {
        return cons(make_variable_binding(variable, value), v_bindings);
    }

    public static SubLObject add_dont_care_variable_binding(final SubLObject variable, final SubLObject v_bindings) {
        return add_variable_binding(variable, $dont_care_variable_binding_value$.getGlobalValue(), v_bindings);
    }

    public static SubLObject make_variable_binding(final SubLObject variable, final SubLObject value) {
        return cons(variable, value);
    }

    public static SubLObject variable_binding_variable(final SubLObject binding) {
        return binding.first();
    }

    public static SubLObject variable_binding_value(final SubLObject binding) {
        return binding.rest();
    }

    public static SubLObject get_variable_binding(final SubLObject variable, final SubLObject v_bindings) {
        return assoc(variable, v_bindings, UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject get_value_binding(final SubLObject value, final SubLObject v_bindings, SubLObject test) {
        if (test == UNPROVIDED) {
            test = symbol_function(EQL);
        }
        return rassoc(value, v_bindings, test, UNPROVIDED);
    }

    public static SubLObject make_variable_bindings(final SubLObject v_variables, final SubLObject values) {
        SubLObject v_bindings = NIL;
        SubLObject variable = NIL;
        SubLObject variable_$1 = NIL;
        SubLObject value = NIL;
        SubLObject value_$2 = NIL;
        variable = v_variables;
        variable_$1 = variable.first();
        value = values;
        value_$2 = value.first();
        while ((NIL != value) || (NIL != variable)) {
            v_bindings = add_variable_binding(variable_$1, value_$2, v_bindings);
            variable = variable.rest();
            variable_$1 = variable.first();
            value = value.rest();
            value_$2 = value.first();
        } 
        return nreverse(v_bindings);
    }

    public static SubLObject bindings_variables(final SubLObject v_bindings) {
        return Mapping.mapcar(VARIABLE_BINDING_VARIABLE, v_bindings);
    }

    public static SubLObject bindings_values(final SubLObject v_bindings) {
        return Mapping.mapcar(VARIABLE_BINDING_VALUE, v_bindings);
    }

    public static SubLObject apply_binding(final SubLObject binding, final SubLObject tree) {
        assert NIL != binding_p(binding) : "bindings.binding_p(binding) " + "CommonSymbols.NIL != bindings.binding_p(binding) " + binding;
        SubLObject variable = NIL;
        SubLObject value = NIL;
        destructuring_bind_must_consp(binding, binding, $list20);
        variable = binding.first();
        final SubLObject current = value = binding.rest();
        return subst(value, variable, tree, UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject apply_bindings(final SubLObject v_bindings, final SubLObject tree) {
        assert NIL != bindings_p(v_bindings) : "bindings.bindings_p(v_bindings) " + "CommonSymbols.NIL != bindings.bindings_p(v_bindings) " + v_bindings;
        return sublis(v_bindings, tree, UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject apply_bindings_to_values(final SubLObject bindings_to_apply, final SubLObject target_bindings) {
        assert NIL != bindings_p(bindings_to_apply) : "bindings.bindings_p(bindings_to_apply) " + "CommonSymbols.NIL != bindings.bindings_p(bindings_to_apply) " + bindings_to_apply;
        assert NIL != bindings_p(target_bindings) : "bindings.bindings_p(target_bindings) " + "CommonSymbols.NIL != bindings.bindings_p(target_bindings) " + target_bindings;
        SubLObject modified_target_bindings = NIL;
        SubLObject cdolist_list_var = target_bindings;
        SubLObject target_binding = NIL;
        target_binding = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            SubLObject current;
            final SubLObject datum = current = target_binding;
            SubLObject variable = NIL;
            SubLObject value = NIL;
            destructuring_bind_must_consp(current, datum, $list20);
            variable = current.first();
            current = value = current.rest();
            final SubLObject modified_value = apply_bindings(bindings_to_apply, value);
            final SubLObject modified_target_binding = make_variable_binding(variable, modified_value);
            modified_target_bindings = cons(modified_target_binding, modified_target_bindings);
            cdolist_list_var = cdolist_list_var.rest();
            target_binding = cdolist_list_var.first();
        } 
        return nreverse(modified_target_bindings);
    }

    public static SubLObject apply_bindings_backwards(final SubLObject v_bindings, final SubLObject tree) {
        assert NIL != bindings_p(v_bindings) : "bindings.bindings_p(v_bindings) " + "CommonSymbols.NIL != bindings.bindings_p(v_bindings) " + v_bindings;
        return subl_promotions.rsublis(v_bindings, tree, UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject apply_bindings_backwards_to_values(final SubLObject bindings_to_apply, final SubLObject target_bindings) {
        assert NIL != bindings_p(bindings_to_apply) : "bindings.bindings_p(bindings_to_apply) " + "CommonSymbols.NIL != bindings.bindings_p(bindings_to_apply) " + bindings_to_apply;
        assert NIL != bindings_p(target_bindings) : "bindings.bindings_p(target_bindings) " + "CommonSymbols.NIL != bindings.bindings_p(target_bindings) " + target_bindings;
        SubLObject modified_target_bindings = NIL;
        SubLObject cdolist_list_var = target_bindings;
        SubLObject target_binding = NIL;
        target_binding = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            SubLObject current;
            final SubLObject datum = current = target_binding;
            SubLObject variable = NIL;
            SubLObject value = NIL;
            destructuring_bind_must_consp(current, datum, $list20);
            variable = current.first();
            current = value = current.rest();
            final SubLObject modified_value = apply_bindings_backwards(bindings_to_apply, value);
            final SubLObject modified_target_binding = make_variable_binding(variable, modified_value);
            modified_target_bindings = cons(modified_target_binding, modified_target_bindings);
            cdolist_list_var = cdolist_list_var.rest();
            target_binding = cdolist_list_var.first();
        } 
        return nreverse(modified_target_bindings);
    }

    public static SubLObject napply_binding(final SubLObject binding, final SubLObject tree) {
        assert NIL != binding_p(binding) : "bindings.binding_p(binding) " + "CommonSymbols.NIL != bindings.binding_p(binding) " + binding;
        SubLObject variable = NIL;
        SubLObject value = NIL;
        destructuring_bind_must_consp(binding, binding, $list20);
        variable = binding.first();
        final SubLObject current = value = binding.rest();
        return nsubst(value, variable, tree, UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject napply_bindings(final SubLObject v_bindings, final SubLObject tree) {
        assert NIL != bindings_p(v_bindings) : "bindings.bindings_p(v_bindings) " + "CommonSymbols.NIL != bindings.bindings_p(v_bindings) " + v_bindings;
        return nsublis(v_bindings, tree, symbol_function(EQ), UNPROVIDED);
    }

    public static SubLObject napply_bindings_backwards(final SubLObject v_bindings, final SubLObject tree) {
        assert NIL != bindings_p(v_bindings) : "bindings.bindings_p(v_bindings) " + "CommonSymbols.NIL != bindings.bindings_p(v_bindings) " + v_bindings;
        return subl_promotions.nrsublis(v_bindings, tree, UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject napply_bindings_backwards_to_list(final SubLObject v_bindings, final SubLObject list) {
        assert NIL != bindings_p(v_bindings) : "bindings.bindings_p(v_bindings) " + "CommonSymbols.NIL != bindings.bindings_p(v_bindings) " + v_bindings;
        SubLObject cons;
        for (cons = NIL, cons = list; !cons.isAtom(); cons = cons.rest()) {
            rplaca(cons, subl_promotions.nrsublis(v_bindings, cons.first(), UNPROVIDED, UNPROVIDED));
        }
        return list;
    }

    public static SubLObject transfer_variable_map_to_bindings(final SubLObject a_to_b_variable_map, final SubLObject a_to_c_bindings) {
        return transfer_variable_map_to_bindings_int(a_to_b_variable_map, a_to_c_bindings, T);
    }

    public static SubLObject transfer_variable_map_to_bindings_filtered(final SubLObject a_to_b_variable_map, final SubLObject a_to_c_bindings) {
        return transfer_variable_map_to_bindings_int(a_to_b_variable_map, a_to_c_bindings, NIL);
    }

    public static SubLObject transfer_variable_map_to_bindings_backwards(final SubLObject b_to_a_variable_map, final SubLObject a_to_c_bindings) {
        return transfer_variable_map_to_bindings(invert_bindings(b_to_a_variable_map), a_to_c_bindings);
    }

    public static SubLObject transfer_variable_map_to_bindings_backwards_filtered(final SubLObject b_to_a_variable_map, final SubLObject a_to_c_bindings) {
        return transfer_variable_map_to_bindings_filtered(invert_bindings(b_to_a_variable_map), a_to_c_bindings);
    }

    public static SubLObject transfer_variable_map_to_bindings_int(final SubLObject a_to_b_variable_map, final SubLObject a_to_c_bindings, final SubLObject error_if_incompleteP) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != variable_map_p(a_to_b_variable_map) : "bindings.variable_map_p(a_to_b_variable_map) " + "CommonSymbols.NIL != bindings.variable_map_p(a_to_b_variable_map) " + a_to_b_variable_map;
        assert NIL != bindings_p(a_to_c_bindings) : "bindings.bindings_p(a_to_c_bindings) " + "CommonSymbols.NIL != bindings.bindings_p(a_to_c_bindings) " + a_to_c_bindings;
        SubLObject result = NIL;
        SubLObject cdolist_list_var = a_to_c_bindings;
        SubLObject a_to_c_binding = NIL;
        a_to_c_binding = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            SubLObject current;
            final SubLObject datum = current = a_to_c_binding;
            SubLObject a_var = NIL;
            SubLObject c_value = NIL;
            destructuring_bind_must_consp(current, datum, $list23);
            a_var = current.first();
            current = c_value = current.rest();
            final SubLObject a_to_b_binding = get_variable_binding(a_var, a_to_b_variable_map);
            if (((NIL != error_if_incompleteP) && (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread))) && (NIL == a_to_b_binding)) {
                Errors.error($str24$Incomplete_variable_map__a_applie, a_to_b_variable_map, a_to_c_bindings);
            }
            if (NIL != a_to_b_binding) {
                final SubLObject b_var = variable_binding_value(a_to_b_binding);
                result = add_variable_binding(b_var, c_value, result);
            }
            cdolist_list_var = cdolist_list_var.rest();
            a_to_c_binding = cdolist_list_var.first();
        } 
        return nreverse(result);
    }

    public static SubLObject compose_bindings(final SubLObject a_to_b_variable_map, final SubLObject b_to_c_bindings) {
        return compose_bindings_int(a_to_b_variable_map, b_to_c_bindings, T);
    }

    public static SubLObject compose_bindings_filtered(final SubLObject a_to_b_variable_map, final SubLObject b_to_c_bindings) {
        return compose_bindings_int(a_to_b_variable_map, b_to_c_bindings, NIL);
    }

    public static SubLObject compose_bindings_int(final SubLObject a_to_b_variable_map, final SubLObject b_to_c_bindings, final SubLObject error_if_incompleteP) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != variable_map_p(a_to_b_variable_map) : "bindings.variable_map_p(a_to_b_variable_map) " + "CommonSymbols.NIL != bindings.variable_map_p(a_to_b_variable_map) " + a_to_b_variable_map;
        assert NIL != bindings_p(b_to_c_bindings) : "bindings.bindings_p(b_to_c_bindings) " + "CommonSymbols.NIL != bindings.bindings_p(b_to_c_bindings) " + b_to_c_bindings;
        SubLObject result = NIL;
        SubLObject cdolist_list_var = b_to_c_bindings;
        SubLObject b_to_c_binding = NIL;
        b_to_c_binding = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            SubLObject current;
            final SubLObject datum = current = b_to_c_binding;
            SubLObject b_var = NIL;
            SubLObject c_value = NIL;
            destructuring_bind_must_consp(current, datum, $list25);
            b_var = current.first();
            current = c_value = current.rest();
            final SubLObject a_to_b_binding = get_value_binding(b_var, a_to_b_variable_map, UNPROVIDED);
            if (((NIL != error_if_incompleteP) && (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread))) && (NIL == a_to_b_binding)) {
                Errors.error($str24$Incomplete_variable_map__a_applie, a_to_b_variable_map, b_to_c_bindings);
            }
            if (NIL != a_to_b_binding) {
                final SubLObject a_var = variable_binding_variable(a_to_b_binding);
                result = add_variable_binding(a_var, c_value, result);
            }
            cdolist_list_var = cdolist_list_var.rest();
            b_to_c_binding = cdolist_list_var.first();
        } 
        return nreverse(result);
    }

    public static SubLObject invert_bindings(final SubLObject v_bindings) {
        return list_utilities.flip_alist(v_bindings);
    }

    public static SubLObject filter_bindings_by_variables(final SubLObject v_bindings, final SubLObject variable_keep_list) {
        SubLObject filtered_bindings = NIL;
        SubLObject cdolist_list_var = v_bindings;
        SubLObject binding = NIL;
        binding = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            SubLObject current;
            final SubLObject datum = current = binding;
            SubLObject variable = NIL;
            SubLObject value = NIL;
            destructuring_bind_must_consp(current, datum, $list20);
            variable = current.first();
            current = value = current.rest();
            if (NIL != subl_promotions.memberP(variable, variable_keep_list, UNPROVIDED, UNPROVIDED)) {
                filtered_bindings = cons(make_variable_binding(variable, value), filtered_bindings);
            }
            cdolist_list_var = cdolist_list_var.rest();
            binding = cdolist_list_var.first();
        } 
        filtered_bindings = nreverse(filtered_bindings);
        return filtered_bindings;
    }

    public static SubLObject inference_simplify_unification_bindings(SubLObject v_bindings) {
        if (NIL != find_if(INFERENCE_BINDING_P, v_bindings, UNPROVIDED, UNPROVIDED, UNPROVIDED)) {
            v_bindings = remove_if(INFERENCE_BINDING_P, v_bindings, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        }
        if (NIL != unification_success_token_p(v_bindings)) {
            v_bindings = NIL;
        }
        return v_bindings;
    }

    public static SubLObject possibly_optimize_bindings_wrt_equivalence(SubLObject old_bindings) {
        if ((NIL == old_bindings) || (NIL != list_utilities.singletonP(old_bindings))) {
            return old_bindings;
        }
        while (true) {
            SubLObject new_bindings = NIL;
            SubLObject cdolist_list_var = old_bindings;
            SubLObject binding = NIL;
            binding = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                final SubLObject old_value = variable_binding_value(binding);
                if (NIL == variables.fully_bound_p(old_value)) {
                    final SubLObject new_value = apply_bindings_backwards(old_bindings, old_value);
                    final SubLObject variable = variable_binding_variable(binding);
                    if ((NIL == list_utilities.simple_tree_findP(variable, new_value)) && (!new_value.equal(old_value))) {
                        binding = make_variable_binding(variable, new_value);
                    }
                }
                new_bindings = cons(binding, new_bindings);
                cdolist_list_var = cdolist_list_var.rest();
                binding = cdolist_list_var.first();
            } 
            new_bindings = nreverse(new_bindings);
            if (new_bindings.equal(old_bindings)) {
                break;
            }
            old_bindings = new_bindings;
        } 
        return old_bindings;
    }

    public static SubLObject possibly_stitch_up_bindings_loop(final SubLObject v_bindings) {
        SubLObject cdolist_list_var = v_bindings;
        SubLObject binding = NIL;
        binding = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if (NIL != loopy_bindingP(binding, v_bindings)) {
                return stitch_up_loopy_binding(v_bindings, binding);
            }
            cdolist_list_var = cdolist_list_var.rest();
            binding = cdolist_list_var.first();
        } 
        return v_bindings;
    }

    public static SubLObject loopy_bindingP(final SubLObject potentially_loopy_binding, final SubLObject v_bindings) {
        SubLObject potentially_loopy_variable = NIL;
        SubLObject potentially_loopy_value = NIL;
        destructuring_bind_must_consp(potentially_loopy_binding, potentially_loopy_binding, $list26);
        potentially_loopy_variable = potentially_loopy_binding.first();
        final SubLObject current = potentially_loopy_value = potentially_loopy_binding.rest();
        if (NIL != unification.base_variable_p(potentially_loopy_variable)) {
            SubLObject cdolist_list_var = v_bindings;
            SubLObject binding = NIL;
            binding = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                final SubLObject var = variable_binding_variable(binding);
                if (NIL != list_utilities.simple_tree_findP(var, potentially_loopy_value)) {
                    return T;
                }
                cdolist_list_var = cdolist_list_var.rest();
                binding = cdolist_list_var.first();
            } 
        }
        return NIL;
    }

    public static SubLObject stitch_up_loopy_binding(final SubLObject v_bindings, final SubLObject loopy_binding) {
        SubLObject new_bindings = NIL;
        SubLObject cdolist_list_var = v_bindings;
        SubLObject binding = NIL;
        binding = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if (binding.eql(loopy_binding)) {
                SubLObject current;
                final SubLObject datum = current = binding;
                SubLObject var = NIL;
                SubLObject loopy_value = NIL;
                destructuring_bind_must_consp(current, datum, $list27);
                var = current.first();
                current = loopy_value = current.rest();
                final SubLObject stitched_value = apply_bindings(v_bindings, loopy_value);
                final SubLObject stitched_binding = make_variable_binding(var, stitched_value);
                new_bindings = cons(stitched_binding, new_bindings);
            } else {
                new_bindings = cons(binding, new_bindings);
            }
            cdolist_list_var = cdolist_list_var.rest();
            binding = cdolist_list_var.first();
        } 
        return nreverse(new_bindings);
    }

    public static SubLObject bindings_to_closed(final SubLObject v_bindings) {
        return list_utilities.remove_if_not(symbol_function(FULLY_BOUND_P), v_bindings, symbol_function(VARIABLE_BINDING_VALUE), UNPROVIDED, UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject stable_sort_bindings(final SubLObject v_bindings, final SubLObject v_variables) {
        return list_utilities.stable_sort_via_position(v_bindings, v_variables, symbol_function(EQ), symbol_function(VARIABLE_BINDING_VARIABLE));
    }

    public static SubLObject remove_dummy_binding(final SubLObject v_bindings) {
        assert NIL != listp(v_bindings) : "Types.listp(v_bindings) " + "CommonSymbols.NIL != Types.listp(v_bindings) " + v_bindings;
        if (NIL != list_utilities.singletonP(v_bindings)) {
            return v_bindings;
        }
        return remove($dummy_binding$.getGlobalValue(), v_bindings, symbol_function(EQUAL), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject delete_dummy_binding(final SubLObject v_bindings) {
        assert NIL != listp(v_bindings) : "Types.listp(v_bindings) " + "CommonSymbols.NIL != Types.listp(v_bindings) " + v_bindings;
        if (NIL != list_utilities.singletonP(v_bindings)) {
            return v_bindings;
        }
        return delete($dummy_binding$.getGlobalValue(), v_bindings, symbol_function(EQUAL), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject tree_find_dummy_bindingP(final SubLObject tree) {
        return list_utilities.sublisp_boolean(list_utilities.tree_find($dummy_binding$.getGlobalValue(), tree, symbol_function(EQUAL), UNPROVIDED));
    }

    public static SubLObject unification_success_token() {
        return $unification_success_token$.getGlobalValue();
    }

    public static SubLObject unification_success_token_p(final SubLObject v_bindings) {
        return equal(v_bindings, $unification_success_token$.getGlobalValue());
    }

    public static SubLObject variables_with_conflicting_bindings(final SubLObject bindings1, final SubLObject bindings2) {
        assert NIL != listp(bindings1) : "Types.listp(bindings1) " + "CommonSymbols.NIL != Types.listp(bindings1) " + bindings1;
        assert NIL != listp(bindings2) : "Types.listp(bindings2) " + "CommonSymbols.NIL != Types.listp(bindings2) " + bindings2;
        SubLObject conflicting_variables = NIL;
        SubLObject cdolist_list_var = bindings1;
        SubLObject binding = NIL;
        binding = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            final SubLObject variable = variable_binding_variable(binding);
            if ((NIL != variable_bound_p(variable, bindings2)) && (!variable_binding_value(binding).equal(variable_lookup(variable, bindings2)))) {
                final SubLObject item_var = variable;
                if (NIL == member(item_var, conflicting_variables, symbol_function(EQL), symbol_function(IDENTITY))) {
                    conflicting_variables = cons(item_var, conflicting_variables);
                }
            }
            cdolist_list_var = cdolist_list_var.rest();
            binding = cdolist_list_var.first();
        } 
        return conflicting_variables;
    }

    public static SubLObject some_variable_with_conflicting_bindings(final SubLObject bindings1, final SubLObject bindings2) {
        assert NIL != listp(bindings1) : "Types.listp(bindings1) " + "CommonSymbols.NIL != Types.listp(bindings1) " + bindings1;
        assert NIL != listp(bindings2) : "Types.listp(bindings2) " + "CommonSymbols.NIL != Types.listp(bindings2) " + bindings2;
        SubLObject conflict_foundP = NIL;
        if (NIL == conflict_foundP) {
            SubLObject csome_list_var = bindings1;
            SubLObject binding = NIL;
            binding = csome_list_var.first();
            while ((NIL == conflict_foundP) && (NIL != csome_list_var)) {
                final SubLObject variable = variable_binding_variable(binding);
                if ((NIL != variable_bound_p(variable, bindings2)) && (!variable_binding_value(binding).equal(variable_lookup(variable, bindings2)))) {
                    conflict_foundP = T;
                }
                csome_list_var = csome_list_var.rest();
                binding = csome_list_var.first();
            } 
        }
        return conflict_foundP;
    }

    public static SubLObject inferencify_kb_set_of_binding_sets(final SubLObject kb_set_of_binding_sets) {
        assert NIL != kb_set_of_binding_sets_p(kb_set_of_binding_sets) : "bindings.kb_set_of_binding_sets_p(kb_set_of_binding_sets) " + "CommonSymbols.NIL != bindings.kb_set_of_binding_sets_p(kb_set_of_binding_sets) " + kb_set_of_binding_sets;
        if (NIL != el_empty_set_p(kb_set_of_binding_sets)) {
            return NIL;
        }
        return inferencify_kb_set_of_binding_sets_internal(extensional_set_elements(kb_set_of_binding_sets));
    }

    public static SubLObject inferencify_kb_set_of_binding_sets_internal(final SubLObject kb_set_of_binding_sets_args) {
        if (NIL == kb_set_of_binding_sets_args) {
            return NIL;
        }
        return cons(inferencify_kb_binding_set(kb_set_of_binding_sets_args.first()), inferencify_kb_set_of_binding_sets_internal(kb_set_of_binding_sets_args.rest()));
    }

    public static SubLObject inferencify_kb_binding_set(final SubLObject kb_binding_set) {
        assert NIL != kb_binding_set_p(kb_binding_set) : "bindings.kb_binding_set_p(kb_binding_set) " + "CommonSymbols.NIL != bindings.kb_binding_set_p(kb_binding_set) " + kb_binding_set;
        if (NIL != el_empty_set_p(kb_binding_set)) {
            return NIL;
        }
        return inferencify_kb_binding_set_internal(extensional_set_elements(kb_binding_set));
    }

    public static SubLObject inferencify_kb_binding_set_internal(final SubLObject kb_binding_set_args) {
        if (NIL == kb_binding_set_args) {
            return NIL;
        }
        return cons(inferencify_kb_binding(kb_binding_set_args.first()), inferencify_kb_binding_set_internal(kb_binding_set_args.rest()));
    }

    public static SubLObject inferencify_kb_binding(final SubLObject kb_binding) {
        assert NIL != kb_binding_p(kb_binding) : "bindings.kb_binding_p(kb_binding) " + "CommonSymbols.NIL != bindings.kb_binding_p(kb_binding) " + kb_binding;
        SubLObject var = cycl_utilities.nat_arg1(kb_binding, UNPROVIDED);
        final SubLObject value = cycl_utilities.nat_arg2(kb_binding, UNPROVIDED);
        if (NIL != forts.fort_p(var)) {
            var = czer_main.canonicalize_term(var, UNPROVIDED);
        }
        return make_variable_binding(var, czer_main.canonicalize_term(value, UNPROVIDED));
    }

    public static SubLObject kbify_set_of_binding_sets(final SubLObject set_of_binding_sets) {
        assert NIL != binding_lists_p(set_of_binding_sets) : "bindings.binding_lists_p(set_of_binding_sets) " + "CommonSymbols.NIL != bindings.binding_lists_p(set_of_binding_sets) " + set_of_binding_sets;
        return make_kb_set_of_binding_sets(kbify_set_of_binding_sets_internal(set_of_binding_sets));
    }

    public static SubLObject kbify_set_of_binding_sets_internal(final SubLObject set_of_binding_sets) {
        if (NIL == set_of_binding_sets) {
            return NIL;
        }
        return cons(kbify_binding_set(set_of_binding_sets.first()), kbify_set_of_binding_sets_internal(set_of_binding_sets.rest()));
    }

    public static SubLObject kbify_binding_set(final SubLObject binding_set) {
        assert NIL != binding_list_p(binding_set) : "bindings.binding_list_p(binding_set) " + "CommonSymbols.NIL != bindings.binding_list_p(binding_set) " + binding_set;
        return make_kb_binding_set(kbify_binding_set_internal(binding_set));
    }

    public static SubLObject kbify_binding_set_internal(final SubLObject binding_set) {
        if (NIL == binding_set) {
            return NIL;
        }
        return cons(kbify_binding(binding_set.first()), kbify_binding_set_internal(binding_set.rest()));
    }

    public static SubLObject kbify_binding(final SubLObject binding) {
        assert NIL != binding_p(binding) : "bindings.binding_p(binding) " + "CommonSymbols.NIL != bindings.binding_p(binding) " + binding;
        SubLObject var = NIL;
        SubLObject value = NIL;
        destructuring_bind_must_consp(binding, binding, $list33);
        var = binding.first();
        final SubLObject current = value = binding.rest();
        return make_kb_binding(var, value);
    }

    public static SubLObject kbify_inference_set_of_binding_sets(final SubLObject inference_set_of_binding_sets) {
        assert NIL != inference_set_of_binding_sets_p(inference_set_of_binding_sets) : "bindings.inference_set_of_binding_sets_p(inference_set_of_binding_sets) " + "CommonSymbols.NIL != bindings.inference_set_of_binding_sets_p(inference_set_of_binding_sets) " + inference_set_of_binding_sets;
        return kbify_set_of_binding_sets(inference_set_of_binding_sets);
    }

    public static SubLObject kbify_inference_binding_set(final SubLObject inference_binding_set) {
        assert NIL != inference_binding_set_p(inference_binding_set) : "bindings.inference_binding_set_p(inference_binding_set) " + "CommonSymbols.NIL != bindings.inference_binding_set_p(inference_binding_set) " + inference_binding_set;
        return kbify_binding_set(inference_binding_set);
    }

    public static SubLObject kbify_inference_binding(final SubLObject inference_binding) {
        assert NIL != inference_binding_p(inference_binding) : "bindings.inference_binding_p(inference_binding) " + "CommonSymbols.NIL != bindings.inference_binding_p(inference_binding) " + inference_binding;
        return kbify_binding(inference_binding);
    }

    public static SubLObject kb_binding_variable(final SubLObject kb_binding) {
        assert NIL != kb_binding_p(kb_binding) : "bindings.kb_binding_p(kb_binding) " + "CommonSymbols.NIL != bindings.kb_binding_p(kb_binding) " + kb_binding;
        return cycl_utilities.nat_arg1(kb_binding, UNPROVIDED);
    }

    public static SubLObject kb_binding_value(final SubLObject kb_binding) {
        assert NIL != kb_binding_p(kb_binding) : "bindings.kb_binding_p(kb_binding) " + "CommonSymbols.NIL != bindings.kb_binding_p(kb_binding) " + kb_binding;
        return cycl_utilities.nat_arg2(kb_binding, UNPROVIDED);
    }

    public static SubLObject kb_binding_set_variables(final SubLObject kb_binding_set) {
        assert NIL != kb_binding_set_p(kb_binding_set) : "bindings.kb_binding_set_p(kb_binding_set) " + "CommonSymbols.NIL != bindings.kb_binding_set_p(kb_binding_set) " + kb_binding_set;
        return Mapping.mapcar(symbol_function(KB_BINDING_VARIABLE), extensional_set_elements(kb_binding_set));
    }

    public static SubLObject kb_binding_set_values(final SubLObject kb_binding_set) {
        assert NIL != kb_binding_set_p(kb_binding_set) : "bindings.kb_binding_set_p(kb_binding_set) " + "CommonSymbols.NIL != bindings.kb_binding_set_p(kb_binding_set) " + kb_binding_set;
        return Mapping.mapcar(symbol_function(KB_BINDING_VALUE), extensional_set_elements(kb_binding_set));
    }

    public static SubLObject kb_binding_set_value_for_variable(final SubLObject kb_binding_set, final SubLObject variable) {
        assert NIL != kb_binding_set_p(kb_binding_set) : "bindings.kb_binding_set_p(kb_binding_set) " + "CommonSymbols.NIL != bindings.kb_binding_set_p(kb_binding_set) " + kb_binding_set;
        assert NIL != cycl_variables.el_varP(variable) : "cycl_variables.el_varP(variable) " + "CommonSymbols.NIL != cycl_variables.el_varP(variable) " + variable;
        SubLObject value = NIL;
        if (NIL == value) {
            SubLObject csome_list_var = extensional_set_elements(kb_binding_set);
            SubLObject kb_binding = NIL;
            kb_binding = csome_list_var.first();
            while ((NIL == value) && (NIL != csome_list_var)) {
                if (kb_binding_variable(kb_binding).eql(variable)) {
                    value = kb_binding_value(kb_binding);
                }
                csome_list_var = csome_list_var.rest();
                kb_binding = csome_list_var.first();
            } 
        }
        return value;
    }

    public static SubLObject kb_set_of_binding_sets_values(final SubLObject kb_set_of_binding_sets) {
        assert NIL != kb_set_of_binding_sets_p(kb_set_of_binding_sets) : "bindings.kb_set_of_binding_sets_p(kb_set_of_binding_sets) " + "CommonSymbols.NIL != bindings.kb_set_of_binding_sets_p(kb_set_of_binding_sets) " + kb_set_of_binding_sets;
        return Mapping.mapcar(symbol_function(KB_BINDING_SET_VALUES), extensional_set_elements(kb_set_of_binding_sets));
    }

    public static SubLObject kb_set_of_binding_sets_size(final SubLObject kb_set_of_binding_sets) {
        assert NIL != kb_set_of_binding_sets_p(kb_set_of_binding_sets) : "bindings.kb_set_of_binding_sets_p(kb_set_of_binding_sets) " + "CommonSymbols.NIL != bindings.kb_set_of_binding_sets_p(kb_set_of_binding_sets) " + kb_set_of_binding_sets;
        return length(kb_set_of_binding_sets_binding_sets(kb_set_of_binding_sets));
    }

    public static SubLObject kb_set_of_binding_sets_binding_sets(final SubLObject kb_set_of_binding_sets) {
        assert NIL != kb_set_of_binding_sets_p(kb_set_of_binding_sets) : "bindings.kb_set_of_binding_sets_p(kb_set_of_binding_sets) " + "CommonSymbols.NIL != bindings.kb_set_of_binding_sets_p(kb_set_of_binding_sets) " + kb_set_of_binding_sets;
        return extensional_set_elements(kb_set_of_binding_sets);
    }

    public static SubLObject make_kb_binding(final SubLObject variable, final SubLObject value) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) && (NIL == cycl_variables.el_varP(variable))) && (NIL == forts.fort_p(variable))) {
            Errors.error($str39$_A_is_neither_EL_VAR__nor_FORT_P_, variable);
        }
        if (NIL != cycl_variables.el_varP(variable)) {
            return make_inference_kb_binding(variable, value);
        }
        return make_the_term_kb_binding(variable, value);
    }

    public static SubLObject make_inference_kb_binding(final SubLObject variable, final SubLObject value) {
        assert NIL != cycl_variables.el_varP(variable) : "cycl_variables.el_varP(variable) " + "CommonSymbols.NIL != cycl_variables.el_varP(variable) " + variable;
        return make_el_formula($$ELInferenceBindingFn, list(variable, value), UNPROVIDED);
    }

    public static SubLObject make_the_term_kb_binding(final SubLObject the_term, final SubLObject value) {
        assert NIL != forts.fort_p(the_term) : "forts.fort_p(the_term) " + "CommonSymbols.NIL != forts.fort_p(the_term) " + the_term;
        return make_el_formula($$TheTermBindingFn, list(the_term, value), UNPROVIDED);
    }

    public static SubLObject make_kb_binding_set(final SubLObject v_bindings) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if ((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) && (NIL == list_utilities.every_in_list(KB_BINDING_P, v_bindings, UNPROVIDED))) {
            Errors.error($str41$Some_element_of__A_is_not_a_KB_BI, v_bindings);
        }
        return make_el_extensional_set(v_bindings);
    }

    public static SubLObject make_kb_set_of_binding_sets(final SubLObject binding_sets) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if ((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) && (NIL == list_utilities.every_in_list(KB_BINDING_SET_P, binding_sets, UNPROVIDED))) {
            Errors.error($str42$Some_element_of__A_is_not_a_KB_BI, binding_sets);
        }
        return make_el_extensional_set(binding_sets);
    }

    public static SubLObject no_answers_kb_set_of_binding_sets() {
        return make_kb_set_of_binding_sets(NIL);
    }

    public static SubLObject proven_kb_binding_set() {
        return make_kb_binding_set(NIL);
    }

    public static SubLObject proven_kb_set_of_binding_sets() {
        return make_kb_set_of_binding_sets(list(make_kb_binding_set(NIL)));
    }

    public static SubLObject test_kbified_set_of_binding_sets(final SubLObject input, final SubLObject output) {
        return czer_utilities.equals_elP(input, output, UNPROVIDED, UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject declare_bindings_file() {
        declareFunction(me, "clear_hl_identity_binding", "CLEAR-HL-IDENTITY-BINDING", 0, 0, false);
        declareFunction(me, "remove_hl_identity_binding", "REMOVE-HL-IDENTITY-BINDING", 1, 0, false);
        declareFunction(me, "hl_identity_binding_internal", "HL-IDENTITY-BINDING-INTERNAL", 1, 0, false);
        declareFunction(me, "hl_identity_binding", "HL-IDENTITY-BINDING", 1, 0, false);
        declareFunction(me, "clear_hl_identity_bindings", "CLEAR-HL-IDENTITY-BINDINGS", 0, 0, false);
        declareFunction(me, "remove_hl_identity_bindings", "REMOVE-HL-IDENTITY-BINDINGS", 1, 0, false);
        declareFunction(me, "hl_identity_bindings_internal", "HL-IDENTITY-BINDINGS-INTERNAL", 1, 0, false);
        declareFunction(me, "hl_identity_bindings", "HL-IDENTITY-BINDINGS", 1, 0, false);
        declareFunction(me, "binding_p", "BINDING-P", 1, 0, false);
        new bindings.$binding_p$UnaryFunction();
        declareFunction(me, "variable_to_variable_binding_p", "VARIABLE-TO-VARIABLE-BINDING-P", 1, 0, false);
        declareFunction(me, "bindings_p", "BINDINGS-P", 1, 0, false);
        declareFunction(me, "binding_list_p", "BINDING-LIST-P", 1, 0, false);
        declareFunction(me, "non_empty_binding_list_p", "NON-EMPTY-BINDING-LIST-P", 1, 0, false);
        declareFunction(me, "binding_lists_p", "BINDING-LISTS-P", 1, 0, false);
        declareFunction(me, "variable_map_p", "VARIABLE-MAP-P", 1, 0, false);
        declareFunction(me, "inference_binding_p", "INFERENCE-BINDING-P", 1, 0, false);
        new bindings.$inference_binding_p$UnaryFunction();
        declareFunction(me, "inference_binding_set_p", "INFERENCE-BINDING-SET-P", 1, 0, false);
        declareFunction(me, "inference_set_of_binding_sets_p", "INFERENCE-SET-OF-BINDING-SETS-P", 1, 0, false);
        declareFunction(me, "kb_binding_p", "KB-BINDING-P", 1, 0, false);
        declareFunction(me, "kb_inference_binding_p", "KB-INFERENCE-BINDING-P", 1, 0, false);
        declareFunction(me, "kb_the_term_binding_p", "KB-THE-TERM-BINDING-P", 1, 0, false);
        declareFunction(me, "kb_binding_set_p", "KB-BINDING-SET-P", 1, 0, false);
        declareFunction(me, "kb_set_of_binding_sets_p", "KB-SET-OF-BINDING-SETS-P", 1, 0, false);
        declareFunction(me, "subst_bindings", "SUBST-BINDINGS", 2, 0, false);
        new bindings.$subst_bindings$BinaryFunction();
        declareFunction(me, "equal_bindings", "EQUAL-BINDINGS", 2, 0, false);
        declareFunction(me, "bindings_equalP", "BINDINGS-EQUAL?", 2, 0, false);
        declareFunction(me, "bindings_equal_modulo_el_var_namesP", "BINDINGS-EQUAL-MODULO-EL-VAR-NAMES?", 2, 0, false);
        declareFunction(me, "binding_equal_modulo_el_var_namesP", "BINDING-EQUAL-MODULO-EL-VAR-NAMES?", 2, 0, false);
        declareFunction(me, "lists_of_binding_lists_equalP", "LISTS-OF-BINDING-LISTS-EQUAL?", 2, 0, false);
        declareFunction(me, "compare_lists_of_binding_lists", "COMPARE-LISTS-OF-BINDING-LISTS", 2, 0, false);
        declareFunction(me, "variable_bound_p", "VARIABLE-BOUND-P", 2, 0, false);
        declareFunction(me, "variable_lookup", "VARIABLE-LOOKUP", 2, 0, false);
        declareFunction(me, "add_variable_binding", "ADD-VARIABLE-BINDING", 3, 0, false);
        declareFunction(me, "add_dont_care_variable_binding", "ADD-DONT-CARE-VARIABLE-BINDING", 2, 0, false);
        declareFunction(me, "make_variable_binding", "MAKE-VARIABLE-BINDING", 2, 0, false);
        declareFunction(me, "variable_binding_variable", "VARIABLE-BINDING-VARIABLE", 1, 0, false);
        new bindings.$variable_binding_variable$UnaryFunction();
        declareFunction(me, "variable_binding_value", "VARIABLE-BINDING-VALUE", 1, 0, false);
        new bindings.$variable_binding_value$UnaryFunction();
        declareFunction(me, "get_variable_binding", "GET-VARIABLE-BINDING", 2, 0, false);
        declareFunction(me, "get_value_binding", "GET-VALUE-BINDING", 2, 1, false);
        declareFunction(me, "make_variable_bindings", "MAKE-VARIABLE-BINDINGS", 2, 0, false);
        declareFunction(me, "bindings_variables", "BINDINGS-VARIABLES", 1, 0, false);
        declareFunction(me, "bindings_values", "BINDINGS-VALUES", 1, 0, false);
        declareFunction(me, "apply_binding", "APPLY-BINDING", 2, 0, false);
        declareFunction(me, "apply_bindings", "APPLY-BINDINGS", 2, 0, false);
        declareFunction(me, "apply_bindings_to_values", "APPLY-BINDINGS-TO-VALUES", 2, 0, false);
        declareFunction(me, "apply_bindings_backwards", "APPLY-BINDINGS-BACKWARDS", 2, 0, false);
        declareFunction(me, "apply_bindings_backwards_to_values", "APPLY-BINDINGS-BACKWARDS-TO-VALUES", 2, 0, false);
        declareFunction(me, "napply_binding", "NAPPLY-BINDING", 2, 0, false);
        declareFunction(me, "napply_bindings", "NAPPLY-BINDINGS", 2, 0, false);
        declareFunction(me, "napply_bindings_backwards", "NAPPLY-BINDINGS-BACKWARDS", 2, 0, false);
        declareFunction(me, "napply_bindings_backwards_to_list", "NAPPLY-BINDINGS-BACKWARDS-TO-LIST", 2, 0, false);
        declareFunction(me, "transfer_variable_map_to_bindings", "TRANSFER-VARIABLE-MAP-TO-BINDINGS", 2, 0, false);
        declareFunction(me, "transfer_variable_map_to_bindings_filtered", "TRANSFER-VARIABLE-MAP-TO-BINDINGS-FILTERED", 2, 0, false);
        declareFunction(me, "transfer_variable_map_to_bindings_backwards", "TRANSFER-VARIABLE-MAP-TO-BINDINGS-BACKWARDS", 2, 0, false);
        declareFunction(me, "transfer_variable_map_to_bindings_backwards_filtered", "TRANSFER-VARIABLE-MAP-TO-BINDINGS-BACKWARDS-FILTERED", 2, 0, false);
        declareFunction(me, "transfer_variable_map_to_bindings_int", "TRANSFER-VARIABLE-MAP-TO-BINDINGS-INT", 3, 0, false);
        declareFunction(me, "compose_bindings", "COMPOSE-BINDINGS", 2, 0, false);
        declareFunction(me, "compose_bindings_filtered", "COMPOSE-BINDINGS-FILTERED", 2, 0, false);
        declareFunction(me, "compose_bindings_int", "COMPOSE-BINDINGS-INT", 3, 0, false);
        declareFunction(me, "invert_bindings", "INVERT-BINDINGS", 1, 0, false);
        declareFunction(me, "filter_bindings_by_variables", "FILTER-BINDINGS-BY-VARIABLES", 2, 0, false);
        declareFunction(me, "inference_simplify_unification_bindings", "INFERENCE-SIMPLIFY-UNIFICATION-BINDINGS", 1, 0, false);
        declareFunction(me, "possibly_optimize_bindings_wrt_equivalence", "POSSIBLY-OPTIMIZE-BINDINGS-WRT-EQUIVALENCE", 1, 0, false);
        declareFunction(me, "possibly_stitch_up_bindings_loop", "POSSIBLY-STITCH-UP-BINDINGS-LOOP", 1, 0, false);
        declareFunction(me, "loopy_bindingP", "LOOPY-BINDING?", 2, 0, false);
        declareFunction(me, "stitch_up_loopy_binding", "STITCH-UP-LOOPY-BINDING", 2, 0, false);
        declareFunction(me, "bindings_to_closed", "BINDINGS-TO-CLOSED", 1, 0, false);
        declareFunction(me, "stable_sort_bindings", "STABLE-SORT-BINDINGS", 2, 0, false);
        declareFunction(me, "remove_dummy_binding", "REMOVE-DUMMY-BINDING", 1, 0, false);
        declareFunction(me, "delete_dummy_binding", "DELETE-DUMMY-BINDING", 1, 0, false);
        declareFunction(me, "tree_find_dummy_bindingP", "TREE-FIND-DUMMY-BINDING?", 1, 0, false);
        declareFunction(me, "unification_success_token", "UNIFICATION-SUCCESS-TOKEN", 0, 0, false);
        declareFunction(me, "unification_success_token_p", "UNIFICATION-SUCCESS-TOKEN-P", 1, 0, false);
        declareFunction(me, "variables_with_conflicting_bindings", "VARIABLES-WITH-CONFLICTING-BINDINGS", 2, 0, false);
        declareFunction(me, "some_variable_with_conflicting_bindings", "SOME-VARIABLE-WITH-CONFLICTING-BINDINGS", 2, 0, false);
        declareFunction(me, "inferencify_kb_set_of_binding_sets", "INFERENCIFY-KB-SET-OF-BINDING-SETS", 1, 0, false);
        declareFunction(me, "inferencify_kb_set_of_binding_sets_internal", "INFERENCIFY-KB-SET-OF-BINDING-SETS-INTERNAL", 1, 0, false);
        declareFunction(me, "inferencify_kb_binding_set", "INFERENCIFY-KB-BINDING-SET", 1, 0, false);
        declareFunction(me, "inferencify_kb_binding_set_internal", "INFERENCIFY-KB-BINDING-SET-INTERNAL", 1, 0, false);
        declareFunction(me, "inferencify_kb_binding", "INFERENCIFY-KB-BINDING", 1, 0, false);
        declareFunction(me, "kbify_set_of_binding_sets", "KBIFY-SET-OF-BINDING-SETS", 1, 0, false);
        declareFunction(me, "kbify_set_of_binding_sets_internal", "KBIFY-SET-OF-BINDING-SETS-INTERNAL", 1, 0, false);
        declareFunction(me, "kbify_binding_set", "KBIFY-BINDING-SET", 1, 0, false);
        declareFunction(me, "kbify_binding_set_internal", "KBIFY-BINDING-SET-INTERNAL", 1, 0, false);
        declareFunction(me, "kbify_binding", "KBIFY-BINDING", 1, 0, false);
        declareFunction(me, "kbify_inference_set_of_binding_sets", "KBIFY-INFERENCE-SET-OF-BINDING-SETS", 1, 0, false);
        declareFunction(me, "kbify_inference_binding_set", "KBIFY-INFERENCE-BINDING-SET", 1, 0, false);
        declareFunction(me, "kbify_inference_binding", "KBIFY-INFERENCE-BINDING", 1, 0, false);
        declareFunction(me, "kb_binding_variable", "KB-BINDING-VARIABLE", 1, 0, false);
        declareFunction(me, "kb_binding_value", "KB-BINDING-VALUE", 1, 0, false);
        declareFunction(me, "kb_binding_set_variables", "KB-BINDING-SET-VARIABLES", 1, 0, false);
        declareFunction(me, "kb_binding_set_values", "KB-BINDING-SET-VALUES", 1, 0, false);
        declareFunction(me, "kb_binding_set_value_for_variable", "KB-BINDING-SET-VALUE-FOR-VARIABLE", 2, 0, false);
        declareFunction(me, "kb_set_of_binding_sets_values", "KB-SET-OF-BINDING-SETS-VALUES", 1, 0, false);
        declareFunction(me, "kb_set_of_binding_sets_size", "KB-SET-OF-BINDING-SETS-SIZE", 1, 0, false);
        declareFunction(me, "kb_set_of_binding_sets_binding_sets", "KB-SET-OF-BINDING-SETS-BINDING-SETS", 1, 0, false);
        declareFunction(me, "make_kb_binding", "MAKE-KB-BINDING", 2, 0, false);
        declareFunction(me, "make_inference_kb_binding", "MAKE-INFERENCE-KB-BINDING", 2, 0, false);
        declareFunction(me, "make_the_term_kb_binding", "MAKE-THE-TERM-KB-BINDING", 2, 0, false);
        declareFunction(me, "make_kb_binding_set", "MAKE-KB-BINDING-SET", 1, 0, false);
        declareFunction(me, "make_kb_set_of_binding_sets", "MAKE-KB-SET-OF-BINDING-SETS", 1, 0, false);
        declareFunction(me, "no_answers_kb_set_of_binding_sets", "NO-ANSWERS-KB-SET-OF-BINDING-SETS", 0, 0, false);
        declareFunction(me, "proven_kb_binding_set", "PROVEN-KB-BINDING-SET", 0, 0, false);
        declareFunction(me, "proven_kb_set_of_binding_sets", "PROVEN-KB-SET-OF-BINDING-SETS", 0, 0, false);
        declareFunction(me, "test_kbified_set_of_binding_sets", "TEST-KBIFIED-SET-OF-BINDING-SETS", 2, 0, false);
        return NIL;
    }

    public static SubLObject init_bindings_file() {
        deflexical("*HL-IDENTITY-BINDING-CACHING-STATE*", NIL);
        deflexical("*HL-IDENTITY-BINDINGS-CACHING-STATE*", NIL);
        defconstant("*DONT-CARE-VARIABLE-BINDING-VALUE*", $DONT_CARE);
        deflexical("*DUMMY-BINDING*", SubLSystemTrampolineFile.maybeDefault($dummy_binding$, $dummy_binding$, () -> make_variable_binding(T, T)));
        deflexical("*UNIFICATION-SUCCESS-TOKEN*", list($dummy_binding$.getGlobalValue()));
        return NIL;
    }

    public static SubLObject setup_bindings_file() {
        memoization_state.note_globally_cached_function(HL_IDENTITY_BINDING);
        memoization_state.note_globally_cached_function(HL_IDENTITY_BINDINGS);
        declare_defglobal($dummy_binding$);
        define_test_case_table_int(TRANSFER_VARIABLE_MAP_TO_BINDINGS, list(new SubLObject[]{ $TEST, NIL, $OWNER, NIL, $CLASSES, NIL, $KB, $TINY, $WORKING_, T }), $list50);
        define_test_case_table_int(TRANSFER_VARIABLE_MAP_TO_BINDINGS_FILTERED, list(new SubLObject[]{ $TEST, NIL, $OWNER, NIL, $CLASSES, NIL, $KB, $TINY, $WORKING_, T }), $list52);
        define_test_case_table_int(TRANSFER_VARIABLE_MAP_TO_BINDINGS_BACKWARDS, list(new SubLObject[]{ $TEST, NIL, $OWNER, NIL, $CLASSES, NIL, $KB, $TINY, $WORKING_, T }), $list54);
        define_test_case_table_int(COMPOSE_BINDINGS, list(new SubLObject[]{ $TEST, NIL, $OWNER, NIL, $CLASSES, NIL, $KB, $TINY, $WORKING_, T }), $list56);
        define_test_case_table_int(COMPOSE_BINDINGS_FILTERED, list(new SubLObject[]{ $TEST, NIL, $OWNER, NIL, $CLASSES, NIL, $KB, $TINY, $WORKING_, T }), $list58);
        define_test_case_table_int(KB_BINDING_P, list(new SubLObject[]{ $TEST, NIL, $OWNER, NIL, $CLASSES, NIL, $KB, $FULL, $WORKING_, T }), $list60);
        define_test_case_table_int(KB_BINDING_SET_P, list(new SubLObject[]{ $TEST, NIL, $OWNER, NIL, $CLASSES, NIL, $KB, $FULL, $WORKING_, T }), $list61);
        define_test_case_table_int(KB_SET_OF_BINDING_SETS_P, list(new SubLObject[]{ $TEST, NIL, $OWNER, NIL, $CLASSES, NIL, $KB, $FULL, $WORKING_, T }), $list62);
        define_test_case_table_int(INFERENCIFY_KB_SET_OF_BINDING_SETS, list(new SubLObject[]{ $TEST, NIL, $OWNER, NIL, $CLASSES, NIL, $KB, $FULL, $WORKING_, T }), $list64);
        define_test_case_table_int(KBIFY_SET_OF_BINDING_SETS, list(new SubLObject[]{ $TEST, TEST_KBIFIED_SET_OF_BINDING_SETS, $OWNER, NIL, $CLASSES, NIL, $KB, $FULL, $WORKING_, T }), $list67);
        define_test_case_table_int(KBIFY_INFERENCE_SET_OF_BINDING_SETS, list(new SubLObject[]{ $TEST, TEST_KBIFIED_SET_OF_BINDING_SETS, $OWNER, NIL, $CLASSES, NIL, $KB, $FULL, $WORKING_, T }), $list69);
        define_test_case_table_int(KB_BINDING_SET_VARIABLES, list(new SubLObject[]{ $TEST, NIL, $OWNER, NIL, $CLASSES, NIL, $KB, $FULL, $WORKING_, T }), $list71);
        define_test_case_table_int(KB_BINDING_SET_VALUES, list(new SubLObject[]{ $TEST, NIL, $OWNER, NIL, $CLASSES, NIL, $KB, $FULL, $WORKING_, T }), $list72);
        return NIL;
    }

    @Override
    public void declareFunctions() {
        declare_bindings_file();
    }

    @Override
    public void initializeVariables() {
        init_bindings_file();
    }

    @Override
    public void runTopLevelForms() {
        setup_bindings_file();
    }

    

    public static final class $binding_p$UnaryFunction extends UnaryFunction {
        public $binding_p$UnaryFunction() {
            super(extractFunctionNamed("BINDING-P"));
        }

        @Override
        public SubLObject processItem(final SubLObject arg1) {
            return binding_p(arg1);
        }
    }

    public static final class $inference_binding_p$UnaryFunction extends UnaryFunction {
        public $inference_binding_p$UnaryFunction() {
            super(extractFunctionNamed("INFERENCE-BINDING-P"));
        }

        @Override
        public SubLObject processItem(final SubLObject arg1) {
            return inference_binding_p(arg1);
        }
    }

    public static final class $subst_bindings$BinaryFunction extends BinaryFunction {
        public $subst_bindings$BinaryFunction() {
            super(extractFunctionNamed("SUBST-BINDINGS"));
        }

        @Override
        public SubLObject processItem(final SubLObject arg1, final SubLObject arg2) {
            return subst_bindings(arg1, arg2);
        }
    }

    public static final class $variable_binding_variable$UnaryFunction extends UnaryFunction {
        public $variable_binding_variable$UnaryFunction() {
            super(extractFunctionNamed("VARIABLE-BINDING-VARIABLE"));
        }

        @Override
        public SubLObject processItem(final SubLObject arg1) {
            return variable_binding_variable(arg1);
        }
    }

    public static final class $variable_binding_value$UnaryFunction extends UnaryFunction {
        public $variable_binding_value$UnaryFunction() {
            super(extractFunctionNamed("VARIABLE-BINDING-VALUE"));
        }

        @Override
        public SubLObject processItem(final SubLObject arg1) {
            return variable_binding_value(arg1);
        }
    }
}

/**
 * Total time: 495 ms
 */
