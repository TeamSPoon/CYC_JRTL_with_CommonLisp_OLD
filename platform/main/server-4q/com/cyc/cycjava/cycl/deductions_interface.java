package com.cyc.cycjava.cycl;


import static com.cyc.cycjava.cycl.control_vars.$hl_lock$;
import static com.cyc.cycjava.cycl.utilities_macros.register_cyc_api_function;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.list;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Locks.release_lock;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Locks.seize_lock;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeString;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeSymbol;
import static com.cyc.tool.subl.util.SubLFiles.declareFunction;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLSystemTrampolineFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;


public final class deductions_interface extends SubLTranslatedFile {
    public static final SubLFile me = new deductions_interface();

    public static final String myName = "com.cyc.cycjava.cycl.deductions_interface";

    public static final String myFingerPrint = "8739ff98667b35e9caf98a201c81c34c7076077219326383add5d7f75472559a";









    private static final SubLSymbol KB_CREATE_DEDUCTION = makeSymbol("KB-CREATE-DEDUCTION");

    private static final SubLSymbol $sym5$_EXIT = makeSymbol("%EXIT");

    private static final SubLList $list6 = list(makeSymbol("ASSERTION"), makeSymbol("SUPPORTS"), makeSymbol("TRUTH"), makeSymbol("STRENGTH"), makeSymbol("&OPTIONAL"), makeSymbol("BINDINGS"), makeSymbol("PRAGMATIC-SUPPORT-MTS"));

    private static final SubLString $str7$Create_a_new_deduction_consisting = makeString("Create a new deduction consisting of SUPPORTS for ASSERTION.\n   TRUTH is the truth value of the deduction.\n   Hook up the indexing for the new deduction.");

    public static final SubLList $list8 = list(list(makeSymbol("ASSERTION"), makeSymbol("SUPPORT-P")), list(makeSymbol("SUPPORTS"), makeSymbol("HL-JUSTIFICATION-P")), list(makeSymbol("TRUTH"), makeSymbol("TRUTH-P")), list(makeSymbol("STRENGTH"), makeSymbol("EL-STRENGTH-P")));

    private static final SubLList $list9 = list(makeSymbol("DEDUCTION-P"));

    private static final SubLSymbol KB_CREATE_DEDUCTION_KB_STORE = makeSymbol("KB-CREATE-DEDUCTION-KB-STORE");



    private static final SubLSymbol KB_REMOVE_DEDUCTION = makeSymbol("KB-REMOVE-DEDUCTION");



    private static final SubLList $list14 = list(makeSymbol("DEDUCTION"));

    private static final SubLString $str15$Remove_DEDUCTION_from_the_KB__and = makeString("Remove DEDUCTION from the KB, and unhook its indexing.");

    public static final SubLList $list16 = list(list(makeSymbol("DEDUCTION"), makeSymbol("DEDUCTION-P")));

    private static final SubLList $list17 = list(makeSymbol("NULL"));

    private static final SubLSymbol KB_LOOKUP_DEDUCTION = makeSymbol("KB-LOOKUP-DEDUCTION");

    public static final SubLList $list19 = list(makeSymbol("ASSERTION"), makeSymbol("SUPPORTS"), makeSymbol("TRUTH"));

    private static final SubLString $str20$Return_the_deduction_with_ASSERTI = makeString("Return the deduction with ASSERTION, SUPPORTS, and TRUTH, if it exists.\n   Return NIL otherwise.");

    private static final SubLList $list21 = list(list(makeSymbol("ASSERTION"), makeSymbol("SUPPORT-P")), list(makeSymbol("SUPPORTS"), makeSymbol("HL-JUSTIFICATION-P")), list(makeSymbol("TRUTH"), makeSymbol("TRUTH-P")));

    public static final SubLList $list22 = list(list(makeSymbol("NIL-OR"), makeSymbol("DEDUCTION-P")));

    private static final SubLSymbol KB_DEDUCTION_SUPPORTED_OBJECT = makeSymbol("KB-DEDUCTION-SUPPORTED-OBJECT");

    private static final SubLString $str24$Return_the_assertion_for_DEDUCTIO = makeString("Return the assertion for DEDUCTION.");

    public static final SubLList $list25 = list(makeSymbol("SUPPORT-P"));

    private static final SubLSymbol KB_DEDUCTION_SUPPORTS = makeSymbol("KB-DEDUCTION-SUPPORTS");

    private static final SubLString $str27$Return_the_supports_for_DEDUCTION = makeString("Return the supports for DEDUCTION.");

