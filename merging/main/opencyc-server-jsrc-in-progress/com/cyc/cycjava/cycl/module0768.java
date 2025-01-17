package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class module0768 extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.module0768";
    public static final String myFingerPrint = "dd593fac679a117a9a30fab3f5982fff50cdb701cae919bfe769089c83af239b";
    private static final SubLSymbol $ic0$;
    private static final SubLSymbol $ic1$;
    private static final SubLSymbol $ic2$;
    private static final SubLSymbol $ic3$;
    private static final SubLSymbol $ic4$;
    private static final SubLSymbol $ic5$;
    private static final SubLList $ic6$;
    private static final SubLSymbol $ic7$;
    private static final SubLSymbol $ic8$;
    private static final SubLObject $ic9$;
    private static final SubLString $ic10$;
    
    public static SubLObject f48992(final SubLObject var1, SubLObject var2) {
        if (var2 == UNPROVIDED) {
            var2 = (SubLObject)$ic0$;
        }
        SubLObject var3 = (SubLObject)NIL;
        if (NIL != f48993()) {
            SubLObject var4 = (SubLObject)NIL;
            final SubLObject var5 = (SubLObject)((NIL != module0579.f35485()) ? NIL : ONE_INTEGER);
            if (NIL == var4) {
                SubLObject var6 = Sequences.nreverse(f48994(var1, var5));
                SubLObject var7 = (SubLObject)NIL;
                var7 = var6.first();
                while (NIL == var4 && NIL != var6) {
                    if (var7.isString()) {
                        var3 = (SubLObject)ConsesLow.cons(module0749.f46446(var7, module0751.f46705(), var1, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED), var3);
                        if (NIL == module0579.f35485()) {
                            var4 = (SubLObject)T;
                        }
                    }
                    var6 = var6.rest();
                    var7 = var6.first();
                }
            }
        }
        return Values.values(var3.first(), var3.rest());
    }
    
    public static SubLObject f48995(final SubLObject var8) {
        final SubLObject var9 = module0756.f47487(var8, (SubLObject)UNPROVIDED);
        if (NIL != f48993()) {
            SubLObject var10 = (SubLObject)NIL;
            final SubLObject var11 = (SubLObject)((NIL != module0579.f35485()) ? NIL : ONE_INTEGER);
            if (NIL == var10) {
                SubLObject var12 = Sequences.nreverse(f48994(var9, var11));
                SubLObject var13 = (SubLObject)NIL;
                var13 = var12.first();
                while (NIL == var10 && NIL != var12) {
                    if (var13.isString()) {
                        if (NIL == module0756.f47479(var8)) {
                            module0756.f47723(var8, var13);
                            var10 = (SubLObject)makeBoolean(NIL == module0579.f35485());
                        }
                        else {
                            final SubLObject var14 = module0756.f47484(var8, (SubLObject)NIL, (SubLObject)NIL);
                            module0756.f47723(var14, var13);
                            module0756.f47675(var8, var14);
                        }
                    }
                    var12 = var12.rest();
                    var13 = var12.first();
                }
            }
        }
        return module0756.f47467(var8);
    }
    
    public static SubLObject f48996(final SubLObject var1) {
        return module0337.f22630(var1, (SubLObject)$ic6$);
    }
    
    public static SubLObject f48993() {
        final SubLThread var10 = SubLProcess.currentSubLThread();
        return (SubLObject)makeBoolean(NIL != module0579.$g4253$.getDynamicValue(var10) && NIL != module0751.f46661((SubLObject)UNPROVIDED));
    }
    
    public static SubLObject f48994(final SubLObject var1, SubLObject var5) {
        if (var5 == UNPROVIDED) {
            var5 = (SubLObject)NIL;
        }
        final SubLThread var6 = SubLProcess.currentSubLThread();
        SubLObject var7 = (SubLObject)NIL;
        SubLObject var8 = (SubLObject)NIL;
        final SubLObject var9 = module0147.$g2094$.currentBinding(var6);
        final SubLObject var10 = module0147.$g2095$.currentBinding(var6);
        try {
            module0147.$g2094$.bind((SubLObject)$ic8$, var6);
            module0147.$g2095$.bind($ic9$, var6);
            if (NIL == var8) {
                SubLObject var11 = module0701.f42764(var1, (SubLObject)$ic10$, var5, (SubLObject)T);
                SubLObject var12 = (SubLObject)NIL;
                var12 = var11.first();
                while (NIL == var8 && NIL != var11) {
                    if (var12.isString()) {
                        var7 = (SubLObject)ConsesLow.cons(var12, var7);
                        if (NIL != var5 && NIL != module0035.f2000(var7, var5, (SubLObject)UNPROVIDED)) {
                            var8 = (SubLObject)T;
                        }
                    }
                    var11 = var11.rest();
                    var12 = var11.first();
                }
            }
        }
        finally {
            module0147.$g2095$.rebind(var10, var6);
            module0147.$g2094$.rebind(var9, var6);
        }
        return var7;
    }
    
    public static SubLObject f48997() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0768", "f48992", "S#53479", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0768", "f48995", "S#53486", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0768", "f48996", "S#52705", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0768", "f48993", "S#52891", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0768", "f48994", "S#52892", 1, 1, false);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f48998() {
        return (SubLObject)NIL;
    }
    
    public static SubLObject f48999() {
        module0012.f419((SubLObject)$ic1$);
        module0762.f48147((SubLObject)$ic2$, (SubLObject)$ic3$, (SubLObject)$ic4$);
        module0762.f48147((SubLObject)$ic2$, (SubLObject)$ic5$, (SubLObject)$ic4$);
        module0012.f419((SubLObject)$ic2$);
        module0012.f419((SubLObject)$ic7$);
        return (SubLObject)NIL;
    }
    
    public void declareFunctions() {
        f48997();
    }
    
    public void initializeVariables() {
        f48998();
    }
    
    public void runTopLevelForms() {
        f48999();
    }
    
    static {
        me = (SubLFile)new module0768();
        $ic0$ = makeKeyword("ANY");
        $ic1$ = makeSymbol("S#53479", "CYC");
        $ic2$ = makeSymbol("S#53486", "CYC");
        $ic3$ = makeKeyword("SKSI-SUPPORTED-EXTERNAL-TERM");
        $ic4$ = makeKeyword("BEST");
        $ic5$ = makeKeyword("RESOURCE-WITH-URI");
        $ic6$ = ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("ResourceWithURIFn")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("TEST"), (SubLObject)makeSymbol("S#39641", "CYC")));
        $ic7$ = makeSymbol("S#52705", "CYC");
        $ic8$ = makeSymbol("S#12275", "CYC");
        $ic9$ = constant_handles_oc.f8479((SubLObject)makeString("InferencePSC"));
        $ic10$ = makeString("en");
    }
}

/*
	DECOMPILATION REPORT

	Decompiled from: G:\opt\CYC_JRTL_with_CommonLisp\platform\lib\cyc-oc4.0-unzipped/com/cyc/cycjava/cycl/class
	Total time: 112 ms
	
	Decompiled with Procyon 0.5.32.
*/