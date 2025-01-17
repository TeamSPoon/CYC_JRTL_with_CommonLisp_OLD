package com.cyc.cycjava.cycl.inference.harness;


import static com.cyc.cycjava.cycl.access_macros.register_external_symbol;
import static com.cyc.cycjava.cycl.access_macros.register_macro_helper;
import static com.cyc.cycjava.cycl.control_vars.$inference_debugP$;
import static com.cyc.cycjava.cycl.control_vars.$janus_within_somethingP$;
import static com.cyc.cycjava.cycl.el_utilities.possibly_inference_sentence_p;
import static com.cyc.cycjava.cycl.id_index.id_index_dense_objects;
import static com.cyc.cycjava.cycl.id_index.id_index_dense_objects_empty_p;
import static com.cyc.cycjava.cycl.id_index.id_index_next_id;
import static com.cyc.cycjava.cycl.id_index.id_index_objects_empty_p;
import static com.cyc.cycjava.cycl.id_index.id_index_skip_tombstones_p;
import static com.cyc.cycjava.cycl.id_index.id_index_sparse_id_threshold;
import static com.cyc.cycjava.cycl.id_index.id_index_sparse_objects;
import static com.cyc.cycjava.cycl.id_index.id_index_sparse_objects_empty_p;
import static com.cyc.cycjava.cycl.id_index.id_index_tombstone_p;
import static com.cyc.cycjava.cycl.subl_macro_promotions.$catch_error_message_target$;
import static com.cyc.cycjava.cycl.utilities_macros.convert_process_resource_tracking_timing_info_to_seconds;
import static com.cyc.cycjava.cycl.utilities_macros.nadd_clock_time_to_process_resource_timing_info;
import static com.cyc.cycjava.cycl.utilities_macros.process_resource_tracking_system_time;
import static com.cyc.cycjava.cycl.utilities_macros.process_resource_tracking_user_time;
import static com.cyc.cycjava.cycl.utilities_macros.process_resource_tracking_wall_clock_time;
import static com.cyc.cycjava.cycl.utilities_macros.register_cyc_api_function;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.cons;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.list;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Eval.eval;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions.apply;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.gethash_without_values;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.add;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.divide;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.subtract;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.length;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.nreverse;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.nsubstitute;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.symbol_function;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads.$is_thread_performing_cleanupP$;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Time.compute_with_process_resource_tracking_results;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Time.get_internal_real_time;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types.listp;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types.sublisp_null;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.getValuesAsVector;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.restoreValuesFromVector;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.values;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Vectors.aref;
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
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.second;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.subst;
import static com.cyc.tool.subl.util.SubLFiles.declareFunction;
import static com.cyc.tool.subl.util.SubLFiles.declareMacro;
import static com.cyc.tool.subl.util.SubLFiles.defvar;

import com.cyc.cycjava.cycl.bindings;
import com.cyc.cycjava.cycl.clauses;
import com.cyc.cycjava.cycl.cyc_kernel;
import com.cyc.cycjava.cycl.czer_vars;
import com.cyc.cycjava.cycl.fi;
import com.cyc.cycjava.cycl.hlmt;
import com.cyc.cycjava.cycl.list_utilities;
import com.cyc.cycjava.cycl.narts_high;
import com.cyc.cycjava.cycl.transform_list_utilities;
import com.cyc.cycjava.cycl.inference.janus;
import com.cyc.cycjava.cycl.inference.kbq_query_run;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Mapping;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.UnaryFunction;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.time_high;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLSystemTrampolineFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;


public final class inference_kernel extends SubLTranslatedFile {
    public static final SubLFile me = new inference_kernel();

    public static final String myName = "com.cyc.cycjava.cycl.inference.harness.inference_kernel";

    public static final String myFingerPrint = "babcee533184bc37a169f7393dc46790b1e9283cb48566db5ecad4ecdc3631ea";

    // defvar
    // Definitions
    /**
     * Temporary control variable. When non-nil, new-cyc-query uses
     * new-cyc-trivial-query-int for trivial queries. Eventually should stay T.
     */
    public static final SubLSymbol $new_cyc_trivial_query_enabledP$ = makeSymbol("*NEW-CYC-TRIVIAL-QUERY-ENABLED?*");



    private static final SubLSymbol QUERY_RESULTS_FOR_JAVA = makeSymbol("QUERY-RESULTS-FOR-JAVA");

    private static final SubLList $list2 = list(makeSymbol("FORM"));

    private static final SubLSymbol QUERY_RESULTS_FOR_JAVA_TRANSFORM = makeSymbol("QUERY-RESULTS-FOR-JAVA-TRANSFORM");





    private static final SubLSymbol INFERENCE_IDS = makeSymbol("INFERENCE-IDS");

    private static final SubLSymbol POSSIBLY_INFERENCE_SENTENCE_P = makeSymbol("POSSIBLY-INFERENCE-SENTENCE-P");









    private static final SubLSymbol $INFERENCE_ABORT_TARGET = makeKeyword("INFERENCE-ABORT-TARGET");







    private static final SubLList $list16 = list(makeSymbol("SENTENCE"), makeSymbol("&OPTIONAL"), makeSymbol("MT"), makeSymbol("QUERY-PROPERTIES"));

    private static final SubLString $str17$Creates__runs__and_destroys_an_in = makeString("Creates, runs, and destroys an inference.  Returns the results,\nwhose format is specified by the :return property of QUERY-PROPERTIES.\nIf :problem-store is specified in QUERY-PROPERTIES, uses that store,\notherwise creates a new one and destroys it afterwards.\n@param QUERY-PROPERTIES query-properties-p; see the definition of\n  query-properties-p for explanations of all query properties.\n@return 0 results, format specified by :return property\n@return 1 query-halt-reason-p, why the query halted\n@return 2 nil or inference-p; the inference object used to carry out\nthis inference, if the inference was specified to be :continuable?\nor :browsable?.  This inference object can be examined or continued.\nOne example use of the inference object is for sharing a problem store;\none can extract the problem store from the inference\n (@see inference-problem-store), and then start a new cyc query passing\nin the :problem-store property with the value you got from the first\ninference.  Don\'t forget to @xref destroy-problem-store when you\'re done.\n@return 3 metrics, format specified by :metrics property");

    private static final SubLList $list18 = list(list(makeSymbol("SENTENCE"), makeSymbol("POSSIBLY-INFERENCE-SENTENCE-P")), list(makeSymbol("MT"), list(makeSymbol("NIL-OR"), makeSymbol("POSSIBLY-MT-P"))), list(makeSymbol("QUERY-PROPERTIES"), makeSymbol("QUERY-PROPERTIES-P")));

    private static final SubLList $list19 = list(makeSymbol("LISTP"), makeSymbol("QUERY-HALT-REASON-P"), list(makeSymbol("NIL-OR"), makeSymbol("INFERENCE-P")), makeSymbol("LISTP"));

    private static final SubLSymbol $COMPLETE_USER_TIME = makeKeyword("COMPLETE-USER-TIME");

    private static final SubLSymbol $COMPLETE_SYSTEM_TIME = makeKeyword("COMPLETE-SYSTEM-TIME");

    private static final SubLSymbol $COMPLETE_TOTAL_TIME = makeKeyword("COMPLETE-TOTAL-TIME");





    private static final SubLSymbol $RECURSIVE_INFERENCE_ROOT_PROBLEMS = makeKeyword("RECURSIVE-INFERENCE-ROOT-PROBLEMS");



    private static final SubLSymbol QUERY_STATIC_OR_META_PROPERTIES_P = makeSymbol("QUERY-STATIC-OR-META-PROPERTIES-P");

    private static final SubLSymbol $kw28$CONDITIONAL_SENTENCE_ = makeKeyword("CONDITIONAL-SENTENCE?");

    private static final SubLString $str29$Unhandled_inference_error_during_ = makeString("Unhandled inference error during setup");



    private static final SubLSymbol DNF_P = makeSymbol("DNF-P");

    private static final SubLSymbol $NON_EXPLANATORY_SENTENCE = makeKeyword("NON-EXPLANATORY-SENTENCE");

    private static final SubLSymbol PROBLEM_STORE_PROPERTY_P = makeSymbol("PROBLEM-STORE-PROPERTY-P");

    private static final SubLSymbol CONTINUABLE_INFERENCE_P = makeSymbol("CONTINUABLE-INFERENCE-P");

