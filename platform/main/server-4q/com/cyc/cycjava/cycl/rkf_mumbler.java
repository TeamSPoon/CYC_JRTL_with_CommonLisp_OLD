package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class rkf_mumbler
    extends
      SubLTranslatedFile
{
  public static final SubLFile me;
  public static final String myName = "com.cyc.cycjava.cycl.rkf_mumbler";
  public static final String myFingerPrint = "e2001b71b765fd09641003d1390afe3dcc85fb702647a85b9b8240ff5334a947";
  @SubLTranslatedFile.SubL(source = "cycl/rkf-mumbler.lisp", position = 976L)
  public static SubLSymbol $rkf_default_mumble_address$;
  @SubLTranslatedFile.SubL(source = "cycl/rkf-mumbler.lisp", position = 2083L)
  private static SubLSymbol $rkf_event_to_mumble_listener$;
  private static final SubLSymbol $kw0$RKF_TRACE_EVENT;
  private static final SubLSymbol $kw1$RKF_BASE_EVENT;
  private static final SubLSymbol $kw2$SELF;
  private static final SubLList $list3;
  private static final SubLSymbol $sym4$CLET;
  private static final SubLSymbol $sym5$_RKF_DEFAULT_MUMBLE_ADDRESS_;
  private static final SubLSymbol $sym6$RKF_MAP_EVENT_TO_MUMBLE;

  @SubLTranslatedFile.SubL(source = "cycl/rkf-mumbler.lisp", position = 1080L)
  public static SubLObject rkf_with_my_mumblings(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list3 );
    final SubLObject temp = current.rest();
    current = current.first();
    SubLObject source = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list3 );
    source = current.first();
    current = current.rest();
    if( NIL == current )
    {
      final SubLObject body;
      current = ( body = temp );
      return ConsesLow.listS( $sym4$CLET, ConsesLow.list( ConsesLow.list( $sym5$_RKF_DEFAULT_MUMBLE_ADDRESS_, source ) ), ConsesLow.append( body, NIL ) );
    }
    cdestructuring_bind.cdestructuring_bind_error( datum, $list3 );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-mumbler.lisp", position = 1218L)
  public static SubLObject rkf_mumble(final SubLObject string, SubLObject source)
  {
    if( source == UNPROVIDED )
    {
      source = $rkf_default_mumble_address$.getDynamicValue();
    }
    final SubLObject event = event_model.new_event( $kw0$RKF_TRACE_EVENT, string, source );
    event_broker.post_event( event, rkf_event_dispatcher.current_rkf_event_broker() );
    return string;
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-mumbler.lisp", position = 1432L)
  public static SubLObject rkf_fetch_mumble(final SubLObject address)
  {
    return message_mailboxes.retrieve_mail_from_message_mailbox( address );
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-mumbler.lisp", position = 1530L)
  public static SubLObject rkf_ensure_mumble_address(final SubLObject address)
  {
    final SubLObject mbox_suite = message_mailboxes.current_message_mailbox_suite();
    message_mailboxes.ensure_message_mailbox_allocation( address, mbox_suite );
    return address;
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-mumbler.lisp", position = 1748L)
  public static SubLObject map_rkf_event_to_mailbox(final SubLObject event)
  {
    final SubLObject source = event_model.event_source( event );
    final SubLObject message = event_model.event_message( event );
    message_mailboxes.store_mail_in_message_mailbox( source, message, UNPROVIDED );
    return event;
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-mumbler.lisp", position = 1949L)
  public static SubLObject rkf_map_event_to_mumble(final SubLObject event, SubLObject params)
  {
    if( params == UNPROVIDED )
    {
      params = NIL;
    }
    map_rkf_event_to_mailbox( event );
    return event;
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-mumbler.lisp", position = 2329L)
  public static SubLObject ensure_rkf_event_to_mumble_ready(final SubLObject address)
  {
    rkf_event_dispatcher.ensure_rkf_event_dispatcher_running();
    rkf_ensure_mumble_address( address );
    return address;
  }

  public static SubLObject declare_rkf_mumbler_file()
  {
    SubLFiles.declareMacro( me, "rkf_with_my_mumblings", "RKF-WITH-MY-MUMBLINGS" );
    SubLFiles.declareFunction( me, "rkf_mumble", "RKF-MUMBLE", 1, 1, false );
    SubLFiles.declareFunction( me, "rkf_fetch_mumble", "RKF-FETCH-MUMBLE", 1, 0, false );
    SubLFiles.declareFunction( me, "rkf_ensure_mumble_address", "RKF-ENSURE-MUMBLE-ADDRESS", 1, 0, false );
    SubLFiles.declareFunction( me, "map_rkf_event_to_mailbox", "MAP-RKF-EVENT-TO-MAILBOX", 1, 0, false );
    SubLFiles.declareFunction( me, "rkf_map_event_to_mumble", "RKF-MAP-EVENT-TO-MUMBLE", 1, 1, false );
    SubLFiles.declareFunction( me, "ensure_rkf_event_to_mumble_ready", "ENSURE-RKF-EVENT-TO-MUMBLE-READY", 1, 0, false );
    return NIL;
  }

  public static SubLObject init_rkf_mumbler_file()
  {
    $rkf_default_mumble_address$ = SubLFiles.defparameter( "*RKF-DEFAULT-MUMBLE-ADDRESS*", $kw2$SELF );
    $rkf_event_to_mumble_listener$ = SubLFiles.deflexical( "*RKF-EVENT-TO-MUMBLE-LISTENER*", event_broker.describe_funcall_listener( $kw0$RKF_TRACE_EVENT, $sym6$RKF_MAP_EVENT_TO_MUMBLE, UNPROVIDED, UNPROVIDED ) );
    return NIL;
  }

  public static SubLObject setup_rkf_mumbler_file()
  {
    event_model.register_event_class( $kw0$RKF_TRACE_EVENT, $kw1$RKF_BASE_EVENT, NIL );
    rkf_event_dispatcher.register_listener_with_rkf_event_dispatcher( $rkf_event_to_mumble_listener$.getGlobalValue() );
    return NIL;
  }

  @Override
  public void declareFunctions()
  {
    declare_rkf_mumbler_file();
  }

  @Override
  public void initializeVariables()
  {
    init_rkf_mumbler_file();
  }

  @Override
  public void runTopLevelForms()
  {
    setup_rkf_mumbler_file();
  }
  static
  {
    me = new rkf_mumbler();
    $rkf_default_mumble_address$ = null;
    $rkf_event_to_mumble_listener$ = null;
    $kw0$RKF_TRACE_EVENT = makeKeyword( "RKF-TRACE-EVENT" );
    $kw1$RKF_BASE_EVENT = makeKeyword( "RKF-BASE-EVENT" );
    $kw2$SELF = makeKeyword( "SELF" );
    $list3 = ConsesLow.list( ConsesLow.list( makeSymbol( "SOURCE" ) ), makeSymbol( "&BODY" ), makeSymbol( "BODY" ) );
    $sym4$CLET = makeSymbol( "CLET" );
    $sym5$_RKF_DEFAULT_MUMBLE_ADDRESS_ = makeSymbol( "*RKF-DEFAULT-MUMBLE-ADDRESS*" );
    $sym6$RKF_MAP_EVENT_TO_MUMBLE = makeSymbol( "RKF-MAP-EVENT-TO-MUMBLE" );
  }
}
/*
 * 
 * Total time: 18 ms
 * 
 */