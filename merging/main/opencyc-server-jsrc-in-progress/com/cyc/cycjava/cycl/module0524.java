package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class module0524 extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.module0524";
    public static final String myFingerPrint = "ed3659f9cf0d48d0c3c8b5d0528a4339e1758f82f4b56e830c7314d90cf6fb61";
    private static final SubLSymbol $ic0$;
    private static final SubLList $ic1$;
    private static final SubLList $ic2$;
    private static final SubLList $ic3$;
    private static final SubLObject $ic4$;
    private static final SubLSymbol $ic5$;
    private static final SubLSymbol $ic6$;
    private static final SubLObject $ic7$;
    private static final SubLSymbol $ic8$;
    private static final SubLSymbol $ic9$;
    private static final SubLSymbol $ic10$;
    private static final SubLSymbol $ic11$;
    private static final SubLSymbol $ic12$;
    private static final SubLObject $ic13$;
    private static final SubLSymbol $ic14$;
    private static final SubLObject $ic15$;
    private static final SubLSymbol $ic16$;
    private static final SubLSymbol $ic17$;
    private static final SubLList $ic18$;
    
    public static SubLObject f32669(final SubLObject var1) {
        final SubLThread var2 = SubLProcess.currentSubLThread();
        final SubLObject var3 = module0067.f4880((SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        final SubLObject var4 = module0067.f4880((SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        SubLObject var5 = (SubLObject)ZERO_INTEGER;
        SubLObject var6 = module0232.f15308(var1);
        SubLObject var7 = (SubLObject)NIL;
        var7 = var6.first();
        while (NIL != var6) {
            SubLObject var9;
            final SubLObject var8 = var9 = var7;
            SubLObject var10 = (SubLObject)NIL;
            SubLObject var11 = (SubLObject)NIL;
            cdestructuring_bind.destructuring_bind_must_consp(var9, var8, (SubLObject)$ic2$);
            var10 = var9.first();
            var9 = var9.rest();
            cdestructuring_bind.destructuring_bind_must_consp(var9, var8, (SubLObject)$ic2$);
            var11 = var9.first();
            var9 = var9.rest();
            if (NIL == var9) {
                if (NIL != module0202.f12598(var11)) {
                    var2.resetMultipleValues();
                    final SubLObject var12 = module0202.f12796(var11);
                    final SubLObject var13 = var2.secondMultipleValue();
                    final SubLObject var14 = var2.thirdMultipleValue();
                    var2.resetMultipleValues();
                    if (NIL != conses_high.member(var12, module0741.f45905(), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)) {
                        if (NIL != conses_high.member((SubLObject)TWO_INTEGER, module0741.f45906(var12), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)) {
                            module0084.f5762(var3, var14, var5);
                        }
                    }
                    else if (NIL != module0004.f104(var12, (SubLObject)$ic3$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)) {
                        if (NIL != module0209.f13550(var13)) {
                            module0084.f5762(var4, var14, var5);
                        }
                    }
                    else if (var12.eql($ic4$) && NIL != module0209.f13550(var14)) {
                        module0084.f5762(var4, var13, var5);
                    }
                }
            }
            else {
                cdestructuring_bind.cdestructuring_bind_error(var8, (SubLObject)$ic2$);
            }
            var5 = Numbers.add(var5, (SubLObject)ONE_INTEGER);
            var6 = var6.rest();
            var7 = var6.first();
        }
        SubLObject var15 = (SubLObject)NIL;
        SubLObject var16;
        for (var16 = module0066.f4838(module0067.f4891(var4)); NIL == module0066.f4841(var16); var16 = module0066.f4840(var16)) {
            var2.resetMultipleValues();
            final SubLObject var17 = module0066.f4839(var16);
            final SubLObject var18 = var2.secondMultipleValue();
            var2.resetMultipleValues();
            final SubLObject var19 = module0067.f4884(var3, var17, (SubLObject)UNPROVIDED);
            if (NIL != var19) {
                SubLObject var21;
                final SubLObject var20 = var21 = module0035.f2489((SubLObject)ConsesLow.list(var19, var18), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                SubLObject var22 = (SubLObject)NIL;
                var22 = var21.first();
                while (NIL != var21) {
                    var15 = (SubLObject)ConsesLow.cons(module0204.f13098((SubLObject)NIL, var22), var15);
                    var21 = var21.rest();
                    var22 = var21.first();
                }
            }
        }
        module0066.f4842(var16);
        return Sequences.nreverse(var15);
    }
    
    public static SubLObject f32670(final SubLObject var1) {
        return (SubLObject)ONE_INTEGER;
    }
    
    public static SubLObject f32671(final SubLObject var1) {
        final SubLThread var2 = SubLProcess.currentSubLThread();
        var2.resetMultipleValues();
        final SubLObject var3 = f32672(var1);
        final SubLObject var4 = var2.secondMultipleValue();
        final SubLObject var5 = var2.thirdMultipleValue();
        final SubLObject var6 = var2.fourthMultipleValue();
        final SubLObject var7 = var2.fifthMultipleValue();
        final SubLObject var8 = var2.sixthMultipleValue();
        final SubLObject var9 = var2.seventhMultipleValue();
        var2.resetMultipleValues();
        final SubLObject var10 = (SubLObject)((NIL != module0260.f17089(var7, $ic7$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)) ? $ic8$ : $ic9$);
        final SubLObject var11 = module0741.f45885(var4, var10);
        if (NIL != module0077.f5302(var11)) {
            final SubLObject var12 = module0077.f5333(var11);
            SubLObject var13;
            SubLObject var14;
            SubLObject var15;
            SubLObject var16;
            SubLObject var17;
            SubLObject var18;
            SubLObject var19;
            SubLObject var20;
            SubLObject var21;
            SubLObject var22;
            SubLObject var23;
            SubLObject var24;
            SubLObject var25;
            SubLObject var26;
            SubLObject var27;
            SubLObject var28;
            SubLObject var29;
            SubLObject var30;
            SubLObject var31;
            SubLObject var32;
            for (var13 = module0032.f1741(var12), var14 = (SubLObject)NIL, var14 = module0032.f1742(var13, var12); NIL == module0032.f1744(var13, var14); var14 = module0032.f1743(var14)) {
                var15 = module0032.f1745(var13, var14);
                if (NIL != module0032.f1746(var14, var15) && NIL != f32673(var7, var4, var15)) {
                    var2.resetMultipleValues();
                    var16 = module0235.f15474(var5, var15, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                    var17 = var2.secondMultipleValue();
                    var2.resetMultipleValues();
                    if (NIL != var16) {
                        var18 = module0147.f9540(var8);
                        var19 = module0147.$g2095$.currentBinding(var2);
                        var20 = module0147.$g2094$.currentBinding(var2);
                        var21 = module0147.$g2096$.currentBinding(var2);
                        try {
                            module0147.$g2095$.bind(module0147.f9545(var18), var2);
                            module0147.$g2094$.bind(module0147.f9546(var18), var2);
                            module0147.$g2096$.bind(module0147.f9549(var18), var2);
                            var22 = module0205.f13183(var15, (SubLObject)$ic10$, (SubLObject)NIL, Symbols.symbol_function((SubLObject)EQUAL), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                            if (NIL != module0212.f13762(var3)) {
                                var22 = (SubLObject)ConsesLow.cons(var3, var22);
                            }
                            var23 = module0218.f14453(var22, (SubLObject)UNPROVIDED);
                            var24 = (SubLObject)NIL;
                            var24 = var23.first();
                            while (NIL != var23) {
                                if ((NIL == var3 || var3.equal(module0205.f13136(module0178.f11303(var24)))) && NIL != Equality.equal(var15, module0205.f13134(module0178.f11303(var24), (SubLObject)TWO_INTEGER, (SubLObject)UNPROVIDED))) {
                                    var25 = module0178.f11334(var24);
                                    var2.resetMultipleValues();
                                    var26 = module0235.f15474(var6, var25, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                                    var27 = var2.secondMultipleValue();
                                    var2.resetMultipleValues();
                                    if (NIL != var26) {
                                        var28 = ((NIL != module0193.f12067(var6)) ? ConsesLow.append(conses_high.copy_list(var16), var26) : conses_high.copy_list(var16));
                                        var29 = module0202.f12768(var7, var15, var4);
                                        var30 = (SubLObject)ConsesLow.list(var24);
                                        var31 = (SubLObject)ConsesLow.list(module0191.f11990((SubLObject)$ic11$, var29, module0132.$g1547$.getGlobalValue(), (SubLObject)UNPROVIDED));
                                        var32 = module0035.f2477((SubLObject)ConsesLow.list(var30, var31), var9);
                                        module0376.f26641(var28, var32);
                                    }
                                }
                                var23 = var23.rest();
                                var24 = var23.first();
                            }
                        }
                        finally {
                            module0147.$g2096$.rebind(var21, var2);
                            module0147.$g2094$.rebind(var20, var2);
                            module0147.$g2095$.rebind(var19, var2);
                        }
                    }
                }
            }
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f32673(final SubLObject var25, final SubLObject var22, final SubLObject var32) {
        if (var25.eql($ic4$)) {
            return Equality.equalp(var22, var32);
        }
        final SubLObject var33 = (NIL != module0260.f17089(var25, $ic7$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)) ? Symbols.symbol_function((SubLObject)EQUAL) : Symbols.symbol_function((SubLObject)EQUALP);
        final SubLObject var34 = (NIL != module0260.f17089(var25, $ic13$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)) ? Symbols.symbol_function((SubLObject)$ic14$) : ((NIL != module0260.f17089(var25, $ic15$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)) ? Symbols.symbol_function((SubLObject)$ic16$) : Symbols.symbol_function((SubLObject)$ic17$));
        return Functions.funcall(var34, var32, var22, var33);
    }
    
    public static SubLObject f32672(final SubLObject var1) {
        final SubLThread var2 = SubLProcess.currentSubLThread();
        SubLObject var3 = (SubLObject)NIL;
        SubLObject var4 = (SubLObject)NIL;
        SubLObject var5 = (SubLObject)NIL;
        SubLObject var6 = (SubLObject)NIL;
        SubLObject var7 = (SubLObject)NIL;
        SubLObject var8 = (SubLObject)NIL;
        SubLObject var9 = (SubLObject)NIL;
        SubLObject var10 = (SubLObject)ZERO_INTEGER;
        SubLObject var11 = module0232.f15308(var1);
        SubLObject var12 = (SubLObject)NIL;
        var12 = var11.first();
        while (NIL != var11) {
            SubLObject var14;
            final SubLObject var13 = var14 = var12;
            SubLObject var15 = (SubLObject)NIL;
            SubLObject var16 = (SubLObject)NIL;
            cdestructuring_bind.destructuring_bind_must_consp(var14, var13, (SubLObject)$ic18$);
            var15 = var14.first();
            var14 = var14.rest();
            cdestructuring_bind.destructuring_bind_must_consp(var14, var13, (SubLObject)$ic18$);
            var16 = var14.first();
            var14 = var14.rest();
            if (NIL == var14) {
                if (NIL != module0202.f12598(var16)) {
                    var2.resetMultipleValues();
                    final SubLObject var17 = module0202.f12796(var16);
                    final SubLObject var18 = var2.secondMultipleValue();
                    final SubLObject var19 = var2.thirdMultipleValue();
                    var2.resetMultipleValues();
                    if (var17.eql($ic4$)) {
                        if (NIL == var5 || var5.eql(var18)) {
                            var4 = var19;
                            var5 = var18;
                            var7 = var17;
                            var9 = (SubLObject)ConsesLow.cons((SubLObject)ONE_INTEGER, var9);
                        }
                    }
                    else if (NIL != module0004.f104(var17, (SubLObject)$ic3$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)) {
                        if (NIL == var5 || var5.eql(var19)) {
                            var4 = var18;
                            var5 = var19;
                            var7 = var17;
                            var9 = (SubLObject)ConsesLow.cons((SubLObject)ONE_INTEGER, var9);
                        }
                    }
                    else if (NIL != conses_high.member(var17, module0741.f45905(), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED) && (NIL == var5 || var5.eql(var19))) {
                        var3 = var17;
                        var6 = var18;
                        var5 = var19;
                        var8 = var15;
                        var9 = (SubLObject)ConsesLow.cons((SubLObject)ZERO_INTEGER, var9);
                    }
                }
            }
            else {
                cdestructuring_bind.cdestructuring_bind_error(var13, (SubLObject)$ic18$);
            }
            var10 = Numbers.add(var10, (SubLObject)ONE_INTEGER);
            var11 = var11.rest();
            var12 = var11.first();
        }
        var9 = Sequences.nreverse(var9);
        return Values.values(var3, var4, var5, var6, var7, var8, var9);
    }
    
    public static SubLObject f32674() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0524", "f32669", "S#36116", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0524", "f32670", "S#36117", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0524", "f32671", "S#36118", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0524", "f32673", "S#36119", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0524", "f32672", "S#36120", 1, 0, false);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f32675() {
        return (SubLObject)NIL;
    }
    
    public static SubLObject f32676() {
        module0340.f22962((SubLObject)$ic0$, (SubLObject)$ic1$);
        module0012.f419((SubLObject)$ic5$);
        module0012.f419((SubLObject)$ic6$);
        module0012.f419((SubLObject)$ic12$);
        return (SubLObject)NIL;
    }
    
    public void declareFunctions() {
        f32674();
    }
    
    public void initializeVariables() {
        f32675();
    }
    
    public void runTopLevelForms() {
        f32676();
    }
    
    static {
        me = (SubLFile)new module0524();
        $ic0$ = makeKeyword("REMOVAL-CONJUNCTIVE-SUBWORD-INDEX");
        $ic1$ = ConsesLow.list(new SubLObject[] { makeKeyword("APPLICABILITY"), makeSymbol("S#36116", "CYC"), makeKeyword("COST"), makeSymbol("S#36117", "CYC"), makeKeyword("COMPLETENESS"), makeKeyword("INCOMPLETE"), makeKeyword("EXPAND"), makeSymbol("S#36118", "CYC"), makeKeyword("DOCUMENTATION"), makeString("(#$and (PRED ?X ?Y) (SUBSTRING-PRED SUBSTRING ?Y)) using the subword index. Cf. #$indexSubWordsForArg."), makeKeyword("EXAMPLE"), makeString("(#$and (#$comment ?TERM ?COMMENT) (#$substring ?COMMENT \"more obtuse\"))") });
        $ic2$ = ConsesLow.list((SubLObject)makeSymbol("S#11445", "CYC"), (SubLObject)makeSymbol("S#13100", "CYC"));
        $ic3$ = ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("suffixSubstring")), constant_handles_oc.f8479((SubLObject)makeString("substring")), constant_handles_oc.f8479((SubLObject)makeString("prefixSubstring")), constant_handles_oc.f8479((SubLObject)makeString("prefixSubstring-CaseInsensitive")), constant_handles_oc.f8479((SubLObject)makeString("substring-CaseInsensitive")), constant_handles_oc.f8479((SubLObject)makeString("suffixSubstring-CaseInsensitive")));
        $ic4$ = constant_handles_oc.f8479((SubLObject)makeString("equalStrings-CaseInsensitive"));
        $ic5$ = makeSymbol("S#36116", "CYC");
        $ic6$ = makeSymbol("S#36117", "CYC");
        $ic7$ = constant_handles_oc.f8479((SubLObject)makeString("substring"));
        $ic8$ = makeKeyword("ON");
        $ic9$ = makeKeyword("OFF");
        $ic10$ = makeSymbol("INDEXED-TERM-P");
        $ic11$ = makeKeyword("EVAL");
        $ic12$ = makeSymbol("S#36118", "CYC");
        $ic13$ = constant_handles_oc.f8479((SubLObject)makeString("prefixSubstring-CaseInsensitive"));
        $ic14$ = makeSymbol("S#16397", "CYC");
        $ic15$ = constant_handles_oc.f8479((SubLObject)makeString("suffixSubstring"));
        $ic16$ = makeSymbol("S#16398", "CYC");
        $ic17$ = makeSymbol("S#16396", "CYC");
        $ic18$ = ConsesLow.list((SubLObject)makeSymbol("S#36121", "CYC"), (SubLObject)makeSymbol("S#13100", "CYC"));
    }
}

/*
	DECOMPILATION REPORT

	Decompiled from: G:\opt\CYC_JRTL_with_CommonLisp\platform\lib\cyc-oc4.0-unzipped/com/cyc/cycjava/cycl/class
	Total time: 165 ms
	
	Decompiled with Procyon 0.5.32.
*/