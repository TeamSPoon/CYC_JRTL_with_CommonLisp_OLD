package com.cyc.cycjava.cycl;


import static com.cyc.cycjava.cycl.constant_handles.reader_make_constant_shell;
import static com.cyc.cycjava.cycl.control_vars.$within_assert$;
import static com.cyc.cycjava.cycl.el_utilities.groundP;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.append;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.cons;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.list;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.listS;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.make_list;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic.sublisp_throw;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.add;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow.format;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow.write_to_string;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.length;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.symbol_function;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads.$is_thread_performing_cleanupP$;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types.integerp;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types.listp;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.getValuesAsVector;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.restoreValuesFromVector;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.values;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeKeyword;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeString;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeSymbol;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeUninternedSymbol;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.cdestructuring_bind_error;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.destructuring_bind_must_consp;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.assoc;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.caar;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.copy_list;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.intersection;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.list_length;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.member;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.pairlis;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.second;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.set_difference;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.sublis;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.third;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader.bq_cons;
import static com.cyc.tool.subl.util.SubLFiles.declareFunction;
import static com.cyc.tool.subl.util.SubLFiles.declareMacro;
import static com.cyc.tool.subl.util.SubLFiles.defparameter;

import com.cyc.cycjava.cycl.inference.harness.inference_kernel;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;


public final class shop_basic_plan_state extends SubLTranslatedFile {
    public static final SubLFile me = new shop_basic_plan_state();

    public static final String myName = "com.cyc.cycjava.cycl.shop_basic_plan_state";

    public static final String myFingerPrint = "f4d413e3f3336fef54edc570c25255e5fe8183ab6570cde2438e75469b98751f";

    // defparameter
    private static final SubLSymbol $shop_canonicalize_functionsP$ = makeSymbol("*SHOP-CANONICALIZE-FUNCTIONS?*");

    // Internal Constants
    public static final SubLList $list0 = list(makeSymbol("LIST1"), makeSymbol("LIST2"));





    public static final SubLList $list3 = list(makeSymbol("REQUIRED-VERBOSE-LEVEL"), makeSymbol("&BODY"), makeSymbol("BODY"));







    public static final SubLList $list7 = list(makeSymbol("*SHOP-VERBOSE-KEYS*"));

    public static final SubLList $list8 = list(list(makeSymbol("VERBOSE-MSG-LEVEL"), list(makeSymbol("FIF"), makeSymbol("ENTRY"), list(makeSymbol("REST"), makeSymbol("ENTRY")), ZERO_INTEGER)), list(makeSymbol("VERBOSE-THREAD-LEVEL"), list(makeSymbol("GET-SLOT"), list(makeSymbol("GET-SLOT"), makeSymbol("SELF"), list(makeSymbol("QUOTE"), makeSymbol("LOG"))), list(makeSymbol("QUOTE"), makeSymbol("VERBOSE")))));



    public static final SubLList $list10 = list(makeSymbol(">="), makeSymbol("VERBOSE-THREAD-LEVEL"), makeSymbol("VERBOSE-MSG-LEVEL"));

    public static final SubLSymbol SHOP_PLAN_STATE = makeSymbol("SHOP-PLAN-STATE");

    public static final SubLList $list12 = list(list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("EXPAND"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("APPLY-METHOD"), list(makeSymbol("TASK"), makeSymbol("METHOD")), makeKeyword("PRIVATE")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("APPLY-OPERATOR"), list(makeSymbol("TASK"), makeSymbol("OPERATOR")), makeKeyword("PRIVATE")));





    public static final SubLList $list15 = list(makeSymbol("SHOP-PLAN-STATE"));

