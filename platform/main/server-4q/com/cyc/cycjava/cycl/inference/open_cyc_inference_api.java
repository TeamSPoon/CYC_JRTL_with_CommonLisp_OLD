package com.cyc.cycjava.cycl.inference;

import com.cyc.cycjava.cycl.constant_handles;
import com.cyc.cycjava.cycl.access_macros;
import com.cyc.cycjava.cycl.utilities_macros;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Locks;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.StreamsLow;
import com.cyc.cycjava.cycl.numeric_date_utilities;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.cycjava.cycl.pph_utilities;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types;
import com.cyc.cycjava.cycl.cycl_grammar;
import com.cyc.cycjava.cycl.narts_high;
import com.cyc.cycjava.cycl.parameter_specification_utilities;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import com.cyc.cycjava.cycl.inference.harness.hl_prototypes;
import com.cyc.cycjava.cycl.kb_mapping_utilities;
import com.cyc.cycjava.cycl.nart_handles;
import com.cyc.cycjava.cycl.isa;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads;
import com.cyc.cycjava.cycl.format_nil;
import com.cyc.cycjava.cycl.memoization_state;
import com.cyc.cycjava.cycl.pph_macros;
import com.cyc.cycjava.cycl.subl_macro_promotions;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.cycjava.cycl.inference.harness.inference_kernel;
import com.cyc.cycjava.cycl.mt_relevance_macros;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.cycjava.cycl.bindings;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow;
import com.cyc.cycjava.cycl.task_processor;
import com.cyc.cycjava.cycl.inference.harness.inference_datastructures_enumerated_types;
import com.cyc.cycjava.cycl.inference.harness.inference_strategist;
import com.cyc.cycjava.cycl.cycl_utilities;
import com.cyc.cycjava.cycl.list_utilities;
import com.cyc.cycjava.cycl.el_utilities;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.cycjava.cycl.hlmt_czer;
import com.cyc.cycjava.cycl.inference.harness.inference_datastructures_inference;
import com.cyc.cycjava.cycl.process_utilities;
import com.cyc.cycjava.cycl.inference.harness.inference_datastructures_problem_store;
import com.cyc.cycjava.cycl.dictionary_utilities;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.cycjava.cycl.pph_vars;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLFloat;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class open_cyc_inference_api
    extends
      SubLTranslatedFile
{
  public static final SubLFile me;
  public static final String myName = "com.cyc.cycjava.cycl.inference.open_cyc_inference_api";
  public static final String myFingerPrint = "8d6ac2e42be978087cf0c106d5444430392dcf2e66314bb8e8bca05c44b50c0d";
  @SubLTranslatedFile.SubL(source = "cycl/inference/open-cyc-inference-api.lisp", position = 1814L)
  private static SubLSymbol $use_api_task_processor_incremental_resultsP$;
  @SubLTranslatedFile.SubL(source = "cycl/inference/open-cyc-inference-api.lisp", position = 2025L)
  private static SubLSymbol $open_cyc_minimum_time_before_sending_new_answers$;
  @SubLTranslatedFile.SubL(source = "cycl/inference/open-cyc-inference-api.lisp", position = 2225L)
  public static SubLSymbol $default_open_cyc_nl_generation_properties$;
  @SubLTranslatedFile.SubL(source = "cycl/inference/open-cyc-inference-api.lisp", position = 2926L)
  private static SubLSymbol $inference_to_ipc_queue_map$;
  @SubLTranslatedFile.SubL(source = "cycl/inference/open-cyc-inference-api.lisp", position = 3008L)
  private static SubLSymbol $opencyc_inference_output$;
  @SubLTranslatedFile.SubL(source = "cycl/inference/open-cyc-inference-api.lisp", position = 3074L)
  private static SubLSymbol $synch_format_lock$;
  @SubLTranslatedFile.SubL(source = "cycl/inference/open-cyc-inference-api.lisp", position = 3688L)
  private static SubLSymbol $client_to_problem_stores_map$;
  private static final SubLSymbol $kw0$NL_PREDS;
  private static final SubLSymbol $kw1$DEFAULT;
  private static final SubLSymbol $kw2$FORCE;
  private static final SubLSymbol $kw3$NONE;
  private static final SubLSymbol $kw4$LANGUAGE_MT;
  private static final SubLSymbol $kw5$DOMAIN_MT;
  private static final SubLList $list6;
  private static final SubLSymbol $sym7$_INFERENCE_TO_IPC_QUEUE_MAP_;
  private static final SubLSymbol $sym8$_OPENCYC_INFERENCE_OUTPUT_;
  private static final SubLSymbol $sym9$_SYNCH_FORMAT_LOCK_;
  private static final SubLString $str10$_synch_format_lock_;
  private static final SubLList $list11;
  private static final SubLSymbol $sym12$WITH_LOCK_HELD;
  private static final SubLList $list13;
  private static final SubLSymbol $sym14$FORMAT;
  private static final SubLList $list15;
  private static final SubLSymbol $kw16$CYC_PPH;
  private static final SubLSymbol $sym17$WITH_PPH_MEMOIZATION;
  private static final SubLSymbol $sym18$PROGN;
  private static final SubLSymbol $sym19$_CLIENT_TO_PROBLEM_STORES_MAP_;
  private static final SubLSymbol $kw20$NEW_ANSWER;
  private static final SubLSymbol $kw21$SUSPENDED;
  private static final SubLSymbol $kw22$STATUS_CHANGE;
  private static final SubLSymbol $kw23$DEAD;
  private static final SubLSymbol $sym24$OPEN_CYC_HANDLE_NEW_INFERENCE_EVENT;
  private static final SubLSymbol $sym25$EL_FORMULA_P;
  private static final SubLSymbol $sym26$POSSIBLY_MT_P;
  private static final SubLSymbol $sym27$QUERY_PROPERTIES_P;
  private static final SubLSymbol $sym28$OPEN_CYC_START_CONTINUABLE_QUERY;
  private static final SubLList $list29;
  private static final SubLString $str30$Starts_a_continuable_inference_as;
  private static final SubLList $list31;
  private static final SubLSymbol $kw32$EVENTS;
  private static final SubLList $list33;
  private static final SubLSymbol $kw34$CONDITIONAL_SENTENCE_;
  private static final SubLString $str35$Inference_Communication_Queue;
  private static final SubLSymbol $kw36$INFERENCE_START;
  private static final SubLString $str37$Problem_store_ID___A___Inference_;
  private static final SubLSymbol $sym38$STRINGP;
  private static final SubLSymbol $sym39$OPEN_CYC_RELEASE_INFERENCE_RESOURCES_FOR_CLIENT;
  private static final SubLList $list40;
  private static final SubLString $str41$Releases_all_inference_resources_;
  private static final SubLList $list42;
  private static final SubLSymbol $sym43$OPEN_CYC_GET_BINDING_FOR_VARIABLE;
  private static final SubLSymbol $sym44$OPEN_CYC_GET_ANSWER_BINDINGS;
  private static final SubLSymbol $sym45$INTEGERP;
  private static final SubLSymbol $sym46$GENERATE_PHRASE_FOR_JAVA_PROPERTY_LIST_P;
  private static final SubLSymbol $sym47$OPEN_CYC_CONTINUE_QUERY;
  private static final SubLList $list48;
  private static final SubLString $str49$Continues_an_existing_continuable;
  private static final SubLList $list50;
  private static final SubLString $str51$Inference__A_is_already_running__;
  private static final SubLString $str52$Cannot_ask_query__Invalid_inferen;
  private static final SubLObject $const53$CycAPIMt;
  private static final SubLList $list54;
  private static final SubLSymbol $sym55$GET_INFERENCE_PARAMETER_INFORMATION;
  private static final SubLString $str56$Returns_a_property_list_of_infere;
  private static final SubLList $list57;
  private static final SubLSymbol $sym58$CATCH_ERROR_MESSAGE_HANDLER;
  private static final SubLString $str59$Query_thread_;
  private static final SubLSymbol $sym60$CONTINUE_INFERENCE;
  private static final SubLSymbol $kw61$NEW;
  private static final SubLSymbol $kw62$IGNORE_ERRORS_TARGET;
  private static final SubLSymbol $sym63$IGNORE_ERRORS_HANDLER;
  private static final SubLList $list64;
  private static final SubLSymbol $kw65$VALUE;
  private static final SubLSymbol $kw66$SHORT_DESC;
  private static final SubLSymbol $kw67$LONG_DESC;
  private static final SubLObject $const68$BooleanInferenceParameter;
  private static final SubLObject $const69$IntegerInferenceParameter;
  private static final SubLSymbol $kw70$MIN_VALUE;
  private static final SubLSymbol $kw71$MAX_VALUE;
  private static final SubLObject $const72$RealNumberInferenceParameter;
  private static final SubLObject $const73$EnumerationInferenceParameter;
  private static final SubLSymbol $kw74$POTENTIAL_VALUES;
  private static final SubLObject $const75$InferenceParameter;
  private static final SubLObject $const76$quotedIsa;
  private static final SubLObject $const77$InferenceSupportedTerm;
  private static final SubLSymbol $kw78$FALSE;
  private static final SubLSymbol $kw79$BASIC_;
  private static final SubLObject $const80$AdvancedInferenceParameter;
  private static final SubLObject $const81$subLIdentifier;
  private static final SubLSymbol $kw82$TRUE;
  private static final SubLObject $const83$SubLQuoteFn;
  private static final SubLObject $const84$CycInferenceEngine;
  private static final SubLObject $const85$NonNegativeInteger;
  private static final SubLObject $const86$IntegerFromToFn;
  private static final SubLSymbol $kw87$INTEGER_PLUS_INFINITY;
  private static final SubLObject $const88$Real0_1;
  private static final SubLFloat $float89$0_0;
  private static final SubLFloat $float90$1_0;
  private static final SubLSymbol $kw91$NAME;
  private static final SubLSymbol $kw92$QUERY_STATIC_;
  private static final SubLSymbol $kw93$DEFAULT_VALUE;
  private static final SubLSymbol $kw94$NO_VALUE_SPECIFIED;
  private static final SubLSymbol $kw95$ALTERNATE_VALUE;

  @SubLTranslatedFile.SubL(source = "cycl/inference/open-cyc-inference-api.lisp", position = 2434L)
  public static SubLObject initialize_open_cyc_inference_api_vars()
  {
    return initialize_default_open_cyc_nl_generation_properties();
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/open-cyc-inference-api.lisp", position = 2560L)
  public static SubLObject initialize_default_open_cyc_nl_generation_properties()
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    $default_open_cyc_nl_generation_properties$.setDynamicValue( ConsesLow.listS( $kw0$NL_PREDS, new SubLObject[] { $kw1$DEFAULT, $kw2$FORCE, $kw3$NONE, $kw4$LANGUAGE_MT, pph_vars.$pph_language_mt$.getDynamicValue(
        thread ), $kw5$DOMAIN_MT, pph_vars.$pph_domain_mt$.getDynamicValue( thread ), $list6
    } ), thread );
    return $default_open_cyc_nl_generation_properties$.getDynamicValue( thread );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/open-cyc-inference-api.lisp", position = 3150L)
  public static SubLObject synch_format(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    SubLObject format_control = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list11 );
    format_control = current.first();
    final SubLObject format_arguments;
    current = ( format_arguments = current.rest() );
    return ConsesLow.listS( $sym12$WITH_LOCK_HELD, $list13, ConsesLow.listS( $sym14$FORMAT, $sym8$_OPENCYC_INFERENCE_OUTPUT_, format_control, ConsesLow.append( format_arguments, NIL ) ), $list15 );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/open-cyc-inference-api.lisp", position = 3396L)
  public static SubLObject with_opencyc_inference_pph_memoization(final SubLObject macroform, final SubLObject environment)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject datum = macroform.rest();
    final SubLObject body;
    final SubLObject current = body = datum;
    if( NIL != Sequences.find( $kw16$CYC_PPH, reader.$features$.getDynamicValue( thread ), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED ) )
    {
      return reader.bq_cons( $sym17$WITH_PPH_MEMOIZATION, ConsesLow.append( body, NIL ) );
    }
    return reader.bq_cons( $sym18$PROGN, ConsesLow.append( body, NIL ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/open-cyc-inference-api.lisp", position = 3779L)
  public static SubLObject get_problem_store_ids_for_client(final SubLObject client)
  {
    return dictionary_utilities.synchronized_dictionary_lookup( $client_to_problem_stores_map$.getGlobalValue(), client, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/open-cyc-inference-api.lisp", position = 3920L)
  public static SubLObject register_problem_store_id_for_client(final SubLObject client, final SubLObject problem_store_id)
  {
    return dictionary_utilities.synchronized_dictionary_push( $client_to_problem_stores_map$.getGlobalValue(), client, problem_store_id );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/open-cyc-inference-api.lisp", position = 4097L)
  public static SubLObject deregister_problem_store_id_for_client(final SubLObject client, final SubLObject problem_store_id)
  {
    return dictionary_utilities.synchronized_dictionary_delete_from_value( $client_to_problem_stores_map$.getGlobalValue(), client, problem_store_id, UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/open-cyc-inference-api.lisp", position = 4291L)
  public static SubLObject deregister_all_problem_store_ids_for_client(final SubLObject client)
  {
    return dictionary_utilities.synchronized_dictionary_remove( $client_to_problem_stores_map$.getGlobalValue(), client );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/open-cyc-inference-api.lisp", position = 4443L)
  public static SubLObject open_cyc_handle_new_inference_event(final SubLObject problem_store_id, final SubLObject inference_id, final SubLObject datum)
  {
    final SubLObject inference = inference_datastructures_problem_store.find_inference_by_ids( problem_store_id, inference_id );
    final SubLObject ipc_queue = dictionary_utilities.synchronized_dictionary_lookup( $inference_to_ipc_queue_map$.getGlobalValue(), inference, NIL );
    if( datum.isInteger() )
    {
      process_utilities.ipc_enqueue( $kw20$NEW_ANSWER, ipc_queue, UNPROVIDED );
    }
    else if( datum == $kw21$SUSPENDED )
    {
      process_utilities.ipc_enqueue( ConsesLow.list( $kw22$STATUS_CHANGE, datum, inference_suspend_reason( inference ) ), ipc_queue, UNPROVIDED );
    }
    else
    {
      process_utilities.ipc_enqueue( ConsesLow.list( $kw22$STATUS_CHANGE, datum, NIL ), ipc_queue, UNPROVIDED );
      if( datum == $kw23$DEAD )
      {
        dictionary_utilities.synchronized_dictionary_remove( $inference_to_ipc_queue_map$.getGlobalValue(), inference );
        inference_event_filters.deregister_handler_for_inference_event( problem_store_id, inference_id, $sym24$OPEN_CYC_HANDLE_NEW_INFERENCE_EVENT );
        open_cyc_release_inference_resources( problem_store_id, inference_id );
      }
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/open-cyc-inference-api.lisp", position = 5638L)
  public static SubLObject inference_suspend_reason(final SubLObject inference)
  {
    return ( NIL != inference_datastructures_inference.suspended_inference_p( inference ) ) ? inference_datastructures_inference.inference_suspend_status( inference ) : NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/open-cyc-inference-api.lisp", position = 5782L)
  public static SubLObject open_cyc_start_continuable_query(final SubLObject sentence, final SubLObject mt, SubLObject v_properties, SubLObject nl_generation_properties, SubLObject inference_answer_process_function,
      SubLObject incremental_resultsP, SubLObject optimize_query_sentence_variablesP)
  {
    if( v_properties == UNPROVIDED )
    {
      v_properties = NIL;
    }
    if( nl_generation_properties == UNPROVIDED )
    {
      nl_generation_properties = $default_open_cyc_nl_generation_properties$.getDynamicValue();
    }
    if( inference_answer_process_function == UNPROVIDED )
    {
      inference_answer_process_function = NIL;
    }
    if( incremental_resultsP == UNPROVIDED )
    {
      incremental_resultsP = $use_api_task_processor_incremental_resultsP$.getDynamicValue();
    }
    if( optimize_query_sentence_variablesP == UNPROVIDED )
    {
      optimize_query_sentence_variablesP = T;
    }
    enforceType( sentence, $sym25$EL_FORMULA_P );
    enforceType( mt, $sym26$POSSIBLY_MT_P );
    enforceType( v_properties, $sym27$QUERY_PROPERTIES_P );
    return open_cyc_start_continuable_query_internal( sentence, mt, v_properties, nl_generation_properties, inference_answer_process_function, incremental_resultsP, optimize_query_sentence_variablesP );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/open-cyc-inference-api.lisp", position = 7971L)
  public static SubLObject open_cyc_start_continuable_query_internal(final SubLObject sentence, SubLObject mt, SubLObject v_properties, final SubLObject nl_generation_properties,
      final SubLObject inference_answer_process_function, final SubLObject incremental_resultsP, final SubLObject optimize_query_sentence_variablesP)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    mt = hlmt_czer.coerce_to_hlmt( mt );
    v_properties = conses_high.putf( v_properties, $kw32$EVENTS, $list33 );
    final SubLObject optimized_sentence = ( NIL != optimize_query_sentence_variablesP ) ? el_utilities.optimize_el_formula_variable_names( sentence, UNPROVIDED, UNPROVIDED, UNPROVIDED ) : sentence;
    final SubLObject conditionalP = ( NIL != list_utilities.plist_has_keyP( v_properties, $kw34$CONDITIONAL_SENTENCE_ ) ) ? list_utilities.plist_lookup( v_properties, $kw34$CONDITIONAL_SENTENCE_, UNPROVIDED )
        : inference_strategist.inference_conditional_sentence_p( cycl_utilities.hl_to_el( optimized_sentence ) );
    final SubLObject static_properties = list_utilities.nmerge_plist( inference_datastructures_enumerated_types.extract_query_static_or_meta_properties( v_properties ), ConsesLow.list( $kw34$CONDITIONAL_SENTENCE_,
        conditionalP ) );
    final SubLObject ipc_queue = process_utilities.new_ipc_queue( $str35$Inference_Communication_Queue );
    thread.resetMultipleValues();
    final SubLObject inference = open_cyc_initialize_inference( optimized_sentence, mt, static_properties );
    final SubLObject problem_store_id = thread.secondMultipleValue();
    final SubLObject inference_id = thread.thirdMultipleValue();
    thread.resetMultipleValues();
    dictionary_utilities.synchronized_dictionary_enter( $inference_to_ipc_queue_map$.getGlobalValue(), inference, ipc_queue );
    inference_event_filters.register_handler_for_all_inference_events( inference, $sym24$OPEN_CYC_HANDLE_NEW_INFERENCE_EVENT );
    if( NIL != incremental_resultsP )
    {
      task_processor.post_task_info_processor_partial_results( ConsesLow.list( $kw36$INFERENCE_START, problem_store_id, inference_id ) );
    }
    else
    {
      PrintLow.format( T, $str37$Problem_store_ID___A___Inference_, problem_store_id, inference_id );
    }
    return open_cyc_continue_query_guts( problem_store_id, inference_id, v_properties, nl_generation_properties, inference_answer_process_function, incremental_resultsP );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/open-cyc-inference-api.lisp", position = 9715L)
  public static SubLObject open_cyc_release_inference_resources_for_client(SubLObject client)
  {
    if( client == UNPROVIDED )
    {
      client = task_processor.get_current_task_processor_client();
    }
    enforceType( client, $sym38$STRINGP );
    SubLObject cdolist_list_var;
    final SubLObject problem_store_ids = cdolist_list_var = get_problem_store_ids_for_client( client );
    SubLObject problem_store_id = NIL;
    problem_store_id = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      inference_datastructures_problem_store.destroy_problem_store( inference_datastructures_problem_store.find_problem_store_by_id( problem_store_id ) );
      cdolist_list_var = cdolist_list_var.rest();
      problem_store_id = cdolist_list_var.first();
    }
    deregister_all_problem_store_ids_for_client( client );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/open-cyc-inference-api.lisp", position = 10263L)
  public static SubLObject open_cyc_get_binding_for_variable(final SubLObject variable, final SubLObject inference_answer_signature)
  {
    final SubLObject inference_answer = inference_datastructures_inference.find_inference_answer_from_signature( inference_answer_signature );
    final SubLObject v_bindings = ( NIL != inference_answer ) ? inference_datastructures_inference.inference_answer_bindings( inference_answer ) : NIL;
    return bindings.variable_lookup( variable, v_bindings );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/open-cyc-inference-api.lisp", position = 10664L)
  public static SubLObject open_cyc_get_answer_bindings(final SubLObject inference_answer_signature)
  {
    final SubLObject inference_answer = inference_datastructures_inference.find_inference_answer_from_signature( inference_answer_signature );
    return ( NIL != inference_answer ) ? inference_datastructures_inference.inference_answer_bindings( inference_answer ) : NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/open-cyc-inference-api.lisp", position = 11014L)
  public static SubLObject open_cyc_continue_query(final SubLObject problem_store_id, final SubLObject inference_id, final SubLObject v_properties, SubLObject nl_generation_properties,
      SubLObject inference_answer_process_function, SubLObject incremental_resultsP)
  {
    if( nl_generation_properties == UNPROVIDED )
    {
      nl_generation_properties = $default_open_cyc_nl_generation_properties$.getDynamicValue();
    }
    if( inference_answer_process_function == UNPROVIDED )
    {
      inference_answer_process_function = NIL;
    }
    if( incremental_resultsP == UNPROVIDED )
    {
      incremental_resultsP = $use_api_task_processor_incremental_resultsP$.getDynamicValue();
    }
    enforceType( problem_store_id, $sym45$INTEGERP );
    enforceType( inference_id, $sym45$INTEGERP );
    enforceType( v_properties, $sym27$QUERY_PROPERTIES_P );
    enforceType( nl_generation_properties, $sym46$GENERATE_PHRASE_FOR_JAVA_PROPERTY_LIST_P );
    return open_cyc_continue_query_guts( problem_store_id, inference_id, v_properties, nl_generation_properties, inference_answer_process_function, incremental_resultsP );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/open-cyc-inference-api.lisp", position = 12932L)
  public static SubLObject open_cyc_continue_query_guts(final SubLObject problem_store_id, final SubLObject inference_id, SubLObject v_properties, final SubLObject nl_generation_properties,
      final SubLObject inference_answer_process_function, final SubLObject incremental_resultsP)
  {
    v_properties = conses_high.putf( v_properties, $kw32$EVENTS, $list33 );
    final SubLObject inference = inference_datastructures_problem_store.find_inference_by_ids( problem_store_id, inference_id );
    if( NIL != inference_datastructures_inference.running_inference_p( inference ) )
    {
      Errors.error( $str51$Inference__A_is_already_running__, inference );
    }
    else
    {
      if( NIL != inference_datastructures_inference.continuable_inference_p( inference ) )
      {
        return open_cyc_continue_query_internal( inference, v_properties, nl_generation_properties, inference_answer_process_function, incremental_resultsP );
      }
      Errors.error( $str52$Cannot_ask_query__Invalid_inferen, inference_datastructures_inference.inference_status( inference ) );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/open-cyc-inference-api.lisp", position = 13666L)
  public static SubLObject get_inference_parameter_information()
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject result = NIL;
    final SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate( $const53$CycAPIMt );
    final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding( thread );
    final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding( thread );
    final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding( thread );
    try
    {
      mt_relevance_macros.$mt$.bind( mt_relevance_macros.update_inference_mt_relevance_mt( mt_var ), thread );
      mt_relevance_macros.$relevant_mt_function$.bind( mt_relevance_macros.update_inference_mt_relevance_function( mt_var ), thread );
      mt_relevance_macros.$relevant_mts$.bind( mt_relevance_macros.update_inference_mt_relevance_mt_list( mt_var ), thread );
      final SubLObject boolean_inference_parameters = get_boolean_inference_parameter_information();
      final SubLObject integer_inference_parameters = get_integer_inference_parameter_information();
      final SubLObject real_number_inference_parameters = get_real_number_inference_parameter_information();
      final SubLObject enumeration_inference_parameters = get_enumeration_inference_parameter_information();
      final SubLObject other_inference_parameters = get_other_inference_parameter_information();
      result = list_utilities.make_plist( $list54, ConsesLow.list( boolean_inference_parameters, integer_inference_parameters, real_number_inference_parameters, enumeration_inference_parameters,
          other_inference_parameters ) );
    }
    finally
    {
      mt_relevance_macros.$relevant_mts$.rebind( _prev_bind_3, thread );
      mt_relevance_macros.$relevant_mt_function$.rebind( _prev_bind_2, thread );
      mt_relevance_macros.$mt$.rebind( _prev_bind_0, thread );
    }
    return result;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/open-cyc-inference-api.lisp", position = 15253L)
  public static SubLObject open_cyc_initialize_inference(final SubLObject sentence, final SubLObject mt, final SubLObject static_properties)
  {
    final SubLObject inference = inference_kernel.new_continuable_inference( sentence, mt, static_properties );
    final SubLObject problem_store_id = inference_datastructures_problem_store.problem_store_suid( inference_datastructures_inference.inference_problem_store( inference ) );
    final SubLObject inference_id = inference_datastructures_inference.inference_suid( inference );
    final SubLObject client = task_processor.get_current_task_processor_client();
    if( NIL != client )
    {
      register_problem_store_id_for_client( client, problem_store_id );
    }
    return Values.values( inference, problem_store_id, inference_id );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/open-cyc-inference-api.lisp", position = 15947L)
  public static SubLObject open_cyc_release_inference_resources(final SubLObject problem_store_id, final SubLObject inference_id)
  {
    final SubLObject problem_store = inference_datastructures_problem_store.find_problem_store_by_id( problem_store_id );
    final SubLObject client = task_processor.get_current_task_processor_client();
    if( NIL != client )
    {
      deregister_problem_store_id_for_client( client, problem_store_id );
    }
    inference_datastructures_problem_store.destroy_problem_store( problem_store );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/open-cyc-inference-api.lisp", position = 16826L)
  public static SubLObject open_cyc_continue_query_internal(final SubLObject inference, final SubLObject v_properties, final SubLObject nl_generation_properties, final SubLObject inference_answer_process_function,
      final SubLObject incremental_resultsP)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject final_result = NIL;
    SubLObject error_message = NIL;
    try
    {
      try
      {
        thread.throwStack.push( subl_macro_promotions.$catch_error_message_target$.getGlobalValue() );
        final SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding( thread );
        try
        {
          Errors.$error_handler$.bind( $sym58$CATCH_ERROR_MESSAGE_HANDLER, thread );
          try
          {
            final SubLObject _prev_bind_0_$1 = pph_macros.$free_pph_problem_store_pointers$.currentBinding( thread );
            try
            {
              pph_macros.$free_pph_problem_store_pointers$.bind( NIL, thread );
              thread.resetMultipleValues();
              final SubLObject _prev_bind_0_$2 = pph_macros.$pph_problem_store_pointer$.currentBinding( thread );
              try
              {
                pph_macros.$pph_problem_store_pointer$.bind( pph_macros.find_or_create_pph_problem_store_pointer(), thread );
                final SubLObject reuseP = thread.secondMultipleValue();
                thread.resetMultipleValues();
                try
                {
                  thread.resetMultipleValues();
                  final SubLObject _prev_bind_0_$3 = pph_macros.$pph_memoization_state$.currentBinding( thread );
                  try
                  {
                    pph_macros.$pph_memoization_state$.bind( pph_macros.find_or_create_pph_memoization_state(), thread );
                    final SubLObject new_or_reused = thread.secondMultipleValue();
                    thread.resetMultipleValues();
                    final SubLObject _prev_bind_0_$4 = pph_macros.$pph_external_memoization_state$.currentBinding( thread );
                    try
                    {
                      pph_macros.$pph_external_memoization_state$.bind( pph_macros.find_or_create_pph_external_memoization_state(), thread );
                      final SubLObject local_state = pph_macros.$pph_memoization_state$.getDynamicValue( thread );
                      final SubLObject _prev_bind_0_$5 = memoization_state.$memoization_state$.currentBinding( thread );
                      try
                      {
                        memoization_state.$memoization_state$.bind( local_state, thread );
                        final SubLObject original_memoization_process = memoization_state.memoization_state_original_process( local_state );
                        try
                        {
                          final SubLObject dynamic_properties = inference_datastructures_enumerated_types.extract_query_dynamic_properties( v_properties );
                          SubLObject inference_process = NIL;
                          final SubLObject start_index = inference_datastructures_inference.inference_next_new_answer_id( inference );
                          inference_process = process_utilities.make_cyc_server_process_with_args( Sequences.cconcatenate( $str59$Query_thread_, format_nil.format_nil_a_no_copy( inference ) ), $sym60$CONTINUE_INFERENCE,
                              ConsesLow.list( inference, dynamic_properties ) );
                          final SubLObject ipc_queue = dictionary_utilities.synchronized_dictionary_lookup( $inference_to_ipc_queue_map$.getGlobalValue(), inference, UNPROVIDED );
                          final SubLObject ipcq_processor = inference_ipc_queue_processor.new_inference_ipc_queue_processor( inference, ipc_queue, inference_answer_process_function, nl_generation_properties,
                              $open_cyc_minimum_time_before_sending_new_answers$.getDynamicValue( thread ), incremental_resultsP, start_index, inference_process );
                          while ( NIL == inference_ipc_queue_processor.inference_ipc_queue_processor_doneP( ipcq_processor ))
                          {
                            inference_ipc_queue_processor.inference_ipc_queue_processor_do_one_iteration( ipcq_processor );
                          }
                          final_result = inference_ipc_queue_processor.get_inference_ipc_queue_processor_results( ipcq_processor );
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
                        memoization_state.$memoization_state$.rebind( _prev_bind_0_$5, thread );
                      }
                    }
                    finally
                    {
                      pph_macros.$pph_external_memoization_state$.rebind( _prev_bind_0_$4, thread );
                    }
                    if( new_or_reused == $kw61$NEW && NIL != memoization_state.memoization_state_p( pph_macros.$pph_memoization_state$.getDynamicValue( thread ) ) )
                    {
                      memoization_state.clear_all_memoization( pph_macros.$pph_memoization_state$.getDynamicValue( thread ) );
                    }
                  }
                  finally
                  {
                    pph_macros.$pph_memoization_state$.rebind( _prev_bind_0_$3, thread );
                  }
                }
                finally
                {
                  final SubLObject _prev_bind_0_$7 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
                  try
                  {
                    Threads.$is_thread_performing_cleanupP$.bind( T, thread );
                    final SubLObject _values2 = Values.getValuesAsVector();
                    if( NIL == reuseP )
                    {
                      pph_macros.free_pph_problem_store_pointer( pph_macros.$pph_problem_store_pointer$.getDynamicValue( thread ) );
                    }
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
                pph_macros.$pph_problem_store_pointer$.rebind( _prev_bind_0_$2, thread );
              }
            }
            finally
            {
              pph_macros.$free_pph_problem_store_pointers$.rebind( _prev_bind_0_$1, thread );
            }
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
        error_message = Errors.handleThrowable( ccatch_env_var, subl_macro_promotions.$catch_error_message_target$.getGlobalValue() );
      }
      finally
      {
        thread.throwStack.pop();
      }
    }
    finally
    {
      final SubLObject _prev_bind_2 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
      try
      {
        Threads.$is_thread_performing_cleanupP$.bind( T, thread );
        final SubLObject _values3 = Values.getValuesAsVector();
        SubLObject ignore_errors_tag = NIL;
        try
        {
          thread.throwStack.push( $kw62$IGNORE_ERRORS_TARGET );
          final SubLObject _prev_bind_0_$8 = Errors.$error_handler$.currentBinding( thread );
          try
          {
            Errors.$error_handler$.bind( Symbols.symbol_function( $sym63$IGNORE_ERRORS_HANDLER ), thread );
            try
            {
              inference_strategist.inference_interrupt( inference, FIVE_INTEGER );
            }
            catch( final Throwable catch_var2 )
            {
              Errors.handleThrowable( catch_var2, NIL );
            }
          }
          finally
          {
            Errors.$error_handler$.rebind( _prev_bind_0_$8, thread );
          }
        }
        catch( final Throwable ccatch_env_var2 )
        {
          ignore_errors_tag = Errors.handleThrowable( ccatch_env_var2, $kw62$IGNORE_ERRORS_TARGET );
          thread.throwStack.pop();
        }
        finally
        {
          thread.throwStack.pop();
        }
        if( NIL != error_message )
        {
          Errors.error( error_message );
        }
        Values.restoreValuesFromVector( _values3 );
      }
      finally
      {
        Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_2, thread );
      }
    }
    return final_result;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/open-cyc-inference-api.lisp", position = 19986L)
  public static SubLObject get_information_for_inference_parameter(final SubLObject param)
  {
    final SubLObject name = inference_parameter_name( param );
    final SubLObject basic_propP = basic_inference_parameter_p( param );
    final SubLObject query_staticP = inference_datastructures_enumerated_types.query_static_property_p( name );
    final SubLObject short_desc = inference_parameter_short_description( param );
    final SubLObject long_desc = inference_parameter_long_description( param );
    final SubLObject default_value = inference_parameter_default_value( param );
    final SubLObject alternate_value = inference_parameter_alternate_value( param );
    final SubLObject alternate_value_property_list = ( NIL != alternate_value ) ? get_inference_parameter_value_info( alternate_value ) : NIL;
    final SubLObject param_result = list_utilities.make_plist( $list64, ConsesLow.list( name, basic_propP, query_staticP, short_desc, long_desc, default_value, alternate_value_property_list ) );
    return param_result;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/open-cyc-inference-api.lisp", position = 20952L)
  public static SubLObject get_inference_parameter_value_info(final SubLObject param_value)
  {
    final SubLObject subl_value = inference_parameter_value_subl_identifier( param_value );
    final SubLObject short_desc = inference_parameter_value_short_description( param_value );
    final SubLObject long_desc = inference_parameter_value_long_description( param_value );
    return ConsesLow.list( $kw65$VALUE, subl_value, $kw66$SHORT_DESC, short_desc, $kw67$LONG_DESC, long_desc );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/open-cyc-inference-api.lisp", position = 21340L)
  public static SubLObject get_boolean_inference_parameter_information()
  {
    final SubLObject parameters = isa.all_fort_instances( $const68$BooleanInferenceParameter, $const53$CycAPIMt, UNPROVIDED );
    SubLObject result = NIL;
    SubLObject cdolist_list_var = parameters;
    SubLObject param = NIL;
    param = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      final SubLObject param_result = get_information_for_inference_parameter( param );
      result = conses_high.putf( result, param, param_result );
      cdolist_list_var = cdolist_list_var.rest();
      param = cdolist_list_var.first();
    }
    return result;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/open-cyc-inference-api.lisp", position = 21681L)
  public static SubLObject get_integer_inference_parameter_information()
  {
    final SubLObject parameters = isa.all_fort_instances( $const69$IntegerInferenceParameter, $const53$CycAPIMt, UNPROVIDED );
    SubLObject result = NIL;
    SubLObject cdolist_list_var = parameters;
    SubLObject param = NIL;
    param = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      SubLObject param_result = get_information_for_inference_parameter( param );
      final SubLObject min_value = integer_inference_parameter_min_value( param );
      final SubLObject max_value = integer_inference_parameter_max_value( param );
      param_result = conses_high.putf( param_result, $kw70$MIN_VALUE, min_value );
      param_result = conses_high.putf( param_result, $kw71$MAX_VALUE, max_value );
      result = conses_high.putf( result, param, param_result );
      cdolist_list_var = cdolist_list_var.rest();
      param = cdolist_list_var.first();
    }
    return result;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/open-cyc-inference-api.lisp", position = 22278L)
  public static SubLObject get_real_number_inference_parameter_information()
  {
    final SubLObject parameters = isa.all_fort_instances( $const72$RealNumberInferenceParameter, $const53$CycAPIMt, UNPROVIDED );
    SubLObject result = NIL;
    SubLObject cdolist_list_var = parameters;
    SubLObject param = NIL;
    param = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      SubLObject param_result = get_information_for_inference_parameter( param );
      final SubLObject min_value = real_number_inference_parameter_min_value( param );
      final SubLObject max_value = real_number_inference_parameter_max_value( param );
      param_result = conses_high.putf( param_result, $kw70$MIN_VALUE, min_value );
      param_result = conses_high.putf( param_result, $kw71$MAX_VALUE, max_value );
      result = conses_high.putf( result, param, param_result );
      cdolist_list_var = cdolist_list_var.rest();
      param = cdolist_list_var.first();
    }
    return result;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/open-cyc-inference-api.lisp", position = 22892L)
  public static SubLObject get_enumeration_inference_parameter_information()
  {
    final SubLObject parameters = isa.all_fort_instances( $const73$EnumerationInferenceParameter, $const53$CycAPIMt, UNPROVIDED );
    SubLObject result = NIL;
    SubLObject cdolist_list_var = parameters;
    SubLObject param = NIL;
    param = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      SubLObject param_result = get_information_for_inference_parameter( param );
      final SubLObject potential_values = enumeration_inference_parameter_potential_values( param );
      param_result = conses_high.putf( param_result, $kw74$POTENTIAL_VALUES, potential_values );
      result = conses_high.putf( result, param, param_result );
      cdolist_list_var = cdolist_list_var.rest();
      param = cdolist_list_var.first();
    }
    return result;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/open-cyc-inference-api.lisp", position = 23400L)
  public static SubLObject get_other_inference_parameter_information()
  {
    final SubLObject parameters = isa.all_fort_instances( $const75$InferenceParameter, $const53$CycAPIMt, UNPROVIDED );
    SubLObject result = NIL;
    SubLObject cdolist_list_var = parameters;
    SubLObject param = NIL;
    param = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      if( NIL == nart_handles.nart_p( param ) && NIL == kb_mapping_utilities.pred_u_v_holds_in_any_mt( $const76$quotedIsa, param, $const77$InferenceSupportedTerm, ONE_INTEGER, TWO_INTEGER, $kw78$FALSE )
          && NIL == hl_prototypes.hl_prototypical_instanceP( param ) )
      {
        final SubLObject min_isa = isa.min_isa( param, UNPROVIDED, UNPROVIDED );
        if( NIL != list_utilities.singletonP( min_isa ) && $const75$InferenceParameter.eql( list_utilities.only_one( min_isa ) ) )
        {
          SubLObject param_result = get_information_for_inference_parameter( param );
          param_result = conses_high.putf( param_result, $kw79$BASIC_, NIL );
          result = conses_high.putf( result, param, param_result );
        }
      }
      cdolist_list_var = cdolist_list_var.rest();
      param = cdolist_list_var.first();
    }
    return result;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/open-cyc-inference-api.lisp", position = 24194L)
  public static SubLObject advanced_inference_parameter_p(final SubLObject param)
  {
    return isa.isaP( param, $const80$AdvancedInferenceParameter, UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/open-cyc-inference-api.lisp", position = 24671L)
  public static SubLObject basic_inference_parameter_p(final SubLObject param)
  {
    return makeBoolean( NIL == advanced_inference_parameter_p( param ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/open-cyc-inference-api.lisp", position = 24779L)
  public static SubLObject inference_parameter_name(final SubLObject parameter)
  {
    final SubLObject v_subl_identifier = kb_mapping_utilities.fpred_value_in_mt( parameter, $const81$subLIdentifier, $const53$CycAPIMt, ONE_INTEGER, TWO_INTEGER, $kw82$TRUE );
    if( NIL != el_utilities.el_formula_with_operator_p( v_subl_identifier, $const83$SubLQuoteFn ) )
    {
      return cycl_utilities.nat_arg1( v_subl_identifier, UNPROVIDED );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/open-cyc-inference-api.lisp", position = 25042L)
  public static SubLObject inference_parameter_short_description(final SubLObject parameter)
  {
    return parameter_specification_utilities.software_parameter_short_description( parameter, $const53$CycAPIMt );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/open-cyc-inference-api.lisp", position = 25179L)
  public static SubLObject inference_parameter_long_description(final SubLObject parameter)
  {
    return parameter_specification_utilities.software_parameter_long_description( parameter, $const53$CycAPIMt );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/open-cyc-inference-api.lisp", position = 25314L)
  public static SubLObject inference_parameter_value_subl_identifier(final SubLObject param_value)
  {
    return parameter_specification_utilities.software_parameter_value_subl_identifier( param_value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/open-cyc-inference-api.lisp", position = 25451L)
  public static SubLObject inference_parameter_default_value(final SubLObject parameter)
  {
    return parameter_specification_utilities.software_parameter_default_value( parameter, $const84$CycInferenceEngine, $const53$CycAPIMt );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/open-cyc-inference-api.lisp", position = 25600L)
  public static SubLObject inference_parameter_alternate_value(final SubLObject parameter)
  {
    return parameter_specification_utilities.software_parameter_alternate_value( parameter, $const84$CycInferenceEngine, $const53$CycAPIMt );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/open-cyc-inference-api.lisp", position = 25754L)
  public static SubLObject enumeration_inference_parameter_potential_values(final SubLObject parameter)
  {
    final SubLObject domain = parameter_specification_utilities.software_parameter_value_domain_in_software_object( parameter, $const84$CycInferenceEngine, $const53$CycAPIMt );
    SubLObject result = NIL;
    if( NIL != el_utilities.el_extensional_set_p( domain ) )
    {
      SubLObject cdolist_list_var = el_utilities.el_extensional_set_elements( domain );
      SubLObject elem = NIL;
      elem = cdolist_list_var.first();
      while ( NIL != cdolist_list_var)
      {
        final SubLObject value_property_list = get_inference_parameter_value_info( elem );
        result = ConsesLow.cons( value_property_list, result );
        cdolist_list_var = cdolist_list_var.rest();
        elem = cdolist_list_var.first();
      }
      return Sequences.nreverse( result );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/open-cyc-inference-api.lisp", position = 26206L)
  public static SubLObject integer_inference_parameter_min_value(final SubLObject parameter)
  {
    final SubLObject domain = parameter_specification_utilities.software_parameter_value_domain_in_software_object( parameter, $const84$CycInferenceEngine, $const53$CycAPIMt );
    if( domain.eql( $const85$NonNegativeInteger ) )
    {
      return ZERO_INTEGER;
    }
    if( NIL != narts_high.nart_with_functor_p( $const86$IntegerFromToFn, domain ) )
    {
      return cycl_utilities.nat_arg1( domain, UNPROVIDED );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/open-cyc-inference-api.lisp", position = 26742L)
  public static SubLObject integer_inference_parameter_max_value(final SubLObject parameter)
  {
    final SubLObject domain = parameter_specification_utilities.software_parameter_value_domain_in_software_object( parameter, $const84$CycInferenceEngine, $const53$CycAPIMt );
    if( domain.eql( $const85$NonNegativeInteger ) )
    {
      return $kw87$INTEGER_PLUS_INFINITY;
    }
    if( NIL != narts_high.nart_with_functor_p( $const86$IntegerFromToFn, domain ) )
    {
      return cycl_utilities.nat_arg2( domain, UNPROVIDED );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/open-cyc-inference-api.lisp", position = 27298L)
  public static SubLObject real_number_inference_parameter_min_value(final SubLObject parameter)
  {
    final SubLObject pcase_var;
    final SubLObject domain = pcase_var = parameter_specification_utilities.software_parameter_value_domain_in_software_object( parameter, $const84$CycInferenceEngine, $const53$CycAPIMt );
    if( pcase_var.eql( $const88$Real0_1 ) )
    {
      return $float89$0_0;
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/open-cyc-inference-api.lisp", position = 27732L)
  public static SubLObject real_number_inference_parameter_max_value(final SubLObject parameter)
  {
    final SubLObject pcase_var;
    final SubLObject domain = pcase_var = parameter_specification_utilities.software_parameter_value_domain_in_software_object( parameter, $const84$CycInferenceEngine, $const53$CycAPIMt );
    if( pcase_var.eql( $const88$Real0_1 ) )
    {
      return $float90$1_0;
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/open-cyc-inference-api.lisp", position = 28165L)
  public static SubLObject inference_parameter_value_short_description(final SubLObject parameter)
  {
    return parameter_specification_utilities.software_parameter_value_short_description( parameter, $const53$CycAPIMt );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/open-cyc-inference-api.lisp", position = 28343L)
  public static SubLObject inference_parameter_value_long_description(final SubLObject parameter)
  {
    return parameter_specification_utilities.software_parameter_value_long_description( parameter, $const53$CycAPIMt );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/open-cyc-inference-api.lisp", position = 28518L)
  public static SubLObject inference_parameter_has_valid_information_p(final SubLObject param_cycl, final SubLObject param_info)
  {
    if( NIL != isa.isaP( param_cycl, $const68$BooleanInferenceParameter, $const53$CycAPIMt, UNPROVIDED ) )
    {
      return boolean_inference_parameter_has_valid_information_p( param_cycl, param_info );
    }
    if( NIL != isa.isaP( param_cycl, $const69$IntegerInferenceParameter, $const53$CycAPIMt, UNPROVIDED ) )
    {
      return integer_inference_parameter_has_valid_information_p( param_cycl, param_info );
    }
    if( NIL != isa.isaP( param_cycl, $const72$RealNumberInferenceParameter, $const53$CycAPIMt, UNPROVIDED ) )
    {
      return real_number_inference_parameter_has_valid_information_p( param_cycl, param_info );
    }
    if( NIL != isa.isaP( param_cycl, $const73$EnumerationInferenceParameter, $const53$CycAPIMt, UNPROVIDED ) )
    {
      return enumeration_inference_parameter_has_valid_information_p( param_cycl, param_info );
    }
    return other_inference_parameter_has_valid_information_p( param_cycl, param_info );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/open-cyc-inference-api.lisp", position = 29354L)
  public static SubLObject inference_parameter_has_valid_basic_information_p(final SubLObject param_cycl, final SubLObject param_info)
  {
    return makeBoolean( NIL != cycl_grammar.cycl_denotational_term_p( param_cycl ) && conses_high.getf( param_info, $kw91$NAME, UNPROVIDED ).isKeyword() && NIL != Types.booleanp( conses_high.getf( param_info,
        $kw79$BASIC_, UNPROVIDED ) ) && NIL != Types.booleanp( conses_high.getf( param_info, $kw92$QUERY_STATIC_, UNPROVIDED ) ) && conses_high.getf( param_info, $kw66$SHORT_DESC, UNPROVIDED ).isString() && conses_high
            .getf( param_info, $kw67$LONG_DESC, UNPROVIDED ).isString() );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/open-cyc-inference-api.lisp", position = 29726L)
  public static SubLObject enumeration_inference_parameter_has_valid_information_p(final SubLObject param_cycl, final SubLObject param_info)
  {
    return makeBoolean( NIL != inference_parameter_has_valid_basic_information_p( param_cycl, param_info ) && NIL != valid_enumeration_inference_parameter_values_p( conses_high.getf( param_info, $kw74$POTENTIAL_VALUES,
        UNPROVIDED ) ) && NIL != pph_utilities.keyword_or_nil_p( conses_high.getf( param_info, $kw93$DEFAULT_VALUE, $kw94$NO_VALUE_SPECIFIED ) ) && NIL != pph_utilities.keyword_or_nil_p( conses_high.getf( param_info,
            $kw95$ALTERNATE_VALUE, $kw94$NO_VALUE_SPECIFIED ) ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/open-cyc-inference-api.lisp", position = 30171L)
  public static SubLObject other_inference_parameter_has_valid_information_p(final SubLObject param_cycl, final SubLObject param_info)
  {
    return inference_parameter_has_valid_basic_information_p( param_cycl, param_info );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/open-cyc-inference-api.lisp", position = 30345L)
  public static SubLObject boolean_inference_parameter_has_valid_information_p(final SubLObject param_cycl, final SubLObject param_info)
  {
    return makeBoolean( NIL != inference_parameter_has_valid_basic_information_p( param_cycl, param_info ) && NIL != Types.booleanp( conses_high.getf( param_info, $kw93$DEFAULT_VALUE, $kw94$NO_VALUE_SPECIFIED ) )
        && NIL != Types.booleanp( conses_high.getf( param_info, $kw95$ALTERNATE_VALUE, $kw94$NO_VALUE_SPECIFIED ) ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/open-cyc-inference-api.lisp", position = 30672L)
  public static SubLObject integer_inference_parameter_has_valid_information_p(final SubLObject param_cycl, final SubLObject param_info)
  {
    return makeBoolean( NIL != inference_parameter_has_valid_basic_information_p( param_cycl, param_info ) && conses_high.getf( param_info, $kw70$MIN_VALUE, $kw94$NO_VALUE_SPECIFIED ).isInteger()
        && ( $kw87$INTEGER_PLUS_INFINITY == conses_high.getf( param_info, $kw71$MAX_VALUE, $kw94$NO_VALUE_SPECIFIED ) || conses_high.getf( param_info, $kw71$MAX_VALUE, $kw94$NO_VALUE_SPECIFIED ).isInteger() ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/open-cyc-inference-api.lisp", position = 31091L)
  public static SubLObject real_number_inference_parameter_has_valid_information_p(final SubLObject param_cycl, final SubLObject param_info)
  {
    return makeBoolean( NIL != inference_parameter_has_valid_basic_information_p( param_cycl, param_info ) && conses_high.getf( param_info, $kw93$DEFAULT_VALUE, $kw94$NO_VALUE_SPECIFIED ).isNumber() && conses_high.getf(
        param_info, $kw70$MIN_VALUE, $kw94$NO_VALUE_SPECIFIED ).isNumber() && conses_high.getf( param_info, $kw71$MAX_VALUE, $kw94$NO_VALUE_SPECIFIED ).isNumber() && ( NIL == conses_high.getf( param_info,
            $kw95$ALTERNATE_VALUE, $kw94$NO_VALUE_SPECIFIED ) || conses_high.getf( param_info, $kw95$ALTERNATE_VALUE, $kw94$NO_VALUE_SPECIFIED ).isNumber() ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/open-cyc-inference-api.lisp", position = 31631L)
  public static SubLObject valid_enumeration_inference_parameter_values_p(final SubLObject potential_values)
  {
    if( NIL == potential_values )
    {
      return NIL;
    }
    SubLObject cdolist_list_var = potential_values;
    SubLObject potential_value = NIL;
    potential_value = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      if( NIL == valid_enumeration_inference_parameter_value_p( potential_value ) )
      {
        return NIL;
      }
      cdolist_list_var = cdolist_list_var.rest();
      potential_value = cdolist_list_var.first();
    }
    return T;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/open-cyc-inference-api.lisp", position = 31914L)
  public static SubLObject valid_enumeration_inference_parameter_value_p(final SubLObject potential_value)
  {
    return makeBoolean( NIL != list_utilities.non_empty_list_p( potential_value ) && conses_high.getf( potential_value, $kw65$VALUE, $kw94$NO_VALUE_SPECIFIED ) != $kw94$NO_VALUE_SPECIFIED && conses_high.getf(
        potential_value, $kw66$SHORT_DESC, UNPROVIDED ).isString() && conses_high.getf( potential_value, $kw67$LONG_DESC, UNPROVIDED ).isString() );
  }

  public static SubLObject declare_open_cyc_inference_api_file()
  {
    SubLFiles.declareFunction( me, "initialize_open_cyc_inference_api_vars", "INITIALIZE-OPEN-CYC-INFERENCE-API-VARS", 0, 0, false );
    SubLFiles.declareFunction( me, "initialize_default_open_cyc_nl_generation_properties", "INITIALIZE-DEFAULT-OPEN-CYC-NL-GENERATION-PROPERTIES", 0, 0, false );
    SubLFiles.declareMacro( me, "synch_format", "SYNCH-FORMAT" );
    SubLFiles.declareMacro( me, "with_opencyc_inference_pph_memoization", "WITH-OPENCYC-INFERENCE-PPH-MEMOIZATION" );
    SubLFiles.declareFunction( me, "get_problem_store_ids_for_client", "GET-PROBLEM-STORE-IDS-FOR-CLIENT", 1, 0, false );
    SubLFiles.declareFunction( me, "register_problem_store_id_for_client", "REGISTER-PROBLEM-STORE-ID-FOR-CLIENT", 2, 0, false );
    SubLFiles.declareFunction( me, "deregister_problem_store_id_for_client", "DEREGISTER-PROBLEM-STORE-ID-FOR-CLIENT", 2, 0, false );
    SubLFiles.declareFunction( me, "deregister_all_problem_store_ids_for_client", "DEREGISTER-ALL-PROBLEM-STORE-IDS-FOR-CLIENT", 1, 0, false );
    SubLFiles.declareFunction( me, "open_cyc_handle_new_inference_event", "OPEN-CYC-HANDLE-NEW-INFERENCE-EVENT", 3, 0, false );
    SubLFiles.declareFunction( me, "inference_suspend_reason", "INFERENCE-SUSPEND-REASON", 1, 0, false );
    SubLFiles.declareFunction( me, "open_cyc_start_continuable_query", "OPEN-CYC-START-CONTINUABLE-QUERY", 2, 5, false );
    SubLFiles.declareFunction( me, "open_cyc_start_continuable_query_internal", "OPEN-CYC-START-CONTINUABLE-QUERY-INTERNAL", 7, 0, false );
    SubLFiles.declareFunction( me, "open_cyc_release_inference_resources_for_client", "OPEN-CYC-RELEASE-INFERENCE-RESOURCES-FOR-CLIENT", 0, 1, false );
    SubLFiles.declareFunction( me, "open_cyc_get_binding_for_variable", "OPEN-CYC-GET-BINDING-FOR-VARIABLE", 2, 0, false );
    SubLFiles.declareFunction( me, "open_cyc_get_answer_bindings", "OPEN-CYC-GET-ANSWER-BINDINGS", 1, 0, false );
    SubLFiles.declareFunction( me, "open_cyc_continue_query", "OPEN-CYC-CONTINUE-QUERY", 3, 3, false );
    SubLFiles.declareFunction( me, "open_cyc_continue_query_guts", "OPEN-CYC-CONTINUE-QUERY-GUTS", 6, 0, false );
    SubLFiles.declareFunction( me, "get_inference_parameter_information", "GET-INFERENCE-PARAMETER-INFORMATION", 0, 0, false );
    SubLFiles.declareFunction( me, "open_cyc_initialize_inference", "OPEN-CYC-INITIALIZE-INFERENCE", 3, 0, false );
    SubLFiles.declareFunction( me, "open_cyc_release_inference_resources", "OPEN-CYC-RELEASE-INFERENCE-RESOURCES", 2, 0, false );
    SubLFiles.declareFunction( me, "open_cyc_continue_query_internal", "OPEN-CYC-CONTINUE-QUERY-INTERNAL", 5, 0, false );
    SubLFiles.declareFunction( me, "get_information_for_inference_parameter", "GET-INFORMATION-FOR-INFERENCE-PARAMETER", 1, 0, false );
    SubLFiles.declareFunction( me, "get_inference_parameter_value_info", "GET-INFERENCE-PARAMETER-VALUE-INFO", 1, 0, false );
    SubLFiles.declareFunction( me, "get_boolean_inference_parameter_information", "GET-BOOLEAN-INFERENCE-PARAMETER-INFORMATION", 0, 0, false );
    SubLFiles.declareFunction( me, "get_integer_inference_parameter_information", "GET-INTEGER-INFERENCE-PARAMETER-INFORMATION", 0, 0, false );
    SubLFiles.declareFunction( me, "get_real_number_inference_parameter_information", "GET-REAL-NUMBER-INFERENCE-PARAMETER-INFORMATION", 0, 0, false );
    SubLFiles.declareFunction( me, "get_enumeration_inference_parameter_information", "GET-ENUMERATION-INFERENCE-PARAMETER-INFORMATION", 0, 0, false );
    SubLFiles.declareFunction( me, "get_other_inference_parameter_information", "GET-OTHER-INFERENCE-PARAMETER-INFORMATION", 0, 0, false );
    SubLFiles.declareFunction( me, "advanced_inference_parameter_p", "ADVANCED-INFERENCE-PARAMETER-P", 1, 0, false );
    SubLFiles.declareFunction( me, "basic_inference_parameter_p", "BASIC-INFERENCE-PARAMETER-P", 1, 0, false );
    SubLFiles.declareFunction( me, "inference_parameter_name", "INFERENCE-PARAMETER-NAME", 1, 0, false );
    SubLFiles.declareFunction( me, "inference_parameter_short_description", "INFERENCE-PARAMETER-SHORT-DESCRIPTION", 1, 0, false );
    SubLFiles.declareFunction( me, "inference_parameter_long_description", "INFERENCE-PARAMETER-LONG-DESCRIPTION", 1, 0, false );
    SubLFiles.declareFunction( me, "inference_parameter_value_subl_identifier", "INFERENCE-PARAMETER-VALUE-SUBL-IDENTIFIER", 1, 0, false );
    SubLFiles.declareFunction( me, "inference_parameter_default_value", "INFERENCE-PARAMETER-DEFAULT-VALUE", 1, 0, false );
    SubLFiles.declareFunction( me, "inference_parameter_alternate_value", "INFERENCE-PARAMETER-ALTERNATE-VALUE", 1, 0, false );
    SubLFiles.declareFunction( me, "enumeration_inference_parameter_potential_values", "ENUMERATION-INFERENCE-PARAMETER-POTENTIAL-VALUES", 1, 0, false );
    SubLFiles.declareFunction( me, "integer_inference_parameter_min_value", "INTEGER-INFERENCE-PARAMETER-MIN-VALUE", 1, 0, false );
    SubLFiles.declareFunction( me, "integer_inference_parameter_max_value", "INTEGER-INFERENCE-PARAMETER-MAX-VALUE", 1, 0, false );
    SubLFiles.declareFunction( me, "real_number_inference_parameter_min_value", "REAL-NUMBER-INFERENCE-PARAMETER-MIN-VALUE", 1, 0, false );
    SubLFiles.declareFunction( me, "real_number_inference_parameter_max_value", "REAL-NUMBER-INFERENCE-PARAMETER-MAX-VALUE", 1, 0, false );
    SubLFiles.declareFunction( me, "inference_parameter_value_short_description", "INFERENCE-PARAMETER-VALUE-SHORT-DESCRIPTION", 1, 0, false );
    SubLFiles.declareFunction( me, "inference_parameter_value_long_description", "INFERENCE-PARAMETER-VALUE-LONG-DESCRIPTION", 1, 0, false );
    SubLFiles.declareFunction( me, "inference_parameter_has_valid_information_p", "INFERENCE-PARAMETER-HAS-VALID-INFORMATION-P", 2, 0, false );
    SubLFiles.declareFunction( me, "inference_parameter_has_valid_basic_information_p", "INFERENCE-PARAMETER-HAS-VALID-BASIC-INFORMATION-P", 2, 0, false );
    SubLFiles.declareFunction( me, "enumeration_inference_parameter_has_valid_information_p", "ENUMERATION-INFERENCE-PARAMETER-HAS-VALID-INFORMATION-P", 2, 0, false );
    SubLFiles.declareFunction( me, "other_inference_parameter_has_valid_information_p", "OTHER-INFERENCE-PARAMETER-HAS-VALID-INFORMATION-P", 2, 0, false );
    SubLFiles.declareFunction( me, "boolean_inference_parameter_has_valid_information_p", "BOOLEAN-INFERENCE-PARAMETER-HAS-VALID-INFORMATION-P", 2, 0, false );
    SubLFiles.declareFunction( me, "integer_inference_parameter_has_valid_information_p", "INTEGER-INFERENCE-PARAMETER-HAS-VALID-INFORMATION-P", 2, 0, false );
    SubLFiles.declareFunction( me, "real_number_inference_parameter_has_valid_information_p", "REAL-NUMBER-INFERENCE-PARAMETER-HAS-VALID-INFORMATION-P", 2, 0, false );
    SubLFiles.declareFunction( me, "valid_enumeration_inference_parameter_values_p", "VALID-ENUMERATION-INFERENCE-PARAMETER-VALUES-P", 1, 0, false );
    SubLFiles.declareFunction( me, "valid_enumeration_inference_parameter_value_p", "VALID-ENUMERATION-INFERENCE-PARAMETER-VALUE-P", 1, 0, false );
    return NIL;
  }

  public static SubLObject init_open_cyc_inference_api_file()
  {
    $use_api_task_processor_incremental_resultsP$ = SubLFiles.defparameter( "*USE-API-TASK-PROCESSOR-INCREMENTAL-RESULTS?*", T );
    $open_cyc_minimum_time_before_sending_new_answers$ = SubLFiles.defparameter( "*OPEN-CYC-MINIMUM-TIME-BEFORE-SENDING-NEW-ANSWERS*", numeric_date_utilities.elapsed_seconds_to_elapsed_internal_real_time(
        ONE_INTEGER ) );
    $default_open_cyc_nl_generation_properties$ = SubLFiles.defvar( "*DEFAULT-OPEN-CYC-NL-GENERATION-PROPERTIES*", NIL );
    $inference_to_ipc_queue_map$ = SubLFiles.deflexical( "*INFERENCE-TO-IPC-QUEUE-MAP*", maybeDefault( $sym7$_INFERENCE_TO_IPC_QUEUE_MAP_, $inference_to_ipc_queue_map$, () -> ( dictionary_utilities
        .new_synchronized_dictionary( UNPROVIDED, UNPROVIDED ) ) ) );
    $opencyc_inference_output$ = SubLFiles.deflexical( "*OPENCYC-INFERENCE-OUTPUT*", maybeDefault( $sym8$_OPENCYC_INFERENCE_OUTPUT_, $opencyc_inference_output$, () -> ( StreamsLow.$standard_output$
        .getDynamicValue() ) ) );
    $synch_format_lock$ = SubLFiles.deflexical( "*SYNCH-FORMAT-LOCK*", maybeDefault( $sym9$_SYNCH_FORMAT_LOCK_, $synch_format_lock$, () -> ( Locks.make_lock( $str10$_synch_format_lock_ ) ) ) );
    $client_to_problem_stores_map$ = SubLFiles.deflexical( "*CLIENT-TO-PROBLEM-STORES-MAP*", maybeDefault( $sym19$_CLIENT_TO_PROBLEM_STORES_MAP_, $client_to_problem_stores_map$, () -> ( dictionary_utilities
        .new_synchronized_dictionary( Symbols.symbol_function( EQUAL ), UNPROVIDED ) ) ) );
    return NIL;
  }

  public static SubLObject setup_open_cyc_inference_api_file()
  {
    subl_macro_promotions.declare_defglobal( $sym7$_INFERENCE_TO_IPC_QUEUE_MAP_ );
    subl_macro_promotions.declare_defglobal( $sym8$_OPENCYC_INFERENCE_OUTPUT_ );
    subl_macro_promotions.declare_defglobal( $sym9$_SYNCH_FORMAT_LOCK_ );
    subl_macro_promotions.declare_defglobal( $sym19$_CLIENT_TO_PROBLEM_STORES_MAP_ );
    utilities_macros.register_cyc_api_function( $sym28$OPEN_CYC_START_CONTINUABLE_QUERY, $list29, $str30$Starts_a_continuable_inference_as, $list31, NIL );
    utilities_macros.register_cyc_api_function( $sym39$OPEN_CYC_RELEASE_INFERENCE_RESOURCES_FOR_CLIENT, $list40, $str41$Releases_all_inference_resources_, $list42, NIL );
    access_macros.register_external_symbol( $sym43$OPEN_CYC_GET_BINDING_FOR_VARIABLE );
    access_macros.register_external_symbol( $sym44$OPEN_CYC_GET_ANSWER_BINDINGS );
    utilities_macros.register_cyc_api_function( $sym47$OPEN_CYC_CONTINUE_QUERY, $list48, $str49$Continues_an_existing_continuable, $list50, NIL );
    utilities_macros.register_cyc_api_function( $sym55$GET_INFERENCE_PARAMETER_INFORMATION, NIL, $str56$Returns_a_property_list_of_infere, NIL, $list57 );
    return NIL;
  }

  @Override
  public void declareFunctions()
  {
    declare_open_cyc_inference_api_file();
  }

  @Override
  public void initializeVariables()
  {
    init_open_cyc_inference_api_file();
  }

  @Override
  public void runTopLevelForms()
  {
    setup_open_cyc_inference_api_file();
  }
  static
  {
    me = new open_cyc_inference_api();
    $use_api_task_processor_incremental_resultsP$ = null;
    $open_cyc_minimum_time_before_sending_new_answers$ = null;
    $default_open_cyc_nl_generation_properties$ = null;
    $inference_to_ipc_queue_map$ = null;
    $opencyc_inference_output$ = null;
    $synch_format_lock$ = null;
    $client_to_problem_stores_map$ = null;
    $kw0$NL_PREDS = makeKeyword( "NL-PREDS" );
    $kw1$DEFAULT = makeKeyword( "DEFAULT" );
    $kw2$FORCE = makeKeyword( "FORCE" );
    $kw3$NONE = makeKeyword( "NONE" );
    $kw4$LANGUAGE_MT = makeKeyword( "LANGUAGE-MT" );
    $kw5$DOMAIN_MT = makeKeyword( "DOMAIN-MT" );
    $list6 = ConsesLow.list( makeKeyword( "MODE" ), makeKeyword( "HTML" ) );
    $sym7$_INFERENCE_TO_IPC_QUEUE_MAP_ = makeSymbol( "*INFERENCE-TO-IPC-QUEUE-MAP*" );
    $sym8$_OPENCYC_INFERENCE_OUTPUT_ = makeSymbol( "*OPENCYC-INFERENCE-OUTPUT*" );
    $sym9$_SYNCH_FORMAT_LOCK_ = makeSymbol( "*SYNCH-FORMAT-LOCK*" );
    $str10$_synch_format_lock_ = makeString( "*synch-format-lock*" );
    $list11 = ConsesLow.list( makeSymbol( "FORMAT-CONTROL" ), makeSymbol( "&REST" ), makeSymbol( "FORMAT-ARGUMENTS" ) );
    $sym12$WITH_LOCK_HELD = makeSymbol( "WITH-LOCK-HELD" );
    $list13 = ConsesLow.list( makeSymbol( "*SYNCH-FORMAT-LOCK*" ) );
    $sym14$FORMAT = makeSymbol( "FORMAT" );
    $list15 = ConsesLow.list( ConsesLow.list( makeSymbol( "FORCE-OUTPUT" ), makeSymbol( "*OPENCYC-INFERENCE-OUTPUT*" ) ) );
    $kw16$CYC_PPH = makeKeyword( "CYC-PPH" );
    $sym17$WITH_PPH_MEMOIZATION = makeSymbol( "WITH-PPH-MEMOIZATION" );
    $sym18$PROGN = makeSymbol( "PROGN" );
    $sym19$_CLIENT_TO_PROBLEM_STORES_MAP_ = makeSymbol( "*CLIENT-TO-PROBLEM-STORES-MAP*" );
    $kw20$NEW_ANSWER = makeKeyword( "NEW-ANSWER" );
    $kw21$SUSPENDED = makeKeyword( "SUSPENDED" );
    $kw22$STATUS_CHANGE = makeKeyword( "STATUS-CHANGE" );
    $kw23$DEAD = makeKeyword( "DEAD" );
    $sym24$OPEN_CYC_HANDLE_NEW_INFERENCE_EVENT = makeSymbol( "OPEN-CYC-HANDLE-NEW-INFERENCE-EVENT" );
    $sym25$EL_FORMULA_P = makeSymbol( "EL-FORMULA-P" );
    $sym26$POSSIBLY_MT_P = makeSymbol( "POSSIBLY-MT-P" );
    $sym27$QUERY_PROPERTIES_P = makeSymbol( "QUERY-PROPERTIES-P" );
    $sym28$OPEN_CYC_START_CONTINUABLE_QUERY = makeSymbol( "OPEN-CYC-START-CONTINUABLE-QUERY" );
    $list29 = ConsesLow.list( makeSymbol( "SENTENCE" ), makeSymbol( "MT" ), makeSymbol( "&OPTIONAL" ), makeSymbol( "PROPERTIES" ), ConsesLow.list( makeSymbol( "NL-GENERATION-PROPERTIES" ), makeSymbol(
        "*DEFAULT-OPEN-CYC-NL-GENERATION-PROPERTIES*" ) ), makeSymbol( "INFERENCE-ANSWER-PROCESS-FUNCTION" ), ConsesLow.list( makeSymbol( "INCREMENTAL-RESULTS?" ), makeSymbol(
            "*USE-API-TASK-PROCESSOR-INCREMENTAL-RESULTS?*" ) ), ConsesLow.list( makeSymbol( "OPTIMIZE-QUERY-SENTENCE-VARIABLES?" ), T ) );
    $str30$Starts_a_continuable_inference_as = makeString(
        "Starts a continuable inference asking the query defined by SENTENCE in the microtheory MT. \n   This function is meant to be called by external applications that are using the OpenCyc API and it uses the ability to post partial results using the task processor API in order to send results back as soon as they become available. \n\n   INFERENCE-ANSWER-PROCESS-FUNCTION is a function that will be called to process every binding set and it's results will be returned rather than the actual binding set. If INFERENCE-ANSWER-PROCESS-FUNCTION is nil, then the answer binding sets are returned unmodified. INFERENCE-ANSWER-PROCESS-FUNCTION allows work to be done on the SubL side for every answer, rather than having to do a separate round trip for processing. \n   NL-GENERATION-PROPERTIES is a generate-phrase-for-java-property-list-p which can be used to pass properties for controlling NL generation, it can be set to nil if the INFERENCE-ANSWER-PROCESS-FUNCTION performs no NL generation. \n   INCREMENTAL-RESULTS? indicates whether to use the API task processor partial result posting -- it should always be set to T except during SubL-side testing.\n   If OPTIMIZE-QUERY-SENTENCE-VARIABLES? is T then variable names in SENTENCE will be renamed to reflect the arg constraints.\n\n@return Partial result 1: (:INFERENCE-START problem-store-id inference-id)\n        Partial result 2+: (:INFERENCE-ANSWER (processed answer binding set)+)\n        Partial result last: (:INFERENCE-FINISHED status reason)\n  Destroy problem store and inference" );
    $list31 = ConsesLow.list( ConsesLow.list( makeSymbol( "SENTENCE" ), makeSymbol( "EL-FORMULA-P" ) ), ConsesLow.list( makeSymbol( "MT" ), makeSymbol( "POSSIBLY-MT-P" ) ), ConsesLow.list( makeSymbol( "PROPERTIES" ),
        makeSymbol( "QUERY-PROPERTIES-P" ) ) );
    $kw32$EVENTS = makeKeyword( "EVENTS" );
    $list33 = ConsesLow.list( makeKeyword( "NEW-ANSWER" ), makeKeyword( "STATUS-CHANGE" ) );
    $kw34$CONDITIONAL_SENTENCE_ = makeKeyword( "CONDITIONAL-SENTENCE?" );
    $str35$Inference_Communication_Queue = makeString( "Inference Communication Queue" );
    $kw36$INFERENCE_START = makeKeyword( "INFERENCE-START" );
    $str37$Problem_store_ID___A___Inference_ = makeString( "Problem store ID: ~A ~%Inference ID: ~A~%" );
    $sym38$STRINGP = makeSymbol( "STRINGP" );
    $sym39$OPEN_CYC_RELEASE_INFERENCE_RESOURCES_FOR_CLIENT = makeSymbol( "OPEN-CYC-RELEASE-INFERENCE-RESOURCES-FOR-CLIENT" );
    $list40 = ConsesLow.list( makeSymbol( "&OPTIONAL" ), ConsesLow.list( makeSymbol( "CLIENT" ), ConsesLow.list( makeSymbol( "GET-CURRENT-TASK-PROCESSOR-CLIENT" ) ) ) );
    $str41$Releases_all_inference_resources_ = makeString( "Releases all inference resources associated with CLIENT (e.g. destroys all problem stores associated with CLIENT)." );
    $list42 = ConsesLow.list( ConsesLow.list( makeSymbol( "CLIENT" ), makeSymbol( "STRINGP" ) ) );
    $sym43$OPEN_CYC_GET_BINDING_FOR_VARIABLE = makeSymbol( "OPEN-CYC-GET-BINDING-FOR-VARIABLE" );
    $sym44$OPEN_CYC_GET_ANSWER_BINDINGS = makeSymbol( "OPEN-CYC-GET-ANSWER-BINDINGS" );
    $sym45$INTEGERP = makeSymbol( "INTEGERP" );
    $sym46$GENERATE_PHRASE_FOR_JAVA_PROPERTY_LIST_P = makeSymbol( "GENERATE-PHRASE-FOR-JAVA-PROPERTY-LIST-P" );
    $sym47$OPEN_CYC_CONTINUE_QUERY = makeSymbol( "OPEN-CYC-CONTINUE-QUERY" );
    $list48 = ConsesLow.list( makeSymbol( "PROBLEM-STORE-ID" ), makeSymbol( "INFERENCE-ID" ), makeSymbol( "PROPERTIES" ), makeSymbol( "&OPTIONAL" ), ConsesLow.list( makeSymbol( "NL-GENERATION-PROPERTIES" ), makeSymbol(
        "*DEFAULT-OPEN-CYC-NL-GENERATION-PROPERTIES*" ) ), makeSymbol( "INFERENCE-ANSWER-PROCESS-FUNCTION" ), ConsesLow.list( makeSymbol( "INCREMENTAL-RESULTS?" ), makeSymbol(
            "*USE-API-TASK-PROCESSOR-INCREMENTAL-RESULTS?*" ) ) );
    $str49$Continues_an_existing_continuable = makeString(
        "Continues an existing continuable inference given a PROBLEM-STORE-ID and INFERENCE-ID. This function is meant to be called by external applications that are using the OpenCyc API and it uses the ability to post partial results using the task processor API in order to send results back as soon as they become available. INFERENCE-ANSWER-PROCESS-FUNCTION is a function that will be called to process every binding set and it's results will be returned rather than the actual binding set. If INFERENCE-ANSWER-PROCESS-FUNCTION is nil, then the answer binding sets are returned unmodified. INFERENCE-ANSWER-PROCESS-FUNCTION allows work to be done on the SubL side for every answer, rather than having to do a separate round trip for processing. NL-GENERATION-PROPERTIES is a generate-phrase-for-java-property-list-p which can be used to pass properties for controlling NL generation, it can be set to nil if the INFERENCE-ANSWER-PROCESS-FUNCTION performs no NL generation. INCREMENTAL-RESULTS? indicates whether to use the API task processor partial result posting -- it should always be set to T except during SubL-side testing.\n@return Partial result 1+: (:INFERENCE-ANSWER (processed answer binding set)+)\n        Partial result last: (:INFERENCE-FINISHED status reason)" );
    $list50 = ConsesLow.list( ConsesLow.list( makeSymbol( "PROBLEM-STORE-ID" ), makeSymbol( "INTEGERP" ) ), ConsesLow.list( makeSymbol( "INFERENCE-ID" ), makeSymbol( "INTEGERP" ) ), ConsesLow.list( makeSymbol(
        "PROPERTIES" ), makeSymbol( "QUERY-PROPERTIES-P" ) ), ConsesLow.list( makeSymbol( "NL-GENERATION-PROPERTIES" ), makeSymbol( "GENERATE-PHRASE-FOR-JAVA-PROPERTY-LIST-P" ) ) );
    $str51$Inference__A_is_already_running__ = makeString( "Inference ~A is already running!~%" );
    $str52$Cannot_ask_query__Invalid_inferen = makeString( "Cannot ask query. Invalid inference-status: ~A~%" );
    $const53$CycAPIMt = constant_handles.reader_make_constant_shell( makeString( "CycAPIMt" ) );
    $list54 = ConsesLow.list( makeKeyword( "BOOLEAN-INFERENCE-PARAMETERS" ), makeKeyword( "INTEGER-INFERENCE-PARAMETERS" ), makeKeyword( "REAL-NUMBER-INFERENCE-PARAMETERS" ), makeKeyword(
        "ENUMERATION-INFERENCE-PARAMETERS" ), makeKeyword( "OTHER-INFERENCE-PARAMETERS" ) );
    $sym55$GET_INFERENCE_PARAMETER_INFORMATION = makeSymbol( "GET-INFERENCE-PARAMETER-INFORMATION" );
    $str56$Returns_a_property_list_of_infere = makeString(
        "Returns a property list of inference parameters\n   where keys are the value domain types (e.g. :boolean-inference-parameters,\n   :integer-inference-parameters, etc.) and values\n   are lists of inference parameters that take values\n   of that type. Each such value is a property list itself \n   where keys are inference parameters and values are\n   property lists that contain property/value pairs\n   appropriate for the parameter at hand according to\n   its value domain type." );
    $list57 = ConsesLow.list( makeSymbol( "PROPERTY-LIST-P" ) );
    $sym58$CATCH_ERROR_MESSAGE_HANDLER = makeSymbol( "CATCH-ERROR-MESSAGE-HANDLER" );
    $str59$Query_thread_ = makeString( "Query thread " );
    $sym60$CONTINUE_INFERENCE = makeSymbol( "CONTINUE-INFERENCE" );
    $kw61$NEW = makeKeyword( "NEW" );
    $kw62$IGNORE_ERRORS_TARGET = makeKeyword( "IGNORE-ERRORS-TARGET" );
    $sym63$IGNORE_ERRORS_HANDLER = makeSymbol( "IGNORE-ERRORS-HANDLER", "SUBLISP" );
    $list64 = ConsesLow.list( makeKeyword( "NAME" ), makeKeyword( "BASIC?" ), makeKeyword( "QUERY-STATIC?" ), makeKeyword( "SHORT-DESC" ), makeKeyword( "LONG-DESC" ), makeKeyword( "DEFAULT-VALUE" ), makeKeyword(
        "ALTERNATE-VALUE" ) );
    $kw65$VALUE = makeKeyword( "VALUE" );
    $kw66$SHORT_DESC = makeKeyword( "SHORT-DESC" );
    $kw67$LONG_DESC = makeKeyword( "LONG-DESC" );
    $const68$BooleanInferenceParameter = constant_handles.reader_make_constant_shell( makeString( "BooleanInferenceParameter" ) );
    $const69$IntegerInferenceParameter = constant_handles.reader_make_constant_shell( makeString( "IntegerInferenceParameter" ) );
    $kw70$MIN_VALUE = makeKeyword( "MIN-VALUE" );
    $kw71$MAX_VALUE = makeKeyword( "MAX-VALUE" );
    $const72$RealNumberInferenceParameter = constant_handles.reader_make_constant_shell( makeString( "RealNumberInferenceParameter" ) );
    $const73$EnumerationInferenceParameter = constant_handles.reader_make_constant_shell( makeString( "EnumerationInferenceParameter" ) );
    $kw74$POTENTIAL_VALUES = makeKeyword( "POTENTIAL-VALUES" );
    $const75$InferenceParameter = constant_handles.reader_make_constant_shell( makeString( "InferenceParameter" ) );
    $const76$quotedIsa = constant_handles.reader_make_constant_shell( makeString( "quotedIsa" ) );
    $const77$InferenceSupportedTerm = constant_handles.reader_make_constant_shell( makeString( "InferenceSupportedTerm" ) );
    $kw78$FALSE = makeKeyword( "FALSE" );
    $kw79$BASIC_ = makeKeyword( "BASIC?" );
    $const80$AdvancedInferenceParameter = constant_handles.reader_make_constant_shell( makeString( "AdvancedInferenceParameter" ) );
    $const81$subLIdentifier = constant_handles.reader_make_constant_shell( makeString( "subLIdentifier" ) );
    $kw82$TRUE = makeKeyword( "TRUE" );
    $const83$SubLQuoteFn = constant_handles.reader_make_constant_shell( makeString( "SubLQuoteFn" ) );
    $const84$CycInferenceEngine = constant_handles.reader_make_constant_shell( makeString( "CycInferenceEngine" ) );
    $const85$NonNegativeInteger = constant_handles.reader_make_constant_shell( makeString( "NonNegativeInteger" ) );
    $const86$IntegerFromToFn = constant_handles.reader_make_constant_shell( makeString( "IntegerFromToFn" ) );
    $kw87$INTEGER_PLUS_INFINITY = makeKeyword( "INTEGER-PLUS-INFINITY" );
    $const88$Real0_1 = constant_handles.reader_make_constant_shell( makeString( "Real0-1" ) );
    $float89$0_0 = makeDouble( 0.0 );
    $float90$1_0 = makeDouble( 1.0 );
    $kw91$NAME = makeKeyword( "NAME" );
    $kw92$QUERY_STATIC_ = makeKeyword( "QUERY-STATIC?" );
    $kw93$DEFAULT_VALUE = makeKeyword( "DEFAULT-VALUE" );
    $kw94$NO_VALUE_SPECIFIED = makeKeyword( "NO-VALUE-SPECIFIED" );
    $kw95$ALTERNATE_VALUE = makeKeyword( "ALTERNATE-VALUE" );
  }
}
/*
 *
 * Total time: 374 ms
 *
 */