package com.cyc.cycjava.cycl.inference.harness;


import static com.cyc.cycjava.cycl.control_vars.$inference_debugP$;
import static com.cyc.cycjava.cycl.control_vars.$removal_cost_cutoff$;
import static com.cyc.cycjava.cycl.el_utilities.possibly_inference_sentence_p;
import static com.cyc.cycjava.cycl.subl_macro_promotions.$with_timeout_nesting_depth$;
import static com.cyc.cycjava.cycl.subl_macro_promotions.$within_with_timeout$;
import static com.cyc.cycjava.cycl.subl_macro_promotions.with_timeout_make_tag;
import static com.cyc.cycjava.cycl.subl_macro_promotions.with_timeout_start_timer;
import static com.cyc.cycjava.cycl.subl_macro_promotions.with_timeout_stop_timer;
import static com.cyc.cycjava.cycl.utilities_macros.convert_process_resource_tracking_timing_info_to_seconds;
import static com.cyc.cycjava.cycl.utilities_macros.nadd_clock_time_to_process_resource_timing_info;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.cons;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.list;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.rplaca;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.add;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.divide;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.subtract;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.nreverse;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.symbol_function;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads.$is_thread_performing_cleanupP$;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Time.compute_with_process_resource_tracking_results;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Time.get_internal_real_time;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types.listp;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.getValuesAsVector;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.restoreValuesFromVector;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.values;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeBoolean;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeKeyword;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeString;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeSymbol;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.cdestructuring_bind_error;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.destructuring_bind_must_consp;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.cadr;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.cddr;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.copy_list;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.getf;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.putf;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.remf;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.second;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.set_difference;
import static com.cyc.tool.subl.util.SubLFiles.declareFunction;
import static com.cyc.tool.subl.util.SubLFiles.deflexical;
import static com.cyc.tool.subl.util.SubLFiles.defparameter;

import com.cyc.cycjava.cycl.backward;
import com.cyc.cycjava.cycl.bindings;
import com.cyc.cycjava.cycl.clause_utilities;
import com.cyc.cycjava.cycl.clauses;
import com.cyc.cycjava.cycl.czer_vars;
import com.cyc.cycjava.cycl.hlmt;
import com.cyc.cycjava.cycl.list_utilities;
import com.cyc.cycjava.cycl.memoization_state;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.time_high;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLSystemTrampolineFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;


public final class inference_trivial extends SubLTranslatedFile {
    public static final SubLFile me = new inference_trivial();

    public static final String myName = "com.cyc.cycjava.cycl.inference.harness.inference_trivial";

    public static final String myFingerPrint = "7ac51601e8dfd2386a64c1bd7a498da2d0f0af1ffba9a23d2f2e4f7f1c2acd8d";

    // defparameter
    public static final SubLSymbol $current_query_properties$ = makeSymbol("*CURRENT-QUERY-PROPERTIES*");

    // deflexical
    // Query properties whose value we don't care about for trivial-strategist.
    private static final SubLSymbol $trivial_strategist_dont_care_properties$ = makeSymbol("*TRIVIAL-STRATEGIST-DONT-CARE-PROPERTIES*");

    // deflexical
    /**
     * Query properties that are forbidden to be non-nil if we're going to use
     * trivial-strategist.
     */
    private static final SubLSymbol $trivial_strategist_forbidden_properties$ = makeSymbol("*TRIVIAL-STRATEGIST-FORBIDDEN-PROPERTIES*");

    // deflexical
    /**
     * Query properties that are forbidden to be anything other than the default if
     * we're going to use trivial-strategist.
     */
    private static final SubLSymbol $trivial_strategist_forbid_non_default_properties$ = makeSymbol("*TRIVIAL-STRATEGIST-FORBID-NON-DEFAULT-PROPERTIES*");

    // deflexical
    /**
     * A list of query properties for which the trivial strategist can handle some
     * values but not others. The handled and unhandled values are specified in
     *
     * @unknown trivial-strategist-query-property-unhandled-reason.
     */
    private static final SubLSymbol $trivial_strategist_partially_handled_query_properties$ = makeSymbol("*TRIVIAL-STRATEGIST-PARTIALLY-HANDLED-QUERY-PROPERTIES*");

    // deflexical
    private static final SubLSymbol $trivial_strategist_handled_query_properties$ = makeSymbol("*TRIVIAL-STRATEGIST-HANDLED-QUERY-PROPERTIES*");

    // Internal Constants
    public static final SubLSymbol POSSIBLY_INFERENCE_SENTENCE_P = makeSymbol("POSSIBLY-INFERENCE-SENTENCE-P");







    private static final SubLSymbol $INFERENCE_ABORT_TARGET = makeKeyword("INFERENCE-ABORT-TARGET");



    public static final SubLSymbol CLAUSE_P = makeSymbol("CLAUSE-P");



    public static final SubLSymbol TRIVIAL_STRATEGIST_AT_LEAST_PARTIALLY_HANDLED_QUERY_PROPERTY_P = makeSymbol("TRIVIAL-STRATEGIST-AT-LEAST-PARTIALLY-HANDLED-QUERY-PROPERTY-P");

    private static final SubLSymbol $kw9$NEW_TERMS_ALLOWED_ = makeKeyword("NEW-TERMS-ALLOWED?");

    private static final SubLSymbol $sym10$_EXIT = makeSymbol("%EXIT");









    private static final SubLList $list15 = list(makeSymbol("HL-MT"), makeSymbol("HL-SENTENCE"));

    private static final SubLSymbol REMOVAL_ASK_QUERY_PROPERTY_P = makeSymbol("REMOVAL-ASK-QUERY-PROPERTY-P");





    private static final SubLSymbol INFERENCE_ERROR_HANDLER = makeSymbol("INFERENCE-ERROR-HANDLER");

    public static final SubLList $list20 = list(makeSymbol("ONE-BINDINGS"), makeSymbol("ONE-SUPPORTS"));

    private static final SubLList $list21 = list(makeSymbol("FIRST-BINDINGS"), makeSymbol("FIRST-SUPPORTS"));







    private static final SubLSymbol INFERENCE_BINDINGS_HL_TO_EL = makeSymbol("INFERENCE-BINDINGS-HL-TO-EL");





    private static final SubLSymbol $BINDINGS_AND_SUPPORTS = makeKeyword("BINDINGS-AND-SUPPORTS");

    private static final SubLString $str29$unexpected_return_type__S = makeString("unexpected return type ~S");

    private static final SubLSymbol $MAX_TRANSFORMATION_DEPTH = makeKeyword("MAX-TRANSFORMATION-DEPTH");

