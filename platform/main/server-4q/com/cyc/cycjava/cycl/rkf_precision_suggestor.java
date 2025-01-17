package com.cyc.cycjava.cycl;


import static com.cyc.cycjava.cycl.constant_handles.reader_make_constant_shell;
import static com.cyc.cycjava.cycl.control_vars.$cache_inference_results$;
import static com.cyc.cycjava.cycl.control_vars.$compute_inference_results$;
import static com.cyc.cycjava.cycl.control_vars.$rkf_mt$;
import static com.cyc.cycjava.cycl.control_vars.$unique_inference_result_bindings$;
import static com.cyc.cycjava.cycl.control_vars.$within_assert$;
import static com.cyc.cycjava.cycl.el_utilities.formula_arity;
import static com.cyc.cycjava.cycl.el_utilities.formula_arityE;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.append;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.cons;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.list;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.listS;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality.eq;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions.funcall;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.subtract;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.delete;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.nreverse;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.remove;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.fboundp;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.symbol_function;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads.$is_thread_performing_cleanupP$;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.arg2;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.getValuesAsVector;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.multiple_value_list;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.resetMultipleValues;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.restoreValuesFromVector;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeBoolean;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeKeyword;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeString;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeSymbol;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.cdestructuring_bind_error;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.destructuring_bind_must_consp;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.member;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.putf;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.second;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.subst;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.third;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader.bq_cons;
import static com.cyc.tool.subl.util.SubLFiles.declareFunction;
import static com.cyc.tool.subl.util.SubLFiles.deflexical;
import static com.cyc.tool.subl.util.SubLFiles.defparameter;

import com.cyc.cycjava.cycl.inference.ask_utilities;
import com.cyc.cycjava.cycl.inference.harness.abnormal;
import com.cyc.cycjava.cycl.inference.harness.inference_kernel;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sort;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;


public final class rkf_precision_suggestor extends SubLTranslatedFile {
    public static final SubLFile me = new rkf_precision_suggestor();

    public static final String myName = "com.cyc.cycjava.cycl.rkf_precision_suggestor";

    public static final String myFingerPrint = "54bf2509115dcde6d5c571e1525b0687436d01f6b9d8e77a858097f653b8d3cb";

    // defparameter
    private static final SubLSymbol $rkf_raw_specialization_type_col$ = makeSymbol("*RKF-RAW-SPECIALIZATION-TYPE-COL*");



    // defparameter
    private static final SubLSymbol $rkf_transitive_strengthener_max$ = makeSymbol("*RKF-TRANSITIVE-STRENGTHENER-MAX*");

    private static final SubLObject $$disjointWith = reader_make_constant_shell(makeString("disjointWith"));

    public static final SubLList $list1 = list(reader_make_constant_shell(makeString("genlPreds")));

    private static final SubLObject $$transitiveViaArgInverse = reader_make_constant_shell(makeString("transitiveViaArgInverse"));

    private static final SubLObject $$transitiveViaArg = reader_make_constant_shell(makeString("transitiveViaArg"));

    private static final SubLObject $$NLTemplateGenerationPredicate = reader_make_constant_shell(makeString("NLTemplateGenerationPredicate"));

    private static final SubLObject $$GenTemplateRecipe = reader_make_constant_shell(makeString("GenTemplateRecipe"));

    public static final SubLSymbol $sym6$SPEC_ = makeSymbol("SPEC?");

    public static final SubLList $list7 = list(reader_make_constant_shell(makeString("deeperGenTemplateRecipe")));

    private static final SubLObject $$deeperGenTemplateRecipe = reader_make_constant_shell(makeString("deeperGenTemplateRecipe"));

    public static final SubLList $list9 = list(reader_make_constant_shell(makeString("genls")), reader_make_constant_shell(makeString("genlPreds")));

    private static final SubLObject $$and = reader_make_constant_shell(makeString("and"));

    public static final SubLSymbol $sym11$_PRED = makeSymbol("?PRED");

    public static final SubLSymbol $sym12$_ARG = makeSymbol("?ARG");

    private static final SubLObject $$elementOf = reader_make_constant_shell(makeString("elementOf"));

    private static final SubLObject $$TheSet = reader_make_constant_shell(makeString("TheSet"));

    public static final SubLList $list15 = list(makeSymbol("?ARG"), makeSymbol("?PRED"));

    public static final SubLSymbol $sym16$_ = makeSymbol("<");



    private static final SubLObject $$genls = reader_make_constant_shell(makeString("genls"));



    private static final SubLObject $$genlPreds = reader_make_constant_shell(makeString("genlPreds"));

    public static final SubLSymbol $sym21$SPEC_PREDICATE_ = makeSymbol("SPEC-PREDICATE?");

    public static final SubLSymbol $sym22$GENL_ = makeSymbol("GENL?");

    public static final SubLSymbol $sym23$RKF_ISA_OF_TYPE_COLLECTION_ = makeSymbol("RKF-ISA-OF-TYPE-COLLECTION?");

    public static final SubLSymbol $sym24$_ = makeSymbol(">");

    public static final SubLSymbol $sym25$GENL_PREDICATE_ = makeSymbol("GENL-PREDICATE?");

    public static final SubLSymbol ALL_SPECS = makeSymbol("ALL-SPECS");



    public static final SubLSymbol ALL_SPEC_PREDS = makeSymbol("ALL-SPEC-PREDS");

    public static final SubLSymbol ALL_GENL_PREDS = makeSymbol("ALL-GENL-PREDS");

    private static final SubLList $list30 = cons(makeSymbol("NOW"), makeSymbol("LATER"));

    private static final SubLSymbol RKF_REMOVE_SUBSUMED_HELPER = makeSymbol("RKF-REMOVE-SUBSUMED-HELPER");

    private static final SubLSymbol RKF_IRRELEVANT_PRECISION_SUGGESTION_FORTS_FROM_FORT = makeSymbol("RKF-IRRELEVANT-PRECISION-SUGGESTION-FORTS-FROM-FORT");

    private static final SubLSymbol $sym33$_IRREL = makeSymbol("?IRREL");

    private static final SubLObject $const34$keIrrelevantPrecisionSuggestionFr = reader_make_constant_shell(makeString("keIrrelevantPrecisionSuggestionFrom"));

    private static final SubLSymbol $rkf_irrelevant_precision_suggestion_forts_from_fort_caching_state$ = makeSymbol("*RKF-IRRELEVANT-PRECISION-SUGGESTION-FORTS-FROM-FORT-CACHING-STATE*");

    private static final SubLList $list36 = list(makeSymbol("?GEN"));

    private static final SubLSymbol $sym37$_GEN = makeSymbol("?GEN");

    private static final SubLObject $$keGeneralizationSuggestion = reader_make_constant_shell(makeString("keGeneralizationSuggestion"));

    private static final SubLSymbol $sym39$GENLS_ = makeSymbol("GENLS?");

    private static final SubLList $list40 = list(makeSymbol("?SPEC"));

    private static final SubLSymbol $sym41$_SPEC = makeSymbol("?SPEC");

    private static final SubLObject $$kePrecisionSuggestion = reader_make_constant_shell(makeString("kePrecisionSuggestion"));

    private static final SubLList $list43 = list(makeSymbol("TRANS-PRED"), makeSymbol("ARG1"), makeSymbol("ARG2"));

    private static final SubLList $list44 = cons(makeSymbol("PRED"), makeSymbol("GAF-SET"));





    private static final SubLObject $$RuleMacroPredicate = reader_make_constant_shell(makeString("RuleMacroPredicate"));

    private static final SubLObject $$Collection = reader_make_constant_shell(makeString("Collection"));

    private static final SubLObject $$typeGenls = reader_make_constant_shell(makeString("typeGenls"));

    private static final SubLList $list50 = list(reader_make_constant_shell(makeString("unknownSentence")), list(reader_make_constant_shell(makeString("keIrrelevantTypeGenls")), makeSymbol("?SPEC")));

