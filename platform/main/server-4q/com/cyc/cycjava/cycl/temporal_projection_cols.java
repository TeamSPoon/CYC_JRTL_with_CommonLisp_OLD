package com.cyc.cycjava.cycl;

import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeBoolean;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeDouble;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeInteger;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeKeyword;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeString;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeSymbol;

import com.cyc.cycjava.cycl.inference.harness.inference_kernel;
import com.cyc.cycjava.cycl.sbhl.sbhl_time_query_processing;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Mapping;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sort;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLFloat;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class temporal_projection_cols
    extends
      SubLTranslatedFile
{
  public static final SubLFile me;
  public static final String myName = "com.cyc.cycjava.cycl.temporal_projection_cols";
  public static final String myFingerPrint = "17a4c4aaa1542d0bb67a5135f18fe391b5437e0a18ee10d254b8980dc07e80c7";
  @SubLTranslatedFile.SubL(source = "cycl/temporal-projection-cols.lisp", position = 114037L)
  public static SubLSymbol $uniform_distribution_with_value_zero$;
  @SubLTranslatedFile.SubL(source = "cycl/temporal-projection-cols.lisp", position = 114171L)
  public static SubLSymbol $uniform_distribution_with_value_one$;
  @SubLTranslatedFile.SubL(source = "cycl/temporal-projection-cols.lisp", position = 114302L)
  public static SubLSymbol $tp_current_var$;
  @SubLTranslatedFile.SubL(source = "cycl/temporal-projection-cols.lisp", position = 114348L)
  public static SubLSymbol $temporal_projection_justifications$;
  @SubLTranslatedFile.SubL(source = "cycl/temporal-projection-cols.lisp", position = 114414L)
  public static SubLSymbol $mt_for_temporal_projection$;
  @SubLTranslatedFile.SubL(source = "cycl/temporal-projection-cols.lisp", position = 114472L)
  public static SubLSymbol $temporal_projection_stack$;
  @SubLTranslatedFile.SubL(source = "cycl/temporal-projection-cols.lisp", position = 114529L)
  public static SubLSymbol $temporal_projection_answers$;
  private static final SubLSymbol $sym0$INDEXED_TERM_P;
  private static final SubLObject $const1$startingPointOfIntervalForSentenc;
  private static final SubLObject $const2$endingPointOfIntervalForSentence;
  private static final SubLObject $const3$temporallyIntersects;
  private static final SubLSymbol $kw4$POS;
  private static final SubLObject $const5$BaseKB;
  private static final SubLList $list6;
  private static final SubLSymbol $kw7$CODE;
  private static final SubLSymbol $sym8$E;
  private static final SubLSymbol $sym9$S;
  private static final SubLObject $const10$TimeIntervalInclusiveFn;
  private static final SubLObject $const11$temporallySubsumes;
  private static final SubLObject $const12$defaultConditionalProbabilityForS;
  private static final SubLObject $const13$conditionalProbabilityForSentence;
  private static final SubLObject $const14$defaultConditionalProbabilityOfSt;
  private static final SubLObject $const15$isa;
  private static final SubLObject $const16$conditionalProbabilityOfStateAfte;
  private static final SubLObject $const17$defaultConditionalProbabilityForS;
  private static final SubLObject $const18$conditionalProbabilityOfStateAfte;
  private static final SubLObject $const19$defaultConditionalProbabilityForS;
  private static final SubLSymbol $sym20$LIST_TIME_COMPARATOR;
  private static final SubLObject $const21$timeElapsed;
  private static final SubLObject $const22$NumericLikelihoodFn;
  private static final SubLObject $const23$temporalInterpolationFunctionForP;
  private static final SubLObject $const24$durationWeightedDistributionForPr;
  private static final SubLObject $const25$duration;
  private static final SubLObject $const26$decayDistributionForAssertionInTi;
  private static final SubLList $list27;
  private static final SubLSymbol $sym28$_X;
  private static final SubLSymbol $sym29$_Y;
  private static final SubLObject $const30$distributionForSentenceGivenNeces;
  private static final SubLList $list31;
  private static final SubLSymbol $sym32$_Z;
  private static final SubLObject $const33$conditionalProbabilityOfStateGive;
  private static final SubLObject $const34$distributionForSentenceGivenSuffi;
  private static final SubLObject $const35$conditionalProbabilityPatternsFor;
  private static final SubLFloat $float36$0_001;
  private static final SubLSymbol $sym37$FORMULA_ARG0;
  private static final SubLObject $const38$delayBetweenStartOfEventTypesInSi;
  private static final SubLObject $const39$subEvents;
  private static final SubLList $list40;
  private static final SubLObject $const41$defaultDecayFunctionForPredicate;
  private static final SubLObject $const42$defaultDecayFunctionForPredicate_;
  private static final SubLObject $const43$decayDistributionForSpecs;
  private static final SubLObject $const44$EverythingPSC;
  private static final SubLObject $const45$temporalInterpolationFunctionForC;
  private static final SubLObject $const46$eventTypeEndsIntervalForState;
  private static final SubLObject $const47$eventTypeStartsIntervalForState;
  private static final SubLObject $const48$startingPointOfRiskPeriodForAsser;
  private static final SubLObject $const49$intensityFunctionForEventTypeInIn;
  private static final SubLObject $const50$startingDate;
  private static final SubLObject $const51$evaluate;
  private static final SubLObject $const52$DateAfterFn;
  private static final SubLObject $const53$QuotientFn;
  private static final SubLObject $const54$PlusFn;
  private static final SubLObject $const55$intensityFunctionForEventType;
  private static final SubLObject $const56$lessThan;
  private static final SubLObject $const57$transitionProbabilityBetweenColle;
  private static final SubLList $list58;
  private static final SubLObject $const59$startingPointForAssertion;
  private static final SubLObject $const60$DateBeforeFn;
  private static final SubLObject $const61$DifferenceFn;
  private static final SubLObject $const62$laterThan;
  private static final SubLString $str63$___query_result___a_diff__a_;
  private static final SubLString $str64$____a__a_;
  private static final SubLObject $const65$maximumCardinalityOfCollection;
  private static final SubLObject $const66$decayDistributionForAssertionInIn;
  private static final SubLList $list67;
  private static final SubLSymbol $sym68$_DATE;
  private static final SubLSymbol $sym69$_INTERVAL;
  private static final SubLList $list70;
  private static final SubLObject $const71$conditionalProbabilityForCollecti;
  private static final SubLObject $const72$conditionalProbabilityForCollecti;
  private static final SubLObject $const73$delayBetweenCollections;
  private static final SubLSymbol $sym74$MAX;
  private static final SubLObject $const75$defaultDecayFunctionForCollection;
  private static final SubLObject $const76$temporalRelationBetweenCollection;
  private static final SubLList $list77;
  private static final SubLObject $const78$decayDistributionForCollectionInI;
  private static final SubLObject $const79$defaultDecayDistributionForCollec;
  private static final SubLObject $const80$defaultDecayFunctionForCollection;
  private static final SubLObject $const81$ConstantFunction;
  private static final SubLObject $const82$defaultDecayFunctionForCollection;
  private static final SubLList $list83;
  private static final SubLSymbol $sym84$_W;
  private static final SubLObject $const85$decayFunctionForCollectionInInter;
  private static final SubLObject $const86$decayDistributionForAssertionInIn;
  private static final SubLObject $const87$hourNumberOfDate;
  private static final SubLInteger $int88$23;
  private static final SubLObject $const89$decayDistributionForAssertion_Cau;
  private static final SubLObject $const90$endingDate;
  private static final SubLList $list91;
  private static final SubLSymbol $sym92$_COL;
  private static final SubLObject $const93$InverseBinaryPredicateFn;
  private static final SubLObject $const94$UniformPersistenceDistributionWit;
  private static final SubLObject $const95$dateOfEvent;
  private static final SubLObject $const96$endsDuring;
  private static final SubLObject $const97$decayFunctionForPredicateInInterv;
  private static final SubLObject $const98$decayFunctionForSpecsInInterval;
  private static final SubLObject $const99$decayFunctionInInterval;
  private static final SubLObject $const100$intervalRange;
  private static final SubLObject $const101$PlusInfinity;
  private static final SubLObject $const102$lessThanOrEqualTo;
  private static final SubLObject $const103$ExponentialDecayDistributionWithI;
  private static final SubLObject $const104$ExponentialDecayDistributionWithI;
  private static final SubLObject $const105$BoundedExponentiallyIncreasingFun;
  private static final SubLObject $const106$NormalDistribution;
  private static final SubLObject $const107$LinearlyDecreasingFunction;
  private static final SubLObject $const108$ExponentiallyDecreasingFunction;
  private static final SubLObject $const109$BoundedExponentiallyIncreasingFun;
  private static final SubLObject $const110$LinearlyIncreasingFunction;
  private static final SubLObject $const111$ExponentialDecayDistributionWithP;
  private static final SubLObject $const112$exponentialDecayDistributionWithP;
  private static final SubLInteger $int113$50;
  private static final SubLFloat $float114$2_71;
  private static final SubLObject $const115$boundedExponentiallyIncreasingFun;
  private static final SubLObject $const116$boundedExponentiallyIncreasingFun;
  private static final SubLObject $const117$exponentialDecayDistributionWithI;
  private static final SubLObject $const118$exponentialDecayDistributionWithI;
  private static final SubLObject $const119$uniformPersistenceDistributionWit;
  private static final SubLObject $const120$normalDistributionWithParameters;
  private static final SubLFloat $float121$1_414;
  private static final SubLFloat $float122$0_5;
  private static final SubLObject $const123$linearDecayFunctionWithSlope;
  private static final SubLObject $const124$linearlyIncreasingFunctionWithSlo;
  private static final SubLObject $const125$MinusInfinity;
  private static final SubLObject $const126$greaterThan;
  private static final SubLObject $const127$equals;
  private static final SubLObject $const128$SomeTimeInIntervalFn;
  private static final SubLObject $const129$ist;
  private static final SubLObject $const130$TimeIntervalBetweenFn;
  private static final SubLObject $const131$Now;
  private static final SubLObject $const132$Now_Indexical;
  private static final SubLObject $const133$indexicalReferent;
  private static final SubLObject $const134$TimeInterval;
  private static final SubLList $list135;
  private static final SubLObject $const136$startsAfterEndingOf;
  private static final SubLSymbol $sym137$RELEVANT_MT_IS_EVERYTHING;
  private static final SubLSymbol $sym138$_EXIT;
  private static final SubLObject $const139$TimeDependentCollection;
  private static final SubLObject $const140$TimeDependentRelation;
  private static final SubLObject $const141$unknownSentence;
  private static final SubLList $list142;
  private static final SubLList $list143;
  private static final SubLObject $const144$temporalRelationBetweenArguments;
  private static final SubLObject $const145$endsAfterStartingOf;
  private static final SubLObject $const146$FutureTensePredicate;
  private static final SubLObject $const147$CoexistingObjectsPredicate;
  private static final SubLList $list148;
  private static final SubLObject $const149$earliestDateForCollectionMembers;
  private static final SubLObject $const150$Date;
  private static final SubLObject $const151$BiologicalLivingObject;
  private static final SubLObject $const152$argIsa;
  private static final SubLObject $const153$genls;
  private static final SubLList $list154;
  private static final SubLObject $const155$quotedIsa;
  private static final SubLList $list156;
  private static final SubLObject $const157$valueEquals;
  private static final SubLObject $const158$TimeElapsedFn;
  private static final SubLList $list159;
  private static final SubLFloat $float160$0_278;
  private static final SubLFloat $float161$0_23;
  private static final SubLFloat $float162$8_999999999999999e_4;
  private static final SubLFloat $float163$0_078;
  private static final SubLObject $const164$startingPointOfSubIntervalForAsse;
  private static final SubLObject $const165$endingPointOfSubIntervalForAssert;
  private static final SubLSymbol $sym166$_;
  private static final SubLObject $const167$and;
  private static final SubLObject $const168$MonthsDuration;
  private static final SubLObject $const169$Lambda;
  private static final SubLObject $const170$TimesFn;
  private static final SubLObject $const171$ExponentFn;
  private static final SubLFloat $float172$2_78;
  private static final SubLObject $const173$MinusFn;
  private static final SubLSymbol $kw174$INFERENCE_MODE;
  private static final SubLSymbol $kw175$MINIMAL;
  private static final SubLSymbol $kw176$ALLOW_INDETERMINATE_RESULTS_;
  private static final SubLSymbol $kw177$DISJUNCTION_FREE_EL_VARS_POLICY;
  private static final SubLSymbol $kw178$COMPUTE_INTERSECTION;
  private static final SubLSymbol $kw179$TRANSFORMATION_ALLOWED_;
  private static final SubLSymbol $kw180$ADD_RESTRICTION_LAYER_OF_INDIRECTION_;
  private static final SubLSymbol $kw181$NEW_TERMS_ALLOWED_;
  private static final SubLSymbol $kw182$COMPUTE_ANSWER_JUSTIFICATIONS_;
  private static final SubLSymbol $kw183$MAX_NUMBER;
  private static final SubLSymbol $kw184$MAX_TIME;
  private static final SubLFloat $float185$0_01;
  private static final SubLSymbol $kw186$PROBABLY_APPROXIMATELY_DONE;
  private static final SubLFloat $float187$1_0;
  private static final SubLSymbol $kw188$MAX_PROOF_DEPTH;
  private static final SubLSymbol $kw189$ANSWER_LANGUAGE;
  private static final SubLSymbol $kw190$HL;
  private static final SubLSymbol $kw191$CONTINUABLE_;
  private static final SubLSymbol $kw192$PRODUCTIVITY_LIMIT;
  private static final SubLInteger $int193$20000000;
  private static final SubLObject $const194$priorProbabilityForPredicate_Type;
  private static final SubLSymbol $sym195$LAMBDA_FUNCTION_ELT;
  private static final SubLObject $const196$HomoSapiens;
  private static final SubLObject $const197$distributionForTerminationOfMembe;
  private static final SubLList $list198;
  private static final SubLObject $const199$distributionForCalculatingDuratio;
  private static final SubLFloat $float200$9_999999999999999e_7;
  private static final SubLString $str201$___Time___a__a_Not_ending___a;

  @SubLTranslatedFile.SubL(source = "cycl/temporal-projection-cols.lisp", position = 726L)
  public static SubLObject collect_intervals_from_events(final SubLObject sentence, final SubLObject upper, final SubLObject justifyP)
  {
    final SubLObject list_of_terms_1 = list_utilities.remove_if_not( Symbols.symbol_function( $sym0$INDEXED_TERM_P ), ConsesLow.append( sentence, ConsesLow.list( $const1$startingPointOfIntervalForSentenc ) ), UNPROVIDED,
        UNPROVIDED, UNPROVIDED, UNPROVIDED );
    final SubLObject list_of_terms_2 = list_utilities.remove_if_not( Symbols.symbol_function( $sym0$INDEXED_TERM_P ), ConsesLow.append( sentence, ConsesLow.list( $const2$endingPointOfIntervalForSentence ) ), UNPROVIDED,
        UNPROVIDED, UNPROVIDED, UNPROVIDED );
    final SubLObject starting_point_assertions = virtual_indexing.assertions_mentioning_terms( list_of_terms_1, UNPROVIDED );
    final SubLObject ending_point_assertions = virtual_indexing.assertions_mentioning_terms( list_of_terms_2, UNPROVIDED );
    if( NIL != starting_point_assertions && NIL != ending_point_assertions )
    {
      return collect_intervals_from_both_starting_point_and_ending_point_assertions( sentence, starting_point_assertions, ending_point_assertions, upper, justifyP );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/temporal-projection-cols.lisp", position = 1420L)
  public static SubLObject create_forward_intervals_from_events(final SubLObject assertion, final SubLObject upper, final SubLObject lower)
  {
    final SubLObject sentence = assertions_high.gaf_formula( assertion );
    final SubLObject sentence_in_assertion = cycl_utilities.formula_arg1( sentence, UNPROVIDED );
    final SubLObject time = cycl_utilities.formula_arg2( sentence, UNPROVIDED );
    SubLObject ret_value = NIL;
    final SubLObject list_of_terms_2 = list_utilities.remove_if_not( Symbols.symbol_function( $sym0$INDEXED_TERM_P ), ConsesLow.append( sentence_in_assertion, ConsesLow.list( $const2$endingPointOfIntervalForSentence ) ),
        UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
    final SubLObject ending_point_assertions = virtual_indexing.assertions_mentioning_terms( list_of_terms_2, UNPROVIDED );
    SubLObject cdolist_list_var;
    final SubLObject results = cdolist_list_var = collect_intervals_from_both_starting_point_and_ending_point_assertions( sentence_in_assertion, ConsesLow.list( assertion ), ending_point_assertions, upper, T );
    SubLObject entry = NIL;
    entry = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      final SubLObject interval = cycl_utilities.formula_arg0( entry );
      if( NIL != sbhl_time_query_processing.true_temporal_relation_literalP( $const3$temporallyIntersects, time, interval, $kw4$POS, $const5$BaseKB ) )
      {
        ret_value = ConsesLow.cons( entry, ret_value );
      }
      cdolist_list_var = cdolist_list_var.rest();
      entry = cdolist_list_var.first();
    }
    return ret_value;
  }

  @SubLTranslatedFile.SubL(source = "cycl/temporal-projection-cols.lisp", position = 2242L)
  public static SubLObject create_backward_intervals_from_events(final SubLObject assertion, final SubLObject upper, final SubLObject lower)
  {
    final SubLObject sentence = assertions_high.gaf_formula( assertion );
    final SubLObject sentence_in_assertion = cycl_utilities.formula_arg1( sentence, UNPROVIDED );
    final SubLObject time = cycl_utilities.formula_arg2( sentence, UNPROVIDED );
    SubLObject ret_value = NIL;
    final SubLObject list_of_terms_2 = list_utilities.remove_if_not( Symbols.symbol_function( $sym0$INDEXED_TERM_P ), ConsesLow.append( sentence_in_assertion, ConsesLow.list(
        $const1$startingPointOfIntervalForSentenc ) ), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
    final SubLObject starting_point_assertions = virtual_indexing.assertions_mentioning_terms( list_of_terms_2, UNPROVIDED );
    SubLObject cdolist_list_var;
    final SubLObject results = cdolist_list_var = collect_intervals_from_both_starting_point_and_ending_point_assertions( sentence_in_assertion, starting_point_assertions, ConsesLow.list( assertion ), upper, T );
    SubLObject entry = NIL;
    entry = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      final SubLObject interval = cycl_utilities.formula_arg0( entry );
      if( NIL != sbhl_time_query_processing.true_temporal_relation_literalP( $const3$temporallyIntersects, time, interval, $kw4$POS, $const5$BaseKB ) )
      {
        ret_value = ConsesLow.cons( entry, ret_value );
      }
      cdolist_list_var = cdolist_list_var.rest();
      entry = cdolist_list_var.first();
    }
    possibly_retract_stale_deductions( sentence_in_assertion, ret_value );
    return ret_value;
  }

  @SubLTranslatedFile.SubL(source = "cycl/temporal-projection-cols.lisp", position = 3143L)
  public static SubLObject possibly_retract_stale_deductions(final SubLObject sentence, final SubLObject lst_of_results)
  {
    SubLObject cdolist_list_var;
    final SubLObject all_assertions = cdolist_list_var = temporal_projection.get_assertions_for_fact_1( sentence );
    SubLObject assertion = NIL;
    assertion = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      SubLObject cdolist_list_var_$1 = assertions_high.assertion_arguments( assertion );
      SubLObject argument = NIL;
      argument = cdolist_list_var_$1.first();
      while ( NIL != cdolist_list_var_$1)
      {
        if( NIL != deduction_handles.deduction_p( argument ) && NIL == temporal_projection_utilities.deduction_not_produced_by_temporal_projectionP( argument ) )
        {
          final SubLObject time = temporal_projection.get_time_for_assertion_1( assertion );
          final SubLObject mt = assertions_high.assertion_mt( assertion );
          final SubLObject canon_cnfs = czer_main.canonicalize_gaf( sentence, mt );
          SubLObject cdolist_list_var_$2 = lst_of_results;
          SubLObject result = NIL;
          result = cdolist_list_var_$2.first();
          while ( NIL != cdolist_list_var_$2)
          {
            final SubLObject time_2 = cycl_utilities.formula_arg0( result );
            if( NIL != sbhl_time_query_processing.true_temporal_relation_literalP( $const3$temporallyIntersects, time, time_2, $kw4$POS, $const5$BaseKB ) && NIL != argument_is_better_thanP( cycl_utilities.formula_arg1(
                result, UNPROVIDED ), deductions_high.deduction_supports( argument ) ) )
            {
              SubLObject cdolist_list_var_$3 = canon_cnfs;
              SubLObject canon_cnf_bind_list_pair = NIL;
              canon_cnf_bind_list_pair = cdolist_list_var_$3.first();
              while ( NIL != cdolist_list_var_$3)
              {
                SubLObject current;
                final SubLObject datum = current = canon_cnf_bind_list_pair;
                SubLObject canon_cnf = NIL;
                cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list6 );
                canon_cnf = current.first();
                current = current.rest();
                final SubLObject binding_list = current.isCons() ? current.first() : NIL;
                cdestructuring_bind.destructuring_bind_must_listp( current, datum, $list6 );
                current = current.rest();
                if( NIL == current )
                {
                  hl_storage_modules.hl_remove_deduction( canon_cnf, mt, deductions_high.deduction_supports( argument ) );
                }
                else
                {
                  cdestructuring_bind.cdestructuring_bind_error( datum, $list6 );
                }
                cdolist_list_var_$3 = cdolist_list_var_$3.rest();
                canon_cnf_bind_list_pair = cdolist_list_var_$3.first();
              }
            }
            cdolist_list_var_$2 = cdolist_list_var_$2.rest();
            result = cdolist_list_var_$2.first();
          }
        }
        cdolist_list_var_$1 = cdolist_list_var_$1.rest();
        argument = cdolist_list_var_$1.first();
      }
      cdolist_list_var = cdolist_list_var.rest();
      assertion = cdolist_list_var.first();
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/temporal-projection-cols.lisp", position = 4158L)
  public static SubLObject argument_is_better_thanP(final SubLObject argument_1, final SubLObject argument_2)
  {
    if( NIL != argument_has_more_factsP( argument_1, argument_2 ) )
    {
      return T;
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/temporal-projection-cols.lisp", position = 4300L)
  public static SubLObject argument_has_more_factsP(final SubLObject lst_1, final SubLObject lst_2)
  {
    SubLObject cdolist_list_var = lst_2;
    SubLObject x = NIL;
    x = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      if( NIL == support_subsumed_by_justificationP( x, lst_1 ) )
      {
        return NIL;
      }
      cdolist_list_var = cdolist_list_var.rest();
      x = cdolist_list_var.first();
    }
    return T;
  }

  @SubLTranslatedFile.SubL(source = "cycl/temporal-projection-cols.lisp", position = 4464L)
  public static SubLObject support_subsumed_by_justificationP(final SubLObject support, final SubLObject lst_of_supports)
  {
    if( NIL != conses_high.member( support, lst_of_supports, Symbols.symbol_function( EQUAL ), UNPROVIDED ) )
    {
      return T;
    }
    if( cycl_utilities.formula_arg0( support ).eql( $kw7$CODE ) )
    {
      return T;
    }
    if( NIL != assertion_handles.assertion_p( support ) )
    {
      if( NIL != distribution_related_supportP( support ) )
      {
        return T;
      }
      SubLObject cdolist_list_var = assertions_high.assertion_arguments( support );
      SubLObject argument = NIL;
      argument = cdolist_list_var.first();
      while ( NIL != cdolist_list_var)
      {
        if( NIL != deduction_handles.deduction_p( argument ) )
        {
          SubLObject cdolist_list_var_$4 = deductions_high.deduction_supports( argument );
          SubLObject support_1 = NIL;
          support_1 = cdolist_list_var_$4.first();
          while ( NIL != cdolist_list_var_$4)
          {
            if( NIL != conses_high.member( support_1, lst_of_supports, Symbols.symbol_function( EQUAL ), UNPROVIDED ) )
            {
              return T;
            }
            cdolist_list_var_$4 = cdolist_list_var_$4.rest();
            support_1 = cdolist_list_var_$4.first();
          }
        }
        cdolist_list_var = cdolist_list_var.rest();
        argument = cdolist_list_var.first();
      }
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/temporal-projection-cols.lisp", position = 4986L)
  public static SubLObject distribution_related_supportP(final SubLObject support)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject gaf = assertions_high.gaf_formula( support );
    final SubLObject pred = cycl_utilities.formula_arg0( gaf );
    if( NIL != conses_high.member( pred, temporal_projection_utilities.$temporal_projection_distribution_predicate_list$.getDynamicValue( thread ), UNPROVIDED, UNPROVIDED ) )
    {
      return T;
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/temporal-projection-cols.lisp", position = 5202L)
  public static SubLObject collect_intervals_from_events_for_negated_sentence(final SubLObject sentence, final SubLObject lower, final SubLObject justifyP)
  {
    final SubLObject list_of_terms_1 = list_utilities.remove_if_not( Symbols.symbol_function( $sym0$INDEXED_TERM_P ), ConsesLow.append( sentence, ConsesLow.list( $const1$startingPointOfIntervalForSentenc ) ), UNPROVIDED,
        UNPROVIDED, UNPROVIDED, UNPROVIDED );
    final SubLObject list_of_terms_2 = list_utilities.remove_if_not( Symbols.symbol_function( $sym0$INDEXED_TERM_P ), ConsesLow.append( sentence, ConsesLow.list( $const2$endingPointOfIntervalForSentence ) ), UNPROVIDED,
        UNPROVIDED, UNPROVIDED, UNPROVIDED );
    final SubLObject starting_point_assertions = virtual_indexing.assertions_mentioning_terms( list_of_terms_1, UNPROVIDED );
    final SubLObject ending_point_assertions = virtual_indexing.assertions_mentioning_terms( list_of_terms_2, UNPROVIDED );
    if( NIL != starting_point_assertions && NIL != ending_point_assertions )
    {
      return collect_intervals_from_both_starting_point_and_ending_point_assertions_negated( sentence, starting_point_assertions, ending_point_assertions, lower, justifyP );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/temporal-projection-cols.lisp", position = 5931L)
  public static SubLObject collect_intervals_from_both_starting_point_and_ending_point_assertions(final SubLObject sentence, final SubLObject starting_point_assertions, final SubLObject ending_point_assertions,
      final SubLObject upper, final SubLObject justifyP)
  {
    final SubLObject timeline = create_time_line_from_assertions( starting_point_assertions, ending_point_assertions );
    SubLObject previous_type = NIL;
    final SubLObject len = Sequences.length( timeline );
    SubLObject previous_entry = NIL;
    SubLObject interval_justification_pairs = NIL;
    SubLObject count;
    SubLObject entry;
    SubLObject current_type;
    SubLObject result;
    SubLObject previous_time;
    SubLObject current_time;
    SubLObject result_entry;
    SubLObject time_interval_forward;
    SubLObject time_interval_from_both_starting_and_ending_dates;
    SubLObject time_interval_final;
    SubLObject justifications;
    for( count = NIL, count = ZERO_INTEGER; count.numL( len ); count = Numbers.add( count, ONE_INTEGER ) )
    {
      entry = ConsesLow.nth( count, timeline );
      current_type = cycl_utilities.formula_arg2( entry, UNPROVIDED );
      if( count.numE( ZERO_INTEGER ) && current_type.eql( $sym8$E ) )
      {
        result = backward_intervals_for_sentence( entry, upper, justifyP );
        if( NIL != result )
        {
          interval_justification_pairs = ConsesLow.append( interval_justification_pairs, result );
        }
      }
      if( previous_type.eql( $sym9$S ) && current_type.eql( $sym8$E ) )
      {
        previous_time = cycl_utilities.formula_arg0( previous_entry );
        current_time = cycl_utilities.formula_arg0( entry );
        result_entry = cycl_utilities.formula_arg0( forward_intervals_for_sentence( previous_entry, upper, justifyP ) );
        time_interval_forward = cycl_utilities.formula_arg0( result_entry );
        time_interval_from_both_starting_and_ending_dates = ConsesLow.list( $const10$TimeIntervalInclusiveFn, previous_time, current_time );
        time_interval_final = NIL;
        justifications = NIL;
        if( NIL != sbhl_time_query_processing.true_temporal_relation_literalP( $const11$temporallySubsumes, time_interval_from_both_starting_and_ending_dates, time_interval_forward, $kw4$POS, $const5$BaseKB ) )
        {
          time_interval_final = time_interval_forward;
          if( NIL != justifyP )
          {
            justifications = ConsesLow.append( cycl_utilities.formula_arg1( result_entry, UNPROVIDED ), ConsesLow.list( cycl_utilities.formula_arg1( previous_entry, UNPROVIDED ) ) );
          }
        }
        else
        {
          time_interval_final = time_interval_from_both_starting_and_ending_dates;
          if( NIL != justifyP )
          {
            justifications = ConsesLow.list( cycl_utilities.formula_arg1( previous_entry, UNPROVIDED ), cycl_utilities.formula_arg1( entry, UNPROVIDED ) );
          }
        }
        result_entry = ConsesLow.list( time_interval_final, justifications, ONE_INTEGER );
        interval_justification_pairs = ConsesLow.cons( temporal_projection.verify_result_entry( result_entry, sentence, justifyP, upper ), interval_justification_pairs );
      }
      previous_type = current_type;
      previous_entry = entry;
      if( count.numE( Numbers.subtract( len, ONE_INTEGER ) ) && current_type.eql( $sym9$S ) )
      {
        result = forward_intervals_for_sentence( entry, upper, justifyP );
        if( NIL != result )
        {
          interval_justification_pairs = ConsesLow.append( interval_justification_pairs, result );
        }
      }
    }
    return interval_justification_pairs;
  }

  @SubLTranslatedFile.SubL(source = "cycl/temporal-projection-cols.lisp", position = 8218L)
  public static SubLObject collect_intervals_from_both_starting_point_and_ending_point_assertions_negated(final SubLObject sentence, final SubLObject starting_point_assertions, final SubLObject ending_point_assertions,
      final SubLObject lower, final SubLObject justifyP)
  {
    final SubLObject timeline = create_time_line_from_assertions( starting_point_assertions, ending_point_assertions );
    SubLObject previous_type = NIL;
    final SubLObject len = Sequences.length( timeline );
    SubLObject previous_entry = NIL;
    SubLObject interval_justification_pairs = NIL;
    SubLObject count;
    SubLObject entry;
    SubLObject current_type;
    SubLObject previous_time;
    SubLObject current_time;
    SubLObject result_entry;
    SubLObject justifications;
    for( count = NIL, count = ZERO_INTEGER; count.numL( len ); count = Numbers.add( count, ONE_INTEGER ) )
    {
      entry = ConsesLow.nth( count, timeline );
      current_type = cycl_utilities.formula_arg2( entry, UNPROVIDED );
      if( previous_type.eql( $sym8$E ) && current_type.eql( $sym9$S ) )
      {
        previous_time = cycl_utilities.formula_arg0( previous_entry );
        current_time = cycl_utilities.formula_arg0( entry );
        result_entry = NIL;
        justifications = NIL;
        if( NIL != justifyP )
        {
          justifications = ConsesLow.list( cycl_utilities.formula_arg1( entry, UNPROVIDED ), cycl_utilities.formula_arg1( previous_entry, UNPROVIDED ) );
        }
        result_entry = ConsesLow.list( ConsesLow.list( $const10$TimeIntervalInclusiveFn, previous_time, current_time ), justifications, ONE_INTEGER );
        interval_justification_pairs = ConsesLow.cons( temporal_projection.verify_result_entry( result_entry, sentence, justifyP, lower ), interval_justification_pairs );
      }
      previous_type = current_type;
      previous_entry = entry;
    }
    return interval_justification_pairs;
  }

  @SubLTranslatedFile.SubL(source = "cycl/temporal-projection-cols.lisp", position = 9353L)
  public static SubLObject backward_intervals_for_sentence(final SubLObject entry, final SubLObject upper, final SubLObject justifyP)
  {
    final SubLObject assertion = cycl_utilities.formula_arg1( entry, UNPROVIDED );
    final SubLObject time_1 = cycl_utilities.formula_arg0( entry );
    final SubLObject gaf = assertions_high.gaf_formula( assertion );
    final SubLObject sentence = cycl_utilities.formula_arg1( gaf, UNPROVIDED );
    final SubLObject backward_distribution = find_best_backward_distribution_for_sentence( sentence );
    if( NIL == backward_distribution )
    {
      return NIL;
    }
    final SubLObject gaf_$5 = assertions_high.gaf_formula( backward_distribution );
    final SubLObject predicate_in_distribution = cycl_utilities.formula_arg0( gaf_$5 );
    if( predicate_in_distribution.eql( $const12$defaultConditionalProbabilityForS ) )
    {
      return temporal_projection.collect_intervals_from_default_conditional_prob_for_sentence_backward_from_time( sentence, backward_distribution, time_1, ConsesLow.list( backward_distribution, assertion ), justifyP,
          upper );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/temporal-projection-cols.lisp", position = 10085L)
  public static SubLObject forward_intervals_for_sentence(final SubLObject entry, final SubLObject upper, final SubLObject justifyP)
  {
    final SubLObject assertion = cycl_utilities.formula_arg1( entry, UNPROVIDED );
    final SubLObject time_1 = cycl_utilities.formula_arg0( entry );
    final SubLObject gaf = assertions_high.gaf_formula( assertion );
    final SubLObject sentence = cycl_utilities.formula_arg1( gaf, UNPROVIDED );
    final SubLObject forward_distribution = find_best_forward_distribution_for_sentence( sentence );
    if( NIL == forward_distribution )
    {
      return NIL;
    }
    final SubLObject gaf_$6 = assertions_high.gaf_formula( forward_distribution );
    final SubLObject predicate_in_distribution = cycl_utilities.formula_arg0( gaf_$6 );
    if( predicate_in_distribution.eql( $const13$conditionalProbabilityForSentence ) )
    {
      return temporal_projection.collect_intervals_from_type_level_distributions_forward( sentence, forward_distribution, time_1, ConsesLow.list( forward_distribution, assertion ), justifyP, upper );
    }
    if( predicate_in_distribution.eql( $const12$defaultConditionalProbabilityForS ) )
    {
      return temporal_projection.collect_intervals_from_default_conditional_prob_for_sentence_forward_from_time( sentence, forward_distribution, time_1, ConsesLow.list( forward_distribution, assertion ), justifyP,
          upper );
    }
    if( predicate_in_distribution.eql( $const14$defaultConditionalProbabilityOfSt ) )
    {
      return temporal_projection.collect_intervals_from_default_conditional_prob_of_state_forward_from_time( sentence, forward_distribution, time_1, ConsesLow.list( forward_distribution, assertion ), justifyP, upper );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/temporal-projection-cols.lisp", position = 11331L)
  public static SubLObject find_best_backward_distribution_for_sentence(final SubLObject sentence)
  {
    SubLObject dist = find_type_level_distribution_for_sentence( sentence );
    if( NIL != dist )
    {
      return dist;
    }
    dist = find_default_backward_distribution_for_sentence( sentence );
    if( NIL != dist )
    {
      return dist;
    }
    dist = find_default_distribution_for_sentence( sentence );
    if( NIL != dist )
    {
      return dist;
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/temporal-projection-cols.lisp", position = 11723L)
  public static SubLObject find_best_forward_distribution_for_sentence(final SubLObject sentence)
  {
    SubLObject dist = find_type_level_distribution_for_sentence( sentence );
    if( NIL != dist )
    {
      return dist;
    }
    dist = find_default_forward_distribution_for_sentence( sentence );
    if( NIL != dist )
    {
      return dist;
    }
    dist = find_default_distribution_for_sentence( sentence );
    if( NIL != dist )
    {
      return dist;
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/temporal-projection-cols.lisp", position = 12113L)
  public static SubLObject find_type_level_distribution_for_sentence(final SubLObject sentence)
  {
    final SubLObject predicate = cycl_utilities.formula_arg0( sentence );
    final SubLObject arg_2 = cycl_utilities.formula_arg2( sentence, UNPROVIDED );
    SubLObject cdolist_list_var = kb_mapping_utilities.pred_value_gafs( predicate, $const13$conditionalProbabilityForSentence, UNPROVIDED, UNPROVIDED );
    SubLObject assertion = NIL;
    assertion = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      final SubLObject gaf = assertions_high.gaf_formula( assertion );
      final SubLObject arg_pos = cycl_utilities.formula_arg3( gaf, UNPROVIDED );
      if( arg_pos.numE( TWO_INTEGER ) )
      {
        final SubLObject col_in_arg_pos = cycl_utilities.formula_arg4( gaf, UNPROVIDED );
        if( NIL != isa.isaP( arg_2, col_in_arg_pos, UNPROVIDED, UNPROVIDED ) )
        {
          return assertion;
        }
      }
      cdolist_list_var = cdolist_list_var.rest();
      assertion = cdolist_list_var.first();
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/temporal-projection-cols.lisp", position = 12586L)
  public static SubLObject find_default_backward_distribution_for_sentence(final SubLObject sentence)
  {
    final SubLObject predicate = cycl_utilities.formula_arg0( sentence );
    if( predicate.eql( $const15$isa ) )
    {
      final SubLObject col = cycl_utilities.formula_arg2( sentence, UNPROVIDED );
      return cycl_utilities.formula_arg0( kb_mapping_utilities.pred_value_gafs( col, $const16$conditionalProbabilityOfStateAfte, UNPROVIDED, UNPROVIDED ) );
    }
    return cycl_utilities.formula_arg0( kb_mapping_utilities.pred_value_gafs( predicate, $const17$defaultConditionalProbabilityForS, UNPROVIDED, UNPROVIDED ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/temporal-projection-cols.lisp", position = 13016L)
  public static SubLObject find_default_forward_distribution_for_sentence(final SubLObject sentence)
  {
    final SubLObject predicate = cycl_utilities.formula_arg0( sentence );
    if( predicate.eql( $const15$isa ) )
    {
      final SubLObject col = cycl_utilities.formula_arg2( sentence, UNPROVIDED );
      return cycl_utilities.formula_arg0( kb_mapping_utilities.pred_value_gafs( col, $const18$conditionalProbabilityOfStateAfte, UNPROVIDED, UNPROVIDED ) );
    }
    return cycl_utilities.formula_arg0( kb_mapping_utilities.pred_value_gafs( predicate, $const19$defaultConditionalProbabilityForS, UNPROVIDED, UNPROVIDED ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/temporal-projection-cols.lisp", position = 13440L)
  public static SubLObject find_default_distribution_for_sentence(final SubLObject sentence)
  {
    final SubLObject predicate = cycl_utilities.formula_arg0( sentence );
    if( predicate.eql( $const15$isa ) )
    {
      final SubLObject col = cycl_utilities.formula_arg2( sentence, UNPROVIDED );
      return cycl_utilities.formula_arg0( kb_mapping_utilities.pred_value_gafs( col, $const14$defaultConditionalProbabilityOfSt, UNPROVIDED, UNPROVIDED ) );
    }
    return cycl_utilities.formula_arg0( kb_mapping_utilities.pred_value_gafs( predicate, $const12$defaultConditionalProbabilityForS, UNPROVIDED, UNPROVIDED ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/temporal-projection-cols.lisp", position = 13848L)
  public static SubLObject create_time_line_from_assertions(final SubLObject starting_assertions, final SubLObject ending_assertions)
  {
    SubLObject lst = NIL;
    SubLObject cdolist_list_var = starting_assertions;
    SubLObject assertion = NIL;
    assertion = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      lst = ConsesLow.cons( ConsesLow.list( cycl_utilities.formula_arg2( assertions_high.gaf_formula( assertion ), UNPROVIDED ), assertion, $sym9$S ), lst );
      cdolist_list_var = cdolist_list_var.rest();
      assertion = cdolist_list_var.first();
    }
    cdolist_list_var = ending_assertions;
    assertion = NIL;
    assertion = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      lst = ConsesLow.cons( ConsesLow.list( cycl_utilities.formula_arg2( assertions_high.gaf_formula( assertion ), UNPROVIDED ), assertion, $sym8$E ), lst );
      cdolist_list_var = cdolist_list_var.rest();
      assertion = cdolist_list_var.first();
    }
    return Sort.sort( lst, Symbols.symbol_function( $sym20$LIST_TIME_COMPARATOR ), UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/temporal-projection-cols.lisp", position = 14271L)
  public static SubLObject list_time_comparator(final SubLObject a, final SubLObject b)
  {
    if( NIL == a )
    {
      return makeBoolean( NIL != b );
    }
    if( NIL == b )
    {
      return NIL;
    }
    if( NIL != date_utilities.later_than( cycl_utilities.formula_arg0( b ), cycl_utilities.formula_arg0( a ) ) )
    {
      return T;
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/temporal-projection-cols.lisp", position = 14480L)
  public static SubLObject compute_likelihoods_from_event_calculus(final SubLObject sentence, final SubLObject mt_time, final SubLObject justifyP)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject list_of_terms_1 = list_utilities.remove_if_not( Symbols.symbol_function( $sym0$INDEXED_TERM_P ), ConsesLow.append( sentence, ConsesLow.list( $const1$startingPointOfIntervalForSentenc ) ), UNPROVIDED,
        UNPROVIDED, UNPROVIDED, UNPROVIDED );
    final SubLObject list_of_terms_2 = list_utilities.remove_if_not( Symbols.symbol_function( $sym0$INDEXED_TERM_P ), ConsesLow.append( sentence, ConsesLow.list( $const2$endingPointOfIntervalForSentence ) ), UNPROVIDED,
        UNPROVIDED, UNPROVIDED, UNPROVIDED );
    final SubLObject starting_point_assertions = virtual_indexing.assertions_mentioning_terms( list_of_terms_1, UNPROVIDED );
    final SubLObject ending_point_assertions = virtual_indexing.assertions_mentioning_terms( list_of_terms_2, UNPROVIDED );
    final SubLObject time_line = create_time_line_from_assertions( starting_point_assertions, ending_point_assertions );
    SubLObject cdotimes_end_var;
    SubLObject count;
    SubLObject current;
    SubLObject current_time;
    SubLObject current_assertion;
    SubLObject current_state;
    SubLObject prev;
    SubLObject best_dist;
    SubLObject predicate_in_distribution;
    SubLObject prev_time;
    SubLObject prev_assertion;
    SubLObject prev_state;
    SubLObject best_dist2;
    SubLObject predicate_in_distribution2;
    for( cdotimes_end_var = Sequences.length( time_line ), count = NIL, count = ZERO_INTEGER; count.numL( cdotimes_end_var ); count = Numbers.add( count, ONE_INTEGER ) )
    {
      current = ConsesLow.nth( count, time_line );
      current_time = ConsesLow.nth( ZERO_INTEGER, current );
      current_assertion = ConsesLow.nth( ONE_INTEGER, current );
      current_state = ConsesLow.nth( TWO_INTEGER, current );
      prev = NIL;
      if( count.numG( ZERO_INTEGER ) )
      {
        prev = ConsesLow.nth( Numbers.subtract( count, ONE_INTEGER ), time_line );
      }
      if( NIL == prev && NIL != date_utilities.later_than( current_time, mt_time ) && current_state.eql( $sym8$E ) )
      {
        best_dist = find_best_backward_distribution_for_sentence( sentence );
        predicate_in_distribution = cycl_utilities.formula_arg0( best_dist );
        if( predicate_in_distribution.eql( $const12$defaultConditionalProbabilityForS ) )
        {
          return find_likelihood_from_default_conditional_probability_for_sentence_backwards( sentence, best_dist, current_time, mt_time, ConsesLow.list( best_dist, current_assertion ), justifyP );
        }
      }
      if( NIL != prev )
      {
        prev_time = ConsesLow.nth( ZERO_INTEGER, prev );
        prev_assertion = ConsesLow.nth( ONE_INTEGER, prev );
        prev_state = ConsesLow.nth( TWO_INTEGER, prev );
        if( NIL != date_utilities.later_than( mt_time, prev_time ) && NIL != date_utilities.later_than( current_time, mt_time ) )
        {
          if( current_state.eql( $sym9$S ) && prev_state.eql( $sym8$E ) )
          {
            return Values.values( temporal_projection.$numeric_likelihood_fn_zero$.getDynamicValue( thread ), ConsesLow.list( prev_assertion, current_assertion ) );
          }
          if( current_state.eql( $sym8$E ) && prev_state.eql( $sym9$S ) )
          {
            return Values.values( temporal_projection.$numeric_likelihood_fn_one$.getDynamicValue( thread ), ConsesLow.list( prev_assertion, current_assertion ) );
          }
        }
        if( count.numE( Numbers.subtract( Sequences.length( time_line ), ONE_INTEGER ) ) && NIL != date_utilities.later_than( mt_time, current_time ) )
        {
          if( current_state.eql( $sym8$E ) )
          {
            return Values.values( temporal_projection.$numeric_likelihood_fn_zero$.getDynamicValue( thread ), ConsesLow.list( current_assertion ) );
          }
          if( current_state.eql( $sym9$S ) )
          {
            best_dist2 = find_best_forward_distribution_for_sentence( sentence );
            predicate_in_distribution2 = cycl_utilities.formula_arg0( best_dist2 );
            if( predicate_in_distribution2.eql( $const12$defaultConditionalProbabilityForS ) )
            {
              return find_likelihood_from_default_conditional_probability_for_sentence_forwards( sentence, best_dist2, current_time, mt_time, ConsesLow.list( best_dist2, current_assertion ), justifyP );
            }
          }
        }
      }
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/temporal-projection-cols.lisp", position = 17047L)
  public static SubLObject find_likelihood_from_default_conditional_probability_for_sentence_backwards(final SubLObject sentence, final SubLObject dist, final SubLObject time, final SubLObject mt_time,
      SubLObject justifications, final SubLObject justifyP)
  {
    final SubLObject prob = cycl_utilities.formula_arg4( dist, UNPROVIDED );
    final SubLObject duration_of_time_interval = cycl_utilities.formula_arg3( dist, UNPROVIDED );
    final SubLObject time_elapsed = temporal_projection.find_time_elapsed_between_time_points( time, mt_time );
    final SubLObject unit_of_duration_of_time_interval = cycl_utilities.formula_arg0( duration_of_time_interval );
    final SubLObject value_of_duration_of_time_interval = cycl_utilities.formula_arg1( duration_of_time_interval, UNPROVIDED );
    final SubLObject unit_of_time_elapsed = cycl_utilities.formula_arg0( time_elapsed );
    final SubLObject value_of_time_elapsed = cycl_utilities.formula_arg1( time_elapsed, UNPROVIDED );
    final SubLObject unit_conversion = quantities.convert_to_units( unit_of_duration_of_time_interval, unit_of_time_elapsed, ONE_INTEGER, UNPROVIDED );
    if( !prob.numE( ONE_INTEGER ) && NIL != unit_conversion && NIL != value_of_time_elapsed && NIL != prob && NIL != value_of_duration_of_time_interval )
    {
      final SubLObject likelihood = Numbers.expt( prob, Numbers.multiply( Numbers.divide( value_of_time_elapsed, value_of_duration_of_time_interval ), unit_conversion ) );
      if( NIL != likelihood )
      {
        if( NIL != justifyP )
        {
          justifications = ConsesLow.append( justifications, plausibility_utilities.hl_justify_asent_fast( ConsesLow.list( $const21$timeElapsed, time, mt_time, time_elapsed ), $const5$BaseKB ) );
          return Values.values( ConsesLow.list( $const22$NumericLikelihoodFn, likelihood ), justifications );
        }
        return Values.values( ConsesLow.list( $const22$NumericLikelihoodFn, likelihood ) );
      }
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/temporal-projection-cols.lisp", position = 18288L)
  public static SubLObject find_likelihood_from_default_conditional_probability_for_sentence_forwards(final SubLObject sentence, final SubLObject dist, final SubLObject time, final SubLObject mt_time,
      SubLObject justifications, final SubLObject justifyP)
  {
    final SubLObject prob = cycl_utilities.formula_arg4( dist, UNPROVIDED );
    final SubLObject duration_of_time_interval = cycl_utilities.formula_arg3( dist, UNPROVIDED );
    final SubLObject time_elapsed = temporal_projection.find_time_elapsed_between_time_points( time, mt_time );
    final SubLObject unit_of_duration_of_time_interval = cycl_utilities.formula_arg0( duration_of_time_interval );
    final SubLObject value_of_duration_of_time_interval = cycl_utilities.formula_arg1( duration_of_time_interval, UNPROVIDED );
    final SubLObject unit_of_time_elapsed = cycl_utilities.formula_arg0( time_elapsed );
    final SubLObject value_of_time_elapsed = cycl_utilities.formula_arg1( time_elapsed, UNPROVIDED );
    final SubLObject unit_conversion = quantities.convert_to_units( unit_of_duration_of_time_interval, unit_of_time_elapsed, ONE_INTEGER, UNPROVIDED );
    if( !prob.numE( ONE_INTEGER ) && NIL != unit_conversion && NIL != value_of_time_elapsed && NIL != prob && NIL != value_of_duration_of_time_interval )
    {
      final SubLObject likelihood = Numbers.expt( prob, Numbers.multiply( Numbers.divide( value_of_time_elapsed, value_of_duration_of_time_interval ), unit_conversion ) );
      if( NIL != likelihood )
      {
        if( NIL != justifyP )
        {
          justifications = ConsesLow.append( justifications, plausibility_utilities.hl_justify_asent_fast( ConsesLow.list( $const21$timeElapsed, time, mt_time, time_elapsed ), $const5$BaseKB ) );
          return Values.values( ConsesLow.list( $const22$NumericLikelihoodFn, likelihood ), justifications );
        }
        return Values.values( ConsesLow.list( $const22$NumericLikelihoodFn, likelihood ) );
      }
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/temporal-projection-cols.lisp", position = 19529L)
  public static SubLObject handle_temporal_interpolation_function_for_predicate(final SubLObject fact, final SubLObject time)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject cdolist_list_var;
    final SubLObject all_assertions = cdolist_list_var = kb_mapping_utilities.pred_value_gafs_in_any_mt( cycl_utilities.formula_arg0( fact ), $const23$temporalInterpolationFunctionForP, ONE_INTEGER, UNPROVIDED );
    SubLObject assertion = NIL;
    assertion = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      final SubLObject all_times = get_list_of_times_for_assertion( fact );
      final SubLObject earlier_time = find_closest_time_before( time, all_times );
      final SubLObject later_time = find_closest_time_after( time, all_times );
      SubLObject justifications = NIL;
      if( NIL != earlier_time && NIL != later_time )
      {
        final SubLObject gaf = assertions_high.gaf_formula( assertion );
        final SubLObject dist = cycl_utilities.formula_arg2( gaf, UNPROVIDED );
        final SubLObject time_elapsed = find_time_elapsed( earlier_time, later_time );
        justifications = ConsesLow.append( justifications, ConsesLow.list( assertion ) );
        justifications = ConsesLow.append( justifications, plausibility_utilities.hl_justify_asent_fast( ConsesLow.list( $const21$timeElapsed, earlier_time, later_time, time_elapsed ), $mt_for_temporal_projection$
            .getDynamicValue( thread ) ) );
        final SubLObject supporting_assertion = get_assertion_for_given_fact_and_time( fact, earlier_time );
        final SubLObject supporting_assertion_2 = get_assertion_for_given_fact_and_time( fact, later_time );
        if( NIL != supporting_assertion )
        {
          justifications = ConsesLow.append( justifications, ConsesLow.list( supporting_assertion ) );
        }
        if( NIL != supporting_assertion_2 )
        {
          justifications = ConsesLow.append( justifications, ConsesLow.list( supporting_assertion_2 ) );
        }
        return Values.values( dist, time_elapsed, justifications );
      }
      cdolist_list_var = cdolist_list_var.rest();
      assertion = cdolist_list_var.first();
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/temporal-projection-cols.lisp", position = 21175L)
  public static SubLObject handle_duration_weighted_decay_distribution(final SubLObject fact, final SubLObject time)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject all_assertions = kb_mapping_utilities.pred_value_gafs_in_any_mt( cycl_utilities.formula_arg0( fact ), $const24$durationWeightedDistributionForPr, ONE_INTEGER, UNPROVIDED );
    final SubLObject time_point_1 = get_farthest_time_for_assertion( fact, time );
    final SubLObject duration = get_duration_of_time_interval( time_point_1 );
    final SubLObject arg_1_entity = cycl_utilities.formula_arg1( fact, UNPROVIDED );
    final SubLObject arg_2_entity = cycl_utilities.formula_arg2( fact, UNPROVIDED );
    SubLObject justifications = NIL;
    SubLObject cdolist_list_var = all_assertions;
    SubLObject assertion = NIL;
    assertion = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      final SubLObject gaf = assertions_high.gaf_formula( assertion );
      if( cycl_utilities.formula_arg3( gaf, UNPROVIDED ).numE( TWO_INTEGER ) && NIL != isa.isa_in_any_mtP( arg_2_entity, cycl_utilities.formula_arg2( gaf, UNPROVIDED ) ) )
      {
        final SubLObject time_elapsed = find_time_elapsed( time_point_1, time );
        final SubLObject unit = cycl_utilities.formula_arg5( gaf, UNPROVIDED );
        final SubLObject dist = cycl_utilities.formula_arg4( gaf, UNPROVIDED );
        final SubLObject scaled_dist = scale_distribution( dist, unit, duration );
        justifications = ConsesLow.append( justifications, ConsesLow.list( assertion ) );
        if( NIL != time_point_1 )
        {
          justifications = ConsesLow.append( justifications, plausibility_utilities.hl_justify_asent_fast( ConsesLow.list( $const21$timeElapsed, time_point_1, time, time_elapsed ), $mt_for_temporal_projection$
              .getDynamicValue( thread ) ) );
        }
        if( NIL != duration )
        {
          justifications = ConsesLow.append( justifications, plausibility_utilities.hl_justify_asent_fast( ConsesLow.list( $const25$duration, time_point_1, duration ), $mt_for_temporal_projection$.getDynamicValue(
              thread ) ) );
        }
        final SubLObject supporting_assertion = get_assertion_for_binary_predicates( fact );
        if( NIL != supporting_assertion )
        {
          justifications = ConsesLow.append( justifications, ConsesLow.list( supporting_assertion ) );
        }
        return Values.values( scaled_dist, time_elapsed, justifications );
      }
      if( cycl_utilities.formula_arg3( gaf, UNPROVIDED ).numE( ONE_INTEGER ) && NIL != isa.isa_in_any_mtP( arg_1_entity, cycl_utilities.formula_arg2( gaf, UNPROVIDED ) ) )
      {
        final SubLObject time_elapsed = find_time_elapsed( time_point_1, time );
        final SubLObject dist2 = cycl_utilities.formula_arg4( gaf, UNPROVIDED );
        final SubLObject unit2 = cycl_utilities.formula_arg5( gaf, UNPROVIDED );
        final SubLObject scaled_dist = scale_distribution( dist2, unit2, duration );
        justifications = ConsesLow.append( justifications, ConsesLow.list( assertion ) );
        if( NIL != time_point_1 )
        {
          justifications = ConsesLow.append( justifications, plausibility_utilities.hl_justify_asent_fast( ConsesLow.list( $const21$timeElapsed, time_point_1, time, time_elapsed ), $mt_for_temporal_projection$
              .getDynamicValue( thread ) ) );
        }
        if( NIL != duration )
        {
          justifications = ConsesLow.append( justifications, plausibility_utilities.hl_justify_asent_fast( ConsesLow.list( $const25$duration, time_point_1, duration ), $mt_for_temporal_projection$.getDynamicValue(
              thread ) ) );
        }
        final SubLObject supporting_assertion = get_assertion_for_binary_predicates( fact );
        if( NIL != supporting_assertion )
        {
          justifications = ConsesLow.append( justifications, ConsesLow.list( supporting_assertion ) );
        }
        return Values.values( scaled_dist, time_elapsed, justifications );
      }
      cdolist_list_var = cdolist_list_var.rest();
      assertion = cdolist_list_var.first();
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/temporal-projection-cols.lisp", position = 24053L)
  public static SubLObject handle_decay_distribution_for_assertion_in_time_interval(final SubLObject fact, final SubLObject time)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject all_bindings = mt_context.ask_mt_query( ConsesLow.listS( $const26$decayDistributionForAssertionInTi, fact, $list27 ), UNPROVIDED, UNPROVIDED, UNPROVIDED );
    SubLObject justifications = NIL;
    SubLObject cdolist_list_var = all_bindings;
    SubLObject binding = NIL;
    binding = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      final SubLObject interval = bindings.variable_lookup( $sym28$_X, binding );
      final SubLObject dist = bindings.variable_lookup( $sym29$_Y, binding );
      thread.resetMultipleValues();
      final SubLObject result = time_falls_in_temporal_interval( interval, time );
      final SubLObject justification_1 = thread.secondMultipleValue();
      thread.resetMultipleValues();
      if( NIL != result )
      {
        justifications = ConsesLow.append( justifications, justification_1 );
        final SubLObject supporting_assertion = get_assertion_for_ternary_predicates( $const26$decayDistributionForAssertionInTi, fact, interval, dist );
        if( NIL != supporting_assertion )
        {
          justifications = ConsesLow.append( justifications, ConsesLow.list( supporting_assertion ) );
        }
        return Values.values( dist, NIL, justifications );
      }
      cdolist_list_var = cdolist_list_var.rest();
      binding = cdolist_list_var.first();
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/temporal-projection-cols.lisp", position = 24993L)
  public static SubLObject use_causal_analysis_to_find_likelihood(final SubLObject fact, final SubLObject time)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    thread.resetMultipleValues();
    SubLObject result = use_noisy_or_model_to_calculate_prob( fact, time );
    SubLObject justifications = thread.secondMultipleValue();
    thread.resetMultipleValues();
    if( NIL != result )
    {
      return Values.values( result, justifications );
    }
    thread.resetMultipleValues();
    result = use_noisy_and_model_to_calculate_prob( fact, time );
    justifications = thread.secondMultipleValue();
    thread.resetMultipleValues();
    if( NIL != result )
    {
      return Values.values( result, justifications );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/temporal-projection-cols.lisp", position = 25404L)
  public static SubLObject use_noisy_and_model_to_calculate_prob(final SubLObject fact, final SubLObject time)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject all_bindings = mt_context.ask_mt_query( ConsesLow.listS( $const30$distributionForSentenceGivenNeces, fact, $list31 ), UNPROVIDED, UNPROVIDED, UNPROVIDED );
    SubLObject observed_prob = NIL;
    SubLObject observed_causes = NIL;
    SubLObject justifications = NIL;
    SubLObject cdolist_list_var = all_bindings;
    SubLObject binding = NIL;
    binding = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      final SubLObject cause = bindings.variable_lookup( $sym28$_X, binding );
      final SubLObject interval = bindings.variable_lookup( $sym29$_Y, binding );
      final SubLObject dist = bindings.variable_lookup( $sym32$_Z, binding );
      final SubLObject closest_time_for_cause = get_closest_time_for_assertion_before_given_time( cause, time );
      if( NIL != closest_time_for_cause )
      {
        final SubLObject time_elapsed_since_cause = find_time_elapsed( closest_time_for_cause, time );
        if( NIL != time_falls_in_interval( closest_time_for_cause, time, interval, UNPROVIDED ) )
        {
          observed_causes = ConsesLow.cons( cause, observed_causes );
          final SubLObject prob_of_effect_given_cause = calculate_persistence_likelihood( time_elapsed_since_cause, dist );
          if( NIL != prob_of_effect_given_cause )
          {
            final SubLObject supporting_assertion = get_assertion_for_predicate_of_arity_four( $const30$distributionForSentenceGivenNeces, fact, cause, interval, dist );
            if( NIL != supporting_assertion )
            {
              justifications = ConsesLow.append( justifications, ConsesLow.list( supporting_assertion ) );
            }
            if( NIL != observed_prob )
            {
              observed_prob = Numbers.multiply( observed_prob, prob_of_effect_given_cause );
            }
            else
            {
              observed_prob = prob_of_effect_given_cause;
            }
          }
        }
      }
      cdolist_list_var = cdolist_list_var.rest();
      binding = cdolist_list_var.first();
    }
    thread.resetMultipleValues();
    final SubLObject prob_due_to_unobserved_causes = find_probabilities_due_to_unobserved_causes( fact, observed_causes );
    final SubLObject justification_1 = thread.secondMultipleValue();
    thread.resetMultipleValues();
    if( NIL == prob_due_to_unobserved_causes )
    {
      return NIL;
    }
    if( NIL != observed_prob )
    {
      return Values.values( Numbers.multiply( observed_prob, prob_due_to_unobserved_causes ), ConsesLow.append( justifications, justification_1 ) );
    }
    return Values.values( prob_due_to_unobserved_causes, justification_1 );
  }

  @SubLTranslatedFile.SubL(source = "cycl/temporal-projection-cols.lisp", position = 27589L)
  public static SubLObject find_probabilities_due_to_unobserved_causes(final SubLObject fact, final SubLObject observed_causes)
  {
    SubLObject prob_due_to_unobserved_causes = NIL;
    SubLObject justifications = NIL;
    SubLObject cdolist_list_var;
    final SubLObject all_bindings = cdolist_list_var = mt_context.ask_mt_query( ConsesLow.listS( $const33$conditionalProbabilityOfStateGive, cycl_utilities.formula_arg0( fact ), cycl_utilities.formula_arg1( fact,
        UNPROVIDED ), $list31 ), UNPROVIDED, UNPROVIDED, UNPROVIDED );
    SubLObject binding = NIL;
    binding = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      final SubLObject pred_in_condition = bindings.variable_lookup( $sym28$_X, binding );
      final SubLObject col_in_first_arg_position = bindings.variable_lookup( $sym29$_Y, binding );
      final SubLObject prob = bindings.variable_lookup( $sym32$_Z, binding );
      if( NIL == check_presence_of_condition_in_observed_causes_ins_pos_1( pred_in_condition, col_in_first_arg_position, observed_causes ) )
      {
        if( NIL != prob_due_to_unobserved_causes )
        {
          prob_due_to_unobserved_causes = Numbers.multiply( prob_due_to_unobserved_causes, cycl_utilities.formula_arg1( prob, UNPROVIDED ) );
        }
        else
        {
          prob_due_to_unobserved_causes = cycl_utilities.formula_arg1( prob, UNPROVIDED );
        }
        final SubLObject supporting_assertion = get_assertion_for_predicate_of_arity_five( $const33$conditionalProbabilityOfStateGive, cycl_utilities.formula_arg0( fact ), cycl_utilities.formula_arg1( fact, UNPROVIDED ),
            pred_in_condition, col_in_first_arg_position, prob );
        justifications = ConsesLow.append( justifications, ConsesLow.list( supporting_assertion ) );
      }
      cdolist_list_var = cdolist_list_var.rest();
      binding = cdolist_list_var.first();
    }
    if( NIL != prob_due_to_unobserved_causes )
    {
      return Values.values( prob_due_to_unobserved_causes, justifications );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/temporal-projection-cols.lisp", position = 29018L)
  public static SubLObject check_presence_of_condition_in_observed_causes_ins_pos_1(final SubLObject pred, final SubLObject col, final SubLObject observed_causes)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject cdolist_list_var = observed_causes;
    SubLObject assertion = NIL;
    assertion = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      if( cycl_utilities.formula_arg0( assertion ).eql( pred ) && NIL != isa.isaP( cycl_utilities.formula_arg1( assertion, UNPROVIDED ), col, $mt_for_temporal_projection$.getDynamicValue( thread ), UNPROVIDED ) )
      {
        return T;
      }
      cdolist_list_var = cdolist_list_var.rest();
      assertion = cdolist_list_var.first();
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/temporal-projection-cols.lisp", position = 29323L)
  public static SubLObject use_noisy_or_model_to_calculate_prob(final SubLObject fact, final SubLObject time)
  {
    final SubLObject all_bindings = mt_context.ask_mt_query( ConsesLow.listS( $const34$distributionForSentenceGivenSuffi, fact, $list31 ), UNPROVIDED, UNPROVIDED, UNPROVIDED );
    SubLObject list_of_causes_and_probabilities = NIL;
    SubLObject justifications = NIL;
    SubLObject cdolist_list_var = all_bindings;
    SubLObject binding = NIL;
    binding = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      final SubLObject cause = bindings.variable_lookup( $sym28$_X, binding );
      final SubLObject interval = bindings.variable_lookup( $sym29$_Y, binding );
      final SubLObject dist = bindings.variable_lookup( $sym32$_Z, binding );
      final SubLObject closest_time_for_cause = get_closest_time_for_assertion_before_given_time( cause, time );
      if( NIL != closest_time_for_cause )
      {
        final SubLObject time_elapsed_since_cause = find_time_elapsed( closest_time_for_cause, time );
        if( NIL != time_falls_in_interval( closest_time_for_cause, time, interval, UNPROVIDED ) )
        {
          final SubLObject prob_of_effect_given_cause = calculate_persistence_likelihood( time_elapsed_since_cause, dist );
          if( NIL != prob_of_effect_given_cause )
          {
            final SubLObject supporting_assertion = get_assertion_for_predicate_of_arity_four( $const34$distributionForSentenceGivenSuffi, fact, cause, interval, dist );
            if( NIL != supporting_assertion )
            {
              justifications = ConsesLow.append( justifications, ConsesLow.list( supporting_assertion ) );
            }
            list_of_causes_and_probabilities = ConsesLow.cons( ConsesLow.list( cause, ONE_INTEGER, prob_of_effect_given_cause ), list_of_causes_and_probabilities );
          }
        }
      }
      cdolist_list_var = cdolist_list_var.rest();
      binding = cdolist_list_var.first();
    }
    return Values.values( compute_probability_for_list_of_causes( list_of_causes_and_probabilities ), justifications );
  }

  @SubLTranslatedFile.SubL(source = "cycl/temporal-projection-cols.lisp", position = 31158L)
  public static SubLObject use_causal_analysis_to_find_likelihood_2(final SubLObject fact, final SubLObject time)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject pred = cycl_utilities.formula_arg0( fact );
    SubLObject lst_of_causes = NIL;
    SubLObject justifications = NIL;
    SubLObject cdolist_list_var;
    final SubLObject all_assertions = cdolist_list_var = kb_mapping_utilities.pred_value_gafs_in_any_mt( pred, $const35$conditionalProbabilityPatternsFor, ONE_INTEGER, UNPROVIDED );
    SubLObject assertion = NIL;
    assertion = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      final SubLObject gaf = assertions_high.gaf_formula( assertion );
      final SubLObject prob_for_node = cycl_utilities.formula_arg4( gaf, UNPROVIDED );
      final SubLObject bindings_list = get_list_of_bindings_for_cons( cycl_utilities.formula_arg2( gaf, UNPROVIDED ), fact );
      if( NIL != check_whether_fact_satisfies_constraints( cycl_utilities.formula_arg2( gaf, UNPROVIDED ), bindings_list ) )
      {
        thread.resetMultipleValues();
        final SubLObject assertion_matching_conseq = find_assertion_matching_conditions_in_conseq( cycl_utilities.formula_arg3( gaf, UNPROVIDED ), bindings_list );
        final SubLObject justification_1 = thread.secondMultipleValue();
        thread.resetMultipleValues();
        justifications = ConsesLow.append( justifications, justification_1 );
        if( NIL != assertion_matching_conseq )
        {
          SubLObject lst_of_assertions_with_non_zero_prob = NIL;
          SubLObject cdolist_list_var_$7 = assertion_matching_conseq;
          SubLObject assertion_1 = NIL;
          assertion_1 = cdolist_list_var_$7.first();
          while ( NIL != cdolist_list_var_$7)
          {
            thread.resetMultipleValues();
            final SubLObject persis_prob = get_persistence_likelihood_for_fact_at_time( assertion_1, time, T, $mt_for_temporal_projection$.getDynamicValue( thread ), T, UNPROVIDED );
            final SubLObject justification_2 = thread.secondMultipleValue();
            thread.resetMultipleValues();
            if( NIL != persis_prob && cycl_utilities.formula_arg1( persis_prob, UNPROVIDED ).numG( $float36$0_001 ) )
            {
              justifications = ConsesLow.append( justifications, ConsesLow.list( assertion ) );
              justifications = ConsesLow.append( justifications, justification_2 );
              lst_of_assertions_with_non_zero_prob = ConsesLow.cons( ConsesLow.list( assertion_1, cycl_utilities.formula_arg1( persis_prob, UNPROVIDED ), prob_for_node ), lst_of_assertions_with_non_zero_prob );
            }
            cdolist_list_var_$7 = cdolist_list_var_$7.rest();
            assertion_1 = cdolist_list_var_$7.first();
          }
          if( NIL != lst_of_assertions_with_non_zero_prob )
          {
            final SubLObject entry_with_closest_event = get_fact_closest_to_time_point( lst_of_assertions_with_non_zero_prob, time );
            lst_of_causes = ConsesLow.cons( ConsesLow.list( cycl_utilities.formula_arg0( entry_with_closest_event ), cycl_utilities.formula_arg1( entry_with_closest_event, UNPROVIDED ), prob_for_node ), lst_of_causes );
          }
        }
        if( NIL == assertion_matching_conseq )
        {
          thread.resetMultipleValues();
          final SubLObject prior = get_prior_probability_for_pattern( cycl_utilities.formula_arg3( gaf, UNPROVIDED ), bindings_list );
          final SubLObject justification_3 = thread.secondMultipleValue();
          thread.resetMultipleValues();
          justifications = ConsesLow.append( justifications, ConsesLow.list( justification_3 ) );
          lst_of_causes = ConsesLow.cons( ConsesLow.list( cycl_utilities.formula_arg3( gaf, UNPROVIDED ), prior, prob_for_node ), lst_of_causes );
        }
      }
      cdolist_list_var = cdolist_list_var.rest();
      assertion = cdolist_list_var.first();
    }
    return Values.values( compute_probability_for_list_of_causes( lst_of_causes ), justifications );
  }

  @SubLTranslatedFile.SubL(source = "cycl/temporal-projection-cols.lisp", position = 33814L)
  public static SubLObject compute_probability_for_list_of_causes(final SubLObject lst)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL == lst )
    {
      return NIL;
    }
    final SubLObject all_subsets = generate_powerset( Mapping.mapcar( Symbols.symbol_function( $sym37$FORMULA_ARG0 ), lst ) );
    SubLObject net_prob = NIL;
    SubLObject cdolist_list_var = all_subsets;
    SubLObject subset = NIL;
    subset = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      thread.resetMultipleValues();
      final SubLObject prob_of_subset = compute_probability_for_subset( subset, lst );
      final SubLObject prob_of_effect = thread.secondMultipleValue();
      thread.resetMultipleValues();
      if( NIL == net_prob )
      {
        net_prob = Numbers.multiply( prob_of_subset, prob_of_effect );
      }
      else
      {
        net_prob = Numbers.add( net_prob, Numbers.multiply( prob_of_subset, prob_of_effect ) );
      }
      cdolist_list_var = cdolist_list_var.rest();
      subset = cdolist_list_var.first();
    }
    return net_prob;
  }

  @SubLTranslatedFile.SubL(source = "cycl/temporal-projection-cols.lisp", position = 34599L)
  public static SubLObject compute_probability_for_subset(final SubLObject subset, final SubLObject lst)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject prob_of_subset = NIL;
    SubLObject complement_of_prob_of_effect_given_subset = NIL;
    SubLObject cdolist_list_var = subset;
    SubLObject element = NIL;
    element = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      thread.resetMultipleValues();
      final SubLObject prob_of_truth = find_prior_and_probability_from_list( element, lst );
      final SubLObject prob_of_effect_given_cause = thread.secondMultipleValue();
      thread.resetMultipleValues();
      if( NIL == prob_of_subset )
      {
        prob_of_subset = prob_of_truth;
      }
      else
      {
        prob_of_subset = Numbers.multiply( prob_of_subset, prob_of_truth );
      }
      if( NIL == complement_of_prob_of_effect_given_subset )
      {
        complement_of_prob_of_effect_given_subset = Numbers.subtract( ONE_INTEGER, prob_of_effect_given_cause );
      }
      else
      {
        complement_of_prob_of_effect_given_subset = Numbers.multiply( complement_of_prob_of_effect_given_subset, Numbers.subtract( ONE_INTEGER, prob_of_effect_given_cause ) );
      }
      cdolist_list_var = cdolist_list_var.rest();
      element = cdolist_list_var.first();
    }
    cdolist_list_var = lst;
    SubLObject e = NIL;
    e = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      if( NIL == conses_high.member( cycl_utilities.formula_arg0( e ), subset, Symbols.symbol_function( EQUAL ), UNPROVIDED ) )
      {
        final SubLObject prob_of_truth = find_prior_and_probability_from_list( cycl_utilities.formula_arg0( e ), lst );
        if( NIL == prob_of_subset )
        {
          prob_of_subset = Numbers.subtract( ONE_INTEGER, prob_of_truth );
        }
        else
        {
          prob_of_subset = Numbers.multiply( prob_of_subset, Numbers.subtract( ONE_INTEGER, prob_of_truth ) );
        }
      }
      cdolist_list_var = cdolist_list_var.rest();
      e = cdolist_list_var.first();
    }
    if( NIL == complement_of_prob_of_effect_given_subset )
    {
      complement_of_prob_of_effect_given_subset = ONE_INTEGER;
    }
    return Values.values( prob_of_subset, Numbers.subtract( ONE_INTEGER, complement_of_prob_of_effect_given_subset ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/temporal-projection-cols.lisp", position = 36575L)
  public static SubLObject find_prior_and_probability_from_list(final SubLObject element, final SubLObject lst)
  {
    SubLObject cdolist_list_var = lst;
    SubLObject e = NIL;
    e = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      if( cycl_utilities.formula_arg0( e ).equal( element ) )
      {
        return Values.values( conses_high.second( e ), conses_high.third( e ) );
      }
      cdolist_list_var = cdolist_list_var.rest();
      e = cdolist_list_var.first();
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/temporal-projection-cols.lisp", position = 36755L)
  public static SubLObject check_delay_between_start_of_event_types_in_sit_type(final SubLObject fact)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject event = cycl_utilities.formula_arg1( fact, UNPROVIDED );
    SubLObject done_list = NIL;
    final SubLObject date = cycl_utilities.formula_arg2( fact, UNPROVIDED );
    SubLObject cdolist_list_var = isa.isa( event, UNPROVIDED, UNPROVIDED );
    SubLObject col = NIL;
    col = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      SubLObject cdolist_list_var_$8;
      final SubLObject all_assertions = cdolist_list_var_$8 = kb_mapping_utilities.pred_value_gafs_in_any_mt( col, $const38$delayBetweenStartOfEventTypesInSi, THREE_INTEGER, UNPROVIDED );
      SubLObject assertion = NIL;
      assertion = cdolist_list_var_$8.first();
      while ( NIL != cdolist_list_var_$8)
      {
        final SubLObject gaf = assertions_high.gaf_formula( assertion );
        final SubLObject duration = cycl_utilities.formula_arg6( gaf, UNPROVIDED );
        final SubLObject super_event_type = cycl_utilities.formula_arg1( gaf, UNPROVIDED );
        final SubLObject sub_event_type = cycl_utilities.formula_arg2( gaf, UNPROVIDED );
        if( NIL == conses_high.member( super_event_type, done_list, Symbols.symbol_function( EQUAL ), UNPROVIDED ) )
        {
          done_list = ConsesLow.cons( super_event_type, done_list );
          SubLObject cdolist_list_var_$9 = mt_context.ask_mt_query( ConsesLow.list( $const39$subEvents, $sym28$_X, event ), UNPROVIDED, UNPROVIDED, UNPROVIDED );
          SubLObject binding = NIL;
          binding = cdolist_list_var_$9.first();
          while ( NIL != cdolist_list_var_$9)
          {
            final SubLObject super_event = bindings.variable_lookup( $sym28$_X, binding );
            if( NIL != isa.isa_in_any_mtP( super_event, super_event_type ) )
            {
              SubLObject cdolist_list_var_$10 = mt_context.ask_mt_query( ConsesLow.listS( $const39$subEvents, super_event, $list40 ), UNPROVIDED, UNPROVIDED, UNPROVIDED );
              SubLObject bindings_2 = NIL;
              bindings_2 = cdolist_list_var_$10.first();
              while ( NIL != cdolist_list_var_$10)
              {
                final SubLObject sub_event_2 = bindings.variable_lookup( $sym28$_X, bindings_2 );
                if( NIL != isa.isa_in_any_mtP( sub_event_2, sub_event_type ) )
                {
                  thread.resetMultipleValues();
                  final SubLObject starting_date = get_starting_date_of_concept( sub_event_2 );
                  final SubLObject justification_1 = thread.secondMultipleValue();
                  thread.resetMultipleValues();
                  if( NIL != starting_date )
                  {
                    final SubLObject time_elapsed = find_time_elapsed( starting_date, date );
                    final SubLObject time_elapsed_since_start = find_time_elapsed( starting_date, starting_date );
                    thread.resetMultipleValues();
                    final SubLObject result = calculate_probability_of_delay_between_events( time_elapsed, all_assertions, duration, time_elapsed_since_start );
                    SubLObject justifications = thread.secondMultipleValue();
                    thread.resetMultipleValues();
                    justifications = ConsesLow.append( justifications, justification_1 );
                    if( NIL != result )
                    {
                      return Values.values( result, justifications );
                    }
                  }
                }
                cdolist_list_var_$10 = cdolist_list_var_$10.rest();
                bindings_2 = cdolist_list_var_$10.first();
              }
            }
            cdolist_list_var_$9 = cdolist_list_var_$9.rest();
            binding = cdolist_list_var_$9.first();
          }
        }
        cdolist_list_var_$8 = cdolist_list_var_$8.rest();
        assertion = cdolist_list_var_$8.first();
      }
      cdolist_list_var = cdolist_list_var.rest();
      col = cdolist_list_var.first();
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/temporal-projection-cols.lisp", position = 38839L)
  public static SubLObject handle_default_decay_function_for_predicate(final SubLObject fact, final SubLObject time)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject all_assertions = kb_mapping_utilities.pred_value_gafs_in_any_mt( cycl_utilities.formula_arg0( fact ), $const41$defaultDecayFunctionForPredicate, ONE_INTEGER, UNPROVIDED );
    final SubLObject times_for_fact = get_list_of_times_for_assertion( fact );
    SubLObject justifications = NIL;
    if( NIL != all_assertions )
    {
      SubLObject cdolist_list_var = all_assertions;
      SubLObject assertion = NIL;
      assertion = cdolist_list_var.first();
      while ( NIL != cdolist_list_var)
      {
        final SubLObject gaf = assertions_high.gaf_formula( assertion );
        final SubLObject dist = cycl_utilities.formula_arg2( gaf, UNPROVIDED );
        final SubLObject cdolist_list_var_$11 = times_for_fact;
        SubLObject time_of_fact = NIL;
        time_of_fact = cdolist_list_var_$11.first();
        if( NIL != cdolist_list_var_$11 )
        {
          final SubLObject time_elapsed = find_time_elapsed( time, time_of_fact );
          justifications = ConsesLow.append( justifications, ConsesLow.list( assertion ) );
          if( NIL != time_elapsed )
          {
            justifications = ConsesLow.append( justifications, plausibility_utilities.hl_justify_asent_fast( ConsesLow.list( $const21$timeElapsed, time, time_of_fact, time_elapsed ), $mt_for_temporal_projection$
                .getDynamicValue( thread ) ) );
          }
          final SubLObject supporting_assertion = get_assertion_for_given_fact_and_time( fact, time_of_fact );
          if( NIL != supporting_assertion )
          {
            justifications = ConsesLow.append( justifications, ConsesLow.list( supporting_assertion ) );
          }
          return Values.values( dist, time_elapsed, justifications );
        }
        cdolist_list_var = cdolist_list_var.rest();
        assertion = cdolist_list_var.first();
      }
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/temporal-projection-cols.lisp", position = 40129L)
  public static SubLObject handle_default_decay_function_for_predicate_backwards(final SubLObject fact, final SubLObject time)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject all_assertions = kb_mapping_utilities.pred_value_gafs_in_any_mt( cycl_utilities.formula_arg0( fact ), $const42$defaultDecayFunctionForPredicate_, ONE_INTEGER, UNPROVIDED );
    final SubLObject times_for_fact = get_list_of_times_for_assertion( fact );
    if( NIL != all_assertions )
    {
      SubLObject cdolist_list_var = all_assertions;
      SubLObject assertion = NIL;
      assertion = cdolist_list_var.first();
      while ( NIL != cdolist_list_var)
      {
        final SubLObject gaf = assertions_high.gaf_formula( assertion );
        final SubLObject dist = cycl_utilities.formula_arg2( gaf, UNPROVIDED );
        SubLObject cdolist_list_var_$12 = times_for_fact;
        SubLObject time_of_fact = NIL;
        time_of_fact = cdolist_list_var_$12.first();
        while ( NIL != cdolist_list_var_$12)
        {
          thread.resetMultipleValues();
          final SubLObject result = all_points_are_after_thanP( time_of_fact, time );
          SubLObject justifications = thread.secondMultipleValue();
          thread.resetMultipleValues();
          if( NIL != result )
          {
            final SubLObject time_elapsed = find_time_elapsed( time, time_of_fact );
            justifications = ConsesLow.append( justifications, ConsesLow.list( assertion ) );
            if( NIL != time_elapsed )
            {
              justifications = ConsesLow.append( justifications, plausibility_utilities.hl_justify_asent_fast( ConsesLow.list( $const21$timeElapsed, time, time_of_fact, time_elapsed ), $mt_for_temporal_projection$
                  .getDynamicValue( thread ) ) );
            }
            final SubLObject supporting_assertion = get_assertion_for_given_fact_and_time( fact, time_of_fact );
            if( NIL != supporting_assertion )
            {
              justifications = ConsesLow.append( justifications, ConsesLow.list( supporting_assertion ) );
            }
            return Values.values( dist, time_elapsed, justifications );
          }
          cdolist_list_var_$12 = cdolist_list_var_$12.rest();
          time_of_fact = cdolist_list_var_$12.first();
        }
        cdolist_list_var = cdolist_list_var.rest();
        assertion = cdolist_list_var.first();
      }
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/temporal-projection-cols.lisp", position = 41533L)
  public static SubLObject handle_decay_distribution_for_specs(final SubLObject fact, final SubLObject time)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject all_assertions = kb_mapping_utilities.pred_value_gafs_in_any_mt( cycl_utilities.formula_arg0( fact ), $const43$decayDistributionForSpecs, ONE_INTEGER, UNPROVIDED );
    final SubLObject time_point_1 = get_farthest_time_for_assertion( fact, time );
    final SubLObject arg_1_entity = cycl_utilities.formula_arg1( fact, UNPROVIDED );
    final SubLObject arg_2_entity = cycl_utilities.formula_arg2( fact, UNPROVIDED );
    SubLObject justifications = NIL;
    SubLObject cdolist_list_var = all_assertions;
    SubLObject assertion = NIL;
    assertion = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      final SubLObject gaf = assertions_high.gaf_formula( assertion );
      if( cycl_utilities.formula_arg3( gaf, UNPROVIDED ).numE( TWO_INTEGER ) && NIL != isa.isa_in_any_mtP( arg_2_entity, cycl_utilities.formula_arg2( gaf, UNPROVIDED ) ) )
      {
        final SubLObject time_elapsed = find_time_elapsed( time_point_1, time );
        justifications = ConsesLow.append( justifications, ConsesLow.list( assertion ) );
        if( NIL != time_point_1 )
        {
          justifications = ConsesLow.append( justifications, plausibility_utilities.hl_justify_asent_fast( ConsesLow.list( $const21$timeElapsed, time_point_1, time, time_elapsed ), $mt_for_temporal_projection$
              .getDynamicValue( thread ) ) );
        }
        final SubLObject supporting_assertion = get_assertion_for_binary_predicates( fact );
        if( NIL != supporting_assertion )
        {
          justifications = ConsesLow.append( justifications, ConsesLow.list( supporting_assertion ) );
        }
        return Values.values( cycl_utilities.formula_arg4( gaf, UNPROVIDED ), time_elapsed, justifications );
      }
      if( cycl_utilities.formula_arg3( gaf, UNPROVIDED ).numE( ONE_INTEGER ) && NIL != isa.isa_in_any_mtP( arg_1_entity, cycl_utilities.formula_arg2( gaf, UNPROVIDED ) ) )
      {
        final SubLObject time_elapsed = find_time_elapsed( time_point_1, time );
        justifications = ConsesLow.append( justifications, ConsesLow.list( assertion ) );
        if( NIL != time_point_1 )
        {
          justifications = ConsesLow.append( justifications, plausibility_utilities.hl_justify_asent_fast( ConsesLow.list( $const21$timeElapsed, time_point_1, time, time_elapsed ), $mt_for_temporal_projection$
              .getDynamicValue( thread ) ) );
        }
        final SubLObject supporting_assertion = get_assertion_for_binary_predicates( fact );
        if( NIL != supporting_assertion )
        {
          justifications = ConsesLow.append( justifications, ConsesLow.list( supporting_assertion ) );
        }
        return Values.values( cycl_utilities.formula_arg4( gaf, UNPROVIDED ), time_elapsed, justifications );
      }
      cdolist_list_var = cdolist_list_var.rest();
      assertion = cdolist_list_var.first();
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/temporal-projection-cols.lisp", position = 43606L)
  public static SubLObject handle_decay_distribution_for_specs_2(final SubLObject fact, final SubLObject time, final SubLObject time_point_1)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject all_assertions = kb_mapping_utilities.pred_value_gafs_in_any_mt( cycl_utilities.formula_arg0( fact ), $const43$decayDistributionForSpecs, ONE_INTEGER, UNPROVIDED );
    final SubLObject arg_1_entity = cycl_utilities.formula_arg1( fact, UNPROVIDED );
    final SubLObject arg_2_entity = cycl_utilities.formula_arg2( fact, UNPROVIDED );
    SubLObject cdolist_list_var = all_assertions;
    SubLObject assertion = NIL;
    assertion = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      final SubLObject gaf = assertions_high.gaf_formula( assertion );
      if( cycl_utilities.formula_arg3( gaf, UNPROVIDED ).numE( TWO_INTEGER ) && NIL != isa.isa_in_any_mtP( arg_2_entity, cycl_utilities.formula_arg2( gaf, UNPROVIDED ) ) )
      {
        final SubLObject time_elapsed = find_time_elapsed( time_point_1, time );
        $temporal_projection_justifications$.setDynamicValue( ConsesLow.append( $temporal_projection_justifications$.getDynamicValue( thread ), ConsesLow.list( assertion ) ), thread );
        $temporal_projection_justifications$.setDynamicValue( ConsesLow.append( $temporal_projection_justifications$.getDynamicValue( thread ), plausibility_utilities.hl_justify_asent_fast( ConsesLow.list(
            $const21$timeElapsed, time_point_1, time, time_elapsed ), $const44$EverythingPSC ) ), thread );
        final SubLObject supporting_assertion = get_assertion_for_binary_predicates( fact );
        if( NIL != supporting_assertion )
        {
          $temporal_projection_justifications$.setDynamicValue( ConsesLow.append( $temporal_projection_justifications$.getDynamicValue( thread ), ConsesLow.list( supporting_assertion ) ), thread );
        }
        return Values.values( cycl_utilities.formula_arg4( gaf, UNPROVIDED ), time_elapsed );
      }
      if( cycl_utilities.formula_arg3( gaf, UNPROVIDED ).numE( ONE_INTEGER ) && NIL != isa.isa_in_any_mtP( arg_1_entity, cycl_utilities.formula_arg2( gaf, UNPROVIDED ) ) )
      {
        final SubLObject time_elapsed = find_time_elapsed( time_point_1, time );
        $temporal_projection_justifications$.setDynamicValue( ConsesLow.append( $temporal_projection_justifications$.getDynamicValue( thread ), ConsesLow.list( assertion ) ), thread );
        $temporal_projection_justifications$.setDynamicValue( ConsesLow.append( $temporal_projection_justifications$.getDynamicValue( thread ), plausibility_utilities.hl_justify_asent_fast( ConsesLow.list(
            $const21$timeElapsed, time_point_1, time, time_elapsed ), $const44$EverythingPSC ) ), thread );
        final SubLObject supporting_assertion = get_assertion_for_binary_predicates( fact );
        if( NIL != supporting_assertion )
        {
          $temporal_projection_justifications$.setDynamicValue( ConsesLow.append( $temporal_projection_justifications$.getDynamicValue( thread ), ConsesLow.list( supporting_assertion ) ), thread );
        }
        return Values.values( cycl_utilities.formula_arg4( gaf, UNPROVIDED ), time_elapsed );
      }
      cdolist_list_var = cdolist_list_var.rest();
      assertion = cdolist_list_var.first();
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/temporal-projection-cols.lisp", position = 45739L)
  public static SubLObject get_assertions_for_fact(final SubLObject fact)
  {
    final SubLObject a = cycl_utilities.formula_arg0( fact );
    SubLObject b = cycl_utilities.formula_arg1( fact, UNPROVIDED );
    SubLObject c = cycl_utilities.formula_arg2( fact, UNPROVIDED );
    if( NIL != b && b.isList() )
    {
      b = narts_high.find_nart( b );
    }
    if( NIL != c && c.isList() )
    {
      c = narts_high.find_nart( c );
    }
    if( Sequences.length( fact ).numE( THREE_INTEGER ) )
    {
      return kb_mapping_utilities.pred_u_v_holds_gafs_in_any_mt( a, b, c, UNPROVIDED, UNPROVIDED, UNPROVIDED );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/temporal-projection-cols.lisp", position = 46129L)
  public static SubLObject handle_temporal_interpolation_function_for_collection(final SubLObject fact, final SubLObject time)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject cdolist_list_var;
    final SubLObject all_assertions = cdolist_list_var = kb_mapping_utilities.pred_value_gafs_in_any_mt( cycl_utilities.formula_arg2( fact, UNPROVIDED ), $const45$temporalInterpolationFunctionForC, ONE_INTEGER,
        UNPROVIDED );
    SubLObject assertion = NIL;
    assertion = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      final SubLObject all_times = get_list_of_times_for_assertion( fact );
      final SubLObject earlier_time = find_closest_time_before( time, all_times );
      final SubLObject later_time = find_closest_time_after( time, all_times );
      SubLObject justifications = NIL;
      if( NIL != earlier_time && NIL != later_time )
      {
        final SubLObject gaf = assertions_high.gaf_formula( assertion );
        final SubLObject dist = cycl_utilities.formula_arg2( gaf, UNPROVIDED );
        final SubLObject time_elapsed = find_time_elapsed( earlier_time, later_time );
        justifications = ConsesLow.append( justifications, ConsesLow.list( assertion ) );
        justifications = ConsesLow.append( justifications, plausibility_utilities.hl_justify_asent_fast( ConsesLow.list( $const21$timeElapsed, earlier_time, later_time, time_elapsed ), $mt_for_temporal_projection$
            .getDynamicValue( thread ) ) );
        final SubLObject supporting_assertion = get_assertion_for_given_fact_and_time( fact, earlier_time );
        final SubLObject supporting_assertion_2 = get_assertion_for_given_fact_and_time( fact, later_time );
        if( NIL != supporting_assertion )
        {
          justifications = ConsesLow.append( justifications, ConsesLow.list( supporting_assertion ) );
        }
        if( NIL != supporting_assertion_2 )
        {
          justifications = ConsesLow.append( justifications, ConsesLow.list( supporting_assertion_2 ) );
        }
        return Values.values( dist, time_elapsed, justifications );
      }
      cdolist_list_var = cdolist_list_var.rest();
      assertion = cdolist_list_var.first();
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/temporal-projection-cols.lisp", position = 47689L)
  public static SubLObject find_probability_of_end_of_event(final SubLObject fact, final SubLObject time, final SubLObject depth_of_recursion)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject col = cycl_utilities.formula_arg2( fact, UNPROVIDED );
    SubLObject justifications = NIL;
    SubLObject sum_of_prob = NIL;
    SubLObject list_of_times = NIL;
    final SubLObject entity = cycl_utilities.formula_arg1( fact, UNPROVIDED );
    SubLObject cdolist_list_var;
    final SubLObject all_assertions = cdolist_list_var = kb_mapping_utilities.pred_value_gafs_in_any_mt( col, $const46$eventTypeEndsIntervalForState, THREE_INTEGER, UNPROVIDED );
    SubLObject assertion = NIL;
    assertion = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      final SubLObject gaf = assertions_high.gaf_formula( assertion );
      final SubLObject event_type = cycl_utilities.formula_arg1( gaf, UNPROVIDED );
      final SubLObject role = cycl_utilities.formula_arg2( gaf, UNPROVIDED );
      final SubLObject arg_cons = get_arg_cons_for_pos( role, TWO_INTEGER );
      if( NIL == isa.not_isaP( entity, arg_cons, $mt_for_temporal_projection$.getDynamicValue( thread ), UNPROVIDED ) )
      {
        SubLObject cdolist_list_var_$13;
        final SubLObject all_assertions_2 = cdolist_list_var_$13 = kb_mapping_utilities.pred_value_gafs_in_any_mt( event_type, $const47$eventTypeStartsIntervalForState, ONE_INTEGER, UNPROVIDED );
        SubLObject assertion_2 = NIL;
        assertion_2 = cdolist_list_var_$13.first();
        while ( NIL != cdolist_list_var_$13)
        {
          final SubLObject gaf_2 = assertions_high.gaf_formula( assertion_2 );
          final SubLObject state = cycl_utilities.formula_arg3( gaf_2, UNPROVIDED );
          SubLObject cdolist_list_var_$14;
          final SubLObject all_starting_times = cdolist_list_var_$14 = mt_context.ask_mt_query( ConsesLow.listS( $const48$startingPointOfRiskPeriodForAsser, ConsesLow.list( $const15$isa, entity, state ), $list40 ),
              UNPROVIDED, UNPROVIDED, UNPROVIDED );
          SubLObject binding = NIL;
          binding = cdolist_list_var_$14.first();
          while ( NIL != cdolist_list_var_$14)
          {
            list_of_times = ConsesLow.cons( bindings.variable_lookup( $sym28$_X, binding ), list_of_times );
            cdolist_list_var_$14 = cdolist_list_var_$14.rest();
            binding = cdolist_list_var_$14.first();
          }
          final SubLObject closest_time_before_time = find_closest_time_before( time, list_of_times );
          if( NIL != closest_time_before_time )
          {
            thread.resetMultipleValues();
            final SubLObject prob = get_persistence_likelihood_for_fact_at_time( ConsesLow.list( $const15$isa, entity, state ), time, T, $mt_for_temporal_projection$.getDynamicValue( thread ), T, depth_of_recursion );
            final SubLObject justifications_1 = thread.secondMultipleValue();
            thread.resetMultipleValues();
            if( NIL != prob )
            {
              if( NIL == sum_of_prob )
              {
                sum_of_prob = ZERO_INTEGER;
              }
              justifications = ConsesLow.append( justifications, justifications_1 );
              sum_of_prob = Numbers.add( sum_of_prob, cycl_utilities.formula_arg1( prob, UNPROVIDED ) );
            }
          }
          cdolist_list_var_$13 = cdolist_list_var_$13.rest();
          assertion_2 = cdolist_list_var_$13.first();
        }
      }
      if( NIL != sum_of_prob )
      {
        return Values.values( Numbers.subtract( ONE_INTEGER, sum_of_prob ), justifications );
      }
      cdolist_list_var = cdolist_list_var.rest();
      assertion = cdolist_list_var.first();
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/temporal-projection-cols.lisp", position = 49589L)
  public static SubLObject find_probability_of_event_occurrence(final SubLObject fact, final SubLObject time)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject col = cycl_utilities.formula_arg2( fact, UNPROVIDED );
    SubLObject justifications = NIL;
    final SubLObject entity = cycl_utilities.formula_arg1( fact, UNPROVIDED );
    SubLObject cdolist_list_var;
    final SubLObject all_assertions = cdolist_list_var = kb_mapping_utilities.pred_value_gafs_in_any_mt( col, $const47$eventTypeStartsIntervalForState, THREE_INTEGER, UNPROVIDED );
    SubLObject assertion = NIL;
    assertion = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      final SubLObject gaf = assertions_high.gaf_formula( assertion );
      final SubLObject event_type = cycl_utilities.formula_arg1( gaf, UNPROVIDED );
      final SubLObject role = cycl_utilities.formula_arg2( gaf, UNPROVIDED );
      final SubLObject arg_cons = get_arg_cons_for_pos( role, TWO_INTEGER );
      if( NIL == isa.not_isaP( entity, arg_cons, $mt_for_temporal_projection$.getDynamicValue( thread ), UNPROVIDED ) )
      {
        final SubLObject all_assertions_2 = kb_mapping_utilities.pred_value_gafs_in_any_mt( event_type, $const49$intensityFunctionForEventTypeInIn, ONE_INTEGER, UNPROVIDED );
        if( NIL != all_assertions_2 )
        {
          final SubLObject gaf_2 = assertions_high.gaf_formula( cycl_utilities.formula_arg0( all_assertions_2 ) );
          final SubLObject duration = cycl_utilities.formula_arg4( gaf_2, UNPROVIDED );
          final SubLObject duration_unit = cycl_utilities.formula_arg0( duration );
          SubLObject sum_of_prob = ZERO_INTEGER;
          final SubLObject starting_date = get_starting_date_of_concept( entity );
          if( NIL != starting_date )
          {
            final SubLObject time_elapsed = find_time_elapsed( starting_date, time );
            final SubLObject number_of_iterations = Numbers.floor( cycl_utilities.formula_arg1( convert_to_unit( time_elapsed, duration_unit ), UNPROVIDED ), UNPROVIDED );
            justifications = ConsesLow.append( justifications, plausibility_utilities.hl_justify_asent_fast( ConsesLow.list( $const50$startingDate, entity, starting_date ), $mt_for_temporal_projection$.getDynamicValue(
                thread ) ) );
            SubLObject count;
            SubLObject age_at_time;
            SubLObject intensity_function_at_age;
            SubLObject prob_1;
            SubLObject time_1;
            SubLObject prob_2;
            for( count = NIL, count = ZERO_INTEGER; count.numL( number_of_iterations ); count = Numbers.add( count, ONE_INTEGER ) )
            {
              age_at_time = ConsesLow.list( duration_unit, Numbers.add( count, ONE_INTEGER ) );
              intensity_function_at_age = find_intensity_function_at_age( event_type, age_at_time );
              prob_1 = calculate_probability_of_event_occurring_before_age( event_type, role, age_at_time );
              time_1 = bindings.variable_lookup( $sym28$_X, cycl_utilities.formula_arg0( mt_context.ask_mt_query( ConsesLow.list( $const51$evaluate, $sym28$_X, ConsesLow.list( $const52$DateAfterFn, starting_date,
                  age_at_time ) ), UNPROVIDED, UNPROVIDED, UNPROVIDED ) ) );
              prob_2 = get_probability_of_state_persisting_from_time( time_1, fact, time, col );
              if( NIL == intensity_function_at_age )
              {
                return NIL;
              }
              if( NIL != prob_1 && NIL != prob_2 )
              {
                if( NIL == conses_high.member( intensity_function_at_age, justifications, Symbols.symbol_function( EQUAL ), UNPROVIDED ) )
                {
                  justifications = ConsesLow.append( justifications, ConsesLow.list( intensity_function_at_age ) );
                }
                sum_of_prob = Numbers.add( sum_of_prob, Numbers.multiply( prob_1, prob_2 ) );
              }
            }
            return Values.values( sum_of_prob, justifications );
          }
        }
      }
      cdolist_list_var = cdolist_list_var.rest();
      assertion = cdolist_list_var.first();
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/temporal-projection-cols.lisp", position = 52324L)
  public static SubLObject use_risk_analysis(final SubLObject fact, final SubLObject time)
  {
    final SubLObject all_starting_times = mt_context.ask_mt_query( ConsesLow.listS( $const48$startingPointOfRiskPeriodForAsser, fact, $list40 ), UNPROVIDED, UNPROVIDED, UNPROVIDED );
    SubLObject list_of_times = NIL;
    SubLObject sum_of_prob = NIL;
    SubLObject justifications = NIL;
    final SubLObject col = cycl_utilities.formula_arg2( fact, UNPROVIDED );
    SubLObject cdolist_list_var = all_starting_times;
    SubLObject binding = NIL;
    binding = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      list_of_times = ConsesLow.cons( bindings.variable_lookup( $sym28$_X, binding ), list_of_times );
      cdolist_list_var = cdolist_list_var.rest();
      binding = cdolist_list_var.first();
    }
    final SubLObject closest_time_before_time = find_closest_time_before( time, list_of_times );
    if( NIL != closest_time_before_time )
    {
      SubLObject cdolist_list_var2;
      final SubLObject all_assertions = cdolist_list_var2 = kb_mapping_utilities.pred_value_gafs_in_any_mt( col, $const47$eventTypeStartsIntervalForState, THREE_INTEGER, UNPROVIDED );
      SubLObject assertion = NIL;
      assertion = cdolist_list_var2.first();
      while ( NIL != cdolist_list_var2)
      {
        final SubLObject gaf = assertions_high.gaf_formula( assertion );
        final SubLObject event_type = cycl_utilities.formula_arg1( gaf, UNPROVIDED );
        final SubLObject role = cycl_utilities.formula_arg2( gaf, UNPROVIDED );
        final SubLObject assertion_for_intensity_function = get_intensity_function_for_event_type( event_type, role );
        if( NIL != assertion_for_intensity_function )
        {
          final SubLObject gaf_$15 = assertions_high.gaf_formula( assertion_for_intensity_function );
          final SubLObject duration = get_duration_from_intensity_function( gaf_$15 );
          final SubLObject time_elapsed = find_time_elapsed( closest_time_before_time, time );
          final SubLObject duration_unit = cycl_utilities.formula_arg0( duration );
          final SubLObject time_elapsed_in_correct_unit = convert_to_unit( time_elapsed, duration_unit );
          SubLObject no_of_iterations;
          SubLObject count;
          SubLObject current_duration;
          SubLObject current_value;
          SubLObject prob_1;
          SubLObject prob_2;
          SubLObject supporting_assertion;
          for( no_of_iterations = Numbers.floor( bindings.variable_lookup( $sym28$_X, cycl_utilities.formula_arg0( mt_context.ask_mt_query( ConsesLow.list( $const51$evaluate, $sym28$_X, ConsesLow.list(
              $const53$QuotientFn, time_elapsed_in_correct_unit, duration ) ), UNPROVIDED, UNPROVIDED, UNPROVIDED ) ) ), UNPROVIDED ), count = NIL, count = ZERO_INTEGER; count.numL( no_of_iterations ); count = Numbers
                  .add( count, ONE_INTEGER ) )
          {
            current_duration = bindings.variable_lookup( $sym28$_X, cycl_utilities.formula_arg0( mt_context.ask_mt_query( ConsesLow.list( $const51$evaluate, $sym28$_X, ConsesLow.list( $const54$PlusFn, duration, ConsesLow
                .list( duration_unit, count ) ) ), UNPROVIDED, UNPROVIDED, UNPROVIDED ) ) );
            current_value = bindings.variable_lookup( $sym28$_X, cycl_utilities.formula_arg0( mt_context.ask_mt_query( ConsesLow.list( $const51$evaluate, $sym28$_X, ConsesLow.list( $const52$DateAfterFn,
                closest_time_before_time, current_duration ) ), UNPROVIDED, UNPROVIDED, UNPROVIDED ) ) );
            prob_1 = get_probability_of_event_occurrence( gaf_$15, current_duration );
            prob_2 = get_probability_of_state_persisting_from_time( current_value, fact, time, col );
            if( NIL != prob_1 && NIL != prob_2 )
            {
              if( NIL == sum_of_prob )
              {
                sum_of_prob = ZERO_INTEGER;
              }
              supporting_assertion = get_assertion_for_binary_predicates( ConsesLow.list( $const48$startingPointOfRiskPeriodForAsser, fact, closest_time_before_time ) );
              if( NIL != supporting_assertion )
              {
                justifications = ConsesLow.append( justifications, ConsesLow.list( supporting_assertion ) );
              }
              justifications = ConsesLow.append( justifications, ConsesLow.list( assertion ) );
              justifications = ConsesLow.append( justifications, ConsesLow.list( assertion_for_intensity_function ) );
              sum_of_prob = Numbers.add( sum_of_prob, Numbers.multiply( prob_1, prob_2 ) );
            }
          }
        }
        cdolist_list_var2 = cdolist_list_var2.rest();
        assertion = cdolist_list_var2.first();
      }
    }
    if( NIL != sum_of_prob )
    {
      return Values.values( sum_of_prob, justifications );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/temporal-projection-cols.lisp", position = 55673L)
  public static SubLObject get_probability_of_event_occurrence(final SubLObject gaf, final SubLObject current_duration)
  {
    SubLObject duration = NIL;
    SubLObject dist = NIL;
    if( cycl_utilities.formula_arg0( gaf ).eql( $const55$intensityFunctionForEventType ) )
    {
      duration = cycl_utilities.formula_arg4( gaf, UNPROVIDED );
      dist = cycl_utilities.formula_arg3( gaf, UNPROVIDED );
    }
    final SubLObject duration_unit = cycl_utilities.formula_arg0( duration );
    final SubLObject time_elapsed_in_correct_unit = convert_to_unit( current_duration, duration_unit );
    final SubLObject no_of_iterations = Numbers.floor( bindings.variable_lookup( $sym28$_X, cycl_utilities.formula_arg0( mt_context.ask_mt_query( ConsesLow.list( $const51$evaluate, $sym28$_X, ConsesLow.list(
        $const53$QuotientFn, time_elapsed_in_correct_unit, duration ) ), UNPROVIDED, UNPROVIDED, UNPROVIDED ) ) ), UNPROVIDED );
    final SubLObject no_of_iterations_of_no_events = Numbers.subtract( no_of_iterations, ONE_INTEGER );
    final SubLObject prob_of_occurrence_in_one_time_unit = calculate_persistence_likelihood( NIL, dist );
    if( no_of_iterations_of_no_events.numG( ZERO_INTEGER ) )
    {
      return Numbers.multiply( Numbers.expt( Numbers.subtract( ONE_INTEGER, prob_of_occurrence_in_one_time_unit ), no_of_iterations_of_no_events ), prob_of_occurrence_in_one_time_unit );
    }
    if( no_of_iterations.numE( ONE_INTEGER ) )
    {
      return prob_of_occurrence_in_one_time_unit;
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/temporal-projection-cols.lisp", position = 56818L)
  public static SubLObject calculate_probability_of_event_occurring_before_age(final SubLObject event_type, final SubLObject role, final SubLObject age)
  {
    SubLObject prob_of_no_events = ONE_INTEGER;
    final SubLObject final_value_for_iteration = Numbers.subtract( cycl_utilities.formula_arg1( age, UNPROVIDED ), ONE_INTEGER );
    final SubLObject all_assertions = kb_mapping_utilities.pred_value_gafs_in_any_mt( event_type, $const49$intensityFunctionForEventTypeInIn, ONE_INTEGER, UNPROVIDED );
    final SubLObject duration = cycl_utilities.formula_arg4( cycl_utilities.formula_arg0( all_assertions ), UNPROVIDED );
    final SubLObject duration_unit = cycl_utilities.formula_arg0( duration );
    SubLObject cdotimes_end_var;
    SubLObject count;
    SubLObject intensity_function_assertion;
    SubLObject gaf;
    SubLObject dist;
    SubLObject prob;
    for( cdotimes_end_var = Numbers.subtract( cycl_utilities.formula_arg1( age, UNPROVIDED ), ONE_INTEGER ), count = NIL, count = ZERO_INTEGER; count.numL( cdotimes_end_var ); count = Numbers.add( count, ONE_INTEGER ) )
    {
      intensity_function_assertion = find_intensity_function_at_age_for_role( event_type, ConsesLow.list( duration_unit, count ), role );
      if( NIL != intensity_function_assertion )
      {
        gaf = assertions_high.gaf_formula( intensity_function_assertion );
        dist = cycl_utilities.formula_arg3( gaf, UNPROVIDED );
        prob = calculate_persistence_likelihood( NIL, dist );
        prob_of_no_events = Numbers.multiply( prob_of_no_events, Numbers.subtract( ONE_INTEGER, prob ) );
      }
    }
    intensity_function_assertion = find_intensity_function_at_age_for_role( event_type, ConsesLow.list( duration_unit, final_value_for_iteration ), role );
    if( NIL != intensity_function_assertion )
    {
      gaf = assertions_high.gaf_formula( intensity_function_assertion );
      dist = cycl_utilities.formula_arg3( gaf, UNPROVIDED );
      prob = calculate_persistence_likelihood( NIL, dist );
      if( NIL != prob )
      {
        return Numbers.multiply( prob_of_no_events, prob );
      }
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/temporal-projection-cols.lisp", position = 58264L)
  public static SubLObject get_probability_of_state_persisting_from_time(final SubLObject time_1, final SubLObject fact, final SubLObject time_2, final SubLObject col)
  {
    final SubLObject all_assertions = kb_mapping_utilities.pred_value_gafs_in_any_mt( col, $const46$eventTypeEndsIntervalForState, THREE_INTEGER, UNPROVIDED );
    SubLObject all_events = NIL;
    SubLObject result = ONE_INTEGER;
    SubLObject cdolist_list_var = all_assertions;
    SubLObject assertion = NIL;
    assertion = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      final SubLObject gaf = assertions_high.gaf_formula( assertion );
      final SubLObject item_var = cycl_utilities.formula_arg1( gaf, UNPROVIDED );
      if( NIL == conses_high.member( item_var, all_events, Symbols.symbol_function( EQUAL ), Symbols.symbol_function( IDENTITY ) ) )
      {
        all_events = ConsesLow.cons( item_var, all_events );
      }
      cdolist_list_var = cdolist_list_var.rest();
      assertion = cdolist_list_var.first();
    }
    cdolist_list_var = all_events;
    SubLObject event_type = NIL;
    event_type = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      final SubLObject intensity_function = get_intensity_function_for_event_2( event_type, fact );
      final SubLObject gaf2 = assertions_high.gaf_formula( intensity_function );
      final SubLObject prob = get_probability_of_event_not_occurring( gaf2, time_1, time_2 );
      if( NIL != prob )
      {
        result = Numbers.multiply( result, prob );
      }
      cdolist_list_var = cdolist_list_var.rest();
      event_type = cdolist_list_var.first();
    }
    return result;
  }

  @SubLTranslatedFile.SubL(source = "cycl/temporal-projection-cols.lisp", position = 59183L)
  public static SubLObject get_probability_of_event_not_occurring(final SubLObject gaf, final SubLObject time_1, final SubLObject time_2)
  {
    SubLObject duration = NIL;
    SubLObject dist = NIL;
    if( cycl_utilities.formula_arg0( gaf ).eql( $const55$intensityFunctionForEventType ) )
    {
      duration = cycl_utilities.formula_arg4( gaf, UNPROVIDED );
      dist = cycl_utilities.formula_arg3( gaf, UNPROVIDED );
    }
    final SubLObject duration_unit = cycl_utilities.formula_arg0( duration );
    final SubLObject time_elapsed = find_time_elapsed( time_1, time_2 );
    final SubLObject time_elapsed_in_correct_unit = convert_to_unit( time_elapsed, duration_unit );
    final SubLObject no_of_iterations = Numbers.floor( bindings.variable_lookup( $sym28$_X, cycl_utilities.formula_arg0( mt_context.ask_mt_query( ConsesLow.list( $const51$evaluate, $sym28$_X, ConsesLow.list(
        $const53$QuotientFn, time_elapsed_in_correct_unit, duration ) ), UNPROVIDED, UNPROVIDED, UNPROVIDED ) ) ), UNPROVIDED );
    final SubLObject prob_of_occurrence_in_one_unit = calculate_persistence_likelihood( NIL, dist );
    if( NIL != prob_of_occurrence_in_one_unit && NIL != no_of_iterations )
    {
      return Numbers.expt( Numbers.subtract( ONE_INTEGER, prob_of_occurrence_in_one_unit ), no_of_iterations );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/temporal-projection-cols.lisp", position = 60045L)
  public static SubLObject get_duration_from_intensity_function(final SubLObject gaf)
  {
    final SubLObject pred = cycl_utilities.formula_arg0( gaf );
    if( pred.eql( $const55$intensityFunctionForEventType ) )
    {
      return cycl_utilities.formula_arg4( gaf, UNPROVIDED );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/temporal-projection-cols.lisp", position = 60240L)
  public static SubLObject get_intensity_function_for_event_type(final SubLObject event_type, final SubLObject role)
  {
    SubLObject cdolist_list_var;
    final SubLObject all_assertions = cdolist_list_var = kb_mapping_utilities.pred_value_gafs_in_any_mt( event_type, $const55$intensityFunctionForEventType, ONE_INTEGER, UNPROVIDED );
    SubLObject assertion = NIL;
    assertion = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      final SubLObject gaf = assertions_high.gaf_formula( assertion );
      final SubLObject role_in_gaf = cycl_utilities.formula_arg2( gaf, UNPROVIDED );
      if( role_in_gaf.equal( role ) )
      {
        return assertion;
      }
      cdolist_list_var = cdolist_list_var.rest();
      assertion = cdolist_list_var.first();
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/temporal-projection-cols.lisp", position = 60632L)
  public static SubLObject find_intensity_function_at_age(final SubLObject event_type, final SubLObject age)
  {
    SubLObject cdolist_list_var;
    final SubLObject all_assertions = cdolist_list_var = kb_mapping_utilities.pred_value_gafs_in_any_mt( event_type, $const49$intensityFunctionForEventTypeInIn, ONE_INTEGER, UNPROVIDED );
    SubLObject assertion = NIL;
    assertion = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      final SubLObject gaf = assertions_high.gaf_formula( assertion );
      final SubLObject interval = narts_high.nart_hl_formula( cycl_utilities.formula_arg5( gaf, UNPROVIDED ) );
      final SubLObject lower = cycl_utilities.formula_arg1( interval, UNPROVIDED );
      final SubLObject upper = cycl_utilities.formula_arg2( interval, UNPROVIDED );
      if( NIL == mt_context.ask_mt_query( ConsesLow.list( $const56$lessThan, age, lower ), UNPROVIDED, UNPROVIDED, UNPROVIDED ) && NIL != mt_context.ask_mt_query( ConsesLow.list( $const56$lessThan, age, upper ),
          UNPROVIDED, UNPROVIDED, UNPROVIDED ) )
      {
        return assertion;
      }
      cdolist_list_var = cdolist_list_var.rest();
      assertion = cdolist_list_var.first();
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/temporal-projection-cols.lisp", position = 61201L)
  public static SubLObject find_intensity_function_at_age_for_role(final SubLObject event_type, final SubLObject age, final SubLObject role)
  {
    SubLObject cdolist_list_var;
    final SubLObject all_assertions = cdolist_list_var = kb_mapping_utilities.pred_value_gafs_in_any_mt( event_type, $const49$intensityFunctionForEventTypeInIn, ONE_INTEGER, UNPROVIDED );
    SubLObject assertion = NIL;
    assertion = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      final SubLObject gaf = assertions_high.gaf_formula( assertion );
      final SubLObject interval = narts_high.nart_hl_formula( cycl_utilities.formula_arg5( gaf, UNPROVIDED ) );
      final SubLObject role_1 = cycl_utilities.formula_arg2( gaf, UNPROVIDED );
      final SubLObject lower = cycl_utilities.formula_arg1( interval, UNPROVIDED );
      final SubLObject upper = cycl_utilities.formula_arg2( interval, UNPROVIDED );
      if( NIL == mt_context.ask_mt_query( ConsesLow.list( $const56$lessThan, age, lower ), UNPROVIDED, UNPROVIDED, UNPROVIDED ) && NIL != mt_context.ask_mt_query( ConsesLow.list( $const56$lessThan, age, upper ),
          UNPROVIDED, UNPROVIDED, UNPROVIDED ) && role.eql( role_1 ) )
      {
        return assertion;
      }
      cdolist_list_var = cdolist_list_var.rest();
      assertion = cdolist_list_var.first();
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/temporal-projection-cols.lisp", position = 61862L)
  public static SubLObject get_intensity_function_for_event_2(final SubLObject event_type, final SubLObject fact)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject all_assertions = kb_mapping_utilities.pred_value_gafs_in_any_mt( event_type, $const55$intensityFunctionForEventType, ONE_INTEGER, UNPROVIDED );
    final SubLObject entity = cycl_utilities.formula_arg1( fact, UNPROVIDED );
    SubLObject cdolist_list_var = all_assertions;
    SubLObject assertion = NIL;
    assertion = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      final SubLObject gaf = assertions_high.gaf_formula( assertion );
      final SubLObject role_in_gaf = cycl_utilities.formula_arg2( gaf, UNPROVIDED );
      final SubLObject arg_cons = get_arg_cons_for_pos( role_in_gaf, TWO_INTEGER );
      if( NIL == isa.not_isaP( entity, arg_cons, $mt_for_temporal_projection$.getDynamicValue( thread ), UNPROVIDED ) )
      {
        return assertion;
      }
      cdolist_list_var = cdolist_list_var.rest();
      assertion = cdolist_list_var.first();
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/temporal-projection-cols.lisp", position = 62375L)
  public static SubLObject find_transition_probability(final SubLObject fact, final SubLObject time, final SubLObject depth_of_recursion)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    thread.resetMultipleValues();
    final SubLObject result_1 = find_forward_transition_probabilities( fact, time, depth_of_recursion );
    final SubLObject justifications_1 = thread.secondMultipleValue();
    thread.resetMultipleValues();
    if( NIL != result_1 )
    {
      return Values.values( result_1, justifications_1 );
    }
    thread.resetMultipleValues();
    final SubLObject result_2 = find_probability_of_remaining_in_state_1( fact, time, depth_of_recursion );
    final SubLObject justifications_2 = thread.secondMultipleValue();
    thread.resetMultipleValues();
    if( NIL != result_2 )
    {
      return Values.values( result_2, justifications_2 );
    }
    thread.resetMultipleValues();
    final SubLObject result_3 = find_backward_transition_probabilities( fact, time, depth_of_recursion );
    final SubLObject justifications_3 = thread.secondMultipleValue();
    thread.resetMultipleValues();
    if( NIL != result_3 )
    {
      return Values.values( result_3, justifications_3 );
    }
    thread.resetMultipleValues();
    final SubLObject result_4 = find_backward_transition_probabilities_to_self( fact, time, depth_of_recursion );
    final SubLObject justifications_4 = thread.secondMultipleValue();
    thread.resetMultipleValues();
    if( NIL != result_4 )
    {
      return Values.values( result_4, justifications_4 );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/temporal-projection-cols.lisp", position = 63283L)
  public static SubLObject find_backward_transition_probabilities(final SubLObject fact, final SubLObject time, final SubLObject depth_of_recursion)
  {
    final SubLObject col = cycl_utilities.formula_arg2( fact, UNPROVIDED );
    SubLObject justifications = NIL;
    final SubLObject all_assertions = kb_mapping_utilities.pred_value_gafs_in_any_mt( col, $const57$transitionProbabilityBetweenColle, ONE_INTEGER, UNPROVIDED );
    SubLObject sum_of_probabilities = NIL;
    SubLObject cdolist_list_var = all_assertions;
    SubLObject assertion = NIL;
    assertion = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      final SubLObject gaf = assertions_high.gaf_formula( assertion );
      final SubLObject parent = cycl_utilities.formula_arg2( gaf, UNPROVIDED );
      final SubLObject prob = find_prob_of_backward_transition( col, parent, fact, time, gaf, depth_of_recursion );
      if( NIL != prob )
      {
        if( NIL == sum_of_probabilities )
        {
          sum_of_probabilities = ZERO_INTEGER;
        }
        justifications = ConsesLow.append( justifications, ConsesLow.append( justifications, ConsesLow.list( assertion ) ) );
        sum_of_probabilities = Numbers.add( sum_of_probabilities, prob );
      }
      cdolist_list_var = cdolist_list_var.rest();
      assertion = cdolist_list_var.first();
    }
    return Values.values( sum_of_probabilities, justifications );
  }

  @SubLTranslatedFile.SubL(source = "cycl/temporal-projection-cols.lisp", position = 64143L)
  public static SubLObject find_backward_transition_probabilities_to_self(final SubLObject fact, final SubLObject time, final SubLObject depth_of_recursion)
  {
    final SubLObject col = cycl_utilities.formula_arg2( fact, UNPROVIDED );
    SubLObject justifications = NIL;
    final SubLObject all_assertions = kb_mapping_utilities.pred_value_gafs_in_any_mt( col, $const57$transitionProbabilityBetweenColle, ONE_INTEGER, UNPROVIDED );
    if( NIL != all_assertions )
    {
      final SubLObject gaf = assertions_high.gaf_formula( cycl_utilities.formula_arg0( all_assertions ) );
      final SubLObject prob = find_prob_of_backward_transition( col, col, fact, time, gaf, depth_of_recursion );
      if( NIL != prob )
      {
        justifications = ConsesLow.append( justifications, all_assertions );
        return Values.values( prob, justifications );
      }
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/temporal-projection-cols.lisp", position = 64740L)
  public static SubLObject find_prob_of_backward_transition(final SubLObject col, final SubLObject parent, final SubLObject fact, final SubLObject time, final SubLObject gaf, final SubLObject depth_of_recursion)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject entity = cycl_utilities.formula_arg1( fact, UNPROVIDED );
    final SubLObject new_query = ConsesLow.list( $const15$isa, entity, parent );
    final SubLObject interval = cycl_utilities.formula_arg3( gaf, UNPROVIDED );
    final SubLObject lower = cycl_utilities.formula_arg1( interval, UNPROVIDED );
    final SubLObject upper = cycl_utilities.formula_arg2( interval, UNPROVIDED );
    final SubLObject unit = cycl_utilities.formula_arg0( interval );
    final SubLObject duration = cycl_utilities.formula_arg5( gaf, UNPROVIDED );
    SubLObject observation_matrix = NIL;
    final SubLObject justifications = NIL;
    final SubLObject duration_unit = cycl_utilities.formula_arg0( duration );
    SubLObject matrix = NIL;
    SubLObject cdotimes_end_var;
    SubLObject count;
    SubLObject duration_for_query;
    SubLObject duration_for_query_in_correct_unit;
    SubLObject time_for_new_query;
    SubLObject prob_of_parent;
    SubLObject all_assertions;
    SubLObject lst_of_other_nodes;
    SubLObject cdolist_list_var;
    SubLObject assertion;
    SubLObject gaf_node;
    SubLObject state_1;
    SubLObject temp_lst;
    SubLObject cdolist_list_var_$16;
    SubLObject state_2;
    SubLObject all_assertions_$17;
    SubLObject time_elapsed;
    SubLObject time_elapsed_since_start;
    SubLObject prob;
    SubLObject all_assertions_$18;
    SubLObject observation_entry;
    SubLObject cdotimes_end_var_$19;
    SubLObject index;
    for( cdotimes_end_var = Numbers.subtract( upper, lower ), count = NIL, count = ZERO_INTEGER; count.numL( cdotimes_end_var ); count = Numbers.add( count, ONE_INTEGER ) )
    {
      duration_for_query = ConsesLow.list( unit, Numbers.add( count, lower ) );
      duration_for_query_in_correct_unit = convert_to_unit( duration_for_query, duration_unit );
      time_for_new_query = bindings.variable_lookup( $sym28$_X, cycl_utilities.formula_arg0( mt_context.ask_mt_query( ConsesLow.list( $const51$evaluate, $sym28$_X, ConsesLow.list( $const52$DateAfterFn, time,
          duration_for_query_in_correct_unit ) ), UNPROVIDED, UNPROVIDED, UNPROVIDED ) ) );
      prob_of_parent = get_persistence_likelihood_for_fact_at_time( new_query, time_for_new_query, T, $mt_for_temporal_projection$.getDynamicValue( thread ), T, depth_of_recursion );
      if( NIL != prob_of_parent )
      {
        all_assertions = kb_mapping_utilities.pred_value_gafs_in_any_mt( parent, $const57$transitionProbabilityBetweenColle, TWO_INTEGER, UNPROVIDED );
        lst_of_other_nodes = NIL;
        cdolist_list_var = all_assertions;
        assertion = NIL;
        assertion = cdolist_list_var.first();
        while ( NIL != cdolist_list_var)
        {
          gaf_node = assertions_high.gaf_formula( assertion );
          lst_of_other_nodes = ConsesLow.cons( cycl_utilities.formula_arg1( gaf_node, UNPROVIDED ), lst_of_other_nodes );
          cdolist_list_var = cdolist_list_var.rest();
          assertion = cdolist_list_var.first();
        }
        lst_of_other_nodes = ConsesLow.cons( parent, lst_of_other_nodes );
        if( Sequences.length( lst_of_other_nodes ).numG( ONE_INTEGER ) )
        {
          cdolist_list_var = lst_of_other_nodes;
          state_1 = NIL;
          state_1 = cdolist_list_var.first();
          while ( NIL != cdolist_list_var)
          {
            temp_lst = NIL;
            cdolist_list_var_$16 = lst_of_other_nodes;
            state_2 = NIL;
            state_2 = cdolist_list_var_$16.first();
            while ( NIL != cdolist_list_var_$16)
            {
              if( state_1.equal( state_2 ) )
              {
                all_assertions_$17 = kb_mapping_utilities.pred_value_gafs_in_any_mt( state_1, $const57$transitionProbabilityBetweenColle, ONE_INTEGER, UNPROVIDED );
                time_elapsed = duration_for_query_in_correct_unit;
                time_elapsed_since_start = reader.bq_cons( duration_unit, $list58 );
                prob = calculate_probability_of_remaining_in_state( time_elapsed, all_assertions_$17, duration, time_elapsed_since_start );
                if( NIL != prob )
                {
                  temp_lst = ConsesLow.cons( prob, temp_lst );
                }
                else
                {
                  temp_lst = ConsesLow.cons( ZERO_INTEGER, temp_lst );
                }
              }
              else
              {
                all_assertions_$18 = get_assertions_for_transition_from_state_to_state( state_1, state_2 );
                time_elapsed = duration_for_query_in_correct_unit;
                time_elapsed_since_start = reader.bq_cons( duration_unit, $list58 );
                prob = calculate_probability_of_transition_to_state( time_elapsed, all_assertions_$18, duration, time_elapsed_since_start );
                if( NIL != prob )
                {
                  temp_lst = ConsesLow.cons( prob, temp_lst );
                }
                else
                {
                  temp_lst = ConsesLow.cons( ZERO_INTEGER, temp_lst );
                }
              }
              cdolist_list_var_$16 = cdolist_list_var_$16.rest();
              state_2 = cdolist_list_var_$16.first();
            }
            matrix = ConsesLow.cons( ConsesLow.list( state_1, Sequences.reverse( temp_lst ) ), matrix );
            observation_entry = NIL;
            for( cdotimes_end_var_$19 = Numbers.subtract( Sequences.length( lst_of_other_nodes ), ONE_INTEGER ), index = NIL, index = ZERO_INTEGER; index.numL( cdotimes_end_var_$19 ); index = Numbers.add( index,
                ONE_INTEGER ) )
            {
              observation_entry = ConsesLow.cons( ZERO_INTEGER, observation_entry );
            }
            if( state_1.equal( parent ) )
            {
              observation_entry = ConsesLow.cons( cycl_utilities.formula_arg1( prob_of_parent, UNPROVIDED ), observation_entry );
            }
            else
            {
              observation_entry = ConsesLow.cons( ZERO_INTEGER, observation_entry );
            }
            observation_matrix = ConsesLow.cons( ConsesLow.list( state_1, observation_entry ), observation_matrix );
            cdolist_list_var = cdolist_list_var.rest();
            state_1 = cdolist_list_var.first();
          }
          return Values.values( find_probability_for_state( col, Sequences.reverse( matrix ), Sequences.reverse( observation_matrix ), lst_of_other_nodes ), justifications );
        }
      }
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/temporal-projection-cols.lisp", position = 69087L)
  public static SubLObject find_probability_for_state(final SubLObject col, final SubLObject transition_matrix, final SubLObject observation_matrix, final SubLObject lst_of_nodes)
  {
    SubLObject reverse_product_of_transition_and_observation = NIL;
    SubLObject product_of_transition_and_observation = NIL;
    SubLObject reverse_product_from_b_matrix = NIL;
    SubLObject sum_of_b_matrix = ZERO_INTEGER;
    SubLObject product_from_b_matrix = NIL;
    SubLObject cdotimes_end_var;
    SubLObject count_1;
    SubLObject entry_of_prodoct_of_transition_and_observation;
    SubLObject cdotimes_end_var_$20;
    SubLObject count_2;
    SubLObject temp_sum;
    SubLObject cdotimes_end_var_$21;
    SubLObject count_3;
    for( cdotimes_end_var = Sequences.length( lst_of_nodes ), count_1 = NIL, count_1 = ZERO_INTEGER; count_1.numL( cdotimes_end_var ); count_1 = Numbers.add( count_1, ONE_INTEGER ) )
    {
      entry_of_prodoct_of_transition_and_observation = NIL;
      for( cdotimes_end_var_$20 = Sequences.length( lst_of_nodes ), count_2 = NIL, count_2 = ZERO_INTEGER; count_2.numL( cdotimes_end_var_$20 ); count_2 = Numbers.add( count_2, ONE_INTEGER ) )
      {
        temp_sum = ZERO_INTEGER;
        for( cdotimes_end_var_$21 = Sequences.length( lst_of_nodes ), count_3 = NIL, count_3 = ZERO_INTEGER; count_3.numL( cdotimes_end_var_$21 ); count_3 = Numbers.add( count_3, ONE_INTEGER ) )
        {
          temp_sum = Numbers.add( temp_sum, Numbers.multiply( get_array_element( transition_matrix, count_1, count_3 ), get_array_element( observation_matrix, count_3, count_2 ) ) );
        }
        entry_of_prodoct_of_transition_and_observation = ConsesLow.cons( temp_sum, entry_of_prodoct_of_transition_and_observation );
      }
      reverse_product_of_transition_and_observation = ConsesLow.cons( Sequences.reverse( entry_of_prodoct_of_transition_and_observation ), reverse_product_of_transition_and_observation );
    }
    product_of_transition_and_observation = Sequences.reverse( reverse_product_of_transition_and_observation );
    SubLObject entry_of_product_from_b_matrix;
    SubLObject count_4;
    SubLObject temp_sum2;
    SubLObject cdotimes_end_var_$22;
    SubLObject count_5;
    for( cdotimes_end_var = Sequences.length( lst_of_nodes ), count_1 = NIL, count_1 = ZERO_INTEGER; count_1.numL( cdotimes_end_var ); count_1 = Numbers.add( count_1, ONE_INTEGER ) )
    {
      entry_of_product_from_b_matrix = NIL;
      for( count_4 = NIL, count_4 = ZERO_INTEGER; count_4.numL( ONE_INTEGER ); count_4 = Numbers.add( count_4, ONE_INTEGER ) )
      {
        temp_sum2 = ZERO_INTEGER;
        for( cdotimes_end_var_$22 = Sequences.length( lst_of_nodes ), count_5 = NIL, count_5 = ZERO_INTEGER; count_5.numL( cdotimes_end_var_$22 ); count_5 = Numbers.add( count_5, ONE_INTEGER ) )
        {
          temp_sum2 = Numbers.add( temp_sum2, Numbers.multiply( ConsesLow.nth( count_5, ConsesLow.nth( count_1, product_of_transition_and_observation ) ), ONE_INTEGER ) );
        }
        entry_of_product_from_b_matrix = ConsesLow.cons( temp_sum2, entry_of_product_from_b_matrix );
      }
      reverse_product_from_b_matrix = ConsesLow.cons( Sequences.reverse( entry_of_product_from_b_matrix ), reverse_product_from_b_matrix );
    }
    SubLObject cdolist_list_var;
    product_from_b_matrix = ( cdolist_list_var = Sequences.reverse( reverse_product_from_b_matrix ) );
    SubLObject entry = NIL;
    entry = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      sum_of_b_matrix = Numbers.add( sum_of_b_matrix, cycl_utilities.formula_arg0( entry ) );
      cdolist_list_var = cdolist_list_var.rest();
      entry = cdolist_list_var.first();
    }
    if( sum_of_b_matrix.numG( ZERO_INTEGER ) )
    {
      final SubLObject pos = Sequences.position( col, lst_of_nodes, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
      entry = ConsesLow.nth( pos, product_from_b_matrix );
      return Numbers.divide( cycl_utilities.formula_arg0( entry ), sum_of_b_matrix );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/temporal-projection-cols.lisp", position = 71338L)
  public static SubLObject get_array_element(final SubLObject lst, final SubLObject count_1, final SubLObject count_2)
  {
    final SubLObject entry = cycl_utilities.formula_arg1( ConsesLow.nth( count_1, lst ), UNPROVIDED );
    return ConsesLow.nth( count_2, entry );
  }

  @SubLTranslatedFile.SubL(source = "cycl/temporal-projection-cols.lisp", position = 71487L)
  public static SubLObject get_assertions_for_transition_from_state_to_state(final SubLObject state_1, final SubLObject state_2)
  {
    SubLObject results = NIL;
    SubLObject cdolist_list_var = kb_mapping_utilities.pred_value_gafs_in_any_mt( state_1, $const57$transitionProbabilityBetweenColle, ONE_INTEGER, UNPROVIDED );
    SubLObject assertion = NIL;
    assertion = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      final SubLObject gaf = assertions_high.gaf_formula( assertion );
      if( state_2.equal( cycl_utilities.formula_arg2( gaf, UNPROVIDED ) ) )
      {
        results = ConsesLow.cons( assertion, results );
      }
      cdolist_list_var = cdolist_list_var.rest();
      assertion = cdolist_list_var.first();
    }
    return results;
  }

  @SubLTranslatedFile.SubL(source = "cycl/temporal-projection-cols.lisp", position = 71919L)
  public static SubLObject find_probability_of_remaining_in_state_1(final SubLObject fact, final SubLObject time, final SubLObject depth_of_recursion)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject col = cycl_utilities.formula_arg2( fact, UNPROVIDED );
    SubLObject justifications = NIL;
    final SubLObject entity = cycl_utilities.formula_arg1( fact, UNPROVIDED );
    final SubLObject all_assertions = kb_mapping_utilities.pred_value_gafs_in_any_mt( col, $const57$transitionProbabilityBetweenColle, ONE_INTEGER, UNPROVIDED );
    SubLObject sum_of_probabilities = NIL;
    if( NIL != all_assertions )
    {
      SubLObject cdolist_list_var = all_assertions;
      SubLObject assertion = NIL;
      assertion = cdolist_list_var.first();
      while ( NIL != cdolist_list_var)
      {
        final SubLObject gaf = assertions_high.gaf_formula( assertion );
        final SubLObject previous_col = cycl_utilities.formula_arg1( gaf, UNPROVIDED );
        final SubLObject interval = cycl_utilities.formula_arg3( gaf, UNPROVIDED );
        final SubLObject lower = cycl_utilities.formula_arg1( interval, UNPROVIDED );
        final SubLObject upper = cycl_utilities.formula_arg2( interval, UNPROVIDED );
        final SubLObject unit = cycl_utilities.formula_arg0( interval );
        final SubLObject duration = cycl_utilities.formula_arg5( gaf, UNPROVIDED );
        final SubLObject duration_unit = cycl_utilities.formula_arg0( duration );
        final SubLObject pred = cycl_utilities.formula_arg6( gaf, UNPROVIDED );
        final SubLObject new_query = ConsesLow.list( $const15$isa, entity, previous_col );
        if( pred.eql( $const59$startingPointForAssertion ) )
        {
          SubLObject cdotimes_end_var;
          SubLObject count;
          SubLObject duration_for_query;
          SubLObject duration_for_query_in_correct_unit;
          SubLObject query_result;
          SubLObject diff;
          SubLObject starting_time;
          SubLObject time_elapsed_since_start;
          SubLObject time_elapsed;
          SubLObject time_elapsed_in_next_unit;
          SubLObject prob_1;
          SubLObject persis_prob;
          SubLObject justifications_1;
          SubLObject prob_2;
          for( cdotimes_end_var = Numbers.subtract( upper, lower ), count = NIL, count = ZERO_INTEGER; count.numL( cdotimes_end_var ); count = Numbers.add( count, ONE_INTEGER ) )
          {
            duration_for_query = ConsesLow.list( unit, Numbers.add( count, lower ) );
            duration_for_query_in_correct_unit = convert_to_unit( duration_for_query, duration_unit );
            query_result = bindings.variable_lookup( $sym28$_X, cycl_utilities.formula_arg0( mt_context.ask_mt_query( ConsesLow.list( $const51$evaluate, $sym28$_X, ConsesLow.list( $const60$DateBeforeFn, time,
                duration_for_query ) ), UNPROVIDED, UNPROVIDED, UNPROVIDED ) ) );
            diff = cycl_utilities.formula_arg1( bindings.variable_lookup( $sym28$_X, cycl_utilities.formula_arg0( mt_context.ask_mt_query( ConsesLow.list( $const51$evaluate, $sym28$_X, ConsesLow.list(
                $const61$DifferenceFn, duration_for_query_in_correct_unit, duration ) ), UNPROVIDED, UNPROVIDED, UNPROVIDED ) ) ), UNPROVIDED );
            if( diff.numE( ZERO_INTEGER ) )
            {
              starting_time = get_farthest_time_for_assertion( new_query, time );
              if( NIL != starting_time && NIL == mt_context.ask_mt_query( ConsesLow.list( $const62$laterThan, starting_time, query_result ), UNPROVIDED, UNPROVIDED, UNPROVIDED ) )
              {
                time_elapsed_since_start = find_time_elapsed( starting_time, starting_time );
                time_elapsed = find_time_elapsed( starting_time, query_result );
                time_elapsed_in_next_unit = bindings.variable_lookup( $sym28$_X, cycl_utilities.formula_arg0( mt_context.ask_mt_query( ConsesLow.list( $const51$evaluate, $sym28$_X, ConsesLow.list( $const54$PlusFn,
                    time_elapsed, duration_for_query_in_correct_unit ) ), UNPROVIDED, UNPROVIDED, UNPROVIDED ) ) );
                prob_1 = calculate_probability_of_remaining_in_state( time_elapsed_in_next_unit, all_assertions, duration, time_elapsed_since_start );
                if( NIL != prob_1 )
                {
                  thread.resetMultipleValues();
                  persis_prob = get_persistence_likelihood_for_fact_at_time( new_query, query_result, T, $mt_for_temporal_projection$.getDynamicValue( thread ), T, depth_of_recursion );
                  justifications_1 = thread.secondMultipleValue();
                  thread.resetMultipleValues();
                  if( NIL != persis_prob )
                  {
                    prob_2 = cycl_utilities.formula_arg1( persis_prob, UNPROVIDED );
                    if( NIL != prob_1 && NIL != prob_2 )
                    {
                      if( NIL == sum_of_probabilities )
                      {
                        sum_of_probabilities = ZERO_INTEGER;
                      }
                      justifications = ConsesLow.append( justifications, ConsesLow.list( assertion ) );
                      justifications = ConsesLow.append( justifications, justifications_1 );
                      sum_of_probabilities = Numbers.add( sum_of_probabilities, Numbers.multiply( prob_1, prob_2 ) );
                    }
                  }
                }
              }
            }
          }
        }
        cdolist_list_var = cdolist_list_var.rest();
        assertion = cdolist_list_var.first();
      }
    }
    if( NIL != sum_of_probabilities )
    {
      return Values.values( sum_of_probabilities, justifications );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/temporal-projection-cols.lisp", position = 76006L)
  public static SubLObject find_probability_of_remaining_in_state_2(final SubLObject fact, final SubLObject time, final SubLObject depth_of_recursion)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject col = cycl_utilities.formula_arg2( fact, UNPROVIDED );
    SubLObject justifications = NIL;
    final SubLObject entity = cycl_utilities.formula_arg1( fact, UNPROVIDED );
    final SubLObject all_assertions = kb_mapping_utilities.pred_value_gafs_in_any_mt( col, $const57$transitionProbabilityBetweenColle, ONE_INTEGER, UNPROVIDED );
    SubLObject sum_of_probabilities = NIL;
    if( NIL != all_assertions )
    {
      SubLObject cdolist_list_var = all_assertions;
      SubLObject assertion = NIL;
      assertion = cdolist_list_var.first();
      while ( NIL != cdolist_list_var)
      {
        final SubLObject gaf = assertions_high.gaf_formula( assertion );
        final SubLObject previous_col = cycl_utilities.formula_arg1( gaf, UNPROVIDED );
        final SubLObject interval = cycl_utilities.formula_arg3( gaf, UNPROVIDED );
        final SubLObject lower = cycl_utilities.formula_arg1( interval, UNPROVIDED );
        final SubLObject upper = cycl_utilities.formula_arg2( interval, UNPROVIDED );
        final SubLObject unit = cycl_utilities.formula_arg0( interval );
        final SubLObject duration = cycl_utilities.formula_arg5( gaf, UNPROVIDED );
        final SubLObject duration_unit = cycl_utilities.formula_arg0( duration );
        final SubLObject pred = cycl_utilities.formula_arg6( gaf, UNPROVIDED );
        final SubLObject new_query = ConsesLow.list( $const15$isa, entity, previous_col );
        if( pred.eql( $const59$startingPointForAssertion ) )
        {
          SubLObject cdotimes_end_var;
          SubLObject count;
          SubLObject duration_for_query;
          SubLObject duration_for_query_in_correct_unit;
          SubLObject query_result;
          SubLObject diff;
          SubLObject starting_time;
          SubLObject time_elapsed_since_start;
          SubLObject time_elapsed;
          SubLObject time_elapsed_in_next_unit;
          SubLObject prob_1;
          SubLObject persis_prob;
          SubLObject justifications_1;
          SubLObject prob_2;
          for( cdotimes_end_var = Numbers.subtract( upper, lower ), count = NIL, count = ZERO_INTEGER; count.numL( cdotimes_end_var ); count = Numbers.add( count, ONE_INTEGER ) )
          {
            duration_for_query = ConsesLow.list( unit, Numbers.add( count, lower ) );
            duration_for_query_in_correct_unit = convert_to_unit( duration_for_query, duration_unit );
            query_result = bindings.variable_lookup( $sym28$_X, cycl_utilities.formula_arg0( mt_context.ask_mt_query( ConsesLow.list( $const51$evaluate, $sym28$_X, ConsesLow.list( $const52$DateAfterFn, time,
                duration_for_query ) ), UNPROVIDED, UNPROVIDED, UNPROVIDED ) ) );
            diff = cycl_utilities.formula_arg1( bindings.variable_lookup( $sym28$_X, cycl_utilities.formula_arg0( mt_context.ask_mt_query( ConsesLow.list( $const51$evaluate, $sym28$_X, ConsesLow.list(
                $const61$DifferenceFn, duration_for_query_in_correct_unit, duration ) ), UNPROVIDED, UNPROVIDED, UNPROVIDED ) ) ), UNPROVIDED );
            PrintLow.format( T, $str63$___query_result___a_diff__a_, query_result, diff );
            if( diff.numE( ZERO_INTEGER ) )
            {
              starting_time = get_farthest_time_for_assertion( new_query, time );
              if( NIL != starting_time )
              {
                PrintLow.format( T, $str64$____a__a_, starting_time, query_result );
                if( NIL == mt_context.ask_mt_query( ConsesLow.list( $const62$laterThan, starting_time, query_result ), UNPROVIDED, UNPROVIDED, UNPROVIDED ) )
                {
                  time_elapsed_since_start = find_time_elapsed( starting_time, starting_time );
                  time_elapsed = find_time_elapsed( starting_time, query_result );
                  time_elapsed_in_next_unit = bindings.variable_lookup( $sym28$_X, cycl_utilities.formula_arg0( mt_context.ask_mt_query( ConsesLow.list( $const51$evaluate, $sym28$_X, ConsesLow.list( $const54$PlusFn,
                      time_elapsed, duration_for_query_in_correct_unit ) ), UNPROVIDED, UNPROVIDED, UNPROVIDED ) ) );
                  prob_1 = calculate_probability_of_remaining_in_state( time_elapsed_in_next_unit, all_assertions, duration, time_elapsed_since_start );
                  if( NIL != prob_1 )
                  {
                    thread.resetMultipleValues();
                    persis_prob = get_persistence_likelihood_for_fact_at_time( new_query, query_result, T, $mt_for_temporal_projection$.getDynamicValue( thread ), T, depth_of_recursion );
                    justifications_1 = thread.secondMultipleValue();
                    thread.resetMultipleValues();
                    if( NIL != persis_prob )
                    {
                      prob_2 = cycl_utilities.formula_arg1( persis_prob, UNPROVIDED );
                      if( NIL != prob_1 && NIL != prob_2 )
                      {
                        if( NIL == sum_of_probabilities )
                        {
                          sum_of_probabilities = ZERO_INTEGER;
                        }
                        justifications = ConsesLow.append( justifications, ConsesLow.list( assertion ) );
                        justifications = ConsesLow.append( justifications, justifications_1 );
                        sum_of_probabilities = Numbers.add( sum_of_probabilities, Numbers.multiply( prob_1, prob_2 ) );
                      }
                    }
                  }
                }
              }
            }
          }
        }
        cdolist_list_var = cdolist_list_var.rest();
        assertion = cdolist_list_var.first();
      }
    }
    if( NIL != sum_of_probabilities )
    {
      return Values.values( sum_of_probabilities, justifications );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/temporal-projection-cols.lisp", position = 80079L)
  public static SubLObject find_forward_transition_probabilities(final SubLObject fact, final SubLObject time, final SubLObject depth_of_recursion)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject col = cycl_utilities.formula_arg2( fact, UNPROVIDED );
    SubLObject justifications = NIL;
    SubLObject done_lst = NIL;
    final SubLObject entity = cycl_utilities.formula_arg1( fact, UNPROVIDED );
    SubLObject cdolist_list_var;
    final SubLObject list_of_times = cdolist_list_var = get_list_of_times_for_assertion( fact );
    SubLObject time_1 = NIL;
    time_1 = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      if( NIL != mt_context.ask_mt_query( ConsesLow.list( $const62$laterThan, time_1, time ), UNPROVIDED, UNPROVIDED, UNPROVIDED ) )
      {
        return NIL;
      }
      cdolist_list_var = cdolist_list_var.rest();
      time_1 = cdolist_list_var.first();
    }
    final SubLObject all_assertions = kb_mapping_utilities.pred_value_gafs_in_any_mt( col, $const57$transitionProbabilityBetweenColle, TWO_INTEGER, UNPROVIDED );
    if( NIL != all_assertions )
    {
      SubLObject sum_of_probabilities = NIL;
      SubLObject cdolist_list_var2 = all_assertions;
      SubLObject assertion = NIL;
      assertion = cdolist_list_var2.first();
      while ( NIL != cdolist_list_var2)
      {
        final SubLObject gaf = assertions_high.gaf_formula( assertion );
        final SubLObject previous_col = cycl_utilities.formula_arg1( gaf, UNPROVIDED );
        final SubLObject interval = cycl_utilities.formula_arg3( gaf, UNPROVIDED );
        final SubLObject lower = cycl_utilities.formula_arg1( interval, UNPROVIDED );
        final SubLObject upper = cycl_utilities.formula_arg2( interval, UNPROVIDED );
        final SubLObject unit = cycl_utilities.formula_arg0( interval );
        final SubLObject duration = cycl_utilities.formula_arg5( gaf, UNPROVIDED );
        final SubLObject duration_unit = cycl_utilities.formula_arg0( duration );
        final SubLObject pred = cycl_utilities.formula_arg6( gaf, UNPROVIDED );
        final SubLObject new_query = ConsesLow.list( $const15$isa, entity, previous_col );
        if( NIL == conses_high.member( previous_col, done_lst, Symbols.symbol_function( EQUAL ), UNPROVIDED ) )
        {
          done_lst = ConsesLow.cons( previous_col, done_lst );
          if( pred.eql( $const59$startingPointForAssertion ) )
          {
            SubLObject cdotimes_end_var;
            SubLObject count;
            SubLObject duration_for_query;
            SubLObject duration_for_query_in_correct_unit;
            SubLObject query_result;
            SubLObject diff;
            SubLObject time_elapsed_since_start;
            SubLObject time_elapsed;
            SubLObject prob_1;
            SubLObject persis_prob;
            SubLObject justifications_1;
            SubLObject prob_2;
            for( cdotimes_end_var = Numbers.subtract( upper, lower ), count = NIL, count = ZERO_INTEGER; count.numL( cdotimes_end_var ); count = Numbers.add( count, ONE_INTEGER ) )
            {
              duration_for_query = ConsesLow.list( unit, Numbers.add( count, lower ) );
              duration_for_query_in_correct_unit = convert_to_unit( duration_for_query, duration_unit );
              query_result = bindings.variable_lookup( $sym28$_X, cycl_utilities.formula_arg0( mt_context.ask_mt_query( ConsesLow.list( $const51$evaluate, $sym28$_X, ConsesLow.list( $const60$DateBeforeFn, time,
                  duration_for_query ) ), UNPROVIDED, UNPROVIDED, UNPROVIDED ) ) );
              diff = cycl_utilities.formula_arg1( bindings.variable_lookup( $sym28$_X, cycl_utilities.formula_arg0( mt_context.ask_mt_query( ConsesLow.list( $const51$evaluate, $sym28$_X, ConsesLow.list(
                  $const61$DifferenceFn, duration_for_query_in_correct_unit, duration ) ), UNPROVIDED, UNPROVIDED, UNPROVIDED ) ) ), UNPROVIDED );
              if( !diff.numL( Numbers.subtract( lower, ONE_INTEGER ) ) && diff.numL( upper ) )
              {
                time_elapsed_since_start = find_time_elapsed( query_result, query_result );
                time_elapsed = duration_for_query_in_correct_unit;
                prob_1 = calculate_probability_of_transition_to_state( time_elapsed, all_assertions, duration, time_elapsed_since_start );
                if( NIL != prob_1 )
                {
                  thread.resetMultipleValues();
                  persis_prob = get_persistence_likelihood_for_fact_at_time( new_query, query_result, T, $mt_for_temporal_projection$.getDynamicValue( thread ), T, depth_of_recursion );
                  justifications_1 = thread.secondMultipleValue();
                  thread.resetMultipleValues();
                  if( NIL != persis_prob )
                  {
                    prob_2 = cycl_utilities.formula_arg1( persis_prob, UNPROVIDED );
                    if( NIL == sum_of_probabilities )
                    {
                      sum_of_probabilities = ZERO_INTEGER;
                    }
                    justifications = ConsesLow.append( justifications, justifications_1 );
                    justifications = ConsesLow.append( justifications, ConsesLow.list( assertion ) );
                    sum_of_probabilities = Numbers.add( sum_of_probabilities, Numbers.multiply( prob_1, prob_2 ) );
                  }
                }
              }
            }
          }
        }
        cdolist_list_var2 = cdolist_list_var2.rest();
        assertion = cdolist_list_var2.first();
      }
      if( NIL != sum_of_probabilities )
      {
        return Values.values( sum_of_probabilities, justifications );
      }
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/temporal-projection-cols.lisp", position = 84142L)
  public static SubLObject check_cardinality_of_collection(final SubLObject fact, final SubLObject time)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject cdolist_list_var;
    final SubLObject all_assertions = cdolist_list_var = kb_mapping_utilities.pred_value_gafs_in_any_mt( cycl_utilities.formula_arg2( fact, UNPROVIDED ), $const65$maximumCardinalityOfCollection, ONE_INTEGER,
        UNPROVIDED );
    SubLObject assertion = NIL;
    assertion = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      final SubLObject gaf = assertions_high.gaf_formula( assertion );
      final SubLObject number_of_instances = cycl_utilities.formula_arg2( gaf, UNPROVIDED );
      thread.resetMultipleValues();
      final SubLObject result = check_number_of_instances( fact, number_of_instances, time );
      final SubLObject justifications = thread.secondMultipleValue();
      thread.resetMultipleValues();
      if( NIL != result )
      {
        return Values.values( result, ConsesLow.append( ConsesLow.list( assertion ), justifications ) );
      }
      cdolist_list_var = cdolist_list_var.rest();
      assertion = cdolist_list_var.first();
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/temporal-projection-cols.lisp", position = 84839L)
  public static SubLObject check_number_of_instances(final SubLObject fact, final SubLObject number_of_instances, final SubLObject time)
  {
    final SubLObject col = cycl_utilities.formula_arg2( fact, UNPROVIDED );
    SubLObject justifications = NIL;
    SubLObject instances_satisfying_cons = NIL;
    final SubLObject entity = cycl_utilities.formula_arg1( fact, UNPROVIDED );
    SubLObject cdolist_list_var;
    final SubLObject all_bindings = cdolist_list_var = mt_context.ask_mt_query( ConsesLow.listS( $const66$decayDistributionForAssertionInIn, ConsesLow.list( $const15$isa, $sym28$_X, col ), $list67 ), UNPROVIDED,
        UNPROVIDED, UNPROVIDED );
    SubLObject binding = NIL;
    binding = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      final SubLObject person = bindings.variable_lookup( $sym28$_X, binding );
      final SubLObject date = bindings.variable_lookup( $sym68$_DATE, binding );
      final SubLObject interval = bindings.variable_lookup( $sym69$_INTERVAL, binding );
      if( !person.equal( entity ) && NIL == mt_context.ask_mt_query( ConsesLow.list( $const62$laterThan, date, time ), UNPROVIDED, UNPROVIDED, UNPROVIDED ) && NIL != time_falls_in_interval( date, time, interval,
          UNPROVIDED ) )
      {
        final SubLObject supporting_assertion = get_assertion_for_predicate_of_arity_four( $const66$decayDistributionForAssertionInIn, ConsesLow.list( $const15$isa, person, col ), date, interval, $list70 );
        if( NIL != supporting_assertion )
        {
          justifications = ConsesLow.append( ConsesLow.list( supporting_assertion ), justifications );
        }
        instances_satisfying_cons = ConsesLow.cons( person, instances_satisfying_cons );
      }
      cdolist_list_var = cdolist_list_var.rest();
      binding = cdolist_list_var.first();
    }
    if( !Sequences.length( instances_satisfying_cons ).numL( number_of_instances ) )
    {
      return Values.values( T, justifications );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/temporal-projection-cols.lisp", position = 86244L)
  public static SubLObject use_event_calculus_to_find_likelihood(final SubLObject fact, final SubLObject time)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject time_line = create_timeline_for_assertion( fact );
    thread.resetMultipleValues();
    final SubLObject dist = check_boundary_conditions( fact, time, time_line );
    final SubLObject tm = thread.secondMultipleValue();
    SubLObject justifications = thread.thirdMultipleValue();
    thread.resetMultipleValues();
    if( NIL != dist )
    {
      return Values.values( dist, tm, justifications );
    }
    thread.resetMultipleValues();
    final SubLObject time_1 = find_closest_time_around_time_point( time, time_line );
    final SubLObject time_2 = thread.secondMultipleValue();
    thread.resetMultipleValues();
    if( NIL == time_1 )
    {
      if( cycl_utilities.formula_arg1( time_2, UNPROVIDED ).eql( $sym8$E ) )
      {
        thread.resetMultipleValues();
        final SubLObject dist2 = handle_decay_distribution_for_specs( fact, time );
        SubLObject tm2 = thread.secondMultipleValue();
        SubLObject justifications2 = thread.thirdMultipleValue();
        thread.resetMultipleValues();
        if( NIL == tm2 )
        {
          tm2 = find_time_elapsed( cycl_utilities.formula_arg0( time_2 ), time );
          justifications2 = ConsesLow.append( justifications2, plausibility_utilities.hl_justify_asent_fast( ConsesLow.list( $const2$endingPointOfIntervalForSentence, fact, cycl_utilities.formula_arg0( time_2 ) ),
              $mt_for_temporal_projection$.getDynamicValue( thread ) ) );
          justifications2 = ConsesLow.append( justifications2, plausibility_utilities.hl_justify_asent_fast( ConsesLow.list( $const21$timeElapsed, cycl_utilities.formula_arg0( time_2 ), time, tm2 ),
              $mt_for_temporal_projection$.getDynamicValue( thread ) ) );
        }
        return Values.values( dist2, tm2, justifications2 );
      }
      if( cycl_utilities.formula_arg1( time_2, UNPROVIDED ).eql( $sym9$S ) )
      {
        justifications = NIL;
        justifications = ConsesLow.append( justifications, plausibility_utilities.hl_justify_asent_fast( ConsesLow.list( $const1$startingPointOfIntervalForSentenc, fact, cycl_utilities.formula_arg0( time_1 ) ),
            $mt_for_temporal_projection$.getDynamicValue( thread ) ) );
        return Values.values( narts_high.find_nart( $uniform_distribution_with_value_zero$.getDynamicValue( thread ) ), NIL, justifications );
      }
    }
    if( NIL != time_1 && NIL != time_2 )
    {
      if( cycl_utilities.formula_arg1( time_1, UNPROVIDED ).eql( $sym9$S ) && cycl_utilities.formula_arg1( time_2, UNPROVIDED ).eql( $sym8$E ) )
      {
        justifications = NIL;
        justifications = ConsesLow.append( justifications, plausibility_utilities.hl_justify_asent_fast( ConsesLow.list( $const2$endingPointOfIntervalForSentence, fact, cycl_utilities.formula_arg0( time_2 ) ),
            $mt_for_temporal_projection$.getDynamicValue( thread ) ) );
        justifications = ConsesLow.append( justifications, plausibility_utilities.hl_justify_asent_fast( ConsesLow.list( $const1$startingPointOfIntervalForSentenc, fact, cycl_utilities.formula_arg0( time_1 ) ),
            $mt_for_temporal_projection$.getDynamicValue( thread ) ) );
        return Values.values( narts_high.find_nart( $uniform_distribution_with_value_one$.getDynamicValue( thread ) ), NIL, justifications );
      }
      if( cycl_utilities.formula_arg1( time_1, UNPROVIDED ).eql( $sym8$E ) && cycl_utilities.formula_arg1( time_2, UNPROVIDED ).eql( $sym9$S ) )
      {
        justifications = NIL;
        justifications = ConsesLow.append( justifications, plausibility_utilities.hl_justify_asent_fast( ConsesLow.list( $const2$endingPointOfIntervalForSentence, fact, cycl_utilities.formula_arg0( time_1 ) ),
            $mt_for_temporal_projection$.getDynamicValue( thread ) ) );
        justifications = ConsesLow.append( justifications, plausibility_utilities.hl_justify_asent_fast( ConsesLow.list( $const1$startingPointOfIntervalForSentenc, fact, cycl_utilities.formula_arg0( time_2 ) ),
            $mt_for_temporal_projection$.getDynamicValue( thread ) ) );
        return Values.values( narts_high.find_nart( $uniform_distribution_with_value_zero$.getDynamicValue( thread ) ), NIL, justifications );
      }
    }
    if( NIL == time_2 )
    {
      if( cycl_utilities.formula_arg1( time_1, UNPROVIDED ).eql( $sym8$E ) )
      {
        justifications = NIL;
        justifications = ConsesLow.append( justifications, plausibility_utilities.hl_justify_asent_fast( ConsesLow.list( $const2$endingPointOfIntervalForSentence, fact, cycl_utilities.formula_arg0( time_1 ) ),
            $mt_for_temporal_projection$.getDynamicValue( thread ) ) );
        return Values.values( narts_high.find_nart( $uniform_distribution_with_value_zero$.getDynamicValue( thread ) ), NIL, justifications );
      }
      if( cycl_utilities.formula_arg1( time_1, UNPROVIDED ).eql( $sym9$S ) )
      {
        justifications = NIL;
        justifications = ConsesLow.append( justifications, plausibility_utilities.hl_justify_asent_fast( ConsesLow.list( $const1$startingPointOfIntervalForSentenc, fact, cycl_utilities.formula_arg0( time_2 ) ),
            $mt_for_temporal_projection$.getDynamicValue( thread ) ) );
        return Values.values( narts_high.find_nart( $uniform_distribution_with_value_one$.getDynamicValue( thread ) ), NIL, justifications );
      }
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/temporal-projection-cols.lisp", position = 89867L)
  public static SubLObject use_conditional_likelihood(final SubLObject fact, final SubLObject time)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject all_assertions = kb_mapping_utilities.pred_value_gafs_in_any_mt( cycl_utilities.formula_arg2( fact, UNPROVIDED ), $const71$conditionalProbabilityForCollecti, TWO_INTEGER, UNPROVIDED );
    final SubLObject all_assertions_2 = kb_mapping_utilities.pred_value_gafs_in_any_mt( cycl_utilities.formula_arg2( fact, UNPROVIDED ), $const72$conditionalProbabilityForCollecti, TWO_INTEGER, UNPROVIDED );
    SubLObject justifications = NIL;
    SubLObject cdolist_list_var = all_assertions;
    SubLObject assertion_1 = NIL;
    assertion_1 = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      SubLObject cdolist_list_var_$23 = all_assertions_2;
      SubLObject assertion_2 = NIL;
      assertion_2 = cdolist_list_var_$23.first();
      while ( NIL != cdolist_list_var_$23)
      {
        final SubLObject gaf_1 = assertions_high.gaf_formula( assertion_1 );
        final SubLObject new_query = ConsesLow.list( $const15$isa, cycl_utilities.formula_arg1( fact, UNPROVIDED ), cycl_utilities.formula_arg1( gaf_1, UNPROVIDED ) );
        final SubLObject gaf_2 = assertions_high.gaf_formula( assertion_2 );
        thread.resetMultipleValues();
        final SubLObject prob = get_persistence_likelihood_for_fact_at_time( new_query, time, T, $mt_for_temporal_projection$.getDynamicValue( thread ), T, UNPROVIDED );
        final SubLObject justification_1 = thread.secondMultipleValue();
        thread.resetMultipleValues();
        if( NIL != prob )
        {
          final SubLObject prob_1 = cycl_utilities.formula_arg1( prob, UNPROVIDED );
          final SubLObject prob_2 = cycl_utilities.formula_arg3( gaf_1, UNPROVIDED );
          final SubLObject prob_3 = cycl_utilities.formula_arg3( gaf_2, UNPROVIDED );
          if( prob_1.numE( ZERO_INTEGER ) || prob_1.numE( ONE_INTEGER ) )
          {
            justifications = ConsesLow.append( justifications, ConsesLow.list( assertion_1 ) );
            justifications = ConsesLow.append( justifications, justification_1 );
            return Values.values( Numbers.multiply( prob_1, prob_2 ), justifications );
          }
          if( NIL != prob_1 && NIL != prob_2 && NIL != prob_3 )
          {
            justifications = ConsesLow.append( justifications, ConsesLow.list( assertion_1 ) );
            justifications = ConsesLow.append( justifications, ConsesLow.list( assertion_2 ) );
            justifications = ConsesLow.append( justifications, justification_1 );
            return Values.values( Numbers.add( Numbers.multiply( prob_1, prob_2 ), Numbers.multiply( Numbers.subtract( ONE_INTEGER, prob_1 ), prob_3 ) ), justifications );
          }
        }
        cdolist_list_var_$23 = cdolist_list_var_$23.rest();
        assertion_2 = cdolist_list_var_$23.first();
      }
      cdolist_list_var = cdolist_list_var.rest();
      assertion_1 = cdolist_list_var.first();
    }
    final SubLObject all_assertions_3 = kb_mapping_utilities.pred_value_gafs_in_any_mt( cycl_utilities.formula_arg2( fact, UNPROVIDED ), $const72$conditionalProbabilityForCollecti, TWO_INTEGER, UNPROVIDED );
    SubLObject justifications2 = NIL;
    SubLObject cdolist_list_var2 = all_assertions_3;
    SubLObject assertion_3 = NIL;
    assertion_3 = cdolist_list_var2.first();
    while ( NIL != cdolist_list_var2)
    {
      final SubLObject gaf_3 = assertions_high.gaf_formula( assertion_3 );
      final SubLObject new_query2 = ConsesLow.list( $const15$isa, cycl_utilities.formula_arg1( fact, UNPROVIDED ), cycl_utilities.formula_arg1( gaf_3, UNPROVIDED ) );
      thread.resetMultipleValues();
      final SubLObject prob2 = get_persistence_likelihood_for_fact_at_time( new_query2, time, T, $mt_for_temporal_projection$.getDynamicValue( thread ), T, UNPROVIDED );
      final SubLObject justification_2 = thread.secondMultipleValue();
      thread.resetMultipleValues();
      if( NIL != prob2 )
      {
        final SubLObject prob_4 = Numbers.subtract( ONE_INTEGER, cycl_utilities.formula_arg1( prob2, UNPROVIDED ) );
        final SubLObject prob_5 = cycl_utilities.formula_arg3( gaf_3, UNPROVIDED );
        if( prob_4.numE( ONE_INTEGER ) )
        {
          justifications2 = ConsesLow.append( justifications2, ConsesLow.list( assertion_3 ) );
          justifications2 = ConsesLow.append( justifications2, justification_2 );
          return Values.values( Numbers.multiply( prob_4, prob_5 ), justifications2 );
        }
      }
      cdolist_list_var2 = cdolist_list_var2.rest();
      assertion_3 = cdolist_list_var2.first();
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/temporal-projection-cols.lisp", position = 92528L)
  public static SubLObject handle_delay_between_collections(final SubLObject fact, final SubLObject time)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject all_assertions = kb_mapping_utilities.pred_value_gafs_in_any_mt( cycl_utilities.formula_arg2( fact, UNPROVIDED ), $const73$delayBetweenCollections, TWO_INTEGER, UNPROVIDED );
    SubLObject results = NIL;
    SubLObject cdolist_list_var = all_assertions;
    SubLObject assertion = NIL;
    assertion = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      final SubLObject gaf = assertions_high.gaf_formula( assertion );
      final SubLObject new_query = ConsesLow.list( $const15$isa, cycl_utilities.formula_arg1( fact, UNPROVIDED ), cycl_utilities.formula_arg1( gaf, UNPROVIDED ) );
      final SubLObject starting_time_for_assertions = mt_context.ask_mt_query( ConsesLow.listS( $const59$startingPointForAssertion, new_query, $list40 ), UNPROVIDED, UNPROVIDED, UNPROVIDED );
      final SubLObject dist = cycl_utilities.formula_arg4( gaf, UNPROVIDED );
      final SubLObject interval = cycl_utilities.formula_arg3( gaf, UNPROVIDED );
      SubLObject cdolist_list_var_$24 = starting_time_for_assertions;
      SubLObject starting_time = NIL;
      starting_time = cdolist_list_var_$24.first();
      while ( NIL != cdolist_list_var_$24)
      {
        final SubLObject starting_time_for_assertion = bindings.variable_lookup( $sym28$_X, starting_time );
        if( NIL != time_falls_in_interval( starting_time_for_assertion, time, interval, UNPROVIDED ) )
        {
          final SubLObject time_elapsed = find_time_elapsed( time, starting_time_for_assertion );
          $temporal_projection_justifications$.setDynamicValue( ConsesLow.append( $temporal_projection_justifications$.getDynamicValue( thread ), ConsesLow.list( assertion ) ), thread );
          $temporal_projection_justifications$.setDynamicValue( ConsesLow.append( $temporal_projection_justifications$.getDynamicValue( thread ), plausibility_utilities.hl_justify_asent_fast( ConsesLow.list(
              $const59$startingPointForAssertion, new_query, starting_time_for_assertion ), $const44$EverythingPSC ) ), thread );
          $temporal_projection_justifications$.setDynamicValue( ConsesLow.append( $temporal_projection_justifications$.getDynamicValue( thread ), plausibility_utilities.hl_justify_asent_fast( ConsesLow.list(
              $const21$timeElapsed, time, starting_time_for_assertion, time_elapsed ), $const44$EverythingPSC ) ), thread );
          results = ConsesLow.cons( calculate_persistence_likelihood( time_elapsed, dist ), results );
        }
        cdolist_list_var_$24 = cdolist_list_var_$24.rest();
        starting_time = cdolist_list_var_$24.first();
      }
      cdolist_list_var = cdolist_list_var.rest();
      assertion = cdolist_list_var.first();
    }
    if( NIL != results )
    {
      return Sequences.creduce( Symbols.symbol_function( $sym74$MAX ), results, UNPROVIDED, UNPROVIDED, UNPROVIDED );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/temporal-projection-cols.lisp", position = 94174L)
  public static SubLObject handle_default_decay_distribution_for_collection_in_interval(final SubLObject fact, final SubLObject time)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject all_assertions = kb_mapping_utilities.pred_value_gafs_in_any_mt( cycl_utilities.formula_arg2( fact, UNPROVIDED ), $const75$defaultDecayFunctionForCollection, ONE_INTEGER, UNPROVIDED );
    SubLObject justifications = NIL;
    SubLObject cdolist_list_var = all_assertions;
    SubLObject assertion = NIL;
    assertion = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      final SubLObject gaf = assertions_high.gaf_formula( assertion );
      final SubLObject interval = cycl_utilities.formula_arg2( gaf, UNPROVIDED );
      final SubLObject dist = cycl_utilities.formula_arg3( gaf, UNPROVIDED );
      SubLObject cdolist_list_var_$25;
      final SubLObject list_of_times = cdolist_list_var_$25 = get_list_of_times_for_assertion( fact );
      SubLObject time_of_assertion = NIL;
      time_of_assertion = cdolist_list_var_$25.first();
      while ( NIL != cdolist_list_var_$25)
      {
        SubLObject time_of_fact = get_last_time_point_of( time_of_assertion );
        if( NIL != time_falls_in_interval( time_of_fact, time, interval, UNPROVIDED ) )
        {
          final SubLObject time_elapsed = find_time_elapsed( time, time_of_fact );
          justifications = ConsesLow.append( justifications, plausibility_utilities.hl_justify_asent_fast( ConsesLow.list( $const21$timeElapsed, time, time_of_fact, time_elapsed ), $mt_for_temporal_projection$
              .getDynamicValue( thread ) ) );
          justifications = ConsesLow.append( justifications, ConsesLow.list( assertion ) );
          final SubLObject supporting_assertion = get_assertion_for_given_fact_and_time( fact, time_of_assertion );
          if( NIL != supporting_assertion )
          {
            justifications = ConsesLow.append( justifications, ConsesLow.list( supporting_assertion ) );
          }
          return Values.values( dist, time_elapsed, justifications );
        }
        time_of_fact = get_first_time_point_of( time_of_assertion );
        if( NIL != time_falls_in_interval( time, time_of_fact, interval, UNPROVIDED ) )
        {
          final SubLObject time_elapsed = find_time_elapsed( time, time_of_fact );
          justifications = ConsesLow.append( justifications, plausibility_utilities.hl_justify_asent_fast( ConsesLow.list( $const21$timeElapsed, time, time_of_fact, time_elapsed ), $mt_for_temporal_projection$
              .getDynamicValue( thread ) ) );
          justifications = ConsesLow.append( justifications, ConsesLow.list( assertion ) );
          final SubLObject supporting_assertion = get_assertion_for_given_fact_and_time( fact, time_of_assertion );
          if( NIL != supporting_assertion )
          {
            justifications = ConsesLow.append( justifications, ConsesLow.list( supporting_assertion ) );
          }
          return Values.values( dist, time_elapsed, justifications );
        }
        cdolist_list_var_$25 = cdolist_list_var_$25.rest();
        time_of_assertion = cdolist_list_var_$25.first();
      }
      cdolist_list_var = cdolist_list_var.rest();
      assertion = cdolist_list_var.first();
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/temporal-projection-cols.lisp", position = 96429L)
  public static SubLObject handle_temporal_relation_between_collections(final SubLObject fact, final SubLObject time)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject all_assertions = kb_mapping_utilities.pred_value_gafs_in_any_mt( cycl_utilities.formula_arg2( fact, UNPROVIDED ), $const76$temporalRelationBetweenCollection, THREE_INTEGER, UNPROVIDED );
    SubLObject justifications = NIL;
    SubLObject cdolist_list_var = all_assertions;
    SubLObject assertion = NIL;
    assertion = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      final SubLObject gaf = assertions_high.gaf_formula( assertion );
      final SubLObject decay_fn = cycl_utilities.formula_arg4( gaf, UNPROVIDED );
      final SubLObject new_query = ConsesLow.list( $const15$isa, cycl_utilities.formula_arg1( fact, UNPROVIDED ), cycl_utilities.formula_arg2( gaf, UNPROVIDED ) );
      SubLObject cdolist_list_var_$26;
      final SubLObject list_of_times = cdolist_list_var_$26 = get_list_of_times_for_assertion( new_query );
      SubLObject time_of_fact = NIL;
      time_of_fact = cdolist_list_var_$26.first();
      while ( NIL != cdolist_list_var_$26)
      {
        thread.resetMultipleValues();
        final SubLObject result = verify_temporal_relation( cycl_utilities.formula_arg1( gaf, UNPROVIDED ), time_of_fact, time );
        final SubLObject justification_1 = thread.secondMultipleValue();
        thread.resetMultipleValues();
        if( NIL != result )
        {
          justifications = ConsesLow.append( justifications, ConsesLow.list( assertion ) );
          justifications = ConsesLow.append( justifications, justification_1 );
          final SubLObject assertion_for_conflicting_fact = get_assertion_for_given_fact_and_time( new_query, time_of_fact );
          final SubLObject time_elapsed = find_time_elapsed( time, time_of_fact );
          if( NIL == mt_context.ask_mt_query( ConsesLow.listS( $const15$isa, decay_fn, $list77 ), UNPROVIDED, UNPROVIDED, UNPROVIDED ) )
          {
            justifications = ConsesLow.append( justifications, plausibility_utilities.hl_justify_asent_fast( ConsesLow.list( $const21$timeElapsed, time_of_fact, time, time_elapsed ), $mt_for_temporal_projection$
                .getDynamicValue( thread ) ) );
          }
          if( NIL != assertion_for_conflicting_fact )
          {
            justifications = ConsesLow.append( justifications, ConsesLow.list( assertion_for_conflicting_fact ) );
          }
          return Values.values( decay_fn, time_elapsed, justifications );
        }
        cdolist_list_var_$26 = cdolist_list_var_$26.rest();
        time_of_fact = cdolist_list_var_$26.first();
      }
      cdolist_list_var = cdolist_list_var.rest();
      assertion = cdolist_list_var.first();
    }
    all_assertions = kb_mapping_utilities.pred_value_gafs_in_any_mt( cycl_utilities.formula_arg2( fact, UNPROVIDED ), $const76$temporalRelationBetweenCollection, TWO_INTEGER, UNPROVIDED );
    justifications = NIL;
    cdolist_list_var = all_assertions;
    assertion = NIL;
    assertion = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      final SubLObject gaf = assertions_high.gaf_formula( assertion );
      final SubLObject decay_fn = cycl_utilities.formula_arg4( gaf, UNPROVIDED );
      final SubLObject new_query = ConsesLow.list( $const15$isa, cycl_utilities.formula_arg1( fact, UNPROVIDED ), cycl_utilities.formula_arg3( gaf, UNPROVIDED ) );
      SubLObject cdolist_list_var_$27;
      final SubLObject list_of_times = cdolist_list_var_$27 = get_list_of_times_for_assertion( new_query );
      SubLObject time_of_fact = NIL;
      time_of_fact = cdolist_list_var_$27.first();
      while ( NIL != cdolist_list_var_$27)
      {
        thread.resetMultipleValues();
        final SubLObject result = verify_temporal_relation( cycl_utilities.formula_arg1( gaf, UNPROVIDED ), time, time_of_fact );
        final SubLObject justification_1 = thread.secondMultipleValue();
        thread.resetMultipleValues();
        if( NIL != result )
        {
          justifications = ConsesLow.append( justifications, ConsesLow.list( assertion ) );
          justifications = ConsesLow.append( justifications, justification_1 );
          final SubLObject assertion_for_conflicting_fact = get_assertion_for_given_fact_and_time( new_query, time_of_fact );
          final SubLObject time_elapsed = find_time_elapsed( time, time_of_fact );
          if( NIL == mt_context.ask_mt_query( ConsesLow.listS( $const15$isa, decay_fn, $list77 ), UNPROVIDED, UNPROVIDED, UNPROVIDED ) )
          {
            justifications = ConsesLow.append( justifications, plausibility_utilities.hl_justify_asent_fast( ConsesLow.list( $const21$timeElapsed, time_of_fact, time, time_elapsed ), $mt_for_temporal_projection$
                .getDynamicValue( thread ) ) );
          }
          if( NIL != assertion_for_conflicting_fact )
          {
            justifications = ConsesLow.append( justifications, ConsesLow.list( assertion_for_conflicting_fact ) );
          }
          return Values.values( decay_fn, time_elapsed, justifications );
        }
        cdolist_list_var_$27 = cdolist_list_var_$27.rest();
        time_of_fact = cdolist_list_var_$27.first();
      }
      cdolist_list_var = cdolist_list_var.rest();
      assertion = cdolist_list_var.first();
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/temporal-projection-cols.lisp", position = 99570L)
  public static SubLObject handle_decay_distribution_for_collection_in_interval_when_instance_in_spec(final SubLObject fact, final SubLObject time)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject arg1_entity = cycl_utilities.formula_arg1( fact, UNPROVIDED );
    final SubLObject all_assertions = kb_mapping_utilities.pred_value_gafs_in_any_mt( cycl_utilities.formula_arg2( fact, UNPROVIDED ), $const78$decayDistributionForCollectionInI, UNPROVIDED, UNPROVIDED );
    SubLObject set_of_all_consistent_assertions = NIL;
    SubLObject cdolist_list_var = all_assertions;
    SubLObject assertion = NIL;
    assertion = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      final SubLObject gaf = assertions_high.gaf_formula( assertion );
      if( NIL != isa.isa_in_any_mtP( arg1_entity, cycl_utilities.formula_arg2( gaf, UNPROVIDED ) ) )
      {
        final SubLObject pred = cycl_utilities.formula_arg3( gaf, UNPROVIDED );
        final SubLObject time_point_1 = bindings.variable_lookup( $sym28$_X, cycl_utilities.formula_arg0( mt_context.ask_mt_query( ConsesLow.listS( pred, arg1_entity, $list40 ), UNPROVIDED, UNPROVIDED, UNPROVIDED ) ) );
        final SubLObject interval = cycl_utilities.formula_arg4( gaf, UNPROVIDED );
        if( NIL != time_point_1 && NIL != time_falls_in_interval( time_point_1, time, interval, UNPROVIDED ) )
        {
          set_of_all_consistent_assertions = ConsesLow.cons( assertion, set_of_all_consistent_assertions );
        }
      }
      cdolist_list_var = cdolist_list_var.rest();
      assertion = cdolist_list_var.first();
    }
    final SubLObject most_specific_assertion = find_most_specific_assertion( set_of_all_consistent_assertions );
    if( NIL != most_specific_assertion )
    {
      final SubLObject gaf2 = assertions_high.gaf_formula( most_specific_assertion );
      final SubLObject decay_fn = cycl_utilities.formula_arg5( gaf2, UNPROVIDED );
      final SubLObject pred2 = cycl_utilities.formula_arg3( gaf2, UNPROVIDED );
      final SubLObject time_point_2 = bindings.variable_lookup( $sym28$_X, cycl_utilities.formula_arg0( mt_context.ask_mt_query( ConsesLow.listS( pred2, arg1_entity, $list40 ), UNPROVIDED, UNPROVIDED, UNPROVIDED ) ) );
      final SubLObject time_elapsed = find_time_elapsed( time_point_2, time );
      $temporal_projection_justifications$.setDynamicValue( ConsesLow.append( $temporal_projection_justifications$.getDynamicValue( thread ), ConsesLow.list( most_specific_assertion ) ), thread );
      $temporal_projection_justifications$.setDynamicValue( ConsesLow.append( $temporal_projection_justifications$.getDynamicValue( thread ), plausibility_utilities.hl_justify_asent_fast( ConsesLow.list( pred2,
          arg1_entity, time_point_2 ), $mt_for_temporal_projection$.getDynamicValue( thread ) ) ), thread );
      $temporal_projection_justifications$.setDynamicValue( ConsesLow.append( $temporal_projection_justifications$.getDynamicValue( thread ), plausibility_utilities.hl_justify_asent_fast( ConsesLow.list(
          $const21$timeElapsed, time_point_2, time, time_elapsed ), $mt_for_temporal_projection$.getDynamicValue( thread ) ) ), thread );
      return Values.values( decay_fn, time_elapsed );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/temporal-projection-cols.lisp", position = 101545L)
  public static SubLObject handle_default_decay_distribution_for_collection(final SubLObject fact)
  {
    final SubLObject all_assertions = kb_mapping_utilities.pred_value_gafs_in_any_mt( cycl_utilities.formula_arg2( fact, UNPROVIDED ), $const79$defaultDecayDistributionForCollec, ONE_INTEGER, UNPROVIDED );
    if( NIL != all_assertions )
    {
      final SubLObject cdolist_list_var = all_assertions;
      SubLObject assertion = NIL;
      assertion = cdolist_list_var.first();
      if( NIL != cdolist_list_var )
      {
        final SubLObject gaf = assertions_high.gaf_formula( assertion );
        return cycl_utilities.formula_arg2( gaf, UNPROVIDED );
      }
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/temporal-projection-cols.lisp", position = 101950L)
  public static SubLObject handle_default_decay_distribution_for_collection_backwards(final SubLObject fact, final SubLObject time)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject all_assertions = kb_mapping_utilities.pred_value_gafs_in_any_mt( cycl_utilities.formula_arg2( fact, UNPROVIDED ), $const80$defaultDecayFunctionForCollection, UNPROVIDED, UNPROVIDED );
    SubLObject justifications = NIL;
    final SubLObject list_of_times = get_list_of_times_for_assertion( fact );
    SubLObject cdolist_list_var = all_assertions;
    SubLObject assertion = NIL;
    assertion = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      SubLObject cdolist_list_var_$28 = list_of_times;
      SubLObject time_of_assertion = NIL;
      time_of_assertion = cdolist_list_var_$28.first();
      while ( NIL != cdolist_list_var_$28)
      {
        final SubLObject gaf = assertions_high.gaf_formula( assertion );
        final SubLObject time_of_fact = get_first_time_point_of( time_of_assertion );
        final SubLObject dist = cycl_utilities.formula_arg2( gaf, UNPROVIDED );
        SubLObject time_elapsed = NIL;
        thread.resetMultipleValues();
        final SubLObject result = at_least_one_point_is_later_thanP( time_of_fact, time );
        final SubLObject justification_for_temporal_subsumption = thread.secondMultipleValue();
        thread.resetMultipleValues();
        if( NIL != result )
        {
          justifications = ConsesLow.append( justifications, ConsesLow.list( assertion ) );
          justifications = ConsesLow.append( justifications, justification_for_temporal_subsumption );
          final SubLObject supporting_fact = get_assertion_for_given_fact_and_time( fact, time_of_assertion );
          if( NIL != supporting_fact )
          {
            justifications = ConsesLow.append( justifications, ConsesLow.list( supporting_fact ) );
          }
          if( NIL == isa.isa_in_any_mtP( dist, $const81$ConstantFunction ) )
          {
            time_elapsed = find_time_elapsed( time, time_of_fact );
            justifications = ConsesLow.append( justifications, plausibility_utilities.hl_justify_asent_fast( ConsesLow.list( $const21$timeElapsed, time, time_of_fact, time_elapsed ), $mt_for_temporal_projection$
                .getDynamicValue( thread ) ) );
          }
          return Values.values( dist, time_elapsed, justifications );
        }
        cdolist_list_var_$28 = cdolist_list_var_$28.rest();
        time_of_assertion = cdolist_list_var_$28.first();
      }
      cdolist_list_var = cdolist_list_var.rest();
      assertion = cdolist_list_var.first();
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/temporal-projection-cols.lisp", position = 103565L)
  public static SubLObject handle_decay_distribution_for_collection_forward(final SubLObject fact, final SubLObject time, final SubLObject time_of_fact)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject all_assertions = kb_mapping_utilities.pred_value_gafs_in_any_mt( cycl_utilities.formula_arg2( fact, UNPROVIDED ), $const82$defaultDecayFunctionForCollection, UNPROVIDED, UNPROVIDED );
    SubLObject justifications = NIL;
    SubLObject cdolist_list_var = all_assertions;
    SubLObject assertion = NIL;
    assertion = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      final SubLObject gaf = assertions_high.gaf_formula( assertion );
      thread.resetMultipleValues();
      final SubLObject result = at_least_one_point_is_before_thanP( time_of_fact, time );
      final SubLObject justification_for_temporal_subsumption = thread.secondMultipleValue();
      thread.resetMultipleValues();
      if( NIL != result )
      {
        justifications = ConsesLow.append( justifications, ConsesLow.list( assertion ) );
        justifications = ConsesLow.append( justifications, justification_for_temporal_subsumption );
        final SubLObject supporting_fact = get_assertion_for_given_fact_and_time( fact, time_of_fact );
        if( NIL != supporting_fact )
        {
          justifications = ConsesLow.append( justifications, ConsesLow.list( supporting_fact ) );
        }
        return Values.values( cycl_utilities.formula_arg2( gaf, UNPROVIDED ), justifications );
      }
      cdolist_list_var = cdolist_list_var.rest();
      assertion = cdolist_list_var.first();
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/temporal-projection-cols.lisp", position = 104578L)
  public static SubLObject handle_decay_distribution_for_specs_collection(final SubLObject fact, final SubLObject time)
  {
    SubLObject cdolist_list_var;
    final SubLObject all_bindings = cdolist_list_var = mt_context.ask_mt_query( $list83, UNPROVIDED, UNPROVIDED, UNPROVIDED );
    SubLObject binding = NIL;
    binding = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      final SubLObject arg1 = bindings.variable_lookup( $sym28$_X, binding );
      final SubLObject arg2 = bindings.variable_lookup( $sym29$_Y, binding );
      final SubLObject predicate = bindings.variable_lookup( $sym32$_Z, binding );
      final SubLObject decay_fn = bindings.variable_lookup( $sym84$_W, binding );
      if( NIL != isa.isa_in_any_mtP( cycl_utilities.formula_arg1( fact, UNPROVIDED ), arg2 ) && NIL != isa.isa_in_any_mtP( cycl_utilities.formula_arg2( fact, UNPROVIDED ), arg1 ) )
      {
        final SubLObject query = ConsesLow.listS( predicate, fact, $list40 );
        final SubLObject query_answer = bindings.variable_lookup( $sym28$_X, cycl_utilities.formula_arg0( mt_context.ask_mt_query( query, UNPROVIDED, UNPROVIDED, UNPROVIDED ) ) );
        if( NIL != query_answer )
        {
          final SubLObject time_elapsed = find_time_elapsed( time, query_answer );
          return Values.values( decay_fn, time_elapsed );
        }
        if( NIL == query_answer )
        {
          return Values.values( decay_fn, NIL );
        }
      }
      cdolist_list_var = cdolist_list_var.rest();
      binding = cdolist_list_var.first();
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/temporal-projection-cols.lisp", position = 105604L)
  public static SubLObject handle_decay_distribution_for_collection_in_interval_backwards(final SubLObject fact, final SubLObject time)
  {
    SubLObject cdolist_list_var;
    final SubLObject all_assertions = cdolist_list_var = kb_mapping_utilities.pred_value_gafs_in_any_mt( cycl_utilities.formula_arg2( fact, UNPROVIDED ), $const85$decayFunctionForCollectionInInter, UNPROVIDED,
        UNPROVIDED );
    SubLObject assertion = NIL;
    assertion = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      final SubLObject gaf = assertions_high.gaf_formula( assertion );
      final SubLObject pred = cycl_utilities.formula_arg2( gaf, UNPROVIDED );
      final SubLObject arg_1_entity = cycl_utilities.formula_arg1( fact, UNPROVIDED );
      final SubLObject time_point_1 = bindings.variable_lookup( $sym28$_X, cycl_utilities.formula_arg0( mt_context.ask_mt_query( ConsesLow.listS( pred, arg_1_entity, $list40 ), UNPROVIDED, UNPROVIDED, UNPROVIDED ) ) );
      final SubLObject interval = cycl_utilities.formula_arg3( gaf, UNPROVIDED );
      final SubLObject time_elapsed_since_pred = find_time_elapsed( time_point_1, time );
      if( NIL != time_point_1 && NIL != mt_context.ask_mt_query( ConsesLow.list( $const62$laterThan, time_point_1, time ), UNPROVIDED, UNPROVIDED, UNPROVIDED ) && NIL != time_falls_in_interval( time, time_point_1,
          interval, UNPROVIDED ) )
      {
        return Values.values( cycl_utilities.formula_arg4( gaf, UNPROVIDED ), time_elapsed_since_pred );
      }
      cdolist_list_var = cdolist_list_var.rest();
      assertion = cdolist_list_var.first();
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/temporal-projection-cols.lisp", position = 106588L)
  public static SubLObject handle_decay_distribution_for_assertion_in_interval(final SubLObject fact, final SubLObject time)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject all_bindings = mt_context.ask_mt_query( ConsesLow.listS( $const66$decayDistributionForAssertionInIn, fact, $list31 ), NIL, NIL, T );
    SubLObject lst_of_applicable_distributions = NIL;
    SubLObject justifications = NIL;
    SubLObject cdolist_list_var = all_bindings;
    SubLObject binding = NIL;
    binding = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      final SubLObject starting_time = bindings.variable_lookup( $sym28$_X, binding );
      final SubLObject decay_fn = bindings.variable_lookup( $sym32$_Z, binding );
      final SubLObject interval = bindings.variable_lookup( $sym29$_Y, binding );
      if( NIL != starting_time && NIL == mt_context.ask_mt_query( ConsesLow.list( $const62$laterThan, starting_time, time ), NIL, NIL, T ) )
      {
        final SubLObject time_elapsed = find_time_elapsed( starting_time, time );
        if( NIL != time_falls_in_interval( starting_time, time, interval, time_elapsed ) )
        {
          final SubLObject supporting_assertion = get_assertion_for_predicate_of_arity_four( $const66$decayDistributionForAssertionInIn, fact, starting_time, interval, decay_fn );
          if( NIL != supporting_assertion )
          {
            justifications = ConsesLow.append( ConsesLow.list( supporting_assertion ), justifications );
          }
          justifications = ConsesLow.append( justifications, plausibility_utilities.hl_justify_asent_fast( ConsesLow.list( $const21$timeElapsed, starting_time, time, time_elapsed ), $mt_for_temporal_projection$
              .getDynamicValue( thread ) ) );
          lst_of_applicable_distributions = ConsesLow.cons( ConsesLow.list( time_elapsed, decay_fn, starting_time ), lst_of_applicable_distributions );
        }
      }
      cdolist_list_var = cdolist_list_var.rest();
      binding = cdolist_list_var.first();
    }
    if( Sequences.length( lst_of_applicable_distributions ).numE( ONE_INTEGER ) )
    {
      final SubLObject entry = cycl_utilities.formula_arg0( lst_of_applicable_distributions );
      return Values.values( calculate_persistence_likelihood( cycl_utilities.formula_arg0( entry ), cycl_utilities.formula_arg1( entry, UNPROVIDED ) ), justifications );
    }
    return Values.values( find_persistence_by_combining_evidence( lst_of_applicable_distributions ), justifications );
  }

  @SubLTranslatedFile.SubL(source = "cycl/temporal-projection-cols.lisp", position = 108351L)
  public static SubLObject handle_decay_distribution_for_assertion_in_interval_backwards(final SubLObject fact, final SubLObject time)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject all_bindings = mt_context.ask_mt_query( ConsesLow.listS( $const86$decayDistributionForAssertionInIn, fact, $list31 ), NIL, NIL, T );
    SubLObject lst_of_applicable_distributions = NIL;
    SubLObject justifications = NIL;
    SubLObject cdolist_list_var = all_bindings;
    SubLObject binding = NIL;
    binding = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      final SubLObject starting_time = bindings.variable_lookup( $sym28$_X, binding );
      final SubLObject decay_fn = bindings.variable_lookup( $sym32$_Z, binding );
      final SubLObject interval = bindings.variable_lookup( $sym29$_Y, binding );
      if( NIL != starting_time && NIL == mt_context.ask_mt_query( ConsesLow.list( $const62$laterThan, time, starting_time ), NIL, NIL, T ) )
      {
        final SubLObject time_elapsed = find_time_elapsed( starting_time, time );
        if( NIL != time_falls_in_interval( time, starting_time, interval, time_elapsed ) )
        {
          final SubLObject supporting_assertion = get_assertion_for_predicate_of_arity_four( $const86$decayDistributionForAssertionInIn, fact, starting_time, interval, decay_fn );
          if( NIL != supporting_assertion )
          {
            justifications = ConsesLow.append( ConsesLow.list( supporting_assertion ), justifications );
          }
          justifications = ConsesLow.append( justifications, plausibility_utilities.hl_justify_asent_fast( ConsesLow.list( $const21$timeElapsed, starting_time, time, time_elapsed ), $mt_for_temporal_projection$
              .getDynamicValue( thread ) ) );
          lst_of_applicable_distributions = ConsesLow.cons( ConsesLow.list( time_elapsed, decay_fn, starting_time ), lst_of_applicable_distributions );
        }
      }
      cdolist_list_var = cdolist_list_var.rest();
      binding = cdolist_list_var.first();
    }
    if( Sequences.length( lst_of_applicable_distributions ).numE( ONE_INTEGER ) )
    {
      final SubLObject entry = cycl_utilities.formula_arg0( lst_of_applicable_distributions );
      return Values.values( calculate_persistence_likelihood( cycl_utilities.formula_arg0( entry ), cycl_utilities.formula_arg1( entry, UNPROVIDED ) ), justifications );
    }
    return Values.values( find_persistence_by_combining_evidence( lst_of_applicable_distributions ), justifications );
  }

  @SubLTranslatedFile.SubL(source = "cycl/temporal-projection-cols.lisp", position = 110136L)
  public static SubLObject check_time_subsumption(final SubLObject predicate, final SubLObject time, final SubLObject lower, final SubLObject upper)
  {
    final SubLObject query = ConsesLow.list( predicate, $sym28$_X, time );
    final SubLObject query_answer = bindings.variable_lookup( $sym28$_X, cycl_utilities.formula_arg0( mt_context.ask_mt_query( query, UNPROVIDED, UNPROVIDED, UNPROVIDED ) ) );
    if( predicate.eql( $const87$hourNumberOfDate ) && lower.numE( ZERO_INTEGER ) && upper.numE( $int88$23 ) )
    {
      return T;
    }
    if( NIL == query_answer )
    {
      return NIL;
    }
    if( lower.numL( query_answer ) && upper.numG( query_answer ) )
    {
      return T;
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/temporal-projection-cols.lisp", position = 110664L)
  public static SubLObject handle_decay_distribution_for_assertion_causal(final SubLObject fact, final SubLObject time)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject all_bindings = mt_context.ask_mt_query( ConsesLow.listS( $const89$decayDistributionForAssertion_Cau, fact, $list27 ), UNPROVIDED, UNPROVIDED, UNPROVIDED );
    SubLObject results = NIL;
    SubLObject cdolist_list_var = all_bindings;
    SubLObject binding = NIL;
    binding = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      final SubLObject cause = bindings.variable_lookup( $sym28$_X, binding );
      final SubLObject decay_fn = bindings.variable_lookup( $sym29$_Y, binding );
      final SubLObject starting_time = bindings.variable_lookup( $sym28$_X, cycl_utilities.formula_arg0( mt_context.ask_mt_query( ConsesLow.listS( $const50$startingDate, cause, $list40 ), UNPROVIDED, UNPROVIDED,
          UNPROVIDED ) ) );
      final SubLObject ending_time = bindings.variable_lookup( $sym28$_X, cycl_utilities.formula_arg0( mt_context.ask_mt_query( ConsesLow.listS( $const90$endingDate, cause, $list40 ), UNPROVIDED, UNPROVIDED,
          UNPROVIDED ) ) );
      if( NIL != starting_time && NIL == mt_context.ask_mt_query( ConsesLow.list( $const62$laterThan, starting_time, time ), UNPROVIDED, UNPROVIDED, UNPROVIDED ) && NIL != ending_time )
      {
        if( NIL != mt_context.ask_mt_query( ConsesLow.list( $const62$laterThan, ending_time, time ), UNPROVIDED, UNPROVIDED, UNPROVIDED ) )
        {
          results = ConsesLow.cons( ONE_INTEGER, results );
        }
        final SubLObject time_elapsed = find_time_elapsed( ending_time, time );
        final SubLObject assertion = get_assertion_for_ternary_predicates( $const89$decayDistributionForAssertion_Cau, fact, cause, decay_fn );
        $temporal_projection_justifications$.setDynamicValue( ConsesLow.append( $temporal_projection_justifications$.getDynamicValue( thread ), ConsesLow.list( assertion ) ), thread );
        $temporal_projection_justifications$.setDynamicValue( ConsesLow.append( $temporal_projection_justifications$.getDynamicValue( thread ), plausibility_utilities.hl_justify_asent_fast( ConsesLow.list(
            $const50$startingDate, cause, starting_time ), $mt_for_temporal_projection$.getDynamicValue( thread ) ) ), thread );
        if( NIL == conses_high.member( ONE_INTEGER, results, UNPROVIDED, UNPROVIDED ) )
        {
          $temporal_projection_justifications$.setDynamicValue( ConsesLow.append( $temporal_projection_justifications$.getDynamicValue( thread ), plausibility_utilities.hl_justify_asent_fast( ConsesLow.list(
              $const21$timeElapsed, ending_time, time, time_elapsed ), $mt_for_temporal_projection$.getDynamicValue( thread ) ) ), thread );
        }
        $temporal_projection_justifications$.setDynamicValue( ConsesLow.append( $temporal_projection_justifications$.getDynamicValue( thread ), plausibility_utilities.hl_justify_asent_fast( ConsesLow.list(
            $const90$endingDate, cause, ending_time ), $mt_for_temporal_projection$.getDynamicValue( thread ) ) ), thread );
        results = ConsesLow.cons( calculate_persistence_likelihood( time_elapsed, decay_fn ), results );
      }
      cdolist_list_var = cdolist_list_var.rest();
      binding = cdolist_list_var.first();
    }
    if( NIL != results )
    {
      return Sequences.creduce( Symbols.symbol_function( $sym74$MAX ), results, UNPROVIDED, UNPROVIDED, UNPROVIDED );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/temporal-projection-cols.lisp", position = 112818L)
  public static SubLObject handle_decay_distribution_for_collection_when_time_in_interval(final SubLObject fact, final SubLObject time)
  {
    SubLObject cdolist_list_var;
    final SubLObject all_bindings = cdolist_list_var = mt_context.ask_mt_query( $list91, UNPROVIDED, UNPROVIDED, UNPROVIDED );
    SubLObject binding = NIL;
    binding = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      SubLObject col = bindings.variable_lookup( $sym92$_COL, binding );
      if( NIL != nart_handles.nart_p( col ) )
      {
        col = narts_high.nart_hl_formula( col );
      }
      if( col.equal( cycl_utilities.formula_arg2( fact, UNPROVIDED ) ) )
      {
        final SubLObject pred = bindings.variable_lookup( $sym28$_X, binding );
        final SubLObject time_point = bindings.variable_lookup( $sym29$_Y, binding );
        final SubLObject dist = bindings.variable_lookup( $sym32$_Z, binding );
        if( NIL != check_temporal_relation( pred, time_point, time ) )
        {
          final SubLObject time_elapsed = find_time_elapsed( time_point, time );
          return Values.values( dist, time_elapsed );
        }
      }
      cdolist_list_var = cdolist_list_var.rest();
      binding = cdolist_list_var.first();
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/temporal-projection-cols.lisp", position = 113645L)
  public static SubLObject check_temporal_relation(final SubLObject predicate, final SubLObject time_point, final SubLObject time)
  {
    if( NIL != nart_handles.nart_p( predicate ) )
    {
      final SubLObject hl_formula = narts_high.nart_hl_formula( predicate );
      if( cycl_utilities.formula_arg0( hl_formula ).eql( $const93$InverseBinaryPredicateFn ) )
      {
        final SubLObject p = cycl_utilities.formula_arg1( hl_formula, UNPROVIDED );
        return mt_context.ask_mt_query( ConsesLow.list( p, time, time_point ), UNPROVIDED, UNPROVIDED, UNPROVIDED );
      }
    }
    return mt_context.ask_mt_query( ConsesLow.list( predicate, time_point, time ), UNPROVIDED, UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/temporal-projection-cols.lisp", position = 114588L)
  public static SubLObject get_persistence_likelihood_for_fact_at_time(final SubLObject fact, final SubLObject time, SubLObject justifyP, SubLObject mt, SubLObject recursiveP, SubLObject depth_of_recursion)
  {
    if( justifyP == UNPROVIDED )
    {
      justifyP = NIL;
    }
    if( mt == UNPROVIDED )
    {
      mt = $const44$EverythingPSC;
    }
    if( recursiveP == UNPROVIDED )
    {
      recursiveP = NIL;
    }
    if( depth_of_recursion == UNPROVIDED )
    {
      depth_of_recursion = ZERO_INTEGER;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    $mt_for_temporal_projection$.setDynamicValue( mt, thread );
    if( NIL == recursiveP )
    {
      $temporal_projection_justifications$.setDynamicValue( NIL, thread );
      $temporal_projection_answers$.setDynamicValue( NIL, thread );
      $temporal_projection_stack$.setDynamicValue( NIL, thread );
    }
    if( NIL != recursive_temporal_projection_queryP( fact, time ) )
    {
      return get_already_computed_answers( fact, time );
    }
    if( NIL != recursiveP )
    {
      depth_of_recursion = Numbers.add( depth_of_recursion, ONE_INTEGER );
      if( depth_of_recursion.numG( THREE_INTEGER ) )
      {
        return NIL;
      }
    }
    thread.resetMultipleValues();
    SubLObject result = check_always_trueP( fact );
    SubLObject justifications = thread.secondMultipleValue();
    thread.resetMultipleValues();
    if( NIL != result )
    {
      return Values.values( result, justifications );
    }
    $temporal_projection_stack$.setDynamicValue( ConsesLow.cons( ConsesLow.list( fact, time ), $temporal_projection_stack$.getDynamicValue( thread ) ), thread );
    if( cycl_utilities.formula_arg0( fact ).eql( $const15$isa ) )
    {
      thread.resetMultipleValues();
      result = get_persistence_of_isa_assertion( fact, time, depth_of_recursion );
      justifications = thread.secondMultipleValue();
      thread.resetMultipleValues();
      $temporal_projection_answers$.setDynamicValue( ConsesLow.cons( ConsesLow.list( fact, time, result, justifications ), $temporal_projection_answers$.getDynamicValue( thread ) ), thread );
      return Values.values( result, ConsesLow.append( justifications, $temporal_projection_justifications$.getDynamicValue( thread ) ) );
    }
    thread.resetMultipleValues();
    result = get_persistence_of_non_isa_assertion( fact, time, depth_of_recursion );
    justifications = thread.secondMultipleValue();
    thread.resetMultipleValues();
    $temporal_projection_answers$.setDynamicValue( ConsesLow.cons( ConsesLow.list( fact, time, result, justifications ), $temporal_projection_answers$.getDynamicValue( thread ) ), thread );
    return Values.values( result, ConsesLow.append( justifications, $temporal_projection_justifications$.getDynamicValue( thread ) ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/temporal-projection-cols.lisp", position = 116058L)
  public static SubLObject get_persistence_of_isa_assertion(final SubLObject fact, final SubLObject time, final SubLObject depth_of_recursion)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL == check_starting_times( fact, time ) )
    {
      return el_utilities.make_unary_formula( $const22$NumericLikelihoodFn, ZERO_INTEGER );
    }
    thread.resetMultipleValues();
    SubLObject result = check_ending_times( fact, time );
    SubLObject justifications = thread.secondMultipleValue();
    thread.resetMultipleValues();
    if( NIL != result )
    {
      return Values.values( el_utilities.make_unary_formula( $const22$NumericLikelihoodFn, ZERO_INTEGER ), justifications );
    }
    thread.resetMultipleValues();
    result = check_fact_true_at_point( fact, time );
    justifications = thread.secondMultipleValue();
    thread.resetMultipleValues();
    if( NIL != result )
    {
      return Values.values( el_utilities.make_unary_formula( $const22$NumericLikelihoodFn, ONE_INTEGER ), justifications );
    }
    thread.resetMultipleValues();
    result = check_isa_fact_false_at_point( fact, time );
    justifications = thread.secondMultipleValue();
    thread.resetMultipleValues();
    if( NIL != result )
    {
      return Values.values( el_utilities.make_unary_formula( $const22$NumericLikelihoodFn, ZERO_INTEGER ), justifications );
    }
    thread.resetMultipleValues();
    result = check_cardinality_of_collection( fact, time );
    justifications = thread.secondMultipleValue();
    thread.resetMultipleValues();
    if( NIL != result )
    {
      return Values.values( el_utilities.make_unary_formula( $const22$NumericLikelihoodFn, ZERO_INTEGER ), justifications );
    }
    thread.resetMultipleValues();
    SubLObject likelihood = collect_evidence_from_rules( fact, time, depth_of_recursion );
    justifications = thread.secondMultipleValue();
    thread.resetMultipleValues();
    if( likelihood.isNumber() && !likelihood.numG( ONE_INTEGER ) )
    {
      return Values.values( el_utilities.make_unary_formula( $const22$NumericLikelihoodFn, likelihood ), justifications );
    }
    thread.resetMultipleValues();
    likelihood = use_conditional_likelihood( fact, time );
    justifications = thread.secondMultipleValue();
    thread.resetMultipleValues();
    if( likelihood.isNumber() && !likelihood.numG( ONE_INTEGER ) )
    {
      return Values.values( el_utilities.make_unary_formula( $const22$NumericLikelihoodFn, likelihood ), justifications );
    }
    thread.resetMultipleValues();
    likelihood = use_risk_analysis( fact, time );
    justifications = thread.secondMultipleValue();
    thread.resetMultipleValues();
    if( likelihood.isNumber() && !likelihood.numG( ONE_INTEGER ) )
    {
      return Values.values( el_utilities.make_unary_formula( $const22$NumericLikelihoodFn, likelihood ), justifications );
    }
    thread.resetMultipleValues();
    likelihood = find_probability_of_event_occurrence( fact, time );
    justifications = thread.secondMultipleValue();
    thread.resetMultipleValues();
    if( likelihood.isNumber() && !likelihood.numG( ONE_INTEGER ) )
    {
      return Values.values( el_utilities.make_unary_formula( $const22$NumericLikelihoodFn, likelihood ), justifications );
    }
    thread.resetMultipleValues();
    likelihood = find_probability_of_end_of_event( fact, time, depth_of_recursion );
    justifications = thread.secondMultipleValue();
    thread.resetMultipleValues();
    if( likelihood.isNumber() && !likelihood.numG( ONE_INTEGER ) )
    {
      return Values.values( el_utilities.make_unary_formula( $const22$NumericLikelihoodFn, likelihood ), justifications );
    }
    final SubLObject time_1 = get_mt_time_for_assertion( fact );
    if( NIL != time )
    {
      SubLObject likelihood2 = NIL;
      thread.resetMultipleValues();
      final SubLObject relevant_decay_function = find_decay_function_for_collection( fact, time, time_1 );
      final SubLObject time_elapsed = thread.secondMultipleValue();
      final SubLObject justifications2 = thread.thirdMultipleValue();
      thread.resetMultipleValues();
      likelihood2 = calculate_persistence_likelihood( time_elapsed, relevant_decay_function );
      if( likelihood2.isNumber() && !likelihood2.numG( ONE_INTEGER ) )
      {
        return Values.values( el_utilities.make_unary_formula( $const22$NumericLikelihoodFn, likelihood2 ), justifications2 );
      }
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/temporal-projection-cols.lisp", position = 118976L)
  public static SubLObject get_persistence_of_non_isa_assertion(final SubLObject fact, final SubLObject time, final SubLObject depth_of_recursion)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    thread.resetMultipleValues();
    SubLObject result = check_starting_times( fact, time );
    final SubLObject justification = thread.secondMultipleValue();
    thread.resetMultipleValues();
    if( NIL == result )
    {
      return Values.values( el_utilities.make_unary_formula( $const22$NumericLikelihoodFn, ZERO_INTEGER ), justification );
    }
    thread.resetMultipleValues();
    result = check_ending_times( fact, time );
    SubLObject justifications = thread.secondMultipleValue();
    thread.resetMultipleValues();
    if( NIL != result )
    {
      return Values.values( el_utilities.make_unary_formula( $const22$NumericLikelihoodFn, ZERO_INTEGER ), justifications );
    }
    thread.resetMultipleValues();
    result = check_fact_true_at_point( fact, time );
    justifications = thread.secondMultipleValue();
    thread.resetMultipleValues();
    if( NIL != result )
    {
      return Values.values( el_utilities.make_unary_formula( $const22$NumericLikelihoodFn, ONE_INTEGER ), justifications );
    }
    thread.resetMultipleValues();
    final SubLObject prob = use_causal_analysis_to_find_likelihood( fact, time );
    justifications = thread.secondMultipleValue();
    thread.resetMultipleValues();
    if( NIL != prob && !prob.numG( ONE_INTEGER ) )
    {
      return Values.values( el_utilities.make_unary_formula( $const22$NumericLikelihoodFn, prob ), justifications );
    }
    thread.resetMultipleValues();
    final SubLObject likelihood = collect_evidence_from_rules( fact, time, depth_of_recursion );
    justifications = thread.secondMultipleValue();
    thread.resetMultipleValues();
    if( likelihood.isNumber() && !likelihood.numG( ONE_INTEGER ) )
    {
      return Values.values( el_utilities.make_unary_formula( $const22$NumericLikelihoodFn, likelihood ), justifications );
    }
    final SubLObject time_1 = get_mt_time_for_assertion( fact );
    if( NIL != time )
    {
      final SubLObject time_elapsed = bindings.variable_lookup( $sym28$_X, cycl_utilities.formula_arg0( mt_context.ask_mt_query( ConsesLow.listS( $const21$timeElapsed, time_1, time, $list40 ), UNPROVIDED, UNPROVIDED,
          UNPROVIDED ) ) );
      SubLObject likelihood2 = NIL;
      thread.resetMultipleValues();
      final SubLObject relevant_decay_function = find_decay_function_for_fact( fact, time_elapsed, time );
      final SubLObject tm = thread.secondMultipleValue();
      final SubLObject justifications2 = thread.thirdMultipleValue();
      thread.resetMultipleValues();
      if( NIL != tm )
      {
        likelihood2 = calculate_persistence_likelihood( tm, relevant_decay_function );
      }
      else
      {
        likelihood2 = calculate_persistence_likelihood( time_elapsed, relevant_decay_function );
      }
      if( likelihood2.isNumber() && !likelihood2.numG( ONE_INTEGER ) )
      {
        return Values.values( el_utilities.make_unary_formula( $const22$NumericLikelihoodFn, likelihood2 ), justifications2 );
      }
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/temporal-projection-cols.lisp", position = 120974L)
  public static SubLObject collect_evidence_from_rules(final SubLObject fact, final SubLObject time, final SubLObject depth_of_recursion)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject pred = cycl_utilities.formula_arg0( fact );
    if( pred.eql( $const15$isa ) )
    {
      SubLObject ret_value = handle_delay_between_collections( fact, time );
      if( NIL != ret_value )
      {
        return ret_value;
      }
      thread.resetMultipleValues();
      ret_value = find_transition_probability( fact, time, depth_of_recursion );
      SubLObject justifications = thread.secondMultipleValue();
      thread.resetMultipleValues();
      if( NIL != ret_value )
      {
        return Values.values( ret_value, justifications );
      }
      thread.resetMultipleValues();
      ret_value = handle_decay_distribution_for_assertion_in_interval( fact, time );
      justifications = thread.secondMultipleValue();
      thread.resetMultipleValues();
      if( NIL != ret_value )
      {
        return Values.values( ret_value, justifications );
      }
    }
    thread.resetMultipleValues();
    SubLObject ret_value = handle_decay_distribution_for_assertion_in_interval_backwards( fact, time );
    SubLObject justifications = thread.secondMultipleValue();
    thread.resetMultipleValues();
    if( NIL != ret_value )
    {
      return Values.values( ret_value, justifications );
    }
    thread.resetMultipleValues();
    ret_value = handle_decay_distribution_for_assertion_causal( fact, time );
    justifications = thread.secondMultipleValue();
    thread.resetMultipleValues();
    if( NIL != ret_value )
    {
      Values.values( ret_value, justifications );
    }
    if( pred.eql( $const15$isa ) )
    {
      thread.resetMultipleValues();
      ret_value = handle_distribution_for_termination_of_membership( fact, time );
      justifications = thread.secondMultipleValue();
      thread.resetMultipleValues();
      if( NIL != ret_value )
      {
        return Values.values( ret_value, justifications );
      }
    }
    if( cycl_utilities.formula_arg0( fact ).eql( $const95$dateOfEvent ) || cycl_utilities.formula_arg0( fact ).eql( $const50$startingDate ) )
    {
      thread.resetMultipleValues();
      final SubLObject dist = check_delay_between_start_of_event_types_in_sit_type( fact );
      final SubLObject tm = thread.secondMultipleValue();
      final SubLObject justifications2 = thread.thirdMultipleValue();
      thread.resetMultipleValues();
      if( NIL != dist )
      {
        return Values.values( dist, tm, justifications2 );
      }
    }
    if( cycl_utilities.formula_arg0( fact ).eql( $const96$endsDuring ) )
    {
      thread.resetMultipleValues();
      final SubLObject dist = check_duration_of_event_type( fact );
      final SubLObject tm = thread.secondMultipleValue();
      final SubLObject justifications2 = thread.thirdMultipleValue();
      thread.resetMultipleValues();
      if( NIL != dist )
      {
        return Values.values( dist, tm, justifications2 );
      }
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/temporal-projection-cols.lisp", position = 122842L)
  public static SubLObject find_decay_function_for_collection(final SubLObject fact, final SubLObject time, final SubLObject time_of_fact)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    thread.resetMultipleValues();
    SubLObject dist = use_event_calculus_to_find_likelihood( fact, time );
    SubLObject tm = thread.secondMultipleValue();
    SubLObject justifications = thread.thirdMultipleValue();
    thread.resetMultipleValues();
    if( NIL != dist )
    {
      return Values.values( dist, tm, justifications );
    }
    thread.resetMultipleValues();
    dist = handle_temporal_relation_between_collections( fact, time );
    tm = thread.secondMultipleValue();
    justifications = thread.thirdMultipleValue();
    thread.resetMultipleValues();
    if( NIL != dist )
    {
      return Values.values( dist, tm, justifications );
    }
    thread.resetMultipleValues();
    dist = handle_default_decay_distribution_for_collection_backwards( fact, time );
    tm = thread.secondMultipleValue();
    justifications = thread.thirdMultipleValue();
    thread.resetMultipleValues();
    if( NIL != dist )
    {
      return Values.values( dist, tm, justifications );
    }
    thread.resetMultipleValues();
    dist = handle_decay_distribution_for_collection_in_interval_when_instance_in_spec( fact, time );
    tm = thread.secondMultipleValue();
    justifications = thread.thirdMultipleValue();
    thread.resetMultipleValues();
    if( NIL != dist )
    {
      return Values.values( dist, tm, justifications );
    }
    thread.resetMultipleValues();
    dist = handle_decay_distribution_for_collection_when_time_in_interval( fact, time );
    tm = thread.secondMultipleValue();
    thread.resetMultipleValues();
    if( NIL != dist )
    {
      return Values.values( dist, tm );
    }
    SubLObject ret_value = handle_decay_distribution_for_collection_in_interval_backwards( fact, time );
    if( NIL != ret_value )
    {
      return ret_value;
    }
    thread.resetMultipleValues();
    dist = handle_decay_distribution_for_specs_collection( fact, time );
    tm = thread.secondMultipleValue();
    justifications = thread.thirdMultipleValue();
    thread.resetMultipleValues();
    if( NIL != dist )
    {
      return Values.values( dist, tm, justifications );
    }
    ret_value = handle_default_decay_distribution_for_collection( fact );
    if( NIL != ret_value )
    {
      return ret_value;
    }
    thread.resetMultipleValues();
    dist = handle_temporal_interpolation_function_for_collection( fact, time );
    tm = thread.secondMultipleValue();
    justifications = thread.thirdMultipleValue();
    thread.resetMultipleValues();
    if( NIL != dist )
    {
      return Values.values( dist, tm, justifications );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/temporal-projection-cols.lisp", position = 124633L)
  public static SubLObject find_decay_function_for_fact(final SubLObject fact, final SubLObject time_elapsed, final SubLObject time)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    thread.resetMultipleValues();
    SubLObject dist = use_event_calculus_to_find_likelihood( fact, time );
    SubLObject tm = thread.secondMultipleValue();
    SubLObject justifications = thread.thirdMultipleValue();
    thread.resetMultipleValues();
    if( NIL != dist )
    {
      return Values.values( dist, tm, justifications );
    }
    thread.resetMultipleValues();
    dist = handle_decay_distribution_for_assertion_in_time_interval( fact, time );
    tm = thread.secondMultipleValue();
    justifications = thread.thirdMultipleValue();
    thread.resetMultipleValues();
    if( NIL != dist )
    {
      return Values.values( dist, tm, justifications );
    }
    SubLObject cdolist_list_var;
    SubLObject all_assertions = cdolist_list_var = kb_mapping_utilities.pred_value_gafs_in_any_mt( cycl_utilities.formula_arg0( fact ), $const97$decayFunctionForPredicateInInterv, ONE_INTEGER, UNPROVIDED );
    SubLObject assertion = NIL;
    assertion = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      final SubLObject gaf = assertions_high.gaf_formula( assertion );
      if( cycl_utilities.formula_arg2( gaf, UNPROVIDED ).numE( ONE_INTEGER ) )
      {
        final SubLObject pred = cycl_utilities.formula_arg3( gaf, UNPROVIDED );
        final SubLObject arg_1_entity = cycl_utilities.formula_arg1( fact, UNPROVIDED );
        final SubLObject time_point_1 = bindings.variable_lookup( $sym28$_X, cycl_utilities.formula_arg0( mt_context.ask_mt_query( ConsesLow.listS( pred, arg_1_entity, $list40 ), UNPROVIDED, UNPROVIDED, UNPROVIDED ) ) );
        final SubLObject interval = cycl_utilities.formula_arg4( gaf, UNPROVIDED );
        if( NIL != time_point_1 && NIL != time_falls_in_interval( time_point_1, time, interval, UNPROVIDED ) )
        {
          return cycl_utilities.formula_arg5( gaf, UNPROVIDED );
        }
      }
      if( cycl_utilities.formula_arg2( gaf, UNPROVIDED ).numE( TWO_INTEGER ) )
      {
        final SubLObject pred = cycl_utilities.formula_arg3( gaf, UNPROVIDED );
        final SubLObject arg_2_entity = cycl_utilities.formula_arg2( fact, UNPROVIDED );
        final SubLObject time_point_1 = bindings.variable_lookup( $sym28$_X, cycl_utilities.formula_arg0( mt_context.ask_mt_query( ConsesLow.listS( pred, arg_2_entity, $list40 ), UNPROVIDED, UNPROVIDED, UNPROVIDED ) ) );
        final SubLObject interval = cycl_utilities.formula_arg4( gaf, UNPROVIDED );
        if( NIL != time_point_1 && NIL != time_falls_in_interval( time_point_1, time, interval, UNPROVIDED ) )
        {
          return cycl_utilities.formula_arg5( gaf, UNPROVIDED );
        }
      }
      cdolist_list_var = cdolist_list_var.rest();
      assertion = cdolist_list_var.first();
    }
    all_assertions = kb_mapping_utilities.pred_value_gafs_in_any_mt( cycl_utilities.formula_arg0( fact ), $const98$decayFunctionForSpecsInInterval, ONE_INTEGER, UNPROVIDED );
    final SubLObject arg_1_entity2 = cycl_utilities.formula_arg1( fact, UNPROVIDED );
    final SubLObject arg_2_entity2 = cycl_utilities.formula_arg2( fact, UNPROVIDED );
    SubLObject cdolist_list_var2 = all_assertions;
    SubLObject assertion2 = NIL;
    assertion2 = cdolist_list_var2.first();
    while ( NIL != cdolist_list_var2)
    {
      final SubLObject gaf2 = assertions_high.gaf_formula( assertion2 );
      if( cycl_utilities.formula_arg3( gaf2, UNPROVIDED ).numE( TWO_INTEGER ) && NIL != isa.isa_in_any_mtP( arg_2_entity2, cycl_utilities.formula_arg2( gaf2, UNPROVIDED ) ) && NIL != time_elapsed_falls_in_interval(
          time_elapsed, cycl_utilities.formula_arg4( gaf2, UNPROVIDED ) ) )
      {
        return cycl_utilities.formula_arg5( gaf2, UNPROVIDED );
      }
      if( cycl_utilities.formula_arg3( gaf2, UNPROVIDED ).numE( ONE_INTEGER ) && NIL != isa.isa_in_any_mtP( arg_1_entity2, cycl_utilities.formula_arg2( gaf2, UNPROVIDED ) ) && NIL != time_elapsed_falls_in_interval(
          time_elapsed, cycl_utilities.formula_arg4( gaf2, UNPROVIDED ) ) )
      {
        return cycl_utilities.formula_arg5( gaf2, UNPROVIDED );
      }
      cdolist_list_var2 = cdolist_list_var2.rest();
      assertion2 = cdolist_list_var2.first();
    }
    thread.resetMultipleValues();
    dist = handle_decay_distribution_for_specs( fact, time );
    tm = thread.secondMultipleValue();
    justifications = thread.thirdMultipleValue();
    thread.resetMultipleValues();
    if( NIL != dist )
    {
      return Values.values( dist, tm, justifications );
    }
    all_assertions = ( cdolist_list_var = kb_mapping_utilities.pred_value_gafs_in_any_mt( cycl_utilities.formula_arg0( fact ), $const99$decayFunctionInInterval, UNPROVIDED, UNPROVIDED ) );
    assertion = NIL;
    assertion = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      final SubLObject gaf = assertions_high.gaf_formula( assertion );
      if( NIL != time_elapsed_falls_in_interval( time_elapsed, cycl_utilities.formula_arg2( gaf, UNPROVIDED ) ) )
      {
        return cycl_utilities.formula_arg3( gaf, UNPROVIDED );
      }
      cdolist_list_var = cdolist_list_var.rest();
      assertion = cdolist_list_var.first();
    }
    thread.resetMultipleValues();
    dist = handle_default_decay_function_for_predicate( fact, time );
    tm = thread.secondMultipleValue();
    justifications = thread.thirdMultipleValue();
    thread.resetMultipleValues();
    if( NIL != dist )
    {
      return Values.values( dist, tm, justifications );
    }
    thread.resetMultipleValues();
    dist = handle_default_decay_function_for_predicate_backwards( fact, time );
    tm = thread.secondMultipleValue();
    justifications = thread.thirdMultipleValue();
    thread.resetMultipleValues();
    if( NIL != dist )
    {
      return Values.values( dist, tm, justifications );
    }
    thread.resetMultipleValues();
    dist = handle_duration_weighted_decay_distribution( fact, time );
    tm = thread.secondMultipleValue();
    justifications = thread.thirdMultipleValue();
    thread.resetMultipleValues();
    if( NIL != dist )
    {
      return Values.values( dist, tm, justifications );
    }
    thread.resetMultipleValues();
    dist = handle_temporal_interpolation_function_for_predicate( fact, time );
    tm = thread.secondMultipleValue();
    justifications = thread.thirdMultipleValue();
    thread.resetMultipleValues();
    if( NIL != dist )
    {
      return Values.values( dist, tm, justifications );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/temporal-projection-cols.lisp", position = 128338L)
  public static SubLObject time_elapsed_falls_in_interval(final SubLObject time_elapsed, final SubLObject interval)
  {
    final SubLObject query_answer = cycl_utilities.formula_arg0( mt_context.ask_mt_query( ConsesLow.listS( $const100$intervalRange, interval, $list27 ), UNPROVIDED, UNPROVIDED, UNPROVIDED ) );
    final SubLObject lower = bindings.variable_lookup( $sym28$_X, query_answer );
    final SubLObject upper = bindings.variable_lookup( $sym29$_Y, query_answer );
    SubLObject lower_bound_test = NIL;
    SubLObject upper_bound_test = NIL;
    if( cycl_utilities.formula_arg1( upper, UNPROVIDED ).eql( $const101$PlusInfinity ) )
    {
      upper_bound_test = T;
    }
    if( NIL != mt_context.ask_mt_query( ConsesLow.list( $const102$lessThanOrEqualTo, lower, time_elapsed ), UNPROVIDED, UNPROVIDED, UNPROVIDED ) )
    {
      lower_bound_test = T;
    }
    if( NIL != mt_context.ask_mt_query( ConsesLow.list( $const56$lessThan, time_elapsed, upper ), UNPROVIDED, UNPROVIDED, UNPROVIDED ) )
    {
      upper_bound_test = T;
    }
    return makeBoolean( NIL != lower_bound_test && NIL != upper_bound_test );
  }

  @SubLTranslatedFile.SubL(source = "cycl/temporal-projection-cols.lisp", position = 129081L)
  public static SubLObject calculate_persistence_likelihood(final SubLObject time_elapsed, final SubLObject decay_function)
  {
    if( NIL == decay_function )
    {
      return NIL;
    }
    if( NIL == nart_handles.nart_p( decay_function ) )
    {
      return calculate_persistence_likelihood_from_non_narts( time_elapsed, decay_function );
    }
    if( cycl_utilities.formula_arg0( narts_high.nart_hl_formula( decay_function ) ).eql( $const103$ExponentialDecayDistributionWithI ) )
    {
      return calculate_persistence_for_exponential_decay_distribution_with_initial_value_fn( time_elapsed, decay_function );
    }
    if( cycl_utilities.formula_arg0( narts_high.nart_hl_formula( decay_function ) ).eql( $const104$ExponentialDecayDistributionWithI ) )
    {
      return calculate_persistence_for_exponential_decay_distribution_with_initial_and_final_value_fn( time_elapsed, decay_function );
    }
    if( cycl_utilities.formula_arg0( narts_high.nart_hl_formula( decay_function ) ).eql( $const105$BoundedExponentiallyIncreasingFun ) )
    {
      return calculate_persistence_for_bounded_exponentially_increasing_function_with_initial_value( time_elapsed, decay_function );
    }
    if( NIL != isa.isa_in_any_mtP( narts_high.nart_hl_formula( decay_function ), $const106$NormalDistribution ) )
    {
      return calculate_persistence_for_gaussian_decay_function( time_elapsed, decay_function );
    }
    if( NIL != isa.isa_in_any_mtP( narts_high.nart_hl_formula( decay_function ), $const81$ConstantFunction ) )
    {
      return calculate_persistence_for_constant_function( decay_function );
    }
    if( NIL != isa.isa_in_any_mtP( narts_high.nart_hl_formula( decay_function ), $const107$LinearlyDecreasingFunction ) )
    {
      return calculate_persistence_for_linear_decay_function( time_elapsed, decay_function );
    }
    if( NIL != isa.isa_in_any_mtP( narts_high.nart_hl_formula( decay_function ), $const108$ExponentiallyDecreasingFunction ) )
    {
      return calculate_persistence_for_exponential_decay_function( time_elapsed, decay_function );
    }
    if( NIL != isa.isa_in_any_mtP( narts_high.nart_hl_formula( decay_function ), $const109$BoundedExponentiallyIncreasingFun ) )
    {
      return calculate_persistence_for_bounded_exponentially_increasing_function( time_elapsed, decay_function );
    }
    if( NIL != isa.isa_in_any_mtP( narts_high.nart_hl_formula( decay_function ), $const110$LinearlyIncreasingFunction ) )
    {
      return calculate_persistence_for_linearly_increasing_function( time_elapsed, decay_function );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/temporal-projection-cols.lisp", position = 131233L)
  public static SubLObject calculate_persistence_likelihood_from_non_narts(final SubLObject time_elapsed, final SubLObject decay_function)
  {
    if( NIL == decay_function )
    {
      return NIL;
    }
    if( cycl_utilities.formula_arg0( decay_function ).eql( $const111$ExponentialDecayDistributionWithP ) )
    {
      return calculate_persistence_for_exponential_decay_function_scaled( time_elapsed, decay_function );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/temporal-projection-cols.lisp", position = 131590L)
  public static SubLObject calculate_persistence_for_exponential_decay_function(final SubLObject time_elapsed, final SubLObject decay_function)
  {
    final SubLObject v_answer = cycl_utilities.formula_arg0( mt_context.ask_mt_query( ConsesLow.listS( $const112$exponentialDecayDistributionWithP, decay_function, $list40 ), UNPROVIDED, UNPROVIDED, UNPROVIDED ) );
    final SubLObject parameter = bindings.variable_lookup( $sym28$_X, v_answer );
    final SubLObject unit_of_time_elapsed = cycl_utilities.formula_arg0( time_elapsed );
    final SubLObject parameter_2 = convert_to_unit( parameter, unit_of_time_elapsed );
    if( NIL == parameter_2 )
    {
      return NIL;
    }
    final SubLObject x = Numbers.divide( cycl_utilities.formula_arg1( time_elapsed, UNPROVIDED ), cycl_utilities.formula_arg1( parameter_2, UNPROVIDED ) );
    if( x.numG( $int113$50 ) )
    {
      return ZERO_INTEGER;
    }
    return Numbers.expt( $float114$2_71, Numbers.subtract( ZERO_INTEGER, x ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/temporal-projection-cols.lisp", position = 132201L)
  public static SubLObject calculate_persistence_for_exponential_decay_function_scaled(final SubLObject time_elapsed, final SubLObject decay_function)
  {
    final SubLObject parameter = cycl_utilities.formula_arg1( decay_function, UNPROVIDED );
    final SubLObject unit_of_time_elapsed = cycl_utilities.formula_arg0( time_elapsed );
    final SubLObject parameter_2 = convert_to_unit( parameter, unit_of_time_elapsed );
    if( NIL == parameter_2 )
    {
      return NIL;
    }
    final SubLObject x = Numbers.divide( cycl_utilities.formula_arg1( time_elapsed, UNPROVIDED ), cycl_utilities.formula_arg1( parameter_2, UNPROVIDED ) );
    if( x.numG( $int113$50 ) )
    {
      return ZERO_INTEGER;
    }
    return Numbers.expt( $float114$2_71, Numbers.subtract( ZERO_INTEGER, x ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/temporal-projection-cols.lisp", position = 132702L)
  public static SubLObject calculate_persistence_for_bounded_exponentially_increasing_function(final SubLObject time_elapsed, final SubLObject decay_fn)
  {
    final SubLObject v_answer = cycl_utilities.formula_arg0( mt_context.ask_mt_query( ConsesLow.list( $const115$boundedExponentiallyIncreasingFun, $sym28$_X, $sym29$_Y, decay_fn ), UNPROVIDED, UNPROVIDED, UNPROVIDED ) );
    final SubLObject parameter = bindings.variable_lookup( $sym28$_X, v_answer );
    final SubLObject upper_bound = bindings.variable_lookup( $sym29$_Y, v_answer );
    final SubLObject unit_of_time_elapsed = cycl_utilities.formula_arg0( time_elapsed );
    final SubLObject parameter_2 = convert_to_unit( parameter, unit_of_time_elapsed );
    if( NIL != parameter_2 && NIL != upper_bound )
    {
      final SubLObject x = Numbers.divide( cycl_utilities.formula_arg1( time_elapsed, UNPROVIDED ), cycl_utilities.formula_arg1( parameter_2, UNPROVIDED ) );
      return Numbers.multiply( upper_bound, Numbers.subtract( ONE_INTEGER, Numbers.expt( $float114$2_71, Numbers.subtract( ZERO_INTEGER, x ) ) ) );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/temporal-projection-cols.lisp", position = 133360L)
  public static SubLObject calculate_persistence_for_bounded_exponentially_increasing_function_with_initial_value(final SubLObject time_elapsed, final SubLObject decay_fn)
  {
    final SubLObject v_answer = cycl_utilities.formula_arg0( mt_context.ask_mt_query( ConsesLow.list( $const116$boundedExponentiallyIncreasingFun, $sym28$_X, $sym29$_Y, $sym32$_Z, decay_fn ), UNPROVIDED, UNPROVIDED,
        UNPROVIDED ) );
    final SubLObject parameter = bindings.variable_lookup( $sym28$_X, v_answer );
    final SubLObject lower_bound = bindings.variable_lookup( $sym32$_Z, v_answer );
    final SubLObject upper_bound = bindings.variable_lookup( $sym29$_Y, v_answer );
    final SubLObject unit_of_time_elapsed = cycl_utilities.formula_arg0( time_elapsed );
    final SubLObject parameter_2 = convert_to_unit( parameter, unit_of_time_elapsed );
    if( NIL != parameter_2 && NIL != upper_bound )
    {
      final SubLObject x = Numbers.divide( cycl_utilities.formula_arg1( time_elapsed, UNPROVIDED ), cycl_utilities.formula_arg1( parameter_2, UNPROVIDED ) );
      return Numbers.add( lower_bound, Numbers.multiply( upper_bound, Numbers.subtract( ONE_INTEGER, Numbers.expt( TEN_INTEGER, Numbers.subtract( ZERO_INTEGER, x ) ) ) ) );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/temporal-projection-cols.lisp", position = 134106L)
  public static SubLObject calculate_persistence_for_exponential_decay_distribution_with_initial_and_final_value_fn(final SubLObject time_elapsed, final SubLObject decay_fn)
  {
    final SubLObject v_answer = cycl_utilities.formula_arg0( mt_context.ask_mt_query( ConsesLow.list( $const117$exponentialDecayDistributionWithI, $sym28$_X, $sym29$_Y, $sym32$_Z, decay_fn ), UNPROVIDED, UNPROVIDED,
        UNPROVIDED ) );
    final SubLObject parameter = bindings.variable_lookup( $sym32$_Z, v_answer );
    final SubLObject lower_bound = bindings.variable_lookup( $sym29$_Y, v_answer );
    final SubLObject upper_bound = bindings.variable_lookup( $sym28$_X, v_answer );
    final SubLObject unit_of_time_elapsed = cycl_utilities.formula_arg0( time_elapsed );
    final SubLObject parameter_2 = convert_to_unit( parameter, unit_of_time_elapsed );
    if( NIL != parameter_2 && NIL != upper_bound )
    {
      final SubLObject x = Numbers.divide( cycl_utilities.formula_arg1( time_elapsed, UNPROVIDED ), cycl_utilities.formula_arg1( parameter_2, UNPROVIDED ) );
      final SubLObject ret_value = Numbers.multiply( upper_bound, Numbers.expt( $float114$2_71, Numbers.subtract( ZERO_INTEGER, x ) ) );
      if( !ret_value.numL( lower_bound ) )
      {
        return ret_value;
      }
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/temporal-projection-cols.lisp", position = 134921L)
  public static SubLObject calculate_persistence_for_exponential_decay_distribution_with_initial_value_fn(final SubLObject time_elapsed, final SubLObject decay_fn)
  {
    final SubLObject v_answer = cycl_utilities.formula_arg0( mt_context.ask_mt_query( ConsesLow.list( $const118$exponentialDecayDistributionWithI, $sym28$_X, $sym29$_Y, decay_fn ), UNPROVIDED, UNPROVIDED, UNPROVIDED ) );
    final SubLObject parameter = bindings.variable_lookup( $sym29$_Y, v_answer );
    final SubLObject upper_bound = bindings.variable_lookup( $sym28$_X, v_answer );
    final SubLObject unit_of_time_elapsed = cycl_utilities.formula_arg0( time_elapsed );
    final SubLObject parameter_2 = convert_to_unit( parameter, unit_of_time_elapsed );
    if( NIL != parameter_2 && NIL != upper_bound )
    {
      final SubLObject x = Numbers.divide( cycl_utilities.formula_arg1( time_elapsed, UNPROVIDED ), cycl_utilities.formula_arg1( parameter_2, UNPROVIDED ) );
      return Numbers.multiply( upper_bound, Numbers.expt( $float114$2_71, Numbers.subtract( ZERO_INTEGER, x ) ) );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/temporal-projection-cols.lisp", position = 135575L)
  public static SubLObject calculate_persistence_for_constant_function(final SubLObject decay_fn)
  {
    final SubLObject v_answer = cycl_utilities.formula_arg0( mt_context.ask_mt_query( ConsesLow.listS( $const119$uniformPersistenceDistributionWit, decay_fn, $list40 ), UNPROVIDED, UNPROVIDED, UNPROVIDED ) );
    return bindings.variable_lookup( $sym28$_X, v_answer );
  }

  @SubLTranslatedFile.SubL(source = "cycl/temporal-projection-cols.lisp", position = 135814L)
  public static SubLObject calculate_persistence_for_gaussian_decay_function2(final SubLObject time_elapsed, final SubLObject decay_fn)
  {
    final SubLObject v_answer = cycl_utilities.formula_arg0( mt_context.ask_mt_query( ConsesLow.list( $const120$normalDistributionWithParameters, $sym28$_X, $sym29$_Y, decay_fn ), UNPROVIDED, UNPROVIDED, UNPROVIDED ) );
    final SubLObject mean = bindings.variable_lookup( $sym28$_X, v_answer );
    final SubLObject std_dev = bindings.variable_lookup( $sym29$_Y, v_answer );
    final SubLObject unit_of_time_elapsed = cycl_utilities.formula_arg0( time_elapsed );
    final SubLObject mean_2 = convert_to_unit( mean, unit_of_time_elapsed );
    final SubLObject std_dev_2 = convert_to_unit( std_dev, unit_of_time_elapsed );
    if( NIL != mean_2 && NIL != std_dev_2 )
    {
      final SubLObject x_mu = Numbers.subtract( cycl_utilities.formula_arg1( time_elapsed, UNPROVIDED ), cycl_utilities.formula_arg1( mean_2, UNPROVIDED ) );
      final SubLObject x_mu_div_std = Numbers.divide( x_mu, Numbers.multiply( $float121$1_414, cycl_utilities.formula_arg1( std_dev_2, UNPROVIDED ) ) );
      final SubLObject error_val = error_fn( x_mu_div_std );
      return Numbers.subtract( $float122$0_5, Numbers.multiply( $float122$0_5, error_val ) );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/temporal-projection-cols.lisp", position = 136577L)
  public static SubLObject calculate_persistence_for_gaussian_decay_function(final SubLObject time_elapsed, final SubLObject decay_fn)
  {
    final SubLObject v_answer = cycl_utilities.formula_arg0( mt_context.ask_mt_query( ConsesLow.list( $const120$normalDistributionWithParameters, $sym28$_X, $sym29$_Y, decay_fn ), UNPROVIDED, UNPROVIDED, UNPROVIDED ) );
    final SubLObject mean = bindings.variable_lookup( $sym28$_X, v_answer );
    final SubLObject std_dev = bindings.variable_lookup( $sym29$_Y, v_answer );
    final SubLObject unit_of_time_elapsed = cycl_utilities.formula_arg0( time_elapsed );
    final SubLObject mean_2 = convert_to_unit( mean, unit_of_time_elapsed );
    final SubLObject std_dev_2 = convert_to_unit( std_dev, unit_of_time_elapsed );
    if( NIL != mean_2 && NIL != std_dev_2 )
    {
      final SubLObject x_b = Numbers.subtract( cycl_utilities.formula_arg1( time_elapsed, UNPROVIDED ), cycl_utilities.formula_arg1( mean_2, UNPROVIDED ) );
      final SubLObject x_b_sq = Numbers.multiply( x_b, x_b );
      return Numbers.expt( $float114$2_71, Numbers.subtract( ZERO_INTEGER, Numbers.divide( x_b_sq, Numbers.multiply( TWO_INTEGER, cycl_utilities.formula_arg1( std_dev_2, UNPROVIDED ), cycl_utilities.formula_arg1(
          std_dev_2, UNPROVIDED ) ) ) ) );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/temporal-projection-cols.lisp", position = 137312L)
  public static SubLObject calculate_persistence_for_linear_decay_function(final SubLObject time_elapsed, final SubLObject decay_fn)
  {
    final SubLObject v_answer = cycl_utilities.formula_arg0( mt_context.ask_mt_query( ConsesLow.listS( $const123$linearDecayFunctionWithSlope, decay_fn, $list40 ), UNPROVIDED, UNPROVIDED, UNPROVIDED ) );
    final SubLObject slope = bindings.variable_lookup( $sym28$_X, v_answer );
    final SubLObject unit_of_time_elapsed = cycl_utilities.formula_arg0( time_elapsed );
    final SubLObject slope_2 = convert_to_unit( slope, unit_of_time_elapsed );
    if( NIL != slope_2 )
    {
      final SubLObject x = Numbers.divide( cycl_utilities.formula_arg1( time_elapsed, UNPROVIDED ), cycl_utilities.formula_arg1( slope_2, UNPROVIDED ) );
      return Numbers.subtract( ONE_INTEGER, x );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/temporal-projection-cols.lisp", position = 137815L)
  public static SubLObject calculate_persistence_for_linearly_increasing_function(final SubLObject time_elapsed, final SubLObject decay_fn)
  {
    final SubLObject v_answer = cycl_utilities.formula_arg0( mt_context.ask_mt_query( ConsesLow.listS( $const124$linearlyIncreasingFunctionWithSlo, decay_fn, $list40 ), UNPROVIDED, UNPROVIDED, UNPROVIDED ) );
    final SubLObject slope = bindings.variable_lookup( $sym28$_X, v_answer );
    final SubLObject unit_of_time_elapsed = cycl_utilities.formula_arg0( time_elapsed );
    final SubLObject slope_2 = convert_to_unit( slope, unit_of_time_elapsed );
    if( NIL == slope_2 )
    {
      return NIL;
    }
    final SubLObject x = Numbers.divide( cycl_utilities.formula_arg1( time_elapsed, UNPROVIDED ), cycl_utilities.formula_arg1( slope_2, UNPROVIDED ) );
    if( x.numG( ONE_INTEGER ) )
    {
      return ONE_INTEGER;
    }
    return x;
  }

  @SubLTranslatedFile.SubL(source = "cycl/temporal-projection-cols.lisp", position = 138364L)
  public static SubLObject time_falls_in_interval(final SubLObject time_1, final SubLObject time_2, final SubLObject interval, SubLObject time_elapsed)
  {
    if( time_elapsed == UNPROVIDED )
    {
      time_elapsed = NIL;
    }
    final SubLObject query_answer = cycl_utilities.formula_arg0( mt_context.ask_mt_query( ConsesLow.listS( $const100$intervalRange, interval, $list27 ), UNPROVIDED, UNPROVIDED, UNPROVIDED ) );
    final SubLObject time_diff = bindings.variable_lookup( $sym28$_X, cycl_utilities.formula_arg0( mt_context.ask_mt_query( ConsesLow.listS( $const21$timeElapsed, time_1, time_2, $list40 ), UNPROVIDED, UNPROVIDED,
        UNPROVIDED ) ) );
    final SubLObject lower = cycl_utilities.formula_args( cycl_utilities.formula_arg0( query_answer ), UNPROVIDED );
    final SubLObject upper = cycl_utilities.formula_args( cycl_utilities.formula_arg1( query_answer, UNPROVIDED ), UNPROVIDED );
    SubLObject lower_bound_test = NIL;
    SubLObject upper_bound_test = NIL;
    if( cycl_utilities.formula_arg1( lower, UNPROVIDED ).eql( $const125$MinusInfinity ) )
    {
      lower_bound_test = T;
    }
    if( time_1.equal( time_2 ) && time_diff.equal( lower ) )
    {
      lower_bound_test = T;
      upper_bound_test = T;
    }
    if( cycl_utilities.formula_arg1( upper, UNPROVIDED ).eql( $const101$PlusInfinity ) )
    {
      upper_bound_test = T;
    }
    if( NIL != mt_context.ask_mt_query( ConsesLow.list( $const62$laterThan, time_2, time_1 ), UNPROVIDED, UNPROVIDED, UNPROVIDED ) && ( NIL != mt_context.ask_mt_query( ConsesLow.list( $const56$lessThan, lower,
        time_diff ), UNPROVIDED, UNPROVIDED, UNPROVIDED ) || time_diff.equal( lower ) ) )
    {
      lower_bound_test = T;
    }
    if( cycl_utilities.formula_arg1( lower, UNPROVIDED ).isNumber() && cycl_utilities.formula_arg1( lower, UNPROVIDED ).numL( ZERO_INTEGER ) )
    {
      final SubLObject new_lower = Numbers.subtract( ZERO_INTEGER, cycl_utilities.formula_arg1( lower, UNPROVIDED ) );
      if( NIL != mt_context.ask_mt_query( ConsesLow.list( $const126$greaterThan, ConsesLow.list( cycl_utilities.formula_arg0( lower ), new_lower ), time_diff ), UNPROVIDED, UNPROVIDED, UNPROVIDED ) )
      {
        lower_bound_test = T;
      }
    }
    if( cycl_utilities.formula_arg1( upper, UNPROVIDED ).isNumber() && cycl_utilities.formula_arg1( upper, UNPROVIDED ).numL( ZERO_INTEGER ) )
    {
      final SubLObject new_upper = Numbers.subtract( ZERO_INTEGER, cycl_utilities.formula_arg1( upper, UNPROVIDED ) );
      if( NIL != mt_context.ask_mt_query( ConsesLow.list( $const126$greaterThan, time_diff, ConsesLow.list( cycl_utilities.formula_arg0( upper ), new_upper ) ), UNPROVIDED, UNPROVIDED, UNPROVIDED ) )
      {
        upper_bound_test = T;
      }
    }
    if( NIL != mt_context.ask_mt_query( ConsesLow.list( $const62$laterThan, time_2, time_1 ), UNPROVIDED, UNPROVIDED, UNPROVIDED ) && NIL != mt_context.ask_mt_query( ConsesLow.list( $const56$lessThan, time_diff, upper ),
        UNPROVIDED, UNPROVIDED, UNPROVIDED ) )
    {
      upper_bound_test = T;
    }
    if( NIL != mt_context.ask_mt_query( ConsesLow.list( $const56$lessThan, lower, time_elapsed ), UNPROVIDED, UNPROVIDED, UNPROVIDED ) || NIL != mt_context.ask_mt_query( ConsesLow.list( $const127$equals, lower,
        time_elapsed ), UNPROVIDED, UNPROVIDED, UNPROVIDED ) )
    {
      lower_bound_test = T;
    }
    if( NIL != mt_context.ask_mt_query( ConsesLow.list( $const56$lessThan, time_elapsed, upper ), UNPROVIDED, UNPROVIDED, UNPROVIDED ) )
    {
      upper_bound_test = T;
    }
    return makeBoolean( NIL != lower_bound_test && NIL != upper_bound_test );
  }

  @SubLTranslatedFile.SubL(source = "cycl/temporal-projection-cols.lisp", position = 141024L)
  public static SubLObject get_mt_time_for_assertion(final SubLObject fact)
  {
    SubLObject cdolist_list_var;
    final SubLObject assertions = cdolist_list_var = get_assertions_for_fact( fact );
    SubLObject assertion = NIL;
    assertion = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      final SubLObject time_for_assertion = temporal_projection.get_time_for_assertion_1( assertion );
      if( NIL != time_for_assertion )
      {
        if( cycl_utilities.formula_arg0( time_for_assertion ).eql( $const128$SomeTimeInIntervalFn ) )
        {
          return cycl_utilities.formula_arg1( time_for_assertion, UNPROVIDED );
        }
        return time_for_assertion;
      }
      else
      {
        cdolist_list_var = cdolist_list_var.rest();
        assertion = cdolist_list_var.first();
      }
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/temporal-projection-cols.lisp", position = 141485L)
  public static SubLObject get_time_from_ist_facts(final SubLObject fact)
  {
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/temporal-projection-cols.lisp", position = 141798L)
  public static SubLObject get_farthest_time_for_assertion(final SubLObject fact, final SubLObject time)
  {
    final SubLObject list_of_times = get_list_of_times_for_assertion( fact );
    SubLObject lst_of_time_elapsed = NIL;
    SubLObject current_best = NIL;
    if( Sequences.length( list_of_times ).numE( ONE_INTEGER ) )
    {
      return cycl_utilities.formula_arg0( list_of_times );
    }
    SubLObject cdolist_list_var = list_of_times;
    SubLObject time_1 = NIL;
    time_1 = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      SubLObject cdolist_list_var_$29 = list_of_times;
      SubLObject time_2 = NIL;
      time_2 = cdolist_list_var_$29.first();
      while ( NIL != cdolist_list_var_$29)
      {
        if( !time_1.equal( time_2 ) )
        {
          lst_of_time_elapsed = ConsesLow.cons( ConsesLow.list( time_1, find_time_elapsed( time_1, time ) ), lst_of_time_elapsed );
        }
        cdolist_list_var_$29 = cdolist_list_var_$29.rest();
        time_2 = cdolist_list_var_$29.first();
      }
      cdolist_list_var = cdolist_list_var.rest();
      time_1 = cdolist_list_var.first();
    }
    current_best = cycl_utilities.formula_arg0( lst_of_time_elapsed );
    cdolist_list_var = cycl_utilities.formula_args( lst_of_time_elapsed, UNPROVIDED );
    SubLObject entry = NIL;
    entry = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      if( NIL != mt_context.ask_mt_query( ConsesLow.list( $const126$greaterThan, cycl_utilities.formula_arg1( entry, UNPROVIDED ), cycl_utilities.formula_arg1( current_best, UNPROVIDED ) ), UNPROVIDED, UNPROVIDED,
          UNPROVIDED ) )
      {
        current_best = entry;
      }
      cdolist_list_var = cdolist_list_var.rest();
      entry = cdolist_list_var.first();
    }
    return cycl_utilities.formula_arg0( current_best );
  }

  @SubLTranslatedFile.SubL(source = "cycl/temporal-projection-cols.lisp", position = 142561L)
  public static SubLObject get_closest_time_for_assertion(final SubLObject fact, final SubLObject time)
  {
    final SubLObject list_of_times = get_list_of_times_for_assertion( fact );
    SubLObject lst_of_time_elapsed = NIL;
    SubLObject current_best = NIL;
    if( Sequences.length( list_of_times ).numE( ONE_INTEGER ) )
    {
      return handle_time_intervals_closest( cycl_utilities.formula_arg0( list_of_times ), time );
    }
    SubLObject cdolist_list_var = list_of_times;
    SubLObject time_1 = NIL;
    time_1 = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      SubLObject cdolist_list_var_$30 = list_of_times;
      SubLObject time_2 = NIL;
      time_2 = cdolist_list_var_$30.first();
      while ( NIL != cdolist_list_var_$30)
      {
        if( !time_1.equal( time_2 ) )
        {
          lst_of_time_elapsed = ConsesLow.cons( ConsesLow.list( time_1, find_time_elapsed( time_1, time ) ), lst_of_time_elapsed );
        }
        cdolist_list_var_$30 = cdolist_list_var_$30.rest();
        time_2 = cdolist_list_var_$30.first();
      }
      cdolist_list_var = cdolist_list_var.rest();
      time_1 = cdolist_list_var.first();
    }
    current_best = cycl_utilities.formula_arg0( lst_of_time_elapsed );
    cdolist_list_var = cycl_utilities.formula_args( lst_of_time_elapsed, UNPROVIDED );
    SubLObject entry = NIL;
    entry = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      if( NIL != mt_context.ask_mt_query( ConsesLow.list( $const56$lessThan, cycl_utilities.formula_arg1( entry, UNPROVIDED ), cycl_utilities.formula_arg1( current_best, UNPROVIDED ) ), UNPROVIDED, UNPROVIDED,
          UNPROVIDED ) )
      {
        current_best = entry;
      }
      cdolist_list_var = cdolist_list_var.rest();
      entry = cdolist_list_var.first();
    }
    return handle_time_intervals_closest( current_best, time );
  }

  @SubLTranslatedFile.SubL(source = "cycl/temporal-projection-cols.lisp", position = 143375L)
  public static SubLObject get_closest_time_for_assertion_before_given_time(final SubLObject fact, final SubLObject time)
  {
    SubLObject list_of_times = get_list_of_times_for_assertion( fact );
    SubLObject current_best = NIL;
    if( NIL == list_of_times )
    {
      list_of_times = find_list_of_starting_times( fact );
    }
    SubLObject cdolist_list_var = list_of_times;
    SubLObject x = NIL;
    x = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      if( NIL != mt_context.ask_mt_query( ConsesLow.list( $const62$laterThan, time, x ), UNPROVIDED, UNPROVIDED, UNPROVIDED ) )
      {
        if( NIL == current_best )
        {
          current_best = x;
        }
        else if( NIL != mt_context.ask_mt_query( ConsesLow.list( $const62$laterThan, x, current_best ), UNPROVIDED, UNPROVIDED, UNPROVIDED ) )
        {
          current_best = x;
        }
      }
      cdolist_list_var = cdolist_list_var.rest();
      x = cdolist_list_var.first();
    }
    return current_best;
  }

  @SubLTranslatedFile.SubL(source = "cycl/temporal-projection-cols.lisp", position = 143940L)
  public static SubLObject get_earliest_time_for_fact(final SubLObject fact)
  {
    final SubLObject lst_of_times = get_list_of_times_for_assertion( fact );
    SubLObject current_best = cycl_utilities.formula_arg0( lst_of_times );
    if( Sequences.length( lst_of_times ).numE( ONE_INTEGER ) )
    {
      return cycl_utilities.formula_arg0( lst_of_times );
    }
    SubLObject cdolist_list_var = lst_of_times;
    SubLObject time = NIL;
    time = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      if( NIL != mt_context.ask_mt_query( ConsesLow.list( $const62$laterThan, current_best, time ), UNPROVIDED, UNPROVIDED, UNPROVIDED ) )
      {
        current_best = time;
      }
      cdolist_list_var = cdolist_list_var.rest();
      time = cdolist_list_var.first();
    }
    return current_best;
  }

  @SubLTranslatedFile.SubL(source = "cycl/temporal-projection-cols.lisp", position = 144368L)
  public static SubLObject handle_time_intervals_closest(final SubLObject current_best, final SubLObject time)
  {
    if( !current_best.isList() )
    {
      return current_best;
    }
    if( !cycl_utilities.formula_arg0( current_best ).eql( $const130$TimeIntervalBetweenFn ) && !cycl_utilities.formula_arg0( current_best ).eql( $const10$TimeIntervalInclusiveFn ) )
    {
      return current_best;
    }
    final SubLObject lower_limit = cycl_utilities.formula_arg1( current_best, UNPROVIDED );
    final SubLObject upper_limit = cycl_utilities.formula_arg2( current_best, UNPROVIDED );
    final SubLObject lower_limit_2 = map_indexicals_in_date( lower_limit );
    final SubLObject upper_limit_2 = map_indexicals_in_date( upper_limit );
    if( NIL != mt_context.ask_mt_query( ConsesLow.list( $const62$laterThan, time, upper_limit_2 ), UNPROVIDED, UNPROVIDED, UNPROVIDED ) )
    {
      return upper_limit_2;
    }
    if( NIL != mt_context.ask_mt_query( ConsesLow.list( $const62$laterThan, lower_limit_2, time ), UNPROVIDED, UNPROVIDED, UNPROVIDED ) )
    {
      return lower_limit_2;
    }
    if( NIL != mt_context.ask_mt_query( ConsesLow.list( $const62$laterThan, time, lower_limit_2 ), UNPROVIDED, UNPROVIDED, UNPROVIDED ) && NIL != mt_context.ask_mt_query( ConsesLow.list( $const62$laterThan,
        upper_limit_2, time ), UNPROVIDED, UNPROVIDED, UNPROVIDED ) )
    {
      return time;
    }
    return upper_limit_2;
  }

  @SubLTranslatedFile.SubL(source = "cycl/temporal-projection-cols.lisp", position = 145302L)
  public static SubLObject map_indexicals_in_date(final SubLObject date)
  {
    if( date.eql( $const131$Now ) || date.eql( $const132$Now_Indexical ) )
    {
      return bindings.variable_lookup( $sym28$_X, cycl_utilities.formula_arg0( mt_context.ask_mt_query( ConsesLow.listS( $const133$indexicalReferent, date, $list40 ), UNPROVIDED, UNPROVIDED, UNPROVIDED ) ) );
    }
    return date;
  }

  @SubLTranslatedFile.SubL(source = "cycl/temporal-projection-cols.lisp", position = 145543L)
  public static SubLObject check_fact_true_at_point(final SubLObject fact, final SubLObject time)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject cdolist_list_var;
    final SubLObject list_of_times = cdolist_list_var = get_list_of_times_for_assertion( fact );
    SubLObject time_1 = NIL;
    time_1 = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      thread.resetMultipleValues();
      final SubLObject result = time_subsumes_anotherP( time_1, time );
      SubLObject justifications = thread.secondMultipleValue();
      thread.resetMultipleValues();
      if( NIL != result )
      {
        final SubLObject supporting_assertion = get_assertion_for_given_fact_and_time( fact, time_1 );
        if( NIL != supporting_assertion )
        {
          justifications = ConsesLow.append( justifications, plausibility_utilities.hl_justify_asent_fast( ConsesLow.list( $const11$temporallySubsumes, time_1, time ), $mt_for_temporal_projection$.getDynamicValue(
              thread ) ) );
          justifications = ConsesLow.append( justifications, ConsesLow.list( supporting_assertion ) );
        }
        return Values.values( T, justifications );
      }
      cdolist_list_var = cdolist_list_var.rest();
      time_1 = cdolist_list_var.first();
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/temporal-projection-cols.lisp", position = 146288L)
  public static SubLObject check_isa_fact_false_at_point(final SubLObject fact, final SubLObject time)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject entity = cycl_utilities.formula_arg1( fact, UNPROVIDED );
    final SubLObject col = cycl_utilities.formula_arg2( fact, UNPROVIDED );
    SubLObject cdolist_list_var;
    final SubLObject list_of_cols = cdolist_list_var = isa.isa( entity, $const44$EverythingPSC, UNPROVIDED );
    SubLObject col_1 = NIL;
    col_1 = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      if( NIL != disjoint_with.disjoint_withP( col_1, col, $mt_for_temporal_projection$.getDynamicValue( thread ), UNPROVIDED ) )
      {
        final SubLObject new_query = ConsesLow.list( $const15$isa, entity, col_1 );
        SubLObject cdolist_list_var_$31;
        final SubLObject list_of_times = cdolist_list_var_$31 = get_list_of_times_for_assertion( new_query );
        SubLObject time_1 = NIL;
        time_1 = cdolist_list_var_$31.first();
        while ( NIL != cdolist_list_var_$31)
        {
          thread.resetMultipleValues();
          final SubLObject result = time_subsumes_anotherP( time_1, time );
          SubLObject justifications = thread.secondMultipleValue();
          thread.resetMultipleValues();
          if( NIL != result )
          {
            final SubLObject supporting_assertion = get_assertion_for_given_fact_and_time( new_query, time_1 );
            if( NIL != supporting_assertion )
            {
              justifications = ConsesLow.append( justifications, plausibility_utilities.hl_justify_asent_fast( ConsesLow.list( $const11$temporallySubsumes, time_1, time ), $mt_for_temporal_projection$.getDynamicValue(
                  thread ) ) );
              justifications = ConsesLow.append( justifications, ConsesLow.list( supporting_assertion ) );
            }
            return Values.values( T, justifications );
          }
          cdolist_list_var_$31 = cdolist_list_var_$31.rest();
          time_1 = cdolist_list_var_$31.first();
        }
      }
      cdolist_list_var = cdolist_list_var.rest();
      col_1 = cdolist_list_var.first();
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/temporal-projection-cols.lisp", position = 147342L)
  public static SubLObject time_subsumes_anotherP(final SubLObject time_1, final SubLObject time_2)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL != isa.isa_in_any_mtP( time_1, $const134$TimeInterval ) && time_1.isList() && cycl_utilities.formula_arg2( time_1, UNPROVIDED ).eql( $const131$Now ) )
    {
      final SubLObject now_time_point = bindings.variable_lookup( $sym28$_X, cycl_utilities.formula_arg0( mt_context.ask_mt_query( $list135, UNPROVIDED, UNPROVIDED, UNPROVIDED ) ) );
      if( NIL != mt_context.ask_mt_query( ConsesLow.list( $const136$startsAfterEndingOf, now_time_point, time_2 ), UNPROVIDED, UNPROVIDED, UNPROVIDED ) )
      {
        thread.resetMultipleValues();
        final SubLObject result = mt_later_thanP( time_2, time_1 );
        final SubLObject justifications = thread.secondMultipleValue();
        thread.resetMultipleValues();
        if( NIL != result )
        {
          return Values.values( T, justifications );
        }
      }
    }
    return Values.values( mt_context.ask_mt_query( ConsesLow.list( $const11$temporallySubsumes, time_1, time_2 ), NIL, $mt_for_temporal_projection$.getDynamicValue( thread ), UNPROVIDED ), NIL );
  }

  @SubLTranslatedFile.SubL(source = "cycl/temporal-projection-cols.lisp", position = 148044L)
  public static SubLObject get_assertion_for_given_fact_and_time(final SubLObject fact, final SubLObject time)
  {
    SubLObject cdolist_list_var;
    final SubLObject assertions = cdolist_list_var = get_assertions_for_fact( fact );
    SubLObject assertion = NIL;
    assertion = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      final SubLObject time_for_assertion = temporal_projection.get_time_for_assertion_1( assertion );
      if( NIL != time_for_assertion && time_for_assertion.equal( time ) )
      {
        return assertion;
      }
      cdolist_list_var = cdolist_list_var.rest();
      assertion = cdolist_list_var.first();
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/temporal-projection-cols.lisp", position = 148428L)
  public static SubLObject get_fact_closest_to_time_point(final SubLObject lst_of_facts_and_prob, final SubLObject time)
  {
    if( Sequences.length( lst_of_facts_and_prob ).numE( ONE_INTEGER ) )
    {
      return cycl_utilities.formula_arg0( lst_of_facts_and_prob );
    }
    SubLObject lst_of_times = NIL;
    SubLObject current_best = NIL;
    SubLObject cdolist_list_var = lst_of_facts_and_prob;
    SubLObject fact_and_prob = NIL;
    fact_and_prob = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      final SubLObject fact = cycl_utilities.formula_arg0( fact_and_prob );
      final SubLObject time_for_assertion = get_mt_time_for_assertion( fact );
      lst_of_times = ConsesLow.cons( ConsesLow.list( fact_and_prob, find_time_elapsed( time_for_assertion, time ) ), lst_of_times );
      cdolist_list_var = cdolist_list_var.rest();
      fact_and_prob = cdolist_list_var.first();
    }
    current_best = cycl_utilities.formula_arg0( lst_of_times );
    cdolist_list_var = lst_of_times;
    SubLObject entry = NIL;
    entry = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      if( NIL != mt_context.ask_mt_query( ConsesLow.list( $const56$lessThan, cycl_utilities.formula_arg1( entry, UNPROVIDED ), cycl_utilities.formula_arg1( current_best, UNPROVIDED ) ), UNPROVIDED, UNPROVIDED,
          UNPROVIDED ) )
      {
        current_best = entry;
      }
      cdolist_list_var = cdolist_list_var.rest();
      entry = cdolist_list_var.first();
    }
    return cycl_utilities.formula_arg0( current_best );
  }

  @SubLTranslatedFile.SubL(source = "cycl/temporal-projection-cols.lisp", position = 149188L)
  public static SubLObject get_assertion_for_binary_predicates(final SubLObject fact)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding( thread );
    final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding( thread );
    try
    {
      mt_relevance_macros.$relevant_mt_function$.bind( $sym137$RELEVANT_MT_IS_EVERYTHING, thread );
      mt_relevance_macros.$mt$.bind( $const44$EverythingPSC, thread );
      return czer_meta.find_assertion_cycl( fact, UNPROVIDED );
    }
    finally
    {
      mt_relevance_macros.$mt$.rebind( _prev_bind_2, thread );
      mt_relevance_macros.$relevant_mt_function$.rebind( _prev_bind_0, thread );
    }
  }

  @SubLTranslatedFile.SubL(source = "cycl/temporal-projection-cols.lisp", position = 149316L)
  public static SubLObject get_assertion_for_ternary_predicates(final SubLObject pred, final SubLObject a, final SubLObject b, final SubLObject c)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject d = NIL;
    SubLObject form = NIL;
    if( NIL != nart_handles.nart_p( c ) )
    {
      d = narts_high.nart_hl_formula( c );
    }
    else
    {
      d = c;
    }
    form = ConsesLow.list( pred, a, b, d );
    final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding( thread );
    final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding( thread );
    try
    {
      mt_relevance_macros.$relevant_mt_function$.bind( $sym137$RELEVANT_MT_IS_EVERYTHING, thread );
      mt_relevance_macros.$mt$.bind( $const44$EverythingPSC, thread );
      return czer_meta.find_assertion_cycl( form, UNPROVIDED );
    }
    finally
    {
      mt_relevance_macros.$mt$.rebind( _prev_bind_2, thread );
      mt_relevance_macros.$relevant_mt_function$.rebind( _prev_bind_0, thread );
    }
  }

  @SubLTranslatedFile.SubL(source = "cycl/temporal-projection-cols.lisp", position = 149598L)
  public static SubLObject get_assertion_for_predicate_of_arity_five(final SubLObject pred, final SubLObject a, final SubLObject b, final SubLObject c, final SubLObject d, final SubLObject e)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject f = NIL;
    SubLObject form = NIL;
    if( NIL != nart_handles.nart_p( e ) )
    {
      f = narts_high.nart_hl_formula( e );
    }
    else
    {
      f = e;
    }
    form = ConsesLow.list( pred, a, b, c, d, f );
    final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding( thread );
    final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding( thread );
    try
    {
      mt_relevance_macros.$relevant_mt_function$.bind( $sym137$RELEVANT_MT_IS_EVERYTHING, thread );
      mt_relevance_macros.$mt$.bind( $const44$EverythingPSC, thread );
      return czer_meta.find_assertion_cycl( form, UNPROVIDED );
    }
    finally
    {
      mt_relevance_macros.$mt$.rebind( _prev_bind_2, thread );
      mt_relevance_macros.$relevant_mt_function$.rebind( _prev_bind_0, thread );
    }
  }

  @SubLTranslatedFile.SubL(source = "cycl/temporal-projection-cols.lisp", position = 149897L)
  public static SubLObject get_assertion_for_predicate_of_arity_four(final SubLObject pred, final SubLObject a, final SubLObject b, final SubLObject c, final SubLObject d)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject e = NIL;
    SubLObject f = NIL;
    SubLObject form = NIL;
    if( NIL != nart_handles.nart_p( d ) )
    {
      e = narts_high.nart_hl_formula( d );
    }
    else
    {
      e = d;
    }
    if( NIL != nart_handles.nart_p( c ) )
    {
      f = narts_high.nart_hl_formula( c );
    }
    else
    {
      f = c;
    }
    form = ConsesLow.list( pred, a, b, f, e );
    final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding( thread );
    final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding( thread );
    try
    {
      mt_relevance_macros.$relevant_mt_function$.bind( $sym137$RELEVANT_MT_IS_EVERYTHING, thread );
      mt_relevance_macros.$mt$.bind( $const44$EverythingPSC, thread );
      return czer_meta.find_assertion_cycl( form, UNPROVIDED );
    }
    finally
    {
      mt_relevance_macros.$mt$.rebind( _prev_bind_2, thread );
      mt_relevance_macros.$relevant_mt_function$.rebind( _prev_bind_0, thread );
    }
  }

  @SubLTranslatedFile.SubL(source = "cycl/temporal-projection-cols.lisp", position = 150274L)
  public static SubLObject find_assertion_for_predicate_of_arity_6(final SubLObject pred, final SubLObject a, final SubLObject b, final SubLObject c, final SubLObject d, final SubLObject e, final SubLObject f)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject g = NIL;
    SubLObject form = NIL;
    if( NIL != nart_handles.nart_p( f ) )
    {
      g = narts_high.nart_hl_formula( f );
    }
    else
    {
      g = f;
    }
    form = ConsesLow.list( pred, a, b, c, d, e, g );
    final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding( thread );
    final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding( thread );
    try
    {
      mt_relevance_macros.$relevant_mt_function$.bind( $sym137$RELEVANT_MT_IS_EVERYTHING, thread );
      mt_relevance_macros.$mt$.bind( $const44$EverythingPSC, thread );
      return czer_meta.find_assertion_cycl( form, UNPROVIDED );
    }
    finally
    {
      mt_relevance_macros.$mt$.rebind( _prev_bind_2, thread );
      mt_relevance_macros.$relevant_mt_function$.rebind( _prev_bind_0, thread );
    }
  }

  @SubLTranslatedFile.SubL(source = "cycl/temporal-projection-cols.lisp", position = 150571L)
  public static SubLObject check_always_trueP(final SubLObject fact)
  {
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/temporal-projection-cols.lisp", position = 151762L)
  public static SubLObject check_temporal_relation_between_arguments(final SubLObject fact)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject all_assertions = kb_mapping_utilities.pred_value_gafs_in_any_mt( cycl_utilities.formula_arg0( fact ), $const144$temporalRelationBetweenArguments, UNPROVIDED, UNPROVIDED );
    SubLObject justifications = NIL;
    final SubLObject arg1 = cycl_utilities.formula_arg1( fact, UNPROVIDED );
    final SubLObject arg2 = cycl_utilities.formula_arg2( fact, UNPROVIDED );
    SubLObject cdolist_list_var = all_assertions;
    SubLObject assertion = NIL;
    assertion = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      final SubLObject gaf = assertions_high.gaf_formula( assertion );
      final SubLObject relation = cycl_utilities.formula_arg2( gaf, UNPROVIDED );
      if( relation.eql( $const3$temporallyIntersects ) )
      {
        thread.resetMultipleValues();
        final SubLObject starting_date_arg2 = get_starting_date_of_concept( arg2 );
        final SubLObject justification_1 = thread.secondMultipleValue();
        thread.resetMultipleValues();
        final SubLObject ending_date_arg1 = get_ending_date_of_concept( arg1 );
        if( NIL != verify_temporal_relation( $const62$laterThan, starting_date_arg2, ending_date_arg1 ) )
        {
          justifications = ConsesLow.append( justifications, justification_1 );
          justifications = ConsesLow.append( justifications, ConsesLow.list( assertion ) );
          justifications = ConsesLow.append( justifications, plausibility_utilities.hl_justify_asent_fast( ConsesLow.list( $const62$laterThan, starting_date_arg2, ending_date_arg1 ), $mt_for_temporal_projection$
              .getDynamicValue( thread ) ) );
          justifications = ConsesLow.append( justifications, plausibility_utilities.hl_justify_asent_fast( ConsesLow.list( $const90$endingDate, arg1, ending_date_arg1 ), $mt_for_temporal_projection$.getDynamicValue(
              thread ) ) );
          return Values.values( NIL, justifications );
        }
      }
      if( relation.eql( $const145$endsAfterStartingOf ) )
      {
        thread.resetMultipleValues();
        final SubLObject ending_date_arg2 = get_ending_date_of_concept( arg1 );
        final SubLObject justification_1 = thread.secondMultipleValue();
        thread.resetMultipleValues();
        thread.resetMultipleValues();
        final SubLObject starting_date_arg3 = get_starting_date_of_concept( arg2 );
        final SubLObject justification_2 = thread.secondMultipleValue();
        thread.resetMultipleValues();
        if( NIL != verify_temporal_relation( $const62$laterThan, starting_date_arg3, ending_date_arg2 ) )
        {
          justifications = ConsesLow.append( justifications, justification_1 );
          justifications = ConsesLow.append( justifications, ConsesLow.list( assertion ) );
          justifications = ConsesLow.append( justifications, plausibility_utilities.hl_justify_asent_fast( ConsesLow.list( $const62$laterThan, starting_date_arg3, ending_date_arg2 ), $mt_for_temporal_projection$
              .getDynamicValue( thread ) ) );
          justifications = ConsesLow.append( justifications, justification_2 );
          return Values.values( NIL, justifications );
        }
      }
      cdolist_list_var = cdolist_list_var.rest();
      assertion = cdolist_list_var.first();
    }
    return T;
  }

  @SubLTranslatedFile.SubL(source = "cycl/temporal-projection-cols.lisp", position = 154065L)
  public static SubLObject check_starting_times(final SubLObject fact, final SubLObject time)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject predicate = cycl_utilities.formula_arg0( fact );
    if( NIL != isa.isa_in_any_mtP( predicate, $const146$FutureTensePredicate ) )
    {
      return T;
    }
    thread.resetMultipleValues();
    final SubLObject result = check_temporal_relation_between_arguments( fact );
    final SubLObject justifications = thread.secondMultipleValue();
    thread.resetMultipleValues();
    if( NIL == result )
    {
      return Values.values( result, justifications );
    }
    SubLObject cdolist_list_var = cycl_utilities.formula_args( fact, UNPROVIDED );
    SubLObject concept = NIL;
    concept = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      final SubLObject starting_time = get_starting_date_of_concept( concept );
      if( NIL != starting_time && NIL != mt_context.ask_mt_query( ConsesLow.list( $const136$startsAfterEndingOf, starting_time, time ), NIL, $mt_for_temporal_projection$.getDynamicValue( thread ), UNPROVIDED ) )
      {
        $temporal_projection_justifications$.setDynamicValue( ConsesLow.append( $temporal_projection_justifications$.getDynamicValue( thread ), plausibility_utilities.hl_justify_asent_fast( ConsesLow.list(
            $const50$startingDate, concept, starting_time ), $mt_for_temporal_projection$.getDynamicValue( thread ) ) ), thread );
        $temporal_projection_justifications$.setDynamicValue( ConsesLow.append( $temporal_projection_justifications$.getDynamicValue( thread ), plausibility_utilities.hl_justify_asent_fast( ConsesLow.list(
            $const136$startsAfterEndingOf, starting_time, time ), $mt_for_temporal_projection$.getDynamicValue( thread ) ) ), thread );
        return NIL;
      }
      cdolist_list_var = cdolist_list_var.rest();
      concept = cdolist_list_var.first();
    }
    if( NIL != isa.isa_in_any_mtP( predicate, $const147$CoexistingObjectsPredicate ) )
    {
      cdolist_list_var = cycl_utilities.formula_args( fact, UNPROVIDED );
      concept = NIL;
      concept = cdolist_list_var.first();
      while ( NIL != cdolist_list_var)
      {
        SubLObject cdolist_list_var_$32 = isa.isa( concept, UNPROVIDED, UNPROVIDED );
        SubLObject col = NIL;
        col = cdolist_list_var_$32.first();
        while ( NIL != cdolist_list_var_$32)
        {
          final SubLObject starting_time2 = get_starting_date_of_concept( col );
          if( NIL != mt_context.ask_mt_query( ConsesLow.list( $const136$startsAfterEndingOf, starting_time2, time ), NIL, $mt_for_temporal_projection$.getDynamicValue( thread ), UNPROVIDED ) )
          {
            $temporal_projection_justifications$.setDynamicValue( ConsesLow.append( $temporal_projection_justifications$.getDynamicValue( thread ), plausibility_utilities.hl_justify_asent_fast( ConsesLow.listS(
                $const15$isa, predicate, $list148 ), $mt_for_temporal_projection$.getDynamicValue( thread ) ) ), thread );
            $temporal_projection_justifications$.setDynamicValue( ConsesLow.append( $temporal_projection_justifications$.getDynamicValue( thread ), plausibility_utilities.hl_justify_asent_fast( ConsesLow.list(
                $const15$isa, concept, col ), $mt_for_temporal_projection$.getDynamicValue( thread ) ) ), thread );
            $temporal_projection_justifications$.setDynamicValue( ConsesLow.append( $temporal_projection_justifications$.getDynamicValue( thread ), plausibility_utilities.hl_justify_asent_fast( ConsesLow.list(
                $const149$earliestDateForCollectionMembers, col, starting_time2 ), $mt_for_temporal_projection$.getDynamicValue( thread ) ) ), thread );
            $temporal_projection_justifications$.setDynamicValue( ConsesLow.append( $temporal_projection_justifications$.getDynamicValue( thread ), plausibility_utilities.hl_justify_asent_fast( ConsesLow.list(
                $const136$startsAfterEndingOf, starting_time2, time ), $mt_for_temporal_projection$.getDynamicValue( thread ) ) ), thread );
            return NIL;
          }
          cdolist_list_var_$32 = cdolist_list_var_$32.rest();
          col = cdolist_list_var_$32.first();
        }
        cdolist_list_var = cdolist_list_var.rest();
        concept = cdolist_list_var.first();
      }
    }
    return T;
  }

  @SubLTranslatedFile.SubL(source = "cycl/temporal-projection-cols.lisp", position = 156278L)
  public static SubLObject check_ending_times(final SubLObject fact, final SubLObject time)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL != isa.isa_in_any_mtP( cycl_utilities.formula_arg0( fact ), $const146$FutureTensePredicate ) )
    {
      return NIL;
    }
    if( NIL != isa.isa_in_any_mtP( cycl_utilities.formula_arg2( fact, UNPROVIDED ), $const150$Date ) )
    {
      return NIL;
    }
    if( NIL != isa.isa_in_any_mtP( cycl_utilities.formula_arg2( fact, UNPROVIDED ), $const134$TimeInterval ) )
    {
      return NIL;
    }
    final SubLObject concept = cycl_utilities.formula_arg1( fact, UNPROVIDED );
    final SubLObject pred = cycl_utilities.formula_arg0( fact );
    final SubLObject arg_2 = cycl_utilities.formula_arg2( fact, UNPROVIDED );
    final SubLObject arg_cons = get_arg_cons_for_pos( pred, ONE_INTEGER );
    final SubLObject arg_cons_2 = get_arg_cons_for_pos( pred, TWO_INTEGER );
    SubLObject justifications = NIL;
    final SubLObject ending_time_2 = get_ending_date_of_concept( arg_2 );
    final SubLObject ending_time = get_ending_date_of_concept( concept );
    if( NIL != arg_cons && NIL != genls.genlP( arg_cons, $const151$BiologicalLivingObject, $mt_for_temporal_projection$.getDynamicValue( thread ), UNPROVIDED ) )
    {
      if( NIL != ending_time && NIL != mt_context.ask_mt_query( ConsesLow.list( $const136$startsAfterEndingOf, time, ending_time ), UNPROVIDED, UNPROVIDED, UNPROVIDED ) )
      {
        justifications = ConsesLow.append( justifications, plausibility_utilities.hl_justify_asent_fast( ConsesLow.list( $const136$startsAfterEndingOf, time, ending_time ), $mt_for_temporal_projection$.getDynamicValue(
            thread ) ) );
        justifications = ConsesLow.append( justifications, plausibility_utilities.hl_justify_asent_fast( ConsesLow.list( $const90$endingDate, concept, ending_time ), $mt_for_temporal_projection$.getDynamicValue(
            thread ) ) );
        justifications = ConsesLow.append( justifications, plausibility_utilities.hl_justify_asent_fast( ConsesLow.list( $const152$argIsa, pred, ONE_INTEGER, arg_cons ), $mt_for_temporal_projection$.getDynamicValue(
            thread ) ) );
        justifications = ConsesLow.append( justifications, plausibility_utilities.hl_justify_asent_fast( ConsesLow.listS( $const153$genls, arg_cons, $list154 ), $mt_for_temporal_projection$.getDynamicValue( thread ) ) );
        return Values.values( T, justifications );
      }
      thread.resetMultipleValues();
      final SubLObject result = use_conditional_likelihood( ConsesLow.list( $const15$isa, concept, arg_cons ), time );
      SubLObject justification_1 = thread.secondMultipleValue();
      thread.resetMultipleValues();
      if( NIL != result && result.numE( ZERO_INTEGER ) )
      {
        justification_1 = ConsesLow.append( justification_1, plausibility_utilities.hl_justify_asent_fast( ConsesLow.list( $const152$argIsa, pred, ONE_INTEGER, arg_cons ), $mt_for_temporal_projection$.getDynamicValue(
            thread ) ) );
        return Values.values( result, justification_1 );
      }
    }
    if( NIL != isa.isa_in_any_mtP( pred, $const147$CoexistingObjectsPredicate ) )
    {
      if( NIL != isa.isa_in_any_mtP( concept, $const151$BiologicalLivingObject ) )
      {
        if( NIL != ending_time && NIL != mt_context.ask_mt_query( ConsesLow.list( $const136$startsAfterEndingOf, time, ending_time ), UNPROVIDED, UNPROVIDED, UNPROVIDED ) )
        {
          justifications = ConsesLow.append( justifications, plausibility_utilities.hl_justify_asent_fast( ConsesLow.list( $const136$startsAfterEndingOf, time, ending_time ), $mt_for_temporal_projection$.getDynamicValue(
              thread ) ) );
          justifications = ConsesLow.append( justifications, plausibility_utilities.hl_justify_asent_fast( ConsesLow.list( $const90$endingDate, concept, ending_time ), $mt_for_temporal_projection$.getDynamicValue(
              thread ) ) );
          justifications = ConsesLow.append( justifications, plausibility_utilities.hl_justify_asent_fast( ConsesLow.listS( $const15$isa, pred, $list148 ), $mt_for_temporal_projection$.getDynamicValue( thread ) ) );
          return Values.values( T, justifications );
        }
        thread.resetMultipleValues();
        final SubLObject result = get_persistence_likelihood_for_fact_at_time( ConsesLow.listS( $const15$isa, concept, $list154 ), time, T, $mt_for_temporal_projection$.getDynamicValue( thread ), T, UNPROVIDED );
        SubLObject justification_2 = thread.secondMultipleValue();
        thread.resetMultipleValues();
        if( NIL != result && cycl_utilities.formula_arg1( result, UNPROVIDED ).numE( ZERO_INTEGER ) )
        {
          justification_2 = ConsesLow.append( justification_2, plausibility_utilities.hl_justify_asent_fast( ConsesLow.listS( $const15$isa, pred, $list148 ), $mt_for_temporal_projection$.getDynamicValue( thread ) ) );
          return Values.values( result, justification_2 );
        }
      }
      if( NIL != isa.isa_in_any_mtP( arg_2, $const151$BiologicalLivingObject ) )
      {
        if( NIL != ending_time_2 && NIL != mt_context.ask_mt_query( ConsesLow.list( $const136$startsAfterEndingOf, time, ending_time_2 ), UNPROVIDED, UNPROVIDED, UNPROVIDED ) )
        {
          justifications = ConsesLow.append( justifications, plausibility_utilities.hl_justify_asent_fast( ConsesLow.list( $const136$startsAfterEndingOf, time, ending_time_2 ), $mt_for_temporal_projection$
              .getDynamicValue( thread ) ) );
          justifications = ConsesLow.append( justifications, plausibility_utilities.hl_justify_asent_fast( ConsesLow.list( $const90$endingDate, arg_2, ending_time_2 ), $mt_for_temporal_projection$.getDynamicValue(
              thread ) ) );
          justifications = ConsesLow.append( justifications, plausibility_utilities.hl_justify_asent_fast( ConsesLow.listS( $const15$isa, pred, $list148 ), $mt_for_temporal_projection$.getDynamicValue( thread ) ) );
          return Values.values( T, justifications );
        }
        thread.resetMultipleValues();
        final SubLObject result = get_persistence_likelihood_for_fact_at_time( ConsesLow.listS( $const15$isa, arg_2, $list154 ), time, T, $mt_for_temporal_projection$.getDynamicValue( thread ), T, UNPROVIDED );
        SubLObject justification_3 = thread.secondMultipleValue();
        thread.resetMultipleValues();
        if( NIL != result && cycl_utilities.formula_arg1( result, UNPROVIDED ).numE( ZERO_INTEGER ) )
        {
          justification_3 = ConsesLow.append( justification_3, plausibility_utilities.hl_justify_asent_fast( ConsesLow.listS( $const15$isa, pred, $list148 ), $mt_for_temporal_projection$.getDynamicValue( thread ) ) );
          return Values.values( result, justification_3 );
        }
      }
    }
    if( NIL != arg_cons_2 && NIL != genls.genlP( arg_cons_2, $const151$BiologicalLivingObject, $mt_for_temporal_projection$.getDynamicValue( thread ), UNPROVIDED ) )
    {
      if( NIL != ending_time_2 && NIL != mt_context.ask_mt_query( ConsesLow.list( $const136$startsAfterEndingOf, time, ending_time_2 ), UNPROVIDED, UNPROVIDED, UNPROVIDED ) )
      {
        justifications = ConsesLow.append( justifications, plausibility_utilities.hl_justify_asent_fast( ConsesLow.list( $const136$startsAfterEndingOf, time, ending_time_2 ), $mt_for_temporal_projection$.getDynamicValue(
            thread ) ) );
        justifications = ConsesLow.append( justifications, plausibility_utilities.hl_justify_asent_fast( ConsesLow.list( $const90$endingDate, arg_2, ending_time_2 ), $mt_for_temporal_projection$.getDynamicValue(
            thread ) ) );
        justifications = ConsesLow.append( justifications, plausibility_utilities.hl_justify_asent_fast( ConsesLow.list( $const152$argIsa, pred, TWO_INTEGER, arg_cons_2 ), $mt_for_temporal_projection$.getDynamicValue(
            thread ) ) );
        justifications = ConsesLow.append( justifications, plausibility_utilities.hl_justify_asent_fast( ConsesLow.listS( $const153$genls, arg_cons_2, $list154 ), $mt_for_temporal_projection$.getDynamicValue(
            thread ) ) );
        return Values.values( T, justifications );
      }
      thread.resetMultipleValues();
      final SubLObject result = use_conditional_likelihood( ConsesLow.list( $const15$isa, arg_2, arg_cons_2 ), time );
      SubLObject justification_4 = thread.secondMultipleValue();
      thread.resetMultipleValues();
      if( NIL != result )
      {
        justification_4 = ConsesLow.append( justification_4, plausibility_utilities.hl_justify_asent_fast( ConsesLow.list( $const152$argIsa, pred, TWO_INTEGER, arg_cons_2 ), $mt_for_temporal_projection$.getDynamicValue(
            thread ) ) );
        return Values.values( result, justification_4 );
      }
    }
    if( pred.eql( $const15$isa ) && NIL != genls.genlP( arg_2, $const151$BiologicalLivingObject, UNPROVIDED, UNPROVIDED ) && NIL != mt_context.ask_mt_query( ConsesLow.list( $const62$laterThan, time, ending_time ),
        UNPROVIDED, UNPROVIDED, UNPROVIDED ) )
    {
      justifications = ConsesLow.append( justifications, plausibility_utilities.hl_justify_asent_fast( ConsesLow.list( $const62$laterThan, time, ending_time ), $mt_for_temporal_projection$.getDynamicValue( thread ) ) );
      justifications = ConsesLow.append( justifications, plausibility_utilities.hl_justify_asent_fast( ConsesLow.listS( $const153$genls, arg_2, $list154 ), $mt_for_temporal_projection$.getDynamicValue( thread ) ) );
      justifications = ConsesLow.append( justifications, plausibility_utilities.hl_justify_asent_fast( ConsesLow.list( $const90$endingDate, concept, ending_time ), $mt_for_temporal_projection$.getDynamicValue(
          thread ) ) );
      return Values.values( T, justifications );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/temporal-projection-cols.lisp", position = 162749L)
  public static SubLObject get_arg_cons_for_pos(final SubLObject pred, final SubLObject pos)
  {
    return bindings.variable_lookup( $sym28$_X, cycl_utilities.formula_arg0( mt_context.ask_mt_query( ConsesLow.listS( $const152$argIsa, pred, pos, $list40 ), UNPROVIDED, UNPROVIDED, UNPROVIDED ) ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/temporal-projection-cols.lisp", position = 162889L)
  public static SubLObject get_starting_date_of_concept(final SubLObject concept)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject birth_date = bindings.variable_lookup( $sym28$_X, cycl_utilities.formula_arg0( mt_context.ask_mt_query( ConsesLow.listS( $const50$startingDate, concept, $list40 ), NIL, $mt_for_temporal_projection$
        .getDynamicValue( thread ), UNPROVIDED ) ) );
    if( NIL != birth_date )
    {
      return Values.values( birth_date, plausibility_utilities.hl_justify_asent_fast( ConsesLow.listS( $const50$startingDate, concept, $list40 ), $mt_for_temporal_projection$.getDynamicValue( thread ) ) );
    }
    SubLObject cdolist_list_var = isa.isa( concept, UNPROVIDED, UNPROVIDED );
    SubLObject col = NIL;
    col = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      SubLObject justifications = NIL;
      final SubLObject result = get_date_for_earliest_collection_members( col );
      if( NIL != result )
      {
        justifications = ConsesLow.append( justifications, plausibility_utilities.hl_justify_asent_fast( ConsesLow.list( $const15$isa, concept, col ), $mt_for_temporal_projection$.getDynamicValue( thread ) ) );
        justifications = ConsesLow.append( justifications, plausibility_utilities.hl_justify_asent_fast( ConsesLow.list( $const149$earliestDateForCollectionMembers, col, result ), $mt_for_temporal_projection$
            .getDynamicValue( thread ) ) );
        return Values.values( result, justifications );
      }
      cdolist_list_var = cdolist_list_var.rest();
      col = cdolist_list_var.first();
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/temporal-projection-cols.lisp", position = 163760L)
  public static SubLObject get_ending_date_of_concept(final SubLObject concept)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject ending_date = bindings.variable_lookup( $sym28$_X, cycl_utilities.formula_arg0( mt_context.ask_mt_query( ConsesLow.listS( $const90$endingDate, concept, $list40 ), UNPROVIDED, UNPROVIDED,
        UNPROVIDED ) ) );
    if( NIL != ending_date )
    {
      return Values.values( ending_date, plausibility_utilities.hl_justify_asent_fast( ConsesLow.list( $const90$endingDate, concept, ending_date ), $mt_for_temporal_projection$.getDynamicValue( thread ) ) );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/temporal-projection-cols.lisp", position = 164083L)
  public static SubLObject find_time_elapsed(final SubLObject time_1, final SubLObject time_2)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    thread.resetMultipleValues();
    final SubLObject result = find_time_elapsed_for_indeterminate_terms( time_1, time_2 );
    final SubLObject justifications = thread.secondMultipleValue();
    thread.resetMultipleValues();
    if( NIL != result )
    {
      return Values.values( result, justifications );
    }
    if( NIL == isa.isa_in_any_mtP( time_1, $const150$Date ) && NIL != isa.isa_in_any_mtP( time_1, $const134$TimeInterval ) )
    {
      final SubLObject lower = map_indexicals_in_date( cycl_utilities.formula_arg1( time_1, UNPROVIDED ) );
      final SubLObject upper = map_indexicals_in_date( cycl_utilities.formula_arg2( time_1, UNPROVIDED ) );
      if( NIL != mt_context.ask_mt_query( ConsesLow.list( $const62$laterThan, time_2, upper ), UNPROVIDED, UNPROVIDED, UNPROVIDED ) )
      {
        return bindings.variable_lookup( $sym28$_X, cycl_utilities.formula_arg0( mt_context.ask_mt_query( ConsesLow.listS( $const21$timeElapsed, upper, time_2, $list40 ), UNPROVIDED, UNPROVIDED, UNPROVIDED ) ) );
      }
      if( NIL != mt_context.ask_mt_query( ConsesLow.list( $const62$laterThan, lower, time_2 ), UNPROVIDED, UNPROVIDED, UNPROVIDED ) )
      {
        return bindings.variable_lookup( $sym28$_X, cycl_utilities.formula_arg0( mt_context.ask_mt_query( ConsesLow.listS( $const21$timeElapsed, lower, time_2, $list40 ), UNPROVIDED, UNPROVIDED, UNPROVIDED ) ) );
      }
    }
    if( NIL == isa.isa_in_any_mtP( time_2, $const150$Date ) && NIL != isa.isa_in_any_mtP( time_2, $const134$TimeInterval ) )
    {
      final SubLObject lower = map_indexicals_in_date( cycl_utilities.formula_arg1( time_2, UNPROVIDED ) );
      final SubLObject upper = map_indexicals_in_date( cycl_utilities.formula_arg2( time_2, UNPROVIDED ) );
      if( NIL != mt_context.ask_mt_query( ConsesLow.list( $const62$laterThan, time_1, upper ), UNPROVIDED, UNPROVIDED, UNPROVIDED ) )
      {
        return bindings.variable_lookup( $sym28$_X, cycl_utilities.formula_arg0( mt_context.ask_mt_query( ConsesLow.listS( $const21$timeElapsed, upper, time_1, $list40 ), UNPROVIDED, UNPROVIDED, UNPROVIDED ) ) );
      }
      if( NIL != mt_context.ask_mt_query( ConsesLow.list( $const62$laterThan, lower, time_1 ), UNPROVIDED, UNPROVIDED, UNPROVIDED ) )
      {
        return bindings.variable_lookup( $sym28$_X, cycl_utilities.formula_arg0( mt_context.ask_mt_query( ConsesLow.listS( $const21$timeElapsed, lower, time_1, $list40 ), UNPROVIDED, UNPROVIDED, UNPROVIDED ) ) );
      }
    }
    return bindings.variable_lookup( $sym28$_X, cycl_utilities.formula_arg0( mt_context.ask_mt_query( ConsesLow.listS( $const21$timeElapsed, time_1, time_2, $list40 ), UNPROVIDED, UNPROVIDED, UNPROVIDED ) ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/temporal-projection-cols.lisp", position = 165595L)
  public static SubLObject find_time_elapsed_for_indeterminate_terms(final SubLObject time_1, final SubLObject time_2)
  {
    if( NIL == mt_context.ask_mt_query( ConsesLow.listS( $const155$quotedIsa, time_1, $list156 ), UNPROVIDED, UNPROVIDED, UNPROVIDED ) && NIL == mt_context.ask_mt_query( ConsesLow.listS( $const155$quotedIsa, time_2,
        $list156 ), UNPROVIDED, UNPROVIDED, UNPROVIDED ) )
    {
      return NIL;
    }
    final SubLObject v_answer = bindings.variable_lookup( $sym28$_X, cycl_utilities.formula_arg0( mt_context.ask_mt_query( ConsesLow.list( $const157$valueEquals, $sym28$_X, ConsesLow.list( $const158$TimeElapsedFn,
        time_2, time_1 ) ), UNPROVIDED, UNPROVIDED, UNPROVIDED ) ) );
    if( NIL == v_answer )
    {
      return NIL;
    }
    final SubLObject supporting_assertion = czer_meta.find_assertion_cycl( ConsesLow.list( $const157$valueEquals, v_answer, ConsesLow.list( $const158$TimeElapsedFn, time_2, time_1 ) ), UNPROVIDED );
    if( NIL != supporting_assertion )
    {
      return Values.values( v_answer, ConsesLow.list( supporting_assertion ) );
    }
    return v_answer;
  }

  @SubLTranslatedFile.SubL(source = "cycl/temporal-projection-cols.lisp", position = 166244L)
  public static SubLObject mt_later_thanP(final SubLObject time_1, final SubLObject time_2)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    return Values.values( mt_context.ask_mt_query( ConsesLow.list( $const62$laterThan, time_1, time_2 ), UNPROVIDED, UNPROVIDED, UNPROVIDED ), plausibility_utilities.hl_justify_asent_fast( ConsesLow.list(
        $const62$laterThan, time_1, time_2 ), $mt_for_temporal_projection$.getDynamicValue( thread ) ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/temporal-projection-cols.lisp", position = 166464L)
  public static SubLObject at_least_one_point_is_later_thanP(final SubLObject time_1, final SubLObject time_2)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL != isa.isa_in_any_mtP( time_1, $const150$Date ) )
    {
      return mt_later_thanP( time_1, time_2 );
    }
    if( time_1.isList() )
    {
      final SubLObject upper = cycl_utilities.formula_arg2( time_1, UNPROVIDED );
      SubLObject justifications = NIL;
      final SubLObject function = cycl_utilities.formula_arg0( time_1 );
      if( ( function.eql( $const130$TimeIntervalBetweenFn ) || function.eql( $const10$TimeIntervalInclusiveFn ) ) && NIL != mt_context.ask_mt_query( ConsesLow.list( $const62$laterThan, upper, time_2 ), NIL,
          $mt_for_temporal_projection$.getDynamicValue( thread ), UNPROVIDED ) )
      {
        justifications = ConsesLow.append( justifications, plausibility_utilities.hl_justify_asent_fast( ConsesLow.list( $const62$laterThan, upper, time_2 ), $mt_for_temporal_projection$.getDynamicValue( thread ) ) );
        return Values.values( T, justifications );
      }
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/temporal-projection-cols.lisp", position = 167196L)
  public static SubLObject at_least_one_point_is_before_thanP(final SubLObject time_1, final SubLObject time_2)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL != isa.isa_in_any_mtP( time_1, $const150$Date ) )
    {
      return mt_later_thanP( time_2, time_1 );
    }
    if( time_1.isList() )
    {
      final SubLObject lower = cycl_utilities.formula_arg1( time_1, UNPROVIDED );
      SubLObject justifications = NIL;
      final SubLObject function = cycl_utilities.formula_arg0( time_1 );
      if( ( function.eql( $const130$TimeIntervalBetweenFn ) || function.eql( $const10$TimeIntervalInclusiveFn ) ) && NIL != mt_context.ask_mt_query( ConsesLow.list( $const62$laterThan, time_2, lower ), NIL,
          $mt_for_temporal_projection$.getDynamicValue( thread ), UNPROVIDED ) )
      {
        justifications = ConsesLow.append( justifications, plausibility_utilities.hl_justify_asent_fast( ConsesLow.list( $const62$laterThan, time_2, lower ), $mt_for_temporal_projection$.getDynamicValue( thread ) ) );
        return Values.values( T, justifications );
      }
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/temporal-projection-cols.lisp", position = 167920L)
  public static SubLObject all_points_are_before_thanP(final SubLObject time_1, final SubLObject time_2)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject justifications = NIL;
    if( NIL != isa.isa_in_any_mtP( time_1, $const150$Date ) )
    {
      return mt_later_thanP( time_2, time_1 );
    }
    if( time_1.isList() )
    {
      final SubLObject upper = map_indexicals_in_date( cycl_utilities.formula_arg2( time_1, UNPROVIDED ) );
      if( NIL != mt_context.ask_mt_query( ConsesLow.list( $const62$laterThan, time_2, upper ), UNPROVIDED, UNPROVIDED, UNPROVIDED ) )
      {
        justifications = plausibility_utilities.hl_justify_asent_fast( ConsesLow.list( $const62$laterThan, time_2, upper ), $mt_for_temporal_projection$.getDynamicValue( thread ) );
        return Values.values( T, justifications );
      }
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/temporal-projection-cols.lisp", position = 168466L)
  public static SubLObject all_points_are_after_thanP(final SubLObject time_1, final SubLObject time_2)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject justifications = NIL;
    if( NIL != isa.isa_in_any_mtP( time_1, $const150$Date ) )
    {
      return mt_later_thanP( time_1, time_2 );
    }
    if( time_1.isList() )
    {
      final SubLObject lower = map_indexicals_in_date( cycl_utilities.formula_arg1( time_1, UNPROVIDED ) );
      if( NIL != mt_context.ask_mt_query( ConsesLow.list( $const62$laterThan, lower, time_2 ), UNPROVIDED, UNPROVIDED, UNPROVIDED ) )
      {
        justifications = plausibility_utilities.hl_justify_asent_fast( ConsesLow.list( $const62$laterThan, lower, time_2 ), $mt_for_temporal_projection$.getDynamicValue( thread ) );
        return Values.values( T, justifications );
      }
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/temporal-projection-cols.lisp", position = 169010L)
  public static SubLObject get_last_time_point_of(final SubLObject time)
  {
    if( NIL != isa.isa_in_any_mtP( time, $const150$Date ) )
    {
      return time;
    }
    if( time.isList() )
    {
      final SubLObject function = cycl_utilities.formula_arg0( time );
      if( function.eql( $const10$TimeIntervalInclusiveFn ) || function.eql( $const130$TimeIntervalBetweenFn ) )
      {
        final SubLObject ret_value = cycl_utilities.formula_arg2( time, UNPROVIDED );
        if( ret_value.eql( $const131$Now ) )
        {
          return bindings.variable_lookup( $sym28$_X, cycl_utilities.formula_arg0( mt_context.ask_mt_query( $list135, UNPROVIDED, UNPROVIDED, UNPROVIDED ) ) );
        }
        return ret_value;
      }
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/temporal-projection-cols.lisp", position = 169555L)
  public static SubLObject verify_temporal_relation(final SubLObject relation, final SubLObject time_1, final SubLObject time_2)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL != isa.isa_in_any_mtP( time_1, $const150$Date ) && NIL != isa.isa_in_any_mtP( time_2, $const150$Date ) )
    {
      final SubLObject v_answer = mt_context.ask_mt_query( ConsesLow.list( relation, time_1, time_2 ), UNPROVIDED, UNPROVIDED, UNPROVIDED );
      if( NIL != v_answer )
      {
        return Values.values( T, plausibility_utilities.hl_justify_asent_fast( ConsesLow.list( relation, time_1, time_2 ), $mt_for_temporal_projection$.getDynamicValue( thread ) ) );
      }
    }
    if( relation.eql( $const62$laterThan ) )
    {
      final SubLObject time_3 = get_first_time_point_of( time_1 );
      final SubLObject time_4 = get_last_time_point_of( time_2 );
      final SubLObject v_answer2 = mt_context.ask_mt_query( ConsesLow.list( relation, time_3, time_4 ), UNPROVIDED, UNPROVIDED, UNPROVIDED );
      if( NIL != v_answer2 )
      {
        return Values.values( T, plausibility_utilities.hl_justify_asent_fast( ConsesLow.list( relation, time_3, time_4 ), $mt_for_temporal_projection$.getDynamicValue( thread ) ) );
      }
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/temporal-projection-cols.lisp", position = 170281L)
  public static SubLObject get_first_time_point_of(final SubLObject time)
  {
    if( NIL != isa.isa_in_any_mtP( time, $const150$Date ) )
    {
      return time;
    }
    if( time.isList() )
    {
      final SubLObject function = cycl_utilities.formula_arg0( time );
      if( function.eql( $const10$TimeIntervalInclusiveFn ) || function.eql( $const130$TimeIntervalBetweenFn ) )
      {
        return cycl_utilities.formula_arg1( time, UNPROVIDED );
      }
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/temporal-projection-cols.lisp", position = 170633L)
  public static SubLObject convert_to_unit(final SubLObject scalar, final SubLObject unit)
  {
    return quantities.convert_quantity( unit, scalar );
  }

  @SubLTranslatedFile.SubL(source = "cycl/temporal-projection-cols.lisp", position = 171064L)
  public static SubLObject error_fn(final SubLObject var1)
  {
    SubLObject var2 = ZERO_INTEGER;
    if( var1.numG( ZERO_INTEGER ) )
    {
      var2 = var1;
    }
    if( var1.numL( ZERO_INTEGER ) )
    {
      var2 = Numbers.subtract( ZERO_INTEGER, var1 );
    }
    final SubLObject a1x = Numbers.multiply( $float160$0_278, var2 );
    final SubLObject a2x2 = Numbers.multiply( $float161$0_23, var2, var2 );
    final SubLObject a3x3 = Numbers.multiply( new SubLObject[] { $float162$8_999999999999999e_4, var2, var2, var2
    } );
    final SubLObject a4x4 = Numbers.multiply( new SubLObject[] { $float163$0_078, var2, var2, var2, var2
    } );
    final SubLObject sum = Numbers.add( new SubLObject[] { ONE_INTEGER, a1x, a2x2, a3x3, a4x4
    } );
    final SubLObject reci = Numbers.divide( ONE_INTEGER, Numbers.multiply( new SubLObject[] { sum, sum, sum, sum
    } ) );
    if( var1.numG( ZERO_INTEGER ) )
    {
      return Numbers.subtract( ONE_INTEGER, reci );
    }
    return Numbers.subtract( reci, ONE_INTEGER );
  }

  @SubLTranslatedFile.SubL(source = "cycl/temporal-projection-cols.lisp", position = 171521L)
  public static SubLObject find_list_of_starting_times(final SubLObject fact)
  {
    final SubLObject all_times = mt_context.ask_mt_query( ConsesLow.listS( $const1$startingPointOfIntervalForSentenc, fact, $list40 ), UNPROVIDED, UNPROVIDED, UNPROVIDED );
    SubLObject results = NIL;
    SubLObject cdolist_list_var = all_times;
    SubLObject time = NIL;
    time = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      results = ConsesLow.cons( cycl_utilities.formula_args( cycl_utilities.formula_arg0( time ), UNPROVIDED ), results );
      cdolist_list_var = cdolist_list_var.rest();
      time = cdolist_list_var.first();
    }
    return results;
  }

  @SubLTranslatedFile.SubL(source = "cycl/temporal-projection-cols.lisp", position = 171798L)
  public static SubLObject find_list_of_ending_times(final SubLObject fact)
  {
    final SubLObject all_times = mt_context.ask_mt_query( ConsesLow.listS( $const2$endingPointOfIntervalForSentence, fact, $list40 ), UNPROVIDED, UNPROVIDED, UNPROVIDED );
    SubLObject results = NIL;
    SubLObject cdolist_list_var = all_times;
    SubLObject time = NIL;
    time = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      results = ConsesLow.cons( cycl_utilities.formula_args( cycl_utilities.formula_arg0( time ), UNPROVIDED ), results );
      cdolist_list_var = cdolist_list_var.rest();
      time = cdolist_list_var.first();
    }
    return results;
  }

  @SubLTranslatedFile.SubL(source = "cycl/temporal-projection-cols.lisp", position = 172067L)
  public static SubLObject find_closest_time_after(final SubLObject time, final SubLObject list_of_times)
  {
    SubLObject current_best = cycl_utilities.formula_arg0( list_of_times );
    SubLObject cdolist_list_var = cycl_utilities.formula_args( list_of_times, UNPROVIDED );
    SubLObject entry = NIL;
    entry = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      if( NIL != mt_context.ask_mt_query( ConsesLow.list( $const62$laterThan, entry, time ), UNPROVIDED, UNPROVIDED, UNPROVIDED ) && NIL != mt_context.ask_mt_query( ConsesLow.list( $const62$laterThan, current_best,
          entry ), UNPROVIDED, UNPROVIDED, UNPROVIDED ) )
      {
        current_best = entry;
      }
      cdolist_list_var = cdolist_list_var.rest();
      entry = cdolist_list_var.first();
    }
    if( NIL != mt_context.ask_mt_query( ConsesLow.list( $const62$laterThan, current_best, time ), UNPROVIDED, UNPROVIDED, UNPROVIDED ) )
    {
      return current_best;
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/temporal-projection-cols.lisp", position = 172526L)
  public static SubLObject find_closest_time_before(final SubLObject time, final SubLObject list_of_times)
  {
    SubLObject current_best = cycl_utilities.formula_arg0( list_of_times );
    SubLObject cdolist_list_var = cycl_utilities.formula_args( list_of_times, UNPROVIDED );
    SubLObject entry = NIL;
    entry = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      if( NIL != mt_context.ask_mt_query( ConsesLow.list( $const62$laterThan, time, entry ), UNPROVIDED, UNPROVIDED, UNPROVIDED ) && ( NIL != mt_context.ask_mt_query( ConsesLow.list( $const62$laterThan, entry,
          current_best ), UNPROVIDED, UNPROVIDED, UNPROVIDED ) || NIL != mt_context.ask_mt_query( ConsesLow.list( $const62$laterThan, current_best, time ), UNPROVIDED, UNPROVIDED, UNPROVIDED ) ) )
      {
        current_best = entry;
      }
      cdolist_list_var = cdolist_list_var.rest();
      entry = cdolist_list_var.first();
    }
    if( NIL != mt_context.ask_mt_query( ConsesLow.list( $const62$laterThan, time, current_best ), UNPROVIDED, UNPROVIDED, UNPROVIDED ) )
    {
      return current_best;
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/temporal-projection-cols.lisp", position = 173058L)
  public static SubLObject create_timeline_for_assertion(final SubLObject fact)
  {
    final SubLObject starting_points = find_list_of_starting_times( fact );
    final SubLObject ending_points = find_list_of_ending_times( fact );
    SubLObject lst = NIL;
    SubLObject cdolist_list_var = starting_points;
    SubLObject entry = NIL;
    entry = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      lst = ConsesLow.cons( ConsesLow.list( entry, $sym9$S ), lst );
      cdolist_list_var = cdolist_list_var.rest();
      entry = cdolist_list_var.first();
    }
    cdolist_list_var = ending_points;
    entry = NIL;
    entry = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      lst = ConsesLow.cons( ConsesLow.list( entry, $sym8$E ), lst );
      cdolist_list_var = cdolist_list_var.rest();
      entry = cdolist_list_var.first();
    }
    return Sort.sort( lst, Symbols.symbol_function( $sym20$LIST_TIME_COMPARATOR ), UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/temporal-projection-cols.lisp", position = 173446L)
  public static SubLObject check_boundary_conditions(final SubLObject fact, final SubLObject time, final SubLObject time_line)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject justifications = NIL;
    SubLObject cdolist_list_var = time_line;
    SubLObject entry = NIL;
    entry = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      if( NIL != mt_context.ask_mt_query( ConsesLow.list( $const11$temporallySubsumes, cycl_utilities.formula_arg0( entry ), time ), UNPROVIDED, UNPROVIDED, UNPROVIDED ) )
      {
        justifications = ConsesLow.append( justifications, plausibility_utilities.hl_justify_asent_fast( ConsesLow.list( $const11$temporallySubsumes, cycl_utilities.formula_arg0( entry ), time ),
            $mt_for_temporal_projection$.getDynamicValue( thread ) ) );
        if( cycl_utilities.formula_arg1( entry, UNPROVIDED ).eql( $sym9$S ) )
        {
          justifications = ConsesLow.append( justifications, plausibility_utilities.hl_justify_asent_fast( ConsesLow.list( $const164$startingPointOfSubIntervalForAsse, fact, time ), $mt_for_temporal_projection$
              .getDynamicValue( thread ) ) );
          return Values.values( narts_high.find_nart( $uniform_distribution_with_value_one$.getDynamicValue( thread ) ), NIL, justifications );
        }
        if( cycl_utilities.formula_arg1( entry, UNPROVIDED ).eql( $sym8$E ) )
        {
          justifications = ConsesLow.append( justifications, plausibility_utilities.hl_justify_asent_fast( ConsesLow.list( $const165$endingPointOfSubIntervalForAssert, fact, time ), $mt_for_temporal_projection$
              .getDynamicValue( thread ) ) );
          return Values.values( narts_high.find_nart( $uniform_distribution_with_value_zero$.getDynamicValue( thread ) ), NIL, justifications );
        }
      }
      cdolist_list_var = cdolist_list_var.rest();
      entry = cdolist_list_var.first();
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/temporal-projection-cols.lisp", position = 174468L)
  public static SubLObject find_closest_time_around_time_point(final SubLObject time, final SubLObject time_line)
  {
    SubLObject prev = NIL;
    SubLObject cdolist_list_var = time_line;
    SubLObject entry = NIL;
    entry = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      if( NIL != mt_context.ask_mt_query( ConsesLow.list( $const62$laterThan, cycl_utilities.formula_arg0( entry ), time ), UNPROVIDED, UNPROVIDED, UNPROVIDED ) )
      {
        return Values.values( prev, entry );
      }
      prev = entry;
      cdolist_list_var = cdolist_list_var.rest();
      entry = cdolist_list_var.first();
    }
    return Values.values( prev, NIL );
  }

  @SubLTranslatedFile.SubL(source = "cycl/temporal-projection-cols.lisp", position = 174769L)
  public static SubLObject find_most_specific_assertion(final SubLObject set_of_all_consistent_assertions)
  {
    if( Sequences.length( set_of_all_consistent_assertions ).numE( ONE_INTEGER ) )
    {
      return cycl_utilities.formula_arg0( set_of_all_consistent_assertions );
    }
    SubLObject rejected = NIL;
    SubLObject cdolist_list_var = set_of_all_consistent_assertions;
    SubLObject assertion_1 = NIL;
    assertion_1 = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      SubLObject cdolist_list_var_$33 = set_of_all_consistent_assertions;
      SubLObject assertion_2 = NIL;
      assertion_2 = cdolist_list_var_$33.first();
      while ( NIL != cdolist_list_var_$33)
      {
        final SubLObject gaf_1 = assertions_high.gaf_formula( assertion_1 );
        final SubLObject gaf_2 = assertions_high.gaf_formula( assertion_2 );
        if( !gaf_1.equal( gaf_2 ) )
        {
          final SubLObject col_1 = cycl_utilities.formula_arg2( gaf_1, UNPROVIDED );
          final SubLObject col_2 = cycl_utilities.formula_arg2( gaf_2, UNPROVIDED );
          if( NIL != genls.genlP( col_1, col_2, $const44$EverythingPSC, UNPROVIDED ) )
          {
            rejected = ConsesLow.cons( assertion_2, rejected );
          }
        }
        cdolist_list_var_$33 = cdolist_list_var_$33.rest();
        assertion_2 = cdolist_list_var_$33.first();
      }
      cdolist_list_var = cdolist_list_var.rest();
      assertion_1 = cdolist_list_var.first();
    }
    cdolist_list_var = set_of_all_consistent_assertions;
    SubLObject assertion = NIL;
    assertion = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      if( NIL == conses_high.member( assertion, rejected, Symbols.symbol_function( EQUAL ), UNPROVIDED ) )
      {
        return assertion;
      }
      cdolist_list_var = cdolist_list_var.rest();
      assertion = cdolist_list_var.first();
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/temporal-projection-cols.lisp", position = 175616L)
  public static SubLObject find_persistence_by_combining_evidence(final SubLObject lst_of_distributions)
  {
    SubLObject result = NIL;
    SubLObject cdolist_list_var = lst_of_distributions;
    SubLObject entry = NIL;
    entry = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      result = ConsesLow.cons( calculate_persistence_likelihood( cycl_utilities.formula_arg0( entry ), cycl_utilities.formula_arg1( entry, UNPROVIDED ) ), result );
      cdolist_list_var = cdolist_list_var.rest();
      entry = cdolist_list_var.first();
    }
    return combined_evidence_for_persistence( result );
  }

  @SubLTranslatedFile.SubL(source = "cycl/temporal-projection-cols.lisp", position = 175917L)
  public static SubLObject combined_evidence_for_persistence(final SubLObject lst)
  {
    if( NIL == lst )
    {
      return NIL;
    }
    final SubLObject product = Sequences.creduce( Symbols.symbol_function( $sym166$_ ), lst, UNPROVIDED, UNPROVIDED, UNPROVIDED );
    SubLObject product_of_complements = Numbers.subtract( ONE_INTEGER, cycl_utilities.formula_arg0( lst ) );
    SubLObject cdolist_list_var = cycl_utilities.formula_args( lst, UNPROVIDED );
    SubLObject x = NIL;
    x = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      product_of_complements = Numbers.multiply( product_of_complements, Numbers.subtract( ONE_INTEGER, x ) );
      cdolist_list_var = cdolist_list_var.rest();
      x = cdolist_list_var.first();
    }
    return Numbers.divide( product, Numbers.add( product, product_of_complements ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/temporal-projection-cols.lisp", position = 176277L)
  public static SubLObject check_whether_fact_satisfies_constraints(final SubLObject bindings_list, final SubLObject constraint)
  {
    final SubLObject unwrapped_quotes = cycl_utilities.formula_arg0( cycl_utilities.formula_args( constraint, UNPROVIDED ) );
    SubLObject lst_of_constraints = NIL;
    SubLObject conditions_satisfied = T;
    if( cycl_utilities.formula_arg0( unwrapped_quotes ).eql( $const167$and ) )
    {
      lst_of_constraints = cycl_utilities.formula_args( unwrapped_quotes, UNPROVIDED );
    }
    else
    {
      lst_of_constraints = unwrapped_quotes;
    }
    SubLObject cdolist_list_var = lst_of_constraints;
    SubLObject cons = NIL;
    cons = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      if( cycl_utilities.formula_arg0( cons ).eql( $const15$isa ) && NIL == check_isa_constraint( cons, bindings_list ) )
      {
        conditions_satisfied = NIL;
      }
      cdolist_list_var = cdolist_list_var.rest();
      cons = cdolist_list_var.first();
    }
    return conditions_satisfied;
  }

  @SubLTranslatedFile.SubL(source = "cycl/temporal-projection-cols.lisp", position = 176899L)
  public static SubLObject find_assertion_matching_conditions_in_conseq(final SubLObject conditions, final SubLObject bindings_list)
  {
    SubLObject lst_of_constraints = NIL;
    SubLObject arg2 = NIL;
    SubLObject arg3 = NIL;
    final SubLObject unwrapped_quotes = cycl_utilities.formula_arg0( cycl_utilities.formula_args( conditions, UNPROVIDED ) );
    if( cycl_utilities.formula_arg0( unwrapped_quotes ).eql( $const167$and ) )
    {
      lst_of_constraints = cycl_utilities.formula_args( unwrapped_quotes, UNPROVIDED );
    }
    else
    {
      lst_of_constraints = unwrapped_quotes;
    }
    SubLObject cdolist_list_var = lst_of_constraints;
    SubLObject cons = NIL;
    cons = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      if( !cycl_utilities.formula_arg0( cons ).eql( $const15$isa ) )
      {
        final SubLObject arg1_now = cycl_utilities.formula_arg1( cons, UNPROVIDED );
        final SubLObject arg2_now = cycl_utilities.formula_arg2( cons, UNPROVIDED );
        SubLObject query = NIL;
        SubLObject final_query = NIL;
        final SubLObject pred = cycl_utilities.formula_arg0( cons );
        SubLObject result = NIL;
        SubLObject vars_with_no_bindings = NIL;
        if( NIL != collection_defns.el_variableP( arg1_now ) )
        {
          arg3 = get_binding_for_variable( arg1_now, bindings_list );
        }
        else
        {
          arg3 = arg1_now;
        }
        if( NIL == arg3 )
        {
          arg3 = arg1_now;
          vars_with_no_bindings = ConsesLow.cons( arg3, vars_with_no_bindings );
        }
        if( NIL != collection_defns.el_variableP( arg2_now ) )
        {
          arg2 = get_binding_for_variable( arg2_now, bindings_list );
        }
        else
        {
          arg2 = arg2_now;
        }
        if( NIL == arg2 )
        {
          arg2 = arg2_now;
          vars_with_no_bindings = ConsesLow.cons( arg2, vars_with_no_bindings );
        }
        query = ConsesLow.list( ConsesLow.list( pred, arg3, arg2 ) );
        SubLObject cdolist_list_var_$34 = vars_with_no_bindings;
        SubLObject var = NIL;
        var = cdolist_list_var_$34.first();
        while ( NIL != cdolist_list_var_$34)
        {
          final SubLObject new_constraint = find_constraints_for_variable_from_conditions( var, lst_of_constraints );
          if( NIL != new_constraint )
          {
            query = ConsesLow.append( query, new_constraint );
          }
          cdolist_list_var_$34 = cdolist_list_var_$34.rest();
          var = cdolist_list_var_$34.first();
        }
        if( Sequences.length( query ).numE( ONE_INTEGER ) )
        {
          final_query = cycl_utilities.formula_arg0( query );
        }
        else
        {
          final_query = query;
          final_query = ConsesLow.cons( $const167$and, final_query );
        }
        SubLObject cdolist_list_var_$35 = mt_context.ask_mt_query( final_query, UNPROVIDED, UNPROVIDED, UNPROVIDED );
        SubLObject v_answer = NIL;
        v_answer = cdolist_list_var_$35.first();
        while ( NIL != cdolist_list_var_$35)
        {
          SubLObject cdolist_list_var_$36 = vars_with_no_bindings;
          SubLObject var2 = NIL;
          var2 = cdolist_list_var_$36.first();
          while ( NIL != cdolist_list_var_$36)
          {
            final SubLObject var_value = bindings.variable_lookup( var2, v_answer );
            if( var2.eql( arg1_now ) )
            {
              arg3 = var_value;
            }
            if( var2.eql( arg2_now ) )
            {
              arg2 = var_value;
            }
            result = ConsesLow.cons( ConsesLow.list( pred, arg3, arg2 ), result );
            cdolist_list_var_$36 = cdolist_list_var_$36.rest();
            var2 = cdolist_list_var_$36.first();
          }
          cdolist_list_var_$35 = cdolist_list_var_$35.rest();
          v_answer = cdolist_list_var_$35.first();
        }
        return result;
      }
      cdolist_list_var = cdolist_list_var.rest();
      cons = cdolist_list_var.first();
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/temporal-projection-cols.lisp", position = 179139L)
  public static SubLObject find_constraints_for_variable_from_conditions(final SubLObject var, final SubLObject conditions)
  {
    SubLObject results = NIL;
    SubLObject cdolist_list_var = conditions;
    SubLObject cons = NIL;
    cons = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      if( cycl_utilities.formula_arg0( cons ).eql( $const15$isa ) && NIL != conses_high.member( var, cons, UNPROVIDED, UNPROVIDED ) )
      {
        results = ConsesLow.cons( cons, results );
      }
      cdolist_list_var = cdolist_list_var.rest();
      cons = cdolist_list_var.first();
    }
    return results;
  }

  @SubLTranslatedFile.SubL(source = "cycl/temporal-projection-cols.lisp", position = 179418L)
  public static SubLObject check_isa_constraint(final SubLObject cons, final SubLObject bindings_list)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject arg1 = cycl_utilities.formula_arg1( cons, UNPROVIDED );
    if( NIL != collection_defns.el_variableP( arg1 ) )
    {
      final SubLObject binding = get_binding_for_variable( arg1, bindings_list );
      if( NIL != binding && NIL != isa.isaP( binding, cycl_utilities.formula_arg2( cons, UNPROVIDED ), $mt_for_temporal_projection$.getDynamicValue( thread ), UNPROVIDED ) )
      {
        return T;
      }
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/temporal-projection-cols.lisp", position = 179769L)
  public static SubLObject get_binding_for_variable(final SubLObject var, final SubLObject bindings_list)
  {
    SubLObject cdolist_list_var = bindings_list;
    SubLObject pair = NIL;
    pair = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      if( var.eql( cycl_utilities.formula_arg0( pair ) ) )
      {
        return cycl_utilities.formula_arg1( pair, UNPROVIDED );
      }
      cdolist_list_var = cdolist_list_var.rest();
      pair = cdolist_list_var.first();
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/temporal-projection-cols.lisp", position = 179946L)
  public static SubLObject get_list_of_bindings_for_cons(final SubLObject cons, final SubLObject fact)
  {
    final SubLObject unwrapped = cycl_utilities.formula_arg0( cycl_utilities.formula_args( cons, UNPROVIDED ) );
    SubLObject lst_of_cons = NIL;
    SubLObject result = NIL;
    if( cycl_utilities.formula_arg0( unwrapped ).eql( $const167$and ) )
    {
      lst_of_cons = cycl_utilities.formula_args( unwrapped, UNPROVIDED );
    }
    else
    {
      lst_of_cons = unwrapped;
    }
    SubLObject cdolist_list_var = lst_of_cons;
    SubLObject constraint = NIL;
    constraint = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      if( cycl_utilities.formula_arg0( constraint ).eql( cycl_utilities.formula_arg0( fact ) ) )
      {
        if( NIL != collection_defns.el_variableP( cycl_utilities.formula_arg1( constraint, UNPROVIDED ) ) )
        {
          result = ConsesLow.cons( ConsesLow.list( cycl_utilities.formula_arg1( constraint, UNPROVIDED ), cycl_utilities.formula_arg1( fact, UNPROVIDED ) ), result );
        }
        if( NIL != collection_defns.el_variableP( cycl_utilities.formula_arg2( constraint, UNPROVIDED ) ) )
        {
          result = ConsesLow.cons( ConsesLow.list( cycl_utilities.formula_arg2( constraint, UNPROVIDED ), cycl_utilities.formula_arg2( fact, UNPROVIDED ) ), result );
        }
      }
      cdolist_list_var = cdolist_list_var.rest();
      constraint = cdolist_list_var.first();
    }
    return result;
  }

  @SubLTranslatedFile.SubL(source = "cycl/temporal-projection-cols.lisp", position = 180667L)
  public static SubLObject convert_exponential_decay_distribution_with_initial_value_fn_to_lambda_form(final SubLObject decay_fn, final SubLObject earliest_time, final SubLObject starting_time)
  {
    final SubLObject v_answer = cycl_utilities.formula_arg0( mt_context.ask_mt_query( ConsesLow.list( $const118$exponentialDecayDistributionWithI, $sym28$_X, $sym29$_Y, decay_fn ), UNPROVIDED, UNPROVIDED, UNPROVIDED ) );
    final SubLObject parameter = bindings.variable_lookup( $sym29$_Y, v_answer );
    final SubLObject upper_bound = bindings.variable_lookup( $sym28$_X, v_answer );
    final SubLObject gap_between_starting_times = find_time_elapsed( earliest_time, starting_time );
    final SubLObject gap_2 = cycl_utilities.formula_arg1( convert_to_unit( gap_between_starting_times, $const168$MonthsDuration ), UNPROVIDED );
    final SubLObject parameter_2 = cycl_utilities.formula_arg1( convert_to_unit( parameter, $const168$MonthsDuration ), UNPROVIDED );
    if( cycl_utilities.formula_arg1( gap_between_starting_times, UNPROVIDED ).eql( ZERO_INTEGER ) )
    {
      return ConsesLow.list( $const169$Lambda, $list40, ConsesLow.list( $const170$TimesFn, upper_bound, ConsesLow.list( $const171$ExponentFn, $float172$2_78, ConsesLow.list( $const173$MinusFn, ConsesLow.list(
          $const53$QuotientFn, $sym28$_X, parameter_2 ) ) ) ) );
    }
    return ConsesLow.list( $const169$Lambda, $list40, ConsesLow.list( $const170$TimesFn, upper_bound, ConsesLow.list( $const171$ExponentFn, $float172$2_78, ConsesLow.list( $const173$MinusFn, ConsesLow.list(
        $const53$QuotientFn, ConsesLow.list( $const61$DifferenceFn, $sym28$_X, gap_2 ), parameter_2 ) ) ) ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/temporal-projection-cols.lisp", position = 181603L)
  public static SubLObject get_date_for_earliest_collection_members(final SubLObject concept)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    return bindings.variable_lookup( $sym28$_X, cycl_utilities.formula_arg0( inference_kernel.new_cyc_query( ConsesLow.listS( $const149$earliestDateForCollectionMembers, concept, $list40 ), $mt_for_temporal_projection$
        .getDynamicValue( thread ), ConsesLow.list( new SubLObject[]
        { $kw174$INFERENCE_MODE, $kw175$MINIMAL, $kw176$ALLOW_INDETERMINATE_RESULTS_, NIL, $kw177$DISJUNCTION_FREE_EL_VARS_POLICY, $kw178$COMPUTE_INTERSECTION, $kw179$TRANSFORMATION_ALLOWED_, NIL,
          $kw180$ADD_RESTRICTION_LAYER_OF_INDIRECTION_, T, $kw181$NEW_TERMS_ALLOWED_, NIL, $kw182$COMPUTE_ANSWER_JUSTIFICATIONS_, T, $kw183$MAX_NUMBER, ONE_INTEGER, $kw184$MAX_TIME, $float185$0_01,
          $kw186$PROBABLY_APPROXIMATELY_DONE, $float187$1_0, $kw188$MAX_PROOF_DEPTH, FIFTEEN_INTEGER, $kw189$ANSWER_LANGUAGE, $kw190$HL, $kw191$CONTINUABLE_, NIL, $kw192$PRODUCTIVITY_LIMIT, $int193$20000000
    } ) ) ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/temporal-projection-cols.lisp", position = 182297L)
  public static SubLObject recursive_temporal_projection_queryP(final SubLObject fact, final SubLObject time)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject cdolist_list_var = $temporal_projection_stack$.getDynamicValue( thread );
    SubLObject entry = NIL;
    entry = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      if( fact.equal( cycl_utilities.formula_arg0( entry ) ) && time.equal( cycl_utilities.formula_arg1( entry, UNPROVIDED ) ) )
      {
        return T;
      }
      cdolist_list_var = cdolist_list_var.rest();
      entry = cdolist_list_var.first();
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/temporal-projection-cols.lisp", position = 182551L)
  public static SubLObject find_earliest_event(final SubLObject lst)
  {
    SubLObject earliest_time = cycl_utilities.formula_arg2( cycl_utilities.formula_arg0( lst ), UNPROVIDED );
    SubLObject cdolist_list_var = lst;
    SubLObject entry = NIL;
    entry = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      final SubLObject current_time = cycl_utilities.formula_arg2( entry, UNPROVIDED );
      if( NIL != mt_context.ask_mt_query( ConsesLow.list( $const62$laterThan, earliest_time, current_time ), UNPROVIDED, UNPROVIDED, UNPROVIDED ) )
      {
        earliest_time = current_time;
      }
      cdolist_list_var = cdolist_list_var.rest();
      entry = cdolist_list_var.first();
    }
    return earliest_time;
  }

  @SubLTranslatedFile.SubL(source = "cycl/temporal-projection-cols.lisp", position = 182879L)
  public static SubLObject get_prior_probability_for_pattern(final SubLObject pattern, final SubLObject bindings_list)
  {
    final SubLObject unwrapped = cycl_utilities.formula_arg0( cycl_utilities.formula_args( pattern, UNPROVIDED ) );
    SubLObject conditions = NIL;
    if( cycl_utilities.formula_arg0( unwrapped ).eql( $const167$and ) )
    {
      conditions = cycl_utilities.formula_args( unwrapped, UNPROVIDED );
    }
    else
    {
      conditions = unwrapped;
    }
    SubLObject cdolist_list_var = conditions;
    SubLObject condition = NIL;
    condition = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      final SubLObject pred = cycl_utilities.formula_arg0( condition );
      if( !pred.eql( $const15$isa ) )
      {
        SubLObject cdolist_list_var_$37;
        final SubLObject all_assertions = cdolist_list_var_$37 = kb_mapping_utilities.pred_value_gafs_in_any_mt( pred, $const194$priorProbabilityForPredicate_Type, ONE_INTEGER, UNPROVIDED );
        SubLObject assertion = NIL;
        assertion = cdolist_list_var_$37.first();
        while ( NIL != cdolist_list_var_$37)
        {
          final SubLObject gaf = assertions_high.gaf_formula( assertion );
          if( NIL != test_constraints_for_arg_position( gaf, condition, conditions, bindings_list, ONE_INTEGER ) && NIL != test_constraints_for_arg_position( gaf, condition, conditions, bindings_list, TWO_INTEGER ) )
          {
            return Values.values( cycl_utilities.formula_arg4( gaf, UNPROVIDED ), assertion );
          }
          cdolist_list_var_$37 = cdolist_list_var_$37.rest();
          assertion = cdolist_list_var_$37.first();
        }
      }
      cdolist_list_var = cdolist_list_var.rest();
      condition = cdolist_list_var.first();
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/temporal-projection-cols.lisp", position = 183798L)
  public static SubLObject test_constraints_for_arg_position(final SubLObject gaf, final SubLObject condition, final SubLObject conditions, final SubLObject bindings_list, final SubLObject pos)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject var = NIL;
    SubLObject col = NIL;
    if( pos.numE( ONE_INTEGER ) )
    {
      col = cycl_utilities.formula_arg2( gaf, UNPROVIDED );
      var = cycl_utilities.formula_arg1( condition, UNPROVIDED );
    }
    if( pos.numE( TWO_INTEGER ) )
    {
      col = cycl_utilities.formula_arg3( gaf, UNPROVIDED );
      var = cycl_utilities.formula_arg2( condition, UNPROVIDED );
    }
    SubLObject cdolist_list_var = conditions;
    SubLObject cond_1 = NIL;
    cond_1 = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      if( cycl_utilities.formula_arg0( cond_1 ).eql( $const15$isa ) && cycl_utilities.formula_arg1( cond_1, UNPROVIDED ).eql( var ) )
      {
        SubLObject col_1 = cycl_utilities.formula_arg2( cond_1, UNPROVIDED );
        if( col_1.isList() )
        {
          col_1 = narts_high.find_nart( col_1 );
        }
        if( NIL != genls.genlP( col_1, col, UNPROVIDED, UNPROVIDED ) )
        {
          return T;
        }
      }
      cdolist_list_var = cdolist_list_var.rest();
      cond_1 = cdolist_list_var.first();
    }
    cdolist_list_var = bindings_list;
    SubLObject binding = NIL;
    binding = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      if( cycl_utilities.formula_arg0( binding ).eql( var ) && NIL != isa.isaP( cycl_utilities.formula_arg1( binding, UNPROVIDED ), col, $mt_for_temporal_projection$.getDynamicValue( thread ), UNPROVIDED ) )
      {
        return T;
      }
      cdolist_list_var = cdolist_list_var.rest();
      binding = cdolist_list_var.first();
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/temporal-projection-cols.lisp", position = 184668L)
  public static SubLObject generate_powerset(final SubLObject lst)
  {
    if( NIL == lst )
    {
      return ConsesLow.list( NIL );
    }
    final SubLObject prev = generate_powerset( cycl_utilities.formula_args( lst, UNPROVIDED ) );
    $tp_current_var$.setDynamicValue( cycl_utilities.formula_arg0( lst ) );
    return ConsesLow.append( Mapping.mapcar( Symbols.symbol_function( $sym195$LAMBDA_FUNCTION_ELT ), prev ), prev );
  }

  @SubLTranslatedFile.SubL(source = "cycl/temporal-projection-cols.lisp", position = 184980L)
  public static SubLObject lambda_function_elt(final SubLObject x)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    return ConsesLow.cons( $tp_current_var$.getDynamicValue( thread ), x );
  }

  @SubLTranslatedFile.SubL(source = "cycl/temporal-projection-cols.lisp", position = 185056L)
  public static SubLObject time_falls_in_temporal_interval(final SubLObject interval, final SubLObject time)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject lower_bound = NIL;
    SubLObject upper_bound = NIL;
    SubLObject justifications = NIL;
    if( cycl_utilities.formula_arg0( interval ).eql( $const130$TimeIntervalBetweenFn ) )
    {
      lower_bound = cycl_utilities.formula_arg1( interval, UNPROVIDED );
      upper_bound = cycl_utilities.formula_arg2( interval, UNPROVIDED );
      if( NIL != mt_context.ask_mt_query( ConsesLow.list( $const62$laterThan, time, lower_bound ), UNPROVIDED, UNPROVIDED, UNPROVIDED ) && NIL != mt_context.ask_mt_query( ConsesLow.list( $const62$laterThan, upper_bound,
          time ), UNPROVIDED, UNPROVIDED, UNPROVIDED ) )
      {
        justifications = ConsesLow.append( justifications, plausibility_utilities.hl_justify_asent_fast( ConsesLow.list( $const62$laterThan, time, lower_bound ), $mt_for_temporal_projection$.getDynamicValue(
            thread ) ) );
        justifications = ConsesLow.append( justifications, plausibility_utilities.hl_justify_asent_fast( ConsesLow.list( $const62$laterThan, upper_bound, time ), $mt_for_temporal_projection$.getDynamicValue(
            thread ) ) );
        return Values.values( T, justifications );
      }
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/temporal-projection-cols.lisp", position = 185847L)
  public static SubLObject handle_distribution_for_termination_of_membership(final SubLObject fact, final SubLObject time)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject entity = cycl_utilities.formula_arg1( fact, UNPROVIDED );
    SubLObject col = cycl_utilities.formula_arg2( fact, UNPROVIDED );
    SubLObject col_changed = NIL;
    if( NIL != isa.isa_in_any_mtP( entity, $const196$HomoSapiens ) && col.eql( $const151$BiologicalLivingObject ) )
    {
      col = $const196$HomoSapiens;
      col_changed = T;
    }
    SubLObject cdolist_list_var = isa.all_isa_in_any_mt( entity );
    SubLObject c = NIL;
    c = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      if( c.equal( col ) )
      {
        final SubLObject all_assertions = kb_mapping_utilities.pred_value_gafs_in_any_mt( col, $const197$distributionForTerminationOfMembe, ONE_INTEGER, UNPROVIDED );
        if( NIL != all_assertions )
        {
          thread.resetMultipleValues();
          final SubLObject ret_value = find_probability_of_belonging_to_collection( entity, c, time, all_assertions );
          SubLObject justifications = thread.secondMultipleValue();
          thread.resetMultipleValues();
          if( NIL != ret_value )
          {
            if( NIL != col_changed )
            {
              justifications = ConsesLow.append( justifications, plausibility_utilities.hl_justify_asent_fast( $list198, $mt_for_temporal_projection$.getDynamicValue( thread ) ) );
            }
            return Values.values( ret_value, justifications );
          }
        }
      }
      cdolist_list_var = cdolist_list_var.rest();
      c = cdolist_list_var.first();
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/temporal-projection-cols.lisp", position = 186943L)
  public static SubLObject find_probability_of_belonging_to_collection(final SubLObject entity, final SubLObject col, final SubLObject time, final SubLObject all_assertions)
  {
    SubLObject closest_date = get_closest_time_for_assertion( ConsesLow.list( $const15$isa, entity, col ), time );
    final SubLObject starting_date = get_starting_date_of_concept( entity );
    if( NIL == closest_date )
    {
      closest_date = starting_date;
    }
    if( NIL != closest_date && NIL != starting_date )
    {
      final SubLObject gaf = assertions_high.gaf_formula( cycl_utilities.formula_arg0( all_assertions ) );
      final SubLObject duration = cycl_utilities.formula_arg4( gaf, UNPROVIDED );
      final SubLObject duration_unit = cycl_utilities.formula_arg0( duration );
      final SubLObject time_elapsed = convert_to_unit( find_time_elapsed( starting_date, time ), duration_unit );
      final SubLObject time_elapsed_since_start = convert_to_unit( find_time_elapsed( closest_date, starting_date ), duration_unit );
      return calculate_probability_using_life_tables( time_elapsed, all_assertions, duration, time_elapsed_since_start );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/temporal-projection-cols.lisp", position = 187831L)
  public static SubLObject calculate_probability_using_life_tables(final SubLObject time_elapsed, final SubLObject all_assertions, final SubLObject duration, final SubLObject time_elapsed_since_start)
  {
    if( NIL == time_elapsed || NIL == time_elapsed_since_start )
    {
      return NIL;
    }
    final SubLObject no_of_iterations_total = bindings.variable_lookup( $sym28$_X, cycl_utilities.formula_arg0( mt_context.ask_mt_query( ConsesLow.list( $const51$evaluate, $sym28$_X, ConsesLow.list( $const53$QuotientFn,
        ConsesLow.list( $const61$DifferenceFn, time_elapsed, time_elapsed_since_start ), duration ) ), UNPROVIDED, UNPROVIDED, UNPROVIDED ) ) );
    final SubLObject no_of_iterations = Numbers.floor( no_of_iterations_total, UNPROVIDED );
    SubLObject current_value = time_elapsed_since_start;
    SubLObject current_ret_value = ONE_INTEGER;
    SubLObject justifications = NIL;
    SubLObject count;
    SubLObject assertion;
    SubLObject gaf;
    SubLObject dist;
    SubLObject prob;
    for( count = NIL, count = ZERO_INTEGER; count.numL( no_of_iterations ); count = Numbers.add( count, ONE_INTEGER ) )
    {
      current_value = bindings.variable_lookup( $sym28$_X, cycl_utilities.formula_arg0( mt_context.ask_mt_query( ConsesLow.list( $const51$evaluate, $sym28$_X, ConsesLow.list( $const54$PlusFn, current_value, duration ) ),
          UNPROVIDED, UNPROVIDED, UNPROVIDED ) ) );
      assertion = find_relevant_distribution_at_age( all_assertions, cycl_utilities.formula_arg1( current_value, UNPROVIDED ) );
      if( NIL == assertion )
      {
        return NIL;
      }
      if( NIL != assertion )
      {
        gaf = assertions_high.gaf_formula( assertion );
        dist = cycl_utilities.formula_arg3( gaf, UNPROVIDED );
        prob = calculate_persistence_likelihood( current_value, dist );
        if( NIL != prob && prob.numE( ONE_INTEGER ) )
        {
          justifications = NIL;
        }
        if( NIL == conses_high.member( assertion, justifications, Symbols.symbol_function( EQUAL ), UNPROVIDED ) )
        {
          justifications = ConsesLow.append( justifications, ConsesLow.list( assertion ) );
        }
        if( NIL != prob )
        {
          current_ret_value = Numbers.multiply( current_ret_value, Numbers.subtract( ONE_INTEGER, prob ) );
        }
        if( prob.numE( ONE_INTEGER ) )
        {
          return Values.values( current_ret_value, justifications );
        }
        if( NIL == prob )
        {
          return NIL;
        }
      }
    }
    return Values.values( current_ret_value, justifications );
  }

  @SubLTranslatedFile.SubL(source = "cycl/temporal-projection-cols.lisp", position = 189615L)
  public static SubLObject calculate_probability_of_delay_between_events(final SubLObject time_elapsed, final SubLObject all_assertions, final SubLObject duration, final SubLObject time_elapsed_since_start)
  {
    if( NIL == time_elapsed )
    {
      return NIL;
    }
    if( NIL == duration )
    {
      return NIL;
    }
    final SubLObject no_of_iterations_total = bindings.variable_lookup( $sym28$_X, cycl_utilities.formula_arg0( mt_context.ask_mt_query( ConsesLow.list( $const51$evaluate, $sym28$_X, ConsesLow.list( $const53$QuotientFn,
        ConsesLow.list( $const61$DifferenceFn, time_elapsed, time_elapsed_since_start ), duration ) ), UNPROVIDED, UNPROVIDED, UNPROVIDED ) ) );
    final SubLObject no_of_iterations = Numbers.floor( no_of_iterations_total, UNPROVIDED );
    SubLObject current_value = time_elapsed_since_start;
    SubLObject current_ret_value = ONE_INTEGER;
    SubLObject justifications = NIL;
    SubLObject count;
    SubLObject assertion;
    SubLObject gaf;
    SubLObject dist;
    SubLObject prob;
    for( count = NIL, count = ZERO_INTEGER; count.numL( no_of_iterations ); count = Numbers.add( count, ONE_INTEGER ) )
    {
      current_value = bindings.variable_lookup( $sym28$_X, cycl_utilities.formula_arg0( mt_context.ask_mt_query( ConsesLow.list( $const51$evaluate, $sym28$_X, ConsesLow.list( $const54$PlusFn, current_value, duration ) ),
          UNPROVIDED, UNPROVIDED, UNPROVIDED ) ) );
      assertion = find_relevant_distribution_for_delay_between_events( all_assertions, cycl_utilities.formula_arg1( current_value, UNPROVIDED ) );
      if( NIL == assertion )
      {
        return NIL;
      }
      if( NIL != assertion )
      {
        gaf = assertions_high.gaf_formula( assertion );
        dist = cycl_utilities.formula_arg5( gaf, UNPROVIDED );
        prob = calculate_persistence_likelihood( current_value, dist );
        if( NIL != prob && prob.numE( ONE_INTEGER ) )
        {
          justifications = NIL;
        }
        if( NIL == conses_high.member( assertion, justifications, Symbols.symbol_function( EQUAL ), UNPROVIDED ) )
        {
          justifications = ConsesLow.append( justifications, ConsesLow.list( assertion ) );
        }
        if( NIL != prob )
        {
          if( NIL != last_iterationP( current_value, time_elapsed, duration ) )
          {
            current_ret_value = Numbers.multiply( current_ret_value, prob );
          }
          else
          {
            current_ret_value = Numbers.multiply( current_ret_value, Numbers.subtract( ONE_INTEGER, prob ) );
          }
          if( prob.numE( ONE_INTEGER ) )
          {
            return Values.values( current_ret_value, justifications );
          }
          if( NIL == prob )
          {
            return NIL;
          }
        }
      }
    }
    return Values.values( current_ret_value, justifications );
  }

  @SubLTranslatedFile.SubL(source = "cycl/temporal-projection-cols.lisp", position = 191597L)
  public static SubLObject last_iterationP(final SubLObject current_value, final SubLObject time_elapsed, final SubLObject duration)
  {
    final SubLObject diff = bindings.variable_lookup( $sym28$_X, cycl_utilities.formula_arg0( mt_context.ask_mt_query( ConsesLow.list( $const51$evaluate, $sym28$_X, ConsesLow.list( $const61$DifferenceFn, time_elapsed,
        current_value ) ), UNPROVIDED, UNPROVIDED, UNPROVIDED ) ) );
    if( NIL != mt_context.ask_mt_query( ConsesLow.list( $const56$lessThan, diff, duration ), UNPROVIDED, UNPROVIDED, UNPROVIDED ) )
    {
      return T;
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/temporal-projection-cols.lisp", position = 191894L)
  public static SubLObject find_relevant_distribution_at_age(final SubLObject all_assertions, final SubLObject value)
  {
    SubLObject cdolist_list_var = all_assertions;
    SubLObject assertion = NIL;
    assertion = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      final SubLObject gaf = assertions_high.gaf_formula( assertion );
      final SubLObject age_interval = cycl_utilities.formula_arg2( gaf, UNPROVIDED );
      final SubLObject lower = cycl_utilities.formula_arg1( age_interval, UNPROVIDED );
      final SubLObject upper = cycl_utilities.formula_arg2( age_interval, UNPROVIDED );
      if( !lower.numG( value ) && upper.numG( value ) )
      {
        return assertion;
      }
      cdolist_list_var = cdolist_list_var.rest();
      assertion = cdolist_list_var.first();
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/temporal-projection-cols.lisp", position = 192312L)
  public static SubLObject find_relevant_distribution_for_delay_between_events(final SubLObject all_assertions, final SubLObject value)
  {
    SubLObject cdolist_list_var = all_assertions;
    SubLObject assertion = NIL;
    assertion = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      final SubLObject gaf = assertions_high.gaf_formula( assertion );
      final SubLObject age_interval = cycl_utilities.formula_arg4( gaf, UNPROVIDED );
      final SubLObject lower = cycl_utilities.formula_arg1( age_interval, UNPROVIDED );
      final SubLObject upper = cycl_utilities.formula_arg2( age_interval, UNPROVIDED );
      if( !lower.numG( value ) && upper.numG( value ) )
      {
        return assertion;
      }
      cdolist_list_var = cdolist_list_var.rest();
      assertion = cdolist_list_var.first();
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/temporal-projection-cols.lisp", position = 192739L)
  public static SubLObject find_relevant_distribution_for_transition(final SubLObject all_assertions, final SubLObject value)
  {
    SubLObject cdolist_list_var = all_assertions;
    SubLObject assertion = NIL;
    assertion = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      final SubLObject gaf = assertions_high.gaf_formula( assertion );
      final SubLObject age_interval = cycl_utilities.formula_arg3( gaf, UNPROVIDED );
      final SubLObject lower = cycl_utilities.formula_arg1( age_interval, UNPROVIDED );
      final SubLObject upper = cycl_utilities.formula_arg2( age_interval, UNPROVIDED );
      if( !lower.numG( value ) && upper.numG( value ) )
      {
        return assertion;
      }
      cdolist_list_var = cdolist_list_var.rest();
      assertion = cdolist_list_var.first();
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/temporal-projection-cols.lisp", position = 193156L)
  public static SubLObject check_duration_of_event_type(final SubLObject fact)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject entity = cycl_utilities.formula_arg1( fact, UNPROVIDED );
    final SubLObject time = cycl_utilities.formula_arg2( fact, UNPROVIDED );
    SubLObject lower = NIL;
    SubLObject upper = NIL;
    final SubLObject starting_time = get_starting_date_of_concept( entity );
    SubLObject time_elapsed = NIL;
    SubLObject time_elapsed_since_start = NIL;
    if( !time.isList() )
    {
      return NIL;
    }
    lower = cycl_utilities.formula_arg1( time, UNPROVIDED );
    upper = cycl_utilities.formula_arg2( time, UNPROVIDED );
    if( NIL == lower || NIL == upper )
    {
      return NIL;
    }
    time_elapsed = find_time_elapsed( starting_time, upper );
    time_elapsed_since_start = find_time_elapsed( starting_time, lower );
    SubLObject cdolist_list_var = isa.all_isa_in_any_mt( entity );
    SubLObject col = NIL;
    col = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      final SubLObject all_assertions = kb_mapping_utilities.pred_value_gafs_in_any_mt( col, $const199$distributionForCalculatingDuratio, ONE_INTEGER, UNPROVIDED );
      if( NIL != all_assertions )
      {
        final SubLObject assertion = cycl_utilities.formula_arg0( all_assertions );
        final SubLObject gaf = assertions_high.gaf_formula( assertion );
        final SubLObject duration = cycl_utilities.formula_arg4( gaf, UNPROVIDED );
        if( NIL != starting_time && NIL != time_elapsed )
        {
          thread.resetMultipleValues();
          final SubLObject ret_value = calculate_probability_of_end_of_event( time_elapsed, all_assertions, duration, time_elapsed_since_start );
          final SubLObject justifications = thread.secondMultipleValue();
          thread.resetMultipleValues();
          if( NIL != ret_value )
          {
            return Values.values( ret_value, justifications );
          }
        }
      }
      cdolist_list_var = cdolist_list_var.rest();
      col = cdolist_list_var.first();
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/temporal-projection-cols.lisp", position = 194509L)
  public static SubLObject calculate_probability_of_end_of_event(final SubLObject time_elapsed, final SubLObject all_assertions, final SubLObject duration, final SubLObject time_elapsed_since_start)
  {
    if( NIL == time_elapsed )
    {
      return NIL;
    }
    final SubLObject no_of_iterations_total = bindings.variable_lookup( $sym28$_X, cycl_utilities.formula_arg0( mt_context.ask_mt_query( ConsesLow.list( $const51$evaluate, $sym28$_X, ConsesLow.list( $const53$QuotientFn,
        ConsesLow.list( $const61$DifferenceFn, time_elapsed, time_elapsed_since_start ), duration ) ), UNPROVIDED, UNPROVIDED, UNPROVIDED ) ) );
    final SubLObject no_of_iterations = Numbers.floor( no_of_iterations_total, UNPROVIDED );
    SubLObject current_value = time_elapsed_since_start;
    final SubLObject unit = cycl_utilities.formula_arg0( time_elapsed );
    SubLObject current_value_2 = reader.bq_cons( unit, $list58 );
    final SubLObject no_of_iteration_2 = Numbers.floor( bindings.variable_lookup( $sym28$_X, cycl_utilities.formula_arg0( mt_context.ask_mt_query( ConsesLow.list( $const51$evaluate, $sym28$_X, ConsesLow.list(
        $const53$QuotientFn, time_elapsed_since_start, duration ) ), UNPROVIDED, UNPROVIDED, UNPROVIDED ) ) ), UNPROVIDED );
    SubLObject current_ret_value = ZERO_INTEGER;
    SubLObject prob_of_not_ending = ONE_INTEGER;
    SubLObject justifications = NIL;
    SubLObject count;
    SubLObject assertion;
    SubLObject gaf;
    SubLObject dist;
    SubLObject prob;
    for( count = NIL, count = ZERO_INTEGER; count.numL( no_of_iteration_2 ); count = Numbers.add( count, ONE_INTEGER ) )
    {
      current_value_2 = bindings.variable_lookup( $sym28$_X, cycl_utilities.formula_arg0( mt_context.ask_mt_query( ConsesLow.list( $const51$evaluate, $sym28$_X, ConsesLow.list( $const54$PlusFn, current_value_2,
          duration ) ), UNPROVIDED, UNPROVIDED, UNPROVIDED ) ) );
      assertion = find_relevant_distribution_at_age( all_assertions, cycl_utilities.formula_arg1( current_value_2, UNPROVIDED ) );
      if( NIL == assertion )
      {
        return NIL;
      }
      if( NIL != assertion )
      {
        gaf = assertions_high.gaf_formula( assertion );
        dist = cycl_utilities.formula_arg3( gaf, UNPROVIDED );
        prob = calculate_persistence_likelihood( current_value_2, dist );
        if( NIL != prob )
        {
          prob_of_not_ending = Numbers.multiply( prob_of_not_ending, Numbers.subtract( ONE_INTEGER, prob ) );
        }
        if( NIL == conses_high.member( assertion, justifications, Symbols.symbol_function( EQUAL ), UNPROVIDED ) )
        {
          justifications = ConsesLow.append( justifications, ConsesLow.list( assertion ) );
        }
        if( NIL != prob && ( prob.numE( ONE_INTEGER ) || prob_of_not_ending.numL( $float200$9_999999999999999e_7 ) ) )
        {
          return Values.values( ZERO_INTEGER, justifications );
        }
      }
    }
    for( count = NIL, count = ZERO_INTEGER; count.numL( no_of_iterations ); count = Numbers.add( count, ONE_INTEGER ) )
    {
      current_value = bindings.variable_lookup( $sym28$_X, cycl_utilities.formula_arg0( mt_context.ask_mt_query( ConsesLow.list( $const51$evaluate, $sym28$_X, ConsesLow.list( $const54$PlusFn, current_value, duration ) ),
          UNPROVIDED, UNPROVIDED, UNPROVIDED ) ) );
      assertion = find_relevant_distribution_at_age( all_assertions, cycl_utilities.formula_arg1( current_value, UNPROVIDED ) );
      if( NIL == assertion )
      {
        return NIL;
      }
      if( NIL != assertion )
      {
        gaf = assertions_high.gaf_formula( assertion );
        dist = cycl_utilities.formula_arg3( gaf, UNPROVIDED );
        prob = calculate_persistence_likelihood( current_value, dist );
        if( NIL != prob && prob.numE( ONE_INTEGER ) )
        {
          justifications = NIL;
        }
        if( NIL == conses_high.member( assertion, justifications, Symbols.symbol_function( EQUAL ), UNPROVIDED ) )
        {
          justifications = ConsesLow.append( justifications, ConsesLow.list( assertion ) );
        }
        if( NIL != prob )
        {
          current_ret_value = Numbers.add( current_ret_value, Numbers.multiply( prob, prob_of_not_ending ) );
          prob_of_not_ending = Numbers.multiply( prob_of_not_ending, Numbers.subtract( ONE_INTEGER, prob ) );
        }
        if( Numbers.multiply( current_ret_value, prob_of_not_ending ).numG( ONE_INTEGER ) )
        {
          return Values.values( ONE_INTEGER, justifications );
        }
        if( NIL == prob )
        {
          return NIL;
        }
      }
    }
    return Values.values( current_ret_value, justifications );
  }

  @SubLTranslatedFile.SubL(source = "cycl/temporal-projection-cols.lisp", position = 197814L)
  public static SubLObject calculate_probability_of_transition_to_state(final SubLObject time_elapsed, final SubLObject all_assertions, final SubLObject duration, final SubLObject time_elapsed_since_start)
  {
    if( NIL == time_elapsed )
    {
      return NIL;
    }
    final SubLObject no_of_iterations_total = bindings.variable_lookup( $sym28$_X, cycl_utilities.formula_arg0( mt_context.ask_mt_query( ConsesLow.list( $const51$evaluate, $sym28$_X, ConsesLow.list( $const53$QuotientFn,
        ConsesLow.list( $const61$DifferenceFn, time_elapsed, time_elapsed_since_start ), duration ) ), UNPROVIDED, UNPROVIDED, UNPROVIDED ) ) );
    final SubLObject no_of_iterations = Numbers.floor( no_of_iterations_total, UNPROVIDED );
    SubLObject current_value = time_elapsed_since_start;
    final SubLObject unit = cycl_utilities.formula_arg0( time_elapsed );
    SubLObject current_value_2 = reader.bq_cons( unit, $list58 );
    final SubLObject no_of_iteration_2 = Numbers.floor( bindings.variable_lookup( $sym28$_X, cycl_utilities.formula_arg0( mt_context.ask_mt_query( ConsesLow.list( $const51$evaluate, $sym28$_X, ConsesLow.list(
        $const53$QuotientFn, time_elapsed_since_start, duration ) ), UNPROVIDED, UNPROVIDED, UNPROVIDED ) ) ), UNPROVIDED );
    SubLObject current_ret_value = ONE_INTEGER;
    SubLObject prob_of_not_ending = ONE_INTEGER;
    SubLObject justifications = NIL;
    SubLObject count;
    SubLObject assertion;
    SubLObject gaf;
    SubLObject dist;
    SubLObject prob;
    for( count = NIL, count = ZERO_INTEGER; count.numL( no_of_iteration_2 ); count = Numbers.add( count, ONE_INTEGER ) )
    {
      current_value_2 = bindings.variable_lookup( $sym28$_X, cycl_utilities.formula_arg0( mt_context.ask_mt_query( ConsesLow.list( $const51$evaluate, $sym28$_X, ConsesLow.list( $const54$PlusFn, current_value_2,
          duration ) ), UNPROVIDED, UNPROVIDED, UNPROVIDED ) ) );
      assertion = find_relevant_distribution_for_transition( all_assertions, cycl_utilities.formula_arg1( current_value_2, UNPROVIDED ) );
      if( NIL == assertion )
      {
        return ZERO_INTEGER;
      }
      if( NIL != assertion )
      {
        gaf = assertions_high.gaf_formula( assertion );
        dist = cycl_utilities.formula_arg4( gaf, UNPROVIDED );
        prob = calculate_persistence_likelihood( current_value_2, dist );
        if( NIL != prob )
        {
          prob_of_not_ending = Numbers.multiply( prob_of_not_ending, Numbers.subtract( ONE_INTEGER, prob ) );
        }
        PrintLow.format( T, $str201$___Time___a__a_Not_ending___a, new SubLObject[] { current_value_2, prob, prob_of_not_ending
        } );
        if( NIL == conses_high.member( assertion, justifications, Symbols.symbol_function( EQUAL ), UNPROVIDED ) )
        {
          justifications = ConsesLow.append( justifications, ConsesLow.list( assertion ) );
        }
        if( NIL != prob && ( prob.numE( ONE_INTEGER ) || prob_of_not_ending.numL( $float200$9_999999999999999e_7 ) ) )
        {
          return Values.values( ZERO_INTEGER, justifications );
        }
      }
    }
    for( count = NIL, count = ZERO_INTEGER; count.numL( no_of_iterations ); count = Numbers.add( count, ONE_INTEGER ) )
    {
      current_value = bindings.variable_lookup( $sym28$_X, cycl_utilities.formula_arg0( mt_context.ask_mt_query( ConsesLow.list( $const51$evaluate, $sym28$_X, ConsesLow.list( $const54$PlusFn, current_value, duration ) ),
          UNPROVIDED, UNPROVIDED, UNPROVIDED ) ) );
      assertion = find_relevant_distribution_for_transition( all_assertions, cycl_utilities.formula_arg1( current_value, UNPROVIDED ) );
      if( NIL == assertion )
      {
        return ZERO_INTEGER;
      }
      if( NIL != assertion )
      {
        gaf = assertions_high.gaf_formula( assertion );
        dist = cycl_utilities.formula_arg4( gaf, UNPROVIDED );
        prob = calculate_persistence_likelihood( current_value, dist );
        if( NIL != prob && prob.numE( ONE_INTEGER ) )
        {
          justifications = NIL;
        }
        if( NIL == conses_high.member( assertion, justifications, Symbols.symbol_function( EQUAL ), UNPROVIDED ) )
        {
          justifications = ConsesLow.append( justifications, ConsesLow.list( assertion ) );
        }
        if( NIL != prob )
        {
          if( NIL != last_iterationP( current_value, time_elapsed, duration ) )
          {
            current_ret_value = Numbers.multiply( current_ret_value, prob );
          }
          else
          {
            current_ret_value = Numbers.multiply( current_ret_value, Numbers.subtract( ONE_INTEGER, prob ) );
          }
          if( current_ret_value.numG( ONE_INTEGER ) )
          {
            return Values.values( ONE_INTEGER, justifications );
          }
          if( NIL == prob )
          {
            return NIL;
          }
        }
      }
    }
    return Values.values( current_ret_value, justifications );
  }

  @SubLTranslatedFile.SubL(source = "cycl/temporal-projection-cols.lisp", position = 201132L)
  public static SubLObject calculate_probability_of_remaining_in_state(final SubLObject time_elapsed, final SubLObject all_assertions, final SubLObject duration, final SubLObject time_elapsed_since_start)
  {
    if( NIL == time_elapsed )
    {
      return NIL;
    }
    final SubLObject no_of_iterations_total = bindings.variable_lookup( $sym28$_X, cycl_utilities.formula_arg0( mt_context.ask_mt_query( ConsesLow.list( $const51$evaluate, $sym28$_X, ConsesLow.list( $const53$QuotientFn,
        ConsesLow.list( $const61$DifferenceFn, time_elapsed, time_elapsed_since_start ), duration ) ), UNPROVIDED, UNPROVIDED, UNPROVIDED ) ) );
    final SubLObject no_of_iterations = Numbers.floor( no_of_iterations_total, UNPROVIDED );
    final SubLObject unit = cycl_utilities.formula_arg0( time_elapsed );
    SubLObject current_value_2 = reader.bq_cons( unit, $list58 );
    SubLObject prob_of_not_ending = ONE_INTEGER;
    SubLObject prob_ret = NIL;
    SubLObject justifications = NIL;
    SubLObject count;
    SubLObject assertion;
    SubLObject gaf;
    SubLObject dist;
    SubLObject prob;
    for( count = NIL, count = ZERO_INTEGER; count.numL( no_of_iterations ); count = Numbers.add( count, ONE_INTEGER ) )
    {
      current_value_2 = bindings.variable_lookup( $sym28$_X, cycl_utilities.formula_arg0( mt_context.ask_mt_query( ConsesLow.list( $const51$evaluate, $sym28$_X, ConsesLow.list( $const54$PlusFn, current_value_2,
          duration ) ), UNPROVIDED, UNPROVIDED, UNPROVIDED ) ) );
      assertion = find_relevant_distribution_for_transition( all_assertions, cycl_utilities.formula_arg1( current_value_2, UNPROVIDED ) );
      if( NIL == assertion )
      {
        return NIL;
      }
      if( NIL != assertion )
      {
        gaf = assertions_high.gaf_formula( assertion );
        dist = cycl_utilities.formula_arg4( gaf, UNPROVIDED );
        prob = calculate_persistence_likelihood( current_value_2, dist );
        if( NIL != prob )
        {
          prob_of_not_ending = Numbers.multiply( prob_of_not_ending, Numbers.subtract( ONE_INTEGER, prob ) );
        }
        if( NIL != prob )
        {
          prob_ret = Numbers.subtract( ONE_INTEGER, prob );
        }
        else
        {
          prob_ret = NIL;
        }
        if( NIL == conses_high.member( assertion, justifications, Symbols.symbol_function( EQUAL ), UNPROVIDED ) )
        {
          justifications = ConsesLow.append( justifications, ConsesLow.list( assertion ) );
        }
        if( NIL != prob && ( prob.numE( ONE_INTEGER ) || prob_of_not_ending.numL( $float200$9_999999999999999e_7 ) ) )
        {
          return Values.values( ZERO_INTEGER, justifications );
        }
      }
    }
    return Values.values( prob_ret, justifications );
  }

  @SubLTranslatedFile.SubL(source = "cycl/temporal-projection-cols.lisp", position = 203012L)
  public static SubLObject get_already_computed_answers(final SubLObject fact, final SubLObject time)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject cdolist_list_var = $temporal_projection_answers$.getDynamicValue( thread );
    SubLObject entry = NIL;
    entry = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      if( cycl_utilities.formula_arg0( entry ).equal( fact ) && cycl_utilities.formula_arg1( entry, UNPROVIDED ).equal( time ) )
      {
        return Values.values( cycl_utilities.formula_arg2( entry, UNPROVIDED ), cycl_utilities.formula_arg3( entry, UNPROVIDED ) );
      }
      cdolist_list_var = cdolist_list_var.rest();
      entry = cdolist_list_var.first();
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/temporal-projection-cols.lisp", position = 203307L)
  public static SubLObject get_duration_of_time_interval(final SubLObject time_interval)
  {
    return bindings.variable_lookup( $sym28$_X, cycl_utilities.formula_arg0( mt_context.ask_mt_query( ConsesLow.listS( $const25$duration, time_interval, $list40 ), UNPROVIDED, UNPROVIDED, UNPROVIDED ) ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/temporal-projection-cols.lisp", position = 203467L)
  public static SubLObject scale_distribution(final SubLObject distribution, final SubLObject unit, final SubLObject duration)
  {
    final SubLObject dist = narts_high.nart_hl_formula( distribution );
    final SubLObject duration_1 = convert_to_unit( duration, unit );
    final SubLObject duration_1_value = cycl_utilities.formula_arg1( duration_1, UNPROVIDED );
    final SubLObject value_in_dist = cycl_utilities.formula_arg1( cycl_utilities.formula_arg1( dist, UNPROVIDED ), UNPROVIDED );
    final SubLObject unit_in_dist = cycl_utilities.formula_arg0( cycl_utilities.formula_arg1( dist, UNPROVIDED ) );
    if( duration_1_value.numG( ZERO_INTEGER ) )
    {
      return el_utilities.make_unary_formula( cycl_utilities.formula_arg0( dist ), el_utilities.make_unary_formula( unit_in_dist, Numbers.divide( value_in_dist, duration_1_value ) ) );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/temporal-projection-cols.lisp", position = 203967L)
  public static SubLObject get_list_of_times_for_assertion(final SubLObject fact)
  {
    final SubLObject assertions = get_assertions_for_fact( fact );
    SubLObject result = NIL;
    final SubLObject result2 = get_time_from_ist_facts( fact );
    SubLObject cdolist_list_var = assertions;
    SubLObject assertion = NIL;
    assertion = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      final SubLObject time_for_assertion = temporal_projection.get_time_for_assertion_1( assertion );
      if( NIL != time_for_assertion )
      {
        result = ConsesLow.cons( time_for_assertion, result );
      }
      cdolist_list_var = cdolist_list_var.rest();
      assertion = cdolist_list_var.first();
    }
    return ConsesLow.append( result, result2 );
  }

  public static SubLObject declare_temporal_projection_cols_file()
  {
    SubLFiles.declareFunction( me, "collect_intervals_from_events", "COLLECT-INTERVALS-FROM-EVENTS", 3, 0, false );
    SubLFiles.declareFunction( me, "create_forward_intervals_from_events", "CREATE-FORWARD-INTERVALS-FROM-EVENTS", 3, 0, false );
    SubLFiles.declareFunction( me, "create_backward_intervals_from_events", "CREATE-BACKWARD-INTERVALS-FROM-EVENTS", 3, 0, false );
    SubLFiles.declareFunction( me, "possibly_retract_stale_deductions", "POSSIBLY-RETRACT-STALE-DEDUCTIONS", 2, 0, false );
    SubLFiles.declareFunction( me, "argument_is_better_thanP", "ARGUMENT-IS-BETTER-THAN?", 2, 0, false );
    SubLFiles.declareFunction( me, "argument_has_more_factsP", "ARGUMENT-HAS-MORE-FACTS?", 2, 0, false );
    SubLFiles.declareFunction( me, "support_subsumed_by_justificationP", "SUPPORT-SUBSUMED-BY-JUSTIFICATION?", 2, 0, false );
    SubLFiles.declareFunction( me, "distribution_related_supportP", "DISTRIBUTION-RELATED-SUPPORT?", 1, 0, false );
    SubLFiles.declareFunction( me, "collect_intervals_from_events_for_negated_sentence", "COLLECT-INTERVALS-FROM-EVENTS-FOR-NEGATED-SENTENCE", 3, 0, false );
    SubLFiles.declareFunction( me, "collect_intervals_from_both_starting_point_and_ending_point_assertions", "COLLECT-INTERVALS-FROM-BOTH-STARTING-POINT-AND-ENDING-POINT-ASSERTIONS", 5, 0, false );
    SubLFiles.declareFunction( me, "collect_intervals_from_both_starting_point_and_ending_point_assertions_negated", "COLLECT-INTERVALS-FROM-BOTH-STARTING-POINT-AND-ENDING-POINT-ASSERTIONS-NEGATED", 5, 0, false );
    SubLFiles.declareFunction( me, "backward_intervals_for_sentence", "BACKWARD-INTERVALS-FOR-SENTENCE", 3, 0, false );
    SubLFiles.declareFunction( me, "forward_intervals_for_sentence", "FORWARD-INTERVALS-FOR-SENTENCE", 3, 0, false );
    SubLFiles.declareFunction( me, "find_best_backward_distribution_for_sentence", "FIND-BEST-BACKWARD-DISTRIBUTION-FOR-SENTENCE", 1, 0, false );
    SubLFiles.declareFunction( me, "find_best_forward_distribution_for_sentence", "FIND-BEST-FORWARD-DISTRIBUTION-FOR-SENTENCE", 1, 0, false );
    SubLFiles.declareFunction( me, "find_type_level_distribution_for_sentence", "FIND-TYPE-LEVEL-DISTRIBUTION-FOR-SENTENCE", 1, 0, false );
    SubLFiles.declareFunction( me, "find_default_backward_distribution_for_sentence", "FIND-DEFAULT-BACKWARD-DISTRIBUTION-FOR-SENTENCE", 1, 0, false );
    SubLFiles.declareFunction( me, "find_default_forward_distribution_for_sentence", "FIND-DEFAULT-FORWARD-DISTRIBUTION-FOR-SENTENCE", 1, 0, false );
    SubLFiles.declareFunction( me, "find_default_distribution_for_sentence", "FIND-DEFAULT-DISTRIBUTION-FOR-SENTENCE", 1, 0, false );
    SubLFiles.declareFunction( me, "create_time_line_from_assertions", "CREATE-TIME-LINE-FROM-ASSERTIONS", 2, 0, false );
    SubLFiles.declareFunction( me, "list_time_comparator", "LIST-TIME-COMPARATOR", 2, 0, false );
    SubLFiles.declareFunction( me, "compute_likelihoods_from_event_calculus", "COMPUTE-LIKELIHOODS-FROM-EVENT-CALCULUS", 3, 0, false );
    SubLFiles.declareFunction( me, "find_likelihood_from_default_conditional_probability_for_sentence_backwards", "FIND-LIKELIHOOD-FROM-DEFAULT-CONDITIONAL-PROBABILITY-FOR-SENTENCE-BACKWARDS", 6, 0, false );
    SubLFiles.declareFunction( me, "find_likelihood_from_default_conditional_probability_for_sentence_forwards", "FIND-LIKELIHOOD-FROM-DEFAULT-CONDITIONAL-PROBABILITY-FOR-SENTENCE-FORWARDS", 6, 0, false );
    SubLFiles.declareFunction( me, "handle_temporal_interpolation_function_for_predicate", "HANDLE-TEMPORAL-INTERPOLATION-FUNCTION-FOR-PREDICATE", 2, 0, false );
    SubLFiles.declareFunction( me, "handle_duration_weighted_decay_distribution", "HANDLE-DURATION-WEIGHTED-DECAY-DISTRIBUTION", 2, 0, false );
    SubLFiles.declareFunction( me, "handle_decay_distribution_for_assertion_in_time_interval", "HANDLE-DECAY-DISTRIBUTION-FOR-ASSERTION-IN-TIME-INTERVAL", 2, 0, false );
    SubLFiles.declareFunction( me, "use_causal_analysis_to_find_likelihood", "USE-CAUSAL-ANALYSIS-TO-FIND-LIKELIHOOD", 2, 0, false );
    SubLFiles.declareFunction( me, "use_noisy_and_model_to_calculate_prob", "USE-NOISY-AND-MODEL-TO-CALCULATE-PROB", 2, 0, false );
    SubLFiles.declareFunction( me, "find_probabilities_due_to_unobserved_causes", "FIND-PROBABILITIES-DUE-TO-UNOBSERVED-CAUSES", 2, 0, false );
    SubLFiles.declareFunction( me, "check_presence_of_condition_in_observed_causes_ins_pos_1", "CHECK-PRESENCE-OF-CONDITION-IN-OBSERVED-CAUSES-INS-POS-1", 3, 0, false );
    SubLFiles.declareFunction( me, "use_noisy_or_model_to_calculate_prob", "USE-NOISY-OR-MODEL-TO-CALCULATE-PROB", 2, 0, false );
    SubLFiles.declareFunction( me, "use_causal_analysis_to_find_likelihood_2", "USE-CAUSAL-ANALYSIS-TO-FIND-LIKELIHOOD-2", 2, 0, false );
    SubLFiles.declareFunction( me, "compute_probability_for_list_of_causes", "COMPUTE-PROBABILITY-FOR-LIST-OF-CAUSES", 1, 0, false );
    SubLFiles.declareFunction( me, "compute_probability_for_subset", "COMPUTE-PROBABILITY-FOR-SUBSET", 2, 0, false );
    SubLFiles.declareFunction( me, "find_prior_and_probability_from_list", "FIND-PRIOR-AND-PROBABILITY-FROM-LIST", 2, 0, false );
    SubLFiles.declareFunction( me, "check_delay_between_start_of_event_types_in_sit_type", "CHECK-DELAY-BETWEEN-START-OF-EVENT-TYPES-IN-SIT-TYPE", 1, 0, false );
    SubLFiles.declareFunction( me, "handle_default_decay_function_for_predicate", "HANDLE-DEFAULT-DECAY-FUNCTION-FOR-PREDICATE", 2, 0, false );
    SubLFiles.declareFunction( me, "handle_default_decay_function_for_predicate_backwards", "HANDLE-DEFAULT-DECAY-FUNCTION-FOR-PREDICATE-BACKWARDS", 2, 0, false );
    SubLFiles.declareFunction( me, "handle_decay_distribution_for_specs", "HANDLE-DECAY-DISTRIBUTION-FOR-SPECS", 2, 0, false );
    SubLFiles.declareFunction( me, "handle_decay_distribution_for_specs_2", "HANDLE-DECAY-DISTRIBUTION-FOR-SPECS-2", 3, 0, false );
    SubLFiles.declareFunction( me, "get_assertions_for_fact", "GET-ASSERTIONS-FOR-FACT", 1, 0, false );
    SubLFiles.declareFunction( me, "handle_temporal_interpolation_function_for_collection", "HANDLE-TEMPORAL-INTERPOLATION-FUNCTION-FOR-COLLECTION", 2, 0, false );
    SubLFiles.declareFunction( me, "find_probability_of_end_of_event", "FIND-PROBABILITY-OF-END-OF-EVENT", 3, 0, false );
    SubLFiles.declareFunction( me, "find_probability_of_event_occurrence", "FIND-PROBABILITY-OF-EVENT-OCCURRENCE", 2, 0, false );
    SubLFiles.declareFunction( me, "use_risk_analysis", "USE-RISK-ANALYSIS", 2, 0, false );
    SubLFiles.declareFunction( me, "get_probability_of_event_occurrence", "GET-PROBABILITY-OF-EVENT-OCCURRENCE", 2, 0, false );
    SubLFiles.declareFunction( me, "calculate_probability_of_event_occurring_before_age", "CALCULATE-PROBABILITY-OF-EVENT-OCCURRING-BEFORE-AGE", 3, 0, false );
    SubLFiles.declareFunction( me, "get_probability_of_state_persisting_from_time", "GET-PROBABILITY-OF-STATE-PERSISTING-FROM-TIME", 4, 0, false );
    SubLFiles.declareFunction( me, "get_probability_of_event_not_occurring", "GET-PROBABILITY-OF-EVENT-NOT-OCCURRING", 3, 0, false );
    SubLFiles.declareFunction( me, "get_duration_from_intensity_function", "GET-DURATION-FROM-INTENSITY-FUNCTION", 1, 0, false );
    SubLFiles.declareFunction( me, "get_intensity_function_for_event_type", "GET-INTENSITY-FUNCTION-FOR-EVENT-TYPE", 2, 0, false );
    SubLFiles.declareFunction( me, "find_intensity_function_at_age", "FIND-INTENSITY-FUNCTION-AT-AGE", 2, 0, false );
    SubLFiles.declareFunction( me, "find_intensity_function_at_age_for_role", "FIND-INTENSITY-FUNCTION-AT-AGE-FOR-ROLE", 3, 0, false );
    SubLFiles.declareFunction( me, "get_intensity_function_for_event_2", "GET-INTENSITY-FUNCTION-FOR-EVENT-2", 2, 0, false );
    SubLFiles.declareFunction( me, "find_transition_probability", "FIND-TRANSITION-PROBABILITY", 3, 0, false );
    SubLFiles.declareFunction( me, "find_backward_transition_probabilities", "FIND-BACKWARD-TRANSITION-PROBABILITIES", 3, 0, false );
    SubLFiles.declareFunction( me, "find_backward_transition_probabilities_to_self", "FIND-BACKWARD-TRANSITION-PROBABILITIES-TO-SELF", 3, 0, false );
    SubLFiles.declareFunction( me, "find_prob_of_backward_transition", "FIND-PROB-OF-BACKWARD-TRANSITION", 6, 0, false );
    SubLFiles.declareFunction( me, "find_probability_for_state", "FIND-PROBABILITY-FOR-STATE", 4, 0, false );
    SubLFiles.declareFunction( me, "get_array_element", "GET-ARRAY-ELEMENT", 3, 0, false );
    SubLFiles.declareFunction( me, "get_assertions_for_transition_from_state_to_state", "GET-ASSERTIONS-FOR-TRANSITION-FROM-STATE-TO-STATE", 2, 0, false );
    SubLFiles.declareFunction( me, "find_probability_of_remaining_in_state_1", "FIND-PROBABILITY-OF-REMAINING-IN-STATE-1", 3, 0, false );
    SubLFiles.declareFunction( me, "find_probability_of_remaining_in_state_2", "FIND-PROBABILITY-OF-REMAINING-IN-STATE-2", 3, 0, false );
    SubLFiles.declareFunction( me, "find_forward_transition_probabilities", "FIND-FORWARD-TRANSITION-PROBABILITIES", 3, 0, false );
    SubLFiles.declareFunction( me, "check_cardinality_of_collection", "CHECK-CARDINALITY-OF-COLLECTION", 2, 0, false );
    SubLFiles.declareFunction( me, "check_number_of_instances", "CHECK-NUMBER-OF-INSTANCES", 3, 0, false );
    SubLFiles.declareFunction( me, "use_event_calculus_to_find_likelihood", "USE-EVENT-CALCULUS-TO-FIND-LIKELIHOOD", 2, 0, false );
    SubLFiles.declareFunction( me, "use_conditional_likelihood", "USE-CONDITIONAL-LIKELIHOOD", 2, 0, false );
    SubLFiles.declareFunction( me, "handle_delay_between_collections", "HANDLE-DELAY-BETWEEN-COLLECTIONS", 2, 0, false );
    SubLFiles.declareFunction( me, "handle_default_decay_distribution_for_collection_in_interval", "HANDLE-DEFAULT-DECAY-DISTRIBUTION-FOR-COLLECTION-IN-INTERVAL", 2, 0, false );
    SubLFiles.declareFunction( me, "handle_temporal_relation_between_collections", "HANDLE-TEMPORAL-RELATION-BETWEEN-COLLECTIONS", 2, 0, false );
    SubLFiles.declareFunction( me, "handle_decay_distribution_for_collection_in_interval_when_instance_in_spec", "HANDLE-DECAY-DISTRIBUTION-FOR-COLLECTION-IN-INTERVAL-WHEN-INSTANCE-IN-SPEC", 2, 0, false );
    SubLFiles.declareFunction( me, "handle_default_decay_distribution_for_collection", "HANDLE-DEFAULT-DECAY-DISTRIBUTION-FOR-COLLECTION", 1, 0, false );
    SubLFiles.declareFunction( me, "handle_default_decay_distribution_for_collection_backwards", "HANDLE-DEFAULT-DECAY-DISTRIBUTION-FOR-COLLECTION-BACKWARDS", 2, 0, false );
    SubLFiles.declareFunction( me, "handle_decay_distribution_for_collection_forward", "HANDLE-DECAY-DISTRIBUTION-FOR-COLLECTION-FORWARD", 3, 0, false );
    SubLFiles.declareFunction( me, "handle_decay_distribution_for_specs_collection", "HANDLE-DECAY-DISTRIBUTION-FOR-SPECS-COLLECTION", 2, 0, false );
    SubLFiles.declareFunction( me, "handle_decay_distribution_for_collection_in_interval_backwards", "HANDLE-DECAY-DISTRIBUTION-FOR-COLLECTION-IN-INTERVAL-BACKWARDS", 2, 0, false );
    SubLFiles.declareFunction( me, "handle_decay_distribution_for_assertion_in_interval", "HANDLE-DECAY-DISTRIBUTION-FOR-ASSERTION-IN-INTERVAL", 2, 0, false );
    SubLFiles.declareFunction( me, "handle_decay_distribution_for_assertion_in_interval_backwards", "HANDLE-DECAY-DISTRIBUTION-FOR-ASSERTION-IN-INTERVAL-BACKWARDS", 2, 0, false );
    SubLFiles.declareFunction( me, "check_time_subsumption", "CHECK-TIME-SUBSUMPTION", 4, 0, false );
    SubLFiles.declareFunction( me, "handle_decay_distribution_for_assertion_causal", "HANDLE-DECAY-DISTRIBUTION-FOR-ASSERTION-CAUSAL", 2, 0, false );
    SubLFiles.declareFunction( me, "handle_decay_distribution_for_collection_when_time_in_interval", "HANDLE-DECAY-DISTRIBUTION-FOR-COLLECTION-WHEN-TIME-IN-INTERVAL", 2, 0, false );
    SubLFiles.declareFunction( me, "check_temporal_relation", "CHECK-TEMPORAL-RELATION", 3, 0, false );
    SubLFiles.declareFunction( me, "get_persistence_likelihood_for_fact_at_time", "GET-PERSISTENCE-LIKELIHOOD-FOR-FACT-AT-TIME", 2, 4, false );
    SubLFiles.declareFunction( me, "get_persistence_of_isa_assertion", "GET-PERSISTENCE-OF-ISA-ASSERTION", 3, 0, false );
    SubLFiles.declareFunction( me, "get_persistence_of_non_isa_assertion", "GET-PERSISTENCE-OF-NON-ISA-ASSERTION", 3, 0, false );
    SubLFiles.declareFunction( me, "collect_evidence_from_rules", "COLLECT-EVIDENCE-FROM-RULES", 3, 0, false );
    SubLFiles.declareFunction( me, "find_decay_function_for_collection", "FIND-DECAY-FUNCTION-FOR-COLLECTION", 3, 0, false );
    SubLFiles.declareFunction( me, "find_decay_function_for_fact", "FIND-DECAY-FUNCTION-FOR-FACT", 3, 0, false );
    SubLFiles.declareFunction( me, "time_elapsed_falls_in_interval", "TIME-ELAPSED-FALLS-IN-INTERVAL", 2, 0, false );
    SubLFiles.declareFunction( me, "calculate_persistence_likelihood", "CALCULATE-PERSISTENCE-LIKELIHOOD", 2, 0, false );
    SubLFiles.declareFunction( me, "calculate_persistence_likelihood_from_non_narts", "CALCULATE-PERSISTENCE-LIKELIHOOD-FROM-NON-NARTS", 2, 0, false );
    SubLFiles.declareFunction( me, "calculate_persistence_for_exponential_decay_function", "CALCULATE-PERSISTENCE-FOR-EXPONENTIAL-DECAY-FUNCTION", 2, 0, false );
    SubLFiles.declareFunction( me, "calculate_persistence_for_exponential_decay_function_scaled", "CALCULATE-PERSISTENCE-FOR-EXPONENTIAL-DECAY-FUNCTION-SCALED", 2, 0, false );
    SubLFiles.declareFunction( me, "calculate_persistence_for_bounded_exponentially_increasing_function", "CALCULATE-PERSISTENCE-FOR-BOUNDED-EXPONENTIALLY-INCREASING-FUNCTION", 2, 0, false );
    SubLFiles.declareFunction( me, "calculate_persistence_for_bounded_exponentially_increasing_function_with_initial_value", "CALCULATE-PERSISTENCE-FOR-BOUNDED-EXPONENTIALLY-INCREASING-FUNCTION-WITH-INITIAL-VALUE", 2, 0,
        false );
    SubLFiles.declareFunction( me, "calculate_persistence_for_exponential_decay_distribution_with_initial_and_final_value_fn", "CALCULATE-PERSISTENCE-FOR-EXPONENTIAL-DECAY-DISTRIBUTION-WITH-INITIAL-AND-FINAL-VALUE-FN",
        2, 0, false );
    SubLFiles.declareFunction( me, "calculate_persistence_for_exponential_decay_distribution_with_initial_value_fn", "CALCULATE-PERSISTENCE-FOR-EXPONENTIAL-DECAY-DISTRIBUTION-WITH-INITIAL-VALUE-FN", 2, 0, false );
    SubLFiles.declareFunction( me, "calculate_persistence_for_constant_function", "CALCULATE-PERSISTENCE-FOR-CONSTANT-FUNCTION", 1, 0, false );
    SubLFiles.declareFunction( me, "calculate_persistence_for_gaussian_decay_function2", "CALCULATE-PERSISTENCE-FOR-GAUSSIAN-DECAY-FUNCTION2", 2, 0, false );
    SubLFiles.declareFunction( me, "calculate_persistence_for_gaussian_decay_function", "CALCULATE-PERSISTENCE-FOR-GAUSSIAN-DECAY-FUNCTION", 2, 0, false );
    SubLFiles.declareFunction( me, "calculate_persistence_for_linear_decay_function", "CALCULATE-PERSISTENCE-FOR-LINEAR-DECAY-FUNCTION", 2, 0, false );
    SubLFiles.declareFunction( me, "calculate_persistence_for_linearly_increasing_function", "CALCULATE-PERSISTENCE-FOR-LINEARLY-INCREASING-FUNCTION", 2, 0, false );
    SubLFiles.declareFunction( me, "time_falls_in_interval", "TIME-FALLS-IN-INTERVAL", 3, 1, false );
    SubLFiles.declareFunction( me, "get_mt_time_for_assertion", "GET-MT-TIME-FOR-ASSERTION", 1, 0, false );
    SubLFiles.declareFunction( me, "get_time_from_ist_facts", "GET-TIME-FROM-IST-FACTS", 1, 0, false );
    SubLFiles.declareFunction( me, "get_farthest_time_for_assertion", "GET-FARTHEST-TIME-FOR-ASSERTION", 2, 0, false );
    SubLFiles.declareFunction( me, "get_closest_time_for_assertion", "GET-CLOSEST-TIME-FOR-ASSERTION", 2, 0, false );
    SubLFiles.declareFunction( me, "get_closest_time_for_assertion_before_given_time", "GET-CLOSEST-TIME-FOR-ASSERTION-BEFORE-GIVEN-TIME", 2, 0, false );
    SubLFiles.declareFunction( me, "get_earliest_time_for_fact", "GET-EARLIEST-TIME-FOR-FACT", 1, 0, false );
    SubLFiles.declareFunction( me, "handle_time_intervals_closest", "HANDLE-TIME-INTERVALS-CLOSEST", 2, 0, false );
    SubLFiles.declareFunction( me, "map_indexicals_in_date", "MAP-INDEXICALS-IN-DATE", 1, 0, false );
    SubLFiles.declareFunction( me, "check_fact_true_at_point", "CHECK-FACT-TRUE-AT-POINT", 2, 0, false );
    SubLFiles.declareFunction( me, "check_isa_fact_false_at_point", "CHECK-ISA-FACT-FALSE-AT-POINT", 2, 0, false );
    SubLFiles.declareFunction( me, "time_subsumes_anotherP", "TIME-SUBSUMES-ANOTHER?", 2, 0, false );
    SubLFiles.declareFunction( me, "get_assertion_for_given_fact_and_time", "GET-ASSERTION-FOR-GIVEN-FACT-AND-TIME", 2, 0, false );
    SubLFiles.declareFunction( me, "get_fact_closest_to_time_point", "GET-FACT-CLOSEST-TO-TIME-POINT", 2, 0, false );
    SubLFiles.declareFunction( me, "get_assertion_for_binary_predicates", "GET-ASSERTION-FOR-BINARY-PREDICATES", 1, 0, false );
    SubLFiles.declareFunction( me, "get_assertion_for_ternary_predicates", "GET-ASSERTION-FOR-TERNARY-PREDICATES", 4, 0, false );
    SubLFiles.declareFunction( me, "get_assertion_for_predicate_of_arity_five", "GET-ASSERTION-FOR-PREDICATE-OF-ARITY-FIVE", 6, 0, false );
    SubLFiles.declareFunction( me, "get_assertion_for_predicate_of_arity_four", "GET-ASSERTION-FOR-PREDICATE-OF-ARITY-FOUR", 5, 0, false );
    SubLFiles.declareFunction( me, "find_assertion_for_predicate_of_arity_6", "FIND-ASSERTION-FOR-PREDICATE-OF-ARITY-6", 7, 0, false );
    SubLFiles.declareFunction( me, "check_always_trueP", "CHECK-ALWAYS-TRUE?", 1, 0, false );
    SubLFiles.declareFunction( me, "check_temporal_relation_between_arguments", "CHECK-TEMPORAL-RELATION-BETWEEN-ARGUMENTS", 1, 0, false );
    SubLFiles.declareFunction( me, "check_starting_times", "CHECK-STARTING-TIMES", 2, 0, false );
    SubLFiles.declareFunction( me, "check_ending_times", "CHECK-ENDING-TIMES", 2, 0, false );
    SubLFiles.declareFunction( me, "get_arg_cons_for_pos", "GET-ARG-CONS-FOR-POS", 2, 0, false );
    SubLFiles.declareFunction( me, "get_starting_date_of_concept", "GET-STARTING-DATE-OF-CONCEPT", 1, 0, false );
    SubLFiles.declareFunction( me, "get_ending_date_of_concept", "GET-ENDING-DATE-OF-CONCEPT", 1, 0, false );
    SubLFiles.declareFunction( me, "find_time_elapsed", "FIND-TIME-ELAPSED", 2, 0, false );
    SubLFiles.declareFunction( me, "find_time_elapsed_for_indeterminate_terms", "FIND-TIME-ELAPSED-FOR-INDETERMINATE-TERMS", 2, 0, false );
    SubLFiles.declareFunction( me, "mt_later_thanP", "MT-LATER-THAN?", 2, 0, false );
    SubLFiles.declareFunction( me, "at_least_one_point_is_later_thanP", "AT-LEAST-ONE-POINT-IS-LATER-THAN?", 2, 0, false );
    SubLFiles.declareFunction( me, "at_least_one_point_is_before_thanP", "AT-LEAST-ONE-POINT-IS-BEFORE-THAN?", 2, 0, false );
    SubLFiles.declareFunction( me, "all_points_are_before_thanP", "ALL-POINTS-ARE-BEFORE-THAN?", 2, 0, false );
    SubLFiles.declareFunction( me, "all_points_are_after_thanP", "ALL-POINTS-ARE-AFTER-THAN?", 2, 0, false );
    SubLFiles.declareFunction( me, "get_last_time_point_of", "GET-LAST-TIME-POINT-OF", 1, 0, false );
    SubLFiles.declareFunction( me, "verify_temporal_relation", "VERIFY-TEMPORAL-RELATION", 3, 0, false );
    SubLFiles.declareFunction( me, "get_first_time_point_of", "GET-FIRST-TIME-POINT-OF", 1, 0, false );
    SubLFiles.declareFunction( me, "convert_to_unit", "CONVERT-TO-UNIT", 2, 0, false );
    SubLFiles.declareFunction( me, "error_fn", "ERROR-FN", 1, 0, false );
    SubLFiles.declareFunction( me, "find_list_of_starting_times", "FIND-LIST-OF-STARTING-TIMES", 1, 0, false );
    SubLFiles.declareFunction( me, "find_list_of_ending_times", "FIND-LIST-OF-ENDING-TIMES", 1, 0, false );
    SubLFiles.declareFunction( me, "find_closest_time_after", "FIND-CLOSEST-TIME-AFTER", 2, 0, false );
    SubLFiles.declareFunction( me, "find_closest_time_before", "FIND-CLOSEST-TIME-BEFORE", 2, 0, false );
    SubLFiles.declareFunction( me, "create_timeline_for_assertion", "CREATE-TIMELINE-FOR-ASSERTION", 1, 0, false );
    SubLFiles.declareFunction( me, "check_boundary_conditions", "CHECK-BOUNDARY-CONDITIONS", 3, 0, false );
    SubLFiles.declareFunction( me, "find_closest_time_around_time_point", "FIND-CLOSEST-TIME-AROUND-TIME-POINT", 2, 0, false );
    SubLFiles.declareFunction( me, "find_most_specific_assertion", "FIND-MOST-SPECIFIC-ASSERTION", 1, 0, false );
    SubLFiles.declareFunction( me, "find_persistence_by_combining_evidence", "FIND-PERSISTENCE-BY-COMBINING-EVIDENCE", 1, 0, false );
    SubLFiles.declareFunction( me, "combined_evidence_for_persistence", "COMBINED-EVIDENCE-FOR-PERSISTENCE", 1, 0, false );
    SubLFiles.declareFunction( me, "check_whether_fact_satisfies_constraints", "CHECK-WHETHER-FACT-SATISFIES-CONSTRAINTS", 2, 0, false );
    SubLFiles.declareFunction( me, "find_assertion_matching_conditions_in_conseq", "FIND-ASSERTION-MATCHING-CONDITIONS-IN-CONSEQ", 2, 0, false );
    SubLFiles.declareFunction( me, "find_constraints_for_variable_from_conditions", "FIND-CONSTRAINTS-FOR-VARIABLE-FROM-CONDITIONS", 2, 0, false );
    SubLFiles.declareFunction( me, "check_isa_constraint", "CHECK-ISA-CONSTRAINT", 2, 0, false );
    SubLFiles.declareFunction( me, "get_binding_for_variable", "GET-BINDING-FOR-VARIABLE", 2, 0, false );
    SubLFiles.declareFunction( me, "get_list_of_bindings_for_cons", "GET-LIST-OF-BINDINGS-FOR-CONS", 2, 0, false );
    SubLFiles.declareFunction( me, "convert_exponential_decay_distribution_with_initial_value_fn_to_lambda_form", "CONVERT-EXPONENTIAL-DECAY-DISTRIBUTION-WITH-INITIAL-VALUE-FN-TO-LAMBDA-FORM", 3, 0, false );
    SubLFiles.declareFunction( me, "get_date_for_earliest_collection_members", "GET-DATE-FOR-EARLIEST-COLLECTION-MEMBERS", 1, 0, false );
    SubLFiles.declareFunction( me, "recursive_temporal_projection_queryP", "RECURSIVE-TEMPORAL-PROJECTION-QUERY?", 2, 0, false );
    SubLFiles.declareFunction( me, "find_earliest_event", "FIND-EARLIEST-EVENT", 1, 0, false );
    SubLFiles.declareFunction( me, "get_prior_probability_for_pattern", "GET-PRIOR-PROBABILITY-FOR-PATTERN", 2, 0, false );
    SubLFiles.declareFunction( me, "test_constraints_for_arg_position", "TEST-CONSTRAINTS-FOR-ARG-POSITION", 5, 0, false );
    SubLFiles.declareFunction( me, "generate_powerset", "GENERATE-POWERSET", 1, 0, false );
    SubLFiles.declareFunction( me, "lambda_function_elt", "LAMBDA-FUNCTION-ELT", 1, 0, false );
    SubLFiles.declareFunction( me, "time_falls_in_temporal_interval", "TIME-FALLS-IN-TEMPORAL-INTERVAL", 2, 0, false );
    SubLFiles.declareFunction( me, "handle_distribution_for_termination_of_membership", "HANDLE-DISTRIBUTION-FOR-TERMINATION-OF-MEMBERSHIP", 2, 0, false );
    SubLFiles.declareFunction( me, "find_probability_of_belonging_to_collection", "FIND-PROBABILITY-OF-BELONGING-TO-COLLECTION", 4, 0, false );
    SubLFiles.declareFunction( me, "calculate_probability_using_life_tables", "CALCULATE-PROBABILITY-USING-LIFE-TABLES", 4, 0, false );
    SubLFiles.declareFunction( me, "calculate_probability_of_delay_between_events", "CALCULATE-PROBABILITY-OF-DELAY-BETWEEN-EVENTS", 4, 0, false );
    SubLFiles.declareFunction( me, "last_iterationP", "LAST-ITERATION?", 3, 0, false );
    SubLFiles.declareFunction( me, "find_relevant_distribution_at_age", "FIND-RELEVANT-DISTRIBUTION-AT-AGE", 2, 0, false );
    SubLFiles.declareFunction( me, "find_relevant_distribution_for_delay_between_events", "FIND-RELEVANT-DISTRIBUTION-FOR-DELAY-BETWEEN-EVENTS", 2, 0, false );
    SubLFiles.declareFunction( me, "find_relevant_distribution_for_transition", "FIND-RELEVANT-DISTRIBUTION-FOR-TRANSITION", 2, 0, false );
    SubLFiles.declareFunction( me, "check_duration_of_event_type", "CHECK-DURATION-OF-EVENT-TYPE", 1, 0, false );
    SubLFiles.declareFunction( me, "calculate_probability_of_end_of_event", "CALCULATE-PROBABILITY-OF-END-OF-EVENT", 4, 0, false );
    SubLFiles.declareFunction( me, "calculate_probability_of_transition_to_state", "CALCULATE-PROBABILITY-OF-TRANSITION-TO-STATE", 4, 0, false );
    SubLFiles.declareFunction( me, "calculate_probability_of_remaining_in_state", "CALCULATE-PROBABILITY-OF-REMAINING-IN-STATE", 4, 0, false );
    SubLFiles.declareFunction( me, "get_already_computed_answers", "GET-ALREADY-COMPUTED-ANSWERS", 2, 0, false );
    SubLFiles.declareFunction( me, "get_duration_of_time_interval", "GET-DURATION-OF-TIME-INTERVAL", 1, 0, false );
    SubLFiles.declareFunction( me, "scale_distribution", "SCALE-DISTRIBUTION", 3, 0, false );
    SubLFiles.declareFunction( me, "get_list_of_times_for_assertion", "GET-LIST-OF-TIMES-FOR-ASSERTION", 1, 0, false );
    return NIL;
  }

  public static SubLObject init_temporal_projection_cols_file()
  {
    $uniform_distribution_with_value_zero$ = SubLFiles.defparameter( "*UNIFORM-DISTRIBUTION-WITH-VALUE-ZERO*", el_utilities.make_unary_formula( $const94$UniformPersistenceDistributionWit, ZERO_INTEGER ) );
    $uniform_distribution_with_value_one$ = SubLFiles.defparameter( "*UNIFORM-DISTRIBUTION-WITH-VALUE-ONE*", el_utilities.make_unary_formula( $const94$UniformPersistenceDistributionWit, ONE_INTEGER ) );
    $tp_current_var$ = SubLFiles.defparameter( "*TP-CURRENT-VAR*", NIL );
    $temporal_projection_justifications$ = SubLFiles.defparameter( "*TEMPORAL-PROJECTION-JUSTIFICATIONS*", NIL );
    $mt_for_temporal_projection$ = SubLFiles.defparameter( "*MT-FOR-TEMPORAL-PROJECTION*", NIL );
    $temporal_projection_stack$ = SubLFiles.defparameter( "*TEMPORAL-PROJECTION-STACK*", NIL );
    $temporal_projection_answers$ = SubLFiles.defparameter( "*TEMPORAL-PROJECTION-ANSWERS*", NIL );
    return NIL;
  }

  public static SubLObject setup_temporal_projection_cols_file()
  {
    return NIL;
  }

  @Override
  public void declareFunctions()
  {
    declare_temporal_projection_cols_file();
  }

  @Override
  public void initializeVariables()
  {
    init_temporal_projection_cols_file();
  }

  @Override
  public void runTopLevelForms()
  {
    setup_temporal_projection_cols_file();
  }
  static
  {
    me = new temporal_projection_cols();
    $uniform_distribution_with_value_zero$ = null;
    $uniform_distribution_with_value_one$ = null;
    $tp_current_var$ = null;
    $temporal_projection_justifications$ = null;
    $mt_for_temporal_projection$ = null;
    $temporal_projection_stack$ = null;
    $temporal_projection_answers$ = null;
    $sym0$INDEXED_TERM_P = makeSymbol( "INDEXED-TERM-P" );
    $const1$startingPointOfIntervalForSentenc = constant_handles.reader_make_constant_shell( makeString( "startingPointOfIntervalForSentence" ) );
    $const2$endingPointOfIntervalForSentence = constant_handles.reader_make_constant_shell( makeString( "endingPointOfIntervalForSentence" ) );
    $const3$temporallyIntersects = constant_handles.reader_make_constant_shell( makeString( "temporallyIntersects" ) );
    $kw4$POS = makeKeyword( "POS" );
    $const5$BaseKB = constant_handles.reader_make_constant_shell( makeString( "BaseKB" ) );
    $list6 = ConsesLow.list( makeSymbol( "CANON-CNF" ), makeSymbol( "&OPTIONAL" ), makeSymbol( "BINDING-LIST" ) );
    $kw7$CODE = makeKeyword( "CODE" );
    $sym8$E = makeSymbol( "E" );
    $sym9$S = makeSymbol( "S" );
    $const10$TimeIntervalInclusiveFn = constant_handles.reader_make_constant_shell( makeString( "TimeIntervalInclusiveFn" ) );
    $const11$temporallySubsumes = constant_handles.reader_make_constant_shell( makeString( "temporallySubsumes" ) );
    $const12$defaultConditionalProbabilityForS = constant_handles.reader_make_constant_shell( makeString( "defaultConditionalProbabilityForSentenceInInterval" ) );
    $const13$conditionalProbabilityForSentence = constant_handles.reader_make_constant_shell( makeString( "conditionalProbabilityForSentenceWhenTypeInArg" ) );
    $const14$defaultConditionalProbabilityOfSt = constant_handles.reader_make_constant_shell( makeString( "defaultConditionalProbabilityOfStateAfterIntervalOfLength" ) );
    $const15$isa = constant_handles.reader_make_constant_shell( makeString( "isa" ) );
    $const16$conditionalProbabilityOfStateAfte = constant_handles.reader_make_constant_shell( makeString( "conditionalProbabilityOfStateAfterIntervalOfLength-Backward" ) );
    $const17$defaultConditionalProbabilityForS = constant_handles.reader_make_constant_shell( makeString( "defaultConditionalProbabilityForSentenceInInterval-Backward" ) );
    $const18$conditionalProbabilityOfStateAfte = constant_handles.reader_make_constant_shell( makeString( "conditionalProbabilityOfStateAfterIntervalOfLength-Forward" ) );
    $const19$defaultConditionalProbabilityForS = constant_handles.reader_make_constant_shell( makeString( "defaultConditionalProbabilityForSentenceInInterval-Forward" ) );
    $sym20$LIST_TIME_COMPARATOR = makeSymbol( "LIST-TIME-COMPARATOR" );
    $const21$timeElapsed = constant_handles.reader_make_constant_shell( makeString( "timeElapsed" ) );
    $const22$NumericLikelihoodFn = constant_handles.reader_make_constant_shell( makeString( "NumericLikelihoodFn" ) );
    $const23$temporalInterpolationFunctionForP = constant_handles.reader_make_constant_shell( makeString( "temporalInterpolationFunctionForPredicate" ) );
    $const24$durationWeightedDistributionForPr = constant_handles.reader_make_constant_shell( makeString( "durationWeightedDistributionForPredicate" ) );
    $const25$duration = constant_handles.reader_make_constant_shell( makeString( "duration" ) );
    $const26$decayDistributionForAssertionInTi = constant_handles.reader_make_constant_shell( makeString( "decayDistributionForAssertionInTimeInterval" ) );
    $list27 = ConsesLow.list( makeSymbol( "?X" ), makeSymbol( "?Y" ) );
    $sym28$_X = makeSymbol( "?X" );
    $sym29$_Y = makeSymbol( "?Y" );
    $const30$distributionForSentenceGivenNeces = constant_handles.reader_make_constant_shell( makeString( "distributionForSentenceGivenNecessaryCondition" ) );
    $list31 = ConsesLow.list( makeSymbol( "?X" ), makeSymbol( "?Y" ), makeSymbol( "?Z" ) );
    $sym32$_Z = makeSymbol( "?Z" );
    $const33$conditionalProbabilityOfStateGive = constant_handles.reader_make_constant_shell( makeString( "conditionalProbabilityOfStateGivenAbsenceOfNecessaryCondition" ) );
    $const34$distributionForSentenceGivenSuffi = constant_handles.reader_make_constant_shell( makeString( "distributionForSentenceGivenSufficientCondition" ) );
    $const35$conditionalProbabilityPatternsFor = constant_handles.reader_make_constant_shell( makeString( "conditionalProbabilityPatternsForPredicate" ) );
    $float36$0_001 = makeDouble( 0.001 );
    $sym37$FORMULA_ARG0 = makeSymbol( "FORMULA-ARG0" );
    $const38$delayBetweenStartOfEventTypesInSi = constant_handles.reader_make_constant_shell( makeString( "delayBetweenStartOfEventTypesInSitType" ) );
    $const39$subEvents = constant_handles.reader_make_constant_shell( makeString( "subEvents" ) );
    $list40 = ConsesLow.list( makeSymbol( "?X" ) );
    $const41$defaultDecayFunctionForPredicate = constant_handles.reader_make_constant_shell( makeString( "defaultDecayFunctionForPredicate" ) );
    $const42$defaultDecayFunctionForPredicate_ = constant_handles.reader_make_constant_shell( makeString( "defaultDecayFunctionForPredicate-Backward" ) );
    $const43$decayDistributionForSpecs = constant_handles.reader_make_constant_shell( makeString( "decayDistributionForSpecs" ) );
    $const44$EverythingPSC = constant_handles.reader_make_constant_shell( makeString( "EverythingPSC" ) );
    $const45$temporalInterpolationFunctionForC = constant_handles.reader_make_constant_shell( makeString( "temporalInterpolationFunctionForCollection" ) );
    $const46$eventTypeEndsIntervalForState = constant_handles.reader_make_constant_shell( makeString( "eventTypeEndsIntervalForState" ) );
    $const47$eventTypeStartsIntervalForState = constant_handles.reader_make_constant_shell( makeString( "eventTypeStartsIntervalForState" ) );
    $const48$startingPointOfRiskPeriodForAsser = constant_handles.reader_make_constant_shell( makeString( "startingPointOfRiskPeriodForAssertion" ) );
    $const49$intensityFunctionForEventTypeInIn = constant_handles.reader_make_constant_shell( makeString( "intensityFunctionForEventTypeInInterval" ) );
    $const50$startingDate = constant_handles.reader_make_constant_shell( makeString( "startingDate" ) );
    $const51$evaluate = constant_handles.reader_make_constant_shell( makeString( "evaluate" ) );
    $const52$DateAfterFn = constant_handles.reader_make_constant_shell( makeString( "DateAfterFn" ) );
    $const53$QuotientFn = constant_handles.reader_make_constant_shell( makeString( "QuotientFn" ) );
    $const54$PlusFn = constant_handles.reader_make_constant_shell( makeString( "PlusFn" ) );
    $const55$intensityFunctionForEventType = constant_handles.reader_make_constant_shell( makeString( "intensityFunctionForEventType" ) );
    $const56$lessThan = constant_handles.reader_make_constant_shell( makeString( "lessThan" ) );
    $const57$transitionProbabilityBetweenColle = constant_handles.reader_make_constant_shell( makeString( "transitionProbabilityBetweenCollections-Forward" ) );
    $list58 = ConsesLow.list( ZERO_INTEGER );
    $const59$startingPointForAssertion = constant_handles.reader_make_constant_shell( makeString( "startingPointForAssertion" ) );
    $const60$DateBeforeFn = constant_handles.reader_make_constant_shell( makeString( "DateBeforeFn" ) );
    $const61$DifferenceFn = constant_handles.reader_make_constant_shell( makeString( "DifferenceFn" ) );
    $const62$laterThan = constant_handles.reader_make_constant_shell( makeString( "laterThan" ) );
    $str63$___query_result___a_diff__a_ = makeString( "~% query-result: ~a diff ~a " );
    $str64$____a__a_ = makeString( "~% ~a ~a " );
    $const65$maximumCardinalityOfCollection = constant_handles.reader_make_constant_shell( makeString( "maximumCardinalityOfCollection" ) );
    $const66$decayDistributionForAssertionInIn = constant_handles.reader_make_constant_shell( makeString( "decayDistributionForAssertionInInterval" ) );
    $list67 = ConsesLow.list( makeSymbol( "?DATE" ), makeSymbol( "?INTERVAL" ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "UniformPersistenceDistributionWithValueFn" ) ), ONE_INTEGER ) );
    $sym68$_DATE = makeSymbol( "?DATE" );
    $sym69$_INTERVAL = makeSymbol( "?INTERVAL" );
    $list70 = ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "UniformPersistenceDistributionWithValueFn" ) ), ONE_INTEGER );
    $const71$conditionalProbabilityForCollecti = constant_handles.reader_make_constant_shell( makeString( "conditionalProbabilityForCollections" ) );
    $const72$conditionalProbabilityForCollecti = constant_handles.reader_make_constant_shell( makeString( "conditionalProbabilityForCollections-Negation" ) );
    $const73$delayBetweenCollections = constant_handles.reader_make_constant_shell( makeString( "delayBetweenCollections" ) );
    $sym74$MAX = makeSymbol( "MAX" );
    $const75$defaultDecayFunctionForCollection = constant_handles.reader_make_constant_shell( makeString( "defaultDecayFunctionForCollectionInInterval" ) );
    $const76$temporalRelationBetweenCollection = constant_handles.reader_make_constant_shell( makeString( "temporalRelationBetweenCollections" ) );
    $list77 = ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "ConstantFunction" ) ) );
    $const78$decayDistributionForCollectionInI = constant_handles.reader_make_constant_shell( makeString( "decayDistributionForCollectionInIntervalWhenInstanceInSpec" ) );
    $const79$defaultDecayDistributionForCollec = constant_handles.reader_make_constant_shell( makeString( "defaultDecayDistributionForCollection" ) );
    $const80$defaultDecayFunctionForCollection = constant_handles.reader_make_constant_shell( makeString( "defaultDecayFunctionForCollection-Backward" ) );
    $const81$ConstantFunction = constant_handles.reader_make_constant_shell( makeString( "ConstantFunction" ) );
    $const82$defaultDecayFunctionForCollection = constant_handles.reader_make_constant_shell( makeString( "defaultDecayFunctionForCollection-Forward" ) );
    $list83 = ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "decayDistributionForSpecs-Collection" ) ), makeSymbol( "?X" ), makeSymbol( "?Y" ), makeSymbol( "?Z" ), makeSymbol( "?W" ) );
    $sym84$_W = makeSymbol( "?W" );
    $const85$decayFunctionForCollectionInInter = constant_handles.reader_make_constant_shell( makeString( "decayFunctionForCollectionInInterval-Backward" ) );
    $const86$decayDistributionForAssertionInIn = constant_handles.reader_make_constant_shell( makeString( "decayDistributionForAssertionInInterval-Backwards" ) );
    $const87$hourNumberOfDate = constant_handles.reader_make_constant_shell( makeString( "hourNumberOfDate" ) );
    $int88$23 = makeInteger( 23 );
    $const89$decayDistributionForAssertion_Cau = constant_handles.reader_make_constant_shell( makeString( "decayDistributionForAssertion-Causal" ) );
    $const90$endingDate = constant_handles.reader_make_constant_shell( makeString( "endingDate" ) );
    $list91 = ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "decayDistributionForCollectionWhenTimeInInterval" ) ), makeSymbol( "?COL" ), makeSymbol( "?X" ), makeSymbol( "?Y" ), makeSymbol(
        "?Z" ) );
    $sym92$_COL = makeSymbol( "?COL" );
    $const93$InverseBinaryPredicateFn = constant_handles.reader_make_constant_shell( makeString( "InverseBinaryPredicateFn" ) );
    $const94$UniformPersistenceDistributionWit = constant_handles.reader_make_constant_shell( makeString( "UniformPersistenceDistributionWithValueFn" ) );
    $const95$dateOfEvent = constant_handles.reader_make_constant_shell( makeString( "dateOfEvent" ) );
    $const96$endsDuring = constant_handles.reader_make_constant_shell( makeString( "endsDuring" ) );
    $const97$decayFunctionForPredicateInInterv = constant_handles.reader_make_constant_shell( makeString( "decayFunctionForPredicateInInterval" ) );
    $const98$decayFunctionForSpecsInInterval = constant_handles.reader_make_constant_shell( makeString( "decayFunctionForSpecsInInterval" ) );
    $const99$decayFunctionInInterval = constant_handles.reader_make_constant_shell( makeString( "decayFunctionInInterval" ) );
    $const100$intervalRange = constant_handles.reader_make_constant_shell( makeString( "intervalRange" ) );
    $const101$PlusInfinity = constant_handles.reader_make_constant_shell( makeString( "PlusInfinity" ) );
    $const102$lessThanOrEqualTo = constant_handles.reader_make_constant_shell( makeString( "lessThanOrEqualTo" ) );
    $const103$ExponentialDecayDistributionWithI = constant_handles.reader_make_constant_shell( makeString( "ExponentialDecayDistributionWithInitialValueFn" ) );
    $const104$ExponentialDecayDistributionWithI = constant_handles.reader_make_constant_shell( makeString( "ExponentialDecayDistributionWithInitialAndFinalValueFn" ) );
    $const105$BoundedExponentiallyIncreasingFun = constant_handles.reader_make_constant_shell( makeString( "BoundedExponentiallyIncreasingFunctionWithInitialValueFn" ) );
    $const106$NormalDistribution = constant_handles.reader_make_constant_shell( makeString( "NormalDistribution" ) );
    $const107$LinearlyDecreasingFunction = constant_handles.reader_make_constant_shell( makeString( "LinearlyDecreasingFunction" ) );
    $const108$ExponentiallyDecreasingFunction = constant_handles.reader_make_constant_shell( makeString( "ExponentiallyDecreasingFunction" ) );
    $const109$BoundedExponentiallyIncreasingFun = constant_handles.reader_make_constant_shell( makeString( "BoundedExponentiallyIncreasingFunction" ) );
    $const110$LinearlyIncreasingFunction = constant_handles.reader_make_constant_shell( makeString( "LinearlyIncreasingFunction" ) );
    $const111$ExponentialDecayDistributionWithP = constant_handles.reader_make_constant_shell( makeString( "ExponentialDecayDistributionWithParameterFn" ) );
    $const112$exponentialDecayDistributionWithP = constant_handles.reader_make_constant_shell( makeString( "exponentialDecayDistributionWithParameter" ) );
    $int113$50 = makeInteger( 50 );
    $float114$2_71 = makeDouble( 2.71 );
    $const115$boundedExponentiallyIncreasingFun = constant_handles.reader_make_constant_shell( makeString( "boundedExponentiallyIncreasingFunctionWithParameters" ) );
    $const116$boundedExponentiallyIncreasingFun = constant_handles.reader_make_constant_shell( makeString( "boundedExponentiallyIncreasingFunctionWithInitialValue" ) );
    $const117$exponentialDecayDistributionWithI = constant_handles.reader_make_constant_shell( makeString( "exponentialDecayDistributionWithInitialAndFinalValue" ) );
    $const118$exponentialDecayDistributionWithI = constant_handles.reader_make_constant_shell( makeString( "exponentialDecayDistributionWithInitialValue" ) );
    $const119$uniformPersistenceDistributionWit = constant_handles.reader_make_constant_shell( makeString( "uniformPersistenceDistributionWithValue" ) );
    $const120$normalDistributionWithParameters = constant_handles.reader_make_constant_shell( makeString( "normalDistributionWithParameters" ) );
    $float121$1_414 = makeDouble( 1.414 );
    $float122$0_5 = makeDouble( 0.5 );
    $const123$linearDecayFunctionWithSlope = constant_handles.reader_make_constant_shell( makeString( "linearDecayFunctionWithSlope" ) );
    $const124$linearlyIncreasingFunctionWithSlo = constant_handles.reader_make_constant_shell( makeString( "linearlyIncreasingFunctionWithSlope" ) );
    $const125$MinusInfinity = constant_handles.reader_make_constant_shell( makeString( "MinusInfinity" ) );
    $const126$greaterThan = constant_handles.reader_make_constant_shell( makeString( "greaterThan" ) );
    $const127$equals = constant_handles.reader_make_constant_shell( makeString( "equals" ) );
    $const128$SomeTimeInIntervalFn = constant_handles.reader_make_constant_shell( makeString( "SomeTimeInIntervalFn" ) );
    $const129$ist = constant_handles.reader_make_constant_shell( makeString( "ist" ) );
    $const130$TimeIntervalBetweenFn = constant_handles.reader_make_constant_shell( makeString( "TimeIntervalBetweenFn" ) );
    $const131$Now = constant_handles.reader_make_constant_shell( makeString( "Now" ) );
    $const132$Now_Indexical = constant_handles.reader_make_constant_shell( makeString( "Now-Indexical" ) );
    $const133$indexicalReferent = constant_handles.reader_make_constant_shell( makeString( "indexicalReferent" ) );
    $const134$TimeInterval = constant_handles.reader_make_constant_shell( makeString( "TimeInterval" ) );
    $list135 = ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "indexicalReferent" ) ), constant_handles.reader_make_constant_shell( makeString( "Now" ) ), makeSymbol( "?X" ) );
    $const136$startsAfterEndingOf = constant_handles.reader_make_constant_shell( makeString( "startsAfterEndingOf" ) );
    $sym137$RELEVANT_MT_IS_EVERYTHING = makeSymbol( "RELEVANT-MT-IS-EVERYTHING" );
    $sym138$_EXIT = makeSymbol( "%EXIT" );
    $const139$TimeDependentCollection = constant_handles.reader_make_constant_shell( makeString( "TimeDependentCollection" ) );
    $const140$TimeDependentRelation = constant_handles.reader_make_constant_shell( makeString( "TimeDependentRelation" ) );
    $const141$unknownSentence = constant_handles.reader_make_constant_shell( makeString( "unknownSentence" ) );
    $list142 = ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "TimeDependentCollection" ) ) );
    $list143 = ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "TimeDependentPredicate" ) ) );
    $const144$temporalRelationBetweenArguments = constant_handles.reader_make_constant_shell( makeString( "temporalRelationBetweenArguments" ) );
    $const145$endsAfterStartingOf = constant_handles.reader_make_constant_shell( makeString( "endsAfterStartingOf" ) );
    $const146$FutureTensePredicate = constant_handles.reader_make_constant_shell( makeString( "FutureTensePredicate" ) );
    $const147$CoexistingObjectsPredicate = constant_handles.reader_make_constant_shell( makeString( "CoexistingObjectsPredicate" ) );
    $list148 = ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "CoexistingObjectsPredicate" ) ) );
    $const149$earliestDateForCollectionMembers = constant_handles.reader_make_constant_shell( makeString( "earliestDateForCollectionMembers" ) );
    $const150$Date = constant_handles.reader_make_constant_shell( makeString( "Date" ) );
    $const151$BiologicalLivingObject = constant_handles.reader_make_constant_shell( makeString( "BiologicalLivingObject" ) );
    $const152$argIsa = constant_handles.reader_make_constant_shell( makeString( "argIsa" ) );
    $const153$genls = constant_handles.reader_make_constant_shell( makeString( "genls" ) );
    $list154 = ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "BiologicalLivingObject" ) ) );
    $const155$quotedIsa = constant_handles.reader_make_constant_shell( makeString( "quotedIsa" ) );
    $list156 = ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "IndeterminateTerm" ) ) );
    $const157$valueEquals = constant_handles.reader_make_constant_shell( makeString( "valueEquals" ) );
    $const158$TimeElapsedFn = constant_handles.reader_make_constant_shell( makeString( "TimeElapsedFn" ) );
    $list159 = ConsesLow.list( ONE_INTEGER );
    $float160$0_278 = makeDouble( 0.278 );
    $float161$0_23 = makeDouble( 0.23 );
    $float162$8_999999999999999e_4 = makeDouble( 8.999999999999999E-4 );
    $float163$0_078 = makeDouble( 0.078 );
    $const164$startingPointOfSubIntervalForAsse = constant_handles.reader_make_constant_shell( makeString( "startingPointOfSubIntervalForAssertion" ) );
    $const165$endingPointOfSubIntervalForAssert = constant_handles.reader_make_constant_shell( makeString( "endingPointOfSubIntervalForAssertion" ) );
    $sym166$_ = makeSymbol( "*" );
    $const167$and = constant_handles.reader_make_constant_shell( makeString( "and" ) );
    $const168$MonthsDuration = constant_handles.reader_make_constant_shell( makeString( "MonthsDuration" ) );
    $const169$Lambda = constant_handles.reader_make_constant_shell( makeString( "Lambda" ) );
    $const170$TimesFn = constant_handles.reader_make_constant_shell( makeString( "TimesFn" ) );
    $const171$ExponentFn = constant_handles.reader_make_constant_shell( makeString( "ExponentFn" ) );
    $float172$2_78 = makeDouble( 2.78 );
    $const173$MinusFn = constant_handles.reader_make_constant_shell( makeString( "MinusFn" ) );
    $kw174$INFERENCE_MODE = makeKeyword( "INFERENCE-MODE" );
    $kw175$MINIMAL = makeKeyword( "MINIMAL" );
    $kw176$ALLOW_INDETERMINATE_RESULTS_ = makeKeyword( "ALLOW-INDETERMINATE-RESULTS?" );
    $kw177$DISJUNCTION_FREE_EL_VARS_POLICY = makeKeyword( "DISJUNCTION-FREE-EL-VARS-POLICY" );
    $kw178$COMPUTE_INTERSECTION = makeKeyword( "COMPUTE-INTERSECTION" );
    $kw179$TRANSFORMATION_ALLOWED_ = makeKeyword( "TRANSFORMATION-ALLOWED?" );
    $kw180$ADD_RESTRICTION_LAYER_OF_INDIRECTION_ = makeKeyword( "ADD-RESTRICTION-LAYER-OF-INDIRECTION?" );
    $kw181$NEW_TERMS_ALLOWED_ = makeKeyword( "NEW-TERMS-ALLOWED?" );
    $kw182$COMPUTE_ANSWER_JUSTIFICATIONS_ = makeKeyword( "COMPUTE-ANSWER-JUSTIFICATIONS?" );
    $kw183$MAX_NUMBER = makeKeyword( "MAX-NUMBER" );
    $kw184$MAX_TIME = makeKeyword( "MAX-TIME" );
    $float185$0_01 = makeDouble( 0.01 );
    $kw186$PROBABLY_APPROXIMATELY_DONE = makeKeyword( "PROBABLY-APPROXIMATELY-DONE" );
    $float187$1_0 = makeDouble( 1.0 );
    $kw188$MAX_PROOF_DEPTH = makeKeyword( "MAX-PROOF-DEPTH" );
    $kw189$ANSWER_LANGUAGE = makeKeyword( "ANSWER-LANGUAGE" );
    $kw190$HL = makeKeyword( "HL" );
    $kw191$CONTINUABLE_ = makeKeyword( "CONTINUABLE?" );
    $kw192$PRODUCTIVITY_LIMIT = makeKeyword( "PRODUCTIVITY-LIMIT" );
    $int193$20000000 = makeInteger( 20000000 );
    $const194$priorProbabilityForPredicate_Type = constant_handles.reader_make_constant_shell( makeString( "priorProbabilityForPredicate-TypeType" ) );
    $sym195$LAMBDA_FUNCTION_ELT = makeSymbol( "LAMBDA-FUNCTION-ELT" );
    $const196$HomoSapiens = constant_handles.reader_make_constant_shell( makeString( "HomoSapiens" ) );
    $const197$distributionForTerminationOfMembe = constant_handles.reader_make_constant_shell( makeString( "distributionForTerminationOfMembershipAfterIntervalOfLength" ) );
    $list198 = ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "genls" ) ), constant_handles.reader_make_constant_shell( makeString( "HomoSapiens" ) ), constant_handles
        .reader_make_constant_shell( makeString( "BiologicalLivingObject" ) ) );
    $const199$distributionForCalculatingDuratio = constant_handles.reader_make_constant_shell( makeString( "distributionForCalculatingDurationOfSitType" ) );
    $float200$9_999999999999999e_7 = makeDouble( 1.0E-6 );
    $str201$___Time___a__a_Not_ending___a = makeString( "~% Time: ~a ~a Not ending: ~a" );
  }
}
/*
 * 
 * Total time: 1548 ms
 * 
 */