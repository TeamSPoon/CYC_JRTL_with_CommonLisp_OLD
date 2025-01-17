package com.cyc.cycjava.cycl;

import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeString;

import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class cb_html_parameters
    extends
      SubLTranslatedFile
{
  public static final SubLFile me;
  public static final String myName = "com.cyc.cycjava.cycl.cb_html_parameters";
  public static final String myFingerPrint = "bf11cac43edde25761b233816dc05d0ca4a0a5bafd5bcabb4318dd659d0230b4";
  @SubLTranslatedFile.SubL(source = "cycl/cb-html-parameters.lisp", position = 922L)
  public static SubLSymbol $cb_html_assertion_sentence_class$;
  @SubLTranslatedFile.SubL(source = "cycl/cb-html-parameters.lisp", position = 1065L)
  public static SubLSymbol $cb_html_assertion_class$;
  @SubLTranslatedFile.SubL(source = "cycl/cb-html-parameters.lisp", position = 1229L)
  public static SubLSymbol $cb_html_assert_class$;
  @SubLTranslatedFile.SubL(source = "cycl/cb-html-parameters.lisp", position = 1348L)
  public static SubLSymbol $cb_html_rule_class$;
  @SubLTranslatedFile.SubL(source = "cycl/cb-html-parameters.lisp", position = 1476L)
  public static SubLSymbol $cb_html_nat_class$;
  @SubLTranslatedFile.SubL(source = "cycl/cb-html-parameters.lisp", position = 1543L)
  public static SubLSymbol $cb_html_cons_class$;
  @SubLTranslatedFile.SubL(source = "cycl/cb-html-parameters.lisp", position = 1611L)
  public static SubLSymbol $cb_html_string_class$;
  @SubLTranslatedFile.SubL(source = "cycl/cb-html-parameters.lisp", position = 1681L)
  public static SubLSymbol $cb_html_edit_class$;
  @SubLTranslatedFile.SubL(source = "cycl/cb-html-parameters.lisp", position = 1827L)
  public static SubLSymbol $cb_html_no_edit_class$;
  @SubLTranslatedFile.SubL(source = "cycl/cb-html-parameters.lisp", position = 1977L)
  public static SubLSymbol $cb_html_no_modification_class$;
  @SubLTranslatedFile.SubL(source = "cycl/cb-html-parameters.lisp", position = 2152L)
  public static SubLSymbol $cb_html_lexical_assertion_class$;
  @SubLTranslatedFile.SubL(source = "cycl/cb-html-parameters.lisp", position = 2293L)
  public static SubLSymbol $cb_html_warn_class$;
  @SubLTranslatedFile.SubL(source = "cycl/cb-html-parameters.lisp", position = 2411L)
  public static SubLSymbol $cb_html_obsolete_class$;
  private static final SubLString $str0$assert_sent_;
  private static final SubLString $str1$assertion_;
  private static final SubLString $str2$assert_;
  private static final SubLString $str3$rule_;
  private static final SubLString $str4$nat_;
  private static final SubLString $str5$cons_;
  private static final SubLString $str6$string_;
  private static final SubLString $str7$edit_;
  private static final SubLString $str8$noedit_;
  private static final SubLString $str9$nomod_;
  private static final SubLString $str10$lex_;
  private static final SubLString $str11$warn_;
  private static final SubLString $str12$obsolete_;

  public static SubLObject declare_cb_html_parameters_file()
  {
    return NIL;
  }

  public static SubLObject init_cb_html_parameters_file()
  {
    $cb_html_assertion_sentence_class$ = SubLFiles.defparameter( "*CB-HTML-ASSERTION-SENTENCE-CLASS*", $str0$assert_sent_ );
    $cb_html_assertion_class$ = SubLFiles.defparameter( "*CB-HTML-ASSERTION-CLASS*", $str1$assertion_ );
    $cb_html_assert_class$ = SubLFiles.defparameter( "*CB-HTML-ASSERT-CLASS*", $str2$assert_ );
    $cb_html_rule_class$ = SubLFiles.defparameter( "*CB-HTML-RULE-CLASS*", $str3$rule_ );
    $cb_html_nat_class$ = SubLFiles.defparameter( "*CB-HTML-NAT-CLASS*", $str4$nat_ );
    $cb_html_cons_class$ = SubLFiles.defparameter( "*CB-HTML-CONS-CLASS*", $str5$cons_ );
    $cb_html_string_class$ = SubLFiles.defparameter( "*CB-HTML-STRING-CLASS*", $str6$string_ );
    $cb_html_edit_class$ = SubLFiles.defparameter( "*CB-HTML-EDIT-CLASS*", $str7$edit_ );
    $cb_html_no_edit_class$ = SubLFiles.defparameter( "*CB-HTML-NO-EDIT-CLASS*", $str8$noedit_ );
    $cb_html_no_modification_class$ = SubLFiles.defparameter( "*CB-HTML-NO-MODIFICATION-CLASS*", $str9$nomod_ );
    $cb_html_lexical_assertion_class$ = SubLFiles.defparameter( "*CB-HTML-LEXICAL-ASSERTION-CLASS*", $str10$lex_ );
    $cb_html_warn_class$ = SubLFiles.defparameter( "*CB-HTML-WARN-CLASS*", $str11$warn_ );
    $cb_html_obsolete_class$ = SubLFiles.defparameter( "*CB-HTML-OBSOLETE-CLASS*", $str12$obsolete_ );
    return NIL;
  }

  public static SubLObject setup_cb_html_parameters_file()
  {
    return NIL;
  }

  @Override
  public void declareFunctions()
  {
    declare_cb_html_parameters_file();
  }

  @Override
  public void initializeVariables()
  {
    init_cb_html_parameters_file();
  }

  @Override
  public void runTopLevelForms()
  {
    setup_cb_html_parameters_file();
  }
  static
  {
    me = new cb_html_parameters();
    $cb_html_assertion_sentence_class$ = null;
    $cb_html_assertion_class$ = null;
    $cb_html_assert_class$ = null;
    $cb_html_rule_class$ = null;
    $cb_html_nat_class$ = null;
    $cb_html_cons_class$ = null;
    $cb_html_string_class$ = null;
    $cb_html_edit_class$ = null;
    $cb_html_no_edit_class$ = null;
    $cb_html_no_modification_class$ = null;
    $cb_html_lexical_assertion_class$ = null;
    $cb_html_warn_class$ = null;
    $cb_html_obsolete_class$ = null;
    $str0$assert_sent_ = makeString( "assert-sent " );
    $str1$assertion_ = makeString( "assertion " );
    $str2$assert_ = makeString( "assert " );
    $str3$rule_ = makeString( "rule " );
    $str4$nat_ = makeString( "nat " );
    $str5$cons_ = makeString( "cons " );
    $str6$string_ = makeString( "string " );
    $str7$edit_ = makeString( "edit " );
    $str8$noedit_ = makeString( "noedit " );
    $str9$nomod_ = makeString( "nomod " );
    $str10$lex_ = makeString( "lex " );
    $str11$warn_ = makeString( "warn " );
    $str12$obsolete_ = makeString( "obsolete " );
  }
}
/*
 * 
 * Total time: 62 ms
 * 
 */