    private static final SubLObject $$unknownSentence = reader_make_constant_shell(makeString("unknownSentence"));

    private static final SubLObject $$relationAllInstance = reader_make_constant_shell(makeString("relationAllInstance"));

    private static final SubLObject $$thereExists = reader_make_constant_shell(makeString("thereExists"));

    private static final SubLSymbol $sym54$_COLTYPE2 = makeSymbol("?COLTYPE2");

    private static final SubLList $list55 = list(list(reader_make_constant_shell(makeString("genls")), makeSymbol("?SPEC"), makeSymbol("?COLTYPE2")), list(reader_make_constant_shell(makeString("different")), makeSymbol("?SPEC"), makeSymbol("?COLTYPE2")));















    private static final SubLList $list63 = list(makeKeyword("NOT"), makeKeyword("REMOVAL-TVA-UNIFY"));



    public static SubLObject rkf_raw_precisify_arg(final SubLObject asent, final SubLObject argnum, final SubLObject domain_mt, final SubLObject generalizeP, SubLObject v_term, SubLObject precisification_predicates, SubLObject type_col) {
        if (v_term == UNPROVIDED) {
            v_term = NIL;
        }
        if (precisification_predicates == UNPROVIDED) {
            precisification_predicates = NIL;
        }
        if (type_col == UNPROVIDED) {
            type_col = NIL;
        }
        if (NIL == v_term) {
            v_term = cycl_utilities.sentence_arg(asent, argnum, UNPROVIDED);
        }
        if (NIL == precisification_predicates) {
            precisification_predicates = rkf_sentence_arg_precisification_options(asent, domain_mt, argnum, generalizeP);
        }
        SubLObject result = NIL;
        if (NIL != precisification_predicates) {
            final SubLObject pred = cycl_utilities.atomic_sentence_predicate(asent);
            final SubLObject disjoint_statementP = eq($$disjointWith, cycl_utilities.atomic_sentence_predicate(asent));
            final SubLObject other_term = (NIL != disjoint_statementP) ? cycl_utilities.atomic_sentence_arg(asent, subtract(THREE_INTEGER, argnum), UNPROVIDED) : NIL;
            final SubLObject arg_constraint_argnum = (NIL != rkf_concept_clarifier.rkf_quantified_binary_predicate_naut_p(pred)) ? number_utilities.f_1_(argnum) : argnum;
            final SubLObject isa_constraints = rkf_concept_clarifier.rkf_argn_isa(pred, arg_constraint_argnum, domain_mt);
            final SubLObject genl_constraints = rkf_concept_clarifier.rkf_argn_genl(pred, arg_constraint_argnum, domain_mt);
            SubLObject cdolist_list_var = precisification_predicates;
            SubLObject precisification_pred = NIL;
            precisification_pred = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                final SubLObject candidates = (NIL != generalizeP) ? rkf_raw_generalization_candidates(v_term, precisification_pred, domain_mt) : nreverse(rkf_raw_specialization_candidates(v_term, precisification_pred, domain_mt, type_col));
                SubLObject stopP = NIL;
                if (NIL == stopP) {
                    SubLObject csome_list_var = candidates;
                    SubLObject candidate = NIL;
                    candidate = csome_list_var.first();
                    while ((NIL == stopP) && (NIL != csome_list_var)) {
                        SubLObject failP = NIL;
                        if ((NIL != disjoint_statementP) && (NIL != genls.genlP(other_term, candidate, domain_mt, UNPROVIDED))) {
                            failP = T;
                            stopP = T;
                        }
                        if (NIL == stopP) {
                            SubLObject csome_list_var_$1 = genl_constraints;
                            SubLObject genl_constraint = NIL;
                            genl_constraint = csome_list_var_$1.first();
                            while ((NIL == stopP) && (NIL != csome_list_var_$1)) {
                                if (NIL == genls.genlP(candidate, genl_constraint, domain_mt, UNPROVIDED)) {
                                    failP = T;
                                    stopP = T;
                                }
                                csome_list_var_$1 = csome_list_var_$1.rest();
                                genl_constraint = csome_list_var_$1.first();
                            } 
                        }
                        if (NIL == failP) {
                            SubLObject csome_list_var_$2 = isa_constraints;
                            SubLObject isa_constraint = NIL;
                            isa_constraint = csome_list_var_$2.first();
                            while ((NIL == failP) && (NIL != csome_list_var_$2)) {
                                if (NIL == isa.isaP(candidate, isa_constraint, domain_mt, UNPROVIDED)) {
                                    failP = T;
                                }
                                csome_list_var_$2 = csome_list_var_$2.rest();
                                isa_constraint = csome_list_var_$2.first();
                            } 
                        }
                        if (NIL == failP) {
                            final SubLObject item_var = candidate;
                            if (NIL == member(item_var, result, symbol_function(EQL), symbol_function(IDENTITY))) {
                                result = cons(item_var, result);
                            }
                        }
                        csome_list_var = csome_list_var.rest();
                        candidate = csome_list_var.first();
                    } 
                }
                cdolist_list_var = cdolist_list_var.rest();
                precisification_pred = cdolist_list_var.first();
            } 
        }
        return result;
    }

    public static SubLObject rkf_sentence_arg_precisification_options(final SubLObject sentence, final SubLObject domain_mt, final SubLObject argnum, final SubLObject generalizeP) {
        return NIL != generalizeP ? rkf_sentence_arg_generalization_options(sentence, domain_mt, argnum) : rkf_sentence_arg_specialization_options(sentence, domain_mt, argnum);
    }

    public static SubLObject rkf_sentence_arg_generalization_options(final SubLObject sentence, final SubLObject domain_mt, final SubLObject argnum) {
        if (argnum.isFixnum() && argnum.isZero()) {
            return $list1;
        }
        return rkf_sentence_arg_tva_options(sentence, domain_mt, $$transitiveViaArgInverse, argnum);
    }

    public static SubLObject rkf_sentence_arg_specialization_options(final SubLObject sentence, final SubLObject domain_mt, final SubLObject argnum) {
        if (argnum.isFixnum() && argnum.isZero()) {
            return $list1;
        }
        if (NIL != gen_template_recipe_argP(cycl_utilities.formula_arg0(sentence), argnum, domain_mt)) {
            return gen_template_recipe_specialization_options(sentence, argnum, domain_mt);
        }
        return rkf_sentence_arg_tva_options(sentence, domain_mt, $$transitiveViaArg, argnum);
    }

    public static SubLObject gen_template_recipe_argP(final SubLObject operator, final SubLObject argnum, final SubLObject domain_mt) {
        return makeBoolean((NIL != isa.isaP(operator, $$NLTemplateGenerationPredicate, domain_mt, UNPROVIDED)) && ((NIL == argnum) || (NIL != member($$GenTemplateRecipe, kb_accessors.argn_quoted_isa(operator, argnum, domain_mt), $sym6$SPEC_, UNPROVIDED))));
    }

    public static SubLObject gen_template_recipe_specialization_options(final SubLObject sentence, final SubLObject argnum, final SubLObject domain_mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != argnum) {
            return $list7;
        }
        SubLObject ans = NIL;
        SubLObject end_var;
        SubLObject argnum_$3;
        SubLObject mt_var;
        SubLObject _prev_bind_0;
        SubLObject _prev_bind_2;
        SubLObject _prev_bind_3;
        for (end_var = number_utilities.f_1X(formula_arity(sentence, UNPROVIDED)), argnum_$3 = NIL, argnum_$3 = ONE_INTEGER; !argnum_$3.numGE(end_var); argnum_$3 = number_utilities.f_1X(argnum_$3)) {
            mt_var = mt_relevance_macros.with_inference_mt_relevance_validate(domain_mt);
            _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
            _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
            _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
            try {
                mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
                mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
                mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
                if (NIL != member($$GenTemplateRecipe, kb_accessors.argn_quoted_isa(cycl_utilities.formula_arg0(sentence), argnum_$3, UNPROVIDED), $sym6$SPEC_, UNPROVIDED)) {
                    ans = cons(list(argnum_$3, $$deeperGenTemplateRecipe), ans);
                }
            } finally {
                mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_3, thread);
                mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_2, thread);
                mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
            }
        }
        return ans;
    }

    public static SubLObject rkf_sentence_arg_tva_options(final SubLObject sentence, final SubLObject domain_mt, final SubLObject tva_predicate, final SubLObject argnum) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject predicate = cycl_utilities.atomic_sentence_predicate(sentence);
        if (NIL != fort_types_interface.predicateP(predicate)) {
            SubLObject v_answer = NIL;
            final SubLObject supported_transitive_preds = $list9;
            final SubLObject query = list($$and, list(tva_predicate, predicate, $sym11$_PRED, NIL != argnum ? argnum : $sym12$_ARG), list($$elementOf, $sym11$_PRED, bq_cons($$TheSet, append(supported_transitive_preds, NIL))));
            final SubLObject _prev_bind_0 = $cache_inference_results$.currentBinding(thread);
            final SubLObject _prev_bind_2 = $compute_inference_results$.currentBinding(thread);
            final SubLObject _prev_bind_3 = $unique_inference_result_bindings$.currentBinding(thread);
            final SubLObject _prev_bind_4 = abnormal.$abnormality_checking_enabled$.currentBinding(thread);
            final SubLObject _prev_bind_5 = api_control_vars.$generate_readable_fi_results$.currentBinding(thread);
            final SubLObject _prev_bind_6 = $within_assert$.currentBinding(thread);
            final SubLObject _prev_bind_7 = wff_utilities.$check_arg_typesP$.currentBinding(thread);
            final SubLObject _prev_bind_8 = at_vars.$at_check_arg_typesP$.currentBinding(thread);
            final SubLObject _prev_bind_9 = wff_utilities.$check_wff_semanticsP$.currentBinding(thread);
            final SubLObject _prev_bind_10 = wff_utilities.$check_wff_coherenceP$.currentBinding(thread);
            final SubLObject _prev_bind_11 = wff_utilities.$check_var_typesP$.currentBinding(thread);
            final SubLObject _prev_bind_12 = czer_vars.$simplify_literalP$.currentBinding(thread);
            final SubLObject _prev_bind_13 = at_vars.$at_check_relator_constraintsP$.currentBinding(thread);
            final SubLObject _prev_bind_14 = at_vars.$at_check_arg_formatP$.currentBinding(thread);
            final SubLObject _prev_bind_15 = wff_vars.$validate_constantsP$.currentBinding(thread);
            final SubLObject _prev_bind_16 = system_parameters.$suspend_sbhl_type_checkingP$.currentBinding(thread);
            try {
                $cache_inference_results$.bind(NIL, thread);
                $compute_inference_results$.bind(NIL, thread);
                $unique_inference_result_bindings$.bind(T, thread);
                abnormal.$abnormality_checking_enabled$.bind(NIL, thread);
                api_control_vars.$generate_readable_fi_results$.bind(NIL, thread);
                $within_assert$.bind(NIL, thread);
                wff_utilities.$check_arg_typesP$.bind(NIL, thread);
                at_vars.$at_check_arg_typesP$.bind(NIL, thread);
                wff_utilities.$check_wff_semanticsP$.bind(NIL, thread);
                wff_utilities.$check_wff_coherenceP$.bind(NIL, thread);
                wff_utilities.$check_var_typesP$.bind(NIL, thread);
                czer_vars.$simplify_literalP$.bind(NIL, thread);
                at_vars.$at_check_relator_constraintsP$.bind(NIL, thread);
                at_vars.$at_check_arg_formatP$.bind(NIL, thread);
                wff_vars.$validate_constantsP$.bind(NIL, thread);
                system_parameters.$suspend_sbhl_type_checkingP$.bind(T, thread);
                v_answer = ask_utilities.ask_template(NIL != argnum ? $sym11$_PRED : $list15, query, domain_mt, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            } finally {
                system_parameters.$suspend_sbhl_type_checkingP$.rebind(_prev_bind_16, thread);
                wff_vars.$validate_constantsP$.rebind(_prev_bind_15, thread);
                at_vars.$at_check_arg_formatP$.rebind(_prev_bind_14, thread);
                at_vars.$at_check_relator_constraintsP$.rebind(_prev_bind_13, thread);
                czer_vars.$simplify_literalP$.rebind(_prev_bind_12, thread);
                wff_utilities.$check_var_typesP$.rebind(_prev_bind_11, thread);
                wff_utilities.$check_wff_coherenceP$.rebind(_prev_bind_10, thread);
                wff_utilities.$check_wff_semanticsP$.rebind(_prev_bind_9, thread);
                at_vars.$at_check_arg_typesP$.rebind(_prev_bind_8, thread);
                wff_utilities.$check_arg_typesP$.rebind(_prev_bind_7, thread);
                $within_assert$.rebind(_prev_bind_6, thread);
                api_control_vars.$generate_readable_fi_results$.rebind(_prev_bind_5, thread);
                abnormal.$abnormality_checking_enabled$.rebind(_prev_bind_4, thread);
                $unique_inference_result_bindings$.rebind(_prev_bind_3, thread);
                $compute_inference_results$.rebind(_prev_bind_2, thread);
                $cache_inference_results$.rebind(_prev_bind_0, thread);
            }
            v_answer = Sort.sort(v_answer, symbol_function($sym16$_), symbol_function(FIRST));
            return v_answer;
        }
        return NIL;
    }

    public static SubLObject rkf_raw_generalization_candidates(final SubLObject v_term, final SubLObject predicate, final SubLObject domain_mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject v_answer = NIL;
        final SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate(domain_mt);
        final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
        try {
            mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
            mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
            mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
            if (predicate.eql($$genls)) {
                v_answer = delete(v_term, genls.all_genls(v_term, domain_mt, UNPROVIDED), $sym6$SPEC_, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                v_answer = Sort.sort(v_answer, symbol_function($sym16$_), symbol_function(GENERALITY_ESTIMATE));
            } else
                if (predicate.eql($$genlPreds)) {
                    v_answer = (NIL != forts.fort_p(v_term)) ? delete(v_term, genl_predicates.all_genl_preds(v_term, domain_mt, UNPROVIDED), $sym21$SPEC_PREDICATE_, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED) : NIL;
                } else {
                    v_answer = NIL;
                }

        } finally {
            mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_3, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
        }
        return rkf_remove_subsumed(v_answer, predicate, domain_mt, NIL);
    }

    public static SubLObject rkf_isa_of_type_collectionP(final SubLObject v_term) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject isas = isa.asserted_isa(v_term, UNPROVIDED);
        if (NIL != subl_promotions.memberP($rkf_raw_specialization_type_col$.getDynamicValue(thread), isas, UNPROVIDED, UNPROVIDED)) {
            return T;
        }
        return NIL;
    }

    public static SubLObject rkf_raw_specialization_candidates(final SubLObject v_term, final SubLObject predicate, final SubLObject domain_mt, SubLObject type_col) {
        if (type_col == UNPROVIDED) {
            type_col = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject v_answer = NIL;
        final SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate(domain_mt);
        final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
        try {
            mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
            mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
            mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
            if (predicate.eql($$genls)) {
                v_answer = delete(v_term, genls.specs(v_term, domain_mt, UNPROVIDED), $sym22$GENL_, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                if (NIL != forts.fort_p(type_col)) {
                    final SubLObject _prev_bind_0_$4 = $rkf_raw_specialization_type_col$.currentBinding(thread);
                    try {
                        $rkf_raw_specialization_type_col$.bind(type_col, thread);
                        v_answer = list_utilities.delete_if_not($sym23$RKF_ISA_OF_TYPE_COLLECTION_, v_answer, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                    } finally {
                        $rkf_raw_specialization_type_col$.rebind(_prev_bind_0_$4, thread);
                    }
                }
                v_answer = Sort.sort(v_answer, symbol_function($sym24$_), symbol_function(GENERALITY_ESTIMATE));
            } else
                if (predicate.eql($$genlPreds)) {
                    v_answer = (NIL != forts.fort_p(v_term)) ? delete(v_term, genl_predicates.spec_predicates(v_term, UNPROVIDED, UNPROVIDED), $sym25$GENL_PREDICATE_, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED) : NIL;
                } else
                    if (predicate.eql($$deeperGenTemplateRecipe)) {
                        v_answer = pph_templates.pph_phrase_naut_deepening_candidates(v_term, domain_mt, UNPROVIDED);
                    } else {
                        v_answer = NIL;
                    }


        } finally {
            mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_3, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
        }
        return rkf_remove_subsumed(v_answer, predicate, domain_mt, T);
    }

    public static SubLObject rkf_remove_subsumed(final SubLObject candidates, final SubLObject pred, final SubLObject domain_mt, final SubLObject inverseP) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject ans = NIL;
        SubLObject helper_fn = NIL;
        if (pred.eql($$genls)) {
            helper_fn = (NIL != inverseP) ? ALL_SPECS : ALL_GENLS;
        } else
            if (pred.eql($$genlPreds)) {
                helper_fn = (NIL != inverseP) ? ALL_SPEC_PREDS : ALL_GENL_PREDS;
            }

        if (NIL != fboundp(helper_fn)) {
            final SubLObject local_state;
            final SubLObject state = local_state = memoization_state.new_memoization_state(UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            final SubLObject _prev_bind_0 = memoization_state.$memoization_state$.currentBinding(thread);
            try {
                memoization_state.$memoization_state$.bind(local_state, thread);
                final SubLObject original_memoization_process = memoization_state.memoization_state_original_process(local_state);
                try {
                    SubLObject remain;
                    SubLObject current;
                    SubLObject datum;
                    SubLObject now;
                    SubLObject later;
                    SubLObject badP;
                    SubLObject csome_list_var;
                    SubLObject other;
                    for (remain = NIL, remain = candidates; NIL != remain; remain = remain.rest()) {
                        datum = current = remain;
                        now = NIL;
                        later = NIL;
                        destructuring_bind_must_consp(current, datum, $list30);
                        now = current.first();
                        current = later = current.rest();
                        badP = NIL;
                        if (NIL == badP) {
                            csome_list_var = later;
                            other = NIL;
                            other = csome_list_var.first();
                            while ((NIL == badP) && (NIL != csome_list_var)) {
                                if (NIL != subl_promotions.memberP(now, rkf_remove_subsumed_helper(other, helper_fn, domain_mt), UNPROVIDED, UNPROVIDED)) {
                                    badP = T;
                                }
                                csome_list_var = csome_list_var.rest();
                                other = csome_list_var.first();
                            } 
                        }
                        if (NIL == badP) {
                            csome_list_var = ans;
                            other = NIL;
                            other = csome_list_var.first();
                            while ((NIL == badP) && (NIL != csome_list_var)) {
                                if (NIL != subl_promotions.memberP(now, rkf_remove_subsumed_helper(other, helper_fn, domain_mt), UNPROVIDED, UNPROVIDED)) {
                                    badP = T;
                                }
                                csome_list_var = csome_list_var.rest();
                                other = csome_list_var.first();
                            } 
                        }
                        if (NIL == badP) {
                            ans = cons(now, ans);
                        }
                    }
                } finally {
                    final SubLObject _prev_bind_0_$5 = $is_thread_performing_cleanupP$.currentBinding(thread);
                    try {
                        $is_thread_performing_cleanupP$.bind(T, thread);
                        final SubLObject _values = getValuesAsVector();
                        memoization_state.memoization_state_possibly_clear_original_process(local_state, original_memoization_process);
                        restoreValuesFromVector(_values);
                    } finally {
                        $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$5, thread);
                    }
                }
            } finally {
                memoization_state.$memoization_state$.rebind(_prev_bind_0, thread);
            }
            return ans;
        }
        return candidates;
    }

    public static SubLObject rkf_remove_subsumed_helper_internal(final SubLObject v_term, final SubLObject helper_fn, final SubLObject mt) {
        return funcall(helper_fn, v_term, mt);
    }

    public static SubLObject rkf_remove_subsumed_helper(final SubLObject v_term, final SubLObject helper_fn, final SubLObject mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
        SubLObject caching_state = NIL;
        if (NIL == v_memoization_state) {
            return rkf_remove_subsumed_helper_internal(v_term, helper_fn, mt);
        }
        caching_state = memoization_state.memoization_state_lookup(v_memoization_state, RKF_REMOVE_SUBSUMED_HELPER, UNPROVIDED);
        if (NIL == caching_state) {
            caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), RKF_REMOVE_SUBSUMED_HELPER, THREE_INTEGER, NIL, EQL, UNPROVIDED);
            memoization_state.memoization_state_put(v_memoization_state, RKF_REMOVE_SUBSUMED_HELPER, caching_state);
        }
        final SubLObject sxhash = memoization_state.sxhash_calc_3(v_term, helper_fn, mt);
        final SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, UNPROVIDED);
        if (!collisions.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            SubLObject cdolist_list_var = collisions;
            SubLObject collision = NIL;
            collision = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                SubLObject cached_args = collision.first();
                final SubLObject results2 = second(collision);
                if (v_term.eql(cached_args.first())) {
                    cached_args = cached_args.rest();
                    if (helper_fn.eql(cached_args.first())) {
                        cached_args = cached_args.rest();
                        if (((NIL != cached_args) && (NIL == cached_args.rest())) && mt.eql(cached_args.first())) {
                            return memoization_state.caching_results(results2);
                        }
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                collision = cdolist_list_var.first();
            } 
        }
        final SubLObject results3 = arg2(thread.resetMultipleValues(), multiple_value_list(rkf_remove_subsumed_helper_internal(v_term, helper_fn, mt)));
        memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results3, list(v_term, helper_fn, mt));
        return memoization_state.caching_results(results3);
    }

    public static SubLObject clear_rkf_irrelevant_precision_suggestion_forts_from_fort() {
        final SubLObject cs = $rkf_irrelevant_precision_suggestion_forts_from_fort_caching_state$.getGlobalValue();
        if (NIL != cs) {
            memoization_state.caching_state_clear(cs);
        }
        return NIL;
    }

    public static SubLObject remove_rkf_irrelevant_precision_suggestion_forts_from_fort(final SubLObject from_fort, final SubLObject domain_mt) {
        return memoization_state.caching_state_remove_function_results_with_args($rkf_irrelevant_precision_suggestion_forts_from_fort_caching_state$.getGlobalValue(), list(from_fort, domain_mt), UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject rkf_irrelevant_precision_suggestion_forts_from_fort_internal(final SubLObject from_fort, final SubLObject domain_mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject ans = NIL;
        final SubLObject _prev_bind_0 = api_control_vars.$generate_readable_fi_results$.currentBinding(thread);
        try {
            api_control_vars.$generate_readable_fi_results$.bind(NIL, thread);
            ans = ask_utilities.ask_variable($sym33$_IRREL, list($const34$keIrrelevantPrecisionSuggestionFr, $sym33$_IRREL, from_fort), domain_mt, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        } finally {
            api_control_vars.$generate_readable_fi_results$.rebind(_prev_bind_0, thread);
        }
        return ans;
    }

    public static SubLObject rkf_irrelevant_precision_suggestion_forts_from_fort(final SubLObject from_fort, final SubLObject domain_mt) {
        SubLObject caching_state = $rkf_irrelevant_precision_suggestion_forts_from_fort_caching_state$.getGlobalValue();
        if (NIL == caching_state) {
            caching_state = memoization_state.create_global_caching_state_for_name(RKF_IRRELEVANT_PRECISION_SUGGESTION_FORTS_FROM_FORT, $rkf_irrelevant_precision_suggestion_forts_from_fort_caching_state$, NIL, EQL, TWO_INTEGER, TEN_INTEGER);
        }
        final SubLObject sxhash = memoization_state.sxhash_calc_2(from_fort, domain_mt);
        final SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, UNPROVIDED);
        if (!collisions.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            SubLObject cdolist_list_var = collisions;
            SubLObject collision = NIL;
            collision = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                SubLObject cached_args = collision.first();
                final SubLObject results2 = second(collision);
                if (from_fort.eql(cached_args.first())) {
                    cached_args = cached_args.rest();
                    if (((NIL != cached_args) && (NIL == cached_args.rest())) && domain_mt.eql(cached_args.first())) {
                        return memoization_state.caching_results(results2);
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                collision = cdolist_list_var.first();
            } 
        }
        final SubLObject results3 = arg2(resetMultipleValues(), multiple_value_list(rkf_irrelevant_precision_suggestion_forts_from_fort_internal(from_fort, domain_mt)));
        memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results3, list(from_fort, domain_mt));
        return memoization_state.caching_results(results3);
    }

    public static SubLObject rkf_raw_sentence_predicate_generalization_candidates(final SubLObject sentence, final SubLObject domain_mt) {
        final SubLObject predicate = cycl_utilities.atomic_sentence_predicate(sentence);
        if (NIL != fort_types_interface.predicateP(predicate)) {
            final SubLObject candidates = rkf_raw_generalization_candidates(predicate, $$genlPreds, domain_mt);
            return candidates;
        }
        return NIL;
    }

    public static SubLObject rkf_sentence_predicate_generalization_candidates(final SubLObject sentence, final SubLObject domain_mt) {
        final SubLObject candidates = rkf_raw_sentence_predicate_generalization_candidates(sentence, domain_mt);
        return rkf_relevance_utilities.rkf_filter_irrelevant_terms(candidates, domain_mt);
    }

    public static SubLObject rkf_raw_sentence_predicate_specialization_candidates(final SubLObject sentence, final SubLObject domain_mt) {
        final SubLObject predicate = cycl_utilities.atomic_sentence_predicate(sentence);
        if (NIL != fort_types_interface.predicateP(predicate)) {
            final SubLObject candidates = rkf_raw_specialization_candidates(predicate, $$genlPreds, domain_mt, UNPROVIDED);
            return candidates;
        }
        return NIL;
    }

    public static SubLObject rkf_sentence_predicate_specialization_candidates(final SubLObject sentence, final SubLObject domain_mt) {
        final SubLObject candidates = rkf_raw_sentence_predicate_specialization_candidates(sentence, domain_mt);
        return rkf_relevance_utilities.rkf_filter_irrelevant_terms(candidates, domain_mt);
    }

    public static SubLObject rkf_generalize(final SubLObject asent, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = $rkf_mt$.getDynamicValue();
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL == formula_arityE(asent, TWO_INTEGER, UNPROVIDED)) {
            return NIL;
        }
        final SubLObject generalization_template = listS(cycl_utilities.atomic_sentence_predicate(asent), cycl_utilities.sentence_arg1(asent, UNPROVIDED), $list36);
        SubLObject generalizations = NIL;
        final SubLObject _prev_bind_0 = $cache_inference_results$.currentBinding(thread);
        final SubLObject _prev_bind_2 = $compute_inference_results$.currentBinding(thread);
        final SubLObject _prev_bind_3 = $unique_inference_result_bindings$.currentBinding(thread);
        final SubLObject _prev_bind_4 = abnormal.$abnormality_checking_enabled$.currentBinding(thread);
        final SubLObject _prev_bind_5 = api_control_vars.$generate_readable_fi_results$.currentBinding(thread);
        final SubLObject _prev_bind_6 = $within_assert$.currentBinding(thread);
        final SubLObject _prev_bind_7 = wff_utilities.$check_arg_typesP$.currentBinding(thread);
        final SubLObject _prev_bind_8 = at_vars.$at_check_arg_typesP$.currentBinding(thread);
        final SubLObject _prev_bind_9 = wff_utilities.$check_wff_semanticsP$.currentBinding(thread);
        final SubLObject _prev_bind_10 = wff_utilities.$check_wff_coherenceP$.currentBinding(thread);
        final SubLObject _prev_bind_11 = wff_utilities.$check_var_typesP$.currentBinding(thread);
        final SubLObject _prev_bind_12 = czer_vars.$simplify_literalP$.currentBinding(thread);
        final SubLObject _prev_bind_13 = at_vars.$at_check_relator_constraintsP$.currentBinding(thread);
        final SubLObject _prev_bind_14 = at_vars.$at_check_arg_formatP$.currentBinding(thread);
        final SubLObject _prev_bind_15 = wff_vars.$validate_constantsP$.currentBinding(thread);
        final SubLObject _prev_bind_16 = system_parameters.$suspend_sbhl_type_checkingP$.currentBinding(thread);
        try {
            $cache_inference_results$.bind(NIL, thread);
            $compute_inference_results$.bind(NIL, thread);
            $unique_inference_result_bindings$.bind(T, thread);
            abnormal.$abnormality_checking_enabled$.bind(NIL, thread);
            api_control_vars.$generate_readable_fi_results$.bind(NIL, thread);
            $within_assert$.bind(NIL, thread);
            wff_utilities.$check_arg_typesP$.bind(NIL, thread);
            at_vars.$at_check_arg_typesP$.bind(NIL, thread);
            wff_utilities.$check_wff_semanticsP$.bind(NIL, thread);
            wff_utilities.$check_wff_coherenceP$.bind(NIL, thread);
            wff_utilities.$check_var_typesP$.bind(NIL, thread);
            czer_vars.$simplify_literalP$.bind(NIL, thread);
            at_vars.$at_check_relator_constraintsP$.bind(NIL, thread);
            at_vars.$at_check_arg_formatP$.bind(NIL, thread);
            wff_vars.$validate_constantsP$.bind(NIL, thread);
            system_parameters.$suspend_sbhl_type_checkingP$.bind(T, thread);
            generalizations = ask_utilities.ask_template($sym37$_GEN, list($$keGeneralizationSuggestion, asent, generalization_template), mt, ONE_INTEGER, NIL, NIL, NIL);
        } finally {
            system_parameters.$suspend_sbhl_type_checkingP$.rebind(_prev_bind_16, thread);
            wff_vars.$validate_constantsP$.rebind(_prev_bind_15, thread);
            at_vars.$at_check_arg_formatP$.rebind(_prev_bind_14, thread);
            at_vars.$at_check_relator_constraintsP$.rebind(_prev_bind_13, thread);
            czer_vars.$simplify_literalP$.rebind(_prev_bind_12, thread);
            wff_utilities.$check_var_typesP$.rebind(_prev_bind_11, thread);
            wff_utilities.$check_wff_coherenceP$.rebind(_prev_bind_10, thread);
            wff_utilities.$check_wff_semanticsP$.rebind(_prev_bind_9, thread);
            at_vars.$at_check_arg_typesP$.rebind(_prev_bind_8, thread);
            wff_utilities.$check_arg_typesP$.rebind(_prev_bind_7, thread);
            $within_assert$.rebind(_prev_bind_6, thread);
            api_control_vars.$generate_readable_fi_results$.rebind(_prev_bind_5, thread);
            abnormal.$abnormality_checking_enabled$.rebind(_prev_bind_4, thread);
            $unique_inference_result_bindings$.rebind(_prev_bind_3, thread);
            $compute_inference_results$.rebind(_prev_bind_2, thread);
            $cache_inference_results$.rebind(_prev_bind_0, thread);
        }
        generalizations = rkf_relevance_utilities.rkf_filter_irrelevant_terms(generalizations, mt);
        generalizations = Sort.sort(generalizations, symbol_function($sym39$GENLS_), UNPROVIDED);
        generalizations = Sort.stable_sort(generalizations, symbol_function($sym16$_), symbol_function(GENERALITY_ESTIMATE));
        SubLObject answers = NIL;
        SubLObject cdolist_list_var = generalizations;
        SubLObject generalization = NIL;
        generalization = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            answers = cons(subst(generalization, $sym37$_GEN, generalization_template, symbol_function(EQUAL), UNPROVIDED), answers);
            cdolist_list_var = cdolist_list_var.rest();
            generalization = cdolist_list_var.first();
        } 
        answers = nreverse(answers);
        return answers;
    }

    public static SubLObject rkf_specialize(final SubLObject asent, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = $rkf_mt$.getDynamicValue();
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL == formula_arityE(asent, TWO_INTEGER, UNPROVIDED)) {
            return NIL;
        }
        final SubLObject specialization_template = listS(cycl_utilities.formula_operator(asent), cycl_utilities.formula_arg1(asent, UNPROVIDED), $list40);
        SubLObject specializations = NIL;
        final SubLObject _prev_bind_0 = $cache_inference_results$.currentBinding(thread);
        final SubLObject _prev_bind_2 = $compute_inference_results$.currentBinding(thread);
        final SubLObject _prev_bind_3 = $unique_inference_result_bindings$.currentBinding(thread);
        final SubLObject _prev_bind_4 = abnormal.$abnormality_checking_enabled$.currentBinding(thread);
        final SubLObject _prev_bind_5 = api_control_vars.$generate_readable_fi_results$.currentBinding(thread);
        final SubLObject _prev_bind_6 = $within_assert$.currentBinding(thread);
        final SubLObject _prev_bind_7 = wff_utilities.$check_arg_typesP$.currentBinding(thread);
        final SubLObject _prev_bind_8 = at_vars.$at_check_arg_typesP$.currentBinding(thread);
        final SubLObject _prev_bind_9 = wff_utilities.$check_wff_semanticsP$.currentBinding(thread);
        final SubLObject _prev_bind_10 = wff_utilities.$check_wff_coherenceP$.currentBinding(thread);
        final SubLObject _prev_bind_11 = wff_utilities.$check_var_typesP$.currentBinding(thread);
        final SubLObject _prev_bind_12 = czer_vars.$simplify_literalP$.currentBinding(thread);
        final SubLObject _prev_bind_13 = at_vars.$at_check_relator_constraintsP$.currentBinding(thread);
        final SubLObject _prev_bind_14 = at_vars.$at_check_arg_formatP$.currentBinding(thread);
        final SubLObject _prev_bind_15 = wff_vars.$validate_constantsP$.currentBinding(thread);
        final SubLObject _prev_bind_16 = system_parameters.$suspend_sbhl_type_checkingP$.currentBinding(thread);
        try {
            $cache_inference_results$.bind(NIL, thread);
            $compute_inference_results$.bind(NIL, thread);
            $unique_inference_result_bindings$.bind(T, thread);
            abnormal.$abnormality_checking_enabled$.bind(NIL, thread);
            api_control_vars.$generate_readable_fi_results$.bind(NIL, thread);
            $within_assert$.bind(NIL, thread);
            wff_utilities.$check_arg_typesP$.bind(NIL, thread);
            at_vars.$at_check_arg_typesP$.bind(NIL, thread);
            wff_utilities.$check_wff_semanticsP$.bind(NIL, thread);
            wff_utilities.$check_wff_coherenceP$.bind(NIL, thread);
            wff_utilities.$check_var_typesP$.bind(NIL, thread);
            czer_vars.$simplify_literalP$.bind(NIL, thread);
            at_vars.$at_check_relator_constraintsP$.bind(NIL, thread);
            at_vars.$at_check_arg_formatP$.bind(NIL, thread);
            wff_vars.$validate_constantsP$.bind(NIL, thread);
            system_parameters.$suspend_sbhl_type_checkingP$.bind(T, thread);
            specializations = ask_utilities.ask_template($sym41$_SPEC, list($$kePrecisionSuggestion, asent, specialization_template), mt, ONE_INTEGER, NIL, NIL, NIL);
        } finally {
            system_parameters.$suspend_sbhl_type_checkingP$.rebind(_prev_bind_16, thread);
            wff_vars.$validate_constantsP$.rebind(_prev_bind_15, thread);
            at_vars.$at_check_arg_formatP$.rebind(_prev_bind_14, thread);
            at_vars.$at_check_relator_constraintsP$.rebind(_prev_bind_13, thread);
            czer_vars.$simplify_literalP$.rebind(_prev_bind_12, thread);
            wff_utilities.$check_var_typesP$.rebind(_prev_bind_11, thread);
            wff_utilities.$check_wff_coherenceP$.rebind(_prev_bind_10, thread);
            wff_utilities.$check_wff_semanticsP$.rebind(_prev_bind_9, thread);
            at_vars.$at_check_arg_typesP$.rebind(_prev_bind_8, thread);
            wff_utilities.$check_arg_typesP$.rebind(_prev_bind_7, thread);
            $within_assert$.rebind(_prev_bind_6, thread);
            api_control_vars.$generate_readable_fi_results$.rebind(_prev_bind_5, thread);
            abnormal.$abnormality_checking_enabled$.rebind(_prev_bind_4, thread);
            $unique_inference_result_bindings$.rebind(_prev_bind_3, thread);
            $compute_inference_results$.rebind(_prev_bind_2, thread);
            $cache_inference_results$.rebind(_prev_bind_0, thread);
        }
        specializations = rkf_relevance_utilities.rkf_filter_irrelevant_terms(specializations, mt);
        specializations = Sort.sort(specializations, symbol_function($sym39$GENLS_), UNPROVIDED);
        specializations = Sort.stable_sort(specializations, symbol_function($sym24$_), symbol_function(GENERALITY_ESTIMATE));
        SubLObject answers = NIL;
        SubLObject cdolist_list_var = specializations;
        SubLObject specialization = NIL;
        specialization = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            answers = cons(subst(specialization, $sym41$_SPEC, specialization_template, symbol_function(EQUAL), UNPROVIDED), answers);
            cdolist_list_var = cdolist_list_var.rest();
            specialization = cdolist_list_var.first();
        } 
        answers = nreverse(answers);
        return answers;
    }

    public static SubLObject rkf_transitivity_strengthening_candidates(final SubLObject trans_pred_formula, SubLObject inverseP, SubLObject mt) {
        if (inverseP == UNPROVIDED) {
            inverseP = NIL;
        }
        if (mt == UNPROVIDED) {
            mt = $rkf_mt$.getDynamicValue();
        }
        SubLObject pred_sets = NIL;
        SubLObject binding = NIL;
        SubLObject trans_pred = NIL;
        SubLObject arg1 = NIL;
        SubLObject arg2 = NIL;
        destructuring_bind_must_consp(trans_pred_formula, trans_pred_formula, $list43);
        trans_pred = trans_pred_formula.first();
        SubLObject current = trans_pred_formula.rest();
        destructuring_bind_must_consp(current, trans_pred_formula, $list43);
        arg1 = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, trans_pred_formula, $list43);
        arg2 = current.first();
        current = current.rest();
        if (NIL == current) {
            if (NIL != inverseP) {
                pred_sets = rkf_transitivity_strengthening_candidates_int(trans_pred, $$transitiveViaArgInverse, arg1, mt);
                binding = bq_cons(arg1, arg2);
            } else {
                pred_sets = rkf_transitivity_strengthening_candidates_int(trans_pred, $$transitiveViaArg, arg2, mt);
                binding = bq_cons(arg2, arg1);
            }
            SubLObject found_itP = NIL;
            if (NIL == found_itP) {
                SubLObject csome_list_var = pred_sets;
                SubLObject pred_set = NIL;
                pred_set = csome_list_var.first();
                while ((NIL == found_itP) && (NIL != csome_list_var)) {
                    SubLObject current_$7;
                    final SubLObject datum_$6 = current_$7 = pred_set;
                    SubLObject pred = NIL;
                    SubLObject gaf_set = NIL;
                    destructuring_bind_must_consp(current_$7, datum_$6, $list44);
                    pred = current_$7.first();
                    current_$7 = gaf_set = current_$7.rest();
                    if (pred.eql(trans_pred)) {
                        found_itP = T;
                        final SubLObject new_set = set.new_set(symbol_function(EQ), UNPROVIDED);
                        final SubLObject set_contents_var = set.do_set_internal(gaf_set);
                        SubLObject basis_object;
                        SubLObject state;
                        SubLObject gaf;
                        for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
                            gaf = set_contents.do_set_contents_next(basis_object, state);
                            if ((NIL != set_contents.do_set_contents_element_validP(state, gaf)) && (!trans_pred_formula.equal(assertions_high.gaf_formula(gaf)))) {
                                set.set_add(gaf, new_set);
                            }
                        }
                        pred_sets = remove(pred_set, pred_sets, symbol_function(EQUAL), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                        if (NIL == set.empty_set_p(new_set)) {
                            pred_sets = cons(cons(pred, new_set), pred_sets);
                        }
                    }
                    csome_list_var = csome_list_var.rest();
                    pred_set = csome_list_var.first();
                } 
            }
        } else {
            cdestructuring_bind_error(trans_pred_formula, $list43);
        }
        return list(binding, pred_sets);
    }

    public static SubLObject rkf_transitivity_strengthening_candidates_int(final SubLObject trans_pred, final SubLObject tva_pred, final SubLObject general, final SubLObject mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject ans = NIL;
        final SubLObject tva_argnum = TWO_INTEGER;
        final SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate(mt);
        final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
        try {
            mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
            mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
            mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
            if (NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(trans_pred, tva_argnum, tva_pred)) {
                final SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(trans_pred, tva_argnum, tva_pred);
                SubLObject done_var = NIL;
                final SubLObject token_var = NIL;
                while (NIL == done_var) {
                    final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                    final SubLObject valid = makeBoolean(!token_var.eql(final_index_spec));
                    if (NIL != valid) {
                        SubLObject final_index_iterator = NIL;
                        try {
                            final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $GAF, $TRUE, NIL);
                            SubLObject done_var_$8 = NIL;
                            final SubLObject token_var_$9 = NIL;
                            while (NIL == done_var_$8) {
                                final SubLObject tva_as = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$9);
                                final SubLObject valid_$10 = makeBoolean(!token_var_$9.eql(tva_as));
                                if (NIL != valid_$10) {
                                    final SubLObject args = assertions_high.gaf_args(tva_as);
                                    final SubLObject pred = args.first();
                                    final SubLObject argnum = third(args);
                                    final SubLObject pred_gafs = set.new_set(symbol_function(EQ), UNPROVIDED);
                                    if (NIL != rkf_pred_ok_for_transitivity_strengtheningP(pred, general, argnum, mt)) {
                                        final SubLObject pred_var_$11 = pred;
                                        if (NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(general, argnum, pred_var_$11)) {
                                            final SubLObject iterator_var_$12 = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(general, argnum, pred_var_$11);
                                            SubLObject done_var_$9 = NIL;
                                            final SubLObject token_var_$10 = NIL;
                                            while (NIL == done_var_$9) {
                                                final SubLObject final_index_spec_$15 = iteration.iteration_next_without_values_macro_helper(iterator_var_$12, token_var_$10);
                                                final SubLObject valid_$11 = makeBoolean(!token_var_$10.eql(final_index_spec_$15));
                                                if (NIL != valid_$11) {
                                                    SubLObject final_index_iterator_$17 = NIL;
                                                    try {
                                                        final_index_iterator_$17 = kb_mapping_macros.new_final_index_iterator(final_index_spec_$15, $GAF, $TRUE, NIL);
                                                        SubLObject done_var_$10 = NIL;
                                                        final SubLObject token_var_$11 = NIL;
                                                        while (NIL == done_var_$10) {
                                                            final SubLObject as = iteration.iteration_next_without_values_macro_helper(final_index_iterator_$17, token_var_$11);
                                                            final SubLObject valid_$12 = makeBoolean(!token_var_$11.eql(as));
                                                            if (((NIL != valid_$12) && (NIL != assertions_high.asserted_assertionP(as))) && (NIL == rkf_relevance_utilities.rkf_irrelevant_formula(assertions_high.gaf_formula(as), mt))) {
                                                                set.set_add(as, pred_gafs);
                                                            }
                                                            done_var_$10 = makeBoolean(NIL == valid_$12);
                                                        } 
                                                    } finally {
                                                        final SubLObject _prev_bind_0_$21 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                                        try {
                                                            $is_thread_performing_cleanupP$.bind(T, thread);
                                                            final SubLObject _values = getValuesAsVector();
                                                            if (NIL != final_index_iterator_$17) {
                                                                kb_mapping_macros.destroy_final_index_iterator(final_index_iterator_$17);
                                                            }
                                                            restoreValuesFromVector(_values);
                                                        } finally {
                                                            $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$21, thread);
                                                        }
                                                    }
                                                }
                                                done_var_$9 = makeBoolean(NIL == valid_$11);
                                            } 
                                        }
                                        if (NIL == set.empty_set_p(pred_gafs)) {
                                            ans = cons(cons(pred, pred_gafs), ans);
                                        }
                                    }
                                }
                                done_var_$8 = makeBoolean(NIL == valid_$10);
                            } 
                        } finally {
                            final SubLObject _prev_bind_0_$22 = $is_thread_performing_cleanupP$.currentBinding(thread);
                            try {
                                $is_thread_performing_cleanupP$.bind(T, thread);
                                final SubLObject _values2 = getValuesAsVector();
                                if (NIL != final_index_iterator) {
                                    kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                }
                                restoreValuesFromVector(_values2);
                            } finally {
                                $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$22, thread);
                            }
                        }
                    }
                    done_var = makeBoolean(NIL == valid);
                } 
            }
        } finally {
            mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_3, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
        }
        return ans;
    }

    public static SubLObject rkf_pred_ok_for_transitivity_strengtheningP(final SubLObject pred, final SubLObject arg, final SubLObject argnum, final SubLObject mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return makeBoolean(kb_indexing.num_gaf_arg_index(arg, argnum, pred, UNPROVIDED).numLE($rkf_transitive_strengthener_max$.getDynamicValue(thread)) && ((NIL != isa.isaP(pred, $$RuleMacroPredicate, mt, UNPROVIDED)) || (NIL != rkf_pure_type_level_predP(pred, mt))));
    }

    public static SubLObject rkf_pure_type_level_predP(final SubLObject pred, final SubLObject mt) {
        final SubLObject v_arity = arity.arity(pred);
        SubLObject okP = NIL;
        if (v_arity.isInteger()) {
            SubLObject badP = NIL;
            if (NIL == badP) {
                SubLObject end_var;
                SubLObject argnum;
                for (end_var = number_utilities.f_1X(v_arity), argnum = NIL, argnum = ONE_INTEGER; (NIL == badP) && (!argnum.numGE(end_var)); argnum = number_utilities.f_1X(argnum)) {
                    if ((NIL == kb_accessors.argn_genl(pred, argnum, mt)) && (NIL == member($$Collection, kb_accessors.argn_isa(pred, argnum, mt), UNPROVIDED, UNPROVIDED))) {
                        badP = T;
                    }
                }
            }
            if (NIL == badP) {
                okP = T;
            }
        }
        return okP;
    }

    public static SubLObject rkf_get_typed_specializations_for_collection(final SubLObject collection, final SubLObject mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject template = list($sym41$_SPEC);
        final SubLObject sentence = list($$and, list($$typeGenls, $sym41$_SPEC, collection), $list50, list($$unknownSentence, list($$relationAllInstance, $const34$keIrrelevantPrecisionSuggestionFr, $sym41$_SPEC, collection)), list($$unknownSentence, list($$thereExists, $sym54$_COLTYPE2, listS($$and, list($$typeGenls, $sym54$_COLTYPE2, collection), $list55))));
        SubLObject query_properties = ask_utilities.query_properties_from_legacy_ask_parameters(ZERO_INTEGER, NIL, NIL, NIL);
        SubLObject results = NIL;
        query_properties = putf(query_properties, $RESULT_UNIQUENESS, $BINDINGS);
        query_properties = putf(query_properties, $RETURN, list($TEMPLATE, template));
        query_properties = putf(query_properties, $PRODUCTIVITY_LIMIT, $POSITIVE_INFINITY);
        query_properties = putf(query_properties, $ALLOWED_MODULES, $list63);
        thread.resetMultipleValues();
        final SubLObject query_results = inference_kernel.new_cyc_query(sentence, mt, query_properties);
        final SubLObject suspend_status = thread.secondMultipleValue();
        thread.resetMultipleValues();
        SubLObject cdolist_list_var = query_results;
        SubLObject query_result = NIL;
        query_result = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            final SubLObject type_spec = query_result.first();
            if (NIL == rkf_relevance_utilities.rkf_irrelevant_term(type_spec, mt)) {
                results = cons(type_spec, results);
            }
            cdolist_list_var = cdolist_list_var.rest();
            query_result = cdolist_list_var.first();
        } 
        return Sort.sort(results, symbol_function($sym24$_), symbol_function(NUM_INDEX));
    }

    public static SubLObject declare_rkf_precision_suggestor_file() {
        declareFunction(me, "rkf_raw_precisify_arg", "RKF-RAW-PRECISIFY-ARG", 4, 3, false);
        declareFunction(me, "rkf_sentence_arg_precisification_options", "RKF-SENTENCE-ARG-PRECISIFICATION-OPTIONS", 4, 0, false);
        declareFunction(me, "rkf_sentence_arg_generalization_options", "RKF-SENTENCE-ARG-GENERALIZATION-OPTIONS", 3, 0, false);
        declareFunction(me, "rkf_sentence_arg_specialization_options", "RKF-SENTENCE-ARG-SPECIALIZATION-OPTIONS", 3, 0, false);
        declareFunction(me, "gen_template_recipe_argP", "GEN-TEMPLATE-RECIPE-ARG?", 3, 0, false);
        declareFunction(me, "gen_template_recipe_specialization_options", "GEN-TEMPLATE-RECIPE-SPECIALIZATION-OPTIONS", 3, 0, false);
        declareFunction(me, "rkf_sentence_arg_tva_options", "RKF-SENTENCE-ARG-TVA-OPTIONS", 4, 0, false);
        declareFunction(me, "rkf_raw_generalization_candidates", "RKF-RAW-GENERALIZATION-CANDIDATES", 3, 0, false);
        declareFunction(me, "rkf_isa_of_type_collectionP", "RKF-ISA-OF-TYPE-COLLECTION?", 1, 0, false);
        declareFunction(me, "rkf_raw_specialization_candidates", "RKF-RAW-SPECIALIZATION-CANDIDATES", 3, 1, false);
        declareFunction(me, "rkf_remove_subsumed", "RKF-REMOVE-SUBSUMED", 4, 0, false);
        declareFunction(me, "rkf_remove_subsumed_helper_internal", "RKF-REMOVE-SUBSUMED-HELPER-INTERNAL", 3, 0, false);
        declareFunction(me, "rkf_remove_subsumed_helper", "RKF-REMOVE-SUBSUMED-HELPER", 3, 0, false);
        declareFunction(me, "clear_rkf_irrelevant_precision_suggestion_forts_from_fort", "CLEAR-RKF-IRRELEVANT-PRECISION-SUGGESTION-FORTS-FROM-FORT", 0, 0, false);
        declareFunction(me, "remove_rkf_irrelevant_precision_suggestion_forts_from_fort", "REMOVE-RKF-IRRELEVANT-PRECISION-SUGGESTION-FORTS-FROM-FORT", 2, 0, false);
        declareFunction(me, "rkf_irrelevant_precision_suggestion_forts_from_fort_internal", "RKF-IRRELEVANT-PRECISION-SUGGESTION-FORTS-FROM-FORT-INTERNAL", 2, 0, false);
        declareFunction(me, "rkf_irrelevant_precision_suggestion_forts_from_fort", "RKF-IRRELEVANT-PRECISION-SUGGESTION-FORTS-FROM-FORT", 2, 0, false);
        declareFunction(me, "rkf_raw_sentence_predicate_generalization_candidates", "RKF-RAW-SENTENCE-PREDICATE-GENERALIZATION-CANDIDATES", 2, 0, false);
        declareFunction(me, "rkf_sentence_predicate_generalization_candidates", "RKF-SENTENCE-PREDICATE-GENERALIZATION-CANDIDATES", 2, 0, false);
        declareFunction(me, "rkf_raw_sentence_predicate_specialization_candidates", "RKF-RAW-SENTENCE-PREDICATE-SPECIALIZATION-CANDIDATES", 2, 0, false);
        declareFunction(me, "rkf_sentence_predicate_specialization_candidates", "RKF-SENTENCE-PREDICATE-SPECIALIZATION-CANDIDATES", 2, 0, false);
        declareFunction(me, "rkf_generalize", "RKF-GENERALIZE", 1, 1, false);
        declareFunction(me, "rkf_specialize", "RKF-SPECIALIZE", 1, 1, false);
        declareFunction(me, "rkf_transitivity_strengthening_candidates", "RKF-TRANSITIVITY-STRENGTHENING-CANDIDATES", 1, 2, false);
        declareFunction(me, "rkf_transitivity_strengthening_candidates_int", "RKF-TRANSITIVITY-STRENGTHENING-CANDIDATES-INT", 4, 0, false);
        declareFunction(me, "rkf_pred_ok_for_transitivity_strengtheningP", "RKF-PRED-OK-FOR-TRANSITIVITY-STRENGTHENING?", 4, 0, false);
        declareFunction(me, "rkf_pure_type_level_predP", "RKF-PURE-TYPE-LEVEL-PRED?", 2, 0, false);
        declareFunction(me, "rkf_get_typed_specializations_for_collection", "RKF-GET-TYPED-SPECIALIZATIONS-FOR-COLLECTION", 2, 0, false);
        return NIL;
    }

    public static SubLObject init_rkf_precision_suggestor_file() {
        defparameter("*RKF-RAW-SPECIALIZATION-TYPE-COL*", NIL);
        deflexical("*RKF-IRRELEVANT-PRECISION-SUGGESTION-FORTS-FROM-FORT-CACHING-STATE*", NIL);
        defparameter("*RKF-TRANSITIVE-STRENGTHENER-MAX*", TEN_INTEGER);
        return NIL;
    }

    public static SubLObject setup_rkf_precision_suggestor_file() {
        memoization_state.note_memoized_function(RKF_REMOVE_SUBSUMED_HELPER);
        memoization_state.note_globally_cached_function(RKF_IRRELEVANT_PRECISION_SUGGESTION_FORTS_FROM_FORT);
        return NIL;
    }

    @Override
    public void declareFunctions() {
        declare_rkf_precision_suggestor_file();
    }

    @Override
    public void initializeVariables() {
        init_rkf_precision_suggestor_file();
    }

    @Override
    public void runTopLevelForms() {
        setup_rkf_precision_suggestor_file();
    }

    
}

/**
 * Total time: 315 ms
 */
