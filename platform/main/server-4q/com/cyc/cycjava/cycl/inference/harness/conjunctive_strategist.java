package com.cyc.cycjava.cycl.inference.harness;

import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeKeyword;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeString;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeSymbol;

import com.cyc.cycjava.cycl.backward;
import com.cyc.cycjava.cycl.bindings;
import com.cyc.cycjava.cycl.constant_handles;
import com.cyc.cycjava.cycl.control_vars;
import com.cyc.cycjava.cycl.cycl_grammar;
import com.cyc.cycjava.cycl.cycl_utilities;
import com.cyc.cycjava.cycl.czer_utilities;
import com.cyc.cycjava.cycl.el_utilities;
import com.cyc.cycjava.cycl.list_utilities;
import com.cyc.cycjava.cycl.memoization_state;
import com.cyc.cycjava.cycl.narts_high;
import com.cyc.cycjava.cycl.number_utilities;
import com.cyc.cycjava.cycl.queues;
import com.cyc.cycjava.cycl.set;
import com.cyc.cycjava.cycl.subl_macro_promotions;
import com.cyc.cycjava.cycl.variables;
import com.cyc.cycjava.cycl.cyc_testing.generic_testing;
import com.cyc.cycjava.cycl.sbhl.sbhl_marking_vars;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class conjunctive_strategist
    extends
      SubLTranslatedFile
{
  public static final SubLFile me;
  public static final String myName = "com.cyc.cycjava.cycl.inference.harness.conjunctive_strategist";
  public static final String myFingerPrint = "1f386c6099b47ec0899305cfd95305cd1a777eee1ac23bbba30bd2f24856fb03";
  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/conjunctive-strategist.lisp", position = 12709L)
  private static SubLSymbol $conjunctive_strategist_properties$;
  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/conjunctive-strategist.lisp", position = 12849L)
  private static SubLSymbol $conjunctive_strategist_removal_properties$;
  private static final SubLObject $const0$BaseKB;
  private static final SubLString $str1$_S_was_not_a_conjunction;
  private static final SubLObject $const2$ist;
  private static final SubLList $list3;
  private static final SubLObject $const4$thereExists;
  private static final SubLString $str5$_S_was_not_a_conjunction_of_liter;
  private static final SubLList $list6;
  private static final SubLList $list7;
  private static final SubLString $str8$time_to_implement_ORDER_CONJUNCTI;
  private static final SubLString $str9$ignoring_unhandled_properties____;
  private static final SubLSymbol $kw10$INFERENCE_ABORT_TARGET;
  private static final SubLSymbol $kw11$QUERY_HALT;
  private static final SubLSymbol $kw12$EXHAUST_TOTAL;
  private static final SubLSymbol $kw13$MAX_TIME;
  private static final SubLSymbol $kw14$INFERENCE_ERROR;
  private static final SubLSymbol $sym15$INFERENCE_ERROR_HANDLER;
  private static final SubLSymbol $kw16$ABORT;
  private static final SubLList $list17;
  private static final SubLSymbol $kw18$MAX_NUMBER;
  private static final SubLList $list19;
  private static final SubLList $list20;
  private static final SubLSymbol $sym21$CONTEXTUALIZE_CONJUNCTIVE_QUERY;
  private static final SubLSymbol $kw22$TEST;
  private static final SubLSymbol $kw23$OWNER;
  private static final SubLSymbol $kw24$CLASSES;
  private static final SubLList $list25;
  private static final SubLSymbol $kw26$KB;
  private static final SubLSymbol $kw27$FULL;
  private static final SubLSymbol $kw28$WORKING_;
  private static final SubLList $list29;
  private static final SubLSymbol $sym30$TEST_CANONICALIZE_CONJUNCTIVE_CONTEXTUALIZED_QUERY;
  private static final SubLList $list31;

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/conjunctive-strategist.lisp", position = 1411L)
  public static SubLObject new_cyc_conjunctive_query(final SubLObject query, SubLObject mt, SubLObject query_properties)
  {
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    if( query_properties == UNPROVIDED )
    {
      query_properties = NIL;
    }
    final SubLObject contextualized_query = contextualize_conjunctive_query( query, mt );
    return new_cyc_conjunctive_contextualized_query( contextualized_query, query_properties );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/conjunctive-strategist.lisp", position = 2266L)
  public static SubLObject new_cyc_ordered_conjunctive_query(final SubLObject ordered_query, SubLObject mt, SubLObject query_properties)
  {
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    if( query_properties == UNPROVIDED )
    {
      query_properties = NIL;
    }
    final SubLObject ordered_contextualized_query = contextualize_conjunctive_query( ordered_query, mt );
    return new_cyc_ordered_conjunctive_contextualized_query( ordered_contextualized_query, query_properties );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/conjunctive-strategist.lisp", position = 2569L)
  public static SubLObject contextualize_conjunctive_query(final SubLObject query, SubLObject mt)
  {
    if( mt == UNPROVIDED )
    {
      mt = $const0$BaseKB;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    thread.resetMultipleValues();
    final SubLObject closed_el_vars = el_unwrap_existentials( query );
    final SubLObject conjunction = thread.secondMultipleValue();
    thread.resetMultipleValues();
    if( NIL == Errors.$ignore_mustsP$.getDynamicValue( thread ) && NIL == el_utilities.el_conjunction_p( conjunction ) )
    {
      Errors.error( $str1$_S_was_not_a_conjunction, query );
    }
    final SubLObject el_literals = cycl_utilities.el_formula_args( conjunction, UNPROVIDED );
    SubLObject el_ist_literals = NIL;
    SubLObject cdolist_list_var = el_literals;
    SubLObject el_literal = NIL;
    el_literal = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      thread.resetMultipleValues();
      final SubLObject new_el_literal = czer_utilities.unwrap_if_ist( el_literal, mt, UNPROVIDED );
      final SubLObject new_mt = thread.secondMultipleValue();
      thread.resetMultipleValues();
      final SubLObject el_ist_literal = el_utilities.make_binary_formula( $const2$ist, new_mt, new_el_literal );
      el_ist_literals = ConsesLow.cons( el_ist_literal, el_ist_literals );
      cdolist_list_var = cdolist_list_var.rest();
      el_literal = cdolist_list_var.first();
    }
    final SubLObject el_ist_conjunction = el_utilities.make_conjunction( Sequences.nreverse( el_ist_literals ) );
    return el_wrap_existentials( closed_el_vars, el_ist_conjunction );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/conjunctive-strategist.lisp", position = 3295L)
  public static SubLObject el_unwrap_existentials(final SubLObject sentence)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL != el_utilities.el_existential_p( sentence ) )
    {
      final SubLObject closed_el_var = cycl_utilities.el_formula_arg1( sentence, UNPROVIDED );
      final SubLObject subsentence = cycl_utilities.el_formula_arg2( sentence, UNPROVIDED );
      thread.resetMultipleValues();
      final SubLObject closed_el_vars = el_unwrap_existentials( subsentence );
      final SubLObject unwrapped_sentence = thread.secondMultipleValue();
      thread.resetMultipleValues();
      return Values.values( ConsesLow.cons( closed_el_var, closed_el_vars ), unwrapped_sentence );
    }
    return Values.values( NIL, sentence );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/conjunctive-strategist.lisp", position = 3746L)
  public static SubLObject el_wrap_existentials(final SubLObject closed_el_vars, final SubLObject sentence)
  {
    if( NIL != closed_el_vars )
    {
      SubLObject first_el_var = NIL;
      SubLObject rest_el_vars = NIL;
      cdestructuring_bind.destructuring_bind_must_consp( closed_el_vars, closed_el_vars, $list3 );
      first_el_var = closed_el_vars.first();
      final SubLObject current = rest_el_vars = closed_el_vars.rest();
      final SubLObject wrapped_sentence = el_wrap_existentials( rest_el_vars, sentence );
      return el_utilities.make_binary_formula( $const4$thereExists, first_el_var, wrapped_sentence );
    }
    return sentence;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/conjunctive-strategist.lisp", position = 4123L)
  public static SubLObject new_cyc_conjunctive_contextualized_query(final SubLObject query, SubLObject query_properties)
  {
    if( query_properties == UNPROVIDED )
    {
      query_properties = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    thread.resetMultipleValues();
    final SubLObject hl_query = canonicalize_conjunctive_contextualized_query( query );
    final SubLObject hl_variable_map = thread.secondMultipleValue();
    final SubLObject free_hl_vars = thread.thirdMultipleValue();
    thread.resetMultipleValues();
    thread.resetMultipleValues();
    final SubLObject hl_results = new_cyc_conjunctive_contextualized_hl_query( hl_query, query_properties );
    final SubLObject halt_reason = thread.secondMultipleValue();
    thread.resetMultipleValues();
    final SubLObject cycl_result = bindings.apply_bindings( hl_variable_map, hl_results );
    return Values.values( cycl_result, halt_reason );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/conjunctive-strategist.lisp", position = 5461L)
  public static SubLObject new_cyc_ordered_conjunctive_contextualized_query(final SubLObject ordered_query, SubLObject query_properties)
  {
    if( query_properties == UNPROVIDED )
    {
      query_properties = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    thread.resetMultipleValues();
    final SubLObject ordered_hl_query = canonicalize_conjunctive_contextualized_query( ordered_query );
    final SubLObject hl_variable_map = thread.secondMultipleValue();
    final SubLObject free_hl_vars = thread.thirdMultipleValue();
    thread.resetMultipleValues();
    thread.resetMultipleValues();
    final SubLObject hl_results = new_cyc_ordered_conjunctive_contextualized_hl_query( ordered_hl_query, query_properties );
    final SubLObject halt_reason = thread.secondMultipleValue();
    thread.resetMultipleValues();
    final SubLObject cycl_result = bindings.apply_bindings( hl_variable_map, hl_results );
    return Values.values( cycl_result, halt_reason );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/conjunctive-strategist.lisp", position = 6058L)
  public static SubLObject canonicalize_conjunctive_contextualized_query(final SubLObject query)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    thread.resetMultipleValues();
    final SubLObject sentence_clauses = inference_czer.inference_canonicalize_ask_int( query, $const0$BaseKB, inference_datastructures_enumerated_types.$default_inference_disjunction_free_el_vars_policy$
        .getGlobalValue() );
    final SubLObject el_variable_map = thread.secondMultipleValue();
    final SubLObject free_el_vars = thread.thirdMultipleValue();
    thread.resetMultipleValues();
    if( NIL == Errors.$ignore_mustsP$.getDynamicValue( thread ) && NIL == list_utilities.singletonP( sentence_clauses ) )
    {
      Errors.error( $str5$_S_was_not_a_conjunction_of_liter, query );
    }
    final SubLObject el_conjunction = Values.nth_value_step_2( Values.nth_value_step_1( ONE_INTEGER ), el_unwrap_existentials( query ) );
    SubLObject hl_conjunction = bindings.apply_bindings( el_variable_map, el_conjunction );
    final SubLObject hl_variable_map = bindings.invert_bindings( el_variable_map );
    final SubLObject free_hl_vars = bindings.apply_bindings( el_variable_map, free_el_vars );
    hl_conjunction = narts_high.nart_substitute( hl_conjunction );
    return Values.values( hl_conjunction, hl_variable_map, free_hl_vars );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/conjunctive-strategist.lisp", position = 6808L)
  public static SubLObject new_cyc_conjunctive_contextualized_hl_query(final SubLObject hl_query, SubLObject query_properties)
  {
    if( query_properties == UNPROVIDED )
    {
      query_properties = NIL;
    }
    final SubLObject ordered_hl_query = order_conjunctive_contextualized_hl_query_wrt_removal( hl_query );
    return new_cyc_ordered_conjunctive_contextualized_hl_query( ordered_hl_query, query_properties );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/conjunctive-strategist.lisp", position = 7561L)
  public static SubLObject order_conjunctive_contextualized_hl_query_wrt_removal(final SubLObject hl_query)
  {
    if( hl_query.equal( variables.canonicalize_default_el_vars( $list6 ) ) )
    {
      return variables.canonicalize_default_el_vars( $list7 );
    }
    return Errors.error( $str8$time_to_implement_ORDER_CONJUNCTI );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/conjunctive-strategist.lisp", position = 8329L)
  public static SubLObject new_cyc_ordered_conjunctive_contextualized_hl_query(final SubLObject ordered_hl_query, SubLObject query_properties)
  {
    if( query_properties == UNPROVIDED )
    {
      query_properties = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    thread.resetMultipleValues();
    final SubLObject strategist_properties = categorize_query_properties_wrt_conjunctive_strategist( query_properties );
    final SubLObject removal_properties = thread.secondMultipleValue();
    final SubLObject ignored_properties = thread.thirdMultipleValue();
    thread.resetMultipleValues();
    if( NIL != control_vars.$inference_debugP$.getDynamicValue( thread ) && NIL != ignored_properties )
    {
      Errors.warn( $str9$ignoring_unhandled_properties____, ignored_properties );
    }
    SubLObject result = NIL;
    SubLObject halt_reason = NIL;
    final SubLObject metrics = NIL;
    final SubLObject max_time = inference_datastructures_enumerated_types.inference_properties_max_time( strategist_properties );
    final SubLObject max_number = inference_datastructures_enumerated_types.inference_properties_max_number( strategist_properties );
    final SubLObject productivity_limit = inference_datastructures_enumerated_types.strategy_dynamic_properties_productivity_limit( strategist_properties );
    final SubLObject hl_literals = cycl_utilities.el_formula_args( ordered_hl_query, UNPROVIDED );
    final SubLObject result_set = set.new_set( Symbols.symbol_function( EQUAL ), UNPROVIDED );
    final SubLObject result_queue = queues.create_queue( UNPROVIDED );
    final SubLObject _prev_bind_0 = inference_trivial.$current_query_properties$.currentBinding( thread );
    final SubLObject _prev_bind_2 = inference_worker.$currently_active_problem$.currentBinding( thread );
    final SubLObject _prev_bind_3 = inference_worker.$currently_executing_tactics$.currentBinding( thread );
    try
    {
      inference_trivial.$current_query_properties$.bind( query_properties, thread );
      inference_worker.$currently_active_problem$.bind( NIL, thread );
      inference_worker.$currently_executing_tactics$.bind( NIL, thread );
      SubLObject aborted_p = NIL;
      try
      {
        thread.throwStack.push( $kw10$INFERENCE_ABORT_TARGET );
        final SubLObject _prev_bind_0_$1 = inference_strategist.$within_inference_control_processP$.currentBinding( thread );
        try
        {
          inference_strategist.$within_inference_control_processP$.bind( T, thread );
          SubLObject error_message = NIL;
          if( NIL != control_vars.$inference_debugP$.getDynamicValue( thread ) )
          {
            try
            {
              thread.throwStack.push( $kw11$QUERY_HALT );
              final SubLObject abort_max_time = max_time;
              if( NIL != abort_max_time )
              {
                SubLObject timed_out = NIL;
                final SubLObject tag = subl_macro_promotions.with_timeout_make_tag();
                try
                {
                  thread.throwStack.push( tag );
                  final SubLObject _prev_bind_0_$2 = subl_macro_promotions.$within_with_timeout$.currentBinding( thread );
                  try
                  {
                    subl_macro_promotions.$within_with_timeout$.bind( T, thread );
                    SubLObject timer = NIL;
                    try
                    {
                      final SubLObject _prev_bind_0_$3 = subl_macro_promotions.$with_timeout_nesting_depth$.currentBinding( thread );
                      try
                      {
                        subl_macro_promotions.$with_timeout_nesting_depth$.bind( Numbers.add( ONE_INTEGER, subl_macro_promotions.$with_timeout_nesting_depth$.getDynamicValue( thread ) ), thread );
                        timer = subl_macro_promotions.with_timeout_start_timer( abort_max_time, tag );
                        final SubLObject local_state;
                        final SubLObject state = local_state = memoization_state.possibly_new_memoization_state();
                        final SubLObject _prev_bind_0_$4 = memoization_state.$memoization_state$.currentBinding( thread );
                        try
                        {
                          memoization_state.$memoization_state$.bind( local_state, thread );
                          final SubLObject original_memoization_process = memoization_state.memoization_state_original_process( local_state );
                          try
                          {
                            final SubLObject already_resourcing_p = sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.getDynamicValue( thread );
                            final SubLObject _prev_bind_0_$5 = sbhl_marking_vars.$resourced_sbhl_marking_space_limit$.currentBinding( thread );
                            final SubLObject _prev_bind_1_$6 = sbhl_marking_vars.$resourced_sbhl_marking_spaces$.currentBinding( thread );
                            final SubLObject _prev_bind_2_$7 = sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.currentBinding( thread );
                            final SubLObject _prev_bind_4 = control_vars.$removal_cost_cutoff$.currentBinding( thread );
                            try
                            {
                              sbhl_marking_vars.$resourced_sbhl_marking_space_limit$.bind( sbhl_marking_vars.determine_resource_limit( already_resourcing_p, SIX_INTEGER ), thread );
                              sbhl_marking_vars.$resourced_sbhl_marking_spaces$.bind( sbhl_marking_vars.possibly_new_marking_resource( already_resourcing_p ), thread );
                              sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.bind( T, thread );
                              control_vars.$removal_cost_cutoff$.bind( inference_datastructures_enumerated_types.removal_cost_cutoff_for_productivity( productivity_limit ), thread );
                              process_conjunctive_removal_hl_query_recursive( NIL, NIL, hl_literals, result_set, result_queue, ZERO_INTEGER, max_number, removal_properties );
                              halt_reason = $kw12$EXHAUST_TOTAL;
                            }
                            finally
                            {
                              control_vars.$removal_cost_cutoff$.rebind( _prev_bind_4, thread );
                              sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.rebind( _prev_bind_2_$7, thread );
                              sbhl_marking_vars.$resourced_sbhl_marking_spaces$.rebind( _prev_bind_1_$6, thread );
                              sbhl_marking_vars.$resourced_sbhl_marking_space_limit$.rebind( _prev_bind_0_$5, thread );
                            }
                          }
                          finally
                          {
                            final SubLObject _prev_bind_0_$6 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
                            try
                            {
                              Threads.$is_thread_performing_cleanupP$.bind( T, thread );
                              final SubLObject _values = Values.getValuesAsVector();
                              memoization_state.memoization_state_possibly_clear_original_process( local_state, original_memoization_process );
                              Values.restoreValuesFromVector( _values );
                            }
                            finally
                            {
                              Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$6, thread );
                            }
                          }
                        }
                        finally
                        {
                          memoization_state.$memoization_state$.rebind( _prev_bind_0_$4, thread );
                        }
                      }
                      finally
                      {
                        subl_macro_promotions.$with_timeout_nesting_depth$.rebind( _prev_bind_0_$3, thread );
                      }
                    }
                    finally
                    {
                      final SubLObject _prev_bind_0_$7 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
                      try
                      {
                        Threads.$is_thread_performing_cleanupP$.bind( T, thread );
                        final SubLObject _values2 = Values.getValuesAsVector();
                        subl_macro_promotions.with_timeout_stop_timer( timer );
                        Values.restoreValuesFromVector( _values2 );
                      }
                      finally
                      {
                        Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$7, thread );
                      }
                    }
                  }
                  finally
                  {
                    subl_macro_promotions.$within_with_timeout$.rebind( _prev_bind_0_$2, thread );
                  }
                }
                catch( final Throwable ccatch_env_var )
                {
                  timed_out = Errors.handleThrowable( ccatch_env_var, tag );
                }
                finally
                {
                  thread.throwStack.pop();
                }
                if( NIL != timed_out )
                {
                  halt_reason = $kw13$MAX_TIME;
                }
              }
              else
              {
                final SubLObject local_state2;
                final SubLObject state2 = local_state2 = memoization_state.possibly_new_memoization_state();
                final SubLObject _prev_bind_0_$8 = memoization_state.$memoization_state$.currentBinding( thread );
                try
                {
                  memoization_state.$memoization_state$.bind( local_state2, thread );
                  final SubLObject original_memoization_process2 = memoization_state.memoization_state_original_process( local_state2 );
                  try
                  {
                    final SubLObject already_resourcing_p2 = sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.getDynamicValue( thread );
                    final SubLObject _prev_bind_0_$9 = sbhl_marking_vars.$resourced_sbhl_marking_space_limit$.currentBinding( thread );
                    final SubLObject _prev_bind_1_$7 = sbhl_marking_vars.$resourced_sbhl_marking_spaces$.currentBinding( thread );
                    final SubLObject _prev_bind_2_$8 = sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.currentBinding( thread );
                    final SubLObject _prev_bind_5 = control_vars.$removal_cost_cutoff$.currentBinding( thread );
                    try
                    {
                      sbhl_marking_vars.$resourced_sbhl_marking_space_limit$.bind( sbhl_marking_vars.determine_resource_limit( already_resourcing_p2, SIX_INTEGER ), thread );
                      sbhl_marking_vars.$resourced_sbhl_marking_spaces$.bind( sbhl_marking_vars.possibly_new_marking_resource( already_resourcing_p2 ), thread );
                      sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.bind( T, thread );
                      control_vars.$removal_cost_cutoff$.bind( inference_datastructures_enumerated_types.removal_cost_cutoff_for_productivity( productivity_limit ), thread );
                      process_conjunctive_removal_hl_query_recursive( NIL, NIL, hl_literals, result_set, result_queue, ZERO_INTEGER, max_number, removal_properties );
                      halt_reason = $kw12$EXHAUST_TOTAL;
                    }
                    finally
                    {
                      control_vars.$removal_cost_cutoff$.rebind( _prev_bind_5, thread );
                      sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.rebind( _prev_bind_2_$8, thread );
                      sbhl_marking_vars.$resourced_sbhl_marking_spaces$.rebind( _prev_bind_1_$7, thread );
                      sbhl_marking_vars.$resourced_sbhl_marking_space_limit$.rebind( _prev_bind_0_$9, thread );
                    }
                  }
                  finally
                  {
                    final SubLObject _prev_bind_0_$10 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
                    try
                    {
                      Threads.$is_thread_performing_cleanupP$.bind( T, thread );
                      final SubLObject _values3 = Values.getValuesAsVector();
                      memoization_state.memoization_state_possibly_clear_original_process( local_state2, original_memoization_process2 );
                      Values.restoreValuesFromVector( _values3 );
                    }
                    finally
                    {
                      Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$10, thread );
                    }
                  }
                }
                finally
                {
                  memoization_state.$memoization_state$.rebind( _prev_bind_0_$8, thread );
                }
              }
            }
            catch( final Throwable ccatch_env_var2 )
            {
              halt_reason = Errors.handleThrowable( ccatch_env_var2, $kw11$QUERY_HALT );
            }
            finally
            {
              thread.throwStack.pop();
            }
          }
          else
          {
            try
            {
              thread.throwStack.push( $kw14$INFERENCE_ERROR );
              final SubLObject _prev_bind_0_$11 = Errors.$error_handler$.currentBinding( thread );
              try
              {
                Errors.$error_handler$.bind( Symbols.symbol_function( $sym15$INFERENCE_ERROR_HANDLER ), thread );
                try
                {
                  try
                  {
                    thread.throwStack.push( $kw11$QUERY_HALT );
                    final SubLObject abort_max_time2 = max_time;
                    if( NIL != abort_max_time2 )
                    {
                      SubLObject timed_out2 = NIL;
                      final SubLObject tag2 = subl_macro_promotions.with_timeout_make_tag();
                      try
                      {
                        thread.throwStack.push( tag2 );
                        final SubLObject _prev_bind_0_$12 = subl_macro_promotions.$within_with_timeout$.currentBinding( thread );
                        try
                        {
                          subl_macro_promotions.$within_with_timeout$.bind( T, thread );
                          SubLObject timer2 = NIL;
                          try
                          {
                            final SubLObject _prev_bind_0_$13 = subl_macro_promotions.$with_timeout_nesting_depth$.currentBinding( thread );
                            try
                            {
                              subl_macro_promotions.$with_timeout_nesting_depth$.bind( Numbers.add( ONE_INTEGER, subl_macro_promotions.$with_timeout_nesting_depth$.getDynamicValue( thread ) ), thread );
                              timer2 = subl_macro_promotions.with_timeout_start_timer( abort_max_time2, tag2 );
                              final SubLObject local_state3;
                              final SubLObject state3 = local_state3 = memoization_state.possibly_new_memoization_state();
                              final SubLObject _prev_bind_0_$14 = memoization_state.$memoization_state$.currentBinding( thread );
                              try
                              {
                                memoization_state.$memoization_state$.bind( local_state3, thread );
                                final SubLObject original_memoization_process3 = memoization_state.memoization_state_original_process( local_state3 );
                                try
                                {
                                  final SubLObject already_resourcing_p3 = sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.getDynamicValue( thread );
                                  final SubLObject _prev_bind_0_$15 = sbhl_marking_vars.$resourced_sbhl_marking_space_limit$.currentBinding( thread );
                                  final SubLObject _prev_bind_1_$8 = sbhl_marking_vars.$resourced_sbhl_marking_spaces$.currentBinding( thread );
                                  final SubLObject _prev_bind_2_$9 = sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.currentBinding( thread );
                                  final SubLObject _prev_bind_6 = control_vars.$removal_cost_cutoff$.currentBinding( thread );
                                  try
                                  {
                                    sbhl_marking_vars.$resourced_sbhl_marking_space_limit$.bind( sbhl_marking_vars.determine_resource_limit( already_resourcing_p3, SIX_INTEGER ), thread );
                                    sbhl_marking_vars.$resourced_sbhl_marking_spaces$.bind( sbhl_marking_vars.possibly_new_marking_resource( already_resourcing_p3 ), thread );
                                    sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.bind( T, thread );
                                    control_vars.$removal_cost_cutoff$.bind( inference_datastructures_enumerated_types.removal_cost_cutoff_for_productivity( productivity_limit ), thread );
                                    process_conjunctive_removal_hl_query_recursive( NIL, NIL, hl_literals, result_set, result_queue, ZERO_INTEGER, max_number, removal_properties );
                                    halt_reason = $kw12$EXHAUST_TOTAL;
                                  }
                                  finally
                                  {
                                    control_vars.$removal_cost_cutoff$.rebind( _prev_bind_6, thread );
                                    sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.rebind( _prev_bind_2_$9, thread );
                                    sbhl_marking_vars.$resourced_sbhl_marking_spaces$.rebind( _prev_bind_1_$8, thread );
                                    sbhl_marking_vars.$resourced_sbhl_marking_space_limit$.rebind( _prev_bind_0_$15, thread );
                                  }
                                }
                                finally
                                {
                                  final SubLObject _prev_bind_0_$16 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
                                  try
                                  {
                                    Threads.$is_thread_performing_cleanupP$.bind( T, thread );
                                    final SubLObject _values4 = Values.getValuesAsVector();
                                    memoization_state.memoization_state_possibly_clear_original_process( local_state3, original_memoization_process3 );
                                    Values.restoreValuesFromVector( _values4 );
                                  }
                                  finally
                                  {
                                    Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$16, thread );
                                  }
                                }
                              }
                              finally
                              {
                                memoization_state.$memoization_state$.rebind( _prev_bind_0_$14, thread );
                              }
                            }
                            finally
                            {
                              subl_macro_promotions.$with_timeout_nesting_depth$.rebind( _prev_bind_0_$13, thread );
                            }
                          }
                          finally
                          {
                            final SubLObject _prev_bind_0_$17 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
                            try
                            {
                              Threads.$is_thread_performing_cleanupP$.bind( T, thread );
                              final SubLObject _values5 = Values.getValuesAsVector();
                              subl_macro_promotions.with_timeout_stop_timer( timer2 );
                              Values.restoreValuesFromVector( _values5 );
                            }
                            finally
                            {
                              Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$17, thread );
                            }
                          }
                        }
                        finally
                        {
                          subl_macro_promotions.$within_with_timeout$.rebind( _prev_bind_0_$12, thread );
                        }
                      }
                      catch( final Throwable ccatch_env_var3 )
                      {
                        timed_out2 = Errors.handleThrowable( ccatch_env_var3, tag2 );
                      }
                      finally
                      {
                        thread.throwStack.pop();
                      }
                      if( NIL != timed_out2 )
                      {
                        halt_reason = $kw13$MAX_TIME;
                      }
                    }
                    else
                    {
                      final SubLObject local_state4;
                      final SubLObject state4 = local_state4 = memoization_state.possibly_new_memoization_state();
                      final SubLObject _prev_bind_0_$18 = memoization_state.$memoization_state$.currentBinding( thread );
                      try
                      {
                        memoization_state.$memoization_state$.bind( local_state4, thread );
                        final SubLObject original_memoization_process4 = memoization_state.memoization_state_original_process( local_state4 );
                        try
                        {
                          final SubLObject already_resourcing_p4 = sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.getDynamicValue( thread );
                          final SubLObject _prev_bind_0_$19 = sbhl_marking_vars.$resourced_sbhl_marking_space_limit$.currentBinding( thread );
                          final SubLObject _prev_bind_1_$9 = sbhl_marking_vars.$resourced_sbhl_marking_spaces$.currentBinding( thread );
                          final SubLObject _prev_bind_2_$10 = sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.currentBinding( thread );
                          final SubLObject _prev_bind_7 = control_vars.$removal_cost_cutoff$.currentBinding( thread );
                          try
                          {
                            sbhl_marking_vars.$resourced_sbhl_marking_space_limit$.bind( sbhl_marking_vars.determine_resource_limit( already_resourcing_p4, SIX_INTEGER ), thread );
                            sbhl_marking_vars.$resourced_sbhl_marking_spaces$.bind( sbhl_marking_vars.possibly_new_marking_resource( already_resourcing_p4 ), thread );
                            sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.bind( T, thread );
                            control_vars.$removal_cost_cutoff$.bind( inference_datastructures_enumerated_types.removal_cost_cutoff_for_productivity( productivity_limit ), thread );
                            process_conjunctive_removal_hl_query_recursive( NIL, NIL, hl_literals, result_set, result_queue, ZERO_INTEGER, max_number, removal_properties );
                            halt_reason = $kw12$EXHAUST_TOTAL;
                          }
                          finally
                          {
                            control_vars.$removal_cost_cutoff$.rebind( _prev_bind_7, thread );
                            sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.rebind( _prev_bind_2_$10, thread );
                            sbhl_marking_vars.$resourced_sbhl_marking_spaces$.rebind( _prev_bind_1_$9, thread );
                            sbhl_marking_vars.$resourced_sbhl_marking_space_limit$.rebind( _prev_bind_0_$19, thread );
                          }
                        }
                        finally
                        {
                          final SubLObject _prev_bind_0_$20 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
                          try
                          {
                            Threads.$is_thread_performing_cleanupP$.bind( T, thread );
                            final SubLObject _values6 = Values.getValuesAsVector();
                            memoization_state.memoization_state_possibly_clear_original_process( local_state4, original_memoization_process4 );
                            Values.restoreValuesFromVector( _values6 );
                          }
                          finally
                          {
                            Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$20, thread );
                          }
                        }
                      }
                      finally
                      {
                        memoization_state.$memoization_state$.rebind( _prev_bind_0_$18, thread );
                      }
                    }
                  }
                  catch( final Throwable ccatch_env_var4 )
                  {
                    halt_reason = Errors.handleThrowable( ccatch_env_var4, $kw11$QUERY_HALT );
                  }
                  finally
                  {
                    thread.throwStack.pop();
                  }
                }
                catch( final Throwable catch_var )
                {
                  Errors.handleThrowable( catch_var, NIL );
                }
              }
              finally
              {
                Errors.$error_handler$.rebind( _prev_bind_0_$11, thread );
              }
            }
            catch( final Throwable ccatch_env_var2 )
            {
              error_message = Errors.handleThrowable( ccatch_env_var2, $kw14$INFERENCE_ERROR );
            }
            finally
            {
              thread.throwStack.pop();
            }
          }
          if( NIL != error_message )
          {
            halt_reason = inference_datastructures_enumerated_types.new_inference_error_suspend_status( error_message );
          }
        }
        finally
        {
          inference_strategist.$within_inference_control_processP$.rebind( _prev_bind_0_$1, thread );
        }
      }
      catch( final Throwable ccatch_env_var5 )
      {
        aborted_p = Errors.handleThrowable( ccatch_env_var5, $kw10$INFERENCE_ABORT_TARGET );
      }
      finally
      {
        thread.throwStack.pop();
      }
      if( NIL != aborted_p )
      {
        halt_reason = $kw16$ABORT;
        inference_strategist.query_abort();
      }
    }
    finally
    {
      inference_worker.$currently_executing_tactics$.rebind( _prev_bind_3, thread );
      inference_worker.$currently_active_problem$.rebind( _prev_bind_2, thread );
      inference_trivial.$current_query_properties$.rebind( _prev_bind_0, thread );
    }
    result = queues.queue_elements( result_queue );
    return Values.values( result, halt_reason, metrics );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/conjunctive-strategist.lisp", position = 11267L)
  public static SubLObject process_conjunctive_removal_hl_query_recursive(final SubLObject new_bindings, final SubLObject old_bindings, final SubLObject hl_literals, final SubLObject result_set,
      final SubLObject result_queue, final SubLObject depth, SubLObject max_number, SubLObject query_properties)
  {
    if( max_number == UNPROVIDED )
    {
      max_number = NIL;
    }
    if( query_properties == UNPROVIDED )
    {
      query_properties = NIL;
    }
    SubLObject next_literal = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( hl_literals, hl_literals, $list17 );
    next_literal = hl_literals.first();
    final SubLObject rest_literals;
    final SubLObject current = rest_literals = hl_literals.rest();
    final SubLObject situated_next_literal = bindings.apply_bindings( new_bindings, next_literal );
    final SubLObject situated_rest_literals = bindings.apply_bindings( new_bindings, rest_literals );
    SubLObject cdolist_list_var;
    final SubLObject next_literal_result = cdolist_list_var = conjunctive_removal_literal_result( situated_next_literal, query_properties );
    SubLObject next_bindings = NIL;
    next_bindings = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      if( NIL != bindings.unification_success_token_p( next_bindings ) )
      {
        next_bindings = NIL;
      }
      final SubLObject extended_old_bindings = extend_bindings( new_bindings, old_bindings );
      if( NIL != rest_literals )
      {
        process_conjunctive_removal_hl_query_recursive( next_bindings, extended_old_bindings, situated_rest_literals, result_set, result_queue, number_utilities.f_1X( depth ), max_number, query_properties );
      }
      else
      {
        SubLObject final_bindings = extend_bindings( next_bindings, extended_old_bindings );
        final_bindings = Sequences.nreverse( conses_high.copy_tree( final_bindings ) );
        if( NIL == set.set_memberP( final_bindings, result_set ) )
        {
          set.set_add( final_bindings, result_set );
          queues.enqueue( final_bindings, result_queue );
          if( NIL != max_number && queues.queue_size( result_queue ).numGE( max_number ) )
          {
            Dynamic.sublisp_throw( $kw11$QUERY_HALT, $kw18$MAX_NUMBER );
          }
        }
      }
      cdolist_list_var = cdolist_list_var.rest();
      next_bindings = cdolist_list_var.first();
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/conjunctive-strategist.lisp", position = 13009L)
  public static SubLObject categorize_query_properties_wrt_conjunctive_strategist(final SubLObject query_properties)
  {
    SubLObject strategist_properties = NIL;
    SubLObject removal_properties = NIL;
    SubLObject ignored_properties = NIL;
    SubLObject remainder;
    SubLObject query_property;
    SubLObject value;
    for( remainder = NIL, remainder = query_properties; NIL != remainder; remainder = conses_high.cddr( remainder ) )
    {
      query_property = remainder.first();
      value = conses_high.cadr( remainder );
      if( NIL != list_utilities.member_eqP( query_property, $conjunctive_strategist_properties$.getGlobalValue() ) )
      {
        strategist_properties = conses_high.putf( strategist_properties, query_property, value );
      }
      else if( NIL != list_utilities.member_eqP( query_property, $conjunctive_strategist_removal_properties$.getGlobalValue() ) )
      {
        removal_properties = conses_high.putf( removal_properties, query_property, value );
      }
      else
      {
        ignored_properties = conses_high.putf( ignored_properties, query_property, value );
      }
    }
    return Values.values( strategist_properties, removal_properties, ignored_properties );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/conjunctive-strategist.lisp", position = 13741L)
  public static SubLObject conjunctive_removal_literal_result(final SubLObject situated_hl_literal, SubLObject query_properties)
  {
    if( query_properties == UNPROVIDED )
    {
      query_properties = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject ist = NIL;
    SubLObject mt = NIL;
    SubLObject hl_literal = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( situated_hl_literal, situated_hl_literal, $list20 );
    ist = situated_hl_literal.first();
    SubLObject current = situated_hl_literal.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, situated_hl_literal, $list20 );
    mt = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, situated_hl_literal, $list20 );
    hl_literal = current.first();
    current = current.rest();
    if( NIL == current )
    {
      list_utilities.verify_operator( ist, $const2$ist );
      final SubLObject asent = el_utilities.literal_atomic_sentence( hl_literal );
      final SubLObject truth = el_utilities.literal_truth( hl_literal );
      SubLObject result = NIL;
      final SubLObject _prev_bind_0 = cycl_grammar.$grammar_uses_kbP$.currentBinding( thread );
      try
      {
        cycl_grammar.$grammar_uses_kbP$.bind( NIL, thread );
        result = backward.removal_ask_bindings( asent, mt, truth, query_properties );
      }
      finally
      {
        cycl_grammar.$grammar_uses_kbP$.rebind( _prev_bind_0, thread );
      }
      return result;
    }
    cdestructuring_bind.cdestructuring_bind_error( situated_hl_literal, $list20 );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/conjunctive-strategist.lisp", position = 14181L)
  public static SubLObject extend_bindings(SubLObject new_bindings, SubLObject old_bindings)
  {
    if( NIL != new_bindings )
    {
      new_bindings = conses_high.copy_list( new_bindings );
      old_bindings = nextend_bindings( new_bindings, old_bindings );
    }
    return old_bindings;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/conjunctive-strategist.lisp", position = 14442L)
  public static SubLObject nextend_bindings(final SubLObject new_bindings, final SubLObject old_bindings)
  {
    return ConsesLow.nconc( new_bindings, old_bindings );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/conjunctive-strategist.lisp", position = 14582L)
  public static SubLObject test_canonicalize_conjunctive_contextualized_query(final SubLObject query)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    thread.resetMultipleValues();
    final SubLObject hl_query = canonicalize_conjunctive_contextualized_query( query );
    final SubLObject hl_variable_map = thread.secondMultipleValue();
    final SubLObject free_hl_vars = thread.thirdMultipleValue();
    thread.resetMultipleValues();
    return Values.values( variables.uncanonicalize_hl_vars( hl_query ), variables.uncanonicalize_hl_vars( hl_variable_map ), variables.uncanonicalize_hl_vars( free_hl_vars ) );
  }

  public static SubLObject declare_conjunctive_strategist_file()
  {
    SubLFiles.declareFunction( me, "new_cyc_conjunctive_query", "NEW-CYC-CONJUNCTIVE-QUERY", 1, 2, false );
    SubLFiles.declareFunction( me, "new_cyc_ordered_conjunctive_query", "NEW-CYC-ORDERED-CONJUNCTIVE-QUERY", 1, 2, false );
    SubLFiles.declareFunction( me, "contextualize_conjunctive_query", "CONTEXTUALIZE-CONJUNCTIVE-QUERY", 1, 1, false );
    SubLFiles.declareFunction( me, "el_unwrap_existentials", "EL-UNWRAP-EXISTENTIALS", 1, 0, false );
    SubLFiles.declareFunction( me, "el_wrap_existentials", "EL-WRAP-EXISTENTIALS", 2, 0, false );
    SubLFiles.declareFunction( me, "new_cyc_conjunctive_contextualized_query", "NEW-CYC-CONJUNCTIVE-CONTEXTUALIZED-QUERY", 1, 1, false );
    SubLFiles.declareFunction( me, "new_cyc_ordered_conjunctive_contextualized_query", "NEW-CYC-ORDERED-CONJUNCTIVE-CONTEXTUALIZED-QUERY", 1, 1, false );
    SubLFiles.declareFunction( me, "canonicalize_conjunctive_contextualized_query", "CANONICALIZE-CONJUNCTIVE-CONTEXTUALIZED-QUERY", 1, 0, false );
    SubLFiles.declareFunction( me, "new_cyc_conjunctive_contextualized_hl_query", "NEW-CYC-CONJUNCTIVE-CONTEXTUALIZED-HL-QUERY", 1, 1, false );
    SubLFiles.declareFunction( me, "order_conjunctive_contextualized_hl_query_wrt_removal", "ORDER-CONJUNCTIVE-CONTEXTUALIZED-HL-QUERY-WRT-REMOVAL", 1, 0, false );
    SubLFiles.declareFunction( me, "new_cyc_ordered_conjunctive_contextualized_hl_query", "NEW-CYC-ORDERED-CONJUNCTIVE-CONTEXTUALIZED-HL-QUERY", 1, 1, false );
    SubLFiles.declareFunction( me, "process_conjunctive_removal_hl_query_recursive", "PROCESS-CONJUNCTIVE-REMOVAL-HL-QUERY-RECURSIVE", 6, 2, false );
    SubLFiles.declareFunction( me, "categorize_query_properties_wrt_conjunctive_strategist", "CATEGORIZE-QUERY-PROPERTIES-WRT-CONJUNCTIVE-STRATEGIST", 1, 0, false );
    SubLFiles.declareFunction( me, "conjunctive_removal_literal_result", "CONJUNCTIVE-REMOVAL-LITERAL-RESULT", 1, 1, false );
    SubLFiles.declareFunction( me, "extend_bindings", "EXTEND-BINDINGS", 2, 0, false );
    SubLFiles.declareFunction( me, "nextend_bindings", "NEXTEND-BINDINGS", 2, 0, false );
    SubLFiles.declareFunction( me, "test_canonicalize_conjunctive_contextualized_query", "TEST-CANONICALIZE-CONJUNCTIVE-CONTEXTUALIZED-QUERY", 1, 0, false );
    return NIL;
  }

  public static SubLObject init_conjunctive_strategist_file()
  {
    $conjunctive_strategist_properties$ = SubLFiles.deflexical( "*CONJUNCTIVE-STRATEGIST-PROPERTIES*", $list19 );
    $conjunctive_strategist_removal_properties$ = SubLFiles.deflexical( "*CONJUNCTIVE-STRATEGIST-REMOVAL-PROPERTIES*", NIL );
    return NIL;
  }

  public static SubLObject setup_conjunctive_strategist_file()
  {
    generic_testing.define_test_case_table_int( $sym21$CONTEXTUALIZE_CONJUNCTIVE_QUERY, ConsesLow.list( new SubLObject[] { $kw22$TEST, NIL, $kw23$OWNER, NIL, $kw24$CLASSES, $list25, $kw26$KB, $kw27$FULL, $kw28$WORKING_,
      T
    } ), $list29 );
    generic_testing.define_test_case_table_int( $sym30$TEST_CANONICALIZE_CONJUNCTIVE_CONTEXTUALIZED_QUERY, ConsesLow.list( new SubLObject[] { $kw22$TEST, NIL, $kw23$OWNER, NIL, $kw24$CLASSES, $list25, $kw26$KB,
      $kw27$FULL, $kw28$WORKING_, T
    } ), $list31 );
    return NIL;
  }

  @Override
  public void declareFunctions()
  {
    declare_conjunctive_strategist_file();
  }

  @Override
  public void initializeVariables()
  {
    init_conjunctive_strategist_file();
  }

  @Override
  public void runTopLevelForms()
  {
    setup_conjunctive_strategist_file();
  }
  static
  {
    me = new conjunctive_strategist();
    $conjunctive_strategist_properties$ = null;
    $conjunctive_strategist_removal_properties$ = null;
    $const0$BaseKB = constant_handles.reader_make_constant_shell( makeString( "BaseKB" ) );
    $str1$_S_was_not_a_conjunction = makeString( "~S was not a conjunction" );
    $const2$ist = constant_handles.reader_make_constant_shell( makeString( "ist" ) );
    $list3 = ConsesLow.cons( makeSymbol( "FIRST-EL-VAR" ), makeSymbol( "REST-EL-VARS" ) );
    $const4$thereExists = constant_handles.reader_make_constant_shell( makeString( "thereExists" ) );
    $str5$_S_was_not_a_conjunction_of_liter = makeString( "~S was not a conjunction of literals" );
    $list6 = ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "and" ) ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "ist" ) ), constant_handles
        .reader_make_constant_shell( makeString( "EnglishMt" ) ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "givenNames" ) ), makeSymbol( "?VAR0" ), makeSymbol( "?VAR1" ) ) ), ConsesLow
            .list( constant_handles.reader_make_constant_shell( makeString( "ist" ) ), constant_handles.reader_make_constant_shell( makeString( "CyclistsMt" ) ), ConsesLow.list( constant_handles
                .reader_make_constant_shell( makeString( "prefixSubstring" ) ), makeString( "Ke" ), makeSymbol( "?VAR1" ) ) ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "ist" ) ),
                    constant_handles.reader_make_constant_shell( makeString( "CyclistsMt" ) ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "suffixSubstring" ) ), makeString( "n" ),
                        makeSymbol( "?VAR1" ) ) ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "ist" ) ), constant_handles.reader_make_constant_shell( makeString( "CyclistsMt" ) ), ConsesLow
                            .list( constant_handles.reader_make_constant_shell( makeString( "isa" ) ), makeSymbol( "?VAR0" ), constant_handles.reader_make_constant_shell( makeString( "HumanCyclist" ) ) ) ) );
    $list7 = ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "and" ) ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "ist" ) ), constant_handles
        .reader_make_constant_shell( makeString( "CyclistsMt" ) ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "isa" ) ), makeSymbol( "?VAR0" ), constant_handles.reader_make_constant_shell(
            makeString( "HumanCyclist" ) ) ) ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "ist" ) ), constant_handles.reader_make_constant_shell( makeString( "EnglishMt" ) ), ConsesLow
                .list( constant_handles.reader_make_constant_shell( makeString( "givenNames" ) ), makeSymbol( "?VAR0" ), makeSymbol( "?VAR1" ) ) ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString(
                    "ist" ) ), constant_handles.reader_make_constant_shell( makeString( "CyclistsMt" ) ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "prefixSubstring" ) ), makeString(
                        "Ke" ), makeSymbol( "?VAR1" ) ) ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "ist" ) ), constant_handles.reader_make_constant_shell( makeString( "CyclistsMt" ) ),
                            ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "suffixSubstring" ) ), makeString( "n" ), makeSymbol( "?VAR1" ) ) ) );
    $str8$time_to_implement_ORDER_CONJUNCTI = makeString( "time to implement ORDER-CONJUNCTIVE-CONTEXTUALIZED-HL-QUERY-WRT-REMOVAL" );
    $str9$ignoring_unhandled_properties____ = makeString( "ignoring unhandled properties:~%~S" );
    $kw10$INFERENCE_ABORT_TARGET = makeKeyword( "INFERENCE-ABORT-TARGET" );
    $kw11$QUERY_HALT = makeKeyword( "QUERY-HALT" );
    $kw12$EXHAUST_TOTAL = makeKeyword( "EXHAUST-TOTAL" );
    $kw13$MAX_TIME = makeKeyword( "MAX-TIME" );
    $kw14$INFERENCE_ERROR = makeKeyword( "INFERENCE-ERROR" );
    $sym15$INFERENCE_ERROR_HANDLER = makeSymbol( "INFERENCE-ERROR-HANDLER" );
    $kw16$ABORT = makeKeyword( "ABORT" );
    $list17 = ConsesLow.list( makeSymbol( "NEXT-LITERAL" ), makeSymbol( "&REST" ), makeSymbol( "REST-LITERALS" ) );
    $kw18$MAX_NUMBER = makeKeyword( "MAX-NUMBER" );
    $list19 = ConsesLow.list( makeKeyword( "MAX-NUMBER" ), makeKeyword( "MAX-TIME" ), makeKeyword( "PRODUCTIVITY-LIMIT" ) );
    $list20 = ConsesLow.list( makeSymbol( "IST" ), makeSymbol( "MT" ), makeSymbol( "HL-LITERAL" ) );
    $sym21$CONTEXTUALIZE_CONJUNCTIVE_QUERY = makeSymbol( "CONTEXTUALIZE-CONJUNCTIVE-QUERY" );
    $kw22$TEST = makeKeyword( "TEST" );
    $kw23$OWNER = makeKeyword( "OWNER" );
    $kw24$CLASSES = makeKeyword( "CLASSES" );
    $list25 = ConsesLow.list( makeSymbol( "CONJUNCTIVE-STRATEGIST" ) );
    $kw26$KB = makeKeyword( "KB" );
    $kw27$FULL = makeKeyword( "FULL" );
    $kw28$WORKING_ = makeKeyword( "WORKING?" );
    $list29 = ConsesLow.list( ConsesLow.list( ConsesLow.list( ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "and" ) ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString(
        "ist" ) ), constant_handles.reader_make_constant_shell( makeString( "EnglishMt" ) ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "givenNames" ) ), makeSymbol( "?CYCLIST" ),
            makeSymbol( "?NAME" ) ) ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "prefixSubstring" ) ), makeString( "Ke" ), makeSymbol( "?NAME" ) ), ConsesLow.list( constant_handles
                .reader_make_constant_shell( makeString( "suffixSubstring" ) ), makeString( "n" ), makeSymbol( "?NAME" ) ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "isa" ) ), makeSymbol(
                    "?CYCLIST" ), constant_handles.reader_make_constant_shell( makeString( "HumanCyclist" ) ) ) ), constant_handles.reader_make_constant_shell( makeString( "CyclistsMt" ) ) ), ConsesLow.list(
                        constant_handles.reader_make_constant_shell( makeString( "and" ) ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "ist" ) ), constant_handles.reader_make_constant_shell(
                            makeString( "EnglishMt" ) ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "givenNames" ) ), makeSymbol( "?CYCLIST" ), makeSymbol( "?NAME" ) ) ), ConsesLow.list(
                                constant_handles.reader_make_constant_shell( makeString( "ist" ) ), constant_handles.reader_make_constant_shell( makeString( "CyclistsMt" ) ), ConsesLow.list( constant_handles
                                    .reader_make_constant_shell( makeString( "prefixSubstring" ) ), makeString( "Ke" ), makeSymbol( "?NAME" ) ) ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString(
                                        "ist" ) ), constant_handles.reader_make_constant_shell( makeString( "CyclistsMt" ) ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString(
                                            "suffixSubstring" ) ), makeString( "n" ), makeSymbol( "?NAME" ) ) ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "ist" ) ), constant_handles
                                                .reader_make_constant_shell( makeString( "CyclistsMt" ) ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "isa" ) ), makeSymbol( "?CYCLIST" ),
                                                    constant_handles.reader_make_constant_shell( makeString( "HumanCyclist" ) ) ) ) ) ) );
    $sym30$TEST_CANONICALIZE_CONJUNCTIVE_CONTEXTUALIZED_QUERY = makeSymbol( "TEST-CANONICALIZE-CONJUNCTIVE-CONTEXTUALIZED-QUERY" );
    $list31 = ConsesLow.list( ConsesLow.list( ConsesLow.list( ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "and" ) ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString(
        "ist" ) ), constant_handles.reader_make_constant_shell( makeString( "EnglishMt" ) ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "givenNames" ) ), makeSymbol( "?CYCLIST" ),
            makeSymbol( "?NAME" ) ) ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "ist" ) ), constant_handles.reader_make_constant_shell( makeString( "CyclistsMt" ) ), ConsesLow.list(
                constant_handles.reader_make_constant_shell( makeString( "prefixSubstring" ) ), makeString( "Ke" ), makeSymbol( "?NAME" ) ) ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString(
                    "ist" ) ), constant_handles.reader_make_constant_shell( makeString( "CyclistsMt" ) ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "suffixSubstring" ) ), makeString( "n" ),
                        makeSymbol( "?NAME" ) ) ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "ist" ) ), constant_handles.reader_make_constant_shell( makeString( "CyclistsMt" ) ), ConsesLow
                            .list( constant_handles.reader_make_constant_shell( makeString( "isa" ) ), makeSymbol( "?CYCLIST" ), constant_handles.reader_make_constant_shell( makeString( "HumanCyclist" ) ) ) ) ) ),
        ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "and" ) ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "ist" ) ), constant_handles.reader_make_constant_shell(
            makeString( "EnglishMt" ) ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "givenNames" ) ), makeSymbol( "?VAR0" ), makeSymbol( "?VAR1" ) ) ), ConsesLow.list( constant_handles
                .reader_make_constant_shell( makeString( "ist" ) ), constant_handles.reader_make_constant_shell( makeString( "CyclistsMt" ) ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString(
                    "prefixSubstring" ) ), makeString( "Ke" ), makeSymbol( "?VAR1" ) ) ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "ist" ) ), constant_handles.reader_make_constant_shell(
                        makeString( "CyclistsMt" ) ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "suffixSubstring" ) ), makeString( "n" ), makeSymbol( "?VAR1" ) ) ), ConsesLow.list(
                            constant_handles.reader_make_constant_shell( makeString( "ist" ) ), constant_handles.reader_make_constant_shell( makeString( "CyclistsMt" ) ), ConsesLow.list( constant_handles
                                .reader_make_constant_shell( makeString( "isa" ) ), makeSymbol( "?VAR0" ), constant_handles.reader_make_constant_shell( makeString( "HumanCyclist" ) ) ) ) ), ConsesLow.list( ConsesLow
                                    .cons( makeSymbol( "?VAR0" ), makeSymbol( "?CYCLIST" ) ), ConsesLow.cons( makeSymbol( "?VAR1" ), makeSymbol( "?NAME" ) ) ), ConsesLow.list( makeSymbol( "?VAR0" ), makeSymbol(
                                        "?VAR1" ) ) ) );
  }
}
/*
 * 
 * Total time: 683 ms
 * 
 */