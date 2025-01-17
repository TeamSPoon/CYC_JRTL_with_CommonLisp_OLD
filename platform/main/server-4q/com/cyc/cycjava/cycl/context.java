package com.cyc.cycjava.cycl;


import static com.cyc.cycjava.cycl.constant_handles.reader_make_constant_shell;
import static com.cyc.cycjava.cycl.el_utilities.string_to_el_var_name;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.cons;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.list;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.nth;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic.sublisp_throw;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.gethash;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.make_hash_table;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.sethash;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.add;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.subtract;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow.write_to_string;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.cconcatenate;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.nreverse;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.position;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.subseq;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.symbol_function;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads.$is_thread_performing_cleanupP$;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types.integerp;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.getValuesAsVector;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.restoreValuesFromVector;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeInteger;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeKeyword;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeString;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeSymbol;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeUninternedSymbol;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.member;
import static com.cyc.tool.subl.util.SubLFiles.declareFunction;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;


public final class context extends SubLTranslatedFile {
    public static final SubLFile me = new context();

    public static final String myName = "com.cyc.cycjava.cycl.context";

    public static final String myFingerPrint = "71ef8a70d50e9aa5da7f97d1ddfaed2a08d51faf507018293ecbf721256a31f8";





    public static final SubLList $list2 = list(list(makeSymbol("PARSE-TREE-CONTEXT"), makeKeyword("INSTANCE"), makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-PARSE-TREE-CONTEXT"), NIL, makeKeyword("PUBLIC")));





    public static final SubLSymbol SUBLOOP_RESERVED_INITIALIZE_CONTEXT_CLASS = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-CONTEXT-CLASS");





    public static final SubLSymbol SUBLOOP_RESERVED_INITIALIZE_CONTEXT_INSTANCE = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-CONTEXT-INSTANCE");



    public static final SubLList $list10 = list(makeKeyword("PROTECTED"));

    public static final SubLList $list11 = list(makeString("@return context-p; a new empty context"), list(makeSymbol("INITIALIZE"), makeSymbol("SUPER")), list(makeSymbol("CSETQ"), makeSymbol("PARSE-TREE-CONTEXT"), list(makeSymbol("NEW-CLASS-INSTANCE"), list(makeSymbol("QUOTE"), makeSymbol("PARSE-TREE-CONTEXT")))), list(makeSymbol("RET"), makeSymbol("SELF")));

    public static final SubLSymbol $sym12$OUTER_CATCH_FOR_CONTEXT_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-CONTEXT-METHOD");

    public static final SubLSymbol CONTEXT_INITIALIZE_METHOD = makeSymbol("CONTEXT-INITIALIZE-METHOD");

    public static final SubLSymbol GET_PARSE_TREE_CONTEXT = makeSymbol("GET-PARSE-TREE-CONTEXT");

    public static final SubLList $list15 = list(makeKeyword("PUBLIC"));

    public static final SubLList $list16 = list(makeString("@return listp; the parse-tree-context of this context"), list(makeSymbol("RET"), makeSymbol("PARSE-TREE-CONTEXT")));

    public static final SubLSymbol $sym17$OUTER_CATCH_FOR_CONTEXT_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-CONTEXT-METHOD");

    public static final SubLSymbol CONTEXT_GET_PARSE_TREE_CONTEXT_METHOD = makeSymbol("CONTEXT-GET-PARSE-TREE-CONTEXT-METHOD");

    public static final SubLList $list19 = list(new SubLObject[]{ list(makeSymbol("PARSE-TREES"), makeKeyword("INSTANCE"), makeKeyword("PROTECTED")), list(makeSymbol("INSTANCES"), makeKeyword("INSTANCE"), makeKeyword("PROTECTED")), list(makeSymbol("INSTANCE-COUNTER"), makeKeyword("INSTANCE"), makeKeyword("VALUE"), ZERO_INTEGER), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("INITIALIZE"), NIL, makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("ADD-TREE"), list(makeSymbol("PARSE-TREE")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-TREE"), list(makeSymbol("TREE"), makeSymbol("I")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-PRECEDING-TREES"), list(makeSymbol("TREE")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-FOLLOWING-TREES"), list(makeSymbol("TREE")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-INSTANCE"), list(makeSymbol("NP")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("NEW-VARIABLE"), list(makeSymbol("STRING")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("CREATE-INSTANCE"), list(makeSymbol("NP")), makeKeyword("PROTECTED")) });





    public static final SubLSymbol SUBLOOP_RESERVED_INITIALIZE_PARSE_TREE_CONTEXT_CLASS = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-PARSE-TREE-CONTEXT-CLASS");

    public static final SubLSymbol INSTANCE_COUNTER = makeSymbol("INSTANCE-COUNTER");

    public static final SubLSymbol SUBLOOP_RESERVED_INITIALIZE_PARSE_TREE_CONTEXT_INSTANCE = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-PARSE-TREE-CONTEXT-INSTANCE");

    public static final SubLList $list25 = list(list(makeSymbol("INITIALIZE"), makeSymbol("SUPER")), list(makeSymbol("CSETF"), makeSymbol("INSTANCES"), list(makeSymbol("MAKE-HASH-TABLE"), makeInteger(32), list(makeSymbol("QUOTE"), EQL))), list(makeSymbol("RET"), makeSymbol("SELF")));

    public static final SubLSymbol $sym26$OUTER_CATCH_FOR_PARSE_TREE_CONTEXT_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-PARSE-TREE-CONTEXT-METHOD");



    public static final SubLSymbol PARSE_TREE_CONTEXT_INITIALIZE_METHOD = makeSymbol("PARSE-TREE-CONTEXT-INITIALIZE-METHOD");

    public static final SubLSymbol ADD_TREE = makeSymbol("ADD-TREE");

    public static final SubLList $list30 = list(makeSymbol("PARSE-TREE"));

    public static final SubLList $list31 = list(makeString("@param PARSE-TREE parse-tree-; the parse tree to be added to this context\n   @return listp; a list of all trees of this context, from most to least recent"), list(makeSymbol("CHECK-TYPE"), makeSymbol("PARSE-TREE"), makeSymbol("PARSE-TREE-P")), list(makeSymbol("CPUSHNEW"), makeSymbol("PARSE-TREE"), makeSymbol("PARSE-TREES"), list(makeSymbol("QUOTE"), EQ)), list(makeSymbol("RET"), makeSymbol("PARSE-TREES")));

    public static final SubLSymbol $sym32$OUTER_CATCH_FOR_PARSE_TREE_CONTEXT_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-PARSE-TREE-CONTEXT-METHOD");



    public static final SubLSymbol PARSE_TREE_CONTEXT_ADD_TREE_METHOD = makeSymbol("PARSE-TREE-CONTEXT-ADD-TREE-METHOD");

    public static final SubLSymbol GET_TREE = makeSymbol("GET-TREE");

    public static final SubLList $list36 = list(makeSymbol("TREE"), makeSymbol("I"));

    public static final SubLList $list37 = list(makeString("@return parse-tree-p; the Ith parse tree preceding (if I is negative) or succeeding\n   (if I is positive) TREE"), list(makeSymbol("CHECK-TYPE"), makeSymbol("TREE"), makeSymbol("PARSE-TREE-P")), list(makeSymbol("CHECK-TYPE"), makeSymbol("I"), makeSymbol("INTEGERP")), list(makeSymbol("CLET"), list(list(makeSymbol("POSITION"), list(makeSymbol("POSITION"), makeSymbol("TREE"), makeSymbol("PARSE-TREES"), list(makeSymbol("QUOTE"), EQ))), makeSymbol("OFFSET")), list(makeSymbol("PUNLESS"), makeSymbol("POSITION"), list(makeSymbol("CSETQ"), makeSymbol("POSITION"), MINUS_ONE_INTEGER)), list(makeSymbol("CSETQ"), makeSymbol("OFFSET"), list(makeSymbol("-"), makeSymbol("POSITION"), makeSymbol("I"))), list(makeSymbol("RET"), list(makeSymbol("FWHEN"), list(makeSymbol("NON-NEGATIVE-INTEGER-P"), makeSymbol("OFFSET")), list(makeSymbol("NTH"), makeSymbol("OFFSET"), makeSymbol("PARSE-TREES"))))));

    public static final SubLSymbol $sym38$OUTER_CATCH_FOR_PARSE_TREE_CONTEXT_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-PARSE-TREE-CONTEXT-METHOD");



    public static final SubLSymbol PARSE_TREE_CONTEXT_GET_TREE_METHOD = makeSymbol("PARSE-TREE-CONTEXT-GET-TREE-METHOD");

    public static final SubLSymbol GET_PRECEDING_TREES = makeSymbol("GET-PRECEDING-TREES");

    public static final SubLList $list42 = list(makeSymbol("TREE"));

    public static final SubLList $list43 = list(makeString("@return listp; all trees in this context preceding TREE, from most to least recent"), list(makeSymbol("CHECK-TYPE"), makeSymbol("TREE"), makeSymbol("PARSE-TREE-P")), list(makeSymbol("CLET"), list(list(makeSymbol("POSITION"), list(makeSymbol("POSITION"), makeSymbol("TREE"), makeSymbol("PARSE-TREES"), list(makeSymbol("QUOTE"), EQ)))), list(makeSymbol("PUNLESS"), makeSymbol("POSITION"), list(makeSymbol("CSETQ"), makeSymbol("POSITION"), MINUS_ONE_INTEGER)), list(makeSymbol("RET"), list(makeSymbol("SUBSEQ"), makeSymbol("PARSE-TREES"), list(makeSymbol("1+"), makeSymbol("POSITION"))))));

    public static final SubLSymbol $sym44$OUTER_CATCH_FOR_PARSE_TREE_CONTEXT_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-PARSE-TREE-CONTEXT-METHOD");

    public static final SubLSymbol PARSE_TREE_CONTEXT_GET_PRECEDING_TREES_METHOD = makeSymbol("PARSE-TREE-CONTEXT-GET-PRECEDING-TREES-METHOD");

    public static final SubLSymbol GET_FOLLOWING_TREES = makeSymbol("GET-FOLLOWING-TREES");

    public static final SubLList $list47 = list(makeString("@return listp; all trees in this context following TREE, from least to most recent"), list(makeSymbol("CHECK-TYPE"), makeSymbol("TREE"), makeSymbol("PARSE-TREE-P")), list(makeSymbol("CLET"), list(list(makeSymbol("POSITION"), list(makeSymbol("POSITION"), makeSymbol("TREE"), makeSymbol("PARSE-TREES"), list(makeSymbol("QUOTE"), EQ)))), list(makeSymbol("RET"), list(makeSymbol("FWHEN"), makeSymbol("POSITION"), list(makeSymbol("NREVERSE"), list(makeSymbol("SUBSEQ"), makeSymbol("PARSE-TREES"), ZERO_INTEGER, makeSymbol("POSITION")))))));

    public static final SubLSymbol $sym48$OUTER_CATCH_FOR_PARSE_TREE_CONTEXT_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-PARSE-TREE-CONTEXT-METHOD");

    public static final SubLSymbol PARSE_TREE_CONTEXT_GET_FOLLOWING_TREES_METHOD = makeSymbol("PARSE-TREE-CONTEXT-GET-FOLLOWING-TREES-METHOD");

    public static final SubLSymbol GET_INSTANCE = makeSymbol("GET-INSTANCE");

    public static final SubLList $list51 = list(makeSymbol("NP"));

    public static final SubLList $list52 = list(makeString("@return listp; the instance denoted by NP"), list(makeSymbol("CHECK-TYPE"), makeSymbol("NP"), makeSymbol("CYCLIFIABLE-P")), list(makeSymbol("CLET"), list(list(makeSymbol("INSTANCE"), list(makeSymbol("GETHASH"), list(makeSymbol("FIM"), makeSymbol("NP"), list(makeSymbol("QUOTE"), makeSymbol("GET-REFS"))), makeSymbol("INSTANCES")))), list(makeSymbol("PUNLESS"), makeSymbol("INSTANCE"), list(makeSymbol("CSETQ"), makeSymbol("INSTANCE"), list(makeSymbol("FIM"), makeSymbol("SELF"), list(makeSymbol("QUOTE"), makeSymbol("CREATE-INSTANCE")), makeSymbol("NP")))), list(makeSymbol("RET"), makeSymbol("INSTANCE"))));

    public static final SubLSymbol $sym53$OUTER_CATCH_FOR_PARSE_TREE_CONTEXT_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-PARSE-TREE-CONTEXT-METHOD");

    public static final SubLSymbol CYCLIFIABLE_P = makeSymbol("CYCLIFIABLE-P");



    public static final SubLSymbol CREATE_INSTANCE = makeSymbol("CREATE-INSTANCE");

    public static final SubLSymbol PARSE_TREE_CONTEXT_GET_INSTANCE_METHOD = makeSymbol("PARSE-TREE-CONTEXT-GET-INSTANCE-METHOD");

    public static final SubLList $list58 = list(makeString("@return listp; a newly created instance"), list(makeSymbol("CLET"), list(list(makeSymbol("REF"), list(makeSymbol("FIRST"), list(makeSymbol("FIM"), makeSymbol("NP"), list(makeSymbol("QUOTE"), makeSymbol("GET-REFS"))))), list(makeSymbol("INSTANCE"), list(makeSymbol("BQ-LIST"), reader_make_constant_shell(makeString("InstanceFn")), list(makeSymbol("EL-VAR-NAME"), makeSymbol("REF"))))), list(makeSymbol("SETHASH"), makeSymbol("REF"), makeSymbol("INSTANCES"), makeSymbol("INSTANCE")), list(makeSymbol("RET"), makeSymbol("INSTANCE"))));

    public static final SubLSymbol $sym59$OUTER_CATCH_FOR_PARSE_TREE_CONTEXT_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-PARSE-TREE-CONTEXT-METHOD");

    private static final SubLObject $$InstanceFn = reader_make_constant_shell(makeString("InstanceFn"));

    public static final SubLSymbol PARSE_TREE_CONTEXT_CREATE_INSTANCE_METHOD = makeSymbol("PARSE-TREE-CONTEXT-CREATE-INSTANCE-METHOD");



    public static final SubLList $list63 = list(makeSymbol("&OPTIONAL"), list(makeSymbol("STRING"), makeString("X")));

    public static final SubLList $list64 = list(makeString("@return el-variable-p; a new variable unique for this context, containing STRING"), list(makeSymbol("CINC"), makeSymbol("INSTANCE-COUNTER")), list(makeSymbol("RET"), list(makeSymbol("MAKE-EL-VAR"), list(makeSymbol("STRING-TO-EL-VAR-NAME"), list(makeSymbol("CCONCATENATE"), makeSymbol("STRING"), list(makeSymbol("WRITE-TO-STRING"), makeSymbol("INSTANCE-COUNTER")))))));

    public static final SubLString $$$X = makeString("X");

    public static final SubLSymbol $sym66$OUTER_CATCH_FOR_PARSE_TREE_CONTEXT_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-PARSE-TREE-CONTEXT-METHOD");

    public static final SubLSymbol PARSE_TREE_CONTEXT_NEW_VARIABLE_METHOD = makeSymbol("PARSE-TREE-CONTEXT-NEW-VARIABLE-METHOD");

    public static SubLObject get_context_parse_tree_context(final SubLObject v_context) {
        return classes.subloop_get_access_protected_instance_slot(v_context, ONE_INTEGER, PARSE_TREE_CONTEXT);
    }

    public static SubLObject set_context_parse_tree_context(final SubLObject v_context, final SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(v_context, value, ONE_INTEGER, PARSE_TREE_CONTEXT);
    }

    public static SubLObject subloop_reserved_initialize_context_class(final SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_COUNT, ZERO_INTEGER);
        return NIL;
    }

    public static SubLObject subloop_reserved_initialize_context_instance(final SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, ISOLATED_P, NIL);
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_NUMBER, NIL);
        classes.subloop_initialize_slot(new_instance, CONTEXT, PARSE_TREE_CONTEXT, NIL);
        return NIL;
    }

