package com.cyc.cycjava.cycl;


import static com.cyc.cycjava.cycl.access_macros.register_external_symbol;
import static com.cyc.cycjava.cycl.cb_utilities.cb_form;
import static com.cyc.cycjava.cycl.cb_utilities.cb_link_constant;
import static com.cyc.cycjava.cycl.cb_utilities.cb_link_nart;
import static com.cyc.cycjava.cycl.cb_utilities.cb_link_naut;
import static com.cyc.cycjava.cycl.constant_handles.constant_p;
import static com.cyc.cycjava.cycl.constant_handles.reader_make_constant_shell;
import static com.cyc.cycjava.cycl.constant_handles.valid_constantP;
import static com.cyc.cycjava.cycl.el_utilities.atomic_sentenceP;
import static com.cyc.cycjava.cycl.el_utilities.closedP;
import static com.cyc.cycjava.cycl.el_utilities.copy_clause;
import static com.cyc.cycjava.cycl.el_utilities.copy_expression;
import static com.cyc.cycjava.cycl.el_utilities.el_atomic_sentenceP;
import static com.cyc.cycjava.cycl.el_utilities.el_conjunction_p;
import static com.cyc.cycjava.cycl.el_utilities.el_disjunction_p;
import static com.cyc.cycjava.cycl.el_utilities.el_formula_p;
import static com.cyc.cycjava.cycl.el_utilities.el_formula_with_operator_p;
import static com.cyc.cycjava.cycl.el_utilities.el_implication_p;
import static com.cyc.cycjava.cycl.el_utilities.el_negation_p;
import static com.cyc.cycjava.cycl.el_utilities.el_set_items;
import static com.cyc.cycjava.cycl.el_utilities.el_set_p;
import static com.cyc.cycjava.cycl.el_utilities.formula_arityE;
import static com.cyc.cycjava.cycl.el_utilities.ist_sentence_p;
import static com.cyc.cycjava.cycl.el_utilities.make_binary_formula;
import static com.cyc.cycjava.cycl.el_utilities.make_el_formula;
import static com.cyc.cycjava.cycl.el_utilities.make_el_list;
import static com.cyc.cycjava.cycl.el_utilities.make_implication;
import static com.cyc.cycjava.cycl.el_utilities.make_negation;
import static com.cyc.cycjava.cycl.el_utilities.make_unary_formula;
import static com.cyc.cycjava.cycl.el_utilities.possibly_inference_sentence_p;
import static com.cyc.cycjava.cycl.el_utilities.replace_formula_arg;
import static com.cyc.cycjava.cycl.html_utilities.html_align;
import static com.cyc.cycjava.cycl.html_utilities.html_char;
import static com.cyc.cycjava.cycl.html_utilities.html_color;
import static com.cyc.cycjava.cycl.html_utilities.html_glyph;
import static com.cyc.cycjava.cycl.html_utilities.html_hr;
import static com.cyc.cycjava.cycl.html_utilities.html_indent;
import static com.cyc.cycjava.cycl.html_utilities.html_markup;
import static com.cyc.cycjava.cycl.html_utilities.html_newline;
import static com.cyc.cycjava.cycl.html_utilities.html_princ;
import static com.cyc.cycjava.cycl.html_utilities.html_princ_strong;
import static com.cyc.cycjava.cycl.html_utilities.html_simple_attribute;
import static com.cyc.cycjava.cycl.html_utilities.html_source_readability_terpri;
import static com.cyc.cycjava.cycl.html_utilities.html_terpri;
import static com.cyc.cycjava.cycl.html_utilities.remove_html_tags;
import static com.cyc.cycjava.cycl.id_index.id_index_dense_objects;
import static com.cyc.cycjava.cycl.id_index.id_index_dense_objects_empty_p;
import static com.cyc.cycjava.cycl.id_index.id_index_objects_empty_p;
import static com.cyc.cycjava.cycl.id_index.id_index_skip_tombstones_p;
import static com.cyc.cycjava.cycl.id_index.id_index_sparse_objects;
import static com.cyc.cycjava.cycl.id_index.id_index_sparse_objects_empty_p;
import static com.cyc.cycjava.cycl.id_index.id_index_tombstone_p;
import static com.cyc.cycjava.cycl.kb_indexing_datastructures.indexed_term_p;
import static com.cyc.cycjava.cycl.subl_macro_promotions.$with_timeout_nesting_depth$;
import static com.cyc.cycjava.cycl.subl_macro_promotions.$within_with_timeout$;
import static com.cyc.cycjava.cycl.subl_macro_promotions.with_timeout_make_tag;
import static com.cyc.cycjava.cycl.subl_macro_promotions.with_timeout_start_timer;
import static com.cyc.cycjava.cycl.subl_macro_promotions.with_timeout_stop_timer;
import static com.cyc.cycjava.cycl.utilities_macros.register_kb_function;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_greater;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_hyphen;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_quotation;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_space;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.append;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.cons;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.list;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.listS;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality.eql;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality.equal;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions.funcall;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.getEntryKey;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.getEntrySetIterator;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.getEntryValue;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.iteratorHasNext;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.iteratorNextEntry;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.releaseEntrySetIterator;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.add;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.divide;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.max;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.min;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.numE;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.numL;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.subtract;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow.format;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.cconcatenate;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.delete;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.delete_duplicates;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.delete_if;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.find;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.find_if;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.length;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.nreverse;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.remove;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.remove_if;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.symbol_function;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads.$is_thread_performing_cleanupP$;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types.integerp;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types.numberp;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types.stringp;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.arg2;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.getValuesAsVector;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.multiple_value_list;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.nth_value_step_1;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.nth_value_step_2;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.restoreValuesFromVector;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.values;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Vectors.aref;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeBoolean;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeDouble;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeInteger;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeKeyword;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeString;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeSymbol;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.cdestructuring_bind_error;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.destructuring_bind_must_consp;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.copy_list;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.copy_tree;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.intersection;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.member;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.second;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.set_difference;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.subst;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.union;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high.princ_to_string;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader.bq_cons;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high.close;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high.get_output_stream_string;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high.make_private_string_output_stream;
import static com.cyc.tool.subl.util.SubLFiles.declareFunction;
import static com.cyc.tool.subl.util.SubLFiles.declareMacro;
import static com.cyc.tool.subl.util.SubLFiles.deflexical;
import static com.cyc.tool.subl.util.SubLFiles.defparameter;

import java.util.Iterator;
import java.util.Map;

import com.cyc.cycjava.cycl.inference.ask_utilities;
import com.cyc.cycjava.cycl.inference.harness.abnormal;
import com.cyc.cycjava.cycl.inference.harness.inference_czer;
import com.cyc.cycjava.cycl.inference.harness.inference_datastructures_inference;
import com.cyc.cycjava.cycl.inference.harness.inference_datastructures_problem_link;
import com.cyc.cycjava.cycl.inference.harness.inference_datastructures_problem_store;
import com.cyc.cycjava.cycl.inference.harness.inference_datastructures_proof;
import com.cyc.cycjava.cycl.inference.harness.inference_kernel;
import com.cyc.cycjava.cycl.inference.harness.inference_macros;
import com.cyc.cycjava.cycl.inference.harness.inference_modules;
import com.cyc.cycjava.cycl.inference.harness.inference_worker;
import com.cyc.cycjava.cycl.inference.harness.inference_worker_removal;
import com.cyc.cycjava.cycl.inference.harness.inference_worker_residual_transformation;
import com.cyc.cycjava.cycl.inference.harness.inference_worker_transformation;
import com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_inference_reflection;
import com.cyc.cycjava.cycl.sbhl.sbhl_graphs;
import com.cyc.cycjava.cycl.sbhl.sbhl_link_vars;
import com.cyc.cycjava.cycl.sbhl.sbhl_links;
import com.cyc.cycjava.cycl.sbhl.sbhl_macros;
import com.cyc.cycjava.cycl.sbhl.sbhl_marking_utilities;
import com.cyc.cycjava.cycl.sbhl.sbhl_marking_vars;
import com.cyc.cycjava.cycl.sbhl.sbhl_module_utilities;
import com.cyc.cycjava.cycl.sbhl.sbhl_module_vars;
import com.cyc.cycjava.cycl.sbhl.sbhl_paranoia;
import com.cyc.cycjava.cycl.sbhl.sbhl_search_vars;
import com.cyc.cycjava.cycl.sksi.sks_browser.sksi_external_term_browser;
import com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_infrastructure_utilities;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Mapping;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sort;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Strings;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLFloat;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLSystemTrampolineFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;


public final class pph_proof extends SubLTranslatedFile {
    public static final SubLFile me = new pph_proof();

    public static final String myName = "com.cyc.cycjava.cycl.pph_proof";

    public static final String myFingerPrint = "09721c75af6bdecb2dd21c0b752b6650185b1729965b95d2c2f8aa997dc52473";

    // defparameter
    // Definitions
    /**
     * Set to T if you want to see every bit of the proof, no matter how
     * unintelligble it might be
     */
    private static final SubLSymbol $pph_show_gory_proof_details$ = makeSymbol("*PPH-SHOW-GORY-PROOF-DETAILS*");

    // deflexical
    // How many levels of meta-supports should we find and allow the display of?
    private static final SubLSymbol $pph_meta_support_max$ = makeSymbol("*PPH-META-SUPPORT-MAX*");

    // defparameter
    // What level of support are we currently on?
    private static final SubLSymbol $pph_meta_support_level$ = makeSymbol("*PPH-META-SUPPORT-LEVEL*");

    // defparameter
    // LISTP of HL support modules for which we should not show meta-supports
    public static final SubLSymbol $pph_hl_modules_to_skip_meta_supports_for$ = makeSymbol("*PPH-HL-MODULES-TO-SKIP-META-SUPPORTS-FOR*");

    // defparameter
    private static final SubLSymbol $var_binding_candidates$ = makeSymbol("*VAR-BINDING-CANDIDATES*");

    // deflexical
    private static final SubLSymbol $pph_support_modules_for_which_to_show_all_meta_supports$ = makeSymbol("*PPH-SUPPORT-MODULES-FOR-WHICH-TO-SHOW-ALL-META-SUPPORTS*");

    // defparameter
    // Any supports from these modules are irrelevant.
    private static final SubLSymbol $pph_irrelevant_support_modules$ = makeSymbol("*PPH-IRRELEVANT-SUPPORT-MODULES*");

    // defparameter
    /**
     * BOOLEANP; Gating variable for whether or not to use templates to show
     * justifications for proofs
     */
    public static final SubLSymbol $pph_use_proof_templatesP$ = makeSymbol("*PPH-USE-PROOF-TEMPLATES?*");

    // deflexical
    private static final SubLSymbol $proof_view_max_nowrap_line$ = makeSymbol("*PROOF-VIEW-MAX-NOWRAP-LINE*");

    // defparameter
    private static final SubLSymbol $pph_meta_supports_max_depth$ = makeSymbol("*PPH-META-SUPPORTS-MAX-DEPTH*");

    // defparameter
    private static final SubLSymbol $pph_meta_supports_depth$ = makeSymbol("*PPH-META-SUPPORTS-DEPTH*");

    // defparameter
    public static final SubLSymbol $pph_prefer_deduced_meta_supportsP$ = makeSymbol("*PPH-PREFER-DEDUCED-META-SUPPORTS?*");

    // Internal Constants
    public static final SubLSymbol GENERATE_INFERENCE_ANSWER_SENTENCE_FOR_JAVA = makeSymbol("GENERATE-INFERENCE-ANSWER-SENTENCE-FOR-JAVA");







    public static final SubLString $str4$Couldn_t_generate_a_paraphrase_fo = makeString("Couldn't generate a paraphrase for the sentence proven by inference answer ~S ~S ~S");

    public static final SubLSymbol $sym5$PPH_PROOF__ = makeSymbol("PPH-PROOF-=");



    public static final SubLString $str7$_S_is_not_a_proof_of__S = makeString("~S is not a proof of ~S");

    public static final SubLString $$$proof = makeString("proof");





    public static final SubLString $str11$Facts_Proved_ = makeString("Facts Proved:");

    public static final SubLSymbol $sym12$GAF_ASSERTION_ = makeSymbol("GAF-ASSERTION?");

    public static final SubLString $$$Selected_ = makeString("Selected ");

    public static final SubLString $str14$Facts_Used_from_Knowledge_Base_ = makeString("Facts Used from Knowledge Base:");

    public static final SubLSymbol $sym15$ASSERTED_ASSERTION_ = makeSymbol("ASSERTED-ASSERTION?");

    public static final SubLSymbol $sym16$PPH_IRRELEVANT_SUPPORT_ = makeSymbol("PPH-IRRELEVANT-SUPPORT?");

    public static final SubLSymbol PPH_SUPPORT_EL_SENTENCE = makeSymbol("PPH-SUPPORT-EL-SENTENCE");





    public static final SubLSymbol $sym20$PPH_TRIVIAL_SENTENCE_ = makeSymbol("PPH-TRIVIAL-SENTENCE?");

    public static final SubLSymbol $sym21$PPH_IRRELEVANT_FORMULA_ = makeSymbol("PPH-IRRELEVANT-FORMULA?");

    public static final SubLSymbol PPH_PROOF_PROVEN_SENTENCE_EL_SENTENCE = makeSymbol("PPH-PROOF-PROVEN-SENTENCE-EL-SENTENCE");

    private static final SubLSymbol $sym23$_ = makeSymbol("<");

    private static final SubLSymbol PPH_PROOF_DEPTH = makeSymbol("PPH-PROOF-DEPTH");

    private static final SubLSymbol PPH_PROOF_DEPTH_MEMOIZED = makeSymbol("PPH-PROOF-DEPTH-MEMOIZED");



    private static final SubLList $list27 = list(makeSymbol("CYCL"), makeSymbol("FORMAT-STRING"), makeSymbol("&REST"), makeSymbol("ARGS"));



    private static final SubLSymbol $sym29$_PPH_IRRELEVANT_WARN__ = makeSymbol("*PPH-IRRELEVANT-WARN?*");







    private static final SubLString $str33$PPH_irrelevant_formula_____S__ = makeString("PPH irrelevant formula:~% ~S~%");

    private static final SubLSymbol $SUPPORTS_AND_CONCLUSION = makeKeyword("SUPPORTS-AND-CONCLUSION");

    private static final SubLString $$$See_above = makeString("See above");

    private static final SubLString $$$From_question = makeString("From question");

    private static final SubLString $str37$see_above_ = makeString("see_above_");

    private static final SubLString $str38$text_css = makeString("text/css");

    private static final SubLString $$$screen = makeString("screen");

    private static final SubLString $$$none = makeString("none");

    private static final SubLString $str41$ = makeString("");





    private static final SubLString $str44$__A_ = makeString("(~A)");

    private static final SubLSymbol $sym45$PPH_PROOF_QUERY_EQUAL_ = makeSymbol("PPH-PROOF-QUERY-EQUAL?");

    private static final SubLSymbol PROOF_PROVEN_QUERY = makeSymbol("PROOF-PROVEN-QUERY");

    private static final SubLList $list47 = list(makeSymbol("MT1"), makeSymbol("ASENT1"));

    private static final SubLList $list48 = list(makeSymbol("MT2"), makeSymbol("ASENT2"));

    private static final SubLString $str49$By_analogous_reasoning__ = makeString("By analogous reasoning, ");

    private static final SubLString $str50$since_ = makeString("since:");

    private static final SubLString $str51$it_follows_that_ = makeString("it follows that:");

    private static final SubLString $str52$Trivially__ = makeString("Trivially: ");

    private static final SubLSymbol $sym53$RULE_ASSERTION_ = makeSymbol("RULE-ASSERTION?");

    private static final SubLSymbol $sym54$_EXIT = makeSymbol("%EXIT");

    private static final SubLObject $const55$ruleAndSupportsTrivialForJustific = reader_make_constant_shell(makeString("ruleAndSupportsTrivialForJustificationParaphrase"));

    private static final SubLString $str56$__Removing_irrelevant_support____ = makeString("~&Removing irrelevant support:~% ~S");

    private static final SubLSymbol $sym57$PPH_SUPPORT_TRIVIAL_ = makeSymbol("PPH-SUPPORT-TRIVIAL?");



    private static final SubLString $str59$_ = makeString("_");

    private static final SubLString $$$Proof_that = makeString("Proof that");

    private static final SubLString $str61$Intermediate_Result_ = makeString("Intermediate Result:");

    private static final SubLString $str62$Conclusion_ = makeString("Conclusion:");

    private static final SubLString $$$Supporting_Facts = makeString("Supporting Facts");

    private static final SubLString $str64$_transformation_supports = makeString("_transformation_supports");

    private static final SubLString $str65$Rule_Application_ = makeString("Rule Application:");

    private static final SubLString $$$Transformation_Proof_Supports = makeString("Transformation Proof Supports");



    private static final SubLSymbol PPH_SUPPORT_TREE_SENTENCE = makeSymbol("PPH-SUPPORT-TREE-SENTENCE");

    private static final SubLList $list69 = cons(makeSymbol("SUPPORT"), makeSymbol("META-SUPPORT-TREES"));

    private static final SubLString $str70$_meta_ = makeString("_meta_");





    private static final SubLString $str73$Applicable_Rule_ = makeString("Applicable Rule:");





    private static final SubLString $str76$transformation_rule_ = makeString("transformation_rule_");

    private static final SubLString $$$Invalidated_Rule = makeString("Invalidated Rule");

    private static final SubLString $$$Supporting_Rule = makeString("Supporting Rule");

    private static final SubLString $$$Transformation_Supports = makeString("Transformation Supports");





    private static final SubLSymbol $DERIVED_FROM_HYPOTHESIS = makeKeyword("DERIVED-FROM-HYPOTHESIS");

    private static final SubLString $str83$Given__from_the_question__ = makeString("Given (from the question):");

    private static final SubLString $str84$Derived_from_the_question_ = makeString("Derived from the question:");

    private static final SubLString $str85$Given__from_the_knowledge_base__ = makeString("Given (from the knowledge base):");

    private static final SubLString $str86$Other_Givens_ = makeString("Other Givens:");

    private static final SubLString $str87$_restriction_subproofs = makeString("_restriction-subproofs");

    private static final SubLObject $$BaseTrivialityMt = reader_make_constant_shell(makeString("BaseTrivialityMt"));

    private static final SubLObject $$MtUnionFn = reader_make_constant_shell(makeString("MtUnionFn"));

    private static final SubLSymbol PPH_TRIVIALITY_CHECK_MT_FOR_ADDRESSEE = makeSymbol("PPH-TRIVIALITY-CHECK-MT-FOR-ADDRESSEE");

    private static final SubLObject $$TrivialityContextForIndividualFn = reader_make_constant_shell(makeString("TrivialityContextForIndividualFn"));











    private static final SubLString $str97$_A_is_not_a__A = makeString("~A is not a ~A");





    private static final SubLString $$$continue_anyway = makeString("continue anyway");



    private static final SubLString $str102$_A_is_not_a_valid__sbhl_type_erro = makeString("~A is not a valid *sbhl-type-error-action* value");

    private static final SubLObject $$isa = reader_make_constant_shell(makeString("isa"));

    private static final SubLString $str104$_A_is_neither_SET_P_nor_LISTP_ = makeString("~A is neither SET-P nor LISTP.");

    private static final SubLString $str105$attempting_to_bind_direction_link = makeString("attempting to bind direction link variable, to NIL. macro body not executed.");

    private static final SubLObject $$TrivialityContextForTypeFn = reader_make_constant_shell(makeString("TrivialityContextForTypeFn"));

    private static final SubLString $str107$Node__a_does_not_pass_sbhl_type_t = makeString("Node ~a does not pass sbhl-type-test ~a~%");

    private static final SubLObject $$BaseIrrelevanceMt = reader_make_constant_shell(makeString("BaseIrrelevanceMt"));

    private static final SubLSymbol PPH_IRRELEVANCE_CHECK_MT_FOR_ADDRESSEE = makeSymbol("PPH-IRRELEVANCE-CHECK-MT-FOR-ADDRESSEE");

    private static final SubLObject $$IrrelevanceContextForIndividualFn = reader_make_constant_shell(makeString("IrrelevanceContextForIndividualFn"));

    private static final SubLObject $$IrrelevanceContextForTypeFn = reader_make_constant_shell(makeString("IrrelevanceContextForTypeFn"));

    private static final SubLObject $const112$ruleRequiredForJustificationParap = reader_make_constant_shell(makeString("ruleRequiredForJustificationParaphrase"));



    private static final SubLObject $$ruleConclusionsTrivial = reader_make_constant_shell(makeString("ruleConclusionsTrivial"));

    private static final SubLString $str115$PPH_irrelevant_formula_ = makeString("PPH irrelevant formula:");

    private static final SubLString $$$_ = makeString(" ");

    private static final SubLString $str117$Derived_from_rule_whose_conclusio = makeString("Derived from rule whose conclusions are trivial:~% ~S");

    private static final SubLObject $const118$mtTrivialForJustificationParaphra = reader_make_constant_shell(makeString("mtTrivialForJustificationParaphrase"));



    private static final SubLList $list120 = list(makeSymbol("INDENT-CONTENT"), makeSymbol("&BODY"), makeSymbol("BODY"));

    private static final SubLSymbol HTML_FANCY_TABLE = makeSymbol("HTML-FANCY-TABLE");

    private static final SubLList $list122 = list(makeKeyword("BORDER"), ZERO_INTEGER, makeKeyword("CLASS"), makeString("pf-indent"));





    private static final SubLList $list125 = list(makeKeyword("CLASS"), makeString("pf-indent-td"));



    private static final SubLList $list127 = list(makeSymbol("HTML-FANCY-TABLE-DATA"), list(makeKeyword("CLASS"), makeString("pf-indent-td")));

    private static final SubLString $str128$subproofs_ = makeString("subproofs_");

    private static final SubLString $str129$pf_indent = makeString("pf-indent");

    private static final SubLString $str130$pf_indent_td = makeString("pf-indent-td");

    private static final SubLString $str131$_A_subproof = makeString("~A_subproof");

    private static final SubLString $str132$_A_subproof__D = makeString("~A_subproof_~D");

    private static final SubLString $$$support = makeString("support");



    private static final SubLString $str135$highly_relevant = makeString("highly-relevant");

    private static final SubLString $str136$_see_above = makeString("_see_above");

    private static final SubLObject $const137$predHighlyRelevantForJustificatio = reader_make_constant_shell(makeString("predHighlyRelevantForJustificationParaphrase"));

    private static final SubLString $$$Invalidated_support = makeString("Invalidated support");

    private static final SubLString $str139$meta_supports_ = makeString("meta_supports_");

    private static final SubLString $str140$_A_meta__D = makeString("~A_meta_~D");

    private static final SubLString $str141$assert_info_ = makeString("assert_info_");

    private static final SubLString $str142$__ = makeString("--");

    private static final SubLObject $$HypotheticalContext = reader_make_constant_shell(makeString("HypotheticalContext"));

    private static final SubLString $str144$This_was_stated_in_the_question_ = makeString("This was stated in the question.");

    private static final SubLString $str145$Note__This_rule_has_exceptions__b = makeString("Note: This rule has exceptions, but none that apply in this case.");

    private static final SubLObject $$InferencePSC = reader_make_constant_shell(makeString("InferencePSC"));

    private static final SubLString $str147$Note__This_rule_has_further_condi = makeString("Note: This rule has further conditions on its application, but all are met in this case.");





    private static final SubLString $str150$Skipping_meta_supports_for__S = makeString("Skipping meta-supports for ~S");

    private static final SubLString $str151$Pruning_all_supports_for__S___due = makeString("Pruning all supports for ~S~% due to ~S");

    private static final SubLString $str152$__Checking_for_literals_to_suppre = makeString("~&Checking for literals to suppress.~% Rule: ~S~% Mt: ~S~%");

    private static final SubLString $str153$__Literals_to_suppress_____S__ = makeString("~&Literals to suppress:~% ~S~%");



    private static final SubLSymbol $sym155$PPH_META_SUPPORT_SHOULD_PRECEDE_ = makeSymbol("PPH-META-SUPPORT-SHOULD-PRECEDE?");

    private static final SubLObject $const156$suppressLiteralForJustificationPa = reader_make_constant_shell(makeString("suppressLiteralForJustificationParaphrase"));











    private static final SubLSymbol $kw162$ADD_RESTRICTION_LAYER_OF_INDIRECTION_ = makeKeyword("ADD-RESTRICTION-LAYER-OF-INDIRECTION?");

    private static final SubLSymbol $kw163$COMPUTE_ANSWER_JUSTIFICATIONS_ = makeKeyword("COMPUTE-ANSWER-JUSTIFICATIONS?");

    private static final SubLSymbol $MAX_TRANSFORMATION_DEPTH = makeKeyword("MAX-TRANSFORMATION-DEPTH");











    private static final SubLString $str170$Couldn_t_bind_variables_in_litera = makeString("Couldn't bind variables in literals to suppress for~% ~S~% given conclusion ~S~%");



    private static final SubLSymbol SUBSTITUTE_PPH_VAR_BINDING = makeSymbol("SUBSTITUTE-PPH-VAR-BINDING");

    private static final SubLString $str173$__Lit_candidates_for__S_____S = makeString("~&Lit candidates for ~S:~% ~S");

    private static final SubLString $str174$__New_candidates_for__S___S__ = makeString("~&New candidates for ~S: ~S~%");

    private static final SubLSymbol CYCL_VARIABLE_P = makeSymbol("CYCL-VARIABLE-P");

    private static final SubLString $str176$Candidates_for__S___S = makeString("Candidates for ~S: ~S");

    private static final SubLString $str177$Couldn_t_fully_bind_variables_in_ = makeString("Couldn't fully bind variables in lit to suppress: ~S");





    private static final SubLString $str180$__Pruning_meta_supports____Input_ = makeString("~&Pruning meta supports.~% Input: ~S~% To Suppress: ~S~%");

    private static final SubLString $str181$Pruning__S = makeString("Pruning ~S");

    private static final SubLSymbol $sym182$PPH_ALWAYS_SHOW_META_SUPPORT_FOR_MODULE_ = makeSymbol("PPH-ALWAYS-SHOW-META-SUPPORT-FOR-MODULE?");





    private static final SubLSymbol $sym185$PPH_INVALID_SUPPORT_ = makeSymbol("PPH-INVALID-SUPPORT?");

    private static final SubLString $str186$_2 = makeString("+2");

    private static final SubLString $$$Invalid = makeString("Invalid");

    private static final SubLString $str188$_A__D = makeString("~A_~D");

    private static final SubLString $str189$___is_a_trivial_support_ = makeString("...is a trivial support.");

    private static final SubLList $list190 = list(makeKeyword("REFORMULATE"));

    private static final SubLSymbol PPH_TRANSFORMABLE_REDUNDANT_NART_P = makeSymbol("PPH-TRANSFORMABLE-REDUNDANT-NART-P");

    private static final SubLSymbol PPH_TRANSFORM_REDUNDANT_NART = makeSymbol("PPH-TRANSFORM-REDUNDANT-NART");

    private static final SubLSymbol PPH_CONSTANT_FOR_NART = makeSymbol("PPH-CONSTANT-FOR-NART");



    private static final SubLObject $$EverythingPSC = reader_make_constant_shell(makeString("EverythingPSC"));

    private static final SubLObject $$rewriteOf = reader_make_constant_shell(makeString("rewriteOf"));





    private static final SubLString $str199$Has_EL_variable_functor___S_ = makeString("Has EL variable functor: ~S.");

    private static final SubLString $str200$Has_HL_variable_functor___S_ = makeString("Has HL variable functor: ~S.");

    private static final SubLObject $$interestingSentence = reader_make_constant_shell(makeString("interestingSentence"));

    private static final SubLObject $$ist = reader_make_constant_shell(makeString("ist"));



    private static final SubLString $str204$Has_irrelevant_FORT___S_in__S_ = makeString("Has irrelevant FORT: ~S in ~S.");



    private static final SubLString $str206$Trivial_functional_sentence_ = makeString("Trivial functional sentence.");

    private static final SubLObject $const207$sentenceTrivialForJustificationPa = reader_make_constant_shell(makeString("sentenceTrivialForJustificationParaphrase"));

    private static final SubLSymbol $sym208$SENTENCE_HAS_TRIVIAL_ISOMORPHIC_ASSERTION_ = makeSymbol("SENTENCE-HAS-TRIVIAL-ISOMORPHIC-ASSERTION?");

    private static final SubLObject $$The = reader_make_constant_shell(makeString("The"));

    public static final SubLList $list210 = list(list(makeKeyword("OR"), reader_make_constant_shell(makeString("isa")), reader_make_constant_shell(makeString("genls"))), makeKeyword("FULLY-BOUND"), reader_make_constant_shell(makeString("Thing")));

    private static final SubLObject $$FunctionalPredicate = reader_make_constant_shell(makeString("FunctionalPredicate"));

    private static final SubLList $list212 = cons(makeSymbol("?FN"), makeSymbol("?ARGNUM"));

    private static final SubLObject $$functionCorrespondingPredicate = reader_make_constant_shell(makeString("functionCorrespondingPredicate"));

    private static final SubLSymbol $sym214$_FN = makeSymbol("?FN");

    private static final SubLList $list215 = list(makeSymbol("?ARGNUM"));

    private static final SubLList $list216 = list(makeKeyword("ANSWER-LANGUAGE"), makeKeyword("HL"));

    private static final SubLList $list217 = cons(makeSymbol("FN"), makeSymbol("ARGNUM"));

    private static final SubLString $str218$Trivial_functional_sentence_____S = makeString("Trivial functional sentence:~% ~S~%");

    private static final SubLList $list219 = list(reader_make_constant_shell(makeString("InstanceWithRelationToFn")), reader_make_constant_shell(makeString("InstanceWithRelationFromFn")));

    private static final SubLObject $$genls = reader_make_constant_shell(makeString("genls"));

    public static final SubLList $list221 = list(makeSymbol("ARG1"), makeSymbol("ARG2"));

    private static final SubLObject $$CollectionUnionFn = reader_make_constant_shell(makeString("CollectionUnionFn"));

    private static final SubLObject $const223$instanceAndSpecSentencesTrivialFo = reader_make_constant_shell(makeString("instanceAndSpecSentencesTrivialForJustificationParaphrase"));

    private static final SubLObject $const224$specSentencesTrivialForJustificat = reader_make_constant_shell(makeString("specSentencesTrivialForJustificationParaphrase"));

    private static final SubLString $str225$Trivial___genls_sentence_____S__ = makeString("Trivial #$genls sentence:~% ~S~%");

    private static final SubLObject $const226$instanceSentencesTrivialForJustif = reader_make_constant_shell(makeString("instanceSentencesTrivialForJustificationParaphrase"));

    private static final SubLObject $$SingletonCollectionFn = reader_make_constant_shell(makeString("SingletonCollectionFn"));

    private static final SubLString $str228$Trivial___isa_sentence_____S__ = makeString("Trivial #$isa sentence:~% ~S~%");

    private static final SubLObject $$genlPreds = reader_make_constant_shell(makeString("genlPreds"));

    private static final SubLSymbol $sym230$PPH_REQUIRED_SENTENCE_ = makeSymbol("PPH-REQUIRED-SENTENCE?");

    private static final SubLObject $$or = reader_make_constant_shell(makeString("or"));

    private static final SubLObject $const232$sentenceRequiredForJustificationP = reader_make_constant_shell(makeString("sentenceRequiredForJustificationParaphrase"));

    private static final SubLObject $$thereExists = reader_make_constant_shell(makeString("thereExists"));

    private static final SubLSymbol $sym234$_AS = makeSymbol("?AS");

    private static final SubLObject $$and = reader_make_constant_shell(makeString("and"));

    private static final SubLObject $$assertionSentence = reader_make_constant_shell(makeString("assertionSentence"));

    private static final SubLList $list237 = list(list(reader_make_constant_shell(makeString("assertionRequiredForJustificationParaphrase")), makeSymbol("?AS")));

    private static final SubLList $list238 = list(makeKeyword("ANYTHING"), list(makeKeyword("BIND"), makeSymbol("BIN-PRED")), list(makeKeyword("AND"), list(makeKeyword("TEST"), makeSymbol("CYCL-NAT-P")), list(makeKeyword("BIND"), makeSymbol("NAT"))), list(makeKeyword("BIND"), makeSymbol("X")));





    private static final SubLSymbol NAT = makeSymbol("NAT");

    private static final SubLObject $$reflexiveInArgs = reader_make_constant_shell(makeString("reflexiveInArgs"));

    private static final SubLSymbol $sym243$PPH_TRIVIAL_TERM_ = makeSymbol("PPH-TRIVIAL-TERM?");

    private static final SubLString $str244$_A_is_trivial_in__S = makeString("~A is trivial in ~S");

    private static final SubLObject $const245$predTrivialForJustificationParaph = reader_make_constant_shell(makeString("predTrivialForJustificationParaphrase"));

    private static final SubLObject $const246$assertionTrivialForJustificationP = reader_make_constant_shell(makeString("assertionTrivialForJustificationParaphrase"));

    private static final SubLString $str247$_S_is_an_unknown_triviality_type_ = makeString("~S is an unknown triviality type.");

    private static final SubLObject $$False = reader_make_constant_shell(makeString("False"));



    private static final SubLString $str250$additional_supports_ = makeString("additional_supports_");

    private static final SubLString $$$Additional_Supports = makeString("Additional Supports");

    private static final SubLString $str252$_A_additional__D = makeString("~A_additional_~D");

    private static final SubLString $str253$_from__A = makeString(" from ~A");

    private static final SubLObject $const254$sentenceHighlyRelevantForJustific = reader_make_constant_shell(makeString("sentenceHighlyRelevantForJustificationParaphrase"));







    private static final SubLString $str258$Generated__D_demerits_for__S = makeString("Generated ~D demerits for ~S");

    private static final SubLSymbol $sym259$_TEMPLATE = makeSymbol("?TEMPLATE");

    private static final SubLObject $const260$justificationTemplateAppliesToPro = reader_make_constant_shell(makeString("justificationTemplateAppliesToProof"));

    private static final SubLList $list261 = list(makeKeyword("MAX-TRANSFORMATION-DEPTH"), ONE_INTEGER);

    private static final SubLList $list262 = list(cons(makeSymbol("?KA"), makeString("K<sub>a</sub>")), cons(makeSymbol("?PH"), makeString("pH")));

    private static final SubLString $str263$Since_ = makeString("Since:");

    private static final SubLString $str264$and_since_ = makeString("and since:");

    private static final SubLSymbol $sym265$_CONSTRAINT = makeSymbol("?CONSTRAINT");

    private static final SubLObject $const266$justificationTemplateApplicabilit = reader_make_constant_shell(makeString("justificationTemplateApplicabilityConstraint"));

    private static final SubLList $list267 = list(makeSymbol("?CONSTRAINT"));

    private static final SubLString $str268$the_Henderson_Hasselbalch_equatio = makeString("the Henderson-Hasselbalch equation");

    private static final SubLList $list269 = list(reader_make_constant_shell(makeString("isa")), makeKeyword("ANYTHING"), reader_make_constant_shell(makeString("AqueousBufferSolution")));

    private static final SubLString $str270$_sub = makeString("_sub");

    private static final SubLSymbol $sym271$_RULE_GLOSS_TEMPLATE = makeSymbol("?RULE-GLOSS-TEMPLATE");

    private static final SubLObject $const272$justificationGenerationRuleGlossT = reader_make_constant_shell(makeString("justificationGenerationRuleGlossTemplate"));

    private static final SubLList $list273 = list(makeSymbol("?RULE-GLOSS-TEMPLATE"));

    private static final SubLString $str274$We_can_apply_the_rule__ = makeString("We can apply the rule: ");









    private static final SubLString $str279$_ = makeString("=");



    private static final SubLList $list281 = list(makeSymbol("?KA"), makeSymbol("?PH"));



    private static final SubLSymbol INFERENCE_PROOF_GET_DEPTH = makeSymbol("INFERENCE-PROOF-GET-DEPTH");

    private static final SubLString $str284$__DOCTYPE_html_PUBLIC_____W3C__DT = makeString("<!DOCTYPE html PUBLIC \"-//W3C//DTD XHTML 1.0 Transitional//EN\" \"http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd\">");

    private static final SubLString $str285$_meta_http_equiv__X_UA_Compatible = makeString("<meta http-equiv=\"X-UA-Compatible\" content=\"IE=Edge\" >");



    private static final SubLSymbol VALID_PROOF_VIEW_P = makeSymbol("VALID-PROOF-VIEW-P");

    private static final SubLString $str288$pf_debug_proof_view = makeString("pf-debug proof-view");

    private static final SubLString $str289$proof_view = makeString("proof-view");

    private static final SubLString $$$body = makeString("body");

    private static final SubLString $str291$Query_ = makeString("Query:");

    private static final SubLSymbol PROOF_VIEW_ENTRY_GET_LABEL = makeSymbol("PROOF-VIEW-ENTRY-GET-LABEL");

    private static final SubLString $$$justifications = makeString("justifications");

    private static final SubLString $str294$yui_navset = makeString("yui-navset");

    private static final SubLString $str295$yui_nav = makeString("yui-nav");

    private static final SubLSymbol $sym296$SUPPRESS_PROOF_VIEW_SECTION_WITH_ROOT_ = makeSymbol("SUPPRESS-PROOF-VIEW-SECTION-WITH-ROOT?");

    private static final SubLString $str297$_ = makeString("#");

    private static final SubLString $$$selected = makeString("selected");

    private static final SubLString $$$tabErrorOutput = makeString("tabErrorOutput");

    private static final SubLString $$$Debugging_Messages = makeString("Debugging Messages");

    private static final SubLString $str301$yui_content = makeString("yui-content");

    private static final SubLString $$$pfFilteredItems = makeString("pfFilteredItems");

    private static final SubLSymbol PROOF_VIEW_TAB_ID_FOR_ENTRY = makeSymbol("PROOF-VIEW-TAB-ID-FOR-ENTRY");

    private static final SubLSymbol ALPHANUMERIC_CHAR_P = makeSymbol("ALPHANUMERIC-CHAR-P");

    private static final SubLString $$$tab = makeString("tab");



    private static final SubLString $str307$pf_buttonbar = makeString("pf-buttonbar");

    private static final SubLString $$$bd = makeString("bd");

    private static final SubLString $str309$pf_show_debugging = makeString("pf-show-debugging");

    private static final SubLString $str310$pf_show_debugging_checkbox = makeString("pf-show-debugging-checkbox");

    private static final SubLString $str311$Debugging_ = makeString("Debugging?");

    private static final SubLString $str312$toggleDebug_this___body___ = makeString("toggleDebug(this, 'body');");

    private static final SubLString $str313$pf_show_cycl_button = makeString("pf-show-cycl-button");

    private static final SubLString $str314$pf_show_cycl_checkbox = makeString("pf-show-cycl-checkbox");

    private static final SubLString $str315$show_cycl = makeString("show-cycl");

    private static final SubLString $str316$toggleCycLVisible_this___body___ = makeString("toggleCycLVisible(this, 'body');");

    private static final SubLString $$$Show_CycL = makeString("Show CycL");

    private static final SubLString $str318$pf_parameters = makeString("pf-parameters");

    private static final SubLString $$$Parameters = makeString("Parameters");

    private static final SubLList $list320 = cons(makeSymbol("PARAM"), makeSymbol("VALUE"));

    private static final SubLString $$$right = makeString("right");

    private static final SubLString $$$left = makeString("left");

    private static final SubLString $str323$pf_toc = makeString("pf-toc");

    private static final SubLString $$$Quick_Links = makeString("Quick Links");

    private static final SubLList $list325 = cons(makeSymbol("ANCHOR"), makeSymbol("LINKTEXT"));

    private static final SubLList $list326 = list(cons(makeString("#root"), makeString("Root")), cons(makeString("#query"), makeString("Query and Answer")), cons(makeString("#because"), makeString("Key Facts")), cons(makeString("#rules"), makeString("Key Rules")), cons(makeString("#details"), makeString("Detailed Justification")), cons(makeString("#linear"), makeString("Linear Justification")), cons(makeString("#filtered"), makeString("Filtered Supports")));

    private static final SubLString $$$query = makeString("query");

    private static final SubLString $$$Root = makeString("Root");

    private static final SubLString $$$root = makeString("root");

    private static final SubLString $str330$Key_Rules_ = makeString("Key Rules:");

    private static final SubLString $$$rules = makeString("rules");

    private static final SubLString $str332$Because_ = makeString("Because:");

    private static final SubLString $$$because = makeString("because");

    private static final SubLString $str334$Detailed_Justification_ = makeString("Detailed Justification:");

    private static final SubLString $$$details = makeString("details");

    private static final SubLString $str336$Linear_Justification_ = makeString("Linear Justification:");

    private static final SubLString $$$linear = makeString("linear");

    private static final SubLSymbol PPH_PROOF_INDENT = makeSymbol("PPH-PROOF-INDENT");

    private static final SubLSymbol HTML_TABLE = makeSymbol("HTML-TABLE");

    private static final SubLList $list340 = list(ONE_INTEGER);

    private static final SubLString $$$filtered = makeString("filtered");

    private static final SubLString $$$Filtered_Supports = makeString("Filtered Supports");

    private static final SubLString $str343$Reason___S = makeString("Reason: ~S");

    private static final SubLSymbol $IGNORE_ERRORS_TARGET = makeKeyword("IGNORE-ERRORS-TARGET");

    private static final SubLSymbol IGNORE_ERRORS_HANDLER = makeSymbol("IGNORE-ERRORS-HANDLER", "SUBLISP");

    private static final SubLObject $$CycProofViewSummarySection = reader_make_constant_shell(makeString("CycProofViewSummarySection"));

    private static final SubLObject $$CycProofViewJustificationSection = reader_make_constant_shell(makeString("CycProofViewJustificationSection"));

    private static final SubLSymbol CYC_PROOF_VIEW_SECTION_HTML = makeSymbol("CYC-PROOF-VIEW-SECTION-HTML");

    private static final SubLString $str349$___S_handled_by__S__ = makeString("~&~S handled by ~S~%");

    private static final SubLSymbol DEBUG_PROOF_VIEW_CB_LINK_FOR_TERM = makeSymbol("DEBUG-PROOF-VIEW-CB-LINK-FOR-TERM");

    private static final SubLString $str351$pf_stepnum = makeString("pf-stepnum");

    private static final SubLString $str352$pf_steprow = makeString("pf-steprow");

    private static final SubLString $str353$pf_label = makeString("pf-label");

    private static final SubLString $str354$_A = makeString("~A");

    private static final SubLString $str355$pf_entry_content = makeString("pf-entry-content");

    private static final SubLString $str356$pf_children = makeString("pf-children");

    private static final SubLString $str357$Already_seen__S = makeString("Already seen ~S");

    private static final SubLInteger $int$200 = makeInteger(200);

    private static final SubLString $str359$pf_paraphrase = makeString("pf-paraphrase");

    private static final SubLString $str360$_4d_ = makeString("~4d ");

    private static final SubLSymbol PROOF_VIEW_ENTRY_P = makeSymbol("PROOF-VIEW-ENTRY-P");

    private static final SubLString $str362$pf_object_pf_entry_struct = makeString("pf-object pf-entry-struct");

    private static final SubLString $str363$pf_object = makeString("pf-object");

    private static final SubLString $str364$pf_proof = makeString("pf-proof");

    private static final SubLString $str365$Proof__ = makeString("Proof: ");

    private static final SubLString $str366$pf_function = makeString("pf-function");

    private static final SubLString $str367$Function___S = makeString("Function: ~S");

    private static final SubLString $str368$pf_function_section = makeString("pf-function-section");

    private static final SubLString $str369$Section___S = makeString("Section: ~S");



    private static final SubLSymbol EL_TERM_P = makeSymbol("EL-TERM-P");

















    private static final SubLString $str380$pf_entry_ = makeString("pf-entry ");

    private static final SubLString $str381$pf_ = makeString("pf-");

    private static final SubLList $list382 = list(makeKeyword("ASSERTION-BOOKKEEPING"), makeKeyword("UNSUPPORTED-SUPPORT"));

    private static final SubLString $str383$Inferred_ = makeString("Inferred:");

    private static final SubLString $str384$Asserted_ = makeString("Asserted:");

    private static final SubLString $str385$Opaque_ = makeString("Opaque:");





    private static final SubLSymbol $sym388$PPH_TRIVIAL_NEG_LIT_ = makeSymbol("PPH-TRIVIAL-NEG-LIT?");

    private static final SubLObject $$evaluate = reader_make_constant_shell(makeString("evaluate"));



    private static final SubLList $list391 = list(makeSymbol("VAR"), makeSymbol("EVALUATABLE-EXPRESSION"));

    private static final SubLObject $$termOfUnit = reader_make_constant_shell(makeString("termOfUnit"));



    private static final SubLSymbol PROOF_SUID = makeSymbol("PROOF-SUID");

    private static final SubLSymbol PPH_PROOF_CONCLUSION = makeSymbol("PPH-PROOF-CONCLUSION");

    private static final SubLSymbol $sym396$PPH_HL_SUPPORT_WITH_ISOMORPHIC_ASSERTION_ = makeSymbol("PPH-HL-SUPPORT-WITH-ISOMORPHIC-ASSERTION?");

    private static final SubLSymbol PPH_FIND_ASSERTION_FOR_SUPPORT = makeSymbol("PPH-FIND-ASSERTION-FOR-SUPPORT");



    private static final SubLSymbol EARLIER_DEDUCTION_P = makeSymbol("EARLIER-DEDUCTION-P");





    private static final SubLSymbol PPH_SUPPORT_TREE_P = makeSymbol("PPH-SUPPORT-TREE-P");

    private static final SubLList $list403 = cons(makeSymbol("SUPPORT"), makeSymbol("SUBNODES"));

    private static final SubLSymbol $sym404$PPH_PREFER_DEDUCTION_ = makeSymbol("PPH-PREFER-DEDUCTION?");

    private static final SubLSymbol EXPRESSION_FIND = makeSymbol("EXPRESSION-FIND");

    private static final SubLSymbol $sym406$PPH_ASSERTION_HAS_GLOSS_ = makeSymbol("PPH-ASSERTION-HAS-GLOSS?");

    private static final SubLList $list407 = listS(makeSymbol("PRED"), makeSymbol("ARG1"), makeSymbol("OTHER-ARGS"));



    private static final SubLString $str409$HL_VERIFY_failure_on_valid_suppor = makeString("HL-VERIFY failure on valid support:~% ~S~%");

    private static final SubLList $list410 = list(makeKeyword("REWRITE-ALLOWED?"), T, makeKeyword("TRANSFORMATION-ALLOWED?"), NIL);

    private static final SubLList $list411 = list(makeSymbol("SPEC"), makeSymbol("GENL"));





    private static final SubLList $list414 = list(reader_make_constant_shell(makeString("not")), reader_make_constant_shell(makeString("unknownSentence")));

    private static final SubLObject $$disjointWith = reader_make_constant_shell(makeString("disjointWith"));

    private static final SubLList $list416 = list(makeSymbol("COL1"), makeSymbol("COL2"));

    private static final SubLList $list417 = list(makeSymbol("GENL1"), makeSymbol("GENL2"));



    private static final SubLString $str419$No_THCL_or_non_irrelevant_collect = makeString("No THCL or non-irrelevant collections between ~S and ~S in ~S");

    private static final SubLFloat $float$1_0 = makeDouble(1.0);









    private static final SubLSymbol NEW_PPH_SENTENCE = makeSymbol("NEW-PPH-SENTENCE");

    private static final SubLObject $$appropriateResponseContent = reader_make_constant_shell(makeString("appropriateResponseContent"));

    private static final SubLObject $$BestSupportSentenceFn = reader_make_constant_shell(makeString("BestSupportSentenceFn"));



    private static final SubLSymbol VARIABLE_BINDING_VALUE = makeSymbol("VARIABLE-BINDING-VALUE");

    private static final SubLSymbol $REMOVED_SUPPORTS_THAT_DONT_MENTION_BINDING_VALUES = makeKeyword("REMOVED-SUPPORTS-THAT-DONT-MENTION-BINDING-VALUES");



    private static final SubLSymbol $USED_SUPPORTS_THAT_MENTION_MOST_PROVEN_SENTENCE_FORTS = makeKeyword("USED-SUPPORTS-THAT-MENTION-MOST-PROVEN-SENTENCE-FORTS");

    private static final SubLSymbol PPH_EXPLANATION_SENTENCE_FROM_SUPPORT = makeSymbol("PPH-EXPLANATION-SENTENCE-FROM-SUPPORT");

    private static final SubLObject $$authorityClaims_Term = reader_make_constant_shell(makeString("authorityClaims-Term"));

    private static final SubLString $str435$_S___has_too_many_bindings__no_mo = makeString("~S~% has too many bindings (no more than 1 is allowed).");

    private static final SubLObject $$True = reader_make_constant_shell(makeString("True"));

    public static SubLObject generate_inference_answer_sentence_for_java(final SubLObject problem_store_id, final SubLObject inference_id, final SubLObject answer_id, SubLObject language_mt) {
        if (language_mt == UNPROVIDED) {
            language_mt = pph_vars.$pph_language_mt$.getDynamicValue();
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != subl_promotions.non_negative_integer_p(problem_store_id) : "subl_promotions.non_negative_integer_p(problem_store_id) " + "CommonSymbols.NIL != subl_promotions.non_negative_integer_p(problem_store_id) " + problem_store_id;
        assert NIL != subl_promotions.non_negative_integer_p(inference_id) : "subl_promotions.non_negative_integer_p(inference_id) " + "CommonSymbols.NIL != subl_promotions.non_negative_integer_p(inference_id) " + inference_id;
        assert NIL != subl_promotions.non_negative_integer_p(answer_id) : "subl_promotions.non_negative_integer_p(answer_id) " + "CommonSymbols.NIL != subl_promotions.non_negative_integer_p(answer_id) " + answer_id;
        final SubLObject inference_answer = inference_datastructures_inference.find_inference_answer_by_ids(problem_store_id, inference_id, answer_id);
        final SubLObject inference = inference_datastructures_inference.inference_answer_inference(inference_answer);
        final SubLObject query_mt = pph_get_inference_mt(inference);
        SubLObject result = NIL;
        final SubLObject _prev_bind_0 = pph_vars.$pph_inference_answer$.currentBinding(thread);
        final SubLObject _prev_bind_2 = pph_vars.$pph_hypothetical_vars$.currentBinding(thread);
        final SubLObject _prev_bind_3 = pph_vars.$pph_handle_hypotheticalsP$.currentBinding(thread);
        final SubLObject _prev_bind_4 = pph_vars.$pph_domain_mt$.currentBinding(thread);
        final SubLObject _prev_bind_5 = pph_vars.$pph_use_bulleted_listsP$.currentBinding(thread);
        final SubLObject _prev_bind_6 = pph_vars.$pph_repositioned_proofs$.currentBinding(thread);
        final SubLObject _prev_bind_7 = pph_vars.$pph_displayed_proofs$.currentBinding(thread);
        final SubLObject _prev_bind_8 = pph_vars.$pph_justified_proofs$.currentBinding(thread);
        final SubLObject _prev_bind_9 = pph_vars.$pph_proof_depth$.currentBinding(thread);
        final SubLObject _prev_bind_10 = pph_vars.$pph_displayed_supports$.currentBinding(thread);
        try {
            pph_vars.$pph_inference_answer$.bind(inference_answer, thread);
            pph_vars.$pph_hypothetical_vars$.bind(inference_datastructures_inference.inference_hypothetical_bindings(inference_datastructures_inference.inference_answer_inference(inference_answer)), thread);
            pph_vars.$pph_handle_hypotheticalsP$.bind(T, thread);
            pph_vars.$pph_domain_mt$.bind(pph_methods.pph_enhanced_domain_mt(pph_get_inference_mt(inference_datastructures_inference.inference_answer_inference(inference_answer)), UNPROVIDED), thread);
            pph_vars.$pph_use_bulleted_listsP$.bind(T, thread);
            pph_vars.$pph_repositioned_proofs$.bind(NIL, thread);
            pph_vars.$pph_displayed_proofs$.bind(find_or_create_pph_displayed_proof_stack(), thread);
            pph_vars.$pph_justified_proofs$.bind(find_or_create_pph_justified_proof_set(), thread);
            pph_vars.$pph_proof_depth$.bind(ZERO_INTEGER, thread);
            pph_vars.$pph_displayed_supports$.bind(NIL, thread);
            thread.resetMultipleValues();
            final SubLObject link_function = pph_macros.pph_justification_html_function_and_target();
            final SubLObject html_target = thread.secondMultipleValue();
            thread.resetMultipleValues();
            final SubLObject _prev_bind_0_$1 = pph_vars.$constant_link_function$.currentBinding(thread);
            final SubLObject _prev_bind_1_$2 = pph_vars.$html_generation_target$.currentBinding(thread);
            try {
                pph_vars.$constant_link_function$.bind(NIL != link_function ? link_function : pph_vars.$constant_link_function$.getDynamicValue(thread), thread);
                pph_vars.$html_generation_target$.bind(NIL != html_target ? html_target : pph_vars.$html_generation_target$.getDynamicValue(thread), thread);
                SubLObject cdolist_list_var = inference_datastructures_inference.inference_answer_justifications(inference_answer);
                SubLObject justification = NIL;
                justification = cdolist_list_var.first();
                while (NIL != cdolist_list_var) {
                    if (NIL == result) {
                        SubLObject cdolist_list_var_$3 = inference_datastructures_inference.inference_answer_justification_proofs(justification);
                        SubLObject proof = NIL;
                        proof = cdolist_list_var_$3.first();
                        while (NIL != cdolist_list_var_$3) {
                            if (NIL == result) {
                                final SubLObject proof_conclusion = pph_proof_conclusion(proof, query_mt);
                                final SubLObject javalist = pph_main.generate_phrase_for_java(proof_conclusion, $DEFAULT, $DECLARATIVE, language_mt, query_mt, UNPROVIDED);
                                if ((NIL != proof_conclusion) && (NIL != javalist)) {
                                    result = list(javalist, proof_conclusion);
                                }
                            }
                            cdolist_list_var_$3 = cdolist_list_var_$3.rest();
                            proof = cdolist_list_var_$3.first();
                        } 
                    }
                    cdolist_list_var = cdolist_list_var.rest();
                    justification = cdolist_list_var.first();
                } 
            } finally {
                pph_vars.$html_generation_target$.rebind(_prev_bind_1_$2, thread);
                pph_vars.$constant_link_function$.rebind(_prev_bind_0_$1, thread);
            }
        } finally {
            pph_vars.$pph_displayed_supports$.rebind(_prev_bind_10, thread);
            pph_vars.$pph_proof_depth$.rebind(_prev_bind_9, thread);
            pph_vars.$pph_justified_proofs$.rebind(_prev_bind_8, thread);
            pph_vars.$pph_displayed_proofs$.rebind(_prev_bind_7, thread);
            pph_vars.$pph_repositioned_proofs$.rebind(_prev_bind_6, thread);
            pph_vars.$pph_use_bulleted_listsP$.rebind(_prev_bind_5, thread);
            pph_vars.$pph_domain_mt$.rebind(_prev_bind_4, thread);
            pph_vars.$pph_handle_hypotheticalsP$.rebind(_prev_bind_3, thread);
            pph_vars.$pph_hypothetical_vars$.rebind(_prev_bind_2, thread);
            pph_vars.$pph_inference_answer$.rebind(_prev_bind_0, thread);
        }
        if (NIL == result) {
            Errors.error($str4$Couldn_t_generate_a_paraphrase_fo, problem_store_id, inference_id, answer_id);
        }
        return result;
    }

    public static SubLObject pph_show_inference_answer_proofs(final SubLObject inference_answer) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject inference = inference_datastructures_inference.inference_answer_inference(inference_answer);
        final SubLObject mt = pph_get_inference_mt(inference);
        SubLObject proof_num = ZERO_INTEGER;
        SubLObject done_proofs = NIL;
        final SubLObject _prev_bind_0 = pph_vars.$pph_inference_answer$.currentBinding(thread);
        final SubLObject _prev_bind_2 = pph_vars.$pph_hypothetical_vars$.currentBinding(thread);
        final SubLObject _prev_bind_3 = pph_vars.$pph_handle_hypotheticalsP$.currentBinding(thread);
        final SubLObject _prev_bind_4 = pph_vars.$pph_domain_mt$.currentBinding(thread);
        final SubLObject _prev_bind_5 = pph_vars.$pph_use_bulleted_listsP$.currentBinding(thread);
        final SubLObject _prev_bind_6 = pph_vars.$pph_repositioned_proofs$.currentBinding(thread);
        final SubLObject _prev_bind_7 = pph_vars.$pph_displayed_proofs$.currentBinding(thread);
        final SubLObject _prev_bind_8 = pph_vars.$pph_justified_proofs$.currentBinding(thread);
        final SubLObject _prev_bind_9 = pph_vars.$pph_proof_depth$.currentBinding(thread);
        final SubLObject _prev_bind_10 = pph_vars.$pph_displayed_supports$.currentBinding(thread);
        try {
            pph_vars.$pph_inference_answer$.bind(inference_answer, thread);
            pph_vars.$pph_hypothetical_vars$.bind(inference_datastructures_inference.inference_hypothetical_bindings(inference_datastructures_inference.inference_answer_inference(inference_answer)), thread);
            pph_vars.$pph_handle_hypotheticalsP$.bind(T, thread);
            pph_vars.$pph_domain_mt$.bind(pph_methods.pph_enhanced_domain_mt(pph_get_inference_mt(inference_datastructures_inference.inference_answer_inference(inference_answer)), UNPROVIDED), thread);
            pph_vars.$pph_use_bulleted_listsP$.bind(T, thread);
            pph_vars.$pph_repositioned_proofs$.bind(NIL, thread);
            pph_vars.$pph_displayed_proofs$.bind(find_or_create_pph_displayed_proof_stack(), thread);
            pph_vars.$pph_justified_proofs$.bind(find_or_create_pph_justified_proof_set(), thread);
            pph_vars.$pph_proof_depth$.bind(ZERO_INTEGER, thread);
            pph_vars.$pph_displayed_supports$.bind(NIL, thread);
            thread.resetMultipleValues();
            final SubLObject link_function = pph_macros.pph_justification_html_function_and_target();
            final SubLObject html_target = thread.secondMultipleValue();
            thread.resetMultipleValues();
            final SubLObject _prev_bind_0_$4 = pph_vars.$constant_link_function$.currentBinding(thread);
            final SubLObject _prev_bind_1_$5 = pph_vars.$html_generation_target$.currentBinding(thread);
            try {
                pph_vars.$constant_link_function$.bind(NIL != link_function ? link_function : pph_vars.$constant_link_function$.getDynamicValue(thread), thread);
                pph_vars.$html_generation_target$.bind(NIL != html_target ? html_target : pph_vars.$html_generation_target$.getDynamicValue(thread), thread);
                pph_macros.pph_possibly_enable_showXhide();
                SubLObject cdolist_list_var = inference_datastructures_inference.inference_answer_justifications(inference_answer);
                SubLObject justification = NIL;
                justification = cdolist_list_var.first();
                while (NIL != cdolist_list_var) {
                    SubLObject cdolist_list_var_$6 = inference_datastructures_inference.inference_answer_justification_proofs(justification);
                    SubLObject proof = NIL;
                    proof = cdolist_list_var_$6.first();
                    while (NIL != cdolist_list_var_$6) {
                        if (NIL == subl_promotions.memberP(proof, done_proofs, $sym5$PPH_PROOF__, UNPROVIDED)) {
                            final SubLObject index_string = princ_to_string(proof_num);
                            final SubLObject _prev_bind_0_$5 = pph_vars.$pph_non_explanatory_proofs$.currentBinding(thread);
                            try {
                                pph_vars.$pph_non_explanatory_proofs$.bind(inference_worker.proof_non_explanatory_subproofs(proof), thread);
                                pph_maybe_show_inference_proof_summary(proof, mt);
                                pph_show_inference_proof(proof, mt, index_string);
                            } finally {
                                pph_vars.$pph_non_explanatory_proofs$.rebind(_prev_bind_0_$5, thread);
                            }
                            done_proofs = cons(proof, done_proofs);
                            proof_num = add(proof_num, ONE_INTEGER);
                        }
                        cdolist_list_var_$6 = cdolist_list_var_$6.rest();
                        proof = cdolist_list_var_$6.first();
                    } 
                    cdolist_list_var = cdolist_list_var.rest();
                    justification = cdolist_list_var.first();
                } 
            } finally {
                pph_vars.$html_generation_target$.rebind(_prev_bind_1_$5, thread);
                pph_vars.$constant_link_function$.rebind(_prev_bind_0_$4, thread);
            }
        } finally {
            pph_vars.$pph_displayed_supports$.rebind(_prev_bind_10, thread);
            pph_vars.$pph_proof_depth$.rebind(_prev_bind_9, thread);
            pph_vars.$pph_justified_proofs$.rebind(_prev_bind_8, thread);
            pph_vars.$pph_displayed_proofs$.rebind(_prev_bind_7, thread);
            pph_vars.$pph_repositioned_proofs$.rebind(_prev_bind_6, thread);
            pph_vars.$pph_use_bulleted_listsP$.rebind(_prev_bind_5, thread);
            pph_vars.$pph_domain_mt$.rebind(_prev_bind_4, thread);
            pph_vars.$pph_handle_hypotheticalsP$.rebind(_prev_bind_3, thread);
            pph_vars.$pph_hypothetical_vars$.rebind(_prev_bind_2, thread);
            pph_vars.$pph_inference_answer$.rebind(_prev_bind_0, thread);
        }
        return inference_answer;
    }

    public static SubLObject pph_show_inference_answer_proof(final SubLObject inference_answer, SubLObject proof) {
        if (proof == UNPROVIDED) {
            proof = $FIND_BEST;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (((NIL != inference_datastructures_proof.proof_p(proof)) && (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread))) && (NIL == proof_of_inference_answer_p(proof, inference_answer))) {
            Errors.error($str7$_S_is_not_a_proof_of__S, proof, inference_answer);
        }
        final SubLObject inference = inference_datastructures_inference.inference_answer_inference(inference_answer);
        final SubLObject mt = pph_get_inference_mt(inference);
        final SubLObject proofs = inference_answer_get_proofs(inference_answer);
        final SubLObject best_proof = (NIL != inference_datastructures_proof.proof_p(proof)) ? proof : pph_find_best_proof(proofs);
        final SubLObject _prev_bind_0 = pph_vars.$pph_non_explanatory_proofs$.currentBinding(thread);
        final SubLObject _prev_bind_2 = pph_vars.$pph_inference_answer$.currentBinding(thread);
        final SubLObject _prev_bind_3 = pph_vars.$pph_hypothetical_vars$.currentBinding(thread);
        final SubLObject _prev_bind_4 = pph_vars.$pph_handle_hypotheticalsP$.currentBinding(thread);
        final SubLObject _prev_bind_5 = pph_vars.$pph_domain_mt$.currentBinding(thread);
        final SubLObject _prev_bind_6 = pph_vars.$pph_use_bulleted_listsP$.currentBinding(thread);
        final SubLObject _prev_bind_7 = pph_vars.$pph_repositioned_proofs$.currentBinding(thread);
        final SubLObject _prev_bind_8 = pph_vars.$pph_displayed_proofs$.currentBinding(thread);
        final SubLObject _prev_bind_9 = pph_vars.$pph_justified_proofs$.currentBinding(thread);
        final SubLObject _prev_bind_10 = pph_vars.$pph_proof_depth$.currentBinding(thread);
        final SubLObject _prev_bind_11 = pph_vars.$pph_displayed_supports$.currentBinding(thread);
        try {
            pph_vars.$pph_non_explanatory_proofs$.bind(inference_worker.proof_non_explanatory_subproofs(best_proof), thread);
            pph_vars.$pph_inference_answer$.bind(inference_answer, thread);
            pph_vars.$pph_hypothetical_vars$.bind(inference_datastructures_inference.inference_hypothetical_bindings(inference_datastructures_inference.inference_answer_inference(inference_answer)), thread);
            pph_vars.$pph_handle_hypotheticalsP$.bind(T, thread);
            pph_vars.$pph_domain_mt$.bind(pph_methods.pph_enhanced_domain_mt(pph_get_inference_mt(inference_datastructures_inference.inference_answer_inference(inference_answer)), UNPROVIDED), thread);
            pph_vars.$pph_use_bulleted_listsP$.bind(T, thread);
            pph_vars.$pph_repositioned_proofs$.bind(NIL, thread);
            pph_vars.$pph_displayed_proofs$.bind(find_or_create_pph_displayed_proof_stack(), thread);
            pph_vars.$pph_justified_proofs$.bind(find_or_create_pph_justified_proof_set(), thread);
            pph_vars.$pph_proof_depth$.bind(ZERO_INTEGER, thread);
            pph_vars.$pph_displayed_supports$.bind(NIL, thread);
            thread.resetMultipleValues();
            final SubLObject link_function = pph_macros.pph_justification_html_function_and_target();
            final SubLObject html_target = thread.secondMultipleValue();
            thread.resetMultipleValues();
            final SubLObject _prev_bind_0_$8 = pph_vars.$constant_link_function$.currentBinding(thread);
            final SubLObject _prev_bind_1_$9 = pph_vars.$html_generation_target$.currentBinding(thread);
            try {
                pph_vars.$constant_link_function$.bind(NIL != link_function ? link_function : pph_vars.$constant_link_function$.getDynamicValue(thread), thread);
                pph_vars.$html_generation_target$.bind(NIL != html_target ? html_target : pph_vars.$html_generation_target$.getDynamicValue(thread), thread);
                pph_macros.pph_possibly_enable_showXhide();
                pph_maybe_show_inference_proof_summary(best_proof, mt);
                pph_show_inference_proof(best_proof, mt, $$$proof);
            } finally {
                pph_vars.$html_generation_target$.rebind(_prev_bind_1_$9, thread);
                pph_vars.$constant_link_function$.rebind(_prev_bind_0_$8, thread);
            }
        } finally {
            pph_vars.$pph_displayed_supports$.rebind(_prev_bind_11, thread);
            pph_vars.$pph_proof_depth$.rebind(_prev_bind_10, thread);
            pph_vars.$pph_justified_proofs$.rebind(_prev_bind_9, thread);
            pph_vars.$pph_displayed_proofs$.rebind(_prev_bind_8, thread);
            pph_vars.$pph_repositioned_proofs$.rebind(_prev_bind_7, thread);
            pph_vars.$pph_use_bulleted_listsP$.rebind(_prev_bind_6, thread);
            pph_vars.$pph_domain_mt$.rebind(_prev_bind_5, thread);
            pph_vars.$pph_handle_hypotheticalsP$.rebind(_prev_bind_4, thread);
            pph_vars.$pph_hypothetical_vars$.rebind(_prev_bind_3, thread);
            pph_vars.$pph_inference_answer$.rebind(_prev_bind_2, thread);
            pph_vars.$pph_non_explanatory_proofs$.rebind(_prev_bind_0, thread);
        }
        return inference_answer;
    }

    public static SubLObject pph_inference_answer_justification_for_java(final SubLObject store_id, final SubLObject inference_id, final SubLObject answer_id, final SubLObject proof_suid) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject inference_answer = inference_datastructures_inference.find_inference_answer_by_ids(store_id, inference_id, answer_id);
        final SubLObject proof = inference_datastructures_problem_store.find_proof_by_ids(store_id, proof_suid);
        SubLObject justification_string = NIL;
        assert NIL != inference_datastructures_inference.inference_answer_p(inference_answer) : "inference_datastructures_inference.inference_answer_p(inference_answer) " + "CommonSymbols.NIL != inference_datastructures_inference.inference_answer_p(inference_answer) " + inference_answer;
        assert NIL != inference_datastructures_proof.proof_p(proof) : "inference_datastructures_proof.proof_p(proof) " + "CommonSymbols.NIL != inference_datastructures_proof.proof_p(proof) " + proof;
        SubLObject stream = NIL;
        try {
            stream = make_private_string_output_stream();
            final SubLObject _prev_bind_0 = html_macros.$html_stream$.currentBinding(thread);
            final SubLObject _prev_bind_2 = pph_vars.$pph_use_showXhideP$.currentBinding(thread);
            try {
                html_macros.$html_stream$.bind(stream, thread);
                pph_vars.$pph_use_showXhideP$.bind(NIL, thread);
                pph_show_inference_answer_proof(inference_answer, proof);
            } finally {
                pph_vars.$pph_use_showXhideP$.rebind(_prev_bind_2, thread);
                html_macros.$html_stream$.rebind(_prev_bind_0, thread);
            }
            justification_string = get_output_stream_string(stream);
        } finally {
            final SubLObject _prev_bind_3 = $is_thread_performing_cleanupP$.currentBinding(thread);
            try {
                $is_thread_performing_cleanupP$.bind(T, thread);
                final SubLObject _values = getValuesAsVector();
                close(stream, UNPROVIDED);
                restoreValuesFromVector(_values);
            } finally {
                $is_thread_performing_cleanupP$.rebind(_prev_bind_3, thread);
            }
        }
        return justification_string;
    }

    public static SubLObject pph_maybe_show_inference_proof_summary(final SubLObject proof, final SubLObject mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL == pph_templated_proofP(proof)) {
            final SubLObject proven_sentences = pph_proof_proven_sentences(proof, mt);
            if (NIL != list_utilities.lengthG(proven_sentences, ONE_INTEGER, UNPROVIDED)) {
                html_newline(UNPROVIDED);
                html_princ_strong($str11$Facts_Proved_);
                html_markup(html_macros.$html_unordered_list_head$.getGlobalValue());
                html_char(CHAR_greater, UNPROVIDED);
                final SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind(T, thread);
                    SubLObject cdolist_list_var = proven_sentences;
                    SubLObject proven_sentence = NIL;
                    proven_sentence = cdolist_list_var.first();
                    while (NIL != cdolist_list_var) {
                        html_markup(html_macros.$html_list_item_head$.getGlobalValue());
                        html_char(CHAR_greater, UNPROVIDED);
                        final SubLObject _prev_bind_0_$10 = html_macros.$html_safe_print$.currentBinding(thread);
                        try {
                            html_macros.$html_safe_print$.bind(T, thread);
                            pph_show_sentence(proven_sentence, UNPROVIDED, UNPROVIDED);
                        } finally {
                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$10, thread);
                        }
                        html_markup(html_macros.$html_list_item_tail$.getGlobalValue());
                        cdolist_list_var = cdolist_list_var.rest();
                        proven_sentence = cdolist_list_var.first();
                    } 
                } finally {
                    html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
                }
                html_markup(html_macros.$html_unordered_list_tail$.getGlobalValue());
                html_hr(UNPROVIDED, UNPROVIDED);
            }
            if (NIL != pph_vars.$pph_proof_show_facts_usedP$.getDynamicValue(thread)) {
                final SubLObject depth_cutoff = pph_vars.$pph_proof_show_facts_depth_cutoff$.getDynamicValue(thread);
                final SubLObject used_assertions = list_utilities.remove_if_not($sym12$GAF_ASSERTION_, pph_proof_used_assertions(proof, mt, depth_cutoff, UNPROVIDED), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                final SubLObject minimum_worth_showing = ONE_INTEGER;
                if (NIL != list_utilities.lengthGE(used_assertions, minimum_worth_showing, UNPROVIDED)) {
                    html_newline(UNPROVIDED);
                    if (NIL != depth_cutoff) {
                        html_princ_strong($$$Selected_);
                    }
                    html_princ_strong($str14$Facts_Used_from_Knowledge_Base_);
                    html_markup(html_macros.$html_unordered_list_head$.getGlobalValue());
                    html_char(CHAR_greater, UNPROVIDED);
                    final SubLObject _prev_bind_2 = html_macros.$html_safe_print$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind(T, thread);
                        SubLObject cdolist_list_var2 = used_assertions;
                        SubLObject used_assertion = NIL;
                        used_assertion = cdolist_list_var2.first();
                        while (NIL != cdolist_list_var2) {
                            html_markup(html_macros.$html_list_item_head$.getGlobalValue());
                            html_char(CHAR_greater, UNPROVIDED);
                            final SubLObject _prev_bind_0_$11 = html_macros.$html_safe_print$.currentBinding(thread);
                            try {
                                html_macros.$html_safe_print$.bind(T, thread);
                                pph_show_assertion(used_assertion);
                            } finally {
                                html_macros.$html_safe_print$.rebind(_prev_bind_0_$11, thread);
                            }
                            html_markup(html_macros.$html_list_item_tail$.getGlobalValue());
                            cdolist_list_var2 = cdolist_list_var2.rest();
                            used_assertion = cdolist_list_var2.first();
                        } 
                    } finally {
                        html_macros.$html_safe_print$.rebind(_prev_bind_2, thread);
                    }
                    html_markup(html_macros.$html_unordered_list_tail$.getGlobalValue());
                    html_hr(UNPROVIDED, UNPROVIDED);
                }
            }
        }
        return proof;
    }

    public static SubLObject pph_proof_used_assertions(final SubLObject proof, final SubLObject mt, SubLObject depth_cutoff, SubLObject strict_cutoffP) {
        if (depth_cutoff == UNPROVIDED) {
            depth_cutoff = NIL;
        }
        if (strict_cutoffP == UNPROVIDED) {
            strict_cutoffP = T;
        }
        SubLObject used_assertions = NIL;
        if (NIL != inference_worker.structural_proof_p(proof)) {
            used_assertions = pph_proof_used_assertions_from_subproofs(proof, mt, depth_cutoff, strict_cutoffP);
        } else
            if (NIL == sksi_proof_p(proof)) {
                if (NIL != inference_worker_removal.removal_proof_p(proof)) {
                    used_assertions = pph_proof_used_assertions_from_supports(proof, mt, depth_cutoff, strict_cutoffP);
                } else
                    if (NIL != inference_worker_transformation.transformation_proof_p(proof)) {
                        used_assertions = list_utilities.delete_if_not($sym15$ASSERTED_ASSERTION_, append(pph_proof_used_assertions_from_supports(proof, mt, depth_cutoff, strict_cutoffP), pph_proof_used_assertions_from_subproofs(proof, mt, NIL != subl_promotions.non_negative_integer_p(depth_cutoff) ? number_utilities.f_1_(depth_cutoff) : depth_cutoff, strict_cutoffP)), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                    }

            }

        return delete_if($sym16$PPH_IRRELEVANT_SUPPORT_, delete_duplicates(used_assertions, symbol_function(EQUAL), symbol_function(PPH_SUPPORT_EL_SENTENCE), UNPROVIDED, UNPROVIDED), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject pph_proof_used_assertions_from_subproofs(final SubLObject proof, final SubLObject mt, final SubLObject depth_cutoff, final SubLObject strict_cutoffP) {
        SubLObject used_assertions = NIL;
        SubLObject cdolist_list_var = pph_proof_subproofs(proof);
        SubLObject subproof = NIL;
        subproof = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            SubLObject cdolist_list_var_$12 = pph_proof_used_assertions(subproof, mt, depth_cutoff, strict_cutoffP);
            SubLObject as = NIL;
            as = cdolist_list_var_$12.first();
            while (NIL != cdolist_list_var_$12) {
                used_assertions = cons(as, used_assertions);
                cdolist_list_var_$12 = cdolist_list_var_$12.rest();
                as = cdolist_list_var_$12.first();
            } 
            cdolist_list_var = cdolist_list_var.rest();
            subproof = cdolist_list_var.first();
        } 
        used_assertions = nreverse(used_assertions);
        return used_assertions;
    }

    public static SubLObject pph_proof_used_assertions_from_supports(final SubLObject proof, final SubLObject mt, final SubLObject depth_cutoff, final SubLObject strict_cutoffP) {
        SubLObject used_assertions = NIL;
        SubLObject cdolist_list_var = pph_sub_isomorphic_assertions_into_supports(inference_datastructures_proof.proof_supports(proof));
        SubLObject support = NIL;
        support = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            SubLObject cdolist_list_var_$13 = pph_meta_supports_from_tree(pph_meta_support_tree(support, set.new_set(UNPROVIDED, UNPROVIDED)), depth_cutoff, strict_cutoffP, UNPROVIDED, UNPROVIDED);
            SubLObject meta_support = NIL;
            meta_support = cdolist_list_var_$13.first();
            while (NIL != cdolist_list_var_$13) {
                if ((NIL != assertion_handles.assertion_p(meta_support)) && (NIL == pph_hypothesized_supportP(meta_support, mt))) {
                    used_assertions = cons(meta_support, used_assertions);
                }
                cdolist_list_var_$13 = cdolist_list_var_$13.rest();
                meta_support = cdolist_list_var_$13.first();
            } 
            cdolist_list_var = cdolist_list_var.rest();
            support = cdolist_list_var.first();
        } 
        return used_assertions;
    }

    public static SubLObject pph_proof_used_external_supports(final SubLObject proof, final SubLObject mt, SubLObject depth_cutoff, SubLObject strict_cutoffP) {
        if (depth_cutoff == UNPROVIDED) {
            depth_cutoff = NIL;
        }
        if (strict_cutoffP == UNPROVIDED) {
            strict_cutoffP = T;
        }
        SubLObject external_supports = NIL;
        if (NIL != inference_worker.structural_proof_p(proof)) {
            external_supports = pph_proof_external_supports_from_subproofs(proof, mt, depth_cutoff, strict_cutoffP);
        } else
            if (NIL != sksi_proof_p(proof)) {
                external_supports = pph_proof_external_supports_from_supports(proof, mt, depth_cutoff, strict_cutoffP);
            } else
                if (NIL == inference_worker_removal.removal_proof_p(proof)) {
                    if (NIL != inference_worker_transformation.transformation_proof_p(proof)) {
                        external_supports = list_utilities.delete_if_not(HL_SUPPORT_P, append(pph_proof_external_supports_from_supports(proof, mt, depth_cutoff, strict_cutoffP), pph_proof_external_supports_from_subproofs(proof, mt, NIL != subl_promotions.non_negative_integer_p(depth_cutoff) ? number_utilities.f_1_(depth_cutoff) : depth_cutoff, strict_cutoffP)), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                    }
                }


        return delete_if($sym16$PPH_IRRELEVANT_SUPPORT_, delete_duplicates(external_supports, symbol_function(EQUAL), UNPROVIDED, UNPROVIDED, UNPROVIDED), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject pph_proof_external_supports_from_subproofs(final SubLObject proof, final SubLObject mt, final SubLObject depth_cutoff, final SubLObject strict_cutoffP) {
        SubLObject external_supports = NIL;
        SubLObject cdolist_list_var = pph_proof_subproofs(proof);
        SubLObject subproof = NIL;
        subproof = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            SubLObject cdolist_list_var_$14 = pph_proof_used_external_supports(subproof, mt, depth_cutoff, strict_cutoffP);
            SubLObject support = NIL;
            support = cdolist_list_var_$14.first();
            while (NIL != cdolist_list_var_$14) {
                final SubLObject item_var = support;
                if (NIL == member(item_var, external_supports, symbol_function(EQUAL), symbol_function(IDENTITY))) {
                    external_supports = cons(item_var, external_supports);
                }
                cdolist_list_var_$14 = cdolist_list_var_$14.rest();
                support = cdolist_list_var_$14.first();
            } 
            cdolist_list_var = cdolist_list_var.rest();
            subproof = cdolist_list_var.first();
        } 
        external_supports = nreverse(external_supports);
        return external_supports;
    }

    public static SubLObject pph_proof_external_supports_from_supports(final SubLObject proof, final SubLObject mt, final SubLObject depth_cutoff, final SubLObject strict_cutoffP) {
        SubLObject external_supports = NIL;
        SubLObject cdolist_list_var = pph_sub_isomorphic_assertions_into_supports(inference_datastructures_proof.proof_supports(proof));
        SubLObject support = NIL;
        support = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            SubLObject cdolist_list_var_$15 = pph_meta_supports_from_tree(pph_meta_support_tree(support, set.new_set(UNPROVIDED, UNPROVIDED)), depth_cutoff, strict_cutoffP, UNPROVIDED, UNPROVIDED);
            SubLObject meta_support = NIL;
            meta_support = cdolist_list_var_$15.first();
            while (NIL != cdolist_list_var_$15) {
                if (NIL != proof_view.proof_view_external_support_p(meta_support)) {
                    final SubLObject item_var = meta_support;
                    if (NIL == member(item_var, external_supports, symbol_function(EQUAL), symbol_function(IDENTITY))) {
                        external_supports = cons(item_var, external_supports);
                    }
                }
                cdolist_list_var_$15 = cdolist_list_var_$15.rest();
                meta_support = cdolist_list_var_$15.first();
            } 
            cdolist_list_var = cdolist_list_var.rest();
            support = cdolist_list_var.first();
        } 
        return external_supports;
    }

    public static SubLObject sksi_proof_p(final SubLObject proof) {
        if (NIL != inference_worker.content_proof_p(proof)) {
            final SubLObject hl_module = inference_worker.content_proof_hl_module(proof);
            return makeBoolean((NIL != inference_modules.hl_module_p(hl_module)) && (NIL != member($SKSI, inference_modules.hl_module_subtypes(hl_module), UNPROVIDED, UNPROVIDED)));
        }
        return NIL;
    }

    public static SubLObject pph_meta_supports_from_tree(final SubLObject support_tree, SubLObject depth_cutoff, SubLObject strict_cutoffP, SubLObject current_depth, SubLObject terminal_onlyP) {
        if (depth_cutoff == UNPROVIDED) {
            depth_cutoff = NIL;
        }
        if (strict_cutoffP == UNPROVIDED) {
            strict_cutoffP = T;
        }
        if (current_depth == UNPROVIDED) {
            current_depth = ZERO_INTEGER;
        }
        if (terminal_onlyP == UNPROVIDED) {
            terminal_onlyP = NIL;
        }
        SubLObject meta_supports = NIL;
        final SubLObject depth_cutoff_exceededP = makeBoolean(depth_cutoff.isInteger() && current_depth.numG(depth_cutoff));
        if (NIL != pph_support_tree_p(support_tree)) {
            if ((NIL == strict_cutoffP) || (NIL == depth_cutoff_exceededP)) {
                SubLObject cdolist_list_var = pph_support_tree_supporters(support_tree);
                SubLObject meta_support_tree = NIL;
                meta_support_tree = cdolist_list_var.first();
                while (NIL != cdolist_list_var) {
                    SubLObject cdolist_list_var_$16 = pph_meta_supports_from_tree(meta_support_tree, depth_cutoff, strict_cutoffP, number_utilities.f_1X(current_depth), terminal_onlyP);
                    SubLObject meta_support = NIL;
                    meta_support = cdolist_list_var_$16.first();
                    while (NIL != cdolist_list_var_$16) {
                        if ((NIL == depth_cutoff_exceededP) || (NIL != pph_exempted_supportP(meta_support))) {
                            meta_supports = cons(meta_support, meta_supports);
                        }
                        cdolist_list_var_$16 = cdolist_list_var_$16.rest();
                        meta_support = cdolist_list_var_$16.first();
                    } 
                    cdolist_list_var = cdolist_list_var.rest();
                    meta_support_tree = cdolist_list_var.first();
                } 
            }
            if ((NIL == terminal_onlyP) || (NIL == meta_supports)) {
                meta_supports = cons(pph_support_tree_supported(support_tree), meta_supports);
            }
        }
        return delete_duplicates(meta_supports, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject pph_terminal_meta_supports_from_tree(final SubLObject support_tree, SubLObject depth_cutoff, SubLObject strict_cutoffP, SubLObject current_depth) {
        if (depth_cutoff == UNPROVIDED) {
            depth_cutoff = NIL;
        }
        if (strict_cutoffP == UNPROVIDED) {
            strict_cutoffP = T;
        }
        if (current_depth == UNPROVIDED) {
            current_depth = ZERO_INTEGER;
        }
        return pph_meta_supports_from_tree(support_tree, depth_cutoff, strict_cutoffP, current_depth, T);
    }

    public static SubLObject pph_exempted_supportP(final SubLObject support) {
        if ((NIL != assertion_handles.assertion_p(support)) && (NIL != sources.assertion_sourcedP(support))) {
            return T;
        }
        return NIL;
    }

    public static SubLObject pph_proof_proven_sentences(final SubLObject proof, final SubLObject mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject proven_sentences = NIL;
        if (NIL != inference_worker.structural_proof_p(proof)) {
            SubLObject cdolist_list_var = pph_proof_subproofs(proof);
            SubLObject subproof = NIL;
            subproof = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                SubLObject cdolist_list_var_$17 = pph_proof_proven_sentences(subproof, mt);
                SubLObject sentence = NIL;
                sentence = cdolist_list_var_$17.first();
                while (NIL != cdolist_list_var_$17) {
                    proven_sentences = cons(sentence, proven_sentences);
                    cdolist_list_var_$17 = cdolist_list_var_$17.rest();
                    sentence = cdolist_list_var_$17.first();
                } 
                cdolist_list_var = cdolist_list_var.rest();
                subproof = cdolist_list_var.first();
            } 
            proven_sentences = nreverse(proven_sentences);
        } else
            if (NIL != pph_real_or_quasi_transformation_proof_p(proof)) {
                proven_sentences = cons(pph_proof_el_formula(proof, mt), proven_sentences);
                proven_sentences = append(pph_real_or_quasi_transformation_proof_intermediate_conclusions(proof, mt), proven_sentences);
            }

        final SubLObject _prev_bind_0 = pph_vars.$pph_domain_mt$.currentBinding(thread);
        try {
            pph_vars.$pph_domain_mt$.bind(mt, thread);
            proven_sentences = delete_if($sym20$PPH_TRIVIAL_SENTENCE_, delete_if($sym21$PPH_IRRELEVANT_FORMULA_, delete_duplicates(proven_sentences, symbol_function(EQUAL), symbol_function(PPH_PROOF_PROVEN_SENTENCE_EL_SENTENCE), UNPROVIDED, UNPROVIDED), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        } finally {
            pph_vars.$pph_domain_mt$.rebind(_prev_bind_0, thread);
        }
        return proven_sentences;
    }

    public static SubLObject pph_proof_proven_sentence_el_sentence(final SubLObject sentence) {
        if (NIL != assertion_handles.assertion_p(sentence)) {
            return pph_support_el_sentence(sentence);
        }
        return sentence;
    }

    public static SubLObject inference_answer_get_proofs(final SubLObject inference_answer) {
        assert NIL != inference_datastructures_inference.inference_answer_p(inference_answer) : "inference_datastructures_inference.inference_answer_p(inference_answer) " + "CommonSymbols.NIL != inference_datastructures_inference.inference_answer_p(inference_answer) " + inference_answer;
        SubLObject proofs = NIL;
        SubLObject cdolist_list_var = inference_datastructures_inference.inference_answer_justifications(inference_answer);
        SubLObject justification = NIL;
        justification = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            proofs = cons(pph_pick_justification_proof(justification), proofs);
            cdolist_list_var = cdolist_list_var.rest();
            justification = cdolist_list_var.first();
        } 
        return proofs;
    }

    public static SubLObject pph_pick_justification_proof(final SubLObject justification) {
        return inference_datastructures_inference.inference_answer_justification_first_proof(justification);
    }

    public static SubLObject pph_preferable_and_equal_proofP(final SubLObject proof1, final SubLObject proof2) {
        return makeBoolean((NIL != pph_proof_E(proof1, proof2)) && (NIL != list_utilities.greater_length_p(abduction.proof_abductions(proof2), abduction.proof_abductions(proof1))));
    }

    public static SubLObject inference_answer_get_justification_with_proof(final SubLObject inference_answer, final SubLObject proof) {
        assert NIL != inference_datastructures_inference.inference_answer_p(inference_answer) : "inference_datastructures_inference.inference_answer_p(inference_answer) " + "CommonSymbols.NIL != inference_datastructures_inference.inference_answer_p(inference_answer) " + inference_answer;
        assert NIL != inference_datastructures_proof.proof_p(proof) : "inference_datastructures_proof.proof_p(proof) " + "CommonSymbols.NIL != inference_datastructures_proof.proof_p(proof) " + proof;
        SubLObject cdolist_list_var = inference_datastructures_inference.inference_answer_justifications(inference_answer);
        SubLObject justification = NIL;
        justification = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            SubLObject cdolist_list_var_$18 = inference_datastructures_inference.inference_answer_justification_proofs(justification);
            SubLObject real_proof = NIL;
            real_proof = cdolist_list_var_$18.first();
            while (NIL != cdolist_list_var_$18) {
                if (proof.eql(real_proof)) {
                    return justification;
                }
                cdolist_list_var_$18 = cdolist_list_var_$18.rest();
                real_proof = cdolist_list_var_$18.first();
            } 
            cdolist_list_var = cdolist_list_var.rest();
            justification = cdolist_list_var.first();
        } 
        return NIL;
    }

    public static SubLObject pph_find_best_proof(final SubLObject proofs) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject ans = NIL;
        final SubLObject local_state;
        final SubLObject state = local_state = memoization_state.new_memoization_state(UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        final SubLObject _prev_bind_0 = memoization_state.$memoization_state$.currentBinding(thread);
        try {
            memoization_state.$memoization_state$.bind(local_state, thread);
            final SubLObject original_memoization_process = memoization_state.memoization_state_original_process(local_state);
            try {
                ans = list_utilities.extremal(proofs, $sym23$_, PPH_PROOF_DEPTH);
            } finally {
                final SubLObject _prev_bind_0_$19 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    memoization_state.memoization_state_possibly_clear_original_process(local_state, original_memoization_process);
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$19, thread);
                }
            }
        } finally {
            memoization_state.$memoization_state$.rebind(_prev_bind_0, thread);
        }
        return ans;
    }

    public static SubLObject pph_proof_depth(final SubLObject proof) {
        return pph_proof_depth_memoized(proof);
    }

    public static SubLObject pph_proof_depth_memoized_internal(final SubLObject proof) {
        if (NIL == inference_datastructures_proof.proof_direct_subproofs(proof)) {
            return ONE_INTEGER;
        }
        return number_utilities.f_1X(number_utilities.maximum(Mapping.mapcar(PPH_PROOF_DEPTH_MEMOIZED, inference_datastructures_proof.proof_direct_subproofs(proof)), UNPROVIDED));
    }

    public static SubLObject pph_proof_depth_memoized(final SubLObject proof) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
        SubLObject caching_state = NIL;
        if (NIL == v_memoization_state) {
            return pph_proof_depth_memoized_internal(proof);
        }
        caching_state = memoization_state.memoization_state_lookup(v_memoization_state, PPH_PROOF_DEPTH_MEMOIZED, UNPROVIDED);
        if (NIL == caching_state) {
            caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), PPH_PROOF_DEPTH_MEMOIZED, ONE_INTEGER, NIL, EQ, UNPROVIDED);
            memoization_state.memoization_state_put(v_memoization_state, PPH_PROOF_DEPTH_MEMOIZED, caching_state);
        }
        SubLObject results = memoization_state.caching_state_lookup(caching_state, proof, memoization_state.$memoized_item_not_found$.getGlobalValue());
        if (results.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            results = arg2(thread.resetMultipleValues(), multiple_value_list(pph_proof_depth_memoized_internal(proof)));
            memoization_state.caching_state_put(caching_state, proof, results, UNPROVIDED);
        }
        return memoization_state.caching_results(results);
    }

    public static SubLObject pph_proof_E(final SubLObject proof1, final SubLObject proof2) {
        final SubLObject supports1 = inference_datastructures_proof.proof_direct_supports(proof1);
        final SubLObject supports2 = inference_datastructures_proof.proof_direct_supports(proof2);
        return makeBoolean(((((NIL != list_utilities.same_length_p(supports1, supports2)) && (NIL != list_utilities.proper_list_p(supports1))) && (NIL != arguments.hl_justification_p(supports1))) && (NIL != arguments.hl_justification_p(supports2))) && (NIL == set_difference(supports1, supports2, symbol_function(EQUAL), SUPPORT_SENTENCE)));
    }

    public static SubLObject pph_irrelevant_warn(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject cycl = NIL;
        SubLObject format_string = NIL;
        destructuring_bind_must_consp(current, datum, $list27);
        cycl = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list27);
        format_string = current.first();
        final SubLObject args;
        current = args = current.rest();
        return list(PWHEN, $sym29$_PPH_IRRELEVANT_WARN__, listS(WARN, list(CCONCATENATE, list(FORMAT_NIL, $str33$PPH_irrelevant_formula_____S__, cycl), format_string), append(args, NIL)));
    }

    public static SubLObject pph_show_inference_proof(final SubLObject proof, final SubLObject mt, SubLObject proof_index_string) {
        if (proof_index_string == UNPROVIDED) {
            proof_index_string = $$$proof;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject query_el_formula = pph_proof_el_formula(proof, mt);
        final SubLObject proof_conclusion = pph_proof_conclusion(proof, mt);
        final SubLObject _prev_bind_0 = pph_vars.$pph_domain_mt$.currentBinding(thread);
        final SubLObject _prev_bind_2 = pph_vars.$pph_proof_depth$.currentBinding(thread);
        try {
            pph_vars.$pph_domain_mt$.bind(mt, thread);
            pph_vars.$pph_proof_depth$.bind(number_utilities.f_1X(pph_vars.$pph_proof_depth$.getDynamicValue(thread)), thread);
            thread.resetMultipleValues();
            final SubLObject analogous_to_lastP = pph_proofs_analogousP(proof, pph_most_recent_proof_displayed(), mt);
            final SubLObject diffs = thread.secondMultipleValue();
            thread.resetMultipleValues();
            if (NIL == member(proof, pph_vars.$pph_repositioned_proofs$.getDynamicValue(thread), UNPROVIDED, UNPROVIDED)) {
                if (NIL != inference_worker.structural_proof_p(proof)) {
                    SubLObject list_var = NIL;
                    SubLObject subproof = NIL;
                    SubLObject i = NIL;
                    list_var = pph_proof_subproofs(proof);
                    subproof = list_var.first();
                    for (i = ZERO_INTEGER; NIL != list_var; list_var = list_var.rest() , subproof = list_var.first() , i = add(ONE_INTEGER, i)) {
                        final SubLObject index_string = cconcatenate(proof_index_string, princ_to_string(i));
                        final SubLObject _prev_bind_0_$20 = pph_vars.$pph_proof_depth$.currentBinding(thread);
                        try {
                            pph_vars.$pph_proof_depth$.bind(number_utilities.f_1_(pph_vars.$pph_proof_depth$.getDynamicValue(thread)), thread);
                            pph_show_inference_proof(subproof, mt, index_string);
                        } finally {
                            pph_vars.$pph_proof_depth$.rebind(_prev_bind_0_$20, thread);
                        }
                    }
                    pph_note_proof_displayed(proof);
                } else
                    if (NIL != pph_trivial_sentenceP(query_el_formula, mt)) {
                        if (NIL != pph_vars.$pph_show_trivial_proofsP$.getDynamicValue(thread)) {
                            pph_show_trivial_proof(proof, mt);
                        }
                        pph_note_proof_displayed(proof);
                    } else
                        if ((NIL != analogous_to_lastP) && (NIL != pph_utilities.pph_english_contextP(UNPROVIDED))) {
                            pph_show_analogous_proof(proof, mt, diffs);
                        } else
                            if (NIL != pph_proof_already_displayed_p(proof)) {
                                html_newline(UNPROVIDED);
                                pph_show_proof_conclusion_int(proof_conclusion);
                                if (NIL != pph_proof_already_justified_p(proof)) {
                                    pph_proof_show_see_above(proof_index_string);
                                }
                            } else
                                if (NIL == pph_irrelevant_formulaP(query_el_formula, UNPROVIDED, UNPROVIDED)) {
                                    if (NIL == pph_justify_proofP(proof, mt, UNPROVIDED)) {
                                        html_newline(UNPROVIDED);
                                        pph_show_proof_conclusion_int(proof_conclusion);
                                        pph_note_proof_displayed(proof);
                                    } else
                                        if ((NIL != pph_proof_wX_isomorphic_support_p(proof)) && (NIL == pph_quasi_transformation_proof_p(proof))) {
                                            final SubLObject supports = inference_datastructures_proof.proof_supports(proof);
                                            if (pph_vars.$pph_proof_depth$.getDynamicValue(thread).isPositive()) {
                                                html_markup(html_macros.$html_list_item_head$.getGlobalValue());
                                                html_char(CHAR_greater, UNPROVIDED);
                                                final SubLObject _prev_bind_0_$21 = html_macros.$html_safe_print$.currentBinding(thread);
                                                try {
                                                    html_macros.$html_safe_print$.bind(T, thread);
                                                    pph_show_argument(supports, proof_index_string);
                                                } finally {
                                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$21, thread);
                                                }
                                                html_markup(html_macros.$html_list_item_tail$.getGlobalValue());
                                            } else {
                                                html_newline(UNPROVIDED);
                                                pph_show_argument(supports, proof_index_string);
                                            }
                                            pph_note_proof_displayed(proof);
                                        } else {
                                            final SubLObject style = $SUPPORTS_AND_CONCLUSION;
                                            if (NIL != pph_top_level_proof_p()) {
                                                pph_show_proof_query_and_supports(proof, query_el_formula, mt, proof_index_string, style);
                                            } else {
                                                html_markup(html_macros.$html_list_item_head$.getGlobalValue());
                                                html_char(CHAR_greater, UNPROVIDED);
                                                final SubLObject _prev_bind_0_$22 = html_macros.$html_safe_print$.currentBinding(thread);
                                                try {
                                                    html_macros.$html_safe_print$.bind(T, thread);
                                                    pph_show_proof_query_and_supports(proof, query_el_formula, mt, proof_index_string, style);
                                                } finally {
                                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$22, thread);
                                                }
                                                html_markup(html_macros.$html_list_item_tail$.getGlobalValue());
                                            }
                                            pph_note_proof_displayed(proof);
                                        }

                                }




            }
        } finally {
            pph_vars.$pph_proof_depth$.rebind(_prev_bind_2, thread);
            pph_vars.$pph_domain_mt$.rebind(_prev_bind_0, thread);
        }
        return proof;
    }

    public static SubLObject pph_top_level_proof_p() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return numE(pph_vars.$pph_proof_depth$.getDynamicValue(thread), pph_vars.$pph_top_level_proof_depth$.getGlobalValue());
    }

    public static SubLObject pph_proof_show_see_above(final SubLObject index_string) {
        pph_proof_show_short_attribution($$$See_above, index_string);
        return NIL;
    }

    public static SubLObject pph_proof_show_hypothetical_attribution(final SubLObject index_string) {
        pph_proof_show_short_attribution($$$From_question, index_string);
        return NIL;
    }

    public static SubLObject pph_proof_show_short_attribution(final SubLObject attribution_text, final SubLObject index_string) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != pph_vars.$pph_use_showXhideP$.getDynamicValue(thread)) {
            final SubLObject object_id = cconcatenate($str37$see_above_, index_string);
            html_markup(dhtml_macros.$dhtml_css_head$.getGlobalValue());
            html_markup(dhtml_macros.$dhtml_css_type$.getGlobalValue());
            html_char(CHAR_quotation, UNPROVIDED);
            html_markup($str38$text_css);
            html_char(CHAR_quotation, UNPROVIDED);
            html_markup(dhtml_macros.$dhtml_css_media$.getGlobalValue());
            html_char(CHAR_quotation, UNPROVIDED);
            html_markup($$$screen);
            html_char(CHAR_quotation, UNPROVIDED);
            html_char(CHAR_greater, UNPROVIDED);
            SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
            try {
                html_macros.$html_safe_print$.bind(T, thread);
                html_terpri(UNPROVIDED);
                dhtml_macros.dhtml_dom_wrapper_preamble(object_id);
                dhtml_macros.dhtml_dom_attribute_preamble(dhtml_macros.$dhtml_dom_display$.getGlobalValue());
                html_markup($$$none);
                dhtml_macros.dhtml_dom_attribute_postamble();
                dhtml_macros.dhtml_dom_wrapper_postamble();
                html_terpri(UNPROVIDED);
            } finally {
                html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
            }
            html_markup(dhtml_macros.$dhtml_css_tail$.getGlobalValue());
            html_terpri(UNPROVIDED);
            html_indent(TWO_INTEGER);
            dhtml_macros.dhtml_switch_visibility_links_arrows(object_id, $str41$);
            dhtml_macros.dhtml_set_switched_visibility(object_id, $INVISIBLE, $TEXT);
            html_markup(html_macros.$html_div_head$.getGlobalValue());
            if (NIL != object_id) {
                html_markup(html_macros.$html_attribute_id$.getGlobalValue());
                html_char(CHAR_quotation, UNPROVIDED);
                html_markup(object_id);
                html_char(CHAR_quotation, UNPROVIDED);
            }
            html_char(CHAR_greater, UNPROVIDED);
            _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
            try {
                html_macros.$html_safe_print$.bind(T, thread);
                html_markup(html_macros.$html_unordered_list_head$.getGlobalValue());
                html_char(CHAR_greater, UNPROVIDED);
                final SubLObject _prev_bind_0_$23 = html_macros.$html_safe_print$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind(T, thread);
                    html_markup(html_macros.$html_list_item_head$.getGlobalValue());
                    html_char(CHAR_greater, UNPROVIDED);
                    final SubLObject _prev_bind_0_$24 = html_macros.$html_safe_print$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind(T, thread);
                        html_markup(html_macros.$html_italic_head$.getGlobalValue());
                        html_princ(attribution_text);
                        html_markup(html_macros.$html_italic_tail$.getGlobalValue());
                    } finally {
                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$24, thread);
                    }
                    html_markup(html_macros.$html_list_item_tail$.getGlobalValue());
                } finally {
                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$23, thread);
                }
                html_markup(html_macros.$html_unordered_list_tail$.getGlobalValue());
            } finally {
                html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
            }
            html_markup(html_macros.$html_div_tail$.getGlobalValue());
            html_source_readability_terpri(UNPROVIDED);
        } else {
            html_indent(UNPROVIDED);
            html_markup(html_macros.$html_italic_head$.getGlobalValue());
            format(html_macros.$html_stream$.getDynamicValue(thread), $str44$__A_, attribution_text);
            html_markup(html_macros.$html_italic_tail$.getGlobalValue());
        }
        return NIL;
    }

    public static SubLObject pph_justify_proofP(final SubLObject proof, final SubLObject mt, SubLObject done_proofs) {
        if (done_proofs == UNPROVIDED) {
            done_proofs = set.new_set(UNPROVIDED, UNPROVIDED);
        }
        if (NIL != pph_proof_already_displayed_p(proof)) {
            return NIL;
        }
        if (NIL != pph_real_or_quasi_transformation_proof_p(proof)) {
            return T;
        }
        if (NIL != pph_displayworthy_supports(proof, NIL, NIL, NIL, mt)) {
            return T;
        }
        if (NIL != pph_proof_wX_isomorphic_support_p(proof)) {
            return NIL;
        }
        if (NIL != pph_trivial_sentenceP(pph_proof_el_formula(proof, mt), mt)) {
            return NIL;
        }
        set.set_add(proof, done_proofs);
        SubLObject cdolist_list_var = inference_datastructures_proof.proof_direct_subproofs(proof);
        SubLObject subproof = NIL;
        subproof = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if ((NIL == set.set_memberP(subproof, done_proofs)) && (NIL != pph_justify_proofP(subproof, mt, done_proofs))) {
                return T;
            }
            cdolist_list_var = cdolist_list_var.rest();
            subproof = cdolist_list_var.first();
        } 
        return NIL;
    }

    public static SubLObject find_or_create_pph_displayed_proof_stack() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != stacks.stack_p(pph_vars.$pph_displayed_proofs$.getDynamicValue(thread))) {
            return pph_vars.$pph_displayed_proofs$.getDynamicValue(thread);
        }
        return stacks.create_stack();
    }

    public static SubLObject pph_note_proof_displayed(final SubLObject proof) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != stacks.stack_p(pph_vars.$pph_displayed_proofs$.getDynamicValue(thread))) {
            stacks.stack_push(proof, pph_vars.$pph_displayed_proofs$.getDynamicValue(thread));
            SubLObject cdolist_list_var = inference_datastructures_proof.proof_direct_subproofs(proof);
            SubLObject subproof = NIL;
            subproof = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                pph_note_proof_displayed(subproof);
                cdolist_list_var = cdolist_list_var.rest();
                subproof = cdolist_list_var.first();
            } 
        }
        return proof;
    }

    public static SubLObject pph_most_recent_proof_displayed() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return NIL != stacks.stack_p(pph_vars.$pph_displayed_proofs$.getDynamicValue(thread)) ? stacks.stack_peek(pph_vars.$pph_displayed_proofs$.getDynamicValue(thread)) : NIL;
    }

    public static SubLObject pph_proof_already_displayed_p(final SubLObject proof) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return makeBoolean((NIL != stacks.stack_p(pph_vars.$pph_displayed_proofs$.getDynamicValue(thread))) && (NIL != stacks.stack_find(inference_worker.proof_proven_query(proof), pph_vars.$pph_displayed_proofs$.getDynamicValue(thread), $sym45$PPH_PROOF_QUERY_EQUAL_, PROOF_PROVEN_QUERY)));
    }

    public static SubLObject pph_proof_query_equalP(final SubLObject query1, final SubLObject query2) {
        SubLObject differentP = makeBoolean(NIL == list_utilities.same_length_p(query1, query2));
        if (NIL == differentP) {
            SubLObject clause1 = NIL;
            SubLObject clause1_$25 = NIL;
            SubLObject clause2 = NIL;
            SubLObject clause2_$26 = NIL;
            clause1 = query1;
            clause1_$25 = clause1.first();
            clause2 = query2;
            clause2_$26 = clause2.first();
            while ((NIL == differentP) && ((NIL != clause2) || (NIL != clause1))) {
                if ((NIL == pph_proof_lits_equal(clauses.neg_lits(clause1_$25), clauses.neg_lits(clause2_$26))) || (NIL == pph_proof_lits_equal(clauses.pos_lits(clause1_$25), clauses.pos_lits(clause2_$26)))) {
                    differentP = T;
                }
                clause1 = clause1.rest();
                clause1_$25 = clause1.first();
                clause2 = clause2.rest();
                clause2_$26 = clause2.first();
            } 
        }
        return makeBoolean(NIL == differentP);
    }

    public static SubLObject pph_proof_lits_equal(final SubLObject lits1, final SubLObject lits2) {
        SubLObject differentP = NIL;
        differentP = makeBoolean(NIL == list_utilities.same_length_p(lits1, lits2));
        if (NIL == differentP) {
            SubLObject lit1 = NIL;
            SubLObject lit1_$27 = NIL;
            SubLObject lit2 = NIL;
            SubLObject lit2_$28 = NIL;
            lit1 = lits1;
            lit1_$27 = lit1.first();
            lit2 = lits2;
            lit2_$28 = lit2.first();
            while ((NIL == differentP) && ((NIL != lit2) || (NIL != lit1))) {
                SubLObject current;
                final SubLObject datum = current = lit1_$27;
                SubLObject mt1 = NIL;
                SubLObject asent1 = NIL;
                destructuring_bind_must_consp(current, datum, $list47);
                mt1 = current.first();
                current = current.rest();
                destructuring_bind_must_consp(current, datum, $list47);
                asent1 = current.first();
                current = current.rest();
                if (NIL == current) {
                    SubLObject current_$30;
                    final SubLObject datum_$29 = current_$30 = lit2_$28;
                    SubLObject mt2 = NIL;
                    SubLObject asent2 = NIL;
                    destructuring_bind_must_consp(current_$30, datum_$29, $list48);
                    mt2 = current_$30.first();
                    current_$30 = current_$30.rest();
                    destructuring_bind_must_consp(current_$30, datum_$29, $list48);
                    asent2 = current_$30.first();
                    current_$30 = current_$30.rest();
                    if (NIL == current_$30) {
                        differentP = makeBoolean(!asent1.equal(asent2));
                    } else {
                        cdestructuring_bind_error(datum_$29, $list48);
                    }
                } else {
                    cdestructuring_bind_error(datum, $list47);
                }
                lit1 = lit1.rest();
                lit1_$27 = lit1.first();
                lit2 = lit2.rest();
                lit2_$28 = lit2.first();
            } 
        }
        return makeBoolean(NIL == differentP);
    }

    public static SubLObject find_or_create_pph_justified_proof_set() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != set.set_p(pph_vars.$pph_justified_proofs$.getDynamicValue(thread))) {
            return pph_vars.$pph_justified_proofs$.getDynamicValue(thread);
        }
        return set.new_set(UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject pph_note_proof_justified(final SubLObject proof) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != set.set_p(pph_vars.$pph_justified_proofs$.getDynamicValue(thread))) {
            set.set_add(proof, pph_vars.$pph_justified_proofs$.getDynamicValue(thread));
        }
        return proof;
    }

    public static SubLObject pph_proof_already_justified_p(final SubLObject proof) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return makeBoolean((NIL != set.set_p(pph_vars.$pph_justified_proofs$.getDynamicValue(thread))) && (NIL != set_utilities.set_find(inference_worker.proof_proven_query(proof), pph_vars.$pph_justified_proofs$.getDynamicValue(thread), $sym45$PPH_PROOF_QUERY_EQUAL_, PROOF_PROVEN_QUERY)));
    }

    public static SubLObject pph_note_support_displayed(final SubLObject support) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (pph_vars.$pph_displayed_supports$.getDynamicValue(thread).isList()) {
            pph_vars.$pph_displayed_supports$.setDynamicValue(cons(support, pph_vars.$pph_displayed_supports$.getDynamicValue(thread)), thread);
        }
        return support;
    }

    public static SubLObject pph_proofs_analogousP(final SubLObject proof1, final SubLObject proof2, final SubLObject mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject analogousP = NIL;
        SubLObject diffs = NIL;
        if ((((NIL != inference_datastructures_proof.proof_p(proof1)) && (NIL != inference_datastructures_proof.proof_p(proof2))) && (NIL != pph_real_or_quasi_transformation_proof_p(proof1))) && (NIL != pph_proof_already_justified_p(proof2))) {
            thread.resetMultipleValues();
            final SubLObject analogousP_$31 = pph_proofs_analogousP_int(proof1, proof2, mt, UNPROVIDED);
            final SubLObject diffs_$32 = thread.secondMultipleValue();
            thread.resetMultipleValues();
            analogousP = analogousP_$31;
            diffs = diffs_$32;
        }
        return values(analogousP, diffs);
    }

    public static SubLObject pph_proofs_analogousP_int(final SubLObject proof1, final SubLObject proof2, final SubLObject mt, SubLObject nestedP) {
        if (nestedP == UNPROVIDED) {
            nestedP = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject diffs = NIL;
        if ((!inference_datastructures_proof.proof_type(proof1).eql(inference_datastructures_proof.proof_type(proof2))) || ((NIL != inference_worker_transformation.transformation_proof_p(proof1)) && (!inference_worker_transformation.transformation_proof_rule_assertion(proof1).eql(inference_worker_transformation.transformation_proof_rule_assertion(proof2))))) {
            return values(NIL, NIL);
        }
        final SubLObject proof1_query = pph_proof_el_formula(proof1, mt);
        final SubLObject proof2_query = pph_proof_el_formula(proof2, mt);
        final SubLObject proof1_subproofs = inference_datastructures_proof.proof_direct_subproofs(proof1);
        final SubLObject proof2_subproofs = inference_datastructures_proof.proof_direct_subproofs(proof2);
        if ((NIL != pph_cached_transformation_proof_p(proof1)) && (!cycl_utilities.formula_arg0(proof1_query).equal(cycl_utilities.formula_arg0(proof2_query)))) {
            return values(NIL, NIL);
        }
        if (NIL == list_utilities.same_length_p(proof1_subproofs, proof2_subproofs)) {
            return values(NIL, NIL);
        }
        if (NIL != proof1_subproofs) {
            SubLObject subproof1 = NIL;
            SubLObject subproof1_$33 = NIL;
            SubLObject subproof2 = NIL;
            SubLObject subproof2_$34 = NIL;
            subproof1 = proof1_subproofs;
            subproof1_$33 = subproof1.first();
            subproof2 = proof2_subproofs;
            subproof2_$34 = subproof2.first();
            while ((NIL != subproof2) || (NIL != subproof1)) {
                thread.resetMultipleValues();
                final SubLObject analogousP = pph_proofs_analogousP_int(subproof1_$33, subproof2_$34, mt, T);
                final SubLObject new_diffs = thread.secondMultipleValue();
                thread.resetMultipleValues();
                if (NIL == analogousP) {
                    return values(NIL, NIL);
                }
                SubLObject cdolist_list_var = new_diffs;
                SubLObject diff = NIL;
                diff = cdolist_list_var.first();
                while (NIL != cdolist_list_var) {
                    final SubLObject item_var = diff;
                    if (NIL == member(item_var, diffs, symbol_function(EQUAL), symbol_function(IDENTITY))) {
                        diffs = cons(item_var, diffs);
                    }
                    cdolist_list_var = cdolist_list_var.rest();
                    diff = cdolist_list_var.first();
                } 
                subproof1 = subproof1.rest();
                subproof1_$33 = subproof1.first();
                subproof2 = subproof2.rest();
                subproof2_$34 = subproof2.first();
            } 
        } else
            if ((NIL != nestedP) && (!proof1_query.equal(proof2_query))) {
                diffs = cons(list(proof1_query, proof2_query), diffs);
            }

        return values(T, diffs);
    }

    public static SubLObject pph_show_analogous_proof(final SubLObject proof, final SubLObject mt, final SubLObject diffs) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        html_newline(UNPROVIDED);
        html_princ($str49$By_analogous_reasoning__);
        if (NIL != diffs) {
            html_princ($str50$since_);
            html_markup(html_macros.$html_unordered_list_head$.getGlobalValue());
            html_char(CHAR_greater, UNPROVIDED);
            final SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
            try {
                html_macros.$html_safe_print$.bind(T, thread);
                SubLObject cdolist_list_var = diffs;
                SubLObject diff = NIL;
                diff = cdolist_list_var.first();
                while (NIL != cdolist_list_var) {
                    html_markup(html_macros.$html_list_item_head$.getGlobalValue());
                    html_char(CHAR_greater, UNPROVIDED);
                    final SubLObject _prev_bind_0_$35 = html_macros.$html_safe_print$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind(T, thread);
                        pph_show_sentence(diff.first(), UNPROVIDED, UNPROVIDED);
                    } finally {
                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$35, thread);
                    }
                    html_markup(html_macros.$html_list_item_tail$.getGlobalValue());
                    cdolist_list_var = cdolist_list_var.rest();
                    diff = cdolist_list_var.first();
                } 
            } finally {
                html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
            }
            html_markup(html_macros.$html_unordered_list_tail$.getGlobalValue());
        }
        html_princ($str51$it_follows_that_);
        html_newline(UNPROVIDED);
        final SubLObject proof_conclusion = pph_real_or_quasi_transformation_proof_conclusion(proof, mt);
        pph_show_proof_conclusion_int(proof_conclusion);
        html_hr(UNPROVIDED, UNPROVIDED);
        return proof;
    }

    public static SubLObject pph_show_trivial_proof(final SubLObject proof, final SubLObject mt) {
        html_newline(UNPROVIDED);
        html_princ($str52$Trivially__);
        pph_show_sentence(pph_proof_el_formula(proof, mt), UNPROVIDED, UNPROVIDED);
        return proof;
    }

    public static SubLObject pph_show_proof_query_and_supports(final SubLObject proof, final SubLObject query_el_formula, final SubLObject mt, final SubLObject proof_index_string, SubLObject style) {
        if (style == UNPROVIDED) {
            style = $DEFAULT;
        }
        final SubLObject pcase_var = style;
        if (pcase_var.eql($SUPPORTS_AND_CONCLUSION)) {
            pph_show_proof_supports_and_conclusion(proof, mt, proof_index_string);
        } else {
            pph_show_proof_query_and_supports_default(proof, query_el_formula, mt, proof_index_string);
        }
        return proof;
    }

    public static SubLObject pph_show_proof_supports_and_conclusion(final SubLObject proof, final SubLObject mt, final SubLObject proof_index_string) {
        html_newline(UNPROVIDED);
        if (NIL != pph_real_or_quasi_transformation_proof_p(proof)) {
            pph_show_real_or_quasi_transformation_proof_supports_bu(proof, mt, proof_index_string, UNPROVIDED);
        } else {
            final SubLObject proof_conclusion = pph_proof_conclusion(proof, mt);
            pph_show_proof_conclusion_int(proof_conclusion);
            SubLObject supports = pph_displayworthy_supports(proof, T, NIL, NIL, mt);
            if (NIL != el_formula_p(proof_conclusion)) {
                supports = remove(proof_conclusion, supports, symbol_function(EQUAL), SUPPORT_SENTENCE, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            }
            if (NIL != supports) {
                pph_maybe_show_meta_supports(supports, proof_index_string, UNPROVIDED);
            }
        }
        return proof;
    }

    public static SubLObject pph_displayworthy_supports(final SubLObject proof, SubLObject include_subproofsP, SubLObject inference_mt, SubLObject pph_relevance_safe_list, SubLObject domain_mt) {
        if (include_subproofsP == UNPROVIDED) {
            include_subproofsP = NIL;
        }
        if (inference_mt == UNPROVIDED) {
            inference_mt = NIL;
        }
        if (pph_relevance_safe_list == UNPROVIDED) {
            pph_relevance_safe_list = NIL;
        }
        if (domain_mt == UNPROVIDED) {
            domain_mt = pph_irrelevance_check_mt();
        }
        if ((NIL != pph_real_or_quasi_transformation_proof_p(proof)) && (NIL != proof_view_pruning_ruleP(pph_real_or_quasi_transformation_proof_rule(proof), domain_mt))) {
            return NIL;
        }
        final SubLObject all = inference_datastructures_proof.proof_supports(proof);
        final SubLObject v_new = set_difference(all, pph_displayed_supports(), symbol_function(EQUAL), UNPROVIDED);
        SubLObject relevant = remove_if_pph_irrelevant_support(v_new, pph_relevance_safe_list);
        if (NIL != relevant) {
            final SubLObject rule = find_if($sym53$RULE_ASSERTION_, all, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            relevant = pph_prune_meta_supports(relevant, NIL != rule ? proof_view_populator.proof_literals_to_suppress(proof, UNPROVIDED) : NIL);
        }
        if ((NIL != relevant) && (NIL != inference_mt)) {
            SubLObject found_non_hypothesizedP = NIL;
            if (NIL == found_non_hypothesizedP) {
                SubLObject csome_list_var = relevant;
                SubLObject support = NIL;
                support = csome_list_var.first();
                while ((NIL == found_non_hypothesizedP) && (NIL != csome_list_var)) {
                    if (NIL == pph_hypothesized_supportP(support, inference_mt)) {
                        found_non_hypothesizedP = T;
                    }
                    csome_list_var = csome_list_var.rest();
                    support = csome_list_var.first();
                } 
            }
            if (NIL == found_non_hypothesizedP) {
                relevant = v_new;
            }
        }
        if (NIL != include_subproofsP) {
            SubLObject cdolist_list_var = inference_datastructures_proof.proof_direct_subproofs(proof);
            SubLObject subproof = NIL;
            subproof = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                relevant = append(relevant, pph_displayworthy_supports(subproof, T, inference_mt, pph_relevance_safe_list, domain_mt));
                cdolist_list_var = cdolist_list_var.rest();
                subproof = cdolist_list_var.first();
            } 
        }
        return pph_sort_meta_supports(relevant);
    }

    public static SubLObject proof_view_pruning_ruleP(final SubLObject rule, SubLObject domain_mt) {
        if (domain_mt == UNPROVIDED) {
            domain_mt = pph_irrelevance_check_mt();
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate(domain_mt);
        final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
        try {
            mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
            mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
            mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
            return makeBoolean((NIL != assertion_handles.assertion_p(rule)) && (NIL != kb_mapping_utilities.some_pred_value(rule, $const55$ruleAndSupportsTrivialForJustific, UNPROVIDED, UNPROVIDED)));
        } finally {
            mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_3, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
        }
    }

    public static SubLObject remove_if_pph_irrelevant_support(final SubLObject supports, final SubLObject pph_relevance_safe_list) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject relevant = NIL;
        SubLObject cdolist_list_var = supports;
        SubLObject support = NIL;
        support = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if (NIL != pph_irrelevant_supportP(support, pph_relevance_safe_list, UNPROVIDED)) {
                if (NIL != proof_view.$proof_view_debugP$.getDynamicValue(thread)) {
                    format_nil.force_format(T, $str56$__Removing_irrelevant_support____, support, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                }
            } else {
                relevant = cons(support, relevant);
            }
            cdolist_list_var = cdolist_list_var.rest();
            support = cdolist_list_var.first();
        } 
        return nreverse(relevant);
    }

    public static SubLObject pph_non_trivial_proof_supports(final SubLObject proof) {
        return remove_if($sym57$PPH_SUPPORT_TRIVIAL_, inference_datastructures_proof.proof_supports(proof), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject pph_real_or_quasi_transformation_proof_p(final SubLObject proof) {
        return makeBoolean((NIL != inference_worker_transformation.transformation_proof_p(proof)) || (NIL != pph_quasi_transformation_proof_p(proof)));
    }

    public static SubLObject pph_real_or_quasi_transformation_proof_rule(final SubLObject proof) {
        if (NIL != inference_worker_transformation.transformation_proof_p(proof)) {
            return inference_worker_transformation.transformation_proof_rule_assertion(proof);
        }
        if (NIL != pph_cached_transformation_proof_p(proof)) {
            return pph_cached_transformation_proof_supporting_assertion(proof);
        }
        if (NIL != inference_worker_residual_transformation.residual_transformation_proof_p(proof)) {
            return inference_worker_residual_transformation.residual_transformation_proof_rule_assertion(proof);
        }
        return NIL;
    }

    public static SubLObject pph_real_or_quasi_transformation_proof_intermediate_conclusions(final SubLObject proof, final SubLObject mt) {
        SubLObject ans = NIL;
        if (NIL != pph_quasi_transformation_proof_p(proof)) {
            SubLObject cdolist_list_var = pph_sub_isomorphic_assertions_into_supports(inference_datastructures_proof.proof_supports(proof));
            SubLObject support = NIL;
            support = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                if ((NIL != pph_hypothesized_supportP(support, mt)) && (NIL == assertions_high.asserted_assertionP(support))) {
                    SubLObject cdolist_list_var_$36 = pph_assertion_deduced_support_sentences(support, mt, UNPROVIDED);
                    SubLObject meta_support_sentence = NIL;
                    meta_support_sentence = cdolist_list_var_$36.first();
                    while (NIL != cdolist_list_var_$36) {
                        ans = cons(meta_support_sentence, ans);
                        cdolist_list_var_$36 = cdolist_list_var_$36.rest();
                        meta_support_sentence = cdolist_list_var_$36.first();
                    } 
                    if (NIL == pph_cached_transformation_proof_p(proof)) {
                        ans = cons(pph_support_sentence(support, UNPROVIDED), ans);
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                support = cdolist_list_var.first();
            } 
        } else {
            SubLObject cdolist_list_var = inference_datastructures_proof.proof_direct_subproofs(proof);
            SubLObject subproof = NIL;
            subproof = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                SubLObject cdolist_list_var_$37 = pph_real_or_quasi_transformation_proof_intermediate_conclusions(subproof, mt);
                SubLObject conclusion = NIL;
                conclusion = cdolist_list_var_$37.first();
                while (NIL != cdolist_list_var_$37) {
                    ans = cons(conclusion, ans);
                    cdolist_list_var_$37 = cdolist_list_var_$37.rest();
                    conclusion = cdolist_list_var_$37.first();
                } 
                if (NIL != pph_real_or_quasi_transformation_proof_p(subproof)) {
                    ans = cons(pph_proof_el_formula(subproof, mt), ans);
                }
                cdolist_list_var = cdolist_list_var.rest();
                subproof = cdolist_list_var.first();
            } 
        }
        return ans;
    }

    public static SubLObject pph_assertion_deduced_support_sentences(final SubLObject assertion, final SubLObject mt, SubLObject circular_support_sentences) {
        if (circular_support_sentences == UNPROVIDED) {
            circular_support_sentences = set.new_set(symbol_function(EQUAL), UNPROVIDED);
        }
        SubLObject ans = NIL;
        set.set_add(pph_support_sentence(assertion, UNPROVIDED), circular_support_sentences);
        SubLObject cdolist_list_var = pph_assertion_supports(assertion, T, circular_support_sentences);
        SubLObject support = NIL;
        support = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if (((NIL == set.set_memberP(pph_support_sentence(support, UNPROVIDED), circular_support_sentences)) && (NIL != pph_hypothesized_supportP(support, mt))) && (NIL == assertions_high.asserted_assertionP(support))) {
                set.set_add(pph_support_sentence(support, UNPROVIDED), circular_support_sentences);
                SubLObject cdolist_list_var_$38 = pph_assertion_deduced_support_sentences(support, mt, circular_support_sentences);
                SubLObject sentence = NIL;
                sentence = cdolist_list_var_$38.first();
                while (NIL != cdolist_list_var_$38) {
                    ans = cons(sentence, ans);
                    cdolist_list_var_$38 = cdolist_list_var_$38.rest();
                    sentence = cdolist_list_var_$38.first();
                } 
                ans = cons(pph_support_sentence(support, UNPROVIDED), ans);
            }
            cdolist_list_var = cdolist_list_var.rest();
            support = cdolist_list_var.first();
        } 
        return ans;
    }

    public static SubLObject pph_quasi_transformation_proof_p(final SubLObject proof) {
        return makeBoolean((NIL != pph_hl_transformation_proof_p(proof)) || (NIL != pph_cached_transformation_proof_p(proof)));
    }

    public static SubLObject pph_hl_transformation_proof_p(final SubLObject proof) {
        SubLObject ans = NIL;
        if ((NIL != inference_worker_removal.removal_proof_p(proof)) && (NIL == ans)) {
            SubLObject csome_list_var = inference_datastructures_proof.proof_supports(proof);
            SubLObject support = NIL;
            support = csome_list_var.first();
            while ((NIL == ans) && (NIL != csome_list_var)) {
                if (((NIL != arguments.hl_support_p(support)) && (arguments.support_module(support) == $CODE)) && (NIL != el_implication_p(arguments.support_sentence(support)))) {
                    ans = support;
                }
                csome_list_var = csome_list_var.rest();
                support = csome_list_var.first();
            } 
        }
        return ans;
    }

    public static SubLObject pph_cached_transformation_proof_p(final SubLObject proof) {
        return assertion_handles.assertion_p(pph_cached_transformation_proof_supporting_assertion(proof));
    }

    public static SubLObject pph_cached_transformation_proof_supporting_assertion(final SubLObject proof) {
        SubLObject ans = NIL;
        if (NIL != inference_worker_removal.removal_proof_p(proof)) {
            final SubLObject supports = inference_datastructures_proof.proof_supports(proof);
            if (NIL != list_utilities.singletonP(supports)) {
                final SubLObject assertion = pph_find_assertion_for_support(supports.first());
                if (((NIL != assertion_handles.assertion_p(assertion)) && (NIL == assertions_high.asserted_assertionP(assertion))) && (NIL == ans)) {
                    SubLObject csome_list_var = pph_support_tree_supporters(pph_assertion_support_tree(assertion, UNPROVIDED));
                    SubLObject support_tree = NIL;
                    support_tree = csome_list_var.first();
                    while ((NIL == ans) && (NIL != csome_list_var)) {
                        if (NIL != assertions_high.rule_assertionP(pph_support_tree_supported(support_tree))) {
                            ans = assertion;
                        }
                        csome_list_var = csome_list_var.rest();
                        support_tree = csome_list_var.first();
                    } 
                }
            }
        }
        return ans;
    }

    public static SubLObject pph_show_real_or_quasi_transformation_proof_supports_bu(final SubLObject proof, final SubLObject mt, final SubLObject proof_index_string, SubLObject nestedP) {
        if (nestedP == UNPROVIDED) {
            nestedP = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject proof_conclusion = pph_real_or_quasi_transformation_proof_conclusion(proof, mt);
        if (NIL == pph_irrelevant_proof_conclusionP(proof_conclusion)) {
            final SubLObject query_formula = pph_proof_el_formula(proof, mt);
            final SubLObject higher_as = (NIL != atomic_sentenceP(query_formula)) ? pph_gaf_with_formula_in_higher_mt(query_formula, mt, T) : NIL;
            if (NIL == assertion_handles.assertion_p(higher_as)) {
                if ((NIL == nestedP) && (NIL == pph_top_level_proof_p())) {
                    pph_show_real_or_quasi_transformation_proof_conclusion(proof_conclusion, nestedP, T);
                }
                SubLObject count = ZERO_INTEGER;
                SubLObject cdolist_list_var = inference_datastructures_proof.proof_direct_subproofs(proof);
                SubLObject subproof = NIL;
                subproof = cdolist_list_var.first();
                while (NIL != cdolist_list_var) {
                    final SubLObject subproof_index_string = cconcatenate(proof_index_string, new SubLObject[]{ $str59$_, princ_to_string(count) });
                    pph_show_real_or_quasi_transformation_proof_supports_bu(subproof, mt, subproof_index_string, T);
                    count = add(count, ONE_INTEGER);
                    cdolist_list_var = cdolist_list_var.rest();
                    subproof = cdolist_list_var.first();
                } 
                if (count.isPositive()) {
                    pph_note_proof_justified(proof);
                }
                if ((NIL != pph_real_or_quasi_transformation_proof_p(proof)) && (NIL == pph_proof_already_displayed_p(proof))) {
                    if (NIL != pph_templated_proofP(proof)) {
                        pph_show_templated_proof(proof, mt, proof_index_string, nestedP);
                        return proof;
                    }
                    pph_show_real_or_quasi_transformation_proof_supports(proof, mt, proof_index_string, $SUPPORTS_AND_CONCLUSION);
                    if (NIL != nestedP) {
                        pph_vars.$pph_repositioned_proofs$.setDynamicValue(cons(proof, pph_vars.$pph_repositioned_proofs$.getDynamicValue(thread)), thread);
                    }
                    pph_show_real_or_quasi_transformation_proof_conclusion(proof_conclusion, nestedP, NIL);
                    pph_note_proof_displayed(proof);
                }
            } else {
                if (NIL != assertions_high.deduced_assertionP(higher_as)) {
                    if ((NIL == nestedP) && (NIL == pph_top_level_proof_p())) {
                        pph_show_real_or_quasi_transformation_proof_conclusion(higher_as, NIL, T);
                    }
                    final SubLObject justifiedP = pph_show_cached_transformation_proof_supports_from_as(higher_as, mt, proof_index_string, $SUPPORTS_AND_CONCLUSION);
                    if (NIL != justifiedP) {
                        pph_note_proof_justified(proof);
                    }
                    pph_show_real_or_quasi_transformation_proof_conclusion(higher_as, nestedP, NIL);
                    pph_note_proof_displayed(proof);
                    return proof;
                }
                return proof;
            }
        }
        return proof;
    }

    public static SubLObject pph_show_real_or_quasi_transformation_proof_conclusion(final SubLObject proof_conclusion, SubLObject nestedP, SubLObject conclusion_precedes_proofP) {
        if (nestedP == UNPROVIDED) {
            nestedP = NIL;
        }
        if (conclusion_precedes_proofP == UNPROVIDED) {
            conclusion_precedes_proofP = NIL;
        }
        html_newline(TWO_INTEGER);
        if (NIL != conclusion_precedes_proofP) {
            html_princ_strong($$$Proof_that);
        } else
            if (NIL != nestedP) {
                html_princ_strong($str61$Intermediate_Result_);
            } else {
                html_princ_strong($str62$Conclusion_);
            }

        html_newline(UNPROVIDED);
        pph_show_proof_conclusion_int(proof_conclusion);
        return proof_conclusion;
    }

    public static SubLObject pph_show_proof_conclusion_int(final SubLObject proof_conclusion) {
        if (NIL != assertion_handles.assertion_p(proof_conclusion)) {
            pph_show_assertion(proof_conclusion);
        } else {
            pph_show_sentence(proof_conclusion, UNPROVIDED, UNPROVIDED);
        }
        return proof_conclusion;
    }

    public static SubLObject pph_real_or_quasi_transformation_proof_conclusion(final SubLObject proof, final SubLObject mt) {
        if (NIL != pph_cached_transformation_proof_p(proof)) {
            return pph_cached_transformation_proof_supporting_assertion(proof);
        }
        return pph_proof_conclusion(proof, mt);
    }

    public static SubLObject pph_show_proof_query_and_supports_default(final SubLObject proof, final SubLObject query_el_formula, final SubLObject mt, final SubLObject proof_index_string) {
        html_newline(UNPROVIDED);
        pph_show_sentence(query_el_formula, UNPROVIDED, UNPROVIDED);
        if (NIL != inference_worker_transformation.transformation_proof_p(proof)) {
            pph_show_transformation_proof_supports(proof, mt, proof_index_string, UNPROVIDED);
        } else {
            final SubLObject supports = pph_displayworthy_supports(proof, NIL, NIL, NIL, mt);
            SubLObject label = $$$Supporting_Facts;
            if (NIL != supports) {
                pph_maybe_show_meta_supports(supports, proof_index_string, label);
            }
            if (NIL != inference_datastructures_proof.proof_has_subproofsP(proof)) {
                if (NIL != inference_datastructures_proof.proof_has_supportsP(proof)) {
                    html_newline(UNPROVIDED);
                }
                final SubLObject subproofs = pph_proof_subproofs(proof);
                label = $$$Supporting_Facts;
                pph_maybe_show_subproofs(subproofs, mt, proof_index_string, label);
            }
        }
        return proof;
    }

    public static SubLObject pph_show_real_or_quasi_transformation_proof_supports(final SubLObject proof, final SubLObject mt, final SubLObject proof_index_string, SubLObject style) {
        if (style == UNPROVIDED) {
            style = $DEFAULT;
        }
        if (NIL != inference_worker_transformation.transformation_proof_p(proof)) {
            pph_show_transformation_proof_supports(proof, mt, proof_index_string, style);
        } else
            if (NIL != pph_hl_transformation_proof_p(proof)) {
                pph_show_hl_transformation_proof_supports(proof, mt, proof_index_string, style);
            } else
                if (NIL != pph_cached_transformation_proof_p(proof)) {
                    pph_show_cached_transformation_proof_supports(proof, mt, proof_index_string, style);
                }


        return proof;
    }

    public static SubLObject pph_show_transformation_proof_supports(final SubLObject proof, final SubLObject mt, final SubLObject proof_index_string, SubLObject style) {
        if (style == UNPROVIDED) {
            style = $DEFAULT;
        }
        pph_show_transformation_proof_rule(proof, mt, proof_index_string, style);
        final SubLObject subproof = inference_worker_transformation.transformation_proof_subproof(proof);
        if (NIL != pph_transformation_subproof_worth_showingP(subproof, mt)) {
            final SubLObject pcase_var = style;
            if (pcase_var.eql($SUPPORTS_AND_CONCLUSION)) {
                final SubLObject index_string = cconcatenate(proof_index_string, $str64$_transformation_supports);
                html_newline(TWO_INTEGER);
                html_princ_strong($str65$Rule_Application_);
                pph_show_inference_proof(subproof, mt, index_string);
            } else {
                final SubLObject label = $$$Transformation_Proof_Supports;
                pph_maybe_show_subproofs(list(subproof), mt, proof_index_string, label);
            }
            pph_note_proof_justified(proof);
        }
        pph_note_proof_displayed(proof);
        return proof;
    }

    public static SubLObject pph_transformation_subproof_worth_showingP(final SubLObject subproof, final SubLObject mt) {
        if (NIL != pph_transformation_subproof_worth_showingP_int(subproof, mt)) {
            return T;
        }
        SubLObject cdolist_list_var = inference_datastructures_proof.proof_direct_subproofs(subproof);
        SubLObject sub_subproof = NIL;
        sub_subproof = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if (NIL != pph_transformation_subproof_worth_showingP(sub_subproof, mt)) {
                return T;
            }
            cdolist_list_var = cdolist_list_var.rest();
            sub_subproof = cdolist_list_var.first();
        } 
        return NIL;
    }

    public static SubLObject pph_transformation_subproof_worth_showingP_int(final SubLObject proof, final SubLObject mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return makeBoolean(((((NIL == subl_promotions.memberP(proof, pph_vars.$pph_repositioned_proofs$.getDynamicValue(thread), UNPROVIDED, UNPROVIDED)) && (NIL == inference_worker.structural_proof_p(proof))) && (NIL == pph_proof_already_displayed_p(proof))) && (NIL == pph_trivial_sentenceP(pph_proof_el_formula(proof, mt), mt))) && ((NIL != pph_real_or_quasi_transformation_proof_p(proof)) || (NIL != pph_displayworthy_supports(proof, NIL, NIL, NIL, mt))));
    }

    public static SubLObject pph_show_hl_transformation_proof_supports_bu(final SubLObject proof, final SubLObject mt, final SubLObject proof_index_string) {
        pph_show_hl_transformation_proof_supports(proof, mt, proof_index_string, $SUPPORTS_AND_CONCLUSION);
        final SubLObject proof_conclusion = pph_real_or_quasi_transformation_proof_conclusion(proof, mt);
        pph_show_real_or_quasi_transformation_proof_conclusion(proof_conclusion, UNPROVIDED, UNPROVIDED);
        return proof;
    }

    public static SubLObject pph_show_hl_transformation_proof_supports(final SubLObject proof, final SubLObject mt, final SubLObject proof_index_string, SubLObject style) {
        if (style == UNPROVIDED) {
            style = $DEFAULT;
        }
        final SubLObject supports = inference_datastructures_proof.proof_supports(proof);
        final SubLObject support_tree = pph_support_tree_from_supports(proof, supports, UNPROVIDED);
        pph_show_reconstructed_transformation_proof_support_tree(support_tree, proof_index_string, mt, style);
        if (NIL != support_tree) {
            pph_note_proof_justified(proof);
        }
        return proof;
    }

    public static SubLObject pph_show_cached_transformation_proof_supports_bu(final SubLObject proof, final SubLObject mt, final SubLObject proof_index_string) {
        pph_show_cached_transformation_proof_supports(proof, mt, proof_index_string, $SUPPORTS_AND_CONCLUSION);
        final SubLObject proof_conclusion = pph_real_or_quasi_transformation_proof_conclusion(proof, mt);
        pph_show_real_or_quasi_transformation_proof_conclusion(proof_conclusion, UNPROVIDED, UNPROVIDED);
        return proof;
    }

    public static SubLObject pph_show_cached_transformation_proof_supports(final SubLObject proof, final SubLObject mt, final SubLObject proof_index_string, SubLObject style) {
        if (style == UNPROVIDED) {
            style = $DEFAULT;
        }
        final SubLObject supporting_assertion = pph_cached_transformation_proof_supporting_assertion(proof);
        if (NIL != assertion_handles.assertion_p(supporting_assertion)) {
            pph_show_cached_transformation_proof_supports_from_as(supporting_assertion, mt, proof_index_string, style);
            pph_note_proof_justified(proof);
        }
        return proof;
    }

    public static SubLObject pph_show_cached_transformation_proof_supports_from_as(final SubLObject supporting_assertion, final SubLObject mt, final SubLObject proof_index_string, final SubLObject style) {
        final SubLObject support_tree = pph_assertion_support_tree(supporting_assertion, UNPROVIDED);
        SubLObject justifiedP = NIL;
        if (NIL != support_tree) {
            pph_show_reconstructed_transformation_proof_support_tree(support_tree, proof_index_string, mt, style);
            if (NIL != pph_support_tree_supporters(support_tree)) {
                justifiedP = T;
            }
        }
        return justifiedP;
    }

    public static SubLObject pph_reconstructed_transformation_proof_support_tree_p(final SubLObject support_tree) {
        return list_utilities.sublisp_boolean(find_if(EL_IMPLICATION_P, pph_support_tree_supporters(support_tree), PPH_SUPPORT_TREE_SENTENCE, UNPROVIDED, UNPROVIDED));
    }

    public static SubLObject pph_show_reconstructed_transformation_proof_support_tree(final SubLObject support_tree, final SubLObject proof_index_string, final SubLObject mt, SubLObject style) {
        if (style == UNPROVIDED) {
            style = $DEFAULT;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject subnodes = pph_support_tree_supporters(support_tree);
        final SubLObject rule_subnode = find_if(EL_IMPLICATION_P, subnodes, PPH_SUPPORT_TREE_SENTENCE, UNPROVIDED, UNPROVIDED);
        final SubLObject non_rule_subnodes = remove(rule_subnode, subnodes, symbol_function(EQUAL), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        SubLObject transformation_subnodes = pph_find_transformation_support_trees(rule_subnode, non_rule_subnodes);
        SubLObject intermediate_support_trees = NIL;
        SubLObject list_var = NIL;
        SubLObject support_tree_$39 = NIL;
        SubLObject i = NIL;
        list_var = transformation_subnodes;
        support_tree_$39 = list_var.first();
        for (i = ZERO_INTEGER; NIL != list_var; list_var = list_var.rest() , support_tree_$39 = list_var.first() , i = add(ONE_INTEGER, i)) {
            SubLObject current;
            final SubLObject datum = current = support_tree_$39;
            SubLObject support = NIL;
            SubLObject meta_support_trees = NIL;
            destructuring_bind_must_consp(current, datum, $list69);
            support = current.first();
            current = meta_support_trees = current.rest();
            if ((NIL != assertion_handles.assertion_p(support)) && (NIL != list_utilities.proper_list_p(meta_support_trees))) {
                final SubLObject index_string = cconcatenate(proof_index_string, new SubLObject[]{ $str70$_meta_, princ_to_string(i) });
                if (NIL != pph_reconstructed_transformation_proof_support_tree_p(support_tree_$39)) {
                    pph_show_reconstructed_transformation_proof_support_tree(support_tree_$39, index_string, mt, style);
                    intermediate_support_trees = cons(support_tree_$39, intermediate_support_trees);
                    pph_note_support_displayed(support);
                    pph_show_real_or_quasi_transformation_proof_conclusion(support, T, NIL);
                }
            }
        }
        if (NIL != intermediate_support_trees) {
            transformation_subnodes = set_difference(transformation_subnodes, intermediate_support_trees, symbol_function(EQUAL), UNPROVIDED);
        }
        SubLObject given_support_trees = NIL;
        SubLObject supports_from_question = NIL;
        SubLObject supports_from_kb = NIL;
        SubLObject list_var2 = NIL;
        SubLObject support_tree_$40 = NIL;
        SubLObject j = NIL;
        list_var2 = transformation_subnodes;
        support_tree_$40 = list_var2.first();
        for (j = ZERO_INTEGER; NIL != list_var2; list_var2 = list_var2.rest() , support_tree_$40 = list_var2.first() , j = add(ONE_INTEGER, j)) {
            final SubLObject support = pph_support_tree_supported(support_tree_$40);
            if (NIL != assertion_handles.assertion_p(support)) {
                if (NIL != pph_hypothesized_supportP(support, mt)) {
                    given_support_trees = cons(support_tree_$40, given_support_trees);
                    supports_from_question = cons(support, supports_from_question);
                } else {
                    supports_from_kb = cons(support, supports_from_kb);
                    given_support_trees = cons(support_tree_$40, given_support_trees);
                }
            }
        }
        pph_proof_show_givens(nreverse(supports_from_question), NIL, $HYPOTHESIZED, UNPROVIDED, UNPROVIDED);
        pph_proof_show_givens(nreverse(supports_from_kb), NIL, $FROM_KB, UNPROVIDED, UNPROVIDED);
        if (NIL != given_support_trees) {
            SubLObject cdolist_list_var = given_support_trees;
            SubLObject given_support_tree = NIL;
            given_support_tree = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                final SubLObject support2 = pph_support_tree_supported(given_support_tree);
                pph_note_support_displayed(support2);
                cdolist_list_var = cdolist_list_var.rest();
                given_support_tree = cdolist_list_var.first();
            } 
            transformation_subnodes = set_difference(transformation_subnodes, given_support_trees, symbol_function(EQUAL), UNPROVIDED);
        }
        final SubLObject rule_support = pph_support_tree_supported(rule_subnode);
        if ((NIL != rule_support) && (NIL == pph_irrelevant_supportP(rule_support, UNPROVIDED, UNPROVIDED))) {
            html_newline(TWO_INTEGER);
            html_princ_strong($str73$Applicable_Rule_);
            html_newline(UNPROVIDED);
            pph_show_support(rule_support, proof_index_string, UNPROVIDED);
            dictionary_utilities.dictionary_pushnew(pph_vars.$rules_used_in_quasi_transformation_proofs$.getGlobalValue(), rule_support, pph_support_tree_supported(support_tree), symbol_function(EQUAL), UNPROVIDED);
        }
        if (NIL != transformation_subnodes) {
            final SubLObject transformation_supports = Mapping.mapcar(symbol_function(FIRST), transformation_subnodes);
            final SubLObject pcase_var = style;
            if (pcase_var.eql($SUPPORTS_AND_CONCLUSION)) {
                final SubLObject index_string2 = cconcatenate(proof_index_string, $str64$_transformation_supports);
                final SubLObject label = $str65$Rule_Application_;
                html_newline(TWO_INTEGER);
                if (NIL != pph_vars.$pph_use_showXhideP$.getDynamicValue(thread)) {
                    pph_maybe_show_meta_supports(transformation_supports, index_string2, label);
                } else {
                    pph_show_supports_wXo_indent(label, transformation_supports);
                }
            } else {
                final SubLObject label2 = $$$Transformation_Proof_Supports;
                pph_maybe_show_meta_supports(transformation_supports, proof_index_string, label2);
            }
        }
        return support_tree;
    }

    public static SubLObject pph_find_transformation_support_trees(final SubLObject rule_support_tree, final SubLObject non_rule_support_trees) {
        final SubLObject rule_support = pph_support_tree_supported(rule_support_tree);
        final SubLObject rule_neg_lits = (NIL != arguments.support_p(rule_support)) ? clauses.neg_lits(support_cnf(rule_support)) : NIL;
        SubLObject transformation_support_trees = NIL;
        SubLObject cdolist_list_var = non_rule_support_trees;
        SubLObject support_tree = NIL;
        support_tree = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            final SubLObject support = pph_support_tree_supported(support_tree);
            if ((NIL != subl_promotions.memberP(arguments.support_sentence(support), rule_neg_lits, symbol_function(UNIFY), UNPROVIDED)) && (NIL == pph_irrelevant_supportP(support, UNPROVIDED, UNPROVIDED))) {
                transformation_support_trees = cons(support_tree, transformation_support_trees);
            }
            cdolist_list_var = cdolist_list_var.rest();
            support_tree = cdolist_list_var.first();
        } 
        return nreverse(transformation_support_trees);
    }

    public static SubLObject pph_show_transformation_proof_rule(final SubLObject proof, final SubLObject mt, final SubLObject proof_index_string, final SubLObject style) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject rule_assertion = inference_worker_transformation.transformation_proof_rule_assertion(proof);
        final SubLObject object_id = cconcatenate($str76$transformation_rule_, proof_index_string);
        if (NIL == pph_trivial_assertionP(rule_assertion, mt)) {
            if (NIL != assertions_high.valid_assertion(rule_assertion, UNPROVIDED)) {
                pph_show_valid_transformation_proof_rule(rule_assertion, proof, mt, proof_index_string, object_id, style);
            } else
                if (NIL != pph_vars.$pph_use_showXhideP$.getDynamicValue(thread)) {
                    html_markup(dhtml_macros.$dhtml_css_head$.getGlobalValue());
                    html_markup(dhtml_macros.$dhtml_css_type$.getGlobalValue());
                    html_char(CHAR_quotation, UNPROVIDED);
                    html_markup($str38$text_css);
                    html_char(CHAR_quotation, UNPROVIDED);
                    html_markup(dhtml_macros.$dhtml_css_media$.getGlobalValue());
                    html_char(CHAR_quotation, UNPROVIDED);
                    html_markup($$$screen);
                    html_char(CHAR_quotation, UNPROVIDED);
                    html_char(CHAR_greater, UNPROVIDED);
                    SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind(T, thread);
                        html_terpri(UNPROVIDED);
                        dhtml_macros.dhtml_dom_wrapper_preamble(object_id);
                        dhtml_macros.dhtml_dom_attribute_preamble(dhtml_macros.$dhtml_dom_display$.getGlobalValue());
                        html_markup($$$none);
                        dhtml_macros.dhtml_dom_attribute_postamble();
                        dhtml_macros.dhtml_dom_wrapper_postamble();
                        html_terpri(UNPROVIDED);
                    } finally {
                        html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
                    }
                    html_markup(dhtml_macros.$dhtml_css_tail$.getGlobalValue());
                    html_terpri(UNPROVIDED);
                    html_newline(UNPROVIDED);
                    dhtml_macros.dhtml_switch_visibility_links_arrows(object_id, $$$Invalidated_Rule);
                    dhtml_macros.dhtml_set_switched_visibility(object_id, $INVISIBLE, $TEXT);
                    html_markup(html_macros.$html_div_head$.getGlobalValue());
                    if (NIL != object_id) {
                        html_markup(html_macros.$html_attribute_id$.getGlobalValue());
                        html_char(CHAR_quotation, UNPROVIDED);
                        html_markup(object_id);
                        html_char(CHAR_quotation, UNPROVIDED);
                    }
                    html_char(CHAR_greater, UNPROVIDED);
                    _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind(T, thread);
                        html_markup(html_macros.$html_unordered_list_head$.getGlobalValue());
                        html_char(CHAR_greater, UNPROVIDED);
                        final SubLObject _prev_bind_0_$41 = html_macros.$html_safe_print$.currentBinding(thread);
                        try {
                            html_macros.$html_safe_print$.bind(T, thread);
                            html_markup(html_macros.$html_list_item_head$.getGlobalValue());
                            html_char(CHAR_greater, UNPROVIDED);
                            final SubLObject _prev_bind_0_$42 = html_macros.$html_safe_print$.currentBinding(thread);
                            try {
                                html_macros.$html_safe_print$.bind(T, thread);
                                pph_show_invalidated_support(rule_assertion);
                            } finally {
                                html_macros.$html_safe_print$.rebind(_prev_bind_0_$42, thread);
                            }
                            html_markup(html_macros.$html_list_item_tail$.getGlobalValue());
                        } finally {
                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$41, thread);
                        }
                        html_markup(html_macros.$html_unordered_list_tail$.getGlobalValue());
                    } finally {
                        html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
                    }
                    html_markup(html_macros.$html_div_tail$.getGlobalValue());
                    html_source_readability_terpri(UNPROVIDED);
                } else {
                    html_newline(UNPROVIDED);
                    html_markup(html_macros.$html_unordered_list_head$.getGlobalValue());
                    html_char(CHAR_greater, UNPROVIDED);
                    final SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind(T, thread);
                        html_markup(html_macros.$html_list_item_head$.getGlobalValue());
                        html_char(CHAR_greater, UNPROVIDED);
                        final SubLObject _prev_bind_0_$43 = html_macros.$html_safe_print$.currentBinding(thread);
                        try {
                            html_macros.$html_safe_print$.bind(T, thread);
                            pph_show_invalidated_support(rule_assertion);
                        } finally {
                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$43, thread);
                        }
                        html_markup(html_macros.$html_list_item_tail$.getGlobalValue());
                    } finally {
                        html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
                    }
                    html_markup(html_macros.$html_unordered_list_tail$.getGlobalValue());
                }

        }
        return proof;
    }

    public static SubLObject pph_show_valid_transformation_proof_rule(final SubLObject rule_assertion, final SubLObject proof, final SubLObject mt, final SubLObject proof_index_string, final SubLObject object_id, SubLObject style) {
        if (style == UNPROVIDED) {
            style = $DEFAULT;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        thread.resetMultipleValues();
        final SubLObject unfocused_restricted_formula = pph_restrict_transformation_rule(rule_assertion, proof, mt);
        final SubLObject restriction_subproofs = thread.secondMultipleValue();
        final SubLObject non_hypothetical_restriction_bindingsP = thread.thirdMultipleValue();
        thread.resetMultipleValues();
        final SubLObject proof_conclusion = pph_real_or_quasi_transformation_proof_conclusion(proof, mt);
        final SubLObject proof_el_bindings = inference_worker_transformation.transformation_proof_rule_el_bindings(proof);
        final SubLObject restricted_formula = pph_focus_rule_formula(unfocused_restricted_formula, proof_conclusion, proof_el_bindings);
        if ((NIL != restriction_subproofs) && ($SUPPORTS_AND_CONCLUSION == style)) {
            pph_show_restriction_subproofs(restriction_subproofs, proof, mt, proof_index_string);
        }
        final SubLObject other_supports = inference_worker_transformation.transformation_proof_additional_supports(proof);
        if ((NIL != pph_vars.$pph_use_showXhideP$.getDynamicValue(thread)) && (style == $DEFAULT)) {
            html_markup(dhtml_macros.$dhtml_css_head$.getGlobalValue());
            html_markup(dhtml_macros.$dhtml_css_type$.getGlobalValue());
            html_char(CHAR_quotation, UNPROVIDED);
            html_markup($str38$text_css);
            html_char(CHAR_quotation, UNPROVIDED);
            html_markup(dhtml_macros.$dhtml_css_media$.getGlobalValue());
            html_char(CHAR_quotation, UNPROVIDED);
            html_markup($$$screen);
            html_char(CHAR_quotation, UNPROVIDED);
            html_char(CHAR_greater, UNPROVIDED);
            SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
            try {
                html_macros.$html_safe_print$.bind(T, thread);
                html_terpri(UNPROVIDED);
                dhtml_macros.dhtml_dom_wrapper_preamble(object_id);
                dhtml_macros.dhtml_dom_attribute_preamble(dhtml_macros.$dhtml_dom_display$.getGlobalValue());
                html_markup($$$none);
                dhtml_macros.dhtml_dom_attribute_postamble();
                dhtml_macros.dhtml_dom_wrapper_postamble();
                html_terpri(UNPROVIDED);
            } finally {
                html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
            }
            html_markup(dhtml_macros.$dhtml_css_tail$.getGlobalValue());
            html_terpri(UNPROVIDED);
            html_newline(UNPROVIDED);
            final SubLObject label = $$$Supporting_Rule;
            dhtml_macros.dhtml_switch_visibility_links_arrows(object_id, label);
            dhtml_macros.dhtml_set_switched_visibility(object_id, $INVISIBLE, $TEXT);
            html_markup(html_macros.$html_div_head$.getGlobalValue());
            if (NIL != object_id) {
                html_markup(html_macros.$html_attribute_id$.getGlobalValue());
                html_char(CHAR_quotation, UNPROVIDED);
                html_markup(object_id);
                html_char(CHAR_quotation, UNPROVIDED);
            }
            html_char(CHAR_greater, UNPROVIDED);
            _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
            try {
                html_macros.$html_safe_print$.bind(T, thread);
                html_markup(html_macros.$html_unordered_list_head$.getGlobalValue());
                html_char(CHAR_greater, UNPROVIDED);
                final SubLObject _prev_bind_0_$44 = html_macros.$html_safe_print$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind(T, thread);
                    html_markup(html_macros.$html_list_item_head$.getGlobalValue());
                    html_char(CHAR_greater, UNPROVIDED);
                    final SubLObject _prev_bind_0_$45 = html_macros.$html_safe_print$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind(T, thread);
                        pph_display_restricted_and_general_rule(restricted_formula, rule_assertion, mt, restriction_subproofs, other_supports, proof_index_string, style);
                    } finally {
                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$45, thread);
                    }
                    html_markup(html_macros.$html_list_item_tail$.getGlobalValue());
                } finally {
                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$44, thread);
                }
                html_markup(html_macros.$html_unordered_list_tail$.getGlobalValue());
            } finally {
                html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
            }
            html_markup(html_macros.$html_div_tail$.getGlobalValue());
            html_source_readability_terpri(UNPROVIDED);
        } else
            if (style == $SUPPORTS_AND_CONCLUSION) {
                if (NIL == pph_irrelevant_supportP(rule_assertion, UNPROVIDED, UNPROVIDED)) {
                    html_newline(TWO_INTEGER);
                    html_princ_strong($str73$Applicable_Rule_);
                    html_newline(UNPROVIDED);
                    if (NIL != non_hypothetical_restriction_bindingsP) {
                        pph_display_restricted_and_general_rule(restricted_formula, rule_assertion, mt, restriction_subproofs, other_supports, proof_index_string, style);
                    } else {
                        pph_show_support(rule_assertion, proof_index_string, UNPROVIDED);
                    }
                }
            } else {
                html_markup(html_macros.$html_unordered_list_head$.getGlobalValue());
                html_char(CHAR_greater, UNPROVIDED);
                final SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind(T, thread);
                    html_markup(html_macros.$html_list_item_head$.getGlobalValue());
                    html_char(CHAR_greater, UNPROVIDED);
                    final SubLObject _prev_bind_0_$46 = html_macros.$html_safe_print$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind(T, thread);
                        pph_show_sentence(restricted_formula, UNPROVIDED, UNPROVIDED);
                        pph_maybe_show_meta_supports(list(rule_assertion), proof_index_string, $$$Supporting_Rule);
                        if (NIL != other_supports) {
                            pph_maybe_show_meta_supports(other_supports, proof_index_string, $$$Transformation_Supports);
                        }
                    } finally {
                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$46, thread);
                    }
                    html_markup(html_macros.$html_list_item_tail$.getGlobalValue());
                } finally {
                    html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
                }
                html_markup(html_macros.$html_unordered_list_tail$.getGlobalValue());
            }

        return rule_assertion;
    }

    public static SubLObject pph_focus_rule_formula(final SubLObject unfocused_rule_formula, SubLObject proof_conclusion, final SubLObject proof_el_bindings) {
        final SubLObject input_rule_type = (NIL != el_implication_p(unfocused_rule_formula)) ? $IMPLICATION : NIL != el_disjunction_p(unfocused_rule_formula) ? $DISJUNCTION : NIL;
        if (NIL != input_rule_type) {
            SubLObject antecedent = (input_rule_type == $IMPLICATION) ? cycl_utilities.formula_arg1(unfocused_rule_formula, UNPROVIDED) : NIL;
            final SubLObject consequent = (input_rule_type == $IMPLICATION) ? cycl_utilities.formula_arg2(unfocused_rule_formula, UNPROVIDED) : unfocused_rule_formula;
            if (input_rule_type == $DISJUNCTION) {
                if (NIL != assertion_handles.assertion_p(proof_conclusion)) {
                    proof_conclusion = uncanonicalizer.assertion_el_formula(proof_conclusion);
                }
                SubLObject found_proof_conclusionP = NIL;
                final SubLObject proof_conclusion_wX_vars = bindings.apply_bindings_backwards(proof_el_bindings, proof_conclusion);
                SubLObject new_consequent = NIL;
                SubLObject cdolist_list_var = cycl_utilities.formula_args(consequent, UNPROVIDED);
                SubLObject disjunct = NIL;
                disjunct = cdolist_list_var.first();
                while (NIL != cdolist_list_var) {
                    if (bindings.apply_bindings_backwards(proof_el_bindings, disjunct).equal(proof_conclusion_wX_vars)) {
                        found_proof_conclusionP = T;
                        new_consequent = disjunct;
                    } else {
                        final SubLObject new_neg_lit = (input_rule_type == $IMPLICATION) ? make_negation(disjunct) : disjunct;
                        if (NIL == pph_trivial_neg_litP(new_neg_lit, UNPROVIDED)) {
                            antecedent = (NIL != antecedent) ? simplifier.conjoin(list(antecedent, new_neg_lit), T) : new_neg_lit;
                        }
                    }
                    cdolist_list_var = cdolist_list_var.rest();
                    disjunct = cdolist_list_var.first();
                } 
                if (NIL != found_proof_conclusionP) {
                    if (input_rule_type == $DISJUNCTION) {
                        antecedent = make_negation(antecedent);
                    }
                    return make_implication(antecedent, new_consequent);
                }
            }
        }
        return unfocused_rule_formula;
    }

    public static SubLObject pph_show_restriction_subproofs(final SubLObject restriction_subproofs, final SubLObject proof, final SubLObject mt, final SubLObject proof_index_string) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject hypothesized_subproof_conclusions = NIL;
        SubLObject subproofs_derived_from_hypothesis = NIL;
        SubLObject other_subproofs = NIL;
        SubLObject cdolist_list_var = restriction_subproofs;
        SubLObject subproof = NIL;
        subproof = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if (NIL != pph_proof_to_show_p(subproof, pph_proof_el_formula(subproof, mt), mt)) {
                if (NIL == pph_proof_already_displayed_p(subproof)) {
                    if (NIL == pph_proof_from_hypothesisP(subproof, mt)) {
                        other_subproofs = cons(subproof, other_subproofs);
                    } else
                        if (NIL != pph_lookup_proof_p(subproof)) {
                            hypothesized_subproof_conclusions = cons(pph_proof_conclusion(subproof, mt), hypothesized_subproof_conclusions);
                        } else {
                            subproofs_derived_from_hypothesis = cons(subproof, subproofs_derived_from_hypothesis);
                        }

                }
            }
            cdolist_list_var = cdolist_list_var.rest();
            subproof = cdolist_list_var.first();
        } 
        pph_proof_show_givens(nreverse(hypothesized_subproof_conclusions), NIL, $HYPOTHESIZED, proof_index_string, mt);
        pph_proof_show_givens(nreverse(subproofs_derived_from_hypothesis), T, $DERIVED_FROM_HYPOTHESIS, proof_index_string, mt);
        pph_proof_show_givens(nreverse(other_subproofs), T, $FROM_KB, proof_index_string, mt);
        pph_vars.$pph_repositioned_proofs$.setDynamicValue(append(pph_vars.$pph_repositioned_proofs$.getDynamicValue(thread), restriction_subproofs), thread);
        return proof;
    }

    public static SubLObject pph_proof_show_givens(final SubLObject givens, final SubLObject proofsP, SubLObject source, SubLObject proof_index_string, SubLObject mt) {
        if (proof_index_string == UNPROVIDED) {
            proof_index_string = NIL;
        }
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (NIL != givens) {
            html_newline(TWO_INTEGER);
            if (source.eql($HYPOTHESIZED)) {
                html_princ_strong($str83$Given__from_the_question__);
            } else
                if (source.eql($DERIVED_FROM_HYPOTHESIS)) {
                    html_princ_strong($str84$Derived_from_the_question_);
                } else
                    if (source.eql($FROM_KB)) {
                        html_princ_strong($str85$Given__from_the_knowledge_base__);
                    } else {
                        html_princ_strong($str86$Other_Givens_);
                    }


            if (NIL != proofsP) {
                SubLObject list_var = NIL;
                SubLObject proof = NIL;
                SubLObject i = NIL;
                list_var = givens;
                proof = list_var.first();
                for (i = ZERO_INTEGER; NIL != list_var; list_var = list_var.rest() , proof = list_var.first() , i = add(ONE_INTEGER, i)) {
                    final SubLObject index_string = cconcatenate(proof_index_string, new SubLObject[]{ $str59$_, princ_to_string(source), princ_to_string(i) });
                    pph_show_inference_proof(proof, mt, index_string);
                }
            } else {
                SubLObject cdolist_list_var = givens;
                SubLObject proof_conclusion = NIL;
                proof_conclusion = cdolist_list_var.first();
                while (NIL != cdolist_list_var) {
                    html_newline(UNPROVIDED);
                    pph_show_proof_conclusion_int(proof_conclusion);
                    cdolist_list_var = cdolist_list_var.rest();
                    proof_conclusion = cdolist_list_var.first();
                } 
            }
        }
        return givens;
    }

    public static SubLObject pph_display_restricted_and_general_rule(final SubLObject restricted_formula, final SubLObject rule_assertion, final SubLObject mt, final SubLObject restriction_subproofs, final SubLObject other_supports, final SubLObject proof_index_string, final SubLObject style) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        pph_show_sentence(restricted_formula, UNPROVIDED, UNPROVIDED);
        html_newline(UNPROVIDED);
        pph_maybe_show_meta_supports(list(rule_assertion), proof_index_string, $$$Supporting_Rule);
        if ((NIL != restriction_subproofs) && ($DEFAULT == style)) {
            final SubLObject subproof_index_string = cconcatenate(proof_index_string, $str87$_restriction_subproofs);
            html_newline(UNPROVIDED);
            pph_maybe_show_subproofs(restriction_subproofs, mt, subproof_index_string, UNPROVIDED);
            pph_vars.$pph_repositioned_proofs$.setDynamicValue(append(pph_vars.$pph_repositioned_proofs$.getDynamicValue(thread), restriction_subproofs), thread);
        }
        if (NIL != other_supports) {
            pph_maybe_show_meta_supports(other_supports, proof_index_string, $$$Transformation_Supports);
        }
        return rule_assertion;
    }

    public static SubLObject pph_support_trivialP(final SubLObject support, SubLObject domain_mt) {
        if (domain_mt == UNPROVIDED) {
            domain_mt = pph_triviality_check_mt();
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != $pph_show_gory_proof_details$.getDynamicValue(thread)) {
            return NIL;
        }
        if (NIL != pph_required_ruleP(support)) {
            return NIL;
        }
        if (NIL != pph_trivial_assertionP(support, domain_mt)) {
            return T;
        }
        if (NIL != pph_trivial_sentenceP(pph_support_sentence(support, UNPROVIDED), domain_mt)) {
            return T;
        }
        if (NIL != pph_trivial_mtP(arguments.support_mt(support), domain_mt)) {
            return T;
        }
        return NIL;
    }

    public static SubLObject pph_triviality_check_mt() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject mt = $$BaseTrivialityMt;
        if (NIL != pph_speech_act.pph_addressee_known_p()) {
            final SubLObject addressee_triviality_mt = pph_triviality_check_mt_for_addressee(pph_vars.$pph_addressee$.getDynamicValue(thread), UNPROVIDED);
            if (NIL != addressee_triviality_mt) {
                mt = pph_utilities.pph_canonicalize_hlmt(list($$MtUnionFn, mt, addressee_triviality_mt));
            }
        }
        return mt;
    }

    public static SubLObject pph_triviality_check_mt_for_addressee_internal(SubLObject addressee, SubLObject domain_mt) {
        if (addressee == UNPROVIDED) {
            addressee = pph_vars.$pph_addressee$.getDynamicValue();
        }
        if (domain_mt == UNPROVIDED) {
            domain_mt = pph_vars.$pph_domain_mt$.getDynamicValue();
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject mt = narts_high.find_nart(list($$TrivialityContextForIndividualFn, addressee));
        if ((NIL == mt) && (NIL != indexed_term_p(addressee))) {
            final SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate(domain_mt);
            final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
            final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
            final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
            try {
                mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
                mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
                mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
                SubLObject node_var = addressee;
                final SubLObject deck_type = $QUEUE;
                final SubLObject recur_deck = deck.create_deck(deck_type);
                final SubLObject _prev_bind_0_$47 = sbhl_marking_vars.$sbhl_space$.currentBinding(thread);
                try {
                    sbhl_marking_vars.$sbhl_space$.bind(sbhl_marking_vars.get_sbhl_marking_space(), thread);
                    try {
                        final SubLObject tv_var = NIL;
                        final SubLObject _prev_bind_0_$48 = sbhl_search_vars.$sbhl_tv$.currentBinding(thread);
                        final SubLObject _prev_bind_1_$49 = sbhl_search_vars.$relevant_sbhl_tv_function$.currentBinding(thread);
                        try {
                            sbhl_search_vars.$sbhl_tv$.bind(NIL != tv_var ? tv_var : sbhl_search_vars.get_sbhl_true_tv(), thread);
                            sbhl_search_vars.$relevant_sbhl_tv_function$.bind(NIL != tv_var ? RELEVANT_SBHL_TV_IS_GENERAL_TV : sbhl_search_vars.$relevant_sbhl_tv_function$.getDynamicValue(thread), thread);
                            if (((NIL != tv_var) && (NIL != sbhl_paranoia.sbhl_object_type_checking_p())) && (NIL == sbhl_search_vars.sbhl_true_tv_p(tv_var))) {
                                final SubLObject pcase_var = sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread);
                                if (pcase_var.eql($ERROR)) {
                                    sbhl_paranoia.sbhl_error(ONE_INTEGER, $str97$_A_is_not_a__A, tv_var, SBHL_TRUE_TV_P, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                } else
                                    if (pcase_var.eql($CERROR)) {
                                        sbhl_paranoia.sbhl_cerror(ONE_INTEGER, $$$continue_anyway, $str97$_A_is_not_a__A, tv_var, SBHL_TRUE_TV_P, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                    } else
                                        if (pcase_var.eql($WARN)) {
                                            Errors.warn($str97$_A_is_not_a__A, tv_var, SBHL_TRUE_TV_P);
                                        } else {
                                            Errors.warn($str102$_A_is_not_a_valid__sbhl_type_erro, sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread));
                                            Errors.cerror($$$continue_anyway, $str97$_A_is_not_a__A, tv_var, SBHL_TRUE_TV_P);
                                        }


                            }
                            final SubLObject _prev_bind_0_$49 = sbhl_search_vars.$sbhl_search_module$.currentBinding(thread);
                            final SubLObject _prev_bind_1_$50 = sbhl_search_vars.$sbhl_search_module_type$.currentBinding(thread);
                            final SubLObject _prev_bind_2_$52 = sbhl_search_vars.$sbhl_add_node_to_result_test$.currentBinding(thread);
                            final SubLObject _prev_bind_4 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                            final SubLObject _prev_bind_5 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
                            try {
                                sbhl_search_vars.$sbhl_search_module$.bind(sbhl_module_vars.get_sbhl_module($$isa), thread);
                                sbhl_search_vars.$sbhl_search_module_type$.bind(sbhl_module_utilities.get_sbhl_module_type(sbhl_module_vars.get_sbhl_module($$isa)), thread);
                                sbhl_search_vars.$sbhl_add_node_to_result_test$.bind(sbhl_module_utilities.get_sbhl_add_node_to_result_test(sbhl_module_vars.get_sbhl_module($$isa)), thread);
                                sbhl_search_vars.$genl_inverse_mode_p$.bind(NIL, thread);
                                sbhl_module_vars.$sbhl_module$.bind(sbhl_module_vars.get_sbhl_module($$isa), thread);
                                if ((NIL != sbhl_paranoia.suspend_sbhl_type_checkingP()) || (NIL != sbhl_module_utilities.apply_sbhl_module_type_test(addressee, sbhl_module_vars.get_sbhl_module(UNPROVIDED)))) {
                                    final SubLObject _prev_bind_0_$50 = sbhl_search_vars.$sbhl_search_direction$.currentBinding(thread);
                                    final SubLObject _prev_bind_1_$51 = sbhl_link_vars.$sbhl_link_direction$.currentBinding(thread);
                                    final SubLObject _prev_bind_2_$53 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                    try {
                                        sbhl_search_vars.$sbhl_search_direction$.bind(sbhl_search_vars.get_sbhl_forward_search_direction(), thread);
                                        sbhl_link_vars.$sbhl_link_direction$.bind(sbhl_module_utilities.get_sbhl_module_forward_direction(sbhl_module_vars.get_sbhl_module(UNPROVIDED)), thread);
                                        sbhl_search_vars.$genl_inverse_mode_p$.bind(NIL, thread);
                                        SubLObject cdolist_list_var;
                                        final SubLObject accessible_modules = cdolist_list_var = sbhl_macros.get_sbhl_accessible_modules(sbhl_module_vars.get_sbhl_module($$isa));
                                        SubLObject module_var = NIL;
                                        module_var = cdolist_list_var.first();
                                        while (NIL != cdolist_list_var) {
                                            final SubLObject _prev_bind_0_$51 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
                                            final SubLObject _prev_bind_1_$52 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                            try {
                                                sbhl_module_vars.$sbhl_module$.bind(module_var, thread);
                                                sbhl_search_vars.$genl_inverse_mode_p$.bind(NIL != sbhl_search_vars.flip_genl_inverse_modeP(UNPROVIDED, UNPROVIDED) ? makeBoolean(NIL == sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue(thread)) : sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue(thread), thread);
                                                final SubLObject node = function_terms.naut_to_nart(node_var);
                                                if (NIL != sbhl_link_vars.sbhl_node_object_p(node)) {
                                                    final SubLObject d_link = sbhl_graphs.get_sbhl_graph_link(node, sbhl_module_vars.get_sbhl_module(UNPROVIDED));
                                                    if (NIL != d_link) {
                                                        final SubLObject mt_links = sbhl_links.get_sbhl_mt_links(d_link, sbhl_link_vars.get_sbhl_link_direction(), sbhl_module_vars.get_sbhl_module(UNPROVIDED));
                                                        if (NIL != mt_links) {
                                                            SubLObject iteration_state;
                                                            for (iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(mt_links)); NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state); iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state)) {
                                                                thread.resetMultipleValues();
                                                                final SubLObject mt_$58 = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
                                                                final SubLObject tv_links = thread.secondMultipleValue();
                                                                thread.resetMultipleValues();
                                                                if (NIL != mt_relevance_macros.relevant_mtP(mt_$58)) {
                                                                    final SubLObject _prev_bind_0_$52 = sbhl_link_vars.$sbhl_link_mt$.currentBinding(thread);
                                                                    try {
                                                                        sbhl_link_vars.$sbhl_link_mt$.bind(mt_$58, thread);
                                                                        SubLObject iteration_state_$60;
                                                                        for (iteration_state_$60 = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(tv_links)); NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state_$60); iteration_state_$60 = dictionary_contents.do_dictionary_contents_next(iteration_state_$60)) {
                                                                            thread.resetMultipleValues();
                                                                            final SubLObject tv = dictionary_contents.do_dictionary_contents_key_value(iteration_state_$60);
                                                                            final SubLObject link_nodes = thread.secondMultipleValue();
                                                                            thread.resetMultipleValues();
                                                                            if (NIL != sbhl_search_vars.relevant_sbhl_tvP(tv)) {
                                                                                final SubLObject _prev_bind_0_$53 = sbhl_link_vars.$sbhl_link_tv$.currentBinding(thread);
                                                                                try {
                                                                                    sbhl_link_vars.$sbhl_link_tv$.bind(tv, thread);
                                                                                    final SubLObject sol = link_nodes;
                                                                                    if (NIL != set.set_p(sol)) {
                                                                                        final SubLObject set_contents_var = set.do_set_internal(sol);
                                                                                        SubLObject basis_object;
                                                                                        SubLObject state;
                                                                                        SubLObject node_vars_link_node;
                                                                                        for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
                                                                                            node_vars_link_node = set_contents.do_set_contents_next(basis_object, state);
                                                                                            if ((NIL != set_contents.do_set_contents_element_validP(state, node_vars_link_node)) && (NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node, UNPROVIDED))) {
                                                                                                sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node, UNPROVIDED);
                                                                                                deck.deck_push(node_vars_link_node, recur_deck);
                                                                                            }
                                                                                        }
                                                                                    } else
                                                                                        if (sol.isList()) {
                                                                                            SubLObject csome_list_var = sol;
                                                                                            SubLObject node_vars_link_node2 = NIL;
                                                                                            node_vars_link_node2 = csome_list_var.first();
                                                                                            while (NIL != csome_list_var) {
                                                                                                if (NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node2, UNPROVIDED)) {
                                                                                                    sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node2, UNPROVIDED);
                                                                                                    deck.deck_push(node_vars_link_node2, recur_deck);
                                                                                                }
                                                                                                csome_list_var = csome_list_var.rest();
                                                                                                node_vars_link_node2 = csome_list_var.first();
                                                                                            } 
                                                                                        } else {
                                                                                            Errors.error($str104$_A_is_neither_SET_P_nor_LISTP_, sol);
                                                                                        }

                                                                                } finally {
                                                                                    sbhl_link_vars.$sbhl_link_tv$.rebind(_prev_bind_0_$53, thread);
                                                                                }
                                                                            }
                                                                        }
                                                                        dictionary_contents.do_dictionary_contents_finalize(iteration_state_$60);
                                                                    } finally {
                                                                        sbhl_link_vars.$sbhl_link_mt$.rebind(_prev_bind_0_$52, thread);
                                                                    }
                                                                }
                                                            }
                                                            dictionary_contents.do_dictionary_contents_finalize(iteration_state);
                                                        }
                                                    } else {
                                                        sbhl_paranoia.sbhl_error(FIVE_INTEGER, $str105$attempting_to_bind_direction_link, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                                    }
                                                } else
                                                    if (NIL != obsolete.cnat_p(node, UNPROVIDED)) {
                                                        SubLObject cdolist_list_var_$62;
                                                        final SubLObject new_list = cdolist_list_var_$62 = (NIL != sbhl_link_vars.sbhl_randomize_lists_p()) ? list_utilities.randomize_list(sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators(sbhl_link_vars.get_sbhl_link_direction(), sbhl_search_vars.$sbhl_tv$.getDynamicValue(thread), sbhl_module_vars.get_sbhl_module(UNPROVIDED))) : sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators(sbhl_link_vars.get_sbhl_link_direction(), sbhl_search_vars.$sbhl_tv$.getDynamicValue(thread), sbhl_module_vars.get_sbhl_module(UNPROVIDED));
                                                        SubLObject generating_fn = NIL;
                                                        generating_fn = cdolist_list_var_$62.first();
                                                        while (NIL != cdolist_list_var_$62) {
                                                            final SubLObject _prev_bind_0_$54 = sbhl_link_vars.$sbhl_link_generator$.currentBinding(thread);
                                                            try {
                                                                sbhl_link_vars.$sbhl_link_generator$.bind(generating_fn, thread);
                                                                final SubLObject sol2;
                                                                final SubLObject link_nodes2 = sol2 = funcall(generating_fn, node);
                                                                if (NIL != set.set_p(sol2)) {
                                                                    final SubLObject set_contents_var2 = set.do_set_internal(sol2);
                                                                    SubLObject basis_object2;
                                                                    SubLObject state2;
                                                                    SubLObject node_vars_link_node3;
                                                                    for (basis_object2 = set_contents.do_set_contents_basis_object(set_contents_var2), state2 = NIL, state2 = set_contents.do_set_contents_initial_state(basis_object2, set_contents_var2); NIL == set_contents.do_set_contents_doneP(basis_object2, state2); state2 = set_contents.do_set_contents_update_state(state2)) {
                                                                        node_vars_link_node3 = set_contents.do_set_contents_next(basis_object2, state2);
                                                                        if ((NIL != set_contents.do_set_contents_element_validP(state2, node_vars_link_node3)) && (NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node3, UNPROVIDED))) {
                                                                            sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node3, UNPROVIDED);
                                                                            deck.deck_push(node_vars_link_node3, recur_deck);
                                                                        }
                                                                    }
                                                                } else
                                                                    if (sol2.isList()) {
                                                                        SubLObject csome_list_var2 = sol2;
                                                                        SubLObject node_vars_link_node4 = NIL;
                                                                        node_vars_link_node4 = csome_list_var2.first();
                                                                        while (NIL != csome_list_var2) {
                                                                            if (NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node4, UNPROVIDED)) {
                                                                                sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node4, UNPROVIDED);
                                                                                deck.deck_push(node_vars_link_node4, recur_deck);
                                                                            }
                                                                            csome_list_var2 = csome_list_var2.rest();
                                                                            node_vars_link_node4 = csome_list_var2.first();
                                                                        } 
                                                                    } else {
                                                                        Errors.error($str104$_A_is_neither_SET_P_nor_LISTP_, sol2);
                                                                    }

                                                            } finally {
                                                                sbhl_link_vars.$sbhl_link_generator$.rebind(_prev_bind_0_$54, thread);
                                                            }
                                                            cdolist_list_var_$62 = cdolist_list_var_$62.rest();
                                                            generating_fn = cdolist_list_var_$62.first();
                                                        } 
                                                    }

                                            } finally {
                                                sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_1_$52, thread);
                                                sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_0_$51, thread);
                                            }
                                            cdolist_list_var = cdolist_list_var.rest();
                                            module_var = cdolist_list_var.first();
                                        } 
                                        node_var = deck.deck_pop(recur_deck);
                                        final SubLObject _prev_bind_0_$55 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
                                        final SubLObject _prev_bind_1_$53 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                        final SubLObject _prev_bind_2_$54 = sbhl_link_vars.$sbhl_link_direction$.currentBinding(thread);
                                        try {
                                            sbhl_module_vars.$sbhl_module$.bind(sbhl_module_utilities.get_sbhl_transfers_through_module(sbhl_search_vars.get_sbhl_search_module()), thread);
                                            sbhl_search_vars.$genl_inverse_mode_p$.bind(NIL, thread);
                                            sbhl_link_vars.$sbhl_link_direction$.bind(sbhl_module_utilities.get_sbhl_module_forward_direction(sbhl_module_vars.get_sbhl_module(UNPROVIDED)), thread);
                                            while (NIL != node_var) {
                                                final SubLObject type = node_var;
                                                final SubLObject triviality_mt = narts_high.find_nart(list($$TrivialityContextForTypeFn, type));
                                                if ((NIL != mt) && (NIL != triviality_mt)) {
                                                    mt = pph_utilities.pph_canonicalize_hlmt(list($$MtUnionFn, mt, triviality_mt));
                                                } else
                                                    if (NIL != triviality_mt) {
                                                        mt = triviality_mt;
                                                    }

                                                SubLObject cdolist_list_var2;
                                                final SubLObject accessible_modules2 = cdolist_list_var2 = sbhl_macros.get_sbhl_accessible_modules(sbhl_module_vars.get_sbhl_module(UNPROVIDED));
                                                SubLObject module_var2 = NIL;
                                                module_var2 = cdolist_list_var2.first();
                                                while (NIL != cdolist_list_var2) {
                                                    final SubLObject _prev_bind_0_$56 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
                                                    final SubLObject _prev_bind_1_$54 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                                    try {
                                                        sbhl_module_vars.$sbhl_module$.bind(module_var2, thread);
                                                        sbhl_search_vars.$genl_inverse_mode_p$.bind(NIL != sbhl_search_vars.flip_genl_inverse_modeP(UNPROVIDED, UNPROVIDED) ? makeBoolean(NIL == sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue(thread)) : sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue(thread), thread);
                                                        final SubLObject node2 = function_terms.naut_to_nart(node_var);
                                                        if (NIL != sbhl_link_vars.sbhl_node_object_p(node2)) {
                                                            final SubLObject d_link2 = sbhl_graphs.get_sbhl_graph_link(node2, sbhl_module_vars.get_sbhl_module(UNPROVIDED));
                                                            if (NIL != d_link2) {
                                                                final SubLObject mt_links2 = sbhl_links.get_sbhl_mt_links(d_link2, sbhl_link_vars.get_sbhl_link_direction(), sbhl_module_vars.get_sbhl_module(UNPROVIDED));
                                                                if (NIL != mt_links2) {
                                                                    SubLObject iteration_state2;
                                                                    for (iteration_state2 = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(mt_links2)); NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state2); iteration_state2 = dictionary_contents.do_dictionary_contents_next(iteration_state2)) {
                                                                        thread.resetMultipleValues();
                                                                        final SubLObject mt_$59 = dictionary_contents.do_dictionary_contents_key_value(iteration_state2);
                                                                        final SubLObject tv_links2 = thread.secondMultipleValue();
                                                                        thread.resetMultipleValues();
                                                                        if (NIL != mt_relevance_macros.relevant_mtP(mt_$59)) {
                                                                            final SubLObject _prev_bind_0_$57 = sbhl_link_vars.$sbhl_link_mt$.currentBinding(thread);
                                                                            try {
                                                                                sbhl_link_vars.$sbhl_link_mt$.bind(mt_$59, thread);
                                                                                SubLObject iteration_state_$61;
                                                                                for (iteration_state_$61 = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(tv_links2)); NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state_$61); iteration_state_$61 = dictionary_contents.do_dictionary_contents_next(iteration_state_$61)) {
                                                                                    thread.resetMultipleValues();
                                                                                    final SubLObject tv2 = dictionary_contents.do_dictionary_contents_key_value(iteration_state_$61);
                                                                                    final SubLObject link_nodes3 = thread.secondMultipleValue();
                                                                                    thread.resetMultipleValues();
                                                                                    if (NIL != sbhl_search_vars.relevant_sbhl_tvP(tv2)) {
                                                                                        final SubLObject _prev_bind_0_$58 = sbhl_link_vars.$sbhl_link_tv$.currentBinding(thread);
                                                                                        try {
                                                                                            sbhl_link_vars.$sbhl_link_tv$.bind(tv2, thread);
                                                                                            final SubLObject sol3 = link_nodes3;
                                                                                            if (NIL != set.set_p(sol3)) {
                                                                                                final SubLObject set_contents_var3 = set.do_set_internal(sol3);
                                                                                                SubLObject basis_object3;
                                                                                                SubLObject state3;
                                                                                                SubLObject node_vars_link_node5;
                                                                                                for (basis_object3 = set_contents.do_set_contents_basis_object(set_contents_var3), state3 = NIL, state3 = set_contents.do_set_contents_initial_state(basis_object3, set_contents_var3); NIL == set_contents.do_set_contents_doneP(basis_object3, state3); state3 = set_contents.do_set_contents_update_state(state3)) {
                                                                                                    node_vars_link_node5 = set_contents.do_set_contents_next(basis_object3, state3);
                                                                                                    if ((NIL != set_contents.do_set_contents_element_validP(state3, node_vars_link_node5)) && (NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node5, UNPROVIDED))) {
                                                                                                        sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node5, UNPROVIDED);
                                                                                                        deck.deck_push(node_vars_link_node5, recur_deck);
                                                                                                    }
                                                                                                }
                                                                                            } else
                                                                                                if (sol3.isList()) {
                                                                                                    SubLObject csome_list_var3 = sol3;
                                                                                                    SubLObject node_vars_link_node6 = NIL;
                                                                                                    node_vars_link_node6 = csome_list_var3.first();
                                                                                                    while (NIL != csome_list_var3) {
                                                                                                        if (NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node6, UNPROVIDED)) {
                                                                                                            sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node6, UNPROVIDED);
                                                                                                            deck.deck_push(node_vars_link_node6, recur_deck);
                                                                                                        }
                                                                                                        csome_list_var3 = csome_list_var3.rest();
                                                                                                        node_vars_link_node6 = csome_list_var3.first();
                                                                                                    } 
                                                                                                } else {
                                                                                                    Errors.error($str104$_A_is_neither_SET_P_nor_LISTP_, sol3);
                                                                                                }

                                                                                        } finally {
                                                                                            sbhl_link_vars.$sbhl_link_tv$.rebind(_prev_bind_0_$58, thread);
                                                                                        }
                                                                                    }
                                                                                }
                                                                                dictionary_contents.do_dictionary_contents_finalize(iteration_state_$61);
                                                                            } finally {
                                                                                sbhl_link_vars.$sbhl_link_mt$.rebind(_prev_bind_0_$57, thread);
                                                                            }
                                                                        }
                                                                    }
                                                                    dictionary_contents.do_dictionary_contents_finalize(iteration_state2);
                                                                }
                                                            } else {
                                                                sbhl_paranoia.sbhl_error(FIVE_INTEGER, $str105$attempting_to_bind_direction_link, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                                            }
                                                        } else
                                                            if (NIL != obsolete.cnat_p(node2, UNPROVIDED)) {
                                                                SubLObject cdolist_list_var_$63;
                                                                final SubLObject new_list2 = cdolist_list_var_$63 = (NIL != sbhl_link_vars.sbhl_randomize_lists_p()) ? list_utilities.randomize_list(sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators(sbhl_link_vars.get_sbhl_link_direction(), sbhl_search_vars.$sbhl_tv$.getDynamicValue(thread), sbhl_module_vars.get_sbhl_module(UNPROVIDED))) : sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators(sbhl_link_vars.get_sbhl_link_direction(), sbhl_search_vars.$sbhl_tv$.getDynamicValue(thread), sbhl_module_vars.get_sbhl_module(UNPROVIDED));
                                                                SubLObject generating_fn2 = NIL;
                                                                generating_fn2 = cdolist_list_var_$63.first();
                                                                while (NIL != cdolist_list_var_$63) {
                                                                    final SubLObject _prev_bind_0_$59 = sbhl_link_vars.$sbhl_link_generator$.currentBinding(thread);
                                                                    try {
                                                                        sbhl_link_vars.$sbhl_link_generator$.bind(generating_fn2, thread);
                                                                        final SubLObject sol4;
                                                                        final SubLObject link_nodes4 = sol4 = funcall(generating_fn2, node2);
                                                                        if (NIL != set.set_p(sol4)) {
                                                                            final SubLObject set_contents_var4 = set.do_set_internal(sol4);
                                                                            SubLObject node_vars_link_node2;
                                                                            SubLObject basis_object4;
                                                                            SubLObject state4;
                                                                            for (basis_object4 = set_contents.do_set_contents_basis_object(set_contents_var4), state4 = NIL, state4 = set_contents.do_set_contents_initial_state(basis_object4, set_contents_var4); NIL == set_contents.do_set_contents_doneP(basis_object4, state4); state4 = set_contents.do_set_contents_update_state(state4)) {
                                                                                node_vars_link_node2 = set_contents.do_set_contents_next(basis_object4, state4);
                                                                                if ((NIL != set_contents.do_set_contents_element_validP(state4, node_vars_link_node2)) && (NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node2, UNPROVIDED))) {
                                                                                    sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node2, UNPROVIDED);
                                                                                    deck.deck_push(node_vars_link_node2, recur_deck);
                                                                                }
                                                                            }
                                                                        } else
                                                                            if (sol4.isList()) {
                                                                                SubLObject csome_list_var4 = sol4;
                                                                                SubLObject node_vars_link_node7 = NIL;
                                                                                node_vars_link_node7 = csome_list_var4.first();
                                                                                while (NIL != csome_list_var4) {
                                                                                    if (NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node7, UNPROVIDED)) {
                                                                                        sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node7, UNPROVIDED);
                                                                                        deck.deck_push(node_vars_link_node7, recur_deck);
                                                                                    }
                                                                                    csome_list_var4 = csome_list_var4.rest();
                                                                                    node_vars_link_node7 = csome_list_var4.first();
                                                                                } 
                                                                            } else {
                                                                                Errors.error($str104$_A_is_neither_SET_P_nor_LISTP_, sol4);
                                                                            }

                                                                    } finally {
                                                                        sbhl_link_vars.$sbhl_link_generator$.rebind(_prev_bind_0_$59, thread);
                                                                    }
                                                                    cdolist_list_var_$63 = cdolist_list_var_$63.rest();
                                                                    generating_fn2 = cdolist_list_var_$63.first();
                                                                } 
                                                            }

                                                    } finally {
                                                        sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_1_$54, thread);
                                                        sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_0_$56, thread);
                                                    }
                                                    cdolist_list_var2 = cdolist_list_var2.rest();
                                                    module_var2 = cdolist_list_var2.first();
                                                } 
                                                node_var = deck.deck_pop(recur_deck);
                                            } 
                                        } finally {
                                            sbhl_link_vars.$sbhl_link_direction$.rebind(_prev_bind_2_$54, thread);
                                            sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_1_$53, thread);
                                            sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_0_$55, thread);
                                        }
                                    } finally {
                                        sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_2_$53, thread);
                                        sbhl_link_vars.$sbhl_link_direction$.rebind(_prev_bind_1_$51, thread);
                                        sbhl_search_vars.$sbhl_search_direction$.rebind(_prev_bind_0_$50, thread);
                                    }
                                } else {
                                    sbhl_paranoia.sbhl_warn(TWO_INTEGER, $str107$Node__a_does_not_pass_sbhl_type_t, addressee, sbhl_module_utilities.get_sbhl_type_test(sbhl_module_vars.get_sbhl_module(UNPROVIDED)), UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                }
                            } finally {
                                sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_5, thread);
                                sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_4, thread);
                                sbhl_search_vars.$sbhl_add_node_to_result_test$.rebind(_prev_bind_2_$52, thread);
                                sbhl_search_vars.$sbhl_search_module_type$.rebind(_prev_bind_1_$50, thread);
                                sbhl_search_vars.$sbhl_search_module$.rebind(_prev_bind_0_$49, thread);
                            }
                        } finally {
                            sbhl_search_vars.$relevant_sbhl_tv_function$.rebind(_prev_bind_1_$49, thread);
                            sbhl_search_vars.$sbhl_tv$.rebind(_prev_bind_0_$48, thread);
                        }
                    } finally {
                        final SubLObject _prev_bind_0_$60 = $is_thread_performing_cleanupP$.currentBinding(thread);
                        try {
                            $is_thread_performing_cleanupP$.bind(T, thread);
                            final SubLObject _values = getValuesAsVector();
                            sbhl_marking_vars.free_sbhl_marking_space(sbhl_marking_vars.$sbhl_space$.getDynamicValue(thread));
                            restoreValuesFromVector(_values);
                        } finally {
                            $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$60, thread);
                        }
                    }
                } finally {
                    sbhl_marking_vars.$sbhl_space$.rebind(_prev_bind_0_$47, thread);
                }
            } finally {
                mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_3, thread);
                mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_2, thread);
                mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
            }
        }
        return mt;
    }

    public static SubLObject pph_triviality_check_mt_for_addressee(SubLObject addressee, SubLObject domain_mt) {
        if (addressee == UNPROVIDED) {
            addressee = pph_vars.$pph_addressee$.getDynamicValue();
        }
        if (domain_mt == UNPROVIDED) {
            domain_mt = pph_vars.$pph_domain_mt$.getDynamicValue();
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
        SubLObject caching_state = NIL;
        if (NIL == v_memoization_state) {
            return pph_triviality_check_mt_for_addressee_internal(addressee, domain_mt);
        }
        caching_state = memoization_state.memoization_state_lookup(v_memoization_state, PPH_TRIVIALITY_CHECK_MT_FOR_ADDRESSEE, UNPROVIDED);
        if (NIL == caching_state) {
            caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), PPH_TRIVIALITY_CHECK_MT_FOR_ADDRESSEE, TWO_INTEGER, NIL, EQL, UNPROVIDED);
            memoization_state.memoization_state_put(v_memoization_state, PPH_TRIVIALITY_CHECK_MT_FOR_ADDRESSEE, caching_state);
        }
        final SubLObject sxhash = memoization_state.sxhash_calc_2(addressee, domain_mt);
        final SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, UNPROVIDED);
        if (!collisions.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            SubLObject cdolist_list_var = collisions;
            SubLObject collision = NIL;
            collision = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                SubLObject cached_args = collision.first();
                final SubLObject results2 = second(collision);
                if (addressee.eql(cached_args.first())) {
                    cached_args = cached_args.rest();
                    if (((NIL != cached_args) && (NIL == cached_args.rest())) && domain_mt.eql(cached_args.first())) {
                        return memoization_state.caching_results(results2);
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                collision = cdolist_list_var.first();
            } 
        }
        final SubLObject results3 = arg2(thread.resetMultipleValues(), multiple_value_list(pph_triviality_check_mt_for_addressee_internal(addressee, domain_mt)));
        memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results3, list(addressee, domain_mt));
        return memoization_state.caching_results(results3);
    }

    public static SubLObject pph_irrelevance_check_mt() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject mt = $$BaseIrrelevanceMt;
        if (NIL != pph_speech_act.pph_addressee_known_p()) {
            final SubLObject addressee_irrelevance_mt = pph_irrelevance_check_mt_for_addressee(pph_vars.$pph_addressee$.getDynamicValue(thread), UNPROVIDED);
            if (NIL != addressee_irrelevance_mt) {
                mt = pph_utilities.pph_canonicalize_hlmt(list($$MtUnionFn, mt, addressee_irrelevance_mt));
            }
        }
        return mt;
    }

    public static SubLObject pph_irrelevance_check_mt_for_addressee_internal(SubLObject addressee, SubLObject domain_mt) {
        if (addressee == UNPROVIDED) {
            addressee = pph_vars.$pph_addressee$.getDynamicValue();
        }
        if (domain_mt == UNPROVIDED) {
            domain_mt = pph_vars.$pph_domain_mt$.getDynamicValue();
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject mt = narts_high.find_nart(list($$IrrelevanceContextForIndividualFn, addressee));
        if ((NIL == mt) && (NIL != indexed_term_p(addressee))) {
            final SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate(domain_mt);
            final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
            final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
            final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
            try {
                mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
                mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
                mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
                SubLObject node_var = addressee;
                final SubLObject deck_type = $QUEUE;
                final SubLObject recur_deck = deck.create_deck(deck_type);
                final SubLObject _prev_bind_0_$76 = sbhl_marking_vars.$sbhl_space$.currentBinding(thread);
                try {
                    sbhl_marking_vars.$sbhl_space$.bind(sbhl_marking_vars.get_sbhl_marking_space(), thread);
                    try {
                        final SubLObject tv_var = NIL;
                        final SubLObject _prev_bind_0_$77 = sbhl_search_vars.$sbhl_tv$.currentBinding(thread);
                        final SubLObject _prev_bind_1_$78 = sbhl_search_vars.$relevant_sbhl_tv_function$.currentBinding(thread);
                        try {
                            sbhl_search_vars.$sbhl_tv$.bind(NIL != tv_var ? tv_var : sbhl_search_vars.get_sbhl_true_tv(), thread);
                            sbhl_search_vars.$relevant_sbhl_tv_function$.bind(NIL != tv_var ? RELEVANT_SBHL_TV_IS_GENERAL_TV : sbhl_search_vars.$relevant_sbhl_tv_function$.getDynamicValue(thread), thread);
                            if (((NIL != tv_var) && (NIL != sbhl_paranoia.sbhl_object_type_checking_p())) && (NIL == sbhl_search_vars.sbhl_true_tv_p(tv_var))) {
                                final SubLObject pcase_var = sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread);
                                if (pcase_var.eql($ERROR)) {
                                    sbhl_paranoia.sbhl_error(ONE_INTEGER, $str97$_A_is_not_a__A, tv_var, SBHL_TRUE_TV_P, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                } else
                                    if (pcase_var.eql($CERROR)) {
                                        sbhl_paranoia.sbhl_cerror(ONE_INTEGER, $$$continue_anyway, $str97$_A_is_not_a__A, tv_var, SBHL_TRUE_TV_P, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                    } else
                                        if (pcase_var.eql($WARN)) {
                                            Errors.warn($str97$_A_is_not_a__A, tv_var, SBHL_TRUE_TV_P);
                                        } else {
                                            Errors.warn($str102$_A_is_not_a_valid__sbhl_type_erro, sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread));
                                            Errors.cerror($$$continue_anyway, $str97$_A_is_not_a__A, tv_var, SBHL_TRUE_TV_P);
                                        }


                            }
                            final SubLObject _prev_bind_0_$78 = sbhl_search_vars.$sbhl_search_module$.currentBinding(thread);
                            final SubLObject _prev_bind_1_$79 = sbhl_search_vars.$sbhl_search_module_type$.currentBinding(thread);
                            final SubLObject _prev_bind_2_$81 = sbhl_search_vars.$sbhl_add_node_to_result_test$.currentBinding(thread);
                            final SubLObject _prev_bind_4 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                            final SubLObject _prev_bind_5 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
                            try {
                                sbhl_search_vars.$sbhl_search_module$.bind(sbhl_module_vars.get_sbhl_module($$isa), thread);
                                sbhl_search_vars.$sbhl_search_module_type$.bind(sbhl_module_utilities.get_sbhl_module_type(sbhl_module_vars.get_sbhl_module($$isa)), thread);
                                sbhl_search_vars.$sbhl_add_node_to_result_test$.bind(sbhl_module_utilities.get_sbhl_add_node_to_result_test(sbhl_module_vars.get_sbhl_module($$isa)), thread);
                                sbhl_search_vars.$genl_inverse_mode_p$.bind(NIL, thread);
                                sbhl_module_vars.$sbhl_module$.bind(sbhl_module_vars.get_sbhl_module($$isa), thread);
                                if ((NIL != sbhl_paranoia.suspend_sbhl_type_checkingP()) || (NIL != sbhl_module_utilities.apply_sbhl_module_type_test(addressee, sbhl_module_vars.get_sbhl_module(UNPROVIDED)))) {
                                    final SubLObject _prev_bind_0_$79 = sbhl_search_vars.$sbhl_search_direction$.currentBinding(thread);
                                    final SubLObject _prev_bind_1_$80 = sbhl_link_vars.$sbhl_link_direction$.currentBinding(thread);
                                    final SubLObject _prev_bind_2_$82 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                    try {
                                        sbhl_search_vars.$sbhl_search_direction$.bind(sbhl_search_vars.get_sbhl_forward_search_direction(), thread);
                                        sbhl_link_vars.$sbhl_link_direction$.bind(sbhl_module_utilities.get_sbhl_module_forward_direction(sbhl_module_vars.get_sbhl_module(UNPROVIDED)), thread);
                                        sbhl_search_vars.$genl_inverse_mode_p$.bind(NIL, thread);
                                        SubLObject cdolist_list_var;
                                        final SubLObject accessible_modules = cdolist_list_var = sbhl_macros.get_sbhl_accessible_modules(sbhl_module_vars.get_sbhl_module($$isa));
                                        SubLObject module_var = NIL;
                                        module_var = cdolist_list_var.first();
                                        while (NIL != cdolist_list_var) {
                                            final SubLObject _prev_bind_0_$80 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
                                            final SubLObject _prev_bind_1_$81 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                            try {
                                                sbhl_module_vars.$sbhl_module$.bind(module_var, thread);
                                                sbhl_search_vars.$genl_inverse_mode_p$.bind(NIL != sbhl_search_vars.flip_genl_inverse_modeP(UNPROVIDED, UNPROVIDED) ? makeBoolean(NIL == sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue(thread)) : sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue(thread), thread);
                                                final SubLObject node = function_terms.naut_to_nart(node_var);
                                                if (NIL != sbhl_link_vars.sbhl_node_object_p(node)) {
                                                    final SubLObject d_link = sbhl_graphs.get_sbhl_graph_link(node, sbhl_module_vars.get_sbhl_module(UNPROVIDED));
                                                    if (NIL != d_link) {
                                                        final SubLObject mt_links = sbhl_links.get_sbhl_mt_links(d_link, sbhl_link_vars.get_sbhl_link_direction(), sbhl_module_vars.get_sbhl_module(UNPROVIDED));
                                                        if (NIL != mt_links) {
                                                            SubLObject iteration_state;
                                                            for (iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(mt_links)); NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state); iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state)) {
                                                                thread.resetMultipleValues();
                                                                final SubLObject mt_$87 = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
                                                                final SubLObject tv_links = thread.secondMultipleValue();
                                                                thread.resetMultipleValues();
                                                                if (NIL != mt_relevance_macros.relevant_mtP(mt_$87)) {
                                                                    final SubLObject _prev_bind_0_$81 = sbhl_link_vars.$sbhl_link_mt$.currentBinding(thread);
                                                                    try {
                                                                        sbhl_link_vars.$sbhl_link_mt$.bind(mt_$87, thread);
                                                                        SubLObject iteration_state_$89;
                                                                        for (iteration_state_$89 = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(tv_links)); NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state_$89); iteration_state_$89 = dictionary_contents.do_dictionary_contents_next(iteration_state_$89)) {
                                                                            thread.resetMultipleValues();
                                                                            final SubLObject tv = dictionary_contents.do_dictionary_contents_key_value(iteration_state_$89);
                                                                            final SubLObject link_nodes = thread.secondMultipleValue();
                                                                            thread.resetMultipleValues();
                                                                            if (NIL != sbhl_search_vars.relevant_sbhl_tvP(tv)) {
                                                                                final SubLObject _prev_bind_0_$82 = sbhl_link_vars.$sbhl_link_tv$.currentBinding(thread);
                                                                                try {
                                                                                    sbhl_link_vars.$sbhl_link_tv$.bind(tv, thread);
                                                                                    final SubLObject sol = link_nodes;
                                                                                    if (NIL != set.set_p(sol)) {
                                                                                        final SubLObject set_contents_var = set.do_set_internal(sol);
                                                                                        SubLObject basis_object;
                                                                                        SubLObject state;
                                                                                        SubLObject node_vars_link_node;
                                                                                        for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
                                                                                            node_vars_link_node = set_contents.do_set_contents_next(basis_object, state);
                                                                                            if ((NIL != set_contents.do_set_contents_element_validP(state, node_vars_link_node)) && (NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node, UNPROVIDED))) {
                                                                                                sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node, UNPROVIDED);
                                                                                                deck.deck_push(node_vars_link_node, recur_deck);
                                                                                            }
                                                                                        }
                                                                                    } else
                                                                                        if (sol.isList()) {
                                                                                            SubLObject csome_list_var = sol;
                                                                                            SubLObject node_vars_link_node2 = NIL;
                                                                                            node_vars_link_node2 = csome_list_var.first();
                                                                                            while (NIL != csome_list_var) {
                                                                                                if (NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node2, UNPROVIDED)) {
                                                                                                    sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node2, UNPROVIDED);
                                                                                                    deck.deck_push(node_vars_link_node2, recur_deck);
                                                                                                }
                                                                                                csome_list_var = csome_list_var.rest();
                                                                                                node_vars_link_node2 = csome_list_var.first();
                                                                                            } 
                                                                                        } else {
                                                                                            Errors.error($str104$_A_is_neither_SET_P_nor_LISTP_, sol);
                                                                                        }

                                                                                } finally {
                                                                                    sbhl_link_vars.$sbhl_link_tv$.rebind(_prev_bind_0_$82, thread);
                                                                                }
                                                                            }
                                                                        }
                                                                        dictionary_contents.do_dictionary_contents_finalize(iteration_state_$89);
                                                                    } finally {
                                                                        sbhl_link_vars.$sbhl_link_mt$.rebind(_prev_bind_0_$81, thread);
                                                                    }
                                                                }
                                                            }
                                                            dictionary_contents.do_dictionary_contents_finalize(iteration_state);
                                                        }
                                                    } else {
                                                        sbhl_paranoia.sbhl_error(FIVE_INTEGER, $str105$attempting_to_bind_direction_link, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                                    }
                                                } else
                                                    if (NIL != obsolete.cnat_p(node, UNPROVIDED)) {
                                                        SubLObject cdolist_list_var_$91;
                                                        final SubLObject new_list = cdolist_list_var_$91 = (NIL != sbhl_link_vars.sbhl_randomize_lists_p()) ? list_utilities.randomize_list(sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators(sbhl_link_vars.get_sbhl_link_direction(), sbhl_search_vars.$sbhl_tv$.getDynamicValue(thread), sbhl_module_vars.get_sbhl_module(UNPROVIDED))) : sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators(sbhl_link_vars.get_sbhl_link_direction(), sbhl_search_vars.$sbhl_tv$.getDynamicValue(thread), sbhl_module_vars.get_sbhl_module(UNPROVIDED));
                                                        SubLObject generating_fn = NIL;
                                                        generating_fn = cdolist_list_var_$91.first();
                                                        while (NIL != cdolist_list_var_$91) {
                                                            final SubLObject _prev_bind_0_$83 = sbhl_link_vars.$sbhl_link_generator$.currentBinding(thread);
                                                            try {
                                                                sbhl_link_vars.$sbhl_link_generator$.bind(generating_fn, thread);
                                                                final SubLObject sol2;
                                                                final SubLObject link_nodes2 = sol2 = funcall(generating_fn, node);
                                                                if (NIL != set.set_p(sol2)) {
                                                                    final SubLObject set_contents_var2 = set.do_set_internal(sol2);
                                                                    SubLObject basis_object2;
                                                                    SubLObject state2;
                                                                    SubLObject node_vars_link_node3;
                                                                    for (basis_object2 = set_contents.do_set_contents_basis_object(set_contents_var2), state2 = NIL, state2 = set_contents.do_set_contents_initial_state(basis_object2, set_contents_var2); NIL == set_contents.do_set_contents_doneP(basis_object2, state2); state2 = set_contents.do_set_contents_update_state(state2)) {
                                                                        node_vars_link_node3 = set_contents.do_set_contents_next(basis_object2, state2);
                                                                        if ((NIL != set_contents.do_set_contents_element_validP(state2, node_vars_link_node3)) && (NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node3, UNPROVIDED))) {
                                                                            sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node3, UNPROVIDED);
                                                                            deck.deck_push(node_vars_link_node3, recur_deck);
                                                                        }
                                                                    }
                                                                } else
                                                                    if (sol2.isList()) {
                                                                        SubLObject csome_list_var2 = sol2;
                                                                        SubLObject node_vars_link_node4 = NIL;
                                                                        node_vars_link_node4 = csome_list_var2.first();
                                                                        while (NIL != csome_list_var2) {
                                                                            if (NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node4, UNPROVIDED)) {
                                                                                sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node4, UNPROVIDED);
                                                                                deck.deck_push(node_vars_link_node4, recur_deck);
                                                                            }
                                                                            csome_list_var2 = csome_list_var2.rest();
                                                                            node_vars_link_node4 = csome_list_var2.first();
                                                                        } 
                                                                    } else {
                                                                        Errors.error($str104$_A_is_neither_SET_P_nor_LISTP_, sol2);
                                                                    }

                                                            } finally {
                                                                sbhl_link_vars.$sbhl_link_generator$.rebind(_prev_bind_0_$83, thread);
                                                            }
                                                            cdolist_list_var_$91 = cdolist_list_var_$91.rest();
                                                            generating_fn = cdolist_list_var_$91.first();
                                                        } 
                                                    }

                                            } finally {
                                                sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_1_$81, thread);
                                                sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_0_$80, thread);
                                            }
                                            cdolist_list_var = cdolist_list_var.rest();
                                            module_var = cdolist_list_var.first();
                                        } 
                                        node_var = deck.deck_pop(recur_deck);
                                        final SubLObject _prev_bind_0_$84 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
                                        final SubLObject _prev_bind_1_$82 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                        final SubLObject _prev_bind_2_$83 = sbhl_link_vars.$sbhl_link_direction$.currentBinding(thread);
                                        try {
                                            sbhl_module_vars.$sbhl_module$.bind(sbhl_module_utilities.get_sbhl_transfers_through_module(sbhl_search_vars.get_sbhl_search_module()), thread);
                                            sbhl_search_vars.$genl_inverse_mode_p$.bind(NIL, thread);
                                            sbhl_link_vars.$sbhl_link_direction$.bind(sbhl_module_utilities.get_sbhl_module_forward_direction(sbhl_module_vars.get_sbhl_module(UNPROVIDED)), thread);
                                            while (NIL != node_var) {
                                                final SubLObject type = node_var;
                                                final SubLObject irrelevance_mt = narts_high.find_nart(list($$IrrelevanceContextForTypeFn, type));
                                                if ((NIL != mt) && (NIL != irrelevance_mt)) {
                                                    mt = pph_utilities.pph_canonicalize_hlmt(list($$MtUnionFn, mt, irrelevance_mt));
                                                } else
                                                    if (NIL != irrelevance_mt) {
                                                        mt = irrelevance_mt;
                                                    }

                                                SubLObject cdolist_list_var2;
                                                final SubLObject accessible_modules2 = cdolist_list_var2 = sbhl_macros.get_sbhl_accessible_modules(sbhl_module_vars.get_sbhl_module(UNPROVIDED));
                                                SubLObject module_var2 = NIL;
                                                module_var2 = cdolist_list_var2.first();
                                                while (NIL != cdolist_list_var2) {
                                                    final SubLObject _prev_bind_0_$85 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
                                                    final SubLObject _prev_bind_1_$83 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                                    try {
                                                        sbhl_module_vars.$sbhl_module$.bind(module_var2, thread);
                                                        sbhl_search_vars.$genl_inverse_mode_p$.bind(NIL != sbhl_search_vars.flip_genl_inverse_modeP(UNPROVIDED, UNPROVIDED) ? makeBoolean(NIL == sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue(thread)) : sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue(thread), thread);
                                                        final SubLObject node2 = function_terms.naut_to_nart(node_var);
                                                        if (NIL != sbhl_link_vars.sbhl_node_object_p(node2)) {
                                                            final SubLObject d_link2 = sbhl_graphs.get_sbhl_graph_link(node2, sbhl_module_vars.get_sbhl_module(UNPROVIDED));
                                                            if (NIL != d_link2) {
                                                                final SubLObject mt_links2 = sbhl_links.get_sbhl_mt_links(d_link2, sbhl_link_vars.get_sbhl_link_direction(), sbhl_module_vars.get_sbhl_module(UNPROVIDED));
                                                                if (NIL != mt_links2) {
                                                                    SubLObject iteration_state2;
                                                                    for (iteration_state2 = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(mt_links2)); NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state2); iteration_state2 = dictionary_contents.do_dictionary_contents_next(iteration_state2)) {
                                                                        thread.resetMultipleValues();
                                                                        final SubLObject mt_$88 = dictionary_contents.do_dictionary_contents_key_value(iteration_state2);
                                                                        final SubLObject tv_links2 = thread.secondMultipleValue();
                                                                        thread.resetMultipleValues();
                                                                        if (NIL != mt_relevance_macros.relevant_mtP(mt_$88)) {
                                                                            final SubLObject _prev_bind_0_$86 = sbhl_link_vars.$sbhl_link_mt$.currentBinding(thread);
                                                                            try {
                                                                                sbhl_link_vars.$sbhl_link_mt$.bind(mt_$88, thread);
                                                                                SubLObject iteration_state_$90;
                                                                                for (iteration_state_$90 = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(tv_links2)); NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state_$90); iteration_state_$90 = dictionary_contents.do_dictionary_contents_next(iteration_state_$90)) {
                                                                                    thread.resetMultipleValues();
                                                                                    final SubLObject tv2 = dictionary_contents.do_dictionary_contents_key_value(iteration_state_$90);
                                                                                    final SubLObject link_nodes3 = thread.secondMultipleValue();
                                                                                    thread.resetMultipleValues();
                                                                                    if (NIL != sbhl_search_vars.relevant_sbhl_tvP(tv2)) {
                                                                                        final SubLObject _prev_bind_0_$87 = sbhl_link_vars.$sbhl_link_tv$.currentBinding(thread);
                                                                                        try {
                                                                                            sbhl_link_vars.$sbhl_link_tv$.bind(tv2, thread);
                                                                                            final SubLObject sol3 = link_nodes3;
                                                                                            if (NIL != set.set_p(sol3)) {
                                                                                                final SubLObject set_contents_var3 = set.do_set_internal(sol3);
                                                                                                SubLObject basis_object3;
                                                                                                SubLObject state3;
                                                                                                SubLObject node_vars_link_node5;
                                                                                                for (basis_object3 = set_contents.do_set_contents_basis_object(set_contents_var3), state3 = NIL, state3 = set_contents.do_set_contents_initial_state(basis_object3, set_contents_var3); NIL == set_contents.do_set_contents_doneP(basis_object3, state3); state3 = set_contents.do_set_contents_update_state(state3)) {
                                                                                                    node_vars_link_node5 = set_contents.do_set_contents_next(basis_object3, state3);
                                                                                                    if ((NIL != set_contents.do_set_contents_element_validP(state3, node_vars_link_node5)) && (NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node5, UNPROVIDED))) {
                                                                                                        sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node5, UNPROVIDED);
                                                                                                        deck.deck_push(node_vars_link_node5, recur_deck);
                                                                                                    }
                                                                                                }
                                                                                            } else
                                                                                                if (sol3.isList()) {
                                                                                                    SubLObject csome_list_var3 = sol3;
                                                                                                    SubLObject node_vars_link_node6 = NIL;
                                                                                                    node_vars_link_node6 = csome_list_var3.first();
                                                                                                    while (NIL != csome_list_var3) {
                                                                                                        if (NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node6, UNPROVIDED)) {
                                                                                                            sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node6, UNPROVIDED);
                                                                                                            deck.deck_push(node_vars_link_node6, recur_deck);
                                                                                                        }
                                                                                                        csome_list_var3 = csome_list_var3.rest();
                                                                                                        node_vars_link_node6 = csome_list_var3.first();
                                                                                                    } 
                                                                                                } else {
                                                                                                    Errors.error($str104$_A_is_neither_SET_P_nor_LISTP_, sol3);
                                                                                                }

                                                                                        } finally {
                                                                                            sbhl_link_vars.$sbhl_link_tv$.rebind(_prev_bind_0_$87, thread);
                                                                                        }
                                                                                    }
                                                                                }
                                                                                dictionary_contents.do_dictionary_contents_finalize(iteration_state_$90);
                                                                            } finally {
                                                                                sbhl_link_vars.$sbhl_link_mt$.rebind(_prev_bind_0_$86, thread);
                                                                            }
                                                                        }
                                                                    }
                                                                    dictionary_contents.do_dictionary_contents_finalize(iteration_state2);
                                                                }
                                                            } else {
                                                                sbhl_paranoia.sbhl_error(FIVE_INTEGER, $str105$attempting_to_bind_direction_link, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                                            }
                                                        } else
                                                            if (NIL != obsolete.cnat_p(node2, UNPROVIDED)) {
                                                                SubLObject cdolist_list_var_$92;
                                                                final SubLObject new_list2 = cdolist_list_var_$92 = (NIL != sbhl_link_vars.sbhl_randomize_lists_p()) ? list_utilities.randomize_list(sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators(sbhl_link_vars.get_sbhl_link_direction(), sbhl_search_vars.$sbhl_tv$.getDynamicValue(thread), sbhl_module_vars.get_sbhl_module(UNPROVIDED))) : sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators(sbhl_link_vars.get_sbhl_link_direction(), sbhl_search_vars.$sbhl_tv$.getDynamicValue(thread), sbhl_module_vars.get_sbhl_module(UNPROVIDED));
                                                                SubLObject generating_fn2 = NIL;
                                                                generating_fn2 = cdolist_list_var_$92.first();
                                                                while (NIL != cdolist_list_var_$92) {
                                                                    final SubLObject _prev_bind_0_$88 = sbhl_link_vars.$sbhl_link_generator$.currentBinding(thread);
                                                                    try {
                                                                        sbhl_link_vars.$sbhl_link_generator$.bind(generating_fn2, thread);
                                                                        final SubLObject sol4;
                                                                        final SubLObject link_nodes4 = sol4 = funcall(generating_fn2, node2);
                                                                        if (NIL != set.set_p(sol4)) {
                                                                            final SubLObject set_contents_var4 = set.do_set_internal(sol4);
                                                                            SubLObject node_vars_link_node2;
                                                                            SubLObject basis_object4;
                                                                            SubLObject state4;
                                                                            for (basis_object4 = set_contents.do_set_contents_basis_object(set_contents_var4), state4 = NIL, state4 = set_contents.do_set_contents_initial_state(basis_object4, set_contents_var4); NIL == set_contents.do_set_contents_doneP(basis_object4, state4); state4 = set_contents.do_set_contents_update_state(state4)) {
                                                                                node_vars_link_node2 = set_contents.do_set_contents_next(basis_object4, state4);
                                                                                if ((NIL != set_contents.do_set_contents_element_validP(state4, node_vars_link_node2)) && (NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node2, UNPROVIDED))) {
                                                                                    sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node2, UNPROVIDED);
                                                                                    deck.deck_push(node_vars_link_node2, recur_deck);
                                                                                }
                                                                            }
                                                                        } else
                                                                            if (sol4.isList()) {
                                                                                SubLObject csome_list_var4 = sol4;
                                                                                SubLObject node_vars_link_node7 = NIL;
                                                                                node_vars_link_node7 = csome_list_var4.first();
                                                                                while (NIL != csome_list_var4) {
                                                                                    if (NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node7, UNPROVIDED)) {
                                                                                        sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node7, UNPROVIDED);
                                                                                        deck.deck_push(node_vars_link_node7, recur_deck);
                                                                                    }
                                                                                    csome_list_var4 = csome_list_var4.rest();
                                                                                    node_vars_link_node7 = csome_list_var4.first();
                                                                                } 
                                                                            } else {
                                                                                Errors.error($str104$_A_is_neither_SET_P_nor_LISTP_, sol4);
                                                                            }

                                                                    } finally {
                                                                        sbhl_link_vars.$sbhl_link_generator$.rebind(_prev_bind_0_$88, thread);
                                                                    }
                                                                    cdolist_list_var_$92 = cdolist_list_var_$92.rest();
                                                                    generating_fn2 = cdolist_list_var_$92.first();
                                                                } 
                                                            }

                                                    } finally {
                                                        sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_1_$83, thread);
                                                        sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_0_$85, thread);
                                                    }
                                                    cdolist_list_var2 = cdolist_list_var2.rest();
                                                    module_var2 = cdolist_list_var2.first();
                                                } 
                                                node_var = deck.deck_pop(recur_deck);
                                            } 
                                        } finally {
                                            sbhl_link_vars.$sbhl_link_direction$.rebind(_prev_bind_2_$83, thread);
                                            sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_1_$82, thread);
                                            sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_0_$84, thread);
                                        }
                                    } finally {
                                        sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_2_$82, thread);
                                        sbhl_link_vars.$sbhl_link_direction$.rebind(_prev_bind_1_$80, thread);
                                        sbhl_search_vars.$sbhl_search_direction$.rebind(_prev_bind_0_$79, thread);
                                    }
                                } else {
                                    sbhl_paranoia.sbhl_warn(TWO_INTEGER, $str107$Node__a_does_not_pass_sbhl_type_t, addressee, sbhl_module_utilities.get_sbhl_type_test(sbhl_module_vars.get_sbhl_module(UNPROVIDED)), UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                }
                            } finally {
                                sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_5, thread);
                                sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_4, thread);
                                sbhl_search_vars.$sbhl_add_node_to_result_test$.rebind(_prev_bind_2_$81, thread);
                                sbhl_search_vars.$sbhl_search_module_type$.rebind(_prev_bind_1_$79, thread);
                                sbhl_search_vars.$sbhl_search_module$.rebind(_prev_bind_0_$78, thread);
                            }
                        } finally {
                            sbhl_search_vars.$relevant_sbhl_tv_function$.rebind(_prev_bind_1_$78, thread);
                            sbhl_search_vars.$sbhl_tv$.rebind(_prev_bind_0_$77, thread);
                        }
                    } finally {
                        final SubLObject _prev_bind_0_$89 = $is_thread_performing_cleanupP$.currentBinding(thread);
                        try {
                            $is_thread_performing_cleanupP$.bind(T, thread);
                            final SubLObject _values = getValuesAsVector();
                            sbhl_marking_vars.free_sbhl_marking_space(sbhl_marking_vars.$sbhl_space$.getDynamicValue(thread));
                            restoreValuesFromVector(_values);
                        } finally {
                            $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$89, thread);
                        }
                    }
                } finally {
                    sbhl_marking_vars.$sbhl_space$.rebind(_prev_bind_0_$76, thread);
                }
            } finally {
                mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_3, thread);
                mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_2, thread);
                mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
            }
        }
        return mt;
    }

    public static SubLObject pph_irrelevance_check_mt_for_addressee(SubLObject addressee, SubLObject domain_mt) {
        if (addressee == UNPROVIDED) {
            addressee = pph_vars.$pph_addressee$.getDynamicValue();
        }
        if (domain_mt == UNPROVIDED) {
            domain_mt = pph_vars.$pph_domain_mt$.getDynamicValue();
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
        SubLObject caching_state = NIL;
        if (NIL == v_memoization_state) {
            return pph_irrelevance_check_mt_for_addressee_internal(addressee, domain_mt);
        }
        caching_state = memoization_state.memoization_state_lookup(v_memoization_state, PPH_IRRELEVANCE_CHECK_MT_FOR_ADDRESSEE, UNPROVIDED);
        if (NIL == caching_state) {
            caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), PPH_IRRELEVANCE_CHECK_MT_FOR_ADDRESSEE, TWO_INTEGER, NIL, EQL, UNPROVIDED);
            memoization_state.memoization_state_put(v_memoization_state, PPH_IRRELEVANCE_CHECK_MT_FOR_ADDRESSEE, caching_state);
        }
        final SubLObject sxhash = memoization_state.sxhash_calc_2(addressee, domain_mt);
        final SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, UNPROVIDED);
        if (!collisions.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            SubLObject cdolist_list_var = collisions;
            SubLObject collision = NIL;
            collision = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                SubLObject cached_args = collision.first();
                final SubLObject results2 = second(collision);
                if (addressee.eql(cached_args.first())) {
                    cached_args = cached_args.rest();
                    if (((NIL != cached_args) && (NIL == cached_args.rest())) && domain_mt.eql(cached_args.first())) {
                        return memoization_state.caching_results(results2);
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                collision = cdolist_list_var.first();
            } 
        }
        final SubLObject results3 = arg2(thread.resetMultipleValues(), multiple_value_list(pph_irrelevance_check_mt_for_addressee_internal(addressee, domain_mt)));
        memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results3, list(addressee, domain_mt));
        return memoization_state.caching_results(results3);
    }

    public static SubLObject pph_required_ruleP(final SubLObject v_object) {
        if ((NIL == assertion_handles.assertion_p(v_object)) || (NIL == assertions_high.rule_assertionP(v_object))) {
            return NIL;
        }
        if (NIL != kb_mapping_utilities.some_pred_value_in_any_mt(v_object, $const112$ruleRequiredForJustificationParap, UNPROVIDED, UNPROVIDED)) {
            return T;
        }
        return NIL;
    }

    public static SubLObject pph_trivial_assertionP(final SubLObject v_object, SubLObject domain_mt) {
        if (domain_mt == UNPROVIDED) {
            domain_mt = pph_triviality_check_mt();
        }
        return makeBoolean((NIL != assertion_handles.assertion_p(v_object)) && (NIL != pph_assertion_trivialP(v_object, domain_mt)));
    }

    public static SubLObject pph_assertion_trivialP(final SubLObject assertion, SubLObject domain_mt) {
        if (domain_mt == UNPROVIDED) {
            domain_mt = pph_triviality_check_mt();
        }
        if (NIL != pph_trivial_mtP(arguments.support_mt(assertion), domain_mt)) {
            return T;
        }
        if (NIL != pph_trivial_termP(assertion, $ASSERTION, domain_mt)) {
            return T;
        }
        if (NIL != pph_trivial_sentenceP(assertions_high.assertion_formula(assertion), domain_mt)) {
            return T;
        }
        if (NIL != pph_trivial_derived_assertionP(assertion, domain_mt)) {
            return T;
        }
        return NIL;
    }

    public static SubLObject pph_trivial_derived_assertionP(final SubLObject assertion, final SubLObject domain_mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != assertions_high.asserted_assertionP(assertion)) {
            return NIL;
        }
        SubLObject trivialP = NIL;
        final SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate(domain_mt);
        final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
        try {
            mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
            mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
            mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
            SubLObject rest;
            SubLObject argument;
            SubLObject rest_$105;
            SubLObject support;
            for (rest = NIL, rest = assertions_high.assertion_arguments(assertion); (NIL == trivialP) && (NIL != rest); rest = rest.rest()) {
                argument = rest.first();
                if (NIL != deduction_handles.deduction_p(argument)) {
                    for (rest_$105 = NIL, rest_$105 = deductions_high.deduction_supports(argument); (NIL == trivialP) && (NIL != rest_$105); rest_$105 = rest_$105.rest()) {
                        support = rest_$105.first();
                        if ((NIL != assertion_handles.assertion_p(support)) && (NIL != kb_mapping_utilities.some_pred_value(support, $$ruleConclusionsTrivial, UNPROVIDED, UNPROVIDED))) {
                            if (NIL != pph_vars.$pph_irrelevant_warnP$.getDynamicValue(thread)) {
                                Errors.warn(cconcatenate(cconcatenate($str115$PPH_irrelevant_formula_, new SubLObject[]{ format_nil.$format_nil_percent$.getGlobalValue(), $$$_, format_nil.format_nil_s_no_copy(assertion), format_nil.$format_nil_percent$.getGlobalValue() }), $str117$Derived_from_rule_whose_conclusio), support);
                            }
                            trivialP = T;
                        }
                    }
                }
            }
        } finally {
            mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_3, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
        }
        return trivialP;
    }

    public static SubLObject pph_trivial_mtP(final SubLObject v_object, SubLObject domain_mt) {
        if (domain_mt == UNPROVIDED) {
            domain_mt = pph_triviality_check_mt();
        }
        if (NIL == hlmt.hlmt_p(v_object)) {
            return NIL;
        }
        final SubLObject monad_mt = hlmt.hlmt_monad_mt(v_object);
        if ((NIL != somewhere_cache.maybe_some_pred_assertion_somewhereP($const118$mtTrivialForJustificationParaphra, monad_mt, ONE_INTEGER, UNPROVIDED)) && (NIL != pph_trivial_termP(monad_mt, $MT, domain_mt))) {
            return T;
        }
        return NIL;
    }

    public static SubLObject pph_proof_to_show_p(final SubLObject proof, final SubLObject proof_query_formula, final SubLObject domain_mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != $pph_show_gory_proof_details$.getDynamicValue(thread)) {
            return T;
        }
        if (NIL != inference_worker.structural_proof_p(proof)) {
            return T;
        }
        if (NIL != pph_non_explanatory_proof_p(proof)) {
            return NIL;
        }
        if (NIL != pph_trivial_sentenceP(proof_query_formula, domain_mt)) {
            return NIL;
        }
        if (NIL != pph_irrelevant_formulaP(proof_query_formula, UNPROVIDED, UNPROVIDED)) {
            return NIL;
        }
        return T;
    }

    public static SubLObject pph_non_explanatory_proof_p(final SubLObject proof) {
        return subl_promotions.memberP(proof, pph_non_explanatory_proofs(), UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject pph_non_explanatory_proofs() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return pph_vars.$pph_non_explanatory_proofs$.getDynamicValue(thread).isList() ? pph_vars.$pph_non_explanatory_proofs$.getDynamicValue(thread) : NIL;
    }

    public static SubLObject pph_proof_fancy_indent(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject indent_content = NIL;
        destructuring_bind_must_consp(current, datum, $list120);
        indent_content = current.first();
        final SubLObject body;
        current = body = current.rest();
        return list(HTML_FANCY_TABLE, $list122, list(HTML_TABLE_ROW, list(HTML_FANCY_TABLE_DATA, $list125, indent_content), bq_cons(HTML_TABLE_DATA, append(body, NIL))));
    }

    public static SubLObject pph_proof_indent(final SubLObject macroform, final SubLObject environment) {
        final SubLObject datum = macroform.rest();
        final SubLObject body;
        final SubLObject current = body = datum;
        return list(HTML_FANCY_TABLE, $list122, list(HTML_TABLE_ROW, $list127, bq_cons(HTML_TABLE_DATA, append(body, NIL))));
    }

    public static SubLObject pph_maybe_show_subproofs(final SubLObject subproofs, final SubLObject mt, final SubLObject index_string, SubLObject label) {
        if (label == UNPROVIDED) {
            label = $$$Supporting_Facts;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != pph_vars.$pph_use_showXhideP$.getDynamicValue(thread)) {
            final SubLObject object_id = cconcatenate($str128$subproofs_, index_string);
            html_markup(dhtml_macros.$dhtml_css_head$.getGlobalValue());
            html_markup(dhtml_macros.$dhtml_css_type$.getGlobalValue());
            html_char(CHAR_quotation, UNPROVIDED);
            html_markup($str38$text_css);
            html_char(CHAR_quotation, UNPROVIDED);
            html_markup(dhtml_macros.$dhtml_css_media$.getGlobalValue());
            html_char(CHAR_quotation, UNPROVIDED);
            html_markup($$$screen);
            html_char(CHAR_quotation, UNPROVIDED);
            html_char(CHAR_greater, UNPROVIDED);
            SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
            try {
                html_macros.$html_safe_print$.bind(T, thread);
                html_terpri(UNPROVIDED);
                dhtml_macros.dhtml_dom_wrapper_preamble(object_id);
                dhtml_macros.dhtml_dom_attribute_preamble(dhtml_macros.$dhtml_dom_display$.getGlobalValue());
                html_markup($$$none);
                dhtml_macros.dhtml_dom_attribute_postamble();
                dhtml_macros.dhtml_dom_wrapper_postamble();
                html_terpri(UNPROVIDED);
            } finally {
                html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
            }
            html_markup(dhtml_macros.$dhtml_css_tail$.getGlobalValue());
            html_terpri(UNPROVIDED);
            dhtml_macros.dhtml_switch_visibility_links_arrows(object_id, label);
            dhtml_macros.dhtml_set_switched_visibility(object_id, $INVISIBLE, $TEXT);
            html_markup(html_macros.$html_div_head$.getGlobalValue());
            if (NIL != object_id) {
                html_markup(html_macros.$html_attribute_id$.getGlobalValue());
                html_char(CHAR_quotation, UNPROVIDED);
                html_markup(object_id);
                html_char(CHAR_quotation, UNPROVIDED);
            }
            html_char(CHAR_greater, UNPROVIDED);
            _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
            try {
                html_macros.$html_safe_print$.bind(T, thread);
                if (NIL != list_utilities.singletonP(subproofs)) {
                    html_markup(html_macros.$html_table_head$.getGlobalValue());
                    html_markup(html_macros.$html_attribute_class$.getGlobalValue());
                    html_char(CHAR_quotation, UNPROVIDED);
                    html_markup($str129$pf_indent);
                    html_char(CHAR_quotation, UNPROVIDED);
                    html_markup(html_macros.$html_table_border$.getGlobalValue());
                    html_char(CHAR_quotation, UNPROVIDED);
                    html_markup(ZERO_INTEGER);
                    html_char(CHAR_quotation, UNPROVIDED);
                    html_char(CHAR_greater, UNPROVIDED);
                    final SubLObject _prev_bind_0_$106 = html_macros.$html_safe_print$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind(T, thread);
                        html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                        html_char(CHAR_greater, UNPROVIDED);
                        final SubLObject _prev_bind_0_$107 = html_macros.$html_safe_print$.currentBinding(thread);
                        try {
                            html_macros.$html_safe_print$.bind(T, thread);
                            html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                            html_markup(html_macros.$html_attribute_class$.getGlobalValue());
                            html_char(CHAR_quotation, UNPROVIDED);
                            html_markup($str130$pf_indent_td);
                            html_char(CHAR_quotation, UNPROVIDED);
                            html_char(CHAR_greater, UNPROVIDED);
                            final SubLObject _prev_bind_0_$108 = html_macros.$html_safe_print$.currentBinding(thread);
                            try {
                                html_macros.$html_safe_print$.bind(T, thread);
                            } finally {
                                html_macros.$html_safe_print$.rebind(_prev_bind_0_$108, thread);
                            }
                            html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                            html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                            html_char(CHAR_greater, UNPROVIDED);
                            final SubLObject _prev_bind_0_$109 = html_macros.$html_safe_print$.currentBinding(thread);
                            try {
                                html_macros.$html_safe_print$.bind(T, thread);
                                final SubLObject subproof_index_string = format(NIL, $str131$_A_subproof, index_string);
                                pph_show_inference_proof(subproofs.first(), mt, subproof_index_string);
                            } finally {
                                html_macros.$html_safe_print$.rebind(_prev_bind_0_$109, thread);
                            }
                            html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                        } finally {
                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$107, thread);
                        }
                        html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                        html_source_readability_terpri(UNPROVIDED);
                    } finally {
                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$106, thread);
                    }
                    html_markup(html_macros.$html_table_tail$.getGlobalValue());
                } else {
                    html_markup(html_macros.$html_table_head$.getGlobalValue());
                    html_markup(html_macros.$html_attribute_class$.getGlobalValue());
                    html_char(CHAR_quotation, UNPROVIDED);
                    html_markup($str129$pf_indent);
                    html_char(CHAR_quotation, UNPROVIDED);
                    html_markup(html_macros.$html_table_border$.getGlobalValue());
                    html_char(CHAR_quotation, UNPROVIDED);
                    html_markup(ZERO_INTEGER);
                    html_char(CHAR_quotation, UNPROVIDED);
                    html_char(CHAR_greater, UNPROVIDED);
                    final SubLObject _prev_bind_0_$110 = html_macros.$html_safe_print$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind(T, thread);
                        html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                        html_char(CHAR_greater, UNPROVIDED);
                        final SubLObject _prev_bind_0_$111 = html_macros.$html_safe_print$.currentBinding(thread);
                        try {
                            html_macros.$html_safe_print$.bind(T, thread);
                            html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                            html_markup(html_macros.$html_attribute_class$.getGlobalValue());
                            html_char(CHAR_quotation, UNPROVIDED);
                            html_markup($str130$pf_indent_td);
                            html_char(CHAR_quotation, UNPROVIDED);
                            html_char(CHAR_greater, UNPROVIDED);
                            final SubLObject _prev_bind_0_$112 = html_macros.$html_safe_print$.currentBinding(thread);
                            try {
                                html_macros.$html_safe_print$.bind(T, thread);
                            } finally {
                                html_macros.$html_safe_print$.rebind(_prev_bind_0_$112, thread);
                            }
                            html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                            html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                            html_char(CHAR_greater, UNPROVIDED);
                            final SubLObject _prev_bind_0_$113 = html_macros.$html_safe_print$.currentBinding(thread);
                            try {
                                html_macros.$html_safe_print$.bind(T, thread);
                                SubLObject list_var = NIL;
                                SubLObject subproof = NIL;
                                SubLObject subproof_num = NIL;
                                list_var = subproofs;
                                subproof = list_var.first();
                                for (subproof_num = ZERO_INTEGER; NIL != list_var; list_var = list_var.rest() , subproof = list_var.first() , subproof_num = add(ONE_INTEGER, subproof_num)) {
                                    final SubLObject subproof_index_string2 = format(NIL, $str132$_A_subproof__D, index_string, subproof_num);
                                    pph_show_inference_proof(subproof, mt, subproof_index_string2);
                                }
                            } finally {
                                html_macros.$html_safe_print$.rebind(_prev_bind_0_$113, thread);
                            }
                            html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                        } finally {
                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$111, thread);
                        }
                        html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                        html_source_readability_terpri(UNPROVIDED);
                    } finally {
                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$110, thread);
                    }
                    html_markup(html_macros.$html_table_tail$.getGlobalValue());
                }
            } finally {
                html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
            }
            html_markup(html_macros.$html_div_tail$.getGlobalValue());
            html_source_readability_terpri(UNPROVIDED);
            return NIL;
        }
        html_markup(html_macros.$html_table_head$.getGlobalValue());
        html_markup(html_macros.$html_attribute_class$.getGlobalValue());
        html_char(CHAR_quotation, UNPROVIDED);
        html_markup($str129$pf_indent);
        html_char(CHAR_quotation, UNPROVIDED);
        html_markup(html_macros.$html_table_border$.getGlobalValue());
        html_char(CHAR_quotation, UNPROVIDED);
        html_markup(ZERO_INTEGER);
        html_char(CHAR_quotation, UNPROVIDED);
        html_char(CHAR_greater, UNPROVIDED);
        final SubLObject _prev_bind_2 = html_macros.$html_safe_print$.currentBinding(thread);
        try {
            html_macros.$html_safe_print$.bind(T, thread);
            html_markup(html_macros.$html_table_row_head$.getGlobalValue());
            html_char(CHAR_greater, UNPROVIDED);
            final SubLObject _prev_bind_0_$114 = html_macros.$html_safe_print$.currentBinding(thread);
            try {
                html_macros.$html_safe_print$.bind(T, thread);
                html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                html_markup(html_macros.$html_attribute_class$.getGlobalValue());
                html_char(CHAR_quotation, UNPROVIDED);
                html_markup($str130$pf_indent_td);
                html_char(CHAR_quotation, UNPROVIDED);
                html_char(CHAR_greater, UNPROVIDED);
                final SubLObject _prev_bind_0_$115 = html_macros.$html_safe_print$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind(T, thread);
                } finally {
                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$115, thread);
                }
                html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                html_char(CHAR_greater, UNPROVIDED);
                final SubLObject _prev_bind_0_$116 = html_macros.$html_safe_print$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind(T, thread);
                    html_princ_strong(label);
                    html_markup(html_macros.$html_unordered_list_head$.getGlobalValue());
                    html_char(CHAR_greater, UNPROVIDED);
                    final SubLObject _prev_bind_0_$117 = html_macros.$html_safe_print$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind(T, thread);
                        SubLObject list_var2 = NIL;
                        SubLObject subproof2 = NIL;
                        SubLObject subproof_num2 = NIL;
                        list_var2 = subproofs;
                        subproof2 = list_var2.first();
                        for (subproof_num2 = ZERO_INTEGER; NIL != list_var2; list_var2 = list_var2.rest() , subproof2 = list_var2.first() , subproof_num2 = add(ONE_INTEGER, subproof_num2)) {
                            html_markup(html_macros.$html_list_item_head$.getGlobalValue());
                            html_char(CHAR_greater, UNPROVIDED);
                            final SubLObject _prev_bind_0_$118 = html_macros.$html_safe_print$.currentBinding(thread);
                            try {
                                html_macros.$html_safe_print$.bind(T, thread);
                                pph_show_inference_proof(subproof2, mt, UNPROVIDED);
                            } finally {
                                html_macros.$html_safe_print$.rebind(_prev_bind_0_$118, thread);
                            }
                            html_markup(html_macros.$html_list_item_tail$.getGlobalValue());
                        }
                    } finally {
                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$117, thread);
                    }
                    html_markup(html_macros.$html_unordered_list_tail$.getGlobalValue());
                } finally {
                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$116, thread);
                }
                html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
            } finally {
                html_macros.$html_safe_print$.rebind(_prev_bind_0_$114, thread);
            }
            html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
            html_source_readability_terpri(UNPROVIDED);
        } finally {
            html_macros.$html_safe_print$.rebind(_prev_bind_2, thread);
        }
        html_markup(html_macros.$html_table_tail$.getGlobalValue());
        return NIL;
    }

    public static SubLObject pph_set_meta_support_max(final SubLObject value) {
        if (NIL != subl_promotions.non_negative_integer_p(value)) {
            $pph_meta_support_max$.setGlobalValue(value);
        }
        return $pph_meta_support_max$.getGlobalValue();
    }

    public static SubLObject pph_show_support(final SubLObject support, SubLObject index_string, SubLObject known_invalid_supports) {
        if (index_string == UNPROVIDED) {
            index_string = $$$support;
        }
        if (known_invalid_supports == UNPROVIDED) {
            known_invalid_supports = $UNCOMPUTED;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != arguments.support_p(support)) {
            final SubLObject _prev_bind_0 = pph_vars.$pph_domain_mt$.currentBinding(thread);
            try {
                pph_vars.$pph_domain_mt$.bind(pph_methods.pph_enhanced_domain_mt(arguments.support_mt(support), UNPROVIDED), thread);
                if (NIL != assertion_handles.assertion_p(support)) {
                    final SubLObject _prev_bind_0_$119 = pph_vars.$pph_use_bulleted_listsP$.currentBinding(thread);
                    try {
                        pph_vars.$pph_use_bulleted_listsP$.bind(makeBoolean((NIL != pph_vars.$pph_use_bulleted_listsP$.getDynamicValue(thread)) || (NIL != assertions_high.rule_assertionP(support))), thread);
                        pph_show_assertion(support);
                        if (NIL != assertions_high.asserted_assertionP(support)) {
                            pph_maybe_show_assert_info(support, index_string);
                        }
                    } finally {
                        pph_vars.$pph_use_bulleted_listsP$.rebind(_prev_bind_0_$119, thread);
                    }
                } else
                    if (known_invalid_supports.isList() && (NIL != member(support, known_invalid_supports, symbol_function(EQUAL), UNPROVIDED))) {
                        pph_show_invalidated_support(support);
                    } else
                        if (((NIL != pph_vars.$validate_proof_supportsP$.getDynamicValue(thread)) && (known_invalid_supports == $UNCOMPUTED)) && (NIL != pph_invalid_supportP(support))) {
                            pph_show_invalidated_support(support);
                        } else {
                            final SubLObject formula = pph_support_sentence(support, UNPROVIDED);
                            final SubLObject highly_relevantP = pph_justification_pred_highly_relevantP(cycl_utilities.formula_arg0(formula), UNPROVIDED);
                            final SubLObject meta_supports = ((NIL != pph_vars.$pph_show_meta_supports_with_supportsP$.getDynamicValue(thread)) && $pph_meta_support_level$.getDynamicValue(thread).numL($pph_meta_support_max$.getGlobalValue())) ? pph_meta_supports_to_show(support, UNPROVIDED, UNPROVIDED) : NIL;
                            if (NIL != highly_relevantP) {
                                html_markup(html_macros.$html_span_head$.getGlobalValue());
                                html_markup(html_macros.$html_attribute_class$.getGlobalValue());
                                html_char(CHAR_quotation, UNPROVIDED);
                                html_markup($str135$highly_relevant);
                                html_char(CHAR_quotation, UNPROVIDED);
                                html_char(CHAR_greater, UNPROVIDED);
                                final SubLObject _prev_bind_0_$120 = html_macros.$html_safe_print$.currentBinding(thread);
                                try {
                                    html_macros.$html_safe_print$.bind(T, thread);
                                    pph_show_sentence(formula, UNPROVIDED, UNPROVIDED);
                                } finally {
                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$120, thread);
                                }
                                html_markup(html_macros.$html_span_tail$.getGlobalValue());
                            } else {
                                html_markup(html_macros.$html_span_head$.getGlobalValue());
                                html_char(CHAR_greater, UNPROVIDED);
                                final SubLObject _prev_bind_0_$121 = html_macros.$html_safe_print$.currentBinding(thread);
                                try {
                                    html_macros.$html_safe_print$.bind(T, thread);
                                    pph_show_sentence(formula, UNPROVIDED, UNPROVIDED);
                                } finally {
                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$121, thread);
                                }
                                html_markup(html_macros.$html_span_tail$.getGlobalValue());
                            }
                            if (NIL != meta_supports) {
                                final SubLObject _prev_bind_0_$122 = $pph_meta_support_level$.currentBinding(thread);
                                try {
                                    $pph_meta_support_level$.bind(number_utilities.f_1X($pph_meta_support_level$.getDynamicValue(thread)), thread);
                                    pph_maybe_show_meta_supports(meta_supports, index_string, UNPROVIDED);
                                } finally {
                                    $pph_meta_support_level$.rebind(_prev_bind_0_$122, thread);
                                }
                            } else
                                if (NIL != pph_proof_support_already_shown_p(support)) {
                                    final SubLObject see_above_index_string = cconcatenate(index_string, $str136$_see_above);
                                    pph_proof_show_see_above(see_above_index_string);
                                }

                        }


                pph_note_support_displayed(support);
            } finally {
                pph_vars.$pph_domain_mt$.rebind(_prev_bind_0, thread);
            }
        }
        return NIL;
    }

    public static SubLObject pph_justification_pred_highly_relevantP(final SubLObject pred, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = pph_vars.$pph_domain_mt$.getDynamicValue();
        }
        return pph_utilities.pph_ask_boolean(list($const137$predHighlyRelevantForJustificatio, pred), mt, UNPROVIDED);
    }

    public static SubLObject pph_show_invalidated_support(final SubLObject support) {
        final SubLObject sentence = pph_support_sentence(support, UNPROVIDED);
        html_markup(html_macros.$html_strikethrough_head$.getGlobalValue());
        if (NIL != el_formula_p(sentence)) {
            pph_show_sentence(sentence, UNPROVIDED, UNPROVIDED);
        } else {
            html_princ($$$Invalidated_support);
        }
        html_markup(html_macros.$html_strikethrough_tail$.getGlobalValue());
        return support;
    }

    public static SubLObject pph_maybe_show_meta_supports(final SubLObject meta_supports, SubLObject index_string, SubLObject label) {
        if (index_string == UNPROVIDED) {
            index_string = NIL;
        }
        if (label == UNPROVIDED) {
            label = $str41$;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != pph_vars.$pph_use_showXhideP$.getDynamicValue(thread)) {
            final SubLObject object_id = cconcatenate($str139$meta_supports_, index_string);
            html_markup(dhtml_macros.$dhtml_css_head$.getGlobalValue());
            html_markup(dhtml_macros.$dhtml_css_type$.getGlobalValue());
            html_char(CHAR_quotation, UNPROVIDED);
            html_markup($str38$text_css);
            html_char(CHAR_quotation, UNPROVIDED);
            html_markup(dhtml_macros.$dhtml_css_media$.getGlobalValue());
            html_char(CHAR_quotation, UNPROVIDED);
            html_markup($$$screen);
            html_char(CHAR_quotation, UNPROVIDED);
            html_char(CHAR_greater, UNPROVIDED);
            SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
            try {
                html_macros.$html_safe_print$.bind(T, thread);
                html_terpri(UNPROVIDED);
                dhtml_macros.dhtml_dom_wrapper_preamble(object_id);
                dhtml_macros.dhtml_dom_attribute_preamble(dhtml_macros.$dhtml_dom_display$.getGlobalValue());
                html_markup($$$none);
                dhtml_macros.dhtml_dom_attribute_postamble();
                dhtml_macros.dhtml_dom_wrapper_postamble();
                html_terpri(UNPROVIDED);
            } finally {
                html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
            }
            html_markup(dhtml_macros.$dhtml_css_tail$.getGlobalValue());
            html_terpri(UNPROVIDED);
            dhtml_macros.dhtml_switch_visibility_links_arrows(object_id, label);
            dhtml_macros.dhtml_set_switched_visibility(object_id, $INVISIBLE, $TEXT);
            html_markup(html_macros.$html_div_head$.getGlobalValue());
            if (NIL != object_id) {
                html_markup(html_macros.$html_attribute_id$.getGlobalValue());
                html_char(CHAR_quotation, UNPROVIDED);
                html_markup(object_id);
                html_char(CHAR_quotation, UNPROVIDED);
            }
            html_char(CHAR_greater, UNPROVIDED);
            _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
            try {
                html_macros.$html_safe_print$.bind(T, thread);
                html_markup(html_macros.$html_unordered_list_head$.getGlobalValue());
                html_char(CHAR_greater, UNPROVIDED);
                final SubLObject _prev_bind_0_$123 = html_macros.$html_safe_print$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind(T, thread);
                    SubLObject list_var = NIL;
                    SubLObject support = NIL;
                    SubLObject support_num = NIL;
                    list_var = meta_supports;
                    support = list_var.first();
                    for (support_num = ZERO_INTEGER; NIL != list_var; list_var = list_var.rest() , support = list_var.first() , support_num = add(ONE_INTEGER, support_num)) {
                        html_markup(html_macros.$html_list_item_head$.getGlobalValue());
                        html_char(CHAR_greater, UNPROVIDED);
                        final SubLObject _prev_bind_0_$124 = html_macros.$html_safe_print$.currentBinding(thread);
                        try {
                            html_macros.$html_safe_print$.bind(T, thread);
                            final SubLObject support_index_string = format(NIL, $str140$_A_meta__D, index_string, support_num);
                            pph_show_support(support, support_index_string, UNPROVIDED);
                        } finally {
                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$124, thread);
                        }
                        html_markup(html_macros.$html_list_item_tail$.getGlobalValue());
                    }
                } finally {
                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$123, thread);
                }
                html_markup(html_macros.$html_unordered_list_tail$.getGlobalValue());
            } finally {
                html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
            }
            html_markup(html_macros.$html_div_tail$.getGlobalValue());
            html_source_readability_terpri(UNPROVIDED);
        } else {
            html_markup(html_macros.$html_table_head$.getGlobalValue());
            html_markup(html_macros.$html_attribute_class$.getGlobalValue());
            html_char(CHAR_quotation, UNPROVIDED);
            html_markup($str129$pf_indent);
            html_char(CHAR_quotation, UNPROVIDED);
            html_markup(html_macros.$html_table_border$.getGlobalValue());
            html_char(CHAR_quotation, UNPROVIDED);
            html_markup(ZERO_INTEGER);
            html_char(CHAR_quotation, UNPROVIDED);
            html_char(CHAR_greater, UNPROVIDED);
            final SubLObject _prev_bind_2 = html_macros.$html_safe_print$.currentBinding(thread);
            try {
                html_macros.$html_safe_print$.bind(T, thread);
                html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                html_char(CHAR_greater, UNPROVIDED);
                final SubLObject _prev_bind_0_$125 = html_macros.$html_safe_print$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind(T, thread);
                    html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                    html_markup(html_macros.$html_attribute_class$.getGlobalValue());
                    html_char(CHAR_quotation, UNPROVIDED);
                    html_markup($str130$pf_indent_td);
                    html_char(CHAR_quotation, UNPROVIDED);
                    html_char(CHAR_greater, UNPROVIDED);
                    final SubLObject _prev_bind_0_$126 = html_macros.$html_safe_print$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind(T, thread);
                    } finally {
                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$126, thread);
                    }
                    html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                    html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                    html_char(CHAR_greater, UNPROVIDED);
                    final SubLObject _prev_bind_0_$127 = html_macros.$html_safe_print$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind(T, thread);
                        pph_show_supports_wXo_indent(label, meta_supports);
                    } finally {
                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$127, thread);
                    }
                    html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                } finally {
                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$125, thread);
                }
                html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                html_source_readability_terpri(UNPROVIDED);
            } finally {
                html_macros.$html_safe_print$.rebind(_prev_bind_2, thread);
            }
            html_markup(html_macros.$html_table_tail$.getGlobalValue());
        }
        return NIL;
    }

    public static SubLObject pph_show_supports_wXo_indent(final SubLObject label, final SubLObject supports) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        html_princ_strong(label);
        html_markup(html_macros.$html_unordered_list_head$.getGlobalValue());
        html_char(CHAR_greater, UNPROVIDED);
        final SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
        try {
            html_macros.$html_safe_print$.bind(T, thread);
            SubLObject list_var = NIL;
            SubLObject support = NIL;
            SubLObject support_num = NIL;
            list_var = supports;
            support = list_var.first();
            for (support_num = ZERO_INTEGER; NIL != list_var; list_var = list_var.rest() , support = list_var.first() , support_num = add(ONE_INTEGER, support_num)) {
                html_markup(html_macros.$html_list_item_head$.getGlobalValue());
                html_char(CHAR_greater, UNPROVIDED);
                final SubLObject _prev_bind_0_$128 = html_macros.$html_safe_print$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind(T, thread);
                    pph_show_support(support, UNPROVIDED, UNPROVIDED);
                } finally {
                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$128, thread);
                }
                html_markup(html_macros.$html_list_item_tail$.getGlobalValue());
            }
        } finally {
            html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
        }
        html_markup(html_macros.$html_unordered_list_tail$.getGlobalValue());
        return supports;
    }

    public static SubLObject pph_maybe_show_assert_info(final SubLObject assertion, final SubLObject index_string) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != pph_vars.$pph_show_assert_info_with_assertionsP$.getDynamicValue(thread)) {
            if (NIL != pph_assertion_has_assert_infoP(assertion)) {
                if (NIL != pph_vars.$pph_use_showXhideP$.getDynamicValue(thread)) {
                    final SubLObject object_id = cconcatenate($str141$assert_info_, index_string);
                    html_markup(dhtml_macros.$dhtml_css_head$.getGlobalValue());
                    html_markup(dhtml_macros.$dhtml_css_type$.getGlobalValue());
                    html_char(CHAR_quotation, UNPROVIDED);
                    html_markup($str38$text_css);
                    html_char(CHAR_quotation, UNPROVIDED);
                    html_markup(dhtml_macros.$dhtml_css_media$.getGlobalValue());
                    html_char(CHAR_quotation, UNPROVIDED);
                    html_markup($$$screen);
                    html_char(CHAR_quotation, UNPROVIDED);
                    html_char(CHAR_greater, UNPROVIDED);
                    SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind(T, thread);
                        html_terpri(UNPROVIDED);
                        dhtml_macros.dhtml_dom_wrapper_preamble(object_id);
                        dhtml_macros.dhtml_dom_attribute_preamble(dhtml_macros.$dhtml_dom_display$.getGlobalValue());
                        html_markup($$$none);
                        dhtml_macros.dhtml_dom_attribute_postamble();
                        dhtml_macros.dhtml_dom_wrapper_postamble();
                        html_terpri(UNPROVIDED);
                    } finally {
                        html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
                    }
                    html_markup(dhtml_macros.$dhtml_css_tail$.getGlobalValue());
                    html_terpri(UNPROVIDED);
                    html_indent(TWO_INTEGER);
                    dhtml_macros.dhtml_switch_visibility_links_arrows(object_id, $str41$);
                    dhtml_macros.dhtml_set_switched_visibility(object_id, $INVISIBLE, $TEXT);
                    html_markup(html_macros.$html_div_head$.getGlobalValue());
                    if (NIL != object_id) {
                        html_markup(html_macros.$html_attribute_id$.getGlobalValue());
                        html_char(CHAR_quotation, UNPROVIDED);
                        html_markup(object_id);
                        html_char(CHAR_quotation, UNPROVIDED);
                    }
                    html_char(CHAR_greater, UNPROVIDED);
                    _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind(T, thread);
                        html_markup(html_macros.$html_unordered_list_head$.getGlobalValue());
                        html_char(CHAR_greater, UNPROVIDED);
                        final SubLObject _prev_bind_0_$129 = html_macros.$html_safe_print$.currentBinding(thread);
                        try {
                            html_macros.$html_safe_print$.bind(T, thread);
                            html_markup(html_macros.$html_list_item_head$.getGlobalValue());
                            html_char(CHAR_greater, UNPROVIDED);
                            final SubLObject _prev_bind_0_$130 = html_macros.$html_safe_print$.currentBinding(thread);
                            try {
                                html_macros.$html_safe_print$.bind(T, thread);
                                pph_show_assert_info(assertion);
                            } finally {
                                html_macros.$html_safe_print$.rebind(_prev_bind_0_$130, thread);
                            }
                            html_markup(html_macros.$html_list_item_tail$.getGlobalValue());
                        } finally {
                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$129, thread);
                        }
                        html_markup(html_macros.$html_unordered_list_tail$.getGlobalValue());
                    } finally {
                        html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
                    }
                    html_markup(html_macros.$html_div_tail$.getGlobalValue());
                    html_source_readability_terpri(UNPROVIDED);
                } else
                    if (NIL != hypothetical_mtP(assertions_high.assertion_mt(assertion))) {
                        pph_proof_show_hypothetical_attribution(string_utilities.$empty_string$.getGlobalValue());
                    } else {
                        html_newline(UNPROVIDED);
                        html_indent(TWO_INTEGER);
                        html_princ($str142$__);
                        pph_show_assert_info(assertion);
                    }

            }
        }
        return NIL;
    }

    public static SubLObject pph_assertion_has_assert_infoP(final SubLObject assertion) {
        return makeBoolean(((NIL != sources.assertion_sourcedP(assertion)) || (NIL != abnormal.rule_has_exceptionsP(assertion))) || (NIL != isa.isaP(assertions_high.assertion_mt(assertion), $$HypotheticalContext, UNPROVIDED, UNPROVIDED)));
    }

    public static SubLObject pph_show_assert_info(final SubLObject assertion) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        thread.resetMultipleValues();
        final SubLObject mt = pph_assert_info(assertion);
        final SubLObject v_sources = thread.secondMultipleValue();
        thread.resetMultipleValues();
        html_markup(html_macros.$html_italic_head$.getGlobalValue());
        if (NIL != v_sources) {
            SubLObject cdolist_list_var = v_sources;
            SubLObject source = NIL;
            source = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                pph_show_source(source, UNPROVIDED);
                cdolist_list_var = cdolist_list_var.rest();
                source = cdolist_list_var.first();
            } 
        } else
            if (NIL != isa.isaP(mt, $$HypotheticalContext, UNPROVIDED, UNPROVIDED)) {
                html_princ($str144$This_was_stated_in_the_question_);
            }

        if (NIL != abnormal.rule_has_exceptionsP(assertion)) {
            html_newline(UNPROVIDED);
            html_indent(TWO_INTEGER);
            html_princ($str145$Note__This_rule_has_exceptions__b);
        }
        if ((NIL != assertions_high.rule_assertionP(assertion)) && (NIL != inference_worker_transformation.rule_assertion_has_some_pragmatic_requirementP(assertion, $$InferencePSC))) {
            html_newline(UNPROVIDED);
            html_indent(TWO_INTEGER);
            html_princ($str147$Note__This_rule_has_further_condi);
        }
        html_markup(html_macros.$html_italic_tail$.getGlobalValue());
        return NIL;
    }

    public static SubLObject pph_skip_meta_supports_for_support_p(final SubLObject support) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return makeBoolean(((NIL != subl_promotions.memberP(arguments.support_module(support), $pph_hl_modules_to_skip_meta_supports_for$.getDynamicValue(thread), UNPROVIDED, UNPROVIDED)) || (NIL != pph_proof_support_already_shown_p(support))) || ((arguments.support_module(support).eql($EVAL) && (NIL != narts_high.naut_p(cycl_utilities.atomic_sentence_arg2(arguments.support_sentence(support), UNPROVIDED)))) && (NIL == find_if(NAUT_P, cycl_utilities.formula_args(cycl_utilities.atomic_sentence_arg2(arguments.support_sentence(support), UNPROVIDED), UNPROVIDED), UNPROVIDED, UNPROVIDED, UNPROVIDED))));
    }

    public static SubLObject pph_displayed_supports() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return pph_vars.$pph_displayed_supports$.getDynamicValue(thread).isList() ? pph_vars.$pph_displayed_supports$.getDynamicValue(thread) : NIL;
    }

    public static SubLObject pph_proof_support_already_shown_p(final SubLObject support) {
        return subl_promotions.memberP(support, pph_displayed_supports(), symbol_function(EQUAL), UNPROVIDED);
    }

    public static SubLObject pph_meta_supports_to_show(final SubLObject support, SubLObject v_proof_view, SubLObject domain_mt) {
        if (v_proof_view == UNPROVIDED) {
            v_proof_view = NIL;
        }
        if (domain_mt == UNPROVIDED) {
            domain_mt = pph_irrelevance_check_mt();
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != pph_skip_meta_supports_for_support_p(support)) {
            if (NIL != proof_view.$proof_view_debugP$.getDynamicValue(thread)) {
                Errors.warn($str150$Skipping_meta_supports_for__S, support);
            }
            return NIL;
        }
        final SubLObject all_meta_supports = pph_meta_supports(support);
        final SubLObject support_sentence = pph_support_sentence(support, UNPROVIDED);
        final SubLObject support_module = arguments.support_module(support);
        final SubLObject irrelevance_mt = pph_irrelevance_check_mt();
        SubLObject literals_to_suppress = NIL;
        SubLObject ans = NIL;
        SubLObject cdolist_list_var = all_meta_supports;
        SubLObject meta_support = NIL;
        meta_support = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if (NIL != assertions_high.rule_assertionP(meta_support)) {
                if (NIL != proof_view_pruning_ruleP(meta_support, domain_mt)) {
                    if (NIL != proof_view.$proof_view_debugP$.getDynamicValue(thread)) {
                        Errors.warn($str151$Pruning_all_supports_for__S___due, support, meta_support);
                    }
                    return NIL;
                }
                if (NIL != proof_view.$proof_view_debugP$.getDynamicValue(thread)) {
                    format_nil.force_format(T, $str152$__Checking_for_literals_to_suppre, meta_support, irrelevance_mt, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                }
                literals_to_suppress = pph_literals_to_suppress_from_rule_and_conclusion(meta_support, support, irrelevance_mt);
                if (NIL != proof_view.$proof_view_debugP$.getDynamicValue(thread)) {
                    format_nil.force_format(T, $str153$__Literals_to_suppress_____S__, literals_to_suppress, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                }
            }
            if (NIL != pph_always_show_meta_support_for_moduleP(meta_support, support_module)) {
                ans = cons(meta_support, ans);
            } else
                if (!pph_support_sentence(meta_support, UNPROVIDED).equal(support_sentence)) {
                    if (NIL != pph_irrelevant_supportP(meta_support, NIL, irrelevance_mt)) {
                        if (NIL != v_proof_view) {
                            proof_view.proof_view_note_filtered_item(v_proof_view, meta_support, $IRRELEVANT);
                        }
                    } else {
                        ans = cons(meta_support, ans);
                    }
                }

            cdolist_list_var = cdolist_list_var.rest();
            meta_support = cdolist_list_var.first();
        } 
        if ((NIL != literals_to_suppress) && (NIL != ans)) {
            ans = pph_prune_meta_supports(ans, literals_to_suppress);
        }
        return pph_sort_meta_supports(delete_duplicates(nreverse(ans), symbol_function(EQUAL), symbol_function(PPH_SUPPORT_EL_SENTENCE), UNPROVIDED, UNPROVIDED));
    }

    public static SubLObject pph_sort_meta_supports(final SubLObject meta_supports) {
        return Sort.sort(meta_supports, $sym155$PPH_META_SUPPORT_SHOULD_PRECEDE_, UNPROVIDED);
    }

    public static SubLObject pph_meta_support_should_precedeP(final SubLObject support1, final SubLObject support2) {
        if ((NIL != assertions_high.rule_assertionP(support1)) && (NIL == assertions_high.rule_assertionP(support2))) {
            return T;
        }
        if ((NIL != assertions_high.rule_assertionP(support2)) && (NIL == assertions_high.rule_assertionP(support1))) {
            return NIL;
        }
        return kb_utilities.term_L(support1, support2, UNPROVIDED, UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject pph_rule_literals_to_suppress(final SubLObject rule, SubLObject domain_mt) {
        if (domain_mt == UNPROVIDED) {
            domain_mt = pph_utilities.pph_canonicalize_hlmt(list($$MtUnionFn, pph_irrelevance_check_mt(), pph_triviality_check_mt()));
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate(domain_mt);
        final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
        try {
            mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
            mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
            mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
            return copy_tree(kb_mapping_utilities.pred_values(rule, $const156$suppressLiteralForJustificationPa, TWO_INTEGER, ONE_INTEGER, UNPROVIDED));
        } finally {
            mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_3, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
        }
    }

    public static SubLObject pph_literals_to_suppress_from_rule_and_conclusion(final SubLObject rule, final SubLObject conclusion, SubLObject domain_mt) {
        if (domain_mt == UNPROVIDED) {
            domain_mt = pph_utilities.pph_canonicalize_hlmt(list($$MtUnionFn, pph_irrelevance_check_mt(), pph_triviality_check_mt()));
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject rule_literals_to_suppress = pph_rule_literals_to_suppress(rule, domain_mt);
        if (NIL != list_utilities.non_empty_list_p(rule_literals_to_suppress)) {
            SubLObject store = NIL;
            try {
                store = inference_datastructures_problem_store.new_problem_store(NIL);
                final SubLObject inference = nth_value_step_2(nth_value_step_1(TWO_INTEGER), inference_kernel.new_cyc_query(arguments.support_sentence(conclusion), $$InferencePSC, list(new SubLObject[]{ $INFERENCE_MODE, $SHALLOW, $ALLOWED_RULES, list(rule), $RESULT_UNIQUENESS, $PROOF, $kw162$ADD_RESTRICTION_LAYER_OF_INDIRECTION_, NIL, $kw163$COMPUTE_ANSWER_JUSTIFICATIONS_, T, $MAX_TRANSFORMATION_DEPTH, ONE_INTEGER, $ANSWER_LANGUAGE, $HL, $PROBLEM_STORE, store, $BROWSABLE_, T })));
                final SubLObject idx = inference_datastructures_inference.inference_answer_id_index(inference);
                if (NIL == id_index_objects_empty_p(idx, $SKIP)) {
                    final SubLObject idx_$131 = idx;
                    if (NIL == id_index_dense_objects_empty_p(idx_$131, $SKIP)) {
                        final SubLObject vector_var = id_index_dense_objects(idx_$131);
                        final SubLObject backwardP_var = NIL;
                        SubLObject length;
                        SubLObject v_iteration;
                        SubLObject id;
                        SubLObject v_answer;
                        SubLObject cdolist_list_var;
                        SubLObject justification;
                        SubLObject cdolist_list_var_$132;
                        SubLObject proof;
                        for (length = length(vector_var), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL(length); v_iteration = add(v_iteration, ONE_INTEGER)) {
                            id = (NIL != backwardP_var) ? subtract(length, v_iteration, ONE_INTEGER) : v_iteration;
                            v_answer = aref(vector_var, id);
                            if ((NIL == id_index_tombstone_p(v_answer)) || (NIL == id_index_skip_tombstones_p($SKIP))) {
                                if (NIL != id_index_tombstone_p(v_answer)) {
                                    v_answer = $SKIP;
                                }
                                cdolist_list_var = inference_datastructures_inference.inference_answer_justifications(v_answer);
                                justification = NIL;
                                justification = cdolist_list_var.first();
                                while (NIL != cdolist_list_var) {
                                    cdolist_list_var_$132 = inference_datastructures_inference.inference_answer_justification_proofs(justification);
                                    proof = NIL;
                                    proof = cdolist_list_var_$132.first();
                                    while (NIL != cdolist_list_var_$132) {
                                        if (NIL != inference_worker_transformation.transformation_proof_p(proof)) {
                                            return bindings.apply_bindings(inference_worker_transformation.transformation_proof_rule_el_bindings(proof), rule_literals_to_suppress);
                                        }
                                        cdolist_list_var_$132 = cdolist_list_var_$132.rest();
                                        proof = cdolist_list_var_$132.first();
                                    } 
                                    cdolist_list_var = cdolist_list_var.rest();
                                    justification = cdolist_list_var.first();
                                } 
                            }
                        }
                    }
                    final SubLObject idx_$132 = idx;
                    if (NIL == id_index_sparse_objects_empty_p(idx_$132)) {
                        final SubLObject cdohash_table = id_index_sparse_objects(idx_$132);
                        SubLObject id2 = NIL;
                        SubLObject v_answer2 = NIL;
                        final Iterator cdohash_iterator = getEntrySetIterator(cdohash_table);
                        try {
                            while (iteratorHasNext(cdohash_iterator)) {
                                final Map.Entry cdohash_entry = iteratorNextEntry(cdohash_iterator);
                                id2 = getEntryKey(cdohash_entry);
                                v_answer2 = getEntryValue(cdohash_entry);
                                SubLObject cdolist_list_var2 = inference_datastructures_inference.inference_answer_justifications(v_answer2);
                                SubLObject justification2 = NIL;
                                justification2 = cdolist_list_var2.first();
                                while (NIL != cdolist_list_var2) {
                                    SubLObject cdolist_list_var_$133 = inference_datastructures_inference.inference_answer_justification_proofs(justification2);
                                    SubLObject proof2 = NIL;
                                    proof2 = cdolist_list_var_$133.first();
                                    while (NIL != cdolist_list_var_$133) {
                                        if (NIL != inference_worker_transformation.transformation_proof_p(proof2)) {
                                            return bindings.apply_bindings(inference_worker_transformation.transformation_proof_rule_el_bindings(proof2), rule_literals_to_suppress);
                                        }
                                        cdolist_list_var_$133 = cdolist_list_var_$133.rest();
                                        proof2 = cdolist_list_var_$133.first();
                                    } 
                                    cdolist_list_var2 = cdolist_list_var2.rest();
                                    justification2 = cdolist_list_var2.first();
                                } 
                            } 
                        } finally {
                            releaseEntrySetIterator(cdohash_iterator);
                        }
                    }
                }
            } finally {
                final SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    inference_datastructures_problem_store.destroy_problem_store(store);
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
            if (NIL != assertion_handles.assertion_p(conclusion)) {
                return pph_literals_to_suppress_from_deductions(rule, conclusion, rule_literals_to_suppress);
            }
            if (NIL != proof_view.$proof_view_debugP$.getDynamicValue(thread)) {
                Errors.warn($str170$Couldn_t_bind_variables_in_litera, rule, conclusion);
            }
        }
        return rule_literals_to_suppress;
    }

    public static SubLObject pph_literals_to_suppress_from_deductions(final SubLObject rule, final SubLObject conclusion, final SubLObject rule_literals_to_suppress) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject antecedent = cycl_utilities.formula_arg1(uncanonicalizer.assertion_el_formula(rule), UNPROVIDED);
        final SubLObject _prev_bind_0 = $var_binding_candidates$.currentBinding(thread);
        try {
            $var_binding_candidates$.bind(dictionary.new_dictionary(symbol_function(EQL), UNPROVIDED), thread);
            SubLObject cdolist_list_var = assertions_high.assertion_arguments(conclusion);
            SubLObject argument = NIL;
            argument = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                if (NIL != deduction_handles.deduction_p(argument)) {
                    SubLObject cdolist_list_var_$135 = (NIL != el_conjunction_p(antecedent)) ? cycl_utilities.formula_args(antecedent, UNPROVIDED) : list(antecedent);
                    SubLObject lit = NIL;
                    lit = cdolist_list_var_$135.first();
                    while (NIL != cdolist_list_var_$135) {
                        SubLObject lit_candidates = NIL;
                        final SubLObject pattern = cycl_utilities.expression_transform(lit, EL_VARIABLE_P, SUBSTITUTE_PPH_VAR_BINDING, UNPROVIDED, UNPROVIDED);
                        SubLObject cdolist_list_var_$136 = deductions_high.deduction_supports(argument);
                        SubLObject support = NIL;
                        support = cdolist_list_var_$136.first();
                        while (NIL != cdolist_list_var_$136) {
                            final SubLObject support_sentence = arguments.support_sentence(support);
                            if (NIL != formula_pattern_match.formula_matches_pattern(support_sentence, pattern)) {
                                lit_candidates = cons(support_sentence, lit_candidates);
                            }
                            cdolist_list_var_$136 = cdolist_list_var_$136.rest();
                            support = cdolist_list_var_$136.first();
                        } 
                        if (NIL != lit_candidates) {
                            if (NIL != proof_view.$proof_view_debugP$.getDynamicValue(thread)) {
                                format_nil.force_format(T, $str173$__Lit_candidates_for__S_____S, lit, lit_candidates, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                            }
                            SubLObject cdolist_list_var_$137 = cycl_utilities.expression_gather(lit, CYCL_VARIABLE_P, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                            SubLObject var = NIL;
                            var = cdolist_list_var_$137.first();
                            while (NIL != cdolist_list_var_$137) {
                                final SubLObject old_var_candidates = dictionary.dictionary_lookup_without_values($var_binding_candidates$.getDynamicValue(thread), var, misc_utilities.uninitialized());
                                SubLObject new_var_candidates = NIL;
                                SubLObject cdolist_list_var_$138 = lit_candidates;
                                SubLObject lit_candidate = NIL;
                                lit_candidate = cdolist_list_var_$138.first();
                                while (NIL != cdolist_list_var_$138) {
                                    final SubLObject position = cycl_utilities.arg_positions_dfs(var, lit, UNPROVIDED).first();
                                    final SubLObject var_$139;
                                    final SubLObject candidate = var_$139 = cycl_utilities.formula_arg_position(lit_candidate, position, UNPROVIDED);
                                    if (NIL != var_$139) {
                                        new_var_candidates = cons(var_$139, new_var_candidates);
                                    }
                                    cdolist_list_var_$138 = cdolist_list_var_$138.rest();
                                    lit_candidate = cdolist_list_var_$138.first();
                                } 
                                if (NIL != proof_view.$proof_view_debugP$.getDynamicValue(thread)) {
                                    format_nil.force_format(T, $str174$__New_candidates_for__S___S__, var, new_var_candidates, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                }
                                if (NIL != list_utilities.singletonP(lit_candidates)) {
                                    dictionary.dictionary_enter($var_binding_candidates$.getDynamicValue(thread), var, new_var_candidates);
                                } else
                                    if (NIL != misc_utilities.initialized_p(old_var_candidates)) {
                                        dictionary.dictionary_enter($var_binding_candidates$.getDynamicValue(thread), var, intersection(old_var_candidates, new_var_candidates, symbol_function(EQUAL), UNPROVIDED));
                                    } else {
                                        dictionary.dictionary_enter($var_binding_candidates$.getDynamicValue(thread), var, new_var_candidates);
                                    }

                                cdolist_list_var_$137 = cdolist_list_var_$137.rest();
                                var = cdolist_list_var_$137.first();
                            } 
                        }
                        cdolist_list_var_$135 = cdolist_list_var_$135.rest();
                        lit = cdolist_list_var_$135.first();
                    } 
                }
                cdolist_list_var = cdolist_list_var.rest();
                argument = cdolist_list_var.first();
            } 
            SubLObject ans = NIL;
            SubLObject cdolist_list_var2 = rule_literals_to_suppress;
            SubLObject lit2 = NIL;
            lit2 = cdolist_list_var2.first();
            while (NIL != cdolist_list_var2) {
                SubLObject bound_version = copy_expression(lit2);
                SubLObject cdolist_list_var_$139 = cycl_utilities.expression_gather(lit2, CYCL_VARIABLE_P, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                SubLObject var2 = NIL;
                var2 = cdolist_list_var_$139.first();
                while (NIL != cdolist_list_var_$139) {
                    final SubLObject var_binding_candidates = dictionary.dictionary_lookup_without_values($var_binding_candidates$.getDynamicValue(thread), var2, UNPROVIDED);
                    if (NIL != list_utilities.singletonP(var_binding_candidates)) {
                        bound_version = cycl_utilities.expression_subst(list_utilities.only_one(var_binding_candidates), var2, bound_version, UNPROVIDED, UNPROVIDED);
                    } else
                        if (NIL != proof_view.$proof_view_debugP$.getDynamicValue(thread)) {
                            Errors.warn($str176$Candidates_for__S___S, var2, var_binding_candidates);
                        }

                    cdolist_list_var_$139 = cdolist_list_var_$139.rest();
                    var2 = cdolist_list_var_$139.first();
                } 
                if ((NIL == variables.fully_bound_p(bound_version)) && (NIL != proof_view.$proof_view_debugP$.getDynamicValue(thread))) {
                    Errors.warn($str177$Couldn_t_fully_bind_variables_in_, lit2);
                }
                ans = cons(bound_version, ans);
                cdolist_list_var2 = cdolist_list_var2.rest();
                lit2 = cdolist_list_var2.first();
            } 
            return nreverse(ans);
        } finally {
            $var_binding_candidates$.rebind(_prev_bind_0, thread);
        }
    }

    public static SubLObject substitute_pph_var_binding(final SubLObject obj) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject candidates = dictionary.dictionary_lookup_without_values($var_binding_candidates$.getDynamicValue(thread), obj, misc_utilities.uninitialized());
        return NIL != misc_utilities.initialized_p(candidates) ? cons($OR, candidates) : $ANYTHING;
    }

    public static SubLObject pph_prune_meta_supports(final SubLObject input_supports, final SubLObject literals_to_suppress) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != proof_view.$proof_view_debugP$.getDynamicValue(thread)) {
            format_nil.force_format(T, $str180$__Pruning_meta_supports____Input_, input_supports, literals_to_suppress, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        }
        SubLObject pruned = NIL;
        final SubLObject _prev_bind_0 = proof_view.$proof_view_literals_to_suppress$.currentBinding(thread);
        try {
            proof_view.$proof_view_literals_to_suppress$.bind(NIL != misc_utilities.initialized_p(proof_view.$proof_view_literals_to_suppress$.getDynamicValue(thread)) ? proof_view.$proof_view_literals_to_suppress$.getDynamicValue(thread) : NIL, thread);
            if (literals_to_suppress.isVector()) {
                final SubLObject backwardP_var = NIL;
                SubLObject length;
                SubLObject v_iteration;
                SubLObject element_num;
                SubLObject item;
                for (length = length(literals_to_suppress), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL(length); v_iteration = add(v_iteration, ONE_INTEGER)) {
                    element_num = (NIL != backwardP_var) ? subtract(length, v_iteration, ONE_INTEGER) : v_iteration;
                    item = aref(literals_to_suppress, element_num);
                    proof_view.$proof_view_literals_to_suppress$.setDynamicValue(cons(item, proof_view.$proof_view_literals_to_suppress$.getDynamicValue(thread)), thread);
                }
            } else {
                SubLObject cdolist_list_var = literals_to_suppress;
                SubLObject item2 = NIL;
                item2 = cdolist_list_var.first();
                while (NIL != cdolist_list_var) {
                    proof_view.$proof_view_literals_to_suppress$.setDynamicValue(cons(item2, proof_view.$proof_view_literals_to_suppress$.getDynamicValue(thread)), thread);
                    cdolist_list_var = cdolist_list_var.rest();
                    item2 = cdolist_list_var.first();
                } 
            }
            SubLObject cdolist_list_var = input_supports;
            SubLObject support = NIL;
            support = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                if ((NIL == member(support, pruned, UNPROVIDED, UNPROVIDED)) && (NIL != proof_view.suppress_proof_supportP(support))) {
                    if (NIL != proof_view.$proof_view_debugP$.getDynamicValue(thread)) {
                        Errors.warn($str181$Pruning__S, support);
                    }
                    pruned = cons(support, pruned);
                }
                cdolist_list_var = cdolist_list_var.rest();
                support = cdolist_list_var.first();
            } 
        } finally {
            proof_view.$proof_view_literals_to_suppress$.rebind(_prev_bind_0, thread);
        }
        return set_difference(input_supports, pruned, UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject pph_show_all_meta_supports_for_module_p(final SubLObject module) {
        return subl_promotions.memberP(module, $pph_support_modules_for_which_to_show_all_meta_supports$.getGlobalValue(), UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject pph_always_show_meta_support_for_moduleP_internal(final SubLObject meta_support, final SubLObject module) {
        if (NIL != pph_show_all_meta_supports_for_module_p(module)) {
            return T;
        }
        if (module.eql($RTV) && (!arguments.support_module(meta_support).eql($GENLPREDS))) {
            return T;
        }
        return NIL;
    }

    public static SubLObject pph_always_show_meta_support_for_moduleP(final SubLObject meta_support, final SubLObject module) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
        SubLObject caching_state = NIL;
        if (NIL == v_memoization_state) {
            return pph_always_show_meta_support_for_moduleP_internal(meta_support, module);
        }
        caching_state = memoization_state.memoization_state_lookup(v_memoization_state, $sym182$PPH_ALWAYS_SHOW_META_SUPPORT_FOR_MODULE_, UNPROVIDED);
        if (NIL == caching_state) {
            caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), $sym182$PPH_ALWAYS_SHOW_META_SUPPORT_FOR_MODULE_, TWO_INTEGER, NIL, EQUAL, UNPROVIDED);
            memoization_state.memoization_state_put(v_memoization_state, $sym182$PPH_ALWAYS_SHOW_META_SUPPORT_FOR_MODULE_, caching_state);
        }
        final SubLObject sxhash = memoization_state.sxhash_calc_2(meta_support, module);
        final SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, UNPROVIDED);
        if (!collisions.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            SubLObject cdolist_list_var = collisions;
            SubLObject collision = NIL;
            collision = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                SubLObject cached_args = collision.first();
                final SubLObject results2 = second(collision);
                if (meta_support.equal(cached_args.first())) {
                    cached_args = cached_args.rest();
                    if (((NIL != cached_args) && (NIL == cached_args.rest())) && module.equal(cached_args.first())) {
                        return memoization_state.caching_results(results2);
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                collision = cdolist_list_var.first();
            } 
        }
        final SubLObject results3 = arg2(thread.resetMultipleValues(), multiple_value_list(pph_always_show_meta_support_for_moduleP_internal(meta_support, module)));
        memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results3, list(meta_support, module));
        return memoization_state.caching_results(results3);
    }

    public static SubLObject pph_show_argument(SubLObject argument, final SubLObject index_string) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        argument = pph_sub_isomorphic_assertions_into_supports(argument);
        final SubLObject invalid_supports = list_utilities.remove_if_not($sym185$PPH_INVALID_SUPPORT_, argument, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        if (NIL != invalid_supports) {
            html_markup(html_macros.$html_font_head$.getGlobalValue());
            html_markup(html_macros.$html_font_size$.getGlobalValue());
            html_char(CHAR_quotation, UNPROVIDED);
            html_markup($str186$_2);
            html_char(CHAR_quotation, UNPROVIDED);
            if (NIL != html_macros.$html_color_cyc_logo_violet$.getGlobalValue()) {
                html_markup(html_macros.$html_font_color$.getGlobalValue());
                html_char(CHAR_quotation, UNPROVIDED);
                html_markup(html_color(html_macros.$html_color_cyc_logo_violet$.getGlobalValue()));
                html_char(CHAR_quotation, UNPROVIDED);
            }
            html_char(CHAR_greater, UNPROVIDED);
            final SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
            try {
                html_macros.$html_safe_print$.bind(T, thread);
                html_markup(html_macros.$html_center_head$.getGlobalValue());
                html_princ_strong($$$Invalid);
                html_markup(html_macros.$html_center_tail$.getGlobalValue());
            } finally {
                html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
            }
            html_markup(html_macros.$html_font_tail$.getGlobalValue());
        }
        if (NIL != list_utilities.singletonP(argument)) {
            pph_show_support(argument.first(), index_string, invalid_supports);
        } else {
            SubLObject additional_supports = list_utilities.remove_if_not($sym16$PPH_IRRELEVANT_SUPPORT_, argument, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            if (NIL != list_utilities.same_length_p(argument, additional_supports)) {
                additional_supports = NIL;
            }
            additional_supports = set_difference(additional_supports, invalid_supports, UNPROVIDED, UNPROVIDED);
            html_markup(html_macros.$html_unordered_list_head$.getGlobalValue());
            html_char(CHAR_greater, UNPROVIDED);
            final SubLObject _prev_bind_2 = html_macros.$html_safe_print$.currentBinding(thread);
            try {
                html_macros.$html_safe_print$.bind(T, thread);
                SubLObject list_var = NIL;
                SubLObject support = NIL;
                SubLObject support_num = NIL;
                list_var = argument;
                support = list_var.first();
                for (support_num = ZERO_INTEGER; NIL != list_var; list_var = list_var.rest() , support = list_var.first() , support_num = add(ONE_INTEGER, support_num)) {
                    if (NIL == subl_promotions.memberP(support, additional_supports, UNPROVIDED, UNPROVIDED)) {
                        html_markup(html_macros.$html_list_item_head$.getGlobalValue());
                        html_char(CHAR_greater, UNPROVIDED);
                        final SubLObject _prev_bind_0_$141 = html_macros.$html_safe_print$.currentBinding(thread);
                        try {
                            html_macros.$html_safe_print$.bind(T, thread);
                            final SubLObject support_index_string = format(NIL, $str188$_A__D, index_string, support_num);
                            pph_show_support(support, support_index_string, invalid_supports);
                        } finally {
                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$141, thread);
                        }
                        html_markup(html_macros.$html_list_item_tail$.getGlobalValue());
                    }
                }
            } finally {
                html_macros.$html_safe_print$.rebind(_prev_bind_2, thread);
            }
            html_markup(html_macros.$html_unordered_list_tail$.getGlobalValue());
            if (NIL != additional_supports) {
                pph_maybe_show_additional_supports(additional_supports, index_string);
            }
        }
        return NIL;
    }

    public static SubLObject pph_irrelevant_proof_conclusionP(final SubLObject proof_conclusion) {
        if (NIL != assertion_handles.assertion_p(proof_conclusion)) {
            return pph_irrelevant_supportP(proof_conclusion, UNPROVIDED, UNPROVIDED);
        }
        if (NIL != el_conjunction_p(proof_conclusion)) {
            return makeBoolean(NIL == list_utilities.find_if_not($sym21$PPH_IRRELEVANT_FORMULA_, cycl_utilities.formula_args(proof_conclusion, UNPROVIDED), UNPROVIDED, UNPROVIDED, UNPROVIDED));
        }
        if (NIL != el_formula_p(proof_conclusion)) {
            return pph_irrelevant_formulaP(proof_conclusion, UNPROVIDED, UNPROVIDED);
        }
        return NIL;
    }

    public static SubLObject pph_irrelevant_supportP_internal(final SubLObject support, SubLObject pph_relevance_safe_list, SubLObject domain_mt) {
        if (pph_relevance_safe_list == UNPROVIDED) {
            pph_relevance_safe_list = NIL;
        }
        if (domain_mt == UNPROVIDED) {
            domain_mt = pph_irrelevance_check_mt();
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != $pph_show_gory_proof_details$.getDynamicValue(thread)) {
            return NIL;
        }
        if ((NIL != assertions_high.invalid_assertionP(support, UNPROVIDED)) || (NIL != pph_proof_support_already_shown_p(support))) {
            return T;
        }
        if (NIL != pph_support_trivialP(support, pph_utilities.pph_canonicalize_hlmt(list($$MtUnionFn, domain_mt, pph_triviality_check_mt())))) {
            if (NIL != pph_vars.$pph_irrelevant_warnP$.getDynamicValue(thread)) {
                Errors.warn(cconcatenate(cconcatenate($str115$PPH_irrelevant_formula_, new SubLObject[]{ format_nil.$format_nil_percent$.getGlobalValue(), $$$_, format_nil.format_nil_s_no_copy(support), format_nil.$format_nil_percent$.getGlobalValue() }), $str189$___is_a_trivial_support_));
            }
            return T;
        }
        if (NIL != pph_required_ruleP(support)) {
            return NIL;
        }
        if ((NIL != assertion_handles.assertion_p(support)) && (NIL != pph_methods.pph_assertion_has_glossP(support))) {
            return NIL;
        }
        if ((NIL != pph_irrelevant_support_module_p(arguments.support_module(support))) || (NIL != pph_irrelevant_formulaP(pph_support_el_sentence(support), pph_relevance_safe_list, domain_mt))) {
            return T;
        }
        return NIL;
    }

    public static SubLObject pph_irrelevant_supportP(final SubLObject support, SubLObject pph_relevance_safe_list, SubLObject domain_mt) {
        if (pph_relevance_safe_list == UNPROVIDED) {
            pph_relevance_safe_list = NIL;
        }
        if (domain_mt == UNPROVIDED) {
            domain_mt = pph_irrelevance_check_mt();
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
        SubLObject caching_state = NIL;
        if (NIL == v_memoization_state) {
            return pph_irrelevant_supportP_internal(support, pph_relevance_safe_list, domain_mt);
        }
        caching_state = memoization_state.memoization_state_lookup(v_memoization_state, $sym16$PPH_IRRELEVANT_SUPPORT_, UNPROVIDED);
        if (NIL == caching_state) {
            caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), $sym16$PPH_IRRELEVANT_SUPPORT_, THREE_INTEGER, NIL, EQUAL, UNPROVIDED);
            memoization_state.memoization_state_put(v_memoization_state, $sym16$PPH_IRRELEVANT_SUPPORT_, caching_state);
        }
        final SubLObject sxhash = memoization_state.sxhash_calc_3(support, pph_relevance_safe_list, domain_mt);
        final SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, UNPROVIDED);
        if (!collisions.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            SubLObject cdolist_list_var = collisions;
            SubLObject collision = NIL;
            collision = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                SubLObject cached_args = collision.first();
                final SubLObject results2 = second(collision);
                if (support.equal(cached_args.first())) {
                    cached_args = cached_args.rest();
                    if (pph_relevance_safe_list.equal(cached_args.first())) {
                        cached_args = cached_args.rest();
                        if (((NIL != cached_args) && (NIL == cached_args.rest())) && domain_mt.equal(cached_args.first())) {
                            return memoization_state.caching_results(results2);
                        }
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                collision = cdolist_list_var.first();
            } 
        }
        final SubLObject results3 = arg2(thread.resetMultipleValues(), multiple_value_list(pph_irrelevant_supportP_internal(support, pph_relevance_safe_list, domain_mt)));
        memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results3, list(support, pph_relevance_safe_list, domain_mt));
        return memoization_state.caching_results(results3);
    }

    public static SubLObject pph_irrelevant_support_module_p(final SubLObject support_module) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return subl_promotions.memberP(support_module, $pph_irrelevant_support_modules$.getDynamicValue(thread), UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject pph_support_sentence(final SubLObject support, SubLObject replace_redundant_nartsP) {
        if (replace_redundant_nartsP == UNPROVIDED) {
            replace_redundant_nartsP = T;
        }
        final SubLObject sentence = arguments.support_sentence(support);
        return NIL != replace_redundant_nartsP ? pph_sentence_replace_redundant_narts(sentence) : sentence;
    }

    public static SubLObject pph_support_el_sentence_internal(final SubLObject support) {
        final SubLObject sentence = arguments.support_el_sentence(support);
        return pph_sentence_replace_redundant_narts(sentence);
    }

    public static SubLObject pph_support_el_sentence(final SubLObject support) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
        SubLObject caching_state = NIL;
        if (NIL == v_memoization_state) {
            return pph_support_el_sentence_internal(support);
        }
        caching_state = memoization_state.memoization_state_lookup(v_memoization_state, PPH_SUPPORT_EL_SENTENCE, UNPROVIDED);
        if (NIL == caching_state) {
            caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), PPH_SUPPORT_EL_SENTENCE, ONE_INTEGER, NIL, EQUAL, UNPROVIDED);
            memoization_state.memoization_state_put(v_memoization_state, PPH_SUPPORT_EL_SENTENCE, caching_state);
        }
        SubLObject results = memoization_state.caching_state_lookup(caching_state, support, memoization_state.$memoized_item_not_found$.getGlobalValue());
        if (results.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            results = arg2(thread.resetMultipleValues(), multiple_value_list(pph_support_el_sentence_internal(support)));
            memoization_state.caching_state_put(caching_state, support, results, UNPROVIDED);
        }
        return memoization_state.caching_results(results);
    }

    public static SubLObject pph_sentence_replace_redundant_narts(final SubLObject sentence) {
        return cycl_utilities.expression_transform(sentence, PPH_TRANSFORMABLE_REDUNDANT_NART_P, PPH_TRANSFORM_REDUNDANT_NART, UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject pph_transformable_redundant_nart_p(final SubLObject v_object) {
        return makeBoolean((NIL != nart_handles.nart_p(v_object)) && (NIL != pph_constant_for_nart(v_object)));
    }

    public static SubLObject pph_transform_redundant_nart(final SubLObject nart) {
        return pph_constant_for_nart(nart);
    }

    public static SubLObject pph_constant_for_nart_internal(final SubLObject nart) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject constant = NIL;
        final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
        try {
            mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_EVERYTHING, thread);
            mt_relevance_macros.$mt$.bind($$EverythingPSC, thread);
            final SubLObject pred_var = $$rewriteOf;
            if (NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(nart, NIL, pred_var)) {
                final SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(nart, NIL, pred_var);
                SubLObject done_var = constant;
                final SubLObject token_var = NIL;
                while (NIL == done_var) {
                    final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                    final SubLObject valid = makeBoolean(!token_var.eql(final_index_spec));
                    if (NIL != valid) {
                        SubLObject final_index_iterator = NIL;
                        try {
                            final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $GAF, $TRUE, NIL);
                            SubLObject done_var_$142 = constant;
                            final SubLObject token_var_$143 = NIL;
                            while (NIL == done_var_$142) {
                                final SubLObject gaf = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$143);
                                final SubLObject valid_$144 = makeBoolean(!token_var_$143.eql(gaf));
                                if (NIL != valid_$144) {
                                    final SubLObject simpler = assertions_high.gaf_arg1(gaf);
                                    if (NIL != constant_p(simpler)) {
                                        constant = simpler;
                                    }
                                }
                                done_var_$142 = makeBoolean((NIL == valid_$144) || (NIL != constant));
                            } 
                        } finally {
                            final SubLObject _prev_bind_0_$145 = $is_thread_performing_cleanupP$.currentBinding(thread);
                            try {
                                $is_thread_performing_cleanupP$.bind(T, thread);
                                final SubLObject _values = getValuesAsVector();
                                if (NIL != final_index_iterator) {
                                    kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                }
                                restoreValuesFromVector(_values);
                            } finally {
                                $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$145, thread);
                            }
                        }
                    }
                    done_var = makeBoolean((NIL == valid) || (NIL != constant));
                } 
            }
        } finally {
            mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
        }
        return constant;
    }

    public static SubLObject pph_constant_for_nart(final SubLObject nart) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
        SubLObject caching_state = NIL;
        if (NIL == v_memoization_state) {
            return pph_constant_for_nart_internal(nart);
        }
        caching_state = memoization_state.memoization_state_lookup(v_memoization_state, PPH_CONSTANT_FOR_NART, UNPROVIDED);
        if (NIL == caching_state) {
            caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), PPH_CONSTANT_FOR_NART, ONE_INTEGER, NIL, EQ, UNPROVIDED);
            memoization_state.memoization_state_put(v_memoization_state, PPH_CONSTANT_FOR_NART, caching_state);
        }
        SubLObject results = memoization_state.caching_state_lookup(caching_state, nart, memoization_state.$memoized_item_not_found$.getGlobalValue());
        if (results.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            results = arg2(thread.resetMultipleValues(), multiple_value_list(pph_constant_for_nart_internal(nart)));
            memoization_state.caching_state_put(caching_state, nart, results, UNPROVIDED);
        }
        return memoization_state.caching_results(results);
    }

    public static SubLObject pph_irrelevant_formulaP(final SubLObject formula, SubLObject pph_relevance_safe_list, SubLObject domain_mt) {
        if (pph_relevance_safe_list == UNPROVIDED) {
            pph_relevance_safe_list = NIL;
        }
        if (domain_mt == UNPROVIDED) {
            domain_mt = pph_irrelevance_check_mt();
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != arguments.support_p(formula)) {
            return pph_irrelevant_formulaP(arguments.support_el_sentence(formula), pph_relevance_safe_list, domain_mt);
        }
        if (NIL != cycl_utilities.expression_find(formula, make_el_list(pph_relevance_safe_list, UNPROVIDED), T, symbol_function(EQUAL), UNPROVIDED)) {
            return NIL;
        }
        if (NIL != el_implication_p(formula)) {
            return pph_irrelevant_formulaP(cycl_utilities.formula_arg2(formula, UNPROVIDED), pph_relevance_safe_list, domain_mt);
        }
        if (NIL == el_formula_p(formula)) {
            return NIL;
        }
        if (NIL != cycl_variables.el_varP(cycl_utilities.formula_arg0(formula))) {
            if (NIL != pph_vars.$pph_irrelevant_warnP$.getDynamicValue(thread)) {
                Errors.warn(cconcatenate(cconcatenate($str115$PPH_irrelevant_formula_, new SubLObject[]{ format_nil.$format_nil_percent$.getGlobalValue(), $$$_, format_nil.format_nil_s_no_copy(formula), format_nil.$format_nil_percent$.getGlobalValue() }), $str199$Has_EL_variable_functor___S_), cycl_utilities.formula_arg0(formula));
            }
            return T;
        }
        if (NIL != cycl_variables.hl_varP(cycl_utilities.formula_arg0(formula))) {
            if (NIL != pph_vars.$pph_irrelevant_warnP$.getDynamicValue(thread)) {
                Errors.warn(cconcatenate(cconcatenate($str115$PPH_irrelevant_formula_, new SubLObject[]{ format_nil.$format_nil_percent$.getGlobalValue(), $$$_, format_nil.format_nil_s_no_copy(formula), format_nil.$format_nil_percent$.getGlobalValue() }), $str200$Has_HL_variable_functor___S_), cycl_utilities.formula_arg0(formula));
            }
            return T;
        }
        if (NIL != pph_utilities.pph_genl_predicateP(narts_high.nart_substitute(cycl_utilities.formula_arg0(formula)), $$interestingSentence, UNPROVIDED)) {
            return NIL;
        }
        if (NIL != el_formula_with_operator_p(formula, $$ist)) {
            return pph_irrelevant_formulaP(cycl_utilities.formula_arg2(formula, UNPROVIDED), pph_relevance_safe_list, domain_mt);
        }
        if (NIL != sksi_external_term_browser.sksi_supported_external_termP(formula)) {
            return NIL;
        }
        final SubLObject max_to_check = TWELVE_INTEGER;
        final SubLObject terms = cycl_utilities.formula_terms(formula, $IGNORE);
        SubLObject list_var = NIL;
        SubLObject arg = NIL;
        SubLObject argnum = NIL;
        list_var = terms;
        arg = list_var.first();
        for (argnum = ZERO_INTEGER; NIL != list_var; list_var = list_var.rest() , arg = list_var.first() , argnum = number_utilities.f_1X(argnum)) {
            if (argnum.numG(max_to_check)) {
                return NIL;
            }
            if (NIL != pph_utilities.pph_irrelevant_fort(arg, pph_relevance_safe_list, domain_mt)) {
                if (NIL != pph_vars.$pph_irrelevant_warnP$.getDynamicValue(thread)) {
                    Errors.warn(cconcatenate(cconcatenate($str115$PPH_irrelevant_formula_, new SubLObject[]{ format_nil.$format_nil_percent$.getGlobalValue(), $$$_, format_nil.format_nil_s_no_copy(formula), format_nil.$format_nil_percent$.getGlobalValue() }), $str204$Has_irrelevant_FORT___S_in__S_), arg, domain_mt);
                }
                return T;
            }
            if (NIL != pph_irrelevant_formulaP(arg, pph_relevance_safe_list, domain_mt)) {
                return T;
            }
        }
        return NIL;
    }

    public static SubLObject pph_trivial_sentenceP(final SubLObject sentence, SubLObject domain_mt) {
        if (domain_mt == UNPROVIDED) {
            domain_mt = pph_triviality_check_mt();
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != $pph_show_gory_proof_details$.getDynamicValue(thread)) {
            return NIL;
        }
        if (NIL != assertion_handles.assertion_p(sentence)) {
            return pph_assertion_trivialP(sentence, UNPROVIDED);
        }
        if (NIL != pph_trivial_termP(cycl_utilities.formula_arg0(sentence), $PREDICATE, domain_mt)) {
            return T;
        }
        if ((NIL != ist_sentence_p(sentence, UNPROVIDED)) && (NIL != pph_trivial_sentenceP(cycl_utilities.formula_arg2(sentence, UNPROVIDED), domain_mt))) {
            return T;
        }
        if ((NIL != el_negation_p(sentence)) && (NIL != pph_trivial_termP(cycl_utilities.formula_arg0(cycl_utilities.formula_arg1(sentence, UNPROVIDED)), $PREDICATE, domain_mt))) {
            return T;
        }
        if (NIL != formula_too_complex_for_proof_paraphraseP(sentence, UNPROVIDED)) {
            return NIL;
        }
        if ((NIL == closedP(sentence, UNPROVIDED)) || (NIL == atomic_sentenceP(sentence))) {
            return NIL;
        }
        if (NIL != pph_trivial_instance_with_relation_isa_sentenceP(sentence)) {
            return T;
        }
        if (NIL != pph_trivial_upper_ontology_sentenceP(sentence)) {
            return T;
        }
        if (NIL != pph_trivial_isa_sentenceP(sentence, domain_mt)) {
            return T;
        }
        if (NIL != pph_trivial_genls_sentenceP(sentence, domain_mt)) {
            return T;
        }
        if (NIL != pph_trivial_genl_preds_sentenceP(sentence, UNPROVIDED)) {
            return T;
        }
        if (NIL != pph_trivial_subcollection_pred_sentenceP(sentence)) {
            return T;
        }
        if (NIL != pph_trivial_reflexive_sentenceP(sentence)) {
            return T;
        }
        if (NIL != pph_trivial_the_sentenceP(sentence, domain_mt)) {
            return T;
        }
        if (NIL != pph_trivial_functional_sentenceP(sentence, domain_mt)) {
            if (NIL != pph_vars.$pph_irrelevant_warnP$.getDynamicValue(thread)) {
                Errors.warn(cconcatenate(cconcatenate($str115$PPH_irrelevant_formula_, new SubLObject[]{ format_nil.$format_nil_percent$.getGlobalValue(), $$$_, format_nil.format_nil_s_no_copy(sentence), format_nil.$format_nil_percent$.getGlobalValue() }), $str206$Trivial_functional_sentence_));
            }
            return T;
        }
        if (NIL != sentence_has_trivial_isomorphic_assertionP(sentence, domain_mt)) {
            return T;
        }
        return NIL;
    }

    public static SubLObject sentence_trivial_for_justification_paraphraseP(final SubLObject sentence, SubLObject domain_mt) {
        if (domain_mt == UNPROVIDED) {
            domain_mt = pph_triviality_check_mt();
        }
        return makeBoolean((NIL != closedP(sentence, UNPROVIDED)) && (NIL != pph_utilities.pph_ask_boolean(make_unary_formula($const207$sentenceTrivialForJustificationPa, sentence), domain_mt, ONE_INTEGER)));
    }

    public static SubLObject sentence_has_trivial_isomorphic_assertionP_internal(final SubLObject sentence, final SubLObject domain_mt) {
        SubLObject trivialP = NIL;
        if (NIL == trivialP) {
            SubLObject csome_list_var = kb_indexing.find_all_gafs(sentence);
            SubLObject gaf = NIL;
            gaf = csome_list_var.first();
            while ((NIL == trivialP) && (NIL != csome_list_var)) {
                if (NIL != pph_trivial_termP(gaf, $ASSERTION, domain_mt)) {
                    trivialP = T;
                }
                csome_list_var = csome_list_var.rest();
                gaf = csome_list_var.first();
            } 
        }
        return trivialP;
    }

    public static SubLObject sentence_has_trivial_isomorphic_assertionP(final SubLObject sentence, final SubLObject domain_mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
        SubLObject caching_state = NIL;
        if (NIL == v_memoization_state) {
            return sentence_has_trivial_isomorphic_assertionP_internal(sentence, domain_mt);
        }
        caching_state = memoization_state.memoization_state_lookup(v_memoization_state, $sym208$SENTENCE_HAS_TRIVIAL_ISOMORPHIC_ASSERTION_, UNPROVIDED);
        if (NIL == caching_state) {
            caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), $sym208$SENTENCE_HAS_TRIVIAL_ISOMORPHIC_ASSERTION_, TWO_INTEGER, NIL, EQUAL, UNPROVIDED);
            memoization_state.memoization_state_put(v_memoization_state, $sym208$SENTENCE_HAS_TRIVIAL_ISOMORPHIC_ASSERTION_, caching_state);
        }
        final SubLObject sxhash = memoization_state.sxhash_calc_2(sentence, domain_mt);
        final SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, UNPROVIDED);
        if (!collisions.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            SubLObject cdolist_list_var = collisions;
            SubLObject collision = NIL;
            collision = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                SubLObject cached_args = collision.first();
                final SubLObject results2 = second(collision);
                if (sentence.equal(cached_args.first())) {
                    cached_args = cached_args.rest();
                    if (((NIL != cached_args) && (NIL == cached_args.rest())) && domain_mt.equal(cached_args.first())) {
                        return memoization_state.caching_results(results2);
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                collision = cdolist_list_var.first();
            } 
        }
        final SubLObject results3 = arg2(thread.resetMultipleValues(), multiple_value_list(sentence_has_trivial_isomorphic_assertionP_internal(sentence, domain_mt)));
        memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results3, list(sentence, domain_mt));
        return memoization_state.caching_results(results3);
    }

    public static SubLObject pph_trivial_the_sentenceP(final SubLObject sentence, SubLObject domain_mt) {
        if (domain_mt == UNPROVIDED) {
            domain_mt = pph_triviality_check_mt();
        }
        return makeBoolean((cycl_utilities.formula_arg0(cycl_utilities.formula_arg1(sentence, UNPROVIDED)).equal($$The) && cycl_utilities.formula_arg1(cycl_utilities.formula_arg1(sentence, UNPROVIDED), UNPROVIDED).equal(cycl_utilities.formula_arg2(sentence, UNPROVIDED))) && (NIL != pph_utilities.pph_genl_predicateP(cycl_utilities.formula_arg0(sentence), $$isa, domain_mt)));
    }

    public static SubLObject pph_trivial_upper_ontology_sentenceP(final SubLObject sentence) {
        if (NIL != formula_pattern_match.formula_matches_pattern(sentence, $list210)) {
            return T;
        }
        return NIL;
    }

    public static SubLObject pph_trivial_functional_sentenceP(final SubLObject sentence, SubLObject domain_mt) {
        if (domain_mt == UNPROVIDED) {
            domain_mt = pph_triviality_check_mt();
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject trivialP = NIL;
        final SubLObject pred = cycl_utilities.formula_arg0(sentence);
        final SubLObject ask_result = (NIL != isa.isaP(pred, $$FunctionalPredicate, domain_mt, UNPROVIDED)) ? pph_utilities.pph_ask_template_new($list212, listS($$functionCorrespondingPredicate, $sym214$_FN, pred, $list215), domain_mt, $list216) : NIL;
        if (NIL == trivialP) {
            SubLObject csome_list_var = ask_result;
            SubLObject this_ask_result = NIL;
            this_ask_result = csome_list_var.first();
            while ((NIL == trivialP) && (NIL != csome_list_var)) {
                SubLObject current;
                final SubLObject datum = current = this_ask_result;
                SubLObject fn = NIL;
                SubLObject argnum = NIL;
                destructuring_bind_must_consp(current, datum, $list217);
                fn = current.first();
                current = argnum = current.rest();
                final SubLObject arg = cycl_utilities.atomic_sentence_arg(sentence, argnum, UNPROVIDED);
                trivialP = eql(cycl_utilities.nat_functor(arg), fn);
                csome_list_var = csome_list_var.rest();
                this_ask_result = csome_list_var.first();
            } 
        }
        if ((NIL != trivialP) && (NIL != proof_view.$proof_view_debugP$.getDynamicValue(thread))) {
            Errors.warn($str218$Trivial_functional_sentence_____S, sentence);
        }
        return trivialP;
    }

    public static SubLObject pph_trivial_instance_with_relation_isa_sentenceP(final SubLObject sentence) {
        return makeBoolean((cycl_utilities.formula_arg0(sentence).eql($$isa) && cycl_utilities.formula_arg2(sentence, UNPROVIDED).equal(cycl_utilities.nat_arg1(cycl_utilities.formula_arg1(sentence, UNPROVIDED), UNPROVIDED))) && (NIL != member(cycl_utilities.nat_functor(cycl_utilities.formula_arg1(sentence, UNPROVIDED)), $list219, UNPROVIDED, UNPROVIDED)));
    }

    public static SubLObject pph_trivial_genls_sentenceP(final SubLObject sentence, SubLObject domain_mt) {
        if (domain_mt == UNPROVIDED) {
            domain_mt = pph_triviality_check_mt();
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject trivialP = NIL;
        if ((NIL != formula_arityE(sentence, TWO_INTEGER, UNPROVIDED)) && (NIL != el_formula_with_operator_p(sentence, $$genls))) {
            SubLObject current;
            final SubLObject datum = current = cycl_utilities.atomic_sentence_args(sentence, UNPROVIDED);
            SubLObject arg1 = NIL;
            SubLObject arg2 = NIL;
            destructuring_bind_must_consp(current, datum, $list221);
            arg1 = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list221);
            arg2 = current.first();
            current = current.rest();
            if (NIL == current) {
                if (arg2.equal(cycl_utilities.nat_arg1(arg1, UNPROVIDED)) && (NIL != kb_accessors.subcollection_relation_function_expression_p(arg1))) {
                    trivialP = T;
                } else {
                    if ((((NIL != cycl_grammar.cycl_nat_p(arg2)) && $$CollectionUnionFn.eql(cycl_utilities.nat_functor(arg2))) && (NIL != el_set_p(cycl_utilities.nat_arg1(arg2, UNPROVIDED)))) && (NIL != member(arg1, el_set_items(cycl_utilities.nat_arg1(arg2, UNPROVIDED)), UNPROVIDED, UNPROVIDED))) {
                        return T;
                    }
                    if ((NIL != indexed_term_p(arg2)) && ((NIL != kb_mapping_utilities.some_pred_value_in_relevant_mts(arg2, $const223$instanceAndSpecSentencesTrivialFo, domain_mt, UNPROVIDED, UNPROVIDED)) || (NIL != kb_mapping_utilities.some_pred_value_in_relevant_mts(arg2, $const224$specSentencesTrivialForJustificat, domain_mt, UNPROVIDED, UNPROVIDED)))) {
                        trivialP = T;
                    } else
                        if ((NIL != cycl_grammar.cycl_nat_p(arg1)) && (NIL != subl_promotions.memberP(arg2, kb_accessors.result_genl(cycl_utilities.nat_functor(arg1), domain_mt, UNPROVIDED), UNPROVIDED, UNPROVIDED))) {
                            trivialP = T;
                        } else
                            if ((NIL != cycl_grammar.cycl_nat_p(arg1)) && (NIL != subl_promotions.memberP(arg2, kb_accessors.result_genl_args(arg1, domain_mt), UNPROVIDED, UNPROVIDED))) {
                                trivialP = T;
                            }


                }
            } else {
                cdestructuring_bind_error(datum, $list221);
            }
        }
        if ((NIL != trivialP) && (NIL != proof_view.$proof_view_debugP$.getDynamicValue(thread))) {
            Errors.warn($str225$Trivial___genls_sentence_____S__, sentence);
        }
        return trivialP;
    }

    public static SubLObject pph_trivial_isa_sentenceP(final SubLObject sentence, SubLObject domain_mt) {
        if (domain_mt == UNPROVIDED) {
            domain_mt = pph_triviality_check_mt();
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject trivialP = NIL;
        if ((NIL != formula_arityE(sentence, TWO_INTEGER, UNPROVIDED)) && (NIL != el_formula_with_operator_p(sentence, $$isa))) {
            SubLObject current;
            final SubLObject datum = current = cycl_utilities.atomic_sentence_args(sentence, UNPROVIDED);
            SubLObject arg1 = NIL;
            SubLObject arg2 = NIL;
            destructuring_bind_must_consp(current, datum, $list221);
            arg1 = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list221);
            arg2 = current.first();
            current = current.rest();
            if (NIL == current) {
                if ((NIL != indexed_term_p(arg2)) && ((NIL != kb_mapping_utilities.some_pred_value_in_relevant_mts(arg2, $const223$instanceAndSpecSentencesTrivialFo, domain_mt, UNPROVIDED, UNPROVIDED)) || (NIL != kb_mapping_utilities.some_pred_value_in_relevant_mts(arg2, $const226$instanceSentencesTrivialForJustif, domain_mt, UNPROVIDED, UNPROVIDED)))) {
                    trivialP = T;
                } else
                    if ((NIL != cycl_grammar.cycl_nat_p(arg2)) && cycl_utilities.nat_functor(arg2).eql($$SingletonCollectionFn)) {
                        trivialP = T;
                    } else
                        if ((NIL != cycl_grammar.cycl_nat_p(arg1)) && (NIL != subl_promotions.memberP(arg2, kb_accessors.result_isa(cycl_utilities.nat_functor(arg1), domain_mt), UNPROVIDED, UNPROVIDED))) {
                            trivialP = T;
                        }


            } else {
                cdestructuring_bind_error(datum, $list221);
            }
        }
        if ((NIL != trivialP) && (NIL != proof_view.$proof_view_debugP$.getDynamicValue(thread))) {
            Errors.warn($str228$Trivial___isa_sentence_____S__, sentence);
        }
        return trivialP;
    }

    public static SubLObject pph_trivial_genl_preds_sentenceP(final SubLObject sentence, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = pph_triviality_check_mt();
        }
        if (!cycl_utilities.formula_arg0(sentence).eql($$genlPreds)) {
            return NIL;
        }
        if (cycl_utilities.formula_arg2(sentence, UNPROVIDED).equal(cycl_utilities.nat_arg1(cycl_utilities.formula_arg1(sentence, UNPROVIDED), UNPROVIDED))) {
            return T;
        }
        if (NIL != pph_required_sentenceP(sentence, mt)) {
            return NIL;
        }
        return T;
    }

    public static SubLObject pph_required_sentenceP_internal(final SubLObject sentence, final SubLObject mt) {
        return inference_kernel.new_cyc_query(list($$or, list($const232$sentenceRequiredForJustificationP, sentence), list($$thereExists, $sym234$_AS, listS($$and, list($$assertionSentence, $sym234$_AS, sentence), $list237))), mt, UNPROVIDED);
    }

    public static SubLObject pph_required_sentenceP(final SubLObject sentence, final SubLObject mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
        SubLObject caching_state = NIL;
        if (NIL == v_memoization_state) {
            return pph_required_sentenceP_internal(sentence, mt);
        }
        caching_state = memoization_state.memoization_state_lookup(v_memoization_state, $sym230$PPH_REQUIRED_SENTENCE_, UNPROVIDED);
        if (NIL == caching_state) {
            caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), $sym230$PPH_REQUIRED_SENTENCE_, TWO_INTEGER, NIL, EQUAL, UNPROVIDED);
            memoization_state.memoization_state_put(v_memoization_state, $sym230$PPH_REQUIRED_SENTENCE_, caching_state);
        }
        final SubLObject sxhash = memoization_state.sxhash_calc_2(sentence, mt);
        final SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, UNPROVIDED);
        if (!collisions.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            SubLObject cdolist_list_var = collisions;
            SubLObject collision = NIL;
            collision = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                SubLObject cached_args = collision.first();
                final SubLObject results2 = second(collision);
                if (sentence.equal(cached_args.first())) {
                    cached_args = cached_args.rest();
                    if (((NIL != cached_args) && (NIL == cached_args.rest())) && mt.equal(cached_args.first())) {
                        return memoization_state.caching_results(results2);
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                collision = cdolist_list_var.first();
            } 
        }
        final SubLObject results3 = arg2(thread.resetMultipleValues(), multiple_value_list(pph_required_sentenceP_internal(sentence, mt)));
        memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results3, list(sentence, mt));
        return memoization_state.caching_results(results3);
    }

    public static SubLObject pph_trivial_subcollection_pred_sentenceP(final SubLObject sentence) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject trivialP = NIL;
        thread.resetMultipleValues();
        final SubLObject success = formula_pattern_match.formula_matches_pattern(sentence, $list238);
        final SubLObject v_bindings = thread.secondMultipleValue();
        thread.resetMultipleValues();
        if (NIL != success) {
            final SubLObject x = list_utilities.alist_lookup_without_values(v_bindings, X, UNPROVIDED, UNPROVIDED);
            final SubLObject bin_pred = list_utilities.alist_lookup_without_values(v_bindings, BIN_PRED, UNPROVIDED, UNPROVIDED);
            final SubLObject nat = list_utilities.alist_lookup_without_values(v_bindings, NAT, UNPROVIDED, UNPROVIDED);
            if (NIL != formula_pattern_match.formula_matches_pattern(cycl_utilities.formula_terms(nat, UNPROVIDED), list($ANYTHING, $ANYTHING, bin_pred, x))) {
                trivialP = T;
            }
        }
        return trivialP;
    }

    public static SubLObject pph_trivial_reflexive_sentenceP(final SubLObject sentence) {
        SubLObject trivialP = NIL;
        final SubLObject pred = cycl_utilities.formula_arg0(sentence);
        final SubLObject arg_to_argnums = dictionary.new_dictionary(symbol_function(EQUAL), UNPROVIDED);
        SubLObject argnum = ZERO_INTEGER;
        SubLObject cdolist_list_var;
        final SubLObject args = cdolist_list_var = cycl_utilities.formula_args(sentence, $IGNORE);
        SubLObject arg = NIL;
        arg = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            argnum = add(argnum, ONE_INTEGER);
            dictionary_utilities.dictionary_push(arg_to_argnums, arg, argnum);
            cdolist_list_var = cdolist_list_var.rest();
            arg = cdolist_list_var.first();
        } 
        if (NIL == trivialP) {
            SubLObject csome_list_var = dictionary.dictionary_values(arg_to_argnums);
            SubLObject argnums = NIL;
            argnums = csome_list_var.first();
            while ((NIL == trivialP) && (NIL != csome_list_var)) {
                SubLObject argnum_pairs = NIL;
                final SubLObject pcase_var = length(argnums);
                if (!pcase_var.eql(ZERO_INTEGER)) {
                    if (!pcase_var.eql(ONE_INTEGER)) {
                        if (pcase_var.eql(TWO_INTEGER)) {
                            argnum_pairs = list(argnums);
                        } else {
                            SubLObject cdolist_list_var2 = list_utilities.cartesian_product(list(argnums, argnums), UNPROVIDED, UNPROVIDED, UNPROVIDED);
                            SubLObject argnum_pair = NIL;
                            argnum_pair = cdolist_list_var2.first();
                            while (NIL != cdolist_list_var2) {
                                if (argnum_pair.first().numL(second(argnum_pair))) {
                                    argnum_pairs = cons(argnum_pair, argnum_pairs);
                                }
                                cdolist_list_var2 = cdolist_list_var2.rest();
                                argnum_pair = cdolist_list_var2.first();
                            } 
                        }
                    }
                }
                if (NIL == trivialP) {
                    SubLObject csome_list_var_$146 = argnum_pairs;
                    SubLObject argnum_pair = NIL;
                    argnum_pair = csome_list_var_$146.first();
                    while ((NIL == trivialP) && (NIL != csome_list_var_$146)) {
                        SubLObject current;
                        final SubLObject datum = current = argnum_pair;
                        SubLObject arg2 = NIL;
                        SubLObject arg3 = NIL;
                        destructuring_bind_must_consp(current, datum, $list221);
                        arg2 = current.first();
                        current = current.rest();
                        destructuring_bind_must_consp(current, datum, $list221);
                        arg3 = current.first();
                        current = current.rest();
                        if (NIL == current) {
                            if (NIL != pph_utilities.pph_ask_boolean(list($$reflexiveInArgs, pred, arg2, arg3), $$InferencePSC, ONE_INTEGER)) {
                                trivialP = T;
                            }
                        } else {
                            cdestructuring_bind_error(datum, $list221);
                        }
                        csome_list_var_$146 = csome_list_var_$146.rest();
                        argnum_pair = csome_list_var_$146.first();
                    } 
                }
                csome_list_var = csome_list_var.rest();
                argnums = csome_list_var.first();
            } 
        }
        if (NIL != trivialP) {
        }
        return trivialP;
    }

    public static SubLObject pph_trivial_termP_internal(final SubLObject v_object, final SubLObject type, SubLObject domain_mt) {
        if (domain_mt == UNPROVIDED) {
            domain_mt = pph_vars.$pph_language_mt$.getDynamicValue();
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject ans = NIL;
        if (NIL != cycl_grammar.cycl_term_p(v_object)) {
            SubLObject store = NIL;
            try {
                store = inference_datastructures_problem_store.new_problem_store(NIL);
                ans = makeBoolean((NIL != term_has_pro_trivial_argumentP(v_object, type, domain_mt, store)) && (NIL == term_has_con_trivial_argumentP(v_object, type, domain_mt, store)));
            } finally {
                final SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    inference_datastructures_problem_store.destroy_problem_store(store);
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        }
        if ((NIL != ans) && (NIL != proof_view.$proof_view_debugP$.getDynamicValue(thread))) {
            Errors.warn($str244$_A_is_trivial_in__S, v_object, domain_mt);
        }
        return ans;
    }

    public static SubLObject pph_trivial_termP(final SubLObject v_object, final SubLObject type, SubLObject domain_mt) {
        if (domain_mt == UNPROVIDED) {
            domain_mt = pph_vars.$pph_language_mt$.getDynamicValue();
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
        SubLObject caching_state = NIL;
        if (NIL == v_memoization_state) {
            return pph_trivial_termP_internal(v_object, type, domain_mt);
        }
        caching_state = memoization_state.memoization_state_lookup(v_memoization_state, $sym243$PPH_TRIVIAL_TERM_, UNPROVIDED);
        if (NIL == caching_state) {
            caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), $sym243$PPH_TRIVIAL_TERM_, THREE_INTEGER, NIL, EQUAL, UNPROVIDED);
            memoization_state.memoization_state_put(v_memoization_state, $sym243$PPH_TRIVIAL_TERM_, caching_state);
        }
        final SubLObject sxhash = memoization_state.sxhash_calc_3(v_object, type, domain_mt);
        final SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, UNPROVIDED);
        if (!collisions.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            SubLObject cdolist_list_var = collisions;
            SubLObject collision = NIL;
            collision = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                SubLObject cached_args = collision.first();
                final SubLObject results2 = second(collision);
                if (v_object.equal(cached_args.first())) {
                    cached_args = cached_args.rest();
                    if (type.equal(cached_args.first())) {
                        cached_args = cached_args.rest();
                        if (((NIL != cached_args) && (NIL == cached_args.rest())) && domain_mt.equal(cached_args.first())) {
                            return memoization_state.caching_results(results2);
                        }
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                collision = cdolist_list_var.first();
            } 
        }
        final SubLObject results3 = arg2(thread.resetMultipleValues(), multiple_value_list(pph_trivial_termP_internal(v_object, type, domain_mt)));
        memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results3, list(v_object, type, domain_mt));
        return memoization_state.caching_results(results3);
    }

    public static SubLObject triviality_sentence_for_term(final SubLObject v_term, final SubLObject type) {
        if (type.eql($PREDICATE)) {
            return list($const245$predTrivialForJustificationParaph, v_term);
        }
        if (type.eql($ASSERTION)) {
            return list($const246$assertionTrivialForJustificationP, v_term);
        }
        if (type.eql($MT)) {
            return list($const118$mtTrivialForJustificationParaphra, v_term);
        }
        Errors.error($str247$_S_is_an_unknown_triviality_type_, type);
        return $$False;
    }

    public static SubLObject triviality_query_properties(final SubLObject problem_store) {
        return list($INFERENCE_MODE, $MINIMAL, $PROBLEM_STORE, problem_store);
    }

    public static SubLObject term_has_pro_trivial_argumentP(final SubLObject v_term, final SubLObject type, final SubLObject domain_mt, final SubLObject problem_store) {
        if (((type == $PREDICATE) && (NIL != somewhere_cache.valid_somewhere_cache_itemP(v_term))) && (NIL == somewhere_cache.some_pred_assertion_somewhereP($const245$predTrivialForJustificationParaph, v_term, ONE_INTEGER, T))) {
            return NIL;
        }
        if ((type == $ASSERTION) && (NIL == assertion_has_triviality_assertionsP(v_term))) {
            return NIL;
        }
        return cyc_kernel.closed_query_success_token_p(inference_kernel.new_cyc_query(triviality_sentence_for_term(v_term, type), domain_mt, triviality_query_properties(problem_store)));
    }

    public static SubLObject assertion_has_triviality_assertionsP(final SubLObject v_assert) {
        SubLObject cdolist_list_var = genl_predicates.all_spec_preds($const246$assertionTrivialForJustificationP, $$InferencePSC, UNPROVIDED);
        SubLObject pred = NIL;
        pred = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if ((NIL == somewhere_cache.somewhere_cached_pred_p(pred)) || (NIL != somewhere_cache.some_pred_assertion_somewhereP(pred, v_assert, ONE_INTEGER, T))) {
                return T;
            }
            cdolist_list_var = cdolist_list_var.rest();
            pred = cdolist_list_var.first();
        } 
        return NIL;
    }

    public static SubLObject term_has_con_trivial_argumentP(final SubLObject v_term, final SubLObject type, final SubLObject domain_mt, final SubLObject problem_store) {
        return cyc_kernel.closed_query_success_token_p(inference_kernel.new_cyc_query(cycl_utilities.negate(triviality_sentence_for_term(v_term, type)), domain_mt, triviality_query_properties(problem_store)));
    }

    public static SubLObject pph_maybe_show_additional_supports(final SubLObject supports, final SubLObject index_string) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != pph_vars.$pph_use_showXhideP$.getDynamicValue(thread)) {
            final SubLObject object_id = cconcatenate($str250$additional_supports_, index_string);
            html_markup(dhtml_macros.$dhtml_css_head$.getGlobalValue());
            html_markup(dhtml_macros.$dhtml_css_type$.getGlobalValue());
            html_char(CHAR_quotation, UNPROVIDED);
            html_markup($str38$text_css);
            html_char(CHAR_quotation, UNPROVIDED);
            html_markup(dhtml_macros.$dhtml_css_media$.getGlobalValue());
            html_char(CHAR_quotation, UNPROVIDED);
            html_markup($$$screen);
            html_char(CHAR_quotation, UNPROVIDED);
            html_char(CHAR_greater, UNPROVIDED);
            SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
            try {
                html_macros.$html_safe_print$.bind(T, thread);
                html_terpri(UNPROVIDED);
                dhtml_macros.dhtml_dom_wrapper_preamble(object_id);
                dhtml_macros.dhtml_dom_attribute_preamble(dhtml_macros.$dhtml_dom_display$.getGlobalValue());
                html_markup($$$none);
                dhtml_macros.dhtml_dom_attribute_postamble();
                dhtml_macros.dhtml_dom_wrapper_postamble();
                html_terpri(UNPROVIDED);
            } finally {
                html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
            }
            html_markup(dhtml_macros.$dhtml_css_tail$.getGlobalValue());
            html_terpri(UNPROVIDED);
            dhtml_macros.dhtml_switch_visibility_links_arrows(object_id, $$$Additional_Supports);
            dhtml_macros.dhtml_set_switched_visibility(object_id, $INVISIBLE, $TEXT);
            html_markup(html_macros.$html_div_head$.getGlobalValue());
            if (NIL != object_id) {
                html_markup(html_macros.$html_attribute_id$.getGlobalValue());
                html_char(CHAR_quotation, UNPROVIDED);
                html_markup(object_id);
                html_char(CHAR_quotation, UNPROVIDED);
            }
            html_char(CHAR_greater, UNPROVIDED);
            _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
            try {
                html_macros.$html_safe_print$.bind(T, thread);
                html_markup(html_macros.$html_unordered_list_head$.getGlobalValue());
                html_char(CHAR_greater, UNPROVIDED);
                final SubLObject _prev_bind_0_$147 = html_macros.$html_safe_print$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind(T, thread);
                    SubLObject list_var = NIL;
                    SubLObject support = NIL;
                    SubLObject support_num = NIL;
                    list_var = supports;
                    support = list_var.first();
                    for (support_num = ZERO_INTEGER; NIL != list_var; list_var = list_var.rest() , support = list_var.first() , support_num = add(ONE_INTEGER, support_num)) {
                        html_markup(html_macros.$html_list_item_head$.getGlobalValue());
                        html_char(CHAR_greater, UNPROVIDED);
                        final SubLObject _prev_bind_0_$148 = html_macros.$html_safe_print$.currentBinding(thread);
                        try {
                            html_macros.$html_safe_print$.bind(T, thread);
                            final SubLObject support_index_string = format(NIL, $str252$_A_additional__D, index_string, support_num);
                            pph_show_support(support, support_index_string, UNPROVIDED);
                        } finally {
                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$148, thread);
                        }
                        html_markup(html_macros.$html_list_item_tail$.getGlobalValue());
                    }
                } finally {
                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$147, thread);
                }
                html_markup(html_macros.$html_unordered_list_tail$.getGlobalValue());
            } finally {
                html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
            }
            html_markup(html_macros.$html_div_tail$.getGlobalValue());
            html_source_readability_terpri(UNPROVIDED);
        } else {
            html_princ($$$Additional_Supports);
            html_markup(html_macros.$html_unordered_list_head$.getGlobalValue());
            html_char(CHAR_greater, UNPROVIDED);
            final SubLObject _prev_bind_2 = html_macros.$html_safe_print$.currentBinding(thread);
            try {
                html_macros.$html_safe_print$.bind(T, thread);
                SubLObject list_var2 = NIL;
                SubLObject support2 = NIL;
                SubLObject support_num2 = NIL;
                list_var2 = supports;
                support2 = list_var2.first();
                for (support_num2 = ZERO_INTEGER; NIL != list_var2; list_var2 = list_var2.rest() , support2 = list_var2.first() , support_num2 = add(ONE_INTEGER, support_num2)) {
                    html_markup(html_macros.$html_list_item_head$.getGlobalValue());
                    html_char(CHAR_greater, UNPROVIDED);
                    final SubLObject _prev_bind_0_$149 = html_macros.$html_safe_print$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind(T, thread);
                        pph_show_support(support2, UNPROVIDED, UNPROVIDED);
                    } finally {
                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$149, thread);
                    }
                    html_markup(html_macros.$html_list_item_tail$.getGlobalValue());
                }
            } finally {
                html_macros.$html_safe_print$.rebind(_prev_bind_2, thread);
            }
            html_markup(html_macros.$html_unordered_list_tail$.getGlobalValue());
        }
        return NIL;
    }

    public static SubLObject pph_show_assertion(final SubLObject assertion) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject _prev_bind_0 = pph_vars.$pph_domain_mt$.currentBinding(thread);
        try {
            pph_vars.$pph_domain_mt$.bind(pph_methods.pph_enhanced_domain_mt(assertions_high.assertion_mt(assertion), UNPROVIDED), thread);
            if (NIL != pph_highly_relevant_assertionP(assertion, UNPROVIDED)) {
                html_markup(html_macros.$html_span_head$.getGlobalValue());
                html_markup(html_macros.$html_attribute_class$.getGlobalValue());
                html_char(CHAR_quotation, UNPROVIDED);
                html_markup($str135$highly_relevant);
                html_char(CHAR_quotation, UNPROVIDED);
                html_char(CHAR_greater, UNPROVIDED);
                final SubLObject _prev_bind_0_$150 = html_macros.$html_safe_print$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind(T, thread);
                    pph_show_assertion_int(assertion);
                } finally {
                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$150, thread);
                }
                html_markup(html_macros.$html_span_tail$.getGlobalValue());
            } else {
                html_markup(html_macros.$html_span_head$.getGlobalValue());
                html_char(CHAR_greater, UNPROVIDED);
                final SubLObject _prev_bind_0_$151 = html_macros.$html_safe_print$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind(T, thread);
                    pph_show_assertion_int(assertion);
                } finally {
                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$151, thread);
                }
                html_markup(html_macros.$html_span_tail$.getGlobalValue());
            }
        } finally {
            pph_vars.$pph_domain_mt$.rebind(_prev_bind_0, thread);
        }
        return assertion;
    }

    public static SubLObject pph_show_assertion_int(final SubLObject assertion) {
        pph_show_wXsentential_force(assertion, $DECLARATIVE, UNPROVIDED);
        return assertion;
    }

    public static SubLObject pph_assert_info(final SubLObject assertion) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        thread.resetMultipleValues();
        final SubLObject v_sources = sources.assertion_sources(assertion);
        final SubLObject strengthenedP = thread.secondMultipleValue();
        thread.resetMultipleValues();
        return values(hlmt.assertion_hlmt(assertion), v_sources, strengthenedP);
    }

    public static SubLObject pph_show_source(SubLObject source, SubLObject strengthenedP) {
        if (strengthenedP == UNPROVIDED) {
            strengthenedP = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        format(html_macros.$html_stream$.getDynamicValue(thread), $str253$_from__A, pph_term_phrase_np(source));
        return source;
    }

    public static SubLObject pph_highly_relevant_assertionP(final SubLObject assertion, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = $$InferencePSC;
        }
        SubLObject sentence = list($const254$sentenceHighlyRelevantForJustific, assertion);
        if (NIL != assertions_high.gaf_assertionP(assertion)) {
            sentence = simplifier.disjoin(list(sentence, list($const137$predHighlyRelevantForJustificatio, assertions_high.gaf_arg0(assertion))), UNPROVIDED);
        }
        return pph_utilities.pph_ask_boolean(sentence, mt, UNPROVIDED);
    }

    public static SubLObject pph_show_sentence(final SubLObject sentence, SubLObject paraphrase, SubLObject show_linkP) {
        if (paraphrase == UNPROVIDED) {
            paraphrase = NIL;
        }
        if (show_linkP == UNPROVIDED) {
            show_linkP = T;
        }
        pph_show_wXsentential_force(sentence, $DECLARATIVE, paraphrase);
        return sentence;
    }

    public static SubLObject pph_show_term(final SubLObject v_term, SubLObject paraphrase, SubLObject show_linkP) {
        if (paraphrase == UNPROVIDED) {
            paraphrase = NIL;
        }
        if (show_linkP == UNPROVIDED) {
            show_linkP = T;
        }
        final SubLObject force = pph_utilities.pph_default_force_for_term(v_term);
        pph_show_wXsentential_force(v_term, force, paraphrase);
        return v_term;
    }

    public static SubLObject pph_show_question(final SubLObject v_question) {
        pph_show_wXsentential_force(v_question, $INTERROGATIVE, UNPROVIDED);
        return v_question;
    }

    public static SubLObject pph_term_phrase_np(final SubLObject v_object) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject tagged = list(pph_functions.termparaphrasefn_constrained(), pph_utilities.pph_np_category(), v_object);
        return pph_main.generate_text_wXsentential_force(tagged, $NONE, $ANY, $DEFAULT, $DEFAULT, pph_vars.$paraphrase_mode$.getDynamicValue(thread), UNPROVIDED);
    }

    public static SubLObject pph_show_wXsentential_force(final SubLObject v_object, final SubLObject force, SubLObject paraphrase) {
        if (paraphrase == UNPROVIDED) {
            paraphrase = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (!paraphrase.isString()) {
            final SubLObject _prev_bind_0 = pph_macros.$new_pph_phrases$.currentBinding(thread);
            final SubLObject _prev_bind_2 = pph_macros.$new_pph_phrase_count$.currentBinding(thread);
            final SubLObject _prev_bind_3 = pph_macros.$destroy_new_pph_phrasesP$.currentBinding(thread);
            try {
                pph_macros.$new_pph_phrases$.bind(stacks.create_stack(), thread);
                pph_macros.$new_pph_phrase_count$.bind(pph_macros.get_new_pph_phrase_count(), thread);
                pph_macros.$destroy_new_pph_phrasesP$.bind(T, thread);
                try {
                    thread.resetMultipleValues();
                    final SubLObject v_cycl_string = pph_main.generate_text_wXsentential_force(v_object, force, $DEFAULT, $DEFAULT, $DEFAULT, pph_vars.$paraphrase_mode$.getDynamicValue(thread), UNPROVIDED);
                    final SubLObject pred = thread.secondMultipleValue();
                    final SubLObject justification = thread.thirdMultipleValue();
                    final SubLObject output_list = thread.fourthMultipleValue();
                    final SubLObject demerits = thread.fifthMultipleValue();
                    final SubLObject v_pph_phrase = thread.sixthMultipleValue();
                    thread.resetMultipleValues();
                    if ((NIL != subl_promotions.positive_integer_p(demerits)) && (NIL != misc_utilities.initialized_p(pph_vars.$pph_top_level_demerits$.getDynamicValue(thread)))) {
                        Errors.warn($str258$Generated__D_demerits_for__S, demerits, v_object);
                        pph_vars.$pph_top_level_demerits$.setDynamicValue(demerits, thread);
                    }
                    if ((NIL != pph_vars.$pph_proof_include_phrase_linksP$.getDynamicValue(thread)) && (NIL != v_pph_phrase)) {
                        return cb_form(v_pph_phrase, UNPROVIDED, UNPROVIDED);
                    }
                    paraphrase = v_cycl_string;
                } finally {
                    final SubLObject _prev_bind_0_$152 = $is_thread_performing_cleanupP$.currentBinding(thread);
                    try {
                        $is_thread_performing_cleanupP$.bind(T, thread);
                        final SubLObject _values = getValuesAsVector();
                        pph_macros.destroy_new_pph_phrases();
                        restoreValuesFromVector(_values);
                    } finally {
                        $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$152, thread);
                    }
                }
            } finally {
                pph_macros.$destroy_new_pph_phrasesP$.rebind(_prev_bind_3, thread);
                pph_macros.$new_pph_phrase_count$.rebind(_prev_bind_2, thread);
                pph_macros.$new_pph_phrases$.rebind(_prev_bind_0, thread);
            }
        }
        if (paraphrase.isString()) {
            html_markup(paraphrase);
        } else {
            html_princ(v_object);
        }
        return v_object;
    }

    public static SubLObject pph_templated_proofP(final SubLObject proof) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return makeBoolean((NIL != $pph_use_proof_templatesP$.getDynamicValue(thread)) && (NIL != pph_proof_template(proof)));
    }

    public static SubLObject pph_proof_template(final SubLObject proof) {
        SubLObject template = NIL;
        if (NIL != inference_worker_transformation.transformation_proof_p(proof)) {
            template = pph_get_proof_template(proof);
        }
        return template;
    }

    public static SubLObject pph_get_proof_template(final SubLObject proof) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject cycl_proof = removal_modules_inference_reflection.cycl_proof_decode(proof);
        SubLObject templates = NIL;
        final SubLObject _prev_bind_0 = czer_vars.$canonicalize_el_template_vars_during_queriesP$.currentBinding(thread);
        try {
            czer_vars.$canonicalize_el_template_vars_during_queriesP$.bind(NIL, thread);
            templates = pph_utilities.pph_ask_variable_new($sym259$_TEMPLATE, list($const260$justificationTemplateAppliesToPro, $sym259$_TEMPLATE, cycl_proof), pph_vars.$pph_language_mt$.getDynamicValue(thread), $list261);
        } finally {
            czer_vars.$canonicalize_el_template_vars_during_queriesP$.rebind(_prev_bind_0, thread);
        }
        return pph_choose_proof_template(proof, templates);
    }

    public static SubLObject pph_choose_proof_template(final SubLObject proof, final SubLObject templates) {
        return templates.first();
    }

    public static SubLObject pph_show_templated_proof(final SubLObject proof, final SubLObject mt, final SubLObject proof_index_string, SubLObject nestedP) {
        if (nestedP == UNPROVIDED) {
            nestedP = NIL;
        }
        final SubLObject template = pph_get_proof_template(proof);
        pph_show_proof_template_motivation(proof, template, mt, proof_index_string);
        pph_show_proof_template_body(proof, template, mt, proof_index_string);
        pph_show_proof_template_conclusion(proof, template, mt, proof_index_string, nestedP);
        pph_note_proof_displayed(proof);
        pph_note_proof_justified(proof);
        return proof;
    }

    public static SubLObject pph_proof_template_var_name(final SubLObject var, final SubLObject template) {
        final SubLObject alist = $list262;
        return list_utilities.alist_lookup(alist, var, UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject pph_show_proof_template_motivation(final SubLObject proof, final SubLObject template, final SubLObject mt, final SubLObject proof_index_string) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject rule_bindings = inference_worker_transformation.transformation_proof_rule_el_bindings(proof);
        SubLObject list_var = NIL;
        SubLObject constraint = NIL;
        SubLObject i = NIL;
        list_var = pph_proof_template_applicability_constraints(template);
        constraint = list_var.first();
        for (i = ZERO_INTEGER; NIL != list_var; list_var = list_var.rest() , constraint = list_var.first() , i = add(ONE_INTEGER, i)) {
            html_newline(TWO_INTEGER);
            if (i.isZero()) {
                html_princ($str263$Since_);
            } else {
                html_princ($str264$and_since_);
            }
            final SubLObject subbed_constraint = bindings.apply_bindings(rule_bindings, constraint);
            final SubLObject _prev_bind_0 = pph_vars.$pph_use_bulleted_lists_min_level$.currentBinding(thread);
            try {
                pph_vars.$pph_use_bulleted_lists_min_level$.bind(ZERO_INTEGER, thread);
                html_markup(html_macros.$html_table_head$.getGlobalValue());
                html_markup(html_macros.$html_attribute_class$.getGlobalValue());
                html_char(CHAR_quotation, UNPROVIDED);
                html_markup($str129$pf_indent);
                html_char(CHAR_quotation, UNPROVIDED);
                html_markup(html_macros.$html_table_border$.getGlobalValue());
                html_char(CHAR_quotation, UNPROVIDED);
                html_markup(ZERO_INTEGER);
                html_char(CHAR_quotation, UNPROVIDED);
                html_char(CHAR_greater, UNPROVIDED);
                final SubLObject _prev_bind_0_$153 = html_macros.$html_safe_print$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind(T, thread);
                    html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                    html_char(CHAR_greater, UNPROVIDED);
                    final SubLObject _prev_bind_0_$154 = html_macros.$html_safe_print$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind(T, thread);
                        html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                        html_markup(html_macros.$html_attribute_class$.getGlobalValue());
                        html_char(CHAR_quotation, UNPROVIDED);
                        html_markup($str130$pf_indent_td);
                        html_char(CHAR_quotation, UNPROVIDED);
                        html_char(CHAR_greater, UNPROVIDED);
                        final SubLObject _prev_bind_0_$155 = html_macros.$html_safe_print$.currentBinding(thread);
                        try {
                            html_macros.$html_safe_print$.bind(T, thread);
                        } finally {
                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$155, thread);
                        }
                        html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                        html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                        html_char(CHAR_greater, UNPROVIDED);
                        final SubLObject _prev_bind_0_$156 = html_macros.$html_safe_print$.currentBinding(thread);
                        try {
                            html_macros.$html_safe_print$.bind(T, thread);
                            pph_show_sentence(subbed_constraint, UNPROVIDED, UNPROVIDED);
                        } finally {
                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$156, thread);
                        }
                        html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                    } finally {
                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$154, thread);
                    }
                    html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                    html_source_readability_terpri(UNPROVIDED);
                } finally {
                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$153, thread);
                }
                html_markup(html_macros.$html_table_tail$.getGlobalValue());
            } finally {
                pph_vars.$pph_use_bulleted_lists_min_level$.rebind(_prev_bind_0, thread);
            }
        }
        return proof;
    }

    public static SubLObject pph_proof_template_applicability_constraints(final SubLObject template) {
        return pph_utilities.pph_ask_variable_new($sym265$_CONSTRAINT, listS($const266$justificationTemplateApplicabilit, template, $list267), $$InferencePSC, UNPROVIDED);
    }

    public static SubLObject pph_proof_template_has_preconditionsP(final SubLObject template) {
        return T;
    }

    public static SubLObject pph_proof_show_template(final SubLObject template) {
        final SubLObject template_name = $str268$the_Henderson_Hasselbalch_equatio;
        html_princ(template_name);
        return template;
    }

    public static SubLObject pph_proof_template_show_precondition_proofs(final SubLObject template, final SubLObject proof, final SubLObject mt, final SubLObject proof_index_string) {
        if (NIL != formula_pattern_match.formula_matches_pattern(pph_proof_el_formula(proof, mt), $list269)) {
            pph_show_inference_proof(proof, mt, proof_index_string);
        }
        SubLObject cdolist_list_var = inference_datastructures_proof.proof_direct_subproofs(proof);
        SubLObject subproof = NIL;
        subproof = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            final SubLObject index_string = cconcatenate(proof_index_string, $str270$_sub);
            pph_proof_template_show_precondition_proofs(template, subproof, mt, index_string);
            cdolist_list_var = cdolist_list_var.rest();
            subproof = cdolist_list_var.first();
        } 
        return template;
    }

    public static SubLObject pph_show_proof_template_body(final SubLObject proof, final SubLObject template, final SubLObject mt, final SubLObject proof_index_string) {
        final SubLObject rule_gloss_templates = pph_utilities.pph_ask_variable_new($sym271$_RULE_GLOSS_TEMPLATE, listS($const272$justificationGenerationRuleGlossT, template, $list273), $$InferencePSC, UNPROVIDED);
        final SubLObject rule_bindings = inference_worker_transformation.transformation_proof_rule_el_bindings(proof);
        SubLObject doneP = NIL;
        if (NIL == doneP) {
            SubLObject csome_list_var = rule_gloss_templates;
            SubLObject phrase_naut = NIL;
            phrase_naut = csome_list_var.first();
            while ((NIL == doneP) && (NIL != csome_list_var)) {
                final SubLObject subbed_phrase_naut = pph_utilities.pph_resolve_formula_arg_nauts(bindings.apply_bindings(rule_bindings, phrase_naut), NIL);
                final SubLObject v_pph_phrase = pph_templates.pph_phrasify_phrase_naut(subbed_phrase_naut, UNPROVIDED);
                pph_phrase_resolution.pph_phrase_get_string(v_pph_phrase, UNPROVIDED, UNPROVIDED);
                if (NIL != pph_phrase.pph_phrase_doneP(v_pph_phrase)) {
                    html_princ($str274$We_can_apply_the_rule__);
                    pph_show_sentence(subbed_phrase_naut, pph_phrase.pph_phrase_string(v_pph_phrase, T), NIL);
                    doneP = T;
                }
                csome_list_var = csome_list_var.rest();
                phrase_naut = csome_list_var.first();
            } 
        }
        return proof;
    }

    public static SubLObject pph_show_proof_template_variable_bindings(final SubLObject proof, final SubLObject template, final SubLObject mt, final SubLObject proof_index_string) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject all_bindings = inference_worker_transformation.transformation_proof_rule_el_bindings(proof);
        final SubLObject vars_to_show = pph_proof_template_vars_to_substitute(template);
        html_markup(html_macros.$html_table_head$.getGlobalValue());
        html_markup(html_macros.$html_table_border$.getGlobalValue());
        html_char(CHAR_quotation, UNPROVIDED);
        html_markup(ZERO_INTEGER);
        html_char(CHAR_quotation, UNPROVIDED);
        html_char(CHAR_greater, UNPROVIDED);
        final SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
        try {
            html_macros.$html_safe_print$.bind(T, thread);
            SubLObject cdolist_list_var = vars_to_show;
            SubLObject var = NIL;
            var = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                html_newline(UNPROVIDED);
                final SubLObject variable_name = pph_proof_template_var_name(var, template);
                final SubLObject value = bindings.variable_lookup(var, all_bindings);
                html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                html_char(CHAR_greater, UNPROVIDED);
                final SubLObject _prev_bind_0_$157 = html_macros.$html_safe_print$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind(T, thread);
                    html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                    html_markup(html_macros.$html_table_data_align$.getGlobalValue());
                    html_char(CHAR_quotation, UNPROVIDED);
                    html_markup(html_align($RIGHT));
                    html_char(CHAR_quotation, UNPROVIDED);
                    html_markup(html_macros.$html_table_data_valign$.getGlobalValue());
                    html_char(CHAR_quotation, UNPROVIDED);
                    html_markup(html_align($TOP));
                    html_char(CHAR_quotation, UNPROVIDED);
                    html_char(CHAR_greater, UNPROVIDED);
                    final SubLObject _prev_bind_0_$158 = html_macros.$html_safe_print$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind(T, thread);
                        html_markup(variable_name);
                    } finally {
                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$158, thread);
                    }
                    html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                    html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                    html_markup(html_macros.$html_table_data_align$.getGlobalValue());
                    html_char(CHAR_quotation, UNPROVIDED);
                    html_markup(html_align($CENTER));
                    html_char(CHAR_quotation, UNPROVIDED);
                    html_markup(html_macros.$html_table_data_valign$.getGlobalValue());
                    html_char(CHAR_quotation, UNPROVIDED);
                    html_markup(html_align($TOP));
                    html_char(CHAR_quotation, UNPROVIDED);
                    html_char(CHAR_greater, UNPROVIDED);
                    final SubLObject _prev_bind_0_$159 = html_macros.$html_safe_print$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind(T, thread);
                        html_glyph($NBSP, UNPROVIDED);
                        html_princ($str279$_);
                        html_glyph($NBSP, UNPROVIDED);
                    } finally {
                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$159, thread);
                    }
                    html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                    html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                    html_simple_attribute(html_macros.$html_table_data_nowrap$.getGlobalValue());
                    html_markup(html_macros.$html_table_data_align$.getGlobalValue());
                    html_char(CHAR_quotation, UNPROVIDED);
                    html_markup(html_align($LEFT));
                    html_char(CHAR_quotation, UNPROVIDED);
                    html_markup(html_macros.$html_table_data_valign$.getGlobalValue());
                    html_char(CHAR_quotation, UNPROVIDED);
                    html_markup(html_align($TOP));
                    html_char(CHAR_quotation, UNPROVIDED);
                    html_char(CHAR_greater, UNPROVIDED);
                    final SubLObject _prev_bind_0_$160 = html_macros.$html_safe_print$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind(T, thread);
                        cb_form(value, ZERO_INTEGER, T);
                    } finally {
                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$160, thread);
                    }
                    html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                } finally {
                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$157, thread);
                }
                html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                html_source_readability_terpri(UNPROVIDED);
                cdolist_list_var = cdolist_list_var.rest();
                var = cdolist_list_var.first();
            } 
        } finally {
            html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
        }
        html_markup(html_macros.$html_table_tail$.getGlobalValue());
        return proof;
    }

    public static SubLObject pph_proof_template_vars_to_substitute(final SubLObject template) {
        return $list281;
    }

    public static SubLObject pph_show_proof_template_conclusion(final SubLObject proof, final SubLObject template, final SubLObject mt, final SubLObject proof_index_string, final SubLObject nestedP) {
        final SubLObject proof_conclusion = pph_proof_conclusion(proof, mt);
        pph_show_real_or_quasi_transformation_proof_conclusion(proof_conclusion, nestedP, NIL);
        return proof;
    }

    public static SubLObject debug_construct_proof_views(final SubLObject problem_store_id, SubLObject inference_id, SubLObject inference_answer_id) {
        if (inference_id == UNPROVIDED) {
            inference_id = ZERO_INTEGER;
        }
        if (inference_answer_id == UNPROVIDED) {
            inference_answer_id = ZERO_INTEGER;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != integerp(problem_store_id) : "Types.integerp(problem_store_id) " + "CommonSymbols.NIL != Types.integerp(problem_store_id) " + problem_store_id;
        assert NIL != integerp(inference_id) : "Types.integerp(inference_id) " + "CommonSymbols.NIL != Types.integerp(inference_id) " + inference_id;
        assert NIL != integerp(inference_answer_id) : "Types.integerp(inference_answer_id) " + "CommonSymbols.NIL != Types.integerp(inference_answer_id) " + inference_answer_id;
        final SubLObject inference = inference_datastructures_problem_store.find_inference_by_ids(problem_store_id, inference_id);
        final SubLObject inference_answer = inference_datastructures_inference.find_inference_answer_by_id(inference, inference_answer_id);
        final SubLObject proofs = Sort.sort(inference_answer_get_proofs(inference_answer), symbol_function($sym23$_), INFERENCE_PROOF_GET_DEPTH);
        SubLObject proof_views = NIL;
        html_markup($str284$__DOCTYPE_html_PUBLIC_____W3C__DT);
        if (NIL != html_macros.$html_force_ie_standards_mode$.getDynamicValue(thread)) {
            html_source_readability_terpri(UNPROVIDED);
            html_markup($str285$_meta_http_equiv__X_UA_Compatible);
        }
        html_source_readability_terpri(UNPROVIDED);
        final SubLObject _prev_bind_0 = cyc_file_dependencies.$html_emitted_file_dependencies$.currentBinding(thread);
        try {
            cyc_file_dependencies.$html_emitted_file_dependencies$.bind(cyc_file_dependencies.$html_emitted_file_dependencies$.getDynamicValue(thread) == $UNINITIALIZED ? list(EMPTY_SUBL_OBJECT_ARRAY) : cyc_file_dependencies.$html_emitted_file_dependencies$.getDynamicValue(thread), thread);
            html_markup(html_macros.$html_html_head$.getGlobalValue());
            SubLObject cdolist_list_var = proofs;
            SubLObject proof = NIL;
            proof = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                final SubLObject mt = pph_get_inference_mt(inference);
                final SubLObject v_proof_view = proof_view.construct_inference_proof_view(proof, inference_answer, mt);
                proof_views = cons(v_proof_view, proof_views);
                html_hr(UNPROVIDED, UNPROVIDED);
                cb_form(v_proof_view, UNPROVIDED, UNPROVIDED);
                html_terpri(UNPROVIDED);
                show_proof_view(v_proof_view, UNPROVIDED);
                cdolist_list_var = cdolist_list_var.rest();
                proof = cdolist_list_var.first();
            } 
            html_markup(html_macros.$html_html_tail$.getGlobalValue());
        } finally {
            cyc_file_dependencies.$html_emitted_file_dependencies$.rebind(_prev_bind_0, thread);
        }
        html_source_readability_terpri(UNPROVIDED);
        return proof_views;
    }

    public static SubLObject show_proof_view(SubLObject v_proof_view, SubLObject debugP) {
        if (debugP == UNPROVIDED) {
            debugP = proof_view.proof_view_get_enable_debugP(v_proof_view);
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != subl_promotions.non_negative_integer_p(v_proof_view)) {
            v_proof_view = proof_view.find_proof_view_by_id(v_proof_view);
        }
        assert NIL != proof_view.valid_proof_view_p(v_proof_view) : "proof_view.valid_proof_view_p(v_proof_view) " + "CommonSymbols.NIL != proof_view.valid_proof_view_p(v_proof_view) " + v_proof_view;
        final SubLObject local_state;
        final SubLObject state = local_state = proof_view.find_proof_view_memoization_state(v_proof_view);
        final SubLObject _prev_bind_0 = memoization_state.$memoization_state$.currentBinding(thread);
        try {
            memoization_state.$memoization_state$.bind(local_state, thread);
            final SubLObject original_memoization_process = memoization_state.memoization_state_original_process(local_state);
            try {
                final SubLObject v_class = (NIL != debugP) ? $str288$pf_debug_proof_view : $str289$proof_view;
                html_script_utilities.html_popup_script();
                html_markup(html_macros.$html_div_head$.getGlobalValue());
                html_markup(html_macros.$html_attribute_id$.getGlobalValue());
                html_char(CHAR_quotation, UNPROVIDED);
                html_markup($$$body);
                html_char(CHAR_quotation, UNPROVIDED);
                if (NIL != v_class) {
                    html_markup(html_macros.$html_attribute_class$.getGlobalValue());
                    html_char(CHAR_quotation, UNPROVIDED);
                    html_markup(v_class);
                    html_char(CHAR_quotation, UNPROVIDED);
                }
                html_char(CHAR_greater, UNPROVIDED);
                final SubLObject _prev_bind_0_$161 = html_macros.$html_safe_print$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind(T, thread);
                    proof_view_show_buttons(debugP);
                    if (NIL != debugP) {
                        show_proof_view_params(v_proof_view);
                    }
                    final SubLObject _prev_bind_0_$162 = pph_vars.$pph_displayed_proofs$.currentBinding(thread);
                    try {
                        pph_vars.$pph_displayed_proofs$.bind(NIL, thread);
                        final SubLObject root_entry = proof_view.proof_view_get_root_entry(v_proof_view);
                        final SubLObject children = proof_view.proof_view_entry_get_children(root_entry);
                        final SubLObject query = find($str291$Query_, children, symbol_function(EQUAL), PROOF_VIEW_ENTRY_GET_LABEL, UNPROVIDED, UNPROVIDED);
                        SubLObject tab_entries = NIL;
                        SubLObject cdolist_list_var = proof_view.$proof_view_tab_entry_labels$.getDynamicValue(thread);
                        SubLObject label = NIL;
                        label = cdolist_list_var.first();
                        while (NIL != cdolist_list_var) {
                            final SubLObject entry = find(label, children, symbol_function(EQUAL), PROOF_VIEW_ENTRY_GET_LABEL, UNPROVIDED, UNPROVIDED);
                            if (NIL != entry) {
                                tab_entries = cons(entry, tab_entries);
                            }
                            cdolist_list_var = cdolist_list_var.rest();
                            label = cdolist_list_var.first();
                        } 
                        if (NIL != query) {
                            show_proof_view_entry(query, UNPROVIDED);
                        }
                        html_markup(html_macros.$html_div_head$.getGlobalValue());
                        html_markup(html_macros.$html_attribute_id$.getGlobalValue());
                        html_char(CHAR_quotation, UNPROVIDED);
                        html_markup($$$justifications);
                        html_char(CHAR_quotation, UNPROVIDED);
                        html_markup(html_macros.$html_attribute_class$.getGlobalValue());
                        html_char(CHAR_quotation, UNPROVIDED);
                        html_markup($str294$yui_navset);
                        html_char(CHAR_quotation, UNPROVIDED);
                        html_char(CHAR_greater, UNPROVIDED);
                        final SubLObject _prev_bind_0_$163 = html_macros.$html_safe_print$.currentBinding(thread);
                        try {
                            html_macros.$html_safe_print$.bind(T, thread);
                            final SubLObject error_output = proof_view.proof_view_get_error_output(v_proof_view);
                            final SubLObject show_error_outputP = string_utilities.non_empty_stringP(error_output);
                            html_markup(html_macros.$html_unordered_list_head$.getGlobalValue());
                            html_markup(html_macros.$html_attribute_class$.getGlobalValue());
                            html_char(CHAR_quotation, UNPROVIDED);
                            html_markup($str295$yui_nav);
                            html_char(CHAR_quotation, UNPROVIDED);
                            html_char(CHAR_greater, UNPROVIDED);
                            final SubLObject _prev_bind_0_$164 = html_macros.$html_safe_print$.currentBinding(thread);
                            try {
                                html_macros.$html_safe_print$.bind(T, thread);
                                final SubLObject favored_entry = list_utilities.find_if_not($sym296$SUPPRESS_PROOF_VIEW_SECTION_WITH_ROOT_, tab_entries, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                SubLObject cdolist_list_var2 = tab_entries;
                                SubLObject tab_entry = NIL;
                                tab_entry = cdolist_list_var2.first();
                                while (NIL != cdolist_list_var2) {
                                    if (NIL == proof_view_populator.suppress_proof_view_section_with_rootP(tab_entry)) {
                                        final SubLObject elt_href = cconcatenate($str297$_, proof_view_tab_id_for_entry(tab_entry));
                                        final SubLObject v_class_$165 = (tab_entry.equal(favored_entry)) ? $$$selected : $str41$;
                                        html_markup(html_macros.$html_list_item_head$.getGlobalValue());
                                        if (NIL != v_class_$165) {
                                            html_markup(html_macros.$html_attribute_class$.getGlobalValue());
                                            html_char(CHAR_quotation, UNPROVIDED);
                                            html_markup(v_class_$165);
                                            html_char(CHAR_quotation, UNPROVIDED);
                                        }
                                        html_char(CHAR_greater, UNPROVIDED);
                                        final SubLObject _prev_bind_0_$165 = html_macros.$html_safe_print$.currentBinding(thread);
                                        try {
                                            html_macros.$html_safe_print$.bind(T, thread);
                                            html_markup(html_macros.$html_anchor_head$.getGlobalValue());
                                            html_markup(html_macros.$html_anchor_href$.getGlobalValue());
                                            html_char(CHAR_quotation, UNPROVIDED);
                                            html_markup(elt_href);
                                            html_char(CHAR_quotation, UNPROVIDED);
                                            html_char(CHAR_greater, UNPROVIDED);
                                            final SubLObject _prev_bind_0_$166 = html_macros.$html_safe_print$.currentBinding(thread);
                                            try {
                                                html_macros.$html_safe_print$.bind(T, thread);
                                                html_markup(html_macros.$html_emphasized_head$.getGlobalValue());
                                                format(html_macros.$html_stream$.getDynamicValue(thread), proof_view.proof_view_entry_get_label(tab_entry));
                                                html_markup(html_macros.$html_emphasized_tail$.getGlobalValue());
                                            } finally {
                                                html_macros.$html_safe_print$.rebind(_prev_bind_0_$166, thread);
                                            }
                                            html_markup(html_macros.$html_anchor_tail$.getGlobalValue());
                                        } finally {
                                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$165, thread);
                                        }
                                        html_markup(html_macros.$html_list_item_tail$.getGlobalValue());
                                        proof_view_populator.proof_view_entry_remove_label(tab_entry);
                                    }
                                    cdolist_list_var2 = cdolist_list_var2.rest();
                                    tab_entry = cdolist_list_var2.first();
                                } 
                                if (NIL != show_error_outputP) {
                                    final SubLObject elt_href = cconcatenate($str297$_, $$$tabErrorOutput);
                                    html_markup(html_macros.$html_list_item_head$.getGlobalValue());
                                    html_char(CHAR_greater, UNPROVIDED);
                                    final SubLObject _prev_bind_0_$167 = html_macros.$html_safe_print$.currentBinding(thread);
                                    try {
                                        html_macros.$html_safe_print$.bind(T, thread);
                                        html_markup(html_macros.$html_anchor_head$.getGlobalValue());
                                        html_markup(html_macros.$html_anchor_href$.getGlobalValue());
                                        html_char(CHAR_quotation, UNPROVIDED);
                                        html_markup(elt_href);
                                        html_char(CHAR_quotation, UNPROVIDED);
                                        html_char(CHAR_greater, UNPROVIDED);
                                        final SubLObject _prev_bind_0_$168 = html_macros.$html_safe_print$.currentBinding(thread);
                                        try {
                                            html_macros.$html_safe_print$.bind(T, thread);
                                            html_markup(html_macros.$html_emphasized_head$.getGlobalValue());
                                            format(html_macros.$html_stream$.getDynamicValue(thread), $$$Debugging_Messages);
                                            html_markup(html_macros.$html_emphasized_tail$.getGlobalValue());
                                        } finally {
                                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$168, thread);
                                        }
                                        html_markup(html_macros.$html_anchor_tail$.getGlobalValue());
                                    } finally {
                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$167, thread);
                                    }
                                    html_markup(html_macros.$html_list_item_tail$.getGlobalValue());
                                }
                            } finally {
                                html_macros.$html_safe_print$.rebind(_prev_bind_0_$164, thread);
                            }
                            html_markup(html_macros.$html_unordered_list_tail$.getGlobalValue());
                            html_markup(html_macros.$html_div_head$.getGlobalValue());
                            html_markup(html_macros.$html_attribute_class$.getGlobalValue());
                            html_char(CHAR_quotation, UNPROVIDED);
                            html_markup($str301$yui_content);
                            html_char(CHAR_quotation, UNPROVIDED);
                            html_char(CHAR_greater, UNPROVIDED);
                            final SubLObject _prev_bind_0_$169 = html_macros.$html_safe_print$.currentBinding(thread);
                            try {
                                html_macros.$html_safe_print$.bind(T, thread);
                                SubLObject list_var = NIL;
                                SubLObject tab_entry2 = NIL;
                                SubLObject tab_num = NIL;
                                list_var = tab_entries;
                                tab_entry2 = list_var.first();
                                for (tab_num = ZERO_INTEGER; NIL != list_var; list_var = list_var.rest() , tab_entry2 = list_var.first() , tab_num = add(ONE_INTEGER, tab_num)) {
                                    if (NIL == proof_view_populator.suppress_proof_view_section_with_rootP(tab_entry2)) {
                                        final SubLObject tab_id = proof_view_tab_id_for_entry(tab_entry2);
                                        html_markup(html_macros.$html_div_head$.getGlobalValue());
                                        if (NIL != tab_id) {
                                            html_markup(html_macros.$html_attribute_id$.getGlobalValue());
                                            html_char(CHAR_quotation, UNPROVIDED);
                                            html_markup(tab_id);
                                            html_char(CHAR_quotation, UNPROVIDED);
                                        }
                                        html_char(CHAR_greater, UNPROVIDED);
                                        final SubLObject _prev_bind_0_$170 = html_macros.$html_safe_print$.currentBinding(thread);
                                        try {
                                            html_macros.$html_safe_print$.bind(T, thread);
                                            show_proof_view_entry(tab_entry2, UNPROVIDED);
                                        } finally {
                                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$170, thread);
                                        }
                                        html_markup(html_macros.$html_div_tail$.getGlobalValue());
                                    }
                                }
                                if (NIL != show_error_outputP) {
                                    final SubLObject tab_id = $$$tabErrorOutput;
                                    html_markup(html_macros.$html_div_head$.getGlobalValue());
                                    if (NIL != tab_id) {
                                        html_markup(html_macros.$html_attribute_id$.getGlobalValue());
                                        html_char(CHAR_quotation, UNPROVIDED);
                                        html_markup(tab_id);
                                        html_char(CHAR_quotation, UNPROVIDED);
                                    }
                                    html_char(CHAR_greater, UNPROVIDED);
                                    final SubLObject _prev_bind_0_$171 = html_macros.$html_safe_print$.currentBinding(thread);
                                    try {
                                        html_macros.$html_safe_print$.bind(T, thread);
                                        show_proof_view_error_output(error_output);
                                    } finally {
                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$171, thread);
                                    }
                                    html_markup(html_macros.$html_div_tail$.getGlobalValue());
                                }
                            } finally {
                                html_macros.$html_safe_print$.rebind(_prev_bind_0_$169, thread);
                            }
                            html_markup(html_macros.$html_div_tail$.getGlobalValue());
                            SubLObject cdolist_list_var3 = children;
                            SubLObject child = NIL;
                            child = cdolist_list_var3.first();
                            while (NIL != cdolist_list_var3) {
                                if (((!query.eql(child)) && (NIL == subl_promotions.memberP(child, tab_entries, UNPROVIDED, UNPROVIDED))) && (NIL == proof_view_populator.suppress_proof_view_section_with_rootP(child))) {
                                    show_proof_view_entry(child, UNPROVIDED);
                                }
                                cdolist_list_var3 = cdolist_list_var3.rest();
                                child = cdolist_list_var3.first();
                            } 
                            if (NIL != debugP) {
                                html_markup(html_macros.$html_div_head$.getGlobalValue());
                                html_markup(html_macros.$html_attribute_id$.getGlobalValue());
                                html_char(CHAR_quotation, UNPROVIDED);
                                html_markup($$$pfFilteredItems);
                                html_char(CHAR_quotation, UNPROVIDED);
                                html_char(CHAR_greater, UNPROVIDED);
                                final SubLObject _prev_bind_0_$172 = html_macros.$html_safe_print$.currentBinding(thread);
                                try {
                                    html_macros.$html_safe_print$.bind(T, thread);
                                    show_proof_view_filtered_items(v_proof_view);
                                } finally {
                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$172, thread);
                                }
                                html_markup(html_macros.$html_div_tail$.getGlobalValue());
                            }
                        } finally {
                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$163, thread);
                        }
                        html_markup(html_macros.$html_div_tail$.getGlobalValue());
                    } finally {
                        pph_vars.$pph_displayed_proofs$.rebind(_prev_bind_0_$162, thread);
                    }
                } finally {
                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$161, thread);
                }
                html_markup(html_macros.$html_div_tail$.getGlobalValue());
            } finally {
                final SubLObject _prev_bind_0_$173 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    memoization_state.memoization_state_possibly_clear_original_process(local_state, original_memoization_process);
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$173, thread);
                }
            }
        } finally {
            memoization_state.$memoization_state$.rebind(_prev_bind_0, thread);
        }
        proof_view.proof_view_set_displayed_universal_time(v_proof_view, UNPROVIDED);
        return NIL;
    }

    public static SubLObject proof_view_tab_id_for_entry_internal(final SubLObject entry) {
        final SubLObject label = list_utilities.remove_if_not(symbol_function(ALPHANUMERIC_CHAR_P), proof_view.proof_view_entry_get_label(entry), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        return cconcatenate($$$tab, label);
    }

    public static SubLObject proof_view_tab_id_for_entry(final SubLObject entry) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
        SubLObject caching_state = NIL;
        if (NIL == v_memoization_state) {
            return proof_view_tab_id_for_entry_internal(entry);
        }
        caching_state = memoization_state.memoization_state_lookup(v_memoization_state, PROOF_VIEW_TAB_ID_FOR_ENTRY, UNPROVIDED);
        if (NIL == caching_state) {
            caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), PROOF_VIEW_TAB_ID_FOR_ENTRY, ONE_INTEGER, NIL, EQL, UNPROVIDED);
            memoization_state.memoization_state_put(v_memoization_state, PROOF_VIEW_TAB_ID_FOR_ENTRY, caching_state);
        }
        SubLObject results = memoization_state.caching_state_lookup(caching_state, entry, memoization_state.$memoized_item_not_found$.getGlobalValue());
        if (results.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            results = arg2(thread.resetMultipleValues(), multiple_value_list(proof_view_tab_id_for_entry_internal(entry)));
            memoization_state.caching_state_put(caching_state, entry, results, UNPROVIDED);
        }
        return memoization_state.caching_results(results);
    }

    public static SubLObject show_proof_view_error_output(final SubLObject error_output) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != stringp(error_output) : "Types.stringp(error_output) " + "CommonSymbols.NIL != Types.stringp(error_output) " + error_output;
        html_macros.verify_not_within_html_pre();
        html_markup(html_macros.$html_preformatted_head$.getGlobalValue());
        final SubLObject _prev_bind_0 = html_macros.$within_html_pre$.currentBinding(thread);
        try {
            html_macros.$within_html_pre$.bind(T, thread);
            html_princ(error_output);
        } finally {
            html_macros.$within_html_pre$.rebind(_prev_bind_0, thread);
        }
        html_markup(html_macros.$html_preformatted_tail$.getGlobalValue());
        return error_output;
    }

    public static SubLObject proof_view_show_buttons(final SubLObject include_debugP) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        html_markup(html_macros.$html_div_head$.getGlobalValue());
        html_markup(html_macros.$html_attribute_id$.getGlobalValue());
        html_char(CHAR_quotation, UNPROVIDED);
        html_markup($str307$pf_buttonbar);
        html_char(CHAR_quotation, UNPROVIDED);
        html_char(CHAR_greater, UNPROVIDED);
        final SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
        try {
            html_macros.$html_safe_print$.bind(T, thread);
            html_markup(html_macros.$html_div_head$.getGlobalValue());
            html_markup(html_macros.$html_attribute_class$.getGlobalValue());
            html_char(CHAR_quotation, UNPROVIDED);
            html_markup($$$bd);
            html_char(CHAR_quotation, UNPROVIDED);
            html_char(CHAR_greater, UNPROVIDED);
            final SubLObject _prev_bind_0_$175 = html_macros.$html_safe_print$.currentBinding(thread);
            try {
                html_macros.$html_safe_print$.bind(T, thread);
                if (NIL != include_debugP) {
                    html_markup(html_macros.$html_span_head$.getGlobalValue());
                    html_markup(html_macros.$html_attribute_id$.getGlobalValue());
                    html_char(CHAR_quotation, UNPROVIDED);
                    html_markup($str309$pf_show_debugging);
                    html_char(CHAR_quotation, UNPROVIDED);
                    html_char(CHAR_greater, UNPROVIDED);
                    final SubLObject _prev_bind_0_$176 = html_macros.$html_safe_print$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind(T, thread);
                        html_markup(html_macros.$html_input_head$.getGlobalValue());
                        html_markup(html_macros.$html_input_type$.getGlobalValue());
                        html_char(CHAR_quotation, UNPROVIDED);
                        html_markup(html_macros.$html_input_checkbox$.getGlobalValue());
                        html_char(CHAR_quotation, UNPROVIDED);
                        html_markup(html_macros.$html_attribute_id$.getGlobalValue());
                        html_char(CHAR_quotation, UNPROVIDED);
                        html_markup($str310$pf_show_debugging_checkbox);
                        html_char(CHAR_quotation, UNPROVIDED);
                        html_markup(html_macros.$html_input_name$.getGlobalValue());
                        html_char(CHAR_quotation, UNPROVIDED);
                        html_markup($str311$Debugging_);
                        html_char(CHAR_quotation, UNPROVIDED);
                        html_simple_attribute(html_macros.$html_input_checked$.getGlobalValue());
                        html_markup(html_macros.$html_event_attribute_onclick$.getGlobalValue());
                        html_char(CHAR_quotation, UNPROVIDED);
                        html_markup($str312$toggleDebug_this___body___);
                        html_char(CHAR_quotation, UNPROVIDED);
                        if (NIL != html_macros.$html_input_disabledP$.getDynamicValue(thread)) {
                            html_simple_attribute(html_macros.$html_input_disabled$.getGlobalValue());
                        }
                        html_char(CHAR_greater, UNPROVIDED);
                        format(html_macros.$html_stream$.getDynamicValue(thread), $str311$Debugging_);
                        html_indent(TWO_INTEGER);
                    } finally {
                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$176, thread);
                    }
                    html_markup(html_macros.$html_span_tail$.getGlobalValue());
                }
                html_markup(html_macros.$html_span_head$.getGlobalValue());
                html_markup(html_macros.$html_attribute_id$.getGlobalValue());
                html_char(CHAR_quotation, UNPROVIDED);
                html_markup($str313$pf_show_cycl_button);
                html_char(CHAR_quotation, UNPROVIDED);
                html_char(CHAR_greater, UNPROVIDED);
                final SubLObject _prev_bind_0_$177 = html_macros.$html_safe_print$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind(T, thread);
                    html_markup(html_macros.$html_input_head$.getGlobalValue());
                    html_markup(html_macros.$html_input_type$.getGlobalValue());
                    html_char(CHAR_quotation, UNPROVIDED);
                    html_markup(html_macros.$html_input_checkbox$.getGlobalValue());
                    html_char(CHAR_quotation, UNPROVIDED);
                    html_markup(html_macros.$html_attribute_id$.getGlobalValue());
                    html_char(CHAR_quotation, UNPROVIDED);
                    html_markup($str314$pf_show_cycl_checkbox);
                    html_char(CHAR_quotation, UNPROVIDED);
                    html_markup(html_macros.$html_input_name$.getGlobalValue());
                    html_char(CHAR_quotation, UNPROVIDED);
                    html_markup($str315$show_cycl);
                    html_char(CHAR_quotation, UNPROVIDED);
                    html_markup(html_macros.$html_event_attribute_onclick$.getGlobalValue());
                    html_char(CHAR_quotation, UNPROVIDED);
                    html_markup($str316$toggleCycLVisible_this___body___);
                    html_char(CHAR_quotation, UNPROVIDED);
                    if (NIL != html_macros.$html_input_disabledP$.getDynamicValue(thread)) {
                        html_simple_attribute(html_macros.$html_input_disabled$.getGlobalValue());
                    }
                    html_char(CHAR_greater, UNPROVIDED);
                    format(html_macros.$html_stream$.getDynamicValue(thread), $$$Show_CycL);
                } finally {
                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$177, thread);
                }
                html_markup(html_macros.$html_span_tail$.getGlobalValue());
            } finally {
                html_macros.$html_safe_print$.rebind(_prev_bind_0_$175, thread);
            }
            html_markup(html_macros.$html_div_tail$.getGlobalValue());
        } finally {
            html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
        }
        html_markup(html_macros.$html_div_tail$.getGlobalValue());
        return NIL;
    }

    public static SubLObject show_proof_view_params(final SubLObject v_proof_view) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        html_markup(html_macros.$html_table_head$.getGlobalValue());
        html_markup(html_macros.$html_attribute_class$.getGlobalValue());
        html_char(CHAR_quotation, UNPROVIDED);
        html_markup($str129$pf_indent);
        html_char(CHAR_quotation, UNPROVIDED);
        html_markup(html_macros.$html_table_border$.getGlobalValue());
        html_char(CHAR_quotation, UNPROVIDED);
        html_markup(ZERO_INTEGER);
        html_char(CHAR_quotation, UNPROVIDED);
        html_char(CHAR_greater, UNPROVIDED);
        final SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
        try {
            html_macros.$html_safe_print$.bind(T, thread);
            html_markup(html_macros.$html_table_row_head$.getGlobalValue());
            html_char(CHAR_greater, UNPROVIDED);
            final SubLObject _prev_bind_0_$178 = html_macros.$html_safe_print$.currentBinding(thread);
            try {
                html_macros.$html_safe_print$.bind(T, thread);
                html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                html_markup(html_macros.$html_attribute_class$.getGlobalValue());
                html_char(CHAR_quotation, UNPROVIDED);
                html_markup($str130$pf_indent_td);
                html_char(CHAR_quotation, UNPROVIDED);
                html_char(CHAR_greater, UNPROVIDED);
                final SubLObject _prev_bind_0_$179 = html_macros.$html_safe_print$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind(T, thread);
                } finally {
                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$179, thread);
                }
                html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                html_char(CHAR_greater, UNPROVIDED);
                final SubLObject _prev_bind_0_$180 = html_macros.$html_safe_print$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind(T, thread);
                    html_markup(html_macros.$html_table_head$.getGlobalValue());
                    html_markup(html_macros.$html_attribute_class$.getGlobalValue());
                    html_char(CHAR_quotation, UNPROVIDED);
                    html_markup($str318$pf_parameters);
                    html_char(CHAR_quotation, UNPROVIDED);
                    html_char(CHAR_greater, UNPROVIDED);
                    final SubLObject _prev_bind_0_$181 = html_macros.$html_safe_print$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind(T, thread);
                        html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                        html_char(CHAR_greater, UNPROVIDED);
                        final SubLObject _prev_bind_0_$182 = html_macros.$html_safe_print$.currentBinding(thread);
                        try {
                            html_macros.$html_safe_print$.bind(T, thread);
                            final SubLObject bgcolor = html_macros.$html_color_cyc_logo_lighter_violet$.getGlobalValue();
                            html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                            html_markup(html_macros.$html_table_data_colspan$.getGlobalValue());
                            html_char(CHAR_quotation, UNPROVIDED);
                            html_markup(TWO_INTEGER);
                            html_char(CHAR_quotation, UNPROVIDED);
                            if (NIL != bgcolor) {
                                html_markup(html_macros.$html_table_data_bgcolor$.getGlobalValue());
                                html_char(CHAR_quotation, UNPROVIDED);
                                html_markup(bgcolor);
                                html_char(CHAR_quotation, UNPROVIDED);
                            }
                            html_char(CHAR_greater, UNPROVIDED);
                            final SubLObject _prev_bind_0_$183 = html_macros.$html_safe_print$.currentBinding(thread);
                            try {
                                html_macros.$html_safe_print$.bind(T, thread);
                                format(html_macros.$html_stream$.getDynamicValue(thread), $$$Parameters);
                            } finally {
                                html_macros.$html_safe_print$.rebind(_prev_bind_0_$183, thread);
                            }
                            html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                        } finally {
                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$182, thread);
                        }
                        html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                        html_source_readability_terpri(UNPROVIDED);
                        SubLObject cdolist_list_var = proof_view.proof_view_params(v_proof_view);
                        SubLObject cons = NIL;
                        cons = cdolist_list_var.first();
                        while (NIL != cdolist_list_var) {
                            SubLObject current;
                            final SubLObject datum = current = cons;
                            SubLObject param = NIL;
                            SubLObject value = NIL;
                            destructuring_bind_must_consp(current, datum, $list320);
                            param = current.first();
                            current = value = current.rest();
                            html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                            html_char(CHAR_greater, UNPROVIDED);
                            final SubLObject _prev_bind_0_$184 = html_macros.$html_safe_print$.currentBinding(thread);
                            try {
                                html_macros.$html_safe_print$.bind(T, thread);
                                html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                html_markup(html_macros.$html_table_data_align$.getGlobalValue());
                                html_char(CHAR_quotation, UNPROVIDED);
                                html_markup(html_align($$$right));
                                html_char(CHAR_quotation, UNPROVIDED);
                                html_char(CHAR_greater, UNPROVIDED);
                                final SubLObject _prev_bind_0_$185 = html_macros.$html_safe_print$.currentBinding(thread);
                                try {
                                    html_macros.$html_safe_print$.bind(T, thread);
                                    html_princ(param);
                                } finally {
                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$185, thread);
                                }
                                html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                html_markup(html_macros.$html_table_data_align$.getGlobalValue());
                                html_char(CHAR_quotation, UNPROVIDED);
                                html_markup(html_align($$$left));
                                html_char(CHAR_quotation, UNPROVIDED);
                                html_char(CHAR_greater, UNPROVIDED);
                                final SubLObject _prev_bind_0_$186 = html_macros.$html_safe_print$.currentBinding(thread);
                                try {
                                    html_macros.$html_safe_print$.bind(T, thread);
                                    cb_form(value, UNPROVIDED, UNPROVIDED);
                                } finally {
                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$186, thread);
                                }
                                html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                            } finally {
                                html_macros.$html_safe_print$.rebind(_prev_bind_0_$184, thread);
                            }
                            html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                            html_source_readability_terpri(UNPROVIDED);
                            cdolist_list_var = cdolist_list_var.rest();
                            cons = cdolist_list_var.first();
                        } 
                    } finally {
                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$181, thread);
                    }
                    html_markup(html_macros.$html_table_tail$.getGlobalValue());
                } finally {
                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$180, thread);
                }
                html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
            } finally {
                html_macros.$html_safe_print$.rebind(_prev_bind_0_$178, thread);
            }
            html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
            html_source_readability_terpri(UNPROVIDED);
        } finally {
            html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
        }
        html_markup(html_macros.$html_table_tail$.getGlobalValue());
        return NIL;
    }

    public static SubLObject show_proof_view_toc() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        html_markup(html_macros.$html_table_head$.getGlobalValue());
        html_markup(html_macros.$html_attribute_class$.getGlobalValue());
        html_char(CHAR_quotation, UNPROVIDED);
        html_markup($str129$pf_indent);
        html_char(CHAR_quotation, UNPROVIDED);
        html_markup(html_macros.$html_table_border$.getGlobalValue());
        html_char(CHAR_quotation, UNPROVIDED);
        html_markup(ZERO_INTEGER);
        html_char(CHAR_quotation, UNPROVIDED);
        html_char(CHAR_greater, UNPROVIDED);
        final SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
        try {
            html_macros.$html_safe_print$.bind(T, thread);
            html_markup(html_macros.$html_table_row_head$.getGlobalValue());
            html_char(CHAR_greater, UNPROVIDED);
            final SubLObject _prev_bind_0_$187 = html_macros.$html_safe_print$.currentBinding(thread);
            try {
                html_macros.$html_safe_print$.bind(T, thread);
                html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                html_markup(html_macros.$html_attribute_class$.getGlobalValue());
                html_char(CHAR_quotation, UNPROVIDED);
                html_markup($str130$pf_indent_td);
                html_char(CHAR_quotation, UNPROVIDED);
                html_char(CHAR_greater, UNPROVIDED);
                final SubLObject _prev_bind_0_$188 = html_macros.$html_safe_print$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind(T, thread);
                } finally {
                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$188, thread);
                }
                html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                html_char(CHAR_greater, UNPROVIDED);
                final SubLObject _prev_bind_0_$189 = html_macros.$html_safe_print$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind(T, thread);
                    html_markup(html_macros.$html_table_head$.getGlobalValue());
                    html_markup(html_macros.$html_attribute_class$.getGlobalValue());
                    html_char(CHAR_quotation, UNPROVIDED);
                    html_markup($str323$pf_toc);
                    html_char(CHAR_quotation, UNPROVIDED);
                    html_char(CHAR_greater, UNPROVIDED);
                    final SubLObject _prev_bind_0_$190 = html_macros.$html_safe_print$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind(T, thread);
                        html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                        html_char(CHAR_greater, UNPROVIDED);
                        final SubLObject _prev_bind_0_$191 = html_macros.$html_safe_print$.currentBinding(thread);
                        try {
                            html_macros.$html_safe_print$.bind(T, thread);
                            final SubLObject bgcolor = html_macros.$html_color_cyc_logo_lighter_violet$.getGlobalValue();
                            html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                            if (NIL != bgcolor) {
                                html_markup(html_macros.$html_table_data_bgcolor$.getGlobalValue());
                                html_char(CHAR_quotation, UNPROVIDED);
                                html_markup(bgcolor);
                                html_char(CHAR_quotation, UNPROVIDED);
                            }
                            html_char(CHAR_greater, UNPROVIDED);
                            final SubLObject _prev_bind_0_$192 = html_macros.$html_safe_print$.currentBinding(thread);
                            try {
                                html_macros.$html_safe_print$.bind(T, thread);
                                format(html_macros.$html_stream$.getDynamicValue(thread), $$$Quick_Links);
                            } finally {
                                html_macros.$html_safe_print$.rebind(_prev_bind_0_$192, thread);
                            }
                            html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                        } finally {
                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$191, thread);
                        }
                        html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                        html_source_readability_terpri(UNPROVIDED);
                        SubLObject cdolist_list_var = $list326;
                        SubLObject cons = NIL;
                        cons = cdolist_list_var.first();
                        while (NIL != cdolist_list_var) {
                            SubLObject current;
                            final SubLObject datum = current = cons;
                            SubLObject anchor = NIL;
                            SubLObject linktext = NIL;
                            destructuring_bind_must_consp(current, datum, $list325);
                            anchor = current.first();
                            current = linktext = current.rest();
                            html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                            html_char(CHAR_greater, UNPROVIDED);
                            final SubLObject _prev_bind_0_$193 = html_macros.$html_safe_print$.currentBinding(thread);
                            try {
                                html_macros.$html_safe_print$.bind(T, thread);
                                html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                html_char(CHAR_greater, UNPROVIDED);
                                final SubLObject _prev_bind_0_$194 = html_macros.$html_safe_print$.currentBinding(thread);
                                try {
                                    html_macros.$html_safe_print$.bind(T, thread);
                                    html_markup(html_macros.$html_anchor_head$.getGlobalValue());
                                    html_markup(html_macros.$html_anchor_href$.getGlobalValue());
                                    html_char(CHAR_quotation, UNPROVIDED);
                                    html_markup(anchor);
                                    html_char(CHAR_quotation, UNPROVIDED);
                                    html_char(CHAR_greater, UNPROVIDED);
                                    final SubLObject _prev_bind_0_$195 = html_macros.$html_safe_print$.currentBinding(thread);
                                    try {
                                        html_macros.$html_safe_print$.bind(T, thread);
                                        html_princ(linktext);
                                    } finally {
                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$195, thread);
                                    }
                                    html_markup(html_macros.$html_anchor_tail$.getGlobalValue());
                                } finally {
                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$194, thread);
                                }
                                html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                            } finally {
                                html_macros.$html_safe_print$.rebind(_prev_bind_0_$193, thread);
                            }
                            html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                            html_source_readability_terpri(UNPROVIDED);
                            cdolist_list_var = cdolist_list_var.rest();
                            cons = cdolist_list_var.first();
                        } 
                    } finally {
                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$190, thread);
                    }
                    html_markup(html_macros.$html_table_tail$.getGlobalValue());
                } finally {
                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$189, thread);
                }
                html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
            } finally {
                html_macros.$html_safe_print$.rebind(_prev_bind_0_$187, thread);
            }
            html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
            html_source_readability_terpri(UNPROVIDED);
        } finally {
            html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
        }
        html_markup(html_macros.$html_table_tail$.getGlobalValue());
        return NIL;
    }

    public static SubLObject maybe_insert_proof_view_entry_anchor(final SubLObject proof_view_entry) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject label = proof_view.proof_view_entry_get_label(proof_view_entry);
        SubLObject name = NIL;
        if (label.equal($str291$Query_)) {
            name = $$$query;
        } else
            if (label.equal($$$Root)) {
                name = $$$root;
            } else
                if (label.equal($str330$Key_Rules_)) {
                    name = $$$rules;
                } else
                    if (label.equal($str332$Because_)) {
                        name = $$$because;
                    } else
                        if (label.equal($str334$Detailed_Justification_)) {
                            name = $$$details;
                        } else
                            if (label.equal($str336$Linear_Justification_)) {
                                name = $$$linear;
                            }





        if (NIL != name) {
            html_markup(html_macros.$html_anchor_head$.getGlobalValue());
            if (NIL != name) {
                html_markup(html_macros.$html_anchor_name$.getGlobalValue());
                html_char(CHAR_quotation, UNPROVIDED);
                html_markup(name);
                html_char(CHAR_quotation, UNPROVIDED);
            }
            html_char(CHAR_greater, UNPROVIDED);
            final SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
            try {
                html_macros.$html_safe_print$.bind(T, thread);
            } finally {
                html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
            }
            html_markup(html_macros.$html_anchor_tail$.getGlobalValue());
        }
        return name;
    }

    public static SubLObject show_proof_view_filtered_items_row(final SubLObject macroform, final SubLObject environment) {
        final SubLObject datum = macroform.rest();
        final SubLObject body;
        final SubLObject current = body = datum;
        return list(HTML_TABLE_ROW, list(HTML_FANCY_TABLE_DATA, NIL, list(PPH_PROOF_INDENT, listS(HTML_TABLE, $list340, append(body, NIL)))));
    }

    public static SubLObject show_proof_view_filtered_items(final SubLObject v_proof_view) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject filtered_items = proof_view.proof_view_get_filtered_items(v_proof_view);
        if ((NIL != filtered_items) && (NIL == dictionary.dictionary_empty_p(filtered_items))) {
            html_markup(html_macros.$html_anchor_head$.getGlobalValue());
            html_markup(html_macros.$html_anchor_name$.getGlobalValue());
            html_char(CHAR_quotation, UNPROVIDED);
            html_markup($$$filtered);
            html_char(CHAR_quotation, UNPROVIDED);
            html_char(CHAR_greater, UNPROVIDED);
            final SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
            try {
                html_macros.$html_safe_print$.bind(T, thread);
                html_markup(html_macros.$html_table_head$.getGlobalValue());
                html_markup(html_macros.$html_attribute_class$.getGlobalValue());
                html_char(CHAR_quotation, UNPROVIDED);
                html_markup($str129$pf_indent);
                html_char(CHAR_quotation, UNPROVIDED);
                html_markup(html_macros.$html_table_border$.getGlobalValue());
                html_char(CHAR_quotation, UNPROVIDED);
                html_markup(ZERO_INTEGER);
                html_char(CHAR_quotation, UNPROVIDED);
                html_char(CHAR_greater, UNPROVIDED);
                final SubLObject _prev_bind_0_$196 = html_macros.$html_safe_print$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind(T, thread);
                    html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                    html_char(CHAR_greater, UNPROVIDED);
                    final SubLObject _prev_bind_0_$197 = html_macros.$html_safe_print$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind(T, thread);
                        html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                        html_markup(html_macros.$html_attribute_class$.getGlobalValue());
                        html_char(CHAR_quotation, UNPROVIDED);
                        html_markup($str130$pf_indent_td);
                        html_char(CHAR_quotation, UNPROVIDED);
                        html_char(CHAR_greater, UNPROVIDED);
                        final SubLObject _prev_bind_0_$198 = html_macros.$html_safe_print$.currentBinding(thread);
                        try {
                            html_macros.$html_safe_print$.bind(T, thread);
                        } finally {
                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$198, thread);
                        }
                        html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                        html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                        html_char(CHAR_greater, UNPROVIDED);
                        final SubLObject _prev_bind_0_$199 = html_macros.$html_safe_print$.currentBinding(thread);
                        try {
                            html_macros.$html_safe_print$.bind(T, thread);
                            html_markup(html_macros.$html_table_head$.getGlobalValue());
                            html_markup(html_macros.$html_table_border$.getGlobalValue());
                            html_char(CHAR_quotation, UNPROVIDED);
                            html_markup(ONE_INTEGER);
                            html_char(CHAR_quotation, UNPROVIDED);
                            html_char(CHAR_greater, UNPROVIDED);
                            final SubLObject _prev_bind_0_$200 = html_macros.$html_safe_print$.currentBinding(thread);
                            try {
                                html_macros.$html_safe_print$.bind(T, thread);
                                html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                                html_char(CHAR_greater, UNPROVIDED);
                                final SubLObject _prev_bind_0_$201 = html_macros.$html_safe_print$.currentBinding(thread);
                                try {
                                    html_macros.$html_safe_print$.bind(T, thread);
                                    html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                    html_char(CHAR_greater, UNPROVIDED);
                                    final SubLObject _prev_bind_0_$202 = html_macros.$html_safe_print$.currentBinding(thread);
                                    try {
                                        html_macros.$html_safe_print$.bind(T, thread);
                                        format(html_macros.$html_stream$.getDynamicValue(thread), $$$Filtered_Supports);
                                    } finally {
                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$202, thread);
                                    }
                                    html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                } finally {
                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$201, thread);
                                }
                                html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                                html_source_readability_terpri(UNPROVIDED);
                                html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                                html_char(CHAR_greater, UNPROVIDED);
                                final SubLObject _prev_bind_0_$203 = html_macros.$html_safe_print$.currentBinding(thread);
                                try {
                                    html_macros.$html_safe_print$.bind(T, thread);
                                    html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                    html_char(CHAR_greater, UNPROVIDED);
                                    final SubLObject _prev_bind_0_$204 = html_macros.$html_safe_print$.currentBinding(thread);
                                    try {
                                        html_macros.$html_safe_print$.bind(T, thread);
                                        html_markup(html_macros.$html_table_head$.getGlobalValue());
                                        html_markup(html_macros.$html_attribute_class$.getGlobalValue());
                                        html_char(CHAR_quotation, UNPROVIDED);
                                        html_markup($str129$pf_indent);
                                        html_char(CHAR_quotation, UNPROVIDED);
                                        html_markup(html_macros.$html_table_border$.getGlobalValue());
                                        html_char(CHAR_quotation, UNPROVIDED);
                                        html_markup(ZERO_INTEGER);
                                        html_char(CHAR_quotation, UNPROVIDED);
                                        html_char(CHAR_greater, UNPROVIDED);
                                        final SubLObject _prev_bind_0_$205 = html_macros.$html_safe_print$.currentBinding(thread);
                                        try {
                                            html_macros.$html_safe_print$.bind(T, thread);
                                            html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                                            html_char(CHAR_greater, UNPROVIDED);
                                            final SubLObject _prev_bind_0_$206 = html_macros.$html_safe_print$.currentBinding(thread);
                                            try {
                                                html_macros.$html_safe_print$.bind(T, thread);
                                                html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                                html_markup(html_macros.$html_attribute_class$.getGlobalValue());
                                                html_char(CHAR_quotation, UNPROVIDED);
                                                html_markup($str130$pf_indent_td);
                                                html_char(CHAR_quotation, UNPROVIDED);
                                                html_char(CHAR_greater, UNPROVIDED);
                                                final SubLObject _prev_bind_0_$207 = html_macros.$html_safe_print$.currentBinding(thread);
                                                try {
                                                    html_macros.$html_safe_print$.bind(T, thread);
                                                } finally {
                                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$207, thread);
                                                }
                                                html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                                html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                                html_char(CHAR_greater, UNPROVIDED);
                                                final SubLObject _prev_bind_0_$208 = html_macros.$html_safe_print$.currentBinding(thread);
                                                try {
                                                    html_macros.$html_safe_print$.bind(T, thread);
                                                    html_markup(html_macros.$html_table_head$.getGlobalValue());
                                                    html_markup(html_macros.$html_table_border$.getGlobalValue());
                                                    html_char(CHAR_quotation, UNPROVIDED);
                                                    html_markup(ONE_INTEGER);
                                                    html_char(CHAR_quotation, UNPROVIDED);
                                                    html_char(CHAR_greater, UNPROVIDED);
                                                    final SubLObject _prev_bind_0_$209 = html_macros.$html_safe_print$.currentBinding(thread);
                                                    try {
                                                        html_macros.$html_safe_print$.bind(T, thread);
                                                        SubLObject iteration_state;
                                                        for (iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(filtered_items)); NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state); iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state)) {
                                                            thread.resetMultipleValues();
                                                            final SubLObject reason = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
                                                            final SubLObject supports = thread.secondMultipleValue();
                                                            thread.resetMultipleValues();
                                                            html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                                                            html_char(CHAR_greater, UNPROVIDED);
                                                            final SubLObject _prev_bind_0_$210 = html_macros.$html_safe_print$.currentBinding(thread);
                                                            try {
                                                                html_macros.$html_safe_print$.bind(T, thread);
                                                                final SubLObject bgcolor = html_macros.$html_color_cyc_logo_lighter_violet$.getGlobalValue();
                                                                html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                                                if (NIL != bgcolor) {
                                                                    html_markup(html_macros.$html_table_data_bgcolor$.getGlobalValue());
                                                                    html_char(CHAR_quotation, UNPROVIDED);
                                                                    html_markup(bgcolor);
                                                                    html_char(CHAR_quotation, UNPROVIDED);
                                                                }
                                                                html_char(CHAR_greater, UNPROVIDED);
                                                                final SubLObject _prev_bind_0_$211 = html_macros.$html_safe_print$.currentBinding(thread);
                                                                try {
                                                                    html_macros.$html_safe_print$.bind(T, thread);
                                                                    format(html_macros.$html_stream$.getDynamicValue(thread), $str343$Reason___S, reason);
                                                                } finally {
                                                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$211, thread);
                                                                }
                                                                html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                                            } finally {
                                                                html_macros.$html_safe_print$.rebind(_prev_bind_0_$210, thread);
                                                            }
                                                            html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                                                            html_source_readability_terpri(UNPROVIDED);
                                                            html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                                                            html_char(CHAR_greater, UNPROVIDED);
                                                            final SubLObject _prev_bind_0_$212 = html_macros.$html_safe_print$.currentBinding(thread);
                                                            try {
                                                                html_macros.$html_safe_print$.bind(T, thread);
                                                                html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                                                html_char(CHAR_greater, UNPROVIDED);
                                                                final SubLObject _prev_bind_0_$213 = html_macros.$html_safe_print$.currentBinding(thread);
                                                                try {
                                                                    html_macros.$html_safe_print$.bind(T, thread);
                                                                    html_markup(html_macros.$html_table_head$.getGlobalValue());
                                                                    html_markup(html_macros.$html_attribute_class$.getGlobalValue());
                                                                    html_char(CHAR_quotation, UNPROVIDED);
                                                                    html_markup($str129$pf_indent);
                                                                    html_char(CHAR_quotation, UNPROVIDED);
                                                                    html_markup(html_macros.$html_table_border$.getGlobalValue());
                                                                    html_char(CHAR_quotation, UNPROVIDED);
                                                                    html_markup(ZERO_INTEGER);
                                                                    html_char(CHAR_quotation, UNPROVIDED);
                                                                    html_char(CHAR_greater, UNPROVIDED);
                                                                    final SubLObject _prev_bind_0_$214 = html_macros.$html_safe_print$.currentBinding(thread);
                                                                    try {
                                                                        html_macros.$html_safe_print$.bind(T, thread);
                                                                        html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                                                                        html_char(CHAR_greater, UNPROVIDED);
                                                                        final SubLObject _prev_bind_0_$215 = html_macros.$html_safe_print$.currentBinding(thread);
                                                                        try {
                                                                            html_macros.$html_safe_print$.bind(T, thread);
                                                                            html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                                                            html_markup(html_macros.$html_attribute_class$.getGlobalValue());
                                                                            html_char(CHAR_quotation, UNPROVIDED);
                                                                            html_markup($str130$pf_indent_td);
                                                                            html_char(CHAR_quotation, UNPROVIDED);
                                                                            html_char(CHAR_greater, UNPROVIDED);
                                                                            final SubLObject _prev_bind_0_$216 = html_macros.$html_safe_print$.currentBinding(thread);
                                                                            try {
                                                                                html_macros.$html_safe_print$.bind(T, thread);
                                                                            } finally {
                                                                                html_macros.$html_safe_print$.rebind(_prev_bind_0_$216, thread);
                                                                            }
                                                                            html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                                                            html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                                                            html_char(CHAR_greater, UNPROVIDED);
                                                                            final SubLObject _prev_bind_0_$217 = html_macros.$html_safe_print$.currentBinding(thread);
                                                                            try {
                                                                                html_macros.$html_safe_print$.bind(T, thread);
                                                                                html_markup(html_macros.$html_table_head$.getGlobalValue());
                                                                                html_markup(html_macros.$html_table_border$.getGlobalValue());
                                                                                html_char(CHAR_quotation, UNPROVIDED);
                                                                                html_markup(ONE_INTEGER);
                                                                                html_char(CHAR_quotation, UNPROVIDED);
                                                                                html_char(CHAR_greater, UNPROVIDED);
                                                                                final SubLObject _prev_bind_0_$218 = html_macros.$html_safe_print$.currentBinding(thread);
                                                                                try {
                                                                                    html_macros.$html_safe_print$.bind(T, thread);
                                                                                    SubLObject cdolist_list_var = supports;
                                                                                    SubLObject support = NIL;
                                                                                    support = cdolist_list_var.first();
                                                                                    while (NIL != cdolist_list_var) {
                                                                                        html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                                                                                        html_char(CHAR_greater, UNPROVIDED);
                                                                                        final SubLObject _prev_bind_0_$219 = html_macros.$html_safe_print$.currentBinding(thread);
                                                                                        try {
                                                                                            html_macros.$html_safe_print$.bind(T, thread);
                                                                                            html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                                                                            html_char(CHAR_greater, UNPROVIDED);
                                                                                            final SubLObject _prev_bind_0_$220 = html_macros.$html_safe_print$.currentBinding(thread);
                                                                                            try {
                                                                                                html_macros.$html_safe_print$.bind(T, thread);
                                                                                                cb_form(support, ZERO_INTEGER, T);
                                                                                            } finally {
                                                                                                html_macros.$html_safe_print$.rebind(_prev_bind_0_$220, thread);
                                                                                            }
                                                                                            html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                                                                        } finally {
                                                                                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$219, thread);
                                                                                        }
                                                                                        html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                                                                                        html_source_readability_terpri(UNPROVIDED);
                                                                                        cdolist_list_var = cdolist_list_var.rest();
                                                                                        support = cdolist_list_var.first();
                                                                                    } 
                                                                                } finally {
                                                                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$218, thread);
                                                                                }
                                                                                html_markup(html_macros.$html_table_tail$.getGlobalValue());
                                                                            } finally {
                                                                                html_macros.$html_safe_print$.rebind(_prev_bind_0_$217, thread);
                                                                            }
                                                                            html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                                                        } finally {
                                                                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$215, thread);
                                                                        }
                                                                        html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                                                                        html_source_readability_terpri(UNPROVIDED);
                                                                    } finally {
                                                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$214, thread);
                                                                    }
                                                                    html_markup(html_macros.$html_table_tail$.getGlobalValue());
                                                                } finally {
                                                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$213, thread);
                                                                }
                                                                html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                                            } finally {
                                                                html_macros.$html_safe_print$.rebind(_prev_bind_0_$212, thread);
                                                            }
                                                            html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                                                            html_source_readability_terpri(UNPROVIDED);
                                                        }
                                                        dictionary_contents.do_dictionary_contents_finalize(iteration_state);
                                                    } finally {
                                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$209, thread);
                                                    }
                                                    html_markup(html_macros.$html_table_tail$.getGlobalValue());
                                                } finally {
                                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$208, thread);
                                                }
                                                html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                            } finally {
                                                html_macros.$html_safe_print$.rebind(_prev_bind_0_$206, thread);
                                            }
                                            html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                                            html_source_readability_terpri(UNPROVIDED);
                                        } finally {
                                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$205, thread);
                                        }
                                        html_markup(html_macros.$html_table_tail$.getGlobalValue());
                                    } finally {
                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$204, thread);
                                    }
                                    html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                } finally {
                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$203, thread);
                                }
                                html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                                html_source_readability_terpri(UNPROVIDED);
                            } finally {
                                html_macros.$html_safe_print$.rebind(_prev_bind_0_$200, thread);
                            }
                            html_markup(html_macros.$html_table_tail$.getGlobalValue());
                        } finally {
                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$199, thread);
                        }
                        html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                    } finally {
                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$197, thread);
                    }
                    html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                    html_source_readability_terpri(UNPROVIDED);
                } finally {
                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$196, thread);
                }
                html_markup(html_macros.$html_table_tail$.getGlobalValue());
            } finally {
                html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
            }
            html_markup(html_macros.$html_anchor_tail$.getGlobalValue());
        }
        return v_proof_view;
    }

    public static SubLObject cyc_proof_view_section_html(final SubLObject cyc_proof_view, final SubLObject section_type) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject ignore_errors_tag = NIL;
        try {
            thread.throwStack.push($IGNORE_ERRORS_TARGET);
            final SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding(thread);
            try {
                Errors.$error_handler$.bind(symbol_function(IGNORE_ERRORS_HANDLER), thread);
                try {
                    final SubLObject v_proof_view = proof_view.find_proof_view_by_id(cycl_utilities.nat_arg1(cyc_proof_view, UNPROVIDED));
                    SubLObject section_root = NIL;
                    if (section_type.eql($$CycProofViewSummarySection)) {
                        section_root = proof_view_summary.proof_view_get_summary_root(v_proof_view);
                    } else
                        if (section_type.eql($$CycProofViewJustificationSection)) {
                            section_root = proof_view_populator.proof_view_get_justification_root_entry(v_proof_view);
                        } else {
                            final SubLObject section_key = proof_view_populator.proof_view_section_key_from_id(section_type);
                            section_root = proof_view_populator.proof_view_get_special_section_root(v_proof_view, section_key);
                        }

                    if ((NIL == v_proof_view) || (NIL == section_root)) {
                        relation_evaluation.throw_unevaluatable();
                    }
                    return proof_view_section_html(section_root);
                } catch (final Throwable catch_var) {
                    Errors.handleThrowable(catch_var, NIL);
                }
            } finally {
                Errors.$error_handler$.rebind(_prev_bind_0, thread);
            }
        } catch (final Throwable ccatch_env_var) {
            ignore_errors_tag = Errors.handleThrowable(ccatch_env_var, $IGNORE_ERRORS_TARGET);
        } finally {
            thread.throwStack.pop();
        }
        relation_evaluation.throw_unevaluatable();
        return NIL;
    }

    public static SubLObject proof_view_section_html(final SubLObject section_root) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject html = NIL;
        SubLObject stream = NIL;
        try {
            stream = make_private_string_output_stream();
            final SubLObject _prev_bind_0 = html_macros.$html_stream$.currentBinding(thread);
            try {
                html_macros.$html_stream$.bind(stream, thread);
                show_proof_view_entry(section_root, UNPROVIDED);
            } finally {
                html_macros.$html_stream$.rebind(_prev_bind_0, thread);
            }
            html = get_output_stream_string(stream);
        } finally {
            final SubLObject _prev_bind_2 = $is_thread_performing_cleanupP$.currentBinding(thread);
            try {
                $is_thread_performing_cleanupP$.bind(T, thread);
                final SubLObject _values = getValuesAsVector();
                close(stream, UNPROVIDED);
                restoreValuesFromVector(_values);
            } finally {
                $is_thread_performing_cleanupP$.rebind(_prev_bind_2, thread);
            }
        }
        return html;
    }

    public static SubLObject show_proof_view_entry(final SubLObject proof_view_entry, SubLObject depth) {
        if (depth == UNPROVIDED) {
            depth = ZERO_INTEGER;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject cdolist_list_var = proof_view.proof_view_entry_showers();
        SubLObject fn = NIL;
        fn = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if (NIL != funcall(fn, proof_view_entry, depth)) {
                if (NIL != proof_view.$proof_view_debugP$.getDynamicValue(thread)) {
                    format_nil.force_format(T, $str349$___S_handled_by__S__, proof_view_entry, fn, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                }
                return NIL;
            }
            cdolist_list_var = cdolist_list_var.rest();
            fn = cdolist_list_var.first();
        } 
        final SubLObject _prev_bind_0 = proof_view_summary.$proof_view_seen_entries$.currentBinding(thread);
        try {
            proof_view_summary.$proof_view_seen_entries$.bind(NIL != misc_utilities.initialized_p(proof_view_summary.$proof_view_seen_entries$.getDynamicValue(thread)) ? proof_view_summary.$proof_view_seen_entries$.getDynamicValue(thread) : set.new_set(UNPROVIDED, UNPROVIDED), thread);
            if ((NIL == proof_view_summary.$proof_view_track_seen_entriesP$.getDynamicValue(thread)) || (NIL != set.set_add(proof_view_entry, proof_view_summary.$proof_view_seen_entries$.getDynamicValue(thread)))) {
                final SubLObject raw_html = proof_view.proof_view_entry_generate_html(proof_view_entry);
                final SubLObject html = fact_sheets.replace_fact_sheet_markups_fast(raw_html, DEBUG_PROOF_VIEW_CB_LINK_FOR_TERM, UNPROVIDED);
                final SubLObject stepnum = proof_view.proof_view_entry_get_id(proof_view_entry);
                final SubLObject stepnum_name = cconcatenate($str351$pf_stepnum, format_nil.format_nil_a_no_copy(stepnum));
                maybe_insert_proof_view_entry_anchor(proof_view_entry);
                final SubLObject v_class = proof_view_entry_class(proof_view_entry);
                final SubLObject stuff_to_hideP = list_utilities.sublisp_boolean(proof_view.proof_view_entry_get_children(proof_view_entry));
                html_markup(html_macros.$html_table_head$.getGlobalValue());
                html_markup(html_macros.$html_attribute_class$.getGlobalValue());
                html_char(CHAR_quotation, UNPROVIDED);
                html_markup($str129$pf_indent);
                html_char(CHAR_quotation, UNPROVIDED);
                html_markup(html_macros.$html_table_border$.getGlobalValue());
                html_char(CHAR_quotation, UNPROVIDED);
                html_markup(ZERO_INTEGER);
                html_char(CHAR_quotation, UNPROVIDED);
                html_char(CHAR_greater, UNPROVIDED);
                final SubLObject _prev_bind_0_$221 = html_macros.$html_safe_print$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind(T, thread);
                    html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                    html_char(CHAR_greater, UNPROVIDED);
                    final SubLObject _prev_bind_0_$222 = html_macros.$html_safe_print$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind(T, thread);
                        html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                        html_markup(html_macros.$html_attribute_class$.getGlobalValue());
                        html_char(CHAR_quotation, UNPROVIDED);
                        html_markup($str130$pf_indent_td);
                        html_char(CHAR_quotation, UNPROVIDED);
                        html_char(CHAR_greater, UNPROVIDED);
                        final SubLObject _prev_bind_0_$223 = html_macros.$html_safe_print$.currentBinding(thread);
                        try {
                            html_macros.$html_safe_print$.bind(T, thread);
                            if (depth.numG(ZERO_INTEGER) && (NIL != stuff_to_hideP)) {
                                dhtml_macros.dhtml_switch_visibility_links_arrows(stepnum_name, $str41$);
                            }
                        } finally {
                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$223, thread);
                        }
                        html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                        html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                        html_char(CHAR_greater, UNPROVIDED);
                        final SubLObject _prev_bind_0_$224 = html_macros.$html_safe_print$.currentBinding(thread);
                        try {
                            html_macros.$html_safe_print$.bind(T, thread);
                            html_markup(html_macros.$html_table_head$.getGlobalValue());
                            if (NIL != v_class) {
                                html_markup(html_macros.$html_attribute_class$.getGlobalValue());
                                html_char(CHAR_quotation, UNPROVIDED);
                                html_markup(v_class);
                                html_char(CHAR_quotation, UNPROVIDED);
                            }
                            html_char(CHAR_greater, UNPROVIDED);
                            final SubLObject _prev_bind_0_$225 = html_macros.$html_safe_print$.currentBinding(thread);
                            try {
                                html_macros.$html_safe_print$.bind(T, thread);
                                if (NIL != string_utilities.non_empty_stringP(proof_view.proof_view_entry_get_label(proof_view_entry))) {
                                    html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                                    html_char(CHAR_greater, UNPROVIDED);
                                    final SubLObject _prev_bind_0_$226 = html_macros.$html_safe_print$.currentBinding(thread);
                                    try {
                                        html_macros.$html_safe_print$.bind(T, thread);
                                        html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                        html_markup(html_macros.$html_attribute_class$.getGlobalValue());
                                        html_char(CHAR_quotation, UNPROVIDED);
                                        html_markup($str352$pf_steprow);
                                        html_char(CHAR_quotation, UNPROVIDED);
                                        html_char(CHAR_greater, UNPROVIDED);
                                        final SubLObject _prev_bind_0_$227 = html_macros.$html_safe_print$.currentBinding(thread);
                                        try {
                                            html_macros.$html_safe_print$.bind(T, thread);
                                            html_markup(html_macros.$html_span_head$.getGlobalValue());
                                            html_markup(html_macros.$html_attribute_class$.getGlobalValue());
                                            html_char(CHAR_quotation, UNPROVIDED);
                                            html_markup($str353$pf_label);
                                            html_char(CHAR_quotation, UNPROVIDED);
                                            html_char(CHAR_greater, UNPROVIDED);
                                            final SubLObject _prev_bind_0_$228 = html_macros.$html_safe_print$.currentBinding(thread);
                                            try {
                                                html_macros.$html_safe_print$.bind(T, thread);
                                                format(html_macros.$html_stream$.getDynamicValue(thread), $str354$_A, proof_view.proof_view_entry_get_label(proof_view_entry));
                                            } finally {
                                                html_macros.$html_safe_print$.rebind(_prev_bind_0_$228, thread);
                                            }
                                            html_markup(html_macros.$html_span_tail$.getGlobalValue());
                                        } finally {
                                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$227, thread);
                                        }
                                        html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                    } finally {
                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$226, thread);
                                    }
                                    html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                                    html_source_readability_terpri(UNPROVIDED);
                                }
                                html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                                html_char(CHAR_greater, UNPROVIDED);
                                final SubLObject _prev_bind_0_$229 = html_macros.$html_safe_print$.currentBinding(thread);
                                try {
                                    html_macros.$html_safe_print$.bind(T, thread);
                                    html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                    html_char(CHAR_greater, UNPROVIDED);
                                    final SubLObject _prev_bind_0_$230 = html_macros.$html_safe_print$.currentBinding(thread);
                                    try {
                                        html_macros.$html_safe_print$.bind(T, thread);
                                        html_markup(html_macros.$html_table_head$.getGlobalValue());
                                        html_markup(html_macros.$html_attribute_class$.getGlobalValue());
                                        html_char(CHAR_quotation, UNPROVIDED);
                                        html_markup($str355$pf_entry_content);
                                        html_char(CHAR_quotation, UNPROVIDED);
                                        html_char(CHAR_greater, UNPROVIDED);
                                        final SubLObject _prev_bind_0_$231 = html_macros.$html_safe_print$.currentBinding(thread);
                                        try {
                                            html_macros.$html_safe_print$.bind(T, thread);
                                            show_proof_view_entry_local_content(proof_view_entry, stepnum, html, depth);
                                            final SubLObject children = proof_view.proof_view_entry_get_children(proof_view_entry);
                                            final SubLObject visibility = proof_view_entry_initial_child_visibility(proof_view_entry, depth);
                                            if (NIL != children) {
                                                html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                                                html_markup(html_macros.$html_attribute_class$.getGlobalValue());
                                                html_char(CHAR_quotation, UNPROVIDED);
                                                html_markup($str356$pf_children);
                                                html_char(CHAR_quotation, UNPROVIDED);
                                                html_char(CHAR_greater, UNPROVIDED);
                                                final SubLObject _prev_bind_0_$232 = html_macros.$html_safe_print$.currentBinding(thread);
                                                try {
                                                    html_macros.$html_safe_print$.bind(T, thread);
                                                    html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                                    html_char(CHAR_greater, UNPROVIDED);
                                                    final SubLObject _prev_bind_0_$233 = html_macros.$html_safe_print$.currentBinding(thread);
                                                    try {
                                                        html_macros.$html_safe_print$.bind(T, thread);
                                                        dhtml_macros.dhtml_set_switched_visibility(stepnum_name, visibility, $TEXT);
                                                        html_markup(html_macros.$html_div_head$.getGlobalValue());
                                                        if (NIL != stepnum_name) {
                                                            html_markup(html_macros.$html_attribute_id$.getGlobalValue());
                                                            html_char(CHAR_quotation, UNPROVIDED);
                                                            html_markup(stepnum_name);
                                                            html_char(CHAR_quotation, UNPROVIDED);
                                                        }
                                                        html_char(CHAR_greater, UNPROVIDED);
                                                        final SubLObject _prev_bind_0_$234 = html_macros.$html_safe_print$.currentBinding(thread);
                                                        try {
                                                            html_macros.$html_safe_print$.bind(T, thread);
                                                            SubLObject cdolist_list_var2 = children;
                                                            SubLObject child = NIL;
                                                            child = cdolist_list_var2.first();
                                                            while (NIL != cdolist_list_var2) {
                                                                show_proof_view_entry(child, add(depth, ONE_INTEGER));
                                                                cdolist_list_var2 = cdolist_list_var2.rest();
                                                                child = cdolist_list_var2.first();
                                                            } 
                                                        } finally {
                                                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$234, thread);
                                                        }
                                                        html_markup(html_macros.$html_div_tail$.getGlobalValue());
                                                        html_source_readability_terpri(UNPROVIDED);
                                                    } finally {
                                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$233, thread);
                                                    }
                                                    html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                                } finally {
                                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$232, thread);
                                                }
                                                html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                                                html_source_readability_terpri(UNPROVIDED);
                                            }
                                        } finally {
                                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$231, thread);
                                        }
                                        html_markup(html_macros.$html_table_tail$.getGlobalValue());
                                    } finally {
                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$230, thread);
                                    }
                                    html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                } finally {
                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$229, thread);
                                }
                                html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                                html_source_readability_terpri(UNPROVIDED);
                            } finally {
                                html_macros.$html_safe_print$.rebind(_prev_bind_0_$225, thread);
                            }
                            html_markup(html_macros.$html_table_tail$.getGlobalValue());
                        } finally {
                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$224, thread);
                        }
                        html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                    } finally {
                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$222, thread);
                    }
                    html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                    html_source_readability_terpri(UNPROVIDED);
                } finally {
                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$221, thread);
                }
                html_markup(html_macros.$html_table_tail$.getGlobalValue());
            } else
                if (NIL != proof_view.$proof_view_debugP$.getDynamicValue(thread)) {
                    format_nil.force_format(T, $str357$Already_seen__S, proof_view_entry, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                }

        } finally {
            proof_view_summary.$proof_view_seen_entries$.rebind(_prev_bind_0, thread);
        }
        return NIL;
    }

    public static SubLObject show_proof_view_entry_local_content(final SubLObject proof_view_entry, final SubLObject stepnum, final SubLObject html, final SubLObject depth) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject v_object = proof_view.proof_view_entry_get_object(proof_view_entry);
        SubLObject object_type = proof_view.proof_view_entry_get_object_type(proof_view_entry);
        final SubLObject td_nowrapP = list_utilities.lengthLE(remove_html_tags(html, UNPROVIDED), $proof_view_max_nowrap_line$.getGlobalValue(), UNPROVIDED);
        if (NIL != v_object) {
            html_markup(html_macros.$html_table_row_head$.getGlobalValue());
            html_markup(html_macros.$html_attribute_class$.getGlobalValue());
            html_char(CHAR_quotation, UNPROVIDED);
            html_markup($str359$pf_paraphrase);
            html_char(CHAR_quotation, UNPROVIDED);
            html_char(CHAR_greater, UNPROVIDED);
            final SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
            try {
                html_macros.$html_safe_print$.bind(T, thread);
                html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                if (NIL != td_nowrapP) {
                    html_simple_attribute(html_macros.$html_table_data_nowrap$.getGlobalValue());
                }
                html_char(CHAR_greater, UNPROVIDED);
                final SubLObject _prev_bind_0_$235 = html_macros.$html_safe_print$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind(T, thread);
                    html_markup(html_macros.$html_span_head$.getGlobalValue());
                    html_markup(html_macros.$html_attribute_class$.getGlobalValue());
                    html_char(CHAR_quotation, UNPROVIDED);
                    html_markup($str351$pf_stepnum);
                    html_char(CHAR_quotation, UNPROVIDED);
                    html_char(CHAR_greater, UNPROVIDED);
                    final SubLObject _prev_bind_0_$236 = html_macros.$html_safe_print$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind(T, thread);
                        format(html_macros.$html_stream$.getDynamicValue(thread), $str360$_4d_, stepnum);
                    } finally {
                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$236, thread);
                    }
                    html_markup(html_macros.$html_span_tail$.getGlobalValue());
                    html_markup(html);
                    maybe_show_proof_view_entry_bug_report_link(proof_view_entry);
                } finally {
                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$235, thread);
                }
                html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
            } finally {
                html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
            }
            html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
            html_source_readability_terpri(UNPROVIDED);
            while (NIL != proof_view.proof_view_entry_p(v_object)) {
                object_type = proof_view.proof_view_entry_get_object_type(v_object);
                v_object = proof_view.proof_view_entry_get_object(v_object);
            } 
            if ((NIL != show_proof_view_object_typeP(object_type)) && (NIL != proof_view.proof_view_get_include_cycl_in_outputP(proof_view.proof_view_entry_get_proof_view(proof_view_entry)))) {
                final SubLObject v_class = ((NIL != proof_view.proof_view_entry_p(v_object)) || (NIL != list_utilities.list_of_type_p(PROOF_VIEW_ENTRY_P, v_object))) ? $str362$pf_object_pf_entry_struct : $str363$pf_object;
                html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                if (NIL != v_class) {
                    html_markup(html_macros.$html_attribute_class$.getGlobalValue());
                    html_char(CHAR_quotation, UNPROVIDED);
                    html_markup(v_class);
                    html_char(CHAR_quotation, UNPROVIDED);
                }
                html_char(CHAR_greater, UNPROVIDED);
                final SubLObject _prev_bind_2 = html_macros.$html_safe_print$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind(T, thread);
                    html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                    html_char(CHAR_greater, UNPROVIDED);
                    final SubLObject _prev_bind_0_$237 = html_macros.$html_safe_print$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind(T, thread);
                        show_proof_view_object(v_object, proof_view_entry, depth);
                    } finally {
                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$237, thread);
                    }
                    html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                } finally {
                    html_macros.$html_safe_print$.rebind(_prev_bind_2, thread);
                }
                html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                html_source_readability_terpri(UNPROVIDED);
            }
            if (NIL != proof_view.proof_view_get_enable_debugP(proof_view.proof_view_entry_get_proof_view(proof_view_entry))) {
                final SubLObject proof = proof_view.proof_view_entry_get_proof(proof_view_entry, UNPROVIDED);
                final SubLObject fn = proof_view.proof_view_entry_get_function(proof_view_entry);
                final SubLObject fn_section = (NIL != fn) ? proof_view.proof_view_entry_get_function_section(proof_view_entry) : NIL;
                if (NIL != proof) {
                    html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                    html_markup(html_macros.$html_attribute_class$.getGlobalValue());
                    html_char(CHAR_quotation, UNPROVIDED);
                    html_markup($str364$pf_proof);
                    html_char(CHAR_quotation, UNPROVIDED);
                    html_char(CHAR_greater, UNPROVIDED);
                    final SubLObject _prev_bind_3 = html_macros.$html_safe_print$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind(T, thread);
                        html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                        html_char(CHAR_greater, UNPROVIDED);
                        final SubLObject _prev_bind_0_$238 = html_macros.$html_safe_print$.currentBinding(thread);
                        try {
                            html_macros.$html_safe_print$.bind(T, thread);
                            format(html_macros.$html_stream$.getDynamicValue(thread), $str365$Proof__);
                            cb_form(proof, UNPROVIDED, UNPROVIDED);
                        } finally {
                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$238, thread);
                        }
                        html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                    } finally {
                        html_macros.$html_safe_print$.rebind(_prev_bind_3, thread);
                    }
                    html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                    html_source_readability_terpri(UNPROVIDED);
                }
                if (NIL != fn) {
                    html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                    html_markup(html_macros.$html_attribute_class$.getGlobalValue());
                    html_char(CHAR_quotation, UNPROVIDED);
                    html_markup($str366$pf_function);
                    html_char(CHAR_quotation, UNPROVIDED);
                    html_char(CHAR_greater, UNPROVIDED);
                    SubLObject _prev_bind_3 = html_macros.$html_safe_print$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind(T, thread);
                        html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                        html_char(CHAR_greater, UNPROVIDED);
                        final SubLObject _prev_bind_0_$239 = html_macros.$html_safe_print$.currentBinding(thread);
                        try {
                            html_macros.$html_safe_print$.bind(T, thread);
                            format(html_macros.$html_stream$.getDynamicValue(thread), $str367$Function___S, fn);
                        } finally {
                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$239, thread);
                        }
                        html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                    } finally {
                        html_macros.$html_safe_print$.rebind(_prev_bind_3, thread);
                    }
                    html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                    html_source_readability_terpri(UNPROVIDED);
                    if (NIL != fn_section) {
                        html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                        html_markup(html_macros.$html_attribute_class$.getGlobalValue());
                        html_char(CHAR_quotation, UNPROVIDED);
                        html_markup($str368$pf_function_section);
                        html_char(CHAR_quotation, UNPROVIDED);
                        html_char(CHAR_greater, UNPROVIDED);
                        _prev_bind_3 = html_macros.$html_safe_print$.currentBinding(thread);
                        try {
                            html_macros.$html_safe_print$.bind(T, thread);
                            html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                            html_char(CHAR_greater, UNPROVIDED);
                            final SubLObject _prev_bind_0_$240 = html_macros.$html_safe_print$.currentBinding(thread);
                            try {
                                html_macros.$html_safe_print$.bind(T, thread);
                                format(html_macros.$html_stream$.getDynamicValue(thread), $str369$Section___S, fn_section);
                            } finally {
                                html_macros.$html_safe_print$.rebind(_prev_bind_0_$240, thread);
                            }
                            html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                        } finally {
                            html_macros.$html_safe_print$.rebind(_prev_bind_3, thread);
                        }
                        html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                        html_source_readability_terpri(UNPROVIDED);
                    }
                }
            }
        }
        return proof_view_entry;
    }

    public static SubLObject maybe_show_proof_view_entry_bug_report_link(final SubLObject proof_view_entry) {
        if (NIL != show_bug_report_link_for_proof_view_entryP(proof_view_entry)) {
            cb_proof_view.cb_link_proof_view_bug(proof_view_entry);
        }
        return proof_view_entry;
    }

    public static SubLObject show_bug_report_link_for_proof_view_entryP(final SubLObject proof_view_entry) {
        if (NIL == proof_view.proof_view_get_show_cb_bug_report_linksP(proof_view.proof_view_entry_get_proof_view(proof_view_entry))) {
            return NIL;
        }
        final SubLObject pcase_var = proof_view.proof_view_entry_get_object_type(proof_view_entry);
        if (((((((pcase_var.eql($QUERY_SENTENCE) || pcase_var.eql(EL_TERM_P)) || pcase_var.eql(ASSERTION_P)) || pcase_var.eql(SUPPORT_P)) || pcase_var.eql(EL_SENTENCE_P)) || pcase_var.eql($PREMISE)) || pcase_var.eql($RULE)) || pcase_var.eql($CONCLUSION)) {
            return T;
        }
        return NIL;
    }

    public static SubLObject show_proof_view_object(final SubLObject v_object, final SubLObject entry, final SubLObject depth) {
        final SubLObject linksP = proof_view.proof_view_get_allow_internal_linksP(proof_view.proof_view_entry_get_proof_view(entry));
        if (NIL != linksP) {
            if (NIL != arguments.support_p(v_object)) {
                cb_assertion_browser.cb_show_support(v_object, UNPROVIDED);
            } else {
                cb_form(v_object, depth, T);
            }
        } else {
            html_princ(v_object);
        }
        return v_object;
    }

    public static SubLObject proof_view_entry_initial_child_visibility(final SubLObject proof_view_entry, final SubLObject depth) {
        return NIL != proof_view.proof_view_entry_expand_intiallyP(proof_view_entry) ? $VISIBLE : $INVISIBLE;
    }

    public static SubLObject proof_view_entry_class(final SubLObject entry) {
        final SubLObject pcase_var;
        final SubLObject object_type = pcase_var = proof_view.proof_view_entry_get_object_type(entry);
        if (pcase_var.eql($SECTION_ROOT)) {
            return cconcatenate($str380$pf_entry_, proof_view_html_class(proof_view.proof_view_entry_get_label(entry)));
        }
        return cconcatenate($str380$pf_entry_, proof_view_html_class(object_type));
    }

    public static SubLObject proof_view_html_class(final SubLObject v_object) {
        return string_utilities.char_subst(CHAR_hyphen, CHAR_space, cconcatenate($str381$pf_, Strings.string_downcase(list_utilities.remove_if_not(ALPHANUMERIC_CHAR_P, princ_to_string(v_object), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED), UNPROVIDED, UNPROVIDED)));
    }

    public static SubLObject show_proof_view_object_typeP(final SubLObject object_type) {
        return makeBoolean(NIL == member(object_type, $list382, UNPROVIDED, UNPROVIDED));
    }

    public static SubLObject debug_proof_view_cb_link_for_term(final SubLObject v_term, final SubLObject open_tag, final SubLObject link_tokens, final SubLObject close_tag) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject link = NIL;
        SubLObject tokenized = NIL;
        if (NIL != constant_p(v_term)) {
            SubLObject stream = NIL;
            try {
                stream = make_private_string_output_stream();
                final SubLObject _prev_bind_0 = html_macros.$html_stream$.currentBinding(thread);
                try {
                    html_macros.$html_stream$.bind(stream, thread);
                    cb_link_constant(v_term, $str41$, UNPROVIDED);
                } finally {
                    html_macros.$html_stream$.rebind(_prev_bind_0, thread);
                }
                link = get_output_stream_string(stream);
            } finally {
                final SubLObject _prev_bind_2 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    close(stream, UNPROVIDED);
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_2, thread);
                }
            }
            tokenized = xml_parsing_utilities.xml_string_tokenize(link, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            return list(tokenized.first(), link_tokens, second(tokenized));
        }
        if (NIL != nart_handles.nart_p(v_term)) {
            SubLObject stream = NIL;
            try {
                stream = make_private_string_output_stream();
                final SubLObject _prev_bind_0 = html_macros.$html_stream$.currentBinding(thread);
                try {
                    html_macros.$html_stream$.bind(stream, thread);
                    cb_link_nart(v_term, $str41$, UNPROVIDED);
                } finally {
                    html_macros.$html_stream$.rebind(_prev_bind_0, thread);
                }
                link = get_output_stream_string(stream);
            } finally {
                final SubLObject _prev_bind_3 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values2 = getValuesAsVector();
                    close(stream, UNPROVIDED);
                    restoreValuesFromVector(_values2);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_3, thread);
                }
            }
            tokenized = xml_parsing_utilities.xml_string_tokenize(link, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            return list(tokenized.first(), link_tokens, second(tokenized));
        }
        if (NIL != cycl_grammar.cycl_nat_p(v_term)) {
            SubLObject stream = NIL;
            try {
                stream = make_private_string_output_stream();
                final SubLObject _prev_bind_0 = html_macros.$html_stream$.currentBinding(thread);
                try {
                    html_macros.$html_stream$.bind(stream, thread);
                    cb_link_naut(v_term, $str41$, UNPROVIDED);
                } finally {
                    html_macros.$html_stream$.rebind(_prev_bind_0, thread);
                }
                link = get_output_stream_string(stream);
            } finally {
                final SubLObject _prev_bind_4 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values3 = getValuesAsVector();
                    close(stream, UNPROVIDED);
                    restoreValuesFromVector(_values3);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_4, thread);
                }
            }
            tokenized = xml_parsing_utilities.xml_string_tokenize(link, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            return list(tokenized.first(), link_tokens, second(tokenized));
        }
        return list(open_tag, link_tokens, close_tag);
    }

    public static SubLObject debug_proof_view_entry_label_color(final SubLObject proof_view_entry) {
        final SubLObject label = proof_view.proof_view_entry_get_label(proof_view_entry);
        if (label.equal($str383$Inferred_)) {
            return html_macros.$html_color_lighter_green$.getGlobalValue();
        }
        if (label.equal($str384$Asserted_)) {
            return html_macros.$html_color_lighter_yellow$.getGlobalValue();
        }
        if (label.equal($str385$Opaque_)) {
            return html_macros.$html_color_lighter_grey$.getGlobalValue();
        }
        return html_macros.$html_color_cyc_logo_lighter_violet$.getGlobalValue();
    }

    public static SubLObject pph_get_inference_mt(final SubLObject inference) {
        final SubLObject hl_mts = inference_datastructures_inference.inference_hl_mts(inference);
        final SubLObject mt = (NIL != list_utilities.singletonP(hl_mts)) ? hl_mts.first() : inference_datastructures_inference.inference_mt(inference);
        return mt;
    }

    public static SubLObject proof_of_inference_answer_p(final SubLObject proof, final SubLObject inference_answer) {
        SubLObject cdolist_list_var = inference_datastructures_inference.inference_answer_justifications(inference_answer);
        SubLObject justification = NIL;
        justification = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            SubLObject cdolist_list_var_$241 = inference_datastructures_inference.inference_answer_justification_proofs(justification);
            SubLObject real_proof = NIL;
            real_proof = cdolist_list_var_$241.first();
            while (NIL != cdolist_list_var_$241) {
                if (proof.eql(real_proof)) {
                    return T;
                }
                cdolist_list_var_$241 = cdolist_list_var_$241.rest();
                real_proof = cdolist_list_var_$241.first();
            } 
            cdolist_list_var = cdolist_list_var.rest();
            justification = cdolist_list_var.first();
        } 
        return NIL;
    }

    public static SubLObject support_cnf(final SubLObject support) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != assertion_handles.assertion_p(support)) {
            return assertions_high.assertion_cnf(support);
        }
        if (NIL != arguments.hl_support_p(support)) {
            return clausifier.cnf_clausal_form(pph_support_sentence(support, UNPROVIDED), mt_relevance_macros.$mt$.getDynamicValue(thread)).first();
        }
        return NIL;
    }

    public static SubLObject hypothetical_mtP(final SubLObject mt) {
        return isa.isaP(mt, $$HypotheticalContext, UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject pph_proof_from_hypothesisP(final SubLObject proof, final SubLObject mt) {
        if (NIL == hypothetical_mtP(mt)) {
            return NIL;
        }
        if (NIL != pph_lookup_proof_p(proof)) {
            final SubLObject support = inference_datastructures_proof.proof_supports(proof).first();
            final SubLObject support_assertion = pph_find_assertion_for_support(support);
            final SubLObject proof_support_mt = (NIL != assertion_handles.assertion_p(support_assertion)) ? assertions_high.assertion_mt(support_assertion) : NIL;
            return makeBoolean((NIL != hlmt.hlmt_p(proof_support_mt)) && (NIL != pph_hypothesis_mt_for_mtP(proof_support_mt, mt)));
        }
        return NIL;
    }

    public static SubLObject pph_hypothesized_supportP(final SubLObject support, final SubLObject mt) {
        return makeBoolean((NIL != assertion_handles.assertion_p(support)) && ((NIL != pph_assertion_references_hypothetical_term_p(support)) || (NIL != pph_hypothesis_mt_for_mtP(assertions_high.assertion_mt(support), mt))));
    }

    public static SubLObject pph_assertion_references_hypothetical_term_p(final SubLObject as) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject hypotheticalP = NIL;
        if (NIL == hypotheticalP) {
            SubLObject csome_list_var = pph_vars.$pph_hypothetical_vars$.getDynamicValue(thread);
            SubLObject binding = NIL;
            binding = csome_list_var.first();
            while ((NIL == hypotheticalP) && (NIL != csome_list_var)) {
                if (NIL != cycl_utilities.expression_find(bindings.variable_binding_value(binding), as, T, UNPROVIDED, UNPROVIDED)) {
                    hypotheticalP = T;
                }
                csome_list_var = csome_list_var.rest();
                binding = csome_list_var.first();
            } 
        }
        return hypotheticalP;
    }

    public static SubLObject pph_hypothesis_mt_for_mtP(final SubLObject assertion_mt, final SubLObject mt) {
        return makeBoolean((NIL != hypothetical_mtP(assertion_mt)) && (NIL != genl_mts.genl_mtP(mt, assertion_mt, UNPROVIDED, UNPROVIDED)));
    }

    public static SubLObject pph_terminal_transformation_proof_p(final SubLObject proof) {
        return makeBoolean((NIL != inference_worker_transformation.transformation_proof_p(proof)) && (NIL == pph_proof_has_transformation_subproofs_p(proof)));
    }

    public static SubLObject pph_proof_has_transformation_subproofs_p(final SubLObject proof) {
        SubLObject cdolist_list_var = inference_datastructures_proof.proof_direct_subproofs(proof);
        SubLObject subproof = NIL;
        subproof = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if (NIL != inference_worker_transformation.transformation_proof_p(subproof)) {
                return T;
            }
            if (NIL != pph_proof_has_transformation_subproofs_p(subproof)) {
                return T;
            }
            cdolist_list_var = cdolist_list_var.rest();
            subproof = cdolist_list_var.first();
        } 
        return NIL;
    }

    public static SubLObject pph_find_subproofs_matching_asents(final SubLObject proof, final SubLObject mt, final SubLObject asents) {
        SubLObject ans = NIL;
        if (NIL != subl_promotions.memberP(pph_proof_el_formula(proof, mt), asents, symbol_function(EQUAL), UNPROVIDED)) {
            ans = cons(proof, ans);
        } else {
            SubLObject cdolist_list_var = inference_datastructures_proof.proof_direct_subproofs(proof);
            SubLObject subproof = NIL;
            subproof = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                ans = append(ans, pph_find_subproofs_matching_asents(subproof, mt, asents));
                cdolist_list_var = cdolist_list_var.rest();
                subproof = cdolist_list_var.first();
            } 
        }
        return delete_duplicates(ans, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject pph_restrict_transformation_rule(final SubLObject rule_assertion, final SubLObject proof, final SubLObject mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        thread.resetMultipleValues();
        final SubLObject restriction_subproofs = pph_restriction_subproofs_and_bindings(proof);
        final SubLObject restriction_bindings = thread.secondMultipleValue();
        final SubLObject non_hypothetical_bindingsP = thread.thirdMultipleValue();
        thread.resetMultipleValues();
        final SubLObject subbed_formula = pph_restrict_rule_via_subproofs(rule_assertion, restriction_subproofs, restriction_bindings, mt);
        return values(subbed_formula, restriction_subproofs, non_hypothetical_bindingsP);
    }

    public static SubLObject pph_restrict_rule_via_subproofs(final SubLObject rule_assertion, final SubLObject restriction_subproofs, final SubLObject restriction_bindings, final SubLObject mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject rule_cnf = copy_clause(assertions_high.assertion_cnf(rule_assertion));
        final SubLObject subbed_rule_cnf = bindings.apply_bindings(restriction_bindings, rule_cnf);
        final SubLObject de_toued_rule_cnf = pph_restricted_rule_resolve_tous(subbed_rule_cnf);
        SubLObject matched_neg_lits = NIL;
        SubLObject subbed_formula = NIL;
        SubLObject index_var = ZERO_INTEGER;
        SubLObject cdolist_list_var = clauses.neg_lits(de_toued_rule_cnf);
        SubLObject asent = NIL;
        asent = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            final SubLObject sense = $NEG;
            if (sense == $NEG) {
                SubLObject foundP = NIL;
                if (NIL == foundP) {
                    SubLObject csome_list_var = restriction_subproofs;
                    SubLObject subproof = NIL;
                    subproof = csome_list_var.first();
                    while ((NIL == foundP) && (NIL != csome_list_var)) {
                        if (NIL != pph_subproof_matches_asent_p(subproof, asent, mt)) {
                            matched_neg_lits = cons(asent, matched_neg_lits);
                            foundP = T;
                        }
                        csome_list_var = csome_list_var.rest();
                        subproof = csome_list_var.first();
                    } 
                }
            }
            index_var = add(index_var, ONE_INTEGER);
            cdolist_list_var = cdolist_list_var.rest();
            asent = cdolist_list_var.first();
        } 
        index_var = ZERO_INTEGER;
        cdolist_list_var = clauses.pos_lits(de_toued_rule_cnf);
        asent = NIL;
        asent = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            final SubLObject sense = $POS;
            if (sense == $NEG) {
                SubLObject foundP = NIL;
                if (NIL == foundP) {
                    SubLObject csome_list_var = restriction_subproofs;
                    SubLObject subproof = NIL;
                    subproof = csome_list_var.first();
                    while ((NIL == foundP) && (NIL != csome_list_var)) {
                        if (NIL != pph_subproof_matches_asent_p(subproof, asent, mt)) {
                            matched_neg_lits = cons(asent, matched_neg_lits);
                            foundP = T;
                        }
                        csome_list_var = csome_list_var.rest();
                        subproof = csome_list_var.first();
                    } 
                }
            }
            index_var = add(index_var, ONE_INTEGER);
            cdolist_list_var = cdolist_list_var.rest();
            asent = cdolist_list_var.first();
        } 
        final SubLObject _prev_bind_0 = pph_vars.$pph_domain_mt$.currentBinding(thread);
        try {
            pph_vars.$pph_domain_mt$.bind(mt, thread);
            final SubLObject remaining_neg_lits = pph_remove_trivial_neg_lits(set_difference(clauses.neg_lits(de_toued_rule_cnf), matched_neg_lits, UNPROVIDED, UNPROVIDED));
            final SubLObject new_cnf = clauses.make_clause(remaining_neg_lits, clauses.pos_lits(de_toued_rule_cnf));
            final SubLObject el_vars = assertions_high.assertion_el_variables(rule_assertion);
            subbed_formula = uncanonicalizer.cnf_el_formula(new_cnf, assertions_high.assertion_mt(rule_assertion), el_vars);
        } finally {
            pph_vars.$pph_domain_mt$.rebind(_prev_bind_0, thread);
        }
        return subbed_formula;
    }

    public static SubLObject pph_remove_trivial_neg_lits(SubLObject neg_lits) {
        neg_lits = remove_if($sym388$PPH_TRIVIAL_NEG_LIT_, neg_lits, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        neg_lits = pph_remove_trivial_evaluatable_neg_lits(neg_lits);
        return neg_lits;
    }

    public static SubLObject pph_remove_trivial_evaluatable_neg_lits(final SubLObject neg_lits) {
        SubLObject cdolist_list_var;
        final SubLObject evaluate_lits = cdolist_list_var = list_utilities.find_all($$evaluate, neg_lits, symbol_function(EQ), ATOMIC_SENTENCE_PREDICATE);
        SubLObject evaluate_lit = NIL;
        evaluate_lit = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            SubLObject current;
            final SubLObject datum = current = cycl_utilities.atomic_sentence_args(evaluate_lit, UNPROVIDED);
            SubLObject var = NIL;
            SubLObject evaluatable_expression = NIL;
            destructuring_bind_must_consp(current, datum, $list391);
            var = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list391);
            evaluatable_expression = current.first();
            current = current.rest();
            if (NIL == current) {
                final SubLObject other_lits = remove(evaluate_lit, neg_lits, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                final SubLObject other_lits_subbed = subst(evaluatable_expression, var, other_lits, UNPROVIDED, UNPROVIDED);
                final SubLObject trivials_out = pph_remove_trivial_neg_lits(other_lits_subbed);
                if (!other_lits_subbed.equal(trivials_out)) {
                    return trivials_out;
                }
            } else {
                cdestructuring_bind_error(datum, $list391);
            }
            cdolist_list_var = cdolist_list_var.rest();
            evaluate_lit = cdolist_list_var.first();
        } 
        return neg_lits;
    }

    public static SubLObject pph_trivial_neg_litP(final SubLObject neg_lit, SubLObject domain_mt) {
        if (domain_mt == UNPROVIDED) {
            domain_mt = pph_triviality_check_mt();
        }
        return makeBoolean((NIL != variables.fully_bound_p(neg_lit)) && ((NIL != pph_irrelevant_formulaP(neg_lit, UNPROVIDED, UNPROVIDED)) || (NIL != pph_trivial_sentenceP(neg_lit, domain_mt))));
    }

    public static SubLObject pph_restricted_rule_resolve_tous(final SubLObject subbed_rule_cnf) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject tou_bindings = NIL;
        SubLObject found_a_touP = NIL;
        SubLObject non_tou_neg_lits = NIL;
        SubLObject index_var = ZERO_INTEGER;
        SubLObject cdolist_list_var = clauses.neg_lits(subbed_rule_cnf);
        SubLObject asent = NIL;
        asent = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            final SubLObject sense = $NEG;
            if (sense == $NEG) {
                if (cycl_utilities.atomic_sentence_predicate(asent).eql($$termOfUnit) && (NIL != nart_handles.nart_p(cycl_utilities.atomic_sentence_arg1(asent, UNPROVIDED)))) {
                    found_a_touP = T;
                    thread.resetMultipleValues();
                    final SubLObject new_bindings = unification.unify(cycl_utilities.atomic_sentence_arg1(asent, UNPROVIDED), cycl_utilities.atomic_sentence_arg2(asent, UNPROVIDED), UNPROVIDED, UNPROVIDED);
                    final SubLObject justification = thread.secondMultipleValue();
                    thread.resetMultipleValues();
                    SubLObject cdolist_list_var_$242 = new_bindings;
                    SubLObject new_binding = NIL;
                    new_binding = cdolist_list_var_$242.first();
                    while (NIL != cdolist_list_var_$242) {
                        tou_bindings = cons(new_binding, tou_bindings);
                        cdolist_list_var_$242 = cdolist_list_var_$242.rest();
                        new_binding = cdolist_list_var_$242.first();
                    } 
                } else {
                    non_tou_neg_lits = cons(asent, non_tou_neg_lits);
                }
            }
            index_var = add(index_var, ONE_INTEGER);
            cdolist_list_var = cdolist_list_var.rest();
            asent = cdolist_list_var.first();
        } 
        index_var = ZERO_INTEGER;
        cdolist_list_var = clauses.pos_lits(subbed_rule_cnf);
        asent = NIL;
        asent = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            final SubLObject sense = $POS;
            if (sense == $NEG) {
                if (cycl_utilities.atomic_sentence_predicate(asent).eql($$termOfUnit) && (NIL != nart_handles.nart_p(cycl_utilities.atomic_sentence_arg1(asent, UNPROVIDED)))) {
                    found_a_touP = T;
                    thread.resetMultipleValues();
                    final SubLObject new_bindings = unification.unify(cycl_utilities.atomic_sentence_arg1(asent, UNPROVIDED), cycl_utilities.atomic_sentence_arg2(asent, UNPROVIDED), UNPROVIDED, UNPROVIDED);
                    final SubLObject justification = thread.secondMultipleValue();
                    thread.resetMultipleValues();
                    SubLObject cdolist_list_var_$243 = new_bindings;
                    SubLObject new_binding = NIL;
                    new_binding = cdolist_list_var_$243.first();
                    while (NIL != cdolist_list_var_$243) {
                        tou_bindings = cons(new_binding, tou_bindings);
                        cdolist_list_var_$243 = cdolist_list_var_$243.rest();
                        new_binding = cdolist_list_var_$243.first();
                    } 
                } else {
                    non_tou_neg_lits = cons(asent, non_tou_neg_lits);
                }
            }
            index_var = add(index_var, ONE_INTEGER);
            cdolist_list_var = cdolist_list_var.rest();
            asent = cdolist_list_var.first();
        } 
        if (NIL == found_a_touP) {
            return subbed_rule_cnf;
        }
        final SubLObject new_neg_lits = nreverse(non_tou_neg_lits);
        final SubLObject stripped_cnf = clauses.make_clause(new_neg_lits, clauses.pos_lits(subbed_rule_cnf));
        return bindings.apply_bindings(tou_bindings, stripped_cnf);
    }

    public static SubLObject pph_subproof_matches_asent_p(final SubLObject subproof, final SubLObject asent, final SubLObject mt) {
        return equal(asent, pph_proof_el_formula(subproof, mt));
    }

    public static SubLObject pph_restriction_subproofs_and_bindings(final SubLObject transformation_proof) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        thread.resetMultipleValues();
        final SubLObject restriction_subproofs = pph_lookup_subproofs(transformation_proof);
        SubLObject non_base_hl_bindings = thread.secondMultipleValue();
        thread.resetMultipleValues();
        final SubLObject rule_bindings = inference_worker_transformation.transformation_proof_rule_bindings(transformation_proof);
        final SubLObject hypotheticals = intersection(rule_bindings, pph_vars.$pph_hypothetical_vars$.getDynamicValue(thread), symbol_function(EQL), symbol_function(CDR));
        final SubLObject non_hypothetical_bindingsP = makeBoolean(NIL != set_difference(non_base_hl_bindings, hypotheticals, symbol_function(EQL), symbol_function(CDR)));
        non_base_hl_bindings = append(non_base_hl_bindings, hypotheticals);
        return values(restriction_subproofs, unification.variable_base_inversion(non_base_hl_bindings), non_hypothetical_bindingsP);
    }

    public static SubLObject pph_lookup_subproofs(final SubLObject proof) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject subproofs = NIL;
        SubLObject v_bindings = NIL;
        SubLObject cdolist_list_var = inference_datastructures_proof.proof_direct_subproofs(proof);
        SubLObject subproof = NIL;
        subproof = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            final SubLObject variable_map = pph_subproof_to_proof_variable_map(proof, subproof);
            if (NIL != pph_lookup_proof_p(subproof)) {
                final SubLObject item_var = subproof;
                if (NIL == member(item_var, subproofs, symbol_function(EQL), symbol_function(IDENTITY))) {
                    subproofs = cons(item_var, subproofs);
                }
                if (NIL != list_utilities.singletonP(inference_datastructures_proof.proof_direct_subproofs(proof))) {
                    SubLObject cdolist_list_var_$244 = bindings.apply_bindings(variable_map, inference_datastructures_proof.proof_bindings(proof));
                    SubLObject binding = NIL;
                    binding = cdolist_list_var_$244.first();
                    while (NIL != cdolist_list_var_$244) {
                        final SubLObject var = binding;
                        if (NIL != var) {
                            v_bindings = cons(var, v_bindings);
                        }
                        cdolist_list_var_$244 = cdolist_list_var_$244.rest();
                        binding = cdolist_list_var_$244.first();
                    } 
                }
            } else
                if (NIL == inference_worker_transformation.transformation_proof_p(subproof)) {
                    thread.resetMultipleValues();
                    final SubLObject sub_subproofs = pph_lookup_subproofs(subproof);
                    SubLObject sub_bindings = thread.secondMultipleValue();
                    thread.resetMultipleValues();
                    sub_bindings = bindings.apply_bindings(variable_map, sub_bindings);
                    SubLObject sub_subproof = NIL;
                    SubLObject sub_subproof_$245 = NIL;
                    SubLObject binding2 = NIL;
                    SubLObject binding_$246 = NIL;
                    sub_subproof = sub_subproofs;
                    sub_subproof_$245 = sub_subproof.first();
                    binding2 = sub_bindings;
                    binding_$246 = binding2.first();
                    while ((NIL != binding2) || (NIL != sub_subproof)) {
                        final SubLObject item_var2 = sub_subproof_$245;
                        if (NIL == member(item_var2, subproofs, symbol_function(EQL), symbol_function(IDENTITY))) {
                            subproofs = cons(item_var2, subproofs);
                        }
                        final SubLObject var2 = binding_$246;
                        if (NIL != var2) {
                            v_bindings = cons(var2, v_bindings);
                        }
                        sub_subproof = sub_subproof.rest();
                        sub_subproof_$245 = sub_subproof.first();
                        binding2 = binding2.rest();
                        binding_$246 = binding2.first();
                    } 
                }

            cdolist_list_var = cdolist_list_var.rest();
            subproof = cdolist_list_var.first();
        } 
        return values(list_utilities.remove_if_not(PROOF_P, subproofs, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED), v_bindings);
    }

    public static SubLObject pph_subproof_to_proof_variable_map(final SubLObject proof, final SubLObject subproof) {
        final SubLObject link = inference_datastructures_proof.proof_link(proof);
        final SubLObject problem = inference_datastructures_proof.proof_supported_problem(subproof);
        SubLObject mapped_problem = NIL;
        final SubLObject link_var = link;
        SubLObject rest;
        SubLObject supporting_mapped_problem;
        for (rest = NIL, rest = inference_datastructures_problem_link.problem_link_supporting_mapped_problems(link_var); (NIL == mapped_problem) && (NIL != rest); rest = rest.rest()) {
            supporting_mapped_problem = rest.first();
            if ((NIL != inference_macros.do_problem_link_open_matchP(NIL, link_var, supporting_mapped_problem)) && problem.eql(inference_datastructures_problem_link.mapped_problem_problem(supporting_mapped_problem))) {
                mapped_problem = supporting_mapped_problem;
            }
        }
        return NIL != inference_datastructures_problem_link.mapped_problem_p(mapped_problem) ? inference_datastructures_problem_link.mapped_problem_variable_map(mapped_problem) : NIL;
    }

    public static SubLObject pph_lookup_proof_p(final SubLObject proof) {
        if (NIL != inference_worker_removal.removal_proof_p(proof)) {
            final SubLObject supports = inference_datastructures_proof.proof_supports(proof);
            if (NIL != list_utilities.singletonP(supports)) {
                final SubLObject assertion = pph_find_assertion_for_support(supports.first());
                return makeBoolean((NIL != assertion_handles.assertion_p(assertion)) && (NIL != assertions_high.asserted_assertionP(assertion)));
            }
        }
        return NIL;
    }

    public static SubLObject pph_proof_subproofs(final SubLObject proof) {
        final SubLObject subproofs = copy_list(inference_datastructures_proof.proof_direct_subproofs(proof));
        final SubLObject explanatory_subproofs = set_difference(subproofs, pph_non_explanatory_proofs(), UNPROVIDED, UNPROVIDED);
        final SubLObject sorted_subproofs = Sort.sort(explanatory_subproofs, symbol_function($sym23$_), PROOF_SUID);
        return sorted_subproofs;
    }

    public static SubLObject pph_proof_conclusion_internal(final SubLObject proof, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = proof_view.pph_proof_mt(proof);
        }
        final SubLObject el_formula = pph_proof_el_formula(proof, mt);
        final SubLObject isomorphic_assertion = (NIL != check_for_isomorphic_assertionP(el_formula)) ? czer_meta.find_assertion_cycl(el_formula, mt) : NIL;
        if (NIL != isomorphic_assertion) {
            return isomorphic_assertion;
        }
        if (NIL == pph_proof_wX_isomorphic_support_p(proof)) {
            return el_formula;
        }
        final SubLObject support = pph_sub_isomorphic_assertions_into_supports(inference_datastructures_proof.proof_supports(proof)).first();
        if (NIL != pph_hypothesized_supportP(support, mt)) {
            return el_formula;
        }
        if (NIL != assertion_handles.assertion_p(support)) {
            return support;
        }
        return arguments.support_el_sentence(support);
    }

    public static SubLObject pph_proof_conclusion(final SubLObject proof, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = proof_view.pph_proof_mt(proof);
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
        SubLObject caching_state = NIL;
        if (NIL == v_memoization_state) {
            return pph_proof_conclusion_internal(proof, mt);
        }
        caching_state = memoization_state.memoization_state_lookup(v_memoization_state, PPH_PROOF_CONCLUSION, UNPROVIDED);
        if (NIL == caching_state) {
            caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), PPH_PROOF_CONCLUSION, TWO_INTEGER, NIL, EQUAL, UNPROVIDED);
            memoization_state.memoization_state_put(v_memoization_state, PPH_PROOF_CONCLUSION, caching_state);
        }
        final SubLObject sxhash = memoization_state.sxhash_calc_2(proof, mt);
        final SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, UNPROVIDED);
        if (!collisions.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            SubLObject cdolist_list_var = collisions;
            SubLObject collision = NIL;
            collision = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                SubLObject cached_args = collision.first();
                final SubLObject results2 = second(collision);
                if (proof.equal(cached_args.first())) {
                    cached_args = cached_args.rest();
                    if (((NIL != cached_args) && (NIL == cached_args.rest())) && mt.equal(cached_args.first())) {
                        return memoization_state.caching_results(results2);
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                collision = cdolist_list_var.first();
            } 
        }
        final SubLObject results3 = arg2(thread.resetMultipleValues(), multiple_value_list(pph_proof_conclusion_internal(proof, mt)));
        memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results3, list(proof, mt));
        return memoization_state.caching_results(results3);
    }

    public static SubLObject check_for_isomorphic_assertionP(final SubLObject el_formula) {
        return makeBoolean((NIL != el_atomic_sentenceP(el_formula)) && (NIL == formula_too_complex_for_proof_paraphraseP(el_formula, UNPROVIDED)));
    }

    public static SubLObject formula_too_complex_for_proof_paraphraseP(final SubLObject el_formula, SubLObject depth) {
        if (depth == UNPROVIDED) {
            depth = ZERO_INTEGER;
        }
        if (depth.numG(FIVE_INTEGER)) {
            return T;
        }
        if (NIL == list_utilities.proper_list_p(el_formula)) {
            return NIL;
        }
        if (NIL != list_utilities.lengthG(el_formula, TWELVE_INTEGER, UNPROVIDED)) {
            return T;
        }
        final SubLObject new_depth = number_utilities.f_1X(depth);
        SubLObject cdolist_list_var = el_formula;
        SubLObject v_term = NIL;
        v_term = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if (NIL != formula_too_complex_for_proof_paraphraseP(v_term, new_depth)) {
                return T;
            }
            cdolist_list_var = cdolist_list_var.rest();
            v_term = cdolist_list_var.first();
        } 
        return NIL;
    }

    public static SubLObject pph_proof_el_formula(final SubLObject proof, final SubLObject mt) {
        final SubLObject query_el_formula = inference_czer.contextualized_dnf_clauses_formula(inference_worker.proof_proven_query(proof), mt);
        return pph_sentence_replace_redundant_narts(query_el_formula);
    }

    public static SubLObject pph_proof_wX_isomorphic_support_p(final SubLObject proof) {
        final SubLObject proof_supports = inference_datastructures_proof.proof_supports(proof);
        if ((NIL != list_utilities.singletonP(proof_supports)) && (NIL != inference_worker_removal.removal_proof_p(proof))) {
            final SubLObject support = proof_supports.first();
            return makeBoolean((NIL != arguments.hl_support_p(support)) || (NIL != assertions_high.gaf_assertionP(support)));
        }
        return NIL;
    }

    public static SubLObject pph_sub_isomorphic_assertions_into_supports(final SubLObject supports) {
        return transform_list_utilities.transform(supports, $sym396$PPH_HL_SUPPORT_WITH_ISOMORPHIC_ASSERTION_, PPH_FIND_ASSERTION_FOR_SUPPORT, UNPROVIDED);
    }

    public static SubLObject pph_hl_support_with_isomorphic_assertionP(final SubLObject v_object) {
        return makeBoolean(((NIL != arguments.hl_support_p(v_object)) || (NIL != kb_hl_support_handles.kb_hl_support_p(v_object))) && (NIL != pph_find_assertion_for_support(v_object)));
    }

    public static SubLObject pph_find_assertion_for_support(final SubLObject support) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != assertion_handles.assertion_p(support)) {
            return support;
        }
        if ($ASSERTION == arguments.support_module(support)) {
            return fi.sentence_assertion(arguments.support_sentence(support), arguments.support_mt(support));
        }
        final SubLObject sentence = arguments.support_sentence(support);
        final SubLObject support_mt = arguments.support_mt(support);
        if (NIL == check_for_isomorphic_assertionP(sentence)) {
            return NIL;
        }
        thread.resetMultipleValues();
        final SubLObject cnfs = clausifier.clausal_form(sentence, support_mt, UNPROVIDED);
        final SubLObject mt = thread.secondMultipleValue();
        thread.resetMultipleValues();
        return pph_find_assertion_from_cnfs(cnfs, mt);
    }

    public static SubLObject pph_find_assertion_from_cnfs(final SubLObject cnfs, final SubLObject mt) {
        SubLObject isomorphic_assertion = NIL;
        if (!cnfs.isList()) {
            return NIL;
        }
        if (NIL == isomorphic_assertion) {
            SubLObject csome_list_var;
            SubLObject cnf;
            for (csome_list_var = cnfs, cnf = NIL, cnf = csome_list_var.first(); (NIL == isomorphic_assertion) && (NIL != csome_list_var); isomorphic_assertion = pph_find_assertion_from_cnf(cnf, mt) , csome_list_var = csome_list_var.rest() , cnf = csome_list_var.first()) {
            }
        }
        return isomorphic_assertion;
    }

    public static SubLObject pph_find_assertion_from_cnf(final SubLObject cnf, final SubLObject mt) {
        if (mt.eql($$EverythingPSC) || mt.eql($$InferencePSC)) {
            return kb_indexing.find_assertion_any_mt(cnf);
        }
        return kb_indexing.find_assertion_genl_mts(cnf, mt);
    }

    public static SubLObject pph_assertion_support_tree(final SubLObject as, SubLObject supported_assertions) {
        if (supported_assertions == UNPROVIDED) {
            supported_assertions = set.new_set(UNPROVIDED, UNPROVIDED);
        }
        final SubLObject all_deductions = list_utilities.remove_if_not(DEDUCTION_P, assertions_high.assertion_arguments(as), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        final SubLObject sorted_deductions = Sort.sort(all_deductions, EARLIER_DEDUCTION_P, UNPROVIDED);
        SubLObject support_tree = NIL;
        final SubLObject all_supported_assertions = set.copy_set(supported_assertions);
        set.set_add(as, all_supported_assertions);
        if (NIL == support_tree) {
            SubLObject csome_list_var = sorted_deductions;
            SubLObject deduction = NIL;
            deduction = csome_list_var.first();
            while ((NIL == support_tree) && (NIL != csome_list_var)) {
                SubLObject support_trees = NIL;
                final SubLObject deduction_supports = pph_sub_isomorphic_assertions_into_supports(deductions_high.deduction_supports(deduction));
                SubLObject circularP = NIL;
                if (NIL == circularP) {
                    SubLObject csome_list_var_$247 = deduction_supports;
                    SubLObject deduction_support = NIL;
                    deduction_support = csome_list_var_$247.first();
                    while ((NIL == circularP) && (NIL != csome_list_var_$247)) {
                        if ((NIL != set_utilities.set_find(pph_support_sentence(deduction_support, UNPROVIDED), all_supported_assertions, symbol_function(EQUAL), ASSERTION_FORMULA)) && (NIL != set_utilities.set_find(arguments.support_mt(deduction_support), all_supported_assertions, symbol_function(EQUAL), ASSERTION_MT))) {
                            circularP = T;
                        } else {
                            final SubLObject meta_support_tree = pph_meta_support_tree(deduction_support, all_supported_assertions);
                            if (NIL == meta_support_tree) {
                                circularP = T;
                            } else {
                                support_trees = cons(meta_support_tree, support_trees);
                            }
                        }
                        csome_list_var_$247 = csome_list_var_$247.rest();
                        deduction_support = csome_list_var_$247.first();
                    } 
                }
                if (NIL == circularP) {
                    support_tree = cons(as, nreverse(support_trees));
                }
                csome_list_var = csome_list_var.rest();
                deduction = csome_list_var.first();
            } 
        }
        if (NIL != list_utilities.proper_list_p(support_tree)) {
            return support_tree;
        }
        if (NIL != assertions_high.asserted_assertionP(as)) {
            return list(as);
        }
        return NIL;
    }

    public static SubLObject pph_meta_support_tree(final SubLObject support, final SubLObject supported_assertions) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject meta_support_tree = NIL;
        final SubLObject _prev_bind_0 = $pph_meta_support_level$.currentBinding(thread);
        try {
            $pph_meta_support_level$.bind($pph_meta_support_level$.getDynamicValue(thread).isInteger() ? number_utilities.f_1X($pph_meta_support_level$.getDynamicValue(thread)) : ONE_INTEGER, thread);
            if (!$pph_meta_support_level$.getDynamicValue(thread).numG($pph_meta_support_max$.getGlobalValue())) {
                if (NIL != assertion_handles.assertion_p(support)) {
                    meta_support_tree = pph_assertion_support_tree(support, supported_assertions);
                } else
                    if (NIL != arguments.hl_support_p(support)) {
                        final SubLObject meta_supports = remove(support, pph_meta_supports(support), symbol_function(EQUAL), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                        meta_support_tree = pph_support_tree_from_supports(support, meta_supports, supported_assertions);
                    }

            }
        } finally {
            $pph_meta_support_level$.rebind(_prev_bind_0, thread);
        }
        if (((NIL != meta_support_tree) && (!SubLSystemTrampolineFile.assertionsDisabledInClass)) && (NIL == pph_support_tree_p(meta_support_tree))) {
            throw new AssertionError(meta_support_tree);
        }
        return meta_support_tree;
    }

    public static SubLObject pph_support_tree_from_supports(final SubLObject supported, final SubLObject supports, SubLObject supported_assertions) {
        if (supported_assertions == UNPROVIDED) {
            supported_assertions = set.new_set(UNPROVIDED, UNPROVIDED);
        }
        SubLObject support_trees = NIL;
        SubLObject circularP = NIL;
        if (NIL == circularP) {
            SubLObject csome_list_var = supports;
            SubLObject support = NIL;
            support = csome_list_var.first();
            while ((NIL == circularP) && (NIL != csome_list_var)) {
                if (NIL != set_utilities.set_find(pph_support_sentence(support, UNPROVIDED), supported_assertions, symbol_function(EQUAL), ASSERTION_FORMULA)) {
                    circularP = T;
                } else {
                    final SubLObject support_tree = pph_meta_support_tree(support, supported_assertions);
                    if (NIL == support_tree) {
                        circularP = T;
                    } else {
                        support_trees = cons(support_tree, support_trees);
                    }
                }
                csome_list_var = csome_list_var.rest();
                support = csome_list_var.first();
            } 
        }
        if (NIL != circularP) {
            return NIL;
        }
        final SubLObject support_tree2 = cons(supported, nreverse(support_trees));
        assert NIL != pph_support_tree_p(support_tree2) : "pph_proof.pph_support_tree_p(support_tree2) " + "CommonSymbols.NIL != pph_proof.pph_support_tree_p(support_tree2) " + support_tree2;
        return support_tree2;
    }

    public static SubLObject pph_support_tree_p(final SubLObject v_object) {
        return makeBoolean(((NIL != list_utilities.proper_list_p(v_object)) && (NIL != arguments.support_p(pph_support_tree_supported(v_object)))) && (NIL != list_utilities.list_of_type_p(PPH_SUPPORT_TREE_P, v_object.rest())));
    }

    public static SubLObject pph_support_tree_supported(final SubLObject support_tree) {
        return support_tree.first();
    }

    public static SubLObject pph_support_tree_supporters(final SubLObject support_tree) {
        return support_tree.rest();
    }

    public static SubLObject pph_support_tree_sentence(final SubLObject support_tree) {
        SubLObject support = NIL;
        SubLObject subnodes = NIL;
        destructuring_bind_must_consp(support_tree, support_tree, $list403);
        support = support_tree.first();
        final SubLObject current = subnodes = support_tree.rest();
        return pph_support_sentence(support, UNPROVIDED);
    }

    public static SubLObject pph_assertion_supports(SubLObject as, SubLObject prefer_deduced_argumentsP, SubLObject circular_support_sentences) {
        if (prefer_deduced_argumentsP == UNPROVIDED) {
            prefer_deduced_argumentsP = T;
        }
        if (circular_support_sentences == UNPROVIDED) {
            circular_support_sentences = set.new_set(symbol_function(EQUAL), UNPROVIDED);
        }
        SubLObject supports = NIL;
        if ((NIL != prefer_deduced_argumentsP) || (NIL == assertions_high.asserted_assertionP(as))) {
            final SubLObject maybe_better_assertion = pph_find_isomorphic_assertion_in_higher_mt(as, NIL);
            if (NIL != assertion_handles.assertion_p(maybe_better_assertion)) {
                as = maybe_better_assertion;
            }
            final SubLObject all_deductions = list_utilities.remove_if_not(DEDUCTION_P, assertions_high.assertion_arguments(as), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            final SubLObject dependent_assertions = assertions_interface.all_dependent_assertions(as);
            if (NIL == supports) {
                SubLObject csome_list_var = Sort.sort(all_deductions, $sym404$PPH_PREFER_DEDUCTION_, UNPROVIDED);
                SubLObject argument = NIL;
                argument = csome_list_var.first();
                while ((NIL == supports) && (NIL != csome_list_var)) {
                    final SubLObject deduction_supports = pph_sub_isomorphic_assertions_into_supports(deductions_high.deduction_supports(argument));
                    SubLObject circularP = NIL;
                    if (NIL == circularP) {
                        SubLObject csome_list_var_$248 = deduction_supports;
                        SubLObject deduction_support = NIL;
                        deduction_support = csome_list_var_$248.first();
                        while ((NIL == circularP) && (NIL != csome_list_var_$248)) {
                            if ((NIL != set.set_memberP(pph_support_sentence(deduction_support, UNPROVIDED), circular_support_sentences)) || (NIL != subl_promotions.memberP(deduction_support, dependent_assertions, UNPROVIDED, UNPROVIDED))) {
                                circularP = T;
                            }
                            csome_list_var_$248 = csome_list_var_$248.rest();
                            deduction_support = csome_list_var_$248.first();
                        } 
                    }
                    if ((NIL == circularP) && (NIL != remove_if($sym16$PPH_IRRELEVANT_SUPPORT_, deduction_supports, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED))) {
                        supports = deduction_supports;
                    }
                    csome_list_var = csome_list_var.rest();
                    argument = csome_list_var.first();
                } 
            }
        }
        if (NIL == supports) {
            supports = list(as);
        }
        return supports;
    }

    public static SubLObject pph_prefer_deductionP(final SubLObject d1, final SubLObject d2) {
        if ((NIL != cycl_utilities.expression_find($$rewriteOf, deductions_high.deduction_supports(d2), EXPRESSION_FIND, UNPROVIDED, UNPROVIDED)) && (NIL == cycl_utilities.expression_find($$rewriteOf, deductions_high.deduction_supports(d1), EXPRESSION_FIND, UNPROVIDED, UNPROVIDED))) {
            return T;
        }
        if ((NIL != cycl_utilities.expression_find($$rewriteOf, deductions_high.deduction_supports(d1), EXPRESSION_FIND, UNPROVIDED, UNPROVIDED)) && (NIL == cycl_utilities.expression_find($$rewriteOf, deductions_high.deduction_supports(d2), EXPRESSION_FIND, UNPROVIDED, UNPROVIDED))) {
            return NIL;
        }
        if ((NIL != find_if($sym406$PPH_ASSERTION_HAS_GLOSS_, list_utilities.remove_if_not($sym53$RULE_ASSERTION_, deductions_high.deduction_supports(d1), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED), UNPROVIDED, UNPROVIDED, UNPROVIDED)) && (NIL == find_if($sym406$PPH_ASSERTION_HAS_GLOSS_, list_utilities.remove_if_not($sym53$RULE_ASSERTION_, deductions_high.deduction_supports(d2), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED), UNPROVIDED, UNPROVIDED, UNPROVIDED))) {
            return T;
        }
        if ((NIL != find_if($sym406$PPH_ASSERTION_HAS_GLOSS_, list_utilities.remove_if_not($sym53$RULE_ASSERTION_, deductions_high.deduction_supports(d2), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED), UNPROVIDED, UNPROVIDED, UNPROVIDED)) && (NIL == find_if($sym406$PPH_ASSERTION_HAS_GLOSS_, list_utilities.remove_if_not($sym53$RULE_ASSERTION_, deductions_high.deduction_supports(d1), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED), UNPROVIDED, UNPROVIDED, UNPROVIDED))) {
            return NIL;
        }
        if (NIL != earlier_deduction_p(d1, d2)) {
            return T;
        }
        return NIL;
    }

    public static SubLObject pph_find_isomorphic_assertion_in_higher_mt(final SubLObject as, SubLObject allow_redundant_nart_equalityP) {
        if (allow_redundant_nart_equalityP == UNPROVIDED) {
            allow_redundant_nart_equalityP = NIL;
        }
        SubLObject better_as = NIL;
        if (NIL != assertions_high.gaf_assertionP(as)) {
            final SubLObject as_formula = pph_support_sentence(as, allow_redundant_nart_equalityP);
            final SubLObject as_mt = assertions_high.assertion_mt(as);
            better_as = pph_gaf_with_formula_in_higher_mt(as_formula, as_mt, allow_redundant_nart_equalityP);
        }
        return better_as;
    }

    public static SubLObject pph_gaf_with_formula_in_higher_mt(final SubLObject gaf_formula, final SubLObject mt, final SubLObject allow_redundant_nart_equalityP) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject match = NIL;
        SubLObject pred = NIL;
        SubLObject arg1 = NIL;
        SubLObject other_args = NIL;
        destructuring_bind_must_consp(gaf_formula, gaf_formula, $list407);
        pred = gaf_formula.first();
        SubLObject current = gaf_formula.rest();
        destructuring_bind_must_consp(current, gaf_formula, $list407);
        arg1 = current.first();
        current = other_args = current.rest();
        final SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate(mt);
        final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
        try {
            mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
            mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
            mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
            final SubLObject pred_var = pred;
            if (NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(arg1, NIL, pred_var)) {
                final SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(arg1, NIL, pred_var);
                SubLObject done_var = match;
                final SubLObject token_var = NIL;
                while (NIL == done_var) {
                    final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                    final SubLObject valid = makeBoolean(!token_var.eql(final_index_spec));
                    if (NIL != valid) {
                        SubLObject final_index_iterator = NIL;
                        try {
                            final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $GAF, NIL, NIL);
                            SubLObject done_var_$249 = match;
                            final SubLObject token_var_$250 = NIL;
                            while (NIL == done_var_$249) {
                                final SubLObject gaf = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$250);
                                final SubLObject valid_$251 = makeBoolean(!token_var_$250.eql(gaf));
                                if ((NIL != valid_$251) && (NIL != pph_gaf_with_formula_in_not_lower_mtP(gaf, gaf_formula, mt, allow_redundant_nart_equalityP))) {
                                    final SubLObject even_match = pph_find_isomorphic_assertion_in_higher_mt(gaf, UNPROVIDED);
                                    match = (NIL != even_match) ? even_match : gaf;
                                }
                                done_var_$249 = makeBoolean((NIL == valid_$251) || (NIL != match));
                            } 
                        } finally {
                            final SubLObject _prev_bind_0_$252 = $is_thread_performing_cleanupP$.currentBinding(thread);
                            try {
                                $is_thread_performing_cleanupP$.bind(T, thread);
                                final SubLObject _values = getValuesAsVector();
                                if (NIL != final_index_iterator) {
                                    kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                }
                                restoreValuesFromVector(_values);
                            } finally {
                                $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$252, thread);
                            }
                        }
                    }
                    done_var = makeBoolean((NIL == valid) || (NIL != match));
                } 
            }
        } finally {
            mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_3, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
        }
        return match;
    }

    public static SubLObject pph_gaf_with_formula_in_not_lower_mtP(final SubLObject gaf, final SubLObject gaf_formula, final SubLObject mt, final SubLObject allow_redundant_nart_equalityP) {
        final SubLObject matchP = makeBoolean(((!assertions_high.assertion_mt(gaf).eql(mt)) && pph_support_sentence(gaf, allow_redundant_nart_equalityP).equal(gaf_formula)) && (NIL == genl_mts.genl_mtP(assertions_high.assertion_mt(gaf), mt, UNPROVIDED, UNPROVIDED)));
        return matchP;
    }

    public static SubLObject earlier_deduction_p(final SubLObject deduction1, final SubLObject deduction2) {
        return numL(deduction_handles.deduction_id(deduction1), deduction_handles.deduction_id(deduction2));
    }

    public static SubLObject pph_meta_supports(final SubLObject support) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != sksi_infrastructure_utilities.sksi_support_p(support)) {
            return NIL;
        }
        if (NIL != kb_hl_support_handles.kb_hl_support_p(support)) {
            return pph_meta_supports(kb_hl_supports_high.kb_hl_support_hl_support(support));
        }
        if (NIL != assertion_handles.assertion_p(support)) {
            final SubLObject prefer_deduced_argumentsP = makeBoolean((NIL != $pph_prefer_deduced_meta_supportsP$.getDynamicValue(thread)) || (NIL != isa.isaP(hlmt.hlmt_monad_mt(hlmt.assertion_hlmt(support)), $$HypotheticalContext, UNPROVIDED, UNPROVIDED)));
            return pph_assertion_supports(support, prefer_deduced_argumentsP, UNPROVIDED);
        }
        if (NIL != pph_not_isa_supportP(support)) {
            return pph_not_isa_supports(support);
        }
        if (arguments.support_module(support).eql($DISJOINTWITH)) {
            return pph_supports_for_disjoint_support(support);
        }
        if (NIL != pph_isa_supportP(support)) {
            return pph_isa_supports(support);
        }
        if (NIL != pph_genls_supportP(support)) {
            return pph_genls_supports(support);
        }
        return pph_default_meta_supports(support);
    }

    public static SubLObject pph_default_meta_supports(final SubLObject support) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject hl_justify_result = hl_supports.hl_justify(support);
        final SubLObject support_module = arguments.support_module(support);
        SubLObject literals_to_suppress = NIL;
        SubLObject ans = NIL;
        if (NIL != arguments.supports_p(hl_justify_result)) {
            SubLObject cdolist_list_var = hl_justify_result;
            SubLObject meta_support = NIL;
            meta_support = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                if (NIL != pph_always_show_meta_support_for_moduleP(meta_support, support_module)) {
                    ans = cons(meta_support, ans);
                } else
                    if (NIL == pph_irrelevant_supportP(meta_support, UNPROVIDED, UNPROVIDED)) {
                        ans = cons(meta_support, ans);
                    } else
                        if (NIL != assertions_high.rule_assertionP(meta_support)) {
                            literals_to_suppress = union(literals_to_suppress, pph_rule_literals_to_suppress(meta_support, UNPROVIDED), symbol_function(EQUAL), UNPROVIDED);
                        } else
                            if ($pph_meta_supports_depth$.getDynamicValue(thread).numL($pph_meta_supports_max_depth$.getDynamicValue(thread)) && (NIL == pph_support_trivialP(meta_support, UNPROVIDED))) {
                                final SubLObject _prev_bind_0 = $pph_meta_supports_depth$.currentBinding(thread);
                                try {
                                    $pph_meta_supports_depth$.bind(number_utilities.f_1X($pph_meta_supports_depth$.getDynamicValue(thread)), thread);
                                    SubLObject cdolist_list_var_$253 = pph_meta_supports(meta_support);
                                    SubLObject meta_meta_support = NIL;
                                    meta_meta_support = cdolist_list_var_$253.first();
                                    while (NIL != cdolist_list_var_$253) {
                                        if (NIL == pph_irrelevant_supportP(meta_meta_support, UNPROVIDED, UNPROVIDED)) {
                                            final SubLObject item_var = meta_meta_support;
                                            if (NIL == member(item_var, ans, symbol_function(EQUAL), symbol_function(SUPPORT_SENTENCE))) {
                                                ans = cons(item_var, ans);
                                            }
                                        } else
                                            if (NIL != assertions_high.rule_assertionP(meta_meta_support)) {
                                                literals_to_suppress = union(literals_to_suppress, pph_rule_literals_to_suppress(meta_meta_support, UNPROVIDED), symbol_function(EQUAL), UNPROVIDED);
                                            }

                                        cdolist_list_var_$253 = cdolist_list_var_$253.rest();
                                        meta_meta_support = cdolist_list_var_$253.first();
                                    } 
                                } finally {
                                    $pph_meta_supports_depth$.rebind(_prev_bind_0, thread);
                                }
                            }



                cdolist_list_var = cdolist_list_var.rest();
                meta_support = cdolist_list_var.first();
            } 
            if ((NIL != literals_to_suppress) && (NIL != ans)) {
                ans = pph_prune_meta_supports(ans, literals_to_suppress);
            }
        }
        return ans;
    }

    public static SubLObject pph_invalid_supportP(final SubLObject v_object) {
        if (NIL != assertion_handles.assertion_p(v_object)) {
            return assertions_high.invalid_assertion(v_object, UNPROVIDED);
        }
        if (NIL != arguments.hl_support_p(v_object)) {
            return makeBoolean(NIL == pph_hl_verify(v_object));
        }
        if (NIL == arguments.support_p(v_object)) {
            return NIL;
        }
        return NIL;
    }

    public static SubLObject pph_hl_verify(final SubLObject hl_support) {
        SubLObject okP = hl_supports.hl_verify(hl_support);
        if (NIL == okP) {
            okP = pph_hl_verify_via_removal_ask(hl_support);
            if (NIL != okP) {
                Errors.warn($str409$HL_VERIFY_failure_on_valid_suppor, hl_support);
            }
        }
        return okP;
    }

    public static SubLObject pph_hl_verify_via_removal_ask(final SubLObject hl_support) {
        final SubLObject v_properties = $list410;
        final SubLObject mt = arguments.support_mt(hl_support);
        return cyc_kernel.closed_query_success_result_p(inference_kernel.new_cyc_query(arguments.support_sentence(hl_support), mt, v_properties));
    }

    public static SubLObject pph_isa_supportP(final SubLObject support) {
        return makeBoolean((arguments.support_truth(support) == $TRUE) && (NIL != el_formula_with_operator_p(arguments.support_sentence(support), $$isa)));
    }

    public static SubLObject pph_genls_supportP(final SubLObject support) {
        return makeBoolean((arguments.support_truth(support) == $TRUE) && (NIL != el_formula_with_operator_p(arguments.support_sentence(support), $$genls)));
    }

    public static SubLObject pph_genls_supports(final SubLObject support) {
        SubLObject current;
        final SubLObject datum = current = cycl_utilities.formula_args(arguments.support_sentence(support), UNPROVIDED);
        SubLObject spec = NIL;
        SubLObject genl = NIL;
        destructuring_bind_must_consp(current, datum, $list411);
        spec = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list411);
        genl = current.first();
        current = current.rest();
        if (NIL == current) {
            final SubLObject support_mt = arguments.support_mt(support);
            final SubLObject highest_thcl = find_thcl_genls_between(spec, genl, support_mt, $ASCENDING, NIL);
            if (NIL != highest_thcl) {
                return list(arguments.make_hl_support($GENLS, make_binary_formula($$genls, spec, highest_thcl), support_mt, UNPROVIDED), arguments.make_hl_support($GENLS, make_binary_formula($$genls, highest_thcl, genl), support_mt, UNPROVIDED));
            }
        } else {
            cdestructuring_bind_error(datum, $list411);
        }
        return pph_default_meta_supports(support);
    }

    public static SubLObject pph_isa_supports(final SubLObject isa_support) {
        final SubLObject raw_supports = ((NIL != arguments.support_p(isa_support)) && (NIL == assertion_handles.assertion_p(isa_support))) ? hl_supports.hl_justify(isa_support) : NIL;
        SubLObject abortP = list_utilities.lengthL(raw_supports, THREE_INTEGER, UNPROVIDED);
        final SubLObject focus_term = cycl_utilities.formula_arg1(pph_support_sentence(isa_support, UNPROVIDED), UNPROVIDED);
        SubLObject curr_isa = NIL;
        SubLObject curr_genl = NIL;
        SubLObject new_supports = NIL;
        if (NIL == abortP) {
            SubLObject csome_list_var = raw_supports;
            SubLObject raw_support = NIL;
            raw_support = csome_list_var.first();
            while ((NIL == abortP) && (NIL != csome_list_var)) {
                if ((NIL == new_supports) && (((NIL == assertion_handles.assertion_p(raw_support)) || (NIL == pph_isa_supportP(raw_support))) || (!assertions_high.gaf_arg1(raw_support).equal(focus_term)))) {
                    abortP = T;
                } else
                    if (NIL == new_supports) {
                        new_supports = cons(raw_support, new_supports);
                        curr_isa = assertions_high.gaf_arg2(raw_support);
                        curr_genl = assertions_high.gaf_arg2(raw_support);
                    } else
                        if ((((NIL != pph_genls_supportP(raw_support)) && (NIL != assertion_handles.assertion_p(raw_support))) && assertions_high.gaf_arg1(raw_support).equal(curr_genl)) && (NIL == pph_utilities.pph_irrelevant_fort(assertions_high.gaf_arg2(raw_support), UNPROVIDED, UNPROVIDED))) {
                            curr_genl = assertions_high.gaf_arg2(raw_support);
                            if (NIL != pph_utilities.pph_irrelevant_fort(curr_isa, UNPROVIDED, UNPROVIDED)) {
                                curr_isa = curr_genl;
                                new_supports = list(arguments.make_hl_support(arguments.support_module(isa_support), replace_formula_arg(TWO_INTEGER, curr_isa, arguments.support_sentence(isa_support)), arguments.support_mt(isa_support), enumeration_types.tv_from_truth_strength(arguments.support_truth(isa_support), arguments.support_strength(isa_support))));
                            }
                        } else {
                            abortP = T;
                        }


                csome_list_var = csome_list_var.rest();
                raw_support = csome_list_var.first();
            } 
        }
        if ((((NIL != abortP) || (NIL == curr_genl)) || (NIL == curr_isa)) || curr_genl.equal(curr_isa)) {
            return raw_supports;
        }
        final SubLObject genls_support_sentence = make_binary_formula($$genls, curr_isa, curr_genl);
        final SubLObject new_genls_support = arguments.make_hl_support($GENLS, genls_support_sentence, arguments.support_mt(isa_support), UNPROVIDED);
        new_supports = cons(new_genls_support, new_supports);
        return nreverse(new_supports);
    }

    public static SubLObject pph_not_isa_supportP(final SubLObject support) {
        final SubLObject sentence = arguments.support_sentence(support);
        final SubLObject pred = cycl_utilities.formula_operator(sentence);
        return makeBoolean((NIL != subl_promotions.memberP(pred, $list414, UNPROVIDED, UNPROVIDED)) && (NIL != el_formula_with_operator_p(cycl_utilities.formula_arg1(sentence, UNPROVIDED), $$isa)));
    }

    public static SubLObject pph_not_isa_supports(final SubLObject support) {
        final SubLObject isa_sentence = cycl_utilities.formula_arg1(pph_support_sentence(support, UNPROVIDED), UNPROVIDED);
        final SubLObject mt = arguments.support_mt(support);
        if (NIL != pph_isa_genls_type_violation_supportP(support)) {
            final SubLObject genls_sentence = make_el_formula($$genls, cycl_utilities.formula_args(isa_sentence, UNPROVIDED), UNPROVIDED);
            return list(arguments.make_hl_support($GENLS, genls_sentence, mt, UNPROVIDED));
        }
        final SubLObject raw_supports = hl_supports.hl_justify(support);
        final SubLObject first_support = raw_supports.first();
        if (NIL != el_formula_with_operator_p(arguments.support_sentence(first_support), $$isa)) {
            final SubLObject not_isa_col = cycl_utilities.formula_arg2(isa_sentence, UNPROVIDED);
            final SubLObject first_isa_col = cycl_utilities.formula_arg2(pph_support_sentence(first_support, UNPROVIDED), UNPROVIDED);
            if (NIL != disjoint_with.collections_disjointP(not_isa_col, first_isa_col, mt)) {
                return list(first_support, arguments.make_hl_support($DISJOINTWITH, make_binary_formula($$disjointWith, first_isa_col, not_isa_col), mt, UNPROVIDED));
            }
        }
        return raw_supports;
    }

    public static SubLObject pph_isa_genls_type_violation_supportP(final SubLObject support) {
        final SubLObject sentence = pph_support_sentence(support, UNPROVIDED);
        final SubLObject pred = cycl_utilities.formula_operator(sentence);
        if (NIL != subl_promotions.memberP(pred, $list414, UNPROVIDED, UNPROVIDED)) {
            final SubLObject core_sentence = cycl_utilities.formula_arg1(sentence, UNPROVIDED);
            if ((NIL != el_formula_with_operator_p(core_sentence, $$isa)) && (!cycl_utilities.formula_arg1(core_sentence, UNPROVIDED).equal(cycl_utilities.formula_arg2(core_sentence, UNPROVIDED)))) {
                final SubLObject mt = arguments.support_mt(support);
                final SubLObject args = cycl_utilities.formula_args(core_sentence, UNPROVIDED);
                return list_utilities.sublisp_boolean(backward.removal_ask(make_el_formula($$genls, args, UNPROVIDED), mt, UNPROVIDED, UNPROVIDED));
            }
        }
        return NIL;
    }

    public static SubLObject pph_supports_for_disjoint_support(final SubLObject support) {
        final SubLObject sentence = pph_support_sentence(support, UNPROVIDED);
        SubLObject supports = NIL;
        if (NIL != formula_arityE(sentence, TWO_INTEGER, UNPROVIDED)) {
            SubLObject current;
            final SubLObject datum = current = cycl_utilities.formula_args(sentence, UNPROVIDED);
            SubLObject col1 = NIL;
            SubLObject col2 = NIL;
            destructuring_bind_must_consp(current, datum, $list416);
            col1 = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list416);
            col2 = current.first();
            current = current.rest();
            if (NIL == current) {
                SubLObject doneP = NIL;
                final SubLObject mt = arguments.support_mt(support);
                if (NIL == doneP) {
                    SubLObject csome_list_var = hl_supports.hl_justify(support);
                    SubLObject meta_support = NIL;
                    meta_support = csome_list_var.first();
                    while ((NIL == doneP) && (NIL != csome_list_var)) {
                        if ($$disjointWith.eql(cycl_utilities.formula_arg0(arguments.support_sentence(meta_support)))) {
                            SubLObject current_$255;
                            final SubLObject datum_$254 = current_$255 = cycl_utilities.formula_args(arguments.support_sentence(meta_support), UNPROVIDED);
                            SubLObject genl1 = NIL;
                            SubLObject genl2 = NIL;
                            destructuring_bind_must_consp(current_$255, datum_$254, $list417);
                            genl1 = current_$255.first();
                            current_$255 = current_$255.rest();
                            destructuring_bind_must_consp(current_$255, datum_$254, $list417);
                            genl2 = current_$255.first();
                            current_$255 = current_$255.rest();
                            if (NIL == current_$255) {
                                if (NIL == genls.genlP(col1, genl1, mt, UNPROVIDED)) {
                                    final SubLObject tmp = genl1;
                                    genl1 = genl2;
                                    genl2 = tmp;
                                }
                                final SubLObject thcl_genl1 = find_highest_thcl_genls_between(col1, genl1, mt, UNPROVIDED);
                                final SubLObject thcl_genl2 = find_highest_thcl_genls_between(col2, genl2, mt, UNPROVIDED);
                                if (thcl_genl1.eql(genl1) && thcl_genl2.eql(genl2)) {
                                    supports = cons(meta_support, supports);
                                } else {
                                    supports = cons(arguments.make_hl_support($DISJOINTWITH, make_binary_formula($$disjointWith, thcl_genl1, thcl_genl2), mt, UNPROVIDED), supports);
                                }
                                if (!col1.equal(thcl_genl1)) {
                                    supports = cons(arguments.make_hl_support($GENLS, make_binary_formula($$genls, col1, thcl_genl1), mt, UNPROVIDED), supports);
                                }
                                if (!col2.equal(thcl_genl2)) {
                                    supports = cons(arguments.make_hl_support($GENLS, make_binary_formula($$genls, col2, thcl_genl2), mt, UNPROVIDED), supports);
                                }
                                doneP = T;
                            } else {
                                cdestructuring_bind_error(datum_$254, $list417);
                            }
                        }
                        csome_list_var = csome_list_var.rest();
                        meta_support = csome_list_var.first();
                    } 
                }
            } else {
                cdestructuring_bind_error(datum, $list416);
            }
        }
        if (NIL == supports) {
            supports = hl_supports.hl_justify(support);
        }
        return supports;
    }

    public static SubLObject find_highest_thcl_genls_between(final SubLObject col, final SubLObject genl, final SubLObject mt, SubLObject inclusiveP) {
        if (inclusiveP == UNPROVIDED) {
            inclusiveP = T;
        }
        return find_thcl_genls_between(col, genl, mt, $DESCENDING, inclusiveP);
    }

    public static SubLObject find_thcl_genls_between(final SubLObject col, final SubLObject genl, final SubLObject mt, final SubLObject sort_direction, final SubLObject inclusiveP) {
        SubLObject sorted_genls = cardinality_estimates.sort_by_generality_estimate(genls.all_genls_wrt(col, genl, mt, UNPROVIDED), sort_direction);
        if (NIL == inclusiveP) {
            sorted_genls = delete(col, delete(genl, sorted_genls, symbol_function(EQUAL), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED), symbol_function(EQUAL), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        }
        SubLObject cdolist_list_var = sorted_genls;
        SubLObject in_between = NIL;
        in_between = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if (NIL != thcl.thcl_fortP(in_between, UNPROVIDED)) {
                return in_between;
            }
            cdolist_list_var = cdolist_list_var.rest();
            in_between = cdolist_list_var.first();
        } 
        cdolist_list_var = sorted_genls;
        in_between = NIL;
        in_between = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if (NIL == pph_utilities.pph_irrelevant_fort(in_between, UNPROVIDED, UNPROVIDED)) {
                return in_between;
            }
            cdolist_list_var = cdolist_list_var.rest();
            in_between = cdolist_list_var.first();
        } 
        Errors.warn($str419$No_THCL_or_non_irrelevant_collect, col, genl, mt);
        return genl;
    }

    public static SubLObject pph_weight_p(final SubLObject x) {
        return makeBoolean((x.isDouble() && x.numLE($float$1_0)) && ZERO_INTEGER.numLE(x));
    }

    public static SubLObject pph_explain_inference_answer_with_proof(final SubLObject inference_answer, final SubLObject proof, SubLObject language_mt, SubLObject domain_mt, SubLObject mode) {
        if (language_mt == UNPROVIDED) {
            language_mt = pph_vars.$pph_language_mt$.getDynamicValue();
        }
        if (domain_mt == UNPROVIDED) {
            domain_mt = pph_vars.$pph_domain_mt$.getDynamicValue();
        }
        if (mode == UNPROVIDED) {
            mode = pph_vars.$paraphrase_mode$.getDynamicValue();
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != inference_datastructures_inference.inference_answer_p(inference_answer) : "inference_datastructures_inference.inference_answer_p(inference_answer) " + "CommonSymbols.NIL != inference_datastructures_inference.inference_answer_p(inference_answer) " + inference_answer;
        assert NIL != inference_datastructures_proof.proof_p(proof) : "inference_datastructures_proof.proof_p(proof) " + "CommonSymbols.NIL != inference_datastructures_proof.proof_p(proof) " + proof;
        if ((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) && (NIL == proof_of_inference_answer_p(proof, inference_answer))) {
            Errors.error($str7$_S_is_not_a_proof_of__S, proof, inference_answer);
        }
        return pph_explain_inference_answer_with_proof_int(inference_answer, proof, language_mt, domain_mt, mode);
    }

    public static SubLObject pph_explain_all_relevant_inference_answers(final SubLObject inference, SubLObject relevant_fn, SubLObject language_mt, SubLObject domain_mt, SubLObject mode) {
        if (relevant_fn == UNPROVIDED) {
            relevant_fn = symbol_function(IDENTITY);
        }
        if (language_mt == UNPROVIDED) {
            language_mt = pph_vars.$pph_language_mt$.getDynamicValue();
        }
        if (domain_mt == UNPROVIDED) {
            domain_mt = pph_vars.$pph_domain_mt$.getDynamicValue();
        }
        if (mode == UNPROVIDED) {
            mode = pph_vars.$paraphrase_mode$.getDynamicValue();
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = NIL;
        thread.resetMultipleValues();
        final SubLObject explanation_strings = pph_explain_all_inference_answers_for_best_proofs(inference, relevant_fn, language_mt, domain_mt, mode, UNPROVIDED, UNPROVIDED);
        final SubLObject sentences_used = thread.secondMultipleValue();
        thread.resetMultipleValues();
        result = explanation_strings;
        return result;
    }

    public static SubLObject pph_explain_all_inference_answers_for_best_proofs(final SubLObject inference, SubLObject relevant_fn, SubLObject language_mt, SubLObject domain_mt, SubLObject mode, SubLObject interrupt_time_cutoff, SubLObject abort_time_cutoff) {
        if (relevant_fn == UNPROVIDED) {
            relevant_fn = symbol_function(IDENTITY);
        }
        if (language_mt == UNPROVIDED) {
            language_mt = pph_vars.$pph_language_mt$.getDynamicValue();
        }
        if (domain_mt == UNPROVIDED) {
            domain_mt = pph_vars.$pph_domain_mt$.getDynamicValue();
        }
        if (mode == UNPROVIDED) {
            mode = pph_vars.$paraphrase_mode$.getDynamicValue();
        }
        if (interrupt_time_cutoff == UNPROVIDED) {
            interrupt_time_cutoff = NIL;
        }
        if (abort_time_cutoff == UNPROVIDED) {
            abort_time_cutoff = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != inference_datastructures_inference.inference_p(inference) : "inference_datastructures_inference.inference_p(inference) " + "CommonSymbols.NIL != inference_datastructures_inference.inference_p(inference) " + inference;
        if (((NIL != interrupt_time_cutoff) && (!SubLSystemTrampolineFile.assertionsDisabledInClass)) && (NIL == numberp(interrupt_time_cutoff))) {
            throw new AssertionError(interrupt_time_cutoff);
        }
        if (((NIL != abort_time_cutoff) && (!SubLSystemTrampolineFile.assertionsDisabledInClass)) && (NIL == numberp(abort_time_cutoff))) {
            throw new AssertionError(abort_time_cutoff);
        }
        SubLObject explanation_strings = NIL;
        SubLObject cycl_sentences_used = NIL;
        SubLObject weights = NIL;
        SubLObject problem_dictionaries = NIL;
        SubLObject interruptedP = NIL;
        SubLObject abortedP = NIL;
        SubLObject consistent_stateP = T;
        final SubLObject tag = with_timeout_make_tag();
        try {
            thread.throwStack.push(tag);
            final SubLObject _prev_bind_0 = $within_with_timeout$.currentBinding(thread);
            try {
                $within_with_timeout$.bind(T, thread);
                SubLObject timer = NIL;
                try {
                    final SubLObject _prev_bind_0_$256 = $with_timeout_nesting_depth$.currentBinding(thread);
                    try {
                        $with_timeout_nesting_depth$.bind(add(ONE_INTEGER, $with_timeout_nesting_depth$.getDynamicValue(thread)), thread);
                        timer = with_timeout_start_timer(abort_time_cutoff, tag);
                        final SubLObject _prev_bind_0_$257 = pph_macros.$pph_timeout_time_check_count$.currentBinding(thread);
                        final SubLObject _prev_bind_2 = pph_macros.$pph_timeout_time$.currentBinding(thread);
                        final SubLObject _prev_bind_3 = pph_macros.$pph_timeout_reachedP$.currentBinding(thread);
                        try {
                            pph_macros.$pph_timeout_time_check_count$.bind(ZERO_INTEGER, thread);
                            pph_macros.$pph_timeout_time$.bind(pph_macros.pph_compute_timeout_time(interrupt_time_cutoff), thread);
                            pph_macros.$pph_timeout_reachedP$.bind(pph_macros.$pph_timeout_reachedP$.getDynamicValue(thread), thread);
                            pph_macros.$pph_timeout_reachedP$.setDynamicValue(pph_macros.pph_timeout_time_reachedP(), thread);
                            if (NIL == pph_macros.$pph_timeout_reachedP$.getDynamicValue(thread)) {
                                final SubLObject _prev_bind_0_$258 = pph_macros.$free_pph_problem_store_pointers$.currentBinding(thread);
                                try {
                                    pph_macros.$free_pph_problem_store_pointers$.bind(NIL, thread);
                                    thread.resetMultipleValues();
                                    final SubLObject _prev_bind_0_$259 = pph_macros.$pph_problem_store_pointer$.currentBinding(thread);
                                    try {
                                        pph_macros.$pph_problem_store_pointer$.bind(pph_macros.find_or_create_pph_problem_store_pointer(), thread);
                                        final SubLObject reuseP = thread.secondMultipleValue();
                                        thread.resetMultipleValues();
                                        try {
                                            thread.resetMultipleValues();
                                            final SubLObject _prev_bind_0_$260 = pph_macros.$pph_memoization_state$.currentBinding(thread);
                                            try {
                                                pph_macros.$pph_memoization_state$.bind(pph_macros.find_or_create_pph_memoization_state(), thread);
                                                final SubLObject new_or_reused = thread.secondMultipleValue();
                                                thread.resetMultipleValues();
                                                final SubLObject _prev_bind_0_$261 = pph_macros.$pph_external_memoization_state$.currentBinding(thread);
                                                try {
                                                    pph_macros.$pph_external_memoization_state$.bind(pph_macros.find_or_create_pph_external_memoization_state(), thread);
                                                    final SubLObject local_state = pph_macros.$pph_memoization_state$.getDynamicValue(thread);
                                                    final SubLObject _prev_bind_0_$262 = memoization_state.$memoization_state$.currentBinding(thread);
                                                    try {
                                                        memoization_state.$memoization_state$.bind(local_state, thread);
                                                        final SubLObject original_memoization_process = memoization_state.memoization_state_original_process(local_state);
                                                        try {
                                                            final SubLObject idx = inference_datastructures_inference.inference_answer_id_index(inference);
                                                            if (NIL == id_index_objects_empty_p(idx, $SKIP)) {
                                                                final SubLObject idx_$263 = idx;
                                                                if (NIL == id_index_dense_objects_empty_p(idx_$263, $SKIP)) {
                                                                    final SubLObject vector_var = id_index_dense_objects(idx_$263);
                                                                    final SubLObject backwardP_var = NIL;
                                                                    SubLObject length;
                                                                    SubLObject v_iteration;
                                                                    SubLObject id;
                                                                    SubLObject inference_answer;
                                                                    SubLObject all_proofs;
                                                                    SubLObject best_proof;
                                                                    SubLObject _prev_bind_0_$263;
                                                                    SubLObject _prev_bind_1_$265;
                                                                    SubLObject explanation_string;
                                                                    SubLObject cycl_sentences;
                                                                    SubLObject weight;
                                                                    SubLObject problem_dictionary;
                                                                    for (length = length(vector_var), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL(length); v_iteration = add(v_iteration, ONE_INTEGER)) {
                                                                        id = (NIL != backwardP_var) ? subtract(length, v_iteration, ONE_INTEGER) : v_iteration;
                                                                        inference_answer = aref(vector_var, id);
                                                                        if ((NIL == id_index_tombstone_p(inference_answer)) || (NIL == id_index_skip_tombstones_p($SKIP))) {
                                                                            if (NIL != id_index_tombstone_p(inference_answer)) {
                                                                                inference_answer = $SKIP;
                                                                            }
                                                                            if (NIL != funcall(relevant_fn, inference_answer)) {
                                                                                all_proofs = inference_answer_get_proofs(inference_answer);
                                                                                best_proof = pph_find_best_proof(all_proofs);
                                                                                _prev_bind_0_$263 = pph_vars.$pph_domain_mt$.currentBinding(thread);
                                                                                _prev_bind_1_$265 = pph_vars.$pph_demerit_cutoff$.currentBinding(thread);
                                                                                try {
                                                                                    pph_vars.$pph_domain_mt$.bind(domain_mt, thread);
                                                                                    pph_vars.$pph_demerit_cutoff$.bind(TWO_INTEGER, thread);
                                                                                    thread.resetMultipleValues();
                                                                                    explanation_string = pph_explain_inference_answer_with_proof_int(inference_answer, best_proof, language_mt, domain_mt, mode);
                                                                                    cycl_sentences = thread.secondMultipleValue();
                                                                                    weight = thread.thirdMultipleValue();
                                                                                    problem_dictionary = thread.fourthMultipleValue();
                                                                                    thread.resetMultipleValues();
                                                                                    if (NIL == pph_inference_answer_explanation_okP(explanation_string, cycl_sentences, weight)) {
                                                                                        explanation_string = string_utilities.$empty_string$.getGlobalValue();
                                                                                    }
                                                                                    if ((NIL == string_utilities.non_empty_stringP(explanation_string)) || (NIL == subl_promotions.memberP(explanation_string, explanation_strings, symbol_function(EQUALP), UNPROVIDED))) {
                                                                                        consistent_stateP = NIL;
                                                                                        explanation_strings = cons(explanation_string, explanation_strings);
                                                                                        cycl_sentences_used = cons(cycl_sentences, cycl_sentences_used);
                                                                                        weights = cons(weight, weights);
                                                                                        problem_dictionaries = cons(problem_dictionary, problem_dictionaries);
                                                                                        consistent_stateP = T;
                                                                                    }
                                                                                } finally {
                                                                                    pph_vars.$pph_demerit_cutoff$.rebind(_prev_bind_1_$265, thread);
                                                                                    pph_vars.$pph_domain_mt$.rebind(_prev_bind_0_$263, thread);
                                                                                }
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                                final SubLObject idx_$264 = idx;
                                                                if (NIL == id_index_sparse_objects_empty_p(idx_$264)) {
                                                                    final SubLObject cdohash_table = id_index_sparse_objects(idx_$264);
                                                                    SubLObject id2 = NIL;
                                                                    SubLObject inference_answer2 = NIL;
                                                                    final Iterator cdohash_iterator = getEntrySetIterator(cdohash_table);
                                                                    try {
                                                                        while (iteratorHasNext(cdohash_iterator)) {
                                                                            final Map.Entry cdohash_entry = iteratorNextEntry(cdohash_iterator);
                                                                            id2 = getEntryKey(cdohash_entry);
                                                                            inference_answer2 = getEntryValue(cdohash_entry);
                                                                            if (NIL != funcall(relevant_fn, inference_answer2)) {
                                                                                final SubLObject all_proofs2 = inference_answer_get_proofs(inference_answer2);
                                                                                final SubLObject best_proof2 = pph_find_best_proof(all_proofs2);
                                                                                final SubLObject _prev_bind_0_$264 = pph_vars.$pph_domain_mt$.currentBinding(thread);
                                                                                final SubLObject _prev_bind_1_$266 = pph_vars.$pph_demerit_cutoff$.currentBinding(thread);
                                                                                try {
                                                                                    pph_vars.$pph_domain_mt$.bind(domain_mt, thread);
                                                                                    pph_vars.$pph_demerit_cutoff$.bind(TWO_INTEGER, thread);
                                                                                    thread.resetMultipleValues();
                                                                                    SubLObject explanation_string2 = pph_explain_inference_answer_with_proof_int(inference_answer2, best_proof2, language_mt, domain_mt, mode);
                                                                                    final SubLObject cycl_sentences2 = thread.secondMultipleValue();
                                                                                    final SubLObject weight2 = thread.thirdMultipleValue();
                                                                                    final SubLObject problem_dictionary2 = thread.fourthMultipleValue();
                                                                                    thread.resetMultipleValues();
                                                                                    if (NIL == pph_inference_answer_explanation_okP(explanation_string2, cycl_sentences2, weight2)) {
                                                                                        explanation_string2 = string_utilities.$empty_string$.getGlobalValue();
                                                                                    }
                                                                                    if ((NIL != string_utilities.non_empty_stringP(explanation_string2)) && (NIL != subl_promotions.memberP(explanation_string2, explanation_strings, symbol_function(EQUALP), UNPROVIDED))) {
                                                                                        continue;
                                                                                    }
                                                                                    consistent_stateP = NIL;
                                                                                    explanation_strings = cons(explanation_string2, explanation_strings);
                                                                                    cycl_sentences_used = cons(cycl_sentences2, cycl_sentences_used);
                                                                                    weights = cons(weight2, weights);
                                                                                    problem_dictionaries = cons(problem_dictionary2, problem_dictionaries);
                                                                                    consistent_stateP = T;
                                                                                } finally {
                                                                                    pph_vars.$pph_demerit_cutoff$.rebind(_prev_bind_1_$266, thread);
                                                                                    pph_vars.$pph_domain_mt$.rebind(_prev_bind_0_$264, thread);
                                                                                }
                                                                            }
                                                                        } 
                                                                    } finally {
                                                                        releaseEntrySetIterator(cdohash_iterator);
                                                                    }
                                                                }
                                                            }
                                                        } finally {
                                                            final SubLObject _prev_bind_0_$265 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                                            try {
                                                                $is_thread_performing_cleanupP$.bind(T, thread);
                                                                final SubLObject _values = getValuesAsVector();
                                                                memoization_state.memoization_state_possibly_clear_original_process(local_state, original_memoization_process);
                                                                restoreValuesFromVector(_values);
                                                            } finally {
                                                                $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$265, thread);
                                                            }
                                                        }
                                                    } finally {
                                                        memoization_state.$memoization_state$.rebind(_prev_bind_0_$262, thread);
                                                    }
                                                } finally {
                                                    pph_macros.$pph_external_memoization_state$.rebind(_prev_bind_0_$261, thread);
                                                }
                                                if ((new_or_reused == $NEW) && (NIL != memoization_state.memoization_state_p(pph_macros.$pph_memoization_state$.getDynamicValue(thread)))) {
                                                    memoization_state.clear_all_memoization(pph_macros.$pph_memoization_state$.getDynamicValue(thread));
                                                }
                                            } finally {
                                                pph_macros.$pph_memoization_state$.rebind(_prev_bind_0_$260, thread);
                                            }
                                        } finally {
                                            final SubLObject _prev_bind_0_$266 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                            try {
                                                $is_thread_performing_cleanupP$.bind(T, thread);
                                                final SubLObject _values2 = getValuesAsVector();
                                                if (NIL == reuseP) {
                                                    pph_macros.free_pph_problem_store_pointer(pph_macros.$pph_problem_store_pointer$.getDynamicValue(thread));
                                                }
                                                restoreValuesFromVector(_values2);
                                            } finally {
                                                $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$266, thread);
                                            }
                                        }
                                    } finally {
                                        pph_macros.$pph_problem_store_pointer$.rebind(_prev_bind_0_$259, thread);
                                    }
                                } finally {
                                    pph_macros.$free_pph_problem_store_pointers$.rebind(_prev_bind_0_$258, thread);
                                }
                            }
                            interruptedP = pph_macros.pph_timeout_time_reachedP();
                        } finally {
                            pph_macros.$pph_timeout_reachedP$.rebind(_prev_bind_3, thread);
                            pph_macros.$pph_timeout_time$.rebind(_prev_bind_2, thread);
                            pph_macros.$pph_timeout_time_check_count$.rebind(_prev_bind_0_$257, thread);
                        }
                    } finally {
                        $with_timeout_nesting_depth$.rebind(_prev_bind_0_$256, thread);
                    }
                } finally {
                    final SubLObject _prev_bind_0_$267 = $is_thread_performing_cleanupP$.currentBinding(thread);
                    try {
                        $is_thread_performing_cleanupP$.bind(T, thread);
                        final SubLObject _values3 = getValuesAsVector();
                        with_timeout_stop_timer(timer);
                        restoreValuesFromVector(_values3);
                    } finally {
                        $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$267, thread);
                    }
                }
            } finally {
                $within_with_timeout$.rebind(_prev_bind_0, thread);
            }
        } catch (final Throwable ccatch_env_var) {
            abortedP = Errors.handleThrowable(ccatch_env_var, tag);
        } finally {
            thread.throwStack.pop();
        }
        if (NIL == consistent_stateP) {
            final SubLObject min_length = min(length(explanation_strings), new SubLObject[]{ length(cycl_sentences_used), length(weights), length(problem_dictionaries) });
            final SubLObject max_length = max(length(explanation_strings), new SubLObject[]{ length(cycl_sentences_used), length(weights), length(problem_dictionaries) });
            if (!min_length.numE(max_length)) {
                explanation_strings = list_utilities.first_n(min_length, explanation_strings);
                cycl_sentences_used = list_utilities.first_n(min_length, cycl_sentences_used);
                weights = list_utilities.first_n(min_length, weights);
                problem_dictionaries = list_utilities.first_n(min_length, problem_dictionaries);
            }
        }
        final SubLObject timed_outP = makeBoolean((NIL != interruptedP) || (NIL != abortedP));
        return values(explanation_strings, cycl_sentences_used, weights, problem_dictionaries, timed_outP);
    }

    public static SubLObject pph_inference_answer_explanation_okP(final SubLObject explanation_string, final SubLObject cycl_sentences, final SubLObject weight) {
        if (NIL == string_utilities.non_empty_stringP(explanation_string)) {
            return NIL;
        }
        if (NIL != string_utilities.substringP(constant_reader.constant_reader_prefix(), explanation_string, UNPROVIDED, UNPROVIDED, UNPROVIDED)) {
            return NIL;
        }
        return T;
    }

    public static SubLObject pph_explain_inference_answer_with_proof_int(final SubLObject inference_answer, final SubLObject proof, final SubLObject language_mt, final SubLObject domain_mt, final SubLObject mode) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject explanation_string = string_utilities.$empty_string$.getGlobalValue();
        SubLObject content_explained = NIL;
        SubLObject problem_dictionary = NIL;
        SubLObject explanation_weight = ZERO_INTEGER;
        final SubLObject _prev_bind_0 = pph_vars.$pph_non_explanatory_proofs$.currentBinding(thread);
        final SubLObject _prev_bind_2 = pph_vars.$pph_domain_mt$.currentBinding(thread);
        try {
            pph_vars.$pph_non_explanatory_proofs$.bind(inference_worker.proof_non_explanatory_subproofs(proof), thread);
            pph_vars.$pph_domain_mt$.bind(domain_mt, thread);
            final SubLObject explanation_contents = pph_inference_answer_explanation_contents(inference_answer, proof);
            if (NIL != explanation_contents) {
                final SubLObject _prev_bind_0_$272 = pph_vars.$pph_inference_answer$.currentBinding(thread);
                final SubLObject _prev_bind_1_$273 = pph_vars.$pph_hypothetical_vars$.currentBinding(thread);
                final SubLObject _prev_bind_3 = pph_vars.$pph_handle_hypotheticalsP$.currentBinding(thread);
                final SubLObject _prev_bind_4 = pph_vars.$pph_domain_mt$.currentBinding(thread);
                final SubLObject _prev_bind_5 = pph_vars.$pph_use_bulleted_listsP$.currentBinding(thread);
                final SubLObject _prev_bind_6 = pph_vars.$pph_repositioned_proofs$.currentBinding(thread);
                final SubLObject _prev_bind_7 = pph_vars.$pph_displayed_proofs$.currentBinding(thread);
                final SubLObject _prev_bind_8 = pph_vars.$pph_justified_proofs$.currentBinding(thread);
                final SubLObject _prev_bind_9 = pph_vars.$pph_proof_depth$.currentBinding(thread);
                final SubLObject _prev_bind_10 = pph_vars.$pph_displayed_supports$.currentBinding(thread);
                try {
                    pph_vars.$pph_inference_answer$.bind(inference_answer, thread);
                    pph_vars.$pph_hypothetical_vars$.bind(inference_datastructures_inference.inference_hypothetical_bindings(inference_datastructures_inference.inference_answer_inference(inference_answer)), thread);
                    pph_vars.$pph_handle_hypotheticalsP$.bind(T, thread);
                    pph_vars.$pph_domain_mt$.bind(pph_methods.pph_enhanced_domain_mt(pph_get_inference_mt(inference_datastructures_inference.inference_answer_inference(inference_answer)), UNPROVIDED), thread);
                    pph_vars.$pph_use_bulleted_listsP$.bind(T, thread);
                    pph_vars.$pph_repositioned_proofs$.bind(NIL, thread);
                    pph_vars.$pph_displayed_proofs$.bind(find_or_create_pph_displayed_proof_stack(), thread);
                    pph_vars.$pph_justified_proofs$.bind(find_or_create_pph_justified_proof_set(), thread);
                    pph_vars.$pph_proof_depth$.bind(ZERO_INTEGER, thread);
                    pph_vars.$pph_displayed_supports$.bind(NIL, thread);
                    thread.resetMultipleValues();
                    final SubLObject link_function = pph_macros.pph_justification_html_function_and_target();
                    final SubLObject html_target = thread.secondMultipleValue();
                    thread.resetMultipleValues();
                    final SubLObject _prev_bind_0_$273 = pph_vars.$constant_link_function$.currentBinding(thread);
                    final SubLObject _prev_bind_1_$274 = pph_vars.$html_generation_target$.currentBinding(thread);
                    try {
                        pph_vars.$constant_link_function$.bind(NIL != link_function ? link_function : pph_vars.$constant_link_function$.getDynamicValue(thread), thread);
                        pph_vars.$html_generation_target$.bind(NIL != html_target ? html_target : pph_vars.$html_generation_target$.getDynamicValue(thread), thread);
                        problem_dictionary = dictionary.new_dictionary(symbol_function(EQL), UNPROVIDED);
                        final SubLObject matrix_problem_dictionary = pph_vars.$pph_problem_reports$.getDynamicValue(thread);
                        final SubLObject _prev_bind_0_$274 = pph_vars.$pph_problem_reporting_mode$.currentBinding(thread);
                        final SubLObject _prev_bind_1_$275 = pph_vars.$pph_problem_reports$.currentBinding(thread);
                        try {
                            pph_vars.$pph_problem_reporting_mode$.bind(NIL != pph_vars.pph_problem_reporting_on_p() ? pph_vars.$pph_problem_reporting_mode$.getDynamicValue(thread) : $QUIET, thread);
                            pph_vars.$pph_problem_reports$.bind(problem_dictionary, thread);
                            final SubLObject _prev_bind_0_$275 = pph_macros.$new_pph_phrases$.currentBinding(thread);
                            final SubLObject _prev_bind_1_$276 = pph_macros.$new_pph_phrase_count$.currentBinding(thread);
                            final SubLObject _prev_bind_2_$280 = pph_macros.$destroy_new_pph_phrasesP$.currentBinding(thread);
                            try {
                                pph_macros.$new_pph_phrases$.bind(stacks.create_stack(), thread);
                                pph_macros.$new_pph_phrase_count$.bind(pph_macros.get_new_pph_phrase_count(), thread);
                                pph_macros.$destroy_new_pph_phrasesP$.bind(T, thread);
                                try {
                                    final SubLObject pph_sentences = Mapping.mapcar(NEW_PPH_SENTENCE, explanation_contents);
                                    final SubLObject pph_paragraph = pph_document.new_pph_paragraph(inference_answer, pph_sentences);
                                    pph_document.pph_paragraph_generate(pph_paragraph, language_mt, domain_mt, mode);
                                    if (NIL != pph_document.pph_paragraph_doneP(pph_paragraph)) {
                                        SubLObject stream = NIL;
                                        try {
                                            stream = make_private_string_output_stream();
                                            pph_document.pph_paragraph_print(pph_paragraph, stream);
                                            explanation_string = get_output_stream_string(stream);
                                        } finally {
                                            final SubLObject _prev_bind_0_$276 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                            try {
                                                $is_thread_performing_cleanupP$.bind(T, thread);
                                                final SubLObject _values = getValuesAsVector();
                                                close(stream, UNPROVIDED);
                                                restoreValuesFromVector(_values);
                                            } finally {
                                                $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$276, thread);
                                            }
                                        }
                                        explanation_weight = pph_paragraph_demerits_to_weight(pph_paragraph);
                                    }
                                } finally {
                                    final SubLObject _prev_bind_0_$277 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                    try {
                                        $is_thread_performing_cleanupP$.bind(T, thread);
                                        final SubLObject _values2 = getValuesAsVector();
                                        pph_macros.destroy_new_pph_phrases();
                                        restoreValuesFromVector(_values2);
                                    } finally {
                                        $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$277, thread);
                                    }
                                }
                            } finally {
                                pph_macros.$destroy_new_pph_phrasesP$.rebind(_prev_bind_2_$280, thread);
                                pph_macros.$new_pph_phrase_count$.rebind(_prev_bind_1_$276, thread);
                                pph_macros.$new_pph_phrases$.rebind(_prev_bind_0_$275, thread);
                            }
                            if (NIL != dictionary.dictionary_p(matrix_problem_dictionary)) {
                                pph_phrase.pph_merge_problem_dictionary(pph_vars.$pph_problem_reports$.getDynamicValue(thread), matrix_problem_dictionary);
                            }
                        } finally {
                            pph_vars.$pph_problem_reports$.rebind(_prev_bind_1_$275, thread);
                            pph_vars.$pph_problem_reporting_mode$.rebind(_prev_bind_0_$274, thread);
                        }
                        content_explained = explanation_contents;
                    } finally {
                        pph_vars.$html_generation_target$.rebind(_prev_bind_1_$274, thread);
                        pph_vars.$constant_link_function$.rebind(_prev_bind_0_$273, thread);
                    }
                } finally {
                    pph_vars.$pph_displayed_supports$.rebind(_prev_bind_10, thread);
                    pph_vars.$pph_proof_depth$.rebind(_prev_bind_9, thread);
                    pph_vars.$pph_justified_proofs$.rebind(_prev_bind_8, thread);
                    pph_vars.$pph_displayed_proofs$.rebind(_prev_bind_7, thread);
                    pph_vars.$pph_repositioned_proofs$.rebind(_prev_bind_6, thread);
                    pph_vars.$pph_use_bulleted_listsP$.rebind(_prev_bind_5, thread);
                    pph_vars.$pph_domain_mt$.rebind(_prev_bind_4, thread);
                    pph_vars.$pph_handle_hypotheticalsP$.rebind(_prev_bind_3, thread);
                    pph_vars.$pph_hypothetical_vars$.rebind(_prev_bind_1_$273, thread);
                    pph_vars.$pph_inference_answer$.rebind(_prev_bind_0_$272, thread);
                }
            }
        } finally {
            pph_vars.$pph_domain_mt$.rebind(_prev_bind_2, thread);
            pph_vars.$pph_non_explanatory_proofs$.rebind(_prev_bind_0, thread);
        }
        return values(explanation_string, content_explained, explanation_weight, problem_dictionary);
    }

    public static SubLObject pph_paragraph_demerits_to_weight(final SubLObject pph_paragraph) {
        final SubLObject demerits = pph_document.pph_paragraph_demerits(pph_paragraph);
        return demerits.isZero() ? $float$1_0 : divide($float$1_0, demerits);
    }

    public static SubLObject pph_inference_answer_explanation_contents(final SubLObject inference_answer, final SubLObject proof) {
        final SubLObject inference = inference_datastructures_inference.inference_answer_inference(inference_answer);
        final SubLObject mt = pph_get_inference_mt(inference);
        final SubLObject proven_el_query_formula = pph_proof_el_formula(proof, mt);
        final SubLObject explanation_contents = (NIL != el_formula_with_operator_p(proven_el_query_formula, $$appropriateResponseContent)) ? pph_inference_answer_explanation_contents_for_appropriate_response_content(proven_el_query_formula, inference_datastructures_inference.inference_answer_bindings(inference_answer), mt, inference_datastructures_inference.inference_problem_store(inference)) : pph_inference_answer_explanation_contents_default(inference_answer, proof, proven_el_query_formula);
        return explanation_contents;
    }

    public static SubLObject best_support_sentence_nautP(final SubLObject v_object) {
        return el_formula_with_operator_p(v_object, $$BestSupportSentenceFn);
    }

    public static SubLObject pph_inference_answer_explanation_contents_for_appropriate_response_content(final SubLObject proven_el_query_formula, final SubLObject v_bindings, final SubLObject mt, final SubLObject problem_store) {
        final SubLObject content = cycl_utilities.formula_arg2(proven_el_query_formula, UNPROVIDED);
        final SubLObject use_support_sentenceP = best_support_sentence_nautP(content);
        final SubLObject content_sentence = (NIL != use_support_sentenceP) ? cycl_utilities.nat_arg1(content, UNPROVIDED) : content;
        final SubLObject all_supports = pph_supports_for_appropriate_response_content_sentence(content_sentence, mt, problem_store);
        final SubLObject explanation_contents = (NIL != use_support_sentenceP) ? pph_inference_answer_explanation_contents_from_supports_and_bindings(all_supports, v_bindings, content_sentence) : pph_inference_answer_explanation_contents_from_supports(all_supports, v_bindings, list(content_sentence));
        return explanation_contents;
    }

    public static SubLObject pph_supports_for_appropriate_response_content_sentence(final SubLObject content_sentence, final SubLObject mt, final SubLObject problem_store) {
        if (NIL != possibly_inference_sentence_p(content_sentence)) {
            final SubLObject justified = ask_utilities.query_justified(content_sentence, mt, list($MAX_NUMBER, ONE_INTEGER, $PROBLEM_STORE, problem_store));
            final SubLObject first_answer = justified.first();
            return list_utilities.remove_if_not(SUPPORT_P, second(first_answer), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        }
        if (NIL != assertion_handles.assertion_p(content_sentence)) {
            return pph_meta_supports(content_sentence);
        }
        return NIL;
    }

    public static SubLObject pph_inference_answer_explanation_contents_default(final SubLObject inference_answer, final SubLObject proof, final SubLObject proven_el_query_formula) {
        final SubLObject v_bindings = inference_datastructures_inference.inference_answer_bindings(inference_answer);
        final SubLObject justification = inference_answer_get_justification_with_proof(inference_answer, proof);
        final SubLObject all_supports = list_utilities.remove_if_not(SUPPORT_P, inference_datastructures_inference.inference_answer_justification_supports(justification), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        final SubLObject explanation_contents = pph_inference_answer_explanation_contents_from_supports_and_bindings(all_supports, v_bindings, proven_el_query_formula);
        return explanation_contents;
    }

    public static SubLObject pph_inference_answer_explanation_contents_from_supports_and_bindings(final SubLObject all_supports, final SubLObject v_bindings, final SubLObject proven_sentence) {
        if ((NIL != list_utilities.singletonP(v_bindings)) && (NIL != cycl_grammar.cycl_sentence_p(bindings.variable_binding_value(v_bindings.first())))) {
            return Mapping.mapcar(VARIABLE_BINDING_VALUE, v_bindings);
        }
        final SubLObject good_supports = remove_if($sym16$PPH_IRRELEVANT_SUPPORT_, all_supports, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        final SubLObject meta_ized_supports = delete_if($sym16$PPH_IRRELEVANT_SUPPORT_, pph_meta_ize_supports(good_supports), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        final SubLObject optimized = pph_maybe_optimize_answer_explanation_supports(meta_ized_supports, v_bindings, proven_sentence);
        return pph_inference_answer_explanation_contents_from_supports(optimized, v_bindings, NIL != pph_trivial_sentenceP(proven_sentence, UNPROVIDED) ? NIL : list(proven_sentence));
    }

    public static SubLObject pph_maybe_optimize_answer_explanation_supports(final SubLObject supports, final SubLObject v_bindings, final SubLObject proven_sentence) {
        if (NIL != pph_answer_explanation_supports_need_optimizingP(supports)) {
            return pph_optimize_answer_explanation_supports(supports, v_bindings, proven_sentence);
        }
        return values(supports, NIL);
    }

    public static SubLObject pph_answer_explanation_supports_need_optimizingP(final SubLObject supports) {
        return list_utilities.lengthG(supports, ONE_INTEGER, UNPROVIDED);
    }

    public static SubLObject pph_optimize_answer_explanation_supports(final SubLObject supports, final SubLObject v_bindings, final SubLObject proven_sentence) {
        SubLObject optimized = supports;
        SubLObject reasons = NIL;
        if (NIL != v_bindings) {
            SubLObject good = NIL;
            SubLObject cdolist_list_var = optimized;
            SubLObject support = NIL;
            support = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                if (NIL != pph_support_mentions_bindingP(support, v_bindings)) {
                    good = cons(support, good);
                }
                cdolist_list_var = cdolist_list_var.rest();
                support = cdolist_list_var.first();
            } 
            if ((NIL != good) && (NIL == list_utilities.same_length_p(good, optimized))) {
                optimized = nreverse(good);
                reasons = cons($REMOVED_SUPPORTS_THAT_DONT_MENTION_BINDING_VALUES, reasons);
            }
            if (NIL == pph_answer_explanation_supports_need_optimizingP(optimized)) {
                return values(optimized, reasons);
            }
        }
        final SubLObject proven_sentence_forts = cycl_utilities.expression_gather(proven_sentence, FORT_P, T, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        SubLObject good2 = NIL;
        SubLObject good_fort_match_count = ZERO_INTEGER;
        SubLObject cdolist_list_var2 = optimized;
        SubLObject support2 = NIL;
        support2 = cdolist_list_var2.first();
        while (NIL != cdolist_list_var2) {
            SubLObject this_fort_match_count = ZERO_INTEGER;
            SubLObject cdolist_list_var_$283 = proven_sentence_forts;
            SubLObject this_fort = NIL;
            this_fort = cdolist_list_var_$283.first();
            while (NIL != cdolist_list_var_$283) {
                if (NIL != cycl_utilities.expression_find(this_fort, support2, T, UNPROVIDED, UNPROVIDED)) {
                    this_fort_match_count = add(this_fort_match_count, ONE_INTEGER);
                }
                cdolist_list_var_$283 = cdolist_list_var_$283.rest();
                this_fort = cdolist_list_var_$283.first();
            } 
            if (this_fort_match_count.numG(good_fort_match_count)) {
                good2 = list(support2);
                good_fort_match_count = this_fort_match_count;
            } else
                if (this_fort_match_count.numE(good_fort_match_count)) {
                    good2 = cons(support2, good2);
                }

            cdolist_list_var2 = cdolist_list_var2.rest();
            support2 = cdolist_list_var2.first();
        } 
        if ((NIL != good2) && (NIL == list_utilities.same_length_p(good2, optimized))) {
            optimized = nreverse(good2);
            reasons = cons($USED_SUPPORTS_THAT_MENTION_MOST_PROVEN_SENTENCE_FORTS, reasons);
        }
        return values(optimized, reasons);
    }

    public static SubLObject pph_support_mentions_bindingP(final SubLObject support, final SubLObject v_bindings) {
        SubLObject ans = NIL;
        if (NIL == ans) {
            SubLObject csome_list_var = v_bindings;
            SubLObject binding = NIL;
            binding = csome_list_var.first();
            while ((NIL == ans) && (NIL != csome_list_var)) {
                final SubLObject value = bindings.variable_binding_value(binding);
                ans = cycl_utilities.expression_find(value, support, T, symbol_function(EQUAL), UNPROVIDED);
                csome_list_var = csome_list_var.rest();
                binding = csome_list_var.first();
            } 
        }
        return ans;
    }

    public static SubLObject pph_all_bindings_mentionedP(final SubLObject sentences, final SubLObject v_bindings) {
        SubLObject badP = NIL;
        if (NIL == badP) {
            SubLObject csome_list_var = v_bindings;
            SubLObject binding = NIL;
            binding = csome_list_var.first();
            while ((NIL == badP) && (NIL != csome_list_var)) {
                final SubLObject value = bindings.variable_binding_value(binding);
                SubLObject okayP = best_support_sentence_nautP(value);
                if (NIL == okayP) {
                    SubLObject csome_list_var_$284;
                    SubLObject sentence;
                    for (csome_list_var_$284 = sentences, sentence = NIL, sentence = csome_list_var_$284.first(); (NIL == okayP) && (NIL != csome_list_var_$284); okayP = cycl_utilities.expression_find(value, sentence, T, symbol_function(EQUAL), UNPROVIDED) , csome_list_var_$284 = csome_list_var_$284.rest() , sentence = csome_list_var_$284.first()) {
                    }
                }
                badP = makeBoolean(NIL == okayP);
                csome_list_var = csome_list_var.rest();
                binding = csome_list_var.first();
            } 
        }
        return makeBoolean(NIL == badP);
    }

    public static SubLObject pph_inference_answer_explanation_contents_from_supports(final SubLObject all_supports, final SubLObject v_bindings, final SubLObject default_explanation_contents) {
        final SubLObject good_support_sentences = pph_explanation_sentences_from_supports(all_supports);
        final SubLObject explanation_contents = (NIL != pph_good_explanation_contentsP(good_support_sentences, v_bindings)) ? good_support_sentences : default_explanation_contents;
        return explanation_contents;
    }

    public static SubLObject pph_good_explanation_contentsP(final SubLObject sentences, final SubLObject v_bindings) {
        if (NIL == sentences) {
            return NIL;
        }
        if (NIL != list_utilities.lengthG(sentences, ONE_INTEGER, UNPROVIDED)) {
            return NIL;
        }
        if (NIL == pph_all_bindings_mentionedP(sentences, v_bindings)) {
            return NIL;
        }
        return T;
    }

    public static SubLObject pph_meta_ize_supports(final SubLObject supports) {
        SubLObject ans = NIL;
        SubLObject cdolist_list_var = supports;
        SubLObject support = NIL;
        support = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            SubLObject cdolist_list_var_$285 = pph_terminal_meta_supports_from_tree(pph_meta_support_tree(support, set.new_set(UNPROVIDED, UNPROVIDED)), UNPROVIDED, UNPROVIDED, UNPROVIDED);
            SubLObject meta_support = NIL;
            meta_support = cdolist_list_var_$285.first();
            while (NIL != cdolist_list_var_$285) {
                final SubLObject item_var = meta_support;
                if (NIL == member(item_var, ans, symbol_function(EQUAL), symbol_function(IDENTITY))) {
                    ans = cons(item_var, ans);
                }
                cdolist_list_var_$285 = cdolist_list_var_$285.rest();
                meta_support = cdolist_list_var_$285.first();
            } 
            cdolist_list_var = cdolist_list_var.rest();
            support = cdolist_list_var.first();
        } 
        return nreverse(ans);
    }

    public static SubLObject pph_explanation_sentences_from_supports(final SubLObject supports) {
        return Mapping.mapcar(PPH_EXPLANATION_SENTENCE_FROM_SUPPORT, supports);
    }

    public static SubLObject pph_explanation_sentence_from_support(final SubLObject support) {
        final SubLObject claims_pred = $$authorityClaims_Term;
        final SubLObject source = (NIL != valid_constantP(claims_pred, UNPROVIDED)) ? pph_explanation_source_for_support(support) : NIL;
        SubLObject sentence = support;
        if (NIL != arguments.hl_support_p(support)) {
            sentence = arguments.support_sentence(support);
        }
        if (NIL != cycl_grammar.cycl_represented_term_p(source)) {
            sentence = make_binary_formula(claims_pred, source, sentence);
        }
        return sentence;
    }

    public static SubLObject pph_explanation_source_for_support(final SubLObject support) {
        if (NIL != assertion_handles.assertion_p(support)) {
            return sources.assertion_sources(support).first();
        }
        return NIL;
    }

    public static SubLObject pph_report_inference_answer(final SubLObject inference_answer, SubLObject language_mt, SubLObject domain_mt, SubLObject mode) {
        if (language_mt == UNPROVIDED) {
            language_mt = pph_vars.$pph_language_mt$.getDynamicValue();
        }
        if (domain_mt == UNPROVIDED) {
            domain_mt = pph_vars.$pph_domain_mt$.getDynamicValue();
        }
        if (mode == UNPROVIDED) {
            mode = pph_vars.$paraphrase_mode$.getDynamicValue();
        }
        assert NIL != inference_datastructures_inference.inference_answer_p(inference_answer) : "inference_datastructures_inference.inference_answer_p(inference_answer) " + "CommonSymbols.NIL != inference_datastructures_inference.inference_answer_p(inference_answer) " + inference_answer;
        return pph_report_inference_answer_int(inference_answer, language_mt, domain_mt, mode);
    }

    public static SubLObject pph_report_all_relevant_inference_answers(final SubLObject inference, SubLObject relevant_fn, SubLObject language_mt, SubLObject domain_mt, SubLObject mode, SubLObject interrupt_time_cutoff, SubLObject abort_time_cutoff) {
        if (relevant_fn == UNPROVIDED) {
            relevant_fn = symbol_function(IDENTITY);
        }
        if (language_mt == UNPROVIDED) {
            language_mt = pph_vars.$pph_language_mt$.getDynamicValue();
        }
        if (domain_mt == UNPROVIDED) {
            domain_mt = pph_vars.$pph_domain_mt$.getDynamicValue();
        }
        if (mode == UNPROVIDED) {
            mode = pph_vars.$paraphrase_mode$.getDynamicValue();
        }
        if (interrupt_time_cutoff == UNPROVIDED) {
            interrupt_time_cutoff = NIL;
        }
        if (abort_time_cutoff == UNPROVIDED) {
            abort_time_cutoff = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != inference_datastructures_inference.inference_p(inference) : "inference_datastructures_inference.inference_p(inference) " + "CommonSymbols.NIL != inference_datastructures_inference.inference_p(inference) " + inference;
        if (((NIL != interrupt_time_cutoff) && (!SubLSystemTrampolineFile.assertionsDisabledInClass)) && (NIL == numberp(interrupt_time_cutoff))) {
            throw new AssertionError(interrupt_time_cutoff);
        }
        if (((NIL != abort_time_cutoff) && (!SubLSystemTrampolineFile.assertionsDisabledInClass)) && (NIL == numberp(abort_time_cutoff))) {
            throw new AssertionError(abort_time_cutoff);
        }
        SubLObject report_strings = NIL;
        SubLObject cycl_answers_used = NIL;
        SubLObject weights = NIL;
        SubLObject problem_dictionaries = NIL;
        SubLObject interruptedP = NIL;
        SubLObject abortedP = NIL;
        SubLObject consistent_stateP = T;
        final SubLObject tag = with_timeout_make_tag();
        try {
            thread.throwStack.push(tag);
            final SubLObject _prev_bind_0 = $within_with_timeout$.currentBinding(thread);
            try {
                $within_with_timeout$.bind(T, thread);
                SubLObject timer = NIL;
                try {
                    final SubLObject _prev_bind_0_$286 = $with_timeout_nesting_depth$.currentBinding(thread);
                    try {
                        $with_timeout_nesting_depth$.bind(add(ONE_INTEGER, $with_timeout_nesting_depth$.getDynamicValue(thread)), thread);
                        timer = with_timeout_start_timer(abort_time_cutoff, tag);
                        final SubLObject _prev_bind_0_$287 = pph_macros.$pph_timeout_time_check_count$.currentBinding(thread);
                        final SubLObject _prev_bind_2 = pph_macros.$pph_timeout_time$.currentBinding(thread);
                        final SubLObject _prev_bind_3 = pph_macros.$pph_timeout_reachedP$.currentBinding(thread);
                        try {
                            pph_macros.$pph_timeout_time_check_count$.bind(ZERO_INTEGER, thread);
                            pph_macros.$pph_timeout_time$.bind(pph_macros.pph_compute_timeout_time(interrupt_time_cutoff), thread);
                            pph_macros.$pph_timeout_reachedP$.bind(pph_macros.$pph_timeout_reachedP$.getDynamicValue(thread), thread);
                            pph_macros.$pph_timeout_reachedP$.setDynamicValue(pph_macros.pph_timeout_time_reachedP(), thread);
                            if (NIL == pph_macros.$pph_timeout_reachedP$.getDynamicValue(thread)) {
                                final SubLObject _prev_bind_0_$288 = pph_macros.$free_pph_problem_store_pointers$.currentBinding(thread);
                                try {
                                    pph_macros.$free_pph_problem_store_pointers$.bind(NIL, thread);
                                    thread.resetMultipleValues();
                                    final SubLObject _prev_bind_0_$289 = pph_macros.$pph_problem_store_pointer$.currentBinding(thread);
                                    try {
                                        pph_macros.$pph_problem_store_pointer$.bind(pph_macros.find_or_create_pph_problem_store_pointer(), thread);
                                        final SubLObject reuseP = thread.secondMultipleValue();
                                        thread.resetMultipleValues();
                                        try {
                                            thread.resetMultipleValues();
                                            final SubLObject _prev_bind_0_$290 = pph_macros.$pph_memoization_state$.currentBinding(thread);
                                            try {
                                                pph_macros.$pph_memoization_state$.bind(pph_macros.find_or_create_pph_memoization_state(), thread);
                                                final SubLObject new_or_reused = thread.secondMultipleValue();
                                                thread.resetMultipleValues();
                                                final SubLObject _prev_bind_0_$291 = pph_macros.$pph_external_memoization_state$.currentBinding(thread);
                                                try {
                                                    pph_macros.$pph_external_memoization_state$.bind(pph_macros.find_or_create_pph_external_memoization_state(), thread);
                                                    final SubLObject local_state = pph_macros.$pph_memoization_state$.getDynamicValue(thread);
                                                    final SubLObject _prev_bind_0_$292 = memoization_state.$memoization_state$.currentBinding(thread);
                                                    try {
                                                        memoization_state.$memoization_state$.bind(local_state, thread);
                                                        final SubLObject original_memoization_process = memoization_state.memoization_state_original_process(local_state);
                                                        try {
                                                            final SubLObject idx = inference_datastructures_inference.inference_answer_id_index(inference);
                                                            if (NIL == id_index_objects_empty_p(idx, $SKIP)) {
                                                                final SubLObject idx_$293 = idx;
                                                                if (NIL == id_index_dense_objects_empty_p(idx_$293, $SKIP)) {
                                                                    final SubLObject vector_var = id_index_dense_objects(idx_$293);
                                                                    final SubLObject backwardP_var = NIL;
                                                                    SubLObject length;
                                                                    SubLObject v_iteration;
                                                                    SubLObject id;
                                                                    SubLObject inference_answer;
                                                                    SubLObject _prev_bind_0_$293;
                                                                    SubLObject _prev_bind_1_$295;
                                                                    SubLObject report_string;
                                                                    SubLObject cycl_answers;
                                                                    SubLObject weight;
                                                                    SubLObject problem_dictionary;
                                                                    for (length = length(vector_var), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL(length); v_iteration = add(v_iteration, ONE_INTEGER)) {
                                                                        id = (NIL != backwardP_var) ? subtract(length, v_iteration, ONE_INTEGER) : v_iteration;
                                                                        inference_answer = aref(vector_var, id);
                                                                        if ((NIL == id_index_tombstone_p(inference_answer)) || (NIL == id_index_skip_tombstones_p($SKIP))) {
                                                                            if (NIL != id_index_tombstone_p(inference_answer)) {
                                                                                inference_answer = $SKIP;
                                                                            }
                                                                            if ((NIL != list_utilities.lengthL(inference_datastructures_inference.inference_answer_bindings(inference_answer), TWO_INTEGER, UNPROVIDED)) && (NIL != funcall(relevant_fn, inference_answer))) {
                                                                                _prev_bind_0_$293 = pph_vars.$pph_domain_mt$.currentBinding(thread);
                                                                                _prev_bind_1_$295 = pph_vars.$pph_demerit_cutoff$.currentBinding(thread);
                                                                                try {
                                                                                    pph_vars.$pph_domain_mt$.bind(domain_mt, thread);
                                                                                    pph_vars.$pph_demerit_cutoff$.bind(TWO_INTEGER, thread);
                                                                                    thread.resetMultipleValues();
                                                                                    report_string = pph_report_inference_answer_int(inference_answer, language_mt, domain_mt, mode);
                                                                                    cycl_answers = thread.secondMultipleValue();
                                                                                    weight = thread.thirdMultipleValue();
                                                                                    problem_dictionary = thread.fourthMultipleValue();
                                                                                    thread.resetMultipleValues();
                                                                                    if (NIL == pph_inference_answer_report_okP(report_string, cycl_answers, weight)) {
                                                                                        report_string = string_utilities.$empty_string$.getGlobalValue();
                                                                                    }
                                                                                    if ((NIL == string_utilities.non_empty_stringP(report_string)) || (NIL == subl_promotions.memberP(report_string, report_strings, symbol_function(EQUALP), UNPROVIDED))) {
                                                                                        consistent_stateP = NIL;
                                                                                        report_strings = cons(report_string, report_strings);
                                                                                        cycl_answers_used = cons(cycl_answers, cycl_answers_used);
                                                                                        weights = cons(weight, weights);
                                                                                        problem_dictionaries = cons(problem_dictionary, problem_dictionaries);
                                                                                        consistent_stateP = T;
                                                                                    }
                                                                                } finally {
                                                                                    pph_vars.$pph_demerit_cutoff$.rebind(_prev_bind_1_$295, thread);
                                                                                    pph_vars.$pph_domain_mt$.rebind(_prev_bind_0_$293, thread);
                                                                                }
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                                final SubLObject idx_$294 = idx;
                                                                if (NIL == id_index_sparse_objects_empty_p(idx_$294)) {
                                                                    final SubLObject cdohash_table = id_index_sparse_objects(idx_$294);
                                                                    SubLObject id2 = NIL;
                                                                    SubLObject inference_answer2 = NIL;
                                                                    final Iterator cdohash_iterator = getEntrySetIterator(cdohash_table);
                                                                    try {
                                                                        while (iteratorHasNext(cdohash_iterator)) {
                                                                            final Map.Entry cdohash_entry = iteratorNextEntry(cdohash_iterator);
                                                                            id2 = getEntryKey(cdohash_entry);
                                                                            inference_answer2 = getEntryValue(cdohash_entry);
                                                                            if ((NIL != list_utilities.lengthL(inference_datastructures_inference.inference_answer_bindings(inference_answer2), TWO_INTEGER, UNPROVIDED)) && (NIL != funcall(relevant_fn, inference_answer2))) {
                                                                                final SubLObject _prev_bind_0_$294 = pph_vars.$pph_domain_mt$.currentBinding(thread);
                                                                                final SubLObject _prev_bind_1_$296 = pph_vars.$pph_demerit_cutoff$.currentBinding(thread);
                                                                                try {
                                                                                    pph_vars.$pph_domain_mt$.bind(domain_mt, thread);
                                                                                    pph_vars.$pph_demerit_cutoff$.bind(TWO_INTEGER, thread);
                                                                                    thread.resetMultipleValues();
                                                                                    SubLObject report_string2 = pph_report_inference_answer_int(inference_answer2, language_mt, domain_mt, mode);
                                                                                    final SubLObject cycl_answers2 = thread.secondMultipleValue();
                                                                                    final SubLObject weight2 = thread.thirdMultipleValue();
                                                                                    final SubLObject problem_dictionary2 = thread.fourthMultipleValue();
                                                                                    thread.resetMultipleValues();
                                                                                    if (NIL == pph_inference_answer_report_okP(report_string2, cycl_answers2, weight2)) {
                                                                                        report_string2 = string_utilities.$empty_string$.getGlobalValue();
                                                                                    }
                                                                                    if ((NIL != string_utilities.non_empty_stringP(report_string2)) && (NIL != subl_promotions.memberP(report_string2, report_strings, symbol_function(EQUALP), UNPROVIDED))) {
                                                                                        continue;
                                                                                    }
                                                                                    consistent_stateP = NIL;
                                                                                    report_strings = cons(report_string2, report_strings);
                                                                                    cycl_answers_used = cons(cycl_answers2, cycl_answers_used);
                                                                                    weights = cons(weight2, weights);
                                                                                    problem_dictionaries = cons(problem_dictionary2, problem_dictionaries);
                                                                                    consistent_stateP = T;
                                                                                } finally {
                                                                                    pph_vars.$pph_demerit_cutoff$.rebind(_prev_bind_1_$296, thread);
                                                                                    pph_vars.$pph_domain_mt$.rebind(_prev_bind_0_$294, thread);
                                                                                }
                                                                            }
                                                                        } 
                                                                    } finally {
                                                                        releaseEntrySetIterator(cdohash_iterator);
                                                                    }
                                                                }
                                                            }
                                                        } finally {
                                                            final SubLObject _prev_bind_0_$295 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                                            try {
                                                                $is_thread_performing_cleanupP$.bind(T, thread);
                                                                final SubLObject _values = getValuesAsVector();
                                                                memoization_state.memoization_state_possibly_clear_original_process(local_state, original_memoization_process);
                                                                restoreValuesFromVector(_values);
                                                            } finally {
                                                                $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$295, thread);
                                                            }
                                                        }
                                                    } finally {
                                                        memoization_state.$memoization_state$.rebind(_prev_bind_0_$292, thread);
                                                    }
                                                } finally {
                                                    pph_macros.$pph_external_memoization_state$.rebind(_prev_bind_0_$291, thread);
                                                }
                                                if ((new_or_reused == $NEW) && (NIL != memoization_state.memoization_state_p(pph_macros.$pph_memoization_state$.getDynamicValue(thread)))) {
                                                    memoization_state.clear_all_memoization(pph_macros.$pph_memoization_state$.getDynamicValue(thread));
                                                }
                                            } finally {
                                                pph_macros.$pph_memoization_state$.rebind(_prev_bind_0_$290, thread);
                                            }
                                        } finally {
                                            final SubLObject _prev_bind_0_$296 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                            try {
                                                $is_thread_performing_cleanupP$.bind(T, thread);
                                                final SubLObject _values2 = getValuesAsVector();
                                                if (NIL == reuseP) {
                                                    pph_macros.free_pph_problem_store_pointer(pph_macros.$pph_problem_store_pointer$.getDynamicValue(thread));
                                                }
                                                restoreValuesFromVector(_values2);
                                            } finally {
                                                $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$296, thread);
                                            }
                                        }
                                    } finally {
                                        pph_macros.$pph_problem_store_pointer$.rebind(_prev_bind_0_$289, thread);
                                    }
                                } finally {
                                    pph_macros.$free_pph_problem_store_pointers$.rebind(_prev_bind_0_$288, thread);
                                }
                            }
                            interruptedP = pph_macros.pph_timeout_time_reachedP();
                        } finally {
                            pph_macros.$pph_timeout_reachedP$.rebind(_prev_bind_3, thread);
                            pph_macros.$pph_timeout_time$.rebind(_prev_bind_2, thread);
                            pph_macros.$pph_timeout_time_check_count$.rebind(_prev_bind_0_$287, thread);
                        }
                    } finally {
                        $with_timeout_nesting_depth$.rebind(_prev_bind_0_$286, thread);
                    }
                } finally {
                    final SubLObject _prev_bind_0_$297 = $is_thread_performing_cleanupP$.currentBinding(thread);
                    try {
                        $is_thread_performing_cleanupP$.bind(T, thread);
                        final SubLObject _values3 = getValuesAsVector();
                        with_timeout_stop_timer(timer);
                        restoreValuesFromVector(_values3);
                    } finally {
                        $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$297, thread);
                    }
                }
            } finally {
                $within_with_timeout$.rebind(_prev_bind_0, thread);
            }
        } catch (final Throwable ccatch_env_var) {
            abortedP = Errors.handleThrowable(ccatch_env_var, tag);
        } finally {
            thread.throwStack.pop();
        }
        if (NIL == consistent_stateP) {
            final SubLObject min_length = min(length(report_strings), new SubLObject[]{ length(cycl_answers_used), length(weights), length(problem_dictionaries) });
            final SubLObject max_length = max(length(report_strings), new SubLObject[]{ length(cycl_answers_used), length(weights), length(problem_dictionaries) });
            if (!min_length.numE(max_length)) {
                report_strings = list_utilities.first_n(min_length, report_strings);
                cycl_answers_used = list_utilities.first_n(min_length, cycl_answers_used);
                weights = list_utilities.first_n(min_length, weights);
                problem_dictionaries = list_utilities.first_n(min_length, problem_dictionaries);
            }
        }
        final SubLObject timed_outP = makeBoolean((NIL != interruptedP) || (NIL != abortedP));
        return values(report_strings, cycl_answers_used, weights, problem_dictionaries, timed_outP);
    }

    public static SubLObject pph_report_inference_answer_int(final SubLObject inference_answer, final SubLObject language_mt, final SubLObject domain_mt, final SubLObject mode) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if ((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) && (NIL == list_utilities.lengthL(inference_datastructures_inference.inference_answer_bindings(inference_answer), TWO_INTEGER, UNPROVIDED))) {
            Errors.error($str435$_S___has_too_many_bindings__no_mo, inference_answer);
        }
        SubLObject report_string = string_utilities.$empty_string$.getGlobalValue();
        SubLObject answer_reported = NIL;
        SubLObject problem_dictionary = NIL;
        SubLObject report_weight = ZERO_INTEGER;
        final SubLObject _prev_bind_0 = pph_vars.$pph_domain_mt$.currentBinding(thread);
        try {
            pph_vars.$pph_domain_mt$.bind(domain_mt, thread);
            final SubLObject report_answer = pph_inference_answer_report_answer(inference_answer);
            final SubLObject force = $DECLARATIVE;
            if (NIL != report_answer) {
                problem_dictionary = dictionary.new_dictionary(symbol_function(EQL), UNPROVIDED);
                final SubLObject matrix_problem_dictionary = pph_vars.$pph_problem_reports$.getDynamicValue(thread);
                final SubLObject _prev_bind_0_$302 = pph_vars.$pph_problem_reporting_mode$.currentBinding(thread);
                final SubLObject _prev_bind_2 = pph_vars.$pph_problem_reports$.currentBinding(thread);
                try {
                    pph_vars.$pph_problem_reporting_mode$.bind(NIL != pph_vars.pph_problem_reporting_on_p() ? pph_vars.$pph_problem_reporting_mode$.getDynamicValue(thread) : $QUIET, thread);
                    pph_vars.$pph_problem_reports$.bind(problem_dictionary, thread);
                    report_string = pph_main.generate_text_wXsentential_force(report_answer, force, $DEFAULT, language_mt, domain_mt, mode, UNPROVIDED);
                    if (NIL != dictionary.dictionary_p(matrix_problem_dictionary)) {
                        pph_phrase.pph_merge_problem_dictionary(pph_vars.$pph_problem_reports$.getDynamicValue(thread), matrix_problem_dictionary);
                    }
                } finally {
                    pph_vars.$pph_problem_reports$.rebind(_prev_bind_2, thread);
                    pph_vars.$pph_problem_reporting_mode$.rebind(_prev_bind_0_$302, thread);
                }
                answer_reported = report_answer;
                report_weight = (NIL != report_string) ? pph_weight_from_problem_dictionary(problem_dictionary) : ZERO_INTEGER;
            }
        } finally {
            pph_vars.$pph_domain_mt$.rebind(_prev_bind_0, thread);
        }
        return values(report_string, answer_reported, report_weight, problem_dictionary);
    }

    public static SubLObject pph_inference_answer_report_answer(final SubLObject inference_answer) {
        final SubLObject v_bindings = inference_datastructures_inference.inference_answer_bindings(inference_answer);
        if (NIL != v_bindings) {
            final SubLObject ans = bindings.variable_binding_value(v_bindings.first());
            return NIL != pph_utilities.pph_irrelevant_fort(ans, UNPROVIDED, UNPROVIDED) ? NIL : ans;
        }
        return $$True;
    }

    public static SubLObject pph_weight_from_problem_dictionary(final SubLObject problem_dictionary) {
        final SubLObject dictionary_length = dictionary.dictionary_length(problem_dictionary);
        return divide($float$1_0, number_utilities.f_1X(dictionary_length));
    }

    public static SubLObject pph_inference_answer_report_okP(final SubLObject report_string, final SubLObject cycl_answer, final SubLObject weight) {
        if (NIL == string_utilities.non_empty_stringP(report_string)) {
            return NIL;
        }
        if (NIL != string_utilities.substringP(constant_reader.constant_reader_prefix(), report_string, UNPROVIDED, UNPROVIDED, UNPROVIDED)) {
            return NIL;
        }
        return T;
    }

    public static SubLObject declare_pph_proof_file() {
        declareFunction(me, "generate_inference_answer_sentence_for_java", "GENERATE-INFERENCE-ANSWER-SENTENCE-FOR-JAVA", 3, 1, false);
        declareFunction(me, "pph_show_inference_answer_proofs", "PPH-SHOW-INFERENCE-ANSWER-PROOFS", 1, 0, false);
        declareFunction(me, "pph_show_inference_answer_proof", "PPH-SHOW-INFERENCE-ANSWER-PROOF", 1, 1, false);
        declareFunction(me, "pph_inference_answer_justification_for_java", "PPH-INFERENCE-ANSWER-JUSTIFICATION-FOR-JAVA", 4, 0, false);
        declareFunction(me, "pph_maybe_show_inference_proof_summary", "PPH-MAYBE-SHOW-INFERENCE-PROOF-SUMMARY", 2, 0, false);
        declareFunction(me, "pph_proof_used_assertions", "PPH-PROOF-USED-ASSERTIONS", 2, 2, false);
        declareFunction(me, "pph_proof_used_assertions_from_subproofs", "PPH-PROOF-USED-ASSERTIONS-FROM-SUBPROOFS", 4, 0, false);
        declareFunction(me, "pph_proof_used_assertions_from_supports", "PPH-PROOF-USED-ASSERTIONS-FROM-SUPPORTS", 4, 0, false);
        declareFunction(me, "pph_proof_used_external_supports", "PPH-PROOF-USED-EXTERNAL-SUPPORTS", 2, 2, false);
        declareFunction(me, "pph_proof_external_supports_from_subproofs", "PPH-PROOF-EXTERNAL-SUPPORTS-FROM-SUBPROOFS", 4, 0, false);
        declareFunction(me, "pph_proof_external_supports_from_supports", "PPH-PROOF-EXTERNAL-SUPPORTS-FROM-SUPPORTS", 4, 0, false);
        declareFunction(me, "sksi_proof_p", "SKSI-PROOF-P", 1, 0, false);
        declareFunction(me, "pph_meta_supports_from_tree", "PPH-META-SUPPORTS-FROM-TREE", 1, 4, false);
        declareFunction(me, "pph_terminal_meta_supports_from_tree", "PPH-TERMINAL-META-SUPPORTS-FROM-TREE", 1, 3, false);
        declareFunction(me, "pph_exempted_supportP", "PPH-EXEMPTED-SUPPORT?", 1, 0, false);
        declareFunction(me, "pph_proof_proven_sentences", "PPH-PROOF-PROVEN-SENTENCES", 2, 0, false);
        declareFunction(me, "pph_proof_proven_sentence_el_sentence", "PPH-PROOF-PROVEN-SENTENCE-EL-SENTENCE", 1, 0, false);
        declareFunction(me, "inference_answer_get_proofs", "INFERENCE-ANSWER-GET-PROOFS", 1, 0, false);
        declareFunction(me, "pph_pick_justification_proof", "PPH-PICK-JUSTIFICATION-PROOF", 1, 0, false);
        declareFunction(me, "pph_preferable_and_equal_proofP", "PPH-PREFERABLE-AND-EQUAL-PROOF?", 2, 0, false);
        declareFunction(me, "inference_answer_get_justification_with_proof", "INFERENCE-ANSWER-GET-JUSTIFICATION-WITH-PROOF", 2, 0, false);
        declareFunction(me, "pph_find_best_proof", "PPH-FIND-BEST-PROOF", 1, 0, false);
        declareFunction(me, "pph_proof_depth", "PPH-PROOF-DEPTH", 1, 0, false);
        declareFunction(me, "pph_proof_depth_memoized_internal", "PPH-PROOF-DEPTH-MEMOIZED-INTERNAL", 1, 0, false);
        declareFunction(me, "pph_proof_depth_memoized", "PPH-PROOF-DEPTH-MEMOIZED", 1, 0, false);
        declareFunction(me, "pph_proof_E", "PPH-PROOF-=", 2, 0, false);
        declareMacro(me, "pph_irrelevant_warn", "PPH-IRRELEVANT-WARN");
        declareFunction(me, "pph_show_inference_proof", "PPH-SHOW-INFERENCE-PROOF", 2, 1, false);
        declareFunction(me, "pph_top_level_proof_p", "PPH-TOP-LEVEL-PROOF-P", 0, 0, false);
        declareFunction(me, "pph_proof_show_see_above", "PPH-PROOF-SHOW-SEE-ABOVE", 1, 0, false);
        declareFunction(me, "pph_proof_show_hypothetical_attribution", "PPH-PROOF-SHOW-HYPOTHETICAL-ATTRIBUTION", 1, 0, false);
        declareFunction(me, "pph_proof_show_short_attribution", "PPH-PROOF-SHOW-SHORT-ATTRIBUTION", 2, 0, false);
        declareFunction(me, "pph_justify_proofP", "PPH-JUSTIFY-PROOF?", 2, 1, false);
        declareFunction(me, "find_or_create_pph_displayed_proof_stack", "FIND-OR-CREATE-PPH-DISPLAYED-PROOF-STACK", 0, 0, false);
        declareFunction(me, "pph_note_proof_displayed", "PPH-NOTE-PROOF-DISPLAYED", 1, 0, false);
        declareFunction(me, "pph_most_recent_proof_displayed", "PPH-MOST-RECENT-PROOF-DISPLAYED", 0, 0, false);
        declareFunction(me, "pph_proof_already_displayed_p", "PPH-PROOF-ALREADY-DISPLAYED-P", 1, 0, false);
        declareFunction(me, "pph_proof_query_equalP", "PPH-PROOF-QUERY-EQUAL?", 2, 0, false);
        declareFunction(me, "pph_proof_lits_equal", "PPH-PROOF-LITS-EQUAL", 2, 0, false);
        declareFunction(me, "find_or_create_pph_justified_proof_set", "FIND-OR-CREATE-PPH-JUSTIFIED-PROOF-SET", 0, 0, false);
        declareFunction(me, "pph_note_proof_justified", "PPH-NOTE-PROOF-JUSTIFIED", 1, 0, false);
        declareFunction(me, "pph_proof_already_justified_p", "PPH-PROOF-ALREADY-JUSTIFIED-P", 1, 0, false);
        declareFunction(me, "pph_note_support_displayed", "PPH-NOTE-SUPPORT-DISPLAYED", 1, 0, false);
        declareFunction(me, "pph_proofs_analogousP", "PPH-PROOFS-ANALOGOUS?", 3, 0, false);
        declareFunction(me, "pph_proofs_analogousP_int", "PPH-PROOFS-ANALOGOUS?-INT", 3, 1, false);
        declareFunction(me, "pph_show_analogous_proof", "PPH-SHOW-ANALOGOUS-PROOF", 3, 0, false);
        declareFunction(me, "pph_show_trivial_proof", "PPH-SHOW-TRIVIAL-PROOF", 2, 0, false);
        declareFunction(me, "pph_show_proof_query_and_supports", "PPH-SHOW-PROOF-QUERY-AND-SUPPORTS", 4, 1, false);
        declareFunction(me, "pph_show_proof_supports_and_conclusion", "PPH-SHOW-PROOF-SUPPORTS-AND-CONCLUSION", 3, 0, false);
        declareFunction(me, "pph_displayworthy_supports", "PPH-DISPLAYWORTHY-SUPPORTS", 1, 4, false);
        declareFunction(me, "proof_view_pruning_ruleP", "PROOF-VIEW-PRUNING-RULE?", 1, 1, false);
        declareFunction(me, "remove_if_pph_irrelevant_support", "REMOVE-IF-PPH-IRRELEVANT-SUPPORT", 2, 0, false);
        declareFunction(me, "pph_non_trivial_proof_supports", "PPH-NON-TRIVIAL-PROOF-SUPPORTS", 1, 0, false);
        declareFunction(me, "pph_real_or_quasi_transformation_proof_p", "PPH-REAL-OR-QUASI-TRANSFORMATION-PROOF-P", 1, 0, false);
        declareFunction(me, "pph_real_or_quasi_transformation_proof_rule", "PPH-REAL-OR-QUASI-TRANSFORMATION-PROOF-RULE", 1, 0, false);
        declareFunction(me, "pph_real_or_quasi_transformation_proof_intermediate_conclusions", "PPH-REAL-OR-QUASI-TRANSFORMATION-PROOF-INTERMEDIATE-CONCLUSIONS", 2, 0, false);
        declareFunction(me, "pph_assertion_deduced_support_sentences", "PPH-ASSERTION-DEDUCED-SUPPORT-SENTENCES", 2, 1, false);
        declareFunction(me, "pph_quasi_transformation_proof_p", "PPH-QUASI-TRANSFORMATION-PROOF-P", 1, 0, false);
        declareFunction(me, "pph_hl_transformation_proof_p", "PPH-HL-TRANSFORMATION-PROOF-P", 1, 0, false);
        declareFunction(me, "pph_cached_transformation_proof_p", "PPH-CACHED-TRANSFORMATION-PROOF-P", 1, 0, false);
        declareFunction(me, "pph_cached_transformation_proof_supporting_assertion", "PPH-CACHED-TRANSFORMATION-PROOF-SUPPORTING-ASSERTION", 1, 0, false);
        declareFunction(me, "pph_show_real_or_quasi_transformation_proof_supports_bu", "PPH-SHOW-REAL-OR-QUASI-TRANSFORMATION-PROOF-SUPPORTS-BU", 3, 1, false);
        declareFunction(me, "pph_show_real_or_quasi_transformation_proof_conclusion", "PPH-SHOW-REAL-OR-QUASI-TRANSFORMATION-PROOF-CONCLUSION", 1, 2, false);
        declareFunction(me, "pph_show_proof_conclusion_int", "PPH-SHOW-PROOF-CONCLUSION-INT", 1, 0, false);
        declareFunction(me, "pph_real_or_quasi_transformation_proof_conclusion", "PPH-REAL-OR-QUASI-TRANSFORMATION-PROOF-CONCLUSION", 2, 0, false);
        declareFunction(me, "pph_show_proof_query_and_supports_default", "PPH-SHOW-PROOF-QUERY-AND-SUPPORTS-DEFAULT", 4, 0, false);
        declareFunction(me, "pph_show_real_or_quasi_transformation_proof_supports", "PPH-SHOW-REAL-OR-QUASI-TRANSFORMATION-PROOF-SUPPORTS", 3, 1, false);
        declareFunction(me, "pph_show_transformation_proof_supports", "PPH-SHOW-TRANSFORMATION-PROOF-SUPPORTS", 3, 1, false);
        declareFunction(me, "pph_transformation_subproof_worth_showingP", "PPH-TRANSFORMATION-SUBPROOF-WORTH-SHOWING?", 2, 0, false);
        declareFunction(me, "pph_transformation_subproof_worth_showingP_int", "PPH-TRANSFORMATION-SUBPROOF-WORTH-SHOWING?-INT", 2, 0, false);
        declareFunction(me, "pph_show_hl_transformation_proof_supports_bu", "PPH-SHOW-HL-TRANSFORMATION-PROOF-SUPPORTS-BU", 3, 0, false);
        declareFunction(me, "pph_show_hl_transformation_proof_supports", "PPH-SHOW-HL-TRANSFORMATION-PROOF-SUPPORTS", 3, 1, false);
        declareFunction(me, "pph_show_cached_transformation_proof_supports_bu", "PPH-SHOW-CACHED-TRANSFORMATION-PROOF-SUPPORTS-BU", 3, 0, false);
        declareFunction(me, "pph_show_cached_transformation_proof_supports", "PPH-SHOW-CACHED-TRANSFORMATION-PROOF-SUPPORTS", 3, 1, false);
        declareFunction(me, "pph_show_cached_transformation_proof_supports_from_as", "PPH-SHOW-CACHED-TRANSFORMATION-PROOF-SUPPORTS-FROM-AS", 4, 0, false);
        declareFunction(me, "pph_reconstructed_transformation_proof_support_tree_p", "PPH-RECONSTRUCTED-TRANSFORMATION-PROOF-SUPPORT-TREE-P", 1, 0, false);
        declareFunction(me, "pph_show_reconstructed_transformation_proof_support_tree", "PPH-SHOW-RECONSTRUCTED-TRANSFORMATION-PROOF-SUPPORT-TREE", 3, 1, false);
        declareFunction(me, "pph_find_transformation_support_trees", "PPH-FIND-TRANSFORMATION-SUPPORT-TREES", 2, 0, false);
        declareFunction(me, "pph_show_transformation_proof_rule", "PPH-SHOW-TRANSFORMATION-PROOF-RULE", 4, 0, false);
        declareFunction(me, "pph_show_valid_transformation_proof_rule", "PPH-SHOW-VALID-TRANSFORMATION-PROOF-RULE", 5, 1, false);
        declareFunction(me, "pph_focus_rule_formula", "PPH-FOCUS-RULE-FORMULA", 3, 0, false);
        declareFunction(me, "pph_show_restriction_subproofs", "PPH-SHOW-RESTRICTION-SUBPROOFS", 4, 0, false);
        declareFunction(me, "pph_proof_show_givens", "PPH-PROOF-SHOW-GIVENS", 3, 2, false);
        declareFunction(me, "pph_display_restricted_and_general_rule", "PPH-DISPLAY-RESTRICTED-AND-GENERAL-RULE", 7, 0, false);
        declareFunction(me, "pph_support_trivialP", "PPH-SUPPORT-TRIVIAL?", 1, 1, false);
        declareFunction(me, "pph_triviality_check_mt", "PPH-TRIVIALITY-CHECK-MT", 0, 0, false);
        declareFunction(me, "pph_triviality_check_mt_for_addressee_internal", "PPH-TRIVIALITY-CHECK-MT-FOR-ADDRESSEE-INTERNAL", 0, 2, false);
        declareFunction(me, "pph_triviality_check_mt_for_addressee", "PPH-TRIVIALITY-CHECK-MT-FOR-ADDRESSEE", 0, 2, false);
        declareFunction(me, "pph_irrelevance_check_mt", "PPH-IRRELEVANCE-CHECK-MT", 0, 0, false);
        declareFunction(me, "pph_irrelevance_check_mt_for_addressee_internal", "PPH-IRRELEVANCE-CHECK-MT-FOR-ADDRESSEE-INTERNAL", 0, 2, false);
        declareFunction(me, "pph_irrelevance_check_mt_for_addressee", "PPH-IRRELEVANCE-CHECK-MT-FOR-ADDRESSEE", 0, 2, false);
        declareFunction(me, "pph_required_ruleP", "PPH-REQUIRED-RULE?", 1, 0, false);
        declareFunction(me, "pph_trivial_assertionP", "PPH-TRIVIAL-ASSERTION?", 1, 1, false);
        declareFunction(me, "pph_assertion_trivialP", "PPH-ASSERTION-TRIVIAL?", 1, 1, false);
        declareFunction(me, "pph_trivial_derived_assertionP", "PPH-TRIVIAL-DERIVED-ASSERTION?", 2, 0, false);
        declareFunction(me, "pph_trivial_mtP", "PPH-TRIVIAL-MT?", 1, 1, false);
        declareFunction(me, "pph_proof_to_show_p", "PPH-PROOF-TO-SHOW-P", 3, 0, false);
        declareFunction(me, "pph_non_explanatory_proof_p", "PPH-NON-EXPLANATORY-PROOF-P", 1, 0, false);
        declareFunction(me, "pph_non_explanatory_proofs", "PPH-NON-EXPLANATORY-PROOFS", 0, 0, false);
        declareMacro(me, "pph_proof_fancy_indent", "PPH-PROOF-FANCY-INDENT");
        declareMacro(me, "pph_proof_indent", "PPH-PROOF-INDENT");
        declareFunction(me, "pph_maybe_show_subproofs", "PPH-MAYBE-SHOW-SUBPROOFS", 3, 1, false);
        declareFunction(me, "pph_set_meta_support_max", "PPH-SET-META-SUPPORT-MAX", 1, 0, false);
        declareFunction(me, "pph_show_support", "PPH-SHOW-SUPPORT", 1, 2, false);
        declareFunction(me, "pph_justification_pred_highly_relevantP", "PPH-JUSTIFICATION-PRED-HIGHLY-RELEVANT?", 1, 1, false);
        declareFunction(me, "pph_show_invalidated_support", "PPH-SHOW-INVALIDATED-SUPPORT", 1, 0, false);
        declareFunction(me, "pph_maybe_show_meta_supports", "PPH-MAYBE-SHOW-META-SUPPORTS", 1, 2, false);
        declareFunction(me, "pph_show_supports_wXo_indent", "PPH-SHOW-SUPPORTS-W/O-INDENT", 2, 0, false);
        declareFunction(me, "pph_maybe_show_assert_info", "PPH-MAYBE-SHOW-ASSERT-INFO", 2, 0, false);
        declareFunction(me, "pph_assertion_has_assert_infoP", "PPH-ASSERTION-HAS-ASSERT-INFO?", 1, 0, false);
        declareFunction(me, "pph_show_assert_info", "PPH-SHOW-ASSERT-INFO", 1, 0, false);
        declareFunction(me, "pph_skip_meta_supports_for_support_p", "PPH-SKIP-META-SUPPORTS-FOR-SUPPORT-P", 1, 0, false);
        declareFunction(me, "pph_displayed_supports", "PPH-DISPLAYED-SUPPORTS", 0, 0, false);
        declareFunction(me, "pph_proof_support_already_shown_p", "PPH-PROOF-SUPPORT-ALREADY-SHOWN-P", 1, 0, false);
        declareFunction(me, "pph_meta_supports_to_show", "PPH-META-SUPPORTS-TO-SHOW", 1, 2, false);
        declareFunction(me, "pph_sort_meta_supports", "PPH-SORT-META-SUPPORTS", 1, 0, false);
        declareFunction(me, "pph_meta_support_should_precedeP", "PPH-META-SUPPORT-SHOULD-PRECEDE?", 2, 0, false);
        declareFunction(me, "pph_rule_literals_to_suppress", "PPH-RULE-LITERALS-TO-SUPPRESS", 1, 1, false);
        declareFunction(me, "pph_literals_to_suppress_from_rule_and_conclusion", "PPH-LITERALS-TO-SUPPRESS-FROM-RULE-AND-CONCLUSION", 2, 1, false);
        declareFunction(me, "pph_literals_to_suppress_from_deductions", "PPH-LITERALS-TO-SUPPRESS-FROM-DEDUCTIONS", 3, 0, false);
        declareFunction(me, "substitute_pph_var_binding", "SUBSTITUTE-PPH-VAR-BINDING", 1, 0, false);
        declareFunction(me, "pph_prune_meta_supports", "PPH-PRUNE-META-SUPPORTS", 2, 0, false);
        declareFunction(me, "pph_show_all_meta_supports_for_module_p", "PPH-SHOW-ALL-META-SUPPORTS-FOR-MODULE-P", 1, 0, false);
        declareFunction(me, "pph_always_show_meta_support_for_moduleP_internal", "PPH-ALWAYS-SHOW-META-SUPPORT-FOR-MODULE?-INTERNAL", 2, 0, false);
        declareFunction(me, "pph_always_show_meta_support_for_moduleP", "PPH-ALWAYS-SHOW-META-SUPPORT-FOR-MODULE?", 2, 0, false);
        declareFunction(me, "pph_show_argument", "PPH-SHOW-ARGUMENT", 2, 0, false);
        declareFunction(me, "pph_irrelevant_proof_conclusionP", "PPH-IRRELEVANT-PROOF-CONCLUSION?", 1, 0, false);
        declareFunction(me, "pph_irrelevant_supportP_internal", "PPH-IRRELEVANT-SUPPORT?-INTERNAL", 1, 2, false);
        declareFunction(me, "pph_irrelevant_supportP", "PPH-IRRELEVANT-SUPPORT?", 1, 2, false);
        declareFunction(me, "pph_irrelevant_support_module_p", "PPH-IRRELEVANT-SUPPORT-MODULE-P", 1, 0, false);
        declareFunction(me, "pph_support_sentence", "PPH-SUPPORT-SENTENCE", 1, 1, false);
        declareFunction(me, "pph_support_el_sentence_internal", "PPH-SUPPORT-EL-SENTENCE-INTERNAL", 1, 0, false);
        declareFunction(me, "pph_support_el_sentence", "PPH-SUPPORT-EL-SENTENCE", 1, 0, false);
        declareFunction(me, "pph_sentence_replace_redundant_narts", "PPH-SENTENCE-REPLACE-REDUNDANT-NARTS", 1, 0, false);
        declareFunction(me, "pph_transformable_redundant_nart_p", "PPH-TRANSFORMABLE-REDUNDANT-NART-P", 1, 0, false);
        declareFunction(me, "pph_transform_redundant_nart", "PPH-TRANSFORM-REDUNDANT-NART", 1, 0, false);
        declareFunction(me, "pph_constant_for_nart_internal", "PPH-CONSTANT-FOR-NART-INTERNAL", 1, 0, false);
        declareFunction(me, "pph_constant_for_nart", "PPH-CONSTANT-FOR-NART", 1, 0, false);
        declareFunction(me, "pph_irrelevant_formulaP", "PPH-IRRELEVANT-FORMULA?", 1, 2, false);
        declareFunction(me, "pph_trivial_sentenceP", "PPH-TRIVIAL-SENTENCE?", 1, 1, false);
        declareFunction(me, "sentence_trivial_for_justification_paraphraseP", "SENTENCE-TRIVIAL-FOR-JUSTIFICATION-PARAPHRASE?", 1, 1, false);
        declareFunction(me, "sentence_has_trivial_isomorphic_assertionP_internal", "SENTENCE-HAS-TRIVIAL-ISOMORPHIC-ASSERTION?-INTERNAL", 2, 0, false);
        declareFunction(me, "sentence_has_trivial_isomorphic_assertionP", "SENTENCE-HAS-TRIVIAL-ISOMORPHIC-ASSERTION?", 2, 0, false);
        declareFunction(me, "pph_trivial_the_sentenceP", "PPH-TRIVIAL-THE-SENTENCE?", 1, 1, false);
        declareFunction(me, "pph_trivial_upper_ontology_sentenceP", "PPH-TRIVIAL-UPPER-ONTOLOGY-SENTENCE?", 1, 0, false);
        declareFunction(me, "pph_trivial_functional_sentenceP", "PPH-TRIVIAL-FUNCTIONAL-SENTENCE?", 1, 1, false);
        declareFunction(me, "pph_trivial_instance_with_relation_isa_sentenceP", "PPH-TRIVIAL-INSTANCE-WITH-RELATION-ISA-SENTENCE?", 1, 0, false);
        declareFunction(me, "pph_trivial_genls_sentenceP", "PPH-TRIVIAL-GENLS-SENTENCE?", 1, 1, false);
        declareFunction(me, "pph_trivial_isa_sentenceP", "PPH-TRIVIAL-ISA-SENTENCE?", 1, 1, false);
        declareFunction(me, "pph_trivial_genl_preds_sentenceP", "PPH-TRIVIAL-GENL-PREDS-SENTENCE?", 1, 1, false);
        declareFunction(me, "pph_required_sentenceP_internal", "PPH-REQUIRED-SENTENCE?-INTERNAL", 2, 0, false);
        declareFunction(me, "pph_required_sentenceP", "PPH-REQUIRED-SENTENCE?", 2, 0, false);
        declareFunction(me, "pph_trivial_subcollection_pred_sentenceP", "PPH-TRIVIAL-SUBCOLLECTION-PRED-SENTENCE?", 1, 0, false);
        declareFunction(me, "pph_trivial_reflexive_sentenceP", "PPH-TRIVIAL-REFLEXIVE-SENTENCE?", 1, 0, false);
        declareFunction(me, "pph_trivial_termP_internal", "PPH-TRIVIAL-TERM?-INTERNAL", 2, 1, false);
        declareFunction(me, "pph_trivial_termP", "PPH-TRIVIAL-TERM?", 2, 1, false);
        declareFunction(me, "triviality_sentence_for_term", "TRIVIALITY-SENTENCE-FOR-TERM", 2, 0, false);
        declareFunction(me, "triviality_query_properties", "TRIVIALITY-QUERY-PROPERTIES", 1, 0, false);
        declareFunction(me, "term_has_pro_trivial_argumentP", "TERM-HAS-PRO-TRIVIAL-ARGUMENT?", 4, 0, false);
        declareFunction(me, "assertion_has_triviality_assertionsP", "ASSERTION-HAS-TRIVIALITY-ASSERTIONS?", 1, 0, false);
        declareFunction(me, "term_has_con_trivial_argumentP", "TERM-HAS-CON-TRIVIAL-ARGUMENT?", 4, 0, false);
        declareFunction(me, "pph_maybe_show_additional_supports", "PPH-MAYBE-SHOW-ADDITIONAL-SUPPORTS", 2, 0, false);
        declareFunction(me, "pph_show_assertion", "PPH-SHOW-ASSERTION", 1, 0, false);
        declareFunction(me, "pph_show_assertion_int", "PPH-SHOW-ASSERTION-INT", 1, 0, false);
        declareFunction(me, "pph_assert_info", "PPH-ASSERT-INFO", 1, 0, false);
        declareFunction(me, "pph_show_source", "PPH-SHOW-SOURCE", 1, 1, false);
        declareFunction(me, "pph_highly_relevant_assertionP", "PPH-HIGHLY-RELEVANT-ASSERTION?", 1, 1, false);
        declareFunction(me, "pph_show_sentence", "PPH-SHOW-SENTENCE", 1, 2, false);
        declareFunction(me, "pph_show_term", "PPH-SHOW-TERM", 1, 2, false);
        declareFunction(me, "pph_show_question", "PPH-SHOW-QUESTION", 1, 0, false);
        declareFunction(me, "pph_term_phrase_np", "PPH-TERM-PHRASE-NP", 1, 0, false);
        declareFunction(me, "pph_show_wXsentential_force", "PPH-SHOW-W/SENTENTIAL-FORCE", 2, 1, false);
        declareFunction(me, "pph_templated_proofP", "PPH-TEMPLATED-PROOF?", 1, 0, false);
        declareFunction(me, "pph_proof_template", "PPH-PROOF-TEMPLATE", 1, 0, false);
        declareFunction(me, "pph_get_proof_template", "PPH-GET-PROOF-TEMPLATE", 1, 0, false);
        declareFunction(me, "pph_choose_proof_template", "PPH-CHOOSE-PROOF-TEMPLATE", 2, 0, false);
        declareFunction(me, "pph_show_templated_proof", "PPH-SHOW-TEMPLATED-PROOF", 3, 1, false);
        declareFunction(me, "pph_proof_template_var_name", "PPH-PROOF-TEMPLATE-VAR-NAME", 2, 0, false);
        declareFunction(me, "pph_show_proof_template_motivation", "PPH-SHOW-PROOF-TEMPLATE-MOTIVATION", 4, 0, false);
        declareFunction(me, "pph_proof_template_applicability_constraints", "PPH-PROOF-TEMPLATE-APPLICABILITY-CONSTRAINTS", 1, 0, false);
        declareFunction(me, "pph_proof_template_has_preconditionsP", "PPH-PROOF-TEMPLATE-HAS-PRECONDITIONS?", 1, 0, false);
        declareFunction(me, "pph_proof_show_template", "PPH-PROOF-SHOW-TEMPLATE", 1, 0, false);
        declareFunction(me, "pph_proof_template_show_precondition_proofs", "PPH-PROOF-TEMPLATE-SHOW-PRECONDITION-PROOFS", 4, 0, false);
        declareFunction(me, "pph_show_proof_template_body", "PPH-SHOW-PROOF-TEMPLATE-BODY", 4, 0, false);
        declareFunction(me, "pph_show_proof_template_variable_bindings", "PPH-SHOW-PROOF-TEMPLATE-VARIABLE-BINDINGS", 4, 0, false);
        declareFunction(me, "pph_proof_template_vars_to_substitute", "PPH-PROOF-TEMPLATE-VARS-TO-SUBSTITUTE", 1, 0, false);
        declareFunction(me, "pph_show_proof_template_conclusion", "PPH-SHOW-PROOF-TEMPLATE-CONCLUSION", 5, 0, false);
        declareFunction(me, "debug_construct_proof_views", "DEBUG-CONSTRUCT-PROOF-VIEWS", 1, 2, false);
        declareFunction(me, "show_proof_view", "SHOW-PROOF-VIEW", 1, 1, false);
        declareFunction(me, "proof_view_tab_id_for_entry_internal", "PROOF-VIEW-TAB-ID-FOR-ENTRY-INTERNAL", 1, 0, false);
        declareFunction(me, "proof_view_tab_id_for_entry", "PROOF-VIEW-TAB-ID-FOR-ENTRY", 1, 0, false);
        declareFunction(me, "show_proof_view_error_output", "SHOW-PROOF-VIEW-ERROR-OUTPUT", 1, 0, false);
        declareFunction(me, "proof_view_show_buttons", "PROOF-VIEW-SHOW-BUTTONS", 1, 0, false);
        declareFunction(me, "show_proof_view_params", "SHOW-PROOF-VIEW-PARAMS", 1, 0, false);
        declareFunction(me, "show_proof_view_toc", "SHOW-PROOF-VIEW-TOC", 0, 0, false);
        declareFunction(me, "maybe_insert_proof_view_entry_anchor", "MAYBE-INSERT-PROOF-VIEW-ENTRY-ANCHOR", 1, 0, false);
        declareMacro(me, "show_proof_view_filtered_items_row", "SHOW-PROOF-VIEW-FILTERED-ITEMS-ROW");
        declareFunction(me, "show_proof_view_filtered_items", "SHOW-PROOF-VIEW-FILTERED-ITEMS", 1, 0, false);
        declareFunction(me, "cyc_proof_view_section_html", "CYC-PROOF-VIEW-SECTION-HTML", 2, 0, false);
        declareFunction(me, "proof_view_section_html", "PROOF-VIEW-SECTION-HTML", 1, 0, false);
        declareFunction(me, "show_proof_view_entry", "SHOW-PROOF-VIEW-ENTRY", 1, 1, false);
        declareFunction(me, "show_proof_view_entry_local_content", "SHOW-PROOF-VIEW-ENTRY-LOCAL-CONTENT", 4, 0, false);
        declareFunction(me, "maybe_show_proof_view_entry_bug_report_link", "MAYBE-SHOW-PROOF-VIEW-ENTRY-BUG-REPORT-LINK", 1, 0, false);
        declareFunction(me, "show_bug_report_link_for_proof_view_entryP", "SHOW-BUG-REPORT-LINK-FOR-PROOF-VIEW-ENTRY?", 1, 0, false);
        declareFunction(me, "show_proof_view_object", "SHOW-PROOF-VIEW-OBJECT", 3, 0, false);
        declareFunction(me, "proof_view_entry_initial_child_visibility", "PROOF-VIEW-ENTRY-INITIAL-CHILD-VISIBILITY", 2, 0, false);
        declareFunction(me, "proof_view_entry_class", "PROOF-VIEW-ENTRY-CLASS", 1, 0, false);
        declareFunction(me, "proof_view_html_class", "PROOF-VIEW-HTML-CLASS", 1, 0, false);
        declareFunction(me, "show_proof_view_object_typeP", "SHOW-PROOF-VIEW-OBJECT-TYPE?", 1, 0, false);
        declareFunction(me, "debug_proof_view_cb_link_for_term", "DEBUG-PROOF-VIEW-CB-LINK-FOR-TERM", 4, 0, false);
        declareFunction(me, "debug_proof_view_entry_label_color", "DEBUG-PROOF-VIEW-ENTRY-LABEL-COLOR", 1, 0, false);
        declareFunction(me, "pph_get_inference_mt", "PPH-GET-INFERENCE-MT", 1, 0, false);
        declareFunction(me, "proof_of_inference_answer_p", "PROOF-OF-INFERENCE-ANSWER-P", 2, 0, false);
        declareFunction(me, "support_cnf", "SUPPORT-CNF", 1, 0, false);
        declareFunction(me, "hypothetical_mtP", "HYPOTHETICAL-MT?", 1, 0, false);
        declareFunction(me, "pph_proof_from_hypothesisP", "PPH-PROOF-FROM-HYPOTHESIS?", 2, 0, false);
        declareFunction(me, "pph_hypothesized_supportP", "PPH-HYPOTHESIZED-SUPPORT?", 2, 0, false);
        declareFunction(me, "pph_assertion_references_hypothetical_term_p", "PPH-ASSERTION-REFERENCES-HYPOTHETICAL-TERM-P", 1, 0, false);
        declareFunction(me, "pph_hypothesis_mt_for_mtP", "PPH-HYPOTHESIS-MT-FOR-MT?", 2, 0, false);
        declareFunction(me, "pph_terminal_transformation_proof_p", "PPH-TERMINAL-TRANSFORMATION-PROOF-P", 1, 0, false);
        declareFunction(me, "pph_proof_has_transformation_subproofs_p", "PPH-PROOF-HAS-TRANSFORMATION-SUBPROOFS-P", 1, 0, false);
        declareFunction(me, "pph_find_subproofs_matching_asents", "PPH-FIND-SUBPROOFS-MATCHING-ASENTS", 3, 0, false);
        declareFunction(me, "pph_restrict_transformation_rule", "PPH-RESTRICT-TRANSFORMATION-RULE", 3, 0, false);
        declareFunction(me, "pph_restrict_rule_via_subproofs", "PPH-RESTRICT-RULE-VIA-SUBPROOFS", 4, 0, false);
        declareFunction(me, "pph_remove_trivial_neg_lits", "PPH-REMOVE-TRIVIAL-NEG-LITS", 1, 0, false);
        declareFunction(me, "pph_remove_trivial_evaluatable_neg_lits", "PPH-REMOVE-TRIVIAL-EVALUATABLE-NEG-LITS", 1, 0, false);
        declareFunction(me, "pph_trivial_neg_litP", "PPH-TRIVIAL-NEG-LIT?", 1, 1, false);
        declareFunction(me, "pph_restricted_rule_resolve_tous", "PPH-RESTRICTED-RULE-RESOLVE-TOUS", 1, 0, false);
        declareFunction(me, "pph_subproof_matches_asent_p", "PPH-SUBPROOF-MATCHES-ASENT-P", 3, 0, false);
        declareFunction(me, "pph_restriction_subproofs_and_bindings", "PPH-RESTRICTION-SUBPROOFS-AND-BINDINGS", 1, 0, false);
        declareFunction(me, "pph_lookup_subproofs", "PPH-LOOKUP-SUBPROOFS", 1, 0, false);
        declareFunction(me, "pph_subproof_to_proof_variable_map", "PPH-SUBPROOF-TO-PROOF-VARIABLE-MAP", 2, 0, false);
        declareFunction(me, "pph_lookup_proof_p", "PPH-LOOKUP-PROOF-P", 1, 0, false);
        declareFunction(me, "pph_proof_subproofs", "PPH-PROOF-SUBPROOFS", 1, 0, false);
        declareFunction(me, "pph_proof_conclusion_internal", "PPH-PROOF-CONCLUSION-INTERNAL", 1, 1, false);
        declareFunction(me, "pph_proof_conclusion", "PPH-PROOF-CONCLUSION", 1, 1, false);
        declareFunction(me, "check_for_isomorphic_assertionP", "CHECK-FOR-ISOMORPHIC-ASSERTION?", 1, 0, false);
        declareFunction(me, "formula_too_complex_for_proof_paraphraseP", "FORMULA-TOO-COMPLEX-FOR-PROOF-PARAPHRASE?", 1, 1, false);
        declareFunction(me, "pph_proof_el_formula", "PPH-PROOF-EL-FORMULA", 2, 0, false);
        declareFunction(me, "pph_proof_wX_isomorphic_support_p", "PPH-PROOF-W/-ISOMORPHIC-SUPPORT-P", 1, 0, false);
        declareFunction(me, "pph_sub_isomorphic_assertions_into_supports", "PPH-SUB-ISOMORPHIC-ASSERTIONS-INTO-SUPPORTS", 1, 0, false);
        declareFunction(me, "pph_hl_support_with_isomorphic_assertionP", "PPH-HL-SUPPORT-WITH-ISOMORPHIC-ASSERTION?", 1, 0, false);
        declareFunction(me, "pph_find_assertion_for_support", "PPH-FIND-ASSERTION-FOR-SUPPORT", 1, 0, false);
        declareFunction(me, "pph_find_assertion_from_cnfs", "PPH-FIND-ASSERTION-FROM-CNFS", 2, 0, false);
        declareFunction(me, "pph_find_assertion_from_cnf", "PPH-FIND-ASSERTION-FROM-CNF", 2, 0, false);
        declareFunction(me, "pph_assertion_support_tree", "PPH-ASSERTION-SUPPORT-TREE", 1, 1, false);
        declareFunction(me, "pph_meta_support_tree", "PPH-META-SUPPORT-TREE", 2, 0, false);
        declareFunction(me, "pph_support_tree_from_supports", "PPH-SUPPORT-TREE-FROM-SUPPORTS", 2, 1, false);
        declareFunction(me, "pph_support_tree_p", "PPH-SUPPORT-TREE-P", 1, 0, false);
        declareFunction(me, "pph_support_tree_supported", "PPH-SUPPORT-TREE-SUPPORTED", 1, 0, false);
        declareFunction(me, "pph_support_tree_supporters", "PPH-SUPPORT-TREE-SUPPORTERS", 1, 0, false);
        declareFunction(me, "pph_support_tree_sentence", "PPH-SUPPORT-TREE-SENTENCE", 1, 0, false);
        declareFunction(me, "pph_assertion_supports", "PPH-ASSERTION-SUPPORTS", 1, 2, false);
        declareFunction(me, "pph_prefer_deductionP", "PPH-PREFER-DEDUCTION?", 2, 0, false);
        declareFunction(me, "pph_find_isomorphic_assertion_in_higher_mt", "PPH-FIND-ISOMORPHIC-ASSERTION-IN-HIGHER-MT", 1, 1, false);
        declareFunction(me, "pph_gaf_with_formula_in_higher_mt", "PPH-GAF-WITH-FORMULA-IN-HIGHER-MT", 3, 0, false);
        declareFunction(me, "pph_gaf_with_formula_in_not_lower_mtP", "PPH-GAF-WITH-FORMULA-IN-NOT-LOWER-MT?", 4, 0, false);
        declareFunction(me, "earlier_deduction_p", "EARLIER-DEDUCTION-P", 2, 0, false);
        declareFunction(me, "pph_meta_supports", "PPH-META-SUPPORTS", 1, 0, false);
        declareFunction(me, "pph_default_meta_supports", "PPH-DEFAULT-META-SUPPORTS", 1, 0, false);
        declareFunction(me, "pph_invalid_supportP", "PPH-INVALID-SUPPORT?", 1, 0, false);
        declareFunction(me, "pph_hl_verify", "PPH-HL-VERIFY", 1, 0, false);
        declareFunction(me, "pph_hl_verify_via_removal_ask", "PPH-HL-VERIFY-VIA-REMOVAL-ASK", 1, 0, false);
        declareFunction(me, "pph_isa_supportP", "PPH-ISA-SUPPORT?", 1, 0, false);
        declareFunction(me, "pph_genls_supportP", "PPH-GENLS-SUPPORT?", 1, 0, false);
        declareFunction(me, "pph_genls_supports", "PPH-GENLS-SUPPORTS", 1, 0, false);
        declareFunction(me, "pph_isa_supports", "PPH-ISA-SUPPORTS", 1, 0, false);
        declareFunction(me, "pph_not_isa_supportP", "PPH-NOT-ISA-SUPPORT?", 1, 0, false);
        declareFunction(me, "pph_not_isa_supports", "PPH-NOT-ISA-SUPPORTS", 1, 0, false);
        declareFunction(me, "pph_isa_genls_type_violation_supportP", "PPH-ISA-GENLS-TYPE-VIOLATION-SUPPORT?", 1, 0, false);
        declareFunction(me, "pph_supports_for_disjoint_support", "PPH-SUPPORTS-FOR-DISJOINT-SUPPORT", 1, 0, false);
        declareFunction(me, "find_highest_thcl_genls_between", "FIND-HIGHEST-THCL-GENLS-BETWEEN", 3, 1, false);
        declareFunction(me, "find_thcl_genls_between", "FIND-THCL-GENLS-BETWEEN", 5, 0, false);
        declareFunction(me, "pph_weight_p", "PPH-WEIGHT-P", 1, 0, false);
        declareFunction(me, "pph_explain_inference_answer_with_proof", "PPH-EXPLAIN-INFERENCE-ANSWER-WITH-PROOF", 2, 3, false);
        declareFunction(me, "pph_explain_all_relevant_inference_answers", "PPH-EXPLAIN-ALL-RELEVANT-INFERENCE-ANSWERS", 1, 4, false);
        declareFunction(me, "pph_explain_all_inference_answers_for_best_proofs", "PPH-EXPLAIN-ALL-INFERENCE-ANSWERS-FOR-BEST-PROOFS", 1, 6, false);
        declareFunction(me, "pph_inference_answer_explanation_okP", "PPH-INFERENCE-ANSWER-EXPLANATION-OK?", 3, 0, false);
        declareFunction(me, "pph_explain_inference_answer_with_proof_int", "PPH-EXPLAIN-INFERENCE-ANSWER-WITH-PROOF-INT", 5, 0, false);
        declareFunction(me, "pph_paragraph_demerits_to_weight", "PPH-PARAGRAPH-DEMERITS-TO-WEIGHT", 1, 0, false);
        declareFunction(me, "pph_inference_answer_explanation_contents", "PPH-INFERENCE-ANSWER-EXPLANATION-CONTENTS", 2, 0, false);
        declareFunction(me, "best_support_sentence_nautP", "BEST-SUPPORT-SENTENCE-NAUT?", 1, 0, false);
        declareFunction(me, "pph_inference_answer_explanation_contents_for_appropriate_response_content", "PPH-INFERENCE-ANSWER-EXPLANATION-CONTENTS-FOR-APPROPRIATE-RESPONSE-CONTENT", 4, 0, false);
        declareFunction(me, "pph_supports_for_appropriate_response_content_sentence", "PPH-SUPPORTS-FOR-APPROPRIATE-RESPONSE-CONTENT-SENTENCE", 3, 0, false);
        declareFunction(me, "pph_inference_answer_explanation_contents_default", "PPH-INFERENCE-ANSWER-EXPLANATION-CONTENTS-DEFAULT", 3, 0, false);
        declareFunction(me, "pph_inference_answer_explanation_contents_from_supports_and_bindings", "PPH-INFERENCE-ANSWER-EXPLANATION-CONTENTS-FROM-SUPPORTS-AND-BINDINGS", 3, 0, false);
        declareFunction(me, "pph_maybe_optimize_answer_explanation_supports", "PPH-MAYBE-OPTIMIZE-ANSWER-EXPLANATION-SUPPORTS", 3, 0, false);
        declareFunction(me, "pph_answer_explanation_supports_need_optimizingP", "PPH-ANSWER-EXPLANATION-SUPPORTS-NEED-OPTIMIZING?", 1, 0, false);
        declareFunction(me, "pph_optimize_answer_explanation_supports", "PPH-OPTIMIZE-ANSWER-EXPLANATION-SUPPORTS", 3, 0, false);
        declareFunction(me, "pph_support_mentions_bindingP", "PPH-SUPPORT-MENTIONS-BINDING?", 2, 0, false);
        declareFunction(me, "pph_all_bindings_mentionedP", "PPH-ALL-BINDINGS-MENTIONED?", 2, 0, false);
        declareFunction(me, "pph_inference_answer_explanation_contents_from_supports", "PPH-INFERENCE-ANSWER-EXPLANATION-CONTENTS-FROM-SUPPORTS", 3, 0, false);
        declareFunction(me, "pph_good_explanation_contentsP", "PPH-GOOD-EXPLANATION-CONTENTS?", 2, 0, false);
        declareFunction(me, "pph_meta_ize_supports", "PPH-META-IZE-SUPPORTS", 1, 0, false);
        declareFunction(me, "pph_explanation_sentences_from_supports", "PPH-EXPLANATION-SENTENCES-FROM-SUPPORTS", 1, 0, false);
        declareFunction(me, "pph_explanation_sentence_from_support", "PPH-EXPLANATION-SENTENCE-FROM-SUPPORT", 1, 0, false);
        declareFunction(me, "pph_explanation_source_for_support", "PPH-EXPLANATION-SOURCE-FOR-SUPPORT", 1, 0, false);
        declareFunction(me, "pph_report_inference_answer", "PPH-REPORT-INFERENCE-ANSWER", 1, 3, false);
        declareFunction(me, "pph_report_all_relevant_inference_answers", "PPH-REPORT-ALL-RELEVANT-INFERENCE-ANSWERS", 1, 6, false);
        declareFunction(me, "pph_report_inference_answer_int", "PPH-REPORT-INFERENCE-ANSWER-INT", 4, 0, false);
        declareFunction(me, "pph_inference_answer_report_answer", "PPH-INFERENCE-ANSWER-REPORT-ANSWER", 1, 0, false);
        declareFunction(me, "pph_weight_from_problem_dictionary", "PPH-WEIGHT-FROM-PROBLEM-DICTIONARY", 1, 0, false);
        declareFunction(me, "pph_inference_answer_report_okP", "PPH-INFERENCE-ANSWER-REPORT-OK?", 3, 0, false);
        return NIL;
    }

    public static SubLObject init_pph_proof_file() {
        defparameter("*PPH-SHOW-GORY-PROOF-DETAILS*", NIL);
        deflexical("*PPH-META-SUPPORT-MAX*", TEN_INTEGER);
        defparameter("*PPH-META-SUPPORT-LEVEL*", ZERO_INTEGER);
        defparameter("*PPH-HL-MODULES-TO-SKIP-META-SUPPORTS-FOR*", NIL);
        defparameter("*VAR-BINDING-CANDIDATES*", misc_utilities.uninitialized());
        deflexical("*PPH-SUPPORT-MODULES-FOR-WHICH-TO-SHOW-ALL-META-SUPPORTS*", NIL);
        defparameter("*PPH-IRRELEVANT-SUPPORT-MODULES*", $list190);
        defparameter("*PPH-USE-PROOF-TEMPLATES?*", T);
        deflexical("*PROOF-VIEW-MAX-NOWRAP-LINE*", $int$200);
        defparameter("*PPH-META-SUPPORTS-MAX-DEPTH*", TWO_INTEGER);
        defparameter("*PPH-META-SUPPORTS-DEPTH*", ZERO_INTEGER);
        defparameter("*PPH-PREFER-DEDUCED-META-SUPPORTS?*", T);
        return NIL;
    }

    public static SubLObject setup_pph_proof_file() {
        register_external_symbol(GENERATE_INFERENCE_ANSWER_SENTENCE_FOR_JAVA);
        memoization_state.note_memoized_function(PPH_PROOF_DEPTH_MEMOIZED);
        memoization_state.note_memoized_function(PPH_TRIVIALITY_CHECK_MT_FOR_ADDRESSEE);
        memoization_state.note_memoized_function(PPH_IRRELEVANCE_CHECK_MT_FOR_ADDRESSEE);
        memoization_state.note_memoized_function($sym182$PPH_ALWAYS_SHOW_META_SUPPORT_FOR_MODULE_);
        memoization_state.note_memoized_function($sym16$PPH_IRRELEVANT_SUPPORT_);
        memoization_state.note_memoized_function(PPH_SUPPORT_EL_SENTENCE);
        memoization_state.note_memoized_function(PPH_CONSTANT_FOR_NART);
        memoization_state.note_memoized_function($sym208$SENTENCE_HAS_TRIVIAL_ISOMORPHIC_ASSERTION_);
        memoization_state.note_memoized_function($sym230$PPH_REQUIRED_SENTENCE_);
        memoization_state.note_memoized_function($sym243$PPH_TRIVIAL_TERM_);
        memoization_state.note_memoized_function(PROOF_VIEW_TAB_ID_FOR_ENTRY);
        register_kb_function(CYC_PROOF_VIEW_SECTION_HTML);
        memoization_state.note_memoized_function(PPH_PROOF_CONCLUSION);
        return NIL;
    }

    @Override
    public void declareFunctions() {
        declare_pph_proof_file();
    }

    @Override
    public void initializeVariables() {
        init_pph_proof_file();
    }

    @Override
    public void runTopLevelForms() {
        setup_pph_proof_file();
    }

    
}

/**
 * Total time: 6081 ms synthetic
 */
