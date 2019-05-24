package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.UnaryFunction;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLStructDecl;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLStructDeclNative;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLStructNative;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.visitation;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLSpecialOperatorDeclarations;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Structures;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sort;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Mapping;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Strings;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.StreamsLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Guids;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.compatibility;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class lexification_wizard
    extends
      SubLTranslatedFile
{
  public static final SubLFile me;
  public static final String myName = "com.cyc.cycjava.cycl.lexification_wizard";
  public static final String myFingerPrint = "3291204033f65a35e7041d9926e840a11e7d44dfea6c932fef933d425f14a044";
  @SubLTranslatedFile.SubL(source = "cycl/lexification-wizard.lisp", position = 3198L)
  public static SubLSymbol $dtp_lexification_parameters$;
  @SubLTranslatedFile.SubL(source = "cycl/lexification-wizard.lisp", position = 5765L)
  public static SubLSymbol $lexwiz_defaults$;
  @SubLTranslatedFile.SubL(source = "cycl/lexification-wizard.lisp", position = 6174L)
  public static SubLSymbol $lexification_part_of_speech_keywords$;
  @SubLTranslatedFile.SubL(source = "cycl/lexification-wizard.lisp", position = 6532L)
  public static SubLSymbol $main_lexification_parts_of_speech$;
  @SubLTranslatedFile.SubL(source = "cycl/lexification-wizard.lisp", position = 6653L)
  public static SubLSymbol $all_lexification_parts_of_speech_labels$;
  @SubLTranslatedFile.SubL(source = "cycl/lexification-wizard.lisp", position = 6801L)
  public static SubLSymbol $lexification_proper_name_predicate_names$;
  @SubLTranslatedFile.SubL(source = "cycl/lexification-wizard.lisp", position = 6947L)
  public static SubLSymbol $lexification_proper_name_predicate_constraints$;
  @SubLTranslatedFile.SubL(source = "cycl/lexification-wizard.lisp", position = 7087L)
  public static SubLSymbol $lexification_mts$;
  @SubLTranslatedFile.SubL(source = "cycl/lexification-wizard.lisp", position = 7177L)
  public static SubLSymbol $default_proper_name_pred$;
  @SubLTranslatedFile.SubL(source = "cycl/lexification-wizard.lisp", position = 7305L)
  public static SubLSymbol $default_denotation_predicate$;
  @SubLTranslatedFile.SubL(source = "cycl/lexification-wizard.lisp", position = 7427L)
  public static SubLSymbol $lexification_object_table$;
  @SubLTranslatedFile.SubL(source = "cycl/lexification-wizard.lisp", position = 7600L)
  private static SubLSymbol $lexification_wizard_initialized$;
  @SubLTranslatedFile.SubL(source = "cycl/lexification-wizard.lisp", position = 7725L)
  public static SubLSymbol $sme_lexwiz_active$;
  @SubLTranslatedFile.SubL(source = "cycl/lexification-wizard.lisp", position = 7965L)
  public static SubLSymbol $allow_advanced_lexwiz_featuresP$;
  @SubLTranslatedFile.SubL(source = "cycl/lexification-wizard.lisp", position = 8131L)
  public static SubLSymbol $lexification_template_mts$;
  @SubLTranslatedFile.SubL(source = "cycl/lexification-wizard.lisp", position = 8229L)
  public static SubLSymbol $isolate_syntactic_mappingsP$;
  @SubLTranslatedFile.SubL(source = "cycl/lexification-wizard.lisp", position = 8376L)
  public static SubLSymbol $lexwiz_show_term_informationP$;
  @SubLTranslatedFile.SubL(source = "cycl/lexification-wizard.lisp", position = 40529L)
  private static SubLSymbol $lexwiz_test$;
  @SubLTranslatedFile.SubL(source = "cycl/lexification-wizard.lisp", position = 40529L)
  private static SubLSymbol $lexwiz_test_category$;
  @SubLTranslatedFile.SubL(source = "cycl/lexification-wizard.lisp", position = 40529L)
  private static SubLSymbol $lexwiz_test_suite$;
  @SubLTranslatedFile.SubL(source = "cycl/lexification-wizard.lisp", position = 40529L)
  private static SubLSymbol $lexwiz_module$;
  private static final SubLSymbol $sym0$LEXIFICATION_PARAMETERS;
  private static final SubLSymbol $sym1$LEXIFICATION_PARAMETERS_P;
  private static final SubLList $list2;
  private static final SubLList $list3;
  private static final SubLList $list4;
  private static final SubLList $list5;
  private static final SubLSymbol $sym6$DEFAULT_STRUCT_PRINT_FUNCTION;
  private static final SubLInteger $int7$21;
  private static final SubLInteger $int8$22;
  private static final SubLInteger $int9$23;
  private static final SubLInteger $int10$24;
  private static final SubLInteger $int11$25;
  private static final SubLInteger $int12$26;
  private static final SubLInteger $int13$27;
  private static final SubLInteger $int14$28;
  private static final SubLInteger $int15$29;
  private static final SubLSymbol $sym16$LEXIFICATION_PARAMETERS_PRINT_FUNCTION_TRAMPOLINE;
  private static final SubLList $list17;
  private static final SubLSymbol $sym18$LEXWIZ_ID;
  private static final SubLSymbol $sym19$_CSETF_LEXWIZ_ID;
  private static final SubLSymbol $sym20$LEXWIZ_TERM;
  private static final SubLSymbol $sym21$_CSETF_LEXWIZ_TERM;
  private static final SubLSymbol $sym22$LEXWIZ_PHRASE;
  private static final SubLSymbol $sym23$_CSETF_LEXWIZ_PHRASE;
  private static final SubLSymbol $sym24$LEXWIZ_MT;
  private static final SubLSymbol $sym25$_CSETF_LEXWIZ_MT;
  private static final SubLSymbol $sym26$LEXWIZ_IS_PREFERRED_;
  private static final SubLSymbol $sym27$_CSETF_LEXWIZ_IS_PREFERRED_;
  private static final SubLSymbol $sym28$LEXWIZ_IS_PROPER_;
  private static final SubLSymbol $sym29$_CSETF_LEXWIZ_IS_PROPER_;
  private static final SubLSymbol $sym30$LEXWIZ_NONRELATIONAL_;
  private static final SubLSymbol $sym31$_CSETF_LEXWIZ_NONRELATIONAL_;
  private static final SubLSymbol $sym32$LEXWIZ_PROPER_NAME_PRED;
  private static final SubLSymbol $sym33$_CSETF_LEXWIZ_PROPER_NAME_PRED;
  private static final SubLSymbol $sym34$LEXWIZ_TEMPLATE;
  private static final SubLSymbol $sym35$_CSETF_LEXWIZ_TEMPLATE;
  private static final SubLSymbol $sym36$LEXWIZ_TEMPLATE_ARGS;
  private static final SubLSymbol $sym37$_CSETF_LEXWIZ_TEMPLATE_ARGS;
  private static final SubLSymbol $sym38$LEXWIZ_TEMPLATE_SPEECH_PARTS;
  private static final SubLSymbol $sym39$_CSETF_LEXWIZ_TEMPLATE_SPEECH_PARTS;
  private static final SubLSymbol $sym40$LEXWIZ_IGNORE_ARITY_;
  private static final SubLSymbol $sym41$_CSETF_LEXWIZ_IGNORE_ARITY_;
  private static final SubLSymbol $sym42$LEXWIZ_HEADWORD_POSITION;
  private static final SubLSymbol $sym43$_CSETF_LEXWIZ_HEADWORD_POSITION;
  private static final SubLSymbol $sym44$LEXWIZ_HEADWORD_PART_OF_SPEECH;
  private static final SubLSymbol $sym45$_CSETF_LEXWIZ_HEADWORD_PART_OF_SPEECH;
  private static final SubLSymbol $sym46$LEXWIZ_ERROR_MESSAGE;
  private static final SubLSymbol $sym47$_CSETF_LEXWIZ_ERROR_MESSAGE;
  private static final SubLSymbol $sym48$LEXWIZ_STATE;
  private static final SubLSymbol $sym49$_CSETF_LEXWIZ_STATE;
  private static final SubLSymbol $sym50$LEXWIZ_READY_;
  private static final SubLSymbol $sym51$_CSETF_LEXWIZ_READY_;
  private static final SubLSymbol $sym52$LEXWIZ_FORMULA;
  private static final SubLSymbol $sym53$_CSETF_LEXWIZ_FORMULA;
  private static final SubLSymbol $sym54$LEXWIZ_USER_EDITED_;
  private static final SubLSymbol $sym55$_CSETF_LEXWIZ_USER_EDITED_;
  private static final SubLSymbol $sym56$LEXWIZ_USER_FORMULA;
  private static final SubLSymbol $sym57$_CSETF_LEXWIZ_USER_FORMULA;
  private static final SubLSymbol $sym58$LEXWIZ_OTHER_FORMULAS;
  private static final SubLSymbol $sym59$_CSETF_LEXWIZ_OTHER_FORMULAS;
  private static final SubLSymbol $sym60$LEXWIZ_USER_ACTION;
  private static final SubLSymbol $sym61$_CSETF_LEXWIZ_USER_ACTION;
  private static final SubLSymbol $sym62$LEXWIZ_PARSE_TEMPLATE_MT;
  private static final SubLSymbol $sym63$_CSETF_LEXWIZ_PARSE_TEMPLATE_MT;
  private static final SubLSymbol $sym64$LEXWIZ_PARSE_TEMPLATE;
  private static final SubLSymbol $sym65$_CSETF_LEXWIZ_PARSE_TEMPLATE;
  private static final SubLSymbol $sym66$LEXWIZ_PARSE_TEMPLATE_FORMULA;
  private static final SubLSymbol $sym67$_CSETF_LEXWIZ_PARSE_TEMPLATE_FORMULA;
  private static final SubLSymbol $sym68$LEXWIZ_LEXICAL_MT;
  private static final SubLSymbol $sym69$_CSETF_LEXWIZ_LEXICAL_MT;
  private static final SubLSymbol $sym70$LEXWIZ_SYNTACTIC_MT;
  private static final SubLSymbol $sym71$_CSETF_LEXWIZ_SYNTACTIC_MT;
  private static final SubLSymbol $sym72$LEXWIZ_GENERATION_MT;
  private static final SubLSymbol $sym73$_CSETF_LEXWIZ_GENERATION_MT;
  private static final SubLSymbol $kw74$ID;
  private static final SubLSymbol $kw75$TERM;
  private static final SubLSymbol $kw76$PHRASE;
  private static final SubLSymbol $kw77$MT;
  private static final SubLSymbol $kw78$IS_PREFERRED_;
  private static final SubLSymbol $kw79$IS_PROPER_;
  private static final SubLSymbol $kw80$NONRELATIONAL_;
  private static final SubLSymbol $kw81$PROPER_NAME_PRED;
  private static final SubLSymbol $kw82$TEMPLATE;
  private static final SubLSymbol $kw83$TEMPLATE_ARGS;
  private static final SubLSymbol $kw84$TEMPLATE_SPEECH_PARTS;
  private static final SubLSymbol $kw85$IGNORE_ARITY_;
  private static final SubLSymbol $kw86$HEADWORD_POSITION;
  private static final SubLSymbol $kw87$HEADWORD_PART_OF_SPEECH;
  private static final SubLSymbol $kw88$ERROR_MESSAGE;
  private static final SubLSymbol $kw89$STATE;
  private static final SubLSymbol $kw90$READY_;
  private static final SubLSymbol $kw91$FORMULA;
  private static final SubLSymbol $kw92$USER_EDITED_;
  private static final SubLSymbol $kw93$USER_FORMULA;
  private static final SubLSymbol $kw94$OTHER_FORMULAS;
  private static final SubLSymbol $kw95$USER_ACTION;
  private static final SubLSymbol $kw96$PARSE_TEMPLATE_MT;
  private static final SubLSymbol $kw97$PARSE_TEMPLATE;
  private static final SubLSymbol $kw98$PARSE_TEMPLATE_FORMULA;
  private static final SubLSymbol $kw99$LEXICAL_MT;
  private static final SubLSymbol $kw100$SYNTACTIC_MT;
  private static final SubLSymbol $kw101$GENERATION_MT;
  private static final SubLString $str102$Invalid_slot__S_for_construction_;
  private static final SubLSymbol $kw103$BEGIN;
  private static final SubLSymbol $sym104$MAKE_LEXIFICATION_PARAMETERS;
  private static final SubLSymbol $kw105$SLOT;
  private static final SubLSymbol $kw106$END;
  private static final SubLSymbol $sym107$VISIT_DEFSTRUCT_OBJECT_LEXIFICATION_PARAMETERS_METHOD;
  private static final SubLList $list108;
  private static final SubLSymbol $sym109$_MAIN_LEXIFICATION_PARTS_OF_SPEECH_;
  private static final SubLSymbol $sym110$_ALL_LEXIFICATION_PARTS_OF_SPEECH_LABELS_;
  private static final SubLSymbol $sym111$_LEXIFICATION_PROPER_NAME_PREDICATE_NAMES_;
  private static final SubLSymbol $sym112$_LEXIFICATION_PROPER_NAME_PREDICATE_CONSTRAINTS_;
  private static final SubLSymbol $sym113$_LEXIFICATION_MTS_;
  private static final SubLString $str114$nameString;
  private static final SubLObject $const115$denotation;
  private static final SubLSymbol $sym116$_LEXIFICATION_OBJECT_TABLE_;
  private static final SubLInteger $int117$256;
  private static final SubLSymbol $sym118$_LEXIFICATION_TEMPLATE_MTS_;
  private static final SubLString $str119$Warning__;
  private static final SubLString $str120$Object_hash_table_not_initialized;
  private static final SubLString $str121$lexwiz_settings_changed____A_vs__;
  private static final SubLString $str122$setting_change___s__;
  private static final SubLString $str123$____assertion_failed___a______;
  private static final SubLList $list124;
  private static final SubLSymbol $kw125$IGNORE_ERRORS_TARGET;
  private static final SubLSymbol $sym126$IGNORE_ERRORS_HANDLER;
  private static final SubLString $str127$_;
  private static final SubLString $str128$_;
  private static final SubLList $list129;
  private static final SubLString $str130$First;
  private static final SubLString $str131$Last;
  private static final SubLObject $const132$compoundString;
  private static final SubLObject $const133$multiWordString;
  private static final SubLObject $const134$headMedialString;
  private static final SubLString $str135$Unable_to_map_headword__s_in_part;
  private static final SubLString $str136$Unexpected_lexification_error;
  private static final SubLObject $const137$EnglishWord;
  private static final SubLSymbol $sym138$KE_CREATE_NOW;
  private static final SubLSymbol $sym139$TRY_LEX_ASSERT_NOW;
  private static final SubLSymbol $sym140$TRY_UNASSERT_NOW;
  private static final SubLList $list141;
  private static final SubLSymbol $sym142$WORD_UNIT;
  private static final SubLObject $const143$isa;
  private static final SubLString $str144$;
  private static final SubLString $str145$Missing_lexification_phrase;
  private static final SubLString $str146$Invalid_headword_specification;
  private static final SubLString $str147$Missing_part_of_speech;
  private static final SubLSymbol $sym148$ACCEPTABLE_LEXIFICATION_WORD_UNIT_;
  private static final SubLList $list149;
  private static final SubLSymbol $sym150$SUFFIX;
  private static final SubLObject $const151$suffixString;
  private static final SubLString $str152$Unable_to_make_main_lexical_asser;
  private static final SubLString $str153$Unable_to_make_other_lexical_asse;
  private static final SubLSymbol $kw154$PRECISE;
  private static final SubLObject $const155$genStringAssertion_Precise;
  private static final SubLObject $const156$genStringAssertion;
  private static final SubLObject $const157$ist;
  private static final SubLSymbol $sym158$KE_UNASSERT_ASSERTION_NOW;
  private static final SubLSymbol $sym159$KE_UNASSERT_ASSERTION;
  private static final SubLSymbol $sym160$RELEVANT_MT_IS_EVERYTHING;
  private static final SubLObject $const161$EverythingPSC;
  private static final SubLSymbol $kw162$GAF;
  private static final SubLSymbol $kw163$TRUE;
  private static final SubLSymbol $kw164$FRESH;
  private static final SubLString $str165$Lexification_parameters____S__;
  private static final SubLObject $const166$CycLReifiableDenotationalTerm;
  private static final SubLSymbol $sym167$FORT_FOR_STRING;
  private static final SubLList $list168;
  private static final SubLObject $const169$properNameStrings;
  private static final SubLObject $const170$ProperNamePredicate_Strict;
  private static final SubLList $list171;
  private static final SubLSymbol $sym172$STRING_FOR_FORT;
  private static final SubLSymbol $sym173$MOST_SPECIFIC_ARG1_CONSTRAINT;
  private static final SubLSymbol $sym174$STRING_;
  private static final SubLObject $const175$TemplateParsingMt;
  private static final SubLObject $const176$LexicalMicrotheory;
  private static final SubLObject $const177$InferencePSC;
  private static final SubLObject $const178$LexicalMicrotheory_NonLexWiz;
  private static final SubLString $str179$Lexification_Wizard_Test;
  private static final SubLString $str180$_Category;
  private static final SubLString $str181$_Suite;
  private static final SubLString $str182$lexification_wizard;

  @SubLTranslatedFile.SubL(source = "cycl/lexification-wizard.lisp", position = 3198L)
  public static SubLObject lexification_parameters_print_function_trampoline(final SubLObject v_object, final SubLObject stream)
  {
    compatibility.default_struct_print_function( v_object, stream, ZERO_INTEGER );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lexification-wizard.lisp", position = 3198L)
  public static SubLObject lexification_parameters_p(final SubLObject v_object)
  {
    return ( v_object.getClass() == $lexification_parameters_native.class ) ? T : NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lexification-wizard.lisp", position = 3198L)
  public static SubLObject lexwiz_id(final SubLObject v_object)
  {
    assert NIL != lexification_parameters_p( v_object ) : v_object;
    return v_object.getField2();
  }

  @SubLTranslatedFile.SubL(source = "cycl/lexification-wizard.lisp", position = 3198L)
  public static SubLObject lexwiz_term(final SubLObject v_object)
  {
    assert NIL != lexification_parameters_p( v_object ) : v_object;
    return v_object.getField3();
  }

  @SubLTranslatedFile.SubL(source = "cycl/lexification-wizard.lisp", position = 3198L)
  public static SubLObject lexwiz_phrase(final SubLObject v_object)
  {
    assert NIL != lexification_parameters_p( v_object ) : v_object;
    return v_object.getField4();
  }

  @SubLTranslatedFile.SubL(source = "cycl/lexification-wizard.lisp", position = 3198L)
  public static SubLObject lexwiz_mt(final SubLObject v_object)
  {
    assert NIL != lexification_parameters_p( v_object ) : v_object;
    return v_object.getField5();
  }

  @SubLTranslatedFile.SubL(source = "cycl/lexification-wizard.lisp", position = 3198L)
  public static SubLObject lexwiz_is_preferredP(final SubLObject v_object)
  {
    assert NIL != lexification_parameters_p( v_object ) : v_object;
    return v_object.getField6();
  }

  @SubLTranslatedFile.SubL(source = "cycl/lexification-wizard.lisp", position = 3198L)
  public static SubLObject lexwiz_is_properP(final SubLObject v_object)
  {
    assert NIL != lexification_parameters_p( v_object ) : v_object;
    return v_object.getField7();
  }

  @SubLTranslatedFile.SubL(source = "cycl/lexification-wizard.lisp", position = 3198L)
  public static SubLObject lexwiz_nonrelationalP(final SubLObject v_object)
  {
    assert NIL != lexification_parameters_p( v_object ) : v_object;
    return v_object.getField8();
  }

  @SubLTranslatedFile.SubL(source = "cycl/lexification-wizard.lisp", position = 3198L)
  public static SubLObject lexwiz_proper_name_pred(final SubLObject v_object)
  {
    assert NIL != lexification_parameters_p( v_object ) : v_object;
    return v_object.getField9();
  }

  @SubLTranslatedFile.SubL(source = "cycl/lexification-wizard.lisp", position = 3198L)
  public static SubLObject lexwiz_template(final SubLObject v_object)
  {
    assert NIL != lexification_parameters_p( v_object ) : v_object;
    return v_object.getField10();
  }

  @SubLTranslatedFile.SubL(source = "cycl/lexification-wizard.lisp", position = 3198L)
  public static SubLObject lexwiz_template_args(final SubLObject v_object)
  {
    assert NIL != lexification_parameters_p( v_object ) : v_object;
    return v_object.getField11();
  }

  @SubLTranslatedFile.SubL(source = "cycl/lexification-wizard.lisp", position = 3198L)
  public static SubLObject lexwiz_template_speech_parts(final SubLObject v_object)
  {
    assert NIL != lexification_parameters_p( v_object ) : v_object;
    return v_object.getField12();
  }

  @SubLTranslatedFile.SubL(source = "cycl/lexification-wizard.lisp", position = 3198L)
  public static SubLObject lexwiz_ignore_arityP(final SubLObject v_object)
  {
    assert NIL != lexification_parameters_p( v_object ) : v_object;
    return v_object.getField13();
  }

  @SubLTranslatedFile.SubL(source = "cycl/lexification-wizard.lisp", position = 3198L)
  public static SubLObject lexwiz_headword_position(final SubLObject v_object)
  {
    assert NIL != lexification_parameters_p( v_object ) : v_object;
    return v_object.getField14();
  }

  @SubLTranslatedFile.SubL(source = "cycl/lexification-wizard.lisp", position = 3198L)
  public static SubLObject lexwiz_headword_part_of_speech(final SubLObject v_object)
  {
    assert NIL != lexification_parameters_p( v_object ) : v_object;
    return v_object.getField15();
  }

  @SubLTranslatedFile.SubL(source = "cycl/lexification-wizard.lisp", position = 3198L)
  public static SubLObject lexwiz_error_message(final SubLObject v_object)
  {
    assert NIL != lexification_parameters_p( v_object ) : v_object;
    return v_object.getField16();
  }

  @SubLTranslatedFile.SubL(source = "cycl/lexification-wizard.lisp", position = 3198L)
  public static SubLObject lexwiz_state(final SubLObject v_object)
  {
    assert NIL != lexification_parameters_p( v_object ) : v_object;
    return v_object.getField17();
  }

  @SubLTranslatedFile.SubL(source = "cycl/lexification-wizard.lisp", position = 3198L)
  public static SubLObject lexwiz_readyP(final SubLObject v_object)
  {
    assert NIL != lexification_parameters_p( v_object ) : v_object;
    return v_object.getField18();
  }

  @SubLTranslatedFile.SubL(source = "cycl/lexification-wizard.lisp", position = 3198L)
  public static SubLObject lexwiz_formula(final SubLObject v_object)
  {
    assert NIL != lexification_parameters_p( v_object ) : v_object;
    return v_object.getField19();
  }

  @SubLTranslatedFile.SubL(source = "cycl/lexification-wizard.lisp", position = 3198L)
  public static SubLObject lexwiz_user_editedP(final SubLObject v_object)
  {
    assert NIL != lexification_parameters_p( v_object ) : v_object;
    return v_object.getField20();
  }

  @SubLTranslatedFile.SubL(source = "cycl/lexification-wizard.lisp", position = 3198L)
  public static SubLObject lexwiz_user_formula(final SubLObject v_object)
  {
    assert NIL != lexification_parameters_p( v_object ) : v_object;
    return ( ($lexification_parameters_native) v_object ).$user_formula;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lexification-wizard.lisp", position = 3198L)
  public static SubLObject lexwiz_other_formulas(final SubLObject v_object)
  {
    assert NIL != lexification_parameters_p( v_object ) : v_object;
    return ( ($lexification_parameters_native) v_object ).$other_formulas;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lexification-wizard.lisp", position = 3198L)
  public static SubLObject lexwiz_user_action(final SubLObject v_object)
  {
    assert NIL != lexification_parameters_p( v_object ) : v_object;
    return ( ($lexification_parameters_native) v_object ).$user_action;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lexification-wizard.lisp", position = 3198L)
  public static SubLObject lexwiz_parse_template_mt(final SubLObject v_object)
  {
    assert NIL != lexification_parameters_p( v_object ) : v_object;
    return ( ($lexification_parameters_native) v_object ).$parse_template_mt;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lexification-wizard.lisp", position = 3198L)
  public static SubLObject lexwiz_parse_template(final SubLObject v_object)
  {
    assert NIL != lexification_parameters_p( v_object ) : v_object;
    return ( ($lexification_parameters_native) v_object ).$parse_template;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lexification-wizard.lisp", position = 3198L)
  public static SubLObject lexwiz_parse_template_formula(final SubLObject v_object)
  {
    assert NIL != lexification_parameters_p( v_object ) : v_object;
    return ( ($lexification_parameters_native) v_object ).$parse_template_formula;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lexification-wizard.lisp", position = 3198L)
  public static SubLObject lexwiz_lexical_mt(final SubLObject v_object)
  {
    assert NIL != lexification_parameters_p( v_object ) : v_object;
    return ( ($lexification_parameters_native) v_object ).$lexical_mt;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lexification-wizard.lisp", position = 3198L)
  public static SubLObject lexwiz_syntactic_mt(final SubLObject v_object)
  {
    assert NIL != lexification_parameters_p( v_object ) : v_object;
    return ( ($lexification_parameters_native) v_object ).$syntactic_mt;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lexification-wizard.lisp", position = 3198L)
  public static SubLObject lexwiz_generation_mt(final SubLObject v_object)
  {
    assert NIL != lexification_parameters_p( v_object ) : v_object;
    return ( ($lexification_parameters_native) v_object ).$generation_mt;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lexification-wizard.lisp", position = 3198L)
  public static SubLObject _csetf_lexwiz_id(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != lexification_parameters_p( v_object ) : v_object;
    return v_object.setField2( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lexification-wizard.lisp", position = 3198L)
  public static SubLObject _csetf_lexwiz_term(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != lexification_parameters_p( v_object ) : v_object;
    return v_object.setField3( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lexification-wizard.lisp", position = 3198L)
  public static SubLObject _csetf_lexwiz_phrase(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != lexification_parameters_p( v_object ) : v_object;
    return v_object.setField4( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lexification-wizard.lisp", position = 3198L)
  public static SubLObject _csetf_lexwiz_mt(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != lexification_parameters_p( v_object ) : v_object;
    return v_object.setField5( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lexification-wizard.lisp", position = 3198L)
  public static SubLObject _csetf_lexwiz_is_preferredP(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != lexification_parameters_p( v_object ) : v_object;
    return v_object.setField6( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lexification-wizard.lisp", position = 3198L)
  public static SubLObject _csetf_lexwiz_is_properP(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != lexification_parameters_p( v_object ) : v_object;
    return v_object.setField7( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lexification-wizard.lisp", position = 3198L)
  public static SubLObject _csetf_lexwiz_nonrelationalP(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != lexification_parameters_p( v_object ) : v_object;
    return v_object.setField8( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lexification-wizard.lisp", position = 3198L)
  public static SubLObject _csetf_lexwiz_proper_name_pred(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != lexification_parameters_p( v_object ) : v_object;
    return v_object.setField9( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lexification-wizard.lisp", position = 3198L)
  public static SubLObject _csetf_lexwiz_template(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != lexification_parameters_p( v_object ) : v_object;
    return v_object.setField10( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lexification-wizard.lisp", position = 3198L)
  public static SubLObject _csetf_lexwiz_template_args(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != lexification_parameters_p( v_object ) : v_object;
    return v_object.setField11( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lexification-wizard.lisp", position = 3198L)
  public static SubLObject _csetf_lexwiz_template_speech_parts(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != lexification_parameters_p( v_object ) : v_object;
    return v_object.setField12( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lexification-wizard.lisp", position = 3198L)
  public static SubLObject _csetf_lexwiz_ignore_arityP(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != lexification_parameters_p( v_object ) : v_object;
    return v_object.setField13( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lexification-wizard.lisp", position = 3198L)
  public static SubLObject _csetf_lexwiz_headword_position(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != lexification_parameters_p( v_object ) : v_object;
    return v_object.setField14( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lexification-wizard.lisp", position = 3198L)
  public static SubLObject _csetf_lexwiz_headword_part_of_speech(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != lexification_parameters_p( v_object ) : v_object;
    return v_object.setField15( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lexification-wizard.lisp", position = 3198L)
  public static SubLObject _csetf_lexwiz_error_message(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != lexification_parameters_p( v_object ) : v_object;
    return v_object.setField16( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lexification-wizard.lisp", position = 3198L)
  public static SubLObject _csetf_lexwiz_state(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != lexification_parameters_p( v_object ) : v_object;
    return v_object.setField17( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lexification-wizard.lisp", position = 3198L)
  public static SubLObject _csetf_lexwiz_readyP(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != lexification_parameters_p( v_object ) : v_object;
    return v_object.setField18( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lexification-wizard.lisp", position = 3198L)
  public static SubLObject _csetf_lexwiz_formula(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != lexification_parameters_p( v_object ) : v_object;
    return v_object.setField19( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lexification-wizard.lisp", position = 3198L)
  public static SubLObject _csetf_lexwiz_user_editedP(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != lexification_parameters_p( v_object ) : v_object;
    return v_object.setField20( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lexification-wizard.lisp", position = 3198L)
  public static SubLObject _csetf_lexwiz_user_formula(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != lexification_parameters_p( v_object ) : v_object;
    return ( ($lexification_parameters_native) v_object ).$user_formula = value;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lexification-wizard.lisp", position = 3198L)
  public static SubLObject _csetf_lexwiz_other_formulas(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != lexification_parameters_p( v_object ) : v_object;
    return ( ($lexification_parameters_native) v_object ).$other_formulas = value;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lexification-wizard.lisp", position = 3198L)
  public static SubLObject _csetf_lexwiz_user_action(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != lexification_parameters_p( v_object ) : v_object;
    return ( ($lexification_parameters_native) v_object ).$user_action = value;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lexification-wizard.lisp", position = 3198L)
  public static SubLObject _csetf_lexwiz_parse_template_mt(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != lexification_parameters_p( v_object ) : v_object;
    return ( ($lexification_parameters_native) v_object ).$parse_template_mt = value;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lexification-wizard.lisp", position = 3198L)
  public static SubLObject _csetf_lexwiz_parse_template(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != lexification_parameters_p( v_object ) : v_object;
    return ( ($lexification_parameters_native) v_object ).$parse_template = value;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lexification-wizard.lisp", position = 3198L)
  public static SubLObject _csetf_lexwiz_parse_template_formula(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != lexification_parameters_p( v_object ) : v_object;
    return ( ($lexification_parameters_native) v_object ).$parse_template_formula = value;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lexification-wizard.lisp", position = 3198L)
  public static SubLObject _csetf_lexwiz_lexical_mt(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != lexification_parameters_p( v_object ) : v_object;
    return ( ($lexification_parameters_native) v_object ).$lexical_mt = value;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lexification-wizard.lisp", position = 3198L)
  public static SubLObject _csetf_lexwiz_syntactic_mt(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != lexification_parameters_p( v_object ) : v_object;
    return ( ($lexification_parameters_native) v_object ).$syntactic_mt = value;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lexification-wizard.lisp", position = 3198L)
  public static SubLObject _csetf_lexwiz_generation_mt(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != lexification_parameters_p( v_object ) : v_object;
    return ( ($lexification_parameters_native) v_object ).$generation_mt = value;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lexification-wizard.lisp", position = 3198L)
  public static SubLObject make_lexification_parameters(SubLObject arglist)
  {
    if( arglist == UNPROVIDED )
    {
      arglist = NIL;
    }
    final SubLObject v_new = new $lexification_parameters_native();
    SubLObject next;
    SubLObject current_arg;
    SubLObject current_value;
    SubLObject pcase_var;
    for( next = NIL, next = arglist; NIL != next; next = conses_high.cddr( next ) )
    {
      current_arg = next.first();
      current_value = conses_high.cadr( next );
      pcase_var = current_arg;
      if( pcase_var.eql( $kw74$ID ) )
      {
        _csetf_lexwiz_id( v_new, current_value );
      }
      else if( pcase_var.eql( $kw75$TERM ) )
      {
        _csetf_lexwiz_term( v_new, current_value );
      }
      else if( pcase_var.eql( $kw76$PHRASE ) )
      {
        _csetf_lexwiz_phrase( v_new, current_value );
      }
      else if( pcase_var.eql( $kw77$MT ) )
      {
        _csetf_lexwiz_mt( v_new, current_value );
      }
      else if( pcase_var.eql( $kw78$IS_PREFERRED_ ) )
      {
        _csetf_lexwiz_is_preferredP( v_new, current_value );
      }
      else if( pcase_var.eql( $kw79$IS_PROPER_ ) )
      {
        _csetf_lexwiz_is_properP( v_new, current_value );
      }
      else if( pcase_var.eql( $kw80$NONRELATIONAL_ ) )
      {
        _csetf_lexwiz_nonrelationalP( v_new, current_value );
      }
      else if( pcase_var.eql( $kw81$PROPER_NAME_PRED ) )
      {
        _csetf_lexwiz_proper_name_pred( v_new, current_value );
      }
      else if( pcase_var.eql( $kw82$TEMPLATE ) )
      {
        _csetf_lexwiz_template( v_new, current_value );
      }
      else if( pcase_var.eql( $kw83$TEMPLATE_ARGS ) )
      {
        _csetf_lexwiz_template_args( v_new, current_value );
      }
      else if( pcase_var.eql( $kw84$TEMPLATE_SPEECH_PARTS ) )
      {
        _csetf_lexwiz_template_speech_parts( v_new, current_value );
      }
      else if( pcase_var.eql( $kw85$IGNORE_ARITY_ ) )
      {
        _csetf_lexwiz_ignore_arityP( v_new, current_value );
      }
      else if( pcase_var.eql( $kw86$HEADWORD_POSITION ) )
      {
        _csetf_lexwiz_headword_position( v_new, current_value );
      }
      else if( pcase_var.eql( $kw87$HEADWORD_PART_OF_SPEECH ) )
      {
        _csetf_lexwiz_headword_part_of_speech( v_new, current_value );
      }
      else if( pcase_var.eql( $kw88$ERROR_MESSAGE ) )
      {
        _csetf_lexwiz_error_message( v_new, current_value );
      }
      else if( pcase_var.eql( $kw89$STATE ) )
      {
        _csetf_lexwiz_state( v_new, current_value );
      }
      else if( pcase_var.eql( $kw90$READY_ ) )
      {
        _csetf_lexwiz_readyP( v_new, current_value );
      }
      else if( pcase_var.eql( $kw91$FORMULA ) )
      {
        _csetf_lexwiz_formula( v_new, current_value );
      }
      else if( pcase_var.eql( $kw92$USER_EDITED_ ) )
      {
        _csetf_lexwiz_user_editedP( v_new, current_value );
      }
      else if( pcase_var.eql( $kw93$USER_FORMULA ) )
      {
        _csetf_lexwiz_user_formula( v_new, current_value );
      }
      else if( pcase_var.eql( $kw94$OTHER_FORMULAS ) )
      {
        _csetf_lexwiz_other_formulas( v_new, current_value );
      }
      else if( pcase_var.eql( $kw95$USER_ACTION ) )
      {
        _csetf_lexwiz_user_action( v_new, current_value );
      }
      else if( pcase_var.eql( $kw96$PARSE_TEMPLATE_MT ) )
      {
        _csetf_lexwiz_parse_template_mt( v_new, current_value );
      }
      else if( pcase_var.eql( $kw97$PARSE_TEMPLATE ) )
      {
        _csetf_lexwiz_parse_template( v_new, current_value );
      }
      else if( pcase_var.eql( $kw98$PARSE_TEMPLATE_FORMULA ) )
      {
        _csetf_lexwiz_parse_template_formula( v_new, current_value );
      }
      else if( pcase_var.eql( $kw99$LEXICAL_MT ) )
      {
        _csetf_lexwiz_lexical_mt( v_new, current_value );
      }
      else if( pcase_var.eql( $kw100$SYNTACTIC_MT ) )
      {
        _csetf_lexwiz_syntactic_mt( v_new, current_value );
      }
      else if( pcase_var.eql( $kw101$GENERATION_MT ) )
      {
        _csetf_lexwiz_generation_mt( v_new, current_value );
      }
      else
      {
        Errors.error( $str102$Invalid_slot__S_for_construction_, current_arg );
      }
    }
    return v_new;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lexification-wizard.lisp", position = 3198L)
  public static SubLObject visit_defstruct_lexification_parameters(final SubLObject obj, final SubLObject visitor_fn)
  {
    Functions.funcall( visitor_fn, obj, $kw103$BEGIN, $sym104$MAKE_LEXIFICATION_PARAMETERS, $int14$28 );
    Functions.funcall( visitor_fn, obj, $kw105$SLOT, $kw74$ID, lexwiz_id( obj ) );
    Functions.funcall( visitor_fn, obj, $kw105$SLOT, $kw75$TERM, lexwiz_term( obj ) );
    Functions.funcall( visitor_fn, obj, $kw105$SLOT, $kw76$PHRASE, lexwiz_phrase( obj ) );
    Functions.funcall( visitor_fn, obj, $kw105$SLOT, $kw77$MT, lexwiz_mt( obj ) );
    Functions.funcall( visitor_fn, obj, $kw105$SLOT, $kw78$IS_PREFERRED_, lexwiz_is_preferredP( obj ) );
    Functions.funcall( visitor_fn, obj, $kw105$SLOT, $kw79$IS_PROPER_, lexwiz_is_properP( obj ) );
    Functions.funcall( visitor_fn, obj, $kw105$SLOT, $kw80$NONRELATIONAL_, lexwiz_nonrelationalP( obj ) );
    Functions.funcall( visitor_fn, obj, $kw105$SLOT, $kw81$PROPER_NAME_PRED, lexwiz_proper_name_pred( obj ) );
    Functions.funcall( visitor_fn, obj, $kw105$SLOT, $kw82$TEMPLATE, lexwiz_template( obj ) );
    Functions.funcall( visitor_fn, obj, $kw105$SLOT, $kw83$TEMPLATE_ARGS, lexwiz_template_args( obj ) );
    Functions.funcall( visitor_fn, obj, $kw105$SLOT, $kw84$TEMPLATE_SPEECH_PARTS, lexwiz_template_speech_parts( obj ) );
    Functions.funcall( visitor_fn, obj, $kw105$SLOT, $kw85$IGNORE_ARITY_, lexwiz_ignore_arityP( obj ) );
    Functions.funcall( visitor_fn, obj, $kw105$SLOT, $kw86$HEADWORD_POSITION, lexwiz_headword_position( obj ) );
    Functions.funcall( visitor_fn, obj, $kw105$SLOT, $kw87$HEADWORD_PART_OF_SPEECH, lexwiz_headword_part_of_speech( obj ) );
    Functions.funcall( visitor_fn, obj, $kw105$SLOT, $kw88$ERROR_MESSAGE, lexwiz_error_message( obj ) );
    Functions.funcall( visitor_fn, obj, $kw105$SLOT, $kw89$STATE, lexwiz_state( obj ) );
    Functions.funcall( visitor_fn, obj, $kw105$SLOT, $kw90$READY_, lexwiz_readyP( obj ) );
    Functions.funcall( visitor_fn, obj, $kw105$SLOT, $kw91$FORMULA, lexwiz_formula( obj ) );
    Functions.funcall( visitor_fn, obj, $kw105$SLOT, $kw92$USER_EDITED_, lexwiz_user_editedP( obj ) );
    Functions.funcall( visitor_fn, obj, $kw105$SLOT, $kw93$USER_FORMULA, lexwiz_user_formula( obj ) );
    Functions.funcall( visitor_fn, obj, $kw105$SLOT, $kw94$OTHER_FORMULAS, lexwiz_other_formulas( obj ) );
    Functions.funcall( visitor_fn, obj, $kw105$SLOT, $kw95$USER_ACTION, lexwiz_user_action( obj ) );
    Functions.funcall( visitor_fn, obj, $kw105$SLOT, $kw96$PARSE_TEMPLATE_MT, lexwiz_parse_template_mt( obj ) );
    Functions.funcall( visitor_fn, obj, $kw105$SLOT, $kw97$PARSE_TEMPLATE, lexwiz_parse_template( obj ) );
    Functions.funcall( visitor_fn, obj, $kw105$SLOT, $kw98$PARSE_TEMPLATE_FORMULA, lexwiz_parse_template_formula( obj ) );
    Functions.funcall( visitor_fn, obj, $kw105$SLOT, $kw99$LEXICAL_MT, lexwiz_lexical_mt( obj ) );
    Functions.funcall( visitor_fn, obj, $kw105$SLOT, $kw100$SYNTACTIC_MT, lexwiz_syntactic_mt( obj ) );
    Functions.funcall( visitor_fn, obj, $kw105$SLOT, $kw101$GENERATION_MT, lexwiz_generation_mt( obj ) );
    Functions.funcall( visitor_fn, obj, $kw106$END, $sym104$MAKE_LEXIFICATION_PARAMETERS, $int14$28 );
    return obj;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lexification-wizard.lisp", position = 3198L)
  public static SubLObject visit_defstruct_object_lexification_parameters_method(final SubLObject obj, final SubLObject visitor_fn)
  {
    return visit_defstruct_lexification_parameters( obj, visitor_fn );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lexification-wizard.lisp", position = 8518L)
  public static SubLObject list_lexification_parameters(SubLObject v_object, SubLObject include_idP, SubLObject exclude_miscP)
  {
    if( v_object == UNPROVIDED )
    {
      v_object = $lexwiz_defaults$.getDynamicValue();
    }
    if( include_idP == UNPROVIDED )
    {
      include_idP = NIL;
    }
    if( exclude_miscP == UNPROVIDED )
    {
      exclude_miscP = NIL;
    }
    SubLObject params = ConsesLow.list( new SubLObject[] { lexwiz_term( v_object ), lexwiz_phrase( v_object ), lexwiz_mt( v_object ), lexwiz_is_preferredP( v_object ), lexwiz_is_properP( v_object ), lexwiz_user_formula(
        v_object ), lexwiz_nonrelationalP( v_object ), lexwiz_proper_name_pred( v_object ), lexwiz_template( v_object ), lexwiz_template_args( v_object ), lexwiz_template_speech_parts( v_object ), lexwiz_ignore_arityP(
            v_object ), lexwiz_headword_position( v_object ), lexwiz_headword_part_of_speech( v_object ), lexwiz_lexical_mt( v_object ), lexwiz_syntactic_mt( v_object ), lexwiz_generation_mt( v_object ),
      lexwiz_parse_template_mt( v_object ), lexwiz_parse_template( v_object ), lexwiz_parse_template_formula( v_object )
    } );
    final SubLObject other_params = ConsesLow.list( lexwiz_id( v_object ), lexwiz_user_action( v_object ), lexwiz_error_message( v_object ), lexwiz_state( v_object ), lexwiz_readyP( v_object ), lexwiz_formula(
        v_object ), lexwiz_user_editedP( v_object ), lexwiz_other_formulas( v_object ) );
    if( NIL == exclude_miscP )
    {
      params = ConsesLow.append( params, other_params );
    }
    if( NIL != include_idP )
    {
      params = ConsesLow.cons( v_object, params );
    }
    return params;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lexification-wizard.lisp", position = 10434L)
  public static SubLObject list_main_lexification_parameters(final SubLObject v_object)
  {
    return list_lexification_parameters( v_object, NIL, T );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lexification-wizard.lisp", position = 10628L)
  public static SubLObject copy_over_lexification_parameters(final SubLObject new_object, final SubLObject v_object)
  {
    _csetf_lexwiz_term( new_object, lexwiz_term( v_object ) );
    _csetf_lexwiz_phrase( new_object, lexwiz_phrase( v_object ) );
    _csetf_lexwiz_mt( new_object, lexwiz_mt( v_object ) );
    _csetf_lexwiz_is_preferredP( new_object, lexwiz_is_preferredP( v_object ) );
    _csetf_lexwiz_is_properP( new_object, lexwiz_is_properP( v_object ) );
    _csetf_lexwiz_nonrelationalP( new_object, lexwiz_nonrelationalP( v_object ) );
    _csetf_lexwiz_proper_name_pred( new_object, lexwiz_proper_name_pred( v_object ) );
    _csetf_lexwiz_template( new_object, lexwiz_template( v_object ) );
    _csetf_lexwiz_template_args( new_object, lexwiz_template_args( v_object ) );
    _csetf_lexwiz_template_speech_parts( new_object, lexwiz_template_speech_parts( v_object ) );
    _csetf_lexwiz_ignore_arityP( new_object, lexwiz_ignore_arityP( v_object ) );
    _csetf_lexwiz_headword_position( new_object, lexwiz_headword_position( v_object ) );
    _csetf_lexwiz_headword_part_of_speech( new_object, lexwiz_headword_part_of_speech( v_object ) );
    _csetf_lexwiz_error_message( new_object, lexwiz_error_message( v_object ) );
    _csetf_lexwiz_state( new_object, lexwiz_state( v_object ) );
    _csetf_lexwiz_readyP( new_object, lexwiz_readyP( v_object ) );
    _csetf_lexwiz_user_formula( new_object, lexwiz_user_formula( v_object ) );
    _csetf_lexwiz_user_editedP( new_object, lexwiz_user_editedP( v_object ) );
    _csetf_lexwiz_formula( new_object, lexwiz_formula( v_object ) );
    _csetf_lexwiz_other_formulas( new_object, lexwiz_other_formulas( v_object ) );
    _csetf_lexwiz_user_action( new_object, lexwiz_user_action( v_object ) );
    _csetf_lexwiz_lexical_mt( new_object, lexwiz_lexical_mt( v_object ) );
    _csetf_lexwiz_syntactic_mt( new_object, lexwiz_syntactic_mt( v_object ) );
    _csetf_lexwiz_generation_mt( new_object, lexwiz_generation_mt( v_object ) );
    _csetf_lexwiz_parse_template_mt( new_object, lexwiz_parse_template_mt( v_object ) );
    _csetf_lexwiz_parse_template( new_object, lexwiz_parse_template( v_object ) );
    _csetf_lexwiz_parse_template_formula( new_object, lexwiz_parse_template_formula( v_object ) );
    _csetf_lexwiz_id( new_object, new_lexification_id() );
    set_lexification_object( lexwiz_id( new_object ), new_object );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lexification-wizard.lisp", position = 13081L)
  public static SubLObject copy_lexification_parameters(final SubLObject v_object)
  {
    final SubLObject new_object = make_lexification_parameters( UNPROVIDED );
    copy_over_lexification_parameters( new_object, v_object );
    return new_object;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lexification-wizard.lisp", position = 13381L)
  public static SubLObject new_lexification_id()
  {
    return Guids.guid_to_string( Guids.new_guid() );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lexification-wizard.lisp", position = 13542L)
  public static SubLObject set_lexification_object(final SubLObject id, final SubLObject v_object)
  {
    if( NIL != $lexification_object_table$.getGlobalValue() )
    {
      return Hashtables.sethash( id, $lexification_object_table$.getGlobalValue(), v_object );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lexification-wizard.lisp", position = 13757L)
  public static SubLObject get_lexification_object(final SubLObject id)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject v_object = NIL;
    if( NIL != $lexification_object_table$.getGlobalValue() )
    {
      v_object = ( NIL != id ) ? Hashtables.gethash( id, $lexification_object_table$.getGlobalValue(), UNPROVIDED ) : NIL;
    }
    else if( lexification_utilities.$lex_trace_level$.getDynamicValue( thread ).numGE( Numbers.max( lexification_utilities.$lex_trace_level$.getDynamicValue( thread ), lexification_utilities.$lex_basic$
        .getGlobalValue() ) ) )
    {
      PrintLow.format( StreamsLow.$trace_output$.getDynamicValue( thread ), Sequences.cconcatenate( $str119$Warning__, $str120$Object_hash_table_not_initialized ) );
      streams_high.force_output( StreamsLow.$trace_output$.getDynamicValue( thread ) );
    }
    return v_object;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lexification-wizard.lisp", position = 14139L)
  public static SubLObject lexwiz_settings_changedP(final SubLObject object_before, final SubLObject object_after)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject main_settings = list_main_lexification_parameters( object_after );
    final SubLObject main_settings_before = list_main_lexification_parameters( object_before );
    if( lexification_utilities.$lex_trace_level$.getDynamicValue( thread ).numGE( lexification_utilities.$lex_very_detailed$.getGlobalValue() ) )
    {
      PrintLow.format( StreamsLow.$trace_output$.getDynamicValue( thread ), $str121$lexwiz_settings_changed____A_vs__, lexwiz_id( object_before ), lexwiz_id( object_after ) );
      streams_high.force_output( StreamsLow.$trace_output$.getDynamicValue( thread ) );
    }
    if( !main_settings.equalp( main_settings_before ) )
    {
      if( lexification_utilities.$lex_trace_level$.getDynamicValue( thread ).numGE( Numbers.max( lexification_utilities.$lex_trace_level$.getDynamicValue( thread ), lexification_utilities.$lex_verbose$
          .getGlobalValue() ) ) )
      {
        PrintLow.format( StreamsLow.$trace_output$.getDynamicValue( thread ), $str122$setting_change___s__, conses_high.set_difference( main_settings, main_settings_before, Symbols.symbol_function( EQUALP ),
            UNPROVIDED ) );
        streams_high.force_output( StreamsLow.$trace_output$.getDynamicValue( thread ) );
      }
      return T;
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lexification-wizard.lisp", position = 14804L)
  public static SubLObject resolve_lexwiz_object_fort(final SubLObject id)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject lexwiz_object = get_lexification_object( id );
    SubLObject fort = NIL;
    if( NIL != lexwiz_object )
    {
      if( !id.equal( lexwiz_id( lexwiz_object ) ) && lexification_utilities.$lex_trace_level$.getDynamicValue( thread ).numGE( Numbers.max( lexification_utilities.$lex_trace_level$.getDynamicValue( thread ),
          lexification_utilities.$lex_basic$.getGlobalValue() ) ) )
      {
        PrintLow.format( StreamsLow.$trace_output$.getDynamicValue( thread ), Sequences.cconcatenate( $str119$Warning__, $str123$____assertion_failed___a______ ), $list124 );
        streams_high.force_output( StreamsLow.$trace_output$.getDynamicValue( thread ) );
      }
      fort = misc_kb_utilities.fort_for_string( lexwiz_term( lexwiz_object ) );
    }
    return fort;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lexification-wizard.lisp", position = 15749L)
  public static SubLObject lispify_template_args(SubLObject arg_string)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject cyc_args = NIL;
    SubLObject next_pos = NIL;
    arg_string = string_utilities.trim_whitespace( arg_string );
    SubLObject ignore_errors_tag = NIL;
    try
    {
      thread.throwStack.push( $kw125$IGNORE_ERRORS_TARGET );
      final SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding( thread );
      try
      {
        Errors.$error_handler$.bind( Symbols.symbol_function( $sym126$IGNORE_ERRORS_HANDLER ), thread );
        try
        {
          thread.resetMultipleValues();
          final SubLObject cyc_args_$1 = reader.read_from_string_ignoring_errors( arg_string, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
          final SubLObject next_pos_$2 = thread.secondMultipleValue();
          thread.resetMultipleValues();
          cyc_args = cyc_args_$1;
          next_pos = next_pos_$2;
          if( next_pos.numL( Sequences.length( arg_string ) ) || ( NIL != cyc_args && cyc_args.isAtom() ) )
          {
            arg_string = Sequences.cconcatenate( $str127$_, new SubLObject[] { arg_string, $str128$_
            } );
            cyc_args = reader.read_from_string_ignoring_errors( arg_string, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
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
      ignore_errors_tag = Errors.handleThrowable( ccatch_env_var, $kw125$IGNORE_ERRORS_TARGET );
    }
    finally
    {
      thread.throwStack.pop();
    }
    return cyc_args;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lexification-wizard.lisp", position = 16600L)
  public static SubLObject count_positional_args(final SubLObject format_string)
  {
    SubLObject num = ZERO_INTEGER;
    final SubLObject len = Sequences.length( format_string );
    SubLObject previous_char = NIL;
    SubLObject end_var_$3;
    SubLObject end_var;
    SubLObject i;
    SubLObject v_char;
    SubLObject next_char;
    for( end_var = ( end_var_$3 = Sequences.length( format_string ) ), i = NIL, i = ZERO_INTEGER; !i.numGE( end_var_$3 ); i = number_utilities.f_1X( i ) )
    {
      v_char = Strings.sublisp_char( format_string, i );
      next_char = Numbers.add( i, ONE_INTEGER ).numL( len ) ? Sequences.elt( format_string, Numbers.add( i, ONE_INTEGER ) ) : NIL;
      if( v_char.eql( Characters.CHAR_tilde ) && !previous_char.eql( Characters.CHAR_tilde ) && NIL == subl_promotions.memberP( next_char, $list129, UNPROVIDED, UNPROVIDED ) )
      {
        num = Numbers.add( num, ONE_INTEGER );
      }
      previous_char = v_char;
    }
    return num;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lexification-wizard.lisp", position = 17195L)
  public static SubLObject convert_position(final SubLObject position_text, final SubLObject length)
  {
    SubLObject position_value = lexification_utilities.extract_integer( position_text, MINUS_ONE_INTEGER );
    if( position_text.equalp( $str130$First ) )
    {
      position_value = ONE_INTEGER;
    }
    else if( position_text.equalp( $str131$Last ) )
    {
      position_value = length;
    }
    return position_value;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lexification-wizard.lisp", position = 17707L)
  public static SubLObject determine_lexical_predicate(SubLObject position, final SubLObject phrase_len)
  {
    SubLObject predicate = NIL;
    if( phrase_len.numE( ONE_INTEGER ) )
    {
      predicate = $default_denotation_predicate$.getGlobalValue();
    }
    else if( position.numE( ONE_INTEGER ) )
    {
      predicate = $const132$compoundString;
    }
    else if( position.numE( phrase_len ) )
    {
      predicate = $const133$multiWordString;
    }
    else
    {
      predicate = $const134$headMedialString;
    }
    return predicate;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lexification-wizard.lisp", position = 18267L)
  public static SubLObject determine_lexical_formula(final SubLObject meaning, final SubLObject phrase, final SubLObject head_position, final SubLObject part_of_speech_text, SubLObject lexical_mt)
  {
    if( lexical_mt == UNPROVIDED )
    {
      lexical_mt = lexicon_vars.$lexicon_lookup_mt$.getDynamicValue();
    }
    final SubLObject word_list = lexification_utilities.lex_string_tokenize( phrase, NIL );
    final SubLObject phrase_len = Sequences.length( word_list );
    final SubLObject part_of_speech = misc_kb_utilities.fort_for_string( part_of_speech_text );
    SubLObject error = validate_lexification_parameters( head_position, part_of_speech, phrase, phrase_len );
    SubLObject formula = NIL;
    if( NIL == error )
    {
      final SubLObject head_offset = Numbers.subtract( head_position, ONE_INTEGER );
      final SubLObject predicate = determine_lexical_predicate( head_position, phrase_len );
      final SubLObject head_word = Sequences.elt( word_list, head_offset );
      final SubLObject other_words = list_utilities.remove_nth( head_offset, word_list );
      SubLObject other_words_for_formula = el_utilities.make_el_list( other_words, UNPROVIDED );
      SubLObject other_words_aux = NIL;
      final SubLObject head_unit = determine_lexification_word_unit( head_word, part_of_speech, lexical_mt );
      if( NIL == head_unit )
      {
        error = PrintLow.format( NIL, $str135$Unable_to_map_headword__s_in_part, head_word, part_of_speech_text );
      }
      else if( predicate.eql( $const132$compoundString ) )
      {
        formula = ConsesLow.list( $const132$compoundString, head_unit, other_words_for_formula, part_of_speech, meaning );
      }
      else if( predicate.eql( $const133$multiWordString ) )
      {
        formula = ConsesLow.list( $const133$multiWordString, other_words_for_formula, head_unit, part_of_speech, meaning );
      }
      else if( predicate.eql( $const134$headMedialString ) )
      {
        other_words_aux = el_utilities.make_el_list( conses_high.nthcdr( head_offset, other_words ), UNPROVIDED );
        other_words_for_formula = el_utilities.make_el_list( list_utilities.first_n( head_offset, other_words ), UNPROVIDED );
        formula = ConsesLow.list( $const134$headMedialString, other_words_for_formula, head_unit, other_words_aux, part_of_speech, meaning );
      }
      else if( predicate.eql( $default_denotation_predicate$.getGlobalValue() ) && NIL == other_words )
      {
        final SubLObject sense = lexicon_utilities.unique_ws( head_unit, part_of_speech, meaning );
        formula = ConsesLow.list( $default_denotation_predicate$.getGlobalValue(), head_unit, part_of_speech, sense, meaning );
      }
      else
      {
        error = $str136$Unexpected_lexification_error;
      }
    }
    return Values.values( formula, error );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lexification-wizard.lisp", position = 20618L)
  public static SubLObject add_lexical_mapping(final SubLObject wordform, final SubLObject part_of_speech, final SubLObject mt, SubLObject word_type)
  {
    if( word_type == UNPROVIDED )
    {
      word_type = $const137$EnglishWord;
    }
    return do_lexical_mapping_int( wordform, part_of_speech, mt, word_type, T, UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lexification-wizard.lisp", position = 20881L)
  public static SubLObject remove_lexical_mapping(final SubLObject wordform, final SubLObject part_of_speech, final SubLObject mt, SubLObject word_type)
  {
    if( word_type == UNPROVIDED )
    {
      word_type = $const137$EnglishWord;
    }
    return do_lexical_mapping_int( wordform, part_of_speech, mt, word_type, NIL, UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lexification-wizard.lisp", position = 21143L)
  public static SubLObject do_lexical_mapping_int(final SubLObject wordform, final SubLObject part_of_speech, final SubLObject mt, final SubLObject word_type, final SubLObject addP, SubLObject create_constant_fn,
      SubLObject create_constant_data)
  {
    if( create_constant_fn == UNPROVIDED )
    {
      create_constant_fn = Symbols.symbol_function( $sym138$KE_CREATE_NOW );
    }
    if( create_constant_data == UNPROVIDED )
    {
      create_constant_data = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject pos_keyword = lexification_utilities.precise_keyword_for_pos( part_of_speech, UNPROVIDED );
    final SubLObject stem = lexification_utilities.guess_stem( wordform, pos_keyword );
    final SubLObject assert_fn = ( NIL != addP ) ? Symbols.symbol_function( $sym139$TRY_LEX_ASSERT_NOW ) : Symbols.symbol_function( $sym140$TRY_UNASSERT_NOW );
    final SubLObject pred = lexicon_utilities.ordered_preds_of_pos( part_of_speech ).first();
    final SubLObject new_wordform = ( NIL != conses_high.member( pos_keyword, $list141, UNPROVIDED, UNPROVIDED ) ) ? stem : wordform;
    SubLObject word_unit = lexicon_accessors.words_of_stringXpred( new_wordform, pred, NIL, mt, UNPROVIDED ).first();
    if( NIL == word_unit && NIL == word_unit )
    {
      SubLObject csome_list_var = lexicon_cache.words_of_string( stem, NIL, mt, UNPROVIDED );
      SubLObject possible_word_unit = NIL;
      possible_word_unit = csome_list_var.first();
      while ( NIL == word_unit && NIL != csome_list_var)
      {
        if( NIL == lexicon_accessors.get_strings_of_type( possible_word_unit, part_of_speech, UNPROVIDED, UNPROVIDED, UNPROVIDED ) )
        {
          word_unit = possible_word_unit;
        }
        csome_list_var = csome_list_var.rest();
        possible_word_unit = csome_list_var.first();
      }
    }
    if( NIL == word_unit )
    {
      final SubLObject word_unit_name = constant_completion_high.uniquify_constant_name( lexicon_utilities.suggest_word_unit( stem ), UNPROVIDED );
      if( NIL != create_constant_data )
      {
        word_unit = Functions.funcall( create_constant_fn, create_constant_data, word_unit_name );
      }
      else
      {
        word_unit = Functions.funcall( create_constant_fn, word_unit_name );
      }
      if( NIL == word_unit && lexification_utilities.$lex_trace_level$.getDynamicValue( thread ).numGE( Numbers.max( lexification_utilities.$lex_trace_level$.getDynamicValue( thread ), lexification_utilities.$lex_basic$
          .getGlobalValue() ) ) )
      {
        PrintLow.format( StreamsLow.$trace_output$.getDynamicValue( thread ), Sequences.cconcatenate( $str119$Warning__, $str123$____assertion_failed___a______ ), $sym142$WORD_UNIT );
        streams_high.force_output( StreamsLow.$trace_output$.getDynamicValue( thread ) );
      }
      lexification_utilities.try_lex_assert_now( ConsesLow.list( $const143$isa, word_unit, word_type ), mt, UNPROVIDED, UNPROVIDED );
    }
    return Functions.funcall( assert_fn, ConsesLow.list( pred, word_unit, new_wordform ), mt );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lexification-wizard.lisp", position = 23729L)
  public static SubLObject validate_lexification_parameters(final SubLObject head_position, final SubLObject part_of_speech, final SubLObject phrase, final SubLObject phrase_len)
  {
    SubLObject error = NIL;
    if( phrase.eql( $str144$ ) )
    {
      error = $str145$Missing_lexification_phrase;
    }
    else if( head_position.numL( ONE_INTEGER ) || head_position.numG( phrase_len ) )
    {
      error = $str146$Invalid_headword_specification;
    }
    else if( NIL == part_of_speech )
    {
      error = $str147$Missing_part_of_speech;
    }
    return error;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lexification-wizard.lisp", position = 24230L)
  public static SubLObject determine_lexification_word_unit(final SubLObject head_word, final SubLObject part_of_speech, SubLObject lexical_mt)
  {
    if( lexical_mt == UNPROVIDED )
    {
      lexical_mt = lexicon_vars.$lexicon_lookup_mt$.getDynamicValue();
    }
    SubLObject word_unit = NIL;
    if( NIL == word_unit )
    {
      SubLObject csome_list_var = lexicon_utilities.ordered_preds_of_pos( part_of_speech );
      SubLObject pos_predicate = NIL;
      pos_predicate = csome_list_var.first();
      while ( NIL == word_unit && NIL != csome_list_var)
      {
        final SubLObject pos_keyword = lexification_utilities.keyword_for_pred( pos_predicate, UNPROVIDED );
        if( NIL == word_unit )
        {
          SubLObject csome_list_var_$4 = ConsesLow.list( head_word, morphology.find_stem( head_word, pos_keyword ) );
          SubLObject word = NIL;
          word = csome_list_var_$4.first();
          while ( NIL == word_unit && NIL != csome_list_var_$4)
          {
            final SubLObject word_units = lexicon_accessors.words_of_stringXpred( word, pos_predicate, NIL, lexical_mt, UNPROVIDED );
            word_unit = Sequences.find_if( $sym148$ACCEPTABLE_LEXIFICATION_WORD_UNIT_, word_units, UNPROVIDED, UNPROVIDED, UNPROVIDED );
            csome_list_var_$4 = csome_list_var_$4.rest();
            word = csome_list_var_$4.first();
          }
        }
        csome_list_var = csome_list_var.rest();
        pos_predicate = csome_list_var.first();
      }
    }
    return word_unit;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lexification-wizard.lisp", position = 25438L)
  public static SubLObject acceptable_lexification_word_unitP(final SubLObject word_unit)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    thread.resetMultipleValues();
    final SubLObject success = formula_pattern_match.formula_matches_pattern( word_unit, $list149 );
    final SubLObject v_bindings = thread.secondMultipleValue();
    thread.resetMultipleValues();
    if( NIL != success )
    {
      final SubLObject suffix = list_utilities.alist_lookup_without_values( v_bindings, $sym150$SUFFIX, UNPROVIDED, UNPROVIDED );
      final SubLObject suffix_string = kb_mapping_utilities.fpred_value_in_any_mt( suffix, $const151$suffixString, UNPROVIDED, UNPROVIDED, UNPROVIDED );
      if( NIL != string_utilities.empty_string_p( suffix_string ) )
      {
        return NIL;
      }
    }
    return T;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lexification-wizard.lisp", position = 25826L)
  public static SubLObject perform_lexification(final SubLObject v_object)
  {
    trace_lexification_parameters( v_object, UNPROVIDED );
    final SubLObject cyc_term = misc_kb_utilities.fort_for_string( lexwiz_term( v_object ) );
    final SubLObject mt = misc_kb_utilities.fort_for_string( lexwiz_mt( v_object ) );
    final SubLObject formula = lexwiz_formula( v_object );
    final SubLObject is_relationalP = makeBoolean( NIL != lexification_utilities.is_relationalP( cyc_term ) && NIL == lexwiz_nonrelationalP( v_object ) );
    SubLObject ok = ( NIL != formula ) ? lexification_utilities.try_lex_assert_now( formula, mt, UNPROVIDED, UNPROVIDED ) : NIL;
    if( NIL == ok )
    {
      _csetf_lexwiz_error_message( v_object, PrintLow.format( NIL, $str152$Unable_to_make_main_lexical_asser, formula ) );
      return NIL;
    }
    cb_tools.cb_add_sentence_in_mt_to_assertion_history( formula, mt );
    SubLObject cdolist_list_var = lexwiz_other_formulas( v_object );
    SubLObject formula_$5 = NIL;
    formula_$5 = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      ok = lexification_utilities.try_lex_assert_now( formula_$5, mt, UNPROVIDED, UNPROVIDED );
      if( NIL == ok )
      {
        _csetf_lexwiz_error_message( v_object, PrintLow.format( NIL, $str153$Unable_to_make_other_lexical_asse, formula_$5 ) );
        return NIL;
      }
      cb_tools.cb_add_sentence_in_mt_to_assertion_history( formula_$5, mt );
      cdolist_list_var = cdolist_list_var.rest();
      formula_$5 = cdolist_list_var.first();
    }
    if( NIL != lexwiz_is_preferredP( v_object ) && NIL == is_relationalP )
    {
      final SubLObject is_preciseP = Equality.eq( lexwiz_is_preferredP( v_object ), $kw154$PRECISE );
      final SubLObject pred = ( NIL != is_preciseP ) ? $const155$genStringAssertion_Precise : $const156$genStringAssertion;
      remove_genstring_assertions( cyc_term, pred, UNPROVIDED );
      lexification_utilities.try_lex_assert( ConsesLow.list( pred, cycl_utilities.hl_to_el( cyc_term ), ConsesLow.list( $const157$ist, mt, formula ) ), mt, UNPROVIDED, UNPROVIDED );
    }
    if( NIL != lexwiz_parse_template_formula( v_object ) )
    {
      final SubLObject parse_template_mt = misc_kb_utilities.fort_for_string( lexwiz_parse_template_mt( v_object ) );
      lexification_utilities.try_lex_assert( lexwiz_parse_template_formula( v_object ), parse_template_mt, UNPROVIDED, UNPROVIDED );
    }
    if( NIL != lexwiz_user_action( v_object ) )
    {
      lexification_reminders.remove_lexification_user_action( v_object, lexwiz_user_action( v_object ) );
    }
    remove_stub_lexifications( lexwiz_term( v_object ), lexwiz_phrase( v_object ), UNPROVIDED );
    return ok;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lexification-wizard.lisp", position = 28756L)
  public static SubLObject remove_stub_lexifications(final SubLObject v_term, SubLObject phrase, SubLObject nowP)
  {
    if( phrase == UNPROVIDED )
    {
      phrase = NIL;
    }
    if( nowP == UNPROVIDED )
    {
      nowP = NIL;
    }
    SubLObject cdolist_list_var = lexicon_utilities.stub_lexifications_for_term( misc_kb_utilities.fort_for_string( v_term ) );
    SubLObject assertion = NIL;
    assertion = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      if( NIL != assertions_high.gaf_assertionP( assertion ) )
      {
        final SubLObject unassert_function = ( NIL != nowP ) ? $sym158$KE_UNASSERT_ASSERTION_NOW : $sym159$KE_UNASSERT_ASSERTION;
        Functions.funcall( unassert_function, assertion );
      }
      cdolist_list_var = cdolist_list_var.rest();
      assertion = cdolist_list_var.first();
    }
    return T;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lexification-wizard.lisp", position = 29277L)
  public static SubLObject remove_genstring_assertions(final SubLObject fort, SubLObject pred, SubLObject nowP)
  {
    if( pred == UNPROVIDED )
    {
      pred = $const156$genStringAssertion;
    }
    if( nowP == UNPROVIDED )
    {
      nowP = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding( thread );
    final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding( thread );
    try
    {
      mt_relevance_macros.$relevant_mt_function$.bind( $sym160$RELEVANT_MT_IS_EVERYTHING, thread );
      mt_relevance_macros.$mt$.bind( $const161$EverythingPSC, thread );
      final SubLObject pred_var = pred;
      if( NIL != kb_mapping_macros.do_gaf_arg_index_key_validator( fort, ONE_INTEGER, pred_var ) )
      {
        final SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator( fort, ONE_INTEGER, pred_var );
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
              final_index_iterator = kb_mapping_macros.new_final_index_iterator( final_index_spec, $kw162$GAF, $kw163$TRUE, NIL );
              SubLObject done_var_$6 = NIL;
              final SubLObject token_var_$7 = NIL;
              while ( NIL == done_var_$6)
              {
                final SubLObject assertion = iteration.iteration_next_without_values_macro_helper( final_index_iterator, token_var_$7 );
                final SubLObject valid_$8 = makeBoolean( !token_var_$7.eql( assertion ) );
                if( NIL != valid_$8 )
                {
                  final SubLObject unassert_function = ( NIL != nowP ) ? $sym158$KE_UNASSERT_ASSERTION_NOW : $sym159$KE_UNASSERT_ASSERTION;
                  Functions.funcall( unassert_function, assertion );
                }
                done_var_$6 = makeBoolean( NIL == valid_$8 );
              }
            }
            finally
            {
              final SubLObject _prev_bind_0_$9 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
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
                Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$9, thread );
              }
            }
          }
          done_var = makeBoolean( NIL == valid );
        }
      }
    }
    finally
    {
      mt_relevance_macros.$mt$.rebind( _prev_bind_2, thread );
      mt_relevance_macros.$relevant_mt_function$.rebind( _prev_bind_0, thread );
    }
    return T;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lexification-wizard.lisp", position = 29688L)
  public static SubLObject derive_lexification_formula(final SubLObject v_object)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject cyc_term = misc_kb_utilities.fort_for_string( lexwiz_term( v_object ) );
    final SubLObject is_relationalP = makeBoolean( NIL != lexification_utilities.is_relationalP( cyc_term ) && NIL == lexwiz_nonrelationalP( v_object ) );
    SubLObject cyc_mt = misc_kb_utilities.fort_for_string( lexwiz_mt( v_object ) );
    if( NIL == cyc_mt )
    {
      _csetf_lexwiz_mt( v_object, ( NIL != is_relationalP ) ? lexicon_vars.$default_relational_lexification_mt$.getDynamicValue( thread ) : lexicon_vars.$default_lexification_mt$.getDynamicValue( thread ) );
      cyc_mt = misc_kb_utilities.fort_for_string( lexwiz_mt( v_object ) );
    }
    if( NIL != lexwiz_is_properP( v_object ) )
    {
      derive_proper_name_formula( v_object );
    }
    else if( NIL != is_relationalP )
    {
      derive_relation_formula( v_object );
    }
    else
    {
      derive_denotation_formula( v_object );
    }
    if( NIL != lexwiz_formula( v_object ) && ( NIL == $sme_lexwiz_active$.getDynamicValue( thread ) || NIL == lexwiz_error_message( v_object ) ) )
    {
      _csetf_lexwiz_error_message( v_object, lexification_utilities.invalid_lexificationP( lexwiz_formula( v_object ), cyc_mt ) );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lexification-wizard.lisp", position = 30888L)
  public static SubLObject derive_proper_name_formula(final SubLObject v_object)
  {
    final SubLObject cyc_term = misc_kb_utilities.fort_for_string( lexwiz_term( v_object ) );
    final SubLObject lex_phrase = lexwiz_phrase( v_object );
    SubLObject cyc_predicate = misc_kb_utilities.fort_for_string( lexwiz_proper_name_pred( v_object ) );
    if( NIL == cyc_predicate )
    {
      cyc_predicate = misc_kb_utilities.fort_for_string( $default_proper_name_pred$.getGlobalValue() );
    }
    _csetf_lexwiz_formula( v_object, ConsesLow.list( cyc_predicate, cycl_utilities.hl_to_el( cyc_term ), lex_phrase ) );
    _csetf_lexwiz_error_message( v_object, NIL );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lexification-wizard.lisp", position = 31444L)
  public static SubLObject derive_denotation_formula(final SubLObject v_object)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject cyc_term = misc_kb_utilities.fort_for_string( lexwiz_term( v_object ) );
    thread.resetMultipleValues();
    final SubLObject formula = determine_lexical_formula( cyc_term, lexwiz_phrase( v_object ), lexwiz_headword_position( v_object ), lexwiz_headword_part_of_speech( v_object ), determine_lexical_mapping_mt( lexwiz_mt(
        v_object ), UNPROVIDED ) );
    final SubLObject status_message = thread.secondMultipleValue();
    thread.resetMultipleValues();
    _csetf_lexwiz_formula( v_object, formula );
    _csetf_lexwiz_error_message( v_object, status_message );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lexification-wizard.lisp", position = 32036L)
  public static SubLObject derive_relation_formula(final SubLObject v_object)
  {
    final SubLObject lex_template = lexwiz_template( v_object );
    if( NIL != el_utilities.el_formula_p( lex_template ) )
    {
      _csetf_lexwiz_formula( v_object, lex_template );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lexification-wizard.lisp", position = 32553L)
  public static SubLObject derive_parse_template_formula(final SubLObject v_object)
  {
    final SubLObject lex_parse_template = lexwiz_parse_template( v_object );
    SubLObject formula = lexwiz_parse_template_formula( v_object );
    final SubLObject parse_template_mt = misc_kb_utilities.fort_for_string( lexwiz_parse_template_mt( v_object ) );
    if( NIL != string_utilities.non_empty_stringP( lex_parse_template ) )
    {
      formula = reader.read_from_string_ignoring_errors( string_utilities.cyclify_string( lexwiz_parse_template( v_object ) ), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
      _csetf_lexwiz_parse_template_formula( v_object, formula );
    }
    if( NIL != formula )
    {
      _csetf_lexwiz_error_message( v_object, lexification_utilities.invalid_lexificationP( lexwiz_parse_template_formula( v_object ), parse_template_mt ) );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lexification-wizard.lisp", position = 33270L)
  public static SubLObject reset_lexification_parameters(SubLObject v_object)
  {
    if( v_object == UNPROVIDED )
    {
      v_object = $lexwiz_defaults$.getDynamicValue();
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    copy_over_lexification_parameters( v_object, make_lexification_parameters( UNPROVIDED ) );
    _csetf_lexwiz_proper_name_pred( v_object, $default_proper_name_pred$.getGlobalValue() );
    _csetf_lexwiz_state( v_object, $kw164$FRESH );
    _csetf_lexwiz_lexical_mt( v_object, misc_kb_utilities.fort_for_string( lexicon_vars.$default_lexification_mt$.getDynamicValue( thread ) ) );
    _csetf_lexwiz_syntactic_mt( v_object, misc_kb_utilities.fort_for_string( lexicon_vars.$default_syntactic_mt$.getDynamicValue( thread ) ) );
    _csetf_lexwiz_generation_mt( v_object, misc_kb_utilities.fort_for_string( lexicon_vars.$default_relational_lexification_mt$.getDynamicValue( thread ) ) );
    _csetf_lexwiz_parse_template_mt( v_object, misc_kb_utilities.fort_for_string( lexicon_vars.$default_lexification_template_mt$.getDynamicValue( thread ) ) );
    return T;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lexification-wizard.lisp", position = 33985L)
  public static SubLObject trace_lexification_parameters(SubLObject v_object, SubLObject debug_level)
  {
    if( v_object == UNPROVIDED )
    {
      v_object = $lexwiz_defaults$.getDynamicValue();
    }
    if( debug_level == UNPROVIDED )
    {
      debug_level = lexification_utilities.$lex_verbose$.getGlobalValue();
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject unhandled = NIL;
    if( NIL != unhandled && lexification_utilities.$lex_trace_level$.getDynamicValue( thread ).numGE( debug_level ) )
    {
      PrintLow.format( StreamsLow.$trace_output$.getDynamicValue( thread ), $str165$Lexification_parameters____S__, list_lexification_parameters( v_object, T, UNPROVIDED ) );
      streams_high.force_output( StreamsLow.$trace_output$.getDynamicValue( thread ) );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lexification-wizard.lisp", position = 35740L)
  public static SubLObject filter_proper_name_predicates(final SubLObject lex_term)
  {
    final SubLObject cyc_term = misc_kb_utilities.fort_for_string( lex_term );
    final SubLObject term_isas = isa.all_isa_in_any_mt( cyc_term );
    SubLObject pred_names = NIL;
    SubLObject list_var = NIL;
    SubLObject constraint = NIL;
    SubLObject i = NIL;
    list_var = $lexification_proper_name_predicate_constraints$.getGlobalValue();
    constraint = list_var.first();
    for( i = ZERO_INTEGER; NIL != list_var; list_var = list_var.rest(), constraint = list_var.first(), i = Numbers.add( ONE_INTEGER, i ) )
    {
      if( NIL == cyc_term || constraint.eql( $const166$CycLReifiableDenotationalTerm ) || NIL != conses_high.member( constraint, term_isas, UNPROVIDED, UNPROVIDED ) )
      {
        final SubLObject item_var = Sequences.elt( $lexification_proper_name_predicate_names$.getGlobalValue(), i );
        if( NIL == conses_high.member( item_var, pred_names, Symbols.symbol_function( EQL ), Symbols.symbol_function( IDENTITY ) ) )
        {
          pred_names = ConsesLow.cons( item_var, pred_names );
        }
      }
    }
    return Sequences.reverse( pred_names );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lexification-wizard.lisp", position = 36867L)
  public static SubLObject init_lexification_wizard(SubLObject force)
  {
    if( force == UNPROVIDED )
    {
      force = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL != $lexification_wizard_initialized$.getDynamicValue( thread ) && NIL == force )
    {
      return T;
    }
    if( NIL == $lexwiz_defaults$.getDynamicValue( thread ) )
    {
      $lexwiz_defaults$.setDynamicValue( make_lexification_parameters( UNPROVIDED ), thread );
    }
    reset_lexification_parameters( UNPROVIDED );
    $main_lexification_parts_of_speech$.setGlobalValue( Mapping.mapcar( Symbols.symbol_function( $sym167$FORT_FOR_STRING ), $list168 ) );
    final SubLObject filtered_preds;
    final SubLObject proper_name_preds = filtered_preds = Sequences.remove_duplicates( ConsesLow.append( genl_predicates.all_spec_preds( $const169$properNameStrings, UNPROVIDED, UNPROVIDED ), isa.all_fort_instances(
        $const170$ProperNamePredicate_Strict, UNPROVIDED, UNPROVIDED ) ), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
    final SubLObject sorted_preds = lexification_utilities.sort_by_pred_usage( filtered_preds );
    final SubLObject desired_preds = list_utilities.ordered_set_difference( sorted_preds, $list171, UNPROVIDED, UNPROVIDED );
    $lexification_proper_name_predicate_names$.setGlobalValue( Mapping.mapcar( Symbols.symbol_function( $sym172$STRING_FOR_FORT ), desired_preds ) );
    $lexification_proper_name_predicate_constraints$.setGlobalValue( Mapping.mapcar( Symbols.symbol_function( $sym173$MOST_SPECIFIC_ARG1_CONSTRAINT ), desired_preds ) );
    SubLObject parts_of_speech = NIL;
    SubLObject cdolist_list_var = $lexification_part_of_speech_keywords$.getGlobalValue();
    SubLObject keyword = NIL;
    keyword = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      SubLObject cdolist_list_var_$10 = lexification_utilities.lex_pos_for_keyword( keyword );
      SubLObject pos = NIL;
      pos = cdolist_list_var_$10.first();
      while ( NIL != cdolist_list_var_$10)
      {
        final SubLObject item_var = pos;
        if( NIL == conses_high.member( item_var, parts_of_speech, Symbols.symbol_function( EQL ), Symbols.symbol_function( IDENTITY ) ) )
        {
          parts_of_speech = ConsesLow.cons( item_var, parts_of_speech );
        }
        cdolist_list_var_$10 = cdolist_list_var_$10.rest();
        pos = cdolist_list_var_$10.first();
      }
      cdolist_list_var = cdolist_list_var.rest();
      keyword = cdolist_list_var.first();
    }
    parts_of_speech = Sort.sort( parts_of_speech, Symbols.symbol_function( $sym174$STRING_ ), Symbols.symbol_function( $sym172$STRING_FOR_FORT ) );
    $all_lexification_parts_of_speech_labels$.setGlobalValue( Mapping.mapcar( Symbols.symbol_function( $sym172$STRING_FOR_FORT ), parts_of_speech ) );
    final SubLObject lexical_mts = Mapping.mapcar( Symbols.symbol_function( $sym172$STRING_FOR_FORT ), get_all_lexwiz_lexical_mts() );
    $lexification_mts$.setGlobalValue( ConsesLow.cons( $str144$, Sort.sort( lexical_mts, Symbols.symbol_function( $sym174$STRING_ ), UNPROVIDED ) ) );
    final SubLObject template_mts = Mapping.mapcar( Symbols.symbol_function( $sym172$STRING_FOR_FORT ), genl_mts.all_spec_mts( $const175$TemplateParsingMt, UNPROVIDED, UNPROVIDED ) );
    $lexification_template_mts$.setGlobalValue( Sort.sort( template_mts, Symbols.symbol_function( $sym174$STRING_ ), UNPROVIDED ) );
    $lexification_wizard_initialized$.setDynamicValue( T, thread );
    return T;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lexification-wizard.lisp", position = 39145L)
  public static SubLObject get_all_lexwiz_lexical_mts()
  {
    return conses_high.set_difference( isa.all_fort_instances( $const176$LexicalMicrotheory, $const177$InferencePSC, UNPROVIDED ), isa.all_fort_instances( $const178$LexicalMicrotheory_NonLexWiz, $const177$InferencePSC,
        UNPROVIDED ), UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lexification-wizard.lisp", position = 39352L)
  public static SubLObject irrelevant_lexification_term(final SubLObject v_term, SubLObject lexical_mt)
  {
    if( lexical_mt == UNPROVIDED )
    {
      lexical_mt = lexicon_vars.$lexicon_lookup_mt$.getDynamicValue();
    }
    return rkf_relevance_utilities.rkf_irrelevant_term( v_term, lexical_mt );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lexification-wizard.lisp", position = 39749L)
  public static SubLObject determine_lexical_mapping_mt(final SubLObject lexification_mt, SubLObject default_mt)
  {
    if( default_mt == UNPROVIDED )
    {
      default_mt = lexicon_vars.$default_lexification_mt$.getDynamicValue();
    }
    SubLObject mt = misc_kb_utilities.fort_for_string( default_mt );
    if( NIL != $isolate_syntactic_mappingsP$.getGlobalValue() )
    {
      mt = misc_kb_utilities.fort_for_string( lexification_mt );
    }
    return mt;
  }

  public static SubLObject declare_lexification_wizard_file()
  {
    SubLFiles.declareFunction( me, "lexification_parameters_print_function_trampoline", "LEXIFICATION-PARAMETERS-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false );
    SubLFiles.declareFunction( me, "lexification_parameters_p", "LEXIFICATION-PARAMETERS-P", 1, 0, false );
    new $lexification_parameters_p$UnaryFunction();
    SubLFiles.declareFunction( me, "lexwiz_id", "LEXWIZ-ID", 1, 0, false );
    SubLFiles.declareFunction( me, "lexwiz_term", "LEXWIZ-TERM", 1, 0, false );
    SubLFiles.declareFunction( me, "lexwiz_phrase", "LEXWIZ-PHRASE", 1, 0, false );
    SubLFiles.declareFunction( me, "lexwiz_mt", "LEXWIZ-MT", 1, 0, false );
    SubLFiles.declareFunction( me, "lexwiz_is_preferredP", "LEXWIZ-IS-PREFERRED?", 1, 0, false );
    SubLFiles.declareFunction( me, "lexwiz_is_properP", "LEXWIZ-IS-PROPER?", 1, 0, false );
    SubLFiles.declareFunction( me, "lexwiz_nonrelationalP", "LEXWIZ-NONRELATIONAL?", 1, 0, false );
    SubLFiles.declareFunction( me, "lexwiz_proper_name_pred", "LEXWIZ-PROPER-NAME-PRED", 1, 0, false );
    SubLFiles.declareFunction( me, "lexwiz_template", "LEXWIZ-TEMPLATE", 1, 0, false );
    SubLFiles.declareFunction( me, "lexwiz_template_args", "LEXWIZ-TEMPLATE-ARGS", 1, 0, false );
    SubLFiles.declareFunction( me, "lexwiz_template_speech_parts", "LEXWIZ-TEMPLATE-SPEECH-PARTS", 1, 0, false );
    SubLFiles.declareFunction( me, "lexwiz_ignore_arityP", "LEXWIZ-IGNORE-ARITY?", 1, 0, false );
    SubLFiles.declareFunction( me, "lexwiz_headword_position", "LEXWIZ-HEADWORD-POSITION", 1, 0, false );
    SubLFiles.declareFunction( me, "lexwiz_headword_part_of_speech", "LEXWIZ-HEADWORD-PART-OF-SPEECH", 1, 0, false );
    SubLFiles.declareFunction( me, "lexwiz_error_message", "LEXWIZ-ERROR-MESSAGE", 1, 0, false );
    SubLFiles.declareFunction( me, "lexwiz_state", "LEXWIZ-STATE", 1, 0, false );
    SubLFiles.declareFunction( me, "lexwiz_readyP", "LEXWIZ-READY?", 1, 0, false );
    SubLFiles.declareFunction( me, "lexwiz_formula", "LEXWIZ-FORMULA", 1, 0, false );
    SubLFiles.declareFunction( me, "lexwiz_user_editedP", "LEXWIZ-USER-EDITED?", 1, 0, false );
    SubLFiles.declareFunction( me, "lexwiz_user_formula", "LEXWIZ-USER-FORMULA", 1, 0, false );
    SubLFiles.declareFunction( me, "lexwiz_other_formulas", "LEXWIZ-OTHER-FORMULAS", 1, 0, false );
    SubLFiles.declareFunction( me, "lexwiz_user_action", "LEXWIZ-USER-ACTION", 1, 0, false );
    SubLFiles.declareFunction( me, "lexwiz_parse_template_mt", "LEXWIZ-PARSE-TEMPLATE-MT", 1, 0, false );
    SubLFiles.declareFunction( me, "lexwiz_parse_template", "LEXWIZ-PARSE-TEMPLATE", 1, 0, false );
    SubLFiles.declareFunction( me, "lexwiz_parse_template_formula", "LEXWIZ-PARSE-TEMPLATE-FORMULA", 1, 0, false );
    SubLFiles.declareFunction( me, "lexwiz_lexical_mt", "LEXWIZ-LEXICAL-MT", 1, 0, false );
    SubLFiles.declareFunction( me, "lexwiz_syntactic_mt", "LEXWIZ-SYNTACTIC-MT", 1, 0, false );
    SubLFiles.declareFunction( me, "lexwiz_generation_mt", "LEXWIZ-GENERATION-MT", 1, 0, false );
    SubLFiles.declareFunction( me, "_csetf_lexwiz_id", "_CSETF-LEXWIZ-ID", 2, 0, false );
    SubLFiles.declareFunction( me, "_csetf_lexwiz_term", "_CSETF-LEXWIZ-TERM", 2, 0, false );
    SubLFiles.declareFunction( me, "_csetf_lexwiz_phrase", "_CSETF-LEXWIZ-PHRASE", 2, 0, false );
    SubLFiles.declareFunction( me, "_csetf_lexwiz_mt", "_CSETF-LEXWIZ-MT", 2, 0, false );
    SubLFiles.declareFunction( me, "_csetf_lexwiz_is_preferredP", "_CSETF-LEXWIZ-IS-PREFERRED?", 2, 0, false );
    SubLFiles.declareFunction( me, "_csetf_lexwiz_is_properP", "_CSETF-LEXWIZ-IS-PROPER?", 2, 0, false );
    SubLFiles.declareFunction( me, "_csetf_lexwiz_nonrelationalP", "_CSETF-LEXWIZ-NONRELATIONAL?", 2, 0, false );
    SubLFiles.declareFunction( me, "_csetf_lexwiz_proper_name_pred", "_CSETF-LEXWIZ-PROPER-NAME-PRED", 2, 0, false );
    SubLFiles.declareFunction( me, "_csetf_lexwiz_template", "_CSETF-LEXWIZ-TEMPLATE", 2, 0, false );
    SubLFiles.declareFunction( me, "_csetf_lexwiz_template_args", "_CSETF-LEXWIZ-TEMPLATE-ARGS", 2, 0, false );
    SubLFiles.declareFunction( me, "_csetf_lexwiz_template_speech_parts", "_CSETF-LEXWIZ-TEMPLATE-SPEECH-PARTS", 2, 0, false );
    SubLFiles.declareFunction( me, "_csetf_lexwiz_ignore_arityP", "_CSETF-LEXWIZ-IGNORE-ARITY?", 2, 0, false );
    SubLFiles.declareFunction( me, "_csetf_lexwiz_headword_position", "_CSETF-LEXWIZ-HEADWORD-POSITION", 2, 0, false );
    SubLFiles.declareFunction( me, "_csetf_lexwiz_headword_part_of_speech", "_CSETF-LEXWIZ-HEADWORD-PART-OF-SPEECH", 2, 0, false );
    SubLFiles.declareFunction( me, "_csetf_lexwiz_error_message", "_CSETF-LEXWIZ-ERROR-MESSAGE", 2, 0, false );
    SubLFiles.declareFunction( me, "_csetf_lexwiz_state", "_CSETF-LEXWIZ-STATE", 2, 0, false );
    SubLFiles.declareFunction( me, "_csetf_lexwiz_readyP", "_CSETF-LEXWIZ-READY?", 2, 0, false );
    SubLFiles.declareFunction( me, "_csetf_lexwiz_formula", "_CSETF-LEXWIZ-FORMULA", 2, 0, false );
    SubLFiles.declareFunction( me, "_csetf_lexwiz_user_editedP", "_CSETF-LEXWIZ-USER-EDITED?", 2, 0, false );
    SubLFiles.declareFunction( me, "_csetf_lexwiz_user_formula", "_CSETF-LEXWIZ-USER-FORMULA", 2, 0, false );
    SubLFiles.declareFunction( me, "_csetf_lexwiz_other_formulas", "_CSETF-LEXWIZ-OTHER-FORMULAS", 2, 0, false );
    SubLFiles.declareFunction( me, "_csetf_lexwiz_user_action", "_CSETF-LEXWIZ-USER-ACTION", 2, 0, false );
    SubLFiles.declareFunction( me, "_csetf_lexwiz_parse_template_mt", "_CSETF-LEXWIZ-PARSE-TEMPLATE-MT", 2, 0, false );
    SubLFiles.declareFunction( me, "_csetf_lexwiz_parse_template", "_CSETF-LEXWIZ-PARSE-TEMPLATE", 2, 0, false );
    SubLFiles.declareFunction( me, "_csetf_lexwiz_parse_template_formula", "_CSETF-LEXWIZ-PARSE-TEMPLATE-FORMULA", 2, 0, false );
    SubLFiles.declareFunction( me, "_csetf_lexwiz_lexical_mt", "_CSETF-LEXWIZ-LEXICAL-MT", 2, 0, false );
    SubLFiles.declareFunction( me, "_csetf_lexwiz_syntactic_mt", "_CSETF-LEXWIZ-SYNTACTIC-MT", 2, 0, false );
    SubLFiles.declareFunction( me, "_csetf_lexwiz_generation_mt", "_CSETF-LEXWIZ-GENERATION-MT", 2, 0, false );
    SubLFiles.declareFunction( me, "make_lexification_parameters", "MAKE-LEXIFICATION-PARAMETERS", 0, 1, false );
    SubLFiles.declareFunction( me, "visit_defstruct_lexification_parameters", "VISIT-DEFSTRUCT-LEXIFICATION-PARAMETERS", 2, 0, false );
    SubLFiles.declareFunction( me, "visit_defstruct_object_lexification_parameters_method", "VISIT-DEFSTRUCT-OBJECT-LEXIFICATION-PARAMETERS-METHOD", 2, 0, false );
    SubLFiles.declareFunction( me, "list_lexification_parameters", "LIST-LEXIFICATION-PARAMETERS", 0, 3, false );
    SubLFiles.declareFunction( me, "list_main_lexification_parameters", "LIST-MAIN-LEXIFICATION-PARAMETERS", 1, 0, false );
    SubLFiles.declareFunction( me, "copy_over_lexification_parameters", "COPY-OVER-LEXIFICATION-PARAMETERS", 2, 0, false );
    SubLFiles.declareFunction( me, "copy_lexification_parameters", "COPY-LEXIFICATION-PARAMETERS", 1, 0, false );
    SubLFiles.declareFunction( me, "new_lexification_id", "NEW-LEXIFICATION-ID", 0, 0, false );
    SubLFiles.declareFunction( me, "set_lexification_object", "SET-LEXIFICATION-OBJECT", 2, 0, false );
    SubLFiles.declareFunction( me, "get_lexification_object", "GET-LEXIFICATION-OBJECT", 1, 0, false );
    SubLFiles.declareFunction( me, "lexwiz_settings_changedP", "LEXWIZ-SETTINGS-CHANGED?", 2, 0, false );
    SubLFiles.declareFunction( me, "resolve_lexwiz_object_fort", "RESOLVE-LEXWIZ-OBJECT-FORT", 1, 0, false );
    SubLFiles.declareFunction( me, "lispify_template_args", "LISPIFY-TEMPLATE-ARGS", 1, 0, false );
    SubLFiles.declareFunction( me, "count_positional_args", "COUNT-POSITIONAL-ARGS", 1, 0, false );
    SubLFiles.declareFunction( me, "convert_position", "CONVERT-POSITION", 2, 0, false );
    SubLFiles.declareFunction( me, "determine_lexical_predicate", "DETERMINE-LEXICAL-PREDICATE", 2, 0, false );
    SubLFiles.declareFunction( me, "determine_lexical_formula", "DETERMINE-LEXICAL-FORMULA", 4, 1, false );
    SubLFiles.declareFunction( me, "add_lexical_mapping", "ADD-LEXICAL-MAPPING", 3, 1, false );
    SubLFiles.declareFunction( me, "remove_lexical_mapping", "REMOVE-LEXICAL-MAPPING", 3, 1, false );
    SubLFiles.declareFunction( me, "do_lexical_mapping_int", "DO-LEXICAL-MAPPING-INT", 5, 2, false );
    SubLFiles.declareFunction( me, "validate_lexification_parameters", "VALIDATE-LEXIFICATION-PARAMETERS", 4, 0, false );
    SubLFiles.declareFunction( me, "determine_lexification_word_unit", "DETERMINE-LEXIFICATION-WORD-UNIT", 2, 1, false );
    SubLFiles.declareFunction( me, "acceptable_lexification_word_unitP", "ACCEPTABLE-LEXIFICATION-WORD-UNIT?", 1, 0, false );
    SubLFiles.declareFunction( me, "perform_lexification", "PERFORM-LEXIFICATION", 1, 0, false );
    SubLFiles.declareFunction( me, "remove_stub_lexifications", "REMOVE-STUB-LEXIFICATIONS", 1, 2, false );
    SubLFiles.declareFunction( me, "remove_genstring_assertions", "REMOVE-GENSTRING-ASSERTIONS", 1, 2, false );
    SubLFiles.declareFunction( me, "derive_lexification_formula", "DERIVE-LEXIFICATION-FORMULA", 1, 0, false );
    SubLFiles.declareFunction( me, "derive_proper_name_formula", "DERIVE-PROPER-NAME-FORMULA", 1, 0, false );
    SubLFiles.declareFunction( me, "derive_denotation_formula", "DERIVE-DENOTATION-FORMULA", 1, 0, false );
    SubLFiles.declareFunction( me, "derive_relation_formula", "DERIVE-RELATION-FORMULA", 1, 0, false );
    SubLFiles.declareFunction( me, "derive_parse_template_formula", "DERIVE-PARSE-TEMPLATE-FORMULA", 1, 0, false );
    SubLFiles.declareFunction( me, "reset_lexification_parameters", "RESET-LEXIFICATION-PARAMETERS", 0, 1, false );
    SubLFiles.declareFunction( me, "trace_lexification_parameters", "TRACE-LEXIFICATION-PARAMETERS", 0, 2, false );
    SubLFiles.declareFunction( me, "filter_proper_name_predicates", "FILTER-PROPER-NAME-PREDICATES", 1, 0, false );
    SubLFiles.declareFunction( me, "init_lexification_wizard", "INIT-LEXIFICATION-WIZARD", 0, 1, false );
    SubLFiles.declareFunction( me, "get_all_lexwiz_lexical_mts", "GET-ALL-LEXWIZ-LEXICAL-MTS", 0, 0, false );
    SubLFiles.declareFunction( me, "irrelevant_lexification_term", "IRRELEVANT-LEXIFICATION-TERM", 1, 1, false );
    SubLFiles.declareFunction( me, "determine_lexical_mapping_mt", "DETERMINE-LEXICAL-MAPPING-MT", 1, 1, false );
    return NIL;
  }

  public static SubLObject init_lexification_wizard_file()
  {
    $dtp_lexification_parameters$ = SubLFiles.defconstant( "*DTP-LEXIFICATION-PARAMETERS*", $sym0$LEXIFICATION_PARAMETERS );
    $lexwiz_defaults$ = SubLFiles.defparameter( "*LEXWIZ-DEFAULTS*", make_lexification_parameters( UNPROVIDED ) );
    $lexification_part_of_speech_keywords$ = SubLFiles.deflexical( "*LEXIFICATION-PART-OF-SPEECH-KEYWORDS*", $list108 );
    $main_lexification_parts_of_speech$ = SubLFiles.deflexical( "*MAIN-LEXIFICATION-PARTS-OF-SPEECH*", ( maybeDefault( $sym109$_MAIN_LEXIFICATION_PARTS_OF_SPEECH_, $main_lexification_parts_of_speech$, NIL ) ) );
    $all_lexification_parts_of_speech_labels$ = SubLFiles.deflexical( "*ALL-LEXIFICATION-PARTS-OF-SPEECH-LABELS*", ( maybeDefault( $sym110$_ALL_LEXIFICATION_PARTS_OF_SPEECH_LABELS_,
        $all_lexification_parts_of_speech_labels$, NIL ) ) );
    $lexification_proper_name_predicate_names$ = SubLFiles.deflexical( "*LEXIFICATION-PROPER-NAME-PREDICATE-NAMES*", ( maybeDefault( $sym111$_LEXIFICATION_PROPER_NAME_PREDICATE_NAMES_,
        $lexification_proper_name_predicate_names$, NIL ) ) );
    $lexification_proper_name_predicate_constraints$ = SubLFiles.deflexical( "*LEXIFICATION-PROPER-NAME-PREDICATE-CONSTRAINTS*", ( maybeDefault( $sym112$_LEXIFICATION_PROPER_NAME_PREDICATE_CONSTRAINTS_,
        $lexification_proper_name_predicate_constraints$, NIL ) ) );
    $lexification_mts$ = SubLFiles.deflexical( "*LEXIFICATION-MTS*", ( maybeDefault( $sym113$_LEXIFICATION_MTS_, $lexification_mts$, NIL ) ) );
    $default_proper_name_pred$ = SubLFiles.deflexical( "*DEFAULT-PROPER-NAME-PRED*", $str114$nameString );
    $default_denotation_predicate$ = SubLFiles.deflexical( "*DEFAULT-DENOTATION-PREDICATE*", $const115$denotation );
    $lexification_object_table$ = SubLFiles.deflexical( "*LEXIFICATION-OBJECT-TABLE*", maybeDefault( $sym116$_LEXIFICATION_OBJECT_TABLE_, $lexification_object_table$, () -> ( Hashtables.make_hash_table( $int117$256,
        Symbols.symbol_function( EQUAL ), UNPROVIDED ) ) ) );
    $lexification_wizard_initialized$ = SubLFiles.defparameter( "*LEXIFICATION-WIZARD-INITIALIZED*", NIL );
    $sme_lexwiz_active$ = SubLFiles.defvar( "*SME-LEXWIZ-ACTIVE*", NIL );
    $allow_advanced_lexwiz_featuresP$ = SubLFiles.defvar( "*ALLOW-ADVANCED-LEXWIZ-FEATURES?*", NIL );
    $lexification_template_mts$ = SubLFiles.deflexical( "*LEXIFICATION-TEMPLATE-MTS*", ( maybeDefault( $sym118$_LEXIFICATION_TEMPLATE_MTS_, $lexification_template_mts$, NIL ) ) );
    $isolate_syntactic_mappingsP$ = SubLFiles.deflexical( "*ISOLATE-SYNTACTIC-MAPPINGS?*", T );
    $lexwiz_show_term_informationP$ = SubLFiles.deflexical( "*LEXWIZ-SHOW-TERM-INFORMATION?*", T );
    $lexwiz_test$ = SubLFiles.defconstant( "*LEXWIZ-TEST*", $str179$Lexification_Wizard_Test );
    $lexwiz_test_category$ = SubLFiles.defconstant( "*LEXWIZ-TEST-CATEGORY*", Sequences.cconcatenate( $lexwiz_test$.getGlobalValue(), $str180$_Category ) );
    $lexwiz_test_suite$ = SubLFiles.defconstant( "*LEXWIZ-TEST-SUITE*", Sequences.cconcatenate( $lexwiz_test$.getGlobalValue(), $str181$_Suite ) );
    $lexwiz_module$ = SubLFiles.defconstant( "*LEXWIZ-MODULE*", $str182$lexification_wizard );
    return NIL;
  }

  public static SubLObject setup_lexification_wizard_file()
  {
    Structures.register_method( print_high.$print_object_method_table$.getGlobalValue(), $dtp_lexification_parameters$.getGlobalValue(), Symbols.symbol_function(
        $sym16$LEXIFICATION_PARAMETERS_PRINT_FUNCTION_TRAMPOLINE ) );
    SubLSpecialOperatorDeclarations.proclaim( $list17 );
    Structures.def_csetf( $sym18$LEXWIZ_ID, $sym19$_CSETF_LEXWIZ_ID );
    Structures.def_csetf( $sym20$LEXWIZ_TERM, $sym21$_CSETF_LEXWIZ_TERM );
    Structures.def_csetf( $sym22$LEXWIZ_PHRASE, $sym23$_CSETF_LEXWIZ_PHRASE );
    Structures.def_csetf( $sym24$LEXWIZ_MT, $sym25$_CSETF_LEXWIZ_MT );
    Structures.def_csetf( $sym26$LEXWIZ_IS_PREFERRED_, $sym27$_CSETF_LEXWIZ_IS_PREFERRED_ );
    Structures.def_csetf( $sym28$LEXWIZ_IS_PROPER_, $sym29$_CSETF_LEXWIZ_IS_PROPER_ );
    Structures.def_csetf( $sym30$LEXWIZ_NONRELATIONAL_, $sym31$_CSETF_LEXWIZ_NONRELATIONAL_ );
    Structures.def_csetf( $sym32$LEXWIZ_PROPER_NAME_PRED, $sym33$_CSETF_LEXWIZ_PROPER_NAME_PRED );
    Structures.def_csetf( $sym34$LEXWIZ_TEMPLATE, $sym35$_CSETF_LEXWIZ_TEMPLATE );
    Structures.def_csetf( $sym36$LEXWIZ_TEMPLATE_ARGS, $sym37$_CSETF_LEXWIZ_TEMPLATE_ARGS );
    Structures.def_csetf( $sym38$LEXWIZ_TEMPLATE_SPEECH_PARTS, $sym39$_CSETF_LEXWIZ_TEMPLATE_SPEECH_PARTS );
    Structures.def_csetf( $sym40$LEXWIZ_IGNORE_ARITY_, $sym41$_CSETF_LEXWIZ_IGNORE_ARITY_ );
    Structures.def_csetf( $sym42$LEXWIZ_HEADWORD_POSITION, $sym43$_CSETF_LEXWIZ_HEADWORD_POSITION );
    Structures.def_csetf( $sym44$LEXWIZ_HEADWORD_PART_OF_SPEECH, $sym45$_CSETF_LEXWIZ_HEADWORD_PART_OF_SPEECH );
    Structures.def_csetf( $sym46$LEXWIZ_ERROR_MESSAGE, $sym47$_CSETF_LEXWIZ_ERROR_MESSAGE );
    Structures.def_csetf( $sym48$LEXWIZ_STATE, $sym49$_CSETF_LEXWIZ_STATE );
    Structures.def_csetf( $sym50$LEXWIZ_READY_, $sym51$_CSETF_LEXWIZ_READY_ );
    Structures.def_csetf( $sym52$LEXWIZ_FORMULA, $sym53$_CSETF_LEXWIZ_FORMULA );
    Structures.def_csetf( $sym54$LEXWIZ_USER_EDITED_, $sym55$_CSETF_LEXWIZ_USER_EDITED_ );
    Structures.def_csetf( $sym56$LEXWIZ_USER_FORMULA, $sym57$_CSETF_LEXWIZ_USER_FORMULA );
    Structures.def_csetf( $sym58$LEXWIZ_OTHER_FORMULAS, $sym59$_CSETF_LEXWIZ_OTHER_FORMULAS );
    Structures.def_csetf( $sym60$LEXWIZ_USER_ACTION, $sym61$_CSETF_LEXWIZ_USER_ACTION );
    Structures.def_csetf( $sym62$LEXWIZ_PARSE_TEMPLATE_MT, $sym63$_CSETF_LEXWIZ_PARSE_TEMPLATE_MT );
    Structures.def_csetf( $sym64$LEXWIZ_PARSE_TEMPLATE, $sym65$_CSETF_LEXWIZ_PARSE_TEMPLATE );
    Structures.def_csetf( $sym66$LEXWIZ_PARSE_TEMPLATE_FORMULA, $sym67$_CSETF_LEXWIZ_PARSE_TEMPLATE_FORMULA );
    Structures.def_csetf( $sym68$LEXWIZ_LEXICAL_MT, $sym69$_CSETF_LEXWIZ_LEXICAL_MT );
    Structures.def_csetf( $sym70$LEXWIZ_SYNTACTIC_MT, $sym71$_CSETF_LEXWIZ_SYNTACTIC_MT );
    Structures.def_csetf( $sym72$LEXWIZ_GENERATION_MT, $sym73$_CSETF_LEXWIZ_GENERATION_MT );
    Equality.identity( $sym0$LEXIFICATION_PARAMETERS );
    Structures.register_method( visitation.$visit_defstruct_object_method_table$.getGlobalValue(), $dtp_lexification_parameters$.getGlobalValue(), Symbols.symbol_function(
        $sym107$VISIT_DEFSTRUCT_OBJECT_LEXIFICATION_PARAMETERS_METHOD ) );
    subl_macro_promotions.declare_defglobal( $sym109$_MAIN_LEXIFICATION_PARTS_OF_SPEECH_ );
    subl_macro_promotions.declare_defglobal( $sym110$_ALL_LEXIFICATION_PARTS_OF_SPEECH_LABELS_ );
    subl_macro_promotions.declare_defglobal( $sym111$_LEXIFICATION_PROPER_NAME_PREDICATE_NAMES_ );
    subl_macro_promotions.declare_defglobal( $sym112$_LEXIFICATION_PROPER_NAME_PREDICATE_CONSTRAINTS_ );
    subl_macro_promotions.declare_defglobal( $sym113$_LEXIFICATION_MTS_ );
    subl_macro_promotions.declare_defglobal( $sym116$_LEXIFICATION_OBJECT_TABLE_ );
    subl_macro_promotions.declare_defglobal( $sym118$_LEXIFICATION_TEMPLATE_MTS_ );
    sunit_external.define_test_category( $lexwiz_test_category$.getGlobalValue(), UNPROVIDED );
    sunit_external.define_test_suite( $lexwiz_test_suite$.getGlobalValue(), ConsesLow.list( $lexwiz_test_category$.getGlobalValue() ), UNPROVIDED, UNPROVIDED );
    return NIL;
  }

  @Override
  public void declareFunctions()
  {
    declare_lexification_wizard_file();
  }

  @Override
  public void initializeVariables()
  {
    init_lexification_wizard_file();
  }

  @Override
  public void runTopLevelForms()
  {
    setup_lexification_wizard_file();
  }
  static
  {
    me = new lexification_wizard();
    $dtp_lexification_parameters$ = null;
    $lexwiz_defaults$ = null;
    $lexification_part_of_speech_keywords$ = null;
    $main_lexification_parts_of_speech$ = null;
    $all_lexification_parts_of_speech_labels$ = null;
    $lexification_proper_name_predicate_names$ = null;
    $lexification_proper_name_predicate_constraints$ = null;
    $lexification_mts$ = null;
    $default_proper_name_pred$ = null;
    $default_denotation_predicate$ = null;
    $lexification_object_table$ = null;
    $lexification_wizard_initialized$ = null;
    $sme_lexwiz_active$ = null;
    $allow_advanced_lexwiz_featuresP$ = null;
    $lexification_template_mts$ = null;
    $isolate_syntactic_mappingsP$ = null;
    $lexwiz_show_term_informationP$ = null;
    $lexwiz_test$ = null;
    $lexwiz_test_category$ = null;
    $lexwiz_test_suite$ = null;
    $lexwiz_module$ = null;
    $sym0$LEXIFICATION_PARAMETERS = makeSymbol( "LEXIFICATION-PARAMETERS" );
    $sym1$LEXIFICATION_PARAMETERS_P = makeSymbol( "LEXIFICATION-PARAMETERS-P" );
    $list2 = ConsesLow.list( new SubLObject[] { makeSymbol( "ID" ), makeSymbol( "TERM" ), makeSymbol( "PHRASE" ), makeSymbol( "MT" ), makeSymbol( "IS-PREFERRED?" ), makeSymbol( "IS-PROPER?" ), makeSymbol(
        "NONRELATIONAL?" ), makeSymbol( "PROPER-NAME-PRED" ), makeSymbol( "TEMPLATE" ), makeSymbol( "TEMPLATE-ARGS" ), makeSymbol( "TEMPLATE-SPEECH-PARTS" ), makeSymbol( "IGNORE-ARITY?" ), makeSymbol(
            "HEADWORD-POSITION" ), makeSymbol( "HEADWORD-PART-OF-SPEECH" ), makeSymbol( "ERROR-MESSAGE" ), makeSymbol( "STATE" ), makeSymbol( "READY?" ), makeSymbol( "FORMULA" ), makeSymbol( "USER-EDITED?" ), makeSymbol(
                "USER-FORMULA" ), makeSymbol( "OTHER-FORMULAS" ), makeSymbol( "USER-ACTION" ), makeSymbol( "PARSE-TEMPLATE-MT" ), makeSymbol( "PARSE-TEMPLATE" ), makeSymbol( "PARSE-TEMPLATE-FORMULA" ), makeSymbol(
                    "LEXICAL-MT" ), makeSymbol( "SYNTACTIC-MT" ), makeSymbol( "GENERATION-MT" )
    } );
    $list3 = ConsesLow.list( new SubLObject[] { makeKeyword( "ID" ), makeKeyword( "TERM" ), makeKeyword( "PHRASE" ), makeKeyword( "MT" ), makeKeyword( "IS-PREFERRED?" ), makeKeyword( "IS-PROPER?" ), makeKeyword(
        "NONRELATIONAL?" ), makeKeyword( "PROPER-NAME-PRED" ), makeKeyword( "TEMPLATE" ), makeKeyword( "TEMPLATE-ARGS" ), makeKeyword( "TEMPLATE-SPEECH-PARTS" ), makeKeyword( "IGNORE-ARITY?" ), makeKeyword(
            "HEADWORD-POSITION" ), makeKeyword( "HEADWORD-PART-OF-SPEECH" ), makeKeyword( "ERROR-MESSAGE" ), makeKeyword( "STATE" ), makeKeyword( "READY?" ), makeKeyword( "FORMULA" ), makeKeyword( "USER-EDITED?" ),
      makeKeyword( "USER-FORMULA" ), makeKeyword( "OTHER-FORMULAS" ), makeKeyword( "USER-ACTION" ), makeKeyword( "PARSE-TEMPLATE-MT" ), makeKeyword( "PARSE-TEMPLATE" ), makeKeyword( "PARSE-TEMPLATE-FORMULA" ),
      makeKeyword( "LEXICAL-MT" ), makeKeyword( "SYNTACTIC-MT" ), makeKeyword( "GENERATION-MT" )
    } );
    $list4 = ConsesLow.list( new SubLObject[] { makeSymbol( "LEXWIZ-ID" ), makeSymbol( "LEXWIZ-TERM" ), makeSymbol( "LEXWIZ-PHRASE" ), makeSymbol( "LEXWIZ-MT" ), makeSymbol( "LEXWIZ-IS-PREFERRED?" ), makeSymbol(
        "LEXWIZ-IS-PROPER?" ), makeSymbol( "LEXWIZ-NONRELATIONAL?" ), makeSymbol( "LEXWIZ-PROPER-NAME-PRED" ), makeSymbol( "LEXWIZ-TEMPLATE" ), makeSymbol( "LEXWIZ-TEMPLATE-ARGS" ), makeSymbol(
            "LEXWIZ-TEMPLATE-SPEECH-PARTS" ), makeSymbol( "LEXWIZ-IGNORE-ARITY?" ), makeSymbol( "LEXWIZ-HEADWORD-POSITION" ), makeSymbol( "LEXWIZ-HEADWORD-PART-OF-SPEECH" ), makeSymbol( "LEXWIZ-ERROR-MESSAGE" ),
      makeSymbol( "LEXWIZ-STATE" ), makeSymbol( "LEXWIZ-READY?" ), makeSymbol( "LEXWIZ-FORMULA" ), makeSymbol( "LEXWIZ-USER-EDITED?" ), makeSymbol( "LEXWIZ-USER-FORMULA" ), makeSymbol( "LEXWIZ-OTHER-FORMULAS" ),
      makeSymbol( "LEXWIZ-USER-ACTION" ), makeSymbol( "LEXWIZ-PARSE-TEMPLATE-MT" ), makeSymbol( "LEXWIZ-PARSE-TEMPLATE" ), makeSymbol( "LEXWIZ-PARSE-TEMPLATE-FORMULA" ), makeSymbol( "LEXWIZ-LEXICAL-MT" ), makeSymbol(
          "LEXWIZ-SYNTACTIC-MT" ), makeSymbol( "LEXWIZ-GENERATION-MT" )
    } );
    $list5 = ConsesLow.list( new SubLObject[] { makeSymbol( "_CSETF-LEXWIZ-ID" ), makeSymbol( "_CSETF-LEXWIZ-TERM" ), makeSymbol( "_CSETF-LEXWIZ-PHRASE" ), makeSymbol( "_CSETF-LEXWIZ-MT" ), makeSymbol(
        "_CSETF-LEXWIZ-IS-PREFERRED?" ), makeSymbol( "_CSETF-LEXWIZ-IS-PROPER?" ), makeSymbol( "_CSETF-LEXWIZ-NONRELATIONAL?" ), makeSymbol( "_CSETF-LEXWIZ-PROPER-NAME-PRED" ), makeSymbol( "_CSETF-LEXWIZ-TEMPLATE" ),
      makeSymbol( "_CSETF-LEXWIZ-TEMPLATE-ARGS" ), makeSymbol( "_CSETF-LEXWIZ-TEMPLATE-SPEECH-PARTS" ), makeSymbol( "_CSETF-LEXWIZ-IGNORE-ARITY?" ), makeSymbol( "_CSETF-LEXWIZ-HEADWORD-POSITION" ), makeSymbol(
          "_CSETF-LEXWIZ-HEADWORD-PART-OF-SPEECH" ), makeSymbol( "_CSETF-LEXWIZ-ERROR-MESSAGE" ), makeSymbol( "_CSETF-LEXWIZ-STATE" ), makeSymbol( "_CSETF-LEXWIZ-READY?" ), makeSymbol( "_CSETF-LEXWIZ-FORMULA" ),
      makeSymbol( "_CSETF-LEXWIZ-USER-EDITED?" ), makeSymbol( "_CSETF-LEXWIZ-USER-FORMULA" ), makeSymbol( "_CSETF-LEXWIZ-OTHER-FORMULAS" ), makeSymbol( "_CSETF-LEXWIZ-USER-ACTION" ), makeSymbol(
          "_CSETF-LEXWIZ-PARSE-TEMPLATE-MT" ), makeSymbol( "_CSETF-LEXWIZ-PARSE-TEMPLATE" ), makeSymbol( "_CSETF-LEXWIZ-PARSE-TEMPLATE-FORMULA" ), makeSymbol( "_CSETF-LEXWIZ-LEXICAL-MT" ), makeSymbol(
              "_CSETF-LEXWIZ-SYNTACTIC-MT" ), makeSymbol( "_CSETF-LEXWIZ-GENERATION-MT" )
    } );
    $sym6$DEFAULT_STRUCT_PRINT_FUNCTION = makeSymbol( "DEFAULT-STRUCT-PRINT-FUNCTION" );
    $int7$21 = makeInteger( 21 );
    $int8$22 = makeInteger( 22 );
    $int9$23 = makeInteger( 23 );
    $int10$24 = makeInteger( 24 );
    $int11$25 = makeInteger( 25 );
    $int12$26 = makeInteger( 26 );
    $int13$27 = makeInteger( 27 );
    $int14$28 = makeInteger( 28 );
    $int15$29 = makeInteger( 29 );
    $sym16$LEXIFICATION_PARAMETERS_PRINT_FUNCTION_TRAMPOLINE = makeSymbol( "LEXIFICATION-PARAMETERS-PRINT-FUNCTION-TRAMPOLINE" );
    $list17 = ConsesLow.list( makeSymbol( "OPTIMIZE-FUNCALL" ), makeSymbol( "LEXIFICATION-PARAMETERS-P" ) );
    $sym18$LEXWIZ_ID = makeSymbol( "LEXWIZ-ID" );
    $sym19$_CSETF_LEXWIZ_ID = makeSymbol( "_CSETF-LEXWIZ-ID" );
    $sym20$LEXWIZ_TERM = makeSymbol( "LEXWIZ-TERM" );
    $sym21$_CSETF_LEXWIZ_TERM = makeSymbol( "_CSETF-LEXWIZ-TERM" );
    $sym22$LEXWIZ_PHRASE = makeSymbol( "LEXWIZ-PHRASE" );
    $sym23$_CSETF_LEXWIZ_PHRASE = makeSymbol( "_CSETF-LEXWIZ-PHRASE" );
    $sym24$LEXWIZ_MT = makeSymbol( "LEXWIZ-MT" );
    $sym25$_CSETF_LEXWIZ_MT = makeSymbol( "_CSETF-LEXWIZ-MT" );
    $sym26$LEXWIZ_IS_PREFERRED_ = makeSymbol( "LEXWIZ-IS-PREFERRED?" );
    $sym27$_CSETF_LEXWIZ_IS_PREFERRED_ = makeSymbol( "_CSETF-LEXWIZ-IS-PREFERRED?" );
    $sym28$LEXWIZ_IS_PROPER_ = makeSymbol( "LEXWIZ-IS-PROPER?" );
    $sym29$_CSETF_LEXWIZ_IS_PROPER_ = makeSymbol( "_CSETF-LEXWIZ-IS-PROPER?" );
    $sym30$LEXWIZ_NONRELATIONAL_ = makeSymbol( "LEXWIZ-NONRELATIONAL?" );
    $sym31$_CSETF_LEXWIZ_NONRELATIONAL_ = makeSymbol( "_CSETF-LEXWIZ-NONRELATIONAL?" );
    $sym32$LEXWIZ_PROPER_NAME_PRED = makeSymbol( "LEXWIZ-PROPER-NAME-PRED" );
    $sym33$_CSETF_LEXWIZ_PROPER_NAME_PRED = makeSymbol( "_CSETF-LEXWIZ-PROPER-NAME-PRED" );
    $sym34$LEXWIZ_TEMPLATE = makeSymbol( "LEXWIZ-TEMPLATE" );
    $sym35$_CSETF_LEXWIZ_TEMPLATE = makeSymbol( "_CSETF-LEXWIZ-TEMPLATE" );
    $sym36$LEXWIZ_TEMPLATE_ARGS = makeSymbol( "LEXWIZ-TEMPLATE-ARGS" );
    $sym37$_CSETF_LEXWIZ_TEMPLATE_ARGS = makeSymbol( "_CSETF-LEXWIZ-TEMPLATE-ARGS" );
    $sym38$LEXWIZ_TEMPLATE_SPEECH_PARTS = makeSymbol( "LEXWIZ-TEMPLATE-SPEECH-PARTS" );
    $sym39$_CSETF_LEXWIZ_TEMPLATE_SPEECH_PARTS = makeSymbol( "_CSETF-LEXWIZ-TEMPLATE-SPEECH-PARTS" );
    $sym40$LEXWIZ_IGNORE_ARITY_ = makeSymbol( "LEXWIZ-IGNORE-ARITY?" );
    $sym41$_CSETF_LEXWIZ_IGNORE_ARITY_ = makeSymbol( "_CSETF-LEXWIZ-IGNORE-ARITY?" );
    $sym42$LEXWIZ_HEADWORD_POSITION = makeSymbol( "LEXWIZ-HEADWORD-POSITION" );
    $sym43$_CSETF_LEXWIZ_HEADWORD_POSITION = makeSymbol( "_CSETF-LEXWIZ-HEADWORD-POSITION" );
    $sym44$LEXWIZ_HEADWORD_PART_OF_SPEECH = makeSymbol( "LEXWIZ-HEADWORD-PART-OF-SPEECH" );
    $sym45$_CSETF_LEXWIZ_HEADWORD_PART_OF_SPEECH = makeSymbol( "_CSETF-LEXWIZ-HEADWORD-PART-OF-SPEECH" );
    $sym46$LEXWIZ_ERROR_MESSAGE = makeSymbol( "LEXWIZ-ERROR-MESSAGE" );
    $sym47$_CSETF_LEXWIZ_ERROR_MESSAGE = makeSymbol( "_CSETF-LEXWIZ-ERROR-MESSAGE" );
    $sym48$LEXWIZ_STATE = makeSymbol( "LEXWIZ-STATE" );
    $sym49$_CSETF_LEXWIZ_STATE = makeSymbol( "_CSETF-LEXWIZ-STATE" );
    $sym50$LEXWIZ_READY_ = makeSymbol( "LEXWIZ-READY?" );
    $sym51$_CSETF_LEXWIZ_READY_ = makeSymbol( "_CSETF-LEXWIZ-READY?" );
    $sym52$LEXWIZ_FORMULA = makeSymbol( "LEXWIZ-FORMULA" );
    $sym53$_CSETF_LEXWIZ_FORMULA = makeSymbol( "_CSETF-LEXWIZ-FORMULA" );
    $sym54$LEXWIZ_USER_EDITED_ = makeSymbol( "LEXWIZ-USER-EDITED?" );
    $sym55$_CSETF_LEXWIZ_USER_EDITED_ = makeSymbol( "_CSETF-LEXWIZ-USER-EDITED?" );
    $sym56$LEXWIZ_USER_FORMULA = makeSymbol( "LEXWIZ-USER-FORMULA" );
    $sym57$_CSETF_LEXWIZ_USER_FORMULA = makeSymbol( "_CSETF-LEXWIZ-USER-FORMULA" );
    $sym58$LEXWIZ_OTHER_FORMULAS = makeSymbol( "LEXWIZ-OTHER-FORMULAS" );
    $sym59$_CSETF_LEXWIZ_OTHER_FORMULAS = makeSymbol( "_CSETF-LEXWIZ-OTHER-FORMULAS" );
    $sym60$LEXWIZ_USER_ACTION = makeSymbol( "LEXWIZ-USER-ACTION" );
    $sym61$_CSETF_LEXWIZ_USER_ACTION = makeSymbol( "_CSETF-LEXWIZ-USER-ACTION" );
    $sym62$LEXWIZ_PARSE_TEMPLATE_MT = makeSymbol( "LEXWIZ-PARSE-TEMPLATE-MT" );
    $sym63$_CSETF_LEXWIZ_PARSE_TEMPLATE_MT = makeSymbol( "_CSETF-LEXWIZ-PARSE-TEMPLATE-MT" );
    $sym64$LEXWIZ_PARSE_TEMPLATE = makeSymbol( "LEXWIZ-PARSE-TEMPLATE" );
    $sym65$_CSETF_LEXWIZ_PARSE_TEMPLATE = makeSymbol( "_CSETF-LEXWIZ-PARSE-TEMPLATE" );
    $sym66$LEXWIZ_PARSE_TEMPLATE_FORMULA = makeSymbol( "LEXWIZ-PARSE-TEMPLATE-FORMULA" );
    $sym67$_CSETF_LEXWIZ_PARSE_TEMPLATE_FORMULA = makeSymbol( "_CSETF-LEXWIZ-PARSE-TEMPLATE-FORMULA" );
    $sym68$LEXWIZ_LEXICAL_MT = makeSymbol( "LEXWIZ-LEXICAL-MT" );
    $sym69$_CSETF_LEXWIZ_LEXICAL_MT = makeSymbol( "_CSETF-LEXWIZ-LEXICAL-MT" );
    $sym70$LEXWIZ_SYNTACTIC_MT = makeSymbol( "LEXWIZ-SYNTACTIC-MT" );
    $sym71$_CSETF_LEXWIZ_SYNTACTIC_MT = makeSymbol( "_CSETF-LEXWIZ-SYNTACTIC-MT" );
    $sym72$LEXWIZ_GENERATION_MT = makeSymbol( "LEXWIZ-GENERATION-MT" );
    $sym73$_CSETF_LEXWIZ_GENERATION_MT = makeSymbol( "_CSETF-LEXWIZ-GENERATION-MT" );
    $kw74$ID = makeKeyword( "ID" );
    $kw75$TERM = makeKeyword( "TERM" );
    $kw76$PHRASE = makeKeyword( "PHRASE" );
    $kw77$MT = makeKeyword( "MT" );
    $kw78$IS_PREFERRED_ = makeKeyword( "IS-PREFERRED?" );
    $kw79$IS_PROPER_ = makeKeyword( "IS-PROPER?" );
    $kw80$NONRELATIONAL_ = makeKeyword( "NONRELATIONAL?" );
    $kw81$PROPER_NAME_PRED = makeKeyword( "PROPER-NAME-PRED" );
    $kw82$TEMPLATE = makeKeyword( "TEMPLATE" );
    $kw83$TEMPLATE_ARGS = makeKeyword( "TEMPLATE-ARGS" );
    $kw84$TEMPLATE_SPEECH_PARTS = makeKeyword( "TEMPLATE-SPEECH-PARTS" );
    $kw85$IGNORE_ARITY_ = makeKeyword( "IGNORE-ARITY?" );
    $kw86$HEADWORD_POSITION = makeKeyword( "HEADWORD-POSITION" );
    $kw87$HEADWORD_PART_OF_SPEECH = makeKeyword( "HEADWORD-PART-OF-SPEECH" );
    $kw88$ERROR_MESSAGE = makeKeyword( "ERROR-MESSAGE" );
    $kw89$STATE = makeKeyword( "STATE" );
    $kw90$READY_ = makeKeyword( "READY?" );
    $kw91$FORMULA = makeKeyword( "FORMULA" );
    $kw92$USER_EDITED_ = makeKeyword( "USER-EDITED?" );
    $kw93$USER_FORMULA = makeKeyword( "USER-FORMULA" );
    $kw94$OTHER_FORMULAS = makeKeyword( "OTHER-FORMULAS" );
    $kw95$USER_ACTION = makeKeyword( "USER-ACTION" );
    $kw96$PARSE_TEMPLATE_MT = makeKeyword( "PARSE-TEMPLATE-MT" );
    $kw97$PARSE_TEMPLATE = makeKeyword( "PARSE-TEMPLATE" );
    $kw98$PARSE_TEMPLATE_FORMULA = makeKeyword( "PARSE-TEMPLATE-FORMULA" );
    $kw99$LEXICAL_MT = makeKeyword( "LEXICAL-MT" );
    $kw100$SYNTACTIC_MT = makeKeyword( "SYNTACTIC-MT" );
    $kw101$GENERATION_MT = makeKeyword( "GENERATION-MT" );
    $str102$Invalid_slot__S_for_construction_ = makeString( "Invalid slot ~S for construction function" );
    $kw103$BEGIN = makeKeyword( "BEGIN" );
    $sym104$MAKE_LEXIFICATION_PARAMETERS = makeSymbol( "MAKE-LEXIFICATION-PARAMETERS" );
    $kw105$SLOT = makeKeyword( "SLOT" );
    $kw106$END = makeKeyword( "END" );
    $sym107$VISIT_DEFSTRUCT_OBJECT_LEXIFICATION_PARAMETERS_METHOD = makeSymbol( "VISIT-DEFSTRUCT-OBJECT-LEXIFICATION-PARAMETERS-METHOD" );
    $list108 = ConsesLow.list( makeKeyword( "NOUN" ), makeKeyword( "PROPER-NOUN" ), makeKeyword( "VERB" ), makeKeyword( "ADJECTIVE" ), makeKeyword( "ADVERB" ) );
    $sym109$_MAIN_LEXIFICATION_PARTS_OF_SPEECH_ = makeSymbol( "*MAIN-LEXIFICATION-PARTS-OF-SPEECH*" );
    $sym110$_ALL_LEXIFICATION_PARTS_OF_SPEECH_LABELS_ = makeSymbol( "*ALL-LEXIFICATION-PARTS-OF-SPEECH-LABELS*" );
    $sym111$_LEXIFICATION_PROPER_NAME_PREDICATE_NAMES_ = makeSymbol( "*LEXIFICATION-PROPER-NAME-PREDICATE-NAMES*" );
    $sym112$_LEXIFICATION_PROPER_NAME_PREDICATE_CONSTRAINTS_ = makeSymbol( "*LEXIFICATION-PROPER-NAME-PREDICATE-CONSTRAINTS*" );
    $sym113$_LEXIFICATION_MTS_ = makeSymbol( "*LEXIFICATION-MTS*" );
    $str114$nameString = makeString( "nameString" );
    $const115$denotation = constant_handles.reader_make_constant_shell( makeString( "denotation" ) );
    $sym116$_LEXIFICATION_OBJECT_TABLE_ = makeSymbol( "*LEXIFICATION-OBJECT-TABLE*" );
    $int117$256 = makeInteger( 256 );
    $sym118$_LEXIFICATION_TEMPLATE_MTS_ = makeSymbol( "*LEXIFICATION-TEMPLATE-MTS*" );
    $str119$Warning__ = makeString( "Warning: " );
    $str120$Object_hash_table_not_initialized = makeString( "Object hash table not initialized" );
    $str121$lexwiz_settings_changed____A_vs__ = makeString( "lexwiz-settings-changed?: ~A vs. ~A~%" );
    $str122$setting_change___s__ = makeString( "setting change: ~s~%" );
    $str123$____assertion_failed___a______ = makeString( "*** assertion failed: ~a ***~%" );
    $list124 = ConsesLow.list( EQUAL, makeSymbol( "ID" ), ConsesLow.list( makeSymbol( "LEXWIZ-ID" ), makeSymbol( "LEXWIZ-OBJECT" ) ) );
    $kw125$IGNORE_ERRORS_TARGET = makeKeyword( "IGNORE-ERRORS-TARGET" );
    $sym126$IGNORE_ERRORS_HANDLER = makeSymbol( "IGNORE-ERRORS-HANDLER", "SUBLISP" );
    $str127$_ = makeString( "(" );
    $str128$_ = makeString( ")" );
    $list129 = ConsesLow.list( Characters.CHAR_null, Characters.CHAR_tilde, Characters.CHAR_percent );
    $str130$First = makeString( "First" );
    $str131$Last = makeString( "Last" );
    $const132$compoundString = constant_handles.reader_make_constant_shell( makeString( "compoundString" ) );
    $const133$multiWordString = constant_handles.reader_make_constant_shell( makeString( "multiWordString" ) );
    $const134$headMedialString = constant_handles.reader_make_constant_shell( makeString( "headMedialString" ) );
    $str135$Unable_to_map_headword__s_in_part = makeString( "Unable to map headword ~s in part-of-speech ~s" );
    $str136$Unexpected_lexification_error = makeString( "Unexpected lexification error" );
    $const137$EnglishWord = constant_handles.reader_make_constant_shell( makeString( "EnglishWord" ) );
    $sym138$KE_CREATE_NOW = makeSymbol( "KE-CREATE-NOW" );
    $sym139$TRY_LEX_ASSERT_NOW = makeSymbol( "TRY-LEX-ASSERT-NOW" );
    $sym140$TRY_UNASSERT_NOW = makeSymbol( "TRY-UNASSERT-NOW" );
    $list141 = ConsesLow.list( makeKeyword( "SIMPLE-NOUN" ), makeKeyword( "VERB" ) );
    $sym142$WORD_UNIT = makeSymbol( "WORD-UNIT" );
    $const143$isa = constant_handles.reader_make_constant_shell( makeString( "isa" ) );
    $str144$ = makeString( "" );
    $str145$Missing_lexification_phrase = makeString( "Missing lexification phrase" );
    $str146$Invalid_headword_specification = makeString( "Invalid headword specification" );
    $str147$Missing_part_of_speech = makeString( "Missing part of speech" );
    $sym148$ACCEPTABLE_LEXIFICATION_WORD_UNIT_ = makeSymbol( "ACCEPTABLE-LEXIFICATION-WORD-UNIT?" );
    $list149 = ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "WordWithSuffixFn" ) ), makeKeyword( "ANYTHING" ), ConsesLow.list( makeKeyword( "BIND" ), makeSymbol( "SUFFIX" ) ) );
    $sym150$SUFFIX = makeSymbol( "SUFFIX" );
    $const151$suffixString = constant_handles.reader_make_constant_shell( makeString( "suffixString" ) );
    $str152$Unable_to_make_main_lexical_asser = makeString( "Unable to make main lexical assertion: ~S" );
    $str153$Unable_to_make_other_lexical_asse = makeString( "Unable to make other lexical assertion: ~S" );
    $kw154$PRECISE = makeKeyword( "PRECISE" );
    $const155$genStringAssertion_Precise = constant_handles.reader_make_constant_shell( makeString( "genStringAssertion-Precise" ) );
    $const156$genStringAssertion = constant_handles.reader_make_constant_shell( makeString( "genStringAssertion" ) );
    $const157$ist = constant_handles.reader_make_constant_shell( makeString( "ist" ) );
    $sym158$KE_UNASSERT_ASSERTION_NOW = makeSymbol( "KE-UNASSERT-ASSERTION-NOW" );
    $sym159$KE_UNASSERT_ASSERTION = makeSymbol( "KE-UNASSERT-ASSERTION" );
    $sym160$RELEVANT_MT_IS_EVERYTHING = makeSymbol( "RELEVANT-MT-IS-EVERYTHING" );
    $const161$EverythingPSC = constant_handles.reader_make_constant_shell( makeString( "EverythingPSC" ) );
    $kw162$GAF = makeKeyword( "GAF" );
    $kw163$TRUE = makeKeyword( "TRUE" );
    $kw164$FRESH = makeKeyword( "FRESH" );
    $str165$Lexification_parameters____S__ = makeString( "Lexification parameters:~%~S~%" );
    $const166$CycLReifiableDenotationalTerm = constant_handles.reader_make_constant_shell( makeString( "CycLReifiableDenotationalTerm" ) );
    $sym167$FORT_FOR_STRING = makeSymbol( "FORT-FOR-STRING" );
    $list168 = ConsesLow.list( makeString( "CountNoun" ), makeString( "MassNoun" ), makeString( "Verb" ) );
    $const169$properNameStrings = constant_handles.reader_make_constant_shell( makeString( "properNameStrings" ) );
    $const170$ProperNamePredicate_Strict = constant_handles.reader_make_constant_shell( makeString( "ProperNamePredicate-Strict" ) );
    $list171 = ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "properNameStrings" ) ), constant_handles.reader_make_constant_shell( makeString( "preferredNameString" ) ) );
    $sym172$STRING_FOR_FORT = makeSymbol( "STRING-FOR-FORT" );
    $sym173$MOST_SPECIFIC_ARG1_CONSTRAINT = makeSymbol( "MOST-SPECIFIC-ARG1-CONSTRAINT" );
    $sym174$STRING_ = makeSymbol( "STRING<" );
    $const175$TemplateParsingMt = constant_handles.reader_make_constant_shell( makeString( "TemplateParsingMt" ) );
    $const176$LexicalMicrotheory = constant_handles.reader_make_constant_shell( makeString( "LexicalMicrotheory" ) );
    $const177$InferencePSC = constant_handles.reader_make_constant_shell( makeString( "InferencePSC" ) );
    $const178$LexicalMicrotheory_NonLexWiz = constant_handles.reader_make_constant_shell( makeString( "LexicalMicrotheory-NonLexWiz" ) );
    $str179$Lexification_Wizard_Test = makeString( "Lexification Wizard Test" );
    $str180$_Category = makeString( " Category" );
    $str181$_Suite = makeString( " Suite" );
    $str182$lexification_wizard = makeString( "lexification-wizard" );
  }

  public static final class $lexification_parameters_native
      extends
        SubLStructNative
  {
    public SubLObject $id;
    public SubLObject $term;
    public SubLObject $phrase;
    public SubLObject $mt;
    public SubLObject $is_preferredP;
    public SubLObject $is_properP;
    public SubLObject $nonrelationalP;
    public SubLObject $proper_name_pred;
    public SubLObject $template;
    public SubLObject $template_args;
    public SubLObject $template_speech_parts;
    public SubLObject $ignore_arityP;
    public SubLObject $headword_position;
    public SubLObject $headword_part_of_speech;
    public SubLObject $error_message;
    public SubLObject $state;
    public SubLObject $readyP;
    public SubLObject $formula;
    public SubLObject $user_editedP;
    public SubLObject $user_formula;
    public SubLObject $other_formulas;
    public SubLObject $user_action;
    public SubLObject $parse_template_mt;
    public SubLObject $parse_template;
    public SubLObject $parse_template_formula;
    public SubLObject $lexical_mt;
    public SubLObject $syntactic_mt;
    public SubLObject $generation_mt;
    private static final SubLStructDeclNative structDecl;

    public $lexification_parameters_native()
    {
      this.$id = CommonSymbols.NIL;
      this.$term = CommonSymbols.NIL;
      this.$phrase = CommonSymbols.NIL;
      this.$mt = CommonSymbols.NIL;
      this.$is_preferredP = CommonSymbols.NIL;
      this.$is_properP = CommonSymbols.NIL;
      this.$nonrelationalP = CommonSymbols.NIL;
      this.$proper_name_pred = CommonSymbols.NIL;
      this.$template = CommonSymbols.NIL;
      this.$template_args = CommonSymbols.NIL;
      this.$template_speech_parts = CommonSymbols.NIL;
      this.$ignore_arityP = CommonSymbols.NIL;
      this.$headword_position = CommonSymbols.NIL;
      this.$headword_part_of_speech = CommonSymbols.NIL;
      this.$error_message = CommonSymbols.NIL;
      this.$state = CommonSymbols.NIL;
      this.$readyP = CommonSymbols.NIL;
      this.$formula = CommonSymbols.NIL;
      this.$user_editedP = CommonSymbols.NIL;
      this.$user_formula = CommonSymbols.NIL;
      this.$other_formulas = CommonSymbols.NIL;
      this.$user_action = CommonSymbols.NIL;
      this.$parse_template_mt = CommonSymbols.NIL;
      this.$parse_template = CommonSymbols.NIL;
      this.$parse_template_formula = CommonSymbols.NIL;
      this.$lexical_mt = CommonSymbols.NIL;
      this.$syntactic_mt = CommonSymbols.NIL;
      this.$generation_mt = CommonSymbols.NIL;
    }

    @Override
    public SubLStructDecl getStructDecl()
    {
      return $lexification_parameters_native.structDecl;
    }

    @Override
    public SubLObject getField2()
    {
      return this.$id;
    }

    @Override
    public SubLObject getField3()
    {
      return this.$term;
    }

    @Override
    public SubLObject getField4()
    {
      return this.$phrase;
    }

    @Override
    public SubLObject getField5()
    {
      return this.$mt;
    }

    @Override
    public SubLObject getField6()
    {
      return this.$is_preferredP;
    }

    @Override
    public SubLObject getField7()
    {
      return this.$is_properP;
    }

    @Override
    public SubLObject getField8()
    {
      return this.$nonrelationalP;
    }

    @Override
    public SubLObject getField9()
    {
      return this.$proper_name_pred;
    }

    @Override
    public SubLObject getField10()
    {
      return this.$template;
    }

    @Override
    public SubLObject getField11()
    {
      return this.$template_args;
    }

    @Override
    public SubLObject getField12()
    {
      return this.$template_speech_parts;
    }

    @Override
    public SubLObject getField13()
    {
      return this.$ignore_arityP;
    }

    @Override
    public SubLObject getField14()
    {
      return this.$headword_position;
    }

    @Override
    public SubLObject getField15()
    {
      return this.$headword_part_of_speech;
    }

    @Override
    public SubLObject getField16()
    {
      return this.$error_message;
    }

    @Override
    public SubLObject getField17()
    {
      return this.$state;
    }

    @Override
    public SubLObject getField18()
    {
      return this.$readyP;
    }

    @Override
    public SubLObject getField19()
    {
      return this.$formula;
    }

    @Override
    public SubLObject getField20()
    {
      return this.$user_editedP;
    }

    public SubLObject getField21()
    {
      return this.$user_formula;
    }

    public SubLObject getField22()
    {
      return this.$other_formulas;
    }

    public SubLObject getField23()
    {
      return this.$user_action;
    }

    public SubLObject getField24()
    {
      return this.$parse_template_mt;
    }

    public SubLObject getField25()
    {
      return this.$parse_template;
    }

    public SubLObject getField26()
    {
      return this.$parse_template_formula;
    }

    public SubLObject getField27()
    {
      return this.$lexical_mt;
    }

    public SubLObject getField28()
    {
      return this.$syntactic_mt;
    }

    public SubLObject getField29()
    {
      return this.$generation_mt;
    }

    @Override
    public SubLObject setField2(final SubLObject value)
    {
      return this.$id = value;
    }

    @Override
    public SubLObject setField3(final SubLObject value)
    {
      return this.$term = value;
    }

    @Override
    public SubLObject setField4(final SubLObject value)
    {
      return this.$phrase = value;
    }

    @Override
    public SubLObject setField5(final SubLObject value)
    {
      return this.$mt = value;
    }

    @Override
    public SubLObject setField6(final SubLObject value)
    {
      return this.$is_preferredP = value;
    }

    @Override
    public SubLObject setField7(final SubLObject value)
    {
      return this.$is_properP = value;
    }

    @Override
    public SubLObject setField8(final SubLObject value)
    {
      return this.$nonrelationalP = value;
    }

    @Override
    public SubLObject setField9(final SubLObject value)
    {
      return this.$proper_name_pred = value;
    }

    @Override
    public SubLObject setField10(final SubLObject value)
    {
      return this.$template = value;
    }

    @Override
    public SubLObject setField11(final SubLObject value)
    {
      return this.$template_args = value;
    }

    @Override
    public SubLObject setField12(final SubLObject value)
    {
      return this.$template_speech_parts = value;
    }

    @Override
    public SubLObject setField13(final SubLObject value)
    {
      return this.$ignore_arityP = value;
    }

    @Override
    public SubLObject setField14(final SubLObject value)
    {
      return this.$headword_position = value;
    }

    @Override
    public SubLObject setField15(final SubLObject value)
    {
      return this.$headword_part_of_speech = value;
    }

    @Override
    public SubLObject setField16(final SubLObject value)
    {
      return this.$error_message = value;
    }

    @Override
    public SubLObject setField17(final SubLObject value)
    {
      return this.$state = value;
    }

    @Override
    public SubLObject setField18(final SubLObject value)
    {
      return this.$readyP = value;
    }

    @Override
    public SubLObject setField19(final SubLObject value)
    {
      return this.$formula = value;
    }

    @Override
    public SubLObject setField20(final SubLObject value)
    {
      return this.$user_editedP = value;
    }

    public SubLObject setField21(final SubLObject value)
    {
      return this.$user_formula = value;
    }

    public SubLObject setField22(final SubLObject value)
    {
      return this.$other_formulas = value;
    }

    public SubLObject setField23(final SubLObject value)
    {
      return this.$user_action = value;
    }

    public SubLObject setField24(final SubLObject value)
    {
      return this.$parse_template_mt = value;
    }

    public SubLObject setField25(final SubLObject value)
    {
      return this.$parse_template = value;
    }

    public SubLObject setField26(final SubLObject value)
    {
      return this.$parse_template_formula = value;
    }

    public SubLObject setField27(final SubLObject value)
    {
      return this.$lexical_mt = value;
    }

    public SubLObject setField28(final SubLObject value)
    {
      return this.$syntactic_mt = value;
    }

    public SubLObject setField29(final SubLObject value)
    {
      return this.$generation_mt = value;
    }
    static
    {
      structDecl = Structures.makeStructDeclNative( $lexification_parameters_native.class, $sym0$LEXIFICATION_PARAMETERS, $sym1$LEXIFICATION_PARAMETERS_P, $list2, $list3, new String[] { "$id", "$term", "$phrase", "$mt",
        "$is_preferredP", "$is_properP", "$nonrelationalP", "$proper_name_pred", "$template", "$template_args", "$template_speech_parts", "$ignore_arityP", "$headword_position", "$headword_part_of_speech",
        "$error_message", "$state", "$readyP", "$formula", "$user_editedP", "$user_formula", "$other_formulas", "$user_action", "$parse_template_mt", "$parse_template", "$parse_template_formula", "$lexical_mt",
        "$syntactic_mt", "$generation_mt"
      }, $list4, $list5, $sym6$DEFAULT_STRUCT_PRINT_FUNCTION );
    }
  }

  public static final class $lexification_parameters_p$UnaryFunction
      extends
        UnaryFunction
  {
    public $lexification_parameters_p$UnaryFunction()
    {
      super( SubLTranslatedFile.extractFunctionNamed( "LEXIFICATION-PARAMETERS-P" ) );
    }

    @Override
    public SubLObject processItem(final SubLObject arg1)
    {
      return lexification_parameters_p( arg1 );
    }
  }
}
/*
 * 
 * Total time: 466 ms
 * 
 */