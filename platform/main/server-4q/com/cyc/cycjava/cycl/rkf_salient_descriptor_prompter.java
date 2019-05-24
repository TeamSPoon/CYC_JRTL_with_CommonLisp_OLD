package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.cycjava.cycl.inference.ask_utilities;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic;
import com.cyc.cycjava.cycl.inference.harness.inference_utilities;
import com.cyc.cycjava.cycl.inference.harness.inference_datastructures_inference;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality;
import com.cyc.cycjava.cycl.sbhl.sbhl_links;
import com.cyc.cycjava.cycl.sbhl.sbhl_graphs;
import com.cyc.cycjava.cycl.sbhl.sbhl_macros;
import com.cyc.cycjava.cycl.sbhl.sbhl_marking_utilities;
import com.cyc.cycjava.cycl.sbhl.sbhl_link_vars;
import com.cyc.cycjava.cycl.sbhl.sbhl_module_utilities;
import com.cyc.cycjava.cycl.sbhl.sbhl_module_vars;
import com.cyc.cycjava.cycl.sbhl.sbhl_paranoia;
import com.cyc.cycjava.cycl.sbhl.sbhl_search_vars;
import com.cyc.cycjava.cycl.sbhl.sbhl_marking_vars;
import com.cyc.cycjava.cycl.inference.harness.inference_kernel;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Eval;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Mapping;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sort;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Locks;
import com.cyc.cycjava.cycl.inference.harness.inference_datastructures_problem_store;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class rkf_salient_descriptor_prompter
    extends
      SubLTranslatedFile
{
  public static final SubLFile me;
  public static final String myName = "com.cyc.cycjava.cycl.rkf_salient_descriptor_prompter";
  public static final String myFingerPrint = "411a21b8bd9fbb9758d31334d69aefd4a75b400483be94b020ce87a9cc06301a";
  @SubLTranslatedFile.SubL(source = "cycl/rkf-salient-descriptor-prompter.lisp", position = 13390L)
  private static SubLSymbol $rkf_sd_strings_for_tactics$;
  @SubLTranslatedFile.SubL(source = "cycl/rkf-salient-descriptor-prompter.lisp", position = 15603L)
  private static SubLSymbol $rkf_prompter_sort_prompter$;
  @SubLTranslatedFile.SubL(source = "cycl/rkf-salient-descriptor-prompter.lisp", position = 27736L)
  public static SubLSymbol $rkf_sd_seed_term_tactics_table$;
  @SubLTranslatedFile.SubL(source = "cycl/rkf-salient-descriptor-prompter.lisp", position = 49129L)
  private static SubLSymbol $rkf_sd_suppress_rarely_known_prompt_formulasP$;
  @SubLTranslatedFile.SubL(source = "cycl/rkf-salient-descriptor-prompter.lisp", position = 49204L)
  private static SubLSymbol $rkf_sd_suppress_formula_percent_min$;
  @SubLTranslatedFile.SubL(source = "cycl/rkf-salient-descriptor-prompter.lisp", position = 49267L)
  private static SubLSymbol $rkf_sd_suppress_formula_count_min$;
  @SubLTranslatedFile.SubL(source = "cycl/rkf-salient-descriptor-prompter.lisp", position = 64563L)
  private static SubLSymbol $rkf_sd_seed_term$;
  @SubLTranslatedFile.SubL(source = "cycl/rkf-salient-descriptor-prompter.lisp", position = 70325L)
  private static SubLSymbol $rkf_sd_rule_score_tests$;
  @SubLTranslatedFile.SubL(source = "cycl/rkf-salient-descriptor-prompter.lisp", position = 78888L)
  private static SubLSymbol $rkf_unparseable_arg_types$;
  private static final SubLSymbol $sym0$RKF_SALIENT_DESCRIPTOR_PROMPTER_P;
  private static final SubLSymbol $kw1$GENERATOR_THREAD;
  private static final SubLSymbol $kw2$NONE;
  private static final SubLList $list3;
  private static final SubLSymbol $sym4$LOCK;
  private static final SubLSymbol $sym5$CLET;
  private static final SubLSymbol $sym6$RKF_SALIENT_DESCRIPTOR_PROMPTER_LOOKUP;
  private static final SubLList $list7;
  private static final SubLSymbol $sym8$WITH_LOCK_HELD;
  private static final SubLSymbol $kw9$WHOSTATE;
  private static final SubLList $list10;
  private static final SubLSymbol $sym11$STATE;
  private static final SubLList $list12;
  private static final SubLSymbol $sym13$WITH_MEMOIZATION_STATE;
  private static final SubLSymbol $sym14$_RKF_SD_PROBLEM_STORE_;
  private static final SubLSymbol $sym15$RKF_SD_PROMPTER_FIND_OR_SET_PROBLEM_STORE;
  private static final SubLSymbol $sym16$REUSING_RKF_SD_PROBLEM_STORE;
  private static final SubLSymbol $sym17$WITH_RKF_SD_PROMPTER_PROBLEM_STORE;
  private static final SubLSymbol $kw18$PROBLEM_STORE;
  private static final SubLSymbol $kw19$DONE;
  private static final SubLSymbol $kw20$MEMOIZATION_STATE;
  private static final SubLSymbol $kw21$REMOVED;
  private static final SubLSymbol $kw22$TACTIC_DONE;
  private static final SubLSymbol $kw23$LOCK;
  private static final SubLSymbol $kw24$BEST_PROMPT;
  private static final SubLSymbol $kw25$RECOMPUTE;
  private static final SubLSymbol $sym26$RKF_SALIENT_DESCRIPTOR_PROMPT_P;
  private static final SubLSymbol $kw27$LAST_TACTIC;
  private static final SubLList $list28;
  private static final SubLString $str29$None;
  private static final SubLString $str30$Unknown;
  private static final SubLSymbol $kw31$BAD;
  private static final SubLSymbol $sym32$RKF_SD_BETTER_PROMPT_;
  private static final SubLSymbol $sym33$INTEGERP;
  private static final SubLSymbol $kw34$EXAMPLE_INSTANCE;
  private static final SubLSymbol $kw35$SPECIFY;
  private static final SubLList $list36;
  private static final SubLSymbol $sym37$EL_VAR_;
  private static final SubLSymbol $kw38$ADDED;
  private static final SubLSymbol $kw39$ALREADY_PRESENT;
  private static final SubLSymbol $sym40$STRINGP;
  private static final SubLSymbol $sym41$SUPPORT_MT;
  private static final SubLSymbol $sym42$UNIVERSAL_DATE_P;
  private static final SubLSymbol $sym43$ASSERTED_WHEN;
  private static final SubLSymbol $sym44$ASSERTION_P;
  private static final SubLSymbol $kw45$IGNORE;
  private static final SubLSymbol $sym46$_;
  private static final SubLSymbol $sym47$RKF_SD_TERM_GENERALITY;
  private static final SubLList $list48;
  private static final SubLList $list49;
  private static final SubLSymbol $sym50$PROGN;
  private static final SubLSymbol $sym51$CHECK_TYPE;
  private static final SubLList $list52;
  private static final SubLSymbol $sym53$_RKF_SD_SEED_TERM_TACTICS_TABLE_;
  private static final SubLObject $const54$Microtheory;
  private static final SubLSymbol $kw55$MT;
  private static final SubLSymbol $kw56$FORT;
  private static final SubLSymbol $kw57$UNKNOWN;
  private static final SubLSymbol $kw58$GAF;
  private static final SubLSymbol $kw59$RULE;
  private static final SubLSymbol $sym60$FORT_P;
  private static final SubLString $str61$Couldn_t_find__S_in__S_;
  private static final SubLSymbol $kw62$TEMPLATE;
  private static final SubLObject $const63$focalTermPositionForFormulaTempla;
  private static final SubLObject $const64$formulaForFormulaTemplate;
  private static final SubLObject $const65$formulaTemplateExample;
  private static final SubLInteger $int66$100;
  private static final SubLList $list67;
  private static final SubLList $list68;
  private static final SubLObject $const69$SpecsFn;
  private static final SubLObject $const70$templateReplacementsInvisibleForP;
  private static final SubLObject $const71$candidateReplacementForPosition;
  private static final SubLObject $const72$glossForFormulaTemplate;
  private static final SubLObject $const73$formulaTemplateArgExplanation;
  private static final SubLObject $const74$assertMtForFormulaTemplate;
  private static final SubLObject $const75$assertionFormatForFormulaTemplate;
  private static final SubLObject $const76$SingleAssertionEntry;
  private static final SubLObject $const77$MultipleAssertionEntry;
  private static final SubLObject $const78$DataForNLMt;
  private static final SubLSymbol $sym79$SUGGEST_MT;
  private static final SubLSymbol $sym80$QUOTE;
  private static final SubLSymbol $sym81$_MT;
  private static final SubLObject $const82$defaultDefiningMtForSentence;
  private static final SubLSymbol $kw83$MAX_NUMBER;
  private static final SubLSymbol $kw84$MAX_TRANSFORMATION_DEPTH;
  private static final SubLSymbol $kw85$MAX_TIME;
  private static final SubLInteger $int86$30;
  private static final SubLSymbol $kw87$RETURN;
  private static final SubLObject $const88$GKEFormulaTemplatesMt;
  private static final SubLList $list89;
  private static final SubLObject $const90$InferencePSC;
  private static final SubLObject $const91$FormulaTemplate;
  private static final SubLObject $const92$isa;
  private static final SubLList $list93;
  private static final SubLObject $const94$formulaTemplateHasType;
  private static final SubLString $str95$constantNameAutoGeneratedFromColl;
  private static final SubLObject $const96$BaseKB;
  private static final SubLSymbol $sym97$RKF_GENERIC_EXAMPLE_P;
  private static final SubLSymbol $kw98$ANYTHING;
  private static final SubLSymbol $kw99$FOCAL_TERM;
  private static final SubLObject $const100$SomeExampleFn;
  private static final SubLObject $const101$focalTermTypeForInducedTemplateTy;
  private static final SubLSymbol $sym102$RELEVANT_MT_IS_EVERYTHING;
  private static final SubLObject $const103$EverythingPSC;
  private static final SubLSymbol $kw104$BREADTH;
  private static final SubLSymbol $kw105$QUEUE;
  private static final SubLSymbol $kw106$STACK;
  private static final SubLObject $const107$True_JustificationTruth;
  private static final SubLSymbol $sym108$RELEVANT_SBHL_TV_IS_GENERAL_TV;
  private static final SubLSymbol $kw109$ERROR;
  private static final SubLString $str110$_A_is_not_a__A;
  private static final SubLSymbol $sym111$SBHL_TRUE_TV_P;
  private static final SubLSymbol $kw112$CERROR;
  private static final SubLString $str113$continue_anyway;
  private static final SubLSymbol $kw114$WARN;
  private static final SubLString $str115$_A_is_not_a_valid__sbhl_type_erro;
  private static final SubLObject $const116$genls;
  private static final SubLString $str117$Redundant_with__S_____S_on__S;
  private static final SubLString $str118$_A_is_neither_SET_P_nor_LISTP_;
  private static final SubLString $str119$attempting_to_bind_direction_link;
  private static final SubLString $str120$Node__a_does_not_pass_sbhl_type_t;
  private static final SubLList $list121;
  private static final SubLString $str122$Hey_ho___S_has_got_to_go___;
  private static final SubLSymbol $sym123$ISA_COLLECTION_;
  private static final SubLList $list124;
  private static final SubLSymbol $sym125$ALIST_P;
  private static final SubLSymbol $kw126$EXHAUSTED;
  private static final SubLList $list127;
  private static final SubLSymbol $sym128$TACTICS_FOR_SEED_TERM_TYPE;
  private static final SubLSymbol $sym129$TACTICS_TABLE_COPY;
  private static final SubLSymbol $sym130$REMOVE;
  private static final SubLSymbol $sym131$RKF_SD_PROMPTER_TACTICS_FOR_SEED_TERM_TYPE;
  private static final SubLList $list132;
  private static final SubLList $list133;
  private static final SubLSymbol $sym134$ALIST_ENTER;
  private static final SubLList $list135;
  private static final SubLSymbol $sym136$TACTICS_FOR_SEED_TERM_TYPE;
  private static final SubLSymbol $sym137$TACTICS_TABLE_COPY;
  private static final SubLList $list138;
  private static final SubLSymbol $sym139$ORDERED_SET_DIFFERENCE;
  private static final SubLObject $const140$keSuggestion;
  private static final SubLObject $const141$keRequirement;
  private static final SubLObject $const142$keInteractionRequirement;
  private static final SubLObject $const143$keInteractionStrongSuggestion;
  private static final SubLList $list144;
  private static final SubLSymbol $kw145$KE_DRIVEN_PROMPTS;
  private static final SubLSymbol $sym146$RKF_NEIGHBOR_SUGGESTIONS;
  private static final SubLSymbol $kw147$SUPPRESS_RARELY_KNOWN_PROMPT_FORMULAS_;
  private static final SubLSymbol $kw148$RESULTS_QUEUE;
  private static final SubLList $list149;
  private static final SubLString $str150$Timed_out_after__S_seconds_gettin;
  private static final SubLSymbol $kw151$PROBABLY_APPROXIMATELY_DONE;
  private static final SubLString $str152$P_A_D__getting__S_for__S___;
  private static final SubLSymbol $kw153$EXHAUST_TOTAL;
  private static final SubLString $str154$_S_is_not_continuable____Exit_con;
  private static final SubLSymbol $sym155$_SEED_TERM;
  private static final SubLString $str156$Suppressing_SD_prompt_for__S_____;
  private static final SubLSymbol $sym157$RKF_SD_SUPPRESS_FORMULA_THRESHOLD_FOR_PROPERTY;
  private static final SubLSymbol $kw158$CACHED_INFERENCES;
  private static final SubLList $list159;
  private static final SubLList $list160;
  private static final SubLSymbol $sym161$_FORMULA;
  private static final SubLList $list162;
  private static final SubLSymbol $sym163$_SOURCE_TERM;
  private static final SubLSymbol $kw164$ANALOGOUS_TERMS;
  private static final SubLObject $const165$similarTo;
  private static final SubLList $list166;
  private static final SubLSymbol $kw167$PRECEDENT;
  private static final SubLObject $const168$Predicate;
  private static final SubLSymbol $sym169$_X;
  private static final SubLSymbol $kw170$ANALOGY_SUGGESTIONS;
  private static final SubLObject $const171$unknownSentence;
  private static final SubLSymbol $kw172$USE_RULES_;
  private static final SubLSymbol $kw173$FALSE;
  private static final SubLSymbol $kw174$RULE_TABLE;
  private static final SubLSymbol $kw175$TRUE;
  private static final SubLSymbol $sym176$EL_EXPRESSION_EQUAL_;
  private static final SubLSymbol $sym177$RKF_SD_PROMPTER_RULES_FOR_TERM;
  private static final SubLSymbol $kw178$NEG;
  private static final SubLSymbol $kw179$POS;
  private static final SubLSymbol $sym180$RKF_SD_RULE_TUPLE__;
  private static final SubLSymbol $sym181$RKF_SD_PREFER_RULE_TUPLE_;
  private static final SubLSymbol $sym182$RKF_SD_LOW_SCORING_TUPLE_P;
  private static final SubLSymbol $sym183$RKF_SD_SCORE_RULE_TUPLE;
  private static final SubLList $list184;
  private static final SubLList $list185;
  private static final SubLList $list186;
  private static final SubLSymbol $kw187$BETTER;
  private static final SubLSymbol $kw188$WORSE;
  private static final SubLList $list189;
  private static final SubLSymbol $sym190$RKF_SD_TERM_TOO_GENERAL_;
  private static final SubLInteger $int191$5000;
  private static final SubLObject $const192$keStrongSuggestion;
  private static final SubLObject $const193$keWeakSuggestion;
  private static final SubLSymbol $sym194$RKF_SD_NOT_ASSERTIBLE_SUBPROMPTS_;
  private static final SubLSymbol $sym195$RKF_SD_UNPARSEABLE_SUBPROMPTS_;
  private static final SubLSymbol $sym196$RKF_SD_UNPARSEABLE_PROMPT_LIT_;
  private static final SubLList $list197;
  private static final SubLList $list198;
  private static final SubLObject $const199$defnSufficient;
  private static final SubLObject $const200$defnIff;
  private static final SubLObject $const201$resultIsa;
  private static final SubLObject $const202$CoaDiagramObject;
  private static final SubLList $list203;
  private static final SubLSymbol $sym204$RKF_SD_PROMPTER_FIND_RULE_PROMPTS;
  private static final SubLSymbol $sym205$RKF_SD_EL_FULLY_BOUND_P;
  private static final SubLSymbol $kw206$STRONG;
  private static final SubLSymbol $kw207$WEAK;
  private static final SubLList $list208;
  private static final SubLSymbol $kw209$ISA;
  private static final SubLSymbol $kw210$BIN_PRED;
  private static final SubLSymbol $sym211$RKF_SD_PROMPT_EXAMPLE_INSTANCE;

  @SubLTranslatedFile.SubL(source = "cycl/rkf-salient-descriptor-prompter.lisp", position = 1271L)
  public static SubLObject rkf_salient_descriptor_prompter_prune_unused_prompts(final SubLObject prompter)
  {
    assert NIL != rkf_salient_descriptor_datastructures.rkf_salient_descriptor_prompter_p( prompter ) : prompter;
    rkf_sd_prompter_prune_bad_prompts( prompter );
    return prompter;
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-salient-descriptor-prompter.lisp", position = 1476L)
  public static SubLObject rkf_salient_descriptor_prompter_prompt_count(final SubLObject prompter)
  {
    final SubLObject unused_prompts = rkf_salient_descriptor_datastructures.rkf_sd_prompter_unused_prompts( prompter );
    if( NIL != set.set_p( unused_prompts ) )
    {
      return set.set_size( unused_prompts );
    }
    return ZERO_INTEGER;
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-salient-descriptor-prompter.lisp", position = 1697L)
  public static SubLObject rkf_salient_descriptor_prompter_note_generator_thread(final SubLObject prompter, final SubLObject generator_thread)
  {
    return rkf_salient_descriptor_datastructures.rkf_salient_descriptor_prompter_set( prompter, $kw1$GENERATOR_THREAD, generator_thread );
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-salient-descriptor-prompter.lisp", position = 1886L)
  public static SubLObject rkf_salient_descriptor_prompter_clear_generator_thread(final SubLObject prompter)
  {
    return rkf_salient_descriptor_datastructures.rkf_salient_descriptor_prompter_set( prompter, $kw1$GENERATOR_THREAD, $kw2$NONE );
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-salient-descriptor-prompter.lisp", position = 2048L)
  public static SubLObject rkf_salient_descriptor_candidate_p(final SubLObject v_object)
  {
    final SubLObject seed_term_type = rkf_sd_prompter_compute_seed_term_type( v_object );
    final SubLObject tactics = rkf_sd_prompter_tactics_for_seed_term_type( seed_term_type );
    return list_utilities.sublisp_boolean( tactics );
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-salient-descriptor-prompter.lisp", position = 2354L)
  public static SubLObject with_rkf_sd_prompter_lock_held(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list3 );
    final SubLObject temp = current.rest();
    current = current.first();
    SubLObject prompter = NIL;
    SubLObject whostate = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list3 );
    prompter = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list3 );
    whostate = current.first();
    current = current.rest();
    if( NIL == current )
    {
      final SubLObject body;
      current = ( body = temp );
      final SubLObject lock = $sym4$LOCK;
      return ConsesLow.list( $sym5$CLET, ConsesLow.list( ConsesLow.list( lock, ConsesLow.listS( $sym6$RKF_SALIENT_DESCRIPTOR_PROMPTER_LOOKUP, prompter, $list7 ) ) ), ConsesLow.listS( $sym8$WITH_LOCK_HELD, ConsesLow.list(
          lock, $kw9$WHOSTATE, whostate ), ConsesLow.append( body, NIL ) ) );
    }
    cdestructuring_bind.cdestructuring_bind_error( datum, $list3 );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-salient-descriptor-prompter.lisp", position = 2613L)
  public static SubLObject with_rkf_sd_prompter_memoization_state(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list10 );
    final SubLObject temp = current.rest();
    current = current.first();
    SubLObject prompter = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list10 );
    prompter = current.first();
    current = current.rest();
    if( NIL == current )
    {
      final SubLObject body;
      current = ( body = temp );
      final SubLObject state = $sym11$STATE;
      return ConsesLow.list( $sym5$CLET, ConsesLow.list( ConsesLow.list( state, ConsesLow.listS( $sym6$RKF_SALIENT_DESCRIPTOR_PROMPTER_LOOKUP, prompter, $list12 ) ) ), ConsesLow.listS( $sym13$WITH_MEMOIZATION_STATE,
          ConsesLow.list( state ), ConsesLow.append( body, NIL ) ) );
    }
    cdestructuring_bind.cdestructuring_bind_error( datum, $list10 );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-salient-descriptor-prompter.lisp", position = 2916L)
  public static SubLObject with_rkf_sd_prompter_problem_store(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list10 );
    final SubLObject temp = current.rest();
    current = current.first();
    SubLObject prompter = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list10 );
    prompter = current.first();
    current = current.rest();
    if( NIL == current )
    {
      final SubLObject body;
      current = ( body = temp );
      return ConsesLow.list( $sym5$CLET, ConsesLow.list( ConsesLow.list( $sym14$_RKF_SD_PROBLEM_STORE_, ConsesLow.list( $sym15$RKF_SD_PROMPTER_FIND_OR_SET_PROBLEM_STORE, prompter ) ) ), reader.bq_cons(
          $sym16$REUSING_RKF_SD_PROBLEM_STORE, ConsesLow.append( body, NIL ) ) );
    }
    cdestructuring_bind.cdestructuring_bind_error( datum, $list10 );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-salient-descriptor-prompter.lisp", position = 3138L)
  public static SubLObject rkf_sd_examples_for_prompt(final SubLObject prompt, final SubLObject bad_example_num, final SubLObject bad_examples)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject justification = rkf_salient_descriptor_datastructures.rkf_salient_descriptor_prompt_justification( prompt );
    final SubLObject prompter = rkf_salient_descriptor_datastructures.rkf_salient_descriptor_prompt_prompter( prompt );
    final SubLObject v_term = rkf_salient_descriptor_prompter_seed_term( prompter );
    final SubLObject mt = rkf_salient_descriptor_prompter_mt( prompter );
    final SubLObject salient_property_sentence = rkf_salient_descriptor.rkf_salient_property_sentence_from_justification( v_term, justification );
    final SubLObject subprompts = rkf_salient_descriptor_datastructures.rkf_salient_descriptor_prompt_subprompts( prompt );
    final SubLObject subprompt = ConsesLow.nth( bad_example_num, subprompts );
    final SubLObject formula = rkf_salient_descriptor.rkf_salient_descriptor_subprompt_assert_sentence( subprompt, UNPROVIDED, UNPROVIDED );
    SubLObject new_examples = NIL;
    final SubLObject _prev_bind_0 = rkf_macros.$rkf_ok_to_generate_examplesP$.currentBinding( thread );
    final SubLObject _prev_bind_2 = rkf_salient_descriptor.$rkf_sd_problem_store$.currentBinding( thread );
    try
    {
      rkf_macros.$rkf_ok_to_generate_examplesP$.bind( T, thread );
      rkf_salient_descriptor.$rkf_sd_problem_store$.bind( rkf_sd_prompter_find_or_set_problem_store( prompter ), thread );
      final SubLObject reuse_existingP = rkf_salient_descriptor.rkf_sd_problem_store_okP( rkf_salient_descriptor.$rkf_sd_problem_store$.getDynamicValue( thread ) );
      final SubLObject _prev_bind_0_$1 = rkf_salient_descriptor.$rkf_sd_problem_store$.currentBinding( thread );
      try
      {
        rkf_salient_descriptor.$rkf_sd_problem_store$.bind( rkf_salient_descriptor.rkf_sd_find_or_make_problem_store(), thread );
        final SubLObject store = rkf_salient_descriptor.$rkf_sd_problem_store$.getDynamicValue( thread );
        try
        {
          new_examples = rkf_salient_descriptor.rkf_sd_examples( formula, v_term, mt, salient_property_sentence, bad_examples, UNPROVIDED, UNPROVIDED, UNPROVIDED );
        }
        finally
        {
          final SubLObject _prev_bind_0_$2 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
          try
          {
            Threads.$is_thread_performing_cleanupP$.bind( T, thread );
            final SubLObject _values = Values.getValuesAsVector();
            if( NIL == reuse_existingP )
            {
              rkf_salient_descriptor.rkf_sd_free_problem_store( store );
            }
            Values.restoreValuesFromVector( _values );
          }
          finally
          {
            Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$2, thread );
          }
        }
      }
      finally
      {
        rkf_salient_descriptor.$rkf_sd_problem_store$.rebind( _prev_bind_0_$1, thread );
      }
    }
    finally
    {
      rkf_salient_descriptor.$rkf_sd_problem_store$.rebind( _prev_bind_2, thread );
      rkf_macros.$rkf_ok_to_generate_examplesP$.rebind( _prev_bind_0, thread );
    }
    return new_examples;
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-salient-descriptor-prompter.lisp", position = 3999L)
  public static SubLObject rkf_sd_prompter_find_or_set_problem_store(final SubLObject prompter)
  {
    SubLObject problem_store = rkf_salient_descriptor_datastructures.rkf_salient_descriptor_prompter_lookup( prompter, $kw18$PROBLEM_STORE, UNPROVIDED );
    if( NIL == rkf_salient_descriptor.rkf_sd_problem_store_okP( problem_store ) )
    {
      problem_store = rkf_salient_descriptor_prompter_reset_problem_store( prompter );
    }
    return problem_store;
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-salient-descriptor-prompter.lisp", position = 4383L)
  public static SubLObject rkf_salient_descriptor_prompter_reset_problem_store(final SubLObject prompter)
  {
    final SubLObject old_problem_store = rkf_salient_descriptor_datastructures.rkf_salient_descriptor_prompter_lookup( prompter, $kw18$PROBLEM_STORE, UNPROVIDED );
    final SubLObject new_problem_store = rkf_salient_descriptor.rkf_sd_make_problem_store();
    if( NIL != inference_datastructures_problem_store.problem_store_p( old_problem_store ) )
    {
      rkf_salient_descriptor.rkf_sd_free_problem_store( old_problem_store );
    }
    rkf_salient_descriptor_datastructures.rkf_salient_descriptor_prompter_set( prompter, $kw18$PROBLEM_STORE, new_problem_store );
    return new_problem_store;
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-salient-descriptor-prompter.lisp", position = 4862L)
  public static SubLObject rkf_salient_descriptor_prompter_next(final SubLObject prompter, SubLObject chosen_prompt)
  {
    if( chosen_prompt == UNPROVIDED )
    {
      chosen_prompt = NIL;
    }
    final SubLObject use_generator_threadP = rkf_salient_descriptor_prompter_has_generator_thread_p( prompter );
    while ( NIL == rkf_salient_descriptor_datastructures.rkf_salient_descriptor_prompt_p( chosen_prompt ) && NIL == rkf_sd_prompter_exhausted_p( prompter ))
    {
      if( NIL == use_generator_threadP )
      {
        rkf_salient_descriptor_prompter_generate_prompt( prompter, UNPROVIDED );
      }
      else if( NIL == rkf_salient_descriptor_prompter_has_generator_thread_p( prompter ) )
      {
        rkf_salient_descriptor_prompter_generate_prompt( prompter, UNPROVIDED );
      }
      else
      {
        rkf_salient_descriptor_prompter_unblock_generator_thread( prompter );
        Threads.sleep( ONE_INTEGER );
      }
      chosen_prompt = rkf_sd_prompter_best_prompt( prompter );
    }
    if( NIL != rkf_salient_descriptor_datastructures.rkf_salient_descriptor_prompt_p( chosen_prompt ) )
    {
      rkf_sd_prompter_mark_prompt_used( prompter, chosen_prompt );
    }
    else
    {
      chosen_prompt = $kw19$DONE;
      rkf_salient_descriptor_prompter_finalize( prompter );
    }
    return chosen_prompt;
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-salient-descriptor-prompter.lisp", position = 6151L)
  public static SubLObject rkf_salient_descriptor_prompter_finalize(final SubLObject prompter)
  {
    final SubLObject v_memoization_state = rkf_salient_descriptor_datastructures.rkf_salient_descriptor_prompter_lookup( prompter, $kw20$MEMOIZATION_STATE, UNPROVIDED );
    if( NIL != memoization_state.memoization_state_p( v_memoization_state ) )
    {
      memoization_state.clear_all_memoization( v_memoization_state );
    }
    final SubLObject problem_store = rkf_salient_descriptor_datastructures.rkf_salient_descriptor_prompter_lookup( prompter, $kw18$PROBLEM_STORE, UNPROVIDED );
    if( NIL != inference_datastructures_problem_store.problem_store_p( problem_store ) )
    {
      inference_datastructures_problem_store.destroy_problem_store( problem_store );
    }
    return prompter;
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-salient-descriptor-prompter.lisp", position = 6617L)
  public static SubLObject rkf_sd_prompter_mark_prompt_used(final SubLObject prompter, final SubLObject prompt)
  {
    rkf_sd_prompter_remove_unused_prompt( prompter, prompt );
    set.set_add( prompt, rkf_salient_descriptor_datastructures.rkf_sd_prompter_used_prompts( prompter ) );
    return prompter;
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-salient-descriptor-prompter.lisp", position = 6819L)
  public static SubLObject rkf_sd_prompter_remove_unused_prompt(final SubLObject prompter, final SubLObject prompt)
  {
    set.set_remove( prompt, rkf_salient_descriptor_datastructures.rkf_sd_prompter_unused_prompts( prompter ) );
    rkf_salient_descriptor_prompter_unblock_generator_thread( prompter );
    return $kw21$REMOVED;
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-salient-descriptor-prompter.lisp", position = 7043L)
  public static SubLObject rkf_salient_descriptor_prompter_has_generator_thread_p(final SubLObject prompter)
  {
    final SubLObject generator_thread = rkf_salient_descriptor_datastructures.rkf_salient_descriptor_prompter_lookup( prompter, $kw1$GENERATOR_THREAD, UNPROVIDED );
    return Threads.valid_process_p( generator_thread );
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-salient-descriptor-prompter.lisp", position = 7269L)
  public static SubLObject rkf_salient_descriptor_prompter_unblock_generator_thread(final SubLObject prompter)
  {
    final SubLObject generator_thread = rkf_salient_descriptor_datastructures.rkf_salient_descriptor_prompter_lookup( prompter, $kw1$GENERATOR_THREAD, UNPROVIDED );
    if( NIL != Threads.valid_process_p( generator_thread ) )
    {
      Threads.process_unblock( generator_thread );
    }
    return prompter;
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-salient-descriptor-prompter.lisp", position = 7557L)
  public static SubLObject rkf_salient_descriptor_prompter_generate_prompt(final SubLObject prompter, SubLObject allow_tactic_rolloverP)
  {
    if( allow_tactic_rolloverP == UNPROVIDED )
    {
      allow_tactic_rolloverP = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject start_count = set.set_size( rkf_salient_descriptor_datastructures.rkf_sd_prompter_unused_prompts( prompter ) );
    SubLObject result = NIL;
    final SubLObject local_state;
    final SubLObject state = local_state = rkf_salient_descriptor_datastructures.rkf_salient_descriptor_prompter_lookup( prompter, $kw20$MEMOIZATION_STATE, memoization_state.current_memoization_state() );
    final SubLObject _prev_bind_0 = memoization_state.$memoization_state$.currentBinding( thread );
    try
    {
      memoization_state.$memoization_state$.bind( local_state, thread );
      final SubLObject original_memoization_process = memoization_state.memoization_state_original_process( local_state );
      try
      {
        while ( !set.set_size( rkf_salient_descriptor_datastructures.rkf_sd_prompter_unused_prompts( prompter ) ).numG( start_count ) && result != $kw19$DONE && ( NIL != allow_tactic_rolloverP
            || result != $kw22$TACTIC_DONE ))
        {
          result = rkf_sd_prompter_apply_tactics( prompter );
        }
        if( !start_count.eql( set.set_size( rkf_salient_descriptor_datastructures.rkf_sd_prompter_unused_prompts( prompter ) ) ) )
        {
          rkf_sd_prompter_update_best_prompt( prompter );
        }
      }
      finally
      {
        final SubLObject _prev_bind_0_$3 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          memoization_state.memoization_state_possibly_clear_original_process( local_state, original_memoization_process );
          Values.restoreValuesFromVector( _values );
        }
        finally
        {
          Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$3, thread );
        }
      }
    }
    finally
    {
      memoization_state.$memoization_state$.rebind( _prev_bind_0, thread );
    }
    return result;
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-salient-descriptor-prompter.lisp", position = 8339L)
  public static SubLObject rkf_salient_descriptor_prompter_remove_prompt(final SubLObject prompter, final SubLObject prompt)
  {
    final SubLObject lock = rkf_salient_descriptor_datastructures.rkf_salient_descriptor_prompter_lookup( prompter, $kw23$LOCK, UNPROVIDED );
    SubLObject release = NIL;
    try
    {
      release = Locks.seize_lock( lock );
      final SubLObject best_prompt = rkf_salient_descriptor_datastructures.rkf_salient_descriptor_prompter_lookup( prompter, $kw24$BEST_PROMPT, UNPROVIDED );
      if( best_prompt.eql( prompt ) )
      {
        rkf_salient_descriptor_datastructures.rkf_salient_descriptor_prompter_set( prompter, $kw24$BEST_PROMPT, $kw25$RECOMPUTE );
      }
      rkf_sd_prompter_remove_unused_prompt( prompter, prompt );
    }
    finally
    {
      if( NIL != release )
      {
        Locks.release_lock( lock );
      }
    }
    return prompter;
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-salient-descriptor-prompter.lisp", position = 8791L)
  public static SubLObject rkf_salient_descriptor_prompter_replace_prompt(final SubLObject prompter, final SubLObject prompt)
  {
    assert NIL != rkf_salient_descriptor_datastructures.rkf_salient_descriptor_prompter_p( prompter ) : prompter;
    assert NIL != rkf_salient_descriptor_datastructures.rkf_salient_descriptor_prompt_p( prompt ) : prompt;
    set.set_remove( prompt, rkf_salient_descriptor_datastructures.rkf_sd_prompter_used_prompts( prompter ) );
    return rkf_sd_prompter_add_to_unused_prompts( prompter, prompt );
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-salient-descriptor-prompter.lisp", position = 9181L)
  public static SubLObject rkf_salient_descriptor_prompter_mt(final SubLObject prompter)
  {
    return rkf_salient_descriptor_datastructures.rkf_sd_prompter_mt( prompter );
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-salient-descriptor-prompter.lisp", position = 9323L)
  public static SubLObject rkf_salient_descriptor_prompter_seed_term(final SubLObject prompter)
  {
    return rkf_salient_descriptor_datastructures.rkf_sd_prompter_seed_term( prompter );
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-salient-descriptor-prompter.lisp", position = 9495L)
  public static SubLObject rkf_salient_descriptor_prompter_pop_prompt_tactic(final SubLObject prompter, final SubLObject prompt)
  {
    final SubLObject tactic_to_pop = rkf_salient_descriptor_datastructures.rkf_sd_prompt_tactic( prompt );
    if( tactic_to_pop.eql( rkf_salient_descriptor_prompter_current_tactic( prompter ) ) )
    {
      rkf_salient_descriptor_datastructures._csetf_rkf_sd_prompter_tactics( prompter, rkf_salient_descriptor_datastructures.rkf_sd_prompter_tactics( prompter ).rest() );
    }
    final SubLObject lock = rkf_salient_descriptor_datastructures.rkf_salient_descriptor_prompter_lookup( prompter, $kw23$LOCK, UNPROVIDED );
    SubLObject release = NIL;
    try
    {
      release = Locks.seize_lock( lock );
      final SubLObject best_prompt = rkf_salient_descriptor_datastructures.rkf_salient_descriptor_prompter_lookup( prompter, $kw24$BEST_PROMPT, UNPROVIDED );
      if( NIL != rkf_salient_descriptor_datastructures.rkf_salient_descriptor_prompt_p( best_prompt ) && tactic_to_pop.eql( rkf_salient_descriptor_datastructures.rkf_sd_prompt_tactic( best_prompt ) ) )
      {
        rkf_salient_descriptor_datastructures.rkf_salient_descriptor_prompter_set( prompter, $kw24$BEST_PROMPT, $kw25$RECOMPUTE );
      }
      rkf_sd_prompter_prune_tactic_prompts( prompter, tactic_to_pop );
    }
    finally
    {
      if( NIL != release )
      {
        Locks.release_lock( lock );
      }
    }
    return prompter;
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-salient-descriptor-prompter.lisp", position = 10375L)
  public static SubLObject rkf_sd_prompter_prune_tactic_prompts(final SubLObject prompter, final SubLObject tactic_to_pop)
  {
    final SubLObject bad_prompts = set.new_set( UNPROVIDED, UNPROVIDED );
    final SubLObject set_var = rkf_salient_descriptor_datastructures.rkf_sd_prompter_unused_prompts( prompter );
    final SubLObject set_contents_var = set.do_set_internal( set_var );
    SubLObject basis_object;
    SubLObject state;
    SubLObject prompt;
    for( basis_object = set_contents.do_set_contents_basis_object( set_contents_var ), state = NIL, state = set_contents.do_set_contents_initial_state( basis_object, set_contents_var ); NIL == set_contents
        .do_set_contents_doneP( basis_object, state ); state = set_contents.do_set_contents_update_state( state ) )
    {
      prompt = set_contents.do_set_contents_next( basis_object, state );
      if( NIL != set_contents.do_set_contents_element_validP( state, prompt ) && tactic_to_pop.eql( rkf_salient_descriptor_datastructures.rkf_sd_prompt_tactic( prompt ) ) )
      {
        set.set_add( prompt, bad_prompts );
      }
    }
    final SubLObject set_contents_var2 = set.do_set_internal( bad_prompts );
    SubLObject basis_object2;
    SubLObject state2;
    SubLObject bad_prompt;
    for( basis_object2 = set_contents.do_set_contents_basis_object( set_contents_var2 ), state2 = NIL, state2 = set_contents.do_set_contents_initial_state( basis_object2, set_contents_var2 ); NIL == set_contents
        .do_set_contents_doneP( basis_object2, state2 ); state2 = set_contents.do_set_contents_update_state( state2 ) )
    {
      bad_prompt = set_contents.do_set_contents_next( basis_object2, state2 );
      if( NIL != set_contents.do_set_contents_element_validP( state2, bad_prompt ) )
      {
        rkf_sd_prompter_remove_unused_prompt( prompter, bad_prompt );
      }
    }
    return prompter;
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-salient-descriptor-prompter.lisp", position = 10768L)
  public static SubLObject rkf_sd_prompter_prune_bad_prompts(final SubLObject prompter)
  {
    final SubLObject bad_prompts = set.new_set( UNPROVIDED, UNPROVIDED );
    final SubLObject set_var = rkf_salient_descriptor_datastructures.rkf_sd_prompter_unused_prompts( prompter );
    final SubLObject set_contents_var = set.do_set_internal( set_var );
    SubLObject basis_object;
    SubLObject state;
    SubLObject prompt;
    for( basis_object = set_contents.do_set_contents_basis_object( set_contents_var ), state = NIL, state = set_contents.do_set_contents_initial_state( basis_object, set_contents_var ); NIL == set_contents
        .do_set_contents_doneP( basis_object, state ); state = set_contents.do_set_contents_update_state( state ) )
    {
      prompt = set_contents.do_set_contents_next( basis_object, state );
      if( NIL != set_contents.do_set_contents_element_validP( state, prompt ) && NIL != rkf_sd_bad_promptP( prompt ) )
      {
        set.set_add( prompt, bad_prompts );
      }
    }
    final SubLObject set_contents_var2 = set.do_set_internal( bad_prompts );
    SubLObject basis_object2;
    SubLObject state2;
    SubLObject bad_prompt;
    for( basis_object2 = set_contents.do_set_contents_basis_object( set_contents_var2 ), state2 = NIL, state2 = set_contents.do_set_contents_initial_state( basis_object2, set_contents_var2 ); NIL == set_contents
        .do_set_contents_doneP( basis_object2, state2 ); state2 = set_contents.do_set_contents_update_state( state2 ) )
    {
      bad_prompt = set_contents.do_set_contents_next( basis_object2, state2 );
      if( NIL != set_contents.do_set_contents_element_validP( state2, bad_prompt ) )
      {
        rkf_sd_prompter_remove_unused_prompt( prompter, bad_prompt );
      }
    }
    return prompter;
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-salient-descriptor-prompter.lisp", position = 11122L)
  public static SubLObject rkf_sd_bad_promptP(final SubLObject prompt)
  {
    final SubLObject subprompts = rkf_salient_descriptor_datastructures.rkf_sd_prompt_subprompts( prompt );
    SubLObject badP = makeBoolean( NIL == rkf_salient_descriptor.rkf_salient_descriptor_subprompts_p( subprompts ) );
    if( NIL == badP )
    {
      final SubLObject justification = rkf_salient_descriptor_datastructures.rkf_sd_prompt_justification( prompt );
      final SubLObject mt = rkf_salient_descriptor_datastructures.rkf_sd_prompter_mt( rkf_salient_descriptor_datastructures.rkf_sd_prompt_prompter( prompt ) );
      if( NIL != arguments.supports_p( justification ) && NIL == badP )
      {
        SubLObject csome_list_var;
        SubLObject support;
        for( csome_list_var = justification, support = NIL, support = csome_list_var.first(); NIL == badP && NIL != csome_list_var; badP = makeBoolean( NIL == rkf_sd_ok_support_p( support,
            mt ) ), csome_list_var = csome_list_var.rest(), support = csome_list_var.first() )
        {
        }
      }
    }
    return badP;
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-salient-descriptor-prompter.lisp", position = 11591L)
  public static SubLObject rkf_sd_ok_support_p(final SubLObject support, final SubLObject mt)
  {
    if( NIL != assertion_handles.assertion_p( support ) )
    {
      return makeBoolean( NIL != assertions_high.valid_assertion( support, UNPROVIDED ) && NIL == rkf_salient_descriptor.rkf_deprecated_sd_ruleP( support, mt ) );
    }
    if( NIL != arguments.hl_support_p( support ) )
    {
      return hl_supports.hl_verify( support );
    }
    return T;
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-salient-descriptor-prompter.lisp", position = 11847L)
  public static SubLObject rkf_salient_descriptor_prompter_last_tactic(final SubLObject prompter)
  {
    return rkf_salient_descriptor_datastructures.rkf_salient_descriptor_prompter_lookup( prompter, $kw27$LAST_TACTIC, NIL );
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-salient-descriptor-prompter.lisp", position = 12077L)
  public static SubLObject rkf_salient_descriptor_prompter_current_tactic(final SubLObject prompter)
  {
    return rkf_salient_descriptor_datastructures.rkf_sd_prompter_tactics( prompter ).first();
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-salient-descriptor-prompter.lisp", position = 12295L)
  public static SubLObject rkf_salient_descriptor_prompter_next_tactic(final SubLObject prompter)
  {
    return conses_high.second( rkf_salient_descriptor_datastructures.rkf_sd_prompter_tactics( prompter ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-salient-descriptor-prompter.lisp", position = 12529L)
  public static SubLObject rkf_salient_descriptor_prompter_current_tactic_string(final SubLObject prompter, final SubLObject language_mt)
  {
    final SubLObject tactic = rkf_salient_descriptor_prompter_current_tactic( prompter );
    return rkf_sd_string_for_tactic( tactic, language_mt );
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-salient-descriptor-prompter.lisp", position = 12832L)
  public static SubLObject rkf_salient_descriptor_prompter_next_tactic_string(final SubLObject prompter, final SubLObject language_mt)
  {
    final SubLObject tactic = rkf_salient_descriptor_prompter_next_tactic( prompter );
    return rkf_sd_string_for_tactic( tactic, language_mt );
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-salient-descriptor-prompter.lisp", position = 13146L)
  public static SubLObject rkf_salient_descriptor_prompt_tactic_string(final SubLObject prompt, final SubLObject language_mt)
  {
    final SubLObject tactic = rkf_salient_descriptor_datastructures.rkf_sd_prompt_tactic( prompt );
    return rkf_sd_string_for_tactic( tactic, language_mt );
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-salient-descriptor-prompter.lisp", position = 14069L)
  public static SubLObject rkf_sd_string_for_tactic(final SubLObject tactic, final SubLObject language_mt)
  {
    if( NIL == tactic )
    {
      return $str29$None;
    }
    return list_utilities.alist_lookup( $rkf_sd_strings_for_tactics$.getGlobalValue(), tactic, Symbols.symbol_function( EQL ), $str30$Unknown );
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-salient-descriptor-prompter.lisp", position = 14277L)
  public static SubLObject rkf_sd_prompter_best_prompt(final SubLObject prompter)
  {
    SubLObject best_prompt = rkf_salient_descriptor_datastructures.rkf_salient_descriptor_prompter_lookup( prompter, $kw24$BEST_PROMPT, $kw25$RECOMPUTE );
    if( best_prompt == $kw25$RECOMPUTE )
    {
      best_prompt = rkf_sd_prompter_update_best_prompt( prompter );
    }
    if( NIL != rkf_salient_descriptor_datastructures.rkf_salient_descriptor_prompt_p( best_prompt ) )
    {
      rkf_salient_descriptor_datastructures.rkf_salient_descriptor_prompter_set( prompter, $kw24$BEST_PROMPT, $kw25$RECOMPUTE );
    }
    else
    {
      rkf_salient_descriptor_datastructures.rkf_salient_descriptor_prompter_set( prompter, $kw24$BEST_PROMPT, $kw2$NONE );
    }
    return best_prompt;
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-salient-descriptor-prompter.lisp", position = 14773L)
  public static SubLObject rkf_sd_prompter_update_best_prompt(final SubLObject prompter)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject best_prompt;
    final SubLObject v_default = best_prompt = $kw2$NONE;
    final SubLObject lock = rkf_salient_descriptor_datastructures.rkf_salient_descriptor_prompter_lookup( prompter, $kw23$LOCK, UNPROVIDED );
    SubLObject release = NIL;
    try
    {
      release = Locks.seize_lock( lock );
      final SubLObject set_var = rkf_salient_descriptor_datastructures.rkf_sd_prompter_unused_prompts( prompter );
      final SubLObject set_contents_var = set.do_set_internal( set_var );
      SubLObject basis_object;
      SubLObject state;
      SubLObject prompt;
      for( basis_object = set_contents.do_set_contents_basis_object( set_contents_var ), state = NIL, state = set_contents.do_set_contents_initial_state( basis_object, set_contents_var ); NIL == set_contents
          .do_set_contents_doneP( basis_object, state ); state = set_contents.do_set_contents_update_state( state ) )
      {
        prompt = set_contents.do_set_contents_next( basis_object, state );
        if( NIL != set_contents.do_set_contents_element_validP( state, prompt ) && NIL != rkf_sd_prompter_prefer_promptP( prompter, prompt, best_prompt, v_default ) )
        {
          best_prompt = prompt;
        }
      }
      if( !v_default.eql( best_prompt ) )
      {
        final SubLObject _prev_bind_0 = rkf_salient_descriptor.$rkf_sd_problem_store$.currentBinding( thread );
        try
        {
          rkf_salient_descriptor.$rkf_sd_problem_store$.bind( rkf_sd_prompter_find_or_set_problem_store( prompter ), thread );
          final SubLObject reuse_existingP = rkf_salient_descriptor.rkf_sd_problem_store_okP( rkf_salient_descriptor.$rkf_sd_problem_store$.getDynamicValue( thread ) );
          final SubLObject _prev_bind_0_$4 = rkf_salient_descriptor.$rkf_sd_problem_store$.currentBinding( thread );
          try
          {
            rkf_salient_descriptor.$rkf_sd_problem_store$.bind( rkf_salient_descriptor.rkf_sd_find_or_make_problem_store(), thread );
            final SubLObject store = rkf_salient_descriptor.$rkf_sd_problem_store$.getDynamicValue( thread );
            try
            {
              rkf_sd_prompt_maybe_compute_subprompts( best_prompt );
              if( $kw31$BAD == rkf_salient_descriptor_datastructures.rkf_sd_prompt_subprompts( best_prompt ) )
              {
                rkf_sd_prompter_remove_unused_prompt( prompter, best_prompt );
                best_prompt = rkf_sd_prompter_update_best_prompt( prompter );
              }
            }
            finally
            {
              final SubLObject _prev_bind_0_$5 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
              try
              {
                Threads.$is_thread_performing_cleanupP$.bind( T, thread );
                final SubLObject _values = Values.getValuesAsVector();
                if( NIL == reuse_existingP )
                {
                  rkf_salient_descriptor.rkf_sd_free_problem_store( store );
                }
                Values.restoreValuesFromVector( _values );
              }
              finally
              {
                Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$5, thread );
              }
            }
          }
          finally
          {
            rkf_salient_descriptor.$rkf_sd_problem_store$.rebind( _prev_bind_0_$4, thread );
          }
        }
        finally
        {
          rkf_salient_descriptor.$rkf_sd_problem_store$.rebind( _prev_bind_0, thread );
        }
      }
    }
    finally
    {
      if( NIL != release )
      {
        Locks.release_lock( lock );
      }
    }
    rkf_salient_descriptor_datastructures.rkf_salient_descriptor_prompter_set( prompter, $kw24$BEST_PROMPT, best_prompt );
    return best_prompt;
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-salient-descriptor-prompter.lisp", position = 15660L)
  public static SubLObject rkf_salient_descriptor_prompter_sorted_unused_prompts(final SubLObject prompter)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject unused_prompts = set.set_element_list( rkf_salient_descriptor_datastructures.rkf_sd_prompter_unused_prompts( prompter ) );
    SubLObject ans = NIL;
    final SubLObject _prev_bind_0 = $rkf_prompter_sort_prompter$.currentBinding( thread );
    try
    {
      $rkf_prompter_sort_prompter$.bind( prompter, thread );
      ans = Sort.stable_sort( unused_prompts, $sym32$RKF_SD_BETTER_PROMPT_, UNPROVIDED );
    }
    finally
    {
      $rkf_prompter_sort_prompter$.rebind( _prev_bind_0, thread );
    }
    return ans;
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-salient-descriptor-prompter.lisp", position = 15977L)
  public static SubLObject rkf_sd_better_promptP(final SubLObject prompt1, final SubLObject prompt2)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    return rkf_sd_prompter_prefer_promptP( $rkf_prompter_sort_prompter$.getDynamicValue( thread ), prompt1, prompt2, NIL );
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-salient-descriptor-prompter.lisp", position = 16136L)
  public static SubLObject rkf_sd_prompter_knownP(final SubLObject prompter, final SubLObject sentence, final SubLObject mt, final SubLObject exclude_indeterminatesP)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject ans = NIL;
    final SubLObject _prev_bind_0 = rkf_salient_descriptor.$rkf_sd_problem_store$.currentBinding( thread );
    try
    {
      rkf_salient_descriptor.$rkf_sd_problem_store$.bind( rkf_sd_prompter_find_or_set_problem_store( prompter ), thread );
      final SubLObject reuse_existingP = rkf_salient_descriptor.rkf_sd_problem_store_okP( rkf_salient_descriptor.$rkf_sd_problem_store$.getDynamicValue( thread ) );
      final SubLObject _prev_bind_0_$6 = rkf_salient_descriptor.$rkf_sd_problem_store$.currentBinding( thread );
      try
      {
        rkf_salient_descriptor.$rkf_sd_problem_store$.bind( rkf_salient_descriptor.rkf_sd_find_or_make_problem_store(), thread );
        final SubLObject store = rkf_salient_descriptor.$rkf_sd_problem_store$.getDynamicValue( thread );
        try
        {
          ans = rkf_salient_descriptor.rkf_sd_known( sentence, mt, exclude_indeterminatesP );
        }
        finally
        {
          final SubLObject _prev_bind_0_$7 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
          try
          {
            Threads.$is_thread_performing_cleanupP$.bind( T, thread );
            final SubLObject _values = Values.getValuesAsVector();
            if( NIL == reuse_existingP )
            {
              rkf_salient_descriptor.rkf_sd_free_problem_store( store );
            }
            Values.restoreValuesFromVector( _values );
          }
          finally
          {
            Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$7, thread );
          }
        }
      }
      finally
      {
        rkf_salient_descriptor.$rkf_sd_problem_store$.rebind( _prev_bind_0_$6, thread );
      }
    }
    finally
    {
      rkf_salient_descriptor.$rkf_sd_problem_store$.rebind( _prev_bind_0, thread );
    }
    return ans;
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-salient-descriptor-prompter.lisp", position = 16376L)
  public static SubLObject rkf_salient_descriptor_prompter_find_prompt_by_id(final SubLObject prompter, final SubLObject id)
  {
    assert NIL != rkf_salient_descriptor_datastructures.rkf_salient_descriptor_prompter_p( prompter ) : prompter;
    assert NIL != Types.integerp( id ) : id;
    SubLObject ans = NIL;
    final SubLObject set_var = rkf_salient_descriptor_datastructures.rkf_sd_prompter_unused_prompts( prompter );
    final SubLObject set_contents_var = set.do_set_internal( set_var );
    SubLObject basis_object;
    SubLObject state;
    SubLObject prompt;
    for( basis_object = set_contents.do_set_contents_basis_object( set_contents_var ), state = NIL, state = set_contents.do_set_contents_initial_state( basis_object, set_contents_var ); NIL == ans && NIL == set_contents
        .do_set_contents_doneP( basis_object, state ); state = set_contents.do_set_contents_update_state( state ) )
    {
      prompt = set_contents.do_set_contents_next( basis_object, state );
      if( NIL != set_contents.do_set_contents_element_validP( state, prompt ) && id.eql( rkf_salient_descriptor_datastructures.rkf_sd_prompt_id( prompt ) ) )
      {
        ans = prompt;
      }
    }
    return ans;
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-salient-descriptor-prompter.lisp", position = 16795L)
  public static SubLObject rkf_sd_prompt_maybe_compute_subprompts(final SubLObject prompt)
  {
    final SubLObject cached_subprompts = rkf_salient_descriptor_datastructures.rkf_sd_prompt_subprompts( prompt );
    if( NIL == cached_subprompts )
    {
      rkf_sd_prompt_compute_subprompts( prompt );
    }
    return prompt;
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-salient-descriptor-prompter.lisp", position = 17023L)
  public static SubLObject rkf_sd_prompt_compute_subprompts(final SubLObject prompt)
  {
    final SubLObject prompter = rkf_salient_descriptor_datastructures.rkf_sd_prompt_prompter( prompt );
    if( NIL == el_utilities.el_formula_p( rkf_salient_descriptor_datastructures.rkf_sd_prompt_salient_property_sentence( prompt ) ) && NIL != rkf_salient_descriptor_datastructures.rkf_sd_prompt_justification( prompt ) )
    {
      final SubLObject seed_term = rkf_salient_descriptor_datastructures.rkf_sd_prompter_seed_term( prompter );
      rkf_salient_descriptor_datastructures.rkf_sd_prompt_set_salient_property_sentence( prompt, rkf_salient_descriptor.rkf_salient_property_sentence_from_justification( seed_term, rkf_salient_descriptor_datastructures
          .rkf_sd_prompt_justification( prompt ) ) );
    }
    final SubLObject sentence = rkf_salient_descriptor_datastructures.rkf_sd_prompt_formula( prompt );
    final SubLObject seed_term2 = rkf_salient_descriptor_datastructures.rkf_sd_prompter_seed_term( prompter );
    final SubLObject seed_term_type = rkf_sd_prompter_compute_seed_term_type( seed_term2 );
    final SubLObject mt = rkf_salient_descriptor_datastructures.rkf_sd_prompter_mt( prompter );
    final SubLObject confirmedP = ( $kw34$EXAMPLE_INSTANCE == seed_term_type || NIL == el_utilities.el_existential_p( sentence ) ) ? NIL : rkf_sd_prompter_knownP( prompter, sentence, mt, NIL );
    final SubLObject salient_property_sentence = rkf_salient_descriptor_datastructures.rkf_sd_prompt_salient_property_sentence( prompt );
    SubLObject subprompts = rkf_salient_descriptor.rkf_salient_descriptor_get_subprompts( sentence, seed_term2, mt, confirmedP, salient_property_sentence );
    if( NIL != confirmedP && NIL != collection_defns.el_sentence_askableP( sentence ) )
    {
      rkf_salient_descriptor_datastructures.rkf_sd_prompt_set_formula( prompt, rkf_salient_descriptor.rkf_sd_existentially_unbind( sentence ) );
    }
    if( NIL != rkf_sd_prompt_bad_subpromptsP( prompt, subprompts ) )
    {
      subprompts = $kw31$BAD;
    }
    rkf_salient_descriptor_datastructures.rkf_sd_prompt_set_subprompts( prompt, subprompts );
    return prompt;
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-salient-descriptor-prompter.lisp", position = 18564L)
  public static SubLObject rkf_sd_prompt_missing_examplesP(final SubLObject prompt)
  {
    final SubLObject subprompts = rkf_salient_descriptor_datastructures.rkf_sd_prompt_subprompts( prompt );
    SubLObject badP = NIL;
    if( NIL != rkf_salient_descriptor.rkf_salient_descriptor_subprompts_p( subprompts ) && NIL == badP )
    {
      SubLObject csome_list_var = subprompts;
      SubLObject subprompt = NIL;
      subprompt = csome_list_var.first();
      while ( NIL == badP && NIL != csome_list_var)
      {
        final SubLObject pcase_var = rkf_salient_descriptor.rkf_salient_descriptor_subprompt_type( subprompt );
        if( pcase_var.eql( $kw35$SPECIFY ) )
        {
          badP = Types.sublisp_null( rkf_salient_descriptor.rkf_salient_descriptor_subprompt_examples( subprompt ) );
        }
        csome_list_var = csome_list_var.rest();
        subprompt = csome_list_var.first();
      }
    }
    return badP;
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-salient-descriptor-prompter.lisp", position = 18963L)
  public static SubLObject rkf_salient_descriptor_followup_prompt_via_prompter(final SubLObject prompter, final SubLObject old_prompt, final SubLObject confirmed_sentence)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject result = NIL;
    final SubLObject local_state;
    final SubLObject state = local_state = rkf_salient_descriptor_datastructures.rkf_salient_descriptor_prompter_lookup( prompter, $kw20$MEMOIZATION_STATE, memoization_state.current_memoization_state() );
    final SubLObject _prev_bind_0 = memoization_state.$memoization_state$.currentBinding( thread );
    try
    {
      memoization_state.$memoization_state$.bind( local_state, thread );
      final SubLObject original_memoization_process = memoization_state.memoization_state_original_process( local_state );
      try
      {
        result = rkf_salient_descriptor_followup_prompt( old_prompt, prompter, confirmed_sentence );
      }
      finally
      {
        final SubLObject _prev_bind_0_$8 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          memoization_state.memoization_state_possibly_clear_original_process( local_state, original_memoization_process );
          Values.restoreValuesFromVector( _values );
        }
        finally
        {
          Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$8, thread );
        }
      }
    }
    finally
    {
      memoization_state.$memoization_state$.rebind( _prev_bind_0, thread );
    }
    return result;
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-salient-descriptor-prompter.lisp", position = 19353L)
  public static SubLObject rkf_salient_descriptor_followup_prompt(final SubLObject old_prompt, final SubLObject prompter, final SubLObject assert_sentence)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject v_term = rkf_salient_descriptor_datastructures.rkf_sd_prompter_seed_term( prompter );
    final SubLObject mt = rkf_salient_descriptor_datastructures.rkf_sd_prompter_mt( prompter );
    final SubLObject salient_property_sentence = rkf_salient_descriptor_datastructures.rkf_sd_prompt_salient_property_sentence( old_prompt );
    final SubLObject tactic = rkf_salient_descriptor_datastructures.rkf_sd_prompt_tactic( old_prompt );
    final SubLObject deducible_cnfs = rkf_salient_descriptor_datastructures.rkf_sd_prompt_deducible_cnfs( old_prompt );
    final SubLObject justification = rkf_salient_descriptor_datastructures.rkf_sd_prompt_justification( old_prompt );
    SubLObject new_prompt = NIL;
    if( NIL != el_utilities.el_negation_p( assert_sentence ) && NIL != positive_gaf_cnfs_p( deducible_cnfs ) )
    {
      final SubLObject consequent = clauses.pos_lits( deducible_cnfs.first() ).first();
      new_prompt = rkf_salient_descriptor_datastructures.new_rkf_sd_prompt();
      rkf_salient_descriptor_datastructures.rkf_sd_prompt_set_formula( new_prompt, el_utilities.make_negation( consequent ) );
    }
    if( NIL == rkf_salient_descriptor_datastructures.rkf_salient_descriptor_prompt_p( new_prompt ) )
    {
      final SubLObject _prev_bind_0 = rkf_salient_descriptor.$rkf_sd_problem_store$.currentBinding( thread );
      try
      {
        rkf_salient_descriptor.$rkf_sd_problem_store$.bind( rkf_sd_prompter_find_or_set_problem_store( prompter ), thread );
        final SubLObject reuse_existingP = rkf_salient_descriptor.rkf_sd_problem_store_okP( rkf_salient_descriptor.$rkf_sd_problem_store$.getDynamicValue( thread ) );
        final SubLObject _prev_bind_0_$9 = rkf_salient_descriptor.$rkf_sd_problem_store$.currentBinding( thread );
        try
        {
          rkf_salient_descriptor.$rkf_sd_problem_store$.bind( rkf_salient_descriptor.rkf_sd_find_or_make_problem_store(), thread );
          final SubLObject store = rkf_salient_descriptor.$rkf_sd_problem_store$.getDynamicValue( thread );
          try
          {
            final SubLObject subprompts = rkf_salient_descriptor.rkf_salient_descriptor_get_subprompts( assert_sentence, v_term, mt, T, salient_property_sentence );
            if( NIL != rkf_salient_descriptor.rkf_salient_descriptor_subprompts_p( subprompts ) )
            {
              new_prompt = rkf_salient_descriptor_datastructures.new_rkf_sd_prompt();
              rkf_salient_descriptor_datastructures.rkf_sd_prompt_set_subprompts( new_prompt, subprompts );
            }
          }
          finally
          {
            final SubLObject _prev_bind_0_$10 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
            try
            {
              Threads.$is_thread_performing_cleanupP$.bind( T, thread );
              final SubLObject _values = Values.getValuesAsVector();
              if( NIL == reuse_existingP )
              {
                rkf_salient_descriptor.rkf_sd_free_problem_store( store );
              }
              Values.restoreValuesFromVector( _values );
            }
            finally
            {
              Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$10, thread );
            }
          }
        }
        finally
        {
          rkf_salient_descriptor.$rkf_sd_problem_store$.rebind( _prev_bind_0_$9, thread );
        }
      }
      finally
      {
        rkf_salient_descriptor.$rkf_sd_problem_store$.rebind( _prev_bind_0, thread );
      }
    }
    if( NIL != rkf_salient_descriptor_datastructures.rkf_salient_descriptor_prompt_p( new_prompt ) )
    {
      rkf_salient_descriptor_datastructures.rkf_sd_prompt_set_justification( new_prompt, justification );
      rkf_salient_descriptor_datastructures.rkf_sd_prompt_set_tactic( new_prompt, tactic );
      rkf_sd_prompter_add_prompt( prompter, new_prompt );
      rkf_sd_prompter_mark_prompt_used( prompter, new_prompt );
    }
    return new_prompt;
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-salient-descriptor-prompter.lisp", position = 20850L)
  public static SubLObject positive_gaf_cnfs_p(final SubLObject cnfs)
  {
    SubLObject ans = NIL;
    if( NIL != list_utilities.singletonP( cnfs ) )
    {
      final SubLObject cnf = cnfs.first();
      SubLObject current;
      final SubLObject datum = current = cnf;
      SubLObject neg_lits = NIL;
      SubLObject pos_lits = NIL;
      cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list36 );
      neg_lits = current.first();
      current = current.rest();
      cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list36 );
      pos_lits = current.first();
      current = current.rest();
      if( NIL == current )
      {
        if( NIL == neg_lits && NIL != list_utilities.singletonP( pos_lits ) && NIL != el_utilities.groundP( pos_lits.first(), $sym37$EL_VAR_ ) )
        {
          ans = T;
        }
      }
      else
      {
        cdestructuring_bind.cdestructuring_bind_error( datum, $list36 );
      }
    }
    return ans;
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-salient-descriptor-prompter.lisp", position = 21169L)
  public static SubLObject rkf_sd_prompter_add_prompt(final SubLObject prompter, final SubLObject new_prompt)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject id = integer_sequence_generator.integer_sequence_generator_next( rkf_salient_descriptor_datastructures.rkf_sd_prompter_isg( prompter ) );
    rkf_salient_descriptor_datastructures.rkf_sd_prompt_set_id( new_prompt, id );
    rkf_salient_descriptor_datastructures.rkf_sd_prompt_set_prompter( new_prompt, prompter );
    final SubLObject _prev_bind_0 = rkf_salient_descriptor.$rkf_sd_problem_store$.currentBinding( thread );
    try
    {
      rkf_salient_descriptor.$rkf_sd_problem_store$.bind( rkf_sd_prompter_find_or_set_problem_store( prompter ), thread );
      final SubLObject reuse_existingP = rkf_salient_descriptor.rkf_sd_problem_store_okP( rkf_salient_descriptor.$rkf_sd_problem_store$.getDynamicValue( thread ) );
      final SubLObject _prev_bind_0_$11 = rkf_salient_descriptor.$rkf_sd_problem_store$.currentBinding( thread );
      try
      {
        rkf_salient_descriptor.$rkf_sd_problem_store$.bind( rkf_salient_descriptor.rkf_sd_find_or_make_problem_store(), thread );
        final SubLObject store = rkf_salient_descriptor.$rkf_sd_problem_store$.getDynamicValue( thread );
        try
        {
          rkf_sd_prompt_maybe_compute_subprompts( new_prompt );
        }
        finally
        {
          final SubLObject _prev_bind_0_$12 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
          try
          {
            Threads.$is_thread_performing_cleanupP$.bind( T, thread );
            final SubLObject _values = Values.getValuesAsVector();
            if( NIL == reuse_existingP )
            {
              rkf_salient_descriptor.rkf_sd_free_problem_store( store );
            }
            Values.restoreValuesFromVector( _values );
          }
          finally
          {
            Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$12, thread );
          }
        }
      }
      finally
      {
        rkf_salient_descriptor.$rkf_sd_problem_store$.rebind( _prev_bind_0_$11, thread );
      }
    }
    finally
    {
      rkf_salient_descriptor.$rkf_sd_problem_store$.rebind( _prev_bind_0, thread );
    }
    SubLObject foundP = NIL;
    SubLObject set_var = rkf_salient_descriptor_datastructures.rkf_sd_prompter_unused_prompts( prompter );
    SubLObject set_contents_var = set.do_set_internal( set_var );
    SubLObject basis_object;
    SubLObject state;
    SubLObject prompt;
    for( basis_object = set_contents.do_set_contents_basis_object( set_contents_var ), state = NIL, state = set_contents.do_set_contents_initial_state( basis_object, set_contents_var ); NIL == foundP
        && NIL == set_contents.do_set_contents_doneP( basis_object, state ); state = set_contents.do_set_contents_update_state( state ) )
    {
      prompt = set_contents.do_set_contents_next( basis_object, state );
      if( NIL != set_contents.do_set_contents_element_validP( state, prompt ) )
      {
        foundP = rkf_sd_prompt_E( prompt, new_prompt );
      }
    }
    set_var = rkf_salient_descriptor_datastructures.rkf_sd_prompter_used_prompts( prompter );
    set_contents_var = set.do_set_internal( set_var );
    for( basis_object = set_contents.do_set_contents_basis_object( set_contents_var ), state = NIL, state = set_contents.do_set_contents_initial_state( basis_object, set_contents_var ); NIL == foundP
        && NIL == set_contents.do_set_contents_doneP( basis_object, state ); state = set_contents.do_set_contents_update_state( state ) )
    {
      prompt = set_contents.do_set_contents_next( basis_object, state );
      if( NIL != set_contents.do_set_contents_element_validP( state, prompt ) )
      {
        foundP = rkf_sd_prompt_E( prompt, new_prompt );
      }
    }
    if( NIL == foundP )
    {
      rkf_sd_prompter_add_to_unused_prompts( prompter, new_prompt );
    }
    return prompter;
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-salient-descriptor-prompter.lisp", position = 21917L)
  public static SubLObject rkf_sd_prompter_add_to_unused_prompts(final SubLObject prompter, final SubLObject new_prompt)
  {
    if( !rkf_salient_descriptor_datastructures.rkf_sd_prompt_prompter( new_prompt ).eql( prompter ) )
    {
      rkf_salient_descriptor_datastructures.rkf_sd_prompt_set_prompter( new_prompt, prompter );
    }
    final SubLObject addedP = set.set_add( new_prompt, rkf_salient_descriptor_datastructures.rkf_sd_prompter_unused_prompts( prompter ) );
    return ( NIL != addedP ) ? $kw38$ADDED : $kw39$ALREADY_PRESENT;
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-salient-descriptor-prompter.lisp", position = 22244L)
  public static SubLObject rkf_sd_prompt_E(final SubLObject prompt1, final SubLObject prompt2)
  {
    return makeBoolean( NIL != rkf_sd_prompt_formula_E( rkf_salient_descriptor_datastructures.rkf_sd_prompt_formula( prompt1 ), rkf_salient_descriptor_datastructures.rkf_sd_prompt_formula( prompt2 ) )
        || ( NIL != rkf_salient_descriptor_datastructures.rkf_sd_prompt_subprompts( prompt1 ) && rkf_salient_descriptor_datastructures.rkf_sd_prompt_subprompts( prompt1 ).equal( rkf_salient_descriptor_datastructures
            .rkf_sd_prompt_subprompts( prompt2 ) ) ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-salient-descriptor-prompter.lisp", position = 22542L)
  public static SubLObject rkf_sd_prompt_formula_E(final SubLObject formula1, final SubLObject formula2)
  {
    final SubLObject equalP = makeBoolean( NIL != el_utilities.same_formula_arity_p( formula1, formula2, UNPROVIDED ) && NIL != czer_utilities.equals_elP( formula1, formula2, UNPROVIDED, UNPROVIDED, UNPROVIDED ) );
    return equalP;
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-salient-descriptor-prompter.lisp", position = 22805L)
  public static SubLObject rkf_sd_prompter_find_prompt_by_id_string(final SubLObject prompter, final SubLObject id_string)
  {
    assert NIL != Types.stringp( id_string ) : id_string;
    return rkf_sd_prompter_find_prompt_by_id( prompter, reader.parse_integer( id_string, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-salient-descriptor-prompter.lisp", position = 22999L)
  public static SubLObject rkf_sd_prompter_find_prompt_by_id(final SubLObject prompter, final SubLObject prompt_id)
  {
    SubLObject set_var = rkf_salient_descriptor_datastructures.rkf_sd_prompter_used_prompts( prompter );
    SubLObject set_contents_var = set.do_set_internal( set_var );
    SubLObject basis_object;
    SubLObject state;
    SubLObject prompt;
    for( basis_object = set_contents.do_set_contents_basis_object( set_contents_var ), state = NIL, state = set_contents.do_set_contents_initial_state( basis_object, set_contents_var ); NIL == set_contents
        .do_set_contents_doneP( basis_object, state ); state = set_contents.do_set_contents_update_state( state ) )
    {
      prompt = set_contents.do_set_contents_next( basis_object, state );
      if( NIL != set_contents.do_set_contents_element_validP( state, prompt ) && NIL != rkf_salient_descriptor_datastructures.rkf_salient_descriptor_prompt_p( prompt ) && rkf_salient_descriptor_datastructures
          .rkf_sd_prompt_id( prompt ).eql( prompt_id ) )
      {
        return prompt;
      }
    }
    set_var = rkf_salient_descriptor_datastructures.rkf_sd_prompter_unused_prompts( prompter );
    set_contents_var = set.do_set_internal( set_var );
    for( basis_object = set_contents.do_set_contents_basis_object( set_contents_var ), state = NIL, state = set_contents.do_set_contents_initial_state( basis_object, set_contents_var ); NIL == set_contents
        .do_set_contents_doneP( basis_object, state ); state = set_contents.do_set_contents_update_state( state ) )
    {
      prompt = set_contents.do_set_contents_next( basis_object, state );
      if( NIL != set_contents.do_set_contents_element_validP( state, prompt ) && rkf_salient_descriptor_datastructures.rkf_sd_prompt_id( prompt ).eql( prompt_id ) )
      {
        return prompt;
      }
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-salient-descriptor-prompter.lisp", position = 23419L)
  public static SubLObject rkf_sd_prompter_prefer_promptP(final SubLObject prompter, final SubLObject contender, final SubLObject champ, final SubLObject v_default)
  {
    if( champ.eql( v_default ) )
    {
      return T;
    }
    if( contender.eql( v_default ) )
    {
      return NIL;
    }
    if( NIL == rkf_salient_descriptor_datastructures.rkf_salient_descriptor_prompt_p( champ ) )
    {
      return T;
    }
    if( NIL == rkf_salient_descriptor_datastructures.rkf_salient_descriptor_prompt_p( contender ) )
    {
      return NIL;
    }
    if( $kw31$BAD == rkf_salient_descriptor_datastructures.rkf_sd_prompt_subprompts( champ ) )
    {
      return T;
    }
    if( $kw31$BAD == rkf_salient_descriptor_datastructures.rkf_sd_prompt_subprompts( contender ) )
    {
      return NIL;
    }
    if( NIL != rkf_sd_prompt_localityG( prompter, contender, champ ) )
    {
      return T;
    }
    if( NIL != rkf_sd_prompt_localityG( prompter, champ, contender ) )
    {
      return NIL;
    }
    if( NIL != rkf_sd_prompt_generalityL( contender, champ ) )
    {
      return T;
    }
    if( NIL != rkf_sd_prompt_generalityL( champ, contender ) )
    {
      return NIL;
    }
    if( NIL != rkf_sd_prompt_fewer_lits_p( contender, champ ) )
    {
      return T;
    }
    if( NIL != rkf_sd_prompt_fewer_lits_p( champ, contender ) )
    {
      return NIL;
    }
    if( NIL == rkf_sd_prompt_missing_examplesP( contender ) && NIL != rkf_sd_prompt_missing_examplesP( champ ) )
    {
      return T;
    }
    if( NIL == rkf_sd_prompt_missing_examplesP( champ ) && NIL != rkf_sd_prompt_missing_examplesP( contender ) )
    {
      return NIL;
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-salient-descriptor-prompter.lisp", position = 24817L)
  public static SubLObject rkf_sd_prompt_localityG(final SubLObject prompter, final SubLObject prompt1, final SubLObject prompt2)
  {
    final SubLObject local_mt = rkf_salient_descriptor_datastructures.rkf_sd_prompter_mt( prompter );
    final SubLObject local_supports1 = rkf_sd_prompt_local_supports( local_mt, prompt1 );
    final SubLObject local_supports2 = rkf_sd_prompt_local_supports( local_mt, prompt2 );
    return makeBoolean( NIL != hlmt.hlmt_p( local_mt ) && ( ( NIL != local_supports1 && NIL == local_supports2 ) || NIL != rkf_sd_more_recent_supportsP( local_supports1, local_supports2 ) ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-salient-descriptor-prompter.lisp", position = 25238L)
  public static SubLObject rkf_sd_prompt_local_supports(final SubLObject local_mt, final SubLObject prompt)
  {
    final SubLObject justification = rkf_salient_descriptor_datastructures.rkf_sd_prompt_justification( prompt );
    final SubLObject supports = ( NIL != arguments.supports_p( justification ) ) ? justification : NIL;
    return list_utilities.find_all( local_mt, supports, Symbols.symbol_function( EQ ), $sym41$SUPPORT_MT );
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-salient-descriptor-prompter.lisp", position = 25485L)
  public static SubLObject rkf_sd_more_recent_supportsP(final SubLObject supports1, final SubLObject supports2)
  {
    final SubLObject times1 = list_utilities.remove_if_not( $sym42$UNIVERSAL_DATE_P, Mapping.mapcar( $sym43$ASSERTED_WHEN, list_utilities.remove_if_not( $sym44$ASSERTION_P, supports1, UNPROVIDED, UNPROVIDED, UNPROVIDED,
        UNPROVIDED ) ), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
    final SubLObject times2 = list_utilities.remove_if_not( $sym42$UNIVERSAL_DATE_P, Mapping.mapcar( $sym43$ASSERTED_WHEN, list_utilities.remove_if_not( $sym44$ASSERTION_P, supports2, UNPROVIDED, UNPROVIDED, UNPROVIDED,
        UNPROVIDED ) ), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
    return makeBoolean( NIL != times1 && NIL != times2 && number_utilities.maximum( times1, UNPROVIDED ).numG( number_utilities.maximum( times2, UNPROVIDED ) ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-salient-descriptor-prompter.lisp", position = 25874L)
  public static SubLObject rkf_sd_prompt_generalityL(final SubLObject prompt1, final SubLObject prompt2)
  {
    final SubLObject sentence1 = rkf_salient_descriptor_datastructures.rkf_sd_prompt_salient_property_sentence( prompt1 );
    final SubLObject sentence2 = rkf_salient_descriptor_datastructures.rkf_sd_prompt_salient_property_sentence( prompt2 );
    return makeBoolean( NIL != el_utilities.el_formula_p( sentence1 ) && NIL != el_utilities.el_formula_p( sentence2 ) && NIL != rkf_sd_sentence_generalityL( sentence1, sentence2 ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-salient-descriptor-prompter.lisp", position = 26206L)
  public static SubLObject rkf_sd_sentence_generalityL(final SubLObject sentence1, final SubLObject sentence2)
  {
    SubLObject terms1 = NIL;
    SubLObject terms2 = NIL;
    SubLObject cdolist_list_var;
    SubLObject terms3 = cdolist_list_var = cycl_utilities.formula_terms( sentence1, $kw45$IGNORE );
    SubLObject term1 = NIL;
    term1 = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      if( NIL == cycl_utilities.expression_find( term1, sentence2, UNPROVIDED, UNPROVIDED, UNPROVIDED ) )
      {
        final SubLObject item_var = term1;
        if( NIL == conses_high.member( item_var, terms1, Symbols.symbol_function( EQL ), Symbols.symbol_function( IDENTITY ) ) )
        {
          terms1 = ConsesLow.cons( item_var, terms1 );
        }
      }
      cdolist_list_var = cdolist_list_var.rest();
      term1 = cdolist_list_var.first();
    }
    terms3 = ( cdolist_list_var = cycl_utilities.formula_terms( sentence2, $kw45$IGNORE ) );
    SubLObject term2 = NIL;
    term2 = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      if( NIL == cycl_utilities.expression_find( term2, sentence1, UNPROVIDED, UNPROVIDED, UNPROVIDED ) )
      {
        final SubLObject item_var = term2;
        if( NIL == conses_high.member( item_var, terms2, Symbols.symbol_function( EQL ), Symbols.symbol_function( IDENTITY ) ) )
        {
          terms2 = ConsesLow.cons( item_var, terms2 );
        }
      }
      cdolist_list_var = cdolist_list_var.rest();
      term2 = cdolist_list_var.first();
    }
    return Numbers.numL( rkf_sd_terms_generality( terms1 ), rkf_sd_terms_generality( terms2 ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-salient-descriptor-prompter.lisp", position = 26740L)
  public static SubLObject rkf_sd_sentence_generality(final SubLObject sentence)
  {
    return Functions.apply( Symbols.symbol_function( $sym46$_ ), Mapping.mapcar( $sym47$RKF_SD_TERM_GENERALITY, cycl_utilities.formula_args( sentence, UNPROVIDED ) ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-salient-descriptor-prompter.lisp", position = 26873L)
  public static SubLObject rkf_sd_terms_generality(final SubLObject terms)
  {
    return Functions.apply( Symbols.symbol_function( $sym46$_ ), Mapping.mapcar( $sym47$RKF_SD_TERM_GENERALITY, terms ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-salient-descriptor-prompter.lisp", position = 26982L)
  public static SubLObject rkf_sd_term_generality(final SubLObject v_term)
  {
    return cardinality_estimates.generality_estimate( v_term );
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-salient-descriptor-prompter.lisp", position = 27065L)
  public static SubLObject rkf_sd_prompt_fewer_lits_p(final SubLObject prompt1, final SubLObject prompt2)
  {
    final SubLObject count1 = rkf_sd_prompt_min_lit_count( prompt1 );
    final SubLObject count2 = rkf_sd_prompt_min_lit_count( prompt2 );
    return makeBoolean( count1.isInteger() && ( !count2.isInteger() || count1.numL( count2 ) ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-salient-descriptor-prompter.lisp", position = 27325L)
  public static SubLObject rkf_sd_prompt_min_lit_count(final SubLObject prompt)
  {
    SubLObject min = $kw2$NONE;
    SubLObject cdolist_list_var = rkf_salient_descriptor_datastructures.rkf_sd_prompt_deducible_cnfs( prompt );
    SubLObject cnf = NIL;
    cnf = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      final SubLObject count = rkf_sd_cnf_lit_count( cnf );
      if( count.isInteger() && ( min == $kw2$NONE || count.numL( min ) ) )
      {
        min = count;
      }
      cdolist_list_var = cdolist_list_var.rest();
      cnf = cdolist_list_var.first();
    }
    return min;
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-salient-descriptor-prompter.lisp", position = 27627L)
  public static SubLObject rkf_sd_cnf_lit_count(final SubLObject cnf)
  {
    return Numbers.add( Sequences.length( clauses.pos_lits( cnf ) ), Sequences.length( clauses.neg_lits( cnf ) ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-salient-descriptor-prompter.lisp", position = 28555L)
  public static SubLObject with_rkf_salient_descriptor_seed_term_tactics_table(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list49 );
    final SubLObject temp = current.rest();
    current = current.first();
    SubLObject table = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list49 );
    table = current.first();
    current = current.rest();
    if( NIL == current )
    {
      final SubLObject body;
      current = ( body = temp );
      return ConsesLow.list( $sym50$PROGN, ConsesLow.listS( $sym51$CHECK_TYPE, table, $list52 ), ConsesLow.listS( $sym5$CLET, ConsesLow.list( ConsesLow.list( $sym53$_RKF_SD_SEED_TERM_TACTICS_TABLE_, table ) ), ConsesLow
          .append( body, NIL ) ) );
    }
    cdestructuring_bind.cdestructuring_bind_error( datum, $list49 );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-salient-descriptor-prompter.lisp", position = 28818L)
  public static SubLObject rkf_sd_prompter_tactics_for_seed_term_type(final SubLObject seed_term_type)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    return list_utilities.alist_lookup( $rkf_sd_seed_term_tactics_table$.getDynamicValue( thread ), seed_term_type, UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-salient-descriptor-prompter.lisp", position = 28969L)
  public static SubLObject rkf_sd_prompter_compute_seed_term_type(final SubLObject seed_term)
  {
    if( NIL != isa.isaP( seed_term, $const54$Microtheory, UNPROVIDED, UNPROVIDED ) )
    {
      return $kw55$MT;
    }
    if( NIL != forts.fort_p( seed_term ) )
    {
      return $kw56$FORT;
    }
    if( NIL != rkf_domain_examples.rkf_generic_example_p( seed_term ) )
    {
      return $kw34$EXAMPLE_INSTANCE;
    }
    if( NIL == assertion_handles.assertion_p( seed_term ) )
    {
      return $kw57$UNKNOWN;
    }
    if( NIL != assertions_high.gaf_assertionP( seed_term ) )
    {
      return $kw58$GAF;
    }
    return $kw59$RULE;
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-salient-descriptor-prompter.lisp", position = 29328L)
  public static SubLObject formula_template_fort_for_rkf_salient_descriptor_prompt(final SubLObject prompt, final SubLObject topic_id)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    assert NIL != rkf_salient_descriptor_datastructures.rkf_salient_descriptor_prompt_p( prompt ) : prompt;
    assert NIL != forts.fort_p( topic_id ) : topic_id;
    final SubLObject raw_formula = rkf_salient_descriptor_datastructures.rkf_salient_descriptor_prompt_formula( prompt );
    final SubLObject formula = rkf_salient_descriptor.rkf_sd_existentially_unbind( raw_formula );
    final SubLObject prompter = rkf_salient_descriptor_datastructures.rkf_salient_descriptor_prompt_prompter( prompt );
    final SubLObject focal_term = rkf_salient_descriptor_prompter_seed_term( prompter );
    final SubLObject el_focal_term = cycl_utilities.hl_to_el( focal_term );
    SubLObject example_sentences = NIL;
    SubLObject data_assert_mt = NIL;
    SubLObject single_entryP = NIL;
    final SubLObject _prev_bind_0 = rkf_salient_descriptor.$rkf_sd_problem_store$.currentBinding( thread );
    try
    {
      rkf_salient_descriptor.$rkf_sd_problem_store$.bind( rkf_sd_prompter_find_or_set_problem_store( prompter ), thread );
      final SubLObject reuse_existingP = rkf_salient_descriptor.rkf_sd_problem_store_okP( rkf_salient_descriptor.$rkf_sd_problem_store$.getDynamicValue( thread ) );
      final SubLObject _prev_bind_0_$13 = rkf_salient_descriptor.$rkf_sd_problem_store$.currentBinding( thread );
      try
      {
        rkf_salient_descriptor.$rkf_sd_problem_store$.bind( rkf_salient_descriptor.rkf_sd_find_or_make_problem_store(), thread );
        final SubLObject store = rkf_salient_descriptor.$rkf_sd_problem_store$.getDynamicValue( thread );
        try
        {
          final SubLObject prompter_mt = rkf_salient_descriptor_prompter_mt( prompter );
          example_sentences = rkf_sd_prompt_get_precedent_example_sentences( prompt, focal_term );
          data_assert_mt = rkf_sd_fet_data_assert_mt( formula, prompter_mt );
          single_entryP = rkf_sd_single_entry_promptP( prompt, prompter_mt );
        }
        finally
        {
          final SubLObject _prev_bind_0_$14 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
          try
          {
            Threads.$is_thread_performing_cleanupP$.bind( T, thread );
            final SubLObject _values = Values.getValuesAsVector();
            if( NIL == reuse_existingP )
            {
              rkf_salient_descriptor.rkf_sd_free_problem_store( store );
            }
            Values.restoreValuesFromVector( _values );
          }
          finally
          {
            Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$14, thread );
          }
        }
      }
      finally
      {
        rkf_salient_descriptor.$rkf_sd_problem_store$.rebind( _prev_bind_0_$13, thread );
      }
    }
    finally
    {
      rkf_salient_descriptor.$rkf_sd_problem_store$.rebind( _prev_bind_0, thread );
    }
    return find_or_create_formula_template_fort( topic_id, el_focal_term, formula, example_sentences, data_assert_mt, single_entryP );
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-salient-descriptor-prompter.lisp", position = 30390L)
  public static SubLObject find_or_create_formula_template_fort(final SubLObject topic_id, final SubLObject el_focal_term, final SubLObject formula, final SubLObject example_sentences, final SubLObject data_assert_mt,
      final SubLObject single_entryP)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject focal_term_arg_position = cycl_utilities.arg_positions_bfs( el_focal_term, formula, Symbols.symbol_function( EQUAL ) ).first();
    final SubLObject candidate_replacement_info = rkf_sd_candidate_replacement_info( focal_term_arg_position, formula );
    if( NIL == Errors.$ignore_mustsP$.getDynamicValue( thread ) && NIL == cycl_utilities.arg_position_p( focal_term_arg_position ) )
    {
      Errors.error( $str61$Couldn_t_find__S_in__S_, el_focal_term, formula );
    }
    thread.resetMultipleValues();
    final SubLObject definitional_properties = formula_template_definitional_properties( focal_term_arg_position, topic_id, candidate_replacement_info, formula, example_sentences, single_entryP, data_assert_mt );
    final SubLObject match_properties = thread.secondMultipleValue();
    thread.resetMultipleValues();
    SubLObject template_fort = rkf_sd_fet_find_match( match_properties, UNPROVIDED );
    if( NIL == template_fort )
    {
      template_fort = rkf_sd_new_formula_template_fort( topic_id );
      SubLObject cdolist_list_var = definitional_properties;
      SubLObject property = NIL;
      property = cdolist_list_var.first();
      while ( NIL != cdolist_list_var)
      {
        final SubLObject sentence = properties.property_to_sentence( property, template_fort );
        rkf_sd_fet_assert( sentence );
        cdolist_list_var = cdolist_list_var.rest();
        property = cdolist_list_var.first();
      }
    }
    return template_fort;
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-salient-descriptor-prompter.lisp", position = 31502L)
  public static SubLObject formula_template_definitional_properties(final SubLObject focal_term_arg_position, final SubLObject topic_id, final SubLObject candidate_replacement_info, final SubLObject formula,
      final SubLObject example_sentences, final SubLObject single_entryP, final SubLObject data_assert_mt)
  {
    SubLObject definitional_properties = NIL;
    SubLObject match_properties = NIL;
    final SubLObject template = $kw62$TEMPLATE;
    definitional_properties = ConsesLow.cons( properties.sentence_to_property( ConsesLow.list( $const63$focalTermPositionForFormulaTempla, template, cycl_utilities.make_cycl_arg_position( focal_term_arg_position ),
        topic_id ), template ), definitional_properties );
    definitional_properties = ( match_properties = ConsesLow.cons( properties.sentence_to_property( ConsesLow.list( $const64$formulaForFormulaTemplate, template, formula ), template ), definitional_properties ) );
    SubLObject cdolist_list_var = example_sentences;
    SubLObject example_sentence = NIL;
    example_sentence = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      definitional_properties = ConsesLow.cons( properties.sentence_to_property( ConsesLow.list( $const65$formulaTemplateExample, template, example_sentence ), template ), definitional_properties );
      cdolist_list_var = cdolist_list_var.rest();
      example_sentence = cdolist_list_var.first();
    }
    SubLObject order = ONE_INTEGER;
    final SubLObject generality_cutoff = $int66$100;
    SubLObject cdolist_list_var2 = candidate_replacement_info;
    SubLObject cons = NIL;
    cons = cdolist_list_var2.first();
    while ( NIL != cdolist_list_var2)
    {
      SubLObject current;
      final SubLObject datum = current = cons;
      SubLObject arg_pos = NIL;
      SubLObject info = NIL;
      cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list67 );
      arg_pos = current.first();
      current = ( info = current.rest() );
      final SubLObject cycl_arg_pos = cycl_utilities.make_cycl_arg_position( arg_pos );
      SubLObject current_$16;
      final SubLObject datum_$15 = current_$16 = info;
      SubLObject gloss = NIL;
      SubLObject collection = NIL;
      SubLObject explanation = NIL;
      cdestructuring_bind.destructuring_bind_must_consp( current_$16, datum_$15, $list68 );
      gloss = current_$16.first();
      current_$16 = current_$16.rest();
      cdestructuring_bind.destructuring_bind_must_consp( current_$16, datum_$15, $list68 );
      collection = current_$16.first();
      current_$16 = current_$16.rest();
      cdestructuring_bind.destructuring_bind_must_consp( current_$16, datum_$15, $list68 );
      explanation = current_$16.first();
      current_$16 = current_$16.rest();
      if( NIL == current_$16 )
      {
        if( cardinality_estimates.generality_estimate( collection ).numG( generality_cutoff ) || ( NIL != el_utilities.el_formula_with_operator_p( collection, $const69$SpecsFn ) && cardinality_estimates
            .generality_estimate( cycl_utilities.nat_arg1( collection, UNPROVIDED ) ).numG( generality_cutoff ) ) )
        {
          definitional_properties = ConsesLow.cons( properties.sentence_to_property( ConsesLow.list( $const70$templateReplacementsInvisibleForP, template, cycl_arg_pos ), template ), definitional_properties );
        }
        else
        {
          definitional_properties = ConsesLow.cons( properties.sentence_to_property( ConsesLow.list( $const71$candidateReplacementForPosition, template, cycl_arg_pos, collection ), template ), definitional_properties );
        }
        definitional_properties = ConsesLow.cons( properties.sentence_to_property( ConsesLow.list( $const72$glossForFormulaTemplate, template, topic_id, cycl_arg_pos, gloss, order ), template ),
            definitional_properties );
        definitional_properties = ConsesLow.cons( properties.sentence_to_property( ConsesLow.list( $const73$formulaTemplateArgExplanation, template, topic_id, cycl_arg_pos, explanation ), template ),
            definitional_properties );
      }
      else
      {
        cdestructuring_bind.cdestructuring_bind_error( datum_$15, $list68 );
      }
      order = Numbers.add( order, ONE_INTEGER );
      cdolist_list_var2 = cdolist_list_var2.rest();
      cons = cdolist_list_var2.first();
    }
    definitional_properties = ConsesLow.cons( properties.sentence_to_property( ConsesLow.list( $const74$assertMtForFormulaTemplate, template, data_assert_mt ), template ), definitional_properties );
    definitional_properties = ConsesLow.cons( properties.sentence_to_property( ConsesLow.list( $const75$assertionFormatForFormulaTemplate, template, ( NIL != single_entryP ) ? $const76$SingleAssertionEntry
        : $const77$MultipleAssertionEntry, topic_id ), template ), definitional_properties );
    return Values.values( definitional_properties, match_properties );
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-salient-descriptor-prompter.lisp", position = 34036L)
  public static SubLObject rkf_sd_fet_data_assert_mt(final SubLObject formula, final SubLObject prompter_mt)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject principled_mt = NIL;
    final SubLObject unprincipled_mt = $const78$DataForNLMt;
    if( NIL != Symbols.fboundp( $sym79$SUGGEST_MT ) )
    {
      principled_mt = Eval.eval( ConsesLow.list( $sym79$SUGGEST_MT, ConsesLow.list( $sym80$QUOTE, formula ) ) );
    }
    else
    {
      final SubLObject mt_var = $sym81$_MT;
      principled_mt = inference_kernel.new_cyc_query( ConsesLow.list( $const82$defaultDefiningMtForSentence, formula, mt_var ), prompter_mt, ConsesLow.list( new SubLObject[] { $kw83$MAX_NUMBER, ONE_INTEGER,
        $kw84$MAX_TRANSFORMATION_DEPTH, ONE_INTEGER, $kw18$PROBLEM_STORE, rkf_salient_descriptor.$rkf_sd_problem_store$.getDynamicValue( thread ), $kw85$MAX_TIME, $int86$30, $kw87$RETURN, ConsesLow.list( $kw62$TEMPLATE,
            mt_var )
      } ) ).first();
    }
    return ( NIL != principled_mt ) ? principled_mt : unprincipled_mt;
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-salient-descriptor-prompter.lisp", position = 34750L)
  public static SubLObject rkf_sd_fet_find_match(final SubLObject definitional_properties, SubLObject mt)
  {
    if( mt == UNPROVIDED )
    {
      mt = $const88$GKEFormulaTemplatesMt;
    }
    SubLObject definitional_lits = NIL;
    final SubLObject template_var = variables.get_variable( ZERO_INTEGER );
    SubLObject badP = NIL;
    SubLObject match = NIL;
    if( NIL == badP )
    {
      SubLObject csome_list_var = definitional_properties;
      SubLObject property = NIL;
      property = csome_list_var.first();
      while ( NIL == badP && NIL != csome_list_var)
      {
        final SubLObject sentence = properties.property_to_sentence( property, template_var );
        if( NIL != cycl_grammar.cycl_atomic_sentence_p( sentence ) )
        {
          definitional_lits = ConsesLow.cons( sentence, definitional_lits );
        }
        else
        {
          badP = T;
        }
        csome_list_var = csome_list_var.rest();
        property = csome_list_var.first();
      }
    }
    if( NIL == badP )
    {
      final SubLObject neg_lits = NIL;
      final SubLObject dnf = clauses.make_clause( neg_lits, definitional_lits );
      final SubLObject answers = inference_kernel.new_cyc_query_from_dnf( dnf, mt, NIL, ConsesLow.listS( $kw87$RETURN, ConsesLow.list( $kw62$TEMPLATE, template_var ), $list89 ) );
      match = answers.first();
    }
    return match;
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-salient-descriptor-prompter.lisp", position = 35521L)
  public static SubLObject rkf_sd_fet_assert(final SubLObject sentence)
  {
    SubLObject result = NIL;
    final SubLObject template_info_mt = $const88$GKEFormulaTemplatesMt;
    result = rkf_assertion_utilities.rkf_assert_now( sentence, template_info_mt );
    return result;
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-salient-descriptor-prompter.lisp", position = 35784L)
  public static SubLObject rkf_sd_new_formula_template_fort(final SubLObject topic_id)
  {
    final SubLObject focal_term_type = formula_template_utilities.focal_term_type_for_topic_type( topic_id, $const90$InferencePSC );
    final SubLObject collection = ( NIL != forts.fort_p( focal_term_type ) ) ? focal_term_type : ( ( NIL != forts.fort_p( topic_id ) ) ? topic_id : $const91$FormulaTemplate );
    final SubLObject name = rkf_term_utilities.rkf_new_constant_name_from_collection( collection );
    final SubLObject template_id = ke.ke_create_now( name, UNPROVIDED );
    if( NIL != constant_handles.valid_constantP( template_id, UNPROVIDED ) )
    {
      rkf_sd_fet_assert( ConsesLow.listS( $const92$isa, template_id, $list93 ) );
      rkf_sd_fet_assert( ConsesLow.list( $const94$formulaTemplateHasType, template_id, topic_id ) );
      final SubLObject pred = constants_high.find_constant( $str95$constantNameAutoGeneratedFromColl );
      if( NIL != pred )
      {
        rkf_assertion_utilities.rkf_assert_now( el_utilities.make_ternary_formula( pred, template_id, collection, name ), $const96$BaseKB );
      }
    }
    return template_id;
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-salient-descriptor-prompter.lisp", position = 36558L)
  public static SubLObject rkf_sd_candidate_replacement_info(final SubLObject focal_term_arg_position, final SubLObject formula)
  {
    SubLObject ans = NIL;
    final SubLObject focal_term = cycl_utilities.formula_arg_position( formula, focal_term_arg_position, UNPROVIDED );
    SubLObject cdolist_list_var = cycl_utilities.arg_positions_if_bfs( $sym97$RKF_GENERIC_EXAMPLE_P, formula, UNPROVIDED );
    SubLObject arg_position = NIL;
    arg_position = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      final SubLObject v_term = cycl_utilities.formula_arg_position( formula, arg_position, UNPROVIDED );
      if( !v_term.equal( focal_term ) )
      {
        final SubLObject gloss = formula_template_utilities.make_fet_gloss_for_arg_position( arg_position, formula, UNPROVIDED );
        final SubLObject explanation = formula_template_utilities.make_fet_explanation_for_arg_position( arg_position, focal_term_arg_position, formula, UNPROVIDED );
        final SubLObject collection = cycl_utilities.nat_arg1( v_term, UNPROVIDED );
        ans = list_utilities.alist_enter( ans, arg_position, ConsesLow.list( gloss, collection, explanation ), UNPROVIDED );
      }
      cdolist_list_var = cdolist_list_var.rest();
      arg_position = cdolist_list_var.first();
    }
    return ans;
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-salient-descriptor-prompter.lisp", position = 37306L)
  public static SubLObject rkf_sd_prompt_get_var_arg_positions(final SubLObject prompt, final SubLObject formula)
  {
    SubLObject arg_positions = NIL;
    SubLObject cdolist_list_var = rkf_salient_descriptor_datastructures.rkf_salient_descriptor_prompt_subprompts( prompt );
    SubLObject subprompt = NIL;
    subprompt = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      final SubLObject var = rkf_salient_descriptor.rkf_salient_descriptor_subprompt_var( subprompt );
      if( NIL != cycl_variables.el_varP( var ) )
      {
        final SubLObject var_arg_positions = cycl_utilities.arg_positions_bfs( var, formula, UNPROVIDED );
        arg_positions = ConsesLow.append( arg_positions, var_arg_positions );
      }
      cdolist_list_var = cdolist_list_var.rest();
      subprompt = cdolist_list_var.first();
    }
    return arg_positions;
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-salient-descriptor-prompter.lisp", position = 37732L)
  public static SubLObject rkf_sd_prompt_get_precedent_example_sentences(final SubLObject prompt, final SubLObject focal_term)
  {
    SubLObject example_sentences = NIL;
    SubLObject cdolist_list_var = rkf_salient_descriptor_datastructures.rkf_salient_descriptor_prompt_subprompts( prompt );
    SubLObject subprompt = NIL;
    subprompt = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      final SubLObject examples = rkf_salient_descriptor.rkf_salient_descriptor_subprompt_examples( subprompt );
      if( examples.isList() )
      {
        final SubLObject var = rkf_salient_descriptor.rkf_salient_descriptor_subprompt_var( subprompt );
        final SubLObject assert_sentence_template = rkf_salient_descriptor.rkf_salient_descriptor_subprompt_assert_sentence( subprompt, $kw98$ANYTHING, var );
        SubLObject cdolist_list_var_$17 = examples;
        SubLObject example = NIL;
        example = cdolist_list_var_$17.first();
        while ( NIL != cdolist_list_var_$17)
        {
          if( NIL != rkf_salient_descriptor_datastructures.rkf_sd_precedent_example_p( example ) )
          {
            final SubLObject type = rkf_salient_descriptor_datastructures.rkf_sd_example_type( example );
            final SubLObject v_term = rkf_salient_descriptor_datastructures.rkf_sd_example_term( example );
            final SubLObject supports = rkf_salient_descriptor_datastructures.rkf_sd_example_supports( example );
            final SubLObject focus_term_analog = rkf_salient_descriptor_datastructures.rkf_sd_example_focus_term_analog( example );
            final SubLObject template = cycl_utilities.expression_subst( focus_term_analog, focal_term, assert_sentence_template, UNPROVIDED, UNPROVIDED );
            SubLObject cdolist_list_var_$18 = supports;
            SubLObject support = NIL;
            support = cdolist_list_var_$18.first();
            while ( NIL != cdolist_list_var_$18)
            {
              if( NIL != formula_pattern_match.formula_matches_pattern( arguments.support_sentence( support ), template ) )
              {
                example_sentences = ConsesLow.cons( arguments.support_sentence( support ), example_sentences );
              }
              cdolist_list_var_$18 = cdolist_list_var_$18.rest();
              support = cdolist_list_var_$18.first();
            }
          }
          cdolist_list_var_$17 = cdolist_list_var_$17.rest();
          example = cdolist_list_var_$17.first();
        }
      }
      cdolist_list_var = cdolist_list_var.rest();
      subprompt = cdolist_list_var.first();
    }
    return example_sentences;
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-salient-descriptor-prompter.lisp", position = 38689L)
  public static SubLObject rkf_sd_single_entry_promptP(final SubLObject prompt, final SubLObject mt)
  {
    SubLObject failP = NIL;
    if( NIL == failP )
    {
      SubLObject csome_list_var = rkf_salient_descriptor_datastructures.rkf_salient_descriptor_prompt_subprompts( prompt );
      SubLObject subprompt = NIL;
      subprompt = csome_list_var.first();
      while ( NIL == failP && NIL != csome_list_var)
      {
        final SubLObject var = rkf_salient_descriptor.rkf_salient_descriptor_subprompt_var( subprompt );
        final SubLObject assert_sentence_template = rkf_salient_descriptor.rkf_salient_descriptor_subprompt_assert_sentence( subprompt, $kw99$FOCAL_TERM, var );
        final SubLObject single_entryP = rkf_salient_descriptor.rkf_salient_descriptor_single_entry_varP( var, assert_sentence_template, mt );
        failP = makeBoolean( NIL == single_entryP );
        csome_list_var = csome_list_var.rest();
        subprompt = csome_list_var.first();
      }
    }
    return makeBoolean( NIL == failP );
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-salient-descriptor-prompter.lisp", position = 39193L)
  public static SubLObject rkf_sd_hide_specs_fn_replacements(final SubLObject template_fort)
  {
    final SubLObject formula = kb_mapping_utilities.fpred_value_in_any_mt( template_fort, $const64$formulaForFormulaTemplate, UNPROVIDED, UNPROVIDED, UNPROVIDED );
    SubLObject cdolist_list_var;
    final SubLObject specs_fn_positions = cdolist_list_var = ( NIL != el_utilities.elf_p( formula ) ) ? cycl_utilities.arg_positions_bfs( $const69$SpecsFn, formula, UNPROVIDED ) : NIL;
    SubLObject specs_fn_position = NIL;
    specs_fn_position = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      if( NIL != list_utilities.lengthG( specs_fn_position, TWO_INTEGER, UNPROVIDED ) && NIL != el_utilities.el_formula_with_operator_p( cycl_utilities.formula_arg_position( formula, conses_high.butlast(
          specs_fn_position, TWO_INTEGER ), UNPROVIDED ), $const100$SomeExampleFn ) )
      {
        final SubLObject type = cycl_utilities.formula_arg_position( formula, list_utilities.replace_last( specs_fn_position, ONE_INTEGER ), UNPROVIDED );
        if( NIL != forts.fort_p( type ) )
        {
          if( !cardinality_estimates.generality_estimate( type ).numL( $int66$100 ) )
          {
            final SubLObject type_pos = cycl_utilities.make_cycl_arg_position( conses_high.butlast( specs_fn_position, TWO_INTEGER ) );
            final SubLObject sentence = ConsesLow.list( $const70$templateReplacementsInvisibleForP, template_fort, type_pos );
            if( NIL == kb_indexing.find_assertion_any_mt( ConsesLow.list( NIL, ConsesLow.list( sentence ) ) ) )
            {
              rkf_sd_fet_assert( sentence );
            }
          }
        }
      }
      cdolist_list_var = cdolist_list_var.rest();
      specs_fn_position = cdolist_list_var.first();
    }
    return template_fort;
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-salient-descriptor-prompter.lisp", position = 40222L)
  public static SubLObject prune_rkf_sd_formula_template_topic(final SubLObject topic)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject focal_term_type = kb_mapping_utilities.fpred_value_in_any_mt( topic, $const101$focalTermTypeForInducedTemplateTy, TWO_INTEGER, ONE_INTEGER, UNPROVIDED );
    if( NIL != focal_term_type )
    {
      final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding( thread );
      final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding( thread );
      try
      {
        mt_relevance_macros.$relevant_mt_function$.bind( $sym102$RELEVANT_MT_IS_EVERYTHING, thread );
        mt_relevance_macros.$mt$.bind( $const103$EverythingPSC, thread );
        SubLObject cdolist_list_var = $list121;
        SubLObject pred = NIL;
        pred = cdolist_list_var.first();
        while ( NIL != cdolist_list_var)
        {
          final SubLObject pred_var = pred;
          if( NIL != kb_mapping_macros.do_gaf_arg_index_key_validator( topic, TWO_INTEGER, pred_var ) )
          {
            final SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator( topic, TWO_INTEGER, pred_var );
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
                  final_index_iterator = kb_mapping_macros.new_final_index_iterator( final_index_spec, $kw58$GAF, NIL, NIL );
                  SubLObject done_var_$19 = NIL;
                  final SubLObject token_var_$20 = NIL;
                  while ( NIL == done_var_$19)
                  {
                    final SubLObject template_gaf = iteration.iteration_next_without_values_macro_helper( final_index_iterator, token_var_$20 );
                    final SubLObject valid_$21 = makeBoolean( !token_var_$20.eql( template_gaf ) );
                    if( NIL != valid_$21 )
                    {
                      final SubLObject template = assertions_high.gaf_arg1( template_gaf );
                      final SubLObject template_formula = kb_mapping_utilities.fpred_value_in_any_mt( template, $const64$formulaForFormulaTemplate, UNPROVIDED, UNPROVIDED, UNPROVIDED );
                      final SubLObject bin_pred = ( NIL != template_formula ) ? cycl_utilities.formula_arg0( template_formula ) : NIL;
                      if( NIL != kb_accessors.binary_predicateP( bin_pred ) )
                      {
                        SubLObject found_genlP = NIL;
                        if( NIL == found_genlP )
                        {
                          SubLObject node_var = focal_term_type;
                          final SubLObject deck_type = $kw106$STACK;
                          final SubLObject recur_deck = deck.create_deck( deck_type );
                          final SubLObject _prev_bind_0_$22 = sbhl_marking_vars.$sbhl_space$.currentBinding( thread );
                          try
                          {
                            sbhl_marking_vars.$sbhl_space$.bind( sbhl_marking_vars.get_sbhl_marking_space(), thread );
                            try
                            {
                              final SubLObject tv_var = $const107$True_JustificationTruth;
                              final SubLObject _prev_bind_0_$23 = sbhl_search_vars.$sbhl_tv$.currentBinding( thread );
                              final SubLObject _prev_bind_1_$24 = sbhl_search_vars.$relevant_sbhl_tv_function$.currentBinding( thread );
                              try
                              {
                                sbhl_search_vars.$sbhl_tv$.bind( ( NIL != tv_var ) ? tv_var : sbhl_search_vars.get_sbhl_true_tv(), thread );
                                sbhl_search_vars.$relevant_sbhl_tv_function$.bind( ( NIL != tv_var ) ? $sym108$RELEVANT_SBHL_TV_IS_GENERAL_TV : sbhl_search_vars.$relevant_sbhl_tv_function$.getDynamicValue( thread ),
                                    thread );
                                if( NIL != tv_var && NIL != sbhl_paranoia.sbhl_object_type_checking_p() && NIL == sbhl_search_vars.sbhl_true_tv_p( tv_var ) )
                                {
                                  final SubLObject pcase_var = sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue( thread );
                                  if( pcase_var.eql( $kw109$ERROR ) )
                                  {
                                    sbhl_paranoia.sbhl_error( ONE_INTEGER, $str110$_A_is_not_a__A, tv_var, $sym111$SBHL_TRUE_TV_P, UNPROVIDED, UNPROVIDED, UNPROVIDED );
                                  }
                                  else if( pcase_var.eql( $kw112$CERROR ) )
                                  {
                                    sbhl_paranoia.sbhl_cerror( ONE_INTEGER, $str113$continue_anyway, $str110$_A_is_not_a__A, tv_var, $sym111$SBHL_TRUE_TV_P, UNPROVIDED, UNPROVIDED, UNPROVIDED );
                                  }
                                  else if( pcase_var.eql( $kw114$WARN ) )
                                  {
                                    Errors.warn( $str110$_A_is_not_a__A, tv_var, $sym111$SBHL_TRUE_TV_P );
                                  }
                                  else
                                  {
                                    Errors.warn( $str115$_A_is_not_a_valid__sbhl_type_erro, sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue( thread ) );
                                    Errors.cerror( $str113$continue_anyway, $str110$_A_is_not_a__A, tv_var, $sym111$SBHL_TRUE_TV_P );
                                  }
                                }
                                final SubLObject _prev_bind_0_$24 = sbhl_search_vars.$sbhl_search_module$.currentBinding( thread );
                                final SubLObject _prev_bind_1_$25 = sbhl_search_vars.$sbhl_search_module_type$.currentBinding( thread );
                                final SubLObject _prev_bind_3 = sbhl_search_vars.$sbhl_add_node_to_result_test$.currentBinding( thread );
                                final SubLObject _prev_bind_4 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding( thread );
                                final SubLObject _prev_bind_5 = sbhl_module_vars.$sbhl_module$.currentBinding( thread );
                                try
                                {
                                  sbhl_search_vars.$sbhl_search_module$.bind( sbhl_module_vars.get_sbhl_module( $const116$genls ), thread );
                                  sbhl_search_vars.$sbhl_search_module_type$.bind( sbhl_module_utilities.get_sbhl_module_type( sbhl_module_vars.get_sbhl_module( $const116$genls ) ), thread );
                                  sbhl_search_vars.$sbhl_add_node_to_result_test$.bind( sbhl_module_utilities.get_sbhl_add_node_to_result_test( sbhl_module_vars.get_sbhl_module( $const116$genls ) ), thread );
                                  sbhl_search_vars.$genl_inverse_mode_p$.bind( NIL, thread );
                                  sbhl_module_vars.$sbhl_module$.bind( sbhl_module_vars.get_sbhl_module( $const116$genls ), thread );
                                  if( NIL != sbhl_paranoia.suspend_sbhl_type_checkingP() || NIL != sbhl_module_utilities.apply_sbhl_module_type_test( focal_term_type, sbhl_module_vars.get_sbhl_module( UNPROVIDED ) ) )
                                  {
                                    final SubLObject _prev_bind_0_$25 = sbhl_search_vars.$sbhl_search_direction$.currentBinding( thread );
                                    final SubLObject _prev_bind_1_$26 = sbhl_link_vars.$sbhl_link_direction$.currentBinding( thread );
                                    final SubLObject _prev_bind_2_$29 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding( thread );
                                    try
                                    {
                                      sbhl_search_vars.$sbhl_search_direction$.bind( sbhl_search_vars.get_sbhl_forward_search_direction(), thread );
                                      sbhl_link_vars.$sbhl_link_direction$.bind( sbhl_module_utilities.sbhl_search_direction_to_link_direction( sbhl_search_vars.get_sbhl_forward_search_direction(), sbhl_module_vars
                                          .get_sbhl_module( $const116$genls ) ), thread );
                                      sbhl_search_vars.$genl_inverse_mode_p$.bind( NIL, thread );
                                      sbhl_marking_utilities.sbhl_mark_node_marked( node_var, UNPROVIDED );
                                      while ( NIL != node_var && NIL == found_genlP)
                                      {
                                        final SubLObject genl = node_var;
                                        if( !genl.eql( focal_term_type ) && NIL != focal_term_type_has_template_with_bin_predP( genl, bin_pred ) )
                                        {
                                          found_genlP = T;
                                          Errors.warn( $str117$Redundant_with__S_____S_on__S, genl, bin_pred, focal_term_type );
                                        }
                                        final SubLObject accessible_modules = sbhl_macros.get_sbhl_accessible_modules( sbhl_module_vars.get_sbhl_module( $const116$genls ) );
                                        SubLObject rest;
                                        SubLObject module_var;
                                        SubLObject _prev_bind_0_$26;
                                        SubLObject _prev_bind_1_$27;
                                        SubLObject node;
                                        SubLObject d_link;
                                        SubLObject mt_links;
                                        SubLObject iteration_state;
                                        SubLObject mt;
                                        SubLObject tv_links;
                                        SubLObject _prev_bind_0_$27;
                                        SubLObject iteration_state_$33;
                                        SubLObject tv;
                                        SubLObject link_nodes;
                                        SubLObject _prev_bind_0_$28;
                                        SubLObject sol;
                                        SubLObject set_contents_var;
                                        SubLObject basis_object;
                                        SubLObject state;
                                        SubLObject node_vars_link_node;
                                        SubLObject csome_list_var;
                                        SubLObject node_vars_link_node2;
                                        SubLObject new_list;
                                        SubLObject rest_$35;
                                        SubLObject generating_fn;
                                        SubLObject _prev_bind_0_$29;
                                        SubLObject sol2;
                                        SubLObject link_nodes2;
                                        SubLObject set_contents_var2;
                                        SubLObject basis_object2;
                                        SubLObject state2;
                                        SubLObject node_vars_link_node3;
                                        SubLObject csome_list_var2;
                                        SubLObject node_vars_link_node4;
                                        for( rest = NIL, rest = accessible_modules; NIL == found_genlP && NIL != rest; rest = rest.rest() )
                                        {
                                          module_var = rest.first();
                                          _prev_bind_0_$26 = sbhl_module_vars.$sbhl_module$.currentBinding( thread );
                                          _prev_bind_1_$27 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding( thread );
                                          try
                                          {
                                            sbhl_module_vars.$sbhl_module$.bind( module_var, thread );
                                            sbhl_search_vars.$genl_inverse_mode_p$.bind( ( NIL != sbhl_search_vars.flip_genl_inverse_modeP( UNPROVIDED, UNPROVIDED ) ) ? makeBoolean(
                                                NIL == sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue( thread ) ) : sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue( thread ), thread );
                                            node = function_terms.naut_to_nart( node_var );
                                            if( NIL != sbhl_link_vars.sbhl_node_object_p( node ) )
                                            {
                                              d_link = sbhl_graphs.get_sbhl_graph_link( node, sbhl_module_vars.get_sbhl_module( UNPROVIDED ) );
                                              if( NIL != d_link )
                                              {
                                                mt_links = sbhl_links.get_sbhl_mt_links( d_link, sbhl_link_vars.get_sbhl_link_direction(), sbhl_module_vars.get_sbhl_module( UNPROVIDED ) );
                                                if( NIL != mt_links )
                                                {
                                                  for( iteration_state = dictionary_contents.do_dictionary_contents_state( dictionary.dictionary_contents( mt_links ) ); NIL == found_genlP && NIL == dictionary_contents
                                                      .do_dictionary_contents_doneP( iteration_state ); iteration_state = dictionary_contents.do_dictionary_contents_next( iteration_state ) )
                                                  {
                                                    thread.resetMultipleValues();
                                                    mt = dictionary_contents.do_dictionary_contents_key_value( iteration_state );
                                                    tv_links = thread.secondMultipleValue();
                                                    thread.resetMultipleValues();
                                                    if( NIL != mt_relevance_macros.relevant_mtP( mt ) )
                                                    {
                                                      _prev_bind_0_$27 = sbhl_link_vars.$sbhl_link_mt$.currentBinding( thread );
                                                      try
                                                      {
                                                        sbhl_link_vars.$sbhl_link_mt$.bind( mt, thread );
                                                        for( iteration_state_$33 = dictionary_contents.do_dictionary_contents_state( dictionary.dictionary_contents( tv_links ) ); NIL == found_genlP
                                                            && NIL == dictionary_contents.do_dictionary_contents_doneP( iteration_state_$33 ); iteration_state_$33 = dictionary_contents.do_dictionary_contents_next(
                                                                iteration_state_$33 ) )
                                                        {
                                                          thread.resetMultipleValues();
                                                          tv = dictionary_contents.do_dictionary_contents_key_value( iteration_state_$33 );
                                                          link_nodes = thread.secondMultipleValue();
                                                          thread.resetMultipleValues();
                                                          if( NIL != sbhl_search_vars.relevant_sbhl_tvP( tv ) )
                                                          {
                                                            _prev_bind_0_$28 = sbhl_link_vars.$sbhl_link_tv$.currentBinding( thread );
                                                            try
                                                            {
                                                              sbhl_link_vars.$sbhl_link_tv$.bind( tv, thread );
                                                              sol = link_nodes;
                                                              if( NIL != set.set_p( sol ) )
                                                              {
                                                                set_contents_var = set.do_set_internal( sol );
                                                                for( basis_object = set_contents.do_set_contents_basis_object( set_contents_var ), state = NIL, state = set_contents.do_set_contents_initial_state(
                                                                    basis_object, set_contents_var ); NIL == found_genlP && NIL == set_contents.do_set_contents_doneP( basis_object, state ); state = set_contents
                                                                        .do_set_contents_update_state( state ) )
                                                                {
                                                                  node_vars_link_node = set_contents.do_set_contents_next( basis_object, state );
                                                                  if( NIL != set_contents.do_set_contents_element_validP( state, node_vars_link_node ) && NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(
                                                                      node_vars_link_node, UNPROVIDED ) )
                                                                  {
                                                                    sbhl_marking_utilities.sbhl_mark_node_marked( node_vars_link_node, UNPROVIDED );
                                                                    deck.deck_push( node_vars_link_node, recur_deck );
                                                                  }
                                                                }
                                                              }
                                                              else if( sol.isList() )
                                                              {
                                                                if( NIL == found_genlP )
                                                                {
                                                                  csome_list_var = sol;
                                                                  node_vars_link_node2 = NIL;
                                                                  node_vars_link_node2 = csome_list_var.first();
                                                                  while ( NIL == found_genlP && NIL != csome_list_var)
                                                                  {
                                                                    if( NIL == sbhl_marking_utilities.sbhl_search_path_termination_p( node_vars_link_node2, UNPROVIDED ) )
                                                                    {
                                                                      sbhl_marking_utilities.sbhl_mark_node_marked( node_vars_link_node2, UNPROVIDED );
                                                                      deck.deck_push( node_vars_link_node2, recur_deck );
                                                                    }
                                                                    csome_list_var = csome_list_var.rest();
                                                                    node_vars_link_node2 = csome_list_var.first();
                                                                  }
                                                                }
                                                              }
                                                              else
                                                              {
                                                                Errors.error( $str118$_A_is_neither_SET_P_nor_LISTP_, sol );
                                                              }
                                                            }
                                                            finally
                                                            {
                                                              sbhl_link_vars.$sbhl_link_tv$.rebind( _prev_bind_0_$28, thread );
                                                            }
                                                          }
                                                        }
                                                        dictionary_contents.do_dictionary_contents_finalize( iteration_state_$33 );
                                                      }
                                                      finally
                                                      {
                                                        sbhl_link_vars.$sbhl_link_mt$.rebind( _prev_bind_0_$27, thread );
                                                      }
                                                    }
                                                  }
                                                  dictionary_contents.do_dictionary_contents_finalize( iteration_state );
                                                }
                                              }
                                              else
                                              {
                                                sbhl_paranoia.sbhl_error( FIVE_INTEGER, $str119$attempting_to_bind_direction_link, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
                                              }
                                            }
                                            else if( NIL != obsolete.cnat_p( node, UNPROVIDED ) )
                                            {
                                              new_list = ( ( NIL != sbhl_link_vars.sbhl_randomize_lists_p() ) ? list_utilities.randomize_list( sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators(
                                                  sbhl_link_vars.get_sbhl_link_direction(), sbhl_search_vars.$sbhl_tv$.getDynamicValue( thread ), sbhl_module_vars.get_sbhl_module( UNPROVIDED ) ) )
                                                  : sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators( sbhl_link_vars.get_sbhl_link_direction(), sbhl_search_vars.$sbhl_tv$.getDynamicValue( thread ),
                                                      sbhl_module_vars.get_sbhl_module( UNPROVIDED ) ) );
                                              for( rest_$35 = NIL, rest_$35 = new_list; NIL == found_genlP && NIL != rest_$35; rest_$35 = rest_$35.rest() )
                                              {
                                                generating_fn = rest_$35.first();
                                                _prev_bind_0_$29 = sbhl_link_vars.$sbhl_link_generator$.currentBinding( thread );
                                                try
                                                {
                                                  sbhl_link_vars.$sbhl_link_generator$.bind( generating_fn, thread );
                                                  link_nodes2 = ( sol2 = Functions.funcall( generating_fn, node ) );
                                                  if( NIL != set.set_p( sol2 ) )
                                                  {
                                                    set_contents_var2 = set.do_set_internal( sol2 );
                                                    for( basis_object2 = set_contents.do_set_contents_basis_object( set_contents_var2 ), state2 = NIL, state2 = set_contents.do_set_contents_initial_state( basis_object2,
                                                        set_contents_var2 ); NIL == found_genlP && NIL == set_contents.do_set_contents_doneP( basis_object2, state2 ); state2 = set_contents.do_set_contents_update_state(
                                                            state2 ) )
                                                    {
                                                      node_vars_link_node3 = set_contents.do_set_contents_next( basis_object2, state2 );
                                                      if( NIL != set_contents.do_set_contents_element_validP( state2, node_vars_link_node3 ) && NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(
                                                          node_vars_link_node3, UNPROVIDED ) )
                                                      {
                                                        sbhl_marking_utilities.sbhl_mark_node_marked( node_vars_link_node3, UNPROVIDED );
                                                        deck.deck_push( node_vars_link_node3, recur_deck );
                                                      }
                                                    }
                                                  }
                                                  else if( sol2.isList() )
                                                  {
                                                    if( NIL == found_genlP )
                                                    {
                                                      csome_list_var2 = sol2;
                                                      node_vars_link_node4 = NIL;
                                                      node_vars_link_node4 = csome_list_var2.first();
                                                      while ( NIL == found_genlP && NIL != csome_list_var2)
                                                      {
                                                        if( NIL == sbhl_marking_utilities.sbhl_search_path_termination_p( node_vars_link_node4, UNPROVIDED ) )
                                                        {
                                                          sbhl_marking_utilities.sbhl_mark_node_marked( node_vars_link_node4, UNPROVIDED );
                                                          deck.deck_push( node_vars_link_node4, recur_deck );
                                                        }
                                                        csome_list_var2 = csome_list_var2.rest();
                                                        node_vars_link_node4 = csome_list_var2.first();
                                                      }
                                                    }
                                                  }
                                                  else
                                                  {
                                                    Errors.error( $str118$_A_is_neither_SET_P_nor_LISTP_, sol2 );
                                                  }
                                                }
                                                finally
                                                {
                                                  sbhl_link_vars.$sbhl_link_generator$.rebind( _prev_bind_0_$29, thread );
                                                }
                                              }
                                            }
                                          }
                                          finally
                                          {
                                            sbhl_search_vars.$genl_inverse_mode_p$.rebind( _prev_bind_1_$27, thread );
                                            sbhl_module_vars.$sbhl_module$.rebind( _prev_bind_0_$26, thread );
                                          }
                                        }
                                        node_var = deck.deck_pop( recur_deck );
                                      }
                                    }
                                    finally
                                    {
                                      sbhl_search_vars.$genl_inverse_mode_p$.rebind( _prev_bind_2_$29, thread );
                                      sbhl_link_vars.$sbhl_link_direction$.rebind( _prev_bind_1_$26, thread );
                                      sbhl_search_vars.$sbhl_search_direction$.rebind( _prev_bind_0_$25, thread );
                                    }
                                  }
                                  else
                                  {
                                    sbhl_paranoia.sbhl_warn( TWO_INTEGER, $str120$Node__a_does_not_pass_sbhl_type_t, focal_term_type, sbhl_module_utilities.get_sbhl_type_test( sbhl_module_vars.get_sbhl_module(
                                        UNPROVIDED ) ), UNPROVIDED, UNPROVIDED, UNPROVIDED );
                                  }
                                }
                                finally
                                {
                                  sbhl_module_vars.$sbhl_module$.rebind( _prev_bind_5, thread );
                                  sbhl_search_vars.$genl_inverse_mode_p$.rebind( _prev_bind_4, thread );
                                  sbhl_search_vars.$sbhl_add_node_to_result_test$.rebind( _prev_bind_3, thread );
                                  sbhl_search_vars.$sbhl_search_module_type$.rebind( _prev_bind_1_$25, thread );
                                  sbhl_search_vars.$sbhl_search_module$.rebind( _prev_bind_0_$24, thread );
                                }
                              }
                              finally
                              {
                                sbhl_search_vars.$relevant_sbhl_tv_function$.rebind( _prev_bind_1_$24, thread );
                                sbhl_search_vars.$sbhl_tv$.rebind( _prev_bind_0_$23, thread );
                              }
                            }
                            finally
                            {
                              final SubLObject _prev_bind_0_$30 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
                              try
                              {
                                Threads.$is_thread_performing_cleanupP$.bind( T, thread );
                                final SubLObject _values = Values.getValuesAsVector();
                                sbhl_marking_vars.free_sbhl_marking_space( sbhl_marking_vars.$sbhl_space$.getDynamicValue( thread ) );
                                Values.restoreValuesFromVector( _values );
                              }
                              finally
                              {
                                Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$30, thread );
                              }
                            }
                          }
                          finally
                          {
                            sbhl_marking_vars.$sbhl_space$.rebind( _prev_bind_0_$22, thread );
                          }
                        }
                        if( NIL != found_genlP )
                        {
                          rkf_term_utilities.rkf_kill( template );
                        }
                      }
                    }
                    done_var_$19 = makeBoolean( NIL == valid_$21 );
                  }
                }
                finally
                {
                  final SubLObject _prev_bind_0_$31 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
                  try
                  {
                    Threads.$is_thread_performing_cleanupP$.bind( T, thread );
                    final SubLObject _values2 = Values.getValuesAsVector();
                    if( NIL != final_index_iterator )
                    {
                      kb_mapping_macros.destroy_final_index_iterator( final_index_iterator );
                    }
                    Values.restoreValuesFromVector( _values2 );
                  }
                  finally
                  {
                    Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$31, thread );
                  }
                }
              }
              done_var = makeBoolean( NIL == valid );
            }
          }
          cdolist_list_var = cdolist_list_var.rest();
          pred = cdolist_list_var.first();
        }
      }
      finally
      {
        mt_relevance_macros.$mt$.rebind( _prev_bind_2, thread );
        mt_relevance_macros.$relevant_mt_function$.rebind( _prev_bind_0, thread );
      }
      if( NIL == formula_templates.fet_topic_fort_has_templatesP( topic, $const90$InferencePSC ) )
      {
        Errors.warn( $str122$Hey_ho___S_has_got_to_go___, topic );
        rkf_term_utilities.rkf_kill( topic );
      }
    }
    return topic;
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-salient-descriptor-prompter.lisp", position = 41385L)
  public static SubLObject focal_term_type_has_template_with_bin_predP(final SubLObject type, final SubLObject bin_pred)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject foundP = NIL;
    final SubLObject topic = formula_template_utilities.induction_topic_type_for_collection( type );
    if( NIL != nart_handles.nart_p( topic ) )
    {
      final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding( thread );
      final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding( thread );
      try
      {
        mt_relevance_macros.$relevant_mt_function$.bind( $sym102$RELEVANT_MT_IS_EVERYTHING, thread );
        mt_relevance_macros.$mt$.bind( $const103$EverythingPSC, thread );
        SubLObject cdolist_list_var = $list121;
        SubLObject pred = NIL;
        pred = cdolist_list_var.first();
        while ( NIL != cdolist_list_var)
        {
          final SubLObject pred_var = pred;
          if( NIL != kb_mapping_macros.do_gaf_arg_index_key_validator( topic, TWO_INTEGER, pred_var ) )
          {
            final SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator( topic, TWO_INTEGER, pred_var );
            SubLObject done_var = foundP;
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
                  final_index_iterator = kb_mapping_macros.new_final_index_iterator( final_index_spec, $kw58$GAF, NIL, NIL );
                  SubLObject done_var_$39 = foundP;
                  final SubLObject token_var_$40 = NIL;
                  while ( NIL == done_var_$39)
                  {
                    final SubLObject template_gaf = iteration.iteration_next_without_values_macro_helper( final_index_iterator, token_var_$40 );
                    final SubLObject valid_$41 = makeBoolean( !token_var_$40.eql( template_gaf ) );
                    if( NIL != valid_$41 )
                    {
                      final SubLObject template = assertions_high.gaf_arg1( template_gaf );
                      final SubLObject template_formula = kb_mapping_utilities.fpred_value_in_any_mt( template, $const64$formulaForFormulaTemplate, UNPROVIDED, UNPROVIDED, UNPROVIDED );
                      final SubLObject this_bin_pred = ( NIL != template_formula ) ? cycl_utilities.formula_arg0( template_formula ) : NIL;
                      foundP = Equality.eql( bin_pred, this_bin_pred );
                    }
                    done_var_$39 = makeBoolean( NIL == valid_$41 || NIL != foundP );
                  }
                }
                finally
                {
                  final SubLObject _prev_bind_0_$42 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
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
                    Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$42, thread );
                  }
                }
              }
              done_var = makeBoolean( NIL == valid || NIL != foundP );
            }
          }
          cdolist_list_var = cdolist_list_var.rest();
          pred = cdolist_list_var.first();
        }
      }
      finally
      {
        mt_relevance_macros.$mt$.rebind( _prev_bind_2, thread );
        mt_relevance_macros.$relevant_mt_function$.rebind( _prev_bind_0, thread );
      }
    }
    return foundP;
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-salient-descriptor-prompter.lisp", position = 42108L)
  public static SubLObject rkf_induced_salient_descriptor_prompts_for_focal_term_type(final SubLObject focal_term_type, final SubLObject elmt)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    assert NIL != fort_types_interface.isa_collectionP( focal_term_type, UNPROVIDED ) : focal_term_type;
    SubLObject prompts = NIL;
    final SubLObject table = $list124;
    assert NIL != list_utilities.alist_p( table ) : table;
    final SubLObject _prev_bind_0 = $rkf_sd_seed_term_tactics_table$.currentBinding( thread );
    try
    {
      $rkf_sd_seed_term_tactics_table$.bind( table, thread );
      prompts = rkf_salient_descriptor_prompts_for_focal_term_type( focal_term_type, elmt );
    }
    finally
    {
      $rkf_sd_seed_term_tactics_table$.rebind( _prev_bind_0, thread );
    }
    return prompts;
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-salient-descriptor-prompter.lisp", position = 42703L)
  public static SubLObject rkf_salient_descriptor_prompts_for_focal_term_type(final SubLObject focal_term_type, final SubLObject elmt)
  {
    assert NIL != fort_types_interface.isa_collectionP( focal_term_type, UNPROVIDED ) : focal_term_type;
    final SubLObject focal_term = rkf_domain_examples.rkf_generic_example_for_collection( focal_term_type );
    final SubLObject prompter = rkf_salient_descriptor_datastructures.new_rkf_salient_descriptor_prompter( focal_term, elmt );
    SubLObject prompts = NIL;
    for( SubLObject prompt = rkf_salient_descriptor_prompter_next( prompter, UNPROVIDED ); NIL != rkf_salient_descriptor_datastructures.rkf_salient_descriptor_prompt_p(
        prompt ); prompt = rkf_salient_descriptor_prompter_next( prompter, UNPROVIDED ) )
    {
      prompts = ConsesLow.cons( prompt, prompts );
    }
    return Sequences.nreverse( prompts );
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-salient-descriptor-prompter.lisp", position = 43333L)
  public static SubLObject rkf_sd_prompter_apply_tactics(final SubLObject prompter)
  {
    SubLObject result = NIL;
    final SubLObject lock = rkf_salient_descriptor_datastructures.rkf_salient_descriptor_prompter_lookup( prompter, $kw23$LOCK, UNPROVIDED );
    SubLObject release = NIL;
    try
    {
      release = Locks.seize_lock( lock );
      if( NIL != rkf_sd_prompter_tactics_exhausted_p( prompter ) )
      {
        result = $kw19$DONE;
      }
      else
      {
        final SubLObject tactic = rkf_sd_prompter_tactics_next( prompter );
        result = rkf_sd_prompter_apply_tactic( prompter, tactic );
      }
    }
    finally
    {
      if( NIL != release )
      {
        Locks.release_lock( lock );
      }
    }
    return result;
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-salient-descriptor-prompter.lisp", position = 43801L)
  public static SubLObject rkf_sd_prompter_exhausted_p(final SubLObject prompter)
  {
    return makeBoolean( NIL == rkf_salient_descriptor_datastructures.rkf_sd_prompter_tactics( prompter ) && NIL != set.set_emptyP( rkf_salient_descriptor_datastructures.rkf_sd_prompter_unused_prompts( prompter ) ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-salient-descriptor-prompter.lisp", position = 44035L)
  public static SubLObject rkf_sd_prompter_tactics_exhausted_p(final SubLObject prompter)
  {
    return Types.sublisp_null( rkf_salient_descriptor_datastructures.rkf_sd_prompter_tactics( prompter ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-salient-descriptor-prompter.lisp", position = 44150L)
  public static SubLObject rkf_sd_prompter_tactics_next(final SubLObject prompter)
  {
    if( NIL != rkf_sd_prompter_tactics_exhausted_p( prompter ) )
    {
      return $kw126$EXHAUSTED;
    }
    return rkf_salient_descriptor_datastructures.rkf_sd_prompter_tactics( prompter ).first();
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-salient-descriptor-prompter.lisp", position = 44343L)
  public static SubLObject rkf_sd_prompter_apply_tactic(final SubLObject prompter, final SubLObject tactic)
  {
    if( NIL == Symbols.fboundp( tactic ) )
    {
      rkf_salient_descriptor_datastructures._csetf_rkf_sd_prompter_tactics( prompter, rkf_salient_descriptor_datastructures.rkf_sd_prompter_tactics( prompter ).rest() );
    }
    else
    {
      final SubLObject result = Functions.funcall( tactic, prompter );
      rkf_salient_descriptor_datastructures.rkf_salient_descriptor_prompter_set( prompter, $kw27$LAST_TACTIC, tactic );
      if( $kw19$DONE == result )
      {
        rkf_salient_descriptor_datastructures._csetf_rkf_sd_prompter_tactics( prompter, rkf_salient_descriptor_datastructures.rkf_sd_prompter_tactics( prompter ).rest() );
        return $kw22$TACTIC_DONE;
      }
    }
    return prompter;
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-salient-descriptor-prompter.lisp", position = 44843L)
  public static SubLObject with_sd_tactic_disabled_for_seed_term_type(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list127 );
    final SubLObject temp = current.rest();
    current = current.first();
    SubLObject seed_term_type = NIL;
    SubLObject tactic = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list127 );
    seed_term_type = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list127 );
    tactic = current.first();
    current = current.rest();
    if( NIL == current )
    {
      final SubLObject body;
      current = ( body = temp );
      final SubLObject tactics_for_seed_term_type = $sym128$TACTICS_FOR_SEED_TERM_TYPE;
      final SubLObject tactics_table_copy = $sym129$TACTICS_TABLE_COPY;
      return ConsesLow.listS( $sym5$CLET, ConsesLow.list( ConsesLow.list( tactics_for_seed_term_type, ConsesLow.listS( $sym130$REMOVE, tactic, ConsesLow.list( $sym131$RKF_SD_PROMPTER_TACTICS_FOR_SEED_TERM_TYPE,
          seed_term_type ), $list132 ) ), reader.bq_cons( tactics_table_copy, $list133 ), ConsesLow.list( $sym53$_RKF_SD_SEED_TERM_TACTICS_TABLE_, ConsesLow.listS( $sym134$ALIST_ENTER, tactics_table_copy, seed_term_type,
              tactics_for_seed_term_type, $list132 ) ) ), ConsesLow.append( body, NIL ) );
    }
    cdestructuring_bind.cdestructuring_bind_error( datum, $list127 );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-salient-descriptor-prompter.lisp", position = 45346L)
  public static SubLObject with_sd_tactics_disabled_for_seed_term_type(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list135 );
    final SubLObject temp = current.rest();
    current = current.first();
    SubLObject seed_term_type = NIL;
    SubLObject tactics = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list135 );
    seed_term_type = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list135 );
    tactics = current.first();
    current = current.rest();
    if( NIL == current )
    {
      final SubLObject body;
      current = ( body = temp );
      final SubLObject tactics_for_seed_term_type = $sym136$TACTICS_FOR_SEED_TERM_TYPE;
      final SubLObject tactics_table_copy = $sym137$TACTICS_TABLE_COPY;
      return ConsesLow.list( $sym50$PROGN, ConsesLow.listS( $sym51$CHECK_TYPE, tactics, $list138 ), ConsesLow.listS( $sym5$CLET, ConsesLow.list( ConsesLow.list( tactics_for_seed_term_type, ConsesLow.listS(
          $sym139$ORDERED_SET_DIFFERENCE, ConsesLow.list( $sym131$RKF_SD_PROMPTER_TACTICS_FOR_SEED_TERM_TYPE, seed_term_type ), tactics, $list132 ) ), reader.bq_cons( tactics_table_copy, $list133 ), ConsesLow.list(
              $sym53$_RKF_SD_SEED_TERM_TACTICS_TABLE_, ConsesLow.listS( $sym134$ALIST_ENTER, tactics_table_copy, seed_term_type, tactics_for_seed_term_type, $list132 ) ) ), ConsesLow.append( body, NIL ) ) );
    }
    cdestructuring_bind.cdestructuring_bind_error( datum, $list135 );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-salient-descriptor-prompter.lisp", position = 45931L)
  public static SubLObject rkf_sd_prompter_suggestion(final SubLObject prompter)
  {
    return rkf_sd_prompter_add_ke_driven_prompts( prompter, $const140$keSuggestion );
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-salient-descriptor-prompter.lisp", position = 46059L)
  public static SubLObject rkf_sd_prompter_required(final SubLObject prompter)
  {
    return rkf_sd_prompter_add_ke_driven_prompts( prompter, $const141$keRequirement );
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-salient-descriptor-prompter.lisp", position = 46186L)
  public static SubLObject rkf_sd_prompter_interaction_context_required(final SubLObject prompter)
  {
    return rkf_sd_prompter_add_ke_driven_prompts( prompter, $const142$keInteractionRequirement );
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-salient-descriptor-prompter.lisp", position = 46344L)
  public static SubLObject rkf_sd_prompter_interaction_context_strong(final SubLObject prompter)
  {
    return rkf_sd_prompter_add_ke_driven_prompts( prompter, $const143$keInteractionStrongSuggestion );
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-salient-descriptor-prompter.lisp", position = 46505L)
  public static SubLObject rkf_sd_prompter_add_ke_driven_prompts(final SubLObject prompter, final SubLObject salience_pred)
  {
    SubLObject fodder_to_add = rkf_sd_prompter_ke_driven_prompt_fodder( prompter, salience_pred );
    if( !fodder_to_add.isList() )
    {
      return $kw19$DONE;
    }
    if( NIL == fodder_to_add )
    {
      fodder_to_add = rkf_sd_prompter_compute_ke_driven_prompt_fodder( prompter, salience_pred );
      if( !fodder_to_add.isList() )
      {
        return $kw19$DONE;
      }
    }
    SubLObject current;
    final SubLObject datum = current = fodder_to_add;
    SubLObject formulas = NIL;
    SubLObject justifications = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list144 );
    formulas = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list144 );
    justifications = current.first();
    current = current.rest();
    if( NIL == current )
    {
      final SubLObject new_prompt = rkf_salient_descriptor_datastructures.new_rkf_sd_prompt();
      final SubLObject formula = formulas.first();
      final SubLObject justification = justifications.first();
      final SubLObject tactic = rkf_salient_descriptor_prompter_current_tactic( prompter );
      SubLObject remaining_fodder = NIL;
      if( NIL != formulas.rest() )
      {
        remaining_fodder = ConsesLow.list( formulas.rest(), justifications.rest() );
      }
      else if( NIL != rkf_sd_prompter_iterative_prompt_method_p( salience_pred ) )
      {
        remaining_fodder = NIL;
      }
      else
      {
        remaining_fodder = $kw19$DONE;
      }
      rkf_sd_prompter_update_ke_driven_prompts( prompter, salience_pred, remaining_fodder );
      rkf_salient_descriptor_datastructures.rkf_sd_prompt_set_formula( new_prompt, formula );
      rkf_salient_descriptor_datastructures.rkf_sd_prompt_set_tactic( new_prompt, tactic );
      rkf_salient_descriptor_datastructures.rkf_sd_prompt_set_justification( new_prompt, justification );
      rkf_sd_prompter_add_prompt( prompter, new_prompt );
      return prompter;
    }
    cdestructuring_bind.cdestructuring_bind_error( datum, $list144 );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-salient-descriptor-prompter.lisp", position = 47909L)
  public static SubLObject rkf_sd_prompter_ke_driven_prompt_fodder(final SubLObject prompter, final SubLObject salience_pred)
  {
    final SubLObject alist = rkf_salient_descriptor_datastructures.rkf_salient_descriptor_prompter_lookup( prompter, $kw145$KE_DRIVEN_PROMPTS, NIL );
    return list_utilities.alist_lookup( alist, salience_pred, UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-salient-descriptor-prompter.lisp", position = 48131L)
  public static SubLObject rkf_sd_prompter_update_ke_driven_prompts(final SubLObject prompter, final SubLObject salience_pred, final SubLObject fodder)
  {
    final SubLObject old_alist = rkf_salient_descriptor_datastructures.rkf_salient_descriptor_prompter_lookup( prompter, $kw145$KE_DRIVEN_PROMPTS, NIL );
    final SubLObject new_alist = list_utilities.alist_enter( old_alist, salience_pred, fodder, UNPROVIDED );
    rkf_salient_descriptor_datastructures.rkf_salient_descriptor_prompter_set( prompter, $kw145$KE_DRIVEN_PROMPTS, new_alist );
    return fodder;
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-salient-descriptor-prompter.lisp", position = 48476L)
  public static SubLObject rkf_sd_prompter_compute_ke_driven_prompt_fodder(final SubLObject prompter, final SubLObject salience_pred)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    thread.resetMultipleValues();
    final SubLObject formulas = rkf_sd_prompter_get_ke_driven_prompt_formulas( prompter, salience_pred );
    final SubLObject justifications = thread.secondMultipleValue();
    thread.resetMultipleValues();
    return ( NIL != formulas ) ? ConsesLow.list( formulas, justifications ) : $kw19$DONE;
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-salient-descriptor-prompter.lisp", position = 48758L)
  public static SubLObject rkf_sd_prompter_iterative_prompt_method_p(final SubLObject obj)
  {
    if( NIL != constant_handles.valid_constantP( obj, UNPROVIDED ) )
    {
      return T;
    }
    if( obj == $sym146$RKF_NEIGHBOR_SUGGESTIONS )
    {
      return NIL;
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-salient-descriptor-prompter.lisp", position = 49328L)
  public static SubLObject rkf_sd_prompter_get_ke_driven_prompt_formulas(final SubLObject prompter, final SubLObject salience_pred)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject formulas = NIL;
    SubLObject justifications = NIL;
    final SubLObject seed_term = rkf_salient_descriptor_datastructures.rkf_sd_prompter_seed_term( prompter );
    final SubLObject _prev_bind_0 = $rkf_sd_suppress_rarely_known_prompt_formulasP$.currentBinding( thread );
    try
    {
      $rkf_sd_suppress_rarely_known_prompt_formulasP$.bind( rkf_salient_descriptor_datastructures.rkf_salient_descriptor_prompter_lookup( prompter, $kw147$SUPPRESS_RARELY_KNOWN_PROMPT_FORMULAS_,
          $rkf_sd_suppress_rarely_known_prompt_formulasP$.getDynamicValue( thread ) ), thread );
      final SubLObject mt = rkf_salient_descriptor_datastructures.rkf_sd_prompter_mt( prompter );
      if( salience_pred.isFunctionSpec() )
      {
        thread.resetMultipleValues();
        final SubLObject formulas_$43 = Functions.funcall( salience_pred, seed_term, mt );
        final SubLObject justifications_$44 = thread.secondMultipleValue();
        thread.resetMultipleValues();
        formulas = formulas_$43;
        justifications = justifications_$44;
      }
      else if( NIL != constant_handles.valid_constantP( salience_pred, UNPROVIDED ) )
      {
        SubLObject results_queue = rkf_salient_descriptor_datastructures.rkf_salient_descriptor_prompter_lookup( prompter, $kw148$RESULTS_QUEUE, NIL );
        SubLObject no_more_bindingsP = NIL;
        final SubLObject _prev_bind_0_$45 = rkf_salient_descriptor.$rkf_sd_problem_store$.currentBinding( thread );
        try
        {
          rkf_salient_descriptor.$rkf_sd_problem_store$.bind( rkf_sd_prompter_find_or_set_problem_store( prompter ), thread );
          final SubLObject reuse_existingP = rkf_salient_descriptor.rkf_sd_problem_store_okP( rkf_salient_descriptor.$rkf_sd_problem_store$.getDynamicValue( thread ) );
          final SubLObject _prev_bind_0_$46 = rkf_salient_descriptor.$rkf_sd_problem_store$.currentBinding( thread );
          try
          {
            rkf_salient_descriptor.$rkf_sd_problem_store$.bind( rkf_salient_descriptor.rkf_sd_find_or_make_problem_store(), thread );
            final SubLObject store = rkf_salient_descriptor.$rkf_sd_problem_store$.getDynamicValue( thread );
            try
            {
              SubLObject current;
              final SubLObject datum = current = rkf_sd_prompter_ke_driven_inference_and_var( prompter, salience_pred );
              SubLObject inference = NIL;
              SubLObject formula_var = NIL;
              cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list149 );
              inference = current.first();
              current = ( formula_var = current.rest() );
              while ( NIL == formulas && NIL == no_more_bindingsP)
              {
                final SubLObject max_depth_max = rkf_salient_descriptor.$rkf_sd_formulas_max_depth_max$.getDynamicValue( thread );
                final SubLObject inference_max_depth = inference_datastructures_inference.inference_max_transformation_depth( inference );
                final SubLObject max_depth = ( NIL != inference_datastructures_inference.exhausted_inference_p( inference ) ) ? number_utilities.f_1X( inference_max_depth ) : inference_max_depth;
                no_more_bindingsP = Numbers.numG( max_depth, max_depth_max );
                if( NIL == no_more_bindingsP )
                {
                  thread.resetMultipleValues();
                  final SubLObject new_formulas = rkf_salient_descriptor.rkf_salient_descriptor_formulas_one_batch( inference, max_depth, mt, formula_var, results_queue );
                  final SubLObject new_justs = thread.secondMultipleValue();
                  final SubLObject exit_condition = thread.thirdMultipleValue();
                  final SubLObject more_results = thread.fourthMultipleValue();
                  thread.resetMultipleValues();
                  results_queue = more_results;
                  SubLObject new_formula = NIL;
                  SubLObject new_formula_$47 = NIL;
                  SubLObject new_just = NIL;
                  SubLObject new_just_$48 = NIL;
                  new_formula = new_formulas;
                  new_formula_$47 = new_formula.first();
                  new_just = new_justs;
                  new_just_$48 = new_just.first();
                  while ( NIL != new_just || NIL != new_formula)
                  {
                    if( NIL == rkf_sd_suppress_formula_for_seed_termP( new_formula_$47, seed_term, new_just_$48, mt ) )
                    {
                      formulas = ConsesLow.cons( new_formula_$47, formulas );
                      justifications = ConsesLow.cons( new_just_$48, justifications );
                    }
                    new_formula = new_formula.rest();
                    new_formula_$47 = new_formula.first();
                    new_just = new_just.rest();
                    new_just_$48 = new_just.first();
                  }
                  if( $kw85$MAX_TIME == exit_condition )
                  {
                    Errors.warn( $str150$Timed_out_after__S_seconds_gettin, rkf_salient_descriptor.$rkf_salient_descriptor_time_cutoff$.getDynamicValue( thread ), salience_pred, seed_term );
                    no_more_bindingsP = T;
                  }
                  else if( $kw151$PROBABLY_APPROXIMATELY_DONE == exit_condition )
                  {
                    Errors.warn( $str152$P_A_D__getting__S_for__S___, salience_pred, seed_term );
                    no_more_bindingsP = T;
                  }
                  else if( $kw153$EXHAUST_TOTAL == exit_condition )
                  {
                    no_more_bindingsP = T;
                  }
                  else
                  {
                    if( NIL != inference_datastructures_inference.continuable_inference_p( inference ) )
                    {
                      continue;
                    }
                    Errors.warn( $str154$_S_is_not_continuable____Exit_con, inference, exit_condition );
                    no_more_bindingsP = T;
                  }
                }
              }
              if( NIL == formulas )
              {
                inference_datastructures_inference.destroy_inference( inference );
              }
            }
            finally
            {
              final SubLObject _prev_bind_0_$47 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
              try
              {
                Threads.$is_thread_performing_cleanupP$.bind( T, thread );
                final SubLObject _values = Values.getValuesAsVector();
                if( NIL == reuse_existingP )
                {
                  rkf_salient_descriptor.rkf_sd_free_problem_store( store );
                }
                Values.restoreValuesFromVector( _values );
              }
              finally
              {
                Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$47, thread );
              }
            }
          }
          finally
          {
            rkf_salient_descriptor.$rkf_sd_problem_store$.rebind( _prev_bind_0_$46, thread );
          }
        }
        finally
        {
          rkf_salient_descriptor.$rkf_sd_problem_store$.rebind( _prev_bind_0_$45, thread );
        }
        rkf_salient_descriptor_datastructures.rkf_salient_descriptor_prompter_set( prompter, $kw148$RESULTS_QUEUE, results_queue );
      }
    }
    finally
    {
      $rkf_sd_suppress_rarely_known_prompt_formulasP$.rebind( _prev_bind_0, thread );
    }
    return Values.values( formulas, justifications );
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-salient-descriptor-prompter.lisp", position = 52058L)
  public static SubLObject rkf_sd_suppress_formula_for_seed_termP(final SubLObject formula, final SubLObject seed_term, final SubLObject justification, final SubLObject mt)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject suppressP = NIL;
    if( NIL != $rkf_sd_suppress_rarely_known_prompt_formulasP$.getDynamicValue( thread ) )
    {
      final SubLObject salient_property_sentence = rkf_salient_descriptor.rkf_salient_property_sentence_from_justification( seed_term, justification );
      if( NIL != el_utilities.possibly_sentence_p( salient_property_sentence ) )
      {
        final SubLObject seed_term_sentence = simplifier.conjoin( ConsesLow.list( salient_property_sentence, formula ), UNPROVIDED );
        final SubLObject seed_term_var = czer_utilities.unique_el_var_wrt_expression( seed_term_sentence, $sym155$_SEED_TERM );
        final SubLObject query_formula = cycl_utilities.expression_subst( seed_term_var, seed_term, seed_term_sentence, UNPROVIDED, UNPROVIDED );
        final SubLObject threshold = rkf_sd_suppress_formula_threshold( salient_property_sentence, seed_term, mt );
        final SubLObject v_bindings = rkf_sd_suppress_formula_test_query( query_formula, mt, threshold );
        suppressP = list_utilities.lengthL( v_bindings, threshold, UNPROVIDED );
        if( NIL != suppressP )
        {
          Errors.warn( $str156$Suppressing_SD_prompt_for__S_____, seed_term, formula, threshold );
        }
      }
    }
    return suppressP;
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-salient-descriptor-prompter.lisp", position = 53099L)
  public static SubLObject rkf_sd_suppress_formula_threshold(final SubLObject salient_property_sentence, final SubLObject seed_term, final SubLObject mt)
  {
    final SubLObject salient_property = properties.sentence_to_property( salient_property_sentence, seed_term );
    return rkf_sd_suppress_formula_threshold_for_property( salient_property, mt, UNPROVIDED, UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-salient-descriptor-prompter.lisp", position = 53360L)
  public static SubLObject rkf_sd_suppress_formula_threshold_for_property_internal(final SubLObject salient_property, final SubLObject mt, SubLObject problem_store, SubLObject min_percent, SubLObject min_count)
  {
    if( problem_store == UNPROVIDED )
    {
      problem_store = rkf_salient_descriptor.rkf_sd_find_or_make_problem_store();
    }
    if( min_percent == UNPROVIDED )
    {
      min_percent = $rkf_sd_suppress_formula_percent_min$.getDynamicValue();
    }
    if( min_count == UNPROVIDED )
    {
      min_count = $rkf_sd_suppress_formula_count_min$.getDynamicValue();
    }
    final SubLObject salient_property_extent = properties.property_extent( salient_property, mt, ConsesLow.list( $kw18$PROBLEM_STORE, problem_store ) );
    final SubLObject threshold_via_percent = Numbers.integerDivide( Numbers.multiply( Sequences.length( salient_property_extent ), min_percent ), $int66$100 );
    return Numbers.max( threshold_via_percent, min_count );
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-salient-descriptor-prompter.lisp", position = 53360L)
  public static SubLObject rkf_sd_suppress_formula_threshold_for_property(final SubLObject salient_property, final SubLObject mt, SubLObject problem_store, SubLObject min_percent, SubLObject min_count)
  {
    if( problem_store == UNPROVIDED )
    {
      problem_store = rkf_salient_descriptor.rkf_sd_find_or_make_problem_store();
    }
    if( min_percent == UNPROVIDED )
    {
      min_percent = $rkf_sd_suppress_formula_percent_min$.getDynamicValue();
    }
    if( min_count == UNPROVIDED )
    {
      min_count = $rkf_sd_suppress_formula_count_min$.getDynamicValue();
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue( thread );
    SubLObject caching_state = NIL;
    if( NIL == v_memoization_state )
    {
      return rkf_sd_suppress_formula_threshold_for_property_internal( salient_property, mt, problem_store, min_percent, min_count );
    }
    caching_state = memoization_state.memoization_state_lookup( v_memoization_state, $sym157$RKF_SD_SUPPRESS_FORMULA_THRESHOLD_FOR_PROPERTY, UNPROVIDED );
    if( NIL == caching_state )
    {
      caching_state = memoization_state.create_caching_state( memoization_state.memoization_state_lock( v_memoization_state ), $sym157$RKF_SD_SUPPRESS_FORMULA_THRESHOLD_FOR_PROPERTY, FIVE_INTEGER, NIL, EQUAL,
          UNPROVIDED );
      memoization_state.memoization_state_put( v_memoization_state, $sym157$RKF_SD_SUPPRESS_FORMULA_THRESHOLD_FOR_PROPERTY, caching_state );
    }
    final SubLObject sxhash = memoization_state.sxhash_calc_5( salient_property, mt, problem_store, min_percent, min_count );
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
        if( salient_property.equal( cached_args.first() ) )
        {
          cached_args = cached_args.rest();
          if( mt.equal( cached_args.first() ) )
          {
            cached_args = cached_args.rest();
            if( problem_store.equal( cached_args.first() ) )
            {
              cached_args = cached_args.rest();
              if( min_percent.equal( cached_args.first() ) )
              {
                cached_args = cached_args.rest();
                if( NIL != cached_args && NIL == cached_args.rest() && min_count.equal( cached_args.first() ) )
                {
                  return memoization_state.caching_results( results2 );
                }
              }
            }
          }
        }
        cdolist_list_var = cdolist_list_var.rest();
        collision = cdolist_list_var.first();
      }
    }
    final SubLObject results3 = Values.arg2( thread.resetMultipleValues(), Values.multiple_value_list( rkf_sd_suppress_formula_threshold_for_property_internal( salient_property, mt, problem_store, min_percent,
        min_count ) ) );
    memoization_state.caching_state_enter_multi_key_n( caching_state, sxhash, collisions, results3, ConsesLow.list( salient_property, mt, problem_store, min_percent, min_count ) );
    return memoization_state.caching_results( results3 );
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-salient-descriptor-prompter.lisp", position = 53924L)
  public static SubLObject rkf_sd_suppress_formula_test_query(final SubLObject query_formula, final SubLObject mt, final SubLObject threshold)
  {
    return inference_kernel.new_cyc_query( query_formula, mt, ConsesLow.list( $kw83$MAX_NUMBER, threshold, $kw18$PROBLEM_STORE, rkf_salient_descriptor.rkf_sd_find_or_make_problem_store() ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-salient-descriptor-prompter.lisp", position = 54137L)
  public static SubLObject rkf_sd_prompter_ke_driven_inference_and_var(final SubLObject prompter, final SubLObject salience_pred)
  {
    final SubLObject seed_term = rkf_salient_descriptor_datastructures.rkf_sd_prompter_seed_term( prompter );
    final SubLObject mt = rkf_salient_descriptor_datastructures.rkf_sd_prompter_mt( prompter );
    final SubLObject cached_inferences = rkf_salient_descriptor_datastructures.rkf_salient_descriptor_prompter_lookup( prompter, $kw158$CACHED_INFERENCES, dictionary.new_dictionary( UNPROVIDED, UNPROVIDED ) );
    SubLObject inference_and_var = dictionary.dictionary_lookup( cached_inferences, salience_pred, $list159 );
    SubLObject current;
    final SubLObject datum = current = inference_and_var;
    SubLObject inference = NIL;
    SubLObject var = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list160 );
    inference = current.first();
    current = ( var = current.rest() );
    if( NIL == inference_datastructures_inference.valid_inference_p( inference ) )
    {
      final SubLObject formula_var = $sym161$_FORMULA;
      final SubLObject inference_$50 = rkf_salient_descriptor.rkf_salient_descriptor_formulas_inference( seed_term, formula_var, salience_pred, mt );
      inference_and_var = ConsesLow.cons( inference_$50, formula_var );
      dictionary.dictionary_enter( cached_inferences, salience_pred, inference_and_var );
    }
    return inference_and_var;
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-salient-descriptor-prompter.lisp", position = 54963L)
  public static SubLObject rkf_sd_prompter_analogize(final SubLObject prompter)
  {
    final SubLObject analogous_terms_results = rkf_sd_prompter_get_analogous_terms( prompter );
    while ( NIL == queues.queue_empty_p( analogous_terms_results ))
    {
      final SubLObject result = queues.queue_peek( analogous_terms_results );
      SubLObject current;
      final SubLObject datum = current = result;
      SubLObject v_bindings = NIL;
      SubLObject supports = NIL;
      cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list162 );
      v_bindings = current.first();
      current = current.rest();
      cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list162 );
      supports = current.first();
      current = current.rest();
      if( NIL == current )
      {
        final SubLObject source_term_var = $sym163$_SOURCE_TERM;
        final SubLObject source_term = bindings.variable_lookup( source_term_var, v_bindings );
        final SubLObject result_$51 = rkf_sd_prompter_add_analogy_prompt( prompter, source_term, supports );
        if( $kw19$DONE != result_$51 )
        {
          return result_$51;
        }
        queues.dequeue( analogous_terms_results );
      }
      else
      {
        cdestructuring_bind.cdestructuring_bind_error( datum, $list162 );
      }
    }
    rkf_sd_prompter_clear_analogous_terms( prompter );
    return $kw19$DONE;
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-salient-descriptor-prompter.lisp", position = 55656L)
  public static SubLObject rkf_sd_prompter_get_analogous_terms(final SubLObject prompter)
  {
    final SubLObject analogous_terms_field = $kw164$ANALOGOUS_TERMS;
    SubLObject analogous_terms = rkf_salient_descriptor_datastructures.rkf_salient_descriptor_prompter_lookup( prompter, analogous_terms_field, NIL );
    if( NIL == queues.queue_p( analogous_terms ) )
    {
      final SubLObject seed_term = rkf_salient_descriptor_datastructures.rkf_sd_prompter_seed_term( prompter );
      final SubLObject mt = rkf_salient_descriptor_datastructures.rkf_sd_prompter_mt( prompter );
      final SubLObject source_term_var = $sym163$_SOURCE_TERM;
      final SubLObject query_formula = el_utilities.make_binary_formula( $const165$similarTo, seed_term, source_term_var );
      final SubLObject query_results = rkf_query_utilities.rkf_ask( query_formula, mt, NIL, NIL, UNPROVIDED, UNPROVIDED );
      analogous_terms = queues.create_queue( UNPROVIDED );
      SubLObject cdolist_list_var = query_results;
      SubLObject result = NIL;
      result = cdolist_list_var.first();
      while ( NIL != cdolist_list_var)
      {
        queues.enqueue( result, analogous_terms );
        cdolist_list_var = cdolist_list_var.rest();
        result = cdolist_list_var.first();
      }
      rkf_salient_descriptor_datastructures.rkf_salient_descriptor_prompter_set( prompter, analogous_terms_field, analogous_terms );
    }
    return analogous_terms;
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-salient-descriptor-prompter.lisp", position = 56421L)
  public static SubLObject rkf_sd_prompter_clear_analogous_terms(final SubLObject prompter)
  {
    final SubLObject analogous_terms_field = $kw164$ANALOGOUS_TERMS;
    return rkf_salient_descriptor_datastructures.rkf_salient_descriptor_prompter_clear( prompter, analogous_terms_field );
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-salient-descriptor-prompter.lisp", position = 56621L)
  public static SubLObject rkf_sd_prompter_add_analogy_prompt(final SubLObject prompter, final SubLObject source_term, final SubLObject analogosity_supports)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject formulas = rkf_sd_prompter_get_analogy_suggestions( prompter, source_term );
    final SubLObject tactic = rkf_salient_descriptor_prompter_current_tactic( prompter );
    final SubLObject seed_term = rkf_salient_descriptor_datastructures.rkf_sd_prompter_seed_term( prompter );
    final SubLObject salient_property_sentence = el_utilities.make_binary_formula( $const165$similarTo, seed_term, source_term );
    while ( NIL == queues.queue_empty_p( formulas ))
    {
      final SubLObject ground_formula = queues.queue_peek( formulas );
      thread.resetMultipleValues();
      final SubLObject formula = rkf_sd_prompter_loosen_analogy_formula( seed_term, ground_formula );
      final SubLObject v_bindings = thread.secondMultipleValue();
      thread.resetMultipleValues();
      queues.dequeue( formulas );
      final SubLObject justifications = rkf_sd_analogy_justifications( prompter, source_term, ground_formula, formula );
      if( NIL != list_utilities.doubletonP( justifications ) )
      {
        SubLObject current;
        final SubLObject datum = current = justifications;
        SubLObject source_justification = NIL;
        SubLObject unknown_justification = NIL;
        cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list166 );
        source_justification = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list166 );
        unknown_justification = current.first();
        current = current.rest();
        if( NIL == current )
        {
          final SubLObject new_prompt = rkf_salient_descriptor_datastructures.new_rkf_sd_prompt();
          final SubLObject justification = ConsesLow.append( analogosity_supports, source_justification );
          rkf_salient_descriptor_datastructures.rkf_sd_prompt_set_formula( new_prompt, formula );
          rkf_salient_descriptor_datastructures.rkf_sd_prompt_set_tactic( new_prompt, tactic );
          rkf_salient_descriptor_datastructures.rkf_sd_prompt_set_justification( new_prompt, justification );
          rkf_salient_descriptor_datastructures.rkf_sd_prompt_set_salient_property_sentence( new_prompt, salient_property_sentence );
          rkf_sd_prompter_add_prompt( prompter, new_prompt );
          rkf_sd_prompt_add_analogy_examples( new_prompt, source_term, v_bindings, source_justification );
        }
        else
        {
          cdestructuring_bind.cdestructuring_bind_error( datum, $list166 );
        }
        if( NIL != queues.queue_empty_p( formulas ) )
        {
          rkf_sd_prompter_clear_analogy_suggestions( prompter );
          return $kw19$DONE;
        }
        return prompter;
      }
    }
    rkf_sd_prompter_clear_analogy_suggestions( prompter );
    return $kw19$DONE;
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-salient-descriptor-prompter.lisp", position = 58375L)
  public static SubLObject rkf_sd_prompt_add_analogy_examples(final SubLObject new_prompt, final SubLObject source_term, final SubLObject v_bindings, final SubLObject source_justification)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject _prev_bind_0 = rkf_salient_descriptor.$rkf_examples_to_show$.currentBinding( thread );
    try
    {
      rkf_salient_descriptor.$rkf_examples_to_show$.bind( number_utilities.maximum( ConsesLow.list( ZERO_INTEGER, number_utilities.f_1_( rkf_salient_descriptor.$rkf_examples_to_show$.getDynamicValue( thread ) ) ),
          UNPROVIDED ), thread );
      rkf_sd_prompt_compute_subprompts( new_prompt );
    }
    finally
    {
      rkf_salient_descriptor.$rkf_examples_to_show$.rebind( _prev_bind_0, thread );
    }
    final SubLObject subprompts = rkf_salient_descriptor_datastructures.rkf_sd_prompt_subprompts( new_prompt );
    if( NIL != rkf_salient_descriptor.rkf_salient_descriptor_subprompts_p( subprompts ) )
    {
      SubLObject cdolist_list_var = subprompts;
      SubLObject subprompt = NIL;
      subprompt = cdolist_list_var.first();
      while ( NIL != cdolist_list_var)
      {
        final SubLObject var = rkf_salient_descriptor.rkf_salient_descriptor_subprompt_var( subprompt );
        final SubLObject precedent = bindings.variable_lookup( var, v_bindings );
        if( NIL != precedent )
        {
          final SubLObject new_example = rkf_salient_descriptor_datastructures.new_rkf_sd_example( $kw167$PRECEDENT, precedent, source_justification, source_term );
          final SubLObject existing = rkf_salient_descriptor.rkf_salient_descriptor_subprompt_examples( subprompt );
          final SubLObject new_examples = ConsesLow.cons( new_example, existing );
          rkf_salient_descriptor.rkf_salient_descriptor_subprompt_set_examples( subprompt, new_examples );
        }
        cdolist_list_var = cdolist_list_var.rest();
        subprompt = cdolist_list_var.first();
      }
    }
    return new_prompt;
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-salient-descriptor-prompter.lisp", position = 59346L)
  public static SubLObject rkf_sd_prompter_loosen_analogy_formula(final SubLObject seed_term, final SubLObject ground_formula)
  {
    if( NIL != forts.fort_p( seed_term ) && NIL != el_utilities.el_formula_p( ground_formula ) )
    {
      SubLObject argnum = ZERO_INTEGER;
      SubLObject cdolist_list_var;
      final SubLObject args = cdolist_list_var = cycl_utilities.formula_args( ground_formula, $kw45$IGNORE );
      SubLObject arg = NIL;
      arg = cdolist_list_var.first();
      while ( NIL != cdolist_list_var)
      {
        argnum = Numbers.add( argnum, ONE_INTEGER );
        if( NIL == rkf_sd_prompter_uneditable_analogy_argP( arg, seed_term ) )
        {
          final SubLObject var = rkf_sd_prompter_analogy_var( ground_formula, argnum );
          final SubLObject loose = el_utilities.make_existential( var, el_utilities.replace_formula_arg( argnum, var, ground_formula ) );
          final SubLObject v_bindings = ConsesLow.list( bindings.make_variable_binding( var, arg ) );
          return Values.values( loose, v_bindings );
        }
        cdolist_list_var = cdolist_list_var.rest();
        arg = cdolist_list_var.first();
      }
    }
    return Values.values( ground_formula, NIL );
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-salient-descriptor-prompter.lisp", position = 59921L)
  public static SubLObject rkf_sd_prompter_uneditable_analogy_argP(final SubLObject arg, final SubLObject seed_term)
  {
    return makeBoolean( arg.eql( seed_term ) || NIL != isa.isaP( arg, $const168$Predicate, UNPROVIDED, UNPROVIDED ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-salient-descriptor-prompter.lisp", position = 60137L)
  public static SubLObject rkf_sd_prompter_analogy_var(final SubLObject ground_formula, final SubLObject argnum)
  {
    return $sym169$_X;
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-salient-descriptor-prompter.lisp", position = 60407L)
  public static SubLObject rkf_sd_prompter_get_analogy_suggestions(final SubLObject prompter, final SubLObject source_term)
  {
    final SubLObject analogy_suggestions_field = $kw170$ANALOGY_SUGGESTIONS;
    SubLObject suggestions = rkf_salient_descriptor_datastructures.rkf_salient_descriptor_prompter_lookup( prompter, analogy_suggestions_field, NIL );
    if( NIL == queues.queue_p( suggestions ) )
    {
      final SubLObject seed_term = rkf_salient_descriptor_datastructures.rkf_sd_prompter_seed_term( prompter );
      final SubLObject mt = rkf_salient_descriptor_datastructures.rkf_sd_prompter_mt( prompter );
      final SubLObject formulas = rkf_analogy_developer.rkf_analogous_formulas( seed_term, source_term, mt );
      suggestions = queues.create_queue( UNPROVIDED );
      SubLObject cdolist_list_var = formulas;
      SubLObject formula = NIL;
      formula = cdolist_list_var.first();
      while ( NIL != cdolist_list_var)
      {
        queues.enqueue( formula, suggestions );
        cdolist_list_var = cdolist_list_var.rest();
        formula = cdolist_list_var.first();
      }
      rkf_salient_descriptor_datastructures.rkf_salient_descriptor_prompter_set( prompter, analogy_suggestions_field, suggestions );
    }
    return suggestions;
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-salient-descriptor-prompter.lisp", position = 61067L)
  public static SubLObject rkf_sd_prompter_clear_analogy_suggestions(final SubLObject prompter)
  {
    final SubLObject analogy_suggestions_field = $kw170$ANALOGY_SUGGESTIONS;
    return rkf_salient_descriptor_datastructures.rkf_salient_descriptor_prompter_clear( prompter, analogy_suggestions_field );
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-salient-descriptor-prompter.lisp", position = 61284L)
  public static SubLObject rkf_sd_analogy_justifications(final SubLObject prompter, final SubLObject source_term, final SubLObject ground_formula, final SubLObject formula)
  {
    final SubLObject mt = rkf_salient_descriptor_datastructures.rkf_sd_prompter_mt( prompter );
    final SubLObject seed_term = rkf_salient_descriptor_datastructures.rkf_sd_prompter_seed_term( prompter );
    final SubLObject source_formula = cycl_utilities.expression_subst( source_term, seed_term, ground_formula, UNPROVIDED, UNPROVIDED );
    final SubLObject source_formula_justification = rkf_query_utilities.rkf_justify( source_formula, mt ).first();
    if( NIL != arguments.supports_p( source_formula_justification ) )
    {
      final SubLObject unknown_formula = rkf_salient_descriptor.rkf_sd_conjoin( ConsesLow.list( el_utilities.make_unary_formula( $const171$unknownSentence, formula ), el_utilities.make_unary_formula(
          $const171$unknownSentence, el_utilities.make_negation( formula ) ) ), NIL, NIL );
      final SubLObject unknown_justification = rkf_query_utilities.rkf_justify( unknown_formula, mt ).first();
      return ( NIL != arguments.supports_p( unknown_justification ) ) ? ConsesLow.list( source_formula_justification, unknown_justification ) : NIL;
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-salient-descriptor-prompter.lisp", position = 62075L)
  public static SubLObject rkf_sd_prompter_rules_for_term(final SubLObject prompter)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject seed_term = rkf_salient_descriptor_datastructures.rkf_sd_prompter_seed_term( prompter );
    final SubLObject mt = rkf_salient_descriptor_datastructures.rkf_sd_prompter_mt( prompter );
    final SubLObject allowedP = rkf_salient_descriptor_datastructures.rkf_salient_descriptor_prompter_lookup( prompter, $kw172$USE_RULES_, $kw173$FALSE );
    SubLObject rule_table = ( NIL != allowedP ) ? rkf_salient_descriptor_datastructures.rkf_salient_descriptor_prompter_lookup( prompter, $kw174$RULE_TABLE, $kw57$UNKNOWN ) : NIL;
    if( allowedP != $kw175$TRUE )
    {
      return $kw19$DONE;
    }
    if( $kw57$UNKNOWN == rule_table )
    {
      rule_table = rkf_sd_prompter_rule_table( seed_term, mt );
      rkf_salient_descriptor_datastructures.rkf_salient_descriptor_prompter_set( prompter, $kw174$RULE_TABLE, rule_table );
    }
    SubLObject cnfs = NIL;
    SubLObject gaf = NIL;
    SubLObject gaf_lit = NIL;
    SubLObject v_bindings = NIL;
    SubLObject rule = NIL;
    SubLObject doneP = NIL;
    final SubLObject unbound_var_max = ONE_INTEGER;
    final SubLObject local_state;
    final SubLObject state = local_state = rkf_salient_descriptor_datastructures.rkf_salient_descriptor_prompter_lookup( prompter, $kw20$MEMOIZATION_STATE, memoization_state.current_memoization_state() );
    final SubLObject _prev_bind_0 = memoization_state.$memoization_state$.currentBinding( thread );
    try
    {
      memoization_state.$memoization_state$.bind( local_state, thread );
      final SubLObject original_memoization_process = memoization_state.memoization_state_original_process( local_state );
      try
      {
        final SubLObject _prev_bind_0_$52 = rkf_salient_descriptor.$rkf_sd_problem_store$.currentBinding( thread );
        try
        {
          rkf_salient_descriptor.$rkf_sd_problem_store$.bind( rkf_sd_prompter_find_or_set_problem_store( prompter ), thread );
          final SubLObject reuse_existingP = rkf_salient_descriptor.rkf_sd_problem_store_okP( rkf_salient_descriptor.$rkf_sd_problem_store$.getDynamicValue( thread ) );
          final SubLObject _prev_bind_0_$53 = rkf_salient_descriptor.$rkf_sd_problem_store$.currentBinding( thread );
          try
          {
            rkf_salient_descriptor.$rkf_sd_problem_store$.bind( rkf_salient_descriptor.rkf_sd_find_or_make_problem_store(), thread );
            final SubLObject store = rkf_salient_descriptor.$rkf_sd_problem_store$.getDynamicValue( thread );
            try
            {
              while ( NIL == cnfs && NIL == doneP)
              {
                final SubLObject rule_info = rkf_sd_prompter_rule_table_pop( rule_table );
                if( NIL != rule_info )
                {
                  final SubLObject datum_evaluated_var = list_utilities.first_n( FOUR_INTEGER, rule_info );
                  gaf = datum_evaluated_var.first();
                  gaf_lit = conses_high.cadr( datum_evaluated_var );
                  rule = conses_high.cddr( datum_evaluated_var ).first();
                  v_bindings = conses_high.cadr( conses_high.cddr( datum_evaluated_var ) );
                  cnfs = inference_utilities.unsatisfied_cnfs_for_rule( rule, v_bindings, unbound_var_max, mt, rkf_salient_descriptor.$rkf_sd_problem_store$.getDynamicValue( thread ) );
                }
                else
                {
                  doneP = T;
                }
              }
            }
            finally
            {
              final SubLObject _prev_bind_0_$54 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
              try
              {
                Threads.$is_thread_performing_cleanupP$.bind( T, thread );
                final SubLObject _values = Values.getValuesAsVector();
                if( NIL == reuse_existingP )
                {
                  rkf_salient_descriptor.rkf_sd_free_problem_store( store );
                }
                Values.restoreValuesFromVector( _values );
              }
              finally
              {
                Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$54, thread );
              }
            }
          }
          finally
          {
            rkf_salient_descriptor.$rkf_sd_problem_store$.rebind( _prev_bind_0_$53, thread );
          }
        }
        finally
        {
          rkf_salient_descriptor.$rkf_sd_problem_store$.rebind( _prev_bind_0_$52, thread );
        }
      }
      finally
      {
        final SubLObject _prev_bind_0_$55 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values2 = Values.getValuesAsVector();
          memoization_state.memoization_state_possibly_clear_original_process( local_state, original_memoization_process );
          Values.restoreValuesFromVector( _values2 );
        }
        finally
        {
          Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$55, thread );
        }
      }
    }
    finally
    {
      memoization_state.$memoization_state$.rebind( _prev_bind_0, thread );
    }
    if( NIL == cnfs )
    {
      return $kw19$DONE;
    }
    SubLObject cdolist_list_var = cnfs;
    SubLObject cnf = NIL;
    cnf = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      final SubLObject set_var = rkf_salient_descriptor_datastructures.rkf_sd_prompter_unused_prompts( prompter );
      final SubLObject set_contents_var = set.do_set_internal( set_var );
      SubLObject basis_object;
      SubLObject state_$56;
      SubLObject prompt;
      SubLObject subprompts;
      SubLObject new_cnf;
      SubLObject item_var;
      for( basis_object = set_contents.do_set_contents_basis_object( set_contents_var ), state_$56 = NIL, state_$56 = set_contents.do_set_contents_initial_state( basis_object, set_contents_var ); NIL == set_contents
          .do_set_contents_doneP( basis_object, state_$56 ); state_$56 = set_contents.do_set_contents_update_state( state_$56 ) )
      {
        prompt = set_contents.do_set_contents_next( basis_object, state_$56 );
        if( NIL != set_contents.do_set_contents_element_validP( state_$56, prompt ) )
        {
          subprompts = rkf_salient_descriptor_datastructures.rkf_sd_prompt_subprompts( prompt );
          if( NIL == rkf_salient_descriptor_datastructures.rkf_sd_prompt_deducible_cnfs( prompt ) && NIL != rkf_salient_descriptor.rkf_salient_descriptor_subprompts_p( subprompts ) )
          {
            new_cnf = rkf_sd_subprompts_matches_cnfP( subprompts, cnf );
            if( NIL != new_cnf )
            {
              item_var = new_cnf;
              if( NIL == conses_high.member( item_var, rkf_salient_descriptor_datastructures.rkf_sd_prompt_deducible_cnfs( prompt ), $sym176$EL_EXPRESSION_EQUAL_, Symbols.symbol_function( IDENTITY ) ) )
              {
                rkf_salient_descriptor_datastructures._csetf_rkf_sd_prompt_deducible_cnfs( prompt, ConsesLow.cons( item_var, rkf_salient_descriptor_datastructures.rkf_sd_prompt_deducible_cnfs( prompt ) ) );
              }
            }
          }
        }
      }
      final SubLObject prompt2 = rkf_sd_prompt_from_cnf( cnf, seed_term );
      final SubLObject justification = Sequences.nreverse( ConsesLow.cons( rule, rkf_sd_prompt_justification_from_sentence( gaf_lit, assertions_high.assertion_mt( gaf ) ) ) );
      rkf_salient_descriptor_datastructures.rkf_sd_prompt_set_justification( prompt2, justification );
      rkf_salient_descriptor_datastructures.rkf_sd_prompt_set_tactic( prompt2, $sym177$RKF_SD_PROMPTER_RULES_FOR_TERM );
      rkf_sd_prompter_add_prompt( prompter, prompt2 );
      rkf_sd_prompt_compute_subprompts( prompt2 );
      cdolist_list_var = cdolist_list_var.rest();
      cnf = cdolist_list_var.first();
    }
    return prompter;
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-salient-descriptor-prompter.lisp", position = 64369L)
  public static SubLObject rkf_sd_prompter_rule_table_pop(final SubLObject rule_table)
  {
    final SubLObject top = queues.queue_peek( rule_table );
    queues.dequeue( rule_table );
    return top;
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-salient-descriptor-prompter.lisp", position = 64673L)
  public static SubLObject rkf_sd_prompter_rule_table(final SubLObject seed_term, final SubLObject mt)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject items = NIL;
    SubLObject done_isas = NIL;
    SubLObject done_genls = NIL;
    final SubLObject _prev_bind_0 = $rkf_sd_seed_term$.currentBinding( thread );
    try
    {
      $rkf_sd_seed_term$.bind( seed_term, thread );
      final SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate( mt );
      final SubLObject _prev_bind_0_$57 = mt_relevance_macros.$mt$.currentBinding( thread );
      final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding( thread );
      final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding( thread );
      try
      {
        mt_relevance_macros.$mt$.bind( mt_relevance_macros.update_inference_mt_relevance_mt( mt_var ), thread );
        mt_relevance_macros.$relevant_mt_function$.bind( mt_relevance_macros.update_inference_mt_relevance_function( mt_var ), thread );
        mt_relevance_macros.$relevant_mts$.bind( mt_relevance_macros.update_inference_mt_relevance_mt_list( mt_var ), thread );
        final SubLObject local_state;
        final SubLObject state = local_state = memoization_state.possibly_new_memoization_state();
        final SubLObject _prev_bind_0_$58 = memoization_state.$memoization_state$.currentBinding( thread );
        try
        {
          memoization_state.$memoization_state$.bind( local_state, thread );
          final SubLObject original_memoization_process = memoization_state.memoization_state_original_process( local_state );
          try
          {
            final SubLObject already_resourcing_p = sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.getDynamicValue( thread );
            final SubLObject _prev_bind_0_$59 = sbhl_marking_vars.$resourced_sbhl_marking_space_limit$.currentBinding( thread );
            final SubLObject _prev_bind_1_$60 = sbhl_marking_vars.$resourced_sbhl_marking_spaces$.currentBinding( thread );
            final SubLObject _prev_bind_2_$61 = sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.currentBinding( thread );
            try
            {
              sbhl_marking_vars.$resourced_sbhl_marking_space_limit$.bind( sbhl_marking_vars.determine_resource_limit( already_resourcing_p, SIX_INTEGER ), thread );
              sbhl_marking_vars.$resourced_sbhl_marking_spaces$.bind( sbhl_marking_vars.possibly_new_marking_resource( already_resourcing_p ), thread );
              sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.bind( T, thread );
              final SubLObject pred_var = NIL;
              if( NIL != kb_mapping_macros.do_gaf_arg_index_key_validator( seed_term, ONE_INTEGER, pred_var ) )
              {
                final SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator( seed_term, ONE_INTEGER, pred_var );
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
                      final_index_iterator = kb_mapping_macros.new_final_index_iterator( final_index_spec, $kw58$GAF, NIL, NIL );
                      SubLObject done_var_$62 = NIL;
                      final SubLObject token_var_$63 = NIL;
                      while ( NIL == done_var_$62)
                      {
                        final SubLObject gaf = iteration.iteration_next_without_values_macro_helper( final_index_iterator, token_var_$63 );
                        final SubLObject valid_$64 = makeBoolean( !token_var_$63.eql( gaf ) );
                        if( NIL != valid_$64 && NIL != rkf_sd_gaf_okP( gaf ) && NIL == rkf_argument_communicator.rkf_irrelevant_support_p( gaf ) )
                        {
                          final SubLObject rule_sense = ( $kw175$TRUE == assertions_high.assertion_truth( gaf ) ) ? $kw178$NEG : $kw179$POS;
                          final SubLObject pcase_var;
                          final SubLObject pred = pcase_var = assertions_high.gaf_arg0( gaf );
                          if( pcase_var.eql( $const92$isa ) )
                          {
                            final SubLObject col = assertions_high.gaf_arg2( gaf );
                            thread.resetMultipleValues();
                            final SubLObject new_items = rkf_sd_get_isa_rules( seed_term, gaf, col, done_isas, mt );
                            final SubLObject new_done_isas = thread.secondMultipleValue();
                            thread.resetMultipleValues();
                            done_isas = new_done_isas;
                            items = conses_high.union( items, new_items, Symbols.symbol_function( $sym180$RKF_SD_RULE_TUPLE__ ), UNPROVIDED );
                          }
                          else if( pcase_var.eql( $const116$genls ) )
                          {
                            final SubLObject col = assertions_high.gaf_arg2( gaf );
                            thread.resetMultipleValues();
                            final SubLObject new_items = rkf_sd_get_genls_rules( seed_term, gaf, col, done_genls, mt );
                            final SubLObject new_done_genls = thread.secondMultipleValue();
                            thread.resetMultipleValues();
                            done_genls = new_done_genls;
                            items = conses_high.union( items, new_items, Symbols.symbol_function( $sym180$RKF_SD_RULE_TUPLE__ ), UNPROVIDED );
                          }
                          else
                          {
                            final SubLObject new_items2 = rkf_sd_get_other_rules( pred, rule_sense, gaf, mt );
                            items = conses_high.union( items, new_items2, Symbols.symbol_function( $sym180$RKF_SD_RULE_TUPLE__ ), UNPROVIDED );
                          }
                        }
                        done_var_$62 = makeBoolean( NIL == valid_$64 );
                      }
                    }
                    finally
                    {
                      final SubLObject _prev_bind_0_$60 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
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
                        Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$60, thread );
                      }
                    }
                  }
                  done_var = makeBoolean( NIL == valid );
                }
              }
            }
            finally
            {
              sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.rebind( _prev_bind_2_$61, thread );
              sbhl_marking_vars.$resourced_sbhl_marking_spaces$.rebind( _prev_bind_1_$60, thread );
              sbhl_marking_vars.$resourced_sbhl_marking_space_limit$.rebind( _prev_bind_0_$59, thread );
            }
          }
          finally
          {
            final SubLObject _prev_bind_0_$61 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
            try
            {
              Threads.$is_thread_performing_cleanupP$.bind( T, thread );
              final SubLObject _values2 = Values.getValuesAsVector();
              memoization_state.memoization_state_possibly_clear_original_process( local_state, original_memoization_process );
              Values.restoreValuesFromVector( _values2 );
            }
            finally
            {
              Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$61, thread );
            }
          }
        }
        finally
        {
          memoization_state.$memoization_state$.rebind( _prev_bind_0_$58, thread );
        }
      }
      finally
      {
        mt_relevance_macros.$relevant_mts$.rebind( _prev_bind_3, thread );
        mt_relevance_macros.$relevant_mt_function$.rebind( _prev_bind_2, thread );
        mt_relevance_macros.$mt$.rebind( _prev_bind_0_$57, thread );
      }
      items = rkf_sd_score_rule_tuples( items );
      items = rkf_sd_remove_low_scoring_tuples( items );
      items = rkf_sd_sort_rule_tuples( items );
    }
    finally
    {
      $rkf_sd_seed_term$.rebind( _prev_bind_0, thread );
    }
    final SubLObject table = queues.create_queue( UNPROVIDED );
    SubLObject cdolist_list_var = items;
    SubLObject item = NIL;
    item = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      queues.enqueue( item, table );
      cdolist_list_var = cdolist_list_var.rest();
      item = cdolist_list_var.first();
    }
    return table;
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-salient-descriptor-prompter.lisp", position = 66186L)
  public static SubLObject rkf_sd_sort_rule_tuples(final SubLObject rule_tuples)
  {
    return Sort.sort( rule_tuples, $sym181$RKF_SD_PREFER_RULE_TUPLE_, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-salient-descriptor-prompter.lisp", position = 66296L)
  public static SubLObject rkf_sd_remove_low_scoring_tuples(final SubLObject rule_tuples)
  {
    return Sequences.remove_if( $sym182$RKF_SD_LOW_SCORING_TUPLE_P, rule_tuples, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-salient-descriptor-prompter.lisp", position = 66421L)
  public static SubLObject rkf_sd_low_scoring_tuple_p(final SubLObject rule_tuple)
  {
    final SubLObject score = conses_high.fifth( rule_tuple );
    SubLObject badP = NIL;
    if( NIL == rkf_salient_descriptor_datastructures.rkf_sd_rule_info_score_seed_term_in_pos_litsP( score ) )
    {
      badP = T;
    }
    return badP;
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-salient-descriptor-prompter.lisp", position = 66719L)
  public static SubLObject rkf_sd_score_rule_tuples(final SubLObject rule_tuples)
  {
    return Mapping.mapcar( $sym183$RKF_SD_SCORE_RULE_TUPLE, rule_tuples );
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-salient-descriptor-prompter.lisp", position = 66830L)
  public static SubLObject rkf_sd_get_other_rules(final SubLObject pred, final SubLObject sense, final SubLObject gaf, final SubLObject mt)
  {
    SubLObject new_items = NIL;
    final SubLObject cutoff = TEN_INTEGER;
    final SubLObject strictP = Numbers.numG( kb_indexing.num_predicate_rule_index( pred, $kw178$NEG, UNPROVIDED, UNPROVIDED ), cutoff );
    if( NIL != kb_mapping_macros.do_predicate_rule_index_key_validator( pred, sense, NIL ) )
    {
      final SubLObject iterator_var = kb_mapping_macros.new_predicate_rule_final_index_spec_iterator( pred, sense, NIL );
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
            final_index_iterator = kb_mapping_macros.new_final_index_iterator( final_index_spec, $kw59$RULE, NIL, NIL );
            SubLObject done_var_$67 = NIL;
            final SubLObject token_var_$68 = NIL;
            while ( NIL == done_var_$67)
            {
              final SubLObject rule = iteration.iteration_next_without_values_macro_helper( final_index_iterator, token_var_$68 );
              final SubLObject valid_$69 = makeBoolean( !token_var_$68.eql( rule ) );
              if( NIL != valid_$69 )
              {
                final SubLObject v_bindings = rkf_sd_gaf_rule_bindings( gaf, rule, sense, strictP );
                if( NIL != v_bindings && NIL == rkf_salient_descriptor.rkf_bad_sd_ruleP( rule, mt ) )
                {
                  final SubLObject item_var = ConsesLow.list( gaf, assertions_high.gaf_formula( gaf ), rule, v_bindings );
                  if( NIL == conses_high.member( item_var, new_items, $sym180$RKF_SD_RULE_TUPLE__, Symbols.symbol_function( IDENTITY ) ) )
                  {
                    new_items = ConsesLow.cons( item_var, new_items );
                  }
                }
              }
              done_var_$67 = makeBoolean( NIL == valid_$69 );
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
    return new_items;
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-salient-descriptor-prompter.lisp", position = 67290L)
  public static SubLObject rkf_sd_get_isa_rules(final SubLObject seed_term, final SubLObject gaf, final SubLObject col, SubLObject done_genls, final SubLObject mt)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject rule_sense = ( $kw175$TRUE == assertions_high.assertion_truth( gaf ) ) ? $kw178$NEG : $kw179$POS;
    SubLObject new_items = NIL;
    final SubLObject local_state;
    final SubLObject state = local_state = memoization_state.possibly_new_memoization_state();
    final SubLObject _prev_bind_0 = memoization_state.$memoization_state$.currentBinding( thread );
    try
    {
      memoization_state.$memoization_state$.bind( local_state, thread );
      final SubLObject original_memoization_process = memoization_state.memoization_state_original_process( local_state );
      try
      {
        final SubLObject already_resourcing_p = sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.getDynamicValue( thread );
        final SubLObject _prev_bind_0_$70 = sbhl_marking_vars.$resourced_sbhl_marking_space_limit$.currentBinding( thread );
        final SubLObject _prev_bind_2 = sbhl_marking_vars.$resourced_sbhl_marking_spaces$.currentBinding( thread );
        final SubLObject _prev_bind_3 = sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.currentBinding( thread );
        try
        {
          sbhl_marking_vars.$resourced_sbhl_marking_space_limit$.bind( sbhl_marking_vars.determine_resource_limit( already_resourcing_p, SIX_INTEGER ), thread );
          sbhl_marking_vars.$resourced_sbhl_marking_spaces$.bind( sbhl_marking_vars.possibly_new_marking_resource( already_resourcing_p ), thread );
          sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.bind( T, thread );
          SubLObject node_var = col;
          final SubLObject deck_type = $kw106$STACK;
          final SubLObject recur_deck = deck.create_deck( deck_type );
          final SubLObject _prev_bind_0_$71 = sbhl_marking_vars.$sbhl_space$.currentBinding( thread );
          try
          {
            sbhl_marking_vars.$sbhl_space$.bind( sbhl_marking_vars.get_sbhl_marking_space(), thread );
            try
            {
              final SubLObject tv_var = NIL;
              final SubLObject _prev_bind_0_$72 = sbhl_search_vars.$sbhl_tv$.currentBinding( thread );
              final SubLObject _prev_bind_1_$73 = sbhl_search_vars.$relevant_sbhl_tv_function$.currentBinding( thread );
              try
              {
                sbhl_search_vars.$sbhl_tv$.bind( ( NIL != tv_var ) ? tv_var : sbhl_search_vars.get_sbhl_true_tv(), thread );
                sbhl_search_vars.$relevant_sbhl_tv_function$.bind( ( NIL != tv_var ) ? $sym108$RELEVANT_SBHL_TV_IS_GENERAL_TV : sbhl_search_vars.$relevant_sbhl_tv_function$.getDynamicValue( thread ), thread );
                if( NIL != tv_var && NIL != sbhl_paranoia.sbhl_object_type_checking_p() && NIL == sbhl_search_vars.sbhl_true_tv_p( tv_var ) )
                {
                  final SubLObject pcase_var = sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue( thread );
                  if( pcase_var.eql( $kw109$ERROR ) )
                  {
                    sbhl_paranoia.sbhl_error( ONE_INTEGER, $str110$_A_is_not_a__A, tv_var, $sym111$SBHL_TRUE_TV_P, UNPROVIDED, UNPROVIDED, UNPROVIDED );
                  }
                  else if( pcase_var.eql( $kw112$CERROR ) )
                  {
                    sbhl_paranoia.sbhl_cerror( ONE_INTEGER, $str113$continue_anyway, $str110$_A_is_not_a__A, tv_var, $sym111$SBHL_TRUE_TV_P, UNPROVIDED, UNPROVIDED, UNPROVIDED );
                  }
                  else if( pcase_var.eql( $kw114$WARN ) )
                  {
                    Errors.warn( $str110$_A_is_not_a__A, tv_var, $sym111$SBHL_TRUE_TV_P );
                  }
                  else
                  {
                    Errors.warn( $str115$_A_is_not_a_valid__sbhl_type_erro, sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue( thread ) );
                    Errors.cerror( $str113$continue_anyway, $str110$_A_is_not_a__A, tv_var, $sym111$SBHL_TRUE_TV_P );
                  }
                }
                final SubLObject _prev_bind_0_$73 = sbhl_search_vars.$sbhl_search_module$.currentBinding( thread );
                final SubLObject _prev_bind_1_$74 = sbhl_search_vars.$sbhl_search_module_type$.currentBinding( thread );
                final SubLObject _prev_bind_2_$76 = sbhl_search_vars.$sbhl_add_node_to_result_test$.currentBinding( thread );
                final SubLObject _prev_bind_4 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding( thread );
                final SubLObject _prev_bind_5 = sbhl_module_vars.$sbhl_module$.currentBinding( thread );
                try
                {
                  sbhl_search_vars.$sbhl_search_module$.bind( sbhl_module_vars.get_sbhl_module( $const116$genls ), thread );
                  sbhl_search_vars.$sbhl_search_module_type$.bind( sbhl_module_utilities.get_sbhl_module_type( sbhl_module_vars.get_sbhl_module( $const116$genls ) ), thread );
                  sbhl_search_vars.$sbhl_add_node_to_result_test$.bind( sbhl_module_utilities.get_sbhl_add_node_to_result_test( sbhl_module_vars.get_sbhl_module( $const116$genls ) ), thread );
                  sbhl_search_vars.$genl_inverse_mode_p$.bind( NIL, thread );
                  sbhl_module_vars.$sbhl_module$.bind( sbhl_module_vars.get_sbhl_module( $const116$genls ), thread );
                  if( NIL != sbhl_paranoia.suspend_sbhl_type_checkingP() || NIL != sbhl_module_utilities.apply_sbhl_module_type_test( col, sbhl_module_vars.get_sbhl_module( UNPROVIDED ) ) )
                  {
                    final SubLObject _prev_bind_0_$74 = sbhl_search_vars.$sbhl_search_direction$.currentBinding( thread );
                    final SubLObject _prev_bind_1_$75 = sbhl_link_vars.$sbhl_link_direction$.currentBinding( thread );
                    final SubLObject _prev_bind_2_$77 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding( thread );
                    try
                    {
                      sbhl_search_vars.$sbhl_search_direction$.bind( sbhl_search_vars.get_sbhl_forward_search_direction(), thread );
                      sbhl_link_vars.$sbhl_link_direction$.bind( sbhl_module_utilities.sbhl_search_direction_to_link_direction( sbhl_search_vars.get_sbhl_forward_search_direction(), sbhl_module_vars.get_sbhl_module(
                          $const116$genls ) ), thread );
                      sbhl_search_vars.$genl_inverse_mode_p$.bind( NIL, thread );
                      sbhl_marking_utilities.sbhl_mark_node_marked( node_var, UNPROVIDED );
                      while ( NIL != node_var)
                      {
                        final SubLObject genl = node_var;
                        if( NIL == conses_high.member( genl, done_genls, UNPROVIDED, UNPROVIDED ) )
                        {
                          if( NIL != rkf_sd_term_too_generalP( genl ) )
                          {
                            done_genls = ConsesLow.cons( genl, done_genls );
                          }
                          else
                          {
                            final SubLObject gaf_lit = el_utilities.make_binary_formula( $const92$isa, seed_term, genl );
                            final SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate( mt );
                            final SubLObject _prev_bind_0_$75 = mt_relevance_macros.$mt$.currentBinding( thread );
                            final SubLObject _prev_bind_1_$76 = mt_relevance_macros.$relevant_mt_function$.currentBinding( thread );
                            final SubLObject _prev_bind_2_$78 = mt_relevance_macros.$relevant_mts$.currentBinding( thread );
                            try
                            {
                              mt_relevance_macros.$mt$.bind( mt_relevance_macros.update_inference_mt_relevance_mt( mt_var ), thread );
                              mt_relevance_macros.$relevant_mt_function$.bind( mt_relevance_macros.update_inference_mt_relevance_function( mt_var ), thread );
                              mt_relevance_macros.$relevant_mts$.bind( mt_relevance_macros.update_inference_mt_relevance_mt_list( mt_var ), thread );
                              if( NIL != kb_mapping_macros.do_isa_rule_index_key_validator( genl, rule_sense, NIL ) )
                              {
                                final SubLObject iterator_var = kb_mapping_macros.new_isa_rule_final_index_spec_iterator( genl, rule_sense, NIL );
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
                                      final_index_iterator = kb_mapping_macros.new_final_index_iterator( final_index_spec, $kw59$RULE, NIL, NIL );
                                      SubLObject done_var_$83 = NIL;
                                      final SubLObject token_var_$84 = NIL;
                                      while ( NIL == done_var_$83)
                                      {
                                        final SubLObject rule = iteration.iteration_next_without_values_macro_helper( final_index_iterator, token_var_$84 );
                                        final SubLObject valid_$85 = makeBoolean( !token_var_$84.eql( rule ) );
                                        if( NIL != valid_$85 )
                                        {
                                          final SubLObject v_bindings = rkf_sd_gaf_lit_rule_bindings( gaf_lit, rule, rule_sense, UNPROVIDED );
                                          if( NIL != v_bindings && NIL == rkf_salient_descriptor.rkf_bad_sd_ruleP( rule, mt ) )
                                          {
                                            final SubLObject item_var = ConsesLow.list( gaf, gaf_lit, rule, v_bindings );
                                            if( NIL == conses_high.member( item_var, new_items, $sym180$RKF_SD_RULE_TUPLE__, Symbols.symbol_function( IDENTITY ) ) )
                                            {
                                              new_items = ConsesLow.cons( item_var, new_items );
                                            }
                                          }
                                        }
                                        done_var_$83 = makeBoolean( NIL == valid_$85 );
                                      }
                                    }
                                    finally
                                    {
                                      final SubLObject _prev_bind_0_$76 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
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
                                        Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$76, thread );
                                      }
                                    }
                                  }
                                  done_var = makeBoolean( NIL == valid );
                                }
                              }
                            }
                            finally
                            {
                              mt_relevance_macros.$relevant_mts$.rebind( _prev_bind_2_$78, thread );
                              mt_relevance_macros.$relevant_mt_function$.rebind( _prev_bind_1_$76, thread );
                              mt_relevance_macros.$mt$.rebind( _prev_bind_0_$75, thread );
                            }
                            done_genls = ConsesLow.cons( genl, done_genls );
                          }
                        }
                        SubLObject cdolist_list_var;
                        final SubLObject accessible_modules = cdolist_list_var = sbhl_macros.get_sbhl_accessible_modules( sbhl_module_vars.get_sbhl_module( $const116$genls ) );
                        SubLObject module_var = NIL;
                        module_var = cdolist_list_var.first();
                        while ( NIL != cdolist_list_var)
                        {
                          final SubLObject _prev_bind_0_$77 = sbhl_module_vars.$sbhl_module$.currentBinding( thread );
                          final SubLObject _prev_bind_1_$77 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding( thread );
                          try
                          {
                            sbhl_module_vars.$sbhl_module$.bind( module_var, thread );
                            sbhl_search_vars.$genl_inverse_mode_p$.bind( ( NIL != sbhl_search_vars.flip_genl_inverse_modeP( UNPROVIDED, UNPROVIDED ) ) ? makeBoolean( NIL == sbhl_search_vars.$genl_inverse_mode_p$
                                .getDynamicValue( thread ) ) : sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue( thread ), thread );
                            final SubLObject node = function_terms.naut_to_nart( node_var );
                            if( NIL != sbhl_link_vars.sbhl_node_object_p( node ) )
                            {
                              final SubLObject d_link = sbhl_graphs.get_sbhl_graph_link( node, sbhl_module_vars.get_sbhl_module( UNPROVIDED ) );
                              if( NIL != d_link )
                              {
                                final SubLObject mt_links = sbhl_links.get_sbhl_mt_links( d_link, sbhl_link_vars.get_sbhl_link_direction(), sbhl_module_vars.get_sbhl_module( UNPROVIDED ) );
                                if( NIL != mt_links )
                                {
                                  SubLObject iteration_state;
                                  for( iteration_state = dictionary_contents.do_dictionary_contents_state( dictionary.dictionary_contents( mt_links ) ); NIL == dictionary_contents.do_dictionary_contents_doneP(
                                      iteration_state ); iteration_state = dictionary_contents.do_dictionary_contents_next( iteration_state ) )
                                  {
                                    thread.resetMultipleValues();
                                    final SubLObject mt_$89 = dictionary_contents.do_dictionary_contents_key_value( iteration_state );
                                    final SubLObject tv_links = thread.secondMultipleValue();
                                    thread.resetMultipleValues();
                                    if( NIL != mt_relevance_macros.relevant_mtP( mt_$89 ) )
                                    {
                                      final SubLObject _prev_bind_0_$78 = sbhl_link_vars.$sbhl_link_mt$.currentBinding( thread );
                                      try
                                      {
                                        sbhl_link_vars.$sbhl_link_mt$.bind( mt_$89, thread );
                                        SubLObject iteration_state_$91;
                                        for( iteration_state_$91 = dictionary_contents.do_dictionary_contents_state( dictionary.dictionary_contents( tv_links ) ); NIL == dictionary_contents.do_dictionary_contents_doneP(
                                            iteration_state_$91 ); iteration_state_$91 = dictionary_contents.do_dictionary_contents_next( iteration_state_$91 ) )
                                        {
                                          thread.resetMultipleValues();
                                          final SubLObject tv = dictionary_contents.do_dictionary_contents_key_value( iteration_state_$91 );
                                          final SubLObject link_nodes = thread.secondMultipleValue();
                                          thread.resetMultipleValues();
                                          if( NIL != sbhl_search_vars.relevant_sbhl_tvP( tv ) )
                                          {
                                            final SubLObject _prev_bind_0_$79 = sbhl_link_vars.$sbhl_link_tv$.currentBinding( thread );
                                            try
                                            {
                                              sbhl_link_vars.$sbhl_link_tv$.bind( tv, thread );
                                              final SubLObject sol = link_nodes;
                                              if( NIL != set.set_p( sol ) )
                                              {
                                                final SubLObject set_contents_var = set.do_set_internal( sol );
                                                SubLObject basis_object;
                                                SubLObject state_$93;
                                                SubLObject node_vars_link_node;
                                                for( basis_object = set_contents.do_set_contents_basis_object( set_contents_var ), state_$93 = NIL, state_$93 = set_contents.do_set_contents_initial_state( basis_object,
                                                    set_contents_var ); NIL == set_contents.do_set_contents_doneP( basis_object, state_$93 ); state_$93 = set_contents.do_set_contents_update_state( state_$93 ) )
                                                {
                                                  node_vars_link_node = set_contents.do_set_contents_next( basis_object, state_$93 );
                                                  if( NIL != set_contents.do_set_contents_element_validP( state_$93, node_vars_link_node ) && NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(
                                                      node_vars_link_node, UNPROVIDED ) )
                                                  {
                                                    sbhl_marking_utilities.sbhl_mark_node_marked( node_vars_link_node, UNPROVIDED );
                                                    deck.deck_push( node_vars_link_node, recur_deck );
                                                  }
                                                }
                                              }
                                              else if( sol.isList() )
                                              {
                                                SubLObject csome_list_var = sol;
                                                SubLObject node_vars_link_node2 = NIL;
                                                node_vars_link_node2 = csome_list_var.first();
                                                while ( NIL != csome_list_var)
                                                {
                                                  if( NIL == sbhl_marking_utilities.sbhl_search_path_termination_p( node_vars_link_node2, UNPROVIDED ) )
                                                  {
                                                    sbhl_marking_utilities.sbhl_mark_node_marked( node_vars_link_node2, UNPROVIDED );
                                                    deck.deck_push( node_vars_link_node2, recur_deck );
                                                  }
                                                  csome_list_var = csome_list_var.rest();
                                                  node_vars_link_node2 = csome_list_var.first();
                                                }
                                              }
                                              else
                                              {
                                                Errors.error( $str118$_A_is_neither_SET_P_nor_LISTP_, sol );
                                              }
                                            }
                                            finally
                                            {
                                              sbhl_link_vars.$sbhl_link_tv$.rebind( _prev_bind_0_$79, thread );
                                            }
                                          }
                                        }
                                        dictionary_contents.do_dictionary_contents_finalize( iteration_state_$91 );
                                      }
                                      finally
                                      {
                                        sbhl_link_vars.$sbhl_link_mt$.rebind( _prev_bind_0_$78, thread );
                                      }
                                    }
                                  }
                                  dictionary_contents.do_dictionary_contents_finalize( iteration_state );
                                }
                              }
                              else
                              {
                                sbhl_paranoia.sbhl_error( FIVE_INTEGER, $str119$attempting_to_bind_direction_link, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
                              }
                            }
                            else if( NIL != obsolete.cnat_p( node, UNPROVIDED ) )
                            {
                              SubLObject cdolist_list_var_$94;
                              final SubLObject new_list = cdolist_list_var_$94 = ( ( NIL != sbhl_link_vars.sbhl_randomize_lists_p() ) ? list_utilities.randomize_list( sbhl_module_utilities
                                  .get_sbhl_module_relevant_naut_link_generators( sbhl_link_vars.get_sbhl_link_direction(), sbhl_search_vars.$sbhl_tv$.getDynamicValue( thread ), sbhl_module_vars.get_sbhl_module(
                                      UNPROVIDED ) ) )
                                  : sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators( sbhl_link_vars.get_sbhl_link_direction(), sbhl_search_vars.$sbhl_tv$.getDynamicValue( thread ), sbhl_module_vars
                                      .get_sbhl_module( UNPROVIDED ) ) );
                              SubLObject generating_fn = NIL;
                              generating_fn = cdolist_list_var_$94.first();
                              while ( NIL != cdolist_list_var_$94)
                              {
                                final SubLObject _prev_bind_0_$80 = sbhl_link_vars.$sbhl_link_generator$.currentBinding( thread );
                                try
                                {
                                  sbhl_link_vars.$sbhl_link_generator$.bind( generating_fn, thread );
                                  final SubLObject sol2;
                                  final SubLObject link_nodes2 = sol2 = Functions.funcall( generating_fn, node );
                                  if( NIL != set.set_p( sol2 ) )
                                  {
                                    final SubLObject set_contents_var2 = set.do_set_internal( sol2 );
                                    SubLObject basis_object2;
                                    SubLObject state_$94;
                                    SubLObject node_vars_link_node3;
                                    for( basis_object2 = set_contents.do_set_contents_basis_object( set_contents_var2 ), state_$94 = NIL, state_$94 = set_contents.do_set_contents_initial_state( basis_object2,
                                        set_contents_var2 ); NIL == set_contents.do_set_contents_doneP( basis_object2, state_$94 ); state_$94 = set_contents.do_set_contents_update_state( state_$94 ) )
                                    {
                                      node_vars_link_node3 = set_contents.do_set_contents_next( basis_object2, state_$94 );
                                      if( NIL != set_contents.do_set_contents_element_validP( state_$94, node_vars_link_node3 ) && NIL == sbhl_marking_utilities.sbhl_search_path_termination_p( node_vars_link_node3,
                                          UNPROVIDED ) )
                                      {
                                        sbhl_marking_utilities.sbhl_mark_node_marked( node_vars_link_node3, UNPROVIDED );
                                        deck.deck_push( node_vars_link_node3, recur_deck );
                                      }
                                    }
                                  }
                                  else if( sol2.isList() )
                                  {
                                    SubLObject csome_list_var2 = sol2;
                                    SubLObject node_vars_link_node4 = NIL;
                                    node_vars_link_node4 = csome_list_var2.first();
                                    while ( NIL != csome_list_var2)
                                    {
                                      if( NIL == sbhl_marking_utilities.sbhl_search_path_termination_p( node_vars_link_node4, UNPROVIDED ) )
                                      {
                                        sbhl_marking_utilities.sbhl_mark_node_marked( node_vars_link_node4, UNPROVIDED );
                                        deck.deck_push( node_vars_link_node4, recur_deck );
                                      }
                                      csome_list_var2 = csome_list_var2.rest();
                                      node_vars_link_node4 = csome_list_var2.first();
                                    }
                                  }
                                  else
                                  {
                                    Errors.error( $str118$_A_is_neither_SET_P_nor_LISTP_, sol2 );
                                  }
                                }
                                finally
                                {
                                  sbhl_link_vars.$sbhl_link_generator$.rebind( _prev_bind_0_$80, thread );
                                }
                                cdolist_list_var_$94 = cdolist_list_var_$94.rest();
                                generating_fn = cdolist_list_var_$94.first();
                              }
                            }
                          }
                          finally
                          {
                            sbhl_search_vars.$genl_inverse_mode_p$.rebind( _prev_bind_1_$77, thread );
                            sbhl_module_vars.$sbhl_module$.rebind( _prev_bind_0_$77, thread );
                          }
                          cdolist_list_var = cdolist_list_var.rest();
                          module_var = cdolist_list_var.first();
                        }
                        node_var = deck.deck_pop( recur_deck );
                      }
                    }
                    finally
                    {
                      sbhl_search_vars.$genl_inverse_mode_p$.rebind( _prev_bind_2_$77, thread );
                      sbhl_link_vars.$sbhl_link_direction$.rebind( _prev_bind_1_$75, thread );
                      sbhl_search_vars.$sbhl_search_direction$.rebind( _prev_bind_0_$74, thread );
                    }
                  }
                  else
                  {
                    sbhl_paranoia.sbhl_warn( TWO_INTEGER, $str120$Node__a_does_not_pass_sbhl_type_t, col, sbhl_module_utilities.get_sbhl_type_test( sbhl_module_vars.get_sbhl_module( UNPROVIDED ) ), UNPROVIDED,
                        UNPROVIDED, UNPROVIDED );
                  }
                }
                finally
                {
                  sbhl_module_vars.$sbhl_module$.rebind( _prev_bind_5, thread );
                  sbhl_search_vars.$genl_inverse_mode_p$.rebind( _prev_bind_4, thread );
                  sbhl_search_vars.$sbhl_add_node_to_result_test$.rebind( _prev_bind_2_$76, thread );
                  sbhl_search_vars.$sbhl_search_module_type$.rebind( _prev_bind_1_$74, thread );
                  sbhl_search_vars.$sbhl_search_module$.rebind( _prev_bind_0_$73, thread );
                }
              }
              finally
              {
                sbhl_search_vars.$relevant_sbhl_tv_function$.rebind( _prev_bind_1_$73, thread );
                sbhl_search_vars.$sbhl_tv$.rebind( _prev_bind_0_$72, thread );
              }
            }
            finally
            {
              final SubLObject _prev_bind_0_$81 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
              try
              {
                Threads.$is_thread_performing_cleanupP$.bind( T, thread );
                final SubLObject _values2 = Values.getValuesAsVector();
                sbhl_marking_vars.free_sbhl_marking_space( sbhl_marking_vars.$sbhl_space$.getDynamicValue( thread ) );
                Values.restoreValuesFromVector( _values2 );
              }
              finally
              {
                Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$81, thread );
              }
            }
          }
          finally
          {
            sbhl_marking_vars.$sbhl_space$.rebind( _prev_bind_0_$71, thread );
          }
        }
        finally
        {
          sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.rebind( _prev_bind_3, thread );
          sbhl_marking_vars.$resourced_sbhl_marking_spaces$.rebind( _prev_bind_2, thread );
          sbhl_marking_vars.$resourced_sbhl_marking_space_limit$.rebind( _prev_bind_0_$70, thread );
        }
      }
      finally
      {
        final SubLObject _prev_bind_0_$82 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values3 = Values.getValuesAsVector();
          memoization_state.memoization_state_possibly_clear_original_process( local_state, original_memoization_process );
          Values.restoreValuesFromVector( _values3 );
        }
        finally
        {
          Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$82, thread );
        }
      }
    }
    finally
    {
      memoization_state.$memoization_state$.rebind( _prev_bind_0, thread );
    }
    return Values.values( new_items, done_genls );
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-salient-descriptor-prompter.lisp", position = 68072L)
  public static SubLObject rkf_sd_get_genls_rules(final SubLObject seed_term, final SubLObject gaf, final SubLObject col, SubLObject done_genls, final SubLObject mt)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject rule_sense = ( $kw175$TRUE == assertions_high.assertion_truth( gaf ) ) ? $kw178$NEG : $kw179$POS;
    SubLObject new_items = NIL;
    final SubLObject local_state;
    final SubLObject state = local_state = memoization_state.possibly_new_memoization_state();
    final SubLObject _prev_bind_0 = memoization_state.$memoization_state$.currentBinding( thread );
    try
    {
      memoization_state.$memoization_state$.bind( local_state, thread );
      final SubLObject original_memoization_process = memoization_state.memoization_state_original_process( local_state );
      try
      {
        final SubLObject already_resourcing_p = sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.getDynamicValue( thread );
        final SubLObject _prev_bind_0_$99 = sbhl_marking_vars.$resourced_sbhl_marking_space_limit$.currentBinding( thread );
        final SubLObject _prev_bind_2 = sbhl_marking_vars.$resourced_sbhl_marking_spaces$.currentBinding( thread );
        final SubLObject _prev_bind_3 = sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.currentBinding( thread );
        try
        {
          sbhl_marking_vars.$resourced_sbhl_marking_space_limit$.bind( sbhl_marking_vars.determine_resource_limit( already_resourcing_p, SIX_INTEGER ), thread );
          sbhl_marking_vars.$resourced_sbhl_marking_spaces$.bind( sbhl_marking_vars.possibly_new_marking_resource( already_resourcing_p ), thread );
          sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.bind( T, thread );
          SubLObject node_var = col;
          final SubLObject deck_type = $kw106$STACK;
          final SubLObject recur_deck = deck.create_deck( deck_type );
          final SubLObject _prev_bind_0_$100 = sbhl_marking_vars.$sbhl_space$.currentBinding( thread );
          try
          {
            sbhl_marking_vars.$sbhl_space$.bind( sbhl_marking_vars.get_sbhl_marking_space(), thread );
            try
            {
              final SubLObject tv_var = NIL;
              final SubLObject _prev_bind_0_$101 = sbhl_search_vars.$sbhl_tv$.currentBinding( thread );
              final SubLObject _prev_bind_1_$102 = sbhl_search_vars.$relevant_sbhl_tv_function$.currentBinding( thread );
              try
              {
                sbhl_search_vars.$sbhl_tv$.bind( ( NIL != tv_var ) ? tv_var : sbhl_search_vars.get_sbhl_true_tv(), thread );
                sbhl_search_vars.$relevant_sbhl_tv_function$.bind( ( NIL != tv_var ) ? $sym108$RELEVANT_SBHL_TV_IS_GENERAL_TV : sbhl_search_vars.$relevant_sbhl_tv_function$.getDynamicValue( thread ), thread );
                if( NIL != tv_var && NIL != sbhl_paranoia.sbhl_object_type_checking_p() && NIL == sbhl_search_vars.sbhl_true_tv_p( tv_var ) )
                {
                  final SubLObject pcase_var = sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue( thread );
                  if( pcase_var.eql( $kw109$ERROR ) )
                  {
                    sbhl_paranoia.sbhl_error( ONE_INTEGER, $str110$_A_is_not_a__A, tv_var, $sym111$SBHL_TRUE_TV_P, UNPROVIDED, UNPROVIDED, UNPROVIDED );
                  }
                  else if( pcase_var.eql( $kw112$CERROR ) )
                  {
                    sbhl_paranoia.sbhl_cerror( ONE_INTEGER, $str113$continue_anyway, $str110$_A_is_not_a__A, tv_var, $sym111$SBHL_TRUE_TV_P, UNPROVIDED, UNPROVIDED, UNPROVIDED );
                  }
                  else if( pcase_var.eql( $kw114$WARN ) )
                  {
                    Errors.warn( $str110$_A_is_not_a__A, tv_var, $sym111$SBHL_TRUE_TV_P );
                  }
                  else
                  {
                    Errors.warn( $str115$_A_is_not_a_valid__sbhl_type_erro, sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue( thread ) );
                    Errors.cerror( $str113$continue_anyway, $str110$_A_is_not_a__A, tv_var, $sym111$SBHL_TRUE_TV_P );
                  }
                }
                final SubLObject _prev_bind_0_$102 = sbhl_search_vars.$sbhl_search_module$.currentBinding( thread );
                final SubLObject _prev_bind_1_$103 = sbhl_search_vars.$sbhl_search_module_type$.currentBinding( thread );
                final SubLObject _prev_bind_2_$105 = sbhl_search_vars.$sbhl_add_node_to_result_test$.currentBinding( thread );
                final SubLObject _prev_bind_4 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding( thread );
                final SubLObject _prev_bind_5 = sbhl_module_vars.$sbhl_module$.currentBinding( thread );
                try
                {
                  sbhl_search_vars.$sbhl_search_module$.bind( sbhl_module_vars.get_sbhl_module( $const116$genls ), thread );
                  sbhl_search_vars.$sbhl_search_module_type$.bind( sbhl_module_utilities.get_sbhl_module_type( sbhl_module_vars.get_sbhl_module( $const116$genls ) ), thread );
                  sbhl_search_vars.$sbhl_add_node_to_result_test$.bind( sbhl_module_utilities.get_sbhl_add_node_to_result_test( sbhl_module_vars.get_sbhl_module( $const116$genls ) ), thread );
                  sbhl_search_vars.$genl_inverse_mode_p$.bind( NIL, thread );
                  sbhl_module_vars.$sbhl_module$.bind( sbhl_module_vars.get_sbhl_module( $const116$genls ), thread );
                  if( NIL != sbhl_paranoia.suspend_sbhl_type_checkingP() || NIL != sbhl_module_utilities.apply_sbhl_module_type_test( col, sbhl_module_vars.get_sbhl_module( UNPROVIDED ) ) )
                  {
                    final SubLObject _prev_bind_0_$103 = sbhl_search_vars.$sbhl_search_direction$.currentBinding( thread );
                    final SubLObject _prev_bind_1_$104 = sbhl_link_vars.$sbhl_link_direction$.currentBinding( thread );
                    final SubLObject _prev_bind_2_$106 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding( thread );
                    try
                    {
                      sbhl_search_vars.$sbhl_search_direction$.bind( sbhl_search_vars.get_sbhl_forward_search_direction(), thread );
                      sbhl_link_vars.$sbhl_link_direction$.bind( sbhl_module_utilities.sbhl_search_direction_to_link_direction( sbhl_search_vars.get_sbhl_forward_search_direction(), sbhl_module_vars.get_sbhl_module(
                          $const116$genls ) ), thread );
                      sbhl_search_vars.$genl_inverse_mode_p$.bind( NIL, thread );
                      sbhl_marking_utilities.sbhl_mark_node_marked( node_var, UNPROVIDED );
                      while ( NIL != node_var)
                      {
                        final SubLObject genl = node_var;
                        if( NIL == conses_high.member( genl, done_genls, UNPROVIDED, UNPROVIDED ) )
                        {
                          if( NIL != rkf_sd_term_too_generalP( genl ) )
                          {
                            done_genls = ConsesLow.cons( genl, done_genls );
                          }
                          else
                          {
                            final SubLObject gaf_lit = el_utilities.make_binary_formula( $const116$genls, seed_term, genl );
                            if( NIL != kb_mapping_macros.do_genls_rule_index_key_validator( genl, rule_sense, NIL ) )
                            {
                              final SubLObject iterator_var = kb_mapping_macros.new_genls_rule_final_index_spec_iterator( genl, rule_sense, NIL );
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
                                    final_index_iterator = kb_mapping_macros.new_final_index_iterator( final_index_spec, $kw59$RULE, NIL, NIL );
                                    SubLObject done_var_$109 = NIL;
                                    final SubLObject token_var_$110 = NIL;
                                    while ( NIL == done_var_$109)
                                    {
                                      final SubLObject rule = iteration.iteration_next_without_values_macro_helper( final_index_iterator, token_var_$110 );
                                      final SubLObject valid_$111 = makeBoolean( !token_var_$110.eql( rule ) );
                                      if( NIL != valid_$111 )
                                      {
                                        final SubLObject v_bindings = rkf_sd_gaf_lit_rule_bindings( gaf_lit, rule, rule_sense, UNPROVIDED );
                                        if( NIL != v_bindings && NIL == rkf_salient_descriptor.rkf_bad_sd_ruleP( rule, mt ) )
                                        {
                                          final SubLObject item_var = ConsesLow.list( gaf, gaf_lit, rule, v_bindings );
                                          if( NIL == conses_high.member( item_var, new_items, $sym180$RKF_SD_RULE_TUPLE__, Symbols.symbol_function( IDENTITY ) ) )
                                          {
                                            new_items = ConsesLow.cons( item_var, new_items );
                                          }
                                        }
                                      }
                                      done_var_$109 = makeBoolean( NIL == valid_$111 );
                                    }
                                  }
                                  finally
                                  {
                                    final SubLObject _prev_bind_0_$104 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
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
                                      Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$104, thread );
                                    }
                                  }
                                }
                                done_var = makeBoolean( NIL == valid );
                              }
                            }
                            done_genls = ConsesLow.cons( genl, done_genls );
                          }
                        }
                        SubLObject cdolist_list_var;
                        final SubLObject accessible_modules = cdolist_list_var = sbhl_macros.get_sbhl_accessible_modules( sbhl_module_vars.get_sbhl_module( $const116$genls ) );
                        SubLObject module_var = NIL;
                        module_var = cdolist_list_var.first();
                        while ( NIL != cdolist_list_var)
                        {
                          final SubLObject _prev_bind_0_$105 = sbhl_module_vars.$sbhl_module$.currentBinding( thread );
                          final SubLObject _prev_bind_1_$105 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding( thread );
                          try
                          {
                            sbhl_module_vars.$sbhl_module$.bind( module_var, thread );
                            sbhl_search_vars.$genl_inverse_mode_p$.bind( ( NIL != sbhl_search_vars.flip_genl_inverse_modeP( UNPROVIDED, UNPROVIDED ) ) ? makeBoolean( NIL == sbhl_search_vars.$genl_inverse_mode_p$
                                .getDynamicValue( thread ) ) : sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue( thread ), thread );
                            final SubLObject node = function_terms.naut_to_nart( node_var );
                            if( NIL != sbhl_link_vars.sbhl_node_object_p( node ) )
                            {
                              final SubLObject d_link = sbhl_graphs.get_sbhl_graph_link( node, sbhl_module_vars.get_sbhl_module( UNPROVIDED ) );
                              if( NIL != d_link )
                              {
                                final SubLObject mt_links = sbhl_links.get_sbhl_mt_links( d_link, sbhl_link_vars.get_sbhl_link_direction(), sbhl_module_vars.get_sbhl_module( UNPROVIDED ) );
                                if( NIL != mt_links )
                                {
                                  SubLObject iteration_state;
                                  for( iteration_state = dictionary_contents.do_dictionary_contents_state( dictionary.dictionary_contents( mt_links ) ); NIL == dictionary_contents.do_dictionary_contents_doneP(
                                      iteration_state ); iteration_state = dictionary_contents.do_dictionary_contents_next( iteration_state ) )
                                  {
                                    thread.resetMultipleValues();
                                    final SubLObject mt_$115 = dictionary_contents.do_dictionary_contents_key_value( iteration_state );
                                    final SubLObject tv_links = thread.secondMultipleValue();
                                    thread.resetMultipleValues();
                                    if( NIL != mt_relevance_macros.relevant_mtP( mt_$115 ) )
                                    {
                                      final SubLObject _prev_bind_0_$106 = sbhl_link_vars.$sbhl_link_mt$.currentBinding( thread );
                                      try
                                      {
                                        sbhl_link_vars.$sbhl_link_mt$.bind( mt_$115, thread );
                                        SubLObject iteration_state_$117;
                                        for( iteration_state_$117 = dictionary_contents.do_dictionary_contents_state( dictionary.dictionary_contents( tv_links ) ); NIL == dictionary_contents.do_dictionary_contents_doneP(
                                            iteration_state_$117 ); iteration_state_$117 = dictionary_contents.do_dictionary_contents_next( iteration_state_$117 ) )
                                        {
                                          thread.resetMultipleValues();
                                          final SubLObject tv = dictionary_contents.do_dictionary_contents_key_value( iteration_state_$117 );
                                          final SubLObject link_nodes = thread.secondMultipleValue();
                                          thread.resetMultipleValues();
                                          if( NIL != sbhl_search_vars.relevant_sbhl_tvP( tv ) )
                                          {
                                            final SubLObject _prev_bind_0_$107 = sbhl_link_vars.$sbhl_link_tv$.currentBinding( thread );
                                            try
                                            {
                                              sbhl_link_vars.$sbhl_link_tv$.bind( tv, thread );
                                              final SubLObject sol = link_nodes;
                                              if( NIL != set.set_p( sol ) )
                                              {
                                                final SubLObject set_contents_var = set.do_set_internal( sol );
                                                SubLObject basis_object;
                                                SubLObject state_$119;
                                                SubLObject node_vars_link_node;
                                                for( basis_object = set_contents.do_set_contents_basis_object( set_contents_var ), state_$119 = NIL, state_$119 = set_contents.do_set_contents_initial_state( basis_object,
                                                    set_contents_var ); NIL == set_contents.do_set_contents_doneP( basis_object, state_$119 ); state_$119 = set_contents.do_set_contents_update_state( state_$119 ) )
                                                {
                                                  node_vars_link_node = set_contents.do_set_contents_next( basis_object, state_$119 );
                                                  if( NIL != set_contents.do_set_contents_element_validP( state_$119, node_vars_link_node ) && NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(
                                                      node_vars_link_node, UNPROVIDED ) )
                                                  {
                                                    sbhl_marking_utilities.sbhl_mark_node_marked( node_vars_link_node, UNPROVIDED );
                                                    deck.deck_push( node_vars_link_node, recur_deck );
                                                  }
                                                }
                                              }
                                              else if( sol.isList() )
                                              {
                                                SubLObject csome_list_var = sol;
                                                SubLObject node_vars_link_node2 = NIL;
                                                node_vars_link_node2 = csome_list_var.first();
                                                while ( NIL != csome_list_var)
                                                {
                                                  if( NIL == sbhl_marking_utilities.sbhl_search_path_termination_p( node_vars_link_node2, UNPROVIDED ) )
                                                  {
                                                    sbhl_marking_utilities.sbhl_mark_node_marked( node_vars_link_node2, UNPROVIDED );
                                                    deck.deck_push( node_vars_link_node2, recur_deck );
                                                  }
                                                  csome_list_var = csome_list_var.rest();
                                                  node_vars_link_node2 = csome_list_var.first();
                                                }
                                              }
                                              else
                                              {
                                                Errors.error( $str118$_A_is_neither_SET_P_nor_LISTP_, sol );
                                              }
                                            }
                                            finally
                                            {
                                              sbhl_link_vars.$sbhl_link_tv$.rebind( _prev_bind_0_$107, thread );
                                            }
                                          }
                                        }
                                        dictionary_contents.do_dictionary_contents_finalize( iteration_state_$117 );
                                      }
                                      finally
                                      {
                                        sbhl_link_vars.$sbhl_link_mt$.rebind( _prev_bind_0_$106, thread );
                                      }
                                    }
                                  }
                                  dictionary_contents.do_dictionary_contents_finalize( iteration_state );
                                }
                              }
                              else
                              {
                                sbhl_paranoia.sbhl_error( FIVE_INTEGER, $str119$attempting_to_bind_direction_link, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
                              }
                            }
                            else if( NIL != obsolete.cnat_p( node, UNPROVIDED ) )
                            {
                              SubLObject cdolist_list_var_$120;
                              final SubLObject new_list = cdolist_list_var_$120 = ( ( NIL != sbhl_link_vars.sbhl_randomize_lists_p() ) ? list_utilities.randomize_list( sbhl_module_utilities
                                  .get_sbhl_module_relevant_naut_link_generators( sbhl_link_vars.get_sbhl_link_direction(), sbhl_search_vars.$sbhl_tv$.getDynamicValue( thread ), sbhl_module_vars.get_sbhl_module(
                                      UNPROVIDED ) ) )
                                  : sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators( sbhl_link_vars.get_sbhl_link_direction(), sbhl_search_vars.$sbhl_tv$.getDynamicValue( thread ), sbhl_module_vars
                                      .get_sbhl_module( UNPROVIDED ) ) );
                              SubLObject generating_fn = NIL;
                              generating_fn = cdolist_list_var_$120.first();
                              while ( NIL != cdolist_list_var_$120)
                              {
                                final SubLObject _prev_bind_0_$108 = sbhl_link_vars.$sbhl_link_generator$.currentBinding( thread );
                                try
                                {
                                  sbhl_link_vars.$sbhl_link_generator$.bind( generating_fn, thread );
                                  final SubLObject sol2;
                                  final SubLObject link_nodes2 = sol2 = Functions.funcall( generating_fn, node );
                                  if( NIL != set.set_p( sol2 ) )
                                  {
                                    final SubLObject set_contents_var2 = set.do_set_internal( sol2 );
                                    SubLObject basis_object2;
                                    SubLObject state_$120;
                                    SubLObject node_vars_link_node3;
                                    for( basis_object2 = set_contents.do_set_contents_basis_object( set_contents_var2 ), state_$120 = NIL, state_$120 = set_contents.do_set_contents_initial_state( basis_object2,
                                        set_contents_var2 ); NIL == set_contents.do_set_contents_doneP( basis_object2, state_$120 ); state_$120 = set_contents.do_set_contents_update_state( state_$120 ) )
                                    {
                                      node_vars_link_node3 = set_contents.do_set_contents_next( basis_object2, state_$120 );
                                      if( NIL != set_contents.do_set_contents_element_validP( state_$120, node_vars_link_node3 ) && NIL == sbhl_marking_utilities.sbhl_search_path_termination_p( node_vars_link_node3,
                                          UNPROVIDED ) )
                                      {
                                        sbhl_marking_utilities.sbhl_mark_node_marked( node_vars_link_node3, UNPROVIDED );
                                        deck.deck_push( node_vars_link_node3, recur_deck );
                                      }
                                    }
                                  }
                                  else if( sol2.isList() )
                                  {
                                    SubLObject csome_list_var2 = sol2;
                                    SubLObject node_vars_link_node4 = NIL;
                                    node_vars_link_node4 = csome_list_var2.first();
                                    while ( NIL != csome_list_var2)
                                    {
                                      if( NIL == sbhl_marking_utilities.sbhl_search_path_termination_p( node_vars_link_node4, UNPROVIDED ) )
                                      {
                                        sbhl_marking_utilities.sbhl_mark_node_marked( node_vars_link_node4, UNPROVIDED );
                                        deck.deck_push( node_vars_link_node4, recur_deck );
                                      }
                                      csome_list_var2 = csome_list_var2.rest();
                                      node_vars_link_node4 = csome_list_var2.first();
                                    }
                                  }
                                  else
                                  {
                                    Errors.error( $str118$_A_is_neither_SET_P_nor_LISTP_, sol2 );
                                  }
                                }
                                finally
                                {
                                  sbhl_link_vars.$sbhl_link_generator$.rebind( _prev_bind_0_$108, thread );
                                }
                                cdolist_list_var_$120 = cdolist_list_var_$120.rest();
                                generating_fn = cdolist_list_var_$120.first();
                              }
                            }
                          }
                          finally
                          {
                            sbhl_search_vars.$genl_inverse_mode_p$.rebind( _prev_bind_1_$105, thread );
                            sbhl_module_vars.$sbhl_module$.rebind( _prev_bind_0_$105, thread );
                          }
                          cdolist_list_var = cdolist_list_var.rest();
                          module_var = cdolist_list_var.first();
                        }
                        node_var = deck.deck_pop( recur_deck );
                      }
                    }
                    finally
                    {
                      sbhl_search_vars.$genl_inverse_mode_p$.rebind( _prev_bind_2_$106, thread );
                      sbhl_link_vars.$sbhl_link_direction$.rebind( _prev_bind_1_$104, thread );
                      sbhl_search_vars.$sbhl_search_direction$.rebind( _prev_bind_0_$103, thread );
                    }
                  }
                  else
                  {
                    sbhl_paranoia.sbhl_warn( TWO_INTEGER, $str120$Node__a_does_not_pass_sbhl_type_t, col, sbhl_module_utilities.get_sbhl_type_test( sbhl_module_vars.get_sbhl_module( UNPROVIDED ) ), UNPROVIDED,
                        UNPROVIDED, UNPROVIDED );
                  }
                }
                finally
                {
                  sbhl_module_vars.$sbhl_module$.rebind( _prev_bind_5, thread );
                  sbhl_search_vars.$genl_inverse_mode_p$.rebind( _prev_bind_4, thread );
                  sbhl_search_vars.$sbhl_add_node_to_result_test$.rebind( _prev_bind_2_$105, thread );
                  sbhl_search_vars.$sbhl_search_module_type$.rebind( _prev_bind_1_$103, thread );
                  sbhl_search_vars.$sbhl_search_module$.rebind( _prev_bind_0_$102, thread );
                }
              }
              finally
              {
                sbhl_search_vars.$relevant_sbhl_tv_function$.rebind( _prev_bind_1_$102, thread );
                sbhl_search_vars.$sbhl_tv$.rebind( _prev_bind_0_$101, thread );
              }
            }
            finally
            {
              final SubLObject _prev_bind_0_$109 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
              try
              {
                Threads.$is_thread_performing_cleanupP$.bind( T, thread );
                final SubLObject _values2 = Values.getValuesAsVector();
                sbhl_marking_vars.free_sbhl_marking_space( sbhl_marking_vars.$sbhl_space$.getDynamicValue( thread ) );
                Values.restoreValuesFromVector( _values2 );
              }
              finally
              {
                Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$109, thread );
              }
            }
          }
          finally
          {
            sbhl_marking_vars.$sbhl_space$.rebind( _prev_bind_0_$100, thread );
          }
        }
        finally
        {
          sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.rebind( _prev_bind_3, thread );
          sbhl_marking_vars.$resourced_sbhl_marking_spaces$.rebind( _prev_bind_2, thread );
          sbhl_marking_vars.$resourced_sbhl_marking_space_limit$.rebind( _prev_bind_0_$99, thread );
        }
      }
      finally
      {
        final SubLObject _prev_bind_0_$110 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values3 = Values.getValuesAsVector();
          memoization_state.memoization_state_possibly_clear_original_process( local_state, original_memoization_process );
          Values.restoreValuesFromVector( _values3 );
        }
        finally
        {
          Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$110, thread );
        }
      }
    }
    finally
    {
      memoization_state.$memoization_state$.rebind( _prev_bind_0, thread );
    }
    return Values.values( new_items, done_genls );
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-salient-descriptor-prompter.lisp", position = 68819L)
  public static SubLObject rkf_sd_rule_tuple_E(final SubLObject tuple1, final SubLObject tuple2)
  {
    SubLObject gaf1 = NIL;
    SubLObject gaf_lit1 = NIL;
    SubLObject rule1 = NIL;
    SubLObject bindings1 = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( tuple1, tuple1, $list184 );
    gaf1 = tuple1.first();
    SubLObject current = tuple1.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, tuple1, $list184 );
    gaf_lit1 = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, tuple1, $list184 );
    rule1 = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, tuple1, $list184 );
    bindings1 = current.first();
    current = current.rest();
    if( NIL == current )
    {
      SubLObject gaf2 = NIL;
      SubLObject gaf_lit2 = NIL;
      SubLObject rule2 = NIL;
      SubLObject bindings2 = NIL;
      cdestructuring_bind.destructuring_bind_must_consp( tuple2, tuple2, $list185 );
      gaf2 = tuple2.first();
      SubLObject current_$126 = tuple2.rest();
      cdestructuring_bind.destructuring_bind_must_consp( current_$126, tuple2, $list185 );
      gaf_lit2 = current_$126.first();
      current_$126 = current_$126.rest();
      cdestructuring_bind.destructuring_bind_must_consp( current_$126, tuple2, $list185 );
      rule2 = current_$126.first();
      current_$126 = current_$126.rest();
      cdestructuring_bind.destructuring_bind_must_consp( current_$126, tuple2, $list185 );
      bindings2 = current_$126.first();
      current_$126 = current_$126.rest();
      if( NIL == current_$126 )
      {
        return makeBoolean( gaf1.eql( gaf2 ) && rule1.eql( rule2 ) && gaf_lit1.equal( gaf_lit2 ) && bindings1.equal( bindings2 ) );
      }
      cdestructuring_bind.cdestructuring_bind_error( tuple2, $list185 );
    }
    else
    {
      cdestructuring_bind.cdestructuring_bind_error( tuple1, $list184 );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-salient-descriptor-prompter.lisp", position = 69115L)
  public static SubLObject rkf_sd_score_rule_tuple(SubLObject tuple)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject cnf = rkf_sd_el_cnf_from_rule_tuple( tuple );
    final SubLObject score = rkf_salient_descriptor_datastructures.new_rkf_sd_rule_info_score();
    rkf_salient_descriptor_datastructures._csetf_rkf_sd_rule_info_score_seed_term_in_pos_litsP( score, list_utilities.sublisp_boolean( list_utilities.tree_find( $rkf_sd_seed_term$.getDynamicValue( thread ), clauses
        .pos_lits( cnf ), UNPROVIDED, UNPROVIDED ) ) );
    rkf_salient_descriptor_datastructures._csetf_rkf_sd_rule_info_score_seed_term_in_neg_litsP( score, list_utilities.sublisp_boolean( list_utilities.tree_find( $rkf_sd_seed_term$.getDynamicValue( thread ), clauses
        .neg_lits( cnf ), UNPROVIDED, UNPROVIDED ) ) );
    rkf_salient_descriptor_datastructures._csetf_rkf_sd_rule_info_score_var_count( score, list_utilities.tree_count_if( $sym37$EL_VAR_, cnf, UNPROVIDED ) );
    rkf_salient_descriptor_datastructures._csetf_rkf_sd_rule_info_score_neg_lit_count( score, Sequences.length( clauses.neg_lits( cnf ) ) );
    rkf_salient_descriptor_datastructures._csetf_rkf_sd_rule_info_score_pos_lit_count( score, Sequences.length( clauses.pos_lits( cnf ) ) );
    rkf_salient_descriptor_datastructures._csetf_rkf_sd_rule_info_score_pos_lit_quality_score( score, rkf_sd_cnf_rule_count( cnf ) );
    rkf_salient_descriptor_datastructures._csetf_rkf_sd_rule_info_score_mt_generality_score( score, rkf_sd_tuple_mt_generality( tuple ) );
    tuple = ConsesLow.nconc( tuple, ConsesLow.list( score ) );
    return tuple;
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-salient-descriptor-prompter.lisp", position = 70095L)
  public static SubLObject rkf_sd_prefer_rule_tupleP(final SubLObject tuple1, final SubLObject tuple2)
  {
    final SubLObject score1 = conses_high.fifth( tuple1 );
    final SubLObject score2 = conses_high.fifth( tuple2 );
    return rkf_sd_rule_info_score_G( score1, score2 );
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-salient-descriptor-prompter.lisp", position = 70605L)
  public static SubLObject rkf_sd_rule_info_score_G(final SubLObject score1, final SubLObject score2)
  {
    SubLObject test_result = NIL;
    if( NIL == test_result )
    {
      SubLObject csome_list_var = $rkf_sd_rule_score_tests$.getGlobalValue();
      SubLObject test = NIL;
      test = csome_list_var.first();
      while ( NIL == test_result && NIL != csome_list_var)
      {
        if( test.isFunctionSpec() )
        {
          test_result = rkf_sd_rule_score_do_test( test, score1, score2 );
        }
        csome_list_var = csome_list_var.rest();
        test = csome_list_var.first();
      }
    }
    return Equality.eq( $kw187$BETTER, test_result );
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-salient-descriptor-prompter.lisp", position = 70949L)
  public static SubLObject rkf_sd_rule_score_do_test(final SubLObject test, final SubLObject score1, final SubLObject score2)
  {
    if( NIL != Functions.funcall( test, score1, score2 ) )
    {
      return $kw187$BETTER;
    }
    if( NIL != Functions.funcall( test, score2, score1 ) )
    {
      return $kw188$WORSE;
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-salient-descriptor-prompter.lisp", position = 71221L)
  public static SubLObject rkf_sd_rst_seed_term_in_pos_lits(final SubLObject score1, final SubLObject score2)
  {
    return makeBoolean( NIL != rkf_salient_descriptor_datastructures.rkf_sd_rule_info_score_seed_term_in_pos_litsP( score1 ) && NIL == rkf_salient_descriptor_datastructures.rkf_sd_rule_info_score_seed_term_in_pos_litsP(
        score2 ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-salient-descriptor-prompter.lisp", position = 71539L)
  public static SubLObject rkf_sd_rst_seed_term_in_neg_lits(final SubLObject score1, final SubLObject score2)
  {
    return makeBoolean( NIL != rkf_salient_descriptor_datastructures.rkf_sd_rule_info_score_seed_term_in_neg_litsP( score1 ) && NIL == rkf_salient_descriptor_datastructures.rkf_sd_rule_info_score_seed_term_in_neg_litsP(
        score2 ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-salient-descriptor-prompter.lisp", position = 71744L)
  public static SubLObject rkf_sd_rst_var_count(final SubLObject score1, final SubLObject score2)
  {
    return Numbers.numL( rkf_salient_descriptor_datastructures.rkf_sd_rule_info_score_var_count( score1 ), rkf_salient_descriptor_datastructures.rkf_sd_rule_info_score_var_count( score2 ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-salient-descriptor-prompter.lisp", position = 71898L)
  public static SubLObject rkf_sd_rst_neg_lit_count(final SubLObject score1, final SubLObject score2)
  {
    return makeBoolean( rkf_salient_descriptor_datastructures.rkf_sd_rule_info_score_neg_lit_count( score1 ).isPositive() && rkf_salient_descriptor_datastructures.rkf_sd_rule_info_score_neg_lit_count( score1 ).numL(
        rkf_salient_descriptor_datastructures.rkf_sd_rule_info_score_neg_lit_count( score2 ) ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-salient-descriptor-prompter.lisp", position = 72130L)
  public static SubLObject rkf_sd_rst_pos_lit_count(final SubLObject score1, final SubLObject score2)
  {
    return makeBoolean( rkf_salient_descriptor_datastructures.rkf_sd_rule_info_score_pos_lit_count( score1 ).isPositive() && rkf_salient_descriptor_datastructures.rkf_sd_rule_info_score_pos_lit_count( score1 ).numL(
        rkf_salient_descriptor_datastructures.rkf_sd_rule_info_score_pos_lit_count( score2 ) ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-salient-descriptor-prompter.lisp", position = 72362L)
  public static SubLObject rkf_sd_rst_mt_generality(final SubLObject score1, final SubLObject score2)
  {
    return Numbers.numG( rkf_salient_descriptor_datastructures.rkf_sd_rule_info_score_mt_generality_score( score1 ), rkf_salient_descriptor_datastructures.rkf_sd_rule_info_score_mt_generality_score( score2 ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-salient-descriptor-prompter.lisp", position = 72540L)
  public static SubLObject rkf_sd_rst_pos_lit_quality(final SubLObject score1, final SubLObject score2)
  {
    return Numbers.numG( rkf_salient_descriptor_datastructures.rkf_sd_rule_info_score_pos_lit_quality_score( score1 ), rkf_salient_descriptor_datastructures.rkf_sd_rule_info_score_pos_lit_quality_score( score2 ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-salient-descriptor-prompter.lisp", position = 72724L)
  public static SubLObject rkf_sd_tuple_mt_generality(final SubLObject tuple)
  {
    SubLObject gaf = NIL;
    SubLObject gaf_lit = NIL;
    SubLObject rule = NIL;
    SubLObject v_bindings = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( tuple, tuple, $list189 );
    gaf = tuple.first();
    SubLObject current = tuple.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, tuple, $list189 );
    gaf_lit = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, tuple, $list189 );
    rule = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, tuple, $list189 );
    v_bindings = current.first();
    current = current.rest();
    if( NIL == current )
    {
      return number_utilities.minimum( ConsesLow.list( cardinality_estimates.generality_estimate( assertions_high.assertion_mt( gaf ) ), cardinality_estimates.generality_estimate( assertions_high.assertion_mt(
          rule ) ) ), UNPROVIDED );
    }
    cdestructuring_bind.cdestructuring_bind_error( tuple, $list189 );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-salient-descriptor-prompter.lisp", position = 72980L)
  public static SubLObject rkf_sd_cnf_rule_count(final SubLObject cnf)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject rule_count = ZERO_INTEGER;
    final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding( thread );
    final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding( thread );
    try
    {
      mt_relevance_macros.$relevant_mt_function$.bind( $sym102$RELEVANT_MT_IS_EVERYTHING, thread );
      mt_relevance_macros.$mt$.bind( $const103$EverythingPSC, thread );
      SubLObject cdolist_list_var = clauses.pos_lits( cnf );
      SubLObject pos_lit = NIL;
      pos_lit = cdolist_list_var.first();
      while ( NIL != cdolist_list_var)
      {
        rule_count = Numbers.add( rule_count, kb_indexing.num_predicate_rule_index( cycl_utilities.atomic_sentence_predicate( pos_lit ), $kw178$NEG, UNPROVIDED, UNPROVIDED ) );
        cdolist_list_var = cdolist_list_var.rest();
        pos_lit = cdolist_list_var.first();
      }
    }
    finally
    {
      mt_relevance_macros.$mt$.rebind( _prev_bind_2, thread );
      mt_relevance_macros.$relevant_mt_function$.rebind( _prev_bind_0, thread );
    }
    return rule_count;
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-salient-descriptor-prompter.lisp", position = 73230L)
  public static SubLObject rkf_sd_el_cnf_from_rule_tuple(final SubLObject tuple)
  {
    SubLObject gaf = NIL;
    SubLObject gaf_lit = NIL;
    SubLObject rule = NIL;
    SubLObject v_bindings = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( tuple, tuple, $list189 );
    gaf = tuple.first();
    SubLObject current = tuple.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, tuple, $list189 );
    gaf_lit = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, tuple, $list189 );
    rule = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, tuple, $list189 );
    v_bindings = current.first();
    current = current.rest();
    if( NIL == current )
    {
      final SubLObject hl_cnf = conses_high.copy_tree( assertions_high.assertion_cnf( rule ) );
      final SubLObject el_vars = assertions_high.assertion_el_variables( rule );
      final SubLObject rule_sense = ( $kw175$TRUE == assertions_high.assertion_truth( gaf ) ) ? $kw178$NEG : $kw179$POS;
      final SubLObject lits = clauses.clause_sense_lits( hl_cnf, rule_sense );
      final SubLObject match = NIL;
      if( NIL != v_bindings )
      {
        final SubLObject new_lits = Sequences.remove( match, lits, Symbols.symbol_function( EQUAL ), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
        final SubLObject new_neg_lits = ( $kw178$NEG == rule_sense ) ? new_lits : clauses.neg_lits( hl_cnf );
        final SubLObject new_pos_lits = ( $kw179$POS == rule_sense ) ? new_lits : clauses.pos_lits( hl_cnf );
        SubLObject new_hl_cnf = clauses.make_clause( new_neg_lits, new_pos_lits );
        new_hl_cnf = bindings.subst_bindings( v_bindings, new_hl_cnf );
        return rkf_salient_descriptor.rkf_sd_el_cnf_of_hl_cnf( new_hl_cnf, el_vars );
      }
    }
    else
    {
      cdestructuring_bind.cdestructuring_bind_error( tuple, $list189 );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-salient-descriptor-prompter.lisp", position = 74007L)
  public static SubLObject rkf_sd_gaf_okP(final SubLObject gaf)
  {
    return makeBoolean( NIL != assertions_high.asserted_assertionP( gaf ) && NIL != rkf_sd_gaf_generality_okP( gaf ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-salient-descriptor-prompter.lisp", position = 74126L)
  public static SubLObject rkf_sd_gaf_generality_okP(final SubLObject gaf)
  {
    return makeBoolean( NIL == cycl_utilities.expression_find_if( $sym190$RKF_SD_TERM_TOO_GENERAL_, assertions_high.gaf_args( gaf ), T, UNPROVIDED ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-salient-descriptor-prompter.lisp", position = 74255L)
  public static SubLObject rkf_sd_term_too_generalP(final SubLObject v_term)
  {
    final SubLObject generality_cutoff = $int191$5000;
    return makeBoolean( NIL != forts.fort_p( v_term ) && cardinality_estimates.generality_estimate( v_term ).numG( generality_cutoff ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-salient-descriptor-prompter.lisp", position = 74429L)
  public static SubLObject rkf_sd_gaf_rule_bindings(final SubLObject gaf, final SubLObject rule, final SubLObject rule_sense, SubLObject strictP)
  {
    if( strictP == UNPROVIDED )
    {
      strictP = NIL;
    }
    final SubLObject gaf_lit = assertions_high.gaf_formula( gaf );
    return rkf_sd_gaf_lit_rule_bindings( gaf_lit, rule, rule_sense, strictP );
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-salient-descriptor-prompter.lisp", position = 74624L)
  public static SubLObject rkf_sd_gaf_lit_rule_bindings(final SubLObject gaf_lit, final SubLObject rule, final SubLObject sense, SubLObject strictP)
  {
    if( strictP == UNPROVIDED )
    {
      strictP = NIL;
    }
    final SubLObject cnf = assertions_high.assertion_cnf( rule );
    final SubLObject rule_lits = ( $kw178$NEG == sense ) ? clauses.neg_lits( cnf ) : clauses.pos_lits( cnf );
    SubLObject v_bindings = NIL;
    if( NIL == v_bindings )
    {
      SubLObject csome_list_var = rule_lits;
      SubLObject rule_lit = NIL;
      rule_lit = csome_list_var.first();
      while ( NIL == v_bindings && NIL != csome_list_var)
      {
        if( NIL == strictP || NIL != variables.fully_bound_p( cycl_utilities.atomic_sentence_arg2( rule_lit, UNPROVIDED ) ) )
        {
          v_bindings = unification_utilities.asent_unify( gaf_lit, rule_lit, UNPROVIDED, UNPROVIDED );
        }
        csome_list_var = csome_list_var.rest();
        rule_lit = csome_list_var.first();
      }
    }
    return v_bindings;
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-salient-descriptor-prompter.lisp", position = 75030L)
  public static SubLObject rkf_sd_subprompts_matches_cnfP(final SubLObject subprompts, final SubLObject cnf)
  {
    SubLObject new_cnf = NIL;
    if( NIL == new_cnf )
    {
      SubLObject csome_list_var = subprompts;
      SubLObject subprompt = NIL;
      subprompt = csome_list_var.first();
      while ( NIL == new_cnf && NIL != csome_list_var)
      {
        final SubLObject assert_sentence = rkf_salient_descriptor.rkf_salient_descriptor_subprompt_assert_sentence( subprompt, UNPROVIDED, UNPROVIDED );
        new_cnf = rkf_sd_assert_sentence_matches_cnfP( assert_sentence, cnf );
        csome_list_var = csome_list_var.rest();
        subprompt = csome_list_var.first();
      }
    }
    return new_cnf;
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-salient-descriptor-prompter.lisp", position = 75351L)
  public static SubLObject rkf_sd_assert_sentence_matches_cnfP(final SubLObject assert_sentence, final SubLObject cnf)
  {
    SubLObject new_cnf = NIL;
    if( NIL == new_cnf )
    {
      SubLObject csome_list_var = clauses.neg_lits( cnf );
      SubLObject neg_lit = NIL;
      neg_lit = csome_list_var.first();
      while ( NIL == new_cnf && NIL != csome_list_var)
      {
        if( NIL != rkf_sd_assert_sentence_matches_neg_litP( assert_sentence, neg_lit ) )
        {
          final SubLObject new_neg_lits = Sequences.remove( neg_lit, clauses.neg_lits( cnf ), Symbols.symbol_function( EQUAL ), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
          new_cnf = clauses.make_clause( new_neg_lits, clauses.pos_lits( cnf ) );
        }
        csome_list_var = csome_list_var.rest();
        neg_lit = csome_list_var.first();
      }
    }
    return new_cnf;
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-salient-descriptor-prompter.lisp", position = 75721L)
  public static SubLObject rkf_sd_assert_sentence_matches_neg_litP(final SubLObject assert_sentence, final SubLObject neg_lit)
  {
    SubLObject mismatchP = makeBoolean( NIL == el_utilities.same_formula_arity_p( assert_sentence, neg_lit, UNPROVIDED ) );
    final SubLObject terms = cycl_utilities.formula_terms( assert_sentence, $kw45$IGNORE );
    SubLObject list_var = NIL;
    SubLObject v_term = NIL;
    SubLObject argnum = NIL;
    list_var = terms;
    v_term = list_var.first();
    for( argnum = ZERO_INTEGER; NIL == mismatchP && NIL != list_var; list_var = list_var.rest(), v_term = list_var.first(), argnum = number_utilities.f_1X( argnum ) )
    {
      if( NIL == cycl_variables.el_varP( v_term ) && !v_term.equal( cycl_utilities.formula_arg( neg_lit, argnum, UNPROVIDED ) ) )
      {
        mismatchP = T;
      }
    }
    return makeBoolean( NIL == mismatchP );
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-salient-descriptor-prompter.lisp", position = 76092L)
  public static SubLObject rkf_sd_prompter_strong(final SubLObject prompter)
  {
    return rkf_sd_prompter_add_ke_driven_prompts( prompter, $const192$keStrongSuggestion );
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-salient-descriptor-prompter.lisp", position = 76222L)
  public static SubLObject rkf_sd_prompter_induced(final SubLObject prompter)
  {
    return rkf_sd_prompter_add_ke_driven_prompts( prompter, $sym146$RKF_NEIGHBOR_SUGGESTIONS );
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-salient-descriptor-prompter.lisp", position = 76358L)
  public static SubLObject rkf_sd_prompter_weak(final SubLObject prompter)
  {
    return rkf_sd_prompter_add_ke_driven_prompts( prompter, $const193$keWeakSuggestion );
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-salient-descriptor-prompter.lisp", position = 76484L)
  public static SubLObject rkf_sd_prompter_compute_subpromptss(final SubLObject prompter)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject bad_prompts = NIL;
    final SubLObject already_resourcing_p = sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.getDynamicValue( thread );
    final SubLObject _prev_bind_0 = sbhl_marking_vars.$resourced_sbhl_marking_space_limit$.currentBinding( thread );
    final SubLObject _prev_bind_2 = sbhl_marking_vars.$resourced_sbhl_marking_spaces$.currentBinding( thread );
    final SubLObject _prev_bind_3 = sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.currentBinding( thread );
    try
    {
      sbhl_marking_vars.$resourced_sbhl_marking_space_limit$.bind( sbhl_marking_vars.determine_resource_limit( already_resourcing_p, SIX_INTEGER ), thread );
      sbhl_marking_vars.$resourced_sbhl_marking_spaces$.bind( sbhl_marking_vars.possibly_new_marking_resource( already_resourcing_p ), thread );
      sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.bind( T, thread );
      final SubLObject set_var = rkf_salient_descriptor_datastructures.rkf_sd_prompter_unused_prompts( prompter );
      final SubLObject set_contents_var = set.do_set_internal( set_var );
      SubLObject basis_object;
      SubLObject state;
      SubLObject prompt;
      SubLObject cached_subprompts;
      for( basis_object = set_contents.do_set_contents_basis_object( set_contents_var ), state = NIL, state = set_contents.do_set_contents_initial_state( basis_object, set_contents_var ); NIL == set_contents
          .do_set_contents_doneP( basis_object, state ); state = set_contents.do_set_contents_update_state( state ) )
      {
        prompt = set_contents.do_set_contents_next( basis_object, state );
        if( NIL != set_contents.do_set_contents_element_validP( state, prompt ) )
        {
          cached_subprompts = rkf_salient_descriptor_datastructures.rkf_sd_prompt_subprompts( prompt );
          if( NIL == rkf_salient_descriptor.rkf_salient_descriptor_subprompts_p( cached_subprompts ) )
          {
            rkf_sd_prompt_compute_subprompts( prompt );
            if( NIL != rkf_sd_prompt_bad_subpromptsP( prompt, rkf_salient_descriptor_datastructures.rkf_sd_prompt_subprompts( prompt ) ) )
            {
              bad_prompts = ConsesLow.cons( prompt, bad_prompts );
            }
          }
        }
      }
    }
    finally
    {
      sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.rebind( _prev_bind_3, thread );
      sbhl_marking_vars.$resourced_sbhl_marking_spaces$.rebind( _prev_bind_2, thread );
      sbhl_marking_vars.$resourced_sbhl_marking_space_limit$.rebind( _prev_bind_0, thread );
    }
    SubLObject cdolist_list_var = bad_prompts;
    SubLObject bad_prompt = NIL;
    bad_prompt = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      rkf_sd_prompter_remove_unused_prompt( prompter, bad_prompt );
      cdolist_list_var = cdolist_list_var.rest();
      bad_prompt = cdolist_list_var.first();
    }
    return $kw19$DONE;
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-salient-descriptor-prompter.lisp", position = 77104L)
  public static SubLObject rkf_sd_prompt_bad_subpromptsP(final SubLObject prompt, final SubLObject subprompts)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject prompter = rkf_salient_descriptor_datastructures.rkf_sd_prompt_prompter( prompt );
    SubLObject badP = NIL;
    if( NIL != prompter )
    {
      final SubLObject local_state;
      final SubLObject state = local_state = rkf_salient_descriptor_datastructures.rkf_salient_descriptor_prompter_lookup( prompter, $kw20$MEMOIZATION_STATE, memoization_state.current_memoization_state() );
      final SubLObject _prev_bind_0 = memoization_state.$memoization_state$.currentBinding( thread );
      try
      {
        memoization_state.$memoization_state$.bind( local_state, thread );
        final SubLObject original_memoization_process = memoization_state.memoization_state_original_process( local_state );
        try
        {
          if( NIL == rkf_salient_descriptor.rkf_salient_descriptor_subprompts_p( subprompts ) )
          {
            badP = T;
          }
          else if( NIL == rkf_salient_descriptor.rkf_salient_descriptor_subprompt_assert_sentence( subprompts.first(), UNPROVIDED, UNPROVIDED ) )
          {
            badP = T;
          }
          else if( NIL != rkf_sd_not_assertible_subpromptsP( subprompts ) )
          {
            badP = T;
          }
          else if( NIL != rkf_sd_unparseable_subpromptsP( subprompts ) )
          {
            badP = T;
          }
        }
        finally
        {
          final SubLObject _prev_bind_0_$127 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
          try
          {
            Threads.$is_thread_performing_cleanupP$.bind( T, thread );
            final SubLObject _values = Values.getValuesAsVector();
            memoization_state.memoization_state_possibly_clear_original_process( local_state, original_memoization_process );
            Values.restoreValuesFromVector( _values );
          }
          finally
          {
            Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$127, thread );
          }
        }
      }
      finally
      {
        memoization_state.$memoization_state$.rebind( _prev_bind_0, thread );
      }
    }
    return badP;
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-salient-descriptor-prompter.lisp", position = 77716L)
  public static SubLObject rkf_sd_not_assertible_subpromptsP_internal(final SubLObject subprompts)
  {
    final SubLObject assert_sentence = rkf_salient_descriptor.rkf_salient_descriptor_subprompt_assert_sentence( subprompts.first(), UNPROVIDED, UNPROVIDED );
    return rkf_salient_descriptor.rkf_salient_descriptor_not_assertible_sentenceP( assert_sentence );
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-salient-descriptor-prompter.lisp", position = 77716L)
  public static SubLObject rkf_sd_not_assertible_subpromptsP(final SubLObject subprompts)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue( thread );
    SubLObject caching_state = NIL;
    if( NIL == v_memoization_state )
    {
      return rkf_sd_not_assertible_subpromptsP_internal( subprompts );
    }
    caching_state = memoization_state.memoization_state_lookup( v_memoization_state, $sym194$RKF_SD_NOT_ASSERTIBLE_SUBPROMPTS_, UNPROVIDED );
    if( NIL == caching_state )
    {
      caching_state = memoization_state.create_caching_state( memoization_state.memoization_state_lock( v_memoization_state ), $sym194$RKF_SD_NOT_ASSERTIBLE_SUBPROMPTS_, ONE_INTEGER, NIL, EQUAL, UNPROVIDED );
      memoization_state.memoization_state_put( v_memoization_state, $sym194$RKF_SD_NOT_ASSERTIBLE_SUBPROMPTS_, caching_state );
    }
    SubLObject results = memoization_state.caching_state_lookup( caching_state, subprompts, memoization_state.$memoized_item_not_found$.getGlobalValue() );
    if( results.eql( memoization_state.$memoized_item_not_found$.getGlobalValue() ) )
    {
      results = Values.arg2( thread.resetMultipleValues(), Values.multiple_value_list( rkf_sd_not_assertible_subpromptsP_internal( subprompts ) ) );
      memoization_state.caching_state_put( caching_state, subprompts, results, UNPROVIDED );
    }
    return memoization_state.caching_results( results );
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-salient-descriptor-prompter.lisp", position = 77975L)
  public static SubLObject rkf_sd_unparseable_subpromptsP_internal(final SubLObject subprompts)
  {
    SubLObject badP = NIL;
    if( NIL == badP )
    {
      SubLObject csome_list_var = subprompts;
      SubLObject subprompt = NIL;
      subprompt = csome_list_var.first();
      while ( NIL == badP && NIL != csome_list_var)
      {
        if( $kw35$SPECIFY == rkf_salient_descriptor.rkf_salient_descriptor_subprompt_type( subprompt ) )
        {
          final SubLObject var = conses_high.second( subprompt );
          final SubLObject constraint_formula = conses_high.third( subprompt );
          if( NIL != el_utilities.el_conjunction_p( constraint_formula ) )
          {
            if( NIL == badP )
            {
              SubLObject csome_list_var_$128;
              SubLObject conjunct;
              for( csome_list_var_$128 = cycl_utilities.formula_args( constraint_formula, UNPROVIDED ), conjunct = NIL, conjunct = csome_list_var_$128.first(); NIL == badP
                  && NIL != csome_list_var_$128; badP = rkf_sd_unparseable_prompt_litP( conjunct, var ), csome_list_var_$128 = csome_list_var_$128.rest(), conjunct = csome_list_var_$128.first() )
              {
              }
            }
          }
          else if( NIL != rkf_sd_unparseable_prompt_litP( constraint_formula, var ) )
          {
            badP = T;
          }
        }
        csome_list_var = csome_list_var.rest();
        subprompt = csome_list_var.first();
      }
    }
    return badP;
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-salient-descriptor-prompter.lisp", position = 77975L)
  public static SubLObject rkf_sd_unparseable_subpromptsP(final SubLObject subprompts)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue( thread );
    SubLObject caching_state = NIL;
    if( NIL == v_memoization_state )
    {
      return rkf_sd_unparseable_subpromptsP_internal( subprompts );
    }
    caching_state = memoization_state.memoization_state_lookup( v_memoization_state, $sym195$RKF_SD_UNPARSEABLE_SUBPROMPTS_, UNPROVIDED );
    if( NIL == caching_state )
    {
      caching_state = memoization_state.create_caching_state( memoization_state.memoization_state_lock( v_memoization_state ), $sym195$RKF_SD_UNPARSEABLE_SUBPROMPTS_, ONE_INTEGER, NIL, EQUAL, UNPROVIDED );
      memoization_state.memoization_state_put( v_memoization_state, $sym195$RKF_SD_UNPARSEABLE_SUBPROMPTS_, caching_state );
    }
    SubLObject results = memoization_state.caching_state_lookup( caching_state, subprompts, memoization_state.$memoized_item_not_found$.getGlobalValue() );
    if( results.eql( memoization_state.$memoized_item_not_found$.getGlobalValue() ) )
    {
      results = Values.arg2( thread.resetMultipleValues(), Values.multiple_value_list( rkf_sd_unparseable_subpromptsP_internal( subprompts ) ) );
      memoization_state.caching_state_put( caching_state, subprompts, results, UNPROVIDED );
    }
    return memoization_state.caching_results( results );
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-salient-descriptor-prompter.lisp", position = 78559L)
  public static SubLObject rkf_sd_unparseable_prompt_litP_internal(final SubLObject conjunct, final SubLObject var)
  {
    if( NIL != formula_pattern_match.formula_matches_pattern( conjunct, ConsesLow.listS( $const92$isa, var, $list197 ) ) )
    {
      final SubLObject target_type = cycl_utilities.formula_arg2( conjunct, UNPROVIDED );
      if( NIL != rkf_unparseable_arg_typeP( target_type ) || NIL != rkf_no_instances_arg_typeP( target_type ) )
      {
        return T;
      }
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-salient-descriptor-prompter.lisp", position = 78559L)
  public static SubLObject rkf_sd_unparseable_prompt_litP(final SubLObject conjunct, final SubLObject var)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue( thread );
    SubLObject caching_state = NIL;
    if( NIL == v_memoization_state )
    {
      return rkf_sd_unparseable_prompt_litP_internal( conjunct, var );
    }
    caching_state = memoization_state.memoization_state_lookup( v_memoization_state, $sym196$RKF_SD_UNPARSEABLE_PROMPT_LIT_, UNPROVIDED );
    if( NIL == caching_state )
    {
      caching_state = memoization_state.create_caching_state( memoization_state.memoization_state_lock( v_memoization_state ), $sym196$RKF_SD_UNPARSEABLE_PROMPT_LIT_, TWO_INTEGER, NIL, EQUAL, UNPROVIDED );
      memoization_state.memoization_state_put( v_memoization_state, $sym196$RKF_SD_UNPARSEABLE_PROMPT_LIT_, caching_state );
    }
    final SubLObject sxhash = memoization_state.sxhash_calc_2( conjunct, var );
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
        if( conjunct.equal( cached_args.first() ) )
        {
          cached_args = cached_args.rest();
          if( NIL != cached_args && NIL == cached_args.rest() && var.equal( cached_args.first() ) )
          {
            return memoization_state.caching_results( results2 );
          }
        }
        cdolist_list_var = cdolist_list_var.rest();
        collision = cdolist_list_var.first();
      }
    }
    final SubLObject results3 = Values.arg2( thread.resetMultipleValues(), Values.multiple_value_list( rkf_sd_unparseable_prompt_litP_internal( conjunct, var ) ) );
    memoization_state.caching_state_enter_multi_key_n( caching_state, sxhash, collisions, results3, ConsesLow.list( conjunct, var ) );
    return memoization_state.caching_results( results3 );
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-salient-descriptor-prompter.lisp", position = 79034L)
  public static SubLObject rkf_unparseable_arg_typeP(final SubLObject v_arg_type)
  {
    SubLObject badP = NIL;
    if( NIL == badP )
    {
      SubLObject csome_list_var;
      SubLObject bad_arg_type;
      for( csome_list_var = $rkf_unparseable_arg_types$.getGlobalValue(), bad_arg_type = NIL, bad_arg_type = csome_list_var.first(); NIL == badP && NIL != csome_list_var; badP = genls.genl_in_any_mtP( v_arg_type,
          bad_arg_type ), csome_list_var = csome_list_var.rest(), bad_arg_type = csome_list_var.first() )
      {
      }
    }
    return badP;
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-salient-descriptor-prompter.lisp", position = 79245L)
  public static SubLObject rkf_no_instances_arg_typeP(final SubLObject v_arg_type)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject okP = NIL;
    final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding( thread );
    final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding( thread );
    try
    {
      mt_relevance_macros.$relevant_mt_function$.bind( $sym102$RELEVANT_MT_IS_EVERYTHING, thread );
      mt_relevance_macros.$mt$.bind( $const103$EverythingPSC, thread );
      if( NIL == okP )
      {
        SubLObject node_var = v_arg_type;
        final SubLObject deck_type = $kw106$STACK;
        final SubLObject recur_deck = deck.create_deck( deck_type );
        final SubLObject _prev_bind_0_$129 = sbhl_marking_vars.$sbhl_space$.currentBinding( thread );
        try
        {
          sbhl_marking_vars.$sbhl_space$.bind( sbhl_marking_vars.get_sbhl_marking_space(), thread );
          try
          {
            final SubLObject tv_var = $const107$True_JustificationTruth;
            final SubLObject _prev_bind_0_$130 = sbhl_search_vars.$sbhl_tv$.currentBinding( thread );
            final SubLObject _prev_bind_1_$131 = sbhl_search_vars.$relevant_sbhl_tv_function$.currentBinding( thread );
            try
            {
              sbhl_search_vars.$sbhl_tv$.bind( ( NIL != tv_var ) ? tv_var : sbhl_search_vars.get_sbhl_true_tv(), thread );
              sbhl_search_vars.$relevant_sbhl_tv_function$.bind( ( NIL != tv_var ) ? $sym108$RELEVANT_SBHL_TV_IS_GENERAL_TV : sbhl_search_vars.$relevant_sbhl_tv_function$.getDynamicValue( thread ), thread );
              if( NIL != tv_var && NIL != sbhl_paranoia.sbhl_object_type_checking_p() && NIL == sbhl_search_vars.sbhl_true_tv_p( tv_var ) )
              {
                final SubLObject pcase_var = sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue( thread );
                if( pcase_var.eql( $kw109$ERROR ) )
                {
                  sbhl_paranoia.sbhl_error( ONE_INTEGER, $str110$_A_is_not_a__A, tv_var, $sym111$SBHL_TRUE_TV_P, UNPROVIDED, UNPROVIDED, UNPROVIDED );
                }
                else if( pcase_var.eql( $kw112$CERROR ) )
                {
                  sbhl_paranoia.sbhl_cerror( ONE_INTEGER, $str113$continue_anyway, $str110$_A_is_not_a__A, tv_var, $sym111$SBHL_TRUE_TV_P, UNPROVIDED, UNPROVIDED, UNPROVIDED );
                }
                else if( pcase_var.eql( $kw114$WARN ) )
                {
                  Errors.warn( $str110$_A_is_not_a__A, tv_var, $sym111$SBHL_TRUE_TV_P );
                }
                else
                {
                  Errors.warn( $str115$_A_is_not_a_valid__sbhl_type_erro, sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue( thread ) );
                  Errors.cerror( $str113$continue_anyway, $str110$_A_is_not_a__A, tv_var, $sym111$SBHL_TRUE_TV_P );
                }
              }
              final SubLObject _prev_bind_0_$131 = sbhl_search_vars.$sbhl_search_module$.currentBinding( thread );
              final SubLObject _prev_bind_1_$132 = sbhl_search_vars.$sbhl_search_module_type$.currentBinding( thread );
              final SubLObject _prev_bind_3 = sbhl_search_vars.$sbhl_add_node_to_result_test$.currentBinding( thread );
              final SubLObject _prev_bind_4 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding( thread );
              final SubLObject _prev_bind_5 = sbhl_module_vars.$sbhl_module$.currentBinding( thread );
              try
              {
                sbhl_search_vars.$sbhl_search_module$.bind( sbhl_module_vars.get_sbhl_module( $const116$genls ), thread );
                sbhl_search_vars.$sbhl_search_module_type$.bind( sbhl_module_utilities.get_sbhl_module_type( sbhl_module_vars.get_sbhl_module( $const116$genls ) ), thread );
                sbhl_search_vars.$sbhl_add_node_to_result_test$.bind( sbhl_module_utilities.get_sbhl_add_node_to_result_test( sbhl_module_vars.get_sbhl_module( $const116$genls ) ), thread );
                sbhl_search_vars.$genl_inverse_mode_p$.bind( NIL, thread );
                sbhl_module_vars.$sbhl_module$.bind( sbhl_module_vars.get_sbhl_module( $const116$genls ), thread );
                if( NIL != sbhl_paranoia.suspend_sbhl_type_checkingP() || NIL != sbhl_module_utilities.apply_sbhl_module_type_test( v_arg_type, sbhl_module_vars.get_sbhl_module( UNPROVIDED ) ) )
                {
                  final SubLObject _prev_bind_0_$132 = sbhl_search_vars.$sbhl_search_direction$.currentBinding( thread );
                  final SubLObject _prev_bind_1_$133 = sbhl_link_vars.$sbhl_link_direction$.currentBinding( thread );
                  final SubLObject _prev_bind_2_$136 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding( thread );
                  try
                  {
                    sbhl_search_vars.$sbhl_search_direction$.bind( sbhl_search_vars.get_sbhl_backward_search_direction(), thread );
                    sbhl_link_vars.$sbhl_link_direction$.bind( sbhl_module_utilities.sbhl_search_direction_to_link_direction( sbhl_search_vars.get_sbhl_backward_search_direction(), sbhl_module_vars.get_sbhl_module(
                        $const116$genls ) ), thread );
                    sbhl_search_vars.$genl_inverse_mode_p$.bind( NIL, thread );
                    sbhl_marking_utilities.sbhl_mark_node_marked( node_var, UNPROVIDED );
                    while ( NIL != node_var && NIL == okP)
                    {
                      final SubLObject spec = node_var;
                      okP = rkf_direct_instances_arg_typeP( spec );
                      final SubLObject accessible_modules = sbhl_macros.get_sbhl_accessible_modules( sbhl_module_vars.get_sbhl_module( $const116$genls ) );
                      SubLObject rest;
                      SubLObject module_var;
                      SubLObject _prev_bind_0_$133;
                      SubLObject _prev_bind_1_$134;
                      SubLObject node;
                      SubLObject d_link;
                      SubLObject mt_links;
                      SubLObject iteration_state;
                      SubLObject mt;
                      SubLObject tv_links;
                      SubLObject _prev_bind_0_$134;
                      SubLObject iteration_state_$140;
                      SubLObject tv;
                      SubLObject link_nodes;
                      SubLObject _prev_bind_0_$135;
                      SubLObject sol;
                      SubLObject set_contents_var;
                      SubLObject basis_object;
                      SubLObject state;
                      SubLObject node_vars_link_node;
                      SubLObject csome_list_var;
                      SubLObject node_vars_link_node2;
                      SubLObject new_list;
                      SubLObject rest_$142;
                      SubLObject generating_fn;
                      SubLObject _prev_bind_0_$136;
                      SubLObject sol2;
                      SubLObject link_nodes2;
                      SubLObject set_contents_var2;
                      SubLObject basis_object2;
                      SubLObject state2;
                      SubLObject node_vars_link_node3;
                      SubLObject csome_list_var2;
                      SubLObject node_vars_link_node4;
                      for( rest = NIL, rest = accessible_modules; NIL == okP && NIL != rest; rest = rest.rest() )
                      {
                        module_var = rest.first();
                        _prev_bind_0_$133 = sbhl_module_vars.$sbhl_module$.currentBinding( thread );
                        _prev_bind_1_$134 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding( thread );
                        try
                        {
                          sbhl_module_vars.$sbhl_module$.bind( module_var, thread );
                          sbhl_search_vars.$genl_inverse_mode_p$.bind( ( NIL != sbhl_search_vars.flip_genl_inverse_modeP( UNPROVIDED, UNPROVIDED ) ) ? makeBoolean( NIL == sbhl_search_vars.$genl_inverse_mode_p$
                              .getDynamicValue( thread ) ) : sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue( thread ), thread );
                          node = function_terms.naut_to_nart( node_var );
                          if( NIL != sbhl_link_vars.sbhl_node_object_p( node ) )
                          {
                            d_link = sbhl_graphs.get_sbhl_graph_link( node, sbhl_module_vars.get_sbhl_module( UNPROVIDED ) );
                            if( NIL != d_link )
                            {
                              mt_links = sbhl_links.get_sbhl_mt_links( d_link, sbhl_link_vars.get_sbhl_link_direction(), sbhl_module_vars.get_sbhl_module( UNPROVIDED ) );
                              if( NIL != mt_links )
                              {
                                for( iteration_state = dictionary_contents.do_dictionary_contents_state( dictionary.dictionary_contents( mt_links ) ); NIL == okP && NIL == dictionary_contents
                                    .do_dictionary_contents_doneP( iteration_state ); iteration_state = dictionary_contents.do_dictionary_contents_next( iteration_state ) )
                                {
                                  thread.resetMultipleValues();
                                  mt = dictionary_contents.do_dictionary_contents_key_value( iteration_state );
                                  tv_links = thread.secondMultipleValue();
                                  thread.resetMultipleValues();
                                  if( NIL != mt_relevance_macros.relevant_mtP( mt ) )
                                  {
                                    _prev_bind_0_$134 = sbhl_link_vars.$sbhl_link_mt$.currentBinding( thread );
                                    try
                                    {
                                      sbhl_link_vars.$sbhl_link_mt$.bind( mt, thread );
                                      for( iteration_state_$140 = dictionary_contents.do_dictionary_contents_state( dictionary.dictionary_contents( tv_links ) ); NIL == okP && NIL == dictionary_contents
                                          .do_dictionary_contents_doneP( iteration_state_$140 ); iteration_state_$140 = dictionary_contents.do_dictionary_contents_next( iteration_state_$140 ) )
                                      {
                                        thread.resetMultipleValues();
                                        tv = dictionary_contents.do_dictionary_contents_key_value( iteration_state_$140 );
                                        link_nodes = thread.secondMultipleValue();
                                        thread.resetMultipleValues();
                                        if( NIL != sbhl_search_vars.relevant_sbhl_tvP( tv ) )
                                        {
                                          _prev_bind_0_$135 = sbhl_link_vars.$sbhl_link_tv$.currentBinding( thread );
                                          try
                                          {
                                            sbhl_link_vars.$sbhl_link_tv$.bind( tv, thread );
                                            sol = link_nodes;
                                            if( NIL != set.set_p( sol ) )
                                            {
                                              set_contents_var = set.do_set_internal( sol );
                                              for( basis_object = set_contents.do_set_contents_basis_object( set_contents_var ), state = NIL, state = set_contents.do_set_contents_initial_state( basis_object,
                                                  set_contents_var ); NIL == okP && NIL == set_contents.do_set_contents_doneP( basis_object, state ); state = set_contents.do_set_contents_update_state( state ) )
                                              {
                                                node_vars_link_node = set_contents.do_set_contents_next( basis_object, state );
                                                if( NIL != set_contents.do_set_contents_element_validP( state, node_vars_link_node ) && NIL == sbhl_marking_utilities.sbhl_search_path_termination_p( node_vars_link_node,
                                                    UNPROVIDED ) )
                                                {
                                                  sbhl_marking_utilities.sbhl_mark_node_marked( node_vars_link_node, UNPROVIDED );
                                                  deck.deck_push( node_vars_link_node, recur_deck );
                                                }
                                              }
                                            }
                                            else if( sol.isList() )
                                            {
                                              if( NIL == okP )
                                              {
                                                csome_list_var = sol;
                                                node_vars_link_node2 = NIL;
                                                node_vars_link_node2 = csome_list_var.first();
                                                while ( NIL == okP && NIL != csome_list_var)
                                                {
                                                  if( NIL == sbhl_marking_utilities.sbhl_search_path_termination_p( node_vars_link_node2, UNPROVIDED ) )
                                                  {
                                                    sbhl_marking_utilities.sbhl_mark_node_marked( node_vars_link_node2, UNPROVIDED );
                                                    deck.deck_push( node_vars_link_node2, recur_deck );
                                                  }
                                                  csome_list_var = csome_list_var.rest();
                                                  node_vars_link_node2 = csome_list_var.first();
                                                }
                                              }
                                            }
                                            else
                                            {
                                              Errors.error( $str118$_A_is_neither_SET_P_nor_LISTP_, sol );
                                            }
                                          }
                                          finally
                                          {
                                            sbhl_link_vars.$sbhl_link_tv$.rebind( _prev_bind_0_$135, thread );
                                          }
                                        }
                                      }
                                      dictionary_contents.do_dictionary_contents_finalize( iteration_state_$140 );
                                    }
                                    finally
                                    {
                                      sbhl_link_vars.$sbhl_link_mt$.rebind( _prev_bind_0_$134, thread );
                                    }
                                  }
                                }
                                dictionary_contents.do_dictionary_contents_finalize( iteration_state );
                              }
                            }
                            else
                            {
                              sbhl_paranoia.sbhl_error( FIVE_INTEGER, $str119$attempting_to_bind_direction_link, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
                            }
                          }
                          else if( NIL != obsolete.cnat_p( node, UNPROVIDED ) )
                          {
                            new_list = ( ( NIL != sbhl_link_vars.sbhl_randomize_lists_p() ) ? list_utilities.randomize_list( sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators( sbhl_link_vars
                                .get_sbhl_link_direction(), sbhl_search_vars.$sbhl_tv$.getDynamicValue( thread ), sbhl_module_vars.get_sbhl_module( UNPROVIDED ) ) )
                                : sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators( sbhl_link_vars.get_sbhl_link_direction(), sbhl_search_vars.$sbhl_tv$.getDynamicValue( thread ), sbhl_module_vars
                                    .get_sbhl_module( UNPROVIDED ) ) );
                            for( rest_$142 = NIL, rest_$142 = new_list; NIL == okP && NIL != rest_$142; rest_$142 = rest_$142.rest() )
                            {
                              generating_fn = rest_$142.first();
                              _prev_bind_0_$136 = sbhl_link_vars.$sbhl_link_generator$.currentBinding( thread );
                              try
                              {
                                sbhl_link_vars.$sbhl_link_generator$.bind( generating_fn, thread );
                                link_nodes2 = ( sol2 = Functions.funcall( generating_fn, node ) );
                                if( NIL != set.set_p( sol2 ) )
                                {
                                  set_contents_var2 = set.do_set_internal( sol2 );
                                  for( basis_object2 = set_contents.do_set_contents_basis_object( set_contents_var2 ), state2 = NIL, state2 = set_contents.do_set_contents_initial_state( basis_object2,
                                      set_contents_var2 ); NIL == okP && NIL == set_contents.do_set_contents_doneP( basis_object2, state2 ); state2 = set_contents.do_set_contents_update_state( state2 ) )
                                  {
                                    node_vars_link_node3 = set_contents.do_set_contents_next( basis_object2, state2 );
                                    if( NIL != set_contents.do_set_contents_element_validP( state2, node_vars_link_node3 ) && NIL == sbhl_marking_utilities.sbhl_search_path_termination_p( node_vars_link_node3,
                                        UNPROVIDED ) )
                                    {
                                      sbhl_marking_utilities.sbhl_mark_node_marked( node_vars_link_node3, UNPROVIDED );
                                      deck.deck_push( node_vars_link_node3, recur_deck );
                                    }
                                  }
                                }
                                else if( sol2.isList() )
                                {
                                  if( NIL == okP )
                                  {
                                    csome_list_var2 = sol2;
                                    node_vars_link_node4 = NIL;
                                    node_vars_link_node4 = csome_list_var2.first();
                                    while ( NIL == okP && NIL != csome_list_var2)
                                    {
                                      if( NIL == sbhl_marking_utilities.sbhl_search_path_termination_p( node_vars_link_node4, UNPROVIDED ) )
                                      {
                                        sbhl_marking_utilities.sbhl_mark_node_marked( node_vars_link_node4, UNPROVIDED );
                                        deck.deck_push( node_vars_link_node4, recur_deck );
                                      }
                                      csome_list_var2 = csome_list_var2.rest();
                                      node_vars_link_node4 = csome_list_var2.first();
                                    }
                                  }
                                }
                                else
                                {
                                  Errors.error( $str118$_A_is_neither_SET_P_nor_LISTP_, sol2 );
                                }
                              }
                              finally
                              {
                                sbhl_link_vars.$sbhl_link_generator$.rebind( _prev_bind_0_$136, thread );
                              }
                            }
                          }
                        }
                        finally
                        {
                          sbhl_search_vars.$genl_inverse_mode_p$.rebind( _prev_bind_1_$134, thread );
                          sbhl_module_vars.$sbhl_module$.rebind( _prev_bind_0_$133, thread );
                        }
                      }
                      node_var = deck.deck_pop( recur_deck );
                    }
                  }
                  finally
                  {
                    sbhl_search_vars.$genl_inverse_mode_p$.rebind( _prev_bind_2_$136, thread );
                    sbhl_link_vars.$sbhl_link_direction$.rebind( _prev_bind_1_$133, thread );
                    sbhl_search_vars.$sbhl_search_direction$.rebind( _prev_bind_0_$132, thread );
                  }
                }
                else
                {
                  sbhl_paranoia.sbhl_warn( TWO_INTEGER, $str120$Node__a_does_not_pass_sbhl_type_t, v_arg_type, sbhl_module_utilities.get_sbhl_type_test( sbhl_module_vars.get_sbhl_module( UNPROVIDED ) ), UNPROVIDED,
                      UNPROVIDED, UNPROVIDED );
                }
              }
              finally
              {
                sbhl_module_vars.$sbhl_module$.rebind( _prev_bind_5, thread );
                sbhl_search_vars.$genl_inverse_mode_p$.rebind( _prev_bind_4, thread );
                sbhl_search_vars.$sbhl_add_node_to_result_test$.rebind( _prev_bind_3, thread );
                sbhl_search_vars.$sbhl_search_module_type$.rebind( _prev_bind_1_$132, thread );
                sbhl_search_vars.$sbhl_search_module$.rebind( _prev_bind_0_$131, thread );
              }
            }
            finally
            {
              sbhl_search_vars.$relevant_sbhl_tv_function$.rebind( _prev_bind_1_$131, thread );
              sbhl_search_vars.$sbhl_tv$.rebind( _prev_bind_0_$130, thread );
            }
          }
          finally
          {
            final SubLObject _prev_bind_0_$137 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
            try
            {
              Threads.$is_thread_performing_cleanupP$.bind( T, thread );
              final SubLObject _values = Values.getValuesAsVector();
              sbhl_marking_vars.free_sbhl_marking_space( sbhl_marking_vars.$sbhl_space$.getDynamicValue( thread ) );
              Values.restoreValuesFromVector( _values );
            }
            finally
            {
              Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$137, thread );
            }
          }
        }
        finally
        {
          sbhl_marking_vars.$sbhl_space$.rebind( _prev_bind_0_$129, thread );
        }
      }
    }
    finally
    {
      mt_relevance_macros.$mt$.rebind( _prev_bind_2, thread );
      mt_relevance_macros.$relevant_mt_function$.rebind( _prev_bind_0, thread );
    }
    return makeBoolean( NIL == okP );
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-salient-descriptor-prompter.lisp", position = 79572L)
  public static SubLObject rkf_direct_instances_arg_typeP(final SubLObject v_arg_type)
  {
    return makeBoolean( NIL != kb_mapping_utilities.some_pred_value_in_any_mt( v_arg_type, $const92$isa, TWO_INTEGER, $kw175$TRUE ) || NIL != kb_mapping_utilities.some_pred_value_in_any_mt( v_arg_type,
        $const199$defnSufficient, ONE_INTEGER, $kw175$TRUE ) || NIL != kb_mapping_utilities.some_pred_value_in_any_mt( v_arg_type, $const200$defnIff, ONE_INTEGER, $kw175$TRUE ) || NIL != kb_mapping_utilities
            .some_pred_value_in_any_mt( v_arg_type, $const201$resultIsa, TWO_INTEGER, $kw175$TRUE ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-salient-descriptor-prompter.lisp", position = 79886L)
  public static SubLObject rkf_sd_prompter_find_rule_prompts(final SubLObject prompter)
  {
    final SubLObject rule = rkf_salient_descriptor_datastructures.rkf_sd_prompter_seed_term( prompter );
    final SubLObject mt = rkf_salient_descriptor_datastructures.rkf_sd_prompter_mt( prompter );
    SubLObject cdolist_list_var;
    final SubLObject local_terms = cdolist_list_var = ConsesLow.append( rkf_term_utilities.rkf_terms_created_in_interaction_mt( mt ), isa.all_fort_instances( $const202$CoaDiagramObject, mt, UNPROVIDED ) );
    SubLObject local_term = NIL;
    local_term = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      SubLObject cdolist_list_var_$145 = rkf_salient_descriptor.rkf_rule_cnfs_for_term( rule, local_term, mt );
      SubLObject cnf_pair = NIL;
      cnf_pair = cdolist_list_var_$145.first();
      while ( NIL != cdolist_list_var_$145)
      {
        SubLObject current;
        final SubLObject datum = current = cnf_pair;
        SubLObject unknown_cnf = NIL;
        SubLObject just_sentence = NIL;
        cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list203 );
        unknown_cnf = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list203 );
        just_sentence = current.first();
        current = current.rest();
        if( NIL == current )
        {
          final SubLObject prompt = rkf_sd_prompt_from_cnf( unknown_cnf, local_term );
          final SubLObject justification = rkf_sd_prompt_justification_from_sentence( just_sentence, mt );
          rkf_salient_descriptor_datastructures.rkf_sd_prompt_set_justification( prompt, justification );
          rkf_salient_descriptor_datastructures.rkf_sd_prompt_set_tactic( prompt, $sym204$RKF_SD_PROMPTER_FIND_RULE_PROMPTS );
          rkf_sd_prompter_add_prompt( prompter, prompt );
          rkf_sd_prompt_compute_subprompts( prompt );
        }
        else
        {
          cdestructuring_bind.cdestructuring_bind_error( datum, $list203 );
        }
        cdolist_list_var_$145 = cdolist_list_var_$145.rest();
        cnf_pair = cdolist_list_var_$145.first();
      }
      cdolist_list_var = cdolist_list_var.rest();
      local_term = cdolist_list_var.first();
    }
    return $kw19$DONE;
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-salient-descriptor-prompter.lisp", position = 80858L)
  public static SubLObject rkf_sd_prompt_justification_from_sentence(final SubLObject just_sentence, final SubLObject mt)
  {
    final SubLObject ask_results = ask_utilities.ask_justified( just_sentence, mt, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
    if( NIL != cyc_kernel.closed_query_justified_success_result_p( ask_results ) )
    {
      final SubLObject result = ask_results.first();
      final SubLObject ask_justification = conses_high.second( result );
      return ask_justification;
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-salient-descriptor-prompter.lisp", position = 81184L)
  public static SubLObject rkf_sd_prompt_from_cnf(final SubLObject cnf, final SubLObject v_term)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject prompt = rkf_salient_descriptor_datastructures.new_rkf_sd_prompt();
    thread.resetMultipleValues();
    final SubLObject formula = rkf_sd_prompt_formula_for_cnf( cnf, v_term );
    final SubLObject new_cnf = thread.secondMultipleValue();
    thread.resetMultipleValues();
    if( NIL != el_utilities.el_formula_p( formula ) )
    {
      rkf_salient_descriptor_datastructures.rkf_sd_prompt_set_formula( prompt, formula );
      rkf_salient_descriptor_datastructures._csetf_rkf_sd_prompt_deducible_cnfs( prompt, ConsesLow.cons( new_cnf, rkf_salient_descriptor_datastructures.rkf_sd_prompt_deducible_cnfs( prompt ) ) );
    }
    return prompt;
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-salient-descriptor-prompter.lisp", position = 81516L)
  public static SubLObject rkf_sd_prompt_formula_for_cnf(final SubLObject cnf, final SubLObject v_term)
  {
    final SubLObject neg_lits = clauses.neg_lits( cnf );
    final SubLObject bound_neg_lits = list_utilities.remove_if_not( $sym205$RKF_SD_EL_FULLY_BOUND_P, neg_lits, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
    final SubLObject unbound_neg_lits = ( NIL != bound_neg_lits ) ? conses_high.set_difference( neg_lits, bound_neg_lits, Symbols.symbol_function( EQUAL ), UNPROVIDED ) : neg_lits;
    final SubLObject conjunction = rkf_salient_descriptor.rkf_sd_conjoin( ( NIL != bound_neg_lits ) ? bound_neg_lits : unbound_neg_lits, T, NIL );
    final SubLObject formula = rkf_sd_prompt_formula_for_lit( conjunction );
    final SubLObject new_neg_lits = ( NIL != bound_neg_lits ) ? unbound_neg_lits : NIL;
    final SubLObject new_cnf = clauses.make_clause( new_neg_lits, clauses.pos_lits( cnf ) );
    return Values.values( formula, new_cnf );
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-salient-descriptor-prompter.lisp", position = 82109L)
  public static SubLObject rkf_sd_prompt_formula_for_lit(final SubLObject lit)
  {
    SubLObject formula = lit;
    SubLObject cdolist_list_var = el_utilities.sentence_free_variables( lit, UNPROVIDED, UNPROVIDED, UNPROVIDED );
    SubLObject var = NIL;
    var = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      formula = el_utilities.make_existential( var, formula );
      cdolist_list_var = cdolist_list_var.rest();
      var = cdolist_list_var.first();
    }
    return formula;
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-salient-descriptor-prompter.lisp", position = 82309L)
  public static SubLObject rkf_sd_prompter_example_instance_induced_strong(final SubLObject prompter)
  {
    return rkf_sd_prompter_example_instance_induced( prompter, $kw206$STRONG );
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-salient-descriptor-prompter.lisp", position = 82508L)
  public static SubLObject rkf_sd_prompter_example_instance_induced_weak(final SubLObject prompter)
  {
    return rkf_sd_prompter_example_instance_induced( prompter, $kw207$WEAK );
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-salient-descriptor-prompter.lisp", position = 82649L)
  public static SubLObject rkf_sd_prompter_example_instance_induced(final SubLObject prompter, final SubLObject strength)
  {
    final SubLObject example_instance = rkf_salient_descriptor_prompter_seed_term( prompter );
    final SubLObject arg1 = cycl_utilities.nat_arg1( example_instance, UNPROVIDED );
    final SubLObject collection = ( NIL != rkf_domain_examples.rkf_generic_example_instance_level_p( example_instance ) ) ? arg1 : el_utilities.make_specs_fn( arg1 );
    final SubLObject mt = rkf_salient_descriptor_prompter_mt( prompter );
    SubLObject cdolist_list_var = rkf_salient_descriptor.rkf_induced_salient_descriptor_binary_preds( mt, collection, $kw209$ISA, TEN_INTEGER, strength, UNPROVIDED );
    SubLObject cons = NIL;
    cons = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      SubLObject current;
      final SubLObject datum = current = cons;
      SubLObject binary_pred = NIL;
      SubLObject count = NIL;
      cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list208 );
      binary_pred = current.first();
      current = ( count = current.rest() );
      if( NIL != rkf_sd_binary_pred_ok_for_promptsP( binary_pred ) )
      {
        final SubLObject prompt = rkf_sd_prompt_example_instance_prompt( binary_pred, collection, mt );
        rkf_sd_prompter_add_prompt( prompter, prompt );
      }
      cdolist_list_var = cdolist_list_var.rest();
      cons = cdolist_list_var.first();
    }
    return $kw19$DONE;
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-salient-descriptor-prompter.lisp", position = 83442L)
  public static SubLObject rkf_sd_prompter_example_instance_noninduced(final SubLObject prompter)
  {
    final SubLObject example_instance = rkf_salient_descriptor_prompter_seed_term( prompter );
    final SubLObject collection = cycl_utilities.nat_arg1( example_instance, UNPROVIDED );
    final SubLObject mt = rkf_salient_descriptor_prompter_mt( prompter );
    SubLObject cdolist_list_var = rkf_salient_descriptor.rkf_noninduced_salient_descriptor_binary_preds( mt, collection, $kw209$ISA );
    SubLObject binary_pred = NIL;
    binary_pred = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      if( NIL != rkf_sd_binary_pred_ok_for_promptsP( binary_pred ) )
      {
        final SubLObject prompt = rkf_sd_prompt_example_instance_prompt( binary_pred, collection, mt );
        rkf_sd_prompter_add_prompt( prompter, prompt );
      }
      cdolist_list_var = cdolist_list_var.rest();
      binary_pred = cdolist_list_var.first();
    }
    return $kw19$DONE;
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-salient-descriptor-prompter.lisp", position = 84090L)
  public static SubLObject rkf_sd_binary_pred_ok_for_promptsP(final SubLObject binary_pred)
  {
    if( NIL != rkf_binary_pred_arg2_unparseableP( binary_pred ) )
    {
      return NIL;
    }
    return T;
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-salient-descriptor-prompter.lisp", position = 84249L)
  public static SubLObject rkf_binary_pred_arg2_unparseableP(final SubLObject binary_pred)
  {
    SubLObject badP = NIL;
    if( NIL == badP )
    {
      SubLObject csome_list_var;
      SubLObject v_arg_type;
      for( csome_list_var = kb_accessors.argn_isa( binary_pred, TWO_INTEGER, UNPROVIDED ), v_arg_type = NIL, v_arg_type = csome_list_var.first(); NIL == badP && NIL != csome_list_var; badP = rkf_unparseable_arg_typeP(
          v_arg_type ), csome_list_var = csome_list_var.rest(), v_arg_type = csome_list_var.first() )
      {
      }
    }
    return badP;
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-salient-descriptor-prompter.lisp", position = 84461L)
  public static SubLObject rkf_sd_prompt_example_instance_prompt(final SubLObject binary_pred, final SubLObject collection, final SubLObject mt)
  {
    final SubLObject new_prompt = rkf_salient_descriptor_datastructures.new_rkf_sd_prompt();
    final SubLObject v_term = rkf_domain_examples.rkf_generic_example_for_collection( collection );
    final SubLObject formula = rkf_sd_prompt_example_instance_sentence( binary_pred, v_term, mt );
    final SubLObject rule_spec = rkf_salient_descriptor.new_rkf_salient_descriptor_rule_spec( $kw210$BIN_PRED, $kw209$ISA, collection, binary_pred );
    final SubLObject justification = rkf_salient_descriptor.rkf_rule_spec_supports( v_term, rule_spec, mt );
    final SubLObject tactic = $sym211$RKF_SD_PROMPT_EXAMPLE_INSTANCE;
    rkf_salient_descriptor_datastructures.rkf_sd_prompt_set_formula( new_prompt, formula );
    rkf_salient_descriptor_datastructures.rkf_sd_prompt_set_tactic( new_prompt, tactic );
    rkf_salient_descriptor_datastructures.rkf_sd_prompt_set_justification( new_prompt, justification );
    return new_prompt;
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-salient-descriptor-prompter.lisp", position = 85104L)
  public static SubLObject rkf_sd_prompt_example_instance_sentence(final SubLObject binary_pred, final SubLObject v_term, final SubLObject mt)
  {
    final SubLObject arg2_collection = rkf_concept_clarifier.rkf_salient_argn_isa( binary_pred, TWO_INTEGER, mt );
    final SubLObject arg2 = rkf_domain_examples.rkf_generic_example_for_collection( arg2_collection );
    final SubLObject sentence = el_utilities.make_binary_formula( binary_pred, cycl_utilities.hl_to_el( v_term ), arg2 );
    return sentence;
  }

  public static SubLObject declare_rkf_salient_descriptor_prompter_file()
  {
    SubLFiles.declareFunction( me, "rkf_salient_descriptor_prompter_prune_unused_prompts", "RKF-SALIENT-DESCRIPTOR-PROMPTER-PRUNE-UNUSED-PROMPTS", 1, 0, false );
    SubLFiles.declareFunction( me, "rkf_salient_descriptor_prompter_prompt_count", "RKF-SALIENT-DESCRIPTOR-PROMPTER-PROMPT-COUNT", 1, 0, false );
    SubLFiles.declareFunction( me, "rkf_salient_descriptor_prompter_note_generator_thread", "RKF-SALIENT-DESCRIPTOR-PROMPTER-NOTE-GENERATOR-THREAD", 2, 0, false );
    SubLFiles.declareFunction( me, "rkf_salient_descriptor_prompter_clear_generator_thread", "RKF-SALIENT-DESCRIPTOR-PROMPTER-CLEAR-GENERATOR-THREAD", 1, 0, false );
    SubLFiles.declareFunction( me, "rkf_salient_descriptor_candidate_p", "RKF-SALIENT-DESCRIPTOR-CANDIDATE-P", 1, 0, false );
    SubLFiles.declareMacro( me, "with_rkf_sd_prompter_lock_held", "WITH-RKF-SD-PROMPTER-LOCK-HELD" );
    SubLFiles.declareMacro( me, "with_rkf_sd_prompter_memoization_state", "WITH-RKF-SD-PROMPTER-MEMOIZATION-STATE" );
    SubLFiles.declareMacro( me, "with_rkf_sd_prompter_problem_store", "WITH-RKF-SD-PROMPTER-PROBLEM-STORE" );
    SubLFiles.declareFunction( me, "rkf_sd_examples_for_prompt", "RKF-SD-EXAMPLES-FOR-PROMPT", 3, 0, false );
    SubLFiles.declareFunction( me, "rkf_sd_prompter_find_or_set_problem_store", "RKF-SD-PROMPTER-FIND-OR-SET-PROBLEM-STORE", 1, 0, false );
    SubLFiles.declareFunction( me, "rkf_salient_descriptor_prompter_reset_problem_store", "RKF-SALIENT-DESCRIPTOR-PROMPTER-RESET-PROBLEM-STORE", 1, 0, false );
    SubLFiles.declareFunction( me, "rkf_salient_descriptor_prompter_next", "RKF-SALIENT-DESCRIPTOR-PROMPTER-NEXT", 1, 1, false );
    SubLFiles.declareFunction( me, "rkf_salient_descriptor_prompter_finalize", "RKF-SALIENT-DESCRIPTOR-PROMPTER-FINALIZE", 1, 0, false );
    SubLFiles.declareFunction( me, "rkf_sd_prompter_mark_prompt_used", "RKF-SD-PROMPTER-MARK-PROMPT-USED", 2, 0, false );
    SubLFiles.declareFunction( me, "rkf_sd_prompter_remove_unused_prompt", "RKF-SD-PROMPTER-REMOVE-UNUSED-PROMPT", 2, 0, false );
    SubLFiles.declareFunction( me, "rkf_salient_descriptor_prompter_has_generator_thread_p", "RKF-SALIENT-DESCRIPTOR-PROMPTER-HAS-GENERATOR-THREAD-P", 1, 0, false );
    SubLFiles.declareFunction( me, "rkf_salient_descriptor_prompter_unblock_generator_thread", "RKF-SALIENT-DESCRIPTOR-PROMPTER-UNBLOCK-GENERATOR-THREAD", 1, 0, false );
    SubLFiles.declareFunction( me, "rkf_salient_descriptor_prompter_generate_prompt", "RKF-SALIENT-DESCRIPTOR-PROMPTER-GENERATE-PROMPT", 1, 1, false );
    SubLFiles.declareFunction( me, "rkf_salient_descriptor_prompter_remove_prompt", "RKF-SALIENT-DESCRIPTOR-PROMPTER-REMOVE-PROMPT", 2, 0, false );
    SubLFiles.declareFunction( me, "rkf_salient_descriptor_prompter_replace_prompt", "RKF-SALIENT-DESCRIPTOR-PROMPTER-REPLACE-PROMPT", 2, 0, false );
    SubLFiles.declareFunction( me, "rkf_salient_descriptor_prompter_mt", "RKF-SALIENT-DESCRIPTOR-PROMPTER-MT", 1, 0, false );
    SubLFiles.declareFunction( me, "rkf_salient_descriptor_prompter_seed_term", "RKF-SALIENT-DESCRIPTOR-PROMPTER-SEED-TERM", 1, 0, false );
    SubLFiles.declareFunction( me, "rkf_salient_descriptor_prompter_pop_prompt_tactic", "RKF-SALIENT-DESCRIPTOR-PROMPTER-POP-PROMPT-TACTIC", 2, 0, false );
    SubLFiles.declareFunction( me, "rkf_sd_prompter_prune_tactic_prompts", "RKF-SD-PROMPTER-PRUNE-TACTIC-PROMPTS", 2, 0, false );
    SubLFiles.declareFunction( me, "rkf_sd_prompter_prune_bad_prompts", "RKF-SD-PROMPTER-PRUNE-BAD-PROMPTS", 1, 0, false );
    SubLFiles.declareFunction( me, "rkf_sd_bad_promptP", "RKF-SD-BAD-PROMPT?", 1, 0, false );
    SubLFiles.declareFunction( me, "rkf_sd_ok_support_p", "RKF-SD-OK-SUPPORT-P", 2, 0, false );
    SubLFiles.declareFunction( me, "rkf_salient_descriptor_prompter_last_tactic", "RKF-SALIENT-DESCRIPTOR-PROMPTER-LAST-TACTIC", 1, 0, false );
    SubLFiles.declareFunction( me, "rkf_salient_descriptor_prompter_current_tactic", "RKF-SALIENT-DESCRIPTOR-PROMPTER-CURRENT-TACTIC", 1, 0, false );
    SubLFiles.declareFunction( me, "rkf_salient_descriptor_prompter_next_tactic", "RKF-SALIENT-DESCRIPTOR-PROMPTER-NEXT-TACTIC", 1, 0, false );
    SubLFiles.declareFunction( me, "rkf_salient_descriptor_prompter_current_tactic_string", "RKF-SALIENT-DESCRIPTOR-PROMPTER-CURRENT-TACTIC-STRING", 2, 0, false );
    SubLFiles.declareFunction( me, "rkf_salient_descriptor_prompter_next_tactic_string", "RKF-SALIENT-DESCRIPTOR-PROMPTER-NEXT-TACTIC-STRING", 2, 0, false );
    SubLFiles.declareFunction( me, "rkf_salient_descriptor_prompt_tactic_string", "RKF-SALIENT-DESCRIPTOR-PROMPT-TACTIC-STRING", 2, 0, false );
    SubLFiles.declareFunction( me, "rkf_sd_string_for_tactic", "RKF-SD-STRING-FOR-TACTIC", 2, 0, false );
    SubLFiles.declareFunction( me, "rkf_sd_prompter_best_prompt", "RKF-SD-PROMPTER-BEST-PROMPT", 1, 0, false );
    SubLFiles.declareFunction( me, "rkf_sd_prompter_update_best_prompt", "RKF-SD-PROMPTER-UPDATE-BEST-PROMPT", 1, 0, false );
    SubLFiles.declareFunction( me, "rkf_salient_descriptor_prompter_sorted_unused_prompts", "RKF-SALIENT-DESCRIPTOR-PROMPTER-SORTED-UNUSED-PROMPTS", 1, 0, false );
    SubLFiles.declareFunction( me, "rkf_sd_better_promptP", "RKF-SD-BETTER-PROMPT?", 2, 0, false );
    SubLFiles.declareFunction( me, "rkf_sd_prompter_knownP", "RKF-SD-PROMPTER-KNOWN?", 4, 0, false );
    SubLFiles.declareFunction( me, "rkf_salient_descriptor_prompter_find_prompt_by_id", "RKF-SALIENT-DESCRIPTOR-PROMPTER-FIND-PROMPT-BY-ID", 2, 0, false );
    SubLFiles.declareFunction( me, "rkf_sd_prompt_maybe_compute_subprompts", "RKF-SD-PROMPT-MAYBE-COMPUTE-SUBPROMPTS", 1, 0, false );
    SubLFiles.declareFunction( me, "rkf_sd_prompt_compute_subprompts", "RKF-SD-PROMPT-COMPUTE-SUBPROMPTS", 1, 0, false );
    SubLFiles.declareFunction( me, "rkf_sd_prompt_missing_examplesP", "RKF-SD-PROMPT-MISSING-EXAMPLES?", 1, 0, false );
    SubLFiles.declareFunction( me, "rkf_salient_descriptor_followup_prompt_via_prompter", "RKF-SALIENT-DESCRIPTOR-FOLLOWUP-PROMPT-VIA-PROMPTER", 3, 0, false );
    SubLFiles.declareFunction( me, "rkf_salient_descriptor_followup_prompt", "RKF-SALIENT-DESCRIPTOR-FOLLOWUP-PROMPT", 3, 0, false );
    SubLFiles.declareFunction( me, "positive_gaf_cnfs_p", "POSITIVE-GAF-CNFS-P", 1, 0, false );
    SubLFiles.declareFunction( me, "rkf_sd_prompter_add_prompt", "RKF-SD-PROMPTER-ADD-PROMPT", 2, 0, false );
    SubLFiles.declareFunction( me, "rkf_sd_prompter_add_to_unused_prompts", "RKF-SD-PROMPTER-ADD-TO-UNUSED-PROMPTS", 2, 0, false );
    SubLFiles.declareFunction( me, "rkf_sd_prompt_E", "RKF-SD-PROMPT-=", 2, 0, false );
    SubLFiles.declareFunction( me, "rkf_sd_prompt_formula_E", "RKF-SD-PROMPT-FORMULA-=", 2, 0, false );
    SubLFiles.declareFunction( me, "rkf_sd_prompter_find_prompt_by_id_string", "RKF-SD-PROMPTER-FIND-PROMPT-BY-ID-STRING", 2, 0, false );
    SubLFiles.declareFunction( me, "rkf_sd_prompter_find_prompt_by_id", "RKF-SD-PROMPTER-FIND-PROMPT-BY-ID", 2, 0, false );
    SubLFiles.declareFunction( me, "rkf_sd_prompter_prefer_promptP", "RKF-SD-PROMPTER-PREFER-PROMPT?", 4, 0, false );
    SubLFiles.declareFunction( me, "rkf_sd_prompt_localityG", "RKF-SD-PROMPT-LOCALITY>", 3, 0, false );
    SubLFiles.declareFunction( me, "rkf_sd_prompt_local_supports", "RKF-SD-PROMPT-LOCAL-SUPPORTS", 2, 0, false );
    SubLFiles.declareFunction( me, "rkf_sd_more_recent_supportsP", "RKF-SD-MORE-RECENT-SUPPORTS?", 2, 0, false );
    SubLFiles.declareFunction( me, "rkf_sd_prompt_generalityL", "RKF-SD-PROMPT-GENERALITY<", 2, 0, false );
    SubLFiles.declareFunction( me, "rkf_sd_sentence_generalityL", "RKF-SD-SENTENCE-GENERALITY<", 2, 0, false );
    SubLFiles.declareFunction( me, "rkf_sd_sentence_generality", "RKF-SD-SENTENCE-GENERALITY", 1, 0, false );
    SubLFiles.declareFunction( me, "rkf_sd_terms_generality", "RKF-SD-TERMS-GENERALITY", 1, 0, false );
    SubLFiles.declareFunction( me, "rkf_sd_term_generality", "RKF-SD-TERM-GENERALITY", 1, 0, false );
    SubLFiles.declareFunction( me, "rkf_sd_prompt_fewer_lits_p", "RKF-SD-PROMPT-FEWER-LITS-P", 2, 0, false );
    SubLFiles.declareFunction( me, "rkf_sd_prompt_min_lit_count", "RKF-SD-PROMPT-MIN-LIT-COUNT", 1, 0, false );
    SubLFiles.declareFunction( me, "rkf_sd_cnf_lit_count", "RKF-SD-CNF-LIT-COUNT", 1, 0, false );
    SubLFiles.declareMacro( me, "with_rkf_salient_descriptor_seed_term_tactics_table", "WITH-RKF-SALIENT-DESCRIPTOR-SEED-TERM-TACTICS-TABLE" );
    SubLFiles.declareFunction( me, "rkf_sd_prompter_tactics_for_seed_term_type", "RKF-SD-PROMPTER-TACTICS-FOR-SEED-TERM-TYPE", 1, 0, false );
    SubLFiles.declareFunction( me, "rkf_sd_prompter_compute_seed_term_type", "RKF-SD-PROMPTER-COMPUTE-SEED-TERM-TYPE", 1, 0, false );
    SubLFiles.declareFunction( me, "formula_template_fort_for_rkf_salient_descriptor_prompt", "FORMULA-TEMPLATE-FORT-FOR-RKF-SALIENT-DESCRIPTOR-PROMPT", 2, 0, false );
    SubLFiles.declareFunction( me, "find_or_create_formula_template_fort", "FIND-OR-CREATE-FORMULA-TEMPLATE-FORT", 6, 0, false );
    SubLFiles.declareFunction( me, "formula_template_definitional_properties", "FORMULA-TEMPLATE-DEFINITIONAL-PROPERTIES", 7, 0, false );
    SubLFiles.declareFunction( me, "rkf_sd_fet_data_assert_mt", "RKF-SD-FET-DATA-ASSERT-MT", 2, 0, false );
    SubLFiles.declareFunction( me, "rkf_sd_fet_find_match", "RKF-SD-FET-FIND-MATCH", 1, 1, false );
    SubLFiles.declareFunction( me, "rkf_sd_fet_assert", "RKF-SD-FET-ASSERT", 1, 0, false );
    SubLFiles.declareFunction( me, "rkf_sd_new_formula_template_fort", "RKF-SD-NEW-FORMULA-TEMPLATE-FORT", 1, 0, false );
    SubLFiles.declareFunction( me, "rkf_sd_candidate_replacement_info", "RKF-SD-CANDIDATE-REPLACEMENT-INFO", 2, 0, false );
    SubLFiles.declareFunction( me, "rkf_sd_prompt_get_var_arg_positions", "RKF-SD-PROMPT-GET-VAR-ARG-POSITIONS", 2, 0, false );
    SubLFiles.declareFunction( me, "rkf_sd_prompt_get_precedent_example_sentences", "RKF-SD-PROMPT-GET-PRECEDENT-EXAMPLE-SENTENCES", 2, 0, false );
    SubLFiles.declareFunction( me, "rkf_sd_single_entry_promptP", "RKF-SD-SINGLE-ENTRY-PROMPT?", 2, 0, false );
    SubLFiles.declareFunction( me, "rkf_sd_hide_specs_fn_replacements", "RKF-SD-HIDE-SPECS-FN-REPLACEMENTS", 1, 0, false );
    SubLFiles.declareFunction( me, "prune_rkf_sd_formula_template_topic", "PRUNE-RKF-SD-FORMULA-TEMPLATE-TOPIC", 1, 0, false );
    SubLFiles.declareFunction( me, "focal_term_type_has_template_with_bin_predP", "FOCAL-TERM-TYPE-HAS-TEMPLATE-WITH-BIN-PRED?", 2, 0, false );
    SubLFiles.declareFunction( me, "rkf_induced_salient_descriptor_prompts_for_focal_term_type", "RKF-INDUCED-SALIENT-DESCRIPTOR-PROMPTS-FOR-FOCAL-TERM-TYPE", 2, 0, false );
    SubLFiles.declareFunction( me, "rkf_salient_descriptor_prompts_for_focal_term_type", "RKF-SALIENT-DESCRIPTOR-PROMPTS-FOR-FOCAL-TERM-TYPE", 2, 0, false );
    SubLFiles.declareFunction( me, "rkf_sd_prompter_apply_tactics", "RKF-SD-PROMPTER-APPLY-TACTICS", 1, 0, false );
    SubLFiles.declareFunction( me, "rkf_sd_prompter_exhausted_p", "RKF-SD-PROMPTER-EXHAUSTED-P", 1, 0, false );
    SubLFiles.declareFunction( me, "rkf_sd_prompter_tactics_exhausted_p", "RKF-SD-PROMPTER-TACTICS-EXHAUSTED-P", 1, 0, false );
    SubLFiles.declareFunction( me, "rkf_sd_prompter_tactics_next", "RKF-SD-PROMPTER-TACTICS-NEXT", 1, 0, false );
    SubLFiles.declareFunction( me, "rkf_sd_prompter_apply_tactic", "RKF-SD-PROMPTER-APPLY-TACTIC", 2, 0, false );
    SubLFiles.declareMacro( me, "with_sd_tactic_disabled_for_seed_term_type", "WITH-SD-TACTIC-DISABLED-FOR-SEED-TERM-TYPE" );
    SubLFiles.declareMacro( me, "with_sd_tactics_disabled_for_seed_term_type", "WITH-SD-TACTICS-DISABLED-FOR-SEED-TERM-TYPE" );
    SubLFiles.declareFunction( me, "rkf_sd_prompter_suggestion", "RKF-SD-PROMPTER-SUGGESTION", 1, 0, false );
    SubLFiles.declareFunction( me, "rkf_sd_prompter_required", "RKF-SD-PROMPTER-REQUIRED", 1, 0, false );
    SubLFiles.declareFunction( me, "rkf_sd_prompter_interaction_context_required", "RKF-SD-PROMPTER-INTERACTION-CONTEXT-REQUIRED", 1, 0, false );
    SubLFiles.declareFunction( me, "rkf_sd_prompter_interaction_context_strong", "RKF-SD-PROMPTER-INTERACTION-CONTEXT-STRONG", 1, 0, false );
    SubLFiles.declareFunction( me, "rkf_sd_prompter_add_ke_driven_prompts", "RKF-SD-PROMPTER-ADD-KE-DRIVEN-PROMPTS", 2, 0, false );
    SubLFiles.declareFunction( me, "rkf_sd_prompter_ke_driven_prompt_fodder", "RKF-SD-PROMPTER-KE-DRIVEN-PROMPT-FODDER", 2, 0, false );
    SubLFiles.declareFunction( me, "rkf_sd_prompter_update_ke_driven_prompts", "RKF-SD-PROMPTER-UPDATE-KE-DRIVEN-PROMPTS", 3, 0, false );
    SubLFiles.declareFunction( me, "rkf_sd_prompter_compute_ke_driven_prompt_fodder", "RKF-SD-PROMPTER-COMPUTE-KE-DRIVEN-PROMPT-FODDER", 2, 0, false );
    SubLFiles.declareFunction( me, "rkf_sd_prompter_iterative_prompt_method_p", "RKF-SD-PROMPTER-ITERATIVE-PROMPT-METHOD-P", 1, 0, false );
    SubLFiles.declareFunction( me, "rkf_sd_prompter_get_ke_driven_prompt_formulas", "RKF-SD-PROMPTER-GET-KE-DRIVEN-PROMPT-FORMULAS", 2, 0, false );
    SubLFiles.declareFunction( me, "rkf_sd_suppress_formula_for_seed_termP", "RKF-SD-SUPPRESS-FORMULA-FOR-SEED-TERM?", 4, 0, false );
    SubLFiles.declareFunction( me, "rkf_sd_suppress_formula_threshold", "RKF-SD-SUPPRESS-FORMULA-THRESHOLD", 3, 0, false );
    SubLFiles.declareFunction( me, "rkf_sd_suppress_formula_threshold_for_property_internal", "RKF-SD-SUPPRESS-FORMULA-THRESHOLD-FOR-PROPERTY-INTERNAL", 2, 3, false );
    SubLFiles.declareFunction( me, "rkf_sd_suppress_formula_threshold_for_property", "RKF-SD-SUPPRESS-FORMULA-THRESHOLD-FOR-PROPERTY", 2, 3, false );
    SubLFiles.declareFunction( me, "rkf_sd_suppress_formula_test_query", "RKF-SD-SUPPRESS-FORMULA-TEST-QUERY", 3, 0, false );
    SubLFiles.declareFunction( me, "rkf_sd_prompter_ke_driven_inference_and_var", "RKF-SD-PROMPTER-KE-DRIVEN-INFERENCE-AND-VAR", 2, 0, false );
    SubLFiles.declareFunction( me, "rkf_sd_prompter_analogize", "RKF-SD-PROMPTER-ANALOGIZE", 1, 0, false );
    SubLFiles.declareFunction( me, "rkf_sd_prompter_get_analogous_terms", "RKF-SD-PROMPTER-GET-ANALOGOUS-TERMS", 1, 0, false );
    SubLFiles.declareFunction( me, "rkf_sd_prompter_clear_analogous_terms", "RKF-SD-PROMPTER-CLEAR-ANALOGOUS-TERMS", 1, 0, false );
    SubLFiles.declareFunction( me, "rkf_sd_prompter_add_analogy_prompt", "RKF-SD-PROMPTER-ADD-ANALOGY-PROMPT", 3, 0, false );
    SubLFiles.declareFunction( me, "rkf_sd_prompt_add_analogy_examples", "RKF-SD-PROMPT-ADD-ANALOGY-EXAMPLES", 4, 0, false );
    SubLFiles.declareFunction( me, "rkf_sd_prompter_loosen_analogy_formula", "RKF-SD-PROMPTER-LOOSEN-ANALOGY-FORMULA", 2, 0, false );
    SubLFiles.declareFunction( me, "rkf_sd_prompter_uneditable_analogy_argP", "RKF-SD-PROMPTER-UNEDITABLE-ANALOGY-ARG?", 2, 0, false );
    SubLFiles.declareFunction( me, "rkf_sd_prompter_analogy_var", "RKF-SD-PROMPTER-ANALOGY-VAR", 2, 0, false );
    SubLFiles.declareFunction( me, "rkf_sd_prompter_get_analogy_suggestions", "RKF-SD-PROMPTER-GET-ANALOGY-SUGGESTIONS", 2, 0, false );
    SubLFiles.declareFunction( me, "rkf_sd_prompter_clear_analogy_suggestions", "RKF-SD-PROMPTER-CLEAR-ANALOGY-SUGGESTIONS", 1, 0, false );
    SubLFiles.declareFunction( me, "rkf_sd_analogy_justifications", "RKF-SD-ANALOGY-JUSTIFICATIONS", 4, 0, false );
    SubLFiles.declareFunction( me, "rkf_sd_prompter_rules_for_term", "RKF-SD-PROMPTER-RULES-FOR-TERM", 1, 0, false );
    SubLFiles.declareFunction( me, "rkf_sd_prompter_rule_table_pop", "RKF-SD-PROMPTER-RULE-TABLE-POP", 1, 0, false );
    SubLFiles.declareFunction( me, "rkf_sd_prompter_rule_table", "RKF-SD-PROMPTER-RULE-TABLE", 2, 0, false );
    SubLFiles.declareFunction( me, "rkf_sd_sort_rule_tuples", "RKF-SD-SORT-RULE-TUPLES", 1, 0, false );
    SubLFiles.declareFunction( me, "rkf_sd_remove_low_scoring_tuples", "RKF-SD-REMOVE-LOW-SCORING-TUPLES", 1, 0, false );
    SubLFiles.declareFunction( me, "rkf_sd_low_scoring_tuple_p", "RKF-SD-LOW-SCORING-TUPLE-P", 1, 0, false );
    SubLFiles.declareFunction( me, "rkf_sd_score_rule_tuples", "RKF-SD-SCORE-RULE-TUPLES", 1, 0, false );
    SubLFiles.declareFunction( me, "rkf_sd_get_other_rules", "RKF-SD-GET-OTHER-RULES", 4, 0, false );
    SubLFiles.declareFunction( me, "rkf_sd_get_isa_rules", "RKF-SD-GET-ISA-RULES", 5, 0, false );
    SubLFiles.declareFunction( me, "rkf_sd_get_genls_rules", "RKF-SD-GET-GENLS-RULES", 5, 0, false );
    SubLFiles.declareFunction( me, "rkf_sd_rule_tuple_E", "RKF-SD-RULE-TUPLE-=", 2, 0, false );
    SubLFiles.declareFunction( me, "rkf_sd_score_rule_tuple", "RKF-SD-SCORE-RULE-TUPLE", 1, 0, false );
    SubLFiles.declareFunction( me, "rkf_sd_prefer_rule_tupleP", "RKF-SD-PREFER-RULE-TUPLE?", 2, 0, false );
    SubLFiles.declareFunction( me, "rkf_sd_rule_info_score_G", "RKF-SD-RULE-INFO-SCORE->", 2, 0, false );
    SubLFiles.declareFunction( me, "rkf_sd_rule_score_do_test", "RKF-SD-RULE-SCORE-DO-TEST", 3, 0, false );
    SubLFiles.declareFunction( me, "rkf_sd_rst_seed_term_in_pos_lits", "RKF-SD-RST-SEED-TERM-IN-POS-LITS", 2, 0, false );
    SubLFiles.declareFunction( me, "rkf_sd_rst_seed_term_in_neg_lits", "RKF-SD-RST-SEED-TERM-IN-NEG-LITS", 2, 0, false );
    SubLFiles.declareFunction( me, "rkf_sd_rst_var_count", "RKF-SD-RST-VAR-COUNT", 2, 0, false );
    SubLFiles.declareFunction( me, "rkf_sd_rst_neg_lit_count", "RKF-SD-RST-NEG-LIT-COUNT", 2, 0, false );
    SubLFiles.declareFunction( me, "rkf_sd_rst_pos_lit_count", "RKF-SD-RST-POS-LIT-COUNT", 2, 0, false );
    SubLFiles.declareFunction( me, "rkf_sd_rst_mt_generality", "RKF-SD-RST-MT-GENERALITY", 2, 0, false );
    SubLFiles.declareFunction( me, "rkf_sd_rst_pos_lit_quality", "RKF-SD-RST-POS-LIT-QUALITY", 2, 0, false );
    SubLFiles.declareFunction( me, "rkf_sd_tuple_mt_generality", "RKF-SD-TUPLE-MT-GENERALITY", 1, 0, false );
    SubLFiles.declareFunction( me, "rkf_sd_cnf_rule_count", "RKF-SD-CNF-RULE-COUNT", 1, 0, false );
    SubLFiles.declareFunction( me, "rkf_sd_el_cnf_from_rule_tuple", "RKF-SD-EL-CNF-FROM-RULE-TUPLE", 1, 0, false );
    SubLFiles.declareFunction( me, "rkf_sd_gaf_okP", "RKF-SD-GAF-OK?", 1, 0, false );
    SubLFiles.declareFunction( me, "rkf_sd_gaf_generality_okP", "RKF-SD-GAF-GENERALITY-OK?", 1, 0, false );
    SubLFiles.declareFunction( me, "rkf_sd_term_too_generalP", "RKF-SD-TERM-TOO-GENERAL?", 1, 0, false );
    SubLFiles.declareFunction( me, "rkf_sd_gaf_rule_bindings", "RKF-SD-GAF-RULE-BINDINGS", 3, 1, false );
    SubLFiles.declareFunction( me, "rkf_sd_gaf_lit_rule_bindings", "RKF-SD-GAF-LIT-RULE-BINDINGS", 3, 1, false );
    SubLFiles.declareFunction( me, "rkf_sd_subprompts_matches_cnfP", "RKF-SD-SUBPROMPTS-MATCHES-CNF?", 2, 0, false );
    SubLFiles.declareFunction( me, "rkf_sd_assert_sentence_matches_cnfP", "RKF-SD-ASSERT-SENTENCE-MATCHES-CNF?", 2, 0, false );
    SubLFiles.declareFunction( me, "rkf_sd_assert_sentence_matches_neg_litP", "RKF-SD-ASSERT-SENTENCE-MATCHES-NEG-LIT?", 2, 0, false );
    SubLFiles.declareFunction( me, "rkf_sd_prompter_strong", "RKF-SD-PROMPTER-STRONG", 1, 0, false );
    SubLFiles.declareFunction( me, "rkf_sd_prompter_induced", "RKF-SD-PROMPTER-INDUCED", 1, 0, false );
    SubLFiles.declareFunction( me, "rkf_sd_prompter_weak", "RKF-SD-PROMPTER-WEAK", 1, 0, false );
    SubLFiles.declareFunction( me, "rkf_sd_prompter_compute_subpromptss", "RKF-SD-PROMPTER-COMPUTE-SUBPROMPTSS", 1, 0, false );
    SubLFiles.declareFunction( me, "rkf_sd_prompt_bad_subpromptsP", "RKF-SD-PROMPT-BAD-SUBPROMPTS?", 2, 0, false );
    SubLFiles.declareFunction( me, "rkf_sd_not_assertible_subpromptsP_internal", "RKF-SD-NOT-ASSERTIBLE-SUBPROMPTS?-INTERNAL", 1, 0, false );
    SubLFiles.declareFunction( me, "rkf_sd_not_assertible_subpromptsP", "RKF-SD-NOT-ASSERTIBLE-SUBPROMPTS?", 1, 0, false );
    SubLFiles.declareFunction( me, "rkf_sd_unparseable_subpromptsP_internal", "RKF-SD-UNPARSEABLE-SUBPROMPTS?-INTERNAL", 1, 0, false );
    SubLFiles.declareFunction( me, "rkf_sd_unparseable_subpromptsP", "RKF-SD-UNPARSEABLE-SUBPROMPTS?", 1, 0, false );
    SubLFiles.declareFunction( me, "rkf_sd_unparseable_prompt_litP_internal", "RKF-SD-UNPARSEABLE-PROMPT-LIT?-INTERNAL", 2, 0, false );
    SubLFiles.declareFunction( me, "rkf_sd_unparseable_prompt_litP", "RKF-SD-UNPARSEABLE-PROMPT-LIT?", 2, 0, false );
    SubLFiles.declareFunction( me, "rkf_unparseable_arg_typeP", "RKF-UNPARSEABLE-ARG-TYPE?", 1, 0, false );
    SubLFiles.declareFunction( me, "rkf_no_instances_arg_typeP", "RKF-NO-INSTANCES-ARG-TYPE?", 1, 0, false );
    SubLFiles.declareFunction( me, "rkf_direct_instances_arg_typeP", "RKF-DIRECT-INSTANCES-ARG-TYPE?", 1, 0, false );
    SubLFiles.declareFunction( me, "rkf_sd_prompter_find_rule_prompts", "RKF-SD-PROMPTER-FIND-RULE-PROMPTS", 1, 0, false );
    SubLFiles.declareFunction( me, "rkf_sd_prompt_justification_from_sentence", "RKF-SD-PROMPT-JUSTIFICATION-FROM-SENTENCE", 2, 0, false );
    SubLFiles.declareFunction( me, "rkf_sd_prompt_from_cnf", "RKF-SD-PROMPT-FROM-CNF", 2, 0, false );
    SubLFiles.declareFunction( me, "rkf_sd_prompt_formula_for_cnf", "RKF-SD-PROMPT-FORMULA-FOR-CNF", 2, 0, false );
    SubLFiles.declareFunction( me, "rkf_sd_prompt_formula_for_lit", "RKF-SD-PROMPT-FORMULA-FOR-LIT", 1, 0, false );
    SubLFiles.declareFunction( me, "rkf_sd_prompter_example_instance_induced_strong", "RKF-SD-PROMPTER-EXAMPLE-INSTANCE-INDUCED-STRONG", 1, 0, false );
    SubLFiles.declareFunction( me, "rkf_sd_prompter_example_instance_induced_weak", "RKF-SD-PROMPTER-EXAMPLE-INSTANCE-INDUCED-WEAK", 1, 0, false );
    SubLFiles.declareFunction( me, "rkf_sd_prompter_example_instance_induced", "RKF-SD-PROMPTER-EXAMPLE-INSTANCE-INDUCED", 2, 0, false );
    SubLFiles.declareFunction( me, "rkf_sd_prompter_example_instance_noninduced", "RKF-SD-PROMPTER-EXAMPLE-INSTANCE-NONINDUCED", 1, 0, false );
    SubLFiles.declareFunction( me, "rkf_sd_binary_pred_ok_for_promptsP", "RKF-SD-BINARY-PRED-OK-FOR-PROMPTS?", 1, 0, false );
    SubLFiles.declareFunction( me, "rkf_binary_pred_arg2_unparseableP", "RKF-BINARY-PRED-ARG2-UNPARSEABLE?", 1, 0, false );
    SubLFiles.declareFunction( me, "rkf_sd_prompt_example_instance_prompt", "RKF-SD-PROMPT-EXAMPLE-INSTANCE-PROMPT", 3, 0, false );
    SubLFiles.declareFunction( me, "rkf_sd_prompt_example_instance_sentence", "RKF-SD-PROMPT-EXAMPLE-INSTANCE-SENTENCE", 3, 0, false );
    return NIL;
  }

  public static SubLObject init_rkf_salient_descriptor_prompter_file()
  {
    $rkf_sd_strings_for_tactics$ = SubLFiles.deflexical( "*RKF-SD-STRINGS-FOR-TACTICS*", $list28 );
    $rkf_prompter_sort_prompter$ = SubLFiles.defparameter( "*RKF-PROMPTER-SORT-PROMPTER*", NIL );
    $rkf_sd_seed_term_tactics_table$ = SubLFiles.defparameter( "*RKF-SD-SEED-TERM-TACTICS-TABLE*", $list48 );
    $rkf_sd_suppress_rarely_known_prompt_formulasP$ = SubLFiles.defparameter( "*RKF-SD-SUPPRESS-RARELY-KNOWN-PROMPT-FORMULAS?*", T );
    $rkf_sd_suppress_formula_percent_min$ = SubLFiles.defparameter( "*RKF-SD-SUPPRESS-FORMULA-PERCENT-MIN*", ONE_INTEGER );
    $rkf_sd_suppress_formula_count_min$ = SubLFiles.defparameter( "*RKF-SD-SUPPRESS-FORMULA-COUNT-MIN*", TWO_INTEGER );
    $rkf_sd_seed_term$ = SubLFiles.defparameter( "*RKF-SD-SEED-TERM*", NIL );
    $rkf_sd_rule_score_tests$ = SubLFiles.deflexical( "*RKF-SD-RULE-SCORE-TESTS*", $list186 );
    $rkf_unparseable_arg_types$ = SubLFiles.defconstant( "*RKF-UNPARSEABLE-ARG-TYPES*", $list198 );
    return NIL;
  }

  public static SubLObject setup_rkf_salient_descriptor_prompter_file()
  {
    access_macros.register_macro_helper( $sym15$RKF_SD_PROMPTER_FIND_OR_SET_PROBLEM_STORE, $sym17$WITH_RKF_SD_PROMPTER_PROBLEM_STORE );
    memoization_state.note_memoized_function( $sym157$RKF_SD_SUPPRESS_FORMULA_THRESHOLD_FOR_PROPERTY );
    memoization_state.note_memoized_function( $sym194$RKF_SD_NOT_ASSERTIBLE_SUBPROMPTS_ );
    memoization_state.note_memoized_function( $sym195$RKF_SD_UNPARSEABLE_SUBPROMPTS_ );
    memoization_state.note_memoized_function( $sym196$RKF_SD_UNPARSEABLE_PROMPT_LIT_ );
    return NIL;
  }

  @Override
  public void declareFunctions()
  {
    declare_rkf_salient_descriptor_prompter_file();
  }

  @Override
  public void initializeVariables()
  {
    init_rkf_salient_descriptor_prompter_file();
  }

  @Override
  public void runTopLevelForms()
  {
    setup_rkf_salient_descriptor_prompter_file();
  }
  static
  {
    me = new rkf_salient_descriptor_prompter();
    $rkf_sd_strings_for_tactics$ = null;
    $rkf_prompter_sort_prompter$ = null;
    $rkf_sd_seed_term_tactics_table$ = null;
    $rkf_sd_suppress_rarely_known_prompt_formulasP$ = null;
    $rkf_sd_suppress_formula_percent_min$ = null;
    $rkf_sd_suppress_formula_count_min$ = null;
    $rkf_sd_seed_term$ = null;
    $rkf_sd_rule_score_tests$ = null;
    $rkf_unparseable_arg_types$ = null;
    $sym0$RKF_SALIENT_DESCRIPTOR_PROMPTER_P = makeSymbol( "RKF-SALIENT-DESCRIPTOR-PROMPTER-P" );
    $kw1$GENERATOR_THREAD = makeKeyword( "GENERATOR-THREAD" );
    $kw2$NONE = makeKeyword( "NONE" );
    $list3 = ConsesLow.list( ConsesLow.list( makeSymbol( "PROMPTER" ), makeSymbol( "WHOSTATE" ) ), makeSymbol( "&BODY" ), makeSymbol( "BODY" ) );
    $sym4$LOCK = makeUninternedSymbol( "LOCK" );
    $sym5$CLET = makeSymbol( "CLET" );
    $sym6$RKF_SALIENT_DESCRIPTOR_PROMPTER_LOOKUP = makeSymbol( "RKF-SALIENT-DESCRIPTOR-PROMPTER-LOOKUP" );
    $list7 = ConsesLow.list( makeKeyword( "LOCK" ) );
    $sym8$WITH_LOCK_HELD = makeSymbol( "WITH-LOCK-HELD" );
    $kw9$WHOSTATE = makeKeyword( "WHOSTATE" );
    $list10 = ConsesLow.list( ConsesLow.list( makeSymbol( "PROMPTER" ) ), makeSymbol( "&BODY" ), makeSymbol( "BODY" ) );
    $sym11$STATE = makeUninternedSymbol( "STATE" );
    $list12 = ConsesLow.list( makeKeyword( "MEMOIZATION-STATE" ), ConsesLow.list( makeSymbol( "CURRENT-MEMOIZATION-STATE" ) ) );
    $sym13$WITH_MEMOIZATION_STATE = makeSymbol( "WITH-MEMOIZATION-STATE" );
    $sym14$_RKF_SD_PROBLEM_STORE_ = makeSymbol( "*RKF-SD-PROBLEM-STORE*" );
    $sym15$RKF_SD_PROMPTER_FIND_OR_SET_PROBLEM_STORE = makeSymbol( "RKF-SD-PROMPTER-FIND-OR-SET-PROBLEM-STORE" );
    $sym16$REUSING_RKF_SD_PROBLEM_STORE = makeSymbol( "REUSING-RKF-SD-PROBLEM-STORE" );
    $sym17$WITH_RKF_SD_PROMPTER_PROBLEM_STORE = makeSymbol( "WITH-RKF-SD-PROMPTER-PROBLEM-STORE" );
    $kw18$PROBLEM_STORE = makeKeyword( "PROBLEM-STORE" );
    $kw19$DONE = makeKeyword( "DONE" );
    $kw20$MEMOIZATION_STATE = makeKeyword( "MEMOIZATION-STATE" );
    $kw21$REMOVED = makeKeyword( "REMOVED" );
    $kw22$TACTIC_DONE = makeKeyword( "TACTIC-DONE" );
    $kw23$LOCK = makeKeyword( "LOCK" );
    $kw24$BEST_PROMPT = makeKeyword( "BEST-PROMPT" );
    $kw25$RECOMPUTE = makeKeyword( "RECOMPUTE" );
    $sym26$RKF_SALIENT_DESCRIPTOR_PROMPT_P = makeSymbol( "RKF-SALIENT-DESCRIPTOR-PROMPT-P" );
    $kw27$LAST_TACTIC = makeKeyword( "LAST-TACTIC" );
    $list28 = ConsesLow.list( new SubLObject[] { ConsesLow.cons( makeSymbol( "RKF-SD-PROMPTER-RULES-FOR-TERM" ), makeString( "Rules for Term" ) ), ConsesLow.cons( makeSymbol( "RKF-SD-PROMPTER-ANALOGIZE" ), makeString(
        "Analogy" ) ), ConsesLow.cons( makeSymbol( "RKF-SD-PROMPTER-INDUCED" ), makeString( "Induced Interview Questions" ) ), ConsesLow.cons( makeSymbol( "RKF-SD-PROMPTER-COMPUTE-SUBPROMPTSS" ), makeString(
            "Flesh out Precomputed Questions" ) ), ConsesLow.cons( makeSymbol( "RKF-SD-PROMPTER-REQUIRED" ), makeString( "Required Knowledge" ) ), ConsesLow.cons( makeSymbol( "RKF-SD-PROMPTER-STRONG" ), makeString(
                "Strong Suggestions" ) ), ConsesLow.cons( makeSymbol( "RKF-SD-PROMPTER-WEAK" ), makeString( "Weak Suggestions" ) ), ConsesLow.cons( makeSymbol( "RKF-INTERACTION-CONTEXT-REQUIRED" ), makeString(
                    "Required Interaction Context Refinements" ) ), ConsesLow.cons( makeSymbol( "RKF-INTERACTION-CONTEXT-STRONG" ), makeString( "Strongly Suggested Interaction Context Refinements" ) ), ConsesLow.cons(
                        makeSymbol( "FOLLOW-UP" ), makeString( "Follow-up Prompt" ) )
    } );
    $str29$None = makeString( "None" );
    $str30$Unknown = makeString( "Unknown" );
    $kw31$BAD = makeKeyword( "BAD" );
    $sym32$RKF_SD_BETTER_PROMPT_ = makeSymbol( "RKF-SD-BETTER-PROMPT?" );
    $sym33$INTEGERP = makeSymbol( "INTEGERP" );
    $kw34$EXAMPLE_INSTANCE = makeKeyword( "EXAMPLE-INSTANCE" );
    $kw35$SPECIFY = makeKeyword( "SPECIFY" );
    $list36 = ConsesLow.list( makeSymbol( "NEG-LITS" ), makeSymbol( "POS-LITS" ) );
    $sym37$EL_VAR_ = makeSymbol( "EL-VAR?" );
    $kw38$ADDED = makeKeyword( "ADDED" );
    $kw39$ALREADY_PRESENT = makeKeyword( "ALREADY-PRESENT" );
    $sym40$STRINGP = makeSymbol( "STRINGP" );
    $sym41$SUPPORT_MT = makeSymbol( "SUPPORT-MT" );
    $sym42$UNIVERSAL_DATE_P = makeSymbol( "UNIVERSAL-DATE-P" );
    $sym43$ASSERTED_WHEN = makeSymbol( "ASSERTED-WHEN" );
    $sym44$ASSERTION_P = makeSymbol( "ASSERTION-P" );
    $kw45$IGNORE = makeKeyword( "IGNORE" );
    $sym46$_ = makeSymbol( "+" );
    $sym47$RKF_SD_TERM_GENERALITY = makeSymbol( "RKF-SD-TERM-GENERALITY" );
    $list48 = ConsesLow.list( ConsesLow.list( makeKeyword( "FORT" ), makeSymbol( "RKF-SD-PROMPTER-SUGGESTION" ), makeSymbol( "RKF-SD-PROMPTER-ANALOGIZE" ), makeSymbol( "RKF-SD-PROMPTER-RULES-FOR-TERM" ), makeSymbol(
        "RKF-SD-PROMPTER-INDUCED" ) ), ConsesLow.list( makeKeyword( "EXAMPLE-INSTANCE" ), makeSymbol( "RKF-SD-PROMPTER-SUGGESTION" ), makeSymbol( "RKF-SD-PROMPTER-EXAMPLE-INSTANCE-NONINDUCED" ), makeSymbol(
            "RKF-SD-PROMPTER-EXAMPLE-INSTANCE-INDUCED-STRONG" ), makeSymbol( "RKF-SD-PROMPTER-EXAMPLE-INSTANCE-INDUCED-WEAK" ) ), ConsesLow.list( makeKeyword( "GAF" ) ), ConsesLow.list( makeKeyword( "MT" ), makeSymbol(
                "RKF-SD-PROMPTER-INTERACTION-CONTEXT-REQUIRED" ), makeSymbol( "RKF-SD-PROMPTER-INTERACTION-CONTEXT-STRONG" ) ), ConsesLow.list( makeKeyword( "RULE" ), makeSymbol(
                    "RKF-SD-PROMPTER-FIND-RULE-PROMPTS" ) ) );
    $list49 = ConsesLow.list( ConsesLow.list( makeSymbol( "TABLE" ) ), makeSymbol( "&BODY" ), makeSymbol( "BODY" ) );
    $sym50$PROGN = makeSymbol( "PROGN" );
    $sym51$CHECK_TYPE = makeSymbol( "CHECK-TYPE" );
    $list52 = ConsesLow.list( makeSymbol( "ALIST-P" ) );
    $sym53$_RKF_SD_SEED_TERM_TACTICS_TABLE_ = makeSymbol( "*RKF-SD-SEED-TERM-TACTICS-TABLE*" );
    $const54$Microtheory = constant_handles.reader_make_constant_shell( makeString( "Microtheory" ) );
    $kw55$MT = makeKeyword( "MT" );
    $kw56$FORT = makeKeyword( "FORT" );
    $kw57$UNKNOWN = makeKeyword( "UNKNOWN" );
    $kw58$GAF = makeKeyword( "GAF" );
    $kw59$RULE = makeKeyword( "RULE" );
    $sym60$FORT_P = makeSymbol( "FORT-P" );
    $str61$Couldn_t_find__S_in__S_ = makeString( "Couldn't find ~S in ~S." );
    $kw62$TEMPLATE = makeKeyword( "TEMPLATE" );
    $const63$focalTermPositionForFormulaTempla = constant_handles.reader_make_constant_shell( makeString( "focalTermPositionForFormulaTemplate" ) );
    $const64$formulaForFormulaTemplate = constant_handles.reader_make_constant_shell( makeString( "formulaForFormulaTemplate" ) );
    $const65$formulaTemplateExample = constant_handles.reader_make_constant_shell( makeString( "formulaTemplateExample" ) );
    $int66$100 = makeInteger( 100 );
    $list67 = ConsesLow.cons( makeSymbol( "ARG-POS" ), makeSymbol( "INFO" ) );
    $list68 = ConsesLow.list( makeSymbol( "GLOSS" ), makeSymbol( "COLLECTION" ), makeSymbol( "EXPLANATION" ) );
    $const69$SpecsFn = constant_handles.reader_make_constant_shell( makeString( "SpecsFn" ) );
    $const70$templateReplacementsInvisibleForP = constant_handles.reader_make_constant_shell( makeString( "templateReplacementsInvisibleForPosition" ) );
    $const71$candidateReplacementForPosition = constant_handles.reader_make_constant_shell( makeString( "candidateReplacementForPosition" ) );
    $const72$glossForFormulaTemplate = constant_handles.reader_make_constant_shell( makeString( "glossForFormulaTemplate" ) );
    $const73$formulaTemplateArgExplanation = constant_handles.reader_make_constant_shell( makeString( "formulaTemplateArgExplanation" ) );
    $const74$assertMtForFormulaTemplate = constant_handles.reader_make_constant_shell( makeString( "assertMtForFormulaTemplate" ) );
    $const75$assertionFormatForFormulaTemplate = constant_handles.reader_make_constant_shell( makeString( "assertionFormatForFormulaTemplate" ) );
    $const76$SingleAssertionEntry = constant_handles.reader_make_constant_shell( makeString( "SingleAssertionEntry" ) );
    $const77$MultipleAssertionEntry = constant_handles.reader_make_constant_shell( makeString( "MultipleAssertionEntry" ) );
    $const78$DataForNLMt = constant_handles.reader_make_constant_shell( makeString( "DataForNLMt" ) );
    $sym79$SUGGEST_MT = makeSymbol( "SUGGEST-MT" );
    $sym80$QUOTE = makeSymbol( "QUOTE" );
    $sym81$_MT = makeSymbol( "?MT" );
    $const82$defaultDefiningMtForSentence = constant_handles.reader_make_constant_shell( makeString( "defaultDefiningMtForSentence" ) );
    $kw83$MAX_NUMBER = makeKeyword( "MAX-NUMBER" );
    $kw84$MAX_TRANSFORMATION_DEPTH = makeKeyword( "MAX-TRANSFORMATION-DEPTH" );
    $kw85$MAX_TIME = makeKeyword( "MAX-TIME" );
    $int86$30 = makeInteger( 30 );
    $kw87$RETURN = makeKeyword( "RETURN" );
    $const88$GKEFormulaTemplatesMt = constant_handles.reader_make_constant_shell( makeString( "GKEFormulaTemplatesMt" ) );
    $list89 = ConsesLow.list( makeKeyword( "MAX-NUMBER" ), ONE_INTEGER );
    $const90$InferencePSC = constant_handles.reader_make_constant_shell( makeString( "InferencePSC" ) );
    $const91$FormulaTemplate = constant_handles.reader_make_constant_shell( makeString( "FormulaTemplate" ) );
    $const92$isa = constant_handles.reader_make_constant_shell( makeString( "isa" ) );
    $list93 = ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "FormulaTemplate" ) ) );
    $const94$formulaTemplateHasType = constant_handles.reader_make_constant_shell( makeString( "formulaTemplateHasType" ) );
    $str95$constantNameAutoGeneratedFromColl = makeString( "constantNameAutoGeneratedFromCollection" );
    $const96$BaseKB = constant_handles.reader_make_constant_shell( makeString( "BaseKB" ) );
    $sym97$RKF_GENERIC_EXAMPLE_P = makeSymbol( "RKF-GENERIC-EXAMPLE-P" );
    $kw98$ANYTHING = makeKeyword( "ANYTHING" );
    $kw99$FOCAL_TERM = makeKeyword( "FOCAL-TERM" );
    $const100$SomeExampleFn = constant_handles.reader_make_constant_shell( makeString( "SomeExampleFn" ) );
    $const101$focalTermTypeForInducedTemplateTy = constant_handles.reader_make_constant_shell( makeString( "focalTermTypeForInducedTemplateType" ) );
    $sym102$RELEVANT_MT_IS_EVERYTHING = makeSymbol( "RELEVANT-MT-IS-EVERYTHING" );
    $const103$EverythingPSC = constant_handles.reader_make_constant_shell( makeString( "EverythingPSC" ) );
    $kw104$BREADTH = makeKeyword( "BREADTH" );
    $kw105$QUEUE = makeKeyword( "QUEUE" );
    $kw106$STACK = makeKeyword( "STACK" );
    $const107$True_JustificationTruth = constant_handles.reader_make_constant_shell( makeString( "True-JustificationTruth" ) );
    $sym108$RELEVANT_SBHL_TV_IS_GENERAL_TV = makeSymbol( "RELEVANT-SBHL-TV-IS-GENERAL-TV" );
    $kw109$ERROR = makeKeyword( "ERROR" );
    $str110$_A_is_not_a__A = makeString( "~A is not a ~A" );
    $sym111$SBHL_TRUE_TV_P = makeSymbol( "SBHL-TRUE-TV-P" );
    $kw112$CERROR = makeKeyword( "CERROR" );
    $str113$continue_anyway = makeString( "continue anyway" );
    $kw114$WARN = makeKeyword( "WARN" );
    $str115$_A_is_not_a_valid__sbhl_type_erro = makeString( "~A is not a valid *sbhl-type-error-action* value" );
    $const116$genls = constant_handles.reader_make_constant_shell( makeString( "genls" ) );
    $str117$Redundant_with__S_____S_on__S = makeString( "Redundant with ~S:~% ~S on ~S" );
    $str118$_A_is_neither_SET_P_nor_LISTP_ = makeString( "~A is neither SET-P nor LISTP." );
    $str119$attempting_to_bind_direction_link = makeString( "attempting to bind direction link variable, to NIL. macro body not executed." );
    $str120$Node__a_does_not_pass_sbhl_type_t = makeString( "Node ~a does not pass sbhl-type-test ~a~%" );
    $list121 = ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "isa" ) ), constant_handles.reader_make_constant_shell( makeString( "formulaTemplateHasType" ) ) );
    $str122$Hey_ho___S_has_got_to_go___ = makeString( "Hey ho. ~S has got to go.~%" );
    $sym123$ISA_COLLECTION_ = makeSymbol( "ISA-COLLECTION?" );
    $list124 = ConsesLow.list( ConsesLow.list( makeKeyword( "EXAMPLE-INSTANCE" ), makeSymbol( "RKF-SD-PROMPTER-EXAMPLE-INSTANCE-INDUCED-STRONG" ), makeSymbol( "RKF-SD-PROMPTER-EXAMPLE-INSTANCE-INDUCED-WEAK" ) ) );
    $sym125$ALIST_P = makeSymbol( "ALIST-P" );
    $kw126$EXHAUSTED = makeKeyword( "EXHAUSTED" );
    $list127 = ConsesLow.list( ConsesLow.list( makeSymbol( "SEED-TERM-TYPE" ), makeSymbol( "TACTIC" ) ), makeSymbol( "&BODY" ), makeSymbol( "BODY" ) );
    $sym128$TACTICS_FOR_SEED_TERM_TYPE = makeUninternedSymbol( "TACTICS-FOR-SEED-TERM-TYPE" );
    $sym129$TACTICS_TABLE_COPY = makeUninternedSymbol( "TACTICS-TABLE-COPY" );
    $sym130$REMOVE = makeSymbol( "REMOVE" );
    $sym131$RKF_SD_PROMPTER_TACTICS_FOR_SEED_TERM_TYPE = makeSymbol( "RKF-SD-PROMPTER-TACTICS-FOR-SEED-TERM-TYPE" );
    $list132 = ConsesLow.list( ConsesLow.list( makeSymbol( "FUNCTION" ), EQ ) );
    $list133 = ConsesLow.list( ConsesLow.list( makeSymbol( "COPY-TREE" ), makeSymbol( "*RKF-SD-SEED-TERM-TACTICS-TABLE*" ) ) );
    $sym134$ALIST_ENTER = makeSymbol( "ALIST-ENTER" );
    $list135 = ConsesLow.list( ConsesLow.list( makeSymbol( "SEED-TERM-TYPE" ), makeSymbol( "TACTICS" ) ), makeSymbol( "&BODY" ), makeSymbol( "BODY" ) );
    $sym136$TACTICS_FOR_SEED_TERM_TYPE = makeUninternedSymbol( "TACTICS-FOR-SEED-TERM-TYPE" );
    $sym137$TACTICS_TABLE_COPY = makeUninternedSymbol( "TACTICS-TABLE-COPY" );
    $list138 = ConsesLow.list( makeSymbol( "NON-DOTTED-LIST-P" ) );
    $sym139$ORDERED_SET_DIFFERENCE = makeSymbol( "ORDERED-SET-DIFFERENCE" );
    $const140$keSuggestion = constant_handles.reader_make_constant_shell( makeString( "keSuggestion" ) );
    $const141$keRequirement = constant_handles.reader_make_constant_shell( makeString( "keRequirement" ) );
    $const142$keInteractionRequirement = constant_handles.reader_make_constant_shell( makeString( "keInteractionRequirement" ) );
    $const143$keInteractionStrongSuggestion = constant_handles.reader_make_constant_shell( makeString( "keInteractionStrongSuggestion" ) );
    $list144 = ConsesLow.list( makeSymbol( "FORMULAS" ), makeSymbol( "JUSTIFICATIONS" ) );
    $kw145$KE_DRIVEN_PROMPTS = makeKeyword( "KE-DRIVEN-PROMPTS" );
    $sym146$RKF_NEIGHBOR_SUGGESTIONS = makeSymbol( "RKF-NEIGHBOR-SUGGESTIONS" );
    $kw147$SUPPRESS_RARELY_KNOWN_PROMPT_FORMULAS_ = makeKeyword( "SUPPRESS-RARELY-KNOWN-PROMPT-FORMULAS?" );
    $kw148$RESULTS_QUEUE = makeKeyword( "RESULTS-QUEUE" );
    $list149 = ConsesLow.cons( makeSymbol( "INFERENCE" ), makeSymbol( "FORMULA-VAR" ) );
    $str150$Timed_out_after__S_seconds_gettin = makeString( "Timed out after ~S seconds getting ~S for ~S.~%" );
    $kw151$PROBABLY_APPROXIMATELY_DONE = makeKeyword( "PROBABLY-APPROXIMATELY-DONE" );
    $str152$P_A_D__getting__S_for__S___ = makeString( "P.A.D. getting ~S for ~S.~%" );
    $kw153$EXHAUST_TOTAL = makeKeyword( "EXHAUST-TOTAL" );
    $str154$_S_is_not_continuable____Exit_con = makeString( "~S is not continuable.~% Exit condition: ~S~%" );
    $sym155$_SEED_TERM = makeSymbol( "?SEED-TERM" );
    $str156$Suppressing_SD_prompt_for__S_____ = makeString( "Suppressing SD prompt for ~S:~% ~S~% Couldn't find the minimum ~S similar terms about which that is known.~%" );
    $sym157$RKF_SD_SUPPRESS_FORMULA_THRESHOLD_FOR_PROPERTY = makeSymbol( "RKF-SD-SUPPRESS-FORMULA-THRESHOLD-FOR-PROPERTY" );
    $kw158$CACHED_INFERENCES = makeKeyword( "CACHED-INFERENCES" );
    $list159 = ConsesLow.list( NIL );
    $list160 = ConsesLow.cons( makeSymbol( "INFERENCE" ), makeSymbol( "VAR" ) );
    $sym161$_FORMULA = makeSymbol( "?FORMULA" );
    $list162 = ConsesLow.list( makeSymbol( "BINDINGS" ), makeSymbol( "SUPPORTS" ) );
    $sym163$_SOURCE_TERM = makeSymbol( "?SOURCE-TERM" );
    $kw164$ANALOGOUS_TERMS = makeKeyword( "ANALOGOUS-TERMS" );
    $const165$similarTo = constant_handles.reader_make_constant_shell( makeString( "similarTo" ) );
    $list166 = ConsesLow.list( makeSymbol( "SOURCE-JUSTIFICATION" ), makeSymbol( "UNKNOWN-JUSTIFICATION" ) );
    $kw167$PRECEDENT = makeKeyword( "PRECEDENT" );
    $const168$Predicate = constant_handles.reader_make_constant_shell( makeString( "Predicate" ) );
    $sym169$_X = makeSymbol( "?X" );
    $kw170$ANALOGY_SUGGESTIONS = makeKeyword( "ANALOGY-SUGGESTIONS" );
    $const171$unknownSentence = constant_handles.reader_make_constant_shell( makeString( "unknownSentence" ) );
    $kw172$USE_RULES_ = makeKeyword( "USE-RULES?" );
    $kw173$FALSE = makeKeyword( "FALSE" );
    $kw174$RULE_TABLE = makeKeyword( "RULE-TABLE" );
    $kw175$TRUE = makeKeyword( "TRUE" );
    $sym176$EL_EXPRESSION_EQUAL_ = makeSymbol( "EL-EXPRESSION-EQUAL?" );
    $sym177$RKF_SD_PROMPTER_RULES_FOR_TERM = makeSymbol( "RKF-SD-PROMPTER-RULES-FOR-TERM" );
    $kw178$NEG = makeKeyword( "NEG" );
    $kw179$POS = makeKeyword( "POS" );
    $sym180$RKF_SD_RULE_TUPLE__ = makeSymbol( "RKF-SD-RULE-TUPLE-=" );
    $sym181$RKF_SD_PREFER_RULE_TUPLE_ = makeSymbol( "RKF-SD-PREFER-RULE-TUPLE?" );
    $sym182$RKF_SD_LOW_SCORING_TUPLE_P = makeSymbol( "RKF-SD-LOW-SCORING-TUPLE-P" );
    $sym183$RKF_SD_SCORE_RULE_TUPLE = makeSymbol( "RKF-SD-SCORE-RULE-TUPLE" );
    $list184 = ConsesLow.list( makeSymbol( "GAF1" ), makeSymbol( "GAF-LIT1" ), makeSymbol( "RULE1" ), makeSymbol( "BINDINGS1" ) );
    $list185 = ConsesLow.list( makeSymbol( "GAF2" ), makeSymbol( "GAF-LIT2" ), makeSymbol( "RULE2" ), makeSymbol( "BINDINGS2" ) );
    $list186 = ConsesLow.list( makeSymbol( "RKF-SD-RST-SEED-TERM-IN-POS-LITS" ), makeSymbol( "RKF-SD-RST-SEED-TERM-IN-NEG-LITS" ), makeSymbol( "RKF-SD-RST-VAR-COUNT" ), makeSymbol( "RKF-SD-RST-NEG-LIT-COUNT" ),
        makeSymbol( "RKF-SD-RST-POS-LIT-COUNT" ), makeSymbol( "RKF-SD-RST-MT-GENERALITY" ), makeSymbol( "RKF-SD-RST-POS-LIT-QUALITY" ) );
    $kw187$BETTER = makeKeyword( "BETTER" );
    $kw188$WORSE = makeKeyword( "WORSE" );
    $list189 = ConsesLow.list( makeSymbol( "GAF" ), makeSymbol( "GAF-LIT" ), makeSymbol( "RULE" ), makeSymbol( "BINDINGS" ) );
    $sym190$RKF_SD_TERM_TOO_GENERAL_ = makeSymbol( "RKF-SD-TERM-TOO-GENERAL?" );
    $int191$5000 = makeInteger( 5000 );
    $const192$keStrongSuggestion = constant_handles.reader_make_constant_shell( makeString( "keStrongSuggestion" ) );
    $const193$keWeakSuggestion = constant_handles.reader_make_constant_shell( makeString( "keWeakSuggestion" ) );
    $sym194$RKF_SD_NOT_ASSERTIBLE_SUBPROMPTS_ = makeSymbol( "RKF-SD-NOT-ASSERTIBLE-SUBPROMPTS?" );
    $sym195$RKF_SD_UNPARSEABLE_SUBPROMPTS_ = makeSymbol( "RKF-SD-UNPARSEABLE-SUBPROMPTS?" );
    $sym196$RKF_SD_UNPARSEABLE_PROMPT_LIT_ = makeSymbol( "RKF-SD-UNPARSEABLE-PROMPT-LIT?" );
    $list197 = ConsesLow.list( makeKeyword( "ANYTHING" ) );
    $list198 = ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "SubLString" ) ), constant_handles.reader_make_constant_shell( makeString( "CycLAssertion" ) ) );
    $const199$defnSufficient = constant_handles.reader_make_constant_shell( makeString( "defnSufficient" ) );
    $const200$defnIff = constant_handles.reader_make_constant_shell( makeString( "defnIff" ) );
    $const201$resultIsa = constant_handles.reader_make_constant_shell( makeString( "resultIsa" ) );
    $const202$CoaDiagramObject = constant_handles.reader_make_constant_shell( makeString( "CoaDiagramObject" ) );
    $list203 = ConsesLow.list( makeSymbol( "UNKNOWN-CNF" ), makeSymbol( "JUST-SENTENCE" ) );
    $sym204$RKF_SD_PROMPTER_FIND_RULE_PROMPTS = makeSymbol( "RKF-SD-PROMPTER-FIND-RULE-PROMPTS" );
    $sym205$RKF_SD_EL_FULLY_BOUND_P = makeSymbol( "RKF-SD-EL-FULLY-BOUND-P" );
    $kw206$STRONG = makeKeyword( "STRONG" );
    $kw207$WEAK = makeKeyword( "WEAK" );
    $list208 = ConsesLow.cons( makeSymbol( "BINARY-PRED" ), makeSymbol( "COUNT" ) );
    $kw209$ISA = makeKeyword( "ISA" );
    $kw210$BIN_PRED = makeKeyword( "BIN-PRED" );
    $sym211$RKF_SD_PROMPT_EXAMPLE_INSTANCE = makeSymbol( "RKF-SD-PROMPT-EXAMPLE-INSTANCE" );
  }
}
/*
 * 
 * Total time: 2896 ms
 * 
 */