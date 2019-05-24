package com.cyc.cycjava.cycl.inference.harness;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.BinaryFunction;
import com.cyc.cycjava.cycl.constant_handles;
import com.cyc.cycjava.cycl.access_macros;
import com.cyc.cycjava.cycl.utilities_macros;
import com.cyc.cycjava.cycl.backward;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.cycjava.cycl.stacks;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables;
import com.cyc.cycjava.cycl.queues;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Vectors;
import com.cyc.cycjava.cycl.number_utilities;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.cycjava.cycl.bindings;
import com.cyc.cycjava.cycl.set_contents;
import com.cyc.cycjava.cycl.variables;
import com.cyc.cycjava.cycl.cycl_utilities;
import com.cyc.cycjava.cycl.clauses;
import com.cyc.cycjava.cycl.format_nil;
import com.cyc.cycjava.cycl.control_vars;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.cycjava.cycl.list_utilities;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sort;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class inference_tactician
    extends
      SubLTranslatedFile
{
  public static final SubLFile me;
  public static final String myName = "com.cyc.cycjava.cycl.inference.harness.inference_tactician";
  public static final String myFingerPrint = "5b9b0a9ce1f0e128a0e0de79f6ad8222fb6b2fcdb56c39a1bbef365882dbe2fb";
  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-tactician.lisp", position = 2945L)
  private static SubLSymbol $strategy_auto_prune_threshold$;
  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-tactician.lisp", position = 3098L)
  private static SubLSymbol $strategy_auto_prune_step_count$;
  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-tactician.lisp", position = 3697L)
  private static SubLSymbol $strategy_sort_strategy$;
  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-tactician.lisp", position = 3773L)
  private static SubLSymbol $strategy_sort_predicate$;
  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-tactician.lisp", position = 16707L)
  private static SubLSymbol $sufficiently_good_tactic_productivity_threshold$;
  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-tactician.lisp", position = 18887L)
  private static SubLSymbol $default_early_removal_productivity_limit$;
  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-tactician.lisp", position = 23808L)
  public static SubLSymbol $set_aside_non_continuable_implies_throw_away_for_removalP$;
  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-tactician.lisp", position = 24019L)
  public static SubLSymbol $set_aside_non_continuable_implies_throw_away_for_transformationP$;
  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-tactician.lisp", position = 25853L)
  private static SubLSymbol $better_term_chosen_handlingP$;
  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-tactician.lisp", position = 25919L)
  private static SubLSymbol $better_backchain_forbidden_when_unbound_in_arg_handlingP$;
  private static final SubLSymbol $kw0$DO_ONE_STEP;
  private static final SubLSymbol $kw1$DONE_;
  private static final SubLSymbol $kw2$POSSIBLY_ACTIVATE_PROBLEM;
  private static final SubLSymbol $kw3$NEW_ARGUMENT_LINK;
  private static final SubLSymbol $sym4$STRATEGY_P;
  private static final SubLSymbol $sym5$STRATEGY_SORT_PREDICATE_;
  private static final SubLSymbol $sym6$TACTIC_STRATEGIC_PRODUCTIVITY__;
  private static final SubLSymbol $sym7$LOGICAL_TACTIC_BETTER_WRT_REMOVAL_;
  private static final SubLSymbol $kw8$TACTICAL;
  private static final SubLList $list9;
  private static final SubLList $list10;
  private static final SubLSymbol $kw11$ALLOW_OTHER_KEYS;
  private static final SubLSymbol $kw12$STATUS;
  private static final SubLSymbol $kw13$HL_MODULE;
  private static final SubLSymbol $kw14$TYPE;
  private static final SubLSymbol $kw15$DONE;
  private static final SubLSymbol $kw16$REMOVAL;
  private static final SubLSymbol $kw17$GENERALIZED_REMOVAL;
  private static final SubLSymbol $kw18$TRANSFORMATION;
  private static final SubLSymbol $sym19$DO_PROBLEM_TACTICS;
  private static final SubLSymbol $sym20$IGNORE;
  private static final SubLSymbol $sym21$PROBLEM_VAR;
  private static final SubLSymbol $sym22$TYPE_VAR;
  private static final SubLSymbol $sym23$SUBSUMING_JOIN_ORDERED_TACTICS;
  private static final SubLSymbol $sym24$CLET;
  private static final SubLSymbol $sym25$PROBLEM_MAXIMAL_SUBSUMING_MULTI_FOCAL_LITERAL_JOIN_ORDERED_TACTIC;
  private static final SubLSymbol $sym26$PUNLESS;
  private static final SubLSymbol $sym27$SOME_SUBSUMING_JOIN_ORDERED_TACTIC_;
  private static final SubLSymbol $sym28$DO_PROBLEM_UNSUBSUMED_CONNECTED_CONJUNCTION_TACTICS;
  private static final SubLSymbol $kw29$JOIN_ORDERED;
  private static final SubLSymbol $kw30$CONNECTED_CONJUNCTION;
  private static final SubLSymbol $sym31$JOIN_ORDERED_TACTIC_SUBSUMES_;
  private static final SubLSymbol $sym32$TACTIC_P;
  private static final SubLSymbol $sym33$TACTIC_PRODUCTIVITY_AND_COMPLETENESS_WORSE_;
  private static final SubLSymbol $sym34$TACTIC_PRODUCTIVITY_AND_COMPLETENESS_SUFFICIENTLY_GOOD_;
  private static final SubLSymbol $kw35$COMPLETE;
  private static final SubLSymbol $sym36$TACTIC_PRODUCTIVITY_LOWER_;
  private static final SubLSymbol $sym37$TACTIC_PRODUCTIVITY_HIGHER_;
  private static final SubLSymbol $sym38$TACTIC_PRODUCTIVITY_SUFFICIENTLY_GOOD_;
  private static final SubLSymbol $kw39$EARLY_REMOVAL_PRODUCTIVITY_LIMIT;
  private static final SubLSymbol $kw40$SKSI;
  private static final SubLSymbol $kw41$QUIESCE;
  private static final SubLString $str42$_a_execute_strategem___a__;
  private static final SubLSymbol $kw43$EXECUTE_STRATEGEM;
  private static final SubLSymbol $kw44$UNEXAMINED;
  private static final SubLSymbol $kw45$THROW_AWAY_UNINTERESTING_SET_ASIDES;
  private static final SubLSymbol $kw46$CONTINUATION_POSSIBLE_;
  private static final SubLSymbol $kw47$NEG;
  private static final SubLList $list48;
  private static final SubLSymbol $kw49$POS;
  private static final SubLObject $const50$termChosen;
  private static final SubLSymbol $sym51$VARIABLE_P;
  private static final SubLSymbol $kw52$RESIDUAL_TRANSFORMATION;
  private static final SubLSymbol $kw53$RESTRICTION;
  private static final SubLString $str54$Unexpected_strategem_type__s;
  private static final SubLString $str55$Unexpected_strategem_ype__s;
  private static final SubLString $str56$unexpected_strategem___S;
  private static final SubLList $list57;
  private static final SubLSymbol $sym58$TYPE_OF;
  private static final SubLSymbol $kw59$NEGATIVE_INFINITY;
  private static final SubLSymbol $sym60$HAPPINESS__;
  private static final SubLSymbol $sym61$HAPPINESS_P;
  private static final SubLSymbol $kw62$ERROR;
  private static final SubLString $str63$No_object_stack_for_happiness__S;
  private static final SubLString $str64$No_objects_for_happiness__S;
  private static final SubLString $str65$Removed__S_but__S_was_lowest_happ;
  private static final SubLSymbol $sym66$HAPPINESS_INDEX_P;
  private static final SubLSymbol $kw67$HAPPINESS_TABLE;
  private static final SubLSymbol $kw68$INITIALIZE_PROPERTIES;
  private static final SubLSymbol $sym69$DEFAULT_STRATEGY_INITIALIZE_PROPERTIES;
  private static final SubLSymbol $kw70$UPDATE_PROPERTIES;
  private static final SubLSymbol $sym71$DEFAULT_STRATEGY_UPDATE_PROPERTIES;
  private static final SubLSymbol $kw72$INFERENCE_DYNAMIC_PROPERTIES_UPDATED;
  private static final SubLSymbol $sym73$DEFAULT_STRATEGY_NOTE_INFERENCE_DYNAMIC_PROPERTIES_UPDATED;
  private static final SubLSymbol $kw74$INITIAL_RELEVANT_STRATEGIES;
  private static final SubLSymbol $kw75$SPLIT_TACTICS_POSSIBLE;
  private static final SubLSymbol $kw76$NEW_TACTIC;
  private static final SubLSymbol $kw77$PROBLEM_NOTHING_TO_DO_;
  private static final SubLSymbol $kw78$PROBLEM_COULD_BE_PENDING;
  private static final SubLSymbol $kw79$RECONSIDER_SET_ASIDES;
  private static final SubLSymbol $kw80$PEEK_NEXT_STRATEGEM;
  private static final SubLSymbol $sym81$STRATEGEM_P;
  private static final SubLSymbol $kw82$MOTIVATE_STRATEGEM;
  private static final SubLSymbol $kw83$ACTIVATE_STRATEGEM;
  private static final SubLSymbol $kw84$LINK_HEAD_MOTIVATED_;
  private static final SubLSymbol $sym85$SPLIT_TACTIC_P;
  private static final SubLSymbol $kw86$RECONSIDER_SPLIT_SET_ASIDES;

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-tactician.lisp", position = 1129L)
  public static SubLObject strategy_do_one_step(final SubLObject strategy)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    strategy_possibly_auto_prune( strategy );
    final SubLObject _prev_bind_0 = inference_macros.$controlling_strategy$.currentBinding( thread );
    try
    {
      inference_macros.$controlling_strategy$.bind( strategy, thread );
      inference_datastructures_strategy.increment_strategy_step_count( strategy );
      inference_datastructures_inference.increment_inference_step_count( inference_datastructures_strategy.strategy_inference( strategy ) );
      inference_datastructures_inference.increment_inference_cumulative_step_count( inference_datastructures_strategy.strategy_inference( strategy ) );
      inference_datastructures_strategy.strategy_dispatch( strategy, $kw0$DO_ONE_STEP, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
    }
    finally
    {
      inference_macros.$controlling_strategy$.rebind( _prev_bind_0, thread );
    }
    inference_metrics.inference_possibly_update_tick_indexed_progress_data( inference_macros.current_controlling_inference() );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-tactician.lisp", position = 1767L)
  public static SubLObject strategy_doneP(final SubLObject strategy)
  {
    return inference_datastructures_strategy.strategy_dispatch( strategy, $kw1$DONE_, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-tactician.lisp", position = 1857L)
  public static SubLObject strategy_note_tactic_finished(final SubLObject strategy, final SubLObject tactic)
  {
    inference_datastructures_strategy.problem_note_tactic_not_strategically_possible( inference_datastructures_tactic.tactic_problem( tactic ), tactic, strategy );
    inference_worker.consider_strategic_ramifications_of_executed_tactic( strategy, tactic );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-tactician.lisp", position = 2210L)
  public static SubLObject strategy_possibly_activate_problem(final SubLObject strategy, final SubLObject problem)
  {
    return inference_datastructures_strategy.strategy_dispatch( strategy, $kw2$POSSIBLY_ACTIVATE_PROBLEM, problem, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-tactician.lisp", position = 2385L)
  public static SubLObject strategy_note_argument_link_added(final SubLObject strategy, final SubLObject link)
  {
    return inference_datastructures_strategy.strategy_dispatch( strategy, $kw3$NEW_ARGUMENT_LINK, link, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-tactician.lisp", position = 2609L)
  public static SubLObject strategy_do_problem_store_prune(final SubLObject strategy)
  {
    final SubLObject store = inference_datastructures_strategy.strategy_problem_store( strategy );
    return inference_worker.prune_problem_store( store, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-tactician.lisp", position = 3150L)
  public static SubLObject clear_strategy_step_count()
  {
    $strategy_auto_prune_step_count$.setDynamicValue( ZERO_INTEGER );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-tactician.lisp", position = 3256L)
  public static SubLObject strategy_possibly_auto_prune(final SubLObject strategy)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    inference_strategist.inference_possibly_prune_processed_proofs( inference_datastructures_strategy.strategy_inference( strategy ) );
    if( NIL != $strategy_auto_prune_threshold$.getDynamicValue( thread ) )
    {
      if( $strategy_auto_prune_step_count$.getDynamicValue( thread ).numGE( $strategy_auto_prune_threshold$.getDynamicValue( thread ) ) )
      {
        inference_worker.prune_problem_store( inference_datastructures_strategy.strategy_problem_store( strategy ), UNPROVIDED );
        clear_strategy_step_count();
      }
      $strategy_auto_prune_step_count$.setDynamicValue( Numbers.add( $strategy_auto_prune_step_count$.getDynamicValue( thread ), ONE_INTEGER ), thread );
      return $strategy_auto_prune_step_count$.getDynamicValue( thread );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-tactician.lisp", position = 3826L)
  public static SubLObject strategy_sort(final SubLObject strategy, SubLObject sequence, final SubLObject predicate)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    assert NIL != inference_datastructures_strategy.strategy_p( strategy ) : strategy;
    final SubLObject _prev_bind_0 = $strategy_sort_strategy$.currentBinding( thread );
    final SubLObject _prev_bind_2 = $strategy_sort_predicate$.currentBinding( thread );
    try
    {
      $strategy_sort_strategy$.bind( strategy, thread );
      $strategy_sort_predicate$.bind( predicate, thread );
      sequence = Sort.stable_sort( sequence, $sym5$STRATEGY_SORT_PREDICATE_, UNPROVIDED );
    }
    finally
    {
      $strategy_sort_predicate$.rebind( _prev_bind_2, thread );
      $strategy_sort_strategy$.rebind( _prev_bind_0, thread );
    }
    return sequence;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-tactician.lisp", position = 4246L)
  public static SubLObject strategy_sort_predicateP(final SubLObject object1, final SubLObject object2)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    return Functions.funcall( $strategy_sort_predicate$.getDynamicValue( thread ), object1, object2, $strategy_sort_strategy$.getDynamicValue( thread ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-tactician.lisp", position = 4401L)
  public static SubLObject tactic_strategic_productivity_L(final SubLObject tactic1, final SubLObject tactic2, final SubLObject strategy)
  {
    return inference_datastructures_enumerated_types.productivity_L( inference_datastructures_strategy.tactic_strategic_productivity( tactic1, strategy ), inference_datastructures_strategy.tactic_strategic_productivity(
        tactic2, strategy ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-tactician.lisp", position = 4618L)
  public static SubLObject logical_tactic_better_wrt_removalP(final SubLObject logical_tactic1, final SubLObject logical_tactic2, final SubLObject strategy)
  {
    final SubLObject lookahead_problem1 = logical_tactic_lookahead_problem_wrt_removal( logical_tactic1, strategy );
    final SubLObject lookahead_problem2 = logical_tactic_lookahead_problem_wrt_removal( logical_tactic2, strategy );
    return inference_datastructures_enumerated_types.productivity_L( inference_lookahead_productivity.memoized_problem_max_removal_productivity( lookahead_problem1, strategy ), inference_lookahead_productivity
        .memoized_problem_max_removal_productivity( lookahead_problem2, strategy ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-tactician.lisp", position = 5116L)
  public static SubLObject logical_tactic_lookahead_problem_wrt_removal(final SubLObject logical_tactic, final SubLObject strategy)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL != inference_worker_join.join_tactic_p( logical_tactic ) )
    {
      thread.resetMultipleValues();
      final SubLObject first_problem = inference_worker_join.join_tactic_lookahead_problems( logical_tactic );
      final SubLObject second_problem = thread.secondMultipleValue();
      thread.resetMultipleValues();
      return ( NIL != inference_datastructures_enumerated_types.productivity_L( inference_lookahead_productivity.memoized_problem_max_removal_productivity( first_problem, strategy ), inference_lookahead_productivity
          .memoized_problem_max_removal_productivity( second_problem, strategy ) ) ) ? second_problem : first_problem;
    }
    return inference_worker.logical_tactic_lookahead_problem( logical_tactic );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-tactician.lisp", position = 5628L)
  public static SubLObject controlling_strategic_context(final SubLObject strategic_context)
  {
    if( $kw8$TACTICAL == strategic_context )
    {
      return $kw8$TACTICAL;
    }
    return controlling_strategy( strategic_context );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-tactician.lisp", position = 5881L)
  public static SubLObject controlling_strategy(final SubLObject strategy)
  {
    return inference_datastructures_inference.simplest_inference_strategy( inference_datastructures_strategy.strategy_inference( strategy ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-tactician.lisp", position = 6147L)
  public static SubLObject controlling_strategyP(final SubLObject strategy)
  {
    return makeBoolean( NIL != inference_datastructures_strategy.strategy_p( strategy ) && strategy.eql( controlling_strategy( strategy ) ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-tactician.lisp", position = 6369L)
  public static SubLObject substrategyP(final SubLObject strategy)
  {
    return makeBoolean( NIL != inference_datastructures_strategy.strategy_p( strategy ) && !strategy.eql( controlling_strategy( strategy ) ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-tactician.lisp", position = 6589L)
  public static SubLObject strategy_controls_problem_storeP(final SubLObject strategy)
  {
    return makeBoolean( NIL != controlling_strategyP( strategy ) && NIL != inference_datastructures_inference.inference_problem_store_privateP( inference_datastructures_strategy.strategy_inference( strategy ) ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-tactician.lisp", position = 6772L)
  public static SubLObject do_problem_unsubsumed_tactics(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list9 );
    final SubLObject temp = current.rest();
    current = current.first();
    SubLObject tactic_var = NIL;
    SubLObject problem = NIL;
    SubLObject strategic_context = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list9 );
    tactic_var = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list9 );
    problem = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list9 );
    strategic_context = current.first();
    current = current.rest();
    SubLObject allow_other_keys_p = NIL;
    SubLObject rest = current;
    SubLObject bad = NIL;
    SubLObject current_$1 = NIL;
    while ( NIL != rest)
    {
      cdestructuring_bind.destructuring_bind_must_consp( rest, datum, $list9 );
      current_$1 = rest.first();
      rest = rest.rest();
      cdestructuring_bind.destructuring_bind_must_consp( rest, datum, $list9 );
      if( NIL == conses_high.member( current_$1, $list10, UNPROVIDED, UNPROVIDED ) )
      {
        bad = T;
      }
      if( current_$1 == $kw11$ALLOW_OTHER_KEYS )
      {
        allow_other_keys_p = rest.first();
      }
      rest = rest.rest();
    }
    if( NIL != bad && NIL == allow_other_keys_p )
    {
      cdestructuring_bind.cdestructuring_bind_error( datum, $list9 );
    }
    final SubLObject status_tail = cdestructuring_bind.property_list_member( $kw12$STATUS, current );
    final SubLObject status = ( NIL != status_tail ) ? conses_high.cadr( status_tail ) : NIL;
    final SubLObject hl_module_tail = cdestructuring_bind.property_list_member( $kw13$HL_MODULE, current );
    final SubLObject hl_module = ( NIL != hl_module_tail ) ? conses_high.cadr( hl_module_tail ) : NIL;
    final SubLObject type_tail = cdestructuring_bind.property_list_member( $kw14$TYPE, current );
    final SubLObject type = ( NIL != type_tail ) ? conses_high.cadr( type_tail ) : NIL;
    final SubLObject done_tail = cdestructuring_bind.property_list_member( $kw15$DONE, current );
    final SubLObject done = ( NIL != done_tail ) ? conses_high.cadr( done_tail ) : NIL;
    final SubLObject body;
    current = ( body = temp );
    final SubLObject pcase_var = type;
    if( pcase_var.eql( $kw16$REMOVAL ) || pcase_var.eql( $kw17$GENERALIZED_REMOVAL ) || pcase_var.eql( $kw18$TRANSFORMATION ) )
    {
      return ConsesLow.listS( $sym19$DO_PROBLEM_TACTICS, ConsesLow.list( new SubLObject[] { tactic_var, problem, $kw12$STATUS, status, $kw13$HL_MODULE, hl_module, $kw14$TYPE, type, $kw15$DONE, done
      } ), ConsesLow.list( $sym20$IGNORE, strategic_context ), ConsesLow.append( body, NIL ) );
    }
    final SubLObject problem_var = $sym21$PROBLEM_VAR;
    final SubLObject type_var = $sym22$TYPE_VAR;
    final SubLObject subsuming_join_ordered_tactics = $sym23$SUBSUMING_JOIN_ORDERED_TACTICS;
    return ConsesLow.list( $sym24$CLET, ConsesLow.list( ConsesLow.list( problem_var, problem ), ConsesLow.list( type_var, type ), ConsesLow.list( subsuming_join_ordered_tactics, ConsesLow.list(
        $sym25$PROBLEM_MAXIMAL_SUBSUMING_MULTI_FOCAL_LITERAL_JOIN_ORDERED_TACTIC, problem_var, type_var ) ) ), ConsesLow.list( $sym19$DO_PROBLEM_TACTICS, ConsesLow.list( new SubLObject[]
        { tactic_var, problem_var, $kw12$STATUS, status, $kw13$HL_MODULE, hl_module, $kw14$TYPE, type_var, $kw15$DONE, done
    } ), ConsesLow.listS( $sym26$PUNLESS, ConsesLow.list( $sym27$SOME_SUBSUMING_JOIN_ORDERED_TACTIC_, tactic_var, subsuming_join_ordered_tactics, strategic_context ), ConsesLow.append( body, NIL ) ) ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-tactician.lisp", position = 7860L)
  public static SubLObject problem_maximal_subsuming_multi_focal_literal_join_ordered_tactics(final SubLObject problem, final SubLObject relevant_tactic_type)
  {
    SubLObject result = NIL;
    if( NIL == relevant_tactic_type || relevant_tactic_type == $kw29$JOIN_ORDERED || relevant_tactic_type == $kw30$CONNECTED_CONJUNCTION )
    {
      SubLObject cdolist_list_var = inference_datastructures_problem.problem_tactics( problem );
      SubLObject join_ordered_tactic = NIL;
      join_ordered_tactic = cdolist_list_var.first();
      while ( NIL != cdolist_list_var)
      {
        if( NIL != inference_datastructures_problem.do_problem_tactics_type_match( join_ordered_tactic, $kw29$JOIN_ORDERED ) && NIL == inference_worker_join_ordered.single_focal_literal_join_ordered_tactic_p(
            join_ordered_tactic ) )
        {
          result = ConsesLow.cons( join_ordered_tactic, result );
        }
        cdolist_list_var = cdolist_list_var.rest();
        join_ordered_tactic = cdolist_list_var.first();
      }
      result = list_utilities.delete_subsumed_items( result, $sym31$JOIN_ORDERED_TACTIC_SUBSUMES_, UNPROVIDED );
      result = Sequences.nreverse( result );
    }
    return result;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-tactician.lisp", position = 8567L)
  public static SubLObject some_subsuming_join_ordered_tacticP(final SubLObject join_ordered_tactic, final SubLObject subsuming_join_ordered_tactics, final SubLObject strategic_context)
  {
    SubLObject subsumedP = NIL;
    if( NIL != subsuming_join_ordered_tactics && NIL != inference_worker_join_ordered.join_ordered_tactic_p( join_ordered_tactic ) && NIL == subsumedP )
    {
      SubLObject csome_list_var = subsuming_join_ordered_tactics;
      SubLObject candidate_subsuming_tactic = NIL;
      candidate_subsuming_tactic = csome_list_var.first();
      while ( NIL == subsumedP && NIL != csome_list_var)
      {
        if( !join_ordered_tactic.eql( candidate_subsuming_tactic ) && NIL != inference_worker_join_ordered.join_ordered_tactic_subsumesP( candidate_subsuming_tactic, join_ordered_tactic )
            && NIL == consider_subsumed_join_ordered_tacticP( candidate_subsuming_tactic, join_ordered_tactic, strategic_context ) )
        {
          subsumedP = T;
        }
        csome_list_var = csome_list_var.rest();
        candidate_subsuming_tactic = csome_list_var.first();
      }
    }
    return subsumedP;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-tactician.lisp", position = 9283L)
  public static SubLObject consider_subsumed_join_ordered_tacticP(final SubLObject subsuming_tactic, final SubLObject subsumed_tactic, final SubLObject strategic_context)
  {
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-tactician.lisp", position = 10169L)
  public static SubLObject select_problem_tactic(final SubLObject problem, final SubLObject strategic_context, final SubLObject compare_func, final SubLObject sufficient_func, final SubLObject key_func,
      SubLObject status, SubLObject completeness, SubLObject hl_module, SubLObject type)
  {
    if( status == UNPROVIDED )
    {
      status = NIL;
    }
    if( completeness == UNPROVIDED )
    {
      completeness = NIL;
    }
    if( hl_module == UNPROVIDED )
    {
      hl_module = NIL;
    }
    if( type == UNPROVIDED )
    {
      type = NIL;
    }
    SubLObject currently_selected_tactic = NIL;
    SubLObject current_key = NIL;
    SubLObject some_tactic_set_asideP = NIL;
    SubLObject sufficient_tactic_foundP = NIL;
    final SubLObject type_var = type;
    final SubLObject subsuming_join_ordered_tactics = problem_maximal_subsuming_multi_focal_literal_join_ordered_tactics( problem, type_var );
    SubLObject rest;
    SubLObject candidate_tactic;
    SubLObject candidate_key;
    for( rest = NIL, rest = inference_datastructures_problem.problem_tactics( problem ); NIL == sufficient_tactic_foundP && NIL != rest; rest = rest.rest() )
    {
      candidate_tactic = rest.first();
      if( NIL != inference_datastructures_problem.do_problem_tactics_type_match( candidate_tactic, type_var ) && NIL != inference_datastructures_problem.do_problem_tactics_status_match( candidate_tactic, status )
          && NIL != inference_datastructures_problem.do_problem_tactics_hl_module_match( candidate_tactic, hl_module ) && NIL == some_subsuming_join_ordered_tacticP( candidate_tactic, subsuming_join_ordered_tactics,
              strategic_context ) && ( NIL == completeness || completeness.eql( inference_datastructures_strategy.tactic_strategic_dwimmed_completeness( candidate_tactic, strategic_context ) ) ) )
      {
        if( NIL == inference_datastructures_strategy.strategy_p( strategic_context ) || NIL == inference_tactician_strategic_uninterestingness.simple_strategy_chooses_to_throw_away_tacticP( strategic_context,
            candidate_tactic ) )
        {
          if( NIL != inference_datastructures_strategy.strategy_p( strategic_context ) && NIL != inference_tactician_strategic_uninterestingness.simple_strategy_chooses_to_set_aside_tacticP( strategic_context,
              candidate_tactic ) )
          {
            some_tactic_set_asideP = T;
          }
          else if( NIL == currently_selected_tactic )
          {
            currently_selected_tactic = candidate_tactic;
            current_key = ( ( NIL != key_func ) ? Functions.funcall( key_func, currently_selected_tactic, strategic_context ) : currently_selected_tactic );
            sufficient_tactic_foundP = ( NIL != sufficient_func ) ? Functions.funcall( sufficient_func, current_key, strategic_context ) : NIL;
          }
          else
          {
            candidate_key = ( ( NIL != key_func ) ? Functions.funcall( key_func, candidate_tactic, strategic_context ) : candidate_tactic );
            if( NIL != Functions.funcall( compare_func, current_key, candidate_key, strategic_context ) )
            {
              currently_selected_tactic = candidate_tactic;
              current_key = candidate_key;
              sufficient_tactic_foundP = ( NIL != sufficient_func ) ? Functions.funcall( sufficient_func, current_key, strategic_context ) : NIL;
            }
          }
        }
      }
    }
    return Values.values( currently_selected_tactic, current_key, some_tactic_set_asideP );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-tactician.lisp", position = 12751L)
  public static SubLObject choose_between_tactics(final SubLObject tactic1, final SubLObject tactic2, final SubLObject strategic_context, final SubLObject compare_func)
  {
    SubLObject chosen_tactic = NIL;
    if( NIL == tactic1 )
    {
      assert NIL != inference_datastructures_tactic.tactic_p( tactic2 ) : tactic2;
      chosen_tactic = tactic2;
    }
    else if( NIL == tactic2 )
    {
      assert NIL != inference_datastructures_tactic.tactic_p( tactic1 ) : tactic1;
      chosen_tactic = tactic1;
    }
    else
    {
      assert NIL != inference_datastructures_tactic.tactic_p( tactic1 ) : tactic1;
      assert NIL != inference_datastructures_tactic.tactic_p( tactic2 ) : tactic2;
      if( NIL != Functions.funcall( compare_func, tactic2, tactic1, strategic_context ) )
      {
        chosen_tactic = tactic2;
      }
      else
      {
        chosen_tactic = tactic1;
      }
    }
    return chosen_tactic;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-tactician.lisp", position = 13272L)
  public static SubLObject select_best_tactic_for_problem(final SubLObject problem, final SubLObject strategic_context, SubLObject status, SubLObject completeness, SubLObject module, SubLObject type)
  {
    if( status == UNPROVIDED )
    {
      status = NIL;
    }
    if( completeness == UNPROVIDED )
    {
      completeness = NIL;
    }
    if( module == UNPROVIDED )
    {
      module = NIL;
    }
    if( type == UNPROVIDED )
    {
      type = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    thread.resetMultipleValues();
    final SubLObject tactic = select_problem_tactic( problem, strategic_context, $sym33$TACTIC_PRODUCTIVITY_AND_COMPLETENESS_WORSE_, $sym34$TACTIC_PRODUCTIVITY_AND_COMPLETENESS_SUFFICIENTLY_GOOD_, NIL, status,
        completeness, module, type );
    final SubLObject key = thread.secondMultipleValue();
    final SubLObject some_tactic_set_asideP = thread.thirdMultipleValue();
    thread.resetMultipleValues();
    return Values.values( tactic, some_tactic_set_asideP );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-tactician.lisp", position = 14443L)
  public static SubLObject productivity_and_completeness_worseP(final SubLObject new_productivity, final SubLObject new_completeness, final SubLObject old_productivity, final SubLObject old_completeness)
  {
    return makeBoolean( NIL != inference_datastructures_enumerated_types.completeness_L( new_completeness, old_completeness ) || ( NIL == inference_datastructures_enumerated_types.completeness_G( new_completeness,
        old_completeness ) && NIL != inference_datastructures_enumerated_types.productivity_G( new_productivity, old_productivity ) ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-tactician.lisp", position = 14974L)
  public static SubLObject productivity_and_completeness_betterP(final SubLObject new_productivity, final SubLObject new_completeness, final SubLObject old_productivity, final SubLObject old_completeness)
  {
    return makeBoolean( NIL != inference_datastructures_enumerated_types.completeness_G( new_completeness, old_completeness ) || ( NIL == inference_datastructures_enumerated_types.completeness_L( new_completeness,
        old_completeness ) && NIL != inference_datastructures_enumerated_types.productivity_L( new_productivity, old_productivity ) ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-tactician.lisp", position = 15507L)
  public static SubLObject tactic_productivity_and_completeness_worseP(final SubLObject tactic1, final SubLObject tactic2, final SubLObject strategic_context)
  {
    final SubLObject tactic1_productivity = inference_datastructures_strategy.tactic_strategic_productivity( tactic1, strategic_context );
    final SubLObject tactic1_completeness = inference_datastructures_strategy.tactic_strategic_dwimmed_completeness( tactic1, strategic_context );
    final SubLObject tactic2_productivity = inference_datastructures_strategy.tactic_strategic_productivity( tactic2, strategic_context );
    final SubLObject tactic2_completeness = inference_datastructures_strategy.tactic_strategic_dwimmed_completeness( tactic2, strategic_context );
    return productivity_and_completeness_worseP( tactic1_productivity, tactic1_completeness, tactic2_productivity, tactic2_completeness );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-tactician.lisp", position = 16109L)
  public static SubLObject tactic_productivity_and_completeness_betterP(final SubLObject tactic1, final SubLObject tactic2, final SubLObject strategic_context)
  {
    final SubLObject tactic1_productivity = inference_datastructures_strategy.tactic_strategic_productivity( tactic1, strategic_context );
    final SubLObject tactic1_completeness = inference_datastructures_strategy.tactic_strategic_dwimmed_completeness( tactic1, strategic_context );
    final SubLObject tactic2_productivity = inference_datastructures_strategy.tactic_strategic_productivity( tactic2, strategic_context );
    final SubLObject tactic2_completeness = inference_datastructures_strategy.tactic_strategic_dwimmed_completeness( tactic2, strategic_context );
    return productivity_and_completeness_betterP( tactic1_productivity, tactic1_completeness, tactic2_productivity, tactic2_completeness );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-tactician.lisp", position = 16912L)
  public static SubLObject tactic_productivity_and_completeness_sufficiently_goodP(final SubLObject tactic, final SubLObject strategic_context)
  {
    final SubLObject tactic_productivity = inference_datastructures_strategy.tactic_strategic_productivity( tactic, strategic_context );
    final SubLObject tactic_completeness = inference_datastructures_strategy.tactic_strategic_dwimmed_completeness( tactic, strategic_context );
    final SubLObject sufficient_productivity = $sufficiently_good_tactic_productivity_threshold$.getGlobalValue();
    final SubLObject sufficient_completeness = $kw35$COMPLETE;
    return productivity_and_completeness_betterP( tactic_productivity, tactic_completeness, sufficient_productivity, sufficient_completeness );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-tactician.lisp", position = 17464L)
  public static SubLObject choose_less_productive_tactic(final SubLObject tactic1, final SubLObject tactic2, final SubLObject strategic_context)
  {
    final SubLObject better_func = $sym36$TACTIC_PRODUCTIVITY_LOWER_;
    final SubLObject better_tactic = choose_between_tactics( tactic1, tactic2, strategic_context, better_func );
    final SubLObject sufficient_tacticP = tactic_productivity_sufficiently_goodP( better_tactic, strategic_context );
    return Values.values( better_tactic, sufficient_tacticP );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-tactician.lisp", position = 17885L)
  public static SubLObject tactic_productivity_higherP(final SubLObject tactic1, final SubLObject tactic2, final SubLObject strategic_context)
  {
    final SubLObject tactic1_productivity = inference_datastructures_strategy.tactic_strategic_productivity( tactic1, strategic_context );
    final SubLObject tactic2_productivity = inference_datastructures_strategy.tactic_strategic_productivity( tactic2, strategic_context );
    return inference_datastructures_enumerated_types.productivity_G( tactic1_productivity, tactic2_productivity );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-tactician.lisp", position = 18219L)
  public static SubLObject tactic_productivity_lowerP(final SubLObject tactic1, final SubLObject tactic2, final SubLObject strategic_context)
  {
    final SubLObject tactic1_productivity = inference_datastructures_strategy.tactic_strategic_productivity( tactic1, strategic_context );
    final SubLObject tactic2_productivity = inference_datastructures_strategy.tactic_strategic_productivity( tactic2, strategic_context );
    return inference_datastructures_enumerated_types.productivity_L( tactic1_productivity, tactic2_productivity );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-tactician.lisp", position = 18552L)
  public static SubLObject tactic_productivity_sufficiently_goodP(final SubLObject tactic, final SubLObject strategic_context)
  {
    final SubLObject tactic_productivity = inference_datastructures_strategy.tactic_strategic_productivity( tactic, strategic_context );
    final SubLObject sufficient_productivity = $sufficiently_good_tactic_productivity_threshold$.getGlobalValue();
    return inference_datastructures_enumerated_types.productivity_L( tactic_productivity, sufficient_productivity );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-tactician.lisp", position = 19049L)
  public static SubLObject early_removal_productivity_limit(final SubLObject strategic_context)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( strategic_context == $kw8$TACTICAL )
    {
      return $default_early_removal_productivity_limit$.getDynamicValue( thread );
    }
    return strategy_early_removal_productivity_limit( strategic_context );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-tactician.lisp", position = 19328L)
  public static SubLObject strategy_early_removal_productivity_limit(final SubLObject strategy)
  {
    return inference_datastructures_strategy.strategy_dispatch( strategy, $kw39$EARLY_REMOVAL_PRODUCTIVITY_LIMIT, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-tactician.lisp", position = 19472L)
  public static SubLObject candidate_early_removal_tacticP(final SubLObject tactic)
  {
    assert NIL != inference_datastructures_tactic.tactic_p( tactic ) : tactic;
    return makeBoolean( NIL != inference_worker_join_ordered.join_ordered_tactic_p( tactic ) && $kw35$COMPLETE == inference_worker.problem_generalized_removal_completeness( inference_worker_join_ordered
        .join_ordered_tactic_lookahead_problem( tactic ), $kw8$TACTICAL ) && NIL != join_ordered_tactic_early_removal_cheapP( tactic ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-tactician.lisp", position = 19925L)
  public static SubLObject join_ordered_tactic_early_removal_cheapP(final SubLObject jo_tactic)
  {
    final SubLObject jo_link = inference_worker_join_ordered.join_ordered_tactic_link( jo_tactic );
    return join_ordered_link_early_removal_cheapP( jo_link, $kw8$TACTICAL );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-tactician.lisp", position = 20123L)
  public static SubLObject join_ordered_link_early_removal_cheapP(final SubLObject jo_link, final SubLObject strategic_context)
  {
    final SubLObject early_removal_productivity_threshold = early_removal_productivity_limit( strategic_context );
    if( NIL == early_removal_productivity_threshold )
    {
      return NIL;
    }
    final SubLObject focal_problem = inference_worker_join_ordered.join_ordered_link_focal_problem( jo_link );
    if( NIL != problem_has_a_non_sksi_tacticP( focal_problem ) )
    {
      final SubLObject productivity = inference_lookahead_productivity.memoized_problem_max_removal_productivity( focal_problem, strategic_context );
      return inference_datastructures_enumerated_types.productivity_LE( productivity, early_removal_productivity_threshold );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-tactician.lisp", position = 20715L)
  public static SubLObject problem_has_a_non_sksi_tacticP(final SubLObject problem)
  {
    SubLObject non_sksi_tactic_foundP;
    SubLObject rest;
    SubLObject tactic;
    for( non_sksi_tactic_foundP = NIL, rest = NIL, rest = inference_datastructures_problem.problem_tactics( problem ); NIL == non_sksi_tactic_foundP && NIL != rest; rest = rest.rest() )
    {
      tactic = rest.first();
      if( NIL == list_utilities.member_eqP( $kw40$SKSI, inference_modules.hl_module_subtypes( inference_datastructures_tactic.tactic_hl_module( tactic ) ) ) )
      {
        non_sksi_tactic_foundP = T;
      }
    }
    return non_sksi_tactic_foundP;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-tactician.lisp", position = 21028L)
  public static SubLObject strategy_quiesce(final SubLObject strategy)
  {
    return inference_datastructures_strategy.strategy_dispatch( strategy, $kw41$QUIESCE, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-tactician.lisp", position = 21233L)
  public static SubLObject strategy_execute_strategem(final SubLObject strategy, final SubLObject strategem)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( control_vars.$inference_trace_level$.getDynamicValue( thread ).numGE( ONE_INTEGER ) )
    {
      format_nil.force_format( T, $str42$_a_execute_strategem___a__, strategy, strategem, NIL, NIL, NIL, NIL, NIL, NIL );
    }
    possibly_clean_strategem( strategy, strategem );
    return inference_datastructures_strategy.strategy_dispatch( strategy, $kw43$EXECUTE_STRATEGEM, strategem, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-tactician.lisp", position = 21511L)
  public static SubLObject possibly_clean_strategem(final SubLObject strategy, final SubLObject strategem)
  {
    if( NIL != inference_worker_union.union_tactic_p( strategem ) )
    {
      return inference_worker_union.possibly_clean_union_tactic( strategem );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-tactician.lisp", position = 21733L)
  public static SubLObject strategy_execute_tactic(final SubLObject strategy, final SubLObject tactic)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    assert NIL != inference_datastructures_strategy.strategy_p( strategy ) : strategy;
    assert NIL != inference_datastructures_tactic.tactic_p( tactic ) : tactic;
    if( NIL != inference_datastructures_tactic.tactic_possibleP( tactic ) )
    {
      inference_datastructures_inference.inference_note_tactic_executed( inference_datastructures_strategy.strategy_inference( strategy ), tactic );
      final SubLObject _prev_bind_0 = inference_macros.$controlling_strategy$.currentBinding( thread );
      try
      {
        inference_macros.$controlling_strategy$.bind( strategy, thread );
        inference_worker.execute_tactic( tactic );
      }
      finally
      {
        inference_macros.$controlling_strategy$.rebind( _prev_bind_0, thread );
      }
      return tactic;
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-tactician.lisp", position = 22501L)
  public static SubLObject strategy_possibly_execute_tactic(final SubLObject strategy, final SubLObject tactic)
  {
    return list_utilities.sublisp_boolean( strategy_execute_tactic( strategy, tactic ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-tactician.lisp", position = 22702L)
  public static SubLObject strategy_make_problem_set_aside(final SubLObject strategy, final SubLObject problem)
  {
    if( NIL != inference_datastructures_problem.problem_relevant_to_strategyP( problem, strategy ) )
    {
      inference_worker.possibly_note_problem_pending( problem, strategy );
    }
    return inference_datastructures_strategy.strategy_note_problem_set_aside( strategy, problem );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-tactician.lisp", position = 23257L)
  public static SubLObject possibly_clear_strategic_status_wrt(final SubLObject problem, final SubLObject strategy)
  {
    if( $kw44$UNEXAMINED != inference_datastructures_strategy.problem_weak_strategic_status( problem, strategy ) )
    {
      clear_strategic_status_wrt( problem, strategy );
      return T;
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-tactician.lisp", position = 23595L)
  public static SubLObject clear_strategic_status_wrt(final SubLObject problem, final SubLObject strategy)
  {
    inference_datastructures_strategy.problem_note_all_tactics_not_strategically_possible( problem, strategy );
    inference_worker.note_problem_strategically_unexamined( problem, strategy );
    return strategy;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-tactician.lisp", position = 24217L)
  public static SubLObject strategy_set_aside_non_continuable_implies_throw_awayP(final SubLObject strategy)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    return ( NIL != removal_tactician.removal_strategy_p( strategy ) ) ? $set_aside_non_continuable_implies_throw_away_for_removalP$.getDynamicValue( thread )
        : ( ( NIL != transformation_tactician_datastructures.transformation_strategy_p( strategy ) ) ? $set_aside_non_continuable_implies_throw_away_for_transformationP$.getDynamicValue( thread ) : T );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-tactician.lisp", position = 24562L)
  public static SubLObject strategy_throw_away_uninteresting_set_asides(final SubLObject strategy)
  {
    return inference_datastructures_strategy.strategy_dispatch( strategy, $kw45$THROW_AWAY_UNINTERESTING_SET_ASIDES, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-tactician.lisp", position = 24712L)
  public static SubLObject strategy_throws_away_all_transformationP(final SubLObject strategy)
  {
    return makeBoolean( NIL == inference_datastructures_problem_store.problem_store_transformation_allowedP( inference_datastructures_strategy.strategy_problem_store( strategy ) )
        || ( NIL != strategy_set_aside_non_continuable_implies_throw_awayP( strategy ) && NIL == inference_datastructures_inference.inference_continuableP( inference_datastructures_strategy.strategy_inference(
            strategy ) ) && NIL != strategy_sets_aside_all_transformationP( strategy ) ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-tactician.lisp", position = 25253L)
  public static SubLObject strategy_sets_aside_all_transformationP(final SubLObject strategy)
  {
    return makeBoolean( NIL == inference_worker.problem_transformation_allowed_wrt_max_transformation_depthP( inference_datastructures_strategy.strategy_inference( strategy ), inference_datastructures_strategy
        .strategy_root_problem( strategy ) ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-tactician.lisp", position = 25544L)
  public static SubLObject strategy_continuation_possibleP(final SubLObject strategy)
  {
    return inference_datastructures_strategy.strategy_dispatch( strategy, $kw46$CONTINUATION_POSSIBLE_, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-tactician.lisp", position = 26071L)
  public static SubLObject better_term_chosen_handlingP()
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    return $better_term_chosen_handlingP$.getDynamicValue( thread );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-tactician.lisp", position = 26162L)
  public static SubLObject transformation_link_leads_to_term_chosen_dead_endP(final SubLObject t_link)
  {
    if( NIL == better_term_chosen_handlingP() )
    {
      return NIL;
    }
    return list_utilities.sublisp_boolean( transformation_link_term_chosen_dead_end_vars( t_link ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-tactician.lisp", position = 26479L)
  public static SubLObject transformation_link_term_chosen_dead_end_vars(final SubLObject t_link)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject supported_problem = inference_datastructures_problem_link.problem_link_supported_problem( t_link );
    final SubLObject supported_predicate = inference_datastructures_problem.single_literal_problem_predicate( supported_problem );
    final SubLObject supported_mt = inference_datastructures_problem.single_literal_problem_mt( supported_problem );
    final SubLObject supporting_problem = inference_worker_transformation.transformation_link_supporting_problem( t_link );
    return list_utilities.fast_delete_duplicates( ConsesLow.nconc( problem_term_chosen_dead_end_vars( supporting_problem ), ( NIL != $better_backchain_forbidden_when_unbound_in_arg_handlingP$.getDynamicValue( thread ) )
        ? inference_worker_transformation.inference_backchain_forbidden_unless_arg_chosen_argnums( supported_predicate, supported_mt )
        : NIL ), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-tactician.lisp", position = 27265L)
  public static SubLObject problem_term_chosen_dead_end_vars(final SubLObject problem)
  {
    SubLObject vars = NIL;
    SubLObject cdolist_list_var = inference_datastructures_problem.problem_query( problem );
    SubLObject contextualized_clause = NIL;
    contextualized_clause = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      SubLObject sense = $kw47$NEG;
      SubLObject index_var = ZERO_INTEGER;
      SubLObject cdolist_list_var_$2 = clauses.neg_lits( contextualized_clause );
      SubLObject contextualized_asent = NIL;
      contextualized_asent = cdolist_list_var_$2.first();
      while ( NIL != cdolist_list_var_$2)
      {
        SubLObject current;
        final SubLObject datum = current = contextualized_asent;
        SubLObject mt = NIL;
        SubLObject asent = NIL;
        cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list48 );
        mt = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list48 );
        asent = current.first();
        current = current.rest();
        if( NIL == current )
        {
          if( $kw49$POS == sense && NIL != cycl_utilities.atomic_sentence_with_pred_p( asent, $const50$termChosen ) && NIL != variables.not_fully_bound_p( asent ) )
          {
            SubLObject cdolist_list_var_$3 = cycl_utilities.expression_gather( asent, $sym51$VARIABLE_P, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
            SubLObject var = NIL;
            var = cdolist_list_var_$3.first();
            while ( NIL != cdolist_list_var_$3)
            {
              vars = ConsesLow.cons( var, vars );
              cdolist_list_var_$3 = cdolist_list_var_$3.rest();
              var = cdolist_list_var_$3.first();
            }
          }
        }
        else
        {
          cdestructuring_bind.cdestructuring_bind_error( datum, $list48 );
        }
        index_var = Numbers.add( index_var, ONE_INTEGER );
        cdolist_list_var_$2 = cdolist_list_var_$2.rest();
        contextualized_asent = cdolist_list_var_$2.first();
      }
      sense = $kw49$POS;
      index_var = ZERO_INTEGER;
      SubLObject cdolist_list_var_$4 = clauses.pos_lits( contextualized_clause );
      contextualized_asent = NIL;
      contextualized_asent = cdolist_list_var_$4.first();
      while ( NIL != cdolist_list_var_$4)
      {
        SubLObject current;
        final SubLObject datum = current = contextualized_asent;
        SubLObject mt = NIL;
        SubLObject asent = NIL;
        cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list48 );
        mt = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list48 );
        asent = current.first();
        current = current.rest();
        if( NIL == current )
        {
          if( $kw49$POS == sense && NIL != cycl_utilities.atomic_sentence_with_pred_p( asent, $const50$termChosen ) && NIL != variables.not_fully_bound_p( asent ) )
          {
            SubLObject cdolist_list_var_$5 = cycl_utilities.expression_gather( asent, $sym51$VARIABLE_P, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
            SubLObject var = NIL;
            var = cdolist_list_var_$5.first();
            while ( NIL != cdolist_list_var_$5)
            {
              vars = ConsesLow.cons( var, vars );
              cdolist_list_var_$5 = cdolist_list_var_$5.rest();
              var = cdolist_list_var_$5.first();
            }
          }
        }
        else
        {
          cdestructuring_bind.cdestructuring_bind_error( datum, $list48 );
        }
        index_var = Numbers.add( index_var, ONE_INTEGER );
        cdolist_list_var_$4 = cdolist_list_var_$4.rest();
        contextualized_asent = cdolist_list_var_$4.first();
      }
      cdolist_list_var = cdolist_list_var.rest();
      contextualized_clause = cdolist_list_var.first();
    }
    return list_utilities.fast_delete_duplicates( vars, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-tactician.lisp", position = 27681L)
  public static SubLObject all_restricted_non_focals_around_transformation_link(final SubLObject t_link)
  {
    SubLObject problems = NIL;
    final SubLObject supported_problem = inference_datastructures_problem_link.problem_link_supported_problem( t_link );
    final SubLObject set_contents_var = inference_datastructures_problem.problem_dependent_links( supported_problem );
    SubLObject basis_object;
    SubLObject state;
    SubLObject jo_link_var;
    SubLObject jo_link_var_$6;
    SubLObject motivating_conjunction_problem;
    SubLObject set_contents_var_$7;
    SubLObject basis_object_$8;
    SubLObject state_$9;
    SubLObject rt_link;
    SubLObject motivating_jo_link;
    SubLObject supported_problem_$10;
    SubLObject supported_problem_needed_vars;
    SubLObject set_contents_var_$8;
    SubLObject basis_object_$9;
    SubLObject state_$10;
    SubLObject candidate_jo_link;
    SubLObject link_var;
    SubLObject set_contents_var_$9;
    SubLObject basis_object_$10;
    SubLObject state_$11;
    SubLObject restriction_link;
    SubLObject restricted_non_focal_problem;
    for( basis_object = set_contents.do_set_contents_basis_object( set_contents_var ), state = NIL, state = set_contents.do_set_contents_initial_state( basis_object, set_contents_var ); NIL == set_contents
        .do_set_contents_doneP( basis_object, state ); state = set_contents.do_set_contents_update_state( state ) )
    {
      jo_link_var = set_contents.do_set_contents_next( basis_object, state );
      if( NIL != set_contents.do_set_contents_element_validP( state, jo_link_var ) && NIL != inference_datastructures_problem_link.problem_link_has_typeP( jo_link_var, $kw29$JOIN_ORDERED ) )
      {
        jo_link_var_$6 = jo_link_var;
        motivating_conjunction_problem = inference_datastructures_problem_link.problem_link_supported_problem( jo_link_var_$6 );
        set_contents_var_$7 = inference_datastructures_problem.problem_argument_links( motivating_conjunction_problem );
        for( basis_object_$8 = set_contents.do_set_contents_basis_object( set_contents_var_$7 ), state_$9 = NIL, state_$9 = set_contents.do_set_contents_initial_state( basis_object_$8,
            set_contents_var_$7 ); NIL == set_contents.do_set_contents_doneP( basis_object_$8, state_$9 ); state_$9 = set_contents.do_set_contents_update_state( state_$9 ) )
        {
          rt_link = set_contents.do_set_contents_next( basis_object_$8, state_$9 );
          if( NIL != set_contents.do_set_contents_element_validP( state_$9, rt_link ) && NIL != inference_datastructures_problem_link.problem_link_has_typeP( rt_link, $kw52$RESIDUAL_TRANSFORMATION )
              && NIL != inference_worker_residual_transformation.residual_transformation_link_motivated_by_join_ordered_linkP( rt_link, jo_link_var_$6 ) && NIL != inference_worker_residual_transformation
                  .residual_transformation_link_motivated_by_transformation_linkP( rt_link, t_link ) )
          {
            motivating_jo_link = inference_worker_residual_transformation.residual_transformation_link_motivating_join_ordered_link( rt_link );
            supported_problem_$10 = inference_datastructures_problem_link.problem_link_supported_problem( rt_link );
            supported_problem_needed_vars = supported_problem_needed_term_chosen_vars( rt_link );
            set_contents_var_$8 = inference_datastructures_problem.problem_argument_links( supported_problem_$10 );
            for( basis_object_$9 = set_contents.do_set_contents_basis_object( set_contents_var_$8 ), state_$10 = NIL, state_$10 = set_contents.do_set_contents_initial_state( basis_object_$9,
                set_contents_var_$8 ); NIL == set_contents.do_set_contents_doneP( basis_object_$9, state_$10 ); state_$10 = set_contents.do_set_contents_update_state( state_$10 ) )
            {
              candidate_jo_link = set_contents.do_set_contents_next( basis_object_$9, state_$10 );
              if( NIL != set_contents.do_set_contents_element_validP( state_$10, candidate_jo_link ) && NIL != inference_datastructures_problem_link.problem_link_has_typeP( candidate_jo_link, $kw29$JOIN_ORDERED )
                  && !candidate_jo_link.eql( motivating_jo_link ) && NIL != focal_problem_binds_all_varsP( candidate_jo_link, supported_problem_needed_vars ) )
              {
                link_var = candidate_jo_link;
                set_contents_var_$9 = inference_datastructures_problem.problem_argument_links( inference_worker_join_ordered.join_ordered_link_non_focal_problem( link_var ) );
                for( basis_object_$10 = set_contents.do_set_contents_basis_object( set_contents_var_$9 ), state_$11 = NIL, state_$11 = set_contents.do_set_contents_initial_state( basis_object_$10,
                    set_contents_var_$9 ); NIL == set_contents.do_set_contents_doneP( basis_object_$10, state_$11 ); state_$11 = set_contents.do_set_contents_update_state( state_$11 ) )
                {
                  restriction_link = set_contents.do_set_contents_next( basis_object_$10, state_$11 );
                  if( NIL != set_contents.do_set_contents_element_validP( state_$11, restriction_link ) && NIL != inference_datastructures_problem_link.problem_link_has_typeP( restriction_link, $kw53$RESTRICTION )
                      && NIL != inference_worker_join_ordered.non_focal_restriction_link_with_corresponding_focal_proofP( restriction_link, link_var ) )
                  {
                    restricted_non_focal_problem = inference_datastructures_problem_link.problem_link_sole_supporting_problem( restriction_link );
                    problems = ConsesLow.cons( restricted_non_focal_problem, problems );
                  }
                }
              }
            }
          }
        }
      }
    }
    return Sequences.nreverse( problems );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-tactician.lisp", position = 28882L)
  public static SubLObject supported_problem_needed_term_chosen_vars(final SubLObject rt_link)
  {
    final SubLObject residual_conjunction_mapped_problem = inference_worker_residual_transformation.residual_transformation_link_supporting_mapped_problem( rt_link );
    final SubLObject residual_conjunction_to_supported_variable_map = inference_worker_residual_transformation.residual_transformation_link_residual_conjunction_to_motivating_conjunction_variable_map( rt_link );
    final SubLObject residual_conjunction_problem_needed_vars = problem_term_chosen_dead_end_vars( inference_datastructures_problem_link.mapped_problem_problem( residual_conjunction_mapped_problem ) );
    final SubLObject supported_problem_needed_vars = bindings.apply_bindings( residual_conjunction_to_supported_variable_map, residual_conjunction_problem_needed_vars );
    return supported_problem_needed_vars;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-tactician.lisp", position = 29828L)
  public static SubLObject focal_problem_binds_all_varsP(final SubLObject jo_link, final SubLObject vars)
  {
    final SubLObject focal_to_supported_variable_map = inference_worker_join_ordered.join_ordered_link_focal_to_supported_variable_map( jo_link );
    final SubLObject focal_problem_bound_vars = inference_datastructures_problem.problem_variables( inference_worker_join_ordered.join_ordered_link_focal_problem( jo_link ) );
    final SubLObject supported_problem_bound_vars = bindings.apply_bindings( focal_to_supported_variable_map, focal_problem_bound_vars );
    return conses_high.subsetp( vars, supported_problem_bound_vars, UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-tactician.lisp", position = 30517L)
  public static SubLObject strategem_p(final SubLObject v_object)
  {
    return makeBoolean( NIL != executable_strategem_p( v_object ) || NIL != motivation_strategem_p( v_object ) || NIL != inference_datastructures_problem.problem_p( v_object ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-tactician.lisp", position = 30769L)
  public static SubLObject executable_strategem_p(final SubLObject v_object)
  {
    return makeBoolean( NIL != inference_worker.content_tactic_p( v_object ) || NIL != inference_worker.meta_structural_tactic_p( v_object ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-tactician.lisp", position = 30897L)
  public static SubLObject strategem_invalid_p(final SubLObject strategem)
  {
    if( NIL != inference_datastructures_tactic.tactic_p( strategem ) )
    {
      return inference_datastructures_tactic.tactic_invalid_p( strategem );
    }
    if( NIL != inference_datastructures_problem_link.problem_link_p( strategem ) )
    {
      return inference_datastructures_problem_link.problem_link_invalid_p( strategem );
    }
    if( NIL != inference_datastructures_problem.problem_p( strategem ) )
    {
      return inference_datastructures_problem.problem_invalid_p( strategem );
    }
    return Errors.error( $str54$Unexpected_strategem_type__s, strategem );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-tactician.lisp", position = 31275L)
  public static SubLObject strategem_problem(final SubLObject strategem)
  {
    if( NIL != inference_datastructures_tactic.tactic_p( strategem ) )
    {
      return inference_datastructures_tactic.tactic_problem( strategem );
    }
    if( NIL != inference_datastructures_problem_link.problem_link_p( strategem ) )
    {
      return inference_datastructures_problem_link.problem_link_supported_problem( strategem );
    }
    if( NIL != inference_datastructures_problem.problem_p( strategem ) )
    {
      return strategem;
    }
    return Errors.error( $str55$Unexpected_strategem_ype__s, strategem );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-tactician.lisp", position = 31652L)
  public static SubLObject strategem_supported_object(final SubLObject strategem)
  {
    if( NIL != inference_worker_answer.answer_link_p( strategem ) )
    {
      return inference_datastructures_problem_link.problem_link_supported_object( strategem );
    }
    return strategem_problem( strategem );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-tactician.lisp", position = 31924L)
  public static SubLObject motivation_strategem_p(final SubLObject v_object)
  {
    return makeBoolean( NIL != inference_worker.logical_tactic_p( v_object ) || NIL != motivation_strategem_link_p( v_object ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-tactician.lisp", position = 32272L)
  public static SubLObject motivation_strategem_link_p(final SubLObject v_object)
  {
    return makeBoolean( NIL != inference_worker_transformation.transformation_link_p( v_object ) || NIL != inference_worker_answer.answer_link_p( v_object ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-tactician.lisp", position = 32545L)
  public static SubLObject removal_strategem_p(final SubLObject v_object)
  {
    return makeBoolean( NIL != inference_worker_removal.generalized_removal_tactic_p( v_object ) || NIL != inference_worker_rewrite.rewrite_tactic_p( v_object ) || NIL != inference_worker.logical_tactic_p( v_object )
        || NIL != inference_worker.meta_structural_tactic_p( v_object ) || NIL != inference_worker_answer.answer_link_p( v_object ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-tactician.lisp", position = 32824L)
  public static SubLObject transformation_strategem_p(final SubLObject v_object)
  {
    return makeBoolean( NIL != inference_worker_transformation.transformation_tactic_p( v_object ) || NIL != inference_worker.logical_tactic_p( v_object ) || NIL != inference_worker.meta_structural_tactic_p( v_object )
        || NIL != motivation_strategem_link_p( v_object ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-tactician.lisp", position = 33095L)
  public static SubLObject strategem_suid(final SubLObject strategem)
  {
    if( NIL != inference_datastructures_tactic.tactic_p( strategem ) )
    {
      return inference_datastructures_tactic.tactic_suid( strategem );
    }
    if( NIL != inference_datastructures_problem_link.problem_link_p( strategem ) )
    {
      return inference_datastructures_problem_link.problem_link_suid( strategem );
    }
    if( NIL != inference_datastructures_problem.problem_p( strategem ) )
    {
      return inference_datastructures_problem.problem_suid( strategem );
    }
    return Errors.error( $str56$unexpected_strategem___S, strategem );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-tactician.lisp", position = 33451L)
  public static SubLObject strategem_L(final SubLObject strategem1, final SubLObject strategem2)
  {
    final SubLObject object1 = strategem_supported_object( strategem1 );
    final SubLObject object2 = strategem_supported_object( strategem2 );
    if( NIL != inference_datastructures_inference.inference_p( object1 ) )
    {
      if( NIL != inference_datastructures_inference.inference_p( object2 ) )
      {
        return Numbers.numL( strategem_suid( strategem1 ), strategem_suid( strategem2 ) );
      }
      return T;
    }
    else
    {
      if( NIL != inference_datastructures_inference.inference_p( object2 ) )
      {
        return NIL;
      }
      if( !object1.eql( object2 ) )
      {
        return Numbers.numL( inference_datastructures_problem.problem_suid( object1 ), inference_datastructures_problem.problem_suid( object1 ) );
      }
      if( Types.type_of( strategem1 ).eql( Types.type_of( strategem2 ) ) )
      {
        return Numbers.numL( strategem_suid( strategem1 ), strategem_suid( strategem2 ) );
      }
      return list_utilities.position_L( strategem1, strategem2, $list57, Symbols.symbol_function( EQ ), Symbols.symbol_function( $sym58$TYPE_OF ) );
    }
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-tactician.lisp", position = 34534L)
  public static SubLObject inference_strategy_type(final SubLObject strategy_type, final SubLObject plist)
  {
    return inference_datastructures_strategy.new_strategy_type( strategy_type, plist );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-tactician.lisp", position = 34723L)
  public static SubLObject strategy_type_dispatch_handler(final SubLObject strategy_type, final SubLObject method_type)
  {
    return inference_datastructures_strategy.strategy_type_property( strategy_type, method_type );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-tactician.lisp", position = 34889L)
  public static SubLObject happiness_p(final SubLObject v_object)
  {
    return number_utilities.potentially_infinite_integer_p( v_object );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-tactician.lisp", position = 35242L)
  public static SubLObject happiness_E(final SubLObject happiness1, final SubLObject happiness2)
  {
    return number_utilities.potentially_infinite_integer_E( happiness1, happiness2 );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-tactician.lisp", position = 35361L)
  public static SubLObject happiness_L(final SubLObject happiness1, final SubLObject happiness2)
  {
    return number_utilities.potentially_infinite_integer_L( happiness1, happiness2 );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-tactician.lisp", position = 35480L)
  public static SubLObject happiness_G(final SubLObject happiness1, final SubLObject happiness2)
  {
    return number_utilities.potentially_infinite_integer_G( happiness1, happiness2 );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-tactician.lisp", position = 35599L)
  public static SubLObject happiness_min(final SubLObject happiness1, final SubLObject happiness2)
  {
    return ( NIL != happiness_L( happiness1, happiness2 ) ) ? happiness1 : happiness2;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-tactician.lisp", position = 35729L)
  public static SubLObject happiness_max(final SubLObject happiness1, final SubLObject happiness2)
  {
    return ( NIL != happiness_G( happiness1, happiness2 ) ) ? happiness1 : happiness2;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-tactician.lisp", position = 35859L)
  public static SubLObject minimal_happiness()
  {
    return $kw59$NEGATIVE_INFINITY;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-tactician.lisp", position = 35927L)
  public static SubLObject happiness_index_p(final SubLObject v_object)
  {
    return makeBoolean( v_object.isVector() && TWO_INTEGER.numE( Sequences.length( v_object ) ) && Vectors.aref( v_object, ZERO_INTEGER ).isHashtable() && NIL != queues.priority_queue_p( Vectors.aref( v_object,
        ONE_INTEGER ) ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-tactician.lisp", position = 36140L)
  public static SubLObject new_happiness_index()
  {
    final SubLObject happiness_to_objects = Hashtables.make_hash_table( ZERO_INTEGER, Symbols.symbol_function( EQL ), UNPROVIDED );
    final SubLObject greatest_happiness_index = queues.create_p_queue( NIL, Symbols.symbol_function( IDENTITY ), $sym60$HAPPINESS__ );
    return Vectors.vector( new SubLObject[] { happiness_to_objects, greatest_happiness_index
    } );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-tactician.lisp", position = 36464L)
  public static SubLObject happiness_index_clear(final SubLObject happiness_index)
  {
    Hashtables.clrhash( Vectors.aref( happiness_index, ZERO_INTEGER ) );
    queues.p_queue_clear( Vectors.aref( happiness_index, ONE_INTEGER ) );
    return happiness_index;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-tactician.lisp", position = 36634L)
  public static SubLObject happiness_index_empty_p(final SubLObject happiness_index)
  {
    final SubLObject greatest_happiness_index = Vectors.aref( happiness_index, ONE_INTEGER );
    return queues.p_queue_empty_p( greatest_happiness_index );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-tactician.lisp", position = 36812L)
  public static SubLObject happiness_index_add(final SubLObject happiness_index, final SubLObject happiness, final SubLObject v_object)
  {
    assert NIL != happiness_p( happiness ) : happiness;
    final SubLObject happiness_to_objects = Vectors.aref( happiness_index, ZERO_INTEGER );
    SubLObject object_stack = Hashtables.gethash_without_values( happiness, happiness_to_objects, NIL );
    if( NIL == object_stack )
    {
      object_stack = stacks.create_stack();
      Hashtables.sethash( happiness, happiness_to_objects, object_stack );
    }
    if( NIL != stacks.stack_empty_p( object_stack ) )
    {
      final SubLObject greatest_happiness_index = Vectors.aref( happiness_index, ONE_INTEGER );
      queues.p_enqueue( happiness, greatest_happiness_index );
    }
    stacks.stack_push( v_object, object_stack );
    return happiness_index;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-tactician.lisp", position = 37429L)
  public static SubLObject happiness_index_peek(final SubLObject happiness_index)
  {
    SubLObject v_object = NIL;
    SubLObject expected_happiness = NIL;
    final SubLObject happiness_to_objects = Vectors.aref( happiness_index, ZERO_INTEGER );
    final SubLObject greatest_happiness_index = Vectors.aref( happiness_index, ONE_INTEGER );
    final SubLObject greatest_happiness = queues.p_queue_best( greatest_happiness_index );
    final SubLObject object_stack = Hashtables.gethash_without_values( greatest_happiness, happiness_to_objects, $kw62$ERROR );
    if( $kw62$ERROR == object_stack )
    {
      Errors.error( $str63$No_object_stack_for_happiness__S, greatest_happiness );
    }
    else if( NIL != stacks.stack_empty_p( object_stack ) )
    {
      Errors.error( $str64$No_objects_for_happiness__S, greatest_happiness );
    }
    else
    {
      v_object = stacks.stack_peek( object_stack );
      expected_happiness = greatest_happiness;
    }
    return Values.values( v_object, expected_happiness );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-tactician.lisp", position = 38156L)
  public static SubLObject happiness_index_next(final SubLObject happiness_index)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject v_object = NIL;
    SubLObject expected_happiness = NIL;
    final SubLObject happiness_to_objects = Vectors.aref( happiness_index, ZERO_INTEGER );
    final SubLObject greatest_happiness_index = Vectors.aref( happiness_index, ONE_INTEGER );
    final SubLObject greatest_happiness = queues.p_queue_best( greatest_happiness_index );
    final SubLObject object_stack = Hashtables.gethash_without_values( greatest_happiness, happiness_to_objects, $kw62$ERROR );
    if( $kw62$ERROR == object_stack )
    {
      Errors.error( $str63$No_object_stack_for_happiness__S, greatest_happiness );
    }
    else if( NIL != stacks.stack_empty_p( object_stack ) )
    {
      Errors.error( $str64$No_objects_for_happiness__S, greatest_happiness );
    }
    else
    {
      v_object = stacks.stack_pop( object_stack );
      expected_happiness = greatest_happiness;
      if( NIL != stacks.stack_empty_p( object_stack ) )
      {
        final SubLObject removed_happiness = queues.p_dequeue( greatest_happiness_index, UNPROVIDED );
        if( NIL == Errors.$ignore_mustsP$.getDynamicValue( thread ) && NIL == happiness_E( removed_happiness, greatest_happiness ) )
        {
          Errors.error( $str65$Removed__S_but__S_was_lowest_happ, removed_happiness, greatest_happiness );
        }
      }
    }
    return Values.values( v_object, expected_happiness );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-tactician.lisp", position = 39144L)
  public static SubLObject happiness_index_contents(final SubLObject happiness_index)
  {
    assert NIL != happiness_index_p( happiness_index ) : happiness_index;
    final SubLObject happiness_to_objects = Vectors.aref( happiness_index, ZERO_INTEGER );
    final SubLObject greatest_happiness_index = Vectors.aref( happiness_index, ONE_INTEGER );
    SubLObject happiness_contents = NIL;
    SubLObject cdolist_list_var = queues.p_queue_elements( greatest_happiness_index );
    SubLObject happiness = NIL;
    happiness = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      final SubLObject object_stack = Hashtables.gethash_without_values( happiness, happiness_to_objects, $kw62$ERROR );
      SubLObject objects = NIL;
      SubLObject cdolist_list_var_$17 = stacks.do_stack_elements_stack_elements( object_stack );
      SubLObject v_object = NIL;
      v_object = cdolist_list_var_$17.first();
      while ( NIL != cdolist_list_var_$17)
      {
        objects = ConsesLow.cons( v_object, objects );
        cdolist_list_var_$17 = cdolist_list_var_$17.rest();
        v_object = cdolist_list_var_$17.first();
      }
      objects = Sequences.nreverse( objects );
      happiness_contents = ConsesLow.cons( ConsesLow.list( happiness, objects ), happiness_contents );
      cdolist_list_var = cdolist_list_var.rest();
      happiness = cdolist_list_var.first();
    }
    happiness_contents = Sequences.nreverse( happiness_contents );
    return happiness_contents;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-tactician.lisp", position = 39829L)
  public static SubLObject happiness_index_size(final SubLObject happiness_index)
  {
    SubLObject size = ZERO_INTEGER;
    final SubLObject happiness_to_objects = Vectors.aref( happiness_index, ZERO_INTEGER );
    final SubLObject greatest_happiness_index = Vectors.aref( happiness_index, ONE_INTEGER );
    SubLObject cdolist_list_var = queues.p_queue_elements( greatest_happiness_index );
    SubLObject happiness = NIL;
    happiness = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      final SubLObject object_stack = Hashtables.gethash_without_values( happiness, happiness_to_objects, UNPROVIDED );
      size = Numbers.add( size, stacks.stack_size( object_stack ) );
      cdolist_list_var = cdolist_list_var.rest();
      happiness = cdolist_list_var.first();
    }
    return size;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-tactician.lisp", position = 40238L)
  public static SubLObject strategy_happiness_table(final SubLObject strategy)
  {
    return inference_datastructures_strategy.strategy_dispatch( strategy, $kw67$HAPPINESS_TABLE, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-tactician.lisp", position = 40365L)
  public static SubLObject strategy_initialize_properties(final SubLObject strategy, final SubLObject strategy_static_properties)
  {
    return inference_datastructures_strategy.strategy_dispatch( strategy, $kw68$INITIALIZE_PROPERTIES, strategy_static_properties, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-tactician.lisp", position = 40563L)
  public static SubLObject default_strategy_initialize_properties(final SubLObject strategy, final SubLObject strategy_static_properties)
  {
    inference_datastructures_strategy.set_strategy_properties( strategy, strategy_static_properties );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-tactician.lisp", position = 40742L)
  public static SubLObject strategy_update_properties(final SubLObject strategy, final SubLObject strategy_dynamic_properties)
  {
    return inference_datastructures_strategy.strategy_dispatch( strategy, $kw70$UPDATE_PROPERTIES, strategy_dynamic_properties, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-tactician.lisp", position = 40912L)
  public static SubLObject default_strategy_update_properties(final SubLObject strategy, final SubLObject strategy_dynamic_properties)
  {
    inference_datastructures_strategy.set_strategy_properties( strategy, strategy_dynamic_properties );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-tactician.lisp", position = 41089L)
  public static SubLObject strategy_note_inference_dynamic_properties_updated(final SubLObject strategy)
  {
    return inference_datastructures_strategy.strategy_dispatch( strategy, $kw72$INFERENCE_DYNAMIC_PROPERTIES_UPDATED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-tactician.lisp", position = 41339L)
  public static SubLObject default_strategy_note_inference_dynamic_properties_updated(final SubLObject strategy)
  {
    inference_datastructures_strategy.note_strategy_should_reconsider_set_asides( strategy );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-tactician.lisp", position = 41503L)
  public static SubLObject strategy_initial_relevant_strategies(final SubLObject strategy)
  {
    return inference_datastructures_strategy.strategy_dispatch( strategy, $kw74$INITIAL_RELEVANT_STRATEGIES, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-tactician.lisp", position = 41711L)
  public static SubLObject default_strategy_initial_relevant_strategies(final SubLObject strategy)
  {
    return ConsesLow.list( strategy );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-tactician.lisp", position = 41811L)
  public static SubLObject strategy_note_split_tactics_strategically_possible(final SubLObject strategy, final SubLObject split_tactics)
  {
    return inference_datastructures_strategy.strategy_dispatch( strategy, $kw75$SPLIT_TACTICS_POSSIBLE, split_tactics, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-tactician.lisp", position = 41982L)
  public static SubLObject strategy_note_tactic_discarded(final SubLObject strategy, final SubLObject tactic)
  {
    if( NIL == inference_tactician_strategic_uninterestingness.simple_strategy_chooses_to_ignore_tacticP( strategy, tactic ) )
    {
      inference_datastructures_strategy.problem_note_tactic_not_strategically_possible( inference_datastructures_tactic.tactic_problem( tactic ), tactic, strategy );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-tactician.lisp", position = 42228L)
  public static SubLObject strategy_note_new_tactic(final SubLObject strategy, final SubLObject tactic)
  {
    return inference_datastructures_strategy.strategy_dispatch( strategy, $kw76$NEW_TACTIC, tactic, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-tactician.lisp", position = 42444L)
  public static SubLObject strategy_no_possible_strategems_for_problemP(final SubLObject strategy, final SubLObject problem)
  {
    return inference_datastructures_strategy.strategy_dispatch( strategy, $kw77$PROBLEM_NOTHING_TO_DO_, problem, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-tactician.lisp", position = 42597L)
  public static SubLObject strategy_consider_that_problem_could_be_strategically_pending(final SubLObject strategy, final SubLObject problem)
  {
    return inference_datastructures_strategy.strategy_dispatch( strategy, $kw78$PROBLEM_COULD_BE_PENDING, problem, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-tactician.lisp", position = 42769L)
  public static SubLObject strategy_consider_that_problem_could_be_no_good(final SubLObject strategy, final SubLObject problem, final SubLObject consider_deepP, final SubLObject consider_transformation_tacticsP)
  {
    return inference_worker.default_consider_that_problem_could_be_no_good( strategy, problem, consider_deepP, consider_transformation_tacticsP );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-tactician.lisp", position = 43026L)
  public static SubLObject strategy_reconsider_set_asides(final SubLObject strategy)
  {
    final SubLObject result = inference_datastructures_strategy.strategy_dispatch( strategy, $kw79$RECONSIDER_SET_ASIDES, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
    inference_datastructures_strategy.clear_strategy_should_reconsider_set_asides( strategy );
    return result;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-tactician.lisp", position = 43236L)
  public static SubLObject substrategy_do_one_step(final SubLObject strategy)
  {
    inference_datastructures_strategy.increment_strategy_step_count( strategy );
    inference_datastructures_strategy.strategy_dispatch( strategy, $kw0$DO_ONE_STEP, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-tactician.lisp", position = 43503L)
  public static SubLObject substrategy_peek_next_strategem(final SubLObject substrategy)
  {
    assert NIL != inference_datastructures_strategy.strategy_p( substrategy ) : substrategy;
    return inference_datastructures_strategy.strategy_dispatch( substrategy, $kw80$PEEK_NEXT_STRATEGEM, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-tactician.lisp", position = 43668L)
  public static SubLObject substrategy_motivate_strategem(final SubLObject substrategy, final SubLObject strategem)
  {
    assert NIL != inference_datastructures_strategy.strategy_p( substrategy ) : substrategy;
    assert NIL != strategem_p( strategem ) : strategem;
    return inference_datastructures_strategy.strategy_dispatch( substrategy, $kw82$MOTIVATE_STRATEGEM, strategem, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-tactician.lisp", position = 43888L)
  public static SubLObject substrategy_activate_strategem(final SubLObject substrategy, final SubLObject strategem)
  {
    assert NIL != inference_datastructures_strategy.strategy_p( substrategy ) : substrategy;
    assert NIL != strategem_p( strategem ) : strategem;
    return inference_datastructures_strategy.strategy_dispatch( substrategy, $kw83$ACTIVATE_STRATEGEM, strategem, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-tactician.lisp", position = 44108L)
  public static SubLObject substrategy_link_head_motivatedP(final SubLObject substrategy, final SubLObject link_head)
  {
    assert NIL != inference_datastructures_strategy.strategy_p( substrategy ) : substrategy;
    return inference_datastructures_strategy.strategy_dispatch( substrategy, $kw84$LINK_HEAD_MOTIVATED_, link_head, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-tactician.lisp", position = 44327L)
  public static SubLObject substrategy_reconsider_split_set_asides(final SubLObject substrategy, final SubLObject split_tactic)
  {
    assert NIL != inference_datastructures_strategy.strategy_p( substrategy ) : substrategy;
    assert NIL != inference_worker_split.split_tactic_p( split_tactic ) : split_tactic;
    return inference_datastructures_strategy.strategy_dispatch( substrategy, $kw86$RECONSIDER_SPLIT_SET_ASIDES, split_tactic, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
  }

  public static SubLObject declare_inference_tactician_file()
  {
    SubLFiles.declareFunction( me, "strategy_do_one_step", "STRATEGY-DO-ONE-STEP", 1, 0, false );
    SubLFiles.declareFunction( me, "strategy_doneP", "STRATEGY-DONE?", 1, 0, false );
    SubLFiles.declareFunction( me, "strategy_note_tactic_finished", "STRATEGY-NOTE-TACTIC-FINISHED", 2, 0, false );
    SubLFiles.declareFunction( me, "strategy_possibly_activate_problem", "STRATEGY-POSSIBLY-ACTIVATE-PROBLEM", 2, 0, false );
    SubLFiles.declareFunction( me, "strategy_note_argument_link_added", "STRATEGY-NOTE-ARGUMENT-LINK-ADDED", 2, 0, false );
    SubLFiles.declareFunction( me, "strategy_do_problem_store_prune", "STRATEGY-DO-PROBLEM-STORE-PRUNE", 1, 0, false );
    SubLFiles.declareFunction( me, "clear_strategy_step_count", "CLEAR-STRATEGY-STEP-COUNT", 0, 0, false );
    SubLFiles.declareFunction( me, "strategy_possibly_auto_prune", "STRATEGY-POSSIBLY-AUTO-PRUNE", 1, 0, false );
    SubLFiles.declareFunction( me, "strategy_sort", "STRATEGY-SORT", 3, 0, false );
    SubLFiles.declareFunction( me, "strategy_sort_predicateP", "STRATEGY-SORT-PREDICATE?", 2, 0, false );
    new $strategy_sort_predicateP$BinaryFunction();
    SubLFiles.declareFunction( me, "tactic_strategic_productivity_L", "TACTIC-STRATEGIC-PRODUCTIVITY-<", 3, 0, false );
    SubLFiles.declareFunction( me, "logical_tactic_better_wrt_removalP", "LOGICAL-TACTIC-BETTER-WRT-REMOVAL?", 3, 0, false );
    SubLFiles.declareFunction( me, "logical_tactic_lookahead_problem_wrt_removal", "LOGICAL-TACTIC-LOOKAHEAD-PROBLEM-WRT-REMOVAL", 2, 0, false );
    SubLFiles.declareFunction( me, "controlling_strategic_context", "CONTROLLING-STRATEGIC-CONTEXT", 1, 0, false );
    SubLFiles.declareFunction( me, "controlling_strategy", "CONTROLLING-STRATEGY", 1, 0, false );
    SubLFiles.declareFunction( me, "controlling_strategyP", "CONTROLLING-STRATEGY?", 1, 0, false );
    SubLFiles.declareFunction( me, "substrategyP", "SUBSTRATEGY?", 1, 0, false );
    SubLFiles.declareFunction( me, "strategy_controls_problem_storeP", "STRATEGY-CONTROLS-PROBLEM-STORE?", 1, 0, false );
    SubLFiles.declareMacro( me, "do_problem_unsubsumed_tactics", "DO-PROBLEM-UNSUBSUMED-TACTICS" );
    SubLFiles.declareFunction( me, "problem_maximal_subsuming_multi_focal_literal_join_ordered_tactics", "PROBLEM-MAXIMAL-SUBSUMING-MULTI-FOCAL-LITERAL-JOIN-ORDERED-TACTICS", 2, 0, false );
    SubLFiles.declareFunction( me, "some_subsuming_join_ordered_tacticP", "SOME-SUBSUMING-JOIN-ORDERED-TACTIC?", 3, 0, false );
    SubLFiles.declareFunction( me, "consider_subsumed_join_ordered_tacticP", "CONSIDER-SUBSUMED-JOIN-ORDERED-TACTIC?", 3, 0, false );
    SubLFiles.declareFunction( me, "select_problem_tactic", "SELECT-PROBLEM-TACTIC", 5, 4, false );
    SubLFiles.declareFunction( me, "choose_between_tactics", "CHOOSE-BETWEEN-TACTICS", 4, 0, false );
    SubLFiles.declareFunction( me, "select_best_tactic_for_problem", "SELECT-BEST-TACTIC-FOR-PROBLEM", 2, 4, false );
    SubLFiles.declareFunction( me, "productivity_and_completeness_worseP", "PRODUCTIVITY-AND-COMPLETENESS-WORSE?", 4, 0, false );
    SubLFiles.declareFunction( me, "productivity_and_completeness_betterP", "PRODUCTIVITY-AND-COMPLETENESS-BETTER?", 4, 0, false );
    SubLFiles.declareFunction( me, "tactic_productivity_and_completeness_worseP", "TACTIC-PRODUCTIVITY-AND-COMPLETENESS-WORSE?", 3, 0, false );
    SubLFiles.declareFunction( me, "tactic_productivity_and_completeness_betterP", "TACTIC-PRODUCTIVITY-AND-COMPLETENESS-BETTER?", 3, 0, false );
    SubLFiles.declareFunction( me, "tactic_productivity_and_completeness_sufficiently_goodP", "TACTIC-PRODUCTIVITY-AND-COMPLETENESS-SUFFICIENTLY-GOOD?", 2, 0, false );
    SubLFiles.declareFunction( me, "choose_less_productive_tactic", "CHOOSE-LESS-PRODUCTIVE-TACTIC", 3, 0, false );
    SubLFiles.declareFunction( me, "tactic_productivity_higherP", "TACTIC-PRODUCTIVITY-HIGHER?", 3, 0, false );
    SubLFiles.declareFunction( me, "tactic_productivity_lowerP", "TACTIC-PRODUCTIVITY-LOWER?", 3, 0, false );
    SubLFiles.declareFunction( me, "tactic_productivity_sufficiently_goodP", "TACTIC-PRODUCTIVITY-SUFFICIENTLY-GOOD?", 2, 0, false );
    SubLFiles.declareFunction( me, "early_removal_productivity_limit", "EARLY-REMOVAL-PRODUCTIVITY-LIMIT", 1, 0, false );
    SubLFiles.declareFunction( me, "strategy_early_removal_productivity_limit", "STRATEGY-EARLY-REMOVAL-PRODUCTIVITY-LIMIT", 1, 0, false );
    SubLFiles.declareFunction( me, "candidate_early_removal_tacticP", "CANDIDATE-EARLY-REMOVAL-TACTIC?", 1, 0, false );
    SubLFiles.declareFunction( me, "join_ordered_tactic_early_removal_cheapP", "JOIN-ORDERED-TACTIC-EARLY-REMOVAL-CHEAP?", 1, 0, false );
    SubLFiles.declareFunction( me, "join_ordered_link_early_removal_cheapP", "JOIN-ORDERED-LINK-EARLY-REMOVAL-CHEAP?", 2, 0, false );
    SubLFiles.declareFunction( me, "problem_has_a_non_sksi_tacticP", "PROBLEM-HAS-A-NON-SKSI-TACTIC?", 1, 0, false );
    SubLFiles.declareFunction( me, "strategy_quiesce", "STRATEGY-QUIESCE", 1, 0, false );
    SubLFiles.declareFunction( me, "strategy_execute_strategem", "STRATEGY-EXECUTE-STRATEGEM", 2, 0, false );
    SubLFiles.declareFunction( me, "possibly_clean_strategem", "POSSIBLY-CLEAN-STRATEGEM", 2, 0, false );
    SubLFiles.declareFunction( me, "strategy_execute_tactic", "STRATEGY-EXECUTE-TACTIC", 2, 0, false );
    SubLFiles.declareFunction( me, "strategy_possibly_execute_tactic", "STRATEGY-POSSIBLY-EXECUTE-TACTIC", 2, 0, false );
    SubLFiles.declareFunction( me, "strategy_make_problem_set_aside", "STRATEGY-MAKE-PROBLEM-SET-ASIDE", 2, 0, false );
    SubLFiles.declareFunction( me, "possibly_clear_strategic_status_wrt", "POSSIBLY-CLEAR-STRATEGIC-STATUS-WRT", 2, 0, false );
    SubLFiles.declareFunction( me, "clear_strategic_status_wrt", "CLEAR-STRATEGIC-STATUS-WRT", 2, 0, false );
    SubLFiles.declareFunction( me, "strategy_set_aside_non_continuable_implies_throw_awayP", "STRATEGY-SET-ASIDE-NON-CONTINUABLE-IMPLIES-THROW-AWAY?", 1, 0, false );
    SubLFiles.declareFunction( me, "strategy_throw_away_uninteresting_set_asides", "STRATEGY-THROW-AWAY-UNINTERESTING-SET-ASIDES", 1, 0, false );
    SubLFiles.declareFunction( me, "strategy_throws_away_all_transformationP", "STRATEGY-THROWS-AWAY-ALL-TRANSFORMATION?", 1, 0, false );
    SubLFiles.declareFunction( me, "strategy_sets_aside_all_transformationP", "STRATEGY-SETS-ASIDE-ALL-TRANSFORMATION?", 1, 0, false );
    SubLFiles.declareFunction( me, "strategy_continuation_possibleP", "STRATEGY-CONTINUATION-POSSIBLE?", 1, 0, false );
    SubLFiles.declareFunction( me, "better_term_chosen_handlingP", "BETTER-TERM-CHOSEN-HANDLING?", 0, 0, false );
    SubLFiles.declareFunction( me, "transformation_link_leads_to_term_chosen_dead_endP", "TRANSFORMATION-LINK-LEADS-TO-TERM-CHOSEN-DEAD-END?", 1, 0, false );
    SubLFiles.declareFunction( me, "transformation_link_term_chosen_dead_end_vars", "TRANSFORMATION-LINK-TERM-CHOSEN-DEAD-END-VARS", 1, 0, false );
    SubLFiles.declareFunction( me, "problem_term_chosen_dead_end_vars", "PROBLEM-TERM-CHOSEN-DEAD-END-VARS", 1, 0, false );
    SubLFiles.declareFunction( me, "all_restricted_non_focals_around_transformation_link", "ALL-RESTRICTED-NON-FOCALS-AROUND-TRANSFORMATION-LINK", 1, 0, false );
    SubLFiles.declareFunction( me, "supported_problem_needed_term_chosen_vars", "SUPPORTED-PROBLEM-NEEDED-TERM-CHOSEN-VARS", 1, 0, false );
    SubLFiles.declareFunction( me, "focal_problem_binds_all_varsP", "FOCAL-PROBLEM-BINDS-ALL-VARS?", 2, 0, false );
    SubLFiles.declareFunction( me, "strategem_p", "STRATEGEM-P", 1, 0, false );
    SubLFiles.declareFunction( me, "executable_strategem_p", "EXECUTABLE-STRATEGEM-P", 1, 0, false );
    SubLFiles.declareFunction( me, "strategem_invalid_p", "STRATEGEM-INVALID-P", 1, 0, false );
    SubLFiles.declareFunction( me, "strategem_problem", "STRATEGEM-PROBLEM", 1, 0, false );
    SubLFiles.declareFunction( me, "strategem_supported_object", "STRATEGEM-SUPPORTED-OBJECT", 1, 0, false );
    SubLFiles.declareFunction( me, "motivation_strategem_p", "MOTIVATION-STRATEGEM-P", 1, 0, false );
    SubLFiles.declareFunction( me, "motivation_strategem_link_p", "MOTIVATION-STRATEGEM-LINK-P", 1, 0, false );
    SubLFiles.declareFunction( me, "removal_strategem_p", "REMOVAL-STRATEGEM-P", 1, 0, false );
    SubLFiles.declareFunction( me, "transformation_strategem_p", "TRANSFORMATION-STRATEGEM-P", 1, 0, false );
    SubLFiles.declareFunction( me, "strategem_suid", "STRATEGEM-SUID", 1, 0, false );
    SubLFiles.declareFunction( me, "strategem_L", "STRATEGEM-<", 2, 0, false );
    SubLFiles.declareFunction( me, "inference_strategy_type", "INFERENCE-STRATEGY-TYPE", 2, 0, false );
    SubLFiles.declareFunction( me, "strategy_type_dispatch_handler", "STRATEGY-TYPE-DISPATCH-HANDLER", 2, 0, false );
    SubLFiles.declareFunction( me, "happiness_p", "HAPPINESS-P", 1, 0, false );
    SubLFiles.declareFunction( me, "happiness_E", "HAPPINESS-=", 2, 0, false );
    SubLFiles.declareFunction( me, "happiness_L", "HAPPINESS-<", 2, 0, false );
    SubLFiles.declareFunction( me, "happiness_G", "HAPPINESS->", 2, 0, false );
    new $happiness_G$BinaryFunction();
    SubLFiles.declareFunction( me, "happiness_min", "HAPPINESS-MIN", 2, 0, false );
    SubLFiles.declareFunction( me, "happiness_max", "HAPPINESS-MAX", 2, 0, false );
    SubLFiles.declareFunction( me, "minimal_happiness", "MINIMAL-HAPPINESS", 0, 0, false );
    SubLFiles.declareFunction( me, "happiness_index_p", "HAPPINESS-INDEX-P", 1, 0, false );
    SubLFiles.declareFunction( me, "new_happiness_index", "NEW-HAPPINESS-INDEX", 0, 0, false );
    SubLFiles.declareFunction( me, "happiness_index_clear", "HAPPINESS-INDEX-CLEAR", 1, 0, false );
    SubLFiles.declareFunction( me, "happiness_index_empty_p", "HAPPINESS-INDEX-EMPTY-P", 1, 0, false );
    SubLFiles.declareFunction( me, "happiness_index_add", "HAPPINESS-INDEX-ADD", 3, 0, false );
    SubLFiles.declareFunction( me, "happiness_index_peek", "HAPPINESS-INDEX-PEEK", 1, 0, false );
    SubLFiles.declareFunction( me, "happiness_index_next", "HAPPINESS-INDEX-NEXT", 1, 0, false );
    SubLFiles.declareFunction( me, "happiness_index_contents", "HAPPINESS-INDEX-CONTENTS", 1, 0, false );
    SubLFiles.declareFunction( me, "happiness_index_size", "HAPPINESS-INDEX-SIZE", 1, 0, false );
    SubLFiles.declareFunction( me, "strategy_happiness_table", "STRATEGY-HAPPINESS-TABLE", 1, 0, false );
    SubLFiles.declareFunction( me, "strategy_initialize_properties", "STRATEGY-INITIALIZE-PROPERTIES", 2, 0, false );
    SubLFiles.declareFunction( me, "default_strategy_initialize_properties", "DEFAULT-STRATEGY-INITIALIZE-PROPERTIES", 2, 0, false );
    SubLFiles.declareFunction( me, "strategy_update_properties", "STRATEGY-UPDATE-PROPERTIES", 2, 0, false );
    SubLFiles.declareFunction( me, "default_strategy_update_properties", "DEFAULT-STRATEGY-UPDATE-PROPERTIES", 2, 0, false );
    SubLFiles.declareFunction( me, "strategy_note_inference_dynamic_properties_updated", "STRATEGY-NOTE-INFERENCE-DYNAMIC-PROPERTIES-UPDATED", 1, 0, false );
    SubLFiles.declareFunction( me, "default_strategy_note_inference_dynamic_properties_updated", "DEFAULT-STRATEGY-NOTE-INFERENCE-DYNAMIC-PROPERTIES-UPDATED", 1, 0, false );
    SubLFiles.declareFunction( me, "strategy_initial_relevant_strategies", "STRATEGY-INITIAL-RELEVANT-STRATEGIES", 1, 0, false );
    SubLFiles.declareFunction( me, "default_strategy_initial_relevant_strategies", "DEFAULT-STRATEGY-INITIAL-RELEVANT-STRATEGIES", 1, 0, false );
    SubLFiles.declareFunction( me, "strategy_note_split_tactics_strategically_possible", "STRATEGY-NOTE-SPLIT-TACTICS-STRATEGICALLY-POSSIBLE", 2, 0, false );
    SubLFiles.declareFunction( me, "strategy_note_tactic_discarded", "STRATEGY-NOTE-TACTIC-DISCARDED", 2, 0, false );
    SubLFiles.declareFunction( me, "strategy_note_new_tactic", "STRATEGY-NOTE-NEW-TACTIC", 2, 0, false );
    SubLFiles.declareFunction( me, "strategy_no_possible_strategems_for_problemP", "STRATEGY-NO-POSSIBLE-STRATEGEMS-FOR-PROBLEM?", 2, 0, false );
    SubLFiles.declareFunction( me, "strategy_consider_that_problem_could_be_strategically_pending", "STRATEGY-CONSIDER-THAT-PROBLEM-COULD-BE-STRATEGICALLY-PENDING", 2, 0, false );
    SubLFiles.declareFunction( me, "strategy_consider_that_problem_could_be_no_good", "STRATEGY-CONSIDER-THAT-PROBLEM-COULD-BE-NO-GOOD", 4, 0, false );
    SubLFiles.declareFunction( me, "strategy_reconsider_set_asides", "STRATEGY-RECONSIDER-SET-ASIDES", 1, 0, false );
    SubLFiles.declareFunction( me, "substrategy_do_one_step", "SUBSTRATEGY-DO-ONE-STEP", 1, 0, false );
    SubLFiles.declareFunction( me, "substrategy_peek_next_strategem", "SUBSTRATEGY-PEEK-NEXT-STRATEGEM", 1, 0, false );
    SubLFiles.declareFunction( me, "substrategy_motivate_strategem", "SUBSTRATEGY-MOTIVATE-STRATEGEM", 2, 0, false );
    SubLFiles.declareFunction( me, "substrategy_activate_strategem", "SUBSTRATEGY-ACTIVATE-STRATEGEM", 2, 0, false );
    SubLFiles.declareFunction( me, "substrategy_link_head_motivatedP", "SUBSTRATEGY-LINK-HEAD-MOTIVATED?", 2, 0, false );
    SubLFiles.declareFunction( me, "substrategy_reconsider_split_set_asides", "SUBSTRATEGY-RECONSIDER-SPLIT-SET-ASIDES", 2, 0, false );
    return NIL;
  }

  public static SubLObject init_inference_tactician_file()
  {
    $strategy_auto_prune_threshold$ = SubLFiles.defparameter( "*STRATEGY-AUTO-PRUNE-THRESHOLD*", NIL );
    $strategy_auto_prune_step_count$ = SubLFiles.defvar( "*STRATEGY-AUTO-PRUNE-STEP-COUNT*", ZERO_INTEGER );
    $strategy_sort_strategy$ = SubLFiles.defparameter( "*STRATEGY-SORT-STRATEGY*", NIL );
    $strategy_sort_predicate$ = SubLFiles.defparameter( "*STRATEGY-SORT-PREDICATE*", NIL );
    $sufficiently_good_tactic_productivity_threshold$ = SubLFiles.deflexical( "*SUFFICIENTLY-GOOD-TACTIC-PRODUCTIVITY-THRESHOLD*", TEN_INTEGER );
    $default_early_removal_productivity_limit$ = SubLFiles.defvar( "*DEFAULT-EARLY-REMOVAL-PRODUCTIVITY-LIMIT*", inference_datastructures_enumerated_types.productivity_for_number_of_children(
        backward.$transformation_early_removal_threshold$.getDynamicValue() ) );
    $set_aside_non_continuable_implies_throw_away_for_removalP$ = SubLFiles.defparameter( "*SET-ASIDE-NON-CONTINUABLE-IMPLIES-THROW-AWAY-FOR-REMOVAL?*", T );
    $set_aside_non_continuable_implies_throw_away_for_transformationP$ = SubLFiles.defparameter( "*SET-ASIDE-NON-CONTINUABLE-IMPLIES-THROW-AWAY-FOR-TRANSFORMATION?*", NIL );
    $better_term_chosen_handlingP$ = SubLFiles.defvar( "*BETTER-TERM-CHOSEN-HANDLING?*", T );
    $better_backchain_forbidden_when_unbound_in_arg_handlingP$ = SubLFiles.defvar( "*BETTER-BACKCHAIN-FORBIDDEN-WHEN-UNBOUND-IN-ARG-HANDLING?*", NIL );
    return NIL;
  }

  public static SubLObject setup_inference_tactician_file()
  {
    utilities_macros.note_funcall_helper_function( $sym5$STRATEGY_SORT_PREDICATE_ );
    utilities_macros.note_funcall_helper_function( $sym6$TACTIC_STRATEGIC_PRODUCTIVITY__ );
    utilities_macros.note_funcall_helper_function( $sym7$LOGICAL_TACTIC_BETTER_WRT_REMOVAL_ );
    access_macros.register_macro_helper( $sym25$PROBLEM_MAXIMAL_SUBSUMING_MULTI_FOCAL_LITERAL_JOIN_ORDERED_TACTIC, $sym28$DO_PROBLEM_UNSUBSUMED_CONNECTED_CONJUNCTION_TACTICS );
    access_macros.register_macro_helper( $sym27$SOME_SUBSUMING_JOIN_ORDERED_TACTIC_, $sym28$DO_PROBLEM_UNSUBSUMED_CONNECTED_CONJUNCTION_TACTICS );
    utilities_macros.note_funcall_helper_function( $sym33$TACTIC_PRODUCTIVITY_AND_COMPLETENESS_WORSE_ );
    utilities_macros.note_funcall_helper_function( $sym37$TACTIC_PRODUCTIVITY_HIGHER_ );
    utilities_macros.note_funcall_helper_function( $sym36$TACTIC_PRODUCTIVITY_LOWER_ );
    utilities_macros.note_funcall_helper_function( $sym38$TACTIC_PRODUCTIVITY_SUFFICIENTLY_GOOD_ );
    utilities_macros.note_funcall_helper_function( $sym69$DEFAULT_STRATEGY_INITIALIZE_PROPERTIES );
    utilities_macros.note_funcall_helper_function( $sym71$DEFAULT_STRATEGY_UPDATE_PROPERTIES );
    utilities_macros.note_funcall_helper_function( $sym73$DEFAULT_STRATEGY_NOTE_INFERENCE_DYNAMIC_PROPERTIES_UPDATED );
    return NIL;
  }

  @Override
  public void declareFunctions()
  {
    declare_inference_tactician_file();
  }

  @Override
  public void initializeVariables()
  {
    init_inference_tactician_file();
  }

  @Override
  public void runTopLevelForms()
  {
    setup_inference_tactician_file();
  }
  static
  {
    me = new inference_tactician();
    $strategy_auto_prune_threshold$ = null;
    $strategy_auto_prune_step_count$ = null;
    $strategy_sort_strategy$ = null;
    $strategy_sort_predicate$ = null;
    $sufficiently_good_tactic_productivity_threshold$ = null;
    $default_early_removal_productivity_limit$ = null;
    $set_aside_non_continuable_implies_throw_away_for_removalP$ = null;
    $set_aside_non_continuable_implies_throw_away_for_transformationP$ = null;
    $better_term_chosen_handlingP$ = null;
    $better_backchain_forbidden_when_unbound_in_arg_handlingP$ = null;
    $kw0$DO_ONE_STEP = makeKeyword( "DO-ONE-STEP" );
    $kw1$DONE_ = makeKeyword( "DONE?" );
    $kw2$POSSIBLY_ACTIVATE_PROBLEM = makeKeyword( "POSSIBLY-ACTIVATE-PROBLEM" );
    $kw3$NEW_ARGUMENT_LINK = makeKeyword( "NEW-ARGUMENT-LINK" );
    $sym4$STRATEGY_P = makeSymbol( "STRATEGY-P" );
    $sym5$STRATEGY_SORT_PREDICATE_ = makeSymbol( "STRATEGY-SORT-PREDICATE?" );
    $sym6$TACTIC_STRATEGIC_PRODUCTIVITY__ = makeSymbol( "TACTIC-STRATEGIC-PRODUCTIVITY-<" );
    $sym7$LOGICAL_TACTIC_BETTER_WRT_REMOVAL_ = makeSymbol( "LOGICAL-TACTIC-BETTER-WRT-REMOVAL?" );
    $kw8$TACTICAL = makeKeyword( "TACTICAL" );
    $list9 = ConsesLow.list( ConsesLow.list( makeSymbol( "TACTIC-VAR" ), makeSymbol( "PROBLEM" ), makeSymbol( "STRATEGIC-CONTEXT" ), makeSymbol( "&KEY" ), makeSymbol( "STATUS" ), makeSymbol( "HL-MODULE" ), makeSymbol(
        "TYPE" ), makeSymbol( "DONE" ) ), makeSymbol( "&BODY" ), makeSymbol( "BODY" ) );
    $list10 = ConsesLow.list( makeKeyword( "STATUS" ), makeKeyword( "HL-MODULE" ), makeKeyword( "TYPE" ), makeKeyword( "DONE" ) );
    $kw11$ALLOW_OTHER_KEYS = makeKeyword( "ALLOW-OTHER-KEYS" );
    $kw12$STATUS = makeKeyword( "STATUS" );
    $kw13$HL_MODULE = makeKeyword( "HL-MODULE" );
    $kw14$TYPE = makeKeyword( "TYPE" );
    $kw15$DONE = makeKeyword( "DONE" );
    $kw16$REMOVAL = makeKeyword( "REMOVAL" );
    $kw17$GENERALIZED_REMOVAL = makeKeyword( "GENERALIZED-REMOVAL" );
    $kw18$TRANSFORMATION = makeKeyword( "TRANSFORMATION" );
    $sym19$DO_PROBLEM_TACTICS = makeSymbol( "DO-PROBLEM-TACTICS" );
    $sym20$IGNORE = makeSymbol( "IGNORE" );
    $sym21$PROBLEM_VAR = makeUninternedSymbol( "PROBLEM-VAR" );
    $sym22$TYPE_VAR = makeUninternedSymbol( "TYPE-VAR" );
    $sym23$SUBSUMING_JOIN_ORDERED_TACTICS = makeUninternedSymbol( "SUBSUMING-JOIN-ORDERED-TACTICS" );
    $sym24$CLET = makeSymbol( "CLET" );
    $sym25$PROBLEM_MAXIMAL_SUBSUMING_MULTI_FOCAL_LITERAL_JOIN_ORDERED_TACTIC = makeSymbol( "PROBLEM-MAXIMAL-SUBSUMING-MULTI-FOCAL-LITERAL-JOIN-ORDERED-TACTICS" );
    $sym26$PUNLESS = makeSymbol( "PUNLESS" );
    $sym27$SOME_SUBSUMING_JOIN_ORDERED_TACTIC_ = makeSymbol( "SOME-SUBSUMING-JOIN-ORDERED-TACTIC?" );
    $sym28$DO_PROBLEM_UNSUBSUMED_CONNECTED_CONJUNCTION_TACTICS = makeSymbol( "DO-PROBLEM-UNSUBSUMED-CONNECTED-CONJUNCTION-TACTICS" );
    $kw29$JOIN_ORDERED = makeKeyword( "JOIN-ORDERED" );
    $kw30$CONNECTED_CONJUNCTION = makeKeyword( "CONNECTED-CONJUNCTION" );
    $sym31$JOIN_ORDERED_TACTIC_SUBSUMES_ = makeSymbol( "JOIN-ORDERED-TACTIC-SUBSUMES?" );
    $sym32$TACTIC_P = makeSymbol( "TACTIC-P" );
    $sym33$TACTIC_PRODUCTIVITY_AND_COMPLETENESS_WORSE_ = makeSymbol( "TACTIC-PRODUCTIVITY-AND-COMPLETENESS-WORSE?" );
    $sym34$TACTIC_PRODUCTIVITY_AND_COMPLETENESS_SUFFICIENTLY_GOOD_ = makeSymbol( "TACTIC-PRODUCTIVITY-AND-COMPLETENESS-SUFFICIENTLY-GOOD?" );
    $kw35$COMPLETE = makeKeyword( "COMPLETE" );
    $sym36$TACTIC_PRODUCTIVITY_LOWER_ = makeSymbol( "TACTIC-PRODUCTIVITY-LOWER?" );
    $sym37$TACTIC_PRODUCTIVITY_HIGHER_ = makeSymbol( "TACTIC-PRODUCTIVITY-HIGHER?" );
    $sym38$TACTIC_PRODUCTIVITY_SUFFICIENTLY_GOOD_ = makeSymbol( "TACTIC-PRODUCTIVITY-SUFFICIENTLY-GOOD?" );
    $kw39$EARLY_REMOVAL_PRODUCTIVITY_LIMIT = makeKeyword( "EARLY-REMOVAL-PRODUCTIVITY-LIMIT" );
    $kw40$SKSI = makeKeyword( "SKSI" );
    $kw41$QUIESCE = makeKeyword( "QUIESCE" );
    $str42$_a_execute_strategem___a__ = makeString( "~a execute-strategem: ~a~%" );
    $kw43$EXECUTE_STRATEGEM = makeKeyword( "EXECUTE-STRATEGEM" );
    $kw44$UNEXAMINED = makeKeyword( "UNEXAMINED" );
    $kw45$THROW_AWAY_UNINTERESTING_SET_ASIDES = makeKeyword( "THROW-AWAY-UNINTERESTING-SET-ASIDES" );
    $kw46$CONTINUATION_POSSIBLE_ = makeKeyword( "CONTINUATION-POSSIBLE?" );
    $kw47$NEG = makeKeyword( "NEG" );
    $list48 = ConsesLow.list( makeSymbol( "MT" ), makeSymbol( "ASENT" ) );
    $kw49$POS = makeKeyword( "POS" );
    $const50$termChosen = constant_handles.reader_make_constant_shell( makeString( "termChosen" ) );
    $sym51$VARIABLE_P = makeSymbol( "VARIABLE-P" );
    $kw52$RESIDUAL_TRANSFORMATION = makeKeyword( "RESIDUAL-TRANSFORMATION" );
    $kw53$RESTRICTION = makeKeyword( "RESTRICTION" );
    $str54$Unexpected_strategem_type__s = makeString( "Unexpected strategem type ~s" );
    $str55$Unexpected_strategem_ype__s = makeString( "Unexpected strategem ype ~s" );
    $str56$unexpected_strategem___S = makeString( "unexpected strategem: ~S" );
    $list57 = ConsesLow.list( makeSymbol( "TACTIC" ), makeSymbol( "PROBLEM-LINK" ), makeSymbol( "PROBLEM" ) );
    $sym58$TYPE_OF = makeSymbol( "TYPE-OF" );
    $kw59$NEGATIVE_INFINITY = makeKeyword( "NEGATIVE-INFINITY" );
    $sym60$HAPPINESS__ = makeSymbol( "HAPPINESS->" );
    $sym61$HAPPINESS_P = makeSymbol( "HAPPINESS-P" );
    $kw62$ERROR = makeKeyword( "ERROR" );
    $str63$No_object_stack_for_happiness__S = makeString( "No object-stack for happiness ~S" );
    $str64$No_objects_for_happiness__S = makeString( "No objects for happiness ~S" );
    $str65$Removed__S_but__S_was_lowest_happ = makeString( "Removed ~S but ~S was lowest happiness" );
    $sym66$HAPPINESS_INDEX_P = makeSymbol( "HAPPINESS-INDEX-P" );
    $kw67$HAPPINESS_TABLE = makeKeyword( "HAPPINESS-TABLE" );
    $kw68$INITIALIZE_PROPERTIES = makeKeyword( "INITIALIZE-PROPERTIES" );
    $sym69$DEFAULT_STRATEGY_INITIALIZE_PROPERTIES = makeSymbol( "DEFAULT-STRATEGY-INITIALIZE-PROPERTIES" );
    $kw70$UPDATE_PROPERTIES = makeKeyword( "UPDATE-PROPERTIES" );
    $sym71$DEFAULT_STRATEGY_UPDATE_PROPERTIES = makeSymbol( "DEFAULT-STRATEGY-UPDATE-PROPERTIES" );
    $kw72$INFERENCE_DYNAMIC_PROPERTIES_UPDATED = makeKeyword( "INFERENCE-DYNAMIC-PROPERTIES-UPDATED" );
    $sym73$DEFAULT_STRATEGY_NOTE_INFERENCE_DYNAMIC_PROPERTIES_UPDATED = makeSymbol( "DEFAULT-STRATEGY-NOTE-INFERENCE-DYNAMIC-PROPERTIES-UPDATED" );
    $kw74$INITIAL_RELEVANT_STRATEGIES = makeKeyword( "INITIAL-RELEVANT-STRATEGIES" );
    $kw75$SPLIT_TACTICS_POSSIBLE = makeKeyword( "SPLIT-TACTICS-POSSIBLE" );
    $kw76$NEW_TACTIC = makeKeyword( "NEW-TACTIC" );
    $kw77$PROBLEM_NOTHING_TO_DO_ = makeKeyword( "PROBLEM-NOTHING-TO-DO?" );
    $kw78$PROBLEM_COULD_BE_PENDING = makeKeyword( "PROBLEM-COULD-BE-PENDING" );
    $kw79$RECONSIDER_SET_ASIDES = makeKeyword( "RECONSIDER-SET-ASIDES" );
    $kw80$PEEK_NEXT_STRATEGEM = makeKeyword( "PEEK-NEXT-STRATEGEM" );
    $sym81$STRATEGEM_P = makeSymbol( "STRATEGEM-P" );
    $kw82$MOTIVATE_STRATEGEM = makeKeyword( "MOTIVATE-STRATEGEM" );
    $kw83$ACTIVATE_STRATEGEM = makeKeyword( "ACTIVATE-STRATEGEM" );
    $kw84$LINK_HEAD_MOTIVATED_ = makeKeyword( "LINK-HEAD-MOTIVATED?" );
    $sym85$SPLIT_TACTIC_P = makeSymbol( "SPLIT-TACTIC-P" );
    $kw86$RECONSIDER_SPLIT_SET_ASIDES = makeKeyword( "RECONSIDER-SPLIT-SET-ASIDES" );
  }

  public static final class $strategy_sort_predicateP$BinaryFunction
      extends
        BinaryFunction
  {
    public $strategy_sort_predicateP$BinaryFunction()
    {
      super( SubLTranslatedFile.extractFunctionNamed( "STRATEGY-SORT-PREDICATE?" ) );
    }

    @Override
    public SubLObject processItem(final SubLObject arg1, final SubLObject arg2)
    {
      return strategy_sort_predicateP( arg1, arg2 );
    }
  }

  public static final class $happiness_G$BinaryFunction
      extends
        BinaryFunction
  {
    public $happiness_G$BinaryFunction()
    {
      super( SubLTranslatedFile.extractFunctionNamed( "HAPPINESS->" ) );
    }

    @Override
    public SubLObject processItem(final SubLObject arg1, final SubLObject arg2)
    {
      return happiness_G( arg1, arg2 );
    }
  }
}
/*
 * 
 * Total time: 377 ms
 * 
 */