    public static final SubLList $list16 = list(new SubLObject[]{ list(makeSymbol("WORLD-STATE"), makeKeyword("INSTANCE"), makeKeyword("PUBLIC")), list(makeSymbol("TASKLIST"), makeKeyword("INSTANCE"), makeKeyword("PUBLIC")), list(makeSymbol("MBINDINGS"), makeKeyword("INSTANCE"), makeKeyword("PUBLIC")), list(makeSymbol("TASK-STRUCS"), makeKeyword("INSTANCE"), makeKeyword("PUBLIC")), list(makeSymbol("SUPPORTS"), makeKeyword("INSTANCE"), makeKeyword("PUBLIC")), list(makeSymbol("PARTIAL-PLAN"), makeKeyword("INSTANCE"), makeKeyword("PUBLIC")), list(makeSymbol("POST-ORDERING"), makeKeyword("INSTANCE"), makeKeyword("PUBLIC")), list(makeSymbol("QUERY-PROPERTIES"), makeKeyword("INSTANCE"), makeKeyword("PUBLIC")), list(makeSymbol("DEPTH"), makeKeyword("INSTANCE"), makeKeyword("PUBLIC")), list(makeSymbol("PREVIOUS-STATES"), makeKeyword("INSTANCE"), makeKeyword("PUBLIC")), list(makeSymbol("PLANNER"), makeKeyword("INSTANCE"), makeKeyword("PROTECTED")), list(makeSymbol("LOG"), makeKeyword("INSTANCE"), makeKeyword("PROTECTED")), list(makeSymbol("DOMAIN"), makeKeyword("INSTANCE"), makeKeyword("PROTECTED")), list(makeSymbol("MODEL-MT"), makeKeyword("INSTANCE"), makeKeyword("PROTECTED")), list(makeSymbol("DYNAMIC-PREDICATES"), makeKeyword("INSTANCE"), makeKeyword("PROTECTED")), list(makeSymbol("DEF-CLASS-METHOD"), makeSymbol("APPLICABLE-MULTIBINDING"), list(makeSymbol("MBIND")), makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-PLANNER"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("SET-PLANNER"), list(makeSymbol("P")), makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("INITIALIZE"), NIL, makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("INITIALIZE-PLAN-STATE-WITH-PROBLEM"), list(makeSymbol("PROBLEM"), makeSymbol("PLANNER-THREAD")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("INIT-MODEL-WITH-PROBLEM"), list(makeSymbol("PROBLEM")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("INITIALIZE-MULTIBINDINGS"), NIL, makeKeyword("PRIVATE")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("CREATE-NEXT"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-WORLD-STATE"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("SET-WORLD-STATE"), list(makeSymbol("S")), makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("MULTIBINDINGS"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("SET-MULTIBINDINGS"), list(makeSymbol("MBIND")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("DEPTH"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("SET-DEPTH"), list(makeSymbol("D")), makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-TASKLIST"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("SET-TASKLIST"), list(makeSymbol("TASKS")), makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-PREVIOUS-STATES"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("SET-PREVIOUS-STATES"), list(makeSymbol("TASKS")), makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("ADD-TO-PREVIOUS-STATES"), list(makeSymbol("STATE")), makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("ADD-TO-MBINDINGS"), list(makeSymbol("BINDING")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-PARTIAL-PLAN"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("SET-PARTIAL-PLAN"), list(makeSymbol("P")), makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("ADD-TO-POST-ORDERING"), list(T), makeKeyword("PRIVATE")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("EXPAND-COMPLEX"), list(makeSymbol("TASK")), makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("EXPAND-PRIMITIVE"), list(makeSymbol("TASK")), makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("EXPAND-PRIMITIVE-PRECONDITIONS"), list(makeSymbol("TASK")), makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("FIND-MBINDINGS"), list(makeSymbol("GOALS"), makeSymbol("MBINDING")), makeKeyword("PRIVATE")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("SEEK-TOTAL-MBINDINGS"), list(makeSymbol("GOALS"), makeSymbol("MBIND")), makeKeyword("PRIVATE")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("APPLY-CONDITIONAL-OPERATOR"), list(makeSymbol("TASK"), makeSymbol("OPERATOR")), makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("APPLY-OPERATOR"), list(makeSymbol("TASK"), makeSymbol("OPERATOR")), makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("APPLY-OPERATORS"), list(makeSymbol("TASK"), makeSymbol("OPERATORS"), makeSymbol("COND-OPERATORS")), makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("PARENT-TASK?"), list(makeSymbol("TASK")), makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("COPY"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("APPLY-SUFFICIENT-CONDITION"), list(makeSymbol("TASK"), makeSymbol("SCOND")), makeKeyword("PRIVATE")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("APPLY-ALL-SUFFICIENT-CONDITIONS"), list(makeSymbol("TASK")), makeKeyword("PRIVATE")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("APPLY-ALL-METHODS"), list(makeSymbol("TASK")), makeKeyword("PRIVATE")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("APPLY-ALL-PRECONDITIONS"), list(makeSymbol("TASK")), makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("APPLY-PRECONDITION"), list(makeSymbol("TASK"), makeSymbol("PRECOND")), makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-WHICH-PLANS"), NIL, makeKeyword("PUBLIC")) });

    public static final SubLSymbol DYNAMIC_PREDICATES = makeSymbol("DYNAMIC-PREDICATES");

    public static final SubLSymbol MODEL_MT = makeSymbol("MODEL-MT");









    public static final SubLSymbol SUBLOOP_RESERVED_INITIALIZE_SHOP_BASIC_PLAN_STATE_CLASS = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-SHOP-BASIC-PLAN-STATE-CLASS");























    public static final SubLSymbol PREVIOUS_STATES = makeSymbol("PREVIOUS-STATES");

    public static final SubLSymbol SUBLOOP_RESERVED_INITIALIZE_SHOP_BASIC_PLAN_STATE_INSTANCE = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-SHOP-BASIC-PLAN-STATE-INSTANCE");

    public static final SubLSymbol APPLICABLE_MULTIBINDING = makeSymbol("APPLICABLE-MULTIBINDING");

    public static final SubLList $list38 = list(makeKeyword("PROTECTED"));

    public static final SubLList $list39 = list(makeSymbol("MBIND"));

    public static final SubLList $list40 = list(makeString("@param MBIND multibinding-p\n   @return multibinding-p ;; MBIND that is possibly reduced to only functional bindings."), list(makeSymbol("PIF"), makeSymbol("*SHOP-USE-MULTIBINDINGS?*"), list(makeSymbol("RET"), list(makeSymbol("COPY-LIST"), list(makeSymbol("MB-SIMPLE-BINDING"), makeSymbol("MBIND")))), list(makeSymbol("RET"), makeSymbol("MBIND"))));

    public static final SubLSymbol SHOP_BASIC_PLAN_STATE_APPLICABLE_MULTIBINDING_METHOD = makeSymbol("SHOP-BASIC-PLAN-STATE-APPLICABLE-MULTIBINDING-METHOD");

    public static final SubLSymbol SET_TASKLIST = makeSymbol("SET-TASKLIST");

    public static final SubLList $list43 = list(makeSymbol("TASKS"));

    public static final SubLList $list44 = list(list(makeSymbol("CHECK-TYPE"), makeSymbol("TASKS"), makeSymbol("LISTP")), list(makeSymbol("CSETQ"), makeSymbol("TASKLIST"), makeSymbol("TASKS")), list(makeSymbol("RET"), makeSymbol("TASKS")));

    public static final SubLSymbol $sym45$OUTER_CATCH_FOR_SHOP_BASIC_PLAN_STATE_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-SHOP-BASIC-PLAN-STATE-METHOD");



    public static final SubLSymbol SHOP_BASIC_PLAN_STATE_SET_TASKLIST_METHOD = makeSymbol("SHOP-BASIC-PLAN-STATE-SET-TASKLIST-METHOD");

    public static final SubLSymbol GET_TASKLIST = makeSymbol("GET-TASKLIST");

    public static final SubLList $list49 = list(makeKeyword("PUBLIC"));

    public static final SubLList $list50 = list(list(makeSymbol("RET"), makeSymbol("TASKLIST")));

    public static final SubLSymbol $sym51$OUTER_CATCH_FOR_SHOP_BASIC_PLAN_STATE_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-SHOP-BASIC-PLAN-STATE-METHOD");

    public static final SubLSymbol SHOP_BASIC_PLAN_STATE_GET_TASKLIST_METHOD = makeSymbol("SHOP-BASIC-PLAN-STATE-GET-TASKLIST-METHOD");

    public static final SubLSymbol ADD_DECOMPOSITION = makeSymbol("ADD-DECOMPOSITION");

    public static final SubLList $list54 = list(makeKeyword("PRIVATE"));

    public static final SubLList $list55 = list(makeSymbol("TASK"), makeSymbol("DECOMPOSITION"));

    public static final SubLList $list56 = list(makeString("Replaces first element of slot TASKLIST with DECOMPOSITION, and a SUPERTASK \n   (for the plan tree post-order) of TASK. The SUPERTASK signals to the bookkeeping code\n   that a complete branch of the tree has been planned, and we can now plan other\n   branches."), list(makeSymbol("CSETQ"), makeSymbol("TASKLIST"), list(makeSymbol("APPEND"), makeSymbol("DECOMPOSITION"), list(makeSymbol("BQ-LIST"), list(makeSymbol("BQ-LIST"), makeKeyword("SUPERTASK"), makeSymbol("TASK"))), makeSymbol("TASKLIST"))), list(makeSymbol("RET"), makeSymbol("TASKLIST")));

    public static final SubLSymbol $sym57$OUTER_CATCH_FOR_SHOP_BASIC_PLAN_STATE_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-SHOP-BASIC-PLAN-STATE-METHOD");



    public static final SubLSymbol SHOP_BASIC_PLAN_STATE_ADD_DECOMPOSITION_METHOD = makeSymbol("SHOP-BASIC-PLAN-STATE-ADD-DECOMPOSITION-METHOD");

    public static final SubLSymbol SET_MULTIBINDINGS = makeSymbol("SET-MULTIBINDINGS");

    public static final SubLList $list61 = list(makeSymbol("MBINDING"));

    public static final SubLList $list62 = list(list(makeSymbol("CSETQ"), makeSymbol("MBINDINGS"), makeSymbol("MBINDING")), list(makeSymbol("RET"), makeSymbol("MBINDINGS")));

    public static final SubLSymbol $sym63$OUTER_CATCH_FOR_SHOP_BASIC_PLAN_STATE_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-SHOP-BASIC-PLAN-STATE-METHOD");

    public static final SubLSymbol SHOP_BASIC_PLAN_STATE_SET_MULTIBINDINGS_METHOD = makeSymbol("SHOP-BASIC-PLAN-STATE-SET-MULTIBINDINGS-METHOD");

    public static final SubLSymbol MULTIBINDINGS = makeSymbol("MULTIBINDINGS");

    public static final SubLList $list66 = list(list(makeSymbol("RET"), makeSymbol("MBINDINGS")));

    public static final SubLSymbol $sym67$OUTER_CATCH_FOR_SHOP_BASIC_PLAN_STATE_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-SHOP-BASIC-PLAN-STATE-METHOD");

    public static final SubLSymbol SHOP_BASIC_PLAN_STATE_MULTIBINDINGS_METHOD = makeSymbol("SHOP-BASIC-PLAN-STATE-MULTIBINDINGS-METHOD");

    public static final SubLSymbol SET_DOMAIN = makeSymbol("SET-DOMAIN");

    public static final SubLList $list70 = list(makeSymbol("NEW-DOMAIN"));

    public static final SubLList $list71 = list(list(makeSymbol("CSETQ"), makeSymbol("DOMAIN"), makeSymbol("NEW-DOMAIN")), list(makeSymbol("RET"), makeSymbol("DOMAIN")));

    public static final SubLSymbol $sym72$OUTER_CATCH_FOR_SHOP_BASIC_PLAN_STATE_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-SHOP-BASIC-PLAN-STATE-METHOD");

    public static final SubLSymbol SHOP_BASIC_PLAN_STATE_SET_DOMAIN_METHOD = makeSymbol("SHOP-BASIC-PLAN-STATE-SET-DOMAIN-METHOD");



    public static final SubLList $list75 = list(list(makeSymbol("RET"), makeSymbol("DOMAIN")));

    public static final SubLSymbol $sym76$OUTER_CATCH_FOR_SHOP_BASIC_PLAN_STATE_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-SHOP-BASIC-PLAN-STATE-METHOD");

    public static final SubLSymbol SHOP_BASIC_PLAN_STATE_GET_DOMAIN_METHOD = makeSymbol("SHOP-BASIC-PLAN-STATE-GET-DOMAIN-METHOD");

    public static final SubLSymbol SUPPORT_LISTS = makeSymbol("SUPPORT-LISTS");

    public static final SubLList $list79 = list(list(makeSymbol("RET"), makeSymbol("SUPPORTS")));

    public static final SubLSymbol $sym80$OUTER_CATCH_FOR_SHOP_BASIC_PLAN_STATE_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-SHOP-BASIC-PLAN-STATE-METHOD");

    public static final SubLSymbol SHOP_BASIC_PLAN_STATE_SUPPORT_LISTS_METHOD = makeSymbol("SHOP-BASIC-PLAN-STATE-SUPPORT-LISTS-METHOD");

    public static final SubLSymbol ADD_TO_SUPPORT_LISTS = makeSymbol("ADD-TO-SUPPORT-LISTS");

    public static final SubLList $list83 = list(makeSymbol("PRECOND"));

    public static final SubLList $list84 = list(list(makeSymbol("CPUSH"), makeSymbol("PRECOND"), makeSymbol("SUPPORTS")), list(makeSymbol("RET"), makeSymbol("SUPPORTS")));

    public static final SubLSymbol $sym85$OUTER_CATCH_FOR_SHOP_BASIC_PLAN_STATE_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-SHOP-BASIC-PLAN-STATE-METHOD");

    public static final SubLSymbol SHOP_BASIC_PLAN_STATE_ADD_TO_SUPPORT_LISTS_METHOD = makeSymbol("SHOP-BASIC-PLAN-STATE-ADD-TO-SUPPORT-LISTS-METHOD");



    public static final SubLList $list88 = list(list(makeSymbol("INITIALIZE"), makeSymbol("SUPER")), list(makeSymbol("CSETQ"), makeSymbol("SUPPORTS"), NIL), list(makeSymbol("CSETQ"), makeSymbol("MBINDINGS"), NIL), list(makeSymbol("CSETQ"), makeSymbol("POST-ORDERING"), NIL), list(makeSymbol("CSETQ"), makeSymbol("TASK-STRUCS"), NIL), list(makeSymbol("CSETQ"), makeSymbol("DEPTH"), ZERO_INTEGER), list(makeSymbol("RET"), makeSymbol("SELF")));

    public static final SubLSymbol $sym89$OUTER_CATCH_FOR_SHOP_BASIC_PLAN_STATE_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-SHOP-BASIC-PLAN-STATE-METHOD");

    public static final SubLSymbol SHOP_BASIC_PLAN_STATE_INITIALIZE_METHOD = makeSymbol("SHOP-BASIC-PLAN-STATE-INITIALIZE-METHOD");

    public static final SubLSymbol INITIALIZE_PLAN_STATE_WITH_PROBLEM = makeSymbol("INITIALIZE-PLAN-STATE-WITH-PROBLEM");

    public static final SubLList $list92 = list(makeKeyword("NO-MEMBER-VARIABLES"), makeKeyword("PUBLIC"));

    public static final SubLList $list93 = list(makeSymbol("PROBLEM"), makeSymbol("PLANNER-THREAD"));

    public static final SubLList $list94 = list(makeString("@param PROBLEM         shop-basic-problem-p\n   @param PLANNER-THREAD  shop-basic-planner-thread-p\n   @return nil"), list(new SubLObject[]{ makeSymbol("CLET"), list(list(makeSymbol("NEW-TASKS"), list(makeSymbol("INLINE-METHOD"), list(makeSymbol("GET-TASKS"), makeSymbol("SHOP-BASIC-PROBLEM")), makeSymbol("PROBLEM"))), list(makeSymbol("NEW-WORLD-STATE"), list(makeSymbol("INLINE-METHOD"), list(makeSymbol("GET-STATE"), makeSymbol("SHOP-BASIC-PROBLEM")), makeSymbol("PROBLEM")))), list(makeSymbol("CSETQ"), makeSymbol("NEW-TASKS"), list(makeSymbol("INLINE-METHOD"), list(makeSymbol("REPLACE-VARIABLES"), makeSymbol("SHOP-VARIABLE-MANAGER")), list(makeSymbol("GET-SLOT"), makeSymbol("PLANNER-THREAD"), list(makeSymbol("QUOTE"), makeSymbol("VAR-MANAGER"))), makeSymbol("NEW-TASKS"), list(makeSymbol("EMPTY-MB")))), list(makeSymbol("SET-DOMAIN"), makeSymbol("SELF"), list(makeSymbol("GET-SLOT"), makeSymbol("PROBLEM"), list(makeSymbol("QUOTE"), makeSymbol("DOMAIN")))), list(makeSymbol("SET-TASKLIST"), makeSymbol("SELF"), makeSymbol("NEW-TASKS")), list(makeSymbol("SET-WORLD-STATE"), makeSymbol("SELF"), makeSymbol("NEW-WORLD-STATE")), list(makeSymbol("SET-SLOT"), makeSymbol("SELF"), list(makeSymbol("QUOTE"), makeSymbol("LOG")), list(makeSymbol("GET-SLOT"), makeSymbol("PLANNER-THREAD"), list(makeSymbol("QUOTE"), makeSymbol("LOG")))), list(makeSymbol("SET-PLANNER"), makeSymbol("SELF"), makeSymbol("PLANNER-THREAD")), list(makeSymbol("INIT-MODEL-WITH-PROBLEM"), makeSymbol("SELF"), makeSymbol("PROBLEM")), list(makeSymbol("INITIALIZE-MULTIBINDINGS"), makeSymbol("SELF")), list(makeSymbol("SET-SLOT"), makeSymbol("SELF"), list(makeSymbol("QUOTE"), makeSymbol("QUERY-PROPERTIES")), list(makeSymbol("SHOP-QUERY-PROPERTIES"), list(makeSymbol("GET-SLOT"), list(makeSymbol("GET-SLOT"), makeSymbol("SELF"), list(makeSymbol("QUOTE"), makeSymbol("PLANNER"))), list(makeSymbol("QUOTE"), makeSymbol("TIME-CUTOFF"))), list(makeSymbol("GET-SLOT"), list(makeSymbol("GET-SLOT"), makeSymbol("SELF"), list(makeSymbol("QUOTE"), makeSymbol("PLANNER"))), list(makeSymbol("QUOTE"), makeSymbol("NUM-BACKCHAINS"))))), list(makeSymbol("RET"), makeSymbol("SELF")) }));







    public static final SubLSymbol SHOP_BASIC_PLAN_STATE_INITIALIZE_PLAN_STATE_WITH_PROBLEM_METHOD = makeSymbol("SHOP-BASIC-PLAN-STATE-INITIALIZE-PLAN-STATE-WITH-PROBLEM-METHOD");

    public static final SubLSymbol INITIALIZE_MULTIBINDINGS = makeSymbol("INITIALIZE-MULTIBINDINGS");

    public static final SubLList $list100 = list(makeKeyword("NO-MEMBER-VARIABLES"), makeKeyword("PRIVATE"));

    public static final SubLList $list101 = list(list(makeSymbol("CLET"), list(list(makeSymbol("TASKLIST"), list(makeSymbol("GET-TASKLIST"), makeSymbol("SELF"))), list(makeSymbol("MBINDING"), NIL), list(makeSymbol("MT"), list(makeSymbol("GET-SLOT"), makeSymbol("SELF"), list(makeSymbol("QUOTE"), makeSymbol("MODEL-MT"))))), list(makeSymbol("PIF"), list(makeSymbol("GROUND?"), makeSymbol("TASKLIST")), list(makeSymbol("CSETQ"), makeSymbol("MBINDING"), list(makeSymbol("EMPTY-MB"))), list(makeSymbol("PIF"), list(makeSymbol("SINGLETON?"), makeSymbol("TASKLIST")), list(makeSymbol("CSETQ"), makeSymbol("MBINDING"), list(makeSymbol("SHOP-INITIAL-MULTIBINDING-FOR-TASK"), list(makeSymbol("FIRST"), makeSymbol("TASKLIST")), makeSymbol("MT"))), list(makeSymbol("WARN"), makeString("INITIALIZE-MULTIBINGINGS: Initial Tasklist contains more than one task.")))), list(makeSymbol("SET-MULTIBINDINGS"), makeSymbol("SELF"), makeSymbol("MBINDING")), list(makeSymbol("RET"), makeSymbol("MBINDING"))));

    public static final SubLString $str102$INITIALIZE_MULTIBINGINGS__Initial = makeString("INITIALIZE-MULTIBINGINGS: Initial Tasklist contains more than one task.");

    public static final SubLSymbol SHOP_BASIC_PLAN_STATE_INITIALIZE_MULTIBINDINGS_METHOD = makeSymbol("SHOP-BASIC-PLAN-STATE-INITIALIZE-MULTIBINDINGS-METHOD");



    public static final SubLList $list105 = list(makeSymbol("STRING"));

    public static final SubLList $list106 = list(list(makeSymbol("RET"), list(makeSymbol("INLINE-METHOD"), list(makeSymbol("LOG-ENTRY"), makeSymbol("SHOP-LOG")), makeSymbol("LOG"), makeSymbol("STRING"))));

    public static final SubLSymbol $sym107$OUTER_CATCH_FOR_SHOP_BASIC_PLAN_STATE_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-SHOP-BASIC-PLAN-STATE-METHOD");

    public static final SubLSymbol SHOP_BASIC_PLAN_STATE_OUTPUT_MESSAGE_METHOD = makeSymbol("SHOP-BASIC-PLAN-STATE-OUTPUT-MESSAGE-METHOD");



    public static final SubLList $list110 = list(list(makeSymbol("CLET"), list(list(makeSymbol("NEW-PLAN-STATE"), list(makeSymbol("INLINE-METHOD"), list(makeSymbol("NEW"), makeSymbol("SHOP-BASIC-PLAN-STATE")), list(makeSymbol("QUOTE"), makeSymbol("SHOP-BASIC-PLAN-STATE")))), list(makeSymbol("OBJECT-SLOTS"), list(makeSymbol("CLASSES-ALL-SLOTS"), list(makeSymbol("QUOTE"), makeSymbol("OBJECT")))), list(makeSymbol("SLOT-LIST"), list(makeSymbol("SET-DIFFERENCE"), list(makeSymbol("CLASSES-ALL-SLOTS"), list(makeSymbol("INSTANCE-CLASS"), makeSymbol("SELF"))), makeSymbol("OBJECT-SLOTS")))), list(makeSymbol("CDOLIST"), list(makeSymbol("CUR-SLOT"), makeSymbol("SLOT-LIST")), list(makeSymbol("SET-SLOT"), makeSymbol("NEW-PLAN-STATE"), makeSymbol("CUR-SLOT"), list(makeSymbol("GET-SLOT"), makeSymbol("SELF"), makeSymbol("CUR-SLOT")))), list(makeSymbol("RET"), makeSymbol("NEW-PLAN-STATE"))));

    public static final SubLSymbol SHOP_BASIC_PLAN_STATE_COPY_METHOD = makeSymbol("SHOP-BASIC-PLAN-STATE-COPY-METHOD");

    public static final SubLSymbol CREATE_NEXT = makeSymbol("CREATE-NEXT");

    public static final SubLList $list113 = list(list(makeSymbol("CLET"), list(list(makeSymbol("NEW-STATE"), list(makeSymbol("COPY"), makeSymbol("SELF")))), list(makeSymbol("INLINE-METHOD"), list(makeSymbol("SET-TASKLIST"), makeSymbol("SHOP-BASIC-PLAN-STATE")), makeSymbol("NEW-STATE"), list(makeSymbol("REST"), makeSymbol("TASKLIST"))), list(makeSymbol("INLINE-METHOD"), list(makeSymbol("SET-DEPTH"), makeSymbol("SHOP-BASIC-PLAN-STATE")), makeSymbol("NEW-STATE"), list(makeSymbol("1+"), makeSymbol("DEPTH"))), list(makeSymbol("RET"), makeSymbol("NEW-STATE"))));

    public static final SubLSymbol $sym114$OUTER_CATCH_FOR_SHOP_BASIC_PLAN_STATE_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-SHOP-BASIC-PLAN-STATE-METHOD");

    public static final SubLSymbol SHOP_BASIC_PLAN_STATE_CREATE_NEXT_METHOD = makeSymbol("SHOP-BASIC-PLAN-STATE-CREATE-NEXT-METHOD");

    public static final SubLSymbol INIT_MODEL_WITH_PROBLEM = makeSymbol("INIT-MODEL-WITH-PROBLEM");

    public static final SubLList $list117 = list(makeSymbol("PROBLEM"));

    public static final SubLList $list118 = list(makeString("@param PROBLEM shop-basic-problem-p\n   @return nil"), list(makeSymbol("CLET"), list(list(makeSymbol("TASK-MT"), list(makeSymbol("GET-SLOT"), makeSymbol("PROBLEM"), list(makeSymbol("QUOTE"), makeSymbol("TASK-MT"))))), list(makeSymbol("SET-SLOT"), makeSymbol("SELF"), list(makeSymbol("QUOTE"), makeSymbol("MODEL-MT")), makeSymbol("TASK-MT")), list(makeSymbol("RET"), NIL)));



    public static final SubLSymbol SHOP_BASIC_PLAN_STATE_INIT_MODEL_WITH_PROBLEM_METHOD = makeSymbol("SHOP-BASIC-PLAN-STATE-INIT-MODEL-WITH-PROBLEM-METHOD");

    public static final SubLSymbol SET_WORLD_STATE = makeSymbol("SET-WORLD-STATE");

    public static final SubLList $list122 = list(makeSymbol("S"));

    public static final SubLList $list123 = list(list(makeSymbol("MUST"), list(makeSymbol("SHOP-WORLD-STATE-P"), makeSymbol("S")), makeString("(SET-WORLD-STATE ~s): ~S is not a valid SHOP-WORLD-STATE-P."), makeSymbol("SELF"), makeSymbol("S")), list(makeSymbol("CSETQ"), makeSymbol("WORLD-STATE"), makeSymbol("S")), list(makeSymbol("RET"), makeSymbol("S")));

    public static final SubLSymbol $sym124$OUTER_CATCH_FOR_SHOP_BASIC_PLAN_STATE_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-SHOP-BASIC-PLAN-STATE-METHOD");

    public static final SubLString $str125$_SET_WORLD_STATE__s____S_is_not_a = makeString("(SET-WORLD-STATE ~s): ~S is not a valid SHOP-WORLD-STATE-P.");

    public static final SubLSymbol SHOP_BASIC_PLAN_STATE_SET_WORLD_STATE_METHOD = makeSymbol("SHOP-BASIC-PLAN-STATE-SET-WORLD-STATE-METHOD");

    public static final SubLSymbol GET_WORLD_STATE = makeSymbol("GET-WORLD-STATE");

    public static final SubLList $list128 = list(list(makeSymbol("RET"), makeSymbol("WORLD-STATE")));

    public static final SubLSymbol $sym129$OUTER_CATCH_FOR_SHOP_BASIC_PLAN_STATE_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-SHOP-BASIC-PLAN-STATE-METHOD");

    public static final SubLSymbol SHOP_BASIC_PLAN_STATE_GET_WORLD_STATE_METHOD = makeSymbol("SHOP-BASIC-PLAN-STATE-GET-WORLD-STATE-METHOD");



    public static final SubLSymbol $sym132$OUTER_CATCH_FOR_SHOP_BASIC_PLAN_STATE_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-SHOP-BASIC-PLAN-STATE-METHOD");

    public static final SubLSymbol SHOP_BASIC_PLAN_STATE_MBINDING_METHOD = makeSymbol("SHOP-BASIC-PLAN-STATE-MBINDING-METHOD");

    public static final SubLSymbol SET_DEPTH = makeSymbol("SET-DEPTH");

    public static final SubLList $list135 = list(makeSymbol("D"));

    public static final SubLList $list136 = list(list(makeSymbol("CHECK-TYPE"), makeSymbol("D"), makeSymbol("INTEGERP")), list(makeSymbol("CSETQ"), makeSymbol("DEPTH"), makeSymbol("D")), list(makeSymbol("RET"), makeSymbol("D")));

    public static final SubLSymbol $sym137$OUTER_CATCH_FOR_SHOP_BASIC_PLAN_STATE_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-SHOP-BASIC-PLAN-STATE-METHOD");



    public static final SubLSymbol SHOP_BASIC_PLAN_STATE_SET_DEPTH_METHOD = makeSymbol("SHOP-BASIC-PLAN-STATE-SET-DEPTH-METHOD");

    public static final SubLList $list140 = list(list(makeSymbol("RET"), makeSymbol("DEPTH")));

    public static final SubLSymbol $sym141$OUTER_CATCH_FOR_SHOP_BASIC_PLAN_STATE_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-SHOP-BASIC-PLAN-STATE-METHOD");

    public static final SubLSymbol SHOP_BASIC_PLAN_STATE_DEPTH_METHOD = makeSymbol("SHOP-BASIC-PLAN-STATE-DEPTH-METHOD");

    public static final SubLSymbol SET_PREVIOUS_STATES = makeSymbol("SET-PREVIOUS-STATES");

    public static final SubLList $list144 = list(makeSymbol("STATES"));

    public static final SubLList $list145 = list(list(makeSymbol("CSETQ"), makeSymbol("PREVIOUS-STATES"), makeSymbol("STATES")), list(makeSymbol("RET"), makeSymbol("STATES")));

    public static final SubLSymbol $sym146$OUTER_CATCH_FOR_SHOP_BASIC_PLAN_STATE_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-SHOP-BASIC-PLAN-STATE-METHOD");

    public static final SubLSymbol SHOP_BASIC_PLAN_STATE_SET_PREVIOUS_STATES_METHOD = makeSymbol("SHOP-BASIC-PLAN-STATE-SET-PREVIOUS-STATES-METHOD");

    public static final SubLSymbol GET_PREVIOUS_STATES = makeSymbol("GET-PREVIOUS-STATES");

    public static final SubLList $list149 = list(list(makeSymbol("RET"), makeSymbol("PREVIOUS-STATES")));

    public static final SubLSymbol $sym150$OUTER_CATCH_FOR_SHOP_BASIC_PLAN_STATE_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-SHOP-BASIC-PLAN-STATE-METHOD");

    public static final SubLSymbol SHOP_BASIC_PLAN_STATE_GET_PREVIOUS_STATES_METHOD = makeSymbol("SHOP-BASIC-PLAN-STATE-GET-PREVIOUS-STATES-METHOD");

    public static final SubLSymbol ADD_TO_PREVIOUS_STATES = makeSymbol("ADD-TO-PREVIOUS-STATES");

    public static final SubLList $list153 = list(makeSymbol("STATE"));

    public static final SubLList $list154 = list(list(makeSymbol("CPUSH"), makeSymbol("STATE"), makeSymbol("PREVIOUS-STATES")), list(makeSymbol("RET"), makeSymbol("PREVIOUS-STATES")));

    public static final SubLSymbol $sym155$OUTER_CATCH_FOR_SHOP_BASIC_PLAN_STATE_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-SHOP-BASIC-PLAN-STATE-METHOD");

    public static final SubLSymbol SHOP_BASIC_PLAN_STATE_ADD_TO_PREVIOUS_STATES_METHOD = makeSymbol("SHOP-BASIC-PLAN-STATE-ADD-TO-PREVIOUS-STATES-METHOD");

    public static final SubLSymbol SET_PARTIAL_PLAN = makeSymbol("SET-PARTIAL-PLAN");

    public static final SubLList $list158 = list(makeSymbol("P"));

    public static final SubLList $list159 = list(list(makeSymbol("CSETQ"), makeSymbol("PARTIAL-PLAN"), makeSymbol("P")), list(makeSymbol("RET"), makeSymbol("P")));

    public static final SubLSymbol $sym160$OUTER_CATCH_FOR_SHOP_BASIC_PLAN_STATE_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-SHOP-BASIC-PLAN-STATE-METHOD");

    public static final SubLSymbol SHOP_BASIC_PLAN_STATE_SET_PARTIAL_PLAN_METHOD = makeSymbol("SHOP-BASIC-PLAN-STATE-SET-PARTIAL-PLAN-METHOD");

    public static final SubLSymbol GET_PARTIAL_PLAN = makeSymbol("GET-PARTIAL-PLAN");

    public static final SubLList $list163 = list(list(makeSymbol("RET"), makeSymbol("PARTIAL-PLAN")));

    public static final SubLSymbol $sym164$OUTER_CATCH_FOR_SHOP_BASIC_PLAN_STATE_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-SHOP-BASIC-PLAN-STATE-METHOD");

    public static final SubLSymbol SHOP_BASIC_PLAN_STATE_GET_PARTIAL_PLAN_METHOD = makeSymbol("SHOP-BASIC-PLAN-STATE-GET-PARTIAL-PLAN-METHOD");

    public static final SubLSymbol ADD_TO_PARTIAL_PLAN = makeSymbol("ADD-TO-PARTIAL-PLAN");

    public static final SubLList $list167 = list(makeSymbol("TASK"));

    public static final SubLList $list168 = list(list(makeSymbol("CPUSH"), makeSymbol("TASK"), makeSymbol("PARTIAL-PLAN")), list(makeSymbol("RET"), makeSymbol("PARTIAL-PLAN")));

    public static final SubLSymbol $sym169$OUTER_CATCH_FOR_SHOP_BASIC_PLAN_STATE_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-SHOP-BASIC-PLAN-STATE-METHOD");

    public static final SubLSymbol SHOP_BASIC_PLAN_STATE_ADD_TO_PARTIAL_PLAN_METHOD = makeSymbol("SHOP-BASIC-PLAN-STATE-ADD-TO-PARTIAL-PLAN-METHOD");

    public static final SubLSymbol ADD_TO_POST_ORDERING = makeSymbol("ADD-TO-POST-ORDERING");

    public static final SubLList $list172 = list(list(makeSymbol("CPUSH"), makeSymbol("TASK"), makeSymbol("POST-ORDERING")), list(makeSymbol("RET"), makeSymbol("POST-ORDERING")));

    public static final SubLSymbol $sym173$OUTER_CATCH_FOR_SHOP_BASIC_PLAN_STATE_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-SHOP-BASIC-PLAN-STATE-METHOD");

    public static final SubLSymbol SHOP_BASIC_PLAN_STATE_ADD_TO_POST_ORDERING_METHOD = makeSymbol("SHOP-BASIC-PLAN-STATE-ADD-TO-POST-ORDERING-METHOD");

    public static final SubLSymbol ADD_TO_MBINDINGS = makeSymbol("ADD-TO-MBINDINGS");

    public static final SubLList $list176 = list(makeSymbol("BINDING"));

    public static final SubLList $list177 = list(list(makeSymbol("CSETQ"), makeSymbol("MBINDINGS"), list(makeSymbol("COMPOSE-MULTIBINDINGS"), makeSymbol("BINDING"), makeSymbol("MBINDINGS"))), list(makeSymbol("RET"), makeSymbol("MBINDINGS")));

    public static final SubLSymbol $sym178$OUTER_CATCH_FOR_SHOP_BASIC_PLAN_STATE_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-SHOP-BASIC-PLAN-STATE-METHOD");

    public static final SubLSymbol SHOP_BASIC_PLAN_STATE_ADD_TO_MBINDINGS_METHOD = makeSymbol("SHOP-BASIC-PLAN-STATE-ADD-TO-MBINDINGS-METHOD");



    public static final SubLList $list181 = list(list(makeSymbol("RET"), makeSymbol("TASK-STRUCS")));

    public static final SubLSymbol $sym182$OUTER_CATCH_FOR_SHOP_BASIC_PLAN_STATE_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-SHOP-BASIC-PLAN-STATE-METHOD");

    public static final SubLSymbol SHOP_BASIC_PLAN_STATE_PLANNER_RULES_METHOD = makeSymbol("SHOP-BASIC-PLAN-STATE-PLANNER-RULES-METHOD");

    public static final SubLSymbol ADD_TO_TASK_STRUCS = makeSymbol("ADD-TO-TASK-STRUCS");

    public static final SubLList $list185 = list(makeSymbol("TASK-STRUC"));

    public static final SubLList $list186 = list(list(makeSymbol("CPUSH"), makeSymbol("TASK-STRUC"), makeSymbol("TASK-STRUCS")), list(makeSymbol("RET"), makeSymbol("TASK-STRUCS")));

    public static final SubLSymbol $sym187$OUTER_CATCH_FOR_SHOP_BASIC_PLAN_STATE_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-SHOP-BASIC-PLAN-STATE-METHOD");

    public static final SubLSymbol SHOP_BASIC_PLAN_STATE_ADD_TO_TASK_STRUCS_METHOD = makeSymbol("SHOP-BASIC-PLAN-STATE-ADD-TO-TASK-STRUCS-METHOD");

    public static final SubLSymbol $sym189$OUTER_CATCH_FOR_SHOP_BASIC_PLAN_STATE_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-SHOP-BASIC-PLAN-STATE-METHOD");

    public static final SubLSymbol SHOP_BASIC_PLAN_STATE_TASK_STRUCS_METHOD = makeSymbol("SHOP-BASIC-PLAN-STATE-TASK-STRUCS-METHOD");

    public static final SubLSymbol GET_PLANNER = makeSymbol("GET-PLANNER");

    public static final SubLList $list192 = list(list(makeSymbol("RET"), makeSymbol("PLANNER")));

    public static final SubLSymbol $sym193$OUTER_CATCH_FOR_SHOP_BASIC_PLAN_STATE_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-SHOP-BASIC-PLAN-STATE-METHOD");

    public static final SubLSymbol SHOP_BASIC_PLAN_STATE_GET_PLANNER_METHOD = makeSymbol("SHOP-BASIC-PLAN-STATE-GET-PLANNER-METHOD");

    public static final SubLSymbol SET_PLANNER = makeSymbol("SET-PLANNER");

    public static final SubLList $list196 = list(list(makeSymbol("CSETQ"), makeSymbol("PLANNER"), makeSymbol("P")), list(makeSymbol("RET"), makeSymbol("P")));

    public static final SubLSymbol $sym197$OUTER_CATCH_FOR_SHOP_BASIC_PLAN_STATE_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-SHOP-BASIC-PLAN-STATE-METHOD");

    public static final SubLSymbol SHOP_BASIC_PLAN_STATE_SET_PLANNER_METHOD = makeSymbol("SHOP-BASIC-PLAN-STATE-SET-PLANNER-METHOD");

    public static final SubLSymbol GET_WHICH_PLANS = makeSymbol("GET-WHICH-PLANS");

    public static final SubLList $list200 = list(list(makeSymbol("MUST"), makeSymbol("PLANNER"), makeString("(GET-WHICH-PLANS ~S): No planner associated with this plan-state."), makeSymbol("SELF")), list(makeSymbol("RET"), list(makeSymbol("INLINE-METHOD"), list(makeSymbol("GET-WHICH-PLANS"), makeSymbol("SHOP-BASIC-PLANNER-THREAD")), makeSymbol("PLANNER"))));

    public static final SubLSymbol $sym201$OUTER_CATCH_FOR_SHOP_BASIC_PLAN_STATE_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-SHOP-BASIC-PLAN-STATE-METHOD");

    public static final SubLString $str202$_GET_WHICH_PLANS__S___No_planner_ = makeString("(GET-WHICH-PLANS ~S): No planner associated with this plan-state.");

    public static final SubLSymbol SHOP_BASIC_PLAN_STATE_GET_WHICH_PLANS_METHOD = makeSymbol("SHOP-BASIC-PLAN-STATE-GET-WHICH-PLANS-METHOD");

    public static final SubLSymbol $sym204$SIMPLE_SITUATION_PRED_ = makeSymbol("SIMPLE-SITUATION-PRED?");

    public static final SubLList $list205 = list(makeSymbol("PRED"));

    public static final SubLList $list206 = list(list(makeSymbol("CLET"), list(list(makeSymbol("PRED-SET"), list(makeSymbol("GET-SLOT"), makeSymbol("DOMAIN"), list(makeSymbol("QUOTE"), makeSymbol("SIMPLE-SITUATION-PREDS"))))), list(makeSymbol("PWHEN"), list(makeSymbol("SET-MEMBER?"), makeSymbol("PRED"), makeSymbol("PRED-SET")), list(makeSymbol("RET"), T)), list(makeSymbol("PWHEN"), list(makeSymbol("ISA?"), makeSymbol("PRED"), reader_make_constant_shell(makeString("SimpleSituationPredicate")), makeSymbol("MODEL-MT")), list(makeSymbol("SET-ADD"), makeSymbol("PRED"), makeSymbol("PRED-SET")), list(makeSymbol("RET"), T)), list(makeSymbol("RET"), NIL)));

    public static final SubLSymbol $sym207$OUTER_CATCH_FOR_SHOP_BASIC_PLAN_STATE_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-SHOP-BASIC-PLAN-STATE-METHOD");

    public static final SubLSymbol SIMPLE_SITUATION_PREDS = makeSymbol("SIMPLE-SITUATION-PREDS");

    private static final SubLObject $$SimpleSituationPredicate = reader_make_constant_shell(makeString("SimpleSituationPredicate"));

    public static final SubLSymbol $sym210$SHOP_BASIC_PLAN_STATE_SIMPLE_SITUATION_PRED__METHOD = makeSymbol("SHOP-BASIC-PLAN-STATE-SIMPLE-SITUATION-PRED?-METHOD");

    public static final SubLSymbol SEEK_TOTAL_MBINDINGS = makeSymbol("SEEK-TOTAL-MBINDINGS");

    public static final SubLList $list212 = list(makeSymbol("GOALS"), makeSymbol("MBIND"));

    public static final SubLList $list213 = list(makeString("@param GOALS listp\n   @param MBIND multibinding-p\n   @return listp ;; of mulibinding-p"), list(makeSymbol("PWHEN"), list(makeSymbol("NULL"), makeSymbol("GOALS")), list(makeSymbol("RET"), list(makeSymbol("LIST"), makeSymbol("MBIND")))), list(makeSymbol("CLET"), list(list(makeSymbol("BACKCHAIN"), list(makeSymbol("GET-SLOT"), makeSymbol("PLANNER"), list(makeSymbol("QUOTE"), makeSymbol("NUM-BACKCHAINS")))), makeSymbol("BINDINGS"), makeSymbol("MBINDINGS"), makeSymbol("HALT-REASON"), makeSymbol("INFERENCE")), list(makeSymbol("WITHOUT-WFF-SEMANTICS"), list(makeSymbol("CLET"), list(list(makeSymbol("*GENERATE-READABLE-FI-RESULTS*"), NIL), list(makeSymbol("*CHECK-ARITY?*"), T), list(makeSymbol("*CHECK-WFF-CONSTANTS?*"), NIL), list(makeSymbol("*SIMPLIFY-SENTENCE?*"), NIL), list(makeSymbol("*TURN-EXISTENTIALS-INTO-SKOLEMS?*"), NIL), list(makeSymbol("*CANONICALIZE-LITERALS?*"), NIL), list(makeSymbol("*CANONICALIZE-FUNCTIONS?*"), makeSymbol("*SHOP-CANONICALIZE-FUNCTIONS?*"))), list(makeSymbol("PIF"), makeSymbol("*SHOP-USE-MT-WORLD-STATES?*"), list(makeSymbol("CSETQ"), makeSymbol("BINDINGS"), list(makeSymbol("INLINE-METHOD"), list(makeSymbol("ASK"), makeSymbol("SHOP-MT-WORLD-STATE")), makeSymbol("WORLD-STATE"), list(makeSymbol("CONS"), reader_make_constant_shell(makeString("and")), makeSymbol("GOALS")), makeSymbol("MBIND"), makeSymbol("BACKCHAIN"))), list(makeSymbol("PROGN"), list(makeSymbol("WITH-QUERY-PLAN-STATE"), list(makeSymbol("SELF")), list(makeSymbol("PIF"), makeSymbol("*SHOP-USE-SHOP-ASK?*"), list(makeSymbol("CMULTIPLE-VALUE-SETQ"), list(makeSymbol("BINDINGS"), makeSymbol("HALT-REASON"), makeSymbol("INFERENCE")), list(makeSymbol("SHOP-ASK-INT"), list(makeSymbol("CONS"), reader_make_constant_shell(makeString("and")), makeSymbol("GOALS")), makeSymbol("MODEL-MT"), makeSymbol("QUERY-PROPERTIES"))), list(makeSymbol("CMULTIPLE-VALUE-SETQ"), list(makeSymbol("BINDINGS"), makeSymbol("HALT-REASON"), makeSymbol("INFERENCE")), list(makeSymbol("NEW-CYC-QUERY"), list(makeSymbol("CONS"), reader_make_constant_shell(makeString("and")), makeSymbol("GOALS")), makeSymbol("MODEL-MT"), makeSymbol("QUERY-PROPERTIES"))))), list(makeSymbol("CSETQ"), makeSymbol("BINDINGS"), list(makeSymbol("CONFIRM-BINDINGS-AGAINST-WORLD-STATE"), makeSymbol("WORLD-STATE"), makeSymbol("GOALS"), makeSymbol("BINDINGS"))))))), list(makeSymbol("INLINE-METHOD"), list(makeSymbol("ADD-INFERENCE"), makeSymbol("SHOP-STATISTIC-MANAGER")), list(makeSymbol("GET-SLOT"), makeSymbol("PLANNER"), list(makeSymbol("QUOTE"), makeSymbol("STATS-MANAGER")))), list(makeSymbol("WHEN-VERBOSE"), makeKeyword("CYC-QUERY"), list(makeSymbol("FIM"), makeSymbol("LOG"), list(makeSymbol("QUOTE"), makeSymbol("LOG-INFERENCE")), makeSymbol("BINDINGS"), makeSymbol("HALT-REASON"), makeSymbol("INFERENCE"))), list(makeSymbol("PUNLESS"), makeSymbol("*SHOP-USE-INFERENCE-SUPPORTS?*"), list(makeSymbol("CSETQ"), makeSymbol("BINDINGS"), list(makeSymbol("PAIRLIS"), makeSymbol("BINDINGS"), list(makeSymbol("MAKE-LIST"), list(makeSymbol("LENGTH"), makeSymbol("BINDINGS")), list(makeSymbol("LIST"), NIL))))), list(makeSymbol("PWHEN"), makeSymbol("BINDINGS"), list(makeSymbol("PIF"), list(EQUAL, list(makeSymbol("CAAR"), makeSymbol("BINDINGS")), list(makeSymbol("QUOTE"), list(cons(T, T)))), list(makeSymbol("PROGN"), list(makeSymbol("CSETQ"), makeSymbol("MBINDINGS"), list(makeSymbol("LIST"), makeSymbol("MBIND")))), list(makeSymbol("CLET"), list(list(makeSymbol("*MB-REIFY-NATS?*"), NIL)), list(makeSymbol("CSETQ"), makeSymbol("MBINDINGS"), list(makeSymbol("CONVERT-BINDING-LISTS-AND-SUPPORTS-TO-MBINDS"), makeSymbol("BINDINGS"), makeSymbol("MBIND")))))), list(makeSymbol("PIF"), list(makeSymbol("MULTIBINDING-FAILED?"), makeSymbol("MBINDINGS")), list(makeSymbol("RET"), NIL), list(makeSymbol("RET"), makeSymbol("MBINDINGS")))));

    public static final SubLSymbol $sym214$OUTER_CATCH_FOR_SHOP_BASIC_PLAN_STATE_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-SHOP-BASIC-PLAN-STATE-METHOD");

    private static final SubLObject $$and = reader_make_constant_shell(makeString("and"));







    public static final SubLSymbol LOG_INFERENCE = makeSymbol("LOG-INFERENCE");

    public static final SubLList $list220 = list(cons(T, T));

    public static final SubLSymbol SHOP_BASIC_PLAN_STATE_SEEK_TOTAL_MBINDINGS_METHOD = makeSymbol("SHOP-BASIC-PLAN-STATE-SEEK-TOTAL-MBINDINGS-METHOD");

    public static final SubLSymbol FIND_MBINDINGS = makeSymbol("FIND-MBINDINGS");

    public static final SubLList $list223 = list(makeSymbol("GOALS"), makeSymbol("MBINDING"));

    public static final SubLList $list224 = list(makeString("Returns a list of all satisfiers of GOALS from the current\n   WORLD-STATE."), list(makeSymbol("PWHEN"), makeSymbol("*SHOP-INFER-COMPLETE-PRECONDITIONS?*"), list(makeSymbol("RET"), list(makeSymbol("SEEK-TOTAL-MBINDINGS"), makeSymbol("SELF"), makeSymbol("GOALS"), list(makeSymbol("COPY-MULTIBINDING"), makeSymbol("MBINDING"))))), list(makeSymbol("RET"), NIL));

    public static final SubLSymbol SHOP_BASIC_PLAN_STATE_FIND_MBINDINGS_METHOD = makeSymbol("SHOP-BASIC-PLAN-STATE-FIND-MBINDINGS-METHOD");

    public static final SubLSymbol $sym226$SHOP_SAME_TASK_ = makeSymbol("SHOP-SAME-TASK?");

    public static final SubLSymbol $sym227$PARENT_TASK_ = makeSymbol("PARENT-TASK?");

    public static final SubLList $list228 = list(makeString("@param TASK hl-formula-p\n    @return booleanp\n    Return T if there exists an element of slot PARTIAL-PLAN which is\n    EQUAL to TASK and does not also occur in POST-ORDERING. This means\n    that TASK is decomposed from an equivalent task, and should be\n    removed if cycle checking is enabled."), list(makeSymbol("CLET"), list(list(makeSymbol("POTENTIAL-LIST"), makeSymbol("PARTIAL-PLAN"))), list(makeSymbol("CDO"), list(list(makeSymbol("CUR-POTENTIALS"), list(makeSymbol("SHOP-FIND-NEXT-MATCH"), makeSymbol("TASK"), makeSymbol("POTENTIAL-LIST")), list(makeSymbol("SHOP-FIND-NEXT-MATCH"), makeSymbol("TASK"), list(makeSymbol("REST"), makeSymbol("CUR-POTENTIALS"))))), list(list(makeSymbol("NULL"), makeSymbol("CUR-POTENTIALS")), list(makeSymbol("RET"), NIL)), list(makeSymbol("CLET"), list(list(makeSymbol("CUR-TASK"), list(makeSymbol("FIRST"), makeSymbol("CUR-POTENTIALS")))), list(makeSymbol("PWHEN"), list(EQUAL, makeSymbol("TASK"), makeSymbol("CUR-TASK")), list(makeSymbol("PUNLESS"), list(makeSymbol("MEMBER?"), makeSymbol("CUR-TASK"), makeSymbol("POST-ORDERING"), list(makeSymbol("FUNCTION"), EQ)), list(makeSymbol("RET"), T))), list(makeSymbol("CLET"), list(list(makeSymbol("UNIFER"), list(makeSymbol("SHOP-UNIFY"), makeSymbol("TASK"), makeSymbol("CUR-TASK")))), list(makeSymbol("PUNLESS"), list(makeSymbol("SHOP-UNIFY-FAILED?"), makeSymbol("UNIFER")), list(makeSymbol("CLET"), list(list(makeSymbol("*MB-REIFY-NATS?*"), NIL), list(makeSymbol("UNIFIER-MB"), list(makeSymbol("CONVERT-BINDING-TO-MBIND"), makeSymbol("UNIFER"), makeSymbol("MBINDINGS")))), list(makeSymbol("PUNLESS"), list(makeSymbol("NULL"), makeSymbol("UNIFIER-MB")), list(makeSymbol("CLET"), list(list(makeSymbol("INVERSE-MB"), list(makeSymbol("MB-INVERSE"), makeSymbol("MBINDINGS"), makeSymbol("UNIFIER-MB")))), list(makeSymbol("PIF"), list(makeSymbol("SHOP-UNIFY-FAILED?"), makeSymbol("INVERSE-MB")), list(makeSymbol("PUNLESS"), list(makeSymbol("MEMBER?"), makeSymbol("CUR-TASK"), makeSymbol("POST-ORDERING"), list(makeSymbol("FUNCTION"), EQ)), list(makeSymbol("RET"), T)), list(makeSymbol("CSETQ"), makeSymbol("MBINDINGS"), makeSymbol("INVERSE-MB")))))))))), list(makeSymbol("RET"), NIL)));

    public static final SubLSymbol $sym229$OUTER_CATCH_FOR_SHOP_BASIC_PLAN_STATE_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-SHOP-BASIC-PLAN-STATE-METHOD");

    public static final SubLSymbol $sym230$SHOP_BASIC_PLAN_STATE_PARENT_TASK__METHOD = makeSymbol("SHOP-BASIC-PLAN-STATE-PARENT-TASK?-METHOD");

    public static final SubLSymbol EXPAND = makeSymbol("EXPAND");

    public static final SubLList $list232 = list(makeString("expands a plan state by taking the first task of\n   the TASKLIST, if it is an operator call\n   APPLY-OPERATOR, otherwise call APPLY-METHOD."), list(makeSymbol("CLET"), list(list(makeSymbol("TASK1"), list(makeSymbol("FIRST"), makeSymbol("TASKLIST"))), list(makeSymbol("TASKNAME"), list(makeSymbol("FORMULA-OPERATOR"), makeSymbol("TASK1")))), list(makeSymbol("WHEN-VERBOSE"), makeKeyword("TASKS"), list(makeSymbol("FIM"), makeSymbol("LOG"), list(makeSymbol("QUOTE"), makeSymbol("NEW-SECTION"))), list(makeSymbol("FIM"), makeSymbol("LOG"), list(makeSymbol("QUOTE"), makeSymbol("LOG-HEADING")), list(makeSymbol("FORMAT"), NIL, makeString("Search Depth ~s"), makeSymbol("DEPTH"))), list(makeSymbol("OUTPUT-MESSAGE"), makeSymbol("SELF"), list(makeSymbol("FORMAT"), NIL, makeString("task ~s"), makeSymbol("TASK1"))), list(makeSymbol("WHEN-VERBOSE"), makeKeyword("ALL"))), list(makeSymbol("PCOND"), list(list(EQ, makeSymbol("TASKNAME"), makeKeyword("SUPERTASK")), list(makeSymbol("ADD-TO-POST-ORDERING"), makeSymbol("SELF"), list(makeSymbol("FORMULA-ARG1"), makeSymbol("TASK1"))), list(makeSymbol("CSETQ"), makeSymbol("TASKLIST"), list(makeSymbol("REST"), makeSymbol("TASKLIST"))), list(makeSymbol("RET"), list(makeSymbol("LIST"), makeSymbol("SELF")))), list(list(makeSymbol("CAND"), makeSymbol("*SHOP-METHOD-CYCLE-CHECKING-ENABLED?*"), list(makeSymbol("PARENT-TASK?"), makeSymbol("SELF"), makeSymbol("TASK1"))), list(makeSymbol("WHEN-VERBOSE"), makeKeyword("GOALS"), list(makeSymbol("FIM"), makeSymbol("LOG"), list(makeSymbol("QUOTE"), makeSymbol("WARNING")), makeString("Prune -- Method Cycle checking detected a loop"))), list(makeSymbol("RET"), NIL)), list(list(makeSymbol("SIMPLE-SITUATION-PRED?"), makeSymbol("SELF"), makeSymbol("TASKNAME")), list(makeSymbol("RET"), list(makeSymbol("EXPAND-PRIMITIVE-PRECONDITIONS"), makeSymbol("SELF"), makeSymbol("TASK1")))), list(T, list(makeSymbol("RET"), list(makeSymbol("EXPAND-COMPLEX"), makeSymbol("SELF"), makeSymbol("TASK1")))))));

    public static final SubLSymbol $sym233$OUTER_CATCH_FOR_SHOP_BASIC_PLAN_STATE_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-SHOP-BASIC-PLAN-STATE-METHOD");



    public static final SubLSymbol NEW_SECTION = makeSymbol("NEW-SECTION");

    public static final SubLSymbol LOG_HEADING = makeSymbol("LOG-HEADING");

    public static final SubLString $str237$Search_Depth__s = makeString("Search Depth ~s");

    public static final SubLString $str238$task__s = makeString("task ~s");







    public static final SubLString $str242$Prune____Method_Cycle_checking_de = makeString("Prune -- Method Cycle checking detected a loop");

    public static final SubLSymbol SHOP_BASIC_PLAN_STATE_EXPAND_METHOD = makeSymbol("SHOP-BASIC-PLAN-STATE-EXPAND-METHOD");

    public static final SubLSymbol EXPAND_COMPLEX = makeSymbol("EXPAND-COMPLEX");

    public static final SubLList $list245 = list(list(makeSymbol("CDESTRUCTURING-BIND"), list(makeSymbol("SCOND-NODES"), makeSymbol("INVERSE-UNIFIERS")), list(makeSymbol("APPLY-ALL-SUFFICIENT-CONDITIONS"), makeSymbol("SELF"), makeSymbol("TASK")), list(makeSymbol("CLET"), list(list(makeSymbol("METHOD-NODES"), NIL)), list(makeSymbol("PIF"), makeSymbol("SCOND-NODES"), list(makeSymbol("PROGN"), list(makeSymbol("CDOLIST"), list(makeSymbol("CUR-UNIFIER"), makeSymbol("INVERSE-UNIFIERS")), list(makeSymbol("PUNLESS"), list(makeSymbol("MULTIBINDING-FAILED?"), makeSymbol("CUR-UNIFIER")), list(makeSymbol("CLET"), list(list(makeSymbol("SIMPLE-UNIFIER"), list(makeSymbol("APPLICABLE-MULTIBINDING"), makeSymbol("SELF"), makeSymbol("CUR-UNIFIER"))), list(makeSymbol("NEW-TASKS"), list(makeSymbol("APPLY-MULTIBINDING"), makeSymbol("TASK"), makeSymbol("SIMPLE-UNIFIER")))), list(makeSymbol("CDOLIST"), list(makeSymbol("CUR-TASK"), makeSymbol("NEW-TASKS")), list(makeSymbol("CPUSH*"), list(makeSymbol("APPLY-ALL-METHODS"), makeSymbol("SELF"), makeSymbol("CUR-TASK")), makeSymbol("METHOD-NODES"))))))), list(makeSymbol("PROGN"), list(makeSymbol("CSETQ"), makeSymbol("METHOD-NODES"), list(makeSymbol("APPLY-ALL-METHODS"), makeSymbol("SELF"), makeSymbol("TASK"))))), list(makeSymbol("RET"), list(makeSymbol("APPEND"), makeSymbol("SCOND-NODES"), makeSymbol("METHOD-NODES"))))));

    public static final SubLList $list246 = list(makeSymbol("SCOND-NODES"), makeSymbol("INVERSE-UNIFIERS"));

    public static final SubLSymbol SHOP_BASIC_PLAN_STATE_EXPAND_COMPLEX_METHOD = makeSymbol("SHOP-BASIC-PLAN-STATE-EXPAND-COMPLEX-METHOD");

    public static final SubLSymbol EXPAND_PRIMITIVE_PRECONDITIONS = makeSymbol("EXPAND-PRIMITIVE-PRECONDITIONS");

    public static final SubLList $list249 = list(list(makeSymbol("PWHEN"), list(makeSymbol("APPLY-ALL-PRECONDITIONS"), makeSymbol("SELF"), makeSymbol("TASK")), list(makeSymbol("RET"), list(makeSymbol("EXPAND-PRIMITIVE"), makeSymbol("SELF"), makeSymbol("TASK")))));

    public static final SubLSymbol SHOP_BASIC_PLAN_STATE_EXPAND_PRIMITIVE_PRECONDITIONS_METHOD = makeSymbol("SHOP-BASIC-PLAN-STATE-EXPAND-PRIMITIVE-PRECONDITIONS-METHOD");

    public static final SubLSymbol EXPAND_PRIMITIVE = makeSymbol("EXPAND-PRIMITIVE");

    public static final SubLList $list252 = list(list(makeSymbol("WHEN-VERBOSE"), makeKeyword("OPERATORS"), list(makeSymbol("FIM"), makeSymbol("LOG"), list(makeSymbol("QUOTE"), makeSymbol("LOG-NEWLINE"))), list(makeSymbol("FIM"), makeSymbol("LOG"), list(makeSymbol("QUOTE"), makeSymbol("LOG-ENTRY")), makeString("Finding operators for task..."))), list(new SubLObject[]{ makeSymbol("CLET"), list(list(makeSymbol("DOMAIN"), list(makeSymbol("INLINE-METHOD"), list(makeSymbol("GET-DOMAIN"), makeSymbol("SHOP-BASIC-PLANNER-THREAD")), makeSymbol("PLANNER"))), list(makeSymbol("OPERATORS"), list(makeSymbol("INLINE-METHOD"), list(makeSymbol("GET-OPERATORS"), makeSymbol("SHOP-BASIC-DOMAIN")), makeSymbol("DOMAIN"), makeSymbol("TASK"))), list(makeSymbol("COND-OPERATORS"), list(makeSymbol("INLINE-METHOD"), list(makeSymbol("GET-CONDITIONAL-OPERATORS"), makeSymbol("SHOP-BASIC-DOMAIN")), makeSymbol("DOMAIN"), makeSymbol("TASK"))), makeSymbol("NEW-PLAN-STATE"), makeSymbol("NEW-WORLD-STATE")), list(makeSymbol("PWHEN"), list(makeSymbol("NULL"), makeSymbol("OPERATORS")), list(makeSymbol("FIM"), makeSymbol("LOG"), list(makeSymbol("QUOTE"), makeSymbol("WARNING")), makeString("No operator for task")), list(makeSymbol("CSETQ"), makeSymbol("NEW-PLAN-STATE"), list(makeSymbol("CREATE-NEXT"), makeSymbol("SELF"))), list(makeSymbol("INLINE-METHOD"), list(makeSymbol("ADD-TO-PARTIAL-PLAN"), makeSymbol("SHOP-BASIC-PLAN-STATE")), makeSymbol("NEW-PLAN-STATE"), makeSymbol("TASK")), list(makeSymbol("INLINE-METHOD"), list(makeSymbol("ADD-TO-TASK-STRUCS"), makeSymbol("SHOP-BASIC-PLAN-STATE")), makeSymbol("NEW-PLAN-STATE"), NIL), list(makeSymbol("INLINE-METHOD"), list(makeSymbol("ADD-DECOMPOSITION"), makeSymbol("SHOP-BASIC-PLAN-STATE")), makeSymbol("NEW-PLAN-STATE"), makeSymbol("TASK"), NIL), list(makeSymbol("RET"), list(makeSymbol("LIST"), makeSymbol("NEW-PLAN-STATE")))), list(makeSymbol("CSETQ"), makeSymbol("NEW-WORLD-STATE"), list(makeSymbol("APPLY-OPERATORS"), makeSymbol("SELF"), makeSymbol("TASK"), makeSymbol("OPERATORS"), makeSymbol("COND-OPERATORS"))), list(makeSymbol("PUNLESS"), makeSymbol("NEW-WORLD-STATE"), list(makeSymbol("RET"), NIL)), list(makeSymbol("PWHEN"), list(makeSymbol("GET-SLOT"), makeSymbol("PLANNER"), list(makeSymbol("QUOTE"), makeSymbol("CYCLE-CHECKING"))), list(makeSymbol("CDOLIST"), list(makeSymbol("OLD-STATE"), list(makeSymbol("GET-SLOT"), makeSymbol("SELF"), list(makeSymbol("QUOTE"), makeSymbol("PREVIOUS-STATES")))), list(makeSymbol("PWHEN"), list(makeSymbol("INLINE-METHOD"), list(makeSymbol("SAME-STATE-P"), makeSymbol("SHOP-BASIC-WORLD-STATE")), makeSymbol("NEW-WORLD-STATE"), makeSymbol("NEW-WORLD-STATE"), makeSymbol("OLD-STATE")), list(makeSymbol("WHEN-VERBOSE"), makeKeyword("CUTOFFS"), list(makeSymbol("FIM"), makeSymbol("LOG"), list(makeSymbol("QUOTE"), makeSymbol("WARNING")), makeString("Prune -- World State Cycle Checking detected a loop"))), list(makeSymbol("RET"), NIL)))), list(makeSymbol("CSETQ"), makeSymbol("NEW-PLAN-STATE"), list(makeSymbol("CREATE-NEXT"), makeSymbol("SELF"))), list(makeSymbol("INLINE-METHOD"), list(makeSymbol("SET-WORLD-STATE"), makeSymbol("SHOP-BASIC-PLAN-STATE")), makeSymbol("NEW-PLAN-STATE"), makeSymbol("NEW-WORLD-STATE")), list(makeSymbol("INLINE-METHOD"), list(makeSymbol("ADD-TO-PREVIOUS-STATES"), makeSymbol("SHOP-BASIC-PLAN-STATE")), makeSymbol("NEW-PLAN-STATE"), makeSymbol("NEW-WORLD-STATE")), list(makeSymbol("INLINE-METHOD"), list(makeSymbol("ADD-TO-PARTIAL-PLAN"), makeSymbol("SHOP-BASIC-PLAN-STATE")), makeSymbol("NEW-PLAN-STATE"), makeSymbol("TASK")), list(makeSymbol("INLINE-METHOD"), list(makeSymbol("ADD-TO-TASK-STRUCS"), makeSymbol("SHOP-BASIC-PLAN-STATE")), makeSymbol("NEW-PLAN-STATE"), list(makeSymbol("APPEND"), makeSymbol("OPERATORS"), makeSymbol("COND-OPERATORS"))), list(makeSymbol("INLINE-METHOD"), list(makeSymbol("ADD-DECOMPOSITION"), makeSymbol("SHOP-BASIC-PLAN-STATE")), makeSymbol("NEW-PLAN-STATE"), makeSymbol("TASK"), NIL), list(makeSymbol("RET"), list(makeSymbol("LIST"), makeSymbol("NEW-PLAN-STATE"))) }));

    public static final SubLSymbol $sym253$OUTER_CATCH_FOR_SHOP_BASIC_PLAN_STATE_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-SHOP-BASIC-PLAN-STATE-METHOD");







    public static final SubLString $str257$Finding_operators_for_task___ = makeString("Finding operators for task...");

    public static final SubLString $$$No_operator_for_task = makeString("No operator for task");

    public static final SubLSymbol CYCLE_CHECKING = makeSymbol("CYCLE-CHECKING");



    public static final SubLString $str261$Prune____World_State_Cycle_Checki = makeString("Prune -- World State Cycle Checking detected a loop");

    public static final SubLSymbol SHOP_BASIC_PLAN_STATE_EXPAND_PRIMITIVE_METHOD = makeSymbol("SHOP-BASIC-PLAN-STATE-EXPAND-PRIMITIVE-METHOD");

    public static final SubLSymbol APPLY_OPERATORS = makeSymbol("APPLY-OPERATORS");

    public static final SubLList $list264 = list(makeSymbol("TASK"), makeSymbol("OPERATORS"), makeSymbol("COND-OPERATORS"));

    public static final SubLList $list265 = list(list(makeSymbol("CLET"), list(list(makeSymbol("RESULT"), list(makeSymbol("FIM"), makeSymbol("WORLD-STATE"), list(makeSymbol("QUOTE"), makeSymbol("NEXT-STATE")))), list(makeSymbol("ADDS"), NIL), list(makeSymbol("DELETES"), NIL), list(makeSymbol("TOTAL-NUM"), list(makeSymbol("LIST-LENGTH"), makeSymbol("COND-OPERATORS")))), list(makeSymbol("CDOLIST"), list(makeSymbol("CUR-OP"), makeSymbol("OPERATORS")), list(makeSymbol("CMULTIPLE-VALUE-BIND"), list(makeSymbol("NEW-ADDS"), makeSymbol("NEW-DELETES")), list(makeSymbol("APPLY-OPERATOR"), makeSymbol("SELF"), makeSymbol("TASK"), makeSymbol("CUR-OP")), list(makeSymbol("CDOLIST"), list(makeSymbol("LIT"), makeSymbol("NEW-ADDS")), list(makeSymbol("CPUSHNEW"), makeSymbol("LIT"), makeSymbol("ADDS"))), list(makeSymbol("CDOLIST"), list(makeSymbol("LIT"), makeSymbol("NEW-DELETES")), list(makeSymbol("CPUSHNEW"), makeSymbol("LIT"), makeSymbol("DELETES"))))), list(makeSymbol("CDOLIST-NUMBERED"), list(makeSymbol("CUR-OP"), makeSymbol("CUR-NUM"), makeSymbol("COND-OPERATORS")), list(makeSymbol("WHEN-VERBOSE"), makeKeyword("OPERATORS"), list(makeSymbol("FIM"), makeSymbol("LOG"), list(makeSymbol("QUOTE"), makeSymbol("LOG-FANCY-ENTRY")), list(makeSymbol("FORMAT"), NIL, makeString("Trying [~s/~s]:"), list(makeSymbol("1+"), makeSymbol("CUR-NUM")), makeSymbol("TOTAL-NUM")), list(makeSymbol("QUOTE"), list(makeKeyword("BOLD")))), list(makeSymbol("FIM"), makeSymbol("LOG"), list(makeSymbol("QUOTE"), makeSymbol("LOG-NEWLINE")))), list(makeSymbol("CMULTIPLE-VALUE-BIND"), list(makeSymbol("NEW-ADDS"), makeSymbol("NEW-DELETES")), list(makeSymbol("APPLY-CONDITIONAL-OPERATOR"), makeSymbol("SELF"), makeSymbol("TASK"), makeSymbol("CUR-OP")), list(makeSymbol("CDOLIST"), list(makeSymbol("LIT"), makeSymbol("NEW-ADDS")), list(makeSymbol("CPUSHNEW"), makeSymbol("LIT"), makeSymbol("ADDS"))), list(makeSymbol("CDOLIST"), list(makeSymbol("LIT"), makeSymbol("NEW-DELETES")), list(makeSymbol("CPUSHNEW"), makeSymbol("LIT"), makeSymbol("DELETES"))))), list(new SubLObject[]{ makeSymbol("WHEN-VERBOSE"), makeKeyword("OPERATORS"), list(makeSymbol("FIM"), makeSymbol("LOG"), list(makeSymbol("QUOTE"), makeSymbol("LOG-NEWLINE"))), list(makeSymbol("FIM"), makeSymbol("LOG"), list(makeSymbol("QUOTE"), makeSymbol("LOG-ENTRY")), makeString("Making New World State")), list(makeSymbol("FIM"), makeSymbol("LOG"), list(makeSymbol("QUOTE"), makeSymbol("LOG-ENTRY")), makeString("Adds: ")), list(makeSymbol("FIM"), makeSymbol("LOG"), list(makeSymbol("QUOTE"), makeSymbol("LOG-ENTRY")), list(makeSymbol("WRITE-TO-STRING"), makeSymbol("ADDS"))), list(makeSymbol("FIM"), makeSymbol("LOG"), list(makeSymbol("QUOTE"), makeSymbol("LOG-ENTRY")), makeString("Deletes: ")), list(makeSymbol("FIM"), makeSymbol("LOG"), list(makeSymbol("QUOTE"), makeSymbol("LOG-ENTRY")), list(makeSymbol("WRITE-TO-STRING"), makeSymbol("DELETES"))), list(makeSymbol("CLET"), list(list(makeSymbol("RACE-LITS"), list(makeSymbol("INTERSECTION"), makeSymbol("ADDS"), makeSymbol("DELETES"), list(makeSymbol("FUNCTION"), EQUAL)))), list(makeSymbol("PWHEN"), makeSymbol("RACE-LITS"), list(makeSymbol("OUTPUT-MESSAGE"), makeSymbol("SELF"), list(makeSymbol("FORMAT"), NIL, makeString("Warning: Add/Delete race condition (~a) with operators ~a and conditional operators ~a."), makeSymbol("RACE-LITS"), makeSymbol("OPERATORS"), makeSymbol("COND-OPERATORS"))))) }), list(makeSymbol("FIM"), makeSymbol("RESULT"), list(makeSymbol("QUOTE"), makeSymbol("DELETE-LITERALS")), makeSymbol("DELETES")), list(makeSymbol("FIM"), makeSymbol("RESULT"), list(makeSymbol("QUOTE"), makeSymbol("ADD-LITERALS")), makeSymbol("ADDS")), list(makeSymbol("RET"), makeSymbol("RESULT"))));

    public static final SubLSymbol $sym266$OUTER_CATCH_FOR_SHOP_BASIC_PLAN_STATE_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-SHOP-BASIC-PLAN-STATE-METHOD");





    public static final SubLString $str269$Trying___s__s__ = makeString("Trying [~s/~s]:");

    public static final SubLList $list270 = list(makeKeyword("BOLD"));

    public static final SubLString $$$Making_New_World_State = makeString("Making New World State");

    public static final SubLString $str272$Adds__ = makeString("Adds: ");

    public static final SubLString $str273$Deletes__ = makeString("Deletes: ");

    public static final SubLString $str274$Warning__Add_Delete_race_conditio = makeString("Warning: Add/Delete race condition (~a) with operators ~a and conditional operators ~a.");





    public static final SubLSymbol SHOP_BASIC_PLAN_STATE_APPLY_OPERATORS_METHOD = makeSymbol("SHOP-BASIC-PLAN-STATE-APPLY-OPERATORS-METHOD");

    public static final SubLSymbol APPLY_OPERATOR = makeSymbol("APPLY-OPERATOR");

    public static final SubLList $list279 = list(makeSymbol("TASK"), makeSymbol("OPERATOR"));

    public static final SubLList $list280 = list(makeString("@param  TASK hl-formula-p\n   @param  OPERATOR shop-operator-p\n   @return shop-plan-state-p\n   If OPERATOR is applicable to TASK in self\'s WORLD-STATE, then return\n   the resulting PLAN-STATE.  Otherwise return NIL."), list(makeSymbol("CLET"), list(list(makeSymbol("HEAD"), list(makeSymbol("INLINE-GET-SLOT"), list(makeSymbol("HEAD"), makeSymbol("SHOP-BASIC-OPERATOR")), makeSymbol("OPERATOR"))), list(makeSymbol("UNIFIER"), list(makeSymbol("SHOP-UNIFY"), list(makeSymbol("REST"), makeSymbol("HEAD")), list(makeSymbol("REST"), makeSymbol("TASK"))))), list(makeSymbol("PUNLESS"), list(makeSymbol("SHOP-UNIFY-FAILED?"), makeSymbol("UNIFIER")), list(makeSymbol("CLET"), list(list(makeSymbol("DELETIONS"), list(makeSymbol("INLINE-METHOD"), list(makeSymbol("GET-DELETES"), makeSymbol("SHOP-BASIC-OPERATOR")), makeSymbol("OPERATOR"))), list(makeSymbol("ADDITIONS"), list(makeSymbol("INLINE-METHOD"), list(makeSymbol("GET-ADDS"), makeSymbol("SHOP-BASIC-OPERATOR")), makeSymbol("OPERATOR")))), list(makeSymbol("RET"), list(makeSymbol("VALUES"), list(makeSymbol("SHOP-APPLY-SUBSTITUTION"), makeSymbol("ADDITIONS"), makeSymbol("UNIFIER")), list(makeSymbol("SHOP-APPLY-SUBSTITUTION"), makeSymbol("DELETIONS"), makeSymbol("UNIFIER"))))))));

    public static final SubLSymbol SHOP_BASIC_PLAN_STATE_APPLY_OPERATOR_METHOD = makeSymbol("SHOP-BASIC-PLAN-STATE-APPLY-OPERATOR-METHOD");

    public static final SubLSymbol APPLY_CONDITIONAL_OPERATOR = makeSymbol("APPLY-CONDITIONAL-OPERATOR");

    public static final SubLList $list283 = list(makeString("@param COND-EFFECT shop-basic-conditional-effect-p\n   @param UNIFIER multibinding-p\n   @return listp"), list(makeSymbol("CLET"), list(list(makeSymbol("VAR-MANAGER"), list(makeSymbol("GET-SLOT"), makeSymbol("PLANNER"), list(makeSymbol("QUOTE"), makeSymbol("VAR-MANAGER")))), list(makeSymbol("HEAD"), list(makeSymbol("INLINE-GET-SLOT"), list(makeSymbol("HEAD"), makeSymbol("SHOP-BASIC-OPERATOR")), makeSymbol("OPERATOR"))), list(makeSymbol("ADDS"), list(makeSymbol("INLINE-METHOD"), list(makeSymbol("ADDS"), makeSymbol("SHOP-BASIC-CONDITIONAL-EFFECT")), makeSymbol("OPERATOR"))), list(makeSymbol("DELETES"), list(makeSymbol("INLINE-METHOD"), list(makeSymbol("DELETES"), makeSymbol("SHOP-BASIC-CONDITIONAL-EFFECT")), makeSymbol("OPERATOR"))), list(makeSymbol("CONDITION"), list(makeSymbol("INLINE-METHOD"), list(makeSymbol("CONDITION"), makeSymbol("SHOP-BASIC-CONDITIONAL-EFFECT")), makeSymbol("OPERATOR"))), list(makeSymbol("SUB-LIST"), list(makeSymbol("LIST"), makeSymbol("CONDITION"), makeSymbol("ADDS"), makeSymbol("DELETES"))), list(makeSymbol("UNIFIER"), list(makeSymbol("SHOP-UNIFY"), list(makeSymbol("REST"), makeSymbol("HEAD")), list(makeSymbol("REST"), makeSymbol("TASK")))), makeSymbol("WORLD-STATE-MBINDINGS")), list(makeSymbol("PWHEN"), list(makeSymbol("SHOP-UNIFY-FAILED?"), makeSymbol("UNIFIER")), list(makeSymbol("RET"), makeSymbol("WORLD-STATE"))), list(makeSymbol("WHEN-VERBOSE"), makeKeyword("OPERATORS"), list(makeSymbol("FIM"), makeSymbol("LOG"), list(makeSymbol("QUOTE"), makeSymbol("LOG-PLANNER-RULE")), makeSymbol("OPERATOR"))), list(makeSymbol("CSETQ"), makeSymbol("SUB-LIST"), list(makeSymbol("SHOP-APPLY-SUBSTITUTION"), makeSymbol("SUB-LIST"), makeSymbol("UNIFIER"))), list(makeSymbol("CSETQ"), makeSymbol("SUB-LIST"), list(makeSymbol("INLINE-METHOD"), list(makeSymbol("REPLACE-VARIABLES"), makeSymbol("SHOP-VARIABLE-MANAGER")), makeSymbol("VAR-MANAGER"), makeSymbol("SUB-LIST"), makeSymbol("MBINDINGS"))), list(makeSymbol("CSETQ"), makeSymbol("WORLD-STATE-MBINDINGS"), list(makeSymbol("FIND-MBINDINGS"), makeSymbol("SELF"), list(makeSymbol("FIRST"), makeSymbol("SUB-LIST")), makeSymbol("MBINDINGS"))), list(makeSymbol("PWHEN"), makeSymbol("WORLD-STATE-MBINDINGS"), list(makeSymbol("MUST"), list(makeSymbol("SINGLETON?"), makeSymbol("WORLD-STATE-MBINDINGS")), makeString("(apply-conditional-operator shop-basic-plan-state): ~a not a singleton list."), makeSymbol("WORLD-STATE-MBINDINGS")), list(makeSymbol("CLET"), list(list(makeSymbol("SIMPLE-MBINDING"), list(makeSymbol("APPLICABLE-MULTIBINDING"), makeSymbol("SELF"), list(makeSymbol("FIRST"), makeSymbol("WORLD-STATE-MBINDINGS"))))), list(makeSymbol("CSETQ"), makeSymbol("ADDS"), list(makeSymbol("FIRST"), list(makeSymbol("APPLY-MULTIBINDING"), list(makeSymbol("SECOND"), makeSymbol("SUB-LIST")), makeSymbol("SIMPLE-MBINDING")))), list(makeSymbol("CSETQ"), makeSymbol("DELETES"), list(makeSymbol("FIRST"), list(makeSymbol("APPLY-MULTIBINDING"), list(makeSymbol("THIRD"), makeSymbol("SUB-LIST")), makeSymbol("SIMPLE-MBINDING")))), list(makeSymbol("RET"), list(makeSymbol("VALUES"), makeSymbol("ADDS"), makeSymbol("DELETES")))))));

    public static final SubLSymbol $sym284$OUTER_CATCH_FOR_SHOP_BASIC_PLAN_STATE_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-SHOP-BASIC-PLAN-STATE-METHOD");

    public static final SubLSymbol LOG_PLANNER_RULE = makeSymbol("LOG-PLANNER-RULE");

    public static final SubLString $str286$_apply_conditional_operator_shop_ = makeString("(apply-conditional-operator shop-basic-plan-state): ~a not a singleton list.");

    public static final SubLSymbol SHOP_BASIC_PLAN_STATE_APPLY_CONDITIONAL_OPERATOR_METHOD = makeSymbol("SHOP-BASIC-PLAN-STATE-APPLY-CONDITIONAL-OPERATOR-METHOD");

    public static final SubLSymbol UNIFY_PLANNER_RULE = makeSymbol("UNIFY-PLANNER-RULE");

    public static final SubLList $list289 = list(makeSymbol("TASK"), makeSymbol("RULE"));

    public static final SubLList $list290 = list(makeString("@param TASK hl-formula-p\n   @param RULE shop-planner-rule-p\n   prepare the multibindings and decompositions for expansion. This means\n   making sure that all the variables that need to be substituted are and that\n   all the bookkeeping is kept in the mbinding."), list(makeSymbol("CLET"), list(list(makeSymbol("VAR-MANAGER"), list(makeSymbol("GET-SLOT"), makeSymbol("PLANNER"), list(makeSymbol("QUOTE"), makeSymbol("VAR-MANAGER")))), list(makeSymbol("SIMPLE-MBINDING"), list(makeSymbol("APPLICABLE-MULTIBINDING"), makeSymbol("SELF"), makeSymbol("MBINDINGS"))), list(makeSymbol("UNIFIED-HEAD-DATA"), list(makeSymbol("INLINE-METHOD"), list(makeSymbol("UNIFY-TASK-TO-HEAD-WITH-DATA"), makeSymbol("SHOP-BASIC-PLANNER-RULE")), makeSymbol("RULE"), makeSymbol("TASK")))), list(makeSymbol("PUNLESS"), list(makeSymbol("NULL"), makeSymbol("UNIFIED-HEAD-DATA")), list(makeSymbol("CLET"), list(list(makeSymbol("TASK-UNIFIER"), list(makeSymbol("FIRST"), makeSymbol("UNIFIED-HEAD-DATA"))), list(makeSymbol("RULE-DATA"), list(makeSymbol("REST"), makeSymbol("UNIFIED-HEAD-DATA")))), list(makeSymbol("PUNLESS"), list(makeSymbol("SHOP-UNIFY-FAILED?"), makeSymbol("TASK-UNIFIER")), list(makeSymbol("CLET"), list(list(makeSymbol("PRECOND-DECOMP"), list(makeSymbol("FIRST"), list(makeSymbol("APPLY-MULTIBINDING"), makeSymbol("RULE-DATA"), makeSymbol("SIMPLE-MBINDING")))), list(makeSymbol("GENERATED-VAR-BPAIRS"), list(makeSymbol("INLINE-METHOD"), list(makeSymbol("GENERATED-VARIABLES-BOUND"), makeSymbol("SHOP-VARIABLE-MANAGER")), list(makeSymbol("QUOTE"), makeSymbol("SHOP-VARIABLE-MANAGER")), makeSymbol("TASK-UNIFIER"))), list(makeSymbol("NEW-MBINDINGS"), list(makeSymbol("MB-ADD-BINDINGS"), makeSymbol("MBINDINGS"), makeSymbol("GENERATED-VAR-BPAIRS"))), list(makeSymbol("ASSERTION"), list(makeSymbol("FIRST"), list(makeSymbol("FIM"), makeSymbol("RULE"), list(makeSymbol("QUOTE"), makeSymbol("ASSERTIONS")))))), list(makeSymbol("PWHEN"), makeSymbol("ASSERTION"), list(makeSymbol("CLET"), list(list(makeSymbol("EL-VARS"), list(makeSymbol("ASSERTION-EL-VARIABLES"), makeSymbol("ASSERTION"))), list(makeSymbol("HL-VARS"), list(makeSymbol("ASSERTION-HL-VARIABLES"), makeSymbol("ASSERTION"))), list(makeSymbol("EL-SUBST"), list(makeSymbol("PAIRLIS"), makeSymbol("HL-VARS"), makeSymbol("EL-VARS")))), list(makeSymbol("CSETQ"), makeSymbol("PRECOND-DECOMP"), list(makeSymbol("SUBLIS"), makeSymbol("EL-SUBST"), makeSymbol("PRECOND-DECOMP"))))), list(makeSymbol("CLET"), list(list(makeSymbol("DECOMP"), list(makeSymbol("INLINE-METHOD"), list(makeSymbol("REPLACE-VARIABLES"), makeSymbol("SHOP-VARIABLE-MANAGER")), makeSymbol("VAR-MANAGER"), makeSymbol("PRECOND-DECOMP"), makeSymbol("NEW-MBINDINGS")))), list(makeSymbol("RET"), list(makeSymbol("CONS"), makeSymbol("NEW-MBINDINGS"), makeSymbol("DECOMP")))))))), list(makeSymbol("RET"), makeKeyword("FAIL"))));

    public static final SubLSymbol $sym291$OUTER_CATCH_FOR_SHOP_BASIC_PLAN_STATE_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-SHOP-BASIC-PLAN-STATE-METHOD");

    public static final SubLSymbol UNIFY_TASK_TO_HEAD_WITH_DATA = makeSymbol("UNIFY-TASK-TO-HEAD-WITH-DATA");







    public static final SubLSymbol SHOP_BASIC_PLAN_STATE_UNIFY_PLANNER_RULE_METHOD = makeSymbol("SHOP-BASIC-PLAN-STATE-UNIFY-PLANNER-RULE-METHOD");

    public static final SubLSymbol APPLY_ALL_METHODS = makeSymbol("APPLY-ALL-METHODS");

    public static final SubLList $list298 = list(makeString("@param TASK hl-formula-p"), list(makeSymbol("CLET"), list(list(makeSymbol("NEW-NODES"), NIL), list(makeSymbol("DOMAIN"), list(makeSymbol("INLINE-METHOD"), list(makeSymbol("GET-DOMAIN"), makeSymbol("SHOP-BASIC-PLANNER-THREAD")), makeSymbol("PLANNER"))), list(makeSymbol("TASK-PRED-MATCHED-METHODS"), list(makeSymbol("INLINE-METHOD"), list(makeSymbol("GET-METHODS"), makeSymbol("SHOP-BASIC-DOMAIN")), makeSymbol("DOMAIN"), makeSymbol("TASK"))), list(makeSymbol("TOTAL-NUM"), list(makeSymbol("LIST-LENGTH"), makeSymbol("TASK-PRED-MATCHED-METHODS")))), list(makeSymbol("WHEN-VERBOSE"), makeKeyword("PLANNER-RULES"), list(makeSymbol("FIM"), makeSymbol("LOG"), list(makeSymbol("QUOTE"), makeSymbol("LOG-NEWLINE"))), list(makeSymbol("FIM"), makeSymbol("LOG"), list(makeSymbol("QUOTE"), makeSymbol("LOG-ENTRY")), makeString("Finding methods for task..."))), list(makeSymbol("PIF"), makeSymbol("TASK-PRED-MATCHED-METHODS"), list(makeSymbol("CDOLIST-NUMBERED"), list(makeSymbol("CUR-METHOD"), makeSymbol("CUR-NUM"), makeSymbol("TASK-PRED-MATCHED-METHODS")), list(makeSymbol("WHEN-VERBOSE"), makeKeyword("PLANNER-RULES"), list(makeSymbol("FIM"), makeSymbol("LOG"), list(makeSymbol("QUOTE"), makeSymbol("LOG-FANCY-ENTRY")), list(makeSymbol("FORMAT"), NIL, makeString("Trying [~s/~s]:"), list(makeSymbol("1+"), makeSymbol("CUR-NUM")), makeSymbol("TOTAL-NUM")), list(makeSymbol("QUOTE"), list(makeKeyword("BOLD")))), list(makeSymbol("FIM"), makeSymbol("LOG"), list(makeSymbol("QUOTE"), makeSymbol("LOG-NEWLINE")))), list(makeSymbol("CPUSH*"), list(makeSymbol("APPLY-METHOD"), makeSymbol("SELF"), makeSymbol("TASK"), makeSymbol("CUR-METHOD")), makeSymbol("NEW-NODES"))), list(makeSymbol("WHEN-VERBOSE"), makeKeyword("GOALS"), list(makeSymbol("FIM"), makeSymbol("LOG"), list(makeSymbol("QUOTE"), makeSymbol("WARNING")), makeString("No matching methods were found!")))), list(makeSymbol("RET"), makeSymbol("NEW-NODES"))));

    public static final SubLSymbol $sym299$OUTER_CATCH_FOR_SHOP_BASIC_PLAN_STATE_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-SHOP-BASIC-PLAN-STATE-METHOD");



    public static final SubLString $str301$Finding_methods_for_task___ = makeString("Finding methods for task...");

    public static final SubLString $str302$No_matching_methods_were_found_ = makeString("No matching methods were found!");

    public static final SubLSymbol SHOP_BASIC_PLAN_STATE_APPLY_ALL_METHODS_METHOD = makeSymbol("SHOP-BASIC-PLAN-STATE-APPLY-ALL-METHODS-METHOD");

    public static final SubLSymbol APPLY_METHOD = makeSymbol("APPLY-METHOD");

    public static final SubLList $list305 = list(makeSymbol("TASK"), makeSymbol("METHOD"));

    public static final SubLList $list306 = list(makeString("@param TASK hl-formula-p\n   @param METHOD shop-basic-method-p\n   If METHOD is applicable to TASK in plan state STATE, then execute SEEK-PLANS\n   method of the resulting list of PLAN-STATES. Returns NIL."), list(makeSymbol("CLET"), list(list(makeSymbol("NEW-NODES"), NIL), list(makeSymbol("UNIFIED-DECOMP-MBINDING"), list(makeSymbol("UNIFY-PLANNER-RULE"), makeSymbol("SELF"), makeSymbol("TASK"), makeSymbol("METHOD")))), list(makeSymbol("WHEN-VERBOSE"), makeKeyword("METHODS"), list(makeSymbol("FIM"), makeSymbol("LOG"), list(makeSymbol("QUOTE"), makeSymbol("LOG-PLANNER-RULE")), makeSymbol("METHOD"))), list(makeSymbol("PUNLESS"), list(EQ, makeKeyword("FAIL"), makeSymbol("UNIFIED-DECOMP-MBINDING")), list(makeSymbol("CDESTRUCTURING-BIND"), list(makeSymbol("NEW-MBINDINGS"), makeSymbol("PRE"), makeSymbol("REDUCTION")), makeSymbol("UNIFIED-DECOMP-MBINDING"), list(makeSymbol("CLET"), list(list(makeSymbol("STATE-UNIFIERS"), list(makeSymbol("FIND-MBINDINGS"), makeSymbol("SELF"), makeSymbol("PRE"), makeSymbol("NEW-MBINDINGS")))), list(makeSymbol("PWHEN"), makeSymbol("STATE-UNIFIERS"), list(makeSymbol("CDOLIST-NUMBERED"), list(makeSymbol("UNIFIER"), makeSymbol("RESULT-NUM"), makeSymbol("STATE-UNIFIERS")), list(new SubLObject[]{ makeSymbol("CLET"), list(list(makeSymbol("NEW-PLAN-STATE"), list(makeSymbol("CREATE-NEXT"), makeSymbol("SELF"))), makeSymbol("SIMPLE-MBINDING")), list(makeSymbol("WHEN-VERBOSE"), makeKeyword("METHODS"), list(makeSymbol("FIM"), makeSymbol("LOG"), list(makeSymbol("QUOTE"), makeSymbol("LOG-FANCY-ENTRY")), list(makeSymbol("FORMAT"), NIL, makeString("Result ~s"), list(makeSymbol("1+"), makeSymbol("RESULT-NUM"))), list(makeSymbol("QUOTE"), list(makeKeyword("BOLD")))), list(makeSymbol("FIM"), makeSymbol("LOG"), list(makeSymbol("QUOTE"), makeSymbol("LOG-PREFORMATTED")), list(makeSymbol("MULTIBINDING-STRING"), makeSymbol("UNIFIER"))), list(makeSymbol("FIM"), makeSymbol("LOG"), list(makeSymbol("QUOTE"), makeSymbol("LOG-ENTRY")), list(makeSymbol("FORMAT"), NIL, makeString("Decomposition:~%"), makeSymbol("DEPTH"))), list(makeSymbol("PWHEN"), list(makeSymbol("LISTP"), makeSymbol("REDUCTION")), list(makeSymbol("CDOLIST"), list(makeSymbol("R"), makeSymbol("REDUCTION")), list(makeSymbol("FIM"), makeSymbol("LOG"), list(makeSymbol("QUOTE"), makeSymbol("LOG-PREFORMATTED")), list(makeSymbol("FORMAT"), NIL, makeString("~,,6,@s~%"), makeSymbol("R")))))), list(makeSymbol("INLINE-METHOD"), list(makeSymbol("ADD-TO-PARTIAL-PLAN"), makeSymbol("SHOP-BASIC-PLAN-STATE")), makeSymbol("NEW-PLAN-STATE"), makeSymbol("TASK")), list(makeSymbol("SET-SHOP-BASIC-PLAN-STATE-MBINDINGS"), makeSymbol("NEW-PLAN-STATE"), makeSymbol("UNIFIER")), list(makeSymbol("INLINE-METHOD"), list(makeSymbol("ADD-TO-TASK-STRUCS"), makeSymbol("SHOP-BASIC-PLAN-STATE")), makeSymbol("NEW-PLAN-STATE"), makeSymbol("METHOD")), list(makeSymbol("CSETQ"), makeSymbol("SIMPLE-MBINDING"), list(makeSymbol("APPLICABLE-MULTIBINDING"), makeSymbol("SELF"), makeSymbol("UNIFIER"))), list(makeSymbol("INLINE-METHOD"), list(makeSymbol("ADD-DECOMPOSITION"), makeSymbol("SHOP-BASIC-PLAN-STATE")), makeSymbol("NEW-PLAN-STATE"), makeSymbol("TASK"), list(makeSymbol("FIRST"), list(makeSymbol("APPLY-MULTIBINDING"), makeSymbol("REDUCTION"), makeSymbol("SIMPLE-MBINDING")))), list(makeSymbol("CPUSH"), makeSymbol("NEW-PLAN-STATE"), makeSymbol("NEW-NODES")) }))), list(makeSymbol("RET"), makeSymbol("NEW-NODES")))))), list(makeSymbol("RET"), NIL));

    public static final SubLSymbol $sym307$OUTER_CATCH_FOR_SHOP_BASIC_PLAN_STATE_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-SHOP-BASIC-PLAN-STATE-METHOD");



    public static final SubLList $list309 = list(makeSymbol("NEW-MBINDINGS"), makeSymbol("PRE"), makeSymbol("REDUCTION"));

    public static final SubLString $str310$Result__s = makeString("Result ~s");

    public static final SubLSymbol LOG_PREFORMATTED = makeSymbol("LOG-PREFORMATTED");

    public static final SubLString $str312$Decomposition___ = makeString("Decomposition:~%");

    public static final SubLString $str313$___6__s__ = makeString("~,,6,@s~%");

    public static final SubLSymbol SHOP_BASIC_PLAN_STATE_APPLY_METHOD_METHOD = makeSymbol("SHOP-BASIC-PLAN-STATE-APPLY-METHOD-METHOD");

    public static final SubLSymbol APPLY_ALL_SUFFICIENT_CONDITIONS = makeSymbol("APPLY-ALL-SUFFICIENT-CONDITIONS");

    public static final SubLList $list316 = list(makeString("@param TASK hl-formula-p"), list(makeSymbol("CLET"), list(list(makeSymbol("NEW-NODES"), NIL), list(makeSymbol("DOMAIN"), list(makeSymbol("INLINE-METHOD"), list(makeSymbol("GET-DOMAIN"), makeSymbol("SHOP-BASIC-PLANNER-THREAD")), makeSymbol("PLANNER"))), list(makeSymbol("TASK-SUFFICIENT-CONDS"), list(makeSymbol("INLINE-METHOD"), list(makeSymbol("GET-SUFFICIENT-CONDS"), makeSymbol("SHOP-BASIC-DOMAIN")), makeSymbol("DOMAIN"), makeSymbol("TASK"))), list(makeSymbol("INVERSE-UNIFIERS"), NIL), list(makeSymbol("TOTAL-NUM"), list(makeSymbol("LIST-LENGTH"), makeSymbol("TASK-SUFFICIENT-CONDS")))), list(makeSymbol("WHEN-VERBOSE"), makeKeyword("PLANNER-RULES"), list(makeSymbol("FIM"), makeSymbol("LOG"), list(makeSymbol("QUOTE"), makeSymbol("LOG-NEWLINE"))), list(makeSymbol("FIM"), makeSymbol("LOG"), list(makeSymbol("QUOTE"), makeSymbol("LOG-ENTRY")), makeString("Finding sufficient condition rules for task..."))), list(makeSymbol("PIF"), makeSymbol("TASK-SUFFICIENT-CONDS"), list(makeSymbol("CDOLIST-NUMBERED"), list(makeSymbol("CUR-SCOND"), makeSymbol("CUR-NUM"), makeSymbol("TASK-SUFFICIENT-CONDS")), list(makeSymbol("WHEN-VERBOSE"), makeKeyword("PLANNER-RULES"), list(makeSymbol("FIM"), makeSymbol("LOG"), list(makeSymbol("QUOTE"), makeSymbol("LOG-FANCY-ENTRY")), list(makeSymbol("FORMAT"), NIL, makeString("Trying [~s/~s]:"), list(makeSymbol("1+"), makeSymbol("CUR-NUM")), makeSymbol("TOTAL-NUM")), list(makeSymbol("QUOTE"), list(makeKeyword("BOLD")))), list(makeSymbol("FIM"), makeSymbol("LOG"), list(makeSymbol("QUOTE"), makeSymbol("LOG-NEWLINE")))), list(makeSymbol("CDESTRUCTURING-BIND"), list(makeSymbol("NODES"), makeSymbol("INVERSE-UNIFIER")), list(makeSymbol("APPLY-SUFFICIENT-CONDITION"), makeSymbol("SELF"), makeSymbol("TASK"), makeSymbol("CUR-SCOND")), list(makeSymbol("CPUSH*"), makeSymbol("NODES"), makeSymbol("NEW-NODES")), list(makeSymbol("CPUSHNEW"), makeSymbol("INVERSE-UNIFIER"), makeSymbol("INVERSE-UNIFIERS")))), list(makeSymbol("WHEN-VERBOSE"), makeKeyword("GOALS"), list(makeSymbol("FIM"), makeSymbol("LOG"), list(makeSymbol("QUOTE"), makeSymbol("WARNING")), makeString("No matching sufficient conditions were found!")))), list(makeSymbol("RET"), list(makeSymbol("LIST"), makeSymbol("NEW-NODES"), makeSymbol("INVERSE-UNIFIERS")))));

    public static final SubLSymbol $sym317$OUTER_CATCH_FOR_SHOP_BASIC_PLAN_STATE_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-SHOP-BASIC-PLAN-STATE-METHOD");

    public static final SubLString $str318$Finding_sufficient_condition_rule = makeString("Finding sufficient condition rules for task...");

    public static final SubLList $list319 = list(makeSymbol("NODES"), makeSymbol("INVERSE-UNIFIER"));

    public static final SubLString $str320$No_matching_sufficient_conditions = makeString("No matching sufficient conditions were found!");

    public static final SubLSymbol SHOP_BASIC_PLAN_STATE_APPLY_ALL_SUFFICIENT_CONDITIONS_METHOD = makeSymbol("SHOP-BASIC-PLAN-STATE-APPLY-ALL-SUFFICIENT-CONDITIONS-METHOD");

    public static final SubLSymbol APPLY_SUFFICIENT_CONDITION = makeSymbol("APPLY-SUFFICIENT-CONDITION");

    public static final SubLList $list323 = list(makeSymbol("TASK"), makeSymbol("SCOND"));

    public static final SubLList $list324 = list(makeString("@param TASK hl-formula-p\n   @param SCOND shop-sufficiency-condition-p"), list(makeSymbol("CLET"), list(list(makeSymbol("NEW-NODES"), NIL), list(makeSymbol("UNIFIED-TASK-DATA"), list(makeSymbol("UNIFY-PLANNER-RULE"), makeSymbol("SELF"), makeSymbol("TASK"), makeSymbol("SCOND")))), list(makeSymbol("WHEN-VERBOSE"), makeKeyword("METHODS"), list(makeSymbol("FIM"), makeSymbol("LOG"), list(makeSymbol("QUOTE"), makeSymbol("LOG-PLANNER-RULE")), makeSymbol("SCOND"))), list(makeSymbol("PUNLESS"), list(EQ, makeSymbol("UNIFIED-TASK-DATA"), makeKeyword("FAIL")), list(makeSymbol("CDESTRUCTURING-BIND"), list(makeSymbol("NEW-MBINDINGS"), makeSymbol("CONDITION")), makeSymbol("UNIFIED-TASK-DATA"), list(makeSymbol("CLET"), list(list(makeSymbol("STATE-UNIFIERS"), list(makeSymbol("FIND-MBINDINGS"), makeSymbol("SELF"), makeSymbol("CONDITION"), makeSymbol("NEW-MBINDINGS"))), list(makeSymbol("INVERSE-UNIFIER"), list(makeSymbol("MULTIBINDING-INVERSE-LIST"), makeSymbol("NEW-MBINDINGS"), makeSymbol("STATE-UNIFIERS")))), list(makeSymbol("CDOLIST"), list(makeSymbol("CUR-UNIFIER"), makeSymbol("STATE-UNIFIERS")), list(makeSymbol("CLET"), list(list(makeSymbol("NEW-NODE"), list(makeSymbol("CREATE-NEXT"), makeSymbol("SELF")))), list(makeSymbol("INLINE-METHOD"), list(makeSymbol("ADD-TO-PARTIAL-PLAN"), makeSymbol("SHOP-BASIC-PLAN-STATE")), makeSymbol("NEW-NODE"), makeSymbol("TASK")), list(makeSymbol("INLINE-METHOD"), list(makeSymbol("ADD-TO-TASK-STRUCS"), makeSymbol("SHOP-BASIC-PLAN-STATE")), makeSymbol("NEW-NODE"), makeSymbol("SCOND")), list(makeSymbol("SET-SHOP-BASIC-PLAN-STATE-MBINDINGS"), makeSymbol("NEW-NODE"), makeSymbol("CUR-UNIFIER")), list(makeSymbol("INLINE-METHOD"), list(makeSymbol("SET-TASKLIST"), makeSymbol("SHOP-BASIC-PLAN-STATE")), makeSymbol("NEW-NODE"), list(makeSymbol("APPEND"), list(makeSymbol("BQ-LIST"), list(makeSymbol("BQ-LIST"), makeKeyword("SUPERTASK"), makeSymbol("TASK"))), list(makeSymbol("REST"), makeSymbol("TASKLIST")))), list(makeSymbol("CPUSH"), makeSymbol("NEW-NODE"), makeSymbol("NEW-NODES")))), list(makeSymbol("RET"), list(makeSymbol("LIST"), makeSymbol("NEW-NODES"), makeSymbol("INVERSE-UNIFIER")))))), list(makeSymbol("RET"), list(makeSymbol("LIST"), NIL, NIL))));

    public static final SubLSymbol $sym325$OUTER_CATCH_FOR_SHOP_BASIC_PLAN_STATE_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-SHOP-BASIC-PLAN-STATE-METHOD");

    public static final SubLList $list326 = list(makeSymbol("NEW-MBINDINGS"), makeSymbol("CONDITION"));

    public static final SubLSymbol SHOP_BASIC_PLAN_STATE_APPLY_SUFFICIENT_CONDITION_METHOD = makeSymbol("SHOP-BASIC-PLAN-STATE-APPLY-SUFFICIENT-CONDITION-METHOD");

    public static final SubLSymbol APPLY_ALL_PRECONDITIONS = makeSymbol("APPLY-ALL-PRECONDITIONS");

    public static final SubLList $list329 = list(makeString("@param TASK hl-formula-p\n   @return booleanp  -- t if preconditions for TASK are all satisfied by world state"), list(makeSymbol("CLET"), list(list(makeSymbol("PRECONDS"), list(makeSymbol("INLINE-METHOD"), list(makeSymbol("GET-PLANNER-RULES"), makeSymbol("SHOP-BASIC-DOMAIN")), makeSymbol("DOMAIN"), makeSymbol("TASK"), list(makeSymbol("QUOTE"), makeSymbol("SHOP-PRECONDITION-P")))), list(makeSymbol("TOTAL-NUM"), list(makeSymbol("LIST-LENGTH"), makeSymbol("PRECONDS")))), list(makeSymbol("WHEN-VERBOSE"), makeKeyword("OPERATORS"), list(makeSymbol("FIM"), makeSymbol("LOG"), list(makeSymbol("QUOTE"), makeSymbol("LOG-NEWLINE"))), list(makeSymbol("FIM"), makeSymbol("LOG"), list(makeSymbol("QUOTE"), makeSymbol("LOG-ENTRY")), makeString("Finding precondition rules for task..."))), list(makeSymbol("PIF"), list(makeSymbol("NULL"), makeSymbol("PRECONDS")), list(makeSymbol("PROGN"), list(makeSymbol("WHEN-VERBOSE"), makeKeyword("OPERATORS"), list(makeSymbol("FIM"), makeSymbol("LOG"), list(makeSymbol("QUOTE"), makeSymbol("WARNING")), makeString("No precondition rules found!"))), list(makeSymbol("RET"), T)), list(makeSymbol("PROGN"), list(makeSymbol("CDOLIST-NUMBERED"), list(makeSymbol("PRECOND"), makeSymbol("CUR-NUM"), makeSymbol("PRECONDS")), list(makeSymbol("WHEN-VERBOSE"), makeKeyword("OPERATORS"), list(makeSymbol("FIM"), makeSymbol("LOG"), list(makeSymbol("QUOTE"), makeSymbol("LOG-FANCY-ENTRY")), list(makeSymbol("FORMAT"), NIL, makeString("Trying [~s/~s]:"), list(makeSymbol("1+"), makeSymbol("CUR-NUM")), makeSymbol("TOTAL-NUM")), list(makeSymbol("QUOTE"), list(makeKeyword("BOLD")))), list(makeSymbol("FIM"), makeSymbol("LOG"), list(makeSymbol("QUOTE"), makeSymbol("LOG-NEWLINE")))), list(makeSymbol("PUNLESS"), list(makeSymbol("APPLY-PRECONDITION"), makeSymbol("SELF"), makeSymbol("TASK"), makeSymbol("PRECOND")), list(makeSymbol("RET"), NIL))), list(makeSymbol("RET"), T))), list(makeSymbol("RET"), NIL)));

    public static final SubLSymbol $sym330$OUTER_CATCH_FOR_SHOP_BASIC_PLAN_STATE_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-SHOP-BASIC-PLAN-STATE-METHOD");

    public static final SubLSymbol SHOP_PRECONDITION_P = makeSymbol("SHOP-PRECONDITION-P");

    public static final SubLString $str332$Finding_precondition_rules_for_ta = makeString("Finding precondition rules for task...");

    public static final SubLString $str333$No_precondition_rules_found_ = makeString("No precondition rules found!");

    public static final SubLSymbol SHOP_BASIC_PLAN_STATE_APPLY_ALL_PRECONDITIONS_METHOD = makeSymbol("SHOP-BASIC-PLAN-STATE-APPLY-ALL-PRECONDITIONS-METHOD");

    public static final SubLSymbol APPLY_PRECONDITION = makeSymbol("APPLY-PRECONDITION");

    public static final SubLList $list336 = list(makeSymbol("TASK"), makeSymbol("PRECOND"));

    public static final SubLList $list337 = list(makeString("@param TASK hl-formula-p\n   @param PRECOND shop-precondition-p\n   @return listp of multibinding-p"), list(makeSymbol("WHEN-VERBOSE"), makeKeyword("PLANNER-RULES"), list(makeSymbol("FIM"), makeSymbol("LOG"), list(makeSymbol("QUOTE"), makeSymbol("LOG-PLANNER-RULE")), makeSymbol("PRECOND"))), list(makeSymbol("CLET"), list(list(makeSymbol("UNIFIED-TASK-DATA"), list(makeSymbol("UNIFY-PLANNER-RULE"), makeSymbol("SELF"), makeSymbol("TASK"), makeSymbol("PRECOND")))), list(makeSymbol("PUNLESS"), list(EQ, makeKeyword("FAIL"), makeSymbol("UNIFIED-TASK-DATA")), list(makeSymbol("CDESTRUCTURING-BIND"), list(makeSymbol("NEW-MBINDINGS"), makeSymbol("PRE"), makeSymbol("REDUCTION")), makeSymbol("UNIFIED-TASK-DATA"), list(makeSymbol("IGNORE"), makeSymbol("REDUCTION")), list(makeSymbol("CLET"), list(list(makeSymbol("STATE-UNIFIERS"), list(makeSymbol("FIND-MBINDINGS"), makeSymbol("SELF"), makeSymbol("PRE"), makeSymbol("NEW-MBINDINGS")))), list(makeSymbol("PIF"), list(makeSymbol("NULL"), makeSymbol("STATE-UNIFIERS")), list(makeSymbol("PROGN"), list(makeSymbol("WHEN-VERBOSE"), makeKeyword("PLANNER-RULES"), list(makeSymbol("FIM"), makeSymbol("LOG"), list(makeSymbol("QUOTE"), makeSymbol("WARNING")), makeString("No bindings found!"))), list(makeSymbol("RET"), NIL)), list(makeSymbol("PROGN"), list(makeSymbol("RET"), makeSymbol("STATE-UNIFIERS")))))))));

    public static final SubLSymbol $sym338$OUTER_CATCH_FOR_SHOP_BASIC_PLAN_STATE_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-SHOP-BASIC-PLAN-STATE-METHOD");

    public static final SubLString $str339$No_bindings_found_ = makeString("No bindings found!");

    public static final SubLSymbol SHOP_BASIC_PLAN_STATE_APPLY_PRECONDITION_METHOD = makeSymbol("SHOP-BASIC-PLAN-STATE-APPLY-PRECONDITION-METHOD");

    public static SubLObject cpushX(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject list1 = NIL;
        SubLObject list2 = NIL;
        destructuring_bind_must_consp(current, datum, $list0);
        list1 = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list0);
        list2 = current.first();
        current = current.rest();
        if (NIL == current) {
            return list(CSETF, list2, list(APPEND, list1, list2));
        }
        cdestructuring_bind_error(datum, $list0);
        return NIL;
    }

    public static SubLObject when_verbose(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject required_verbose_level = NIL;
        destructuring_bind_must_consp(current, datum, $list3);
        required_verbose_level = current.first();
        final SubLObject body;
        current = body = current.rest();
        return list(CLET, bq_cons(list(ENTRY, listS(ASSOC, required_verbose_level, $list7)), $list8), listS(PWHEN, $list10, append(body, NIL)));
    }

    public static SubLObject shop_plan_state_p(final SubLObject shop_plan_state) {
        return interfaces.subloop_instanceof_interface(shop_plan_state, SHOP_PLAN_STATE);
    }

    public static SubLObject get_shop_basic_plan_state_dynamic_predicates(final SubLObject v_shop_basic_plan_state) {
        return classes.subloop_get_access_protected_instance_slot(v_shop_basic_plan_state, FIFTEEN_INTEGER, DYNAMIC_PREDICATES);
    }

    public static SubLObject set_shop_basic_plan_state_dynamic_predicates(final SubLObject v_shop_basic_plan_state, final SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(v_shop_basic_plan_state, value, FIFTEEN_INTEGER, DYNAMIC_PREDICATES);
    }

    public static SubLObject get_shop_basic_plan_state_model_mt(final SubLObject v_shop_basic_plan_state) {
        return classes.subloop_get_access_protected_instance_slot(v_shop_basic_plan_state, FOURTEEN_INTEGER, MODEL_MT);
    }

    public static SubLObject set_shop_basic_plan_state_model_mt(final SubLObject v_shop_basic_plan_state, final SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(v_shop_basic_plan_state, value, FOURTEEN_INTEGER, MODEL_MT);
    }

    public static SubLObject get_shop_basic_plan_state_domain(final SubLObject v_shop_basic_plan_state) {
        return classes.subloop_get_access_protected_instance_slot(v_shop_basic_plan_state, THIRTEEN_INTEGER, DOMAIN);
    }

    public static SubLObject set_shop_basic_plan_state_domain(final SubLObject v_shop_basic_plan_state, final SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(v_shop_basic_plan_state, value, THIRTEEN_INTEGER, DOMAIN);
    }

    public static SubLObject get_shop_basic_plan_state_log(final SubLObject v_shop_basic_plan_state) {
        return classes.subloop_get_access_protected_instance_slot(v_shop_basic_plan_state, TWELVE_INTEGER, LOG);
    }

    public static SubLObject set_shop_basic_plan_state_log(final SubLObject v_shop_basic_plan_state, final SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(v_shop_basic_plan_state, value, TWELVE_INTEGER, LOG);
    }

    public static SubLObject get_shop_basic_plan_state_planner(final SubLObject v_shop_basic_plan_state) {
        return classes.subloop_get_access_protected_instance_slot(v_shop_basic_plan_state, ELEVEN_INTEGER, PLANNER);
    }

    public static SubLObject set_shop_basic_plan_state_planner(final SubLObject v_shop_basic_plan_state, final SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(v_shop_basic_plan_state, value, ELEVEN_INTEGER, PLANNER);
    }

    public static SubLObject get_shop_basic_plan_state_previous_states(final SubLObject v_shop_basic_plan_state) {
        return classes.subloop_get_instance_slot(v_shop_basic_plan_state, TEN_INTEGER);
    }

    public static SubLObject set_shop_basic_plan_state_previous_states(final SubLObject v_shop_basic_plan_state, final SubLObject value) {
        return classes.subloop_set_instance_slot(v_shop_basic_plan_state, value, TEN_INTEGER);
    }

    public static SubLObject get_shop_basic_plan_state_depth(final SubLObject v_shop_basic_plan_state) {
        return classes.subloop_get_instance_slot(v_shop_basic_plan_state, NINE_INTEGER);
    }

    public static SubLObject set_shop_basic_plan_state_depth(final SubLObject v_shop_basic_plan_state, final SubLObject value) {
        return classes.subloop_set_instance_slot(v_shop_basic_plan_state, value, NINE_INTEGER);
    }

    public static SubLObject get_shop_basic_plan_state_query_properties(final SubLObject v_shop_basic_plan_state) {
        return classes.subloop_get_instance_slot(v_shop_basic_plan_state, EIGHT_INTEGER);
    }

    public static SubLObject set_shop_basic_plan_state_query_properties(final SubLObject v_shop_basic_plan_state, final SubLObject value) {
        return classes.subloop_set_instance_slot(v_shop_basic_plan_state, value, EIGHT_INTEGER);
    }

    public static SubLObject get_shop_basic_plan_state_post_ordering(final SubLObject v_shop_basic_plan_state) {
        return classes.subloop_get_instance_slot(v_shop_basic_plan_state, SEVEN_INTEGER);
    }

    public static SubLObject set_shop_basic_plan_state_post_ordering(final SubLObject v_shop_basic_plan_state, final SubLObject value) {
        return classes.subloop_set_instance_slot(v_shop_basic_plan_state, value, SEVEN_INTEGER);
    }

    public static SubLObject get_shop_basic_plan_state_partial_plan(final SubLObject v_shop_basic_plan_state) {
        return classes.subloop_get_instance_slot(v_shop_basic_plan_state, SIX_INTEGER);
    }

    public static SubLObject set_shop_basic_plan_state_partial_plan(final SubLObject v_shop_basic_plan_state, final SubLObject value) {
        return classes.subloop_set_instance_slot(v_shop_basic_plan_state, value, SIX_INTEGER);
    }

    public static SubLObject get_shop_basic_plan_state_supports(final SubLObject v_shop_basic_plan_state) {
        return classes.subloop_get_instance_slot(v_shop_basic_plan_state, FIVE_INTEGER);
    }

    public static SubLObject set_shop_basic_plan_state_supports(final SubLObject v_shop_basic_plan_state, final SubLObject value) {
        return classes.subloop_set_instance_slot(v_shop_basic_plan_state, value, FIVE_INTEGER);
    }

    public static SubLObject get_shop_basic_plan_state_task_strucs(final SubLObject v_shop_basic_plan_state) {
        return classes.subloop_get_instance_slot(v_shop_basic_plan_state, FOUR_INTEGER);
    }

    public static SubLObject set_shop_basic_plan_state_task_strucs(final SubLObject v_shop_basic_plan_state, final SubLObject value) {
        return classes.subloop_set_instance_slot(v_shop_basic_plan_state, value, FOUR_INTEGER);
    }

    public static SubLObject get_shop_basic_plan_state_mbindings(final SubLObject v_shop_basic_plan_state) {
        return classes.subloop_get_instance_slot(v_shop_basic_plan_state, THREE_INTEGER);
    }

    public static SubLObject set_shop_basic_plan_state_mbindings(final SubLObject v_shop_basic_plan_state, final SubLObject value) {
        return classes.subloop_set_instance_slot(v_shop_basic_plan_state, value, THREE_INTEGER);
    }

    public static SubLObject get_shop_basic_plan_state_tasklist(final SubLObject v_shop_basic_plan_state) {
        return classes.subloop_get_instance_slot(v_shop_basic_plan_state, TWO_INTEGER);
    }

    public static SubLObject set_shop_basic_plan_state_tasklist(final SubLObject v_shop_basic_plan_state, final SubLObject value) {
        return classes.subloop_set_instance_slot(v_shop_basic_plan_state, value, TWO_INTEGER);
    }

    public static SubLObject get_shop_basic_plan_state_world_state(final SubLObject v_shop_basic_plan_state) {
        return classes.subloop_get_instance_slot(v_shop_basic_plan_state, ONE_INTEGER);
    }

    public static SubLObject set_shop_basic_plan_state_world_state(final SubLObject v_shop_basic_plan_state, final SubLObject value) {
        return classes.subloop_set_instance_slot(v_shop_basic_plan_state, value, ONE_INTEGER);
    }

    public static SubLObject subloop_reserved_initialize_shop_basic_plan_state_class(final SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_COUNT, ZERO_INTEGER);
        return NIL;
    }

    public static SubLObject subloop_reserved_initialize_shop_basic_plan_state_instance(final SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, ISOLATED_P, NIL);
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_NUMBER, NIL);
        classes.subloop_initialize_slot(new_instance, SHOP_BASIC_PLAN_STATE, WORLD_STATE, NIL);
        classes.subloop_initialize_slot(new_instance, SHOP_BASIC_PLAN_STATE, TASKLIST, NIL);
        classes.subloop_initialize_slot(new_instance, SHOP_BASIC_PLAN_STATE, MBINDINGS, NIL);
        classes.subloop_initialize_slot(new_instance, SHOP_BASIC_PLAN_STATE, TASK_STRUCS, NIL);
        classes.subloop_initialize_slot(new_instance, SHOP_BASIC_PLAN_STATE, SUPPORTS, NIL);
        classes.subloop_initialize_slot(new_instance, SHOP_BASIC_PLAN_STATE, PARTIAL_PLAN, NIL);
        classes.subloop_initialize_slot(new_instance, SHOP_BASIC_PLAN_STATE, POST_ORDERING, NIL);
        classes.subloop_initialize_slot(new_instance, SHOP_BASIC_PLAN_STATE, QUERY_PROPERTIES, NIL);
        classes.subloop_initialize_slot(new_instance, SHOP_BASIC_PLAN_STATE, DEPTH, NIL);
        classes.subloop_initialize_slot(new_instance, SHOP_BASIC_PLAN_STATE, PREVIOUS_STATES, NIL);
        classes.subloop_initialize_slot(new_instance, SHOP_BASIC_PLAN_STATE, PLANNER, NIL);
        classes.subloop_initialize_slot(new_instance, SHOP_BASIC_PLAN_STATE, LOG, NIL);
        classes.subloop_initialize_slot(new_instance, SHOP_BASIC_PLAN_STATE, DOMAIN, NIL);
        classes.subloop_initialize_slot(new_instance, SHOP_BASIC_PLAN_STATE, MODEL_MT, NIL);
        classes.subloop_initialize_slot(new_instance, SHOP_BASIC_PLAN_STATE, DYNAMIC_PREDICATES, NIL);
        return NIL;
    }

    public static SubLObject shop_basic_plan_state_p(final SubLObject v_shop_basic_plan_state) {
        return classes.subloop_instanceof_class(v_shop_basic_plan_state, SHOP_BASIC_PLAN_STATE);
    }

    public static SubLObject shop_basic_plan_state_applicable_multibinding_method(final SubLObject self, final SubLObject mbind) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != shop_parameters.$shop_use_multibindingsP$.getDynamicValue(thread)) {
            return copy_list(multibindings.mb_simple_binding(mbind));
        }
        return mbind;
    }

    public static SubLObject shop_basic_plan_state_set_tasklist_method(final SubLObject self, final SubLObject tasks) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_shop_basic_plan_state_method = NIL;
        SubLObject tasklist = get_shop_basic_plan_state_tasklist(self);
        try {
            thread.throwStack.push($sym45$OUTER_CATCH_FOR_SHOP_BASIC_PLAN_STATE_METHOD);
            try {
                assert NIL != listp(tasks) : "Types.listp(tasks) " + "CommonSymbols.NIL != Types.listp(tasks) " + tasks;
                tasklist = tasks;
                sublisp_throw($sym45$OUTER_CATCH_FOR_SHOP_BASIC_PLAN_STATE_METHOD, tasks);
            } finally {
                final SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    set_shop_basic_plan_state_tasklist(self, tasklist);
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        } catch (final Throwable ccatch_env_var) {
            catch_var_for_shop_basic_plan_state_method = Errors.handleThrowable(ccatch_env_var, $sym45$OUTER_CATCH_FOR_SHOP_BASIC_PLAN_STATE_METHOD);
        } finally {
            thread.throwStack.pop();
        }
        return catch_var_for_shop_basic_plan_state_method;
    }

    public static SubLObject shop_basic_plan_state_get_tasklist_method(final SubLObject self) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_shop_basic_plan_state_method = NIL;
        final SubLObject tasklist = get_shop_basic_plan_state_tasklist(self);
        try {
            thread.throwStack.push($sym51$OUTER_CATCH_FOR_SHOP_BASIC_PLAN_STATE_METHOD);
            try {
                sublisp_throw($sym51$OUTER_CATCH_FOR_SHOP_BASIC_PLAN_STATE_METHOD, tasklist);
            } finally {
                final SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    set_shop_basic_plan_state_tasklist(self, tasklist);
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        } catch (final Throwable ccatch_env_var) {
            catch_var_for_shop_basic_plan_state_method = Errors.handleThrowable(ccatch_env_var, $sym51$OUTER_CATCH_FOR_SHOP_BASIC_PLAN_STATE_METHOD);
        } finally {
            thread.throwStack.pop();
        }
        return catch_var_for_shop_basic_plan_state_method;
    }

    public static SubLObject shop_basic_plan_state_add_decomposition_method(final SubLObject self, final SubLObject task, final SubLObject decomposition) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_shop_basic_plan_state_method = NIL;
        SubLObject tasklist = get_shop_basic_plan_state_tasklist(self);
        try {
            thread.throwStack.push($sym57$OUTER_CATCH_FOR_SHOP_BASIC_PLAN_STATE_METHOD);
            try {
                tasklist = append(decomposition, list(list($SUPERTASK, task)), tasklist);
                sublisp_throw($sym57$OUTER_CATCH_FOR_SHOP_BASIC_PLAN_STATE_METHOD, tasklist);
            } finally {
                final SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    set_shop_basic_plan_state_tasklist(self, tasklist);
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        } catch (final Throwable ccatch_env_var) {
            catch_var_for_shop_basic_plan_state_method = Errors.handleThrowable(ccatch_env_var, $sym57$OUTER_CATCH_FOR_SHOP_BASIC_PLAN_STATE_METHOD);
        } finally {
            thread.throwStack.pop();
        }
        return catch_var_for_shop_basic_plan_state_method;
    }

    public static SubLObject shop_basic_plan_state_set_multibindings_method(final SubLObject self, final SubLObject mbinding) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_shop_basic_plan_state_method = NIL;
        SubLObject mbindings = get_shop_basic_plan_state_mbindings(self);
        try {
            thread.throwStack.push($sym63$OUTER_CATCH_FOR_SHOP_BASIC_PLAN_STATE_METHOD);
            try {
                mbindings = mbinding;
                sublisp_throw($sym63$OUTER_CATCH_FOR_SHOP_BASIC_PLAN_STATE_METHOD, mbindings);
            } finally {
                final SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    set_shop_basic_plan_state_mbindings(self, mbindings);
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        } catch (final Throwable ccatch_env_var) {
            catch_var_for_shop_basic_plan_state_method = Errors.handleThrowable(ccatch_env_var, $sym63$OUTER_CATCH_FOR_SHOP_BASIC_PLAN_STATE_METHOD);
        } finally {
            thread.throwStack.pop();
        }
        return catch_var_for_shop_basic_plan_state_method;
    }

    public static SubLObject shop_basic_plan_state_multibindings_method(final SubLObject self) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_shop_basic_plan_state_method = NIL;
        final SubLObject mbindings = get_shop_basic_plan_state_mbindings(self);
        try {
            thread.throwStack.push($sym67$OUTER_CATCH_FOR_SHOP_BASIC_PLAN_STATE_METHOD);
            try {
                sublisp_throw($sym67$OUTER_CATCH_FOR_SHOP_BASIC_PLAN_STATE_METHOD, mbindings);
            } finally {
                final SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    set_shop_basic_plan_state_mbindings(self, mbindings);
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        } catch (final Throwable ccatch_env_var) {
            catch_var_for_shop_basic_plan_state_method = Errors.handleThrowable(ccatch_env_var, $sym67$OUTER_CATCH_FOR_SHOP_BASIC_PLAN_STATE_METHOD);
        } finally {
            thread.throwStack.pop();
        }
        return catch_var_for_shop_basic_plan_state_method;
    }

    public static SubLObject shop_basic_plan_state_set_domain_method(final SubLObject self, final SubLObject new_domain) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_shop_basic_plan_state_method = NIL;
        SubLObject domain = get_shop_basic_plan_state_domain(self);
        try {
            thread.throwStack.push($sym72$OUTER_CATCH_FOR_SHOP_BASIC_PLAN_STATE_METHOD);
            try {
                domain = new_domain;
                sublisp_throw($sym72$OUTER_CATCH_FOR_SHOP_BASIC_PLAN_STATE_METHOD, domain);
            } finally {
                final SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    set_shop_basic_plan_state_domain(self, domain);
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        } catch (final Throwable ccatch_env_var) {
            catch_var_for_shop_basic_plan_state_method = Errors.handleThrowable(ccatch_env_var, $sym72$OUTER_CATCH_FOR_SHOP_BASIC_PLAN_STATE_METHOD);
        } finally {
            thread.throwStack.pop();
        }
        return catch_var_for_shop_basic_plan_state_method;
    }

    public static SubLObject shop_basic_plan_state_get_domain_method(final SubLObject self) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_shop_basic_plan_state_method = NIL;
        final SubLObject domain = get_shop_basic_plan_state_domain(self);
        try {
            thread.throwStack.push($sym76$OUTER_CATCH_FOR_SHOP_BASIC_PLAN_STATE_METHOD);
            try {
                sublisp_throw($sym76$OUTER_CATCH_FOR_SHOP_BASIC_PLAN_STATE_METHOD, domain);
            } finally {
                final SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    set_shop_basic_plan_state_domain(self, domain);
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        } catch (final Throwable ccatch_env_var) {
            catch_var_for_shop_basic_plan_state_method = Errors.handleThrowable(ccatch_env_var, $sym76$OUTER_CATCH_FOR_SHOP_BASIC_PLAN_STATE_METHOD);
        } finally {
            thread.throwStack.pop();
        }
        return catch_var_for_shop_basic_plan_state_method;
    }

    public static SubLObject shop_basic_plan_state_support_lists_method(final SubLObject self) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_shop_basic_plan_state_method = NIL;
        final SubLObject supports = get_shop_basic_plan_state_supports(self);
        try {
            thread.throwStack.push($sym80$OUTER_CATCH_FOR_SHOP_BASIC_PLAN_STATE_METHOD);
            try {
                sublisp_throw($sym80$OUTER_CATCH_FOR_SHOP_BASIC_PLAN_STATE_METHOD, supports);
            } finally {
                final SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    set_shop_basic_plan_state_supports(self, supports);
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        } catch (final Throwable ccatch_env_var) {
            catch_var_for_shop_basic_plan_state_method = Errors.handleThrowable(ccatch_env_var, $sym80$OUTER_CATCH_FOR_SHOP_BASIC_PLAN_STATE_METHOD);
        } finally {
            thread.throwStack.pop();
        }
        return catch_var_for_shop_basic_plan_state_method;
    }

    public static SubLObject shop_basic_plan_state_add_to_support_lists_method(final SubLObject self, final SubLObject precond) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_shop_basic_plan_state_method = NIL;
        SubLObject supports = get_shop_basic_plan_state_supports(self);
        try {
            thread.throwStack.push($sym85$OUTER_CATCH_FOR_SHOP_BASIC_PLAN_STATE_METHOD);
            try {
                supports = cons(precond, supports);
                sublisp_throw($sym85$OUTER_CATCH_FOR_SHOP_BASIC_PLAN_STATE_METHOD, supports);
            } finally {
                final SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    set_shop_basic_plan_state_supports(self, supports);
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        } catch (final Throwable ccatch_env_var) {
            catch_var_for_shop_basic_plan_state_method = Errors.handleThrowable(ccatch_env_var, $sym85$OUTER_CATCH_FOR_SHOP_BASIC_PLAN_STATE_METHOD);
        } finally {
            thread.throwStack.pop();
        }
        return catch_var_for_shop_basic_plan_state_method;
    }

    public static SubLObject shop_basic_plan_state_initialize_method(final SubLObject self) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_shop_basic_plan_state_method = NIL;
        SubLObject depth = get_shop_basic_plan_state_depth(self);
        SubLObject post_ordering = get_shop_basic_plan_state_post_ordering(self);
        SubLObject supports = get_shop_basic_plan_state_supports(self);
        SubLObject task_strucs = get_shop_basic_plan_state_task_strucs(self);
        SubLObject mbindings = get_shop_basic_plan_state_mbindings(self);
        try {
            thread.throwStack.push($sym89$OUTER_CATCH_FOR_SHOP_BASIC_PLAN_STATE_METHOD);
            try {
                object.object_initialize_method(self);
                supports = NIL;
                mbindings = NIL;
                post_ordering = NIL;
                task_strucs = NIL;
                depth = ZERO_INTEGER;
                sublisp_throw($sym89$OUTER_CATCH_FOR_SHOP_BASIC_PLAN_STATE_METHOD, self);
            } finally {
                final SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    set_shop_basic_plan_state_depth(self, depth);
                    set_shop_basic_plan_state_post_ordering(self, post_ordering);
                    set_shop_basic_plan_state_supports(self, supports);
                    set_shop_basic_plan_state_task_strucs(self, task_strucs);
                    set_shop_basic_plan_state_mbindings(self, mbindings);
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        } catch (final Throwable ccatch_env_var) {
            catch_var_for_shop_basic_plan_state_method = Errors.handleThrowable(ccatch_env_var, $sym89$OUTER_CATCH_FOR_SHOP_BASIC_PLAN_STATE_METHOD);
        } finally {
            thread.throwStack.pop();
        }
        return catch_var_for_shop_basic_plan_state_method;
    }

    public static SubLObject shop_basic_plan_state_initialize_plan_state_with_problem_method(final SubLObject self, final SubLObject problem, final SubLObject planner_thread) {
        SubLObject new_tasks = shop_datastructures.shop_basic_problem_get_tasks_method(problem);
        final SubLObject new_world_state = shop_datastructures.shop_basic_problem_get_state_method(problem);
        new_tasks = shop_internals.shop_variable_manager_replace_variables_method(instances.get_slot(planner_thread, VAR_MANAGER), new_tasks, multibindings.empty_mb());
        shop_basic_plan_state_set_domain_method(self, instances.get_slot(problem, DOMAIN));
        shop_basic_plan_state_set_tasklist_method(self, new_tasks);
        shop_basic_plan_state_set_world_state_method(self, new_world_state);
        instances.set_slot(self, LOG, instances.get_slot(planner_thread, LOG));
        shop_basic_plan_state_set_planner_method(self, planner_thread);
        shop_basic_plan_state_init_model_with_problem_method(self, problem);
        shop_basic_plan_state_initialize_multibindings_method(self);
        instances.set_slot(self, QUERY_PROPERTIES, shop_inference.shop_query_properties(instances.get_slot(instances.get_slot(self, PLANNER), TIME_CUTOFF), instances.get_slot(instances.get_slot(self, PLANNER), NUM_BACKCHAINS)));
        return self;
    }

    public static SubLObject shop_basic_plan_state_initialize_multibindings_method(final SubLObject self) {
        final SubLObject tasklist = shop_basic_plan_state_get_tasklist_method(self);
        SubLObject mbinding = NIL;
        final SubLObject mt = instances.get_slot(self, MODEL_MT);
        if (NIL != groundP(tasklist, UNPROVIDED)) {
            mbinding = multibindings.empty_mb();
        } else
            if (NIL != list_utilities.singletonP(tasklist)) {
                mbinding = shop_internals.shop_initial_multibinding_for_task(tasklist.first(), mt);
            } else {
                Errors.warn($str102$INITIALIZE_MULTIBINGINGS__Initial);
            }

        shop_basic_plan_state_set_multibindings_method(self, mbinding);
        return mbinding;
    }

    public static SubLObject shop_basic_plan_state_output_message_method(final SubLObject self, final SubLObject string) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_shop_basic_plan_state_method = NIL;
        final SubLObject log = get_shop_basic_plan_state_log(self);
        try {
            thread.throwStack.push($sym107$OUTER_CATCH_FOR_SHOP_BASIC_PLAN_STATE_METHOD);
            try {
                sublisp_throw($sym107$OUTER_CATCH_FOR_SHOP_BASIC_PLAN_STATE_METHOD, shop_log.shop_log_log_entry_method(log, string));
            } finally {
                final SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    set_shop_basic_plan_state_log(self, log);
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        } catch (final Throwable ccatch_env_var) {
            catch_var_for_shop_basic_plan_state_method = Errors.handleThrowable(ccatch_env_var, $sym107$OUTER_CATCH_FOR_SHOP_BASIC_PLAN_STATE_METHOD);
        } finally {
            thread.throwStack.pop();
        }
        return catch_var_for_shop_basic_plan_state_method;
    }

    public static SubLObject shop_basic_plan_state_copy_method(final SubLObject self) {
        final SubLObject new_plan_state = object.object_new_method(SHOP_BASIC_PLAN_STATE);
        final SubLObject object_slots = classes.classes_all_slots(OBJECT, UNPROVIDED);
        SubLObject cdolist_list_var;
        final SubLObject slot_list = cdolist_list_var = set_difference(classes.classes_all_slots(subloop_structures.instance_class(self), UNPROVIDED), object_slots, UNPROVIDED, UNPROVIDED);
        SubLObject cur_slot = NIL;
        cur_slot = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            instances.set_slot(new_plan_state, cur_slot, instances.get_slot(self, cur_slot));
            cdolist_list_var = cdolist_list_var.rest();
            cur_slot = cdolist_list_var.first();
        } 
        return new_plan_state;
    }

    public static SubLObject shop_basic_plan_state_create_next_method(final SubLObject self) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_shop_basic_plan_state_method = NIL;
        final SubLObject depth = get_shop_basic_plan_state_depth(self);
        final SubLObject tasklist = get_shop_basic_plan_state_tasklist(self);
        try {
            thread.throwStack.push($sym114$OUTER_CATCH_FOR_SHOP_BASIC_PLAN_STATE_METHOD);
            try {
                final SubLObject new_state = shop_basic_plan_state_copy_method(self);
                shop_basic_plan_state_set_tasklist_method(new_state, tasklist.rest());
                shop_basic_plan_state_set_depth_method(new_state, number_utilities.f_1X(depth));
                sublisp_throw($sym114$OUTER_CATCH_FOR_SHOP_BASIC_PLAN_STATE_METHOD, new_state);
            } finally {
                final SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    set_shop_basic_plan_state_depth(self, depth);
                    set_shop_basic_plan_state_tasklist(self, tasklist);
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        } catch (final Throwable ccatch_env_var) {
            catch_var_for_shop_basic_plan_state_method = Errors.handleThrowable(ccatch_env_var, $sym114$OUTER_CATCH_FOR_SHOP_BASIC_PLAN_STATE_METHOD);
        } finally {
            thread.throwStack.pop();
        }
        return catch_var_for_shop_basic_plan_state_method;
    }

    public static SubLObject shop_basic_plan_state_init_model_with_problem_method(final SubLObject self, final SubLObject problem) {
        final SubLObject task_mt = instances.get_slot(problem, TASK_MT);
        instances.set_slot(self, MODEL_MT, task_mt);
        return NIL;
    }

    public static SubLObject shop_basic_plan_state_set_world_state_method(final SubLObject self, final SubLObject s) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_shop_basic_plan_state_method = NIL;
        SubLObject world_state = get_shop_basic_plan_state_world_state(self);
        try {
            thread.throwStack.push($sym124$OUTER_CATCH_FOR_SHOP_BASIC_PLAN_STATE_METHOD);
            try {
                if ((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) && (NIL == shop_basic_world_state.shop_world_state_p(s))) {
                    Errors.error($str125$_SET_WORLD_STATE__s____S_is_not_a, self, s);
                }
                world_state = s;
                sublisp_throw($sym124$OUTER_CATCH_FOR_SHOP_BASIC_PLAN_STATE_METHOD, s);
            } finally {
                final SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    set_shop_basic_plan_state_world_state(self, world_state);
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        } catch (final Throwable ccatch_env_var) {
            catch_var_for_shop_basic_plan_state_method = Errors.handleThrowable(ccatch_env_var, $sym124$OUTER_CATCH_FOR_SHOP_BASIC_PLAN_STATE_METHOD);
        } finally {
            thread.throwStack.pop();
        }
        return catch_var_for_shop_basic_plan_state_method;
    }

    public static SubLObject shop_basic_plan_state_get_world_state_method(final SubLObject self) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_shop_basic_plan_state_method = NIL;
        final SubLObject world_state = get_shop_basic_plan_state_world_state(self);
        try {
            thread.throwStack.push($sym129$OUTER_CATCH_FOR_SHOP_BASIC_PLAN_STATE_METHOD);
            try {
                sublisp_throw($sym129$OUTER_CATCH_FOR_SHOP_BASIC_PLAN_STATE_METHOD, world_state);
            } finally {
                final SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    set_shop_basic_plan_state_world_state(self, world_state);
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        } catch (final Throwable ccatch_env_var) {
            catch_var_for_shop_basic_plan_state_method = Errors.handleThrowable(ccatch_env_var, $sym129$OUTER_CATCH_FOR_SHOP_BASIC_PLAN_STATE_METHOD);
        } finally {
            thread.throwStack.pop();
        }
        return catch_var_for_shop_basic_plan_state_method;
    }

    public static SubLObject shop_basic_plan_state_mbinding_method(final SubLObject self) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_shop_basic_plan_state_method = NIL;
        final SubLObject mbindings = get_shop_basic_plan_state_mbindings(self);
        try {
            thread.throwStack.push($sym132$OUTER_CATCH_FOR_SHOP_BASIC_PLAN_STATE_METHOD);
            try {
                sublisp_throw($sym132$OUTER_CATCH_FOR_SHOP_BASIC_PLAN_STATE_METHOD, mbindings);
            } finally {
                final SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    set_shop_basic_plan_state_mbindings(self, mbindings);
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        } catch (final Throwable ccatch_env_var) {
            catch_var_for_shop_basic_plan_state_method = Errors.handleThrowable(ccatch_env_var, $sym132$OUTER_CATCH_FOR_SHOP_BASIC_PLAN_STATE_METHOD);
        } finally {
            thread.throwStack.pop();
        }
        return catch_var_for_shop_basic_plan_state_method;
    }

    public static SubLObject shop_basic_plan_state_set_depth_method(final SubLObject self, final SubLObject d) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_shop_basic_plan_state_method = NIL;
        SubLObject depth = get_shop_basic_plan_state_depth(self);
        try {
            thread.throwStack.push($sym137$OUTER_CATCH_FOR_SHOP_BASIC_PLAN_STATE_METHOD);
            try {
                assert NIL != integerp(d) : "Types.integerp(d) " + "CommonSymbols.NIL != Types.integerp(d) " + d;
                depth = d;
                sublisp_throw($sym137$OUTER_CATCH_FOR_SHOP_BASIC_PLAN_STATE_METHOD, d);
            } finally {
                final SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    set_shop_basic_plan_state_depth(self, depth);
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        } catch (final Throwable ccatch_env_var) {
            catch_var_for_shop_basic_plan_state_method = Errors.handleThrowable(ccatch_env_var, $sym137$OUTER_CATCH_FOR_SHOP_BASIC_PLAN_STATE_METHOD);
        } finally {
            thread.throwStack.pop();
        }
        return catch_var_for_shop_basic_plan_state_method;
    }

    public static SubLObject shop_basic_plan_state_depth_method(final SubLObject self) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_shop_basic_plan_state_method = NIL;
        final SubLObject depth = get_shop_basic_plan_state_depth(self);
        try {
            thread.throwStack.push($sym141$OUTER_CATCH_FOR_SHOP_BASIC_PLAN_STATE_METHOD);
            try {
                sublisp_throw($sym141$OUTER_CATCH_FOR_SHOP_BASIC_PLAN_STATE_METHOD, depth);
            } finally {
                final SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    set_shop_basic_plan_state_depth(self, depth);
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        } catch (final Throwable ccatch_env_var) {
            catch_var_for_shop_basic_plan_state_method = Errors.handleThrowable(ccatch_env_var, $sym141$OUTER_CATCH_FOR_SHOP_BASIC_PLAN_STATE_METHOD);
        } finally {
            thread.throwStack.pop();
        }
        return catch_var_for_shop_basic_plan_state_method;
    }

    public static SubLObject shop_basic_plan_state_set_previous_states_method(final SubLObject self, final SubLObject states) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_shop_basic_plan_state_method = NIL;
        SubLObject previous_states = get_shop_basic_plan_state_previous_states(self);
        try {
            thread.throwStack.push($sym146$OUTER_CATCH_FOR_SHOP_BASIC_PLAN_STATE_METHOD);
            try {
                previous_states = states;
                sublisp_throw($sym146$OUTER_CATCH_FOR_SHOP_BASIC_PLAN_STATE_METHOD, states);
            } finally {
                final SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    set_shop_basic_plan_state_previous_states(self, previous_states);
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        } catch (final Throwable ccatch_env_var) {
            catch_var_for_shop_basic_plan_state_method = Errors.handleThrowable(ccatch_env_var, $sym146$OUTER_CATCH_FOR_SHOP_BASIC_PLAN_STATE_METHOD);
        } finally {
            thread.throwStack.pop();
        }
        return catch_var_for_shop_basic_plan_state_method;
    }

    public static SubLObject shop_basic_plan_state_get_previous_states_method(final SubLObject self) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_shop_basic_plan_state_method = NIL;
        final SubLObject previous_states = get_shop_basic_plan_state_previous_states(self);
        try {
            thread.throwStack.push($sym150$OUTER_CATCH_FOR_SHOP_BASIC_PLAN_STATE_METHOD);
            try {
                sublisp_throw($sym150$OUTER_CATCH_FOR_SHOP_BASIC_PLAN_STATE_METHOD, previous_states);
            } finally {
                final SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    set_shop_basic_plan_state_previous_states(self, previous_states);
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        } catch (final Throwable ccatch_env_var) {
            catch_var_for_shop_basic_plan_state_method = Errors.handleThrowable(ccatch_env_var, $sym150$OUTER_CATCH_FOR_SHOP_BASIC_PLAN_STATE_METHOD);
        } finally {
            thread.throwStack.pop();
        }
        return catch_var_for_shop_basic_plan_state_method;
    }

    public static SubLObject shop_basic_plan_state_add_to_previous_states_method(final SubLObject self, final SubLObject state) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_shop_basic_plan_state_method = NIL;
        SubLObject previous_states = get_shop_basic_plan_state_previous_states(self);
        try {
            thread.throwStack.push($sym155$OUTER_CATCH_FOR_SHOP_BASIC_PLAN_STATE_METHOD);
            try {
                previous_states = cons(state, previous_states);
                sublisp_throw($sym155$OUTER_CATCH_FOR_SHOP_BASIC_PLAN_STATE_METHOD, previous_states);
            } finally {
                final SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    set_shop_basic_plan_state_previous_states(self, previous_states);
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        } catch (final Throwable ccatch_env_var) {
            catch_var_for_shop_basic_plan_state_method = Errors.handleThrowable(ccatch_env_var, $sym155$OUTER_CATCH_FOR_SHOP_BASIC_PLAN_STATE_METHOD);
        } finally {
            thread.throwStack.pop();
        }
        return catch_var_for_shop_basic_plan_state_method;
    }

    public static SubLObject shop_basic_plan_state_set_partial_plan_method(final SubLObject self, final SubLObject p) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_shop_basic_plan_state_method = NIL;
        SubLObject partial_plan = get_shop_basic_plan_state_partial_plan(self);
        try {
            thread.throwStack.push($sym160$OUTER_CATCH_FOR_SHOP_BASIC_PLAN_STATE_METHOD);
            try {
                partial_plan = p;
                sublisp_throw($sym160$OUTER_CATCH_FOR_SHOP_BASIC_PLAN_STATE_METHOD, p);
            } finally {
                final SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    set_shop_basic_plan_state_partial_plan(self, partial_plan);
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        } catch (final Throwable ccatch_env_var) {
            catch_var_for_shop_basic_plan_state_method = Errors.handleThrowable(ccatch_env_var, $sym160$OUTER_CATCH_FOR_SHOP_BASIC_PLAN_STATE_METHOD);
        } finally {
            thread.throwStack.pop();
        }
        return catch_var_for_shop_basic_plan_state_method;
    }

    public static SubLObject shop_basic_plan_state_get_partial_plan_method(final SubLObject self) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_shop_basic_plan_state_method = NIL;
        final SubLObject partial_plan = get_shop_basic_plan_state_partial_plan(self);
        try {
            thread.throwStack.push($sym164$OUTER_CATCH_FOR_SHOP_BASIC_PLAN_STATE_METHOD);
            try {
                sublisp_throw($sym164$OUTER_CATCH_FOR_SHOP_BASIC_PLAN_STATE_METHOD, partial_plan);
            } finally {
                final SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    set_shop_basic_plan_state_partial_plan(self, partial_plan);
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        } catch (final Throwable ccatch_env_var) {
            catch_var_for_shop_basic_plan_state_method = Errors.handleThrowable(ccatch_env_var, $sym164$OUTER_CATCH_FOR_SHOP_BASIC_PLAN_STATE_METHOD);
        } finally {
            thread.throwStack.pop();
        }
        return catch_var_for_shop_basic_plan_state_method;
    }

    public static SubLObject shop_basic_plan_state_add_to_partial_plan_method(final SubLObject self, final SubLObject task) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_shop_basic_plan_state_method = NIL;
        SubLObject partial_plan = get_shop_basic_plan_state_partial_plan(self);
        try {
            thread.throwStack.push($sym169$OUTER_CATCH_FOR_SHOP_BASIC_PLAN_STATE_METHOD);
            try {
                partial_plan = cons(task, partial_plan);
                sublisp_throw($sym169$OUTER_CATCH_FOR_SHOP_BASIC_PLAN_STATE_METHOD, partial_plan);
            } finally {
                final SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    set_shop_basic_plan_state_partial_plan(self, partial_plan);
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        } catch (final Throwable ccatch_env_var) {
            catch_var_for_shop_basic_plan_state_method = Errors.handleThrowable(ccatch_env_var, $sym169$OUTER_CATCH_FOR_SHOP_BASIC_PLAN_STATE_METHOD);
        } finally {
            thread.throwStack.pop();
        }
        return catch_var_for_shop_basic_plan_state_method;
    }

    public static SubLObject shop_basic_plan_state_add_to_post_ordering_method(final SubLObject self, final SubLObject task) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_shop_basic_plan_state_method = NIL;
        SubLObject post_ordering = get_shop_basic_plan_state_post_ordering(self);
        try {
            thread.throwStack.push($sym173$OUTER_CATCH_FOR_SHOP_BASIC_PLAN_STATE_METHOD);
            try {
                post_ordering = cons(task, post_ordering);
                sublisp_throw($sym173$OUTER_CATCH_FOR_SHOP_BASIC_PLAN_STATE_METHOD, post_ordering);
            } finally {
                final SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    set_shop_basic_plan_state_post_ordering(self, post_ordering);
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        } catch (final Throwable ccatch_env_var) {
            catch_var_for_shop_basic_plan_state_method = Errors.handleThrowable(ccatch_env_var, $sym173$OUTER_CATCH_FOR_SHOP_BASIC_PLAN_STATE_METHOD);
        } finally {
            thread.throwStack.pop();
        }
        return catch_var_for_shop_basic_plan_state_method;
    }

    public static SubLObject shop_basic_plan_state_add_to_mbindings_method(final SubLObject self, final SubLObject binding) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_shop_basic_plan_state_method = NIL;
        SubLObject mbindings = get_shop_basic_plan_state_mbindings(self);
        try {
            thread.throwStack.push($sym178$OUTER_CATCH_FOR_SHOP_BASIC_PLAN_STATE_METHOD);
            try {
                mbindings = multibindings.compose_multibindings(binding, mbindings);
                sublisp_throw($sym178$OUTER_CATCH_FOR_SHOP_BASIC_PLAN_STATE_METHOD, mbindings);
            } finally {
                final SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    set_shop_basic_plan_state_mbindings(self, mbindings);
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        } catch (final Throwable ccatch_env_var) {
            catch_var_for_shop_basic_plan_state_method = Errors.handleThrowable(ccatch_env_var, $sym178$OUTER_CATCH_FOR_SHOP_BASIC_PLAN_STATE_METHOD);
        } finally {
            thread.throwStack.pop();
        }
        return catch_var_for_shop_basic_plan_state_method;
    }

    public static SubLObject shop_basic_plan_state_planner_rules_method(final SubLObject self) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_shop_basic_plan_state_method = NIL;
        final SubLObject task_strucs = get_shop_basic_plan_state_task_strucs(self);
        try {
            thread.throwStack.push($sym182$OUTER_CATCH_FOR_SHOP_BASIC_PLAN_STATE_METHOD);
            try {
                sublisp_throw($sym182$OUTER_CATCH_FOR_SHOP_BASIC_PLAN_STATE_METHOD, task_strucs);
            } finally {
                final SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    set_shop_basic_plan_state_task_strucs(self, task_strucs);
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        } catch (final Throwable ccatch_env_var) {
            catch_var_for_shop_basic_plan_state_method = Errors.handleThrowable(ccatch_env_var, $sym182$OUTER_CATCH_FOR_SHOP_BASIC_PLAN_STATE_METHOD);
        } finally {
            thread.throwStack.pop();
        }
        return catch_var_for_shop_basic_plan_state_method;
    }

    public static SubLObject shop_basic_plan_state_add_to_task_strucs_method(final SubLObject self, final SubLObject task_struc) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_shop_basic_plan_state_method = NIL;
        SubLObject task_strucs = get_shop_basic_plan_state_task_strucs(self);
        try {
            thread.throwStack.push($sym187$OUTER_CATCH_FOR_SHOP_BASIC_PLAN_STATE_METHOD);
            try {
                task_strucs = cons(task_struc, task_strucs);
                sublisp_throw($sym187$OUTER_CATCH_FOR_SHOP_BASIC_PLAN_STATE_METHOD, task_strucs);
            } finally {
                final SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    set_shop_basic_plan_state_task_strucs(self, task_strucs);
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        } catch (final Throwable ccatch_env_var) {
            catch_var_for_shop_basic_plan_state_method = Errors.handleThrowable(ccatch_env_var, $sym187$OUTER_CATCH_FOR_SHOP_BASIC_PLAN_STATE_METHOD);
        } finally {
            thread.throwStack.pop();
        }
        return catch_var_for_shop_basic_plan_state_method;
    }

    public static SubLObject shop_basic_plan_state_task_strucs_method(final SubLObject self) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_shop_basic_plan_state_method = NIL;
        final SubLObject task_strucs = get_shop_basic_plan_state_task_strucs(self);
        try {
            thread.throwStack.push($sym189$OUTER_CATCH_FOR_SHOP_BASIC_PLAN_STATE_METHOD);
            try {
                sublisp_throw($sym189$OUTER_CATCH_FOR_SHOP_BASIC_PLAN_STATE_METHOD, task_strucs);
            } finally {
                final SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    set_shop_basic_plan_state_task_strucs(self, task_strucs);
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        } catch (final Throwable ccatch_env_var) {
            catch_var_for_shop_basic_plan_state_method = Errors.handleThrowable(ccatch_env_var, $sym189$OUTER_CATCH_FOR_SHOP_BASIC_PLAN_STATE_METHOD);
        } finally {
            thread.throwStack.pop();
        }
        return catch_var_for_shop_basic_plan_state_method;
    }

    public static SubLObject shop_basic_plan_state_get_planner_method(final SubLObject self) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_shop_basic_plan_state_method = NIL;
        final SubLObject planner = get_shop_basic_plan_state_planner(self);
        try {
            thread.throwStack.push($sym193$OUTER_CATCH_FOR_SHOP_BASIC_PLAN_STATE_METHOD);
            try {
                sublisp_throw($sym193$OUTER_CATCH_FOR_SHOP_BASIC_PLAN_STATE_METHOD, planner);
            } finally {
                final SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    set_shop_basic_plan_state_planner(self, planner);
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        } catch (final Throwable ccatch_env_var) {
            catch_var_for_shop_basic_plan_state_method = Errors.handleThrowable(ccatch_env_var, $sym193$OUTER_CATCH_FOR_SHOP_BASIC_PLAN_STATE_METHOD);
        } finally {
            thread.throwStack.pop();
        }
        return catch_var_for_shop_basic_plan_state_method;
    }

    public static SubLObject shop_basic_plan_state_set_planner_method(final SubLObject self, final SubLObject p) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_shop_basic_plan_state_method = NIL;
        SubLObject planner = get_shop_basic_plan_state_planner(self);
        try {
            thread.throwStack.push($sym197$OUTER_CATCH_FOR_SHOP_BASIC_PLAN_STATE_METHOD);
            try {
                planner = p;
                sublisp_throw($sym197$OUTER_CATCH_FOR_SHOP_BASIC_PLAN_STATE_METHOD, p);
            } finally {
                final SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    set_shop_basic_plan_state_planner(self, planner);
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        } catch (final Throwable ccatch_env_var) {
            catch_var_for_shop_basic_plan_state_method = Errors.handleThrowable(ccatch_env_var, $sym197$OUTER_CATCH_FOR_SHOP_BASIC_PLAN_STATE_METHOD);
        } finally {
            thread.throwStack.pop();
        }
        return catch_var_for_shop_basic_plan_state_method;
    }

    public static SubLObject shop_basic_plan_state_get_which_plans_method(final SubLObject self) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_shop_basic_plan_state_method = NIL;
        final SubLObject planner = get_shop_basic_plan_state_planner(self);
        try {
            thread.throwStack.push($sym201$OUTER_CATCH_FOR_SHOP_BASIC_PLAN_STATE_METHOD);
            try {
                if ((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) && (NIL == planner)) {
                    Errors.error($str202$_GET_WHICH_PLANS__S___No_planner_, self);
                }
                sublisp_throw($sym201$OUTER_CATCH_FOR_SHOP_BASIC_PLAN_STATE_METHOD, shop_basic_planner_thread.shop_basic_planner_thread_get_which_plans_method(planner));
            } finally {
                final SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    set_shop_basic_plan_state_planner(self, planner);
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        } catch (final Throwable ccatch_env_var) {
            catch_var_for_shop_basic_plan_state_method = Errors.handleThrowable(ccatch_env_var, $sym201$OUTER_CATCH_FOR_SHOP_BASIC_PLAN_STATE_METHOD);
        } finally {
            thread.throwStack.pop();
        }
        return catch_var_for_shop_basic_plan_state_method;
    }

    public static SubLObject shop_basic_plan_state_simple_situation_predP_method(final SubLObject self, final SubLObject pred) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_shop_basic_plan_state_method = NIL;
        final SubLObject model_mt = get_shop_basic_plan_state_model_mt(self);
        final SubLObject domain = get_shop_basic_plan_state_domain(self);
        try {
            thread.throwStack.push($sym207$OUTER_CATCH_FOR_SHOP_BASIC_PLAN_STATE_METHOD);
            try {
                final SubLObject pred_set = instances.get_slot(domain, SIMPLE_SITUATION_PREDS);
                if (NIL != set.set_memberP(pred, pred_set)) {
                    sublisp_throw($sym207$OUTER_CATCH_FOR_SHOP_BASIC_PLAN_STATE_METHOD, T);
                }
                if (NIL != isa.isaP(pred, $$SimpleSituationPredicate, model_mt, UNPROVIDED)) {
                    set.set_add(pred, pred_set);
                    sublisp_throw($sym207$OUTER_CATCH_FOR_SHOP_BASIC_PLAN_STATE_METHOD, T);
                }
                sublisp_throw($sym207$OUTER_CATCH_FOR_SHOP_BASIC_PLAN_STATE_METHOD, NIL);
            } finally {
                final SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    set_shop_basic_plan_state_model_mt(self, model_mt);
                    set_shop_basic_plan_state_domain(self, domain);
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        } catch (final Throwable ccatch_env_var) {
            catch_var_for_shop_basic_plan_state_method = Errors.handleThrowable(ccatch_env_var, $sym207$OUTER_CATCH_FOR_SHOP_BASIC_PLAN_STATE_METHOD);
        } finally {
            thread.throwStack.pop();
        }
        return catch_var_for_shop_basic_plan_state_method;
    }

    public static SubLObject shop_basic_plan_state_seek_total_mbindings_method(final SubLObject self, final SubLObject goals, final SubLObject mbind) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_shop_basic_plan_state_method = NIL;
        final SubLObject model_mt = get_shop_basic_plan_state_model_mt(self);
        final SubLObject log = get_shop_basic_plan_state_log(self);
        final SubLObject planner = get_shop_basic_plan_state_planner(self);
        final SubLObject query_properties = get_shop_basic_plan_state_query_properties(self);
        final SubLObject mbindings = get_shop_basic_plan_state_mbindings(self);
        final SubLObject world_state = get_shop_basic_plan_state_world_state(self);
        try {
            thread.throwStack.push($sym214$OUTER_CATCH_FOR_SHOP_BASIC_PLAN_STATE_METHOD);
            try {
                if (NIL == goals) {
                    sublisp_throw($sym214$OUTER_CATCH_FOR_SHOP_BASIC_PLAN_STATE_METHOD, list(mbind));
                }
                final SubLObject backchain = instances.get_slot(planner, NUM_BACKCHAINS);
                SubLObject v_bindings = NIL;
                SubLObject mbindings_$1 = NIL;
                SubLObject halt_reason = NIL;
                SubLObject inference = NIL;
                SubLObject _prev_bind_0 = $within_assert$.currentBinding(thread);
                final SubLObject _prev_bind_2 = wff_utilities.$check_arg_typesP$.currentBinding(thread);
                final SubLObject _prev_bind_3 = at_vars.$at_check_arg_typesP$.currentBinding(thread);
                final SubLObject _prev_bind_4 = wff_utilities.$check_wff_semanticsP$.currentBinding(thread);
                final SubLObject _prev_bind_5 = wff_utilities.$check_wff_coherenceP$.currentBinding(thread);
                final SubLObject _prev_bind_6 = wff_utilities.$check_var_typesP$.currentBinding(thread);
                final SubLObject _prev_bind_7 = czer_vars.$simplify_literalP$.currentBinding(thread);
                final SubLObject _prev_bind_8 = at_vars.$at_check_relator_constraintsP$.currentBinding(thread);
                final SubLObject _prev_bind_9 = at_vars.$at_check_arg_formatP$.currentBinding(thread);
                final SubLObject _prev_bind_10 = wff_vars.$validate_constantsP$.currentBinding(thread);
                final SubLObject _prev_bind_11 = system_parameters.$suspend_sbhl_type_checkingP$.currentBinding(thread);
                final SubLObject _prev_bind_12 = api_control_vars.$generate_readable_fi_results$.currentBinding(thread);
                final SubLObject _prev_bind_13 = wff_utilities.$check_arityP$.currentBinding(thread);
                final SubLObject _prev_bind_14 = wff_utilities.$check_wff_constantsP$.currentBinding(thread);
                final SubLObject _prev_bind_15 = czer_vars.$simplify_sentenceP$.currentBinding(thread);
                final SubLObject _prev_bind_16 = czer_vars.$turn_existentials_into_skolemsP$.currentBinding(thread);
                final SubLObject _prev_bind_17 = czer_vars.$canonicalize_literalsP$.currentBinding(thread);
                final SubLObject _prev_bind_18 = czer_vars.$canonicalize_functionsP$.currentBinding(thread);
                try {
                    $within_assert$.bind(NIL, thread);
                    wff_utilities.$check_arg_typesP$.bind(NIL, thread);
                    at_vars.$at_check_arg_typesP$.bind(NIL, thread);
                    wff_utilities.$check_wff_semanticsP$.bind(NIL, thread);
                    wff_utilities.$check_wff_coherenceP$.bind(NIL, thread);
                    wff_utilities.$check_var_typesP$.bind(NIL, thread);
                    czer_vars.$simplify_literalP$.bind(NIL, thread);
                    at_vars.$at_check_relator_constraintsP$.bind(NIL, thread);
                    at_vars.$at_check_arg_formatP$.bind(NIL, thread);
                    wff_vars.$validate_constantsP$.bind(NIL, thread);
                    system_parameters.$suspend_sbhl_type_checkingP$.bind(T, thread);
                    api_control_vars.$generate_readable_fi_results$.bind(NIL, thread);
                    wff_utilities.$check_arityP$.bind(T, thread);
                    wff_utilities.$check_wff_constantsP$.bind(NIL, thread);
                    czer_vars.$simplify_sentenceP$.bind(NIL, thread);
                    czer_vars.$turn_existentials_into_skolemsP$.bind(NIL, thread);
                    czer_vars.$canonicalize_literalsP$.bind(NIL, thread);
                    czer_vars.$canonicalize_functionsP$.bind($shop_canonicalize_functionsP$.getDynamicValue(thread), thread);
                    if (NIL != shop_parameters.$shop_use_mt_world_statesP$.getDynamicValue(thread)) {
                        v_bindings = shop_mt_world_state.shop_mt_world_state_ask_method(world_state, cons($$and, goals), mbind, backchain);
                    } else {
                        final SubLObject _prev_bind_0_$2 = shop_parameters.$shop_ask_plan_state$.currentBinding(thread);
                        final SubLObject _prev_bind_1_$3 = shop_parameters.$shop_ask_multibinding$.currentBinding(thread);
                        try {
                            shop_parameters.$shop_ask_plan_state$.bind(get_shop_basic_plan_state_world_state(self), thread);
                            shop_parameters.$shop_ask_multibinding$.bind(get_shop_basic_plan_state_mbindings(self), thread);
                            if (NIL != shop_parameters.$shop_use_shop_askP$.getDynamicValue(thread)) {
                                thread.resetMultipleValues();
                                final SubLObject v_bindings_$4 = shop_inference.shop_ask_int(cons($$and, goals), model_mt, query_properties);
                                final SubLObject halt_reason_$5 = thread.secondMultipleValue();
                                final SubLObject inference_$6 = thread.thirdMultipleValue();
                                thread.resetMultipleValues();
                                v_bindings = v_bindings_$4;
                                halt_reason = halt_reason_$5;
                                inference = inference_$6;
                            } else {
                                thread.resetMultipleValues();
                                final SubLObject v_bindings_$5 = inference_kernel.new_cyc_query(cons($$and, goals), model_mt, query_properties);
                                final SubLObject halt_reason_$6 = thread.secondMultipleValue();
                                final SubLObject inference_$7 = thread.thirdMultipleValue();
                                thread.resetMultipleValues();
                                v_bindings = v_bindings_$5;
                                halt_reason = halt_reason_$6;
                                inference = inference_$7;
                            }
                        } finally {
                            shop_parameters.$shop_ask_multibinding$.rebind(_prev_bind_1_$3, thread);
                            shop_parameters.$shop_ask_plan_state$.rebind(_prev_bind_0_$2, thread);
                        }
                        v_bindings = shop_basic_world_state.confirm_bindings_against_world_state(world_state, goals, v_bindings);
                    }
                } finally {
                    czer_vars.$canonicalize_functionsP$.rebind(_prev_bind_18, thread);
                    czer_vars.$canonicalize_literalsP$.rebind(_prev_bind_17, thread);
                    czer_vars.$turn_existentials_into_skolemsP$.rebind(_prev_bind_16, thread);
                    czer_vars.$simplify_sentenceP$.rebind(_prev_bind_15, thread);
                    wff_utilities.$check_wff_constantsP$.rebind(_prev_bind_14, thread);
                    wff_utilities.$check_arityP$.rebind(_prev_bind_13, thread);
                    api_control_vars.$generate_readable_fi_results$.rebind(_prev_bind_12, thread);
                    system_parameters.$suspend_sbhl_type_checkingP$.rebind(_prev_bind_11, thread);
                    wff_vars.$validate_constantsP$.rebind(_prev_bind_10, thread);
                    at_vars.$at_check_arg_formatP$.rebind(_prev_bind_9, thread);
                    at_vars.$at_check_relator_constraintsP$.rebind(_prev_bind_8, thread);
                    czer_vars.$simplify_literalP$.rebind(_prev_bind_7, thread);
                    wff_utilities.$check_var_typesP$.rebind(_prev_bind_6, thread);
                    wff_utilities.$check_wff_coherenceP$.rebind(_prev_bind_5, thread);
                    wff_utilities.$check_wff_semanticsP$.rebind(_prev_bind_4, thread);
                    at_vars.$at_check_arg_typesP$.rebind(_prev_bind_3, thread);
                    wff_utilities.$check_arg_typesP$.rebind(_prev_bind_2, thread);
                    $within_assert$.rebind(_prev_bind_0, thread);
                }
                shop_internals.shop_statistic_manager_add_inference_method(instances.get_slot(planner, STATS_MANAGER));
                final SubLObject entry = assoc($CYC_QUERY, shop_internals.$shop_verbose_keys$.getDynamicValue(thread), UNPROVIDED, UNPROVIDED);
                final SubLObject verbose_msg_level = (NIL != entry) ? entry.rest() : ZERO_INTEGER;
                final SubLObject verbose_thread_level = instances.get_slot(instances.get_slot(self, LOG), VERBOSE);
                if (verbose_thread_level.numGE(verbose_msg_level)) {
                    methods.funcall_instance_method_with_3_args(log, LOG_INFERENCE, v_bindings, halt_reason, inference);
                }
                if (NIL == shop_parameters.$shop_use_inference_supportsP$.getDynamicValue(thread)) {
                    v_bindings = pairlis(v_bindings, make_list(length(v_bindings), list(NIL)), UNPROVIDED);
                }
                if (NIL != v_bindings) {
                    if (caar(v_bindings).equal($list220)) {
                        mbindings_$1 = list(mbind);
                    } else {
                        _prev_bind_0 = multibindings.$mb_reify_natsP$.currentBinding(thread);
                        try {
                            multibindings.$mb_reify_natsP$.bind(NIL, thread);
                            mbindings_$1 = multibindings.convert_binding_lists_and_supports_to_mbinds(v_bindings, mbind, UNPROVIDED);
                        } finally {
                            multibindings.$mb_reify_natsP$.rebind(_prev_bind_0, thread);
                        }
                    }
                }
                if (NIL != multibindings.multibinding_failedP(mbindings_$1)) {
                    sublisp_throw($sym214$OUTER_CATCH_FOR_SHOP_BASIC_PLAN_STATE_METHOD, NIL);
                } else {
                    sublisp_throw($sym214$OUTER_CATCH_FOR_SHOP_BASIC_PLAN_STATE_METHOD, mbindings_$1);
                }
            } finally {
                final SubLObject _prev_bind_19 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    set_shop_basic_plan_state_model_mt(self, model_mt);
                    set_shop_basic_plan_state_log(self, log);
                    set_shop_basic_plan_state_planner(self, planner);
                    set_shop_basic_plan_state_query_properties(self, query_properties);
                    set_shop_basic_plan_state_mbindings(self, mbindings);
                    set_shop_basic_plan_state_world_state(self, world_state);
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_19, thread);
                }
            }
        } catch (final Throwable ccatch_env_var) {
            catch_var_for_shop_basic_plan_state_method = Errors.handleThrowable(ccatch_env_var, $sym214$OUTER_CATCH_FOR_SHOP_BASIC_PLAN_STATE_METHOD);
        } finally {
            thread.throwStack.pop();
        }
        return catch_var_for_shop_basic_plan_state_method;
    }

    public static SubLObject shop_basic_plan_state_find_mbindings_method(final SubLObject self, final SubLObject goals, final SubLObject mbinding) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != shop_parameters.$shop_infer_complete_preconditionsP$.getDynamicValue(thread)) {
            return shop_basic_plan_state_seek_total_mbindings_method(self, goals, multibindings.copy_multibinding(mbinding));
        }
        return NIL;
    }

    public static SubLObject shop_same_taskP(final SubLObject task1, final SubLObject task2) {
        if (task1.equal(task2)) {
            return T;
        }
        final SubLObject mgu = shop_datastructures.shop_unify(task1, task2);
        if (NIL == shop_datastructures.shop_unify_failedP(mgu)) {
            return T;
        }
        return NIL;
    }

    public static SubLObject shop_find_next_match(final SubLObject task, final SubLObject potentials) {
        return member(task, potentials, $sym226$SHOP_SAME_TASK_, UNPROVIDED);
    }

    public static SubLObject shop_basic_plan_state_parent_taskP_method(final SubLObject self, final SubLObject task) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_shop_basic_plan_state_method = NIL;
        final SubLObject post_ordering = get_shop_basic_plan_state_post_ordering(self);
        final SubLObject partial_plan = get_shop_basic_plan_state_partial_plan(self);
        SubLObject mbindings = get_shop_basic_plan_state_mbindings(self);
        try {
            thread.throwStack.push($sym229$OUTER_CATCH_FOR_SHOP_BASIC_PLAN_STATE_METHOD);
            try {
                final SubLObject potential_list = partial_plan;
                SubLObject cur_potentials;
                SubLObject cur_task;
                SubLObject unifer;
                SubLObject _prev_bind_0;
                SubLObject unifier_mb;
                SubLObject inverse_mb;
                for (cur_potentials = NIL, cur_potentials = shop_find_next_match(task, potential_list); NIL != cur_potentials; cur_potentials = shop_find_next_match(task, cur_potentials.rest())) {
                    cur_task = cur_potentials.first();
                    if (task.equal(cur_task) && (NIL == subl_promotions.memberP(cur_task, post_ordering, symbol_function(EQ), UNPROVIDED))) {
                        sublisp_throw($sym229$OUTER_CATCH_FOR_SHOP_BASIC_PLAN_STATE_METHOD, T);
                    }
                    unifer = shop_datastructures.shop_unify(task, cur_task);
                    if (NIL == shop_datastructures.shop_unify_failedP(unifer)) {
                        _prev_bind_0 = multibindings.$mb_reify_natsP$.currentBinding(thread);
                        try {
                            multibindings.$mb_reify_natsP$.bind(NIL, thread);
                            unifier_mb = multibindings.convert_binding_to_mbind(unifer, mbindings);
                            if (NIL != unifier_mb) {
                                inverse_mb = multibindings.mb_inverse(mbindings, unifier_mb);
                                if (NIL != shop_datastructures.shop_unify_failedP(inverse_mb)) {
                                    if (NIL == subl_promotions.memberP(cur_task, post_ordering, symbol_function(EQ), UNPROVIDED)) {
                                        sublisp_throw($sym229$OUTER_CATCH_FOR_SHOP_BASIC_PLAN_STATE_METHOD, T);
                                    }
                                } else {
                                    mbindings = inverse_mb;
                                }
                            }
                        } finally {
                            multibindings.$mb_reify_natsP$.rebind(_prev_bind_0, thread);
                        }
                    }
                }
                sublisp_throw($sym229$OUTER_CATCH_FOR_SHOP_BASIC_PLAN_STATE_METHOD, NIL);
                sublisp_throw($sym229$OUTER_CATCH_FOR_SHOP_BASIC_PLAN_STATE_METHOD, NIL);
            } finally {
                final SubLObject _prev_bind_2 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    set_shop_basic_plan_state_post_ordering(self, post_ordering);
                    set_shop_basic_plan_state_partial_plan(self, partial_plan);
                    set_shop_basic_plan_state_mbindings(self, mbindings);
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_2, thread);
                }
            }
        } catch (final Throwable ccatch_env_var) {
            catch_var_for_shop_basic_plan_state_method = Errors.handleThrowable(ccatch_env_var, $sym229$OUTER_CATCH_FOR_SHOP_BASIC_PLAN_STATE_METHOD);
        } finally {
            thread.throwStack.pop();
        }
        return catch_var_for_shop_basic_plan_state_method;
    }

    public static SubLObject shop_basic_plan_state_expand_method(final SubLObject self) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_shop_basic_plan_state_method = NIL;
        final SubLObject log = get_shop_basic_plan_state_log(self);
        final SubLObject depth = get_shop_basic_plan_state_depth(self);
        SubLObject tasklist = get_shop_basic_plan_state_tasklist(self);
        try {
            thread.throwStack.push($sym233$OUTER_CATCH_FOR_SHOP_BASIC_PLAN_STATE_METHOD);
            try {
                final SubLObject task1 = tasklist.first();
                final SubLObject taskname = cycl_utilities.formula_operator(task1);
                SubLObject entry = assoc($TASKS, shop_internals.$shop_verbose_keys$.getDynamicValue(thread), UNPROVIDED, UNPROVIDED);
                SubLObject verbose_msg_level = (NIL != entry) ? entry.rest() : ZERO_INTEGER;
                SubLObject verbose_thread_level = instances.get_slot(instances.get_slot(self, LOG), VERBOSE);
                if (verbose_thread_level.numGE(verbose_msg_level)) {
                    methods.funcall_instance_method_with_0_args(log, NEW_SECTION);
                    methods.funcall_instance_method_with_1_args(log, LOG_HEADING, format(NIL, $str237$Search_Depth__s, depth));
                    shop_basic_plan_state_output_message_method(self, format(NIL, $str238$task__s, task1));
                    final SubLObject entry_$10 = assoc($ALL, shop_internals.$shop_verbose_keys$.getDynamicValue(thread), UNPROVIDED, UNPROVIDED);
                    final SubLObject verbose_msg_level_$11 = (NIL != entry_$10) ? entry_$10.rest() : ZERO_INTEGER;
                    final SubLObject verbose_thread_level_$12 = instances.get_slot(instances.get_slot(self, LOG), VERBOSE);
                    if (verbose_thread_level_$12.numGE(verbose_msg_level_$11)) {
                    }
                }
                if (taskname == $SUPERTASK) {
                    shop_basic_plan_state_add_to_post_ordering_method(self, cycl_utilities.formula_arg1(task1, UNPROVIDED));
                    tasklist = tasklist.rest();
                    sublisp_throw($sym233$OUTER_CATCH_FOR_SHOP_BASIC_PLAN_STATE_METHOD, list(self));
                } else
                    if ((NIL != shop_parameters.$shop_method_cycle_checking_enabledP$.getDynamicValue(thread)) && (NIL != shop_basic_plan_state_parent_taskP_method(self, task1))) {
                        entry = assoc($GOALS, shop_internals.$shop_verbose_keys$.getDynamicValue(thread), UNPROVIDED, UNPROVIDED);
                        verbose_msg_level = (NIL != entry) ? entry.rest() : ZERO_INTEGER;
                        verbose_thread_level = instances.get_slot(instances.get_slot(self, LOG), VERBOSE);
                        if (verbose_thread_level.numGE(verbose_msg_level)) {
                            methods.funcall_instance_method_with_1_args(log, WARNING, $str242$Prune____Method_Cycle_checking_de);
                        }
                        sublisp_throw($sym233$OUTER_CATCH_FOR_SHOP_BASIC_PLAN_STATE_METHOD, NIL);
                    } else
                        if (NIL != shop_basic_plan_state_simple_situation_predP_method(self, taskname)) {
                            sublisp_throw($sym233$OUTER_CATCH_FOR_SHOP_BASIC_PLAN_STATE_METHOD, shop_basic_plan_state_expand_primitive_preconditions_method(self, task1));
                        } else {
                            sublisp_throw($sym233$OUTER_CATCH_FOR_SHOP_BASIC_PLAN_STATE_METHOD, shop_basic_plan_state_expand_complex_method(self, task1));
                        }


            } finally {
                final SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    set_shop_basic_plan_state_log(self, log);
                    set_shop_basic_plan_state_depth(self, depth);
                    set_shop_basic_plan_state_tasklist(self, tasklist);
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        } catch (final Throwable ccatch_env_var) {
            catch_var_for_shop_basic_plan_state_method = Errors.handleThrowable(ccatch_env_var, $sym233$OUTER_CATCH_FOR_SHOP_BASIC_PLAN_STATE_METHOD);
        } finally {
            thread.throwStack.pop();
        }
        return catch_var_for_shop_basic_plan_state_method;
    }

    public static SubLObject shop_basic_plan_state_expand_complex_method(final SubLObject self, final SubLObject task) {
        SubLObject current;
        final SubLObject datum = current = shop_basic_plan_state_apply_all_sufficient_conditions_method(self, task);
        SubLObject scond_nodes = NIL;
        SubLObject inverse_unifiers = NIL;
        destructuring_bind_must_consp(current, datum, $list246);
        scond_nodes = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list246);
        inverse_unifiers = current.first();
        current = current.rest();
        if (NIL == current) {
            SubLObject method_nodes = NIL;
            if (NIL != scond_nodes) {
                SubLObject cdolist_list_var = inverse_unifiers;
                SubLObject cur_unifier = NIL;
                cur_unifier = cdolist_list_var.first();
                while (NIL != cdolist_list_var) {
                    if (NIL == multibindings.multibinding_failedP(cur_unifier)) {
                        final SubLObject simple_unifier = shop_basic_plan_state_applicable_multibinding_method(self, cur_unifier);
                        SubLObject cdolist_list_var_$13;
                        final SubLObject new_tasks = cdolist_list_var_$13 = multibindings.apply_multibinding(task, simple_unifier);
                        SubLObject cur_task = NIL;
                        cur_task = cdolist_list_var_$13.first();
                        while (NIL != cdolist_list_var_$13) {
                            method_nodes = append(shop_basic_plan_state_apply_all_methods_method(self, cur_task), method_nodes);
                            cdolist_list_var_$13 = cdolist_list_var_$13.rest();
                            cur_task = cdolist_list_var_$13.first();
                        } 
                    }
                    cdolist_list_var = cdolist_list_var.rest();
                    cur_unifier = cdolist_list_var.first();
                } 
            } else {
                method_nodes = shop_basic_plan_state_apply_all_methods_method(self, task);
            }
            return append(scond_nodes, method_nodes);
        }
        cdestructuring_bind_error(datum, $list246);
        return NIL;
    }

    public static SubLObject shop_basic_plan_state_expand_primitive_preconditions_method(final SubLObject self, final SubLObject task) {
        if (NIL != shop_basic_plan_state_apply_all_preconditions_method(self, task)) {
            return shop_basic_plan_state_expand_primitive_method(self, task);
        }
        return NIL;
    }

    public static SubLObject shop_basic_plan_state_expand_primitive_method(final SubLObject self, final SubLObject task) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_shop_basic_plan_state_method = NIL;
        final SubLObject domain = get_shop_basic_plan_state_domain(self);
        final SubLObject log = get_shop_basic_plan_state_log(self);
        final SubLObject planner = get_shop_basic_plan_state_planner(self);
        final SubLObject previous_states = get_shop_basic_plan_state_previous_states(self);
        try {
            thread.throwStack.push($sym253$OUTER_CATCH_FOR_SHOP_BASIC_PLAN_STATE_METHOD);
            try {
                final SubLObject entry = assoc($OPERATORS, shop_internals.$shop_verbose_keys$.getDynamicValue(thread), UNPROVIDED, UNPROVIDED);
                final SubLObject verbose_msg_level = (NIL != entry) ? entry.rest() : ZERO_INTEGER;
                final SubLObject verbose_thread_level = instances.get_slot(instances.get_slot(self, LOG), VERBOSE);
                if (verbose_thread_level.numGE(verbose_msg_level)) {
                    methods.funcall_instance_method_with_0_args(log, LOG_NEWLINE);
                    methods.funcall_instance_method_with_1_args(log, LOG_ENTRY, $str257$Finding_operators_for_task___);
                }
                final SubLObject domain_$14 = shop_basic_planner_thread.shop_basic_planner_thread_get_domain_method(planner);
                final SubLObject operators = shop_domain.shop_basic_domain_get_operators_method(domain_$14, task);
                final SubLObject cond_operators = shop_domain.shop_basic_domain_get_conditional_operators_method(domain_$14, task);
                SubLObject new_plan_state = NIL;
                SubLObject new_world_state = NIL;
                if (NIL == operators) {
                    methods.funcall_instance_method_with_1_args(log, WARNING, $$$No_operator_for_task);
                    new_plan_state = shop_basic_plan_state_create_next_method(self);
                    shop_basic_plan_state_add_to_partial_plan_method(new_plan_state, task);
                    shop_basic_plan_state_add_to_task_strucs_method(new_plan_state, NIL);
                    shop_basic_plan_state_add_decomposition_method(new_plan_state, task, NIL);
                    sublisp_throw($sym253$OUTER_CATCH_FOR_SHOP_BASIC_PLAN_STATE_METHOD, list(new_plan_state));
                }
                new_world_state = shop_basic_plan_state_apply_operators_method(self, task, operators, cond_operators);
                if (NIL == new_world_state) {
                    sublisp_throw($sym253$OUTER_CATCH_FOR_SHOP_BASIC_PLAN_STATE_METHOD, NIL);
                }
                if (NIL != instances.get_slot(planner, CYCLE_CHECKING)) {
                    SubLObject cdolist_list_var = instances.get_slot(self, PREVIOUS_STATES);
                    SubLObject old_state = NIL;
                    old_state = cdolist_list_var.first();
                    while (NIL != cdolist_list_var) {
                        if (NIL != shop_basic_world_state.shop_basic_world_state_same_state_p_method(new_world_state, new_world_state, old_state)) {
                            final SubLObject entry2 = assoc($CUTOFFS, shop_internals.$shop_verbose_keys$.getDynamicValue(thread), UNPROVIDED, UNPROVIDED);
                            final SubLObject verbose_msg_level2 = (NIL != entry2) ? entry2.rest() : ZERO_INTEGER;
                            final SubLObject verbose_thread_level2 = instances.get_slot(instances.get_slot(self, LOG), VERBOSE);
                            if (verbose_thread_level2.numGE(verbose_msg_level2)) {
                                methods.funcall_instance_method_with_1_args(log, WARNING, $str261$Prune____World_State_Cycle_Checki);
                            }
                            sublisp_throw($sym253$OUTER_CATCH_FOR_SHOP_BASIC_PLAN_STATE_METHOD, NIL);
                        }
                        cdolist_list_var = cdolist_list_var.rest();
                        old_state = cdolist_list_var.first();
                    } 
                }
                new_plan_state = shop_basic_plan_state_create_next_method(self);
                shop_basic_plan_state_set_world_state_method(new_plan_state, new_world_state);
                shop_basic_plan_state_add_to_previous_states_method(new_plan_state, new_world_state);
                shop_basic_plan_state_add_to_partial_plan_method(new_plan_state, task);
                shop_basic_plan_state_add_to_task_strucs_method(new_plan_state, append(operators, cond_operators));
                shop_basic_plan_state_add_decomposition_method(new_plan_state, task, NIL);
                sublisp_throw($sym253$OUTER_CATCH_FOR_SHOP_BASIC_PLAN_STATE_METHOD, list(new_plan_state));
            } finally {
                final SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    set_shop_basic_plan_state_domain(self, domain);
                    set_shop_basic_plan_state_log(self, log);
                    set_shop_basic_plan_state_planner(self, planner);
                    set_shop_basic_plan_state_previous_states(self, previous_states);
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        } catch (final Throwable ccatch_env_var) {
            catch_var_for_shop_basic_plan_state_method = Errors.handleThrowable(ccatch_env_var, $sym253$OUTER_CATCH_FOR_SHOP_BASIC_PLAN_STATE_METHOD);
        } finally {
            thread.throwStack.pop();
        }
        return catch_var_for_shop_basic_plan_state_method;
    }

    public static SubLObject shop_basic_plan_state_apply_operators_method(final SubLObject self, final SubLObject task, final SubLObject operators, final SubLObject cond_operators) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_shop_basic_plan_state_method = NIL;
        final SubLObject log = get_shop_basic_plan_state_log(self);
        final SubLObject world_state = get_shop_basic_plan_state_world_state(self);
        try {
            thread.throwStack.push($sym266$OUTER_CATCH_FOR_SHOP_BASIC_PLAN_STATE_METHOD);
            try {
                final SubLObject result = methods.funcall_instance_method_with_0_args(world_state, NEXT_STATE);
                SubLObject adds = NIL;
                SubLObject deletes = NIL;
                final SubLObject total_num = list_length(cond_operators);
                SubLObject cdolist_list_var = operators;
                SubLObject cur_op = NIL;
                cur_op = cdolist_list_var.first();
                while (NIL != cdolist_list_var) {
                    thread.resetMultipleValues();
                    final SubLObject new_adds = shop_basic_plan_state_apply_operator_method(self, task, cur_op);
                    final SubLObject new_deletes = thread.secondMultipleValue();
                    thread.resetMultipleValues();
                    SubLObject cdolist_list_var_$15 = new_adds;
                    SubLObject lit = NIL;
                    lit = cdolist_list_var_$15.first();
                    while (NIL != cdolist_list_var_$15) {
                        final SubLObject item_var = lit;
                        if (NIL == member(item_var, adds, symbol_function(EQL), symbol_function(IDENTITY))) {
                            adds = cons(item_var, adds);
                        }
                        cdolist_list_var_$15 = cdolist_list_var_$15.rest();
                        lit = cdolist_list_var_$15.first();
                    } 
                    SubLObject cdolist_list_var_$16 = new_deletes;
                    lit = NIL;
                    lit = cdolist_list_var_$16.first();
                    while (NIL != cdolist_list_var_$16) {
                        final SubLObject item_var = lit;
                        if (NIL == member(item_var, deletes, symbol_function(EQL), symbol_function(IDENTITY))) {
                            deletes = cons(item_var, deletes);
                        }
                        cdolist_list_var_$16 = cdolist_list_var_$16.rest();
                        lit = cdolist_list_var_$16.first();
                    } 
                    cdolist_list_var = cdolist_list_var.rest();
                    cur_op = cdolist_list_var.first();
                } 
                SubLObject list_var = NIL;
                cur_op = NIL;
                SubLObject cur_num = NIL;
                list_var = cond_operators;
                cur_op = list_var.first();
                for (cur_num = ZERO_INTEGER; NIL != list_var; list_var = list_var.rest() , cur_op = list_var.first() , cur_num = add(ONE_INTEGER, cur_num)) {
                    final SubLObject entry = assoc($OPERATORS, shop_internals.$shop_verbose_keys$.getDynamicValue(thread), UNPROVIDED, UNPROVIDED);
                    final SubLObject verbose_msg_level = (NIL != entry) ? entry.rest() : ZERO_INTEGER;
                    final SubLObject verbose_thread_level = instances.get_slot(instances.get_slot(self, LOG), VERBOSE);
                    if (verbose_thread_level.numGE(verbose_msg_level)) {
                        methods.funcall_instance_method_with_2_args(log, LOG_FANCY_ENTRY, format(NIL, $str269$Trying___s__s__, number_utilities.f_1X(cur_num), total_num), $list270);
                        methods.funcall_instance_method_with_0_args(log, LOG_NEWLINE);
                    }
                    thread.resetMultipleValues();
                    final SubLObject new_adds2 = shop_basic_plan_state_apply_conditional_operator_method(self, task, cur_op);
                    final SubLObject new_deletes2 = thread.secondMultipleValue();
                    thread.resetMultipleValues();
                    SubLObject cdolist_list_var2 = new_adds2;
                    SubLObject lit2 = NIL;
                    lit2 = cdolist_list_var2.first();
                    while (NIL != cdolist_list_var2) {
                        final SubLObject item_var2 = lit2;
                        if (NIL == member(item_var2, adds, symbol_function(EQL), symbol_function(IDENTITY))) {
                            adds = cons(item_var2, adds);
                        }
                        cdolist_list_var2 = cdolist_list_var2.rest();
                        lit2 = cdolist_list_var2.first();
                    } 
                    cdolist_list_var2 = new_deletes2;
                    lit2 = NIL;
                    lit2 = cdolist_list_var2.first();
                    while (NIL != cdolist_list_var2) {
                        final SubLObject item_var2 = lit2;
                        if (NIL == member(item_var2, deletes, symbol_function(EQL), symbol_function(IDENTITY))) {
                            deletes = cons(item_var2, deletes);
                        }
                        cdolist_list_var2 = cdolist_list_var2.rest();
                        lit2 = cdolist_list_var2.first();
                    } 
                }
                final SubLObject entry2 = assoc($OPERATORS, shop_internals.$shop_verbose_keys$.getDynamicValue(thread), UNPROVIDED, UNPROVIDED);
                final SubLObject verbose_msg_level2 = (NIL != entry2) ? entry2.rest() : ZERO_INTEGER;
                final SubLObject verbose_thread_level2 = instances.get_slot(instances.get_slot(self, LOG), VERBOSE);
                if (verbose_thread_level2.numGE(verbose_msg_level2)) {
                    methods.funcall_instance_method_with_0_args(log, LOG_NEWLINE);
                    methods.funcall_instance_method_with_1_args(log, LOG_ENTRY, $$$Making_New_World_State);
                    methods.funcall_instance_method_with_1_args(log, LOG_ENTRY, $str272$Adds__);
                    methods.funcall_instance_method_with_1_args(log, LOG_ENTRY, write_to_string(adds, EMPTY_SUBL_OBJECT_ARRAY));
                    methods.funcall_instance_method_with_1_args(log, LOG_ENTRY, $str273$Deletes__);
                    methods.funcall_instance_method_with_1_args(log, LOG_ENTRY, write_to_string(deletes, EMPTY_SUBL_OBJECT_ARRAY));
                    final SubLObject race_lits = intersection(adds, deletes, symbol_function(EQUAL), UNPROVIDED);
                    if (NIL != race_lits) {
                        shop_basic_plan_state_output_message_method(self, format(NIL, $str274$Warning__Add_Delete_race_conditio, new SubLObject[]{ race_lits, operators, cond_operators }));
                    }
                }
                methods.funcall_instance_method_with_1_args(result, DELETE_LITERALS, deletes);
                methods.funcall_instance_method_with_1_args(result, ADD_LITERALS, adds);
                sublisp_throw($sym266$OUTER_CATCH_FOR_SHOP_BASIC_PLAN_STATE_METHOD, result);
            } finally {
                final SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    set_shop_basic_plan_state_log(self, log);
                    set_shop_basic_plan_state_world_state(self, world_state);
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        } catch (final Throwable ccatch_env_var) {
            catch_var_for_shop_basic_plan_state_method = Errors.handleThrowable(ccatch_env_var, $sym266$OUTER_CATCH_FOR_SHOP_BASIC_PLAN_STATE_METHOD);
        } finally {
            thread.throwStack.pop();
        }
        return catch_var_for_shop_basic_plan_state_method;
    }

    public static SubLObject shop_basic_plan_state_apply_operator_method(final SubLObject self, final SubLObject task, final SubLObject operator) {
        final SubLObject head = shop_datastructures.get_shop_basic_planner_rule_head(operator);
        final SubLObject unifier = shop_datastructures.shop_unify(head.rest(), task.rest());
        if (NIL == shop_datastructures.shop_unify_failedP(unifier)) {
            final SubLObject deletions = shop_datastructures.shop_basic_operator_get_deletes_method(operator);
            final SubLObject additions = shop_datastructures.shop_basic_operator_get_adds_method(operator);
            return values(shop_datastructures.shop_apply_substitution(additions, unifier), shop_datastructures.shop_apply_substitution(deletions, unifier));
        }
        return NIL;
    }

    public static SubLObject shop_basic_plan_state_apply_conditional_operator_method(final SubLObject self, final SubLObject task, final SubLObject operator) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_shop_basic_plan_state_method = NIL;
        final SubLObject log = get_shop_basic_plan_state_log(self);
        final SubLObject planner = get_shop_basic_plan_state_planner(self);
        final SubLObject mbindings = get_shop_basic_plan_state_mbindings(self);
        final SubLObject world_state = get_shop_basic_plan_state_world_state(self);
        try {
            thread.throwStack.push($sym284$OUTER_CATCH_FOR_SHOP_BASIC_PLAN_STATE_METHOD);
            try {
                final SubLObject var_manager = instances.get_slot(planner, VAR_MANAGER);
                final SubLObject head = shop_datastructures.get_shop_basic_planner_rule_head(operator);
                SubLObject adds = shop_datastructures.shop_basic_conditional_effect_adds_method(operator);
                SubLObject deletes = shop_datastructures.shop_basic_conditional_effect_deletes_method(operator);
                final SubLObject condition = shop_datastructures.shop_basic_conditional_effect_condition_method(operator);
                SubLObject sub_list = list(condition, adds, deletes);
                final SubLObject unifier = shop_datastructures.shop_unify(head.rest(), task.rest());
                SubLObject world_state_mbindings = NIL;
                if (NIL != shop_datastructures.shop_unify_failedP(unifier)) {
                    sublisp_throw($sym284$OUTER_CATCH_FOR_SHOP_BASIC_PLAN_STATE_METHOD, world_state);
                }
                final SubLObject entry = assoc($OPERATORS, shop_internals.$shop_verbose_keys$.getDynamicValue(thread), UNPROVIDED, UNPROVIDED);
                final SubLObject verbose_msg_level = (NIL != entry) ? entry.rest() : ZERO_INTEGER;
                final SubLObject verbose_thread_level = instances.get_slot(instances.get_slot(self, LOG), VERBOSE);
                if (verbose_thread_level.numGE(verbose_msg_level)) {
                    methods.funcall_instance_method_with_1_args(log, LOG_PLANNER_RULE, operator);
                }
                sub_list = shop_datastructures.shop_apply_substitution(sub_list, unifier);
                sub_list = shop_internals.shop_variable_manager_replace_variables_method(var_manager, sub_list, mbindings);
                world_state_mbindings = shop_basic_plan_state_find_mbindings_method(self, sub_list.first(), mbindings);
                if (NIL != world_state_mbindings) {
                    if ((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) && (NIL == list_utilities.singletonP(world_state_mbindings))) {
                        Errors.error($str286$_apply_conditional_operator_shop_, world_state_mbindings);
                    }
                    final SubLObject simple_mbinding = shop_basic_plan_state_applicable_multibinding_method(self, world_state_mbindings.first());
                    adds = multibindings.apply_multibinding(second(sub_list), simple_mbinding).first();
                    deletes = multibindings.apply_multibinding(third(sub_list), simple_mbinding).first();
                    sublisp_throw($sym284$OUTER_CATCH_FOR_SHOP_BASIC_PLAN_STATE_METHOD, values(adds, deletes));
                }
            } finally {
                final SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    set_shop_basic_plan_state_log(self, log);
                    set_shop_basic_plan_state_planner(self, planner);
                    set_shop_basic_plan_state_mbindings(self, mbindings);
                    set_shop_basic_plan_state_world_state(self, world_state);
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        } catch (final Throwable ccatch_env_var) {
            catch_var_for_shop_basic_plan_state_method = Errors.handleThrowable(ccatch_env_var, $sym284$OUTER_CATCH_FOR_SHOP_BASIC_PLAN_STATE_METHOD);
        } finally {
            thread.throwStack.pop();
        }
        return catch_var_for_shop_basic_plan_state_method;
    }

    public static SubLObject shop_basic_plan_state_unify_planner_rule_method(final SubLObject self, final SubLObject task, final SubLObject rule) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_shop_basic_plan_state_method = NIL;
        final SubLObject planner = get_shop_basic_plan_state_planner(self);
        final SubLObject mbindings = get_shop_basic_plan_state_mbindings(self);
        try {
            thread.throwStack.push($sym291$OUTER_CATCH_FOR_SHOP_BASIC_PLAN_STATE_METHOD);
            try {
                final SubLObject var_manager = instances.get_slot(planner, VAR_MANAGER);
                final SubLObject simple_mbinding = shop_basic_plan_state_applicable_multibinding_method(self, mbindings);
                final SubLObject unified_head_data = methods.funcall_instance_method_with_1_args(rule, UNIFY_TASK_TO_HEAD_WITH_DATA, task);
                if (NIL != unified_head_data) {
                    final SubLObject task_unifier = unified_head_data.first();
                    final SubLObject rule_data = unified_head_data.rest();
                    if (NIL == shop_datastructures.shop_unify_failedP(task_unifier)) {
                        SubLObject precond_decomp = multibindings.apply_multibinding(rule_data, simple_mbinding).first();
                        final SubLObject generated_var_bpairs = shop_internals.shop_variable_manager_generated_variables_bound_method(SHOP_VARIABLE_MANAGER, task_unifier);
                        final SubLObject new_mbindings = multibindings.mb_add_bindings(mbindings, generated_var_bpairs);
                        final SubLObject assertion = methods.funcall_instance_method_with_0_args(rule, ASSERTIONS).first();
                        if (NIL != assertion) {
                            final SubLObject el_vars = assertions_high.assertion_el_variables(assertion);
                            final SubLObject hl_vars = assertions_high.assertion_hl_variables(assertion);
                            final SubLObject el_subst = pairlis(hl_vars, el_vars, UNPROVIDED);
                            precond_decomp = sublis(el_subst, precond_decomp, UNPROVIDED, UNPROVIDED);
                        }
                        final SubLObject decomp = shop_internals.shop_variable_manager_replace_variables_method(var_manager, precond_decomp, new_mbindings);
                        sublisp_throw($sym291$OUTER_CATCH_FOR_SHOP_BASIC_PLAN_STATE_METHOD, cons(new_mbindings, decomp));
                    }
                }
                sublisp_throw($sym291$OUTER_CATCH_FOR_SHOP_BASIC_PLAN_STATE_METHOD, $FAIL);
            } finally {
                final SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    set_shop_basic_plan_state_planner(self, planner);
                    set_shop_basic_plan_state_mbindings(self, mbindings);
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        } catch (final Throwable ccatch_env_var) {
            catch_var_for_shop_basic_plan_state_method = Errors.handleThrowable(ccatch_env_var, $sym291$OUTER_CATCH_FOR_SHOP_BASIC_PLAN_STATE_METHOD);
        } finally {
            thread.throwStack.pop();
        }
        return catch_var_for_shop_basic_plan_state_method;
    }

    public static SubLObject shop_basic_plan_state_apply_all_methods_method(final SubLObject self, final SubLObject task) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_shop_basic_plan_state_method = NIL;
        final SubLObject domain = get_shop_basic_plan_state_domain(self);
        final SubLObject log = get_shop_basic_plan_state_log(self);
        final SubLObject planner = get_shop_basic_plan_state_planner(self);
        try {
            thread.throwStack.push($sym299$OUTER_CATCH_FOR_SHOP_BASIC_PLAN_STATE_METHOD);
            try {
                SubLObject new_nodes = NIL;
                final SubLObject domain_$17 = shop_basic_planner_thread.shop_basic_planner_thread_get_domain_method(planner);
                final SubLObject task_pred_matched_methods = shop_domain.shop_basic_domain_get_methods_method(domain_$17, task);
                final SubLObject total_num = list_length(task_pred_matched_methods);
                SubLObject entry = assoc($PLANNER_RULES, shop_internals.$shop_verbose_keys$.getDynamicValue(thread), UNPROVIDED, UNPROVIDED);
                SubLObject verbose_msg_level = (NIL != entry) ? entry.rest() : ZERO_INTEGER;
                SubLObject verbose_thread_level = instances.get_slot(instances.get_slot(self, LOG), VERBOSE);
                if (verbose_thread_level.numGE(verbose_msg_level)) {
                    methods.funcall_instance_method_with_0_args(log, LOG_NEWLINE);
                    methods.funcall_instance_method_with_1_args(log, LOG_ENTRY, $str301$Finding_methods_for_task___);
                }
                if (NIL != task_pred_matched_methods) {
                    SubLObject list_var = NIL;
                    SubLObject cur_method = NIL;
                    SubLObject cur_num = NIL;
                    list_var = task_pred_matched_methods;
                    cur_method = list_var.first();
                    for (cur_num = ZERO_INTEGER; NIL != list_var; list_var = list_var.rest() , cur_method = list_var.first() , cur_num = add(ONE_INTEGER, cur_num)) {
                        final SubLObject entry2 = assoc($PLANNER_RULES, shop_internals.$shop_verbose_keys$.getDynamicValue(thread), UNPROVIDED, UNPROVIDED);
                        final SubLObject verbose_msg_level2 = (NIL != entry2) ? entry2.rest() : ZERO_INTEGER;
                        final SubLObject verbose_thread_level2 = instances.get_slot(instances.get_slot(self, LOG), VERBOSE);
                        if (verbose_thread_level2.numGE(verbose_msg_level2)) {
                            methods.funcall_instance_method_with_2_args(log, LOG_FANCY_ENTRY, format(NIL, $str269$Trying___s__s__, number_utilities.f_1X(cur_num), total_num), $list270);
                            methods.funcall_instance_method_with_0_args(log, LOG_NEWLINE);
                        }
                        new_nodes = append(shop_basic_plan_state_apply_method_method(self, task, cur_method), new_nodes);
                    }
                } else {
                    entry = assoc($GOALS, shop_internals.$shop_verbose_keys$.getDynamicValue(thread), UNPROVIDED, UNPROVIDED);
                    verbose_msg_level = (NIL != entry) ? entry.rest() : ZERO_INTEGER;
                    verbose_thread_level = instances.get_slot(instances.get_slot(self, LOG), VERBOSE);
                    if (verbose_thread_level.numGE(verbose_msg_level)) {
                        methods.funcall_instance_method_with_1_args(log, WARNING, $str302$No_matching_methods_were_found_);
                    }
                }
                sublisp_throw($sym299$OUTER_CATCH_FOR_SHOP_BASIC_PLAN_STATE_METHOD, new_nodes);
            } finally {
                final SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    set_shop_basic_plan_state_domain(self, domain);
                    set_shop_basic_plan_state_log(self, log);
                    set_shop_basic_plan_state_planner(self, planner);
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        } catch (final Throwable ccatch_env_var) {
            catch_var_for_shop_basic_plan_state_method = Errors.handleThrowable(ccatch_env_var, $sym299$OUTER_CATCH_FOR_SHOP_BASIC_PLAN_STATE_METHOD);
        } finally {
            thread.throwStack.pop();
        }
        return catch_var_for_shop_basic_plan_state_method;
    }

    public static SubLObject shop_basic_plan_state_apply_method_method(final SubLObject self, final SubLObject task, final SubLObject method) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_shop_basic_plan_state_method = NIL;
        final SubLObject log = get_shop_basic_plan_state_log(self);
        final SubLObject depth = get_shop_basic_plan_state_depth(self);
        try {
            thread.throwStack.push($sym307$OUTER_CATCH_FOR_SHOP_BASIC_PLAN_STATE_METHOD);
            try {
                SubLObject new_nodes = NIL;
                final SubLObject unified_decomp_mbinding = shop_basic_plan_state_unify_planner_rule_method(self, task, method);
                final SubLObject entry = assoc($METHODS, shop_internals.$shop_verbose_keys$.getDynamicValue(thread), UNPROVIDED, UNPROVIDED);
                final SubLObject verbose_msg_level = (NIL != entry) ? entry.rest() : ZERO_INTEGER;
                final SubLObject verbose_thread_level = instances.get_slot(instances.get_slot(self, LOG), VERBOSE);
                if (verbose_thread_level.numGE(verbose_msg_level)) {
                    methods.funcall_instance_method_with_1_args(log, LOG_PLANNER_RULE, method);
                }
                if ($FAIL != unified_decomp_mbinding) {
                    SubLObject current;
                    final SubLObject datum = current = unified_decomp_mbinding;
                    SubLObject new_mbindings = NIL;
                    SubLObject pre = NIL;
                    SubLObject reduction = NIL;
                    destructuring_bind_must_consp(current, datum, $list309);
                    new_mbindings = current.first();
                    current = current.rest();
                    destructuring_bind_must_consp(current, datum, $list309);
                    pre = current.first();
                    current = current.rest();
                    destructuring_bind_must_consp(current, datum, $list309);
                    reduction = current.first();
                    current = current.rest();
                    if (NIL == current) {
                        final SubLObject state_unifiers = shop_basic_plan_state_find_mbindings_method(self, pre, new_mbindings);
                        if (NIL != state_unifiers) {
                            SubLObject list_var = NIL;
                            SubLObject unifier = NIL;
                            SubLObject result_num = NIL;
                            list_var = state_unifiers;
                            unifier = list_var.first();
                            for (result_num = ZERO_INTEGER; NIL != list_var; list_var = list_var.rest() , unifier = list_var.first() , result_num = add(ONE_INTEGER, result_num)) {
                                final SubLObject new_plan_state = shop_basic_plan_state_create_next_method(self);
                                SubLObject simple_mbinding = NIL;
                                final SubLObject entry2 = assoc($METHODS, shop_internals.$shop_verbose_keys$.getDynamicValue(thread), UNPROVIDED, UNPROVIDED);
                                final SubLObject verbose_msg_level2 = (NIL != entry2) ? entry2.rest() : ZERO_INTEGER;
                                final SubLObject verbose_thread_level2 = instances.get_slot(instances.get_slot(self, LOG), VERBOSE);
                                if (verbose_thread_level2.numGE(verbose_msg_level2)) {
                                    methods.funcall_instance_method_with_2_args(log, LOG_FANCY_ENTRY, format(NIL, $str310$Result__s, number_utilities.f_1X(result_num)), $list270);
                                    methods.funcall_instance_method_with_1_args(log, LOG_PREFORMATTED, multibindings.multibinding_string(unifier));
                                    methods.funcall_instance_method_with_1_args(log, LOG_ENTRY, format(NIL, $str312$Decomposition___, depth));
                                    if (reduction.isList()) {
                                        SubLObject cdolist_list_var = reduction;
                                        SubLObject r = NIL;
                                        r = cdolist_list_var.first();
                                        while (NIL != cdolist_list_var) {
                                            methods.funcall_instance_method_with_1_args(log, LOG_PREFORMATTED, format(NIL, $str313$___6__s__, r));
                                            cdolist_list_var = cdolist_list_var.rest();
                                            r = cdolist_list_var.first();
                                        } 
                                    }
                                }
                                shop_basic_plan_state_add_to_partial_plan_method(new_plan_state, task);
                                set_shop_basic_plan_state_mbindings(new_plan_state, unifier);
                                shop_basic_plan_state_add_to_task_strucs_method(new_plan_state, method);
                                simple_mbinding = shop_basic_plan_state_applicable_multibinding_method(self, unifier);
                                shop_basic_plan_state_add_decomposition_method(new_plan_state, task, multibindings.apply_multibinding(reduction, simple_mbinding).first());
                                new_nodes = cons(new_plan_state, new_nodes);
                            }
                        }
                        sublisp_throw($sym307$OUTER_CATCH_FOR_SHOP_BASIC_PLAN_STATE_METHOD, new_nodes);
                    } else {
                        cdestructuring_bind_error(datum, $list309);
                    }
                }
                sublisp_throw($sym307$OUTER_CATCH_FOR_SHOP_BASIC_PLAN_STATE_METHOD, NIL);
            } finally {
                final SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    set_shop_basic_plan_state_log(self, log);
                    set_shop_basic_plan_state_depth(self, depth);
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        } catch (final Throwable ccatch_env_var) {
            catch_var_for_shop_basic_plan_state_method = Errors.handleThrowable(ccatch_env_var, $sym307$OUTER_CATCH_FOR_SHOP_BASIC_PLAN_STATE_METHOD);
        } finally {
            thread.throwStack.pop();
        }
        return catch_var_for_shop_basic_plan_state_method;
    }

    public static SubLObject shop_basic_plan_state_apply_all_sufficient_conditions_method(final SubLObject self, final SubLObject task) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_shop_basic_plan_state_method = NIL;
        final SubLObject domain = get_shop_basic_plan_state_domain(self);
        final SubLObject log = get_shop_basic_plan_state_log(self);
        final SubLObject planner = get_shop_basic_plan_state_planner(self);
        try {
            thread.throwStack.push($sym317$OUTER_CATCH_FOR_SHOP_BASIC_PLAN_STATE_METHOD);
            try {
                SubLObject new_nodes = NIL;
                final SubLObject domain_$18 = shop_basic_planner_thread.shop_basic_planner_thread_get_domain_method(planner);
                final SubLObject task_sufficient_conds = shop_domain.shop_basic_domain_get_sufficient_conds_method(domain_$18, task);
                SubLObject inverse_unifiers = NIL;
                final SubLObject total_num = list_length(task_sufficient_conds);
                SubLObject entry = assoc($PLANNER_RULES, shop_internals.$shop_verbose_keys$.getDynamicValue(thread), UNPROVIDED, UNPROVIDED);
                SubLObject verbose_msg_level = (NIL != entry) ? entry.rest() : ZERO_INTEGER;
                SubLObject verbose_thread_level = instances.get_slot(instances.get_slot(self, LOG), VERBOSE);
                if (verbose_thread_level.numGE(verbose_msg_level)) {
                    methods.funcall_instance_method_with_0_args(log, LOG_NEWLINE);
                    methods.funcall_instance_method_with_1_args(log, LOG_ENTRY, $str318$Finding_sufficient_condition_rule);
                }
                if (NIL != task_sufficient_conds) {
                    SubLObject list_var = NIL;
                    SubLObject cur_scond = NIL;
                    SubLObject cur_num = NIL;
                    list_var = task_sufficient_conds;
                    cur_scond = list_var.first();
                    for (cur_num = ZERO_INTEGER; NIL != list_var; list_var = list_var.rest() , cur_scond = list_var.first() , cur_num = add(ONE_INTEGER, cur_num)) {
                        final SubLObject entry2 = assoc($PLANNER_RULES, shop_internals.$shop_verbose_keys$.getDynamicValue(thread), UNPROVIDED, UNPROVIDED);
                        final SubLObject verbose_msg_level2 = (NIL != entry2) ? entry2.rest() : ZERO_INTEGER;
                        final SubLObject verbose_thread_level2 = instances.get_slot(instances.get_slot(self, LOG), VERBOSE);
                        if (verbose_thread_level2.numGE(verbose_msg_level2)) {
                            methods.funcall_instance_method_with_2_args(log, LOG_FANCY_ENTRY, format(NIL, $str269$Trying___s__s__, number_utilities.f_1X(cur_num), total_num), $list270);
                            methods.funcall_instance_method_with_0_args(log, LOG_NEWLINE);
                        }
                        SubLObject current;
                        final SubLObject datum = current = shop_basic_plan_state_apply_sufficient_condition_method(self, task, cur_scond);
                        SubLObject nodes = NIL;
                        SubLObject inverse_unifier = NIL;
                        destructuring_bind_must_consp(current, datum, $list319);
                        nodes = current.first();
                        current = current.rest();
                        destructuring_bind_must_consp(current, datum, $list319);
                        inverse_unifier = current.first();
                        current = current.rest();
                        if (NIL == current) {
                            new_nodes = append(nodes, new_nodes);
                            final SubLObject item_var = inverse_unifier;
                            if (NIL == member(item_var, inverse_unifiers, symbol_function(EQL), symbol_function(IDENTITY))) {
                                inverse_unifiers = cons(item_var, inverse_unifiers);
                            }
                        } else {
                            cdestructuring_bind_error(datum, $list319);
                        }
                    }
                } else {
                    entry = assoc($GOALS, shop_internals.$shop_verbose_keys$.getDynamicValue(thread), UNPROVIDED, UNPROVIDED);
                    verbose_msg_level = (NIL != entry) ? entry.rest() : ZERO_INTEGER;
                    verbose_thread_level = instances.get_slot(instances.get_slot(self, LOG), VERBOSE);
                    if (verbose_thread_level.numGE(verbose_msg_level)) {
                        methods.funcall_instance_method_with_1_args(log, WARNING, $str320$No_matching_sufficient_conditions);
                    }
                }
                sublisp_throw($sym317$OUTER_CATCH_FOR_SHOP_BASIC_PLAN_STATE_METHOD, list(new_nodes, inverse_unifiers));
            } finally {
                final SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    set_shop_basic_plan_state_domain(self, domain);
                    set_shop_basic_plan_state_log(self, log);
                    set_shop_basic_plan_state_planner(self, planner);
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        } catch (final Throwable ccatch_env_var) {
            catch_var_for_shop_basic_plan_state_method = Errors.handleThrowable(ccatch_env_var, $sym317$OUTER_CATCH_FOR_SHOP_BASIC_PLAN_STATE_METHOD);
        } finally {
            thread.throwStack.pop();
        }
        return catch_var_for_shop_basic_plan_state_method;
    }

    public static SubLObject shop_basic_plan_state_apply_sufficient_condition_method(final SubLObject self, final SubLObject task, final SubLObject scond) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_shop_basic_plan_state_method = NIL;
        final SubLObject log = get_shop_basic_plan_state_log(self);
        final SubLObject tasklist = get_shop_basic_plan_state_tasklist(self);
        try {
            thread.throwStack.push($sym325$OUTER_CATCH_FOR_SHOP_BASIC_PLAN_STATE_METHOD);
            try {
                SubLObject new_nodes = NIL;
                final SubLObject unified_task_data = shop_basic_plan_state_unify_planner_rule_method(self, task, scond);
                final SubLObject entry = assoc($METHODS, shop_internals.$shop_verbose_keys$.getDynamicValue(thread), UNPROVIDED, UNPROVIDED);
                final SubLObject verbose_msg_level = (NIL != entry) ? entry.rest() : ZERO_INTEGER;
                final SubLObject verbose_thread_level = instances.get_slot(instances.get_slot(self, LOG), VERBOSE);
                if (verbose_thread_level.numGE(verbose_msg_level)) {
                    methods.funcall_instance_method_with_1_args(log, LOG_PLANNER_RULE, scond);
                }
                if (unified_task_data != $FAIL) {
                    SubLObject current;
                    final SubLObject datum = current = unified_task_data;
                    SubLObject new_mbindings = NIL;
                    SubLObject condition = NIL;
                    destructuring_bind_must_consp(current, datum, $list326);
                    new_mbindings = current.first();
                    current = current.rest();
                    destructuring_bind_must_consp(current, datum, $list326);
                    condition = current.first();
                    current = current.rest();
                    if (NIL == current) {
                        final SubLObject state_unifiers = shop_basic_plan_state_find_mbindings_method(self, condition, new_mbindings);
                        final SubLObject inverse_unifier = multibindings.multibinding_inverse_list(new_mbindings, state_unifiers);
                        SubLObject cdolist_list_var = state_unifiers;
                        SubLObject cur_unifier = NIL;
                        cur_unifier = cdolist_list_var.first();
                        while (NIL != cdolist_list_var) {
                            final SubLObject new_node = shop_basic_plan_state_create_next_method(self);
                            shop_basic_plan_state_add_to_partial_plan_method(new_node, task);
                            shop_basic_plan_state_add_to_task_strucs_method(new_node, scond);
                            set_shop_basic_plan_state_mbindings(new_node, cur_unifier);
                            shop_basic_plan_state_set_tasklist_method(new_node, append(list(list($SUPERTASK, task)), tasklist.rest()));
                            new_nodes = cons(new_node, new_nodes);
                            cdolist_list_var = cdolist_list_var.rest();
                            cur_unifier = cdolist_list_var.first();
                        } 
                        sublisp_throw($sym325$OUTER_CATCH_FOR_SHOP_BASIC_PLAN_STATE_METHOD, list(new_nodes, inverse_unifier));
                    } else {
                        cdestructuring_bind_error(datum, $list326);
                    }
                }
                sublisp_throw($sym325$OUTER_CATCH_FOR_SHOP_BASIC_PLAN_STATE_METHOD, list(NIL, NIL));
            } finally {
                final SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    set_shop_basic_plan_state_log(self, log);
                    set_shop_basic_plan_state_tasklist(self, tasklist);
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        } catch (final Throwable ccatch_env_var) {
            catch_var_for_shop_basic_plan_state_method = Errors.handleThrowable(ccatch_env_var, $sym325$OUTER_CATCH_FOR_SHOP_BASIC_PLAN_STATE_METHOD);
        } finally {
            thread.throwStack.pop();
        }
        return catch_var_for_shop_basic_plan_state_method;
    }

    public static SubLObject shop_basic_plan_state_apply_all_preconditions_method(final SubLObject self, final SubLObject task) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_shop_basic_plan_state_method = NIL;
        final SubLObject domain = get_shop_basic_plan_state_domain(self);
        final SubLObject log = get_shop_basic_plan_state_log(self);
        try {
            thread.throwStack.push($sym330$OUTER_CATCH_FOR_SHOP_BASIC_PLAN_STATE_METHOD);
            try {
                final SubLObject preconds = shop_domain.shop_basic_domain_get_planner_rules_method(domain, task, SHOP_PRECONDITION_P);
                final SubLObject total_num = list_length(preconds);
                SubLObject entry = assoc($OPERATORS, shop_internals.$shop_verbose_keys$.getDynamicValue(thread), UNPROVIDED, UNPROVIDED);
                SubLObject verbose_msg_level = (NIL != entry) ? entry.rest() : ZERO_INTEGER;
                SubLObject verbose_thread_level = instances.get_slot(instances.get_slot(self, LOG), VERBOSE);
                if (verbose_thread_level.numGE(verbose_msg_level)) {
                    methods.funcall_instance_method_with_0_args(log, LOG_NEWLINE);
                    methods.funcall_instance_method_with_1_args(log, LOG_ENTRY, $str332$Finding_precondition_rules_for_ta);
                }
                if (NIL == preconds) {
                    entry = assoc($OPERATORS, shop_internals.$shop_verbose_keys$.getDynamicValue(thread), UNPROVIDED, UNPROVIDED);
                    verbose_msg_level = (NIL != entry) ? entry.rest() : ZERO_INTEGER;
                    verbose_thread_level = instances.get_slot(instances.get_slot(self, LOG), VERBOSE);
                    if (verbose_thread_level.numGE(verbose_msg_level)) {
                        methods.funcall_instance_method_with_1_args(log, WARNING, $str333$No_precondition_rules_found_);
                    }
                    sublisp_throw($sym330$OUTER_CATCH_FOR_SHOP_BASIC_PLAN_STATE_METHOD, T);
                } else {
                    SubLObject list_var = NIL;
                    SubLObject precond = NIL;
                    SubLObject cur_num = NIL;
                    list_var = preconds;
                    precond = list_var.first();
                    for (cur_num = ZERO_INTEGER; NIL != list_var; list_var = list_var.rest() , precond = list_var.first() , cur_num = add(ONE_INTEGER, cur_num)) {
                        final SubLObject entry2 = assoc($OPERATORS, shop_internals.$shop_verbose_keys$.getDynamicValue(thread), UNPROVIDED, UNPROVIDED);
                        final SubLObject verbose_msg_level2 = (NIL != entry2) ? entry2.rest() : ZERO_INTEGER;
                        final SubLObject verbose_thread_level2 = instances.get_slot(instances.get_slot(self, LOG), VERBOSE);
                        if (verbose_thread_level2.numGE(verbose_msg_level2)) {
                            methods.funcall_instance_method_with_2_args(log, LOG_FANCY_ENTRY, format(NIL, $str269$Trying___s__s__, number_utilities.f_1X(cur_num), total_num), $list270);
                            methods.funcall_instance_method_with_0_args(log, LOG_NEWLINE);
                        }
                        if (NIL == shop_basic_plan_state_apply_precondition_method(self, task, precond)) {
                            sublisp_throw($sym330$OUTER_CATCH_FOR_SHOP_BASIC_PLAN_STATE_METHOD, NIL);
                        }
                    }
                    sublisp_throw($sym330$OUTER_CATCH_FOR_SHOP_BASIC_PLAN_STATE_METHOD, T);
                }
                sublisp_throw($sym330$OUTER_CATCH_FOR_SHOP_BASIC_PLAN_STATE_METHOD, NIL);
            } finally {
                final SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    set_shop_basic_plan_state_domain(self, domain);
                    set_shop_basic_plan_state_log(self, log);
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        } catch (final Throwable ccatch_env_var) {
            catch_var_for_shop_basic_plan_state_method = Errors.handleThrowable(ccatch_env_var, $sym330$OUTER_CATCH_FOR_SHOP_BASIC_PLAN_STATE_METHOD);
        } finally {
            thread.throwStack.pop();
        }
        return catch_var_for_shop_basic_plan_state_method;
    }

    public static SubLObject shop_basic_plan_state_apply_precondition_method(final SubLObject self, final SubLObject task, final SubLObject precond) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_shop_basic_plan_state_method = NIL;
        final SubLObject log = get_shop_basic_plan_state_log(self);
        try {
            thread.throwStack.push($sym338$OUTER_CATCH_FOR_SHOP_BASIC_PLAN_STATE_METHOD);
            try {
                final SubLObject entry = assoc($PLANNER_RULES, shop_internals.$shop_verbose_keys$.getDynamicValue(thread), UNPROVIDED, UNPROVIDED);
                final SubLObject verbose_msg_level = (NIL != entry) ? entry.rest() : ZERO_INTEGER;
                final SubLObject verbose_thread_level = instances.get_slot(instances.get_slot(self, LOG), VERBOSE);
                if (verbose_thread_level.numGE(verbose_msg_level)) {
                    methods.funcall_instance_method_with_1_args(log, LOG_PLANNER_RULE, precond);
                }
                final SubLObject unified_task_data = shop_basic_plan_state_unify_planner_rule_method(self, task, precond);
                if ($FAIL != unified_task_data) {
                    SubLObject current;
                    final SubLObject datum = current = unified_task_data;
                    SubLObject new_mbindings = NIL;
                    SubLObject pre = NIL;
                    SubLObject reduction = NIL;
                    destructuring_bind_must_consp(current, datum, $list309);
                    new_mbindings = current.first();
                    current = current.rest();
                    destructuring_bind_must_consp(current, datum, $list309);
                    pre = current.first();
                    current = current.rest();
                    destructuring_bind_must_consp(current, datum, $list309);
                    reduction = current.first();
                    current = current.rest();
                    if (NIL == current) {
                        final SubLObject state_unifiers = shop_basic_plan_state_find_mbindings_method(self, pre, new_mbindings);
                        if (NIL == state_unifiers) {
                            final SubLObject entry2 = assoc($PLANNER_RULES, shop_internals.$shop_verbose_keys$.getDynamicValue(thread), UNPROVIDED, UNPROVIDED);
                            final SubLObject verbose_msg_level2 = (NIL != entry2) ? entry2.rest() : ZERO_INTEGER;
                            final SubLObject verbose_thread_level2 = instances.get_slot(instances.get_slot(self, LOG), VERBOSE);
                            if (verbose_thread_level2.numGE(verbose_msg_level2)) {
                                methods.funcall_instance_method_with_1_args(log, WARNING, $str339$No_bindings_found_);
                            }
                            sublisp_throw($sym338$OUTER_CATCH_FOR_SHOP_BASIC_PLAN_STATE_METHOD, NIL);
                        } else {
                            sublisp_throw($sym338$OUTER_CATCH_FOR_SHOP_BASIC_PLAN_STATE_METHOD, state_unifiers);
                        }
                    } else {
                        cdestructuring_bind_error(datum, $list309);
                    }
                }
            } finally {
                final SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    set_shop_basic_plan_state_log(self, log);
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        } catch (final Throwable ccatch_env_var) {
            catch_var_for_shop_basic_plan_state_method = Errors.handleThrowable(ccatch_env_var, $sym338$OUTER_CATCH_FOR_SHOP_BASIC_PLAN_STATE_METHOD);
        } finally {
            thread.throwStack.pop();
        }
        return catch_var_for_shop_basic_plan_state_method;
    }

    public static SubLObject declare_shop_basic_plan_state_file() {
        declareMacro(me, "cpushX", "CPUSH*");
        declareMacro(me, "when_verbose", "WHEN-VERBOSE");
        declareFunction(me, "shop_plan_state_p", "SHOP-PLAN-STATE-P", 1, 0, false);
        declareFunction(me, "get_shop_basic_plan_state_dynamic_predicates", "GET-SHOP-BASIC-PLAN-STATE-DYNAMIC-PREDICATES", 1, 0, false);
        declareFunction(me, "set_shop_basic_plan_state_dynamic_predicates", "SET-SHOP-BASIC-PLAN-STATE-DYNAMIC-PREDICATES", 2, 0, false);
        declareFunction(me, "get_shop_basic_plan_state_model_mt", "GET-SHOP-BASIC-PLAN-STATE-MODEL-MT", 1, 0, false);
        declareFunction(me, "set_shop_basic_plan_state_model_mt", "SET-SHOP-BASIC-PLAN-STATE-MODEL-MT", 2, 0, false);
        declareFunction(me, "get_shop_basic_plan_state_domain", "GET-SHOP-BASIC-PLAN-STATE-DOMAIN", 1, 0, false);
        declareFunction(me, "set_shop_basic_plan_state_domain", "SET-SHOP-BASIC-PLAN-STATE-DOMAIN", 2, 0, false);
        declareFunction(me, "get_shop_basic_plan_state_log", "GET-SHOP-BASIC-PLAN-STATE-LOG", 1, 0, false);
        declareFunction(me, "set_shop_basic_plan_state_log", "SET-SHOP-BASIC-PLAN-STATE-LOG", 2, 0, false);
        declareFunction(me, "get_shop_basic_plan_state_planner", "GET-SHOP-BASIC-PLAN-STATE-PLANNER", 1, 0, false);
        declareFunction(me, "set_shop_basic_plan_state_planner", "SET-SHOP-BASIC-PLAN-STATE-PLANNER", 2, 0, false);
        declareFunction(me, "get_shop_basic_plan_state_previous_states", "GET-SHOP-BASIC-PLAN-STATE-PREVIOUS-STATES", 1, 0, false);
        declareFunction(me, "set_shop_basic_plan_state_previous_states", "SET-SHOP-BASIC-PLAN-STATE-PREVIOUS-STATES", 2, 0, false);
        declareFunction(me, "get_shop_basic_plan_state_depth", "GET-SHOP-BASIC-PLAN-STATE-DEPTH", 1, 0, false);
        declareFunction(me, "set_shop_basic_plan_state_depth", "SET-SHOP-BASIC-PLAN-STATE-DEPTH", 2, 0, false);
        declareFunction(me, "get_shop_basic_plan_state_query_properties", "GET-SHOP-BASIC-PLAN-STATE-QUERY-PROPERTIES", 1, 0, false);
        declareFunction(me, "set_shop_basic_plan_state_query_properties", "SET-SHOP-BASIC-PLAN-STATE-QUERY-PROPERTIES", 2, 0, false);
        declareFunction(me, "get_shop_basic_plan_state_post_ordering", "GET-SHOP-BASIC-PLAN-STATE-POST-ORDERING", 1, 0, false);
        declareFunction(me, "set_shop_basic_plan_state_post_ordering", "SET-SHOP-BASIC-PLAN-STATE-POST-ORDERING", 2, 0, false);
        declareFunction(me, "get_shop_basic_plan_state_partial_plan", "GET-SHOP-BASIC-PLAN-STATE-PARTIAL-PLAN", 1, 0, false);
        declareFunction(me, "set_shop_basic_plan_state_partial_plan", "SET-SHOP-BASIC-PLAN-STATE-PARTIAL-PLAN", 2, 0, false);
        declareFunction(me, "get_shop_basic_plan_state_supports", "GET-SHOP-BASIC-PLAN-STATE-SUPPORTS", 1, 0, false);
        declareFunction(me, "set_shop_basic_plan_state_supports", "SET-SHOP-BASIC-PLAN-STATE-SUPPORTS", 2, 0, false);
        declareFunction(me, "get_shop_basic_plan_state_task_strucs", "GET-SHOP-BASIC-PLAN-STATE-TASK-STRUCS", 1, 0, false);
        declareFunction(me, "set_shop_basic_plan_state_task_strucs", "SET-SHOP-BASIC-PLAN-STATE-TASK-STRUCS", 2, 0, false);
        declareFunction(me, "get_shop_basic_plan_state_mbindings", "GET-SHOP-BASIC-PLAN-STATE-MBINDINGS", 1, 0, false);
        declareFunction(me, "set_shop_basic_plan_state_mbindings", "SET-SHOP-BASIC-PLAN-STATE-MBINDINGS", 2, 0, false);
        declareFunction(me, "get_shop_basic_plan_state_tasklist", "GET-SHOP-BASIC-PLAN-STATE-TASKLIST", 1, 0, false);
        declareFunction(me, "set_shop_basic_plan_state_tasklist", "SET-SHOP-BASIC-PLAN-STATE-TASKLIST", 2, 0, false);
        declareFunction(me, "get_shop_basic_plan_state_world_state", "GET-SHOP-BASIC-PLAN-STATE-WORLD-STATE", 1, 0, false);
        declareFunction(me, "set_shop_basic_plan_state_world_state", "SET-SHOP-BASIC-PLAN-STATE-WORLD-STATE", 2, 0, false);
        declareFunction(me, "subloop_reserved_initialize_shop_basic_plan_state_class", "SUBLOOP-RESERVED-INITIALIZE-SHOP-BASIC-PLAN-STATE-CLASS", 1, 0, false);
        declareFunction(me, "subloop_reserved_initialize_shop_basic_plan_state_instance", "SUBLOOP-RESERVED-INITIALIZE-SHOP-BASIC-PLAN-STATE-INSTANCE", 1, 0, false);
        declareFunction(me, "shop_basic_plan_state_p", "SHOP-BASIC-PLAN-STATE-P", 1, 0, false);
        declareFunction(me, "shop_basic_plan_state_applicable_multibinding_method", "SHOP-BASIC-PLAN-STATE-APPLICABLE-MULTIBINDING-METHOD", 2, 0, false);
        declareFunction(me, "shop_basic_plan_state_set_tasklist_method", "SHOP-BASIC-PLAN-STATE-SET-TASKLIST-METHOD", 2, 0, false);
        declareFunction(me, "shop_basic_plan_state_get_tasklist_method", "SHOP-BASIC-PLAN-STATE-GET-TASKLIST-METHOD", 1, 0, false);
        declareFunction(me, "shop_basic_plan_state_add_decomposition_method", "SHOP-BASIC-PLAN-STATE-ADD-DECOMPOSITION-METHOD", 3, 0, false);
        declareFunction(me, "shop_basic_plan_state_set_multibindings_method", "SHOP-BASIC-PLAN-STATE-SET-MULTIBINDINGS-METHOD", 2, 0, false);
        declareFunction(me, "shop_basic_plan_state_multibindings_method", "SHOP-BASIC-PLAN-STATE-MULTIBINDINGS-METHOD", 1, 0, false);
        declareFunction(me, "shop_basic_plan_state_set_domain_method", "SHOP-BASIC-PLAN-STATE-SET-DOMAIN-METHOD", 2, 0, false);
        declareFunction(me, "shop_basic_plan_state_get_domain_method", "SHOP-BASIC-PLAN-STATE-GET-DOMAIN-METHOD", 1, 0, false);
        declareFunction(me, "shop_basic_plan_state_support_lists_method", "SHOP-BASIC-PLAN-STATE-SUPPORT-LISTS-METHOD", 1, 0, false);
        declareFunction(me, "shop_basic_plan_state_add_to_support_lists_method", "SHOP-BASIC-PLAN-STATE-ADD-TO-SUPPORT-LISTS-METHOD", 2, 0, false);
        declareFunction(me, "shop_basic_plan_state_initialize_method", "SHOP-BASIC-PLAN-STATE-INITIALIZE-METHOD", 1, 0, false);
        declareFunction(me, "shop_basic_plan_state_initialize_plan_state_with_problem_method", "SHOP-BASIC-PLAN-STATE-INITIALIZE-PLAN-STATE-WITH-PROBLEM-METHOD", 3, 0, false);
        declareFunction(me, "shop_basic_plan_state_initialize_multibindings_method", "SHOP-BASIC-PLAN-STATE-INITIALIZE-MULTIBINDINGS-METHOD", 1, 0, false);
        declareFunction(me, "shop_basic_plan_state_output_message_method", "SHOP-BASIC-PLAN-STATE-OUTPUT-MESSAGE-METHOD", 2, 0, false);
        declareFunction(me, "shop_basic_plan_state_copy_method", "SHOP-BASIC-PLAN-STATE-COPY-METHOD", 1, 0, false);
        declareFunction(me, "shop_basic_plan_state_create_next_method", "SHOP-BASIC-PLAN-STATE-CREATE-NEXT-METHOD", 1, 0, false);
        declareFunction(me, "shop_basic_plan_state_init_model_with_problem_method", "SHOP-BASIC-PLAN-STATE-INIT-MODEL-WITH-PROBLEM-METHOD", 2, 0, false);
        declareFunction(me, "shop_basic_plan_state_set_world_state_method", "SHOP-BASIC-PLAN-STATE-SET-WORLD-STATE-METHOD", 2, 0, false);
        declareFunction(me, "shop_basic_plan_state_get_world_state_method", "SHOP-BASIC-PLAN-STATE-GET-WORLD-STATE-METHOD", 1, 0, false);
        declareFunction(me, "shop_basic_plan_state_mbinding_method", "SHOP-BASIC-PLAN-STATE-MBINDING-METHOD", 1, 0, false);
        declareFunction(me, "shop_basic_plan_state_set_depth_method", "SHOP-BASIC-PLAN-STATE-SET-DEPTH-METHOD", 2, 0, false);
        declareFunction(me, "shop_basic_plan_state_depth_method", "SHOP-BASIC-PLAN-STATE-DEPTH-METHOD", 1, 0, false);
        declareFunction(me, "shop_basic_plan_state_set_previous_states_method", "SHOP-BASIC-PLAN-STATE-SET-PREVIOUS-STATES-METHOD", 2, 0, false);
        declareFunction(me, "shop_basic_plan_state_get_previous_states_method", "SHOP-BASIC-PLAN-STATE-GET-PREVIOUS-STATES-METHOD", 1, 0, false);
        declareFunction(me, "shop_basic_plan_state_add_to_previous_states_method", "SHOP-BASIC-PLAN-STATE-ADD-TO-PREVIOUS-STATES-METHOD", 2, 0, false);
        declareFunction(me, "shop_basic_plan_state_set_partial_plan_method", "SHOP-BASIC-PLAN-STATE-SET-PARTIAL-PLAN-METHOD", 2, 0, false);
        declareFunction(me, "shop_basic_plan_state_get_partial_plan_method", "SHOP-BASIC-PLAN-STATE-GET-PARTIAL-PLAN-METHOD", 1, 0, false);
        declareFunction(me, "shop_basic_plan_state_add_to_partial_plan_method", "SHOP-BASIC-PLAN-STATE-ADD-TO-PARTIAL-PLAN-METHOD", 2, 0, false);
        declareFunction(me, "shop_basic_plan_state_add_to_post_ordering_method", "SHOP-BASIC-PLAN-STATE-ADD-TO-POST-ORDERING-METHOD", 2, 0, false);
        declareFunction(me, "shop_basic_plan_state_add_to_mbindings_method", "SHOP-BASIC-PLAN-STATE-ADD-TO-MBINDINGS-METHOD", 2, 0, false);
        declareFunction(me, "shop_basic_plan_state_planner_rules_method", "SHOP-BASIC-PLAN-STATE-PLANNER-RULES-METHOD", 1, 0, false);
        declareFunction(me, "shop_basic_plan_state_add_to_task_strucs_method", "SHOP-BASIC-PLAN-STATE-ADD-TO-TASK-STRUCS-METHOD", 2, 0, false);
        declareFunction(me, "shop_basic_plan_state_task_strucs_method", "SHOP-BASIC-PLAN-STATE-TASK-STRUCS-METHOD", 1, 0, false);
        declareFunction(me, "shop_basic_plan_state_get_planner_method", "SHOP-BASIC-PLAN-STATE-GET-PLANNER-METHOD", 1, 0, false);
        declareFunction(me, "shop_basic_plan_state_set_planner_method", "SHOP-BASIC-PLAN-STATE-SET-PLANNER-METHOD", 2, 0, false);
        declareFunction(me, "shop_basic_plan_state_get_which_plans_method", "SHOP-BASIC-PLAN-STATE-GET-WHICH-PLANS-METHOD", 1, 0, false);
        declareFunction(me, "shop_basic_plan_state_simple_situation_predP_method", "SHOP-BASIC-PLAN-STATE-SIMPLE-SITUATION-PRED?-METHOD", 2, 0, false);
        declareFunction(me, "shop_basic_plan_state_seek_total_mbindings_method", "SHOP-BASIC-PLAN-STATE-SEEK-TOTAL-MBINDINGS-METHOD", 3, 0, false);
        declareFunction(me, "shop_basic_plan_state_find_mbindings_method", "SHOP-BASIC-PLAN-STATE-FIND-MBINDINGS-METHOD", 3, 0, false);
        declareFunction(me, "shop_same_taskP", "SHOP-SAME-TASK?", 2, 0, false);
        declareFunction(me, "shop_find_next_match", "SHOP-FIND-NEXT-MATCH", 2, 0, false);
        declareFunction(me, "shop_basic_plan_state_parent_taskP_method", "SHOP-BASIC-PLAN-STATE-PARENT-TASK?-METHOD", 2, 0, false);
        declareFunction(me, "shop_basic_plan_state_expand_method", "SHOP-BASIC-PLAN-STATE-EXPAND-METHOD", 1, 0, false);
        declareFunction(me, "shop_basic_plan_state_expand_complex_method", "SHOP-BASIC-PLAN-STATE-EXPAND-COMPLEX-METHOD", 2, 0, false);
        declareFunction(me, "shop_basic_plan_state_expand_primitive_preconditions_method", "SHOP-BASIC-PLAN-STATE-EXPAND-PRIMITIVE-PRECONDITIONS-METHOD", 2, 0, false);
        declareFunction(me, "shop_basic_plan_state_expand_primitive_method", "SHOP-BASIC-PLAN-STATE-EXPAND-PRIMITIVE-METHOD", 2, 0, false);
        declareFunction(me, "shop_basic_plan_state_apply_operators_method", "SHOP-BASIC-PLAN-STATE-APPLY-OPERATORS-METHOD", 4, 0, false);
        declareFunction(me, "shop_basic_plan_state_apply_operator_method", "SHOP-BASIC-PLAN-STATE-APPLY-OPERATOR-METHOD", 3, 0, false);
        declareFunction(me, "shop_basic_plan_state_apply_conditional_operator_method", "SHOP-BASIC-PLAN-STATE-APPLY-CONDITIONAL-OPERATOR-METHOD", 3, 0, false);
        declareFunction(me, "shop_basic_plan_state_unify_planner_rule_method", "SHOP-BASIC-PLAN-STATE-UNIFY-PLANNER-RULE-METHOD", 3, 0, false);
        declareFunction(me, "shop_basic_plan_state_apply_all_methods_method", "SHOP-BASIC-PLAN-STATE-APPLY-ALL-METHODS-METHOD", 2, 0, false);
        declareFunction(me, "shop_basic_plan_state_apply_method_method", "SHOP-BASIC-PLAN-STATE-APPLY-METHOD-METHOD", 3, 0, false);
        declareFunction(me, "shop_basic_plan_state_apply_all_sufficient_conditions_method", "SHOP-BASIC-PLAN-STATE-APPLY-ALL-SUFFICIENT-CONDITIONS-METHOD", 2, 0, false);
        declareFunction(me, "shop_basic_plan_state_apply_sufficient_condition_method", "SHOP-BASIC-PLAN-STATE-APPLY-SUFFICIENT-CONDITION-METHOD", 3, 0, false);
        declareFunction(me, "shop_basic_plan_state_apply_all_preconditions_method", "SHOP-BASIC-PLAN-STATE-APPLY-ALL-PRECONDITIONS-METHOD", 2, 0, false);
        declareFunction(me, "shop_basic_plan_state_apply_precondition_method", "SHOP-BASIC-PLAN-STATE-APPLY-PRECONDITION-METHOD", 3, 0, false);
        return NIL;
    }

    public static SubLObject init_shop_basic_plan_state_file() {
        defparameter("*SHOP-CANONICALIZE-FUNCTIONS?*", T);
        return NIL;
    }

    public static SubLObject setup_shop_basic_plan_state_file() {
        interfaces.new_interface(SHOP_PLAN_STATE, NIL, NIL, $list12);
        classes.subloop_new_class(SHOP_BASIC_PLAN_STATE, OBJECT, $list15, NIL, $list16);
        classes.class_set_implements_slot_listeners(SHOP_BASIC_PLAN_STATE, NIL);
        classes.subloop_note_class_initialization_function(SHOP_BASIC_PLAN_STATE, SUBLOOP_RESERVED_INITIALIZE_SHOP_BASIC_PLAN_STATE_CLASS);
        classes.subloop_note_instance_initialization_function(SHOP_BASIC_PLAN_STATE, SUBLOOP_RESERVED_INITIALIZE_SHOP_BASIC_PLAN_STATE_INSTANCE);
        subloop_reserved_initialize_shop_basic_plan_state_class(SHOP_BASIC_PLAN_STATE);
        methods.methods_incorporate_class_method(APPLICABLE_MULTIBINDING, SHOP_BASIC_PLAN_STATE, $list38, $list39, $list40);
        methods.subloop_register_class_method(SHOP_BASIC_PLAN_STATE, APPLICABLE_MULTIBINDING, SHOP_BASIC_PLAN_STATE_APPLICABLE_MULTIBINDING_METHOD);
        methods.methods_incorporate_instance_method(SET_TASKLIST, SHOP_BASIC_PLAN_STATE, $list38, $list43, $list44);
        methods.subloop_register_instance_method(SHOP_BASIC_PLAN_STATE, SET_TASKLIST, SHOP_BASIC_PLAN_STATE_SET_TASKLIST_METHOD);
        methods.methods_incorporate_instance_method(GET_TASKLIST, SHOP_BASIC_PLAN_STATE, $list49, NIL, $list50);
        methods.subloop_register_instance_method(SHOP_BASIC_PLAN_STATE, GET_TASKLIST, SHOP_BASIC_PLAN_STATE_GET_TASKLIST_METHOD);
        methods.methods_incorporate_instance_method(ADD_DECOMPOSITION, SHOP_BASIC_PLAN_STATE, $list54, $list55, $list56);
        methods.subloop_register_instance_method(SHOP_BASIC_PLAN_STATE, ADD_DECOMPOSITION, SHOP_BASIC_PLAN_STATE_ADD_DECOMPOSITION_METHOD);
        methods.methods_incorporate_instance_method(SET_MULTIBINDINGS, SHOP_BASIC_PLAN_STATE, $list49, $list61, $list62);
        methods.subloop_register_instance_method(SHOP_BASIC_PLAN_STATE, SET_MULTIBINDINGS, SHOP_BASIC_PLAN_STATE_SET_MULTIBINDINGS_METHOD);
        methods.methods_incorporate_instance_method(MULTIBINDINGS, SHOP_BASIC_PLAN_STATE, $list49, NIL, $list66);
        methods.subloop_register_instance_method(SHOP_BASIC_PLAN_STATE, MULTIBINDINGS, SHOP_BASIC_PLAN_STATE_MULTIBINDINGS_METHOD);
        methods.methods_incorporate_instance_method(SET_DOMAIN, SHOP_BASIC_PLAN_STATE, $list38, $list70, $list71);
        methods.subloop_register_instance_method(SHOP_BASIC_PLAN_STATE, SET_DOMAIN, SHOP_BASIC_PLAN_STATE_SET_DOMAIN_METHOD);
        methods.methods_incorporate_instance_method(GET_DOMAIN, SHOP_BASIC_PLAN_STATE, $list49, NIL, $list75);
        methods.subloop_register_instance_method(SHOP_BASIC_PLAN_STATE, GET_DOMAIN, SHOP_BASIC_PLAN_STATE_GET_DOMAIN_METHOD);
        methods.methods_incorporate_instance_method(SUPPORT_LISTS, SHOP_BASIC_PLAN_STATE, $list49, NIL, $list79);
        methods.subloop_register_instance_method(SHOP_BASIC_PLAN_STATE, SUPPORT_LISTS, SHOP_BASIC_PLAN_STATE_SUPPORT_LISTS_METHOD);
        methods.methods_incorporate_instance_method(ADD_TO_SUPPORT_LISTS, SHOP_BASIC_PLAN_STATE, $list49, $list83, $list84);
        methods.subloop_register_instance_method(SHOP_BASIC_PLAN_STATE, ADD_TO_SUPPORT_LISTS, SHOP_BASIC_PLAN_STATE_ADD_TO_SUPPORT_LISTS_METHOD);
        methods.methods_incorporate_instance_method(INITIALIZE, SHOP_BASIC_PLAN_STATE, $list38, NIL, $list88);
        methods.subloop_register_instance_method(SHOP_BASIC_PLAN_STATE, INITIALIZE, SHOP_BASIC_PLAN_STATE_INITIALIZE_METHOD);
        methods.methods_incorporate_instance_method(INITIALIZE_PLAN_STATE_WITH_PROBLEM, SHOP_BASIC_PLAN_STATE, $list92, $list93, $list94);
        methods.subloop_register_instance_method(SHOP_BASIC_PLAN_STATE, INITIALIZE_PLAN_STATE_WITH_PROBLEM, SHOP_BASIC_PLAN_STATE_INITIALIZE_PLAN_STATE_WITH_PROBLEM_METHOD);
        methods.methods_incorporate_instance_method(INITIALIZE_MULTIBINDINGS, SHOP_BASIC_PLAN_STATE, $list100, NIL, $list101);
        methods.subloop_register_instance_method(SHOP_BASIC_PLAN_STATE, INITIALIZE_MULTIBINDINGS, SHOP_BASIC_PLAN_STATE_INITIALIZE_MULTIBINDINGS_METHOD);
        methods.methods_incorporate_instance_method(OUTPUT_MESSAGE, SHOP_BASIC_PLAN_STATE, $list49, $list105, $list106);
        methods.subloop_register_instance_method(SHOP_BASIC_PLAN_STATE, OUTPUT_MESSAGE, SHOP_BASIC_PLAN_STATE_OUTPUT_MESSAGE_METHOD);
        methods.methods_incorporate_instance_method(COPY, SHOP_BASIC_PLAN_STATE, $list49, NIL, $list110);
        methods.subloop_register_instance_method(SHOP_BASIC_PLAN_STATE, COPY, SHOP_BASIC_PLAN_STATE_COPY_METHOD);
        methods.methods_incorporate_instance_method(CREATE_NEXT, SHOP_BASIC_PLAN_STATE, $list49, NIL, $list113);
        methods.subloop_register_instance_method(SHOP_BASIC_PLAN_STATE, CREATE_NEXT, SHOP_BASIC_PLAN_STATE_CREATE_NEXT_METHOD);
        methods.methods_incorporate_instance_method(INIT_MODEL_WITH_PROBLEM, SHOP_BASIC_PLAN_STATE, $list100, $list117, $list118);
        methods.subloop_register_instance_method(SHOP_BASIC_PLAN_STATE, INIT_MODEL_WITH_PROBLEM, SHOP_BASIC_PLAN_STATE_INIT_MODEL_WITH_PROBLEM_METHOD);
        methods.methods_incorporate_instance_method(SET_WORLD_STATE, SHOP_BASIC_PLAN_STATE, $list38, $list122, $list123);
        methods.subloop_register_instance_method(SHOP_BASIC_PLAN_STATE, SET_WORLD_STATE, SHOP_BASIC_PLAN_STATE_SET_WORLD_STATE_METHOD);
        methods.methods_incorporate_instance_method(GET_WORLD_STATE, SHOP_BASIC_PLAN_STATE, $list49, NIL, $list128);
        methods.subloop_register_instance_method(SHOP_BASIC_PLAN_STATE, GET_WORLD_STATE, SHOP_BASIC_PLAN_STATE_GET_WORLD_STATE_METHOD);
        methods.methods_incorporate_instance_method(MBINDING, SHOP_BASIC_PLAN_STATE, $list49, NIL, $list66);
        methods.subloop_register_instance_method(SHOP_BASIC_PLAN_STATE, MBINDING, SHOP_BASIC_PLAN_STATE_MBINDING_METHOD);
        methods.methods_incorporate_instance_method(SET_DEPTH, SHOP_BASIC_PLAN_STATE, $list38, $list135, $list136);
        methods.subloop_register_instance_method(SHOP_BASIC_PLAN_STATE, SET_DEPTH, SHOP_BASIC_PLAN_STATE_SET_DEPTH_METHOD);
        methods.methods_incorporate_instance_method(DEPTH, SHOP_BASIC_PLAN_STATE, $list49, NIL, $list140);
        methods.subloop_register_instance_method(SHOP_BASIC_PLAN_STATE, DEPTH, SHOP_BASIC_PLAN_STATE_DEPTH_METHOD);
        methods.methods_incorporate_instance_method(SET_PREVIOUS_STATES, SHOP_BASIC_PLAN_STATE, $list38, $list144, $list145);
        methods.subloop_register_instance_method(SHOP_BASIC_PLAN_STATE, SET_PREVIOUS_STATES, SHOP_BASIC_PLAN_STATE_SET_PREVIOUS_STATES_METHOD);
        methods.methods_incorporate_instance_method(GET_PREVIOUS_STATES, SHOP_BASIC_PLAN_STATE, $list49, NIL, $list149);
        methods.subloop_register_instance_method(SHOP_BASIC_PLAN_STATE, GET_PREVIOUS_STATES, SHOP_BASIC_PLAN_STATE_GET_PREVIOUS_STATES_METHOD);
        methods.methods_incorporate_instance_method(ADD_TO_PREVIOUS_STATES, SHOP_BASIC_PLAN_STATE, $list38, $list153, $list154);
        methods.subloop_register_instance_method(SHOP_BASIC_PLAN_STATE, ADD_TO_PREVIOUS_STATES, SHOP_BASIC_PLAN_STATE_ADD_TO_PREVIOUS_STATES_METHOD);
        methods.methods_incorporate_instance_method(SET_PARTIAL_PLAN, SHOP_BASIC_PLAN_STATE, $list38, $list158, $list159);
        methods.subloop_register_instance_method(SHOP_BASIC_PLAN_STATE, SET_PARTIAL_PLAN, SHOP_BASIC_PLAN_STATE_SET_PARTIAL_PLAN_METHOD);
        methods.methods_incorporate_instance_method(GET_PARTIAL_PLAN, SHOP_BASIC_PLAN_STATE, $list49, NIL, $list163);
        methods.subloop_register_instance_method(SHOP_BASIC_PLAN_STATE, GET_PARTIAL_PLAN, SHOP_BASIC_PLAN_STATE_GET_PARTIAL_PLAN_METHOD);
        methods.methods_incorporate_instance_method(ADD_TO_PARTIAL_PLAN, SHOP_BASIC_PLAN_STATE, $list38, $list167, $list168);
        methods.subloop_register_instance_method(SHOP_BASIC_PLAN_STATE, ADD_TO_PARTIAL_PLAN, SHOP_BASIC_PLAN_STATE_ADD_TO_PARTIAL_PLAN_METHOD);
        methods.methods_incorporate_instance_method(ADD_TO_POST_ORDERING, SHOP_BASIC_PLAN_STATE, $list54, $list167, $list172);
        methods.subloop_register_instance_method(SHOP_BASIC_PLAN_STATE, ADD_TO_POST_ORDERING, SHOP_BASIC_PLAN_STATE_ADD_TO_POST_ORDERING_METHOD);
        methods.methods_incorporate_instance_method(ADD_TO_MBINDINGS, SHOP_BASIC_PLAN_STATE, $list49, $list176, $list177);
        methods.subloop_register_instance_method(SHOP_BASIC_PLAN_STATE, ADD_TO_MBINDINGS, SHOP_BASIC_PLAN_STATE_ADD_TO_MBINDINGS_METHOD);
        methods.methods_incorporate_instance_method(PLANNER_RULES, SHOP_BASIC_PLAN_STATE, $list49, NIL, $list181);
        methods.subloop_register_instance_method(SHOP_BASIC_PLAN_STATE, PLANNER_RULES, SHOP_BASIC_PLAN_STATE_PLANNER_RULES_METHOD);
        methods.methods_incorporate_instance_method(ADD_TO_TASK_STRUCS, SHOP_BASIC_PLAN_STATE, $list54, $list185, $list186);
        methods.subloop_register_instance_method(SHOP_BASIC_PLAN_STATE, ADD_TO_TASK_STRUCS, SHOP_BASIC_PLAN_STATE_ADD_TO_TASK_STRUCS_METHOD);
        methods.methods_incorporate_instance_method(TASK_STRUCS, SHOP_BASIC_PLAN_STATE, $list49, NIL, $list181);
        methods.subloop_register_instance_method(SHOP_BASIC_PLAN_STATE, TASK_STRUCS, SHOP_BASIC_PLAN_STATE_TASK_STRUCS_METHOD);
        methods.methods_incorporate_instance_method(GET_PLANNER, SHOP_BASIC_PLAN_STATE, $list49, NIL, $list192);
        methods.subloop_register_instance_method(SHOP_BASIC_PLAN_STATE, GET_PLANNER, SHOP_BASIC_PLAN_STATE_GET_PLANNER_METHOD);
        methods.methods_incorporate_instance_method(SET_PLANNER, SHOP_BASIC_PLAN_STATE, $list49, $list158, $list196);
        methods.subloop_register_instance_method(SHOP_BASIC_PLAN_STATE, SET_PLANNER, SHOP_BASIC_PLAN_STATE_SET_PLANNER_METHOD);
        methods.methods_incorporate_instance_method(GET_WHICH_PLANS, SHOP_BASIC_PLAN_STATE, $list49, NIL, $list200);
        methods.subloop_register_instance_method(SHOP_BASIC_PLAN_STATE, GET_WHICH_PLANS, SHOP_BASIC_PLAN_STATE_GET_WHICH_PLANS_METHOD);
        methods.methods_incorporate_instance_method($sym204$SIMPLE_SITUATION_PRED_, SHOP_BASIC_PLAN_STATE, $list54, $list205, $list206);
        methods.subloop_register_instance_method(SHOP_BASIC_PLAN_STATE, $sym204$SIMPLE_SITUATION_PRED_, $sym210$SHOP_BASIC_PLAN_STATE_SIMPLE_SITUATION_PRED__METHOD);
        methods.methods_incorporate_instance_method(SEEK_TOTAL_MBINDINGS, SHOP_BASIC_PLAN_STATE, $list54, $list212, $list213);
        methods.subloop_register_instance_method(SHOP_BASIC_PLAN_STATE, SEEK_TOTAL_MBINDINGS, SHOP_BASIC_PLAN_STATE_SEEK_TOTAL_MBINDINGS_METHOD);
        methods.methods_incorporate_instance_method(FIND_MBINDINGS, SHOP_BASIC_PLAN_STATE, $list54, $list223, $list224);
        methods.subloop_register_instance_method(SHOP_BASIC_PLAN_STATE, FIND_MBINDINGS, SHOP_BASIC_PLAN_STATE_FIND_MBINDINGS_METHOD);
        methods.methods_incorporate_instance_method($sym227$PARENT_TASK_, SHOP_BASIC_PLAN_STATE, $list38, $list167, $list228);
        methods.subloop_register_instance_method(SHOP_BASIC_PLAN_STATE, $sym227$PARENT_TASK_, $sym230$SHOP_BASIC_PLAN_STATE_PARENT_TASK__METHOD);
        methods.methods_incorporate_instance_method(EXPAND, SHOP_BASIC_PLAN_STATE, $list49, NIL, $list232);
        methods.subloop_register_instance_method(SHOP_BASIC_PLAN_STATE, EXPAND, SHOP_BASIC_PLAN_STATE_EXPAND_METHOD);
        methods.methods_incorporate_instance_method(EXPAND_COMPLEX, SHOP_BASIC_PLAN_STATE, $list49, $list167, $list245);
        methods.subloop_register_instance_method(SHOP_BASIC_PLAN_STATE, EXPAND_COMPLEX, SHOP_BASIC_PLAN_STATE_EXPAND_COMPLEX_METHOD);
        methods.methods_incorporate_instance_method(EXPAND_PRIMITIVE_PRECONDITIONS, SHOP_BASIC_PLAN_STATE, $list49, $list167, $list249);
        methods.subloop_register_instance_method(SHOP_BASIC_PLAN_STATE, EXPAND_PRIMITIVE_PRECONDITIONS, SHOP_BASIC_PLAN_STATE_EXPAND_PRIMITIVE_PRECONDITIONS_METHOD);
        methods.methods_incorporate_instance_method(EXPAND_PRIMITIVE, SHOP_BASIC_PLAN_STATE, $list54, $list167, $list252);
        methods.subloop_register_instance_method(SHOP_BASIC_PLAN_STATE, EXPAND_PRIMITIVE, SHOP_BASIC_PLAN_STATE_EXPAND_PRIMITIVE_METHOD);
        methods.methods_incorporate_instance_method(APPLY_OPERATORS, SHOP_BASIC_PLAN_STATE, $list38, $list264, $list265);
        methods.subloop_register_instance_method(SHOP_BASIC_PLAN_STATE, APPLY_OPERATORS, SHOP_BASIC_PLAN_STATE_APPLY_OPERATORS_METHOD);
        methods.methods_incorporate_instance_method(APPLY_OPERATOR, SHOP_BASIC_PLAN_STATE, $list54, $list279, $list280);
        methods.subloop_register_instance_method(SHOP_BASIC_PLAN_STATE, APPLY_OPERATOR, SHOP_BASIC_PLAN_STATE_APPLY_OPERATOR_METHOD);
        methods.methods_incorporate_instance_method(APPLY_CONDITIONAL_OPERATOR, SHOP_BASIC_PLAN_STATE, $list38, $list279, $list283);
        methods.subloop_register_instance_method(SHOP_BASIC_PLAN_STATE, APPLY_CONDITIONAL_OPERATOR, SHOP_BASIC_PLAN_STATE_APPLY_CONDITIONAL_OPERATOR_METHOD);
        methods.methods_incorporate_instance_method(UNIFY_PLANNER_RULE, SHOP_BASIC_PLAN_STATE, $list54, $list289, $list290);
        methods.subloop_register_instance_method(SHOP_BASIC_PLAN_STATE, UNIFY_PLANNER_RULE, SHOP_BASIC_PLAN_STATE_UNIFY_PLANNER_RULE_METHOD);
        methods.methods_incorporate_instance_method(APPLY_ALL_METHODS, SHOP_BASIC_PLAN_STATE, $list54, $list167, $list298);
        methods.subloop_register_instance_method(SHOP_BASIC_PLAN_STATE, APPLY_ALL_METHODS, SHOP_BASIC_PLAN_STATE_APPLY_ALL_METHODS_METHOD);
        methods.methods_incorporate_instance_method(APPLY_METHOD, SHOP_BASIC_PLAN_STATE, $list54, $list305, $list306);
        methods.subloop_register_instance_method(SHOP_BASIC_PLAN_STATE, APPLY_METHOD, SHOP_BASIC_PLAN_STATE_APPLY_METHOD_METHOD);
        methods.methods_incorporate_instance_method(APPLY_ALL_SUFFICIENT_CONDITIONS, SHOP_BASIC_PLAN_STATE, $list54, $list167, $list316);
        methods.subloop_register_instance_method(SHOP_BASIC_PLAN_STATE, APPLY_ALL_SUFFICIENT_CONDITIONS, SHOP_BASIC_PLAN_STATE_APPLY_ALL_SUFFICIENT_CONDITIONS_METHOD);
        methods.methods_incorporate_instance_method(APPLY_SUFFICIENT_CONDITION, SHOP_BASIC_PLAN_STATE, $list54, $list323, $list324);
        methods.subloop_register_instance_method(SHOP_BASIC_PLAN_STATE, APPLY_SUFFICIENT_CONDITION, SHOP_BASIC_PLAN_STATE_APPLY_SUFFICIENT_CONDITION_METHOD);
        methods.methods_incorporate_instance_method(APPLY_ALL_PRECONDITIONS, SHOP_BASIC_PLAN_STATE, $list38, $list167, $list329);
        methods.subloop_register_instance_method(SHOP_BASIC_PLAN_STATE, APPLY_ALL_PRECONDITIONS, SHOP_BASIC_PLAN_STATE_APPLY_ALL_PRECONDITIONS_METHOD);
        methods.methods_incorporate_instance_method(APPLY_PRECONDITION, SHOP_BASIC_PLAN_STATE, $list38, $list336, $list337);
        methods.subloop_register_instance_method(SHOP_BASIC_PLAN_STATE, APPLY_PRECONDITION, SHOP_BASIC_PLAN_STATE_APPLY_PRECONDITION_METHOD);
        return NIL;
    }

    @Override
    public void declareFunctions() {
        declare_shop_basic_plan_state_file();
    }

    @Override
    public void initializeVariables() {
        init_shop_basic_plan_state_file();
    }

    @Override
    public void runTopLevelForms() {
        setup_shop_basic_plan_state_file();
    }

    
}

/**
 * Total time: 1990 ms
 */