    public static SubLObject context_p(final SubLObject v_context) {
        return classes.subloop_instanceof_class(v_context, CONTEXT);
    }

    public static SubLObject context_initialize_method(final SubLObject self) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_context_method = NIL;
        SubLObject parse_tree_context = get_context_parse_tree_context(self);
        try {
            thread.throwStack.push($sym12$OUTER_CATCH_FOR_CONTEXT_METHOD);
            try {
                object.object_initialize_method(self);
                parse_tree_context = object.new_class_instance(PARSE_TREE_CONTEXT);
                sublisp_throw($sym12$OUTER_CATCH_FOR_CONTEXT_METHOD, self);
            } finally {
                final SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    set_context_parse_tree_context(self, parse_tree_context);
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        } catch (final Throwable ccatch_env_var) {
            catch_var_for_context_method = Errors.handleThrowable(ccatch_env_var, $sym12$OUTER_CATCH_FOR_CONTEXT_METHOD);
        } finally {
            thread.throwStack.pop();
        }
        return catch_var_for_context_method;
    }

    public static SubLObject context_get_parse_tree_context_method(final SubLObject self) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_context_method = NIL;
        final SubLObject parse_tree_context = get_context_parse_tree_context(self);
        try {
            thread.throwStack.push($sym17$OUTER_CATCH_FOR_CONTEXT_METHOD);
            try {
                sublisp_throw($sym17$OUTER_CATCH_FOR_CONTEXT_METHOD, parse_tree_context);
            } finally {
                final SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    set_context_parse_tree_context(self, parse_tree_context);
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        } catch (final Throwable ccatch_env_var) {
            catch_var_for_context_method = Errors.handleThrowable(ccatch_env_var, $sym17$OUTER_CATCH_FOR_CONTEXT_METHOD);
        } finally {
            thread.throwStack.pop();
        }
        return catch_var_for_context_method;
    }

