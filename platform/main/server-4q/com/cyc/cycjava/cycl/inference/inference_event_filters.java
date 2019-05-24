package com.cyc.cycjava.cycl.inference;

import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import com.cyc.cycjava.cycl.utilities_macros;
import com.cyc.cycjava.cycl.access_macros;
import com.cyc.cycjava.cycl.subl_macro_promotions;
import com.cyc.cycjava.cycl.event_broker;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.cycjava.cycl.dictionary_utilities;
import com.cyc.cycjava.cycl.dictionary;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Locks;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.cycjava.cycl.event_utilities;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.cycjava.cycl.subl_promotions;
import com.cyc.cycjava.cycl.inference.harness.inference_datastructures_problem_store;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types;
import com.cyc.cycjava.cycl.inference.harness.inference_datastructures_inference;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Mapping;
import com.cyc.cycjava.cycl.event_model;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class inference_event_filters
    extends
      SubLTranslatedFile
{
  public static final SubLFile me;
  public static final String myName = "com.cyc.cycjava.cycl.inference.inference_event_filters";
  public static final String myFingerPrint = "4c4f98219ddba86b1b78ded8971264e335e9ad74950381525b5904d28ba3ecb6";
  @SubLTranslatedFile.SubL(source = "cycl/inference/inference-event-filters.lisp", position = 1029L)
  private static SubLSymbol $inference_event_filter_lock$;
  @SubLTranslatedFile.SubL(source = "cycl/inference/inference-event-filters.lisp", position = 1288L)
  private static SubLSymbol $inference_event_filter_listeners$;
  @SubLTranslatedFile.SubL(source = "cycl/inference/inference-event-filters.lisp", position = 1505L)
  private static SubLSymbol $inference_event_filter_relayer$;
  @SubLTranslatedFile.SubL(source = "cycl/inference/inference-event-filters.lisp", position = 1716L)
  private static SubLSymbol $known_inference_events$;
  private static final SubLSymbol $sym0$_INFERENCE_EVENT_FILTER_LOCK_;
  private static final SubLString $str1$Inference_Event_Filter_Lock;
  private static final SubLSymbol $sym2$_INFERENCE_EVENT_FILTER_LISTENERS_;
  private static final SubLSymbol $sym3$WITH_LOCK_HELD;
  private static final SubLList $list4;
  private static final SubLSymbol $sym5$_INFERENCE_EVENT_FILTER_RELAYER_;
  private static final SubLSymbol $kw6$INFERENCE_EVENT;
  private static final SubLSymbol $sym7$RELAY_INFERENCE_EVENT;
  private static final SubLSymbol $sym8$EVENT_CLASS_SELF;
  private static final SubLSymbol $sym9$REGISTER_HANDLER_FOR_ALL_INFERENCE_EVENTS;
  private static final SubLSymbol $sym10$INFERENCE_P;
  private static final SubLSymbol $sym11$FUNCTION_SPEC_P;
  private static final SubLSymbol $sym12$REGISTER_HANDLER_FOR_INFERENCE_EVENT;
  private static final SubLSymbol $sym13$KEYWORDP;
  private static final SubLString $str14$Invalid_argument__A_does_not_deno;
  private static final SubLSymbol $sym15$DEREGISTER_HANDLER_FOR_INFERENCE_EVENT;
  private static final SubLSymbol $kw16$INFERENCE_NEW_ANSWER;
  private static final SubLSymbol $kw17$INFERENCE_STATUS_CHANGE;
  private static final SubLSymbol $kw18$SKSI_QUERY;
  private static final SubLString $str19$Unknown_inference_event_message__;
  private static final SubLSymbol $kw20$IGNORE_ERRORS_TARGET;
  private static final SubLSymbol $sym21$IGNORE_ERRORS_HANDLER;
  private static final SubLString $str22$__Inference__A__A_generated_answe;
  private static final SubLSymbol $sym23$PRINT_NEW_INFERENCE_ANSWER_MESSAGE;
  private static final SubLSymbol $kw24$DEAD;
  private static final SubLSymbol $kw25$CLASS;
  private static final SubLSymbol $kw26$PROBLEM_ID;
  private static final SubLSymbol $kw27$TACTIC_ID;
  private static final SubLSymbol $kw28$STATUS;
  private static final SubLSymbol $kw29$START_TIME;
  private static final SubLSymbol $kw30$END_TIME;
  private static final SubLString $str31$__Inference__A__A_generated_SKSI_;
  private static final SubLSymbol $sym32$PRINT_SKSI_QUERY_MESSAGE;
  private static final SubLSymbol $kw33$DEREGISTERED;

  @SubLTranslatedFile.SubL(source = "cycl/inference/inference-event-filters.lisp", position = 1364L)
  public static SubLObject with_inference_event_filter_lock(final SubLObject macroform, final SubLObject environment)
  {
    final SubLObject datum = macroform.rest();
    final SubLObject body;
    final SubLObject current = body = datum;
    return ConsesLow.listS( $sym3$WITH_LOCK_HELD, $list4, ConsesLow.append( body, NIL ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/inference-event-filters.lisp", position = 1875L)
  public static SubLObject rebuild_known_inference_events()
  {
    $known_inference_events$.setGlobalValue( Mapping.mapcar( Symbols.symbol_function( $sym8$EVENT_CLASS_SELF ), event_model.children_of_event_class_in_hierarchy( $kw6$INFERENCE_EVENT, event_model
        .core_event_hierarchy() ) ) );
    return Sequences.length( $known_inference_events$.getGlobalValue() );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/inference-event-filters.lisp", position = 2113L)
  public static SubLObject register_handler_for_all_inference_events(final SubLObject inference, final SubLObject handler)
  {
    assert NIL != inference_datastructures_inference.inference_p( inference ) : inference;
    assert NIL != Types.function_spec_p( handler ) : handler;
    final SubLObject problem_store = inference_datastructures_inference.inference_problem_store( inference );
    final SubLObject problem_store_id = inference_datastructures_problem_store.problem_store_suid( problem_store );
    final SubLObject inference_id = inference_datastructures_inference.inference_suid( inference );
    register_inference_event_handlers_for_problem_store_and_inference( $known_inference_events$.getGlobalValue(), handler, problem_store_id, inference_id );
    return inference_event.ensure_inference_event_dispatcher_running();
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/inference-event-filters.lisp", position = 2839L)
  public static SubLObject register_handler_for_inference_event(final SubLObject inference, final SubLObject handler, final SubLObject event)
  {
    assert NIL != inference_datastructures_inference.inference_p( inference ) : inference;
    assert NIL != Types.function_spec_p( handler ) : handler;
    assert NIL != Types.keywordp( event ) : event;
    if( NIL == subl_promotions.memberP( event, $known_inference_events$.getGlobalValue(), UNPROVIDED, UNPROVIDED ) )
    {
      Errors.error( $str14$Invalid_argument__A_does_not_deno, event );
    }
    final SubLObject problem_store = inference_datastructures_inference.inference_problem_store( inference );
    final SubLObject problem_store_id = inference_datastructures_problem_store.problem_store_suid( problem_store );
    final SubLObject inference_id = inference_datastructures_inference.inference_suid( inference );
    register_inference_event_handler_for_problem_store_and_inference( event, handler, problem_store_id, inference_id );
    return inference_event.ensure_inference_event_dispatcher_running();
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/inference-event-filters.lisp", position = 3660L)
  public static SubLObject deregister_handler_for_inference_event(final SubLObject problem_store_id, final SubLObject inference_id, final SubLObject handler)
  {
    deregister_inference_event_handlers_for_problem_store_and_inference( problem_store_id, inference_id, handler );
    return inference_event.ensure_inference_event_dispatcher_running();
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/inference-event-filters.lisp", position = 4097L)
  public static SubLObject register_inference_event_handlers_for_problem_store_and_inference(final SubLObject events, final SubLObject handler, final SubLObject problem_store_id, final SubLObject inference_id)
  {
    SubLObject cdolist_list_var = events;
    SubLObject event = NIL;
    event = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      register_inference_event_handler_for_problem_store_and_inference( event, handler, problem_store_id, inference_id );
      cdolist_list_var = cdolist_list_var.rest();
      event = cdolist_list_var.first();
    }
    return problem_store_id;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/inference-event-filters.lisp", position = 4408L)
  public static SubLObject relay_inference_event(final SubLObject event, SubLObject my_params)
  {
    if( my_params == UNPROVIDED )
    {
      my_params = NIL;
    }
    if( NIL == event_utilities.event_is_handler_registration_eventP( event ) )
    {
      final SubLObject pcase_var = event_model.event_class( event );
      if( pcase_var.eql( $kw16$INFERENCE_NEW_ANSWER ) )
      {
        relay_inference_new_answer_event( event );
      }
      else if( pcase_var.eql( $kw17$INFERENCE_STATUS_CHANGE ) )
      {
        relay_inference_status_change_event( event );
      }
      else if( pcase_var.eql( $kw18$SKSI_QUERY ) )
      {
        relay_sksi_query_event( event );
      }
      else
      {
        Errors.warn( $str19$Unknown_inference_event_message__, event_model.event_class( event ) );
      }
    }
    return event;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/inference-event-filters.lisp", position = 5175L)
  public static SubLObject relay_inference_new_answer_event(final SubLObject event)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject problem_store_id = inference_event.inference_new_answer_retrieve_problem_store_id( event );
    final SubLObject inference_id = inference_event.inference_new_answer_retrieve_inference_id( event );
    final SubLObject new_answer_id = inference_event.inference_new_answer_retrieve_new_answer_id( event );
    SubLObject cdolist_list_var = get_inference_event_listeners_on_problem_store_and_inference( event, problem_store_id, inference_id, UNPROVIDED );
    SubLObject listener = NIL;
    listener = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      SubLObject ignore_errors_tag = NIL;
      try
      {
        thread.throwStack.push( $kw20$IGNORE_ERRORS_TARGET );
        final SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding( thread );
        try
        {
          Errors.$error_handler$.bind( Symbols.symbol_function( $sym21$IGNORE_ERRORS_HANDLER ), thread );
          try
          {
            Functions.funcall( listener, problem_store_id, inference_id, new_answer_id );
          }
          catch( final Throwable catch_var )
          {
            Errors.handleThrowable( catch_var, NIL );
          }
        }
        finally
        {
          Errors.$error_handler$.rebind( _prev_bind_0, thread );
        }
      }
      catch( final Throwable ccatch_env_var )
      {
        ignore_errors_tag = Errors.handleThrowable( ccatch_env_var, $kw20$IGNORE_ERRORS_TARGET );
      }
      finally
      {
        thread.throwStack.pop();
      }
      cdolist_list_var = cdolist_list_var.rest();
      listener = cdolist_list_var.first();
    }
    return event;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/inference-event-filters.lisp", position = 5735L)
  public static SubLObject print_new_inference_answer_message(final SubLObject store_id, final SubLObject inference_id, final SubLObject answer_id)
  {
    PrintLow.format( T, $str22$__Inference__A__A_generated_answe, new SubLObject[] { store_id, inference_id, answer_id
    } );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/inference-event-filters.lisp", position = 6073L)
  public static SubLObject relay_inference_status_change_event(final SubLObject event)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject problem_store_id = inference_event.inference_status_change_retrieve_problem_store_id( event );
    final SubLObject inference_id = inference_event.inference_status_change_retrieve_inference_id( event );
    final SubLObject new_status = inference_event.inference_status_change_retrieve_new_status( event );
    final SubLObject removeP = Equality.eq( new_status, $kw24$DEAD );
    SubLObject cdolist_list_var = get_inference_event_listeners_on_problem_store_and_inference( event, problem_store_id, inference_id, removeP );
    SubLObject listener = NIL;
    listener = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      SubLObject ignore_errors_tag = NIL;
      try
      {
        thread.throwStack.push( $kw20$IGNORE_ERRORS_TARGET );
        final SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding( thread );
        try
        {
          Errors.$error_handler$.bind( Symbols.symbol_function( $sym21$IGNORE_ERRORS_HANDLER ), thread );
          try
          {
            Functions.funcall( listener, problem_store_id, inference_id, new_status );
          }
          catch( final Throwable catch_var )
          {
            Errors.handleThrowable( catch_var, NIL );
          }
        }
        finally
        {
          Errors.$error_handler$.rebind( _prev_bind_0, thread );
        }
      }
      catch( final Throwable ccatch_env_var )
      {
        ignore_errors_tag = Errors.handleThrowable( ccatch_env_var, $kw20$IGNORE_ERRORS_TARGET );
      }
      finally
      {
        thread.throwStack.pop();
      }
      cdolist_list_var = cdolist_list_var.rest();
      listener = cdolist_list_var.first();
    }
    return event;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/inference-event-filters.lisp", position = 6697L)
  public static SubLObject relay_sksi_query_event(final SubLObject event)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject problem_store_id = inference_event.sksi_query_retrieve_problem_store_id( event );
    final SubLObject inference_id = inference_event.sksi_query_retrieve_inference_id( event );
    final SubLObject problem_id = inference_event.sksi_query_retrieve_problem_id( event );
    final SubLObject tactic_id = inference_event.sksi_query_retrieve_tactic_id( event );
    final SubLObject status = inference_event.sksi_query_retrieve_status( event );
    final SubLObject start_time = inference_event.sksi_query_retrieve_start_time( event );
    final SubLObject end_time = inference_event.sksi_query_retrieve_end_time( event );
    final SubLObject v_properties = ConsesLow.listS( $kw25$CLASS, new SubLObject[] { $kw18$SKSI_QUERY, $kw26$PROBLEM_ID, problem_id, $kw27$TACTIC_ID, tactic_id, $kw28$STATUS, status, ConsesLow.append(
        ( NIL != start_time ) ? ConsesLow.list( $kw29$START_TIME, start_time ) : NIL, ( NIL != end_time ) ? ConsesLow.list( $kw30$END_TIME, end_time ) : NIL, NIL )
    } );
    SubLObject cdolist_list_var = get_inference_event_listeners_on_problem_store_and_inference( event, problem_store_id, inference_id, UNPROVIDED );
    SubLObject listener = NIL;
    listener = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      SubLObject ignore_errors_tag = NIL;
      try
      {
        thread.throwStack.push( $kw20$IGNORE_ERRORS_TARGET );
        final SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding( thread );
        try
        {
          Errors.$error_handler$.bind( Symbols.symbol_function( $sym21$IGNORE_ERRORS_HANDLER ), thread );
          try
          {
            Functions.funcall( listener, problem_store_id, inference_id, v_properties );
          }
          catch( final Throwable catch_var )
          {
            Errors.handleThrowable( catch_var, NIL );
          }
        }
        finally
        {
          Errors.$error_handler$.rebind( _prev_bind_0, thread );
        }
      }
      catch( final Throwable ccatch_env_var )
      {
        ignore_errors_tag = Errors.handleThrowable( ccatch_env_var, $kw20$IGNORE_ERRORS_TARGET );
      }
      finally
      {
        thread.throwStack.pop();
      }
      cdolist_list_var = cdolist_list_var.rest();
      listener = cdolist_list_var.first();
    }
    return event;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/inference-event-filters.lisp", position = 6697L)
  public static SubLObject print_sksi_query_message(final SubLObject store_id, final SubLObject inference_id, final SubLObject parameter)
  {
    PrintLow.format( T, $str31$__Inference__A__A_generated_SKSI_, new SubLObject[] { store_id, inference_id, parameter
    } );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/inference-event-filters.lisp", position = 8030L)
  public static SubLObject get_inference_event_listeners_on_problem_store_and_inference(final SubLObject event, final SubLObject problem_store_id, final SubLObject inference_id, SubLObject removeP)
  {
    if( removeP == UNPROVIDED )
    {
      removeP = NIL;
    }
    final SubLObject event_type_listeners = $inference_event_filter_listeners$.getGlobalValue();
    SubLObject listeners = NIL;
    SubLObject release = NIL;
    try
    {
      release = Locks.seize_lock( $inference_event_filter_lock$.getGlobalValue() );
      final SubLObject problem_store_listeners = dictionary.dictionary_lookup( event_type_listeners, event_model.event_class( event ), UNPROVIDED );
      if( NIL != dictionary.dictionary_p( problem_store_listeners ) )
      {
        final SubLObject inference_listeners = dictionary.dictionary_lookup( problem_store_listeners, problem_store_id, UNPROVIDED );
        if( NIL != dictionary.dictionary_p( inference_listeners ) )
        {
          listeners = dictionary.dictionary_lookup( inference_listeners, inference_id, UNPROVIDED );
          if( NIL != removeP && NIL != listeners )
          {
            deregister_inference_event_handlers_for_problem_store_and_inference( problem_store_id, inference_id, UNPROVIDED );
          }
        }
      }
    }
    finally
    {
      if( NIL != release )
      {
        Locks.release_lock( $inference_event_filter_lock$.getGlobalValue() );
      }
    }
    return listeners;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/inference-event-filters.lisp", position = 9200L)
  public static SubLObject register_inference_event_handler_for_problem_store_and_inference(final SubLObject event, final SubLObject handler, final SubLObject problem_store_id, final SubLObject inference_id)
  {
    final SubLObject event_type_listeners = $inference_event_filter_listeners$.getGlobalValue();
    SubLObject release = NIL;
    try
    {
      release = Locks.seize_lock( $inference_event_filter_lock$.getGlobalValue() );
      SubLObject problem_store_listeners = dictionary.dictionary_lookup( event_type_listeners, event, UNPROVIDED );
      if( NIL == dictionary.dictionary_p( problem_store_listeners ) )
      {
        problem_store_listeners = dictionary.new_dictionary( UNPROVIDED, UNPROVIDED );
        dictionary.dictionary_enter( event_type_listeners, event, problem_store_listeners );
      }
      SubLObject inference_listeners = dictionary.dictionary_lookup( problem_store_listeners, problem_store_id, UNPROVIDED );
      if( NIL == dictionary.dictionary_p( inference_listeners ) )
      {
        inference_listeners = dictionary.new_dictionary( UNPROVIDED, UNPROVIDED );
        dictionary.dictionary_enter( problem_store_listeners, problem_store_id, inference_listeners );
      }
      dictionary_utilities.dictionary_push( inference_listeners, inference_id, handler );
    }
    finally
    {
      if( NIL != release )
      {
        Locks.release_lock( $inference_event_filter_lock$.getGlobalValue() );
      }
    }
    return event;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/inference-event-filters.lisp", position = 10143L)
  public static SubLObject deregister_inference_event_handlers_for_problem_store_and_inference(final SubLObject problem_store_id, final SubLObject inference_id, SubLObject handler)
  {
    if( handler == UNPROVIDED )
    {
      handler = NIL;
    }
    SubLObject release = NIL;
    try
    {
      release = Locks.seize_lock( $inference_event_filter_lock$.getGlobalValue() );
      SubLObject cdolist_list_var = $known_inference_events$.getGlobalValue();
      SubLObject event = NIL;
      event = cdolist_list_var.first();
      while ( NIL != cdolist_list_var)
      {
        final SubLObject event_type_listeners = $inference_event_filter_listeners$.getGlobalValue();
        final SubLObject problem_store_listeners = dictionary.dictionary_lookup( event_type_listeners, event, UNPROVIDED );
        if( NIL != dictionary.dictionary_p( problem_store_listeners ) )
        {
          final SubLObject inference_listeners = dictionary.dictionary_lookup( problem_store_listeners, problem_store_id, UNPROVIDED );
          if( NIL != dictionary.dictionary_p( inference_listeners ) )
          {
            if( handler.isFunctionSpec() )
            {
              dictionary_utilities.dictionary_remove_from_value( inference_listeners, inference_id, handler, UNPROVIDED, UNPROVIDED );
            }
            else
            {
              dictionary.dictionary_remove( inference_listeners, inference_id );
            }
            if( dictionary.dictionary_length( inference_listeners ).isZero() || NIL == inference_datastructures_problem_store.valid_problem_store_p( inference_datastructures_problem_store.find_problem_store_by_id(
                problem_store_id ) ) )
            {
              dictionary.dictionary_remove( problem_store_listeners, problem_store_id );
            }
          }
        }
        cdolist_list_var = cdolist_list_var.rest();
        event = cdolist_list_var.first();
      }
    }
    finally
    {
      if( NIL != release )
      {
        Locks.release_lock( $inference_event_filter_lock$.getGlobalValue() );
      }
    }
    return $kw33$DEREGISTERED;
  }

  public static SubLObject declare_inference_event_filters_file()
  {
    SubLFiles.declareMacro( me, "with_inference_event_filter_lock", "WITH-INFERENCE-EVENT-FILTER-LOCK" );
    SubLFiles.declareFunction( me, "rebuild_known_inference_events", "REBUILD-KNOWN-INFERENCE-EVENTS", 0, 0, false );
    SubLFiles.declareFunction( me, "register_handler_for_all_inference_events", "REGISTER-HANDLER-FOR-ALL-INFERENCE-EVENTS", 2, 0, false );
    SubLFiles.declareFunction( me, "register_handler_for_inference_event", "REGISTER-HANDLER-FOR-INFERENCE-EVENT", 3, 0, false );
    SubLFiles.declareFunction( me, "deregister_handler_for_inference_event", "DEREGISTER-HANDLER-FOR-INFERENCE-EVENT", 3, 0, false );
    SubLFiles.declareFunction( me, "register_inference_event_handlers_for_problem_store_and_inference", "REGISTER-INFERENCE-EVENT-HANDLERS-FOR-PROBLEM-STORE-AND-INFERENCE", 4, 0, false );
    SubLFiles.declareFunction( me, "relay_inference_event", "RELAY-INFERENCE-EVENT", 1, 1, false );
    SubLFiles.declareFunction( me, "relay_inference_new_answer_event", "RELAY-INFERENCE-NEW-ANSWER-EVENT", 1, 0, false );
    SubLFiles.declareFunction( me, "print_new_inference_answer_message", "PRINT-NEW-INFERENCE-ANSWER-MESSAGE", 3, 0, false );
    SubLFiles.declareFunction( me, "relay_inference_status_change_event", "RELAY-INFERENCE-STATUS-CHANGE-EVENT", 1, 0, false );
    SubLFiles.declareFunction( me, "relay_sksi_query_event", "RELAY-SKSI-QUERY-EVENT", 1, 0, false );
    SubLFiles.declareFunction( me, "print_sksi_query_message", "PRINT-SKSI-QUERY-MESSAGE", 3, 0, false );
    SubLFiles.declareFunction( me, "get_inference_event_listeners_on_problem_store_and_inference", "GET-INFERENCE-EVENT-LISTENERS-ON-PROBLEM-STORE-AND-INFERENCE", 3, 1, false );
    SubLFiles.declareFunction( me, "register_inference_event_handler_for_problem_store_and_inference", "REGISTER-INFERENCE-EVENT-HANDLER-FOR-PROBLEM-STORE-AND-INFERENCE", 4, 0, false );
    SubLFiles.declareFunction( me, "deregister_inference_event_handlers_for_problem_store_and_inference", "DEREGISTER-INFERENCE-EVENT-HANDLERS-FOR-PROBLEM-STORE-AND-INFERENCE", 2, 1, false );
    return NIL;
  }

  public static SubLObject init_inference_event_filters_file()
  {
    $inference_event_filter_lock$ = SubLFiles.deflexical( "*INFERENCE-EVENT-FILTER-LOCK*", maybeDefault( $sym0$_INFERENCE_EVENT_FILTER_LOCK_, $inference_event_filter_lock$, () -> ( Locks.make_lock(
        $str1$Inference_Event_Filter_Lock ) ) ) );
    $inference_event_filter_listeners$ = SubLFiles.deflexical( "*INFERENCE-EVENT-FILTER-LISTENERS*", maybeDefault( $sym2$_INFERENCE_EVENT_FILTER_LISTENERS_, $inference_event_filter_listeners$, () -> ( dictionary
        .new_dictionary( UNPROVIDED, UNPROVIDED ) ) ) );
    $inference_event_filter_relayer$ = SubLFiles.deflexical( "*INFERENCE-EVENT-FILTER-RELAYER*", maybeDefault( $sym5$_INFERENCE_EVENT_FILTER_RELAYER_, $inference_event_filter_relayer$, () -> ( event_broker
        .describe_funcall_listener( $kw6$INFERENCE_EVENT, $sym7$RELAY_INFERENCE_EVENT, UNPROVIDED, UNPROVIDED ) ) ) );
    $known_inference_events$ = SubLFiles.deflexical( "*KNOWN-INFERENCE-EVENTS*", Mapping.mapcar( Symbols.symbol_function( $sym8$EVENT_CLASS_SELF ), event_model.children_of_event_class_in_hierarchy( $kw6$INFERENCE_EVENT,
        event_model.core_event_hierarchy() ) ) );
    return NIL;
  }

  public static SubLObject setup_inference_event_filters_file()
  {
    subl_macro_promotions.declare_defglobal( $sym0$_INFERENCE_EVENT_FILTER_LOCK_ );
    subl_macro_promotions.declare_defglobal( $sym2$_INFERENCE_EVENT_FILTER_LISTENERS_ );
    subl_macro_promotions.declare_defglobal( $sym5$_INFERENCE_EVENT_FILTER_RELAYER_ );
    inference_event.register_listener_with_inference_event_dispatcher( $inference_event_filter_relayer$.getGlobalValue() );
    access_macros.register_external_symbol( $sym9$REGISTER_HANDLER_FOR_ALL_INFERENCE_EVENTS );
    access_macros.register_external_symbol( $sym12$REGISTER_HANDLER_FOR_INFERENCE_EVENT );
    access_macros.register_external_symbol( $sym15$DEREGISTER_HANDLER_FOR_INFERENCE_EVENT );
    utilities_macros.note_funcall_helper_function( $sym23$PRINT_NEW_INFERENCE_ANSWER_MESSAGE );
    utilities_macros.note_funcall_helper_function( $sym32$PRINT_SKSI_QUERY_MESSAGE );
    return NIL;
  }

  @Override
  public void declareFunctions()
  {
    declare_inference_event_filters_file();
  }

  @Override
  public void initializeVariables()
  {
    init_inference_event_filters_file();
  }

  @Override
  public void runTopLevelForms()
  {
    setup_inference_event_filters_file();
  }
  static
  {
    me = new inference_event_filters();
    $inference_event_filter_lock$ = null;
    $inference_event_filter_listeners$ = null;
    $inference_event_filter_relayer$ = null;
    $known_inference_events$ = null;
    $sym0$_INFERENCE_EVENT_FILTER_LOCK_ = makeSymbol( "*INFERENCE-EVENT-FILTER-LOCK*" );
    $str1$Inference_Event_Filter_Lock = makeString( "Inference Event Filter Lock" );
    $sym2$_INFERENCE_EVENT_FILTER_LISTENERS_ = makeSymbol( "*INFERENCE-EVENT-FILTER-LISTENERS*" );
    $sym3$WITH_LOCK_HELD = makeSymbol( "WITH-LOCK-HELD" );
    $list4 = ConsesLow.list( makeSymbol( "*INFERENCE-EVENT-FILTER-LOCK*" ) );
    $sym5$_INFERENCE_EVENT_FILTER_RELAYER_ = makeSymbol( "*INFERENCE-EVENT-FILTER-RELAYER*" );
    $kw6$INFERENCE_EVENT = makeKeyword( "INFERENCE-EVENT" );
    $sym7$RELAY_INFERENCE_EVENT = makeSymbol( "RELAY-INFERENCE-EVENT" );
    $sym8$EVENT_CLASS_SELF = makeSymbol( "EVENT-CLASS-SELF" );
    $sym9$REGISTER_HANDLER_FOR_ALL_INFERENCE_EVENTS = makeSymbol( "REGISTER-HANDLER-FOR-ALL-INFERENCE-EVENTS" );
    $sym10$INFERENCE_P = makeSymbol( "INFERENCE-P" );
    $sym11$FUNCTION_SPEC_P = makeSymbol( "FUNCTION-SPEC-P" );
    $sym12$REGISTER_HANDLER_FOR_INFERENCE_EVENT = makeSymbol( "REGISTER-HANDLER-FOR-INFERENCE-EVENT" );
    $sym13$KEYWORDP = makeSymbol( "KEYWORDP" );
    $str14$Invalid_argument__A_does_not_deno = makeString( "Invalid argument ~A does not denot an inference event.~%" );
    $sym15$DEREGISTER_HANDLER_FOR_INFERENCE_EVENT = makeSymbol( "DEREGISTER-HANDLER-FOR-INFERENCE-EVENT" );
    $kw16$INFERENCE_NEW_ANSWER = makeKeyword( "INFERENCE-NEW-ANSWER" );
    $kw17$INFERENCE_STATUS_CHANGE = makeKeyword( "INFERENCE-STATUS-CHANGE" );
    $kw18$SKSI_QUERY = makeKeyword( "SKSI-QUERY" );
    $str19$Unknown_inference_event_message__ = makeString( "Unknown inference event message ~A." );
    $kw20$IGNORE_ERRORS_TARGET = makeKeyword( "IGNORE-ERRORS-TARGET" );
    $sym21$IGNORE_ERRORS_HANDLER = makeSymbol( "IGNORE-ERRORS-HANDLER", "SUBLISP" );
    $str22$__Inference__A__A_generated_answe = makeString( "~%Inference ~A.~A generated answer ~S" );
    $sym23$PRINT_NEW_INFERENCE_ANSWER_MESSAGE = makeSymbol( "PRINT-NEW-INFERENCE-ANSWER-MESSAGE" );
    $kw24$DEAD = makeKeyword( "DEAD" );
    $kw25$CLASS = makeKeyword( "CLASS" );
    $kw26$PROBLEM_ID = makeKeyword( "PROBLEM-ID" );
    $kw27$TACTIC_ID = makeKeyword( "TACTIC-ID" );
    $kw28$STATUS = makeKeyword( "STATUS" );
    $kw29$START_TIME = makeKeyword( "START-TIME" );
    $kw30$END_TIME = makeKeyword( "END-TIME" );
    $str31$__Inference__A__A_generated_SKSI_ = makeString( "~%Inference ~A.~A generated SKSI QUERY message ~S" );
    $sym32$PRINT_SKSI_QUERY_MESSAGE = makeSymbol( "PRINT-SKSI-QUERY-MESSAGE" );
    $kw33$DEREGISTERED = makeKeyword( "DEREGISTERED" );
  }
}
/*
 *
 * Total time: 169 ms
 *
 */