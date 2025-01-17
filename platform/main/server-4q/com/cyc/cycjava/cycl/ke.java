package com.cyc.cycjava.cycl;


import static com.cyc.cycjava.cycl.access_macros.register_external_symbol;
import static com.cyc.cycjava.cycl.constant_handles.constant_p;
import static com.cyc.cycjava.cycl.constant_handles.reader_make_constant_shell;
import static com.cyc.cycjava.cycl.constant_handles.valid_constantP;
import static com.cyc.cycjava.cycl.control_vars.$inference_debugP$;
import static com.cyc.cycjava.cycl.control_vars.$use_transcriptP$;
import static com.cyc.cycjava.cycl.el_utilities.el_conditional_sentence_p;
import static com.cyc.cycjava.cycl.el_utilities.el_formula_p;
import static com.cyc.cycjava.cycl.el_utilities.make_binary_formula;
import static com.cyc.cycjava.cycl.el_utilities.make_ist_sentence;
import static com.cyc.cycjava.cycl.subl_macro_promotions.$catch_error_message_target$;
import static com.cyc.cycjava.cycl.subl_macro_promotions.declare_defglobal;
import static com.cyc.cycjava.cycl.utilities_macros.$is_noting_progressP$;
import static com.cyc.cycjava.cycl.utilities_macros.$last_percent_progress_index$;
import static com.cyc.cycjava.cycl.utilities_macros.$last_percent_progress_prediction$;
import static com.cyc.cycjava.cycl.utilities_macros.$percent_progress_start_time$;
import static com.cyc.cycjava.cycl.utilities_macros.$progress_count$;
import static com.cyc.cycjava.cycl.utilities_macros.$progress_elapsed_seconds_for_notification$;
import static com.cyc.cycjava.cycl.utilities_macros.$progress_last_pacification_time$;
import static com.cyc.cycjava.cycl.utilities_macros.$progress_notification_count$;
import static com.cyc.cycjava.cycl.utilities_macros.$progress_pacifications_since_last_nl$;
import static com.cyc.cycjava.cycl.utilities_macros.$progress_start_time$;
import static com.cyc.cycjava.cycl.utilities_macros.$silent_progressP$;
import static com.cyc.cycjava.cycl.utilities_macros.$suppress_all_progress_faster_than_seconds$;
import static com.cyc.cycjava.cycl.utilities_macros.$within_noting_percent_progress$;
import static com.cyc.cycjava.cycl.utilities_macros.note_percent_progress;
import static com.cyc.cycjava.cycl.utilities_macros.note_progress;
import static com.cyc.cycjava.cycl.utilities_macros.noting_percent_progress_postamble;
import static com.cyc.cycjava.cycl.utilities_macros.noting_percent_progress_preamble;
import static com.cyc.cycjava.cycl.utilities_macros.noting_progress_postamble;
import static com.cyc.cycjava.cycl.utilities_macros.noting_progress_preamble;
import static com.cyc.cycjava.cycl.utilities_macros.register_cyc_api_function;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.append;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.cons;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.list;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.listS;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Eval.eval;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions.apply;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions.funcall;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.clrhash;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.gethash;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.hash_table_count;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.make_hash_table;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.remhash;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.sethash;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.add;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.cconcatenate;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.delete;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.nreverse;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.symbol_function;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads.$is_thread_performing_cleanupP$;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Time.get_universal_time;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types.stringp;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.getValuesAsVector;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.restoreValuesFromVector;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.values;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeBoolean;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeKeyword;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeString;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeSymbol;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.cdestructuring_bind_error;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.destructuring_bind_must_consp;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.destructuring_bind_must_listp;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.adjoin;
import static com.cyc.tool.subl.util.SubLFiles.declareFunction;
import static com.cyc.tool.subl.util.SubLFiles.deflexical;
import static com.cyc.tool.subl.util.SubLFiles.defparameter;

import com.cyc.cycjava.cycl.inference.harness.forward;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Guids;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Mapping;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLSystemTrampolineFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;


public final class ke extends SubLTranslatedFile {
    public static final SubLFile me = new ke();

    public static final String myName = "com.cyc.cycjava.cycl.ke";

    public static final String myFingerPrint = "b0d0cda1335bbfa62addbd27cfaac1ad67d219b67e32d5799bf343f067ac17f9";

    // defparameter
    // Do we keep the merged constant name info in the KB?
    public static final SubLSymbol $note_merged_constant_name$ = makeSymbol("*NOTE-MERGED-CONSTANT-NAME*");

    // defparameter
    // Do we keep previous constant name info in the KB?
    public static final SubLSymbol $note_old_constant_name$ = makeSymbol("*NOTE-OLD-CONSTANT-NAME*");

    // defparameter
    public static final SubLSymbol $ke_assert_now_assume_wff_test$ = makeSymbol("*KE-ASSERT-NOW-ASSUME-WFF-TEST*");

    // defparameter
    public static final SubLSymbol $check_if_already_ke_unassertedP$ = makeSymbol("*CHECK-IF-ALREADY-KE-UNASSERTED?*");



    // defparameter
    private static final SubLSymbol $ke_add_assertion_original_textP$ = makeSymbol("*KE-ADD-ASSERTION-ORIGINAL-TEXT?*");



    // defparameter
    private static final SubLSymbol $ke_assertion_edit_formula_find_func$ = makeSymbol("*KE-ASSERTION-EDIT-FORMULA-FIND-FUNC*");

    // defparameter
    private static final SubLSymbol $ke_assertion_edit_formula_display_func$ = makeSymbol("*KE-ASSERTION-EDIT-FORMULA-DISPLAY-FUNC*");

    // Internal Constants
    public static final SubLSymbol KE_CREATE = makeSymbol("KE-CREATE");



    public static final SubLSymbol FI_TIMESTAMP_CONSTANT = makeSymbol("FI-TIMESTAMP-CONSTANT");



    public static final SubLSymbol FI_CREATE = makeSymbol("FI-CREATE");



    private static final SubLSymbol $IGNORE_ERRORS_TARGET = makeKeyword("IGNORE-ERRORS-TARGET");

    public static final SubLSymbol IGNORE_ERRORS_HANDLER = makeSymbol("IGNORE-ERRORS-HANDLER", "SUBLISP");





    public static final SubLList $list10 = list(makeKeyword("UNKNOWN-ERROR"), makeString("An unknown error has occurred"));

    public static final SubLSymbol KE_CREATE_NOW = makeSymbol("KE-CREATE-NOW");

    public static final SubLList $list12 = list(makeSymbol("NAME"), makeSymbol("&OPTIONAL"), makeSymbol("EXTERNAL-ID"));

    public static final SubLString $str13$Create_new_constant_now_and_add_o = makeString("Create new constant now and add operation to transcript. If EXTERNAL-ID is non-null \nit is used, otherwise a unique identifier is generated.\n@return 0 constant ;; new constant if success, o/w nil\n@return 1 list ;; error list of form (ERROR-TYPE ERROR-STRING) otherwise.\n@param NAME string\n@param EXTERNAL-ID guid-p\n@note Assumes cyclist is ok.\n@note The salient property of this function is that it never throws an error.\n@owner jantos\n@privacy done\n");

    public static final SubLList $list14 = list(makeSymbol("CONSTANT-P"), makeSymbol("LISTP"));

    public static final SubLSymbol KE_MERGE = makeSymbol("KE-MERGE");

    private static final SubLString $$$Skip_this_operation = makeString("Skip this operation");

    private static final SubLString $str17$Constant__S_cannot_be_merged_beca = makeString("Constant ~S cannot be merged because it is mentioned in code");

    private static final SubLSymbol FI_MERGE = makeSymbol("FI-MERGE");

    private static final SubLObject $$mergedConstantName = reader_make_constant_shell(makeString("mergedConstantName"));

    private static final SubLObject $$BookkeepingMt = reader_make_constant_shell(makeString("BookkeepingMt"));

    private static final SubLObject $$mergedConstantGUID = reader_make_constant_shell(makeString("mergedConstantGUID"));

    public static final SubLList $list22 = list(makeKeyword("FATAL-ERROR"), list(makeSymbol("FORMAT"), NIL, makeString("~A is mentioned in code and cannot be merged."), makeSymbol("KILL-FORT")));





    public static final SubLSymbol KE_KILL = makeSymbol("KE-KILL");

    public static final SubLSymbol FI_KILL = makeSymbol("FI-KILL");

    public static final SubLString $str27$Constant__S_cannot_be_killed_beca = makeString("Constant ~S cannot be killed because it is mentioned in code");

    public static final SubLSymbol KE_KILL_NOW = makeSymbol("KE-KILL-NOW");

    public static final SubLList $list29 = list(makeSymbol("FORT"));

    public static final SubLString $str30$Kill_FORT_now_and_add_operation_t = makeString("Kill FORT now and add operation to transcript.\n@return 0 boolean ;; t if success, o/w nil\n@return 1 list ;; error list of form (ERROR-TYPE ERROR-STRING) otherwise.\n@param FORT fort\n@note Assumes cyclist is ok.\n@note The salient property of this function is that it never throws an error.\n@owner jantos\n@privacy done\n");

    public static final SubLList $list31 = list(makeSymbol("BOOLEANP"), makeSymbol("LISTP"));



    public static final SubLString $str33$Constant__S_cannot_be_renamed_bec = makeString("Constant ~S cannot be renamed because it is mentioned in code");

    public static final SubLString $str34$Use_KE_RENAME = makeString("Use KE-RENAME");

    public static final SubLString $str35$Constant__S_is_not_mentioned_in_c = makeString("Constant ~S is not mentioned in code");

    public static final SubLSymbol FI_RENAME = makeSymbol("FI-RENAME");



    private static final SubLObject $$oldConstantName = reader_make_constant_shell(makeString("oldConstantName"));

    public static final SubLSymbol KE_ASSERT = makeSymbol("KE-ASSERT");





    public static final SubLSymbol FI_TIMESTAMP_ASSERTION = makeSymbol("FI-TIMESTAMP-ASSERTION");







    public static final SubLSymbol FI_REASSERT = makeSymbol("FI-REASSERT");

    private static final SubLSymbol FI_REASSERT_INT = makeSymbol("FI-REASSERT-INT");





    private static final SubLSymbol KE_ASSERT_NOW = makeSymbol("KE-ASSERT-NOW");

    private static final SubLList $list51 = list(makeSymbol("FORMULA"), makeSymbol("MT"), makeSymbol("&OPTIONAL"), list(makeSymbol("STRENGTH"), makeKeyword("DEFAULT")), makeSymbol("DIRECTION"));

    private static final SubLString $str52$Assert_FORMULA_in_MT_now_and_add_ = makeString("Assert FORMULA in MT now and add operation to transcript.\n@return 0 boolean ;; t if success, o/w nil\n@return 1 list ;; error list of form (ERROR-TYPE ERROR-STRING) otherwise.\n@param FORMULA list\n@param MT microtheory\n@param STRENGTH keyword\n@param DIRECTION keyword\n@note Assumes cyclist is ok.\n@note The salient property of this function is that it never throws an error.\n@owner jantos\n@privacy done\n");



    private static final SubLSymbol KE_ASSERT_WFF_NOW = makeSymbol("KE-ASSERT-WFF-NOW");

    private static final SubLString $str55$Assert_FORMULA_in_MT_now_and_add_ = makeString("Assert FORMULA in MT now and add operation to transcript.\nFORMULA is assumed to be WFF.\n@return 0 boolean ;; t if success, o/w nil\n@return 1 list ;; error list of form (ERROR-TYPE ERROR-STRING) otherwise.\n@param FORMULA list\n@param MT microtheory\n@param STRENGTH keyword\n@param DIRECTION keyword\n@note Assumes cyclist is ok.\n@note The salient property of this function is that it never throws an error.\n@owner jantos\n@privacy done\n");

    private static final SubLSymbol KE_ASSERT_NOW_AND_PROPAGATE_LATER = makeSymbol("KE-ASSERT-NOW-AND-PROPAGATE-LATER");

    private static final SubLString $str57$Assert_FORMULA_in_MT_now_and_add_ = makeString("Assert FORMULA in MT now and add operation to transcript.  May return before forward-propagation is complete, but not\n   before FORMULA has been asserted in MT.\n   @return 0 boolean ;; t if success, o/w nil\n   @return 1 list ;; error list of form (ERROR-TYPE ERROR-STRING) otherwise.\n   @param FORMULA list\n   @param MT microtheory\n   @param STRENGTH keyword\n   @param DIRECTION keyword\n   @note Assumes cyclist is ok.\n   @note The salient property of this function is that it never throws an error.");









    private static final SubLSymbol KE_UNASSERT = makeSymbol("KE-UNASSERT");



    private static final SubLString $str64$Sentence__S_in_mt__S__is_not_in_t = makeString("Sentence ~S in mt ~S~%is not in the KB and you are trying to unassert it.");

    private static final SubLSymbol KE_UNASSERT_NOW = makeSymbol("KE-UNASSERT-NOW");

    public static final SubLList $list66 = list(makeSymbol("FORMULA"), makeSymbol("MT"));

    private static final SubLString $str67$Unassert_FORMULA_in_MT_now_and_ad = makeString("Unassert FORMULA in MT now and add operation to transcript.\n@return 0 boolean ;; t if success, o/w nil\n@return 1 list ;; error list of form (ERROR-TYPE ERROR-STRING) otherwise.\n@param FORMULA list\n@param MT microtheory\n@note Assumes cyclist is ok.\n@note The salient property of this function is that it never throws an error.\n@owner jantos\n@privacy done\n");

    private static final SubLSymbol $ke_edit_use_fi_edit$ = makeSymbol("*KE-EDIT-USE-FI-EDIT*");

    private static final SubLSymbol FI_EDIT = makeSymbol("FI-EDIT");

    private static final SubLSymbol KE_EDIT = makeSymbol("KE-EDIT");

    private static final SubLList $list71 = list(makeSymbol("OLD-FORMULA"), makeSymbol("NEW-FORMULA"), makeSymbol("OLD-MT"), makeSymbol("&OPTIONAL"), list(makeSymbol("NEW-MT"), makeSymbol("OLD-MT")), list(makeSymbol("STRENGTH"), makeKeyword("DEFAULT")), makeSymbol("DIRECTION"));

    private static final SubLString $str72$Add_to_the_agenda_operations_that = makeString("Add to the agenda operations that will remove OLD-FORMULA and replace it with NEW-FORMULA\n   @param OLD-FORMULA cycl-sentence-p; the formula to remove\n   @param NEW-FORMULA cycl-sentence-p; the formula to add\n   @param OLD-MT mt?; the mt in which OLD-FORMULA is currently asserted\n   @param NEW-MT mt?; the mt in which NEW-FORMULA should be asserted\n   @param STRENGTH keywordp\n   @param DIRECTION keywordp");

    private static final SubLList $list73 = list(makeSymbol("KEYWORDP"));

    private static final SubLSymbol KE_EDIT_NOW = makeSymbol("KE-EDIT-NOW");

    private static final SubLString $str75$Immediately_remove_OLD_FORMULA_an = makeString("Immediately remove OLD-FORMULA and replace it with NEW-FORMULA.\n   If NEW-FORMULA can\'t be added, don\'t remove OLD-FORMULA.\n   @param OLD-FORMULA cycl-sentence-p; the formula to remove\n   @param NEW-FORMULA cycl-sentence-p; the formula to add\n   @param OLD-MT mt?; the mt in which OLD-FORMULA is currently asserted\n   @param NEW-MT mt?; the mt in which NEW-FORMULA should be asserted\n   @param STRENGTH keywordp\n   @param DIRECTION keywordp");



    private static final SubLList $list77 = list(makeSymbol("NEW-META-ASSERTION-EL-FORMULA"), makeSymbol("NEW-META-ASSERTION-MT"), makeSymbol("NEW-META-ASSERTION-STRENGTH"), makeSymbol("NEW-META-ASSERTION-DIRECTION"));

    private static final SubLSymbol KE_EDIT_ASSERTION_PRESERVING_ALL_META_ASSERTIONS = makeSymbol("KE-EDIT-ASSERTION-PRESERVING-ALL-META-ASSERTIONS");

    private static final SubLObject $$ist = reader_make_constant_shell(makeString("ist"));

    private static final SubLList $list80 = list(makeSymbol("OLD-META-ASSERTION"), makeSymbol("&OPTIONAL"), makeSymbol("NEW-META-ASSERTION-MT"));

    private static final SubLString $str81$_pre_ = makeString("<pre>");

    private static final SubLString $str82$__code_ = makeString("</code>");

    private static final SubLObject $$assertionOriginalText = reader_make_constant_shell(makeString("assertionOriginalText"));

    private static final SubLString $str84$Sentences_do_not_differ_only_in_s = makeString("Sentences do not differ only in strings");







    private static final SubLSymbol FI_RENAME_VARIABLES = makeSymbol("FI-RENAME-VARIABLES");

    private static final SubLSymbol FI_ADD_ARGUMENT = makeSymbol("FI-ADD-ARGUMENT");

    private static final SubLSymbol $kw90$CHECK_WFF_ = makeKeyword("CHECK-WFF?");

    private static final SubLSymbol FI_REMOVE_ARGUMENT = makeSymbol("FI-REMOVE-ARGUMENT");



