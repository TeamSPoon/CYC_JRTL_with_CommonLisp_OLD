package com.cyc.cycjava.cycl;


import static com.cyc.cycjava.cycl.constant_handles.reader_make_constant_shell;
import static com.cyc.cycjava.cycl.control_vars.$mapping_answer$;
import static com.cyc.cycjava.cycl.control_vars.$mapping_gather_arg$;
import static com.cyc.cycjava.cycl.control_vars.$pgia_activeP$;
import static com.cyc.cycjava.cycl.subl_macro_promotions.declare_defglobal;
import static com.cyc.cycjava.cycl.utilities_macros.register_kb_function;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.cons;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.list;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.listS;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality.eq;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions.funcall;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.symbol_function;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads.$is_thread_performing_cleanupP$;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types.sublisp_null;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.getValuesAsVector;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.restoreValuesFromVector;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeBoolean;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeKeyword;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeString;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeSymbol;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.cdestructuring_bind_error;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.destructuring_bind_must_consp;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.copy_tree;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.member;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.second;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.third;
import static com.cyc.tool.subl.util.SubLFiles.declareFunction;
import static com.cyc.tool.subl.util.SubLFiles.deflexical;
import static com.cyc.tool.subl.util.SubLFiles.defparameter;

import com.cyc.cycjava.cycl.sbhl.sbhl_graphs;
import com.cyc.cycjava.cycl.sbhl.sbhl_link_vars;
import com.cyc.cycjava.cycl.sbhl.sbhl_links;
import com.cyc.cycjava.cycl.sbhl.sbhl_marking_methods;
import com.cyc.cycjava.cycl.sbhl.sbhl_marking_vars;
import com.cyc.cycjava.cycl.sbhl.sbhl_module_utilities;
import com.cyc.cycjava.cycl.sbhl.sbhl_module_vars;
import com.cyc.cycjava.cycl.sbhl.sbhl_paranoia;
import com.cyc.cycjava.cycl.sbhl.sbhl_search_vars;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.BinaryFunction;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLSystemTrampolineFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;


public final class preserves_genls_in_arg extends SubLTranslatedFile {
    public static final SubLFile me = new preserves_genls_in_arg();

    public static final String myName = "com.cyc.cycjava.cycl.preserves_genls_in_arg";

    public static final String myFingerPrint = "f1652732e5ae4c3b2bb0bd8c461faf6b590c7dc63e2069125a0b8047ea3db2d1";

    // defparameter
    private static final SubLSymbol $pgia_fn$ = makeSymbol("*PGIA-FN*");

    // defparameter
    private static final SubLSymbol $pgia_gaf$ = makeSymbol("*PGIA-GAF*");

    // defparameter
    private static final SubLSymbol $pgia_arg$ = makeSymbol("*PGIA-ARG*");

    // defparameter
    private static final SubLSymbol $pgia_done$ = makeSymbol("*PGIA-DONE*");

    // defparameter
    private static final SubLSymbol $pgia_nat$ = makeSymbol("*PGIA-NAT*");

    // defparameter
    private static final SubLSymbol $pgia_nat_fort$ = makeSymbol("*PGIA-NAT-FORT*");

    // defparameter
    private static final SubLSymbol $pgia_col$ = makeSymbol("*PGIA-COL*");

    // defparameter
    private static final SubLSymbol $pgia_genl$ = makeSymbol("*PGIA-GENL*");

    // defparameter
    private static final SubLSymbol $pgia_genl_nat$ = makeSymbol("*PGIA-GENL-NAT*");

    // defparameter
    private static final SubLSymbol $pgia_genl_nats$ = makeSymbol("*PGIA-GENL-NATS*");

    // defparameter
    private static final SubLSymbol $pgia_spec$ = makeSymbol("*PGIA-SPEC*");

    // defparameter
    private static final SubLSymbol $pgia_spec_nat$ = makeSymbol("*PGIA-SPEC-NAT*");

    // defparameter
    private static final SubLSymbol $pgia_spec_nats$ = makeSymbol("*PGIA-SPEC-NATS*");

    // defparameter
    private static final SubLSymbol $candidate_pgia_genls$ = makeSymbol("*CANDIDATE-PGIA-GENLS*");

    // defparameter
    private static final SubLSymbol $candidate_pgia_specs$ = makeSymbol("*CANDIDATE-PGIA-SPECS*");

    // defparameter
    private static final SubLSymbol $consider_current_pgiaP$ = makeSymbol("*CONSIDER-CURRENT-PGIA?*");

    // defparameter
    private static final SubLSymbol $current_pgia_genls$ = makeSymbol("*CURRENT-PGIA-GENLS*");

    // defparameter
    private static final SubLSymbol $current_pgia_specs$ = makeSymbol("*CURRENT-PGIA-SPECS*");



    // defparameter
    private static final SubLSymbol $pgia_rule$ = makeSymbol("*PGIA-RULE*");

    // Internal Constants
    public static final SubLSymbol $pgia_mt$ = makeSymbol("*PGIA-MT*");

    private static final SubLObject $$BaseKB = reader_make_constant_shell(makeString("BaseKB"));

    public static final SubLList $list2 = list(reader_make_constant_shell(makeString("implies")), list(reader_make_constant_shell(makeString("and")), list(reader_make_constant_shell(makeString("preservesGenlsInArg")), list(reader_make_constant_shell(makeString("FormulaArgFn")), ZERO_INTEGER, makeSymbol("?NAT-1")), makeSymbol("?ARG")), list(reader_make_constant_shell(makeString("equals")), list(reader_make_constant_shell(makeString("FormulaArgFn")), ZERO_INTEGER, makeSymbol("?NAT-1")), list(reader_make_constant_shell(makeString("FormulaArgFn")), ZERO_INTEGER, makeSymbol("?NAT-2"))), list(reader_make_constant_shell(makeString("different")), makeSymbol("?NAT-1"), makeSymbol("?NAT-2")), list(reader_make_constant_shell(makeString("genls")), list(reader_make_constant_shell(makeString("FormulaArgFn")), makeSymbol("?ARG"), makeSymbol("?NAT-1")), list(reader_make_constant_shell(makeString("FormulaArgFn")), makeSymbol("?ARG"), makeSymbol("?NAT-2")))), list(reader_make_constant_shell(makeString("genls")), makeSymbol("?NAT-1"), makeSymbol("?NAT-2")));



    public static final SubLSymbol PGIA_AFTER_ADDING_PGIA_1 = makeSymbol("PGIA-AFTER-ADDING-PGIA-1");

    public static final SubLSymbol PGIA_AFTER_ADDING_PGIA = makeSymbol("PGIA-AFTER-ADDING-PGIA");



    private static final SubLObject $$EverythingPSC = reader_make_constant_shell(makeString("EverythingPSC"));

    public static final SubLSymbol PGIA_AFTER_ADDING_PGIA_2 = makeSymbol("PGIA-AFTER-ADDING-PGIA-2");

    public static final SubLSymbol SBHL_UNRECORDED_NODE_P = makeSymbol("SBHL-UNRECORDED-NODE-P");

    public static final SubLSymbol PGIA_AFTER_ADDING_PGIA_3 = makeSymbol("PGIA-AFTER-ADDING-PGIA-3");

    private static final SubLObject $$genls = reader_make_constant_shell(makeString("genls"));





    private static final SubLObject $$isa = reader_make_constant_shell(makeString("isa"));

    private static final SubLObject $$Collection = reader_make_constant_shell(makeString("Collection"));

    public static final SubLSymbol PGIA_AFTER_ADDING_ISA_1 = makeSymbol("PGIA-AFTER-ADDING-ISA-1");

    private static final SubLObject $$preservesGenlsInArg = reader_make_constant_shell(makeString("preservesGenlsInArg"));



    public static final SubLSymbol PGIA_AFTER_ADDING_ISA = makeSymbol("PGIA-AFTER-ADDING-ISA");

    public static final SubLSymbol PGIA_AFTER_ADDING_ISA_2 = makeSymbol("PGIA-AFTER-ADDING-ISA-2");

    public static final SubLSymbol PGIA_AFTER_REMOVING_GENLS_1 = makeSymbol("PGIA-AFTER-REMOVING-GENLS-1");

    public static final SubLSymbol PGIA_AFTER_REMOVING_GENLS = makeSymbol("PGIA-AFTER-REMOVING-GENLS");



    private static final SubLString $str24$_A_is_neither_SET_P_nor_LISTP_ = makeString("~A is neither SET-P nor LISTP.");

    private static final SubLString $str25$attempting_to_bind_direction_link = makeString("attempting to bind direction link variable, to NIL. macro body not executed.");



    private static final SubLSymbol RECOMPUTE_FUNCTOR_PGIA_1 = makeSymbol("RECOMPUTE-FUNCTOR-PGIA-1");

    private static final SubLSymbol RECOMPUTE_NAT_PGIA_1 = makeSymbol("RECOMPUTE-NAT-PGIA-1");

    private static final SubLSymbol GATHER_PGIA = makeSymbol("GATHER-PGIA");



    public static final SubLList $list31 = list(makeSymbol("GAF"), makeSymbol("GENL-COL"), makeSymbol("MT"));

    private static final SubLList $list32 = list(makeKeyword("DEFAULT"));



    public static final SubLList $list34 = list(makeSymbol("GENL-NAT"), makeSymbol("GENL-COL"), makeSymbol("MT"));

    public static final SubLList $list35 = list(makeSymbol("GAF"), makeSymbol("SPEC-COL"), makeSymbol("MT"));

    public static final SubLList $list36 = list(makeSymbol("SPEC-NAT"), makeSymbol("SPEC-COL"), makeSymbol("MT"));

    public static final SubLList $list37 = list(makeSymbol("GAF"), makeSymbol("COL"), makeSymbol("MT"));

    public static final SubLList $list38 = list(makeSymbol("PRED"), makeSymbol("SPEC"), makeSymbol("GENL"));

    public static final SubLList $list39 = list(makeSymbol("KNOWN-NAT"), makeSymbol("KNOWN-COL"), makeSymbol("KNOWN-MT"));

    private static final SubLList $list40 = list(makeSymbol("KNOWN-NAT"), makeSymbol("KNOWN-MT"));

