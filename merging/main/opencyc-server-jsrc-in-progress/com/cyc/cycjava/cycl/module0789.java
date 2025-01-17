package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class module0789 extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.module0789";
    public static final String myFingerPrint = "6fe3a210f5a7a0ab00b0170463d13c0bb0d86fb347662d4d5a84a73bef8fbff3";
    private static SubLSymbol $g6310$;
    private static final SubLSymbol $ic0$;
    private static final SubLObject $ic1$;
    private static final SubLObject $ic2$;
    private static final SubLObject $ic3$;
    private static final SubLObject $ic4$;
    private static final SubLSymbol $ic5$;
    private static final SubLObject $ic6$;
    private static final SubLSymbol $ic7$;
    private static final SubLSymbol $ic8$;
    private static final SubLObject $ic9$;
    private static final SubLSymbol $ic10$;
    private static final SubLSymbol $ic11$;
    private static final SubLList $ic12$;
    
    public static SubLObject f50520(final SubLObject var1, final SubLObject var2, SubLObject var3) {
        if (var3 == UNPROVIDED) {
            var3 = (SubLObject)NIL;
        }
        assert NIL != module0173.f10955(var1) : var1;
        if (NIL != module0004.f105(module0218.f14457((SubLObject)ConsesLow.list(var1, var2), var3))) {
            return (SubLObject)T;
        }
        if (NIL != module0256.f16625(var1, var2, var3)) {
            return (SubLObject)T;
        }
        if (NIL != module0259.f16854(var1, var2, var3, (SubLObject)UNPROVIDED)) {
            return (SubLObject)T;
        }
        if (NIL != module0259.f16854(var2, var1, var3, (SubLObject)UNPROVIDED)) {
            return (SubLObject)T;
        }
        if (NIL != module0434.f30582((SubLObject)ConsesLow.list($ic1$, (SubLObject)ConsesLow.list($ic2$, var1, var2), (SubLObject)ConsesLow.list($ic2$, var2, var1), (SubLObject)ConsesLow.list($ic3$, var2, var1), (SubLObject)ConsesLow.list($ic3$, var1, var2)), var3, (SubLObject)UNPROVIDED)) {
            return (SubLObject)T;
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f50521(final SubLObject var1, final SubLObject var2, SubLObject var3) {
        if (var3 == UNPROVIDED) {
            var3 = (SubLObject)NIL;
        }
        assert NIL != module0173.f10955(var1) : var1;
        assert NIL != module0173.f10955(var2) : var2;
        return f50522(var1, var2, var3).first();
    }
    
    public static SubLObject f50522(final SubLObject var1, final SubLObject var2, final SubLObject var3) {
        final SubLThread var4 = SubLProcess.currentSubLThread();
        SubLObject var5 = (SubLObject)NIL;
        final SubLObject var6 = module0147.$g2095$.currentBinding(var4);
        final SubLObject var7 = module0147.$g2094$.currentBinding(var4);
        final SubLObject var8 = module0147.$g2096$.currentBinding(var4);
        try {
            module0147.$g2095$.bind(module0147.f9545(var3), var4);
            module0147.$g2094$.bind(module0147.f9546(var3), var4);
            module0147.$g2096$.bind(module0147.f9549(var3), var4);
            if (NIL != module0004.f105(module0218.f14457((SubLObject)ConsesLow.list(var1, var2), (SubLObject)UNPROVIDED))) {
                var5 = (SubLObject)ConsesLow.cons(module0218.f14453((SubLObject)ConsesLow.list(var1, var2), var3).first(), var5);
            }
            else if (NIL != module0256.f16576(var1, var2, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)) {
                final SubLObject var9 = (SubLObject)ConsesLow.list($ic4$, var1, var2);
                var5 = (SubLObject)ConsesLow.cons(module0191.f11990((SubLObject)$ic5$, var9, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED), var5);
            }
            else if (NIL != module0256.f16576(var2, var1, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)) {
                final SubLObject var9 = (SubLObject)ConsesLow.list($ic4$, var2, var1);
                var5 = (SubLObject)ConsesLow.cons(module0191.f11990((SubLObject)$ic5$, var9, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED), var5);
            }
            else if (NIL != module0259.f16854(var1, var2, var3, (SubLObject)UNPROVIDED)) {
                final SubLObject var9 = (SubLObject)ConsesLow.list($ic6$, var1, var2);
                var5 = (SubLObject)ConsesLow.cons(module0191.f11990((SubLObject)$ic7$, var9, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED), var5);
            }
            else if (NIL != module0259.f16854(var2, var1, var3, (SubLObject)UNPROVIDED)) {
                final SubLObject var9 = (SubLObject)ConsesLow.list($ic6$, var2, var1);
                var5 = (SubLObject)ConsesLow.cons(module0191.f11990((SubLObject)$ic7$, var9, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED), var5);
            }
            else {
                var5 = (SubLObject)ConsesLow.cons(module0191.f11990((SubLObject)$ic8$, (SubLObject)ConsesLow.list($ic9$, var1, var2), var3, (SubLObject)UNPROVIDED), var5);
            }
        }
        finally {
            module0147.$g2096$.rebind(var8, var4);
            module0147.$g2094$.rebind(var7, var4);
            module0147.$g2095$.rebind(var6, var4);
        }
        return var5;
    }
    
    public static SubLObject f50523(final SubLObject var11, SubLObject var12) {
        if (var12 == UNPROVIDED) {
            var12 = (SubLObject)NIL;
        }
        final SubLThread var13 = SubLProcess.currentSubLThread();
        final SubLObject var14 = module0205.f13387(var11, (SubLObject)UNPROVIDED);
        final SubLObject var15 = module0205.f13388(var11, (SubLObject)UNPROVIDED);
        if (NIL != f50520(var14, var15, (SubLObject)UNPROVIDED)) {
            module0347.f23330(module0191.f11990((SubLObject)$ic8$, var11, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED), (SubLObject)NIL, f50522(var14, var15, module0147.$g2095$.getDynamicValue(var13)));
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f50524() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0789", "f50520", "S#55059", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0789", "f50521", "S#55060", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0789", "f50522", "S#55061", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0789", "f50523", "S#55062", 1, 1, false);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f50525() {
        $g6310$ = SubLFiles.defparameter("S#55063", (SubLObject)ONE_INTEGER);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f50526() {
        module0340.f22938($ic9$);
        module0358.f23773((SubLObject)$ic10$, $ic9$);
        module0340.f22941((SubLObject)$ic11$, (SubLObject)$ic12$);
        return (SubLObject)NIL;
    }
    
    public void declareFunctions() {
        f50524();
    }
    
    public void initializeVariables() {
        f50525();
    }
    
    public void runTopLevelForms() {
        f50526();
    }
    
    static {
        me = (SubLFile)new module0789();
        $g6310$ = null;
        $ic0$ = makeSymbol("FORT-P");
        $ic1$ = constant_handles_oc.f8479((SubLObject)makeString("or"));
        $ic2$ = constant_handles_oc.f8479((SubLObject)makeString("geographicalSubRegions"));
        $ic3$ = constant_handles_oc.f8479((SubLObject)makeString("geopoliticalSubdivision"));
        $ic4$ = constant_handles_oc.f8479((SubLObject)makeString("genls"));
        $ic5$ = makeKeyword("GENLS");
        $ic6$ = constant_handles_oc.f8479((SubLObject)makeString("isa"));
        $ic7$ = makeKeyword("ISA");
        $ic8$ = makeKeyword("OPAQUE");
        $ic9$ = constant_handles_oc.f8479((SubLObject)makeString("mutuallyCoherent"));
        $ic10$ = makeKeyword("POS");
        $ic11$ = makeKeyword("REMOVAL-MUTUALLY-COHERENT");
        $ic12$ = ConsesLow.list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), constant_handles_oc.f8479((SubLObject)makeString("mutuallyCoherent")), makeKeyword("REQUIRED-PATTERN"), ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("mutuallyCoherent")), (SubLObject)makeKeyword("FORT"), (SubLObject)makeKeyword("FULLY-BOUND")), makeKeyword("COST-EXPRESSION"), makeSymbol("S#55063", "CYC"), makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("EXPAND"), makeSymbol("S#55062", "CYC"), makeKeyword("DOCUMENTATION"), makeString("(#$mutuallyCoherent <fort> <fully bound>)"), makeKeyword("EXAMPLE"), makeString("(#$mutuallyCoherent #$BillClinton HilaryClinton)") });
    }
}

/*
	DECOMPILATION REPORT

	Decompiled from: G:\opt\CYC_JRTL_with_CommonLisp\platform\lib\cyc-oc4.0-unzipped/com/cyc/cycjava/cycl/class
	Total time: 95 ms
	
	Decompiled with Procyon 0.5.32.
*/