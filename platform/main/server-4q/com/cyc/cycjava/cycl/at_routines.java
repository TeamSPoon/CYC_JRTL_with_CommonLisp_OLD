package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ZeroArityFunction;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions;
import com.cyc.cycjava.cycl.sbhl.sbhl_links;
import com.cyc.cycjava.cycl.sbhl.sbhl_graphs;
import com.cyc.cycjava.cycl.sbhl.sbhl_macros;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.cycjava.cycl.sbhl.sbhl_marking_utilities;
import com.cyc.cycjava.cycl.sbhl.sbhl_link_vars;
import com.cyc.cycjava.cycl.sbhl.sbhl_module_utilities;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.cycjava.cycl.sbhl.sbhl_paranoia;
import com.cyc.cycjava.cycl.sbhl.sbhl_search_vars;
import com.cyc.cycjava.cycl.sbhl.sbhl_module_vars;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.cycjava.cycl.sbhl.sbhl_marking_vars;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class at_routines
    extends
      SubLTranslatedFile
{
  public static final SubLFile me;
  public static final String myName = "com.cyc.cycjava.cycl.at_routines";
  public static final String myFingerPrint = "d6e15485416c073bc03142eaab85bce8a2733edac8dcde7451f4a60cfb64c46f";
  @SubLTranslatedFile.SubL(source = "cycl/at-routines.lisp", position = 925L)
  private static SubLSymbol $at_check_quoted_arg_isaP$;
  @SubLTranslatedFile.SubL(source = "cycl/at-routines.lisp", position = 976L)
  private static SubLSymbol $at_applicable_arg_types$;
  @SubLTranslatedFile.SubL(source = "cycl/at-routines.lisp", position = 1095L)
  public static SubLSymbol $at_applicable_arg_types_with_assertions$;
  @SubLTranslatedFile.SubL(source = "cycl/at-routines.lisp", position = 37386L)
  private static SubLSymbol $arg_collections_caching_state$;
  @SubLTranslatedFile.SubL(source = "cycl/at-routines.lisp", position = 47724L)
  private static SubLSymbol $ind_arg_relevant_constraints$;
  @SubLTranslatedFile.SubL(source = "cycl/at-routines.lisp", position = 54196L)
  private static SubLSymbol $applicable_inter_arg_type_pred_collections_dictionary_caching_state$;
  private static final SubLSymbol $sym0$CLET;
  private static final SubLList $list1;
  private static final SubLSymbol $sym2$ALLOW_ESCAPE_QUOTE_WHEN_QUOTE_PREDICATE;
  private static final SubLSymbol $sym3$RELN;
  private static final SubLSymbol $sym4$WITH_SBHL_RESOURCED_MARKING_SPACES;
  private static final SubLObject $const5$Quote;
  private static final SubLSymbol $kw6$ARG_ISA;
  private static final SubLSymbol $sym7$VALID_FORT_TYPE_;
  private static final SubLSymbol $kw8$MAL_ARG_WRT_COL_DEFN;
  private static final SubLSymbol $kw9$MAL_ARG_WRT_ARG_ISA;
  private static final SubLList $list10;
  private static final SubLSymbol $kw11$SELF;
  private static final SubLSymbol $kw12$AT_CONSTRAINT_GAF;
  private static final SubLSymbol $kw13$WFF_FORMULA;
  private static final SubLSymbol $kw14$WFF_EXPANSION_FORMULA;
  private static final SubLSymbol $kw15$WFF_ORIGINAL_FORMULA;
  private static final SubLSymbol $kw16$MAL_RELN_WRT_ARG_ISA_REQUIRED;
  private static final SubLSymbol $kw17$ARG_NOT_ISA;
  private static final SubLSymbol $kw18$MAL_ARG_WRT_ARG_NOT_ISA;
  private static final SubLSymbol $kw19$MAL_RELN_WRT_ARG_NOT_ISA_REQUIRED;
  private static final SubLSymbol $kw20$ISA;
  private static final SubLSymbol $sym21$FORT_P;
  private static final SubLSymbol $kw22$NAUT;
  private static final SubLSymbol $sym23$VARIABLE_TERM_WRT_ARG_TYPE_;
  private static final SubLSymbol $kw24$MAL_ARG_WRT_ARG_NOT_ISA_DISJOINT;
  private static final SubLSymbol $kw25$ARG_QUOTED_ISA;
  private static final SubLSymbol $kw26$MAL_ARG_WRT_COL_QUOTED_DEFN;
  private static final SubLSymbol $kw27$MAL_ARG_WRT_ARG_QUOTED_ISA;
  private static final SubLSymbol $kw28$QUOTED_ISA;
  private static final SubLObject $const29$termOfUnit;
  private static final SubLObject $const30$CycLReifiableNonAtomicTerm;
  private static final SubLSymbol $kw31$MAL_ARG_WRT_ARG_NOT_QUOTED_ISA_DISJOINT;
  private static final SubLSymbol $kw32$ARG_GENLS;
  private static final SubLObject $const33$Thing;
  private static final SubLSymbol $kw34$MAL_ARG_WRT_ARG_GENL;
  private static final SubLSymbol $kw35$GENLS;
  private static final SubLSymbol $kw36$MAL_ARG_WRT_ARG_NOT_GENLS_DISJOINT;
  private static final SubLObject $const37$equals;
  private static final SubLSymbol $kw38$FORMAT;
  private static final SubLSymbol $kw39$MAL_ARG_WRT_ARG_FORMAT;
  private static final SubLSymbol $kw40$INTER_ARG_ISA;
  private static final SubLList $list41;
  private static final SubLSymbol $kw42$MAL_ARG_WRT_INTER_ARG_DEFN;
  private static final SubLSymbol $kw43$MAL_ARG_WRT_INTER_ARG_ISA;
  private static final SubLList $list44;
  private static final SubLObject $const45$interArgGenl1_2;
  private static final SubLObject $const46$interArgGenl2_1;
  private static final SubLObject $const47$interArgGenl2_4;
  private static final SubLObject $const48$genlPreds;
  private static final SubLSymbol $kw49$DEPTH;
  private static final SubLSymbol $kw50$STACK;
  private static final SubLSymbol $kw51$QUEUE;
  private static final SubLSymbol $sym52$RELEVANT_SBHL_TV_IS_GENERAL_TV;
  private static final SubLSymbol $kw53$ERROR;
  private static final SubLString $str54$_A_is_not_a__A;
  private static final SubLSymbol $sym55$SBHL_TRUE_TV_P;
  private static final SubLSymbol $kw56$CERROR;
  private static final SubLString $str57$continue_anyway;
  private static final SubLSymbol $kw58$WARN;
  private static final SubLString $str59$_A_is_not_a_valid__sbhl_type_erro;
  private static final SubLString $str60$_A_is_neither_SET_P_nor_LISTP_;
  private static final SubLString $str61$attempting_to_bind_direction_link;
  private static final SubLString $str62$Node__a_does_not_pass_sbhl_type_t;
  private static final SubLSymbol $kw63$INTER_ARG_GENL;
  private static final SubLList $list64;
  private static final SubLSymbol $kw65$MAL_ARG_WRT_INTER_ARG_GENL;
  private static final SubLSymbol $kw66$INTER_ARG_NOT_ISA;
  private static final SubLSymbol $kw67$MAL_ARG_WRT_INTER_ARG_NOT_ISA;
  private static final SubLSymbol $kw68$MAL_ARG_WRT_INTER_ARG_NOT_DEFN;
  private static final SubLObject $const69$interArgNotIsa1_2;
  private static final SubLObject $const70$interArgNotIsa2_1;
  private static final SubLSymbol $kw71$INTER_ARG_NOT_GENL;
  private static final SubLSymbol $kw72$MAL_ARG_WRT_INTER_ARG_NOT_GENL;
  private static final SubLObject $const73$interArgNotGenl1_2;
  private static final SubLSymbol $kw74$INTER_ARG_GENL_ISA;
  private static final SubLList $list75;
  private static final SubLSymbol $kw76$MAL_ARG_WRT_INTER_ARG_GENL_ISA;
  private static final SubLObject $const77$interArgGenlIsa2_1;
  private static final SubLSymbol $kw78$INTER_ARG_ISA_GENL;
  private static final SubLList $list79;
  private static final SubLSymbol $kw80$MAL_ARG_WRT_INTER_ARG_ISA_GENL;
  private static final SubLObject $const81$interArgIsaGenl1_2;
  private static final SubLObject $const82$interArgIsaGenl2_1;
  private static final SubLObject $const83$interArgIsaGenl2_3;
  private static final SubLObject $const84$interArgIsaGenl3_2;
  private static final SubLSymbol $kw85$MAL_ARG_WRT_INTER_ARG_NOT_ISA_DISJOINT;
  private static final SubLSymbol $kw86$MAL_ARG_WRT_INTER_ARG_NOT_GENL_DISJOINT;
  private static final SubLSymbol $kw87$INTER_ARG_FORMAT;
  private static final SubLList $list88;
  private static final SubLSymbol $kw89$MAL_ARG_WRT_INTER_ARG_FORMAT;
  private static final SubLObject $const90$interArgDifferent;
  private static final SubLSymbol $kw91$INTER_ARG_DIFFERENT;
  private static final SubLList $list92;
  private static final SubLSymbol $kw93$MAL_ARG_WRT_INTER_ARG_DIFFERENT;
  private static final SubLSymbol $sym94$ARG_COLLECTIONS;
  private static final SubLSymbol $kw95$STRONG_FORT;
  private static final SubLSymbol $kw96$WEAK_FORT;
  private static final SubLSymbol $sym97$_ARG_COLLECTIONS_CACHING_STATE_;
  private static final SubLInteger $int98$4096;
  private static final SubLSymbol $sym99$CLEAR_ARG_COLLECTIONS;
  private static final SubLSymbol $sym100$CYC_VAR_;
  private static final SubLSymbol $kw101$VIA_GENL_PRED;
  private static final SubLSymbol $kw102$VIA_GENL_INVERSE;
  private static final SubLSymbol $kw103$GAF;
  private static final SubLSymbol $kw104$TRUE;
  private static final SubLObject $const105$SingleEntry;
  private static final SubLSymbol $sym106$KBEQ;
  private static final SubLObject $const107$singleEntryFormatInArgs;
  private static final SubLObject $const108$argsIsa;
  private static final SubLObject $const109$argAndRestIsa;
  private static final SubLString $str110$Unknown_constraint_type__s;
  private static final SubLSymbol $kw111$FORT;
  private static final SubLSymbol $kw112$NON_FORT;
  private static final SubLList $list113;
  private static final SubLSymbol $sym114$APPLICABLE_INTER_ARG_TYPE_PRED_COLLECTIONS_INT_MEMOIZED;
  private static final SubLSymbol $sym115$_EXIT;
  private static final SubLInteger $int116$512;
  private static final SubLSymbol $sym117$APPLICABLE_INTER_ARG_TYPE_PRED_COLLECTIONS_DICTIONARY;
  private static final SubLSymbol $sym118$_APPLICABLE_INTER_ARG_TYPE_PRED_COLLECTIONS_DICTIONARY_CACHING_ST;
  private static final SubLInteger $int119$128;
  private static final SubLSymbol $sym120$CLEAR_APPLICABLE_INTER_ARG_TYPE_PRED_COLLECTIONS_DICTIONARY;
  private static final SubLObject $const121$wffConstraintMt;

  @SubLTranslatedFile.SubL(source = "cycl/at-routines.lisp", position = 1267L)
  public static SubLObject with_applicable_arg_types(final SubLObject macroform, final SubLObject environment)
  {
    final SubLObject datum = macroform.rest();
    final SubLObject body;
    final SubLObject current = body = datum;
    return ConsesLow.list( $sym0$CLET, $list1, ConsesLow.list( $sym2$ALLOW_ESCAPE_QUOTE_WHEN_QUOTE_PREDICATE, $sym3$RELN, ConsesLow.listS( $sym4$WITH_SBHL_RESOURCED_MARKING_SPACES, TEN_INTEGER, ConsesLow.append( body,
        NIL ) ) ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/at-routines.lisp", position = 1591L)
  public static SubLObject mal_arg_isaP(final SubLObject reln, final SubLObject arg, final SubLObject argnum)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL == at_vars.$at_check_arg_isaP$.getDynamicValue( thread ) )
    {
      return NIL;
    }
    SubLObject result = NIL;
    SubLObject doneP = NIL;
    SubLObject arg_isas_foundP = NIL;
    final SubLObject _prev_bind_0 = $at_applicable_arg_types$.currentBinding( thread );
    final SubLObject _prev_bind_2 = $at_applicable_arg_types_with_assertions$.currentBinding( thread );
    try
    {
      $at_applicable_arg_types$.bind( NIL, thread );
      $at_applicable_arg_types_with_assertions$.bind( dictionary.new_dictionary( EQUAL, UNPROVIDED ), thread );
      if( reln.eql( $const5$Quote ) )
      {
        final SubLObject _prev_bind_0_$1 = cycl_grammar.$within_quote_form$.currentBinding( thread );
        try
        {
          cycl_grammar.$within_quote_form$.bind( T, thread );
          final SubLObject already_resourcing_p = sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.getDynamicValue( thread );
          final SubLObject _prev_bind_0_$2 = sbhl_marking_vars.$resourced_sbhl_marking_space_limit$.currentBinding( thread );
          final SubLObject _prev_bind_1_$3 = sbhl_marking_vars.$resourced_sbhl_marking_spaces$.currentBinding( thread );
          final SubLObject _prev_bind_3 = sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.currentBinding( thread );
          try
          {
            sbhl_marking_vars.$resourced_sbhl_marking_space_limit$.bind( sbhl_marking_vars.determine_resource_limit( already_resourcing_p, TEN_INTEGER ), thread );
            sbhl_marking_vars.$resourced_sbhl_marking_spaces$.bind( sbhl_marking_vars.possibly_new_marking_resource( already_resourcing_p ), thread );
            sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.bind( T, thread );
            applicable_arg_type_collections( reln, argnum, $kw6$ARG_ISA );
            if( NIL != $at_applicable_arg_types$.getDynamicValue( thread ) )
            {
              final SubLObject fort_type_arg_isas = list_utilities.remove_if_not( $sym7$VALID_FORT_TYPE_, $at_applicable_arg_types$.getDynamicValue( thread ), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
              final SubLObject other_arg_isas = Sequences.remove_if( $sym7$VALID_FORT_TYPE_, $at_applicable_arg_types$.getDynamicValue( thread ), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
              arg_isas_foundP = T;
              if( NIL == doneP )
              {
                SubLObject csome_list_var = fort_type_arg_isas;
                SubLObject col = NIL;
                col = csome_list_var.first();
                while ( NIL == doneP && NIL != csome_list_var)
                {
                  final SubLObject _prev_bind_0_$3 = wff_vars.$wff_violations$.currentBinding( thread );
                  final SubLObject _prev_bind_1_$4 = at_vars.$permitting_denotational_terms_admitted_by_defn_via_isaP$.currentBinding( thread );
                  try
                  {
                    wff_vars.$wff_violations$.bind( NIL, thread );
                    at_vars.$permitting_denotational_terms_admitted_by_defn_via_isaP$.bind( NIL, thread );
                    if( NIL == fort_types_interface.fort_has_typeP( arg, col, UNPROVIDED ) && NIL == at_defns.defns_admitP( col, arg, UNPROVIDED ) )
                    {
                      if( NIL != at_vars.$noting_at_violationsP$.getDynamicValue( thread ) )
                      {
                        note_at_violations( arg_isa_violations( reln, arg, argnum, col ) );
                        note_at_violations( wff.wff_violations() );
                      }
                      result = T;
                      doneP = at_utilities.at_finishedP( result );
                    }
                  }
                  finally
                  {
                    at_vars.$permitting_denotational_terms_admitted_by_defn_via_isaP$.rebind( _prev_bind_1_$4, thread );
                    wff_vars.$wff_violations$.rebind( _prev_bind_0_$3, thread );
                  }
                  csome_list_var = csome_list_var.rest();
                  col = csome_list_var.first();
                }
              }
              if( NIL == doneP )
              {
                SubLObject csome_list_var = other_arg_isas;
                SubLObject col = NIL;
                col = csome_list_var.first();
                while ( NIL == doneP && NIL != csome_list_var)
                {
                  final SubLObject _prev_bind_0_$4 = wff_vars.$wff_violations$.currentBinding( thread );
                  try
                  {
                    wff_vars.$wff_violations$.bind( NIL, thread );
                    if( NIL == at_defns.has_typeP( arg, col, UNPROVIDED ) )
                    {
                      if( NIL != at_vars.$noting_at_violationsP$.getDynamicValue( thread ) )
                      {
                        note_at_violations( arg_isa_violations( reln, arg, argnum, col ) );
                        note_at_violations( wff.wff_violations() );
                      }
                      result = T;
                      doneP = at_utilities.at_finishedP( result );
                    }
                  }
                  finally
                  {
                    wff_vars.$wff_violations$.rebind( _prev_bind_0_$4, thread );
                  }
                  csome_list_var = csome_list_var.rest();
                  col = csome_list_var.first();
                }
              }
            }
          }
          finally
          {
            sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.rebind( _prev_bind_3, thread );
            sbhl_marking_vars.$resourced_sbhl_marking_spaces$.rebind( _prev_bind_1_$3, thread );
            sbhl_marking_vars.$resourced_sbhl_marking_space_limit$.rebind( _prev_bind_0_$2, thread );
          }
        }
        finally
        {
          cycl_grammar.$within_quote_form$.rebind( _prev_bind_0_$1, thread );
        }
      }
      else
      {
        final SubLObject already_resourcing_p2 = sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.getDynamicValue( thread );
        final SubLObject _prev_bind_0_$5 = sbhl_marking_vars.$resourced_sbhl_marking_space_limit$.currentBinding( thread );
        final SubLObject _prev_bind_1_$5 = sbhl_marking_vars.$resourced_sbhl_marking_spaces$.currentBinding( thread );
        final SubLObject _prev_bind_4 = sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.currentBinding( thread );
        try
        {
          sbhl_marking_vars.$resourced_sbhl_marking_space_limit$.bind( sbhl_marking_vars.determine_resource_limit( already_resourcing_p2, TEN_INTEGER ), thread );
          sbhl_marking_vars.$resourced_sbhl_marking_spaces$.bind( sbhl_marking_vars.possibly_new_marking_resource( already_resourcing_p2 ), thread );
          sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.bind( T, thread );
          applicable_arg_type_collections( reln, argnum, $kw6$ARG_ISA );
          if( NIL != $at_applicable_arg_types$.getDynamicValue( thread ) )
          {
            final SubLObject fort_type_arg_isas2 = list_utilities.remove_if_not( $sym7$VALID_FORT_TYPE_, $at_applicable_arg_types$.getDynamicValue( thread ), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
            final SubLObject other_arg_isas2 = Sequences.remove_if( $sym7$VALID_FORT_TYPE_, $at_applicable_arg_types$.getDynamicValue( thread ), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
            arg_isas_foundP = T;
            if( NIL == doneP )
            {
              SubLObject csome_list_var2 = fort_type_arg_isas2;
              SubLObject col2 = NIL;
              col2 = csome_list_var2.first();
              while ( NIL == doneP && NIL != csome_list_var2)
              {
                final SubLObject _prev_bind_0_$6 = wff_vars.$wff_violations$.currentBinding( thread );
                final SubLObject _prev_bind_1_$6 = at_vars.$permitting_denotational_terms_admitted_by_defn_via_isaP$.currentBinding( thread );
                try
                {
                  wff_vars.$wff_violations$.bind( NIL, thread );
                  at_vars.$permitting_denotational_terms_admitted_by_defn_via_isaP$.bind( NIL, thread );
                  if( NIL == fort_types_interface.fort_has_typeP( arg, col2, UNPROVIDED ) && NIL == at_defns.defns_admitP( col2, arg, UNPROVIDED ) )
                  {
                    if( NIL != at_vars.$noting_at_violationsP$.getDynamicValue( thread ) )
                    {
                      note_at_violations( arg_isa_violations( reln, arg, argnum, col2 ) );
                      note_at_violations( wff.wff_violations() );
                    }
                    result = T;
                    doneP = at_utilities.at_finishedP( result );
                  }
                }
                finally
                {
                  at_vars.$permitting_denotational_terms_admitted_by_defn_via_isaP$.rebind( _prev_bind_1_$6, thread );
                  wff_vars.$wff_violations$.rebind( _prev_bind_0_$6, thread );
                }
                csome_list_var2 = csome_list_var2.rest();
                col2 = csome_list_var2.first();
              }
            }
            if( NIL == doneP )
            {
              SubLObject csome_list_var2 = other_arg_isas2;
              SubLObject col2 = NIL;
              col2 = csome_list_var2.first();
              while ( NIL == doneP && NIL != csome_list_var2)
              {
                final SubLObject _prev_bind_0_$7 = wff_vars.$wff_violations$.currentBinding( thread );
                try
                {
                  wff_vars.$wff_violations$.bind( NIL, thread );
                  if( NIL == at_defns.has_typeP( arg, col2, UNPROVIDED ) )
                  {
                    if( NIL != at_vars.$noting_at_violationsP$.getDynamicValue( thread ) )
                    {
                      note_at_violations( arg_isa_violations( reln, arg, argnum, col2 ) );
                      note_at_violations( wff.wff_violations() );
                    }
                    result = T;
                    doneP = at_utilities.at_finishedP( result );
                  }
                }
                finally
                {
                  wff_vars.$wff_violations$.rebind( _prev_bind_0_$7, thread );
                }
                csome_list_var2 = csome_list_var2.rest();
                col2 = csome_list_var2.first();
              }
            }
          }
        }
        finally
        {
          sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.rebind( _prev_bind_4, thread );
          sbhl_marking_vars.$resourced_sbhl_marking_spaces$.rebind( _prev_bind_1_$5, thread );
          sbhl_marking_vars.$resourced_sbhl_marking_space_limit$.rebind( _prev_bind_0_$5, thread );
        }
      }
    }
    finally
    {
      $at_applicable_arg_types_with_assertions$.rebind( _prev_bind_2, thread );
      $at_applicable_arg_types$.rebind( _prev_bind_0, thread );
    }
    if( NIL != at_vars.at_some_arg_isa_requiredP() && NIL == doneP )
    {
      if( NIL != arg_isas_foundP )
      {
        result = NIL;
      }
      else
      {
        at_utilities.note_at_violation( arg_isa_required_violation( reln, argnum, UNPROVIDED ) );
        result = T;
      }
    }
    return result;
  }

  @SubLTranslatedFile.SubL(source = "cycl/at-routines.lisp", position = 3240L)
  public static SubLObject arg_isa_violations(final SubLObject reln, final SubLObject arg, final SubLObject argnum, final SubLObject col)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject constraints = dictionary.dictionary_lookup( $at_applicable_arg_types_with_assertions$.getDynamicValue( thread ), col, UNPROVIDED );
    SubLObject violations = NIL;
    SubLObject cdolist_list_var = constraints;
    SubLObject constraint_details = NIL;
    constraint_details = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      violations = ConsesLow.cons( arg_isa_violation( reln, arg, argnum, col, constraint_details ), violations );
      cdolist_list_var = cdolist_list_var.rest();
      constraint_details = cdolist_list_var.first();
    }
    return violations;
  }

  @SubLTranslatedFile.SubL(source = "cycl/at-routines.lisp", position = 3555L)
  public static SubLObject arg_isa_violation(final SubLObject reln, final SubLObject arg, final SubLObject argnum, final SubLObject col, final SubLObject constraint_details)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject mt = mt_relevance_macros.$mt$.getDynamicValue( thread );
    final SubLObject module = ( NIL != kb_accessors.admitting_defnsP( col, mt ) ) ? $kw8$MAL_ARG_WRT_COL_DEFN : $kw9$MAL_ARG_WRT_ARG_ISA;
    return arg_isa_violation_int( reln, arg, argnum, col, constraint_details, module );
  }

  @SubLTranslatedFile.SubL(source = "cycl/at-routines.lisp", position = 3819L)
  public static SubLObject arg_isa_violation_int(final SubLObject reln, final SubLObject arg, final SubLObject argnum, final SubLObject col, final SubLObject constraint_details, final SubLObject module)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject mt = mt_relevance_macros.$mt$.getDynamicValue( thread );
    SubLObject data = NIL;
    SubLObject constraint_reln = NIL;
    SubLObject via = NIL;
    SubLObject constraint_gaf = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( constraint_details, constraint_details, $list10 );
    constraint_reln = constraint_details.first();
    SubLObject current = constraint_details.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, constraint_details, $list10 );
    via = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, constraint_details, $list10 );
    constraint_gaf = current.first();
    current = current.rest();
    if( NIL == current )
    {
      if( via != $kw11$SELF )
      {
        data = ConsesLow.cons( ConsesLow.list( via, constraint_reln ), data );
      }
      if( NIL == wff_vars.wff_violation_data_terseP() )
      {
        if( NIL != at_vars.$include_at_constraint_gafP$.getDynamicValue( thread ) && NIL != constraint_gaf )
        {
          data = ConsesLow.cons( ConsesLow.list( $kw12$AT_CONSTRAINT_GAF, constraint_gaf ), data );
        }
        data = ConsesLow.append( data, wff_violation_verbose_data() );
      }
      return ConsesLow.listS( module, new SubLObject[] { arg, reln, argnum, col, mt, ConsesLow.append( data, NIL )
      } );
    }
    cdestructuring_bind.cdestructuring_bind_error( constraint_details, $list10 );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/at-routines.lisp", position = 4412L)
  public static SubLObject wff_violation_verbose_data()
  {
    SubLObject data = NIL;
    if( NIL != wff_vars.wff_formula() )
    {
      data = ConsesLow.cons( ConsesLow.list( $kw13$WFF_FORMULA, wff_vars.wff_formula() ), data );
    }
    if( NIL != wff_vars.wff_expansion_formula() )
    {
      data = ConsesLow.cons( ConsesLow.list( $kw14$WFF_EXPANSION_FORMULA, wff_vars.wff_expansion_formula() ), data );
    }
    if( NIL != wff_vars.wff_original_formula() )
    {
      data = ConsesLow.cons( ConsesLow.list( $kw15$WFF_ORIGINAL_FORMULA, wff_vars.wff_original_formula() ), data );
    }
    return data;
  }

  @SubLTranslatedFile.SubL(source = "cycl/at-routines.lisp", position = 4778L)
  public static SubLObject arg_isa_required_violation(final SubLObject reln, final SubLObject argnum, SubLObject mt)
  {
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    return ConsesLow.list( $kw16$MAL_RELN_WRT_ARG_ISA_REQUIRED, reln, argnum, mt );
  }

  @SubLTranslatedFile.SubL(source = "cycl/at-routines.lisp", position = 4911L)
  public static SubLObject mal_arg_not_isaP(final SubLObject reln, final SubLObject arg, final SubLObject argnum)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL == at_vars.$at_check_arg_not_isaP$.getDynamicValue( thread ) )
    {
      return NIL;
    }
    SubLObject result = NIL;
    SubLObject doneP = NIL;
    SubLObject arg_not_isas_foundP = NIL;
    final SubLObject _prev_bind_0 = $at_applicable_arg_types$.currentBinding( thread );
    final SubLObject _prev_bind_2 = $at_applicable_arg_types_with_assertions$.currentBinding( thread );
    try
    {
      $at_applicable_arg_types$.bind( NIL, thread );
      $at_applicable_arg_types_with_assertions$.bind( dictionary.new_dictionary( EQUAL, UNPROVIDED ), thread );
      if( reln.eql( $const5$Quote ) )
      {
        final SubLObject _prev_bind_0_$12 = cycl_grammar.$within_quote_form$.currentBinding( thread );
        try
        {
          cycl_grammar.$within_quote_form$.bind( T, thread );
          final SubLObject already_resourcing_p = sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.getDynamicValue( thread );
          final SubLObject _prev_bind_0_$13 = sbhl_marking_vars.$resourced_sbhl_marking_space_limit$.currentBinding( thread );
          final SubLObject _prev_bind_1_$14 = sbhl_marking_vars.$resourced_sbhl_marking_spaces$.currentBinding( thread );
          final SubLObject _prev_bind_3 = sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.currentBinding( thread );
          try
          {
            sbhl_marking_vars.$resourced_sbhl_marking_space_limit$.bind( sbhl_marking_vars.determine_resource_limit( already_resourcing_p, TEN_INTEGER ), thread );
            sbhl_marking_vars.$resourced_sbhl_marking_spaces$.bind( sbhl_marking_vars.possibly_new_marking_resource( already_resourcing_p ), thread );
            sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.bind( T, thread );
            applicable_arg_type_collections( reln, argnum, $kw17$ARG_NOT_ISA );
            if( NIL != $at_applicable_arg_types$.getDynamicValue( thread ) )
            {
              final SubLObject fort_type_arg_not_isas = list_utilities.remove_if_not( $sym7$VALID_FORT_TYPE_, $at_applicable_arg_types$.getDynamicValue( thread ), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
              final SubLObject other_arg_not_isas = Sequences.remove_if( $sym7$VALID_FORT_TYPE_, $at_applicable_arg_types$.getDynamicValue( thread ), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
              arg_not_isas_foundP = T;
              if( NIL == doneP )
              {
                SubLObject csome_list_var = fort_type_arg_not_isas;
                SubLObject col = NIL;
                col = csome_list_var.first();
                while ( NIL == doneP && NIL != csome_list_var)
                {
                  final SubLObject _prev_bind_0_$14 = wff_vars.$wff_violations$.currentBinding( thread );
                  final SubLObject _prev_bind_1_$15 = at_vars.$permitting_denotational_terms_admitted_by_defn_via_isaP$.currentBinding( thread );
                  try
                  {
                    wff_vars.$wff_violations$.bind( NIL, thread );
                    at_vars.$permitting_denotational_terms_admitted_by_defn_via_isaP$.bind( NIL, thread );
                    if( NIL != fort_types_interface.fort_has_typeP( arg, col, UNPROVIDED ) && NIL == at_defns.defns_admitP( col, arg, UNPROVIDED ) )
                    {
                      if( NIL != at_vars.$noting_at_violationsP$.getDynamicValue( thread ) )
                      {
                        note_at_violations( arg_not_isa_violations( reln, arg, argnum, col ) );
                        note_at_violations( wff.wff_violations() );
                      }
                      result = T;
                      doneP = at_utilities.at_finishedP( result );
                    }
                  }
                  finally
                  {
                    at_vars.$permitting_denotational_terms_admitted_by_defn_via_isaP$.rebind( _prev_bind_1_$15, thread );
                    wff_vars.$wff_violations$.rebind( _prev_bind_0_$14, thread );
                  }
                  csome_list_var = csome_list_var.rest();
                  col = csome_list_var.first();
                }
              }
              if( NIL == doneP )
              {
                SubLObject csome_list_var = other_arg_not_isas;
                SubLObject col = NIL;
                col = csome_list_var.first();
                while ( NIL == doneP && NIL != csome_list_var)
                {
                  final SubLObject _prev_bind_0_$15 = wff_vars.$wff_violations$.currentBinding( thread );
                  try
                  {
                    wff_vars.$wff_violations$.bind( NIL, thread );
                    if( NIL != at_defns.has_typeP( arg, col, UNPROVIDED ) )
                    {
                      if( NIL != at_vars.$noting_at_violationsP$.getDynamicValue( thread ) )
                      {
                        note_at_violations( arg_not_isa_violations( reln, arg, argnum, col ) );
                        note_at_violations( wff.wff_violations() );
                      }
                      result = T;
                      doneP = at_utilities.at_finishedP( result );
                    }
                  }
                  finally
                  {
                    wff_vars.$wff_violations$.rebind( _prev_bind_0_$15, thread );
                  }
                  csome_list_var = csome_list_var.rest();
                  col = csome_list_var.first();
                }
              }
            }
          }
          finally
          {
            sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.rebind( _prev_bind_3, thread );
            sbhl_marking_vars.$resourced_sbhl_marking_spaces$.rebind( _prev_bind_1_$14, thread );
            sbhl_marking_vars.$resourced_sbhl_marking_space_limit$.rebind( _prev_bind_0_$13, thread );
          }
        }
        finally
        {
          cycl_grammar.$within_quote_form$.rebind( _prev_bind_0_$12, thread );
        }
      }
      else
      {
        final SubLObject already_resourcing_p2 = sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.getDynamicValue( thread );
        final SubLObject _prev_bind_0_$16 = sbhl_marking_vars.$resourced_sbhl_marking_space_limit$.currentBinding( thread );
        final SubLObject _prev_bind_1_$16 = sbhl_marking_vars.$resourced_sbhl_marking_spaces$.currentBinding( thread );
        final SubLObject _prev_bind_4 = sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.currentBinding( thread );
        try
        {
          sbhl_marking_vars.$resourced_sbhl_marking_space_limit$.bind( sbhl_marking_vars.determine_resource_limit( already_resourcing_p2, TEN_INTEGER ), thread );
          sbhl_marking_vars.$resourced_sbhl_marking_spaces$.bind( sbhl_marking_vars.possibly_new_marking_resource( already_resourcing_p2 ), thread );
          sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.bind( T, thread );
          applicable_arg_type_collections( reln, argnum, $kw17$ARG_NOT_ISA );
          if( NIL != $at_applicable_arg_types$.getDynamicValue( thread ) )
          {
            final SubLObject fort_type_arg_not_isas2 = list_utilities.remove_if_not( $sym7$VALID_FORT_TYPE_, $at_applicable_arg_types$.getDynamicValue( thread ), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
            final SubLObject other_arg_not_isas2 = Sequences.remove_if( $sym7$VALID_FORT_TYPE_, $at_applicable_arg_types$.getDynamicValue( thread ), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
            arg_not_isas_foundP = T;
            if( NIL == doneP )
            {
              SubLObject csome_list_var2 = fort_type_arg_not_isas2;
              SubLObject col2 = NIL;
              col2 = csome_list_var2.first();
              while ( NIL == doneP && NIL != csome_list_var2)
              {
                final SubLObject _prev_bind_0_$17 = wff_vars.$wff_violations$.currentBinding( thread );
                final SubLObject _prev_bind_1_$17 = at_vars.$permitting_denotational_terms_admitted_by_defn_via_isaP$.currentBinding( thread );
                try
                {
                  wff_vars.$wff_violations$.bind( NIL, thread );
                  at_vars.$permitting_denotational_terms_admitted_by_defn_via_isaP$.bind( NIL, thread );
                  if( NIL != fort_types_interface.fort_has_typeP( arg, col2, UNPROVIDED ) && NIL == at_defns.defns_admitP( col2, arg, UNPROVIDED ) )
                  {
                    if( NIL != at_vars.$noting_at_violationsP$.getDynamicValue( thread ) )
                    {
                      note_at_violations( arg_not_isa_violations( reln, arg, argnum, col2 ) );
                      note_at_violations( wff.wff_violations() );
                    }
                    result = T;
                    doneP = at_utilities.at_finishedP( result );
                  }
                }
                finally
                {
                  at_vars.$permitting_denotational_terms_admitted_by_defn_via_isaP$.rebind( _prev_bind_1_$17, thread );
                  wff_vars.$wff_violations$.rebind( _prev_bind_0_$17, thread );
                }
                csome_list_var2 = csome_list_var2.rest();
                col2 = csome_list_var2.first();
              }
            }
            if( NIL == doneP )
            {
              SubLObject csome_list_var2 = other_arg_not_isas2;
              SubLObject col2 = NIL;
              col2 = csome_list_var2.first();
              while ( NIL == doneP && NIL != csome_list_var2)
              {
                final SubLObject _prev_bind_0_$18 = wff_vars.$wff_violations$.currentBinding( thread );
                try
                {
                  wff_vars.$wff_violations$.bind( NIL, thread );
                  if( NIL != at_defns.has_typeP( arg, col2, UNPROVIDED ) )
                  {
                    if( NIL != at_vars.$noting_at_violationsP$.getDynamicValue( thread ) )
                    {
                      note_at_violations( arg_not_isa_violations( reln, arg, argnum, col2 ) );
                      note_at_violations( wff.wff_violations() );
                    }
                    result = T;
                    doneP = at_utilities.at_finishedP( result );
                  }
                }
                finally
                {
                  wff_vars.$wff_violations$.rebind( _prev_bind_0_$18, thread );
                }
                csome_list_var2 = csome_list_var2.rest();
                col2 = csome_list_var2.first();
              }
            }
          }
        }
        finally
        {
          sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.rebind( _prev_bind_4, thread );
          sbhl_marking_vars.$resourced_sbhl_marking_spaces$.rebind( _prev_bind_1_$16, thread );
          sbhl_marking_vars.$resourced_sbhl_marking_space_limit$.rebind( _prev_bind_0_$16, thread );
        }
      }
    }
    finally
    {
      $at_applicable_arg_types_with_assertions$.rebind( _prev_bind_2, thread );
      $at_applicable_arg_types$.rebind( _prev_bind_0, thread );
    }
    return result;
  }

  @SubLTranslatedFile.SubL(source = "cycl/at-routines.lisp", position = 6349L)
  public static SubLObject arg_not_isa_violations(final SubLObject reln, final SubLObject arg, final SubLObject argnum, final SubLObject col)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject constraints = dictionary.dictionary_lookup( $at_applicable_arg_types_with_assertions$.getDynamicValue( thread ), col, UNPROVIDED );
    SubLObject violations = NIL;
    SubLObject cdolist_list_var = constraints;
    SubLObject constraint_details = NIL;
    constraint_details = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      violations = ConsesLow.cons( arg_not_isa_violation( reln, arg, argnum, col, constraint_details ), violations );
      cdolist_list_var = cdolist_list_var.rest();
      constraint_details = cdolist_list_var.first();
    }
    return violations;
  }

  @SubLTranslatedFile.SubL(source = "cycl/at-routines.lisp", position = 6672L)
  public static SubLObject arg_not_isa_violation(final SubLObject reln, final SubLObject arg, final SubLObject argnum, final SubLObject col, final SubLObject constraint_details)
  {
    final SubLObject module = $kw18$MAL_ARG_WRT_ARG_NOT_ISA;
    return arg_not_isa_violation_int( reln, arg, argnum, col, constraint_details, module );
  }

  @SubLTranslatedFile.SubL(source = "cycl/at-routines.lisp", position = 6882L)
  public static SubLObject arg_not_isa_violation_int(final SubLObject reln, final SubLObject arg, final SubLObject argnum, final SubLObject col, final SubLObject constraint_details, final SubLObject module)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject mt = mt_relevance_macros.$mt$.getDynamicValue( thread );
    SubLObject data = NIL;
    SubLObject constraint_reln = NIL;
    SubLObject via = NIL;
    SubLObject constraint_gaf = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( constraint_details, constraint_details, $list10 );
    constraint_reln = constraint_details.first();
    SubLObject current = constraint_details.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, constraint_details, $list10 );
    via = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, constraint_details, $list10 );
    constraint_gaf = current.first();
    current = current.rest();
    if( NIL == current )
    {
      if( via != $kw11$SELF )
      {
        data = ConsesLow.cons( ConsesLow.list( via, constraint_reln ), data );
      }
      if( NIL == wff_vars.wff_violation_data_terseP() )
      {
        if( NIL != at_vars.$include_at_constraint_gafP$.getDynamicValue( thread ) && NIL != constraint_gaf )
        {
          data = ConsesLow.cons( ConsesLow.list( $kw12$AT_CONSTRAINT_GAF, constraint_gaf ), data );
        }
        data = ConsesLow.append( data, wff_violation_verbose_data() );
      }
      return ConsesLow.listS( module, new SubLObject[] { arg, reln, argnum, col, mt, ConsesLow.append( data, NIL )
      } );
    }
    cdestructuring_bind.cdestructuring_bind_error( constraint_details, $list10 );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/at-routines.lisp", position = 7479L)
  public static SubLObject arg_not_isa_required_violation(final SubLObject reln, final SubLObject argnum, SubLObject mt)
  {
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    return ConsesLow.list( $kw19$MAL_RELN_WRT_ARG_NOT_ISA_REQUIRED, reln, argnum, mt );
  }

  @SubLTranslatedFile.SubL(source = "cycl/at-routines.lisp", position = 7620L)
  public static SubLObject mal_arg_not_isa_disjointP(final SubLObject reln, final SubLObject arg, final SubLObject argnum)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL == at_vars.$at_check_not_isa_disjointP$.getDynamicValue( thread ) )
    {
      return NIL;
    }
    SubLObject result = NIL;
    SubLObject doneP = NIL;
    final SubLObject _prev_bind_0 = $at_applicable_arg_types$.currentBinding( thread );
    final SubLObject _prev_bind_2 = $at_applicable_arg_types_with_assertions$.currentBinding( thread );
    try
    {
      $at_applicable_arg_types$.bind( NIL, thread );
      $at_applicable_arg_types_with_assertions$.bind( dictionary.new_dictionary( EQUAL, UNPROVIDED ), thread );
      if( reln.eql( $const5$Quote ) )
      {
        final SubLObject _prev_bind_0_$23 = cycl_grammar.$within_quote_form$.currentBinding( thread );
        try
        {
          cycl_grammar.$within_quote_form$.bind( T, thread );
          final SubLObject already_resourcing_p = sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.getDynamicValue( thread );
          final SubLObject _prev_bind_0_$24 = sbhl_marking_vars.$resourced_sbhl_marking_space_limit$.currentBinding( thread );
          final SubLObject _prev_bind_1_$25 = sbhl_marking_vars.$resourced_sbhl_marking_spaces$.currentBinding( thread );
          final SubLObject _prev_bind_3 = sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.currentBinding( thread );
          try
          {
            sbhl_marking_vars.$resourced_sbhl_marking_space_limit$.bind( sbhl_marking_vars.determine_resource_limit( already_resourcing_p, TEN_INTEGER ), thread );
            sbhl_marking_vars.$resourced_sbhl_marking_spaces$.bind( sbhl_marking_vars.possibly_new_marking_resource( already_resourcing_p ), thread );
            sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.bind( T, thread );
            applicable_arg_type_collections( reln, argnum, $kw6$ARG_ISA );
            if( NIL != $at_applicable_arg_types$.getDynamicValue( thread ) )
            {
              final SubLObject isa_collections = arg_collections( arg, $kw20$ISA, at_vars.$at_arg_type$.getDynamicValue( thread ), mt_relevance_macros.mt_info( UNPROVIDED ) );
              final SubLObject _prev_bind_0_$25 = sdc.$ignoring_sdcP$.currentBinding( thread );
              final SubLObject _prev_bind_1_$26 = wff_vars.$wff_violations$.currentBinding( thread );
              try
              {
                sdc.$ignoring_sdcP$.bind( makeBoolean( NIL == at_vars.$at_check_not_sdcP$.getDynamicValue( thread ) ), thread );
                wff_vars.$wff_violations$.bind( NIL, thread );
                if( NIL != disjoint_with.any_disjoint_with_anyP_memoized( isa_collections, list_utilities.remove_if_not( $sym21$FORT_P, $at_applicable_arg_types$.getDynamicValue( thread ), UNPROVIDED, UNPROVIDED,
                    UNPROVIDED, UNPROVIDED ), mt_relevance_macros.$mt$.getDynamicValue( thread ), UNPROVIDED, UNPROVIDED ) )
                {
                  if( NIL != at_vars.$noting_at_violationsP$.getDynamicValue( thread ) && NIL == doneP )
                  {
                    SubLObject csome_list_var = $at_applicable_arg_types$.getDynamicValue( thread );
                    SubLObject arg_isa = NIL;
                    arg_isa = csome_list_var.first();
                    while ( NIL == doneP && NIL != csome_list_var)
                    {
                      if( NIL != forts.fort_p( arg_isa ) && NIL != disjoint_with.any_disjoint_withP( isa_collections, arg_isa, UNPROVIDED, UNPROVIDED ) )
                      {
                        note_at_violations( arg_not_isa_disjoint_violations( reln, arg, argnum, arg_isa ) );
                      }
                      csome_list_var = csome_list_var.rest();
                      arg_isa = csome_list_var.first();
                    }
                  }
                  result = T;
                  doneP = at_utilities.at_finishedP( result );
                }
                if( NIL == doneP )
                {
                  SubLObject csome_list_var = $at_applicable_arg_types$.getDynamicValue( thread );
                  SubLObject arg_isa = NIL;
                  arg_isa = csome_list_var.first();
                  while ( NIL == doneP && NIL != csome_list_var)
                  {
                    if( ( $kw22$NAUT != at_vars.$at_arg_type$.getDynamicValue( thread ) || NIL == cycl_utilities.formula_find_if( Symbols.symbol_function( $sym23$VARIABLE_TERM_WRT_ARG_TYPE_ ), arg, UNPROVIDED,
                        UNPROVIDED ) ) && NIL != at_defns.defns_rejectP( arg_isa, arg, UNPROVIDED ) )
                    {
                      if( NIL != at_vars.$noting_at_violationsP$.getDynamicValue( thread ) )
                      {
                        note_at_violations( arg_not_isa_disjoint_violations( reln, arg, argnum, arg_isa ) );
                        note_at_violations( wff.wff_violations() );
                      }
                      result = T;
                      doneP = at_utilities.at_finishedP( result );
                    }
                    csome_list_var = csome_list_var.rest();
                    arg_isa = csome_list_var.first();
                  }
                }
              }
              finally
              {
                wff_vars.$wff_violations$.rebind( _prev_bind_1_$26, thread );
                sdc.$ignoring_sdcP$.rebind( _prev_bind_0_$25, thread );
              }
            }
          }
          finally
          {
            sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.rebind( _prev_bind_3, thread );
            sbhl_marking_vars.$resourced_sbhl_marking_spaces$.rebind( _prev_bind_1_$25, thread );
            sbhl_marking_vars.$resourced_sbhl_marking_space_limit$.rebind( _prev_bind_0_$24, thread );
          }
        }
        finally
        {
          cycl_grammar.$within_quote_form$.rebind( _prev_bind_0_$23, thread );
        }
      }
      else
      {
        final SubLObject already_resourcing_p2 = sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.getDynamicValue( thread );
        final SubLObject _prev_bind_0_$26 = sbhl_marking_vars.$resourced_sbhl_marking_space_limit$.currentBinding( thread );
        final SubLObject _prev_bind_1_$27 = sbhl_marking_vars.$resourced_sbhl_marking_spaces$.currentBinding( thread );
        final SubLObject _prev_bind_4 = sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.currentBinding( thread );
        try
        {
          sbhl_marking_vars.$resourced_sbhl_marking_space_limit$.bind( sbhl_marking_vars.determine_resource_limit( already_resourcing_p2, TEN_INTEGER ), thread );
          sbhl_marking_vars.$resourced_sbhl_marking_spaces$.bind( sbhl_marking_vars.possibly_new_marking_resource( already_resourcing_p2 ), thread );
          sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.bind( T, thread );
          applicable_arg_type_collections( reln, argnum, $kw6$ARG_ISA );
          if( NIL != $at_applicable_arg_types$.getDynamicValue( thread ) )
          {
            final SubLObject isa_collections2 = arg_collections( arg, $kw20$ISA, at_vars.$at_arg_type$.getDynamicValue( thread ), mt_relevance_macros.mt_info( UNPROVIDED ) );
            final SubLObject _prev_bind_0_$27 = sdc.$ignoring_sdcP$.currentBinding( thread );
            final SubLObject _prev_bind_1_$28 = wff_vars.$wff_violations$.currentBinding( thread );
            try
            {
              sdc.$ignoring_sdcP$.bind( makeBoolean( NIL == at_vars.$at_check_not_sdcP$.getDynamicValue( thread ) ), thread );
              wff_vars.$wff_violations$.bind( NIL, thread );
              if( NIL != disjoint_with.any_disjoint_with_anyP_memoized( isa_collections2, list_utilities.remove_if_not( $sym21$FORT_P, $at_applicable_arg_types$.getDynamicValue( thread ), UNPROVIDED, UNPROVIDED,
                  UNPROVIDED, UNPROVIDED ), mt_relevance_macros.$mt$.getDynamicValue( thread ), UNPROVIDED, UNPROVIDED ) )
              {
                if( NIL != at_vars.$noting_at_violationsP$.getDynamicValue( thread ) && NIL == doneP )
                {
                  SubLObject csome_list_var2 = $at_applicable_arg_types$.getDynamicValue( thread );
                  SubLObject arg_isa2 = NIL;
                  arg_isa2 = csome_list_var2.first();
                  while ( NIL == doneP && NIL != csome_list_var2)
                  {
                    if( NIL != forts.fort_p( arg_isa2 ) && NIL != disjoint_with.any_disjoint_withP( isa_collections2, arg_isa2, UNPROVIDED, UNPROVIDED ) )
                    {
                      note_at_violations( arg_not_isa_disjoint_violations( reln, arg, argnum, arg_isa2 ) );
                    }
                    csome_list_var2 = csome_list_var2.rest();
                    arg_isa2 = csome_list_var2.first();
                  }
                }
                result = T;
                doneP = at_utilities.at_finishedP( result );
              }
              if( NIL == doneP )
              {
                SubLObject csome_list_var2 = $at_applicable_arg_types$.getDynamicValue( thread );
                SubLObject arg_isa2 = NIL;
                arg_isa2 = csome_list_var2.first();
                while ( NIL == doneP && NIL != csome_list_var2)
                {
                  if( ( $kw22$NAUT != at_vars.$at_arg_type$.getDynamicValue( thread ) || NIL == cycl_utilities.formula_find_if( Symbols.symbol_function( $sym23$VARIABLE_TERM_WRT_ARG_TYPE_ ), arg, UNPROVIDED,
                      UNPROVIDED ) ) && NIL != at_defns.defns_rejectP( arg_isa2, arg, UNPROVIDED ) )
                  {
                    if( NIL != at_vars.$noting_at_violationsP$.getDynamicValue( thread ) )
                    {
                      note_at_violations( arg_not_isa_disjoint_violations( reln, arg, argnum, arg_isa2 ) );
                      note_at_violations( wff.wff_violations() );
                    }
                    result = T;
                    doneP = at_utilities.at_finishedP( result );
                  }
                  csome_list_var2 = csome_list_var2.rest();
                  arg_isa2 = csome_list_var2.first();
                }
              }
            }
            finally
            {
              wff_vars.$wff_violations$.rebind( _prev_bind_1_$28, thread );
              sdc.$ignoring_sdcP$.rebind( _prev_bind_0_$27, thread );
            }
          }
        }
        finally
        {
          sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.rebind( _prev_bind_4, thread );
          sbhl_marking_vars.$resourced_sbhl_marking_spaces$.rebind( _prev_bind_1_$27, thread );
          sbhl_marking_vars.$resourced_sbhl_marking_space_limit$.rebind( _prev_bind_0_$26, thread );
        }
      }
    }
    finally
    {
      $at_applicable_arg_types_with_assertions$.rebind( _prev_bind_2, thread );
      $at_applicable_arg_types$.rebind( _prev_bind_0, thread );
    }
    return result;
  }

  @SubLTranslatedFile.SubL(source = "cycl/at-routines.lisp", position = 9188L)
  public static SubLObject arg_not_isa_disjoint_violations(final SubLObject reln, final SubLObject arg, final SubLObject argnum, final SubLObject col)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject constraints = dictionary.dictionary_lookup( $at_applicable_arg_types_with_assertions$.getDynamicValue( thread ), col, UNPROVIDED );
    SubLObject violations = NIL;
    SubLObject cdolist_list_var = constraints;
    SubLObject constraint_details = NIL;
    constraint_details = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      violations = ConsesLow.cons( arg_not_isa_disjoint_violation_int( $kw24$MAL_ARG_WRT_ARG_NOT_ISA_DISJOINT, reln, arg, argnum, col, constraint_details ), violations );
      cdolist_list_var = cdolist_list_var.rest();
      constraint_details = cdolist_list_var.first();
    }
    return violations;
  }

  @SubLTranslatedFile.SubL(source = "cycl/at-routines.lisp", position = 9567L)
  public static SubLObject arg_not_isa_disjoint_violation_int(final SubLObject module, final SubLObject reln, final SubLObject arg, final SubLObject argnum, final SubLObject col, final SubLObject constraint_details)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject mt = mt_relevance_macros.$mt$.getDynamicValue( thread );
    SubLObject data = NIL;
    SubLObject constraint_reln = NIL;
    SubLObject via = NIL;
    SubLObject constraint_gaf = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( constraint_details, constraint_details, $list10 );
    constraint_reln = constraint_details.first();
    SubLObject current = constraint_details.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, constraint_details, $list10 );
    via = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, constraint_details, $list10 );
    constraint_gaf = current.first();
    current = current.rest();
    if( NIL == current )
    {
      if( via != $kw11$SELF )
      {
        data = ConsesLow.cons( ConsesLow.list( via, constraint_reln ), data );
      }
      if( NIL == wff_vars.wff_violation_data_terseP() )
      {
        if( NIL != at_vars.$include_at_constraint_gafP$.getDynamicValue( thread ) && NIL != constraint_gaf )
        {
          data = ConsesLow.cons( ConsesLow.list( $kw12$AT_CONSTRAINT_GAF, constraint_gaf ), data );
        }
        data = ConsesLow.append( data, wff_violation_verbose_data() );
      }
      return ConsesLow.listS( module, new SubLObject[] { arg, reln, argnum, col, mt, ConsesLow.append( data, NIL )
      } );
    }
    cdestructuring_bind.cdestructuring_bind_error( constraint_details, $list10 );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/at-routines.lisp", position = 10127L)
  public static SubLObject mal_arg_quoted_isaP(final SubLObject reln, final SubLObject arg, final SubLObject argnum)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL == at_vars.$at_check_arg_quoted_isaP$.getDynamicValue( thread ) )
    {
      return NIL;
    }
    SubLObject result = NIL;
    SubLObject doneP = NIL;
    final SubLObject _prev_bind_0 = $at_applicable_arg_types$.currentBinding( thread );
    final SubLObject _prev_bind_2 = $at_applicable_arg_types_with_assertions$.currentBinding( thread );
    try
    {
      $at_applicable_arg_types$.bind( NIL, thread );
      $at_applicable_arg_types_with_assertions$.bind( dictionary.new_dictionary( EQUAL, UNPROVIDED ), thread );
      if( reln.eql( $const5$Quote ) )
      {
        final SubLObject _prev_bind_0_$32 = cycl_grammar.$within_quote_form$.currentBinding( thread );
        try
        {
          cycl_grammar.$within_quote_form$.bind( T, thread );
          final SubLObject already_resourcing_p = sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.getDynamicValue( thread );
          final SubLObject _prev_bind_0_$33 = sbhl_marking_vars.$resourced_sbhl_marking_space_limit$.currentBinding( thread );
          final SubLObject _prev_bind_1_$34 = sbhl_marking_vars.$resourced_sbhl_marking_spaces$.currentBinding( thread );
          final SubLObject _prev_bind_3 = sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.currentBinding( thread );
          try
          {
            sbhl_marking_vars.$resourced_sbhl_marking_space_limit$.bind( sbhl_marking_vars.determine_resource_limit( already_resourcing_p, TEN_INTEGER ), thread );
            sbhl_marking_vars.$resourced_sbhl_marking_spaces$.bind( sbhl_marking_vars.possibly_new_marking_resource( already_resourcing_p ), thread );
            sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.bind( T, thread );
            applicable_arg_type_collections( reln, argnum, $kw25$ARG_QUOTED_ISA );
            if( NIL != $at_applicable_arg_types$.getDynamicValue( thread ) && NIL == doneP )
            {
              SubLObject csome_list_var = $at_applicable_arg_types$.getDynamicValue( thread );
              SubLObject col = NIL;
              col = csome_list_var.first();
              while ( NIL == doneP && NIL != csome_list_var)
              {
                final SubLObject _prev_bind_0_$34 = wff_vars.$wff_violations$.currentBinding( thread );
                try
                {
                  wff_vars.$wff_violations$.bind( NIL, thread );
                  if( NIL == at_defns.quoted_has_typeP( arg, col, UNPROVIDED ) )
                  {
                    if( NIL != at_vars.$noting_at_violationsP$.getDynamicValue( thread ) )
                    {
                      note_at_violations( arg_quoted_isa_violations( reln, arg, argnum, col ) );
                      note_at_violations( wff.wff_violations() );
                    }
                    result = T;
                    doneP = at_utilities.at_finishedP( result );
                  }
                }
                finally
                {
                  wff_vars.$wff_violations$.rebind( _prev_bind_0_$34, thread );
                }
                csome_list_var = csome_list_var.rest();
                col = csome_list_var.first();
              }
            }
          }
          finally
          {
            sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.rebind( _prev_bind_3, thread );
            sbhl_marking_vars.$resourced_sbhl_marking_spaces$.rebind( _prev_bind_1_$34, thread );
            sbhl_marking_vars.$resourced_sbhl_marking_space_limit$.rebind( _prev_bind_0_$33, thread );
          }
        }
        finally
        {
          cycl_grammar.$within_quote_form$.rebind( _prev_bind_0_$32, thread );
        }
      }
      else
      {
        final SubLObject already_resourcing_p2 = sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.getDynamicValue( thread );
        final SubLObject _prev_bind_0_$35 = sbhl_marking_vars.$resourced_sbhl_marking_space_limit$.currentBinding( thread );
        final SubLObject _prev_bind_1_$35 = sbhl_marking_vars.$resourced_sbhl_marking_spaces$.currentBinding( thread );
        final SubLObject _prev_bind_4 = sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.currentBinding( thread );
        try
        {
          sbhl_marking_vars.$resourced_sbhl_marking_space_limit$.bind( sbhl_marking_vars.determine_resource_limit( already_resourcing_p2, TEN_INTEGER ), thread );
          sbhl_marking_vars.$resourced_sbhl_marking_spaces$.bind( sbhl_marking_vars.possibly_new_marking_resource( already_resourcing_p2 ), thread );
          sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.bind( T, thread );
          applicable_arg_type_collections( reln, argnum, $kw25$ARG_QUOTED_ISA );
          if( NIL != $at_applicable_arg_types$.getDynamicValue( thread ) && NIL == doneP )
          {
            SubLObject csome_list_var2 = $at_applicable_arg_types$.getDynamicValue( thread );
            SubLObject col2 = NIL;
            col2 = csome_list_var2.first();
            while ( NIL == doneP && NIL != csome_list_var2)
            {
              final SubLObject _prev_bind_0_$36 = wff_vars.$wff_violations$.currentBinding( thread );
              try
              {
                wff_vars.$wff_violations$.bind( NIL, thread );
                if( NIL == at_defns.quoted_has_typeP( arg, col2, UNPROVIDED ) )
                {
                  if( NIL != at_vars.$noting_at_violationsP$.getDynamicValue( thread ) )
                  {
                    note_at_violations( arg_quoted_isa_violations( reln, arg, argnum, col2 ) );
                    note_at_violations( wff.wff_violations() );
                  }
                  result = T;
                  doneP = at_utilities.at_finishedP( result );
                }
              }
              finally
              {
                wff_vars.$wff_violations$.rebind( _prev_bind_0_$36, thread );
              }
              csome_list_var2 = csome_list_var2.rest();
              col2 = csome_list_var2.first();
            }
          }
        }
        finally
        {
          sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.rebind( _prev_bind_4, thread );
          sbhl_marking_vars.$resourced_sbhl_marking_spaces$.rebind( _prev_bind_1_$35, thread );
          sbhl_marking_vars.$resourced_sbhl_marking_space_limit$.rebind( _prev_bind_0_$35, thread );
        }
      }
    }
    finally
    {
      $at_applicable_arg_types_with_assertions$.rebind( _prev_bind_2, thread );
      $at_applicable_arg_types$.rebind( _prev_bind_0, thread );
    }
    return result;
  }

  @SubLTranslatedFile.SubL(source = "cycl/at-routines.lisp", position = 10891L)
  public static SubLObject arg_quoted_isa_violations(final SubLObject reln, final SubLObject arg, final SubLObject argnum, final SubLObject col)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject constraints = dictionary.dictionary_lookup( $at_applicable_arg_types_with_assertions$.getDynamicValue( thread ), col, UNPROVIDED );
    SubLObject violations = NIL;
    SubLObject cdolist_list_var = constraints;
    SubLObject constraint_details = NIL;
    constraint_details = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      violations = ConsesLow.cons( arg_quoted_isa_violation( reln, arg, argnum, col, constraint_details ), violations );
      cdolist_list_var = cdolist_list_var.rest();
      constraint_details = cdolist_list_var.first();
    }
    return violations;
  }

  @SubLTranslatedFile.SubL(source = "cycl/at-routines.lisp", position = 11220L)
  public static SubLObject arg_quoted_isa_violation(final SubLObject reln, final SubLObject arg, final SubLObject argnum, final SubLObject col, final SubLObject constraint_details)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject mt = mt_relevance_macros.$mt$.getDynamicValue( thread );
    final SubLObject module = ( NIL != kb_accessors.admitting_quoted_defnsP( col, mt ) ) ? $kw26$MAL_ARG_WRT_COL_QUOTED_DEFN : $kw27$MAL_ARG_WRT_ARG_QUOTED_ISA;
    return arg_isa_violation_int( reln, arg, argnum, col, constraint_details, module );
  }

  @SubLTranslatedFile.SubL(source = "cycl/at-routines.lisp", position = 11512L)
  public static SubLObject mal_arg_not_quoted_isa_disjointP(final SubLObject reln, final SubLObject arg, final SubLObject argnum)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL == at_vars.$at_check_not_quoted_isa_disjointP$.getDynamicValue( thread ) )
    {
      return NIL;
    }
    SubLObject result = NIL;
    SubLObject doneP = NIL;
    final SubLObject _prev_bind_0 = $at_applicable_arg_types$.currentBinding( thread );
    final SubLObject _prev_bind_2 = $at_applicable_arg_types_with_assertions$.currentBinding( thread );
    try
    {
      $at_applicable_arg_types$.bind( NIL, thread );
      $at_applicable_arg_types_with_assertions$.bind( dictionary.new_dictionary( EQUAL, UNPROVIDED ), thread );
      if( reln.eql( $const5$Quote ) )
      {
        final SubLObject _prev_bind_0_$39 = cycl_grammar.$within_quote_form$.currentBinding( thread );
        try
        {
          cycl_grammar.$within_quote_form$.bind( T, thread );
          final SubLObject already_resourcing_p = sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.getDynamicValue( thread );
          final SubLObject _prev_bind_0_$40 = sbhl_marking_vars.$resourced_sbhl_marking_space_limit$.currentBinding( thread );
          final SubLObject _prev_bind_1_$41 = sbhl_marking_vars.$resourced_sbhl_marking_spaces$.currentBinding( thread );
          final SubLObject _prev_bind_3 = sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.currentBinding( thread );
          try
          {
            sbhl_marking_vars.$resourced_sbhl_marking_space_limit$.bind( sbhl_marking_vars.determine_resource_limit( already_resourcing_p, TEN_INTEGER ), thread );
            sbhl_marking_vars.$resourced_sbhl_marking_spaces$.bind( sbhl_marking_vars.possibly_new_marking_resource( already_resourcing_p ), thread );
            sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.bind( T, thread );
            applicable_arg_type_collections( reln, argnum, $kw25$ARG_QUOTED_ISA );
            if( NIL != $at_applicable_arg_types$.getDynamicValue( thread ) )
            {
              final SubLObject quoted_isa_collections = arg_collections( arg, $kw28$QUOTED_ISA, at_vars.$at_arg_type$.getDynamicValue( thread ), mt_relevance_macros.mt_info( UNPROVIDED ) );
              final SubLObject _prev_bind_0_$41 = sdc.$ignoring_sdcP$.currentBinding( thread );
              try
              {
                sdc.$ignoring_sdcP$.bind( makeBoolean( NIL == at_vars.$at_check_not_sdcP$.getDynamicValue( thread ) ), thread );
                if( NIL == doneP )
                {
                  SubLObject csome_list_var = $at_applicable_arg_types$.getDynamicValue( thread );
                  SubLObject arg_quoted_isa = NIL;
                  arg_quoted_isa = csome_list_var.first();
                  while ( NIL == doneP && NIL != csome_list_var)
                  {
                    final SubLObject _prev_bind_0_$42 = wff_vars.$wff_violations$.currentBinding( thread );
                    try
                    {
                      wff_vars.$wff_violations$.bind( NIL, thread );
                      if( NIL != forts.fort_p( arg_quoted_isa ) )
                      {
                        if( !reln.eql( $const29$termOfUnit ) || !argnum.eql( TWO_INTEGER ) || !arg_quoted_isa.eql( $const30$CycLReifiableNonAtomicTerm ) || NIL == at_defns.quiet_quoted_defns_admitP( arg_quoted_isa, arg,
                            UNPROVIDED ) )
                        {
                          if( NIL != disjoint_with.any_disjoint_withP( quoted_isa_collections, arg_quoted_isa, UNPROVIDED, UNPROVIDED ) )
                          {
                            if( NIL != at_vars.$noting_at_violationsP$.getDynamicValue( thread ) )
                            {
                              note_at_violations( arg_not_quoted_isa_disjoint_violations( reln, arg, argnum, arg_quoted_isa ) );
                            }
                            result = T;
                            doneP = at_utilities.at_finishedP( result );
                          }
                          else if( $kw22$NAUT != at_vars.$at_arg_type$.getDynamicValue( thread ) || NIL == cycl_utilities.formula_find_if( Symbols.symbol_function( $sym23$VARIABLE_TERM_WRT_ARG_TYPE_ ), arg, UNPROVIDED,
                              UNPROVIDED ) )
                          {
                            if( NIL != at_defns.quoted_defns_rejectP( arg_quoted_isa, arg, UNPROVIDED ) )
                            {
                              if( NIL != at_vars.$noting_at_violationsP$.getDynamicValue( thread ) )
                              {
                                note_at_violations( arg_not_quoted_isa_disjoint_violations( reln, arg, argnum, arg_quoted_isa ) );
                                note_at_violations( wff.wff_violations() );
                              }
                              result = T;
                              doneP = at_utilities.at_finishedP( result );
                            }
                          }
                        }
                      }
                    }
                    finally
                    {
                      wff_vars.$wff_violations$.rebind( _prev_bind_0_$42, thread );
                    }
                    csome_list_var = csome_list_var.rest();
                    arg_quoted_isa = csome_list_var.first();
                  }
                }
              }
              finally
              {
                sdc.$ignoring_sdcP$.rebind( _prev_bind_0_$41, thread );
              }
            }
          }
          finally
          {
            sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.rebind( _prev_bind_3, thread );
            sbhl_marking_vars.$resourced_sbhl_marking_spaces$.rebind( _prev_bind_1_$41, thread );
            sbhl_marking_vars.$resourced_sbhl_marking_space_limit$.rebind( _prev_bind_0_$40, thread );
          }
        }
        finally
        {
          cycl_grammar.$within_quote_form$.rebind( _prev_bind_0_$39, thread );
        }
      }
      else
      {
        final SubLObject already_resourcing_p2 = sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.getDynamicValue( thread );
        final SubLObject _prev_bind_0_$43 = sbhl_marking_vars.$resourced_sbhl_marking_space_limit$.currentBinding( thread );
        final SubLObject _prev_bind_1_$42 = sbhl_marking_vars.$resourced_sbhl_marking_spaces$.currentBinding( thread );
        final SubLObject _prev_bind_4 = sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.currentBinding( thread );
        try
        {
          sbhl_marking_vars.$resourced_sbhl_marking_space_limit$.bind( sbhl_marking_vars.determine_resource_limit( already_resourcing_p2, TEN_INTEGER ), thread );
          sbhl_marking_vars.$resourced_sbhl_marking_spaces$.bind( sbhl_marking_vars.possibly_new_marking_resource( already_resourcing_p2 ), thread );
          sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.bind( T, thread );
          applicable_arg_type_collections( reln, argnum, $kw25$ARG_QUOTED_ISA );
          if( NIL != $at_applicable_arg_types$.getDynamicValue( thread ) )
          {
            final SubLObject quoted_isa_collections2 = arg_collections( arg, $kw28$QUOTED_ISA, at_vars.$at_arg_type$.getDynamicValue( thread ), mt_relevance_macros.mt_info( UNPROVIDED ) );
            final SubLObject _prev_bind_0_$44 = sdc.$ignoring_sdcP$.currentBinding( thread );
            try
            {
              sdc.$ignoring_sdcP$.bind( makeBoolean( NIL == at_vars.$at_check_not_sdcP$.getDynamicValue( thread ) ), thread );
              if( NIL == doneP )
              {
                SubLObject csome_list_var2 = $at_applicable_arg_types$.getDynamicValue( thread );
                SubLObject arg_quoted_isa2 = NIL;
                arg_quoted_isa2 = csome_list_var2.first();
                while ( NIL == doneP && NIL != csome_list_var2)
                {
                  final SubLObject _prev_bind_0_$45 = wff_vars.$wff_violations$.currentBinding( thread );
                  try
                  {
                    wff_vars.$wff_violations$.bind( NIL, thread );
                    if( NIL != forts.fort_p( arg_quoted_isa2 ) )
                    {
                      if( !reln.eql( $const29$termOfUnit ) || !argnum.eql( TWO_INTEGER ) || !arg_quoted_isa2.eql( $const30$CycLReifiableNonAtomicTerm ) || NIL == at_defns.quiet_quoted_defns_admitP( arg_quoted_isa2, arg,
                          UNPROVIDED ) )
                      {
                        if( NIL != disjoint_with.any_disjoint_withP( quoted_isa_collections2, arg_quoted_isa2, UNPROVIDED, UNPROVIDED ) )
                        {
                          if( NIL != at_vars.$noting_at_violationsP$.getDynamicValue( thread ) )
                          {
                            note_at_violations( arg_not_quoted_isa_disjoint_violations( reln, arg, argnum, arg_quoted_isa2 ) );
                          }
                          result = T;
                          doneP = at_utilities.at_finishedP( result );
                        }
                        else if( $kw22$NAUT != at_vars.$at_arg_type$.getDynamicValue( thread ) || NIL == cycl_utilities.formula_find_if( Symbols.symbol_function( $sym23$VARIABLE_TERM_WRT_ARG_TYPE_ ), arg, UNPROVIDED,
                            UNPROVIDED ) )
                        {
                          if( NIL != at_defns.quoted_defns_rejectP( arg_quoted_isa2, arg, UNPROVIDED ) )
                          {
                            if( NIL != at_vars.$noting_at_violationsP$.getDynamicValue( thread ) )
                            {
                              note_at_violations( arg_not_quoted_isa_disjoint_violations( reln, arg, argnum, arg_quoted_isa2 ) );
                              note_at_violations( wff.wff_violations() );
                            }
                            result = T;
                            doneP = at_utilities.at_finishedP( result );
                          }
                        }
                      }
                    }
                  }
                  finally
                  {
                    wff_vars.$wff_violations$.rebind( _prev_bind_0_$45, thread );
                  }
                  csome_list_var2 = csome_list_var2.rest();
                  arg_quoted_isa2 = csome_list_var2.first();
                }
              }
            }
            finally
            {
              sdc.$ignoring_sdcP$.rebind( _prev_bind_0_$44, thread );
            }
          }
        }
        finally
        {
          sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.rebind( _prev_bind_4, thread );
          sbhl_marking_vars.$resourced_sbhl_marking_spaces$.rebind( _prev_bind_1_$42, thread );
          sbhl_marking_vars.$resourced_sbhl_marking_space_limit$.rebind( _prev_bind_0_$43, thread );
        }
      }
    }
    finally
    {
      $at_applicable_arg_types_with_assertions$.rebind( _prev_bind_2, thread );
      $at_applicable_arg_types$.rebind( _prev_bind_0, thread );
    }
    return result;
  }

  @SubLTranslatedFile.SubL(source = "cycl/at-routines.lisp", position = 12992L)
  public static SubLObject arg_not_quoted_isa_disjoint_violations(final SubLObject reln, final SubLObject arg, final SubLObject argnum, final SubLObject arg_quoted_isa)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject constraints = dictionary.dictionary_lookup( $at_applicable_arg_types_with_assertions$.getDynamicValue( thread ), arg_quoted_isa, UNPROVIDED );
    SubLObject violations = NIL;
    SubLObject cdolist_list_var = constraints;
    SubLObject constraint_details = NIL;
    constraint_details = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      violations = ConsesLow.cons( arg_not_isa_disjoint_violation_int( $kw31$MAL_ARG_WRT_ARG_NOT_QUOTED_ISA_DISJOINT, reln, arg, argnum, arg_quoted_isa, constraint_details ), violations );
      cdolist_list_var = cdolist_list_var.rest();
      constraint_details = cdolist_list_var.first();
    }
    return violations;
  }

  @SubLTranslatedFile.SubL(source = "cycl/at-routines.lisp", position = 13418L)
  public static SubLObject mal_arg_genlsP(final SubLObject reln, final SubLObject arg, final SubLObject argnum)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject result = NIL;
    SubLObject doneP = NIL;
    final SubLObject _prev_bind_0 = $at_applicable_arg_types$.currentBinding( thread );
    final SubLObject _prev_bind_2 = $at_applicable_arg_types_with_assertions$.currentBinding( thread );
    try
    {
      $at_applicable_arg_types$.bind( NIL, thread );
      $at_applicable_arg_types_with_assertions$.bind( dictionary.new_dictionary( EQUAL, UNPROVIDED ), thread );
      if( reln.eql( $const5$Quote ) )
      {
        final SubLObject _prev_bind_0_$48 = cycl_grammar.$within_quote_form$.currentBinding( thread );
        try
        {
          cycl_grammar.$within_quote_form$.bind( T, thread );
          final SubLObject already_resourcing_p = sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.getDynamicValue( thread );
          final SubLObject _prev_bind_0_$49 = sbhl_marking_vars.$resourced_sbhl_marking_space_limit$.currentBinding( thread );
          final SubLObject _prev_bind_1_$50 = sbhl_marking_vars.$resourced_sbhl_marking_spaces$.currentBinding( thread );
          final SubLObject _prev_bind_3 = sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.currentBinding( thread );
          try
          {
            sbhl_marking_vars.$resourced_sbhl_marking_space_limit$.bind( sbhl_marking_vars.determine_resource_limit( already_resourcing_p, TEN_INTEGER ), thread );
            sbhl_marking_vars.$resourced_sbhl_marking_spaces$.bind( sbhl_marking_vars.possibly_new_marking_resource( already_resourcing_p ), thread );
            sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.bind( T, thread );
            applicable_arg_type_collections( reln, argnum, $kw32$ARG_GENLS );
            if( NIL != $at_applicable_arg_types$.getDynamicValue( thread ) )
            {
              if( NIL != fort_types_interface.collection_p( arg ) )
              {
                $at_applicable_arg_types$.setDynamicValue( Sequences.remove( $const33$Thing, $at_applicable_arg_types$.getDynamicValue( thread ), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED ), thread );
              }
              if( NIL == doneP )
              {
                SubLObject csome_list_var = $at_applicable_arg_types$.getDynamicValue( thread );
                SubLObject col = NIL;
                col = csome_list_var.first();
                while ( NIL == doneP && NIL != csome_list_var)
                {
                  if( NIL != forts.fort_p( col ) && NIL != at_defns.at_denotational_term_p( arg, UNPROVIDED ) && NIL == genls.genlP( arg, col, UNPROVIDED, UNPROVIDED ) )
                  {
                    if( NIL != at_vars.$noting_at_violationsP$.getDynamicValue( thread ) )
                    {
                      note_at_violations( arg_genl_violations( reln, arg, argnum, col ) );
                    }
                    result = T;
                    doneP = at_utilities.at_finishedP( result );
                  }
                  csome_list_var = csome_list_var.rest();
                  col = csome_list_var.first();
                }
              }
            }
            else
            {
              result = NIL;
            }
          }
          finally
          {
            sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.rebind( _prev_bind_3, thread );
            sbhl_marking_vars.$resourced_sbhl_marking_spaces$.rebind( _prev_bind_1_$50, thread );
            sbhl_marking_vars.$resourced_sbhl_marking_space_limit$.rebind( _prev_bind_0_$49, thread );
          }
        }
        finally
        {
          cycl_grammar.$within_quote_form$.rebind( _prev_bind_0_$48, thread );
        }
      }
      else
      {
        final SubLObject already_resourcing_p2 = sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.getDynamicValue( thread );
        final SubLObject _prev_bind_0_$50 = sbhl_marking_vars.$resourced_sbhl_marking_space_limit$.currentBinding( thread );
        final SubLObject _prev_bind_1_$51 = sbhl_marking_vars.$resourced_sbhl_marking_spaces$.currentBinding( thread );
        final SubLObject _prev_bind_4 = sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.currentBinding( thread );
        try
        {
          sbhl_marking_vars.$resourced_sbhl_marking_space_limit$.bind( sbhl_marking_vars.determine_resource_limit( already_resourcing_p2, TEN_INTEGER ), thread );
          sbhl_marking_vars.$resourced_sbhl_marking_spaces$.bind( sbhl_marking_vars.possibly_new_marking_resource( already_resourcing_p2 ), thread );
          sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.bind( T, thread );
          applicable_arg_type_collections( reln, argnum, $kw32$ARG_GENLS );
          if( NIL != $at_applicable_arg_types$.getDynamicValue( thread ) )
          {
            if( NIL != fort_types_interface.collection_p( arg ) )
            {
              $at_applicable_arg_types$.setDynamicValue( Sequences.remove( $const33$Thing, $at_applicable_arg_types$.getDynamicValue( thread ), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED ), thread );
            }
            if( NIL == doneP )
            {
              SubLObject csome_list_var2 = $at_applicable_arg_types$.getDynamicValue( thread );
              SubLObject col2 = NIL;
              col2 = csome_list_var2.first();
              while ( NIL == doneP && NIL != csome_list_var2)
              {
                if( NIL != forts.fort_p( col2 ) && NIL != at_defns.at_denotational_term_p( arg, UNPROVIDED ) && NIL == genls.genlP( arg, col2, UNPROVIDED, UNPROVIDED ) )
                {
                  if( NIL != at_vars.$noting_at_violationsP$.getDynamicValue( thread ) )
                  {
                    note_at_violations( arg_genl_violations( reln, arg, argnum, col2 ) );
                  }
                  result = T;
                  doneP = at_utilities.at_finishedP( result );
                }
                csome_list_var2 = csome_list_var2.rest();
                col2 = csome_list_var2.first();
              }
            }
          }
          else
          {
            result = NIL;
          }
        }
        finally
        {
          sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.rebind( _prev_bind_4, thread );
          sbhl_marking_vars.$resourced_sbhl_marking_spaces$.rebind( _prev_bind_1_$51, thread );
          sbhl_marking_vars.$resourced_sbhl_marking_space_limit$.rebind( _prev_bind_0_$50, thread );
        }
      }
    }
    finally
    {
      $at_applicable_arg_types_with_assertions$.rebind( _prev_bind_2, thread );
      $at_applicable_arg_types$.rebind( _prev_bind_0, thread );
    }
    return result;
  }

  @SubLTranslatedFile.SubL(source = "cycl/at-routines.lisp", position = 14277L)
  public static SubLObject arg_genl_violations(final SubLObject reln, final SubLObject arg, final SubLObject argnum, final SubLObject col)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject constraints = dictionary.dictionary_lookup( $at_applicable_arg_types_with_assertions$.getDynamicValue( thread ), col, UNPROVIDED );
    SubLObject violations = NIL;
    SubLObject cdolist_list_var = constraints;
    SubLObject constraint_details = NIL;
    constraint_details = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      violations = ConsesLow.cons( arg_genl_violation( reln, arg, argnum, col, constraint_details ), violations );
      cdolist_list_var = cdolist_list_var.rest();
      constraint_details = cdolist_list_var.first();
    }
    return violations;
  }

  @SubLTranslatedFile.SubL(source = "cycl/at-routines.lisp", position = 14594L)
  public static SubLObject arg_genl_violation(final SubLObject reln, final SubLObject arg, final SubLObject argnum, final SubLObject col, final SubLObject constraint_details)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject mt = mt_relevance_macros.$mt$.getDynamicValue( thread );
    final SubLObject module = $kw34$MAL_ARG_WRT_ARG_GENL;
    SubLObject data = NIL;
    SubLObject constraint_reln = NIL;
    SubLObject via = NIL;
    SubLObject constraint_gaf = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( constraint_details, constraint_details, $list10 );
    constraint_reln = constraint_details.first();
    SubLObject current = constraint_details.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, constraint_details, $list10 );
    via = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, constraint_details, $list10 );
    constraint_gaf = current.first();
    current = current.rest();
    if( NIL == current )
    {
      if( via != $kw11$SELF )
      {
        data = ConsesLow.cons( ConsesLow.list( via, constraint_reln ), data );
      }
      if( NIL == wff_vars.wff_violation_data_terseP() )
      {
        if( NIL != at_vars.$include_at_constraint_gafP$.getDynamicValue( thread ) && NIL != constraint_gaf )
        {
          data = ConsesLow.cons( ConsesLow.list( $kw12$AT_CONSTRAINT_GAF, constraint_gaf ), data );
        }
        data = ConsesLow.append( data, wff_violation_verbose_data() );
      }
      return ConsesLow.listS( module, new SubLObject[] { arg, reln, argnum, col, mt, ConsesLow.append( data, NIL )
      } );
    }
    cdestructuring_bind.cdestructuring_bind_error( constraint_details, $list10 );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/at-routines.lisp", position = 15217L)
  public static SubLObject mal_arg_not_genls_disjointP(final SubLObject reln, final SubLObject arg, final SubLObject argnum)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL == at_vars.$at_check_not_genls_disjointP$.getDynamicValue( thread ) )
    {
      return NIL;
    }
    SubLObject result = NIL;
    SubLObject doneP = NIL;
    final SubLObject _prev_bind_0 = $at_applicable_arg_types$.currentBinding( thread );
    final SubLObject _prev_bind_2 = $at_applicable_arg_types_with_assertions$.currentBinding( thread );
    try
    {
      $at_applicable_arg_types$.bind( NIL, thread );
      $at_applicable_arg_types_with_assertions$.bind( dictionary.new_dictionary( EQUAL, UNPROVIDED ), thread );
      if( reln.eql( $const5$Quote ) )
      {
        final SubLObject _prev_bind_0_$53 = cycl_grammar.$within_quote_form$.currentBinding( thread );
        try
        {
          cycl_grammar.$within_quote_form$.bind( T, thread );
          final SubLObject already_resourcing_p = sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.getDynamicValue( thread );
          final SubLObject _prev_bind_0_$54 = sbhl_marking_vars.$resourced_sbhl_marking_space_limit$.currentBinding( thread );
          final SubLObject _prev_bind_1_$55 = sbhl_marking_vars.$resourced_sbhl_marking_spaces$.currentBinding( thread );
          final SubLObject _prev_bind_3 = sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.currentBinding( thread );
          try
          {
            sbhl_marking_vars.$resourced_sbhl_marking_space_limit$.bind( sbhl_marking_vars.determine_resource_limit( already_resourcing_p, TEN_INTEGER ), thread );
            sbhl_marking_vars.$resourced_sbhl_marking_spaces$.bind( sbhl_marking_vars.possibly_new_marking_resource( already_resourcing_p ), thread );
            sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.bind( T, thread );
            applicable_arg_type_collections( reln, argnum, $kw32$ARG_GENLS );
            if( NIL != $at_applicable_arg_types$.getDynamicValue( thread ) )
            {
              final SubLObject genl_collections = arg_collections( arg, $kw35$GENLS, at_vars.$at_arg_type$.getDynamicValue( thread ), mt_relevance_macros.mt_info( UNPROVIDED ) );
              final SubLObject _prev_bind_0_$55 = sdc.$ignoring_sdcP$.currentBinding( thread );
              try
              {
                sdc.$ignoring_sdcP$.bind( makeBoolean( NIL == at_vars.$at_check_not_sdcP$.getDynamicValue( thread ) ), thread );
                if( NIL != disjoint_with.any_disjoint_with_anyP_memoized( genl_collections, list_utilities.remove_if_not( $sym21$FORT_P, $at_applicable_arg_types$.getDynamicValue( thread ), UNPROVIDED, UNPROVIDED,
                    UNPROVIDED, UNPROVIDED ), mt_relevance_macros.$mt$.getDynamicValue( thread ), UNPROVIDED, UNPROVIDED ) )
                {
                  if( NIL != at_vars.$noting_at_violationsP$.getDynamicValue( thread ) && NIL == doneP )
                  {
                    SubLObject csome_list_var = $at_applicable_arg_types$.getDynamicValue( thread );
                    SubLObject arg_genl = NIL;
                    arg_genl = csome_list_var.first();
                    while ( NIL == doneP && NIL != csome_list_var)
                    {
                      if( NIL != forts.fort_p( arg_genl ) && NIL != disjoint_with.any_disjoint_withP( genl_collections, arg_genl, UNPROVIDED, UNPROVIDED ) )
                      {
                        note_at_violations( arg_not_genl_disjoint_violations( reln, arg, argnum, arg_genl ) );
                      }
                      csome_list_var = csome_list_var.rest();
                      arg_genl = csome_list_var.first();
                    }
                  }
                  result = T;
                  doneP = at_utilities.at_finishedP( result );
                }
              }
              finally
              {
                sdc.$ignoring_sdcP$.rebind( _prev_bind_0_$55, thread );
              }
            }
          }
          finally
          {
            sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.rebind( _prev_bind_3, thread );
            sbhl_marking_vars.$resourced_sbhl_marking_spaces$.rebind( _prev_bind_1_$55, thread );
            sbhl_marking_vars.$resourced_sbhl_marking_space_limit$.rebind( _prev_bind_0_$54, thread );
          }
        }
        finally
        {
          cycl_grammar.$within_quote_form$.rebind( _prev_bind_0_$53, thread );
        }
      }
      else
      {
        final SubLObject already_resourcing_p2 = sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.getDynamicValue( thread );
        final SubLObject _prev_bind_0_$56 = sbhl_marking_vars.$resourced_sbhl_marking_space_limit$.currentBinding( thread );
        final SubLObject _prev_bind_1_$56 = sbhl_marking_vars.$resourced_sbhl_marking_spaces$.currentBinding( thread );
        final SubLObject _prev_bind_4 = sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.currentBinding( thread );
        try
        {
          sbhl_marking_vars.$resourced_sbhl_marking_space_limit$.bind( sbhl_marking_vars.determine_resource_limit( already_resourcing_p2, TEN_INTEGER ), thread );
          sbhl_marking_vars.$resourced_sbhl_marking_spaces$.bind( sbhl_marking_vars.possibly_new_marking_resource( already_resourcing_p2 ), thread );
          sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.bind( T, thread );
          applicable_arg_type_collections( reln, argnum, $kw32$ARG_GENLS );
          if( NIL != $at_applicable_arg_types$.getDynamicValue( thread ) )
          {
            final SubLObject genl_collections2 = arg_collections( arg, $kw35$GENLS, at_vars.$at_arg_type$.getDynamicValue( thread ), mt_relevance_macros.mt_info( UNPROVIDED ) );
            final SubLObject _prev_bind_0_$57 = sdc.$ignoring_sdcP$.currentBinding( thread );
            try
            {
              sdc.$ignoring_sdcP$.bind( makeBoolean( NIL == at_vars.$at_check_not_sdcP$.getDynamicValue( thread ) ), thread );
              if( NIL != disjoint_with.any_disjoint_with_anyP_memoized( genl_collections2, list_utilities.remove_if_not( $sym21$FORT_P, $at_applicable_arg_types$.getDynamicValue( thread ), UNPROVIDED, UNPROVIDED,
                  UNPROVIDED, UNPROVIDED ), mt_relevance_macros.$mt$.getDynamicValue( thread ), UNPROVIDED, UNPROVIDED ) )
              {
                if( NIL != at_vars.$noting_at_violationsP$.getDynamicValue( thread ) && NIL == doneP )
                {
                  SubLObject csome_list_var2 = $at_applicable_arg_types$.getDynamicValue( thread );
                  SubLObject arg_genl2 = NIL;
                  arg_genl2 = csome_list_var2.first();
                  while ( NIL == doneP && NIL != csome_list_var2)
                  {
                    if( NIL != forts.fort_p( arg_genl2 ) && NIL != disjoint_with.any_disjoint_withP( genl_collections2, arg_genl2, UNPROVIDED, UNPROVIDED ) )
                    {
                      note_at_violations( arg_not_genl_disjoint_violations( reln, arg, argnum, arg_genl2 ) );
                    }
                    csome_list_var2 = csome_list_var2.rest();
                    arg_genl2 = csome_list_var2.first();
                  }
                }
                result = T;
                doneP = at_utilities.at_finishedP( result );
              }
            }
            finally
            {
              sdc.$ignoring_sdcP$.rebind( _prev_bind_0_$57, thread );
            }
          }
        }
        finally
        {
          sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.rebind( _prev_bind_4, thread );
          sbhl_marking_vars.$resourced_sbhl_marking_spaces$.rebind( _prev_bind_1_$56, thread );
          sbhl_marking_vars.$resourced_sbhl_marking_space_limit$.rebind( _prev_bind_0_$56, thread );
        }
      }
    }
    finally
    {
      $at_applicable_arg_types_with_assertions$.rebind( _prev_bind_2, thread );
      $at_applicable_arg_types$.rebind( _prev_bind_0, thread );
    }
    return result;
  }

  @SubLTranslatedFile.SubL(source = "cycl/at-routines.lisp", position = 16275L)
  public static SubLObject arg_not_genl_disjoint_violations(final SubLObject reln, final SubLObject arg, final SubLObject argnum, final SubLObject arg_genl)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject constraints = dictionary.dictionary_lookup( $at_applicable_arg_types_with_assertions$.getDynamicValue( thread ), arg_genl, UNPROVIDED );
    final SubLObject mt = mt_relevance_macros.$mt$.getDynamicValue( thread );
    final SubLObject module = $kw36$MAL_ARG_WRT_ARG_NOT_GENLS_DISJOINT;
    SubLObject violations = NIL;
    SubLObject cdolist_list_var = constraints;
    SubLObject constraint_details = NIL;
    constraint_details = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      SubLObject current;
      final SubLObject datum = current = constraint_details;
      SubLObject constraint_reln = NIL;
      SubLObject via = NIL;
      SubLObject constraint_gaf = NIL;
      cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list10 );
      constraint_reln = current.first();
      current = current.rest();
      cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list10 );
      via = current.first();
      current = current.rest();
      cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list10 );
      constraint_gaf = current.first();
      current = current.rest();
      if( NIL == current )
      {
        if( constraint_reln.eql( reln ) )
        {
          violations = ConsesLow.cons( ConsesLow.list( module, arg, reln, argnum, arg_genl, mt ), violations );
        }
        else
        {
          violations = ConsesLow.cons( ConsesLow.list( module, arg, reln, argnum, arg_genl, mt, ConsesLow.list( via, constraint_reln ) ), violations );
        }
      }
      else
      {
        cdestructuring_bind.cdestructuring_bind_error( datum, $list10 );
      }
      cdolist_list_var = cdolist_list_var.rest();
      constraint_details = cdolist_list_var.first();
    }
    return violations;
  }

  @SubLTranslatedFile.SubL(source = "cycl/at-routines.lisp", position = 16892L)
  public static SubLObject mal_arg_formatP(final SubLObject reln, final SubLObject arg, final SubLObject argnum)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL == at_vars.$at_check_arg_formatP$.getDynamicValue( thread ) )
    {
      return NIL;
    }
    if( NIL != genl_predicates.genl_predicateP( reln, $const37$equals, UNPROVIDED, UNPROVIDED ) )
    {
      return NIL;
    }
    SubLObject result = NIL;
    SubLObject doneP = NIL;
    final SubLObject _prev_bind_0 = $at_applicable_arg_types$.currentBinding( thread );
    final SubLObject _prev_bind_2 = $at_applicable_arg_types_with_assertions$.currentBinding( thread );
    try
    {
      $at_applicable_arg_types$.bind( NIL, thread );
      $at_applicable_arg_types_with_assertions$.bind( dictionary.new_dictionary( EQUAL, UNPROVIDED ), thread );
      if( reln.eql( $const5$Quote ) )
      {
        final SubLObject _prev_bind_0_$60 = cycl_grammar.$within_quote_form$.currentBinding( thread );
        try
        {
          cycl_grammar.$within_quote_form$.bind( T, thread );
          final SubLObject already_resourcing_p = sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.getDynamicValue( thread );
          final SubLObject _prev_bind_0_$61 = sbhl_marking_vars.$resourced_sbhl_marking_space_limit$.currentBinding( thread );
          final SubLObject _prev_bind_1_$62 = sbhl_marking_vars.$resourced_sbhl_marking_spaces$.currentBinding( thread );
          final SubLObject _prev_bind_3 = sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.currentBinding( thread );
          try
          {
            sbhl_marking_vars.$resourced_sbhl_marking_space_limit$.bind( sbhl_marking_vars.determine_resource_limit( already_resourcing_p, TEN_INTEGER ), thread );
            sbhl_marking_vars.$resourced_sbhl_marking_spaces$.bind( sbhl_marking_vars.possibly_new_marking_resource( already_resourcing_p ), thread );
            sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.bind( T, thread );
            applicable_arg_type_collections( reln, argnum, $kw38$FORMAT );
            if( NIL != $at_applicable_arg_types$.getDynamicValue( thread ) && NIL == doneP )
            {
              SubLObject csome_list_var = $at_applicable_arg_types$.getDynamicValue( thread );
              SubLObject format = NIL;
              format = csome_list_var.first();
              while ( NIL == doneP && NIL != csome_list_var)
              {
                final SubLObject _prev_bind_0_$62 = at_vars.$gather_at_format_violationsP$.currentBinding( thread );
                final SubLObject _prev_bind_1_$63 = at_vars.$at_format_violations$.currentBinding( thread );
                try
                {
                  at_vars.$gather_at_format_violationsP$.bind( T, thread );
                  at_vars.$at_format_violations$.bind( NIL, thread );
                  if( NIL == arg_type.memoized_format_okP( format, at_vars.$at_formula$.getDynamicValue( thread ), argnum, mt_relevance_macros.$mt$.getDynamicValue( thread ) ) )
                  {
                    if( NIL != at_vars.$noting_at_violationsP$.getDynamicValue( thread ) )
                    {
                      note_at_violations( arg_format_violations( reln, arg, argnum, format ) );
                    }
                    result = T;
                    doneP = at_utilities.at_finishedP( result );
                  }
                }
                finally
                {
                  at_vars.$at_format_violations$.rebind( _prev_bind_1_$63, thread );
                  at_vars.$gather_at_format_violationsP$.rebind( _prev_bind_0_$62, thread );
                }
                csome_list_var = csome_list_var.rest();
                format = csome_list_var.first();
              }
            }
          }
          finally
          {
            sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.rebind( _prev_bind_3, thread );
            sbhl_marking_vars.$resourced_sbhl_marking_spaces$.rebind( _prev_bind_1_$62, thread );
            sbhl_marking_vars.$resourced_sbhl_marking_space_limit$.rebind( _prev_bind_0_$61, thread );
          }
        }
        finally
        {
          cycl_grammar.$within_quote_form$.rebind( _prev_bind_0_$60, thread );
        }
      }
      else
      {
        final SubLObject already_resourcing_p2 = sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.getDynamicValue( thread );
        final SubLObject _prev_bind_0_$63 = sbhl_marking_vars.$resourced_sbhl_marking_space_limit$.currentBinding( thread );
        final SubLObject _prev_bind_1_$64 = sbhl_marking_vars.$resourced_sbhl_marking_spaces$.currentBinding( thread );
        final SubLObject _prev_bind_4 = sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.currentBinding( thread );
        try
        {
          sbhl_marking_vars.$resourced_sbhl_marking_space_limit$.bind( sbhl_marking_vars.determine_resource_limit( already_resourcing_p2, TEN_INTEGER ), thread );
          sbhl_marking_vars.$resourced_sbhl_marking_spaces$.bind( sbhl_marking_vars.possibly_new_marking_resource( already_resourcing_p2 ), thread );
          sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.bind( T, thread );
          applicable_arg_type_collections( reln, argnum, $kw38$FORMAT );
          if( NIL != $at_applicable_arg_types$.getDynamicValue( thread ) && NIL == doneP )
          {
            SubLObject csome_list_var2 = $at_applicable_arg_types$.getDynamicValue( thread );
            SubLObject format2 = NIL;
            format2 = csome_list_var2.first();
            while ( NIL == doneP && NIL != csome_list_var2)
            {
              final SubLObject _prev_bind_0_$64 = at_vars.$gather_at_format_violationsP$.currentBinding( thread );
              final SubLObject _prev_bind_1_$65 = at_vars.$at_format_violations$.currentBinding( thread );
              try
              {
                at_vars.$gather_at_format_violationsP$.bind( T, thread );
                at_vars.$at_format_violations$.bind( NIL, thread );
                if( NIL == arg_type.memoized_format_okP( format2, at_vars.$at_formula$.getDynamicValue( thread ), argnum, mt_relevance_macros.$mt$.getDynamicValue( thread ) ) )
                {
                  if( NIL != at_vars.$noting_at_violationsP$.getDynamicValue( thread ) )
                  {
                    note_at_violations( arg_format_violations( reln, arg, argnum, format2 ) );
                  }
                  result = T;
                  doneP = at_utilities.at_finishedP( result );
                }
              }
              finally
              {
                at_vars.$at_format_violations$.rebind( _prev_bind_1_$65, thread );
                at_vars.$gather_at_format_violationsP$.rebind( _prev_bind_0_$64, thread );
              }
              csome_list_var2 = csome_list_var2.rest();
              format2 = csome_list_var2.first();
            }
          }
        }
        finally
        {
          sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.rebind( _prev_bind_4, thread );
          sbhl_marking_vars.$resourced_sbhl_marking_spaces$.rebind( _prev_bind_1_$64, thread );
          sbhl_marking_vars.$resourced_sbhl_marking_space_limit$.rebind( _prev_bind_0_$63, thread );
        }
      }
    }
    finally
    {
      $at_applicable_arg_types_with_assertions$.rebind( _prev_bind_2, thread );
      $at_applicable_arg_types$.rebind( _prev_bind_0, thread );
    }
    return result;
  }

  @SubLTranslatedFile.SubL(source = "cycl/at-routines.lisp", position = 17664L)
  public static SubLObject arg_format_violations(final SubLObject reln, final SubLObject arg, final SubLObject argnum, final SubLObject format)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject constraints = dictionary.dictionary_lookup( $at_applicable_arg_types_with_assertions$.getDynamicValue( thread ), format, UNPROVIDED );
    final SubLObject mt = mt_relevance_macros.$mt$.getDynamicValue( thread );
    final SubLObject module = $kw39$MAL_ARG_WRT_ARG_FORMAT;
    SubLObject violations = NIL;
    SubLObject cdolist_list_var = constraints;
    SubLObject constraint_details = NIL;
    constraint_details = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      SubLObject current;
      final SubLObject datum = current = constraint_details;
      SubLObject constraint_reln = NIL;
      SubLObject via = NIL;
      SubLObject constraint_gaf = NIL;
      cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list10 );
      constraint_reln = current.first();
      current = current.rest();
      cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list10 );
      via = current.first();
      current = current.rest();
      cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list10 );
      constraint_gaf = current.first();
      current = current.rest();
      if( NIL == current )
      {
        if( constraint_reln.eql( reln ) )
        {
          violations = ConsesLow.cons( ConsesLow.list( module, arg, reln, argnum, format, mt, at_vars.$at_format_violations$.getDynamicValue( thread ) ), violations );
        }
        else
        {
          violations = ConsesLow.cons( ConsesLow.list( module, arg, reln, argnum, format, mt, at_vars.$at_format_violations$.getDynamicValue( thread ), ConsesLow.list( via, constraint_reln ) ), violations );
        }
      }
      else
      {
        cdestructuring_bind.cdestructuring_bind_error( datum, $list10 );
      }
      cdolist_list_var = cdolist_list_var.rest();
      constraint_details = cdolist_list_var.first();
    }
    return violations;
  }

  @SubLTranslatedFile.SubL(source = "cycl/at-routines.lisp", position = 18296L)
  public static SubLObject mal_inter_arg_isaP(final SubLObject reln, final SubLObject ind_arg, final SubLObject ind_argnum, final SubLObject dep_arg, final SubLObject dep_argnum)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL == at_vars.$at_check_inter_arg_isaP$.getDynamicValue( thread ) || NIL == reln || NIL == ind_arg || NIL == dep_arg || !ind_argnum.isInteger() )
    {
      return NIL;
    }
    if( NIL != at_utilities.inter_arg_isa_cache_initializedP() && NIL == at_utilities.some_inter_arg_isa_constraint_somewhereP( reln ) )
    {
      return NIL;
    }
    SubLObject result = NIL;
    SubLObject doneP = NIL;
    final SubLObject _prev_bind_0 = $at_applicable_arg_types$.currentBinding( thread );
    final SubLObject _prev_bind_2 = $at_applicable_arg_types_with_assertions$.currentBinding( thread );
    try
    {
      $at_applicable_arg_types$.bind( NIL, thread );
      $at_applicable_arg_types_with_assertions$.bind( dictionary.new_dictionary( EQUAL, UNPROVIDED ), thread );
      if( reln.eql( $const5$Quote ) )
      {
        final SubLObject _prev_bind_0_$69 = cycl_grammar.$within_quote_form$.currentBinding( thread );
        try
        {
          cycl_grammar.$within_quote_form$.bind( T, thread );
          final SubLObject already_resourcing_p = sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.getDynamicValue( thread );
          final SubLObject _prev_bind_0_$70 = sbhl_marking_vars.$resourced_sbhl_marking_space_limit$.currentBinding( thread );
          final SubLObject _prev_bind_1_$71 = sbhl_marking_vars.$resourced_sbhl_marking_spaces$.currentBinding( thread );
          final SubLObject _prev_bind_3 = sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.currentBinding( thread );
          try
          {
            sbhl_marking_vars.$resourced_sbhl_marking_space_limit$.bind( sbhl_marking_vars.determine_resource_limit( already_resourcing_p, TEN_INTEGER ), thread );
            sbhl_marking_vars.$resourced_sbhl_marking_spaces$.bind( sbhl_marking_vars.possibly_new_marking_resource( already_resourcing_p ), thread );
            sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.bind( T, thread );
            applicable_inter_arg_type_collections( reln, ind_arg, ind_argnum, dep_argnum, $kw40$INTER_ARG_ISA, at_vars.$at_check_non_constant_inter_arg_isaP$.getDynamicValue( thread ) );
            if( NIL != $at_applicable_arg_types$.getDynamicValue( thread ) && NIL == doneP )
            {
              SubLObject csome_list_var = $at_applicable_arg_types$.getDynamicValue( thread );
              SubLObject inter_arg_isas = NIL;
              inter_arg_isas = csome_list_var.first();
              while ( NIL == doneP && NIL != csome_list_var)
              {
                final SubLObject _prev_bind_0_$71 = wff_vars.$wff_violations$.currentBinding( thread );
                final SubLObject _prev_bind_1_$72 = at_vars.$permitting_denotational_terms_admitted_by_defn_via_isaP$.currentBinding( thread );
                try
                {
                  wff_vars.$wff_violations$.bind( NIL, thread );
                  at_vars.$permitting_denotational_terms_admitted_by_defn_via_isaP$.bind( NIL, thread );
                  SubLObject current;
                  final SubLObject datum = current = inter_arg_isas;
                  SubLObject ind_arg_isa = NIL;
                  SubLObject dep_arg_isa = NIL;
                  cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list41 );
                  ind_arg_isa = current.first();
                  current = current.rest();
                  cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list41 );
                  dep_arg_isa = current.first();
                  current = current.rest();
                  if( NIL == current )
                  {
                    if( NIL != forts.fort_p( dep_arg_isa ) )
                    {
                      if( NIL == isa.isaP( dep_arg, dep_arg_isa, UNPROVIDED, UNPROVIDED ) )
                      {
                        if( NIL == at_defns.defns_admitP( dep_arg_isa, dep_arg, UNPROVIDED ) )
                        {
                          if( NIL != at_vars.$noting_at_violationsP$.getDynamicValue( thread ) )
                          {
                            note_at_violations( inter_arg_isa_violations( reln, ind_arg, ind_argnum, ind_arg_isa, dep_arg, dep_argnum, dep_arg_isa ) );
                            note_at_violations( wff.wff_violations() );
                          }
                          result = T;
                          doneP = at_utilities.at_finishedP( result );
                        }
                      }
                    }
                  }
                  else
                  {
                    cdestructuring_bind.cdestructuring_bind_error( datum, $list41 );
                  }
                }
                finally
                {
                  at_vars.$permitting_denotational_terms_admitted_by_defn_via_isaP$.rebind( _prev_bind_1_$72, thread );
                  wff_vars.$wff_violations$.rebind( _prev_bind_0_$71, thread );
                }
                csome_list_var = csome_list_var.rest();
                inter_arg_isas = csome_list_var.first();
              }
            }
          }
          finally
          {
            sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.rebind( _prev_bind_3, thread );
            sbhl_marking_vars.$resourced_sbhl_marking_spaces$.rebind( _prev_bind_1_$71, thread );
            sbhl_marking_vars.$resourced_sbhl_marking_space_limit$.rebind( _prev_bind_0_$70, thread );
          }
        }
        finally
        {
          cycl_grammar.$within_quote_form$.rebind( _prev_bind_0_$69, thread );
        }
      }
      else
      {
        final SubLObject already_resourcing_p2 = sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.getDynamicValue( thread );
        final SubLObject _prev_bind_0_$72 = sbhl_marking_vars.$resourced_sbhl_marking_space_limit$.currentBinding( thread );
        final SubLObject _prev_bind_1_$73 = sbhl_marking_vars.$resourced_sbhl_marking_spaces$.currentBinding( thread );
        final SubLObject _prev_bind_4 = sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.currentBinding( thread );
        try
        {
          sbhl_marking_vars.$resourced_sbhl_marking_space_limit$.bind( sbhl_marking_vars.determine_resource_limit( already_resourcing_p2, TEN_INTEGER ), thread );
          sbhl_marking_vars.$resourced_sbhl_marking_spaces$.bind( sbhl_marking_vars.possibly_new_marking_resource( already_resourcing_p2 ), thread );
          sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.bind( T, thread );
          applicable_inter_arg_type_collections( reln, ind_arg, ind_argnum, dep_argnum, $kw40$INTER_ARG_ISA, at_vars.$at_check_non_constant_inter_arg_isaP$.getDynamicValue( thread ) );
          if( NIL != $at_applicable_arg_types$.getDynamicValue( thread ) && NIL == doneP )
          {
            SubLObject csome_list_var2 = $at_applicable_arg_types$.getDynamicValue( thread );
            SubLObject inter_arg_isas2 = NIL;
            inter_arg_isas2 = csome_list_var2.first();
            while ( NIL == doneP && NIL != csome_list_var2)
            {
              final SubLObject _prev_bind_0_$73 = wff_vars.$wff_violations$.currentBinding( thread );
              final SubLObject _prev_bind_1_$74 = at_vars.$permitting_denotational_terms_admitted_by_defn_via_isaP$.currentBinding( thread );
              try
              {
                wff_vars.$wff_violations$.bind( NIL, thread );
                at_vars.$permitting_denotational_terms_admitted_by_defn_via_isaP$.bind( NIL, thread );
                SubLObject current2;
                final SubLObject datum2 = current2 = inter_arg_isas2;
                SubLObject ind_arg_isa2 = NIL;
                SubLObject dep_arg_isa2 = NIL;
                cdestructuring_bind.destructuring_bind_must_consp( current2, datum2, $list41 );
                ind_arg_isa2 = current2.first();
                current2 = current2.rest();
                cdestructuring_bind.destructuring_bind_must_consp( current2, datum2, $list41 );
                dep_arg_isa2 = current2.first();
                current2 = current2.rest();
                if( NIL == current2 )
                {
                  if( NIL != forts.fort_p( dep_arg_isa2 ) )
                  {
                    if( NIL == isa.isaP( dep_arg, dep_arg_isa2, UNPROVIDED, UNPROVIDED ) )
                    {
                      if( NIL == at_defns.defns_admitP( dep_arg_isa2, dep_arg, UNPROVIDED ) )
                      {
                        if( NIL != at_vars.$noting_at_violationsP$.getDynamicValue( thread ) )
                        {
                          note_at_violations( inter_arg_isa_violations( reln, ind_arg, ind_argnum, ind_arg_isa2, dep_arg, dep_argnum, dep_arg_isa2 ) );
                          note_at_violations( wff.wff_violations() );
                        }
                        result = T;
                        doneP = at_utilities.at_finishedP( result );
                      }
                    }
                  }
                }
                else
                {
                  cdestructuring_bind.cdestructuring_bind_error( datum2, $list41 );
                }
              }
              finally
              {
                at_vars.$permitting_denotational_terms_admitted_by_defn_via_isaP$.rebind( _prev_bind_1_$74, thread );
                wff_vars.$wff_violations$.rebind( _prev_bind_0_$73, thread );
              }
              csome_list_var2 = csome_list_var2.rest();
              inter_arg_isas2 = csome_list_var2.first();
            }
          }
        }
        finally
        {
          sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.rebind( _prev_bind_4, thread );
          sbhl_marking_vars.$resourced_sbhl_marking_spaces$.rebind( _prev_bind_1_$73, thread );
          sbhl_marking_vars.$resourced_sbhl_marking_space_limit$.rebind( _prev_bind_0_$72, thread );
        }
      }
    }
    finally
    {
      $at_applicable_arg_types_with_assertions$.rebind( _prev_bind_2, thread );
      $at_applicable_arg_types$.rebind( _prev_bind_0, thread );
    }
    return result;
  }

  @SubLTranslatedFile.SubL(source = "cycl/at-routines.lisp", position = 20375L)
  public static SubLObject inter_arg_isa_violations(final SubLObject reln, final SubLObject ind_arg, final SubLObject ind_argnum, final SubLObject ind_arg_isa, final SubLObject dep_arg, final SubLObject dep_argnum,
      final SubLObject dep_arg_isa)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject module = ( NIL != kb_accessors.admitting_defnsP( dep_arg_isa, mt_relevance_macros.$mt$.getDynamicValue( thread ) ) ) ? $kw42$MAL_ARG_WRT_INTER_ARG_DEFN : $kw43$MAL_ARG_WRT_INTER_ARG_ISA;
    return inter_arg_violations( module, reln, ind_arg, ind_argnum, ind_arg_isa, dep_arg, dep_argnum, dep_arg_isa );
  }

  @SubLTranslatedFile.SubL(source = "cycl/at-routines.lisp", position = 20719L)
  public static SubLObject inter_arg_violations(final SubLObject module, final SubLObject reln, final SubLObject ind_arg, final SubLObject ind_argnum, final SubLObject ind_arg_col, final SubLObject dep_arg,
      final SubLObject dep_argnum, final SubLObject dep_arg_col)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject constraints = dictionary.dictionary_lookup( $at_applicable_arg_types_with_assertions$.getDynamicValue( thread ), ConsesLow.list( ind_arg_col, dep_arg_col ), UNPROVIDED );
    final SubLObject mt = mt_relevance_macros.$mt$.getDynamicValue( thread );
    SubLObject violations = NIL;
    SubLObject cdolist_list_var = constraints;
    SubLObject constraint_details = NIL;
    constraint_details = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      SubLObject current;
      final SubLObject datum = current = constraint_details;
      SubLObject constraint_reln = NIL;
      SubLObject via = NIL;
      cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list44 );
      constraint_reln = current.first();
      current = current.rest();
      cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list44 );
      via = current.first();
      current = current.rest();
      if( NIL == current )
      {
        if( reln.eql( constraint_reln ) )
        {
          violations = ConsesLow.cons( ConsesLow.list( new SubLObject[] { module, dep_arg, reln, dep_argnum, dep_arg_col, ind_arg_col, ind_argnum, ind_arg, mt
          } ), violations );
        }
        else
        {
          violations = ConsesLow.cons( ConsesLow.list( new SubLObject[] { module, dep_arg, reln, dep_argnum, dep_arg_col, ind_arg_col, ind_argnum, ind_arg, mt, ConsesLow.list( via, constraint_reln )
          } ), violations );
        }
      }
      else
      {
        cdestructuring_bind.cdestructuring_bind_error( datum, $list44 );
      }
      cdolist_list_var = cdolist_list_var.rest();
      constraint_details = cdolist_list_var.first();
    }
    return violations;
  }

  @SubLTranslatedFile.SubL(source = "cycl/at-routines.lisp", position = 21398L)
  public static SubLObject some_inter_arg_genl_assertion_somewhereP(final SubLObject reln)
  {
    return makeBoolean( NIL != somewhere_cache.some_pred_assertion_somewhereP( $const45$interArgGenl1_2, reln, ONE_INTEGER, UNPROVIDED ) || NIL != somewhere_cache.some_pred_assertion_somewhereP( $const46$interArgGenl2_1,
        reln, ONE_INTEGER, UNPROVIDED ) || NIL != somewhere_cache.some_pred_assertion_somewhereP( $const47$interArgGenl2_4, reln, ONE_INTEGER, UNPROVIDED ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/at-routines.lisp", position = 21697L)
  public static SubLObject some_inter_arg_genl_constraint_somewhereP(final SubLObject reln)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject found_oneP = NIL;
    if( NIL != fort_types_interface.predicateP( reln ) )
    {
      if( NIL == found_oneP )
      {
        final SubLObject module = sbhl_module_vars.get_sbhl_module( $const48$genlPreds );
        final SubLObject deck_type = ( $kw49$DEPTH == $kw49$DEPTH ) ? $kw50$STACK : $kw51$QUEUE;
        final SubLObject recur_deck = deck.create_deck( deck_type );
        SubLObject node_and_predicate_mode = NIL;
        final SubLObject _prev_bind_0 = sbhl_marking_vars.$sbhl_space$.currentBinding( thread );
        try
        {
          sbhl_marking_vars.$sbhl_space$.bind( sbhl_marking_vars.get_sbhl_marking_space(), thread );
          try
          {
            final SubLObject tv_var = NIL;
            final SubLObject _prev_bind_0_$78 = sbhl_search_vars.$sbhl_tv$.currentBinding( thread );
            final SubLObject _prev_bind_2 = sbhl_search_vars.$relevant_sbhl_tv_function$.currentBinding( thread );
            try
            {
              sbhl_search_vars.$sbhl_tv$.bind( ( NIL != tv_var ) ? tv_var : sbhl_search_vars.get_sbhl_true_tv(), thread );
              sbhl_search_vars.$relevant_sbhl_tv_function$.bind( ( NIL != tv_var ) ? $sym52$RELEVANT_SBHL_TV_IS_GENERAL_TV : sbhl_search_vars.$relevant_sbhl_tv_function$.getDynamicValue( thread ), thread );
              if( NIL != tv_var && NIL != sbhl_paranoia.sbhl_object_type_checking_p() && NIL == sbhl_search_vars.sbhl_true_tv_p( tv_var ) )
              {
                final SubLObject pcase_var = sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue( thread );
                if( pcase_var.eql( $kw53$ERROR ) )
                {
                  sbhl_paranoia.sbhl_error( ONE_INTEGER, $str54$_A_is_not_a__A, tv_var, $sym55$SBHL_TRUE_TV_P, UNPROVIDED, UNPROVIDED, UNPROVIDED );
                }
                else if( pcase_var.eql( $kw56$CERROR ) )
                {
                  sbhl_paranoia.sbhl_cerror( ONE_INTEGER, $str57$continue_anyway, $str54$_A_is_not_a__A, tv_var, $sym55$SBHL_TRUE_TV_P, UNPROVIDED, UNPROVIDED, UNPROVIDED );
                }
                else if( pcase_var.eql( $kw58$WARN ) )
                {
                  Errors.warn( $str54$_A_is_not_a__A, tv_var, $sym55$SBHL_TRUE_TV_P );
                }
                else
                {
                  Errors.warn( $str59$_A_is_not_a_valid__sbhl_type_erro, sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue( thread ) );
                  Errors.cerror( $str57$continue_anyway, $str54$_A_is_not_a__A, tv_var, $sym55$SBHL_TRUE_TV_P );
                }
              }
              final SubLObject _prev_bind_0_$79 = sbhl_search_vars.$sbhl_search_module$.currentBinding( thread );
              final SubLObject _prev_bind_1_$80 = sbhl_search_vars.$sbhl_search_module_type$.currentBinding( thread );
              final SubLObject _prev_bind_3 = sbhl_search_vars.$sbhl_add_node_to_result_test$.currentBinding( thread );
              final SubLObject _prev_bind_4 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding( thread );
              final SubLObject _prev_bind_5 = sbhl_module_vars.$sbhl_module$.currentBinding( thread );
              try
              {
                sbhl_search_vars.$sbhl_search_module$.bind( module, thread );
                sbhl_search_vars.$sbhl_search_module_type$.bind( sbhl_module_utilities.get_sbhl_module_type( module ), thread );
                sbhl_search_vars.$sbhl_add_node_to_result_test$.bind( sbhl_module_utilities.get_sbhl_add_node_to_result_test( module ), thread );
                sbhl_search_vars.$genl_inverse_mode_p$.bind( NIL, thread );
                sbhl_module_vars.$sbhl_module$.bind( module, thread );
                if( NIL != sbhl_paranoia.suspend_sbhl_type_checkingP() || NIL != sbhl_module_utilities.apply_sbhl_module_type_test( reln, sbhl_module_vars.get_sbhl_module( UNPROVIDED ) ) )
                {
                  final SubLObject _prev_bind_0_$80 = sbhl_search_vars.$sbhl_search_direction$.currentBinding( thread );
                  final SubLObject _prev_bind_1_$81 = sbhl_link_vars.$sbhl_link_direction$.currentBinding( thread );
                  final SubLObject _prev_bind_2_$83 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding( thread );
                  try
                  {
                    sbhl_search_vars.$sbhl_search_direction$.bind( sbhl_search_vars.get_sbhl_forward_search_direction(), thread );
                    sbhl_link_vars.$sbhl_link_direction$.bind( sbhl_module_utilities.sbhl_search_direction_to_link_direction( sbhl_search_vars.get_sbhl_forward_search_direction(), module ), thread );
                    sbhl_search_vars.$genl_inverse_mode_p$.bind( NIL, thread );
                    sbhl_marking_utilities.sbhl_mark_node_marked( reln, UNPROVIDED );
                    for( node_and_predicate_mode = ConsesLow.list( reln, sbhl_search_vars.genl_inverse_mode_p() ); NIL != node_and_predicate_mode && NIL == found_oneP; node_and_predicate_mode = deck.deck_pop(
                        recur_deck ) )
                    {
                      final SubLObject node_var_$84 = node_and_predicate_mode.first();
                      final SubLObject predicate_mode = conses_high.second( node_and_predicate_mode );
                      final SubLObject genl_pred = node_var_$84;
                      final SubLObject _prev_bind_0_$81 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding( thread );
                      try
                      {
                        sbhl_search_vars.$genl_inverse_mode_p$.bind( predicate_mode, thread );
                        final SubLObject inverse_mode = predicate_mode;
                        if( NIL != some_inter_arg_genl_assertion_somewhereP( genl_pred ) )
                        {
                          found_oneP = T;
                        }
                        final SubLObject accessible_modules = sbhl_macros.get_sbhl_accessible_modules( module );
                        SubLObject rest;
                        SubLObject module_var;
                        SubLObject _prev_bind_0_$82;
                        SubLObject _prev_bind_1_$82;
                        SubLObject node;
                        SubLObject d_link;
                        SubLObject mt_links;
                        SubLObject iteration_state;
                        SubLObject mt;
                        SubLObject tv_links;
                        SubLObject _prev_bind_0_$83;
                        SubLObject iteration_state_$89;
                        SubLObject tv;
                        SubLObject link_nodes;
                        SubLObject _prev_bind_0_$84;
                        SubLObject sol;
                        SubLObject set_contents_var;
                        SubLObject basis_object;
                        SubLObject state;
                        SubLObject node_vars_link_node;
                        SubLObject csome_list_var;
                        SubLObject node_vars_link_node2;
                        SubLObject new_list;
                        SubLObject rest_$91;
                        SubLObject generating_fn;
                        SubLObject _prev_bind_0_$85;
                        SubLObject sol2;
                        SubLObject link_nodes2;
                        SubLObject set_contents_var2;
                        SubLObject basis_object2;
                        SubLObject state2;
                        SubLObject node_vars_link_node3;
                        SubLObject csome_list_var2;
                        SubLObject node_vars_link_node4;
                        for( rest = NIL, rest = accessible_modules; NIL == found_oneP && NIL != rest; rest = rest.rest() )
                        {
                          module_var = rest.first();
                          _prev_bind_0_$82 = sbhl_module_vars.$sbhl_module$.currentBinding( thread );
                          _prev_bind_1_$82 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding( thread );
                          try
                          {
                            sbhl_module_vars.$sbhl_module$.bind( module_var, thread );
                            sbhl_search_vars.$genl_inverse_mode_p$.bind( ( NIL != sbhl_search_vars.flip_genl_inverse_modeP( UNPROVIDED, UNPROVIDED ) ) ? makeBoolean( NIL == sbhl_search_vars.$genl_inverse_mode_p$
                                .getDynamicValue( thread ) ) : sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue( thread ), thread );
                            node = function_terms.naut_to_nart( node_var_$84 );
                            if( NIL != sbhl_link_vars.sbhl_node_object_p( node ) )
                            {
                              d_link = sbhl_graphs.get_sbhl_graph_link( node, sbhl_module_vars.get_sbhl_module( UNPROVIDED ) );
                              if( NIL != d_link )
                              {
                                mt_links = sbhl_links.get_sbhl_mt_links( d_link, sbhl_link_vars.get_sbhl_link_direction(), sbhl_module_vars.get_sbhl_module( UNPROVIDED ) );
                                if( NIL != mt_links )
                                {
                                  for( iteration_state = dictionary_contents.do_dictionary_contents_state( dictionary.dictionary_contents( mt_links ) ); NIL == found_oneP && NIL == dictionary_contents
                                      .do_dictionary_contents_doneP( iteration_state ); iteration_state = dictionary_contents.do_dictionary_contents_next( iteration_state ) )
                                  {
                                    thread.resetMultipleValues();
                                    mt = dictionary_contents.do_dictionary_contents_key_value( iteration_state );
                                    tv_links = thread.secondMultipleValue();
                                    thread.resetMultipleValues();
                                    if( NIL != mt_relevance_macros.relevant_mtP( mt ) )
                                    {
                                      _prev_bind_0_$83 = sbhl_link_vars.$sbhl_link_mt$.currentBinding( thread );
                                      try
                                      {
                                        sbhl_link_vars.$sbhl_link_mt$.bind( mt, thread );
                                        for( iteration_state_$89 = dictionary_contents.do_dictionary_contents_state( dictionary.dictionary_contents( tv_links ) ); NIL == found_oneP && NIL == dictionary_contents
                                            .do_dictionary_contents_doneP( iteration_state_$89 ); iteration_state_$89 = dictionary_contents.do_dictionary_contents_next( iteration_state_$89 ) )
                                        {
                                          thread.resetMultipleValues();
                                          tv = dictionary_contents.do_dictionary_contents_key_value( iteration_state_$89 );
                                          link_nodes = thread.secondMultipleValue();
                                          thread.resetMultipleValues();
                                          if( NIL != sbhl_search_vars.relevant_sbhl_tvP( tv ) )
                                          {
                                            _prev_bind_0_$84 = sbhl_link_vars.$sbhl_link_tv$.currentBinding( thread );
                                            try
                                            {
                                              sbhl_link_vars.$sbhl_link_tv$.bind( tv, thread );
                                              sol = link_nodes;
                                              if( NIL != set.set_p( sol ) )
                                              {
                                                set_contents_var = set.do_set_internal( sol );
                                                for( basis_object = set_contents.do_set_contents_basis_object( set_contents_var ), state = NIL, state = set_contents.do_set_contents_initial_state( basis_object,
                                                    set_contents_var ); NIL == found_oneP && NIL == set_contents.do_set_contents_doneP( basis_object, state ); state = set_contents.do_set_contents_update_state( state ) )
                                                {
                                                  node_vars_link_node = set_contents.do_set_contents_next( basis_object, state );
                                                  if( NIL != set_contents.do_set_contents_element_validP( state, node_vars_link_node ) && NIL == sbhl_marking_utilities.sbhl_search_path_termination_p( node_vars_link_node,
                                                      UNPROVIDED ) )
                                                  {
                                                    sbhl_marking_utilities.sbhl_mark_node_marked( node_vars_link_node, UNPROVIDED );
                                                    deck.deck_push( ConsesLow.list( node_vars_link_node, sbhl_search_vars.genl_inverse_mode_p() ), recur_deck );
                                                  }
                                                }
                                              }
                                              else if( sol.isList() )
                                              {
                                                if( NIL == found_oneP )
                                                {
                                                  csome_list_var = sol;
                                                  node_vars_link_node2 = NIL;
                                                  node_vars_link_node2 = csome_list_var.first();
                                                  while ( NIL == found_oneP && NIL != csome_list_var)
                                                  {
                                                    if( NIL == sbhl_marking_utilities.sbhl_search_path_termination_p( node_vars_link_node2, UNPROVIDED ) )
                                                    {
                                                      sbhl_marking_utilities.sbhl_mark_node_marked( node_vars_link_node2, UNPROVIDED );
                                                      deck.deck_push( ConsesLow.list( node_vars_link_node2, sbhl_search_vars.genl_inverse_mode_p() ), recur_deck );
                                                    }
                                                    csome_list_var = csome_list_var.rest();
                                                    node_vars_link_node2 = csome_list_var.first();
                                                  }
                                                }
                                              }
                                              else
                                              {
                                                Errors.error( $str60$_A_is_neither_SET_P_nor_LISTP_, sol );
                                              }
                                            }
                                            finally
                                            {
                                              sbhl_link_vars.$sbhl_link_tv$.rebind( _prev_bind_0_$84, thread );
                                            }
                                          }
                                        }
                                        dictionary_contents.do_dictionary_contents_finalize( iteration_state_$89 );
                                      }
                                      finally
                                      {
                                        sbhl_link_vars.$sbhl_link_mt$.rebind( _prev_bind_0_$83, thread );
                                      }
                                    }
                                  }
                                  dictionary_contents.do_dictionary_contents_finalize( iteration_state );
                                }
                              }
                              else
                              {
                                sbhl_paranoia.sbhl_error( FIVE_INTEGER, $str61$attempting_to_bind_direction_link, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
                              }
                            }
                            else if( NIL != obsolete.cnat_p( node, UNPROVIDED ) )
                            {
                              new_list = ( ( NIL != sbhl_link_vars.sbhl_randomize_lists_p() ) ? list_utilities.randomize_list( sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators( sbhl_link_vars
                                  .get_sbhl_link_direction(), sbhl_search_vars.$sbhl_tv$.getDynamicValue( thread ), sbhl_module_vars.get_sbhl_module( UNPROVIDED ) ) )
                                  : sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators( sbhl_link_vars.get_sbhl_link_direction(), sbhl_search_vars.$sbhl_tv$.getDynamicValue( thread ), sbhl_module_vars
                                      .get_sbhl_module( UNPROVIDED ) ) );
                              for( rest_$91 = NIL, rest_$91 = new_list; NIL == found_oneP && NIL != rest_$91; rest_$91 = rest_$91.rest() )
                              {
                                generating_fn = rest_$91.first();
                                _prev_bind_0_$85 = sbhl_link_vars.$sbhl_link_generator$.currentBinding( thread );
                                try
                                {
                                  sbhl_link_vars.$sbhl_link_generator$.bind( generating_fn, thread );
                                  link_nodes2 = ( sol2 = Functions.funcall( generating_fn, node ) );
                                  if( NIL != set.set_p( sol2 ) )
                                  {
                                    set_contents_var2 = set.do_set_internal( sol2 );
                                    for( basis_object2 = set_contents.do_set_contents_basis_object( set_contents_var2 ), state2 = NIL, state2 = set_contents.do_set_contents_initial_state( basis_object2,
                                        set_contents_var2 ); NIL == found_oneP && NIL == set_contents.do_set_contents_doneP( basis_object2, state2 ); state2 = set_contents.do_set_contents_update_state( state2 ) )
                                    {
                                      node_vars_link_node3 = set_contents.do_set_contents_next( basis_object2, state2 );
                                      if( NIL != set_contents.do_set_contents_element_validP( state2, node_vars_link_node3 ) && NIL == sbhl_marking_utilities.sbhl_search_path_termination_p( node_vars_link_node3,
                                          UNPROVIDED ) )
                                      {
                                        sbhl_marking_utilities.sbhl_mark_node_marked( node_vars_link_node3, UNPROVIDED );
                                        deck.deck_push( ConsesLow.list( node_vars_link_node3, sbhl_search_vars.genl_inverse_mode_p() ), recur_deck );
                                      }
                                    }
                                  }
                                  else if( sol2.isList() )
                                  {
                                    if( NIL == found_oneP )
                                    {
                                      csome_list_var2 = sol2;
                                      node_vars_link_node4 = NIL;
                                      node_vars_link_node4 = csome_list_var2.first();
                                      while ( NIL == found_oneP && NIL != csome_list_var2)
                                      {
                                        if( NIL == sbhl_marking_utilities.sbhl_search_path_termination_p( node_vars_link_node4, UNPROVIDED ) )
                                        {
                                          sbhl_marking_utilities.sbhl_mark_node_marked( node_vars_link_node4, UNPROVIDED );
                                          deck.deck_push( ConsesLow.list( node_vars_link_node4, sbhl_search_vars.genl_inverse_mode_p() ), recur_deck );
                                        }
                                        csome_list_var2 = csome_list_var2.rest();
                                        node_vars_link_node4 = csome_list_var2.first();
                                      }
                                    }
                                  }
                                  else
                                  {
                                    Errors.error( $str60$_A_is_neither_SET_P_nor_LISTP_, sol2 );
                                  }
                                }
                                finally
                                {
                                  sbhl_link_vars.$sbhl_link_generator$.rebind( _prev_bind_0_$85, thread );
                                }
                              }
                            }
                          }
                          finally
                          {
                            sbhl_search_vars.$genl_inverse_mode_p$.rebind( _prev_bind_1_$82, thread );
                            sbhl_module_vars.$sbhl_module$.rebind( _prev_bind_0_$82, thread );
                          }
                        }
                      }
                      finally
                      {
                        sbhl_search_vars.$genl_inverse_mode_p$.rebind( _prev_bind_0_$81, thread );
                      }
                    }
                  }
                  finally
                  {
                    sbhl_search_vars.$genl_inverse_mode_p$.rebind( _prev_bind_2_$83, thread );
                    sbhl_link_vars.$sbhl_link_direction$.rebind( _prev_bind_1_$81, thread );
                    sbhl_search_vars.$sbhl_search_direction$.rebind( _prev_bind_0_$80, thread );
                  }
                }
                else
                {
                  sbhl_paranoia.sbhl_warn( TWO_INTEGER, $str62$Node__a_does_not_pass_sbhl_type_t, reln, sbhl_module_utilities.get_sbhl_type_test( sbhl_module_vars.get_sbhl_module( UNPROVIDED ) ), UNPROVIDED, UNPROVIDED,
                      UNPROVIDED );
                }
              }
              finally
              {
                sbhl_module_vars.$sbhl_module$.rebind( _prev_bind_5, thread );
                sbhl_search_vars.$genl_inverse_mode_p$.rebind( _prev_bind_4, thread );
                sbhl_search_vars.$sbhl_add_node_to_result_test$.rebind( _prev_bind_3, thread );
                sbhl_search_vars.$sbhl_search_module_type$.rebind( _prev_bind_1_$80, thread );
                sbhl_search_vars.$sbhl_search_module$.rebind( _prev_bind_0_$79, thread );
              }
            }
            finally
            {
              sbhl_search_vars.$relevant_sbhl_tv_function$.rebind( _prev_bind_2, thread );
              sbhl_search_vars.$sbhl_tv$.rebind( _prev_bind_0_$78, thread );
            }
          }
          finally
          {
            final SubLObject _prev_bind_0_$86 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
            try
            {
              Threads.$is_thread_performing_cleanupP$.bind( T, thread );
              final SubLObject _values = Values.getValuesAsVector();
              sbhl_marking_vars.free_sbhl_marking_space( sbhl_marking_vars.$sbhl_space$.getDynamicValue( thread ) );
              Values.restoreValuesFromVector( _values );
            }
            finally
            {
              Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$86, thread );
            }
          }
        }
        finally
        {
          sbhl_marking_vars.$sbhl_space$.rebind( _prev_bind_0, thread );
        }
      }
    }
    else
    {
      found_oneP = some_inter_arg_genl_assertion_somewhereP( reln );
    }
    return found_oneP;
  }

  @SubLTranslatedFile.SubL(source = "cycl/at-routines.lisp", position = 22120L)
  public static SubLObject mal_inter_arg_genlP(final SubLObject reln, final SubLObject ind_arg, final SubLObject ind_argnum, final SubLObject dep_arg, final SubLObject dep_argnum)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL == at_vars.$at_check_inter_arg_genlP$.getDynamicValue( thread ) || NIL == reln || NIL == ind_arg || NIL == dep_arg || !ind_argnum.isInteger() )
    {
      return NIL;
    }
    if( NIL == some_inter_arg_genl_constraint_somewhereP( reln ) )
    {
      return NIL;
    }
    SubLObject result = NIL;
    SubLObject doneP = NIL;
    final SubLObject _prev_bind_0 = $at_applicable_arg_types$.currentBinding( thread );
    final SubLObject _prev_bind_2 = $at_applicable_arg_types_with_assertions$.currentBinding( thread );
    try
    {
      $at_applicable_arg_types$.bind( NIL, thread );
      $at_applicable_arg_types_with_assertions$.bind( dictionary.new_dictionary( EQUAL, UNPROVIDED ), thread );
      if( reln.eql( $const5$Quote ) )
      {
        final SubLObject _prev_bind_0_$94 = cycl_grammar.$within_quote_form$.currentBinding( thread );
        try
        {
          cycl_grammar.$within_quote_form$.bind( T, thread );
          final SubLObject already_resourcing_p = sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.getDynamicValue( thread );
          final SubLObject _prev_bind_0_$95 = sbhl_marking_vars.$resourced_sbhl_marking_space_limit$.currentBinding( thread );
          final SubLObject _prev_bind_1_$96 = sbhl_marking_vars.$resourced_sbhl_marking_spaces$.currentBinding( thread );
          final SubLObject _prev_bind_3 = sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.currentBinding( thread );
          try
          {
            sbhl_marking_vars.$resourced_sbhl_marking_space_limit$.bind( sbhl_marking_vars.determine_resource_limit( already_resourcing_p, TEN_INTEGER ), thread );
            sbhl_marking_vars.$resourced_sbhl_marking_spaces$.bind( sbhl_marking_vars.possibly_new_marking_resource( already_resourcing_p ), thread );
            sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.bind( T, thread );
            applicable_inter_arg_type_collections( reln, ind_arg, ind_argnum, dep_argnum, $kw63$INTER_ARG_GENL, at_vars.$at_check_non_constant_inter_arg_genlP$.getDynamicValue( thread ) );
            if( NIL != $at_applicable_arg_types$.getDynamicValue( thread ) && NIL == doneP )
            {
              SubLObject csome_list_var = $at_applicable_arg_types$.getDynamicValue( thread );
              SubLObject inter_arg_genls = NIL;
              inter_arg_genls = csome_list_var.first();
              while ( NIL == doneP && NIL != csome_list_var)
              {
                SubLObject current;
                final SubLObject datum = current = inter_arg_genls;
                SubLObject ind_arg_genl = NIL;
                SubLObject dep_arg_genl = NIL;
                cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list64 );
                ind_arg_genl = current.first();
                current = current.rest();
                cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list64 );
                dep_arg_genl = current.first();
                current = current.rest();
                if( NIL == current )
                {
                  if( NIL != forts.fort_p( dep_arg_genl ) && NIL == genls.genlP( dep_arg, dep_arg_genl, UNPROVIDED, UNPROVIDED ) )
                  {
                    if( NIL != at_vars.$noting_at_violationsP$.getDynamicValue( thread ) )
                    {
                      note_at_violations( inter_arg_genl_violations( reln, ind_arg, ind_argnum, ind_arg_genl, dep_arg, dep_argnum, dep_arg_genl ) );
                    }
                    result = T;
                    doneP = at_utilities.at_finishedP( result );
                  }
                }
                else
                {
                  cdestructuring_bind.cdestructuring_bind_error( datum, $list64 );
                }
                csome_list_var = csome_list_var.rest();
                inter_arg_genls = csome_list_var.first();
              }
            }
          }
          finally
          {
            sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.rebind( _prev_bind_3, thread );
            sbhl_marking_vars.$resourced_sbhl_marking_spaces$.rebind( _prev_bind_1_$96, thread );
            sbhl_marking_vars.$resourced_sbhl_marking_space_limit$.rebind( _prev_bind_0_$95, thread );
          }
        }
        finally
        {
          cycl_grammar.$within_quote_form$.rebind( _prev_bind_0_$94, thread );
        }
      }
      else
      {
        final SubLObject already_resourcing_p2 = sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.getDynamicValue( thread );
        final SubLObject _prev_bind_0_$96 = sbhl_marking_vars.$resourced_sbhl_marking_space_limit$.currentBinding( thread );
        final SubLObject _prev_bind_1_$97 = sbhl_marking_vars.$resourced_sbhl_marking_spaces$.currentBinding( thread );
        final SubLObject _prev_bind_4 = sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.currentBinding( thread );
        try
        {
          sbhl_marking_vars.$resourced_sbhl_marking_space_limit$.bind( sbhl_marking_vars.determine_resource_limit( already_resourcing_p2, TEN_INTEGER ), thread );
          sbhl_marking_vars.$resourced_sbhl_marking_spaces$.bind( sbhl_marking_vars.possibly_new_marking_resource( already_resourcing_p2 ), thread );
          sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.bind( T, thread );
          applicable_inter_arg_type_collections( reln, ind_arg, ind_argnum, dep_argnum, $kw63$INTER_ARG_GENL, at_vars.$at_check_non_constant_inter_arg_genlP$.getDynamicValue( thread ) );
          if( NIL != $at_applicable_arg_types$.getDynamicValue( thread ) && NIL == doneP )
          {
            SubLObject csome_list_var2 = $at_applicable_arg_types$.getDynamicValue( thread );
            SubLObject inter_arg_genls2 = NIL;
            inter_arg_genls2 = csome_list_var2.first();
            while ( NIL == doneP && NIL != csome_list_var2)
            {
              SubLObject current2;
              final SubLObject datum2 = current2 = inter_arg_genls2;
              SubLObject ind_arg_genl2 = NIL;
              SubLObject dep_arg_genl2 = NIL;
              cdestructuring_bind.destructuring_bind_must_consp( current2, datum2, $list64 );
              ind_arg_genl2 = current2.first();
              current2 = current2.rest();
              cdestructuring_bind.destructuring_bind_must_consp( current2, datum2, $list64 );
              dep_arg_genl2 = current2.first();
              current2 = current2.rest();
              if( NIL == current2 )
              {
                if( NIL != forts.fort_p( dep_arg_genl2 ) && NIL == genls.genlP( dep_arg, dep_arg_genl2, UNPROVIDED, UNPROVIDED ) )
                {
                  if( NIL != at_vars.$noting_at_violationsP$.getDynamicValue( thread ) )
                  {
                    note_at_violations( inter_arg_genl_violations( reln, ind_arg, ind_argnum, ind_arg_genl2, dep_arg, dep_argnum, dep_arg_genl2 ) );
                  }
                  result = T;
                  doneP = at_utilities.at_finishedP( result );
                }
              }
              else
              {
                cdestructuring_bind.cdestructuring_bind_error( datum2, $list64 );
              }
              csome_list_var2 = csome_list_var2.rest();
              inter_arg_genls2 = csome_list_var2.first();
            }
          }
        }
        finally
        {
          sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.rebind( _prev_bind_4, thread );
          sbhl_marking_vars.$resourced_sbhl_marking_spaces$.rebind( _prev_bind_1_$97, thread );
          sbhl_marking_vars.$resourced_sbhl_marking_space_limit$.rebind( _prev_bind_0_$96, thread );
        }
      }
    }
    finally
    {
      $at_applicable_arg_types_with_assertions$.rebind( _prev_bind_2, thread );
      $at_applicable_arg_types$.rebind( _prev_bind_0, thread );
    }
    return result;
  }

  @SubLTranslatedFile.SubL(source = "cycl/at-routines.lisp", position = 23197L)
  public static SubLObject inter_arg_genl_violations(final SubLObject reln, final SubLObject ind_arg, final SubLObject ind_argnum, final SubLObject ind_arg_genl, final SubLObject dep_arg, final SubLObject dep_argnum,
      final SubLObject dep_arg_genl)
  {
    return inter_arg_violations( $kw65$MAL_ARG_WRT_INTER_ARG_GENL, reln, ind_arg, ind_argnum, ind_arg_genl, dep_arg, dep_argnum, dep_arg_genl );
  }

  @SubLTranslatedFile.SubL(source = "cycl/at-routines.lisp", position = 23440L)
  public static SubLObject mal_inter_arg_not_isaP(final SubLObject reln, final SubLObject ind_arg, final SubLObject ind_argnum, final SubLObject dep_arg, final SubLObject dep_argnum)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL == at_vars.$at_check_inter_arg_not_isaP$.getDynamicValue( thread ) || NIL == reln || NIL == ind_arg || NIL == dep_arg || !ind_argnum.isInteger() )
    {
      return NIL;
    }
    if( NIL == some_inter_arg_not_isa_constraint_somewhereP( reln ) )
    {
      return NIL;
    }
    SubLObject result = NIL;
    SubLObject doneP = NIL;
    final SubLObject _prev_bind_0 = $at_applicable_arg_types$.currentBinding( thread );
    final SubLObject _prev_bind_2 = $at_applicable_arg_types_with_assertions$.currentBinding( thread );
    try
    {
      $at_applicable_arg_types$.bind( NIL, thread );
      $at_applicable_arg_types_with_assertions$.bind( dictionary.new_dictionary( EQUAL, UNPROVIDED ), thread );
      if( reln.eql( $const5$Quote ) )
      {
        final SubLObject _prev_bind_0_$99 = cycl_grammar.$within_quote_form$.currentBinding( thread );
        try
        {
          cycl_grammar.$within_quote_form$.bind( T, thread );
          final SubLObject already_resourcing_p = sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.getDynamicValue( thread );
          final SubLObject _prev_bind_0_$100 = sbhl_marking_vars.$resourced_sbhl_marking_space_limit$.currentBinding( thread );
          final SubLObject _prev_bind_1_$101 = sbhl_marking_vars.$resourced_sbhl_marking_spaces$.currentBinding( thread );
          final SubLObject _prev_bind_3 = sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.currentBinding( thread );
          try
          {
            sbhl_marking_vars.$resourced_sbhl_marking_space_limit$.bind( sbhl_marking_vars.determine_resource_limit( already_resourcing_p, TEN_INTEGER ), thread );
            sbhl_marking_vars.$resourced_sbhl_marking_spaces$.bind( sbhl_marking_vars.possibly_new_marking_resource( already_resourcing_p ), thread );
            sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.bind( T, thread );
            applicable_inter_arg_type_collections( reln, ind_arg, ind_argnum, dep_argnum, $kw66$INTER_ARG_NOT_ISA, T );
            if( NIL != $at_applicable_arg_types$.getDynamicValue( thread ) && NIL == doneP )
            {
              SubLObject csome_list_var = $at_applicable_arg_types$.getDynamicValue( thread );
              SubLObject inter_arg_not_isas = NIL;
              inter_arg_not_isas = csome_list_var.first();
              while ( NIL == doneP && NIL != csome_list_var)
              {
                final SubLObject _prev_bind_0_$101 = wff_vars.$wff_violations$.currentBinding( thread );
                final SubLObject _prev_bind_1_$102 = at_vars.$permitting_denotational_terms_admitted_by_defn_via_isaP$.currentBinding( thread );
                try
                {
                  wff_vars.$wff_violations$.bind( NIL, thread );
                  at_vars.$permitting_denotational_terms_admitted_by_defn_via_isaP$.bind( NIL, thread );
                  SubLObject current;
                  final SubLObject datum = current = inter_arg_not_isas;
                  SubLObject ind_arg_isa = NIL;
                  SubLObject dep_arg_isa = NIL;
                  cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list41 );
                  ind_arg_isa = current.first();
                  current = current.rest();
                  cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list41 );
                  dep_arg_isa = current.first();
                  current = current.rest();
                  if( NIL == current )
                  {
                    if( NIL != forts.fort_p( dep_arg_isa ) )
                    {
                      SubLObject module = NIL;
                      if( NIL != isa.isaP( dep_arg, dep_arg_isa, UNPROVIDED, UNPROVIDED ) )
                      {
                        module = $kw67$MAL_ARG_WRT_INTER_ARG_NOT_ISA;
                        result = T;
                        doneP = at_utilities.at_finishedP( result );
                      }
                      else if( NIL != at_defns.defns_admitP( dep_arg_isa, dep_arg, UNPROVIDED ) )
                      {
                        module = $kw68$MAL_ARG_WRT_INTER_ARG_NOT_DEFN;
                        result = T;
                        doneP = at_utilities.at_finishedP( result );
                      }
                      if( NIL != module && NIL != at_vars.$noting_at_violationsP$.getDynamicValue( thread ) )
                      {
                        note_at_violations( inter_arg_violations( module, reln, ind_arg, ind_argnum, ind_arg_isa, dep_arg, dep_argnum, dep_arg_isa ) );
                        note_at_violations( wff.wff_violations() );
                      }
                    }
                  }
                  else
                  {
                    cdestructuring_bind.cdestructuring_bind_error( datum, $list41 );
                  }
                }
                finally
                {
                  at_vars.$permitting_denotational_terms_admitted_by_defn_via_isaP$.rebind( _prev_bind_1_$102, thread );
                  wff_vars.$wff_violations$.rebind( _prev_bind_0_$101, thread );
                }
                csome_list_var = csome_list_var.rest();
                inter_arg_not_isas = csome_list_var.first();
              }
            }
          }
          finally
          {
            sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.rebind( _prev_bind_3, thread );
            sbhl_marking_vars.$resourced_sbhl_marking_spaces$.rebind( _prev_bind_1_$101, thread );
            sbhl_marking_vars.$resourced_sbhl_marking_space_limit$.rebind( _prev_bind_0_$100, thread );
          }
        }
        finally
        {
          cycl_grammar.$within_quote_form$.rebind( _prev_bind_0_$99, thread );
        }
      }
      else
      {
        final SubLObject already_resourcing_p2 = sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.getDynamicValue( thread );
        final SubLObject _prev_bind_0_$102 = sbhl_marking_vars.$resourced_sbhl_marking_space_limit$.currentBinding( thread );
        final SubLObject _prev_bind_1_$103 = sbhl_marking_vars.$resourced_sbhl_marking_spaces$.currentBinding( thread );
        final SubLObject _prev_bind_4 = sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.currentBinding( thread );
        try
        {
          sbhl_marking_vars.$resourced_sbhl_marking_space_limit$.bind( sbhl_marking_vars.determine_resource_limit( already_resourcing_p2, TEN_INTEGER ), thread );
          sbhl_marking_vars.$resourced_sbhl_marking_spaces$.bind( sbhl_marking_vars.possibly_new_marking_resource( already_resourcing_p2 ), thread );
          sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.bind( T, thread );
          applicable_inter_arg_type_collections( reln, ind_arg, ind_argnum, dep_argnum, $kw66$INTER_ARG_NOT_ISA, T );
          if( NIL != $at_applicable_arg_types$.getDynamicValue( thread ) && NIL == doneP )
          {
            SubLObject csome_list_var2 = $at_applicable_arg_types$.getDynamicValue( thread );
            SubLObject inter_arg_not_isas2 = NIL;
            inter_arg_not_isas2 = csome_list_var2.first();
            while ( NIL == doneP && NIL != csome_list_var2)
            {
              final SubLObject _prev_bind_0_$103 = wff_vars.$wff_violations$.currentBinding( thread );
              final SubLObject _prev_bind_1_$104 = at_vars.$permitting_denotational_terms_admitted_by_defn_via_isaP$.currentBinding( thread );
              try
              {
                wff_vars.$wff_violations$.bind( NIL, thread );
                at_vars.$permitting_denotational_terms_admitted_by_defn_via_isaP$.bind( NIL, thread );
                SubLObject current2;
                final SubLObject datum2 = current2 = inter_arg_not_isas2;
                SubLObject ind_arg_isa2 = NIL;
                SubLObject dep_arg_isa2 = NIL;
                cdestructuring_bind.destructuring_bind_must_consp( current2, datum2, $list41 );
                ind_arg_isa2 = current2.first();
                current2 = current2.rest();
                cdestructuring_bind.destructuring_bind_must_consp( current2, datum2, $list41 );
                dep_arg_isa2 = current2.first();
                current2 = current2.rest();
                if( NIL == current2 )
                {
                  if( NIL != forts.fort_p( dep_arg_isa2 ) )
                  {
                    SubLObject module2 = NIL;
                    if( NIL != isa.isaP( dep_arg, dep_arg_isa2, UNPROVIDED, UNPROVIDED ) )
                    {
                      module2 = $kw67$MAL_ARG_WRT_INTER_ARG_NOT_ISA;
                      result = T;
                      doneP = at_utilities.at_finishedP( result );
                    }
                    else if( NIL != at_defns.defns_admitP( dep_arg_isa2, dep_arg, UNPROVIDED ) )
                    {
                      module2 = $kw68$MAL_ARG_WRT_INTER_ARG_NOT_DEFN;
                      result = T;
                      doneP = at_utilities.at_finishedP( result );
                    }
                    if( NIL != module2 && NIL != at_vars.$noting_at_violationsP$.getDynamicValue( thread ) )
                    {
                      note_at_violations( inter_arg_violations( module2, reln, ind_arg, ind_argnum, ind_arg_isa2, dep_arg, dep_argnum, dep_arg_isa2 ) );
                      note_at_violations( wff.wff_violations() );
                    }
                  }
                }
                else
                {
                  cdestructuring_bind.cdestructuring_bind_error( datum2, $list41 );
                }
              }
              finally
              {
                at_vars.$permitting_denotational_terms_admitted_by_defn_via_isaP$.rebind( _prev_bind_1_$104, thread );
                wff_vars.$wff_violations$.rebind( _prev_bind_0_$103, thread );
              }
              csome_list_var2 = csome_list_var2.rest();
              inter_arg_not_isas2 = csome_list_var2.first();
            }
          }
        }
        finally
        {
          sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.rebind( _prev_bind_4, thread );
          sbhl_marking_vars.$resourced_sbhl_marking_spaces$.rebind( _prev_bind_1_$103, thread );
          sbhl_marking_vars.$resourced_sbhl_marking_space_limit$.rebind( _prev_bind_0_$102, thread );
        }
      }
    }
    finally
    {
      $at_applicable_arg_types_with_assertions$.rebind( _prev_bind_2, thread );
      $at_applicable_arg_types$.rebind( _prev_bind_0, thread );
    }
    return result;
  }

  @SubLTranslatedFile.SubL(source = "cycl/at-routines.lisp", position = 24989L)
  public static SubLObject some_inter_arg_not_isa_constraint_somewhereP(final SubLObject reln)
  {
    return makeBoolean( NIL != somewhere_cache.some_pred_assertion_somewhereP( $const69$interArgNotIsa1_2, reln, ONE_INTEGER, UNPROVIDED ) || NIL != somewhere_cache.some_pred_assertion_somewhereP(
        $const70$interArgNotIsa2_1, reln, ONE_INTEGER, UNPROVIDED ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/at-routines.lisp", position = 25198L)
  public static SubLObject mal_inter_arg_not_genlP(final SubLObject reln, final SubLObject ind_arg, final SubLObject ind_argnum, final SubLObject dep_arg, final SubLObject dep_argnum)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL == at_vars.$at_check_inter_arg_not_genlP$.getDynamicValue( thread ) || NIL == reln || NIL == ind_arg || NIL == dep_arg || !ind_argnum.isInteger() )
    {
      return NIL;
    }
    if( NIL == some_inter_arg_not_genl_constraint_somewhereP( reln ) )
    {
      return NIL;
    }
    SubLObject result = NIL;
    SubLObject doneP = NIL;
    final SubLObject _prev_bind_0 = $at_applicable_arg_types$.currentBinding( thread );
    final SubLObject _prev_bind_2 = $at_applicable_arg_types_with_assertions$.currentBinding( thread );
    try
    {
      $at_applicable_arg_types$.bind( NIL, thread );
      $at_applicable_arg_types_with_assertions$.bind( dictionary.new_dictionary( EQUAL, UNPROVIDED ), thread );
      if( reln.eql( $const5$Quote ) )
      {
        final SubLObject _prev_bind_0_$108 = cycl_grammar.$within_quote_form$.currentBinding( thread );
        try
        {
          cycl_grammar.$within_quote_form$.bind( T, thread );
          final SubLObject already_resourcing_p = sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.getDynamicValue( thread );
          final SubLObject _prev_bind_0_$109 = sbhl_marking_vars.$resourced_sbhl_marking_space_limit$.currentBinding( thread );
          final SubLObject _prev_bind_1_$110 = sbhl_marking_vars.$resourced_sbhl_marking_spaces$.currentBinding( thread );
          final SubLObject _prev_bind_3 = sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.currentBinding( thread );
          try
          {
            sbhl_marking_vars.$resourced_sbhl_marking_space_limit$.bind( sbhl_marking_vars.determine_resource_limit( already_resourcing_p, TEN_INTEGER ), thread );
            sbhl_marking_vars.$resourced_sbhl_marking_spaces$.bind( sbhl_marking_vars.possibly_new_marking_resource( already_resourcing_p ), thread );
            sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.bind( T, thread );
            applicable_inter_arg_type_collections( reln, ind_arg, ind_argnum, dep_argnum, $kw71$INTER_ARG_NOT_GENL, T );
            if( NIL != $at_applicable_arg_types$.getDynamicValue( thread ) && NIL == doneP )
            {
              SubLObject csome_list_var = $at_applicable_arg_types$.getDynamicValue( thread );
              SubLObject inter_arg_not_genls = NIL;
              inter_arg_not_genls = csome_list_var.first();
              while ( NIL == doneP && NIL != csome_list_var)
              {
                SubLObject current;
                final SubLObject datum = current = inter_arg_not_genls;
                SubLObject ind_arg_genl = NIL;
                SubLObject dep_arg_genl = NIL;
                cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list64 );
                ind_arg_genl = current.first();
                current = current.rest();
                cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list64 );
                dep_arg_genl = current.first();
                current = current.rest();
                if( NIL == current )
                {
                  if( NIL != forts.fort_p( dep_arg_genl ) )
                  {
                    SubLObject module = NIL;
                    if( NIL != genls.genlP( dep_arg, dep_arg_genl, UNPROVIDED, UNPROVIDED ) )
                    {
                      module = $kw72$MAL_ARG_WRT_INTER_ARG_NOT_GENL;
                      result = T;
                      doneP = at_utilities.at_finishedP( result );
                    }
                    else if( NIL != at_defns.defns_admitP( dep_arg_genl, dep_arg, UNPROVIDED ) )
                    {
                      module = $kw68$MAL_ARG_WRT_INTER_ARG_NOT_DEFN;
                      result = T;
                      doneP = at_utilities.at_finishedP( result );
                    }
                    if( NIL != module && NIL != at_vars.$noting_at_violationsP$.getDynamicValue( thread ) )
                    {
                      note_at_violations( inter_arg_violations( module, reln, ind_arg, ind_argnum, ind_arg_genl, dep_arg, dep_argnum, dep_arg_genl ) );
                      note_at_violations( wff.wff_violations() );
                    }
                  }
                }
                else
                {
                  cdestructuring_bind.cdestructuring_bind_error( datum, $list64 );
                }
                csome_list_var = csome_list_var.rest();
                inter_arg_not_genls = csome_list_var.first();
              }
            }
          }
          finally
          {
            sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.rebind( _prev_bind_3, thread );
            sbhl_marking_vars.$resourced_sbhl_marking_spaces$.rebind( _prev_bind_1_$110, thread );
            sbhl_marking_vars.$resourced_sbhl_marking_space_limit$.rebind( _prev_bind_0_$109, thread );
          }
        }
        finally
        {
          cycl_grammar.$within_quote_form$.rebind( _prev_bind_0_$108, thread );
        }
      }
      else
      {
        final SubLObject already_resourcing_p2 = sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.getDynamicValue( thread );
        final SubLObject _prev_bind_0_$110 = sbhl_marking_vars.$resourced_sbhl_marking_space_limit$.currentBinding( thread );
        final SubLObject _prev_bind_1_$111 = sbhl_marking_vars.$resourced_sbhl_marking_spaces$.currentBinding( thread );
        final SubLObject _prev_bind_4 = sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.currentBinding( thread );
        try
        {
          sbhl_marking_vars.$resourced_sbhl_marking_space_limit$.bind( sbhl_marking_vars.determine_resource_limit( already_resourcing_p2, TEN_INTEGER ), thread );
          sbhl_marking_vars.$resourced_sbhl_marking_spaces$.bind( sbhl_marking_vars.possibly_new_marking_resource( already_resourcing_p2 ), thread );
          sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.bind( T, thread );
          applicable_inter_arg_type_collections( reln, ind_arg, ind_argnum, dep_argnum, $kw71$INTER_ARG_NOT_GENL, T );
          if( NIL != $at_applicable_arg_types$.getDynamicValue( thread ) && NIL == doneP )
          {
            SubLObject csome_list_var2 = $at_applicable_arg_types$.getDynamicValue( thread );
            SubLObject inter_arg_not_genls2 = NIL;
            inter_arg_not_genls2 = csome_list_var2.first();
            while ( NIL == doneP && NIL != csome_list_var2)
            {
              SubLObject current2;
              final SubLObject datum2 = current2 = inter_arg_not_genls2;
              SubLObject ind_arg_genl2 = NIL;
              SubLObject dep_arg_genl2 = NIL;
              cdestructuring_bind.destructuring_bind_must_consp( current2, datum2, $list64 );
              ind_arg_genl2 = current2.first();
              current2 = current2.rest();
              cdestructuring_bind.destructuring_bind_must_consp( current2, datum2, $list64 );
              dep_arg_genl2 = current2.first();
              current2 = current2.rest();
              if( NIL == current2 )
              {
                if( NIL != forts.fort_p( dep_arg_genl2 ) )
                {
                  SubLObject module2 = NIL;
                  if( NIL != genls.genlP( dep_arg, dep_arg_genl2, UNPROVIDED, UNPROVIDED ) )
                  {
                    module2 = $kw72$MAL_ARG_WRT_INTER_ARG_NOT_GENL;
                    result = T;
                    doneP = at_utilities.at_finishedP( result );
                  }
                  else if( NIL != at_defns.defns_admitP( dep_arg_genl2, dep_arg, UNPROVIDED ) )
                  {
                    module2 = $kw68$MAL_ARG_WRT_INTER_ARG_NOT_DEFN;
                    result = T;
                    doneP = at_utilities.at_finishedP( result );
                  }
                  if( NIL != module2 && NIL != at_vars.$noting_at_violationsP$.getDynamicValue( thread ) )
                  {
                    note_at_violations( inter_arg_violations( module2, reln, ind_arg, ind_argnum, ind_arg_genl2, dep_arg, dep_argnum, dep_arg_genl2 ) );
                    note_at_violations( wff.wff_violations() );
                  }
                }
              }
              else
              {
                cdestructuring_bind.cdestructuring_bind_error( datum2, $list64 );
              }
              csome_list_var2 = csome_list_var2.rest();
              inter_arg_not_genls2 = csome_list_var2.first();
            }
          }
        }
        finally
        {
          sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.rebind( _prev_bind_4, thread );
          sbhl_marking_vars.$resourced_sbhl_marking_spaces$.rebind( _prev_bind_1_$111, thread );
          sbhl_marking_vars.$resourced_sbhl_marking_space_limit$.rebind( _prev_bind_0_$110, thread );
        }
      }
    }
    finally
    {
      $at_applicable_arg_types_with_assertions$.rebind( _prev_bind_2, thread );
      $at_applicable_arg_types$.rebind( _prev_bind_0, thread );
    }
    return result;
  }

  @SubLTranslatedFile.SubL(source = "cycl/at-routines.lisp", position = 26632L)
  public static SubLObject some_inter_arg_not_genl_constraint_somewhereP(final SubLObject reln)
  {
    return somewhere_cache.some_pred_assertion_somewhereP( $const73$interArgNotGenl1_2, reln, ONE_INTEGER, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/at-routines.lisp", position = 26852L)
  public static SubLObject mal_inter_arg_genl_isaP(final SubLObject reln, final SubLObject ind_arg, final SubLObject ind_argnum, final SubLObject dep_arg, final SubLObject dep_argnum)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL == at_vars.$at_check_inter_arg_genl_isaP$.getDynamicValue( thread ) || NIL == reln || NIL == ind_arg || NIL == dep_arg || !ind_argnum.isInteger() )
    {
      return NIL;
    }
    if( NIL == some_inter_arg_genl_isa_constraint_somewhereP( reln ) )
    {
      return NIL;
    }
    SubLObject result = NIL;
    SubLObject doneP = NIL;
    final SubLObject _prev_bind_0 = $at_applicable_arg_types$.currentBinding( thread );
    final SubLObject _prev_bind_2 = $at_applicable_arg_types_with_assertions$.currentBinding( thread );
    try
    {
      $at_applicable_arg_types$.bind( NIL, thread );
      $at_applicable_arg_types_with_assertions$.bind( dictionary.new_dictionary( EQUAL, UNPROVIDED ), thread );
      if( reln.eql( $const5$Quote ) )
      {
        final SubLObject _prev_bind_0_$113 = cycl_grammar.$within_quote_form$.currentBinding( thread );
        try
        {
          cycl_grammar.$within_quote_form$.bind( T, thread );
          final SubLObject already_resourcing_p = sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.getDynamicValue( thread );
          final SubLObject _prev_bind_0_$114 = sbhl_marking_vars.$resourced_sbhl_marking_space_limit$.currentBinding( thread );
          final SubLObject _prev_bind_1_$115 = sbhl_marking_vars.$resourced_sbhl_marking_spaces$.currentBinding( thread );
          final SubLObject _prev_bind_3 = sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.currentBinding( thread );
          try
          {
            sbhl_marking_vars.$resourced_sbhl_marking_space_limit$.bind( sbhl_marking_vars.determine_resource_limit( already_resourcing_p, TEN_INTEGER ), thread );
            sbhl_marking_vars.$resourced_sbhl_marking_spaces$.bind( sbhl_marking_vars.possibly_new_marking_resource( already_resourcing_p ), thread );
            sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.bind( T, thread );
            applicable_inter_arg_type_collections( reln, ind_arg, ind_argnum, dep_argnum, $kw74$INTER_ARG_GENL_ISA, T );
            if( NIL != $at_applicable_arg_types$.getDynamicValue( thread ) && NIL == doneP )
            {
              SubLObject csome_list_var = $at_applicable_arg_types$.getDynamicValue( thread );
              SubLObject inter_arg_genl_isas = NIL;
              inter_arg_genl_isas = csome_list_var.first();
              while ( NIL == doneP && NIL != csome_list_var)
              {
                SubLObject current;
                final SubLObject datum = current = inter_arg_genl_isas;
                SubLObject ind_arg_genl = NIL;
                SubLObject dep_arg_isa = NIL;
                cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list75 );
                ind_arg_genl = current.first();
                current = current.rest();
                cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list75 );
                dep_arg_isa = current.first();
                current = current.rest();
                if( NIL == current )
                {
                  if( NIL != forts.fort_p( dep_arg_isa ) )
                  {
                    SubLObject module = NIL;
                    if( NIL == isa.isaP( dep_arg, dep_arg_isa, UNPROVIDED, UNPROVIDED ) )
                    {
                      module = $kw76$MAL_ARG_WRT_INTER_ARG_GENL_ISA;
                      result = T;
                      doneP = at_utilities.at_finishedP( result );
                    }
                    else if( NIL == at_defns.defns_admitP( dep_arg_isa, dep_arg, UNPROVIDED ) )
                    {
                      module = $kw76$MAL_ARG_WRT_INTER_ARG_GENL_ISA;
                      result = T;
                      doneP = at_utilities.at_finishedP( result );
                    }
                    if( NIL != module && NIL != at_vars.$noting_at_violationsP$.getDynamicValue( thread ) )
                    {
                      note_at_violations( inter_arg_violations( module, reln, ind_arg, ind_argnum, ind_arg_genl, dep_arg, dep_argnum, dep_arg_isa ) );
                      note_at_violations( wff.wff_violations() );
                    }
                  }
                }
                else
                {
                  cdestructuring_bind.cdestructuring_bind_error( datum, $list75 );
                }
                csome_list_var = csome_list_var.rest();
                inter_arg_genl_isas = csome_list_var.first();
              }
            }
          }
          finally
          {
            sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.rebind( _prev_bind_3, thread );
            sbhl_marking_vars.$resourced_sbhl_marking_spaces$.rebind( _prev_bind_1_$115, thread );
            sbhl_marking_vars.$resourced_sbhl_marking_space_limit$.rebind( _prev_bind_0_$114, thread );
          }
        }
        finally
        {
          cycl_grammar.$within_quote_form$.rebind( _prev_bind_0_$113, thread );
        }
      }
      else
      {
        final SubLObject already_resourcing_p2 = sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.getDynamicValue( thread );
        final SubLObject _prev_bind_0_$115 = sbhl_marking_vars.$resourced_sbhl_marking_space_limit$.currentBinding( thread );
        final SubLObject _prev_bind_1_$116 = sbhl_marking_vars.$resourced_sbhl_marking_spaces$.currentBinding( thread );
        final SubLObject _prev_bind_4 = sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.currentBinding( thread );
        try
        {
          sbhl_marking_vars.$resourced_sbhl_marking_space_limit$.bind( sbhl_marking_vars.determine_resource_limit( already_resourcing_p2, TEN_INTEGER ), thread );
          sbhl_marking_vars.$resourced_sbhl_marking_spaces$.bind( sbhl_marking_vars.possibly_new_marking_resource( already_resourcing_p2 ), thread );
          sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.bind( T, thread );
          applicable_inter_arg_type_collections( reln, ind_arg, ind_argnum, dep_argnum, $kw74$INTER_ARG_GENL_ISA, T );
          if( NIL != $at_applicable_arg_types$.getDynamicValue( thread ) && NIL == doneP )
          {
            SubLObject csome_list_var2 = $at_applicable_arg_types$.getDynamicValue( thread );
            SubLObject inter_arg_genl_isas2 = NIL;
            inter_arg_genl_isas2 = csome_list_var2.first();
            while ( NIL == doneP && NIL != csome_list_var2)
            {
              SubLObject current2;
              final SubLObject datum2 = current2 = inter_arg_genl_isas2;
              SubLObject ind_arg_genl2 = NIL;
              SubLObject dep_arg_isa2 = NIL;
              cdestructuring_bind.destructuring_bind_must_consp( current2, datum2, $list75 );
              ind_arg_genl2 = current2.first();
              current2 = current2.rest();
              cdestructuring_bind.destructuring_bind_must_consp( current2, datum2, $list75 );
              dep_arg_isa2 = current2.first();
              current2 = current2.rest();
              if( NIL == current2 )
              {
                if( NIL != forts.fort_p( dep_arg_isa2 ) )
                {
                  SubLObject module2 = NIL;
                  if( NIL == isa.isaP( dep_arg, dep_arg_isa2, UNPROVIDED, UNPROVIDED ) )
                  {
                    module2 = $kw76$MAL_ARG_WRT_INTER_ARG_GENL_ISA;
                    result = T;
                    doneP = at_utilities.at_finishedP( result );
                  }
                  else if( NIL == at_defns.defns_admitP( dep_arg_isa2, dep_arg, UNPROVIDED ) )
                  {
                    module2 = $kw76$MAL_ARG_WRT_INTER_ARG_GENL_ISA;
                    result = T;
                    doneP = at_utilities.at_finishedP( result );
                  }
                  if( NIL != module2 && NIL != at_vars.$noting_at_violationsP$.getDynamicValue( thread ) )
                  {
                    note_at_violations( inter_arg_violations( module2, reln, ind_arg, ind_argnum, ind_arg_genl2, dep_arg, dep_argnum, dep_arg_isa2 ) );
                    note_at_violations( wff.wff_violations() );
                  }
                }
              }
              else
              {
                cdestructuring_bind.cdestructuring_bind_error( datum2, $list75 );
              }
              csome_list_var2 = csome_list_var2.rest();
              inter_arg_genl_isas2 = csome_list_var2.first();
            }
          }
        }
        finally
        {
          sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.rebind( _prev_bind_4, thread );
          sbhl_marking_vars.$resourced_sbhl_marking_spaces$.rebind( _prev_bind_1_$116, thread );
          sbhl_marking_vars.$resourced_sbhl_marking_space_limit$.rebind( _prev_bind_0_$115, thread );
        }
      }
    }
    finally
    {
      $at_applicable_arg_types_with_assertions$.rebind( _prev_bind_2, thread );
      $at_applicable_arg_types$.rebind( _prev_bind_0, thread );
    }
    return result;
  }

  @SubLTranslatedFile.SubL(source = "cycl/at-routines.lisp", position = 28294L)
  public static SubLObject some_inter_arg_genl_isa_constraint_somewhereP(final SubLObject reln)
  {
    return somewhere_cache.some_pred_assertion_somewhereP( $const77$interArgGenlIsa2_1, reln, ONE_INTEGER, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/at-routines.lisp", position = 28514L)
  public static SubLObject mal_inter_arg_isa_genlP(final SubLObject reln, final SubLObject ind_arg, final SubLObject ind_argnum, final SubLObject dep_arg, final SubLObject dep_argnum)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL == at_vars.$at_check_inter_arg_isa_genlP$.getDynamicValue( thread ) || NIL == reln || NIL == ind_arg || NIL == dep_arg || !ind_argnum.isInteger() )
    {
      return NIL;
    }
    if( NIL == some_inter_arg_isa_genl_constraint_somewhereP( reln ) )
    {
      return NIL;
    }
    SubLObject result = NIL;
    SubLObject doneP = NIL;
    final SubLObject _prev_bind_0 = $at_applicable_arg_types$.currentBinding( thread );
    final SubLObject _prev_bind_2 = $at_applicable_arg_types_with_assertions$.currentBinding( thread );
    try
    {
      $at_applicable_arg_types$.bind( NIL, thread );
      $at_applicable_arg_types_with_assertions$.bind( dictionary.new_dictionary( EQUAL, UNPROVIDED ), thread );
      if( reln.eql( $const5$Quote ) )
      {
        final SubLObject _prev_bind_0_$118 = cycl_grammar.$within_quote_form$.currentBinding( thread );
        try
        {
          cycl_grammar.$within_quote_form$.bind( T, thread );
          final SubLObject already_resourcing_p = sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.getDynamicValue( thread );
          final SubLObject _prev_bind_0_$119 = sbhl_marking_vars.$resourced_sbhl_marking_space_limit$.currentBinding( thread );
          final SubLObject _prev_bind_1_$120 = sbhl_marking_vars.$resourced_sbhl_marking_spaces$.currentBinding( thread );
          final SubLObject _prev_bind_3 = sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.currentBinding( thread );
          try
          {
            sbhl_marking_vars.$resourced_sbhl_marking_space_limit$.bind( sbhl_marking_vars.determine_resource_limit( already_resourcing_p, TEN_INTEGER ), thread );
            sbhl_marking_vars.$resourced_sbhl_marking_spaces$.bind( sbhl_marking_vars.possibly_new_marking_resource( already_resourcing_p ), thread );
            sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.bind( T, thread );
            applicable_inter_arg_type_collections( reln, ind_arg, ind_argnum, dep_argnum, $kw78$INTER_ARG_ISA_GENL, T );
            if( NIL != $at_applicable_arg_types$.getDynamicValue( thread ) && NIL == doneP )
            {
              SubLObject csome_list_var = $at_applicable_arg_types$.getDynamicValue( thread );
              SubLObject inter_arg_isa_genls = NIL;
              inter_arg_isa_genls = csome_list_var.first();
              while ( NIL == doneP && NIL != csome_list_var)
              {
                SubLObject current;
                final SubLObject datum = current = inter_arg_isa_genls;
                SubLObject ind_arg_isa = NIL;
                SubLObject dep_arg_genl = NIL;
                cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list79 );
                ind_arg_isa = current.first();
                current = current.rest();
                cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list79 );
                dep_arg_genl = current.first();
                current = current.rest();
                if( NIL == current )
                {
                  if( NIL != forts.fort_p( dep_arg_genl ) )
                  {
                    SubLObject module = NIL;
                    if( NIL == genls.genlP( dep_arg, dep_arg_genl, UNPROVIDED, UNPROVIDED ) )
                    {
                      module = $kw80$MAL_ARG_WRT_INTER_ARG_ISA_GENL;
                      result = T;
                      doneP = at_utilities.at_finishedP( result );
                    }
                    if( NIL != module && NIL != at_vars.$noting_at_violationsP$.getDynamicValue( thread ) )
                    {
                      note_at_violations( inter_arg_violations( module, reln, ind_arg, ind_argnum, ind_arg_isa, dep_arg, dep_argnum, dep_arg_genl ) );
                      note_at_violations( wff.wff_violations() );
                    }
                  }
                }
                else
                {
                  cdestructuring_bind.cdestructuring_bind_error( datum, $list79 );
                }
                csome_list_var = csome_list_var.rest();
                inter_arg_isa_genls = csome_list_var.first();
              }
            }
          }
          finally
          {
            sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.rebind( _prev_bind_3, thread );
            sbhl_marking_vars.$resourced_sbhl_marking_spaces$.rebind( _prev_bind_1_$120, thread );
            sbhl_marking_vars.$resourced_sbhl_marking_space_limit$.rebind( _prev_bind_0_$119, thread );
          }
        }
        finally
        {
          cycl_grammar.$within_quote_form$.rebind( _prev_bind_0_$118, thread );
        }
      }
      else
      {
        final SubLObject already_resourcing_p2 = sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.getDynamicValue( thread );
        final SubLObject _prev_bind_0_$120 = sbhl_marking_vars.$resourced_sbhl_marking_space_limit$.currentBinding( thread );
        final SubLObject _prev_bind_1_$121 = sbhl_marking_vars.$resourced_sbhl_marking_spaces$.currentBinding( thread );
        final SubLObject _prev_bind_4 = sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.currentBinding( thread );
        try
        {
          sbhl_marking_vars.$resourced_sbhl_marking_space_limit$.bind( sbhl_marking_vars.determine_resource_limit( already_resourcing_p2, TEN_INTEGER ), thread );
          sbhl_marking_vars.$resourced_sbhl_marking_spaces$.bind( sbhl_marking_vars.possibly_new_marking_resource( already_resourcing_p2 ), thread );
          sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.bind( T, thread );
          applicable_inter_arg_type_collections( reln, ind_arg, ind_argnum, dep_argnum, $kw78$INTER_ARG_ISA_GENL, T );
          if( NIL != $at_applicable_arg_types$.getDynamicValue( thread ) && NIL == doneP )
          {
            SubLObject csome_list_var2 = $at_applicable_arg_types$.getDynamicValue( thread );
            SubLObject inter_arg_isa_genls2 = NIL;
            inter_arg_isa_genls2 = csome_list_var2.first();
            while ( NIL == doneP && NIL != csome_list_var2)
            {
              SubLObject current2;
              final SubLObject datum2 = current2 = inter_arg_isa_genls2;
              SubLObject ind_arg_isa2 = NIL;
              SubLObject dep_arg_genl2 = NIL;
              cdestructuring_bind.destructuring_bind_must_consp( current2, datum2, $list79 );
              ind_arg_isa2 = current2.first();
              current2 = current2.rest();
              cdestructuring_bind.destructuring_bind_must_consp( current2, datum2, $list79 );
              dep_arg_genl2 = current2.first();
              current2 = current2.rest();
              if( NIL == current2 )
              {
                if( NIL != forts.fort_p( dep_arg_genl2 ) )
                {
                  SubLObject module2 = NIL;
                  if( NIL == genls.genlP( dep_arg, dep_arg_genl2, UNPROVIDED, UNPROVIDED ) )
                  {
                    module2 = $kw80$MAL_ARG_WRT_INTER_ARG_ISA_GENL;
                    result = T;
                    doneP = at_utilities.at_finishedP( result );
                  }
                  if( NIL != module2 && NIL != at_vars.$noting_at_violationsP$.getDynamicValue( thread ) )
                  {
                    note_at_violations( inter_arg_violations( module2, reln, ind_arg, ind_argnum, ind_arg_isa2, dep_arg, dep_argnum, dep_arg_genl2 ) );
                    note_at_violations( wff.wff_violations() );
                  }
                }
              }
              else
              {
                cdestructuring_bind.cdestructuring_bind_error( datum2, $list79 );
              }
              csome_list_var2 = csome_list_var2.rest();
              inter_arg_isa_genls2 = csome_list_var2.first();
            }
          }
        }
        finally
        {
          sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.rebind( _prev_bind_4, thread );
          sbhl_marking_vars.$resourced_sbhl_marking_spaces$.rebind( _prev_bind_1_$121, thread );
          sbhl_marking_vars.$resourced_sbhl_marking_space_limit$.rebind( _prev_bind_0_$120, thread );
        }
      }
    }
    finally
    {
      $at_applicable_arg_types_with_assertions$.rebind( _prev_bind_2, thread );
      $at_applicable_arg_types$.rebind( _prev_bind_0, thread );
    }
    return result;
  }

  @SubLTranslatedFile.SubL(source = "cycl/at-routines.lisp", position = 29816L)
  public static SubLObject some_inter_arg_isa_genl_constraint_somewhereP(final SubLObject reln)
  {
    return makeBoolean( NIL != somewhere_cache.some_pred_assertion_somewhereP( $const81$interArgIsaGenl1_2, reln, ONE_INTEGER, UNPROVIDED ) || NIL != somewhere_cache.some_pred_assertion_somewhereP(
        $const82$interArgIsaGenl2_1, reln, ONE_INTEGER, UNPROVIDED ) || NIL != somewhere_cache.some_pred_assertion_somewhereP( $const83$interArgIsaGenl2_3, reln, ONE_INTEGER, UNPROVIDED ) || NIL != somewhere_cache
            .some_pred_assertion_somewhereP( $const84$interArgIsaGenl3_2, reln, ONE_INTEGER, UNPROVIDED ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/at-routines.lisp", position = 30166L)
  public static SubLObject mal_inter_arg_not_isa_disjointP(final SubLObject reln, final SubLObject ind_arg, final SubLObject ind_argnum, final SubLObject dep_arg, final SubLObject dep_argnum)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL == at_vars.$at_check_inter_arg_isaP$.getDynamicValue( thread ) || NIL == at_vars.$at_check_not_isa_disjointP$.getDynamicValue( thread ) || NIL == ind_arg || !ind_argnum.isInteger() )
    {
      return NIL;
    }
    if( NIL != at_utilities.inter_arg_isa_cache_initializedP() && NIL == at_utilities.some_inter_arg_isa_constraint_somewhereP( reln ) )
    {
      return NIL;
    }
    SubLObject result = NIL;
    SubLObject doneP = NIL;
    final SubLObject _prev_bind_0 = $at_applicable_arg_types$.currentBinding( thread );
    final SubLObject _prev_bind_2 = $at_applicable_arg_types_with_assertions$.currentBinding( thread );
    try
    {
      $at_applicable_arg_types$.bind( NIL, thread );
      $at_applicable_arg_types_with_assertions$.bind( dictionary.new_dictionary( EQUAL, UNPROVIDED ), thread );
      if( reln.eql( $const5$Quote ) )
      {
        final SubLObject _prev_bind_0_$123 = cycl_grammar.$within_quote_form$.currentBinding( thread );
        try
        {
          cycl_grammar.$within_quote_form$.bind( T, thread );
          final SubLObject already_resourcing_p = sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.getDynamicValue( thread );
          final SubLObject _prev_bind_0_$124 = sbhl_marking_vars.$resourced_sbhl_marking_space_limit$.currentBinding( thread );
          final SubLObject _prev_bind_1_$125 = sbhl_marking_vars.$resourced_sbhl_marking_spaces$.currentBinding( thread );
          final SubLObject _prev_bind_3 = sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.currentBinding( thread );
          try
          {
            sbhl_marking_vars.$resourced_sbhl_marking_space_limit$.bind( sbhl_marking_vars.determine_resource_limit( already_resourcing_p, TEN_INTEGER ), thread );
            sbhl_marking_vars.$resourced_sbhl_marking_spaces$.bind( sbhl_marking_vars.possibly_new_marking_resource( already_resourcing_p ), thread );
            sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.bind( T, thread );
            applicable_inter_arg_type_collections( reln, ind_arg, ind_argnum, dep_argnum, $kw40$INTER_ARG_ISA, at_vars.$at_check_non_constant_inter_arg_isaP$.getDynamicValue( thread ) );
            if( NIL != $at_applicable_arg_types$.getDynamicValue( thread ) && NIL == doneP )
            {
              SubLObject csome_list_var = $at_applicable_arg_types$.getDynamicValue( thread );
              SubLObject inter_arg_isas = NIL;
              inter_arg_isas = csome_list_var.first();
              while ( NIL == doneP && NIL != csome_list_var)
              {
                SubLObject current;
                final SubLObject datum = current = inter_arg_isas;
                SubLObject ind_arg_isa = NIL;
                SubLObject dep_arg_isa = NIL;
                cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list41 );
                ind_arg_isa = current.first();
                current = current.rest();
                cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list41 );
                dep_arg_isa = current.first();
                current = current.rest();
                if( NIL == current )
                {
                  if( NIL != forts.fort_p( dep_arg_isa ) )
                  {
                    final SubLObject isa_collections = arg_collections( dep_arg, $kw20$ISA, at_vars.$at_arg_type$.getDynamicValue( thread ), mt_relevance_macros.mt_info( UNPROVIDED ) );
                    if( NIL != disjoint_with.any_disjoint_withP( isa_collections, dep_arg_isa, UNPROVIDED, UNPROVIDED ) )
                    {
                      if( NIL != at_vars.$noting_at_violationsP$.getDynamicValue( thread ) )
                      {
                        note_at_violations( inter_arg_not_isa_disjoint_violations( reln, ind_arg, ind_argnum, ind_arg_isa, dep_arg, dep_argnum, dep_arg_isa ) );
                      }
                      result = T;
                      doneP = at_utilities.at_finishedP( result );
                    }
                    final SubLObject _prev_bind_0_$125 = wff_vars.$wff_violations$.currentBinding( thread );
                    try
                    {
                      wff_vars.$wff_violations$.bind( NIL, thread );
                      if( NIL == doneP )
                      {
                        if( $kw22$NAUT != at_vars.$at_arg_type$.getDynamicValue( thread ) || NIL == cycl_utilities.formula_find_if( Symbols.symbol_function( $sym23$VARIABLE_TERM_WRT_ARG_TYPE_ ), dep_arg, UNPROVIDED,
                            UNPROVIDED ) )
                        {
                          if( NIL != at_defns.defns_rejectP( dep_arg_isa, dep_arg, UNPROVIDED ) )
                          {
                            if( NIL != at_vars.$noting_at_violationsP$.getDynamicValue( thread ) )
                            {
                              note_at_violations( inter_arg_not_isa_disjoint_violations( reln, ind_arg, ind_argnum, ind_arg_isa, dep_arg, dep_argnum, dep_arg_isa ) );
                              note_at_violations( wff.wff_violations() );
                            }
                            result = T;
                            doneP = at_utilities.at_finishedP( result );
                          }
                        }
                      }
                    }
                    finally
                    {
                      wff_vars.$wff_violations$.rebind( _prev_bind_0_$125, thread );
                    }
                  }
                }
                else
                {
                  cdestructuring_bind.cdestructuring_bind_error( datum, $list41 );
                }
                csome_list_var = csome_list_var.rest();
                inter_arg_isas = csome_list_var.first();
              }
            }
          }
          finally
          {
            sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.rebind( _prev_bind_3, thread );
            sbhl_marking_vars.$resourced_sbhl_marking_spaces$.rebind( _prev_bind_1_$125, thread );
            sbhl_marking_vars.$resourced_sbhl_marking_space_limit$.rebind( _prev_bind_0_$124, thread );
          }
        }
        finally
        {
          cycl_grammar.$within_quote_form$.rebind( _prev_bind_0_$123, thread );
        }
      }
      else
      {
        final SubLObject already_resourcing_p2 = sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.getDynamicValue( thread );
        final SubLObject _prev_bind_0_$126 = sbhl_marking_vars.$resourced_sbhl_marking_space_limit$.currentBinding( thread );
        final SubLObject _prev_bind_1_$126 = sbhl_marking_vars.$resourced_sbhl_marking_spaces$.currentBinding( thread );
        final SubLObject _prev_bind_4 = sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.currentBinding( thread );
        try
        {
          sbhl_marking_vars.$resourced_sbhl_marking_space_limit$.bind( sbhl_marking_vars.determine_resource_limit( already_resourcing_p2, TEN_INTEGER ), thread );
          sbhl_marking_vars.$resourced_sbhl_marking_spaces$.bind( sbhl_marking_vars.possibly_new_marking_resource( already_resourcing_p2 ), thread );
          sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.bind( T, thread );
          applicable_inter_arg_type_collections( reln, ind_arg, ind_argnum, dep_argnum, $kw40$INTER_ARG_ISA, at_vars.$at_check_non_constant_inter_arg_isaP$.getDynamicValue( thread ) );
          if( NIL != $at_applicable_arg_types$.getDynamicValue( thread ) && NIL == doneP )
          {
            SubLObject csome_list_var2 = $at_applicable_arg_types$.getDynamicValue( thread );
            SubLObject inter_arg_isas2 = NIL;
            inter_arg_isas2 = csome_list_var2.first();
            while ( NIL == doneP && NIL != csome_list_var2)
            {
              SubLObject current2;
              final SubLObject datum2 = current2 = inter_arg_isas2;
              SubLObject ind_arg_isa2 = NIL;
              SubLObject dep_arg_isa2 = NIL;
              cdestructuring_bind.destructuring_bind_must_consp( current2, datum2, $list41 );
              ind_arg_isa2 = current2.first();
              current2 = current2.rest();
              cdestructuring_bind.destructuring_bind_must_consp( current2, datum2, $list41 );
              dep_arg_isa2 = current2.first();
              current2 = current2.rest();
              if( NIL == current2 )
              {
                if( NIL != forts.fort_p( dep_arg_isa2 ) )
                {
                  final SubLObject isa_collections2 = arg_collections( dep_arg, $kw20$ISA, at_vars.$at_arg_type$.getDynamicValue( thread ), mt_relevance_macros.mt_info( UNPROVIDED ) );
                  if( NIL != disjoint_with.any_disjoint_withP( isa_collections2, dep_arg_isa2, UNPROVIDED, UNPROVIDED ) )
                  {
                    if( NIL != at_vars.$noting_at_violationsP$.getDynamicValue( thread ) )
                    {
                      note_at_violations( inter_arg_not_isa_disjoint_violations( reln, ind_arg, ind_argnum, ind_arg_isa2, dep_arg, dep_argnum, dep_arg_isa2 ) );
                    }
                    result = T;
                    doneP = at_utilities.at_finishedP( result );
                  }
                  final SubLObject _prev_bind_0_$127 = wff_vars.$wff_violations$.currentBinding( thread );
                  try
                  {
                    wff_vars.$wff_violations$.bind( NIL, thread );
                    if( NIL == doneP )
                    {
                      if( $kw22$NAUT != at_vars.$at_arg_type$.getDynamicValue( thread ) || NIL == cycl_utilities.formula_find_if( Symbols.symbol_function( $sym23$VARIABLE_TERM_WRT_ARG_TYPE_ ), dep_arg, UNPROVIDED,
                          UNPROVIDED ) )
                      {
                        if( NIL != at_defns.defns_rejectP( dep_arg_isa2, dep_arg, UNPROVIDED ) )
                        {
                          if( NIL != at_vars.$noting_at_violationsP$.getDynamicValue( thread ) )
                          {
                            note_at_violations( inter_arg_not_isa_disjoint_violations( reln, ind_arg, ind_argnum, ind_arg_isa2, dep_arg, dep_argnum, dep_arg_isa2 ) );
                            note_at_violations( wff.wff_violations() );
                          }
                          result = T;
                          doneP = at_utilities.at_finishedP( result );
                        }
                      }
                    }
                  }
                  finally
                  {
                    wff_vars.$wff_violations$.rebind( _prev_bind_0_$127, thread );
                  }
                }
              }
              else
              {
                cdestructuring_bind.cdestructuring_bind_error( datum2, $list41 );
              }
              csome_list_var2 = csome_list_var2.rest();
              inter_arg_isas2 = csome_list_var2.first();
            }
          }
        }
        finally
        {
          sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.rebind( _prev_bind_4, thread );
          sbhl_marking_vars.$resourced_sbhl_marking_spaces$.rebind( _prev_bind_1_$126, thread );
          sbhl_marking_vars.$resourced_sbhl_marking_space_limit$.rebind( _prev_bind_0_$126, thread );
        }
      }
    }
    finally
    {
      $at_applicable_arg_types_with_assertions$.rebind( _prev_bind_2, thread );
      $at_applicable_arg_types$.rebind( _prev_bind_0, thread );
    }
    return result;
  }

  @SubLTranslatedFile.SubL(source = "cycl/at-routines.lisp", position = 31988L)
  public static SubLObject inter_arg_not_isa_disjoint_violations(final SubLObject reln, final SubLObject ind_arg, final SubLObject ind_argnum, final SubLObject ind_arg_isa, final SubLObject dep_arg,
      final SubLObject dep_argnum, final SubLObject dep_arg_isa)
  {
    return inter_arg_violations( $kw85$MAL_ARG_WRT_INTER_ARG_NOT_ISA_DISJOINT, reln, ind_arg, ind_argnum, ind_arg_isa, dep_arg, dep_argnum, dep_arg_isa );
  }

  @SubLTranslatedFile.SubL(source = "cycl/at-routines.lisp", position = 32251L)
  public static SubLObject mal_inter_arg_not_genl_disjointP(final SubLObject reln, final SubLObject ind_arg, final SubLObject ind_argnum, final SubLObject dep_arg, final SubLObject dep_argnum)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL == at_vars.$at_check_inter_arg_genlP$.getDynamicValue( thread ) || NIL == at_vars.$at_check_not_genls_disjointP$.getDynamicValue( thread ) || NIL == ind_arg || !ind_argnum.isInteger() )
    {
      return NIL;
    }
    if( NIL == some_inter_arg_genl_constraint_somewhereP( reln ) )
    {
      return NIL;
    }
    SubLObject result = NIL;
    SubLObject doneP = NIL;
    final SubLObject _prev_bind_0 = $at_applicable_arg_types$.currentBinding( thread );
    final SubLObject _prev_bind_2 = $at_applicable_arg_types_with_assertions$.currentBinding( thread );
    try
    {
      $at_applicable_arg_types$.bind( NIL, thread );
      $at_applicable_arg_types_with_assertions$.bind( dictionary.new_dictionary( EQUAL, UNPROVIDED ), thread );
      if( reln.eql( $const5$Quote ) )
      {
        final SubLObject _prev_bind_0_$130 = cycl_grammar.$within_quote_form$.currentBinding( thread );
        try
        {
          cycl_grammar.$within_quote_form$.bind( T, thread );
          final SubLObject already_resourcing_p = sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.getDynamicValue( thread );
          final SubLObject _prev_bind_0_$131 = sbhl_marking_vars.$resourced_sbhl_marking_space_limit$.currentBinding( thread );
          final SubLObject _prev_bind_1_$132 = sbhl_marking_vars.$resourced_sbhl_marking_spaces$.currentBinding( thread );
          final SubLObject _prev_bind_3 = sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.currentBinding( thread );
          try
          {
            sbhl_marking_vars.$resourced_sbhl_marking_space_limit$.bind( sbhl_marking_vars.determine_resource_limit( already_resourcing_p, TEN_INTEGER ), thread );
            sbhl_marking_vars.$resourced_sbhl_marking_spaces$.bind( sbhl_marking_vars.possibly_new_marking_resource( already_resourcing_p ), thread );
            sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.bind( T, thread );
            applicable_inter_arg_type_collections( reln, ind_arg, ind_argnum, dep_argnum, $kw63$INTER_ARG_GENL, at_vars.$at_check_non_constant_inter_arg_genlP$.getDynamicValue( thread ) );
            if( NIL != $at_applicable_arg_types$.getDynamicValue( thread ) && NIL == doneP )
            {
              SubLObject csome_list_var = $at_applicable_arg_types$.getDynamicValue( thread );
              SubLObject inter_arg_genls = NIL;
              inter_arg_genls = csome_list_var.first();
              while ( NIL == doneP && NIL != csome_list_var)
              {
                SubLObject current;
                final SubLObject datum = current = inter_arg_genls;
                SubLObject ind_arg_genl = NIL;
                SubLObject dep_arg_genl = NIL;
                cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list64 );
                ind_arg_genl = current.first();
                current = current.rest();
                cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list64 );
                dep_arg_genl = current.first();
                current = current.rest();
                if( NIL == current )
                {
                  if( NIL != forts.fort_p( dep_arg_genl ) )
                  {
                    final SubLObject genl_collections = arg_collections( dep_arg, $kw35$GENLS, at_vars.$at_arg_type$.getDynamicValue( thread ), mt_relevance_macros.mt_info( UNPROVIDED ) );
                    if( NIL != disjoint_with.any_disjoint_withP( genl_collections, dep_arg_genl, UNPROVIDED, UNPROVIDED ) )
                    {
                      if( NIL != at_vars.$noting_at_violationsP$.getDynamicValue( thread ) )
                      {
                        note_at_violations( inter_arg_not_genl_disjoint_violations( reln, ind_arg, ind_argnum, ind_arg_genl, dep_arg, dep_argnum, dep_arg_genl ) );
                      }
                      result = T;
                      doneP = at_utilities.at_finishedP( result );
                    }
                  }
                }
                else
                {
                  cdestructuring_bind.cdestructuring_bind_error( datum, $list64 );
                }
                csome_list_var = csome_list_var.rest();
                inter_arg_genls = csome_list_var.first();
              }
            }
          }
          finally
          {
            sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.rebind( _prev_bind_3, thread );
            sbhl_marking_vars.$resourced_sbhl_marking_spaces$.rebind( _prev_bind_1_$132, thread );
            sbhl_marking_vars.$resourced_sbhl_marking_space_limit$.rebind( _prev_bind_0_$131, thread );
          }
        }
        finally
        {
          cycl_grammar.$within_quote_form$.rebind( _prev_bind_0_$130, thread );
        }
      }
      else
      {
        final SubLObject already_resourcing_p2 = sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.getDynamicValue( thread );
        final SubLObject _prev_bind_0_$132 = sbhl_marking_vars.$resourced_sbhl_marking_space_limit$.currentBinding( thread );
        final SubLObject _prev_bind_1_$133 = sbhl_marking_vars.$resourced_sbhl_marking_spaces$.currentBinding( thread );
        final SubLObject _prev_bind_4 = sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.currentBinding( thread );
        try
        {
          sbhl_marking_vars.$resourced_sbhl_marking_space_limit$.bind( sbhl_marking_vars.determine_resource_limit( already_resourcing_p2, TEN_INTEGER ), thread );
          sbhl_marking_vars.$resourced_sbhl_marking_spaces$.bind( sbhl_marking_vars.possibly_new_marking_resource( already_resourcing_p2 ), thread );
          sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.bind( T, thread );
          applicable_inter_arg_type_collections( reln, ind_arg, ind_argnum, dep_argnum, $kw63$INTER_ARG_GENL, at_vars.$at_check_non_constant_inter_arg_genlP$.getDynamicValue( thread ) );
          if( NIL != $at_applicable_arg_types$.getDynamicValue( thread ) && NIL == doneP )
          {
            SubLObject csome_list_var2 = $at_applicable_arg_types$.getDynamicValue( thread );
            SubLObject inter_arg_genls2 = NIL;
            inter_arg_genls2 = csome_list_var2.first();
            while ( NIL == doneP && NIL != csome_list_var2)
            {
              SubLObject current2;
              final SubLObject datum2 = current2 = inter_arg_genls2;
              SubLObject ind_arg_genl2 = NIL;
              SubLObject dep_arg_genl2 = NIL;
              cdestructuring_bind.destructuring_bind_must_consp( current2, datum2, $list64 );
              ind_arg_genl2 = current2.first();
              current2 = current2.rest();
              cdestructuring_bind.destructuring_bind_must_consp( current2, datum2, $list64 );
              dep_arg_genl2 = current2.first();
              current2 = current2.rest();
              if( NIL == current2 )
              {
                if( NIL != forts.fort_p( dep_arg_genl2 ) )
                {
                  final SubLObject genl_collections2 = arg_collections( dep_arg, $kw35$GENLS, at_vars.$at_arg_type$.getDynamicValue( thread ), mt_relevance_macros.mt_info( UNPROVIDED ) );
                  if( NIL != disjoint_with.any_disjoint_withP( genl_collections2, dep_arg_genl2, UNPROVIDED, UNPROVIDED ) )
                  {
                    if( NIL != at_vars.$noting_at_violationsP$.getDynamicValue( thread ) )
                    {
                      note_at_violations( inter_arg_not_genl_disjoint_violations( reln, ind_arg, ind_argnum, ind_arg_genl2, dep_arg, dep_argnum, dep_arg_genl2 ) );
                    }
                    result = T;
                    doneP = at_utilities.at_finishedP( result );
                  }
                }
              }
              else
              {
                cdestructuring_bind.cdestructuring_bind_error( datum2, $list64 );
              }
              csome_list_var2 = csome_list_var2.rest();
              inter_arg_genls2 = csome_list_var2.first();
            }
          }
        }
        finally
        {
          sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.rebind( _prev_bind_4, thread );
          sbhl_marking_vars.$resourced_sbhl_marking_spaces$.rebind( _prev_bind_1_$133, thread );
          sbhl_marking_vars.$resourced_sbhl_marking_space_limit$.rebind( _prev_bind_0_$132, thread );
        }
      }
    }
    finally
    {
      $at_applicable_arg_types_with_assertions$.rebind( _prev_bind_2, thread );
      $at_applicable_arg_types$.rebind( _prev_bind_0, thread );
    }
    return result;
  }

  @SubLTranslatedFile.SubL(source = "cycl/at-routines.lisp", position = 33531L)
  public static SubLObject inter_arg_not_genl_disjoint_violations(final SubLObject reln, final SubLObject ind_arg, final SubLObject ind_argnum, final SubLObject ind_arg_genl, final SubLObject dep_arg,
      final SubLObject dep_argnum, final SubLObject dep_arg_genl)
  {
    return inter_arg_violations( $kw86$MAL_ARG_WRT_INTER_ARG_NOT_GENL_DISJOINT, reln, ind_arg, ind_argnum, ind_arg_genl, dep_arg, dep_argnum, dep_arg_genl );
  }

  @SubLTranslatedFile.SubL(source = "cycl/at-routines.lisp", position = 33802L)
  public static SubLObject mal_inter_arg_formatP(final SubLObject reln, final SubLObject ind_arg, final SubLObject ind_argnum, final SubLObject dep_arg, final SubLObject dep_argnum)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL == at_vars.$at_check_inter_arg_formatP$.getDynamicValue( thread ) || NIL == ind_arg || !ind_argnum.isInteger() )
    {
      return NIL;
    }
    if( NIL != at_utilities.inter_arg_format_cache_initializedP() && NIL == at_utilities.some_inter_arg_format_constraint_somewhereP( reln ) )
    {
      return NIL;
    }
    SubLObject result = NIL;
    SubLObject doneP = NIL;
    final SubLObject _prev_bind_0 = $at_applicable_arg_types$.currentBinding( thread );
    final SubLObject _prev_bind_2 = $at_applicable_arg_types_with_assertions$.currentBinding( thread );
    try
    {
      $at_applicable_arg_types$.bind( NIL, thread );
      $at_applicable_arg_types_with_assertions$.bind( dictionary.new_dictionary( EQUAL, UNPROVIDED ), thread );
      if( reln.eql( $const5$Quote ) )
      {
        final SubLObject _prev_bind_0_$135 = cycl_grammar.$within_quote_form$.currentBinding( thread );
        try
        {
          cycl_grammar.$within_quote_form$.bind( T, thread );
          final SubLObject already_resourcing_p = sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.getDynamicValue( thread );
          final SubLObject _prev_bind_0_$136 = sbhl_marking_vars.$resourced_sbhl_marking_space_limit$.currentBinding( thread );
          final SubLObject _prev_bind_1_$137 = sbhl_marking_vars.$resourced_sbhl_marking_spaces$.currentBinding( thread );
          final SubLObject _prev_bind_3 = sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.currentBinding( thread );
          try
          {
            sbhl_marking_vars.$resourced_sbhl_marking_space_limit$.bind( sbhl_marking_vars.determine_resource_limit( already_resourcing_p, TEN_INTEGER ), thread );
            sbhl_marking_vars.$resourced_sbhl_marking_spaces$.bind( sbhl_marking_vars.possibly_new_marking_resource( already_resourcing_p ), thread );
            sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.bind( T, thread );
            applicable_inter_arg_type_collections( reln, ind_arg, ind_argnum, dep_argnum, $kw87$INTER_ARG_FORMAT, at_vars.$at_check_non_constant_inter_arg_formatP$.getDynamicValue( thread ) );
            if( NIL != $at_applicable_arg_types$.getDynamicValue( thread ) && NIL == doneP )
            {
              SubLObject csome_list_var = $at_applicable_arg_types$.getDynamicValue( thread );
              SubLObject inter_arg_format = NIL;
              inter_arg_format = csome_list_var.first();
              while ( NIL == doneP && NIL != csome_list_var)
              {
                SubLObject current;
                final SubLObject datum = current = inter_arg_format;
                SubLObject ind_arg_isa = NIL;
                SubLObject dep_arg_format = NIL;
                cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list88 );
                ind_arg_isa = current.first();
                current = current.rest();
                cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list88 );
                dep_arg_format = current.first();
                current = current.rest();
                if( NIL == current )
                {
                  if( NIL == arg_type.memoized_format_okP( dep_arg_format, at_vars.$at_formula$.getDynamicValue( thread ), dep_argnum, mt_relevance_macros.$mt$.getDynamicValue( thread ) ) )
                  {
                    if( NIL != at_vars.$noting_at_violationsP$.getDynamicValue( thread ) )
                    {
                      note_at_violations( inter_arg_format_violations( reln, ind_arg, ind_argnum, ind_arg_isa, dep_arg, dep_argnum, dep_arg_format ) );
                    }
                    result = T;
                    doneP = at_utilities.at_finishedP( result );
                  }
                }
                else
                {
                  cdestructuring_bind.cdestructuring_bind_error( datum, $list88 );
                }
                csome_list_var = csome_list_var.rest();
                inter_arg_format = csome_list_var.first();
              }
            }
          }
          finally
          {
            sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.rebind( _prev_bind_3, thread );
            sbhl_marking_vars.$resourced_sbhl_marking_spaces$.rebind( _prev_bind_1_$137, thread );
            sbhl_marking_vars.$resourced_sbhl_marking_space_limit$.rebind( _prev_bind_0_$136, thread );
          }
        }
        finally
        {
          cycl_grammar.$within_quote_form$.rebind( _prev_bind_0_$135, thread );
        }
      }
      else
      {
        final SubLObject already_resourcing_p2 = sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.getDynamicValue( thread );
        final SubLObject _prev_bind_0_$137 = sbhl_marking_vars.$resourced_sbhl_marking_space_limit$.currentBinding( thread );
        final SubLObject _prev_bind_1_$138 = sbhl_marking_vars.$resourced_sbhl_marking_spaces$.currentBinding( thread );
        final SubLObject _prev_bind_4 = sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.currentBinding( thread );
        try
        {
          sbhl_marking_vars.$resourced_sbhl_marking_space_limit$.bind( sbhl_marking_vars.determine_resource_limit( already_resourcing_p2, TEN_INTEGER ), thread );
          sbhl_marking_vars.$resourced_sbhl_marking_spaces$.bind( sbhl_marking_vars.possibly_new_marking_resource( already_resourcing_p2 ), thread );
          sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.bind( T, thread );
          applicable_inter_arg_type_collections( reln, ind_arg, ind_argnum, dep_argnum, $kw87$INTER_ARG_FORMAT, at_vars.$at_check_non_constant_inter_arg_formatP$.getDynamicValue( thread ) );
          if( NIL != $at_applicable_arg_types$.getDynamicValue( thread ) && NIL == doneP )
          {
            SubLObject csome_list_var2 = $at_applicable_arg_types$.getDynamicValue( thread );
            SubLObject inter_arg_format2 = NIL;
            inter_arg_format2 = csome_list_var2.first();
            while ( NIL == doneP && NIL != csome_list_var2)
            {
              SubLObject current2;
              final SubLObject datum2 = current2 = inter_arg_format2;
              SubLObject ind_arg_isa2 = NIL;
              SubLObject dep_arg_format2 = NIL;
              cdestructuring_bind.destructuring_bind_must_consp( current2, datum2, $list88 );
              ind_arg_isa2 = current2.first();
              current2 = current2.rest();
              cdestructuring_bind.destructuring_bind_must_consp( current2, datum2, $list88 );
              dep_arg_format2 = current2.first();
              current2 = current2.rest();
              if( NIL == current2 )
              {
                if( NIL == arg_type.memoized_format_okP( dep_arg_format2, at_vars.$at_formula$.getDynamicValue( thread ), dep_argnum, mt_relevance_macros.$mt$.getDynamicValue( thread ) ) )
                {
                  if( NIL != at_vars.$noting_at_violationsP$.getDynamicValue( thread ) )
                  {
                    note_at_violations( inter_arg_format_violations( reln, ind_arg, ind_argnum, ind_arg_isa2, dep_arg, dep_argnum, dep_arg_format2 ) );
                  }
                  result = T;
                  doneP = at_utilities.at_finishedP( result );
                }
              }
              else
              {
                cdestructuring_bind.cdestructuring_bind_error( datum2, $list88 );
              }
              csome_list_var2 = csome_list_var2.rest();
              inter_arg_format2 = csome_list_var2.first();
            }
          }
        }
        finally
        {
          sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.rebind( _prev_bind_4, thread );
          sbhl_marking_vars.$resourced_sbhl_marking_spaces$.rebind( _prev_bind_1_$138, thread );
          sbhl_marking_vars.$resourced_sbhl_marking_space_limit$.rebind( _prev_bind_0_$137, thread );
        }
      }
    }
    finally
    {
      $at_applicable_arg_types_with_assertions$.rebind( _prev_bind_2, thread );
      $at_applicable_arg_types$.rebind( _prev_bind_0, thread );
    }
    return result;
  }

  @SubLTranslatedFile.SubL(source = "cycl/at-routines.lisp", position = 34966L)
  public static SubLObject inter_arg_format_violations(final SubLObject reln, final SubLObject ind_arg, final SubLObject ind_argnum, final SubLObject ind_arg_isa, final SubLObject dep_arg, final SubLObject dep_argnum,
      final SubLObject dep_arg_format)
  {
    return inter_arg_violations( $kw89$MAL_ARG_WRT_INTER_ARG_FORMAT, reln, ind_arg, ind_argnum, ind_arg_isa, dep_arg, dep_argnum, dep_arg_format );
  }

  @SubLTranslatedFile.SubL(source = "cycl/at-routines.lisp", position = 35217L)
  public static SubLObject some_inter_arg_different_assertion_somewhereP(final SubLObject reln)
  {
    return somewhere_cache.some_pred_assertion_somewhereP( $const90$interArgDifferent, reln, ONE_INTEGER, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/at-routines.lisp", position = 35401L)
  public static SubLObject some_inter_arg_different_constraint_somewhereP(final SubLObject reln)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject found_oneP = NIL;
    if( NIL != fort_types_interface.predicateP( reln ) )
    {
      if( NIL == found_oneP )
      {
        final SubLObject module = sbhl_module_vars.get_sbhl_module( $const48$genlPreds );
        final SubLObject deck_type = ( $kw49$DEPTH == $kw49$DEPTH ) ? $kw50$STACK : $kw51$QUEUE;
        final SubLObject recur_deck = deck.create_deck( deck_type );
        SubLObject node_and_predicate_mode = NIL;
        final SubLObject _prev_bind_0 = sbhl_marking_vars.$sbhl_space$.currentBinding( thread );
        try
        {
          sbhl_marking_vars.$sbhl_space$.bind( sbhl_marking_vars.get_sbhl_marking_space(), thread );
          try
          {
            final SubLObject tv_var = NIL;
            final SubLObject _prev_bind_0_$140 = sbhl_search_vars.$sbhl_tv$.currentBinding( thread );
            final SubLObject _prev_bind_2 = sbhl_search_vars.$relevant_sbhl_tv_function$.currentBinding( thread );
            try
            {
              sbhl_search_vars.$sbhl_tv$.bind( ( NIL != tv_var ) ? tv_var : sbhl_search_vars.get_sbhl_true_tv(), thread );
              sbhl_search_vars.$relevant_sbhl_tv_function$.bind( ( NIL != tv_var ) ? $sym52$RELEVANT_SBHL_TV_IS_GENERAL_TV : sbhl_search_vars.$relevant_sbhl_tv_function$.getDynamicValue( thread ), thread );
              if( NIL != tv_var && NIL != sbhl_paranoia.sbhl_object_type_checking_p() && NIL == sbhl_search_vars.sbhl_true_tv_p( tv_var ) )
              {
                final SubLObject pcase_var = sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue( thread );
                if( pcase_var.eql( $kw53$ERROR ) )
                {
                  sbhl_paranoia.sbhl_error( ONE_INTEGER, $str54$_A_is_not_a__A, tv_var, $sym55$SBHL_TRUE_TV_P, UNPROVIDED, UNPROVIDED, UNPROVIDED );
                }
                else if( pcase_var.eql( $kw56$CERROR ) )
                {
                  sbhl_paranoia.sbhl_cerror( ONE_INTEGER, $str57$continue_anyway, $str54$_A_is_not_a__A, tv_var, $sym55$SBHL_TRUE_TV_P, UNPROVIDED, UNPROVIDED, UNPROVIDED );
                }
                else if( pcase_var.eql( $kw58$WARN ) )
                {
                  Errors.warn( $str54$_A_is_not_a__A, tv_var, $sym55$SBHL_TRUE_TV_P );
                }
                else
                {
                  Errors.warn( $str59$_A_is_not_a_valid__sbhl_type_erro, sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue( thread ) );
                  Errors.cerror( $str57$continue_anyway, $str54$_A_is_not_a__A, tv_var, $sym55$SBHL_TRUE_TV_P );
                }
              }
              final SubLObject _prev_bind_0_$141 = sbhl_search_vars.$sbhl_search_module$.currentBinding( thread );
              final SubLObject _prev_bind_1_$142 = sbhl_search_vars.$sbhl_search_module_type$.currentBinding( thread );
              final SubLObject _prev_bind_3 = sbhl_search_vars.$sbhl_add_node_to_result_test$.currentBinding( thread );
              final SubLObject _prev_bind_4 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding( thread );
              final SubLObject _prev_bind_5 = sbhl_module_vars.$sbhl_module$.currentBinding( thread );
              try
              {
                sbhl_search_vars.$sbhl_search_module$.bind( module, thread );
                sbhl_search_vars.$sbhl_search_module_type$.bind( sbhl_module_utilities.get_sbhl_module_type( module ), thread );
                sbhl_search_vars.$sbhl_add_node_to_result_test$.bind( sbhl_module_utilities.get_sbhl_add_node_to_result_test( module ), thread );
                sbhl_search_vars.$genl_inverse_mode_p$.bind( NIL, thread );
                sbhl_module_vars.$sbhl_module$.bind( module, thread );
                if( NIL != sbhl_paranoia.suspend_sbhl_type_checkingP() || NIL != sbhl_module_utilities.apply_sbhl_module_type_test( reln, sbhl_module_vars.get_sbhl_module( UNPROVIDED ) ) )
                {
                  final SubLObject _prev_bind_0_$142 = sbhl_search_vars.$sbhl_search_direction$.currentBinding( thread );
                  final SubLObject _prev_bind_1_$143 = sbhl_link_vars.$sbhl_link_direction$.currentBinding( thread );
                  final SubLObject _prev_bind_2_$145 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding( thread );
                  try
                  {
                    sbhl_search_vars.$sbhl_search_direction$.bind( sbhl_search_vars.get_sbhl_forward_search_direction(), thread );
                    sbhl_link_vars.$sbhl_link_direction$.bind( sbhl_module_utilities.sbhl_search_direction_to_link_direction( sbhl_search_vars.get_sbhl_forward_search_direction(), module ), thread );
                    sbhl_search_vars.$genl_inverse_mode_p$.bind( NIL, thread );
                    sbhl_marking_utilities.sbhl_mark_node_marked( reln, UNPROVIDED );
                    for( node_and_predicate_mode = ConsesLow.list( reln, sbhl_search_vars.genl_inverse_mode_p() ); NIL != node_and_predicate_mode && NIL == found_oneP; node_and_predicate_mode = deck.deck_pop(
                        recur_deck ) )
                    {
                      final SubLObject node_var_$146 = node_and_predicate_mode.first();
                      final SubLObject predicate_mode = conses_high.second( node_and_predicate_mode );
                      final SubLObject genl_pred = node_var_$146;
                      final SubLObject _prev_bind_0_$143 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding( thread );
                      try
                      {
                        sbhl_search_vars.$genl_inverse_mode_p$.bind( predicate_mode, thread );
                        final SubLObject inverse_mode = predicate_mode;
                        if( NIL != some_inter_arg_different_assertion_somewhereP( genl_pred ) )
                        {
                          found_oneP = T;
                        }
                        final SubLObject accessible_modules = sbhl_macros.get_sbhl_accessible_modules( module );
                        SubLObject rest;
                        SubLObject module_var;
                        SubLObject _prev_bind_0_$144;
                        SubLObject _prev_bind_1_$144;
                        SubLObject node;
                        SubLObject d_link;
                        SubLObject mt_links;
                        SubLObject iteration_state;
                        SubLObject mt;
                        SubLObject tv_links;
                        SubLObject _prev_bind_0_$145;
                        SubLObject iteration_state_$151;
                        SubLObject tv;
                        SubLObject link_nodes;
                        SubLObject _prev_bind_0_$146;
                        SubLObject sol;
                        SubLObject set_contents_var;
                        SubLObject basis_object;
                        SubLObject state;
                        SubLObject node_vars_link_node;
                        SubLObject csome_list_var;
                        SubLObject node_vars_link_node2;
                        SubLObject new_list;
                        SubLObject rest_$153;
                        SubLObject generating_fn;
                        SubLObject _prev_bind_0_$147;
                        SubLObject sol2;
                        SubLObject link_nodes2;
                        SubLObject set_contents_var2;
                        SubLObject basis_object2;
                        SubLObject state2;
                        SubLObject node_vars_link_node3;
                        SubLObject csome_list_var2;
                        SubLObject node_vars_link_node4;
                        for( rest = NIL, rest = accessible_modules; NIL == found_oneP && NIL != rest; rest = rest.rest() )
                        {
                          module_var = rest.first();
                          _prev_bind_0_$144 = sbhl_module_vars.$sbhl_module$.currentBinding( thread );
                          _prev_bind_1_$144 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding( thread );
                          try
                          {
                            sbhl_module_vars.$sbhl_module$.bind( module_var, thread );
                            sbhl_search_vars.$genl_inverse_mode_p$.bind( ( NIL != sbhl_search_vars.flip_genl_inverse_modeP( UNPROVIDED, UNPROVIDED ) ) ? makeBoolean( NIL == sbhl_search_vars.$genl_inverse_mode_p$
                                .getDynamicValue( thread ) ) : sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue( thread ), thread );
                            node = function_terms.naut_to_nart( node_var_$146 );
                            if( NIL != sbhl_link_vars.sbhl_node_object_p( node ) )
                            {
                              d_link = sbhl_graphs.get_sbhl_graph_link( node, sbhl_module_vars.get_sbhl_module( UNPROVIDED ) );
                              if( NIL != d_link )
                              {
                                mt_links = sbhl_links.get_sbhl_mt_links( d_link, sbhl_link_vars.get_sbhl_link_direction(), sbhl_module_vars.get_sbhl_module( UNPROVIDED ) );
                                if( NIL != mt_links )
                                {
                                  for( iteration_state = dictionary_contents.do_dictionary_contents_state( dictionary.dictionary_contents( mt_links ) ); NIL == found_oneP && NIL == dictionary_contents
                                      .do_dictionary_contents_doneP( iteration_state ); iteration_state = dictionary_contents.do_dictionary_contents_next( iteration_state ) )
                                  {
                                    thread.resetMultipleValues();
                                    mt = dictionary_contents.do_dictionary_contents_key_value( iteration_state );
                                    tv_links = thread.secondMultipleValue();
                                    thread.resetMultipleValues();
                                    if( NIL != mt_relevance_macros.relevant_mtP( mt ) )
                                    {
                                      _prev_bind_0_$145 = sbhl_link_vars.$sbhl_link_mt$.currentBinding( thread );
                                      try
                                      {
                                        sbhl_link_vars.$sbhl_link_mt$.bind( mt, thread );
                                        for( iteration_state_$151 = dictionary_contents.do_dictionary_contents_state( dictionary.dictionary_contents( tv_links ) ); NIL == found_oneP && NIL == dictionary_contents
                                            .do_dictionary_contents_doneP( iteration_state_$151 ); iteration_state_$151 = dictionary_contents.do_dictionary_contents_next( iteration_state_$151 ) )
                                        {
                                          thread.resetMultipleValues();
                                          tv = dictionary_contents.do_dictionary_contents_key_value( iteration_state_$151 );
                                          link_nodes = thread.secondMultipleValue();
                                          thread.resetMultipleValues();
                                          if( NIL != sbhl_search_vars.relevant_sbhl_tvP( tv ) )
                                          {
                                            _prev_bind_0_$146 = sbhl_link_vars.$sbhl_link_tv$.currentBinding( thread );
                                            try
                                            {
                                              sbhl_link_vars.$sbhl_link_tv$.bind( tv, thread );
                                              sol = link_nodes;
                                              if( NIL != set.set_p( sol ) )
                                              {
                                                set_contents_var = set.do_set_internal( sol );
                                                for( basis_object = set_contents.do_set_contents_basis_object( set_contents_var ), state = NIL, state = set_contents.do_set_contents_initial_state( basis_object,
                                                    set_contents_var ); NIL == found_oneP && NIL == set_contents.do_set_contents_doneP( basis_object, state ); state = set_contents.do_set_contents_update_state( state ) )
                                                {
                                                  node_vars_link_node = set_contents.do_set_contents_next( basis_object, state );
                                                  if( NIL != set_contents.do_set_contents_element_validP( state, node_vars_link_node ) && NIL == sbhl_marking_utilities.sbhl_search_path_termination_p( node_vars_link_node,
                                                      UNPROVIDED ) )
                                                  {
                                                    sbhl_marking_utilities.sbhl_mark_node_marked( node_vars_link_node, UNPROVIDED );
                                                    deck.deck_push( ConsesLow.list( node_vars_link_node, sbhl_search_vars.genl_inverse_mode_p() ), recur_deck );
                                                  }
                                                }
                                              }
                                              else if( sol.isList() )
                                              {
                                                if( NIL == found_oneP )
                                                {
                                                  csome_list_var = sol;
                                                  node_vars_link_node2 = NIL;
                                                  node_vars_link_node2 = csome_list_var.first();
                                                  while ( NIL == found_oneP && NIL != csome_list_var)
                                                  {
                                                    if( NIL == sbhl_marking_utilities.sbhl_search_path_termination_p( node_vars_link_node2, UNPROVIDED ) )
                                                    {
                                                      sbhl_marking_utilities.sbhl_mark_node_marked( node_vars_link_node2, UNPROVIDED );
                                                      deck.deck_push( ConsesLow.list( node_vars_link_node2, sbhl_search_vars.genl_inverse_mode_p() ), recur_deck );
                                                    }
                                                    csome_list_var = csome_list_var.rest();
                                                    node_vars_link_node2 = csome_list_var.first();
                                                  }
                                                }
                                              }
                                              else
                                              {
                                                Errors.error( $str60$_A_is_neither_SET_P_nor_LISTP_, sol );
                                              }
                                            }
                                            finally
                                            {
                                              sbhl_link_vars.$sbhl_link_tv$.rebind( _prev_bind_0_$146, thread );
                                            }
                                          }
                                        }
                                        dictionary_contents.do_dictionary_contents_finalize( iteration_state_$151 );
                                      }
                                      finally
                                      {
                                        sbhl_link_vars.$sbhl_link_mt$.rebind( _prev_bind_0_$145, thread );
                                      }
                                    }
                                  }
                                  dictionary_contents.do_dictionary_contents_finalize( iteration_state );
                                }
                              }
                              else
                              {
                                sbhl_paranoia.sbhl_error( FIVE_INTEGER, $str61$attempting_to_bind_direction_link, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
                              }
                            }
                            else if( NIL != obsolete.cnat_p( node, UNPROVIDED ) )
                            {
                              new_list = ( ( NIL != sbhl_link_vars.sbhl_randomize_lists_p() ) ? list_utilities.randomize_list( sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators( sbhl_link_vars
                                  .get_sbhl_link_direction(), sbhl_search_vars.$sbhl_tv$.getDynamicValue( thread ), sbhl_module_vars.get_sbhl_module( UNPROVIDED ) ) )
                                  : sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators( sbhl_link_vars.get_sbhl_link_direction(), sbhl_search_vars.$sbhl_tv$.getDynamicValue( thread ), sbhl_module_vars
                                      .get_sbhl_module( UNPROVIDED ) ) );
                              for( rest_$153 = NIL, rest_$153 = new_list; NIL == found_oneP && NIL != rest_$153; rest_$153 = rest_$153.rest() )
                              {
                                generating_fn = rest_$153.first();
                                _prev_bind_0_$147 = sbhl_link_vars.$sbhl_link_generator$.currentBinding( thread );
                                try
                                {
                                  sbhl_link_vars.$sbhl_link_generator$.bind( generating_fn, thread );
                                  link_nodes2 = ( sol2 = Functions.funcall( generating_fn, node ) );
                                  if( NIL != set.set_p( sol2 ) )
                                  {
                                    set_contents_var2 = set.do_set_internal( sol2 );
                                    for( basis_object2 = set_contents.do_set_contents_basis_object( set_contents_var2 ), state2 = NIL, state2 = set_contents.do_set_contents_initial_state( basis_object2,
                                        set_contents_var2 ); NIL == found_oneP && NIL == set_contents.do_set_contents_doneP( basis_object2, state2 ); state2 = set_contents.do_set_contents_update_state( state2 ) )
                                    {
                                      node_vars_link_node3 = set_contents.do_set_contents_next( basis_object2, state2 );
                                      if( NIL != set_contents.do_set_contents_element_validP( state2, node_vars_link_node3 ) && NIL == sbhl_marking_utilities.sbhl_search_path_termination_p( node_vars_link_node3,
                                          UNPROVIDED ) )
                                      {
                                        sbhl_marking_utilities.sbhl_mark_node_marked( node_vars_link_node3, UNPROVIDED );
                                        deck.deck_push( ConsesLow.list( node_vars_link_node3, sbhl_search_vars.genl_inverse_mode_p() ), recur_deck );
                                      }
                                    }
                                  }
                                  else if( sol2.isList() )
                                  {
                                    if( NIL == found_oneP )
                                    {
                                      csome_list_var2 = sol2;
                                      node_vars_link_node4 = NIL;
                                      node_vars_link_node4 = csome_list_var2.first();
                                      while ( NIL == found_oneP && NIL != csome_list_var2)
                                      {
                                        if( NIL == sbhl_marking_utilities.sbhl_search_path_termination_p( node_vars_link_node4, UNPROVIDED ) )
                                        {
                                          sbhl_marking_utilities.sbhl_mark_node_marked( node_vars_link_node4, UNPROVIDED );
                                          deck.deck_push( ConsesLow.list( node_vars_link_node4, sbhl_search_vars.genl_inverse_mode_p() ), recur_deck );
                                        }
                                        csome_list_var2 = csome_list_var2.rest();
                                        node_vars_link_node4 = csome_list_var2.first();
                                      }
                                    }
                                  }
                                  else
                                  {
                                    Errors.error( $str60$_A_is_neither_SET_P_nor_LISTP_, sol2 );
                                  }
                                }
                                finally
                                {
                                  sbhl_link_vars.$sbhl_link_generator$.rebind( _prev_bind_0_$147, thread );
                                }
                              }
                            }
                          }
                          finally
                          {
                            sbhl_search_vars.$genl_inverse_mode_p$.rebind( _prev_bind_1_$144, thread );
                            sbhl_module_vars.$sbhl_module$.rebind( _prev_bind_0_$144, thread );
                          }
                        }
                      }
                      finally
                      {
                        sbhl_search_vars.$genl_inverse_mode_p$.rebind( _prev_bind_0_$143, thread );
                      }
                    }
                  }
                  finally
                  {
                    sbhl_search_vars.$genl_inverse_mode_p$.rebind( _prev_bind_2_$145, thread );
                    sbhl_link_vars.$sbhl_link_direction$.rebind( _prev_bind_1_$143, thread );
                    sbhl_search_vars.$sbhl_search_direction$.rebind( _prev_bind_0_$142, thread );
                  }
                }
                else
                {
                  sbhl_paranoia.sbhl_warn( TWO_INTEGER, $str62$Node__a_does_not_pass_sbhl_type_t, reln, sbhl_module_utilities.get_sbhl_type_test( sbhl_module_vars.get_sbhl_module( UNPROVIDED ) ), UNPROVIDED, UNPROVIDED,
                      UNPROVIDED );
                }
              }
              finally
              {
                sbhl_module_vars.$sbhl_module$.rebind( _prev_bind_5, thread );
                sbhl_search_vars.$genl_inverse_mode_p$.rebind( _prev_bind_4, thread );
                sbhl_search_vars.$sbhl_add_node_to_result_test$.rebind( _prev_bind_3, thread );
                sbhl_search_vars.$sbhl_search_module_type$.rebind( _prev_bind_1_$142, thread );
                sbhl_search_vars.$sbhl_search_module$.rebind( _prev_bind_0_$141, thread );
              }
            }
            finally
            {
              sbhl_search_vars.$relevant_sbhl_tv_function$.rebind( _prev_bind_2, thread );
              sbhl_search_vars.$sbhl_tv$.rebind( _prev_bind_0_$140, thread );
            }
          }
          finally
          {
            final SubLObject _prev_bind_0_$148 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
            try
            {
              Threads.$is_thread_performing_cleanupP$.bind( T, thread );
              final SubLObject _values = Values.getValuesAsVector();
              sbhl_marking_vars.free_sbhl_marking_space( sbhl_marking_vars.$sbhl_space$.getDynamicValue( thread ) );
              Values.restoreValuesFromVector( _values );
            }
            finally
            {
              Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$148, thread );
            }
          }
        }
        finally
        {
          sbhl_marking_vars.$sbhl_space$.rebind( _prev_bind_0, thread );
        }
      }
    }
    else
    {
      found_oneP = some_inter_arg_different_assertion_somewhereP( reln );
    }
    return found_oneP;
  }

  @SubLTranslatedFile.SubL(source = "cycl/at-routines.lisp", position = 35839L)
  public static SubLObject mal_inter_arg_differentP(final SubLObject reln, final SubLObject ind_arg, final SubLObject ind_argnum, final SubLObject dep_arg, final SubLObject dep_argnum)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL == at_vars.$at_check_inter_arg_differentP$.getDynamicValue( thread ) )
    {
      return NIL;
    }
    if( NIL == some_inter_arg_different_constraint_somewhereP( reln ) )
    {
      return NIL;
    }
    SubLObject result = NIL;
    SubLObject doneP = NIL;
    final SubLObject _prev_bind_0 = $at_applicable_arg_types$.currentBinding( thread );
    final SubLObject _prev_bind_2 = $at_applicable_arg_types_with_assertions$.currentBinding( thread );
    try
    {
      $at_applicable_arg_types$.bind( NIL, thread );
      $at_applicable_arg_types_with_assertions$.bind( dictionary.new_dictionary( EQUAL, UNPROVIDED ), thread );
      if( reln.eql( $const5$Quote ) )
      {
        final SubLObject _prev_bind_0_$156 = cycl_grammar.$within_quote_form$.currentBinding( thread );
        try
        {
          cycl_grammar.$within_quote_form$.bind( T, thread );
          final SubLObject already_resourcing_p = sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.getDynamicValue( thread );
          final SubLObject _prev_bind_0_$157 = sbhl_marking_vars.$resourced_sbhl_marking_space_limit$.currentBinding( thread );
          final SubLObject _prev_bind_1_$158 = sbhl_marking_vars.$resourced_sbhl_marking_spaces$.currentBinding( thread );
          final SubLObject _prev_bind_3 = sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.currentBinding( thread );
          try
          {
            sbhl_marking_vars.$resourced_sbhl_marking_space_limit$.bind( sbhl_marking_vars.determine_resource_limit( already_resourcing_p, TEN_INTEGER ), thread );
            sbhl_marking_vars.$resourced_sbhl_marking_spaces$.bind( sbhl_marking_vars.possibly_new_marking_resource( already_resourcing_p ), thread );
            sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.bind( T, thread );
            applicable_inter_arg_type_pred_collections( reln, ind_arg, ind_argnum, dep_argnum, $kw91$INTER_ARG_DIFFERENT, T );
            if( NIL != $at_applicable_arg_types$.getDynamicValue( thread ) && NIL == doneP )
            {
              SubLObject csome_list_var = $at_applicable_arg_types$.getDynamicValue( thread );
              SubLObject inter_arg_different = NIL;
              inter_arg_different = csome_list_var.first();
              while ( NIL == doneP && NIL != csome_list_var)
              {
                SubLObject current;
                final SubLObject datum = current = inter_arg_different;
                SubLObject argnum1 = NIL;
                SubLObject argnum2 = NIL;
                cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list92 );
                argnum1 = current.first();
                current = current.rest();
                cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list92 );
                argnum2 = current.first();
                current = current.rest();
                if( NIL == current )
                {
                  if( argnum1.eql( dep_argnum ) && argnum2.eql( ind_argnum ) && NIL != equals.equalsP( dep_arg, ind_arg, UNPROVIDED, UNPROVIDED ) )
                  {
                    if( NIL != at_vars.$noting_at_violationsP$.getDynamicValue( thread ) )
                    {
                      note_at_violations( inter_arg_different_violations( reln, ind_arg, ind_argnum, dep_arg, dep_argnum ) );
                    }
                    result = T;
                    doneP = at_utilities.at_finishedP( result );
                  }
                }
                else
                {
                  cdestructuring_bind.cdestructuring_bind_error( datum, $list92 );
                }
                csome_list_var = csome_list_var.rest();
                inter_arg_different = csome_list_var.first();
              }
            }
          }
          finally
          {
            sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.rebind( _prev_bind_3, thread );
            sbhl_marking_vars.$resourced_sbhl_marking_spaces$.rebind( _prev_bind_1_$158, thread );
            sbhl_marking_vars.$resourced_sbhl_marking_space_limit$.rebind( _prev_bind_0_$157, thread );
          }
        }
        finally
        {
          cycl_grammar.$within_quote_form$.rebind( _prev_bind_0_$156, thread );
        }
      }
      else
      {
        final SubLObject already_resourcing_p2 = sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.getDynamicValue( thread );
        final SubLObject _prev_bind_0_$158 = sbhl_marking_vars.$resourced_sbhl_marking_space_limit$.currentBinding( thread );
        final SubLObject _prev_bind_1_$159 = sbhl_marking_vars.$resourced_sbhl_marking_spaces$.currentBinding( thread );
        final SubLObject _prev_bind_4 = sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.currentBinding( thread );
        try
        {
          sbhl_marking_vars.$resourced_sbhl_marking_space_limit$.bind( sbhl_marking_vars.determine_resource_limit( already_resourcing_p2, TEN_INTEGER ), thread );
          sbhl_marking_vars.$resourced_sbhl_marking_spaces$.bind( sbhl_marking_vars.possibly_new_marking_resource( already_resourcing_p2 ), thread );
          sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.bind( T, thread );
          applicable_inter_arg_type_pred_collections( reln, ind_arg, ind_argnum, dep_argnum, $kw91$INTER_ARG_DIFFERENT, T );
          if( NIL != $at_applicable_arg_types$.getDynamicValue( thread ) && NIL == doneP )
          {
            SubLObject csome_list_var2 = $at_applicable_arg_types$.getDynamicValue( thread );
            SubLObject inter_arg_different2 = NIL;
            inter_arg_different2 = csome_list_var2.first();
            while ( NIL == doneP && NIL != csome_list_var2)
            {
              SubLObject current2;
              final SubLObject datum2 = current2 = inter_arg_different2;
              SubLObject argnum3 = NIL;
              SubLObject argnum4 = NIL;
              cdestructuring_bind.destructuring_bind_must_consp( current2, datum2, $list92 );
              argnum3 = current2.first();
              current2 = current2.rest();
              cdestructuring_bind.destructuring_bind_must_consp( current2, datum2, $list92 );
              argnum4 = current2.first();
              current2 = current2.rest();
              if( NIL == current2 )
              {
                if( argnum3.eql( dep_argnum ) && argnum4.eql( ind_argnum ) && NIL != equals.equalsP( dep_arg, ind_arg, UNPROVIDED, UNPROVIDED ) )
                {
                  if( NIL != at_vars.$noting_at_violationsP$.getDynamicValue( thread ) )
                  {
                    note_at_violations( inter_arg_different_violations( reln, ind_arg, ind_argnum, dep_arg, dep_argnum ) );
                  }
                  result = T;
                  doneP = at_utilities.at_finishedP( result );
                }
              }
              else
              {
                cdestructuring_bind.cdestructuring_bind_error( datum2, $list92 );
              }
              csome_list_var2 = csome_list_var2.rest();
              inter_arg_different2 = csome_list_var2.first();
            }
          }
        }
        finally
        {
          sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.rebind( _prev_bind_4, thread );
          sbhl_marking_vars.$resourced_sbhl_marking_spaces$.rebind( _prev_bind_1_$159, thread );
          sbhl_marking_vars.$resourced_sbhl_marking_space_limit$.rebind( _prev_bind_0_$158, thread );
        }
      }
    }
    finally
    {
      $at_applicable_arg_types_with_assertions$.rebind( _prev_bind_2, thread );
      $at_applicable_arg_types$.rebind( _prev_bind_0, thread );
    }
    return result;
  }

  @SubLTranslatedFile.SubL(source = "cycl/at-routines.lisp", position = 36734L)
  public static SubLObject inter_arg_different_violations(final SubLObject reln, final SubLObject ind_arg, final SubLObject ind_argnum, final SubLObject dep_arg, final SubLObject dep_argnum)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject constraints = dictionary.dictionary_lookup( $at_applicable_arg_types_with_assertions$.getDynamicValue( thread ), ConsesLow.list( dep_argnum, ind_argnum ), UNPROVIDED );
    final SubLObject module = $kw93$MAL_ARG_WRT_INTER_ARG_DIFFERENT;
    final SubLObject mt = mt_relevance_macros.$mt$.getDynamicValue( thread );
    SubLObject violations = NIL;
    SubLObject cdolist_list_var = constraints;
    SubLObject constraint_details = NIL;
    constraint_details = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      SubLObject current;
      final SubLObject datum = current = constraint_details;
      SubLObject constraint_reln = NIL;
      SubLObject via = NIL;
      cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list44 );
      constraint_reln = current.first();
      current = current.rest();
      cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list44 );
      via = current.first();
      current = current.rest();
      if( NIL == current )
      {
        if( reln.eql( constraint_reln ) )
        {
          violations = ConsesLow.cons( ConsesLow.list( module, reln, dep_arg, ind_argnum, ind_arg, dep_argnum, mt ), violations );
        }
        else
        {
          violations = ConsesLow.cons( ConsesLow.list( module, reln, dep_arg, ind_argnum, ind_arg, dep_argnum, mt, ConsesLow.list( via, constraint_reln ) ), violations );
        }
      }
      else
      {
        cdestructuring_bind.cdestructuring_bind_error( datum, $list44 );
      }
      cdolist_list_var = cdolist_list_var.rest();
      constraint_details = cdolist_list_var.first();
    }
    return violations;
  }

  @SubLTranslatedFile.SubL(source = "cycl/at-routines.lisp", position = 37386L)
  public static SubLObject clear_arg_collections()
  {
    final SubLObject cs = $arg_collections_caching_state$.getGlobalValue();
    if( NIL != cs )
    {
      memoization_state.caching_state_clear( cs );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/at-routines.lisp", position = 37386L)
  public static SubLObject remove_arg_collections(final SubLObject arg, final SubLObject constraint_type, final SubLObject v_arg_type, final SubLObject mt_info)
  {
    return memoization_state.caching_state_remove_function_results_with_args( $arg_collections_caching_state$.getGlobalValue(), ConsesLow.list( arg, constraint_type, v_arg_type, mt_info ), UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/at-routines.lisp", position = 37386L)
  public static SubLObject arg_collections_internal(final SubLObject arg, final SubLObject constraint_type, final SubLObject v_arg_type, final SubLObject mt_info)
  {
    if( constraint_type.eql( $kw20$ISA ) )
    {
      if( v_arg_type.eql( $kw95$STRONG_FORT ) )
      {
        return isa.isa( arg, UNPROVIDED, UNPROVIDED );
      }
      if( v_arg_type.eql( $kw96$WEAK_FORT ) )
      {
        return weak_fort_isa_collections( arg );
      }
      if( v_arg_type.eql( $kw22$NAUT ) )
      {
        return naut_isa_collections( arg );
      }
    }
    else if( constraint_type.eql( $kw28$QUOTED_ISA ) )
    {
      if( v_arg_type.eql( $kw95$STRONG_FORT ) )
      {
        return isa.quoted_isa( arg, UNPROVIDED, UNPROVIDED );
      }
      if( v_arg_type.eql( $kw96$WEAK_FORT ) )
      {
        return weak_fort_quoted_isa_collections( arg );
      }
      if( v_arg_type.eql( $kw22$NAUT ) )
      {
        return naut_quoted_isa_collections( arg );
      }
    }
    else if( constraint_type.eql( $kw35$GENLS ) )
    {
      if( v_arg_type.eql( $kw95$STRONG_FORT ) )
      {
        return genls.genls( arg, UNPROVIDED, UNPROVIDED );
      }
      if( v_arg_type.eql( $kw96$WEAK_FORT ) )
      {
        return weak_fort_genls_collections( arg );
      }
      if( v_arg_type.eql( $kw22$NAUT ) )
      {
        return naut_genls_collections( arg );
      }
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/at-routines.lisp", position = 37386L)
  public static SubLObject arg_collections(final SubLObject arg, final SubLObject constraint_type, final SubLObject v_arg_type, final SubLObject mt_info)
  {
    SubLObject caching_state = $arg_collections_caching_state$.getGlobalValue();
    if( NIL == caching_state )
    {
      caching_state = memoization_state.create_global_caching_state_for_name( $sym94$ARG_COLLECTIONS, $sym97$_ARG_COLLECTIONS_CACHING_STATE_, $int98$4096, EQUAL, FOUR_INTEGER, ZERO_INTEGER );
      memoization_state.register_hl_store_cache_clear_callback( $sym99$CLEAR_ARG_COLLECTIONS );
    }
    final SubLObject sxhash = memoization_state.sxhash_calc_4( arg, constraint_type, v_arg_type, mt_info );
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
        if( arg.equal( cached_args.first() ) )
        {
          cached_args = cached_args.rest();
          if( constraint_type.equal( cached_args.first() ) )
          {
            cached_args = cached_args.rest();
            if( v_arg_type.equal( cached_args.first() ) )
            {
              cached_args = cached_args.rest();
              if( NIL != cached_args && NIL == cached_args.rest() && mt_info.equal( cached_args.first() ) )
              {
                return memoization_state.caching_results( results2 );
              }
            }
          }
        }
        cdolist_list_var = cdolist_list_var.rest();
        collision = cdolist_list_var.first();
      }
    }
    final SubLObject results3 = Values.arg2( Values.resetMultipleValues(), Values.multiple_value_list( arg_collections_internal( arg, constraint_type, v_arg_type, mt_info ) ) );
    memoization_state.caching_state_enter_multi_key_n( caching_state, sxhash, collisions, results3, ConsesLow.list( arg, constraint_type, v_arg_type, mt_info ) );
    return memoization_state.caching_results( results3 );
  }

  @SubLTranslatedFile.SubL(source = "cycl/at-routines.lisp", position = 38218L)
  public static SubLObject weak_fort_isa_collections(final SubLObject v_term)
  {
    if( NIL != forts.fort_p( v_term ) )
    {
      return isa.isa( v_term, UNPROVIDED, UNPROVIDED );
    }
    if( NIL != obsolete.reifiable_natP( v_term, UNPROVIDED, UNPROVIDED ) )
    {
      return isa.isa( narts_high.find_nart( v_term ), UNPROVIDED, UNPROVIDED );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/at-routines.lisp", position = 38373L)
  public static SubLObject naut_isa_collections(final SubLObject v_term)
  {
    final SubLObject functor = cycl_utilities.nat_functor( v_term );
    if( NIL != forts.fort_p( functor ) )
    {
      return naut_isa_collections_int( v_term, functor );
    }
    if( NIL != obsolete.reified_natP( functor ) )
    {
      return naut_isa_collections_int( v_term, narts_high.find_nart( functor ) );
    }
    if( NIL != obsolete.reifiable_natP( functor, Symbols.symbol_function( $sym100$CYC_VAR_ ), UNPROVIDED ) )
    {
      final SubLObject meta_functor = cycl_utilities.nat_functor( functor );
      return Sequences.remove_duplicates( ConsesLow.nconc( kb_accessors.meta_result_isa( meta_functor, UNPROVIDED ), kb_accessors.meta_result_isa_args( meta_functor, UNPROVIDED ) ), UNPROVIDED, UNPROVIDED, UNPROVIDED,
          UNPROVIDED );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/at-routines.lisp", position = 38872L)
  public static SubLObject naut_isa_collections_int(final SubLObject v_term, final SubLObject functor)
  {
    SubLObject collections = NIL;
    collections = kb_accessors.result_isa( functor, UNPROVIDED );
    collections = ConsesLow.nconc( collections, kb_accessors.result_isa_args( v_term, UNPROVIDED ) );
    collections = ConsesLow.nconc( collections, kb_accessors.result_isa_via_arg_arg_isa( v_term, UNPROVIDED ) );
    collections = ConsesLow.nconc( collections, kb_accessors.result_isa_arg_isas( v_term, UNPROVIDED ) );
    collections = ConsesLow.nconc( collections, kb_accessors.result_isa_when_arg_isa( v_term, UNPROVIDED ) );
    return Sequences.remove_duplicates( collections, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/at-routines.lisp", position = 39331L)
  public static SubLObject weak_fort_quoted_isa_collections(final SubLObject v_term)
  {
    if( NIL != forts.fort_p( v_term ) )
    {
      return isa.quoted_isa( v_term, UNPROVIDED, UNPROVIDED );
    }
    if( NIL != obsolete.reifiable_natP( v_term, UNPROVIDED, UNPROVIDED ) )
    {
      return isa.quoted_isa( narts_high.find_nart( v_term ), UNPROVIDED, UNPROVIDED );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/at-routines.lisp", position = 39507L)
  public static SubLObject naut_quoted_isa_collections(final SubLObject v_term)
  {
    final SubLObject functor = cycl_utilities.nat_functor( v_term );
    if( NIL != forts.fort_p( functor ) )
    {
      return ConsesLow.nconc( kb_accessors.evaluation_result_quoted_isa( functor, UNPROVIDED ), kb_accessors.result_quoted_isa( functor, UNPROVIDED ) );
    }
    if( NIL != obsolete.reifiable_natP( functor, UNPROVIDED, UNPROVIDED ) )
    {
      final SubLObject nart_functor = narts_high.find_nart( functor );
      return ConsesLow.nconc( kb_accessors.evaluation_result_quoted_isa( nart_functor, UNPROVIDED ), kb_accessors.result_quoted_isa( nart_functor, UNPROVIDED ) );
    }
    if( NIL != obsolete.reifiable_natP( functor, Symbols.symbol_function( $sym100$CYC_VAR_ ), UNPROVIDED ) )
    {
      final SubLObject meta_functor = cycl_utilities.nat_functor( functor );
      return ConsesLow.nconc( kb_accessors.meta_evaluation_result_quoted_isa( meta_functor, UNPROVIDED ), kb_accessors.meta_result_quoted_isa( meta_functor, UNPROVIDED ) );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/at-routines.lisp", position = 40190L)
  public static SubLObject weak_fort_genls_collections(final SubLObject v_term)
  {
    if( NIL != forts.fort_p( v_term ) )
    {
      return genls.genls( v_term, UNPROVIDED, UNPROVIDED );
    }
    if( NIL != obsolete.reifiable_natP( v_term, UNPROVIDED, UNPROVIDED ) )
    {
      return genls.genls( narts_high.find_nart( v_term ), UNPROVIDED, UNPROVIDED );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/at-routines.lisp", position = 40351L)
  public static SubLObject naut_genls_collections(final SubLObject v_term)
  {
    final SubLObject functor = cycl_utilities.nat_functor( v_term );
    if( NIL != forts.fort_p( functor ) )
    {
      return naut_genls_collections_int( v_term, functor );
    }
    if( NIL != obsolete.reified_natP( functor ) )
    {
      return naut_genls_collections_int( v_term, narts_high.find_nart( functor ) );
    }
    if( NIL != obsolete.reifiable_natP( functor, Symbols.symbol_function( $sym100$CYC_VAR_ ), UNPROVIDED ) )
    {
      final SubLObject meta_functor = cycl_utilities.nat_functor( functor );
      return Sequences.remove_duplicates( ConsesLow.nconc( kb_accessors.meta_result_genl( meta_functor, UNPROVIDED ), kb_accessors.meta_result_genl_args( meta_functor, UNPROVIDED ) ), UNPROVIDED, UNPROVIDED, UNPROVIDED,
          UNPROVIDED );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/at-routines.lisp", position = 40858L)
  public static SubLObject naut_genls_collections_int(final SubLObject v_term, final SubLObject functor)
  {
    SubLObject collections = NIL;
    collections = kb_accessors.result_genl( functor, UNPROVIDED, UNPROVIDED );
    collections = ConsesLow.nconc( collections, kb_accessors.result_genl_args( v_term, UNPROVIDED ) );
    collections = ConsesLow.nconc( collections, kb_accessors.result_genl_via_arg_arg_genl( v_term, UNPROVIDED ) );
    return Sequences.remove_duplicates( collections, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/at-routines.lisp", position = 41177L)
  public static SubLObject applicable_arg_type_collections(final SubLObject reln, final SubLObject argnum, final SubLObject constraint_type)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject mt_var = wff_vars.wff_constraint_mt();
    final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding( thread );
    final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding( thread );
    final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding( thread );
    try
    {
      mt_relevance_macros.$mt$.bind( mt_relevance_macros.update_inference_mt_relevance_mt( mt_var ), thread );
      mt_relevance_macros.$relevant_mt_function$.bind( mt_relevance_macros.update_inference_mt_relevance_function( mt_var ), thread );
      mt_relevance_macros.$relevant_mts$.bind( mt_relevance_macros.update_inference_mt_relevance_mt_list( mt_var ), thread );
      final SubLObject constraint_pred = constraint_pred( constraint_type, argnum, reln );
      applicable_arg_type_collections_int( constraint_pred, reln, argnum, constraint_type, $kw11$SELF );
      if( NIL != forts.fort_p( reln ) )
      {
        final SubLObject genl_preds_or_inverseP = makeBoolean( NIL != genl_predicates.genl_predicates( reln, UNPROVIDED, UNPROVIDED ) || NIL != genl_predicates.genl_inverses( reln, UNPROVIDED, UNPROVIDED ) );
        if( NIL != at_vars.$at_check_genl_predsP$.getDynamicValue( thread ) && NIL != genl_preds_or_inverseP )
        {
          SubLObject cdolist_list_var = genl_predicates.all_genl_preds( reln, UNPROVIDED, UNPROVIDED );
          SubLObject reln_genl_pred = NIL;
          reln_genl_pred = cdolist_list_var.first();
          while ( NIL != cdolist_list_var)
          {
            if( !reln_genl_pred.eql( reln ) )
            {
              applicable_arg_type_collections_int( constraint_pred, reln_genl_pred, argnum, constraint_type, $kw101$VIA_GENL_PRED );
            }
            cdolist_list_var = cdolist_list_var.rest();
            reln_genl_pred = cdolist_list_var.first();
          }
        }
        if( NIL != at_vars.$at_check_genl_inversesP$.getDynamicValue( thread ) && NIL != genl_preds_or_inverseP && ( argnum.numE( ONE_INTEGER ) || argnum.numE( TWO_INTEGER ) ) )
        {
          final SubLObject inverse_constraint_pred = inverse_pred( constraint_type, argnum, reln );
          final SubLObject inverse_argnum = kb_accessors.inverse_argnum( argnum );
          SubLObject cdolist_list_var2 = genl_predicates.all_genl_inverses( reln, UNPROVIDED, UNPROVIDED );
          SubLObject inverse_reln = NIL;
          inverse_reln = cdolist_list_var2.first();
          while ( NIL != cdolist_list_var2)
          {
            if( !inverse_reln.eql( reln ) )
            {
              applicable_arg_type_collections_int( inverse_constraint_pred, inverse_reln, inverse_argnum, constraint_type, $kw102$VIA_GENL_INVERSE );
            }
            cdolist_list_var2 = cdolist_list_var2.rest();
            inverse_reln = cdolist_list_var2.first();
          }
        }
      }
    }
    finally
    {
      mt_relevance_macros.$relevant_mts$.rebind( _prev_bind_3, thread );
      mt_relevance_macros.$relevant_mt_function$.rebind( _prev_bind_2, thread );
      mt_relevance_macros.$mt$.rebind( _prev_bind_0, thread );
    }
    return $at_applicable_arg_types$.getDynamicValue( thread );
  }

  @SubLTranslatedFile.SubL(source = "cycl/at-routines.lisp", position = 42822L)
  public static SubLObject applicable_arg_type_collections_int(final SubLObject constraint_pred, final SubLObject reln, final SubLObject argnum, final SubLObject constraint_type, final SubLObject via)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL == forts.fort_p( constraint_pred ) )
    {
      return NIL;
    }
    if( NIL == at_vars.$noting_at_violationsP$.getDynamicValue( thread ) && NIL != at_cache.at_cache_use_possibleP( constraint_pred, argnum ) )
    {
      SubLObject cdolist_list_var = at_cache.cached_arg_isas_in_relevant_mts( reln, argnum );
      SubLObject v_arg_type = NIL;
      v_arg_type = cdolist_list_var.first();
      while ( NIL != cdolist_list_var)
      {
        final SubLObject item_var = v_arg_type;
        if( NIL == conses_high.member( item_var, $at_applicable_arg_types$.getDynamicValue( thread ), Symbols.symbol_function( EQL ), Symbols.symbol_function( IDENTITY ) ) )
        {
          $at_applicable_arg_types$.setDynamicValue( ConsesLow.cons( item_var, $at_applicable_arg_types$.getDynamicValue( thread ) ), thread );
        }
        cdolist_list_var = cdolist_list_var.rest();
        v_arg_type = cdolist_list_var.first();
      }
    }
    else
    {
      final SubLObject constraint_argnum = at_utilities.constraint_pred_constraint_argnum( constraint_pred );
      if( constraint_argnum.isInteger() )
      {
        accumulate_applicable_arg_type_collections_general_case( constraint_pred, constraint_argnum, reln, via );
        accumulate_applicable_arg_type_collections_single_entry( constraint_pred, argnum, reln, via );
      }
    }
    accumulate_applicable_arg_type_collections_arg_isas( constraint_type, constraint_pred, argnum, reln, via );
    return $at_applicable_arg_types$.getDynamicValue( thread );
  }

  @SubLTranslatedFile.SubL(source = "cycl/at-routines.lisp", position = 44050L)
  public static SubLObject accumulate_applicable_arg_type_collections_general_case(final SubLObject constraint_pred, final SubLObject constraint_argnum, final SubLObject reln, final SubLObject via)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL != kb_mapping_macros.do_gaf_arg_index_key_validator( reln, ONE_INTEGER, constraint_pred ) )
    {
      final SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator( reln, ONE_INTEGER, constraint_pred );
      SubLObject done_var = NIL;
      final SubLObject token_var = NIL;
      while ( NIL == done_var)
      {
        final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper( iterator_var, token_var );
        final SubLObject valid = makeBoolean( !token_var.eql( final_index_spec ) );
        if( NIL != valid )
        {
          SubLObject final_index_iterator = NIL;
          try
          {
            final_index_iterator = kb_mapping_macros.new_final_index_iterator( final_index_spec, $kw103$GAF, $kw104$TRUE, NIL );
            SubLObject done_var_$164 = NIL;
            final SubLObject token_var_$165 = NIL;
            while ( NIL == done_var_$164)
            {
              final SubLObject assertion = iteration.iteration_next_without_values_macro_helper( final_index_iterator, token_var_$165 );
              final SubLObject valid_$166 = makeBoolean( !token_var_$165.eql( assertion ) );
              if( NIL != valid_$166 && NIL == inapplicable_arg_type_assertionP( assertion ) )
              {
                final SubLObject item_var;
                final SubLObject v_arg_type = item_var = assertions_high.gaf_arg( assertion, constraint_argnum );
                if( NIL == conses_high.member( item_var, $at_applicable_arg_types$.getDynamicValue( thread ), Symbols.symbol_function( EQL ), Symbols.symbol_function( IDENTITY ) ) )
                {
                  $at_applicable_arg_types$.setDynamicValue( ConsesLow.cons( item_var, $at_applicable_arg_types$.getDynamicValue( thread ) ), thread );
                }
                if( NIL != at_vars.$noting_at_violationsP$.getDynamicValue( thread ) )
                {
                  dictionary_utilities.dictionary_push( $at_applicable_arg_types_with_assertions$.getDynamicValue( thread ), v_arg_type, ConsesLow.list( reln, via, assertion ) );
                }
              }
              done_var_$164 = makeBoolean( NIL == valid_$166 );
            }
          }
          finally
          {
            final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
            try
            {
              Threads.$is_thread_performing_cleanupP$.bind( T, thread );
              final SubLObject _values = Values.getValuesAsVector();
              if( NIL != final_index_iterator )
              {
                kb_mapping_macros.destroy_final_index_iterator( final_index_iterator );
              }
              Values.restoreValuesFromVector( _values );
            }
            finally
            {
              Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0, thread );
            }
          }
        }
        done_var = makeBoolean( NIL == valid );
      }
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/at-routines.lisp", position = 44573L)
  public static SubLObject accumulate_applicable_arg_type_collections_single_entry(final SubLObject constraint_pred, final SubLObject argnum, final SubLObject reln, final SubLObject via)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( constraint_pred.eql( kb_accessors.argn_format_pred( argnum ) ) && NIL == subl_promotions.memberP( $const105$SingleEntry, $at_applicable_arg_types$.getDynamicValue( thread ), Symbols.symbol_function(
        $sym106$KBEQ ), UNPROVIDED ) && NIL != kb_accessors.single_entry_format_in_argsP( reln, argnum, UNPROVIDED ) )
    {
      final SubLObject item_var;
      final SubLObject v_arg_type = item_var = $const105$SingleEntry;
      if( NIL == conses_high.member( item_var, $at_applicable_arg_types$.getDynamicValue( thread ), Symbols.symbol_function( EQL ), Symbols.symbol_function( IDENTITY ) ) )
      {
        $at_applicable_arg_types$.setDynamicValue( ConsesLow.cons( item_var, $at_applicable_arg_types$.getDynamicValue( thread ) ), thread );
      }
      if( NIL != at_vars.$noting_at_violationsP$.getDynamicValue( thread ) )
      {
        final SubLObject assertion = czer_meta.find_visible_assertion_cycl( ConsesLow.list( $const107$singleEntryFormatInArgs, reln, argnum ), UNPROVIDED );
        if( NIL != assertion && NIL == inapplicable_arg_type_assertionP( assertion ) )
        {
          dictionary_utilities.dictionary_push( $at_applicable_arg_types_with_assertions$.getDynamicValue( thread ), v_arg_type, ConsesLow.list( reln, via, assertion ) );
        }
      }
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/at-routines.lisp", position = 45302L)
  public static SubLObject accumulate_applicable_arg_type_collections_arg_isas(final SubLObject constraint_type, final SubLObject constraint_pred, final SubLObject argnum, final SubLObject reln, final SubLObject via)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL != at_vars.consider_multiargs_at_predP() )
    {
      SubLObject cdolist_list_var = constraint_preds( constraint_type, argnum, reln );
      SubLObject at_pred = NIL;
      at_pred = cdolist_list_var.first();
      while ( NIL != cdolist_list_var)
      {
        if( !at_pred.eql( constraint_pred ) && ( !$const108$argsIsa.eql( at_pred ) || NIL != at_cache.some_args_isa_assertion_somewhereP( reln ) ) && ( !$const109$argAndRestIsa.eql( at_pred ) || NIL != at_cache
            .some_arg_and_rest_isa_assertion_somewhereP( reln ) ) )
        {
          final SubLObject constraint_argnum = at_utilities.constraint_pred_constraint_argnum( at_pred );
          final SubLObject pred_var = at_pred;
          if( NIL != kb_mapping_macros.do_gaf_arg_index_key_validator( reln, ONE_INTEGER, pred_var ) )
          {
            final SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator( reln, ONE_INTEGER, pred_var );
            SubLObject done_var = NIL;
            final SubLObject token_var = NIL;
            while ( NIL == done_var)
            {
              final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper( iterator_var, token_var );
              final SubLObject valid = makeBoolean( !token_var.eql( final_index_spec ) );
              if( NIL != valid )
              {
                SubLObject final_index_iterator = NIL;
                try
                {
                  final_index_iterator = kb_mapping_macros.new_final_index_iterator( final_index_spec, $kw103$GAF, $kw104$TRUE, NIL );
                  SubLObject done_var_$167 = NIL;
                  final SubLObject token_var_$168 = NIL;
                  while ( NIL == done_var_$167)
                  {
                    final SubLObject assertion = iteration.iteration_next_without_values_macro_helper( final_index_iterator, token_var_$168 );
                    final SubLObject valid_$169 = makeBoolean( !token_var_$168.eql( assertion ) );
                    if( NIL != valid_$169 && NIL == inapplicable_arg_type_assertionP( assertion ) )
                    {
                      final SubLObject item_var;
                      final SubLObject v_arg_type = item_var = assertions_high.gaf_arg( assertion, constraint_argnum );
                      if( NIL == conses_high.member( item_var, $at_applicable_arg_types$.getDynamicValue( thread ), Symbols.symbol_function( EQL ), Symbols.symbol_function( IDENTITY ) ) )
                      {
                        $at_applicable_arg_types$.setDynamicValue( ConsesLow.cons( item_var, $at_applicable_arg_types$.getDynamicValue( thread ) ), thread );
                      }
                      if( NIL != at_vars.$noting_at_violationsP$.getDynamicValue( thread ) )
                      {
                        dictionary_utilities.dictionary_push( $at_applicable_arg_types_with_assertions$.getDynamicValue( thread ), v_arg_type, ConsesLow.list( reln, via, assertion ) );
                      }
                    }
                    done_var_$167 = makeBoolean( NIL == valid_$169 );
                  }
                }
                finally
                {
                  final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
                  try
                  {
                    Threads.$is_thread_performing_cleanupP$.bind( T, thread );
                    final SubLObject _values = Values.getValuesAsVector();
                    if( NIL != final_index_iterator )
                    {
                      kb_mapping_macros.destroy_final_index_iterator( final_index_iterator );
                    }
                    Values.restoreValuesFromVector( _values );
                  }
                  finally
                  {
                    Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0, thread );
                  }
                }
              }
              done_var = makeBoolean( NIL == valid );
            }
          }
        }
        cdolist_list_var = cdolist_list_var.rest();
        at_pred = cdolist_list_var.first();
      }
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/at-routines.lisp", position = 46254L)
  public static SubLObject constraint_pred(final SubLObject constraint_type, final SubLObject argnum, final SubLObject reln)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( constraint_type.eql( $kw6$ARG_ISA ) )
    {
      return kb_accessors.arg_isa_pred( argnum, reln, mt_relevance_macros.$mt$.getDynamicValue( thread ) );
    }
    if( constraint_type.eql( $kw17$ARG_NOT_ISA ) )
    {
      return kb_accessors.arg_not_isa_pred( argnum, reln, mt_relevance_macros.$mt$.getDynamicValue( thread ) );
    }
    if( constraint_type.eql( $kw25$ARG_QUOTED_ISA ) )
    {
      return kb_accessors.arg_quoted_isa_pred( argnum, reln, mt_relevance_macros.$mt$.getDynamicValue( thread ) );
    }
    if( constraint_type.eql( $kw32$ARG_GENLS ) )
    {
      return kb_accessors.arg_genl_pred( argnum, reln, mt_relevance_macros.$mt$.getDynamicValue( thread ) );
    }
    if( constraint_type.eql( $kw38$FORMAT ) )
    {
      return kb_accessors.argn_format_pred( argnum );
    }
    Errors.error( $str110$Unknown_constraint_type__s, constraint_type );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/at-routines.lisp", position = 46755L)
  public static SubLObject constraint_preds(final SubLObject constraint_type, final SubLObject argnum, final SubLObject reln)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( constraint_type.eql( $kw6$ARG_ISA ) )
    {
      return kb_accessors.arg_isa_preds( argnum, reln, mt_relevance_macros.$mt$.getDynamicValue( thread ) );
    }
    if( constraint_type.eql( $kw17$ARG_NOT_ISA ) )
    {
      return kb_accessors.arg_not_isa_preds( argnum, reln, mt_relevance_macros.$mt$.getDynamicValue( thread ) );
    }
    if( constraint_type.eql( $kw25$ARG_QUOTED_ISA ) )
    {
      return kb_accessors.arg_quoted_isa_preds( argnum, reln, mt_relevance_macros.$mt$.getDynamicValue( thread ) );
    }
    if( constraint_type.eql( $kw32$ARG_GENLS ) )
    {
      return kb_accessors.arg_genl_preds( argnum, reln, mt_relevance_macros.$mt$.getDynamicValue( thread ) );
    }
    if( constraint_type.eql( $kw38$FORMAT ) )
    {
      return NIL;
    }
    Errors.error( $str110$Unknown_constraint_type__s, constraint_type );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/at-routines.lisp", position = 47210L)
  public static SubLObject inverse_pred(final SubLObject constraint_type, final SubLObject argnum, final SubLObject reln)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( constraint_type.eql( $kw6$ARG_ISA ) )
    {
      return kb_accessors.arg_isa_inverse( argnum, reln, mt_relevance_macros.$mt$.getDynamicValue( thread ) );
    }
    if( constraint_type.eql( $kw17$ARG_NOT_ISA ) )
    {
      return kb_accessors.arg_not_isa_inverse( argnum, reln, mt_relevance_macros.$mt$.getDynamicValue( thread ) );
    }
    if( constraint_type.eql( $kw25$ARG_QUOTED_ISA ) )
    {
      return kb_accessors.arg_quoted_isa_inverse( argnum, reln, mt_relevance_macros.$mt$.getDynamicValue( thread ) );
    }
    if( constraint_type.eql( $kw32$ARG_GENLS ) )
    {
      return kb_accessors.arg_genl_inverse( argnum, reln, mt_relevance_macros.$mt$.getDynamicValue( thread ) );
    }
    if( constraint_type.eql( $kw38$FORMAT ) )
    {
      return kb_accessors.argn_format_inverse( argnum );
    }
    Errors.error( $str110$Unknown_constraint_type__s, constraint_type );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/at-routines.lisp", position = 47777L)
  public static SubLObject gather_ind_arg_relevant_constraints(final SubLObject ind_arg, final SubLObject constraint_type)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( constraint_type.eql( $kw40$INTER_ARG_ISA ) )
    {
      $ind_arg_relevant_constraints$.setDynamicValue( isa.all_isa( ind_arg, UNPROVIDED, UNPROVIDED ), thread );
    }
    else if( constraint_type.eql( $kw66$INTER_ARG_NOT_ISA ) )
    {
      $ind_arg_relevant_constraints$.setDynamicValue( isa.all_isa( ind_arg, UNPROVIDED, UNPROVIDED ), thread );
    }
    else if( constraint_type.eql( $kw63$INTER_ARG_GENL ) )
    {
      $ind_arg_relevant_constraints$.setDynamicValue( genls.all_genls( ind_arg, UNPROVIDED, UNPROVIDED ), thread );
    }
    else if( constraint_type.eql( $kw71$INTER_ARG_NOT_GENL ) )
    {
      $ind_arg_relevant_constraints$.setDynamicValue( genls.all_genls( ind_arg, UNPROVIDED, UNPROVIDED ), thread );
    }
    else if( constraint_type.eql( $kw78$INTER_ARG_ISA_GENL ) )
    {
      $ind_arg_relevant_constraints$.setDynamicValue( isa.all_isa( ind_arg, UNPROVIDED, UNPROVIDED ), thread );
    }
    else if( constraint_type.eql( $kw74$INTER_ARG_GENL_ISA ) )
    {
      $ind_arg_relevant_constraints$.setDynamicValue( genls.all_genls( ind_arg, UNPROVIDED, UNPROVIDED ), thread );
    }
    else if( constraint_type.eql( $kw87$INTER_ARG_FORMAT ) )
    {
      $ind_arg_relevant_constraints$.setDynamicValue( isa.all_isa( ind_arg, UNPROVIDED, UNPROVIDED ), thread );
    }
    return $ind_arg_relevant_constraints$.getDynamicValue( thread );
  }

  @SubLTranslatedFile.SubL(source = "cycl/at-routines.lisp", position = 48558L)
  public static SubLObject relevant_constraintP(final SubLObject ind_arg, final SubLObject ind_arg_type, final SubLObject ind_type, final SubLObject constraint_type)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( constraint_type == $kw91$INTER_ARG_DIFFERENT )
    {
      return T;
    }
    if( ind_type.eql( $kw111$FORT ) )
    {
      return subl_promotions.memberP( ind_arg_type, $ind_arg_relevant_constraints$.getDynamicValue( thread ), Symbols.symbol_function( $sym106$KBEQ ), UNPROVIDED );
    }
    if( !ind_type.eql( $kw112$NON_FORT ) )
    {
      return NIL;
    }
    if( constraint_type.eql( $kw63$INTER_ARG_GENL ) )
    {
      return genls.genlP( ind_arg, ind_arg_type, UNPROVIDED, UNPROVIDED );
    }
    if( constraint_type.eql( $kw74$INTER_ARG_GENL_ISA ) )
    {
      return genls.genlP( ind_arg, ind_arg_type, UNPROVIDED, UNPROVIDED );
    }
    return at_defns.quiet_has_typeP( ind_arg, ind_arg_type, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/at-routines.lisp", position = 49051L)
  public static SubLObject relevant_constraints_among(final SubLObject ind_arg_types, final SubLObject ind_arg, final SubLObject ind_type, final SubLObject constraint_type)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( constraint_type == $kw91$INTER_ARG_DIFFERENT )
    {
      return ind_arg_types;
    }
    if( ind_type.eql( $kw111$FORT ) )
    {
      return conses_high.intersection( ind_arg_types, $ind_arg_relevant_constraints$.getDynamicValue( thread ), Symbols.symbol_function( $sym106$KBEQ ), UNPROVIDED );
    }
    if( !ind_type.eql( $kw112$NON_FORT ) )
    {
      return NIL;
    }
    if( constraint_type.eql( $kw63$INTER_ARG_GENL ) )
    {
      return genls.all_genls_among( ind_arg, ind_arg_types, UNPROVIDED, UNPROVIDED );
    }
    if( constraint_type.eql( $kw74$INTER_ARG_GENL_ISA ) )
    {
      return genls.all_genls_among( ind_arg, ind_arg_types, UNPROVIDED, UNPROVIDED );
    }
    return at_defns.quiet_has_type_among( ind_arg, ind_arg_types, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/at-routines.lisp", position = 49594L)
  public static SubLObject applicable_inter_arg_type_collections(final SubLObject reln, final SubLObject ind_arg, final SubLObject ind_argnum, final SubLObject dep_argnum, final SubLObject constraint_type,
      final SubLObject check_non_constantP)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject mt_var = wff_vars.wff_constraint_mt();
    final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding( thread );
    final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding( thread );
    final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding( thread );
    final SubLObject _prev_bind_4 = $ind_arg_relevant_constraints$.currentBinding( thread );
    try
    {
      mt_relevance_macros.$mt$.bind( mt_relevance_macros.update_inference_mt_relevance_mt( mt_var ), thread );
      mt_relevance_macros.$relevant_mt_function$.bind( mt_relevance_macros.update_inference_mt_relevance_function( mt_var ), thread );
      mt_relevance_macros.$relevant_mts$.bind( mt_relevance_macros.update_inference_mt_relevance_mt_list( mt_var ), thread );
      $ind_arg_relevant_constraints$.bind( NIL, thread );
      if( NIL != forts.fort_p( ind_arg ) )
      {
        gather_ind_arg_relevant_constraints( ind_arg, constraint_type );
        applicable_inter_arg_type_pred_collections( reln, ind_arg, ind_argnum, dep_argnum, constraint_type, $kw111$FORT );
      }
      else if( NIL == arg_type.variable_wrt_arg_typeP( ind_arg ) )
      {
        if( NIL != check_non_constantP )
        {
          applicable_inter_arg_type_pred_collections( reln, ind_arg, ind_argnum, dep_argnum, constraint_type, $kw112$NON_FORT );
        }
      }
    }
    finally
    {
      $ind_arg_relevant_constraints$.rebind( _prev_bind_4, thread );
      mt_relevance_macros.$relevant_mts$.rebind( _prev_bind_3, thread );
      mt_relevance_macros.$relevant_mt_function$.rebind( _prev_bind_2, thread );
      mt_relevance_macros.$mt$.rebind( _prev_bind_0, thread );
    }
    return $at_applicable_arg_types$.getDynamicValue( thread );
  }

  @SubLTranslatedFile.SubL(source = "cycl/at-routines.lisp", position = 50345L)
  public static SubLObject applicable_inter_arg_type_pred_collections(final SubLObject reln, final SubLObject ind_arg, final SubLObject ind_argnum, final SubLObject dep_argnum, final SubLObject constraint_type,
      SubLObject ind_type)
  {
    if( ind_type == UNPROVIDED )
    {
      ind_type = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject constraint_pred = inter_arg_constraint_pred( constraint_type, ind_argnum, dep_argnum );
    if( NIL == forts.fort_p( constraint_pred ) )
    {
      return NIL;
    }
    applicable_inter_arg_type_pred_collections_int( constraint_pred, reln, ind_arg, $kw11$SELF, constraint_type, ind_type );
    if( NIL != forts.fort_p( reln ) )
    {
      final SubLObject genl_preds_or_inverseP = makeBoolean( NIL != genl_predicates.genl_predicates( reln, UNPROVIDED, UNPROVIDED ) || NIL != genl_predicates.genl_inverses( reln, UNPROVIDED, UNPROVIDED ) );
      if( NIL != at_vars.$at_check_genl_predsP$.getDynamicValue( thread ) && NIL != genl_preds_or_inverseP )
      {
        SubLObject cdolist_list_var = genl_predicates.all_genl_preds( reln, UNPROVIDED, UNPROVIDED );
        SubLObject reln_genl_pred = NIL;
        reln_genl_pred = cdolist_list_var.first();
        while ( NIL != cdolist_list_var)
        {
          if( !reln_genl_pred.eql( reln ) )
          {
            applicable_inter_arg_type_pred_collections_int( constraint_pred, reln_genl_pred, ind_arg, $kw101$VIA_GENL_PRED, constraint_type, ind_type );
          }
          cdolist_list_var = cdolist_list_var.rest();
          reln_genl_pred = cdolist_list_var.first();
        }
      }
      if( NIL != at_vars.$at_check_genl_inversesP$.getDynamicValue( thread ) && NIL != genl_preds_or_inverseP )
      {
        final SubLObject inverse_constraint_pred = inter_arg_inverse_pred( constraint_type, ind_argnum, dep_argnum );
        SubLObject cdolist_list_var2 = genl_predicates.all_genl_inverses( reln, UNPROVIDED, UNPROVIDED );
        SubLObject inverse_reln = NIL;
        inverse_reln = cdolist_list_var2.first();
        while ( NIL != cdolist_list_var2)
        {
          if( !inverse_reln.eql( reln ) )
          {
            applicable_inter_arg_type_pred_collections_int( inverse_constraint_pred, inverse_reln, ind_arg, $kw102$VIA_GENL_INVERSE, constraint_type, ind_type );
          }
          cdolist_list_var2 = cdolist_list_var2.rest();
          inverse_reln = cdolist_list_var2.first();
        }
      }
    }
    return $at_applicable_arg_types$.getDynamicValue( thread );
  }

  @SubLTranslatedFile.SubL(source = "cycl/at-routines.lisp", position = 51815L)
  public static SubLObject applicable_inter_arg_type_pred_collections_int(final SubLObject constraint_pred, final SubLObject reln, final SubLObject ind_arg, final SubLObject via, final SubLObject ind_type,
      final SubLObject constraint_type)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    thread.resetMultipleValues();
    final SubLObject more_at_applicable_arg_types = applicable_inter_arg_type_pred_collections_int_memoized( constraint_pred, reln, ind_arg, via, ind_type, constraint_type, mt_relevance_macros.$mt$.getDynamicValue(
        thread ), at_vars.$noting_at_violationsP$.getDynamicValue( thread ) );
    final SubLObject more_at_violations = thread.secondMultipleValue();
    thread.resetMultipleValues();
    SubLObject cdolist_list_var = more_at_applicable_arg_types;
    SubLObject at_applicable_arg_type = NIL;
    at_applicable_arg_type = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      final SubLObject item_var = at_applicable_arg_type;
      if( NIL == conses_high.member( item_var, $at_applicable_arg_types$.getDynamicValue( thread ), Symbols.symbol_function( EQUAL ), Symbols.symbol_function( IDENTITY ) ) )
      {
        $at_applicable_arg_types$.setDynamicValue( ConsesLow.cons( item_var, $at_applicable_arg_types$.getDynamicValue( thread ) ), thread );
      }
      cdolist_list_var = cdolist_list_var.rest();
      at_applicable_arg_type = cdolist_list_var.first();
    }
    cdolist_list_var = more_at_violations;
    SubLObject at_violation = NIL;
    at_violation = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      SubLObject current;
      final SubLObject datum = current = at_violation;
      SubLObject inter_arg_type = NIL;
      SubLObject reln_$172 = NIL;
      SubLObject via_$173 = NIL;
      cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list113 );
      inter_arg_type = current.first();
      current = current.rest();
      cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list113 );
      reln_$172 = current.first();
      current = current.rest();
      cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list113 );
      via_$173 = current.first();
      current = current.rest();
      if( NIL == current )
      {
        dictionary_utilities.dictionary_push( $at_applicable_arg_types_with_assertions$.getDynamicValue( thread ), inter_arg_type, ConsesLow.list( reln_$172, via_$173 ) );
      }
      else
      {
        cdestructuring_bind.cdestructuring_bind_error( datum, $list113 );
      }
      cdolist_list_var = cdolist_list_var.rest();
      at_violation = cdolist_list_var.first();
    }
    return $at_applicable_arg_types$.getDynamicValue( thread );
  }

  @SubLTranslatedFile.SubL(source = "cycl/at-routines.lisp", position = 52691L)
  public static SubLObject applicable_inter_arg_type_pred_collections_int_memoized_internal(final SubLObject constraint_pred, final SubLObject reln, final SubLObject ind_arg, final SubLObject via,
      final SubLObject ind_type, final SubLObject constraint_type, final SubLObject mt, final SubLObject noting_at_violationsP)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate( mt );
    final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding( thread );
    final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding( thread );
    final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding( thread );
    try
    {
      mt_relevance_macros.$mt$.bind( mt_relevance_macros.update_inference_mt_relevance_mt( mt_var ), thread );
      mt_relevance_macros.$relevant_mt_function$.bind( mt_relevance_macros.update_inference_mt_relevance_function( mt_var ), thread );
      mt_relevance_macros.$relevant_mts$.bind( mt_relevance_macros.update_inference_mt_relevance_mt_list( mt_var ), thread );
      if( NIL != constraint_pred )
      {
        final SubLObject ind_to_dep_arg_dictionary = applicable_inter_arg_type_pred_collections_dictionary( reln, constraint_pred, mt );
        SubLObject more_at_applicable_arg_types = NIL;
        SubLObject more_at_violations = NIL;
        SubLObject cdolist_list_var = relevant_constraints_among( dictionary.dictionary_keys( ind_to_dep_arg_dictionary ), ind_arg, constraint_type, ind_type );
        SubLObject ind_arg_type = NIL;
        ind_arg_type = cdolist_list_var.first();
        while ( NIL != cdolist_list_var)
        {
          SubLObject cdolist_list_var_$174 = dictionary.dictionary_lookup( ind_to_dep_arg_dictionary, ind_arg_type, UNPROVIDED );
          SubLObject dep_arg_type = NIL;
          dep_arg_type = cdolist_list_var_$174.first();
          while ( NIL != cdolist_list_var_$174)
          {
            final SubLObject item_var;
            final SubLObject inter_arg_type = item_var = ConsesLow.list( ind_arg_type, dep_arg_type );
            if( NIL == conses_high.member( item_var, more_at_applicable_arg_types, Symbols.symbol_function( EQUAL ), Symbols.symbol_function( IDENTITY ) ) )
            {
              more_at_applicable_arg_types = ConsesLow.cons( item_var, more_at_applicable_arg_types );
            }
            if( NIL != noting_at_violationsP )
            {
              more_at_violations = ConsesLow.cons( ConsesLow.list( inter_arg_type, reln, via ), more_at_violations );
            }
            cdolist_list_var_$174 = cdolist_list_var_$174.rest();
            dep_arg_type = cdolist_list_var_$174.first();
          }
          cdolist_list_var = cdolist_list_var.rest();
          ind_arg_type = cdolist_list_var.first();
        }
        return Values.values( more_at_applicable_arg_types, more_at_violations );
      }
    }
    finally
    {
      mt_relevance_macros.$relevant_mts$.rebind( _prev_bind_3, thread );
      mt_relevance_macros.$relevant_mt_function$.rebind( _prev_bind_2, thread );
      mt_relevance_macros.$mt$.rebind( _prev_bind_0, thread );
    }
    return Values.values( NIL, NIL );
  }

  @SubLTranslatedFile.SubL(source = "cycl/at-routines.lisp", position = 52691L)
  public static SubLObject applicable_inter_arg_type_pred_collections_int_memoized(final SubLObject constraint_pred, final SubLObject reln, final SubLObject ind_arg, final SubLObject via, final SubLObject ind_type,
      final SubLObject constraint_type, final SubLObject mt, final SubLObject noting_at_violationsP)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue( thread );
    SubLObject caching_state = NIL;
    if( NIL == v_memoization_state )
    {
      return applicable_inter_arg_type_pred_collections_int_memoized_internal( constraint_pred, reln, ind_arg, via, ind_type, constraint_type, mt, noting_at_violationsP );
    }
    caching_state = memoization_state.memoization_state_lookup( v_memoization_state, $sym114$APPLICABLE_INTER_ARG_TYPE_PRED_COLLECTIONS_INT_MEMOIZED, UNPROVIDED );
    if( NIL == caching_state )
    {
      caching_state = memoization_state.create_caching_state( memoization_state.memoization_state_lock( v_memoization_state ), $sym114$APPLICABLE_INTER_ARG_TYPE_PRED_COLLECTIONS_INT_MEMOIZED, EIGHT_INTEGER, $int116$512,
          EQUAL, UNPROVIDED );
      memoization_state.memoization_state_put( v_memoization_state, $sym114$APPLICABLE_INTER_ARG_TYPE_PRED_COLLECTIONS_INT_MEMOIZED, caching_state );
    }
    final SubLObject sxhash = memoization_state.sxhash_calc_8( constraint_pred, reln, ind_arg, via, ind_type, constraint_type, mt, noting_at_violationsP );
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
        if( constraint_pred.equal( cached_args.first() ) )
        {
          cached_args = cached_args.rest();
          if( reln.equal( cached_args.first() ) )
          {
            cached_args = cached_args.rest();
            if( ind_arg.equal( cached_args.first() ) )
            {
              cached_args = cached_args.rest();
              if( via.equal( cached_args.first() ) )
              {
                cached_args = cached_args.rest();
                if( ind_type.equal( cached_args.first() ) )
                {
                  cached_args = cached_args.rest();
                  if( constraint_type.equal( cached_args.first() ) )
                  {
                    cached_args = cached_args.rest();
                    if( mt.equal( cached_args.first() ) )
                    {
                      cached_args = cached_args.rest();
                      if( NIL != cached_args && NIL == cached_args.rest() && noting_at_violationsP.equal( cached_args.first() ) )
                      {
                        return memoization_state.caching_results( results2 );
                      }
                    }
                  }
                }
              }
            }
          }
        }
        cdolist_list_var = cdolist_list_var.rest();
        collision = cdolist_list_var.first();
      }
    }
    final SubLObject results3 = Values.arg2( thread.resetMultipleValues(), Values.multiple_value_list( applicable_inter_arg_type_pred_collections_int_memoized_internal( constraint_pred, reln, ind_arg, via, ind_type,
        constraint_type, mt, noting_at_violationsP ) ) );
    memoization_state.caching_state_enter_multi_key_n( caching_state, sxhash, collisions, results3, ConsesLow.list( constraint_pred, reln, ind_arg, via, ind_type, constraint_type, mt, noting_at_violationsP ) );
    return memoization_state.caching_results( results3 );
  }

  @SubLTranslatedFile.SubL(source = "cycl/at-routines.lisp", position = 54196L)
  public static SubLObject clear_applicable_inter_arg_type_pred_collections_dictionary()
  {
    final SubLObject cs = $applicable_inter_arg_type_pred_collections_dictionary_caching_state$.getGlobalValue();
    if( NIL != cs )
    {
      memoization_state.caching_state_clear( cs );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/at-routines.lisp", position = 54196L)
  public static SubLObject remove_applicable_inter_arg_type_pred_collections_dictionary(final SubLObject reln, final SubLObject constraint_pred, final SubLObject mt)
  {
    return memoization_state.caching_state_remove_function_results_with_args( $applicable_inter_arg_type_pred_collections_dictionary_caching_state$.getGlobalValue(), ConsesLow.list( reln, constraint_pred, mt ),
        UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/at-routines.lisp", position = 54196L)
  public static SubLObject applicable_inter_arg_type_pred_collections_dictionary_internal(final SubLObject reln, final SubLObject constraint_pred, final SubLObject mt)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject result = dictionary.new_dictionary( Symbols.symbol_function( EQUAL ), UNPROVIDED );
    final SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate( mt );
    final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding( thread );
    final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding( thread );
    final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding( thread );
    try
    {
      mt_relevance_macros.$mt$.bind( mt_relevance_macros.update_inference_mt_relevance_mt( mt_var ), thread );
      mt_relevance_macros.$relevant_mt_function$.bind( mt_relevance_macros.update_inference_mt_relevance_function( mt_var ), thread );
      mt_relevance_macros.$relevant_mts$.bind( mt_relevance_macros.update_inference_mt_relevance_mt_list( mt_var ), thread );
      if( NIL != kb_mapping_macros.do_gaf_arg_index_key_validator( reln, ONE_INTEGER, constraint_pred ) )
      {
        final SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator( reln, ONE_INTEGER, constraint_pred );
        SubLObject done_var = NIL;
        final SubLObject token_var = NIL;
        while ( NIL == done_var)
        {
          final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper( iterator_var, token_var );
          final SubLObject valid = makeBoolean( !token_var.eql( final_index_spec ) );
          if( NIL != valid )
          {
            SubLObject final_index_iterator = NIL;
            try
            {
              final_index_iterator = kb_mapping_macros.new_final_index_iterator( final_index_spec, $kw103$GAF, $kw104$TRUE, NIL );
              SubLObject done_var_$175 = NIL;
              final SubLObject token_var_$176 = NIL;
              while ( NIL == done_var_$175)
              {
                final SubLObject assertion = iteration.iteration_next_without_values_macro_helper( final_index_iterator, token_var_$176 );
                final SubLObject valid_$177 = makeBoolean( !token_var_$176.eql( assertion ) );
                if( NIL != valid_$177 && NIL == inapplicable_arg_type_assertionP( assertion ) )
                {
                  final SubLObject ind_arg_type = assertions_high.gaf_arg2( assertion );
                  final SubLObject dep_arg_type = assertions_high.gaf_arg3( assertion );
                  dictionary_utilities.dictionary_pushnew( result, ind_arg_type, dep_arg_type, UNPROVIDED, UNPROVIDED );
                }
                done_var_$175 = makeBoolean( NIL == valid_$177 );
              }
            }
            finally
            {
              final SubLObject _prev_bind_0_$178 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
              try
              {
                Threads.$is_thread_performing_cleanupP$.bind( T, thread );
                final SubLObject _values = Values.getValuesAsVector();
                if( NIL != final_index_iterator )
                {
                  kb_mapping_macros.destroy_final_index_iterator( final_index_iterator );
                }
                Values.restoreValuesFromVector( _values );
              }
              finally
              {
                Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$178, thread );
              }
            }
          }
          done_var = makeBoolean( NIL == valid );
        }
      }
    }
    finally
    {
      mt_relevance_macros.$relevant_mts$.rebind( _prev_bind_3, thread );
      mt_relevance_macros.$relevant_mt_function$.rebind( _prev_bind_2, thread );
      mt_relevance_macros.$mt$.rebind( _prev_bind_0, thread );
    }
    return result;
  }

  @SubLTranslatedFile.SubL(source = "cycl/at-routines.lisp", position = 54196L)
  public static SubLObject applicable_inter_arg_type_pred_collections_dictionary(final SubLObject reln, final SubLObject constraint_pred, final SubLObject mt)
  {
    SubLObject caching_state = $applicable_inter_arg_type_pred_collections_dictionary_caching_state$.getGlobalValue();
    if( NIL == caching_state )
    {
      caching_state = memoization_state.create_global_caching_state_for_name( $sym117$APPLICABLE_INTER_ARG_TYPE_PRED_COLLECTIONS_DICTIONARY, $sym118$_APPLICABLE_INTER_ARG_TYPE_PRED_COLLECTIONS_DICTIONARY_CACHING_ST,
          $int119$128, EQL, THREE_INTEGER, ZERO_INTEGER );
      memoization_state.register_wff_constraint_dependent_cache_clear_callback( $sym120$CLEAR_APPLICABLE_INTER_ARG_TYPE_PRED_COLLECTIONS_DICTIONARY );
    }
    final SubLObject sxhash = memoization_state.sxhash_calc_3( reln, constraint_pred, mt );
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
        if( reln.eql( cached_args.first() ) )
        {
          cached_args = cached_args.rest();
          if( constraint_pred.eql( cached_args.first() ) )
          {
            cached_args = cached_args.rest();
            if( NIL != cached_args && NIL == cached_args.rest() && mt.eql( cached_args.first() ) )
            {
              return memoization_state.caching_results( results2 );
            }
          }
        }
        cdolist_list_var = cdolist_list_var.rest();
        collision = cdolist_list_var.first();
      }
    }
    final SubLObject results3 = Values.arg2( Values.resetMultipleValues(), Values.multiple_value_list( applicable_inter_arg_type_pred_collections_dictionary_internal( reln, constraint_pred, mt ) ) );
    memoization_state.caching_state_enter_multi_key_n( caching_state, sxhash, collisions, results3, ConsesLow.list( reln, constraint_pred, mt ) );
    return memoization_state.caching_results( results3 );
  }

  @SubLTranslatedFile.SubL(source = "cycl/at-routines.lisp", position = 54777L)
  public static SubLObject inter_arg_constraint_pred(final SubLObject constraint_type, final SubLObject ind_argnum, final SubLObject dep_argnum)
  {
    if( constraint_type.eql( $kw40$INTER_ARG_ISA ) )
    {
      return at_utilities.inter_arg_isa_pred( ind_argnum, dep_argnum );
    }
    if( constraint_type.eql( $kw66$INTER_ARG_NOT_ISA ) )
    {
      return at_utilities.inter_arg_not_isa_pred( ind_argnum, dep_argnum );
    }
    if( constraint_type.eql( $kw63$INTER_ARG_GENL ) )
    {
      return at_utilities.inter_arg_genl_pred( ind_argnum, dep_argnum );
    }
    if( constraint_type.eql( $kw71$INTER_ARG_NOT_GENL ) )
    {
      return at_utilities.inter_arg_not_genl_pred( ind_argnum, dep_argnum );
    }
    if( constraint_type.eql( $kw78$INTER_ARG_ISA_GENL ) )
    {
      return at_utilities.inter_arg_isa_genl_pred( ind_argnum, dep_argnum );
    }
    if( constraint_type.eql( $kw74$INTER_ARG_GENL_ISA ) )
    {
      return at_utilities.inter_arg_genl_isa_pred( ind_argnum, dep_argnum );
    }
    if( constraint_type.eql( $kw87$INTER_ARG_FORMAT ) )
    {
      return kb_accessors.inter_arg_format_pred( ind_argnum, dep_argnum );
    }
    if( constraint_type.eql( $kw91$INTER_ARG_DIFFERENT ) )
    {
      return $const90$interArgDifferent;
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/at-routines.lisp", position = 55518L)
  public static SubLObject inter_arg_inverse_pred(final SubLObject constraint_type, final SubLObject ind_arg, final SubLObject dep_arg)
  {
    if( constraint_type.eql( $kw40$INTER_ARG_ISA ) )
    {
      return at_utilities.inter_arg_isa_inverse( ind_arg, dep_arg );
    }
    if( constraint_type.eql( $kw66$INTER_ARG_NOT_ISA ) )
    {
      return at_utilities.inter_arg_not_isa_inverse( ind_arg, dep_arg );
    }
    if( constraint_type.eql( $kw63$INTER_ARG_GENL ) )
    {
      return at_utilities.inter_arg_genl_inverse( ind_arg, dep_arg );
    }
    if( constraint_type.eql( $kw87$INTER_ARG_FORMAT ) )
    {
      return kb_accessors.inter_arg_format_inverse( ind_arg, dep_arg );
    }
    if( constraint_type.eql( $kw91$INTER_ARG_DIFFERENT ) )
    {
      return $const90$interArgDifferent;
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/at-routines.lisp", position = 55981L)
  public static SubLObject note_at_violations(final SubLObject at_violations)
  {
    SubLObject cdolist_list_var = at_violations;
    SubLObject at_violation = NIL;
    at_violation = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      at_utilities.note_at_violation( at_violation );
      cdolist_list_var = cdolist_list_var.rest();
      at_violation = cdolist_list_var.first();
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/at-routines.lisp", position = 56147L)
  public static SubLObject inapplicable_arg_type_assertionP(final SubLObject assertion)
  {
    final SubLObject assertion_mt = assertions_high.assertion_mt( assertion );
    if( NIL != mt_relevance_macros.any_or_all_mts_are_relevantP() && NIL != forts.fort_p( assertion_mt ) && NIL != somewhere_cache.some_pred_assertion_somewhereP( $const121$wffConstraintMt, assertion_mt, ONE_INTEGER,
        UNPROVIDED ) )
    {
      return T;
    }
    return NIL;
  }

  public static SubLObject declare_at_routines_file()
  {
    SubLFiles.declareMacro( me, "with_applicable_arg_types", "WITH-APPLICABLE-ARG-TYPES" );
    SubLFiles.declareFunction( me, "mal_arg_isaP", "MAL-ARG-ISA?", 3, 0, false );
    SubLFiles.declareFunction( me, "arg_isa_violations", "ARG-ISA-VIOLATIONS", 4, 0, false );
    SubLFiles.declareFunction( me, "arg_isa_violation", "ARG-ISA-VIOLATION", 5, 0, false );
    SubLFiles.declareFunction( me, "arg_isa_violation_int", "ARG-ISA-VIOLATION-INT", 6, 0, false );
    SubLFiles.declareFunction( me, "wff_violation_verbose_data", "WFF-VIOLATION-VERBOSE-DATA", 0, 0, false );
    SubLFiles.declareFunction( me, "arg_isa_required_violation", "ARG-ISA-REQUIRED-VIOLATION", 2, 1, false );
    SubLFiles.declareFunction( me, "mal_arg_not_isaP", "MAL-ARG-NOT-ISA?", 3, 0, false );
    SubLFiles.declareFunction( me, "arg_not_isa_violations", "ARG-NOT-ISA-VIOLATIONS", 4, 0, false );
    SubLFiles.declareFunction( me, "arg_not_isa_violation", "ARG-NOT-ISA-VIOLATION", 5, 0, false );
    SubLFiles.declareFunction( me, "arg_not_isa_violation_int", "ARG-NOT-ISA-VIOLATION-INT", 6, 0, false );
    SubLFiles.declareFunction( me, "arg_not_isa_required_violation", "ARG-NOT-ISA-REQUIRED-VIOLATION", 2, 1, false );
    SubLFiles.declareFunction( me, "mal_arg_not_isa_disjointP", "MAL-ARG-NOT-ISA-DISJOINT?", 3, 0, false );
    SubLFiles.declareFunction( me, "arg_not_isa_disjoint_violations", "ARG-NOT-ISA-DISJOINT-VIOLATIONS", 4, 0, false );
    SubLFiles.declareFunction( me, "arg_not_isa_disjoint_violation_int", "ARG-NOT-ISA-DISJOINT-VIOLATION-INT", 6, 0, false );
    SubLFiles.declareFunction( me, "mal_arg_quoted_isaP", "MAL-ARG-QUOTED-ISA?", 3, 0, false );
    SubLFiles.declareFunction( me, "arg_quoted_isa_violations", "ARG-QUOTED-ISA-VIOLATIONS", 4, 0, false );
    SubLFiles.declareFunction( me, "arg_quoted_isa_violation", "ARG-QUOTED-ISA-VIOLATION", 5, 0, false );
    SubLFiles.declareFunction( me, "mal_arg_not_quoted_isa_disjointP", "MAL-ARG-NOT-QUOTED-ISA-DISJOINT?", 3, 0, false );
    SubLFiles.declareFunction( me, "arg_not_quoted_isa_disjoint_violations", "ARG-NOT-QUOTED-ISA-DISJOINT-VIOLATIONS", 4, 0, false );
    SubLFiles.declareFunction( me, "mal_arg_genlsP", "MAL-ARG-GENLS?", 3, 0, false );
    SubLFiles.declareFunction( me, "arg_genl_violations", "ARG-GENL-VIOLATIONS", 4, 0, false );
    SubLFiles.declareFunction( me, "arg_genl_violation", "ARG-GENL-VIOLATION", 5, 0, false );
    SubLFiles.declareFunction( me, "mal_arg_not_genls_disjointP", "MAL-ARG-NOT-GENLS-DISJOINT?", 3, 0, false );
    SubLFiles.declareFunction( me, "arg_not_genl_disjoint_violations", "ARG-NOT-GENL-DISJOINT-VIOLATIONS", 4, 0, false );
    SubLFiles.declareFunction( me, "mal_arg_formatP", "MAL-ARG-FORMAT?", 3, 0, false );
    SubLFiles.declareFunction( me, "arg_format_violations", "ARG-FORMAT-VIOLATIONS", 4, 0, false );
    SubLFiles.declareFunction( me, "mal_inter_arg_isaP", "MAL-INTER-ARG-ISA?", 5, 0, false );
    SubLFiles.declareFunction( me, "inter_arg_isa_violations", "INTER-ARG-ISA-VIOLATIONS", 7, 0, false );
    SubLFiles.declareFunction( me, "inter_arg_violations", "INTER-ARG-VIOLATIONS", 8, 0, false );
    SubLFiles.declareFunction( me, "some_inter_arg_genl_assertion_somewhereP", "SOME-INTER-ARG-GENL-ASSERTION-SOMEWHERE?", 1, 0, false );
    SubLFiles.declareFunction( me, "some_inter_arg_genl_constraint_somewhereP", "SOME-INTER-ARG-GENL-CONSTRAINT-SOMEWHERE?", 1, 0, false );
    SubLFiles.declareFunction( me, "mal_inter_arg_genlP", "MAL-INTER-ARG-GENL?", 5, 0, false );
    SubLFiles.declareFunction( me, "inter_arg_genl_violations", "INTER-ARG-GENL-VIOLATIONS", 7, 0, false );
    SubLFiles.declareFunction( me, "mal_inter_arg_not_isaP", "MAL-INTER-ARG-NOT-ISA?", 5, 0, false );
    SubLFiles.declareFunction( me, "some_inter_arg_not_isa_constraint_somewhereP", "SOME-INTER-ARG-NOT-ISA-CONSTRAINT-SOMEWHERE?", 1, 0, false );
    SubLFiles.declareFunction( me, "mal_inter_arg_not_genlP", "MAL-INTER-ARG-NOT-GENL?", 5, 0, false );
    SubLFiles.declareFunction( me, "some_inter_arg_not_genl_constraint_somewhereP", "SOME-INTER-ARG-NOT-GENL-CONSTRAINT-SOMEWHERE?", 1, 0, false );
    SubLFiles.declareFunction( me, "mal_inter_arg_genl_isaP", "MAL-INTER-ARG-GENL-ISA?", 5, 0, false );
    SubLFiles.declareFunction( me, "some_inter_arg_genl_isa_constraint_somewhereP", "SOME-INTER-ARG-GENL-ISA-CONSTRAINT-SOMEWHERE?", 1, 0, false );
    SubLFiles.declareFunction( me, "mal_inter_arg_isa_genlP", "MAL-INTER-ARG-ISA-GENL?", 5, 0, false );
    SubLFiles.declareFunction( me, "some_inter_arg_isa_genl_constraint_somewhereP", "SOME-INTER-ARG-ISA-GENL-CONSTRAINT-SOMEWHERE?", 1, 0, false );
    SubLFiles.declareFunction( me, "mal_inter_arg_not_isa_disjointP", "MAL-INTER-ARG-NOT-ISA-DISJOINT?", 5, 0, false );
    SubLFiles.declareFunction( me, "inter_arg_not_isa_disjoint_violations", "INTER-ARG-NOT-ISA-DISJOINT-VIOLATIONS", 7, 0, false );
    SubLFiles.declareFunction( me, "mal_inter_arg_not_genl_disjointP", "MAL-INTER-ARG-NOT-GENL-DISJOINT?", 5, 0, false );
    SubLFiles.declareFunction( me, "inter_arg_not_genl_disjoint_violations", "INTER-ARG-NOT-GENL-DISJOINT-VIOLATIONS", 7, 0, false );
    SubLFiles.declareFunction( me, "mal_inter_arg_formatP", "MAL-INTER-ARG-FORMAT?", 5, 0, false );
    SubLFiles.declareFunction( me, "inter_arg_format_violations", "INTER-ARG-FORMAT-VIOLATIONS", 7, 0, false );
    SubLFiles.declareFunction( me, "some_inter_arg_different_assertion_somewhereP", "SOME-INTER-ARG-DIFFERENT-ASSERTION-SOMEWHERE?", 1, 0, false );
    SubLFiles.declareFunction( me, "some_inter_arg_different_constraint_somewhereP", "SOME-INTER-ARG-DIFFERENT-CONSTRAINT-SOMEWHERE?", 1, 0, false );
    SubLFiles.declareFunction( me, "mal_inter_arg_differentP", "MAL-INTER-ARG-DIFFERENT?", 5, 0, false );
    SubLFiles.declareFunction( me, "inter_arg_different_violations", "INTER-ARG-DIFFERENT-VIOLATIONS", 5, 0, false );
    SubLFiles.declareFunction( me, "clear_arg_collections", "CLEAR-ARG-COLLECTIONS", 0, 0, false );
    new $clear_arg_collections$ZeroArityFunction();
    SubLFiles.declareFunction( me, "remove_arg_collections", "REMOVE-ARG-COLLECTIONS", 4, 0, false );
    SubLFiles.declareFunction( me, "arg_collections_internal", "ARG-COLLECTIONS-INTERNAL", 4, 0, false );
    SubLFiles.declareFunction( me, "arg_collections", "ARG-COLLECTIONS", 4, 0, false );
    SubLFiles.declareFunction( me, "weak_fort_isa_collections", "WEAK-FORT-ISA-COLLECTIONS", 1, 0, false );
    SubLFiles.declareFunction( me, "naut_isa_collections", "NAUT-ISA-COLLECTIONS", 1, 0, false );
    SubLFiles.declareFunction( me, "naut_isa_collections_int", "NAUT-ISA-COLLECTIONS-INT", 2, 0, false );
    SubLFiles.declareFunction( me, "weak_fort_quoted_isa_collections", "WEAK-FORT-QUOTED-ISA-COLLECTIONS", 1, 0, false );
    SubLFiles.declareFunction( me, "naut_quoted_isa_collections", "NAUT-QUOTED-ISA-COLLECTIONS", 1, 0, false );
    SubLFiles.declareFunction( me, "weak_fort_genls_collections", "WEAK-FORT-GENLS-COLLECTIONS", 1, 0, false );
    SubLFiles.declareFunction( me, "naut_genls_collections", "NAUT-GENLS-COLLECTIONS", 1, 0, false );
    SubLFiles.declareFunction( me, "naut_genls_collections_int", "NAUT-GENLS-COLLECTIONS-INT", 2, 0, false );
    SubLFiles.declareFunction( me, "applicable_arg_type_collections", "APPLICABLE-ARG-TYPE-COLLECTIONS", 3, 0, false );
    SubLFiles.declareFunction( me, "applicable_arg_type_collections_int", "APPLICABLE-ARG-TYPE-COLLECTIONS-INT", 5, 0, false );
    SubLFiles.declareFunction( me, "accumulate_applicable_arg_type_collections_general_case", "ACCUMULATE-APPLICABLE-ARG-TYPE-COLLECTIONS-GENERAL-CASE", 4, 0, false );
    SubLFiles.declareFunction( me, "accumulate_applicable_arg_type_collections_single_entry", "ACCUMULATE-APPLICABLE-ARG-TYPE-COLLECTIONS-SINGLE-ENTRY", 4, 0, false );
    SubLFiles.declareFunction( me, "accumulate_applicable_arg_type_collections_arg_isas", "ACCUMULATE-APPLICABLE-ARG-TYPE-COLLECTIONS-ARG-ISAS", 5, 0, false );
    SubLFiles.declareFunction( me, "constraint_pred", "CONSTRAINT-PRED", 3, 0, false );
    SubLFiles.declareFunction( me, "constraint_preds", "CONSTRAINT-PREDS", 3, 0, false );
    SubLFiles.declareFunction( me, "inverse_pred", "INVERSE-PRED", 3, 0, false );
    SubLFiles.declareFunction( me, "gather_ind_arg_relevant_constraints", "GATHER-IND-ARG-RELEVANT-CONSTRAINTS", 2, 0, false );
    SubLFiles.declareFunction( me, "relevant_constraintP", "RELEVANT-CONSTRAINT?", 4, 0, false );
    SubLFiles.declareFunction( me, "relevant_constraints_among", "RELEVANT-CONSTRAINTS-AMONG", 4, 0, false );
    SubLFiles.declareFunction( me, "applicable_inter_arg_type_collections", "APPLICABLE-INTER-ARG-TYPE-COLLECTIONS", 6, 0, false );
    SubLFiles.declareFunction( me, "applicable_inter_arg_type_pred_collections", "APPLICABLE-INTER-ARG-TYPE-PRED-COLLECTIONS", 5, 1, false );
    SubLFiles.declareFunction( me, "applicable_inter_arg_type_pred_collections_int", "APPLICABLE-INTER-ARG-TYPE-PRED-COLLECTIONS-INT", 6, 0, false );
    SubLFiles.declareFunction( me, "applicable_inter_arg_type_pred_collections_int_memoized_internal", "APPLICABLE-INTER-ARG-TYPE-PRED-COLLECTIONS-INT-MEMOIZED-INTERNAL", 8, 0, false );
    SubLFiles.declareFunction( me, "applicable_inter_arg_type_pred_collections_int_memoized", "APPLICABLE-INTER-ARG-TYPE-PRED-COLLECTIONS-INT-MEMOIZED", 8, 0, false );
    SubLFiles.declareFunction( me, "clear_applicable_inter_arg_type_pred_collections_dictionary", "CLEAR-APPLICABLE-INTER-ARG-TYPE-PRED-COLLECTIONS-DICTIONARY", 0, 0, false );
    SubLFiles.declareFunction( me, "remove_applicable_inter_arg_type_pred_collections_dictionary", "REMOVE-APPLICABLE-INTER-ARG-TYPE-PRED-COLLECTIONS-DICTIONARY", 3, 0, false );
    SubLFiles.declareFunction( me, "applicable_inter_arg_type_pred_collections_dictionary_internal", "APPLICABLE-INTER-ARG-TYPE-PRED-COLLECTIONS-DICTIONARY-INTERNAL", 3, 0, false );
    SubLFiles.declareFunction( me, "applicable_inter_arg_type_pred_collections_dictionary", "APPLICABLE-INTER-ARG-TYPE-PRED-COLLECTIONS-DICTIONARY", 3, 0, false );
    SubLFiles.declareFunction( me, "inter_arg_constraint_pred", "INTER-ARG-CONSTRAINT-PRED", 3, 0, false );
    SubLFiles.declareFunction( me, "inter_arg_inverse_pred", "INTER-ARG-INVERSE-PRED", 3, 0, false );
    SubLFiles.declareFunction( me, "note_at_violations", "NOTE-AT-VIOLATIONS", 1, 0, false );
    SubLFiles.declareFunction( me, "inapplicable_arg_type_assertionP", "INAPPLICABLE-ARG-TYPE-ASSERTION?", 1, 0, false );
    return NIL;
  }

  public static SubLObject init_at_routines_file()
  {
    $at_check_quoted_arg_isaP$ = SubLFiles.deflexical( "*AT-CHECK-QUOTED-ARG-ISA?*", T );
    $at_applicable_arg_types$ = SubLFiles.defvar( "*AT-APPLICABLE-ARG-TYPES*", NIL );
    $at_applicable_arg_types_with_assertions$ = SubLFiles.defvar( "*AT-APPLICABLE-ARG-TYPES-WITH-ASSERTIONS*", NIL );
    $arg_collections_caching_state$ = SubLFiles.deflexical( "*ARG-COLLECTIONS-CACHING-STATE*", NIL );
    $ind_arg_relevant_constraints$ = SubLFiles.defvar( "*IND-ARG-RELEVANT-CONSTRAINTS*", NIL );
    $applicable_inter_arg_type_pred_collections_dictionary_caching_state$ = SubLFiles.deflexical( "*APPLICABLE-INTER-ARG-TYPE-PRED-COLLECTIONS-DICTIONARY-CACHING-STATE*", NIL );
    return NIL;
  }

  public static SubLObject setup_at_routines_file()
  {
    memoization_state.note_globally_cached_function( $sym94$ARG_COLLECTIONS );
    memoization_state.note_memoized_function( $sym114$APPLICABLE_INTER_ARG_TYPE_PRED_COLLECTIONS_INT_MEMOIZED );
    memoization_state.note_globally_cached_function( $sym117$APPLICABLE_INTER_ARG_TYPE_PRED_COLLECTIONS_DICTIONARY );
    return NIL;
  }

  @Override
  public void declareFunctions()
  {
    declare_at_routines_file();
  }

  @Override
  public void initializeVariables()
  {
    init_at_routines_file();
  }

  @Override
  public void runTopLevelForms()
  {
    setup_at_routines_file();
  }
  static
  {
    me = new at_routines();
    $at_check_quoted_arg_isaP$ = null;
    $at_applicable_arg_types$ = null;
    $at_applicable_arg_types_with_assertions$ = null;
    $arg_collections_caching_state$ = null;
    $ind_arg_relevant_constraints$ = null;
    $applicable_inter_arg_type_pred_collections_dictionary_caching_state$ = null;
    $sym0$CLET = makeSymbol( "CLET" );
    $list1 = ConsesLow.list( makeSymbol( "*AT-APPLICABLE-ARG-TYPES*" ), ConsesLow.list( makeSymbol( "*AT-APPLICABLE-ARG-TYPES-WITH-ASSERTIONS*" ), ConsesLow.list( makeSymbol( "NEW-DICTIONARY" ), ConsesLow.list(
        makeSymbol( "QUOTE" ), EQUAL ) ) ) );
    $sym2$ALLOW_ESCAPE_QUOTE_WHEN_QUOTE_PREDICATE = makeSymbol( "ALLOW-ESCAPE-QUOTE-WHEN-QUOTE-PREDICATE" );
    $sym3$RELN = makeSymbol( "RELN" );
    $sym4$WITH_SBHL_RESOURCED_MARKING_SPACES = makeSymbol( "WITH-SBHL-RESOURCED-MARKING-SPACES" );
    $const5$Quote = constant_handles.reader_make_constant_shell( makeString( "Quote" ) );
    $kw6$ARG_ISA = makeKeyword( "ARG-ISA" );
    $sym7$VALID_FORT_TYPE_ = makeSymbol( "VALID-FORT-TYPE?" );
    $kw8$MAL_ARG_WRT_COL_DEFN = makeKeyword( "MAL-ARG-WRT-COL-DEFN" );
    $kw9$MAL_ARG_WRT_ARG_ISA = makeKeyword( "MAL-ARG-WRT-ARG-ISA" );
    $list10 = ConsesLow.list( makeSymbol( "CONSTRAINT-RELN" ), makeSymbol( "VIA" ), makeSymbol( "CONSTRAINT-GAF" ) );
    $kw11$SELF = makeKeyword( "SELF" );
    $kw12$AT_CONSTRAINT_GAF = makeKeyword( "AT-CONSTRAINT-GAF" );
    $kw13$WFF_FORMULA = makeKeyword( "WFF-FORMULA" );
    $kw14$WFF_EXPANSION_FORMULA = makeKeyword( "WFF-EXPANSION-FORMULA" );
    $kw15$WFF_ORIGINAL_FORMULA = makeKeyword( "WFF-ORIGINAL-FORMULA" );
    $kw16$MAL_RELN_WRT_ARG_ISA_REQUIRED = makeKeyword( "MAL-RELN-WRT-ARG-ISA-REQUIRED" );
    $kw17$ARG_NOT_ISA = makeKeyword( "ARG-NOT-ISA" );
    $kw18$MAL_ARG_WRT_ARG_NOT_ISA = makeKeyword( "MAL-ARG-WRT-ARG-NOT-ISA" );
    $kw19$MAL_RELN_WRT_ARG_NOT_ISA_REQUIRED = makeKeyword( "MAL-RELN-WRT-ARG-NOT-ISA-REQUIRED" );
    $kw20$ISA = makeKeyword( "ISA" );
    $sym21$FORT_P = makeSymbol( "FORT-P" );
    $kw22$NAUT = makeKeyword( "NAUT" );
    $sym23$VARIABLE_TERM_WRT_ARG_TYPE_ = makeSymbol( "VARIABLE-TERM-WRT-ARG-TYPE?" );
    $kw24$MAL_ARG_WRT_ARG_NOT_ISA_DISJOINT = makeKeyword( "MAL-ARG-WRT-ARG-NOT-ISA-DISJOINT" );
    $kw25$ARG_QUOTED_ISA = makeKeyword( "ARG-QUOTED-ISA" );
    $kw26$MAL_ARG_WRT_COL_QUOTED_DEFN = makeKeyword( "MAL-ARG-WRT-COL-QUOTED-DEFN" );
    $kw27$MAL_ARG_WRT_ARG_QUOTED_ISA = makeKeyword( "MAL-ARG-WRT-ARG-QUOTED-ISA" );
    $kw28$QUOTED_ISA = makeKeyword( "QUOTED-ISA" );
    $const29$termOfUnit = constant_handles.reader_make_constant_shell( makeString( "termOfUnit" ) );
    $const30$CycLReifiableNonAtomicTerm = constant_handles.reader_make_constant_shell( makeString( "CycLReifiableNonAtomicTerm" ) );
    $kw31$MAL_ARG_WRT_ARG_NOT_QUOTED_ISA_DISJOINT = makeKeyword( "MAL-ARG-WRT-ARG-NOT-QUOTED-ISA-DISJOINT" );
    $kw32$ARG_GENLS = makeKeyword( "ARG-GENLS" );
    $const33$Thing = constant_handles.reader_make_constant_shell( makeString( "Thing" ) );
    $kw34$MAL_ARG_WRT_ARG_GENL = makeKeyword( "MAL-ARG-WRT-ARG-GENL" );
    $kw35$GENLS = makeKeyword( "GENLS" );
    $kw36$MAL_ARG_WRT_ARG_NOT_GENLS_DISJOINT = makeKeyword( "MAL-ARG-WRT-ARG-NOT-GENLS-DISJOINT" );
    $const37$equals = constant_handles.reader_make_constant_shell( makeString( "equals" ) );
    $kw38$FORMAT = makeKeyword( "FORMAT" );
    $kw39$MAL_ARG_WRT_ARG_FORMAT = makeKeyword( "MAL-ARG-WRT-ARG-FORMAT" );
    $kw40$INTER_ARG_ISA = makeKeyword( "INTER-ARG-ISA" );
    $list41 = ConsesLow.list( makeSymbol( "IND-ARG-ISA" ), makeSymbol( "DEP-ARG-ISA" ) );
    $kw42$MAL_ARG_WRT_INTER_ARG_DEFN = makeKeyword( "MAL-ARG-WRT-INTER-ARG-DEFN" );
    $kw43$MAL_ARG_WRT_INTER_ARG_ISA = makeKeyword( "MAL-ARG-WRT-INTER-ARG-ISA" );
    $list44 = ConsesLow.list( makeSymbol( "CONSTRAINT-RELN" ), makeSymbol( "VIA" ) );
    $const45$interArgGenl1_2 = constant_handles.reader_make_constant_shell( makeString( "interArgGenl1-2" ) );
    $const46$interArgGenl2_1 = constant_handles.reader_make_constant_shell( makeString( "interArgGenl2-1" ) );
    $const47$interArgGenl2_4 = constant_handles.reader_make_constant_shell( makeString( "interArgGenl2-4" ) );
    $const48$genlPreds = constant_handles.reader_make_constant_shell( makeString( "genlPreds" ) );
    $kw49$DEPTH = makeKeyword( "DEPTH" );
    $kw50$STACK = makeKeyword( "STACK" );
    $kw51$QUEUE = makeKeyword( "QUEUE" );
    $sym52$RELEVANT_SBHL_TV_IS_GENERAL_TV = makeSymbol( "RELEVANT-SBHL-TV-IS-GENERAL-TV" );
    $kw53$ERROR = makeKeyword( "ERROR" );
    $str54$_A_is_not_a__A = makeString( "~A is not a ~A" );
    $sym55$SBHL_TRUE_TV_P = makeSymbol( "SBHL-TRUE-TV-P" );
    $kw56$CERROR = makeKeyword( "CERROR" );
    $str57$continue_anyway = makeString( "continue anyway" );
    $kw58$WARN = makeKeyword( "WARN" );
    $str59$_A_is_not_a_valid__sbhl_type_erro = makeString( "~A is not a valid *sbhl-type-error-action* value" );
    $str60$_A_is_neither_SET_P_nor_LISTP_ = makeString( "~A is neither SET-P nor LISTP." );
    $str61$attempting_to_bind_direction_link = makeString( "attempting to bind direction link variable, to NIL. macro body not executed." );
    $str62$Node__a_does_not_pass_sbhl_type_t = makeString( "Node ~a does not pass sbhl-type-test ~a~%" );
    $kw63$INTER_ARG_GENL = makeKeyword( "INTER-ARG-GENL" );
    $list64 = ConsesLow.list( makeSymbol( "IND-ARG-GENL" ), makeSymbol( "DEP-ARG-GENL" ) );
    $kw65$MAL_ARG_WRT_INTER_ARG_GENL = makeKeyword( "MAL-ARG-WRT-INTER-ARG-GENL" );
    $kw66$INTER_ARG_NOT_ISA = makeKeyword( "INTER-ARG-NOT-ISA" );
    $kw67$MAL_ARG_WRT_INTER_ARG_NOT_ISA = makeKeyword( "MAL-ARG-WRT-INTER-ARG-NOT-ISA" );
    $kw68$MAL_ARG_WRT_INTER_ARG_NOT_DEFN = makeKeyword( "MAL-ARG-WRT-INTER-ARG-NOT-DEFN" );
    $const69$interArgNotIsa1_2 = constant_handles.reader_make_constant_shell( makeString( "interArgNotIsa1-2" ) );
    $const70$interArgNotIsa2_1 = constant_handles.reader_make_constant_shell( makeString( "interArgNotIsa2-1" ) );
    $kw71$INTER_ARG_NOT_GENL = makeKeyword( "INTER-ARG-NOT-GENL" );
    $kw72$MAL_ARG_WRT_INTER_ARG_NOT_GENL = makeKeyword( "MAL-ARG-WRT-INTER-ARG-NOT-GENL" );
    $const73$interArgNotGenl1_2 = constant_handles.reader_make_constant_shell( makeString( "interArgNotGenl1-2" ) );
    $kw74$INTER_ARG_GENL_ISA = makeKeyword( "INTER-ARG-GENL-ISA" );
    $list75 = ConsesLow.list( makeSymbol( "IND-ARG-GENL" ), makeSymbol( "DEP-ARG-ISA" ) );
    $kw76$MAL_ARG_WRT_INTER_ARG_GENL_ISA = makeKeyword( "MAL-ARG-WRT-INTER-ARG-GENL-ISA" );
    $const77$interArgGenlIsa2_1 = constant_handles.reader_make_constant_shell( makeString( "interArgGenlIsa2-1" ) );
    $kw78$INTER_ARG_ISA_GENL = makeKeyword( "INTER-ARG-ISA-GENL" );
    $list79 = ConsesLow.list( makeSymbol( "IND-ARG-ISA" ), makeSymbol( "DEP-ARG-GENL" ) );
    $kw80$MAL_ARG_WRT_INTER_ARG_ISA_GENL = makeKeyword( "MAL-ARG-WRT-INTER-ARG-ISA-GENL" );
    $const81$interArgIsaGenl1_2 = constant_handles.reader_make_constant_shell( makeString( "interArgIsaGenl1-2" ) );
    $const82$interArgIsaGenl2_1 = constant_handles.reader_make_constant_shell( makeString( "interArgIsaGenl2-1" ) );
    $const83$interArgIsaGenl2_3 = constant_handles.reader_make_constant_shell( makeString( "interArgIsaGenl2-3" ) );
    $const84$interArgIsaGenl3_2 = constant_handles.reader_make_constant_shell( makeString( "interArgIsaGenl3-2" ) );
    $kw85$MAL_ARG_WRT_INTER_ARG_NOT_ISA_DISJOINT = makeKeyword( "MAL-ARG-WRT-INTER-ARG-NOT-ISA-DISJOINT" );
    $kw86$MAL_ARG_WRT_INTER_ARG_NOT_GENL_DISJOINT = makeKeyword( "MAL-ARG-WRT-INTER-ARG-NOT-GENL-DISJOINT" );
    $kw87$INTER_ARG_FORMAT = makeKeyword( "INTER-ARG-FORMAT" );
    $list88 = ConsesLow.list( makeSymbol( "IND-ARG-ISA" ), makeSymbol( "DEP-ARG-FORMAT" ) );
    $kw89$MAL_ARG_WRT_INTER_ARG_FORMAT = makeKeyword( "MAL-ARG-WRT-INTER-ARG-FORMAT" );
    $const90$interArgDifferent = constant_handles.reader_make_constant_shell( makeString( "interArgDifferent" ) );
    $kw91$INTER_ARG_DIFFERENT = makeKeyword( "INTER-ARG-DIFFERENT" );
    $list92 = ConsesLow.list( makeSymbol( "ARGNUM1" ), makeSymbol( "ARGNUM2" ) );
    $kw93$MAL_ARG_WRT_INTER_ARG_DIFFERENT = makeKeyword( "MAL-ARG-WRT-INTER-ARG-DIFFERENT" );
    $sym94$ARG_COLLECTIONS = makeSymbol( "ARG-COLLECTIONS" );
    $kw95$STRONG_FORT = makeKeyword( "STRONG-FORT" );
    $kw96$WEAK_FORT = makeKeyword( "WEAK-FORT" );
    $sym97$_ARG_COLLECTIONS_CACHING_STATE_ = makeSymbol( "*ARG-COLLECTIONS-CACHING-STATE*" );
    $int98$4096 = makeInteger( 4096 );
    $sym99$CLEAR_ARG_COLLECTIONS = makeSymbol( "CLEAR-ARG-COLLECTIONS" );
    $sym100$CYC_VAR_ = makeSymbol( "CYC-VAR?" );
    $kw101$VIA_GENL_PRED = makeKeyword( "VIA-GENL-PRED" );
    $kw102$VIA_GENL_INVERSE = makeKeyword( "VIA-GENL-INVERSE" );
    $kw103$GAF = makeKeyword( "GAF" );
    $kw104$TRUE = makeKeyword( "TRUE" );
    $const105$SingleEntry = constant_handles.reader_make_constant_shell( makeString( "SingleEntry" ) );
    $sym106$KBEQ = makeSymbol( "KBEQ" );
    $const107$singleEntryFormatInArgs = constant_handles.reader_make_constant_shell( makeString( "singleEntryFormatInArgs" ) );
    $const108$argsIsa = constant_handles.reader_make_constant_shell( makeString( "argsIsa" ) );
    $const109$argAndRestIsa = constant_handles.reader_make_constant_shell( makeString( "argAndRestIsa" ) );
    $str110$Unknown_constraint_type__s = makeString( "Unknown constraint-type ~s" );
    $kw111$FORT = makeKeyword( "FORT" );
    $kw112$NON_FORT = makeKeyword( "NON-FORT" );
    $list113 = ConsesLow.list( makeSymbol( "INTER-ARG-TYPE" ), makeSymbol( "RELN" ), makeSymbol( "VIA" ) );
    $sym114$APPLICABLE_INTER_ARG_TYPE_PRED_COLLECTIONS_INT_MEMOIZED = makeSymbol( "APPLICABLE-INTER-ARG-TYPE-PRED-COLLECTIONS-INT-MEMOIZED" );
    $sym115$_EXIT = makeSymbol( "%EXIT" );
    $int116$512 = makeInteger( 512 );
    $sym117$APPLICABLE_INTER_ARG_TYPE_PRED_COLLECTIONS_DICTIONARY = makeSymbol( "APPLICABLE-INTER-ARG-TYPE-PRED-COLLECTIONS-DICTIONARY" );
    $sym118$_APPLICABLE_INTER_ARG_TYPE_PRED_COLLECTIONS_DICTIONARY_CACHING_ST = makeSymbol( "*APPLICABLE-INTER-ARG-TYPE-PRED-COLLECTIONS-DICTIONARY-CACHING-STATE*" );
    $int119$128 = makeInteger( 128 );
    $sym120$CLEAR_APPLICABLE_INTER_ARG_TYPE_PRED_COLLECTIONS_DICTIONARY = makeSymbol( "CLEAR-APPLICABLE-INTER-ARG-TYPE-PRED-COLLECTIONS-DICTIONARY" );
    $const121$wffConstraintMt = constant_handles.reader_make_constant_shell( makeString( "wffConstraintMt" ) );
  }

  public static final class $clear_arg_collections$ZeroArityFunction
      extends
        ZeroArityFunction
  {
    public $clear_arg_collections$ZeroArityFunction()
    {
      super( SubLTranslatedFile.extractFunctionNamed( "CLEAR-ARG-COLLECTIONS" ) );
    }

    @Override
    public SubLObject processItem()
    {
      return clear_arg_collections();
    }
  }
}
/*
 * 
 * Total time: 2255 ms
 * 
 */