    public static final SubLList $list28 = list(makeSymbol("HL-JUSTIFICATION-P"));

    private static final SubLSymbol KB_DEDUCTION_BINDINGS = makeSymbol("KB-DEDUCTION-BINDINGS");

    private static final SubLString $str30$Return_the_bindings_for_DEDUCTION = makeString("Return the bindings for DEDUCTION.");

    private static final SubLSymbol KB_DEDUCTION_PRAGMATIC_SUPPORT_MTS = makeSymbol("KB-DEDUCTION-PRAGMATIC-SUPPORT-MTS");

    private static final SubLString $str32$Return_the_pragmatic_support_mts_ = makeString("Return the pragmatic-support-mts for DEDUCTION.");

    private static final SubLSymbol KB_DEDUCTION_TRUTH = makeSymbol("KB-DEDUCTION-TRUTH");

    private static final SubLString $str34$Return_the_truth_for_DEDUCTION_ = makeString("Return the truth for DEDUCTION.");

    private static final SubLList $list35 = list(makeSymbol("TRUTH-P"));

    private static final SubLSymbol KB_DEDUCTION_STRENGTH = makeSymbol("KB-DEDUCTION-STRENGTH");

    private static final SubLString $str37$Return_the_strength_for_DEDUCTION = makeString("Return the strength for DEDUCTION.");

    private static final SubLList $list38 = list(makeSymbol("EL-STRENGTH-P"));

    private static final SubLSymbol KB_SET_DEDUCTION_STRENGTH = makeSymbol("KB-SET-DEDUCTION-STRENGTH");

    private static final SubLList $list40 = list(makeSymbol("DEDUCTION"), makeSymbol("NEW-STRENGTH"));

    private static final SubLString $str41$Change_the_strength_of_DEDUCTION_ = makeString("Change the strength of DEDUCTION to NEW-STRENGTH.");

    private static final SubLList $list42 = list(list(makeSymbol("DEDUCTION"), makeSymbol("DEDUCTION-P")), list(makeSymbol("NEW-STRENGTH"), makeSymbol("EL-STRENGTH-P")));

    public static SubLObject kb_create_deduction(final SubLObject assertion, final SubLObject supports, final SubLObject truth, final SubLObject strength, SubLObject v_bindings, SubLObject pragmatic_support_mts) {
        if (v_bindings == UNPROVIDED) {
            v_bindings = NIL;
        }
        if (pragmatic_support_mts == UNPROVIDED) {
            pragmatic_support_mts = NIL;
        }
        SubLSystemTrampolineFile.enforceType(assertion, SUPPORT_P);
        SubLSystemTrampolineFile.enforceType(supports, HL_JUSTIFICATION_P);
        SubLSystemTrampolineFile.enforceType(truth, TRUTH_P);
        SubLSystemTrampolineFile.enforceType(strength, EL_STRENGTH_P);
        hl_interface_infrastructure.define_hl_modifier_preamble();
        hl_interface_infrastructure.note_hl_modifier_invocation(KB_CREATE_DEDUCTION, assertion, supports, truth, strength, v_bindings, pragmatic_support_mts, UNPROVIDED);
        if (NIL != hl_interface_infrastructure.hl_modify_anywhereP()) {
            SubLObject release = NIL;
            try {
                release = seize_lock($hl_lock$.getGlobalValue());
                final SubLObject deduction = (NIL != hl_interface_infrastructure.hl_modify_remoteP()) ? kb_create_deduction_remote(assertion, supports, truth, strength, v_bindings, pragmatic_support_mts) : kb_create_deduction_local(assertion, supports, truth, strength, v_bindings, pragmatic_support_mts);
                kb_modification_event.post_kb_modify_create_new_deduction_event(assertion, supports, truth, strength, v_bindings, pragmatic_support_mts);
                hl_transcript_tracing.note_hlt_find_or_create_deduction(deduction);
                hl_interface_infrastructure.define_hl_modifier_postamble();
                return deduction;
            } finally {
                if (NIL != release) {
                    release_lock($hl_lock$.getGlobalValue());
                }
            }
        }
        return NIL;
    }

