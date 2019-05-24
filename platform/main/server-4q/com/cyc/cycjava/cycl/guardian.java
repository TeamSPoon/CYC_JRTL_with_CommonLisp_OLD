package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.UnaryFunction;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLStructDecl;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLStructDeclNative;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLStructNative;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.visitation;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLSpecialOperatorDeclarations;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Structures;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Time;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class guardian
    extends
      SubLTranslatedFile
{
  public static final SubLFile me;
  public static final String myName = "com.cyc.cycjava.cycl.guardian";
  public static final String myFingerPrint = "3a3b16988554cf89585c61272ca1a845d9361bb184460df72f3570e66cd539a3";
  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 1141L)
  private static SubLSymbol $guardian_process$;
  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 1866L)
  private static SubLSymbol $guarding_requests$;
  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 1910L)
  private static SubLSymbol $guardian_timeslice$;
  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 1954L)
  private static SubLSymbol $guardian_isg$;
  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 2022L)
  public static SubLSymbol $dtp_guardian_request$;
  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 6593L)
  private static SubLSymbol $guardian_shutdown_marker$;
  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 7859L)
  private static SubLSymbol $guardian_sleep_marker$;
  private static final SubLSymbol $sym0$_GUARDIAN_PROCESS_;
  private static final SubLSymbol $sym1$_GUARDING_REQUESTS_;
  private static final SubLSymbol $sym2$_GUARDIAN_ISG_;
  private static final SubLSymbol $sym3$GUARDIAN_REQUEST;
  private static final SubLSymbol $sym4$GUARDIAN_REQUEST_P;
  private static final SubLList $list5;
  private static final SubLList $list6;
  private static final SubLList $list7;
  private static final SubLList $list8;
  private static final SubLSymbol $sym9$PRINT_GUARDIAN_REQUEST;
  private static final SubLSymbol $sym10$GUARDIAN_REQUEST_PRINT_FUNCTION_TRAMPOLINE;
  private static final SubLList $list11;
  private static final SubLSymbol $sym12$GUARDIAN_REQUEST_ID;
  private static final SubLSymbol $sym13$_CSETF_GUARDIAN_REQUEST_ID;
  private static final SubLSymbol $sym14$GUARDIAN_REQUEST_CHECKER_FN;
  private static final SubLSymbol $sym15$_CSETF_GUARDIAN_REQUEST_CHECKER_FN;
  private static final SubLSymbol $sym16$GUARDIAN_REQUEST_PARAMETER;
  private static final SubLSymbol $sym17$_CSETF_GUARDIAN_REQUEST_PARAMETER;
  private static final SubLSymbol $sym18$GUARDIAN_REQUEST_NOTIFICATION_FN;
  private static final SubLSymbol $sym19$_CSETF_GUARDIAN_REQUEST_NOTIFICATION_FN;
  private static final SubLSymbol $sym20$GUARDIAN_REQUEST_INTERRUPT_P;
  private static final SubLSymbol $sym21$_CSETF_GUARDIAN_REQUEST_INTERRUPT_P;
  private static final SubLSymbol $sym22$GUARDIAN_REQUEST_PROCESS;
  private static final SubLSymbol $sym23$_CSETF_GUARDIAN_REQUEST_PROCESS;
  private static final SubLSymbol $kw24$ID;
  private static final SubLSymbol $kw25$CHECKER_FN;
  private static final SubLSymbol $kw26$PARAMETER;
  private static final SubLSymbol $kw27$NOTIFICATION_FN;
  private static final SubLSymbol $kw28$INTERRUPT_P;
  private static final SubLSymbol $kw29$PROCESS;
  private static final SubLString $str30$Invalid_slot__S_for_construction_;
  private static final SubLSymbol $kw31$BEGIN;
  private static final SubLSymbol $sym32$MAKE_GUARDIAN_REQUEST;
  private static final SubLSymbol $kw33$SLOT;
  private static final SubLSymbol $kw34$END;
  private static final SubLSymbol $sym35$VISIT_DEFSTRUCT_OBJECT_GUARDIAN_REQUEST_METHOD;
  private static final SubLString $str36$__GUARDIAN_REQUEST__A__check__A_a;
  private static final SubLString $str37$INTERRUPT;
  private static final SubLString $str38$FUNCALL;
  private static final SubLSymbol $sym39$FUNCTION_SPEC_P;
  private static final SubLSymbol $sym40$BOOLEANP;
  private static final SubLSymbol $sym41$VALID_PROCESS_P;
  private static final SubLSymbol $sym42$SCHEDULE_GUARDIAN_REQUEST;
  private static final SubLList $list43;
  private static final SubLString $str44$Schedule_a_guardian_request___fun;
  private static final SubLList $list45;
  private static final SubLList $list46;
  private static final SubLSymbol $sym47$GUARDIAN_REQUEST_ID_P;
  private static final SubLList $list48;
  private static final SubLString $str49$Determine_whether_this_is_a_prope;
  private static final SubLList $list50;
  private static final SubLSymbol $sym51$FIXNUMP;
  private static final SubLSymbol $sym52$CANCEL_GUARDIAN_REQUEST;
  private static final SubLString $str53$Abort_a_guardian_request_that_is_;
  private static final SubLList $list54;
  private static final SubLList $list55;
  private static final SubLList $list56;
  private static final SubLSymbol $sym57$REQUEST_ID;
  private static final SubLSymbol $sym58$PROGN;
  private static final SubLList $list59;
  private static final SubLSymbol $sym60$CLET;
  private static final SubLSymbol $sym61$CUNWIND_PROTECT;
  private static final SubLSymbol $sym62$PWHEN;
  private static final SubLSymbol $sym63$WITH_GUARDIAN_REQUEST;
  private static final SubLString $str64$Setup_a_guardian_request_and_canc;
  private static final SubLSymbol $sym65$ACTIVE_GUARDIAN_REQUESTS;
  private static final SubLString $str66$The_active_guardian_requests_____;
  private static final SubLString $str67$Currrently_no_guardian_active_;
  private static final SubLString $str68$Active_Guardian_Requests_at_;
  private static final SubLSymbol $sym69$INITIALIZE_GUARDIAN;
  private static final SubLString $str70$Starts_the_guardian_unless_it_is_;
  private static final SubLSymbol $sym71$_GUARDIAN_SHUTDOWN_MARKER_;
  private static final SubLString $str72$Guardian_Shutdown_Marker;
  private static final SubLSymbol $sym73$STOP_GUARDIAN;
  private static final SubLString $str74$Tell_the_guardian_to_shut_itself_;
  private static final SubLString $str75$Guardian_Process;
  private static final SubLSymbol $sym76$GUARDIAN_HANDLER;
  private static final SubLSymbol $sym77$START_GUARDIAN;
  private static final SubLString $str78$Launch_the_guardian_process__pote;
  private static final SubLSymbol $sym79$ENSURE_GUARDIAN_RUNNING;
  private static final SubLString $str80$Launch_the_guardian_process_if_it;
  private static final SubLSymbol $sym81$_GUARDIAN_SLEEP_MARKER_;
  private static final SubLString $str82$Guardian_Sleep_Marker;
  private static final SubLString $str83$Connection_Guardian_Requests_;
  private static final SubLSymbol $kw84$DELETE;
  private static final SubLSymbol $kw85$CHECK_FAILED;
  private static final SubLSymbol $kw86$IGNORE_ERRORS_TARGET;
  private static final SubLSymbol $sym87$IGNORE_ERRORS_HANDLER;

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 2022L)
  public static SubLObject guardian_request_print_function_trampoline(final SubLObject v_object, final SubLObject stream)
  {
    print_guardian_request( v_object, stream, ZERO_INTEGER );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 2022L)
  public static SubLObject guardian_request_p(final SubLObject v_object)
  {
    return ( v_object.getClass() == $guardian_request_native.class ) ? T : NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 2022L)
  public static SubLObject guardian_request_id(final SubLObject v_object)
  {
    assert NIL != guardian_request_p( v_object ) : v_object;
    return v_object.getField2();
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 2022L)
  public static SubLObject guardian_request_checker_fn(final SubLObject v_object)
  {
    assert NIL != guardian_request_p( v_object ) : v_object;
    return v_object.getField3();
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 2022L)
  public static SubLObject guardian_request_parameter(final SubLObject v_object)
  {
    assert NIL != guardian_request_p( v_object ) : v_object;
    return v_object.getField4();
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 2022L)
  public static SubLObject guardian_request_notification_fn(final SubLObject v_object)
  {
    assert NIL != guardian_request_p( v_object ) : v_object;
    return v_object.getField5();
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 2022L)
  public static SubLObject guardian_request_interrupt_p(final SubLObject v_object)
  {
    assert NIL != guardian_request_p( v_object ) : v_object;
    return v_object.getField6();
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 2022L)
  public static SubLObject guardian_request_process(final SubLObject v_object)
  {
    assert NIL != guardian_request_p( v_object ) : v_object;
    return v_object.getField7();
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 2022L)
  public static SubLObject _csetf_guardian_request_id(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != guardian_request_p( v_object ) : v_object;
    return v_object.setField2( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 2022L)
  public static SubLObject _csetf_guardian_request_checker_fn(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != guardian_request_p( v_object ) : v_object;
    return v_object.setField3( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 2022L)
  public static SubLObject _csetf_guardian_request_parameter(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != guardian_request_p( v_object ) : v_object;
    return v_object.setField4( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 2022L)
  public static SubLObject _csetf_guardian_request_notification_fn(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != guardian_request_p( v_object ) : v_object;
    return v_object.setField5( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 2022L)
  public static SubLObject _csetf_guardian_request_interrupt_p(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != guardian_request_p( v_object ) : v_object;
    return v_object.setField6( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 2022L)
  public static SubLObject _csetf_guardian_request_process(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != guardian_request_p( v_object ) : v_object;
    return v_object.setField7( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 2022L)
  public static SubLObject make_guardian_request(SubLObject arglist)
  {
    if( arglist == UNPROVIDED )
    {
      arglist = NIL;
    }
    final SubLObject v_new = new $guardian_request_native();
    SubLObject next;
    SubLObject current_arg;
    SubLObject current_value;
    SubLObject pcase_var;
    for( next = NIL, next = arglist; NIL != next; next = conses_high.cddr( next ) )
    {
      current_arg = next.first();
      current_value = conses_high.cadr( next );
      pcase_var = current_arg;
      if( pcase_var.eql( $kw24$ID ) )
      {
        _csetf_guardian_request_id( v_new, current_value );
      }
      else if( pcase_var.eql( $kw25$CHECKER_FN ) )
      {
        _csetf_guardian_request_checker_fn( v_new, current_value );
      }
      else if( pcase_var.eql( $kw26$PARAMETER ) )
      {
        _csetf_guardian_request_parameter( v_new, current_value );
      }
      else if( pcase_var.eql( $kw27$NOTIFICATION_FN ) )
      {
        _csetf_guardian_request_notification_fn( v_new, current_value );
      }
      else if( pcase_var.eql( $kw28$INTERRUPT_P ) )
      {
        _csetf_guardian_request_interrupt_p( v_new, current_value );
      }
      else if( pcase_var.eql( $kw29$PROCESS ) )
      {
        _csetf_guardian_request_process( v_new, current_value );
      }
      else
      {
        Errors.error( $str30$Invalid_slot__S_for_construction_, current_arg );
      }
    }
    return v_new;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 2022L)
  public static SubLObject visit_defstruct_guardian_request(final SubLObject obj, final SubLObject visitor_fn)
  {
    Functions.funcall( visitor_fn, obj, $kw31$BEGIN, $sym32$MAKE_GUARDIAN_REQUEST, SIX_INTEGER );
    Functions.funcall( visitor_fn, obj, $kw33$SLOT, $kw24$ID, guardian_request_id( obj ) );
    Functions.funcall( visitor_fn, obj, $kw33$SLOT, $kw25$CHECKER_FN, guardian_request_checker_fn( obj ) );
    Functions.funcall( visitor_fn, obj, $kw33$SLOT, $kw26$PARAMETER, guardian_request_parameter( obj ) );
    Functions.funcall( visitor_fn, obj, $kw33$SLOT, $kw27$NOTIFICATION_FN, guardian_request_notification_fn( obj ) );
    Functions.funcall( visitor_fn, obj, $kw33$SLOT, $kw28$INTERRUPT_P, guardian_request_interrupt_p( obj ) );
    Functions.funcall( visitor_fn, obj, $kw33$SLOT, $kw29$PROCESS, guardian_request_process( obj ) );
    Functions.funcall( visitor_fn, obj, $kw34$END, $sym32$MAKE_GUARDIAN_REQUEST, SIX_INTEGER );
    return obj;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 2022L)
  public static SubLObject visit_defstruct_object_guardian_request_method(final SubLObject obj, final SubLObject visitor_fn)
  {
    return visit_defstruct_guardian_request( obj, visitor_fn );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 2179L)
  public static SubLObject new_guardian_request(final SubLObject checker_fn, final SubLObject parameter, final SubLObject notification_fn, final SubLObject process, final SubLObject interrupt_p)
  {
    return make_guardian_request( ConsesLow.list( new SubLObject[] { $kw24$ID, integer_sequence_generator.integer_sequence_generator_next( $guardian_isg$.getGlobalValue() ), $kw25$CHECKER_FN, checker_fn, $kw26$PARAMETER,
      parameter, $kw27$NOTIFICATION_FN, notification_fn, $kw29$PROCESS, process, $kw28$INTERRUPT_P, interrupt_p
    } ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 2668L)
  public static SubLObject print_guardian_request(final SubLObject v_object, final SubLObject stream, final SubLObject depth)
  {
    PrintLow.format( stream, $str36$__GUARDIAN_REQUEST__A__check__A_a, new SubLObject[] { guardian_request_id( v_object ), guardian_request_checker_fn( v_object ), guardian_request_parameter( v_object ),
      guardian_request_process( v_object ), guardian_request_notification_fn( v_object ), ( NIL != guardian_request_interrupt_p( v_object ) ) ? $str37$INTERRUPT : $str38$FUNCALL
    } );
    return v_object;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 3159L)
  public static SubLObject schedule_guardian_request(final SubLObject checker_fn, final SubLObject parameter, final SubLObject notification_fn, SubLObject process, SubLObject interrupt_p)
  {
    if( process == UNPROVIDED )
    {
      process = NIL;
    }
    if( interrupt_p == UNPROVIDED )
    {
      interrupt_p = NIL;
    }
    enforceType( checker_fn, $sym39$FUNCTION_SPEC_P );
    enforceType( notification_fn, $sym39$FUNCTION_SPEC_P );
    enforceType( interrupt_p, $sym40$BOOLEANP );
    if( NIL == process )
    {
      process = Threads.current_process();
    }
    assert NIL != Threads.valid_process_p( process ) : process;
    if( NIL == process_utilities.ipc_queue_p( $guarding_requests$.getGlobalValue() ) )
    {
      return NIL;
    }
    final SubLObject request = new_guardian_request( checker_fn, parameter, notification_fn, process, interrupt_p );
    final SubLObject request_id = guardian_request_id( request );
    process_utilities.ipc_enqueue( request, $guarding_requests$.getGlobalValue(), UNPROVIDED );
    return request_id;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 4444L)
  public static SubLObject guardian_request_id_p(final SubLObject request_id)
  {
    return Types.fixnump( request_id );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 4612L)
  public static SubLObject cancel_guardian_request(final SubLObject request_id)
  {
    enforceType( request_id, $sym51$FIXNUMP );
    if( NIL != process_utilities.ipc_queue_p( $guarding_requests$.getGlobalValue() ) )
    {
      process_utilities.ipc_enqueue( request_id, $guarding_requests$.getGlobalValue(), UNPROVIDED );
    }
    return request_id;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 4936L)
  public static SubLObject with_guardian_request(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list56 );
    final SubLObject temp = current.rest();
    current = current.first();
    SubLObject checker_fn = NIL;
    SubLObject parameter = NIL;
    SubLObject notification_fn = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list56 );
    checker_fn = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list56 );
    parameter = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list56 );
    notification_fn = current.first();
    current = current.rest();
    if( NIL == current )
    {
      final SubLObject body;
      current = ( body = temp );
      final SubLObject request_id = $sym57$REQUEST_ID;
      return ConsesLow.list( $sym58$PROGN, $list59, ConsesLow.list( $sym60$CLET, ConsesLow.list( ConsesLow.list( request_id, ConsesLow.list( $sym42$SCHEDULE_GUARDIAN_REQUEST, checker_fn, parameter, notification_fn ) ) ),
          reader.bq_cons( $sym61$CUNWIND_PROTECT, ConsesLow.append( body, ConsesLow.list( ConsesLow.list( $sym62$PWHEN, ConsesLow.list( $sym47$GUARDIAN_REQUEST_ID_P, request_id ), ConsesLow.list(
              $sym52$CANCEL_GUARDIAN_REQUEST, request_id ) ) ) ) ) ) );
    }
    cdestructuring_bind.cdestructuring_bind_error( datum, $list56 );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 5446L)
  public static SubLObject active_guardian_requests()
  {
    if( NIL != process_utilities.ipc_queue_p( $guarding_requests$.getGlobalValue() ) )
    {
      return process_utilities.ipc_current_queue_content( $guarding_requests$.getGlobalValue() );
    }
    return Values.values( NIL, Time.get_universal_time() );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 5767L)
  public static SubLObject print_active_guardian_requests(SubLObject stream)
  {
    if( stream == UNPROVIDED )
    {
      stream = T;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL == current_guardian_process() )
    {
      streams_high.terpri( stream );
      streams_high.write_string( $str67$Currrently_no_guardian_active_, stream, UNPROVIDED, UNPROVIDED );
      return stream;
    }
    thread.resetMultipleValues();
    final SubLObject contents = active_guardian_requests();
    final SubLObject time_stamp = thread.secondMultipleValue();
    thread.resetMultipleValues();
    streams_high.terpri( stream );
    streams_high.write_string( $str68$Active_Guardian_Requests_at_, stream, UNPROVIDED, UNPROVIDED );
    streams_high.write_string( numeric_date_utilities.timestring( time_stamp ), stream, UNPROVIDED, UNPROVIDED );
    SubLObject cdolist_list_var = contents;
    SubLObject entry = NIL;
    entry = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      print_high.print( entry, stream );
      cdolist_list_var = cdolist_list_var.rest();
      entry = cdolist_list_var.first();
    }
    return stream;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 6259L)
  public static SubLObject current_guardian_process()
  {
    return $guardian_process$.getGlobalValue();
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 6334L)
  public static SubLObject initialize_guardian()
  {
    if( NIL != Threads.valid_process_p( current_guardian_process() ) )
    {
      stop_guardian();
    }
    start_guardian();
    return Threads.valid_process_p( current_guardian_process() );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 6682L)
  public static SubLObject stop_guardian()
  {
    if( NIL != process_utilities.ipc_queue_p( $guarding_requests$.getGlobalValue() ) )
    {
      process_utilities.ipc_enqueue( $guardian_shutdown_marker$.getGlobalValue(), $guarding_requests$.getGlobalValue(), UNPROVIDED );
    }
    SubLObject small_number;
    SubLObject i;
    for( small_number = TEN_INTEGER, i = NIL, i = ZERO_INTEGER; i.numL( small_number ); i = Numbers.add( i, ONE_INTEGER ) )
    {
      if( NIL != Threads.valid_process_p( current_guardian_process() ) )
      {
        Threads.sleep( ZERO_INTEGER );
      }
    }
    return makeBoolean( NIL == Threads.valid_process_p( current_guardian_process() ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 7148L)
  public static SubLObject start_guardian()
  {
    Threads.make_process( $str75$Guardian_Process, $sym76$GUARDIAN_HANDLER );
    SubLObject small_number;
    SubLObject i;
    for( small_number = TEN_INTEGER, i = NIL, i = ZERO_INTEGER; i.numL( small_number ); i = Numbers.add( i, ONE_INTEGER ) )
    {
      if( NIL == Threads.valid_process_p( current_guardian_process() ) )
      {
        Threads.sleep( ZERO_INTEGER );
      }
    }
    return Threads.valid_process_p( current_guardian_process() );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 7593L)
  public static SubLObject ensure_guardian_running()
  {
    if( NIL == Threads.valid_process_p( current_guardian_process() ) )
    {
      start_guardian();
    }
    return Threads.valid_process_p( current_guardian_process() );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 7942L)
  public static SubLObject is_guardian_shutdown_marker(final SubLObject marker)
  {
    return Equality.eq( marker, $guardian_shutdown_marker$.getGlobalValue() );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 8045L)
  public static SubLObject guardian_handler()
  {
    final SubLObject deleted = dictionary.new_dictionary( UNPROVIDED, UNPROVIDED );
    final SubLObject queue = process_utilities.new_ipc_queue( $str83$Connection_Guardian_Requests_ );
    SubLObject add_sleep_markerP = T;
    SubLObject doneP = NIL;
    $guardian_process$.setGlobalValue( Threads.current_process() );
    $guarding_requests$.setGlobalValue( queue );
    try
    {
      while ( NIL == doneP)
      {
        final SubLObject request = process_utilities.ipc_dequeue( queue, UNPROVIDED );
        if( NIL != add_sleep_markerP )
        {
          process_utilities.ipc_enqueue( $guardian_sleep_marker$.getGlobalValue(), queue, UNPROVIDED );
          add_sleep_markerP = NIL;
        }
        if( $guardian_sleep_marker$.getGlobalValue().eql( request ) )
        {
          if( process_utilities.ipc_current_queue_size( queue ).isZero() )
          {
            if( NIL == dictionary.dictionary_empty_p( deleted ) )
            {
              dictionary.clear_dictionary( deleted );
            }
          }
          else
          {
            Threads.sleep( $guardian_timeslice$.getGlobalValue() );
          }
          add_sleep_markerP = T;
        }
        else if( NIL != is_guardian_shutdown_marker( request ) )
        {
          doneP = T;
        }
        else if( request.isFixnum() )
        {
          if( NIL != dictionary.dictionary_lookup( deleted, request, UNPROVIDED ) )
          {
            continue;
          }
          dictionary.dictionary_enter( deleted, request, $kw84$DELETE );
        }
        else
        {
          if( NIL == guardian_request_p( request ) )
          {
            continue;
          }
          final SubLObject id = guardian_request_id( request );
          if( NIL != dictionary.dictionary_lookup( deleted, id, UNPROVIDED ) )
          {
            dictionary.dictionary_remove( deleted, id );
          }
          else if( NIL == Threads.valid_process_p( guardian_request_process( request ) ) || NIL == check_guardian_request( request ) )
          {
            dictionary.dictionary_enter( deleted, guardian_request_id( request ), $kw84$DELETE );
          }
          else
          {
            process_utilities.ipc_enqueue( request, queue, UNPROVIDED );
          }
        }
      }
    }
    finally
    {
      final SubLObject _prev_bind_0 = Dynamic.currentBinding( Threads.$is_thread_performing_cleanupP$ );
      try
      {
        Dynamic.bind( Threads.$is_thread_performing_cleanupP$, T );
        final SubLObject _values = Values.getValuesAsVector();
        if( $guardian_process$.getGlobalValue().eql( Threads.current_process() ) )
        {
          $guardian_process$.setGlobalValue( NIL );
        }
        if( $guarding_requests$.getGlobalValue().eql( queue ) )
        {
          $guarding_requests$.setGlobalValue( NIL );
        }
        Values.restoreValuesFromVector( _values );
      }
      finally
      {
        Dynamic.rebind( Threads.$is_thread_performing_cleanupP$, _prev_bind_0 );
      }
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 9939L)
  public static SubLObject check_guardian_request(final SubLObject request)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject value = $kw85$CHECK_FAILED;
    SubLObject ignore_errors_tag = NIL;
    try
    {
      thread.throwStack.push( $kw86$IGNORE_ERRORS_TARGET );
      final SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding( thread );
      try
      {
        Errors.$error_handler$.bind( Symbols.symbol_function( $sym87$IGNORE_ERRORS_HANDLER ), thread );
        try
        {
          value = list_utilities.sublisp_boolean( Functions.funcall( guardian_request_checker_fn( request ), guardian_request_parameter( request ) ) );
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
      ignore_errors_tag = Errors.handleThrowable( ccatch_env_var, $kw86$IGNORE_ERRORS_TARGET );
    }
    finally
    {
      thread.throwStack.pop();
    }
    if( value == $kw85$CHECK_FAILED )
    {
      value = NIL;
    }
    if( NIL == value )
    {
      SubLObject ignore_errors_tag_$1 = NIL;
      try
      {
        thread.throwStack.push( $kw86$IGNORE_ERRORS_TARGET );
        final SubLObject _prev_bind_2 = Errors.$error_handler$.currentBinding( thread );
        try
        {
          Errors.$error_handler$.bind( Symbols.symbol_function( $sym87$IGNORE_ERRORS_HANDLER ), thread );
          try
          {
            if( NIL != guardian_request_interrupt_p( request ) )
            {
              subl_promotions.interrupt_process_with_args( guardian_request_process( request ), guardian_request_notification_fn( request ), guardian_request_parameter( request ) );
            }
            else
            {
              Functions.funcall( guardian_request_notification_fn( request ), guardian_request_parameter( request ) );
            }
          }
          catch( final Throwable catch_var2 )
          {
            Errors.handleThrowable( catch_var2, NIL );
          }
        }
        finally
        {
          Errors.$error_handler$.rebind( _prev_bind_2, thread );
        }
      }
      catch( final Throwable ccatch_env_var2 )
      {
        ignore_errors_tag_$1 = Errors.handleThrowable( ccatch_env_var2, $kw86$IGNORE_ERRORS_TARGET );
      }
      finally
      {
        thread.throwStack.pop();
      }
    }
    return list_utilities.sublisp_boolean( value );
  }

  public static SubLObject declare_guardian_file()
  {
    SubLFiles.declareFunction( me, "guardian_request_print_function_trampoline", "GUARDIAN-REQUEST-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false );
    SubLFiles.declareFunction( me, "guardian_request_p", "GUARDIAN-REQUEST-P", 1, 0, false );
    new $guardian_request_p$UnaryFunction();
    SubLFiles.declareFunction( me, "guardian_request_id", "GUARDIAN-REQUEST-ID", 1, 0, false );
    SubLFiles.declareFunction( me, "guardian_request_checker_fn", "GUARDIAN-REQUEST-CHECKER-FN", 1, 0, false );
    SubLFiles.declareFunction( me, "guardian_request_parameter", "GUARDIAN-REQUEST-PARAMETER", 1, 0, false );
    SubLFiles.declareFunction( me, "guardian_request_notification_fn", "GUARDIAN-REQUEST-NOTIFICATION-FN", 1, 0, false );
    SubLFiles.declareFunction( me, "guardian_request_interrupt_p", "GUARDIAN-REQUEST-INTERRUPT-P", 1, 0, false );
    SubLFiles.declareFunction( me, "guardian_request_process", "GUARDIAN-REQUEST-PROCESS", 1, 0, false );
    SubLFiles.declareFunction( me, "_csetf_guardian_request_id", "_CSETF-GUARDIAN-REQUEST-ID", 2, 0, false );
    SubLFiles.declareFunction( me, "_csetf_guardian_request_checker_fn", "_CSETF-GUARDIAN-REQUEST-CHECKER-FN", 2, 0, false );
    SubLFiles.declareFunction( me, "_csetf_guardian_request_parameter", "_CSETF-GUARDIAN-REQUEST-PARAMETER", 2, 0, false );
    SubLFiles.declareFunction( me, "_csetf_guardian_request_notification_fn", "_CSETF-GUARDIAN-REQUEST-NOTIFICATION-FN", 2, 0, false );
    SubLFiles.declareFunction( me, "_csetf_guardian_request_interrupt_p", "_CSETF-GUARDIAN-REQUEST-INTERRUPT-P", 2, 0, false );
    SubLFiles.declareFunction( me, "_csetf_guardian_request_process", "_CSETF-GUARDIAN-REQUEST-PROCESS", 2, 0, false );
    SubLFiles.declareFunction( me, "make_guardian_request", "MAKE-GUARDIAN-REQUEST", 0, 1, false );
    SubLFiles.declareFunction( me, "visit_defstruct_guardian_request", "VISIT-DEFSTRUCT-GUARDIAN-REQUEST", 2, 0, false );
    SubLFiles.declareFunction( me, "visit_defstruct_object_guardian_request_method", "VISIT-DEFSTRUCT-OBJECT-GUARDIAN-REQUEST-METHOD", 2, 0, false );
    SubLFiles.declareFunction( me, "new_guardian_request", "NEW-GUARDIAN-REQUEST", 5, 0, false );
    SubLFiles.declareFunction( me, "print_guardian_request", "PRINT-GUARDIAN-REQUEST", 3, 0, false );
    SubLFiles.declareFunction( me, "schedule_guardian_request", "SCHEDULE-GUARDIAN-REQUEST", 3, 2, false );
    SubLFiles.declareFunction( me, "guardian_request_id_p", "GUARDIAN-REQUEST-ID-P", 1, 0, false );
    SubLFiles.declareFunction( me, "cancel_guardian_request", "CANCEL-GUARDIAN-REQUEST", 1, 0, false );
    SubLFiles.declareMacro( me, "with_guardian_request", "WITH-GUARDIAN-REQUEST" );
    SubLFiles.declareFunction( me, "active_guardian_requests", "ACTIVE-GUARDIAN-REQUESTS", 0, 0, false );
    SubLFiles.declareFunction( me, "print_active_guardian_requests", "PRINT-ACTIVE-GUARDIAN-REQUESTS", 0, 1, false );
    SubLFiles.declareFunction( me, "current_guardian_process", "CURRENT-GUARDIAN-PROCESS", 0, 0, false );
    SubLFiles.declareFunction( me, "initialize_guardian", "INITIALIZE-GUARDIAN", 0, 0, false );
    SubLFiles.declareFunction( me, "stop_guardian", "STOP-GUARDIAN", 0, 0, false );
    SubLFiles.declareFunction( me, "start_guardian", "START-GUARDIAN", 0, 0, false );
    SubLFiles.declareFunction( me, "ensure_guardian_running", "ENSURE-GUARDIAN-RUNNING", 0, 0, false );
    SubLFiles.declareFunction( me, "is_guardian_shutdown_marker", "IS-GUARDIAN-SHUTDOWN-MARKER", 1, 0, false );
    SubLFiles.declareFunction( me, "guardian_handler", "GUARDIAN-HANDLER", 0, 0, false );
    SubLFiles.declareFunction( me, "check_guardian_request", "CHECK-GUARDIAN-REQUEST", 1, 0, false );
    return NIL;
  }

  public static SubLObject init_guardian_file()
  {
    $guardian_process$ = SubLFiles.deflexical( "*GUARDIAN-PROCESS*", ( maybeDefault( $sym0$_GUARDIAN_PROCESS_, $guardian_process$, NIL ) ) );
    $guarding_requests$ = SubLFiles.deflexical( "*GUARDING-REQUESTS*", ( maybeDefault( $sym1$_GUARDING_REQUESTS_, $guarding_requests$, NIL ) ) );
    $guardian_timeslice$ = SubLFiles.deflexical( "*GUARDIAN-TIMESLICE*", TWO_INTEGER );
    $guardian_isg$ = SubLFiles.deflexical( "*GUARDIAN-ISG*", maybeDefault( $sym2$_GUARDIAN_ISG_, $guardian_isg$, () -> ( integer_sequence_generator.new_integer_sequence_generator( UNPROVIDED, UNPROVIDED,
        UNPROVIDED ) ) ) );
    $dtp_guardian_request$ = SubLFiles.defconstant( "*DTP-GUARDIAN-REQUEST*", $sym3$GUARDIAN_REQUEST );
    $guardian_shutdown_marker$ = SubLFiles.deflexical( "*GUARDIAN-SHUTDOWN-MARKER*", maybeDefault( $sym71$_GUARDIAN_SHUTDOWN_MARKER_, $guardian_shutdown_marker$, () -> ( Symbols.make_symbol(
        $str72$Guardian_Shutdown_Marker ) ) ) );
    $guardian_sleep_marker$ = SubLFiles.deflexical( "*GUARDIAN-SLEEP-MARKER*", maybeDefault( $sym81$_GUARDIAN_SLEEP_MARKER_, $guardian_sleep_marker$, () -> ( Symbols.make_symbol( $str82$Guardian_Sleep_Marker ) ) ) );
    return NIL;
  }

  public static SubLObject setup_guardian_file()
  {
    subl_macro_promotions.declare_defglobal( $sym0$_GUARDIAN_PROCESS_ );
    subl_macro_promotions.declare_defglobal( $sym1$_GUARDING_REQUESTS_ );
    subl_macro_promotions.declare_defglobal( $sym2$_GUARDIAN_ISG_ );
    Structures.register_method( print_high.$print_object_method_table$.getGlobalValue(), $dtp_guardian_request$.getGlobalValue(), Symbols.symbol_function( $sym10$GUARDIAN_REQUEST_PRINT_FUNCTION_TRAMPOLINE ) );
    SubLSpecialOperatorDeclarations.proclaim( $list11 );
    Structures.def_csetf( $sym12$GUARDIAN_REQUEST_ID, $sym13$_CSETF_GUARDIAN_REQUEST_ID );
    Structures.def_csetf( $sym14$GUARDIAN_REQUEST_CHECKER_FN, $sym15$_CSETF_GUARDIAN_REQUEST_CHECKER_FN );
    Structures.def_csetf( $sym16$GUARDIAN_REQUEST_PARAMETER, $sym17$_CSETF_GUARDIAN_REQUEST_PARAMETER );
    Structures.def_csetf( $sym18$GUARDIAN_REQUEST_NOTIFICATION_FN, $sym19$_CSETF_GUARDIAN_REQUEST_NOTIFICATION_FN );
    Structures.def_csetf( $sym20$GUARDIAN_REQUEST_INTERRUPT_P, $sym21$_CSETF_GUARDIAN_REQUEST_INTERRUPT_P );
    Structures.def_csetf( $sym22$GUARDIAN_REQUEST_PROCESS, $sym23$_CSETF_GUARDIAN_REQUEST_PROCESS );
    Equality.identity( $sym3$GUARDIAN_REQUEST );
    Structures.register_method( visitation.$visit_defstruct_object_method_table$.getGlobalValue(), $dtp_guardian_request$.getGlobalValue(), Symbols.symbol_function(
        $sym35$VISIT_DEFSTRUCT_OBJECT_GUARDIAN_REQUEST_METHOD ) );
    utilities_macros.register_cyc_api_function( $sym42$SCHEDULE_GUARDIAN_REQUEST, $list43, $str44$Schedule_a_guardian_request___fun, $list45, $list46 );
    utilities_macros.register_cyc_api_function( $sym47$GUARDIAN_REQUEST_ID_P, $list48, $str49$Determine_whether_this_is_a_prope, NIL, $list50 );
    utilities_macros.register_cyc_api_function( $sym52$CANCEL_GUARDIAN_REQUEST, $list48, $str53$Abort_a_guardian_request_that_is_, $list54, $list55 );
    utilities_macros.register_cyc_api_macro( $sym63$WITH_GUARDIAN_REQUEST, $list56, $str64$Setup_a_guardian_request_and_canc );
    utilities_macros.register_cyc_api_function( $sym65$ACTIVE_GUARDIAN_REQUESTS, NIL, $str66$The_active_guardian_requests_____, NIL, NIL );
    utilities_macros.register_cyc_api_function( $sym69$INITIALIZE_GUARDIAN, NIL, $str70$Starts_the_guardian_unless_it_is_, NIL, $list50 );
    subl_macro_promotions.declare_defglobal( $sym71$_GUARDIAN_SHUTDOWN_MARKER_ );
    utilities_macros.register_cyc_api_function( $sym73$STOP_GUARDIAN, NIL, $str74$Tell_the_guardian_to_shut_itself_, NIL, $list50 );
    utilities_macros.register_cyc_api_function( $sym77$START_GUARDIAN, NIL, $str78$Launch_the_guardian_process__pote, NIL, $list50 );
    utilities_macros.register_cyc_api_function( $sym79$ENSURE_GUARDIAN_RUNNING, NIL, $str80$Launch_the_guardian_process_if_it, NIL, $list50 );
    subl_macro_promotions.declare_defglobal( $sym81$_GUARDIAN_SLEEP_MARKER_ );
    return NIL;
  }

  @Override
  public void declareFunctions()
  {
    declare_guardian_file();
  }

  @Override
  public void initializeVariables()
  {
    init_guardian_file();
  }

  @Override
  public void runTopLevelForms()
  {
    setup_guardian_file();
  }
  static
  {
    me = new guardian();
    $guardian_process$ = null;
    $guarding_requests$ = null;
    $guardian_timeslice$ = null;
    $guardian_isg$ = null;
    $dtp_guardian_request$ = null;
    $guardian_shutdown_marker$ = null;
    $guardian_sleep_marker$ = null;
    $sym0$_GUARDIAN_PROCESS_ = makeSymbol( "*GUARDIAN-PROCESS*" );
    $sym1$_GUARDING_REQUESTS_ = makeSymbol( "*GUARDING-REQUESTS*" );
    $sym2$_GUARDIAN_ISG_ = makeSymbol( "*GUARDIAN-ISG*" );
    $sym3$GUARDIAN_REQUEST = makeSymbol( "GUARDIAN-REQUEST" );
    $sym4$GUARDIAN_REQUEST_P = makeSymbol( "GUARDIAN-REQUEST-P" );
    $list5 = ConsesLow.list( makeSymbol( "ID" ), makeSymbol( "CHECKER-FN" ), makeSymbol( "PARAMETER" ), makeSymbol( "NOTIFICATION-FN" ), makeSymbol( "INTERRUPT-P" ), makeSymbol( "PROCESS" ) );
    $list6 = ConsesLow.list( makeKeyword( "ID" ), makeKeyword( "CHECKER-FN" ), makeKeyword( "PARAMETER" ), makeKeyword( "NOTIFICATION-FN" ), makeKeyword( "INTERRUPT-P" ), makeKeyword( "PROCESS" ) );
    $list7 = ConsesLow.list( makeSymbol( "GUARDIAN-REQUEST-ID" ), makeSymbol( "GUARDIAN-REQUEST-CHECKER-FN" ), makeSymbol( "GUARDIAN-REQUEST-PARAMETER" ), makeSymbol( "GUARDIAN-REQUEST-NOTIFICATION-FN" ), makeSymbol(
        "GUARDIAN-REQUEST-INTERRUPT-P" ), makeSymbol( "GUARDIAN-REQUEST-PROCESS" ) );
    $list8 = ConsesLow.list( makeSymbol( "_CSETF-GUARDIAN-REQUEST-ID" ), makeSymbol( "_CSETF-GUARDIAN-REQUEST-CHECKER-FN" ), makeSymbol( "_CSETF-GUARDIAN-REQUEST-PARAMETER" ), makeSymbol(
        "_CSETF-GUARDIAN-REQUEST-NOTIFICATION-FN" ), makeSymbol( "_CSETF-GUARDIAN-REQUEST-INTERRUPT-P" ), makeSymbol( "_CSETF-GUARDIAN-REQUEST-PROCESS" ) );
    $sym9$PRINT_GUARDIAN_REQUEST = makeSymbol( "PRINT-GUARDIAN-REQUEST" );
    $sym10$GUARDIAN_REQUEST_PRINT_FUNCTION_TRAMPOLINE = makeSymbol( "GUARDIAN-REQUEST-PRINT-FUNCTION-TRAMPOLINE" );
    $list11 = ConsesLow.list( makeSymbol( "OPTIMIZE-FUNCALL" ), makeSymbol( "GUARDIAN-REQUEST-P" ) );
    $sym12$GUARDIAN_REQUEST_ID = makeSymbol( "GUARDIAN-REQUEST-ID" );
    $sym13$_CSETF_GUARDIAN_REQUEST_ID = makeSymbol( "_CSETF-GUARDIAN-REQUEST-ID" );
    $sym14$GUARDIAN_REQUEST_CHECKER_FN = makeSymbol( "GUARDIAN-REQUEST-CHECKER-FN" );
    $sym15$_CSETF_GUARDIAN_REQUEST_CHECKER_FN = makeSymbol( "_CSETF-GUARDIAN-REQUEST-CHECKER-FN" );
    $sym16$GUARDIAN_REQUEST_PARAMETER = makeSymbol( "GUARDIAN-REQUEST-PARAMETER" );
    $sym17$_CSETF_GUARDIAN_REQUEST_PARAMETER = makeSymbol( "_CSETF-GUARDIAN-REQUEST-PARAMETER" );
    $sym18$GUARDIAN_REQUEST_NOTIFICATION_FN = makeSymbol( "GUARDIAN-REQUEST-NOTIFICATION-FN" );
    $sym19$_CSETF_GUARDIAN_REQUEST_NOTIFICATION_FN = makeSymbol( "_CSETF-GUARDIAN-REQUEST-NOTIFICATION-FN" );
    $sym20$GUARDIAN_REQUEST_INTERRUPT_P = makeSymbol( "GUARDIAN-REQUEST-INTERRUPT-P" );
    $sym21$_CSETF_GUARDIAN_REQUEST_INTERRUPT_P = makeSymbol( "_CSETF-GUARDIAN-REQUEST-INTERRUPT-P" );
    $sym22$GUARDIAN_REQUEST_PROCESS = makeSymbol( "GUARDIAN-REQUEST-PROCESS" );
    $sym23$_CSETF_GUARDIAN_REQUEST_PROCESS = makeSymbol( "_CSETF-GUARDIAN-REQUEST-PROCESS" );
    $kw24$ID = makeKeyword( "ID" );
    $kw25$CHECKER_FN = makeKeyword( "CHECKER-FN" );
    $kw26$PARAMETER = makeKeyword( "PARAMETER" );
    $kw27$NOTIFICATION_FN = makeKeyword( "NOTIFICATION-FN" );
    $kw28$INTERRUPT_P = makeKeyword( "INTERRUPT-P" );
    $kw29$PROCESS = makeKeyword( "PROCESS" );
    $str30$Invalid_slot__S_for_construction_ = makeString( "Invalid slot ~S for construction function" );
    $kw31$BEGIN = makeKeyword( "BEGIN" );
    $sym32$MAKE_GUARDIAN_REQUEST = makeSymbol( "MAKE-GUARDIAN-REQUEST" );
    $kw33$SLOT = makeKeyword( "SLOT" );
    $kw34$END = makeKeyword( "END" );
    $sym35$VISIT_DEFSTRUCT_OBJECT_GUARDIAN_REQUEST_METHOD = makeSymbol( "VISIT-DEFSTRUCT-OBJECT-GUARDIAN-REQUEST-METHOD" );
    $str36$__GUARDIAN_REQUEST__A__check__A_a = makeString( "#<GUARDIAN-REQUEST ~A: check ~A argument ~A notify ~A via ~A using ~A>" );
    $str37$INTERRUPT = makeString( "INTERRUPT" );
    $str38$FUNCALL = makeString( "FUNCALL" );
    $sym39$FUNCTION_SPEC_P = makeSymbol( "FUNCTION-SPEC-P" );
    $sym40$BOOLEANP = makeSymbol( "BOOLEANP" );
    $sym41$VALID_PROCESS_P = makeSymbol( "VALID-PROCESS-P" );
    $sym42$SCHEDULE_GUARDIAN_REQUEST = makeSymbol( "SCHEDULE-GUARDIAN-REQUEST" );
    $list43 = ConsesLow.list( makeSymbol( "CHECKER-FN" ), makeSymbol( "PARAMETER" ), makeSymbol( "NOTIFICATION-FN" ), makeSymbol( "&OPTIONAL" ), makeSymbol( "PROCESS" ), makeSymbol( "INTERRUPT-P" ) );
    $str44$Schedule_a_guardian_request___fun = makeString(
        "Schedule a guardian request. (funcall checker-fn parameter) will be called\n   until it returns NIL. \n   In this case, the requesting process is notified, either via FUNCALL or INTERRUPT-PROCESS-WITH-ARGS\n   and passed the parameter one last time; the INTERRUPT-P flag decides which one it is; FUNCALL is default.\n   @note use FUNCALL when the function invoked cannot or need not run in the process being notified;\n   for example, TERMINATE-ACTIVE-TASK-PROCESS already calls INTERRRUPT-PROCESS, and not all LISP implementation\n   actually handle that gracefully, so there FUNCALL is sufficient.\n   @return the ticked for the guardian request" );
    $list45 = ConsesLow.list( ConsesLow.list( makeSymbol( "CHECKER-FN" ), makeSymbol( "FUNCTION-SPEC-P" ) ), ConsesLow.list( makeSymbol( "NOTIFICATION-FN" ), makeSymbol( "FUNCTION-SPEC-P" ) ), ConsesLow.list( makeSymbol(
        "INTERRUPT-P" ), makeSymbol( "BOOLEANP" ) ) );
    $list46 = ConsesLow.list( makeSymbol( "FIXNUMP" ) );
    $sym47$GUARDIAN_REQUEST_ID_P = makeSymbol( "GUARDIAN-REQUEST-ID-P" );
    $list48 = ConsesLow.list( makeSymbol( "REQUEST-ID" ) );
    $str49$Determine_whether_this_is_a_prope = makeString( "Determine whether this is a proper guardian request id." );
    $list50 = ConsesLow.list( makeSymbol( "BOOLEANP" ) );
    $sym51$FIXNUMP = makeSymbol( "FIXNUMP" );
    $sym52$CANCEL_GUARDIAN_REQUEST = makeSymbol( "CANCEL-GUARDIAN-REQUEST" );
    $str53$Abort_a_guardian_request_that_is_ = makeString( "Abort a guardian request that is currently scheduled to be checked.\n   @return T" );
    $list54 = ConsesLow.list( ConsesLow.list( makeSymbol( "REQUEST-ID" ), makeSymbol( "FIXNUMP" ) ) );
    $list55 = ConsesLow.list( makeSymbol( "SYMBOLP" ) );
    $list56 = ConsesLow.list( ConsesLow.list( makeSymbol( "CHECKER-FN" ), makeSymbol( "PARAMETER" ), makeSymbol( "NOTIFICATION-FN" ) ), makeSymbol( "&BODY" ), makeSymbol( "BODY" ) );
    $sym57$REQUEST_ID = makeUninternedSymbol( "REQUEST-ID" );
    $sym58$PROGN = makeSymbol( "PROGN" );
    $list59 = ConsesLow.list( makeSymbol( "ENSURE-GUARDIAN-RUNNING" ) );
    $sym60$CLET = makeSymbol( "CLET" );
    $sym61$CUNWIND_PROTECT = makeSymbol( "CUNWIND-PROTECT" );
    $sym62$PWHEN = makeSymbol( "PWHEN" );
    $sym63$WITH_GUARDIAN_REQUEST = makeSymbol( "WITH-GUARDIAN-REQUEST" );
    $str64$Setup_a_guardian_request_and_canc = makeString( "Setup a guardian request and cancel if necessary." );
    $sym65$ACTIVE_GUARDIAN_REQUESTS = makeSymbol( "ACTIVE-GUARDIAN-REQUESTS" );
    $str66$The_active_guardian_requests_____ = makeString( "The active guardian requests.\n   @return 0 the elements on the request queue\n   @return 1 the UnivTime Stamp of the contents" );
    $str67$Currrently_no_guardian_active_ = makeString( "Currrently no guardian active." );
    $str68$Active_Guardian_Requests_at_ = makeString( "Active Guardian Requests at " );
    $sym69$INITIALIZE_GUARDIAN = makeSymbol( "INITIALIZE-GUARDIAN" );
    $str70$Starts_the_guardian_unless_it_is_ = makeString( "Starts the guardian unless it is running." );
    $sym71$_GUARDIAN_SHUTDOWN_MARKER_ = makeSymbol( "*GUARDIAN-SHUTDOWN-MARKER*" );
    $str72$Guardian_Shutdown_Marker = makeString( "Guardian Shutdown Marker" );
    $sym73$STOP_GUARDIAN = makeSymbol( "STOP-GUARDIAN" );
    $str74$Tell_the_guardian_to_shut_itself_ = makeString( "Tell the guardian to shut itself down." );
    $str75$Guardian_Process = makeString( "Guardian Process" );
    $sym76$GUARDIAN_HANDLER = makeSymbol( "GUARDIAN-HANDLER" );
    $sym77$START_GUARDIAN = makeSymbol( "START-GUARDIAN" );
    $str78$Launch_the_guardian_process__pote = makeString( "Launch the guardian process, potentially overwriting an existing " );
    $sym79$ENSURE_GUARDIAN_RUNNING = makeSymbol( "ENSURE-GUARDIAN-RUNNING" );
    $str80$Launch_the_guardian_process_if_it = makeString( "Launch the guardian process if it is not currently running." );
    $sym81$_GUARDIAN_SLEEP_MARKER_ = makeSymbol( "*GUARDIAN-SLEEP-MARKER*" );
    $str82$Guardian_Sleep_Marker = makeString( "Guardian Sleep Marker" );
    $str83$Connection_Guardian_Requests_ = makeString( "Connection Guardian Requests)" );
    $kw84$DELETE = makeKeyword( "DELETE" );
    $kw85$CHECK_FAILED = makeKeyword( "CHECK-FAILED" );
    $kw86$IGNORE_ERRORS_TARGET = makeKeyword( "IGNORE-ERRORS-TARGET" );
    $sym87$IGNORE_ERRORS_HANDLER = makeSymbol( "IGNORE-ERRORS-HANDLER", "SUBLISP" );
  }

  public static final class $guardian_request_native
      extends
        SubLStructNative
  {
    public SubLObject $id;
    public SubLObject $checker_fn;
    public SubLObject $parameter;
    public SubLObject $notification_fn;
    public SubLObject $interrupt_p;
    public SubLObject $process;
    private static final SubLStructDeclNative structDecl;

    public $guardian_request_native()
    {
      this.$id = CommonSymbols.NIL;
      this.$checker_fn = CommonSymbols.NIL;
      this.$parameter = CommonSymbols.NIL;
      this.$notification_fn = CommonSymbols.NIL;
      this.$interrupt_p = CommonSymbols.NIL;
      this.$process = CommonSymbols.NIL;
    }

    @Override
    public SubLStructDecl getStructDecl()
    {
      return $guardian_request_native.structDecl;
    }

    @Override
    public SubLObject getField2()
    {
      return this.$id;
    }

    @Override
    public SubLObject getField3()
    {
      return this.$checker_fn;
    }

    @Override
    public SubLObject getField4()
    {
      return this.$parameter;
    }

    @Override
    public SubLObject getField5()
    {
      return this.$notification_fn;
    }

    @Override
    public SubLObject getField6()
    {
      return this.$interrupt_p;
    }

    @Override
    public SubLObject getField7()
    {
      return this.$process;
    }

    @Override
    public SubLObject setField2(final SubLObject value)
    {
      return this.$id = value;
    }

    @Override
    public SubLObject setField3(final SubLObject value)
    {
      return this.$checker_fn = value;
    }

    @Override
    public SubLObject setField4(final SubLObject value)
    {
      return this.$parameter = value;
    }

    @Override
    public SubLObject setField5(final SubLObject value)
    {
      return this.$notification_fn = value;
    }

    @Override
    public SubLObject setField6(final SubLObject value)
    {
      return this.$interrupt_p = value;
    }

    @Override
    public SubLObject setField7(final SubLObject value)
    {
      return this.$process = value;
    }
    static
    {
      structDecl = Structures.makeStructDeclNative( $guardian_request_native.class, $sym3$GUARDIAN_REQUEST, $sym4$GUARDIAN_REQUEST_P, $list5, $list6, new String[] { "$id", "$checker_fn", "$parameter", "$notification_fn",
        "$interrupt_p", "$process"
      }, $list7, $list8, $sym9$PRINT_GUARDIAN_REQUEST );
    }
  }

  public static final class $guardian_request_p$UnaryFunction
      extends
        UnaryFunction
  {
    public $guardian_request_p$UnaryFunction()
    {
      super( SubLTranslatedFile.extractFunctionNamed( "GUARDIAN-REQUEST-P" ) );
    }

    @Override
    public SubLObject processItem(final SubLObject arg1)
    {
      return guardian_request_p( arg1 );
    }
  }
}
/*
 * 
 * Total time: 241 ms
 * 
 */