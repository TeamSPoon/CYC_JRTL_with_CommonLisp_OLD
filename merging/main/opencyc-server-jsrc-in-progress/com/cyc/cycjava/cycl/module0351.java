package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class module0351 extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.module0351";
    public static final String myFingerPrint = "5b334b45c18a83f24240e844d6c4bc21b6e7188fd0915d99a7d0e8272064dbd0";
    public static SubLSymbol $g2989$;
    private static SubLSymbol $g2990$;
    private static SubLSymbol $g2991$;
    private static final SubLList $ic0$;
    private static final SubLList $ic1$;
    private static final SubLSymbol $ic2$;
    private static final SubLSymbol $ic3$;
    private static final SubLObject $ic4$;
    private static final SubLObject $ic5$;
    private static final SubLObject $ic6$;
    private static final SubLList $ic7$;
    private static final SubLObject $ic8$;
    private static final SubLSymbol $ic9$;
    private static final SubLSymbol $ic10$;
    private static final SubLSymbol $ic11$;
    private static final SubLSymbol $ic12$;
    private static final SubLList $ic13$;
    private static final SubLSymbol $ic14$;
    private static final SubLList $ic15$;
    private static final SubLSymbol $ic16$;
    
    public static SubLObject f23566(final SubLObject var1) {
        final SubLThread var2 = SubLProcess.currentSubLThread();
        return (SubLObject)makeBoolean(NIL == module0018.$g633$.getDynamicValue(var2) || NIL != conses_high.member(var1, module0018.$g634$.getDynamicValue(var2), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED));
    }
    
    public static SubLObject f23567() {
        final SubLThread var2 = SubLProcess.currentSubLThread();
        if (NIL != module0131.f8587() && NIL == module0131.$g60$.getDynamicValue(var2)) {
            return $g2990$.getGlobalValue();
        }
        return $g2991$.getGlobalValue();
    }
    
    public static SubLObject f23568(final SubLObject var1) {
        final SubLThread var2 = SubLProcess.currentSubLThread();
        assert NIL != assertion_handles_oc.f11035(var1) : var1;
        final SubLObject var3 = module0178.f11291(var1);
        if (NIL != module0131.f8587() && NIL == module0131.$g60$.getDynamicValue(var2)) {
            return conses_high.member(var3, $g2990$.getGlobalValue(), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        }
        return conses_high.member(var3, $g2991$.getGlobalValue(), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f23569(SubLObject var4, SubLObject var5) {
        if (var5 == UNPROVIDED) {
            var5 = (SubLObject)NIL;
        }
        if (NIL != var4) {
            var4 = Sequences.delete_duplicates(var4, Symbols.symbol_function((SubLObject)EQUAL), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
            if (NIL != var5) {
                var4 = conses_high.nset_difference(var4, var5, Symbols.symbol_function((SubLObject)EQUAL), (SubLObject)UNPROVIDED);
            }
            return var4;
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f23570(final SubLObject var6, final SubLObject var7, final SubLObject var8) {
        final SubLObject var9 = module0035.f2399(var6, Symbols.symbol_function((SubLObject)$ic3$), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        SubLObject var10 = (SubLObject)NIL;
        if (NIL == var9) {
            return (SubLObject)NIL;
        }
        SubLObject var11 = var9;
        SubLObject var12 = (SubLObject)NIL;
        var12 = var11.first();
        while (NIL != var11) {
            if (NIL == module0035.f2428(var12, var7, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)) {
                var10 = (SubLObject)ConsesLow.cons(var12, var10);
            }
            var11 = var11.rest();
            var12 = var11.first();
        }
        if (NIL == var10) {
            return (SubLObject)NIL;
        }
        SubLObject var13 = (SubLObject)NIL;
        SubLObject var14 = (SubLObject)NIL;
        if (NIL != assertion_handles_oc.f11035(var8)) {
            final SubLObject var15 = module0178.f11282(var8);
            var13 = ((NIL != module0204.f13049(var15)) ? module0204.f13033(module0232.f15306(var15).first()) : var15);
        }
        else {
            var13 = module0204.f13033(var6);
        }
        SubLObject var16 = var10;
        SubLObject var17 = (SubLObject)NIL;
        var17 = var16.first();
        while (NIL != var16) {
            if (NIL != module0035.f2428(var17, var13, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)) {
                final SubLObject var18 = f23571(var17, var13);
                var14 = ConsesLow.nconc(var18, var14);
            }
            var16 = var16.rest();
            var17 = var16.first();
        }
        return Sequences.nreverse(var14);
    }
    
    public static SubLObject f23571(final SubLObject var18, final SubLObject var13) {
        final SubLThread var19 = SubLProcess.currentSubLThread();
        SubLObject var20 = (SubLObject)NIL;
        final SubLObject var21 = module0256.f16529(module0307.f20797(var18, var13, module0147.$g2095$.getDynamicValue(var19)), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        final SubLObject var22 = module0256.f16529(module0307.f20799(var18, var13, module0147.$g2095$.getDynamicValue(var19)), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        SubLObject var23 = var21;
        SubLObject var24 = (SubLObject)NIL;
        var24 = var23.first();
        while (NIL != var23) {
            var20 = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list($ic4$, var18, var24), var20);
            var23 = var23.rest();
            var24 = var23.first();
        }
        var23 = var22;
        SubLObject var25 = (SubLObject)NIL;
        var25 = var23.first();
        while (NIL != var23) {
            var20 = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list($ic5$, var18, var25), var20);
            var23 = var23.rest();
            var25 = var23.first();
        }
        if (NIL == var21 && NIL == var22) {
            if (NIL != module0202.f12959(var18, var13)) {
                var20 = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.listS($ic4$, reader.bq_cons($ic6$, var18), (SubLObject)$ic7$), var20);
            }
            if (NIL != module0202.f12960(var18, var13)) {
                var20 = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.listS($ic4$, var18, (SubLObject)$ic7$), var20);
            }
        }
        return Sequences.nreverse(var20);
    }
    
    public static SubLObject f23572(final SubLObject var6, final SubLObject var23, final SubLObject var24) {
        final SubLThread var25 = SubLProcess.currentSubLThread();
        final SubLObject var26 = module0202.f12832(var6, (SubLObject)UNPROVIDED);
        if (NIL == module0173.f10955(var26)) {
            return (SubLObject)NIL;
        }
        if (NIL != module0349.f23471(var26, var24)) {
            return (SubLObject)T;
        }
        if ($ic4$.eql(var26)) {
            if (NIL != module0018.$g644$.getDynamicValue(var25) || NIL != module0018.$g648$.getDynamicValue(var25)) {
                return (SubLObject)NIL;
            }
            final SubLObject var27 = module0202.f12835(var6, (SubLObject)UNPROVIDED);
            if (NIL != module0173.f10955(var27) && NIL != module0349.f23477(var27, var24)) {
                return (SubLObject)NIL;
            }
            return (SubLObject)T;
        }
        else {
            if (NIL != module0333.f22416(var26)) {
                return (SubLObject)makeBoolean(NIL == module0018.$g644$.getDynamicValue(var25));
            }
            if (NIL != module0349.f23396(var26)) {
                return (SubLObject)makeBoolean(NIL == module0018.$g645$.getDynamicValue(var25));
            }
            if (var26.eql($ic8$)) {
                return Equality.eq((SubLObject)$ic9$, var23);
            }
            if (module0217.f14264(var26, (SubLObject)$ic10$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED).isPositive() || module0217.f14264(var26, (SubLObject)$ic9$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED).isPositive() || NIL != module0349.f23407(var26) || NIL != module0349.f23406(var26)) {
                return (SubLObject)NIL;
            }
            return (SubLObject)makeBoolean(NIL == module0018.$g648$.getDynamicValue(var25));
        }
    }
    
    public static SubLObject f23573(final SubLObject var25) {
        final SubLThread var26 = SubLProcess.currentSubLThread();
        return (SubLObject)makeBoolean(NIL != module0173.f10955(var25) && (NIL != module0018.$g644$.getDynamicValue(var26) || NIL == module0333.f22416(var25)) && (NIL != module0018.$g645$.getDynamicValue(var26) || NIL == module0349.f23396(var25)));
    }
    
    public static SubLObject f23574(final SubLObject var27) {
        final SubLObject var28 = module0205.f13333(var27);
        if (NIL == module0349.f23388(var28)) {
            return var27;
        }
        return f23575(var28, module0205.f13385(var27, (SubLObject)UNPROVIDED));
    }
    
    public static SubLObject f23575(final SubLObject var25, SubLObject var28) {
        assert NIL != Types.listp(var28) : var28;
        var28 = f23576(var28);
        return reader.bq_cons(var25, ConsesLow.append(var28, (SubLObject)NIL));
    }
    
    public static SubLObject f23576(final SubLObject var28) {
        assert NIL != Types.listp(var28) : var28;
        return module0213.f13926(var28, (SubLObject)T, (SubLObject)NIL, (SubLObject)NIL, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f23577(final SubLObject var27) {
        return f23574(var27);
    }
    
    public static SubLObject f23578(final SubLObject var25, final SubLObject var28) {
        return f23575(var25, var28);
    }
    
    public static SubLObject f23579(final SubLObject var29) {
        if (NIL == module0035.f2439(Symbols.symbol_function((SubLObject)$ic3$), var29, (SubLObject)UNPROVIDED)) {
            return (SubLObject)NIL;
        }
        return f23580(var29, Symbols.symbol_function((SubLObject)$ic3$));
    }
    
    public static SubLObject f23581(final SubLObject var6) {
        if (NIL == module0035.f2439(Symbols.symbol_function((SubLObject)$ic3$), var6, (SubLObject)UNPROVIDED)) {
            return (SubLObject)NIL;
        }
        return module0202.f12693(var6, (SubLObject)NIL, Symbols.symbol_function((SubLObject)$ic3$), (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f23582(final SubLObject var30) {
        if (NIL == module0035.f2439(Symbols.symbol_function((SubLObject)$ic3$), var30, (SubLObject)UNPROVIDED)) {
            return (SubLObject)NIL;
        }
        return module0204.f13087(var30, Symbols.symbol_function((SubLObject)$ic3$), (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f23580(final SubLObject var31, SubLObject var32) {
        if (var32 == UNPROVIDED) {
            var32 = (SubLObject)$ic16$;
        }
        if (NIL != module0202.f12929(var31)) {
            return module0202.f12693(var31, (SubLObject)NIL, var32, (SubLObject)UNPROVIDED);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f23583(final SubLObject var29) {
        return (SubLObject)makeBoolean(NIL != module0173.f10955(var29) || (var29.isAtom() && NIL == module0193.f12067(var29)) || NIL == f23579(var29));
    }
    
    public static SubLObject f23584(final SubLObject var6) {
        return Types.sublisp_null(f23581(var6));
    }
    
    public static SubLObject f23585(final SubLObject var30) {
        return Types.sublisp_null(f23582(var30));
    }
    
    public static SubLObject f23586() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0351", "f23566", "S#26252", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0351", "f23567", "S#26253", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0351", "f23568", "S#26254", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0351", "f23569", "S#26255", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0351", "f23570", "S#26256", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0351", "f23571", "S#26257", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0351", "f23572", "S#26258", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0351", "f23573", "S#26259", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0351", "f23574", "S#26260", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0351", "f23575", "S#26261", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0351", "f23576", "S#26262", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0351", "f23577", "S#26263", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0351", "f23578", "S#26264", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0351", "f23579", "S#26265", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0351", "f23581", "S#26266", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0351", "f23582", "S#14105", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0351", "f23580", "S#26267", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0351", "f23583", "S#17983", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0351", "f23584", "S#26268", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0351", "f23585", "S#26269", 1, 0, false);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f23587() {
        $g2989$ = SubLFiles.defparameter("S#26270", (SubLObject)TWENTY_INTEGER);
        $g2990$ = SubLFiles.deflexical("S#26271", (SubLObject)$ic0$);
        $g2991$ = SubLFiles.deflexical("S#26272", (SubLObject)$ic1$);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f23588() {
        module0002.f35((SubLObject)$ic12$, (SubLObject)$ic13$);
        module0002.f35((SubLObject)$ic14$, (SubLObject)$ic15$);
        return (SubLObject)NIL;
    }
    
    public void declareFunctions() {
        f23586();
    }
    
    public void initializeVariables() {
        f23587();
    }
    
    public void runTopLevelForms() {
        f23588();
    }
    
    static {
        me = (SubLFile)new module0351();
        $g2989$ = null;
        $g2990$ = null;
        $g2991$ = null;
        $ic0$ = ConsesLow.list((SubLObject)makeKeyword("FORWARD"));
        $ic1$ = ConsesLow.list((SubLObject)makeKeyword("BACKWARD"), (SubLObject)makeKeyword("FORWARD"));
        $ic2$ = makeSymbol("ASSERTION-P");
        $ic3$ = makeSymbol("VARIABLE-P");
        $ic4$ = constant_handles_oc.f8479((SubLObject)makeString("isa"));
        $ic5$ = constant_handles_oc.f8479((SubLObject)makeString("genls"));
        $ic6$ = constant_handles_oc.f8479((SubLObject)makeString("TheList"));
        $ic7$ = ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("Thing")));
        $ic8$ = constant_handles_oc.f8479((SubLObject)makeString("abnormal"));
        $ic9$ = makeKeyword("NEG");
        $ic10$ = makeKeyword("POS");
        $ic11$ = makeSymbol("LISTP");
        $ic12$ = makeSymbol("S#26263", "CYC");
        $ic13$ = ConsesLow.list((SubLObject)makeSymbol("S#26260", "CYC"));
        $ic14$ = makeSymbol("S#26264", "CYC");
        $ic15$ = ConsesLow.list((SubLObject)makeSymbol("S#26261", "CYC"));
        $ic16$ = makeSymbol("S#12629", "CYC");
    }
}

/*
	DECOMPILATION REPORT

	Decompiled from: G:\opt\CYC_JRTL_with_CommonLisp\platform\lib\cyc-oc4.0-unzipped/com/cyc/cycjava/cycl/class
	Total time: 162 ms
	
	Decompiled with Procyon 0.5.32.
*/