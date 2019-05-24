package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class czer_trampolines
    extends
      SubLTranslatedFile
{
  public static final SubLFile me;
  public static final String myName = "com.cyc.cycjava.cycl.czer_trampolines";
  public static final String myFingerPrint = "debabc2b5dc920f7484bc68aa5fe3b982302003b6170422ed65c97133723544c";
  private static final SubLSymbol $kw0$IGNORE;
  private static final SubLSymbol $kw1$REGULARIZE;
  private static final SubLSymbol $sym2$CZER_ARGN_QUOTED_ISA_INT;
  private static final SubLSymbol $sym3$RELEVANT_MT_IS_EVERYTHING;
  private static final SubLObject $const4$EverythingPSC;
  private static final SubLSymbol $sym5$RELEVANT_MT_IS_ANY_MT;
  private static final SubLObject $const6$InferencePSC;
  private static final SubLSymbol $sym7$RELEVANT_MT_IS_GENL_MT_OF_LIST_MEMBER;
  private static final SubLSymbol $sym8$RELEVANT_MT_IS_GENL_MT;

  @SubLTranslatedFile.SubL(source = "cycl/czer-trampolines.lisp", position = 914L)
  public static SubLObject czer_memoization_state()
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    return czer_vars.$czer_memoization_state$.getDynamicValue( thread );
  }

  @SubLTranslatedFile.SubL(source = "cycl/czer-trampolines.lisp", position = 1010L)
  public static SubLObject within_czer_memoization_stateP()
  {
    return memoization_state.memoization_state_p( czer_memoization_state() );
  }

  @SubLTranslatedFile.SubL(source = "cycl/czer-trampolines.lisp", position = 1119L)
  public static SubLObject czer_scoping_formulaP(final SubLObject formula)
  {
    if( NIL != el_utilities.el_formula_p( formula ) )
    {
      final SubLObject relation = cycl_utilities.formula_operator( formula );
      return fort_types_interface.isa_scoping_relationP( relation, UNPROVIDED );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/czer-trampolines.lisp", position = 1310L)
  public static SubLObject czer_scoping_args(final SubLObject relation)
  {
    return kb_accessors.scoping_args( relation, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/czer-trampolines.lisp", position = 1388L)
  public static SubLObject czer_scoped_vars(final SubLObject formula)
  {
    final SubLObject relation = cycl_utilities.formula_operator( formula );
    SubLObject scoped_vars = NIL;
    if( NIL != forts.fort_p( relation ) )
    {
      final SubLObject scoping_argnums = czer_scoping_args( relation );
      final SubLObject el_var_listP = cycl_grammar.el_var_list_operator_p( relation );
      SubLObject argnum = ZERO_INTEGER;
      SubLObject cdolist_list_var;
      final SubLObject args = cdolist_list_var = cycl_utilities.formula_args( formula, $kw0$IGNORE );
      SubLObject arg = NIL;
      arg = cdolist_list_var.first();
      while ( NIL != cdolist_list_var)
      {
        argnum = Numbers.add( argnum, ONE_INTEGER );
        if( NIL != subl_promotions.memberP( argnum, scoping_argnums, UNPROVIDED, UNPROVIDED ) )
        {
          if( NIL != el_var_listP )
          {
            SubLObject cdolist_list_var_$1;
            final SubLObject terms = cdolist_list_var_$1 = cycl_utilities.formula_terms( arg, $kw1$REGULARIZE );
            SubLObject var = NIL;
            var = cdolist_list_var_$1.first();
            while ( NIL != cdolist_list_var_$1)
            {
              scoped_vars = ConsesLow.cons( var, scoped_vars );
              cdolist_list_var_$1 = cdolist_list_var_$1.rest();
              var = cdolist_list_var_$1.first();
            }
          }
          else if( NIL != cycl_variables.cyc_varP( arg ) )
          {
            scoped_vars = ConsesLow.cons( arg, scoped_vars );
          }
          else if( NIL != cycl_grammar.fast_escape_quote_term_p( arg ) || NIL != cycl_grammar.fast_quasi_quote_term_p( arg ) || NIL != cycl_variables.cyc_varP( cycl_utilities.formula_arg1( arg, UNPROVIDED ) ) )
          {
            scoped_vars = ConsesLow.cons( arg, scoped_vars );
          }
          else if( NIL != el_utilities.el_formula_p( arg ) )
          {
            SubLObject cdolist_list_var_$2;
            final SubLObject terms = cdolist_list_var_$2 = cycl_utilities.formula_terms( arg, $kw0$IGNORE );
            SubLObject sub_arg = NIL;
            sub_arg = cdolist_list_var_$2.first();
            while ( NIL != cdolist_list_var_$2)
            {
              if( NIL != cycl_variables.cyc_varP( sub_arg ) )
              {
                scoped_vars = ConsesLow.cons( sub_arg, scoped_vars );
              }
              cdolist_list_var_$2 = cdolist_list_var_$2.rest();
              sub_arg = cdolist_list_var_$2.first();
            }
          }
        }
        cdolist_list_var = cdolist_list_var.rest();
        arg = cdolist_list_var.first();
      }
    }
    return Sequences.nreverse( scoped_vars );
  }

  @SubLTranslatedFile.SubL(source = "cycl/czer-trampolines.lisp", position = 2466L)
  public static SubLObject czer_argn_quoted_isa_int_internal(final SubLObject relation, final SubLObject argnum, final SubLObject mt_info)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject result = NIL;
    if( NIL != mt_relevance_macros.mt_function_eq( mt_info, $sym3$RELEVANT_MT_IS_EVERYTHING ) )
    {
      final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding( thread );
      final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding( thread );
      try
      {
        mt_relevance_macros.$relevant_mt_function$.bind( $sym3$RELEVANT_MT_IS_EVERYTHING, thread );
        mt_relevance_macros.$mt$.bind( $const4$EverythingPSC, thread );
        result = kb_accessors.argn_quoted_isa_int( relation, argnum, NIL );
      }
      finally
      {
        mt_relevance_macros.$mt$.rebind( _prev_bind_2, thread );
        mt_relevance_macros.$relevant_mt_function$.rebind( _prev_bind_0, thread );
      }
    }
    else if( NIL != mt_relevance_macros.mt_function_eq( mt_info, $sym5$RELEVANT_MT_IS_ANY_MT ) )
    {
      final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding( thread );
      final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding( thread );
      try
      {
        mt_relevance_macros.$relevant_mt_function$.bind( $sym5$RELEVANT_MT_IS_ANY_MT, thread );
        mt_relevance_macros.$mt$.bind( $const6$InferencePSC, thread );
        result = kb_accessors.argn_quoted_isa_int( relation, argnum, NIL );
      }
      finally
      {
        mt_relevance_macros.$mt$.rebind( _prev_bind_2, thread );
        mt_relevance_macros.$relevant_mt_function$.rebind( _prev_bind_0, thread );
      }
    }
    else if( NIL != hlmt.mt_union_naut_p( mt_info ) )
    {
      final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding( thread );
      final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mts$.currentBinding( thread );
      try
      {
        mt_relevance_macros.$relevant_mt_function$.bind( $sym7$RELEVANT_MT_IS_GENL_MT_OF_LIST_MEMBER, thread );
        mt_relevance_macros.$relevant_mts$.bind( hlmt.mt_union_mts( mt_info ), thread );
        result = kb_accessors.argn_quoted_isa_int( relation, argnum, NIL );
      }
      finally
      {
        mt_relevance_macros.$relevant_mts$.rebind( _prev_bind_2, thread );
        mt_relevance_macros.$relevant_mt_function$.rebind( _prev_bind_0, thread );
      }
    }
    else
    {
      final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding( thread );
      final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding( thread );
      try
      {
        mt_relevance_macros.$relevant_mt_function$.bind( $sym8$RELEVANT_MT_IS_GENL_MT, thread );
        mt_relevance_macros.$mt$.bind( mt_info, thread );
        result = kb_accessors.argn_quoted_isa_int( relation, argnum, NIL );
      }
      finally
      {
        mt_relevance_macros.$mt$.rebind( _prev_bind_2, thread );
        mt_relevance_macros.$relevant_mt_function$.rebind( _prev_bind_0, thread );
      }
    }
    return result;
  }

  @SubLTranslatedFile.SubL(source = "cycl/czer-trampolines.lisp", position = 2466L)
  public static SubLObject czer_argn_quoted_isa_int(final SubLObject relation, final SubLObject argnum, final SubLObject mt_info)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue( thread );
    SubLObject caching_state = NIL;
    if( NIL == v_memoization_state )
    {
      return czer_argn_quoted_isa_int_internal( relation, argnum, mt_info );
    }
    caching_state = memoization_state.memoization_state_lookup( v_memoization_state, $sym2$CZER_ARGN_QUOTED_ISA_INT, UNPROVIDED );
    if( NIL == caching_state )
    {
      caching_state = memoization_state.create_caching_state( memoization_state.memoization_state_lock( v_memoization_state ), $sym2$CZER_ARGN_QUOTED_ISA_INT, THREE_INTEGER, NIL, EQUAL, UNPROVIDED );
      memoization_state.memoization_state_put( v_memoization_state, $sym2$CZER_ARGN_QUOTED_ISA_INT, caching_state );
    }
    final SubLObject sxhash = memoization_state.sxhash_calc_3( relation, argnum, mt_info );
    final SubLObject collisions = memoization_state.caching_state_lookup( caching_state, sxhash, UNPROVIDED );
    if( !collisions.eql( memoization_state.$memoized_item_not_found$.getGlobalValue() ) )
    {
      SubLObject cdolist_list_var = collisions;
      SubLObject collision = NIL;
      collision = cdolist_list_var.first();
      while ( NIL != cdolist_list_var)
      {
        SubLObject cached_args = collision.first();
        final SubLObject results2 = conses_high.second( collision );
        if( relation.equal( cached_args.first() ) )
        {
          cached_args = cached_args.rest();
          if( argnum.equal( cached_args.first() ) )
          {
            cached_args = cached_args.rest();
            if( NIL != cached_args && NIL == cached_args.rest() && mt_info.equal( cached_args.first() ) )
            {
              return memoization_state.caching_results( results2 );
            }
          }
        }
        cdolist_list_var = cdolist_list_var.rest();
        collision = cdolist_list_var.first();
      }
    }
    final SubLObject results3 = Values.arg2( thread.resetMultipleValues(), Values.multiple_value_list( czer_argn_quoted_isa_int_internal( relation, argnum, mt_info ) ) );
    memoization_state.caching_state_enter_multi_key_n( caching_state, sxhash, collisions, results3, ConsesLow.list( relation, argnum, mt_info ) );
    return memoization_state.caching_results( results3 );
  }

  public static SubLObject declare_czer_trampolines_file()
  {
    SubLFiles.declareFunction( me, "czer_memoization_state", "CZER-MEMOIZATION-STATE", 0, 0, false );
    SubLFiles.declareFunction( me, "within_czer_memoization_stateP", "WITHIN-CZER-MEMOIZATION-STATE?", 0, 0, false );
    SubLFiles.declareFunction( me, "czer_scoping_formulaP", "CZER-SCOPING-FORMULA?", 1, 0, false );
    SubLFiles.declareFunction( me, "czer_scoping_args", "CZER-SCOPING-ARGS", 1, 0, false );
    SubLFiles.declareFunction( me, "czer_scoped_vars", "CZER-SCOPED-VARS", 1, 0, false );
    SubLFiles.declareFunction( me, "czer_argn_quoted_isa_int_internal", "CZER-ARGN-QUOTED-ISA-INT-INTERNAL", 3, 0, false );
    SubLFiles.declareFunction( me, "czer_argn_quoted_isa_int", "CZER-ARGN-QUOTED-ISA-INT", 3, 0, false );
    return NIL;
  }

  public static SubLObject init_czer_trampolines_file()
  {
    return NIL;
  }

  public static SubLObject setup_czer_trampolines_file()
  {
    memoization_state.note_memoized_function( $sym2$CZER_ARGN_QUOTED_ISA_INT );
    return NIL;
  }

  @Override
  public void declareFunctions()
  {
    declare_czer_trampolines_file();
  }

  @Override
  public void initializeVariables()
  {
    init_czer_trampolines_file();
  }

  @Override
  public void runTopLevelForms()
  {
    setup_czer_trampolines_file();
  }
  static
  {
    me = new czer_trampolines();
    $kw0$IGNORE = makeKeyword( "IGNORE" );
    $kw1$REGULARIZE = makeKeyword( "REGULARIZE" );
    $sym2$CZER_ARGN_QUOTED_ISA_INT = makeSymbol( "CZER-ARGN-QUOTED-ISA-INT" );
    $sym3$RELEVANT_MT_IS_EVERYTHING = makeSymbol( "RELEVANT-MT-IS-EVERYTHING" );
    $const4$EverythingPSC = constant_handles.reader_make_constant_shell( makeString( "EverythingPSC" ) );
    $sym5$RELEVANT_MT_IS_ANY_MT = makeSymbol( "RELEVANT-MT-IS-ANY-MT" );
    $const6$InferencePSC = constant_handles.reader_make_constant_shell( makeString( "InferencePSC" ) );
    $sym7$RELEVANT_MT_IS_GENL_MT_OF_LIST_MEMBER = makeSymbol( "RELEVANT-MT-IS-GENL-MT-OF-LIST-MEMBER" );
    $sym8$RELEVANT_MT_IS_GENL_MT = makeSymbol( "RELEVANT-MT-IS-GENL-MT" );
  }
}
/*
 * 
 * Total time: 199 ms
 * 
 */