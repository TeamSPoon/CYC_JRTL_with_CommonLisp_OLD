package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Vectors;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class module0700 extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.module0700";
    public static final String myFingerPrint = "d4277a271ad670debae87a5de83720d6e2708e48c4fe474833a1ccf5a169db7e";
    private static SubLSymbol $g5494$;
    private static final SubLSymbol $ic0$;
    private static final SubLSymbol $ic1$;
    private static final SubLSymbol $ic2$;
    private static final SubLObject $ic3$;
    private static final SubLSymbol $ic4$;
    private static final SubLSymbol $ic5$;
    private static final SubLSymbol $ic6$;
    private static final SubLSymbol $ic7$;
    
    public static SubLObject f42611(final SubLObject var1, SubLObject var2) {
        if (var2 == UNPROVIDED) {
            var2 = (SubLObject)NIL;
        }
        return (SubLObject)makeBoolean(var1.isVector() && NIL != module0035.f1995(var1, (SubLObject)THREE_INTEGER, (SubLObject)UNPROVIDED) && (NIL == var2 || (NIL != module0701.f42629(f42612(var1)) && NIL != module0701.f42630(f42613(var1)) && NIL != module0701.f42631(f42614(var1)))));
    }
    
    public static SubLObject f42615(final SubLObject var3, final SubLObject var4, final SubLObject var1) {
        assert NIL != module0701.f42629(var3) : var3;
        assert NIL != module0701.f42630(var4) : var4;
        assert NIL != module0701.f42631(var1) : var1;
        final SubLObject var5 = Vectors.make_vector((SubLObject)THREE_INTEGER, (SubLObject)UNPROVIDED);
        Vectors.set_aref(var5, (SubLObject)ZERO_INTEGER, var3);
        Vectors.set_aref(var5, (SubLObject)ONE_INTEGER, var4);
        Vectors.set_aref(var5, (SubLObject)TWO_INTEGER, var1);
        return var5;
    }
    
    public static SubLObject f42616(final SubLObject var5) {
        return module0037.f2559(var5);
    }
    
    public static SubLObject f42617(final SubLObject var5) {
        return (SubLObject)ConsesLow.list(f42612(var5), f42613(var5), f42614(var5));
    }
    
    public static SubLObject f42618(final SubLObject var1) {
        return Sequences.find(var1, $g5494$.getGlobalValue(), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f42619(final SubLObject var5, final SubLObject var6, final SubLObject var7) {
        assert NIL != f42618(var6) : var6;
        assert NIL != f42618(var7) : var7;
        final SubLObject var8 = $g5494$.getGlobalValue();
        final SubLObject var9 = (SubLObject)NIL;
        SubLObject var10;
        SubLObject var11;
        SubLObject var12;
        SubLObject var13;
        for (var10 = Sequences.length(var8), var11 = (SubLObject)NIL, var11 = (SubLObject)ZERO_INTEGER; var11.numL(var10); var11 = Numbers.add(var11, (SubLObject)ONE_INTEGER)) {
            var12 = ((NIL != var9) ? Numbers.subtract(var10, var11, (SubLObject)ONE_INTEGER) : var11);
            var13 = Vectors.aref(var8, var12);
            if (!var13.eql(var6) && !var13.eql(var7)) {
                return f42620(var5, var13);
            }
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f42620(final SubLObject var5, final SubLObject var6) {
        assert NIL != f42618(var6) : var6;
        final SubLObject var7 = Sequences.position(var6, $g5494$.getGlobalValue(), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        return Vectors.aref(var5, var7);
    }
    
    public static SubLObject f42612(final SubLObject var5) {
        return f42620(var5, (SubLObject)$ic5$);
    }
    
    public static SubLObject f42613(final SubLObject var5) {
        return f42620(var5, (SubLObject)$ic6$);
    }
    
    public static SubLObject f42614(final SubLObject var5) {
        return f42620(var5, (SubLObject)$ic7$);
    }
    
    public static SubLObject f42621(final SubLObject var15, final SubLObject var16) {
        return Equality.equal(f42617(var15), f42617(var16));
    }
    
    public static SubLObject f42622() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0700", "f42611", "S#46531", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0700", "f42615", "S#46632", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0700", "f42616", "S#46633", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0700", "f42617", "S#46634", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0700", "f42618", "S#46635", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0700", "f42619", "S#46636", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0700", "f42620", "S#46637", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0700", "f42612", "S#46525", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0700", "f42613", "S#46526", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0700", "f42614", "S#46521", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0700", "f42621", "S#46638", 2, 0, false);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f42623() {
        $g5494$ = SubLFiles.deflexical("S#46639", $ic3$);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f42624() {
        return (SubLObject)NIL;
    }
    
    public void declareFunctions() {
        f42622();
    }
    
    public void initializeVariables() {
        f42623();
    }
    
    public void runTopLevelForms() {
        f42624();
    }
    
    static {
        me = (SubLFile)new module0700();
        $g5494$ = null;
        $ic0$ = makeSymbol("S#46523", "CYC");
        $ic1$ = makeSymbol("S#46527", "CYC");
        $ic2$ = makeSymbol("S#46529", "CYC");
        $ic3$ = Vectors.vector(new SubLObject[] { makeKeyword("SUBJECT"), makeKeyword("PREDICATE"), makeKeyword("OBJECT") });
        $ic4$ = makeSymbol("S#46635", "CYC");
        $ic5$ = makeKeyword("SUBJECT");
        $ic6$ = makeKeyword("PREDICATE");
        $ic7$ = makeKeyword("OBJECT");
    }
}

/*
	DECOMPILATION REPORT

	Decompiled from: G:\opt\CYC_JRTL_with_CommonLisp\platform\lib\cyc-oc4.0-unzipped/com/cyc/cycjava/cycl/class
	Total time: 61 ms
	
	Decompiled with Procyon 0.5.32.
*/