    private static final SubLSymbol CONVERT_HL_SUPPORT_TO_TL_SUPPORT = makeSymbol("CONVERT-HL-SUPPORT-TO-TL-SUPPORT");



    private static final SubLSymbol FI_TMS_RECONSIDER_TERM = makeSymbol("FI-TMS-RECONSIDER-TERM");

    private static final SubLSymbol FI_TMS_RECONSIDER_FORMULA = makeSymbol("FI-TMS-RECONSIDER-FORMULA");

    private static final SubLSymbol $sym97$RULE_ASSERTION_ = makeSymbol("RULE-ASSERTION?");

    private static final SubLObject $$pragmaticRequirement = reader_make_constant_shell(makeString("pragmaticRequirement"));

    private static final SubLList $list99 = list(reader_make_constant_shell(makeString("different")), ONE_INTEGER, ONE_INTEGER);



    public static final SubLSymbol $old_constant_names_table$ = makeSymbol("*OLD-CONSTANT-NAMES-TABLE*");

    private static final SubLString $str102$Initializing_old_constant_name_ta = makeString("Initializing old constant name table");



    private static final SubLSymbol ASSERTION_TL_IST_FORMULA = makeSymbol("ASSERTION-TL-IST-FORMULA");

    private static final SubLSymbol ASSERTION_EL_FORMULA = makeSymbol("ASSERTION-EL-FORMULA");

    private static final SubLSymbol ASSERTION_TL_FORMULA = makeSymbol("ASSERTION-TL-FORMULA");

    private static final SubLString $str107$KB_editing_is_not_allowed_for_use = makeString("KB editing is not allowed for users logged in as ~S.");



    private static final SubLSymbol FI_EVAL = makeSymbol("FI-EVAL");

    public static SubLObject ke_create(final SubLObject name) {
        return ke_create_internal(name, NIL);
    }

    public static SubLObject ke_create_from_serialization(final SubLObject name, final SubLObject external_id) {
        if (NIL != ensure_cyclist_ok()) {
            final SubLObject ans = fi.fi_create(name, external_id);
            SubLObject error = NIL;
            if (ans != $QUEUED) {
                error = fi.fi_get_error_int();
            }
            do_edit_op(list(FI_TIMESTAMP_CONSTANT, list(QUOTE, operation_communication.the_cyclist()), list(QUOTE, numeric_date_utilities.get_universal_date(UNPROVIDED, UNPROVIDED)), list(QUOTE, fi.ke_purpose()), list(QUOTE, numeric_date_utilities.get_universal_second(UNPROVIDED))));
            if (ans != $QUEUED) {
                fi.signal_fi_error(error);
            }
            return ans;
        }
        return NIL;
    }

    public static SubLObject ke_create_internal(final SubLObject name, SubLObject external_id) {
        if (external_id == UNPROVIDED) {
            external_id = NIL;
        }
        if (NIL != ensure_cyclist_ok()) {
            final SubLObject ans = do_edit_op(listS(FI_CREATE, list(QUOTE, name), append(NIL != external_id ? list(list(QUOTE, external_id)) : NIL, NIL)));
            SubLObject error = NIL;
            if (ans != $QUEUED) {
                error = fi.fi_get_error_int();
            }
            do_edit_op(list(FI_TIMESTAMP_CONSTANT, list(QUOTE, operation_communication.the_cyclist()), list(QUOTE, numeric_date_utilities.get_universal_date(UNPROVIDED, UNPROVIDED)), list(QUOTE, fi.ke_purpose()), list(QUOTE, numeric_date_utilities.get_universal_second(UNPROVIDED))));
            if (ans != $QUEUED) {
                fi.signal_fi_error(error);
            }
            return ans;
        }
        return NIL;
    }

