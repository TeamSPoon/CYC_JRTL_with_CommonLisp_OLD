package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.BinaryFunction;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.UnaryFunction;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class module0470 extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.module0470";
    public static final String myFingerPrint = "940d912db85fcdc5b293015df6787176ba74adcd43e808234a3c33edf87164f2";
    private static SubLSymbol $g3679$;
    private static final SubLObject $ic0$;
    private static final SubLSymbol $ic1$;
    private static final SubLSymbol $ic2$;
    private static final SubLSymbol $ic3$;
    private static final SubLSymbol $ic4$;
    private static final SubLList $ic5$;
    private static final SubLObject $ic6$;
    private static final SubLSymbol $ic7$;
    private static final SubLSymbol $ic8$;
    private static final SubLSymbol $ic9$;
    private static final SubLList $ic10$;
    
    public static SubLObject f31571(final SubLObject var1) {
        return module0035.f2194(module0205.f13385(var1, (SubLObject)UNPROVIDED), Symbols.symbol_function((SubLObject)EQUAL), (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f31572(final SubLObject var2, final SubLObject var3) {
        final SubLObject var4 = module0351.f23577(module0202.f12768($ic0$, var2, var3));
        return module0438.f30664(var4, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f31573(final SubLObject var1, SubLObject var5) {
        if (var5 == UNPROVIDED) {
            var5 = (SubLObject)NIL;
        }
        return f31571(var1);
    }
    
    public static SubLObject f31574(final SubLObject var1, SubLObject var5) {
        if (var5 == UNPROVIDED) {
            var5 = (SubLObject)NIL;
        }
        return f31571(var1);
    }
    
    public static SubLObject f31575(final SubLObject var8) {
        final SubLThread var9 = SubLProcess.currentSubLThread();
        var9.resetMultipleValues();
        final SubLObject var10 = module0229.f15243(var8);
        final SubLObject var11 = var9.secondMultipleValue();
        final SubLObject var12 = var9.thirdMultipleValue();
        var9.resetMultipleValues();
        return Values.values((NIL != var11) ? var10 : var8, (SubLObject)((NIL != var11) ? var12 : NIL));
    }
    
    public static SubLObject f31576(final SubLObject var13) {
        final SubLThread var14 = SubLProcess.currentSubLThread();
        SubLObject var15 = (SubLObject)NIL;
        SubLObject var16 = (SubLObject)NIL;
        SubLObject var17 = var13;
        SubLObject var18 = (SubLObject)NIL;
        var18 = var17.first();
        while (NIL != var17) {
            var14.resetMultipleValues();
            final SubLObject var19 = f31575(var18);
            final SubLObject var20 = var14.secondMultipleValue();
            var14.resetMultipleValues();
            var15 = (SubLObject)ConsesLow.cons(var19, var15);
            var16 = (SubLObject)makeBoolean(NIL != var16 || NIL != var20);
            var17 = var17.rest();
            var18 = var17.first();
        }
        return Values.values(Sequences.nreverse(var15), var16);
    }
    
    public static SubLObject f31577() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0470", "f31571", "S#34924", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0470", "f31572", "S#24933", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0470", "f31573", "S#34923", 1, 1, false);
        new $f31573$UnaryFunction();
        new $f31573$BinaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0470", "f31574", "S#34925", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0470", "f31575", "S#34926", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0470", "f31576", "S#34927", 1, 0, false);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f31578() {
        $g3679$ = SubLFiles.defparameter("S#34928", (SubLObject)ZERO_INTEGER);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f31579() {
        module0340.f22938($ic0$);
        module0340.f22944($ic0$, (SubLObject)$ic1$);
        module0340.f22944($ic0$, (SubLObject)$ic2$);
        module0358.f23773((SubLObject)$ic3$, $ic0$);
        module0340.f22941((SubLObject)$ic4$, (SubLObject)$ic5$);
        module0340.f22938($ic6$);
        module0340.f22944($ic6$, (SubLObject)$ic1$);
        module0340.f22944($ic6$, (SubLObject)$ic2$);
        module0340.f22946($ic6$, (SubLObject)$ic7$);
        module0340.f22946($ic6$, (SubLObject)$ic8$);
        module0358.f23773((SubLObject)$ic3$, $ic6$);
        module0340.f22941((SubLObject)$ic9$, (SubLObject)$ic10$);
        return (SubLObject)NIL;
    }
    
    public void declareFunctions() {
        f31577();
    }
    
    public void initializeVariables() {
        f31578();
    }
    
    public void runTopLevelForms() {
        f31579();
    }
    
    static {
        me = (SubLFile)new module0470();
        $g3679$ = null;
        $ic0$ = constant_handles_oc.f8479((SubLObject)makeString("different"));
        $ic1$ = makeKeyword("REMOVAL-EVAL");
        $ic2$ = makeKeyword("REMOVAL-NOT-EVAL");
        $ic3$ = makeKeyword("POS");
        $ic4$ = makeKeyword("REMOVAL-DIFFERENT-DUPLICATE");
        $ic5$ = ConsesLow.list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), constant_handles_oc.f8479((SubLObject)makeString("different")), makeKeyword("REQUIRED-PATTERN"), ConsesLow.cons(constant_handles_oc.f8479((SubLObject)makeString("different")), (SubLObject)makeKeyword("ANYTHING")), makeKeyword("EXCLUSIVE"), makeSymbol("S#34923", "CYC"), makeKeyword("SUPPLANTS"), makeKeyword("ALL"), makeKeyword("COST-EXPRESSION"), makeSymbol("S#34928", "CYC"), makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE") });
        $ic6$ = constant_handles_oc.f8479((SubLObject)makeString("differentSymbols"));
        $ic7$ = makeKeyword("META-REMOVAL-COMPLETELY-ENUMERABLE-POS");
        $ic8$ = makeKeyword("META-REMOVAL-COMPLETELY-DECIDABLE-POS");
        $ic9$ = makeKeyword("REMOVAL-DIFFERENT-SYMBOLS-DUPLICATE");
        $ic10$ = ConsesLow.list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), constant_handles_oc.f8479((SubLObject)makeString("differentSymbols")), makeKeyword("REQUIRED-PATTERN"), ConsesLow.cons(constant_handles_oc.f8479((SubLObject)makeString("differentSymbols")), (SubLObject)makeKeyword("ANYTHING")), makeKeyword("EXCLUSIVE"), makeSymbol("S#34925", "CYC"), makeKeyword("SUPPLANTS"), makeKeyword("ALL"), makeKeyword("COST-EXPRESSION"), makeSymbol("S#34928", "CYC"), makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE") });
    }
    
    public static final class $f31573$UnaryFunction extends UnaryFunction
    {
        public $f31573$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("S#34923"));
        }
        
        public SubLObject processItem(final SubLObject var6) {
            return f31573(var6, (SubLObject)$f31573$UnaryFunction.UNPROVIDED);
        }
    }
    
    public static final class $f31573$BinaryFunction extends BinaryFunction
    {
        public $f31573$BinaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("S#34923"));
        }
        
        public SubLObject processItem(final SubLObject var6, final SubLObject var7) {
            return f31573(var6, var7);
        }
    }
}

/*
	DECOMPILATION REPORT

	Decompiled from: G:\opt\CYC_JRTL_with_CommonLisp\platform\lib\cyc-oc4.0-unzipped/com/cyc/cycjava/cycl/class
	Total time: 83 ms
	
	Decompiled with Procyon 0.5.32.
*/