    private static final SubLSymbol QUERY_DYNAMIC_PROPERTIES_P = makeSymbol("QUERY-DYNAMIC-PROPERTIES-P");

    private static final SubLString $str36$Inference_was_destroyed_while_run = makeString("Inference was destroyed while running.");



    private static final SubLSymbol INFERENCE_ERROR_HANDLER = makeSymbol("INFERENCE-ERROR-HANDLER");







    private static final SubLSymbol $BINDINGS_AND_SUPPORTS = makeKeyword("BINDINGS-AND-SUPPORTS");

    private static final SubLList $list43 = list(makeKeyword("BINDINGS"), makeKeyword("SUPPORTS"));

    private static final SubLSymbol $BINDINGS_AND_SUPPORTS_AND_PRAGMATIC_SUPPORTS = makeKeyword("BINDINGS-AND-SUPPORTS-AND-PRAGMATIC-SUPPORTS");

    private static final SubLList $list45 = list(makeKeyword("BINDINGS"), makeKeyword("SUPPORTS"), makeKeyword("PRAGMATIC-SUPPORTS"));

    private static final SubLSymbol $BINDINGS_AND_HYPOTHETICAL_BINDINGS = makeKeyword("BINDINGS-AND-HYPOTHETICAL-BINDINGS");

    private static final SubLString $str47$Unexpected_return_type_specified_ = makeString("Unexpected return type specified: ~a");

    private static final SubLString $str48$Ill_formed__template_return_type_ = makeString("Ill-formed :template return type ~a");



    private static final SubLList $list50 = list(makeSymbol("FORMAT"), makeSymbol("CONTROL-STRING"), makeSymbol("&REST"), makeSymbol("VARIABLES"));







    private static final SubLSymbol $sym54$_APPEND_STACK_TRACES_TO_ERROR_MESSAGES__ = makeSymbol("*APPEND-STACK-TRACES-TO-ERROR-MESSAGES?*");

    private static final SubLList $list55 = list(makeSymbol("CSETQ"), makeSymbol("*APPEND-STACK-TRACES-TO-ERROR-MESSAGES?*"), NIL);





    private static final SubLString $str58$_A = makeString("~A");





    private static final SubLString $str61$Unexpected_inference_status__s = makeString("Unexpected inference status ~s");

    private static final SubLSymbol INFERENCE_ANSWER_LANGUAGE_P = makeSymbol("INFERENCE-ANSWER-LANGUAGE-P");



    private static final SubLSymbol INFERENCE_ANSWER_BINDINGS = makeSymbol("INFERENCE-ANSWER-BINDINGS");

    private static final SubLSymbol INFERENCE_ANSWER_EL_BINDINGS = makeSymbol("INFERENCE-ANSWER-EL-BINDINGS");

    private static final SubLList $list66 = cons(makeSymbol("VARIABLE"), makeSymbol("VALUE"));

    private static final SubLSymbol CONVERT_HL_SUPPORT_TO_EL_SUPPORT = makeSymbol("CONVERT-HL-SUPPORT-TO-EL-SUPPORT");