    public static SubLObject get_parse_tree_context_instance_counter(final SubLObject parse_tree_context) {
        return classes.subloop_get_instance_slot(parse_tree_context, THREE_INTEGER);
    }

    public static SubLObject set_parse_tree_context_instance_counter(final SubLObject parse_tree_context, final SubLObject value) {
        return classes.subloop_set_instance_slot(parse_tree_context, value, THREE_INTEGER);
    }

    public static SubLObject get_parse_tree_context_instances(final SubLObject parse_tree_context) {
        return classes.subloop_get_access_protected_instance_slot(parse_tree_context, TWO_INTEGER, INSTANCES);
    }

    public static SubLObject set_parse_tree_context_instances(final SubLObject parse_tree_context, final SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(parse_tree_context, value, TWO_INTEGER, INSTANCES);
    }

    public static SubLObject get_parse_tree_context_parse_trees(final SubLObject parse_tree_context) {
        return classes.subloop_get_access_protected_instance_slot(parse_tree_context, ONE_INTEGER, PARSE_TREES);
    }

    public static SubLObject set_parse_tree_context_parse_trees(final SubLObject parse_tree_context, final SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(parse_tree_context, value, ONE_INTEGER, PARSE_TREES);
    }

    public static SubLObject subloop_reserved_initialize_parse_tree_context_class(final SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_COUNT, ZERO_INTEGER);
        return NIL;
    }

    public static SubLObject subloop_reserved_initialize_parse_tree_context_instance(final SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, ISOLATED_P, NIL);
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_NUMBER, NIL);
        classes.subloop_initialize_slot(new_instance, PARSE_TREE_CONTEXT, PARSE_TREES, NIL);
        classes.subloop_initialize_slot(new_instance, PARSE_TREE_CONTEXT, INSTANCES, NIL);
        classes.subloop_initialize_slot(new_instance, PARSE_TREE_CONTEXT, INSTANCE_COUNTER, ZERO_INTEGER);
        return NIL;
    }

    public static SubLObject parse_tree_context_p(final SubLObject parse_tree_context) {
        return classes.subloop_instanceof_class(parse_tree_context, PARSE_TREE_CONTEXT);
    }

    public static SubLObject parse_tree_context_initialize_method(final SubLObject self) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_parse_tree_context_method = NIL;
        SubLObject v_instances = get_parse_tree_context_instances(self);
        try {
            thread.throwStack.push($sym26$OUTER_CATCH_FOR_PARSE_TREE_CONTEXT_METHOD);
            try {
                object.object_initialize_method(self);
                v_instances = make_hash_table($int$32, EQL, UNPROVIDED);
                sublisp_throw($sym26$OUTER_CATCH_FOR_PARSE_TREE_CONTEXT_METHOD, self);
            } finally {
                final SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    set_parse_tree_context_instances(self, v_instances);
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        } catch (final Throwable ccatch_env_var) {
            catch_var_for_parse_tree_context_method = Errors.handleThrowable(ccatch_env_var, $sym26$OUTER_CATCH_FOR_PARSE_TREE_CONTEXT_METHOD);
        } finally {
            thread.throwStack.pop();
        }
        return catch_var_for_parse_tree_context_method;
    }

    public static SubLObject parse_tree_context_add_tree_method(final SubLObject self, final SubLObject v_parse_tree) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_parse_tree_context_method = NIL;
        SubLObject parse_trees = get_parse_tree_context_parse_trees(self);
        try {
            thread.throwStack.push($sym32$OUTER_CATCH_FOR_PARSE_TREE_CONTEXT_METHOD);
            try {
                assert NIL != parse_tree.parse_tree_p(v_parse_tree) : "parse_tree.parse_tree_p(v_parse_tree) " + "CommonSymbols.NIL != parse_tree.parse_tree_p(v_parse_tree) " + v_parse_tree;
                if (NIL == member(v_parse_tree, parse_trees, EQ, symbol_function(IDENTITY))) {
                    parse_trees = cons(v_parse_tree, parse_trees);
                }
                sublisp_throw($sym32$OUTER_CATCH_FOR_PARSE_TREE_CONTEXT_METHOD, parse_trees);
            } finally {
                final SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    set_parse_tree_context_parse_trees(self, parse_trees);
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        } catch (final Throwable ccatch_env_var) {
            catch_var_for_parse_tree_context_method = Errors.handleThrowable(ccatch_env_var, $sym32$OUTER_CATCH_FOR_PARSE_TREE_CONTEXT_METHOD);
        } finally {
            thread.throwStack.pop();
        }
        return catch_var_for_parse_tree_context_method;
    }

    public static SubLObject parse_tree_context_get_tree_method(final SubLObject self, final SubLObject tree, final SubLObject i) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_parse_tree_context_method = NIL;
        final SubLObject parse_trees = get_parse_tree_context_parse_trees(self);
        try {
            thread.throwStack.push($sym38$OUTER_CATCH_FOR_PARSE_TREE_CONTEXT_METHOD);
            try {
                assert NIL != parse_tree.parse_tree_p(tree) : "parse_tree.parse_tree_p(tree) " + "CommonSymbols.NIL != parse_tree.parse_tree_p(tree) " + tree;
                assert NIL != integerp(i) : "Types.integerp(i) " + "CommonSymbols.NIL != Types.integerp(i) " + i;
                SubLObject position = position(tree, parse_trees, EQ, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                SubLObject offset = NIL;
                if (NIL == position) {
                    position = MINUS_ONE_INTEGER;
                }
                offset = subtract(position, i);
                sublisp_throw($sym38$OUTER_CATCH_FOR_PARSE_TREE_CONTEXT_METHOD, NIL != subl_promotions.non_negative_integer_p(offset) ? nth(offset, parse_trees) : NIL);
            } finally {
                final SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    set_parse_tree_context_parse_trees(self, parse_trees);
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        } catch (final Throwable ccatch_env_var) {
            catch_var_for_parse_tree_context_method = Errors.handleThrowable(ccatch_env_var, $sym38$OUTER_CATCH_FOR_PARSE_TREE_CONTEXT_METHOD);
        } finally {
            thread.throwStack.pop();
        }
        return catch_var_for_parse_tree_context_method;
    }

    public static SubLObject parse_tree_context_get_preceding_trees_method(final SubLObject self, final SubLObject tree) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_parse_tree_context_method = NIL;
        final SubLObject parse_trees = get_parse_tree_context_parse_trees(self);
        try {
            thread.throwStack.push($sym44$OUTER_CATCH_FOR_PARSE_TREE_CONTEXT_METHOD);
            try {
                assert NIL != parse_tree.parse_tree_p(tree) : "parse_tree.parse_tree_p(tree) " + "CommonSymbols.NIL != parse_tree.parse_tree_p(tree) " + tree;
                SubLObject position = position(tree, parse_trees, EQ, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                if (NIL == position) {
                    position = MINUS_ONE_INTEGER;
                }
                sublisp_throw($sym44$OUTER_CATCH_FOR_PARSE_TREE_CONTEXT_METHOD, subseq(parse_trees, number_utilities.f_1X(position), UNPROVIDED));
            } finally {
                final SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    set_parse_tree_context_parse_trees(self, parse_trees);
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        } catch (final Throwable ccatch_env_var) {
            catch_var_for_parse_tree_context_method = Errors.handleThrowable(ccatch_env_var, $sym44$OUTER_CATCH_FOR_PARSE_TREE_CONTEXT_METHOD);
        } finally {
            thread.throwStack.pop();
        }
        return catch_var_for_parse_tree_context_method;
    }

    public static SubLObject parse_tree_context_get_following_trees_method(final SubLObject self, final SubLObject tree) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_parse_tree_context_method = NIL;
        final SubLObject parse_trees = get_parse_tree_context_parse_trees(self);
        try {
            thread.throwStack.push($sym48$OUTER_CATCH_FOR_PARSE_TREE_CONTEXT_METHOD);
            try {
                assert NIL != parse_tree.parse_tree_p(tree) : "parse_tree.parse_tree_p(tree) " + "CommonSymbols.NIL != parse_tree.parse_tree_p(tree) " + tree;
                final SubLObject position = position(tree, parse_trees, EQ, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                sublisp_throw($sym48$OUTER_CATCH_FOR_PARSE_TREE_CONTEXT_METHOD, NIL != position ? nreverse(subseq(parse_trees, ZERO_INTEGER, position)) : NIL);
            } finally {
                final SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    set_parse_tree_context_parse_trees(self, parse_trees);
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        } catch (final Throwable ccatch_env_var) {
            catch_var_for_parse_tree_context_method = Errors.handleThrowable(ccatch_env_var, $sym48$OUTER_CATCH_FOR_PARSE_TREE_CONTEXT_METHOD);
        } finally {
            thread.throwStack.pop();
        }
        return catch_var_for_parse_tree_context_method;
    }

    public static SubLObject parse_tree_context_get_instance_method(final SubLObject self, final SubLObject np) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_parse_tree_context_method = NIL;
        final SubLObject v_instances = get_parse_tree_context_instances(self);
        try {
            thread.throwStack.push($sym53$OUTER_CATCH_FOR_PARSE_TREE_CONTEXT_METHOD);
            try {
                assert NIL != cyclifier_interface.cyclifiable_p(np) : "cyclifier_interface.cyclifiable_p(np) " + "CommonSymbols.NIL != cyclifier_interface.cyclifiable_p(np) " + np;
                SubLObject instance = gethash(methods.funcall_instance_method_with_0_args(np, GET_REFS), v_instances, UNPROVIDED);
                if (NIL == instance) {
                    instance = methods.funcall_instance_method_with_1_args(self, CREATE_INSTANCE, np);
                }
                sublisp_throw($sym53$OUTER_CATCH_FOR_PARSE_TREE_CONTEXT_METHOD, instance);
            } finally {
                final SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    set_parse_tree_context_instances(self, v_instances);
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        } catch (final Throwable ccatch_env_var) {
            catch_var_for_parse_tree_context_method = Errors.handleThrowable(ccatch_env_var, $sym53$OUTER_CATCH_FOR_PARSE_TREE_CONTEXT_METHOD);
        } finally {
            thread.throwStack.pop();
        }
        return catch_var_for_parse_tree_context_method;
    }

    public static SubLObject parse_tree_context_create_instance_method(final SubLObject self, final SubLObject np) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_parse_tree_context_method = NIL;
        final SubLObject v_instances = get_parse_tree_context_instances(self);
        try {
            thread.throwStack.push($sym59$OUTER_CATCH_FOR_PARSE_TREE_CONTEXT_METHOD);
            try {
                final SubLObject ref = methods.funcall_instance_method_with_0_args(np, GET_REFS).first();
                final SubLObject instance = list($$InstanceFn, cycl_variables.el_var_name(ref));
                sethash(ref, v_instances, instance);
                sublisp_throw($sym59$OUTER_CATCH_FOR_PARSE_TREE_CONTEXT_METHOD, instance);
            } finally {
                final SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    set_parse_tree_context_instances(self, v_instances);
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        } catch (final Throwable ccatch_env_var) {
            catch_var_for_parse_tree_context_method = Errors.handleThrowable(ccatch_env_var, $sym59$OUTER_CATCH_FOR_PARSE_TREE_CONTEXT_METHOD);
        } finally {
            thread.throwStack.pop();
        }
        return catch_var_for_parse_tree_context_method;
    }

    public static SubLObject parse_tree_context_new_variable_method(final SubLObject self, SubLObject string) {
        if (string == UNPROVIDED) {
            string = $$$X;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_parse_tree_context_method = NIL;
        SubLObject instance_counter = get_parse_tree_context_instance_counter(self);
        try {
            thread.throwStack.push($sym66$OUTER_CATCH_FOR_PARSE_TREE_CONTEXT_METHOD);
            try {
                instance_counter = add(instance_counter, ONE_INTEGER);
                sublisp_throw($sym66$OUTER_CATCH_FOR_PARSE_TREE_CONTEXT_METHOD, cycl_variables.make_el_var(string_to_el_var_name(cconcatenate(string, write_to_string(instance_counter, EMPTY_SUBL_OBJECT_ARRAY)))));
            } finally {
                final SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    set_parse_tree_context_instance_counter(self, instance_counter);
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        } catch (final Throwable ccatch_env_var) {
            catch_var_for_parse_tree_context_method = Errors.handleThrowable(ccatch_env_var, $sym66$OUTER_CATCH_FOR_PARSE_TREE_CONTEXT_METHOD);
        } finally {
            thread.throwStack.pop();
        }
        return catch_var_for_parse_tree_context_method;
    }

    public static SubLObject declare_context_file() {
        declareFunction(me, "get_context_parse_tree_context", "GET-CONTEXT-PARSE-TREE-CONTEXT", 1, 0, false);
        declareFunction(me, "set_context_parse_tree_context", "SET-CONTEXT-PARSE-TREE-CONTEXT", 2, 0, false);
        declareFunction(me, "subloop_reserved_initialize_context_class", "SUBLOOP-RESERVED-INITIALIZE-CONTEXT-CLASS", 1, 0, false);
        declareFunction(me, "subloop_reserved_initialize_context_instance", "SUBLOOP-RESERVED-INITIALIZE-CONTEXT-INSTANCE", 1, 0, false);
        declareFunction(me, "context_p", "CONTEXT-P", 1, 0, false);
        declareFunction(me, "context_initialize_method", "CONTEXT-INITIALIZE-METHOD", 1, 0, false);
        declareFunction(me, "context_get_parse_tree_context_method", "CONTEXT-GET-PARSE-TREE-CONTEXT-METHOD", 1, 0, false);
        declareFunction(me, "get_parse_tree_context_instance_counter", "GET-PARSE-TREE-CONTEXT-INSTANCE-COUNTER", 1, 0, false);
        declareFunction(me, "set_parse_tree_context_instance_counter", "SET-PARSE-TREE-CONTEXT-INSTANCE-COUNTER", 2, 0, false);
        declareFunction(me, "get_parse_tree_context_instances", "GET-PARSE-TREE-CONTEXT-INSTANCES", 1, 0, false);
        declareFunction(me, "set_parse_tree_context_instances", "SET-PARSE-TREE-CONTEXT-INSTANCES", 2, 0, false);
        declareFunction(me, "get_parse_tree_context_parse_trees", "GET-PARSE-TREE-CONTEXT-PARSE-TREES", 1, 0, false);
        declareFunction(me, "set_parse_tree_context_parse_trees", "SET-PARSE-TREE-CONTEXT-PARSE-TREES", 2, 0, false);
        declareFunction(me, "subloop_reserved_initialize_parse_tree_context_class", "SUBLOOP-RESERVED-INITIALIZE-PARSE-TREE-CONTEXT-CLASS", 1, 0, false);
        declareFunction(me, "subloop_reserved_initialize_parse_tree_context_instance", "SUBLOOP-RESERVED-INITIALIZE-PARSE-TREE-CONTEXT-INSTANCE", 1, 0, false);
        declareFunction(me, "parse_tree_context_p", "PARSE-TREE-CONTEXT-P", 1, 0, false);
        declareFunction(me, "parse_tree_context_initialize_method", "PARSE-TREE-CONTEXT-INITIALIZE-METHOD", 1, 0, false);
        declareFunction(me, "parse_tree_context_add_tree_method", "PARSE-TREE-CONTEXT-ADD-TREE-METHOD", 2, 0, false);
        declareFunction(me, "parse_tree_context_get_tree_method", "PARSE-TREE-CONTEXT-GET-TREE-METHOD", 3, 0, false);
        declareFunction(me, "parse_tree_context_get_preceding_trees_method", "PARSE-TREE-CONTEXT-GET-PRECEDING-TREES-METHOD", 2, 0, false);
        declareFunction(me, "parse_tree_context_get_following_trees_method", "PARSE-TREE-CONTEXT-GET-FOLLOWING-TREES-METHOD", 2, 0, false);
        declareFunction(me, "parse_tree_context_get_instance_method", "PARSE-TREE-CONTEXT-GET-INSTANCE-METHOD", 2, 0, false);
        declareFunction(me, "parse_tree_context_create_instance_method", "PARSE-TREE-CONTEXT-CREATE-INSTANCE-METHOD", 2, 0, false);
        declareFunction(me, "parse_tree_context_new_variable_method", "PARSE-TREE-CONTEXT-NEW-VARIABLE-METHOD", 1, 1, false);
        return NIL;
    }

    public static SubLObject init_context_file() {
        return NIL;
    }

    public static SubLObject setup_context_file() {
        classes.subloop_new_class(CONTEXT, OBJECT, NIL, NIL, $list2);
        classes.class_set_implements_slot_listeners(CONTEXT, NIL);
        classes.subloop_note_class_initialization_function(CONTEXT, SUBLOOP_RESERVED_INITIALIZE_CONTEXT_CLASS);
        classes.subloop_note_instance_initialization_function(CONTEXT, SUBLOOP_RESERVED_INITIALIZE_CONTEXT_INSTANCE);
        subloop_reserved_initialize_context_class(CONTEXT);
        methods.methods_incorporate_instance_method(INITIALIZE, CONTEXT, $list10, NIL, $list11);
        methods.subloop_register_instance_method(CONTEXT, INITIALIZE, CONTEXT_INITIALIZE_METHOD);
        methods.methods_incorporate_instance_method(GET_PARSE_TREE_CONTEXT, CONTEXT, $list15, NIL, $list16);
        methods.subloop_register_instance_method(CONTEXT, GET_PARSE_TREE_CONTEXT, CONTEXT_GET_PARSE_TREE_CONTEXT_METHOD);
        classes.subloop_new_class(PARSE_TREE_CONTEXT, OBJECT, NIL, NIL, $list19);
        classes.class_set_implements_slot_listeners(PARSE_TREE_CONTEXT, NIL);
        classes.subloop_note_class_initialization_function(PARSE_TREE_CONTEXT, SUBLOOP_RESERVED_INITIALIZE_PARSE_TREE_CONTEXT_CLASS);
        classes.subloop_note_instance_initialization_function(PARSE_TREE_CONTEXT, SUBLOOP_RESERVED_INITIALIZE_PARSE_TREE_CONTEXT_INSTANCE);
        subloop_reserved_initialize_parse_tree_context_class(PARSE_TREE_CONTEXT);
        methods.methods_incorporate_instance_method(INITIALIZE, PARSE_TREE_CONTEXT, $list10, NIL, $list25);
        methods.subloop_register_instance_method(PARSE_TREE_CONTEXT, INITIALIZE, PARSE_TREE_CONTEXT_INITIALIZE_METHOD);
        methods.methods_incorporate_instance_method(ADD_TREE, PARSE_TREE_CONTEXT, $list15, $list30, $list31);
        methods.subloop_register_instance_method(PARSE_TREE_CONTEXT, ADD_TREE, PARSE_TREE_CONTEXT_ADD_TREE_METHOD);
        methods.methods_incorporate_instance_method(GET_TREE, PARSE_TREE_CONTEXT, $list15, $list36, $list37);
        methods.subloop_register_instance_method(PARSE_TREE_CONTEXT, GET_TREE, PARSE_TREE_CONTEXT_GET_TREE_METHOD);
        methods.methods_incorporate_instance_method(GET_PRECEDING_TREES, PARSE_TREE_CONTEXT, $list15, $list42, $list43);
        methods.subloop_register_instance_method(PARSE_TREE_CONTEXT, GET_PRECEDING_TREES, PARSE_TREE_CONTEXT_GET_PRECEDING_TREES_METHOD);
        methods.methods_incorporate_instance_method(GET_FOLLOWING_TREES, PARSE_TREE_CONTEXT, $list15, $list42, $list47);
        methods.subloop_register_instance_method(PARSE_TREE_CONTEXT, GET_FOLLOWING_TREES, PARSE_TREE_CONTEXT_GET_FOLLOWING_TREES_METHOD);
        methods.methods_incorporate_instance_method(GET_INSTANCE, PARSE_TREE_CONTEXT, $list15, $list51, $list52);
        methods.subloop_register_instance_method(PARSE_TREE_CONTEXT, GET_INSTANCE, PARSE_TREE_CONTEXT_GET_INSTANCE_METHOD);
        methods.methods_incorporate_instance_method(CREATE_INSTANCE, PARSE_TREE_CONTEXT, $list10, $list51, $list58);
        methods.subloop_register_instance_method(PARSE_TREE_CONTEXT, CREATE_INSTANCE, PARSE_TREE_CONTEXT_CREATE_INSTANCE_METHOD);
        methods.methods_incorporate_instance_method(NEW_VARIABLE, PARSE_TREE_CONTEXT, $list10, $list63, $list64);
        methods.subloop_register_instance_method(PARSE_TREE_CONTEXT, NEW_VARIABLE, PARSE_TREE_CONTEXT_NEW_VARIABLE_METHOD);
        return NIL;
    }

    @Override
    public void declareFunctions() {
        declare_context_file();
    }

    @Override
    public void initializeVariables() {
        init_context_file();
    }

    @Override
    public void runTopLevelForms() {
        setup_context_file();
    }

    
}

/**
 * Total time: 384 ms
 */
