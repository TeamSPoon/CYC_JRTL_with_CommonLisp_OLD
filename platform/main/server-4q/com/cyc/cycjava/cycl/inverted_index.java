package com.cyc.cycjava.cycl;


import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.cons;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.list;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic.sublisp_throw;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality.identity;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions.funcall;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.add;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.length;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Structures.def_csetf;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Structures.makeStructDeclNative;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Structures.register_method;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.symbol_function;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads.$is_thread_performing_cleanupP$;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.getValuesAsVector;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.restoreValuesFromVector;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Vectors.aref;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Vectors.make_vector;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Vectors.set_aref;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeInteger;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeKeyword;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeString;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeSymbol;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeUninternedSymbol;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.cadr;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.cddr;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.second;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high.$print_object_method_table$;
import static com.cyc.tool.subl.util.SubLFiles.declareFunction;
import static com.cyc.tool.subl.util.SubLFiles.defconstant;

import org.armedbear.lisp.Lisp;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLSpecialOperatorDeclarations;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLStructDecl;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLStructDeclNative;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.UnaryFunction;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLStructNative;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.compatibility;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.visitation;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile; 
 public final class inverted_index extends SubLTranslatedFile {
    public static final SubLFile me = new inverted_index();

    public static final String myName = "com.cyc.cycjava.cycl.inverted_index";

    public static final String myFingerPrint = "b96b97c2d1987939c5875acfb7af848094e7dc4aa37643f632c599399f06e143";

    // defconstant
    public static final SubLSymbol $dtp_indexed_items$ = makeSymbol("*DTP-INDEXED-ITEMS*");





    public static final SubLList $list2 = list(new SubLObject[]{ list(makeSymbol("PHYSICAL-INDEX"), makeKeyword("INSTANCE"), makeKeyword("PROTECTED")), list(makeSymbol("INDEX-ENTRY-COMPUTER"), makeKeyword("INSTANCE"), makeKeyword("PROTECTED")), list(makeSymbol("VALUE-TEST"), makeKeyword("INSTANCE"), makeKeyword("PROTECTED")), list(makeSymbol("INDEXED-ITEMS"), makeKeyword("INSTANCE"), makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("INDEX-AN-ITEM"), list(makeSymbol("INDEX-ITEM")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("INSERT"), list(makeSymbol("INDEX-ENTRY")), makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("REMOVE-KEY"), list(makeSymbol("INDEX-ITEM")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("LOOKUP"), list(makeSymbol("INDEXABLE")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("COMPUTE-INDEX-ENTRIES"), list(makeSymbol("INDEX-ITEM")), makeKeyword("PRIVATE")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("INITIALIZE"), NIL, makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("ISOLATE"), NIL, makeKeyword("PUBLIC")) });











    public static final SubLSymbol SUBLOOP_RESERVED_INITIALIZE_INVERTED_INDEX_CLASS = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-INVERTED-INDEX-CLASS");





    public static final SubLSymbol SUBLOOP_RESERVED_INITIALIZE_INVERTED_INDEX_INSTANCE = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-INVERTED-INDEX-INSTANCE");



    public static final SubLList $list13 = list(makeKeyword("PUBLIC"));

    public static final SubLList $list14 = list(list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("PHYSICAL-INDEX"), list(makeSymbol("QUOTE"), makeSymbol("ISOLATE"))), list(makeSymbol("ISOLATE"), makeSymbol("SUPER")), list(makeSymbol("RET"), makeSymbol("SELF")));

    public static final SubLSymbol $sym15$OUTER_CATCH_FOR_INVERTED_INDEX_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-INVERTED-INDEX-METHOD");

    public static final SubLSymbol INVERTED_INDEX_ISOLATE_METHOD = makeSymbol("INVERTED-INDEX-ISOLATE-METHOD");

    public static final SubLSymbol INDEX_AN_ITEM = makeSymbol("INDEX-AN-ITEM");

    public static final SubLList $list18 = list(makeSymbol("INDEX-ITEM"));

    public static final SubLList $list19 = list(list(makeSymbol("PUNLESS"), list(makeSymbol("CAND"), list(makeSymbol("INDEX-ENTRY-COMPUTER-P"), makeSymbol("INDEX-ENTRY-COMPUTER")), list(makeSymbol("PHYSICAL-INDEX-P"), makeSymbol("PHYSICAL-INDEX"))), list(makeSymbol("ERROR"), makeString("trying to index ~S before the index has been properly initialized"), makeSymbol("INDEX-ITEM"))), list(makeSymbol("CLET"), list(list(makeSymbol("ENTRIES"), list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("INDEX-ENTRY-COMPUTER"), list(makeSymbol("QUOTE"), makeSymbol("COMPUTE-INDEX-ENTRIES")), makeSymbol("INDEX-ITEM")))), list(makeSymbol("CDOLIST"), list(makeSymbol("ENTRY"), makeSymbol("ENTRIES")), list(makeSymbol("FIM"), makeSymbol("PHYSICAL-INDEX"), list(makeSymbol("QUOTE"), makeSymbol("INSERT")), makeSymbol("ENTRY")))), list(makeSymbol("RET"), makeSymbol("SELF")));

    public static final SubLSymbol $sym20$OUTER_CATCH_FOR_INVERTED_INDEX_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-INVERTED-INDEX-METHOD");

    public static final SubLString $str21$trying_to_index__S_before_the_ind = makeString("trying to index ~S before the index has been properly initialized");



    public static final SubLSymbol INSERT = makeSymbol("INSERT");

    public static final SubLSymbol INVERTED_INDEX_INDEX_AN_ITEM_METHOD = makeSymbol("INVERTED-INDEX-INDEX-AN-ITEM-METHOD");

    public static final SubLList $list25 = list(makeKeyword("PRIVATE"));

    public static final SubLList $list26 = list(makeSymbol("ITEM-TO-INDEX"));

    public static final SubLList $list27 = list(list(makeSymbol("RET"), list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("INDEX-ENTRY-COMPUTER"), list(makeSymbol("QUOTE"), makeSymbol("COMPUTE-INDEX-ENTRIES")), makeSymbol("ITEM-TO-INDEX"))));

    public static final SubLSymbol $sym28$OUTER_CATCH_FOR_INVERTED_INDEX_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-INVERTED-INDEX-METHOD");

    public static final SubLSymbol INVERTED_INDEX_COMPUTE_INDEX_ENTRIES_METHOD = makeSymbol("INVERTED-INDEX-COMPUTE-INDEX-ENTRIES-METHOD");

    public static final SubLList $list30 = list(makeSymbol("INDEX-ENTRY"));

    public static final SubLList $list31 = list(list(makeSymbol("RET"), list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("PHYSICAL-INDEX"), list(makeSymbol("QUOTE"), makeSymbol("INSERT")), makeSymbol("INDEX-ENTRY"))));

    public static final SubLSymbol $sym32$OUTER_CATCH_FOR_INVERTED_INDEX_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-INVERTED-INDEX-METHOD");

    public static final SubLSymbol INVERTED_INDEX_INSERT_METHOD = makeSymbol("INVERTED-INDEX-INSERT-METHOD");

    public static final SubLSymbol INDEXED_ITEMS_P = makeSymbol("INDEXED-ITEMS-P");

    public static final SubLList $list35 = list(makeSymbol("NEXT-INDEX"), makeSymbol("ITEM-SUID-MAP"), makeSymbol("SUID-ITEM-MAP"));

    public static final SubLList $list36 = list(makeKeyword("NEXT-INDEX"), makeKeyword("ITEM-SUID-MAP"), makeKeyword("SUID-ITEM-MAP"));

    public static final SubLList $list37 = list(makeSymbol("INDEXED-ITEMS-NEXT-INDEX"), makeSymbol("INDEXED-ITEMS-ITEM-SUID-MAP"), makeSymbol("INDEXED-ITEMS-SUID-ITEM-MAP"));

    public static final SubLList $list38 = list(makeSymbol("_CSETF-INDEXED-ITEMS-NEXT-INDEX"), makeSymbol("_CSETF-INDEXED-ITEMS-ITEM-SUID-MAP"), makeSymbol("_CSETF-INDEXED-ITEMS-SUID-ITEM-MAP"));



    public static final SubLSymbol INDEXED_ITEMS_PRINT_FUNCTION_TRAMPOLINE = makeSymbol("INDEXED-ITEMS-PRINT-FUNCTION-TRAMPOLINE");

    private static final SubLList $list41 = list(makeSymbol("OPTIMIZE-FUNCALL"), makeSymbol("INDEXED-ITEMS-P"));

    private static final SubLSymbol INDEXED_ITEMS_NEXT_INDEX = makeSymbol("INDEXED-ITEMS-NEXT-INDEX");

    private static final SubLSymbol _CSETF_INDEXED_ITEMS_NEXT_INDEX = makeSymbol("_CSETF-INDEXED-ITEMS-NEXT-INDEX");

    private static final SubLSymbol INDEXED_ITEMS_ITEM_SUID_MAP = makeSymbol("INDEXED-ITEMS-ITEM-SUID-MAP");

    private static final SubLSymbol _CSETF_INDEXED_ITEMS_ITEM_SUID_MAP = makeSymbol("_CSETF-INDEXED-ITEMS-ITEM-SUID-MAP");

    private static final SubLSymbol INDEXED_ITEMS_SUID_ITEM_MAP = makeSymbol("INDEXED-ITEMS-SUID-ITEM-MAP");

    private static final SubLSymbol _CSETF_INDEXED_ITEMS_SUID_ITEM_MAP = makeSymbol("_CSETF-INDEXED-ITEMS-SUID-ITEM-MAP");



    private static final SubLSymbol $ITEM_SUID_MAP = makeKeyword("ITEM-SUID-MAP");

    private static final SubLSymbol $SUID_ITEM_MAP = makeKeyword("SUID-ITEM-MAP");

    private static final SubLString $str51$Invalid_slot__S_for_construction_ = makeString("Invalid slot ~S for construction function");



    private static final SubLSymbol MAKE_INDEXED_ITEMS = makeSymbol("MAKE-INDEXED-ITEMS");





    private static final SubLSymbol VISIT_DEFSTRUCT_OBJECT_INDEXED_ITEMS_METHOD = makeSymbol("VISIT-DEFSTRUCT-OBJECT-INDEXED-ITEMS-METHOD");

    private static final SubLInteger $int$50 = makeInteger(50);

    private static final SubLList $list58 = list(list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("COMPUTE-INDEX-ENTRIES"), list(makeSymbol("ITEM-TO-INDEX")), makeKeyword("PROTECTED")));

    private static final SubLSymbol SUBLOOP_RESERVED_INITIALIZE_INDEX_ENTRY_COMPUTER_CLASS = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-INDEX-ENTRY-COMPUTER-CLASS");

    private static final SubLSymbol SUBLOOP_RESERVED_INITIALIZE_INDEX_ENTRY_COMPUTER_INSTANCE = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-INDEX-ENTRY-COMPUTER-INSTANCE");

    private static final SubLList $list61 = list(list(makeSymbol("INDEX-STRUCTURE"), makeKeyword("INSTANCE"), makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("ISOLATE"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("INSERT"), list(makeSymbol("INDEX-ENTRY")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("LOOKUP"), list(makeSymbol("INDEX-KEY")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("REMOVE"), list(makeSymbol("INDEX-ENTRY")), makeKeyword("PUBLIC")));

    private static final SubLSymbol INDEX_STRUCTURE = makeSymbol("INDEX-STRUCTURE");

    private static final SubLSymbol SUBLOOP_RESERVED_INITIALIZE_PHYSICAL_INDEX_CLASS = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-PHYSICAL-INDEX-CLASS");

    private static final SubLSymbol SUBLOOP_RESERVED_INITIALIZE_PHYSICAL_INDEX_INSTANCE = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-PHYSICAL-INDEX-INSTANCE");

    private static final SubLSymbol IN_MEMORY_INDEX = makeSymbol("IN-MEMORY-INDEX");

    private static final SubLList $list66 = list(list(makeSymbol("DICTIONARY-INDEX"), makeKeyword("INSTANCE"), makeKeyword("PROTECTED")), list(makeSymbol("VAL-TEST"), makeKeyword("INSTANCE"), makeKeyword("PROTECTED")));





    private static final SubLSymbol SUBLOOP_RESERVED_INITIALIZE_IN_MEMORY_INDEX_CLASS = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-IN-MEMORY-INDEX-CLASS");

    private static final SubLSymbol SUBLOOP_RESERVED_INITIALIZE_IN_MEMORY_INDEX_INSTANCE = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-IN-MEMORY-INDEX-INSTANCE");

    public static final SubLList $list71 = list(list(makeSymbol("RET"), makeSymbol("SELF")));

    private static final SubLSymbol IN_MEMORY_INDEX_ISOLATE_METHOD = makeSymbol("IN-MEMORY-INDEX-ISOLATE-METHOD");

    private static final SubLList $list73 = list(list(makeSymbol("DICTIONARY-PUSHNEW"), makeSymbol("DICTIONARY-INDEX"), list(makeSymbol("INDEX-ENTRY-KEY"), makeSymbol("INDEX-ENTRY")), list(makeSymbol("INDEX-ENTRY-VALUE"), makeSymbol("INDEX-ENTRY"))), list(makeSymbol("RET"), makeSymbol("SELF")));

    private static final SubLSymbol $sym74$OUTER_CATCH_FOR_IN_MEMORY_INDEX_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-IN-MEMORY-INDEX-METHOD");

    private static final SubLSymbol IN_MEMORY_INDEX_INSERT_METHOD = makeSymbol("IN-MEMORY-INDEX-INSERT-METHOD");



    private static final SubLList $list77 = list(makeSymbol("INDEX-KEY"));

    private static final SubLList $list78 = list(list(makeSymbol("RET"), list(makeSymbol("DICTIONARY-LOOKUP"), makeSymbol("DICTIONARY-INDEX"), makeSymbol("INDEX-KEY"))));

    private static final SubLSymbol $sym79$OUTER_CATCH_FOR_IN_MEMORY_INDEX_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-IN-MEMORY-INDEX-METHOD");

    private static final SubLSymbol IN_MEMORY_INDEX_LOOKUP_METHOD = makeSymbol("IN-MEMORY-INDEX-LOOKUP-METHOD");



    private static final SubLList $list82 = list(list(makeSymbol("DICTIONARY-REMOVE-FROM-VALUE"), makeSymbol("DICTIONARY-INDEX"), list(makeSymbol("INDEX-ENTRY-KEY"), makeSymbol("INDEX-ENTRY")), list(makeSymbol("INDEX-ENTRY-VALUE"), makeSymbol("INDEX-ENTRY")), makeSymbol("VAL-TEST")), list(makeSymbol("RET"), makeSymbol("SELF")));

    private static final SubLSymbol $sym83$OUTER_CATCH_FOR_IN_MEMORY_INDEX_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-IN-MEMORY-INDEX-METHOD");

    private static final SubLSymbol IN_MEMORY_INDEX_REMOVE_METHOD = makeSymbol("IN-MEMORY-INDEX-REMOVE-METHOD");

    private static final SubLSymbol IN_MEMORY_EQUALP_INDEX = makeSymbol("IN-MEMORY-EQUALP-INDEX");

    private static final SubLList $list86 = list(list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("INITIALIZE"), NIL, makeKeyword("PRIVATE")));

    private static final SubLSymbol SUBLOOP_RESERVED_INITIALIZE_IN_MEMORY_EQUALP_INDEX_CLASS = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-IN-MEMORY-EQUALP-INDEX-CLASS");

    private static final SubLSymbol SUBLOOP_RESERVED_INITIALIZE_IN_MEMORY_EQUALP_INDEX_INSTANCE = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-IN-MEMORY-EQUALP-INDEX-INSTANCE");



    private static final SubLList $list90 = list(makeKeyword("PROTECTED"));

    public static final SubLList $list91 = list(list(makeSymbol("CSETQ"), makeSymbol("VAL-TEST"), list(makeSymbol("QUOTE"), EQUALP)), list(makeSymbol("CSETQ"), makeSymbol("DICTIONARY-INDEX"), list(makeSymbol("NEW-DICTIONARY"), makeSymbol("VAL-TEST"))), list(makeSymbol("RET"), makeSymbol("SELF")));

    private static final SubLSymbol $sym92$OUTER_CATCH_FOR_IN_MEMORY_EQUALP_INDEX_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-IN-MEMORY-EQUALP-INDEX-METHOD");

    private static final SubLSymbol IN_MEMORY_EQUALP_INDEX_INITIALIZE_METHOD = makeSymbol("IN-MEMORY-EQUALP-INDEX-INITIALIZE-METHOD");

    private static final SubLSymbol IN_MEMORY_EQUAL_INDEX = makeSymbol("IN-MEMORY-EQUAL-INDEX");

    private static final SubLSymbol SUBLOOP_RESERVED_INITIALIZE_IN_MEMORY_EQUAL_INDEX_CLASS = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-IN-MEMORY-EQUAL-INDEX-CLASS");

    private static final SubLSymbol SUBLOOP_RESERVED_INITIALIZE_IN_MEMORY_EQUAL_INDEX_INSTANCE = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-IN-MEMORY-EQUAL-INDEX-INSTANCE");

    public static final SubLList $list97 = list(list(makeSymbol("CSETQ"), makeSymbol("VAL-TEST"), list(makeSymbol("FUNCTION"), EQUAL)), list(makeSymbol("CSETQ"), makeSymbol("DICTIONARY-INDEX"), list(makeSymbol("NEW-DICTIONARY"), makeSymbol("VAL-TEST"))), list(makeSymbol("RET"), makeSymbol("SELF")));

    private static final SubLSymbol $sym98$OUTER_CATCH_FOR_IN_MEMORY_EQUAL_INDEX_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-IN-MEMORY-EQUAL-INDEX-METHOD");

    private static final SubLSymbol IN_MEMORY_EQUAL_INDEX_INITIALIZE_METHOD = makeSymbol("IN-MEMORY-EQUAL-INDEX-INITIALIZE-METHOD");

    private static final SubLSymbol IN_MEMORY_EQ_INDEX = makeSymbol("IN-MEMORY-EQ-INDEX");

    private static final SubLSymbol SUBLOOP_RESERVED_INITIALIZE_IN_MEMORY_EQ_INDEX_CLASS = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-IN-MEMORY-EQ-INDEX-CLASS");

    private static final SubLSymbol SUBLOOP_RESERVED_INITIALIZE_IN_MEMORY_EQ_INDEX_INSTANCE = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-IN-MEMORY-EQ-INDEX-INSTANCE");

    private static final SubLList $list103 = list(list(makeSymbol("CSETQ"), makeSymbol("VAL-TEST"), list(makeSymbol("QUOTE"), EQ)), list(makeSymbol("CSETQ"), makeSymbol("DICTIONARY-INDEX"), list(makeSymbol("NEW-DICTIONARY"), makeSymbol("VAL-TEST"))), list(makeSymbol("RET"), makeSymbol("SELF")));

    private static final SubLSymbol $sym104$OUTER_CATCH_FOR_IN_MEMORY_EQ_INDEX_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-IN-MEMORY-EQ-INDEX-METHOD");

    private static final SubLSymbol IN_MEMORY_EQ_INDEX_INITIALIZE_METHOD = makeSymbol("IN-MEMORY-EQ-INDEX-INITIALIZE-METHOD");

    private static final SubLSymbol SIMPLE_STRING_INDEX = makeSymbol("SIMPLE-STRING-INDEX");

    private static final SubLList $list107 = list(list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("INITIALIZE"), NIL, makeKeyword("PUBLIC")));

    private static final SubLSymbol SUBLOOP_RESERVED_INITIALIZE_SIMPLE_STRING_INDEX_CLASS = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-SIMPLE-STRING-INDEX-CLASS");

    private static final SubLSymbol SUBLOOP_RESERVED_INITIALIZE_SIMPLE_STRING_INDEX_INSTANCE = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-SIMPLE-STRING-INDEX-INSTANCE");

    private static final SubLList $list110 = list(list(makeSymbol("CSETQ"), makeSymbol("INDEXED-ITEMS"), list(makeSymbol("NEW-INDEXED-ITEMS"))), list(makeSymbol("CSETQ"), makeSymbol("VALUE-TEST"), list(makeSymbol("FUNCTION"), EQUALP)), list(makeSymbol("CSETQ"), makeSymbol("INDEX-ENTRY-COMPUTER"), list(makeSymbol("NEW-CLASS-INSTANCE"), list(makeSymbol("QUOTE"), makeSymbol("STRING-INDEX-ENTRY-COMPUTER")))), list(makeSymbol("CSETQ"), makeSymbol("PHYSICAL-INDEX"), list(makeSymbol("NEW-CLASS-INSTANCE"), list(makeSymbol("QUOTE"), makeSymbol("IN-MEMORY-EQUALP-INDEX")))), list(makeSymbol("RET"), makeSymbol("SELF")));

    private static final SubLSymbol $sym111$OUTER_CATCH_FOR_SIMPLE_STRING_INDEX_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-SIMPLE-STRING-INDEX-METHOD");

    private static final SubLSymbol STRING_INDEX_ENTRY_COMPUTER = makeSymbol("STRING-INDEX-ENTRY-COMPUTER");

    private static final SubLSymbol SIMPLE_STRING_INDEX_INITIALIZE_METHOD = makeSymbol("SIMPLE-STRING-INDEX-INITIALIZE-METHOD");

    private static final SubLList $list114 = list(makeSymbol("KEY"));

    private static final SubLList $list115 = list(list(makeSymbol("RET"), list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("PHYSICAL-INDEX"), list(makeSymbol("QUOTE"), makeSymbol("LOOKUP")), makeSymbol("KEY"))));

    private static final SubLSymbol $sym116$OUTER_CATCH_FOR_SIMPLE_STRING_INDEX_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-SIMPLE-STRING-INDEX-METHOD");

    private static final SubLSymbol SIMPLE_STRING_INDEX_LOOKUP_METHOD = makeSymbol("SIMPLE-STRING-INDEX-LOOKUP-METHOD");

    private static final SubLSymbol REMOVE_VALUE = makeSymbol("REMOVE-VALUE");

    public static final SubLList $list119 = list(list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("PHYSICAL-INDEX"), list(makeSymbol("QUOTE"), makeSymbol("REMOVE")), makeSymbol("INDEX-ENTRY")), list(makeSymbol("RET"), makeSymbol("SELF")));

    private static final SubLSymbol $sym120$OUTER_CATCH_FOR_SIMPLE_STRING_INDEX_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-SIMPLE-STRING-INDEX-METHOD");

    private static final SubLSymbol SIMPLE_STRING_INDEX_REMOVE_VALUE_METHOD = makeSymbol("SIMPLE-STRING-INDEX-REMOVE-VALUE-METHOD");

    private static final SubLList $list122 = list(list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("COMPUTE-INDEX-ENTRIES"), list(makeSymbol("ITEM-TO-INDEX")), makeKeyword("PUBLIC")));

    private static final SubLSymbol SUBLOOP_RESERVED_INITIALIZE_STRING_INDEX_ENTRY_COMPUTER_CLASS = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-STRING-INDEX-ENTRY-COMPUTER-CLASS");

    private static final SubLSymbol SUBLOOP_RESERVED_INITIALIZE_STRING_INDEX_ENTRY_COMPUTER_INSTANCE = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-STRING-INDEX-ENTRY-COMPUTER-INSTANCE");

    private static final SubLList $list125 = list(list(makeSymbol("CLET"), list(list(makeSymbol("RESULT"))), list(makeSymbol("CDOLIST-NUMBERED"), list(makeSymbol("WORD"), makeSymbol("NUM"), list(makeSymbol("STRING-TOKENIZE-VIA-WORDIFY"), makeSymbol("ITEM-TO-INDEX"))), list(makeSymbol("CPUSH"), list(makeSymbol("NEW-INVERTED-INDEX-ENTRY"), makeSymbol("WORD"), list(makeSymbol("BQ-LIST"), makeSymbol("NUM"), makeSymbol("ITEM-TO-INDEX"))), makeSymbol("RESULT"))), list(makeSymbol("RET"), makeSymbol("RESULT"))));

    private static final SubLSymbol STRING_INDEX_ENTRY_COMPUTER_COMPUTE_INDEX_ENTRIES_METHOD = makeSymbol("STRING-INDEX-ENTRY-COMPUTER-COMPUTE-INDEX-ENTRIES-METHOD");

    public static SubLObject get_inverted_index_indexed_items(final SubLObject v_inverted_index) {
        return classes.subloop_get_access_protected_instance_slot(v_inverted_index, FOUR_INTEGER, INDEXED_ITEMS);
    }

    public static SubLObject set_inverted_index_indexed_items(final SubLObject v_inverted_index, final SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(v_inverted_index, value, FOUR_INTEGER, INDEXED_ITEMS);
    }

    public static SubLObject get_inverted_index_value_test(final SubLObject v_inverted_index) {
        return classes.subloop_get_access_protected_instance_slot(v_inverted_index, THREE_INTEGER, VALUE_TEST);
    }

    public static SubLObject set_inverted_index_value_test(final SubLObject v_inverted_index, final SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(v_inverted_index, value, THREE_INTEGER, VALUE_TEST);
    }

    public static SubLObject get_inverted_index_index_entry_computer(final SubLObject v_inverted_index) {
        return classes.subloop_get_access_protected_instance_slot(v_inverted_index, TWO_INTEGER, INDEX_ENTRY_COMPUTER);
    }

    public static SubLObject set_inverted_index_index_entry_computer(final SubLObject v_inverted_index, final SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(v_inverted_index, value, TWO_INTEGER, INDEX_ENTRY_COMPUTER);
    }

    public static SubLObject get_inverted_index_physical_index(final SubLObject v_inverted_index) {
        return classes.subloop_get_access_protected_instance_slot(v_inverted_index, ONE_INTEGER, PHYSICAL_INDEX);
    }

    public static SubLObject set_inverted_index_physical_index(final SubLObject v_inverted_index, final SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(v_inverted_index, value, ONE_INTEGER, PHYSICAL_INDEX);
    }

    public static SubLObject subloop_reserved_initialize_inverted_index_class(final SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_COUNT, ZERO_INTEGER);
        return NIL;
    }

    public static SubLObject subloop_reserved_initialize_inverted_index_instance(final SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, ISOLATED_P, NIL);
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_NUMBER, NIL);
        classes.subloop_initialize_slot(new_instance, INVERTED_INDEX, PHYSICAL_INDEX, NIL);
        classes.subloop_initialize_slot(new_instance, INVERTED_INDEX, INDEX_ENTRY_COMPUTER, NIL);
        classes.subloop_initialize_slot(new_instance, INVERTED_INDEX, VALUE_TEST, NIL);
        classes.subloop_initialize_slot(new_instance, INVERTED_INDEX, INDEXED_ITEMS, NIL);
        return NIL;
    }

    public static SubLObject inverted_index_p(final SubLObject v_inverted_index) {
        return classes.subloop_instanceof_class(v_inverted_index, INVERTED_INDEX);
    }

    public static SubLObject inverted_index_isolate_method(final SubLObject self) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_inverted_index_method = NIL;
        final SubLObject physical_index = get_inverted_index_physical_index(self);
        try {
            thread.throwStack.push($sym15$OUTER_CATCH_FOR_INVERTED_INDEX_METHOD);
            try {
                methods.funcall_instance_method_with_0_args(physical_index, ISOLATE);
                object.object_isolate_method(self);
                sublisp_throw($sym15$OUTER_CATCH_FOR_INVERTED_INDEX_METHOD, self);
            } finally {
                final SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    set_inverted_index_physical_index(self, physical_index);
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        } catch (final Throwable ccatch_env_var) {
            catch_var_for_inverted_index_method = Errors.handleThrowable(ccatch_env_var, $sym15$OUTER_CATCH_FOR_INVERTED_INDEX_METHOD);
        } finally {
            thread.throwStack.pop();
        }
        return catch_var_for_inverted_index_method;
    }

    public static SubLObject inverted_index_index_an_item_method(final SubLObject self, final SubLObject index_item) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_inverted_index_method = NIL;
        final SubLObject index_entry_computer = get_inverted_index_index_entry_computer(self);
        final SubLObject physical_index = get_inverted_index_physical_index(self);
        try {
            thread.throwStack.push($sym20$OUTER_CATCH_FOR_INVERTED_INDEX_METHOD);
            try {
                if ((NIL == index_entry_computer_p(index_entry_computer)) || (NIL == physical_index_p(physical_index))) {
                    Errors.error($str21$trying_to_index__S_before_the_ind, index_item);
                }
                SubLObject cdolist_list_var;
                final SubLObject entries = cdolist_list_var = methods.funcall_instance_method_with_1_args(index_entry_computer, COMPUTE_INDEX_ENTRIES, index_item);
                SubLObject entry = NIL;
                entry = cdolist_list_var.first();
                while (NIL != cdolist_list_var) {
                    methods.funcall_instance_method_with_1_args(physical_index, INSERT, entry);
                    cdolist_list_var = cdolist_list_var.rest();
                    entry = cdolist_list_var.first();
                } 
                sublisp_throw($sym20$OUTER_CATCH_FOR_INVERTED_INDEX_METHOD, self);
            } finally {
                final SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    set_inverted_index_index_entry_computer(self, index_entry_computer);
                    set_inverted_index_physical_index(self, physical_index);
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        } catch (final Throwable ccatch_env_var) {
            catch_var_for_inverted_index_method = Errors.handleThrowable(ccatch_env_var, $sym20$OUTER_CATCH_FOR_INVERTED_INDEX_METHOD);
        } finally {
            thread.throwStack.pop();
        }
        return catch_var_for_inverted_index_method;
    }

    public static SubLObject inverted_index_compute_index_entries_method(final SubLObject self, final SubLObject item_to_index) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_inverted_index_method = NIL;
        final SubLObject index_entry_computer = get_inverted_index_index_entry_computer(self);
        try {
            thread.throwStack.push($sym28$OUTER_CATCH_FOR_INVERTED_INDEX_METHOD);
            try {
                sublisp_throw($sym28$OUTER_CATCH_FOR_INVERTED_INDEX_METHOD, methods.funcall_instance_method_with_1_args(index_entry_computer, COMPUTE_INDEX_ENTRIES, item_to_index));
            } finally {
                final SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    set_inverted_index_index_entry_computer(self, index_entry_computer);
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        } catch (final Throwable ccatch_env_var) {
            catch_var_for_inverted_index_method = Errors.handleThrowable(ccatch_env_var, $sym28$OUTER_CATCH_FOR_INVERTED_INDEX_METHOD);
        } finally {
            thread.throwStack.pop();
        }
        return catch_var_for_inverted_index_method;
    }

    public static SubLObject inverted_index_insert_method(final SubLObject self, final SubLObject index_entry) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_inverted_index_method = NIL;
        final SubLObject physical_index = get_inverted_index_physical_index(self);
        try {
            thread.throwStack.push($sym32$OUTER_CATCH_FOR_INVERTED_INDEX_METHOD);
            try {
                sublisp_throw($sym32$OUTER_CATCH_FOR_INVERTED_INDEX_METHOD, methods.funcall_instance_method_with_1_args(physical_index, INSERT, index_entry));
            } finally {
                final SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    set_inverted_index_physical_index(self, physical_index);
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        } catch (final Throwable ccatch_env_var) {
            catch_var_for_inverted_index_method = Errors.handleThrowable(ccatch_env_var, $sym32$OUTER_CATCH_FOR_INVERTED_INDEX_METHOD);
        } finally {
            thread.throwStack.pop();
        }
        return catch_var_for_inverted_index_method;
    }

    public static SubLObject new_inverted_index_entry(final SubLObject key, final SubLObject value) {
        return list(key, value);
    }

    public static SubLObject index_entry_key(final SubLObject index_entry) {
        return index_entry.first();
    }

    public static SubLObject index_entry_value(final SubLObject index_entry) {
        return second(index_entry);
    }

    public static SubLObject indexed_items_print_function_trampoline(final SubLObject v_object, final SubLObject stream) {
        compatibility.default_struct_print_function(v_object, stream, ZERO_INTEGER);
        return NIL;
    }

    public static SubLObject indexed_items_p(final SubLObject v_object) {
        return v_object.getJavaClass() ==$indexed_items_native.class ? T : NIL;
    }

    public static SubLObject indexed_items_next_index(final SubLObject v_object) {
        assert NIL != indexed_items_p(v_object) : "inverted_index.indexed_items_p error :" + v_object;
        return v_object.getField2();
    }

    public static SubLObject indexed_items_item_suid_map(final SubLObject v_object) {
        assert NIL != indexed_items_p(v_object) : "inverted_index.indexed_items_p error :" + v_object;
        return v_object.getField3();
    }

    public static SubLObject indexed_items_suid_item_map(final SubLObject v_object) {
        assert NIL != indexed_items_p(v_object) : "inverted_index.indexed_items_p error :" + v_object;
        return v_object.getField4();
    }

    public static SubLObject _csetf_indexed_items_next_index(final SubLObject v_object, final SubLObject value) {
        assert NIL != indexed_items_p(v_object) : "inverted_index.indexed_items_p error :" + v_object;
        return v_object.setField2(value);
    }

    public static SubLObject _csetf_indexed_items_item_suid_map(final SubLObject v_object, final SubLObject value) {
        assert NIL != indexed_items_p(v_object) : "inverted_index.indexed_items_p error :" + v_object;
        return v_object.setField3(value);
    }

    public static SubLObject _csetf_indexed_items_suid_item_map(final SubLObject v_object, final SubLObject value) {
        assert NIL != indexed_items_p(v_object) : "inverted_index.indexed_items_p error :" + v_object;
        return v_object.setField4(value);
    }

    public static SubLObject make_indexed_items(SubLObject arglist) {
        if (arglist == UNPROVIDED) {
            arglist = NIL;
        }
        final SubLObject v_new = new $indexed_items_native();
        SubLObject next;
        SubLObject current_arg;
        SubLObject current_value;
        SubLObject pcase_var;
        for (next = NIL, next = arglist; NIL != next; next = cddr(next)) {
            current_arg = next.first();
            current_value = cadr(next);
            pcase_var = current_arg;
            if (pcase_var.eql($NEXT_INDEX)) {
                _csetf_indexed_items_next_index(v_new, current_value);
            } else
                if (pcase_var.eql($ITEM_SUID_MAP)) {
                    _csetf_indexed_items_item_suid_map(v_new, current_value);
                } else
                    if (pcase_var.eql($SUID_ITEM_MAP)) {
                        _csetf_indexed_items_suid_item_map(v_new, current_value);
                    } else {
                        Errors.error($str51$Invalid_slot__S_for_construction_, current_arg);
                    }


        }
        return v_new;
    }

    public static SubLObject visit_defstruct_indexed_items(final SubLObject obj, final SubLObject visitor_fn) {
        funcall(visitor_fn, obj, $BEGIN, MAKE_INDEXED_ITEMS, THREE_INTEGER);
        funcall(visitor_fn, obj, $SLOT, $NEXT_INDEX, indexed_items_next_index(obj));
        funcall(visitor_fn, obj, $SLOT, $ITEM_SUID_MAP, indexed_items_item_suid_map(obj));
        funcall(visitor_fn, obj, $SLOT, $SUID_ITEM_MAP, indexed_items_suid_item_map(obj));
        funcall(visitor_fn, obj, $END, MAKE_INDEXED_ITEMS, THREE_INTEGER);
        return obj;
    }

    public static SubLObject visit_defstruct_object_indexed_items_method(final SubLObject obj, final SubLObject visitor_fn) {
        return visit_defstruct_indexed_items(obj, visitor_fn);
    }

    public static SubLObject new_indexed_items() {
        final SubLObject result = make_indexed_items(UNPROVIDED);
        _csetf_indexed_items_next_index(result, ZERO_INTEGER);
        _csetf_indexed_items_item_suid_map(result, dictionary.new_dictionary(EQUAL, UNPROVIDED));
        _csetf_indexed_items_suid_item_map(result, make_vector($int$50, UNPROVIDED));
        return result;
    }

    public static SubLObject maybe_add_new_indexed_item(final SubLObject indexed_items, final SubLObject item) {
        SubLObject suid = dictionary.dictionary_lookup(indexed_items_item_suid_map(indexed_items), item, UNPROVIDED);
        if (suid.isInteger()) {
            return suid;
        }
        suid = indexed_items_next_index(indexed_items);
        _csetf_indexed_items_next_index(indexed_items, add(indexed_items_next_index(indexed_items), ONE_INTEGER));
        dictionary.dictionary_enter(indexed_items_item_suid_map(indexed_items), item, suid);
        if (indexed_items_next_index(indexed_items).numG(length(indexed_items_suid_item_map(indexed_items)))) {
            _csetf_indexed_items_suid_item_map(indexed_items, vector_utilities.grow_vector(indexed_items_suid_item_map(indexed_items), UNPROVIDED, UNPROVIDED));
        }
        set_aref(indexed_items_suid_item_map(indexed_items), suid, item);
        return suid;
    }

    public static SubLObject get_item_from_index_suid(final SubLObject indexed_items, final SubLObject suid) {
        return aref(indexed_items_suid_item_map(indexed_items), suid);
    }

    public static SubLObject subloop_reserved_initialize_index_entry_computer_class(final SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_COUNT, ZERO_INTEGER);
        return NIL;
    }

    public static SubLObject subloop_reserved_initialize_index_entry_computer_instance(final SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, ISOLATED_P, NIL);
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_NUMBER, NIL);
        return NIL;
    }

    public static SubLObject index_entry_computer_p(final SubLObject index_entry_computer) {
        return classes.subloop_instanceof_class(index_entry_computer, INDEX_ENTRY_COMPUTER);
    }

    public static SubLObject get_physical_index_index_structure(final SubLObject physical_index) {
        return classes.subloop_get_access_protected_instance_slot(physical_index, ONE_INTEGER, INDEX_STRUCTURE);
    }

    public static SubLObject set_physical_index_index_structure(final SubLObject physical_index, final SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(physical_index, value, ONE_INTEGER, INDEX_STRUCTURE);
    }

    public static SubLObject subloop_reserved_initialize_physical_index_class(final SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_COUNT, ZERO_INTEGER);
        return NIL;
    }

    public static SubLObject subloop_reserved_initialize_physical_index_instance(final SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, ISOLATED_P, NIL);
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_NUMBER, NIL);
        classes.subloop_initialize_slot(new_instance, PHYSICAL_INDEX, INDEX_STRUCTURE, NIL);
        return NIL;
    }

    public static SubLObject physical_index_p(final SubLObject physical_index) {
        return classes.subloop_instanceof_class(physical_index, PHYSICAL_INDEX);
    }

    public static SubLObject get_in_memory_index_val_test(final SubLObject in_memory_index) {
        return classes.subloop_get_access_protected_instance_slot(in_memory_index, THREE_INTEGER, VAL_TEST);
    }

    public static SubLObject set_in_memory_index_val_test(final SubLObject in_memory_index, final SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(in_memory_index, value, THREE_INTEGER, VAL_TEST);
    }

    public static SubLObject get_in_memory_index_dictionary_index(final SubLObject in_memory_index) {
        return classes.subloop_get_access_protected_instance_slot(in_memory_index, TWO_INTEGER, DICTIONARY_INDEX);
    }

    public static SubLObject set_in_memory_index_dictionary_index(final SubLObject in_memory_index, final SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(in_memory_index, value, TWO_INTEGER, DICTIONARY_INDEX);
    }

    public static SubLObject subloop_reserved_initialize_in_memory_index_class(final SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_COUNT, ZERO_INTEGER);
        return NIL;
    }

    public static SubLObject subloop_reserved_initialize_in_memory_index_instance(final SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, ISOLATED_P, NIL);
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_NUMBER, NIL);
        classes.subloop_initialize_slot(new_instance, PHYSICAL_INDEX, INDEX_STRUCTURE, NIL);
        classes.subloop_initialize_slot(new_instance, IN_MEMORY_INDEX, DICTIONARY_INDEX, NIL);
        classes.subloop_initialize_slot(new_instance, IN_MEMORY_INDEX, VAL_TEST, NIL);
        return NIL;
    }

    public static SubLObject in_memory_index_p(final SubLObject in_memory_index) {
        return classes.subloop_instanceof_class(in_memory_index, IN_MEMORY_INDEX);
    }

    public static SubLObject in_memory_index_isolate_method(final SubLObject self) {
        return self;
    }

    public static SubLObject in_memory_index_insert_method(final SubLObject self, final SubLObject index_entry) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_in_memory_index_method = NIL;
        final SubLObject dictionary_index = get_in_memory_index_dictionary_index(self);
        try {
            thread.throwStack.push($sym74$OUTER_CATCH_FOR_IN_MEMORY_INDEX_METHOD);
            try {
                dictionary_utilities.dictionary_pushnew(dictionary_index, index_entry_key(index_entry), index_entry_value(index_entry), UNPROVIDED, UNPROVIDED);
                sublisp_throw($sym74$OUTER_CATCH_FOR_IN_MEMORY_INDEX_METHOD, self);
            } finally {
                final SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    set_in_memory_index_dictionary_index(self, dictionary_index);
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        } catch (final Throwable ccatch_env_var) {
            catch_var_for_in_memory_index_method = Errors.handleThrowable(ccatch_env_var, $sym74$OUTER_CATCH_FOR_IN_MEMORY_INDEX_METHOD);
        } finally {
            thread.throwStack.pop();
        }
        return catch_var_for_in_memory_index_method;
    }

    public static SubLObject in_memory_index_lookup_method(final SubLObject self, final SubLObject index_key) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_in_memory_index_method = NIL;
        final SubLObject dictionary_index = get_in_memory_index_dictionary_index(self);
        try {
            thread.throwStack.push($sym79$OUTER_CATCH_FOR_IN_MEMORY_INDEX_METHOD);
            try {
                sublisp_throw($sym79$OUTER_CATCH_FOR_IN_MEMORY_INDEX_METHOD, dictionary.dictionary_lookup(dictionary_index, index_key, UNPROVIDED));
            } finally {
                final SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    set_in_memory_index_dictionary_index(self, dictionary_index);
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        } catch (final Throwable ccatch_env_var) {
            catch_var_for_in_memory_index_method = Errors.handleThrowable(ccatch_env_var, $sym79$OUTER_CATCH_FOR_IN_MEMORY_INDEX_METHOD);
        } finally {
            thread.throwStack.pop();
        }
        return catch_var_for_in_memory_index_method;
    }

    public static SubLObject in_memory_index_remove_method(final SubLObject self, final SubLObject index_entry) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_in_memory_index_method = NIL;
        final SubLObject val_test = get_in_memory_index_val_test(self);
        final SubLObject dictionary_index = get_in_memory_index_dictionary_index(self);
        try {
            thread.throwStack.push($sym83$OUTER_CATCH_FOR_IN_MEMORY_INDEX_METHOD);
            try {
                dictionary_utilities.dictionary_remove_from_value(dictionary_index, index_entry_key(index_entry), index_entry_value(index_entry), val_test, UNPROVIDED);
                sublisp_throw($sym83$OUTER_CATCH_FOR_IN_MEMORY_INDEX_METHOD, self);
            } finally {
                final SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    set_in_memory_index_val_test(self, val_test);
                    set_in_memory_index_dictionary_index(self, dictionary_index);
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        } catch (final Throwable ccatch_env_var) {
            catch_var_for_in_memory_index_method = Errors.handleThrowable(ccatch_env_var, $sym83$OUTER_CATCH_FOR_IN_MEMORY_INDEX_METHOD);
        } finally {
            thread.throwStack.pop();
        }
        return catch_var_for_in_memory_index_method;
    }

    public static SubLObject subloop_reserved_initialize_in_memory_equalp_index_class(final SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_COUNT, ZERO_INTEGER);
        return NIL;
    }

    public static SubLObject subloop_reserved_initialize_in_memory_equalp_index_instance(final SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, ISOLATED_P, NIL);
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_NUMBER, NIL);
        classes.subloop_initialize_slot(new_instance, PHYSICAL_INDEX, INDEX_STRUCTURE, NIL);
        classes.subloop_initialize_slot(new_instance, IN_MEMORY_INDEX, DICTIONARY_INDEX, NIL);
        classes.subloop_initialize_slot(new_instance, IN_MEMORY_INDEX, VAL_TEST, NIL);
        return NIL;
    }

    public static SubLObject in_memory_equalp_index_p(final SubLObject in_memory_equalp_index) {
        return classes.subloop_instanceof_class(in_memory_equalp_index, IN_MEMORY_EQUALP_INDEX);
    }

    public static SubLObject in_memory_equalp_index_initialize_method(final SubLObject self) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_in_memory_equalp_index_method = NIL;
        SubLObject val_test = get_in_memory_index_val_test(self);
        SubLObject dictionary_index = get_in_memory_index_dictionary_index(self);
        try {
            thread.throwStack.push($sym92$OUTER_CATCH_FOR_IN_MEMORY_EQUALP_INDEX_METHOD);
            try {
                val_test = EQUALP;
                dictionary_index = dictionary.new_dictionary(val_test, UNPROVIDED);
                sublisp_throw($sym92$OUTER_CATCH_FOR_IN_MEMORY_EQUALP_INDEX_METHOD, self);
            } finally {
                final SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    set_in_memory_index_val_test(self, val_test);
                    set_in_memory_index_dictionary_index(self, dictionary_index);
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        } catch (final Throwable ccatch_env_var) {
            catch_var_for_in_memory_equalp_index_method = Errors.handleThrowable(ccatch_env_var, $sym92$OUTER_CATCH_FOR_IN_MEMORY_EQUALP_INDEX_METHOD);
        } finally {
            thread.throwStack.pop();
        }
        return catch_var_for_in_memory_equalp_index_method;
    }

    public static SubLObject subloop_reserved_initialize_in_memory_equal_index_class(final SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_COUNT, ZERO_INTEGER);
        return NIL;
    }

    public static SubLObject subloop_reserved_initialize_in_memory_equal_index_instance(final SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, ISOLATED_P, NIL);
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_NUMBER, NIL);
        classes.subloop_initialize_slot(new_instance, PHYSICAL_INDEX, INDEX_STRUCTURE, NIL);
        classes.subloop_initialize_slot(new_instance, IN_MEMORY_INDEX, DICTIONARY_INDEX, NIL);
        classes.subloop_initialize_slot(new_instance, IN_MEMORY_INDEX, VAL_TEST, NIL);
        return NIL;
    }

    public static SubLObject in_memory_equal_index_p(final SubLObject in_memory_equal_index) {
        return classes.subloop_instanceof_class(in_memory_equal_index, IN_MEMORY_EQUAL_INDEX);
    }

    public static SubLObject in_memory_equal_index_initialize_method(final SubLObject self) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_in_memory_equal_index_method = NIL;
        SubLObject val_test = get_in_memory_index_val_test(self);
        SubLObject dictionary_index = get_in_memory_index_dictionary_index(self);
        try {
            thread.throwStack.push($sym98$OUTER_CATCH_FOR_IN_MEMORY_EQUAL_INDEX_METHOD);
            try {
                val_test = symbol_function(EQUAL);
                dictionary_index = dictionary.new_dictionary(val_test, UNPROVIDED);
                sublisp_throw($sym98$OUTER_CATCH_FOR_IN_MEMORY_EQUAL_INDEX_METHOD, self);
            } finally {
                final SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    set_in_memory_index_val_test(self, val_test);
                    set_in_memory_index_dictionary_index(self, dictionary_index);
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        } catch (final Throwable ccatch_env_var) {
            catch_var_for_in_memory_equal_index_method = Errors.handleThrowable(ccatch_env_var, $sym98$OUTER_CATCH_FOR_IN_MEMORY_EQUAL_INDEX_METHOD);
        } finally {
            thread.throwStack.pop();
        }
        return catch_var_for_in_memory_equal_index_method;
    }

    public static SubLObject subloop_reserved_initialize_in_memory_eq_index_class(final SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_COUNT, ZERO_INTEGER);
        return NIL;
    }

    public static SubLObject subloop_reserved_initialize_in_memory_eq_index_instance(final SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, ISOLATED_P, NIL);
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_NUMBER, NIL);
        classes.subloop_initialize_slot(new_instance, PHYSICAL_INDEX, INDEX_STRUCTURE, NIL);
        classes.subloop_initialize_slot(new_instance, IN_MEMORY_INDEX, DICTIONARY_INDEX, NIL);
        classes.subloop_initialize_slot(new_instance, IN_MEMORY_INDEX, VAL_TEST, NIL);
        return NIL;
    }

    public static SubLObject in_memory_eq_index_p(final SubLObject in_memory_eq_index) {
        return classes.subloop_instanceof_class(in_memory_eq_index, IN_MEMORY_EQ_INDEX);
    }

    public static SubLObject in_memory_eq_index_initialize_method(final SubLObject self) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_in_memory_eq_index_method = NIL;
        SubLObject val_test = get_in_memory_index_val_test(self);
        SubLObject dictionary_index = get_in_memory_index_dictionary_index(self);
        try {
            thread.throwStack.push($sym104$OUTER_CATCH_FOR_IN_MEMORY_EQ_INDEX_METHOD);
            try {
                val_test = EQ;
                dictionary_index = dictionary.new_dictionary(val_test, UNPROVIDED);
                sublisp_throw($sym104$OUTER_CATCH_FOR_IN_MEMORY_EQ_INDEX_METHOD, self);
            } finally {
                final SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    set_in_memory_index_val_test(self, val_test);
                    set_in_memory_index_dictionary_index(self, dictionary_index);
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        } catch (final Throwable ccatch_env_var) {
            catch_var_for_in_memory_eq_index_method = Errors.handleThrowable(ccatch_env_var, $sym104$OUTER_CATCH_FOR_IN_MEMORY_EQ_INDEX_METHOD);
        } finally {
            thread.throwStack.pop();
        }
        return catch_var_for_in_memory_eq_index_method;
    }

    public static SubLObject subloop_reserved_initialize_simple_string_index_class(final SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_COUNT, ZERO_INTEGER);
        return NIL;
    }

    public static SubLObject subloop_reserved_initialize_simple_string_index_instance(final SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, ISOLATED_P, NIL);
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_NUMBER, NIL);
        classes.subloop_initialize_slot(new_instance, INVERTED_INDEX, PHYSICAL_INDEX, NIL);
        classes.subloop_initialize_slot(new_instance, INVERTED_INDEX, INDEX_ENTRY_COMPUTER, NIL);
        classes.subloop_initialize_slot(new_instance, INVERTED_INDEX, VALUE_TEST, NIL);
        classes.subloop_initialize_slot(new_instance, INVERTED_INDEX, INDEXED_ITEMS, NIL);
        return NIL;
    }

    public static SubLObject simple_string_index_p(final SubLObject simple_string_index) {
        return classes.subloop_instanceof_class(simple_string_index, SIMPLE_STRING_INDEX);
    }

    public static SubLObject simple_string_index_initialize_method(final SubLObject self) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_simple_string_index_method = NIL;
        SubLObject indexed_items = get_inverted_index_indexed_items(self);
        SubLObject value_test = get_inverted_index_value_test(self);
        SubLObject index_entry_computer = get_inverted_index_index_entry_computer(self);
        SubLObject physical_index = get_inverted_index_physical_index(self);
        try {
            thread.throwStack.push($sym111$OUTER_CATCH_FOR_SIMPLE_STRING_INDEX_METHOD);
            try {
                indexed_items = new_indexed_items();
                value_test = symbol_function(EQUALP);
                index_entry_computer = object.new_class_instance(STRING_INDEX_ENTRY_COMPUTER);
                physical_index = object.new_class_instance(IN_MEMORY_EQUALP_INDEX);
                sublisp_throw($sym111$OUTER_CATCH_FOR_SIMPLE_STRING_INDEX_METHOD, self);
            } finally {
                final SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    set_inverted_index_indexed_items(self, indexed_items);
                    set_inverted_index_value_test(self, value_test);
                    set_inverted_index_index_entry_computer(self, index_entry_computer);
                    set_inverted_index_physical_index(self, physical_index);
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        } catch (final Throwable ccatch_env_var) {
            catch_var_for_simple_string_index_method = Errors.handleThrowable(ccatch_env_var, $sym111$OUTER_CATCH_FOR_SIMPLE_STRING_INDEX_METHOD);
        } finally {
            thread.throwStack.pop();
        }
        return catch_var_for_simple_string_index_method;
    }

    public static SubLObject simple_string_index_lookup_method(final SubLObject self, final SubLObject key) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_simple_string_index_method = NIL;
        final SubLObject physical_index = get_inverted_index_physical_index(self);
        try {
            thread.throwStack.push($sym116$OUTER_CATCH_FOR_SIMPLE_STRING_INDEX_METHOD);
            try {
                sublisp_throw($sym116$OUTER_CATCH_FOR_SIMPLE_STRING_INDEX_METHOD, methods.funcall_instance_method_with_1_args(physical_index, LOOKUP, key));
            } finally {
                final SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    set_inverted_index_physical_index(self, physical_index);
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        } catch (final Throwable ccatch_env_var) {
            catch_var_for_simple_string_index_method = Errors.handleThrowable(ccatch_env_var, $sym116$OUTER_CATCH_FOR_SIMPLE_STRING_INDEX_METHOD);
        } finally {
            thread.throwStack.pop();
        }
        return catch_var_for_simple_string_index_method;
    }

    public static SubLObject simple_string_index_remove_value_method(final SubLObject self, final SubLObject index_entry) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_simple_string_index_method = NIL;
        final SubLObject physical_index = get_inverted_index_physical_index(self);
        try {
            thread.throwStack.push($sym120$OUTER_CATCH_FOR_SIMPLE_STRING_INDEX_METHOD);
            try {
                methods.funcall_instance_method_with_1_args(physical_index, REMOVE, index_entry);
                sublisp_throw($sym120$OUTER_CATCH_FOR_SIMPLE_STRING_INDEX_METHOD, self);
            } finally {
                final SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    set_inverted_index_physical_index(self, physical_index);
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        } catch (final Throwable ccatch_env_var) {
            catch_var_for_simple_string_index_method = Errors.handleThrowable(ccatch_env_var, $sym120$OUTER_CATCH_FOR_SIMPLE_STRING_INDEX_METHOD);
        } finally {
            thread.throwStack.pop();
        }
        return catch_var_for_simple_string_index_method;
    }

    public static SubLObject subloop_reserved_initialize_string_index_entry_computer_class(final SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_COUNT, ZERO_INTEGER);
        return NIL;
    }

    public static SubLObject subloop_reserved_initialize_string_index_entry_computer_instance(final SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, ISOLATED_P, NIL);
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_NUMBER, NIL);
        return NIL;
    }

    public static SubLObject string_index_entry_computer_p(final SubLObject string_index_entry_computer) {
        return classes.subloop_instanceof_class(string_index_entry_computer, STRING_INDEX_ENTRY_COMPUTER);
    }

    public static SubLObject string_index_entry_computer_compute_index_entries_method(final SubLObject self, final SubLObject item_to_index) {
        SubLObject result = NIL;
        SubLObject list_var = NIL;
        SubLObject word = NIL;
        SubLObject num = NIL;
        list_var = document.string_tokenize_via_wordify(item_to_index);
        word = list_var.first();
        for (num = ZERO_INTEGER; NIL != list_var; list_var = list_var.rest() , word = list_var.first() , num = add(ONE_INTEGER, num)) {
            result = cons(new_inverted_index_entry(word, list(num, item_to_index)), result);
        }
        return result;
    }

    public static SubLObject declare_inverted_index_file() {
        declareFunction(me, "get_inverted_index_indexed_items", "GET-INVERTED-INDEX-INDEXED-ITEMS", 1, 0, false);
        declareFunction(me, "set_inverted_index_indexed_items", "SET-INVERTED-INDEX-INDEXED-ITEMS", 2, 0, false);
        declareFunction(me, "get_inverted_index_value_test", "GET-INVERTED-INDEX-VALUE-TEST", 1, 0, false);
        declareFunction(me, "set_inverted_index_value_test", "SET-INVERTED-INDEX-VALUE-TEST", 2, 0, false);
        declareFunction(me, "get_inverted_index_index_entry_computer", "GET-INVERTED-INDEX-INDEX-ENTRY-COMPUTER", 1, 0, false);
        declareFunction(me, "set_inverted_index_index_entry_computer", "SET-INVERTED-INDEX-INDEX-ENTRY-COMPUTER", 2, 0, false);
        declareFunction(me, "get_inverted_index_physical_index", "GET-INVERTED-INDEX-PHYSICAL-INDEX", 1, 0, false);
        declareFunction(me, "set_inverted_index_physical_index", "SET-INVERTED-INDEX-PHYSICAL-INDEX", 2, 0, false);
        declareFunction(me, "subloop_reserved_initialize_inverted_index_class", "SUBLOOP-RESERVED-INITIALIZE-INVERTED-INDEX-CLASS", 1, 0, false);
        declareFunction(me, "subloop_reserved_initialize_inverted_index_instance", "SUBLOOP-RESERVED-INITIALIZE-INVERTED-INDEX-INSTANCE", 1, 0, false);
        declareFunction(me, "inverted_index_p", "INVERTED-INDEX-P", 1, 0, false);
        declareFunction(me, "inverted_index_isolate_method", "INVERTED-INDEX-ISOLATE-METHOD", 1, 0, false);
        declareFunction(me, "inverted_index_index_an_item_method", "INVERTED-INDEX-INDEX-AN-ITEM-METHOD", 2, 0, false);
        declareFunction(me, "inverted_index_compute_index_entries_method", "INVERTED-INDEX-COMPUTE-INDEX-ENTRIES-METHOD", 2, 0, false);
        declareFunction(me, "inverted_index_insert_method", "INVERTED-INDEX-INSERT-METHOD", 2, 0, false);
        declareFunction(me, "new_inverted_index_entry", "NEW-INVERTED-INDEX-ENTRY", 2, 0, false);
        declareFunction(me, "index_entry_key", "INDEX-ENTRY-KEY", 1, 0, false);
        declareFunction(me, "index_entry_value", "INDEX-ENTRY-VALUE", 1, 0, false);
        declareFunction(me, "indexed_items_print_function_trampoline", "INDEXED-ITEMS-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
        declareFunction(me, "indexed_items_p", "INDEXED-ITEMS-P", 1, 0, false);
        new inverted_index.$indexed_items_p$UnaryFunction();
        declareFunction(me, "indexed_items_next_index", "INDEXED-ITEMS-NEXT-INDEX", 1, 0, false);
        declareFunction(me, "indexed_items_item_suid_map", "INDEXED-ITEMS-ITEM-SUID-MAP", 1, 0, false);
        declareFunction(me, "indexed_items_suid_item_map", "INDEXED-ITEMS-SUID-ITEM-MAP", 1, 0, false);
        declareFunction(me, "_csetf_indexed_items_next_index", "_CSETF-INDEXED-ITEMS-NEXT-INDEX", 2, 0, false);
        declareFunction(me, "_csetf_indexed_items_item_suid_map", "_CSETF-INDEXED-ITEMS-ITEM-SUID-MAP", 2, 0, false);
        declareFunction(me, "_csetf_indexed_items_suid_item_map", "_CSETF-INDEXED-ITEMS-SUID-ITEM-MAP", 2, 0, false);
        declareFunction(me, "make_indexed_items", "MAKE-INDEXED-ITEMS", 0, 1, false);
        declareFunction(me, "visit_defstruct_indexed_items", "VISIT-DEFSTRUCT-INDEXED-ITEMS", 2, 0, false);
        declareFunction(me, "visit_defstruct_object_indexed_items_method", "VISIT-DEFSTRUCT-OBJECT-INDEXED-ITEMS-METHOD", 2, 0, false);
        declareFunction(me, "new_indexed_items", "NEW-INDEXED-ITEMS", 0, 0, false);
        declareFunction(me, "maybe_add_new_indexed_item", "MAYBE-ADD-NEW-INDEXED-ITEM", 2, 0, false);
        declareFunction(me, "get_item_from_index_suid", "GET-ITEM-FROM-INDEX-SUID", 2, 0, false);
        declareFunction(me, "subloop_reserved_initialize_index_entry_computer_class", "SUBLOOP-RESERVED-INITIALIZE-INDEX-ENTRY-COMPUTER-CLASS", 1, 0, false);
        declareFunction(me, "subloop_reserved_initialize_index_entry_computer_instance", "SUBLOOP-RESERVED-INITIALIZE-INDEX-ENTRY-COMPUTER-INSTANCE", 1, 0, false);
        declareFunction(me, "index_entry_computer_p", "INDEX-ENTRY-COMPUTER-P", 1, 0, false);
        declareFunction(me, "get_physical_index_index_structure", "GET-PHYSICAL-INDEX-INDEX-STRUCTURE", 1, 0, false);
        declareFunction(me, "set_physical_index_index_structure", "SET-PHYSICAL-INDEX-INDEX-STRUCTURE", 2, 0, false);
        declareFunction(me, "subloop_reserved_initialize_physical_index_class", "SUBLOOP-RESERVED-INITIALIZE-PHYSICAL-INDEX-CLASS", 1, 0, false);
        declareFunction(me, "subloop_reserved_initialize_physical_index_instance", "SUBLOOP-RESERVED-INITIALIZE-PHYSICAL-INDEX-INSTANCE", 1, 0, false);
        declareFunction(me, "physical_index_p", "PHYSICAL-INDEX-P", 1, 0, false);
        declareFunction(me, "get_in_memory_index_val_test", "GET-IN-MEMORY-INDEX-VAL-TEST", 1, 0, false);
        declareFunction(me, "set_in_memory_index_val_test", "SET-IN-MEMORY-INDEX-VAL-TEST", 2, 0, false);
        declareFunction(me, "get_in_memory_index_dictionary_index", "GET-IN-MEMORY-INDEX-DICTIONARY-INDEX", 1, 0, false);
        declareFunction(me, "set_in_memory_index_dictionary_index", "SET-IN-MEMORY-INDEX-DICTIONARY-INDEX", 2, 0, false);
        declareFunction(me, "subloop_reserved_initialize_in_memory_index_class", "SUBLOOP-RESERVED-INITIALIZE-IN-MEMORY-INDEX-CLASS", 1, 0, false);
        declareFunction(me, "subloop_reserved_initialize_in_memory_index_instance", "SUBLOOP-RESERVED-INITIALIZE-IN-MEMORY-INDEX-INSTANCE", 1, 0, false);
        declareFunction(me, "in_memory_index_p", "IN-MEMORY-INDEX-P", 1, 0, false);
        declareFunction(me, "in_memory_index_isolate_method", "IN-MEMORY-INDEX-ISOLATE-METHOD", 1, 0, false);
        declareFunction(me, "in_memory_index_insert_method", "IN-MEMORY-INDEX-INSERT-METHOD", 2, 0, false);
        declareFunction(me, "in_memory_index_lookup_method", "IN-MEMORY-INDEX-LOOKUP-METHOD", 2, 0, false);
        declareFunction(me, "in_memory_index_remove_method", "IN-MEMORY-INDEX-REMOVE-METHOD", 2, 0, false);
        declareFunction(me, "subloop_reserved_initialize_in_memory_equalp_index_class", "SUBLOOP-RESERVED-INITIALIZE-IN-MEMORY-EQUALP-INDEX-CLASS", 1, 0, false);
        declareFunction(me, "subloop_reserved_initialize_in_memory_equalp_index_instance", "SUBLOOP-RESERVED-INITIALIZE-IN-MEMORY-EQUALP-INDEX-INSTANCE", 1, 0, false);
        declareFunction(me, "in_memory_equalp_index_p", "IN-MEMORY-EQUALP-INDEX-P", 1, 0, false);
        declareFunction(me, "in_memory_equalp_index_initialize_method", "IN-MEMORY-EQUALP-INDEX-INITIALIZE-METHOD", 1, 0, false);
        declareFunction(me, "subloop_reserved_initialize_in_memory_equal_index_class", "SUBLOOP-RESERVED-INITIALIZE-IN-MEMORY-EQUAL-INDEX-CLASS", 1, 0, false);
        declareFunction(me, "subloop_reserved_initialize_in_memory_equal_index_instance", "SUBLOOP-RESERVED-INITIALIZE-IN-MEMORY-EQUAL-INDEX-INSTANCE", 1, 0, false);
        declareFunction(me, "in_memory_equal_index_p", "IN-MEMORY-EQUAL-INDEX-P", 1, 0, false);
        declareFunction(me, "in_memory_equal_index_initialize_method", "IN-MEMORY-EQUAL-INDEX-INITIALIZE-METHOD", 1, 0, false);
        declareFunction(me, "subloop_reserved_initialize_in_memory_eq_index_class", "SUBLOOP-RESERVED-INITIALIZE-IN-MEMORY-EQ-INDEX-CLASS", 1, 0, false);
        declareFunction(me, "subloop_reserved_initialize_in_memory_eq_index_instance", "SUBLOOP-RESERVED-INITIALIZE-IN-MEMORY-EQ-INDEX-INSTANCE", 1, 0, false);
        declareFunction(me, "in_memory_eq_index_p", "IN-MEMORY-EQ-INDEX-P", 1, 0, false);
        declareFunction(me, "in_memory_eq_index_initialize_method", "IN-MEMORY-EQ-INDEX-INITIALIZE-METHOD", 1, 0, false);
        declareFunction(me, "subloop_reserved_initialize_simple_string_index_class", "SUBLOOP-RESERVED-INITIALIZE-SIMPLE-STRING-INDEX-CLASS", 1, 0, false);
        declareFunction(me, "subloop_reserved_initialize_simple_string_index_instance", "SUBLOOP-RESERVED-INITIALIZE-SIMPLE-STRING-INDEX-INSTANCE", 1, 0, false);
        declareFunction(me, "simple_string_index_p", "SIMPLE-STRING-INDEX-P", 1, 0, false);
        declareFunction(me, "simple_string_index_initialize_method", "SIMPLE-STRING-INDEX-INITIALIZE-METHOD", 1, 0, false);
        declareFunction(me, "simple_string_index_lookup_method", "SIMPLE-STRING-INDEX-LOOKUP-METHOD", 2, 0, false);
        declareFunction(me, "simple_string_index_remove_value_method", "SIMPLE-STRING-INDEX-REMOVE-VALUE-METHOD", 2, 0, false);
        declareFunction(me, "subloop_reserved_initialize_string_index_entry_computer_class", "SUBLOOP-RESERVED-INITIALIZE-STRING-INDEX-ENTRY-COMPUTER-CLASS", 1, 0, false);
        declareFunction(me, "subloop_reserved_initialize_string_index_entry_computer_instance", "SUBLOOP-RESERVED-INITIALIZE-STRING-INDEX-ENTRY-COMPUTER-INSTANCE", 1, 0, false);
        declareFunction(me, "string_index_entry_computer_p", "STRING-INDEX-ENTRY-COMPUTER-P", 1, 0, false);
        declareFunction(me, "string_index_entry_computer_compute_index_entries_method", "STRING-INDEX-ENTRY-COMPUTER-COMPUTE-INDEX-ENTRIES-METHOD", 2, 0, false);
        return NIL;
    }

    public static SubLObject init_inverted_index_file() {
        defconstant("*DTP-INDEXED-ITEMS*", INDEXED_ITEMS);
        return NIL;
    }

    public static SubLObject setup_inverted_index_file() {
        classes.subloop_new_class(INVERTED_INDEX, OBJECT, NIL, T, $list2);
        classes.class_set_implements_slot_listeners(INVERTED_INDEX, NIL);
        classes.subloop_note_class_initialization_function(INVERTED_INDEX, SUBLOOP_RESERVED_INITIALIZE_INVERTED_INDEX_CLASS);
        classes.subloop_note_instance_initialization_function(INVERTED_INDEX, SUBLOOP_RESERVED_INITIALIZE_INVERTED_INDEX_INSTANCE);
        subloop_reserved_initialize_inverted_index_class(INVERTED_INDEX);
        methods.methods_incorporate_instance_method(ISOLATE, INVERTED_INDEX, $list13, NIL, $list14);
        methods.subloop_register_instance_method(INVERTED_INDEX, ISOLATE, INVERTED_INDEX_ISOLATE_METHOD);
        methods.methods_incorporate_instance_method(INDEX_AN_ITEM, INVERTED_INDEX, $list13, $list18, $list19);
        methods.subloop_register_instance_method(INVERTED_INDEX, INDEX_AN_ITEM, INVERTED_INDEX_INDEX_AN_ITEM_METHOD);
        methods.methods_incorporate_instance_method(COMPUTE_INDEX_ENTRIES, INVERTED_INDEX, $list25, $list26, $list27);
        methods.subloop_register_instance_method(INVERTED_INDEX, COMPUTE_INDEX_ENTRIES, INVERTED_INDEX_COMPUTE_INDEX_ENTRIES_METHOD);
        methods.methods_incorporate_instance_method(INSERT, INVERTED_INDEX, $list25, $list30, $list31);
        methods.subloop_register_instance_method(INVERTED_INDEX, INSERT, INVERTED_INDEX_INSERT_METHOD);
        register_method($print_object_method_table$.getGlobalValue(), $dtp_indexed_items$.getGlobalValue(), symbol_function(INDEXED_ITEMS_PRINT_FUNCTION_TRAMPOLINE));
        SubLSpecialOperatorDeclarations.proclaim($list41);
        def_csetf(INDEXED_ITEMS_NEXT_INDEX, _CSETF_INDEXED_ITEMS_NEXT_INDEX);
        def_csetf(INDEXED_ITEMS_ITEM_SUID_MAP, _CSETF_INDEXED_ITEMS_ITEM_SUID_MAP);
        def_csetf(INDEXED_ITEMS_SUID_ITEM_MAP, _CSETF_INDEXED_ITEMS_SUID_ITEM_MAP);
        identity(INDEXED_ITEMS);
        register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), $dtp_indexed_items$.getGlobalValue(), symbol_function(VISIT_DEFSTRUCT_OBJECT_INDEXED_ITEMS_METHOD));
        classes.subloop_new_class(INDEX_ENTRY_COMPUTER, OBJECT, NIL, T, $list58);
        classes.class_set_implements_slot_listeners(INDEX_ENTRY_COMPUTER, NIL);
        classes.subloop_note_class_initialization_function(INDEX_ENTRY_COMPUTER, SUBLOOP_RESERVED_INITIALIZE_INDEX_ENTRY_COMPUTER_CLASS);
        classes.subloop_note_instance_initialization_function(INDEX_ENTRY_COMPUTER, SUBLOOP_RESERVED_INITIALIZE_INDEX_ENTRY_COMPUTER_INSTANCE);
        subloop_reserved_initialize_index_entry_computer_class(INDEX_ENTRY_COMPUTER);
        classes.subloop_new_class(PHYSICAL_INDEX, OBJECT, NIL, T, $list61);
        classes.class_set_implements_slot_listeners(PHYSICAL_INDEX, NIL);
        classes.subloop_note_class_initialization_function(PHYSICAL_INDEX, SUBLOOP_RESERVED_INITIALIZE_PHYSICAL_INDEX_CLASS);
        classes.subloop_note_instance_initialization_function(PHYSICAL_INDEX, SUBLOOP_RESERVED_INITIALIZE_PHYSICAL_INDEX_INSTANCE);
        subloop_reserved_initialize_physical_index_class(PHYSICAL_INDEX);
        classes.subloop_new_class(IN_MEMORY_INDEX, PHYSICAL_INDEX, NIL, NIL, $list66);
        classes.class_set_implements_slot_listeners(IN_MEMORY_INDEX, NIL);
        classes.subloop_note_class_initialization_function(IN_MEMORY_INDEX, SUBLOOP_RESERVED_INITIALIZE_IN_MEMORY_INDEX_CLASS);
        classes.subloop_note_instance_initialization_function(IN_MEMORY_INDEX, SUBLOOP_RESERVED_INITIALIZE_IN_MEMORY_INDEX_INSTANCE);
        subloop_reserved_initialize_in_memory_index_class(IN_MEMORY_INDEX);
        methods.methods_incorporate_instance_method(ISOLATE, IN_MEMORY_INDEX, $list13, NIL, $list71);
        methods.subloop_register_instance_method(IN_MEMORY_INDEX, ISOLATE, IN_MEMORY_INDEX_ISOLATE_METHOD);
        methods.methods_incorporate_instance_method(INSERT, IN_MEMORY_INDEX, $list13, $list30, $list73);
        methods.subloop_register_instance_method(IN_MEMORY_INDEX, INSERT, IN_MEMORY_INDEX_INSERT_METHOD);
        methods.methods_incorporate_instance_method(LOOKUP, IN_MEMORY_INDEX, $list13, $list77, $list78);
        methods.subloop_register_instance_method(IN_MEMORY_INDEX, LOOKUP, IN_MEMORY_INDEX_LOOKUP_METHOD);
        methods.methods_incorporate_instance_method(REMOVE, IN_MEMORY_INDEX, $list13, $list30, $list82);
        methods.subloop_register_instance_method(IN_MEMORY_INDEX, REMOVE, IN_MEMORY_INDEX_REMOVE_METHOD);
        classes.subloop_new_class(IN_MEMORY_EQUALP_INDEX, IN_MEMORY_INDEX, NIL, NIL, $list86);
        classes.class_set_implements_slot_listeners(IN_MEMORY_EQUALP_INDEX, NIL);
        classes.subloop_note_class_initialization_function(IN_MEMORY_EQUALP_INDEX, SUBLOOP_RESERVED_INITIALIZE_IN_MEMORY_EQUALP_INDEX_CLASS);
        classes.subloop_note_instance_initialization_function(IN_MEMORY_EQUALP_INDEX, SUBLOOP_RESERVED_INITIALIZE_IN_MEMORY_EQUALP_INDEX_INSTANCE);
        subloop_reserved_initialize_in_memory_equalp_index_class(IN_MEMORY_EQUALP_INDEX);
        methods.methods_incorporate_instance_method(INITIALIZE, IN_MEMORY_EQUALP_INDEX, $list90, NIL, $list91);
        methods.subloop_register_instance_method(IN_MEMORY_EQUALP_INDEX, INITIALIZE, IN_MEMORY_EQUALP_INDEX_INITIALIZE_METHOD);
        classes.subloop_new_class(IN_MEMORY_EQUAL_INDEX, IN_MEMORY_INDEX, NIL, NIL, NIL);
        classes.class_set_implements_slot_listeners(IN_MEMORY_EQUAL_INDEX, NIL);
        classes.subloop_note_class_initialization_function(IN_MEMORY_EQUAL_INDEX, SUBLOOP_RESERVED_INITIALIZE_IN_MEMORY_EQUAL_INDEX_CLASS);
        classes.subloop_note_instance_initialization_function(IN_MEMORY_EQUAL_INDEX, SUBLOOP_RESERVED_INITIALIZE_IN_MEMORY_EQUAL_INDEX_INSTANCE);
        subloop_reserved_initialize_in_memory_equal_index_class(IN_MEMORY_EQUAL_INDEX);
        methods.methods_incorporate_instance_method(INITIALIZE, IN_MEMORY_EQUAL_INDEX, $list90, NIL, $list97);
        methods.subloop_register_instance_method(IN_MEMORY_EQUAL_INDEX, INITIALIZE, IN_MEMORY_EQUAL_INDEX_INITIALIZE_METHOD);
        classes.subloop_new_class(IN_MEMORY_EQ_INDEX, IN_MEMORY_INDEX, NIL, NIL, NIL);
        classes.class_set_implements_slot_listeners(IN_MEMORY_EQ_INDEX, NIL);
        classes.subloop_note_class_initialization_function(IN_MEMORY_EQ_INDEX, SUBLOOP_RESERVED_INITIALIZE_IN_MEMORY_EQ_INDEX_CLASS);
        classes.subloop_note_instance_initialization_function(IN_MEMORY_EQ_INDEX, SUBLOOP_RESERVED_INITIALIZE_IN_MEMORY_EQ_INDEX_INSTANCE);
        subloop_reserved_initialize_in_memory_eq_index_class(IN_MEMORY_EQ_INDEX);
        methods.methods_incorporate_instance_method(INITIALIZE, IN_MEMORY_EQ_INDEX, $list90, NIL, $list103);
        methods.subloop_register_instance_method(IN_MEMORY_EQ_INDEX, INITIALIZE, IN_MEMORY_EQ_INDEX_INITIALIZE_METHOD);
        classes.subloop_new_class(SIMPLE_STRING_INDEX, INVERTED_INDEX, NIL, NIL, $list107);
        classes.class_set_implements_slot_listeners(SIMPLE_STRING_INDEX, NIL);
        classes.subloop_note_class_initialization_function(SIMPLE_STRING_INDEX, SUBLOOP_RESERVED_INITIALIZE_SIMPLE_STRING_INDEX_CLASS);
        classes.subloop_note_instance_initialization_function(SIMPLE_STRING_INDEX, SUBLOOP_RESERVED_INITIALIZE_SIMPLE_STRING_INDEX_INSTANCE);
        subloop_reserved_initialize_simple_string_index_class(SIMPLE_STRING_INDEX);
        methods.methods_incorporate_instance_method(INITIALIZE, SIMPLE_STRING_INDEX, $list90, NIL, $list110);
        methods.subloop_register_instance_method(SIMPLE_STRING_INDEX, INITIALIZE, SIMPLE_STRING_INDEX_INITIALIZE_METHOD);
        methods.methods_incorporate_instance_method(LOOKUP, SIMPLE_STRING_INDEX, $list13, $list114, $list115);
        methods.subloop_register_instance_method(SIMPLE_STRING_INDEX, LOOKUP, SIMPLE_STRING_INDEX_LOOKUP_METHOD);
        methods.methods_incorporate_instance_method(REMOVE_VALUE, SIMPLE_STRING_INDEX, $list13, $list30, $list119);
        methods.subloop_register_instance_method(SIMPLE_STRING_INDEX, REMOVE_VALUE, SIMPLE_STRING_INDEX_REMOVE_VALUE_METHOD);
        classes.subloop_new_class(STRING_INDEX_ENTRY_COMPUTER, INDEX_ENTRY_COMPUTER, NIL, NIL, $list122);
        classes.class_set_implements_slot_listeners(STRING_INDEX_ENTRY_COMPUTER, NIL);
        classes.subloop_note_class_initialization_function(STRING_INDEX_ENTRY_COMPUTER, SUBLOOP_RESERVED_INITIALIZE_STRING_INDEX_ENTRY_COMPUTER_CLASS);
        classes.subloop_note_instance_initialization_function(STRING_INDEX_ENTRY_COMPUTER, SUBLOOP_RESERVED_INITIALIZE_STRING_INDEX_ENTRY_COMPUTER_INSTANCE);
        subloop_reserved_initialize_string_index_entry_computer_class(STRING_INDEX_ENTRY_COMPUTER);
        methods.methods_incorporate_instance_method(COMPUTE_INDEX_ENTRIES, STRING_INDEX_ENTRY_COMPUTER, $list90, $list26, $list125);
        methods.subloop_register_instance_method(STRING_INDEX_ENTRY_COMPUTER, COMPUTE_INDEX_ENTRIES, STRING_INDEX_ENTRY_COMPUTER_COMPUTE_INDEX_ENTRIES_METHOD);
        return NIL;
    }

    @Override
    public void declareFunctions() {
        declare_inverted_index_file();
    }

    @Override
    public void initializeVariables() {
        init_inverted_index_file();
    }

    @Override
    public void runTopLevelForms() {
        setup_inverted_index_file();
    }

    

    public static final class $indexed_items_native extends SubLStructNative {
        public SubLObject $next_index;

        public SubLObject $item_suid_map;

        public SubLObject $suid_item_map;

        private static final SubLStructDeclNative structDecl;

        private $indexed_items_native() {
            this.$next_index = Lisp.NIL;
            this.$item_suid_map = Lisp.NIL;
            this.$suid_item_map = Lisp.NIL;
        }

        @Override
        public SubLStructDecl getStructDecl() {
            return structDecl;
        }

        @Override
        public SubLObject getField2() {
            return this.$next_index;
        }

        @Override
        public SubLObject getField3() {
            return this.$item_suid_map;
        }

        @Override
        public SubLObject getField4() {
            return this.$suid_item_map;
        }

        @Override
        public SubLObject setField2(final SubLObject value) {
            return this.$next_index = value;
        }

        @Override
        public SubLObject setField3(final SubLObject value) {
            return this.$item_suid_map = value;
        }

        @Override
        public SubLObject setField4(final SubLObject value) {
            return this.$suid_item_map = value;
        }

        static {
            structDecl = makeStructDeclNative($indexed_items_native.class, INDEXED_ITEMS, INDEXED_ITEMS_P, $list35, $list36, new String[]{ "$next_index", "$item_suid_map", "$suid_item_map" }, $list37, $list38, DEFAULT_STRUCT_PRINT_FUNCTION);
        }
    }

    public static final class $indexed_items_p$UnaryFunction extends UnaryFunction {
        public $indexed_items_p$UnaryFunction() {
            super(extractFunctionNamed("INDEXED-ITEMS-P"));
        }

        @Override
        public SubLObject processItem(final SubLObject arg1) {
            return indexed_items_p(arg1);
        }
    }
}

/**
 * Total time: 421 ms
 */
