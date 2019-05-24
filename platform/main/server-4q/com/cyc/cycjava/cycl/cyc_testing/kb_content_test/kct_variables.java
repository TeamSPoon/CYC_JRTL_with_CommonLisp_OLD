package com.cyc.cycjava.cycl.cyc_testing.kb_content_test;

import com.cyc.cycjava.cycl.constant_handles;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.cycjava.cycl.fort_types_interface;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class kct_variables
    extends
      SubLTranslatedFile
{
  public static final SubLFile me;
  public static final String myName = "com.cyc.cycjava.cycl.cyc_testing.kb_content_test.kct_variables";
  public static final String myFingerPrint = "76d31cd7a46a1f57c0b901290b2bbf5e11af4e75c19e28a1ba182e87c16eb155";
  @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/kb-content-test/kct-variables.lisp", position = 789L)
  private static SubLSymbol $kct_mt$;
  private static final SubLObject $const0$TestVocabularyMt;
  private static final SubLSymbol $sym1$MICROTHEORY_P;
  private static final SubLObject $const2$Now;
  private static final SubLObject $const3$Null_TimeParameter;

  @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/kb-content-test/kct-variables.lisp", position = 893L)
  public static SubLObject kct_mt()
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    return $kct_mt$.getDynamicValue( thread );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/kb-content-test/kct-variables.lisp", position = 1031L)
  public static SubLObject set_kct_mt(final SubLObject mt)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    assert NIL != fort_types_interface.microtheory_p( mt ) : mt;
    $kct_mt$.setDynamicValue( mt, thread );
    return $kct_mt$.getDynamicValue( thread );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/kb-content-test/kct-variables.lisp", position = 1138L)
  public static SubLObject kct_mt_for_now(SubLObject mt)
  {
    if( mt == UNPROVIDED )
    {
      mt = kct_mt();
    }
    return kct_utils.kct_new_hlmt( mt, $const2$Now, $const3$Null_TimeParameter );
  }

  public static SubLObject declare_kct_variables_file()
  {
    SubLFiles.declareFunction( me, "kct_mt", "KCT-MT", 0, 0, false );
    SubLFiles.declareFunction( me, "set_kct_mt", "SET-KCT-MT", 1, 0, false );
    SubLFiles.declareFunction( me, "kct_mt_for_now", "KCT-MT-FOR-NOW", 0, 1, false );
    return NIL;
  }

  public static SubLObject init_kct_variables_file()
  {
    $kct_mt$ = SubLFiles.defparameter( "*KCT-MT*", $const0$TestVocabularyMt );
    return NIL;
  }

  public static SubLObject setup_kct_variables_file()
  {
    return NIL;
  }

  @Override
  public void declareFunctions()
  {
    declare_kct_variables_file();
  }

  @Override
  public void initializeVariables()
  {
    init_kct_variables_file();
  }

  @Override
  public void runTopLevelForms()
  {
    setup_kct_variables_file();
  }
  static
  {
    me = new kct_variables();
    $kct_mt$ = null;
    $const0$TestVocabularyMt = constant_handles.reader_make_constant_shell( makeString( "TestVocabularyMt" ) );
    $sym1$MICROTHEORY_P = makeSymbol( "MICROTHEORY-P" );
    $const2$Now = constant_handles.reader_make_constant_shell( makeString( "Now" ) );
    $const3$Null_TimeParameter = constant_handles.reader_make_constant_shell( makeString( "Null-TimeParameter" ) );
  }
}
/*
 * 
 * Total time: 76 ms
 * 
 */