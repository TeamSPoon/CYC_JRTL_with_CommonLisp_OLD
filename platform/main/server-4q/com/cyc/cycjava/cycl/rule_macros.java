package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Mapping;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class rule_macros
    extends
      SubLTranslatedFile
{
  public static final SubLFile me;
  public static final String myName = "com.cyc.cycjava.cycl.rule_macros";
  public static final String myFingerPrint = "e28f1b417a3ed09648b28ee6e5dbc461ac1fa06d5d344fbc03fd3ff70b1429aa";
  private static final SubLSymbol $sym0$CANONICALIZE_CLAUSE_WRT_RULE_MACROS;
  private static final SubLSymbol $sym1$EL_VAR_;
  private static final SubLList $list2;
  private static final SubLList $list3;
  private static final SubLObject $const4$requiredArg1Pred;
  private static final SubLObject $const5$requiredArg2Pred;
  private static final SubLString $str6$invalid_required_arg_pred_index__;
  private static final SubLList $list7;
  private static final SubLList $list8;
  private static final SubLObject $const9$relationAllExists;
  private static final SubLObject $const10$relationAllExistsMin;
  private static final SubLObject $const11$relationAllExistsMax;
  private static final SubLObject $const12$relationAllExistsCount;
  private static final SubLObject $const13$relationExistsAll;
  private static final SubLObject $const14$relationExistsMinAll;
  private static final SubLObject $const15$relationExistsMaxAll;
  private static final SubLObject $const16$relationExistsCountAll;
  private static final SubLString $str17$invalid_relation_type_index___s;
  private static final SubLString $str18$invalid_relation_type_rule_macro_;
  private static final SubLObject $const19$genls;
  private static final SubLObject $const20$genlPreds;
  private static final SubLObject $const21$genlInverse;
  private static final SubLList $list22;
  private static final SubLList $list23;
  private static final SubLObject $const24$disjointWith;
  private static final SubLObject $const25$negationPreds;
  private static final SubLObject $const26$negationInverse;
  private static final SubLObject $const27$arg1Isa;
  private static final SubLObject $const28$arg2Isa;
  private static final SubLObject $const29$isa;
  private static final SubLObject $const30$ReflexiveBinaryPredicate;
  private static final SubLObject $const31$IrreflexiveBinaryPredicate;
  private static final SubLObject $const32$TransitiveBinaryPredicate;
  private static final SubLObject $const33$SymmetricBinaryPredicate;
  private static final SubLObject $const34$AsymmetricBinaryPredicate;

  @SubLTranslatedFile.SubL(source = "cycl/rule-macros.lisp", position = 1149L)
  public static SubLObject canonicalize_clauses_wrt_rule_macros(final SubLObject v_clauses)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL == czer_vars.$express_as_rule_macroP$.getDynamicValue( thread ) )
    {
      return v_clauses;
    }
    if( NIL != required_arg_pred_clausesP( v_clauses, UNPROVIDED ) )
    {
      return express_as_required_arg_pred( v_clauses );
    }
    if( NIL != relation_type_clausesP( v_clauses, UNPROVIDED ) )
    {
      return express_as_relation_type( v_clauses );
    }
    return Mapping.mapcar( $sym0$CANONICALIZE_CLAUSE_WRT_RULE_MACROS, v_clauses );
  }

  @SubLTranslatedFile.SubL(source = "cycl/rule-macros.lisp", position = 3919L)
  public static SubLObject required_arg_pred_clausesP(final SubLObject v_clauses, SubLObject varP)
  {
    if( varP == UNPROVIDED )
    {
      varP = Symbols.symbol_function( $sym1$EL_VAR_ );
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL != czer_vars.$express_as_required_arg_predP$.getDynamicValue( thread ) && NIL != list_utilities.singletonP( v_clauses ) )
    {
      SubLObject current;
      final SubLObject datum = current = v_clauses.first();
      SubLObject neg_lits = NIL;
      SubLObject pos_lits = NIL;
      cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list2 );
      neg_lits = current.first();
      current = current.rest();
      cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list2 );
      pos_lits = current.first();
      current = current.rest();
      if( NIL == current )
      {
        if( NIL != list_utilities.singletonP( neg_lits ) && NIL != list_utilities.singletonP( pos_lits ) )
        {
          final SubLObject neg_lit = neg_lits.first();
          if( NIL != el_utilities.isa_litP( neg_lit ) )
          {
            final SubLObject var = el_utilities.literal_arg1( neg_lit, UNPROVIDED );
            final SubLObject col = el_utilities.literal_arg2( neg_lit, UNPROVIDED );
            if( NIL != Functions.funcall( varP, var ) && NIL != fort_types_interface.collectionP( col ) )
            {
              final SubLObject pos_lit = pos_lits.first();
              final SubLObject args = el_utilities.literal_args( pos_lit, UNPROVIDED );
              final SubLObject pred = el_utilities.literal_arg0( pos_lit, UNPROVIDED );
              final SubLObject psn = Sequences.position( var, pos_lit, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
              if( NIL != fort_types_interface.predicateP( pred ) && NIL != list_utilities.occurs_onceP( var, args, UNPROVIDED ) && NIL != required_arg_pred( psn ) )
              {
                SubLObject non_skolemP = NIL;
                if( NIL == non_skolemP )
                {
                  SubLObject csome_list_var;
                  SubLObject arg;
                  for( csome_list_var = args, arg = NIL, arg = csome_list_var.first(); NIL == non_skolemP && NIL != csome_list_var; non_skolemP = makeBoolean( !arg.eql( var ) && NIL == term.unreified_skolem_termP(
                      arg ) ), csome_list_var = csome_list_var.rest(), arg = csome_list_var.first() )
                  {
                  }
                }
                return makeBoolean( NIL == non_skolemP );
              }
            }
          }
        }
      }
      else
      {
        cdestructuring_bind.cdestructuring_bind_error( datum, $list2 );
      }
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/rule-macros.lisp", position = 5551L)
  public static SubLObject express_as_required_arg_pred(final SubLObject v_clauses)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL != czer_vars.$express_as_required_arg_predP$.getDynamicValue( thread ) )
    {
      cdestructuring_bind.destructuring_bind_must_consp( v_clauses, v_clauses, $list3 );
      final SubLObject temp = v_clauses.rest();
      SubLObject current = v_clauses.first();
      cdestructuring_bind.destructuring_bind_must_consp( current, v_clauses, $list3 );
      final SubLObject temp_$1 = current.rest();
      current = current.first();
      cdestructuring_bind.destructuring_bind_must_consp( current, v_clauses, $list3 );
      final SubLObject temp_$2 = current.rest();
      current = current.first();
      SubLObject v_isa = NIL;
      SubLObject var = NIL;
      SubLObject col = NIL;
      cdestructuring_bind.destructuring_bind_must_consp( current, v_clauses, $list3 );
      v_isa = current.first();
      current = current.rest();
      cdestructuring_bind.destructuring_bind_must_consp( current, v_clauses, $list3 );
      var = current.first();
      current = current.rest();
      cdestructuring_bind.destructuring_bind_must_consp( current, v_clauses, $list3 );
      col = current.first();
      current = current.rest();
      if( NIL == current )
      {
        current = temp_$2;
        if( NIL == current )
        {
          current = temp_$1;
          cdestructuring_bind.destructuring_bind_must_consp( current, v_clauses, $list3 );
          final SubLObject temp_$3 = current.rest();
          current = current.first();
          SubLObject pos_lit = NIL;
          cdestructuring_bind.destructuring_bind_must_consp( current, v_clauses, $list3 );
          pos_lit = current.first();
          current = current.rest();
          if( NIL == current )
          {
            current = temp_$3;
            if( NIL == current )
            {
              current = temp;
              if( NIL == current )
              {
                final SubLObject pred = el_utilities.literal_arg0( pos_lit, UNPROVIDED );
                final SubLObject rm_pred = required_arg_pred( Sequences.position( var, pos_lit, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED ) );
                return ConsesLow.list( make_rm_cnf( el_utilities.make_binary_formula( rm_pred, col, pred ), UNPROVIDED ) );
              }
              cdestructuring_bind.cdestructuring_bind_error( v_clauses, $list3 );
            }
            else
            {
              cdestructuring_bind.cdestructuring_bind_error( v_clauses, $list3 );
            }
          }
          else
          {
            cdestructuring_bind.cdestructuring_bind_error( v_clauses, $list3 );
          }
        }
        else
        {
          cdestructuring_bind.cdestructuring_bind_error( v_clauses, $list3 );
        }
      }
      else
      {
        cdestructuring_bind.cdestructuring_bind_error( v_clauses, $list3 );
      }
      return NIL;
    }
    return v_clauses;
  }

  @SubLTranslatedFile.SubL(source = "cycl/rule-macros.lisp", position = 6253L)
  public static SubLObject required_arg_pred(final SubLObject arg)
  {
    if( arg.eql( ONE_INTEGER ) )
    {
      return $const4$requiredArg1Pred;
    }
    if( arg.eql( TWO_INTEGER ) )
    {
      return $const5$requiredArg2Pred;
    }
    el_utilities.el_error( THREE_INTEGER, $str6$invalid_required_arg_pred_index__, arg, UNPROVIDED, UNPROVIDED );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/rule-macros.lisp", position = 6450L)
  public static SubLObject relation_type_clausesP(final SubLObject v_clauses, SubLObject varP)
  {
    if( varP == UNPROVIDED )
    {
      varP = Symbols.symbol_function( $sym1$EL_VAR_ );
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL != czer_vars.$express_as_relation_typeP$.getDynamicValue( thread ) && NIL != list_utilities.doubletonP( v_clauses ) )
    {
      cdestructuring_bind.destructuring_bind_must_consp( v_clauses, v_clauses, $list7 );
      final SubLObject temp = v_clauses.rest();
      SubLObject current = v_clauses.first();
      SubLObject neg_lits_1 = NIL;
      SubLObject pos_lits_1 = NIL;
      cdestructuring_bind.destructuring_bind_must_consp( current, v_clauses, $list7 );
      neg_lits_1 = current.first();
      current = current.rest();
      cdestructuring_bind.destructuring_bind_must_consp( current, v_clauses, $list7 );
      pos_lits_1 = current.first();
      current = current.rest();
      if( NIL == current )
      {
        current = temp;
        cdestructuring_bind.destructuring_bind_must_consp( current, v_clauses, $list7 );
        final SubLObject temp_$4 = current.rest();
        current = current.first();
        SubLObject neg_lits_2 = NIL;
        SubLObject pos_lits_2 = NIL;
        cdestructuring_bind.destructuring_bind_must_consp( current, v_clauses, $list7 );
        neg_lits_2 = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp( current, v_clauses, $list7 );
        pos_lits_2 = current.first();
        current = current.rest();
        if( NIL == current )
        {
          current = temp_$4;
          if( NIL == current )
          {
            if( NIL != list_utilities.singletonP( neg_lits_1 ) && NIL != list_utilities.singletonP( pos_lits_1 ) && NIL != list_utilities.singletonP( neg_lits_2 ) && NIL != list_utilities.singletonP( pos_lits_2 ) )
            {
              final SubLObject neg_lit_1 = neg_lits_1.first();
              final SubLObject neg_lit_2 = neg_lits_2.first();
              if( NIL != el_utilities.isa_litP( neg_lit_1 ) && neg_lit_1.equal( neg_lit_2 ) )
              {
                final SubLObject var = el_utilities.literal_arg1( neg_lit_1, UNPROVIDED );
                final SubLObject col = el_utilities.literal_arg2( neg_lit_1, UNPROVIDED );
                if( NIL != Functions.funcall( varP, var ) && NIL != fort_types_interface.collectionP( col ) )
                {
                  final SubLObject pos_lit_1 = pos_lits_1.first();
                  final SubLObject pos_lit_2 = pos_lits_2.first();
                  SubLObject isa_lit = NIL;
                  SubLObject rel_lit = NIL;
                  if( NIL != el_utilities.isa_litP( pos_lit_1 ) )
                  {
                    isa_lit = pos_lit_1;
                    rel_lit = pos_lit_2;
                  }
                  else if( NIL != el_utilities.isa_litP( pos_lit_2 ) )
                  {
                    isa_lit = pos_lit_2;
                    rel_lit = pos_lit_1;
                  }
                  if( NIL != isa_lit && NIL != el_utilities.binary_lit_p( rel_lit ) )
                  {
                    final SubLObject skolem = el_utilities.literal_arg1( isa_lit, UNPROVIDED );
                    final SubLObject type = el_utilities.literal_arg2( isa_lit, UNPROVIDED );
                    final SubLObject pred = el_utilities.literal_arg0( rel_lit, UNPROVIDED );
                    final SubLObject args = el_utilities.literal_args( rel_lit, UNPROVIDED );
                    final SubLObject psn = Sequences.position( var, rel_lit, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
                    if( NIL != term.unreified_skolem_termP( skolem ) && NIL != fort_types_interface.collectionP( type ) && NIL != fort_types_interface.predicateP( pred ) && NIL != list_utilities.occurs_onceP( skolem,
                        args, Symbols.symbol_function( EQUAL ) ) && NIL != relation_type_pred( psn, skolems.skolem_number( skolem ) ) )
                    {
                      SubLObject non_skolemP = NIL;
                      if( NIL == non_skolemP )
                      {
                        SubLObject csome_list_var;
                        SubLObject arg;
                        for( csome_list_var = args, arg = NIL, arg = csome_list_var.first(); NIL == non_skolemP && NIL != csome_list_var; non_skolemP = makeBoolean( !arg.eql( var ) && !arg.equal(
                            skolem ) ), csome_list_var = csome_list_var.rest(), arg = csome_list_var.first() )
                        {
                        }
                      }
                      return makeBoolean( NIL == non_skolemP );
                    }
                  }
                }
              }
            }
          }
          else
          {
            cdestructuring_bind.cdestructuring_bind_error( v_clauses, $list7 );
          }
        }
        else
        {
          cdestructuring_bind.cdestructuring_bind_error( v_clauses, $list7 );
        }
      }
      else
      {
        cdestructuring_bind.cdestructuring_bind_error( v_clauses, $list7 );
      }
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/rule-macros.lisp", position = 9707L)
  public static SubLObject express_as_relation_type(final SubLObject v_clauses)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL != czer_vars.$express_as_relation_typeP$.getDynamicValue( thread ) )
    {
      cdestructuring_bind.destructuring_bind_must_consp( v_clauses, v_clauses, $list8 );
      final SubLObject temp = v_clauses.rest();
      SubLObject current = v_clauses.first();
      cdestructuring_bind.destructuring_bind_must_consp( current, v_clauses, $list8 );
      final SubLObject temp_$5 = current.rest();
      current = current.first();
      cdestructuring_bind.destructuring_bind_must_consp( current, v_clauses, $list8 );
      final SubLObject temp_$6 = current.rest();
      current = current.first();
      SubLObject v_isa = NIL;
      SubLObject var = NIL;
      SubLObject col = NIL;
      cdestructuring_bind.destructuring_bind_must_consp( current, v_clauses, $list8 );
      v_isa = current.first();
      current = current.rest();
      cdestructuring_bind.destructuring_bind_must_consp( current, v_clauses, $list8 );
      var = current.first();
      current = current.rest();
      cdestructuring_bind.destructuring_bind_must_consp( current, v_clauses, $list8 );
      col = current.first();
      current = current.rest();
      if( NIL == current )
      {
        current = temp_$6;
        if( NIL == current )
        {
          current = temp_$5;
          cdestructuring_bind.destructuring_bind_must_consp( current, v_clauses, $list8 );
          final SubLObject temp_$7 = current.rest();
          current = current.first();
          SubLObject pos_lit_1 = NIL;
          cdestructuring_bind.destructuring_bind_must_consp( current, v_clauses, $list8 );
          pos_lit_1 = current.first();
          current = current.rest();
          if( NIL == current )
          {
            current = temp_$7;
            if( NIL == current )
            {
              current = temp;
              cdestructuring_bind.destructuring_bind_must_consp( current, v_clauses, $list8 );
              final SubLObject temp_$8 = current.rest();
              current = current.first();
              cdestructuring_bind.destructuring_bind_must_consp( current, v_clauses, $list8 );
              final SubLObject temp_$9 = current.rest();
              current = current.first();
              SubLObject neg_lit_2 = NIL;
              cdestructuring_bind.destructuring_bind_must_consp( current, v_clauses, $list8 );
              neg_lit_2 = current.first();
              current = current.rest();
              if( NIL == current )
              {
                current = temp_$9;
                cdestructuring_bind.destructuring_bind_must_consp( current, v_clauses, $list8 );
                final SubLObject temp_$10 = current.rest();
                current = current.first();
                SubLObject pos_lit_2 = NIL;
                cdestructuring_bind.destructuring_bind_must_consp( current, v_clauses, $list8 );
                pos_lit_2 = current.first();
                current = current.rest();
                if( NIL == current )
                {
                  current = temp_$10;
                  if( NIL == current )
                  {
                    current = temp_$8;
                    if( NIL == current )
                    {
                      SubLObject isa_lit = NIL;
                      SubLObject rel_lit = NIL;
                      if( NIL != el_utilities.isa_litP( pos_lit_1 ) )
                      {
                        isa_lit = pos_lit_1;
                        rel_lit = pos_lit_2;
                      }
                      else if( NIL != el_utilities.isa_litP( pos_lit_2 ) )
                      {
                        isa_lit = pos_lit_2;
                        rel_lit = pos_lit_1;
                      }
                      final SubLObject type = el_utilities.literal_arg2( isa_lit, UNPROVIDED );
                      final SubLObject pred = el_utilities.literal_arg0( rel_lit, UNPROVIDED );
                      final SubLObject psn = Sequences.position( var, rel_lit, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
                      final SubLObject number = skolems.skolem_number( el_utilities.literal_arg1( isa_lit, UNPROVIDED ) );
                      final SubLObject rm_pred = relation_type_pred( psn, number );
                      return ConsesLow.list( make_rm_cnf( relation_type_gaf( rm_pred, pred, col, type, number ), UNPROVIDED ) );
                    }
                    cdestructuring_bind.cdestructuring_bind_error( v_clauses, $list8 );
                  }
                  else
                  {
                    cdestructuring_bind.cdestructuring_bind_error( v_clauses, $list8 );
                  }
                }
                else
                {
                  cdestructuring_bind.cdestructuring_bind_error( v_clauses, $list8 );
                }
              }
              else
              {
                cdestructuring_bind.cdestructuring_bind_error( v_clauses, $list8 );
              }
            }
            else
            {
              cdestructuring_bind.cdestructuring_bind_error( v_clauses, $list8 );
            }
          }
          else
          {
            cdestructuring_bind.cdestructuring_bind_error( v_clauses, $list8 );
          }
        }
        else
        {
          cdestructuring_bind.cdestructuring_bind_error( v_clauses, $list8 );
        }
      }
      else
      {
        cdestructuring_bind.cdestructuring_bind_error( v_clauses, $list8 );
      }
      return NIL;
    }
    return v_clauses;
  }

  @SubLTranslatedFile.SubL(source = "cycl/rule-macros.lisp", position = 10629L)
  public static SubLObject relation_type_pred(final SubLObject argnum, SubLObject number)
  {
    if( number == UNPROVIDED )
    {
      number = NIL;
    }
    if( argnum.eql( ONE_INTEGER ) )
    {
      if( NIL == number )
      {
        return $const9$relationAllExists;
      }
      if( NIL != kb_control_vars.quant_kb_loaded_p() && NIL != el_math_utilities.el_minP( number ) )
      {
        return $const10$relationAllExistsMin;
      }
      if( NIL != kb_control_vars.quant_kb_loaded_p() && NIL != el_math_utilities.el_maxP( number ) )
      {
        return $const11$relationAllExistsMax;
      }
      return $const12$relationAllExistsCount;
    }
    else
    {
      if( !argnum.eql( TWO_INTEGER ) )
      {
        el_utilities.el_error( THREE_INTEGER, $str17$invalid_relation_type_index___s, argnum, UNPROVIDED, UNPROVIDED );
        return NIL;
      }
      if( NIL == number )
      {
        return $const13$relationExistsAll;
      }
      if( NIL != kb_control_vars.quant_kb_loaded_p() && NIL != el_math_utilities.el_minP( number ) )
      {
        return $const14$relationExistsMinAll;
      }
      if( NIL != kb_control_vars.quant_kb_loaded_p() && NIL != el_math_utilities.el_maxP( number ) )
      {
        return $const15$relationExistsMaxAll;
      }
      return $const16$relationExistsCountAll;
    }
  }

  @SubLTranslatedFile.SubL(source = "cycl/rule-macros.lisp", position = 11487L)
  public static SubLObject relation_type_gaf(final SubLObject rm_pred, final SubLObject pred, final SubLObject col, final SubLObject type, SubLObject number)
  {
    if( number == UNPROVIDED )
    {
      number = NIL;
    }
    if( rm_pred.eql( $const9$relationAllExists ) )
    {
      return el_utilities.make_ternary_formula( rm_pred, pred, col, type );
    }
    if( rm_pred.eql( $const12$relationAllExistsCount ) )
    {
      return el_utilities.make_quaternary_formula( rm_pred, pred, col, type, number );
    }
    if( NIL != kb_control_vars.quant_kb_loaded_p() && rm_pred.eql( $const10$relationAllExistsMin ) )
    {
      return el_utilities.make_quaternary_formula( rm_pred, pred, col, type, el_math_utilities.el_min( number ) );
    }
    if( NIL != kb_control_vars.quant_kb_loaded_p() && rm_pred.eql( $const11$relationAllExistsMax ) )
    {
      return el_utilities.make_quaternary_formula( rm_pred, pred, col, type, el_math_utilities.el_max( number ) );
    }
    if( rm_pred.eql( $const13$relationExistsAll ) )
    {
      return el_utilities.make_ternary_formula( rm_pred, pred, type, col );
    }
    if( rm_pred.eql( $const16$relationExistsCountAll ) )
    {
      return el_utilities.make_quaternary_formula( rm_pred, pred, type, col, number );
    }
    if( NIL != kb_control_vars.quant_kb_loaded_p() && rm_pred.eql( $const14$relationExistsMinAll ) )
    {
      return el_utilities.make_quaternary_formula( rm_pred, pred, type, col, el_math_utilities.el_min( number ) );
    }
    if( NIL != kb_control_vars.quant_kb_loaded_p() && rm_pred.eql( $const15$relationExistsMaxAll ) )
    {
      return el_utilities.make_quaternary_formula( rm_pred, pred, type, col, el_math_utilities.el_max( number ) );
    }
    el_utilities.el_error( THREE_INTEGER, $str18$invalid_relation_type_rule_macro_, rm_pred, UNPROVIDED, UNPROVIDED );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/rule-macros.lisp", position = 13056L)
  public static SubLObject canonicalize_clause_wrt_rule_macros(final SubLObject clause)
  {
    if( NIL != genls_clauseP( clause, UNPROVIDED ) )
    {
      return express_as_genls( clause );
    }
    if( NIL != genl_predicates_clauseP( clause, UNPROVIDED ) )
    {
      return express_as_genl_predicates( clause );
    }
    if( NIL != genl_inverse_clauseP( clause, UNPROVIDED ) )
    {
      return express_as_genl_inverse( clause );
    }
    if( NIL != arg_isa_clauseP( clause, UNPROVIDED ) )
    {
      return express_as_arg_isa( clause );
    }
    if( NIL != inter_arg_isa_clauseP( clause, UNPROVIDED ) )
    {
      return express_as_inter_arg_isa( clause );
    }
    if( NIL != arg_genl_clauseP( clause, UNPROVIDED ) )
    {
      return express_as_arg_genl( clause );
    }
    if( NIL != disjoint_with_clauseP( clause, UNPROVIDED ) )
    {
      return express_as_disjoint_with( clause );
    }
    if( NIL != negation_preds_clauseP( clause, UNPROVIDED ) )
    {
      return express_as_negation_preds( clause );
    }
    if( NIL != negation_inverse_clauseP( clause, UNPROVIDED ) )
    {
      return express_as_negation_inverse( clause );
    }
    if( NIL != reflexive_predicate_clauseP( clause, UNPROVIDED ) )
    {
      return express_as_reflexive_predicate( clause );
    }
    if( NIL != irreflexive_predicate_clauseP( clause, UNPROVIDED ) )
    {
      return express_as_irreflexive_predicate( clause );
    }
    if( NIL != transitive_predicate_clauseP( clause, UNPROVIDED ) )
    {
      return express_as_transitive_predicate( clause );
    }
    if( NIL != symmetric_predicate_clauseP( clause, UNPROVIDED ) )
    {
      return express_as_symmetric_predicate( clause );
    }
    if( NIL != asymmetric_predicate_clauseP( clause, UNPROVIDED ) )
    {
      return express_as_asymmetric_predicate( clause );
    }
    return clause;
  }

  @SubLTranslatedFile.SubL(source = "cycl/rule-macros.lisp", position = 14729L)
  public static SubLObject genls_clauseP(final SubLObject clause, SubLObject varP)
  {
    if( varP == UNPROVIDED )
    {
      varP = Symbols.symbol_function( $sym1$EL_VAR_ );
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL != czer_vars.$express_as_genlsP$.getDynamicValue( thread ) )
    {
      final SubLObject neg_lits = clauses.neg_lits( clause );
      final SubLObject pos_lits = clauses.pos_lits( clause );
      if( NIL != list_utilities.singletonP( neg_lits ) && NIL != list_utilities.singletonP( pos_lits ) )
      {
        final SubLObject neg_lit = neg_lits.first();
        final SubLObject pos_lit = pos_lits.first();
        final SubLObject var = el_utilities.literal_arg1( neg_lit, UNPROVIDED );
        return makeBoolean( NIL != el_utilities.isa_litP( neg_lit ) && NIL != el_utilities.isa_litP( pos_lit ) && NIL != Functions.funcall( varP, var ) && var.eql( el_utilities.literal_arg1( pos_lit, UNPROVIDED ) )
            && NIL != fort_types_interface.collectionP( el_utilities.literal_arg2( neg_lit, UNPROVIDED ) ) && NIL != fort_types_interface.collectionP( el_utilities.literal_arg2( pos_lit, UNPROVIDED ) ) );
      }
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/rule-macros.lisp", position = 15320L)
  public static SubLObject express_as_genls(final SubLObject clause)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL != czer_vars.$express_as_genlsP$.getDynamicValue( thread ) )
    {
      return make_rm_cnf( el_utilities.make_binary_formula( $const19$genls, el_utilities.literal_arg2( clauses.neg_lits( clause ).first(), UNPROVIDED ), el_utilities.literal_arg2( clauses.pos_lits( clause ).first(),
          UNPROVIDED ) ), UNPROVIDED );
    }
    return clause;
  }

  @SubLTranslatedFile.SubL(source = "cycl/rule-macros.lisp", position = 15573L)
  public static SubLObject genl_predicates_clauseP(final SubLObject clause, SubLObject varP)
  {
    if( varP == UNPROVIDED )
    {
      varP = Symbols.symbol_function( $sym1$EL_VAR_ );
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL != czer_vars.$express_as_genl_predicatesP$.getDynamicValue( thread ) )
    {
      final SubLObject neg_lits = clauses.neg_lits( clause );
      final SubLObject pos_lits = clauses.pos_lits( clause );
      if( NIL != list_utilities.singletonP( neg_lits ) && NIL != list_utilities.singletonP( pos_lits ) )
      {
        final SubLObject neg_lit = neg_lits.first();
        final SubLObject pos_lit = pos_lits.first();
        final SubLObject neg_args = el_utilities.literal_args( neg_lit, UNPROVIDED );
        final SubLObject pos_args = el_utilities.literal_args( pos_lit, UNPROVIDED );
        if( NIL == list_utilities.every_in_list( varP, neg_args, UNPROVIDED ) )
        {
          return NIL;
        }
        if( neg_args.equal( pos_args ) )
        {
          return T;
        }
        if( NIL != fort_types_interface.commutative_relationP( el_utilities.literal_arg0( neg_lit, UNPROVIDED ) ) )
        {
          return list_utilities.sets_equalP( neg_args, pos_args, UNPROVIDED );
        }
        if( NIL != fort_types_interface.commutative_relationP( el_utilities.literal_arg0( pos_lit, UNPROVIDED ) ) )
        {
          return list_utilities.sets_equalP( neg_args, pos_args, UNPROVIDED );
        }
      }
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/rule-macros.lisp", position = 16334L)
  public static SubLObject express_as_genl_predicates(final SubLObject clause)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL != czer_vars.$express_as_genl_predicatesP$.getDynamicValue( thread ) )
    {
      return make_rm_cnf( el_utilities.make_binary_formula( $const20$genlPreds, el_utilities.literal_arg0( clauses.neg_lits( clause ).first(), UNPROVIDED ), el_utilities.literal_arg0( clauses.pos_lits( clause ).first(),
          UNPROVIDED ) ), UNPROVIDED );
    }
    return clause;
  }

  @SubLTranslatedFile.SubL(source = "cycl/rule-macros.lisp", position = 16609L)
  public static SubLObject genl_inverse_clauseP(final SubLObject clause, SubLObject varP)
  {
    if( varP == UNPROVIDED )
    {
      varP = Symbols.symbol_function( $sym1$EL_VAR_ );
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL != czer_vars.$express_as_genl_inverseP$.getDynamicValue( thread ) )
    {
      final SubLObject neg_lits = clauses.neg_lits( clause );
      final SubLObject pos_lits = clauses.pos_lits( clause );
      if( NIL != list_utilities.singletonP( neg_lits ) && NIL != list_utilities.singletonP( pos_lits ) )
      {
        final SubLObject neg_lit = neg_lits.first();
        final SubLObject pos_lit = pos_lits.first();
        final SubLObject neg_pred = el_utilities.literal_arg0( neg_lit, UNPROVIDED );
        final SubLObject pos_pred = el_utilities.literal_arg0( pos_lit, UNPROVIDED );
        if( !neg_pred.eql( pos_pred ) && NIL == kb_accessors.symmetric_predicateP( neg_pred ) && NIL == kb_accessors.symmetric_predicateP( neg_pred ) )
        {
          return makeBoolean( NIL != el_utilities.binary_lit_p( neg_lit ) && NIL != el_utilities.binary_lit_p( pos_lit ) && el_utilities.literal_arg1( neg_lit, UNPROVIDED ).eql( el_utilities.literal_arg2( pos_lit,
              UNPROVIDED ) ) && el_utilities.literal_arg2( neg_lit, UNPROVIDED ).eql( el_utilities.literal_arg1( pos_lit, UNPROVIDED ) ) && NIL != Functions.funcall( varP, el_utilities.literal_arg1( neg_lit,
                  UNPROVIDED ) ) && NIL != Functions.funcall( varP, el_utilities.literal_arg2( neg_lit, UNPROVIDED ) ) );
        }
      }
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/rule-macros.lisp", position = 17421L)
  public static SubLObject express_as_genl_inverse(final SubLObject clause)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL != czer_vars.$express_as_genl_inverseP$.getDynamicValue( thread ) )
    {
      return make_rm_cnf( el_utilities.make_binary_formula( $const21$genlInverse, el_utilities.literal_arg0( clauses.neg_lits( clause ).first(), UNPROVIDED ), el_utilities.literal_arg0( clauses.pos_lits( clause )
          .first(), UNPROVIDED ) ), UNPROVIDED );
    }
    return clause;
  }

  @SubLTranslatedFile.SubL(source = "cycl/rule-macros.lisp", position = 17692L)
  public static SubLObject arg_isa_clauseP(final SubLObject clause, SubLObject varP)
  {
    if( varP == UNPROVIDED )
    {
      varP = Symbols.symbol_function( $sym1$EL_VAR_ );
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL != czer_vars.$express_as_arg_isaP$.getDynamicValue( thread ) )
    {
      final SubLObject neg_lits = clauses.neg_lits( clause );
      final SubLObject pos_lits = clauses.pos_lits( clause );
      if( NIL != list_utilities.singletonP( neg_lits ) && NIL != list_utilities.singletonP( pos_lits ) )
      {
        final SubLObject neg_lit = neg_lits.first();
        final SubLObject pos_lit = pos_lits.first();
        return makeBoolean( NIL != el_utilities.isa_litP( pos_lit ) && NIL != fort_types_interface.predicateP( el_utilities.literal_arg0( neg_lit, UNPROVIDED ) ) && NIL != fort_types_interface.collectionP( el_utilities
            .literal_arg2( pos_lit, UNPROVIDED ) ) && NIL != kb_accessors.arg_isa_pred( relevant_arg_of_isa_clause( neg_lit, pos_lit, varP ), UNPROVIDED, UNPROVIDED ) );
      }
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/rule-macros.lisp", position = 18235L)
  public static SubLObject relevant_arg_of_isa_clause(final SubLObject neg_lit, final SubLObject pos_lit, SubLObject varP)
  {
    if( varP == UNPROVIDED )
    {
      varP = Symbols.symbol_function( $sym1$EL_VAR_ );
    }
    if( NIL != list_utilities.every_in_list( varP, el_utilities.literal_args( neg_lit, UNPROVIDED ), UNPROVIDED ) )
    {
      final SubLObject arg_foundP = NIL;
      final SubLObject pos_arg = el_utilities.literal_arg1( pos_lit, UNPROVIDED );
      if( NIL == arg_foundP )
      {
        SubLObject csome_list_var = czer_vars.$arg_positions$.getGlobalValue();
        SubLObject n = NIL;
        n = csome_list_var.first();
        while ( NIL == arg_foundP && NIL != csome_list_var)
        {
          final SubLObject neg_arg = ConsesLow.nth( n, neg_lit );
          if( neg_arg.eql( pos_arg ) && NIL != list_utilities.occurs_onceP( neg_arg, neg_lit, UNPROVIDED ) )
          {
            return n;
          }
          csome_list_var = csome_list_var.rest();
          n = csome_list_var.first();
        }
      }
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/rule-macros.lisp", position = 18610L)
  public static SubLObject express_as_arg_isa(final SubLObject clause)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL != czer_vars.$express_as_arg_isaP$.getDynamicValue( thread ) )
    {
      final SubLObject neg_lit = clauses.neg_lits( clause ).first();
      final SubLObject pos_lit = clauses.pos_lits( clause ).first();
      final SubLObject arg = relevant_arg_of_isa_clause( neg_lit, pos_lit, UNPROVIDED );
      final SubLObject rm_pred = kb_accessors.arg_isa_pred( arg, UNPROVIDED, UNPROVIDED );
      return make_rm_cnf( el_utilities.make_binary_formula( rm_pred, el_utilities.literal_arg0( neg_lit, UNPROVIDED ), el_utilities.literal_arg2( pos_lit, UNPROVIDED ) ), UNPROVIDED );
    }
    return clause;
  }

  @SubLTranslatedFile.SubL(source = "cycl/rule-macros.lisp", position = 18993L)
  public static SubLObject arg_genl_clauseP(final SubLObject clause, SubLObject varP)
  {
    if( varP == UNPROVIDED )
    {
      varP = Symbols.symbol_function( $sym1$EL_VAR_ );
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL != czer_vars.$express_as_arg_genlP$.getDynamicValue( thread ) )
    {
      final SubLObject neg_lits = clauses.neg_lits( clause );
      final SubLObject pos_lits = clauses.pos_lits( clause );
      if( NIL != list_utilities.singletonP( neg_lits ) && NIL != list_utilities.singletonP( pos_lits ) )
      {
        final SubLObject neg_lit = neg_lits.first();
        final SubLObject pos_lit = pos_lits.first();
        return makeBoolean( NIL != el_utilities.genls_litP( pos_lit ) && NIL != kb_accessors.relationP( el_utilities.literal_arg0( neg_lit, UNPROVIDED ) ) && NIL != fort_types_interface.collectionP( el_utilities
            .literal_arg2( pos_lit, UNPROVIDED ) ) && NIL != kb_accessors.arg_genl_pred( relevant_arg_of_isa_clause( neg_lit, pos_lit, varP ), UNPROVIDED, UNPROVIDED ) );
      }
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/rule-macros.lisp", position = 19549L)
  public static SubLObject express_as_arg_genl(final SubLObject clause)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL != czer_vars.$express_as_arg_genlP$.getDynamicValue( thread ) )
    {
      final SubLObject neg_lit = clauses.neg_lits( clause ).first();
      final SubLObject pos_lit = clauses.pos_lits( clause ).first();
      final SubLObject arg = relevant_arg_of_isa_clause( neg_lit, pos_lit, UNPROVIDED );
      final SubLObject rm_pred = kb_accessors.arg_genl_pred( arg, UNPROVIDED, UNPROVIDED );
      return make_rm_cnf( el_utilities.make_binary_formula( rm_pred, el_utilities.literal_arg0( neg_lit, UNPROVIDED ), el_utilities.literal_arg2( pos_lit, UNPROVIDED ) ), UNPROVIDED );
    }
    return clause;
  }

  @SubLTranslatedFile.SubL(source = "cycl/rule-macros.lisp", position = 19935L)
  public static SubLObject inter_arg_isa_clauseP(final SubLObject clause, SubLObject varP)
  {
    if( varP == UNPROVIDED )
    {
      varP = Symbols.symbol_function( $sym1$EL_VAR_ );
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL != czer_vars.$express_as_inter_arg_isaP$.getDynamicValue( thread ) )
    {
      final SubLObject neg_lits = clauses.neg_lits( clause );
      final SubLObject pos_lits = clauses.pos_lits( clause );
      if( NIL != list_utilities.doubletonP( neg_lits ) && NIL != list_utilities.singletonP( pos_lits ) )
      {
        final SubLObject pos_lit = pos_lits.first();
        if( NIL != el_utilities.isa_litP( pos_lit ) )
        {
          final SubLObject pos_isa_var = el_utilities.literal_arg1( pos_lit, UNPROVIDED );
          final SubLObject pos_isa_col = el_utilities.literal_arg2( pos_lit, UNPROVIDED );
          if( NIL != Functions.funcall( varP, pos_isa_var ) && NIL != fort_types_interface.collectionP( pos_isa_col ) )
          {
            SubLObject neg_isa_lit = NIL;
            SubLObject neg_pred_lit = NIL;
            if( NIL != el_utilities.isa_litP( neg_lits.first() ) )
            {
              neg_isa_lit = neg_lits.first();
              neg_pred_lit = conses_high.second( neg_lits );
            }
            else if( NIL != el_utilities.isa_litP( conses_high.second( neg_lits ) ) )
            {
              neg_isa_lit = conses_high.second( neg_lits );
              neg_pred_lit = neg_lits.first();
            }
            if( NIL != neg_isa_lit )
            {
              final SubLObject neg_isa_var = el_utilities.literal_arg1( neg_isa_lit, UNPROVIDED );
              final SubLObject neg_isa_col = el_utilities.literal_arg2( neg_isa_lit, UNPROVIDED );
              final SubLObject relevant_pred = el_utilities.literal_arg0( neg_pred_lit, UNPROVIDED );
              if( NIL != Functions.funcall( varP, neg_isa_var ) && NIL != fort_types_interface.collectionP( neg_isa_col ) && NIL != fort_types_interface.predicateP( relevant_pred ) )
              {
                final SubLObject ind_arg = Sequences.position( neg_isa_var, neg_pred_lit, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
                final SubLObject dep_arg = Sequences.position( pos_isa_var, neg_pred_lit, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
                final SubLObject rm_pred = at_utilities.inter_arg_isa_pred( ind_arg, dep_arg );
                if( NIL != rm_pred )
                {
                  return T;
                }
              }
            }
          }
        }
      }
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/rule-macros.lisp", position = 21251L)
  public static SubLObject express_as_inter_arg_isa(final SubLObject clause)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL != czer_vars.$express_as_inter_arg_isaP$.getDynamicValue( thread ) )
    {
      SubLObject neg_lits = NIL;
      cdestructuring_bind.destructuring_bind_must_consp( clause, clause, $list22 );
      neg_lits = clause.first();
      SubLObject current = clause.rest();
      cdestructuring_bind.destructuring_bind_must_consp( current, clause, $list22 );
      final SubLObject temp = current.rest();
      current = current.first();
      cdestructuring_bind.destructuring_bind_must_consp( current, clause, $list22 );
      final SubLObject temp_$11 = current.rest();
      current = current.first();
      SubLObject pos_isa = NIL;
      SubLObject pos_isa_var = NIL;
      SubLObject pos_isa_col = NIL;
      cdestructuring_bind.destructuring_bind_must_consp( current, clause, $list22 );
      pos_isa = current.first();
      current = current.rest();
      cdestructuring_bind.destructuring_bind_must_consp( current, clause, $list22 );
      pos_isa_var = current.first();
      current = current.rest();
      cdestructuring_bind.destructuring_bind_must_consp( current, clause, $list22 );
      pos_isa_col = current.first();
      current = current.rest();
      if( NIL == current )
      {
        current = temp_$11;
        if( NIL == current )
        {
          current = temp;
          if( NIL == current )
          {
            SubLObject neg_isa_lit = NIL;
            SubLObject neg_pred_lit = NIL;
            if( NIL != el_utilities.isa_litP( neg_lits.first() ) )
            {
              neg_isa_lit = neg_lits.first();
              neg_pred_lit = conses_high.second( neg_lits );
            }
            else if( NIL != el_utilities.isa_litP( conses_high.second( neg_lits ) ) )
            {
              neg_isa_lit = conses_high.second( neg_lits );
              neg_pred_lit = neg_lits.first();
            }
            SubLObject current_$13;
            final SubLObject datum_$12 = current_$13 = neg_isa_lit;
            SubLObject neg_isa = NIL;
            SubLObject neg_isa_var = NIL;
            SubLObject neg_isa_col = NIL;
            cdestructuring_bind.destructuring_bind_must_consp( current_$13, datum_$12, $list23 );
            neg_isa = current_$13.first();
            current_$13 = current_$13.rest();
            cdestructuring_bind.destructuring_bind_must_consp( current_$13, datum_$12, $list23 );
            neg_isa_var = current_$13.first();
            current_$13 = current_$13.rest();
            cdestructuring_bind.destructuring_bind_must_consp( current_$13, datum_$12, $list23 );
            neg_isa_col = current_$13.first();
            current_$13 = current_$13.rest();
            if( NIL == current_$13 )
            {
              final SubLObject relevant_pred = el_utilities.literal_arg0( neg_pred_lit, UNPROVIDED );
              final SubLObject ind_arg = Sequences.position( neg_isa_var, neg_pred_lit, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
              final SubLObject dep_arg = Sequences.position( pos_isa_var, neg_pred_lit, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
              final SubLObject rm_pred = at_utilities.inter_arg_isa_pred( ind_arg, dep_arg );
              return make_rm_cnf( el_utilities.make_ternary_formula( rm_pred, relevant_pred, neg_isa_col, pos_isa_col ), UNPROVIDED );
            }
            cdestructuring_bind.cdestructuring_bind_error( datum_$12, $list23 );
          }
          else
          {
            cdestructuring_bind.cdestructuring_bind_error( clause, $list22 );
          }
        }
        else
        {
          cdestructuring_bind.cdestructuring_bind_error( clause, $list22 );
        }
      }
      else
      {
        cdestructuring_bind.cdestructuring_bind_error( clause, $list22 );
      }
      return NIL;
    }
    return clause;
  }

  @SubLTranslatedFile.SubL(source = "cycl/rule-macros.lisp", position = 22157L)
  public static SubLObject disjoint_with_clauseP(final SubLObject clause, SubLObject varP)
  {
    if( varP == UNPROVIDED )
    {
      varP = Symbols.symbol_function( $sym1$EL_VAR_ );
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL != czer_vars.$express_as_disjoint_withP$.getDynamicValue( thread ) )
    {
      final SubLObject neg_lits = clauses.neg_lits( clause );
      final SubLObject pos_lits = clauses.pos_lits( clause );
      if( NIL != list_utilities.doubletonP( neg_lits ) && NIL == pos_lits )
      {
        final SubLObject neg_lit_1 = neg_lits.first();
        final SubLObject neg_lit_2 = conses_high.second( neg_lits );
        return makeBoolean( el_utilities.literal_arg1( neg_lit_1, UNPROVIDED ).eql( el_utilities.literal_arg1( neg_lit_2, UNPROVIDED ) ) && NIL != el_utilities.isa_litP( neg_lit_1 ) && NIL != el_utilities.isa_litP(
            neg_lit_2 ) && NIL != Functions.funcall( varP, el_utilities.literal_arg1( neg_lit_1, UNPROVIDED ) ) && NIL != fort_types_interface.collectionP( el_utilities.literal_arg2( neg_lit_1, UNPROVIDED ) )
            && NIL != fort_types_interface.collectionP( el_utilities.literal_arg2( neg_lit_2, UNPROVIDED ) ) );
      }
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/rule-macros.lisp", position = 23189L)
  public static SubLObject express_as_disjoint_with(final SubLObject clause)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL != czer_vars.$express_as_disjoint_withP$.getDynamicValue( thread ) )
    {
      return make_rm_cnf( el_utilities.make_binary_formula( $const24$disjointWith, el_utilities.literal_arg2( clauses.neg_lits( clause ).first(), UNPROVIDED ), el_utilities.literal_arg2( conses_high.second( clauses
          .neg_lits( clause ) ), UNPROVIDED ) ), UNPROVIDED );
    }
    return clause;
  }

  @SubLTranslatedFile.SubL(source = "cycl/rule-macros.lisp", position = 23464L)
  public static SubLObject negation_preds_clauseP(final SubLObject clause, SubLObject varP)
  {
    if( varP == UNPROVIDED )
    {
      varP = Symbols.symbol_function( $sym1$EL_VAR_ );
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL != czer_vars.$express_as_negation_predicatesP$.getDynamicValue( thread ) )
    {
      final SubLObject neg_lits = clauses.neg_lits( clause );
      final SubLObject pos_lits = clauses.pos_lits( clause );
      if( NIL != list_utilities.doubletonP( neg_lits ) && NIL == pos_lits )
      {
        final SubLObject neg_lit_1 = neg_lits.first();
        final SubLObject neg_lit_2 = conses_high.second( neg_lits );
        final SubLObject pred_1 = el_utilities.literal_arg0( neg_lit_1, UNPROVIDED );
        final SubLObject pred_2 = el_utilities.literal_arg0( neg_lit_2, UNPROVIDED );
        final SubLObject neg_1_args = el_utilities.literal_args( neg_lit_1, UNPROVIDED );
        final SubLObject neg_2_args = el_utilities.literal_args( neg_lit_2, UNPROVIDED );
        return makeBoolean( !pred_1.eql( pred_2 ) && NIL != fort_types_interface.predicateP( pred_1 ) && NIL != fort_types_interface.predicateP( pred_2 ) && NIL != list_utilities.every_in_list( varP, neg_1_args,
            UNPROVIDED ) && ( neg_1_args.equal( neg_2_args ) || ( ( NIL != fort_types_interface.commutative_relationP( pred_1 ) || NIL != fort_types_interface.commutative_relationP( pred_2 ) ) && NIL != list_utilities
                .sets_equalP( neg_1_args, neg_2_args, UNPROVIDED ) ) ) );
      }
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/rule-macros.lisp", position = 24676L)
  public static SubLObject express_as_negation_preds(final SubLObject clause)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL != czer_vars.$express_as_negation_predicatesP$.getDynamicValue( thread ) )
    {
      return make_rm_cnf( el_utilities.make_binary_formula( $const25$negationPreds, el_utilities.literal_arg0( clauses.neg_lits( clause ).first(), UNPROVIDED ), el_utilities.literal_arg0( conses_high.second( clauses
          .neg_lits( clause ) ), UNPROVIDED ) ), UNPROVIDED );
    }
    return clause;
  }

  @SubLTranslatedFile.SubL(source = "cycl/rule-macros.lisp", position = 24959L)
  public static SubLObject negation_inverse_clauseP(final SubLObject clause, SubLObject varP)
  {
    if( varP == UNPROVIDED )
    {
      varP = Symbols.symbol_function( $sym1$EL_VAR_ );
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL != czer_vars.$express_as_negation_inverseP$.getDynamicValue( thread ) )
    {
      final SubLObject neg_lits = clauses.neg_lits( clause );
      final SubLObject pos_lits = clauses.pos_lits( clause );
      if( NIL != list_utilities.doubletonP( neg_lits ) && NIL == pos_lits )
      {
        final SubLObject neg_lit_1 = neg_lits.first();
        final SubLObject neg_lit_2 = conses_high.second( neg_lits );
        final SubLObject pred_1 = el_utilities.literal_arg0( neg_lit_1, UNPROVIDED );
        final SubLObject pred_2 = el_utilities.literal_arg0( neg_lit_2, UNPROVIDED );
        if( NIL != el_utilities.binary_lit_p( neg_lit_1 ) && NIL != el_utilities.binary_lit_p( neg_lit_2 ) && NIL != fort_types_interface.predicateP( pred_1 ) && NIL != fort_types_interface.predicateP( pred_2 ) )
        {
          final SubLObject neg1_arg1 = el_utilities.literal_arg1( neg_lit_1, UNPROVIDED );
          final SubLObject neg1_arg2 = el_utilities.literal_arg2( neg_lit_1, UNPROVIDED );
          final SubLObject neg2_arg1 = el_utilities.literal_arg1( neg_lit_2, UNPROVIDED );
          final SubLObject neg2_arg2 = el_utilities.literal_arg2( neg_lit_2, UNPROVIDED );
          return makeBoolean( NIL != Functions.funcall( varP, neg1_arg1 ) && NIL != Functions.funcall( varP, neg1_arg2 ) && neg1_arg1.eql( neg2_arg2 ) && neg1_arg2.eql( neg2_arg1 ) );
        }
      }
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/rule-macros.lisp", position = 26147L)
  public static SubLObject express_as_negation_inverse(final SubLObject clause)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL != czer_vars.$express_as_negation_inverseP$.getDynamicValue( thread ) )
    {
      return make_rm_cnf( el_utilities.make_binary_formula( $const26$negationInverse, el_utilities.literal_arg0( clauses.neg_lits( clause ).first(), UNPROVIDED ), el_utilities.literal_arg0( conses_high.second( clauses
          .neg_lits( clause ) ), UNPROVIDED ) ), UNPROVIDED );
    }
    return clause;
  }

  @SubLTranslatedFile.SubL(source = "cycl/rule-macros.lisp", position = 26431L)
  public static SubLObject reflexive_predicate_clauseP(final SubLObject clause, SubLObject varP)
  {
    if( varP == UNPROVIDED )
    {
      varP = Symbols.symbol_function( $sym1$EL_VAR_ );
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL != czer_vars.$express_as_reflexiveP$.getDynamicValue( thread ) )
    {
      final SubLObject neg_lits = clauses.neg_lits( clause );
      final SubLObject pos_lits = clauses.pos_lits( clause );
      if( NIL != list_utilities.singletonP( pos_lits ) )
      {
        final SubLObject pos_lit = pos_lits.first();
        if( NIL != el_utilities.reflexive_litP( pos_lit ) )
        {
          final SubLObject var = el_utilities.literal_arg1( pos_lit, UNPROVIDED );
          if( NIL != Functions.funcall( varP, var ) )
          {
            final SubLObject pred = el_utilities.literal_arg0( pos_lit, UNPROVIDED );
            if( NIL != fort_types_interface.predicateP( pred ) )
            {
              return reflexive_neg_litsP( pred, var, neg_lits, varP );
            }
          }
        }
      }
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/rule-macros.lisp", position = 27464L)
  public static SubLObject reflexive_neg_litsP(final SubLObject pred, final SubLObject var, final SubLObject neg_lits, SubLObject varP)
  {
    if( varP == UNPROVIDED )
    {
      varP = Symbols.symbol_function( $sym1$EL_VAR_ );
    }
    SubLObject extra_neg_litP = NIL;
    SubLObject cols = NIL;
    SubLObject vars = NIL;
    SubLObject isa_preds = NIL;
    if( NIL == extra_neg_litP )
    {
      SubLObject csome_list_var = neg_lits;
      SubLObject neg_lit = NIL;
      neg_lit = csome_list_var.first();
      while ( NIL == extra_neg_litP && NIL != csome_list_var)
      {
        final SubLObject arg1 = el_utilities.literal_arg1( neg_lit, UNPROVIDED );
        final SubLObject arg2 = el_utilities.literal_arg2( neg_lit, UNPROVIDED );
        if( NIL != el_utilities.isa_litP( neg_lit ) )
        {
          if( var.eql( arg1 ) )
          {
            cols = ConsesLow.cons( arg2, cols );
          }
          else
          {
            extra_neg_litP = T;
          }
        }
        else if( NIL != el_utilities.arg_isa_binary_litP( neg_lit ) && pred.eql( arg1 ) && NIL != Functions.funcall( varP, arg2 ) )
        {
          final SubLObject pcase_var = el_utilities.literal_arg0( neg_lit, UNPROVIDED );
          if( pcase_var.eql( $const27$arg1Isa ) )
          {
            vars = ConsesLow.cons( arg2, vars );
            final SubLObject item_var = $const27$arg1Isa;
            if( NIL == conses_high.member( item_var, isa_preds, Symbols.symbol_function( EQL ), Symbols.symbol_function( IDENTITY ) ) )
            {
              isa_preds = ConsesLow.cons( item_var, isa_preds );
            }
          }
          else if( pcase_var.eql( $const28$arg2Isa ) )
          {
            vars = ConsesLow.cons( arg2, vars );
            final SubLObject item_var = $const28$arg2Isa;
            if( NIL == conses_high.member( item_var, isa_preds, Symbols.symbol_function( EQL ), Symbols.symbol_function( IDENTITY ) ) )
            {
              isa_preds = ConsesLow.cons( item_var, isa_preds );
            }
          }
          else
          {
            extra_neg_litP = T;
          }
        }
        else
        {
          extra_neg_litP = T;
        }
        csome_list_var = csome_list_var.rest();
        neg_lit = csome_list_var.first();
      }
    }
    if( NIL == extra_neg_litP )
    {
      SubLObject mal_argP = ( NIL != cols ) ? NIL : vars;
      final SubLObject all_arg_isa = ( NIL != mal_argP ) ? NIL : kb_accessors.arg_types( pred, UNPROVIDED );
      if( NIL == mal_argP )
      {
        SubLObject csome_list_var2 = cols;
        SubLObject col = NIL;
        col = csome_list_var2.first();
        while ( NIL == mal_argP && NIL != csome_list_var2)
        {
          if( NIL != fort_types_interface.collectionP( col ) )
          {
            mal_argP = makeBoolean( NIL == genls.all_specP( col, all_arg_isa, UNPROVIDED, UNPROVIDED ) );
          }
          else if( NIL == Functions.funcall( varP, col ) || NIL == subl_promotions.memberP( col, vars, UNPROVIDED, UNPROVIDED ) )
          {
            mal_argP = T;
          }
          csome_list_var2 = csome_list_var2.rest();
          col = csome_list_var2.first();
        }
      }
      if( NIL == list_utilities.doubletonP( isa_preds ) && NIL == mal_argP )
      {
        SubLObject csome_list_var2 = isa_preds;
        SubLObject isa_pred = NIL;
        isa_pred = csome_list_var2.first();
        while ( NIL == mal_argP && NIL != csome_list_var2)
        {
          final SubLObject isas = kb_mapping_utilities.pred_values_in_relevant_mts( pred, isa_pred, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
          if( NIL == mal_argP )
          {
            SubLObject csome_list_var_$14;
            SubLObject arg_isa;
            for( csome_list_var_$14 = isas, arg_isa = NIL, arg_isa = csome_list_var_$14.first(); NIL == mal_argP && NIL != csome_list_var_$14; mal_argP = makeBoolean( NIL == genls.all_specP( arg_isa, all_arg_isa,
                UNPROVIDED, UNPROVIDED ) ), csome_list_var_$14 = csome_list_var_$14.rest(), arg_isa = csome_list_var_$14.first() )
            {
            }
          }
          csome_list_var2 = csome_list_var2.rest();
          isa_pred = csome_list_var2.first();
        }
      }
      return makeBoolean( NIL == mal_argP );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/rule-macros.lisp", position = 28757L)
  public static SubLObject express_as_reflexive_predicate(final SubLObject clause)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL != czer_vars.$express_as_reflexiveP$.getDynamicValue( thread ) )
    {
      return make_rm_cnf( el_utilities.make_binary_formula( $const29$isa, el_utilities.literal_arg0( clauses.pos_lits( clause ).first(), UNPROVIDED ), $const30$ReflexiveBinaryPredicate ), UNPROVIDED );
    }
    return clause;
  }

  @SubLTranslatedFile.SubL(source = "cycl/rule-macros.lisp", position = 29010L)
  public static SubLObject irreflexive_predicate_clauseP(final SubLObject clause, SubLObject varP)
  {
    if( varP == UNPROVIDED )
    {
      varP = Symbols.symbol_function( $sym1$EL_VAR_ );
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL != czer_vars.$express_as_irreflexiveP$.getDynamicValue( thread ) )
    {
      final SubLObject neg_lits = clauses.neg_lits( clause );
      final SubLObject pos_lits = clauses.pos_lits( clause );
      final SubLObject ref_lits = el_utilities.reflexive_lits( neg_lits );
      if( NIL == pos_lits && NIL != list_utilities.singletonP( ref_lits ) )
      {
        final SubLObject ref_lit = ref_lits.first();
        final SubLObject var = ( NIL != ref_lit ) ? el_utilities.literal_arg1( ref_lit, UNPROVIDED ) : NIL;
        if( NIL != Functions.funcall( varP, var ) )
        {
          final SubLObject pred = el_utilities.literal_arg0( ref_lit, UNPROVIDED );
          if( NIL != fort_types_interface.predicateP( pred ) )
          {
            return reflexive_neg_litsP( pred, var, Sequences.remove( ref_lit, neg_lits, Symbols.symbol_function( EQUAL ), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED ), UNPROVIDED );
          }
        }
      }
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/rule-macros.lisp", position = 30157L)
  public static SubLObject express_as_irreflexive_predicate(final SubLObject clause)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL != czer_vars.$express_as_irreflexiveP$.getDynamicValue( thread ) )
    {
      return make_rm_cnf( el_utilities.make_binary_formula( $const29$isa, el_utilities.literal_arg0( el_utilities.reflexive_lits( clauses.neg_lits( clause ) ).first(), UNPROVIDED ), $const31$IrreflexiveBinaryPredicate ),
          UNPROVIDED );
    }
    return clause;
  }

  @SubLTranslatedFile.SubL(source = "cycl/rule-macros.lisp", position = 30433L)
  public static SubLObject transitive_predicate_clauseP(final SubLObject clause, SubLObject varP)
  {
    if( varP == UNPROVIDED )
    {
      varP = Symbols.symbol_function( $sym1$EL_VAR_ );
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL != czer_vars.$express_as_transitiveP$.getDynamicValue( thread ) )
    {
      final SubLObject neg_lits = clauses.neg_lits( clause );
      final SubLObject pos_lits = clauses.pos_lits( clause );
      if( NIL != list_utilities.singletonP( pos_lits ) && NIL != list_utilities.doubletonP( neg_lits ) )
      {
        final SubLObject pos_lit = pos_lits.first();
        final SubLObject var1 = el_utilities.literal_arg1( pos_lit, UNPROVIDED );
        final SubLObject var2 = el_utilities.literal_arg2( pos_lit, UNPROVIDED );
        if( NIL != Functions.funcall( varP, var1 ) && NIL != Functions.funcall( varP, var2 ) && NIL != el_utilities.binary_lit_p( pos_lit ) )
        {
          final SubLObject pred = el_utilities.literal_arg0( pos_lit, UNPROVIDED );
          if( NIL != fort_types_interface.predicateP( pred ) )
          {
            final SubLObject neg_lit1 = neg_lits.first();
            final SubLObject neg_lit2 = conses_high.second( neg_lits );
            if( pred.eql( el_utilities.literal_arg0( neg_lit1, UNPROVIDED ) ) && pred.eql( el_utilities.literal_arg0( neg_lit2, UNPROVIDED ) ) && NIL != el_utilities.binary_lit_p( neg_lit1 ) && NIL != el_utilities
                .binary_lit_p( neg_lit2 ) )
            {
              final SubLObject neg_lit1_var1 = el_utilities.literal_arg1( neg_lit1, UNPROVIDED );
              final SubLObject neg_lit1_var2 = el_utilities.literal_arg2( neg_lit1, UNPROVIDED );
              final SubLObject neg_lit2_var1 = el_utilities.literal_arg1( neg_lit2, UNPROVIDED );
              final SubLObject neg_lit2_var2 = el_utilities.literal_arg2( neg_lit2, UNPROVIDED );
              return makeBoolean( ( var1.eql( neg_lit1_var1 ) && var2.eql( neg_lit2_var2 ) && neg_lit1_var2.eql( neg_lit2_var1 ) && NIL != Functions.funcall( varP, neg_lit1_var2 ) ) || ( var1.eql( neg_lit2_var1 ) && var2
                  .eql( neg_lit1_var2 ) && neg_lit1_var1.eql( neg_lit2_var2 ) && NIL != Functions.funcall( varP, neg_lit1_var1 ) ) );
            }
          }
        }
      }
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/rule-macros.lisp", position = 32205L)
  public static SubLObject express_as_transitive_predicate(final SubLObject clause)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL != czer_vars.$express_as_transitiveP$.getDynamicValue( thread ) )
    {
      return make_rm_cnf( el_utilities.make_binary_formula( $const29$isa, el_utilities.literal_arg0( clauses.pos_lits( clause ).first(), UNPROVIDED ), $const32$TransitiveBinaryPredicate ), UNPROVIDED );
    }
    return clause;
  }

  @SubLTranslatedFile.SubL(source = "cycl/rule-macros.lisp", position = 32461L)
  public static SubLObject symmetric_predicate_clauseP(final SubLObject clause, SubLObject varP)
  {
    if( varP == UNPROVIDED )
    {
      varP = Symbols.symbol_function( $sym1$EL_VAR_ );
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL != czer_vars.$express_as_symmetricP$.getDynamicValue( thread ) )
    {
      final SubLObject neg_lits = clauses.neg_lits( clause );
      final SubLObject pos_lits = clauses.pos_lits( clause );
      return makeBoolean( NIL != list_utilities.singletonP( neg_lits ) && NIL != list_utilities.singletonP( pos_lits ) && NIL != symmetric_literalsP( neg_lits.first(), pos_lits.first(), varP ) );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/rule-macros.lisp", position = 33161L)
  public static SubLObject symmetric_literalsP(final SubLObject lit1, final SubLObject lit2, SubLObject varP)
  {
    if( varP == UNPROVIDED )
    {
      varP = Symbols.symbol_function( $sym1$EL_VAR_ );
    }
    final SubLObject pred = el_utilities.literal_arg0( lit1, UNPROVIDED );
    if( NIL != el_utilities.binary_lit_p( lit1 ) && NIL != el_utilities.binary_lit_p( lit2 ) && pred.eql( el_utilities.literal_arg0( lit2, UNPROVIDED ) ) && NIL != fort_types_interface.predicateP( pred ) )
    {
      final SubLObject lit1_var1 = el_utilities.literal_arg1( lit1, UNPROVIDED );
      final SubLObject lit1_var2 = el_utilities.literal_arg2( lit1, UNPROVIDED );
      final SubLObject lit2_var1 = el_utilities.literal_arg1( lit2, UNPROVIDED );
      final SubLObject lit2_var2 = el_utilities.literal_arg2( lit2, UNPROVIDED );
      return makeBoolean( lit1_var1.eql( lit2_var2 ) && lit1_var2.eql( lit2_var1 ) && NIL != Functions.funcall( varP, lit1_var1 ) && NIL != Functions.funcall( varP, lit1_var2 ) );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/rule-macros.lisp", position = 33685L)
  public static SubLObject express_as_symmetric_predicate(final SubLObject clause)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL != czer_vars.$express_as_symmetricP$.getDynamicValue( thread ) )
    {
      return make_rm_cnf( el_utilities.make_binary_formula( $const29$isa, el_utilities.literal_arg0( clauses.pos_lits( clause ).first(), UNPROVIDED ), $const33$SymmetricBinaryPredicate ), UNPROVIDED );
    }
    return clause;
  }

  @SubLTranslatedFile.SubL(source = "cycl/rule-macros.lisp", position = 33938L)
  public static SubLObject asymmetric_predicate_clauseP(final SubLObject clause, SubLObject varP)
  {
    if( varP == UNPROVIDED )
    {
      varP = Symbols.symbol_function( $sym1$EL_VAR_ );
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL != czer_vars.$express_as_asymmetricP$.getDynamicValue( thread ) )
    {
      final SubLObject neg_lits = clauses.neg_lits( clause );
      final SubLObject pos_lits = clauses.pos_lits( clause );
      return makeBoolean( NIL == pos_lits && NIL != list_utilities.doubletonP( neg_lits ) && NIL != symmetric_literalsP( neg_lits.first(), conses_high.second( neg_lits ), varP ) );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/rule-macros.lisp", position = 34734L)
  public static SubLObject express_as_asymmetric_predicate(final SubLObject clause)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL != czer_vars.$express_as_asymmetricP$.getDynamicValue( thread ) )
    {
      return make_rm_cnf( el_utilities.make_binary_formula( $const29$isa, el_utilities.literal_arg0( clauses.neg_lits( clause ).first(), UNPROVIDED ), $const34$AsymmetricBinaryPredicate ), UNPROVIDED );
    }
    return clause;
  }

  @SubLTranslatedFile.SubL(source = "cycl/rule-macros.lisp", position = 34990L)
  public static SubLObject make_rm_cnf(final SubLObject pos_lit, SubLObject neg_lits)
  {
    if( neg_lits == UNPROVIDED )
    {
      neg_lits = NIL;
    }
    return clauses.make_cnf( neg_lits, ConsesLow.list( pos_lit ) );
  }

  public static SubLObject declare_rule_macros_file()
  {
    SubLFiles.declareFunction( me, "canonicalize_clauses_wrt_rule_macros", "CANONICALIZE-CLAUSES-WRT-RULE-MACROS", 1, 0, false );
    SubLFiles.declareFunction( me, "required_arg_pred_clausesP", "REQUIRED-ARG-PRED-CLAUSES?", 1, 1, false );
    SubLFiles.declareFunction( me, "express_as_required_arg_pred", "EXPRESS-AS-REQUIRED-ARG-PRED", 1, 0, false );
    SubLFiles.declareFunction( me, "required_arg_pred", "REQUIRED-ARG-PRED", 1, 0, false );
    SubLFiles.declareFunction( me, "relation_type_clausesP", "RELATION-TYPE-CLAUSES?", 1, 1, false );
    SubLFiles.declareFunction( me, "express_as_relation_type", "EXPRESS-AS-RELATION-TYPE", 1, 0, false );
    SubLFiles.declareFunction( me, "relation_type_pred", "RELATION-TYPE-PRED", 1, 1, false );
    SubLFiles.declareFunction( me, "relation_type_gaf", "RELATION-TYPE-GAF", 4, 1, false );
    SubLFiles.declareFunction( me, "canonicalize_clause_wrt_rule_macros", "CANONICALIZE-CLAUSE-WRT-RULE-MACROS", 1, 0, false );
    SubLFiles.declareFunction( me, "genls_clauseP", "GENLS-CLAUSE?", 1, 1, false );
    SubLFiles.declareFunction( me, "express_as_genls", "EXPRESS-AS-GENLS", 1, 0, false );
    SubLFiles.declareFunction( me, "genl_predicates_clauseP", "GENL-PREDICATES-CLAUSE?", 1, 1, false );
    SubLFiles.declareFunction( me, "express_as_genl_predicates", "EXPRESS-AS-GENL-PREDICATES", 1, 0, false );
    SubLFiles.declareFunction( me, "genl_inverse_clauseP", "GENL-INVERSE-CLAUSE?", 1, 1, false );
    SubLFiles.declareFunction( me, "express_as_genl_inverse", "EXPRESS-AS-GENL-INVERSE", 1, 0, false );
    SubLFiles.declareFunction( me, "arg_isa_clauseP", "ARG-ISA-CLAUSE?", 1, 1, false );
    SubLFiles.declareFunction( me, "relevant_arg_of_isa_clause", "RELEVANT-ARG-OF-ISA-CLAUSE", 2, 1, false );
    SubLFiles.declareFunction( me, "express_as_arg_isa", "EXPRESS-AS-ARG-ISA", 1, 0, false );
    SubLFiles.declareFunction( me, "arg_genl_clauseP", "ARG-GENL-CLAUSE?", 1, 1, false );
    SubLFiles.declareFunction( me, "express_as_arg_genl", "EXPRESS-AS-ARG-GENL", 1, 0, false );
    SubLFiles.declareFunction( me, "inter_arg_isa_clauseP", "INTER-ARG-ISA-CLAUSE?", 1, 1, false );
    SubLFiles.declareFunction( me, "express_as_inter_arg_isa", "EXPRESS-AS-INTER-ARG-ISA", 1, 0, false );
    SubLFiles.declareFunction( me, "disjoint_with_clauseP", "DISJOINT-WITH-CLAUSE?", 1, 1, false );
    SubLFiles.declareFunction( me, "express_as_disjoint_with", "EXPRESS-AS-DISJOINT-WITH", 1, 0, false );
    SubLFiles.declareFunction( me, "negation_preds_clauseP", "NEGATION-PREDS-CLAUSE?", 1, 1, false );
    SubLFiles.declareFunction( me, "express_as_negation_preds", "EXPRESS-AS-NEGATION-PREDS", 1, 0, false );
    SubLFiles.declareFunction( me, "negation_inverse_clauseP", "NEGATION-INVERSE-CLAUSE?", 1, 1, false );
    SubLFiles.declareFunction( me, "express_as_negation_inverse", "EXPRESS-AS-NEGATION-INVERSE", 1, 0, false );
    SubLFiles.declareFunction( me, "reflexive_predicate_clauseP", "REFLEXIVE-PREDICATE-CLAUSE?", 1, 1, false );
    SubLFiles.declareFunction( me, "reflexive_neg_litsP", "REFLEXIVE-NEG-LITS?", 3, 1, false );
    SubLFiles.declareFunction( me, "express_as_reflexive_predicate", "EXPRESS-AS-REFLEXIVE-PREDICATE", 1, 0, false );
    SubLFiles.declareFunction( me, "irreflexive_predicate_clauseP", "IRREFLEXIVE-PREDICATE-CLAUSE?", 1, 1, false );
    SubLFiles.declareFunction( me, "express_as_irreflexive_predicate", "EXPRESS-AS-IRREFLEXIVE-PREDICATE", 1, 0, false );
    SubLFiles.declareFunction( me, "transitive_predicate_clauseP", "TRANSITIVE-PREDICATE-CLAUSE?", 1, 1, false );
    SubLFiles.declareFunction( me, "express_as_transitive_predicate", "EXPRESS-AS-TRANSITIVE-PREDICATE", 1, 0, false );
    SubLFiles.declareFunction( me, "symmetric_predicate_clauseP", "SYMMETRIC-PREDICATE-CLAUSE?", 1, 1, false );
    SubLFiles.declareFunction( me, "symmetric_literalsP", "SYMMETRIC-LITERALS?", 2, 1, false );
    SubLFiles.declareFunction( me, "express_as_symmetric_predicate", "EXPRESS-AS-SYMMETRIC-PREDICATE", 1, 0, false );
    SubLFiles.declareFunction( me, "asymmetric_predicate_clauseP", "ASYMMETRIC-PREDICATE-CLAUSE?", 1, 1, false );
    SubLFiles.declareFunction( me, "express_as_asymmetric_predicate", "EXPRESS-AS-ASYMMETRIC-PREDICATE", 1, 0, false );
    SubLFiles.declareFunction( me, "make_rm_cnf", "MAKE-RM-CNF", 1, 1, false );
    return NIL;
  }

  public static SubLObject init_rule_macros_file()
  {
    return NIL;
  }

  public static SubLObject setup_rule_macros_file()
  {
    return NIL;
  }

  @Override
  public void declareFunctions()
  {
    declare_rule_macros_file();
  }

  @Override
  public void initializeVariables()
  {
    init_rule_macros_file();
  }

  @Override
  public void runTopLevelForms()
  {
    setup_rule_macros_file();
  }
  static
  {
    me = new rule_macros();
    $sym0$CANONICALIZE_CLAUSE_WRT_RULE_MACROS = makeSymbol( "CANONICALIZE-CLAUSE-WRT-RULE-MACROS" );
    $sym1$EL_VAR_ = makeSymbol( "EL-VAR?" );
    $list2 = ConsesLow.list( makeSymbol( "NEG-LITS" ), makeSymbol( "POS-LITS" ) );
    $list3 = ConsesLow.list( ConsesLow.list( ConsesLow.list( ConsesLow.list( makeSymbol( "ISA" ), makeSymbol( "VAR" ), makeSymbol( "COL" ) ) ), ConsesLow.list( makeSymbol( "POS-LIT" ) ) ) );
    $const4$requiredArg1Pred = constant_handles.reader_make_constant_shell( makeString( "requiredArg1Pred" ) );
    $const5$requiredArg2Pred = constant_handles.reader_make_constant_shell( makeString( "requiredArg2Pred" ) );
    $str6$invalid_required_arg_pred_index__ = makeString( "invalid required-arg-pred index: ~s" );
    $list7 = ConsesLow.list( ConsesLow.list( makeSymbol( "NEG-LITS-1" ), makeSymbol( "POS-LITS-1" ) ), ConsesLow.list( makeSymbol( "NEG-LITS-2" ), makeSymbol( "POS-LITS-2" ) ) );
    $list8 = ConsesLow.list( ConsesLow.list( ConsesLow.list( ConsesLow.list( makeSymbol( "ISA" ), makeSymbol( "VAR" ), makeSymbol( "COL" ) ) ), ConsesLow.list( makeSymbol( "POS-LIT-1" ) ) ), ConsesLow.list( ConsesLow
        .list( makeSymbol( "NEG-LIT-2" ) ), ConsesLow.list( makeSymbol( "POS-LIT-2" ) ) ) );
    $const9$relationAllExists = constant_handles.reader_make_constant_shell( makeString( "relationAllExists" ) );
    $const10$relationAllExistsMin = constant_handles.reader_make_constant_shell( makeString( "relationAllExistsMin" ) );
    $const11$relationAllExistsMax = constant_handles.reader_make_constant_shell( makeString( "relationAllExistsMax" ) );
    $const12$relationAllExistsCount = constant_handles.reader_make_constant_shell( makeString( "relationAllExistsCount" ) );
    $const13$relationExistsAll = constant_handles.reader_make_constant_shell( makeString( "relationExistsAll" ) );
    $const14$relationExistsMinAll = constant_handles.reader_make_constant_shell( makeString( "relationExistsMinAll" ) );
    $const15$relationExistsMaxAll = constant_handles.reader_make_constant_shell( makeString( "relationExistsMaxAll" ) );
    $const16$relationExistsCountAll = constant_handles.reader_make_constant_shell( makeString( "relationExistsCountAll" ) );
    $str17$invalid_relation_type_index___s = makeString( "invalid relation-type index: ~s" );
    $str18$invalid_relation_type_rule_macro_ = makeString( "invalid relation-type rule-macro-pred: ~s" );
    $const19$genls = constant_handles.reader_make_constant_shell( makeString( "genls" ) );
    $const20$genlPreds = constant_handles.reader_make_constant_shell( makeString( "genlPreds" ) );
    $const21$genlInverse = constant_handles.reader_make_constant_shell( makeString( "genlInverse" ) );
    $list22 = ConsesLow.list( makeSymbol( "NEG-LITS" ), ConsesLow.list( ConsesLow.list( makeSymbol( "POS-ISA" ), makeSymbol( "POS-ISA-VAR" ), makeSymbol( "POS-ISA-COL" ) ) ) );
    $list23 = ConsesLow.list( makeSymbol( "NEG-ISA" ), makeSymbol( "NEG-ISA-VAR" ), makeSymbol( "NEG-ISA-COL" ) );
    $const24$disjointWith = constant_handles.reader_make_constant_shell( makeString( "disjointWith" ) );
    $const25$negationPreds = constant_handles.reader_make_constant_shell( makeString( "negationPreds" ) );
    $const26$negationInverse = constant_handles.reader_make_constant_shell( makeString( "negationInverse" ) );
    $const27$arg1Isa = constant_handles.reader_make_constant_shell( makeString( "arg1Isa" ) );
    $const28$arg2Isa = constant_handles.reader_make_constant_shell( makeString( "arg2Isa" ) );
    $const29$isa = constant_handles.reader_make_constant_shell( makeString( "isa" ) );
    $const30$ReflexiveBinaryPredicate = constant_handles.reader_make_constant_shell( makeString( "ReflexiveBinaryPredicate" ) );
    $const31$IrreflexiveBinaryPredicate = constant_handles.reader_make_constant_shell( makeString( "IrreflexiveBinaryPredicate" ) );
    $const32$TransitiveBinaryPredicate = constant_handles.reader_make_constant_shell( makeString( "TransitiveBinaryPredicate" ) );
    $const33$SymmetricBinaryPredicate = constant_handles.reader_make_constant_shell( makeString( "SymmetricBinaryPredicate" ) );
    $const34$AsymmetricBinaryPredicate = constant_handles.reader_make_constant_shell( makeString( "AsymmetricBinaryPredicate" ) );
  }
}
/*
 * 
 * Total time: 323 ms
 * 
 */