    public static SubLObject pgia_after_adding_pgia(final SubLObject argument, final SubLObject assertion) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != $pgia_activeP$.getDynamicValue(thread)) {
            final SubLObject _prev_bind_0 = sbhl_link_vars.$added_source$.currentBinding(thread);
            try {
                sbhl_link_vars.$added_source$.bind(argument, thread);
                if (NIL != assertion_utilities.true_assertionP(assertion)) {
                    final SubLObject pgia_mt = assertions_high.assertion_mt(assertion);
                    final SubLObject _prev_bind_0_$1 = $pgia_fn$.currentBinding(thread);
                    final SubLObject _prev_bind_2 = $pgia_arg$.currentBinding(thread);
                    final SubLObject _prev_bind_3 = $pgia_gaf$.currentBinding(thread);
                    final SubLObject _prev_bind_4 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                    final SubLObject _prev_bind_5 = mt_relevance_macros.$mt$.currentBinding(thread);
                    try {
                        $pgia_fn$.bind(assertions_high.gaf_arg1(assertion), thread);
                        $pgia_arg$.bind(assertions_high.gaf_arg2(assertion), thread);
                        $pgia_gaf$.bind(assertion, thread);
                        mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_GENL_MT, thread);
                        mt_relevance_macros.$mt$.bind(pgia_mt, thread);
                        if (arity.arity($pgia_fn$.getDynamicValue(thread)).numGE($pgia_arg$.getDynamicValue(thread)) || (NIL != arity.variable_arityP($pgia_fn$.getDynamicValue(thread)))) {
                            kb_mapping.map_function_extent_index(symbol_function(PGIA_AFTER_ADDING_PGIA_1), $pgia_fn$.getDynamicValue(thread));
                        }
                    } finally {
                        mt_relevance_macros.$mt$.rebind(_prev_bind_5, thread);
                        mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_4, thread);
                        $pgia_gaf$.rebind(_prev_bind_3, thread);
                        $pgia_arg$.rebind(_prev_bind_2, thread);
                        $pgia_fn$.rebind(_prev_bind_0_$1, thread);
                    }
                }
            } finally {
                sbhl_link_vars.$added_source$.rebind(_prev_bind_0, thread);
            }
        }
        return NIL;
    }

    public static SubLObject pgia_after_adding_pgia_1(final SubLObject assertion) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != function_terms.tou_assertionP(assertion)) {
            final SubLObject _prev_bind_0 = $pgia_nat_fort$.currentBinding(thread);
            final SubLObject _prev_bind_2 = $pgia_nat$.currentBinding(thread);
            final SubLObject _prev_bind_3 = $pgia_col$.currentBinding(thread);
            final SubLObject _prev_bind_4 = $current_pgia_genls$.currentBinding(thread);
            final SubLObject _prev_bind_5 = $candidate_pgia_genls$.currentBinding(thread);
            try {
                $pgia_nat_fort$.bind(assertions_high.gaf_arg1(assertion), thread);
                $pgia_nat$.bind(assertions_high.gaf_arg2(assertion), thread);
                $pgia_col$.bind(cycl_utilities.nat_arg($pgia_nat$.getDynamicValue(thread), $pgia_arg$.getDynamicValue(thread), UNPROVIDED), thread);
                $current_pgia_genls$.bind(current_pgia_genls($pgia_nat_fort$.getDynamicValue(thread), $pgia_arg$.getDynamicValue(thread)), thread);
                $candidate_pgia_genls$.bind(NIL, thread);
                if (NIL != $pgia_col$.getDynamicValue(thread)) {
                    final SubLObject _prev_bind_0_$2 = sbhl_marking_vars.$sbhl_table$.currentBinding(thread);
                    try {
                        sbhl_marking_vars.$sbhl_table$.bind(sbhl_marking_vars.get_sbhl_marking_space(), thread);
                        try {
                            final SubLObject _prev_bind_0_$3 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                            final SubLObject _prev_bind_1_$4 = mt_relevance_macros.$mt$.currentBinding(thread);
                            try {
                                mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_EVERYTHING, thread);
                                mt_relevance_macros.$mt$.bind($$EverythingPSC, thread);
                                genls.map_all_genls_if(symbol_function(PGIA_AFTER_ADDING_PGIA_2), SBHL_UNRECORDED_NODE_P, $pgia_col$.getDynamicValue(thread), UNPROVIDED, UNPROVIDED);
                            } finally {
                                mt_relevance_macros.$mt$.rebind(_prev_bind_1_$4, thread);
                                mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0_$3, thread);
                            }
                        } finally {
                            final SubLObject _prev_bind_0_$4 = $is_thread_performing_cleanupP$.currentBinding(thread);
                            try {
                                $is_thread_performing_cleanupP$.bind(T, thread);
                                final SubLObject _values = getValuesAsVector();
                                sbhl_marking_vars.free_sbhl_marking_space(sbhl_marking_vars.$sbhl_table$.getDynamicValue(thread));
                                restoreValuesFromVector(_values);
                            } finally {
                                $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$4, thread);
                            }
                        }
                    } finally {
                        sbhl_marking_vars.$sbhl_table$.rebind(_prev_bind_0_$2, thread);
                    }
                    assert_candidate_pgia_genls();
                }
            } finally {
                $candidate_pgia_genls$.rebind(_prev_bind_5, thread);
                $current_pgia_genls$.rebind(_prev_bind_4, thread);
                $pgia_col$.rebind(_prev_bind_3, thread);
                $pgia_nat$.rebind(_prev_bind_2, thread);
                $pgia_nat_fort$.rebind(_prev_bind_0, thread);
            }
        }
        return NIL;
    }

    public static SubLObject pgia_after_adding_pgia_2(final SubLObject genl) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (!$pgia_col$.getDynamicValue(thread).eql(genl)) {
            final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
            final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
            try {
                mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_GENL_MT, thread);
                mt_relevance_macros.$mt$.bind(mt_relevance_macros.$mt$.getDynamicValue(thread), thread);
                map_tous_of_fn_arg(symbol_function(PGIA_AFTER_ADDING_PGIA_3), genl, $pgia_arg$.getDynamicValue(thread), $pgia_fn$.getDynamicValue(thread));
            } finally {
                mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
                mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
            }
        }
        return NIL;
    }

    public static SubLObject pgia_after_adding_pgia_3(final SubLObject assertion) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (((NIL != assertion_handles.assertion_p(assertion)) && (NIL != function_terms.tou_assertionP(assertion))) && (!$pgia_nat_fort$.getDynamicValue(thread).eql(assertions_high.gaf_arg1(assertion)))) {
            final SubLObject genl_nat_fort = assertions_high.gaf_arg1(assertion);
            final SubLObject genl_col = cycl_utilities.nat_arg(genl_nat_fort, $pgia_arg$.getDynamicValue(thread), UNPROVIDED);
            final SubLObject gaf = list($$genls, $pgia_nat_fort$.getDynamicValue(thread), genl_nat_fort);
            if (NIL != genl_col) {
                SubLObject cdolist_list_var = pgia_true_in_mts($pgia_nat_fort$.getDynamicValue(thread), genl_nat_fort, $pgia_arg$.getDynamicValue(thread));
                SubLObject mt = NIL;
                mt = cdolist_list_var.first();
                while (NIL != cdolist_list_var) {
                    final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                    final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
                    try {
                        mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_EQ, thread);
                        mt_relevance_macros.$mt$.bind(mt, thread);
                        if (NIL == genls.genlsP($pgia_nat_fort$.getDynamicValue(thread), genl_nat_fort, UNPROVIDED, UNPROVIDED)) {
                            $candidate_pgia_genls$.setDynamicValue(cons(list(gaf, genl_col, mt), $candidate_pgia_genls$.getDynamicValue(thread)), thread);
                        }
                    } finally {
                        mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
                        mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
                    }
                    cdolist_list_var = cdolist_list_var.rest();
                    mt = cdolist_list_var.first();
                } 
            }
            sbhl_marking_methods.sbhl_record_proper_all_forward_true_nodes(sbhl_module_vars.get_sbhl_module($$genls), genl_col, UNPROVIDED, UNPROVIDED);
        }
        return NIL;
    }

    public static SubLObject pgia_after_adding_isa(final SubLObject argument, final SubLObject assertion) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if ((NIL != $pgia_activeP$.getDynamicValue(thread)) && (NIL == subl_promotions.memberP(argument, assertions_high.assertion_arguments(assertion), NOT_EQ, UNPROVIDED))) {
            final SubLObject _prev_bind_0 = sbhl_link_vars.$added_source$.currentBinding(thread);
            try {
                sbhl_link_vars.$added_source$.bind(argument, thread);
                if (NIL != assertion_utilities.true_assertionP(assertion)) {
                    final SubLObject mt = assertions_high.assertion_mt(assertion);
                    final SubLObject nat_fort = assertions_high.gaf_arg1(assertion);
                    final SubLObject col_type = assertions_high.gaf_arg2(assertion);
                    final SubLObject nat = function_terms.term_of_unit(nat_fort);
                    SubLObject redundantP = sbhl_links.any_sbhl_links_p(nat_fort, $$isa);
                    if (NIL == redundantP) {
                        final SubLObject _prev_bind_0_$6 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                        SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
                        try {
                            mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_EVERYTHING, thread);
                            mt_relevance_macros.$mt$.bind($$EverythingPSC, thread);
                            redundantP = subl_promotions.memberP(col_type, isa.isa(nat_fort, UNPROVIDED, UNPROVIDED), NOT_EQ, UNPROVIDED);
                        } finally {
                            mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
                            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0_$6, thread);
                        }
                        if (((NIL == redundantP) && (NIL != nat)) && (NIL != genls.genlsP(col_type, $$Collection, mt, UNPROVIDED))) {
                            final SubLObject _prev_bind_0_$7 = $pgia_fn$.currentBinding(thread);
                            _prev_bind_2 = $pgia_nat_fort$.currentBinding(thread);
                            final SubLObject _prev_bind_3 = $pgia_nat$.currentBinding(thread);
                            final SubLObject _prev_bind_4 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                            final SubLObject _prev_bind_5 = mt_relevance_macros.$mt$.currentBinding(thread);
                            try {
                                $pgia_fn$.bind(cycl_utilities.nat_functor(nat), thread);
                                $pgia_nat_fort$.bind(nat_fort, thread);
                                $pgia_nat$.bind(nat, thread);
                                mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_EVERYTHING, thread);
                                mt_relevance_macros.$mt$.bind($$EverythingPSC, thread);
                                kb_mapping.map_gaf_arg_index(symbol_function(PGIA_AFTER_ADDING_ISA_1), $pgia_fn$.getDynamicValue(thread), ONE_INTEGER, $$preservesGenlsInArg, $TRUE, UNPROVIDED);
                            } finally {
                                mt_relevance_macros.$mt$.rebind(_prev_bind_5, thread);
                                mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_4, thread);
                                $pgia_nat$.rebind(_prev_bind_3, thread);
                                $pgia_nat_fort$.rebind(_prev_bind_2, thread);
                                $pgia_fn$.rebind(_prev_bind_0_$7, thread);
                            }
                        }
                    }
                }
            } finally {
                sbhl_link_vars.$added_source$.rebind(_prev_bind_0, thread);
            }
        }
        return NIL;
    }

    public static SubLObject pgia_after_adding_isa_1(final SubLObject assertion) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != assertion_handles.assertion_p(assertion)) {
            final SubLObject _prev_bind_0 = $pgia_arg$.currentBinding(thread);
            try {
                $pgia_arg$.bind(assertions_high.gaf_arg2(assertion), thread);
                if ($pgia_arg$.getDynamicValue(thread).isInteger()) {
                    final SubLObject _prev_bind_0_$8 = $pgia_col$.currentBinding(thread);
                    final SubLObject _prev_bind_2 = $pgia_gaf$.currentBinding(thread);
                    final SubLObject _prev_bind_3 = $candidate_pgia_genls$.currentBinding(thread);
                    final SubLObject _prev_bind_4 = $candidate_pgia_specs$.currentBinding(thread);
                    try {
                        $pgia_col$.bind(cycl_utilities.nat_arg($pgia_nat$.getDynamicValue(thread), $pgia_arg$.getDynamicValue(thread), UNPROVIDED), thread);
                        $pgia_gaf$.bind(assertion, thread);
                        $candidate_pgia_genls$.bind(NIL, thread);
                        $candidate_pgia_specs$.bind(NIL, thread);
                        if (NIL != fort_types_interface.collectionP($pgia_col$.getDynamicValue(thread))) {
                            kb_mapping.map_function_extent_index(symbol_function(PGIA_AFTER_ADDING_ISA_2), $pgia_fn$.getDynamicValue(thread));
                        }
                        assert_candidate_pgia_genls();
                        assert_candidate_pgia_specs();
                    } finally {
                        $candidate_pgia_specs$.rebind(_prev_bind_4, thread);
                        $candidate_pgia_genls$.rebind(_prev_bind_3, thread);
                        $pgia_gaf$.rebind(_prev_bind_2, thread);
                        $pgia_col$.rebind(_prev_bind_0_$8, thread);
                    }
                }
            } finally {
                $pgia_arg$.rebind(_prev_bind_0, thread);
            }
        }
        return NIL;
    }

    public static SubLObject pgia_after_adding_isa_2(final SubLObject assertion) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != function_terms.tou_assertionP(assertion)) {
            final SubLObject nat_constant_2 = assertions_high.gaf_arg1(assertion);
            final SubLObject nat_2 = assertions_high.gaf_arg2(assertion);
            final SubLObject col_2 = cycl_utilities.nat_arg(nat_2, $pgia_arg$.getDynamicValue(thread), UNPROVIDED);
            if (!$pgia_col$.getDynamicValue(thread).eql(col_2)) {
                if (NIL != genls.genlP($pgia_col$.getDynamicValue(thread), col_2, UNPROVIDED, UNPROVIDED)) {
                    SubLObject cdolist_list_var = pgia_true_in_mts($pgia_nat_fort$.getDynamicValue(thread), nat_constant_2, $pgia_arg$.getDynamicValue(thread));
                    SubLObject mt = NIL;
                    mt = cdolist_list_var.first();
                    while (NIL != cdolist_list_var) {
                        final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                        final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
                        try {
                            mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_EQ, thread);
                            mt_relevance_macros.$mt$.bind(mt, thread);
                            if (NIL == genls.genlP($pgia_nat_fort$.getDynamicValue(thread), nat_constant_2, UNPROVIDED, UNPROVIDED)) {
                                $candidate_pgia_genls$.setDynamicValue(cons(list(list($$genls, $pgia_nat_fort$.getDynamicValue(thread), nat_constant_2), col_2, mt), $candidate_pgia_genls$.getDynamicValue(thread)), thread);
                            }
                        } finally {
                            mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
                            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
                        }
                        cdolist_list_var = cdolist_list_var.rest();
                        mt = cdolist_list_var.first();
                    } 
                }
                if (NIL != genls.genlP(col_2, $pgia_col$.getDynamicValue(thread), UNPROVIDED, UNPROVIDED)) {
                    SubLObject cdolist_list_var = pgia_true_in_mts(nat_constant_2, $pgia_nat_fort$.getDynamicValue(thread), $pgia_arg$.getDynamicValue(thread));
                    SubLObject mt = NIL;
                    mt = cdolist_list_var.first();
                    while (NIL != cdolist_list_var) {
                        final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                        final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
                        try {
                            mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_EQ, thread);
                            mt_relevance_macros.$mt$.bind(mt, thread);
                            if (NIL == genls.genlsP(nat_constant_2, $pgia_nat_fort$.getDynamicValue(thread), UNPROVIDED, UNPROVIDED)) {
                                $candidate_pgia_specs$.setDynamicValue(cons(list(list($$genls, nat_constant_2, $pgia_nat_fort$.getDynamicValue(thread)), col_2, mt), $candidate_pgia_specs$.getDynamicValue(thread)), thread);
                            }
                        } finally {
                            mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
                            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
                        }
                        cdolist_list_var = cdolist_list_var.rest();
                        mt = cdolist_list_var.first();
                    } 
                }
            }
        }
        return NIL;
    }

    public static SubLObject pgia_after_removing_genls(final SubLObject deduction, final SubLObject assertion) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if ((NIL != $pgia_activeP$.getDynamicValue(thread)) && (NIL != pgia_deductionP(deduction, UNPROVIDED))) {
            final SubLObject axiom = assertions_high.gaf_formula(assertion);
            final SubLObject truth = assertions_high.assertion_truth(assertion);
            final SubLObject mt = assertions_high.assertion_mt(assertion);
            final SubLObject _prev_bind_0 = $pgia_spec$.currentBinding(thread);
            final SubLObject _prev_bind_2 = $pgia_genl$.currentBinding(thread);
            try {
                $pgia_spec$.bind(second(axiom), thread);
                $pgia_genl$.bind(third(axiom), thread);
                if (NIL == kb_accessors.assertion_still_thereP(assertion, truth)) {
                    final SubLObject _prev_bind_0_$9 = $pgia_spec_nat$.currentBinding(thread);
                    final SubLObject _prev_bind_1_$10 = $pgia_genl_nat$.currentBinding(thread);
                    try {
                        $pgia_spec_nat$.bind(function_terms.term_of_unit($pgia_spec$.getDynamicValue(thread)), thread);
                        $pgia_genl_nat$.bind(function_terms.term_of_unit($pgia_genl$.getDynamicValue(thread)), thread);
                        if ((NIL != $pgia_spec_nat$.getDynamicValue(thread)) && (NIL != $pgia_genl_nat$.getDynamicValue(thread))) {
                            final SubLObject _prev_bind_0_$10 = $pgia_fn$.currentBinding(thread);
                            try {
                                $pgia_fn$.bind(cycl_utilities.nat_functor($pgia_spec_nat$.getDynamicValue(thread)), thread);
                                if ($pgia_fn$.getDynamicValue(thread).eql(cycl_utilities.nat_functor($pgia_genl_nat$.getDynamicValue(thread)))) {
                                    final SubLObject _prev_bind_0_$11 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                                    final SubLObject _prev_bind_1_$11 = mt_relevance_macros.$mt$.currentBinding(thread);
                                    try {
                                        mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_GENL_MT, thread);
                                        mt_relevance_macros.$mt$.bind(mt, thread);
                                        kb_mapping.map_gaf_arg_index(symbol_function(PGIA_AFTER_REMOVING_GENLS_1), $pgia_fn$.getDynamicValue(thread), ONE_INTEGER, $$preservesGenlsInArg, $TRUE, UNPROVIDED);
                                    } finally {
                                        mt_relevance_macros.$mt$.rebind(_prev_bind_1_$11, thread);
                                        mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0_$11, thread);
                                    }
                                }
                            } finally {
                                $pgia_fn$.rebind(_prev_bind_0_$10, thread);
                            }
                        }
                    } finally {
                        $pgia_genl_nat$.rebind(_prev_bind_1_$10, thread);
                        $pgia_spec_nat$.rebind(_prev_bind_0_$9, thread);
                    }
                }
            } finally {
                $pgia_genl$.rebind(_prev_bind_2, thread);
                $pgia_spec$.rebind(_prev_bind_0, thread);
            }
        }
        return NIL;
    }

    public static SubLObject pgia_after_removing_genls_1(final SubLObject assertion) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if ((NIL != assertion_handles.assertion_p(assertion)) && (NIL == tms.tms_assertion_being_removedP(assertion))) {
            final SubLObject _prev_bind_0 = $pgia_arg$.currentBinding(thread);
            final SubLObject _prev_bind_2 = $pgia_gaf$.currentBinding(thread);
            final SubLObject _prev_bind_3 = $candidate_pgia_genls$.currentBinding(thread);
            final SubLObject _prev_bind_4 = $candidate_pgia_specs$.currentBinding(thread);
            try {
                $pgia_arg$.bind(assertions_high.gaf_arg2(assertion), thread);
                $pgia_gaf$.bind(assertion, thread);
                $candidate_pgia_genls$.bind(NIL, thread);
                $candidate_pgia_specs$.bind(NIL, thread);
                if ($pgia_arg$.getDynamicValue(thread).isInteger()) {
                    final SubLObject _prev_bind_0_$14 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                    final SubLObject _prev_bind_1_$15 = mt_relevance_macros.$mt$.currentBinding(thread);
                    try {
                        mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_EVERYTHING, thread);
                        mt_relevance_macros.$mt$.bind($$EverythingPSC, thread);
                        final SubLObject spec_col = cycl_utilities.nat_arg($pgia_spec_nat$.getDynamicValue(thread), $pgia_arg$.getDynamicValue(thread), UNPROVIDED);
                        final SubLObject _prev_bind_0_$15 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
                        try {
                            sbhl_module_vars.$sbhl_module$.bind(NIL != sbhl_module_vars.get_sbhl_module($$genls) ? sbhl_module_vars.get_sbhl_module($$genls) : sbhl_module_vars.$sbhl_module$.getDynamicValue(thread), thread);
                            final SubLObject node = function_terms.naut_to_nart($pgia_genl$.getDynamicValue(thread));
                            if (NIL != sbhl_link_vars.sbhl_node_object_p(node)) {
                                final SubLObject d_link = sbhl_graphs.get_sbhl_graph_link(node, sbhl_module_vars.get_sbhl_module($$genls));
                                if (NIL != d_link) {
                                    final SubLObject mt_links = sbhl_links.get_sbhl_mt_links(d_link, sbhl_module_utilities.get_sbhl_module_forward_direction(sbhl_module_vars.get_sbhl_module($$genls)), sbhl_module_vars.get_sbhl_module($$genls));
                                    if (NIL != mt_links) {
                                        SubLObject iteration_state;
                                        for (iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(mt_links)); NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state); iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state)) {
                                            thread.resetMultipleValues();
                                            final SubLObject mt = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
                                            final SubLObject tv_links = thread.secondMultipleValue();
                                            thread.resetMultipleValues();
                                            if (NIL != mt_relevance_macros.relevant_mtP(mt)) {
                                                final SubLObject _prev_bind_0_$16 = sbhl_link_vars.$sbhl_link_mt$.currentBinding(thread);
                                                try {
                                                    sbhl_link_vars.$sbhl_link_mt$.bind(mt, thread);
                                                    SubLObject iteration_state_$18;
                                                    for (iteration_state_$18 = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(tv_links)); NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state_$18); iteration_state_$18 = dictionary_contents.do_dictionary_contents_next(iteration_state_$18)) {
                                                        thread.resetMultipleValues();
                                                        final SubLObject tv = dictionary_contents.do_dictionary_contents_key_value(iteration_state_$18);
                                                        final SubLObject link_nodes = thread.secondMultipleValue();
                                                        thread.resetMultipleValues();
                                                        if (NIL != sbhl_search_vars.relevant_sbhl_tvP(tv)) {
                                                            final SubLObject _prev_bind_0_$17 = sbhl_link_vars.$sbhl_link_tv$.currentBinding(thread);
                                                            try {
                                                                sbhl_link_vars.$sbhl_link_tv$.bind(tv, thread);
                                                                final SubLObject sol = link_nodes;
                                                                if (NIL != set.set_p(sol)) {
                                                                    final SubLObject set_contents_var = set.do_set_internal(sol);
                                                                    SubLObject basis_object;
                                                                    SubLObject state;
                                                                    SubLObject grand_pa;
                                                                    SubLObject grand_pa_nat;
                                                                    SubLObject grand_pa_col;
                                                                    SubLObject candidate_pgia;
                                                                    SubLObject item_var;
                                                                    for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
                                                                        grand_pa = set_contents.do_set_contents_next(basis_object, state);
                                                                        if (NIL != set_contents.do_set_contents_element_validP(state, grand_pa)) {
                                                                            grand_pa_nat = function_terms.term_of_unit(grand_pa);
                                                                            if ((NIL != grand_pa_nat) && $pgia_fn$.getDynamicValue(thread).eql(cycl_utilities.nat_functor(grand_pa_nat))) {
                                                                                grand_pa_col = cycl_utilities.nat_arg(grand_pa_nat, $pgia_arg$.getDynamicValue(thread), UNPROVIDED);
                                                                                candidate_pgia = candidate_pgia(spec_col, grand_pa_col, $pgia_spec$.getDynamicValue(thread), grand_pa, $GENLS, UNPROVIDED);
                                                                                if (NIL != candidate_pgia) {
                                                                                    item_var = candidate_pgia;
                                                                                    if (NIL == member(item_var, $candidate_pgia_genls$.getDynamicValue(thread), symbol_function(EQUAL), symbol_function(IDENTITY))) {
                                                                                        $candidate_pgia_genls$.setDynamicValue(cons(item_var, $candidate_pgia_genls$.getDynamicValue(thread)), thread);
                                                                                    }
                                                                                }
                                                                            }
                                                                        }
                                                                    }
                                                                } else
                                                                    if (sol.isList()) {
                                                                        SubLObject csome_list_var = sol;
                                                                        SubLObject grand_pa2 = NIL;
                                                                        grand_pa2 = csome_list_var.first();
                                                                        while (NIL != csome_list_var) {
                                                                            final SubLObject grand_pa_nat2 = function_terms.term_of_unit(grand_pa2);
                                                                            if ((NIL != grand_pa_nat2) && $pgia_fn$.getDynamicValue(thread).eql(cycl_utilities.nat_functor(grand_pa_nat2))) {
                                                                                final SubLObject grand_pa_col2 = cycl_utilities.nat_arg(grand_pa_nat2, $pgia_arg$.getDynamicValue(thread), UNPROVIDED);
                                                                                final SubLObject candidate_pgia2 = candidate_pgia(spec_col, grand_pa_col2, $pgia_spec$.getDynamicValue(thread), grand_pa2, $GENLS, UNPROVIDED);
                                                                                if (NIL != candidate_pgia2) {
                                                                                    final SubLObject item_var2 = candidate_pgia2;
                                                                                    if (NIL == member(item_var2, $candidate_pgia_genls$.getDynamicValue(thread), symbol_function(EQUAL), symbol_function(IDENTITY))) {
                                                                                        $candidate_pgia_genls$.setDynamicValue(cons(item_var2, $candidate_pgia_genls$.getDynamicValue(thread)), thread);
                                                                                    }
                                                                                }
                                                                            }
                                                                            csome_list_var = csome_list_var.rest();
                                                                            grand_pa2 = csome_list_var.first();
                                                                        } 
                                                                    } else {
                                                                        Errors.error($str24$_A_is_neither_SET_P_nor_LISTP_, sol);
                                                                    }

                                                            } finally {
                                                                sbhl_link_vars.$sbhl_link_tv$.rebind(_prev_bind_0_$17, thread);
                                                            }
                                                        }
                                                    }
                                                    dictionary_contents.do_dictionary_contents_finalize(iteration_state_$18);
                                                } finally {
                                                    sbhl_link_vars.$sbhl_link_mt$.rebind(_prev_bind_0_$16, thread);
                                                }
                                            }
                                        }
                                        dictionary_contents.do_dictionary_contents_finalize(iteration_state);
                                    }
                                } else {
                                    sbhl_paranoia.sbhl_error(FIVE_INTEGER, $str25$attempting_to_bind_direction_link, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                }
                            } else
                                if (NIL != obsolete.cnat_p(node, UNPROVIDED)) {
                                    SubLObject cdolist_list_var;
                                    final SubLObject new_list = cdolist_list_var = (NIL != sbhl_link_vars.sbhl_randomize_lists_p()) ? list_utilities.randomize_list(sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators(sbhl_module_utilities.get_sbhl_module_forward_direction(sbhl_module_vars.get_sbhl_module($$genls)), sbhl_search_vars.$sbhl_tv$.getDynamicValue(thread), sbhl_module_vars.get_sbhl_module($$genls))) : sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators(sbhl_module_utilities.get_sbhl_module_forward_direction(sbhl_module_vars.get_sbhl_module($$genls)), sbhl_search_vars.$sbhl_tv$.getDynamicValue(thread), sbhl_module_vars.get_sbhl_module($$genls));
                                    SubLObject generating_fn = NIL;
                                    generating_fn = cdolist_list_var.first();
                                    while (NIL != cdolist_list_var) {
                                        final SubLObject _prev_bind_0_$18 = sbhl_link_vars.$sbhl_link_generator$.currentBinding(thread);
                                        try {
                                            sbhl_link_vars.$sbhl_link_generator$.bind(generating_fn, thread);
                                            final SubLObject sol2;
                                            final SubLObject link_nodes2 = sol2 = funcall(generating_fn, node);
                                            if (NIL != set.set_p(sol2)) {
                                                final SubLObject set_contents_var2 = set.do_set_internal(sol2);
                                                SubLObject basis_object2;
                                                SubLObject state2;
                                                SubLObject grand_pa3;
                                                SubLObject grand_pa_nat3;
                                                SubLObject grand_pa_col3;
                                                SubLObject candidate_pgia3;
                                                SubLObject item_var3;
                                                for (basis_object2 = set_contents.do_set_contents_basis_object(set_contents_var2), state2 = NIL, state2 = set_contents.do_set_contents_initial_state(basis_object2, set_contents_var2); NIL == set_contents.do_set_contents_doneP(basis_object2, state2); state2 = set_contents.do_set_contents_update_state(state2)) {
                                                    grand_pa3 = set_contents.do_set_contents_next(basis_object2, state2);
                                                    if (NIL != set_contents.do_set_contents_element_validP(state2, grand_pa3)) {
                                                        grand_pa_nat3 = function_terms.term_of_unit(grand_pa3);
                                                        if ((NIL != grand_pa_nat3) && $pgia_fn$.getDynamicValue(thread).eql(cycl_utilities.nat_functor(grand_pa_nat3))) {
                                                            grand_pa_col3 = cycl_utilities.nat_arg(grand_pa_nat3, $pgia_arg$.getDynamicValue(thread), UNPROVIDED);
                                                            candidate_pgia3 = candidate_pgia(spec_col, grand_pa_col3, $pgia_spec$.getDynamicValue(thread), grand_pa3, $GENLS, UNPROVIDED);
                                                            if (NIL != candidate_pgia3) {
                                                                item_var3 = candidate_pgia3;
                                                                if (NIL == member(item_var3, $candidate_pgia_genls$.getDynamicValue(thread), symbol_function(EQUAL), symbol_function(IDENTITY))) {
                                                                    $candidate_pgia_genls$.setDynamicValue(cons(item_var3, $candidate_pgia_genls$.getDynamicValue(thread)), thread);
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            } else
                                                if (sol2.isList()) {
                                                    SubLObject csome_list_var2 = sol2;
                                                    SubLObject grand_pa4 = NIL;
                                                    grand_pa4 = csome_list_var2.first();
                                                    while (NIL != csome_list_var2) {
                                                        final SubLObject grand_pa_nat4 = function_terms.term_of_unit(grand_pa4);
                                                        if ((NIL != grand_pa_nat4) && $pgia_fn$.getDynamicValue(thread).eql(cycl_utilities.nat_functor(grand_pa_nat4))) {
                                                            final SubLObject grand_pa_col4 = cycl_utilities.nat_arg(grand_pa_nat4, $pgia_arg$.getDynamicValue(thread), UNPROVIDED);
                                                            final SubLObject candidate_pgia4 = candidate_pgia(spec_col, grand_pa_col4, $pgia_spec$.getDynamicValue(thread), grand_pa4, $GENLS, UNPROVIDED);
                                                            if (NIL != candidate_pgia4) {
                                                                final SubLObject item_var4 = candidate_pgia4;
                                                                if (NIL == member(item_var4, $candidate_pgia_genls$.getDynamicValue(thread), symbol_function(EQUAL), symbol_function(IDENTITY))) {
                                                                    $candidate_pgia_genls$.setDynamicValue(cons(item_var4, $candidate_pgia_genls$.getDynamicValue(thread)), thread);
                                                                }
                                                            }
                                                        }
                                                        csome_list_var2 = csome_list_var2.rest();
                                                        grand_pa4 = csome_list_var2.first();
                                                    } 
                                                } else {
                                                    Errors.error($str24$_A_is_neither_SET_P_nor_LISTP_, sol2);
                                                }

                                        } finally {
                                            sbhl_link_vars.$sbhl_link_generator$.rebind(_prev_bind_0_$18, thread);
                                        }
                                        cdolist_list_var = cdolist_list_var.rest();
                                        generating_fn = cdolist_list_var.first();
                                    } 
                                }

                        } finally {
                            sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_0_$15, thread);
                        }
                        final SubLObject genl_col = cycl_utilities.nat_arg($pgia_genl_nat$.getDynamicValue(thread), $pgia_arg$.getDynamicValue(thread), UNPROVIDED);
                        final SubLObject _prev_bind_0_$19 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
                        try {
                            sbhl_module_vars.$sbhl_module$.bind(NIL != sbhl_module_vars.get_sbhl_module($$genls) ? sbhl_module_vars.get_sbhl_module($$genls) : sbhl_module_vars.$sbhl_module$.getDynamicValue(thread), thread);
                            final SubLObject node2 = function_terms.naut_to_nart($pgia_spec$.getDynamicValue(thread));
                            if (NIL != sbhl_link_vars.sbhl_node_object_p(node2)) {
                                final SubLObject d_link2 = sbhl_graphs.get_sbhl_graph_link(node2, sbhl_module_vars.get_sbhl_module($$genls));
                                if (NIL != d_link2) {
                                    final SubLObject mt_links2 = sbhl_links.get_sbhl_mt_links(d_link2, sbhl_module_utilities.get_sbhl_module_backward_direction(sbhl_module_vars.get_sbhl_module($$genls)), sbhl_module_vars.get_sbhl_module($$genls));
                                    if (NIL != mt_links2) {
                                        SubLObject iteration_state2;
                                        for (iteration_state2 = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(mt_links2)); NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state2); iteration_state2 = dictionary_contents.do_dictionary_contents_next(iteration_state2)) {
                                            thread.resetMultipleValues();
                                            final SubLObject mt2 = dictionary_contents.do_dictionary_contents_key_value(iteration_state2);
                                            final SubLObject tv_links2 = thread.secondMultipleValue();
                                            thread.resetMultipleValues();
                                            if (NIL != mt_relevance_macros.relevant_mtP(mt2)) {
                                                final SubLObject _prev_bind_0_$20 = sbhl_link_vars.$sbhl_link_mt$.currentBinding(thread);
                                                try {
                                                    sbhl_link_vars.$sbhl_link_mt$.bind(mt2, thread);
                                                    SubLObject iteration_state_$19;
                                                    for (iteration_state_$19 = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(tv_links2)); NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state_$19); iteration_state_$19 = dictionary_contents.do_dictionary_contents_next(iteration_state_$19)) {
                                                        thread.resetMultipleValues();
                                                        final SubLObject tv2 = dictionary_contents.do_dictionary_contents_key_value(iteration_state_$19);
                                                        final SubLObject link_nodes3 = thread.secondMultipleValue();
                                                        thread.resetMultipleValues();
                                                        if (NIL != sbhl_search_vars.relevant_sbhl_tvP(tv2)) {
                                                            final SubLObject _prev_bind_0_$21 = sbhl_link_vars.$sbhl_link_tv$.currentBinding(thread);
                                                            try {
                                                                sbhl_link_vars.$sbhl_link_tv$.bind(tv2, thread);
                                                                final SubLObject sol3 = link_nodes3;
                                                                if (NIL != set.set_p(sol3)) {
                                                                    final SubLObject set_contents_var3 = set.do_set_internal(sol3);
                                                                    SubLObject basis_object3;
                                                                    SubLObject state3;
                                                                    SubLObject grand_kid;
                                                                    SubLObject grand_kid_nat;
                                                                    SubLObject grand_kid_col;
                                                                    SubLObject candidate_pgia5;
                                                                    SubLObject item_var5;
                                                                    for (basis_object3 = set_contents.do_set_contents_basis_object(set_contents_var3), state3 = NIL, state3 = set_contents.do_set_contents_initial_state(basis_object3, set_contents_var3); NIL == set_contents.do_set_contents_doneP(basis_object3, state3); state3 = set_contents.do_set_contents_update_state(state3)) {
                                                                        grand_kid = set_contents.do_set_contents_next(basis_object3, state3);
                                                                        if (NIL != set_contents.do_set_contents_element_validP(state3, grand_kid)) {
                                                                            grand_kid_nat = function_terms.term_of_unit(grand_kid);
                                                                            if ((NIL != grand_kid_nat) && $pgia_fn$.getDynamicValue(thread).eql(cycl_utilities.nat_functor(grand_kid_nat))) {
                                                                                grand_kid_col = cycl_utilities.nat_arg(grand_kid_nat, $pgia_arg$.getDynamicValue(thread), UNPROVIDED);
                                                                                candidate_pgia5 = candidate_pgia(grand_kid_col, genl_col, grand_kid, $pgia_genl$.getDynamicValue(thread), $SPECS, UNPROVIDED);
                                                                                if (NIL != candidate_pgia5) {
                                                                                    item_var5 = candidate_pgia5;
                                                                                    if (NIL == member(item_var5, $candidate_pgia_specs$.getDynamicValue(thread), symbol_function(EQUAL), symbol_function(IDENTITY))) {
                                                                                        $candidate_pgia_specs$.setDynamicValue(cons(item_var5, $candidate_pgia_specs$.getDynamicValue(thread)), thread);
                                                                                    }
                                                                                }
                                                                            }
                                                                        }
                                                                    }
                                                                } else
                                                                    if (sol3.isList()) {
                                                                        SubLObject csome_list_var3 = sol3;
                                                                        SubLObject grand_kid2 = NIL;
                                                                        grand_kid2 = csome_list_var3.first();
                                                                        while (NIL != csome_list_var3) {
                                                                            final SubLObject grand_kid_nat2 = function_terms.term_of_unit(grand_kid2);
                                                                            if ((NIL != grand_kid_nat2) && $pgia_fn$.getDynamicValue(thread).eql(cycl_utilities.nat_functor(grand_kid_nat2))) {
                                                                                final SubLObject grand_kid_col2 = cycl_utilities.nat_arg(grand_kid_nat2, $pgia_arg$.getDynamicValue(thread), UNPROVIDED);
                                                                                final SubLObject candidate_pgia6 = candidate_pgia(grand_kid_col2, genl_col, grand_kid2, $pgia_genl$.getDynamicValue(thread), $SPECS, UNPROVIDED);
                                                                                if (NIL != candidate_pgia6) {
                                                                                    final SubLObject item_var6 = candidate_pgia6;
                                                                                    if (NIL == member(item_var6, $candidate_pgia_specs$.getDynamicValue(thread), symbol_function(EQUAL), symbol_function(IDENTITY))) {
                                                                                        $candidate_pgia_specs$.setDynamicValue(cons(item_var6, $candidate_pgia_specs$.getDynamicValue(thread)), thread);
                                                                                    }
                                                                                }
                                                                            }
                                                                            csome_list_var3 = csome_list_var3.rest();
                                                                            grand_kid2 = csome_list_var3.first();
                                                                        } 
                                                                    } else {
                                                                        Errors.error($str24$_A_is_neither_SET_P_nor_LISTP_, sol3);
                                                                    }

                                                            } finally {
                                                                sbhl_link_vars.$sbhl_link_tv$.rebind(_prev_bind_0_$21, thread);
                                                            }
                                                        }
                                                    }
                                                    dictionary_contents.do_dictionary_contents_finalize(iteration_state_$19);
                                                } finally {
                                                    sbhl_link_vars.$sbhl_link_mt$.rebind(_prev_bind_0_$20, thread);
                                                }
                                            }
                                        }
                                        dictionary_contents.do_dictionary_contents_finalize(iteration_state2);
                                    }
                                } else {
                                    sbhl_paranoia.sbhl_error(FIVE_INTEGER, $str25$attempting_to_bind_direction_link, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                }
                            } else
                                if (NIL != obsolete.cnat_p(node2, UNPROVIDED)) {
                                    SubLObject cdolist_list_var2;
                                    final SubLObject new_list2 = cdolist_list_var2 = (NIL != sbhl_link_vars.sbhl_randomize_lists_p()) ? list_utilities.randomize_list(sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators(sbhl_module_utilities.get_sbhl_module_backward_direction(sbhl_module_vars.get_sbhl_module($$genls)), sbhl_search_vars.$sbhl_tv$.getDynamicValue(thread), sbhl_module_vars.get_sbhl_module($$genls))) : sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators(sbhl_module_utilities.get_sbhl_module_backward_direction(sbhl_module_vars.get_sbhl_module($$genls)), sbhl_search_vars.$sbhl_tv$.getDynamicValue(thread), sbhl_module_vars.get_sbhl_module($$genls));
                                    SubLObject generating_fn2 = NIL;
                                    generating_fn2 = cdolist_list_var2.first();
                                    while (NIL != cdolist_list_var2) {
                                        final SubLObject _prev_bind_0_$22 = sbhl_link_vars.$sbhl_link_generator$.currentBinding(thread);
                                        try {
                                            sbhl_link_vars.$sbhl_link_generator$.bind(generating_fn2, thread);
                                            final SubLObject sol4;
                                            final SubLObject link_nodes4 = sol4 = funcall(generating_fn2, node2);
                                            if (NIL != set.set_p(sol4)) {
                                                final SubLObject set_contents_var4 = set.do_set_internal(sol4);
                                                SubLObject basis_object4;
                                                SubLObject state4;
                                                SubLObject grand_kid3;
                                                SubLObject grand_kid_nat3;
                                                SubLObject grand_kid_col3;
                                                SubLObject candidate_pgia7;
                                                SubLObject item_var7;
                                                for (basis_object4 = set_contents.do_set_contents_basis_object(set_contents_var4), state4 = NIL, state4 = set_contents.do_set_contents_initial_state(basis_object4, set_contents_var4); NIL == set_contents.do_set_contents_doneP(basis_object4, state4); state4 = set_contents.do_set_contents_update_state(state4)) {
                                                    grand_kid3 = set_contents.do_set_contents_next(basis_object4, state4);
                                                    if (NIL != set_contents.do_set_contents_element_validP(state4, grand_kid3)) {
                                                        grand_kid_nat3 = function_terms.term_of_unit(grand_kid3);
                                                        if ((NIL != grand_kid_nat3) && $pgia_fn$.getDynamicValue(thread).eql(cycl_utilities.nat_functor(grand_kid_nat3))) {
                                                            grand_kid_col3 = cycl_utilities.nat_arg(grand_kid_nat3, $pgia_arg$.getDynamicValue(thread), UNPROVIDED);
                                                            candidate_pgia7 = candidate_pgia(grand_kid_col3, genl_col, grand_kid3, $pgia_genl$.getDynamicValue(thread), $SPECS, UNPROVIDED);
                                                            if (NIL != candidate_pgia7) {
                                                                item_var7 = candidate_pgia7;
                                                                if (NIL == member(item_var7, $candidate_pgia_specs$.getDynamicValue(thread), symbol_function(EQUAL), symbol_function(IDENTITY))) {
                                                                    $candidate_pgia_specs$.setDynamicValue(cons(item_var7, $candidate_pgia_specs$.getDynamicValue(thread)), thread);
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            } else
                                                if (sol4.isList()) {
                                                    SubLObject csome_list_var4 = sol4;
                                                    SubLObject grand_kid4 = NIL;
                                                    grand_kid4 = csome_list_var4.first();
                                                    while (NIL != csome_list_var4) {
                                                        final SubLObject grand_kid_nat4 = function_terms.term_of_unit(grand_kid4);
                                                        if ((NIL != grand_kid_nat4) && $pgia_fn$.getDynamicValue(thread).eql(cycl_utilities.nat_functor(grand_kid_nat4))) {
                                                            final SubLObject grand_kid_col4 = cycl_utilities.nat_arg(grand_kid_nat4, $pgia_arg$.getDynamicValue(thread), UNPROVIDED);
                                                            final SubLObject candidate_pgia8 = candidate_pgia(grand_kid_col4, genl_col, grand_kid4, $pgia_genl$.getDynamicValue(thread), $SPECS, UNPROVIDED);
                                                            if (NIL != candidate_pgia8) {
                                                                final SubLObject item_var8 = candidate_pgia8;
                                                                if (NIL == member(item_var8, $candidate_pgia_specs$.getDynamicValue(thread), symbol_function(EQUAL), symbol_function(IDENTITY))) {
                                                                    $candidate_pgia_specs$.setDynamicValue(cons(item_var8, $candidate_pgia_specs$.getDynamicValue(thread)), thread);
                                                                }
                                                            }
                                                        }
                                                        csome_list_var4 = csome_list_var4.rest();
                                                        grand_kid4 = csome_list_var4.first();
                                                    } 
                                                } else {
                                                    Errors.error($str24$_A_is_neither_SET_P_nor_LISTP_, sol4);
                                                }

                                        } finally {
                                            sbhl_link_vars.$sbhl_link_generator$.rebind(_prev_bind_0_$22, thread);
                                        }
                                        cdolist_list_var2 = cdolist_list_var2.rest();
                                        generating_fn2 = cdolist_list_var2.first();
                                    } 
                                }

                        } finally {
                            sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_0_$19, thread);
                        }
                    } finally {
                        mt_relevance_macros.$mt$.rebind(_prev_bind_1_$15, thread);
                        mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0_$14, thread);
                    }
                }
                final SubLObject _prev_bind_0_$23 = $pgia_col$.currentBinding(thread);
                try {
                    $pgia_col$.bind(cycl_utilities.nat_arg($pgia_spec_nat$.getDynamicValue(thread), $pgia_arg$.getDynamicValue(thread), UNPROVIDED), thread);
                    assert_candidate_pgia_genls();
                } finally {
                    $pgia_col$.rebind(_prev_bind_0_$23, thread);
                }
                final SubLObject _prev_bind_0_$24 = $pgia_col$.currentBinding(thread);
                try {
                    $pgia_col$.bind(cycl_utilities.nat_arg($pgia_genl_nat$.getDynamicValue(thread), $pgia_arg$.getDynamicValue(thread), UNPROVIDED), thread);
                    assert_candidate_pgia_specs();
                } finally {
                    $pgia_col$.rebind(_prev_bind_0_$24, thread);
                }
            } finally {
                $candidate_pgia_specs$.rebind(_prev_bind_4, thread);
                $candidate_pgia_genls$.rebind(_prev_bind_3, thread);
                $pgia_gaf$.rebind(_prev_bind_2, thread);
                $pgia_arg$.rebind(_prev_bind_0, thread);
            }
        }
        return NIL;
    }

    public static SubLObject candidate_pgia(final SubLObject spec_col, final SubLObject genl_col, final SubLObject spec_nat_constant, final SubLObject genl_nat_constant, final SubLObject rel, SubLObject arg) {
        if (arg == UNPROVIDED) {
            arg = $pgia_arg$.getDynamicValue();
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject candidate = NIL;
        if (NIL != genls.genlsP(spec_col, genl_col, UNPROVIDED, UNPROVIDED)) {
            SubLObject cdolist_list_var = pgia_true_in_mts(spec_nat_constant, genl_nat_constant, arg);
            SubLObject mt = NIL;
            mt = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
                try {
                    mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_EQ, thread);
                    mt_relevance_macros.$mt$.bind(mt, thread);
                    final SubLObject gaf = list($$genls, spec_nat_constant, genl_nat_constant);
                    SubLObject support_col = NIL;
                    if (rel.eql($GENLS)) {
                        support_col = genl_col;
                    } else
                        if (rel.eql($SPECS)) {
                            support_col = spec_col;
                        }

                    if (NIL != support_col) {
                        candidate = list(gaf, support_col, mt);
                    }
                } finally {
                    mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
                    mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
                }
                cdolist_list_var = cdolist_list_var.rest();
                mt = cdolist_list_var.first();
            } 
        }
        return candidate;
    }

    public static SubLObject pgia_true_in_mts(final SubLObject spec_nat_constant, final SubLObject genl_nat_constant, final SubLObject arg) {
        final SubLObject spec_nat = function_terms.term_of_unit(spec_nat_constant);
        final SubLObject genl_nat = function_terms.term_of_unit(genl_nat_constant);
        final SubLObject pgai_mts = kb_indexing.gaf_mts(list($$preservesGenlsInArg, cycl_utilities.nat_functor(spec_nat), arg));
        final SubLObject genls_mts = genls.min_mts_of_genls_paths(cycl_utilities.nat_arg(spec_nat, arg, UNPROVIDED), cycl_utilities.nat_arg(genl_nat, arg, UNPROVIDED), UNPROVIDED);
        SubLObject mt_sets = NIL;
        SubLObject mts = NIL;
        SubLObject cdolist_list_var = pgai_mts;
        SubLObject pgai_mt = NIL;
        pgai_mt = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            SubLObject cdolist_list_var_$28 = genls_mts;
            SubLObject genls_mt_set = NIL;
            genls_mt_set = cdolist_list_var_$28.first();
            while (NIL != cdolist_list_var_$28) {
                final SubLObject item_var = pgai_mt;
                if (NIL == member(item_var, genls_mt_set, symbol_function(EQL), symbol_function(IDENTITY))) {
                    genls_mt_set = cons(item_var, genls_mt_set);
                }
                mt_sets = cons(genls_mt_set, mt_sets);
                cdolist_list_var_$28 = cdolist_list_var_$28.rest();
                genls_mt_set = cdolist_list_var_$28.first();
            } 
            cdolist_list_var = cdolist_list_var.rest();
            pgai_mt = cdolist_list_var.first();
        } 
        mts = genl_mts.max_floor_mts_from_mt_sets(mt_sets);
        return mts;
    }

    public static SubLObject recompute_functor_pgia(final SubLObject functor) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != $pgia_activeP$.getDynamicValue(thread)) {
            if (NIL != term.hl_ground_nautP(functor)) {
                return recompute_functor_pgia(narts_high.find_nart(functor));
            }
            if (NIL != forts.fort_p(functor)) {
                final SubLObject _prev_bind_0 = $pgia_fn$.currentBinding(thread);
                final SubLObject _prev_bind_2 = $consider_current_pgiaP$.currentBinding(thread);
                try {
                    $pgia_fn$.bind(functor, thread);
                    $consider_current_pgiaP$.bind(T, thread);
                    kb_mapping.map_gaf_arg_index(symbol_function(RECOMPUTE_FUNCTOR_PGIA_1), $pgia_fn$.getDynamicValue(thread), ONE_INTEGER, $$preservesGenlsInArg, $TRUE, UNPROVIDED);
                } finally {
                    $consider_current_pgiaP$.rebind(_prev_bind_2, thread);
                    $pgia_fn$.rebind(_prev_bind_0, thread);
                }
            }
        }
        return NIL;
    }

    public static SubLObject recompute_functor_pgia_1(final SubLObject assertion) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != assertion_handles.assertion_p(assertion)) {
            final SubLObject _prev_bind_0 = $pgia_gaf$.currentBinding(thread);
            final SubLObject _prev_bind_2 = $pgia_arg$.currentBinding(thread);
            try {
                $pgia_gaf$.bind(assertion, thread);
                $pgia_arg$.bind(assertions_high.gaf_arg2(assertion), thread);
                if ($pgia_arg$.getDynamicValue(thread).isInteger()) {
                    final SubLObject pgia_mt = assertions_high.assertion_mt(assertion);
                    final SubLObject _prev_bind_0_$29 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                    final SubLObject _prev_bind_1_$30 = mt_relevance_macros.$mt$.currentBinding(thread);
                    try {
                        mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_GENL_MT, thread);
                        mt_relevance_macros.$mt$.bind(pgia_mt, thread);
                        if (arity.arity($pgia_fn$.getDynamicValue(thread)).numGE($pgia_arg$.getDynamicValue(thread)) || (NIL != arity.variable_arityP($pgia_fn$.getDynamicValue(thread)))) {
                            kb_mapping.map_function_extent_index(symbol_function(PGIA_AFTER_ADDING_PGIA_1), $pgia_fn$.getDynamicValue(thread));
                        }
                    } finally {
                        mt_relevance_macros.$mt$.rebind(_prev_bind_1_$30, thread);
                        mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0_$29, thread);
                    }
                }
            } finally {
                $pgia_arg$.rebind(_prev_bind_2, thread);
                $pgia_gaf$.rebind(_prev_bind_0, thread);
            }
        }
        return NIL;
    }

    public static SubLObject recompute_nat_pgia(final SubLObject nat) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != $pgia_activeP$.getDynamicValue(thread)) {
            if (NIL != term.hl_ground_nautP(nat)) {
                return recompute_nat_pgia(narts_high.find_nart(nat));
            }
            if (NIL != forts.fort_p(nat)) {
                final SubLObject _prev_bind_0 = $pgia_nat_fort$.currentBinding(thread);
                final SubLObject _prev_bind_2 = $pgia_nat$.currentBinding(thread);
                final SubLObject _prev_bind_3 = $pgia_fn$.currentBinding(thread);
                final SubLObject _prev_bind_4 = $consider_current_pgiaP$.currentBinding(thread);
                try {
                    $pgia_nat_fort$.bind(nat, thread);
                    $pgia_nat$.bind(function_terms.term_of_unit(nat), thread);
                    $pgia_fn$.bind(cycl_utilities.nat_functor($pgia_nat$.getDynamicValue(thread)), thread);
                    $consider_current_pgiaP$.bind(T, thread);
                    kb_mapping.map_gaf_arg_index(symbol_function(RECOMPUTE_NAT_PGIA_1), $pgia_fn$.getDynamicValue(thread), ONE_INTEGER, $$preservesGenlsInArg, $TRUE, UNPROVIDED);
                } finally {
                    $consider_current_pgiaP$.rebind(_prev_bind_4, thread);
                    $pgia_fn$.rebind(_prev_bind_3, thread);
                    $pgia_nat$.rebind(_prev_bind_2, thread);
                    $pgia_nat_fort$.rebind(_prev_bind_0, thread);
                }
            }
        }
        return NIL;
    }

    public static SubLObject recompute_nat_pgia_1(final SubLObject assertion) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != assertion_handles.assertion_p(assertion)) {
            final SubLObject _prev_bind_0 = $pgia_arg$.currentBinding(thread);
            try {
                $pgia_arg$.bind(assertions_high.gaf_arg2(assertion), thread);
                if ($pgia_arg$.getDynamicValue(thread).isInteger()) {
                    final SubLObject _prev_bind_0_$31 = $pgia_col$.currentBinding(thread);
                    final SubLObject _prev_bind_2 = $pgia_gaf$.currentBinding(thread);
                    final SubLObject _prev_bind_3 = $current_pgia_genls$.currentBinding(thread);
                    final SubLObject _prev_bind_4 = $current_pgia_specs$.currentBinding(thread);
                    final SubLObject _prev_bind_5 = $candidate_pgia_genls$.currentBinding(thread);
                    final SubLObject _prev_bind_6 = $candidate_pgia_specs$.currentBinding(thread);
                    try {
                        $pgia_col$.bind(cycl_utilities.nat_arg($pgia_nat$.getDynamicValue(thread), $pgia_arg$.getDynamicValue(thread), UNPROVIDED), thread);
                        $pgia_gaf$.bind(assertion, thread);
                        $current_pgia_genls$.bind(current_pgia_genls($pgia_nat_fort$.getDynamicValue(thread), $pgia_arg$.getDynamicValue(thread)), thread);
                        $current_pgia_specs$.bind(current_pgia_specs($pgia_nat_fort$.getDynamicValue(thread), $pgia_arg$.getDynamicValue(thread)), thread);
                        $candidate_pgia_genls$.bind(NIL, thread);
                        $candidate_pgia_specs$.bind(NIL, thread);
                        kb_mapping.map_function_extent_index(symbol_function(PGIA_AFTER_ADDING_ISA_2), $pgia_fn$.getDynamicValue(thread));
                        assert_candidate_pgia_genls();
                        assert_candidate_pgia_specs();
                    } finally {
                        $candidate_pgia_specs$.rebind(_prev_bind_6, thread);
                        $candidate_pgia_genls$.rebind(_prev_bind_5, thread);
                        $current_pgia_specs$.rebind(_prev_bind_4, thread);
                        $current_pgia_genls$.rebind(_prev_bind_3, thread);
                        $pgia_gaf$.rebind(_prev_bind_2, thread);
                        $pgia_col$.rebind(_prev_bind_0_$31, thread);
                    }
                }
            } finally {
                $pgia_arg$.rebind(_prev_bind_0, thread);
            }
        }
        return NIL;
    }

    public static SubLObject current_pgia_specs(final SubLObject nat_constant, final SubLObject arg) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != $consider_current_pgiaP$.getDynamicValue(thread)) {
            SubLObject specs = NIL;
            final SubLObject _prev_bind_0 = $mapping_gather_arg$.currentBinding(thread);
            final SubLObject _prev_bind_2 = $pgia_arg$.currentBinding(thread);
            final SubLObject _prev_bind_3 = $mapping_answer$.currentBinding(thread);
            try {
                $mapping_gather_arg$.bind(ONE_INTEGER, thread);
                $pgia_arg$.bind(arg, thread);
                $mapping_answer$.bind(NIL, thread);
                kb_mapping.map_gaf_arg_index(symbol_function(GATHER_PGIA), nat_constant, TWO_INTEGER, $$genls, UNPROVIDED, UNPROVIDED);
                specs = $mapping_answer$.getDynamicValue(thread);
            } finally {
                $mapping_answer$.rebind(_prev_bind_3, thread);
                $pgia_arg$.rebind(_prev_bind_2, thread);
                $mapping_gather_arg$.rebind(_prev_bind_0, thread);
            }
            return specs;
        }
        return NIL;
    }

    public static SubLObject current_pgia_genls(final SubLObject nat_constant, final SubLObject arg) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != $consider_current_pgiaP$.getDynamicValue(thread)) {
            SubLObject v_genls = NIL;
            final SubLObject _prev_bind_0 = $mapping_gather_arg$.currentBinding(thread);
            final SubLObject _prev_bind_2 = $pgia_arg$.currentBinding(thread);
            final SubLObject _prev_bind_3 = $mapping_answer$.currentBinding(thread);
            try {
                $mapping_gather_arg$.bind(TWO_INTEGER, thread);
                $pgia_arg$.bind(arg, thread);
                $mapping_answer$.bind(NIL, thread);
                kb_mapping.map_gaf_arg_index(symbol_function(GATHER_PGIA), nat_constant, ONE_INTEGER, $$genls, UNPROVIDED, UNPROVIDED);
                v_genls = $mapping_answer$.getDynamicValue(thread);
            } finally {
                $mapping_answer$.rebind(_prev_bind_3, thread);
                $pgia_arg$.rebind(_prev_bind_2, thread);
                $mapping_gather_arg$.rebind(_prev_bind_0, thread);
            }
            return v_genls;
        }
        return NIL;
    }

    public static SubLObject gather_pgia(final SubLObject assertion) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != pgia_assertionP(assertion, $pgia_arg$.getDynamicValue(thread))) {
            final SubLObject pgia_nat = assertions_high.gaf_arg(assertion, $mapping_gather_arg$.getDynamicValue(thread));
            final SubLObject pgia_col = cycl_utilities.nat_arg(pgia_nat, $pgia_arg$.getDynamicValue(thread), UNPROVIDED);
            $mapping_answer$.setDynamicValue(cons(list(pgia_nat, pgia_col, assertions_high.assertion_mt(assertion)), $mapping_answer$.getDynamicValue(thread)), thread);
        }
        return NIL;
    }

    public static SubLObject pgia_assertionP(final SubLObject assertion, SubLObject arg) {
        if (arg == UNPROVIDED) {
            arg = NIL;
        }
        SubLObject pgiaP = NIL;
        if (NIL == pgiaP) {
            SubLObject csome_list_var;
            SubLObject argument;
            for (csome_list_var = assertions_high.assertion_arguments(assertion), argument = NIL, argument = csome_list_var.first(); (NIL == pgiaP) && (NIL != csome_list_var); pgiaP = pgia_deductionP(argument, arg) , csome_list_var = csome_list_var.rest() , argument = csome_list_var.first()) {
            }
        }
        return pgiaP;
    }

    public static SubLObject pgia_supportP(final SubLObject support) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return makeBoolean((support.isCons() && (support.first() == $CODE)) && second(support).equal($pgia_rule$.getDynamicValue(thread)));
    }

    public static SubLObject pgia_deductionP(final SubLObject deduction, SubLObject arg) {
        if (arg == UNPROVIDED) {
            arg = NIL;
        }
        if (NIL != deduction_handles.deduction_p(deduction)) {
            SubLObject pgiaP = NIL;
            SubLObject arg_okP = sublisp_null(arg);
            if (NIL == pgiaP) {
                SubLObject csome_list_var;
                SubLObject support;
                for (csome_list_var = deductions_high.deduction_supports(deduction), support = NIL, support = csome_list_var.first(); (NIL == pgiaP) && (NIL != csome_list_var); pgiaP = pgia_supportP(support) , csome_list_var = csome_list_var.rest() , support = csome_list_var.first()) {
                }
            }
            if (NIL != pgiaP) {
                SubLObject doneP = arg_okP;
                if (NIL == doneP) {
                    SubLObject csome_list_var2 = deductions_high.deduction_supports(deduction);
                    SubLObject support2 = NIL;
                    support2 = csome_list_var2.first();
                    while ((NIL == doneP) && (NIL != csome_list_var2)) {
                        if ((NIL != assertions_high.gaf_assertionP(support2)) && $$preservesGenlsInArg.eql(assertions_high.gaf_arg0(support2))) {
                            arg_okP = eq(arg, assertions_high.gaf_arg2(support2));
                            doneP = T;
                        }
                        csome_list_var2 = csome_list_var2.rest();
                        support2 = csome_list_var2.first();
                    } 
                }
            }
            return makeBoolean((NIL != pgiaP) && (NIL != arg_okP));
        }
        return NIL;
    }

    public static SubLObject assert_candidate_pgia_genls() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject pgia_genls = NIL;
        SubLObject new_pgia_genls = NIL;
        SubLObject pgia_mts = NIL;
        SubLObject mt_genls = NIL;
        SubLObject cdolist_list_var = $candidate_pgia_genls$.getDynamicValue(thread);
        SubLObject candidate = NIL;
        candidate = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if (NIL == known_pgiaP(candidate, $current_pgia_genls$.getDynamicValue(thread), $GENLS)) {
                final SubLObject item_var = second(candidate);
                if (NIL == member(item_var, new_pgia_genls, symbol_function(EQL), symbol_function(IDENTITY))) {
                    new_pgia_genls = cons(item_var, new_pgia_genls);
                }
            }
            SubLObject item_var = second(candidate);
            if (NIL == member(item_var, pgia_genls, symbol_function(EQL), symbol_function(IDENTITY))) {
                pgia_genls = cons(item_var, pgia_genls);
            }
            item_var = third(candidate);
            if (NIL == member(item_var, pgia_mts, symbol_function(EQL), symbol_function(IDENTITY))) {
                pgia_mts = cons(item_var, pgia_mts);
            }
            cdolist_list_var = cdolist_list_var.rest();
            candidate = cdolist_list_var.first();
        } 
        cdolist_list_var = $current_pgia_genls$.getDynamicValue(thread);
        SubLObject current = NIL;
        current = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            SubLObject item_var = second(current);
            if (NIL == member(item_var, pgia_genls, symbol_function(EQL), symbol_function(IDENTITY))) {
                pgia_genls = cons(item_var, pgia_genls);
            }
            item_var = third(current);
            if (NIL == member(item_var, pgia_mts, symbol_function(EQL), symbol_function(IDENTITY))) {
                pgia_mts = cons(item_var, pgia_mts);
            }
            cdolist_list_var = cdolist_list_var.rest();
            current = cdolist_list_var.first();
        } 
        cdolist_list_var = pgia_mts;
        SubLObject pgia_mt = NIL;
        pgia_mt = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            mt_genls = genls.min_cols(pgia_genls, pgia_mt, UNPROVIDED);
            SubLObject cdolist_list_var_$32 = $candidate_pgia_genls$.getDynamicValue(thread);
            SubLObject candidate2 = NIL;
            candidate2 = cdolist_list_var_$32.first();
            while (NIL != cdolist_list_var_$32) {
                SubLObject current2;
                final SubLObject datum = current2 = candidate2;
                SubLObject gaf = NIL;
                SubLObject genl_col = NIL;
                SubLObject mt = NIL;
                destructuring_bind_must_consp(current2, datum, $list31);
                gaf = current2.first();
                current2 = current2.rest();
                destructuring_bind_must_consp(current2, datum, $list31);
                genl_col = current2.first();
                current2 = current2.rest();
                destructuring_bind_must_consp(current2, datum, $list31);
                mt = current2.first();
                current2 = current2.rest();
                if (NIL == current2) {
                    if ((pgia_mt.eql(mt) && (NIL != subl_promotions.memberP(genl_col, mt_genls, UNPROVIDED, UNPROVIDED))) && (NIL != subl_promotions.memberP(genl_col, new_pgia_genls, UNPROVIDED, UNPROVIDED))) {
                        fi.fi_add_argument_int(gaf, mt, list($pgia_gaf$.getDynamicValue(thread), listS($GENLS, list($$genls, $pgia_col$.getDynamicValue(thread), genl_col), mt, $list32), fi.make_el_support($CODE, copy_tree($pgia_rule$.getDynamicValue(thread)), $pgia_mt$.getGlobalValue(), $DEFAULT)), UNPROVIDED, UNPROVIDED);
                    }
                } else {
                    cdestructuring_bind_error(datum, $list31);
                }
                cdolist_list_var_$32 = cdolist_list_var_$32.rest();
                candidate2 = cdolist_list_var_$32.first();
            } 
            SubLObject cdolist_list_var_$33 = $current_pgia_genls$.getDynamicValue(thread);
            SubLObject current3 = NIL;
            current3 = cdolist_list_var_$33.first();
            while (NIL != cdolist_list_var_$33) {
                SubLObject current_$34;
                final SubLObject datum = current_$34 = current3;
                SubLObject genl_nat = NIL;
                SubLObject genl_col = NIL;
                SubLObject mt = NIL;
                destructuring_bind_must_consp(current_$34, datum, $list34);
                genl_nat = current_$34.first();
                current_$34 = current_$34.rest();
                destructuring_bind_must_consp(current_$34, datum, $list34);
                genl_col = current_$34.first();
                current_$34 = current_$34.rest();
                destructuring_bind_must_consp(current_$34, datum, $list34);
                mt = current_$34.first();
                current_$34 = current_$34.rest();
                if (NIL == current_$34) {
                    if (pgia_mt.eql(mt) && (NIL == subl_promotions.memberP(genl_col, mt_genls, UNPROVIDED, UNPROVIDED))) {
                        final SubLObject _prev_bind_0 = $pgia_activeP$.currentBinding(thread);
                        try {
                            $pgia_activeP$.bind(NIL, thread);
                            final SubLObject gaf2 = list($$genls, $pgia_nat_fort$.getDynamicValue(thread), genl_nat);
                            fi.fi_remove_argument_int(gaf2, mt, list($pgia_gaf$.getDynamicValue(thread), listS($GENLS, list($$genls, $pgia_col$.getDynamicValue(thread), genl_col), mt, $list32), fi.make_el_support($CODE, copy_tree($pgia_rule$.getDynamicValue(thread)), $pgia_mt$.getGlobalValue(), $DEFAULT)), UNPROVIDED);
                        } finally {
                            $pgia_activeP$.rebind(_prev_bind_0, thread);
                        }
                    }
                } else {
                    cdestructuring_bind_error(datum, $list34);
                }
                cdolist_list_var_$33 = cdolist_list_var_$33.rest();
                current3 = cdolist_list_var_$33.first();
            } 
            cdolist_list_var = cdolist_list_var.rest();
            pgia_mt = cdolist_list_var.first();
        } 
        return NIL;
    }

    public static SubLObject assert_candidate_pgia_specs() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject pgia_specs = NIL;
        SubLObject new_pgia_specs = NIL;
        SubLObject pgia_mts = NIL;
        SubLObject mt_specs = NIL;
        SubLObject cdolist_list_var = $candidate_pgia_specs$.getDynamicValue(thread);
        SubLObject candidate = NIL;
        candidate = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if (NIL == known_pgiaP(candidate, $current_pgia_specs$.getDynamicValue(thread), $SPECS)) {
                final SubLObject item_var = second(candidate);
                if (NIL == member(item_var, new_pgia_specs, symbol_function(EQL), symbol_function(IDENTITY))) {
                    new_pgia_specs = cons(item_var, new_pgia_specs);
                }
            }
            SubLObject item_var = second(candidate);
            if (NIL == member(item_var, pgia_specs, symbol_function(EQL), symbol_function(IDENTITY))) {
                pgia_specs = cons(item_var, pgia_specs);
            }
            item_var = third(candidate);
            if (NIL == member(item_var, pgia_mts, symbol_function(EQL), symbol_function(IDENTITY))) {
                pgia_mts = cons(item_var, pgia_mts);
            }
            cdolist_list_var = cdolist_list_var.rest();
            candidate = cdolist_list_var.first();
        } 
        cdolist_list_var = $current_pgia_specs$.getDynamicValue(thread);
        SubLObject current = NIL;
        current = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            SubLObject item_var = second(current);
            if (NIL == member(item_var, pgia_specs, symbol_function(EQL), symbol_function(IDENTITY))) {
                pgia_specs = cons(item_var, pgia_specs);
            }
            item_var = third(current);
            if (NIL == member(item_var, pgia_mts, symbol_function(EQL), symbol_function(IDENTITY))) {
                pgia_mts = cons(item_var, pgia_mts);
            }
            cdolist_list_var = cdolist_list_var.rest();
            current = cdolist_list_var.first();
        } 
        cdolist_list_var = pgia_mts;
        SubLObject pgia_mt = NIL;
        pgia_mt = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            mt_specs = genls.max_cols(pgia_specs, pgia_mt, UNPROVIDED);
            SubLObject cdolist_list_var_$35 = $candidate_pgia_specs$.getDynamicValue(thread);
            SubLObject candidate2 = NIL;
            candidate2 = cdolist_list_var_$35.first();
            while (NIL != cdolist_list_var_$35) {
                SubLObject current2;
                final SubLObject datum = current2 = candidate2;
                SubLObject gaf = NIL;
                SubLObject spec_col = NIL;
                SubLObject mt = NIL;
                destructuring_bind_must_consp(current2, datum, $list35);
                gaf = current2.first();
                current2 = current2.rest();
                destructuring_bind_must_consp(current2, datum, $list35);
                spec_col = current2.first();
                current2 = current2.rest();
                destructuring_bind_must_consp(current2, datum, $list35);
                mt = current2.first();
                current2 = current2.rest();
                if (NIL == current2) {
                    if ((pgia_mt.eql(mt) && (NIL != subl_promotions.memberP(spec_col, mt_specs, UNPROVIDED, UNPROVIDED))) && (NIL != subl_promotions.memberP(spec_col, new_pgia_specs, UNPROVIDED, UNPROVIDED))) {
                        fi.fi_add_argument_int(gaf, mt, list($pgia_gaf$.getDynamicValue(thread), listS($GENLS, list($$genls, spec_col, $pgia_col$.getDynamicValue(thread)), mt, $list32), fi.make_el_support($CODE, copy_tree($pgia_rule$.getDynamicValue(thread)), $pgia_mt$.getGlobalValue(), $DEFAULT)), UNPROVIDED, UNPROVIDED);
                    }
                } else {
                    cdestructuring_bind_error(datum, $list35);
                }
                cdolist_list_var_$35 = cdolist_list_var_$35.rest();
                candidate2 = cdolist_list_var_$35.first();
            } 
            SubLObject cdolist_list_var_$36 = $current_pgia_specs$.getDynamicValue(thread);
            SubLObject current3 = NIL;
            current3 = cdolist_list_var_$36.first();
            while (NIL != cdolist_list_var_$36) {
                SubLObject current_$37;
                final SubLObject datum = current_$37 = current3;
                SubLObject spec_nat = NIL;
                SubLObject spec_col = NIL;
                SubLObject mt = NIL;
                destructuring_bind_must_consp(current_$37, datum, $list36);
                spec_nat = current_$37.first();
                current_$37 = current_$37.rest();
                destructuring_bind_must_consp(current_$37, datum, $list36);
                spec_col = current_$37.first();
                current_$37 = current_$37.rest();
                destructuring_bind_must_consp(current_$37, datum, $list36);
                mt = current_$37.first();
                current_$37 = current_$37.rest();
                if (NIL == current_$37) {
                    if (pgia_mt.eql(mt) && (NIL == subl_promotions.memberP(spec_col, mt_specs, UNPROVIDED, UNPROVIDED))) {
                        final SubLObject _prev_bind_0 = $pgia_activeP$.currentBinding(thread);
                        try {
                            $pgia_activeP$.bind(NIL, thread);
                            final SubLObject gaf2 = list($$genls, spec_nat, $pgia_nat_fort$.getDynamicValue(thread));
                            fi.fi_remove_argument_int(gaf2, mt, list($pgia_gaf$.getDynamicValue(thread), listS($GENLS, list($$genls, cycl_utilities.nat_arg(spec_nat, $pgia_arg$.getDynamicValue(thread), UNPROVIDED), $pgia_col$.getDynamicValue(thread)), mt, $list32), fi.make_el_support($CODE, copy_tree($pgia_rule$.getDynamicValue(thread)), $pgia_mt$.getGlobalValue(), $DEFAULT)), UNPROVIDED);
                        } finally {
                            $pgia_activeP$.rebind(_prev_bind_0, thread);
                        }
                    }
                } else {
                    cdestructuring_bind_error(datum, $list36);
                }
                cdolist_list_var_$36 = cdolist_list_var_$36.rest();
                current3 = cdolist_list_var_$36.first();
            } 
            cdolist_list_var = cdolist_list_var.rest();
            pgia_mt = cdolist_list_var.first();
        } 
        return NIL;
    }

    public static SubLObject known_pgiaP(final SubLObject candidate, final SubLObject asserted, final SubLObject rel) {
        if (NIL != asserted) {
            SubLObject foundP = NIL;
            SubLObject gaf = NIL;
            SubLObject col = NIL;
            SubLObject mt = NIL;
            destructuring_bind_must_consp(candidate, candidate, $list37);
            gaf = candidate.first();
            SubLObject current = candidate.rest();
            destructuring_bind_must_consp(current, candidate, $list37);
            col = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, candidate, $list37);
            mt = current.first();
            current = current.rest();
            if (NIL == current) {
                SubLObject current_$39;
                final SubLObject datum_$38 = current_$39 = gaf;
                SubLObject pred = NIL;
                SubLObject spec = NIL;
                SubLObject genl = NIL;
                destructuring_bind_must_consp(current_$39, datum_$38, $list38);
                pred = current_$39.first();
                current_$39 = current_$39.rest();
                destructuring_bind_must_consp(current_$39, datum_$38, $list38);
                spec = current_$39.first();
                current_$39 = current_$39.rest();
                destructuring_bind_must_consp(current_$39, datum_$38, $list38);
                genl = current_$39.first();
                current_$39 = current_$39.rest();
                if (NIL == current_$39) {
                    if (NIL == foundP) {
                        SubLObject csome_list_var = asserted;
                        SubLObject natXcolXmt = NIL;
                        natXcolXmt = csome_list_var.first();
                        while ((NIL == foundP) && (NIL != csome_list_var)) {
                            SubLObject current_$40;
                            final SubLObject datum_$39 = current_$40 = natXcolXmt;
                            SubLObject known_nat = NIL;
                            SubLObject known_col = NIL;
                            SubLObject known_mt = NIL;
                            destructuring_bind_must_consp(current_$40, datum_$39, $list39);
                            known_nat = current_$40.first();
                            current_$40 = current_$40.rest();
                            destructuring_bind_must_consp(current_$40, datum_$39, $list39);
                            known_col = current_$40.first();
                            current_$40 = current_$40.rest();
                            destructuring_bind_must_consp(current_$40, datum_$39, $list39);
                            known_mt = current_$40.first();
                            current_$40 = current_$40.rest();
                            if (NIL == current_$40) {
                                if (mt.eql(known_mt)) {
                                    if (rel.eql($GENLS)) {
                                        foundP = eq(spec, known_nat);
                                    } else
                                        if (rel.eql($SPECS)) {
                                            foundP = eq(genl, known_nat);
                                        }

                                }
                            } else {
                                cdestructuring_bind_error(datum_$39, $list39);
                            }
                            csome_list_var = csome_list_var.rest();
                            natXcolXmt = csome_list_var.first();
                        } 
                    }
                } else {
                    cdestructuring_bind_error(datum_$38, $list38);
                }
            } else {
                cdestructuring_bind_error(candidate, $list37);
            }
            return foundP;
        }
        return NIL;
    }

    public static SubLObject candidate_pgiaP(final SubLObject asserted, final SubLObject candidates, final SubLObject rel) {
        SubLObject foundP = NIL;
        SubLObject known_nat = NIL;
        SubLObject known_mt = NIL;
        destructuring_bind_must_consp(asserted, asserted, $list40);
        known_nat = asserted.first();
        SubLObject current = asserted.rest();
        destructuring_bind_must_consp(current, asserted, $list40);
        known_mt = current.first();
        current = current.rest();
        if (NIL == current) {
            if (NIL == foundP) {
                SubLObject csome_list_var = candidates;
                SubLObject candidate = NIL;
                candidate = csome_list_var.first();
                while ((NIL == foundP) && (NIL != csome_list_var)) {
                    SubLObject current_$43;
                    final SubLObject datum_$42 = current_$43 = candidate;
                    SubLObject gaf = NIL;
                    SubLObject col = NIL;
                    SubLObject mt = NIL;
                    destructuring_bind_must_consp(current_$43, datum_$42, $list37);
                    gaf = current_$43.first();
                    current_$43 = current_$43.rest();
                    destructuring_bind_must_consp(current_$43, datum_$42, $list37);
                    col = current_$43.first();
                    current_$43 = current_$43.rest();
                    destructuring_bind_must_consp(current_$43, datum_$42, $list37);
                    mt = current_$43.first();
                    current_$43 = current_$43.rest();
                    if (NIL == current_$43) {
                        if (mt.eql(known_mt)) {
                            SubLObject current_$44;
                            final SubLObject datum_$43 = current_$44 = gaf;
                            SubLObject pred = NIL;
                            SubLObject spec = NIL;
                            SubLObject genl = NIL;
                            destructuring_bind_must_consp(current_$44, datum_$43, $list38);
                            pred = current_$44.first();
                            current_$44 = current_$44.rest();
                            destructuring_bind_must_consp(current_$44, datum_$43, $list38);
                            spec = current_$44.first();
                            current_$44 = current_$44.rest();
                            destructuring_bind_must_consp(current_$44, datum_$43, $list38);
                            genl = current_$44.first();
                            current_$44 = current_$44.rest();
                            if (NIL == current_$44) {
                                if (rel.eql($GENLS)) {
                                    foundP = eq(spec, known_nat);
                                } else
                                    if (rel.eql($SPECS)) {
                                        foundP = eq(genl, known_nat);
                                    }

                            } else {
                                cdestructuring_bind_error(datum_$43, $list38);
                            }
                        }
                    } else {
                        cdestructuring_bind_error(datum_$42, $list37);
                    }
                    csome_list_var = csome_list_var.rest();
                    candidate = csome_list_var.first();
                } 
            }
        } else {
            cdestructuring_bind_error(asserted, $list40);
        }
        return foundP;
    }

    public static SubLObject map_tous_of_fn_arg(final SubLObject function, final SubLObject v_term, final SubLObject arg, final SubLObject nat_fn) {
        return kb_mapping.map_nart_arg_index(function, v_term, arg, nat_fn);
    }

    public static SubLObject declare_preserves_genls_in_arg_file() {
        declareFunction(me, "pgia_after_adding_pgia", "PGIA-AFTER-ADDING-PGIA", 2, 0, false);
        declareFunction(me, "pgia_after_adding_pgia_1", "PGIA-AFTER-ADDING-PGIA-1", 1, 0, false);
        declareFunction(me, "pgia_after_adding_pgia_2", "PGIA-AFTER-ADDING-PGIA-2", 1, 0, false);
        declareFunction(me, "pgia_after_adding_pgia_3", "PGIA-AFTER-ADDING-PGIA-3", 1, 0, false);
        declareFunction(me, "pgia_after_adding_isa", "PGIA-AFTER-ADDING-ISA", 2, 0, false);
        new preserves_genls_in_arg.$pgia_after_adding_isa$BinaryFunction();
        declareFunction(me, "pgia_after_adding_isa_1", "PGIA-AFTER-ADDING-ISA-1", 1, 0, false);
        declareFunction(me, "pgia_after_adding_isa_2", "PGIA-AFTER-ADDING-ISA-2", 1, 0, false);
        declareFunction(me, "pgia_after_removing_genls", "PGIA-AFTER-REMOVING-GENLS", 2, 0, false);
        declareFunction(me, "pgia_after_removing_genls_1", "PGIA-AFTER-REMOVING-GENLS-1", 1, 0, false);
        declareFunction(me, "candidate_pgia", "CANDIDATE-PGIA", 5, 1, false);
        declareFunction(me, "pgia_true_in_mts", "PGIA-TRUE-IN-MTS", 3, 0, false);
        declareFunction(me, "recompute_functor_pgia", "RECOMPUTE-FUNCTOR-PGIA", 1, 0, false);
        declareFunction(me, "recompute_functor_pgia_1", "RECOMPUTE-FUNCTOR-PGIA-1", 1, 0, false);
        declareFunction(me, "recompute_nat_pgia", "RECOMPUTE-NAT-PGIA", 1, 0, false);
        declareFunction(me, "recompute_nat_pgia_1", "RECOMPUTE-NAT-PGIA-1", 1, 0, false);
        declareFunction(me, "current_pgia_specs", "CURRENT-PGIA-SPECS", 2, 0, false);
        declareFunction(me, "current_pgia_genls", "CURRENT-PGIA-GENLS", 2, 0, false);
        declareFunction(me, "gather_pgia", "GATHER-PGIA", 1, 0, false);
        declareFunction(me, "pgia_assertionP", "PGIA-ASSERTION?", 1, 1, false);
        declareFunction(me, "pgia_supportP", "PGIA-SUPPORT?", 1, 0, false);
        declareFunction(me, "pgia_deductionP", "PGIA-DEDUCTION?", 1, 1, false);
        declareFunction(me, "assert_candidate_pgia_genls", "ASSERT-CANDIDATE-PGIA-GENLS", 0, 0, false);
        declareFunction(me, "assert_candidate_pgia_specs", "ASSERT-CANDIDATE-PGIA-SPECS", 0, 0, false);
        declareFunction(me, "known_pgiaP", "KNOWN-PGIA?", 3, 0, false);
        declareFunction(me, "candidate_pgiaP", "CANDIDATE-PGIA?", 3, 0, false);
        declareFunction(me, "map_tous_of_fn_arg", "MAP-TOUS-OF-FN-ARG", 4, 0, false);
        return NIL;
    }

    public static SubLObject init_preserves_genls_in_arg_file() {
        defparameter("*PGIA-FN*", NIL);
        defparameter("*PGIA-GAF*", NIL);
        defparameter("*PGIA-ARG*", NIL);
        defparameter("*PGIA-DONE*", NIL);
        defparameter("*PGIA-NAT*", NIL);
        defparameter("*PGIA-NAT-FORT*", NIL);
        defparameter("*PGIA-COL*", NIL);
        defparameter("*PGIA-GENL*", NIL);
        defparameter("*PGIA-GENL-NAT*", NIL);
        defparameter("*PGIA-GENL-NATS*", NIL);
        defparameter("*PGIA-SPEC*", NIL);
        defparameter("*PGIA-SPEC-NAT*", NIL);
        defparameter("*PGIA-SPEC-NATS*", NIL);
        defparameter("*CANDIDATE-PGIA-GENLS*", NIL);
        defparameter("*CANDIDATE-PGIA-SPECS*", NIL);
        defparameter("*CONSIDER-CURRENT-PGIA?*", NIL);
        defparameter("*CURRENT-PGIA-GENLS*", NIL);
        defparameter("*CURRENT-PGIA-SPECS*", NIL);
        deflexical("*PGIA-MT*", SubLSystemTrampolineFile.maybeDefault($pgia_mt$, $pgia_mt$, $$BaseKB));
        defparameter("*PGIA-RULE*", $list2);
        return NIL;
    }

    public static SubLObject setup_preserves_genls_in_arg_file() {
        declare_defglobal($pgia_mt$);
        mt_vars.note_mt_var($pgia_mt$, NIL);
        register_kb_function(PGIA_AFTER_ADDING_PGIA);
        register_kb_function(PGIA_AFTER_ADDING_ISA);
        register_kb_function(PGIA_AFTER_REMOVING_GENLS);
        return NIL;
    }

    @Override
    public void declareFunctions() {
        declare_preserves_genls_in_arg_file();
    }

    @Override
    public void initializeVariables() {
        init_preserves_genls_in_arg_file();
    }

    @Override
    public void runTopLevelForms() {
        setup_preserves_genls_in_arg_file();
    }

    

    public static final class $pgia_after_adding_isa$BinaryFunction extends BinaryFunction {
        public $pgia_after_adding_isa$BinaryFunction() {
            super(extractFunctionNamed("PGIA-AFTER-ADDING-ISA"));
        }

        @Override
        public SubLObject processItem(final SubLObject arg1, final SubLObject arg2) {
            return pgia_after_adding_isa(arg1, arg2);
        }
    }
}

/**
 * Total time: 840 ms
 */
