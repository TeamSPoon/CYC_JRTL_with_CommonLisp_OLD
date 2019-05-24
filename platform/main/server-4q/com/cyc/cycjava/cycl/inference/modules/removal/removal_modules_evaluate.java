package com.cyc.cycjava.cycl.inference.modules.removal;

import com.cyc.cycjava.cycl.constant_handles;
import com.cyc.cycjava.cycl.utilities_macros;
import com.cyc.cycjava.cycl.inference.modules.preference_modules;
import com.cyc.cycjava.cycl.inference.harness.inference_modules;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.cycjava.cycl.backward_utilities;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.cycjava.cycl.inference.harness.inference_worker_removal;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.cycjava.cycl.mt_relevance_macros;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.cycjava.cycl.cycl_grammar;
import com.cyc.cycjava.cycl.subl_promotions;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.cycjava.cycl.clause_utilities;
import com.cyc.cycjava.cycl.list_utilities;
import com.cyc.cycjava.cycl.clauses;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.cycjava.cycl.backward;
import com.cyc.cycjava.cycl.bindings;
import com.cyc.cycjava.cycl.unification_utilities;
import com.cyc.cycjava.cycl.relation_evaluation;
import com.cyc.cycjava.cycl.cycl_utilities;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.cycjava.cycl.el_utilities;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class removal_modules_evaluate
    extends
      SubLTranslatedFile
{
  public static final SubLFile me;
  public static final String myName = "com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_evaluate";
  public static final String myFingerPrint = "e55ba8005ac332b4b4026fee30507b5dfa05435156c6a03af4574f3d388749e7";
  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-evaluate.lisp", position = 805L)
  private static SubLSymbol $default_evaluate_bind_cost$;
  private static final SubLObject $const0$evaluate;
  private static final SubLSymbol $kw1$POS;
  private static final SubLSymbol $kw2$NEG;
  private static final SubLSymbol $kw3$REMOVAL_EVALUATE_BIND;
  private static final SubLList $list4;
  private static final SubLSymbol $kw5$REMOVAL_EVALUATE_NEG_CHECK;
  private static final SubLList $list6;
  private static final SubLSymbol $kw7$REMOVAL_EVALUATE_BIND_CONJUNCTION;
  private static final SubLList $list8;
  private static final SubLSymbol $sym9$EVALUATION_RELATED_ASENT_;
  private static final SubLSymbol $sym10$CONTEXTUALIZED_ASENT_ASENT;
  private static final SubLSymbol $sym11$REMOVAL_EVALUATE_BIND_CONJUNCTION_APPLICABILITY;
  private static final SubLList $list12;
  private static final SubLSymbol $sym13$_EXIT;
  private static final SubLSymbol $sym14$HL_VAR_;
  private static final SubLSymbol $sym15$REMOVAL_EVALUATE_BIND_CONJUNCTION_EXPAND;

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-evaluate.lisp", position = 522L)
  public static SubLObject make_evaluate_sentence(final SubLObject result, final SubLObject expression)
  {
    return el_utilities.make_binary_formula( $const0$evaluate, result, expression );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-evaluate.lisp", position = 1008L)
  public static SubLObject removal_evaluate_bind_expand(final SubLObject asent, SubLObject sense)
  {
    if( sense == UNPROVIDED )
    {
      sense = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject arg1 = cycl_utilities.atomic_sentence_arg1( asent, UNPROVIDED );
    final SubLObject expression = cycl_utilities.atomic_sentence_arg2( asent, UNPROVIDED );
    thread.resetMultipleValues();
    final SubLObject v_answer = relation_evaluation.cyc_evaluate( expression );
    final SubLObject validP = thread.secondMultipleValue();
    final SubLObject contextualizedP = thread.thirdMultipleValue();
    thread.resetMultipleValues();
    if( NIL != validP )
    {
      thread.resetMultipleValues();
      final SubLObject v_bindings = unification_utilities.term_unify( arg1, v_answer, T, T );
      final SubLObject unify_justification = thread.secondMultipleValue();
      thread.resetMultipleValues();
      if( NIL != v_bindings )
      {
        final SubLObject subst_arg1 = bindings.apply_bindings( v_bindings, arg1 );
        final SubLObject sentence = make_evaluate_sentence( subst_arg1, expression );
        final SubLObject support = removal_modules_evaluation.make_eval_support( sentence, contextualizedP );
        backward.removal_add_node( support, v_bindings, unify_justification );
      }
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-evaluate.lisp", position = 2303L)
  public static SubLObject removal_evaluate_neg_check_expand(final SubLObject asent, SubLObject sense)
  {
    if( sense == UNPROVIDED )
    {
      sense = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject arg1 = cycl_utilities.atomic_sentence_arg1( asent, UNPROVIDED );
    final SubLObject expression = cycl_utilities.atomic_sentence_arg2( asent, UNPROVIDED );
    thread.resetMultipleValues();
    final SubLObject v_answer = relation_evaluation.cyc_evaluate( expression );
    final SubLObject validP = thread.secondMultipleValue();
    final SubLObject contextualizedP = thread.thirdMultipleValue();
    thread.resetMultipleValues();
    if( NIL != validP )
    {
      thread.resetMultipleValues();
      final SubLObject v_bindings = unification_utilities.term_unify( arg1, v_answer, UNPROVIDED, UNPROVIDED );
      final SubLObject unify_justification = thread.secondMultipleValue();
      thread.resetMultipleValues();
      if( NIL == v_bindings )
      {
        final SubLObject sentence = cycl_utilities.negate( asent );
        final SubLObject support = removal_modules_evaluation.make_eval_support( sentence, contextualizedP );
        backward.removal_add_node( support, UNPROVIDED, UNPROVIDED );
      }
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-evaluate.lisp", position = 4526L)
  public static SubLObject removal_evaluate_bind_conjunction_applicability(final SubLObject contextualized_dnf_clause)
  {
    if( NIL != list_utilities.every_in_list( $sym9$EVALUATION_RELATED_ASENT_, clauses.pos_lits( contextualized_dnf_clause ), $sym10$CONTEXTUALIZED_ASENT_ASENT ) && NIL != total_evaluation_related_conjunction_solvableP(
        contextualized_dnf_clause, UNPROVIDED, UNPROVIDED ) )
    {
      return ConsesLow.list( clause_utilities.new_total_subclause_spec( contextualized_dnf_clause ) );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-evaluate.lisp", position = 5024L)
  public static SubLObject total_evaluation_related_conjunction_solvableP(final SubLObject contextualized_dnf_clause, SubLObject bound_vars, SubLObject done_lits)
  {
    if( bound_vars == UNPROVIDED )
    {
      bound_vars = NIL;
    }
    if( done_lits == UNPROVIDED )
    {
      done_lits = NIL;
    }
    SubLObject doneP = NIL;
    SubLObject result = NIL;
    if( Sequences.length( done_lits ).numE( clause_utilities.clause_literal_count( contextualized_dnf_clause ) ) )
    {
      return T;
    }
    SubLObject lit_index = ZERO_INTEGER;
    SubLObject rest;
    SubLObject lit;
    SubLObject lit_sense;
    SubLObject lit_sense_index;
    SubLObject solvableP;
    SubLObject new_bound_vars;
    SubLObject new_done_lits;
    for( rest = NIL, rest = clauses.neg_lits( contextualized_dnf_clause ); NIL == doneP && NIL != rest; rest = rest.rest() )
    {
      lit = rest.first();
      lit_sense = $kw2$NEG;
      lit_sense_index = ConsesLow.cons( lit_sense, lit_index );
      if( NIL == subl_promotions.memberP( lit_sense_index, done_lits, Symbols.symbol_function( EQUAL ), UNPROVIDED ) )
      {
        solvableP = evaluation_related_contextualized_asent_solvableP( lit, lit_sense, bound_vars );
        if( NIL != solvableP )
        {
          new_bound_vars = ( NIL != cycl_grammar.hl_variable_p( solvableP ) ) ? ConsesLow.cons( solvableP, bound_vars ) : bound_vars;
          new_done_lits = ConsesLow.cons( lit_sense_index, done_lits );
          result = total_evaluation_related_conjunction_solvableP( contextualized_dnf_clause, new_bound_vars, new_done_lits );
          if( NIL != result )
          {
            doneP = T;
          }
        }
      }
      lit_index = Numbers.add( lit_index, ONE_INTEGER );
    }
    lit_index = ZERO_INTEGER;
    for( rest = NIL, rest = clauses.pos_lits( contextualized_dnf_clause ); NIL == doneP && NIL != rest; rest = rest.rest() )
    {
      lit = rest.first();
      lit_sense = $kw1$POS;
      lit_sense_index = ConsesLow.cons( lit_sense, lit_index );
      if( NIL == subl_promotions.memberP( lit_sense_index, done_lits, Symbols.symbol_function( EQUAL ), UNPROVIDED ) )
      {
        solvableP = evaluation_related_contextualized_asent_solvableP( lit, lit_sense, bound_vars );
        if( NIL != solvableP )
        {
          new_bound_vars = ( NIL != cycl_grammar.hl_variable_p( solvableP ) ) ? ConsesLow.cons( solvableP, bound_vars ) : bound_vars;
          new_done_lits = ConsesLow.cons( lit_sense_index, done_lits );
          result = total_evaluation_related_conjunction_solvableP( contextualized_dnf_clause, new_bound_vars, new_done_lits );
          if( NIL != result )
          {
            doneP = T;
          }
        }
      }
      lit_index = Numbers.add( lit_index, ONE_INTEGER );
    }
    return result;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-evaluate.lisp", position = 5941L)
  public static SubLObject evaluation_related_contextualized_asent_solvableP(final SubLObject contextualized_asent, final SubLObject sense, final SubLObject bound_vars)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject mt = NIL;
    SubLObject asent = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( contextualized_asent, contextualized_asent, $list12 );
    mt = contextualized_asent.first();
    SubLObject current = contextualized_asent.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, contextualized_asent, $list12 );
    asent = current.first();
    current = current.rest();
    if( NIL == current )
    {
      final SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate( mt );
      final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding( thread );
      final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding( thread );
      final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding( thread );
      try
      {
        mt_relevance_macros.$mt$.bind( mt_relevance_macros.update_inference_mt_relevance_mt( mt_var ), thread );
        mt_relevance_macros.$relevant_mt_function$.bind( mt_relevance_macros.update_inference_mt_relevance_function( mt_var ), thread );
        mt_relevance_macros.$relevant_mts$.bind( mt_relevance_macros.update_inference_mt_relevance_mt_list( mt_var ), thread );
        if( sense == $kw1$POS && NIL != el_utilities.evaluate_litP( asent, UNPROVIDED ) )
        {
          if( NIL != el_utilities.potentially_solvable_evaluate_asentP( asent ) )
          {
            return cycl_utilities.atomic_sentence_arg1( asent, UNPROVIDED );
          }
        }
        else
        {
          if( NIL == el_utilities.el_formula_p( asent ) || NIL == relation_evaluation.evaluatable_relationP( cycl_utilities.formula_operator( asent ) ) )
          {
            return NIL;
          }
          final SubLObject hl_vars = cycl_utilities.expression_gather( asent, $sym14$HL_VAR_, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
          if( NIL != conses_high.subsetp( hl_vars, bound_vars, UNPROVIDED, UNPROVIDED ) )
          {
            return T;
          }
        }
      }
      finally
      {
        mt_relevance_macros.$relevant_mts$.rebind( _prev_bind_3, thread );
        mt_relevance_macros.$relevant_mt_function$.rebind( _prev_bind_2, thread );
        mt_relevance_macros.$mt$.rebind( _prev_bind_0, thread );
      }
    }
    else
    {
      cdestructuring_bind.cdestructuring_bind_error( contextualized_asent, $list12 );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-evaluate.lisp", position = 6548L)
  public static SubLObject evaluation_related_asentP(final SubLObject v_object)
  {
    return makeBoolean( ( NIL != el_utilities.el_formula_p( v_object ) && NIL != relation_evaluation.evaluatable_relationP( cycl_utilities.formula_operator( v_object ) ) ) || NIL != el_utilities.evaluate_litP( v_object,
        UNPROVIDED ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-evaluate.lisp", position = 6740L)
  public static SubLObject removal_evaluate_bind_conjunction_expand(final SubLObject contextualized_dnf_clause)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    thread.resetMultipleValues();
    final SubLObject v_bindings = total_evaluation_related_conjunction_solution( contextualized_dnf_clause, UNPROVIDED, UNPROVIDED, UNPROVIDED );
    final SubLObject supports = thread.secondMultipleValue();
    thread.resetMultipleValues();
    if( NIL != supports && NIL == bindings.some_variable_with_conflicting_bindings( v_bindings, v_bindings ) )
    {
      inference_worker_removal.conjunctive_removal_callback( v_bindings, supports );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-evaluate.lisp", position = 7203L)
  public static SubLObject total_evaluation_related_conjunction_solution(final SubLObject contextualized_dnf_clause, SubLObject v_bindings, SubLObject supports, SubLObject done_lits)
  {
    if( v_bindings == UNPROVIDED )
    {
      v_bindings = NIL;
    }
    if( supports == UNPROVIDED )
    {
      supports = NIL;
    }
    if( done_lits == UNPROVIDED )
    {
      done_lits = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( Sequences.length( done_lits ).numE( clause_utilities.clause_literal_count( contextualized_dnf_clause ) ) )
    {
      return Values.values( v_bindings, supports );
    }
    SubLObject lit_index = ZERO_INTEGER;
    SubLObject cdolist_list_var = clauses.neg_lits( contextualized_dnf_clause );
    SubLObject lit = NIL;
    lit = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      final SubLObject lit_sense = $kw2$NEG;
      final SubLObject lit_sense_index = ConsesLow.cons( lit_sense, lit_index );
      if( NIL == subl_promotions.memberP( lit_sense_index, done_lits, Symbols.symbol_function( EQUAL ), UNPROVIDED ) )
      {
        thread.resetMultipleValues();
        final SubLObject new_bindings = evaluation_related_contextualized_asent_solution( lit, lit_sense, v_bindings );
        final SubLObject additional_supports = thread.secondMultipleValue();
        thread.resetMultipleValues();
        final SubLObject item_var = additional_supports;
        if( NIL == conses_high.member( item_var, supports, Symbols.symbol_function( EQL ), Symbols.symbol_function( IDENTITY ) ) )
        {
          supports = ConsesLow.cons( item_var, supports );
        }
        if( NIL != additional_supports )
        {
          final SubLObject new_done_lits = ConsesLow.cons( lit_sense_index, done_lits );
          return total_evaluation_related_conjunction_solution( contextualized_dnf_clause, new_bindings, supports, new_done_lits );
        }
      }
      lit_index = Numbers.add( lit_index, ONE_INTEGER );
      cdolist_list_var = cdolist_list_var.rest();
      lit = cdolist_list_var.first();
    }
    lit_index = ZERO_INTEGER;
    cdolist_list_var = clauses.pos_lits( contextualized_dnf_clause );
    lit = NIL;
    lit = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      final SubLObject lit_sense = $kw1$POS;
      final SubLObject lit_sense_index = ConsesLow.cons( lit_sense, lit_index );
      if( NIL == subl_promotions.memberP( lit_sense_index, done_lits, Symbols.symbol_function( EQUAL ), UNPROVIDED ) )
      {
        thread.resetMultipleValues();
        final SubLObject new_bindings = evaluation_related_contextualized_asent_solution( lit, lit_sense, v_bindings );
        final SubLObject additional_supports = thread.secondMultipleValue();
        thread.resetMultipleValues();
        final SubLObject item_var = additional_supports;
        if( NIL == conses_high.member( item_var, supports, Symbols.symbol_function( EQL ), Symbols.symbol_function( IDENTITY ) ) )
        {
          supports = ConsesLow.cons( item_var, supports );
        }
        if( NIL != additional_supports )
        {
          final SubLObject new_done_lits = ConsesLow.cons( lit_sense_index, done_lits );
          return total_evaluation_related_conjunction_solution( contextualized_dnf_clause, new_bindings, supports, new_done_lits );
        }
      }
      lit_index = Numbers.add( lit_index, ONE_INTEGER );
      cdolist_list_var = cdolist_list_var.rest();
      lit = cdolist_list_var.first();
    }
    return Values.values( NIL, NIL );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-evaluate.lisp", position = 8072L)
  public static SubLObject evaluation_related_contextualized_asent_solution(final SubLObject contextualized_asent, final SubLObject sense, SubLObject v_bindings)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject supports = NIL;
    SubLObject mt = NIL;
    SubLObject asent = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( contextualized_asent, contextualized_asent, $list12 );
    mt = contextualized_asent.first();
    SubLObject current = contextualized_asent.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, contextualized_asent, $list12 );
    asent = current.first();
    current = current.rest();
    if( NIL == current )
    {
      final SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate( mt );
      final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding( thread );
      final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding( thread );
      final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding( thread );
      try
      {
        mt_relevance_macros.$mt$.bind( mt_relevance_macros.update_inference_mt_relevance_mt( mt_var ), thread );
        mt_relevance_macros.$relevant_mt_function$.bind( mt_relevance_macros.update_inference_mt_relevance_function( mt_var ), thread );
        mt_relevance_macros.$relevant_mts$.bind( mt_relevance_macros.update_inference_mt_relevance_mt_list( mt_var ), thread );
        if( NIL != el_utilities.evaluate_litP( asent, UNPROVIDED ) )
        {
          final SubLObject arg1 = cycl_utilities.atomic_sentence_arg1( asent, UNPROVIDED );
          final SubLObject expression = bindings.apply_bindings( v_bindings, cycl_utilities.atomic_sentence_arg2( asent, UNPROVIDED ) );
          thread.resetMultipleValues();
          final SubLObject v_answer = relation_evaluation.cyc_evaluate( expression );
          final SubLObject validP = thread.secondMultipleValue();
          final SubLObject contextualizedP = thread.thirdMultipleValue();
          thread.resetMultipleValues();
          if( NIL != validP )
          {
            thread.resetMultipleValues();
            SubLObject additional_bindings = unification_utilities.term_unify( arg1, v_answer, T, T );
            final SubLObject unify_justification = thread.secondMultipleValue();
            thread.resetMultipleValues();
            if( NIL != additional_bindings )
            {
              if( NIL != bindings.unification_success_token_p( additional_bindings ) )
              {
                additional_bindings = NIL;
              }
              final SubLObject subst_arg1 = bindings.apply_bindings( additional_bindings, arg1 );
              final SubLObject sentence = make_evaluate_sentence( subst_arg1, expression );
              SubLObject support = NIL;
              support = removal_modules_evaluation.make_eval_support( sentence, contextualizedP );
              v_bindings = Sequences.remove_duplicates( ConsesLow.append( v_bindings, additional_bindings ), Symbols.symbol_function( EQUAL ), UNPROVIDED, UNPROVIDED, UNPROVIDED );
              supports = ( NIL != unify_justification ) ? ConsesLow.list( support, unify_justification ) : ConsesLow.list( support );
              return Values.values( v_bindings, supports );
            }
          }
        }
        else
        {
          if( NIL == el_utilities.el_formula_p( asent ) || NIL == relation_evaluation.evaluatable_relationP( cycl_utilities.formula_operator( asent ) ) )
          {
            return Values.values( v_bindings, NIL );
          }
          asent = bindings.apply_bindings( v_bindings, asent );
          thread.resetMultipleValues();
          final SubLObject v_answer2 = relation_evaluation.cyc_evaluate( asent );
          final SubLObject validP2 = thread.secondMultipleValue();
          final SubLObject contextualizedP2 = thread.thirdMultipleValue();
          thread.resetMultipleValues();
          if( NIL != validP2 && NIL != ( ( sense == $kw1$POS ) ? v_answer2 : makeBoolean( NIL == v_answer2 ) ) )
          {
            final SubLObject hl_support_formula = backward_utilities.inference_canonicalize_hl_support_literal( asent );
            SubLObject support2 = NIL;
            support2 = ( ( sense == $kw1$POS ) ? removal_modules_evaluation.make_eval_support( hl_support_formula, contextualizedP2 )
                : removal_modules_evaluation.make_eval_support( cycl_utilities.negate( hl_support_formula ), contextualizedP2 ) );
            return Values.values( v_bindings, ConsesLow.list( support2 ) );
          }
          return Values.values( NIL, NIL );
        }
      }
      finally
      {
        mt_relevance_macros.$relevant_mts$.rebind( _prev_bind_3, thread );
        mt_relevance_macros.$relevant_mt_function$.rebind( _prev_bind_2, thread );
        mt_relevance_macros.$mt$.rebind( _prev_bind_0, thread );
      }
    }
    else
    {
      cdestructuring_bind.cdestructuring_bind_error( contextualized_asent, $list12 );
    }
    return NIL;
  }

  public static SubLObject declare_removal_modules_evaluate_file()
  {
    SubLFiles.declareFunction( me, "make_evaluate_sentence", "MAKE-EVALUATE-SENTENCE", 2, 0, false );
    SubLFiles.declareFunction( me, "removal_evaluate_bind_expand", "REMOVAL-EVALUATE-BIND-EXPAND", 1, 1, false );
    SubLFiles.declareFunction( me, "removal_evaluate_neg_check_expand", "REMOVAL-EVALUATE-NEG-CHECK-EXPAND", 1, 1, false );
    SubLFiles.declareFunction( me, "removal_evaluate_bind_conjunction_applicability", "REMOVAL-EVALUATE-BIND-CONJUNCTION-APPLICABILITY", 1, 0, false );
    SubLFiles.declareFunction( me, "total_evaluation_related_conjunction_solvableP", "TOTAL-EVALUATION-RELATED-CONJUNCTION-SOLVABLE?", 1, 2, false );
    SubLFiles.declareFunction( me, "evaluation_related_contextualized_asent_solvableP", "EVALUATION-RELATED-CONTEXTUALIZED-ASENT-SOLVABLE?", 3, 0, false );
    SubLFiles.declareFunction( me, "evaluation_related_asentP", "EVALUATION-RELATED-ASENT?", 1, 0, false );
    SubLFiles.declareFunction( me, "removal_evaluate_bind_conjunction_expand", "REMOVAL-EVALUATE-BIND-CONJUNCTION-EXPAND", 1, 0, false );
    SubLFiles.declareFunction( me, "total_evaluation_related_conjunction_solution", "TOTAL-EVALUATION-RELATED-CONJUNCTION-SOLUTION", 1, 3, false );
    SubLFiles.declareFunction( me, "evaluation_related_contextualized_asent_solution", "EVALUATION-RELATED-CONTEXTUALIZED-ASENT-SOLUTION", 3, 0, false );
    return NIL;
  }

  public static SubLObject init_removal_modules_evaluate_file()
  {
    $default_evaluate_bind_cost$ = SubLFiles.defparameter( "*DEFAULT-EVALUATE-BIND-COST*", ONE_INTEGER );
    return NIL;
  }

  public static SubLObject setup_removal_modules_evaluate_file()
  {
    inference_modules.register_solely_specific_removal_module_predicate( $const0$evaluate );
    preference_modules.doomed_unless_arg_bindable( $kw1$POS, $const0$evaluate, TWO_INTEGER );
    preference_modules.doomed_unless_all_args_bindable( $kw2$NEG, $const0$evaluate );
    inference_modules.inference_removal_module( $kw3$REMOVAL_EVALUATE_BIND, $list4 );
    inference_modules.inference_removal_module( $kw5$REMOVAL_EVALUATE_NEG_CHECK, $list6 );
    inference_modules.inference_conjunctive_removal_module( $kw7$REMOVAL_EVALUATE_BIND_CONJUNCTION, $list8 );
    utilities_macros.note_funcall_helper_function( $sym11$REMOVAL_EVALUATE_BIND_CONJUNCTION_APPLICABILITY );
    utilities_macros.note_funcall_helper_function( $sym15$REMOVAL_EVALUATE_BIND_CONJUNCTION_EXPAND );
    return NIL;
  }

  @Override
  public void declareFunctions()
  {
    declare_removal_modules_evaluate_file();
  }

  @Override
  public void initializeVariables()
  {
    init_removal_modules_evaluate_file();
  }

  @Override
  public void runTopLevelForms()
  {
    setup_removal_modules_evaluate_file();
  }
  static
  {
    me = new removal_modules_evaluate();
    $default_evaluate_bind_cost$ = null;
    $const0$evaluate = constant_handles.reader_make_constant_shell( makeString( "evaluate" ) );
    $kw1$POS = makeKeyword( "POS" );
    $kw2$NEG = makeKeyword( "NEG" );
    $kw3$REMOVAL_EVALUATE_BIND = makeKeyword( "REMOVAL-EVALUATE-BIND" );
    $list4 = ConsesLow.list( new SubLObject[] { makeKeyword( "SENSE" ), makeKeyword( "POS" ), makeKeyword( "PREDICATE" ), constant_handles.reader_make_constant_shell( makeString( "evaluate" ) ), makeKeyword(
        "REQUIRED-PATTERN" ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "evaluate" ) ), makeKeyword( "ANYTHING" ), ConsesLow.list( makeKeyword( "AND" ), makeKeyword( "FULLY-BOUND" ),
            ConsesLow.list( makeKeyword( "TEST" ), makeSymbol( "EVALUATABLE-EXPRESSION?" ) ) ) ), makeKeyword( "COST-EXPRESSION" ), makeSymbol( "*DEFAULT-EVALUATE-BIND-COST*" ), makeKeyword( "COMPLETENESS" ),
      makeKeyword( "COMPLETE" ), makeKeyword( "EXPAND" ), makeSymbol( "REMOVAL-EVALUATE-BIND-EXPAND" ), makeKeyword( "DOCUMENTATION" ), makeString(
          "(#$evaluate <whatever> (<evaluatable function . <fully bound>))\n using the #$evaluationDefn for the function" ), makeKeyword( "EXAMPLE" ), makeString(
              "(#$evaluate ?SUM (#$PlusFn 1 2))\n (#$evaluate 3 (#$PlusFn 1 2))" )
    } );
    $kw5$REMOVAL_EVALUATE_NEG_CHECK = makeKeyword( "REMOVAL-EVALUATE-NEG-CHECK" );
    $list6 = ConsesLow.list( new SubLObject[] { makeKeyword( "SENSE" ), makeKeyword( "NEG" ), makeKeyword( "PREDICATE" ), constant_handles.reader_make_constant_shell( makeString( "evaluate" ) ), makeKeyword(
        "REQUIRED-PATTERN" ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "evaluate" ) ), makeKeyword( "FULLY-BOUND" ), ConsesLow.list( makeKeyword( "AND" ), makeKeyword( "FULLY-BOUND" ),
            ConsesLow.list( makeKeyword( "TEST" ), makeSymbol( "EVALUATABLE-EXPRESSION?" ) ) ) ), makeKeyword( "COST-EXPRESSION" ), makeSymbol( "*DEFAULT-EVALUATE-BIND-COST*" ), makeKeyword( "COMPLETENESS" ),
      makeKeyword( "COMPLETE" ), makeKeyword( "EXPAND" ), makeSymbol( "REMOVAL-EVALUATE-NEG-CHECK-EXPAND" ), makeKeyword( "DOCUMENTATION" ), makeString(
          "(#$not (#$evaluate <fully bound> (<evaluatable function . <fully bound>)))\nusing the #$evaluationDefn for the function" ), makeKeyword( "EXAMPLE" ), makeString( "(#$not (#$evaluate 4 (#$PlusFn 1 2)))" )
    } );
    $kw7$REMOVAL_EVALUATE_BIND_CONJUNCTION = makeKeyword( "REMOVAL-EVALUATE-BIND-CONJUNCTION" );
    $list8 = ConsesLow.list( new SubLObject[] { makeKeyword( "APPLICABILITY" ), makeSymbol( "REMOVAL-EVALUATE-BIND-CONJUNCTION-APPLICABILITY" ), makeKeyword( "COST-EXPRESSION" ), makeSymbol(
        "*DEFAULT-EVALUATE-BIND-COST*" ), makeKeyword( "COMPLETENESS" ), makeKeyword( "COMPLETE" ), makeKeyword( "EXPAND" ), makeSymbol( "REMOVAL-EVALUATE-BIND-CONJUNCTION-EXPAND" ), makeKeyword( "DOCUMENTATION" ),
      makeString( "Solves a connected conjunction of literals where at least one literal is an #$evaluate and the rest are evaluatable." ), makeKeyword( "EXAMPLE" ), makeString(
          "(#$and \n     (#$greaterThanOrEqualTo ?VAR0 (#$MonthsDuration 6)) \n     (#$evaluate ?VAR0 \n       (#$TimeElapsedFn \n         (#$SecondFn 0 (#$MinuteFn 59 (#$HourFn 23 (#$DayFn 25 (#$MonthFn #$February (#$YearFn 2010))))))\n         (#$SecondFn 0 (#$MinuteFn 51 (#$HourFn 8 (#$DayFn 22 (#$MonthFn #$April (#$YearFn 2010)))))))))" )
    } );
    $sym9$EVALUATION_RELATED_ASENT_ = makeSymbol( "EVALUATION-RELATED-ASENT?" );
    $sym10$CONTEXTUALIZED_ASENT_ASENT = makeSymbol( "CONTEXTUALIZED-ASENT-ASENT" );
    $sym11$REMOVAL_EVALUATE_BIND_CONJUNCTION_APPLICABILITY = makeSymbol( "REMOVAL-EVALUATE-BIND-CONJUNCTION-APPLICABILITY" );
    $list12 = ConsesLow.list( makeSymbol( "MT" ), makeSymbol( "ASENT" ) );
    $sym13$_EXIT = makeSymbol( "%EXIT" );
    $sym14$HL_VAR_ = makeSymbol( "HL-VAR?" );
    $sym15$REMOVAL_EVALUATE_BIND_CONJUNCTION_EXPAND = makeSymbol( "REMOVAL-EVALUATE-BIND-CONJUNCTION-EXPAND" );
  }
}
/*
 * 
 * Total time: 244 ms
 * 
 */