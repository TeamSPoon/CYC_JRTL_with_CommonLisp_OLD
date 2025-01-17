package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class module0300 extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.module0300";
    public static final String myFingerPrint = "7ca8c2b69a54bbafd5f3df36134994d260487a3595bdd2a4ecb38da8778865fd";
    private static SubLSymbol $g2696$;
    private static final SubLObject $ic0$;
    private static final SubLList $ic1$;
    private static final SubLInteger $ic2$;
    private static final SubLSymbol $ic3$;
    private static final SubLObject $ic4$;
    private static final SubLObject $ic5$;
    private static final SubLString $ic6$;
    
    public static SubLObject f20014(final SubLObject var1, final SubLObject var2, final SubLObject var3) {
        return $g2696$.getGlobalValue();
    }
    
    public static SubLObject f20015(final SubLObject var1) {
        return (SubLObject)makeBoolean(NIL != module0232.f15323(var1) && NIL != module0035.f1997(var1) && NIL != module0204.f13044(var1.first()));
    }
    
    public static SubLObject f20016(final SubLObject var1, final SubLObject var2, final SubLObject var3) {
        if (NIL != f20015(var1)) {
            final SubLObject var4 = module0204.f13047(var1.first());
            if (NIL != module0202.f12590(var4)) {
                SubLObject var5 = (SubLObject)NIL;
                if (NIL != f20017(var4, var2)) {
                    var5 = (SubLObject)T;
                }
                return var5;
            }
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f20017(final SubLObject var4, final SubLObject var2) {
        final SubLObject var5 = module0205.f13136(var4);
        SubLObject var6 = (SubLObject)NIL;
        if (NIL != module0173.f10955(var5)) {
            SubLObject var7 = (SubLObject)ZERO_INTEGER;
            SubLObject var9;
            final SubLObject var8 = var9 = module0205.f13207(var4, (SubLObject)$ic3$);
            SubLObject var10 = (SubLObject)NIL;
            var10 = var9.first();
            while (NIL != var9) {
                var7 = Numbers.add(var7, (SubLObject)ONE_INTEGER);
                SubLObject var12;
                final SubLObject var11 = var12 = module0226.f14917(var5, var7, (SubLObject)UNPROVIDED);
                SubLObject var13 = (SubLObject)NIL;
                var13 = var12.first();
                while (NIL != var12) {
                    if (var10.isInteger() && NIL != module0256.f16596(var13, $ic4$, var2, (SubLObject)UNPROVIDED)) {
                        var6 = (SubLObject)ConsesLow.cons(var7, var6);
                    }
                    var12 = var12.rest();
                    var13 = var12.first();
                }
                var9 = var9.rest();
                var10 = var9.first();
            }
        }
        return var6;
    }
    
    public static SubLObject f20018(final SubLObject var1, final SubLObject var15, final SubLObject var2, final SubLObject var3) {
        final SubLThread var16 = SubLProcess.currentSubLThread();
        if (NIL != f20015(var1)) {
            final SubLObject var17 = module0204.f13047(var1.first());
            SubLObject var18 = (SubLObject)NIL;
            SubLObject var19 = (SubLObject)T;
            final SubLObject var20 = f20017(var17, var2);
            if (NIL != module0202.f12590(var17) && NIL != module0035.sublisp_boolean(var20)) {
                var16.resetMultipleValues();
                final SubLObject var20_21 = f20019(var17, var20, var2, var3, var15);
                final SubLObject var22_23 = var16.secondMultipleValue();
                var16.resetMultipleValues();
                var18 = var20_21;
                var19 = var22_23;
            }
            return Values.values((SubLObject)ConsesLow.list(module0204.f13033(var18)), var19);
        }
        return Values.values(var1, (SubLObject)NIL);
    }
    
    public static SubLObject f20019(final SubLObject var1, final SubLObject var19, final SubLObject var2, final SubLObject var3, SubLObject var15) {
        if (var15 == UNPROVIDED) {
            var15 = (SubLObject)NIL;
        }
        if (var19.isCons() && NIL != module0035.sublisp_boolean(var19)) {
            SubLObject var21;
            final SubLObject var20 = var21 = conses_high.copy_tree(var1);
            SubLObject var22 = var19;
            SubLObject var23 = (SubLObject)NIL;
            var23 = var22.first();
            while (NIL != var22) {
                final SubLObject var24 = module0205.f13134(var20, var23, (SubLObject)UNPROVIDED);
                final SubLObject var25 = module0202.f12761((SubLObject)ConsesLow.list($ic5$, var24));
                var21 = module0202.f12817(var23, var25, var21);
                var22 = var22.rest();
                var23 = var22.first();
            }
            return Values.values(var21, (SubLObject)ConsesLow.list((SubLObject)$ic6$));
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f20020() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0300", "f20014", "S#22652", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0300", "f20015", "S#22653", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0300", "f20016", "S#22654", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0300", "f20017", "S#22655", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0300", "f20018", "S#22656", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0300", "f20019", "S#22657", 4, 1, false);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f20021() {
        $g2696$ = SubLFiles.deflexical("S#22658", (SubLObject)$ic2$);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f20022() {
        module0292.f19698($ic0$, (SubLObject)$ic1$);
        return (SubLObject)NIL;
    }
    
    public void declareFunctions() {
        f20020();
    }
    
    public void initializeVariables() {
        f20021();
    }
    
    public void runTopLevelForms() {
        f20022();
    }
    
    static {
        me = (SubLFile)new module0300();
        $g2696$ = null;
        $ic0$ = constant_handles_oc.f8479((SubLObject)makeString("DatesReformulatorRLModule"));
        $ic1$ = ConsesLow.list(new SubLObject[] { makeKeyword("REQUIRED"), makeSymbol("S#22654", "CYC"), makeKeyword("COST"), makeSymbol("S#22652", "CYC"), makeKeyword("REFORMULATE"), makeSymbol("S#22656", "CYC"), makeKeyword("DOCUMENTATION"), makeString("Reformulates numbers into proper date-denoting CycL expressions."), makeKeyword("EXAMPLE-SOURCE"), makeString("(#$birthDate #$JohnKennedy 1917)"), makeKeyword("EXAMPLE-TARGET"), makeString("(#$birthDate #$JohnKennedy (#$YearFn 1917))") });
        $ic2$ = makeInteger(1200);
        $ic3$ = makeKeyword("IGNORE");
        $ic4$ = constant_handles_oc.f8479((SubLObject)makeString("TemporalThing"));
        $ic5$ = constant_handles_oc.f8479((SubLObject)makeString("YearFn"));
        $ic6$ = makeString("Dates: Integers to Years");
    }
}

/*
	DECOMPILATION REPORT

	Decompiled from: G:\opt\CYC_JRTL_with_CommonLisp\platform\lib\cyc-oc4.0-unzipped/com/cyc/cycjava/cycl/class
	Total time: 89 ms
	
	Decompiled with Procyon 0.5.32.
*/