package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.UnaryFunction;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLStructDecl;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLStructDeclNative;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLStructNative;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.visitation;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLSpecialOperatorDeclarations;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Structures;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.compatibility;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Packages;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class subloop_structures
    extends
      SubLTranslatedFile
{
  public static final SubLFile me;
  public static final String myName = "com.cyc.cycjava.cycl.subloop_structures";
  public static final String myFingerPrint = "f04f0b8e7475cdf199586418a2765ffe66dda06b089d44ab98ff1dc678fa508e";
  @SubLTranslatedFile.SubL(source = "cycl/subloop-structures.lisp", position = 885L)
  public static SubLSymbol $dtp_class$;
  @SubLTranslatedFile.SubL(source = "cycl/subloop-structures.lisp", position = 4726L)
  public static SubLSymbol $dtp_instance$;
  @SubLTranslatedFile.SubL(source = "cycl/subloop-structures.lisp", position = 5418L)
  public static SubLSymbol $dtp_interface$;
  @SubLTranslatedFile.SubL(source = "cycl/subloop-structures.lisp", position = 7014L)
  public static SubLSymbol $dtp_method$;
  @SubLTranslatedFile.SubL(source = "cycl/subloop-structures.lisp", position = 8178L)
  private static SubLSymbol $methods_initial_hashtable_size$;
  @SubLTranslatedFile.SubL(source = "cycl/subloop-structures.lisp", position = 8732L)
  public static SubLSymbol $method_trace_on$;
  @SubLTranslatedFile.SubL(source = "cycl/subloop-structures.lisp", position = 8772L)
  public static SubLSymbol $methods_current_method_trace$;
  @SubLTranslatedFile.SubL(source = "cycl/subloop-structures.lisp", position = 8832L)
  public static SubLSymbol $dtp_method_trace$;
  @SubLTranslatedFile.SubL(source = "cycl/subloop-structures.lisp", position = 10175L)
  public static SubLSymbol $dtp_method_info$;
  @SubLTranslatedFile.SubL(source = "cycl/subloop-structures.lisp", position = 10988L)
  public static SubLSymbol $dtp_slot_listener$;
  @SubLTranslatedFile.SubL(source = "cycl/subloop-structures.lisp", position = 12529L)
  public static SubLSymbol $dtp_slot_listener_registry$;
  @SubLTranslatedFile.SubL(source = "cycl/subloop-structures.lisp", position = 13718L)
  public static SubLSymbol $dtp_method_listener$;
  @SubLTranslatedFile.SubL(source = "cycl/subloop-structures.lisp", position = 14768L)
  public static SubLSymbol $dtp_function_detail$;
  @SubLTranslatedFile.SubL(source = "cycl/subloop-structures.lisp", position = 15413L)
  public static SubLSymbol $dtp_method_detail$;
  @SubLTranslatedFile.SubL(source = "cycl/subloop-structures.lisp", position = 16099L)
  public static SubLSymbol $dtp_method_listener_registry$;
  private static final SubLSymbol $sym0$CLASS;
  private static final SubLSymbol $sym1$CLASS_P;
  private static final SubLList $list2;
  private static final SubLList $list3;
  private static final SubLList $list4;
  private static final SubLList $list5;
  private static final SubLSymbol $sym6$PRINT_CLASS;
  private static final SubLInteger $int7$21;
  private static final SubLInteger $int8$22;
  private static final SubLInteger $int9$23;
  private static final SubLInteger $int10$24;
  private static final SubLInteger $int11$25;
  private static final SubLInteger $int12$26;
  private static final SubLInteger $int13$27;
  private static final SubLInteger $int14$28;
  private static final SubLInteger $int15$29;
  private static final SubLSymbol $sym16$CLASS_PRINT_FUNCTION_TRAMPOLINE;
  private static final SubLList $list17;
  private static final SubLSymbol $sym18$CLASS_NAME;
  private static final SubLSymbol $sym19$_CSETF_CLASS_NAME;
  private static final SubLSymbol $sym20$CLASS_PARENT;
  private static final SubLSymbol $sym21$_CSETF_CLASS_PARENT;
  private static final SubLSymbol $sym22$CLASS_SUBCLASSES;
  private static final SubLSymbol $sym23$_CSETF_CLASS_SUBCLASSES;
  private static final SubLSymbol $sym24$CLASS_INTERFACE_NAMES;
  private static final SubLSymbol $sym25$_CSETF_CLASS_INTERFACE_NAMES;
  private static final SubLSymbol $sym26$CLASS_INTERFACES;
  private static final SubLSymbol $sym27$_CSETF_CLASS_INTERFACES;
  private static final SubLSymbol $sym28$CLASS_COMPILED_INHERITANCE_PATH;
  private static final SubLSymbol $sym29$_CSETF_CLASS_COMPILED_INHERITANCE_PATH;
  private static final SubLSymbol $sym30$CLASS_INSTANCE_VAR_DECLS;
  private static final SubLSymbol $sym31$_CSETF_CLASS_INSTANCE_VAR_DECLS;
  private static final SubLSymbol $sym32$CLASS_CLASS_VAR_DECLS;
  private static final SubLSymbol $sym33$_CSETF_CLASS_CLASS_VAR_DECLS;
  private static final SubLSymbol $sym34$CLASS_COMPILED_INSTANCE_SLOT_ACCESS_ALIST;
  private static final SubLSymbol $sym35$_CSETF_CLASS_COMPILED_INSTANCE_SLOT_ACCESS_ALIST;
  private static final SubLSymbol $sym36$CLASS_COMPILED_INSTANCE_BOOLEAN_SLOT_ACCESS_ALIST;
  private static final SubLSymbol $sym37$_CSETF_CLASS_COMPILED_INSTANCE_BOOLEAN_SLOT_ACCESS_ALIST;
  private static final SubLSymbol $sym38$CLASS_COMPILED_CLASS_SLOT_ACCESS_ALIST;
  private static final SubLSymbol $sym39$_CSETF_CLASS_COMPILED_CLASS_SLOT_ACCESS_ALIST;
  private static final SubLSymbol $sym40$CLASS_COMPILED_CLASS_BOOLEAN_SLOT_ACCESS_ALIST;
  private static final SubLSymbol $sym41$_CSETF_CLASS_COMPILED_CLASS_BOOLEAN_SLOT_ACCESS_ALIST;
  private static final SubLSymbol $sym42$CLASS_SLOT_ACCESSOR_ALIST;
  private static final SubLSymbol $sym43$_CSETF_CLASS_SLOT_ACCESSOR_ALIST;
  private static final SubLSymbol $sym44$CLASS_INSTANCE_METHOD_DECLS;
  private static final SubLSymbol $sym45$_CSETF_CLASS_INSTANCE_METHOD_DECLS;
  private static final SubLSymbol $sym46$CLASS_CLASS_METHOD_DECLS;
  private static final SubLSymbol $sym47$_CSETF_CLASS_CLASS_METHOD_DECLS;
  private static final SubLSymbol $sym48$CLASS_BOOLEAN_SLOTS;
  private static final SubLSymbol $sym49$_CSETF_CLASS_BOOLEAN_SLOTS;
  private static final SubLSymbol $sym50$CLASS_ANY_SLOTS;
  private static final SubLSymbol $sym51$_CSETF_CLASS_ANY_SLOTS;
  private static final SubLSymbol $sym52$CLASS_COMPILED_INSTANCE_METHOD_ACCESS_ALIST;
  private static final SubLSymbol $sym53$_CSETF_CLASS_COMPILED_INSTANCE_METHOD_ACCESS_ALIST;
  private static final SubLSymbol $sym54$CLASS_COMPILED_CLASS_METHOD_ACCESS_ALIST;
  private static final SubLSymbol $sym55$_CSETF_CLASS_COMPILED_CLASS_METHOD_ACCESS_ALIST;
  private static final SubLSymbol $sym56$CLASS_TABLIFIED_INSTANCE_METHODS;
  private static final SubLSymbol $sym57$_CSETF_CLASS_TABLIFIED_INSTANCE_METHODS;
  private static final SubLSymbol $sym58$CLASS_DEFINITION_LOCK;
  private static final SubLSymbol $sym59$_CSETF_CLASS_DEFINITION_LOCK;
  private static final SubLSymbol $sym60$CLASS_ACCESS_LOCK;
  private static final SubLSymbol $sym61$_CSETF_CLASS_ACCESS_LOCK;
  private static final SubLSymbol $sym62$CLASS_SYNCHRONIZED_SLOTS_P;
  private static final SubLSymbol $sym63$_CSETF_CLASS_SYNCHRONIZED_SLOTS_P;
  private static final SubLSymbol $sym64$CLASS_PLIST;
  private static final SubLSymbol $sym65$_CSETF_CLASS_PLIST;
  private static final SubLSymbol $sym66$CLASS_CLASS_INITIALIZATION_FUNCTION;
  private static final SubLSymbol $sym67$_CSETF_CLASS_CLASS_INITIALIZATION_FUNCTION;
  private static final SubLSymbol $sym68$CLASS_CLASS_INITIALIZED_P;
  private static final SubLSymbol $sym69$_CSETF_CLASS_CLASS_INITIALIZED_P;
  private static final SubLSymbol $sym70$CLASS_INSTANCE_INITIALIZATION_FUNCTION;
  private static final SubLSymbol $sym71$_CSETF_CLASS_INSTANCE_INITIALIZATION_FUNCTION;
  private static final SubLSymbol $sym72$CLASS_CLASS_PROPERTIES;
  private static final SubLSymbol $sym73$_CSETF_CLASS_CLASS_PROPERTIES;
  private static final SubLSymbol $kw74$NAME;
  private static final SubLSymbol $kw75$PARENT;
  private static final SubLSymbol $kw76$SUBCLASSES;
  private static final SubLSymbol $kw77$INTERFACE_NAMES;
  private static final SubLSymbol $kw78$INTERFACES;
  private static final SubLSymbol $kw79$COMPILED_INHERITANCE_PATH;
  private static final SubLSymbol $kw80$INSTANCE_VAR_DECLS;
  private static final SubLSymbol $kw81$CLASS_VAR_DECLS;
  private static final SubLSymbol $kw82$COMPILED_INSTANCE_SLOT_ACCESS_ALIST;
  private static final SubLSymbol $kw83$COMPILED_INSTANCE_BOOLEAN_SLOT_ACCESS_ALIST;
  private static final SubLSymbol $kw84$COMPILED_CLASS_SLOT_ACCESS_ALIST;
  private static final SubLSymbol $kw85$COMPILED_CLASS_BOOLEAN_SLOT_ACCESS_ALIST;
  private static final SubLSymbol $kw86$SLOT_ACCESSOR_ALIST;
  private static final SubLSymbol $kw87$INSTANCE_METHOD_DECLS;
  private static final SubLSymbol $kw88$CLASS_METHOD_DECLS;
  private static final SubLSymbol $kw89$BOOLEAN_SLOTS;
  private static final SubLSymbol $kw90$ANY_SLOTS;
  private static final SubLSymbol $kw91$COMPILED_INSTANCE_METHOD_ACCESS_ALIST;
  private static final SubLSymbol $kw92$COMPILED_CLASS_METHOD_ACCESS_ALIST;
  private static final SubLSymbol $kw93$TABLIFIED_INSTANCE_METHODS;
  private static final SubLSymbol $kw94$DEFINITION_LOCK;
  private static final SubLSymbol $kw95$ACCESS_LOCK;
  private static final SubLSymbol $kw96$SYNCHRONIZED_SLOTS_P;
  private static final SubLSymbol $kw97$PLIST;
  private static final SubLSymbol $kw98$CLASS_INITIALIZATION_FUNCTION;
  private static final SubLSymbol $kw99$CLASS_INITIALIZED_P;
  private static final SubLSymbol $kw100$INSTANCE_INITIALIZATION_FUNCTION;
  private static final SubLSymbol $kw101$CLASS_PROPERTIES;
  private static final SubLString $str102$Invalid_slot__S_for_construction_;
  private static final SubLSymbol $kw103$BEGIN;
  private static final SubLSymbol $sym104$MAKE_CLASS;
  private static final SubLSymbol $kw105$SLOT;
  private static final SubLSymbol $kw106$END;
  private static final SubLSymbol $sym107$VISIT_DEFSTRUCT_OBJECT_CLASS_METHOD;
  private static final SubLList $list108;
  private static final SubLString $str109$class;
  private static final SubLSymbol $sym110$CLASS_;
  private static final SubLList $list111;
  private static final SubLString $str112$__CLASS__S_;
  private static final SubLList $list113;
  private static final SubLString $str114$SUBLOOP_CLASS_PROPERTY_;
  private static final SubLString $str115$GET_;
  private static final SubLString $str116$SET_;
  private static final SubLSymbol $sym117$PROGN;
  private static final SubLSymbol $sym118$DEFINE_PROTECTED;
  private static final SubLList $list119;
  private static final SubLSymbol $sym120$RET;
  private static final SubLSymbol $sym121$LDB_TEST;
  private static final SubLSymbol $sym122$BYTE;
  private static final SubLList $list123;
  private static final SubLList $list124;
  private static final SubLSymbol $sym125$CSETF;
  private static final SubLList $list126;
  private static final SubLSymbol $sym127$DPB;
  private static final SubLList $list128;
  private static final SubLList $list129;
  private static final SubLSymbol $sym130$INSTANCE;
  private static final SubLSymbol $sym131$INSTANCE_P;
  private static final SubLList $list132;
  private static final SubLList $list133;
  private static final SubLList $list134;
  private static final SubLList $list135;
  private static final SubLSymbol $sym136$PRINT_INSTANCE;
  private static final SubLSymbol $sym137$INSTANCE_PRINT_FUNCTION_TRAMPOLINE;
  private static final SubLList $list138;
  private static final SubLSymbol $sym139$INSTANCE_CLASS;
  private static final SubLSymbol $sym140$_CSETF_INSTANCE_CLASS;
  private static final SubLSymbol $sym141$INSTANCE_BOOLEAN_SLOTS;
  private static final SubLSymbol $sym142$_CSETF_INSTANCE_BOOLEAN_SLOTS;
  private static final SubLSymbol $sym143$INSTANCE_ANY_SLOTS;
  private static final SubLSymbol $sym144$_CSETF_INSTANCE_ANY_SLOTS;
  private static final SubLSymbol $sym145$INSTANCE_PLIST;
  private static final SubLSymbol $sym146$_CSETF_INSTANCE_PLIST;
  private static final SubLSymbol $kw147$CLASS;
  private static final SubLSymbol $sym148$MAKE_INSTANCE;
  private static final SubLSymbol $sym149$VISIT_DEFSTRUCT_OBJECT_INSTANCE_METHOD;
  private static final SubLList $list150;
  private static final SubLString $str151$instance;
  private static final SubLSymbol $sym152$INSTANCE_;
  private static final SubLSymbol $sym153$OBJECT;
  private static final SubLSymbol $sym154$PRINT;
  private static final SubLString $str155$__Instance_of__S_;
  private static final SubLSymbol $sym156$INTERFACE;
  private static final SubLSymbol $sym157$INTERFACE_P;
  private static final SubLList $list158;
  private static final SubLList $list159;
  private static final SubLList $list160;
  private static final SubLList $list161;
  private static final SubLSymbol $sym162$PRINT_INTERFACE;
  private static final SubLSymbol $sym163$INTERFACE_PRINT_FUNCTION_TRAMPOLINE;
  private static final SubLList $list164;
  private static final SubLSymbol $sym165$INTERFACE_NAME;
  private static final SubLSymbol $sym166$_CSETF_INTERFACE_NAME;
  private static final SubLSymbol $sym167$INTERFACE_PARENTS;
  private static final SubLSymbol $sym168$_CSETF_INTERFACE_PARENTS;
  private static final SubLSymbol $sym169$INTERFACE_COMPILED_INHERITANCE_PATH;
  private static final SubLSymbol $sym170$_CSETF_INTERFACE_COMPILED_INHERITANCE_PATH;
  private static final SubLSymbol $sym171$INTERFACE_SUBINTERFACES;
  private static final SubLSymbol $sym172$_CSETF_INTERFACE_SUBINTERFACES;
  private static final SubLSymbol $sym173$INTERFACE_IMPLEMENTERS;
  private static final SubLSymbol $sym174$_CSETF_INTERFACE_IMPLEMENTERS;
  private static final SubLSymbol $sym175$INTERFACE_INSTANCE_METHOD_DECLS;
  private static final SubLSymbol $sym176$_CSETF_INTERFACE_INSTANCE_METHOD_DECLS;
  private static final SubLSymbol $sym177$INTERFACE_CLASS_METHOD_DECLS;
  private static final SubLSymbol $sym178$_CSETF_INTERFACE_CLASS_METHOD_DECLS;
  private static final SubLSymbol $sym179$INTERFACE_COMPILED_INSTANCE_METHOD_DECLS;
  private static final SubLSymbol $sym180$_CSETF_INTERFACE_COMPILED_INSTANCE_METHOD_DECLS;
  private static final SubLSymbol $sym181$INTERFACE_COMPILED_CLASS_METHOD_DECLS;
  private static final SubLSymbol $sym182$_CSETF_INTERFACE_COMPILED_CLASS_METHOD_DECLS;
  private static final SubLSymbol $sym183$INTERFACE_LOCAL_CLASS_METHODS;
  private static final SubLSymbol $sym184$_CSETF_INTERFACE_LOCAL_CLASS_METHODS;
  private static final SubLSymbol $sym185$INTERFACE_LOCAL_INSTANCE_METHODS;
  private static final SubLSymbol $sym186$_CSETF_INTERFACE_LOCAL_INSTANCE_METHODS;
  private static final SubLSymbol $sym187$INTERFACE_MARK_LIST;
  private static final SubLSymbol $sym188$_CSETF_INTERFACE_MARK_LIST;
  private static final SubLSymbol $sym189$INTERFACE_PLIST;
  private static final SubLSymbol $sym190$_CSETF_INTERFACE_PLIST;
  private static final SubLSymbol $sym191$INTERFACE_DEFINITION_LOCK;
  private static final SubLSymbol $sym192$_CSETF_INTERFACE_DEFINITION_LOCK;
  private static final SubLSymbol $kw193$PARENTS;
  private static final SubLSymbol $kw194$SUBINTERFACES;
  private static final SubLSymbol $kw195$IMPLEMENTERS;
  private static final SubLSymbol $kw196$COMPILED_INSTANCE_METHOD_DECLS;
  private static final SubLSymbol $kw197$COMPILED_CLASS_METHOD_DECLS;
  private static final SubLSymbol $kw198$LOCAL_CLASS_METHODS;
  private static final SubLSymbol $kw199$LOCAL_INSTANCE_METHODS;
  private static final SubLSymbol $kw200$MARK_LIST;
  private static final SubLSymbol $sym201$MAKE_INTERFACE;
  private static final SubLSymbol $sym202$VISIT_DEFSTRUCT_OBJECT_INTERFACE_METHOD;
  private static final SubLList $list203;
  private static final SubLString $str204$interface;
  private static final SubLSymbol $sym205$INTERFACE_;
  private static final SubLList $list206;
  private static final SubLString $str207$__Interface__S_PARENTS___S_;
  private static final SubLSymbol $sym208$METHOD;
  private static final SubLSymbol $sym209$METHOD_P;
  private static final SubLList $list210;
  private static final SubLList $list211;
  private static final SubLList $list212;
  private static final SubLList $list213;
  private static final SubLSymbol $sym214$PRINT_METHOD;
  private static final SubLSymbol $sym215$METHOD_PRINT_FUNCTION_TRAMPOLINE;
  private static final SubLList $list216;
  private static final SubLSymbol $sym217$METHOD_NAME;
  private static final SubLSymbol $sym218$_CSETF_METHOD_NAME;
  private static final SubLSymbol $sym219$METHOD_CLASS_NAME;
  private static final SubLSymbol $sym220$_CSETF_METHOD_CLASS_NAME;
  private static final SubLSymbol $sym221$METHOD_LAMBDA_LIST;
  private static final SubLSymbol $sym222$_CSETF_METHOD_LAMBDA_LIST;
  private static final SubLSymbol $sym223$METHOD_BODY;
  private static final SubLSymbol $sym224$_CSETF_METHOD_BODY;
  private static final SubLSymbol $sym225$METHOD_PROTECTION;
  private static final SubLSymbol $sym226$_CSETF_METHOD_PROTECTION;
  private static final SubLSymbol $sym227$METHOD_SCOPE;
  private static final SubLSymbol $sym228$_CSETF_METHOD_SCOPE;
  private static final SubLSymbol $sym229$METHOD_UPDATE_TYPE;
  private static final SubLSymbol $sym230$_CSETF_METHOD_UPDATE_TYPE;
  private static final SubLSymbol $sym231$METHOD_FUNCTION_NAME;
  private static final SubLSymbol $sym232$_CSETF_METHOD_FUNCTION_NAME;
  private static final SubLSymbol $sym233$METHOD_FUNCTION_DEF;
  private static final SubLSymbol $sym234$_CSETF_METHOD_FUNCTION_DEF;
  private static final SubLSymbol $sym235$METHOD_BEFORE_LISTENERS;
  private static final SubLSymbol $sym236$_CSETF_METHOD_BEFORE_LISTENERS;
  private static final SubLSymbol $sym237$METHOD_AFTER_LISTENERS;
  private static final SubLSymbol $sym238$_CSETF_METHOD_AFTER_LISTENERS;
  private static final SubLSymbol $sym239$METHOD_INSTANTIATE_TEMPLATE;
  private static final SubLSymbol $sym240$_CSETF_METHOD_INSTANTIATE_TEMPLATE;
  private static final SubLSymbol $kw241$CLASS_NAME;
  private static final SubLSymbol $kw242$LAMBDA_LIST;
  private static final SubLSymbol $kw243$BODY;
  private static final SubLSymbol $kw244$PROTECTION;
  private static final SubLSymbol $kw245$SCOPE;
  private static final SubLSymbol $kw246$UPDATE_TYPE;
  private static final SubLSymbol $kw247$FUNCTION_NAME;
  private static final SubLSymbol $kw248$FUNCTION_DEF;
  private static final SubLSymbol $kw249$BEFORE_LISTENERS;
  private static final SubLSymbol $kw250$AFTER_LISTENERS;
  private static final SubLSymbol $kw251$INSTANTIATE_TEMPLATE;
  private static final SubLSymbol $sym252$MAKE_METHOD;
  private static final SubLSymbol $sym253$VISIT_DEFSTRUCT_OBJECT_METHOD_METHOD;
  private static final SubLList $list254;
  private static final SubLString $str255$method;
  private static final SubLSymbol $sym256$METHOD_;
  private static final SubLString $str257$__METHOD____S__S___S_;
  private static final SubLInteger $int258$100;
  private static final SubLSymbol $sym259$METHOD_TRACE;
  private static final SubLSymbol $sym260$METHOD_TRACE_P;
  private static final SubLList $list261;
  private static final SubLList $list262;
  private static final SubLList $list263;
  private static final SubLList $list264;
  private static final SubLSymbol $sym265$PRINT_METHOD_TRACE;
  private static final SubLSymbol $sym266$METHOD_TRACE_PRINT_FUNCTION_TRAMPOLINE;
  private static final SubLList $list267;
  private static final SubLSymbol $sym268$METHOD_TRACE_NAME;
  private static final SubLSymbol $sym269$_CSETF_METHOD_TRACE_NAME;
  private static final SubLSymbol $sym270$METHOD_TRACE_CLASS_NAME;
  private static final SubLSymbol $sym271$_CSETF_METHOD_TRACE_CLASS_NAME;
  private static final SubLSymbol $sym272$METHOD_TRACE_FUNCTION;
  private static final SubLSymbol $sym273$_CSETF_METHOD_TRACE_FUNCTION;
  private static final SubLSymbol $sym274$METHOD_TRACE_OUTER;
  private static final SubLSymbol $sym275$_CSETF_METHOD_TRACE_OUTER;
  private static final SubLSymbol $kw276$FUNCTION;
  private static final SubLSymbol $kw277$OUTER;
  private static final SubLSymbol $sym278$MAKE_METHOD_TRACE;
  private static final SubLSymbol $sym279$VISIT_DEFSTRUCT_OBJECT_METHOD_TRACE_METHOD;
  private static final SubLList $list280;
  private static final SubLString $str281$method_trace;
  private static final SubLSymbol $sym282$METHOD_TRACE_;
  private static final SubLString $str283$__METHOD_TRACE____S__S__;
  private static final SubLSymbol $sym284$METHOD_INFO;
  private static final SubLSymbol $sym285$METHOD_INFO_P;
  private static final SubLList $list286;
  private static final SubLList $list287;
  private static final SubLList $list288;
  private static final SubLList $list289;
  private static final SubLSymbol $sym290$DEFAULT_STRUCT_PRINT_FUNCTION;
  private static final SubLSymbol $sym291$METHOD_INFO_PRINT_FUNCTION_TRAMPOLINE;
  private static final SubLList $list292;
  private static final SubLSymbol $sym293$MI_METHOD_NAME;
  private static final SubLSymbol $sym294$_CSETF_MI_METHOD_NAME;
  private static final SubLSymbol $sym295$MI_CLASS_NAME;
  private static final SubLSymbol $sym296$_CSETF_MI_CLASS_NAME;
  private static final SubLSymbol $sym297$MI_MV_USED_IN_BODY;
  private static final SubLSymbol $sym298$_CSETF_MI_MV_USED_IN_BODY;
  private static final SubLSymbol $sym299$MI_MV_MODIFIED_IN_BODY;
  private static final SubLSymbol $sym300$_CSETF_MI_MV_MODIFIED_IN_BODY;
  private static final SubLSymbol $sym301$MI_METHODS_USED_IN_BODY;
  private static final SubLSymbol $sym302$_CSETF_MI_METHODS_USED_IN_BODY;
  private static final SubLSymbol $kw303$METHOD_NAME;
  private static final SubLSymbol $kw304$MV_USED_IN_BODY;
  private static final SubLSymbol $kw305$MV_MODIFIED_IN_BODY;
  private static final SubLSymbol $kw306$METHODS_USED_IN_BODY;
  private static final SubLSymbol $sym307$MAKE_METHOD_INFO;
  private static final SubLSymbol $sym308$VISIT_DEFSTRUCT_OBJECT_METHOD_INFO_METHOD;
  private static final SubLList $list309;
  private static final SubLString $str310$method_info;
  private static final SubLSymbol $sym311$MI_;
  private static final SubLSymbol $sym312$SLOT_LISTENER;
  private static final SubLSymbol $sym313$SLOT_LISTENER_P;
  private static final SubLList $list314;
  private static final SubLList $list315;
  private static final SubLList $list316;
  private static final SubLList $list317;
  private static final SubLSymbol $sym318$PRINT_SLOT_LISTENER;
  private static final SubLSymbol $sym319$SLOT_LISTENER_PRINT_FUNCTION_TRAMPOLINE;
  private static final SubLList $list320;
  private static final SubLSymbol $sym321$SL_SLOT_NAME;
  private static final SubLSymbol $sym322$_CSETF_SL_SLOT_NAME;
  private static final SubLSymbol $sym323$SL_DEMON_TYPE;
  private static final SubLSymbol $sym324$_CSETF_SL_DEMON_TYPE;
  private static final SubLSymbol $sym325$SL_VALUE_TRIGGER;
  private static final SubLSymbol $sym326$_CSETF_SL_VALUE_TRIGGER;
  private static final SubLSymbol $sym327$SL_FUNCTIONAL_TYPE;
  private static final SubLSymbol $sym328$_CSETF_SL_FUNCTIONAL_TYPE;
  private static final SubLSymbol $sym329$SL_ISA_METHOD;
  private static final SubLSymbol $sym330$_CSETF_SL_ISA_METHOD;
  private static final SubLSymbol $sym331$SL_TARGET_INSTANCE;
  private static final SubLSymbol $sym332$_CSETF_SL_TARGET_INSTANCE;
  private static final SubLSymbol $kw333$SLOT_NAME;
  private static final SubLSymbol $kw334$DEMON_TYPE;
  private static final SubLSymbol $kw335$VALUE_TRIGGER;
  private static final SubLSymbol $kw336$FUNCTIONAL_TYPE;
  private static final SubLSymbol $kw337$ISA_METHOD;
  private static final SubLSymbol $kw338$TARGET_INSTANCE;
  private static final SubLSymbol $sym339$MAKE_SLOT_LISTENER;
  private static final SubLSymbol $sym340$VISIT_DEFSTRUCT_OBJECT_SLOT_LISTENER_METHOD;
  private static final SubLString $str341$__SLOT_LISTENER_for_Slot__S___S__;
  private static final SubLList $list342;
  private static final SubLString $str343$slot_listener;
  private static final SubLSymbol $sym344$SL_;
  private static final SubLSymbol $sym345$SLOT_LISTENER_REGISTRY;
  private static final SubLSymbol $sym346$SLOT_LISTENER_REGISTRY_P;
  private static final SubLList $list347;
  private static final SubLList $list348;
  private static final SubLList $list349;
  private static final SubLList $list350;
  private static final SubLSymbol $sym351$SLOT_LISTENER_REGISTRY_PRINT_FUNCTION_TRAMPOLINE;
  private static final SubLList $list352;
  private static final SubLSymbol $sym353$SLR_INSTANCE;
  private static final SubLSymbol $sym354$_CSETF_SLR_INSTANCE;
  private static final SubLSymbol $sym355$SLR_SLOT_COUNT;
  private static final SubLSymbol $sym356$_CSETF_SLR_SLOT_COUNT;
  private static final SubLSymbol $sym357$SLR_LISTENERS_VECTOR;
  private static final SubLSymbol $sym358$_CSETF_SLR_LISTENERS_VECTOR;
  private static final SubLSymbol $kw359$INSTANCE;
  private static final SubLSymbol $kw360$SLOT_COUNT;
  private static final SubLSymbol $kw361$LISTENERS_VECTOR;
  private static final SubLSymbol $sym362$MAKE_SLOT_LISTENER_REGISTRY;
  private static final SubLSymbol $sym363$VISIT_DEFSTRUCT_OBJECT_SLOT_LISTENER_REGISTRY_METHOD;
  private static final SubLString $str364$__SLOT_LISTENER_REGISTRY___S__SLO;
  private static final SubLList $list365;
  private static final SubLString $str366$slot_listener_registry;
  private static final SubLSymbol $sym367$SLR_;
  private static final SubLSymbol $sym368$METHOD_LISTENER;
  private static final SubLSymbol $sym369$METHOD_LISTENER_P;
  private static final SubLList $list370;
  private static final SubLList $list371;
  private static final SubLList $list372;
  private static final SubLList $list373;
  private static final SubLSymbol $sym374$PRINT_METHOD_LISTENER;
  private static final SubLSymbol $sym375$METHOD_LISTENER_PRINT_FUNCTION_TRAMPOLINE;
  private static final SubLList $list376;
  private static final SubLSymbol $sym377$ML_OWNING_METHOD_NAME;
  private static final SubLSymbol $sym378$_CSETF_ML_OWNING_METHOD_NAME;
  private static final SubLSymbol $sym379$ML_OWNING_CLASS_NAME;
  private static final SubLSymbol $sym380$_CSETF_ML_OWNING_CLASS_NAME;
  private static final SubLSymbol $sym381$ML_DEMON_TYPE;
  private static final SubLSymbol $sym382$_CSETF_ML_DEMON_TYPE;
  private static final SubLSymbol $sym383$ML_DETAIL;
  private static final SubLSymbol $sym384$_CSETF_ML_DETAIL;
  private static final SubLSymbol $kw385$OWNING_METHOD_NAME;
  private static final SubLSymbol $kw386$OWNING_CLASS_NAME;
  private static final SubLSymbol $kw387$DETAIL;
  private static final SubLSymbol $sym388$MAKE_METHOD_LISTENER;
  private static final SubLSymbol $sym389$VISIT_DEFSTRUCT_OBJECT_METHOD_LISTENER_METHOD;
  private static final SubLList $list390;
  private static final SubLString $str391$method_listener;
  private static final SubLSymbol $sym392$ML_;
  private static final SubLSymbol $sym393$FUNCTION_DETAIL;
  private static final SubLSymbol $sym394$FUNCTION_DETAIL_P;
  private static final SubLList $list395;
  private static final SubLList $list396;
  private static final SubLList $list397;
  private static final SubLList $list398;
  private static final SubLSymbol $sym399$FUNCTION_DETAIL_PRINT_FUNCTION_TRAMPOLINE;
  private static final SubLList $list400;
  private static final SubLSymbol $sym401$FD_FUNCTION_NAME;
  private static final SubLSymbol $sym402$_CSETF_FD_FUNCTION_NAME;
  private static final SubLSymbol $sym403$FD_ARGLIST;
  private static final SubLSymbol $sym404$_CSETF_FD_ARGLIST;
  private static final SubLSymbol $kw405$ARGLIST;
  private static final SubLSymbol $sym406$MAKE_FUNCTION_DETAIL;
  private static final SubLSymbol $sym407$VISIT_DEFSTRUCT_OBJECT_FUNCTION_DETAIL_METHOD;
  private static final SubLList $list408;
  private static final SubLString $str409$function_detail;
  private static final SubLSymbol $sym410$FD_;
  private static final SubLSymbol $sym411$METHOD_DETAIL;
  private static final SubLSymbol $sym412$METHOD_DETAIL_P;
  private static final SubLList $list413;
  private static final SubLList $list414;
  private static final SubLList $list415;
  private static final SubLList $list416;
  private static final SubLSymbol $sym417$METHOD_DETAIL_PRINT_FUNCTION_TRAMPOLINE;
  private static final SubLList $list418;
  private static final SubLSymbol $sym419$MD_METHOD_NAME;
  private static final SubLSymbol $sym420$_CSETF_MD_METHOD_NAME;
  private static final SubLSymbol $sym421$MD_FUNCTION_NAME;
  private static final SubLSymbol $sym422$_CSETF_MD_FUNCTION_NAME;
  private static final SubLSymbol $sym423$MD_ARGLIST;
  private static final SubLSymbol $sym424$_CSETF_MD_ARGLIST;
  private static final SubLSymbol $sym425$MD_INSTANCE;
  private static final SubLSymbol $sym426$_CSETF_MD_INSTANCE;
  private static final SubLSymbol $sym427$MAKE_METHOD_DETAIL;
  private static final SubLSymbol $sym428$VISIT_DEFSTRUCT_OBJECT_METHOD_DETAIL_METHOD;
  private static final SubLList $list429;
  private static final SubLString $str430$method_detail;
  private static final SubLSymbol $sym431$MD_;
  private static final SubLSymbol $sym432$METHOD_LISTENER_REGISTRY;
  private static final SubLSymbol $sym433$METHOD_LISTENER_REGISTRY_P;
  private static final SubLList $list434;
  private static final SubLList $list435;
  private static final SubLList $list436;
  private static final SubLList $list437;
  private static final SubLSymbol $sym438$METHOD_LISTENER_REGISTRY_PRINT_FUNCTION_TRAMPOLINE;
  private static final SubLList $list439;
  private static final SubLSymbol $sym440$MLR_INSTANCE;
  private static final SubLSymbol $sym441$_CSETF_MLR_INSTANCE;
  private static final SubLSymbol $sym442$MLR_LISTENER_ALIST;
  private static final SubLSymbol $sym443$_CSETF_MLR_LISTENER_ALIST;
  private static final SubLSymbol $kw444$LISTENER_ALIST;
  private static final SubLSymbol $sym445$MAKE_METHOD_LISTENER_REGISTRY;
  private static final SubLSymbol $sym446$VISIT_DEFSTRUCT_OBJECT_METHOD_LISTENER_REGISTRY_METHOD;
  private static final SubLList $list447;
  private static final SubLString $str448$method_listener_registry;
  private static final SubLSymbol $sym449$MLR_;
  private static final SubLString $str450$__METHOD_LISTENER____S__S_;
  private static final SubLString $str451$_monitored_by_function__S_;
  private static final SubLString $str452$_monitored_by_method___S__S__;
  private static final SubLString $str453$_;

  @SubLTranslatedFile.SubL(source = "cycl/subloop-structures.lisp", position = 885L)
  public static SubLObject class_print_function_trampoline(final SubLObject v_object, final SubLObject stream)
  {
    print_class( v_object, stream, ZERO_INTEGER );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/subloop-structures.lisp", position = 885L)
  public static SubLObject class_p(final SubLObject v_object)
  {
    return ( v_object.getClass() == $class_native.class ) ? T : NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/subloop-structures.lisp", position = 885L)
  public static SubLObject class_name(final SubLObject v_object)
  {
    assert NIL != class_p( v_object ) : v_object;
    return v_object.getField2();
  }

  @SubLTranslatedFile.SubL(source = "cycl/subloop-structures.lisp", position = 885L)
  public static SubLObject class_parent(final SubLObject v_object)
  {
    assert NIL != class_p( v_object ) : v_object;
    return v_object.getField3();
  }

  @SubLTranslatedFile.SubL(source = "cycl/subloop-structures.lisp", position = 885L)
  public static SubLObject class_subclasses(final SubLObject v_object)
  {
    assert NIL != class_p( v_object ) : v_object;
    return v_object.getField4();
  }

  @SubLTranslatedFile.SubL(source = "cycl/subloop-structures.lisp", position = 885L)
  public static SubLObject class_interface_names(final SubLObject v_object)
  {
    assert NIL != class_p( v_object ) : v_object;
    return v_object.getField5();
  }

  @SubLTranslatedFile.SubL(source = "cycl/subloop-structures.lisp", position = 885L)
  public static SubLObject class_interfaces(final SubLObject v_object)
  {
    assert NIL != class_p( v_object ) : v_object;
    return v_object.getField6();
  }

  @SubLTranslatedFile.SubL(source = "cycl/subloop-structures.lisp", position = 885L)
  public static SubLObject class_compiled_inheritance_path(final SubLObject v_object)
  {
    assert NIL != class_p( v_object ) : v_object;
    return v_object.getField7();
  }

  @SubLTranslatedFile.SubL(source = "cycl/subloop-structures.lisp", position = 885L)
  public static SubLObject class_instance_var_decls(final SubLObject v_object)
  {
    assert NIL != class_p( v_object ) : v_object;
    return v_object.getField8();
  }

  @SubLTranslatedFile.SubL(source = "cycl/subloop-structures.lisp", position = 885L)
  public static SubLObject class_class_var_decls(final SubLObject v_object)
  {
    assert NIL != class_p( v_object ) : v_object;
    return v_object.getField9();
  }

  @SubLTranslatedFile.SubL(source = "cycl/subloop-structures.lisp", position = 885L)
  public static SubLObject class_compiled_instance_slot_access_alist(final SubLObject v_object)
  {
    assert NIL != class_p( v_object ) : v_object;
    return v_object.getField10();
  }

  @SubLTranslatedFile.SubL(source = "cycl/subloop-structures.lisp", position = 885L)
  public static SubLObject class_compiled_instance_boolean_slot_access_alist(final SubLObject v_object)
  {
    assert NIL != class_p( v_object ) : v_object;
    return v_object.getField11();
  }

  @SubLTranslatedFile.SubL(source = "cycl/subloop-structures.lisp", position = 885L)
  public static SubLObject class_compiled_class_slot_access_alist(final SubLObject v_object)
  {
    assert NIL != class_p( v_object ) : v_object;
    return v_object.getField12();
  }

  @SubLTranslatedFile.SubL(source = "cycl/subloop-structures.lisp", position = 885L)
  public static SubLObject class_compiled_class_boolean_slot_access_alist(final SubLObject v_object)
  {
    assert NIL != class_p( v_object ) : v_object;
    return v_object.getField13();
  }

  @SubLTranslatedFile.SubL(source = "cycl/subloop-structures.lisp", position = 885L)
  public static SubLObject class_slot_accessor_alist(final SubLObject v_object)
  {
    assert NIL != class_p( v_object ) : v_object;
    return v_object.getField14();
  }

  @SubLTranslatedFile.SubL(source = "cycl/subloop-structures.lisp", position = 885L)
  public static SubLObject class_instance_method_decls(final SubLObject v_object)
  {
    assert NIL != class_p( v_object ) : v_object;
    return v_object.getField15();
  }

  @SubLTranslatedFile.SubL(source = "cycl/subloop-structures.lisp", position = 885L)
  public static SubLObject class_class_method_decls(final SubLObject v_object)
  {
    assert NIL != class_p( v_object ) : v_object;
    return v_object.getField16();
  }

  @SubLTranslatedFile.SubL(source = "cycl/subloop-structures.lisp", position = 885L)
  public static SubLObject class_boolean_slots(final SubLObject v_object)
  {
    assert NIL != class_p( v_object ) : v_object;
    return v_object.getField17();
  }

  @SubLTranslatedFile.SubL(source = "cycl/subloop-structures.lisp", position = 885L)
  public static SubLObject class_any_slots(final SubLObject v_object)
  {
    assert NIL != class_p( v_object ) : v_object;
    return v_object.getField18();
  }

  @SubLTranslatedFile.SubL(source = "cycl/subloop-structures.lisp", position = 885L)
  public static SubLObject class_compiled_instance_method_access_alist(final SubLObject v_object)
  {
    assert NIL != class_p( v_object ) : v_object;
    return v_object.getField19();
  }

  @SubLTranslatedFile.SubL(source = "cycl/subloop-structures.lisp", position = 885L)
  public static SubLObject class_compiled_class_method_access_alist(final SubLObject v_object)
  {
    assert NIL != class_p( v_object ) : v_object;
    return v_object.getField20();
  }

  @SubLTranslatedFile.SubL(source = "cycl/subloop-structures.lisp", position = 885L)
  public static SubLObject class_tablified_instance_methods(final SubLObject v_object)
  {
    assert NIL != class_p( v_object ) : v_object;
    return ( ($class_native) v_object ).$tablified_instance_methods;
  }

  @SubLTranslatedFile.SubL(source = "cycl/subloop-structures.lisp", position = 885L)
  public static SubLObject class_definition_lock(final SubLObject v_object)
  {
    assert NIL != class_p( v_object ) : v_object;
    return ( ($class_native) v_object ).$definition_lock;
  }

  @SubLTranslatedFile.SubL(source = "cycl/subloop-structures.lisp", position = 885L)
  public static SubLObject class_access_lock(final SubLObject v_object)
  {
    assert NIL != class_p( v_object ) : v_object;
    return ( ($class_native) v_object ).$access_lock;
  }

  @SubLTranslatedFile.SubL(source = "cycl/subloop-structures.lisp", position = 885L)
  public static SubLObject class_synchronized_slots_p(final SubLObject v_object)
  {
    assert NIL != class_p( v_object ) : v_object;
    return ( ($class_native) v_object ).$synchronized_slots_p;
  }

  @SubLTranslatedFile.SubL(source = "cycl/subloop-structures.lisp", position = 885L)
  public static SubLObject class_plist(final SubLObject v_object)
  {
    assert NIL != class_p( v_object ) : v_object;
    return ( ($class_native) v_object ).$plist;
  }

  @SubLTranslatedFile.SubL(source = "cycl/subloop-structures.lisp", position = 885L)
  public static SubLObject class_class_initialization_function(final SubLObject v_object)
  {
    assert NIL != class_p( v_object ) : v_object;
    return ( ($class_native) v_object ).$class_initialization_function;
  }

  @SubLTranslatedFile.SubL(source = "cycl/subloop-structures.lisp", position = 885L)
  public static SubLObject class_class_initialized_p(final SubLObject v_object)
  {
    assert NIL != class_p( v_object ) : v_object;
    return ( ($class_native) v_object ).$class_initialized_p;
  }

  @SubLTranslatedFile.SubL(source = "cycl/subloop-structures.lisp", position = 885L)
  public static SubLObject class_instance_initialization_function(final SubLObject v_object)
  {
    assert NIL != class_p( v_object ) : v_object;
    return ( ($class_native) v_object ).$instance_initialization_function;
  }

  @SubLTranslatedFile.SubL(source = "cycl/subloop-structures.lisp", position = 885L)
  public static SubLObject class_class_properties(final SubLObject v_object)
  {
    assert NIL != class_p( v_object ) : v_object;
    return ( ($class_native) v_object ).$class_properties;
  }

  @SubLTranslatedFile.SubL(source = "cycl/subloop-structures.lisp", position = 885L)
  public static SubLObject _csetf_class_name(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != class_p( v_object ) : v_object;
    return v_object.setField2( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/subloop-structures.lisp", position = 885L)
  public static SubLObject _csetf_class_parent(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != class_p( v_object ) : v_object;
    return v_object.setField3( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/subloop-structures.lisp", position = 885L)
  public static SubLObject _csetf_class_subclasses(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != class_p( v_object ) : v_object;
    return v_object.setField4( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/subloop-structures.lisp", position = 885L)
  public static SubLObject _csetf_class_interface_names(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != class_p( v_object ) : v_object;
    return v_object.setField5( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/subloop-structures.lisp", position = 885L)
  public static SubLObject _csetf_class_interfaces(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != class_p( v_object ) : v_object;
    return v_object.setField6( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/subloop-structures.lisp", position = 885L)
  public static SubLObject _csetf_class_compiled_inheritance_path(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != class_p( v_object ) : v_object;
    return v_object.setField7( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/subloop-structures.lisp", position = 885L)
  public static SubLObject _csetf_class_instance_var_decls(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != class_p( v_object ) : v_object;
    return v_object.setField8( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/subloop-structures.lisp", position = 885L)
  public static SubLObject _csetf_class_class_var_decls(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != class_p( v_object ) : v_object;
    return v_object.setField9( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/subloop-structures.lisp", position = 885L)
  public static SubLObject _csetf_class_compiled_instance_slot_access_alist(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != class_p( v_object ) : v_object;
    return v_object.setField10( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/subloop-structures.lisp", position = 885L)
  public static SubLObject _csetf_class_compiled_instance_boolean_slot_access_alist(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != class_p( v_object ) : v_object;
    return v_object.setField11( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/subloop-structures.lisp", position = 885L)
  public static SubLObject _csetf_class_compiled_class_slot_access_alist(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != class_p( v_object ) : v_object;
    return v_object.setField12( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/subloop-structures.lisp", position = 885L)
  public static SubLObject _csetf_class_compiled_class_boolean_slot_access_alist(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != class_p( v_object ) : v_object;
    return v_object.setField13( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/subloop-structures.lisp", position = 885L)
  public static SubLObject _csetf_class_slot_accessor_alist(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != class_p( v_object ) : v_object;
    return v_object.setField14( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/subloop-structures.lisp", position = 885L)
  public static SubLObject _csetf_class_instance_method_decls(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != class_p( v_object ) : v_object;
    return v_object.setField15( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/subloop-structures.lisp", position = 885L)
  public static SubLObject _csetf_class_class_method_decls(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != class_p( v_object ) : v_object;
    return v_object.setField16( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/subloop-structures.lisp", position = 885L)
  public static SubLObject _csetf_class_boolean_slots(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != class_p( v_object ) : v_object;
    return v_object.setField17( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/subloop-structures.lisp", position = 885L)
  public static SubLObject _csetf_class_any_slots(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != class_p( v_object ) : v_object;
    return v_object.setField18( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/subloop-structures.lisp", position = 885L)
  public static SubLObject _csetf_class_compiled_instance_method_access_alist(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != class_p( v_object ) : v_object;
    return v_object.setField19( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/subloop-structures.lisp", position = 885L)
  public static SubLObject _csetf_class_compiled_class_method_access_alist(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != class_p( v_object ) : v_object;
    return v_object.setField20( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/subloop-structures.lisp", position = 885L)
  public static SubLObject _csetf_class_tablified_instance_methods(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != class_p( v_object ) : v_object;
    return ( ($class_native) v_object ).$tablified_instance_methods = value;
  }

  @SubLTranslatedFile.SubL(source = "cycl/subloop-structures.lisp", position = 885L)
  public static SubLObject _csetf_class_definition_lock(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != class_p( v_object ) : v_object;
    return ( ($class_native) v_object ).$definition_lock = value;
  }

  @SubLTranslatedFile.SubL(source = "cycl/subloop-structures.lisp", position = 885L)
  public static SubLObject _csetf_class_access_lock(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != class_p( v_object ) : v_object;
    return ( ($class_native) v_object ).$access_lock = value;
  }

  @SubLTranslatedFile.SubL(source = "cycl/subloop-structures.lisp", position = 885L)
  public static SubLObject _csetf_class_synchronized_slots_p(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != class_p( v_object ) : v_object;
    return ( ($class_native) v_object ).$synchronized_slots_p = value;
  }

  @SubLTranslatedFile.SubL(source = "cycl/subloop-structures.lisp", position = 885L)
  public static SubLObject _csetf_class_plist(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != class_p( v_object ) : v_object;
    return ( ($class_native) v_object ).$plist = value;
  }

  @SubLTranslatedFile.SubL(source = "cycl/subloop-structures.lisp", position = 885L)
  public static SubLObject _csetf_class_class_initialization_function(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != class_p( v_object ) : v_object;
    return ( ($class_native) v_object ).$class_initialization_function = value;
  }

  @SubLTranslatedFile.SubL(source = "cycl/subloop-structures.lisp", position = 885L)
  public static SubLObject _csetf_class_class_initialized_p(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != class_p( v_object ) : v_object;
    return ( ($class_native) v_object ).$class_initialized_p = value;
  }

  @SubLTranslatedFile.SubL(source = "cycl/subloop-structures.lisp", position = 885L)
  public static SubLObject _csetf_class_instance_initialization_function(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != class_p( v_object ) : v_object;
    return ( ($class_native) v_object ).$instance_initialization_function = value;
  }

  @SubLTranslatedFile.SubL(source = "cycl/subloop-structures.lisp", position = 885L)
  public static SubLObject _csetf_class_class_properties(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != class_p( v_object ) : v_object;
    return ( ($class_native) v_object ).$class_properties = value;
  }

  @SubLTranslatedFile.SubL(source = "cycl/subloop-structures.lisp", position = 885L)
  public static SubLObject make_class(SubLObject arglist)
  {
    if( arglist == UNPROVIDED )
    {
      arglist = NIL;
    }
    final SubLObject v_new = new $class_native();
    SubLObject next;
    SubLObject current_arg;
    SubLObject current_value;
    SubLObject pcase_var;
    for( next = NIL, next = arglist; NIL != next; next = conses_high.cddr( next ) )
    {
      current_arg = next.first();
      current_value = conses_high.cadr( next );
      pcase_var = current_arg;
      if( pcase_var.eql( $kw74$NAME ) )
      {
        _csetf_class_name( v_new, current_value );
      }
      else if( pcase_var.eql( $kw75$PARENT ) )
      {
        _csetf_class_parent( v_new, current_value );
      }
      else if( pcase_var.eql( $kw76$SUBCLASSES ) )
      {
        _csetf_class_subclasses( v_new, current_value );
      }
      else if( pcase_var.eql( $kw77$INTERFACE_NAMES ) )
      {
        _csetf_class_interface_names( v_new, current_value );
      }
      else if( pcase_var.eql( $kw78$INTERFACES ) )
      {
        _csetf_class_interfaces( v_new, current_value );
      }
      else if( pcase_var.eql( $kw79$COMPILED_INHERITANCE_PATH ) )
      {
        _csetf_class_compiled_inheritance_path( v_new, current_value );
      }
      else if( pcase_var.eql( $kw80$INSTANCE_VAR_DECLS ) )
      {
        _csetf_class_instance_var_decls( v_new, current_value );
      }
      else if( pcase_var.eql( $kw81$CLASS_VAR_DECLS ) )
      {
        _csetf_class_class_var_decls( v_new, current_value );
      }
      else if( pcase_var.eql( $kw82$COMPILED_INSTANCE_SLOT_ACCESS_ALIST ) )
      {
        _csetf_class_compiled_instance_slot_access_alist( v_new, current_value );
      }
      else if( pcase_var.eql( $kw83$COMPILED_INSTANCE_BOOLEAN_SLOT_ACCESS_ALIST ) )
      {
        _csetf_class_compiled_instance_boolean_slot_access_alist( v_new, current_value );
      }
      else if( pcase_var.eql( $kw84$COMPILED_CLASS_SLOT_ACCESS_ALIST ) )
      {
        _csetf_class_compiled_class_slot_access_alist( v_new, current_value );
      }
      else if( pcase_var.eql( $kw85$COMPILED_CLASS_BOOLEAN_SLOT_ACCESS_ALIST ) )
      {
        _csetf_class_compiled_class_boolean_slot_access_alist( v_new, current_value );
      }
      else if( pcase_var.eql( $kw86$SLOT_ACCESSOR_ALIST ) )
      {
        _csetf_class_slot_accessor_alist( v_new, current_value );
      }
      else if( pcase_var.eql( $kw87$INSTANCE_METHOD_DECLS ) )
      {
        _csetf_class_instance_method_decls( v_new, current_value );
      }
      else if( pcase_var.eql( $kw88$CLASS_METHOD_DECLS ) )
      {
        _csetf_class_class_method_decls( v_new, current_value );
      }
      else if( pcase_var.eql( $kw89$BOOLEAN_SLOTS ) )
      {
        _csetf_class_boolean_slots( v_new, current_value );
      }
      else if( pcase_var.eql( $kw90$ANY_SLOTS ) )
      {
        _csetf_class_any_slots( v_new, current_value );
      }
      else if( pcase_var.eql( $kw91$COMPILED_INSTANCE_METHOD_ACCESS_ALIST ) )
      {
        _csetf_class_compiled_instance_method_access_alist( v_new, current_value );
      }
      else if( pcase_var.eql( $kw92$COMPILED_CLASS_METHOD_ACCESS_ALIST ) )
      {
        _csetf_class_compiled_class_method_access_alist( v_new, current_value );
      }
      else if( pcase_var.eql( $kw93$TABLIFIED_INSTANCE_METHODS ) )
      {
        _csetf_class_tablified_instance_methods( v_new, current_value );
      }
      else if( pcase_var.eql( $kw94$DEFINITION_LOCK ) )
      {
        _csetf_class_definition_lock( v_new, current_value );
      }
      else if( pcase_var.eql( $kw95$ACCESS_LOCK ) )
      {
        _csetf_class_access_lock( v_new, current_value );
      }
      else if( pcase_var.eql( $kw96$SYNCHRONIZED_SLOTS_P ) )
      {
        _csetf_class_synchronized_slots_p( v_new, current_value );
      }
      else if( pcase_var.eql( $kw97$PLIST ) )
      {
        _csetf_class_plist( v_new, current_value );
      }
      else if( pcase_var.eql( $kw98$CLASS_INITIALIZATION_FUNCTION ) )
      {
        _csetf_class_class_initialization_function( v_new, current_value );
      }
      else if( pcase_var.eql( $kw99$CLASS_INITIALIZED_P ) )
      {
        _csetf_class_class_initialized_p( v_new, current_value );
      }
      else if( pcase_var.eql( $kw100$INSTANCE_INITIALIZATION_FUNCTION ) )
      {
        _csetf_class_instance_initialization_function( v_new, current_value );
      }
      else if( pcase_var.eql( $kw101$CLASS_PROPERTIES ) )
      {
        _csetf_class_class_properties( v_new, current_value );
      }
      else
      {
        Errors.error( $str102$Invalid_slot__S_for_construction_, current_arg );
      }
    }
    return v_new;
  }

  @SubLTranslatedFile.SubL(source = "cycl/subloop-structures.lisp", position = 885L)
  public static SubLObject visit_defstruct_class(final SubLObject obj, final SubLObject visitor_fn)
  {
    Functions.funcall( visitor_fn, obj, $kw103$BEGIN, $sym104$MAKE_CLASS, $int14$28 );
    Functions.funcall( visitor_fn, obj, $kw105$SLOT, $kw74$NAME, class_name( obj ) );
    Functions.funcall( visitor_fn, obj, $kw105$SLOT, $kw75$PARENT, class_parent( obj ) );
    Functions.funcall( visitor_fn, obj, $kw105$SLOT, $kw76$SUBCLASSES, class_subclasses( obj ) );
    Functions.funcall( visitor_fn, obj, $kw105$SLOT, $kw77$INTERFACE_NAMES, class_interface_names( obj ) );
    Functions.funcall( visitor_fn, obj, $kw105$SLOT, $kw78$INTERFACES, class_interfaces( obj ) );
    Functions.funcall( visitor_fn, obj, $kw105$SLOT, $kw79$COMPILED_INHERITANCE_PATH, class_compiled_inheritance_path( obj ) );
    Functions.funcall( visitor_fn, obj, $kw105$SLOT, $kw80$INSTANCE_VAR_DECLS, class_instance_var_decls( obj ) );
    Functions.funcall( visitor_fn, obj, $kw105$SLOT, $kw81$CLASS_VAR_DECLS, class_class_var_decls( obj ) );
    Functions.funcall( visitor_fn, obj, $kw105$SLOT, $kw82$COMPILED_INSTANCE_SLOT_ACCESS_ALIST, class_compiled_instance_slot_access_alist( obj ) );
    Functions.funcall( visitor_fn, obj, $kw105$SLOT, $kw83$COMPILED_INSTANCE_BOOLEAN_SLOT_ACCESS_ALIST, class_compiled_instance_boolean_slot_access_alist( obj ) );
    Functions.funcall( visitor_fn, obj, $kw105$SLOT, $kw84$COMPILED_CLASS_SLOT_ACCESS_ALIST, class_compiled_class_slot_access_alist( obj ) );
    Functions.funcall( visitor_fn, obj, $kw105$SLOT, $kw85$COMPILED_CLASS_BOOLEAN_SLOT_ACCESS_ALIST, class_compiled_class_boolean_slot_access_alist( obj ) );
    Functions.funcall( visitor_fn, obj, $kw105$SLOT, $kw86$SLOT_ACCESSOR_ALIST, class_slot_accessor_alist( obj ) );
    Functions.funcall( visitor_fn, obj, $kw105$SLOT, $kw87$INSTANCE_METHOD_DECLS, class_instance_method_decls( obj ) );
    Functions.funcall( visitor_fn, obj, $kw105$SLOT, $kw88$CLASS_METHOD_DECLS, class_class_method_decls( obj ) );
    Functions.funcall( visitor_fn, obj, $kw105$SLOT, $kw89$BOOLEAN_SLOTS, class_boolean_slots( obj ) );
    Functions.funcall( visitor_fn, obj, $kw105$SLOT, $kw90$ANY_SLOTS, class_any_slots( obj ) );
    Functions.funcall( visitor_fn, obj, $kw105$SLOT, $kw91$COMPILED_INSTANCE_METHOD_ACCESS_ALIST, class_compiled_instance_method_access_alist( obj ) );
    Functions.funcall( visitor_fn, obj, $kw105$SLOT, $kw92$COMPILED_CLASS_METHOD_ACCESS_ALIST, class_compiled_class_method_access_alist( obj ) );
    Functions.funcall( visitor_fn, obj, $kw105$SLOT, $kw93$TABLIFIED_INSTANCE_METHODS, class_tablified_instance_methods( obj ) );
    Functions.funcall( visitor_fn, obj, $kw105$SLOT, $kw94$DEFINITION_LOCK, class_definition_lock( obj ) );
    Functions.funcall( visitor_fn, obj, $kw105$SLOT, $kw95$ACCESS_LOCK, class_access_lock( obj ) );
    Functions.funcall( visitor_fn, obj, $kw105$SLOT, $kw96$SYNCHRONIZED_SLOTS_P, class_synchronized_slots_p( obj ) );
    Functions.funcall( visitor_fn, obj, $kw105$SLOT, $kw97$PLIST, class_plist( obj ) );
    Functions.funcall( visitor_fn, obj, $kw105$SLOT, $kw98$CLASS_INITIALIZATION_FUNCTION, class_class_initialization_function( obj ) );
    Functions.funcall( visitor_fn, obj, $kw105$SLOT, $kw99$CLASS_INITIALIZED_P, class_class_initialized_p( obj ) );
    Functions.funcall( visitor_fn, obj, $kw105$SLOT, $kw100$INSTANCE_INITIALIZATION_FUNCTION, class_instance_initialization_function( obj ) );
    Functions.funcall( visitor_fn, obj, $kw105$SLOT, $kw101$CLASS_PROPERTIES, class_class_properties( obj ) );
    Functions.funcall( visitor_fn, obj, $kw106$END, $sym104$MAKE_CLASS, $int14$28 );
    return obj;
  }

  @SubLTranslatedFile.SubL(source = "cycl/subloop-structures.lisp", position = 885L)
  public static SubLObject visit_defstruct_object_class_method(final SubLObject obj, final SubLObject visitor_fn)
  {
    return visit_defstruct_class( obj, visitor_fn );
  }

  @SubLTranslatedFile.SubL(source = "cycl/subloop-structures.lisp", position = 2103L)
  public static SubLObject create_class()
  {
    final SubLObject new_class = make_class( UNPROVIDED );
    _csetf_class_class_properties( new_class, ZERO_INTEGER );
    return new_class;
  }

  @SubLTranslatedFile.SubL(source = "cycl/subloop-structures.lisp", position = 2244L)
  public static SubLObject with_class(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    SubLObject v_class = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list108 );
    v_class = current.first();
    final SubLObject forms;
    current = ( forms = current.rest() );
    final SubLObject class_var = Symbols.make_symbol( $str109$class );
    return utilities_macros.generate_instance_variable_bindings_for_structure_slots( class_var, v_class, $sym110$CLASS_, $list111, forms, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/subloop-structures.lisp", position = 3060L)
  public static SubLObject with_class_private(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    SubLObject v_class = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list108 );
    v_class = current.first();
    final SubLObject forms;
    current = ( forms = current.rest() );
    final SubLObject class_var = Symbols.make_symbol( $str109$class );
    return utilities_macros.generate_instance_variable_bindings_for_structure_slots( class_var, v_class, $sym110$CLASS_, $list111, forms, NIL );
  }

  @SubLTranslatedFile.SubL(source = "cycl/subloop-structures.lisp", position = 3888L)
  public static SubLObject print_class(final SubLObject v_object, final SubLObject stream, final SubLObject depth)
  {
    PrintLow.format( stream, $str112$__CLASS__S_, class_name( v_object ) );
    return v_object;
  }

  @SubLTranslatedFile.SubL(source = "cycl/subloop-structures.lisp", position = 4023L)
  public static SubLObject def_class_property(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    SubLObject property_name = NIL;
    SubLObject offset = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list113 );
    property_name = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list113 );
    offset = current.first();
    current = current.rest();
    if( NIL == current )
    {
      final SubLObject accessor_base_name = Sequences.cconcatenate( $str114$SUBLOOP_CLASS_PROPERTY_, Symbols.symbol_name( property_name ) );
      final SubLObject getter_name = Packages.intern( Sequences.cconcatenate( $str115$GET_, accessor_base_name ), UNPROVIDED );
      final SubLObject setter_name = Packages.intern( Sequences.cconcatenate( $str116$SET_, accessor_base_name ), UNPROVIDED );
      return ConsesLow.list( $sym117$PROGN, ConsesLow.list( $sym118$DEFINE_PROTECTED, getter_name, $list119, ConsesLow.list( $sym120$RET, ConsesLow.listS( $sym121$LDB_TEST, ConsesLow.list( $sym122$BYTE, ONE_INTEGER,
          offset ), $list123 ) ) ), ConsesLow.listS( $sym118$DEFINE_PROTECTED, setter_name, $list124, ConsesLow.list( $sym125$CSETF, $list126, ConsesLow.listS( $sym127$DPB, $list128, ConsesLow.list( $sym122$BYTE,
              ONE_INTEGER, offset ), $list123 ) ), $list129 ) );
    }
    cdestructuring_bind.cdestructuring_bind_error( datum, $list113 );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/subloop-structures.lisp", position = 4726L)
  public static SubLObject instance_print_function_trampoline(final SubLObject v_object, final SubLObject stream)
  {
    print_instance( v_object, stream, ZERO_INTEGER );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/subloop-structures.lisp", position = 4726L)
  public static SubLObject instance_p(final SubLObject v_object)
  {
    return ( v_object.getClass() == $instance_native.class ) ? T : NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/subloop-structures.lisp", position = 4726L)
  public static SubLObject instance_class(final SubLObject v_object)
  {
    assert NIL != instance_p( v_object ) : v_object;
    return v_object.getField2();
  }

  @SubLTranslatedFile.SubL(source = "cycl/subloop-structures.lisp", position = 4726L)
  public static SubLObject instance_boolean_slots(final SubLObject v_object)
  {
    assert NIL != instance_p( v_object ) : v_object;
    return v_object.getField3();
  }

  @SubLTranslatedFile.SubL(source = "cycl/subloop-structures.lisp", position = 4726L)
  public static SubLObject instance_any_slots(final SubLObject v_object)
  {
    assert NIL != instance_p( v_object ) : v_object;
    return v_object.getField4();
  }

  @SubLTranslatedFile.SubL(source = "cycl/subloop-structures.lisp", position = 4726L)
  public static SubLObject instance_plist(final SubLObject v_object)
  {
    assert NIL != instance_p( v_object ) : v_object;
    return v_object.getField5();
  }

  @SubLTranslatedFile.SubL(source = "cycl/subloop-structures.lisp", position = 4726L)
  public static SubLObject _csetf_instance_class(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != instance_p( v_object ) : v_object;
    return v_object.setField2( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/subloop-structures.lisp", position = 4726L)
  public static SubLObject _csetf_instance_boolean_slots(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != instance_p( v_object ) : v_object;
    return v_object.setField3( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/subloop-structures.lisp", position = 4726L)
  public static SubLObject _csetf_instance_any_slots(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != instance_p( v_object ) : v_object;
    return v_object.setField4( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/subloop-structures.lisp", position = 4726L)
  public static SubLObject _csetf_instance_plist(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != instance_p( v_object ) : v_object;
    return v_object.setField5( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/subloop-structures.lisp", position = 4726L)
  public static SubLObject make_instance(SubLObject arglist)
  {
    if( arglist == UNPROVIDED )
    {
      arglist = NIL;
    }
    final SubLObject v_new = new $instance_native();
    SubLObject next;
    SubLObject current_arg;
    SubLObject current_value;
    SubLObject pcase_var;
    for( next = NIL, next = arglist; NIL != next; next = conses_high.cddr( next ) )
    {
      current_arg = next.first();
      current_value = conses_high.cadr( next );
      pcase_var = current_arg;
      if( pcase_var.eql( $kw147$CLASS ) )
      {
        _csetf_instance_class( v_new, current_value );
      }
      else if( pcase_var.eql( $kw89$BOOLEAN_SLOTS ) )
      {
        _csetf_instance_boolean_slots( v_new, current_value );
      }
      else if( pcase_var.eql( $kw90$ANY_SLOTS ) )
      {
        _csetf_instance_any_slots( v_new, current_value );
      }
      else if( pcase_var.eql( $kw97$PLIST ) )
      {
        _csetf_instance_plist( v_new, current_value );
      }
      else
      {
        Errors.error( $str102$Invalid_slot__S_for_construction_, current_arg );
      }
    }
    return v_new;
  }

  @SubLTranslatedFile.SubL(source = "cycl/subloop-structures.lisp", position = 4726L)
  public static SubLObject visit_defstruct_instance(final SubLObject obj, final SubLObject visitor_fn)
  {
    Functions.funcall( visitor_fn, obj, $kw103$BEGIN, $sym148$MAKE_INSTANCE, FOUR_INTEGER );
    Functions.funcall( visitor_fn, obj, $kw105$SLOT, $kw147$CLASS, instance_class( obj ) );
    Functions.funcall( visitor_fn, obj, $kw105$SLOT, $kw89$BOOLEAN_SLOTS, instance_boolean_slots( obj ) );
    Functions.funcall( visitor_fn, obj, $kw105$SLOT, $kw90$ANY_SLOTS, instance_any_slots( obj ) );
    Functions.funcall( visitor_fn, obj, $kw105$SLOT, $kw97$PLIST, instance_plist( obj ) );
    Functions.funcall( visitor_fn, obj, $kw106$END, $sym148$MAKE_INSTANCE, FOUR_INTEGER );
    return obj;
  }

  @SubLTranslatedFile.SubL(source = "cycl/subloop-structures.lisp", position = 4726L)
  public static SubLObject visit_defstruct_object_instance_method(final SubLObject obj, final SubLObject visitor_fn)
  {
    return visit_defstruct_instance( obj, visitor_fn );
  }

  @SubLTranslatedFile.SubL(source = "cycl/subloop-structures.lisp", position = 4845L)
  public static SubLObject with_instance(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    SubLObject instance = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list150 );
    instance = current.first();
    final SubLObject forms;
    current = ( forms = current.rest() );
    final SubLObject instance_var = Symbols.make_symbol( $str151$instance );
    return utilities_macros.generate_instance_variable_bindings_for_structure_slots( instance_var, instance, $sym152$INSTANCE_, $list132, forms, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/subloop-structures.lisp", position = 5100L)
  public static SubLObject print_instance(final SubLObject v_object, final SubLObject stream, final SubLObject depth)
  {
    final SubLObject v_class = instance_class( v_object );
    final SubLObject class_name = class_name( v_class );
    if( NIL != classes.subclassp( class_name, $sym153$OBJECT ) )
    {
      methods.funcall_instance_method_with_2_args( v_object, $sym154$PRINT, stream, depth );
    }
    else
    {
      PrintLow.format( stream, $str155$__Instance_of__S_, class_name( v_class ) );
    }
    return v_object;
  }

  @SubLTranslatedFile.SubL(source = "cycl/subloop-structures.lisp", position = 5418L)
  public static SubLObject interface_print_function_trampoline(final SubLObject v_object, final SubLObject stream)
  {
    print_interface( v_object, stream, ZERO_INTEGER );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/subloop-structures.lisp", position = 5418L)
  public static SubLObject interface_p(final SubLObject v_object)
  {
    return ( v_object.getClass() == $interface_native.class ) ? T : NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/subloop-structures.lisp", position = 5418L)
  public static SubLObject interface_name(final SubLObject v_object)
  {
    assert NIL != interface_p( v_object ) : v_object;
    return v_object.getField2();
  }

  @SubLTranslatedFile.SubL(source = "cycl/subloop-structures.lisp", position = 5418L)
  public static SubLObject interface_parents(final SubLObject v_object)
  {
    assert NIL != interface_p( v_object ) : v_object;
    return v_object.getField3();
  }

  @SubLTranslatedFile.SubL(source = "cycl/subloop-structures.lisp", position = 5418L)
  public static SubLObject interface_compiled_inheritance_path(final SubLObject v_object)
  {
    assert NIL != interface_p( v_object ) : v_object;
    return v_object.getField4();
  }

  @SubLTranslatedFile.SubL(source = "cycl/subloop-structures.lisp", position = 5418L)
  public static SubLObject interface_subinterfaces(final SubLObject v_object)
  {
    assert NIL != interface_p( v_object ) : v_object;
    return v_object.getField5();
  }

  @SubLTranslatedFile.SubL(source = "cycl/subloop-structures.lisp", position = 5418L)
  public static SubLObject interface_implementers(final SubLObject v_object)
  {
    assert NIL != interface_p( v_object ) : v_object;
    return v_object.getField6();
  }

  @SubLTranslatedFile.SubL(source = "cycl/subloop-structures.lisp", position = 5418L)
  public static SubLObject interface_instance_method_decls(final SubLObject v_object)
  {
    assert NIL != interface_p( v_object ) : v_object;
    return v_object.getField7();
  }

  @SubLTranslatedFile.SubL(source = "cycl/subloop-structures.lisp", position = 5418L)
  public static SubLObject interface_class_method_decls(final SubLObject v_object)
  {
    assert NIL != interface_p( v_object ) : v_object;
    return v_object.getField8();
  }

  @SubLTranslatedFile.SubL(source = "cycl/subloop-structures.lisp", position = 5418L)
  public static SubLObject interface_compiled_instance_method_decls(final SubLObject v_object)
  {
    assert NIL != interface_p( v_object ) : v_object;
    return v_object.getField9();
  }

  @SubLTranslatedFile.SubL(source = "cycl/subloop-structures.lisp", position = 5418L)
  public static SubLObject interface_compiled_class_method_decls(final SubLObject v_object)
  {
    assert NIL != interface_p( v_object ) : v_object;
    return v_object.getField10();
  }

  @SubLTranslatedFile.SubL(source = "cycl/subloop-structures.lisp", position = 5418L)
  public static SubLObject interface_local_class_methods(final SubLObject v_object)
  {
    assert NIL != interface_p( v_object ) : v_object;
    return v_object.getField11();
  }

  @SubLTranslatedFile.SubL(source = "cycl/subloop-structures.lisp", position = 5418L)
  public static SubLObject interface_local_instance_methods(final SubLObject v_object)
  {
    assert NIL != interface_p( v_object ) : v_object;
    return v_object.getField12();
  }

  @SubLTranslatedFile.SubL(source = "cycl/subloop-structures.lisp", position = 5418L)
  public static SubLObject interface_mark_list(final SubLObject v_object)
  {
    assert NIL != interface_p( v_object ) : v_object;
    return v_object.getField13();
  }

  @SubLTranslatedFile.SubL(source = "cycl/subloop-structures.lisp", position = 5418L)
  public static SubLObject interface_plist(final SubLObject v_object)
  {
    assert NIL != interface_p( v_object ) : v_object;
    return v_object.getField14();
  }

  @SubLTranslatedFile.SubL(source = "cycl/subloop-structures.lisp", position = 5418L)
  public static SubLObject interface_definition_lock(final SubLObject v_object)
  {
    assert NIL != interface_p( v_object ) : v_object;
    return v_object.getField15();
  }

  @SubLTranslatedFile.SubL(source = "cycl/subloop-structures.lisp", position = 5418L)
  public static SubLObject _csetf_interface_name(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != interface_p( v_object ) : v_object;
    return v_object.setField2( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/subloop-structures.lisp", position = 5418L)
  public static SubLObject _csetf_interface_parents(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != interface_p( v_object ) : v_object;
    return v_object.setField3( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/subloop-structures.lisp", position = 5418L)
  public static SubLObject _csetf_interface_compiled_inheritance_path(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != interface_p( v_object ) : v_object;
    return v_object.setField4( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/subloop-structures.lisp", position = 5418L)
  public static SubLObject _csetf_interface_subinterfaces(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != interface_p( v_object ) : v_object;
    return v_object.setField5( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/subloop-structures.lisp", position = 5418L)
  public static SubLObject _csetf_interface_implementers(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != interface_p( v_object ) : v_object;
    return v_object.setField6( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/subloop-structures.lisp", position = 5418L)
  public static SubLObject _csetf_interface_instance_method_decls(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != interface_p( v_object ) : v_object;
    return v_object.setField7( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/subloop-structures.lisp", position = 5418L)
  public static SubLObject _csetf_interface_class_method_decls(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != interface_p( v_object ) : v_object;
    return v_object.setField8( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/subloop-structures.lisp", position = 5418L)
  public static SubLObject _csetf_interface_compiled_instance_method_decls(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != interface_p( v_object ) : v_object;
    return v_object.setField9( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/subloop-structures.lisp", position = 5418L)
  public static SubLObject _csetf_interface_compiled_class_method_decls(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != interface_p( v_object ) : v_object;
    return v_object.setField10( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/subloop-structures.lisp", position = 5418L)
  public static SubLObject _csetf_interface_local_class_methods(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != interface_p( v_object ) : v_object;
    return v_object.setField11( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/subloop-structures.lisp", position = 5418L)
  public static SubLObject _csetf_interface_local_instance_methods(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != interface_p( v_object ) : v_object;
    return v_object.setField12( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/subloop-structures.lisp", position = 5418L)
  public static SubLObject _csetf_interface_mark_list(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != interface_p( v_object ) : v_object;
    return v_object.setField13( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/subloop-structures.lisp", position = 5418L)
  public static SubLObject _csetf_interface_plist(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != interface_p( v_object ) : v_object;
    return v_object.setField14( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/subloop-structures.lisp", position = 5418L)
  public static SubLObject _csetf_interface_definition_lock(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != interface_p( v_object ) : v_object;
    return v_object.setField15( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/subloop-structures.lisp", position = 5418L)
  public static SubLObject make_interface(SubLObject arglist)
  {
    if( arglist == UNPROVIDED )
    {
      arglist = NIL;
    }
    final SubLObject v_new = new $interface_native();
    SubLObject next;
    SubLObject current_arg;
    SubLObject current_value;
    SubLObject pcase_var;
    for( next = NIL, next = arglist; NIL != next; next = conses_high.cddr( next ) )
    {
      current_arg = next.first();
      current_value = conses_high.cadr( next );
      pcase_var = current_arg;
      if( pcase_var.eql( $kw74$NAME ) )
      {
        _csetf_interface_name( v_new, current_value );
      }
      else if( pcase_var.eql( $kw193$PARENTS ) )
      {
        _csetf_interface_parents( v_new, current_value );
      }
      else if( pcase_var.eql( $kw79$COMPILED_INHERITANCE_PATH ) )
      {
        _csetf_interface_compiled_inheritance_path( v_new, current_value );
      }
      else if( pcase_var.eql( $kw194$SUBINTERFACES ) )
      {
        _csetf_interface_subinterfaces( v_new, current_value );
      }
      else if( pcase_var.eql( $kw195$IMPLEMENTERS ) )
      {
        _csetf_interface_implementers( v_new, current_value );
      }
      else if( pcase_var.eql( $kw87$INSTANCE_METHOD_DECLS ) )
      {
        _csetf_interface_instance_method_decls( v_new, current_value );
      }
      else if( pcase_var.eql( $kw88$CLASS_METHOD_DECLS ) )
      {
        _csetf_interface_class_method_decls( v_new, current_value );
      }
      else if( pcase_var.eql( $kw196$COMPILED_INSTANCE_METHOD_DECLS ) )
      {
        _csetf_interface_compiled_instance_method_decls( v_new, current_value );
      }
      else if( pcase_var.eql( $kw197$COMPILED_CLASS_METHOD_DECLS ) )
      {
        _csetf_interface_compiled_class_method_decls( v_new, current_value );
      }
      else if( pcase_var.eql( $kw198$LOCAL_CLASS_METHODS ) )
      {
        _csetf_interface_local_class_methods( v_new, current_value );
      }
      else if( pcase_var.eql( $kw199$LOCAL_INSTANCE_METHODS ) )
      {
        _csetf_interface_local_instance_methods( v_new, current_value );
      }
      else if( pcase_var.eql( $kw200$MARK_LIST ) )
      {
        _csetf_interface_mark_list( v_new, current_value );
      }
      else if( pcase_var.eql( $kw97$PLIST ) )
      {
        _csetf_interface_plist( v_new, current_value );
      }
      else if( pcase_var.eql( $kw94$DEFINITION_LOCK ) )
      {
        _csetf_interface_definition_lock( v_new, current_value );
      }
      else
      {
        Errors.error( $str102$Invalid_slot__S_for_construction_, current_arg );
      }
    }
    return v_new;
  }

  @SubLTranslatedFile.SubL(source = "cycl/subloop-structures.lisp", position = 5418L)
  public static SubLObject visit_defstruct_interface(final SubLObject obj, final SubLObject visitor_fn)
  {
    Functions.funcall( visitor_fn, obj, $kw103$BEGIN, $sym201$MAKE_INTERFACE, FOURTEEN_INTEGER );
    Functions.funcall( visitor_fn, obj, $kw105$SLOT, $kw74$NAME, interface_name( obj ) );
    Functions.funcall( visitor_fn, obj, $kw105$SLOT, $kw193$PARENTS, interface_parents( obj ) );
    Functions.funcall( visitor_fn, obj, $kw105$SLOT, $kw79$COMPILED_INHERITANCE_PATH, interface_compiled_inheritance_path( obj ) );
    Functions.funcall( visitor_fn, obj, $kw105$SLOT, $kw194$SUBINTERFACES, interface_subinterfaces( obj ) );
    Functions.funcall( visitor_fn, obj, $kw105$SLOT, $kw195$IMPLEMENTERS, interface_implementers( obj ) );
    Functions.funcall( visitor_fn, obj, $kw105$SLOT, $kw87$INSTANCE_METHOD_DECLS, interface_instance_method_decls( obj ) );
    Functions.funcall( visitor_fn, obj, $kw105$SLOT, $kw88$CLASS_METHOD_DECLS, interface_class_method_decls( obj ) );
    Functions.funcall( visitor_fn, obj, $kw105$SLOT, $kw196$COMPILED_INSTANCE_METHOD_DECLS, interface_compiled_instance_method_decls( obj ) );
    Functions.funcall( visitor_fn, obj, $kw105$SLOT, $kw197$COMPILED_CLASS_METHOD_DECLS, interface_compiled_class_method_decls( obj ) );
    Functions.funcall( visitor_fn, obj, $kw105$SLOT, $kw198$LOCAL_CLASS_METHODS, interface_local_class_methods( obj ) );
    Functions.funcall( visitor_fn, obj, $kw105$SLOT, $kw199$LOCAL_INSTANCE_METHODS, interface_local_instance_methods( obj ) );
    Functions.funcall( visitor_fn, obj, $kw105$SLOT, $kw200$MARK_LIST, interface_mark_list( obj ) );
    Functions.funcall( visitor_fn, obj, $kw105$SLOT, $kw97$PLIST, interface_plist( obj ) );
    Functions.funcall( visitor_fn, obj, $kw105$SLOT, $kw94$DEFINITION_LOCK, interface_definition_lock( obj ) );
    Functions.funcall( visitor_fn, obj, $kw106$END, $sym201$MAKE_INTERFACE, FOURTEEN_INTEGER );
    return obj;
  }

  @SubLTranslatedFile.SubL(source = "cycl/subloop-structures.lisp", position = 5418L)
  public static SubLObject visit_defstruct_object_interface_method(final SubLObject obj, final SubLObject visitor_fn)
  {
    return visit_defstruct_interface( obj, visitor_fn );
  }

  @SubLTranslatedFile.SubL(source = "cycl/subloop-structures.lisp", position = 5766L)
  public static SubLObject with_interface(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    SubLObject v_interface = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list203 );
    v_interface = current.first();
    final SubLObject forms;
    current = ( forms = current.rest() );
    final SubLObject interface_var = Symbols.make_symbol( $str204$interface );
    return utilities_macros.generate_instance_variable_bindings_for_structure_slots( interface_var, v_interface, $sym205$INTERFACE_, $list206, forms, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/subloop-structures.lisp", position = 6290L)
  public static SubLObject with_interface_private(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    SubLObject v_interface = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list203 );
    v_interface = current.first();
    final SubLObject forms;
    current = ( forms = current.rest() );
    final SubLObject interface_var = Symbols.make_symbol( $str204$interface );
    return utilities_macros.generate_instance_variable_bindings_for_structure_slots( interface_var, v_interface, $sym205$INTERFACE_, $list206, forms, NIL );
  }

  @SubLTranslatedFile.SubL(source = "cycl/subloop-structures.lisp", position = 6787L)
  public static SubLObject print_interface(final SubLObject v_object, final SubLObject stream, final SubLObject depth)
  {
    PrintLow.format( stream, $str207$__Interface__S_PARENTS___S_, interface_name( v_object ), interface_parents( v_object ) );
    return v_object;
  }

  @SubLTranslatedFile.SubL(source = "cycl/subloop-structures.lisp", position = 7014L)
  public static SubLObject method_print_function_trampoline(final SubLObject v_object, final SubLObject stream)
  {
    print_method( v_object, stream, ZERO_INTEGER );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/subloop-structures.lisp", position = 7014L)
  public static SubLObject method_p(final SubLObject v_object)
  {
    return ( v_object.getClass() == $method_native.class ) ? T : NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/subloop-structures.lisp", position = 7014L)
  public static SubLObject method_name(final SubLObject v_object)
  {
    assert NIL != method_p( v_object ) : v_object;
    return v_object.getField2();
  }

  @SubLTranslatedFile.SubL(source = "cycl/subloop-structures.lisp", position = 7014L)
  public static SubLObject method_class_name(final SubLObject v_object)
  {
    assert NIL != method_p( v_object ) : v_object;
    return v_object.getField3();
  }

  @SubLTranslatedFile.SubL(source = "cycl/subloop-structures.lisp", position = 7014L)
  public static SubLObject method_lambda_list(final SubLObject v_object)
  {
    assert NIL != method_p( v_object ) : v_object;
    return v_object.getField4();
  }

  @SubLTranslatedFile.SubL(source = "cycl/subloop-structures.lisp", position = 7014L)
  public static SubLObject method_body(final SubLObject v_object)
  {
    assert NIL != method_p( v_object ) : v_object;
    return v_object.getField5();
  }

  @SubLTranslatedFile.SubL(source = "cycl/subloop-structures.lisp", position = 7014L)
  public static SubLObject method_protection(final SubLObject v_object)
  {
    assert NIL != method_p( v_object ) : v_object;
    return v_object.getField6();
  }

  @SubLTranslatedFile.SubL(source = "cycl/subloop-structures.lisp", position = 7014L)
  public static SubLObject method_scope(final SubLObject v_object)
  {
    assert NIL != method_p( v_object ) : v_object;
    return v_object.getField7();
  }

  @SubLTranslatedFile.SubL(source = "cycl/subloop-structures.lisp", position = 7014L)
  public static SubLObject method_update_type(final SubLObject v_object)
  {
    assert NIL != method_p( v_object ) : v_object;
    return v_object.getField8();
  }

  @SubLTranslatedFile.SubL(source = "cycl/subloop-structures.lisp", position = 7014L)
  public static SubLObject method_function_name(final SubLObject v_object)
  {
    assert NIL != method_p( v_object ) : v_object;
    return v_object.getField9();
  }

  @SubLTranslatedFile.SubL(source = "cycl/subloop-structures.lisp", position = 7014L)
  public static SubLObject method_function_def(final SubLObject v_object)
  {
    assert NIL != method_p( v_object ) : v_object;
    return v_object.getField10();
  }

  @SubLTranslatedFile.SubL(source = "cycl/subloop-structures.lisp", position = 7014L)
  public static SubLObject method_before_listeners(final SubLObject v_object)
  {
    assert NIL != method_p( v_object ) : v_object;
    return v_object.getField11();
  }

  @SubLTranslatedFile.SubL(source = "cycl/subloop-structures.lisp", position = 7014L)
  public static SubLObject method_after_listeners(final SubLObject v_object)
  {
    assert NIL != method_p( v_object ) : v_object;
    return v_object.getField12();
  }

  @SubLTranslatedFile.SubL(source = "cycl/subloop-structures.lisp", position = 7014L)
  public static SubLObject method_instantiate_template(final SubLObject v_object)
  {
    assert NIL != method_p( v_object ) : v_object;
    return v_object.getField13();
  }

  @SubLTranslatedFile.SubL(source = "cycl/subloop-structures.lisp", position = 7014L)
  public static SubLObject _csetf_method_name(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != method_p( v_object ) : v_object;
    return v_object.setField2( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/subloop-structures.lisp", position = 7014L)
  public static SubLObject _csetf_method_class_name(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != method_p( v_object ) : v_object;
    return v_object.setField3( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/subloop-structures.lisp", position = 7014L)
  public static SubLObject _csetf_method_lambda_list(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != method_p( v_object ) : v_object;
    return v_object.setField4( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/subloop-structures.lisp", position = 7014L)
  public static SubLObject _csetf_method_body(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != method_p( v_object ) : v_object;
    return v_object.setField5( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/subloop-structures.lisp", position = 7014L)
  public static SubLObject _csetf_method_protection(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != method_p( v_object ) : v_object;
    return v_object.setField6( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/subloop-structures.lisp", position = 7014L)
  public static SubLObject _csetf_method_scope(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != method_p( v_object ) : v_object;
    return v_object.setField7( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/subloop-structures.lisp", position = 7014L)
  public static SubLObject _csetf_method_update_type(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != method_p( v_object ) : v_object;
    return v_object.setField8( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/subloop-structures.lisp", position = 7014L)
  public static SubLObject _csetf_method_function_name(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != method_p( v_object ) : v_object;
    return v_object.setField9( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/subloop-structures.lisp", position = 7014L)
  public static SubLObject _csetf_method_function_def(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != method_p( v_object ) : v_object;
    return v_object.setField10( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/subloop-structures.lisp", position = 7014L)
  public static SubLObject _csetf_method_before_listeners(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != method_p( v_object ) : v_object;
    return v_object.setField11( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/subloop-structures.lisp", position = 7014L)
  public static SubLObject _csetf_method_after_listeners(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != method_p( v_object ) : v_object;
    return v_object.setField12( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/subloop-structures.lisp", position = 7014L)
  public static SubLObject _csetf_method_instantiate_template(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != method_p( v_object ) : v_object;
    return v_object.setField13( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/subloop-structures.lisp", position = 7014L)
  public static SubLObject make_method(SubLObject arglist)
  {
    if( arglist == UNPROVIDED )
    {
      arglist = NIL;
    }
    final SubLObject v_new = new $method_native();
    SubLObject next;
    SubLObject current_arg;
    SubLObject current_value;
    SubLObject pcase_var;
    for( next = NIL, next = arglist; NIL != next; next = conses_high.cddr( next ) )
    {
      current_arg = next.first();
      current_value = conses_high.cadr( next );
      pcase_var = current_arg;
      if( pcase_var.eql( $kw74$NAME ) )
      {
        _csetf_method_name( v_new, current_value );
      }
      else if( pcase_var.eql( $kw241$CLASS_NAME ) )
      {
        _csetf_method_class_name( v_new, current_value );
      }
      else if( pcase_var.eql( $kw242$LAMBDA_LIST ) )
      {
        _csetf_method_lambda_list( v_new, current_value );
      }
      else if( pcase_var.eql( $kw243$BODY ) )
      {
        _csetf_method_body( v_new, current_value );
      }
      else if( pcase_var.eql( $kw244$PROTECTION ) )
      {
        _csetf_method_protection( v_new, current_value );
      }
      else if( pcase_var.eql( $kw245$SCOPE ) )
      {
        _csetf_method_scope( v_new, current_value );
      }
      else if( pcase_var.eql( $kw246$UPDATE_TYPE ) )
      {
        _csetf_method_update_type( v_new, current_value );
      }
      else if( pcase_var.eql( $kw247$FUNCTION_NAME ) )
      {
        _csetf_method_function_name( v_new, current_value );
      }
      else if( pcase_var.eql( $kw248$FUNCTION_DEF ) )
      {
        _csetf_method_function_def( v_new, current_value );
      }
      else if( pcase_var.eql( $kw249$BEFORE_LISTENERS ) )
      {
        _csetf_method_before_listeners( v_new, current_value );
      }
      else if( pcase_var.eql( $kw250$AFTER_LISTENERS ) )
      {
        _csetf_method_after_listeners( v_new, current_value );
      }
      else if( pcase_var.eql( $kw251$INSTANTIATE_TEMPLATE ) )
      {
        _csetf_method_instantiate_template( v_new, current_value );
      }
      else
      {
        Errors.error( $str102$Invalid_slot__S_for_construction_, current_arg );
      }
    }
    return v_new;
  }

  @SubLTranslatedFile.SubL(source = "cycl/subloop-structures.lisp", position = 7014L)
  public static SubLObject visit_defstruct_method(final SubLObject obj, final SubLObject visitor_fn)
  {
    Functions.funcall( visitor_fn, obj, $kw103$BEGIN, $sym252$MAKE_METHOD, TWELVE_INTEGER );
    Functions.funcall( visitor_fn, obj, $kw105$SLOT, $kw74$NAME, method_name( obj ) );
    Functions.funcall( visitor_fn, obj, $kw105$SLOT, $kw241$CLASS_NAME, method_class_name( obj ) );
    Functions.funcall( visitor_fn, obj, $kw105$SLOT, $kw242$LAMBDA_LIST, method_lambda_list( obj ) );
    Functions.funcall( visitor_fn, obj, $kw105$SLOT, $kw243$BODY, method_body( obj ) );
    Functions.funcall( visitor_fn, obj, $kw105$SLOT, $kw244$PROTECTION, method_protection( obj ) );
    Functions.funcall( visitor_fn, obj, $kw105$SLOT, $kw245$SCOPE, method_scope( obj ) );
    Functions.funcall( visitor_fn, obj, $kw105$SLOT, $kw246$UPDATE_TYPE, method_update_type( obj ) );
    Functions.funcall( visitor_fn, obj, $kw105$SLOT, $kw247$FUNCTION_NAME, method_function_name( obj ) );
    Functions.funcall( visitor_fn, obj, $kw105$SLOT, $kw248$FUNCTION_DEF, method_function_def( obj ) );
    Functions.funcall( visitor_fn, obj, $kw105$SLOT, $kw249$BEFORE_LISTENERS, method_before_listeners( obj ) );
    Functions.funcall( visitor_fn, obj, $kw105$SLOT, $kw250$AFTER_LISTENERS, method_after_listeners( obj ) );
    Functions.funcall( visitor_fn, obj, $kw105$SLOT, $kw251$INSTANTIATE_TEMPLATE, method_instantiate_template( obj ) );
    Functions.funcall( visitor_fn, obj, $kw106$END, $sym252$MAKE_METHOD, TWELVE_INTEGER );
    return obj;
  }

  @SubLTranslatedFile.SubL(source = "cycl/subloop-structures.lisp", position = 7014L)
  public static SubLObject visit_defstruct_object_method_method(final SubLObject obj, final SubLObject visitor_fn)
  {
    return visit_defstruct_method( obj, visitor_fn );
  }

  @SubLTranslatedFile.SubL(source = "cycl/subloop-structures.lisp", position = 7251L)
  public static SubLObject with_method(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    SubLObject method = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list254 );
    method = current.first();
    final SubLObject forms;
    current = ( forms = current.rest() );
    final SubLObject method_var = Symbols.make_symbol( $str255$method );
    return utilities_macros.generate_instance_variable_bindings_for_structure_slots( method_var, method, $sym256$METHOD_, $list210, forms, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/subloop-structures.lisp", position = 7619L)
  public static SubLObject with_method_private(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    SubLObject method = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list254 );
    method = current.first();
    final SubLObject forms;
    current = ( forms = current.rest() );
    final SubLObject method_var = Symbols.make_symbol( $str255$method );
    return utilities_macros.generate_instance_variable_bindings_for_structure_slots( method_var, method, $sym256$METHOD_, $list210, forms, NIL );
  }

  @SubLTranslatedFile.SubL(source = "cycl/subloop-structures.lisp", position = 7999L)
  public static SubLObject print_method(final SubLObject v_object, final SubLObject stream, final SubLObject depth)
  {
    final SubLObject name = method_name( v_object );
    final SubLObject class_name = method_class_name( v_object );
    final SubLObject lambda_list = method_lambda_list( v_object );
    PrintLow.format( stream, $str257$__METHOD____S__S___S_, new SubLObject[] { name, class_name, lambda_list
    } );
    return v_object;
  }

  @SubLTranslatedFile.SubL(source = "cycl/subloop-structures.lisp", position = 8238L)
  public static SubLObject tablify_method_list(final SubLObject method_list)
  {
    final SubLObject method_list_length = Sequences.length( method_list );
    final SubLObject hashtable_size = method_list_length.isZero() ? $methods_initial_hashtable_size$.getGlobalValue() : Numbers.add( method_list_length, Numbers.floor( method_list_length, FOUR_INTEGER ) );
    final SubLObject hashtable = Hashtables.make_hash_table( hashtable_size, Symbols.symbol_function( EQ ), UNPROVIDED );
    SubLObject cdolist_list_var;
    final SubLObject reversed_method_list = cdolist_list_var = Sequences.reverse( method_list );
    SubLObject method = NIL;
    method = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      final SubLObject method_$1 = method;
      final SubLObject name = method_name( method_$1 );
      Hashtables.sethash( name, hashtable, method );
      cdolist_list_var = cdolist_list_var.rest();
      method = cdolist_list_var.first();
    }
    return hashtable;
  }

  @SubLTranslatedFile.SubL(source = "cycl/subloop-structures.lisp", position = 8832L)
  public static SubLObject method_trace_print_function_trampoline(final SubLObject v_object, final SubLObject stream)
  {
    print_method_trace( v_object, stream, ZERO_INTEGER );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/subloop-structures.lisp", position = 8832L)
  public static SubLObject method_trace_p(final SubLObject v_object)
  {
    return ( v_object.getClass() == $method_trace_native.class ) ? T : NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/subloop-structures.lisp", position = 8832L)
  public static SubLObject method_trace_name(final SubLObject v_object)
  {
    assert NIL != method_trace_p( v_object ) : v_object;
    return v_object.getField2();
  }

  @SubLTranslatedFile.SubL(source = "cycl/subloop-structures.lisp", position = 8832L)
  public static SubLObject method_trace_class_name(final SubLObject v_object)
  {
    assert NIL != method_trace_p( v_object ) : v_object;
    return v_object.getField3();
  }

  @SubLTranslatedFile.SubL(source = "cycl/subloop-structures.lisp", position = 8832L)
  public static SubLObject method_trace_function(final SubLObject v_object)
  {
    assert NIL != method_trace_p( v_object ) : v_object;
    return v_object.getField4();
  }

  @SubLTranslatedFile.SubL(source = "cycl/subloop-structures.lisp", position = 8832L)
  public static SubLObject method_trace_outer(final SubLObject v_object)
  {
    assert NIL != method_trace_p( v_object ) : v_object;
    return v_object.getField5();
  }

  @SubLTranslatedFile.SubL(source = "cycl/subloop-structures.lisp", position = 8832L)
  public static SubLObject _csetf_method_trace_name(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != method_trace_p( v_object ) : v_object;
    return v_object.setField2( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/subloop-structures.lisp", position = 8832L)
  public static SubLObject _csetf_method_trace_class_name(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != method_trace_p( v_object ) : v_object;
    return v_object.setField3( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/subloop-structures.lisp", position = 8832L)
  public static SubLObject _csetf_method_trace_function(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != method_trace_p( v_object ) : v_object;
    return v_object.setField4( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/subloop-structures.lisp", position = 8832L)
  public static SubLObject _csetf_method_trace_outer(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != method_trace_p( v_object ) : v_object;
    return v_object.setField5( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/subloop-structures.lisp", position = 8832L)
  public static SubLObject make_method_trace(SubLObject arglist)
  {
    if( arglist == UNPROVIDED )
    {
      arglist = NIL;
    }
    final SubLObject v_new = new $method_trace_native();
    SubLObject next;
    SubLObject current_arg;
    SubLObject current_value;
    SubLObject pcase_var;
    for( next = NIL, next = arglist; NIL != next; next = conses_high.cddr( next ) )
    {
      current_arg = next.first();
      current_value = conses_high.cadr( next );
      pcase_var = current_arg;
      if( pcase_var.eql( $kw74$NAME ) )
      {
        _csetf_method_trace_name( v_new, current_value );
      }
      else if( pcase_var.eql( $kw241$CLASS_NAME ) )
      {
        _csetf_method_trace_class_name( v_new, current_value );
      }
      else if( pcase_var.eql( $kw276$FUNCTION ) )
      {
        _csetf_method_trace_function( v_new, current_value );
      }
      else if( pcase_var.eql( $kw277$OUTER ) )
      {
        _csetf_method_trace_outer( v_new, current_value );
      }
      else
      {
        Errors.error( $str102$Invalid_slot__S_for_construction_, current_arg );
      }
    }
    return v_new;
  }

  @SubLTranslatedFile.SubL(source = "cycl/subloop-structures.lisp", position = 8832L)
  public static SubLObject visit_defstruct_method_trace(final SubLObject obj, final SubLObject visitor_fn)
  {
    Functions.funcall( visitor_fn, obj, $kw103$BEGIN, $sym278$MAKE_METHOD_TRACE, FOUR_INTEGER );
    Functions.funcall( visitor_fn, obj, $kw105$SLOT, $kw74$NAME, method_trace_name( obj ) );
    Functions.funcall( visitor_fn, obj, $kw105$SLOT, $kw241$CLASS_NAME, method_trace_class_name( obj ) );
    Functions.funcall( visitor_fn, obj, $kw105$SLOT, $kw276$FUNCTION, method_trace_function( obj ) );
    Functions.funcall( visitor_fn, obj, $kw105$SLOT, $kw277$OUTER, method_trace_outer( obj ) );
    Functions.funcall( visitor_fn, obj, $kw106$END, $sym278$MAKE_METHOD_TRACE, FOUR_INTEGER );
    return obj;
  }

  @SubLTranslatedFile.SubL(source = "cycl/subloop-structures.lisp", position = 8832L)
  public static SubLObject visit_defstruct_object_method_trace_method(final SubLObject obj, final SubLObject visitor_fn)
  {
    return visit_defstruct_method_trace( obj, visitor_fn );
  }

  @SubLTranslatedFile.SubL(source = "cycl/subloop-structures.lisp", position = 8941L)
  public static SubLObject with_method_trace(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    SubLObject method_trace = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list280 );
    method_trace = current.first();
    final SubLObject forms;
    current = ( forms = current.rest() );
    final SubLObject method_trace_var = Symbols.make_symbol( $str281$method_trace );
    return utilities_macros.generate_instance_variable_bindings_for_structure_slots( method_trace_var, method_trace, $sym282$METHOD_TRACE_, $list261, forms, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/subloop-structures.lisp", position = 9229L)
  public static SubLObject with_method_trace_private(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    SubLObject method_trace = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list280 );
    method_trace = current.first();
    final SubLObject forms;
    current = ( forms = current.rest() );
    final SubLObject method_trace_var = Symbols.make_symbol( $str281$method_trace );
    return utilities_macros.generate_instance_variable_bindings_for_structure_slots( method_trace_var, method_trace, $sym282$METHOD_TRACE_, $list261, forms, NIL );
  }

  @SubLTranslatedFile.SubL(source = "cycl/subloop-structures.lisp", position = 9529L)
  public static SubLObject print_method_trace(final SubLObject v_object, final SubLObject stream, final SubLObject depth)
  {
    final SubLObject name = method_trace_name( v_object );
    final SubLObject class_name = method_trace_class_name( v_object );
    PrintLow.format( stream, $str283$__METHOD_TRACE____S__S__, name, class_name );
    return v_object;
  }

  @SubLTranslatedFile.SubL(source = "cycl/subloop-structures.lisp", position = 9711L)
  public static SubLObject push_method_trace(final SubLObject name, final SubLObject class_name, final SubLObject function)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL != $method_trace_on$.getDynamicValue( thread ) )
    {
      final SubLObject new_method_trace = make_method_trace( UNPROVIDED );
      _csetf_method_trace_name( new_method_trace, name );
      _csetf_method_trace_class_name( new_method_trace, class_name );
      _csetf_method_trace_function( new_method_trace, function );
      _csetf_method_trace_outer( new_method_trace, $methods_current_method_trace$.getDynamicValue( thread ) );
      return new_method_trace;
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/subloop-structures.lisp", position = 10175L)
  public static SubLObject method_info_print_function_trampoline(final SubLObject v_object, final SubLObject stream)
  {
    compatibility.default_struct_print_function( v_object, stream, ZERO_INTEGER );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/subloop-structures.lisp", position = 10175L)
  public static SubLObject method_info_p(final SubLObject v_object)
  {
    return ( v_object.getClass() == $method_info_native.class ) ? T : NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/subloop-structures.lisp", position = 10175L)
  public static SubLObject mi_method_name(final SubLObject v_object)
  {
    assert NIL != method_info_p( v_object ) : v_object;
    return v_object.getField2();
  }

  @SubLTranslatedFile.SubL(source = "cycl/subloop-structures.lisp", position = 10175L)
  public static SubLObject mi_class_name(final SubLObject v_object)
  {
    assert NIL != method_info_p( v_object ) : v_object;
    return v_object.getField3();
  }

  @SubLTranslatedFile.SubL(source = "cycl/subloop-structures.lisp", position = 10175L)
  public static SubLObject mi_mv_used_in_body(final SubLObject v_object)
  {
    assert NIL != method_info_p( v_object ) : v_object;
    return v_object.getField4();
  }

  @SubLTranslatedFile.SubL(source = "cycl/subloop-structures.lisp", position = 10175L)
  public static SubLObject mi_mv_modified_in_body(final SubLObject v_object)
  {
    assert NIL != method_info_p( v_object ) : v_object;
    return v_object.getField5();
  }

  @SubLTranslatedFile.SubL(source = "cycl/subloop-structures.lisp", position = 10175L)
  public static SubLObject mi_methods_used_in_body(final SubLObject v_object)
  {
    assert NIL != method_info_p( v_object ) : v_object;
    return v_object.getField6();
  }

  @SubLTranslatedFile.SubL(source = "cycl/subloop-structures.lisp", position = 10175L)
  public static SubLObject _csetf_mi_method_name(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != method_info_p( v_object ) : v_object;
    return v_object.setField2( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/subloop-structures.lisp", position = 10175L)
  public static SubLObject _csetf_mi_class_name(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != method_info_p( v_object ) : v_object;
    return v_object.setField3( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/subloop-structures.lisp", position = 10175L)
  public static SubLObject _csetf_mi_mv_used_in_body(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != method_info_p( v_object ) : v_object;
    return v_object.setField4( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/subloop-structures.lisp", position = 10175L)
  public static SubLObject _csetf_mi_mv_modified_in_body(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != method_info_p( v_object ) : v_object;
    return v_object.setField5( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/subloop-structures.lisp", position = 10175L)
  public static SubLObject _csetf_mi_methods_used_in_body(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != method_info_p( v_object ) : v_object;
    return v_object.setField6( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/subloop-structures.lisp", position = 10175L)
  public static SubLObject make_method_info(SubLObject arglist)
  {
    if( arglist == UNPROVIDED )
    {
      arglist = NIL;
    }
    final SubLObject v_new = new $method_info_native();
    SubLObject next;
    SubLObject current_arg;
    SubLObject current_value;
    SubLObject pcase_var;
    for( next = NIL, next = arglist; NIL != next; next = conses_high.cddr( next ) )
    {
      current_arg = next.first();
      current_value = conses_high.cadr( next );
      pcase_var = current_arg;
      if( pcase_var.eql( $kw303$METHOD_NAME ) )
      {
        _csetf_mi_method_name( v_new, current_value );
      }
      else if( pcase_var.eql( $kw241$CLASS_NAME ) )
      {
        _csetf_mi_class_name( v_new, current_value );
      }
      else if( pcase_var.eql( $kw304$MV_USED_IN_BODY ) )
      {
        _csetf_mi_mv_used_in_body( v_new, current_value );
      }
      else if( pcase_var.eql( $kw305$MV_MODIFIED_IN_BODY ) )
      {
        _csetf_mi_mv_modified_in_body( v_new, current_value );
      }
      else if( pcase_var.eql( $kw306$METHODS_USED_IN_BODY ) )
      {
        _csetf_mi_methods_used_in_body( v_new, current_value );
      }
      else
      {
        Errors.error( $str102$Invalid_slot__S_for_construction_, current_arg );
      }
    }
    return v_new;
  }

  @SubLTranslatedFile.SubL(source = "cycl/subloop-structures.lisp", position = 10175L)
  public static SubLObject visit_defstruct_method_info(final SubLObject obj, final SubLObject visitor_fn)
  {
    Functions.funcall( visitor_fn, obj, $kw103$BEGIN, $sym307$MAKE_METHOD_INFO, FIVE_INTEGER );
    Functions.funcall( visitor_fn, obj, $kw105$SLOT, $kw303$METHOD_NAME, mi_method_name( obj ) );
    Functions.funcall( visitor_fn, obj, $kw105$SLOT, $kw241$CLASS_NAME, mi_class_name( obj ) );
    Functions.funcall( visitor_fn, obj, $kw105$SLOT, $kw304$MV_USED_IN_BODY, mi_mv_used_in_body( obj ) );
    Functions.funcall( visitor_fn, obj, $kw105$SLOT, $kw305$MV_MODIFIED_IN_BODY, mi_mv_modified_in_body( obj ) );
    Functions.funcall( visitor_fn, obj, $kw105$SLOT, $kw306$METHODS_USED_IN_BODY, mi_methods_used_in_body( obj ) );
    Functions.funcall( visitor_fn, obj, $kw106$END, $sym307$MAKE_METHOD_INFO, FIVE_INTEGER );
    return obj;
  }

  @SubLTranslatedFile.SubL(source = "cycl/subloop-structures.lisp", position = 10175L)
  public static SubLObject visit_defstruct_object_method_info_method(final SubLObject obj, final SubLObject visitor_fn)
  {
    return visit_defstruct_method_info( obj, visitor_fn );
  }

  @SubLTranslatedFile.SubL(source = "cycl/subloop-structures.lisp", position = 10314L)
  public static SubLObject with_method_info(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    SubLObject method_info = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list309 );
    method_info = current.first();
    final SubLObject forms;
    current = ( forms = current.rest() );
    final SubLObject method_info_var = Symbols.make_symbol( $str310$method_info );
    return utilities_macros.generate_instance_variable_bindings_for_structure_slots( method_info_var, method_info, $sym311$MI_, $list286, forms, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/subloop-structures.lisp", position = 10645L)
  public static SubLObject with_method_info_private(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    SubLObject method_info = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list309 );
    method_info = current.first();
    final SubLObject forms;
    current = ( forms = current.rest() );
    final SubLObject method_info_var = Symbols.make_symbol( $str310$method_info );
    return utilities_macros.generate_instance_variable_bindings_for_structure_slots( method_info_var, method_info, $sym311$MI_, $list286, forms, NIL );
  }

  @SubLTranslatedFile.SubL(source = "cycl/subloop-structures.lisp", position = 10988L)
  public static SubLObject slot_listener_print_function_trampoline(final SubLObject v_object, final SubLObject stream)
  {
    print_slot_listener( v_object, stream, ZERO_INTEGER );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/subloop-structures.lisp", position = 10988L)
  public static SubLObject slot_listener_p(final SubLObject v_object)
  {
    return ( v_object.getClass() == $slot_listener_native.class ) ? T : NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/subloop-structures.lisp", position = 10988L)
  public static SubLObject sl_slot_name(final SubLObject v_object)
  {
    assert NIL != slot_listener_p( v_object ) : v_object;
    return v_object.getField2();
  }

  @SubLTranslatedFile.SubL(source = "cycl/subloop-structures.lisp", position = 10988L)
  public static SubLObject sl_demon_type(final SubLObject v_object)
  {
    assert NIL != slot_listener_p( v_object ) : v_object;
    return v_object.getField3();
  }

  @SubLTranslatedFile.SubL(source = "cycl/subloop-structures.lisp", position = 10988L)
  public static SubLObject sl_value_trigger(final SubLObject v_object)
  {
    assert NIL != slot_listener_p( v_object ) : v_object;
    return v_object.getField4();
  }

  @SubLTranslatedFile.SubL(source = "cycl/subloop-structures.lisp", position = 10988L)
  public static SubLObject sl_functional_type(final SubLObject v_object)
  {
    assert NIL != slot_listener_p( v_object ) : v_object;
    return v_object.getField5();
  }

  @SubLTranslatedFile.SubL(source = "cycl/subloop-structures.lisp", position = 10988L)
  public static SubLObject sl_isa_method(final SubLObject v_object)
  {
    assert NIL != slot_listener_p( v_object ) : v_object;
    return v_object.getField6();
  }

  @SubLTranslatedFile.SubL(source = "cycl/subloop-structures.lisp", position = 10988L)
  public static SubLObject sl_target_instance(final SubLObject v_object)
  {
    assert NIL != slot_listener_p( v_object ) : v_object;
    return v_object.getField7();
  }

  @SubLTranslatedFile.SubL(source = "cycl/subloop-structures.lisp", position = 10988L)
  public static SubLObject _csetf_sl_slot_name(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != slot_listener_p( v_object ) : v_object;
    return v_object.setField2( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/subloop-structures.lisp", position = 10988L)
  public static SubLObject _csetf_sl_demon_type(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != slot_listener_p( v_object ) : v_object;
    return v_object.setField3( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/subloop-structures.lisp", position = 10988L)
  public static SubLObject _csetf_sl_value_trigger(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != slot_listener_p( v_object ) : v_object;
    return v_object.setField4( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/subloop-structures.lisp", position = 10988L)
  public static SubLObject _csetf_sl_functional_type(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != slot_listener_p( v_object ) : v_object;
    return v_object.setField5( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/subloop-structures.lisp", position = 10988L)
  public static SubLObject _csetf_sl_isa_method(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != slot_listener_p( v_object ) : v_object;
    return v_object.setField6( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/subloop-structures.lisp", position = 10988L)
  public static SubLObject _csetf_sl_target_instance(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != slot_listener_p( v_object ) : v_object;
    return v_object.setField7( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/subloop-structures.lisp", position = 10988L)
  public static SubLObject make_slot_listener(SubLObject arglist)
  {
    if( arglist == UNPROVIDED )
    {
      arglist = NIL;
    }
    final SubLObject v_new = new $slot_listener_native();
    SubLObject next;
    SubLObject current_arg;
    SubLObject current_value;
    SubLObject pcase_var;
    for( next = NIL, next = arglist; NIL != next; next = conses_high.cddr( next ) )
    {
      current_arg = next.first();
      current_value = conses_high.cadr( next );
      pcase_var = current_arg;
      if( pcase_var.eql( $kw333$SLOT_NAME ) )
      {
        _csetf_sl_slot_name( v_new, current_value );
      }
      else if( pcase_var.eql( $kw334$DEMON_TYPE ) )
      {
        _csetf_sl_demon_type( v_new, current_value );
      }
      else if( pcase_var.eql( $kw335$VALUE_TRIGGER ) )
      {
        _csetf_sl_value_trigger( v_new, current_value );
      }
      else if( pcase_var.eql( $kw336$FUNCTIONAL_TYPE ) )
      {
        _csetf_sl_functional_type( v_new, current_value );
      }
      else if( pcase_var.eql( $kw337$ISA_METHOD ) )
      {
        _csetf_sl_isa_method( v_new, current_value );
      }
      else if( pcase_var.eql( $kw338$TARGET_INSTANCE ) )
      {
        _csetf_sl_target_instance( v_new, current_value );
      }
      else
      {
        Errors.error( $str102$Invalid_slot__S_for_construction_, current_arg );
      }
    }
    return v_new;
  }

  @SubLTranslatedFile.SubL(source = "cycl/subloop-structures.lisp", position = 10988L)
  public static SubLObject visit_defstruct_slot_listener(final SubLObject obj, final SubLObject visitor_fn)
  {
    Functions.funcall( visitor_fn, obj, $kw103$BEGIN, $sym339$MAKE_SLOT_LISTENER, SIX_INTEGER );
    Functions.funcall( visitor_fn, obj, $kw105$SLOT, $kw333$SLOT_NAME, sl_slot_name( obj ) );
    Functions.funcall( visitor_fn, obj, $kw105$SLOT, $kw334$DEMON_TYPE, sl_demon_type( obj ) );
    Functions.funcall( visitor_fn, obj, $kw105$SLOT, $kw335$VALUE_TRIGGER, sl_value_trigger( obj ) );
    Functions.funcall( visitor_fn, obj, $kw105$SLOT, $kw336$FUNCTIONAL_TYPE, sl_functional_type( obj ) );
    Functions.funcall( visitor_fn, obj, $kw105$SLOT, $kw337$ISA_METHOD, sl_isa_method( obj ) );
    Functions.funcall( visitor_fn, obj, $kw105$SLOT, $kw338$TARGET_INSTANCE, sl_target_instance( obj ) );
    Functions.funcall( visitor_fn, obj, $kw106$END, $sym339$MAKE_SLOT_LISTENER, SIX_INTEGER );
    return obj;
  }

  @SubLTranslatedFile.SubL(source = "cycl/subloop-structures.lisp", position = 10988L)
  public static SubLObject visit_defstruct_object_slot_listener_method(final SubLObject obj, final SubLObject visitor_fn)
  {
    return visit_defstruct_slot_listener( obj, visitor_fn );
  }

  @SubLTranslatedFile.SubL(source = "cycl/subloop-structures.lisp", position = 11653L)
  public static SubLObject print_slot_listener(final SubLObject v_object, final SubLObject stream, final SubLObject depth)
  {
    PrintLow.format( stream, $str341$__SLOT_LISTENER_for_Slot__S___S__, new SubLObject[] { sl_slot_name( v_object ), sl_demon_type( v_object ), sl_value_trigger( v_object )
    } );
    return v_object;
  }

  @SubLTranslatedFile.SubL(source = "cycl/subloop-structures.lisp", position = 11875L)
  public static SubLObject with_slot_listener(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    SubLObject slot_listener = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list342 );
    slot_listener = current.first();
    final SubLObject forms;
    current = ( forms = current.rest() );
    final SubLObject slot_listener_var = Symbols.make_symbol( $str343$slot_listener );
    return utilities_macros.generate_instance_variable_bindings_for_structure_slots( slot_listener_var, slot_listener, $sym344$SL_, $list314, forms, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/subloop-structures.lisp", position = 12196L)
  public static SubLObject with_slot_listener_private(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    SubLObject slot_listener = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list342 );
    slot_listener = current.first();
    final SubLObject forms;
    current = ( forms = current.rest() );
    final SubLObject slot_listener_var = Symbols.make_symbol( $str343$slot_listener );
    return utilities_macros.generate_instance_variable_bindings_for_structure_slots( slot_listener_var, slot_listener, $sym344$SL_, $list314, forms, NIL );
  }

  @SubLTranslatedFile.SubL(source = "cycl/subloop-structures.lisp", position = 12529L)
  public static SubLObject slot_listener_registry_print_function_trampoline(final SubLObject v_object, final SubLObject stream)
  {
    compatibility.default_struct_print_function( v_object, stream, ZERO_INTEGER );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/subloop-structures.lisp", position = 12529L)
  public static SubLObject slot_listener_registry_p(final SubLObject v_object)
  {
    return ( v_object.getClass() == $slot_listener_registry_native.class ) ? T : NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/subloop-structures.lisp", position = 12529L)
  public static SubLObject slr_instance(final SubLObject v_object)
  {
    assert NIL != slot_listener_registry_p( v_object ) : v_object;
    return v_object.getField2();
  }

  @SubLTranslatedFile.SubL(source = "cycl/subloop-structures.lisp", position = 12529L)
  public static SubLObject slr_slot_count(final SubLObject v_object)
  {
    assert NIL != slot_listener_registry_p( v_object ) : v_object;
    return v_object.getField3();
  }

  @SubLTranslatedFile.SubL(source = "cycl/subloop-structures.lisp", position = 12529L)
  public static SubLObject slr_listeners_vector(final SubLObject v_object)
  {
    assert NIL != slot_listener_registry_p( v_object ) : v_object;
    return v_object.getField4();
  }

  @SubLTranslatedFile.SubL(source = "cycl/subloop-structures.lisp", position = 12529L)
  public static SubLObject _csetf_slr_instance(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != slot_listener_registry_p( v_object ) : v_object;
    return v_object.setField2( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/subloop-structures.lisp", position = 12529L)
  public static SubLObject _csetf_slr_slot_count(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != slot_listener_registry_p( v_object ) : v_object;
    return v_object.setField3( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/subloop-structures.lisp", position = 12529L)
  public static SubLObject _csetf_slr_listeners_vector(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != slot_listener_registry_p( v_object ) : v_object;
    return v_object.setField4( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/subloop-structures.lisp", position = 12529L)
  public static SubLObject make_slot_listener_registry(SubLObject arglist)
  {
    if( arglist == UNPROVIDED )
    {
      arglist = NIL;
    }
    final SubLObject v_new = new $slot_listener_registry_native();
    SubLObject next;
    SubLObject current_arg;
    SubLObject current_value;
    SubLObject pcase_var;
    for( next = NIL, next = arglist; NIL != next; next = conses_high.cddr( next ) )
    {
      current_arg = next.first();
      current_value = conses_high.cadr( next );
      pcase_var = current_arg;
      if( pcase_var.eql( $kw359$INSTANCE ) )
      {
        _csetf_slr_instance( v_new, current_value );
      }
      else if( pcase_var.eql( $kw360$SLOT_COUNT ) )
      {
        _csetf_slr_slot_count( v_new, current_value );
      }
      else if( pcase_var.eql( $kw361$LISTENERS_VECTOR ) )
      {
        _csetf_slr_listeners_vector( v_new, current_value );
      }
      else
      {
        Errors.error( $str102$Invalid_slot__S_for_construction_, current_arg );
      }
    }
    return v_new;
  }

  @SubLTranslatedFile.SubL(source = "cycl/subloop-structures.lisp", position = 12529L)
  public static SubLObject visit_defstruct_slot_listener_registry(final SubLObject obj, final SubLObject visitor_fn)
  {
    Functions.funcall( visitor_fn, obj, $kw103$BEGIN, $sym362$MAKE_SLOT_LISTENER_REGISTRY, THREE_INTEGER );
    Functions.funcall( visitor_fn, obj, $kw105$SLOT, $kw359$INSTANCE, slr_instance( obj ) );
    Functions.funcall( visitor_fn, obj, $kw105$SLOT, $kw360$SLOT_COUNT, slr_slot_count( obj ) );
    Functions.funcall( visitor_fn, obj, $kw105$SLOT, $kw361$LISTENERS_VECTOR, slr_listeners_vector( obj ) );
    Functions.funcall( visitor_fn, obj, $kw106$END, $sym362$MAKE_SLOT_LISTENER_REGISTRY, THREE_INTEGER );
    return obj;
  }

  @SubLTranslatedFile.SubL(source = "cycl/subloop-structures.lisp", position = 12529L)
  public static SubLObject visit_defstruct_object_slot_listener_registry_method(final SubLObject obj, final SubLObject visitor_fn)
  {
    return visit_defstruct_slot_listener_registry( obj, visitor_fn );
  }

  @SubLTranslatedFile.SubL(source = "cycl/subloop-structures.lisp", position = 12822L)
  public static SubLObject print_slot_listener_registry(final SubLObject v_object, final SubLObject stream, final SubLObject depth)
  {
    PrintLow.format( stream, $str364$__SLOT_LISTENER_REGISTRY___S__SLO, slr_instance( v_object ), slr_slot_count( v_object ) );
    return v_object;
  }

  @SubLTranslatedFile.SubL(source = "cycl/subloop-structures.lisp", position = 13036L)
  public static SubLObject with_slot_listener_registry(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    SubLObject slot_listener_registry = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list365 );
    slot_listener_registry = current.first();
    final SubLObject forms;
    current = ( forms = current.rest() );
    final SubLObject slot_listener_registry_var = Symbols.make_symbol( $str366$slot_listener_registry );
    return utilities_macros.generate_instance_variable_bindings_for_structure_slots( slot_listener_registry_var, slot_listener_registry, $sym367$SLR_, $list347, forms, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/subloop-structures.lisp", position = 13371L)
  public static SubLObject with_slot_listener_registry_private(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    SubLObject slot_listener_registry = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list365 );
    slot_listener_registry = current.first();
    final SubLObject forms;
    current = ( forms = current.rest() );
    final SubLObject slot_listener_registry_var = Symbols.make_symbol( $str366$slot_listener_registry );
    return utilities_macros.generate_instance_variable_bindings_for_structure_slots( slot_listener_registry_var, slot_listener_registry, $sym367$SLR_, $list347, forms, NIL );
  }

  @SubLTranslatedFile.SubL(source = "cycl/subloop-structures.lisp", position = 13718L)
  public static SubLObject method_listener_print_function_trampoline(final SubLObject v_object, final SubLObject stream)
  {
    print_method_listener( v_object, stream, ZERO_INTEGER );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/subloop-structures.lisp", position = 13718L)
  public static SubLObject method_listener_p(final SubLObject v_object)
  {
    return ( v_object.getClass() == $method_listener_native.class ) ? T : NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/subloop-structures.lisp", position = 13718L)
  public static SubLObject ml_owning_method_name(final SubLObject v_object)
  {
    assert NIL != method_listener_p( v_object ) : v_object;
    return v_object.getField2();
  }

  @SubLTranslatedFile.SubL(source = "cycl/subloop-structures.lisp", position = 13718L)
  public static SubLObject ml_owning_class_name(final SubLObject v_object)
  {
    assert NIL != method_listener_p( v_object ) : v_object;
    return v_object.getField3();
  }

  @SubLTranslatedFile.SubL(source = "cycl/subloop-structures.lisp", position = 13718L)
  public static SubLObject ml_demon_type(final SubLObject v_object)
  {
    assert NIL != method_listener_p( v_object ) : v_object;
    return v_object.getField4();
  }

  @SubLTranslatedFile.SubL(source = "cycl/subloop-structures.lisp", position = 13718L)
  public static SubLObject ml_detail(final SubLObject v_object)
  {
    assert NIL != method_listener_p( v_object ) : v_object;
    return v_object.getField5();
  }

  @SubLTranslatedFile.SubL(source = "cycl/subloop-structures.lisp", position = 13718L)
  public static SubLObject _csetf_ml_owning_method_name(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != method_listener_p( v_object ) : v_object;
    return v_object.setField2( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/subloop-structures.lisp", position = 13718L)
  public static SubLObject _csetf_ml_owning_class_name(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != method_listener_p( v_object ) : v_object;
    return v_object.setField3( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/subloop-structures.lisp", position = 13718L)
  public static SubLObject _csetf_ml_demon_type(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != method_listener_p( v_object ) : v_object;
    return v_object.setField4( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/subloop-structures.lisp", position = 13718L)
  public static SubLObject _csetf_ml_detail(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != method_listener_p( v_object ) : v_object;
    return v_object.setField5( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/subloop-structures.lisp", position = 13718L)
  public static SubLObject make_method_listener(SubLObject arglist)
  {
    if( arglist == UNPROVIDED )
    {
      arglist = NIL;
    }
    final SubLObject v_new = new $method_listener_native();
    SubLObject next;
    SubLObject current_arg;
    SubLObject current_value;
    SubLObject pcase_var;
    for( next = NIL, next = arglist; NIL != next; next = conses_high.cddr( next ) )
    {
      current_arg = next.first();
      current_value = conses_high.cadr( next );
      pcase_var = current_arg;
      if( pcase_var.eql( $kw385$OWNING_METHOD_NAME ) )
      {
        _csetf_ml_owning_method_name( v_new, current_value );
      }
      else if( pcase_var.eql( $kw386$OWNING_CLASS_NAME ) )
      {
        _csetf_ml_owning_class_name( v_new, current_value );
      }
      else if( pcase_var.eql( $kw334$DEMON_TYPE ) )
      {
        _csetf_ml_demon_type( v_new, current_value );
      }
      else if( pcase_var.eql( $kw387$DETAIL ) )
      {
        _csetf_ml_detail( v_new, current_value );
      }
      else
      {
        Errors.error( $str102$Invalid_slot__S_for_construction_, current_arg );
      }
    }
    return v_new;
  }

  @SubLTranslatedFile.SubL(source = "cycl/subloop-structures.lisp", position = 13718L)
  public static SubLObject visit_defstruct_method_listener(final SubLObject obj, final SubLObject visitor_fn)
  {
    Functions.funcall( visitor_fn, obj, $kw103$BEGIN, $sym388$MAKE_METHOD_LISTENER, FOUR_INTEGER );
    Functions.funcall( visitor_fn, obj, $kw105$SLOT, $kw385$OWNING_METHOD_NAME, ml_owning_method_name( obj ) );
    Functions.funcall( visitor_fn, obj, $kw105$SLOT, $kw386$OWNING_CLASS_NAME, ml_owning_class_name( obj ) );
    Functions.funcall( visitor_fn, obj, $kw105$SLOT, $kw334$DEMON_TYPE, ml_demon_type( obj ) );
    Functions.funcall( visitor_fn, obj, $kw105$SLOT, $kw387$DETAIL, ml_detail( obj ) );
    Functions.funcall( visitor_fn, obj, $kw106$END, $sym388$MAKE_METHOD_LISTENER, FOUR_INTEGER );
    return obj;
  }

  @SubLTranslatedFile.SubL(source = "cycl/subloop-structures.lisp", position = 13718L)
  public static SubLObject visit_defstruct_object_method_listener_method(final SubLObject obj, final SubLObject visitor_fn)
  {
    return visit_defstruct_method_listener( obj, visitor_fn );
  }

  @SubLTranslatedFile.SubL(source = "cycl/subloop-structures.lisp", position = 14066L)
  public static SubLObject with_method_listener(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    SubLObject method_listener = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list390 );
    method_listener = current.first();
    final SubLObject forms;
    current = ( forms = current.rest() );
    final SubLObject method_listener_var = Symbols.make_symbol( $str391$method_listener );
    return utilities_macros.generate_instance_variable_bindings_for_structure_slots( method_listener_var, method_listener, $sym392$ML_, $list370, forms, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/subloop-structures.lisp", position = 14446L)
  public static SubLObject with_method_listener_private(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    SubLObject method_listener = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list390 );
    method_listener = current.first();
    final SubLObject forms;
    current = ( forms = current.rest() );
    final SubLObject method_listener_var = Symbols.make_symbol( $str391$method_listener );
    return utilities_macros.generate_instance_variable_bindings_for_structure_slots( method_listener_var, method_listener, $sym392$ML_, $list370, forms, NIL );
  }

  @SubLTranslatedFile.SubL(source = "cycl/subloop-structures.lisp", position = 14768L)
  public static SubLObject function_detail_print_function_trampoline(final SubLObject v_object, final SubLObject stream)
  {
    compatibility.default_struct_print_function( v_object, stream, ZERO_INTEGER );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/subloop-structures.lisp", position = 14768L)
  public static SubLObject function_detail_p(final SubLObject v_object)
  {
    return ( v_object.getClass() == $function_detail_native.class ) ? T : NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/subloop-structures.lisp", position = 14768L)
  public static SubLObject fd_function_name(final SubLObject v_object)
  {
    assert NIL != function_detail_p( v_object ) : v_object;
    return v_object.getField2();
  }

  @SubLTranslatedFile.SubL(source = "cycl/subloop-structures.lisp", position = 14768L)
  public static SubLObject fd_arglist(final SubLObject v_object)
  {
    assert NIL != function_detail_p( v_object ) : v_object;
    return v_object.getField3();
  }

  @SubLTranslatedFile.SubL(source = "cycl/subloop-structures.lisp", position = 14768L)
  public static SubLObject _csetf_fd_function_name(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != function_detail_p( v_object ) : v_object;
    return v_object.setField2( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/subloop-structures.lisp", position = 14768L)
  public static SubLObject _csetf_fd_arglist(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != function_detail_p( v_object ) : v_object;
    return v_object.setField3( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/subloop-structures.lisp", position = 14768L)
  public static SubLObject make_function_detail(SubLObject arglist)
  {
    if( arglist == UNPROVIDED )
    {
      arglist = NIL;
    }
    final SubLObject v_new = new $function_detail_native();
    SubLObject next;
    SubLObject current_arg;
    SubLObject current_value;
    SubLObject pcase_var;
    for( next = NIL, next = arglist; NIL != next; next = conses_high.cddr( next ) )
    {
      current_arg = next.first();
      current_value = conses_high.cadr( next );
      pcase_var = current_arg;
      if( pcase_var.eql( $kw247$FUNCTION_NAME ) )
      {
        _csetf_fd_function_name( v_new, current_value );
      }
      else if( pcase_var.eql( $kw405$ARGLIST ) )
      {
        _csetf_fd_arglist( v_new, current_value );
      }
      else
      {
        Errors.error( $str102$Invalid_slot__S_for_construction_, current_arg );
      }
    }
    return v_new;
  }

  @SubLTranslatedFile.SubL(source = "cycl/subloop-structures.lisp", position = 14768L)
  public static SubLObject visit_defstruct_function_detail(final SubLObject obj, final SubLObject visitor_fn)
  {
    Functions.funcall( visitor_fn, obj, $kw103$BEGIN, $sym406$MAKE_FUNCTION_DETAIL, TWO_INTEGER );
    Functions.funcall( visitor_fn, obj, $kw105$SLOT, $kw247$FUNCTION_NAME, fd_function_name( obj ) );
    Functions.funcall( visitor_fn, obj, $kw105$SLOT, $kw405$ARGLIST, fd_arglist( obj ) );
    Functions.funcall( visitor_fn, obj, $kw106$END, $sym406$MAKE_FUNCTION_DETAIL, TWO_INTEGER );
    return obj;
  }

  @SubLTranslatedFile.SubL(source = "cycl/subloop-structures.lisp", position = 14768L)
  public static SubLObject visit_defstruct_object_function_detail_method(final SubLObject obj, final SubLObject visitor_fn)
  {
    return visit_defstruct_function_detail( obj, visitor_fn );
  }

  @SubLTranslatedFile.SubL(source = "cycl/subloop-structures.lisp", position = 14847L)
  public static SubLObject with_function_detail(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    SubLObject function_detail = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list408 );
    function_detail = current.first();
    final SubLObject forms;
    current = ( forms = current.rest() );
    final SubLObject function_detail_var = Symbols.make_symbol( $str409$function_detail );
    return utilities_macros.generate_instance_variable_bindings_for_structure_slots( function_detail_var, function_detail, $sym410$FD_, $list395, forms, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/subloop-structures.lisp", position = 15124L)
  public static SubLObject with_function_detail_private(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    SubLObject function_detail = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list408 );
    function_detail = current.first();
    final SubLObject forms;
    current = ( forms = current.rest() );
    final SubLObject function_detail_var = Symbols.make_symbol( $str409$function_detail );
    return utilities_macros.generate_instance_variable_bindings_for_structure_slots( function_detail_var, function_detail, $sym410$FD_, $list395, forms, NIL );
  }

  @SubLTranslatedFile.SubL(source = "cycl/subloop-structures.lisp", position = 15413L)
  public static SubLObject method_detail_print_function_trampoline(final SubLObject v_object, final SubLObject stream)
  {
    compatibility.default_struct_print_function( v_object, stream, ZERO_INTEGER );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/subloop-structures.lisp", position = 15413L)
  public static SubLObject method_detail_p(final SubLObject v_object)
  {
    return ( v_object.getClass() == $method_detail_native.class ) ? T : NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/subloop-structures.lisp", position = 15413L)
  public static SubLObject md_method_name(final SubLObject v_object)
  {
    assert NIL != method_detail_p( v_object ) : v_object;
    return v_object.getField2();
  }

  @SubLTranslatedFile.SubL(source = "cycl/subloop-structures.lisp", position = 15413L)
  public static SubLObject md_function_name(final SubLObject v_object)
  {
    assert NIL != method_detail_p( v_object ) : v_object;
    return v_object.getField3();
  }

  @SubLTranslatedFile.SubL(source = "cycl/subloop-structures.lisp", position = 15413L)
  public static SubLObject md_arglist(final SubLObject v_object)
  {
    assert NIL != method_detail_p( v_object ) : v_object;
    return v_object.getField4();
  }

  @SubLTranslatedFile.SubL(source = "cycl/subloop-structures.lisp", position = 15413L)
  public static SubLObject md_instance(final SubLObject v_object)
  {
    assert NIL != method_detail_p( v_object ) : v_object;
    return v_object.getField5();
  }

  @SubLTranslatedFile.SubL(source = "cycl/subloop-structures.lisp", position = 15413L)
  public static SubLObject _csetf_md_method_name(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != method_detail_p( v_object ) : v_object;
    return v_object.setField2( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/subloop-structures.lisp", position = 15413L)
  public static SubLObject _csetf_md_function_name(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != method_detail_p( v_object ) : v_object;
    return v_object.setField3( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/subloop-structures.lisp", position = 15413L)
  public static SubLObject _csetf_md_arglist(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != method_detail_p( v_object ) : v_object;
    return v_object.setField4( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/subloop-structures.lisp", position = 15413L)
  public static SubLObject _csetf_md_instance(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != method_detail_p( v_object ) : v_object;
    return v_object.setField5( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/subloop-structures.lisp", position = 15413L)
  public static SubLObject make_method_detail(SubLObject arglist)
  {
    if( arglist == UNPROVIDED )
    {
      arglist = NIL;
    }
    final SubLObject v_new = new $method_detail_native();
    SubLObject next;
    SubLObject current_arg;
    SubLObject current_value;
    SubLObject pcase_var;
    for( next = NIL, next = arglist; NIL != next; next = conses_high.cddr( next ) )
    {
      current_arg = next.first();
      current_value = conses_high.cadr( next );
      pcase_var = current_arg;
      if( pcase_var.eql( $kw303$METHOD_NAME ) )
      {
        _csetf_md_method_name( v_new, current_value );
      }
      else if( pcase_var.eql( $kw247$FUNCTION_NAME ) )
      {
        _csetf_md_function_name( v_new, current_value );
      }
      else if( pcase_var.eql( $kw405$ARGLIST ) )
      {
        _csetf_md_arglist( v_new, current_value );
      }
      else if( pcase_var.eql( $kw359$INSTANCE ) )
      {
        _csetf_md_instance( v_new, current_value );
      }
      else
      {
        Errors.error( $str102$Invalid_slot__S_for_construction_, current_arg );
      }
    }
    return v_new;
  }

  @SubLTranslatedFile.SubL(source = "cycl/subloop-structures.lisp", position = 15413L)
  public static SubLObject visit_defstruct_method_detail(final SubLObject obj, final SubLObject visitor_fn)
  {
    Functions.funcall( visitor_fn, obj, $kw103$BEGIN, $sym427$MAKE_METHOD_DETAIL, FOUR_INTEGER );
    Functions.funcall( visitor_fn, obj, $kw105$SLOT, $kw303$METHOD_NAME, md_method_name( obj ) );
    Functions.funcall( visitor_fn, obj, $kw105$SLOT, $kw247$FUNCTION_NAME, md_function_name( obj ) );
    Functions.funcall( visitor_fn, obj, $kw105$SLOT, $kw405$ARGLIST, md_arglist( obj ) );
    Functions.funcall( visitor_fn, obj, $kw105$SLOT, $kw359$INSTANCE, md_instance( obj ) );
    Functions.funcall( visitor_fn, obj, $kw106$END, $sym427$MAKE_METHOD_DETAIL, FOUR_INTEGER );
    return obj;
  }

  @SubLTranslatedFile.SubL(source = "cycl/subloop-structures.lisp", position = 15413L)
  public static SubLObject visit_defstruct_object_method_detail_method(final SubLObject obj, final SubLObject visitor_fn)
  {
    return visit_defstruct_method_detail( obj, visitor_fn );
  }

  @SubLTranslatedFile.SubL(source = "cycl/subloop-structures.lisp", position = 15515L)
  public static SubLObject with_method_detail(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    SubLObject method_detail = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list429 );
    method_detail = current.first();
    final SubLObject forms;
    current = ( forms = current.rest() );
    final SubLObject method_detail_var = Symbols.make_symbol( $str430$method_detail );
    return utilities_macros.generate_instance_variable_bindings_for_structure_slots( method_detail_var, method_detail, $sym431$MD_, $list413, forms, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/subloop-structures.lisp", position = 15801L)
  public static SubLObject with_method_detail_private(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    SubLObject method_detail = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list429 );
    method_detail = current.first();
    final SubLObject forms;
    current = ( forms = current.rest() );
    final SubLObject method_detail_var = Symbols.make_symbol( $str430$method_detail );
    return utilities_macros.generate_instance_variable_bindings_for_structure_slots( method_detail_var, method_detail, $sym431$MD_, $list413, forms, NIL );
  }

  @SubLTranslatedFile.SubL(source = "cycl/subloop-structures.lisp", position = 16099L)
  public static SubLObject method_listener_registry_print_function_trampoline(final SubLObject v_object, final SubLObject stream)
  {
    compatibility.default_struct_print_function( v_object, stream, ZERO_INTEGER );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/subloop-structures.lisp", position = 16099L)
  public static SubLObject method_listener_registry_p(final SubLObject v_object)
  {
    return ( v_object.getClass() == $method_listener_registry_native.class ) ? T : NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/subloop-structures.lisp", position = 16099L)
  public static SubLObject mlr_instance(final SubLObject v_object)
  {
    assert NIL != method_listener_registry_p( v_object ) : v_object;
    return v_object.getField2();
  }

  @SubLTranslatedFile.SubL(source = "cycl/subloop-structures.lisp", position = 16099L)
  public static SubLObject mlr_listener_alist(final SubLObject v_object)
  {
    assert NIL != method_listener_registry_p( v_object ) : v_object;
    return v_object.getField3();
  }

  @SubLTranslatedFile.SubL(source = "cycl/subloop-structures.lisp", position = 16099L)
  public static SubLObject _csetf_mlr_instance(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != method_listener_registry_p( v_object ) : v_object;
    return v_object.setField2( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/subloop-structures.lisp", position = 16099L)
  public static SubLObject _csetf_mlr_listener_alist(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != method_listener_registry_p( v_object ) : v_object;
    return v_object.setField3( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/subloop-structures.lisp", position = 16099L)
  public static SubLObject make_method_listener_registry(SubLObject arglist)
  {
    if( arglist == UNPROVIDED )
    {
      arglist = NIL;
    }
    final SubLObject v_new = new $method_listener_registry_native();
    SubLObject next;
    SubLObject current_arg;
    SubLObject current_value;
    SubLObject pcase_var;
    for( next = NIL, next = arglist; NIL != next; next = conses_high.cddr( next ) )
    {
      current_arg = next.first();
      current_value = conses_high.cadr( next );
      pcase_var = current_arg;
      if( pcase_var.eql( $kw359$INSTANCE ) )
      {
        _csetf_mlr_instance( v_new, current_value );
      }
      else if( pcase_var.eql( $kw444$LISTENER_ALIST ) )
      {
        _csetf_mlr_listener_alist( v_new, current_value );
      }
      else
      {
        Errors.error( $str102$Invalid_slot__S_for_construction_, current_arg );
      }
    }
    return v_new;
  }

  @SubLTranslatedFile.SubL(source = "cycl/subloop-structures.lisp", position = 16099L)
  public static SubLObject visit_defstruct_method_listener_registry(final SubLObject obj, final SubLObject visitor_fn)
  {
    Functions.funcall( visitor_fn, obj, $kw103$BEGIN, $sym445$MAKE_METHOD_LISTENER_REGISTRY, TWO_INTEGER );
    Functions.funcall( visitor_fn, obj, $kw105$SLOT, $kw359$INSTANCE, mlr_instance( obj ) );
    Functions.funcall( visitor_fn, obj, $kw105$SLOT, $kw444$LISTENER_ALIST, mlr_listener_alist( obj ) );
    Functions.funcall( visitor_fn, obj, $kw106$END, $sym445$MAKE_METHOD_LISTENER_REGISTRY, TWO_INTEGER );
    return obj;
  }

  @SubLTranslatedFile.SubL(source = "cycl/subloop-structures.lisp", position = 16099L)
  public static SubLObject visit_defstruct_object_method_listener_registry_method(final SubLObject obj, final SubLObject visitor_fn)
  {
    return visit_defstruct_method_listener_registry( obj, visitor_fn );
  }

  @SubLTranslatedFile.SubL(source = "cycl/subloop-structures.lisp", position = 16190L)
  public static SubLObject with_method_listener_registry(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    SubLObject method_listener_registry = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list447 );
    method_listener_registry = current.first();
    final SubLObject forms;
    current = ( forms = current.rest() );
    final SubLObject mlr_var = Symbols.make_symbol( $str448$method_listener_registry );
    return utilities_macros.generate_instance_variable_bindings_for_structure_slots( mlr_var, method_listener_registry, $sym449$MLR_, $list434, forms, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/subloop-structures.lisp", position = 16482L)
  public static SubLObject with_method_listener_registry_private(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    SubLObject method_listener_registry = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list447 );
    method_listener_registry = current.first();
    final SubLObject forms;
    current = ( forms = current.rest() );
    final SubLObject mlr_var = Symbols.make_symbol( $str448$method_listener_registry );
    return utilities_macros.generate_instance_variable_bindings_for_structure_slots( mlr_var, method_listener_registry, $sym449$MLR_, $list434, forms, NIL );
  }

  @SubLTranslatedFile.SubL(source = "cycl/subloop-structures.lisp", position = 16786L)
  public static SubLObject print_method_listener(final SubLObject v_object, final SubLObject stream, final SubLObject depth)
  {
    final SubLObject owning_method_name = ml_owning_method_name( v_object );
    final SubLObject owning_class_name = ml_owning_class_name( v_object );
    final SubLObject detail = ml_detail( v_object );
    PrintLow.format( stream, $str450$__METHOD_LISTENER____S__S_, owning_method_name, owning_class_name );
    if( NIL != function_detail_p( detail ) )
    {
      PrintLow.format( stream, $str451$_monitored_by_function__S_, fd_function_name( detail ) );
    }
    else if( NIL != method_detail_p( detail ) )
    {
      final SubLObject method_detail = detail;
      final SubLObject method_name = md_method_name( method_detail );
      final SubLObject instance = md_instance( method_detail );
      PrintLow.format( stream, $str452$_monitored_by_method___S__S__, method_name, instance );
    }
    else
    {
      PrintLow.format( stream, $str453$_ );
    }
    return v_object;
  }

  public static SubLObject declare_subloop_structures_file()
  {
    SubLFiles.declareFunction( me, "class_print_function_trampoline", "CLASS-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false );
    SubLFiles.declareFunction( me, "class_p", "CLASS-P", 1, 0, false );
    new $class_p$UnaryFunction();
    SubLFiles.declareFunction( me, "class_name", "CLASS-NAME", 1, 0, false );
    new $class_name$UnaryFunction();
    SubLFiles.declareFunction( me, "class_parent", "CLASS-PARENT", 1, 0, false );
    SubLFiles.declareFunction( me, "class_subclasses", "CLASS-SUBCLASSES", 1, 0, false );
    SubLFiles.declareFunction( me, "class_interface_names", "CLASS-INTERFACE-NAMES", 1, 0, false );
    SubLFiles.declareFunction( me, "class_interfaces", "CLASS-INTERFACES", 1, 0, false );
    SubLFiles.declareFunction( me, "class_compiled_inheritance_path", "CLASS-COMPILED-INHERITANCE-PATH", 1, 0, false );
    SubLFiles.declareFunction( me, "class_instance_var_decls", "CLASS-INSTANCE-VAR-DECLS", 1, 0, false );
    SubLFiles.declareFunction( me, "class_class_var_decls", "CLASS-CLASS-VAR-DECLS", 1, 0, false );
    SubLFiles.declareFunction( me, "class_compiled_instance_slot_access_alist", "CLASS-COMPILED-INSTANCE-SLOT-ACCESS-ALIST", 1, 0, false );
    SubLFiles.declareFunction( me, "class_compiled_instance_boolean_slot_access_alist", "CLASS-COMPILED-INSTANCE-BOOLEAN-SLOT-ACCESS-ALIST", 1, 0, false );
    SubLFiles.declareFunction( me, "class_compiled_class_slot_access_alist", "CLASS-COMPILED-CLASS-SLOT-ACCESS-ALIST", 1, 0, false );
    SubLFiles.declareFunction( me, "class_compiled_class_boolean_slot_access_alist", "CLASS-COMPILED-CLASS-BOOLEAN-SLOT-ACCESS-ALIST", 1, 0, false );
    SubLFiles.declareFunction( me, "class_slot_accessor_alist", "CLASS-SLOT-ACCESSOR-ALIST", 1, 0, false );
    SubLFiles.declareFunction( me, "class_instance_method_decls", "CLASS-INSTANCE-METHOD-DECLS", 1, 0, false );
    SubLFiles.declareFunction( me, "class_class_method_decls", "CLASS-CLASS-METHOD-DECLS", 1, 0, false );
    SubLFiles.declareFunction( me, "class_boolean_slots", "CLASS-BOOLEAN-SLOTS", 1, 0, false );
    SubLFiles.declareFunction( me, "class_any_slots", "CLASS-ANY-SLOTS", 1, 0, false );
    SubLFiles.declareFunction( me, "class_compiled_instance_method_access_alist", "CLASS-COMPILED-INSTANCE-METHOD-ACCESS-ALIST", 1, 0, false );
    SubLFiles.declareFunction( me, "class_compiled_class_method_access_alist", "CLASS-COMPILED-CLASS-METHOD-ACCESS-ALIST", 1, 0, false );
    SubLFiles.declareFunction( me, "class_tablified_instance_methods", "CLASS-TABLIFIED-INSTANCE-METHODS", 1, 0, false );
    SubLFiles.declareFunction( me, "class_definition_lock", "CLASS-DEFINITION-LOCK", 1, 0, false );
    SubLFiles.declareFunction( me, "class_access_lock", "CLASS-ACCESS-LOCK", 1, 0, false );
    SubLFiles.declareFunction( me, "class_synchronized_slots_p", "CLASS-SYNCHRONIZED-SLOTS-P", 1, 0, false );
    SubLFiles.declareFunction( me, "class_plist", "CLASS-PLIST", 1, 0, false );
    SubLFiles.declareFunction( me, "class_class_initialization_function", "CLASS-CLASS-INITIALIZATION-FUNCTION", 1, 0, false );
    SubLFiles.declareFunction( me, "class_class_initialized_p", "CLASS-CLASS-INITIALIZED-P", 1, 0, false );
    SubLFiles.declareFunction( me, "class_instance_initialization_function", "CLASS-INSTANCE-INITIALIZATION-FUNCTION", 1, 0, false );
    SubLFiles.declareFunction( me, "class_class_properties", "CLASS-CLASS-PROPERTIES", 1, 0, false );
    SubLFiles.declareFunction( me, "_csetf_class_name", "_CSETF-CLASS-NAME", 2, 0, false );
    SubLFiles.declareFunction( me, "_csetf_class_parent", "_CSETF-CLASS-PARENT", 2, 0, false );
    SubLFiles.declareFunction( me, "_csetf_class_subclasses", "_CSETF-CLASS-SUBCLASSES", 2, 0, false );
    SubLFiles.declareFunction( me, "_csetf_class_interface_names", "_CSETF-CLASS-INTERFACE-NAMES", 2, 0, false );
    SubLFiles.declareFunction( me, "_csetf_class_interfaces", "_CSETF-CLASS-INTERFACES", 2, 0, false );
    SubLFiles.declareFunction( me, "_csetf_class_compiled_inheritance_path", "_CSETF-CLASS-COMPILED-INHERITANCE-PATH", 2, 0, false );
    SubLFiles.declareFunction( me, "_csetf_class_instance_var_decls", "_CSETF-CLASS-INSTANCE-VAR-DECLS", 2, 0, false );
    SubLFiles.declareFunction( me, "_csetf_class_class_var_decls", "_CSETF-CLASS-CLASS-VAR-DECLS", 2, 0, false );
    SubLFiles.declareFunction( me, "_csetf_class_compiled_instance_slot_access_alist", "_CSETF-CLASS-COMPILED-INSTANCE-SLOT-ACCESS-ALIST", 2, 0, false );
    SubLFiles.declareFunction( me, "_csetf_class_compiled_instance_boolean_slot_access_alist", "_CSETF-CLASS-COMPILED-INSTANCE-BOOLEAN-SLOT-ACCESS-ALIST", 2, 0, false );
    SubLFiles.declareFunction( me, "_csetf_class_compiled_class_slot_access_alist", "_CSETF-CLASS-COMPILED-CLASS-SLOT-ACCESS-ALIST", 2, 0, false );
    SubLFiles.declareFunction( me, "_csetf_class_compiled_class_boolean_slot_access_alist", "_CSETF-CLASS-COMPILED-CLASS-BOOLEAN-SLOT-ACCESS-ALIST", 2, 0, false );
    SubLFiles.declareFunction( me, "_csetf_class_slot_accessor_alist", "_CSETF-CLASS-SLOT-ACCESSOR-ALIST", 2, 0, false );
    SubLFiles.declareFunction( me, "_csetf_class_instance_method_decls", "_CSETF-CLASS-INSTANCE-METHOD-DECLS", 2, 0, false );
    SubLFiles.declareFunction( me, "_csetf_class_class_method_decls", "_CSETF-CLASS-CLASS-METHOD-DECLS", 2, 0, false );
    SubLFiles.declareFunction( me, "_csetf_class_boolean_slots", "_CSETF-CLASS-BOOLEAN-SLOTS", 2, 0, false );
    SubLFiles.declareFunction( me, "_csetf_class_any_slots", "_CSETF-CLASS-ANY-SLOTS", 2, 0, false );
    SubLFiles.declareFunction( me, "_csetf_class_compiled_instance_method_access_alist", "_CSETF-CLASS-COMPILED-INSTANCE-METHOD-ACCESS-ALIST", 2, 0, false );
    SubLFiles.declareFunction( me, "_csetf_class_compiled_class_method_access_alist", "_CSETF-CLASS-COMPILED-CLASS-METHOD-ACCESS-ALIST", 2, 0, false );
    SubLFiles.declareFunction( me, "_csetf_class_tablified_instance_methods", "_CSETF-CLASS-TABLIFIED-INSTANCE-METHODS", 2, 0, false );
    SubLFiles.declareFunction( me, "_csetf_class_definition_lock", "_CSETF-CLASS-DEFINITION-LOCK", 2, 0, false );
    SubLFiles.declareFunction( me, "_csetf_class_access_lock", "_CSETF-CLASS-ACCESS-LOCK", 2, 0, false );
    SubLFiles.declareFunction( me, "_csetf_class_synchronized_slots_p", "_CSETF-CLASS-SYNCHRONIZED-SLOTS-P", 2, 0, false );
    SubLFiles.declareFunction( me, "_csetf_class_plist", "_CSETF-CLASS-PLIST", 2, 0, false );
    SubLFiles.declareFunction( me, "_csetf_class_class_initialization_function", "_CSETF-CLASS-CLASS-INITIALIZATION-FUNCTION", 2, 0, false );
    SubLFiles.declareFunction( me, "_csetf_class_class_initialized_p", "_CSETF-CLASS-CLASS-INITIALIZED-P", 2, 0, false );
    SubLFiles.declareFunction( me, "_csetf_class_instance_initialization_function", "_CSETF-CLASS-INSTANCE-INITIALIZATION-FUNCTION", 2, 0, false );
    SubLFiles.declareFunction( me, "_csetf_class_class_properties", "_CSETF-CLASS-CLASS-PROPERTIES", 2, 0, false );
    SubLFiles.declareFunction( me, "make_class", "MAKE-CLASS", 0, 1, false );
    SubLFiles.declareFunction( me, "visit_defstruct_class", "VISIT-DEFSTRUCT-CLASS", 2, 0, false );
    SubLFiles.declareFunction( me, "visit_defstruct_object_class_method", "VISIT-DEFSTRUCT-OBJECT-CLASS-METHOD", 2, 0, false );
    SubLFiles.declareFunction( me, "create_class", "CREATE-CLASS", 0, 0, false );
    SubLFiles.declareMacro( me, "with_class", "WITH-CLASS" );
    SubLFiles.declareMacro( me, "with_class_private", "WITH-CLASS-PRIVATE" );
    SubLFiles.declareFunction( me, "print_class", "PRINT-CLASS", 3, 0, false );
    SubLFiles.declareMacro( me, "def_class_property", "DEF-CLASS-PROPERTY" );
    SubLFiles.declareFunction( me, "instance_print_function_trampoline", "INSTANCE-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false );
    SubLFiles.declareFunction( me, "instance_p", "INSTANCE-P", 1, 0, false );
    new $instance_p$UnaryFunction();
    SubLFiles.declareFunction( me, "instance_class", "INSTANCE-CLASS", 1, 0, false );
    SubLFiles.declareFunction( me, "instance_boolean_slots", "INSTANCE-BOOLEAN-SLOTS", 1, 0, false );
    SubLFiles.declareFunction( me, "instance_any_slots", "INSTANCE-ANY-SLOTS", 1, 0, false );
    SubLFiles.declareFunction( me, "instance_plist", "INSTANCE-PLIST", 1, 0, false );
    SubLFiles.declareFunction( me, "_csetf_instance_class", "_CSETF-INSTANCE-CLASS", 2, 0, false );
    SubLFiles.declareFunction( me, "_csetf_instance_boolean_slots", "_CSETF-INSTANCE-BOOLEAN-SLOTS", 2, 0, false );
    SubLFiles.declareFunction( me, "_csetf_instance_any_slots", "_CSETF-INSTANCE-ANY-SLOTS", 2, 0, false );
    SubLFiles.declareFunction( me, "_csetf_instance_plist", "_CSETF-INSTANCE-PLIST", 2, 0, false );
    SubLFiles.declareFunction( me, "make_instance", "MAKE-INSTANCE", 0, 1, false );
    SubLFiles.declareFunction( me, "visit_defstruct_instance", "VISIT-DEFSTRUCT-INSTANCE", 2, 0, false );
    SubLFiles.declareFunction( me, "visit_defstruct_object_instance_method", "VISIT-DEFSTRUCT-OBJECT-INSTANCE-METHOD", 2, 0, false );
    SubLFiles.declareMacro( me, "with_instance", "WITH-INSTANCE" );
    SubLFiles.declareFunction( me, "print_instance", "PRINT-INSTANCE", 3, 0, false );
    SubLFiles.declareFunction( me, "interface_print_function_trampoline", "INTERFACE-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false );
    SubLFiles.declareFunction( me, "interface_p", "INTERFACE-P", 1, 0, false );
    new $interface_p$UnaryFunction();
    SubLFiles.declareFunction( me, "interface_name", "INTERFACE-NAME", 1, 0, false );
    SubLFiles.declareFunction( me, "interface_parents", "INTERFACE-PARENTS", 1, 0, false );
    SubLFiles.declareFunction( me, "interface_compiled_inheritance_path", "INTERFACE-COMPILED-INHERITANCE-PATH", 1, 0, false );
    SubLFiles.declareFunction( me, "interface_subinterfaces", "INTERFACE-SUBINTERFACES", 1, 0, false );
    SubLFiles.declareFunction( me, "interface_implementers", "INTERFACE-IMPLEMENTERS", 1, 0, false );
    SubLFiles.declareFunction( me, "interface_instance_method_decls", "INTERFACE-INSTANCE-METHOD-DECLS", 1, 0, false );
    SubLFiles.declareFunction( me, "interface_class_method_decls", "INTERFACE-CLASS-METHOD-DECLS", 1, 0, false );
    SubLFiles.declareFunction( me, "interface_compiled_instance_method_decls", "INTERFACE-COMPILED-INSTANCE-METHOD-DECLS", 1, 0, false );
    SubLFiles.declareFunction( me, "interface_compiled_class_method_decls", "INTERFACE-COMPILED-CLASS-METHOD-DECLS", 1, 0, false );
    SubLFiles.declareFunction( me, "interface_local_class_methods", "INTERFACE-LOCAL-CLASS-METHODS", 1, 0, false );
    SubLFiles.declareFunction( me, "interface_local_instance_methods", "INTERFACE-LOCAL-INSTANCE-METHODS", 1, 0, false );
    SubLFiles.declareFunction( me, "interface_mark_list", "INTERFACE-MARK-LIST", 1, 0, false );
    SubLFiles.declareFunction( me, "interface_plist", "INTERFACE-PLIST", 1, 0, false );
    SubLFiles.declareFunction( me, "interface_definition_lock", "INTERFACE-DEFINITION-LOCK", 1, 0, false );
    SubLFiles.declareFunction( me, "_csetf_interface_name", "_CSETF-INTERFACE-NAME", 2, 0, false );
    SubLFiles.declareFunction( me, "_csetf_interface_parents", "_CSETF-INTERFACE-PARENTS", 2, 0, false );
    SubLFiles.declareFunction( me, "_csetf_interface_compiled_inheritance_path", "_CSETF-INTERFACE-COMPILED-INHERITANCE-PATH", 2, 0, false );
    SubLFiles.declareFunction( me, "_csetf_interface_subinterfaces", "_CSETF-INTERFACE-SUBINTERFACES", 2, 0, false );
    SubLFiles.declareFunction( me, "_csetf_interface_implementers", "_CSETF-INTERFACE-IMPLEMENTERS", 2, 0, false );
    SubLFiles.declareFunction( me, "_csetf_interface_instance_method_decls", "_CSETF-INTERFACE-INSTANCE-METHOD-DECLS", 2, 0, false );
    SubLFiles.declareFunction( me, "_csetf_interface_class_method_decls", "_CSETF-INTERFACE-CLASS-METHOD-DECLS", 2, 0, false );
    SubLFiles.declareFunction( me, "_csetf_interface_compiled_instance_method_decls", "_CSETF-INTERFACE-COMPILED-INSTANCE-METHOD-DECLS", 2, 0, false );
    SubLFiles.declareFunction( me, "_csetf_interface_compiled_class_method_decls", "_CSETF-INTERFACE-COMPILED-CLASS-METHOD-DECLS", 2, 0, false );
    SubLFiles.declareFunction( me, "_csetf_interface_local_class_methods", "_CSETF-INTERFACE-LOCAL-CLASS-METHODS", 2, 0, false );
    SubLFiles.declareFunction( me, "_csetf_interface_local_instance_methods", "_CSETF-INTERFACE-LOCAL-INSTANCE-METHODS", 2, 0, false );
    SubLFiles.declareFunction( me, "_csetf_interface_mark_list", "_CSETF-INTERFACE-MARK-LIST", 2, 0, false );
    SubLFiles.declareFunction( me, "_csetf_interface_plist", "_CSETF-INTERFACE-PLIST", 2, 0, false );
    SubLFiles.declareFunction( me, "_csetf_interface_definition_lock", "_CSETF-INTERFACE-DEFINITION-LOCK", 2, 0, false );
    SubLFiles.declareFunction( me, "make_interface", "MAKE-INTERFACE", 0, 1, false );
    SubLFiles.declareFunction( me, "visit_defstruct_interface", "VISIT-DEFSTRUCT-INTERFACE", 2, 0, false );
    SubLFiles.declareFunction( me, "visit_defstruct_object_interface_method", "VISIT-DEFSTRUCT-OBJECT-INTERFACE-METHOD", 2, 0, false );
    SubLFiles.declareMacro( me, "with_interface", "WITH-INTERFACE" );
    SubLFiles.declareMacro( me, "with_interface_private", "WITH-INTERFACE-PRIVATE" );
    SubLFiles.declareFunction( me, "print_interface", "PRINT-INTERFACE", 3, 0, false );
    SubLFiles.declareFunction( me, "method_print_function_trampoline", "METHOD-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false );
    SubLFiles.declareFunction( me, "method_p", "METHOD-P", 1, 0, false );
    new $method_p$UnaryFunction();
    SubLFiles.declareFunction( me, "method_name", "METHOD-NAME", 1, 0, false );
    SubLFiles.declareFunction( me, "method_class_name", "METHOD-CLASS-NAME", 1, 0, false );
    SubLFiles.declareFunction( me, "method_lambda_list", "METHOD-LAMBDA-LIST", 1, 0, false );
    SubLFiles.declareFunction( me, "method_body", "METHOD-BODY", 1, 0, false );
    SubLFiles.declareFunction( me, "method_protection", "METHOD-PROTECTION", 1, 0, false );
    SubLFiles.declareFunction( me, "method_scope", "METHOD-SCOPE", 1, 0, false );
    SubLFiles.declareFunction( me, "method_update_type", "METHOD-UPDATE-TYPE", 1, 0, false );
    SubLFiles.declareFunction( me, "method_function_name", "METHOD-FUNCTION-NAME", 1, 0, false );
    SubLFiles.declareFunction( me, "method_function_def", "METHOD-FUNCTION-DEF", 1, 0, false );
    SubLFiles.declareFunction( me, "method_before_listeners", "METHOD-BEFORE-LISTENERS", 1, 0, false );
    SubLFiles.declareFunction( me, "method_after_listeners", "METHOD-AFTER-LISTENERS", 1, 0, false );
    SubLFiles.declareFunction( me, "method_instantiate_template", "METHOD-INSTANTIATE-TEMPLATE", 1, 0, false );
    SubLFiles.declareFunction( me, "_csetf_method_name", "_CSETF-METHOD-NAME", 2, 0, false );
    SubLFiles.declareFunction( me, "_csetf_method_class_name", "_CSETF-METHOD-CLASS-NAME", 2, 0, false );
    SubLFiles.declareFunction( me, "_csetf_method_lambda_list", "_CSETF-METHOD-LAMBDA-LIST", 2, 0, false );
    SubLFiles.declareFunction( me, "_csetf_method_body", "_CSETF-METHOD-BODY", 2, 0, false );
    SubLFiles.declareFunction( me, "_csetf_method_protection", "_CSETF-METHOD-PROTECTION", 2, 0, false );
    SubLFiles.declareFunction( me, "_csetf_method_scope", "_CSETF-METHOD-SCOPE", 2, 0, false );
    SubLFiles.declareFunction( me, "_csetf_method_update_type", "_CSETF-METHOD-UPDATE-TYPE", 2, 0, false );
    SubLFiles.declareFunction( me, "_csetf_method_function_name", "_CSETF-METHOD-FUNCTION-NAME", 2, 0, false );
    SubLFiles.declareFunction( me, "_csetf_method_function_def", "_CSETF-METHOD-FUNCTION-DEF", 2, 0, false );
    SubLFiles.declareFunction( me, "_csetf_method_before_listeners", "_CSETF-METHOD-BEFORE-LISTENERS", 2, 0, false );
    SubLFiles.declareFunction( me, "_csetf_method_after_listeners", "_CSETF-METHOD-AFTER-LISTENERS", 2, 0, false );
    SubLFiles.declareFunction( me, "_csetf_method_instantiate_template", "_CSETF-METHOD-INSTANTIATE-TEMPLATE", 2, 0, false );
    SubLFiles.declareFunction( me, "make_method", "MAKE-METHOD", 0, 1, false );
    SubLFiles.declareFunction( me, "visit_defstruct_method", "VISIT-DEFSTRUCT-METHOD", 2, 0, false );
    SubLFiles.declareFunction( me, "visit_defstruct_object_method_method", "VISIT-DEFSTRUCT-OBJECT-METHOD-METHOD", 2, 0, false );
    SubLFiles.declareMacro( me, "with_method", "WITH-METHOD" );
    SubLFiles.declareMacro( me, "with_method_private", "WITH-METHOD-PRIVATE" );
    SubLFiles.declareFunction( me, "print_method", "PRINT-METHOD", 3, 0, false );
    SubLFiles.declareFunction( me, "tablify_method_list", "TABLIFY-METHOD-LIST", 1, 0, false );
    SubLFiles.declareFunction( me, "method_trace_print_function_trampoline", "METHOD-TRACE-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false );
    SubLFiles.declareFunction( me, "method_trace_p", "METHOD-TRACE-P", 1, 0, false );
    new $method_trace_p$UnaryFunction();
    SubLFiles.declareFunction( me, "method_trace_name", "METHOD-TRACE-NAME", 1, 0, false );
    SubLFiles.declareFunction( me, "method_trace_class_name", "METHOD-TRACE-CLASS-NAME", 1, 0, false );
    SubLFiles.declareFunction( me, "method_trace_function", "METHOD-TRACE-FUNCTION", 1, 0, false );
    SubLFiles.declareFunction( me, "method_trace_outer", "METHOD-TRACE-OUTER", 1, 0, false );
    SubLFiles.declareFunction( me, "_csetf_method_trace_name", "_CSETF-METHOD-TRACE-NAME", 2, 0, false );
    SubLFiles.declareFunction( me, "_csetf_method_trace_class_name", "_CSETF-METHOD-TRACE-CLASS-NAME", 2, 0, false );
    SubLFiles.declareFunction( me, "_csetf_method_trace_function", "_CSETF-METHOD-TRACE-FUNCTION", 2, 0, false );
    SubLFiles.declareFunction( me, "_csetf_method_trace_outer", "_CSETF-METHOD-TRACE-OUTER", 2, 0, false );
    SubLFiles.declareFunction( me, "make_method_trace", "MAKE-METHOD-TRACE", 0, 1, false );
    SubLFiles.declareFunction( me, "visit_defstruct_method_trace", "VISIT-DEFSTRUCT-METHOD-TRACE", 2, 0, false );
    SubLFiles.declareFunction( me, "visit_defstruct_object_method_trace_method", "VISIT-DEFSTRUCT-OBJECT-METHOD-TRACE-METHOD", 2, 0, false );
    SubLFiles.declareMacro( me, "with_method_trace", "WITH-METHOD-TRACE" );
    SubLFiles.declareMacro( me, "with_method_trace_private", "WITH-METHOD-TRACE-PRIVATE" );
    SubLFiles.declareFunction( me, "print_method_trace", "PRINT-METHOD-TRACE", 3, 0, false );
    SubLFiles.declareFunction( me, "push_method_trace", "PUSH-METHOD-TRACE", 3, 0, false );
    SubLFiles.declareFunction( me, "method_info_print_function_trampoline", "METHOD-INFO-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false );
    SubLFiles.declareFunction( me, "method_info_p", "METHOD-INFO-P", 1, 0, false );
    new $method_info_p$UnaryFunction();
    SubLFiles.declareFunction( me, "mi_method_name", "MI-METHOD-NAME", 1, 0, false );
    SubLFiles.declareFunction( me, "mi_class_name", "MI-CLASS-NAME", 1, 0, false );
    SubLFiles.declareFunction( me, "mi_mv_used_in_body", "MI-MV-USED-IN-BODY", 1, 0, false );
    SubLFiles.declareFunction( me, "mi_mv_modified_in_body", "MI-MV-MODIFIED-IN-BODY", 1, 0, false );
    SubLFiles.declareFunction( me, "mi_methods_used_in_body", "MI-METHODS-USED-IN-BODY", 1, 0, false );
    SubLFiles.declareFunction( me, "_csetf_mi_method_name", "_CSETF-MI-METHOD-NAME", 2, 0, false );
    SubLFiles.declareFunction( me, "_csetf_mi_class_name", "_CSETF-MI-CLASS-NAME", 2, 0, false );
    SubLFiles.declareFunction( me, "_csetf_mi_mv_used_in_body", "_CSETF-MI-MV-USED-IN-BODY", 2, 0, false );
    SubLFiles.declareFunction( me, "_csetf_mi_mv_modified_in_body", "_CSETF-MI-MV-MODIFIED-IN-BODY", 2, 0, false );
    SubLFiles.declareFunction( me, "_csetf_mi_methods_used_in_body", "_CSETF-MI-METHODS-USED-IN-BODY", 2, 0, false );
    SubLFiles.declareFunction( me, "make_method_info", "MAKE-METHOD-INFO", 0, 1, false );
    SubLFiles.declareFunction( me, "visit_defstruct_method_info", "VISIT-DEFSTRUCT-METHOD-INFO", 2, 0, false );
    SubLFiles.declareFunction( me, "visit_defstruct_object_method_info_method", "VISIT-DEFSTRUCT-OBJECT-METHOD-INFO-METHOD", 2, 0, false );
    SubLFiles.declareMacro( me, "with_method_info", "WITH-METHOD-INFO" );
    SubLFiles.declareMacro( me, "with_method_info_private", "WITH-METHOD-INFO-PRIVATE" );
    SubLFiles.declareFunction( me, "slot_listener_print_function_trampoline", "SLOT-LISTENER-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false );
    SubLFiles.declareFunction( me, "slot_listener_p", "SLOT-LISTENER-P", 1, 0, false );
    new $slot_listener_p$UnaryFunction();
    SubLFiles.declareFunction( me, "sl_slot_name", "SL-SLOT-NAME", 1, 0, false );
    SubLFiles.declareFunction( me, "sl_demon_type", "SL-DEMON-TYPE", 1, 0, false );
    SubLFiles.declareFunction( me, "sl_value_trigger", "SL-VALUE-TRIGGER", 1, 0, false );
    SubLFiles.declareFunction( me, "sl_functional_type", "SL-FUNCTIONAL-TYPE", 1, 0, false );
    SubLFiles.declareFunction( me, "sl_isa_method", "SL-ISA-METHOD", 1, 0, false );
    SubLFiles.declareFunction( me, "sl_target_instance", "SL-TARGET-INSTANCE", 1, 0, false );
    SubLFiles.declareFunction( me, "_csetf_sl_slot_name", "_CSETF-SL-SLOT-NAME", 2, 0, false );
    SubLFiles.declareFunction( me, "_csetf_sl_demon_type", "_CSETF-SL-DEMON-TYPE", 2, 0, false );
    SubLFiles.declareFunction( me, "_csetf_sl_value_trigger", "_CSETF-SL-VALUE-TRIGGER", 2, 0, false );
    SubLFiles.declareFunction( me, "_csetf_sl_functional_type", "_CSETF-SL-FUNCTIONAL-TYPE", 2, 0, false );
    SubLFiles.declareFunction( me, "_csetf_sl_isa_method", "_CSETF-SL-ISA-METHOD", 2, 0, false );
    SubLFiles.declareFunction( me, "_csetf_sl_target_instance", "_CSETF-SL-TARGET-INSTANCE", 2, 0, false );
    SubLFiles.declareFunction( me, "make_slot_listener", "MAKE-SLOT-LISTENER", 0, 1, false );
    SubLFiles.declareFunction( me, "visit_defstruct_slot_listener", "VISIT-DEFSTRUCT-SLOT-LISTENER", 2, 0, false );
    SubLFiles.declareFunction( me, "visit_defstruct_object_slot_listener_method", "VISIT-DEFSTRUCT-OBJECT-SLOT-LISTENER-METHOD", 2, 0, false );
    SubLFiles.declareFunction( me, "print_slot_listener", "PRINT-SLOT-LISTENER", 3, 0, false );
    SubLFiles.declareMacro( me, "with_slot_listener", "WITH-SLOT-LISTENER" );
    SubLFiles.declareMacro( me, "with_slot_listener_private", "WITH-SLOT-LISTENER-PRIVATE" );
    SubLFiles.declareFunction( me, "slot_listener_registry_print_function_trampoline", "SLOT-LISTENER-REGISTRY-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false );
    SubLFiles.declareFunction( me, "slot_listener_registry_p", "SLOT-LISTENER-REGISTRY-P", 1, 0, false );
    new $slot_listener_registry_p$UnaryFunction();
    SubLFiles.declareFunction( me, "slr_instance", "SLR-INSTANCE", 1, 0, false );
    SubLFiles.declareFunction( me, "slr_slot_count", "SLR-SLOT-COUNT", 1, 0, false );
    SubLFiles.declareFunction( me, "slr_listeners_vector", "SLR-LISTENERS-VECTOR", 1, 0, false );
    SubLFiles.declareFunction( me, "_csetf_slr_instance", "_CSETF-SLR-INSTANCE", 2, 0, false );
    SubLFiles.declareFunction( me, "_csetf_slr_slot_count", "_CSETF-SLR-SLOT-COUNT", 2, 0, false );
    SubLFiles.declareFunction( me, "_csetf_slr_listeners_vector", "_CSETF-SLR-LISTENERS-VECTOR", 2, 0, false );
    SubLFiles.declareFunction( me, "make_slot_listener_registry", "MAKE-SLOT-LISTENER-REGISTRY", 0, 1, false );
    SubLFiles.declareFunction( me, "visit_defstruct_slot_listener_registry", "VISIT-DEFSTRUCT-SLOT-LISTENER-REGISTRY", 2, 0, false );
    SubLFiles.declareFunction( me, "visit_defstruct_object_slot_listener_registry_method", "VISIT-DEFSTRUCT-OBJECT-SLOT-LISTENER-REGISTRY-METHOD", 2, 0, false );
    SubLFiles.declareFunction( me, "print_slot_listener_registry", "PRINT-SLOT-LISTENER-REGISTRY", 3, 0, false );
    SubLFiles.declareMacro( me, "with_slot_listener_registry", "WITH-SLOT-LISTENER-REGISTRY" );
    SubLFiles.declareMacro( me, "with_slot_listener_registry_private", "WITH-SLOT-LISTENER-REGISTRY-PRIVATE" );
    SubLFiles.declareFunction( me, "method_listener_print_function_trampoline", "METHOD-LISTENER-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false );
    SubLFiles.declareFunction( me, "method_listener_p", "METHOD-LISTENER-P", 1, 0, false );
    new $method_listener_p$UnaryFunction();
    SubLFiles.declareFunction( me, "ml_owning_method_name", "ML-OWNING-METHOD-NAME", 1, 0, false );
    SubLFiles.declareFunction( me, "ml_owning_class_name", "ML-OWNING-CLASS-NAME", 1, 0, false );
    SubLFiles.declareFunction( me, "ml_demon_type", "ML-DEMON-TYPE", 1, 0, false );
    SubLFiles.declareFunction( me, "ml_detail", "ML-DETAIL", 1, 0, false );
    SubLFiles.declareFunction( me, "_csetf_ml_owning_method_name", "_CSETF-ML-OWNING-METHOD-NAME", 2, 0, false );
    SubLFiles.declareFunction( me, "_csetf_ml_owning_class_name", "_CSETF-ML-OWNING-CLASS-NAME", 2, 0, false );
    SubLFiles.declareFunction( me, "_csetf_ml_demon_type", "_CSETF-ML-DEMON-TYPE", 2, 0, false );
    SubLFiles.declareFunction( me, "_csetf_ml_detail", "_CSETF-ML-DETAIL", 2, 0, false );
    SubLFiles.declareFunction( me, "make_method_listener", "MAKE-METHOD-LISTENER", 0, 1, false );
    SubLFiles.declareFunction( me, "visit_defstruct_method_listener", "VISIT-DEFSTRUCT-METHOD-LISTENER", 2, 0, false );
    SubLFiles.declareFunction( me, "visit_defstruct_object_method_listener_method", "VISIT-DEFSTRUCT-OBJECT-METHOD-LISTENER-METHOD", 2, 0, false );
    SubLFiles.declareMacro( me, "with_method_listener", "WITH-METHOD-LISTENER" );
    SubLFiles.declareMacro( me, "with_method_listener_private", "WITH-METHOD-LISTENER-PRIVATE" );
    SubLFiles.declareFunction( me, "function_detail_print_function_trampoline", "FUNCTION-DETAIL-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false );
    SubLFiles.declareFunction( me, "function_detail_p", "FUNCTION-DETAIL-P", 1, 0, false );
    new $function_detail_p$UnaryFunction();
    SubLFiles.declareFunction( me, "fd_function_name", "FD-FUNCTION-NAME", 1, 0, false );
    SubLFiles.declareFunction( me, "fd_arglist", "FD-ARGLIST", 1, 0, false );
    SubLFiles.declareFunction( me, "_csetf_fd_function_name", "_CSETF-FD-FUNCTION-NAME", 2, 0, false );
    SubLFiles.declareFunction( me, "_csetf_fd_arglist", "_CSETF-FD-ARGLIST", 2, 0, false );
    SubLFiles.declareFunction( me, "make_function_detail", "MAKE-FUNCTION-DETAIL", 0, 1, false );
    SubLFiles.declareFunction( me, "visit_defstruct_function_detail", "VISIT-DEFSTRUCT-FUNCTION-DETAIL", 2, 0, false );
    SubLFiles.declareFunction( me, "visit_defstruct_object_function_detail_method", "VISIT-DEFSTRUCT-OBJECT-FUNCTION-DETAIL-METHOD", 2, 0, false );
    SubLFiles.declareMacro( me, "with_function_detail", "WITH-FUNCTION-DETAIL" );
    SubLFiles.declareMacro( me, "with_function_detail_private", "WITH-FUNCTION-DETAIL-PRIVATE" );
    SubLFiles.declareFunction( me, "method_detail_print_function_trampoline", "METHOD-DETAIL-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false );
    SubLFiles.declareFunction( me, "method_detail_p", "METHOD-DETAIL-P", 1, 0, false );
    new $method_detail_p$UnaryFunction();
    SubLFiles.declareFunction( me, "md_method_name", "MD-METHOD-NAME", 1, 0, false );
    SubLFiles.declareFunction( me, "md_function_name", "MD-FUNCTION-NAME", 1, 0, false );
    SubLFiles.declareFunction( me, "md_arglist", "MD-ARGLIST", 1, 0, false );
    SubLFiles.declareFunction( me, "md_instance", "MD-INSTANCE", 1, 0, false );
    SubLFiles.declareFunction( me, "_csetf_md_method_name", "_CSETF-MD-METHOD-NAME", 2, 0, false );
    SubLFiles.declareFunction( me, "_csetf_md_function_name", "_CSETF-MD-FUNCTION-NAME", 2, 0, false );
    SubLFiles.declareFunction( me, "_csetf_md_arglist", "_CSETF-MD-ARGLIST", 2, 0, false );
    SubLFiles.declareFunction( me, "_csetf_md_instance", "_CSETF-MD-INSTANCE", 2, 0, false );
    SubLFiles.declareFunction( me, "make_method_detail", "MAKE-METHOD-DETAIL", 0, 1, false );
    SubLFiles.declareFunction( me, "visit_defstruct_method_detail", "VISIT-DEFSTRUCT-METHOD-DETAIL", 2, 0, false );
    SubLFiles.declareFunction( me, "visit_defstruct_object_method_detail_method", "VISIT-DEFSTRUCT-OBJECT-METHOD-DETAIL-METHOD", 2, 0, false );
    SubLFiles.declareMacro( me, "with_method_detail", "WITH-METHOD-DETAIL" );
    SubLFiles.declareMacro( me, "with_method_detail_private", "WITH-METHOD-DETAIL-PRIVATE" );
    SubLFiles.declareFunction( me, "method_listener_registry_print_function_trampoline", "METHOD-LISTENER-REGISTRY-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false );
    SubLFiles.declareFunction( me, "method_listener_registry_p", "METHOD-LISTENER-REGISTRY-P", 1, 0, false );
    new $method_listener_registry_p$UnaryFunction();
    SubLFiles.declareFunction( me, "mlr_instance", "MLR-INSTANCE", 1, 0, false );
    SubLFiles.declareFunction( me, "mlr_listener_alist", "MLR-LISTENER-ALIST", 1, 0, false );
    SubLFiles.declareFunction( me, "_csetf_mlr_instance", "_CSETF-MLR-INSTANCE", 2, 0, false );
    SubLFiles.declareFunction( me, "_csetf_mlr_listener_alist", "_CSETF-MLR-LISTENER-ALIST", 2, 0, false );
    SubLFiles.declareFunction( me, "make_method_listener_registry", "MAKE-METHOD-LISTENER-REGISTRY", 0, 1, false );
    SubLFiles.declareFunction( me, "visit_defstruct_method_listener_registry", "VISIT-DEFSTRUCT-METHOD-LISTENER-REGISTRY", 2, 0, false );
    SubLFiles.declareFunction( me, "visit_defstruct_object_method_listener_registry_method", "VISIT-DEFSTRUCT-OBJECT-METHOD-LISTENER-REGISTRY-METHOD", 2, 0, false );
    SubLFiles.declareMacro( me, "with_method_listener_registry", "WITH-METHOD-LISTENER-REGISTRY" );
    SubLFiles.declareMacro( me, "with_method_listener_registry_private", "WITH-METHOD-LISTENER-REGISTRY-PRIVATE" );
    SubLFiles.declareFunction( me, "print_method_listener", "PRINT-METHOD-LISTENER", 3, 0, false );
    return NIL;
  }

  public static SubLObject init_subloop_structures_file()
  {
    $dtp_class$ = SubLFiles.defconstant( "*DTP-CLASS*", $sym0$CLASS );
    $dtp_instance$ = SubLFiles.defconstant( "*DTP-INSTANCE*", $sym130$INSTANCE );
    $dtp_interface$ = SubLFiles.defconstant( "*DTP-INTERFACE*", $sym156$INTERFACE );
    $dtp_method$ = SubLFiles.defconstant( "*DTP-METHOD*", $sym208$METHOD );
    $methods_initial_hashtable_size$ = SubLFiles.defconstant( "*METHODS-INITIAL-HASHTABLE-SIZE*", $int258$100 );
    $method_trace_on$ = SubLFiles.defvar( "*METHOD-TRACE-ON*", T );
    $methods_current_method_trace$ = SubLFiles.defparameter( "*METHODS-CURRENT-METHOD-TRACE*", NIL );
    $dtp_method_trace$ = SubLFiles.defconstant( "*DTP-METHOD-TRACE*", $sym259$METHOD_TRACE );
    $dtp_method_info$ = SubLFiles.defconstant( "*DTP-METHOD-INFO*", $sym284$METHOD_INFO );
    $dtp_slot_listener$ = SubLFiles.defconstant( "*DTP-SLOT-LISTENER*", $sym312$SLOT_LISTENER );
    $dtp_slot_listener_registry$ = SubLFiles.defconstant( "*DTP-SLOT-LISTENER-REGISTRY*", $sym345$SLOT_LISTENER_REGISTRY );
    $dtp_method_listener$ = SubLFiles.defconstant( "*DTP-METHOD-LISTENER*", $sym368$METHOD_LISTENER );
    $dtp_function_detail$ = SubLFiles.defconstant( "*DTP-FUNCTION-DETAIL*", $sym393$FUNCTION_DETAIL );
    $dtp_method_detail$ = SubLFiles.defconstant( "*DTP-METHOD-DETAIL*", $sym411$METHOD_DETAIL );
    $dtp_method_listener_registry$ = SubLFiles.defconstant( "*DTP-METHOD-LISTENER-REGISTRY*", $sym432$METHOD_LISTENER_REGISTRY );
    return NIL;
  }

  public static SubLObject setup_subloop_structures_file()
  {
    Structures.register_method( print_high.$print_object_method_table$.getGlobalValue(), $dtp_class$.getGlobalValue(), Symbols.symbol_function( $sym16$CLASS_PRINT_FUNCTION_TRAMPOLINE ) );
    SubLSpecialOperatorDeclarations.proclaim( $list17 );
    Structures.def_csetf( $sym18$CLASS_NAME, $sym19$_CSETF_CLASS_NAME );
    Structures.def_csetf( $sym20$CLASS_PARENT, $sym21$_CSETF_CLASS_PARENT );
    Structures.def_csetf( $sym22$CLASS_SUBCLASSES, $sym23$_CSETF_CLASS_SUBCLASSES );
    Structures.def_csetf( $sym24$CLASS_INTERFACE_NAMES, $sym25$_CSETF_CLASS_INTERFACE_NAMES );
    Structures.def_csetf( $sym26$CLASS_INTERFACES, $sym27$_CSETF_CLASS_INTERFACES );
    Structures.def_csetf( $sym28$CLASS_COMPILED_INHERITANCE_PATH, $sym29$_CSETF_CLASS_COMPILED_INHERITANCE_PATH );
    Structures.def_csetf( $sym30$CLASS_INSTANCE_VAR_DECLS, $sym31$_CSETF_CLASS_INSTANCE_VAR_DECLS );
    Structures.def_csetf( $sym32$CLASS_CLASS_VAR_DECLS, $sym33$_CSETF_CLASS_CLASS_VAR_DECLS );
    Structures.def_csetf( $sym34$CLASS_COMPILED_INSTANCE_SLOT_ACCESS_ALIST, $sym35$_CSETF_CLASS_COMPILED_INSTANCE_SLOT_ACCESS_ALIST );
    Structures.def_csetf( $sym36$CLASS_COMPILED_INSTANCE_BOOLEAN_SLOT_ACCESS_ALIST, $sym37$_CSETF_CLASS_COMPILED_INSTANCE_BOOLEAN_SLOT_ACCESS_ALIST );
    Structures.def_csetf( $sym38$CLASS_COMPILED_CLASS_SLOT_ACCESS_ALIST, $sym39$_CSETF_CLASS_COMPILED_CLASS_SLOT_ACCESS_ALIST );
    Structures.def_csetf( $sym40$CLASS_COMPILED_CLASS_BOOLEAN_SLOT_ACCESS_ALIST, $sym41$_CSETF_CLASS_COMPILED_CLASS_BOOLEAN_SLOT_ACCESS_ALIST );
    Structures.def_csetf( $sym42$CLASS_SLOT_ACCESSOR_ALIST, $sym43$_CSETF_CLASS_SLOT_ACCESSOR_ALIST );
    Structures.def_csetf( $sym44$CLASS_INSTANCE_METHOD_DECLS, $sym45$_CSETF_CLASS_INSTANCE_METHOD_DECLS );
    Structures.def_csetf( $sym46$CLASS_CLASS_METHOD_DECLS, $sym47$_CSETF_CLASS_CLASS_METHOD_DECLS );
    Structures.def_csetf( $sym48$CLASS_BOOLEAN_SLOTS, $sym49$_CSETF_CLASS_BOOLEAN_SLOTS );
    Structures.def_csetf( $sym50$CLASS_ANY_SLOTS, $sym51$_CSETF_CLASS_ANY_SLOTS );
    Structures.def_csetf( $sym52$CLASS_COMPILED_INSTANCE_METHOD_ACCESS_ALIST, $sym53$_CSETF_CLASS_COMPILED_INSTANCE_METHOD_ACCESS_ALIST );
    Structures.def_csetf( $sym54$CLASS_COMPILED_CLASS_METHOD_ACCESS_ALIST, $sym55$_CSETF_CLASS_COMPILED_CLASS_METHOD_ACCESS_ALIST );
    Structures.def_csetf( $sym56$CLASS_TABLIFIED_INSTANCE_METHODS, $sym57$_CSETF_CLASS_TABLIFIED_INSTANCE_METHODS );
    Structures.def_csetf( $sym58$CLASS_DEFINITION_LOCK, $sym59$_CSETF_CLASS_DEFINITION_LOCK );
    Structures.def_csetf( $sym60$CLASS_ACCESS_LOCK, $sym61$_CSETF_CLASS_ACCESS_LOCK );
    Structures.def_csetf( $sym62$CLASS_SYNCHRONIZED_SLOTS_P, $sym63$_CSETF_CLASS_SYNCHRONIZED_SLOTS_P );
    Structures.def_csetf( $sym64$CLASS_PLIST, $sym65$_CSETF_CLASS_PLIST );
    Structures.def_csetf( $sym66$CLASS_CLASS_INITIALIZATION_FUNCTION, $sym67$_CSETF_CLASS_CLASS_INITIALIZATION_FUNCTION );
    Structures.def_csetf( $sym68$CLASS_CLASS_INITIALIZED_P, $sym69$_CSETF_CLASS_CLASS_INITIALIZED_P );
    Structures.def_csetf( $sym70$CLASS_INSTANCE_INITIALIZATION_FUNCTION, $sym71$_CSETF_CLASS_INSTANCE_INITIALIZATION_FUNCTION );
    Structures.def_csetf( $sym72$CLASS_CLASS_PROPERTIES, $sym73$_CSETF_CLASS_CLASS_PROPERTIES );
    Equality.identity( $sym0$CLASS );
    Structures.register_method( visitation.$visit_defstruct_object_method_table$.getGlobalValue(), $dtp_class$.getGlobalValue(), Symbols.symbol_function( $sym107$VISIT_DEFSTRUCT_OBJECT_CLASS_METHOD ) );
    Structures.register_method( print_high.$print_object_method_table$.getGlobalValue(), $dtp_instance$.getGlobalValue(), Symbols.symbol_function( $sym137$INSTANCE_PRINT_FUNCTION_TRAMPOLINE ) );
    SubLSpecialOperatorDeclarations.proclaim( $list138 );
    Structures.def_csetf( $sym139$INSTANCE_CLASS, $sym140$_CSETF_INSTANCE_CLASS );
    Structures.def_csetf( $sym141$INSTANCE_BOOLEAN_SLOTS, $sym142$_CSETF_INSTANCE_BOOLEAN_SLOTS );
    Structures.def_csetf( $sym143$INSTANCE_ANY_SLOTS, $sym144$_CSETF_INSTANCE_ANY_SLOTS );
    Structures.def_csetf( $sym145$INSTANCE_PLIST, $sym146$_CSETF_INSTANCE_PLIST );
    Equality.identity( $sym130$INSTANCE );
    Structures.register_method( visitation.$visit_defstruct_object_method_table$.getGlobalValue(), $dtp_instance$.getGlobalValue(), Symbols.symbol_function( $sym149$VISIT_DEFSTRUCT_OBJECT_INSTANCE_METHOD ) );
    Structures.register_method( print_high.$print_object_method_table$.getGlobalValue(), $dtp_interface$.getGlobalValue(), Symbols.symbol_function( $sym163$INTERFACE_PRINT_FUNCTION_TRAMPOLINE ) );
    SubLSpecialOperatorDeclarations.proclaim( $list164 );
    Structures.def_csetf( $sym165$INTERFACE_NAME, $sym166$_CSETF_INTERFACE_NAME );
    Structures.def_csetf( $sym167$INTERFACE_PARENTS, $sym168$_CSETF_INTERFACE_PARENTS );
    Structures.def_csetf( $sym169$INTERFACE_COMPILED_INHERITANCE_PATH, $sym170$_CSETF_INTERFACE_COMPILED_INHERITANCE_PATH );
    Structures.def_csetf( $sym171$INTERFACE_SUBINTERFACES, $sym172$_CSETF_INTERFACE_SUBINTERFACES );
    Structures.def_csetf( $sym173$INTERFACE_IMPLEMENTERS, $sym174$_CSETF_INTERFACE_IMPLEMENTERS );
    Structures.def_csetf( $sym175$INTERFACE_INSTANCE_METHOD_DECLS, $sym176$_CSETF_INTERFACE_INSTANCE_METHOD_DECLS );
    Structures.def_csetf( $sym177$INTERFACE_CLASS_METHOD_DECLS, $sym178$_CSETF_INTERFACE_CLASS_METHOD_DECLS );
    Structures.def_csetf( $sym179$INTERFACE_COMPILED_INSTANCE_METHOD_DECLS, $sym180$_CSETF_INTERFACE_COMPILED_INSTANCE_METHOD_DECLS );
    Structures.def_csetf( $sym181$INTERFACE_COMPILED_CLASS_METHOD_DECLS, $sym182$_CSETF_INTERFACE_COMPILED_CLASS_METHOD_DECLS );
    Structures.def_csetf( $sym183$INTERFACE_LOCAL_CLASS_METHODS, $sym184$_CSETF_INTERFACE_LOCAL_CLASS_METHODS );
    Structures.def_csetf( $sym185$INTERFACE_LOCAL_INSTANCE_METHODS, $sym186$_CSETF_INTERFACE_LOCAL_INSTANCE_METHODS );
    Structures.def_csetf( $sym187$INTERFACE_MARK_LIST, $sym188$_CSETF_INTERFACE_MARK_LIST );
    Structures.def_csetf( $sym189$INTERFACE_PLIST, $sym190$_CSETF_INTERFACE_PLIST );
    Structures.def_csetf( $sym191$INTERFACE_DEFINITION_LOCK, $sym192$_CSETF_INTERFACE_DEFINITION_LOCK );
    Equality.identity( $sym156$INTERFACE );
    Structures.register_method( visitation.$visit_defstruct_object_method_table$.getGlobalValue(), $dtp_interface$.getGlobalValue(), Symbols.symbol_function( $sym202$VISIT_DEFSTRUCT_OBJECT_INTERFACE_METHOD ) );
    Structures.register_method( print_high.$print_object_method_table$.getGlobalValue(), $dtp_method$.getGlobalValue(), Symbols.symbol_function( $sym215$METHOD_PRINT_FUNCTION_TRAMPOLINE ) );
    SubLSpecialOperatorDeclarations.proclaim( $list216 );
    Structures.def_csetf( $sym217$METHOD_NAME, $sym218$_CSETF_METHOD_NAME );
    Structures.def_csetf( $sym219$METHOD_CLASS_NAME, $sym220$_CSETF_METHOD_CLASS_NAME );
    Structures.def_csetf( $sym221$METHOD_LAMBDA_LIST, $sym222$_CSETF_METHOD_LAMBDA_LIST );
    Structures.def_csetf( $sym223$METHOD_BODY, $sym224$_CSETF_METHOD_BODY );
    Structures.def_csetf( $sym225$METHOD_PROTECTION, $sym226$_CSETF_METHOD_PROTECTION );
    Structures.def_csetf( $sym227$METHOD_SCOPE, $sym228$_CSETF_METHOD_SCOPE );
    Structures.def_csetf( $sym229$METHOD_UPDATE_TYPE, $sym230$_CSETF_METHOD_UPDATE_TYPE );
    Structures.def_csetf( $sym231$METHOD_FUNCTION_NAME, $sym232$_CSETF_METHOD_FUNCTION_NAME );
    Structures.def_csetf( $sym233$METHOD_FUNCTION_DEF, $sym234$_CSETF_METHOD_FUNCTION_DEF );
    Structures.def_csetf( $sym235$METHOD_BEFORE_LISTENERS, $sym236$_CSETF_METHOD_BEFORE_LISTENERS );
    Structures.def_csetf( $sym237$METHOD_AFTER_LISTENERS, $sym238$_CSETF_METHOD_AFTER_LISTENERS );
    Structures.def_csetf( $sym239$METHOD_INSTANTIATE_TEMPLATE, $sym240$_CSETF_METHOD_INSTANTIATE_TEMPLATE );
    Equality.identity( $sym208$METHOD );
    Structures.register_method( visitation.$visit_defstruct_object_method_table$.getGlobalValue(), $dtp_method$.getGlobalValue(), Symbols.symbol_function( $sym253$VISIT_DEFSTRUCT_OBJECT_METHOD_METHOD ) );
    Structures.register_method( print_high.$print_object_method_table$.getGlobalValue(), $dtp_method_trace$.getGlobalValue(), Symbols.symbol_function( $sym266$METHOD_TRACE_PRINT_FUNCTION_TRAMPOLINE ) );
    SubLSpecialOperatorDeclarations.proclaim( $list267 );
    Structures.def_csetf( $sym268$METHOD_TRACE_NAME, $sym269$_CSETF_METHOD_TRACE_NAME );
    Structures.def_csetf( $sym270$METHOD_TRACE_CLASS_NAME, $sym271$_CSETF_METHOD_TRACE_CLASS_NAME );
    Structures.def_csetf( $sym272$METHOD_TRACE_FUNCTION, $sym273$_CSETF_METHOD_TRACE_FUNCTION );
    Structures.def_csetf( $sym274$METHOD_TRACE_OUTER, $sym275$_CSETF_METHOD_TRACE_OUTER );
    Equality.identity( $sym259$METHOD_TRACE );
    Structures.register_method( visitation.$visit_defstruct_object_method_table$.getGlobalValue(), $dtp_method_trace$.getGlobalValue(), Symbols.symbol_function( $sym279$VISIT_DEFSTRUCT_OBJECT_METHOD_TRACE_METHOD ) );
    Structures.register_method( print_high.$print_object_method_table$.getGlobalValue(), $dtp_method_info$.getGlobalValue(), Symbols.symbol_function( $sym291$METHOD_INFO_PRINT_FUNCTION_TRAMPOLINE ) );
    SubLSpecialOperatorDeclarations.proclaim( $list292 );
    Structures.def_csetf( $sym293$MI_METHOD_NAME, $sym294$_CSETF_MI_METHOD_NAME );
    Structures.def_csetf( $sym295$MI_CLASS_NAME, $sym296$_CSETF_MI_CLASS_NAME );
    Structures.def_csetf( $sym297$MI_MV_USED_IN_BODY, $sym298$_CSETF_MI_MV_USED_IN_BODY );
    Structures.def_csetf( $sym299$MI_MV_MODIFIED_IN_BODY, $sym300$_CSETF_MI_MV_MODIFIED_IN_BODY );
    Structures.def_csetf( $sym301$MI_METHODS_USED_IN_BODY, $sym302$_CSETF_MI_METHODS_USED_IN_BODY );
    Equality.identity( $sym284$METHOD_INFO );
    Structures.register_method( visitation.$visit_defstruct_object_method_table$.getGlobalValue(), $dtp_method_info$.getGlobalValue(), Symbols.symbol_function( $sym308$VISIT_DEFSTRUCT_OBJECT_METHOD_INFO_METHOD ) );
    Structures.register_method( print_high.$print_object_method_table$.getGlobalValue(), $dtp_slot_listener$.getGlobalValue(), Symbols.symbol_function( $sym319$SLOT_LISTENER_PRINT_FUNCTION_TRAMPOLINE ) );
    SubLSpecialOperatorDeclarations.proclaim( $list320 );
    Structures.def_csetf( $sym321$SL_SLOT_NAME, $sym322$_CSETF_SL_SLOT_NAME );
    Structures.def_csetf( $sym323$SL_DEMON_TYPE, $sym324$_CSETF_SL_DEMON_TYPE );
    Structures.def_csetf( $sym325$SL_VALUE_TRIGGER, $sym326$_CSETF_SL_VALUE_TRIGGER );
    Structures.def_csetf( $sym327$SL_FUNCTIONAL_TYPE, $sym328$_CSETF_SL_FUNCTIONAL_TYPE );
    Structures.def_csetf( $sym329$SL_ISA_METHOD, $sym330$_CSETF_SL_ISA_METHOD );
    Structures.def_csetf( $sym331$SL_TARGET_INSTANCE, $sym332$_CSETF_SL_TARGET_INSTANCE );
    Equality.identity( $sym312$SLOT_LISTENER );
    Structures.register_method( visitation.$visit_defstruct_object_method_table$.getGlobalValue(), $dtp_slot_listener$.getGlobalValue(), Symbols.symbol_function( $sym340$VISIT_DEFSTRUCT_OBJECT_SLOT_LISTENER_METHOD ) );
    Structures.register_method( print_high.$print_object_method_table$.getGlobalValue(), $dtp_slot_listener_registry$.getGlobalValue(), Symbols.symbol_function(
        $sym351$SLOT_LISTENER_REGISTRY_PRINT_FUNCTION_TRAMPOLINE ) );
    SubLSpecialOperatorDeclarations.proclaim( $list352 );
    Structures.def_csetf( $sym353$SLR_INSTANCE, $sym354$_CSETF_SLR_INSTANCE );
    Structures.def_csetf( $sym355$SLR_SLOT_COUNT, $sym356$_CSETF_SLR_SLOT_COUNT );
    Structures.def_csetf( $sym357$SLR_LISTENERS_VECTOR, $sym358$_CSETF_SLR_LISTENERS_VECTOR );
    Equality.identity( $sym345$SLOT_LISTENER_REGISTRY );
    Structures.register_method( visitation.$visit_defstruct_object_method_table$.getGlobalValue(), $dtp_slot_listener_registry$.getGlobalValue(), Symbols.symbol_function(
        $sym363$VISIT_DEFSTRUCT_OBJECT_SLOT_LISTENER_REGISTRY_METHOD ) );
    Structures.register_method( print_high.$print_object_method_table$.getGlobalValue(), $dtp_method_listener$.getGlobalValue(), Symbols.symbol_function( $sym375$METHOD_LISTENER_PRINT_FUNCTION_TRAMPOLINE ) );
    SubLSpecialOperatorDeclarations.proclaim( $list376 );
    Structures.def_csetf( $sym377$ML_OWNING_METHOD_NAME, $sym378$_CSETF_ML_OWNING_METHOD_NAME );
    Structures.def_csetf( $sym379$ML_OWNING_CLASS_NAME, $sym380$_CSETF_ML_OWNING_CLASS_NAME );
    Structures.def_csetf( $sym381$ML_DEMON_TYPE, $sym382$_CSETF_ML_DEMON_TYPE );
    Structures.def_csetf( $sym383$ML_DETAIL, $sym384$_CSETF_ML_DETAIL );
    Equality.identity( $sym368$METHOD_LISTENER );
    Structures.register_method( visitation.$visit_defstruct_object_method_table$.getGlobalValue(), $dtp_method_listener$.getGlobalValue(), Symbols.symbol_function(
        $sym389$VISIT_DEFSTRUCT_OBJECT_METHOD_LISTENER_METHOD ) );
    Structures.register_method( print_high.$print_object_method_table$.getGlobalValue(), $dtp_function_detail$.getGlobalValue(), Symbols.symbol_function( $sym399$FUNCTION_DETAIL_PRINT_FUNCTION_TRAMPOLINE ) );
    SubLSpecialOperatorDeclarations.proclaim( $list400 );
    Structures.def_csetf( $sym401$FD_FUNCTION_NAME, $sym402$_CSETF_FD_FUNCTION_NAME );
    Structures.def_csetf( $sym403$FD_ARGLIST, $sym404$_CSETF_FD_ARGLIST );
    Equality.identity( $sym393$FUNCTION_DETAIL );
    Structures.register_method( visitation.$visit_defstruct_object_method_table$.getGlobalValue(), $dtp_function_detail$.getGlobalValue(), Symbols.symbol_function(
        $sym407$VISIT_DEFSTRUCT_OBJECT_FUNCTION_DETAIL_METHOD ) );
    Structures.register_method( print_high.$print_object_method_table$.getGlobalValue(), $dtp_method_detail$.getGlobalValue(), Symbols.symbol_function( $sym417$METHOD_DETAIL_PRINT_FUNCTION_TRAMPOLINE ) );
    SubLSpecialOperatorDeclarations.proclaim( $list418 );
    Structures.def_csetf( $sym419$MD_METHOD_NAME, $sym420$_CSETF_MD_METHOD_NAME );
    Structures.def_csetf( $sym421$MD_FUNCTION_NAME, $sym422$_CSETF_MD_FUNCTION_NAME );
    Structures.def_csetf( $sym423$MD_ARGLIST, $sym424$_CSETF_MD_ARGLIST );
    Structures.def_csetf( $sym425$MD_INSTANCE, $sym426$_CSETF_MD_INSTANCE );
    Equality.identity( $sym411$METHOD_DETAIL );
    Structures.register_method( visitation.$visit_defstruct_object_method_table$.getGlobalValue(), $dtp_method_detail$.getGlobalValue(), Symbols.symbol_function( $sym428$VISIT_DEFSTRUCT_OBJECT_METHOD_DETAIL_METHOD ) );
    Structures.register_method( print_high.$print_object_method_table$.getGlobalValue(), $dtp_method_listener_registry$.getGlobalValue(), Symbols.symbol_function(
        $sym438$METHOD_LISTENER_REGISTRY_PRINT_FUNCTION_TRAMPOLINE ) );
    SubLSpecialOperatorDeclarations.proclaim( $list439 );
    Structures.def_csetf( $sym440$MLR_INSTANCE, $sym441$_CSETF_MLR_INSTANCE );
    Structures.def_csetf( $sym442$MLR_LISTENER_ALIST, $sym443$_CSETF_MLR_LISTENER_ALIST );
    Equality.identity( $sym432$METHOD_LISTENER_REGISTRY );
    Structures.register_method( visitation.$visit_defstruct_object_method_table$.getGlobalValue(), $dtp_method_listener_registry$.getGlobalValue(), Symbols.symbol_function(
        $sym446$VISIT_DEFSTRUCT_OBJECT_METHOD_LISTENER_REGISTRY_METHOD ) );
    return NIL;
  }

  @Override
  public void declareFunctions()
  {
    declare_subloop_structures_file();
  }

  @Override
  public void initializeVariables()
  {
    init_subloop_structures_file();
  }

  @Override
  public void runTopLevelForms()
  {
    setup_subloop_structures_file();
  }
  static
  {
    me = new subloop_structures();
    $dtp_class$ = null;
    $dtp_instance$ = null;
    $dtp_interface$ = null;
    $dtp_method$ = null;
    $methods_initial_hashtable_size$ = null;
    $method_trace_on$ = null;
    $methods_current_method_trace$ = null;
    $dtp_method_trace$ = null;
    $dtp_method_info$ = null;
    $dtp_slot_listener$ = null;
    $dtp_slot_listener_registry$ = null;
    $dtp_method_listener$ = null;
    $dtp_function_detail$ = null;
    $dtp_method_detail$ = null;
    $dtp_method_listener_registry$ = null;
    $sym0$CLASS = makeSymbol( "CLASS" );
    $sym1$CLASS_P = makeSymbol( "CLASS-P" );
    $list2 = ConsesLow.list( new SubLObject[] { makeSymbol( "NAME" ), makeSymbol( "PARENT" ), makeSymbol( "SUBCLASSES" ), makeSymbol( "INTERFACE-NAMES" ), makeSymbol( "INTERFACES" ), makeSymbol(
        "COMPILED-INHERITANCE-PATH" ), makeSymbol( "INSTANCE-VAR-DECLS" ), makeSymbol( "CLASS-VAR-DECLS" ), makeSymbol( "COMPILED-INSTANCE-SLOT-ACCESS-ALIST" ), makeSymbol(
            "COMPILED-INSTANCE-BOOLEAN-SLOT-ACCESS-ALIST" ), makeSymbol( "COMPILED-CLASS-SLOT-ACCESS-ALIST" ), makeSymbol( "COMPILED-CLASS-BOOLEAN-SLOT-ACCESS-ALIST" ), makeSymbol( "SLOT-ACCESSOR-ALIST" ), makeSymbol(
                "INSTANCE-METHOD-DECLS" ), makeSymbol( "CLASS-METHOD-DECLS" ), makeSymbol( "BOOLEAN-SLOTS" ), makeSymbol( "ANY-SLOTS" ), makeSymbol( "COMPILED-INSTANCE-METHOD-ACCESS-ALIST" ), makeSymbol(
                    "COMPILED-CLASS-METHOD-ACCESS-ALIST" ), makeSymbol( "TABLIFIED-INSTANCE-METHODS" ), makeSymbol( "DEFINITION-LOCK" ), makeSymbol( "ACCESS-LOCK" ), makeSymbol( "SYNCHRONIZED-SLOTS-P" ), makeSymbol(
                        "PLIST" ), makeSymbol( "CLASS-INITIALIZATION-FUNCTION" ), makeSymbol( "CLASS-INITIALIZED-P" ), makeSymbol( "INSTANCE-INITIALIZATION-FUNCTION" ), makeSymbol( "CLASS-PROPERTIES" )
    } );
    $list3 = ConsesLow.list( new SubLObject[] { makeKeyword( "NAME" ), makeKeyword( "PARENT" ), makeKeyword( "SUBCLASSES" ), makeKeyword( "INTERFACE-NAMES" ), makeKeyword( "INTERFACES" ), makeKeyword(
        "COMPILED-INHERITANCE-PATH" ), makeKeyword( "INSTANCE-VAR-DECLS" ), makeKeyword( "CLASS-VAR-DECLS" ), makeKeyword( "COMPILED-INSTANCE-SLOT-ACCESS-ALIST" ), makeKeyword(
            "COMPILED-INSTANCE-BOOLEAN-SLOT-ACCESS-ALIST" ), makeKeyword( "COMPILED-CLASS-SLOT-ACCESS-ALIST" ), makeKeyword( "COMPILED-CLASS-BOOLEAN-SLOT-ACCESS-ALIST" ), makeKeyword( "SLOT-ACCESSOR-ALIST" ),
      makeKeyword( "INSTANCE-METHOD-DECLS" ), makeKeyword( "CLASS-METHOD-DECLS" ), makeKeyword( "BOOLEAN-SLOTS" ), makeKeyword( "ANY-SLOTS" ), makeKeyword( "COMPILED-INSTANCE-METHOD-ACCESS-ALIST" ), makeKeyword(
          "COMPILED-CLASS-METHOD-ACCESS-ALIST" ), makeKeyword( "TABLIFIED-INSTANCE-METHODS" ), makeKeyword( "DEFINITION-LOCK" ), makeKeyword( "ACCESS-LOCK" ), makeKeyword( "SYNCHRONIZED-SLOTS-P" ), makeKeyword(
              "PLIST" ), makeKeyword( "CLASS-INITIALIZATION-FUNCTION" ), makeKeyword( "CLASS-INITIALIZED-P" ), makeKeyword( "INSTANCE-INITIALIZATION-FUNCTION" ), makeKeyword( "CLASS-PROPERTIES" )
    } );
    $list4 = ConsesLow.list( new SubLObject[] { makeSymbol( "CLASS-NAME" ), makeSymbol( "CLASS-PARENT" ), makeSymbol( "CLASS-SUBCLASSES" ), makeSymbol( "CLASS-INTERFACE-NAMES" ), makeSymbol( "CLASS-INTERFACES" ),
      makeSymbol( "CLASS-COMPILED-INHERITANCE-PATH" ), makeSymbol( "CLASS-INSTANCE-VAR-DECLS" ), makeSymbol( "CLASS-CLASS-VAR-DECLS" ), makeSymbol( "CLASS-COMPILED-INSTANCE-SLOT-ACCESS-ALIST" ), makeSymbol(
          "CLASS-COMPILED-INSTANCE-BOOLEAN-SLOT-ACCESS-ALIST" ), makeSymbol( "CLASS-COMPILED-CLASS-SLOT-ACCESS-ALIST" ), makeSymbol( "CLASS-COMPILED-CLASS-BOOLEAN-SLOT-ACCESS-ALIST" ), makeSymbol(
              "CLASS-SLOT-ACCESSOR-ALIST" ), makeSymbol( "CLASS-INSTANCE-METHOD-DECLS" ), makeSymbol( "CLASS-CLASS-METHOD-DECLS" ), makeSymbol( "CLASS-BOOLEAN-SLOTS" ), makeSymbol( "CLASS-ANY-SLOTS" ), makeSymbol(
                  "CLASS-COMPILED-INSTANCE-METHOD-ACCESS-ALIST" ), makeSymbol( "CLASS-COMPILED-CLASS-METHOD-ACCESS-ALIST" ), makeSymbol( "CLASS-TABLIFIED-INSTANCE-METHODS" ), makeSymbol( "CLASS-DEFINITION-LOCK" ),
      makeSymbol( "CLASS-ACCESS-LOCK" ), makeSymbol( "CLASS-SYNCHRONIZED-SLOTS-P" ), makeSymbol( "CLASS-PLIST" ), makeSymbol( "CLASS-CLASS-INITIALIZATION-FUNCTION" ), makeSymbol( "CLASS-CLASS-INITIALIZED-P" ),
      makeSymbol( "CLASS-INSTANCE-INITIALIZATION-FUNCTION" ), makeSymbol( "CLASS-CLASS-PROPERTIES" )
    } );
    $list5 = ConsesLow.list( new SubLObject[] { makeSymbol( "_CSETF-CLASS-NAME", "SUBLISP" ), makeSymbol( "_CSETF-CLASS-PARENT" ), makeSymbol( "_CSETF-CLASS-SUBCLASSES" ), makeSymbol( "_CSETF-CLASS-INTERFACE-NAMES" ),
      makeSymbol( "_CSETF-CLASS-INTERFACES" ), makeSymbol( "_CSETF-CLASS-COMPILED-INHERITANCE-PATH" ), makeSymbol( "_CSETF-CLASS-INSTANCE-VAR-DECLS" ), makeSymbol( "_CSETF-CLASS-CLASS-VAR-DECLS" ), makeSymbol(
          "_CSETF-CLASS-COMPILED-INSTANCE-SLOT-ACCESS-ALIST" ), makeSymbol( "_CSETF-CLASS-COMPILED-INSTANCE-BOOLEAN-SLOT-ACCESS-ALIST" ), makeSymbol( "_CSETF-CLASS-COMPILED-CLASS-SLOT-ACCESS-ALIST" ), makeSymbol(
              "_CSETF-CLASS-COMPILED-CLASS-BOOLEAN-SLOT-ACCESS-ALIST" ), makeSymbol( "_CSETF-CLASS-SLOT-ACCESSOR-ALIST" ), makeSymbol( "_CSETF-CLASS-INSTANCE-METHOD-DECLS" ), makeSymbol(
                  "_CSETF-CLASS-CLASS-METHOD-DECLS" ), makeSymbol( "_CSETF-CLASS-BOOLEAN-SLOTS" ), makeSymbol( "_CSETF-CLASS-ANY-SLOTS" ), makeSymbol( "_CSETF-CLASS-COMPILED-INSTANCE-METHOD-ACCESS-ALIST" ), makeSymbol(
                      "_CSETF-CLASS-COMPILED-CLASS-METHOD-ACCESS-ALIST" ), makeSymbol( "_CSETF-CLASS-TABLIFIED-INSTANCE-METHODS" ), makeSymbol( "_CSETF-CLASS-DEFINITION-LOCK" ), makeSymbol( "_CSETF-CLASS-ACCESS-LOCK" ),
      makeSymbol( "_CSETF-CLASS-SYNCHRONIZED-SLOTS-P" ), makeSymbol( "_CSETF-CLASS-PLIST" ), makeSymbol( "_CSETF-CLASS-CLASS-INITIALIZATION-FUNCTION" ), makeSymbol( "_CSETF-CLASS-CLASS-INITIALIZED-P" ), makeSymbol(
          "_CSETF-CLASS-INSTANCE-INITIALIZATION-FUNCTION" ), makeSymbol( "_CSETF-CLASS-CLASS-PROPERTIES" )
    } );
    $sym6$PRINT_CLASS = makeSymbol( "PRINT-CLASS" );
    $int7$21 = makeInteger( 21 );
    $int8$22 = makeInteger( 22 );
    $int9$23 = makeInteger( 23 );
    $int10$24 = makeInteger( 24 );
    $int11$25 = makeInteger( 25 );
    $int12$26 = makeInteger( 26 );
    $int13$27 = makeInteger( 27 );
    $int14$28 = makeInteger( 28 );
    $int15$29 = makeInteger( 29 );
    $sym16$CLASS_PRINT_FUNCTION_TRAMPOLINE = makeSymbol( "CLASS-PRINT-FUNCTION-TRAMPOLINE" );
    $list17 = ConsesLow.list( makeSymbol( "OPTIMIZE-FUNCALL" ), makeSymbol( "CLASS-P" ) );
    $sym18$CLASS_NAME = makeSymbol( "CLASS-NAME" );
    $sym19$_CSETF_CLASS_NAME = makeSymbol( "_CSETF-CLASS-NAME", "SUBLISP" );
    $sym20$CLASS_PARENT = makeSymbol( "CLASS-PARENT" );
    $sym21$_CSETF_CLASS_PARENT = makeSymbol( "_CSETF-CLASS-PARENT" );
    $sym22$CLASS_SUBCLASSES = makeSymbol( "CLASS-SUBCLASSES" );
    $sym23$_CSETF_CLASS_SUBCLASSES = makeSymbol( "_CSETF-CLASS-SUBCLASSES" );
    $sym24$CLASS_INTERFACE_NAMES = makeSymbol( "CLASS-INTERFACE-NAMES" );
    $sym25$_CSETF_CLASS_INTERFACE_NAMES = makeSymbol( "_CSETF-CLASS-INTERFACE-NAMES" );
    $sym26$CLASS_INTERFACES = makeSymbol( "CLASS-INTERFACES" );
    $sym27$_CSETF_CLASS_INTERFACES = makeSymbol( "_CSETF-CLASS-INTERFACES" );
    $sym28$CLASS_COMPILED_INHERITANCE_PATH = makeSymbol( "CLASS-COMPILED-INHERITANCE-PATH" );
    $sym29$_CSETF_CLASS_COMPILED_INHERITANCE_PATH = makeSymbol( "_CSETF-CLASS-COMPILED-INHERITANCE-PATH" );
    $sym30$CLASS_INSTANCE_VAR_DECLS = makeSymbol( "CLASS-INSTANCE-VAR-DECLS" );
    $sym31$_CSETF_CLASS_INSTANCE_VAR_DECLS = makeSymbol( "_CSETF-CLASS-INSTANCE-VAR-DECLS" );
    $sym32$CLASS_CLASS_VAR_DECLS = makeSymbol( "CLASS-CLASS-VAR-DECLS" );
    $sym33$_CSETF_CLASS_CLASS_VAR_DECLS = makeSymbol( "_CSETF-CLASS-CLASS-VAR-DECLS" );
    $sym34$CLASS_COMPILED_INSTANCE_SLOT_ACCESS_ALIST = makeSymbol( "CLASS-COMPILED-INSTANCE-SLOT-ACCESS-ALIST" );
    $sym35$_CSETF_CLASS_COMPILED_INSTANCE_SLOT_ACCESS_ALIST = makeSymbol( "_CSETF-CLASS-COMPILED-INSTANCE-SLOT-ACCESS-ALIST" );
    $sym36$CLASS_COMPILED_INSTANCE_BOOLEAN_SLOT_ACCESS_ALIST = makeSymbol( "CLASS-COMPILED-INSTANCE-BOOLEAN-SLOT-ACCESS-ALIST" );
    $sym37$_CSETF_CLASS_COMPILED_INSTANCE_BOOLEAN_SLOT_ACCESS_ALIST = makeSymbol( "_CSETF-CLASS-COMPILED-INSTANCE-BOOLEAN-SLOT-ACCESS-ALIST" );
    $sym38$CLASS_COMPILED_CLASS_SLOT_ACCESS_ALIST = makeSymbol( "CLASS-COMPILED-CLASS-SLOT-ACCESS-ALIST" );
    $sym39$_CSETF_CLASS_COMPILED_CLASS_SLOT_ACCESS_ALIST = makeSymbol( "_CSETF-CLASS-COMPILED-CLASS-SLOT-ACCESS-ALIST" );
    $sym40$CLASS_COMPILED_CLASS_BOOLEAN_SLOT_ACCESS_ALIST = makeSymbol( "CLASS-COMPILED-CLASS-BOOLEAN-SLOT-ACCESS-ALIST" );
    $sym41$_CSETF_CLASS_COMPILED_CLASS_BOOLEAN_SLOT_ACCESS_ALIST = makeSymbol( "_CSETF-CLASS-COMPILED-CLASS-BOOLEAN-SLOT-ACCESS-ALIST" );
    $sym42$CLASS_SLOT_ACCESSOR_ALIST = makeSymbol( "CLASS-SLOT-ACCESSOR-ALIST" );
    $sym43$_CSETF_CLASS_SLOT_ACCESSOR_ALIST = makeSymbol( "_CSETF-CLASS-SLOT-ACCESSOR-ALIST" );
    $sym44$CLASS_INSTANCE_METHOD_DECLS = makeSymbol( "CLASS-INSTANCE-METHOD-DECLS" );
    $sym45$_CSETF_CLASS_INSTANCE_METHOD_DECLS = makeSymbol( "_CSETF-CLASS-INSTANCE-METHOD-DECLS" );
    $sym46$CLASS_CLASS_METHOD_DECLS = makeSymbol( "CLASS-CLASS-METHOD-DECLS" );
    $sym47$_CSETF_CLASS_CLASS_METHOD_DECLS = makeSymbol( "_CSETF-CLASS-CLASS-METHOD-DECLS" );
    $sym48$CLASS_BOOLEAN_SLOTS = makeSymbol( "CLASS-BOOLEAN-SLOTS" );
    $sym49$_CSETF_CLASS_BOOLEAN_SLOTS = makeSymbol( "_CSETF-CLASS-BOOLEAN-SLOTS" );
    $sym50$CLASS_ANY_SLOTS = makeSymbol( "CLASS-ANY-SLOTS" );
    $sym51$_CSETF_CLASS_ANY_SLOTS = makeSymbol( "_CSETF-CLASS-ANY-SLOTS" );
    $sym52$CLASS_COMPILED_INSTANCE_METHOD_ACCESS_ALIST = makeSymbol( "CLASS-COMPILED-INSTANCE-METHOD-ACCESS-ALIST" );
    $sym53$_CSETF_CLASS_COMPILED_INSTANCE_METHOD_ACCESS_ALIST = makeSymbol( "_CSETF-CLASS-COMPILED-INSTANCE-METHOD-ACCESS-ALIST" );
    $sym54$CLASS_COMPILED_CLASS_METHOD_ACCESS_ALIST = makeSymbol( "CLASS-COMPILED-CLASS-METHOD-ACCESS-ALIST" );
    $sym55$_CSETF_CLASS_COMPILED_CLASS_METHOD_ACCESS_ALIST = makeSymbol( "_CSETF-CLASS-COMPILED-CLASS-METHOD-ACCESS-ALIST" );
    $sym56$CLASS_TABLIFIED_INSTANCE_METHODS = makeSymbol( "CLASS-TABLIFIED-INSTANCE-METHODS" );
    $sym57$_CSETF_CLASS_TABLIFIED_INSTANCE_METHODS = makeSymbol( "_CSETF-CLASS-TABLIFIED-INSTANCE-METHODS" );
    $sym58$CLASS_DEFINITION_LOCK = makeSymbol( "CLASS-DEFINITION-LOCK" );
    $sym59$_CSETF_CLASS_DEFINITION_LOCK = makeSymbol( "_CSETF-CLASS-DEFINITION-LOCK" );
    $sym60$CLASS_ACCESS_LOCK = makeSymbol( "CLASS-ACCESS-LOCK" );
    $sym61$_CSETF_CLASS_ACCESS_LOCK = makeSymbol( "_CSETF-CLASS-ACCESS-LOCK" );
    $sym62$CLASS_SYNCHRONIZED_SLOTS_P = makeSymbol( "CLASS-SYNCHRONIZED-SLOTS-P" );
    $sym63$_CSETF_CLASS_SYNCHRONIZED_SLOTS_P = makeSymbol( "_CSETF-CLASS-SYNCHRONIZED-SLOTS-P" );
    $sym64$CLASS_PLIST = makeSymbol( "CLASS-PLIST" );
    $sym65$_CSETF_CLASS_PLIST = makeSymbol( "_CSETF-CLASS-PLIST" );
    $sym66$CLASS_CLASS_INITIALIZATION_FUNCTION = makeSymbol( "CLASS-CLASS-INITIALIZATION-FUNCTION" );
    $sym67$_CSETF_CLASS_CLASS_INITIALIZATION_FUNCTION = makeSymbol( "_CSETF-CLASS-CLASS-INITIALIZATION-FUNCTION" );
    $sym68$CLASS_CLASS_INITIALIZED_P = makeSymbol( "CLASS-CLASS-INITIALIZED-P" );
    $sym69$_CSETF_CLASS_CLASS_INITIALIZED_P = makeSymbol( "_CSETF-CLASS-CLASS-INITIALIZED-P" );
    $sym70$CLASS_INSTANCE_INITIALIZATION_FUNCTION = makeSymbol( "CLASS-INSTANCE-INITIALIZATION-FUNCTION" );
    $sym71$_CSETF_CLASS_INSTANCE_INITIALIZATION_FUNCTION = makeSymbol( "_CSETF-CLASS-INSTANCE-INITIALIZATION-FUNCTION" );
    $sym72$CLASS_CLASS_PROPERTIES = makeSymbol( "CLASS-CLASS-PROPERTIES" );
    $sym73$_CSETF_CLASS_CLASS_PROPERTIES = makeSymbol( "_CSETF-CLASS-CLASS-PROPERTIES" );
    $kw74$NAME = makeKeyword( "NAME" );
    $kw75$PARENT = makeKeyword( "PARENT" );
    $kw76$SUBCLASSES = makeKeyword( "SUBCLASSES" );
    $kw77$INTERFACE_NAMES = makeKeyword( "INTERFACE-NAMES" );
    $kw78$INTERFACES = makeKeyword( "INTERFACES" );
    $kw79$COMPILED_INHERITANCE_PATH = makeKeyword( "COMPILED-INHERITANCE-PATH" );
    $kw80$INSTANCE_VAR_DECLS = makeKeyword( "INSTANCE-VAR-DECLS" );
    $kw81$CLASS_VAR_DECLS = makeKeyword( "CLASS-VAR-DECLS" );
    $kw82$COMPILED_INSTANCE_SLOT_ACCESS_ALIST = makeKeyword( "COMPILED-INSTANCE-SLOT-ACCESS-ALIST" );
    $kw83$COMPILED_INSTANCE_BOOLEAN_SLOT_ACCESS_ALIST = makeKeyword( "COMPILED-INSTANCE-BOOLEAN-SLOT-ACCESS-ALIST" );
    $kw84$COMPILED_CLASS_SLOT_ACCESS_ALIST = makeKeyword( "COMPILED-CLASS-SLOT-ACCESS-ALIST" );
    $kw85$COMPILED_CLASS_BOOLEAN_SLOT_ACCESS_ALIST = makeKeyword( "COMPILED-CLASS-BOOLEAN-SLOT-ACCESS-ALIST" );
    $kw86$SLOT_ACCESSOR_ALIST = makeKeyword( "SLOT-ACCESSOR-ALIST" );
    $kw87$INSTANCE_METHOD_DECLS = makeKeyword( "INSTANCE-METHOD-DECLS" );
    $kw88$CLASS_METHOD_DECLS = makeKeyword( "CLASS-METHOD-DECLS" );
    $kw89$BOOLEAN_SLOTS = makeKeyword( "BOOLEAN-SLOTS" );
    $kw90$ANY_SLOTS = makeKeyword( "ANY-SLOTS" );
    $kw91$COMPILED_INSTANCE_METHOD_ACCESS_ALIST = makeKeyword( "COMPILED-INSTANCE-METHOD-ACCESS-ALIST" );
    $kw92$COMPILED_CLASS_METHOD_ACCESS_ALIST = makeKeyword( "COMPILED-CLASS-METHOD-ACCESS-ALIST" );
    $kw93$TABLIFIED_INSTANCE_METHODS = makeKeyword( "TABLIFIED-INSTANCE-METHODS" );
    $kw94$DEFINITION_LOCK = makeKeyword( "DEFINITION-LOCK" );
    $kw95$ACCESS_LOCK = makeKeyword( "ACCESS-LOCK" );
    $kw96$SYNCHRONIZED_SLOTS_P = makeKeyword( "SYNCHRONIZED-SLOTS-P" );
    $kw97$PLIST = makeKeyword( "PLIST" );
    $kw98$CLASS_INITIALIZATION_FUNCTION = makeKeyword( "CLASS-INITIALIZATION-FUNCTION" );
    $kw99$CLASS_INITIALIZED_P = makeKeyword( "CLASS-INITIALIZED-P" );
    $kw100$INSTANCE_INITIALIZATION_FUNCTION = makeKeyword( "INSTANCE-INITIALIZATION-FUNCTION" );
    $kw101$CLASS_PROPERTIES = makeKeyword( "CLASS-PROPERTIES" );
    $str102$Invalid_slot__S_for_construction_ = makeString( "Invalid slot ~S for construction function" );
    $kw103$BEGIN = makeKeyword( "BEGIN" );
    $sym104$MAKE_CLASS = makeSymbol( "MAKE-CLASS" );
    $kw105$SLOT = makeKeyword( "SLOT" );
    $kw106$END = makeKeyword( "END" );
    $sym107$VISIT_DEFSTRUCT_OBJECT_CLASS_METHOD = makeSymbol( "VISIT-DEFSTRUCT-OBJECT-CLASS-METHOD" );
    $list108 = ConsesLow.list( makeSymbol( "CLASS" ), makeSymbol( "&BODY" ), makeSymbol( "FORMS" ) );
    $str109$class = makeString( "class" );
    $sym110$CLASS_ = makeSymbol( "CLASS-" );
    $list111 = ConsesLow.list( new SubLObject[] { makeSymbol( "NAME" ), makeSymbol( "PARENT" ), makeSymbol( "SUBCLASSES" ), makeSymbol( "INTERFACE-NAMES" ), makeSymbol( "INTERFACES" ), makeSymbol(
        "COMPILED-INHERITANCE-PATH" ), makeSymbol( "INSTANCE-VAR-DECLS" ), makeSymbol( "CLASS-VAR-DECLS" ), makeSymbol( "COMPILED-INSTANCE-SLOT-ACCESS-ALIST" ), makeSymbol(
            "COMPILED-INSTANCE-BOOLEAN-SLOT-ACCESS-ALIST" ), makeSymbol( "COMPILED-CLASS-SLOT-ACCESS-ALIST" ), makeSymbol( "COMPILED-CLASS-BOOLEAN-SLOT-ACCESS-ALIST" ), makeSymbol( "SLOT-ACCESSOR-ALIST" ), makeSymbol(
                "INSTANCE-METHOD-DECLS" ), makeSymbol( "CLASS-METHOD-DECLS" ), makeSymbol( "BOOLEAN-SLOTS" ), makeSymbol( "ANY-SLOTS" ), makeSymbol( "COMPILED-INSTANCE-METHOD-ACCESS-ALIST" ), makeSymbol(
                    "COMPILED-CLASS-METHOD-ACCESS-ALIST" ), makeSymbol( "TABLIFIED-INSTANCE-METHODS" ), makeSymbol( "CLASS-INITIALIZATION-FUNCTION" ), makeSymbol( "INSTANCE-INITIALIZATION-FUNCTION" )
    } );
    $str112$__CLASS__S_ = makeString( "#<CLASS:~S>" );
    $list113 = ConsesLow.list( makeSymbol( "PROPERTY-NAME" ), makeSymbol( "OFFSET" ) );
    $str114$SUBLOOP_CLASS_PROPERTY_ = makeString( "SUBLOOP-CLASS-PROPERTY-" );
    $str115$GET_ = makeString( "GET-" );
    $str116$SET_ = makeString( "SET-" );
    $sym117$PROGN = makeSymbol( "PROGN" );
    $sym118$DEFINE_PROTECTED = makeSymbol( "DEFINE-PROTECTED" );
    $list119 = ConsesLow.list( makeSymbol( "CLASS-STRUCTURE" ) );
    $sym120$RET = makeSymbol( "RET" );
    $sym121$LDB_TEST = makeSymbol( "LDB-TEST" );
    $sym122$BYTE = makeSymbol( "BYTE" );
    $list123 = ConsesLow.list( ConsesLow.list( makeSymbol( "CLASS-CLASS-PROPERTIES" ), makeSymbol( "CLASS-STRUCTURE" ) ) );
    $list124 = ConsesLow.list( makeSymbol( "CLASS-STRUCTURE" ), makeSymbol( "NEW-VALUE" ) );
    $sym125$CSETF = makeSymbol( "CSETF" );
    $list126 = ConsesLow.list( makeSymbol( "CLASS-CLASS-PROPERTIES" ), makeSymbol( "CLASS-STRUCTURE" ) );
    $sym127$DPB = makeSymbol( "DPB" );
    $list128 = ConsesLow.list( makeSymbol( "FIF" ), makeSymbol( "NEW-VALUE" ), ONE_INTEGER, ZERO_INTEGER );
    $list129 = ConsesLow.list( ConsesLow.list( makeSymbol( "RET" ), makeSymbol( "NEW-VALUE" ) ) );
    $sym130$INSTANCE = makeSymbol( "INSTANCE" );
    $sym131$INSTANCE_P = makeSymbol( "INSTANCE-P" );
    $list132 = ConsesLow.list( makeSymbol( "CLASS" ), makeSymbol( "BOOLEAN-SLOTS" ), makeSymbol( "ANY-SLOTS" ), makeSymbol( "PLIST" ) );
    $list133 = ConsesLow.list( makeKeyword( "CLASS" ), makeKeyword( "BOOLEAN-SLOTS" ), makeKeyword( "ANY-SLOTS" ), makeKeyword( "PLIST" ) );
    $list134 = ConsesLow.list( makeSymbol( "INSTANCE-CLASS" ), makeSymbol( "INSTANCE-BOOLEAN-SLOTS" ), makeSymbol( "INSTANCE-ANY-SLOTS" ), makeSymbol( "INSTANCE-PLIST" ) );
    $list135 = ConsesLow.list( makeSymbol( "_CSETF-INSTANCE-CLASS" ), makeSymbol( "_CSETF-INSTANCE-BOOLEAN-SLOTS" ), makeSymbol( "_CSETF-INSTANCE-ANY-SLOTS" ), makeSymbol( "_CSETF-INSTANCE-PLIST" ) );
    $sym136$PRINT_INSTANCE = makeSymbol( "PRINT-INSTANCE" );
    $sym137$INSTANCE_PRINT_FUNCTION_TRAMPOLINE = makeSymbol( "INSTANCE-PRINT-FUNCTION-TRAMPOLINE" );
    $list138 = ConsesLow.list( makeSymbol( "OPTIMIZE-FUNCALL" ), makeSymbol( "INSTANCE-P" ) );
    $sym139$INSTANCE_CLASS = makeSymbol( "INSTANCE-CLASS" );
    $sym140$_CSETF_INSTANCE_CLASS = makeSymbol( "_CSETF-INSTANCE-CLASS" );
    $sym141$INSTANCE_BOOLEAN_SLOTS = makeSymbol( "INSTANCE-BOOLEAN-SLOTS" );
    $sym142$_CSETF_INSTANCE_BOOLEAN_SLOTS = makeSymbol( "_CSETF-INSTANCE-BOOLEAN-SLOTS" );
    $sym143$INSTANCE_ANY_SLOTS = makeSymbol( "INSTANCE-ANY-SLOTS" );
    $sym144$_CSETF_INSTANCE_ANY_SLOTS = makeSymbol( "_CSETF-INSTANCE-ANY-SLOTS" );
    $sym145$INSTANCE_PLIST = makeSymbol( "INSTANCE-PLIST" );
    $sym146$_CSETF_INSTANCE_PLIST = makeSymbol( "_CSETF-INSTANCE-PLIST" );
    $kw147$CLASS = makeKeyword( "CLASS" );
    $sym148$MAKE_INSTANCE = makeSymbol( "MAKE-INSTANCE" );
    $sym149$VISIT_DEFSTRUCT_OBJECT_INSTANCE_METHOD = makeSymbol( "VISIT-DEFSTRUCT-OBJECT-INSTANCE-METHOD" );
    $list150 = ConsesLow.list( makeSymbol( "INSTANCE" ), makeSymbol( "&BODY" ), makeSymbol( "FORMS" ) );
    $str151$instance = makeString( "instance" );
    $sym152$INSTANCE_ = makeSymbol( "INSTANCE-" );
    $sym153$OBJECT = makeSymbol( "OBJECT" );
    $sym154$PRINT = makeSymbol( "PRINT" );
    $str155$__Instance_of__S_ = makeString( "#<Instance of ~S>" );
    $sym156$INTERFACE = makeSymbol( "INTERFACE" );
    $sym157$INTERFACE_P = makeSymbol( "INTERFACE-P" );
    $list158 = ConsesLow.list( new SubLObject[] { makeSymbol( "NAME" ), makeSymbol( "PARENTS" ), makeSymbol( "COMPILED-INHERITANCE-PATH" ), makeSymbol( "SUBINTERFACES" ), makeSymbol( "IMPLEMENTERS" ), makeSymbol(
        "INSTANCE-METHOD-DECLS" ), makeSymbol( "CLASS-METHOD-DECLS" ), makeSymbol( "COMPILED-INSTANCE-METHOD-DECLS" ), makeSymbol( "COMPILED-CLASS-METHOD-DECLS" ), makeSymbol( "LOCAL-CLASS-METHODS" ), makeSymbol(
            "LOCAL-INSTANCE-METHODS" ), makeSymbol( "MARK-LIST" ), makeSymbol( "PLIST" ), makeSymbol( "DEFINITION-LOCK" )
    } );
    $list159 = ConsesLow.list( new SubLObject[] { makeKeyword( "NAME" ), makeKeyword( "PARENTS" ), makeKeyword( "COMPILED-INHERITANCE-PATH" ), makeKeyword( "SUBINTERFACES" ), makeKeyword( "IMPLEMENTERS" ), makeKeyword(
        "INSTANCE-METHOD-DECLS" ), makeKeyword( "CLASS-METHOD-DECLS" ), makeKeyword( "COMPILED-INSTANCE-METHOD-DECLS" ), makeKeyword( "COMPILED-CLASS-METHOD-DECLS" ), makeKeyword( "LOCAL-CLASS-METHODS" ), makeKeyword(
            "LOCAL-INSTANCE-METHODS" ), makeKeyword( "MARK-LIST" ), makeKeyword( "PLIST" ), makeKeyword( "DEFINITION-LOCK" )
    } );
    $list160 = ConsesLow.list( new SubLObject[] { makeSymbol( "INTERFACE-NAME" ), makeSymbol( "INTERFACE-PARENTS" ), makeSymbol( "INTERFACE-COMPILED-INHERITANCE-PATH" ), makeSymbol( "INTERFACE-SUBINTERFACES" ),
      makeSymbol( "INTERFACE-IMPLEMENTERS" ), makeSymbol( "INTERFACE-INSTANCE-METHOD-DECLS" ), makeSymbol( "INTERFACE-CLASS-METHOD-DECLS" ), makeSymbol( "INTERFACE-COMPILED-INSTANCE-METHOD-DECLS" ), makeSymbol(
          "INTERFACE-COMPILED-CLASS-METHOD-DECLS" ), makeSymbol( "INTERFACE-LOCAL-CLASS-METHODS" ), makeSymbol( "INTERFACE-LOCAL-INSTANCE-METHODS" ), makeSymbol( "INTERFACE-MARK-LIST" ), makeSymbol( "INTERFACE-PLIST" ),
      makeSymbol( "INTERFACE-DEFINITION-LOCK" )
    } );
    $list161 = ConsesLow.list( new SubLObject[] { makeSymbol( "_CSETF-INTERFACE-NAME" ), makeSymbol( "_CSETF-INTERFACE-PARENTS" ), makeSymbol( "_CSETF-INTERFACE-COMPILED-INHERITANCE-PATH" ), makeSymbol(
        "_CSETF-INTERFACE-SUBINTERFACES" ), makeSymbol( "_CSETF-INTERFACE-IMPLEMENTERS" ), makeSymbol( "_CSETF-INTERFACE-INSTANCE-METHOD-DECLS" ), makeSymbol( "_CSETF-INTERFACE-CLASS-METHOD-DECLS" ), makeSymbol(
            "_CSETF-INTERFACE-COMPILED-INSTANCE-METHOD-DECLS" ), makeSymbol( "_CSETF-INTERFACE-COMPILED-CLASS-METHOD-DECLS" ), makeSymbol( "_CSETF-INTERFACE-LOCAL-CLASS-METHODS" ), makeSymbol(
                "_CSETF-INTERFACE-LOCAL-INSTANCE-METHODS" ), makeSymbol( "_CSETF-INTERFACE-MARK-LIST" ), makeSymbol( "_CSETF-INTERFACE-PLIST" ), makeSymbol( "_CSETF-INTERFACE-DEFINITION-LOCK" )
    } );
    $sym162$PRINT_INTERFACE = makeSymbol( "PRINT-INTERFACE" );
    $sym163$INTERFACE_PRINT_FUNCTION_TRAMPOLINE = makeSymbol( "INTERFACE-PRINT-FUNCTION-TRAMPOLINE" );
    $list164 = ConsesLow.list( makeSymbol( "OPTIMIZE-FUNCALL" ), makeSymbol( "INTERFACE-P" ) );
    $sym165$INTERFACE_NAME = makeSymbol( "INTERFACE-NAME" );
    $sym166$_CSETF_INTERFACE_NAME = makeSymbol( "_CSETF-INTERFACE-NAME" );
    $sym167$INTERFACE_PARENTS = makeSymbol( "INTERFACE-PARENTS" );
    $sym168$_CSETF_INTERFACE_PARENTS = makeSymbol( "_CSETF-INTERFACE-PARENTS" );
    $sym169$INTERFACE_COMPILED_INHERITANCE_PATH = makeSymbol( "INTERFACE-COMPILED-INHERITANCE-PATH" );
    $sym170$_CSETF_INTERFACE_COMPILED_INHERITANCE_PATH = makeSymbol( "_CSETF-INTERFACE-COMPILED-INHERITANCE-PATH" );
    $sym171$INTERFACE_SUBINTERFACES = makeSymbol( "INTERFACE-SUBINTERFACES" );
    $sym172$_CSETF_INTERFACE_SUBINTERFACES = makeSymbol( "_CSETF-INTERFACE-SUBINTERFACES" );
    $sym173$INTERFACE_IMPLEMENTERS = makeSymbol( "INTERFACE-IMPLEMENTERS" );
    $sym174$_CSETF_INTERFACE_IMPLEMENTERS = makeSymbol( "_CSETF-INTERFACE-IMPLEMENTERS" );
    $sym175$INTERFACE_INSTANCE_METHOD_DECLS = makeSymbol( "INTERFACE-INSTANCE-METHOD-DECLS" );
    $sym176$_CSETF_INTERFACE_INSTANCE_METHOD_DECLS = makeSymbol( "_CSETF-INTERFACE-INSTANCE-METHOD-DECLS" );
    $sym177$INTERFACE_CLASS_METHOD_DECLS = makeSymbol( "INTERFACE-CLASS-METHOD-DECLS" );
    $sym178$_CSETF_INTERFACE_CLASS_METHOD_DECLS = makeSymbol( "_CSETF-INTERFACE-CLASS-METHOD-DECLS" );
    $sym179$INTERFACE_COMPILED_INSTANCE_METHOD_DECLS = makeSymbol( "INTERFACE-COMPILED-INSTANCE-METHOD-DECLS" );
    $sym180$_CSETF_INTERFACE_COMPILED_INSTANCE_METHOD_DECLS = makeSymbol( "_CSETF-INTERFACE-COMPILED-INSTANCE-METHOD-DECLS" );
    $sym181$INTERFACE_COMPILED_CLASS_METHOD_DECLS = makeSymbol( "INTERFACE-COMPILED-CLASS-METHOD-DECLS" );
    $sym182$_CSETF_INTERFACE_COMPILED_CLASS_METHOD_DECLS = makeSymbol( "_CSETF-INTERFACE-COMPILED-CLASS-METHOD-DECLS" );
    $sym183$INTERFACE_LOCAL_CLASS_METHODS = makeSymbol( "INTERFACE-LOCAL-CLASS-METHODS" );
    $sym184$_CSETF_INTERFACE_LOCAL_CLASS_METHODS = makeSymbol( "_CSETF-INTERFACE-LOCAL-CLASS-METHODS" );
    $sym185$INTERFACE_LOCAL_INSTANCE_METHODS = makeSymbol( "INTERFACE-LOCAL-INSTANCE-METHODS" );
    $sym186$_CSETF_INTERFACE_LOCAL_INSTANCE_METHODS = makeSymbol( "_CSETF-INTERFACE-LOCAL-INSTANCE-METHODS" );
    $sym187$INTERFACE_MARK_LIST = makeSymbol( "INTERFACE-MARK-LIST" );
    $sym188$_CSETF_INTERFACE_MARK_LIST = makeSymbol( "_CSETF-INTERFACE-MARK-LIST" );
    $sym189$INTERFACE_PLIST = makeSymbol( "INTERFACE-PLIST" );
    $sym190$_CSETF_INTERFACE_PLIST = makeSymbol( "_CSETF-INTERFACE-PLIST" );
    $sym191$INTERFACE_DEFINITION_LOCK = makeSymbol( "INTERFACE-DEFINITION-LOCK" );
    $sym192$_CSETF_INTERFACE_DEFINITION_LOCK = makeSymbol( "_CSETF-INTERFACE-DEFINITION-LOCK" );
    $kw193$PARENTS = makeKeyword( "PARENTS" );
    $kw194$SUBINTERFACES = makeKeyword( "SUBINTERFACES" );
    $kw195$IMPLEMENTERS = makeKeyword( "IMPLEMENTERS" );
    $kw196$COMPILED_INSTANCE_METHOD_DECLS = makeKeyword( "COMPILED-INSTANCE-METHOD-DECLS" );
    $kw197$COMPILED_CLASS_METHOD_DECLS = makeKeyword( "COMPILED-CLASS-METHOD-DECLS" );
    $kw198$LOCAL_CLASS_METHODS = makeKeyword( "LOCAL-CLASS-METHODS" );
    $kw199$LOCAL_INSTANCE_METHODS = makeKeyword( "LOCAL-INSTANCE-METHODS" );
    $kw200$MARK_LIST = makeKeyword( "MARK-LIST" );
    $sym201$MAKE_INTERFACE = makeSymbol( "MAKE-INTERFACE" );
    $sym202$VISIT_DEFSTRUCT_OBJECT_INTERFACE_METHOD = makeSymbol( "VISIT-DEFSTRUCT-OBJECT-INTERFACE-METHOD" );
    $list203 = ConsesLow.list( makeSymbol( "INTERFACE" ), makeSymbol( "&BODY" ), makeSymbol( "FORMS" ) );
    $str204$interface = makeString( "interface" );
    $sym205$INTERFACE_ = makeSymbol( "INTERFACE-" );
    $list206 = ConsesLow.list( new SubLObject[] { makeSymbol( "NAME" ), makeSymbol( "PARENTS" ), makeSymbol( "COMPILED-INHERITANCE-PATH" ), makeSymbol( "SUBINTERFACES" ), makeSymbol( "IMPLEMENTERS" ), makeSymbol(
        "INSTANCE-METHOD-DECLS" ), makeSymbol( "CLASS-METHOD-DECLS" ), makeSymbol( "COMPILED-INSTANCE-METHOD-DECLS" ), makeSymbol( "COMPILED-CLASS-METHOD-DECLS" ), makeSymbol( "LOCAL-CLASS-METHODS" ), makeSymbol(
            "LOCAL-INSTANCE-METHODS" )
    } );
    $str207$__Interface__S_PARENTS___S_ = makeString( "#<Interface:~S PARENTS: ~S>" );
    $sym208$METHOD = makeSymbol( "METHOD" );
    $sym209$METHOD_P = makeSymbol( "METHOD-P" );
    $list210 = ConsesLow.list( new SubLObject[] { makeSymbol( "NAME" ), makeSymbol( "CLASS-NAME" ), makeSymbol( "LAMBDA-LIST" ), makeSymbol( "BODY" ), makeSymbol( "PROTECTION" ), makeSymbol( "SCOPE" ), makeSymbol(
        "UPDATE-TYPE" ), makeSymbol( "FUNCTION-NAME" ), makeSymbol( "FUNCTION-DEF" ), makeSymbol( "BEFORE-LISTENERS" ), makeSymbol( "AFTER-LISTENERS" ), makeSymbol( "INSTANTIATE-TEMPLATE" )
    } );
    $list211 = ConsesLow.list( new SubLObject[] { makeKeyword( "NAME" ), makeKeyword( "CLASS-NAME" ), makeKeyword( "LAMBDA-LIST" ), makeKeyword( "BODY" ), makeKeyword( "PROTECTION" ), makeKeyword( "SCOPE" ), makeKeyword(
        "UPDATE-TYPE" ), makeKeyword( "FUNCTION-NAME" ), makeKeyword( "FUNCTION-DEF" ), makeKeyword( "BEFORE-LISTENERS" ), makeKeyword( "AFTER-LISTENERS" ), makeKeyword( "INSTANTIATE-TEMPLATE" )
    } );
    $list212 = ConsesLow.list( new SubLObject[] { makeSymbol( "METHOD-NAME" ), makeSymbol( "METHOD-CLASS-NAME" ), makeSymbol( "METHOD-LAMBDA-LIST" ), makeSymbol( "METHOD-BODY" ), makeSymbol( "METHOD-PROTECTION" ),
      makeSymbol( "METHOD-SCOPE" ), makeSymbol( "METHOD-UPDATE-TYPE" ), makeSymbol( "METHOD-FUNCTION-NAME" ), makeSymbol( "METHOD-FUNCTION-DEF" ), makeSymbol( "METHOD-BEFORE-LISTENERS" ), makeSymbol(
          "METHOD-AFTER-LISTENERS" ), makeSymbol( "METHOD-INSTANTIATE-TEMPLATE" )
    } );
    $list213 = ConsesLow.list( new SubLObject[] { makeSymbol( "_CSETF-METHOD-NAME" ), makeSymbol( "_CSETF-METHOD-CLASS-NAME" ), makeSymbol( "_CSETF-METHOD-LAMBDA-LIST" ), makeSymbol( "_CSETF-METHOD-BODY" ), makeSymbol(
        "_CSETF-METHOD-PROTECTION" ), makeSymbol( "_CSETF-METHOD-SCOPE" ), makeSymbol( "_CSETF-METHOD-UPDATE-TYPE" ), makeSymbol( "_CSETF-METHOD-FUNCTION-NAME" ), makeSymbol( "_CSETF-METHOD-FUNCTION-DEF" ), makeSymbol(
            "_CSETF-METHOD-BEFORE-LISTENERS" ), makeSymbol( "_CSETF-METHOD-AFTER-LISTENERS" ), makeSymbol( "_CSETF-METHOD-INSTANTIATE-TEMPLATE" )
    } );
    $sym214$PRINT_METHOD = makeSymbol( "PRINT-METHOD" );
    $sym215$METHOD_PRINT_FUNCTION_TRAMPOLINE = makeSymbol( "METHOD-PRINT-FUNCTION-TRAMPOLINE" );
    $list216 = ConsesLow.list( makeSymbol( "OPTIMIZE-FUNCALL" ), makeSymbol( "METHOD-P" ) );
    $sym217$METHOD_NAME = makeSymbol( "METHOD-NAME" );
    $sym218$_CSETF_METHOD_NAME = makeSymbol( "_CSETF-METHOD-NAME" );
    $sym219$METHOD_CLASS_NAME = makeSymbol( "METHOD-CLASS-NAME" );
    $sym220$_CSETF_METHOD_CLASS_NAME = makeSymbol( "_CSETF-METHOD-CLASS-NAME" );
    $sym221$METHOD_LAMBDA_LIST = makeSymbol( "METHOD-LAMBDA-LIST" );
    $sym222$_CSETF_METHOD_LAMBDA_LIST = makeSymbol( "_CSETF-METHOD-LAMBDA-LIST" );
    $sym223$METHOD_BODY = makeSymbol( "METHOD-BODY" );
    $sym224$_CSETF_METHOD_BODY = makeSymbol( "_CSETF-METHOD-BODY" );
    $sym225$METHOD_PROTECTION = makeSymbol( "METHOD-PROTECTION" );
    $sym226$_CSETF_METHOD_PROTECTION = makeSymbol( "_CSETF-METHOD-PROTECTION" );
    $sym227$METHOD_SCOPE = makeSymbol( "METHOD-SCOPE" );
    $sym228$_CSETF_METHOD_SCOPE = makeSymbol( "_CSETF-METHOD-SCOPE" );
    $sym229$METHOD_UPDATE_TYPE = makeSymbol( "METHOD-UPDATE-TYPE" );
    $sym230$_CSETF_METHOD_UPDATE_TYPE = makeSymbol( "_CSETF-METHOD-UPDATE-TYPE" );
    $sym231$METHOD_FUNCTION_NAME = makeSymbol( "METHOD-FUNCTION-NAME" );
    $sym232$_CSETF_METHOD_FUNCTION_NAME = makeSymbol( "_CSETF-METHOD-FUNCTION-NAME" );
    $sym233$METHOD_FUNCTION_DEF = makeSymbol( "METHOD-FUNCTION-DEF" );
    $sym234$_CSETF_METHOD_FUNCTION_DEF = makeSymbol( "_CSETF-METHOD-FUNCTION-DEF" );
    $sym235$METHOD_BEFORE_LISTENERS = makeSymbol( "METHOD-BEFORE-LISTENERS" );
    $sym236$_CSETF_METHOD_BEFORE_LISTENERS = makeSymbol( "_CSETF-METHOD-BEFORE-LISTENERS" );
    $sym237$METHOD_AFTER_LISTENERS = makeSymbol( "METHOD-AFTER-LISTENERS" );
    $sym238$_CSETF_METHOD_AFTER_LISTENERS = makeSymbol( "_CSETF-METHOD-AFTER-LISTENERS" );
    $sym239$METHOD_INSTANTIATE_TEMPLATE = makeSymbol( "METHOD-INSTANTIATE-TEMPLATE" );
    $sym240$_CSETF_METHOD_INSTANTIATE_TEMPLATE = makeSymbol( "_CSETF-METHOD-INSTANTIATE-TEMPLATE" );
    $kw241$CLASS_NAME = makeKeyword( "CLASS-NAME" );
    $kw242$LAMBDA_LIST = makeKeyword( "LAMBDA-LIST" );
    $kw243$BODY = makeKeyword( "BODY" );
    $kw244$PROTECTION = makeKeyword( "PROTECTION" );
    $kw245$SCOPE = makeKeyword( "SCOPE" );
    $kw246$UPDATE_TYPE = makeKeyword( "UPDATE-TYPE" );
    $kw247$FUNCTION_NAME = makeKeyword( "FUNCTION-NAME" );
    $kw248$FUNCTION_DEF = makeKeyword( "FUNCTION-DEF" );
    $kw249$BEFORE_LISTENERS = makeKeyword( "BEFORE-LISTENERS" );
    $kw250$AFTER_LISTENERS = makeKeyword( "AFTER-LISTENERS" );
    $kw251$INSTANTIATE_TEMPLATE = makeKeyword( "INSTANTIATE-TEMPLATE" );
    $sym252$MAKE_METHOD = makeSymbol( "MAKE-METHOD" );
    $sym253$VISIT_DEFSTRUCT_OBJECT_METHOD_METHOD = makeSymbol( "VISIT-DEFSTRUCT-OBJECT-METHOD-METHOD" );
    $list254 = ConsesLow.list( makeSymbol( "METHOD" ), makeSymbol( "&BODY" ), makeSymbol( "FORMS" ) );
    $str255$method = makeString( "method" );
    $sym256$METHOD_ = makeSymbol( "METHOD-" );
    $str257$__METHOD____S__S___S_ = makeString( "#<METHOD: (~S ~S) ~S>" );
    $int258$100 = makeInteger( 100 );
    $sym259$METHOD_TRACE = makeSymbol( "METHOD-TRACE" );
    $sym260$METHOD_TRACE_P = makeSymbol( "METHOD-TRACE-P" );
    $list261 = ConsesLow.list( makeSymbol( "NAME" ), makeSymbol( "CLASS-NAME" ), makeSymbol( "FUNCTION" ), makeSymbol( "OUTER" ) );
    $list262 = ConsesLow.list( makeKeyword( "NAME" ), makeKeyword( "CLASS-NAME" ), makeKeyword( "FUNCTION" ), makeKeyword( "OUTER" ) );
    $list263 = ConsesLow.list( makeSymbol( "METHOD-TRACE-NAME" ), makeSymbol( "METHOD-TRACE-CLASS-NAME" ), makeSymbol( "METHOD-TRACE-FUNCTION" ), makeSymbol( "METHOD-TRACE-OUTER" ) );
    $list264 = ConsesLow.list( makeSymbol( "_CSETF-METHOD-TRACE-NAME" ), makeSymbol( "_CSETF-METHOD-TRACE-CLASS-NAME" ), makeSymbol( "_CSETF-METHOD-TRACE-FUNCTION" ), makeSymbol( "_CSETF-METHOD-TRACE-OUTER" ) );
    $sym265$PRINT_METHOD_TRACE = makeSymbol( "PRINT-METHOD-TRACE" );
    $sym266$METHOD_TRACE_PRINT_FUNCTION_TRAMPOLINE = makeSymbol( "METHOD-TRACE-PRINT-FUNCTION-TRAMPOLINE" );
    $list267 = ConsesLow.list( makeSymbol( "OPTIMIZE-FUNCALL" ), makeSymbol( "METHOD-TRACE-P" ) );
    $sym268$METHOD_TRACE_NAME = makeSymbol( "METHOD-TRACE-NAME" );
    $sym269$_CSETF_METHOD_TRACE_NAME = makeSymbol( "_CSETF-METHOD-TRACE-NAME" );
    $sym270$METHOD_TRACE_CLASS_NAME = makeSymbol( "METHOD-TRACE-CLASS-NAME" );
    $sym271$_CSETF_METHOD_TRACE_CLASS_NAME = makeSymbol( "_CSETF-METHOD-TRACE-CLASS-NAME" );
    $sym272$METHOD_TRACE_FUNCTION = makeSymbol( "METHOD-TRACE-FUNCTION" );
    $sym273$_CSETF_METHOD_TRACE_FUNCTION = makeSymbol( "_CSETF-METHOD-TRACE-FUNCTION" );
    $sym274$METHOD_TRACE_OUTER = makeSymbol( "METHOD-TRACE-OUTER" );
    $sym275$_CSETF_METHOD_TRACE_OUTER = makeSymbol( "_CSETF-METHOD-TRACE-OUTER" );
    $kw276$FUNCTION = makeKeyword( "FUNCTION" );
    $kw277$OUTER = makeKeyword( "OUTER" );
    $sym278$MAKE_METHOD_TRACE = makeSymbol( "MAKE-METHOD-TRACE" );
    $sym279$VISIT_DEFSTRUCT_OBJECT_METHOD_TRACE_METHOD = makeSymbol( "VISIT-DEFSTRUCT-OBJECT-METHOD-TRACE-METHOD" );
    $list280 = ConsesLow.list( makeSymbol( "METHOD-TRACE" ), makeSymbol( "&BODY" ), makeSymbol( "FORMS" ) );
    $str281$method_trace = makeString( "method-trace" );
    $sym282$METHOD_TRACE_ = makeSymbol( "METHOD-TRACE-" );
    $str283$__METHOD_TRACE____S__S__ = makeString( "#<METHOD-TRACE: (~S ~S)>" );
    $sym284$METHOD_INFO = makeSymbol( "METHOD-INFO" );
    $sym285$METHOD_INFO_P = makeSymbol( "METHOD-INFO-P" );
    $list286 = ConsesLow.list( makeSymbol( "METHOD-NAME" ), makeSymbol( "CLASS-NAME" ), makeSymbol( "MV-USED-IN-BODY" ), makeSymbol( "MV-MODIFIED-IN-BODY" ), makeSymbol( "METHODS-USED-IN-BODY" ) );
    $list287 = ConsesLow.list( makeKeyword( "METHOD-NAME" ), makeKeyword( "CLASS-NAME" ), makeKeyword( "MV-USED-IN-BODY" ), makeKeyword( "MV-MODIFIED-IN-BODY" ), makeKeyword( "METHODS-USED-IN-BODY" ) );
    $list288 = ConsesLow.list( makeSymbol( "MI-METHOD-NAME" ), makeSymbol( "MI-CLASS-NAME" ), makeSymbol( "MI-MV-USED-IN-BODY" ), makeSymbol( "MI-MV-MODIFIED-IN-BODY" ), makeSymbol( "MI-METHODS-USED-IN-BODY" ) );
    $list289 = ConsesLow.list( makeSymbol( "_CSETF-MI-METHOD-NAME" ), makeSymbol( "_CSETF-MI-CLASS-NAME" ), makeSymbol( "_CSETF-MI-MV-USED-IN-BODY" ), makeSymbol( "_CSETF-MI-MV-MODIFIED-IN-BODY" ), makeSymbol(
        "_CSETF-MI-METHODS-USED-IN-BODY" ) );
    $sym290$DEFAULT_STRUCT_PRINT_FUNCTION = makeSymbol( "DEFAULT-STRUCT-PRINT-FUNCTION" );
    $sym291$METHOD_INFO_PRINT_FUNCTION_TRAMPOLINE = makeSymbol( "METHOD-INFO-PRINT-FUNCTION-TRAMPOLINE" );
    $list292 = ConsesLow.list( makeSymbol( "OPTIMIZE-FUNCALL" ), makeSymbol( "METHOD-INFO-P" ) );
    $sym293$MI_METHOD_NAME = makeSymbol( "MI-METHOD-NAME" );
    $sym294$_CSETF_MI_METHOD_NAME = makeSymbol( "_CSETF-MI-METHOD-NAME" );
    $sym295$MI_CLASS_NAME = makeSymbol( "MI-CLASS-NAME" );
    $sym296$_CSETF_MI_CLASS_NAME = makeSymbol( "_CSETF-MI-CLASS-NAME" );
    $sym297$MI_MV_USED_IN_BODY = makeSymbol( "MI-MV-USED-IN-BODY" );
    $sym298$_CSETF_MI_MV_USED_IN_BODY = makeSymbol( "_CSETF-MI-MV-USED-IN-BODY" );
    $sym299$MI_MV_MODIFIED_IN_BODY = makeSymbol( "MI-MV-MODIFIED-IN-BODY" );
    $sym300$_CSETF_MI_MV_MODIFIED_IN_BODY = makeSymbol( "_CSETF-MI-MV-MODIFIED-IN-BODY" );
    $sym301$MI_METHODS_USED_IN_BODY = makeSymbol( "MI-METHODS-USED-IN-BODY" );
    $sym302$_CSETF_MI_METHODS_USED_IN_BODY = makeSymbol( "_CSETF-MI-METHODS-USED-IN-BODY" );
    $kw303$METHOD_NAME = makeKeyword( "METHOD-NAME" );
    $kw304$MV_USED_IN_BODY = makeKeyword( "MV-USED-IN-BODY" );
    $kw305$MV_MODIFIED_IN_BODY = makeKeyword( "MV-MODIFIED-IN-BODY" );
    $kw306$METHODS_USED_IN_BODY = makeKeyword( "METHODS-USED-IN-BODY" );
    $sym307$MAKE_METHOD_INFO = makeSymbol( "MAKE-METHOD-INFO" );
    $sym308$VISIT_DEFSTRUCT_OBJECT_METHOD_INFO_METHOD = makeSymbol( "VISIT-DEFSTRUCT-OBJECT-METHOD-INFO-METHOD" );
    $list309 = ConsesLow.list( makeSymbol( "METHOD-INFO" ), makeSymbol( "&BODY" ), makeSymbol( "FORMS" ) );
    $str310$method_info = makeString( "method-info" );
    $sym311$MI_ = makeSymbol( "MI-" );
    $sym312$SLOT_LISTENER = makeSymbol( "SLOT-LISTENER" );
    $sym313$SLOT_LISTENER_P = makeSymbol( "SLOT-LISTENER-P" );
    $list314 = ConsesLow.list( makeSymbol( "SLOT-NAME" ), makeSymbol( "DEMON-TYPE" ), makeSymbol( "VALUE-TRIGGER" ), makeSymbol( "FUNCTIONAL-TYPE" ), makeSymbol( "ISA-METHOD" ), makeSymbol( "TARGET-INSTANCE" ) );
    $list315 = ConsesLow.list( makeKeyword( "SLOT-NAME" ), makeKeyword( "DEMON-TYPE" ), makeKeyword( "VALUE-TRIGGER" ), makeKeyword( "FUNCTIONAL-TYPE" ), makeKeyword( "ISA-METHOD" ), makeKeyword( "TARGET-INSTANCE" ) );
    $list316 = ConsesLow.list( makeSymbol( "SL-SLOT-NAME" ), makeSymbol( "SL-DEMON-TYPE" ), makeSymbol( "SL-VALUE-TRIGGER" ), makeSymbol( "SL-FUNCTIONAL-TYPE" ), makeSymbol( "SL-ISA-METHOD" ), makeSymbol(
        "SL-TARGET-INSTANCE" ) );
    $list317 = ConsesLow.list( makeSymbol( "_CSETF-SL-SLOT-NAME" ), makeSymbol( "_CSETF-SL-DEMON-TYPE" ), makeSymbol( "_CSETF-SL-VALUE-TRIGGER" ), makeSymbol( "_CSETF-SL-FUNCTIONAL-TYPE" ), makeSymbol(
        "_CSETF-SL-ISA-METHOD" ), makeSymbol( "_CSETF-SL-TARGET-INSTANCE" ) );
    $sym318$PRINT_SLOT_LISTENER = makeSymbol( "PRINT-SLOT-LISTENER" );
    $sym319$SLOT_LISTENER_PRINT_FUNCTION_TRAMPOLINE = makeSymbol( "SLOT-LISTENER-PRINT-FUNCTION-TRAMPOLINE" );
    $list320 = ConsesLow.list( makeSymbol( "OPTIMIZE-FUNCALL" ), makeSymbol( "SLOT-LISTENER-P" ) );
    $sym321$SL_SLOT_NAME = makeSymbol( "SL-SLOT-NAME" );
    $sym322$_CSETF_SL_SLOT_NAME = makeSymbol( "_CSETF-SL-SLOT-NAME" );
    $sym323$SL_DEMON_TYPE = makeSymbol( "SL-DEMON-TYPE" );
    $sym324$_CSETF_SL_DEMON_TYPE = makeSymbol( "_CSETF-SL-DEMON-TYPE" );
    $sym325$SL_VALUE_TRIGGER = makeSymbol( "SL-VALUE-TRIGGER" );
    $sym326$_CSETF_SL_VALUE_TRIGGER = makeSymbol( "_CSETF-SL-VALUE-TRIGGER" );
    $sym327$SL_FUNCTIONAL_TYPE = makeSymbol( "SL-FUNCTIONAL-TYPE" );
    $sym328$_CSETF_SL_FUNCTIONAL_TYPE = makeSymbol( "_CSETF-SL-FUNCTIONAL-TYPE" );
    $sym329$SL_ISA_METHOD = makeSymbol( "SL-ISA-METHOD" );
    $sym330$_CSETF_SL_ISA_METHOD = makeSymbol( "_CSETF-SL-ISA-METHOD" );
    $sym331$SL_TARGET_INSTANCE = makeSymbol( "SL-TARGET-INSTANCE" );
    $sym332$_CSETF_SL_TARGET_INSTANCE = makeSymbol( "_CSETF-SL-TARGET-INSTANCE" );
    $kw333$SLOT_NAME = makeKeyword( "SLOT-NAME" );
    $kw334$DEMON_TYPE = makeKeyword( "DEMON-TYPE" );
    $kw335$VALUE_TRIGGER = makeKeyword( "VALUE-TRIGGER" );
    $kw336$FUNCTIONAL_TYPE = makeKeyword( "FUNCTIONAL-TYPE" );
    $kw337$ISA_METHOD = makeKeyword( "ISA-METHOD" );
    $kw338$TARGET_INSTANCE = makeKeyword( "TARGET-INSTANCE" );
    $sym339$MAKE_SLOT_LISTENER = makeSymbol( "MAKE-SLOT-LISTENER" );
    $sym340$VISIT_DEFSTRUCT_OBJECT_SLOT_LISTENER_METHOD = makeSymbol( "VISIT-DEFSTRUCT-OBJECT-SLOT-LISTENER-METHOD" );
    $str341$__SLOT_LISTENER_for_Slot__S___S__ = makeString( "#<SLOT-LISTENER for Slot ~S; ~S; ~S>" );
    $list342 = ConsesLow.list( makeSymbol( "SLOT-LISTENER" ), makeSymbol( "&BODY" ), makeSymbol( "FORMS" ) );
    $str343$slot_listener = makeString( "slot-listener" );
    $sym344$SL_ = makeSymbol( "SL-" );
    $sym345$SLOT_LISTENER_REGISTRY = makeSymbol( "SLOT-LISTENER-REGISTRY" );
    $sym346$SLOT_LISTENER_REGISTRY_P = makeSymbol( "SLOT-LISTENER-REGISTRY-P" );
    $list347 = ConsesLow.list( makeSymbol( "INSTANCE" ), makeSymbol( "SLOT-COUNT" ), makeSymbol( "LISTENERS-VECTOR" ) );
    $list348 = ConsesLow.list( makeKeyword( "INSTANCE" ), makeKeyword( "SLOT-COUNT" ), makeKeyword( "LISTENERS-VECTOR" ) );
    $list349 = ConsesLow.list( makeSymbol( "SLR-INSTANCE" ), makeSymbol( "SLR-SLOT-COUNT" ), makeSymbol( "SLR-LISTENERS-VECTOR" ) );
    $list350 = ConsesLow.list( makeSymbol( "_CSETF-SLR-INSTANCE" ), makeSymbol( "_CSETF-SLR-SLOT-COUNT" ), makeSymbol( "_CSETF-SLR-LISTENERS-VECTOR" ) );
    $sym351$SLOT_LISTENER_REGISTRY_PRINT_FUNCTION_TRAMPOLINE = makeSymbol( "SLOT-LISTENER-REGISTRY-PRINT-FUNCTION-TRAMPOLINE" );
    $list352 = ConsesLow.list( makeSymbol( "OPTIMIZE-FUNCALL" ), makeSymbol( "SLOT-LISTENER-REGISTRY-P" ) );
    $sym353$SLR_INSTANCE = makeSymbol( "SLR-INSTANCE" );
    $sym354$_CSETF_SLR_INSTANCE = makeSymbol( "_CSETF-SLR-INSTANCE" );
    $sym355$SLR_SLOT_COUNT = makeSymbol( "SLR-SLOT-COUNT" );
    $sym356$_CSETF_SLR_SLOT_COUNT = makeSymbol( "_CSETF-SLR-SLOT-COUNT" );
    $sym357$SLR_LISTENERS_VECTOR = makeSymbol( "SLR-LISTENERS-VECTOR" );
    $sym358$_CSETF_SLR_LISTENERS_VECTOR = makeSymbol( "_CSETF-SLR-LISTENERS-VECTOR" );
    $kw359$INSTANCE = makeKeyword( "INSTANCE" );
    $kw360$SLOT_COUNT = makeKeyword( "SLOT-COUNT" );
    $kw361$LISTENERS_VECTOR = makeKeyword( "LISTENERS-VECTOR" );
    $sym362$MAKE_SLOT_LISTENER_REGISTRY = makeSymbol( "MAKE-SLOT-LISTENER-REGISTRY" );
    $sym363$VISIT_DEFSTRUCT_OBJECT_SLOT_LISTENER_REGISTRY_METHOD = makeSymbol( "VISIT-DEFSTRUCT-OBJECT-SLOT-LISTENER-REGISTRY-METHOD" );
    $str364$__SLOT_LISTENER_REGISTRY___S__SLO = makeString( "#<SLOT-LISTENER-REGISTRY: ~S; SLOT-COUNT ~S>" );
    $list365 = ConsesLow.list( makeSymbol( "SLOT-LISTENER-REGISTRY" ), makeSymbol( "&BODY" ), makeSymbol( "FORMS" ) );
    $str366$slot_listener_registry = makeString( "slot-listener-registry" );
    $sym367$SLR_ = makeSymbol( "SLR-" );
    $sym368$METHOD_LISTENER = makeSymbol( "METHOD-LISTENER" );
    $sym369$METHOD_LISTENER_P = makeSymbol( "METHOD-LISTENER-P" );
    $list370 = ConsesLow.list( makeSymbol( "OWNING-METHOD-NAME" ), makeSymbol( "OWNING-CLASS-NAME" ), makeSymbol( "DEMON-TYPE" ), makeSymbol( "DETAIL" ) );
    $list371 = ConsesLow.list( makeKeyword( "OWNING-METHOD-NAME" ), makeKeyword( "OWNING-CLASS-NAME" ), makeKeyword( "DEMON-TYPE" ), makeKeyword( "DETAIL" ) );
    $list372 = ConsesLow.list( makeSymbol( "ML-OWNING-METHOD-NAME" ), makeSymbol( "ML-OWNING-CLASS-NAME" ), makeSymbol( "ML-DEMON-TYPE" ), makeSymbol( "ML-DETAIL" ) );
    $list373 = ConsesLow.list( makeSymbol( "_CSETF-ML-OWNING-METHOD-NAME" ), makeSymbol( "_CSETF-ML-OWNING-CLASS-NAME" ), makeSymbol( "_CSETF-ML-DEMON-TYPE" ), makeSymbol( "_CSETF-ML-DETAIL" ) );
    $sym374$PRINT_METHOD_LISTENER = makeSymbol( "PRINT-METHOD-LISTENER" );
    $sym375$METHOD_LISTENER_PRINT_FUNCTION_TRAMPOLINE = makeSymbol( "METHOD-LISTENER-PRINT-FUNCTION-TRAMPOLINE" );
    $list376 = ConsesLow.list( makeSymbol( "OPTIMIZE-FUNCALL" ), makeSymbol( "METHOD-LISTENER-P" ) );
    $sym377$ML_OWNING_METHOD_NAME = makeSymbol( "ML-OWNING-METHOD-NAME" );
    $sym378$_CSETF_ML_OWNING_METHOD_NAME = makeSymbol( "_CSETF-ML-OWNING-METHOD-NAME" );
    $sym379$ML_OWNING_CLASS_NAME = makeSymbol( "ML-OWNING-CLASS-NAME" );
    $sym380$_CSETF_ML_OWNING_CLASS_NAME = makeSymbol( "_CSETF-ML-OWNING-CLASS-NAME" );
    $sym381$ML_DEMON_TYPE = makeSymbol( "ML-DEMON-TYPE" );
    $sym382$_CSETF_ML_DEMON_TYPE = makeSymbol( "_CSETF-ML-DEMON-TYPE" );
    $sym383$ML_DETAIL = makeSymbol( "ML-DETAIL" );
    $sym384$_CSETF_ML_DETAIL = makeSymbol( "_CSETF-ML-DETAIL" );
    $kw385$OWNING_METHOD_NAME = makeKeyword( "OWNING-METHOD-NAME" );
    $kw386$OWNING_CLASS_NAME = makeKeyword( "OWNING-CLASS-NAME" );
    $kw387$DETAIL = makeKeyword( "DETAIL" );
    $sym388$MAKE_METHOD_LISTENER = makeSymbol( "MAKE-METHOD-LISTENER" );
    $sym389$VISIT_DEFSTRUCT_OBJECT_METHOD_LISTENER_METHOD = makeSymbol( "VISIT-DEFSTRUCT-OBJECT-METHOD-LISTENER-METHOD" );
    $list390 = ConsesLow.list( makeSymbol( "METHOD-LISTENER" ), makeSymbol( "&BODY" ), makeSymbol( "FORMS" ) );
    $str391$method_listener = makeString( "method-listener" );
    $sym392$ML_ = makeSymbol( "ML-" );
    $sym393$FUNCTION_DETAIL = makeSymbol( "FUNCTION-DETAIL" );
    $sym394$FUNCTION_DETAIL_P = makeSymbol( "FUNCTION-DETAIL-P" );
    $list395 = ConsesLow.list( makeSymbol( "FUNCTION-NAME" ), makeSymbol( "ARGLIST" ) );
    $list396 = ConsesLow.list( makeKeyword( "FUNCTION-NAME" ), makeKeyword( "ARGLIST" ) );
    $list397 = ConsesLow.list( makeSymbol( "FD-FUNCTION-NAME" ), makeSymbol( "FD-ARGLIST" ) );
    $list398 = ConsesLow.list( makeSymbol( "_CSETF-FD-FUNCTION-NAME" ), makeSymbol( "_CSETF-FD-ARGLIST" ) );
    $sym399$FUNCTION_DETAIL_PRINT_FUNCTION_TRAMPOLINE = makeSymbol( "FUNCTION-DETAIL-PRINT-FUNCTION-TRAMPOLINE" );
    $list400 = ConsesLow.list( makeSymbol( "OPTIMIZE-FUNCALL" ), makeSymbol( "FUNCTION-DETAIL-P" ) );
    $sym401$FD_FUNCTION_NAME = makeSymbol( "FD-FUNCTION-NAME" );
    $sym402$_CSETF_FD_FUNCTION_NAME = makeSymbol( "_CSETF-FD-FUNCTION-NAME" );
    $sym403$FD_ARGLIST = makeSymbol( "FD-ARGLIST" );
    $sym404$_CSETF_FD_ARGLIST = makeSymbol( "_CSETF-FD-ARGLIST" );
    $kw405$ARGLIST = makeKeyword( "ARGLIST" );
    $sym406$MAKE_FUNCTION_DETAIL = makeSymbol( "MAKE-FUNCTION-DETAIL" );
    $sym407$VISIT_DEFSTRUCT_OBJECT_FUNCTION_DETAIL_METHOD = makeSymbol( "VISIT-DEFSTRUCT-OBJECT-FUNCTION-DETAIL-METHOD" );
    $list408 = ConsesLow.list( makeSymbol( "FUNCTION-DETAIL" ), makeSymbol( "&BODY" ), makeSymbol( "FORMS" ) );
    $str409$function_detail = makeString( "function-detail" );
    $sym410$FD_ = makeSymbol( "FD-" );
    $sym411$METHOD_DETAIL = makeSymbol( "METHOD-DETAIL" );
    $sym412$METHOD_DETAIL_P = makeSymbol( "METHOD-DETAIL-P" );
    $list413 = ConsesLow.list( makeSymbol( "METHOD-NAME" ), makeSymbol( "FUNCTION-NAME" ), makeSymbol( "ARGLIST" ), makeSymbol( "INSTANCE" ) );
    $list414 = ConsesLow.list( makeKeyword( "METHOD-NAME" ), makeKeyword( "FUNCTION-NAME" ), makeKeyword( "ARGLIST" ), makeKeyword( "INSTANCE" ) );
    $list415 = ConsesLow.list( makeSymbol( "MD-METHOD-NAME" ), makeSymbol( "MD-FUNCTION-NAME" ), makeSymbol( "MD-ARGLIST" ), makeSymbol( "MD-INSTANCE" ) );
    $list416 = ConsesLow.list( makeSymbol( "_CSETF-MD-METHOD-NAME" ), makeSymbol( "_CSETF-MD-FUNCTION-NAME" ), makeSymbol( "_CSETF-MD-ARGLIST" ), makeSymbol( "_CSETF-MD-INSTANCE" ) );
    $sym417$METHOD_DETAIL_PRINT_FUNCTION_TRAMPOLINE = makeSymbol( "METHOD-DETAIL-PRINT-FUNCTION-TRAMPOLINE" );
    $list418 = ConsesLow.list( makeSymbol( "OPTIMIZE-FUNCALL" ), makeSymbol( "METHOD-DETAIL-P" ) );
    $sym419$MD_METHOD_NAME = makeSymbol( "MD-METHOD-NAME" );
    $sym420$_CSETF_MD_METHOD_NAME = makeSymbol( "_CSETF-MD-METHOD-NAME" );
    $sym421$MD_FUNCTION_NAME = makeSymbol( "MD-FUNCTION-NAME" );
    $sym422$_CSETF_MD_FUNCTION_NAME = makeSymbol( "_CSETF-MD-FUNCTION-NAME" );
    $sym423$MD_ARGLIST = makeSymbol( "MD-ARGLIST" );
    $sym424$_CSETF_MD_ARGLIST = makeSymbol( "_CSETF-MD-ARGLIST" );
    $sym425$MD_INSTANCE = makeSymbol( "MD-INSTANCE" );
    $sym426$_CSETF_MD_INSTANCE = makeSymbol( "_CSETF-MD-INSTANCE" );
    $sym427$MAKE_METHOD_DETAIL = makeSymbol( "MAKE-METHOD-DETAIL" );
    $sym428$VISIT_DEFSTRUCT_OBJECT_METHOD_DETAIL_METHOD = makeSymbol( "VISIT-DEFSTRUCT-OBJECT-METHOD-DETAIL-METHOD" );
    $list429 = ConsesLow.list( makeSymbol( "METHOD-DETAIL" ), makeSymbol( "&BODY" ), makeSymbol( "FORMS" ) );
    $str430$method_detail = makeString( "method-detail" );
    $sym431$MD_ = makeSymbol( "MD-" );
    $sym432$METHOD_LISTENER_REGISTRY = makeSymbol( "METHOD-LISTENER-REGISTRY" );
    $sym433$METHOD_LISTENER_REGISTRY_P = makeSymbol( "METHOD-LISTENER-REGISTRY-P" );
    $list434 = ConsesLow.list( makeSymbol( "INSTANCE" ), makeSymbol( "LISTENER-ALIST" ) );
    $list435 = ConsesLow.list( makeKeyword( "INSTANCE" ), makeKeyword( "LISTENER-ALIST" ) );
    $list436 = ConsesLow.list( makeSymbol( "MLR-INSTANCE" ), makeSymbol( "MLR-LISTENER-ALIST" ) );
    $list437 = ConsesLow.list( makeSymbol( "_CSETF-MLR-INSTANCE" ), makeSymbol( "_CSETF-MLR-LISTENER-ALIST" ) );
    $sym438$METHOD_LISTENER_REGISTRY_PRINT_FUNCTION_TRAMPOLINE = makeSymbol( "METHOD-LISTENER-REGISTRY-PRINT-FUNCTION-TRAMPOLINE" );
    $list439 = ConsesLow.list( makeSymbol( "OPTIMIZE-FUNCALL" ), makeSymbol( "METHOD-LISTENER-REGISTRY-P" ) );
    $sym440$MLR_INSTANCE = makeSymbol( "MLR-INSTANCE" );
    $sym441$_CSETF_MLR_INSTANCE = makeSymbol( "_CSETF-MLR-INSTANCE" );
    $sym442$MLR_LISTENER_ALIST = makeSymbol( "MLR-LISTENER-ALIST" );
    $sym443$_CSETF_MLR_LISTENER_ALIST = makeSymbol( "_CSETF-MLR-LISTENER-ALIST" );
    $kw444$LISTENER_ALIST = makeKeyword( "LISTENER-ALIST" );
    $sym445$MAKE_METHOD_LISTENER_REGISTRY = makeSymbol( "MAKE-METHOD-LISTENER-REGISTRY" );
    $sym446$VISIT_DEFSTRUCT_OBJECT_METHOD_LISTENER_REGISTRY_METHOD = makeSymbol( "VISIT-DEFSTRUCT-OBJECT-METHOD-LISTENER-REGISTRY-METHOD" );
    $list447 = ConsesLow.list( makeSymbol( "METHOD-LISTENER-REGISTRY" ), makeSymbol( "&BODY" ), makeSymbol( "FORMS" ) );
    $str448$method_listener_registry = makeString( "method-listener-registry" );
    $sym449$MLR_ = makeSymbol( "MLR-" );
    $str450$__METHOD_LISTENER____S__S_ = makeString( "#<METHOD-LISTENER: (~S ~S)" );
    $str451$_monitored_by_function__S_ = makeString( " monitored by function ~S>" );
    $str452$_monitored_by_method___S__S__ = makeString( " monitored by method (~S ~S)>" );
    $str453$_ = makeString( ">" );
  }

  public static final class $class_native
      extends
        SubLStructNative
  {
    public SubLObject $name;
    public SubLObject $parent;
    public SubLObject $subclasses;
    public SubLObject $interface_names;
    public SubLObject $interfaces;
    public SubLObject $compiled_inheritance_path;
    public SubLObject $instance_var_decls;
    public SubLObject $class_var_decls;
    public SubLObject $compiled_instance_slot_access_alist;
    public SubLObject $compiled_instance_boolean_slot_access_alist;
    public SubLObject $compiled_class_slot_access_alist;
    public SubLObject $compiled_class_boolean_slot_access_alist;
    public SubLObject $slot_accessor_alist;
    public SubLObject $instance_method_decls;
    public SubLObject $class_method_decls;
    public SubLObject $boolean_slots;
    public SubLObject $any_slots;
    public SubLObject $compiled_instance_method_access_alist;
    public SubLObject $compiled_class_method_access_alist;
    public SubLObject $tablified_instance_methods;
    public SubLObject $definition_lock;
    public SubLObject $access_lock;
    public SubLObject $synchronized_slots_p;
    public SubLObject $plist;
    public SubLObject $class_initialization_function;
    public SubLObject $class_initialized_p;
    public SubLObject $instance_initialization_function;
    public SubLObject $class_properties;
    private static final SubLStructDeclNative structDecl;

    public $class_native()
    {
      this.$name = CommonSymbols.NIL;
      this.$parent = CommonSymbols.NIL;
      this.$subclasses = CommonSymbols.NIL;
      this.$interface_names = CommonSymbols.NIL;
      this.$interfaces = CommonSymbols.NIL;
      this.$compiled_inheritance_path = CommonSymbols.NIL;
      this.$instance_var_decls = CommonSymbols.NIL;
      this.$class_var_decls = CommonSymbols.NIL;
      this.$compiled_instance_slot_access_alist = CommonSymbols.NIL;
      this.$compiled_instance_boolean_slot_access_alist = CommonSymbols.NIL;
      this.$compiled_class_slot_access_alist = CommonSymbols.NIL;
      this.$compiled_class_boolean_slot_access_alist = CommonSymbols.NIL;
      this.$slot_accessor_alist = CommonSymbols.NIL;
      this.$instance_method_decls = CommonSymbols.NIL;
      this.$class_method_decls = CommonSymbols.NIL;
      this.$boolean_slots = CommonSymbols.NIL;
      this.$any_slots = CommonSymbols.NIL;
      this.$compiled_instance_method_access_alist = CommonSymbols.NIL;
      this.$compiled_class_method_access_alist = CommonSymbols.NIL;
      this.$tablified_instance_methods = CommonSymbols.NIL;
      this.$definition_lock = CommonSymbols.NIL;
      this.$access_lock = CommonSymbols.NIL;
      this.$synchronized_slots_p = CommonSymbols.NIL;
      this.$plist = CommonSymbols.NIL;
      this.$class_initialization_function = CommonSymbols.NIL;
      this.$class_initialized_p = CommonSymbols.NIL;
      this.$instance_initialization_function = CommonSymbols.NIL;
      this.$class_properties = CommonSymbols.NIL;
    }

    @Override
    public SubLStructDecl getStructDecl()
    {
      return $class_native.structDecl;
    }

    @Override
    public SubLObject getField2()
    {
      return this.$name;
    }

    @Override
    public SubLObject getField3()
    {
      return this.$parent;
    }

    @Override
    public SubLObject getField4()
    {
      return this.$subclasses;
    }

    @Override
    public SubLObject getField5()
    {
      return this.$interface_names;
    }

    @Override
    public SubLObject getField6()
    {
      return this.$interfaces;
    }

    @Override
    public SubLObject getField7()
    {
      return this.$compiled_inheritance_path;
    }

    @Override
    public SubLObject getField8()
    {
      return this.$instance_var_decls;
    }

    @Override
    public SubLObject getField9()
    {
      return this.$class_var_decls;
    }

    @Override
    public SubLObject getField10()
    {
      return this.$compiled_instance_slot_access_alist;
    }

    @Override
    public SubLObject getField11()
    {
      return this.$compiled_instance_boolean_slot_access_alist;
    }

    @Override
    public SubLObject getField12()
    {
      return this.$compiled_class_slot_access_alist;
    }

    @Override
    public SubLObject getField13()
    {
      return this.$compiled_class_boolean_slot_access_alist;
    }

    @Override
    public SubLObject getField14()
    {
      return this.$slot_accessor_alist;
    }

    @Override
    public SubLObject getField15()
    {
      return this.$instance_method_decls;
    }

    @Override
    public SubLObject getField16()
    {
      return this.$class_method_decls;
    }

    @Override
    public SubLObject getField17()
    {
      return this.$boolean_slots;
    }

    @Override
    public SubLObject getField18()
    {
      return this.$any_slots;
    }

    @Override
    public SubLObject getField19()
    {
      return this.$compiled_instance_method_access_alist;
    }

    @Override
    public SubLObject getField20()
    {
      return this.$compiled_class_method_access_alist;
    }

    public SubLObject getField21()
    {
      return this.$tablified_instance_methods;
    }

    public SubLObject getField22()
    {
      return this.$definition_lock;
    }

    public SubLObject getField23()
    {
      return this.$access_lock;
    }

    public SubLObject getField24()
    {
      return this.$synchronized_slots_p;
    }

    public SubLObject getField25()
    {
      return this.$plist;
    }

    public SubLObject getField26()
    {
      return this.$class_initialization_function;
    }

    public SubLObject getField27()
    {
      return this.$class_initialized_p;
    }

    public SubLObject getField28()
    {
      return this.$instance_initialization_function;
    }

    public SubLObject getField29()
    {
      return this.$class_properties;
    }

    @Override
    public SubLObject setField2(final SubLObject value)
    {
      return this.$name = value;
    }

    @Override
    public SubLObject setField3(final SubLObject value)
    {
      return this.$parent = value;
    }

    @Override
    public SubLObject setField4(final SubLObject value)
    {
      return this.$subclasses = value;
    }

    @Override
    public SubLObject setField5(final SubLObject value)
    {
      return this.$interface_names = value;
    }

    @Override
    public SubLObject setField6(final SubLObject value)
    {
      return this.$interfaces = value;
    }

    @Override
    public SubLObject setField7(final SubLObject value)
    {
      return this.$compiled_inheritance_path = value;
    }

    @Override
    public SubLObject setField8(final SubLObject value)
    {
      return this.$instance_var_decls = value;
    }

    @Override
    public SubLObject setField9(final SubLObject value)
    {
      return this.$class_var_decls = value;
    }

    @Override
    public SubLObject setField10(final SubLObject value)
    {
      return this.$compiled_instance_slot_access_alist = value;
    }

    @Override
    public SubLObject setField11(final SubLObject value)
    {
      return this.$compiled_instance_boolean_slot_access_alist = value;
    }

    @Override
    public SubLObject setField12(final SubLObject value)
    {
      return this.$compiled_class_slot_access_alist = value;
    }

    @Override
    public SubLObject setField13(final SubLObject value)
    {
      return this.$compiled_class_boolean_slot_access_alist = value;
    }

    @Override
    public SubLObject setField14(final SubLObject value)
    {
      return this.$slot_accessor_alist = value;
    }

    @Override
    public SubLObject setField15(final SubLObject value)
    {
      return this.$instance_method_decls = value;
    }

    @Override
    public SubLObject setField16(final SubLObject value)
    {
      return this.$class_method_decls = value;
    }

    @Override
    public SubLObject setField17(final SubLObject value)
    {
      return this.$boolean_slots = value;
    }

    @Override
    public SubLObject setField18(final SubLObject value)
    {
      return this.$any_slots = value;
    }

    @Override
    public SubLObject setField19(final SubLObject value)
    {
      return this.$compiled_instance_method_access_alist = value;
    }

    @Override
    public SubLObject setField20(final SubLObject value)
    {
      return this.$compiled_class_method_access_alist = value;
    }

    public SubLObject setField21(final SubLObject value)
    {
      return this.$tablified_instance_methods = value;
    }

    public SubLObject setField22(final SubLObject value)
    {
      return this.$definition_lock = value;
    }

    public SubLObject setField23(final SubLObject value)
    {
      return this.$access_lock = value;
    }

    public SubLObject setField24(final SubLObject value)
    {
      return this.$synchronized_slots_p = value;
    }

    public SubLObject setField25(final SubLObject value)
    {
      return this.$plist = value;
    }

    public SubLObject setField26(final SubLObject value)
    {
      return this.$class_initialization_function = value;
    }

    public SubLObject setField27(final SubLObject value)
    {
      return this.$class_initialized_p = value;
    }

    public SubLObject setField28(final SubLObject value)
    {
      return this.$instance_initialization_function = value;
    }

    public SubLObject setField29(final SubLObject value)
    {
      return this.$class_properties = value;
    }
    static
    {
      structDecl = Structures.makeStructDeclNative( $class_native.class, $sym0$CLASS, $sym1$CLASS_P, $list2, $list3, new String[] { "$name", "$parent", "$subclasses", "$interface_names", "$interfaces",
        "$compiled_inheritance_path", "$instance_var_decls", "$class_var_decls", "$compiled_instance_slot_access_alist", "$compiled_instance_boolean_slot_access_alist", "$compiled_class_slot_access_alist",
        "$compiled_class_boolean_slot_access_alist", "$slot_accessor_alist", "$instance_method_decls", "$class_method_decls", "$boolean_slots", "$any_slots", "$compiled_instance_method_access_alist",
        "$compiled_class_method_access_alist", "$tablified_instance_methods", "$definition_lock", "$access_lock", "$synchronized_slots_p", "$plist", "$class_initialization_function", "$class_initialized_p",
        "$instance_initialization_function", "$class_properties"
      }, $list4, $list5, $sym6$PRINT_CLASS );
    }
  }

  public static final class $class_p$UnaryFunction
      extends
        UnaryFunction
  {
    public $class_p$UnaryFunction()
    {
      super( SubLTranslatedFile.extractFunctionNamed( "CLASS-P" ) );
    }

    @Override
    public SubLObject processItem(final SubLObject arg1)
    {
      return class_p( arg1 );
    }
  }

  public static final class $class_name$UnaryFunction
      extends
        UnaryFunction
  {
    public $class_name$UnaryFunction()
    {
      super( SubLTranslatedFile.extractFunctionNamed( "CLASS-NAME" ) );
    }

    @Override
    public SubLObject processItem(final SubLObject arg1)
    {
      return class_name( arg1 );
    }
  }

  public static final class $instance_native
      extends
        SubLStructNative
  {
    public SubLObject $class;
    public SubLObject $boolean_slots;
    public SubLObject $any_slots;
    public SubLObject $plist;
    private static final SubLStructDeclNative structDecl;

    public $instance_native()
    {
      this.$class = CommonSymbols.NIL;
      this.$boolean_slots = CommonSymbols.NIL;
      this.$any_slots = CommonSymbols.NIL;
      this.$plist = CommonSymbols.NIL;
    }

    @Override
    public SubLStructDecl getStructDecl()
    {
      return $instance_native.structDecl;
    }

    @Override
    public SubLObject getField2()
    {
      return this.$class;
    }

    @Override
    public SubLObject getField3()
    {
      return this.$boolean_slots;
    }

    @Override
    public SubLObject getField4()
    {
      return this.$any_slots;
    }

    @Override
    public SubLObject getField5()
    {
      return this.$plist;
    }

    @Override
    public SubLObject setField2(final SubLObject value)
    {
      return this.$class = value;
    }

    @Override
    public SubLObject setField3(final SubLObject value)
    {
      return this.$boolean_slots = value;
    }

    @Override
    public SubLObject setField4(final SubLObject value)
    {
      return this.$any_slots = value;
    }

    @Override
    public SubLObject setField5(final SubLObject value)
    {
      return this.$plist = value;
    }
    static
    {
      structDecl = Structures.makeStructDeclNative( $instance_native.class, $sym130$INSTANCE, $sym131$INSTANCE_P, $list132, $list133, new String[] { "$class", "$boolean_slots", "$any_slots", "$plist"
      }, $list134, $list135, $sym136$PRINT_INSTANCE );
    }
  }

  public static final class $instance_p$UnaryFunction
      extends
        UnaryFunction
  {
    public $instance_p$UnaryFunction()
    {
      super( SubLTranslatedFile.extractFunctionNamed( "INSTANCE-P" ) );
    }

    @Override
    public SubLObject processItem(final SubLObject arg1)
    {
      return instance_p( arg1 );
    }
  }

  public static final class $interface_native
      extends
        SubLStructNative
  {
    public SubLObject $name;
    public SubLObject $parents;
    public SubLObject $compiled_inheritance_path;
    public SubLObject $subinterfaces;
    public SubLObject $implementers;
    public SubLObject $instance_method_decls;
    public SubLObject $class_method_decls;
    public SubLObject $compiled_instance_method_decls;
    public SubLObject $compiled_class_method_decls;
    public SubLObject $local_class_methods;
    public SubLObject $local_instance_methods;
    public SubLObject $mark_list;
    public SubLObject $plist;
    public SubLObject $definition_lock;
    private static final SubLStructDeclNative structDecl;

    public $interface_native()
    {
      this.$name = CommonSymbols.NIL;
      this.$parents = CommonSymbols.NIL;
      this.$compiled_inheritance_path = CommonSymbols.NIL;
      this.$subinterfaces = CommonSymbols.NIL;
      this.$implementers = CommonSymbols.NIL;
      this.$instance_method_decls = CommonSymbols.NIL;
      this.$class_method_decls = CommonSymbols.NIL;
      this.$compiled_instance_method_decls = CommonSymbols.NIL;
      this.$compiled_class_method_decls = CommonSymbols.NIL;
      this.$local_class_methods = CommonSymbols.NIL;
      this.$local_instance_methods = CommonSymbols.NIL;
      this.$mark_list = CommonSymbols.NIL;
      this.$plist = CommonSymbols.NIL;
      this.$definition_lock = CommonSymbols.NIL;
    }

    @Override
    public SubLStructDecl getStructDecl()
    {
      return $interface_native.structDecl;
    }

    @Override
    public SubLObject getField2()
    {
      return this.$name;
    }

    @Override
    public SubLObject getField3()
    {
      return this.$parents;
    }

    @Override
    public SubLObject getField4()
    {
      return this.$compiled_inheritance_path;
    }

    @Override
    public SubLObject getField5()
    {
      return this.$subinterfaces;
    }

    @Override
    public SubLObject getField6()
    {
      return this.$implementers;
    }

    @Override
    public SubLObject getField7()
    {
      return this.$instance_method_decls;
    }

    @Override
    public SubLObject getField8()
    {
      return this.$class_method_decls;
    }

    @Override
    public SubLObject getField9()
    {
      return this.$compiled_instance_method_decls;
    }

    @Override
    public SubLObject getField10()
    {
      return this.$compiled_class_method_decls;
    }

    @Override
    public SubLObject getField11()
    {
      return this.$local_class_methods;
    }

    @Override
    public SubLObject getField12()
    {
      return this.$local_instance_methods;
    }

    @Override
    public SubLObject getField13()
    {
      return this.$mark_list;
    }

    @Override
    public SubLObject getField14()
    {
      return this.$plist;
    }

    @Override
    public SubLObject getField15()
    {
      return this.$definition_lock;
    }

    @Override
    public SubLObject setField2(final SubLObject value)
    {
      return this.$name = value;
    }

    @Override
    public SubLObject setField3(final SubLObject value)
    {
      return this.$parents = value;
    }

    @Override
    public SubLObject setField4(final SubLObject value)
    {
      return this.$compiled_inheritance_path = value;
    }

    @Override
    public SubLObject setField5(final SubLObject value)
    {
      return this.$subinterfaces = value;
    }

    @Override
    public SubLObject setField6(final SubLObject value)
    {
      return this.$implementers = value;
    }

    @Override
    public SubLObject setField7(final SubLObject value)
    {
      return this.$instance_method_decls = value;
    }

    @Override
    public SubLObject setField8(final SubLObject value)
    {
      return this.$class_method_decls = value;
    }

    @Override
    public SubLObject setField9(final SubLObject value)
    {
      return this.$compiled_instance_method_decls = value;
    }

    @Override
    public SubLObject setField10(final SubLObject value)
    {
      return this.$compiled_class_method_decls = value;
    }

    @Override
    public SubLObject setField11(final SubLObject value)
    {
      return this.$local_class_methods = value;
    }

    @Override
    public SubLObject setField12(final SubLObject value)
    {
      return this.$local_instance_methods = value;
    }

    @Override
    public SubLObject setField13(final SubLObject value)
    {
      return this.$mark_list = value;
    }

    @Override
    public SubLObject setField14(final SubLObject value)
    {
      return this.$plist = value;
    }

    @Override
    public SubLObject setField15(final SubLObject value)
    {
      return this.$definition_lock = value;
    }
    static
    {
      structDecl = Structures.makeStructDeclNative( $interface_native.class, $sym156$INTERFACE, $sym157$INTERFACE_P, $list158, $list159, new String[] { "$name", "$parents", "$compiled_inheritance_path", "$subinterfaces",
        "$implementers", "$instance_method_decls", "$class_method_decls", "$compiled_instance_method_decls", "$compiled_class_method_decls", "$local_class_methods", "$local_instance_methods", "$mark_list", "$plist",
        "$definition_lock"
      }, $list160, $list161, $sym162$PRINT_INTERFACE );
    }
  }

  public static final class $interface_p$UnaryFunction
      extends
        UnaryFunction
  {
    public $interface_p$UnaryFunction()
    {
      super( SubLTranslatedFile.extractFunctionNamed( "INTERFACE-P" ) );
    }

    @Override
    public SubLObject processItem(final SubLObject arg1)
    {
      return interface_p( arg1 );
    }
  }

  public static final class $method_native
      extends
        SubLStructNative
  {
    public SubLObject $name;
    public SubLObject $class_name;
    public SubLObject $lambda_list;
    public SubLObject $body;
    public SubLObject $protection;
    public SubLObject $scope;
    public SubLObject $update_type;
    public SubLObject $function_name;
    public SubLObject $function_def;
    public SubLObject $before_listeners;
    public SubLObject $after_listeners;
    public SubLObject $instantiate_template;
    private static final SubLStructDeclNative structDecl;

    public $method_native()
    {
      this.$name = CommonSymbols.NIL;
      this.$class_name = CommonSymbols.NIL;
      this.$lambda_list = CommonSymbols.NIL;
      this.$body = CommonSymbols.NIL;
      this.$protection = CommonSymbols.NIL;
      this.$scope = CommonSymbols.NIL;
      this.$update_type = CommonSymbols.NIL;
      this.$function_name = CommonSymbols.NIL;
      this.$function_def = CommonSymbols.NIL;
      this.$before_listeners = CommonSymbols.NIL;
      this.$after_listeners = CommonSymbols.NIL;
      this.$instantiate_template = CommonSymbols.NIL;
    }

    @Override
    public SubLStructDecl getStructDecl()
    {
      return $method_native.structDecl;
    }

    @Override
    public SubLObject getField2()
    {
      return this.$name;
    }

    @Override
    public SubLObject getField3()
    {
      return this.$class_name;
    }

    @Override
    public SubLObject getField4()
    {
      return this.$lambda_list;
    }

    @Override
    public SubLObject getField5()
    {
      return this.$body;
    }

    @Override
    public SubLObject getField6()
    {
      return this.$protection;
    }

    @Override
    public SubLObject getField7()
    {
      return this.$scope;
    }

    @Override
    public SubLObject getField8()
    {
      return this.$update_type;
    }

    @Override
    public SubLObject getField9()
    {
      return this.$function_name;
    }

    @Override
    public SubLObject getField10()
    {
      return this.$function_def;
    }

    @Override
    public SubLObject getField11()
    {
      return this.$before_listeners;
    }

    @Override
    public SubLObject getField12()
    {
      return this.$after_listeners;
    }

    @Override
    public SubLObject getField13()
    {
      return this.$instantiate_template;
    }

    @Override
    public SubLObject setField2(final SubLObject value)
    {
      return this.$name = value;
    }

    @Override
    public SubLObject setField3(final SubLObject value)
    {
      return this.$class_name = value;
    }

    @Override
    public SubLObject setField4(final SubLObject value)
    {
      return this.$lambda_list = value;
    }

    @Override
    public SubLObject setField5(final SubLObject value)
    {
      return this.$body = value;
    }

    @Override
    public SubLObject setField6(final SubLObject value)
    {
      return this.$protection = value;
    }

    @Override
    public SubLObject setField7(final SubLObject value)
    {
      return this.$scope = value;
    }

    @Override
    public SubLObject setField8(final SubLObject value)
    {
      return this.$update_type = value;
    }

    @Override
    public SubLObject setField9(final SubLObject value)
    {
      return this.$function_name = value;
    }

    @Override
    public SubLObject setField10(final SubLObject value)
    {
      return this.$function_def = value;
    }

    @Override
    public SubLObject setField11(final SubLObject value)
    {
      return this.$before_listeners = value;
    }

    @Override
    public SubLObject setField12(final SubLObject value)
    {
      return this.$after_listeners = value;
    }

    @Override
    public SubLObject setField13(final SubLObject value)
    {
      return this.$instantiate_template = value;
    }
    static
    {
      structDecl = Structures.makeStructDeclNative( $method_native.class, $sym208$METHOD, $sym209$METHOD_P, $list210, $list211, new String[] { "$name", "$class_name", "$lambda_list", "$body", "$protection", "$scope",
        "$update_type", "$function_name", "$function_def", "$before_listeners", "$after_listeners", "$instantiate_template"
      }, $list212, $list213, $sym214$PRINT_METHOD );
    }
  }

  public static final class $method_p$UnaryFunction
      extends
        UnaryFunction
  {
    public $method_p$UnaryFunction()
    {
      super( SubLTranslatedFile.extractFunctionNamed( "METHOD-P" ) );
    }

    @Override
    public SubLObject processItem(final SubLObject arg1)
    {
      return method_p( arg1 );
    }
  }

  public static final class $method_trace_native
      extends
        SubLStructNative
  {
    public SubLObject $name;
    public SubLObject $class_name;
    public SubLObject $function;
    public SubLObject $outer;
    private static final SubLStructDeclNative structDecl;

    public $method_trace_native()
    {
      this.$name = CommonSymbols.NIL;
      this.$class_name = CommonSymbols.NIL;
      this.$function = CommonSymbols.NIL;
      this.$outer = CommonSymbols.NIL;
    }

    @Override
    public SubLStructDecl getStructDecl()
    {
      return $method_trace_native.structDecl;
    }

    @Override
    public SubLObject getField2()
    {
      return this.$name;
    }

    @Override
    public SubLObject getField3()
    {
      return this.$class_name;
    }

    @Override
    public SubLObject getField4()
    {
      return this.$function;
    }

    @Override
    public SubLObject getField5()
    {
      return this.$outer;
    }

    @Override
    public SubLObject setField2(final SubLObject value)
    {
      return this.$name = value;
    }

    @Override
    public SubLObject setField3(final SubLObject value)
    {
      return this.$class_name = value;
    }

    @Override
    public SubLObject setField4(final SubLObject value)
    {
      return this.$function = value;
    }

    @Override
    public SubLObject setField5(final SubLObject value)
    {
      return this.$outer = value;
    }
    static
    {
      structDecl = Structures.makeStructDeclNative( $method_trace_native.class, $sym259$METHOD_TRACE, $sym260$METHOD_TRACE_P, $list261, $list262, new String[] { "$name", "$class_name", "$function", "$outer"
      }, $list263, $list264, $sym265$PRINT_METHOD_TRACE );
    }
  }

  public static final class $method_trace_p$UnaryFunction
      extends
        UnaryFunction
  {
    public $method_trace_p$UnaryFunction()
    {
      super( SubLTranslatedFile.extractFunctionNamed( "METHOD-TRACE-P" ) );
    }

    @Override
    public SubLObject processItem(final SubLObject arg1)
    {
      return method_trace_p( arg1 );
    }
  }

  public static final class $method_info_native
      extends
        SubLStructNative
  {
    public SubLObject $method_name;
    public SubLObject $class_name;
    public SubLObject $mv_used_in_body;
    public SubLObject $mv_modified_in_body;
    public SubLObject $methods_used_in_body;
    private static final SubLStructDeclNative structDecl;

    public $method_info_native()
    {
      this.$method_name = CommonSymbols.NIL;
      this.$class_name = CommonSymbols.NIL;
      this.$mv_used_in_body = CommonSymbols.NIL;
      this.$mv_modified_in_body = CommonSymbols.NIL;
      this.$methods_used_in_body = CommonSymbols.NIL;
    }

    @Override
    public SubLStructDecl getStructDecl()
    {
      return $method_info_native.structDecl;
    }

    @Override
    public SubLObject getField2()
    {
      return this.$method_name;
    }

    @Override
    public SubLObject getField3()
    {
      return this.$class_name;
    }

    @Override
    public SubLObject getField4()
    {
      return this.$mv_used_in_body;
    }

    @Override
    public SubLObject getField5()
    {
      return this.$mv_modified_in_body;
    }

    @Override
    public SubLObject getField6()
    {
      return this.$methods_used_in_body;
    }

    @Override
    public SubLObject setField2(final SubLObject value)
    {
      return this.$method_name = value;
    }

    @Override
    public SubLObject setField3(final SubLObject value)
    {
      return this.$class_name = value;
    }

    @Override
    public SubLObject setField4(final SubLObject value)
    {
      return this.$mv_used_in_body = value;
    }

    @Override
    public SubLObject setField5(final SubLObject value)
    {
      return this.$mv_modified_in_body = value;
    }

    @Override
    public SubLObject setField6(final SubLObject value)
    {
      return this.$methods_used_in_body = value;
    }
    static
    {
      structDecl = Structures.makeStructDeclNative( $method_info_native.class, $sym284$METHOD_INFO, $sym285$METHOD_INFO_P, $list286, $list287, new String[] { "$method_name", "$class_name", "$mv_used_in_body",
        "$mv_modified_in_body", "$methods_used_in_body"
      }, $list288, $list289, $sym290$DEFAULT_STRUCT_PRINT_FUNCTION );
    }
  }

  public static final class $method_info_p$UnaryFunction
      extends
        UnaryFunction
  {
    public $method_info_p$UnaryFunction()
    {
      super( SubLTranslatedFile.extractFunctionNamed( "METHOD-INFO-P" ) );
    }

    @Override
    public SubLObject processItem(final SubLObject arg1)
    {
      return method_info_p( arg1 );
    }
  }

  public static final class $slot_listener_native
      extends
        SubLStructNative
  {
    public SubLObject $slot_name;
    public SubLObject $demon_type;
    public SubLObject $value_trigger;
    public SubLObject $functional_type;
    public SubLObject $isa_method;
    public SubLObject $target_instance;
    private static final SubLStructDeclNative structDecl;

    public $slot_listener_native()
    {
      this.$slot_name = CommonSymbols.NIL;
      this.$demon_type = CommonSymbols.NIL;
      this.$value_trigger = CommonSymbols.NIL;
      this.$functional_type = CommonSymbols.NIL;
      this.$isa_method = CommonSymbols.NIL;
      this.$target_instance = CommonSymbols.NIL;
    }

    @Override
    public SubLStructDecl getStructDecl()
    {
      return $slot_listener_native.structDecl;
    }

    @Override
    public SubLObject getField2()
    {
      return this.$slot_name;
    }

    @Override
    public SubLObject getField3()
    {
      return this.$demon_type;
    }

    @Override
    public SubLObject getField4()
    {
      return this.$value_trigger;
    }

    @Override
    public SubLObject getField5()
    {
      return this.$functional_type;
    }

    @Override
    public SubLObject getField6()
    {
      return this.$isa_method;
    }

    @Override
    public SubLObject getField7()
    {
      return this.$target_instance;
    }

    @Override
    public SubLObject setField2(final SubLObject value)
    {
      return this.$slot_name = value;
    }

    @Override
    public SubLObject setField3(final SubLObject value)
    {
      return this.$demon_type = value;
    }

    @Override
    public SubLObject setField4(final SubLObject value)
    {
      return this.$value_trigger = value;
    }

    @Override
    public SubLObject setField5(final SubLObject value)
    {
      return this.$functional_type = value;
    }

    @Override
    public SubLObject setField6(final SubLObject value)
    {
      return this.$isa_method = value;
    }

    @Override
    public SubLObject setField7(final SubLObject value)
    {
      return this.$target_instance = value;
    }
    static
    {
      structDecl = Structures.makeStructDeclNative( $slot_listener_native.class, $sym312$SLOT_LISTENER, $sym313$SLOT_LISTENER_P, $list314, $list315, new String[] { "$slot_name", "$demon_type", "$value_trigger",
        "$functional_type", "$isa_method", "$target_instance"
      }, $list316, $list317, $sym318$PRINT_SLOT_LISTENER );
    }
  }

  public static final class $slot_listener_p$UnaryFunction
      extends
        UnaryFunction
  {
    public $slot_listener_p$UnaryFunction()
    {
      super( SubLTranslatedFile.extractFunctionNamed( "SLOT-LISTENER-P" ) );
    }

    @Override
    public SubLObject processItem(final SubLObject arg1)
    {
      return slot_listener_p( arg1 );
    }
  }

  public static final class $slot_listener_registry_native
      extends
        SubLStructNative
  {
    public SubLObject $instance;
    public SubLObject $slot_count;
    public SubLObject $listeners_vector;
    private static final SubLStructDeclNative structDecl;

    public $slot_listener_registry_native()
    {
      this.$instance = CommonSymbols.NIL;
      this.$slot_count = CommonSymbols.NIL;
      this.$listeners_vector = CommonSymbols.NIL;
    }

    @Override
    public SubLStructDecl getStructDecl()
    {
      return $slot_listener_registry_native.structDecl;
    }

    @Override
    public SubLObject getField2()
    {
      return this.$instance;
    }

    @Override
    public SubLObject getField3()
    {
      return this.$slot_count;
    }

    @Override
    public SubLObject getField4()
    {
      return this.$listeners_vector;
    }

    @Override
    public SubLObject setField2(final SubLObject value)
    {
      return this.$instance = value;
    }

    @Override
    public SubLObject setField3(final SubLObject value)
    {
      return this.$slot_count = value;
    }

    @Override
    public SubLObject setField4(final SubLObject value)
    {
      return this.$listeners_vector = value;
    }
    static
    {
      structDecl = Structures.makeStructDeclNative( $slot_listener_registry_native.class, $sym345$SLOT_LISTENER_REGISTRY, $sym346$SLOT_LISTENER_REGISTRY_P, $list347, $list348, new String[] { "$instance", "$slot_count",
        "$listeners_vector"
      }, $list349, $list350, $sym290$DEFAULT_STRUCT_PRINT_FUNCTION );
    }
  }

  public static final class $slot_listener_registry_p$UnaryFunction
      extends
        UnaryFunction
  {
    public $slot_listener_registry_p$UnaryFunction()
    {
      super( SubLTranslatedFile.extractFunctionNamed( "SLOT-LISTENER-REGISTRY-P" ) );
    }

    @Override
    public SubLObject processItem(final SubLObject arg1)
    {
      return slot_listener_registry_p( arg1 );
    }
  }

  public static final class $method_listener_native
      extends
        SubLStructNative
  {
    public SubLObject $owning_method_name;
    public SubLObject $owning_class_name;
    public SubLObject $demon_type;
    public SubLObject $detail;
    private static final SubLStructDeclNative structDecl;

    public $method_listener_native()
    {
      this.$owning_method_name = CommonSymbols.NIL;
      this.$owning_class_name = CommonSymbols.NIL;
      this.$demon_type = CommonSymbols.NIL;
      this.$detail = CommonSymbols.NIL;
    }

    @Override
    public SubLStructDecl getStructDecl()
    {
      return $method_listener_native.structDecl;
    }

    @Override
    public SubLObject getField2()
    {
      return this.$owning_method_name;
    }

    @Override
    public SubLObject getField3()
    {
      return this.$owning_class_name;
    }

    @Override
    public SubLObject getField4()
    {
      return this.$demon_type;
    }

    @Override
    public SubLObject getField5()
    {
      return this.$detail;
    }

    @Override
    public SubLObject setField2(final SubLObject value)
    {
      return this.$owning_method_name = value;
    }

    @Override
    public SubLObject setField3(final SubLObject value)
    {
      return this.$owning_class_name = value;
    }

    @Override
    public SubLObject setField4(final SubLObject value)
    {
      return this.$demon_type = value;
    }

    @Override
    public SubLObject setField5(final SubLObject value)
    {
      return this.$detail = value;
    }
    static
    {
      structDecl = Structures.makeStructDeclNative( $method_listener_native.class, $sym368$METHOD_LISTENER, $sym369$METHOD_LISTENER_P, $list370, $list371, new String[] { "$owning_method_name", "$owning_class_name",
        "$demon_type", "$detail"
      }, $list372, $list373, $sym374$PRINT_METHOD_LISTENER );
    }
  }

  public static final class $method_listener_p$UnaryFunction
      extends
        UnaryFunction
  {
    public $method_listener_p$UnaryFunction()
    {
      super( SubLTranslatedFile.extractFunctionNamed( "METHOD-LISTENER-P" ) );
    }

    @Override
    public SubLObject processItem(final SubLObject arg1)
    {
      return method_listener_p( arg1 );
    }
  }

  public static final class $function_detail_native
      extends
        SubLStructNative
  {
    public SubLObject $function_name;
    public SubLObject $arglist;
    private static final SubLStructDeclNative structDecl;

    public $function_detail_native()
    {
      this.$function_name = CommonSymbols.NIL;
      this.$arglist = CommonSymbols.NIL;
    }

    @Override
    public SubLStructDecl getStructDecl()
    {
      return $function_detail_native.structDecl;
    }

    @Override
    public SubLObject getField2()
    {
      return this.$function_name;
    }

    @Override
    public SubLObject getField3()
    {
      return this.$arglist;
    }

    @Override
    public SubLObject setField2(final SubLObject value)
    {
      return this.$function_name = value;
    }

    @Override
    public SubLObject setField3(final SubLObject value)
    {
      return this.$arglist = value;
    }
    static
    {
      structDecl = Structures.makeStructDeclNative( $function_detail_native.class, $sym393$FUNCTION_DETAIL, $sym394$FUNCTION_DETAIL_P, $list395, $list396, new String[] { "$function_name", "$arglist"
      }, $list397, $list398, $sym290$DEFAULT_STRUCT_PRINT_FUNCTION );
    }
  }

  public static final class $function_detail_p$UnaryFunction
      extends
        UnaryFunction
  {
    public $function_detail_p$UnaryFunction()
    {
      super( SubLTranslatedFile.extractFunctionNamed( "FUNCTION-DETAIL-P" ) );
    }

    @Override
    public SubLObject processItem(final SubLObject arg1)
    {
      return function_detail_p( arg1 );
    }
  }

  public static final class $method_detail_native
      extends
        SubLStructNative
  {
    public SubLObject $method_name;
    public SubLObject $function_name;
    public SubLObject $arglist;
    public SubLObject $instance;
    private static final SubLStructDeclNative structDecl;

    public $method_detail_native()
    {
      this.$method_name = CommonSymbols.NIL;
      this.$function_name = CommonSymbols.NIL;
      this.$arglist = CommonSymbols.NIL;
      this.$instance = CommonSymbols.NIL;
    }

    @Override
    public SubLStructDecl getStructDecl()
    {
      return $method_detail_native.structDecl;
    }

    @Override
    public SubLObject getField2()
    {
      return this.$method_name;
    }

    @Override
    public SubLObject getField3()
    {
      return this.$function_name;
    }

    @Override
    public SubLObject getField4()
    {
      return this.$arglist;
    }

    @Override
    public SubLObject getField5()
    {
      return this.$instance;
    }

    @Override
    public SubLObject setField2(final SubLObject value)
    {
      return this.$method_name = value;
    }

    @Override
    public SubLObject setField3(final SubLObject value)
    {
      return this.$function_name = value;
    }

    @Override
    public SubLObject setField4(final SubLObject value)
    {
      return this.$arglist = value;
    }

    @Override
    public SubLObject setField5(final SubLObject value)
    {
      return this.$instance = value;
    }
    static
    {
      structDecl = Structures.makeStructDeclNative( $method_detail_native.class, $sym411$METHOD_DETAIL, $sym412$METHOD_DETAIL_P, $list413, $list414, new String[] { "$method_name", "$function_name", "$arglist",
        "$instance"
      }, $list415, $list416, $sym290$DEFAULT_STRUCT_PRINT_FUNCTION );
    }
  }

  public static final class $method_detail_p$UnaryFunction
      extends
        UnaryFunction
  {
    public $method_detail_p$UnaryFunction()
    {
      super( SubLTranslatedFile.extractFunctionNamed( "METHOD-DETAIL-P" ) );
    }

    @Override
    public SubLObject processItem(final SubLObject arg1)
    {
      return method_detail_p( arg1 );
    }
  }

  public static final class $method_listener_registry_native
      extends
        SubLStructNative
  {
    public SubLObject $instance;
    public SubLObject $listener_alist;
    private static final SubLStructDeclNative structDecl;

    public $method_listener_registry_native()
    {
      this.$instance = CommonSymbols.NIL;
      this.$listener_alist = CommonSymbols.NIL;
    }

    @Override
    public SubLStructDecl getStructDecl()
    {
      return $method_listener_registry_native.structDecl;
    }

    @Override
    public SubLObject getField2()
    {
      return this.$instance;
    }

    @Override
    public SubLObject getField3()
    {
      return this.$listener_alist;
    }

    @Override
    public SubLObject setField2(final SubLObject value)
    {
      return this.$instance = value;
    }

    @Override
    public SubLObject setField3(final SubLObject value)
    {
      return this.$listener_alist = value;
    }
    static
    {
      structDecl = Structures.makeStructDeclNative( $method_listener_registry_native.class, $sym432$METHOD_LISTENER_REGISTRY, $sym433$METHOD_LISTENER_REGISTRY_P, $list434, $list435, new String[] { "$instance",
        "$listener_alist"
      }, $list436, $list437, $sym290$DEFAULT_STRUCT_PRINT_FUNCTION );
    }
  }

  public static final class $method_listener_registry_p$UnaryFunction
      extends
        UnaryFunction
  {
    public $method_listener_registry_p$UnaryFunction()
    {
      super( SubLTranslatedFile.extractFunctionNamed( "METHOD-LISTENER-REGISTRY-P" ) );
    }

    @Override
    public SubLObject processItem(final SubLObject arg1)
    {
      return method_listener_registry_p( arg1 );
    }
  }
}
/*
 * 
 * Total time: 1308 ms
 * 
 */