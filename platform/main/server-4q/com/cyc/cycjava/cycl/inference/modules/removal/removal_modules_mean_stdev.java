package com.cyc.cycjava.cycl.inference.modules.removal;

import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeKeyword;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeString;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeSymbol;

import com.cyc.cycjava.cycl.constant_handles;
import com.cyc.cycjava.cycl.number_utilities;
import com.cyc.cycjava.cycl.utilities_macros;
import com.cyc.cycjava.cycl.inference.harness.inference_modules;
import com.cyc.cycjava.cycl.inference.modules.preference_modules;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class removal_modules_mean_stdev
    extends
      SubLTranslatedFile
{
  public static final SubLFile me;
  public static final String myName = "com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_mean_stdev";
  public static final String myFingerPrint = "d846f69ab60440df89f992b7576d7c8e93bdd5721f6cd6470614c7656f576f02";
  private static final SubLObject $const0$averageOfListElementsWithStandard;
  private static final SubLSymbol $kw1$POS;
  private static final SubLSymbol $kw2$REMOVAL_MEAN_STDEV_UNIFY_ARG1_ARG2;
  private static final SubLList $list3;
  private static final SubLSymbol $sym4$REMOVAL_STANDARD_DEVIATION_TUPLE;

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-mean-stdev.lisp", position = 2272L)
  public static SubLObject removal_standard_deviation_tuple(final SubLObject numbers)
  {
    return Values.arg2( Values.resetMultipleValues(), Values.multiple_value_list( number_utilities.standard_deviation_from_population( numbers ) ) );
  }

  public static SubLObject declare_removal_modules_mean_stdev_file()
  {
    SubLFiles.declareFunction( me, "removal_standard_deviation_tuple", "REMOVAL-STANDARD-DEVIATION-TUPLE", 1, 0, false );
    return NIL;
  }

  public static SubLObject init_removal_modules_mean_stdev_file()
  {
    return NIL;
  }

  public static SubLObject setup_removal_modules_mean_stdev_file()
  {
    inference_modules.register_solely_specific_removal_module_predicate( $const0$averageOfListElementsWithStandard );
    preference_modules.doomed_unless_arg_bindable( $kw1$POS, $const0$averageOfListElementsWithStandard, ONE_INTEGER );
    inference_modules.inference_removal_module( $kw2$REMOVAL_MEAN_STDEV_UNIFY_ARG1_ARG2, $list3 );
    utilities_macros.note_funcall_helper_function( $sym4$REMOVAL_STANDARD_DEVIATION_TUPLE );
    return NIL;
  }

  @Override
  public void declareFunctions()
  {
    declare_removal_modules_mean_stdev_file();
  }

  @Override
  public void initializeVariables()
  {
    init_removal_modules_mean_stdev_file();
  }

  @Override
  public void runTopLevelForms()
  {
    setup_removal_modules_mean_stdev_file();
  }
  static
  {
    me = new removal_modules_mean_stdev();
    $const0$averageOfListElementsWithStandard = constant_handles.reader_make_constant_shell( makeString( "averageOfListElementsWithStandardDeviation" ) );
    $kw1$POS = makeKeyword( "POS" );
    $kw2$REMOVAL_MEAN_STDEV_UNIFY_ARG1_ARG2 = makeKeyword( "REMOVAL-MEAN-STDEV-UNIFY-ARG1-ARG2" );
    $list3 = ConsesLow.list( new SubLObject[] { makeKeyword( "SENSE" ), makeKeyword( "POS" ), makeKeyword( "PREDICATE" ), constant_handles.reader_make_constant_shell( makeString(
        "averageOfListElementsWithStandardDeviation" ) ), makeKeyword( "REQUIRED-PATTERN" ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "averageOfListElementsWithStandardDeviation" ) ),
            makeKeyword( "FULLY-BOUND" ), makeKeyword( "NOT-FULLY-BOUND" ), makeKeyword( "NOT-FULLY-BOUND" ) ), makeKeyword( "COST-EXPRESSION" ), ONE_INTEGER, makeKeyword( "COMPLETENESS" ), makeKeyword( "COMPLETE" ),
      makeKeyword( "INPUT-EXTRACT-PATTERN" ), ConsesLow.list( makeKeyword( "TEMPLATE" ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "averageOfListElementsWithStandardDeviation" ) ),
          ConsesLow.list( makeKeyword( "BIND" ), makeSymbol( "INPUT-EL-LIST" ) ), makeKeyword( "ANYTHING" ), makeKeyword( "ANYTHING" ) ), makeKeyword( "SUCCESS" ) ), makeKeyword( "INPUT-ENCODE-PATTERN" ), ConsesLow.list(
              makeKeyword( "TEMPLATE" ), makeKeyword( "ANYTHING" ), ConsesLow.list( makeKeyword( "CALL" ), makeSymbol( "EL-LIST-ITEMS" ), ConsesLow.list( makeKeyword( "VALUE" ), makeSymbol( "INPUT-EL-LIST" ) ) ) ),
      makeKeyword( "OUTPUT-GENERATE-PATTERN" ), ConsesLow.list( ConsesLow.list( makeKeyword( "CALL" ), makeSymbol( "REMOVAL-STANDARD-DEVIATION-TUPLE" ), makeKeyword( "INPUT" ) ) ), makeKeyword(
          "OUTPUT-CONSTRUCT-PATTERN" ), ConsesLow.list( makeKeyword( "TUPLE" ), ConsesLow.list( makeSymbol( "STDEV" ), makeSymbol( "AVERAGE" ) ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString(
              "averageOfListElementsWithStandardDeviation" ) ), ConsesLow.list( makeKeyword( "VALUE" ), makeSymbol( "INPUT-EL-LIST" ) ), ConsesLow.list( makeKeyword( "VALUE" ), makeSymbol( "AVERAGE" ) ), ConsesLow.list(
                  makeKeyword( "VALUE" ), makeSymbol( "STDEV" ) ) ) ), makeKeyword( "SUPPORT-MODULE" ), makeKeyword( "OPAQUE" ), makeKeyword( "SUPPORT-STRENGTH" ), makeKeyword( "MONOTONIC" ), makeKeyword( "SUPPORT-MT" ),
      constant_handles.reader_make_constant_shell( makeString( "BaseKB" ) ), makeKeyword( "DOCUMENTATION" ), makeString( "(#$averageOfListElementsWithStandardDeviation :fully-bound :not-fully-bound :not-fully-bound)" ),
      makeKeyword( "EXAMPLE" ), makeString( "(#$averageOfListElementsWithStandardDeviation (#$TheList 1 2 3 4 5) ?MEAN ?STDEV)\nwill bind ?MEAN to 3, and ?STDEV to 1.4142135623730951." )
    } );
    $sym4$REMOVAL_STANDARD_DEVIATION_TUPLE = makeSymbol( "REMOVAL-STANDARD-DEVIATION-TUPLE" );
  }
}
/*
 * 
 * Total time: 18 ms
 * 
 */