    private static final SubLSymbol $MIN_RULE_UTILITY = makeKeyword("MIN-RULE-UTILITY");





    public static final SubLList $list34 = list(new SubLObject[]{ makeKeyword("DISJUNCTION-FREE-EL-VARS-POLICY"), makeKeyword("ALLOW-HL-PREDICATE-TRANSFORMATION?"), makeKeyword("ALLOW-UNBOUND-PREDICATE-TRANSFORMATION?"), makeKeyword("ALLOW-EVALUATABLE-PREDICATE-TRANSFORMATION?"), makeKeyword("ALLOWED-RULES"), makeKeyword("FORBIDDEN-RULES"), makeKeyword("MAX-PROOF-DEPTH"), makeKeyword("PROBABLY-APPROXIMATELY-DONE"), makeKeyword("REMOVAL-BACKTRACKING-PRODUCTIVITY-LIMIT"), makeKeyword("MAX-PROBLEM-COUNT"), makeKeyword("TRANSFORMATION-ALLOWED?"), makeKeyword("ADD-RESTRICTION-LAYER-OF-INDIRECTION?"), makeKeyword("RESULT-UNIQUENESS") });

    public static final SubLList $list35 = list(new SubLObject[]{ makeKeyword("CONDITIONAL-SENTENCE?"), makeKeyword("NON-EXPLANATORY-SENTENCE"), makeKeyword("MAINTAIN-TERM-WORKING-SET?"), makeKeyword("CACHE-INFERENCE-RESULTS?"), makeKeyword("BROWSABLE?"), makeKeyword("CONTINUABLE?"), makeKeyword("BLOCK?"), makeKeyword("PROBLEM-STORE-NAME"), makeKeyword("REWRITE-ALLOWED?"), makeKeyword("ABDUCTION-ALLOWED?"), makeKeyword("FORGET-EXTRA-RESULTS?") });

    public static final SubLList $list36 = list(makeKeyword("TRANSITIVE-CLOSURE-MODE"), makeKeyword("EQUALITY-REASONING-METHOD"), makeKeyword("EQUALITY-REASONING-DOMAIN"), makeKeyword("NEGATION-BY-FAILURE?"), makeKeyword("COMPLETENESS-MINIMIZATION-ALLOWED?"), makeKeyword("DIRECTION"), makeKeyword("EVALUATE-SUBL-ALLOWED?"), makeKeyword("REMOVAL-ALLOWED?"));

    private static final SubLList $list37 = list(makeKeyword("RETURN"), makeKeyword("INFERENCE-MODE"), makeKeyword("METRICS"));

    private static final SubLList $list38 = list(makeKeyword("MAX-TIME"), makeKeyword("MAX-NUMBER"), makeKeyword("ALLOWED-MODULES"), makeKeyword("ANSWER-LANGUAGE"), makeKeyword("PRODUCTIVITY-LIMIT"), makeKeyword("NEW-TERMS-ALLOWED?"), makeKeyword("ALLOW-ABNORMALITY-CHECKING?"), makeKeyword("ALLOW-INDETERMINATE-RESULTS?"));

    private static final SubLSymbol $NONZERO_MAX_TRANSFORMATION_DEPTH = makeKeyword("NONZERO-MAX-TRANSFORMATION-DEPTH");



    private static final SubLSymbol $PROBLEM_STORE_PASSED_IN = makeKeyword("PROBLEM-STORE-PASSED-IN");

    private static final SubLSymbol $FORWARD_MAX_TIME = makeKeyword("FORWARD-MAX-TIME");

    private static final SubLSymbol $NONZERO_FORWARD_MAX_TIME = makeKeyword("NONZERO-FORWARD-MAX-TIME");



    private static final SubLSymbol $UNHANDLED_RETURN_VALUE = makeKeyword("UNHANDLED-RETURN-VALUE");

    private static final SubLSymbol $INTERMEDIATE_STEP_VALIDATION_LEVEL = makeKeyword("INTERMEDIATE-STEP-VALIDATION-LEVEL");





    private static final SubLList $list49 = list(makeKeyword("MINIMAL"), makeKeyword("CUSTOM"));

    private static final SubLSymbol $NON_TRIVIAL_INFERENCE_MODE = makeKeyword("NON-TRIVIAL-INFERENCE-MODE");



    private static final SubLSymbol $INFERENCE_PROOF_SPEC = makeKeyword("INFERENCE-PROOF-SPEC");

    private static final SubLSymbol $ANSWER_PROOF_SPECS = makeKeyword("ANSWER-PROOF-SPECS");



    private static final SubLSymbol $TICK_INDEXED_PROGRESS_DATA = makeKeyword("TICK-INDEXED-PROGRESS-DATA");





    private static final SubLList $list58 = list(makeKeyword("BINDINGS"), makeKeyword("SUPPORTS"), makeKeyword("BINDINGS-AND-SUPPORTS"));

    private static final SubLSymbol TRIVIAL_STRATEGIST_UNHANDLED_TEMPLATE_RETURN_KEYWORD_P = makeSymbol("TRIVIAL-STRATEGIST-UNHANDLED-TEMPLATE-RETURN-KEYWORD-P");

    private static final SubLList $list60 = list(makeKeyword("SUPPORTS"));

