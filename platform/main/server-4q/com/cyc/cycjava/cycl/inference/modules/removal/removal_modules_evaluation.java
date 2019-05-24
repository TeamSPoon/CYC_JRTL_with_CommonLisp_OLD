package com.cyc.cycjava.cycl.inference.modules.removal;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.BinaryFunction;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.UnaryFunction;
import com.cyc.cycjava.cycl.constant_handles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import com.cyc.cycjava.cycl.inference.modules.preference_modules;
import com.cyc.cycjava.cycl.inference.harness.inference_modules;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.cycjava.cycl.backward;
import com.cyc.cycjava.cycl.backward_utilities;
import com.cyc.cycjava.cycl.relation_evaluation;
import com.cyc.cycjava.cycl.variables;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.cycjava.cycl.inference.inference_trampolines;
import com.cyc.cycjava.cycl.mt_relevance_macros;
import com.cyc.cycjava.cycl.cycl_utilities;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.cycjava.cycl.arguments;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class removal_modules_evaluation
    extends
      SubLTranslatedFile
{
  public static final SubLFile me;
  public static final String myName = "com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_evaluation";
  public static final String myFingerPrint = "a5e33da004b66a5fa4c973f6ed1fe8bb1d3d981ce1d9638e5caacc339aa9a8af";
  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-evaluation.lisp", position = 1119L)
  private static SubLSymbol $default_eval_cost$;
  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-evaluation.lisp", position = 4750L)
  private static SubLSymbol $evaluatable_predicates_to_optimize$;
  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-evaluation.lisp", position = 5044L)
  private static SubLSymbol $removal_generic_eval_modules$;
  private static final SubLSymbol $kw0$CODE;
  private static final SubLSymbol $kw1$EVAL;
  private static final SubLSymbol $kw2$REMOVAL_EVAL;
  private static final SubLList $list3;
  private static final SubLSymbol $kw4$REMOVAL_NOT_EVAL;
  private static final SubLList $list5;
  private static final SubLSymbol $kw6$EVALUATABLE_PREDICATE_DOOMED_UNLESS_ALL_ARGS_BOUND;
  private static final SubLList $list7;
  private static final SubLList $list8;
  private static final SubLList $list9;

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-evaluation.lisp", position = 809L)
  public static SubLObject make_eval_support(final SubLObject sentence, SubLObject contextualizedP)
  {
    if( contextualizedP == UNPROVIDED )
    {
      contextualizedP = NIL;
    }
    final SubLObject module = ( NIL != contextualizedP ) ? $kw0$CODE : $kw1$EVAL;
    return arguments.make_hl_support( module, sentence, UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-evaluation.lisp", position = 1322L)
  public static SubLObject removal_eval_exclusive(final SubLObject asent, SubLObject sense)
  {
    if( sense == UNPROVIDED )
    {
      sense = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject pred = cycl_utilities.atomic_sentence_predicate( asent );
    final SubLObject mt = mt_relevance_macros.current_mt_relevance_mt();
    final SubLObject constraint_mt = mt_relevance_macros.conservative_constraint_mt( mt );
    SubLObject exclusiveP = NIL;
    final SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate( constraint_mt );
    final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding( thread );
    final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding( thread );
    final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding( thread );
    try
    {
      mt_relevance_macros.$mt$.bind( mt_relevance_macros.update_inference_mt_relevance_mt( mt_var ), thread );
      mt_relevance_macros.$relevant_mt_function$.bind( mt_relevance_macros.update_inference_mt_relevance_function( mt_var ), thread );
      mt_relevance_macros.$relevant_mts$.bind( mt_relevance_macros.update_inference_mt_relevance_mt_list( mt_var ), thread );
      exclusiveP = inference_trampolines.inference_evaluatable_predicateP( pred );
    }
    finally
    {
      mt_relevance_macros.$relevant_mts$.rebind( _prev_bind_3, thread );
      mt_relevance_macros.$relevant_mt_function$.rebind( _prev_bind_2, thread );
      mt_relevance_macros.$mt$.rebind( _prev_bind_0, thread );
    }
    return exclusiveP;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-evaluation.lisp", position = 1688L)
  public static SubLObject removal_eval_required(final SubLObject asent, SubLObject sense)
  {
    if( sense == UNPROVIDED )
    {
      sense = NIL;
    }
    return variables.fully_bound_p( asent );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-evaluation.lisp", position = 1799L)
  public static SubLObject removal_eval_expand(final SubLObject asent, SubLObject sense)
  {
    if( sense == UNPROVIDED )
    {
      sense = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    thread.resetMultipleValues();
    final SubLObject v_answer = relation_evaluation.cyc_evaluate( asent );
    final SubLObject validP = thread.secondMultipleValue();
    final SubLObject contextualizedP = thread.thirdMultipleValue();
    thread.resetMultipleValues();
    if( NIL != validP && NIL != v_answer )
    {
      final SubLObject hl_support_formula = backward_utilities.inference_canonicalize_hl_support_literal( asent );
      final SubLObject support = make_eval_support( hl_support_formula, contextualizedP );
      backward.removal_add_node( support, UNPROVIDED, UNPROVIDED );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-evaluation.lisp", position = 2693L)
  public static SubLObject removal_not_eval_exclusive(final SubLObject asent, SubLObject sense)
  {
    if( sense == UNPROVIDED )
    {
      sense = NIL;
    }
    return inference_trampolines.inference_evaluatable_predicateP( cycl_utilities.atomic_sentence_predicate( asent ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-evaluation.lisp", position = 3025L)
  public static SubLObject removal_not_eval_required(final SubLObject asent, SubLObject sense)
  {
    if( sense == UNPROVIDED )
    {
      sense = NIL;
    }
    return variables.fully_bound_p( asent );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-evaluation.lisp", position = 3140L)
  public static SubLObject removal_not_eval_expand(final SubLObject asent, SubLObject sense)
  {
    if( sense == UNPROVIDED )
    {
      sense = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    thread.resetMultipleValues();
    final SubLObject v_answer = relation_evaluation.cyc_evaluate( asent );
    final SubLObject validP = thread.secondMultipleValue();
    final SubLObject contextualizedP = thread.thirdMultipleValue();
    thread.resetMultipleValues();
    if( NIL != validP && NIL == v_answer )
    {
      final SubLObject hl_support_formula = backward_utilities.inference_canonicalize_hl_support_literal( asent );
      final SubLObject support = make_eval_support( cycl_utilities.negate( hl_support_formula ), contextualizedP );
      backward.removal_add_node( support, UNPROVIDED, UNPROVIDED );
    }
    return NIL;
  }

  public static SubLObject declare_removal_modules_evaluation_file()
  {
    SubLFiles.declareFunction( me, "make_eval_support", "MAKE-EVAL-SUPPORT", 1, 1, false );
    SubLFiles.declareFunction( me, "removal_eval_exclusive", "REMOVAL-EVAL-EXCLUSIVE", 1, 1, false );
    new $removal_eval_exclusive$UnaryFunction();
    new $removal_eval_exclusive$BinaryFunction();
    SubLFiles.declareFunction( me, "removal_eval_required", "REMOVAL-EVAL-REQUIRED", 1, 1, false );
    new $removal_eval_required$UnaryFunction();
    new $removal_eval_required$BinaryFunction();
    SubLFiles.declareFunction( me, "removal_eval_expand", "REMOVAL-EVAL-EXPAND", 1, 1, false );
    SubLFiles.declareFunction( me, "removal_not_eval_exclusive", "REMOVAL-NOT-EVAL-EXCLUSIVE", 1, 1, false );
    SubLFiles.declareFunction( me, "removal_not_eval_required", "REMOVAL-NOT-EVAL-REQUIRED", 1, 1, false );
    SubLFiles.declareFunction( me, "removal_not_eval_expand", "REMOVAL-NOT-EVAL-EXPAND", 1, 1, false );
    return NIL;
  }

  public static SubLObject init_removal_modules_evaluation_file()
  {
    $default_eval_cost$ = SubLFiles.defparameter( "*DEFAULT-EVAL-COST*", ONE_INTEGER );
    $evaluatable_predicates_to_optimize$ = SubLFiles.deflexical( "*EVALUATABLE-PREDICATES-TO-OPTIMIZE*", $list8 );
    $removal_generic_eval_modules$ = SubLFiles.deflexical( "*REMOVAL-GENERIC-EVAL-MODULES*", $list9 );
    return NIL;
  }

  public static SubLObject setup_removal_modules_evaluation_file()
  {
    inference_modules.inference_removal_module( $kw2$REMOVAL_EVAL, $list3 );
    inference_modules.inference_removal_module( $kw4$REMOVAL_NOT_EVAL, $list5 );
    preference_modules.inference_preference_module( $kw6$EVALUATABLE_PREDICATE_DOOMED_UNLESS_ALL_ARGS_BOUND, $list7 );
    SubLObject cdolist_list_var = $evaluatable_predicates_to_optimize$.getGlobalValue();
    SubLObject pred = NIL;
    pred = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      inference_modules.register_solely_specific_removal_module_predicate( pred );
      SubLObject cdolist_list_var_$1 = $removal_generic_eval_modules$.getGlobalValue();
      SubLObject module = NIL;
      module = cdolist_list_var_$1.first();
      while ( NIL != cdolist_list_var_$1)
      {
        inference_modules.inference_removal_module_use_generic( pred, module );
        cdolist_list_var_$1 = cdolist_list_var_$1.rest();
        module = cdolist_list_var_$1.first();
      }
      cdolist_list_var = cdolist_list_var.rest();
      pred = cdolist_list_var.first();
    }
    return NIL;
  }

  @Override
  public void declareFunctions()
  {
    declare_removal_modules_evaluation_file();
  }

  @Override
  public void initializeVariables()
  {
    init_removal_modules_evaluation_file();
  }

  @Override
  public void runTopLevelForms()
  {
    setup_removal_modules_evaluation_file();
  }
  static
  {
    me = new removal_modules_evaluation();
    $default_eval_cost$ = null;
    $evaluatable_predicates_to_optimize$ = null;
    $removal_generic_eval_modules$ = null;
    $kw0$CODE = makeKeyword( "CODE" );
    $kw1$EVAL = makeKeyword( "EVAL" );
    $kw2$REMOVAL_EVAL = makeKeyword( "REMOVAL-EVAL" );
    $list3 = ConsesLow.list( new SubLObject[] { makeKeyword( "SENSE" ), makeKeyword( "POS" ), makeKeyword( "ARITY" ), NIL, makeKeyword( "REQUIRED-PATTERN" ), ConsesLow.cons( makeKeyword( "FORT" ), makeKeyword(
        "ANYTHING" ) ), makeKeyword( "EXCLUSIVE" ), makeSymbol( "REMOVAL-EVAL-EXCLUSIVE" ), makeKeyword( "REQUIRED" ), makeSymbol( "REMOVAL-EVAL-REQUIRED" ), makeKeyword( "COST-EXPRESSION" ), makeSymbol(
            "*DEFAULT-EVAL-COST*" ), makeKeyword( "COMPLETENESS" ), makeKeyword( "COMPLETE" ), makeKeyword( "EXPAND" ), makeSymbol( "REMOVAL-EVAL-EXPAND" ), makeKeyword( "DOCUMENTATION" ), makeString(
                "(<evaluatable predicate> . <fully bound>)\nusing (#$evaluationDefn <evaluatable predicate> <symbol>)\nand calling the SubL form (<symbol> . <fully bound>)" )
    } );
    $kw4$REMOVAL_NOT_EVAL = makeKeyword( "REMOVAL-NOT-EVAL" );
    $list5 = ConsesLow.list( new SubLObject[] { makeKeyword( "SENSE" ), makeKeyword( "NEG" ), makeKeyword( "ARITY" ), NIL, makeKeyword( "REQUIRED-PATTERN" ), ConsesLow.cons( makeKeyword( "FORT" ), makeKeyword(
        "ANYTHING" ) ), makeKeyword( "EXCLUSIVE" ), makeSymbol( "REMOVAL-NOT-EVAL-EXCLUSIVE" ), makeKeyword( "REQUIRED" ), makeSymbol( "REMOVAL-NOT-EVAL-REQUIRED" ), makeKeyword( "COST-EXPRESSION" ), makeSymbol(
            "*DEFAULT-EVAL-COST*" ), makeKeyword( "COMPLETENESS" ), makeKeyword( "COMPLETE" ), makeKeyword( "EXPAND" ), makeSymbol( "REMOVAL-NOT-EVAL-EXPAND" ), makeKeyword( "DOCUMENTATION" ), makeString(
                "(#$not (<evaluatable predicate> . <fully bound>))\nusing (#$evaluationDefn <evaluatable predicate> <symbol>)\nand calling the SubL form (<symbol> . <fully bound>)" )
    } );
    $kw6$EVALUATABLE_PREDICATE_DOOMED_UNLESS_ALL_ARGS_BOUND = makeKeyword( "EVALUATABLE-PREDICATE-DOOMED-UNLESS-ALL-ARGS-BOUND" );
    $list7 = ConsesLow.list( makeKeyword( "SENSE" ), makeKeyword( "POS" ), makeKeyword( "REQUIRED-PATTERN" ), ConsesLow.list( makeKeyword( "AND" ), ConsesLow.cons( makeKeyword( "FORT" ), makeKeyword(
        "NOT-FULLY-BOUND" ) ), ConsesLow.cons( ConsesLow.list( makeKeyword( "TEST" ), makeSymbol( "INFERENCE-EVALUATABLE-PREDICATE?" ) ), makeKeyword( "ANYTHING" ) ) ), makeKeyword( "PREFERENCE" ), makeSymbol(
            "MUST-BIND-ALL-ARGS" ) );
    $list8 = ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "greaterThan" ) ), constant_handles.reader_make_constant_shell( makeString( "greaterThanOrEqualTo" ) ), constant_handles
        .reader_make_constant_shell( makeString( "quantitySubsumes" ) ) );
    $list9 = ConsesLow.list( makeKeyword( "REMOVAL-EVAL" ), makeKeyword( "REMOVAL-NOT-EVAL" ) );
  }

  public static final class $removal_eval_exclusive$UnaryFunction
      extends
        UnaryFunction
  {
    public $removal_eval_exclusive$UnaryFunction()
    {
      super( SubLTranslatedFile.extractFunctionNamed( "REMOVAL-EVAL-EXCLUSIVE" ) );
    }

    @Override
    public SubLObject processItem(final SubLObject arg1)
    {
      return removal_eval_exclusive( arg1, $removal_eval_exclusive$UnaryFunction.UNPROVIDED );
    }
  }

  public static final class $removal_eval_exclusive$BinaryFunction
      extends
        BinaryFunction
  {
    public $removal_eval_exclusive$BinaryFunction()
    {
      super( SubLTranslatedFile.extractFunctionNamed( "REMOVAL-EVAL-EXCLUSIVE" ) );
    }

    @Override
    public SubLObject processItem(final SubLObject arg1, final SubLObject arg2)
    {
      return removal_eval_exclusive( arg1, arg2 );
    }
  }

  public static final class $removal_eval_required$UnaryFunction
      extends
        UnaryFunction
  {
    public $removal_eval_required$UnaryFunction()
    {
      super( SubLTranslatedFile.extractFunctionNamed( "REMOVAL-EVAL-REQUIRED" ) );
    }

    @Override
    public SubLObject processItem(final SubLObject arg1)
    {
      return removal_eval_required( arg1, $removal_eval_required$UnaryFunction.UNPROVIDED );
    }
  }

  public static final class $removal_eval_required$BinaryFunction
      extends
        BinaryFunction
  {
    public $removal_eval_required$BinaryFunction()
    {
      super( SubLTranslatedFile.extractFunctionNamed( "REMOVAL-EVAL-REQUIRED" ) );
    }

    @Override
    public SubLObject processItem(final SubLObject arg1, final SubLObject arg2)
    {
      return removal_eval_required( arg1, arg2 );
    }
  }
}
/*
 * 
 * Total time: 95 ms
 * 
 */