//
//
package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Locks;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class assertions_interface
    extends
      SubLTranslatedFile
{
  public static final SubLFile me;
  public static final String myName = "com.cyc.cycjava.cycl.assertions_interface";
  public static final String myFingerPrint = "dc6ff8bab78d13a180567f904188cb2813711edc63051f8f26b2ebddf1acb8ed";
  private static final SubLSymbol $sym0$CNF_P;
  private static final SubLSymbol $sym1$HLMT_P;
  private static final SubLSymbol $sym2$LISTP;
  private static final SubLSymbol $sym3$DIRECTION_P;
  private static final SubLSymbol $sym4$TRUTH_P;
  private static final SubLSymbol $sym5$EL_STRENGTH_P;
  private static final SubLSymbol $sym6$ASSERTED_ARGUMENT_P;
  private static final SubLSymbol $sym7$KB_CREATE_ASSERTION;
  private static final SubLSymbol $sym8$_EXIT;
  private static final SubLList $list9;
  private static final SubLString $str10$Create_a_new_assertion_with_CNF_i;
  private static final SubLList $list11;
  private static final SubLList $list12;
  private static final SubLSymbol $sym13$KB_CREATE_ASSERTION_KB_STORE;
  private static final SubLSymbol $sym14$ASSERTION_P;
  private static final SubLSymbol $sym15$KB_REMOVE_ASSERTION;
  private static final SubLSymbol $sym16$QUOTE;
  private static final SubLList $list17;
  private static final SubLString $str18$Remove_ASSERTION_from_the_KB_;
  private static final SubLList $list19;
  private static final SubLList $list20;
  private static final SubLSymbol $sym21$KB_ASSERTION_CNF;
  private static final SubLString $str22$Return_the_CNF_for_ASSERTION_;
  private static final SubLList $list23;
  private static final SubLSymbol $sym24$KB_POSSIBLY_ASSERTION_CNF;
  private static final SubLString $str25$Return_the_CNF_for_ASSERTION_or_N;
  private static final SubLList $list26;
  private static final SubLSymbol $sym27$KB_ASSERTION_MT;
  private static final SubLString $str28$Return_the_MT_for_ASSERTION_;
  private static final SubLList $list29;
  private static final SubLSymbol $sym30$POSSIBLY_HLMT_P;
  private static final SubLSymbol $sym31$KB_LOOKUP_ASSERTION;
  private static final SubLList $list32;
  private static final SubLString $str33$Return_the_assertion_with_CNF_and;
  private static final SubLList $list34;
  private static final SubLList $list35;
  private static final SubLSymbol $sym36$KB_GAF_ASSERTION_;
  private static final SubLString $str37$Return_T_iff_ASSERTION_is_a_groun;
  private static final SubLList $list38;
  private static final SubLSymbol $sym39$KB_RULE_ASSERTION_;
  private static final SubLSymbol $sym40$KB_ASSERTION_GAF_HL_FORMULA;
  private static final SubLString $str41$Returns_the_HL_clause_of_ASSERTIO;
  private static final SubLList $list42;
  private static final SubLSymbol $sym43$KB_ASSERTION_CONS;
  private static final SubLString $str44$Returns_a_CNF_or_GAF_HL_formula_;
  private static final SubLList $list45;
  private static final SubLSymbol $sym46$KB_ASSERTION_DIRECTION;
  private static final SubLString $str47$Return_the_direction_of_ASSERTION;
  private static final SubLList $list48;
  private static final SubLSymbol $sym49$KB_ASSERTION_TRUTH;
  private static final SubLString $str50$Return_the_current_truth_of_ASSER;
  private static final SubLList $list51;
  private static final SubLSymbol $sym52$KB_ASSERTION_STRENGTH;
  private static final SubLString $str53$Return_the_current_argumentation_;
  private static final SubLList $list54;
  private static final SubLSymbol $sym55$KB_ASSERTION_VARIABLE_NAMES;
  private static final SubLString $str56$Return_the_variable_names_for_ASS;
  private static final SubLList $list57;
  private static final SubLSymbol $sym58$KB_ASSERTION_ASSERTED_BY;
  private static final SubLString $str59$Return_the_asserted_by_bookkeepin;
  private static final SubLList $list60;
  private static final SubLSymbol $sym61$KB_ASSERTION_ASSERTED_WHEN;
  private static final SubLString $str62$Return_the_asserted_when_bookkeep;
  private static final SubLList $list63;
  private static final SubLSymbol $sym64$KB_ASSERTION_ASSERTED_WHY;
  private static final SubLString $str65$Return_the_asserted_why_bookkeepi;
  private static final SubLSymbol $sym66$KB_ASSERTION_ASSERTED_SECOND;
  private static final SubLString $str67$Return_the_asserted_second_bookke;
  private static final SubLList $list68;
  private static final SubLSymbol $sym69$KB_SET_ASSERTION_DIRECTION;
  private static final SubLList $list70;
  private static final SubLString $str71$Change_direction_of_ASSERTION_to_;
  private static final SubLList $list72;
  private static final SubLSymbol $sym73$KB_SET_ASSERTION_TRUTH;
  private static final SubLList $list74;
  private static final SubLString $str75$Change_the_truth_of_ASSERTION_to_;
  private static final SubLList $list76;
  private static final SubLSymbol $sym77$KB_SET_ASSERTION_STRENGTH;
  private static final SubLList $list78;
  private static final SubLString $str79$Change_the_strength_of_ASSERTION_;
  private static final SubLList $list80;
  private static final SubLSymbol $sym81$KB_SET_ASSERTION_VARIABLE_NAMES;
  private static final SubLList $list82;
  private static final SubLString $str83$Change_the_variable_names_for_ASS;
  private static final SubLList $list84;
  private static final SubLSymbol $kw85$UNCHANGED;
  private static final SubLSymbol $sym86$ASSERTION_WHO_P;
  private static final SubLSymbol $sym87$ASSERTION_WHEN_P;
  private static final SubLSymbol $sym88$ASSERTION_WHY_P;
  private static final SubLSymbol $sym89$ASSERTION_SECOND_P;
  private static final SubLSymbol $sym90$KB_TIMESTAMP_ASSERTED_ASSERTION;
  private static final SubLList $list91;
  private static final SubLString $str92$Set_meta_data_on_ASSERTION_;
  private static final SubLList $list93;
  private static final SubLSymbol $sym94$KB_ASSERTION_ARGUMENTS;
  private static final SubLString $str95$Return_the_arguments_for_ASSERTIO;
  private static final SubLSymbol $sym96$KB_LOOKUP_ASSERTED_ARGUMENT;
  private static final SubLList $list97;
  private static final SubLString $str98$Return_the_asserted_argument_with;
  private static final SubLList $list99;
  private static final SubLList $list100;
  private static final SubLSymbol $sym101$KB_CREATE_ASSERTED_ARGUMENT;
  private static final SubLString $str102$Create_an_asserted_argument_for_A;
  private static final SubLList $list103;
  private static final SubLSymbol $sym104$KB_REMOVE_ASSERTED_ARGUMENT;
  private static final SubLList $list105;
  private static final SubLString $str106$Remove_ASSERTED_ARGUMENT_for_ASSE;
  private static final SubLList $list107;
  private static final SubLSymbol $sym108$KB_ASSERTION_DEPENDENTS;
  private static final SubLString $str109$Return_the_dependents_of_ASSERTIO;
  private static final SubLList $list110;
  static boolean assertionsDisabled = true;

  @SubLTranslatedFile.SubL(source = "cycl/assertions-interface.lisp", position = 1630L)
  public static SubLObject kb_create_assertion(final SubLObject cnf, final SubLObject mt, final SubLObject variable_names, final SubLObject direction, final SubLObject truth, final SubLObject strength,
      final SubLObject asserted_argument)
  {
    enforceType( cnf, $sym0$CNF_P );
    enforceType( mt, $sym1$HLMT_P );
    enforceType( variable_names, $sym2$LISTP );
    enforceType( direction, $sym3$DIRECTION_P );
    enforceType( truth, $sym4$TRUTH_P );
    enforceType( strength, $sym5$EL_STRENGTH_P );
    if( NIL != asserted_argument )
    {
      enforceType( asserted_argument, $sym6$ASSERTED_ARGUMENT_P );
    }
    hl_interface_infrastructure.define_hl_modifier_preamble();
    hl_interface_infrastructure.note_hl_modifier_invocation( $sym7$KB_CREATE_ASSERTION, cnf, mt, variable_names, direction, truth, strength, asserted_argument );
    if( NIL != hl_interface_infrastructure.hl_modify_anywhereP() )
    {
      SubLObject release = NIL;
      try
      {
        release = Locks.seize_lock( control_vars.$hl_lock$.getGlobalValue() );
        final SubLObject assertion = ( NIL != hl_interface_infrastructure.hl_modify_remoteP() ) ? kb_create_assertion_remote( cnf, mt, variable_names, direction, truth, strength, asserted_argument )
            : kb_create_assertion_local( cnf, mt, variable_names, direction, truth, strength, asserted_argument );
        hl_transcript_tracing.note_hlt_find_or_create_assertion( assertion );
        hl_interface_infrastructure.define_hl_modifier_postamble();
        return assertion;
      }
      finally
      {
        if( NIL != release )
        {
          Locks.release_lock( control_vars.$hl_lock$.getGlobalValue() );
        }
      }
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/assertions-interface.lisp", position = 2414L)
  public static SubLObject kb_create_assertion_remote(final SubLObject cnf, final SubLObject mt, final SubLObject variable_names, final SubLObject direction, final SubLObject truth, final SubLObject strength,
      final SubLObject asserted_argument)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject internal_id = hl_interface_infrastructure.hl_store_remote_eval( ConsesLow.list( $sym13$KB_CREATE_ASSERTION_KB_STORE, list_utilities.quotify( cnf ), list_utilities.quotify( mt ), list_utilities
        .quotify( variable_names ), list_utilities.quotify( direction ), list_utilities.quotify( truth ), list_utilities.quotify( strength ), list_utilities.quotify( asserted_argument ) ) );
    SubLObject assertion = NIL;
    final SubLObject _prev_bind_0 = hl_interface_infrastructure.$override_hl_store_remote_accessP$.currentBinding( thread );
    try
    {
      hl_interface_infrastructure.$override_hl_store_remote_accessP$.bind( T, thread );
      assertion = assertions_low.kb_create_assertion_cyc( internal_id );
      if( NIL != hl_interface_infrastructure.hl_modify_localP() )
      {
        assertions_low.kb_create_assertion_int( assertion, internal_id, cnf, mt, variable_names, direction, truth, strength, asserted_argument );
      }
    }
    finally
    {
      hl_interface_infrastructure.$override_hl_store_remote_accessP$.rebind( _prev_bind_0, thread );
    }
    return assertion;
  }

  @SubLTranslatedFile.SubL(source = "cycl/assertions-interface.lisp", position = 3183L)
  public static SubLObject kb_create_assertion_local(final SubLObject cnf, final SubLObject mt, final SubLObject variable_names, final SubLObject direction, final SubLObject truth, final SubLObject strength,
      final SubLObject asserted_argument)
  {
    final SubLObject internal_id = assertions_low.kb_create_assertion_kb_store( cnf, mt, variable_names, direction, truth, strength, asserted_argument );
    return assertion_handles.find_assertion_by_id( internal_id );
  }

  @SubLTranslatedFile.SubL(source = "cycl/assertions-interface.lisp", position = 3741L)
  public static SubLObject kb_remove_assertion(final SubLObject assertion)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    enforceType( assertion, $sym14$ASSERTION_P );
    SubLObject result = NIL;
    hl_interface_infrastructure.define_hl_modifier_preamble();
    hl_interface_infrastructure.note_hl_modifier_invocation( $sym15$KB_REMOVE_ASSERTION, assertion, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
    if( NIL != hl_interface_infrastructure.hl_modify_remoteP() )
    {
      result = hl_interface_infrastructure.hl_store_remote_eval( ConsesLow.list( $sym15$KB_REMOVE_ASSERTION, ConsesLow.list( $sym16$QUOTE, assertion ) ) );
    }
    if( NIL != hl_interface_infrastructure.hl_modify_localP() )
    {
      final SubLObject _prev_bind_0 = hl_interface_infrastructure.$override_hl_store_remote_accessP$.currentBinding( thread );
      try
      {
        hl_interface_infrastructure.$override_hl_store_remote_accessP$.bind( T, thread );
        SubLObject release = NIL;
        try
        {
          release = Locks.seize_lock( control_vars.$hl_lock$.getGlobalValue() );
          return assertions_low.kb_remove_assertion_internal( assertion );
        }
        finally
        {
          if( NIL != release )
          {
            Locks.release_lock( control_vars.$hl_lock$.getGlobalValue() );
          }
        }
      }
      finally
      {
        hl_interface_infrastructure.$override_hl_store_remote_accessP$.rebind( _prev_bind_0, thread );
      }
    }
    return result;
  }

  @SubLTranslatedFile.SubL(source = "cycl/assertions-interface.lisp", position = 4439L)
  public static SubLObject kb_assertion_cnf(final SubLObject assertion)
  {
    enforceType( assertion, $sym14$ASSERTION_P );
    if( NIL != hl_interface_infrastructure.hl_access_remoteP() )
    {
      return hl_interface_infrastructure.hl_store_remote_eval( ConsesLow.list( $sym21$KB_ASSERTION_CNF, ConsesLow.list( $sym16$QUOTE, assertion ) ) );
    }
    return assertions_low.assertion_cnf_internal( assertion );
  }

  @SubLTranslatedFile.SubL(source = "cycl/assertions-interface.lisp", position = 4903L)
  public static SubLObject kb_possibly_assertion_cnf(final SubLObject assertion)
  {
    enforceType( assertion, $sym14$ASSERTION_P );
    if( NIL != hl_interface_infrastructure.hl_access_remoteP() )
    {
      return hl_interface_infrastructure.hl_store_remote_eval( ConsesLow.list( $sym24$KB_POSSIBLY_ASSERTION_CNF, ConsesLow.list( $sym16$QUOTE, assertion ) ) );
    }
    return assertions_low.possibly_assertion_cnf_internal( assertion );
  }

  @SubLTranslatedFile.SubL(source = "cycl/assertions-interface.lisp", position = 5326L)
  public static SubLObject kb_assertion_mt(final SubLObject assertion)
  {
    enforceType( assertion, $sym14$ASSERTION_P );
    if( NIL != hl_interface_infrastructure.hl_access_remoteP() )
    {
      return hl_interface_infrastructure.hl_store_remote_eval( ConsesLow.list( $sym27$KB_ASSERTION_MT, ConsesLow.list( $sym16$QUOTE, assertion ) ) );
    }
    return assertions_low.assertion_mt_internal( assertion );
  }

  @SubLTranslatedFile.SubL(source = "cycl/assertions-interface.lisp", position = 5703L)
  public static SubLObject kb_lookup_assertion(final SubLObject cnf, final SubLObject mt)
  {
    enforceType( cnf, $sym0$CNF_P );
    enforceType( mt, $sym30$POSSIBLY_HLMT_P );
    if( NIL != hl_interface_infrastructure.hl_access_remoteP() )
    {
      return hl_interface_infrastructure.hl_store_remote_eval( ConsesLow.list( $sym31$KB_LOOKUP_ASSERTION, ConsesLow.list( $sym16$QUOTE, cnf ), ConsesLow.list( $sym16$QUOTE, mt ) ) );
    }
    return kb_indexing.find_assertion_internal( cnf, mt );
  }

  @SubLTranslatedFile.SubL(source = "cycl/assertions-interface.lisp", position = 6157L)
  public static SubLObject kb_gaf_assertionP(final SubLObject assertion)
  {
    enforceType( assertion, $sym14$ASSERTION_P );
    if( NIL != hl_interface_infrastructure.hl_access_remoteP() )
    {
      return hl_interface_infrastructure.hl_store_remote_eval( ConsesLow.list( $sym36$KB_GAF_ASSERTION_, ConsesLow.list( $sym16$QUOTE, assertion ) ) );
    }
    return assertions_low.assertion_gaf_p( assertion );
  }

  @SubLTranslatedFile.SubL(source = "cycl/assertions-interface.lisp", position = 6654L)
  public static SubLObject kb_rule_assertionP(final SubLObject assertion)
  {
    enforceType( assertion, $sym14$ASSERTION_P );
    if( NIL != hl_interface_infrastructure.hl_access_remoteP() )
    {
      return hl_interface_infrastructure.hl_store_remote_eval( ConsesLow.list( $sym39$KB_RULE_ASSERTION_, ConsesLow.list( $sym16$QUOTE, assertion ) ) );
    }
    return assertions_low.assertion_rule_p( assertion );
  }

  @SubLTranslatedFile.SubL(source = "cycl/assertions-interface.lisp", position = 7060L)
  public static SubLObject kb_assertion_gaf_hl_formula(final SubLObject assertion)
  {
    enforceType( assertion, $sym14$ASSERTION_P );
    if( NIL != hl_interface_infrastructure.hl_access_remoteP() )
    {
      return hl_interface_infrastructure.hl_store_remote_eval( ConsesLow.list( $sym40$KB_ASSERTION_GAF_HL_FORMULA, ConsesLow.list( $sym16$QUOTE, assertion ) ) );
    }
    return assertions_low.assertion_gaf_hl_formula_internal( assertion );
  }

  @SubLTranslatedFile.SubL(source = "cycl/assertions-interface.lisp", position = 7823L)
  public static SubLObject kb_assertion_cons(final SubLObject assertion)
  {
    enforceType( assertion, $sym14$ASSERTION_P );
    if( NIL != hl_interface_infrastructure.hl_access_remoteP() )
    {
      return hl_interface_infrastructure.hl_store_remote_eval( ConsesLow.list( $sym43$KB_ASSERTION_CONS, ConsesLow.list( $sym16$QUOTE, assertion ) ) );
    }
    return assertions_low.assertion_cons_internal( assertion );
  }

  @SubLTranslatedFile.SubL(source = "cycl/assertions-interface.lisp", position = 8264L)
  public static SubLObject kb_assertion_direction(final SubLObject assertion)
  {
    enforceType( assertion, $sym14$ASSERTION_P );
    if( NIL != hl_interface_infrastructure.hl_access_remoteP() )
    {
      return hl_interface_infrastructure.hl_store_remote_eval( ConsesLow.list( $sym46$KB_ASSERTION_DIRECTION, ConsesLow.list( $sym16$QUOTE, assertion ) ) );
    }
    return assertions_low.assertion_direction_internal( assertion );
  }

  @SubLTranslatedFile.SubL(source = "cycl/assertions-interface.lisp", position = 8747L)
  public static SubLObject kb_assertion_truth(final SubLObject assertion)
  {
    enforceType( assertion, $sym14$ASSERTION_P );
    if( NIL != hl_interface_infrastructure.hl_access_remoteP() )
    {
      return hl_interface_infrastructure.hl_store_remote_eval( ConsesLow.list( $sym49$KB_ASSERTION_TRUTH, ConsesLow.list( $sym16$QUOTE, assertion ) ) );
    }
    return assertions_low.assertion_truth_internal( assertion );
  }

  @SubLTranslatedFile.SubL(source = "cycl/assertions-interface.lisp", position = 9205L)
  public static SubLObject kb_assertion_strength(final SubLObject assertion)
  {
    enforceType( assertion, $sym14$ASSERTION_P );
    if( NIL != hl_interface_infrastructure.hl_access_remoteP() )
    {
      return hl_interface_infrastructure.hl_store_remote_eval( ConsesLow.list( $sym52$KB_ASSERTION_STRENGTH, ConsesLow.list( $sym16$QUOTE, assertion ) ) );
    }
    return assertions_low.assertion_strength_internal( assertion );
  }

  @SubLTranslatedFile.SubL(source = "cycl/assertions-interface.lisp", position = 9711L)
  public static SubLObject kb_assertion_variable_names(final SubLObject assertion)
  {
    enforceType( assertion, $sym14$ASSERTION_P );
    if( NIL != hl_interface_infrastructure.hl_access_remoteP() )
    {
      return hl_interface_infrastructure.hl_store_remote_eval( ConsesLow.list( $sym55$KB_ASSERTION_VARIABLE_NAMES, ConsesLow.list( $sym16$QUOTE, assertion ) ) );
    }
    return assertions_low.assertion_variable_names_internal( assertion );
  }

  @SubLTranslatedFile.SubL(source = "cycl/assertions-interface.lisp", position = 10155L)
  public static SubLObject kb_assertion_asserted_by(final SubLObject assertion)
  {
    enforceType( assertion, $sym14$ASSERTION_P );
    if( NIL != hl_interface_infrastructure.hl_access_remoteP() )
    {
      return hl_interface_infrastructure.hl_store_remote_eval( ConsesLow.list( $sym58$KB_ASSERTION_ASSERTED_BY, ConsesLow.list( $sym16$QUOTE, assertion ) ) );
    }
    return assertions_low.asserted_by_internal( assertion );
  }

  @SubLTranslatedFile.SubL(source = "cycl/assertions-interface.lisp", position = 10602L)
  public static SubLObject kb_assertion_asserted_when(final SubLObject assertion)
  {
    enforceType( assertion, $sym14$ASSERTION_P );
    if( NIL != hl_interface_infrastructure.hl_access_remoteP() )
    {
      return hl_interface_infrastructure.hl_store_remote_eval( ConsesLow.list( $sym61$KB_ASSERTION_ASSERTED_WHEN, ConsesLow.list( $sym16$QUOTE, assertion ) ) );
    }
    return assertions_low.asserted_when_internal( assertion );
  }

  @SubLTranslatedFile.SubL(source = "cycl/assertions-interface.lisp", position = 11050L)
  public static SubLObject kb_assertion_asserted_why(final SubLObject assertion)
  {
    enforceType( assertion, $sym14$ASSERTION_P );
    if( NIL != hl_interface_infrastructure.hl_access_remoteP() )
    {
      return hl_interface_infrastructure.hl_store_remote_eval( ConsesLow.list( $sym64$KB_ASSERTION_ASSERTED_WHY, ConsesLow.list( $sym16$QUOTE, assertion ) ) );
    }
    return assertions_low.asserted_why_internal( assertion );
  }

  @SubLTranslatedFile.SubL(source = "cycl/assertions-interface.lisp", position = 11484L)
  public static SubLObject kb_assertion_asserted_second(final SubLObject assertion)
  {
    enforceType( assertion, $sym14$ASSERTION_P );
    if( NIL != hl_interface_infrastructure.hl_access_remoteP() )
    {
      return hl_interface_infrastructure.hl_store_remote_eval( ConsesLow.list( $sym66$KB_ASSERTION_ASSERTED_SECOND, ConsesLow.list( $sym16$QUOTE, assertion ) ) );
    }
    return assertions_low.asserted_second_internal( assertion );
  }

  @SubLTranslatedFile.SubL(source = "cycl/assertions-interface.lisp", position = 11942L)
  public static SubLObject kb_set_assertion_direction(final SubLObject assertion, final SubLObject new_direction)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    enforceType( assertion, $sym14$ASSERTION_P );
    enforceType( new_direction, $sym3$DIRECTION_P );
    SubLObject result = NIL;
    hl_interface_infrastructure.define_hl_modifier_preamble();
    hl_interface_infrastructure.note_hl_modifier_invocation( $sym69$KB_SET_ASSERTION_DIRECTION, assertion, new_direction, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
    if( NIL != hl_interface_infrastructure.hl_modify_remoteP() )
    {
      result = hl_interface_infrastructure.hl_store_remote_eval( ConsesLow.list( $sym69$KB_SET_ASSERTION_DIRECTION, ConsesLow.list( $sym16$QUOTE, assertion ), ConsesLow.list( $sym16$QUOTE, new_direction ) ) );
    }
    if( NIL != hl_interface_infrastructure.hl_modify_localP() )
    {
      final SubLObject _prev_bind_0 = hl_interface_infrastructure.$override_hl_store_remote_accessP$.currentBinding( thread );
      try
      {
        hl_interface_infrastructure.$override_hl_store_remote_accessP$.bind( T, thread );
        SubLObject release = NIL;
        try
        {
          release = Locks.seize_lock( control_vars.$hl_lock$.getGlobalValue() );
          final SubLObject old_direction = assertions_high.assertion_direction( assertion );
          final SubLObject result_$1 = assertions_low.kb_set_assertion_direction_internal( assertion, new_direction );
          kb_modification_event.post_kb_modify_set_assertion_direction_event( assertion, old_direction, new_direction );
          return result_$1;
        }
        finally
        {
          if( NIL != release )
          {
            Locks.release_lock( control_vars.$hl_lock$.getGlobalValue() );
          }
        }
      }
      finally
      {
        hl_interface_infrastructure.$override_hl_store_remote_accessP$.rebind( _prev_bind_0, thread );
      }
    }
    return result;
  }

  @SubLTranslatedFile.SubL(source = "cycl/assertions-interface.lisp", position = 12695L)
  public static SubLObject kb_set_assertion_truth(final SubLObject assertion, final SubLObject new_truth)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    enforceType( assertion, $sym14$ASSERTION_P );
    enforceType( new_truth, $sym4$TRUTH_P );
    SubLObject result = NIL;
    hl_interface_infrastructure.define_hl_modifier_preamble();
    hl_interface_infrastructure.note_hl_modifier_invocation( $sym73$KB_SET_ASSERTION_TRUTH, assertion, new_truth, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
    if( NIL != hl_interface_infrastructure.hl_modify_remoteP() )
    {
      result = hl_interface_infrastructure.hl_store_remote_eval( ConsesLow.list( $sym73$KB_SET_ASSERTION_TRUTH, ConsesLow.list( $sym16$QUOTE, assertion ), ConsesLow.list( $sym16$QUOTE, new_truth ) ) );
    }
    if( NIL != hl_interface_infrastructure.hl_modify_localP() )
    {
      final SubLObject _prev_bind_0 = hl_interface_infrastructure.$override_hl_store_remote_accessP$.currentBinding( thread );
      try
      {
        hl_interface_infrastructure.$override_hl_store_remote_accessP$.bind( T, thread );
        SubLObject release = NIL;
        try
        {
          release = Locks.seize_lock( control_vars.$hl_lock$.getGlobalValue() );
          final SubLObject old_truth = assertions_high.assertion_truth( assertion );
          final SubLObject result_$2 = assertions_low.reset_assertion_truth( assertion, new_truth );
          kb_modification_event.post_kb_modify_set_assertion_truth_event( assertion, old_truth, new_truth );
          return result_$2;
        }
        finally
        {
          if( NIL != release )
          {
            Locks.release_lock( control_vars.$hl_lock$.getGlobalValue() );
          }
        }
      }
      finally
      {
        hl_interface_infrastructure.$override_hl_store_remote_accessP$.rebind( _prev_bind_0, thread );
      }
    }
    return result;
  }

  @SubLTranslatedFile.SubL(source = "cycl/assertions-interface.lisp", position = 13348L)
  public static SubLObject kb_set_assertion_strength(final SubLObject assertion, final SubLObject new_strength)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    enforceType( assertion, $sym14$ASSERTION_P );
    enforceType( new_strength, $sym5$EL_STRENGTH_P );
    SubLObject result = NIL;
    hl_interface_infrastructure.define_hl_modifier_preamble();
    hl_interface_infrastructure.note_hl_modifier_invocation( $sym77$KB_SET_ASSERTION_STRENGTH, assertion, new_strength, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
    if( NIL != hl_interface_infrastructure.hl_modify_remoteP() )
    {
      result = hl_interface_infrastructure.hl_store_remote_eval( ConsesLow.list( $sym77$KB_SET_ASSERTION_STRENGTH, ConsesLow.list( $sym16$QUOTE, assertion ), ConsesLow.list( $sym16$QUOTE, new_strength ) ) );
    }
    if( NIL != hl_interface_infrastructure.hl_modify_localP() )
    {
      final SubLObject _prev_bind_0 = hl_interface_infrastructure.$override_hl_store_remote_accessP$.currentBinding( thread );
      try
      {
        hl_interface_infrastructure.$override_hl_store_remote_accessP$.bind( T, thread );
        SubLObject release = NIL;
        try
        {
          release = Locks.seize_lock( control_vars.$hl_lock$.getGlobalValue() );
          final SubLObject old_strength = assertions_high.assertion_strength( assertion );
          final SubLObject result_$3 = assertions_low.reset_assertion_strength( assertion, new_strength );
          kb_modification_event.post_kb_modify_set_assertion_strength_event( assertion, old_strength, new_strength );
          return result_$3;
        }
        finally
        {
          if( NIL != release )
          {
            Locks.release_lock( control_vars.$hl_lock$.getGlobalValue() );
          }
        }
      }
      finally
      {
        hl_interface_infrastructure.$override_hl_store_remote_accessP$.rebind( _prev_bind_0, thread );
      }
    }
    return result;
  }

  @SubLTranslatedFile.SubL(source = "cycl/assertions-interface.lisp", position = 14052L)
  public static SubLObject kb_set_assertion_variable_names(final SubLObject assertion, final SubLObject new_variable_names)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    enforceType( assertion, $sym14$ASSERTION_P );
    enforceType( new_variable_names, $sym2$LISTP );
    SubLObject result = NIL;
    hl_interface_infrastructure.define_hl_modifier_preamble();
    hl_interface_infrastructure.note_hl_modifier_invocation( $sym81$KB_SET_ASSERTION_VARIABLE_NAMES, assertion, new_variable_names, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
    if( NIL != hl_interface_infrastructure.hl_modify_remoteP() )
    {
      result = hl_interface_infrastructure.hl_store_remote_eval( ConsesLow.list( $sym81$KB_SET_ASSERTION_VARIABLE_NAMES, ConsesLow.list( $sym16$QUOTE, assertion ), ConsesLow.list( $sym16$QUOTE, new_variable_names ) ) );
    }
    if( NIL != hl_interface_infrastructure.hl_modify_localP() )
    {
      final SubLObject _prev_bind_0 = hl_interface_infrastructure.$override_hl_store_remote_accessP$.currentBinding( thread );
      try
      {
        hl_interface_infrastructure.$override_hl_store_remote_accessP$.bind( T, thread );
        SubLObject release = NIL;
        try
        {
          release = Locks.seize_lock( control_vars.$hl_lock$.getGlobalValue() );
          hl_transcript_tracing.note_hlt_rename_variables( assertion, new_variable_names );
          final SubLObject old_var_names = assertions_high.assertion_variable_names( assertion );
          final SubLObject result_$4 = assertions_low.reset_assertion_variable_names( assertion, new_variable_names );
          kb_modification_event.post_kb_modify_set_assertion_variable_names_event( assertion, old_var_names, new_variable_names );
          return result_$4;
        }
        finally
        {
          if( NIL != release )
          {
            Locks.release_lock( control_vars.$hl_lock$.getGlobalValue() );
          }
        }
      }
      finally
      {
        hl_interface_infrastructure.$override_hl_store_remote_accessP$.rebind( _prev_bind_0, thread );
      }
    }
    return result;
  }

  @SubLTranslatedFile.SubL(source = "cycl/assertions-interface.lisp", position = 14879L)
  public static SubLObject assertion_who_p(final SubLObject who)
  {
    return makeBoolean( NIL == who || who == $kw85$UNCHANGED || NIL != forts.fort_p( who ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/assertions-interface.lisp", position = 14979L)
  public static SubLObject assertion_when_p(final SubLObject when)
  {
    return makeBoolean( NIL == when || when == $kw85$UNCHANGED || NIL != numeric_date_utilities.universal_date_p( when ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/assertions-interface.lisp", position = 15094L)
  public static SubLObject assertion_why_p(final SubLObject why)
  {
    return makeBoolean( NIL == why || why == $kw85$UNCHANGED || NIL != forts.fort_p( why ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/assertions-interface.lisp", position = 15194L)
  public static SubLObject assertion_second_p(final SubLObject second)
  {
    return makeBoolean( NIL == second || second == $kw85$UNCHANGED || NIL != numeric_date_utilities.universal_second_p( second ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/assertions-interface.lisp", position = 15321L)
  public static SubLObject kb_timestamp_asserted_assertion(final SubLObject assertion, final SubLObject who, final SubLObject when, final SubLObject why, final SubLObject second)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    enforceType( assertion, $sym14$ASSERTION_P );
    enforceType( who, $sym86$ASSERTION_WHO_P );
    enforceType( when, $sym87$ASSERTION_WHEN_P );
    enforceType( why, $sym88$ASSERTION_WHY_P );
    enforceType( second, $sym89$ASSERTION_SECOND_P );
    SubLObject result = NIL;
    hl_interface_infrastructure.define_hl_modifier_preamble();
    hl_interface_infrastructure.note_hl_modifier_invocation( $sym90$KB_TIMESTAMP_ASSERTED_ASSERTION, assertion, who, when, why, second, UNPROVIDED, UNPROVIDED );
    if( NIL != hl_interface_infrastructure.hl_modify_remoteP() )
    {
      result = hl_interface_infrastructure.hl_store_remote_eval( ConsesLow.list( $sym90$KB_TIMESTAMP_ASSERTED_ASSERTION, ConsesLow.list( $sym16$QUOTE, assertion ), ConsesLow.list( $sym16$QUOTE, who ), ConsesLow.list(
          $sym16$QUOTE, when ), ConsesLow.list( $sym16$QUOTE, why ), ConsesLow.list( $sym16$QUOTE, second ) ) );
    }
    if( NIL != hl_interface_infrastructure.hl_modify_localP() )
    {
      final SubLObject _prev_bind_0 = hl_interface_infrastructure.$override_hl_store_remote_accessP$.currentBinding( thread );
      try
      {
        hl_interface_infrastructure.$override_hl_store_remote_accessP$.bind( T, thread );
        SubLObject release = NIL;
        try
        {
          release = Locks.seize_lock( control_vars.$hl_lock$.getGlobalValue() );
          if( NIL != assertions_high.asserted_assertionP( assertion ) )
          {
            if( who != $kw85$UNCHANGED && !assertions_high.asserted_by( assertion ).equal( who ) )
            {
              set_assertion_asserted_by_int( assertion, who );
            }
            if( when != $kw85$UNCHANGED && !assertions_high.asserted_when( assertion ).equal( when ) )
            {
              set_assertion_asserted_when_int( assertion, when );
            }
            if( why != $kw85$UNCHANGED && !assertions_high.asserted_why( assertion ).equal( why ) )
            {
              set_assertion_asserted_why_int( assertion, why );
            }
            if( second != $kw85$UNCHANGED && !assertions_high.asserted_second( assertion ).equal( second ) )
            {
              set_assertion_asserted_second_int( assertion, second );
            }
          }
          hl_transcript_tracing.note_hlt_timestamp_assertion( assertion );
          return assertion;
        }
        finally
        {
          if( NIL != release )
          {
            Locks.release_lock( control_vars.$hl_lock$.getGlobalValue() );
          }
        }
      }
      finally
      {
        hl_interface_infrastructure.$override_hl_store_remote_accessP$.rebind( _prev_bind_0, thread );
      }
    }
    return result;
  }

  @SubLTranslatedFile.SubL(source = "cycl/assertions-interface.lisp", position = 16629L)
  public static SubLObject set_assertion_asserted_by_int(final SubLObject assertion, final SubLObject assertor)
  {
    final SubLObject old_assertor = assertions_high.asserted_by( assertion );
    final SubLObject result = assertions_low.set_assertion_asserted_by( assertion, assertor );
    kb_modification_event.post_kb_modify_set_assertion_asserted_by_event( assertion, old_assertor, assertor );
    return result;
  }

  @SubLTranslatedFile.SubL(source = "cycl/assertions-interface.lisp", position = 17022L)
  public static SubLObject set_assertion_asserted_when_int(final SubLObject assertion, final SubLObject universal_date)
  {
    final SubLObject old_when = assertions_high.asserted_when( assertion );
    final SubLObject result = assertions_low.set_assertion_asserted_when( assertion, universal_date );
    kb_modification_event.post_kb_modify_set_assertion_asserted_when_event( assertion, old_when, universal_date );
    return result;
  }

  @SubLTranslatedFile.SubL(source = "cycl/assertions-interface.lisp", position = 17437L)
  public static SubLObject set_assertion_asserted_why_int(final SubLObject assertion, final SubLObject reason)
  {
    final SubLObject old_reason = assertions_high.asserted_why( assertion );
    final SubLObject result = assertions_low.set_assertion_asserted_why( assertion, reason );
    kb_modification_event.post_kb_modify_set_assertion_asserted_why_event( assertion, old_reason, reason );
    return result;
  }

  @SubLTranslatedFile.SubL(source = "cycl/assertions-interface.lisp", position = 17821L)
  public static SubLObject set_assertion_asserted_second_int(final SubLObject assertion, final SubLObject universal_second)
  {
    final SubLObject old_seconds = assertions_high.asserted_second( assertion );
    final SubLObject result = assertions_low.set_assertion_asserted_second( assertion, universal_second );
    kb_modification_event.post_kb_modify_set_assertion_asserted_second_event( assertion, old_seconds, universal_second );
    return result;
  }

  @SubLTranslatedFile.SubL(source = "cycl/assertions-interface.lisp", position = 18263L)
  public static SubLObject kb_assertion_arguments(final SubLObject assertion)
  {
    enforceType( assertion, $sym14$ASSERTION_P );
    if( NIL != hl_interface_infrastructure.hl_access_remoteP() )
    {
      return hl_interface_infrastructure.hl_store_remote_eval( ConsesLow.list( $sym94$KB_ASSERTION_ARGUMENTS, ConsesLow.list( $sym16$QUOTE, assertion ) ) );
    }
    return assertions_low.assertion_arguments_internal( assertion );
  }

  @SubLTranslatedFile.SubL(source = "cycl/assertions-interface.lisp", position = 18870L)
  public static SubLObject kb_lookup_asserted_argument(final SubLObject assertion, final SubLObject truth, final SubLObject strength)
  {
    enforceType( assertion, $sym14$ASSERTION_P );
    enforceType( truth, $sym4$TRUTH_P );
    enforceType( strength, $sym5$EL_STRENGTH_P );
    if( NIL != hl_interface_infrastructure.hl_access_remoteP() )
    {
      return hl_interface_infrastructure.hl_store_remote_eval( ConsesLow.list( $sym96$KB_LOOKUP_ASSERTED_ARGUMENT, ConsesLow.list( $sym16$QUOTE, assertion ), ConsesLow.list( $sym16$QUOTE, truth ), ConsesLow.list(
          $sym16$QUOTE, strength ) ) );
    }
    return lookup_asserted_argument( assertion, truth, strength );
  }

  @SubLTranslatedFile.SubL(source = "cycl/assertions-interface.lisp", position = 19456L)
  public static SubLObject lookup_asserted_argument(final SubLObject assertion, final SubLObject truth, final SubLObject strength)
  {
    final SubLObject asserted_argument = assertions_high.get_asserted_argument( assertion );
    if( NIL != asserted_argument && truth.eql( arguments.asserted_argument_truth( asserted_argument ) ) && strength.eql( arguments.asserted_argument_strength( asserted_argument ) ) )
    {
      return asserted_argument;
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/assertions-interface.lisp", position = 19782L)
  public static SubLObject possibly_replace_assertion_asserted_argument_with_tv(final SubLObject assertion, final SubLObject new_tv)
  {
    final SubLObject new_truth = enumeration_types.tv_truth( new_tv );
    final SubLObject new_strength = enumeration_types.tv_strength( new_tv );
    if( NIL != kb_lookup_asserted_argument( assertion, new_truth, new_strength ) )
    {
      return NIL;
    }
    return replace_assertion_asserted_argument( assertion, new_truth, new_strength, NIL );
  }

  @SubLTranslatedFile.SubL(source = "cycl/assertions-interface.lisp", position = 20201L)
  public static SubLObject replace_assertion_asserted_argument_with_tv(final SubLObject assertion, final SubLObject new_tv)
  {
    final SubLObject new_truth = enumeration_types.tv_truth( new_tv );
    final SubLObject new_strength = enumeration_types.tv_strength( new_tv );
    return replace_assertion_asserted_argument( assertion, new_truth, new_strength, T );
  }

  @SubLTranslatedFile.SubL(source = "cycl/assertions-interface.lisp", position = 20449L)
  public static SubLObject replace_assertion_asserted_argument(final SubLObject assertion, final SubLObject new_truth, final SubLObject new_strength, final SubLObject enforce_existence_of_old_asserted_argumentP)
  {
    assert NIL != assertion_handles.assertion_p( assertion ) : assertion;
    assert NIL != enumeration_types.truth_p( new_truth ) : new_truth;
    assert NIL != enumeration_types.el_strength_p( new_strength ) : new_strength;
    final SubLObject old_asserted_argument = assertions_high.get_asserted_argument( assertion );
    if( NIL != enforce_existence_of_old_asserted_argumentP && !assertionsDisabled && NIL == arguments.asserted_argument_p( old_asserted_argument ) )
    {
      throw new AssertionError( old_asserted_argument );
    }
    final SubLObject old_who = assertions_high.asserted_by( assertion );
    final SubLObject old_when = assertions_high.asserted_when( assertion );
    final SubLObject old_why = assertions_high.asserted_why( assertion );
    final SubLObject old_second = assertions_high.asserted_second( assertion );
    SubLObject result = NIL;
    if( NIL != old_asserted_argument )
    {
      kb_remove_asserted_argument( assertion, old_asserted_argument );
    }
    result = kb_create_asserted_argument( assertion, new_truth, new_strength );
    assertions_high.timestamp_asserted_assertion( assertion, old_who, old_when, old_why, old_second );
    return result;
  }

  @SubLTranslatedFile.SubL(source = "cycl/assertions-interface.lisp", position = 21475L)
  public static SubLObject kb_create_asserted_argument_with_tv(final SubLObject assertion, final SubLObject tv)
  {
    final SubLObject truth = enumeration_types.tv_truth( tv );
    final SubLObject strength = enumeration_types.tv_strength( tv );
    return kb_create_asserted_argument( assertion, truth, strength );
  }

  @SubLTranslatedFile.SubL(source = "cycl/assertions-interface.lisp", position = 21678L)
  public static SubLObject kb_create_asserted_argument(final SubLObject assertion, final SubLObject truth, final SubLObject strength)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    enforceType( assertion, $sym14$ASSERTION_P );
    enforceType( truth, $sym4$TRUTH_P );
    enforceType( strength, $sym5$EL_STRENGTH_P );
    SubLObject result = NIL;
    hl_interface_infrastructure.define_hl_modifier_preamble();
    hl_interface_infrastructure.note_hl_modifier_invocation( $sym101$KB_CREATE_ASSERTED_ARGUMENT, assertion, truth, strength, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
    if( NIL != hl_interface_infrastructure.hl_modify_remoteP() )
    {
      result = hl_interface_infrastructure.hl_store_remote_eval( ConsesLow.list( $sym101$KB_CREATE_ASSERTED_ARGUMENT, ConsesLow.list( $sym16$QUOTE, assertion ), ConsesLow.list( $sym16$QUOTE, truth ), ConsesLow.list(
          $sym16$QUOTE, strength ) ) );
    }
    if( NIL != hl_interface_infrastructure.hl_modify_localP() )
    {
      final SubLObject _prev_bind_0 = hl_interface_infrastructure.$override_hl_store_remote_accessP$.currentBinding( thread );
      try
      {
        hl_interface_infrastructure.$override_hl_store_remote_accessP$.bind( T, thread );
        SubLObject release = NIL;
        try
        {
          release = Locks.seize_lock( control_vars.$hl_lock$.getGlobalValue() );
          final SubLObject tv = enumeration_types.tv_from_truth_strength( truth, strength );
          final SubLObject asserted_argument = arguments.create_asserted_argument( assertion, tv );
          assertions_low.add_new_assertion_argument( assertion, asserted_argument );
          kb_modification_event.post_kb_modify_create_asserted_argument( assertion, truth, strength );
          return asserted_argument;
        }
        finally
        {
          if( NIL != release )
          {
            Locks.release_lock( control_vars.$hl_lock$.getGlobalValue() );
          }
        }
      }
      finally
      {
        hl_interface_infrastructure.$override_hl_store_remote_accessP$.rebind( _prev_bind_0, thread );
      }
    }
    return result;
  }

  @SubLTranslatedFile.SubL(source = "cycl/assertions-interface.lisp", position = 22589L)
  public static SubLObject kb_remove_asserted_argument(final SubLObject assertion, final SubLObject asserted_argument)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    enforceType( assertion, $sym14$ASSERTION_P );
    enforceType( asserted_argument, $sym6$ASSERTED_ARGUMENT_P );
    SubLObject result = NIL;
    hl_interface_infrastructure.define_hl_modifier_preamble();
    hl_interface_infrastructure.note_hl_modifier_invocation( $sym104$KB_REMOVE_ASSERTED_ARGUMENT, assertion, asserted_argument, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
    if( NIL != hl_interface_infrastructure.hl_modify_remoteP() )
    {
      result = hl_interface_infrastructure.hl_store_remote_eval( ConsesLow.list( $sym104$KB_REMOVE_ASSERTED_ARGUMENT, ConsesLow.list( $sym16$QUOTE, assertion ), ConsesLow.list( $sym16$QUOTE, asserted_argument ) ) );
    }
    if( NIL != hl_interface_infrastructure.hl_modify_localP() )
    {
      final SubLObject _prev_bind_0 = hl_interface_infrastructure.$override_hl_store_remote_accessP$.currentBinding( thread );
      try
      {
        hl_interface_infrastructure.$override_hl_store_remote_accessP$.bind( T, thread );
        SubLObject release = NIL;
        try
        {
          release = Locks.seize_lock( control_vars.$hl_lock$.getGlobalValue() );
          kb_modification_event.post_kb_modify_remove_asserted_argument( assertion, asserted_argument );
          assertions_low.set_assertion_asserted_by( assertion, NIL );
          assertions_low.set_assertion_asserted_when( assertion, NIL );
          assertions_low.set_assertion_asserted_why( assertion, NIL );
          assertions_low.set_assertion_asserted_second( assertion, NIL );
          assertions_low.remove_assertion_argument( assertion, asserted_argument );
          arguments.kb_remove_asserted_argument_internal( asserted_argument );
          return assertion;
        }
        finally
        {
          if( NIL != release )
          {
            Locks.release_lock( control_vars.$hl_lock$.getGlobalValue() );
          }
        }
      }
      finally
      {
        hl_interface_infrastructure.$override_hl_store_remote_accessP$.rebind( _prev_bind_0, thread );
      }
    }
    return result;
  }

  @SubLTranslatedFile.SubL(source = "cycl/assertions-interface.lisp", position = 23709L)
  public static SubLObject kb_assertion_dependents(final SubLObject assertion)
  {
    enforceType( assertion, $sym14$ASSERTION_P );
    if( NIL != hl_interface_infrastructure.hl_access_remoteP() )
    {
      return hl_interface_infrastructure.hl_store_remote_eval( ConsesLow.list( $sym108$KB_ASSERTION_DEPENDENTS, ConsesLow.list( $sym16$QUOTE, assertion ) ) );
    }
    return assertions_low.assertion_dependents_internal( assertion );
  }

  @SubLTranslatedFile.SubL(source = "cycl/assertions-interface.lisp", position = 24235L)
  public static SubLObject all_dependent_assertions(final SubLObject assertion)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    assert NIL != assertion_handles.assertion_p( assertion ) : assertion;
    thread.resetMultipleValues();
    final SubLObject assertion_table = assertions_low.assertion_dependencies( assertion );
    final SubLObject deduction_table = thread.secondMultipleValue();
    thread.resetMultipleValues();
    SubLObject assertions = hash_table_utilities.hash_table_keys( assertion_table );
    assertions = assertion_utilities.sort_assertions( assertions );
    return assertions;
  }

  public static SubLObject declare_assertions_interface_file()
  {
    SubLFiles.declareFunction(me, "kb_create_assertion", "KB-CREATE-ASSERTION", 7, 0, false );
    SubLFiles.declareFunction(me, "kb_create_assertion_remote", "KB-CREATE-ASSERTION-REMOTE", 7, 0, false );
    SubLFiles.declareFunction(me, "kb_create_assertion_local", "KB-CREATE-ASSERTION-LOCAL", 7, 0, false );
    SubLFiles.declareFunction(me, "kb_remove_assertion", "KB-REMOVE-ASSERTION", 1, 0, false );
    SubLFiles.declareFunction(me, "kb_assertion_cnf", "KB-ASSERTION-CNF", 1, 0, false );
    SubLFiles.declareFunction(me, "kb_possibly_assertion_cnf", "KB-POSSIBLY-ASSERTION-CNF", 1, 0, false );
    SubLFiles.declareFunction(me, "kb_assertion_mt", "KB-ASSERTION-MT", 1, 0, false );
    SubLFiles.declareFunction(me, "kb_lookup_assertion", "KB-LOOKUP-ASSERTION", 2, 0, false );
    SubLFiles.declareFunction(me, "kb_gaf_assertionP", "KB-GAF-ASSERTION?", 1, 0, false );
    SubLFiles.declareFunction(me, "kb_rule_assertionP", "KB-RULE-ASSERTION?", 1, 0, false );
    SubLFiles.declareFunction(me, "kb_assertion_gaf_hl_formula", "KB-ASSERTION-GAF-HL-FORMULA", 1, 0, false );
    SubLFiles.declareFunction(me, "kb_assertion_cons", "KB-ASSERTION-CONS", 1, 0, false );
    SubLFiles.declareFunction(me, "kb_assertion_direction", "KB-ASSERTION-DIRECTION", 1, 0, false );
    SubLFiles.declareFunction(me, "kb_assertion_truth", "KB-ASSERTION-TRUTH", 1, 0, false );
    SubLFiles.declareFunction(me, "kb_assertion_strength", "KB-ASSERTION-STRENGTH", 1, 0, false );
    SubLFiles.declareFunction(me, "kb_assertion_variable_names", "KB-ASSERTION-VARIABLE-NAMES", 1, 0, false );
    SubLFiles.declareFunction(me, "kb_assertion_asserted_by", "KB-ASSERTION-ASSERTED-BY", 1, 0, false );
    SubLFiles.declareFunction(me, "kb_assertion_asserted_when", "KB-ASSERTION-ASSERTED-WHEN", 1, 0, false );
    SubLFiles.declareFunction(me, "kb_assertion_asserted_why", "KB-ASSERTION-ASSERTED-WHY", 1, 0, false );
    SubLFiles.declareFunction(me, "kb_assertion_asserted_second", "KB-ASSERTION-ASSERTED-SECOND", 1, 0, false );
    SubLFiles.declareFunction(me, "kb_set_assertion_direction", "KB-SET-ASSERTION-DIRECTION", 2, 0, false );
    SubLFiles.declareFunction(me, "kb_set_assertion_truth", "KB-SET-ASSERTION-TRUTH", 2, 0, false );
    SubLFiles.declareFunction(me, "kb_set_assertion_strength", "KB-SET-ASSERTION-STRENGTH", 2, 0, false );
    SubLFiles.declareFunction(me, "kb_set_assertion_variable_names", "KB-SET-ASSERTION-VARIABLE-NAMES", 2, 0, false );
    SubLFiles.declareFunction(me, "assertion_who_p", "ASSERTION-WHO-P", 1, 0, false );
    SubLFiles.declareFunction(me, "assertion_when_p", "ASSERTION-WHEN-P", 1, 0, false );
    SubLFiles.declareFunction(me, "assertion_why_p", "ASSERTION-WHY-P", 1, 0, false );
    SubLFiles.declareFunction(me, "assertion_second_p", "ASSERTION-SECOND-P", 1, 0, false );
    SubLFiles.declareFunction(me, "kb_timestamp_asserted_assertion", "KB-TIMESTAMP-ASSERTED-ASSERTION", 5, 0, false );
    SubLFiles.declareFunction(me, "set_assertion_asserted_by_int", "SET-ASSERTION-ASSERTED-BY-INT", 2, 0, false );
    SubLFiles.declareFunction(me, "set_assertion_asserted_when_int", "SET-ASSERTION-ASSERTED-WHEN-INT", 2, 0, false );
    SubLFiles.declareFunction(me, "set_assertion_asserted_why_int", "SET-ASSERTION-ASSERTED-WHY-INT", 2, 0, false );
    SubLFiles.declareFunction(me, "set_assertion_asserted_second_int", "SET-ASSERTION-ASSERTED-SECOND-INT", 2, 0, false );
    SubLFiles.declareFunction(me, "kb_assertion_arguments", "KB-ASSERTION-ARGUMENTS", 1, 0, false );
    SubLFiles.declareFunction(me, "kb_lookup_asserted_argument", "KB-LOOKUP-ASSERTED-ARGUMENT", 3, 0, false );
    SubLFiles.declareFunction(me, "lookup_asserted_argument", "LOOKUP-ASSERTED-ARGUMENT", 3, 0, false );
    SubLFiles.declareFunction(me, "possibly_replace_assertion_asserted_argument_with_tv", "POSSIBLY-REPLACE-ASSERTION-ASSERTED-ARGUMENT-WITH-TV", 2, 0, false );
    SubLFiles.declareFunction(me, "replace_assertion_asserted_argument_with_tv", "REPLACE-ASSERTION-ASSERTED-ARGUMENT-WITH-TV", 2, 0, false );
    SubLFiles.declareFunction(me, "replace_assertion_asserted_argument", "REPLACE-ASSERTION-ASSERTED-ARGUMENT", 4, 0, false );
    SubLFiles.declareFunction(me, "kb_create_asserted_argument_with_tv", "KB-CREATE-ASSERTED-ARGUMENT-WITH-TV", 2, 0, false );
    SubLFiles.declareFunction(me, "kb_create_asserted_argument", "KB-CREATE-ASSERTED-ARGUMENT", 3, 0, false );
    SubLFiles.declareFunction(me, "kb_remove_asserted_argument", "KB-REMOVE-ASSERTED-ARGUMENT", 2, 0, false );
    SubLFiles.declareFunction(me, "kb_assertion_dependents", "KB-ASSERTION-DEPENDENTS", 1, 0, false );
    SubLFiles.declareFunction(me, "all_dependent_assertions", "ALL-DEPENDENT-ASSERTIONS", 1, 0, false );
    return NIL;
  }

  public static SubLObject init_assertions_interface_file()
  {
    return NIL;
  }

  public static SubLObject setup_assertions_interface_file()
  {
    utilities_macros.register_cyc_api_function( $sym7$KB_CREATE_ASSERTION, $list9, $str10$Create_a_new_assertion_with_CNF_i, $list11, $list12 );
    utilities_macros.register_cyc_api_function( $sym15$KB_REMOVE_ASSERTION, $list17, $str18$Remove_ASSERTION_from_the_KB_, $list19, $list20 );
    utilities_macros.register_cyc_api_function( $sym21$KB_ASSERTION_CNF, $list17, $str22$Return_the_CNF_for_ASSERTION_, $list19, $list23 );
    utilities_macros.register_cyc_api_function( $sym24$KB_POSSIBLY_ASSERTION_CNF, $list17, $str25$Return_the_CNF_for_ASSERTION_or_N, $list19, $list26 );
    utilities_macros.register_cyc_api_function( $sym27$KB_ASSERTION_MT, $list17, $str28$Return_the_MT_for_ASSERTION_, $list19, $list29 );
    utilities_macros.register_cyc_api_function( $sym31$KB_LOOKUP_ASSERTION, $list32, $str33$Return_the_assertion_with_CNF_and, $list34, $list35 );
    utilities_macros.register_cyc_api_function( $sym36$KB_GAF_ASSERTION_, $list17, $str37$Return_T_iff_ASSERTION_is_a_groun, $list19, $list38 );
    utilities_macros.register_cyc_api_function( $sym39$KB_RULE_ASSERTION_, $list17, $str37$Return_T_iff_ASSERTION_is_a_groun, $list19, $list38 );
    utilities_macros.register_cyc_api_function( $sym40$KB_ASSERTION_GAF_HL_FORMULA, $list17, $str41$Returns_the_HL_clause_of_ASSERTIO, $list19, $list42 );
    utilities_macros.register_cyc_api_function( $sym43$KB_ASSERTION_CONS, $list17, $str44$Returns_a_CNF_or_GAF_HL_formula_, $list19, $list45 );
    utilities_macros.register_cyc_api_function( $sym46$KB_ASSERTION_DIRECTION, $list17, $str47$Return_the_direction_of_ASSERTION, $list19, $list48 );
    utilities_macros.register_cyc_api_function( $sym49$KB_ASSERTION_TRUTH, $list17, $str50$Return_the_current_truth_of_ASSER, $list19, $list51 );
    utilities_macros.register_cyc_api_function( $sym52$KB_ASSERTION_STRENGTH, $list17, $str53$Return_the_current_argumentation_, $list19, $list54 );
    utilities_macros.register_cyc_api_function( $sym55$KB_ASSERTION_VARIABLE_NAMES, $list17, $str56$Return_the_variable_names_for_ASS, $list19, $list57 );
    utilities_macros.register_cyc_api_function( $sym58$KB_ASSERTION_ASSERTED_BY, $list17, $str59$Return_the_asserted_by_bookkeepin, $list19, $list60 );
    utilities_macros.register_cyc_api_function( $sym61$KB_ASSERTION_ASSERTED_WHEN, $list17, $str62$Return_the_asserted_when_bookkeep, $list19, $list63 );
    utilities_macros.register_cyc_api_function( $sym64$KB_ASSERTION_ASSERTED_WHY, $list17, $str65$Return_the_asserted_why_bookkeepi, $list19, $list60 );
    utilities_macros.register_cyc_api_function( $sym66$KB_ASSERTION_ASSERTED_SECOND, $list17, $str67$Return_the_asserted_second_bookke, $list19, $list68 );
    utilities_macros.register_cyc_api_function( $sym69$KB_SET_ASSERTION_DIRECTION, $list70, $str71$Change_direction_of_ASSERTION_to_, $list72, $list12 );
    utilities_macros.register_cyc_api_function( $sym73$KB_SET_ASSERTION_TRUTH, $list74, $str75$Change_the_truth_of_ASSERTION_to_, $list76, $list12 );
    utilities_macros.register_cyc_api_function( $sym77$KB_SET_ASSERTION_STRENGTH, $list78, $str79$Change_the_strength_of_ASSERTION_, $list80, $list12 );
    utilities_macros.register_cyc_api_function( $sym81$KB_SET_ASSERTION_VARIABLE_NAMES, $list82, $str83$Change_the_variable_names_for_ASS, $list84, $list12 );
    utilities_macros.register_cyc_api_function( $sym90$KB_TIMESTAMP_ASSERTED_ASSERTION, $list91, $str92$Set_meta_data_on_ASSERTION_, $list93, $list12 );
    utilities_macros.register_cyc_api_function( $sym94$KB_ASSERTION_ARGUMENTS, $list17, $str95$Return_the_arguments_for_ASSERTIO, $list19, $list57 );
    utilities_macros.register_cyc_api_function( $sym96$KB_LOOKUP_ASSERTED_ARGUMENT, $list97, $str98$Return_the_asserted_argument_with, $list99, $list100 );
    utilities_macros.register_cyc_api_function( $sym101$KB_CREATE_ASSERTED_ARGUMENT, $list97, $str102$Create_an_asserted_argument_for_A, $list99, $list103 );
    utilities_macros.register_cyc_api_function( $sym104$KB_REMOVE_ASSERTED_ARGUMENT, $list105, $str106$Remove_ASSERTED_ARGUMENT_for_ASSE, $list107, $list20 );
    utilities_macros.register_cyc_api_function( $sym108$KB_ASSERTION_DEPENDENTS, $list17, $str109$Return_the_dependents_of_ASSERTIO, $list19, $list110 );
    return NIL;
  }

  @Override
  public void declareFunctions()
  {
    declare_assertions_interface_file();
  }

  @Override
  public void initializeVariables()
  {
    init_assertions_interface_file();
  }

  @Override
  public void runTopLevelForms()
  {
    setup_assertions_interface_file();
  }
  static
  {
    me = new assertions_interface();
    $sym0$CNF_P = makeSymbol( "CNF-P" );
    $sym1$HLMT_P = makeSymbol( "HLMT-P" );
    $sym2$LISTP = makeSymbol( "LISTP" );
    $sym3$DIRECTION_P = makeSymbol( "DIRECTION-P" );
    $sym4$TRUTH_P = makeSymbol( "TRUTH-P" );
    $sym5$EL_STRENGTH_P = makeSymbol( "EL-STRENGTH-P" );
    $sym6$ASSERTED_ARGUMENT_P = makeSymbol( "ASSERTED-ARGUMENT-P" );
    $sym7$KB_CREATE_ASSERTION = makeSymbol( "KB-CREATE-ASSERTION" );
    $sym8$_EXIT = makeSymbol( "%EXIT" );
    $list9 = ConsesLow.list( makeSymbol( "CNF" ), makeSymbol( "MT" ), makeSymbol( "VARIABLE-NAMES" ), makeSymbol( "DIRECTION" ), makeSymbol( "TRUTH" ), makeSymbol( "STRENGTH" ), makeSymbol( "ASSERTED-ARGUMENT" ) );
    $str10$Create_a_new_assertion_with_CNF_i = makeString( "Create a new assertion with CNF in MT." );
    $list11 = ConsesLow.list( ConsesLow.list( makeSymbol( "CNF" ), makeSymbol( "CNF-P" ) ), ConsesLow.list( makeSymbol( "MT" ), makeSymbol( "HLMT-P" ) ), ConsesLow.list( makeSymbol( "VARIABLE-NAMES" ), makeSymbol(
        "LISTP" ) ), ConsesLow.list( makeSymbol( "DIRECTION" ), makeSymbol( "DIRECTION-P" ) ), ConsesLow.list( makeSymbol( "TRUTH" ), makeSymbol( "TRUTH-P" ) ), ConsesLow.list( makeSymbol( "STRENGTH" ), makeSymbol(
            "EL-STRENGTH-P" ) ), ConsesLow.list( makeSymbol( "ASSERTED-ARGUMENT" ), ConsesLow.list( makeSymbol( "NIL-OR" ), makeSymbol( "ASSERTED-ARGUMENT-P" ) ) ) );
    $list12 = ConsesLow.list( makeSymbol( "ASSERTION-P" ) );
    $sym13$KB_CREATE_ASSERTION_KB_STORE = makeSymbol( "KB-CREATE-ASSERTION-KB-STORE" );
    $sym14$ASSERTION_P = makeSymbol( "ASSERTION-P" );
    $sym15$KB_REMOVE_ASSERTION = makeSymbol( "KB-REMOVE-ASSERTION" );
    $sym16$QUOTE = makeSymbol( "QUOTE" );
    $list17 = ConsesLow.list( makeSymbol( "ASSERTION" ) );
    $str18$Remove_ASSERTION_from_the_KB_ = makeString( "Remove ASSERTION from the KB." );
    $list19 = ConsesLow.list( ConsesLow.list( makeSymbol( "ASSERTION" ), makeSymbol( "ASSERTION-P" ) ) );
    $list20 = ConsesLow.list( makeSymbol( "NULL" ) );
    $sym21$KB_ASSERTION_CNF = makeSymbol( "KB-ASSERTION-CNF" );
    $str22$Return_the_CNF_for_ASSERTION_ = makeString( "Return the CNF for ASSERTION." );
    $list23 = ConsesLow.list( makeSymbol( "CNF-P" ) );
    $sym24$KB_POSSIBLY_ASSERTION_CNF = makeSymbol( "KB-POSSIBLY-ASSERTION-CNF" );
    $str25$Return_the_CNF_for_ASSERTION_or_N = makeString( "Return the CNF for ASSERTION or NIL." );
    $list26 = ConsesLow.list( ConsesLow.list( makeSymbol( "NIL-OR" ), makeSymbol( "CNF-P" ) ) );
    $sym27$KB_ASSERTION_MT = makeSymbol( "KB-ASSERTION-MT" );
    $str28$Return_the_MT_for_ASSERTION_ = makeString( "Return the MT for ASSERTION." );
    $list29 = ConsesLow.list( makeSymbol( "HLMT-P" ) );
    $sym30$POSSIBLY_HLMT_P = makeSymbol( "POSSIBLY-HLMT-P" );
    $sym31$KB_LOOKUP_ASSERTION = makeSymbol( "KB-LOOKUP-ASSERTION" );
    $list32 = ConsesLow.list( makeSymbol( "CNF" ), makeSymbol( "MT" ) );
    $str33$Return_the_assertion_with_CNF_and = makeString( "Return the assertion with CNF and MT, if it exists.\n   Return NIL otherwise." );
    $list34 = ConsesLow.list( ConsesLow.list( makeSymbol( "CNF" ), makeSymbol( "CNF-P" ) ), ConsesLow.list( makeSymbol( "MT" ), makeSymbol( "POSSIBLY-HLMT-P" ) ) );
    $list35 = ConsesLow.list( ConsesLow.list( makeSymbol( "NIL-OR" ), makeSymbol( "ASSERTION-P" ) ) );
    $sym36$KB_GAF_ASSERTION_ = makeSymbol( "KB-GAF-ASSERTION?" );
    $str37$Return_T_iff_ASSERTION_is_a_groun = makeString( "Return T iff ASSERTION is a ground atomic formula (gaf)." );
    $list38 = ConsesLow.list( makeSymbol( "BOOLEANP" ) );
    $sym39$KB_RULE_ASSERTION_ = makeSymbol( "KB-RULE-ASSERTION?" );
    $sym40$KB_ASSERTION_GAF_HL_FORMULA = makeSymbol( "KB-ASSERTION-GAF-HL-FORMULA" );
    $str41$Returns_the_HL_clause_of_ASSERTIO = makeString(
        "Returns the HL clause of ASSERTION if it's a gaf, otherwise returns nil.\n   Ignores the truth - i.e. returns <blah> instead of (#$not <blah>) for negated gafs." );
    $list42 = ConsesLow.list( makeSymbol( "POSSIBLY-SENTENCE-P" ) );
    $sym43$KB_ASSERTION_CONS = makeSymbol( "KB-ASSERTION-CONS" );
    $str44$Returns_a_CNF_or_GAF_HL_formula_ = makeString( "Returns a CNF or GAF HL formula." );
    $list45 = ConsesLow.list( makeSymbol( "CONSP" ) );
    $sym46$KB_ASSERTION_DIRECTION = makeSymbol( "KB-ASSERTION-DIRECTION" );
    $str47$Return_the_direction_of_ASSERTION = makeString( "Return the direction of ASSERTION (either :backward, :forward or :code)." );
    $list48 = ConsesLow.list( makeSymbol( "DIRECTION-P" ) );
    $sym49$KB_ASSERTION_TRUTH = makeSymbol( "KB-ASSERTION-TRUTH" );
    $str50$Return_the_current_truth_of_ASSER = makeString( "Return the current truth of ASSERTION -- either :true :false or :unknown." );
    $list51 = ConsesLow.list( makeSymbol( "TRUTH-P" ) );
    $sym52$KB_ASSERTION_STRENGTH = makeSymbol( "KB-ASSERTION-STRENGTH" );
    $str53$Return_the_current_argumentation_ = makeString( "Return the current argumentation strength of ASSERTION -- either :monotonic, :default, or :unknown." );
    $list54 = ConsesLow.list( makeSymbol( "EL-STRENGTH-P" ) );
    $sym55$KB_ASSERTION_VARIABLE_NAMES = makeSymbol( "KB-ASSERTION-VARIABLE-NAMES" );
    $str56$Return_the_variable_names_for_ASS = makeString( "Return the variable names for ASSERTION." );
    $list57 = ConsesLow.list( makeSymbol( "LISTP" ) );
    $sym58$KB_ASSERTION_ASSERTED_BY = makeSymbol( "KB-ASSERTION-ASSERTED-BY" );
    $str59$Return_the_asserted_by_bookkeepin = makeString( "Return the asserted-by bookkeeping info for ASSERTION." );
    $list60 = ConsesLow.list( ConsesLow.list( makeSymbol( "NIL-OR" ), makeSymbol( "FORT-P" ) ) );
    $sym61$KB_ASSERTION_ASSERTED_WHEN = makeSymbol( "KB-ASSERTION-ASSERTED-WHEN" );
    $str62$Return_the_asserted_when_bookkeep = makeString( "Return the asserted-when bookkeeping info for ASSERTION." );
    $list63 = ConsesLow.list( ConsesLow.list( makeSymbol( "NIL-OR" ), makeSymbol( "UNIVERSAL-DATE-P" ) ) );
    $sym64$KB_ASSERTION_ASSERTED_WHY = makeSymbol( "KB-ASSERTION-ASSERTED-WHY" );
    $str65$Return_the_asserted_why_bookkeepi = makeString( "Return the asserted-why bookkeeping info for ASSERTION." );
    $sym66$KB_ASSERTION_ASSERTED_SECOND = makeSymbol( "KB-ASSERTION-ASSERTED-SECOND" );
    $str67$Return_the_asserted_second_bookke = makeString( "Return the asserted-second bookkeeping info for ASSERTION." );
    $list68 = ConsesLow.list( ConsesLow.list( makeSymbol( "NIL-OR" ), makeSymbol( "UNIVERSAL-SECOND-P" ) ) );
    $sym69$KB_SET_ASSERTION_DIRECTION = makeSymbol( "KB-SET-ASSERTION-DIRECTION" );
    $list70 = ConsesLow.list( makeSymbol( "ASSERTION" ), makeSymbol( "NEW-DIRECTION" ) );
    $str71$Change_direction_of_ASSERTION_to_ = makeString( "Change direction of ASSERTION to NEW-DIRECTION." );
    $list72 = ConsesLow.list( ConsesLow.list( makeSymbol( "ASSERTION" ), makeSymbol( "ASSERTION-P" ) ), ConsesLow.list( makeSymbol( "NEW-DIRECTION" ), makeSymbol( "DIRECTION-P" ) ) );
    $sym73$KB_SET_ASSERTION_TRUTH = makeSymbol( "KB-SET-ASSERTION-TRUTH" );
    $list74 = ConsesLow.list( makeSymbol( "ASSERTION" ), makeSymbol( "NEW-TRUTH" ) );
    $str75$Change_the_truth_of_ASSERTION_to_ = makeString( "Change the truth of ASSERTION to NEW-TRUTH." );
    $list76 = ConsesLow.list( ConsesLow.list( makeSymbol( "ASSERTION" ), makeSymbol( "ASSERTION-P" ) ), ConsesLow.list( makeSymbol( "NEW-TRUTH" ), makeSymbol( "TRUTH-P" ) ) );
    $sym77$KB_SET_ASSERTION_STRENGTH = makeSymbol( "KB-SET-ASSERTION-STRENGTH" );
    $list78 = ConsesLow.list( makeSymbol( "ASSERTION" ), makeSymbol( "NEW-STRENGTH" ) );
    $str79$Change_the_strength_of_ASSERTION_ = makeString( "Change the strength of ASSERTION to NEW-STRENGTH." );
    $list80 = ConsesLow.list( ConsesLow.list( makeSymbol( "ASSERTION" ), makeSymbol( "ASSERTION-P" ) ), ConsesLow.list( makeSymbol( "NEW-STRENGTH" ), makeSymbol( "EL-STRENGTH-P" ) ) );
    $sym81$KB_SET_ASSERTION_VARIABLE_NAMES = makeSymbol( "KB-SET-ASSERTION-VARIABLE-NAMES" );
    $list82 = ConsesLow.list( makeSymbol( "ASSERTION" ), makeSymbol( "NEW-VARIABLE-NAMES" ) );
    $str83$Change_the_variable_names_for_ASS = makeString( "Change the variable names for ASSERTION to NEW-VARIABLE-NAMES." );
    $list84 = ConsesLow.list( ConsesLow.list( makeSymbol( "ASSERTION" ), makeSymbol( "ASSERTION-P" ) ), ConsesLow.list( makeSymbol( "NEW-VARIABLE-NAMES" ), makeSymbol( "LISTP" ) ) );
    $kw85$UNCHANGED = makeKeyword( "UNCHANGED" );
    $sym86$ASSERTION_WHO_P = makeSymbol( "ASSERTION-WHO-P" );
    $sym87$ASSERTION_WHEN_P = makeSymbol( "ASSERTION-WHEN-P" );
    $sym88$ASSERTION_WHY_P = makeSymbol( "ASSERTION-WHY-P" );
    $sym89$ASSERTION_SECOND_P = makeSymbol( "ASSERTION-SECOND-P" );
    $sym90$KB_TIMESTAMP_ASSERTED_ASSERTION = makeSymbol( "KB-TIMESTAMP-ASSERTED-ASSERTION" );
    $list91 = ConsesLow.list( makeSymbol( "ASSERTION" ), makeSymbol( "WHO" ), makeSymbol( "WHEN" ), makeSymbol( "WHY" ), makeSymbol( "SECOND" ) );
    $str92$Set_meta_data_on_ASSERTION_ = makeString( "Set meta data on ASSERTION." );
    $list93 = ConsesLow.list( ConsesLow.list( makeSymbol( "ASSERTION" ), makeSymbol( "ASSERTION-P" ) ), ConsesLow.list( makeSymbol( "WHO" ), makeSymbol( "ASSERTION-WHO-P" ) ), ConsesLow.list( makeSymbol( "WHEN" ),
        makeSymbol( "ASSERTION-WHEN-P" ) ), ConsesLow.list( makeSymbol( "WHY" ), makeSymbol( "ASSERTION-WHY-P" ) ), ConsesLow.list( makeSymbol( "SECOND" ), makeSymbol( "ASSERTION-SECOND-P" ) ) );
    $sym94$KB_ASSERTION_ARGUMENTS = makeSymbol( "KB-ASSERTION-ARGUMENTS" );
    $str95$Return_the_arguments_for_ASSERTIO = makeString( "Return the arguments for ASSERTION." );
    $sym96$KB_LOOKUP_ASSERTED_ARGUMENT = makeSymbol( "KB-LOOKUP-ASSERTED-ARGUMENT" );
    $list97 = ConsesLow.list( makeSymbol( "ASSERTION" ), makeSymbol( "TRUTH" ), makeSymbol( "STRENGTH" ) );
    $str98$Return_the_asserted_argument_with = makeString( "Return the asserted argument with ASSERTION, TRUTH, and STRENGTH, if it exists.\n   Return NIL otherwise." );
    $list99 = ConsesLow.list( ConsesLow.list( makeSymbol( "ASSERTION" ), makeSymbol( "ASSERTION-P" ) ), ConsesLow.list( makeSymbol( "TRUTH" ), makeSymbol( "TRUTH-P" ) ), ConsesLow.list( makeSymbol( "STRENGTH" ),
        makeSymbol( "EL-STRENGTH-P" ) ) );
    $list100 = ConsesLow.list( ConsesLow.list( makeSymbol( "NIL-OR" ), makeSymbol( "ASSERTED-ARGUMENT-P" ) ) );
    $sym101$KB_CREATE_ASSERTED_ARGUMENT = makeSymbol( "KB-CREATE-ASSERTED-ARGUMENT" );
    $str102$Create_an_asserted_argument_for_A = makeString( "Create an asserted argument for ASSERTION from TRUTH and STRENGTH,\nand hook up all the indexing between them." );
    $list103 = ConsesLow.list( makeSymbol( "ASSERTED-ARGUMENT-P" ) );
    $sym104$KB_REMOVE_ASSERTED_ARGUMENT = makeSymbol( "KB-REMOVE-ASSERTED-ARGUMENT" );
    $list105 = ConsesLow.list( makeSymbol( "ASSERTION" ), makeSymbol( "ASSERTED-ARGUMENT" ) );
    $str106$Remove_ASSERTED_ARGUMENT_for_ASSE = makeString( "Remove ASSERTED-ARGUMENT for ASSERTION." );
    $list107 = ConsesLow.list( ConsesLow.list( makeSymbol( "ASSERTION" ), makeSymbol( "ASSERTION-P" ) ), ConsesLow.list( makeSymbol( "ASSERTED-ARGUMENT" ), makeSymbol( "ASSERTED-ARGUMENT-P" ) ) );
    $sym108$KB_ASSERTION_DEPENDENTS = makeSymbol( "KB-ASSERTION-DEPENDENTS" );
    $str109$Return_the_dependents_of_ASSERTIO = makeString( "Return the dependents of ASSERTION." );
    $list110 = ConsesLow.list( makeSymbol( "SET-CONTENTS-P" ) );
  }
}