    public static SubLObject new_cyc_trivial_query(final SubLObject sentence, final SubLObject mt, SubLObject query_properties) {
        if (query_properties == UNPROVIDED) {
            query_properties = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != possibly_inference_sentence_p(sentence) : "el_utilities.possibly_inference_sentence_p(sentence) " + "CommonSymbols.NIL != el_utilities.possibly_inference_sentence_p(sentence) " + sentence;
        final SubLObject plist_var = query_properties;
        assert NIL != list_utilities.property_list_p(plist_var) : "list_utilities.property_list_p(plist_var) " + "CommonSymbols.NIL != list_utilities.property_list_p(plist_var) " + plist_var;
        SubLObject remainder;
        SubLObject property;
        SubLObject value;
        for (remainder = NIL, remainder = plist_var; NIL != remainder; remainder = cddr(remainder)) {
            property = remainder.first();
            value = cadr(remainder);
            assert NIL != inference_datastructures_enumerated_types.query_property_p(property) : "inference_datastructures_enumerated_types.query_property_p(property) " + "CommonSymbols.NIL != inference_datastructures_enumerated_types.query_property_p(property) " + property;
        }
        if (((NIL != mt) && (!SubLSystemTrampolineFile.assertionsDisabledInClass)) && (NIL == hlmt.possibly_mt_p(mt))) {
            throw new AssertionError(mt);
        }
        SubLObject result = NIL;
        SubLObject halt_reason = NIL;
        SubLObject metrics = NIL;
        SubLObject timing_info = NIL;
        SubLObject timing_info_$1 = NIL;
        SubLObject clock_time = NIL;
        final SubLObject time_var = get_internal_real_time();
        final SubLObject resource_tracking_env_var = get_internal_real_time();
        SubLObject aborted_p = NIL;
        try {
            thread.throwStack.push($INFERENCE_ABORT_TARGET);
            final SubLObject _prev_bind_0 = inference_strategist.$within_inference_control_processP$.currentBinding(thread);
            try {
                inference_strategist.$within_inference_control_processP$.bind(T, thread);
                thread.resetMultipleValues();
                final SubLObject result_$2 = new_cyc_trivial_query_int(sentence, mt, query_properties);
                final SubLObject halt_reason_$3 = thread.secondMultipleValue();
                final SubLObject metrics_$4 = thread.thirdMultipleValue();
                thread.resetMultipleValues();
                result = result_$2;
                halt_reason = halt_reason_$3;
                metrics = metrics_$4;
            } finally {
                inference_strategist.$within_inference_control_processP$.rebind(_prev_bind_0, thread);
            }
        } catch (final Throwable ccatch_env_var) {
            aborted_p = Errors.handleThrowable(ccatch_env_var, $INFERENCE_ABORT_TARGET);
        } finally {
            thread.throwStack.pop();
        }
        if (NIL != aborted_p) {
            halt_reason = $ABORT;
            inference_strategist.query_abort();
        }
        timing_info_$1 = compute_with_process_resource_tracking_results(resource_tracking_env_var);
        clock_time = divide(subtract(get_internal_real_time(), time_var), time_high.$internal_time_units_per_second$.getGlobalValue());
        timing_info = convert_process_resource_tracking_timing_info_to_seconds(nadd_clock_time_to_process_resource_timing_info(clock_time, timing_info_$1));
        metrics = inference_kernel.update_query_metrics_wrt_timing_info(metrics, timing_info);
        return values(result, halt_reason, metrics);
    }

    public static SubLObject new_cyc_trivial_query_from_dnf(final SubLObject dnf, final SubLObject mt, SubLObject scoped_vars, SubLObject query_properties) {
        if (scoped_vars == UNPROVIDED) {
            scoped_vars = NIL;
        }
        if (query_properties == UNPROVIDED) {
            query_properties = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != clauses.clause_p(dnf) : "clauses.clause_p(dnf) " + "CommonSymbols.NIL != clauses.clause_p(dnf) " + dnf;
        assert NIL != hlmt.possibly_mt_p(mt) : "hlmt.possibly_mt_p(mt) " + "CommonSymbols.NIL != hlmt.possibly_mt_p(mt) " + mt;
        assert NIL != listp(scoped_vars) : "Types.listp(scoped_vars) " + "CommonSymbols.NIL != Types.listp(scoped_vars) " + scoped_vars;
        final SubLObject plist_var = query_properties;
        assert NIL != list_utilities.property_list_p(plist_var) : "list_utilities.property_list_p(plist_var) " + "CommonSymbols.NIL != list_utilities.property_list_p(plist_var) " + plist_var;
        SubLObject remainder;
        SubLObject property;
        SubLObject value;
        for (remainder = NIL, remainder = plist_var; NIL != remainder; remainder = cddr(remainder)) {
            property = remainder.first();
            value = cadr(remainder);
            assert NIL != inference_datastructures_enumerated_types.query_property_p(property) : "inference_datastructures_enumerated_types.query_property_p(property) " + "CommonSymbols.NIL != inference_datastructures_enumerated_types.query_property_p(property) " + property;
        }
        SubLObject result = NIL;
        SubLObject halt_reason = NIL;
        SubLObject metrics = NIL;
        SubLObject timing_info = NIL;
        SubLObject timing_info_$5 = NIL;
        SubLObject clock_time = NIL;
        final SubLObject time_var = get_internal_real_time();
        final SubLObject resource_tracking_env_var = get_internal_real_time();
        SubLObject aborted_p = NIL;
        try {
            thread.throwStack.push($INFERENCE_ABORT_TARGET);
            final SubLObject _prev_bind_0 = inference_strategist.$within_inference_control_processP$.currentBinding(thread);
            try {
                inference_strategist.$within_inference_control_processP$.bind(T, thread);
                thread.resetMultipleValues();
                final SubLObject result_$6 = new_cyc_trivial_query_from_dnf_int(dnf, mt, scoped_vars, query_properties);
                final SubLObject halt_reason_$7 = thread.secondMultipleValue();
                final SubLObject metrics_$8 = thread.thirdMultipleValue();
                thread.resetMultipleValues();
                result = result_$6;
                halt_reason = halt_reason_$7;
                metrics = metrics_$8;
            } finally {
                inference_strategist.$within_inference_control_processP$.rebind(_prev_bind_0, thread);
            }
        } catch (final Throwable ccatch_env_var) {
            aborted_p = Errors.handleThrowable(ccatch_env_var, $INFERENCE_ABORT_TARGET);
        } finally {
            thread.throwStack.pop();
        }
        if (NIL != aborted_p) {
            halt_reason = $ABORT;
            inference_strategist.query_abort();
        }
        timing_info_$5 = compute_with_process_resource_tracking_results(resource_tracking_env_var);
        clock_time = divide(subtract(get_internal_real_time(), time_var), time_high.$internal_time_units_per_second$.getGlobalValue());
        timing_info = convert_process_resource_tracking_timing_info_to_seconds(nadd_clock_time_to_process_resource_timing_info(clock_time, timing_info_$5));
        metrics = inference_kernel.update_query_metrics_wrt_timing_info(metrics, timing_info);
        return values(result, halt_reason, metrics);
    }

    public static SubLObject new_cyc_trivial_query_int(final SubLObject sentence, final SubLObject mt, SubLObject query_properties) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        query_properties = trivial_strategist_strengthen_query_properties(query_properties);
        if (NIL != trivial_strategist_can_handle_query_propertiesP(query_properties)) {
            final SubLObject trivial_query_properties = list_utilities.filter_plist(query_properties, TRIVIAL_STRATEGIST_AT_LEAST_PARTIALLY_HANDLED_QUERY_PROPERTY_P);
            final SubLObject _prev_bind_0 = inference_worker.$currently_active_problem_store$.currentBinding(thread);
            final SubLObject _prev_bind_2 = czer_vars.$create_narts_regardless_of_whether_within_assertP$.currentBinding(thread);
            try {
                inference_worker.$currently_active_problem_store$.bind(NIL, thread);
                czer_vars.$create_narts_regardless_of_whether_within_assertP$.bind(getf(query_properties, $kw9$NEW_TERMS_ALLOWED_, UNPROVIDED), thread);
                thread.resetMultipleValues();
                final SubLObject sentence_clauses = inference_czer.inference_canonicalize_ask_int(sentence, mt, inference_datastructures_enumerated_types.$default_inference_disjunction_free_el_vars_policy$.getGlobalValue());
                final SubLObject v_bindings = thread.secondMultipleValue();
                final SubLObject free_el_vars = thread.thirdMultipleValue();
                thread.resetMultipleValues();
                if (NIL != clause_utilities.atomic_clauses_p(sentence_clauses)) {
                    final SubLObject sentence_clause = sentence_clauses.first();
                    final SubLObject free_hl_vars = bindings.apply_bindings(v_bindings, free_el_vars);
                    inference_analysis.possibly_enqueue_asked_query(sentence, mt, query_properties);
                    return new_cyc_trivial_query_via_removal_ask(sentence_clause, v_bindings, free_hl_vars, trivial_query_properties);
                }
            } finally {
                czer_vars.$create_narts_regardless_of_whether_within_assertP$.rebind(_prev_bind_2, thread);
                inference_worker.$currently_active_problem_store$.rebind(_prev_bind_0, thread);
            }
        }
        return values(NIL, $NON_TRIVIAL, NIL);
    }

    public static SubLObject new_cyc_trivial_query_from_dnf_int(final SubLObject dnf, final SubLObject mt, final SubLObject scoped_vars, SubLObject query_properties) {
        query_properties = trivial_strategist_strengthen_query_properties(query_properties);
        if (NIL != trivial_strategist_can_handle_query_propertiesP(query_properties)) {
            final SubLObject trivial_query_properties = list_utilities.filter_plist(query_properties, TRIVIAL_STRATEGIST_AT_LEAST_PARTIALLY_HANDLED_QUERY_PROPERTY_P);
            final SubLObject sentence_clauses = inference_czer.dnf_and_mt_to_hl_query(dnf, mt);
            if (NIL != clause_utilities.atomic_clauses_p(sentence_clauses)) {
                final SubLObject sentence_clause = sentence_clauses.first();
                final SubLObject free_hl_vars = set_difference(list_utilities.tree_gather(sentence_clause, HL_VARIABLE_P, UNPROVIDED, UNPROVIDED, UNPROVIDED), scoped_vars, UNPROVIDED, UNPROVIDED);
                inference_analysis.possibly_enqueue_asked_query(dnf, mt, query_properties);
                return new_cyc_trivial_query_via_removal_ask(sentence_clause, NIL, free_hl_vars, trivial_query_properties);
            }
        }
        return values(NIL, $NON_TRIVIAL, NIL);
    }

    public static SubLObject current_query_property_lookup(final SubLObject property) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return inference_datastructures_enumerated_types.inference_query_property_lookup($current_query_properties$.getDynamicValue(thread), property);
    }

