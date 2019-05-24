package com.cyc.cycjava.cycl.inference.modules.removal;

import com.cyc.cycjava.cycl.constant_handles;
import com.cyc.cycjava.cycl.inference.modules.preference_modules;
import com.cyc.cycjava.cycl.inference.harness.inference_modules;
import com.cyc.cycjava.cycl.control_vars;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.cycjava.cycl.kb_mapping_utilities;
import com.cyc.cycjava.cycl.somewhere_cache;
import com.cyc.cycjava.cycl.wff;
import com.cyc.cycjava.cycl.uncanonicalizer;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads;
import com.cyc.cycjava.cycl.iteration;
import com.cyc.cycjava.cycl.kb_mapping_macros;
import com.cyc.cycjava.cycl.backward_utilities;
import com.cyc.cycjava.cycl.czer_main;
import com.cyc.cycjava.cycl.unification_utilities;
import com.cyc.cycjava.cycl.genls;
import com.cyc.cycjava.cycl.genl_predicates;
import com.cyc.cycjava.cycl.forts;
import com.cyc.cycjava.cycl.equals;
import com.cyc.cycjava.cycl.cycl_variables;
import com.cyc.cycjava.cycl.narts_high;
import com.cyc.cycjava.cycl.nart_handles;
import com.cyc.cycjava.cycl.fort_types_interface;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.cycjava.cycl.subl_promotions;
import com.cyc.cycjava.cycl.bindings;
import com.cyc.cycjava.cycl.variables;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.cycjava.cycl.cycl_utilities;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import com.cyc.cycjava.cycl.unification;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.cycjava.cycl.subl_macro_promotions;
import com.cyc.cycjava.cycl.cycl_grammar;
import com.cyc.cycjava.cycl.backward;
import com.cyc.cycjava.cycl.el_utilities;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.cycjava.cycl.arguments;
import com.cyc.cycjava.cycl.mt_relevance_macros;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class removal_modules_formula_implies
    extends
      SubLTranslatedFile
{
  public static final SubLFile me;
  public static final String myName = "com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_formula_implies";
  public static final String myFingerPrint = "1d9c0c4e0fd0dcccef160d101cb2aa9925611af0f1d6a41acbaeab26fe56aa73";
  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-formula-implies.lisp", position = 1069L)
  private static SubLSymbol $removal_formula_implies_allow_subsumption$;
  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-formula-implies.lisp", position = 2094L)
  private static SubLSymbol $default_removal_formula_implies_pos_check_cost$;
  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-formula-implies.lisp", position = 5772L)
  private static SubLSymbol $default_removal_formula_equiv_pos_check_cost$;
  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-formula-implies.lisp", position = 6451L)
  private static SubLSymbol $inference_formula_equiv_commutative_relation_table$;
  private static final SubLObject $const0$sentenceImplies;
  private static final SubLSymbol $kw1$REMOVAL_FORMULA_IMPLIES_POS_CHECK;
  private static final SubLList $list2;
  private static final SubLSymbol $kw3$OPAQUE;
  private static final SubLSymbol $kw4$TRUE_MON;
  private static final SubLObject $const5$sentenceImpliesViaSubsumption;
  private static final SubLSymbol $kw6$REMOVAL_FORMULA_IMPLIES_SUBSUMPTION_POS_CHECK;
  private static final SubLList $list7;
  private static final SubLObject $const8$sentenceEquiv;
  private static final SubLSymbol $kw9$REMOVAL_FORMULA_EQUIV_POS_CHECK;
  private static final SubLList $list10;
  private static final SubLSymbol $sym11$CATCH_ERROR_MESSAGE_HANDLER;
  private static final SubLObject $const12$and;
  private static final SubLObject $const13$or;
  private static final SubLObject $const14$not;
  private static final SubLObject $const15$thereExists;
  private static final SubLObject $const16$forAll;
  private static final SubLObject $const17$TheSetOf;
  private static final SubLObject $const18$implies;
  private static final SubLSymbol $sym19$CAR;
  private static final SubLObject $const20$sentenceImplicationConditions;
  private static final SubLSymbol $kw21$POS;
  private static final SubLSymbol $kw22$REMOVAL_SENTENCE_IMPLICATION_CONDITIONS;
  private static final SubLList $list23;
  private static final SubLObject $const24$isa;
  private static final SubLSymbol $kw25$RULE;
  private static final SubLObject $const26$genls;
  private static final SubLSymbol $sym27$EL_VAR_;
  private static final SubLObject $const28$BaseKB;
  private static final SubLObject $const29$ruleTrivialForSentenceImplication;

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-formula-implies.lisp", position = 2212L)
  public static SubLObject make_formula_implies_hl_support(final SubLObject antecedent, final SubLObject consequent)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject support_formula = ConsesLow.list( $const0$sentenceImplies, antecedent, consequent );
    return arguments.make_hl_support( $kw3$OPAQUE, support_formula, mt_relevance_macros.$mt$.getDynamicValue( thread ), $kw4$TRUE_MON );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-formula-implies.lisp", position = 2427L)
  public static SubLObject removal_formula_implies_pos_check_expand(final SubLObject literal, SubLObject sense)
  {
    if( sense == UNPROVIDED )
    {
      sense = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject antecedent = el_utilities.literal_arg1( literal, UNPROVIDED );
    final SubLObject consequent = el_utilities.literal_arg2( literal, UNPROVIDED );
    final SubLObject _prev_bind_0 = $removal_formula_implies_allow_subsumption$.currentBinding( thread );
    try
    {
      $removal_formula_implies_allow_subsumption$.bind( NIL, thread );
      if( NIL != inference_formula_implies( antecedent, consequent ) )
      {
        final SubLObject hl_support = make_formula_implies_hl_support( antecedent, consequent );
        backward.removal_add_node( hl_support, UNPROVIDED, UNPROVIDED );
      }
    }
    finally
    {
      $removal_formula_implies_allow_subsumption$.rebind( _prev_bind_0, thread );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-formula-implies.lisp", position = 4075L)
  public static SubLObject make_formula_implies_subsumption_hl_support(final SubLObject antecedent, final SubLObject consequent)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject support_formula = ConsesLow.list( $const5$sentenceImpliesViaSubsumption, antecedent, consequent );
    return arguments.make_hl_support( $kw3$OPAQUE, support_formula, mt_relevance_macros.$mt$.getDynamicValue( thread ), $kw4$TRUE_MON );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-formula-implies.lisp", position = 4330L)
  public static SubLObject removal_formula_implies_subsumption_pos_check_expand(final SubLObject literal, SubLObject sense)
  {
    if( sense == UNPROVIDED )
    {
      sense = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject antecedent = el_utilities.literal_arg1( literal, UNPROVIDED );
    final SubLObject consequent = el_utilities.literal_arg2( literal, UNPROVIDED );
    final SubLObject _prev_bind_0 = $removal_formula_implies_allow_subsumption$.currentBinding( thread );
    try
    {
      $removal_formula_implies_allow_subsumption$.bind( T, thread );
      if( NIL != inference_formula_implies( antecedent, consequent ) )
      {
        final SubLObject hl_support = make_formula_implies_subsumption_hl_support( antecedent, consequent );
        backward.removal_add_node( hl_support, UNPROVIDED, UNPROVIDED );
      }
    }
    finally
    {
      $removal_formula_implies_allow_subsumption$.rebind( _prev_bind_0, thread );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-formula-implies.lisp", position = 5888L)
  public static SubLObject make_formula_equiv_hl_support(final SubLObject formula1, final SubLObject formula2)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject support_formula = ConsesLow.list( $const8$sentenceEquiv, formula1, formula2 );
    return arguments.make_hl_support( $kw3$OPAQUE, support_formula, mt_relevance_macros.$mt$.getDynamicValue( thread ), $kw4$TRUE_MON );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-formula-implies.lisp", position = 6091L)
  public static SubLObject removal_formula_equiv_pos_check_expand(final SubLObject literal, SubLObject sense)
  {
    if( sense == UNPROVIDED )
    {
      sense = NIL;
    }
    final SubLObject formula1 = el_utilities.literal_arg1( literal, UNPROVIDED );
    final SubLObject formula2 = el_utilities.literal_arg2( literal, UNPROVIDED );
    if( NIL != inference_formula_equiv( formula1, formula2 ) )
    {
      final SubLObject hl_support = make_formula_equiv_hl_support( formula1, formula2 );
      backward.removal_add_node( hl_support, UNPROVIDED, UNPROVIDED );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-formula-implies.lisp", position = 7621L)
  public static SubLObject inference_formula_equiv(final SubLObject formula1, final SubLObject formula2)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL == cycl_grammar.cycl_sentence_p( formula1 ) || NIL == cycl_grammar.cycl_sentence_p( formula2 ) )
    {
      return NIL;
    }
    SubLObject error_message = NIL;
    SubLObject v_answer = NIL;
    try
    {
      thread.throwStack.push( subl_macro_promotions.$catch_error_message_target$.getGlobalValue() );
      final SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding( thread );
      try
      {
        Errors.$error_handler$.bind( $sym11$CATCH_ERROR_MESSAGE_HANDLER, thread );
        try
        {
          final SubLObject _prev_bind_0_$1 = $inference_formula_equiv_commutative_relation_table$.currentBinding( thread );
          try
          {
            $inference_formula_equiv_commutative_relation_table$.bind( NIL, thread );
            final SubLObject formula1_hl = canonicalize_scoped_el_existentials_to_hl( formula1 );
            final SubLObject formula2_hl = unification.non_base_variable_transform( canonicalize_scoped_el_existentials_to_hl( formula2 ) );
            v_answer = makeBoolean( NIL != inference_formula_implies_formula( formula1_hl, formula2_hl, NIL ) && NIL != inference_formula_implies_formula( formula2_hl, formula1_hl, NIL ) );
          }
          finally
          {
            $inference_formula_equiv_commutative_relation_table$.rebind( _prev_bind_0_$1, thread );
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
    if( NIL != error_message )
    {
      return NIL;
    }
    return v_answer;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-formula-implies.lisp", position = 8550L)
  public static SubLObject inference_formula_implies(final SubLObject antecedent, final SubLObject consequent)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL == cycl_grammar.cycl_sentence_p( antecedent ) || NIL == cycl_grammar.cycl_sentence_p( consequent ) )
    {
      return NIL;
    }
    SubLObject error_message = NIL;
    SubLObject v_answer = NIL;
    try
    {
      thread.throwStack.push( subl_macro_promotions.$catch_error_message_target$.getGlobalValue() );
      final SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding( thread );
      try
      {
        Errors.$error_handler$.bind( $sym11$CATCH_ERROR_MESSAGE_HANDLER, thread );
        try
        {
          final SubLObject _prev_bind_0_$2 = $inference_formula_equiv_commutative_relation_table$.currentBinding( thread );
          try
          {
            $inference_formula_equiv_commutative_relation_table$.bind( NIL, thread );
            final SubLObject antecedent_hl = canonicalize_scoped_el_existentials_to_hl( antecedent );
            final SubLObject consequent_hl = unification.non_base_variable_transform( canonicalize_scoped_el_existentials_to_hl( consequent ) );
            v_answer = inference_formula_implies_formula( antecedent_hl, consequent_hl, NIL );
          }
          finally
          {
            $inference_formula_equiv_commutative_relation_table$.rebind( _prev_bind_0_$2, thread );
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
    if( NIL != error_message )
    {
      return NIL;
    }
    return v_answer;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-formula-implies.lisp", position = 9406L)
  public static SubLObject canonicalize_scoped_el_existentials_to_hl(SubLObject expression)
  {
    SubLObject v_bindings = NIL;
    while ( NIL != el_utilities.el_existential_p( expression ))
    {
      final SubLObject quant_formula = cycl_utilities.atomic_sentence_arg2( expression, UNPROVIDED );
      final SubLObject quant_variable_el = cycl_utilities.atomic_sentence_arg1( expression, UNPROVIDED );
      final SubLObject quant_variable_hl = variables.get_variable( Sequences.length( v_bindings ) );
      v_bindings = ConsesLow.cons( ConsesLow.cons( quant_variable_el, quant_variable_hl ), v_bindings );
      expression = quant_formula;
    }
    final SubLObject expression_hl = bindings.subst_bindings( v_bindings, expression );
    return subl_promotions.values2( expression_hl, v_bindings );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-formula-implies.lisp", position = 9945L)
  public static SubLObject inference_formula_implies_in_mt(final SubLObject antecedent, final SubLObject consequent, final SubLObject mt)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject result = NIL;
    final SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate( mt );
    final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding( thread );
    final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding( thread );
    final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding( thread );
    try
    {
      mt_relevance_macros.$mt$.bind( mt_relevance_macros.update_inference_mt_relevance_mt( mt_var ), thread );
      mt_relevance_macros.$relevant_mt_function$.bind( mt_relevance_macros.update_inference_mt_relevance_function( mt_var ), thread );
      mt_relevance_macros.$relevant_mts$.bind( mt_relevance_macros.update_inference_mt_relevance_mt_list( mt_var ), thread );
      result = inference_formula_implies( antecedent, consequent );
    }
    finally
    {
      mt_relevance_macros.$relevant_mts$.rebind( _prev_bind_3, thread );
      mt_relevance_macros.$relevant_mt_function$.rebind( _prev_bind_2, thread );
      mt_relevance_macros.$mt$.rebind( _prev_bind_0, thread );
    }
    return result;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-formula-implies.lisp", position = 10167L)
  public static SubLObject inference_formula_equiv_commutative_relationP(final SubLObject relation)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject info = conses_high.assoc( relation, $inference_formula_equiv_commutative_relation_table$.getDynamicValue( thread ), UNPROVIDED, UNPROVIDED );
    if( NIL != info )
    {
      return info.rest();
    }
    final SubLObject v_answer = fort_types_interface.commutative_relationP( relation );
    $inference_formula_equiv_commutative_relation_table$.setDynamicValue( ConsesLow.cons( ConsesLow.cons( relation, v_answer ), $inference_formula_equiv_commutative_relation_table$.getDynamicValue( thread ) ), thread );
    return v_answer;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-formula-implies.lisp", position = 10551L)
  public static SubLObject inference_formula_implies_formula(SubLObject antecedent, SubLObject consequent, final SubLObject v_bindings)
  {
    if( antecedent.equal( consequent ) )
    {
      return subl_promotions.values2( T, v_bindings );
    }
    if( NIL != cycl_grammar.cycl_true_p( consequent ) )
    {
      return subl_promotions.values2( T, v_bindings );
    }
    if( NIL != nart_handles.nart_p( antecedent ) )
    {
      return inference_formula_implies_formula( narts_high.nart_hl_formula( antecedent ), consequent, v_bindings );
    }
    if( NIL != nart_handles.nart_p( consequent ) )
    {
      return inference_formula_implies_formula( antecedent, narts_high.nart_hl_formula( consequent ), v_bindings );
    }
    if( antecedent.isAtom() )
    {
      return inference_formula_implies_term( antecedent, consequent, v_bindings );
    }
    antecedent = inference_formula_implies_eliminate_double_negations( inference_formula_implies_eliminate_implication( antecedent ) );
    consequent = inference_formula_implies_eliminate_double_negations( inference_formula_implies_eliminate_implication( consequent ) );
    final SubLObject pcase_var;
    final SubLObject ante_relator = pcase_var = antecedent.first();
    if( pcase_var.eql( $const12$and ) )
    {
      return inference_formula_implies_and( antecedent, consequent, v_bindings );
    }
    if( pcase_var.eql( $const13$or ) )
    {
      return inference_formula_implies_or( antecedent, consequent, v_bindings );
    }
    if( pcase_var.eql( $const14$not ) )
    {
      return inference_formula_implies_not( antecedent, consequent, v_bindings );
    }
    if( pcase_var.eql( $const15$thereExists ) )
    {
      return inference_formula_implies_exists( antecedent, consequent, v_bindings );
    }
    if( pcase_var.eql( $const16$forAll ) )
    {
      return inference_formula_implies_all( antecedent, consequent, v_bindings );
    }
    if( pcase_var.eql( $const17$TheSetOf ) )
    {
      return inference_formula_implies_the_set_of( antecedent, consequent, v_bindings );
    }
    return inference_formula_implies_literal( antecedent, consequent, v_bindings );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-formula-implies.lisp", position = 13083L)
  public static SubLObject inference_formula_implies_eliminate_double_negations(final SubLObject formula)
  {
    if( $const14$not.eql( cycl_utilities.formula_operator( formula ) ) && $const14$not.eql( cycl_utilities.formula_operator( cycl_utilities.formula_arg1( formula, UNPROVIDED ) ) ) )
    {
      return inference_formula_implies_eliminate_double_negations( cycl_utilities.formula_arg1( cycl_utilities.formula_arg1( formula, UNPROVIDED ), UNPROVIDED ) );
    }
    return formula;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-formula-implies.lisp", position = 13407L)
  public static SubLObject inference_formula_implies_eliminate_implication(final SubLObject formula)
  {
    return $const18$implies.eql( cycl_utilities.formula_operator( formula ) ) ? ConsesLow.list( $const13$or, ConsesLow.list( $const14$not, cycl_utilities.formula_arg1( formula, UNPROVIDED ) ), cycl_utilities
        .formula_arg2( formula, UNPROVIDED ) ) : formula;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-formula-implies.lisp", position = 13622L)
  public static SubLObject inference_formula_implies_term(final SubLObject antecedent, final SubLObject consequent, final SubLObject v_bindings)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL != cycl_grammar.cycl_false_p( antecedent ) )
    {
      return subl_promotions.values2( T, v_bindings );
    }
    if( NIL != variables.variable_p( antecedent ) )
    {
      final SubLObject antecedent_binding = Sequences.find( antecedent, v_bindings, EQUAL, $sym19$CAR, UNPROVIDED, UNPROVIDED );
      final SubLObject consequent_binding = Sequences.find( consequent, v_bindings, EQUAL, $sym19$CAR, UNPROVIDED, UNPROVIDED );
      if( NIL != antecedent_binding )
      {
        return subl_promotions.values2( makeBoolean( antecedent_binding.equal( consequent_binding ) || NIL != Sequences.find( ConsesLow.cons( antecedent, consequent ), v_bindings, EQUAL, UNPROVIDED, UNPROVIDED,
            UNPROVIDED ) ), v_bindings );
      }
      if( NIL != variables.variable_p( consequent ) )
      {
        return subl_promotions.values2( T, conses_high.adjoin( ConsesLow.cons( antecedent, consequent ), v_bindings, UNPROVIDED, UNPROVIDED ) );
      }
      return subl_promotions.values2( NIL, v_bindings );
    }
    else
    {
      if( NIL != variables.variable_p( consequent ) )
      {
        return subl_promotions.values2( Sequences.find( ConsesLow.cons( consequent, antecedent ), v_bindings, EQUAL, UNPROVIDED, UNPROVIDED, UNPROVIDED ), v_bindings );
      }
      if( NIL != cycl_variables.el_varP( antecedent ) )
      {
        final SubLObject antecedent_binding = Sequences.find( antecedent, v_bindings, EQUAL, $sym19$CAR, UNPROVIDED, UNPROVIDED );
        final SubLObject consequent_binding = Sequences.find( consequent, v_bindings, EQUAL, $sym19$CAR, UNPROVIDED, UNPROVIDED );
        if( NIL != antecedent_binding )
        {
          return subl_promotions.values2( makeBoolean( antecedent_binding.equal( consequent_binding ) || NIL != Sequences.find( ConsesLow.cons( antecedent, consequent ), v_bindings, EQUAL, UNPROVIDED, UNPROVIDED,
              UNPROVIDED ) ), v_bindings );
        }
        if( NIL != cycl_variables.el_varP( consequent ) )
        {
          return subl_promotions.values2( T, conses_high.adjoin( ConsesLow.cons( antecedent, consequent ), v_bindings, UNPROVIDED, UNPROVIDED ) );
        }
        return subl_promotions.values2( NIL, v_bindings );
      }
      else
      {
        if( NIL != cycl_variables.el_varP( consequent ) )
        {
          return subl_promotions.values2( Sequences.find( ConsesLow.cons( consequent, antecedent ), v_bindings, EQUAL, UNPROVIDED, UNPROVIDED, UNPROVIDED ), v_bindings );
        }
        if( !consequent.isAtom() )
        {
          return subl_promotions.values2( NIL, v_bindings );
        }
        if( NIL == $removal_formula_implies_allow_subsumption$.getDynamicValue( thread ) )
        {
          return subl_promotions.values2( equals.equalsP( antecedent, consequent, UNPROVIDED, UNPROVIDED ), v_bindings );
        }
        if( NIL != forts.fort_p( antecedent ) && NIL != forts.fort_p( consequent ) )
        {
          return subl_promotions.values2( makeBoolean( NIL != equals.equalsP( antecedent, consequent, UNPROVIDED, UNPROVIDED ) || NIL != genl_predicates.genl_predP( antecedent, consequent, UNPROVIDED, UNPROVIDED )
              || NIL != genl_predicates.genl_inverseP( antecedent, consequent, UNPROVIDED, UNPROVIDED ) || NIL != genls.genlsP( antecedent, consequent, UNPROVIDED, UNPROVIDED ) ), v_bindings );
        }
        return subl_promotions.values2( equals.equalsP( antecedent, consequent, UNPROVIDED, UNPROVIDED ), v_bindings );
      }
    }
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-formula-implies.lisp", position = 15882L)
  public static SubLObject inference_formula_implies_and(final SubLObject antecedent, final SubLObject consequent, final SubLObject v_bindings)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( consequent.isAtom() )
    {
      return subl_promotions.values2( NIL, v_bindings );
    }
    SubLObject antecedent_conjuncts = antecedent.rest();
    final SubLObject consequent_relator = consequent.first();
    SubLObject all_bindings = v_bindings;
    final SubLObject pcase_var = consequent_relator;
    if( pcase_var.eql( $const12$and ) )
    {
      SubLObject cdolist_list_var;
      final SubLObject consequent_conjuncts = cdolist_list_var = consequent.rest();
      SubLObject consequent_conjunct = NIL;
      consequent_conjunct = cdolist_list_var.first();
      while ( NIL != cdolist_list_var)
      {
        SubLObject found = NIL;
        SubLObject new_bindings = NIL;
        SubLObject matching_conjunct = NIL;
        if( NIL == found )
        {
          SubLObject csome_list_var;
          SubLObject antecedent_conjunct;
          SubLObject result;
          SubLObject possibly_updated_bindings;
          for( csome_list_var = antecedent_conjuncts, antecedent_conjunct = NIL, antecedent_conjunct = csome_list_var.first(); NIL == found
              && NIL != csome_list_var; found = result, matching_conjunct = antecedent_conjunct, new_bindings = possibly_updated_bindings, csome_list_var = csome_list_var.rest(), antecedent_conjunct = csome_list_var
                  .first() )
          {
            thread.resetMultipleValues();
            result = inference_formula_implies_formula( antecedent_conjunct, consequent_conjunct, all_bindings );
            possibly_updated_bindings = thread.secondMultipleValue();
            thread.resetMultipleValues();
          }
        }
        if( NIL == found )
        {
          return subl_promotions.values2( NIL, v_bindings );
        }
        antecedent_conjuncts = Sequences.remove( matching_conjunct, antecedent_conjuncts, EQUAL, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
        all_bindings = conses_high.union( all_bindings, new_bindings, EQUAL, UNPROVIDED );
        cdolist_list_var = cdolist_list_var.rest();
        consequent_conjunct = cdolist_list_var.first();
      }
      return subl_promotions.values2( T, all_bindings );
    }
    SubLObject cdolist_list_var2 = antecedent_conjuncts;
    SubLObject antecedent_conjunct2 = NIL;
    antecedent_conjunct2 = cdolist_list_var2.first();
    while ( NIL != cdolist_list_var2)
    {
      thread.resetMultipleValues();
      final SubLObject result2 = inference_formula_implies_formula( antecedent_conjunct2, consequent, all_bindings );
      final SubLObject possibly_updated_bindings2 = thread.secondMultipleValue();
      thread.resetMultipleValues();
      if( NIL != result2 )
      {
        return subl_promotions.values2( T, conses_high.union( all_bindings, possibly_updated_bindings2, EQUAL, UNPROVIDED ) );
      }
      cdolist_list_var2 = cdolist_list_var2.rest();
      antecedent_conjunct2 = cdolist_list_var2.first();
    }
    return subl_promotions.values2( NIL, v_bindings );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-formula-implies.lisp", position = 17480L)
  public static SubLObject inference_formula_implies_or(final SubLObject antecedent, final SubLObject consequent, final SubLObject v_bindings)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( consequent.isAtom() )
    {
      return subl_promotions.values2( NIL, v_bindings );
    }
    final SubLObject antecedent_disjuncts = antecedent.rest();
    final SubLObject consequent_relator = consequent.first();
    SubLObject all_bindings = v_bindings;
    final SubLObject pcase_var = consequent_relator;
    if( pcase_var.eql( $const13$or ) )
    {
      final SubLObject consequent_disjuncts = consequent.rest();
      SubLObject cdolist_list_var = antecedent_disjuncts;
      SubLObject antecedent_disjunct = NIL;
      antecedent_disjunct = cdolist_list_var.first();
      while ( NIL != cdolist_list_var)
      {
        SubLObject found = NIL;
        SubLObject new_bindings = NIL;
        if( NIL == found )
        {
          SubLObject csome_list_var = consequent_disjuncts;
          SubLObject consequent_disjunct = NIL;
          consequent_disjunct = csome_list_var.first();
          while ( NIL == found && NIL != csome_list_var)
          {
            thread.resetMultipleValues();
            final SubLObject result = inference_formula_implies_formula( antecedent_disjunct, consequent_disjunct, all_bindings );
            final SubLObject possibly_updated_bindings = thread.secondMultipleValue();
            thread.resetMultipleValues();
            found = result;
            new_bindings = possibly_updated_bindings;
            csome_list_var = csome_list_var.rest();
            consequent_disjunct = csome_list_var.first();
          }
        }
        if( NIL == found )
        {
          return subl_promotions.values2( NIL, v_bindings );
        }
        all_bindings = conses_high.union( all_bindings, new_bindings, EQUAL, UNPROVIDED );
        cdolist_list_var = cdolist_list_var.rest();
        antecedent_disjunct = cdolist_list_var.first();
      }
      return subl_promotions.values2( T, all_bindings );
    }
    SubLObject cdolist_list_var2 = antecedent_disjuncts;
    SubLObject antecedent_disjunct2 = NIL;
    antecedent_disjunct2 = cdolist_list_var2.first();
    while ( NIL != cdolist_list_var2)
    {
      thread.resetMultipleValues();
      final SubLObject found2 = inference_formula_implies_formula( antecedent_disjunct2, consequent, all_bindings );
      final SubLObject possibly_updated_bindings2 = thread.secondMultipleValue();
      thread.resetMultipleValues();
      if( NIL == found2 )
      {
        return subl_promotions.values2( NIL, v_bindings );
      }
      all_bindings = conses_high.union( all_bindings, possibly_updated_bindings2, EQUAL, UNPROVIDED );
      cdolist_list_var2 = cdolist_list_var2.rest();
      antecedent_disjunct2 = cdolist_list_var2.first();
    }
    return subl_promotions.values2( T, all_bindings );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-formula-implies.lisp", position = 18861L)
  public static SubLObject inference_formula_implies_not(final SubLObject antecedent, final SubLObject consequent, final SubLObject v_bindings)
  {
    if( consequent.isAtom() )
    {
      return subl_promotions.values2( NIL, v_bindings );
    }
    final SubLObject antecedent_formula = conses_high.second( antecedent );
    final SubLObject pcase_var;
    final SubLObject consequent_relator = pcase_var = consequent.first();
    if( pcase_var.eql( $const14$not ) )
    {
      final SubLObject consequent_formula = conses_high.second( consequent );
      return inference_formula_implies_formula( consequent_formula, antecedent_formula, v_bindings );
    }
    return subl_promotions.values2( NIL, v_bindings );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-formula-implies.lisp", position = 19426L)
  public static SubLObject inference_formula_implies_exists(final SubLObject antecedent, final SubLObject consequent, final SubLObject v_bindings)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( consequent.isAtom() )
    {
      return subl_promotions.values2( NIL, v_bindings );
    }
    final SubLObject antecedent_variable = conses_high.second( antecedent );
    final SubLObject antecedent_formula = conses_high.third( antecedent );
    thread.resetMultipleValues();
    final SubLObject result = inference_formula_implies_formula( antecedent_formula, consequent, v_bindings );
    final SubLObject possibly_updated_bindings = thread.secondMultipleValue();
    thread.resetMultipleValues();
    if( NIL != result )
    {
      return subl_promotions.values2( T, conses_high.union( v_bindings, possibly_updated_bindings, EQUAL, UNPROVIDED ) );
    }
    final SubLObject pcase_var;
    final SubLObject consequent_relator = pcase_var = consequent.first();
    if( !pcase_var.eql( $const15$thereExists ) )
    {
      return subl_promotions.values2( NIL, v_bindings );
    }
    final SubLObject consequent_variable = conses_high.second( consequent );
    final SubLObject consequent_formula = conses_high.third( consequent );
    thread.resetMultipleValues();
    final SubLObject term_result = inference_formula_implies_term( antecedent_variable, consequent_variable, v_bindings );
    final SubLObject term_bindings = thread.secondMultipleValue();
    thread.resetMultipleValues();
    thread.resetMultipleValues();
    final SubLObject formula_result = inference_formula_implies_formula( antecedent_formula, consequent_formula, v_bindings );
    final SubLObject formula_bindings = thread.secondMultipleValue();
    thread.resetMultipleValues();
    if( NIL != term_result && NIL != formula_result )
    {
      return subl_promotions.values2( T, conses_high.union( conses_high.union( v_bindings, term_bindings, EQUAL, UNPROVIDED ), formula_bindings, EQUAL, UNPROVIDED ) );
    }
    return subl_promotions.values2( NIL, v_bindings );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-formula-implies.lisp", position = 21110L)
  public static SubLObject inference_formula_implies_all(final SubLObject antecedent, final SubLObject consequent, final SubLObject v_bindings)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( consequent.isAtom() )
    {
      return subl_promotions.values2( NIL, v_bindings );
    }
    final SubLObject antecedent_variable = conses_high.second( antecedent );
    final SubLObject antecedent_formula = conses_high.third( antecedent );
    final SubLObject pcase_var;
    final SubLObject consequent_relator = pcase_var = consequent.first();
    if( !pcase_var.eql( $const16$forAll ) )
    {
      return subl_promotions.values2( NIL, v_bindings );
    }
    final SubLObject consequent_variable = conses_high.second( consequent );
    final SubLObject consequent_formula = conses_high.third( consequent );
    thread.resetMultipleValues();
    final SubLObject term_result = inference_formula_implies_term( antecedent_variable, consequent_variable, v_bindings );
    final SubLObject term_bindings = thread.secondMultipleValue();
    thread.resetMultipleValues();
    thread.resetMultipleValues();
    final SubLObject formula_result = inference_formula_implies_formula( antecedent_formula, consequent_formula, v_bindings );
    final SubLObject formula_bindings = thread.secondMultipleValue();
    thread.resetMultipleValues();
    if( NIL != term_result && NIL != formula_result )
    {
      return subl_promotions.values2( T, conses_high.union( conses_high.union( v_bindings, term_bindings, EQUAL, UNPROVIDED ), formula_bindings, EQUAL, UNPROVIDED ) );
    }
    return subl_promotions.values2( NIL, v_bindings );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-formula-implies.lisp", position = 22183L)
  public static SubLObject inference_formula_implies_the_set_of(final SubLObject antecedent, final SubLObject consequent, final SubLObject v_bindings)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( consequent.isAtom() )
    {
      return subl_promotions.values2( NIL, v_bindings );
    }
    final SubLObject antecedent_variable = conses_high.second( antecedent );
    final SubLObject antecedent_formula = conses_high.third( antecedent );
    final SubLObject pcase_var;
    final SubLObject consequent_relator = pcase_var = consequent.first();
    if( !pcase_var.eql( $const17$TheSetOf ) )
    {
      return subl_promotions.values2( NIL, v_bindings );
    }
    final SubLObject consequent_variable = conses_high.second( consequent );
    final SubLObject consequent_formula = conses_high.third( consequent );
    thread.resetMultipleValues();
    final SubLObject term_result = inference_formula_implies_term( antecedent_variable, consequent_variable, v_bindings );
    final SubLObject term_bindings = thread.secondMultipleValue();
    thread.resetMultipleValues();
    thread.resetMultipleValues();
    final SubLObject formula_result = inference_formula_implies_formula( antecedent_formula, consequent_formula, v_bindings );
    final SubLObject formula_bindings = thread.secondMultipleValue();
    thread.resetMultipleValues();
    if( NIL != term_result && NIL != formula_result )
    {
      return subl_promotions.values2( T, conses_high.union( conses_high.union( v_bindings, term_bindings, EQUAL, UNPROVIDED ), formula_bindings, EQUAL, UNPROVIDED ) );
    }
    return subl_promotions.values2( NIL, v_bindings );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-formula-implies.lisp", position = 23269L)
  public static SubLObject inference_formula_implies_literal(final SubLObject antecedent, final SubLObject consequent, final SubLObject v_bindings)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( consequent.isAtom() )
    {
      return subl_promotions.values2( NIL, v_bindings );
    }
    final SubLObject consequent_relator = consequent.first();
    SubLObject all_bindings = v_bindings;
    final SubLObject pcase_var = consequent_relator;
    if( pcase_var.eql( $const13$or ) )
    {
      SubLObject cdolist_list_var;
      final SubLObject consequent_disjuncts = cdolist_list_var = consequent.rest();
      SubLObject consequent_disjunct = NIL;
      consequent_disjunct = cdolist_list_var.first();
      while ( NIL != cdolist_list_var)
      {
        thread.resetMultipleValues();
        final SubLObject result = inference_formula_implies_formula( antecedent, consequent_disjunct, v_bindings );
        final SubLObject new_bindings = thread.secondMultipleValue();
        thread.resetMultipleValues();
        if( NIL != result )
        {
          return subl_promotions.values2( T, conses_high.union( all_bindings, new_bindings, EQUAL, UNPROVIDED ) );
        }
        cdolist_list_var = cdolist_list_var.rest();
        consequent_disjunct = cdolist_list_var.first();
      }
      return subl_promotions.values2( NIL, v_bindings );
    }
    if( pcase_var.eql( $const12$and ) )
    {
      SubLObject cdolist_list_var;
      final SubLObject consequent_conjuncts = cdolist_list_var = consequent.rest();
      SubLObject consequent_conjunct = NIL;
      consequent_conjunct = cdolist_list_var.first();
      while ( NIL != cdolist_list_var)
      {
        thread.resetMultipleValues();
        final SubLObject result = inference_formula_implies_formula( antecedent, consequent_conjunct, v_bindings );
        final SubLObject new_bindings = thread.secondMultipleValue();
        thread.resetMultipleValues();
        if( NIL == result )
        {
          return subl_promotions.values2( NIL, v_bindings );
        }
        all_bindings = conses_high.union( all_bindings, new_bindings, EQUAL, UNPROVIDED );
        cdolist_list_var = cdolist_list_var.rest();
        consequent_conjunct = cdolist_list_var.first();
      }
      return subl_promotions.values2( T, all_bindings );
    }
    if( pcase_var.eql( $const15$thereExists ) )
    {
      final SubLObject consequent_formula = cycl_utilities.formula_arg2( consequent, UNPROVIDED );
      thread.resetMultipleValues();
      final SubLObject result2 = inference_formula_implies_formula( antecedent, consequent_formula, v_bindings );
      final SubLObject new_bindings2 = thread.secondMultipleValue();
      thread.resetMultipleValues();
      if( NIL != result2 )
      {
        return subl_promotions.values2( T, conses_high.union( all_bindings, new_bindings2, EQUAL, UNPROVIDED ) );
      }
      return subl_promotions.values2( NIL, v_bindings );
    }
    else
    {
      thread.resetMultipleValues();
      final SubLObject result3 = inference_formula_implies_asent( antecedent, consequent, v_bindings );
      final SubLObject new_bindings3 = thread.secondMultipleValue();
      thread.resetMultipleValues();
      if( NIL != result3 )
      {
        return subl_promotions.values2( T, conses_high.union( all_bindings, new_bindings3, EQUAL, UNPROVIDED ) );
      }
      return subl_promotions.values2( NIL, v_bindings );
    }
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-formula-implies.lisp", position = 25162L)
  public static SubLObject inference_formula_implies_non_commutative_asent(final SubLObject antecedent, final SubLObject consequent, final SubLObject v_bindings)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject antecedent_args = antecedent.rest();
    SubLObject consequent_args = consequent.rest();
    SubLObject all_bindings = v_bindings;
    while ( NIL != antecedent_args)
    {
      final SubLObject antecedent_arg = antecedent_args.first();
      final SubLObject consequent_arg = consequent_args.first();
      thread.resetMultipleValues();
      final SubLObject result = inference_formula_implies_formula( antecedent_arg, consequent_arg, all_bindings );
      final SubLObject new_bindings = thread.secondMultipleValue();
      thread.resetMultipleValues();
      if( NIL == result )
      {
        return subl_promotions.values2( NIL, v_bindings );
      }
      all_bindings = conses_high.union( all_bindings, new_bindings, EQUAL, UNPROVIDED );
      antecedent_args = antecedent_args.rest();
      consequent_args = consequent_args.rest();
    }
    return subl_promotions.values2( T, all_bindings );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-formula-implies.lisp", position = 25924L)
  public static SubLObject inference_formula_implies_commutative_asent(final SubLObject antecedent, final SubLObject consequent, final SubLObject v_bindings)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject antecedent_args = antecedent.rest();
    SubLObject consequent_args = consequent.rest();
    SubLObject all_bindings = v_bindings;
    SubLObject cdolist_list_var = antecedent_args;
    SubLObject antecedent_arg = NIL;
    antecedent_arg = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      SubLObject found = NIL;
      SubLObject new_bindings = NIL;
      SubLObject matching_arg = NIL;
      if( NIL == found )
      {
        SubLObject csome_list_var;
        SubLObject consequent_arg;
        SubLObject result;
        SubLObject possibly_updated_bindings;
        for( csome_list_var = consequent_args, consequent_arg = NIL, consequent_arg = csome_list_var.first(); NIL == found
            && NIL != csome_list_var; found = result, matching_arg = consequent_arg, new_bindings = possibly_updated_bindings, csome_list_var = csome_list_var.rest(), consequent_arg = csome_list_var.first() )
        {
          thread.resetMultipleValues();
          result = inference_formula_implies_formula( antecedent_arg, consequent_arg, all_bindings );
          possibly_updated_bindings = thread.secondMultipleValue();
          thread.resetMultipleValues();
        }
      }
      if( NIL == found )
      {
        return subl_promotions.values2( NIL, v_bindings );
      }
      consequent_args = Sequences.remove( matching_arg, consequent_args, EQUAL, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
      all_bindings = conses_high.union( all_bindings, new_bindings, EQUAL, UNPROVIDED );
      cdolist_list_var = cdolist_list_var.rest();
      antecedent_arg = cdolist_list_var.first();
    }
    cdolist_list_var = consequent_args;
    SubLObject consequent_arg2 = NIL;
    consequent_arg2 = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      SubLObject found = NIL;
      SubLObject new_bindings = NIL;
      SubLObject matching_arg = NIL;
      if( NIL == found )
      {
        SubLObject csome_list_var;
        SubLObject result;
        SubLObject possibly_updated_bindings;
        SubLObject antecedent_arg2;
        for( csome_list_var = antecedent_args, antecedent_arg2 = NIL, antecedent_arg2 = csome_list_var.first(); NIL == found
            && NIL != csome_list_var; found = result, matching_arg = antecedent_arg2, new_bindings = possibly_updated_bindings, csome_list_var = csome_list_var.rest(), antecedent_arg2 = csome_list_var.first() )
        {
          thread.resetMultipleValues();
          result = inference_formula_implies_formula( antecedent_arg2, consequent_arg2, all_bindings );
          possibly_updated_bindings = thread.secondMultipleValue();
          thread.resetMultipleValues();
        }
      }
      if( NIL == found )
      {
        return subl_promotions.values2( NIL, v_bindings );
      }
      antecedent_args = Sequences.remove( matching_arg, antecedent_args, EQUAL, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
      all_bindings = conses_high.union( all_bindings, new_bindings, EQUAL, UNPROVIDED );
      cdolist_list_var = cdolist_list_var.rest();
      consequent_arg2 = cdolist_list_var.first();
    }
    return subl_promotions.values2( T, all_bindings );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-formula-implies.lisp", position = 27427L)
  public static SubLObject inference_formula_implies_asent(final SubLObject antecedent, final SubLObject consequent, final SubLObject v_bindings)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( consequent.isAtom() )
    {
      return subl_promotions.values2( NIL, v_bindings );
    }
    final SubLObject antecedent_relator = antecedent.first();
    final SubLObject antecedent_args = antecedent.rest();
    final SubLObject antecedent_arity = Sequences.length( antecedent_args );
    final SubLObject consequent_relator = consequent.first();
    final SubLObject consequent_args = consequent.rest();
    final SubLObject consequent_arity = Sequences.length( consequent_args );
    final SubLObject all_bindings = conses_high.union( v_bindings, unification_utilities.term_unify( antecedent, consequent, UNPROVIDED, UNPROVIDED ), EQUAL, UNPROVIDED );
    if( !antecedent_arity.numE( consequent_arity ) )
    {
      return subl_promotions.values2( NIL, v_bindings );
    }
    if( NIL == inference_formula_implies_formula( antecedent_relator, consequent_relator, all_bindings ) )
    {
      return subl_promotions.values2( NIL, v_bindings );
    }
    if( NIL != $removal_formula_implies_allow_subsumption$.getDynamicValue( thread ) && NIL != forts.fort_p( antecedent_relator ) && NIL != forts.fort_p( consequent_relator ) && NIL != genl_predicates.genl_inverseP(
        antecedent_relator, consequent_relator, UNPROVIDED, UNPROVIDED ) )
    {
      thread.resetMultipleValues();
      SubLObject result = inference_formula_implies_genl_inverse( antecedent, consequent, all_bindings );
      SubLObject new_bindings = thread.secondMultipleValue();
      thread.resetMultipleValues();
      if( NIL != result )
      {
        return subl_promotions.values2( T, conses_high.union( all_bindings, new_bindings, EQUAL, UNPROVIDED ) );
      }
      if( NIL != inference_formula_equiv_commutative_relationP( antecedent_relator ) )
      {
        thread.resetMultipleValues();
        result = inference_formula_implies_non_commutative_asent( antecedent, consequent, all_bindings );
        new_bindings = thread.secondMultipleValue();
        thread.resetMultipleValues();
        if( NIL != result )
        {
          return subl_promotions.values2( T, conses_high.union( all_bindings, new_bindings, EQUAL, UNPROVIDED ) );
        }
      }
      else
      {
        thread.resetMultipleValues();
        result = inference_formula_implies_commutative_asent( antecedent, consequent, all_bindings );
        new_bindings = thread.secondMultipleValue();
        thread.resetMultipleValues();
        if( NIL != result )
        {
          return subl_promotions.values2( T, conses_high.union( all_bindings, new_bindings, EQUAL, UNPROVIDED ) );
        }
      }
      return subl_promotions.values2( NIL, v_bindings );
    }
    else if( NIL == forts.fort_p( antecedent_relator ) || NIL == inference_formula_equiv_commutative_relationP( antecedent_relator ) )
    {
      thread.resetMultipleValues();
      final SubLObject result = inference_formula_implies_non_commutative_asent( antecedent, consequent, all_bindings );
      final SubLObject new_bindings = thread.secondMultipleValue();
      thread.resetMultipleValues();
      if( NIL != result )
      {
        return subl_promotions.values2( T, conses_high.union( all_bindings, new_bindings, EQUAL, UNPROVIDED ) );
      }
      return subl_promotions.values2( NIL, v_bindings );
    }
    else
    {
      thread.resetMultipleValues();
      final SubLObject result = inference_formula_implies_commutative_asent( antecedent, consequent, all_bindings );
      final SubLObject new_bindings = thread.secondMultipleValue();
      thread.resetMultipleValues();
      if( NIL != result )
      {
        return subl_promotions.values2( T, conses_high.union( all_bindings, new_bindings, EQUAL, UNPROVIDED ) );
      }
      return subl_promotions.values2( NIL, v_bindings );
    }
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-formula-implies.lisp", position = 30314L)
  public static SubLObject inference_formula_implies_genl_inverse(final SubLObject antecedent, final SubLObject consequent, final SubLObject v_bindings)
  {
    final SubLObject antecedent_relator = cycl_utilities.atomic_sentence_arg0( antecedent );
    final SubLObject antecedent_arg1 = cycl_utilities.atomic_sentence_arg1( antecedent, UNPROVIDED );
    final SubLObject antecedent_arg2 = cycl_utilities.atomic_sentence_arg2( antecedent, UNPROVIDED );
    final SubLObject consequent_relator = cycl_utilities.atomic_sentence_arg0( consequent );
    final SubLObject consequent_arg1 = cycl_utilities.atomic_sentence_arg1( consequent, UNPROVIDED );
    final SubLObject consequent_arg2 = cycl_utilities.atomic_sentence_arg2( consequent, UNPROVIDED );
    final SubLObject all_bindings = conses_high.union( v_bindings, unification_utilities.term_unify( ConsesLow.list( antecedent_arg1, antecedent_arg2 ), ConsesLow.list( consequent_arg2, consequent_arg1 ), UNPROVIDED,
        UNPROVIDED ), EQUAL, UNPROVIDED );
    if( NIL != genl_predicates.genl_inverseP( antecedent_relator, consequent_relator, UNPROVIDED, UNPROVIDED ) && NIL != inference_formula_implies_term( antecedent_arg1, consequent_arg2, all_bindings )
        && NIL != inference_formula_implies_term( antecedent_arg2, consequent_arg1, all_bindings ) )
    {
      return subl_promotions.values2( T, all_bindings );
    }
    return subl_promotions.values2( NIL, v_bindings );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-formula-implies.lisp", position = 32605L)
  public static SubLObject removal_sentence_implication_conditions_expand(final SubLObject asent, SubLObject sense)
  {
    if( sense == UNPROVIDED )
    {
      sense = NIL;
    }
    if( NIL != genl_predicates.genl_predP( cycl_utilities.atomic_sentence_predicate( asent ), $const24$isa, UNPROVIDED, UNPROVIDED ) && NIL != variables.fully_bound_p( cycl_utilities.atomic_sentence_arg2( asent,
        UNPROVIDED ) ) && NIL != fort_types_interface.collection_p( cycl_utilities.atomic_sentence_arg2( asent, UNPROVIDED ) ) )
    {
      final SubLObject quoted_sentence = cycl_utilities.atomic_sentence_arg1( asent, UNPROVIDED );
      final SubLObject sentence = czer_main.unquote_quoted_term( quoted_sentence, UNPROVIDED );
      final SubLObject col = cycl_utilities.sentence_arg2( sentence, UNPROVIDED );
      SubLObject cdolist_list_var = genls.all_specs( col, UNPROVIDED, UNPROVIDED );
      SubLObject spec = NIL;
      spec = cdolist_list_var.first();
      while ( NIL != cdolist_list_var)
      {
        SubLObject cdolist_list_var_$3 = backward_utilities.relevant_directions();
        SubLObject direction = NIL;
        direction = cdolist_list_var_$3.first();
        while ( NIL != cdolist_list_var_$3)
        {
          if( NIL != kb_mapping_macros.do_genls_rule_index_key_validator( spec, $kw21$POS, direction ) )
          {
            final SubLObject iterator_var = kb_mapping_macros.new_genls_rule_final_index_spec_iterator( spec, $kw21$POS, direction );
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
                  final_index_iterator = kb_mapping_macros.new_final_index_iterator( final_index_spec, $kw25$RULE, NIL, direction );
                  SubLObject done_var_$4 = NIL;
                  final SubLObject token_var_$5 = NIL;
                  while ( NIL == done_var_$4)
                  {
                    final SubLObject rule = iteration.iteration_next_without_values_macro_helper( final_index_iterator, token_var_$5 );
                    final SubLObject valid_$6 = makeBoolean( !token_var_$5.eql( rule ) );
                    if( NIL != valid_$6 )
                    {
                      sic_possibly_add_node_for_possibly_matching_rule( rule, asent, UNPROVIDED );
                    }
                    done_var_$4 = makeBoolean( NIL == valid_$6 );
                  }
                }
                finally
                {
                  final SubLObject _prev_bind_0 = Dynamic.currentBinding( Threads.$is_thread_performing_cleanupP$ );
                  try
                  {
                    Dynamic.bind( Threads.$is_thread_performing_cleanupP$, T );
                    final SubLObject _values = Values.getValuesAsVector();
                    if( NIL != final_index_iterator )
                    {
                      kb_mapping_macros.destroy_final_index_iterator( final_index_iterator );
                    }
                    Values.restoreValuesFromVector( _values );
                  }
                  finally
                  {
                    Dynamic.rebind( Threads.$is_thread_performing_cleanupP$, _prev_bind_0 );
                  }
                }
              }
              done_var = makeBoolean( NIL == valid );
            }
          }
          cdolist_list_var_$3 = cdolist_list_var_$3.rest();
          direction = cdolist_list_var_$3.first();
        }
        cdolist_list_var = cdolist_list_var.rest();
        spec = cdolist_list_var.first();
      }
    }
    else if( NIL != genl_predicates.genl_predP( cycl_utilities.atomic_sentence_predicate( asent ), $const26$genls, UNPROVIDED, UNPROVIDED ) && NIL != variables.fully_bound_p( cycl_utilities.atomic_sentence_arg2( asent,
        UNPROVIDED ) ) && NIL != fort_types_interface.collection_p( cycl_utilities.atomic_sentence_arg2( asent, UNPROVIDED ) ) )
    {
      final SubLObject quoted_sentence = cycl_utilities.atomic_sentence_arg1( asent, UNPROVIDED );
      final SubLObject sentence = czer_main.unquote_quoted_term( quoted_sentence, UNPROVIDED );
      final SubLObject col = cycl_utilities.sentence_arg2( sentence, UNPROVIDED );
      SubLObject cdolist_list_var = genls.all_specs( col, UNPROVIDED, UNPROVIDED );
      SubLObject spec = NIL;
      spec = cdolist_list_var.first();
      while ( NIL != cdolist_list_var)
      {
        SubLObject cdolist_list_var_$4 = backward_utilities.relevant_directions();
        SubLObject direction = NIL;
        direction = cdolist_list_var_$4.first();
        while ( NIL != cdolist_list_var_$4)
        {
          if( NIL != kb_mapping_macros.do_isa_rule_index_key_validator( spec, $kw21$POS, direction ) )
          {
            final SubLObject iterator_var = kb_mapping_macros.new_isa_rule_final_index_spec_iterator( spec, $kw21$POS, direction );
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
                  final_index_iterator = kb_mapping_macros.new_final_index_iterator( final_index_spec, $kw25$RULE, NIL, direction );
                  SubLObject done_var_$5 = NIL;
                  final SubLObject token_var_$6 = NIL;
                  while ( NIL == done_var_$5)
                  {
                    final SubLObject rule = iteration.iteration_next_without_values_macro_helper( final_index_iterator, token_var_$6 );
                    final SubLObject valid_$7 = makeBoolean( !token_var_$6.eql( rule ) );
                    if( NIL != valid_$7 )
                    {
                      sic_possibly_add_node_for_possibly_matching_rule( rule, asent, UNPROVIDED );
                    }
                    done_var_$5 = makeBoolean( NIL == valid_$7 );
                  }
                }
                finally
                {
                  final SubLObject _prev_bind_2 = Dynamic.currentBinding( Threads.$is_thread_performing_cleanupP$ );
                  try
                  {
                    Dynamic.bind( Threads.$is_thread_performing_cleanupP$, T );
                    final SubLObject _values2 = Values.getValuesAsVector();
                    if( NIL != final_index_iterator )
                    {
                      kb_mapping_macros.destroy_final_index_iterator( final_index_iterator );
                    }
                    Values.restoreValuesFromVector( _values2 );
                  }
                  finally
                  {
                    Dynamic.rebind( Threads.$is_thread_performing_cleanupP$, _prev_bind_2 );
                  }
                }
              }
              done_var = makeBoolean( NIL == valid );
            }
          }
          cdolist_list_var_$4 = cdolist_list_var_$4.rest();
          direction = cdolist_list_var_$4.first();
        }
        cdolist_list_var = cdolist_list_var.rest();
        spec = cdolist_list_var.first();
      }
    }
    else if( NIL != variables.fully_bound_p( cycl_utilities.atomic_sentence_predicate( asent ) ) )
    {
      final SubLObject quoted_sentence = cycl_utilities.atomic_sentence_arg1( asent, UNPROVIDED );
      final SubLObject sentence = czer_main.unquote_quoted_term( quoted_sentence, UNPROVIDED );
      final SubLObject pred = cycl_utilities.sentence_arg0( sentence );
      if( NIL != fort_types_interface.predicate_p( pred ) )
      {
        SubLObject cdolist_list_var = genl_predicates.all_spec_preds( pred, UNPROVIDED, UNPROVIDED );
        SubLObject spec_pred = NIL;
        spec_pred = cdolist_list_var.first();
        while ( NIL != cdolist_list_var)
        {
          SubLObject cdolist_list_var_$5 = backward_utilities.relevant_directions();
          SubLObject direction = NIL;
          direction = cdolist_list_var_$5.first();
          while ( NIL != cdolist_list_var_$5)
          {
            if( NIL != kb_mapping_macros.do_predicate_rule_index_key_validator( spec_pred, $kw21$POS, direction ) )
            {
              final SubLObject iterator_var = kb_mapping_macros.new_predicate_rule_final_index_spec_iterator( spec_pred, $kw21$POS, direction );
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
                    final_index_iterator = kb_mapping_macros.new_final_index_iterator( final_index_spec, $kw25$RULE, NIL, direction );
                    SubLObject done_var_$6 = NIL;
                    final SubLObject token_var_$7 = NIL;
                    while ( NIL == done_var_$6)
                    {
                      final SubLObject rule = iteration.iteration_next_without_values_macro_helper( final_index_iterator, token_var_$7 );
                      final SubLObject valid_$8 = makeBoolean( !token_var_$7.eql( rule ) );
                      if( NIL != valid_$8 )
                      {
                        sic_possibly_add_node_for_possibly_matching_rule( rule, asent, T );
                      }
                      done_var_$6 = makeBoolean( NIL == valid_$8 );
                    }
                  }
                  finally
                  {
                    final SubLObject _prev_bind_3 = Dynamic.currentBinding( Threads.$is_thread_performing_cleanupP$ );
                    try
                    {
                      Dynamic.bind( Threads.$is_thread_performing_cleanupP$, T );
                      final SubLObject _values3 = Values.getValuesAsVector();
                      if( NIL != final_index_iterator )
                      {
                        kb_mapping_macros.destroy_final_index_iterator( final_index_iterator );
                      }
                      Values.restoreValuesFromVector( _values3 );
                    }
                    finally
                    {
                      Dynamic.rebind( Threads.$is_thread_performing_cleanupP$, _prev_bind_3 );
                    }
                  }
                }
                done_var = makeBoolean( NIL == valid );
              }
            }
            cdolist_list_var_$5 = cdolist_list_var_$5.rest();
            direction = cdolist_list_var_$5.first();
          }
          cdolist_list_var = cdolist_list_var.rest();
          spec_pred = cdolist_list_var.first();
        }
      }
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-formula-implies.lisp", position = 34276L)
  public static SubLObject sic_possibly_add_node_for_possibly_matching_rule(final SubLObject rule, final SubLObject asent, SubLObject unify_all_argsP)
  {
    if( unify_all_argsP == UNPROVIDED )
    {
      unify_all_argsP = NIL;
    }
    if( NIL != rule_trivial_for_sentence_implication_conditionsP( rule ) )
    {
      return NIL;
    }
    final SubLObject quoted_sentence = cycl_utilities.atomic_sentence_arg1( asent, UNPROVIDED );
    final SubLObject sentence = czer_main.unquote_quoted_term( quoted_sentence, UNPROVIDED );
    final SubLObject rule_el_formula = uncanonicalizer.assertion_el_formula( rule );
    final SubLObject rule_consequent = cycl_utilities.sentence_arg2( rule_el_formula, UNPROVIDED );
    final SubLObject consequent_bindings = ( NIL != unify_all_argsP ) ? unification_utilities.unify_open_el_terms( cycl_utilities.sentence_args( rule_consequent, UNPROVIDED ), cycl_utilities.sentence_args( sentence,
        UNPROVIDED ), UNPROVIDED ) : unification_utilities.unify_open_el_terms( cycl_utilities.sentence_arg1( rule_consequent, UNPROVIDED ), cycl_utilities.sentence_arg1( sentence, UNPROVIDED ), UNPROVIDED );
    if( NIL != consequent_bindings )
    {
      SubLObject rebound_antecedent = cycl_utilities.sentence_arg1( bindings.apply_bindings( consequent_bindings, rule_el_formula ), UNPROVIDED );
      final SubLObject el_vars = cycl_utilities.expression_gather( rebound_antecedent, $sym27$EL_VAR_, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
      if( NIL != ( ( NIL != mt_relevance_macros.any_or_all_mts_are_relevantP() ) ? wff.el_lenient_wff_assertibleP( rebound_antecedent, $const28$BaseKB, UNPROVIDED )
          : wff.el_lenient_wff_assertibleP( rebound_antecedent, UNPROVIDED, UNPROVIDED ) ) )
      {
        SubLObject cdolist_list_var = el_vars;
        SubLObject el_var = NIL;
        el_var = cdolist_list_var.first();
        while ( NIL != cdolist_list_var)
        {
          rebound_antecedent = el_utilities.make_binary_formula( $const15$thereExists, el_var, rebound_antecedent );
          cdolist_list_var = cdolist_list_var.rest();
          el_var = cdolist_list_var.first();
        }
        final SubLObject v_bindings = unification_utilities.term_unify( cycl_utilities.atomic_sentence_arg2( asent, UNPROVIDED ), rebound_antecedent, UNPROVIDED, UNPROVIDED );
        if( NIL != v_bindings )
        {
          backward.removal_add_node( arguments.make_hl_support( $kw3$OPAQUE, bindings.apply_bindings( v_bindings, asent ), UNPROVIDED, UNPROVIDED ), v_bindings, ConsesLow.list( rule ) );
        }
      }
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-formula-implies.lisp", position = 35611L)
  public static SubLObject rule_trivial_for_sentence_implication_conditionsP(final SubLObject rule)
  {
    SubLObject cdolist_list_var = genl_predicates.all_spec_preds( $const29$ruleTrivialForSentenceImplication, UNPROVIDED, UNPROVIDED );
    SubLObject pred = NIL;
    pred = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      if( NIL != somewhere_cache.somewhere_cached_pred_p( pred ) && NIL != somewhere_cache.valid_somewhere_cache_itemP( rule ) && NIL != somewhere_cache.some_pred_assertion_somewhereP( pred, rule, ONE_INTEGER, T )
          && NIL != kb_mapping_utilities.some_pred_value( rule, pred, UNPROVIDED, UNPROVIDED ) )
      {
        return T;
      }
      cdolist_list_var = cdolist_list_var.rest();
      pred = cdolist_list_var.first();
    }
    return NIL;
  }

  public static SubLObject declare_removal_modules_formula_implies_file()
  {
    SubLFiles.declareFunction( me, "make_formula_implies_hl_support", "MAKE-FORMULA-IMPLIES-HL-SUPPORT", 2, 0, false );
    SubLFiles.declareFunction( me, "removal_formula_implies_pos_check_expand", "REMOVAL-FORMULA-IMPLIES-POS-CHECK-EXPAND", 1, 1, false );
    SubLFiles.declareFunction( me, "make_formula_implies_subsumption_hl_support", "MAKE-FORMULA-IMPLIES-SUBSUMPTION-HL-SUPPORT", 2, 0, false );
    SubLFiles.declareFunction( me, "removal_formula_implies_subsumption_pos_check_expand", "REMOVAL-FORMULA-IMPLIES-SUBSUMPTION-POS-CHECK-EXPAND", 1, 1, false );
    SubLFiles.declareFunction( me, "make_formula_equiv_hl_support", "MAKE-FORMULA-EQUIV-HL-SUPPORT", 2, 0, false );
    SubLFiles.declareFunction( me, "removal_formula_equiv_pos_check_expand", "REMOVAL-FORMULA-EQUIV-POS-CHECK-EXPAND", 1, 1, false );
    SubLFiles.declareFunction( me, "inference_formula_equiv", "INFERENCE-FORMULA-EQUIV", 2, 0, false );
    SubLFiles.declareFunction( me, "inference_formula_implies", "INFERENCE-FORMULA-IMPLIES", 2, 0, false );
    SubLFiles.declareFunction( me, "canonicalize_scoped_el_existentials_to_hl", "CANONICALIZE-SCOPED-EL-EXISTENTIALS-TO-HL", 1, 0, false );
    SubLFiles.declareFunction( me, "inference_formula_implies_in_mt", "INFERENCE-FORMULA-IMPLIES-IN-MT", 3, 0, false );
    SubLFiles.declareFunction( me, "inference_formula_equiv_commutative_relationP", "INFERENCE-FORMULA-EQUIV-COMMUTATIVE-RELATION?", 1, 0, false );
    SubLFiles.declareFunction( me, "inference_formula_implies_formula", "INFERENCE-FORMULA-IMPLIES-FORMULA", 3, 0, false );
    SubLFiles.declareFunction( me, "inference_formula_implies_eliminate_double_negations", "INFERENCE-FORMULA-IMPLIES-ELIMINATE-DOUBLE-NEGATIONS", 1, 0, false );
    SubLFiles.declareFunction( me, "inference_formula_implies_eliminate_implication", "INFERENCE-FORMULA-IMPLIES-ELIMINATE-IMPLICATION", 1, 0, false );
    SubLFiles.declareFunction( me, "inference_formula_implies_term", "INFERENCE-FORMULA-IMPLIES-TERM", 3, 0, false );
    SubLFiles.declareFunction( me, "inference_formula_implies_and", "INFERENCE-FORMULA-IMPLIES-AND", 3, 0, false );
    SubLFiles.declareFunction( me, "inference_formula_implies_or", "INFERENCE-FORMULA-IMPLIES-OR", 3, 0, false );
    SubLFiles.declareFunction( me, "inference_formula_implies_not", "INFERENCE-FORMULA-IMPLIES-NOT", 3, 0, false );
    SubLFiles.declareFunction( me, "inference_formula_implies_exists", "INFERENCE-FORMULA-IMPLIES-EXISTS", 3, 0, false );
    SubLFiles.declareFunction( me, "inference_formula_implies_all", "INFERENCE-FORMULA-IMPLIES-ALL", 3, 0, false );
    SubLFiles.declareFunction( me, "inference_formula_implies_the_set_of", "INFERENCE-FORMULA-IMPLIES-THE-SET-OF", 3, 0, false );
    SubLFiles.declareFunction( me, "inference_formula_implies_literal", "INFERENCE-FORMULA-IMPLIES-LITERAL", 3, 0, false );
    SubLFiles.declareFunction( me, "inference_formula_implies_non_commutative_asent", "INFERENCE-FORMULA-IMPLIES-NON-COMMUTATIVE-ASENT", 3, 0, false );
    SubLFiles.declareFunction( me, "inference_formula_implies_commutative_asent", "INFERENCE-FORMULA-IMPLIES-COMMUTATIVE-ASENT", 3, 0, false );
    SubLFiles.declareFunction( me, "inference_formula_implies_asent", "INFERENCE-FORMULA-IMPLIES-ASENT", 3, 0, false );
    SubLFiles.declareFunction( me, "inference_formula_implies_genl_inverse", "INFERENCE-FORMULA-IMPLIES-GENL-INVERSE", 3, 0, false );
    SubLFiles.declareFunction( me, "removal_sentence_implication_conditions_expand", "REMOVAL-SENTENCE-IMPLICATION-CONDITIONS-EXPAND", 1, 1, false );
    SubLFiles.declareFunction( me, "sic_possibly_add_node_for_possibly_matching_rule", "SIC-POSSIBLY-ADD-NODE-FOR-POSSIBLY-MATCHING-RULE", 2, 1, false );
    SubLFiles.declareFunction( me, "rule_trivial_for_sentence_implication_conditionsP", "RULE-TRIVIAL-FOR-SENTENCE-IMPLICATION-CONDITIONS?", 1, 0, false );
    return NIL;
  }

  public static SubLObject init_removal_modules_formula_implies_file()
  {
    $removal_formula_implies_allow_subsumption$ = SubLFiles.defparameter( "*REMOVAL-FORMULA-IMPLIES-ALLOW-SUBSUMPTION*", NIL );
    $default_removal_formula_implies_pos_check_cost$ = SubLFiles.defparameter( "*DEFAULT-REMOVAL-FORMULA-IMPLIES-POS-CHECK-COST*", control_vars.$hl_module_check_cost$.getDynamicValue() );
    $default_removal_formula_equiv_pos_check_cost$ = SubLFiles.defparameter( "*DEFAULT-REMOVAL-FORMULA-EQUIV-POS-CHECK-COST*", control_vars.$hl_module_check_cost$.getDynamicValue() );
    $inference_formula_equiv_commutative_relation_table$ = SubLFiles.defparameter( "*INFERENCE-FORMULA-EQUIV-COMMUTATIVE-RELATION-TABLE*", NIL );
    return NIL;
  }

  public static SubLObject setup_removal_modules_formula_implies_file()
  {
    inference_modules.register_solely_specific_removal_module_predicate( $const0$sentenceImplies );
    inference_modules.inference_removal_module( $kw1$REMOVAL_FORMULA_IMPLIES_POS_CHECK, $list2 );
    inference_modules.register_solely_specific_removal_module_predicate( $const5$sentenceImpliesViaSubsumption );
    inference_modules.inference_removal_module( $kw6$REMOVAL_FORMULA_IMPLIES_SUBSUMPTION_POS_CHECK, $list7 );
    inference_modules.register_solely_specific_removal_module_predicate( $const8$sentenceEquiv );
    inference_modules.inference_removal_module( $kw9$REMOVAL_FORMULA_EQUIV_POS_CHECK, $list10 );
    inference_modules.register_solely_specific_removal_module_predicate( $const20$sentenceImplicationConditions );
    preference_modules.doomed_unless_arg_bindable( $kw21$POS, $const20$sentenceImplicationConditions, ONE_INTEGER );
    inference_modules.inference_removal_module( $kw22$REMOVAL_SENTENCE_IMPLICATION_CONDITIONS, $list23 );
    return NIL;
  }

  @Override
  public void declareFunctions()
  {
    declare_removal_modules_formula_implies_file();
  }

  @Override
  public void initializeVariables()
  {
    init_removal_modules_formula_implies_file();
  }

  @Override
  public void runTopLevelForms()
  {
    setup_removal_modules_formula_implies_file();
  }
  static
  {
    me = new removal_modules_formula_implies();
    $removal_formula_implies_allow_subsumption$ = null;
    $default_removal_formula_implies_pos_check_cost$ = null;
    $default_removal_formula_equiv_pos_check_cost$ = null;
    $inference_formula_equiv_commutative_relation_table$ = null;
    $const0$sentenceImplies = constant_handles.reader_make_constant_shell( makeString( "sentenceImplies" ) );
    $kw1$REMOVAL_FORMULA_IMPLIES_POS_CHECK = makeKeyword( "REMOVAL-FORMULA-IMPLIES-POS-CHECK" );
    $list2 = ConsesLow.list( new SubLObject[] { makeKeyword( "SENSE" ), makeKeyword( "POS" ), makeKeyword( "PREDICATE" ), constant_handles.reader_make_constant_shell( makeString( "sentenceImplies" ) ), makeKeyword(
        "REQUIRED-PATTERN" ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "sentenceImplies" ) ), makeKeyword( "FULLY-BOUND" ), makeKeyword( "FULLY-BOUND" ) ), makeKeyword(
            "COST-EXPRESSION" ), makeSymbol( "*DEFAULT-REMOVAL-FORMULA-IMPLIES-POS-CHECK-COST*" ), makeKeyword( "EXPAND" ), makeSymbol( "REMOVAL-FORMULA-IMPLIES-POS-CHECK-EXPAND" ), makeKeyword( "DOCUMENTATION" ),
      makeString( "(#$sentenceImplies ANTE CONSEQ)\nwhere ANTE and CONSEQ are both fully-bound formulas\nby checking for trivial syntactic truth-preserving transformations" ), makeKeyword( "EXAMPLE" ), makeString(
          "(#$sentenceImplies\n      (#$thereExists ?DOG\n        (#$and\n          (#$isa ?DOG #$Dog)\n          (#$colorOfObject ?DOG #$RedColor)))\n    (#$thereExists ?ANIMAL\n      (#$isa ?ANIMAL #$Dog)))" )
    } );
    $kw3$OPAQUE = makeKeyword( "OPAQUE" );
    $kw4$TRUE_MON = makeKeyword( "TRUE-MON" );
    $const5$sentenceImpliesViaSubsumption = constant_handles.reader_make_constant_shell( makeString( "sentenceImpliesViaSubsumption" ) );
    $kw6$REMOVAL_FORMULA_IMPLIES_SUBSUMPTION_POS_CHECK = makeKeyword( "REMOVAL-FORMULA-IMPLIES-SUBSUMPTION-POS-CHECK" );
    $list7 = ConsesLow.list( new SubLObject[] { makeKeyword( "SENSE" ), makeKeyword( "POS" ), makeKeyword( "PREDICATE" ), constant_handles.reader_make_constant_shell( makeString( "sentenceImpliesViaSubsumption" ) ),
      makeKeyword( "REQUIRED-PATTERN" ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "sentenceImpliesViaSubsumption" ) ), makeKeyword( "FULLY-BOUND" ), makeKeyword( "FULLY-BOUND" ) ),
      makeKeyword( "COST-EXPRESSION" ), makeSymbol( "*DEFAULT-REMOVAL-FORMULA-IMPLIES-POS-CHECK-COST*" ), makeKeyword( "EXPAND" ), makeSymbol( "REMOVAL-FORMULA-IMPLIES-SUBSUMPTION-POS-CHECK-EXPAND" ), makeKeyword(
          "DOCUMENTATION" ), makeString(
              "(#$sentenceImpliesViaSubsumption ANTE CONSEQ)\nwhere ANTE and CONSEQ are both fully-bound formulas.\nThis predicate is intended to function as the 'description logic analog' of sentenceImplies." ),
      makeKeyword( "EXAMPLE" ), makeString(
          "'(#$sentenceImpliesViaSubsumption\n       (#$thereExists ?X\n         (#$and\n           (#$isa ?X #$Dog)\n           (#$heightOfObject ?X (#$Foot-UnitOfMeasure 2))\n           (#$mainColorOfObject ?X #$BlackColor)))\n       (#$thereExists ?Y\n         (#$and\n           (#$isa ?Y #$Animal)\n           (#$mainColorOfObject ?Y #$BlackColor))))" )
    } );
    $const8$sentenceEquiv = constant_handles.reader_make_constant_shell( makeString( "sentenceEquiv" ) );
    $kw9$REMOVAL_FORMULA_EQUIV_POS_CHECK = makeKeyword( "REMOVAL-FORMULA-EQUIV-POS-CHECK" );
    $list10 = ConsesLow.list( new SubLObject[] { makeKeyword( "SENSE" ), makeKeyword( "POS" ), makeKeyword( "PREDICATE" ), constant_handles.reader_make_constant_shell( makeString( "sentenceEquiv" ) ), makeKeyword(
        "REQUIRED-PATTERN" ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "sentenceEquiv" ) ), makeKeyword( "FULLY-BOUND" ), makeKeyword( "FULLY-BOUND" ) ), makeKeyword( "COST-EXPRESSION" ),
      makeSymbol( "*DEFAULT-REMOVAL-FORMULA-EQUIV-POS-CHECK-COST*" ), makeKeyword( "EXPAND" ), makeSymbol( "REMOVAL-FORMULA-EQUIV-POS-CHECK-EXPAND" ), makeKeyword( "DOCUMENTATION" ), makeString(
          "(#$sentenceEquiv FORMULA-1 FORMULA-2)\nwhere FORMULA-1 and FORMULA-2 are both fully-bound formulas\nby checking for trivial syntactic truth-preserving transformations" ), makeKeyword( "EXAMPLE" ), makeString(
              "(#$sentenceEquiv\n  (#$thereExists ?DOG\n    (#$and\n      (#$isa ?DOG #$Dog)\n      (#$colorOfObject ?DOG #$RedColor)))\n  (#$thereExists ?ANIMAL\n    (#$and\n      (#$colorOfObject ?ANIMAL #$RedColor)\n      (#$isa ?ANIMAL #$Dog)))))" )
    } );
    $sym11$CATCH_ERROR_MESSAGE_HANDLER = makeSymbol( "CATCH-ERROR-MESSAGE-HANDLER" );
    $const12$and = constant_handles.reader_make_constant_shell( makeString( "and" ) );
    $const13$or = constant_handles.reader_make_constant_shell( makeString( "or" ) );
    $const14$not = constant_handles.reader_make_constant_shell( makeString( "not" ) );
    $const15$thereExists = constant_handles.reader_make_constant_shell( makeString( "thereExists" ) );
    $const16$forAll = constant_handles.reader_make_constant_shell( makeString( "forAll" ) );
    $const17$TheSetOf = constant_handles.reader_make_constant_shell( makeString( "TheSetOf" ) );
    $const18$implies = constant_handles.reader_make_constant_shell( makeString( "implies" ) );
    $sym19$CAR = makeSymbol( "CAR" );
    $const20$sentenceImplicationConditions = constant_handles.reader_make_constant_shell( makeString( "sentenceImplicationConditions" ) );
    $kw21$POS = makeKeyword( "POS" );
    $kw22$REMOVAL_SENTENCE_IMPLICATION_CONDITIONS = makeKeyword( "REMOVAL-SENTENCE-IMPLICATION-CONDITIONS" );
    $list23 = ConsesLow.list( new SubLObject[] { makeKeyword( "SENSE" ), makeKeyword( "POS" ), makeKeyword( "PREDICATE" ), constant_handles.reader_make_constant_shell( makeString( "sentenceImplicationConditions" ) ),
      makeKeyword( "REQUIRED-PATTERN" ), ConsesLow.list( makeKeyword( "OR" ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "sentenceImplicationConditions" ) ), ConsesLow.list( constant_handles
          .reader_make_constant_shell( makeString( "Quote" ) ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "genls" ) ), makeKeyword( "ANYTHING" ), makeKeyword( "FULLY-BOUND" ) ) ),
          makeKeyword( "ANYTHING" ) ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "sentenceImplicationConditions" ) ), ConsesLow.list( constant_handles.reader_make_constant_shell(
              makeString( "Quote" ) ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "isa" ) ), makeKeyword( "ANYTHING" ), makeKeyword( "FULLY-BOUND" ) ) ), makeKeyword( "ANYTHING" ) ),
          ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "sentenceImplicationConditions" ) ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "Quote" ) ), ConsesLow
              .cons( makeKeyword( "FULLY-BOUND" ), makeKeyword( "ANYTHING" ) ) ), makeKeyword( "ANYTHING" ) ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "sentenceImplicationConditions" ) ),
                  makeKeyword( "FULLY-BOUND" ), makeKeyword( "ANYTHING" ) ) ), makeKeyword( "COST-EXPRESSION" ), makeSymbol( "*EXPENSIVE-HL-MODULE-CHECK-COST*" ), makeKeyword( "COMPLETENESS" ), makeKeyword( "COMPLETE" ),
      makeKeyword( "EXPAND" ), makeSymbol( "REMOVAL-SENTENCE-IMPLICATION-CONDITIONS-EXPAND" ), makeKeyword( "DOCUMENTATION" ), makeString( "(#$sentenceImplicationConditions <genls-sentence> ?SENTENCE)" ), makeKeyword(
          "EXAMPLE" ), makeString( "(#$sentenceImplicationConditions (#$Quote (#$genls ?X #$Person)) ?SENTENCE)" )
    } );
    $const24$isa = constant_handles.reader_make_constant_shell( makeString( "isa" ) );
    $kw25$RULE = makeKeyword( "RULE" );
    $const26$genls = constant_handles.reader_make_constant_shell( makeString( "genls" ) );
    $sym27$EL_VAR_ = makeSymbol( "EL-VAR?" );
    $const28$BaseKB = constant_handles.reader_make_constant_shell( makeString( "BaseKB" ) );
    $const29$ruleTrivialForSentenceImplication = constant_handles.reader_make_constant_shell( makeString( "ruleTrivialForSentenceImplicationConditions" ) );
  }
}
/*
 * 
 * Total time: 297 ms
 * 
 */