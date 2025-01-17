package com.cyc.cycjava.cycl.sbhl;


import static com.cyc.cycjava.cycl.constant_handles.reader_make_constant_shell;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.cons;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.list;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions.funcall;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.clrhash;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.getEntryKey;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.getEntrySetIterator;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.getEntryValue;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.gethash_without_values;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.hash_table_count;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.iteratorHasNext;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.iteratorNextEntry;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.releaseEntrySetIterator;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.remhash;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.sethash;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.add;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.minusp;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.numL;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.nreverse;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.remove;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types.hash_table_p;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types.numberp;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types.sublisp_null;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeBoolean;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeString;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeSymbol;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.adjoin;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.second;
import static com.cyc.tool.subl.util.SubLFiles.declareFunction;

import java.util.Iterator;
import java.util.Map;

import com.cyc.cycjava.cycl.hash_table_utilities;
import com.cyc.cycjava.cycl.list_utilities;
import com.cyc.cycjava.cycl.number_utilities;
import com.cyc.cycjava.cycl.set;
import com.cyc.cycjava.cycl.set_contents;
import com.cyc.cycjava.cycl.subl_promotions;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.BinaryFunction;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.UnaryFunction;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;


public final class sbhl_marking_utilities extends SubLTranslatedFile {
    public static final SubLFile me = new sbhl_marking_utilities();

    public static final String myName = "com.cyc.cycjava.cycl.sbhl.sbhl_marking_utilities";

    public static final String myFingerPrint = "232001e769c5b79cbfd598c006ab80b3903d22c06f4bb06663b1670938255cb6";



    private static final SubLObject $$weak_HL_TimePrecedence = reader_make_constant_shell(makeString("weak-HL-TimePrecedence"));



    private static final SubLObject $$strict_HL_TimePrecedence = reader_make_constant_shell(makeString("strict-HL-TimePrecedence"));



    private static final SubLObject $$weakSuccessor_HL_TimePrecedence = reader_make_constant_shell(makeString("weakSuccessor-HL-TimePrecedence"));



    private static final SubLObject $$successorStrict_HL_TimePrecedence = reader_make_constant_shell(makeString("successorStrict-HL-TimePrecedence"));



    public static final SubLString $str9$Node__a_has_current_marking__a_wi = makeString("Node ~a has current marking ~a within genl-preds-unmarking");

    public static final SubLString $str10$Node__a_has_current_marking__a_wi = makeString("Node ~a has current marking ~a within genl-inverse-unmarking");

    public static final SubLSymbol SBHL_MARKED_P = makeSymbol("SBHL-MARKED-P");

    public static final SubLSymbol SBHL_PREDICATE_PATH_TERMINATION_P = makeSymbol("SBHL-PREDICATE-PATH-TERMINATION-P");

    public static final SubLSymbol SBHL_NODES_MARK_EXCEEDS_TEMPORAL_THRESHOLD_P = makeSymbol("SBHL-NODES-MARK-EXCEEDS-TEMPORAL-THRESHOLD-P");

    public static final SubLSymbol SET_SBHL_MARKING_STATE_TO_MARKED = makeSymbol("SET-SBHL-MARKING-STATE-TO-MARKED");

    public static final SubLSymbol SBHL_PREDICATE_MARKING_FN = makeSymbol("SBHL-PREDICATE-MARKING-FN");

    public static final SubLSymbol INCREMENT_SBHL_MARKING_STATE_BY_ZERO = makeSymbol("INCREMENT-SBHL-MARKING-STATE-BY-ZERO");

    public static final SubLSymbol INCREMENT_SBHL_MARKING_STATE_BY_ONE = makeSymbol("INCREMENT-SBHL-MARKING-STATE-BY-ONE");

    public static final SubLSymbol INCREMENT_SBHL_MARKING_STATE_BY_TWO = makeSymbol("INCREMENT-SBHL-MARKING-STATE-BY-TWO");

    public static final SubLSymbol INCREMENT_SBHL_MARKING_STATE_BY_MINUS_ONE = makeSymbol("INCREMENT-SBHL-MARKING-STATE-BY-MINUS-ONE");

    public static final SubLSymbol SET_SBHL_MARKING_STATE_TO_UNMARKED = makeSymbol("SET-SBHL-MARKING-STATE-TO-UNMARKED");

    public static final SubLSymbol GENL_PREDS_UNMARKING_FN = makeSymbol("GENL-PREDS-UNMARKING-FN");

    public static final SubLSymbol GENL_INVERSE_UNMARKING_FN = makeSymbol("GENL-INVERSE-UNMARKING-FN");

    public static final SubLString $str23$Node__a_has_current_marking__a_wi = makeString("Node ~a has current marking ~a within genl-preds-marking");

    public static final SubLString $str24$Node__a_has_current_marking__a_wi = makeString("Node ~a has current marking ~a within genl-inverse-marking");

    private static final SubLString $str25$_A_is_neither_SET_P_nor_LISTP_ = makeString("~A is neither SET-P nor LISTP.");



    private static final SubLString $str27$_A_is_not_a__A = makeString("~A is not a ~A");

    private static final SubLSymbol SBHL_SPACE_P = makeSymbol("SBHL-SPACE-P");



    private static final SubLString $$$continue_anyway = makeString("continue anyway");



    private static final SubLString $str32$_A_is_not_a_valid__sbhl_type_erro = makeString("~A is not a valid *sbhl-type-error-action* value");

    public static SubLObject get_sbhl_marking_state(final SubLObject node, SubLObject space) {
        if (space == UNPROVIDED) {
            space = sbhl_marking_vars.$sbhl_space$.getDynamicValue();
        }
        return gethash_without_values(node, space, UNPROVIDED);
    }

    public static SubLObject sbhl_marked_with(final SubLObject node, SubLObject space) {
        if (space == UNPROVIDED) {
            space = sbhl_marking_vars.$sbhl_space$.getDynamicValue();
        }
        return get_sbhl_marking_state(node, space);
    }

    public static SubLObject sbhl_marked_node_p(final SubLObject node, SubLObject space) {
        if (space == UNPROVIDED) {
            space = sbhl_marking_vars.$sbhl_space$.getDynamicValue();
        }
        return list_utilities.sublisp_boolean(get_sbhl_marking_state(node, space));
    }

    public static SubLObject sbhl_marked_p(final SubLObject marking) {
        return list_utilities.sublisp_boolean(marking);
    }

    public static SubLObject sbhl_unmarked_p(final SubLObject marking) {
        return makeBoolean(NIL == marking);
    }