    public static SubLObject current_trivial_query_properties() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return copy_list($current_query_properties$.getDynamicValue(thread));
    }

    public static SubLObject new_cyc_trivial_query_via_removal_ask(final SubLObject sentence_clause, final SubLObject v_bindings, final SubLObject free_hl_vars, final SubLObject trivial_query_properties) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject truth = (NIL != clause_utilities.pos_atomic_clause_p(sentence_clause)) ? $TRUE : $FALSE;
        SubLObject current;
        final SubLObject datum = current = clause_utilities.atomic_clause_asent(sentence_clause);
        SubLObject hl_mt = NIL;
        SubLObject hl_sentence = NIL;
        destructuring_bind_must_consp(current, datum, $list15);
        hl_mt = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list15);
        hl_sentence = current.first();
        current = current.rest();
        if (NIL == current) {
            final SubLObject max_time = inference_datastructures_enumerated_types.inference_properties_max_time(trivial_query_properties);
            final SubLObject return_type = inference_datastructures_enumerated_types.inference_properties_return_type(trivial_query_properties);
            final SubLObject answer_language = inference_datastructures_enumerated_types.inference_properties_answer_language(trivial_query_properties);
            final SubLObject productivity_limit = inference_datastructures_enumerated_types.strategy_dynamic_properties_productivity_limit(trivial_query_properties);
            final SubLObject removal_ask_query_properties = list_utilities.filter_plist(trivial_query_properties, REMOVAL_ASK_QUERY_PROPERTY_P);
            SubLObject result = NIL;
            SubLObject halt_reason = NIL;
            SubLObject metrics = NIL;
            final SubLObject _prev_bind_0 = $current_query_properties$.currentBinding(thread);
            final SubLObject _prev_bind_2 = inference_worker.$currently_active_problem$.currentBinding(thread);
            final SubLObject _prev_bind_3 = inference_worker.$currently_executing_tactics$.currentBinding(thread);
            try {
                $current_query_properties$.bind(trivial_query_properties, thread);
                inference_worker.$currently_active_problem$.bind(NIL, thread);
                inference_worker.$currently_executing_tactics$.bind(NIL, thread);
                SubLObject aborted_p = NIL;
                try {
                    thread.throwStack.push($INFERENCE_ABORT_TARGET);
                    final SubLObject _prev_bind_0_$9 = inference_strategist.$within_inference_control_processP$.currentBinding(thread);
                    try {
                        inference_strategist.$within_inference_control_processP$.bind(T, thread);
                        SubLObject error_message = NIL;
                        if (NIL != $inference_debugP$.getDynamicValue(thread)) {
                            final SubLObject abort_max_time = max_time;
                            if (NIL != abort_max_time) {
                                SubLObject timed_out = NIL;
                                final SubLObject tag = with_timeout_make_tag();
                                try {
                                    thread.throwStack.push(tag);
                                    final SubLObject _prev_bind_0_$10 = $within_with_timeout$.currentBinding(thread);
                                    try {
                                        $within_with_timeout$.bind(T, thread);
                                        SubLObject timer = NIL;
                                        try {
                                            final SubLObject _prev_bind_0_$11 = $with_timeout_nesting_depth$.currentBinding(thread);
                                            try {
                                                $with_timeout_nesting_depth$.bind(add(ONE_INTEGER, $with_timeout_nesting_depth$.getDynamicValue(thread)), thread);
                                                timer = with_timeout_start_timer(abort_max_time, tag);
                                                final SubLObject local_state;
                                                final SubLObject state = local_state = memoization_state.possibly_new_memoization_state();
                                                final SubLObject _prev_bind_0_$12 = memoization_state.$memoization_state$.currentBinding(thread);
                                                try {
                                                    memoization_state.$memoization_state$.bind(local_state, thread);
                                                    final SubLObject original_memoization_process = memoization_state.memoization_state_original_process(local_state);
                                                    try {
                                                        final SubLObject _prev_bind_0_$13 = $removal_cost_cutoff$.currentBinding(thread);
                                                        try {
                                                            $removal_cost_cutoff$.bind(inference_datastructures_enumerated_types.removal_cost_cutoff_for_productivity(productivity_limit), thread);
                                                            thread.resetMultipleValues();
                                                            final SubLObject result_$14 = backward.removal_ask(hl_sentence, hl_mt, truth, removal_ask_query_properties);
                                                            final SubLObject halt_reason_$15 = thread.secondMultipleValue();
                                                            final SubLObject metrics_$16 = thread.thirdMultipleValue();
                                                            thread.resetMultipleValues();
                                                            result = result_$14;
                                                            halt_reason = halt_reason_$15;
                                                            metrics = metrics_$16;
                                                        } finally {
                                                            $removal_cost_cutoff$.rebind(_prev_bind_0_$13, thread);
                                                        }
                                                    } finally {
                                                        final SubLObject _prev_bind_0_$14 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                                        try {
                                                            $is_thread_performing_cleanupP$.bind(T, thread);
                                                            final SubLObject _values = getValuesAsVector();
                                                            memoization_state.memoization_state_possibly_clear_original_process(local_state, original_memoization_process);
                                                            restoreValuesFromVector(_values);
                                                        } finally {
                                                            $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$14, thread);
                                                        }
                                                    }
                                                } finally {
                                                    memoization_state.$memoization_state$.rebind(_prev_bind_0_$12, thread);
                                                }
                                            } finally {
                                                $with_timeout_nesting_depth$.rebind(_prev_bind_0_$11, thread);
                                            }
                                        } finally {
                                            final SubLObject _prev_bind_0_$15 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                            try {
                                                $is_thread_performing_cleanupP$.bind(T, thread);
                                                final SubLObject _values2 = getValuesAsVector();
                                                with_timeout_stop_timer(timer);
                                                restoreValuesFromVector(_values2);
                                            } finally {
                                                $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$15, thread);
                                            }
                                        }
                                    } finally {
                                        $within_with_timeout$.rebind(_prev_bind_0_$10, thread);
                                    }
                                } catch (final Throwable ccatch_env_var) {
                                    timed_out = Errors.handleThrowable(ccatch_env_var, tag);
                                } finally {
                                    thread.throwStack.pop();
                                }
                                if (NIL != timed_out) {
                                    halt_reason = $MAX_TIME;
                                }
                            } else {
                                final SubLObject local_state2;
                                final SubLObject state2 = local_state2 = memoization_state.possibly_new_memoization_state();
                                final SubLObject _prev_bind_0_$16 = memoization_state.$memoization_state$.currentBinding(thread);
                                try {
                                    memoization_state.$memoization_state$.bind(local_state2, thread);
                                    final SubLObject original_memoization_process2 = memoization_state.memoization_state_original_process(local_state2);
                                    try {
                                        final SubLObject _prev_bind_0_$17 = $removal_cost_cutoff$.currentBinding(thread);
                                        try {
                                            $removal_cost_cutoff$.bind(inference_datastructures_enumerated_types.removal_cost_cutoff_for_productivity(productivity_limit), thread);
                                            thread.resetMultipleValues();
                                            final SubLObject result_$15 = backward.removal_ask(hl_sentence, hl_mt, truth, removal_ask_query_properties);
                                            final SubLObject halt_reason_$16 = thread.secondMultipleValue();
                                            final SubLObject metrics_$17 = thread.thirdMultipleValue();
                                            thread.resetMultipleValues();
                                            result = result_$15;
                                            halt_reason = halt_reason_$16;
                                            metrics = metrics_$17;
                                        } finally {
                                            $removal_cost_cutoff$.rebind(_prev_bind_0_$17, thread);
                                        }
                                    } finally {
                                        final SubLObject _prev_bind_0_$18 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                        try {
                                            $is_thread_performing_cleanupP$.bind(T, thread);
                                            final SubLObject _values3 = getValuesAsVector();
                                            memoization_state.memoization_state_possibly_clear_original_process(local_state2, original_memoization_process2);
                                            restoreValuesFromVector(_values3);
                                        } finally {
                                            $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$18, thread);
                                        }
                                    }
                                } finally {
                                    memoization_state.$memoization_state$.rebind(_prev_bind_0_$16, thread);
                                }
                            }
                        } else {
                            try {
                                thread.throwStack.push($INFERENCE_ERROR);
                                final SubLObject _prev_bind_0_$19 = Errors.$error_handler$.currentBinding(thread);
                                try {
                                    Errors.$error_handler$.bind(symbol_function(INFERENCE_ERROR_HANDLER), thread);
                                    try {
                                        final SubLObject abort_max_time2 = max_time;
                                        if (NIL != abort_max_time2) {
                                            SubLObject timed_out2 = NIL;
                                            final SubLObject tag2 = with_timeout_make_tag();
                                            try {
                                                thread.throwStack.push(tag2);
                                                final SubLObject _prev_bind_0_$20 = $within_with_timeout$.currentBinding(thread);
                                                try {
                                                    $within_with_timeout$.bind(T, thread);
                                                    SubLObject timer2 = NIL;
                                                    try {
                                                        final SubLObject _prev_bind_0_$21 = $with_timeout_nesting_depth$.currentBinding(thread);
                                                        try {
                                                            $with_timeout_nesting_depth$.bind(add(ONE_INTEGER, $with_timeout_nesting_depth$.getDynamicValue(thread)), thread);
                                                            timer2 = with_timeout_start_timer(abort_max_time2, tag2);
                                                            final SubLObject local_state3;
                                                            final SubLObject state3 = local_state3 = memoization_state.possibly_new_memoization_state();
                                                            final SubLObject _prev_bind_0_$22 = memoization_state.$memoization_state$.currentBinding(thread);
                                                            try {
                                                                memoization_state.$memoization_state$.bind(local_state3, thread);
                                                                final SubLObject original_memoization_process3 = memoization_state.memoization_state_original_process(local_state3);
                                                                try {
                                                                    final SubLObject _prev_bind_0_$23 = $removal_cost_cutoff$.currentBinding(thread);
                                                                    try {
                                                                        $removal_cost_cutoff$.bind(inference_datastructures_enumerated_types.removal_cost_cutoff_for_productivity(productivity_limit), thread);
                                                                        thread.resetMultipleValues();
                                                                        final SubLObject result_$16 = backward.removal_ask(hl_sentence, hl_mt, truth, removal_ask_query_properties);
                                                                        final SubLObject halt_reason_$17 = thread.secondMultipleValue();
                                                                        final SubLObject metrics_$18 = thread.thirdMultipleValue();
                                                                        thread.resetMultipleValues();
                                                                        result = result_$16;
                                                                        halt_reason = halt_reason_$17;
                                                                        metrics = metrics_$18;
                                                                    } finally {
                                                                        $removal_cost_cutoff$.rebind(_prev_bind_0_$23, thread);
                                                                    }
                                                                } finally {
                                                                    final SubLObject _prev_bind_0_$24 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                                                    try {
                                                                        $is_thread_performing_cleanupP$.bind(T, thread);
                                                                        final SubLObject _values4 = getValuesAsVector();
                                                                        memoization_state.memoization_state_possibly_clear_original_process(local_state3, original_memoization_process3);
                                                                        restoreValuesFromVector(_values4);
                                                                    } finally {
                                                                        $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$24, thread);
                                                                    }
                                                                }
                                                            } finally {
                                                                memoization_state.$memoization_state$.rebind(_prev_bind_0_$22, thread);
                                                            }
                                                        } finally {
                                                            $with_timeout_nesting_depth$.rebind(_prev_bind_0_$21, thread);
                                                        }
                                                    } finally {
                                                        final SubLObject _prev_bind_0_$25 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                                        try {
                                                            $is_thread_performing_cleanupP$.bind(T, thread);
                                                            final SubLObject _values5 = getValuesAsVector();
                                                            with_timeout_stop_timer(timer2);
                                                            restoreValuesFromVector(_values5);
                                                        } finally {
                                                            $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$25, thread);
                                                        }
                                                    }
                                                } finally {
                                                    $within_with_timeout$.rebind(_prev_bind_0_$20, thread);
                                                }
                                            } catch (final Throwable ccatch_env_var2) {
                                                timed_out2 = Errors.handleThrowable(ccatch_env_var2, tag2);
                                            } finally {
                                                thread.throwStack.pop();
                                            }
                                            if (NIL != timed_out2) {
                                                halt_reason = $MAX_TIME;
                                            }
                                        } else {
                                            final SubLObject local_state4;
                                            final SubLObject state4 = local_state4 = memoization_state.possibly_new_memoization_state();
                                            final SubLObject _prev_bind_0_$26 = memoization_state.$memoization_state$.currentBinding(thread);
                                            try {
                                                memoization_state.$memoization_state$.bind(local_state4, thread);
                                                final SubLObject original_memoization_process4 = memoization_state.memoization_state_original_process(local_state4);
                                                try {
                                                    final SubLObject _prev_bind_0_$27 = $removal_cost_cutoff$.currentBinding(thread);
                                                    try {
                                                        $removal_cost_cutoff$.bind(inference_datastructures_enumerated_types.removal_cost_cutoff_for_productivity(productivity_limit), thread);
                                                        thread.resetMultipleValues();
                                                        final SubLObject result_$17 = backward.removal_ask(hl_sentence, hl_mt, truth, removal_ask_query_properties);
                                                        final SubLObject halt_reason_$18 = thread.secondMultipleValue();
                                                        final SubLObject metrics_$19 = thread.thirdMultipleValue();
                                                        thread.resetMultipleValues();
                                                        result = result_$17;
                                                        halt_reason = halt_reason_$18;
                                                        metrics = metrics_$19;
                                                    } finally {
                                                        $removal_cost_cutoff$.rebind(_prev_bind_0_$27, thread);
                                                    }
                                                } finally {
                                                    final SubLObject _prev_bind_0_$28 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                                    try {
                                                        $is_thread_performing_cleanupP$.bind(T, thread);
                                                        final SubLObject _values6 = getValuesAsVector();
                                                        memoization_state.memoization_state_possibly_clear_original_process(local_state4, original_memoization_process4);
                                                        restoreValuesFromVector(_values6);
                                                    } finally {
                                                        $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$28, thread);
                                                    }
                                                }
                                            } finally {
                                                memoization_state.$memoization_state$.rebind(_prev_bind_0_$26, thread);
                                            }
                                        }
                                    } catch (final Throwable catch_var) {
                                        Errors.handleThrowable(catch_var, NIL);
                                    }
                                } finally {
                                    Errors.$error_handler$.rebind(_prev_bind_0_$19, thread);
                                }
                            } catch (final Throwable ccatch_env_var3) {
                                error_message = Errors.handleThrowable(ccatch_env_var3, $INFERENCE_ERROR);
                            } finally {
                                thread.throwStack.pop();
                            }
                        }
                        if (NIL != error_message) {
                            halt_reason = inference_datastructures_enumerated_types.new_inference_error_suspend_status(error_message);
                        }
                    } finally {
                        inference_strategist.$within_inference_control_processP$.rebind(_prev_bind_0_$9, thread);
                    }
                } catch (final Throwable ccatch_env_var4) {
                    aborted_p = Errors.handleThrowable(ccatch_env_var4, $INFERENCE_ABORT_TARGET);
                } finally {
                    thread.throwStack.pop();
                }
                if (NIL != aborted_p) {
                    halt_reason = $ABORT;
                    inference_strategist.query_abort();
                }
            } finally {
                inference_worker.$currently_executing_tactics$.rebind(_prev_bind_3, thread);
                inference_worker.$currently_active_problem$.rebind(_prev_bind_2, thread);
                $current_query_properties$.rebind(_prev_bind_0, thread);
            }
            if (NIL != result) {
                result = removal_ask_filter_out_uninteresting_bindings(result, free_hl_vars);
                result = removal_ask_result_closed_query_success_ntransform(result);
                result = removal_ask_result_return_type_ntransform(result, v_bindings, return_type, answer_language);
            }
            return values(result, halt_reason, metrics);
        }
        cdestructuring_bind_error(datum, $list15);
        return NIL;
    }

    public static SubLObject removal_ask_filter_out_uninteresting_bindings(final SubLObject result, final SubLObject free_vars) {
        SubLObject filtered_result = NIL;
        SubLObject cdolist_list_var = result;
        SubLObject one_result = NIL;
        one_result = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            SubLObject current;
            final SubLObject datum = current = one_result;
            SubLObject one_bindings = NIL;
            SubLObject one_supports = NIL;
            destructuring_bind_must_consp(current, datum, $list20);
            one_bindings = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list20);
            one_supports = current.first();
            current = current.rest();
            if (NIL == current) {
                final SubLObject filtered_bindings = inference_strategist.filter_out_uninteresting_bindings(one_bindings, free_vars);
                filtered_result = cons(list(filtered_bindings, one_supports), filtered_result);
            } else {
                cdestructuring_bind_error(datum, $list20);
            }
            cdolist_list_var = cdolist_list_var.rest();
            one_result = cdolist_list_var.first();
        } 
        return nreverse(filtered_result);
    }

    public static SubLObject removal_ask_result_closed_query_success_ntransform(final SubLObject result) {
        final SubLObject first_result = result.first();
        SubLObject current;
        final SubLObject datum = current = first_result;
        SubLObject first_bindings = NIL;
        SubLObject first_supports = NIL;
        destructuring_bind_must_consp(current, datum, $list21);
        first_bindings = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list21);
        first_supports = current.first();
        current = current.rest();
        if (NIL == current) {
            if (NIL != bindings.unification_success_token_p(first_bindings)) {
                SubLObject cdolist_list_var = result;
                SubLObject result_tuple = NIL;
                result_tuple = cdolist_list_var.first();
                while (NIL != cdolist_list_var) {
                    rplaca(result_tuple, NIL);
                    cdolist_list_var = cdolist_list_var.rest();
                    result_tuple = cdolist_list_var.first();
                } 
            }
        } else {
            cdestructuring_bind_error(datum, $list21);
        }
        return result;
    }

    public static SubLObject removal_ask_result_return_type_ntransform(SubLObject result, final SubLObject v_bindings, final SubLObject return_type, final SubLObject answer_language) {
        if (return_type.eql($BINDINGS)) {
            result = list_utilities.nmapcar(symbol_function(FIRST), result);
            result = bindings.napply_bindings_backwards_to_list(v_bindings, result);
            if ($EL == answer_language) {
                result = list_utilities.nmapcar(symbol_function(INFERENCE_BINDINGS_HL_TO_EL), result);
            }
            result = list_utilities.fast_delete_duplicates(result, symbol_function(EQUAL), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        } else
            if (return_type.eql($SUPPORTS)) {
                result = list_utilities.nmapcar(symbol_function(SECOND), result);
            } else
                if (return_type.eql($BINDINGS_AND_SUPPORTS)) {
                    result = bindings.napply_bindings_backwards_to_list(v_bindings, result);
                    if ($EL == answer_language) {
                        SubLObject cdolist_list_var = result;
                        SubLObject tuple = NIL;
                        tuple = cdolist_list_var.first();
                        while (NIL != cdolist_list_var) {
                            final SubLObject v_bindings_$41 = tuple.first();
                            rplaca(tuple, inference_kernel.inference_bindings_hl_to_el(v_bindings_$41));
                            cdolist_list_var = cdolist_list_var.rest();
                            tuple = cdolist_list_var.first();
                        } 
                    }
                } else
                    if (NIL != inference_datastructures_enumerated_types.inference_template_return_type_p(return_type)) {
                        final SubLObject template = second(return_type);
                        result = removal_ask_result_return_type_ntransform(result, v_bindings, $BINDINGS, answer_language);
                        result = inference_kernel.inference_result_from_binding_lists_via_template(result, template);
                    } else {
                        Errors.error($str29$unexpected_return_type__S, return_type);
                    }



        return result;
    }

    public static SubLObject trivial_strategist_can_handle_query_propertiesP(final SubLObject query_properties) {
        SubLObject remainder;
        SubLObject property;
        SubLObject value;
        for (remainder = NIL, remainder = query_properties; NIL != remainder; remainder = cddr(remainder)) {
            property = remainder.first();
            value = cadr(remainder);
            if (NIL == trivial_strategist_can_handle_query_propertyP(property, value)) {
                return NIL;
            }
        }
        return T;
    }

    public static SubLObject trivial_strategist_strengthen_query_properties(SubLObject query_properties) {
        if (NIL == inference_datastructures_enumerated_types.transformation_allowed_by_propertiesP(query_properties)) {
            query_properties = remf(copy_list(query_properties), $MAX_TRANSFORMATION_DEPTH);
            query_properties = remf(copy_list(query_properties), $MIN_RULE_UTILITY);
        }
        final SubLObject pcase_var = inference_datastructures_enumerated_types.inference_properties_return_type(query_properties);
        if (pcase_var.eql($SUPPORTS) || pcase_var.eql($BINDINGS_AND_SUPPORTS)) {
            query_properties = putf(copy_list(query_properties), $ANSWER_LANGUAGE, $HL);
        }
        return query_properties;
    }

    public static SubLObject trivial_strategist_handled_query_property_p(final SubLObject v_object) {
        return list_utilities.member_eqP(v_object, $trivial_strategist_handled_query_properties$.getGlobalValue());
    }

    public static SubLObject trivial_strategist_at_least_partially_handled_query_property_p(final SubLObject v_object) {
        return makeBoolean((NIL != trivial_strategist_handled_query_property_p(v_object)) || (NIL != list_utilities.member_eqP(v_object, $trivial_strategist_partially_handled_query_properties$.getGlobalValue())));
    }

    public static SubLObject trivial_strategist_can_handle_query_propertyP(final SubLObject property, final SubLObject value) {
        if (NIL != list_utilities.member_eqP(property, $trivial_strategist_dont_care_properties$.getGlobalValue())) {
            return T;
        }
        if (NIL != trivial_strategist_handled_query_property_p(property)) {
            return T;
        }
        return makeBoolean(NIL == trivial_strategist_query_property_unhandled_reason(property, value));
    }

    public static SubLObject trivial_strategist_query_property_unhandled_reason(final SubLObject property, final SubLObject value) {
        if (NIL != list_utilities.member_eqP(property, $trivial_strategist_forbidden_properties$.getGlobalValue())) {
            if (NIL != value) {
                return property;
            }
            return NIL;
        } else
            if (NIL != list_utilities.member_eqP(property, $trivial_strategist_forbid_non_default_properties$.getGlobalValue())) {
                if (NIL != inference_datastructures_enumerated_types.query_property_is_defaultP(property, value)) {
                    return NIL;
                }
                return property;
            } else {
                if (property.eql($MAX_TRANSFORMATION_DEPTH)) {
                    return ZERO_INTEGER.eql(value) ? NIL : $NONZERO_MAX_TRANSFORMATION_DEPTH;
                }
                if (property.eql($PROBLEM_STORE)) {
                    return NIL == value ? NIL : $PROBLEM_STORE_PASSED_IN;
                }
                if (property.eql($FORWARD_MAX_TIME)) {
                    return ZERO_INTEGER.eql(value) ? NIL : $NONZERO_FORWARD_MAX_TIME;
                }
                if (property.eql($RETURN)) {
                    return NIL != trivial_strategist_handled_return_valueP(value) ? NIL : $UNHANDLED_RETURN_VALUE;
                }
                if (property.eql($INTERMEDIATE_STEP_VALIDATION_LEVEL)) {
                    return $NONE == value ? NIL : $INTERMEDIATE_STEP_VALIDATION_LEVEL;
                }
                if (property.eql($INFERENCE_MODE)) {
                    return NIL != list_utilities.member_eqP(value, $list49) ? NIL : $NON_TRIVIAL_INFERENCE_MODE;
                }
                if (property.eql($METRICS)) {
                    return (((NIL != list_utilities.member_eqP($INFERENCE_PROOF_SPEC, value)) || (NIL != list_utilities.member_eqP($ANSWER_PROOF_SPECS, value))) || (NIL != list_utilities.member_eqP($TOTAL_STEPS, value))) || (NIL != list_utilities.member_eqP($TICK_INDEXED_PROGRESS_DATA, value)) ? $UNHANDLED_METRIC : NIL;
                }
                return $UNEXPECTED;
            }

    }

    public static SubLObject trivial_strategist_handled_return_valueP(final SubLObject value) {
        return makeBoolean((NIL != list_utilities.member_eqP(value, $list58)) || ((NIL != inference_datastructures_enumerated_types.inference_template_return_type_p(value)) && (NIL == list_utilities.tree_find_if(symbol_function(TRIVIAL_STRATEGIST_UNHANDLED_TEMPLATE_RETURN_KEYWORD_P), value, UNPROVIDED))));
    }

    public static SubLObject trivial_strategist_unhandled_template_return_keyword_p(final SubLObject v_object) {
        return list_utilities.member_eqP(v_object, $list60);
    }

    public static SubLObject declare_inference_trivial_file() {
        declareFunction(me, "new_cyc_trivial_query", "NEW-CYC-TRIVIAL-QUERY", 2, 1, false);
        declareFunction(me, "new_cyc_trivial_query_from_dnf", "NEW-CYC-TRIVIAL-QUERY-FROM-DNF", 2, 2, false);
        declareFunction(me, "new_cyc_trivial_query_int", "NEW-CYC-TRIVIAL-QUERY-INT", 3, 0, false);
        declareFunction(me, "new_cyc_trivial_query_from_dnf_int", "NEW-CYC-TRIVIAL-QUERY-FROM-DNF-INT", 4, 0, false);
        declareFunction(me, "current_query_property_lookup", "CURRENT-QUERY-PROPERTY-LOOKUP", 1, 0, false);
        declareFunction(me, "current_trivial_query_properties", "CURRENT-TRIVIAL-QUERY-PROPERTIES", 0, 0, false);
        declareFunction(me, "new_cyc_trivial_query_via_removal_ask", "NEW-CYC-TRIVIAL-QUERY-VIA-REMOVAL-ASK", 4, 0, false);
        declareFunction(me, "removal_ask_filter_out_uninteresting_bindings", "REMOVAL-ASK-FILTER-OUT-UNINTERESTING-BINDINGS", 2, 0, false);
        declareFunction(me, "removal_ask_result_closed_query_success_ntransform", "REMOVAL-ASK-RESULT-CLOSED-QUERY-SUCCESS-NTRANSFORM", 1, 0, false);
        declareFunction(me, "removal_ask_result_return_type_ntransform", "REMOVAL-ASK-RESULT-RETURN-TYPE-NTRANSFORM", 4, 0, false);
        declareFunction(me, "trivial_strategist_can_handle_query_propertiesP", "TRIVIAL-STRATEGIST-CAN-HANDLE-QUERY-PROPERTIES?", 1, 0, false);
        declareFunction(me, "trivial_strategist_strengthen_query_properties", "TRIVIAL-STRATEGIST-STRENGTHEN-QUERY-PROPERTIES", 1, 0, false);
        declareFunction(me, "trivial_strategist_handled_query_property_p", "TRIVIAL-STRATEGIST-HANDLED-QUERY-PROPERTY-P", 1, 0, false);
        declareFunction(me, "trivial_strategist_at_least_partially_handled_query_property_p", "TRIVIAL-STRATEGIST-AT-LEAST-PARTIALLY-HANDLED-QUERY-PROPERTY-P", 1, 0, false);
        declareFunction(me, "trivial_strategist_can_handle_query_propertyP", "TRIVIAL-STRATEGIST-CAN-HANDLE-QUERY-PROPERTY?", 2, 0, false);
        declareFunction(me, "trivial_strategist_query_property_unhandled_reason", "TRIVIAL-STRATEGIST-QUERY-PROPERTY-UNHANDLED-REASON", 2, 0, false);
        declareFunction(me, "trivial_strategist_handled_return_valueP", "TRIVIAL-STRATEGIST-HANDLED-RETURN-VALUE?", 1, 0, false);
        declareFunction(me, "trivial_strategist_unhandled_template_return_keyword_p", "TRIVIAL-STRATEGIST-UNHANDLED-TEMPLATE-RETURN-KEYWORD-P", 1, 0, false);
        return NIL;
    }

    public static SubLObject init_inference_trivial_file() {
        defparameter("*CURRENT-QUERY-PROPERTIES*", NIL);
        deflexical("*TRIVIAL-STRATEGIST-DONT-CARE-PROPERTIES*", $list34);
        deflexical("*TRIVIAL-STRATEGIST-FORBIDDEN-PROPERTIES*", $list35);
        deflexical("*TRIVIAL-STRATEGIST-FORBID-NON-DEFAULT-PROPERTIES*", $list36);
        deflexical("*TRIVIAL-STRATEGIST-PARTIALLY-HANDLED-QUERY-PROPERTIES*", $list37);
        deflexical("*TRIVIAL-STRATEGIST-HANDLED-QUERY-PROPERTIES*", $list38);
        return NIL;
    }

    public static SubLObject setup_inference_trivial_file() {
        return NIL;
    }

    @Override
    public void declareFunctions() {
        declare_inference_trivial_file();
    }

    @Override
    public void initializeVariables() {
        init_inference_trivial_file();
    }

    @Override
    public void runTopLevelForms() {
        setup_inference_trivial_file();
    }

    
}

/**
 * Total time: 673 ms synthetic
 */