    public static SubLObject new_browsable_cyc_query(final SubLObject sentence, SubLObject mt, SubLObject v_properties) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (v_properties == UNPROVIDED) {
            v_properties = NIL;
        }
        SubLObject new_properties = copy_list(v_properties);
        new_properties = putf(v_properties, $BROWSABLE_, T);
        return new_cyc_query(sentence, mt, new_properties);
    }

    public static SubLObject new_browsable_cyc_query_from_dnf(final SubLObject dnf, final SubLObject mt, SubLObject scoped_vars, SubLObject v_properties) {
        if (scoped_vars == UNPROVIDED) {
            scoped_vars = NIL;
        }
        if (v_properties == UNPROVIDED) {
            v_properties = NIL;
        }
        SubLObject new_properties = copy_list(v_properties);
        new_properties = putf(v_properties, $BROWSABLE_, T);
        return new_cyc_query_from_dnf(dnf, mt, scoped_vars, new_properties);
    }

    public static SubLObject query_results_for_java(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject form = NIL;
        destructuring_bind_must_consp(current, datum, $list2);
        form = current.first();
        current = current.rest();
        if (NIL == current) {
            return list(QUERY_RESULTS_FOR_JAVA_TRANSFORM, list(MULTIPLE_VALUE_LIST, form));
        }
        cdestructuring_bind_error(datum, $list2);
        return NIL;
    }

    public static SubLObject query_results_for_java_transform(final SubLObject results_list) {
        return transform_list_utilities.ntransform(results_list, INFERENCE_P, INFERENCE_IDS, UNPROVIDED, UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject new_cyc_query(final SubLObject sentence, SubLObject mt, SubLObject query_properties) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (query_properties == UNPROVIDED) {
            query_properties = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLSystemTrampolineFile.enforceType(sentence, POSSIBLY_INFERENCE_SENTENCE_P);
        if (NIL != mt) {
            SubLSystemTrampolineFile.enforceType(mt, POSSIBLY_MT_P);
        }
        SubLSystemTrampolineFile.enforceType(query_properties, QUERY_PROPERTIES_P);
        SubLSystemTrampolineFile.enforceType(sentence, POSSIBLY_INFERENCE_SENTENCE_P);
        final SubLObject plist_var = query_properties;
        SubLSystemTrampolineFile.enforceType(plist_var, PROPERTY_LIST_P);
        SubLObject remainder;
        SubLObject property;
        SubLObject value;
        for (remainder = NIL, remainder = plist_var; NIL != remainder; remainder = cddr(remainder)) {
            property = remainder.first();
            value = cadr(remainder);
            SubLSystemTrampolineFile.enforceType(property, QUERY_PROPERTY_P);
        }
        if (NIL != mt) {
            SubLSystemTrampolineFile.enforceType(mt, POSSIBLY_MT_P);
        }
        SubLObject result = NIL;
        SubLObject halt_reason = NIL;
        SubLObject inference = NIL;
        SubLObject metrics = NIL;
        SubLObject timing_info = NIL;
        SubLObject timing_info_$1 = NIL;
        SubLObject clock_time = NIL;
        final SubLObject time_var = get_internal_real_time();
        final SubLObject resource_tracking_env_var = get_internal_real_time();
        final SubLObject _prev_bind_0 = $janus_within_somethingP$.currentBinding(thread);
        try {
            $janus_within_somethingP$.bind(T, thread);
            SubLObject aborted_p = NIL;
            try {
                thread.throwStack.push($INFERENCE_ABORT_TARGET);
                final SubLObject _prev_bind_0_$2 = inference_strategist.$within_inference_control_processP$.currentBinding(thread);
                try {
                    inference_strategist.$within_inference_control_processP$.bind(T, thread);
                    if (NIL != $new_cyc_trivial_query_enabledP$.getDynamicValue(thread)) {
                        thread.resetMultipleValues();
                        final SubLObject result_$3 = inference_trivial.new_cyc_trivial_query_int(sentence, mt, query_properties);
                        final SubLObject halt_reason_$4 = thread.secondMultipleValue();
                        final SubLObject metrics_$5 = thread.thirdMultipleValue();
                        thread.resetMultipleValues();
                        result = result_$3;
                        halt_reason = halt_reason_$4;
                        metrics = metrics_$5;
                    }
                    if ((NIL == $new_cyc_trivial_query_enabledP$.getDynamicValue(thread)) || ($NON_TRIVIAL == halt_reason)) {
                        final SubLObject input_query_properties = copy_list(query_properties);
                        final SubLObject input_static_properties = inference_datastructures_enumerated_types.extract_query_static_properties(input_query_properties);
                        final SubLObject input_dynamic_properties = inference_datastructures_enumerated_types.extract_query_dynamic_properties(input_query_properties);
                        final SubLObject overridden_query_properties = inference_strategist.explicify_inference_mode_defaults(query_properties);
                        final SubLObject query_static_properties = inference_datastructures_enumerated_types.extract_query_static_properties(overridden_query_properties);
                        final SubLObject query_dynamic_properties = inference_datastructures_enumerated_types.extract_query_dynamic_properties(overridden_query_properties);
                        final SubLObject problem_store_privateP = sublisp_null(inference_datastructures_enumerated_types.inference_properties_problem_store(query_static_properties));
                        inference = new_continuable_inference_int(sentence, mt, input_static_properties, query_static_properties);
                        inference_datastructures_inference.set_inference_input_query_properties(inference, input_query_properties);
                        kbq_query_run.possibly_set_kbq_runstate_inference(inference);
                        thread.resetMultipleValues();
                        final SubLObject result_$4 = new_cyc_query_int(inference, input_dynamic_properties, query_dynamic_properties, problem_store_privateP);
                        final SubLObject halt_reason_$5 = thread.secondMultipleValue();
                        final SubLObject inference_$8 = thread.thirdMultipleValue();
                        final SubLObject metrics_$6 = thread.fourthMultipleValue();
                        thread.resetMultipleValues();
                        result = result_$4;
                        halt_reason = halt_reason_$5;
                        inference = inference_$8;
                        metrics = metrics_$6;
                    }
                } finally {
                    inference_strategist.$within_inference_control_processP$.rebind(_prev_bind_0_$2, thread);
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
        } finally {
            $janus_within_somethingP$.rebind(_prev_bind_0, thread);
        }
        janus.janus_note_query_finished(sentence, mt, query_properties, result, halt_reason);
        timing_info_$1 = compute_with_process_resource_tracking_results(resource_tracking_env_var);
        clock_time = divide(subtract(get_internal_real_time(), time_var), time_high.$internal_time_units_per_second$.getGlobalValue());
        timing_info = convert_process_resource_tracking_timing_info_to_seconds(nadd_clock_time_to_process_resource_timing_info(clock_time, timing_info_$1));
        metrics = update_query_metrics_wrt_timing_info(metrics, timing_info);
        return values(result, halt_reason, inference, metrics);
    }

    public static SubLObject update_query_metrics_wrt_timing_info(SubLObject metrics, final SubLObject timing_info) {
        if (NIL != metrics) {
            final SubLObject complete_user_time = process_resource_tracking_user_time(timing_info);
            final SubLObject complete_system_time = process_resource_tracking_system_time(timing_info);
            final SubLObject complete_total_time = process_resource_tracking_wall_clock_time(timing_info);
            metrics = nsubstitute(complete_user_time, $COMPLETE_USER_TIME, metrics, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            metrics = nsubstitute(complete_system_time, $COMPLETE_SYSTEM_TIME, metrics, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            metrics = nsubstitute(complete_total_time, $COMPLETE_TOTAL_TIME, metrics, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        }
        return metrics;
    }

    public static SubLObject new_cyc_query_from_dnf(final SubLObject dnf, final SubLObject mt, SubLObject scoped_vars, SubLObject query_properties) {
        if (scoped_vars == UNPROVIDED) {
            scoped_vars = NIL;
        }
        if (query_properties == UNPROVIDED) {
            query_properties = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (((NIL != mt) && (!SubLSystemTrampolineFile.assertionsDisabledInClass)) && (NIL == hlmt.possibly_mt_p(mt))) {
            throw new AssertionError(mt);
        }
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
        SubLObject inference = NIL;
        SubLObject metrics = NIL;
        SubLObject timing_info = NIL;
        SubLObject timing_info_$10 = NIL;
        SubLObject clock_time = NIL;
        final SubLObject time_var = get_internal_real_time();
        final SubLObject resource_tracking_env_var = get_internal_real_time();
        SubLObject aborted_p = NIL;
        try {
            thread.throwStack.push($INFERENCE_ABORT_TARGET);
            final SubLObject _prev_bind_0 = inference_strategist.$within_inference_control_processP$.currentBinding(thread);
            try {
                inference_strategist.$within_inference_control_processP$.bind(T, thread);
                if (NIL != $new_cyc_trivial_query_enabledP$.getDynamicValue(thread)) {
                    thread.resetMultipleValues();
                    final SubLObject result_$11 = inference_trivial.new_cyc_trivial_query_from_dnf_int(dnf, mt, scoped_vars, query_properties);
                    final SubLObject halt_reason_$12 = thread.secondMultipleValue();
                    final SubLObject metrics_$13 = thread.thirdMultipleValue();
                    thread.resetMultipleValues();
                    result = result_$11;
                    halt_reason = halt_reason_$12;
                    metrics = metrics_$13;
                }
                if ((NIL == $new_cyc_trivial_query_enabledP$.getDynamicValue(thread)) || ($NON_TRIVIAL == halt_reason)) {
                    final SubLObject input_query_properties = copy_list(query_properties);
                    final SubLObject input_static_properties = inference_datastructures_enumerated_types.extract_query_static_properties(input_query_properties);
                    final SubLObject input_dynamic_properties = inference_datastructures_enumerated_types.extract_query_dynamic_properties(input_query_properties);
                    final SubLObject overridden_query_properties = inference_strategist.explicify_inference_mode_defaults(query_properties);
                    final SubLObject query_static_properties = inference_datastructures_enumerated_types.extract_query_static_properties(overridden_query_properties);
                    final SubLObject query_dynamic_properties = inference_datastructures_enumerated_types.extract_query_dynamic_properties(overridden_query_properties);
                    final SubLObject problem_store_privateP = sublisp_null(inference_datastructures_enumerated_types.inference_properties_problem_store(query_static_properties));
                    inference = new_continuable_inference_from_dnf_int(dnf, mt, scoped_vars, input_static_properties, query_static_properties);
                    inference_datastructures_inference.set_inference_input_query_properties(inference, input_query_properties);
                    thread.resetMultipleValues();
                    final SubLObject result_$12 = new_cyc_query_int(inference, input_dynamic_properties, query_dynamic_properties, problem_store_privateP);
                    final SubLObject halt_reason_$13 = thread.secondMultipleValue();
                    final SubLObject inference_$16 = thread.thirdMultipleValue();
                    final SubLObject metrics_$14 = thread.fourthMultipleValue();
                    thread.resetMultipleValues();
                    result = result_$12;
                    halt_reason = halt_reason_$13;
                    inference = inference_$16;
                    metrics = metrics_$14;
                }
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
        timing_info_$10 = compute_with_process_resource_tracking_results(resource_tracking_env_var);
        clock_time = divide(subtract(get_internal_real_time(), time_var), time_high.$internal_time_units_per_second$.getGlobalValue());
        timing_info = convert_process_resource_tracking_timing_info_to_seconds(nadd_clock_time_to_process_resource_timing_info(clock_time, timing_info_$10));
        metrics = update_query_metrics_wrt_timing_info(metrics, timing_info);
        return values(result, halt_reason, inference, metrics);
    }

    public static SubLObject new_cyc_query_int(final SubLObject inference, final SubLObject input_dynamic_properties, final SubLObject query_dynamic_properties, final SubLObject problem_store_privateP) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject inference_dynamic_properties = inference_datastructures_enumerated_types.extract_inference_dynamic_properties(query_dynamic_properties);
        final SubLObject destroy_storeP = makeBoolean((NIL != problem_store_privateP) && (NIL == inference_datastructures_enumerated_types.inference_properties_browsableP(inference_dynamic_properties)));
        final SubLObject browsableP = inference_datastructures_enumerated_types.inference_properties_browsableP(inference_dynamic_properties);
        if (NIL != destroy_storeP) {
            final SubLObject store = inference_datastructures_inference.inference_problem_store(inference);
            inference_datastructures_problem_store.note_problem_store_destruction_imminent(store);
        }
        final SubLObject outer_tactic = inference_worker.currently_executing_tactic();
        if (NIL != outer_tactic) {
            inference_datastructures_tactic.push_tactic_property(outer_tactic, $RECURSIVE_INFERENCES, inference);
            inference_datastructures_tactic.push_tactic_property(outer_tactic, $RECURSIVE_INFERENCE_ROOT_PROBLEMS, inference_datastructures_inference.inference_root_problem(inference));
            inference_datastructures_inference.set_inference_property(inference, $MOTIVATING_TACTIC, outer_tactic);
        }
        SubLObject results = NIL;
        SubLObject halt_reason = NIL;
        SubLObject continued_inference = NIL;
        SubLObject metrics = NIL;
        try {
            final SubLObject _prev_bind_0 = inference_worker.$currently_active_problem_store$.currentBinding(thread);
            try {
                inference_worker.$currently_active_problem_store$.bind(inference_datastructures_inference.inference_problem_store(inference), thread);
                if (NIL != inference_datastructures_inference.continuable_inference_p(inference)) {
                    thread.resetMultipleValues();
                    final SubLObject results_$18 = continue_inference_int(inference, input_dynamic_properties, query_dynamic_properties);
                    final SubLObject halt_reason_$19 = thread.secondMultipleValue();
                    final SubLObject continued_inference_$20 = thread.thirdMultipleValue();
                    final SubLObject metrics_$21 = thread.fourthMultipleValue();
                    thread.resetMultipleValues();
                    results = results_$18;
                    halt_reason = halt_reason_$19;
                    continued_inference = continued_inference_$20;
                    metrics = metrics_$21;
                } else {
                    thread.resetMultipleValues();
                    final SubLObject results_$19 = handle_non_continuable_inference_status(inference);
                    final SubLObject halt_reason_$20 = thread.secondMultipleValue();
                    final SubLObject metrics_$22 = thread.thirdMultipleValue();
                    thread.resetMultipleValues();
                    results = results_$19;
                    halt_reason = halt_reason_$20;
                    metrics = metrics_$22;
                }
            } finally {
                inference_worker.$currently_active_problem_store$.rebind(_prev_bind_0, thread);
            }
        } finally {
            final SubLObject _prev_bind_2 = $is_thread_performing_cleanupP$.currentBinding(thread);
            try {
                $is_thread_performing_cleanupP$.bind(T, thread);
                final SubLObject _values = getValuesAsVector();
                final SubLObject inference_problem_store = inference_datastructures_inference.inference_problem_store(inference);
                final SubLObject destroy_inferenceP = makeBoolean(NIL == browsableP);
                if (NIL != destroy_inferenceP) {
                    inference_datastructures_inference.destroy_inference(inference);
                }
                if (NIL != destroy_storeP) {
                    inference_datastructures_problem_store.destroy_problem_store(inference_problem_store);
                }
                restoreValuesFromVector(_values);
            } finally {
                $is_thread_performing_cleanupP$.rebind(_prev_bind_2, thread);
            }
        }
        if (NIL != browsableP) {
            return values(results, halt_reason, inference, metrics);
        }
        return values(results, halt_reason, NIL, metrics);
    }

    public static SubLObject new_continuable_inference(final SubLObject sentence, SubLObject mt, SubLObject query_static_properties) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (query_static_properties == UNPROVIDED) {
            query_static_properties = NIL;
        }
        assert NIL != possibly_inference_sentence_p(sentence) : "el_utilities.possibly_inference_sentence_p(sentence) " + "CommonSymbols.NIL != el_utilities.possibly_inference_sentence_p(sentence) " + sentence;
        if (((NIL != mt) && (!SubLSystemTrampolineFile.assertionsDisabledInClass)) && (NIL == hlmt.possibly_mt_p(mt))) {
            throw new AssertionError(mt);
        }
        assert NIL != inference_datastructures_enumerated_types.query_static_or_meta_properties_p(query_static_properties) : "inference_datastructures_enumerated_types.query_static_or_meta_properties_p(query_static_properties) " + "CommonSymbols.NIL != inference_datastructures_enumerated_types.query_static_or_meta_properties_p(query_static_properties) " + query_static_properties;
        janus.janus_note_new_continuable_inference(sentence, mt, query_static_properties);
        final SubLObject input_static_properties = copy_list(query_static_properties);
        final SubLObject overridden_static_properties = inference_datastructures_enumerated_types.extract_query_static_properties(inference_strategist.explicify_inference_mode_defaults(query_static_properties));
        return new_continuable_inference_int(sentence, mt, input_static_properties, overridden_static_properties);
    }

    public static SubLObject new_continuable_inference_int(final SubLObject sentence, SubLObject mt, SubLObject input_static_properties, SubLObject query_static_properties) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (input_static_properties == UNPROVIDED) {
            input_static_properties = NIL;
        }
        if (query_static_properties == UNPROVIDED) {
            query_static_properties = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject completed_without_errorP = NIL;
        SubLObject inference = NIL;
        try {
            thread.resetMultipleValues();
            final SubLObject inference_static_properties = extract_some_inference_properties(query_static_properties);
            final SubLObject non_explanatory_sentence = thread.secondMultipleValue();
            final SubLObject problem_store_privateP = thread.thirdMultipleValue();
            final SubLObject store = thread.fourthMultipleValue();
            thread.resetMultipleValues();
            final SubLObject hypothesizeP = getf(inference_static_properties, $kw28$CONDITIONAL_SENTENCE_, UNPROVIDED);
            final SubLObject disjunction_free_el_vars_policy = inference_datastructures_enumerated_types.inference_properties_disjunction_free_el_vars_policy(inference_static_properties);
            final SubLObject strategy_type = inference_strategist.strategy_type_from_sentence_and_static_properties(sentence, mt, query_static_properties);
            final SubLObject _prev_bind_0 = czer_vars.$create_narts_regardless_of_whether_within_assertP$.currentBinding(thread);
            try {
                czer_vars.$create_narts_regardless_of_whether_within_assertP$.bind(inference_datastructures_problem_store.problem_store_new_terms_allowedP(store), thread);
                inference = inference_strategist.simplest_inference_prepare_new(store, sentence, mt, strategy_type, disjunction_free_el_vars_policy, hypothesizeP, non_explanatory_sentence, problem_store_privateP);
                initialize_inference_properties(inference, input_static_properties, inference_static_properties, query_static_properties);
                completed_without_errorP = T;
            } finally {
                czer_vars.$create_narts_regardless_of_whether_within_assertP$.rebind(_prev_bind_0, thread);
            }
        } finally {
            final SubLObject _prev_bind_2 = $is_thread_performing_cleanupP$.currentBinding(thread);
            try {
                $is_thread_performing_cleanupP$.bind(T, thread);
                final SubLObject _values = getValuesAsVector();
                if ((NIL == completed_without_errorP) && (NIL != inference_datastructures_inference.valid_inference_p(inference))) {
                    inference_datastructures_inference.set_inference_suspend_status(inference, inference_datastructures_enumerated_types.new_inference_error_suspend_status($str29$Unhandled_inference_error_during_));
                    inference_datastructures_inference.set_inference_status(inference, $SUSPENDED);
                }
                restoreValuesFromVector(_values);
            } finally {
                $is_thread_performing_cleanupP$.rebind(_prev_bind_2, thread);
            }
        }
        return inference;
    }

    public static SubLObject new_continuable_inference_from_dnf(final SubLObject dnf, final SubLObject mt, SubLObject scoped_vars, SubLObject query_static_properties) {
        if (scoped_vars == UNPROVIDED) {
            scoped_vars = NIL;
        }
        if (query_static_properties == UNPROVIDED) {
            query_static_properties = NIL;
        }
        assert NIL != clauses.dnf_p(dnf) : "clauses.dnf_p(dnf) " + "CommonSymbols.NIL != clauses.dnf_p(dnf) " + dnf;
        assert NIL != hlmt.possibly_mt_p(mt) : "hlmt.possibly_mt_p(mt) " + "CommonSymbols.NIL != hlmt.possibly_mt_p(mt) " + mt;
        assert NIL != listp(scoped_vars) : "Types.listp(scoped_vars) " + "CommonSymbols.NIL != Types.listp(scoped_vars) " + scoped_vars;
        assert NIL != inference_datastructures_enumerated_types.query_static_or_meta_properties_p(query_static_properties) : "inference_datastructures_enumerated_types.query_static_or_meta_properties_p(query_static_properties) " + "CommonSymbols.NIL != inference_datastructures_enumerated_types.query_static_or_meta_properties_p(query_static_properties) " + query_static_properties;
        final SubLObject input_static_properties = copy_list(query_static_properties);
        final SubLObject overridden_static_properties = inference_datastructures_enumerated_types.extract_query_static_properties(inference_strategist.explicify_inference_mode_defaults(query_static_properties));
        return new_continuable_inference_from_dnf_int(dnf, mt, scoped_vars, input_static_properties, overridden_static_properties);
    }

    public static SubLObject new_continuable_inference_from_dnf_int(final SubLObject dnf, final SubLObject mt, final SubLObject scoped_vars, final SubLObject input_static_properties, final SubLObject query_static_properties) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        thread.resetMultipleValues();
        final SubLObject inference_static_properties = extract_some_inference_properties(query_static_properties);
        final SubLObject non_explanatory_sentence = thread.secondMultipleValue();
        final SubLObject problem_store_privateP = thread.thirdMultipleValue();
        final SubLObject store = thread.fourthMultipleValue();
        thread.resetMultipleValues();
        final SubLObject strategy_type = inference_strategist.strategy_type_from_dnf_and_static_properties(dnf, mt, query_static_properties);
        final SubLObject inference = inference_strategist.simplest_inference_prepare_new_from_dnf(store, dnf, mt, strategy_type, scoped_vars, non_explanatory_sentence, problem_store_privateP);
        initialize_inference_properties(inference, input_static_properties, inference_static_properties, query_static_properties);
        return inference;
    }

    public static SubLObject extract_some_inference_properties(final SubLObject query_static_properties) {
        final SubLObject inference_static_properties = inference_datastructures_enumerated_types.extract_inference_static_properties(query_static_properties);
        final SubLObject non_explanatory_sentence = getf(inference_static_properties, $NON_EXPLANATORY_SENTENCE, UNPROVIDED);
        final SubLObject problem_store_privateP = sublisp_null(inference_datastructures_enumerated_types.inference_properties_problem_store(query_static_properties));
        final SubLObject store = problem_store_from_properties(query_static_properties);
        return values(inference_static_properties, non_explanatory_sentence, problem_store_privateP, store);
    }

    public static SubLObject initialize_inference_properties(final SubLObject inference, final SubLObject input_static_properties, final SubLObject inference_static_properties, final SubLObject query_static_properties) {
        inference_datastructures_inference.set_inference_input_query_properties(inference, input_static_properties);
        inference_datastructures_inference.inference_set_static_properties(inference, inference_static_properties);
        final SubLObject strategy = inference_datastructures_inference.simplest_inference_strategy(inference);
        final SubLObject strategy_static_properties = inference_datastructures_enumerated_types.extract_strategy_static_properties(query_static_properties);
        inference_tactician.strategy_initialize_properties(strategy, strategy_static_properties);
        return inference;
    }

    public static SubLObject problem_store_from_properties(final SubLObject static_properties) {
        final SubLObject problem_store = inference_datastructures_enumerated_types.inference_properties_problem_store(static_properties);
        if (NIL != problem_store) {
            return problem_store;
        }
        final SubLObject problem_store_properties = extract_problem_store_properties_from_query_static_properties(static_properties);
        return inference_datastructures_problem_store.new_problem_store(problem_store_properties);
    }

    public static SubLObject extract_problem_store_properties_from_query_static_properties(final SubLObject query_static_properties) {
        return list_utilities.filter_plist(query_static_properties, PROBLEM_STORE_PROPERTY_P);
    }

    public static SubLObject continue_inference(final SubLObject inference, SubLObject query_dynamic_properties) {
        if (query_dynamic_properties == UNPROVIDED) {
            query_dynamic_properties = NIL;
        }
        SubLSystemTrampolineFile.enforceType(inference, CONTINUABLE_INFERENCE_P);
        assert NIL != inference_datastructures_enumerated_types.query_dynamic_properties_p(query_dynamic_properties) : "inference_datastructures_enumerated_types.query_dynamic_properties_p(query_dynamic_properties) " + "CommonSymbols.NIL != inference_datastructures_enumerated_types.query_dynamic_properties_p(query_dynamic_properties) " + query_dynamic_properties;
        final SubLObject input_dynamic_properties = copy_list(query_dynamic_properties);
        final SubLObject overridden_dynamic_properties = inference_datastructures_enumerated_types.extract_query_dynamic_properties(inference_strategist.explicify_inference_mode_defaults(query_dynamic_properties));
        return continue_inference_int(inference, input_dynamic_properties, overridden_dynamic_properties);
    }

    public static SubLObject continue_inference_int(final SubLObject inference, final SubLObject input_dynamic_properties, final SubLObject overridden_dynamic_properties) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        inference_update_properties(inference, input_dynamic_properties, overridden_dynamic_properties);
        inference_strategist.consider_switching_strategies(inference);
        inference_datastructures_inference.reset_inference_new_answers(inference);
        final SubLObject _prev_bind_0 = inference_macros.$controlling_inferences$.currentBinding(thread);
        try {
            inference_macros.$controlling_inferences$.bind(cons(inference, inference_macros.$controlling_inferences$.getDynamicValue(thread)), thread);
            inference_strategist.inference_run(inference);
        } finally {
            inference_macros.$controlling_inferences$.rebind(_prev_bind_0, thread);
        }
        return inference_postprocess(inference);
    }

    public static SubLObject inference_update_properties(final SubLObject inference, final SubLObject input_dynamic_properties, final SubLObject query_dynamic_properties) {
        final SubLObject inference_dynamic_properties = inference_datastructures_enumerated_types.extract_inference_dynamic_properties(query_dynamic_properties);
        if (NIL != inference_datastructures_inference.prepared_inference_p(inference)) {
            inference_strategist.inference_update_dynamic_properties(inference, inference_dynamic_properties);
            inference_strategist.strengthen_query_properties_using_inference(inference);
        } else {
            inference_strategist.inference_update_dynamic_properties(inference, inference_dynamic_properties);
        }
        inference_datastructures_inference.update_inference_input_query_properties(inference, input_dynamic_properties);
        final SubLObject strategy_dynamic_properties = inference_datastructures_enumerated_types.extract_strategy_dynamic_properties(query_dynamic_properties);
        final SubLObject strategy = inference_datastructures_inference.simplest_inference_strategy(inference);
        inference_tactician.strategy_update_properties(strategy, strategy_dynamic_properties);
        inference_datastructures_problem_store.finalize_problem_store_properties(inference_datastructures_inference.inference_problem_store(inference));
        return inference;
    }

    public static SubLObject inference_postprocess(final SubLObject inference) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != inference_datastructures_inference.inference_p(inference) : "inference_datastructures_inference.inference_p(inference) " + "CommonSymbols.NIL != inference_datastructures_inference.inference_p(inference) " + inference;
        SubLObject result = NIL;
        SubLObject halt_reason = NIL;
        SubLObject return_inference = NIL;
        SubLObject metrics = NIL;
        SubLObject error_message = NIL;
        if (NIL != $inference_debugP$.getDynamicValue(thread)) {
            if (NIL == inference_datastructures_inference.valid_inference_p(inference)) {
                Errors.error($str36$Inference_was_destroyed_while_run);
            }
            final SubLObject answers = inference_datastructures_inference.inference_all_new_answers(inference);
            halt_reason = inference_datastructures_inference.inference_suspend_status(inference);
            if (NIL != inference_datastructures_inference.inference_browsableP(inference)) {
                return_inference = inference;
            }
            metrics = inference_datastructures_inference.inference_compute_metrics(inference);
            result = inference_result_from_answers(inference, answers);
            if (NIL != inference_datastructures_inference.inference_forget_extra_resultsP(inference)) {
                result = filter_out_extra_inference_results(result, inference);
            }
            if (NIL != inference_datastructures_inference.inference_cache_resultsP(inference)) {
                SubLObject cdolist_list_var = answers;
                SubLObject v_answer = NIL;
                v_answer = cdolist_list_var.first();
                while (NIL != cdolist_list_var) {
                    inference_strategist.cache_inference_answer(v_answer);
                    cdolist_list_var = cdolist_list_var.rest();
                    v_answer = cdolist_list_var.first();
                } 
            }
        } else {
            try {
                thread.throwStack.push($INFERENCE_ERROR);
                final SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding(thread);
                try {
                    Errors.$error_handler$.bind(symbol_function(INFERENCE_ERROR_HANDLER), thread);
                    try {
                        if (NIL == inference_datastructures_inference.valid_inference_p(inference)) {
                            Errors.error($str36$Inference_was_destroyed_while_run);
                        }
                        final SubLObject answers2 = inference_datastructures_inference.inference_all_new_answers(inference);
                        halt_reason = inference_datastructures_inference.inference_suspend_status(inference);
                        if (NIL != inference_datastructures_inference.inference_browsableP(inference)) {
                            return_inference = inference;
                        }
                        metrics = inference_datastructures_inference.inference_compute_metrics(inference);
                        result = inference_result_from_answers(inference, answers2);
                        if (NIL != inference_datastructures_inference.inference_forget_extra_resultsP(inference)) {
                            result = filter_out_extra_inference_results(result, inference);
                        }
                        if (NIL != inference_datastructures_inference.inference_cache_resultsP(inference)) {
                            SubLObject cdolist_list_var2 = answers2;
                            SubLObject v_answer2 = NIL;
                            v_answer2 = cdolist_list_var2.first();
                            while (NIL != cdolist_list_var2) {
                                inference_strategist.cache_inference_answer(v_answer2);
                                cdolist_list_var2 = cdolist_list_var2.rest();
                                v_answer2 = cdolist_list_var2.first();
                            } 
                        }
                    } catch (final Throwable catch_var) {
                        Errors.handleThrowable(catch_var, NIL);
                    }
                } finally {
                    Errors.$error_handler$.rebind(_prev_bind_0, thread);
                }
            } catch (final Throwable ccatch_env_var) {
                error_message = Errors.handleThrowable(ccatch_env_var, $INFERENCE_ERROR);
            } finally {
                thread.throwStack.pop();
            }
        }
        if (NIL != error_message) {
            halt_reason = inference_datastructures_enumerated_types.new_inference_error_suspend_status(error_message);
        }
        return values(result, halt_reason, return_inference, metrics);
    }

    public static SubLObject inference_result_from_answers(final SubLObject inference, final SubLObject answers) {
        final SubLObject answer_language = inference_datastructures_inference.inference_answer_language(inference);
        final SubLObject return_type = inference_datastructures_inference.inference_return_type(inference);
        SubLObject result = NIL;
        final SubLObject pcase_var = return_type;
        if (pcase_var.eql($ANSWER)) {
            result = answers;
        } else
            if (pcase_var.eql($BINDINGS)) {
                result = inference_result_from_answers_via_template(answers, $BINDINGS);
            } else
                if (pcase_var.eql($SUPPORTS)) {
                    result = inference_result_from_answers_via_template(answers, $SUPPORTS);
                } else
                    if (pcase_var.eql($BINDINGS_AND_SUPPORTS)) {
                        result = inference_result_from_answers_via_template(answers, $list43);
                    } else
                        if (pcase_var.eql($BINDINGS_AND_SUPPORTS_AND_PRAGMATIC_SUPPORTS)) {
                            result = inference_result_from_answers_via_template(answers, $list45);
                        } else
                            if (pcase_var.eql($BINDINGS_AND_HYPOTHETICAL_BINDINGS)) {
                                final SubLObject hypothetical_bindings = inference_datastructures_inference.inference_hypothetical_bindings(inference);
                                result = list(inference_answers_to_bindings(answers, answer_language), hypothetical_bindings);
                            } else
                                if (NIL != inference_datastructures_enumerated_types.inference_template_return_type_p(return_type)) {
                                    final SubLObject template = inference_template_return_type_template(return_type);
                                    result = inference_result_from_answers_via_template(answers, template);
                                } else
                                    if (NIL != inference_datastructures_enumerated_types.inference_format_return_type_p(return_type)) {
                                        result = inference_answers_via_format(answers, return_type);
                                    } else {
                                        Errors.error($str47$Unexpected_return_type_specified_, return_type);
                                    }







        return result;
    }

    public static SubLObject inference_result_from_all_answers(final SubLObject inference) {
        final SubLObject answers = inference_datastructures_inference.inference_all_answers(inference, UNPROVIDED);
        return inference_result_from_answers(inference, answers);
    }

    public static SubLObject inference_template_return_type_template(final SubLObject return_type) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if ((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) && (NIL == list_utilities.lengthE(return_type, TWO_INTEGER, UNPROVIDED))) {
            Errors.error($str48$Ill_formed__template_return_type_, return_type);
        }
        return second(return_type);
    }

    public static SubLObject inference_result_from_answers_via_template(final SubLObject answers, final SubLObject template) {
        final SubLObject process_supportsP = list_utilities.simple_tree_findP($SUPPORTS, template);
        final SubLObject process_pragmatic_supportsP = list_utilities.simple_tree_findP($PRAGMATIC_SUPPORTS, template);
        SubLObject results = NIL;
        SubLObject cdolist_list_var = answers;
        SubLObject v_answer = NIL;
        v_answer = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            final SubLObject v_bindings = inference_datastructures_inference.inference_answer_result_bindings(v_answer);
            final SubLObject result = inference_one_result_from_bindings_via_template(v_bindings, template);
            if ((NIL == process_supportsP) && (NIL == process_pragmatic_supportsP)) {
                results = cons(result, results);
            } else
                if (inference_datastructures_inference.inference_answer_justification_count(v_answer).isZero()) {
                    final SubLObject supports = NIL;
                    final SubLObject pragmatic_supports = NIL;
                    SubLObject support_result = result;
                    support_result = subst(supports, $SUPPORTS, support_result, UNPROVIDED, UNPROVIDED);
                    support_result = subst(pragmatic_supports, $PRAGMATIC_SUPPORTS, support_result, UNPROVIDED, UNPROVIDED);
                    results = cons(support_result, results);
                } else {
                    SubLObject cdolist_list_var_$25 = inference_datastructures_inference.inference_answer_justifications(v_answer);
                    SubLObject justification = NIL;
                    justification = cdolist_list_var_$25.first();
                    while (NIL != cdolist_list_var_$25) {
                        final SubLObject supports2 = inference_datastructures_inference.inference_answer_justification_supports(justification);
                        final SubLObject pragmatic_supports2 = inference_datastructures_inference.inference_answer_justification_pragmatic_supports(justification);
                        SubLObject support_result2 = result;
                        support_result2 = subst(supports2, $SUPPORTS, support_result2, UNPROVIDED, UNPROVIDED);
                        support_result2 = subst(pragmatic_supports2, $PRAGMATIC_SUPPORTS, support_result2, UNPROVIDED, UNPROVIDED);
                        results = cons(support_result2, results);
                        cdolist_list_var_$25 = cdolist_list_var_$25.rest();
                        justification = cdolist_list_var_$25.first();
                    } 
                }

            cdolist_list_var = cdolist_list_var.rest();
            v_answer = cdolist_list_var.first();
        } 
        return nreverse(results);
    }

    public static SubLObject inference_result_from_binding_lists_via_template(final SubLObject binding_lists, final SubLObject template) {
        SubLObject results = NIL;
        SubLObject cdolist_list_var = binding_lists;
        SubLObject v_bindings = NIL;
        v_bindings = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            final SubLObject result = inference_one_result_from_bindings_via_template(v_bindings, template);
            results = cons(result, results);
            cdolist_list_var = cdolist_list_var.rest();
            v_bindings = cdolist_list_var.first();
        } 
        return nreverse(results);
    }

    public static SubLObject inference_one_result_from_bindings_via_template(final SubLObject v_bindings, final SubLObject template) {
        final SubLObject subst_bindingsP = list_utilities.simple_tree_findP($BINDINGS, template);
        SubLObject result = bindings.apply_bindings(v_bindings, template);
        if (NIL != subst_bindingsP) {
            result = subst(v_bindings, $BINDINGS, result, UNPROVIDED, UNPROVIDED);
        }
        return result;
    }

    public static SubLObject inference_answers_via_format(final SubLObject answers, final SubLObject return_type) {
        SubLObject results = NIL;
        SubLObject format = NIL;
        SubLObject control_string = NIL;
        destructuring_bind_must_consp(return_type, return_type, $list50);
        format = return_type.first();
        SubLObject current = return_type.rest();
        destructuring_bind_must_consp(current, return_type, $list50);
        control_string = current.first();
        final SubLObject v_variables;
        current = v_variables = current.rest();
        SubLObject cdolist_list_var = answers;
        SubLObject v_answer = NIL;
        v_answer = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            SubLObject format_args = v_variables;
            final SubLObject v_bindings = inference_datastructures_inference.inference_answer_result_bindings(v_answer);
            format_args = bindings.apply_bindings(v_bindings, format_args);
            final SubLObject result = apply(symbol_function(FORMAT), NIL, new SubLObject[]{ control_string, format_args });
            results = cons(result, results);
            cdolist_list_var = cdolist_list_var.rest();
            v_answer = cdolist_list_var.first();
        } 
        return nreverse(results);
    }

    public static SubLObject inference_all_answer_result_bindings(final SubLObject inference) {
        SubLObject binding_lists = NIL;
        final SubLObject idx = inference_datastructures_inference.inference_answer_id_index(inference);
        if (NIL == id_index_objects_empty_p(idx, $SKIP)) {
            final SubLObject idx_$26 = idx;
            if (NIL == id_index_dense_objects_empty_p(idx_$26, $SKIP)) {
                final SubLObject vector_var = id_index_dense_objects(idx_$26);
                final SubLObject backwardP_var = NIL;
                SubLObject length;
                SubLObject v_iteration;
                SubLObject id;
                SubLObject v_answer;
                for (length = length(vector_var), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL(length); v_iteration = add(v_iteration, ONE_INTEGER)) {
                    id = (NIL != backwardP_var) ? subtract(length, v_iteration, ONE_INTEGER) : v_iteration;
                    v_answer = aref(vector_var, id);
                    if ((NIL == id_index_tombstone_p(v_answer)) || (NIL == id_index_skip_tombstones_p($SKIP))) {
                        if (NIL != id_index_tombstone_p(v_answer)) {
                            v_answer = $SKIP;
                        }
                        binding_lists = cons(inference_datastructures_inference.inference_answer_result_bindings(v_answer), binding_lists);
                    }
                }
            }
            final SubLObject idx_$27 = idx;
            if ((NIL == id_index_sparse_objects_empty_p(idx_$27)) || (NIL == id_index_skip_tombstones_p($SKIP))) {
                final SubLObject sparse = id_index_sparse_objects(idx_$27);
                SubLObject id2 = id_index_sparse_id_threshold(idx_$27);
                final SubLObject end_id = id_index_next_id(idx_$27);
                final SubLObject v_default = (NIL != id_index_skip_tombstones_p($SKIP)) ? NIL : $SKIP;
                while (id2.numL(end_id)) {
                    final SubLObject v_answer2 = gethash_without_values(id2, sparse, v_default);
                    if ((NIL == id_index_skip_tombstones_p($SKIP)) || (NIL == id_index_tombstone_p(v_answer2))) {
                        binding_lists = cons(inference_datastructures_inference.inference_answer_result_bindings(v_answer2), binding_lists);
                    }
                    id2 = add(id2, ONE_INTEGER);
                } 
            }
        }
        return nreverse(binding_lists);
    }

    public static SubLObject filter_out_extra_inference_results(final SubLObject results, final SubLObject inference) {
        final SubLObject number = inference_datastructures_inference.inference_max_number(inference);
        if (NIL != number) {
            return list_utilities.first_n(number, results);
        }
        return results;
    }

    public static SubLObject handle_non_continuable_inference_status(final SubLObject inference) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject v_answer = NIL;
        SubLObject reason = NIL;
        final SubLObject metrics = NIL;
        final SubLObject pcase_var = inference_datastructures_inference.inference_status(inference);
        if (pcase_var.eql($ILL_FORMED)) {
            final SubLObject el_query = inference_datastructures_inference.inference_el_query(inference);
            final SubLObject mt = inference_datastructures_inference.inference_mt(inference);
            if ((NIL != el_query) && (NIL != mt)) {
                SubLObject message_var = NIL;
                final SubLObject was_appendingP = eval($sym54$_APPEND_STACK_TRACES_TO_ERROR_MESSAGES__);
                eval($list55);
                try {
                    try {
                        thread.throwStack.push($catch_error_message_target$.getGlobalValue());
                        final SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding(thread);
                        try {
                            Errors.$error_handler$.bind(CATCH_ERROR_MESSAGE_HANDLER, thread);
                            try {
                                fi.signal_fi_error(fi.fi_not_wff_error(el_query, mt));
                            } catch (final Throwable catch_var) {
                                Errors.handleThrowable(catch_var, NIL);
                            }
                        } finally {
                            Errors.$error_handler$.rebind(_prev_bind_0, thread);
                        }
                    } catch (final Throwable ccatch_env_var) {
                        message_var = Errors.handleThrowable(ccatch_env_var, $catch_error_message_target$.getGlobalValue());
                    } finally {
                        thread.throwStack.pop();
                    }
                } finally {
                    final SubLObject _prev_bind_2 = $is_thread_performing_cleanupP$.currentBinding(thread);
                    try {
                        $is_thread_performing_cleanupP$.bind(T, thread);
                        final SubLObject _values = getValuesAsVector();
                        eval(list(CSETQ, $sym54$_APPEND_STACK_TRACES_TO_ERROR_MESSAGES__, was_appendingP));
                        restoreValuesFromVector(_values);
                    } finally {
                        $is_thread_performing_cleanupP$.rebind(_prev_bind_2, thread);
                    }
                }
                if (message_var.isString()) {
                    Errors.warn($str58$_A, message_var);
                }
            }
            v_answer = NIL;
            reason = $ILL_FORMED;
        } else
            if (pcase_var.eql($TAUTOLOGY)) {
                v_answer = cyc_kernel.closed_query_success_token();
                reason = $TAUTOLOGY;
            } else
                if (pcase_var.eql($CONTRADICTION)) {
                    v_answer = NIL;
                    reason = $CONTRADICTION;
                } else {
                    Errors.error($str61$Unexpected_inference_status__s, inference_datastructures_inference.inference_status(inference));
                }


        return values(v_answer, reason, metrics);
    }

    public static SubLObject inference_answers_to_bindings(final SubLObject answers, final SubLObject answer_language) {
        assert NIL != inference_datastructures_enumerated_types.inference_answer_language_p(answer_language) : "inference_datastructures_enumerated_types.inference_answer_language_p(answer_language) " + "CommonSymbols.NIL != inference_datastructures_enumerated_types.inference_answer_language_p(answer_language) " + answer_language;
        if ($HL == answer_language) {
            return Mapping.mapcar(INFERENCE_ANSWER_BINDINGS, answers);
        }
        return Mapping.mapcar(INFERENCE_ANSWER_EL_BINDINGS, answers);
    }

    public static SubLObject inference_answer_to_bindings(final SubLObject v_answer, final SubLObject answer_language) {
        assert NIL != inference_datastructures_enumerated_types.inference_answer_language_p(answer_language) : "inference_datastructures_enumerated_types.inference_answer_language_p(answer_language) " + "CommonSymbols.NIL != inference_datastructures_enumerated_types.inference_answer_language_p(answer_language) " + answer_language;
        if ($HL == answer_language) {
            return inference_datastructures_inference.inference_answer_bindings(v_answer);
        }
        return inference_answer_el_bindings(v_answer);
    }

    public static SubLObject inference_answer_el_bindings(final SubLObject v_answer) {
        final SubLObject answer_bindings = inference_datastructures_inference.inference_answer_bindings(v_answer);
        return inference_bindings_hl_to_el(answer_bindings);
    }

    public static SubLObject inference_bindings_hl_to_el(final SubLObject hl_bindings) {
        SubLObject el_bindings = NIL;
        SubLObject cdolist_list_var = hl_bindings;
        SubLObject binding = NIL;
        binding = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            SubLObject current;
            final SubLObject datum = current = binding;
            SubLObject variable = NIL;
            SubLObject value = NIL;
            destructuring_bind_must_consp(current, datum, $list66);
            variable = current.first();
            current = value = current.rest();
            final SubLObject el_value = inference_answer_hl_to_el(value);
            el_bindings = cons(bindings.make_variable_binding(variable, el_value), el_bindings);
            cdolist_list_var = cdolist_list_var.rest();
            binding = cdolist_list_var.first();
        } 
        el_bindings = nreverse(el_bindings);
        return el_bindings;
    }

    public static SubLObject inference_answer_hl_to_el(SubLObject expression) {
        expression = fi.assertion_expand(expression);
        expression = narts_high.nart_expand(expression);
        return expression;
    }

    public static SubLObject inference_answer_supports(final SubLObject v_answer) {
        SubLObject results = NIL;
        SubLObject cdolist_list_var = inference_datastructures_inference.inference_answer_justifications(v_answer);
        SubLObject justification = NIL;
        justification = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            final SubLObject supports = inference_datastructures_inference.inference_answer_justification_supports(justification);
            results = cons(supports, results);
            cdolist_list_var = cdolist_list_var.rest();
            justification = cdolist_list_var.first();
        } 
        return nreverse(results);
    }

    public static SubLObject inference_answer_bindings_and_supports(final SubLObject v_answer) {
        SubLObject pairs = NIL;
        final SubLObject v_bindings = inference_datastructures_inference.inference_answer_bindings(v_answer);
        SubLObject cdolist_list_var = inference_datastructures_inference.inference_answer_justifications(v_answer);
        SubLObject justification = NIL;
        justification = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            final SubLObject supports = inference_datastructures_inference.inference_answer_justification_supports(justification);
            pairs = cons(list(v_bindings, supports), pairs);
            cdolist_list_var = cdolist_list_var.rest();
            justification = cdolist_list_var.first();
        } 
        return nreverse(pairs);
    }

    public static SubLObject inference_answer_el_bindings_and_supports(final SubLObject v_answer) {
        SubLObject pairs = NIL;
        final SubLObject el_bindings = inference_answer_el_bindings(v_answer);
        SubLObject cdolist_list_var = inference_datastructures_inference.inference_answer_justifications(v_answer);
        SubLObject justification = NIL;
        justification = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            final SubLObject v_hl_supports = inference_datastructures_inference.inference_answer_justification_supports(justification);
            final SubLObject el_supports = Mapping.mapcar(CONVERT_HL_SUPPORT_TO_EL_SUPPORT, v_hl_supports);
            pairs = cons(list(el_bindings, el_supports), pairs);
            cdolist_list_var = cdolist_list_var.rest();
            justification = cdolist_list_var.first();
        } 
        return nreverse(pairs);
    }

    public static SubLObject declare_inference_kernel_file() {
        declareFunction(me, "new_browsable_cyc_query", "NEW-BROWSABLE-CYC-QUERY", 1, 2, false);
        declareFunction(me, "new_browsable_cyc_query_from_dnf", "NEW-BROWSABLE-CYC-QUERY-FROM-DNF", 2, 2, false);
        declareMacro(me, "query_results_for_java", "QUERY-RESULTS-FOR-JAVA");
        declareFunction(me, "query_results_for_java_transform", "QUERY-RESULTS-FOR-JAVA-TRANSFORM", 1, 0, false);
        declareFunction(me, "new_cyc_query", "NEW-CYC-QUERY", 1, 2, false);
        declareFunction(me, "update_query_metrics_wrt_timing_info", "UPDATE-QUERY-METRICS-WRT-TIMING-INFO", 2, 0, false);
        declareFunction(me, "new_cyc_query_from_dnf", "NEW-CYC-QUERY-FROM-DNF", 2, 2, false);
        declareFunction(me, "new_cyc_query_int", "NEW-CYC-QUERY-INT", 4, 0, false);
        declareFunction(me, "new_continuable_inference", "NEW-CONTINUABLE-INFERENCE", 1, 2, false);
        declareFunction(me, "new_continuable_inference_int", "NEW-CONTINUABLE-INFERENCE-INT", 1, 3, false);
        declareFunction(me, "new_continuable_inference_from_dnf", "NEW-CONTINUABLE-INFERENCE-FROM-DNF", 2, 2, false);
        declareFunction(me, "new_continuable_inference_from_dnf_int", "NEW-CONTINUABLE-INFERENCE-FROM-DNF-INT", 5, 0, false);
        declareFunction(me, "extract_some_inference_properties", "EXTRACT-SOME-INFERENCE-PROPERTIES", 1, 0, false);
        declareFunction(me, "initialize_inference_properties", "INITIALIZE-INFERENCE-PROPERTIES", 4, 0, false);
        declareFunction(me, "problem_store_from_properties", "PROBLEM-STORE-FROM-PROPERTIES", 1, 0, false);
        declareFunction(me, "extract_problem_store_properties_from_query_static_properties", "EXTRACT-PROBLEM-STORE-PROPERTIES-FROM-QUERY-STATIC-PROPERTIES", 1, 0, false);
        declareFunction(me, "continue_inference", "CONTINUE-INFERENCE", 1, 1, false);
        declareFunction(me, "continue_inference_int", "CONTINUE-INFERENCE-INT", 3, 0, false);
        declareFunction(me, "inference_update_properties", "INFERENCE-UPDATE-PROPERTIES", 3, 0, false);
        declareFunction(me, "inference_postprocess", "INFERENCE-POSTPROCESS", 1, 0, false);
        declareFunction(me, "inference_result_from_answers", "INFERENCE-RESULT-FROM-ANSWERS", 2, 0, false);
        declareFunction(me, "inference_result_from_all_answers", "INFERENCE-RESULT-FROM-ALL-ANSWERS", 1, 0, false);
        declareFunction(me, "inference_template_return_type_template", "INFERENCE-TEMPLATE-RETURN-TYPE-TEMPLATE", 1, 0, false);
        declareFunction(me, "inference_result_from_answers_via_template", "INFERENCE-RESULT-FROM-ANSWERS-VIA-TEMPLATE", 2, 0, false);
        declareFunction(me, "inference_result_from_binding_lists_via_template", "INFERENCE-RESULT-FROM-BINDING-LISTS-VIA-TEMPLATE", 2, 0, false);
        declareFunction(me, "inference_one_result_from_bindings_via_template", "INFERENCE-ONE-RESULT-FROM-BINDINGS-VIA-TEMPLATE", 2, 0, false);
        declareFunction(me, "inference_answers_via_format", "INFERENCE-ANSWERS-VIA-FORMAT", 2, 0, false);
        declareFunction(me, "inference_all_answer_result_bindings", "INFERENCE-ALL-ANSWER-RESULT-BINDINGS", 1, 0, false);
        declareFunction(me, "filter_out_extra_inference_results", "FILTER-OUT-EXTRA-INFERENCE-RESULTS", 2, 0, false);
        declareFunction(me, "handle_non_continuable_inference_status", "HANDLE-NON-CONTINUABLE-INFERENCE-STATUS", 1, 0, false);
        declareFunction(me, "inference_answers_to_bindings", "INFERENCE-ANSWERS-TO-BINDINGS", 2, 0, false);
        declareFunction(me, "inference_answer_to_bindings", "INFERENCE-ANSWER-TO-BINDINGS", 2, 0, false);
        declareFunction(me, "inference_answer_el_bindings", "INFERENCE-ANSWER-EL-BINDINGS", 1, 0, false);
        declareFunction(me, "inference_bindings_hl_to_el", "INFERENCE-BINDINGS-HL-TO-EL", 1, 0, false);
        new inference_kernel.$inference_bindings_hl_to_el$UnaryFunction();
        declareFunction(me, "inference_answer_hl_to_el", "INFERENCE-ANSWER-HL-TO-EL", 1, 0, false);
        declareFunction(me, "inference_answer_supports", "INFERENCE-ANSWER-SUPPORTS", 1, 0, false);
        declareFunction(me, "inference_answer_bindings_and_supports", "INFERENCE-ANSWER-BINDINGS-AND-SUPPORTS", 1, 0, false);
        declareFunction(me, "inference_answer_el_bindings_and_supports", "INFERENCE-ANSWER-EL-BINDINGS-AND-SUPPORTS", 1, 0, false);
        return NIL;
    }

    public static SubLObject init_inference_kernel_file() {
        defvar("*NEW-CYC-TRIVIAL-QUERY-ENABLED?*", T);
        return NIL;
    }

    public static SubLObject setup_inference_kernel_file() {
        register_external_symbol(QUERY_RESULTS_FOR_JAVA);
        register_macro_helper(QUERY_RESULTS_FOR_JAVA_TRANSFORM, QUERY_RESULTS_FOR_JAVA);
        register_cyc_api_function(NEW_CYC_QUERY, $list16, $str17$Creates__runs__and_destroys_an_in, $list18, $list19);
        return NIL;
    }

    @Override
    public void declareFunctions() {
        declare_inference_kernel_file();
    }

    @Override
    public void initializeVariables() {
        init_inference_kernel_file();
    }

    @Override
    public void runTopLevelForms() {
        setup_inference_kernel_file();
    }

    

    public static final class $inference_bindings_hl_to_el$UnaryFunction extends UnaryFunction {
        public $inference_bindings_hl_to_el$UnaryFunction() {
            super(extractFunctionNamed("INFERENCE-BINDINGS-HL-TO-EL"));
        }

        @Override
        public SubLObject processItem(final SubLObject arg1) {
            return inference_bindings_hl_to_el(arg1);
        }
    }
}

/**
 * Total time: 485 ms synthetic
 */