    public static SubLObject sbhl_marking_contains_searcherP(final SubLObject marking, final SubLObject searcher) {
        return subl_promotions.memberP(searcher, marking, UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject sbhl_marking_contains_all_searchersP(final SubLObject marking, final SubLObject searchers) {
        SubLObject failP = NIL;
        if (NIL == failP) {
            SubLObject csome_list_var;
            SubLObject searcher;
            for (csome_list_var = searchers, searcher = NIL, searcher = csome_list_var.first(); (NIL == failP) && (NIL != csome_list_var); failP = makeBoolean(NIL == subl_promotions.memberP(searcher, marking, UNPROVIDED, UNPROVIDED)) , csome_list_var = csome_list_var.rest() , searcher = csome_list_var.first()) {
            }
        }
        return makeBoolean(NIL == failP);
    }

    public static SubLObject sbhl_temporal_increment() {
        return sbhl_module_utilities.get_sbhl_module_marking_increment(sbhl_module_vars.get_sbhl_module(UNPROVIDED));
    }

    public static SubLObject sbhl_temporal_tag_increment(final SubLObject tag) {
        if (tag.eql($WEAK)) {
            return sbhl_module_utilities.get_sbhl_module_marking_increment(sbhl_module_vars.get_sbhl_module($$weak_HL_TimePrecedence));
        }
        if (tag.eql($STRICT)) {
            return sbhl_module_utilities.get_sbhl_module_marking_increment(sbhl_module_vars.get_sbhl_module($$strict_HL_TimePrecedence));
        }
        if (tag.eql($WEAK_SUCCESSOR)) {
            return sbhl_module_utilities.get_sbhl_module_marking_increment(sbhl_module_vars.get_sbhl_module($$weakSuccessor_HL_TimePrecedence));
        }
        if (tag.eql($SUCCESSOR_STRICT)) {
            return sbhl_module_utilities.get_sbhl_module_marking_increment(sbhl_module_vars.get_sbhl_module($$successorStrict_HL_TimePrecedence));
        }
        return NIL;
    }

    public static SubLObject sbhl_nodes_marking_non_negative_p(final SubLObject node, SubLObject space) {
        if (space == UNPROVIDED) {
            space = sbhl_marking_vars.$sbhl_space$.getDynamicValue();
        }
        return number_utilities.non_negative_number_p(sbhl_marked_with(node, space));
    }

    public static SubLObject sbhl_current_marking_exceeds_pending_marking_or_marking_threshold_p(final SubLObject marking) {
        return list_utilities.sublisp_boolean(marking);
    }

    public static SubLObject sbhl_nodes_mark_exceeds_temporal_threshold_p(final SubLObject node) {
        if (NIL != sbhl_marking_vars.sbhl_temporality_search_checks_nodes_in_target_space_p()) {
            return sbhl_temporality_path_termination_for_searching_marked_nodes_p(node);
        }
        return sbhl_current_marking_exceeds_pending_marking_or_marking_threshold_p(sbhl_marked_with(node, UNPROVIDED));
    }

    public static SubLObject sbhl_temporality_path_termination_for_searching_marked_nodes_p(final SubLObject node) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return makeBoolean((NIL == sbhl_marked_with(node, sbhl_marking_vars.$sbhl_target_space$.getDynamicValue(thread))) || (NIL != sbhl_current_marking_exceeds_pending_marking_or_marking_threshold_p(sbhl_marked_with(node, UNPROVIDED))));
    }

    public static SubLObject sbhl_current_temporal_node_not_yet_considered_p() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != sbhl_search_vars.get_sbhl_nodes_previous_marking()) {
            return minusp(sbhl_search_vars.$sbhl_nodes_previous_marking$.getDynamicValue(thread));
        }
        return T;
    }

    public static SubLObject sbhl_predicate_path_termination_p(final SubLObject marking) {
        return NIL != sbhl_search_vars.genl_inverse_mode_p() ? makeBoolean((NIL != sbhl_marking_vars.genl_inverse_marking_p(marking)) || (NIL != sbhl_marking_vars.genl_preds_and_genl_inverse_marking_p(marking))) : makeBoolean((NIL != sbhl_marking_vars.genl_preds_marking_p(marking)) || (NIL != sbhl_marking_vars.genl_preds_and_genl_inverse_marking_p(marking)));
    }

    public static SubLObject set_sbhl_marking_state(final SubLObject node, final SubLObject value, SubLObject space) {
        if (space == UNPROVIDED) {
            space = sbhl_marking_vars.$sbhl_space$.getDynamicValue();
        }
        sethash(node, space, value);
        return NIL;
    }

    public static SubLObject set_sbhl_marking_state_to_marked(final SubLObject node, SubLObject space) {
        if (space == UNPROVIDED) {
            space = sbhl_marking_vars.$sbhl_space$.getDynamicValue();
        }
        set_sbhl_marking_state(node, T, space);
        return NIL;
    }

    public static SubLObject set_sbhl_marking_state_to_unmarked(final SubLObject node, SubLObject space) {
        if (space == UNPROVIDED) {
            space = sbhl_marking_vars.$sbhl_space$.getDynamicValue();
        }
        set_sbhl_marking_state(node, NIL, space);
        return NIL;
    }

    public static SubLObject sbhl_mark_node(final SubLObject node, SubLObject space) {
        if (space == UNPROVIDED) {
            space = sbhl_marking_vars.$sbhl_space$.getDynamicValue();
        }
        return set_sbhl_marking_state_to_marked(node, space);
    }

    public static SubLObject adjoin_to_sbhl_marking_state(final SubLObject node, final SubLObject marking, SubLObject space) {
        if (space == UNPROVIDED) {
            space = sbhl_marking_vars.$sbhl_space$.getDynamicValue();
        }
        final SubLObject marked_withP = get_sbhl_marking_state(node, space);
        final SubLObject new_marking = adjoin(marked_withP, list(marking), UNPROVIDED, UNPROVIDED);
        set_sbhl_marking_state(node, new_marking, space);
        return NIL;
    }

    public static SubLObject prepend_to_sbhl_marking_state(final SubLObject node, final SubLObject marking, SubLObject space) {
        if (space == UNPROVIDED) {
            space = sbhl_marking_vars.$sbhl_space$.getDynamicValue();
        }
        hash_table_utilities.push_hash(node, marking, space);
        return NIL;
    }

    public static SubLObject remove_from_sbhl_marking_state(final SubLObject node, final SubLObject marking, SubLObject space) {
        if (space == UNPROVIDED) {
            space = sbhl_marking_vars.$sbhl_space$.getDynamicValue();
        }
        final SubLObject marked_withP = get_sbhl_marking_state(node, space);
        final SubLObject new_marking = remove(marking, marked_withP, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        set_sbhl_marking_state(node, new_marking, space);
        return NIL;
    }

    public static SubLObject node_unmarked_completely_in_sbhl_marking_stateP(final SubLObject node, SubLObject space) {
        if (space == UNPROVIDED) {
            space = sbhl_marking_vars.$sbhl_space$.getDynamicValue();
        }
        return sublisp_null(get_sbhl_marking_state(node, space));
    }

    public static SubLObject prune_unmarked_node_from_sbhl_marking_state(final SubLObject node, SubLObject space) {
        if (space == UNPROVIDED) {
            space = sbhl_marking_vars.$sbhl_space$.getDynamicValue();
        }
        return remhash(node, space);
    }

    public static SubLObject increment_sbhl_marking_state(final SubLObject node, final SubLObject increment, SubLObject space) {
        if (space == UNPROVIDED) {
            space = sbhl_marking_vars.$sbhl_space$.getDynamicValue();
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject parent_marking = sbhl_search_vars.get_sbhl_search_parent_marking();
        final SubLObject marking = (NIL != parent_marking) ? parent_marking : sbhl_time_vars.$sbhl_temporality_succession_depth$.getDynamicValue(thread);
        final SubLObject new_marking = add(increment, marking);
        sbhl_search_vars.$sbhl_nodes_previous_marking$.setDynamicValue(get_sbhl_marking_state(node, UNPROVIDED), thread);
        sbhl_search_vars.$sbhl_search_parent_marking$.setDynamicValue(new_marking, thread);
        set_sbhl_marking_state(node, new_marking, space);
        return NIL;
    }

    public static SubLObject increment_sbhl_marking_state_by_zero(final SubLObject node, SubLObject space) {
        if (space == UNPROVIDED) {
            space = sbhl_marking_vars.$sbhl_space$.getDynamicValue();
        }
        increment_sbhl_marking_state(node, ZERO_INTEGER, space);
        return NIL;
    }

    public static SubLObject increment_sbhl_marking_state_by_minus_one(final SubLObject node, SubLObject space) {
        if (space == UNPROVIDED) {
            space = sbhl_marking_vars.$sbhl_space$.getDynamicValue();
        }
        increment_sbhl_marking_state(node, MINUS_ONE_INTEGER, space);
        return NIL;
    }

    public static SubLObject increment_sbhl_marking_state_by_one(final SubLObject node, SubLObject space) {
        if (space == UNPROVIDED) {
            space = sbhl_marking_vars.$sbhl_space$.getDynamicValue();
        }
        increment_sbhl_marking_state(node, ONE_INTEGER, space);
        return NIL;
    }

    public static SubLObject increment_sbhl_marking_state_by_two(final SubLObject node, SubLObject space) {
        if (space == UNPROVIDED) {
            space = sbhl_marking_vars.$sbhl_space$.getDynamicValue();
        }
        increment_sbhl_marking_state(node, TWO_INTEGER, space);
        return NIL;
    }

    public static SubLObject set_sbhl_marking_state_to_zero(final SubLObject node, SubLObject space) {
        if (space == UNPROVIDED) {
            space = sbhl_marking_vars.$sbhl_space$.getDynamicValue();
        }
        set_sbhl_marking_state(node, ZERO_INTEGER, space);
        return NIL;
    }

    public static SubLObject set_sbhl_marking_state_to_depth(final SubLObject node, final SubLObject depth, SubLObject space) {
        if (space == UNPROVIDED) {
            space = sbhl_marking_vars.$sbhl_space$.getDynamicValue();
        }
        assert NIL != numberp(depth) : "Types.numberp(depth) " + "CommonSymbols.NIL != Types.numberp(depth) " + depth;
        set_sbhl_marking_state(node, depth, space);
        return NIL;
    }

    public static SubLObject sbhl_node_marking_greater_than_depth_p(final SubLObject node, final SubLObject depth, SubLObject space) {
        if (space == UNPROVIDED) {
            space = sbhl_marking_vars.$sbhl_space$.getDynamicValue();
        }
        assert NIL != numberp(depth) : "Types.numberp(depth) " + "CommonSymbols.NIL != Types.numberp(depth) " + depth;
        final SubLObject node_depth = get_sbhl_marking_state(node, space);
        SubLObject result = NIL;
        if (NIL != node_depth) {
            assert NIL != numberp(node_depth) : "Types.numberp(node_depth) " + "CommonSymbols.NIL != Types.numberp(node_depth) " + node_depth;
            result = numL(depth, node_depth);
        }
        return result;
    }

    public static SubLObject sbhl_predicate_marking_fn(final SubLObject node, SubLObject space) {
        if (space == UNPROVIDED) {
            space = sbhl_marking_vars.$sbhl_space$.getDynamicValue();
        }
        if (NIL != sbhl_search_vars.genl_inverse_mode_p()) {
            genl_inverse_marking_fn(node, space);
        } else {
            genl_preds_marking_fn(node, space);
        }
        return NIL;
    }

    public static SubLObject genl_preds_marking_fn(final SubLObject node, SubLObject space) {
        if (space == UNPROVIDED) {
            space = sbhl_marking_vars.$sbhl_space$.getDynamicValue();
        }
        final SubLObject current_marking = sbhl_marked_with(node, space);
        if (NIL == current_marking) {
            set_sbhl_marking_state(node, sbhl_marking_vars.$sbhl_genl_preds_marking$.getGlobalValue(), space);
        } else
            if (current_marking.eql(sbhl_marking_vars.$sbhl_genl_inverse_marking$.getGlobalValue())) {
                set_sbhl_marking_state(node, sbhl_marking_vars.$sbhl_genl_preds_and_genl_inverse_marking$.getGlobalValue(), space);
            }

        return NIL;
    }

    public static SubLObject genl_inverse_marking_fn(final SubLObject node, SubLObject space) {
        if (space == UNPROVIDED) {
            space = sbhl_marking_vars.$sbhl_space$.getDynamicValue();
        }
        final SubLObject current_marking = sbhl_marked_with(node, UNPROVIDED);
        if (NIL == current_marking) {
            set_sbhl_marking_state(node, sbhl_marking_vars.$sbhl_genl_inverse_marking$.getGlobalValue(), space);
        } else
            if (current_marking.eql(sbhl_marking_vars.$sbhl_genl_preds_marking$.getGlobalValue())) {
                set_sbhl_marking_state(node, sbhl_marking_vars.$sbhl_genl_preds_and_genl_inverse_marking$.getGlobalValue(), space);
            }

        return NIL;
    }

    public static SubLObject sbhl_predicate_unmarking_fn(final SubLObject node, SubLObject space) {
        if (space == UNPROVIDED) {
            space = sbhl_marking_vars.$sbhl_space$.getDynamicValue();
        }
        if (NIL != sbhl_search_vars.genl_inverse_mode_p()) {
            genl_inverse_unmarking_fn(node, space);
        } else {
            genl_preds_unmarking_fn(node, space);
        }
        return NIL;
    }

    public static SubLObject genl_preds_unmarking_fn(final SubLObject node, SubLObject space) {
        if (space == UNPROVIDED) {
            space = sbhl_marking_vars.$sbhl_space$.getDynamicValue();
        }
        final SubLObject current_marking = sbhl_marked_with(node, UNPROVIDED);
        if (current_marking.eql(sbhl_marking_vars.$sbhl_genl_preds_marking$.getGlobalValue())) {
            set_sbhl_marking_state(node, NIL, space);
        } else
            if (current_marking.eql(sbhl_marking_vars.$sbhl_genl_preds_and_genl_inverse_marking$.getGlobalValue())) {
                set_sbhl_marking_state(node, sbhl_marking_vars.$sbhl_genl_inverse_marking$.getGlobalValue(), space);
            } else {
                sbhl_paranoia.sbhl_error(ONE_INTEGER, $str9$Node__a_has_current_marking__a_wi, node, current_marking, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            }

        return NIL;
    }

    public static SubLObject genl_inverse_unmarking_fn(final SubLObject node, SubLObject space) {
        if (space == UNPROVIDED) {
            space = sbhl_marking_vars.$sbhl_space$.getDynamicValue();
        }
        final SubLObject current_marking = sbhl_marked_with(node, UNPROVIDED);
        if (current_marking.eql(sbhl_marking_vars.$sbhl_genl_inverse_marking$.getGlobalValue())) {
            set_sbhl_marking_state(node, NIL, space);
        } else
            if (current_marking.eql(sbhl_marking_vars.$sbhl_genl_preds_and_genl_inverse_marking$.getGlobalValue())) {
                set_sbhl_marking_state(node, sbhl_marking_vars.$sbhl_genl_preds_marking$.getGlobalValue(), space);
            } else {
                sbhl_paranoia.sbhl_error(ONE_INTEGER, $str10$Node__a_has_current_marking__a_wi, node, current_marking, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            }

        return NIL;
    }

    public static SubLObject sbhl_mark_node_in_precompute_space(final SubLObject node) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        sbhl_mark_node_marked(node, sbhl_search_vars.$sbhl_precomputed_goal_space$.getDynamicValue(thread));
        return NIL;
    }

    public static SubLObject sbhl_node_marked_precompute_goal_p(final SubLObject node) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return sbhl_path_terminating_mark_p(node, sbhl_search_vars.$sbhl_precomputed_goal_space$.getDynamicValue(thread));
    }

    public static SubLObject set_sbhl_boolean_precompute_goal_conditions(final SubLObject node) {
        sbhl_search_utilities.set_sbhl_boolean_goal_conditions();
        sbhl_search_vars.$sbhl_result$.setDynamicValue(node);
        return NIL;
    }

    public static SubLObject sbhl_search_path_termination_p(final SubLObject node, SubLObject space) {
        if (space == UNPROVIDED) {
            space = sbhl_marking_vars.$sbhl_space$.getDynamicValue();
        }
        if ((NIL != sbhl_search_vars.sbhl_check_for_goal_marking_p()) && (NIL != sbhl_node_marked_precompute_goal_p(node))) {
            set_sbhl_boolean_precompute_goal_conditions(node);
            return T;
        }
        return sbhl_path_terminating_mark_p(node, space);
    }

    public static SubLObject sbhl_path_terminating_mark_p(final SubLObject node, SubLObject space) {
        if (space == UNPROVIDED) {
            space = sbhl_marking_vars.$sbhl_space$.getDynamicValue();
        }
        final SubLObject pcase_var;
        final SubLObject path_terminating_markP_fn = pcase_var = sbhl_module_utilities.get_sbhl_path_terminating_markP_fn(sbhl_module_vars.get_sbhl_module(UNPROVIDED));
        if (pcase_var.eql(SBHL_MARKED_P)) {
            return sbhl_marked_p(sbhl_marked_with(node, space));
        }
        if (pcase_var.eql(SBHL_PREDICATE_PATH_TERMINATION_P)) {
            return sbhl_predicate_path_termination_p(sbhl_marked_with(node, space));
        }
        if (pcase_var.eql(SBHL_NODES_MARK_EXCEEDS_TEMPORAL_THRESHOLD_P)) {
            return sbhl_nodes_mark_exceeds_temporal_threshold_p(node);
        }
        return funcall(path_terminating_markP_fn, node);
    }

    public static SubLObject sbhl_path_termination_marking_p(final SubLObject marking) {
        final SubLObject pcase_var;
        final SubLObject path_terminating_markP_fn = pcase_var = sbhl_module_utilities.get_sbhl_path_terminating_markP_fn(sbhl_module_vars.get_sbhl_module(UNPROVIDED));
        if (pcase_var.eql(SBHL_MARKED_P)) {
            return sbhl_marked_p(marking);
        }
        if (pcase_var.eql(SBHL_PREDICATE_PATH_TERMINATION_P)) {
            return sbhl_predicate_path_termination_p(marking);
        }
        return funcall(path_terminating_markP_fn, marking);
    }

    public static SubLObject sbhl_marked_in_terminating_space_p(final SubLObject node) {
        return sbhl_search_path_termination_p(node, sbhl_marking_vars.get_sbhl_terminating_marking_space());
    }

    public static SubLObject sbhl_marked_in_target_space_p(final SubLObject node) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return sbhl_search_path_termination_p(node, sbhl_marking_vars.$sbhl_target_space$.getDynamicValue(thread));
    }

    public static SubLObject sbhl_mark_node_marked(final SubLObject node, SubLObject space) {
        if (space == UNPROVIDED) {
            space = sbhl_marking_vars.$sbhl_space$.getDynamicValue();
        }
        final SubLObject pcase_var;
        final SubLObject marking_fn = pcase_var = sbhl_module_utilities.get_sbhl_marking_fn(sbhl_module_vars.get_sbhl_module(UNPROVIDED));
        if (pcase_var.eql(SET_SBHL_MARKING_STATE_TO_MARKED)) {
            set_sbhl_marking_state_to_marked(node, space);
        } else
            if (pcase_var.eql(SBHL_PREDICATE_MARKING_FN)) {
                sbhl_predicate_marking_fn(node, space);
            } else
                if (pcase_var.eql(INCREMENT_SBHL_MARKING_STATE_BY_ZERO)) {
                    increment_sbhl_marking_state_by_zero(node, space);
                } else
                    if (pcase_var.eql(INCREMENT_SBHL_MARKING_STATE_BY_ONE)) {
                        increment_sbhl_marking_state_by_one(node, space);
                    } else
                        if (pcase_var.eql(INCREMENT_SBHL_MARKING_STATE_BY_TWO)) {
                            increment_sbhl_marking_state_by_two(node, space);
                        } else
                            if (pcase_var.eql(INCREMENT_SBHL_MARKING_STATE_BY_MINUS_ONE)) {
                                increment_sbhl_marking_state_by_minus_one(node, space);
                            } else {
                                funcall(marking_fn, node);
                            }





        return NIL;
    }

    public static SubLObject sbhl_mark_node_unmarked(final SubLObject node, SubLObject space) {
        if (space == UNPROVIDED) {
            space = sbhl_marking_vars.$sbhl_space$.getDynamicValue();
        }
        final SubLObject pcase_var;
        final SubLObject unmarking_fn = pcase_var = sbhl_module_utilities.get_sbhl_unmarking_fn(sbhl_module_vars.get_sbhl_module(UNPROVIDED));
        if (pcase_var.eql(SET_SBHL_MARKING_STATE_TO_UNMARKED)) {
            set_sbhl_marking_state_to_unmarked(node, space);
        } else
            if (pcase_var.eql(GENL_PREDS_UNMARKING_FN)) {
                genl_preds_unmarking_fn(node, space);
            } else
                if (pcase_var.eql(GENL_INVERSE_UNMARKING_FN)) {
                    genl_inverse_unmarking_fn(node, space);
                } else {
                    funcall(unmarking_fn, node);
                }


        return NIL;
    }

    public static SubLObject sbhl_mark_in_target_space(final SubLObject node) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        sbhl_mark_node_marked(node, sbhl_marking_vars.$sbhl_target_space$.getDynamicValue(thread));
        return NIL;
    }

    public static SubLObject sbhl_mark_in_target_gather_space(final SubLObject node) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        sbhl_mark_node_marked(node, sbhl_marking_vars.$sbhl_target_gather_space$.getDynamicValue(thread));
        return NIL;
    }

    public static SubLObject sbhl_apply_mark_in_space(final SubLObject node) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        sbhl_mark_node_marked(node, sbhl_marking_vars.$sbhl_apply_marking_space$.getDynamicValue(thread));
        return NIL;
    }

    public static SubLObject sbhl_apply_unmark_in_space(final SubLObject node) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        sbhl_mark_node_unmarked(node, sbhl_marking_vars.$sbhl_apply_marking_space$.getDynamicValue(thread));
        return NIL;
    }

    public static SubLObject sbhl_generational_search_path_termination_p(final SubLObject node, SubLObject space) {
        if (space == UNPROVIDED) {
            space = sbhl_marking_vars.$sbhl_space$.getDynamicValue();
        }
        final SubLObject pcase_var;
        final SubLObject path_terminating_markP_fn = pcase_var = sbhl_module_utilities.get_sbhl_path_terminating_markP_fn(sbhl_module_vars.get_sbhl_module(UNPROVIDED));
        if (pcase_var.eql(SBHL_MARKED_P)) {
            return sbhl_marked_p(sbhl_marked_with(node, space));
        }
        if (pcase_var.eql(SBHL_PREDICATE_PATH_TERMINATION_P)) {
            return sbhl_predicate_path_termination_p(second(sbhl_marked_with(node, space)));
        }
        return NIL;
    }

    public static SubLObject sbhl_marking_generation(final SubLObject node, SubLObject space) {
        if (space == UNPROVIDED) {
            space = sbhl_marking_vars.$sbhl_space$.getDynamicValue();
        }
        final SubLObject pcase_var;
        final SubLObject path_terminating_markP_fn = pcase_var = sbhl_module_utilities.get_sbhl_path_terminating_markP_fn(sbhl_module_vars.get_sbhl_module(UNPROVIDED));
        if (pcase_var.eql(SBHL_MARKED_P)) {
            return sbhl_marked_with(node, space);
        }
        if (pcase_var.eql(SBHL_PREDICATE_PATH_TERMINATION_P)) {
            return sbhl_marked_with(node, space).first();
        }
        return NIL;
    }

    public static SubLObject sbhl_generational_mark_node_marked(final SubLObject node, SubLObject space) {
        if (space == UNPROVIDED) {
            space = sbhl_marking_vars.$sbhl_space$.getDynamicValue();
        }
        final SubLObject pcase_var;
        final SubLObject marking_fn = pcase_var = sbhl_module_utilities.get_sbhl_marking_fn(sbhl_module_vars.get_sbhl_module(UNPROVIDED));
        if (pcase_var.eql(SET_SBHL_MARKING_STATE_TO_MARKED)) {
            set_sbhl_marking_state(node, sbhl_marking_vars.get_sbhl_marking_generation(), space);
        } else
            if (pcase_var.eql(SBHL_PREDICATE_MARKING_FN)) {
                sbhl_generational_predicate_marking_fn(node, space);
            } else {
                funcall(marking_fn, node);
            }

        return NIL;
    }

    public static SubLObject sbhl_generational_predicate_marking_fn(final SubLObject node, SubLObject space) {
        if (space == UNPROVIDED) {
            space = sbhl_marking_vars.$sbhl_space$.getDynamicValue();
        }
        if (NIL != sbhl_search_vars.genl_inverse_mode_p()) {
            genl_inverse_generational_marking_fn(node, space);
        } else {
            genl_preds_generational_marking_fn(node, space);
        }
        return NIL;
    }

    public static SubLObject genl_preds_generational_marking_fn(final SubLObject node, SubLObject space) {
        if (space == UNPROVIDED) {
            space = sbhl_marking_vars.$sbhl_space$.getDynamicValue();
        }
        final SubLObject current_marking = second(sbhl_marked_with(node, space));
        if (NIL == current_marking) {
            set_sbhl_marking_state(node, list(sbhl_marking_vars.get_sbhl_marking_generation(), sbhl_marking_vars.$sbhl_genl_preds_marking$.getGlobalValue()), space);
        } else
            if (current_marking.eql(sbhl_marking_vars.$sbhl_genl_inverse_marking$.getGlobalValue())) {
                set_sbhl_marking_state(node, list(sbhl_marking_vars.get_sbhl_marking_generation(), sbhl_marking_vars.$sbhl_genl_preds_and_genl_inverse_marking$.getGlobalValue()), space);
            } else {
                sbhl_paranoia.sbhl_error(ONE_INTEGER, $str23$Node__a_has_current_marking__a_wi, node, current_marking, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            }

        return NIL;
    }

    public static SubLObject genl_inverse_generational_marking_fn(final SubLObject node, SubLObject space) {
        if (space == UNPROVIDED) {
            space = sbhl_marking_vars.$sbhl_space$.getDynamicValue();
        }
        final SubLObject current_marking = second(sbhl_marked_with(node, UNPROVIDED));
        if (NIL == current_marking) {
            set_sbhl_marking_state(node, list(sbhl_marking_vars.get_sbhl_marking_generation(), sbhl_marking_vars.$sbhl_genl_inverse_marking$.getGlobalValue()), space);
        } else
            if (current_marking.eql(sbhl_marking_vars.$sbhl_genl_preds_marking$.getGlobalValue())) {
                set_sbhl_marking_state(node, list(sbhl_marking_vars.get_sbhl_marking_generation(), sbhl_marking_vars.$sbhl_genl_preds_and_genl_inverse_marking$.getGlobalValue()), space);
            } else {
                sbhl_paranoia.sbhl_error(ONE_INTEGER, $str24$Node__a_has_current_marking__a_wi, node, current_marking, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            }

        return NIL;
    }

    public static SubLObject sbhl_any_nodes_markedP(final SubLObject nodes, SubLObject space) {
        if (space == UNPROVIDED) {
            space = sbhl_marking_vars.$sbhl_space$.getDynamicValue();
        }
        SubLObject markedP = NIL;
        if (NIL != set.set_p(nodes)) {
            final SubLObject set_contents_var = set.do_set_internal(nodes);
            SubLObject basis_object;
            SubLObject state;
            SubLObject node;
            for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); (NIL == markedP) && (NIL == set_contents.do_set_contents_doneP(basis_object, state)); state = set_contents.do_set_contents_update_state(state)) {
                node = set_contents.do_set_contents_next(basis_object, state);
                if (NIL != set_contents.do_set_contents_element_validP(state, node)) {
                    markedP = sbhl_marked_with(node, space);
                }
            }
        } else
            if (nodes.isList()) {
                if (NIL == markedP) {
                    SubLObject csome_list_var;
                    SubLObject node2;
                    for (csome_list_var = nodes, node2 = NIL, node2 = csome_list_var.first(); (NIL == markedP) && (NIL != csome_list_var); markedP = sbhl_marked_with(node2, space) , csome_list_var = csome_list_var.rest() , node2 = csome_list_var.first()) {
                    }
                }
            } else {
                Errors.error($str25$_A_is_neither_SET_P_nor_LISTP_, nodes);
            }

        return markedP;
    }

    public static SubLObject sbhl_all_nodes_markedP(final SubLObject nodes, SubLObject space) {
        if (space == UNPROVIDED) {
            space = sbhl_marking_vars.$sbhl_space$.getDynamicValue();
        }
        SubLObject unmarkedP = NIL;
        if (NIL != set.set_p(nodes)) {
            final SubLObject set_contents_var = set.do_set_internal(nodes);
            SubLObject basis_object;
            SubLObject state;
            SubLObject node;
            for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); (NIL == unmarkedP) && (NIL == set_contents.do_set_contents_doneP(basis_object, state)); state = set_contents.do_set_contents_update_state(state)) {
                node = set_contents.do_set_contents_next(basis_object, state);
                if (NIL != set_contents.do_set_contents_element_validP(state, node)) {
                    unmarkedP = makeBoolean(NIL == sbhl_marked_with(node, space));
                }
            }
        } else
            if (nodes.isList()) {
                if (NIL == unmarkedP) {
                    SubLObject csome_list_var;
                    SubLObject node2;
                    for (csome_list_var = nodes, node2 = NIL, node2 = csome_list_var.first(); (NIL == unmarkedP) && (NIL != csome_list_var); unmarkedP = makeBoolean(NIL == sbhl_marked_with(node2, space)) , csome_list_var = csome_list_var.rest() , node2 = csome_list_var.first()) {
                    }
                }
            } else {
                Errors.error($str25$_A_is_neither_SET_P_nor_LISTP_, nodes);
            }

        return makeBoolean(NIL == unmarkedP);
    }

    public static SubLObject sbhl_any_nodes_unmarkedP(final SubLObject nodes, SubLObject space) {
        if (space == UNPROVIDED) {
            space = sbhl_marking_vars.$sbhl_space$.getDynamicValue();
        }
        return makeBoolean(NIL == sbhl_all_nodes_markedP(nodes, space));
    }

    public static SubLObject sbhl_all_nodes_unmarkedP(final SubLObject nodes, SubLObject space) {
        if (space == UNPROVIDED) {
            space = sbhl_marking_vars.$sbhl_space$.getDynamicValue();
        }
        return makeBoolean(NIL == sbhl_any_nodes_markedP(nodes, space));
    }

    public static SubLObject all_unsearchedP(final SubLObject nodes) {
        return T;
    }

    public static SubLObject sbhl_all_marked_nodes(final SubLObject nodes, SubLObject space) {
        if (space == UNPROVIDED) {
            space = sbhl_marking_vars.$sbhl_space$.getDynamicValue();
        }
        SubLObject result = NIL;
        SubLObject cdolist_list_var = nodes;
        SubLObject node = NIL;
        node = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if (NIL != sbhl_marked_with(node, space)) {
                result = cons(node, result);
            }
            cdolist_list_var = cdolist_list_var.rest();
            node = cdolist_list_var.first();
        } 
        return nreverse(result);
    }

    public static SubLObject sbhl_all_unmarked_nodes(final SubLObject nodes, SubLObject space) {
        if (space == UNPROVIDED) {
            space = sbhl_marking_vars.$sbhl_space$.getDynamicValue();
        }
        SubLObject result = NIL;
        SubLObject cdolist_list_var = nodes;
        SubLObject node = NIL;
        node = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if (NIL == sbhl_marked_with(node, space)) {
                result = cons(node, result);
            }
            cdolist_list_var = cdolist_list_var.rest();
            node = cdolist_list_var.first();
        } 
        return nreverse(result);
    }

    public static SubLObject sbhl_marked_nodes(SubLObject space) {
        if (space == UNPROVIDED) {
            space = sbhl_marking_vars.$sbhl_space$.getDynamicValue();
        }
        SubLObject result = NIL;
        if (space.isHashtable()) {
            SubLObject node = NIL;
            SubLObject marking = NIL;
            final Iterator cdohash_iterator = getEntrySetIterator(space);
            try {
                while (iteratorHasNext(cdohash_iterator)) {
                    final Map.Entry cdohash_entry = iteratorNextEntry(cdohash_iterator);
                    node = getEntryKey(cdohash_entry);
                    marking = getEntryValue(cdohash_entry);
                    if (NIL != marking) {
                        result = cons(node, result);
                    }
                } 
            } finally {
                releaseEntrySetIterator(cdohash_iterator);
            }
        }
        return result;
    }

    public static SubLObject sbhl_mark_all_nodes_marked(final SubLObject nodes, SubLObject space) {
        if (space == UNPROVIDED) {
            space = sbhl_marking_vars.$sbhl_space$.getDynamicValue();
        }
        SubLObject cdolist_list_var = nodes;
        SubLObject node = NIL;
        node = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            sbhl_mark_node_marked(node, space);
            cdolist_list_var = cdolist_list_var.rest();
            node = cdolist_list_var.first();
        } 
        return NIL;
    }

    public static SubLObject sbhl_mark_all_nodes_unmarked(final SubLObject nodes, SubLObject space) {
        if (space == UNPROVIDED) {
            space = sbhl_marking_vars.$sbhl_space$.getDynamicValue();
        }
        SubLObject cdolist_list_var = nodes;
        SubLObject node = NIL;
        node = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            sbhl_mark_node_unmarked(node, space);
            cdolist_list_var = cdolist_list_var.rest();
            node = cdolist_list_var.first();
        } 
        return NIL;
    }

    public static SubLObject sbhl_mark_nodes_in_target_space(final SubLObject nodes) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject cdolist_list_var = nodes;
        SubLObject node = NIL;
        node = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            sbhl_mark_node_marked(node, sbhl_marking_vars.$sbhl_target_space$.getDynamicValue(thread));
            cdolist_list_var = cdolist_list_var.rest();
            node = cdolist_list_var.first();
        } 
        return NIL;
    }

    public static SubLObject sbhl_mark_nodes_in_target_space_gp(final SubLObject nodes) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject _prev_bind_0 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
        try {
            sbhl_search_vars.$genl_inverse_mode_p$.bind(NIL != sbhl_search_vars.flip_genl_inverse_modeP(UNPROVIDED, UNPROVIDED) ? makeBoolean(NIL == sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue(thread)) : sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue(thread), thread);
            SubLObject cdolist_list_var = nodes;
            SubLObject node = NIL;
            node = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                sbhl_mark_node_marked(node, sbhl_marking_vars.$sbhl_target_space$.getDynamicValue(thread));
                cdolist_list_var = cdolist_list_var.rest();
                node = cdolist_list_var.first();
            } 
        } finally {
            sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_0, thread);
        }
        return NIL;
    }

    public static SubLObject sbhl_space_p(final SubLObject v_object) {
        return hash_table_p(v_object);
    }

    public static SubLObject list_of_sbhl_space_p(final SubLObject v_object) {
        if (NIL != list_utilities.non_dotted_list_p(v_object)) {
            SubLObject cdolist_list_var = v_object;
            SubLObject subobject = NIL;
            subobject = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                if (NIL == sbhl_space_p(subobject)) {
                    return NIL;
                }
                cdolist_list_var = cdolist_list_var.rest();
                subobject = cdolist_list_var.first();
            } 
            return T;
        }
        return NIL;
    }

    public static SubLObject clear_sbhl_space(SubLObject space) {
        if (space == UNPROVIDED) {
            space = sbhl_marking_vars.$sbhl_space$.getDynamicValue();
        }
        clrhash(space);
        return NIL;
    }

    public static SubLObject empty_sbhl_space_p(final SubLObject v_object) {
        return hash_table_utilities.hash_table_empty_p(v_object);
    }

    public static SubLObject sbhl_marked_cardinality(final SubLObject space) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if ((NIL != sbhl_paranoia.sbhl_object_type_checking_p()) && (NIL == sbhl_space_p(space))) {
            final SubLObject pcase_var = sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread);
            if (pcase_var.eql($ERROR)) {
                sbhl_paranoia.sbhl_error(ONE_INTEGER, $str27$_A_is_not_a__A, space, SBHL_SPACE_P, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            } else
                if (pcase_var.eql($CERROR)) {
                    sbhl_paranoia.sbhl_cerror(ONE_INTEGER, $$$continue_anyway, $str27$_A_is_not_a__A, space, SBHL_SPACE_P, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                } else
                    if (pcase_var.eql($WARN)) {
                        Errors.warn($str27$_A_is_not_a__A, space, SBHL_SPACE_P);
                    } else {
                        Errors.warn($str32$_A_is_not_a_valid__sbhl_type_erro, sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread));
                        Errors.cerror($$$continue_anyway, $str27$_A_is_not_a__A, space, SBHL_SPACE_P);
                    }


        }
        return hash_table_count(space);
    }

    public static SubLObject sbhl_space_keys(final SubLObject space) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if ((NIL != sbhl_paranoia.sbhl_object_type_checking_p()) && (NIL == sbhl_space_p(space))) {
            final SubLObject pcase_var = sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread);
            if (pcase_var.eql($ERROR)) {
                sbhl_paranoia.sbhl_error(ONE_INTEGER, $str27$_A_is_not_a__A, space, SBHL_SPACE_P, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            } else
                if (pcase_var.eql($CERROR)) {
                    sbhl_paranoia.sbhl_cerror(ONE_INTEGER, $$$continue_anyway, $str27$_A_is_not_a__A, space, SBHL_SPACE_P, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                } else
                    if (pcase_var.eql($WARN)) {
                        Errors.warn($str27$_A_is_not_a__A, space, SBHL_SPACE_P);
                    } else {
                        Errors.warn($str32$_A_is_not_a_valid__sbhl_type_erro, sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread));
                        Errors.cerror($$$continue_anyway, $str27$_A_is_not_a__A, space, SBHL_SPACE_P);
                    }


        }
        return hash_table_utilities.hash_table_keys(space);
    }

    public static SubLObject declare_sbhl_marking_utilities_file() {
        declareFunction(me, "get_sbhl_marking_state", "GET-SBHL-MARKING-STATE", 1, 1, false);
        declareFunction(me, "sbhl_marked_with", "SBHL-MARKED-WITH", 1, 1, false);
        declareFunction(me, "sbhl_marked_node_p", "SBHL-MARKED-NODE-P", 1, 1, false);
        declareFunction(me, "sbhl_marked_p", "SBHL-MARKED-P", 1, 0, false);
        declareFunction(me, "sbhl_unmarked_p", "SBHL-UNMARKED-P", 1, 0, false);
        declareFunction(me, "sbhl_marking_contains_searcherP", "SBHL-MARKING-CONTAINS-SEARCHER?", 2, 0, false);
        declareFunction(me, "sbhl_marking_contains_all_searchersP", "SBHL-MARKING-CONTAINS-ALL-SEARCHERS?", 2, 0, false);
        declareFunction(me, "sbhl_temporal_increment", "SBHL-TEMPORAL-INCREMENT", 0, 0, false);
        declareFunction(me, "sbhl_temporal_tag_increment", "SBHL-TEMPORAL-TAG-INCREMENT", 1, 0, false);
        declareFunction(me, "sbhl_nodes_marking_non_negative_p", "SBHL-NODES-MARKING-NON-NEGATIVE-P", 1, 1, false);
        declareFunction(me, "sbhl_current_marking_exceeds_pending_marking_or_marking_threshold_p", "SBHL-CURRENT-MARKING-EXCEEDS-PENDING-MARKING-OR-MARKING-THRESHOLD-P", 1, 0, false);
        declareFunction(me, "sbhl_nodes_mark_exceeds_temporal_threshold_p", "SBHL-NODES-MARK-EXCEEDS-TEMPORAL-THRESHOLD-P", 1, 0, false);
        declareFunction(me, "sbhl_temporality_path_termination_for_searching_marked_nodes_p", "SBHL-TEMPORALITY-PATH-TERMINATION-FOR-SEARCHING-MARKED-NODES-P", 1, 0, false);
        declareFunction(me, "sbhl_current_temporal_node_not_yet_considered_p", "SBHL-CURRENT-TEMPORAL-NODE-NOT-YET-CONSIDERED-P", 0, 0, false);
        declareFunction(me, "sbhl_predicate_path_termination_p", "SBHL-PREDICATE-PATH-TERMINATION-P", 1, 0, false);
        declareFunction(me, "set_sbhl_marking_state", "SET-SBHL-MARKING-STATE", 2, 1, false);
        declareFunction(me, "set_sbhl_marking_state_to_marked", "SET-SBHL-MARKING-STATE-TO-MARKED", 1, 1, false);
        declareFunction(me, "set_sbhl_marking_state_to_unmarked", "SET-SBHL-MARKING-STATE-TO-UNMARKED", 1, 1, false);
        declareFunction(me, "sbhl_mark_node", "SBHL-MARK-NODE", 1, 1, false);
        declareFunction(me, "adjoin_to_sbhl_marking_state", "ADJOIN-TO-SBHL-MARKING-STATE", 2, 1, false);
        declareFunction(me, "prepend_to_sbhl_marking_state", "PREPEND-TO-SBHL-MARKING-STATE", 2, 1, false);
        declareFunction(me, "remove_from_sbhl_marking_state", "REMOVE-FROM-SBHL-MARKING-STATE", 2, 1, false);
        declareFunction(me, "node_unmarked_completely_in_sbhl_marking_stateP", "NODE-UNMARKED-COMPLETELY-IN-SBHL-MARKING-STATE?", 1, 1, false);
        declareFunction(me, "prune_unmarked_node_from_sbhl_marking_state", "PRUNE-UNMARKED-NODE-FROM-SBHL-MARKING-STATE", 1, 1, false);
        declareFunction(me, "increment_sbhl_marking_state", "INCREMENT-SBHL-MARKING-STATE", 2, 1, false);
        declareFunction(me, "increment_sbhl_marking_state_by_zero", "INCREMENT-SBHL-MARKING-STATE-BY-ZERO", 1, 1, false);
        declareFunction(me, "increment_sbhl_marking_state_by_minus_one", "INCREMENT-SBHL-MARKING-STATE-BY-MINUS-ONE", 1, 1, false);
        declareFunction(me, "increment_sbhl_marking_state_by_one", "INCREMENT-SBHL-MARKING-STATE-BY-ONE", 1, 1, false);
        declareFunction(me, "increment_sbhl_marking_state_by_two", "INCREMENT-SBHL-MARKING-STATE-BY-TWO", 1, 1, false);
        declareFunction(me, "set_sbhl_marking_state_to_zero", "SET-SBHL-MARKING-STATE-TO-ZERO", 1, 1, false);
        declareFunction(me, "set_sbhl_marking_state_to_depth", "SET-SBHL-MARKING-STATE-TO-DEPTH", 2, 1, false);
        declareFunction(me, "sbhl_node_marking_greater_than_depth_p", "SBHL-NODE-MARKING-GREATER-THAN-DEPTH-P", 2, 1, false);
        declareFunction(me, "sbhl_predicate_marking_fn", "SBHL-PREDICATE-MARKING-FN", 1, 1, false);
        declareFunction(me, "genl_preds_marking_fn", "GENL-PREDS-MARKING-FN", 1, 1, false);
        declareFunction(me, "genl_inverse_marking_fn", "GENL-INVERSE-MARKING-FN", 1, 1, false);
        declareFunction(me, "sbhl_predicate_unmarking_fn", "SBHL-PREDICATE-UNMARKING-FN", 1, 1, false);
        new sbhl_marking_utilities.$sbhl_predicate_unmarking_fn$UnaryFunction();
        new sbhl_marking_utilities.$sbhl_predicate_unmarking_fn$BinaryFunction();
        declareFunction(me, "genl_preds_unmarking_fn", "GENL-PREDS-UNMARKING-FN", 1, 1, false);
        declareFunction(me, "genl_inverse_unmarking_fn", "GENL-INVERSE-UNMARKING-FN", 1, 1, false);
        declareFunction(me, "sbhl_mark_node_in_precompute_space", "SBHL-MARK-NODE-IN-PRECOMPUTE-SPACE", 1, 0, false);
        declareFunction(me, "sbhl_node_marked_precompute_goal_p", "SBHL-NODE-MARKED-PRECOMPUTE-GOAL-P", 1, 0, false);
        declareFunction(me, "set_sbhl_boolean_precompute_goal_conditions", "SET-SBHL-BOOLEAN-PRECOMPUTE-GOAL-CONDITIONS", 1, 0, false);
        declareFunction(me, "sbhl_search_path_termination_p", "SBHL-SEARCH-PATH-TERMINATION-P", 1, 1, false);
        declareFunction(me, "sbhl_path_terminating_mark_p", "SBHL-PATH-TERMINATING-MARK-P", 1, 1, false);
        declareFunction(me, "sbhl_path_termination_marking_p", "SBHL-PATH-TERMINATION-MARKING-P", 1, 0, false);
        declareFunction(me, "sbhl_marked_in_terminating_space_p", "SBHL-MARKED-IN-TERMINATING-SPACE-P", 1, 0, false);
        declareFunction(me, "sbhl_marked_in_target_space_p", "SBHL-MARKED-IN-TARGET-SPACE-P", 1, 0, false);
        new sbhl_marking_utilities.$sbhl_marked_in_target_space_p$UnaryFunction();
        declareFunction(me, "sbhl_mark_node_marked", "SBHL-MARK-NODE-MARKED", 1, 1, false);
        declareFunction(me, "sbhl_mark_node_unmarked", "SBHL-MARK-NODE-UNMARKED", 1, 1, false);
        declareFunction(me, "sbhl_mark_in_target_space", "SBHL-MARK-IN-TARGET-SPACE", 1, 0, false);
        declareFunction(me, "sbhl_mark_in_target_gather_space", "SBHL-MARK-IN-TARGET-GATHER-SPACE", 1, 0, false);
        declareFunction(me, "sbhl_apply_mark_in_space", "SBHL-APPLY-MARK-IN-SPACE", 1, 0, false);
        declareFunction(me, "sbhl_apply_unmark_in_space", "SBHL-APPLY-UNMARK-IN-SPACE", 1, 0, false);
        declareFunction(me, "sbhl_generational_search_path_termination_p", "SBHL-GENERATIONAL-SEARCH-PATH-TERMINATION-P", 1, 1, false);
        declareFunction(me, "sbhl_marking_generation", "SBHL-MARKING-GENERATION", 1, 1, false);
        declareFunction(me, "sbhl_generational_mark_node_marked", "SBHL-GENERATIONAL-MARK-NODE-MARKED", 1, 1, false);
        declareFunction(me, "sbhl_generational_predicate_marking_fn", "SBHL-GENERATIONAL-PREDICATE-MARKING-FN", 1, 1, false);
        declareFunction(me, "genl_preds_generational_marking_fn", "GENL-PREDS-GENERATIONAL-MARKING-FN", 1, 1, false);
        declareFunction(me, "genl_inverse_generational_marking_fn", "GENL-INVERSE-GENERATIONAL-MARKING-FN", 1, 1, false);
        declareFunction(me, "sbhl_any_nodes_markedP", "SBHL-ANY-NODES-MARKED?", 1, 1, false);
        declareFunction(me, "sbhl_all_nodes_markedP", "SBHL-ALL-NODES-MARKED?", 1, 1, false);
        declareFunction(me, "sbhl_any_nodes_unmarkedP", "SBHL-ANY-NODES-UNMARKED?", 1, 1, false);
        declareFunction(me, "sbhl_all_nodes_unmarkedP", "SBHL-ALL-NODES-UNMARKED?", 1, 1, false);
        declareFunction(me, "all_unsearchedP", "ALL-UNSEARCHED?", 1, 0, false);
        declareFunction(me, "sbhl_all_marked_nodes", "SBHL-ALL-MARKED-NODES", 1, 1, false);
        declareFunction(me, "sbhl_all_unmarked_nodes", "SBHL-ALL-UNMARKED-NODES", 1, 1, false);
        declareFunction(me, "sbhl_marked_nodes", "SBHL-MARKED-NODES", 0, 1, false);
        declareFunction(me, "sbhl_mark_all_nodes_marked", "SBHL-MARK-ALL-NODES-MARKED", 1, 1, false);
        declareFunction(me, "sbhl_mark_all_nodes_unmarked", "SBHL-MARK-ALL-NODES-UNMARKED", 1, 1, false);
        declareFunction(me, "sbhl_mark_nodes_in_target_space", "SBHL-MARK-NODES-IN-TARGET-SPACE", 1, 0, false);
        declareFunction(me, "sbhl_mark_nodes_in_target_space_gp", "SBHL-MARK-NODES-IN-TARGET-SPACE-GP", 1, 0, false);
        declareFunction(me, "sbhl_space_p", "SBHL-SPACE-P", 1, 0, false);
        declareFunction(me, "list_of_sbhl_space_p", "LIST-OF-SBHL-SPACE-P", 1, 0, false);
        declareFunction(me, "clear_sbhl_space", "CLEAR-SBHL-SPACE", 0, 1, false);
        declareFunction(me, "empty_sbhl_space_p", "EMPTY-SBHL-SPACE-P", 1, 0, false);
        declareFunction(me, "sbhl_marked_cardinality", "SBHL-MARKED-CARDINALITY", 1, 0, false);
        declareFunction(me, "sbhl_space_keys", "SBHL-SPACE-KEYS", 1, 0, false);
        return NIL;
    }

    public static SubLObject init_sbhl_marking_utilities_file() {
        return NIL;
    }

    public static SubLObject setup_sbhl_marking_utilities_file() {
        return NIL;
    }

    @Override
    public void declareFunctions() {
        declare_sbhl_marking_utilities_file();
    }

    @Override
    public void initializeVariables() {
        init_sbhl_marking_utilities_file();
    }

    @Override
    public void runTopLevelForms() {
        setup_sbhl_marking_utilities_file();
    }

    

    public static final class $sbhl_predicate_unmarking_fn$UnaryFunction extends UnaryFunction {
        public $sbhl_predicate_unmarking_fn$UnaryFunction() {
            super(extractFunctionNamed("SBHL-PREDICATE-UNMARKING-FN"));
        }

        @Override
        public SubLObject processItem(final SubLObject arg1) {
            return sbhl_predicate_unmarking_fn(arg1, sbhl_marking_utilities.$sbhl_predicate_unmarking_fn$UnaryFunction.UNPROVIDED);
        }
    }

    public static final class $sbhl_predicate_unmarking_fn$BinaryFunction extends BinaryFunction {
        public $sbhl_predicate_unmarking_fn$BinaryFunction() {
            super(extractFunctionNamed("SBHL-PREDICATE-UNMARKING-FN"));
        }

        @Override
        public SubLObject processItem(final SubLObject arg1, final SubLObject arg2) {
            return sbhl_predicate_unmarking_fn(arg1, arg2);
        }
    }

    public static final class $sbhl_marked_in_target_space_p$UnaryFunction extends UnaryFunction {
        public $sbhl_marked_in_target_space_p$UnaryFunction() {
            super(extractFunctionNamed("SBHL-MARKED-IN-TARGET-SPACE-P"));
        }

        @Override
        public SubLObject processItem(final SubLObject arg1) {
            return sbhl_marked_in_target_space_p(arg1);
        }
    }
}

/**
 * Total time: 210 ms
 */
