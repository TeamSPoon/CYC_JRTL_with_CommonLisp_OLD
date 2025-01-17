package com.cyc.cycjava.cycl.inference.harness;

import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeBoolean;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeKeyword;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeString;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeSymbol;

import com.cyc.cycjava.cycl.list_utilities;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class abductive_tactician
    extends
      SubLTranslatedFile
{
  public static final SubLFile me;
  public static final String myName = "com.cyc.cycjava.cycl.inference.harness.abductive_tactician";
  public static final String myFingerPrint = "44d6c31da66b5582b1063bac339fbd1f5f5dc7b4da9cb197f71d47d668243c34";
  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/abductive-tactician.lisp", position = 839L)
  public static SubLSymbol $abductive_strategy_type$;
  private static final SubLSymbol $kw0$ABDUCTIVE;
  private static final SubLList $list1;
  private static final SubLList $list2;

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/abductive-tactician.lisp", position = 966L)
  public static SubLObject abductive_strategy_p(final SubLObject v_object)
  {
    return makeBoolean( NIL != inference_datastructures_strategy.strategy_p( v_object ) && NIL != list_utilities.member_eqP( inference_datastructures_strategy.strategy_type( v_object ), $list1 ) );
  }

  public static SubLObject declare_abductive_tactician_file()
  {
    SubLFiles.declareFunction( me, "abductive_strategy_p", "ABDUCTIVE-STRATEGY-P", 1, 0, false );
    return NIL;
  }

  public static SubLObject init_abductive_tactician_file()
  {
    $abductive_strategy_type$ = SubLFiles.defvar( "*ABDUCTIVE-STRATEGY-TYPE*", $kw0$ABDUCTIVE );
    return NIL;
  }

  public static SubLObject setup_abductive_tactician_file()
  {
    inference_tactician.inference_strategy_type( $kw0$ABDUCTIVE, $list2 );
    return NIL;
  }

  @Override
  public void declareFunctions()
  {
    declare_abductive_tactician_file();
  }

  @Override
  public void initializeVariables()
  {
    init_abductive_tactician_file();
  }

  @Override
  public void runTopLevelForms()
  {
    setup_abductive_tactician_file();
  }
  static
  {
    me = new abductive_tactician();
    $abductive_strategy_type$ = null;
    $kw0$ABDUCTIVE = makeKeyword( "ABDUCTIVE" );
    $list1 = ConsesLow.list( makeKeyword( "ABDUCTIVE" ) );
    $list2 = ConsesLow.list( new SubLObject[] { makeKeyword( "NAME" ), makeString( "Abductive Tactician" ), makeKeyword( "COMMENT" ), makeString( "A balancing tactician type subclassed to handle abduction." ),
      makeKeyword( "CONSTRUCTOR" ), makeSymbol( "BALANCING-TACTICIAN-INITIALIZE" ), makeKeyword( "DONE?" ), makeSymbol( "BALANCING-TACTICIAN-DONE?" ), makeKeyword( "DO-ONE-STEP" ), makeSymbol(
          "BALANCING-TACTICIAN-DO-ONE-STEP" ), makeKeyword( "INITIAL-RELEVANT-STRATEGIES" ), makeSymbol( "BALANCING-TACTICIAN-INITIAL-RELEVANT-STRATEGIES" ), makeKeyword( "INITIALIZE-PROPERTIES" ), makeSymbol(
              "BALANCING-TACTICIAN-INITIALIZE-PROPERTIES" ), makeKeyword( "UPDATE-PROPERTIES" ), makeSymbol( "BALANCING-TACTICIAN-UPDATE-PROPERTIES" ), makeKeyword( "INFERENCE-DYNAMIC-PROPERTIES-UPDATED" ), makeSymbol(
                  "BALANCING-TACTICIAN-NOTE-INFERENCE-DYNAMIC-PROPERTIES-UPDATED" ), makeKeyword( "CONTINUATION-POSSIBLE?" ), makeSymbol( "BALANCING-TACTICIAN-CONTINUATION-POSSIBLE?" ), makeKeyword(
                      "THROW-AWAY-UNINTERESTING-SET-ASIDES" ), makeSymbol( "BALANCING-TACTICIAN-THROW-AWAY-UNINTERESTING-SET-ASIDES" ), makeKeyword( "EARLY-REMOVAL-PRODUCTIVITY-LIMIT" ), makeSymbol(
                          "BALANCING-TACTICIAN-EARLY-REMOVAL-PRODUCTIVITY-LIMIT" ), makeKeyword( "POSSIBLY-ACTIVATE-PROBLEM" ), makeSymbol( "BALANCING-TACTICIAN-POSSIBLY-ACTIVATE-PROBLEM" ), makeKeyword(
                              "THROW-AWAY-PROBLEM" ), makeSymbol( "BALANCING-TACTICIAN-CHOOSES-TO-THROW-AWAY-PROBLEM?" ), makeKeyword( "SET-ASIDE-PROBLEM" ), makeSymbol(
                                  "BALANCING-TACTICIAN-CHOOSES-TO-SET-ASIDE-PROBLEM?" ), makeKeyword( "THROW-AWAY-TACTIC" ), makeSymbol( "BALANCING-TACTICIAN-CHOOSES-TO-THROW-AWAY-TACTIC?" ), makeKeyword(
                                      "SET-ASIDE-TACTIC" ), makeSymbol( "BALANCING-TACTICIAN-CHOOSES-TO-SET-ASIDE-TACTIC?" ), makeKeyword( "NEW-ARGUMENT-LINK" ), makeSymbol( "BALANCING-TACTICIAN-NOTE-ARGUMENT-LINK" ),
      makeKeyword( "NEW-TACTIC" ), makeSymbol( "IGNORE" ), makeKeyword( "SPLIT-TACTICS-POSSIBLE" ), makeSymbol( "IGNORE" ), makeKeyword( "PROBLEM-COULD-BE-PENDING" ), makeSymbol( "IGNORE" ), makeKeyword(
          "LINK-HEAD-MOTIVATED?" ), makeSymbol( "FALSE" ), makeKeyword( "PROBLEM-NOTHING-TO-DO?" ), makeSymbol( "FALSE" ), makeKeyword( "SUBSTRATEGY-STRATEGEM-MOTIVATED" ), makeSymbol(
              "BALANCING-TACTICIAN-SUBSTRATEGY-STRATEGEM-MOTIVATED" ), makeKeyword( "SUBSTRATEGY-TOTALLY-THROW-AWAY-TACTIC" ), makeSymbol( "BALANCING-TACTICIAN-CHOOSES-TO-TOTALLY-THROW-AWAY-TACTIC?" ), makeKeyword(
                  "SUBSTRATEGY-ALLOW-SPLIT-TACTIC-SET-ASIDE-WRT-REMOVAL" ), makeSymbol( "BALANCING-TACTICIAN-ALLOWS-SPLIT-TACTIC-TO-BE-SET-ASIDE-WRT-REMOVAL?" ), makeKeyword( "SUBSTRATEGY-PROBLEM-STATUS-CHANGE" ),
      makeSymbol( "BALANCING-TACTICIAN-SUBSTRATEGY-PROBLEM-STATUS-CHANGE" )
    } );
  }
}
/*
 * 
 * Total time: 119 ms
 * 
 */