    public static SubLObject ke_create_now(final SubLObject name, SubLObject external_id) {
        if (external_id == UNPROVIDED) {
            external_id = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = NIL;
        SubLObject error_message = NIL;
        try {
            thread.throwStack.push($catch_error_message_target$.getGlobalValue());
            final SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding(thread);
            try {
                Errors.$error_handler$.bind(CATCH_ERROR_MESSAGE_HANDLER, thread);
                try {
                    final SubLObject _prev_bind_0_$1 = fi.$fi_last_constant$.currentBinding(thread);
                    try {
                        fi.$fi_last_constant$.bind(NIL, thread);
                        result = fi.fi_create_int(name, external_id);
                    } finally {
                        fi.$fi_last_constant$.rebind(_prev_bind_0_$1, thread);
                    }
                } catch (final Throwable catch_var) {
                    Errors.handleThrowable(catch_var, NIL);
                }
            } finally {
                Errors.$error_handler$.rebind(_prev_bind_0, thread);
            }
        } catch (final Throwable ccatch_env_var) {
            error_message = Errors.handleThrowable(ccatch_env_var, $catch_error_message_target$.getGlobalValue());
        } finally {
            thread.throwStack.pop();
        }
        if (NIL != result) {
            operation_queues.possibly_add_to_transcript_queue(canon_tl.tl_encapsulate(list(FI_CREATE, list(QUOTE, constants_high.constant_name(result)), constants_high.constant_external_id(result))));
            SubLObject ignore_errors_tag = NIL;
            try {
                thread.throwStack.push($IGNORE_ERRORS_TARGET);
                final SubLObject _prev_bind_2 = Errors.$error_handler$.currentBinding(thread);
                try {
                    Errors.$error_handler$.bind(symbol_function(IGNORE_ERRORS_HANDLER), thread);
                    try {
                        final SubLObject _prev_bind_0_$2 = fi.$fi_last_constant$.currentBinding(thread);
                        try {
                            fi.$fi_last_constant$.bind(result, thread);
                            if (NIL != fi.fi_timestamp_constant_int(operation_communication.the_cyclist(), fi.the_date(), fi.ke_purpose(), fi.the_second())) {
                                operation_queues.possibly_add_to_transcript_queue(canon_tl.tl_encapsulate(list(FI_TIMESTAMP_CONSTANT, list(QUOTE, operation_communication.the_cyclist()), list(QUOTE, fi.the_date()), list(QUOTE, fi.ke_purpose()), list(QUOTE, fi.the_second()))));
                            }
                        } finally {
                            fi.$fi_last_constant$.rebind(_prev_bind_0_$2, thread);
                        }
                    } catch (final Throwable catch_var2) {
                        Errors.handleThrowable(catch_var2, NIL);
                    }
                } finally {
                    Errors.$error_handler$.rebind(_prev_bind_2, thread);
                }
            } catch (final Throwable ccatch_env_var2) {
                ignore_errors_tag = Errors.handleThrowable(ccatch_env_var2, $IGNORE_ERRORS_TARGET);
            } finally {
                thread.throwStack.pop();
            }
            return result;
        }
        if (NIL != error_message) {
            return values(NIL, list($FATAL_ERROR, error_message));
        }
        if (NIL != fi.fi_error_signaledP()) {
            return values(NIL, list(fi.fi_get_error_int().first(), apply(symbol_function(FORMAT), cons(NIL, fi.fi_get_error_int().rest()))));
        }
        return values(NIL, $list10);
    }

    public static SubLObject ke_find_or_create_now(final SubLObject name, SubLObject external_id) {
        if (external_id == UNPROVIDED) {
            external_id = NIL;
        }
        final SubLObject constant = fi.fi_find_int(name);
        if (NIL != constant) {
            return values(constant, NIL);
        }
        return ke_create_now(name, external_id);
    }

    public static SubLObject ke_recreate_now(final SubLObject constant) {
        if (NIL != ensure_cyclist_ok()) {
            final SubLObject external_id = constants_high.constant_external_id(constant);
            final SubLObject name = constants_high.constant_name(constant);
            final SubLObject creator = bookkeeping_store.creator(constant, UNPROVIDED);
            final SubLObject creation_time = bookkeeping_store.creation_time(constant, UNPROVIDED);
            final SubLObject purpose = bookkeeping_store.creation_purpose(constant, UNPROVIDED);
            final SubLObject creation_second = bookkeeping_store.creation_second(constant, UNPROVIDED);
            ke_kill_now(constant);
            ke_create_now(name, external_id);
            if ((NIL != creator) && (NIL != creation_time)) {
                fi.fi_timestamp_constant(creator, creation_time, purpose, creation_second);
            }
            return T;
        }
        return NIL;
    }

    public static SubLObject ke_merge(final SubLObject kill_fort, final SubLObject keep_fort) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != constant_completion.constant_mentioned_in_codeP(kill_fort)) {
            Errors.cerror($$$Skip_this_operation, $str17$Constant__S_cannot_be_merged_beca, kill_fort);
            return NIL;
        }
        final SubLObject merged_name = (NIL != constant_p(kill_fort)) ? constants_high.constant_name(kill_fort) : NIL != nart_handles.nart_p(kill_fort) ? format_nil.format_nil_s(narts_high.nart_el_formula(kill_fort)) : NIL;
        final SubLObject merged_guid = (NIL != constant_p(kill_fort)) ? Guids.guid_to_string(constants_high.constant_guid(kill_fort)) : NIL;
        if (NIL != ensure_cyclist_ok()) {
            do_edit_op(list(FI_MERGE, list(QUOTE, kill_fort), list(QUOTE, keep_fort)));
            if (((NIL != $note_merged_constant_name$.getDynamicValue(thread)) && merged_name.isString()) && merged_guid.isString()) {
                if ((NIL != constant_p(keep_fort)) && (NIL != merged_name)) {
                    ke_assert(list($$mergedConstantName, keep_fort, merged_name), $$BookkeepingMt, UNPROVIDED, UNPROVIDED);
                }
                if ((NIL != constant_p(keep_fort)) && (NIL != merged_guid)) {
                    ke_assert(list($$mergedConstantGUID, keep_fort, merged_guid), $$BookkeepingMt, UNPROVIDED, UNPROVIDED);
                }
                return keep_fort;
            }
        }
        return NIL;
    }

    public static SubLObject ke_merge_now(SubLObject kill_fort, SubLObject keep_fort) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != constant_completion.constant_mentioned_in_codeP(kill_fort)) {
            return values(NIL, $list22);
        }
        final SubLObject merged_name = (NIL != constant_p(kill_fort)) ? constants_high.constant_name(kill_fort) : NIL != nart_handles.nart_p(kill_fort) ? format_nil.format_nil_s(narts_high.nart_el_formula(kill_fort)) : NIL;
        final SubLObject merged_guid = (NIL != constant_p(kill_fort)) ? Guids.guid_to_string(constants_high.constant_guid(kill_fort)) : NIL;
        SubLObject result = NIL;
        SubLObject transcript_op = NIL;
        SubLObject error_message = NIL;
        kill_fort = eval(kill_fort);
        keep_fort = eval(keep_fort);
        transcript_op = canon_tl.tl_encapsulate(list(FI_MERGE, list(QUOTE, kill_fort), list(QUOTE, keep_fort)));
        try {
            thread.throwStack.push($catch_error_message_target$.getGlobalValue());
            final SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding(thread);
            try {
                Errors.$error_handler$.bind(CATCH_ERROR_MESSAGE_HANDLER, thread);
                try {
                    result = fi.fi_merge_int(kill_fort, keep_fort);
                } catch (final Throwable catch_var) {
                    Errors.handleThrowable(catch_var, NIL);
                }
            } finally {
                Errors.$error_handler$.rebind(_prev_bind_0, thread);
            }
        } catch (final Throwable ccatch_env_var) {
            error_message = Errors.handleThrowable(ccatch_env_var, $catch_error_message_target$.getGlobalValue());
        } finally {
            thread.throwStack.pop();
        }
        if (NIL != result) {
            operation_queues.possibly_add_to_transcript_queue(transcript_op);
            if (((NIL != $note_merged_constant_name$.getDynamicValue(thread)) && merged_name.isString()) && merged_guid.isString()) {
                SubLObject ignore_errors_tag = NIL;
                try {
                    thread.throwStack.push($IGNORE_ERRORS_TARGET);
                    final SubLObject _prev_bind_2 = Errors.$error_handler$.currentBinding(thread);
                    try {
                        Errors.$error_handler$.bind(symbol_function(IGNORE_ERRORS_HANDLER), thread);
                        try {
                            final SubLObject _prev_bind_0_$3 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                            final SubLObject _prev_bind_3 = mt_relevance_macros.$mt$.currentBinding(thread);
                            try {
                                mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_EQ, thread);
                                mt_relevance_macros.$mt$.bind($$BookkeepingMt, thread);
                                SubLObject pred_var = $$mergedConstantName;
                                if (NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(keep_fort, ONE_INTEGER, pred_var)) {
                                    final SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(keep_fort, ONE_INTEGER, pred_var);
                                    SubLObject done_var = NIL;
                                    final SubLObject token_var = NIL;
                                    while (NIL == done_var) {
                                        final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                                        final SubLObject valid = makeBoolean(!token_var.eql(final_index_spec));
                                        if (NIL != valid) {
                                            SubLObject final_index_iterator = NIL;
                                            try {
                                                final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $GAF, NIL, NIL);
                                                SubLObject done_var_$4 = NIL;
                                                final SubLObject token_var_$5 = NIL;
                                                while (NIL == done_var_$4) {
                                                    final SubLObject assertion = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$5);
                                                    final SubLObject valid_$6 = makeBoolean(!token_var_$5.eql(assertion));
                                                    if (NIL != valid_$6) {
                                                        ke_unassert_assertion_now(assertion);
                                                    }
                                                    done_var_$4 = makeBoolean(NIL == valid_$6);
                                                } 
                                            } finally {
                                                final SubLObject _prev_bind_0_$4 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                                try {
                                                    $is_thread_performing_cleanupP$.bind(T, thread);
                                                    final SubLObject _values = getValuesAsVector();
                                                    if (NIL != final_index_iterator) {
                                                        kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                                    }
                                                    restoreValuesFromVector(_values);
                                                } finally {
                                                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$4, thread);
                                                }
                                            }
                                        }
                                        done_var = makeBoolean(NIL == valid);
                                    } 
                                }
                                pred_var = $$mergedConstantGUID;
                                if (NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(keep_fort, ONE_INTEGER, pred_var)) {
                                    final SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(keep_fort, ONE_INTEGER, pred_var);
                                    SubLObject done_var = NIL;
                                    final SubLObject token_var = NIL;
                                    while (NIL == done_var) {
                                        final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                                        final SubLObject valid = makeBoolean(!token_var.eql(final_index_spec));
                                        if (NIL != valid) {
                                            SubLObject final_index_iterator = NIL;
                                            try {
                                                final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $GAF, NIL, NIL);
                                                SubLObject done_var_$5 = NIL;
                                                final SubLObject token_var_$6 = NIL;
                                                while (NIL == done_var_$5) {
                                                    final SubLObject assertion = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$6);
                                                    final SubLObject valid_$7 = makeBoolean(!token_var_$6.eql(assertion));
                                                    if (NIL != valid_$7) {
                                                        ke_unassert_assertion_now(assertion);
                                                    }
                                                    done_var_$5 = makeBoolean(NIL == valid_$7);
                                                } 
                                            } finally {
                                                final SubLObject _prev_bind_0_$5 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                                try {
                                                    $is_thread_performing_cleanupP$.bind(T, thread);
                                                    final SubLObject _values2 = getValuesAsVector();
                                                    if (NIL != final_index_iterator) {
                                                        kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                                    }
                                                    restoreValuesFromVector(_values2);
                                                } finally {
                                                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$5, thread);
                                                }
                                            }
                                        }
                                        done_var = makeBoolean(NIL == valid);
                                    } 
                                }
                            } finally {
                                mt_relevance_macros.$mt$.rebind(_prev_bind_3, thread);
                                mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0_$3, thread);
                            }
                        } catch (final Throwable catch_var2) {
                            Errors.handleThrowable(catch_var2, NIL);
                        }
                    } finally {
                        Errors.$error_handler$.rebind(_prev_bind_2, thread);
                    }
                } catch (final Throwable ccatch_env_var2) {
                    ignore_errors_tag = Errors.handleThrowable(ccatch_env_var2, $IGNORE_ERRORS_TARGET);
                } finally {
                    thread.throwStack.pop();
                }
            }
            if (NIL != constant_p(keep_fort)) {
                if ((NIL != merged_name) && (NIL != $note_merged_constant_name$.getDynamicValue(thread))) {
                    ke_assert_now(list($$mergedConstantName, keep_fort, merged_name), $$BookkeepingMt, UNPROVIDED, UNPROVIDED);
                }
                if (NIL != merged_guid) {
                    ke_assert_now(list($$mergedConstantGUID, keep_fort, merged_guid), $$BookkeepingMt, UNPROVIDED, UNPROVIDED);
                }
            }
            return result;
        }
        if (NIL != error_message) {
            return values(NIL, list($FATAL_ERROR, error_message));
        }
        if (NIL != fi.fi_error_signaledP()) {
            return values(NIL, list(fi.fi_get_error_int().first(), apply(symbol_function(FORMAT), cons(NIL, fi.fi_get_error_int().rest()))));
        }
        return values(NIL, $list10);
    }

    public static SubLObject ke_kill(final SubLObject fort) {
        if (NIL == ensure_cyclist_ok()) {
            return NIL;
        }
        if ((NIL == forts.fort_p(fort)) || (NIL == constant_completion.constant_mentioned_in_codeP(fort))) {
            return do_edit_op(list(FI_KILL, list(QUOTE, fort)));
        }
        Errors.cerror($$$Skip_this_operation, $str27$Constant__S_cannot_be_killed_beca, fort);
        return NIL;
    }

    public static SubLObject ke_kill_now(SubLObject fort) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = NIL;
        SubLObject transcript_op = NIL;
        SubLObject error_message = NIL;
        fort = eval(fort);
        transcript_op = canon_tl.tl_encapsulate(list(FI_KILL, list(QUOTE, fort)));
        try {
            thread.throwStack.push($catch_error_message_target$.getGlobalValue());
            final SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding(thread);
            try {
                Errors.$error_handler$.bind(CATCH_ERROR_MESSAGE_HANDLER, thread);
                try {
                    result = fi.fi_kill_int(fort);
                } catch (final Throwable catch_var) {
                    Errors.handleThrowable(catch_var, NIL);
                }
            } finally {
                Errors.$error_handler$.rebind(_prev_bind_0, thread);
            }
        } catch (final Throwable ccatch_env_var) {
            error_message = Errors.handleThrowable(ccatch_env_var, $catch_error_message_target$.getGlobalValue());
        } finally {
            thread.throwStack.pop();
        }
        if (NIL != result) {
            operation_queues.possibly_add_to_transcript_queue(transcript_op);
            return result;
        }
        if (NIL != error_message) {
            return values(NIL, list($FATAL_ERROR, error_message));
        }
        if (NIL != fi.fi_error_signaledP()) {
            return values(NIL, list(fi.fi_get_error_int().first(), apply(symbol_function(FORMAT), cons(NIL, fi.fi_get_error_int().rest()))));
        }
        return values(NIL, $list10);
    }

    public static SubLObject ke_recreate(final SubLObject constant) {
        if (NIL != ensure_cyclist_ok()) {
            final SubLObject external_id = constants_high.constant_external_id(constant);
            final SubLObject name = constants_high.constant_name(constant);
            final SubLObject creator = bookkeeping_store.creator(constant, UNPROVIDED);
            final SubLObject creation_time = bookkeeping_store.creation_time(constant, UNPROVIDED);
            final SubLObject purpose = bookkeeping_store.creation_purpose(constant, UNPROVIDED);
            final SubLObject creation_second = bookkeeping_store.creation_second(constant, UNPROVIDED);
            ke_kill(constant);
            fi.fi_create(name, external_id);
            if ((NIL != creator) && (NIL != creation_time)) {
                fi.fi_timestamp_constant(creator, creation_time, purpose, creation_second);
            }
            return T;
        }
        return NIL;
    }

    public static SubLObject rename_code_constant(final SubLObject old_name, final SubLObject new_name) {
        assert NIL != stringp(old_name) : "Types.stringp(old_name) " + "CommonSymbols.NIL != Types.stringp(old_name) " + old_name;
        assert NIL != stringp(new_name) : "Types.stringp(new_name) " + "CommonSymbols.NIL != Types.stringp(new_name) " + new_name;
        final SubLObject constant = constants_high.find_constant(old_name);
        if (NIL != constant) {
            final SubLObject existing = constants_high.find_constant(new_name);
            if ((NIL == existing) || (NIL == valid_constantP(existing, UNPROVIDED))) {
                fi.fi_rename_int(constant, new_name);
                return T;
            }
        }
        return NIL;
    }

    public static SubLObject ke_rename(final SubLObject constant, final SubLObject name) {
        if (NIL != ensure_cyclist_ok()) {
            if (NIL == constant_completion.constant_mentioned_in_codeP(constant)) {
                return ke_rename_internal(constant, name);
            }
            Errors.cerror($$$Skip_this_operation, $str33$Constant__S_cannot_be_renamed_bec, constant);
        }
        return NIL;
    }

    public static SubLObject ke_rename_code_constant(final SubLObject constant, final SubLObject name) {
        if (NIL == ensure_cyclist_ok()) {
            return NIL;
        }
        if (NIL != constant_completion.constant_mentioned_in_codeP(constant)) {
            return ke_rename_internal(constant, name);
        }
        Errors.cerror($str34$Use_KE_RENAME, $str35$Constant__S_is_not_mentioned_in_c, constant);
        return ke_rename(constant, name);
    }

    public static SubLObject ke_rename_internal(final SubLObject constant, final SubLObject name) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject old_name = constants_high.constant_name(constant);
        final SubLObject ans = do_edit_op(list(FI_RENAME, list(QUOTE, constant), list(QUOTE, name)));
        SubLObject error = NIL;
        if (ans != $QUEUED) {
            error = fi.fi_get_error_int();
        }
        if ((NIL != $note_old_constant_name$.getDynamicValue(thread)) && old_name.isString()) {
            note_old_constant_name(constant, old_name);
        }
        nl_generation_fort_cache.nl_generation_cache_clear(constant);
        if (ans != $QUEUED) {
            fi.signal_fi_error(error);
        }
        return ans;
    }

    public static SubLObject note_old_constant_name(final SubLObject constant, final SubLObject old_name) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != constant_p(constant) : "constant_handles.constant_p(constant) " + "CommonSymbols.NIL != constant_handles.constant_p(constant) " + constant;
        assert NIL != stringp(old_name) : "Types.stringp(old_name) " + "CommonSymbols.NIL != Types.stringp(old_name) " + old_name;
        if (NIL != kb_mapping_utilities.some_pred_value_in_mt(constant, $$oldConstantName, $$BookkeepingMt, UNPROVIDED, UNPROVIDED)) {
            final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
            final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
            try {
                mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_EQ, thread);
                mt_relevance_macros.$mt$.bind($$BookkeepingMt, thread);
                final SubLObject pred_var = $$oldConstantName;
                if (NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(constant, ONE_INTEGER, pred_var)) {
                    final SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(constant, ONE_INTEGER, pred_var);
                    SubLObject done_var = NIL;
                    final SubLObject token_var = NIL;
                    while (NIL == done_var) {
                        final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                        final SubLObject valid = makeBoolean(!token_var.eql(final_index_spec));
                        if (NIL != valid) {
                            SubLObject final_index_iterator = NIL;
                            try {
                                final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $GAF, NIL, NIL);
                                SubLObject done_var_$12 = NIL;
                                final SubLObject token_var_$13 = NIL;
                                while (NIL == done_var_$12) {
                                    final SubLObject assertion = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$13);
                                    final SubLObject valid_$14 = makeBoolean(!token_var_$13.eql(assertion));
                                    if (NIL != valid_$14) {
                                        ke_unassert_assertion(assertion);
                                    }
                                    done_var_$12 = makeBoolean(NIL == valid_$14);
                                } 
                            } finally {
                                final SubLObject _prev_bind_0_$15 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                try {
                                    $is_thread_performing_cleanupP$.bind(T, thread);
                                    final SubLObject _values = getValuesAsVector();
                                    if (NIL != final_index_iterator) {
                                        kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                    }
                                    restoreValuesFromVector(_values);
                                } finally {
                                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$15, thread);
                                }
                            }
                        }
                        done_var = makeBoolean(NIL == valid);
                    } 
                }
            } finally {
                mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
                mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
            }
        }
        ke_assert(list($$oldConstantName, constant, old_name), $$BookkeepingMt, UNPROVIDED, UNPROVIDED);
        return constant;
    }

    public static SubLObject ke_rename_now(SubLObject constant, final SubLObject name) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject old_name = constants_high.constant_name(constant);
        SubLObject result = NIL;
        SubLObject transcript_op = NIL;
        SubLObject error_message = NIL;
        constant = eval(constant);
        transcript_op = canon_tl.tl_encapsulate(list(FI_RENAME, list(QUOTE, constant), list(QUOTE, name)));
        try {
            thread.throwStack.push($catch_error_message_target$.getGlobalValue());
            final SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding(thread);
            try {
                Errors.$error_handler$.bind(CATCH_ERROR_MESSAGE_HANDLER, thread);
                try {
                    result = fi.fi_rename_int(constant, name);
                } catch (final Throwable catch_var) {
                    Errors.handleThrowable(catch_var, NIL);
                }
            } finally {
                Errors.$error_handler$.rebind(_prev_bind_0, thread);
            }
        } catch (final Throwable ccatch_env_var) {
            error_message = Errors.handleThrowable(ccatch_env_var, $catch_error_message_target$.getGlobalValue());
        } finally {
            thread.throwStack.pop();
        }
        if (NIL != result) {
            operation_queues.possibly_add_to_transcript_queue(transcript_op);
            if ((NIL != $note_old_constant_name$.getDynamicValue(thread)) && old_name.isString()) {
                SubLObject ignore_errors_tag = NIL;
                try {
                    thread.throwStack.push($IGNORE_ERRORS_TARGET);
                    final SubLObject _prev_bind_2 = Errors.$error_handler$.currentBinding(thread);
                    try {
                        Errors.$error_handler$.bind(symbol_function(IGNORE_ERRORS_HANDLER), thread);
                        try {
                            final SubLObject _prev_bind_0_$16 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                            final SubLObject _prev_bind_3 = mt_relevance_macros.$mt$.currentBinding(thread);
                            try {
                                mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_EQ, thread);
                                mt_relevance_macros.$mt$.bind($$BookkeepingMt, thread);
                                final SubLObject pred_var = $$oldConstantName;
                                if (NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(constant, ONE_INTEGER, pred_var)) {
                                    final SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(constant, ONE_INTEGER, pred_var);
                                    SubLObject done_var = NIL;
                                    final SubLObject token_var = NIL;
                                    while (NIL == done_var) {
                                        final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                                        final SubLObject valid = makeBoolean(!token_var.eql(final_index_spec));
                                        if (NIL != valid) {
                                            SubLObject final_index_iterator = NIL;
                                            try {
                                                final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $GAF, NIL, NIL);
                                                SubLObject done_var_$17 = NIL;
                                                final SubLObject token_var_$18 = NIL;
                                                while (NIL == done_var_$17) {
                                                    final SubLObject assertion = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$18);
                                                    final SubLObject valid_$19 = makeBoolean(!token_var_$18.eql(assertion));
                                                    if (NIL != valid_$19) {
                                                        ke_unassert_assertion_now(assertion);
                                                    }
                                                    done_var_$17 = makeBoolean(NIL == valid_$19);
                                                } 
                                            } finally {
                                                final SubLObject _prev_bind_0_$17 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                                try {
                                                    $is_thread_performing_cleanupP$.bind(T, thread);
                                                    final SubLObject _values = getValuesAsVector();
                                                    if (NIL != final_index_iterator) {
                                                        kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                                    }
                                                    restoreValuesFromVector(_values);
                                                } finally {
                                                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$17, thread);
                                                }
                                            }
                                        }
                                        done_var = makeBoolean(NIL == valid);
                                    } 
                                }
                            } finally {
                                mt_relevance_macros.$mt$.rebind(_prev_bind_3, thread);
                                mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0_$16, thread);
                            }
                        } catch (final Throwable catch_var2) {
                            Errors.handleThrowable(catch_var2, NIL);
                        }
                    } finally {
                        Errors.$error_handler$.rebind(_prev_bind_2, thread);
                    }
                } catch (final Throwable ccatch_env_var2) {
                    ignore_errors_tag = Errors.handleThrowable(ccatch_env_var2, $IGNORE_ERRORS_TARGET);
                } finally {
                    thread.throwStack.pop();
                }
                ke_assert_now(list($$oldConstantName, constant, old_name), $$BookkeepingMt, UNPROVIDED, UNPROVIDED);
                return result;
            }
        }
        if (NIL != error_message) {
            return values($FATAL_ERROR, error_message);
        }
        if (NIL != fi.fi_error_signaledP()) {
            return values(NIL, list(fi.fi_get_error_int().first(), apply(symbol_function(FORMAT), cons(NIL, fi.fi_get_error_int().rest()))));
        }
        return values(NIL, $list10);
    }

    public static SubLObject ke_assert(final SubLObject formula, SubLObject mt, SubLObject strength, SubLObject direction) {
        if (strength == UNPROVIDED) {
            strength = NIL;
        }
        if (direction == UNPROVIDED) {
            direction = NIL;
        }
        if (NIL == strength) {
            strength = $DEFAULT;
        }
        if (NIL != ensure_cyclist_ok()) {
            mt = hlmt_czer.canonicalize_hlmt(mt);
            final SubLObject ans = do_edit_op(listS(FI_ASSERT, list(QUOTE, formula), list(QUOTE, mt), list(QUOTE, strength), append(NIL != direction ? list(list(QUOTE, direction)) : NIL, NIL)));
            SubLObject error = NIL;
            if (ans != $QUEUED) {
                error = fi.fi_get_error_int();
            }
            do_edit_op(list(FI_TIMESTAMP_ASSERTION, list(QUOTE, operation_communication.the_cyclist()), list(QUOTE, fi.the_date()), list(QUOTE, fi.ke_purpose()), list(QUOTE, fi.the_second())));
            if (ans != $QUEUED) {
                fi.signal_fi_error(error);
            }
            return ans;
        }
        return NIL;
    }

    public static SubLObject ke_reassert_assertion_now(final SubLObject assertion, final SubLObject strength, final SubLObject direction) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != assertion_handles.assertion_p(assertion) : "assertion_handles.assertion_p(assertion) " + "CommonSymbols.NIL != assertion_handles.assertion_p(assertion) " + assertion;
        assert NIL != enumeration_types.el_strength_p(strength) : "enumeration_types.el_strength_p(strength) " + "CommonSymbols.NIL != enumeration_types.el_strength_p(strength) " + strength;
        assert NIL != enumeration_types.direction_p(direction) : "enumeration_types.direction_p(direction) " + "CommonSymbols.NIL != enumeration_types.direction_p(direction) " + direction;
        if (NIL == ensure_cyclist_ok()) {
            return NIL;
        }
        thread.resetMultipleValues();
        final SubLObject result = ke_reassert_assertion_now_int(assertion, strength, direction);
        final SubLObject error_message = thread.secondMultipleValue();
        final SubLObject sentence = thread.thirdMultipleValue();
        final SubLObject v_hlmt = thread.fourthMultipleValue();
        thread.resetMultipleValues();
        if (NIL != result) {
            final SubLObject sentence_$21 = ke_assertion_find_formula(assertion);
            final SubLObject v_hlmt_$22 = hlmt_czer.canonicalize_hlmt(assertions_high.assertion_mt(assertion));
            operation_queues.possibly_add_to_transcript_queue(canon_tl.tl_encapsulate(list(FI_REASSERT, list(QUOTE, sentence_$21), list(QUOTE, v_hlmt_$22), list(QUOTE, strength), list(QUOTE, direction))));
            return result;
        }
        if (NIL != error_message) {
            return values(NIL, list($FATAL_ERROR, error_message));
        }
        if (NIL != fi.fi_error_signaledP()) {
            return values(NIL, list(fi.fi_get_error_int().first(), apply(symbol_function(FORMAT), cons(NIL, fi.fi_get_error_int().rest()))));
        }
        return values(NIL, $list10);
    }

    public static SubLObject ke_reassert_assertion_now_int(final SubLObject assertion, final SubLObject strength, final SubLObject direction) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject sentence = ke_assertion_find_formula(assertion);
        final SubLObject v_hlmt = hlmt_czer.canonicalize_hlmt(assertions_high.assertion_mt(assertion));
        SubLObject result = NIL;
        SubLObject error_message = NIL;
        try {
            thread.throwStack.push($catch_error_message_target$.getGlobalValue());
            final SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding(thread);
            try {
                Errors.$error_handler$.bind(CATCH_ERROR_MESSAGE_HANDLER, thread);
                try {
                    result = fi.fi_reassert_int(sentence, v_hlmt, strength, direction);
                } catch (final Throwable catch_var) {
                    Errors.handleThrowable(catch_var, NIL);
                }
            } finally {
                Errors.$error_handler$.rebind(_prev_bind_0, thread);
            }
        } catch (final Throwable ccatch_env_var) {
            error_message = Errors.handleThrowable(ccatch_env_var, $catch_error_message_target$.getGlobalValue());
        } finally {
            thread.throwStack.pop();
        }
        return values(result, error_message, sentence, v_hlmt);
    }

    public static SubLObject ke_reassert_assertion(final SubLObject assertion, final SubLObject strength, final SubLObject direction) {
        assert NIL != assertion_handles.assertion_p(assertion) : "assertion_handles.assertion_p(assertion) " + "CommonSymbols.NIL != assertion_handles.assertion_p(assertion) " + assertion;
        if (NIL != ensure_cyclist_ok()) {
            final SubLObject formula = ke_assertion_find_formula(assertion);
            final SubLObject v_hlmt = hlmt_czer.canonicalize_hlmt(assertions_high.assertion_mt(assertion));
            return do_edit_op(list(FI_REASSERT, list(QUOTE, formula), list(QUOTE, v_hlmt), list(QUOTE, strength), list(QUOTE, direction)));
        }
        return NIL;
    }

    public static SubLObject ke_reassert_assertion_int(final SubLObject assertion, final SubLObject strength, final SubLObject direction) {
        assert NIL != assertion_handles.assertion_p(assertion) : "assertion_handles.assertion_p(assertion) " + "CommonSymbols.NIL != assertion_handles.assertion_p(assertion) " + assertion;
        if (NIL != ensure_cyclist_ok()) {
            final SubLObject formula = ke_assertion_find_formula(assertion);
            final SubLObject v_hlmt = hlmt_czer.canonicalize_hlmt(assertions_high.assertion_mt(assertion));
            return do_edit_op(list(FI_REASSERT_INT, list(QUOTE, formula), list(QUOTE, v_hlmt), list(QUOTE, strength), list(QUOTE, direction)));
        }
        return NIL;
    }

    public static SubLObject ke_repropagate_assertion_now(final SubLObject assertion) {
        assert NIL != assertion_handles.assertion_p(assertion) : "assertion_handles.assertion_p(assertion) " + "CommonSymbols.NIL != assertion_handles.assertion_p(assertion) " + assertion;
        if (NIL != assertions_high.forward_assertionP(assertion)) {
            final SubLObject strength = assertions_high.assertion_strength(assertion);
            ke_reassert_assertion_now(assertion, strength, $BACKWARD);
            ke_reassert_assertion_now(assertion, strength, $FORWARD);
            return assertion;
        }
        return NIL;
    }

    public static SubLObject ke_repropagate_assertion(final SubLObject assertion) {
        assert NIL != assertion_handles.assertion_p(assertion) : "assertion_handles.assertion_p(assertion) " + "CommonSymbols.NIL != assertion_handles.assertion_p(assertion) " + assertion;
        if (NIL != assertions_high.forward_assertionP(assertion)) {
            final SubLObject strength = assertions_high.assertion_strength(assertion);
            ke_reassert_assertion(assertion, strength, $BACKWARD);
            ke_reassert_assertion(assertion, strength, $FORWARD);
            return assertion;
        }
        return NIL;
    }

    public static SubLObject ke_repropagate_assertion_now_int(final SubLObject assertion) {
        assert NIL != assertion_handles.assertion_p(assertion) : "assertion_handles.assertion_p(assertion) " + "CommonSymbols.NIL != assertion_handles.assertion_p(assertion) " + assertion;
        if (NIL != assertions_high.forward_assertionP(assertion)) {
            final SubLObject strength = assertions_high.assertion_strength(assertion);
            ke_reassert_assertion_now_int(assertion, strength, $BACKWARD);
            ke_reassert_assertion_now_int(assertion, strength, $FORWARD);
            return assertion;
        }
        return NIL;
    }

    public static SubLObject ke_repropagate_assertion_int(final SubLObject assertion) {
        assert NIL != assertion_handles.assertion_p(assertion) : "assertion_handles.assertion_p(assertion) " + "CommonSymbols.NIL != assertion_handles.assertion_p(assertion) " + assertion;
        if (NIL != assertions_high.forward_assertionP(assertion)) {
            final SubLObject strength = assertions_high.assertion_strength(assertion);
            ke_reassert_assertion_int(assertion, strength, $BACKWARD);
            ke_reassert_assertion_int(assertion, strength, $FORWARD);
            return assertion;
        }
        return NIL;
    }

    public static SubLObject ke_assert_now(final SubLObject formula, final SubLObject mt, SubLObject strength, SubLObject direction) {
        if (strength == UNPROVIDED) {
            strength = $DEFAULT;
        }
        if (direction == UNPROVIDED) {
            direction = NIL;
        }
        return ke_assert_now_int(formula, mt, strength, direction, UNPROVIDED);
    }

    public static SubLObject ke_assert_wff_now(final SubLObject formula, final SubLObject mt, SubLObject strength, SubLObject direction) {
        if (strength == UNPROVIDED) {
            strength = $DEFAULT;
        }
        if (direction == UNPROVIDED) {
            direction = NIL;
        }
        return ke_assert_now_int(formula, mt, strength, direction, TRUE);
    }

    public static SubLObject ke_assert_now_and_propagate_later(final SubLObject formula, final SubLObject mt, SubLObject strength, SubLObject direction) {
        if (strength == UNPROVIDED) {
            strength = $DEFAULT;
        }
        if (direction == UNPROVIDED) {
            direction = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != ensure_cyclist_ok()) {
            SubLObject result = NIL;
            SubLObject error = NIL;
            final SubLObject _prev_bind_0 = kb_control_vars.$forward_inference_allowed_rules$.currentBinding(thread);
            try {
                kb_control_vars.$forward_inference_allowed_rules$.bind(NIL, thread);
                thread.resetMultipleValues();
                final SubLObject result_$23 = ke_assert_now(formula, mt, strength, direction);
                final SubLObject error_$24 = thread.secondMultipleValue();
                thread.resetMultipleValues();
                result = result_$23;
                error = error_$24;
            } finally {
                kb_control_vars.$forward_inference_allowed_rules$.rebind(_prev_bind_0, thread);
            }
            ke_repropagate_assertion_int(czer_meta.find_assertion_cycl(formula, mt));
            return values(result, error);
        }
        return NIL;
    }

    public static SubLObject ke_assert_now_int(final SubLObject formula, final SubLObject mt, final SubLObject strength, final SubLObject direction, SubLObject wff_test) {
        if (wff_test == UNPROVIDED) {
            wff_test = $ke_assert_now_assume_wff_test$.getDynamicValue();
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = NIL;
        SubLObject error_message = NIL;
        final SubLObject v_hlmt = hlmt_czer.canonicalize_hlmt(mt);
        SubLObject assertions = NIL;
        if (NIL == $inference_debugP$.getDynamicValue(thread)) {
            try {
                thread.throwStack.push($catch_error_message_target$.getGlobalValue());
                final SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding(thread);
                try {
                    Errors.$error_handler$.bind(CATCH_ERROR_MESSAGE_HANDLER, thread);
                    try {
                        final SubLObject _prev_bind_0_$25 = czer_vars.$fi_last_assertions_asserted$.currentBinding(thread);
                        try {
                            czer_vars.$fi_last_assertions_asserted$.bind(NIL, thread);
                            final SubLObject environment = forward.get_forward_inference_environment();
                            assert NIL != queues.queue_p(environment) : "queues.queue_p(environment) " + "CommonSymbols.NIL != queues.queue_p(environment) " + environment;
                            final SubLObject _prev_bind_0_$26 = kb_control_vars.$forward_inference_environment$.currentBinding(thread);
                            try {
                                kb_control_vars.$forward_inference_environment$.bind(environment, thread);
                                final SubLObject v_properties = list($STRENGTH, strength, $DIRECTION, direction);
                                if (NIL != funcall(wff_test, formula, mt, strength, direction)) {
                                    result = cyc_kernel.cyc_assert_wff(formula, v_hlmt, v_properties);
                                } else {
                                    result = cyc_kernel.cyc_assert(formula, v_hlmt, v_properties);
                                }
                            } finally {
                                kb_control_vars.$forward_inference_environment$.rebind(_prev_bind_0_$26, thread);
                            }
                            assertions = czer_vars.$fi_last_assertions_asserted$.getDynamicValue(thread);
                        } finally {
                            czer_vars.$fi_last_assertions_asserted$.rebind(_prev_bind_0_$25, thread);
                        }
                    } catch (final Throwable catch_var) {
                        Errors.handleThrowable(catch_var, NIL);
                    }
                } finally {
                    Errors.$error_handler$.rebind(_prev_bind_0, thread);
                }
            } catch (final Throwable ccatch_env_var) {
                error_message = Errors.handleThrowable(ccatch_env_var, $catch_error_message_target$.getGlobalValue());
            } finally {
                thread.throwStack.pop();
            }
        } else {
            final SubLObject _prev_bind_0 = czer_vars.$fi_last_assertions_asserted$.currentBinding(thread);
            try {
                czer_vars.$fi_last_assertions_asserted$.bind(NIL, thread);
                final SubLObject environment2 = forward.get_forward_inference_environment();
                assert NIL != queues.queue_p(environment2) : "queues.queue_p(environment2) " + "CommonSymbols.NIL != queues.queue_p(environment2) " + environment2;
                final SubLObject _prev_bind_0_$27 = kb_control_vars.$forward_inference_environment$.currentBinding(thread);
                try {
                    kb_control_vars.$forward_inference_environment$.bind(environment2, thread);
                    final SubLObject v_properties2 = list($STRENGTH, strength, $DIRECTION, direction);
                    if (NIL != funcall(wff_test, formula, mt, strength, direction)) {
                        result = cyc_kernel.cyc_assert_wff(formula, v_hlmt, v_properties2);
                    } else {
                        result = cyc_kernel.cyc_assert(formula, v_hlmt, v_properties2);
                    }
                } finally {
                    kb_control_vars.$forward_inference_environment$.rebind(_prev_bind_0_$27, thread);
                }
                assertions = czer_vars.$fi_last_assertions_asserted$.getDynamicValue(thread);
            } finally {
                czer_vars.$fi_last_assertions_asserted$.rebind(_prev_bind_0, thread);
            }
        }
        if (NIL != result) {
            operation_queues.possibly_add_to_transcript_queue(canon_tl.tl_encapsulate(fi.fi_construct_form_to_enqueue(FI_ASSERT, formula, v_hlmt, strength, direction, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED)));
            SubLObject ignore_errors_tag = NIL;
            try {
                thread.throwStack.push($IGNORE_ERRORS_TARGET);
                final SubLObject _prev_bind_2 = Errors.$error_handler$.currentBinding(thread);
                try {
                    Errors.$error_handler$.bind(symbol_function(IGNORE_ERRORS_HANDLER), thread);
                    try {
                        final SubLObject _prev_bind_0_$28 = czer_vars.$fi_last_assertions_asserted$.currentBinding(thread);
                        try {
                            czer_vars.$fi_last_assertions_asserted$.bind(assertions, thread);
                            if (NIL != fi.fi_timestamp_assertion_int(operation_communication.the_cyclist(), fi.the_date(), fi.ke_purpose(), fi.the_second())) {
                                operation_queues.possibly_add_to_transcript_queue(canon_tl.tl_encapsulate(fi.fi_construct_form_to_enqueue(FI_TIMESTAMP_ASSERTION, operation_communication.the_cyclist(), fi.the_date(), fi.ke_purpose(), fi.the_second(), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED)));
                            }
                        } finally {
                            czer_vars.$fi_last_assertions_asserted$.rebind(_prev_bind_0_$28, thread);
                        }
                    } catch (final Throwable catch_var2) {
                        Errors.handleThrowable(catch_var2, NIL);
                    }
                } finally {
                    Errors.$error_handler$.rebind(_prev_bind_2, thread);
                }
            } catch (final Throwable ccatch_env_var2) {
                ignore_errors_tag = Errors.handleThrowable(ccatch_env_var2, $IGNORE_ERRORS_TARGET);
            } finally {
                thread.throwStack.pop();
            }
            return values(result, NIL);
        }
        if (NIL != error_message) {
            return values(NIL, list($FATAL_ERROR, error_message));
        }
        if (NIL != fi.fi_error_signaledP()) {
            return values(NIL, list(fi.fi_get_error_int().first(), apply(symbol_function(FORMAT), cons(NIL, fi.fi_get_error_int().rest()))));
        }
        return values(NIL, $list10);
    }

    public static SubLObject ke_assert_with_implicature(final SubLObject formula, final SubLObject mt, SubLObject strength, SubLObject direction) {
        if (strength == UNPROVIDED) {
            strength = $DEFAULT;
        }
        if (direction == UNPROVIDED) {
            direction = NIL;
        }
        return ke_assert_with_implicature_int(formula, mt, strength, direction, NIL);
    }

    public static SubLObject ke_assert_now_with_implicature(final SubLObject formula, final SubLObject mt, SubLObject strength, SubLObject direction) {
        if (strength == UNPROVIDED) {
            strength = $DEFAULT;
        }
        if (direction == UNPROVIDED) {
            direction = NIL;
        }
        return ke_assert_with_implicature_int(formula, mt, strength, direction, T);
    }

    public static SubLObject ke_assert_with_implicature_int(final SubLObject formula, final SubLObject mt, final SubLObject strength, final SubLObject direction, final SubLObject nowP) {
        SubLObject result = NIL;
        if (NIL != wff.el_wffP(formula, mt, UNPROVIDED)) {
            result = ke_assert_with_implicature_int_assert(formula, mt, strength, direction, nowP);
        } else {
            final SubLObject repairs = wff_suggest.non_wffness_repairs(formula, mt);
            if (NIL != repairs) {
                SubLObject cdolist_list_var = repairs;
                SubLObject repair = NIL;
                repair = cdolist_list_var.first();
                while (NIL != cdolist_list_var) {
                    ke_assert_with_implicature_int_assert(repair, mt, strength, direction, nowP);
                    cdolist_list_var = cdolist_list_var.rest();
                    repair = cdolist_list_var.first();
                } 
                result = ke_assert_with_implicature_int_assert(formula, mt, strength, direction, nowP);
            }
        }
        return result;
    }

    public static SubLObject ke_assert_with_implicature_int_assert(final SubLObject formula, final SubLObject mt, final SubLObject strength, final SubLObject direction, final SubLObject nowP) {
        return NIL != nowP ? ke_assert_now(formula, mt, strength, direction) : ke_assert(formula, mt, strength, direction);
    }

    public static SubLObject ke_unassert(final SubLObject sentence, SubLObject mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL == ensure_cyclist_ok()) {
            return NIL;
        }
        mt = hlmt_czer.canonicalize_hlmt(mt);
        if ((NIL == $check_if_already_ke_unassertedP$.getDynamicValue(thread)) || (NIL != fi.sentence_assertions(sentence, mt))) {
            return do_edit_op(list(FI_UNASSERT, list(QUOTE, sentence), list(QUOTE, mt)));
        }
        Errors.error($str64$Sentence__S_in_mt__S__is_not_in_t, sentence, mt);
        return NIL;
    }

    public static SubLObject ke_unassert_assertion(final SubLObject assertion) {
        assert NIL != assertion_handles.assertion_p(assertion) : "assertion_handles.assertion_p(assertion) " + "CommonSymbols.NIL != assertion_handles.assertion_p(assertion) " + assertion;
        return ke_unassert(ke_assertion_find_formula(assertion), assertions_high.assertion_mt(assertion));
    }

    public static SubLObject ke_unassert_now(final SubLObject formula, final SubLObject mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = NIL;
        SubLObject error_message = NIL;
        final SubLObject v_hlmt = hlmt_czer.canonicalize_hlmt(mt);
        final SubLObject fi_formula = canon_tl.tl_encapsulate(list(FI_UNASSERT, list(QUOTE, formula), list(QUOTE, v_hlmt)));
        try {
            thread.throwStack.push($catch_error_message_target$.getGlobalValue());
            final SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding(thread);
            try {
                Errors.$error_handler$.bind(CATCH_ERROR_MESSAGE_HANDLER, thread);
                try {
                    result = fi.fi_unassert_int(formula, v_hlmt);
                } catch (final Throwable catch_var) {
                    Errors.handleThrowable(catch_var, NIL);
                }
            } finally {
                Errors.$error_handler$.rebind(_prev_bind_0, thread);
            }
        } catch (final Throwable ccatch_env_var) {
            error_message = Errors.handleThrowable(ccatch_env_var, $catch_error_message_target$.getGlobalValue());
        } finally {
            thread.throwStack.pop();
        }
        if (NIL != result) {
            operation_queues.possibly_add_to_transcript_queue(fi_formula);
            return result;
        }
        if (NIL != error_message) {
            return values(NIL, list($FATAL_ERROR, error_message));
        }
        if (NIL != fi.fi_error_signaledP()) {
            return values(NIL, list(fi.fi_get_error_int().first(), apply(symbol_function(FORMAT), cons(NIL, fi.fi_get_error_int().rest()))));
        }
        return values(NIL, $list10);
    }

    public static SubLObject ke_unassert_assertion_now(final SubLObject assertion) {
        assert NIL != assertion_handles.assertion_p(assertion) : "assertion_handles.assertion_p(assertion) " + "CommonSymbols.NIL != assertion_handles.assertion_p(assertion) " + assertion;
        if (NIL != assertion_handles.valid_assertionP(assertion, UNPROVIDED)) {
            return ke_unassert_now(ke_assertion_find_formula(assertion), assertions_high.assertion_mt(assertion));
        }
        return NIL;
    }

    public static SubLObject ke_edit(final SubLObject old_formula, final SubLObject new_formula, final SubLObject old_mt, SubLObject new_mt, SubLObject strength, SubLObject direction) {
        if (new_mt == UNPROVIDED) {
            new_mt = old_mt;
        }
        if (strength == UNPROVIDED) {
            strength = $DEFAULT;
        }
        if (direction == UNPROVIDED) {
            direction = NIL;
        }
        final SubLObject old_hlmt = hlmt_czer.canonicalize_hlmt(old_mt);
        final SubLObject new_hlmt = hlmt_czer.canonicalize_hlmt(new_mt);
        if (NIL == $ke_edit_use_fi_edit$.getGlobalValue()) {
            ke_unassert(old_formula, old_hlmt);
            return ke_assert(new_formula, new_hlmt, strength, direction);
        }
        if (NIL != ensure_cyclist_ok()) {
            final SubLObject ans = do_edit_op(listS(FI_EDIT, new SubLObject[]{ list(QUOTE, old_formula), list(QUOTE, new_formula), list(QUOTE, old_hlmt), list(QUOTE, new_hlmt), list(QUOTE, strength), append(NIL != direction ? list(list(QUOTE, direction)) : NIL, NIL) }));
            SubLObject error = NIL;
            if (ans != $QUEUED) {
                error = fi.fi_get_error_int();
            }
            do_edit_op(list(FI_TIMESTAMP_ASSERTION, list(QUOTE, operation_communication.the_cyclist()), list(QUOTE, fi.the_date()), list(QUOTE, fi.ke_purpose()), list(QUOTE, fi.the_second())));
            if (ans != $QUEUED) {
                fi.signal_fi_error(error);
            }
            return ans;
        }
        return NIL;
    }

    public static SubLObject ke_edit_now(final SubLObject old_formula, final SubLObject new_formula, final SubLObject old_mt, SubLObject new_mt, SubLObject strength, SubLObject direction) {
        if (new_mt == UNPROVIDED) {
            new_mt = old_mt;
        }
        if (strength == UNPROVIDED) {
            strength = $DEFAULT;
        }
        if (direction == UNPROVIDED) {
            direction = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject old_hlmt = hlmt_czer.canonicalize_hlmt(old_mt);
        final SubLObject new_hlmt = hlmt_czer.canonicalize_hlmt(new_mt);
        SubLObject assertions = NIL;
        SubLObject error_message = NIL;
        SubLObject result = NIL;
        if (NIL == $ke_edit_use_fi_edit$.getGlobalValue()) {
            ke_unassert_now(old_formula, old_hlmt);
            return ke_assert_now(new_formula, new_hlmt, strength, direction);
        }
        if (NIL == $inference_debugP$.getDynamicValue(thread)) {
            try {
                thread.throwStack.push($catch_error_message_target$.getGlobalValue());
                final SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding(thread);
                try {
                    Errors.$error_handler$.bind(CATCH_ERROR_MESSAGE_HANDLER, thread);
                    try {
                        final SubLObject _prev_bind_0_$29 = czer_vars.$fi_last_assertions_asserted$.currentBinding(thread);
                        try {
                            czer_vars.$fi_last_assertions_asserted$.bind(NIL, thread);
                            final SubLObject environment = forward.get_forward_inference_environment();
                            assert NIL != queues.queue_p(environment) : "queues.queue_p(environment) " + "CommonSymbols.NIL != queues.queue_p(environment) " + environment;
                            final SubLObject _prev_bind_0_$30 = kb_control_vars.$forward_inference_environment$.currentBinding(thread);
                            try {
                                kb_control_vars.$forward_inference_environment$.bind(environment, thread);
                                result = fi.fi_edit_int(old_formula, new_formula, old_hlmt, new_hlmt, strength, direction);
                            } finally {
                                kb_control_vars.$forward_inference_environment$.rebind(_prev_bind_0_$30, thread);
                            }
                            assertions = czer_vars.$fi_last_assertions_asserted$.getDynamicValue(thread);
                        } finally {
                            czer_vars.$fi_last_assertions_asserted$.rebind(_prev_bind_0_$29, thread);
                        }
                    } catch (final Throwable catch_var) {
                        Errors.handleThrowable(catch_var, NIL);
                    }
                } finally {
                    Errors.$error_handler$.rebind(_prev_bind_0, thread);
                }
            } catch (final Throwable ccatch_env_var) {
                error_message = Errors.handleThrowable(ccatch_env_var, $catch_error_message_target$.getGlobalValue());
            } finally {
                thread.throwStack.pop();
            }
        } else {
            final SubLObject _prev_bind_0 = czer_vars.$fi_last_assertions_asserted$.currentBinding(thread);
            try {
                czer_vars.$fi_last_assertions_asserted$.bind(NIL, thread);
                final SubLObject environment2 = forward.get_forward_inference_environment();
                assert NIL != queues.queue_p(environment2) : "queues.queue_p(environment2) " + "CommonSymbols.NIL != queues.queue_p(environment2) " + environment2;
                final SubLObject _prev_bind_0_$31 = kb_control_vars.$forward_inference_environment$.currentBinding(thread);
                try {
                    kb_control_vars.$forward_inference_environment$.bind(environment2, thread);
                    result = fi.fi_edit_int(old_formula, new_formula, old_hlmt, new_hlmt, strength, direction);
                } finally {
                    kb_control_vars.$forward_inference_environment$.rebind(_prev_bind_0_$31, thread);
                }
                assertions = czer_vars.$fi_last_assertions_asserted$.getDynamicValue(thread);
            } finally {
                czer_vars.$fi_last_assertions_asserted$.rebind(_prev_bind_0, thread);
            }
        }
        if (NIL != result) {
            operation_queues.possibly_add_to_transcript_queue(canon_tl.tl_encapsulate(fi.fi_construct_form_to_enqueue(FI_EDIT, old_formula, new_formula, old_mt, new_mt, strength, direction, UNPROVIDED, UNPROVIDED)));
            SubLObject ignore_errors_tag = NIL;
            try {
                thread.throwStack.push($IGNORE_ERRORS_TARGET);
                final SubLObject _prev_bind_2 = Errors.$error_handler$.currentBinding(thread);
                try {
                    Errors.$error_handler$.bind(symbol_function(IGNORE_ERRORS_HANDLER), thread);
                    try {
                        final SubLObject _prev_bind_0_$32 = czer_vars.$fi_last_assertions_asserted$.currentBinding(thread);
                        try {
                            czer_vars.$fi_last_assertions_asserted$.bind(assertions, thread);
                            if (NIL != fi.fi_timestamp_assertion_int(operation_communication.the_cyclist(), fi.the_date(), fi.ke_purpose(), fi.the_second())) {
                                operation_queues.possibly_add_to_transcript_queue(canon_tl.tl_encapsulate(fi.fi_construct_form_to_enqueue(FI_TIMESTAMP_ASSERTION, operation_communication.the_cyclist(), fi.the_date(), fi.ke_purpose(), fi.the_second(), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED)));
                            }
                        } finally {
                            czer_vars.$fi_last_assertions_asserted$.rebind(_prev_bind_0_$32, thread);
                        }
                    } catch (final Throwable catch_var2) {
                        Errors.handleThrowable(catch_var2, NIL);
                    }
                } finally {
                    Errors.$error_handler$.rebind(_prev_bind_2, thread);
                }
            } catch (final Throwable ccatch_env_var2) {
                ignore_errors_tag = Errors.handleThrowable(ccatch_env_var2, $IGNORE_ERRORS_TARGET);
            } finally {
                thread.throwStack.pop();
            }
            return values(result, NIL);
        }
        if (NIL != error_message) {
            return values(NIL, list($FATAL_ERROR, error_message));
        }
        if (NIL != fi.fi_error_signaledP()) {
            return values(NIL, list(fi.fi_get_error_int().first(), apply(symbol_function(FORMAT), cons(NIL, fi.fi_get_error_int().rest()))));
        }
        return values(NIL, $list10);
    }

    public static SubLObject ke_edit_assertion(final SubLObject assertion, final SubLObject new_formula, SubLObject new_mt, SubLObject strength, SubLObject direction) {
        if (new_mt == UNPROVIDED) {
            new_mt = NIL;
        }
        if (strength == UNPROVIDED) {
            strength = NIL;
        }
        if (direction == UNPROVIDED) {
            direction = NIL;
        }
        assert NIL != assertion_handles.assertion_p(assertion) : "assertion_handles.assertion_p(assertion) " + "CommonSymbols.NIL != assertion_handles.assertion_p(assertion) " + assertion;
        if (NIL != assertions_high.asserted_assertionP(assertion)) {
            final SubLObject old_formula = ke_assertion_find_formula(assertion);
            final SubLObject old_mt = assertions_high.assertion_mt(assertion);
            final SubLObject old_strength = assertions_high.assertion_strength(assertion);
            final SubLObject old_direction = assertions_high.assertion_direction(assertion);
            if (NIL == new_mt) {
                new_mt = old_mt;
            }
            if (NIL == strength) {
                strength = old_strength;
            }
            if (NIL == direction) {
                direction = old_direction;
            }
            return ke_edit(old_formula, new_formula, old_mt, new_mt, strength, direction);
        }
        return NIL;
    }

    public static SubLObject ke_edit_assertion_preserving_meta_assertions(final SubLObject assertion, final SubLObject meta_assertions_to_preserve, final SubLObject new_formula, SubLObject new_mt, SubLObject strength, SubLObject direction) {
        if (new_mt == UNPROVIDED) {
            new_mt = NIL;
        }
        if (strength == UNPROVIDED) {
            strength = NIL;
        }
        if (direction == UNPROVIDED) {
            direction = NIL;
        }
        return ke_edit_assertion_preserving_meta_assertions_int(assertion, meta_assertions_to_preserve, new_formula, new_mt, strength, direction, NIL);
    }

    public static SubLObject ke_edit_assertion_now_preserving_meta_assertions(final SubLObject assertion, final SubLObject meta_assertions_to_preserve, final SubLObject new_formula, SubLObject new_mt, SubLObject strength, SubLObject direction) {
        if (new_mt == UNPROVIDED) {
            new_mt = NIL;
        }
        if (strength == UNPROVIDED) {
            strength = NIL;
        }
        if (direction == UNPROVIDED) {
            direction = NIL;
        }
        return ke_edit_assertion_preserving_meta_assertions_int(assertion, meta_assertions_to_preserve, new_formula, new_mt, strength, direction, T);
    }

    public static SubLObject ke_edit_assertion_preserving_meta_assertions_int(final SubLObject assertion, SubLObject meta_assertions_to_preserve, final SubLObject new_formula, SubLObject new_mt, SubLObject strength, SubLObject direction, final SubLObject nowP) {
        assert NIL != assertion_handles.assertion_p(assertion) : "assertion_handles.assertion_p(assertion) " + "CommonSymbols.NIL != assertion_handles.assertion_p(assertion) " + assertion;
        if (NIL != assertions_high.asserted_assertionP(assertion)) {
            if (meta_assertions_to_preserve == $ALL) {
                meta_assertions_to_preserve = assertion_utilities.all_meta_assertions(assertion);
            }
            final SubLObject old_formula = ke_assertion_find_formula(assertion);
            final SubLObject old_mt = assertions_high.assertion_mt(assertion);
            final SubLObject old_strength = assertions_high.assertion_strength(assertion);
            final SubLObject old_direction = assertions_high.assertion_direction(assertion);
            if (NIL == new_mt) {
                new_mt = old_mt;
            }
            if (NIL == strength) {
                strength = old_strength;
            }
            if (NIL == direction) {
                direction = old_direction;
            }
            final SubLObject new_meta_assertion_assertibles = ke_edit_compute_new_meta_assertion_assertibles(assertion, meta_assertions_to_preserve, new_formula, new_mt);
            final SubLObject v_answer = (NIL != nowP) ? ke_edit_now(old_formula, new_formula, old_mt, new_mt, strength, direction) : ke_edit(old_formula, new_formula, old_mt, new_mt, strength, direction);
            SubLObject cdolist_list_var = new_meta_assertion_assertibles;
            SubLObject new_meta_assertion_assertible = NIL;
            new_meta_assertion_assertible = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                SubLObject current;
                final SubLObject datum = current = new_meta_assertion_assertible;
                SubLObject new_meta_assertion_el_formula = NIL;
                SubLObject new_meta_assertion_mt = NIL;
                SubLObject new_meta_assertion_strength = NIL;
                SubLObject new_meta_assertion_direction = NIL;
                destructuring_bind_must_consp(current, datum, $list77);
                new_meta_assertion_el_formula = current.first();
                current = current.rest();
                destructuring_bind_must_consp(current, datum, $list77);
                new_meta_assertion_mt = current.first();
                current = current.rest();
                destructuring_bind_must_consp(current, datum, $list77);
                new_meta_assertion_strength = current.first();
                current = current.rest();
                destructuring_bind_must_consp(current, datum, $list77);
                new_meta_assertion_direction = current.first();
                current = current.rest();
                if (NIL == current) {
                    if (NIL != nowP) {
                        ke_assert_now(new_meta_assertion_el_formula, new_meta_assertion_mt, new_meta_assertion_strength, new_meta_assertion_direction);
                    } else {
                        ke_assert(new_meta_assertion_el_formula, new_meta_assertion_mt, new_meta_assertion_strength, new_meta_assertion_direction);
                    }
                } else {
                    cdestructuring_bind_error(datum, $list77);
                }
                cdolist_list_var = cdolist_list_var.rest();
                new_meta_assertion_assertible = cdolist_list_var.first();
            } 
            return v_answer;
        }
        return NIL;
    }

    public static SubLObject ke_edit_assertion_preserving_all_meta_assertions(final SubLObject assertion, final SubLObject new_formula, SubLObject new_mt, SubLObject strength, SubLObject direction) {
        if (new_mt == UNPROVIDED) {
            new_mt = NIL;
        }
        if (strength == UNPROVIDED) {
            strength = NIL;
        }
        if (direction == UNPROVIDED) {
            direction = NIL;
        }
        return ke_edit_assertion_preserving_meta_assertions(assertion, $ALL, new_formula, new_mt, strength, direction);
    }

    public static SubLObject ke_edit_assertion_now_preserving_all_meta_assertions(final SubLObject assertion, final SubLObject new_formula, SubLObject new_mt, SubLObject strength, SubLObject direction) {
        if (new_mt == UNPROVIDED) {
            new_mt = NIL;
        }
        if (strength == UNPROVIDED) {
            strength = NIL;
        }
        if (direction == UNPROVIDED) {
            direction = NIL;
        }
        return ke_edit_assertion_now_preserving_meta_assertions(assertion, $ALL, new_formula, new_mt, strength, direction);
    }

    public static SubLObject ke_null_edit_assertion(final SubLObject assertion) {
        assert NIL != assertion_handles.assertion_p(assertion) : "assertion_handles.assertion_p(assertion) " + "CommonSymbols.NIL != assertion_handles.assertion_p(assertion) " + assertion;
        if (NIL != assertions_high.asserted_assertionP(assertion)) {
            final SubLObject meta_assertions_to_preserve = assertion_utilities.all_meta_assertions(assertion);
            final SubLObject assertion_el_formula = uncanonicalizer.assertion_el_formula(assertion);
            return ke_edit_assertion_preserving_meta_assertions(assertion, meta_assertions_to_preserve, assertion_el_formula, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        }
        return NIL;
    }

    public static SubLObject ke_edit_compute_new_meta_assertion_assertibles(final SubLObject assertion, final SubLObject meta_assertions_to_preserve, final SubLObject new_formula, final SubLObject new_mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject new_meta_assertion_assertibles = NIL;
        final SubLObject _prev_bind_0 = uncanonicalizer.$cache_el_formulaP$.currentBinding(thread);
        try {
            uncanonicalizer.$cache_el_formulaP$.bind(T, thread);
            thread.resetMultipleValues();
            final SubLObject assertion_el_formula = uncanonicalizer.assertion_el_formula(assertion);
            final SubLObject assertion_el_mt = thread.secondMultipleValue();
            thread.resetMultipleValues();
            SubLObject cdolist_list_var = meta_assertions_to_preserve;
            SubLObject old_meta_assertion_info = NIL;
            old_meta_assertion_info = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                thread.resetMultipleValues();
                final SubLObject old_meta_assertion = extract_old_meta_assertion_info(old_meta_assertion_info);
                final SubLObject new_meta_assertion_mt = thread.secondMultipleValue();
                thread.resetMultipleValues();
                thread.resetMultipleValues();
                final SubLObject old_meta_assertion_el_formula = uncanonicalizer.assertion_el_formula(old_meta_assertion);
                final SubLObject old_meta_assertion_el_mt = thread.secondMultipleValue();
                thread.resetMultipleValues();
                final SubLObject new_el_ist_formula = make_binary_formula($$ist, new_mt, new_formula);
                final SubLObject new_meta_assertion_el_formula = cycl_utilities.expression_subst(new_el_ist_formula, assertion_el_formula, old_meta_assertion_el_formula, symbol_function(EQUAL), UNPROVIDED);
                final SubLObject new_meta_assertion_strength = assertions_high.assertion_strength(old_meta_assertion);
                final SubLObject new_meta_assertion_direction = assertions_high.assertion_direction(old_meta_assertion);
                new_meta_assertion_assertibles = cons(list(new_meta_assertion_el_formula, new_meta_assertion_mt, new_meta_assertion_strength, new_meta_assertion_direction), new_meta_assertion_assertibles);
                cdolist_list_var = cdolist_list_var.rest();
                old_meta_assertion_info = cdolist_list_var.first();
            } 
            new_meta_assertion_assertibles = nreverse(new_meta_assertion_assertibles);
        } finally {
            uncanonicalizer.$cache_el_formulaP$.rebind(_prev_bind_0, thread);
        }
        return new_meta_assertion_assertibles;
    }

    public static SubLObject extract_old_meta_assertion_info(final SubLObject old_meta_assertion_info) {
        if (NIL != assertion_handles.assertion_p(old_meta_assertion_info)) {
            return values(old_meta_assertion_info, assertions_high.assertion_mt(old_meta_assertion_info));
        }
        SubLObject old_meta_assertion = NIL;
        destructuring_bind_must_consp(old_meta_assertion_info, old_meta_assertion_info, $list80);
        old_meta_assertion = old_meta_assertion_info.first();
        SubLObject current = old_meta_assertion_info.rest();
        final SubLObject new_meta_assertion_mt = (current.isCons()) ? current.first() : NIL;
        destructuring_bind_must_listp(current, old_meta_assertion_info, $list80);
        current = current.rest();
        if (NIL == current) {
            return values(old_meta_assertion, NIL != new_meta_assertion_mt ? new_meta_assertion_mt : assertions_high.assertion_mt(old_meta_assertion));
        }
        cdestructuring_bind_error(old_meta_assertion_info, $list80);
        return NIL;
    }

    public static SubLObject ke_add_assertion_original_text(final SubLObject sentence, final SubLObject mt, SubLObject sentence_original_text, SubLObject nowP) {
        if (nowP == UNPROVIDED) {
            nowP = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (((NIL != $ke_add_assertion_original_textP$.getDynamicValue(thread)) && (NIL != el_conditional_sentence_p(sentence))) && sentence_original_text.isString()) {
            sentence_original_text = cconcatenate($str81$_pre_, new SubLObject[]{ sentence_original_text, $str82$__code_ });
            final SubLObject assertion_ist_formula = (NIL != mt) ? make_ist_sentence(mt, sentence) : sentence;
            final SubLObject assertion_original_text_sentence = make_binary_formula($$assertionOriginalText, assertion_ist_formula, sentence_original_text);
            return NIL != nowP ? ke_assert_now(assertion_original_text_sentence, $$BookkeepingMt, UNPROVIDED, UNPROVIDED) : ke_assert(assertion_original_text_sentence, $$BookkeepingMt, UNPROVIDED, UNPROVIDED);
        }
        return NIL;
    }

    public static SubLObject ke_edit_assertion_strings(final SubLObject old_assertion, final SubLObject new_sentence, SubLObject meta_assertions_to_preserve) {
        if (meta_assertions_to_preserve == UNPROVIDED) {
            meta_assertions_to_preserve = NIL;
        }
        assert NIL != assertion_handles.assertion_p(old_assertion) : "assertion_handles.assertion_p(old_assertion) " + "CommonSymbols.NIL != assertion_handles.assertion_p(old_assertion) " + old_assertion;
        final SubLObject old_sentence = ke_assertion_edit_formula(old_assertion);
        if (NIL == formulas_differ_only_in_strings(old_sentence, new_sentence, UNPROVIDED)) {
            Errors.error($str84$Sentences_do_not_differ_only_in_s);
        }
        return ke_edit_assertion_but_not_bookkeeping(old_assertion, new_sentence, NIL, NIL, NIL, meta_assertions_to_preserve);
    }

    public static SubLObject ke_recanonicalize_assertion(final SubLObject assertion, SubLObject meta_assertions_to_preserve) {
        if (meta_assertions_to_preserve == UNPROVIDED) {
            meta_assertions_to_preserve = NIL;
        }
        assert NIL != assertion_handles.assertion_p(assertion) : "assertion_handles.assertion_p(assertion) " + "CommonSymbols.NIL != assertion_handles.assertion_p(assertion) " + assertion;
        final SubLObject sentence = ke_assertion_edit_formula(assertion);
        return ke_edit_assertion_but_not_bookkeeping(assertion, sentence, NIL, NIL, NIL, meta_assertions_to_preserve);
    }

    public static SubLObject ke_recanonicalize_assertion_now(final SubLObject assertion, SubLObject meta_assertions_to_preserve) {
        if (meta_assertions_to_preserve == UNPROVIDED) {
            meta_assertions_to_preserve = NIL;
        }
        assert NIL != assertion_handles.assertion_p(assertion) : "assertion_handles.assertion_p(assertion) " + "CommonSymbols.NIL != assertion_handles.assertion_p(assertion) " + assertion;
        final SubLObject sentence = ke_assertion_edit_formula(assertion);
        return ke_edit_assertion_now_but_not_bookkeeping(assertion, sentence, NIL, NIL, NIL, meta_assertions_to_preserve);
    }

    public static SubLObject ke_edit_assertion_but_not_bookkeeping(final SubLObject old_assertion, final SubLObject new_sentence, SubLObject new_mt, SubLObject strength, SubLObject direction, SubLObject meta_assertions_to_preserve) {
        if (new_mt == UNPROVIDED) {
            new_mt = NIL;
        }
        if (strength == UNPROVIDED) {
            strength = NIL;
        }
        if (direction == UNPROVIDED) {
            direction = NIL;
        }
        if (meta_assertions_to_preserve == UNPROVIDED) {
            meta_assertions_to_preserve = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != assertion_handles.assertion_p(old_assertion) : "assertion_handles.assertion_p(old_assertion) " + "CommonSymbols.NIL != assertion_handles.assertion_p(old_assertion) " + old_assertion;
        ensure_cyclist_ok();
        final SubLObject curr_cyclist = operation_communication.the_cyclist();
        SubLObject v_answer = NIL;
        final SubLObject _prev_bind_0 = api_control_vars.$the_cyclist$.currentBinding(thread);
        final SubLObject _prev_bind_2 = fi.$the_date$.currentBinding(thread);
        final SubLObject _prev_bind_3 = api_control_vars.$ke_purpose$.currentBinding(thread);
        final SubLObject _prev_bind_4 = fi.$the_second$.currentBinding(thread);
        final SubLObject _prev_bind_5 = cyc_bookkeeping.$cyc_bookkeeping_info$.currentBinding(thread);
        try {
            api_control_vars.$the_cyclist$.bind(assertions_high.asserted_by(old_assertion), thread);
            fi.$the_date$.bind(assertions_high.asserted_when(old_assertion), thread);
            api_control_vars.$ke_purpose$.bind(assertions_high.asserted_why(old_assertion), thread);
            fi.$the_second$.bind(assertions_high.asserted_second(old_assertion), thread);
            cyc_bookkeeping.$cyc_bookkeeping_info$.bind(cyc_bookkeeping.new_bookkeeping_info(api_control_vars.$the_cyclist$.getDynamicValue(thread), fi.$the_date$.getDynamicValue(thread), api_control_vars.$ke_purpose$.getDynamicValue(thread), fi.$the_second$.getDynamicValue(thread)), thread);
            if (NIL != cyclist_is_guest()) {
                operation_communication.set_the_cyclist(curr_cyclist);
                fi.$the_date$.setDynamicValue(get_universal_time(), thread);
                fi.$the_second$.setDynamicValue(numeric_date_utilities.get_universal_second(UNPROVIDED), thread);
            }
            v_answer = ke_edit_assertion_preserving_meta_assertions(old_assertion, meta_assertions_to_preserve, new_sentence, new_mt, strength, direction);
        } finally {
            cyc_bookkeeping.$cyc_bookkeeping_info$.rebind(_prev_bind_5, thread);
            fi.$the_second$.rebind(_prev_bind_4, thread);
            api_control_vars.$ke_purpose$.rebind(_prev_bind_3, thread);
            fi.$the_date$.rebind(_prev_bind_2, thread);
            api_control_vars.$the_cyclist$.rebind(_prev_bind_0, thread);
        }
        return v_answer;
    }

    public static SubLObject ke_edit_assertion_now_but_not_bookkeeping(final SubLObject old_assertion, final SubLObject new_sentence, SubLObject new_mt, SubLObject strength, SubLObject direction, SubLObject meta_assertions_to_preserve) {
        if (new_mt == UNPROVIDED) {
            new_mt = NIL;
        }
        if (strength == UNPROVIDED) {
            strength = NIL;
        }
        if (direction == UNPROVIDED) {
            direction = NIL;
        }
        if (meta_assertions_to_preserve == UNPROVIDED) {
            meta_assertions_to_preserve = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != assertion_handles.assertion_p(old_assertion) : "assertion_handles.assertion_p(old_assertion) " + "CommonSymbols.NIL != assertion_handles.assertion_p(old_assertion) " + old_assertion;
        SubLObject v_answer = NIL;
        final SubLObject _prev_bind_0 = api_control_vars.$the_cyclist$.currentBinding(thread);
        final SubLObject _prev_bind_2 = fi.$the_date$.currentBinding(thread);
        final SubLObject _prev_bind_3 = api_control_vars.$ke_purpose$.currentBinding(thread);
        final SubLObject _prev_bind_4 = fi.$the_second$.currentBinding(thread);
        final SubLObject _prev_bind_5 = cyc_bookkeeping.$cyc_bookkeeping_info$.currentBinding(thread);
        try {
            api_control_vars.$the_cyclist$.bind(assertions_high.asserted_by(old_assertion), thread);
            fi.$the_date$.bind(assertions_high.asserted_when(old_assertion), thread);
            api_control_vars.$ke_purpose$.bind(assertions_high.asserted_why(old_assertion), thread);
            fi.$the_second$.bind(assertions_high.asserted_second(old_assertion), thread);
            cyc_bookkeeping.$cyc_bookkeeping_info$.bind(cyc_bookkeeping.new_bookkeeping_info(api_control_vars.$the_cyclist$.getDynamicValue(thread), fi.$the_date$.getDynamicValue(thread), api_control_vars.$ke_purpose$.getDynamicValue(thread), fi.$the_second$.getDynamicValue(thread)), thread);
            v_answer = ke_edit_assertion_now_preserving_meta_assertions(old_assertion, meta_assertions_to_preserve, new_sentence, new_mt, strength, direction);
        } finally {
            cyc_bookkeeping.$cyc_bookkeeping_info$.rebind(_prev_bind_5, thread);
            fi.$the_second$.rebind(_prev_bind_4, thread);
            api_control_vars.$ke_purpose$.rebind(_prev_bind_3, thread);
            fi.$the_date$.rebind(_prev_bind_2, thread);
            api_control_vars.$the_cyclist$.rebind(_prev_bind_0, thread);
        }
        return v_answer;
    }

    public static SubLObject formulas_differ_only_in_strings(final SubLObject formula_1, final SubLObject formula_2, SubLObject string_pred) {
        if (string_pred == UNPROVIDED) {
            string_pred = symbol_function(STRINGP);
        }
        return tree_equal_ignoring_type(formula_1, formula_2, string_pred, symbol_function(EQUAL));
    }

    public static SubLObject tree_equal_ignoring_type(final SubLObject tree_1, final SubLObject tree_2, final SubLObject ignore_type, SubLObject test) {
        if (test == UNPROVIDED) {
            test = symbol_function(EQUAL);
        }
        if ((NIL != funcall(ignore_type, tree_1)) && (NIL != funcall(ignore_type, tree_2))) {
            return T;
        }
        if (tree_1.isAtom() && tree_2.isAtom()) {
            return funcall(test, tree_1, tree_2);
        }
        if ((!tree_1.isCons()) || (!tree_2.isCons())) {
            return NIL;
        }
        if (NIL == tree_equal_ignoring_type(tree_1.first(), tree_2.first(), ignore_type, test)) {
            return NIL;
        }
        return tree_equal_ignoring_type(tree_1.rest(), tree_2.rest(), ignore_type, test);
    }

    public static SubLObject ke_blast(final SubLObject formula, final SubLObject mt) {
        if (NIL != ensure_cyclist_ok()) {
            return do_edit_op(list(FI_BLAST, list(QUOTE, formula), list(QUOTE, hlmt_czer.canonicalize_hlmt(mt))));
        }
        return NIL;
    }

    public static SubLObject ke_blast_assertion(final SubLObject assertion) {
        assert NIL != assertion_handles.assertion_p(assertion) : "assertion_handles.assertion_p(assertion) " + "CommonSymbols.NIL != assertion_handles.assertion_p(assertion) " + assertion;
        return ke_blast(ke_assertion_find_formula(assertion), assertions_high.assertion_mt(assertion));
    }

    public static SubLObject ke_rename_variables(final SubLObject formula, final SubLObject rename_alist, final SubLObject mt) {
        assert NIL != el_formula_p(formula) : "el_utilities.el_formula_p(formula) " + "CommonSymbols.NIL != el_utilities.el_formula_p(formula) " + formula;
        assert NIL != list_utilities.alist_p(rename_alist) : "list_utilities.alist_p(rename_alist) " + "CommonSymbols.NIL != list_utilities.alist_p(rename_alist) " + rename_alist;
        return do_edit_op(list(FI_RENAME_VARIABLES, list(QUOTE, formula), list(QUOTE, rename_alist), list(QUOTE, hlmt_czer.canonicalize_hlmt(mt))));
    }

    public static SubLObject ke_add_argument(final SubLObject formula, final SubLObject mt, final SubLObject el_supports, SubLObject direction, SubLObject verify_supportsP) {
        if (direction == UNPROVIDED) {
            direction = NIL;
        }
        if (verify_supportsP == UNPROVIDED) {
            verify_supportsP = NIL;
        }
        if (NIL != ensure_cyclist_ok()) {
            return do_edit_op(list(FI_ADD_ARGUMENT, list(QUOTE, formula), list(QUOTE, hlmt_czer.canonicalize_hlmt(mt)), list(QUOTE, el_supports), list(QUOTE, direction), list(QUOTE, verify_supportsP)));
        }
        return NIL;
    }

    public static SubLObject ke_add_argument_now(final SubLObject formula, final SubLObject mt, final SubLObject el_supports, SubLObject direction, SubLObject verify_supportsP, SubLObject check_wffP) {
        if (direction == UNPROVIDED) {
            direction = NIL;
        }
        if (verify_supportsP == UNPROVIDED) {
            verify_supportsP = NIL;
        }
        if (check_wffP == UNPROVIDED) {
            check_wffP = makeBoolean(NIL == fi.$assume_assert_sentence_is_wfP$.getDynamicValue());
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = NIL;
        SubLObject error_message = NIL;
        final SubLObject v_hlmt = hlmt_czer.canonicalize_hlmt(mt);
        if (NIL == $inference_debugP$.getDynamicValue(thread)) {
            try {
                thread.throwStack.push($catch_error_message_target$.getGlobalValue());
                final SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding(thread);
                try {
                    Errors.$error_handler$.bind(CATCH_ERROR_MESSAGE_HANDLER, thread);
                    try {
                        final SubLObject environment = forward.get_forward_inference_environment();
                        assert NIL != queues.queue_p(environment) : "queues.queue_p(environment) " + "CommonSymbols.NIL != queues.queue_p(environment) " + environment;
                        final SubLObject _prev_bind_0_$33 = kb_control_vars.$forward_inference_environment$.currentBinding(thread);
                        try {
                            kb_control_vars.$forward_inference_environment$.bind(environment, thread);
                            final SubLObject v_properties = list($DIRECTION, direction, $kw90$CHECK_WFF_, check_wffP);
                            result = cyc_kernel.cyc_add_argument(formula, el_supports, v_hlmt, v_properties, verify_supportsP);
                        } finally {
                            kb_control_vars.$forward_inference_environment$.rebind(_prev_bind_0_$33, thread);
                        }
                    } catch (final Throwable catch_var) {
                        Errors.handleThrowable(catch_var, NIL);
                    }
                } finally {
                    Errors.$error_handler$.rebind(_prev_bind_0, thread);
                }
            } catch (final Throwable ccatch_env_var) {
                error_message = Errors.handleThrowable(ccatch_env_var, $catch_error_message_target$.getGlobalValue());
            } finally {
                thread.throwStack.pop();
            }
        } else {
            final SubLObject environment2 = forward.get_forward_inference_environment();
            assert NIL != queues.queue_p(environment2) : "queues.queue_p(environment2) " + "CommonSymbols.NIL != queues.queue_p(environment2) " + environment2;
            final SubLObject _prev_bind_2 = kb_control_vars.$forward_inference_environment$.currentBinding(thread);
            try {
                kb_control_vars.$forward_inference_environment$.bind(environment2, thread);
                final SubLObject v_properties2 = list($DIRECTION, direction, $kw90$CHECK_WFF_, check_wffP);
                result = cyc_kernel.cyc_add_argument(formula, el_supports, v_hlmt, v_properties2, verify_supportsP);
            } finally {
                kb_control_vars.$forward_inference_environment$.rebind(_prev_bind_2, thread);
            }
        }
        if (NIL != result) {
            operation_queues.add_to_transcript_queue(canon_tl.tl_encapsulate(list(FI_ADD_ARGUMENT, list(QUOTE, formula), list(QUOTE, v_hlmt), list(QUOTE, el_supports), list(QUOTE, direction), list(QUOTE, verify_supportsP))));
            return values(result, NIL);
        }
        if (NIL != error_message) {
            return values(NIL, list($FATAL_ERROR, error_message));
        }
        if (NIL != fi.fi_error_signaledP()) {
            return values(NIL, list(fi.fi_get_error_int().first(), apply(symbol_function(FORMAT), cons(NIL, fi.fi_get_error_int().rest()))));
        }
        return values(NIL, $list10);
    }

    public static SubLObject ke_remove_argument(final SubLObject formula, final SubLObject mt, final SubLObject el_supports) {
        if (NIL != ensure_cyclist_ok()) {
            return do_edit_op(list(FI_REMOVE_ARGUMENT, list(QUOTE, formula), list(QUOTE, hlmt_czer.canonicalize_hlmt(mt)), list(QUOTE, el_supports)));
        }
        return NIL;
    }

    public static SubLObject ke_remove_deduction(final SubLObject deduction) {
        assert NIL != deduction_handles.deduction_p(deduction) : "deduction_handles.deduction_p(deduction) " + "CommonSymbols.NIL != deduction_handles.deduction_p(deduction) " + deduction;
        final SubLObject assertion = deductions_high.deduction_assertion(deduction);
        final SubLObject supports = deductions_high.deduction_supports(deduction);
        final SubLObject tl_supports = Mapping.mapcar(symbol_function(CONVERT_HL_SUPPORT_TO_TL_SUPPORT), supports);
        return ke_remove_argument(ke_assertion_find_formula(assertion), assertions_high.assertion_mt(assertion), tl_supports);
    }

    public static SubLObject ke_tms_reconsider_term(final SubLObject fort, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        assert NIL != forts.fort_p(fort) : "forts.fort_p(fort) " + "CommonSymbols.NIL != forts.fort_p(fort) " + fort;
        return do_edit_op(listS(FI_TMS_RECONSIDER_TERM, list(QUOTE, fort), append(NIL != mt ? list(list(QUOTE, hlmt_czer.canonicalize_hlmt(mt))) : NIL, NIL)));
    }

    public static SubLObject ke_tms_reconsider_formula(final SubLObject formula, final SubLObject mt) {
        if (NIL != ensure_cyclist_ok()) {
            return do_edit_op(list(FI_TMS_RECONSIDER_FORMULA, list(QUOTE, formula), list(QUOTE, hlmt_czer.canonicalize_hlmt(mt))));
        }
        return NIL;
    }

    public static SubLObject ke_tms_reconsider_formula_now(final SubLObject formula, final SubLObject mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL == ensure_cyclist_ok()) {
            return NIL;
        }
        thread.resetMultipleValues();
        final SubLObject result = ke_tms_reconsider_formula_now_int(formula, mt);
        final SubLObject error_message = thread.secondMultipleValue();
        final SubLObject sentence = thread.thirdMultipleValue();
        final SubLObject v_hlmt = thread.fourthMultipleValue();
        thread.resetMultipleValues();
        if (NIL != result) {
            operation_queues.possibly_add_to_transcript_queue(canon_tl.tl_encapsulate(list(FI_TMS_RECONSIDER_FORMULA, list(QUOTE, sentence), list(QUOTE, hlmt_czer.canonicalize_hlmt(v_hlmt)))));
            return result;
        }
        if (NIL != error_message) {
            return values(NIL, list($FATAL_ERROR, error_message));
        }
        if (NIL != fi.fi_error_signaledP()) {
            return values(NIL, list(fi.fi_get_error_int().first(), apply(symbol_function(FORMAT), cons(NIL, fi.fi_get_error_int().rest()))));
        }
        return values(NIL, $list10);
    }

    public static SubLObject ke_tms_reconsider_formula_now_int(final SubLObject formula, final SubLObject mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = NIL;
        SubLObject error_message = NIL;
        try {
            thread.throwStack.push($catch_error_message_target$.getGlobalValue());
            final SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding(thread);
            try {
                Errors.$error_handler$.bind(CATCH_ERROR_MESSAGE_HANDLER, thread);
                try {
                    result = fi.fi_tms_reconsider_formula_int(formula, mt);
                } catch (final Throwable catch_var) {
                    Errors.handleThrowable(catch_var, NIL);
                }
            } finally {
                Errors.$error_handler$.rebind(_prev_bind_0, thread);
            }
        } catch (final Throwable ccatch_env_var) {
            error_message = Errors.handleThrowable(ccatch_env_var, $catch_error_message_target$.getGlobalValue());
        } finally {
            thread.throwStack.pop();
        }
        return values(result, error_message, formula, mt);
    }

    public static SubLObject ke_tms_reconsider_assertion(final SubLObject assertion) {
        assert NIL != assertion_handles.assertion_p(assertion) : "assertion_handles.assertion_p(assertion) " + "CommonSymbols.NIL != assertion_handles.assertion_p(assertion) " + assertion;
        return ke_tms_reconsider_formula(ke_assertion_find_formula(assertion), assertions_high.assertion_mt(assertion));
    }

    public static SubLObject ke_tms_reconsider_assertion_now(final SubLObject assertion) {
        assert NIL != assertion_handles.assertion_p(assertion) : "assertion_handles.assertion_p(assertion) " + "CommonSymbols.NIL != assertion_handles.assertion_p(assertion) " + assertion;
        return ke_tms_reconsider_formula_now(ke_assertion_find_formula(assertion), assertions_high.assertion_mt(assertion));
    }

    public static SubLObject ke_blast_all_dependents(final SubLObject assertion) {
        SubLObject successP = T;
        SubLObject cdolist_list_var;
        final SubLObject dependents = cdolist_list_var = assertion_utilities.assertion_dependent_assertions(assertion);
        SubLObject dependent = NIL;
        dependent = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if ((NIL != assertion_handles.valid_assertionP(dependent, UNPROVIDED)) && (NIL == ke_blast_assertion(dependent))) {
                successP = NIL;
            }
            cdolist_list_var = cdolist_list_var.rest();
            dependent = cdolist_list_var.first();
        } 
        return successP;
    }

    public static SubLObject ke_change_assertion_direction(final SubLObject assertion, final SubLObject new_direction) {
        assert NIL != assertion_handles.assertion_p(assertion) : "assertion_handles.assertion_p(assertion) " + "CommonSymbols.NIL != assertion_handles.assertion_p(assertion) " + assertion;
        assert NIL != enumeration_types.direction_p(new_direction) : "enumeration_types.direction_p(new_direction) " + "CommonSymbols.NIL != enumeration_types.direction_p(new_direction) " + new_direction;
        if (NIL != assertions_high.asserted_assertionP(assertion)) {
            final SubLObject old_direction = assertions_high.assertion_direction(assertion);
            if (!old_direction.equal(new_direction)) {
                final SubLObject strength = assertions_high.assertion_strength(assertion);
                ke_reassert_assertion(assertion, strength, new_direction);
                return assertion;
            }
        }
        return NIL;
    }

    public static SubLObject ke_shoehorn_rule_forward(final SubLObject rule_assertion) {
        assert NIL != assertions_high.rule_assertionP(rule_assertion) : "assertions_high.rule_assertionP(rule_assertion) " + "CommonSymbols.NIL != assertions_high.rule_assertionP(rule_assertion) " + rule_assertion;
        ke_assert(list($$pragmaticRequirement, $list99, rule_assertion), assertions_high.assertion_mt(rule_assertion), UNPROVIDED, UNPROVIDED);
        ke_change_assertion_direction(rule_assertion, $FORWARD);
        ke_unassert(list($$pragmaticRequirement, $list99, rule_assertion), assertions_high.assertion_mt(rule_assertion));
        return rule_assertion;
    }

    public static SubLObject ke_change_assertion_strength(final SubLObject assertion, final SubLObject new_strength) {
        assert NIL != assertion_handles.assertion_p(assertion) : "assertion_handles.assertion_p(assertion) " + "CommonSymbols.NIL != assertion_handles.assertion_p(assertion) " + assertion;
        assert NIL != enumeration_types.el_strength_p(new_strength) : "enumeration_types.el_strength_p(new_strength) " + "CommonSymbols.NIL != enumeration_types.el_strength_p(new_strength) " + new_strength;
        if (NIL != assertions_high.asserted_assertionP(assertion)) {
            final SubLObject old_strength = assertions_high.assertion_strength(assertion);
            if (!old_strength.equal(new_strength)) {
                final SubLObject direction = assertions_high.assertion_direction(assertion);
                ke_reassert_assertion(assertion, new_strength, direction);
                return assertion;
            }
        }
        return NIL;
    }

    public static SubLObject ke_change_assertion_mt(final SubLObject assertion, final SubLObject new_mt, SubLObject meta_assertions_to_preserve) {
        if (meta_assertions_to_preserve == UNPROVIDED) {
            meta_assertions_to_preserve = NIL;
        }
        assert NIL != assertion_handles.assertion_p(assertion) : "assertion_handles.assertion_p(assertion) " + "CommonSymbols.NIL != assertion_handles.assertion_p(assertion) " + assertion;
        assert NIL != hlmt.hlmt_p(new_mt) : "hlmt.hlmt_p(new_mt) " + "CommonSymbols.NIL != hlmt.hlmt_p(new_mt) " + new_mt;
        if (NIL != assertions_high.asserted_assertionP(assertion)) {
            final SubLObject old_mt = assertions_high.assertion_mt(assertion);
            if (!old_mt.equal(new_mt)) {
                final SubLObject formula = ke_assertion_edit_formula(assertion);
                return ke_convert_assertion(assertion, formula, new_mt, meta_assertions_to_preserve);
            }
        }
        return NIL;
    }

    public static SubLObject ke_convert_assertion(final SubLObject assertion, final SubLObject new_formula, SubLObject new_mt, SubLObject meta_assertions_to_preserve) {
        if (new_mt == UNPROVIDED) {
            new_mt = NIL;
        }
        if (meta_assertions_to_preserve == UNPROVIDED) {
            meta_assertions_to_preserve = NIL;
        }
        if (NIL != meta_assertions_to_preserve) {
            return ke_edit_assertion_preserving_meta_assertions(assertion, meta_assertions_to_preserve, new_formula, new_mt, UNPROVIDED, UNPROVIDED);
        }
        return ke_edit_assertion(assertion, new_formula, new_mt, UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject old_constant_names(final SubLObject string) {
        if (NIL != $old_constant_names_table$.getGlobalValue()) {
            return values(gethash(string, $old_constant_names_table$.getGlobalValue(), UNPROVIDED));
        }
        return NIL;
    }

    public static SubLObject initialize_old_constant_names() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject total = kb_indexing.num_predicate_extent_index($$oldConstantName, $$BookkeepingMt);
        if (!$old_constant_names_table$.getGlobalValue().isHashtable()) {
            $old_constant_names_table$.setGlobalValue(make_hash_table(total, symbol_function(EQUALP), UNPROVIDED));
        }
        clrhash($old_constant_names_table$.getGlobalValue());
        SubLObject sofar = ZERO_INTEGER;
        final SubLObject _prev_bind_0 = $last_percent_progress_index$.currentBinding(thread);
        final SubLObject _prev_bind_2 = $last_percent_progress_prediction$.currentBinding(thread);
        final SubLObject _prev_bind_3 = $within_noting_percent_progress$.currentBinding(thread);
        final SubLObject _prev_bind_4 = $percent_progress_start_time$.currentBinding(thread);
        try {
            $last_percent_progress_index$.bind(ZERO_INTEGER, thread);
            $last_percent_progress_prediction$.bind(NIL, thread);
            $within_noting_percent_progress$.bind(T, thread);
            $percent_progress_start_time$.bind(get_universal_time(), thread);
            try {
                noting_percent_progress_preamble($str102$Initializing_old_constant_name_ta);
                final SubLObject _prev_bind_0_$34 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                final SubLObject _prev_bind_1_$35 = mt_relevance_macros.$mt$.currentBinding(thread);
                try {
                    mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_EQ, thread);
                    mt_relevance_macros.$mt$.bind($$BookkeepingMt, thread);
                    final SubLObject pred_var = $$oldConstantName;
                    if (NIL != kb_mapping_macros.do_predicate_extent_index_key_validator(pred_var)) {
                        final SubLObject str = NIL;
                        final SubLObject _prev_bind_0_$35 = $progress_start_time$.currentBinding(thread);
                        final SubLObject _prev_bind_1_$36 = $progress_last_pacification_time$.currentBinding(thread);
                        final SubLObject _prev_bind_2_$38 = $progress_elapsed_seconds_for_notification$.currentBinding(thread);
                        final SubLObject _prev_bind_3_$39 = $progress_notification_count$.currentBinding(thread);
                        final SubLObject _prev_bind_5 = $progress_pacifications_since_last_nl$.currentBinding(thread);
                        final SubLObject _prev_bind_6 = $progress_count$.currentBinding(thread);
                        final SubLObject _prev_bind_7 = $is_noting_progressP$.currentBinding(thread);
                        final SubLObject _prev_bind_8 = $silent_progressP$.currentBinding(thread);
                        try {
                            $progress_start_time$.bind(get_universal_time(), thread);
                            $progress_last_pacification_time$.bind($progress_start_time$.getDynamicValue(thread), thread);
                            $progress_elapsed_seconds_for_notification$.bind($suppress_all_progress_faster_than_seconds$.getDynamicValue(thread), thread);
                            $progress_notification_count$.bind(ZERO_INTEGER, thread);
                            $progress_pacifications_since_last_nl$.bind(ZERO_INTEGER, thread);
                            $progress_count$.bind(ZERO_INTEGER, thread);
                            $is_noting_progressP$.bind(T, thread);
                            $silent_progressP$.bind(NIL != str ? $silent_progressP$.getDynamicValue(thread) : T, thread);
                            noting_progress_preamble(str);
                            final SubLObject iterator_var = kb_mapping_macros.new_predicate_extent_final_index_spec_iterator(pred_var);
                            SubLObject done_var = NIL;
                            final SubLObject token_var = NIL;
                            while (NIL == done_var) {
                                final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                                final SubLObject valid = makeBoolean(!token_var.eql(final_index_spec));
                                if (NIL != valid) {
                                    note_progress();
                                    SubLObject final_index_iterator = NIL;
                                    try {
                                        final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $GAF, $TRUE, NIL);
                                        SubLObject done_var_$40 = NIL;
                                        final SubLObject token_var_$41 = NIL;
                                        while (NIL == done_var_$40) {
                                            final SubLObject gaf = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$41);
                                            final SubLObject valid_$42 = makeBoolean(!token_var_$41.eql(gaf));
                                            if (NIL != valid_$42) {
                                                sofar = add(sofar, ONE_INTEGER);
                                                note_percent_progress(sofar, total);
                                                if (NIL != assertions_high.gaf_assertionP(gaf)) {
                                                    final SubLObject constant = assertions_high.gaf_arg(gaf, ONE_INTEGER);
                                                    final SubLObject string = assertions_high.gaf_arg(gaf, TWO_INTEGER);
                                                    cache_old_constant_name(string, constant);
                                                }
                                            }
                                            done_var_$40 = makeBoolean(NIL == valid_$42);
                                        } 
                                    } finally {
                                        final SubLObject _prev_bind_0_$36 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                        try {
                                            $is_thread_performing_cleanupP$.bind(T, thread);
                                            final SubLObject _values = getValuesAsVector();
                                            if (NIL != final_index_iterator) {
                                                kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                            }
                                            restoreValuesFromVector(_values);
                                        } finally {
                                            $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$36, thread);
                                        }
                                    }
                                }
                                done_var = makeBoolean(NIL == valid);
                            } 
                            noting_progress_postamble();
                        } finally {
                            $silent_progressP$.rebind(_prev_bind_8, thread);
                            $is_noting_progressP$.rebind(_prev_bind_7, thread);
                            $progress_count$.rebind(_prev_bind_6, thread);
                            $progress_pacifications_since_last_nl$.rebind(_prev_bind_5, thread);
                            $progress_notification_count$.rebind(_prev_bind_3_$39, thread);
                            $progress_elapsed_seconds_for_notification$.rebind(_prev_bind_2_$38, thread);
                            $progress_last_pacification_time$.rebind(_prev_bind_1_$36, thread);
                            $progress_start_time$.rebind(_prev_bind_0_$35, thread);
                        }
                    }
                } finally {
                    mt_relevance_macros.$mt$.rebind(_prev_bind_1_$35, thread);
                    mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0_$34, thread);
                }
            } finally {
                final SubLObject _prev_bind_0_$37 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values2 = getValuesAsVector();
                    noting_percent_progress_postamble();
                    restoreValuesFromVector(_values2);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$37, thread);
                }
            }
        } finally {
            $percent_progress_start_time$.rebind(_prev_bind_4, thread);
            $within_noting_percent_progress$.rebind(_prev_bind_3, thread);
            $last_percent_progress_prediction$.rebind(_prev_bind_2, thread);
            $last_percent_progress_index$.rebind(_prev_bind_0, thread);
        }
        return hash_table_count($old_constant_names_table$.getGlobalValue());
    }

    public static SubLObject cache_old_constant_name(final SubLObject string, final SubLObject constant) {
        if (NIL != $old_constant_names_table$.getGlobalValue()) {
            final SubLObject entry = old_constant_names(string);
            sethash(string, $old_constant_names_table$.getGlobalValue(), adjoin(constant, entry, symbol_function(EQUALP), UNPROVIDED));
            return T;
        }
        return NIL;
    }

    public static SubLObject decache_old_constant_name(final SubLObject string, final SubLObject constant) {
        if (NIL != $old_constant_names_table$.getGlobalValue()) {
            SubLObject entry = old_constant_names(string);
            if (NIL != entry) {
                entry = delete(constant, entry, symbol_function(EQUALP), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                if (NIL == entry) {
                    remhash(string, $old_constant_names_table$.getGlobalValue());
                } else {
                    sethash(string, $old_constant_names_table$.getGlobalValue(), entry);
                }
            }
            return T;
        }
        return NIL;
    }

    public static SubLObject do_edit_op(final SubLObject form) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != api_control_vars.$use_local_queueP$.getDynamicValue(thread)) {
            return operation_queues.add_to_local_queue(form, T);
        }
        return eval(form);
    }

    public static SubLObject find_assertions_via_tl(SubLObject sentence, SubLObject mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject pcase_var = $ke_assertion_edit_formula_find_func$.getDynamicValue(thread);
        if (pcase_var.eql(QUOTE) || pcase_var.eql(ASSERTION_TL_FORMULA)) {
            return canon_tl.find_assertions_from_tl_formula(sentence, mt);
        }
        if (pcase_var.eql(QUOTE) || pcase_var.eql(ASSERTION_TL_IST_FORMULA)) {
            thread.resetMultipleValues();
            final SubLObject sentence_$45 = czer_utilities.unwrap_if_ist(sentence, mt, UNPROVIDED);
            final SubLObject mt_$46 = thread.secondMultipleValue();
            thread.resetMultipleValues();
            sentence = sentence_$45;
            mt = mt_$46;
            return canon_tl.find_assertions_from_tl_formula(sentence, mt);
        }
        return NIL;
    }

    public static SubLObject ke_assertion_edit_formula(final SubLObject assertion) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != assertion_handles.assertion_p(assertion) : "assertion_handles.assertion_p(assertion) " + "CommonSymbols.NIL != assertion_handles.assertion_p(assertion) " + assertion;
        return funcall($ke_assertion_edit_formula_display_func$.getDynamicValue(thread), assertion);
    }

    public static SubLObject ke_assertion_find_formula(final SubLObject assertion) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != assertion_handles.assertion_p(assertion) : "assertion_handles.assertion_p(assertion) " + "CommonSymbols.NIL != assertion_handles.assertion_p(assertion) " + assertion;
        return funcall($ke_assertion_edit_formula_find_func$.getDynamicValue(thread), assertion);
    }

    public static SubLObject cyclist_is_guest() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return NIL != system_parameters.$allow_guest_to_editP$.getDynamicValue(thread) ? NIL : operation_communication.the_cyclist_is_guestP();
    }

    public static SubLObject ensure_cyclist_ok() {
        if (NIL == cyclist_is_guest()) {
            return T;
        }
        Errors.error($str107$KB_editing_is_not_allowed_for_use, operation_communication.the_cyclist());
        return NIL;
    }

    public static SubLObject ke_eval_now(final SubLObject form) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject error = NIL;
        SubLObject result = NIL;
        try {
            thread.throwStack.push($catch_error_message_target$.getGlobalValue());
            final SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding(thread);
            try {
                Errors.$error_handler$.bind(CATCH_ERROR_MESSAGE_HANDLER, thread);
                try {
                    result = fi.fi_eval_int(form);
                } catch (final Throwable catch_var) {
                    Errors.handleThrowable(catch_var, NIL);
                }
            } finally {
                Errors.$error_handler$.rebind(_prev_bind_0, thread);
            }
        } catch (final Throwable ccatch_env_var) {
            error = Errors.handleThrowable(ccatch_env_var, $catch_error_message_target$.getGlobalValue());
        } finally {
            thread.throwStack.pop();
        }
        if (NIL != error) {
            fi.signal_fi_error(list($GENERIC_ERROR, error));
        }
        if (NIL == $use_transcriptP$.getDynamicValue(thread)) {
            return NIL;
        }
        if (NIL != fi.fi_error_signaledP()) {
            return values(NIL, fi.fi_get_error_int());
        }
        operation_queues.add_to_transcript_queue(fi.fi_construct_form_to_enqueue(FI_EVAL, form, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED));
        return values(result, NIL);
    }

    public static SubLObject declare_ke_file() {
        declareFunction(me, "ke_create", "KE-CREATE", 1, 0, false);
        declareFunction(me, "ke_create_from_serialization", "KE-CREATE-FROM-SERIALIZATION", 2, 0, false);
        declareFunction(me, "ke_create_internal", "KE-CREATE-INTERNAL", 1, 1, false);
        declareFunction(me, "ke_create_now", "KE-CREATE-NOW", 1, 1, false);
        declareFunction(me, "ke_find_or_create_now", "KE-FIND-OR-CREATE-NOW", 1, 1, false);
        declareFunction(me, "ke_recreate_now", "KE-RECREATE-NOW", 1, 0, false);
        declareFunction(me, "ke_merge", "KE-MERGE", 2, 0, false);
        declareFunction(me, "ke_merge_now", "KE-MERGE-NOW", 2, 0, false);
        declareFunction(me, "ke_kill", "KE-KILL", 1, 0, false);
        declareFunction(me, "ke_kill_now", "KE-KILL-NOW", 1, 0, false);
        declareFunction(me, "ke_recreate", "KE-RECREATE", 1, 0, false);
        declareFunction(me, "rename_code_constant", "RENAME-CODE-CONSTANT", 2, 0, false);
        declareFunction(me, "ke_rename", "KE-RENAME", 2, 0, false);
        declareFunction(me, "ke_rename_code_constant", "KE-RENAME-CODE-CONSTANT", 2, 0, false);
        declareFunction(me, "ke_rename_internal", "KE-RENAME-INTERNAL", 2, 0, false);
        declareFunction(me, "note_old_constant_name", "NOTE-OLD-CONSTANT-NAME", 2, 0, false);
        declareFunction(me, "ke_rename_now", "KE-RENAME-NOW", 2, 0, false);
        declareFunction(me, "ke_assert", "KE-ASSERT", 2, 2, false);
        declareFunction(me, "ke_reassert_assertion_now", "KE-REASSERT-ASSERTION-NOW", 3, 0, false);
        declareFunction(me, "ke_reassert_assertion_now_int", "KE-REASSERT-ASSERTION-NOW-INT", 3, 0, false);
        declareFunction(me, "ke_reassert_assertion", "KE-REASSERT-ASSERTION", 3, 0, false);
        declareFunction(me, "ke_reassert_assertion_int", "KE-REASSERT-ASSERTION-INT", 3, 0, false);
        declareFunction(me, "ke_repropagate_assertion_now", "KE-REPROPAGATE-ASSERTION-NOW", 1, 0, false);
        declareFunction(me, "ke_repropagate_assertion", "KE-REPROPAGATE-ASSERTION", 1, 0, false);
        declareFunction(me, "ke_repropagate_assertion_now_int", "KE-REPROPAGATE-ASSERTION-NOW-INT", 1, 0, false);
        declareFunction(me, "ke_repropagate_assertion_int", "KE-REPROPAGATE-ASSERTION-INT", 1, 0, false);
        declareFunction(me, "ke_assert_now", "KE-ASSERT-NOW", 2, 2, false);
        declareFunction(me, "ke_assert_wff_now", "KE-ASSERT-WFF-NOW", 2, 2, false);
        declareFunction(me, "ke_assert_now_and_propagate_later", "KE-ASSERT-NOW-AND-PROPAGATE-LATER", 2, 2, false);
        declareFunction(me, "ke_assert_now_int", "KE-ASSERT-NOW-INT", 4, 1, false);
        declareFunction(me, "ke_assert_with_implicature", "KE-ASSERT-WITH-IMPLICATURE", 2, 2, false);
        declareFunction(me, "ke_assert_now_with_implicature", "KE-ASSERT-NOW-WITH-IMPLICATURE", 2, 2, false);
        declareFunction(me, "ke_assert_with_implicature_int", "KE-ASSERT-WITH-IMPLICATURE-INT", 5, 0, false);
        declareFunction(me, "ke_assert_with_implicature_int_assert", "KE-ASSERT-WITH-IMPLICATURE-INT-ASSERT", 5, 0, false);
        declareFunction(me, "ke_unassert", "KE-UNASSERT", 2, 0, false);
        declareFunction(me, "ke_unassert_assertion", "KE-UNASSERT-ASSERTION", 1, 0, false);
        declareFunction(me, "ke_unassert_now", "KE-UNASSERT-NOW", 2, 0, false);
        declareFunction(me, "ke_unassert_assertion_now", "KE-UNASSERT-ASSERTION-NOW", 1, 0, false);
        declareFunction(me, "ke_edit", "KE-EDIT", 3, 3, false);
        declareFunction(me, "ke_edit_now", "KE-EDIT-NOW", 3, 3, false);
        declareFunction(me, "ke_edit_assertion", "KE-EDIT-ASSERTION", 2, 3, false);
        declareFunction(me, "ke_edit_assertion_preserving_meta_assertions", "KE-EDIT-ASSERTION-PRESERVING-META-ASSERTIONS", 3, 3, false);
        declareFunction(me, "ke_edit_assertion_now_preserving_meta_assertions", "KE-EDIT-ASSERTION-NOW-PRESERVING-META-ASSERTIONS", 3, 3, false);
        declareFunction(me, "ke_edit_assertion_preserving_meta_assertions_int", "KE-EDIT-ASSERTION-PRESERVING-META-ASSERTIONS-INT", 7, 0, false);
        declareFunction(me, "ke_edit_assertion_preserving_all_meta_assertions", "KE-EDIT-ASSERTION-PRESERVING-ALL-META-ASSERTIONS", 2, 3, false);
        declareFunction(me, "ke_edit_assertion_now_preserving_all_meta_assertions", "KE-EDIT-ASSERTION-NOW-PRESERVING-ALL-META-ASSERTIONS", 2, 3, false);
        declareFunction(me, "ke_null_edit_assertion", "KE-NULL-EDIT-ASSERTION", 1, 0, false);
        declareFunction(me, "ke_edit_compute_new_meta_assertion_assertibles", "KE-EDIT-COMPUTE-NEW-META-ASSERTION-ASSERTIBLES", 4, 0, false);
        declareFunction(me, "extract_old_meta_assertion_info", "EXTRACT-OLD-META-ASSERTION-INFO", 1, 0, false);
        declareFunction(me, "ke_add_assertion_original_text", "KE-ADD-ASSERTION-ORIGINAL-TEXT", 3, 1, false);
        declareFunction(me, "ke_edit_assertion_strings", "KE-EDIT-ASSERTION-STRINGS", 2, 1, false);
        declareFunction(me, "ke_recanonicalize_assertion", "KE-RECANONICALIZE-ASSERTION", 1, 1, false);
        declareFunction(me, "ke_recanonicalize_assertion_now", "KE-RECANONICALIZE-ASSERTION-NOW", 1, 1, false);
        declareFunction(me, "ke_edit_assertion_but_not_bookkeeping", "KE-EDIT-ASSERTION-BUT-NOT-BOOKKEEPING", 2, 4, false);
        declareFunction(me, "ke_edit_assertion_now_but_not_bookkeeping", "KE-EDIT-ASSERTION-NOW-BUT-NOT-BOOKKEEPING", 2, 4, false);
        declareFunction(me, "formulas_differ_only_in_strings", "FORMULAS-DIFFER-ONLY-IN-STRINGS", 2, 1, false);
        declareFunction(me, "tree_equal_ignoring_type", "TREE-EQUAL-IGNORING-TYPE", 3, 1, false);
        declareFunction(me, "ke_blast", "KE-BLAST", 2, 0, false);
        declareFunction(me, "ke_blast_assertion", "KE-BLAST-ASSERTION", 1, 0, false);
        declareFunction(me, "ke_rename_variables", "KE-RENAME-VARIABLES", 3, 0, false);
        declareFunction(me, "ke_add_argument", "KE-ADD-ARGUMENT", 3, 2, false);
        declareFunction(me, "ke_add_argument_now", "KE-ADD-ARGUMENT-NOW", 3, 3, false);
        declareFunction(me, "ke_remove_argument", "KE-REMOVE-ARGUMENT", 3, 0, false);
        declareFunction(me, "ke_remove_deduction", "KE-REMOVE-DEDUCTION", 1, 0, false);
        declareFunction(me, "ke_tms_reconsider_term", "KE-TMS-RECONSIDER-TERM", 1, 1, false);
        declareFunction(me, "ke_tms_reconsider_formula", "KE-TMS-RECONSIDER-FORMULA", 2, 0, false);
        declareFunction(me, "ke_tms_reconsider_formula_now", "KE-TMS-RECONSIDER-FORMULA-NOW", 2, 0, false);
        declareFunction(me, "ke_tms_reconsider_formula_now_int", "KE-TMS-RECONSIDER-FORMULA-NOW-INT", 2, 0, false);
        declareFunction(me, "ke_tms_reconsider_assertion", "KE-TMS-RECONSIDER-ASSERTION", 1, 0, false);
        declareFunction(me, "ke_tms_reconsider_assertion_now", "KE-TMS-RECONSIDER-ASSERTION-NOW", 1, 0, false);
        declareFunction(me, "ke_blast_all_dependents", "KE-BLAST-ALL-DEPENDENTS", 1, 0, false);
        declareFunction(me, "ke_change_assertion_direction", "KE-CHANGE-ASSERTION-DIRECTION", 2, 0, false);
        declareFunction(me, "ke_shoehorn_rule_forward", "KE-SHOEHORN-RULE-FORWARD", 1, 0, false);
        declareFunction(me, "ke_change_assertion_strength", "KE-CHANGE-ASSERTION-STRENGTH", 2, 0, false);
        declareFunction(me, "ke_change_assertion_mt", "KE-CHANGE-ASSERTION-MT", 2, 1, false);
        declareFunction(me, "ke_convert_assertion", "KE-CONVERT-ASSERTION", 2, 2, false);
        declareFunction(me, "old_constant_names", "OLD-CONSTANT-NAMES", 1, 0, false);
        declareFunction(me, "initialize_old_constant_names", "INITIALIZE-OLD-CONSTANT-NAMES", 0, 0, false);
        declareFunction(me, "cache_old_constant_name", "CACHE-OLD-CONSTANT-NAME", 2, 0, false);
        declareFunction(me, "decache_old_constant_name", "DECACHE-OLD-CONSTANT-NAME", 2, 0, false);
        declareFunction(me, "do_edit_op", "DO-EDIT-OP", 1, 0, false);
        declareFunction(me, "find_assertions_via_tl", "FIND-ASSERTIONS-VIA-TL", 2, 0, false);
        declareFunction(me, "ke_assertion_edit_formula", "KE-ASSERTION-EDIT-FORMULA", 1, 0, false);
        declareFunction(me, "ke_assertion_find_formula", "KE-ASSERTION-FIND-FORMULA", 1, 0, false);
        declareFunction(me, "cyclist_is_guest", "CYCLIST-IS-GUEST", 0, 0, false);
        declareFunction(me, "ensure_cyclist_ok", "ENSURE-CYCLIST-OK", 0, 0, false);
        declareFunction(me, "ke_eval_now", "KE-EVAL-NOW", 1, 0, false);
        return NIL;
    }

    public static SubLObject init_ke_file() {
        defparameter("*NOTE-MERGED-CONSTANT-NAME*", T);
        defparameter("*NOTE-OLD-CONSTANT-NAME*", T);
        defparameter("*KE-ASSERT-NOW-ASSUME-WFF-TEST*", FALSE);
        defparameter("*CHECK-IF-ALREADY-KE-UNASSERTED?*", NIL);
        deflexical("*KE-EDIT-USE-FI-EDIT*", SubLSystemTrampolineFile.maybeDefault($ke_edit_use_fi_edit$, $ke_edit_use_fi_edit$, T));
        defparameter("*KE-ADD-ASSERTION-ORIGINAL-TEXT?*", NIL);
        deflexical("*OLD-CONSTANT-NAMES-TABLE*", SubLSystemTrampolineFile.maybeDefault($old_constant_names_table$, $old_constant_names_table$, NIL));
        defparameter("*KE-ASSERTION-EDIT-FORMULA-FIND-FUNC*", ASSERTION_TL_IST_FORMULA);
        defparameter("*KE-ASSERTION-EDIT-FORMULA-DISPLAY-FUNC*", ASSERTION_EL_FORMULA);
        return NIL;
    }

    public static SubLObject setup_ke_file() {
        register_external_symbol(KE_CREATE);
        register_cyc_api_function(KE_CREATE_NOW, $list12, $str13$Create_new_constant_now_and_add_o, NIL, $list14);
        register_external_symbol(KE_MERGE);
        register_external_symbol(KE_KILL);
        register_cyc_api_function(KE_KILL_NOW, $list29, $str30$Kill_FORT_now_and_add_operation_t, NIL, $list31);
        register_external_symbol(KE_ASSERT);
        register_cyc_api_function(KE_ASSERT_NOW, $list51, $str52$Assert_FORMULA_in_MT_now_and_add_, NIL, $list31);
        register_cyc_api_function(KE_ASSERT_WFF_NOW, $list51, $str55$Assert_FORMULA_in_MT_now_and_add_, NIL, $list31);
        register_cyc_api_function(KE_ASSERT_NOW_AND_PROPAGATE_LATER, $list51, $str57$Assert_FORMULA_in_MT_now_and_add_, NIL, $list31);
        register_external_symbol(KE_UNASSERT);
        register_cyc_api_function(KE_UNASSERT_NOW, $list66, $str67$Unassert_FORMULA_in_MT_now_and_ad, NIL, $list31);
        declare_defglobal($ke_edit_use_fi_edit$);
        register_cyc_api_function(KE_EDIT, $list71, $str72$Add_to_the_agenda_operations_that, NIL, $list73);
        register_cyc_api_function(KE_EDIT_NOW, $list71, $str75$Immediately_remove_OLD_FORMULA_an, NIL, NIL);
        register_external_symbol(KE_EDIT_ASSERTION_PRESERVING_ALL_META_ASSERTIONS);
        declare_defglobal($old_constant_names_table$);
        return NIL;
    }

    @Override
    public void declareFunctions() {
        declare_ke_file();
    }

    @Override
    public void initializeVariables() {
        init_ke_file();
    }

    @Override
    public void runTopLevelForms() {
        setup_ke_file();
    }

    
}

/**
 * Total time: 1037 ms
 */