    public static SubLObject kb_create_deduction_remote(final SubLObject assertion, final SubLObject supports, final SubLObject truth, final SubLObject strength, SubLObject v_bindings, SubLObject pragmatic_support_mts) {
        if (v_bindings == UNPROVIDED) {
            v_bindings = NIL;
        }
        if (pragmatic_support_mts == UNPROVIDED) {
            pragmatic_support_mts = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject internal_id = hl_interface_infrastructure.hl_store_remote_eval(list(KB_CREATE_DEDUCTION_KB_STORE, list_utilities.quotify(assertion), list_utilities.quotify(supports), list_utilities.quotify(truth), list_utilities.quotify(strength), list_utilities.quotify(v_bindings), list_utilities.quotify(pragmatic_support_mts)));
        SubLObject deduction = NIL;
        final SubLObject _prev_bind_0 = hl_interface_infrastructure.$override_hl_store_remote_accessP$.currentBinding(thread);
        try {
            hl_interface_infrastructure.$override_hl_store_remote_accessP$.bind(T, thread);
            deduction = deductions_low.kb_create_deduction_cyc(internal_id);
            if (NIL != hl_interface_infrastructure.hl_modify_localP()) {
                deductions_low.kb_create_deduction_int(deduction, internal_id, assertion, supports, truth, strength, v_bindings, pragmatic_support_mts);
            }
        } finally {
            hl_interface_infrastructure.$override_hl_store_remote_accessP$.rebind(_prev_bind_0, thread);
        }
        return deduction;
    }

    public static SubLObject kb_create_deduction_local(final SubLObject assertion, final SubLObject supports, final SubLObject truth, final SubLObject strength, SubLObject v_bindings, SubLObject pragmatic_support_mts) {
        if (v_bindings == UNPROVIDED) {
            v_bindings = NIL;
        }
        if (pragmatic_support_mts == UNPROVIDED) {
            pragmatic_support_mts = NIL;
        }
        final SubLObject internal_id = deductions_low.kb_create_deduction_kb_store(assertion, supports, truth, strength, v_bindings, pragmatic_support_mts);
        return deduction_handles.find_deduction_by_id(internal_id);
    }

    public static SubLObject kb_remove_deduction(final SubLObject deduction) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLSystemTrampolineFile.enforceType(deduction, DEDUCTION_P);
        SubLObject result = NIL;
        hl_interface_infrastructure.define_hl_modifier_preamble();
        hl_interface_infrastructure.note_hl_modifier_invocation(KB_REMOVE_DEDUCTION, deduction, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        if (NIL != hl_interface_infrastructure.hl_modify_remoteP()) {
            result = hl_interface_infrastructure.hl_store_remote_eval(list(KB_REMOVE_DEDUCTION, list(QUOTE, deduction)));
        }
        if (NIL != hl_interface_infrastructure.hl_modify_localP()) {
            final SubLObject _prev_bind_0 = hl_interface_infrastructure.$override_hl_store_remote_accessP$.currentBinding(thread);
            try {
                hl_interface_infrastructure.$override_hl_store_remote_accessP$.bind(T, thread);
                SubLObject release = NIL;
                try {
                    release = seize_lock($hl_lock$.getGlobalValue());
                    kb_modification_event.post_kb_modify_remove_deduction_event(deduction);
                    deductions_low.remove_deduction_dependents(deduction);
                    final SubLObject deduction_supported_object = deductions_high.deduction_supported_object(deduction);
                    if (NIL != assertion_handles.assertion_p(deduction_supported_object)) {
                        if (NIL != assertion_handles.valid_assertionP(deduction_supported_object, UNPROVIDED)) {
                            assertions_low.remove_assertion_argument(deduction_supported_object, deduction);
                        }
                    } else
                        if (NIL != arguments.hl_support_p(deduction_supported_object)) {
                            final SubLObject kb_hl_support = kb_hl_supports_high.find_kb_hl_support(deduction_supported_object);
                            if (NIL != kb_hl_support) {
                                kb_hl_supports_low.kb_hl_support_remove_argument_int(kb_hl_support);
                            }
                        }

                    return deductions_low.kb_remove_deduction_internal(deduction);
                } finally {
                    if (NIL != release) {
                        release_lock($hl_lock$.getGlobalValue());
                    }
                }
            } finally {
                hl_interface_infrastructure.$override_hl_store_remote_accessP$.rebind(_prev_bind_0, thread);
            }
        }
        return result;
    }

    public static SubLObject kb_lookup_deduction(final SubLObject assertion, final SubLObject supports, final SubLObject truth) {
        SubLSystemTrampolineFile.enforceType(assertion, SUPPORT_P);
        SubLSystemTrampolineFile.enforceType(supports, HL_JUSTIFICATION_P);
        SubLSystemTrampolineFile.enforceType(truth, TRUTH_P);
        if (NIL != hl_interface_infrastructure.hl_access_remoteP()) {
            return hl_interface_infrastructure.hl_store_remote_eval(list(KB_LOOKUP_DEDUCTION, list(QUOTE, assertion), list(QUOTE, supports), list(QUOTE, truth)));
        }
        return deductions_low.find_deduction_internal(assertion, supports, truth);
    }

    public static SubLObject kb_deduction_supported_object(final SubLObject deduction) {
        SubLSystemTrampolineFile.enforceType(deduction, DEDUCTION_P);
        if (NIL != hl_interface_infrastructure.hl_access_remoteP()) {
            return hl_interface_infrastructure.hl_store_remote_eval(list(KB_DEDUCTION_SUPPORTED_OBJECT, list(QUOTE, deduction)));
        }
        return deductions_low.deduction_supported_object_internal(deduction);
    }

    public static SubLObject kb_deduction_supports(final SubLObject deduction) {
        SubLSystemTrampolineFile.enforceType(deduction, DEDUCTION_P);
        if (NIL != hl_interface_infrastructure.hl_access_remoteP()) {
            return hl_interface_infrastructure.hl_store_remote_eval(list(KB_DEDUCTION_SUPPORTS, list(QUOTE, deduction)));
        }
        return deductions_low.deduction_supports_internal(deduction);
    }

    public static SubLObject kb_deduction_bindings(final SubLObject deduction) {
        SubLSystemTrampolineFile.enforceType(deduction, DEDUCTION_P);
        if (NIL != hl_interface_infrastructure.hl_access_remoteP()) {
            return hl_interface_infrastructure.hl_store_remote_eval(list(KB_DEDUCTION_BINDINGS, list(QUOTE, deduction)));
        }
        return deductions_low.deduction_bindings_internal(deduction);
    }

    public static SubLObject kb_deduction_pragmatic_support_mts(final SubLObject deduction) {
        SubLSystemTrampolineFile.enforceType(deduction, DEDUCTION_P);
        if (NIL != hl_interface_infrastructure.hl_access_remoteP()) {
            return hl_interface_infrastructure.hl_store_remote_eval(list(KB_DEDUCTION_PRAGMATIC_SUPPORT_MTS, list(QUOTE, deduction)));
        }
        return deductions_low.deduction_pragmatic_support_mts_internal(deduction);
    }

    public static SubLObject kb_deduction_truth(final SubLObject deduction) {
        SubLSystemTrampolineFile.enforceType(deduction, DEDUCTION_P);
        if (NIL != hl_interface_infrastructure.hl_access_remoteP()) {
            return hl_interface_infrastructure.hl_store_remote_eval(list(KB_DEDUCTION_TRUTH, list(QUOTE, deduction)));
        }
        return deductions_low.deduction_truth_internal(deduction);
    }

    public static SubLObject kb_deduction_strength(final SubLObject deduction) {
        SubLSystemTrampolineFile.enforceType(deduction, DEDUCTION_P);
        if (NIL != hl_interface_infrastructure.hl_access_remoteP()) {
            return hl_interface_infrastructure.hl_store_remote_eval(list(KB_DEDUCTION_STRENGTH, list(QUOTE, deduction)));
        }
        return deductions_low.deduction_strength_internal(deduction);
    }

    public static SubLObject kb_set_deduction_strength(final SubLObject deduction, final SubLObject new_strength) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLSystemTrampolineFile.enforceType(deduction, DEDUCTION_P);
        SubLSystemTrampolineFile.enforceType(new_strength, EL_STRENGTH_P);
        SubLObject result = NIL;
        hl_interface_infrastructure.define_hl_modifier_preamble();
        hl_interface_infrastructure.note_hl_modifier_invocation(KB_SET_DEDUCTION_STRENGTH, deduction, new_strength, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        if (NIL != hl_interface_infrastructure.hl_modify_remoteP()) {
            result = hl_interface_infrastructure.hl_store_remote_eval(list(KB_SET_DEDUCTION_STRENGTH, list(QUOTE, deduction), list(QUOTE, new_strength)));
        }
        if (NIL != hl_interface_infrastructure.hl_modify_localP()) {
            final SubLObject _prev_bind_0 = hl_interface_infrastructure.$override_hl_store_remote_accessP$.currentBinding(thread);
            try {
                hl_interface_infrastructure.$override_hl_store_remote_accessP$.bind(T, thread);
                SubLObject release = NIL;
                try {
                    release = seize_lock($hl_lock$.getGlobalValue());
                    final SubLObject old_strength = arguments.argument_strength(deduction);
                    final SubLObject result_$1 = deductions_low.kb_set_deduction_strength_internal(deduction, new_strength);
                    kb_modification_event.post_kb_modify_set_deduction_strength_event(deduction, old_strength, new_strength);
                    return result_$1;
                } finally {
                    if (NIL != release) {
                        release_lock($hl_lock$.getGlobalValue());
                    }
                }
            } finally {
                hl_interface_infrastructure.$override_hl_store_remote_accessP$.rebind(_prev_bind_0, thread);
            }
        }
        return result;
    }

    public static SubLObject declare_deductions_interface_file() {
        declareFunction(me, "kb_create_deduction", "KB-CREATE-DEDUCTION", 4, 2, false);
        declareFunction(me, "kb_create_deduction_remote", "KB-CREATE-DEDUCTION-REMOTE", 4, 2, false);
        declareFunction(me, "kb_create_deduction_local", "KB-CREATE-DEDUCTION-LOCAL", 4, 2, false);
        declareFunction(me, "kb_remove_deduction", "KB-REMOVE-DEDUCTION", 1, 0, false);
        declareFunction(me, "kb_lookup_deduction", "KB-LOOKUP-DEDUCTION", 3, 0, false);
        declareFunction(me, "kb_deduction_supported_object", "KB-DEDUCTION-SUPPORTED-OBJECT", 1, 0, false);
        declareFunction(me, "kb_deduction_supports", "KB-DEDUCTION-SUPPORTS", 1, 0, false);
        declareFunction(me, "kb_deduction_bindings", "KB-DEDUCTION-BINDINGS", 1, 0, false);
        declareFunction(me, "kb_deduction_pragmatic_support_mts", "KB-DEDUCTION-PRAGMATIC-SUPPORT-MTS", 1, 0, false);
        declareFunction(me, "kb_deduction_truth", "KB-DEDUCTION-TRUTH", 1, 0, false);
        declareFunction(me, "kb_deduction_strength", "KB-DEDUCTION-STRENGTH", 1, 0, false);
        declareFunction(me, "kb_set_deduction_strength", "KB-SET-DEDUCTION-STRENGTH", 2, 0, false);
        return NIL;
    }

    public static SubLObject init_deductions_interface_file() {
        return NIL;
    }

    public static SubLObject setup_deductions_interface_file() {
        register_cyc_api_function(KB_CREATE_DEDUCTION, $list6, $str7$Create_a_new_deduction_consisting, $list8, $list9);
        register_cyc_api_function(KB_REMOVE_DEDUCTION, $list14, $str15$Remove_DEDUCTION_from_the_KB__and, $list16, $list17);
        register_cyc_api_function(KB_LOOKUP_DEDUCTION, $list19, $str20$Return_the_deduction_with_ASSERTI, $list21, $list22);
        register_cyc_api_function(KB_DEDUCTION_SUPPORTED_OBJECT, $list14, $str24$Return_the_assertion_for_DEDUCTIO, $list16, $list25);
        register_cyc_api_function(KB_DEDUCTION_SUPPORTS, $list14, $str27$Return_the_supports_for_DEDUCTION, $list16, $list28);
        register_cyc_api_function(KB_DEDUCTION_BINDINGS, $list14, $str30$Return_the_bindings_for_DEDUCTION, $list16, $list28);
        register_cyc_api_function(KB_DEDUCTION_PRAGMATIC_SUPPORT_MTS, $list14, $str32$Return_the_pragmatic_support_mts_, $list16, $list28);
        register_cyc_api_function(KB_DEDUCTION_TRUTH, $list14, $str34$Return_the_truth_for_DEDUCTION_, $list16, $list35);
        register_cyc_api_function(KB_DEDUCTION_STRENGTH, $list14, $str37$Return_the_strength_for_DEDUCTION, $list16, $list38);
        register_cyc_api_function(KB_SET_DEDUCTION_STRENGTH, $list40, $str41$Change_the_strength_of_DEDUCTION_, $list42, $list9);
        return NIL;
    }

    @Override
    public void declareFunctions() {
        declare_deductions_interface_file();
    }

    @Override
    public void initializeVariables() {
        init_deductions_interface_file();
    }

    @Override
    public void runTopLevelForms() {
        setup_deductions_interface_file();
    }

    
}

/**
 * Total time: 162 ms
 */
