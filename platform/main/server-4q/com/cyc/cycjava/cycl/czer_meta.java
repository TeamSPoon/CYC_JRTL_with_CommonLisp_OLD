package com.cyc.cycjava.cycl;


import static com.cyc.cycjava.cycl.constant_handles.reader_make_constant_shell;
import static com.cyc.cycjava.cycl.control_vars.$candidate_assertion$;
import static com.cyc.cycjava.cycl.control_vars.$cnf_matching_predicate$;
import static com.cyc.cycjava.cycl.control_vars.$gaf_matching_predicate$;
import static com.cyc.cycjava.cycl.control_vars.$within_ask$;
import static com.cyc.cycjava.cycl.control_vars.$within_assert$;
import static com.cyc.cycjava.cycl.el_utilities.contains_subformula_p;
import static com.cyc.cycjava.cycl.el_utilities.designated_mt;
import static com.cyc.cycjava.cycl.el_utilities.designated_sentence;
import static com.cyc.cycjava.cycl.el_utilities.el_error;
import static com.cyc.cycjava.cycl.el_utilities.el_exception_p;
import static com.cyc.cycjava.cycl.el_utilities.el_formula_p;
import static com.cyc.cycjava.cycl.el_utilities.ist_sentence_p;
import static com.cyc.cycjava.cycl.el_utilities.literalP;
import static com.cyc.cycjava.cycl.el_utilities.literal_arg0;
import static com.cyc.cycjava.cycl.el_utilities.literal_arg1;
import static com.cyc.cycjava.cycl.el_utilities.literal_arg2;
import static com.cyc.cycjava.cycl.el_utilities.literal_args;
import static com.cyc.cycjava.cycl.el_utilities.literal_arity;
import static com.cyc.cycjava.cycl.el_utilities.literal_atomic_sentence;
import static com.cyc.cycjava.cycl.el_utilities.literal_predicate;
import static com.cyc.cycjava.cycl.el_utilities.make_formula;
import static com.cyc.cycjava.cycl.el_utilities.mt_designating_formulaP;
import static com.cyc.cycjava.cycl.el_utilities.mt_designating_literalP;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.cons;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.list;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.nconc;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.rplaca;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.rplacd;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality.equal;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions.funcall;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.add;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.numE;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.find_if;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.nreverse;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.symbol_function;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types.sublisp_null;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.arg2;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.multiple_value_list;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.resetMultipleValues;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.values;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeBoolean;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeString;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeSymbol;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.destructuring_bind_must_consp;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.copy_tree;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.member;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.second;
import static com.cyc.tool.subl.util.SubLFiles.declareFunction;
import static com.cyc.tool.subl.util.SubLFiles.deflexical;

import com.cyc.cycjava.cycl.inference.harness.removal_module_utilities;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.BinaryFunction;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.UnaryFunction;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ZeroArityFunction;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;


public final class czer_meta extends SubLTranslatedFile {
    public static final SubLFile me = new czer_meta();

    public static final String myName = "com.cyc.cycjava.cycl.czer_meta";

    public static final String myFingerPrint = "122a246071f82f6a3c5534ea15ef28e135c562cfe575ad33d32b20ebc7375be2";

    // deflexical
    private static final SubLSymbol $meta_relation_somewhereP_caching_state$ = makeSymbol("*META-RELATION-SOMEWHERE?-CACHING-STATE*");

    // deflexical
    private static final SubLSymbol $possibly_meta_relation_somewhereP_cached_caching_state$ = makeSymbol("*POSSIBLY-META-RELATION-SOMEWHERE?-CACHED-CACHING-STATE*");



    // Internal Constants
    public static final SubLSymbol $sym0$EL_VAR_ = makeSymbol("EL-VAR?");



    public static final SubLSymbol $sym2$GAF_ASSERTION_ = makeSymbol("GAF-ASSERTION?");

    public static final SubLSymbol $sym3$RULE_ASSERTION_ = makeSymbol("RULE-ASSERTION?");

    public static final SubLSymbol $sym4$ASSERTED_ASSERTION_ = makeSymbol("ASSERTED-ASSERTION?");

    public static final SubLSymbol $sym5$DEDUCED_ASSERTION_ = makeSymbol("DEDUCED-ASSERTION?");

    public static final SubLSymbol $sym6$NL_SEMANTIC_ASSERTION_ = makeSymbol("NL-SEMANTIC-ASSERTION?");

    public static final SubLSymbol $sym7$META_RELATION_SOMEWHERE_ = makeSymbol("META-RELATION-SOMEWHERE?");



    private static final SubLObject $$EverythingPSC = reader_make_constant_shell(makeString("EverythingPSC"));

    public static final SubLSymbol $sym10$_META_RELATION_SOMEWHERE__CACHING_STATE_ = makeSymbol("*META-RELATION-SOMEWHERE?-CACHING-STATE*");

    public static final SubLSymbol $sym11$CLEAR_META_RELATION_SOMEWHERE_ = makeSymbol("CLEAR-META-RELATION-SOMEWHERE?");

    private static final SubLSymbol $sym12$POSSIBLY_META_RELATION_SOMEWHERE__CACHED = makeSymbol("POSSIBLY-META-RELATION-SOMEWHERE?-CACHED");

    private static final SubLSymbol $sym13$_POSSIBLY_META_RELATION_SOMEWHERE__CACHED_CACHING_STATE_ = makeSymbol("*POSSIBLY-META-RELATION-SOMEWHERE?-CACHED-CACHING-STATE*");

    private static final SubLSymbol $sym14$CLEAR_POSSIBLY_META_RELATION_SOMEWHERE__CACHED = makeSymbol("CLEAR-POSSIBLY-META-RELATION-SOMEWHERE?-CACHED");



    private static final SubLSymbol CACHED_FIND_ASSERTIONS_CYCL = makeSymbol("CACHED-FIND-ASSERTIONS-CYCL");

    private static final SubLSymbol $cached_find_assertions_cycl_caching_state$ = makeSymbol("*CACHED-FIND-ASSERTIONS-CYCL-CACHING-STATE*");

    private static final SubLSymbol $sym18$RECANONICALIZED_CANDIDATE_ASSERTION_EQUALS_CNF_ = makeSymbol("RECANONICALIZED-CANDIDATE-ASSERTION-EQUALS-CNF?");

    private static final SubLSymbol $sym19$RECANONICALIZED_CANDIDATE_ASSERTION_EQUALS_GAF_ = makeSymbol("RECANONICALIZED-CANDIDATE-ASSERTION-EQUALS-GAF?");

    private static final SubLList $list20 = cons(makeSymbol("CNF"), makeSymbol("HL-TV"));



    private static final SubLString $str22$Cannot_set_tense_czer_to_invalid_ = makeString("Cannot set tense czer to invalid mode.");

    private static final SubLObject $$True = reader_make_constant_shell(makeString("True"));

    private static final SubLObject $$False = reader_make_constant_shell(makeString("False"));

    private static final SubLSymbol $sym25$EL_META_FORMULA_ = makeSymbol("EL-META-FORMULA?");

    private static final SubLSymbol EXPRESS_AS_META_FORMULA = makeSymbol("EXPRESS-AS-META-FORMULA");

    private static final SubLSymbol $sym27$GROUND_EL_META_FORMULA_ = makeSymbol("GROUND-EL-META-FORMULA?");

    private static final SubLString $str28$invalid_meta_arg___s = makeString("invalid meta-arg: ~s");



    private static final SubLSymbol $sym30$KB_ASSERTION_ = makeSymbol("KB-ASSERTION?");



    public static SubLObject has_exceptionP(final SubLObject assertion) {
        SubLObject exceptionP = NIL;
        if (NIL == exceptionP) {
            SubLObject csome_list_var = assertion_utilities.all_meta_assertions(assertion);
            SubLObject meta_assertion = NIL;
            meta_assertion = csome_list_var.first();
            while ((NIL == exceptionP) && (NIL != csome_list_var)) {
                if (NIL != el_exception_p(uncanonicalizer.assertion_el_formula(meta_assertion))) {
                    exceptionP = T;
                }
                csome_list_var = csome_list_var.rest();
                meta_assertion = csome_list_var.first();
            } 
        }
        return exceptionP;
    }

    public static SubLObject accessible_kb_assertions(final SubLObject sentence, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (NIL != mt_designating_literalP(sentence)) {
            return find_kb_assertions(designated_sentence(sentence), designated_mt(sentence));
        }
        return accessible_assertions_cycl(sentence, mt);
    }

    public static SubLObject accessible_kb_assertionsP(final SubLObject sentence, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        final SubLObject sentence_assertions = accessible_kb_assertions(sentence, mt);
        if (NIL != sentence_assertions) {
            return makeBoolean(NIL == subl_promotions.memberP(NIL, sentence_assertions, UNPROVIDED, UNPROVIDED));
        }
        return NIL;
    }

    public static SubLObject accessible_assertions_cycl(final SubLObject sentence, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject sentence_assertions = NIL;
        SubLObject canon_versions = NIL;
        final SubLObject mt_var = mt;
        final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
        try {
            mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.possibly_in_mt_determine_function(mt_var), thread);
            mt_relevance_macros.$mt$.bind(mt_relevance_macros.possibly_in_mt_determine_mt(mt_var), thread);
            final SubLObject _prev_bind_0_$1 = $within_assert$.currentBinding(thread);
            final SubLObject _prev_bind_1_$2 = $within_ask$.currentBinding(thread);
            final SubLObject _prev_bind_3 = czer_vars.$recanonicalizingP$.currentBinding(thread);
            try {
                $within_assert$.bind(NIL, thread);
                $within_ask$.bind(NIL, thread);
                czer_vars.$recanonicalizingP$.bind(T, thread);
                canon_versions = czer_main.canonicalize_wf_cycl(sentence, UNPROVIDED);
            } finally {
                czer_vars.$recanonicalizingP$.rebind(_prev_bind_3, thread);
                $within_ask$.rebind(_prev_bind_1_$2, thread);
                $within_assert$.rebind(_prev_bind_0_$1, thread);
            }
            if (canon_versions.isCons()) {
                SubLObject cdolist_list_var = canon_versions;
                SubLObject canon_version = NIL;
                canon_version = cdolist_list_var.first();
                while (NIL != cdolist_list_var) {
                    SubLObject cnf_assertions = NIL;
                    thread.resetMultipleValues();
                    final SubLObject cnf = fi.fi_canonicalize(canon_version, T, UNPROVIDED);
                    final SubLObject v_variables = thread.secondMultipleValue();
                    final SubLObject rm_tv = thread.thirdMultipleValue();
                    thread.resetMultipleValues();
                    if ((((NIL == clauses.neg_lits(cnf)) && (NIL != list_utilities.singletonP(clauses.pos_lits(cnf)))) && (NIL != mt_designating_literalP(clauses.pos_lits(cnf).first()))) && (NIL != hlmt.hlmt_p(designated_mt(clauses.pos_lits(cnf).first())))) {
                        final SubLObject literal = clauses.pos_lits(cnf).first();
                        SubLObject cdolist_list_var_$3 = find_kb_assertions(designated_sentence(literal), designated_mt(literal));
                        SubLObject assertion = NIL;
                        assertion = cdolist_list_var_$3.first();
                        while (NIL != cdolist_list_var_$3) {
                            cnf_assertions = cons(assertion, cnf_assertions);
                            cdolist_list_var_$3 = cdolist_list_var_$3.rest();
                            assertion = cdolist_list_var_$3.first();
                        } 
                    } else {
                        SubLObject cdolist_list_var_$4 = kb_indexing.find_all_assertions(cnf);
                        SubLObject assertion2 = NIL;
                        assertion2 = cdolist_list_var_$4.first();
                        while (NIL != cdolist_list_var_$4) {
                            if (NIL != mt_relevance_macros.relevant_mtP(assertions_high.assertion_mt(assertion2))) {
                                cnf_assertions = cons(assertion2, cnf_assertions);
                            }
                            cdolist_list_var_$4 = cdolist_list_var_$4.rest();
                            assertion2 = cdolist_list_var_$4.first();
                        } 
                    }
                    sentence_assertions = cons(cnf_assertions, sentence_assertions);
                    cdolist_list_var = cdolist_list_var.rest();
                    canon_version = cdolist_list_var.first();
                } 
            }
        } finally {
            mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
        }
        return sentence_assertions;
    }

    public static SubLObject kb_versions(final SubLObject el_object, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = mt_relevance_macros.$mt$.getDynamicValue();
        }
        if (NIL != wff.el_wffP(el_object, mt, UNPROVIDED)) {
            return find_kb_assertions(el_object, mt);
        }
        if (NIL != term.ground_nautP(el_object, symbol_function($sym0$EL_VAR_))) {
            return list_utilities.list_if(narts_high.find_nart(el_object));
        }
        return list(el_object);
    }

    public static SubLObject literal_meta_args(final SubLObject literal, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        SubLObject n = ZERO_INTEGER;
        final SubLObject meta_pred = literal_arg0(literal, UNPROVIDED);
        SubLObject args = NIL;
        SubLObject cdolist_list_var = literal_args(literal, UNPROVIDED);
        SubLObject arg = NIL;
        arg = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            n = add(n, ONE_INTEGER);
            if (NIL != possibly_meta_argP(meta_pred, n, mt)) {
                args = cons(arg, args);
            }
            cdolist_list_var = cdolist_list_var.rest();
            arg = cdolist_list_var.first();
        } 
        return nreverse(args);
    }

    public static SubLObject el_assertion_specP(final SubLObject sentence, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        return el_constrained_assertion_specP(sentence, symbol_function(TRUE), mt);
    }

    public static SubLObject el_gaf_assertion_specP(final SubLObject sentence, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        return el_constrained_assertion_specP(sentence, symbol_function($sym2$GAF_ASSERTION_), mt);
    }

    public static SubLObject el_rule_assertion_specP(final SubLObject sentence, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        return el_constrained_assertion_specP(sentence, symbol_function($sym3$RULE_ASSERTION_), mt);
    }

    public static SubLObject el_asserted_assertion_specP(final SubLObject sentence, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        return el_constrained_assertion_specP(sentence, symbol_function($sym4$ASSERTED_ASSERTION_), mt);
    }

    public static SubLObject el_deduced_assertion_specP(final SubLObject sentence, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        return el_constrained_assertion_specP(sentence, symbol_function($sym5$DEDUCED_ASSERTION_), mt);
    }

    public static SubLObject el_constrained_assertion_specP(final SubLObject sentence, final SubLObject constraint, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject passP = NIL;
        final SubLObject mt_var = mt;
        final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
        try {
            mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.possibly_in_mt_determine_function(mt_var), thread);
            mt_relevance_macros.$mt$.bind(mt_relevance_macros.possibly_in_mt_determine_mt(mt_var), thread);
            thread.resetMultipleValues();
            final SubLObject assertions = find_kb_assertions(sentence, UNPROVIDED);
            final SubLObject some_not_foundP = thread.secondMultipleValue();
            thread.resetMultipleValues();
            if (NIL != assertions) {
                if (NIL == some_not_foundP) {
                    if (NIL != list_utilities.singletonP(assertions)) {
                        passP = funcall(constraint, assertions.first());
                    } else
                        if (NIL != czer_vars.$distributing_meta_knowledgeP$.getDynamicValue(thread)) {
                            passP = sublisp_null(list_utilities.find_if_not(constraint, assertions, UNPROVIDED, UNPROVIDED, UNPROVIDED));
                        } else
                            if (NIL != czer_vars.$distribute_meta_over_common_elP$.getDynamicValue(thread)) {
                                passP = makeBoolean((NIL == list_utilities.find_if_not(constraint, assertions, UNPROVIDED, UNPROVIDED, UNPROVIDED)) && (NIL != common_el_sentencesP(assertions)));
                            }


                }
            }
        } finally {
            mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
        }
        return passP;
    }

    public static SubLObject el_nl_semantic_assertion_specP(final SubLObject sentence, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        return el_constrained_assertion_specP(sentence, symbol_function($sym6$NL_SEMANTIC_ASSERTION_), mt);
    }

    public static SubLObject common_el_sentencesP(final SubLObject assertions) {
        if (NIL != list_utilities.singletonP(assertions)) {
            return assertion_handles.assertion_p(assertions.first());
        }
        if (NIL != assertions) {
            SubLObject el_sentence = NIL;
            SubLObject uncommonP = NIL;
            if (NIL == uncommonP) {
                SubLObject csome_list_var = assertions;
                SubLObject assertion = NIL;
                assertion = csome_list_var.first();
                while ((NIL == uncommonP) && (NIL != csome_list_var)) {
                    if (NIL != el_sentence) {
                        uncommonP = makeBoolean((NIL == assertion_handles.assertion_p(assertion)) || (!el_sentence.equal(uncanonicalizer.assertion_el_formula(assertion))));
                    } else {
                        el_sentence = uncanonicalizer.assertion_el_formula(assertion);
                    }
                    csome_list_var = csome_list_var.rest();
                    assertion = csome_list_var.first();
                } 
            }
            return makeBoolean(NIL == uncommonP);
        }
        return NIL;
    }

    public static SubLObject meta_predicateP(final SubLObject symbol, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        return makeBoolean((NIL != fort_types_interface.predicateP(symbol)) && (NIL != meta_relationP(symbol, mt)));
    }

    public static SubLObject meta_relationP(final SubLObject symbol, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        return makeBoolean((((NIL != kb_accessors.relationP(symbol)) && (NIL == term.mt_designating_relationP(symbol))) && (NIL != meta_relation_somewhereP(symbol))) && (NIL != meta_relation_intP(symbol, mt)));
    }

    public static SubLObject clear_meta_relation_somewhereP() {
        final SubLObject cs = $meta_relation_somewhereP_caching_state$.getGlobalValue();
        if (NIL != cs) {
            memoization_state.caching_state_clear(cs);
        }
        return NIL;
    }

    public static SubLObject remove_meta_relation_somewhereP(final SubLObject relation) {
        return memoization_state.caching_state_remove_function_results_with_args($meta_relation_somewhereP_caching_state$.getGlobalValue(), list(relation), UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject meta_relation_somewhereP_internal(final SubLObject relation) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject v_answer = NIL;
        final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
        try {
            mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_EVERYTHING, thread);
            mt_relevance_macros.$mt$.bind($$EverythingPSC, thread);
            v_answer = meta_relation_intP(relation, UNPROVIDED);
        } finally {
            mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
        }
        return v_answer;
    }

    public static SubLObject meta_relation_somewhereP(final SubLObject relation) {
        SubLObject caching_state = $meta_relation_somewhereP_caching_state$.getGlobalValue();
        if (NIL == caching_state) {
            caching_state = memoization_state.create_global_caching_state_for_name($sym7$META_RELATION_SOMEWHERE_, $sym10$_META_RELATION_SOMEWHERE__CACHING_STATE_, NIL, EQL, ONE_INTEGER, ZERO_INTEGER);
            memoization_state.register_hl_store_cache_clear_callback($sym11$CLEAR_META_RELATION_SOMEWHERE_);
        }
        SubLObject results = memoization_state.caching_state_lookup(caching_state, relation, memoization_state.$memoized_item_not_found$.getGlobalValue());
        if (results.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            results = arg2(resetMultipleValues(), multiple_value_list(meta_relation_somewhereP_internal(relation)));
            memoization_state.caching_state_put(caching_state, relation, results, UNPROVIDED);
        }
        return memoization_state.caching_results(results);
    }

    public static SubLObject meta_relation_intP(final SubLObject symbol, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        SubLObject max_arity = arity.max_arity(symbol);
        SubLObject okP = NIL;
        if (NIL == max_arity) {
            max_arity = FIVE_INTEGER;
        }
        if (NIL == okP) {
            SubLObject end_var;
            SubLObject index;
            SubLObject quoted_pred;
            for (end_var = number_utilities.f_1X(max_arity), index = NIL, index = ONE_INTEGER; (NIL == okP) && (!index.numGE(end_var)); index = number_utilities.f_1X(index)) {
                quoted_pred = kb_accessors.arg_quoted_isa_pred(index, UNPROVIDED, UNPROVIDED);
                if ((NIL == okP) && (NIL != forts.fort_p(quoted_pred))) {
                    okP = genls.genl_of_any_argP(czer_vars.$meta_arg_type$.getGlobalValue(), symbol, quoted_pred, mt, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                }
            }
        }
        return okP;
    }

    public static SubLObject sentence_with_meta_predicateP(final SubLObject sentence, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        return meta_predicateP(cycl_utilities.formula_operator(sentence), mt);
    }

    public static SubLObject sentence_with_meta_relationP(final SubLObject sentence, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        return meta_relationP(cycl_utilities.formula_operator(sentence), mt);
    }

    public static SubLObject possibly_meta_predicateP(final SubLObject symbol, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        return makeBoolean((((NIL != fort_types_interface.predicateP(symbol)) && (NIL == term.mt_designating_relationP(symbol))) && (NIL != possibly_meta_relation_somewhereP(symbol))) && ((NIL != possibly_meta_relation_intP(symbol, mt)) || (NIL != meta_relation_intP(symbol, mt))));
    }

    public static SubLObject possibly_meta_relationP(final SubLObject symbol, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        return makeBoolean((((NIL != kb_accessors.relationP(symbol)) && (NIL == term.mt_designating_relationP(symbol))) && (NIL != possibly_meta_relation_somewhereP(symbol))) && ((NIL != possibly_meta_relation_intP(symbol, mt)) || (NIL != meta_relation_intP(symbol, mt))));
    }

    public static SubLObject possibly_meta_relation_somewhereP(final SubLObject relation) {
        return makeBoolean((NIL != meta_relation_somewhereP(relation)) || (NIL != possibly_meta_relation_somewhereP_cached(relation)));
    }

    public static SubLObject clear_possibly_meta_relation_somewhereP_cached() {
        final SubLObject cs = $possibly_meta_relation_somewhereP_cached_caching_state$.getGlobalValue();
        if (NIL != cs) {
            memoization_state.caching_state_clear(cs);
        }
        return NIL;
    }

    public static SubLObject remove_possibly_meta_relation_somewhereP_cached(final SubLObject relation) {
        return memoization_state.caching_state_remove_function_results_with_args($possibly_meta_relation_somewhereP_cached_caching_state$.getGlobalValue(), list(relation), UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject possibly_meta_relation_somewhereP_cached_internal(final SubLObject relation) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject v_answer = NIL;
        final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
        try {
            mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_EVERYTHING, thread);
            mt_relevance_macros.$mt$.bind($$EverythingPSC, thread);
            v_answer = possibly_meta_relation_intP(relation, UNPROVIDED);
        } finally {
            mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
        }
        return v_answer;
    }

    public static SubLObject possibly_meta_relation_somewhereP_cached(final SubLObject relation) {
        SubLObject caching_state = $possibly_meta_relation_somewhereP_cached_caching_state$.getGlobalValue();
        if (NIL == caching_state) {
            caching_state = memoization_state.create_global_caching_state_for_name($sym12$POSSIBLY_META_RELATION_SOMEWHERE__CACHED, $sym13$_POSSIBLY_META_RELATION_SOMEWHERE__CACHED_CACHING_STATE_, NIL, EQL, ONE_INTEGER, ZERO_INTEGER);
            memoization_state.register_hl_store_cache_clear_callback($sym14$CLEAR_POSSIBLY_META_RELATION_SOMEWHERE__CACHED);
        }
        SubLObject results = memoization_state.caching_state_lookup(caching_state, relation, memoization_state.$memoized_item_not_found$.getGlobalValue());
        if (results.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            results = arg2(resetMultipleValues(), multiple_value_list(possibly_meta_relation_somewhereP_cached_internal(relation)));
            memoization_state.caching_state_put(caching_state, relation, results, UNPROVIDED);
        }
        return memoization_state.caching_results(results);
    }

    public static SubLObject possibly_meta_relation_intP(final SubLObject symbol, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        return member(czer_vars.$possibly_meta_arg_type$.getGlobalValue(), kb_accessors.arg_quoted_isa(symbol, mt), UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject sentence_with_possibly_meta_predicateP(final SubLObject sentence, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        return possibly_meta_predicateP(cycl_utilities.formula_operator(sentence), mt);
    }

    public static SubLObject sentence_with_possibly_meta_relationP(final SubLObject sentence, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        return possibly_meta_relationP(cycl_utilities.formula_operator(sentence), mt);
    }

    public static SubLObject possibly_meta_argP(final SubLObject meta_pred, final SubLObject n, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (NIL != possibly_but_not_definitely_meta_argP(meta_pred, n, mt)) {
            return T;
        }
        return definitely_meta_argP(meta_pred, n, mt);
    }

    public static SubLObject possibly_but_not_definitely_meta_argP(final SubLObject meta_pred, final SubLObject n, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        return subl_promotions.memberP(czer_vars.$possibly_meta_arg_type$.getGlobalValue(), kb_accessors.argn_quoted_isa(meta_pred, n, mt), UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject definitely_meta_argP(final SubLObject meta_pred, final SubLObject n, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        final SubLObject quoted_arg_isa_pred = kb_accessors.arg_quoted_isa_pred(n, UNPROVIDED, UNPROVIDED);
        if (NIL != forts.fort_p(quoted_arg_isa_pred)) {
            return genls.genl_of_any_argP(czer_vars.$meta_arg_type$.getGlobalValue(), meta_pred, quoted_arg_isa_pred, mt, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        }
        return NIL;
    }

    public static SubLObject find_assertion_cycl(final SubLObject sentence, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = mt_relevance_macros.$mt$.getDynamicValue();
        }
        if ((NIL != el_formula_p(sentence)) || (NIL != term.kb_assertionP(sentence))) {
            return find_kb_assertions(sentence, mt).first();
        }
        return NIL;
    }

    public static SubLObject find_unique_assertion_cycl(final SubLObject sentence, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = mt_relevance_macros.$mt$.getDynamicValue();
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if ((NIL != el_formula_p(sentence)) || (NIL != term.kb_assertionP(sentence))) {
            thread.resetMultipleValues();
            final SubLObject assertions = find_kb_assertions(sentence, mt);
            final SubLObject some_missingP = thread.secondMultipleValue();
            thread.resetMultipleValues();
            if ((NIL != list_utilities.singletonP(assertions)) && (NIL == some_missingP)) {
                return assertions.first();
            }
        }
        return NIL;
    }

    public static SubLObject find_visible_assertion_cycl(final SubLObject sentence, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = mt_relevance_macros.$mt$.getDynamicValue();
        }
        if ((NIL != el_formula_p(sentence)) || (NIL != term.kb_assertionP(sentence))) {
            final SubLObject assertions = find_visible_kb_assertions(sentence, mt);
            if (NIL != list_utilities.singletonP(assertions)) {
                return assertions.first();
            }
        }
        return NIL;
    }

    public static SubLObject find_kb_assertions(final SubLObject sentence, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = mt_relevance_macros.$mt$.getDynamicValue();
        }
        if (NIL != term.kb_assertionP(sentence)) {
            return values(list(sentence), NIL);
        }
        if (NIL != mt_designating_literalP(sentence)) {
            return find_kb_assertions(designated_sentence(sentence), designated_mt(sentence));
        }
        return find_assertions_cycl(sentence, mt);
    }

    public static SubLObject find_visible_kb_assertions(final SubLObject sentence, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = mt_relevance_macros.$mt$.getDynamicValue();
        }
        if (NIL != term.kb_assertionP(sentence)) {
            return find_visible_sibling_mt_assertions(sentence);
        }
        if (NIL != mt_designating_literalP(sentence)) {
            return find_visible_kb_assertions(designated_sentence(sentence), designated_mt(sentence));
        }
        return find_visible_assertions_cycl(sentence, mt);
    }

    public static SubLObject find_visible_sibling_mt_assertions(final SubLObject assertion) {
        final SubLObject sibling_assertions = kb_indexing.sibling_mt_assertions(assertion, UNPROVIDED);
        final SubLObject assertion_mt = assertions_high.assertion_mt(assertion);
        SubLObject assertions = NIL;
        SubLObject cdolist_list_var = sibling_assertions;
        SubLObject sibling_assertion = NIL;
        sibling_assertion = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if (NIL != genl_mts.genl_mtP(assertion_mt, assertions_high.assertion_mt(sibling_assertion), UNPROVIDED, UNPROVIDED)) {
                assertions = cons(sibling_assertion, assertions);
            }
            cdolist_list_var = cdolist_list_var.rest();
            sibling_assertion = cdolist_list_var.first();
        } 
        assertions = cons(assertion, assertions);
        return assertions;
    }

    public static SubLObject find_some_assertion_cycl(final SubLObject sentence, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = mt_relevance_macros.$mt$.getDynamicValue();
        }
        if (NIL != el_formula_p(sentence)) {
            final SubLObject assertions = find_kb_assertions(sentence, mt);
            if (NIL != assertions) {
                return assertions.first();
            }
        }
        return NIL;
    }

    public static SubLObject all_kb_assertions_findableP(final SubLObject sentence, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        thread.resetMultipleValues();
        final SubLObject assertions = find_kb_assertions(sentence, mt);
        final SubLObject some_missingP = thread.secondMultipleValue();
        thread.resetMultipleValues();
        return makeBoolean((NIL != assertions) && (NIL == some_missingP));
    }

    public static SubLObject recanonicalized_candidate_assertion_equals_cnfP(final SubLObject goofball, final SubLObject cnf) {
        return equal(recanonicalize_candidate_assertion(), cnf);
    }

    public static SubLObject recanonicalized_candidate_assertion_equals_gafP(final SubLObject goofball, final SubLObject gaf) {
        return equal(clause_utilities.gaf_cnf_literal(recanonicalize_candidate_assertion()), gaf);
    }

    public static SubLObject recanonicalize_candidate_assertion() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != subl_promotions.memberP($candidate_assertion$.getDynamicValue(thread), czer_vars.$recanonicalizing_candidate_assertion_stack$.getDynamicValue(thread), symbol_function(EQ), UNPROVIDED)) {
            return NIL;
        }
        SubLObject result = NIL;
        final SubLObject _prev_bind_0 = at_vars.$noting_at_violationsP$.currentBinding(thread);
        final SubLObject _prev_bind_2 = czer_vars.$recanonicalizing_candidate_assertion_stack$.currentBinding(thread);
        try {
            at_vars.$noting_at_violationsP$.bind(NIL, thread);
            czer_vars.$recanonicalizing_candidate_assertion_stack$.bind(cons($candidate_assertion$.getDynamicValue(thread), czer_vars.$recanonicalizing_candidate_assertion_stack$.getDynamicValue(thread)), thread);
            result = czer_utilities.extract_hl_clauses(czer_main.canonicalize_wf_cycl(fi.assertion_fi_formula($candidate_assertion$.getDynamicValue(thread), UNPROVIDED), assertions_high.assertion_mt($candidate_assertion$.getDynamicValue(thread)))).first();
        } finally {
            czer_vars.$recanonicalizing_candidate_assertion_stack$.rebind(_prev_bind_2, thread);
            at_vars.$noting_at_violationsP$.rebind(_prev_bind_0, thread);
        }
        return result;
    }

    public static SubLObject candidate_assertion_el_formula() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != assertion_handles.assertion_p($candidate_assertion$.getDynamicValue(thread))) {
            return uncanonicalizer.assertion_el_formula($candidate_assertion$.getDynamicValue(thread));
        }
        return NIL;
    }

    public static SubLObject candidate_assertion_fi_formula() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != assertion_handles.assertion_p($candidate_assertion$.getDynamicValue(thread))) {
            return fi.assertion_fi_formula($candidate_assertion$.getDynamicValue(thread), T);
        }
        return NIL;
    }

    public static SubLObject robust_assertion_lookupP() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if ($DEFAULT == czer_vars.$robust_assertion_lookup$.getDynamicValue(thread)) {
            return NIL;
        }
        return czer_vars.$robust_assertion_lookup$.getDynamicValue(thread);
    }

    public static SubLObject find_assertions_cycl_in_mt(final SubLObject sentence, final SubLObject mt, final SubLObject use_genl_mtsP) {
        if (NIL != use_genl_mtsP) {
            return find_visible_assertions_cycl(sentence, mt);
        }
        return find_assertions_cycl(sentence, mt);
    }

    public static SubLObject find_assertions_cycl(final SubLObject sentence, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = mt_relevance_macros.$mt$.getDynamicValue();
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != el_formula_p(sentence)) {
            final SubLObject fort_mt = cycl_utilities.reify_when_closed_naut(mt);
            if (NIL == hlmt.hlmt_p(fort_mt)) {
                return values(NIL, NIL);
            }
            if ((NIL != czer_vars.$within_canonicalizerP$.getDynamicValue(thread)) || (NIL != wff_vars.$within_wffP$.getDynamicValue(thread))) {
                return cached_find_assertions_cycl(sentence, fort_mt, NIL);
            }
            return find_assertions_cycl_int(sentence, fort_mt, NIL);
        } else {
            if (NIL != term.kb_assertionP(sentence)) {
                return values(list(sentence), NIL);
            }
            return NIL;
        }
    }

    public static SubLObject find_visible_assertions_cycl(final SubLObject sentence, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = mt_relevance_macros.$mt$.getDynamicValue();
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if ((NIL != mt_relevance_macros.any_or_all_mts_relevant_to_mtP(mt)) && (NIL != el_formula_p(sentence))) {
            SubLObject result = NIL;
            SubLObject missingP = NIL;
            final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
            final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
            try {
                mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_EVERYTHING, thread);
                mt_relevance_macros.$mt$.bind($$EverythingPSC, thread);
                thread.resetMultipleValues();
                final SubLObject result_$5 = find_assertions_cycl(sentence, UNPROVIDED);
                final SubLObject missingP_$6 = thread.secondMultipleValue();
                thread.resetMultipleValues();
                result = result_$5;
                missingP = missingP_$6;
            } finally {
                mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
                mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
            }
            return values(result, missingP);
        }
        if (NIL != el_formula_p(sentence)) {
            final SubLObject fort_mt = cycl_utilities.reify_when_closed_naut(mt);
            if ((NIL != czer_vars.$within_canonicalizerP$.getDynamicValue(thread)) || (NIL != wff_vars.$within_wffP$.getDynamicValue(thread))) {
                return cached_find_assertions_cycl(sentence, fort_mt, T);
            }
            return find_assertions_cycl_int(sentence, fort_mt, T);
        } else {
            if (NIL != term.kb_assertionP(sentence)) {
                return find_visible_sibling_mt_assertions(sentence);
            }
            return NIL;
        }
    }

    public static SubLObject clear_cached_find_assertions_cycl() {
        final SubLObject cs = $cached_find_assertions_cycl_caching_state$.getGlobalValue();
        if (NIL != cs) {
            memoization_state.caching_state_clear(cs);
        }
        return NIL;
    }

    public static SubLObject remove_cached_find_assertions_cycl(final SubLObject sentence, final SubLObject mt, final SubLObject include_genl_mtsP) {
        return memoization_state.caching_state_remove_function_results_with_args($cached_find_assertions_cycl_caching_state$.getGlobalValue(), list(sentence, mt, include_genl_mtsP), UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject cached_find_assertions_cycl_internal(final SubLObject sentence, final SubLObject mt, final SubLObject include_genl_mtsP) {
        return find_assertions_cycl_int(sentence, mt, include_genl_mtsP);
    }

    public static SubLObject cached_find_assertions_cycl(final SubLObject sentence, final SubLObject mt, final SubLObject include_genl_mtsP) {
        SubLObject caching_state = $cached_find_assertions_cycl_caching_state$.getGlobalValue();
        if (NIL == caching_state) {
            caching_state = memoization_state.create_global_caching_state_for_name(CACHED_FIND_ASSERTIONS_CYCL, $cached_find_assertions_cycl_caching_state$, NIL, EQUAL, THREE_INTEGER, EIGHT_INTEGER);
        }
        final SubLObject sxhash = memoization_state.sxhash_calc_3(sentence, mt, include_genl_mtsP);
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
                    if (mt.equal(cached_args.first())) {
                        cached_args = cached_args.rest();
                        if (((NIL != cached_args) && (NIL == cached_args.rest())) && include_genl_mtsP.equal(cached_args.first())) {
                            return memoization_state.caching_results(results2);
                        }
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                collision = cdolist_list_var.first();
            } 
        }
        final SubLObject results3 = arg2(resetMultipleValues(), multiple_value_list(cached_find_assertions_cycl_internal(sentence, mt, include_genl_mtsP)));
        memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results3, list(sentence, mt, include_genl_mtsP));
        return memoization_state.caching_results(results3);
    }

    public static SubLObject find_assertions_cycl_int(final SubLObject sentence, final SubLObject mt, final SubLObject include_genl_mtsP) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        thread.resetMultipleValues();
        SubLObject result = find_assertions_cycl_int_2(sentence, mt, include_genl_mtsP);
        SubLObject missingP = thread.secondMultipleValue();
        thread.resetMultipleValues();
        if ((NIL == result) && (NIL != robust_assertion_lookupP())) {
            final SubLObject _prev_bind_0 = $cnf_matching_predicate$.currentBinding(thread);
            final SubLObject _prev_bind_2 = $gaf_matching_predicate$.currentBinding(thread);
            try {
                $cnf_matching_predicate$.bind($sym18$RECANONICALIZED_CANDIDATE_ASSERTION_EQUALS_CNF_, thread);
                $gaf_matching_predicate$.bind($sym19$RECANONICALIZED_CANDIDATE_ASSERTION_EQUALS_GAF_, thread);
                thread.resetMultipleValues();
                final SubLObject result_$7 = find_assertions_cycl_int_2(sentence, mt, include_genl_mtsP);
                final SubLObject missingP_$8 = thread.secondMultipleValue();
                thread.resetMultipleValues();
                result = result_$7;
                missingP = missingP_$8;
            } finally {
                $gaf_matching_predicate$.rebind(_prev_bind_2, thread);
                $cnf_matching_predicate$.rebind(_prev_bind_0, thread);
            }
        }
        return values(result, missingP);
    }

    public static SubLObject find_assertions_cycl_int_2(final SubLObject sentence, SubLObject mt, final SubLObject include_genl_mtsP) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject new_var_sentence = czer_main.el_nununiquify_vars(sentence);
        SubLObject all_assertions = NIL;
        SubLObject canon_cnf_tvs = NIL;
        SubLObject blists = NIL;
        SubLObject missingP = NIL;
        thread.resetMultipleValues();
        final SubLObject canon_cnf_tvs_$9 = canon_cnfs_sentence(new_var_sentence, T, mt);
        final SubLObject blists_$10 = thread.secondMultipleValue();
        final SubLObject mt_$11 = thread.thirdMultipleValue();
        thread.resetMultipleValues();
        canon_cnf_tvs = canon_cnf_tvs_$9;
        blists = blists_$10;
        mt = mt_$11;
        if (NIL == cycl_grammar.cycl_truth_value_p(blists)) {
            SubLObject cnf_tv = NIL;
            SubLObject cnf_tv_$12 = NIL;
            SubLObject blist = NIL;
            SubLObject blist_$13 = NIL;
            cnf_tv = canon_cnf_tvs;
            cnf_tv_$12 = cnf_tv.first();
            blist = blists;
            blist_$13 = blist.first();
            while ((NIL != blist) || (NIL != cnf_tv)) {
                SubLObject current;
                final SubLObject datum = current = cnf_tv_$12;
                SubLObject cnf = NIL;
                SubLObject hl_tv = NIL;
                destructuring_bind_must_consp(current, datum, $list20);
                cnf = current.first();
                current = hl_tv = current.rest();
                final SubLObject assertions_for_cnf = find_assertions_from_cnf(cnf, blist_$13, mt, include_genl_mtsP);
                if (NIL == assertions_for_cnf) {
                    missingP = T;
                }
                SubLObject cdolist_list_var = assertions_for_cnf;
                SubLObject assertion_for_cnf = NIL;
                assertion_for_cnf = cdolist_list_var.first();
                while (NIL != cdolist_list_var) {
                    final SubLObject assertion_tv = assertions_high.cyc_assertion_tv(assertion_for_cnf);
                    if ((((NIL != enumeration_types.tv_trueP(hl_tv)) && (NIL != enumeration_types.tv_unknownP(assertion_tv))) || ((NIL != enumeration_types.tv_trueP(hl_tv)) && (NIL != enumeration_types.tv_trueP(assertion_tv)))) || ((NIL != enumeration_types.tv_falseP(hl_tv)) && (NIL != enumeration_types.tv_falseP(assertion_tv)))) {
                        all_assertions = cons(assertion_for_cnf, all_assertions);
                    }
                    cdolist_list_var = cdolist_list_var.rest();
                    assertion_for_cnf = cdolist_list_var.first();
                } 
                cnf_tv = cnf_tv.rest();
                cnf_tv_$12 = cnf_tv.first();
                blist = blist.rest();
                blist_$13 = blist.first();
            } 
        }
        if (NIL == all_assertions) {
            missingP = T;
        }
        return values(nreverse(all_assertions), missingP);
    }

    public static SubLObject find_assertions_from_cnf(final SubLObject cnf, final SubLObject blist, final SubLObject mt, final SubLObject include_genl_mtsP) {
        SubLObject assertions_for_cnf = NIL;
        if (((NIL != clause_utilities.pos_atomic_cnf_p(cnf)) && (NIL != mt_designating_literalP(clause_utilities.atomic_cnf_asent(cnf)))) && (NIL != hlmt.hlmt_p(designated_mt(clause_utilities.atomic_cnf_asent(cnf))))) {
            final SubLObject new_assertions = find_assertions_from_mt_designating_literal(cnf, blist);
            assertions_for_cnf = nconc(assertions_for_cnf, new_assertions);
        }
        if (NIL != kb_accessors.decontextualized_atomic_cnfP(cnf)) {
            final SubLObject new_assertions = find_assertions_from_decontextualized_literal(cnf, mt);
            assertions_for_cnf = nconc(assertions_for_cnf, new_assertions);
        } else {
            final SubLObject new_assertions = (NIL != mt_relevance_macros.all_mts_are_relevantP()) ? kb_indexing.find_all_assertions(cnf) : NIL != include_genl_mtsP ? indexing_utilities.find_all_assertions_genl_mts(cnf, mt) : removal_module_utilities.non_null_answer_to_singleton(kb_indexing.find_assertion(cnf, mt));
            if (NIL != new_assertions) {
                assertions_for_cnf = nconc(assertions_for_cnf, new_assertions);
            }
        }
        return assertions_for_cnf;
    }

    public static SubLObject find_assertions_from_mt_designating_literal(final SubLObject cnf, final SubLObject blist) {
        final SubLObject asent = clause_utilities.atomic_cnf_asent(cnf);
        return find_kb_assertions(cycl_utilities.expression_sublis(list_utilities.flip_alist(blist), designated_sentence(asent), UNPROVIDED, UNPROVIDED), designated_mt(asent));
    }

    public static SubLObject find_assertions_from_decontextualized_literal(final SubLObject cnf, final SubLObject mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject new_assertions = NIL;
        if (NIL != czer_vars.$find_uncanonical_decontextualized_assertionsP$.getDynamicValue(thread)) {
            new_assertions = kb_indexing.find_all_assertions(cnf);
        } else {
            final SubLObject convention_mt = kb_accessors.possibly_convention_mt_for_decontextualized_cnf(mt, cnf);
            new_assertions = list(kb_indexing.find_assertion(cnf, convention_mt));
        }
        return new_assertions;
    }

    public static SubLObject canon_versions(final SubLObject sentence, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = mt_relevance_macros.$mt$.getDynamicValue();
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject canon_versions = NIL;
        final SubLObject _prev_bind_0 = at_vars.$noting_at_violationsP$.currentBinding(thread);
        final SubLObject _prev_bind_2 = at_vars.$accumulating_at_violationsP$.currentBinding(thread);
        final SubLObject _prev_bind_3 = wff_vars.$noting_wff_violationsP$.currentBinding(thread);
        final SubLObject _prev_bind_4 = wff_vars.$accumulating_wff_violationsP$.currentBinding(thread);
        final SubLObject _prev_bind_5 = $within_assert$.currentBinding(thread);
        final SubLObject _prev_bind_6 = $within_ask$.currentBinding(thread);
        try {
            at_vars.$noting_at_violationsP$.bind(NIL, thread);
            at_vars.$accumulating_at_violationsP$.bind(NIL, thread);
            wff_vars.$noting_wff_violationsP$.bind(NIL, thread);
            wff_vars.$accumulating_wff_violationsP$.bind(NIL, thread);
            $within_assert$.bind(NIL, thread);
            $within_ask$.bind(NIL, thread);
            canon_versions = czer_main.canonicalize_wf_cycl(sentence, mt);
        } finally {
            $within_ask$.rebind(_prev_bind_6, thread);
            $within_assert$.rebind(_prev_bind_5, thread);
            wff_vars.$accumulating_wff_violationsP$.rebind(_prev_bind_4, thread);
            wff_vars.$noting_wff_violationsP$.rebind(_prev_bind_3, thread);
            at_vars.$accumulating_at_violationsP$.rebind(_prev_bind_2, thread);
            at_vars.$noting_at_violationsP$.rebind(_prev_bind_0, thread);
        }
        return canon_versions;
    }

    public static SubLObject canon_versions_sentence(final SubLObject sentence, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = mt_relevance_macros.$mt$.getDynamicValue();
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject canon_versions = NIL;
        final SubLObject _prev_bind_0 = at_vars.$noting_at_violationsP$.currentBinding(thread);
        final SubLObject _prev_bind_2 = at_vars.$accumulating_at_violationsP$.currentBinding(thread);
        final SubLObject _prev_bind_3 = wff_vars.$noting_wff_violationsP$.currentBinding(thread);
        final SubLObject _prev_bind_4 = wff_vars.$accumulating_wff_violationsP$.currentBinding(thread);
        final SubLObject _prev_bind_5 = $within_assert$.currentBinding(thread);
        final SubLObject _prev_bind_6 = $within_ask$.currentBinding(thread);
        try {
            at_vars.$noting_at_violationsP$.bind(NIL, thread);
            at_vars.$accumulating_at_violationsP$.bind(NIL, thread);
            wff_vars.$noting_wff_violationsP$.bind(NIL, thread);
            wff_vars.$accumulating_wff_violationsP$.bind(NIL, thread);
            $within_assert$.bind(NIL, thread);
            $within_ask$.bind(NIL, thread);
            if (NIL == czer_vars.valid_tense_czer_mode_p($ASSERT)) {
                Errors.error($str22$Cannot_set_tense_czer_to_invalid_);
            }
            final SubLObject _prev_bind_0_$14 = czer_vars.$tense_czer_mode$.currentBinding(thread);
            try {
                czer_vars.$tense_czer_mode$.bind($ASSERT, thread);
                thread.resetMultipleValues();
                final SubLObject canon_versions_$15 = czer_main.canonicalize_wf_cycl_sentence(sentence, mt);
                final SubLObject mt_$16 = thread.secondMultipleValue();
                thread.resetMultipleValues();
                canon_versions = canon_versions_$15;
                mt = mt_$16;
            } finally {
                czer_vars.$tense_czer_mode$.rebind(_prev_bind_0_$14, thread);
            }
        } finally {
            $within_ask$.rebind(_prev_bind_6, thread);
            $within_assert$.rebind(_prev_bind_5, thread);
            wff_vars.$accumulating_wff_violationsP$.rebind(_prev_bind_4, thread);
            wff_vars.$noting_wff_violationsP$.rebind(_prev_bind_3, thread);
            at_vars.$accumulating_at_violationsP$.rebind(_prev_bind_2, thread);
            at_vars.$noting_at_violationsP$.rebind(_prev_bind_0, thread);
        }
        return values(canon_versions, mt);
    }

    public static SubLObject canon_cnfs(final SubLObject sentence, SubLObject canon_gafP, SubLObject mt) {
        if (canon_gafP == UNPROVIDED) {
            canon_gafP = NIL;
        }
        if (mt == UNPROVIDED) {
            mt = mt_relevance_macros.$mt$.getDynamicValue();
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject canon_versions = canon_versions(sentence, mt);
        final SubLObject blists = czer_utilities.extract_blists(canon_versions);
        SubLObject result = NIL;
        if (NIL != el_formula_p(canon_versions)) {
            SubLObject cdolist_list_var = canon_versions;
            SubLObject canon_version = NIL;
            canon_version = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                thread.resetMultipleValues();
                final SubLObject cnf = fi.fi_canonicalize(canon_version, canon_gafP, UNPROVIDED);
                final SubLObject v_variables = thread.secondMultipleValue();
                final SubLObject hl_tv = thread.thirdMultipleValue();
                thread.resetMultipleValues();
                if (NIL != canon_gafP) {
                    result = cons(cons(cnf, hl_tv), result);
                } else {
                    result = cons(cnf, result);
                }
                cdolist_list_var = cdolist_list_var.rest();
                canon_version = cdolist_list_var.first();
            } 
        }
        return values(nreverse(result), blists);
    }

    public static SubLObject canon_cnfs_sentence(final SubLObject sentence, SubLObject canon_gafP, SubLObject mt) {
        if (canon_gafP == UNPROVIDED) {
            canon_gafP = NIL;
        }
        if (mt == UNPROVIDED) {
            mt = mt_relevance_macros.$mt$.getDynamicValue();
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject canon_versions = NIL;
        thread.resetMultipleValues();
        final SubLObject canon_versions_$17 = canon_versions_sentence(sentence, mt);
        final SubLObject mt_$18 = thread.secondMultipleValue();
        thread.resetMultipleValues();
        canon_versions = canon_versions_$17;
        mt = mt_$18;
        final SubLObject blists = czer_utilities.extract_blists(canon_versions);
        SubLObject result = NIL;
        if (NIL != el_formula_p(canon_versions)) {
            SubLObject cdolist_list_var = canon_versions;
            SubLObject canon_version = NIL;
            canon_version = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                thread.resetMultipleValues();
                final SubLObject cnf = fi.fi_canonicalize(canon_version, canon_gafP, UNPROVIDED);
                final SubLObject v_variables = thread.secondMultipleValue();
                final SubLObject hl_tv = thread.thirdMultipleValue();
                thread.resetMultipleValues();
                if (NIL != canon_gafP) {
                    result = cons(cons(cnf, hl_tv), result);
                } else {
                    result = cons(cnf, result);
                }
                cdolist_list_var = cdolist_list_var.rest();
                canon_version = cdolist_list_var.first();
            } 
        }
        return values(nreverse(result), blists, mt);
    }

    public static SubLObject canonicalize_meta_clauses(final SubLObject v_clauses) {
        if ($$True.eql(v_clauses)) {
            return v_clauses;
        }
        if ($$False.eql(v_clauses)) {
            return v_clauses;
        }
        SubLObject result = NIL;
        SubLObject cdolist_list_var = v_clauses;
        SubLObject clause = NIL;
        clause = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if (NIL != distributing_meta_proposition_clauseP(clause)) {
                result = nconc(express_as_distributed_meta_proposition(clause), result);
            } else
                if (NIL != meta_proposition_clauseP(clause)) {
                    result = cons(express_as_meta_proposition(clause), result);
                } else {
                    result = cons(clause, result);
                }

            cdolist_list_var = cdolist_list_var.rest();
            clause = cdolist_list_var.first();
        } 
        return nreverse(result);
    }

    public static SubLObject express_as_meta_proposition(final SubLObject clause) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != $within_ask$.getDynamicValue(thread)) {
            return transform_delta(clause, symbol_function($sym25$EL_META_FORMULA_), symbol_function(EXPRESS_AS_META_FORMULA), symbol_function(EQUAL), UNPROVIDED);
        }
        return transform_list_utilities.quiescent_transform(clause, symbol_function($sym27$GROUND_EL_META_FORMULA_), symbol_function(EXPRESS_AS_META_FORMULA), UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject transform_delta(final SubLObject v_object, final SubLObject pred, final SubLObject transform, SubLObject test, SubLObject key) {
        if (test == UNPROVIDED) {
            test = symbol_function(EQL);
        }
        if (key == UNPROVIDED) {
            key = symbol_function(IDENTITY);
        }
        return ntransform_delta(copy_tree(v_object), pred, transform, test, key);
    }

    public static SubLObject ntransform_delta(final SubLObject v_object, final SubLObject pred, final SubLObject transform, SubLObject test, SubLObject key) {
        if (test == UNPROVIDED) {
            test = symbol_function(EQL);
        }
        if (key == UNPROVIDED) {
            key = symbol_function(IDENTITY);
        }
        if (NIL == funcall(pred, v_object)) {
            return ntransform_delta_int(v_object, pred, transform, test, key);
        }
        final SubLObject new_object = funcall(transform, funcall(key, v_object));
        if (NIL != funcall(test, v_object, new_object)) {
            return ntransform_delta_int(v_object, pred, transform, test, key);
        }
        return ntransform_delta(copy_tree(new_object), pred, transform, test, key);
    }

    public static SubLObject ntransform_delta_int(final SubLObject v_object, final SubLObject pred, final SubLObject transform, SubLObject test, SubLObject key) {
        if (test == UNPROVIDED) {
            test = symbol_function(EQL);
        }
        if (key == UNPROVIDED) {
            key = symbol_function(IDENTITY);
        }
        if (v_object.isAtom()) {
            return v_object;
        }
        SubLObject list;
        for (list = NIL, list = v_object; list.rest().isCons(); list = list.rest()) {
            rplaca(list, ntransform_delta(list.first(), pred, transform, test, key));
        }
        rplaca(list, ntransform_delta(list.first(), pred, transform, test, key));
        if (NIL != list.rest()) {
            rplacd(list, ntransform_delta(list.rest(), pred, transform, test, key));
        }
        return v_object;
    }

    public static SubLObject express_as_meta_formula(final SubLObject formula) {
        if (NIL != assertion_handles.assertion_p(formula)) {
            return formula;
        }
        if (NIL != el_formula_p(formula)) {
            return express_as_meta_formula_int(formula, T);
        }
        return NIL;
    }

    public static SubLObject meta_assertion_formulas(final SubLObject formula) {
        return express_as_meta_formula_int(formula, NIL);
    }

    public static SubLObject express_as_meta_formula_int(final SubLObject formula, final SubLObject find_assertionsP) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject n = ZERO_INTEGER;
        final SubLObject meta_relation = cycl_utilities.formula_arg0(formula);
        SubLObject terms = NIL;
        SubLObject meta_terms = NIL;
        SubLObject cdolist_list_var = cycl_utilities.formula_args(formula, UNPROVIDED);
        SubLObject v_term = NIL;
        v_term = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            n = add(n, ONE_INTEGER);
            if (NIL != possibly_meta_argP(meta_relation, n, UNPROVIDED)) {
                if (NIL != mt_designating_formulaP(v_term)) {
                    if (NIL != find_assertionsP) {
                        final SubLObject mt = designated_mt(v_term);
                        final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
                        try {
                            mt_relevance_macros.$mt$.bind(NIL != hlmt.closed_possibly_hlmt_p(mt) ? mt : mt_relevance_macros.$mt$.getDynamicValue(thread), thread);
                            terms = cons(find_unique_assertion_cycl(designated_sentence(v_term), UNPROVIDED), terms);
                        } finally {
                            mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
                        }
                    } else {
                        meta_terms = cons(designated_sentence(v_term), meta_terms);
                    }
                } else
                    if (NIL != cycl_variables.cyc_varP(v_term)) {
                        terms = cons(v_term, terms);
                    } else
                        if (NIL != find_assertionsP) {
                            final SubLObject assertion = find_unique_assertion_cycl(v_term, UNPROVIDED);
                            if (NIL != term.kb_assertionP(assertion)) {
                                terms = cons(assertion, terms);
                            } else {
                                el_error(THREE_INTEGER, $str28$invalid_meta_arg___s, v_term, UNPROVIDED, UNPROVIDED);
                                terms = cons(v_term, terms);
                            }
                        } else {
                            meta_terms = cons(v_term, meta_terms);
                        }


            } else {
                terms = cons(v_term, terms);
            }
            cdolist_list_var = cdolist_list_var.rest();
            v_term = cdolist_list_var.first();
        } 
        return NIL != find_assertionsP ? make_formula(meta_relation, nreverse(terms), UNPROVIDED) : nreverse(meta_terms);
    }

    public static SubLObject express_as_distributed_meta_proposition(final SubLObject clause) {
        final SubLObject asent = clauses.pos_lits(clause).first();
        return express_asent_as_distributed_meta_proposition(asent);
    }

    public static SubLObject express_asent_as_distributed_meta_proposition(final SubLObject asent) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = NIL;
        if (NIL != ist_sentence_p(asent, UNPROVIDED)) {
            if (NIL != hlmt.hlmt_p(designated_mt(asent))) {
                final SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate(designated_mt(asent));
                final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
                final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
                try {
                    mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
                    mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
                    mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
                    result = express_asent_as_distributed_meta_proposition(designated_sentence(asent));
                } finally {
                    mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_3, thread);
                    mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_2, thread);
                    mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
                }
            } else {
                result = clause_utilities.make_gaf_cnf(asent);
            }
        } else {
            final SubLObject meta_pred = cycl_utilities.atomic_sentence_predicate(asent);
            SubLObject n = ZERO_INTEGER;
            SubLObject terms = NIL;
            SubLObject cdolist_list_var = cycl_utilities.atomic_sentence_args(asent, $IGNORE);
            SubLObject v_term = NIL;
            v_term = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                n = add(n, ONE_INTEGER);
                if (NIL != czer_utilities.possibly_assertion_argP(meta_pred, n, UNPROVIDED)) {
                    final SubLObject assertions = find_kb_assertions(v_term, UNPROVIDED);
                    if (NIL != assertions) {
                        terms = cons(assertions, terms);
                    } else {
                        terms = cons(list(v_term), terms);
                    }
                } else {
                    terms = cons(list(v_term), terms);
                }
                cdolist_list_var = cdolist_list_var.rest();
                v_term = cdolist_list_var.first();
            } 
            cdolist_list_var = list_utilities.cross_products(cons(list(meta_pred), nreverse(terms)));
            SubLObject pos_lit = NIL;
            pos_lit = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                result = cons(clauses.make_cnf(NIL, list(pos_lit)), result);
                cdolist_list_var = cdolist_list_var.rest();
                pos_lit = cdolist_list_var.first();
            } 
        }
        return result;
    }

    public static SubLObject meta_proposition_clauseP(final SubLObject clause) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject cdolist_list_var = clauses.neg_lits(clause);
        SubLObject asent = NIL;
        asent = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if (NIL != contains_subformula_p(asent)) {
                if (NIL != $within_ask$.getDynamicValue(thread)) {
                    if (NIL != cycl_utilities.expression_find_if($sym25$EL_META_FORMULA_, asent, UNPROVIDED, UNPROVIDED)) {
                        return T;
                    }
                } else
                    if (NIL != cycl_utilities.expression_find_if($sym27$GROUND_EL_META_FORMULA_, asent, UNPROVIDED, UNPROVIDED)) {
                        return T;
                    }

            }
            cdolist_list_var = cdolist_list_var.rest();
            asent = cdolist_list_var.first();
        } 
        cdolist_list_var = clauses.pos_lits(clause);
        asent = NIL;
        asent = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if (NIL != contains_subformula_p(asent)) {
                if (NIL != $within_ask$.getDynamicValue(thread)) {
                    if (NIL != cycl_utilities.expression_find_if($sym25$EL_META_FORMULA_, asent, UNPROVIDED, UNPROVIDED)) {
                        return T;
                    }
                } else
                    if (NIL != cycl_utilities.expression_find_if($sym27$GROUND_EL_META_FORMULA_, asent, UNPROVIDED, UNPROVIDED)) {
                        return T;
                    }

            }
            cdolist_list_var = cdolist_list_var.rest();
            asent = cdolist_list_var.first();
        } 
        return NIL;
    }

    public static SubLObject distributing_meta_proposition_clauseP(final SubLObject clause) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL == clauses.neg_lits(clause)) {
            final SubLObject pos_lits = clauses.pos_lits(clause);
            final SubLObject literal = pos_lits.first();
            if (NIL != list_utilities.singletonP(pos_lits)) {
                return makeBoolean((NIL != meta_literalP(literal, mt_relevance_macros.$mt$.getDynamicValue(thread))) && (NIL != distributing_meta_literalP(literal)));
            }
        }
        return NIL;
    }

    public static SubLObject distributing_meta_literalP(final SubLObject literal) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if ((NIL != contains_subformula_p(literal)) && (NIL != literalP(literal))) {
            return makeBoolean(((NIL != czer_utilities.distributing_meta_predP(literal_arg0(literal, UNPROVIDED))) || (NIL != distributing_meta_mt_literalP(literal))) || ((NIL != czer_vars.$distribute_meta_over_common_elP$.getDynamicValue(thread)) && (NIL != meta_args_have_common_el_sentencesP(literal, UNPROVIDED))));
        }
        return NIL;
    }

    public static SubLObject distributing_meta_mt_literalP(final SubLObject literal) {
        return makeBoolean(((NIL != mt_designating_literalP(literal)) && (NIL != hlmt.hlmt_p(literal_arg1(literal, UNPROVIDED)))) && (NIL != distributing_meta_literalP(literal_arg2(literal, UNPROVIDED))));
    }

    public static SubLObject meta_mt_literalP(final SubLObject literal) {
        return makeBoolean(((NIL != mt_designating_literalP(literal)) && (NIL != hlmt.hlmt_p(designated_mt(literal)))) && (NIL != meta_literalP(designated_sentence(literal), designated_mt(literal))));
    }

    public static SubLObject meta_mt_formulaP(final SubLObject formula) {
        return makeBoolean(((NIL != mt_designating_formulaP(formula)) && (NIL != hlmt.hlmt_p(designated_mt(formula)))) && (NIL != meta_formulaP(designated_sentence(formula), designated_mt(formula))));
    }

    public static SubLObject meta_literalP(final SubLObject literal, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject meta_literalP = makeBoolean((NIL != contains_subformula_p(literal)) && (NIL != meta_mt_literalP(literal)));
        if ((NIL == meta_literalP) && (NIL != hlmt.hlmt_p(mt))) {
            final SubLObject _prev_bind_0 = wff_vars.$wff_violations$.currentBinding(thread);
            try {
                wff_vars.$wff_violations$.bind(NIL, thread);
                meta_literalP = makeBoolean(((NIL != literalP(literal)) && (NIL != possibly_meta_predicateP(literal_arg0(literal, UNPROVIDED), mt))) && (NIL != meta_args_wffP(literal, mt, UNPROVIDED)));
            } finally {
                wff_vars.$wff_violations$.rebind(_prev_bind_0, thread);
            }
        }
        return meta_literalP;
    }

    public static SubLObject meta_formulaP(final SubLObject formula, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject meta_formulaP = meta_mt_formulaP(formula);
        if ((NIL == meta_formulaP) && (NIL != hlmt.hlmt_p(mt))) {
            final SubLObject _prev_bind_0 = wff_vars.$wff_violations$.currentBinding(thread);
            try {
                wff_vars.$wff_violations$.bind(NIL, thread);
                meta_formulaP = makeBoolean((NIL != possibly_meta_relationP(cycl_utilities.formula_operator(formula), mt)) && (NIL != meta_args_wffP(formula, mt, UNPROVIDED)));
            } finally {
                wff_vars.$wff_violations$.rebind(_prev_bind_0, thread);
            }
        }
        return meta_formulaP;
    }

    public static SubLObject meta_args_wffP(final SubLObject literal, SubLObject mt, SubLObject varP) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (varP == UNPROVIDED) {
            varP = symbol_function($sym0$EL_VAR_);
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject not_wffP = NIL;
        final SubLObject n = ZERO_INTEGER;
        final SubLObject meta_pred = literal_predicate(literal, UNPROVIDED);
        SubLObject n_$19 = ZERO_INTEGER;
        final SubLObject args = cycl_utilities.formula_args(literal_atomic_sentence(literal), $IGNORE);
        SubLObject rest;
        SubLObject arg;
        for (rest = NIL, rest = args; (NIL == not_wffP) && (NIL != rest); rest = rest.rest()) {
            arg = rest.first();
            n_$19 = add(n_$19, ONE_INTEGER);
            if (NIL != definitely_meta_argP(meta_pred, n_$19, mt)) {
                if (NIL == findable_assertion_argP(meta_pred, arg, mt, varP)) {
                    not_wffP = T;
                }
            } else
                if (((NIL != possibly_but_not_definitely_meta_argP(meta_pred, n_$19, mt)) && (NIL == findable_assertion_argP(meta_pred, arg, mt, varP))) && (NIL == at_admitted.admitted_argumentP(arg, n_$19, meta_pred, mt))) {
                    not_wffP = T;
                }

        }
        if ((NIL != not_wffP) && (NIL != czer_vars.$noting_ill_formed_meta_argsP$.getDynamicValue(thread))) {
            czer_vars.$recan_ill_formed_meta_argsP$.setDynamicValue(definitely_meta_argP(meta_pred, n, mt), thread);
        }
        return makeBoolean(NIL == not_wffP);
    }

    public static SubLObject findable_assertion_argP(final SubLObject meta_pred, final SubLObject arg, final SubLObject mt, final SubLObject varP) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return makeBoolean((((NIL != funcall(varP, arg)) || (NIL != term.kb_assertionP(arg))) || (NIL != find_unique_assertion_cycl(arg, mt))) || ((NIL != all_kb_assertions_findableP(arg, mt)) && ((NIL != czer_utilities.distributing_meta_predP(meta_pred)) || ((NIL != czer_vars.$distribute_meta_over_common_elP$.getDynamicValue(thread)) && (NIL != common_el_sentencesP(find_kb_assertions(arg, UNPROVIDED)))))));
    }

    public static SubLObject meta_args_have_common_el_sentencesP(final SubLObject literal, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        SubLObject uncommonP = numE(literal_arity(literal, $IGNORE), ZERO_INTEGER);
        SubLObject vacuousP = T;
        final SubLObject meta_pred = literal_arg0(literal, UNPROVIDED);
        SubLObject argnum = ZERO_INTEGER;
        final SubLObject args = cycl_utilities.formula_args(literal, $IGNORE);
        SubLObject rest;
        SubLObject arg;
        for (rest = NIL, rest = args; (NIL == uncommonP) && (NIL != rest); rest = rest.rest()) {
            arg = rest.first();
            argnum = add(argnum, ONE_INTEGER);
            if (NIL != possibly_meta_argP(meta_pred, argnum, mt)) {
                vacuousP = NIL;
                uncommonP = makeBoolean(NIL == common_el_sentencesP(find_kb_assertions(arg, UNPROVIDED)));
            }
        }
        return makeBoolean((NIL == vacuousP) && (NIL == uncommonP));
    }

    public static SubLObject el_meta_formulaP(final SubLObject formula, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = mt_relevance_macros.$mt$.getDynamicValue();
        }
        if (NIL != meta_formulaP(formula, mt)) {
            return makeBoolean(NIL == find_if(symbol_function($sym30$KB_ASSERTION_), cycl_utilities.formula_args(formula, UNPROVIDED), UNPROVIDED, UNPROVIDED, UNPROVIDED));
        }
        return NIL;
    }

    public static SubLObject ground_meta_formulaP(final SubLObject formula, SubLObject mt, SubLObject varP) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (varP == UNPROVIDED) {
            varP = symbol_function($sym0$EL_VAR_);
        }
        if (NIL != meta_formulaP(formula, mt)) {
            return makeBoolean(NIL == find_if(varP, cycl_utilities.formula_args(formula, $REGULARIZE), UNPROVIDED, UNPROVIDED, UNPROVIDED));
        }
        return NIL;
    }

    public static SubLObject ground_el_meta_formulaP(final SubLObject formula, SubLObject mt, SubLObject varP) {
        if (mt == UNPROVIDED) {
            mt = mt_relevance_macros.$mt$.getDynamicValue();
        }
        if (varP == UNPROVIDED) {
            varP = symbol_function($sym0$EL_VAR_);
        }
        if (NIL != ground_meta_formulaP(formula, mt, varP)) {
            return makeBoolean(NIL == find_if(symbol_function($sym30$KB_ASSERTION_), cycl_utilities.formula_args(formula, UNPROVIDED), UNPROVIDED, UNPROVIDED, UNPROVIDED));
        }
        return NIL;
    }

    public static SubLObject declare_czer_meta_file() {
        declareFunction(me, "has_exceptionP", "HAS-EXCEPTION?", 1, 0, false);
        declareFunction(me, "accessible_kb_assertions", "ACCESSIBLE-KB-ASSERTIONS", 1, 1, false);
        declareFunction(me, "accessible_kb_assertionsP", "ACCESSIBLE-KB-ASSERTIONS?", 1, 1, false);
        declareFunction(me, "accessible_assertions_cycl", "ACCESSIBLE-ASSERTIONS-CYCL", 1, 1, false);
        declareFunction(me, "kb_versions", "KB-VERSIONS", 1, 1, false);
        declareFunction(me, "literal_meta_args", "LITERAL-META-ARGS", 1, 1, false);
        declareFunction(me, "el_assertion_specP", "EL-ASSERTION-SPEC?", 1, 1, false);
        declareFunction(me, "el_gaf_assertion_specP", "EL-GAF-ASSERTION-SPEC?", 1, 1, false);
        declareFunction(me, "el_rule_assertion_specP", "EL-RULE-ASSERTION-SPEC?", 1, 1, false);
        declareFunction(me, "el_asserted_assertion_specP", "EL-ASSERTED-ASSERTION-SPEC?", 1, 1, false);
        declareFunction(me, "el_deduced_assertion_specP", "EL-DEDUCED-ASSERTION-SPEC?", 1, 1, false);
        declareFunction(me, "el_constrained_assertion_specP", "EL-CONSTRAINED-ASSERTION-SPEC?", 2, 1, false);
        declareFunction(me, "el_nl_semantic_assertion_specP", "EL-NL-SEMANTIC-ASSERTION-SPEC?", 1, 1, false);
        declareFunction(me, "common_el_sentencesP", "COMMON-EL-SENTENCES?", 1, 0, false);
        declareFunction(me, "meta_predicateP", "META-PREDICATE?", 1, 1, false);
        declareFunction(me, "meta_relationP", "META-RELATION?", 1, 1, false);
        declareFunction(me, "clear_meta_relation_somewhereP", "CLEAR-META-RELATION-SOMEWHERE?", 0, 0, false);
        new czer_meta.$clear_meta_relation_somewhereP$ZeroArityFunction();
        declareFunction(me, "remove_meta_relation_somewhereP", "REMOVE-META-RELATION-SOMEWHERE?", 1, 0, false);
        declareFunction(me, "meta_relation_somewhereP_internal", "META-RELATION-SOMEWHERE?-INTERNAL", 1, 0, false);
        declareFunction(me, "meta_relation_somewhereP", "META-RELATION-SOMEWHERE?", 1, 0, false);
        declareFunction(me, "meta_relation_intP", "META-RELATION-INT?", 1, 1, false);
        declareFunction(me, "sentence_with_meta_predicateP", "SENTENCE-WITH-META-PREDICATE?", 1, 1, false);
        declareFunction(me, "sentence_with_meta_relationP", "SENTENCE-WITH-META-RELATION?", 1, 1, false);
        declareFunction(me, "possibly_meta_predicateP", "POSSIBLY-META-PREDICATE?", 1, 1, false);
        declareFunction(me, "possibly_meta_relationP", "POSSIBLY-META-RELATION?", 1, 1, false);
        declareFunction(me, "possibly_meta_relation_somewhereP", "POSSIBLY-META-RELATION-SOMEWHERE?", 1, 0, false);
        declareFunction(me, "clear_possibly_meta_relation_somewhereP_cached", "CLEAR-POSSIBLY-META-RELATION-SOMEWHERE?-CACHED", 0, 0, false);
        new czer_meta.$clear_possibly_meta_relation_somewhereP_cached$ZeroArityFunction();
        declareFunction(me, "remove_possibly_meta_relation_somewhereP_cached", "REMOVE-POSSIBLY-META-RELATION-SOMEWHERE?-CACHED", 1, 0, false);
        declareFunction(me, "possibly_meta_relation_somewhereP_cached_internal", "POSSIBLY-META-RELATION-SOMEWHERE?-CACHED-INTERNAL", 1, 0, false);
        declareFunction(me, "possibly_meta_relation_somewhereP_cached", "POSSIBLY-META-RELATION-SOMEWHERE?-CACHED", 1, 0, false);
        declareFunction(me, "possibly_meta_relation_intP", "POSSIBLY-META-RELATION-INT?", 1, 1, false);
        declareFunction(me, "sentence_with_possibly_meta_predicateP", "SENTENCE-WITH-POSSIBLY-META-PREDICATE?", 1, 1, false);
        declareFunction(me, "sentence_with_possibly_meta_relationP", "SENTENCE-WITH-POSSIBLY-META-RELATION?", 1, 1, false);
        declareFunction(me, "possibly_meta_argP", "POSSIBLY-META-ARG?", 2, 1, false);
        declareFunction(me, "possibly_but_not_definitely_meta_argP", "POSSIBLY-BUT-NOT-DEFINITELY-META-ARG?", 2, 1, false);
        declareFunction(me, "definitely_meta_argP", "DEFINITELY-META-ARG?", 2, 1, false);
        declareFunction(me, "find_assertion_cycl", "FIND-ASSERTION-CYCL", 1, 1, false);
        declareFunction(me, "find_unique_assertion_cycl", "FIND-UNIQUE-ASSERTION-CYCL", 1, 1, false);
        declareFunction(me, "find_visible_assertion_cycl", "FIND-VISIBLE-ASSERTION-CYCL", 1, 1, false);
        declareFunction(me, "find_kb_assertions", "FIND-KB-ASSERTIONS", 1, 1, false);
        declareFunction(me, "find_visible_kb_assertions", "FIND-VISIBLE-KB-ASSERTIONS", 1, 1, false);
        declareFunction(me, "find_visible_sibling_mt_assertions", "FIND-VISIBLE-SIBLING-MT-ASSERTIONS", 1, 0, false);
        declareFunction(me, "find_some_assertion_cycl", "FIND-SOME-ASSERTION-CYCL", 1, 1, false);
        declareFunction(me, "all_kb_assertions_findableP", "ALL-KB-ASSERTIONS-FINDABLE?", 1, 1, false);
        declareFunction(me, "recanonicalized_candidate_assertion_equals_cnfP", "RECANONICALIZED-CANDIDATE-ASSERTION-EQUALS-CNF?", 2, 0, false);
        declareFunction(me, "recanonicalized_candidate_assertion_equals_gafP", "RECANONICALIZED-CANDIDATE-ASSERTION-EQUALS-GAF?", 2, 0, false);
        declareFunction(me, "recanonicalize_candidate_assertion", "RECANONICALIZE-CANDIDATE-ASSERTION", 0, 0, false);
        declareFunction(me, "candidate_assertion_el_formula", "CANDIDATE-ASSERTION-EL-FORMULA", 0, 0, false);
        declareFunction(me, "candidate_assertion_fi_formula", "CANDIDATE-ASSERTION-FI-FORMULA", 0, 0, false);
        declareFunction(me, "robust_assertion_lookupP", "ROBUST-ASSERTION-LOOKUP?", 0, 0, false);
        declareFunction(me, "find_assertions_cycl_in_mt", "FIND-ASSERTIONS-CYCL-IN-MT", 3, 0, false);
        declareFunction(me, "find_assertions_cycl", "FIND-ASSERTIONS-CYCL", 1, 1, false);
        declareFunction(me, "find_visible_assertions_cycl", "FIND-VISIBLE-ASSERTIONS-CYCL", 1, 1, false);
        declareFunction(me, "clear_cached_find_assertions_cycl", "CLEAR-CACHED-FIND-ASSERTIONS-CYCL", 0, 0, false);
        declareFunction(me, "remove_cached_find_assertions_cycl", "REMOVE-CACHED-FIND-ASSERTIONS-CYCL", 3, 0, false);
        declareFunction(me, "cached_find_assertions_cycl_internal", "CACHED-FIND-ASSERTIONS-CYCL-INTERNAL", 3, 0, false);
        declareFunction(me, "cached_find_assertions_cycl", "CACHED-FIND-ASSERTIONS-CYCL", 3, 0, false);
        declareFunction(me, "find_assertions_cycl_int", "FIND-ASSERTIONS-CYCL-INT", 3, 0, false);
        declareFunction(me, "find_assertions_cycl_int_2", "FIND-ASSERTIONS-CYCL-INT-2", 3, 0, false);
        declareFunction(me, "find_assertions_from_cnf", "FIND-ASSERTIONS-FROM-CNF", 4, 0, false);
        declareFunction(me, "find_assertions_from_mt_designating_literal", "FIND-ASSERTIONS-FROM-MT-DESIGNATING-LITERAL", 2, 0, false);
        declareFunction(me, "find_assertions_from_decontextualized_literal", "FIND-ASSERTIONS-FROM-DECONTEXTUALIZED-LITERAL", 2, 0, false);
        declareFunction(me, "canon_versions", "CANON-VERSIONS", 1, 1, false);
        declareFunction(me, "canon_versions_sentence", "CANON-VERSIONS-SENTENCE", 1, 1, false);
        declareFunction(me, "canon_cnfs", "CANON-CNFS", 1, 2, false);
        declareFunction(me, "canon_cnfs_sentence", "CANON-CNFS-SENTENCE", 1, 2, false);
        declareFunction(me, "canonicalize_meta_clauses", "CANONICALIZE-META-CLAUSES", 1, 0, false);
        declareFunction(me, "express_as_meta_proposition", "EXPRESS-AS-META-PROPOSITION", 1, 0, false);
        declareFunction(me, "transform_delta", "TRANSFORM-DELTA", 3, 2, false);
        declareFunction(me, "ntransform_delta", "NTRANSFORM-DELTA", 3, 2, false);
        declareFunction(me, "ntransform_delta_int", "NTRANSFORM-DELTA-INT", 3, 2, false);
        declareFunction(me, "express_as_meta_formula", "EXPRESS-AS-META-FORMULA", 1, 0, false);
        declareFunction(me, "meta_assertion_formulas", "META-ASSERTION-FORMULAS", 1, 0, false);
        declareFunction(me, "express_as_meta_formula_int", "EXPRESS-AS-META-FORMULA-INT", 2, 0, false);
        declareFunction(me, "express_as_distributed_meta_proposition", "EXPRESS-AS-DISTRIBUTED-META-PROPOSITION", 1, 0, false);
        declareFunction(me, "express_asent_as_distributed_meta_proposition", "EXPRESS-ASENT-AS-DISTRIBUTED-META-PROPOSITION", 1, 0, false);
        declareFunction(me, "meta_proposition_clauseP", "META-PROPOSITION-CLAUSE?", 1, 0, false);
        declareFunction(me, "distributing_meta_proposition_clauseP", "DISTRIBUTING-META-PROPOSITION-CLAUSE?", 1, 0, false);
        declareFunction(me, "distributing_meta_literalP", "DISTRIBUTING-META-LITERAL?", 1, 0, false);
        declareFunction(me, "distributing_meta_mt_literalP", "DISTRIBUTING-META-MT-LITERAL?", 1, 0, false);
        declareFunction(me, "meta_mt_literalP", "META-MT-LITERAL?", 1, 0, false);
        declareFunction(me, "meta_mt_formulaP", "META-MT-FORMULA?", 1, 0, false);
        declareFunction(me, "meta_literalP", "META-LITERAL?", 1, 1, false);
        declareFunction(me, "meta_formulaP", "META-FORMULA?", 1, 1, false);
        declareFunction(me, "meta_args_wffP", "META-ARGS-WFF?", 1, 2, false);
        declareFunction(me, "findable_assertion_argP", "FINDABLE-ASSERTION-ARG?", 4, 0, false);
        declareFunction(me, "meta_args_have_common_el_sentencesP", "META-ARGS-HAVE-COMMON-EL-SENTENCES?", 1, 1, false);
        declareFunction(me, "el_meta_formulaP", "EL-META-FORMULA?", 1, 1, false);
        new czer_meta.$el_meta_formulaP$UnaryFunction();
        new czer_meta.$el_meta_formulaP$BinaryFunction();
        declareFunction(me, "ground_meta_formulaP", "GROUND-META-FORMULA?", 1, 2, false);
        declareFunction(me, "ground_el_meta_formulaP", "GROUND-EL-META-FORMULA?", 1, 2, false);
        new czer_meta.$ground_el_meta_formulaP$UnaryFunction();
        new czer_meta.$ground_el_meta_formulaP$BinaryFunction();
        return NIL;
    }

    public static SubLObject init_czer_meta_file() {
        deflexical("*META-RELATION-SOMEWHERE?-CACHING-STATE*", NIL);
        deflexical("*POSSIBLY-META-RELATION-SOMEWHERE?-CACHED-CACHING-STATE*", NIL);
        deflexical("*CACHED-FIND-ASSERTIONS-CYCL-CACHING-STATE*", NIL);
        return NIL;
    }

    public static SubLObject setup_czer_meta_file() {
        memoization_state.note_globally_cached_function($sym7$META_RELATION_SOMEWHERE_);
        memoization_state.note_globally_cached_function($sym12$POSSIBLY_META_RELATION_SOMEWHERE__CACHED);
        memoization_state.note_globally_cached_function(CACHED_FIND_ASSERTIONS_CYCL);
        return NIL;
    }

    @Override
    public void declareFunctions() {
        declare_czer_meta_file();
    }

    @Override
    public void initializeVariables() {
        init_czer_meta_file();
    }

    @Override
    public void runTopLevelForms() {
        setup_czer_meta_file();
    }

    

    public static final class $clear_meta_relation_somewhereP$ZeroArityFunction extends ZeroArityFunction {
        public $clear_meta_relation_somewhereP$ZeroArityFunction() {
            super(extractFunctionNamed("CLEAR-META-RELATION-SOMEWHERE?"));
        }

        @Override
        public SubLObject processItem() {
            return clear_meta_relation_somewhereP();
        }
    }

    public static final class $clear_possibly_meta_relation_somewhereP_cached$ZeroArityFunction extends ZeroArityFunction {
        public $clear_possibly_meta_relation_somewhereP_cached$ZeroArityFunction() {
            super(extractFunctionNamed("CLEAR-POSSIBLY-META-RELATION-SOMEWHERE?-CACHED"));
        }

        @Override
        public SubLObject processItem() {
            return clear_possibly_meta_relation_somewhereP_cached();
        }
    }

    public static final class $el_meta_formulaP$UnaryFunction extends UnaryFunction {
        public $el_meta_formulaP$UnaryFunction() {
            super(extractFunctionNamed("EL-META-FORMULA?"));
        }

        @Override
        public SubLObject processItem(final SubLObject arg1) {
            return el_meta_formulaP(arg1, czer_meta.$el_meta_formulaP$UnaryFunction.UNPROVIDED);
        }
    }

    public static final class $el_meta_formulaP$BinaryFunction extends BinaryFunction {
        public $el_meta_formulaP$BinaryFunction() {
            super(extractFunctionNamed("EL-META-FORMULA?"));
        }

        @Override
        public SubLObject processItem(final SubLObject arg1, final SubLObject arg2) {
            return el_meta_formulaP(arg1, arg2);
        }
    }

    public static final class $ground_el_meta_formulaP$UnaryFunction extends UnaryFunction {
        public $ground_el_meta_formulaP$UnaryFunction() {
            super(extractFunctionNamed("GROUND-EL-META-FORMULA?"));
        }

        @Override
        public SubLObject processItem(final SubLObject arg1) {
            return ground_el_meta_formulaP(arg1, czer_meta.$ground_el_meta_formulaP$UnaryFunction.UNPROVIDED, czer_meta.$ground_el_meta_formulaP$UnaryFunction.UNPROVIDED);
        }
    }

    public static final class $ground_el_meta_formulaP$BinaryFunction extends BinaryFunction {
        public $ground_el_meta_formulaP$BinaryFunction() {
            super(extractFunctionNamed("GROUND-EL-META-FORMULA?"));
        }

        @Override
        public SubLObject processItem(final SubLObject arg1, final SubLObject arg2) {
            return ground_el_meta_formulaP(arg1, arg2, czer_meta.$ground_el_meta_formulaP$BinaryFunction.UNPROVIDED);
        }
    }
}

/**
 * Total time: 485 ms
 */
