package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.UnaryFunction;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLStructDecl;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLStructDeclNative;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLStructNative;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.visitation;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLSpecialOperatorDeclarations;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Structures;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Vectors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class module0140 extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.module0140";
    public static final String myFingerPrint = "d0651ac8108cd8d2844706d1f99a2bea4c3002cc7e7f267b790da09a5ca352bd";
    public static SubLSymbol $g1661$;
    public static SubLSymbol $g1662$;
    private static final SubLSymbol $ic0$;
    private static final SubLSymbol $ic1$;
    private static final SubLList $ic2$;
    private static final SubLList $ic3$;
    private static final SubLList $ic4$;
    private static final SubLList $ic5$;
    private static final SubLSymbol $ic6$;
    private static final SubLSymbol $ic7$;
    private static final SubLList $ic8$;
    private static final SubLSymbol $ic9$;
    private static final SubLSymbol $ic10$;
    private static final SubLSymbol $ic11$;
    private static final SubLSymbol $ic12$;
    private static final SubLSymbol $ic13$;
    private static final SubLSymbol $ic14$;
    private static final SubLString $ic15$;
    private static final SubLSymbol $ic16$;
    private static final SubLSymbol $ic17$;
    private static final SubLSymbol $ic18$;
    private static final SubLSymbol $ic19$;
    private static final SubLSymbol $ic20$;
    private static final SubLString $ic21$;
    private static final SubLSymbol $ic22$;
    private static final SubLString $ic23$;
    private static final SubLSymbol $ic24$;
    private static final SubLSymbol $ic25$;
    private static final SubLSymbol $ic26$;
    private static final SubLSymbol $ic27$;
    private static final SubLList $ic28$;
    private static final SubLList $ic29$;
    private static final SubLList $ic30$;
    private static final SubLList $ic31$;
    private static final SubLSymbol $ic32$;
    private static final SubLSymbol $ic33$;
    private static final SubLList $ic34$;
    private static final SubLSymbol $ic35$;
    private static final SubLSymbol $ic36$;
    private static final SubLSymbol $ic37$;
    private static final SubLSymbol $ic38$;
    private static final SubLSymbol $ic39$;
    private static final SubLSymbol $ic40$;
    private static final SubLSymbol $ic41$;
    private static final SubLSymbol $ic42$;
    private static final SubLSymbol $ic43$;
    private static final SubLSymbol $ic44$;
    private static final SubLSymbol $ic45$;
    private static final SubLSymbol $ic46$;
    private static final SubLSymbol $ic47$;
    private static final SubLSymbol $ic48$;
    private static final SubLSymbol $ic49$;
    private static final SubLSymbol $ic50$;
    private static final SubLSymbol $ic51$;
    private static final SubLSymbol $ic52$;
    private static final SubLSymbol $ic53$;
    private static final SubLSymbol $ic54$;
    private static final SubLSymbol $ic55$;
    private static final SubLSymbol $ic56$;
    private static final SubLSymbol $ic57$;
    private static final SubLSymbol $ic58$;
    private static final SubLSymbol $ic59$;
    private static final SubLSymbol $ic60$;
    private static final SubLString $ic61$;
    private static final SubLString $ic62$;
    private static final SubLString $ic63$;
    private static final SubLString $ic64$;
    private static final SubLString $ic65$;
    private static final SubLString $ic66$;
    private static final SubLString $ic67$;
    private static final SubLString $ic68$;
    private static final SubLString $ic69$;
    
    public static SubLObject f9092(final SubLObject var1, final SubLObject var2) {
        f9093(var1, var2, (SubLObject)ZERO_INTEGER);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f9094(final SubLObject var1) {
        return (SubLObject)((var1.getClass() == $sX11397_native.class) ? T : NIL);
    }
    
    public static SubLObject f9095(final SubLObject var1) {
        assert NIL != f9094(var1) : var1;
        return var1.getField2();
    }
    
    public static SubLObject f9096(final SubLObject var1) {
        assert NIL != f9094(var1) : var1;
        return var1.getField3();
    }
    
    public static SubLObject f9097(final SubLObject var1, final SubLObject var4) {
        assert NIL != f9094(var1) : var1;
        return var1.setField2(var4);
    }
    
    public static SubLObject f9098(final SubLObject var1, final SubLObject var4) {
        assert NIL != f9094(var1) : var1;
        return var1.setField3(var4);
    }
    
    public static SubLObject f9099(SubLObject var5) {
        if (var5 == UNPROVIDED) {
            var5 = (SubLObject)NIL;
        }
        final SubLObject var6 = (SubLObject)new $sX11397_native();
        SubLObject var7;
        SubLObject var8;
        SubLObject var9;
        SubLObject var10;
        for (var7 = (SubLObject)NIL, var7 = var5; NIL != var7; var7 = conses_high.cddr(var7)) {
            var8 = var7.first();
            var9 = conses_high.cadr(var7);
            var10 = var8;
            if (var10.eql((SubLObject)$ic13$)) {
                f9097(var6, var9);
            }
            else if (var10.eql((SubLObject)$ic14$)) {
                f9098(var6, var9);
            }
            else {
                Errors.error((SubLObject)$ic15$, var8);
            }
        }
        return var6;
    }
    
    public static SubLObject f9100(final SubLObject var11, final SubLObject var12) {
        Functions.funcall(var12, var11, (SubLObject)$ic16$, (SubLObject)$ic17$, (SubLObject)TWO_INTEGER);
        Functions.funcall(var12, var11, (SubLObject)$ic18$, (SubLObject)$ic13$, f9095(var11));
        Functions.funcall(var12, var11, (SubLObject)$ic18$, (SubLObject)$ic14$, f9096(var11));
        Functions.funcall(var12, var11, (SubLObject)$ic19$, (SubLObject)$ic17$, (SubLObject)TWO_INTEGER);
        return var11;
    }
    
    public static SubLObject f9101(final SubLObject var11, final SubLObject var12) {
        return f9100(var11, var12);
    }
    
    public static SubLObject f9093(final SubLObject var13, final SubLObject var2, final SubLObject var14) {
        final SubLThread var15 = SubLProcess.currentSubLThread();
        if (NIL != print_high.$print_readably$.getDynamicValue(var15)) {
            print_high.print_not_readable(var13, var2);
        }
        else {
            streams_high.write_string((SubLObject)$ic21$, var2, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
            PrintLow.write((SubLObject)Types.type_of(var13), new SubLObject[] { $ic22$, var2 });
            streams_high.write_char((SubLObject)Characters.CHAR_space, var2);
            streams_high.write_string((SubLObject)$ic23$, var2, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
            print_high.princ(f9102(var13), var2);
            streams_high.write_char((SubLObject)Characters.CHAR_space, var2);
            PrintLow.write(Equality.pointer(var13), new SubLObject[] { $ic22$, var2, $ic24$, SIXTEEN_INTEGER });
            streams_high.write_char((SubLObject)Characters.CHAR_greater, var2);
        }
        return var13;
    }
    
    public static SubLObject f9103(SubLObject var19) {
        if (var19 == UNPROVIDED) {
            var19 = (SubLObject)THIRTEEN_INTEGER;
        }
        assert NIL != module0004.f105(var19) : var19;
        final SubLObject var20 = f9099((SubLObject)UNPROVIDED);
        f9097(var20, (SubLObject)ZERO_INTEGER);
        f9098(var20, Vectors.make_vector(var19, (SubLObject)UNPROVIDED));
        return var20;
    }
    
    public static SubLObject f9102(final SubLObject var13) {
        return f9095(var13);
    }
    
    public static SubLObject f9104(final SubLObject var13) {
        return Numbers.zerop(f9095(var13));
    }
    
    public static SubLObject f9105(final SubLObject var21, final SubLObject var13) {
        if (f9095(var13).numGE(Sequences.length(f9096(var13)))) {
            f9098(var13, module0037.f2565(f9096(var13), (SubLObject)NIL, (SubLObject)TWO_INTEGER));
        }
        Vectors.set_aref(f9096(var13), f9095(var13), var21);
        f9097(var13, Numbers.add(f9095(var13), (SubLObject)ONE_INTEGER));
        return var13;
    }
    
    public static SubLObject f9106(final SubLObject var13) {
        SubLObject var14 = (SubLObject)NIL;
        if (NIL == f9104(var13)) {
            f9097(var13, Numbers.subtract(f9095(var13), (SubLObject)ONE_INTEGER));
            var14 = Vectors.aref(f9096(var13), f9095(var13));
            Vectors.set_aref(f9096(var13), f9095(var13), (SubLObject)NIL);
        }
        return var14;
    }
    
    public static SubLObject f9107(final SubLObject var13) {
        SubLObject var14 = (SubLObject)NIL;
        if (NIL == f9104(var13)) {
            var14 = Vectors.aref(f9096(var13), Numbers.subtract(f9095(var13), (SubLObject)ONE_INTEGER));
        }
        return var14;
    }
    
    public static SubLObject f9108(final SubLObject var13) {
        f9097(var13, (SubLObject)ZERO_INTEGER);
        module0037.f2566(f9096(var13), (SubLObject)NIL);
        return var13;
    }
    
    public static SubLObject f9109(final SubLObject var1, final SubLObject var2) {
        f9110(var1, var2, (SubLObject)ZERO_INTEGER);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f9111(final SubLObject var1) {
        return (SubLObject)((var1.getClass() == $sX11398_native.class) ? T : NIL);
    }
    
    public static SubLObject f9112(final SubLObject var1) {
        assert NIL != f9111(var1) : var1;
        return var1.getField2();
    }
    
    public static SubLObject f9113(final SubLObject var1) {
        assert NIL != f9111(var1) : var1;
        return var1.getField3();
    }
    
    public static SubLObject f9114(final SubLObject var1) {
        assert NIL != f9111(var1) : var1;
        return var1.getField4();
    }
    
    public static SubLObject f9115(final SubLObject var1) {
        assert NIL != f9111(var1) : var1;
        return var1.getField5();
    }
    
    public static SubLObject f9116(final SubLObject var1) {
        assert NIL != f9111(var1) : var1;
        return var1.getField6();
    }
    
    public static SubLObject f9117(final SubLObject var1) {
        assert NIL != f9111(var1) : var1;
        return var1.getField7();
    }
    
    public static SubLObject f9118(final SubLObject var1) {
        assert NIL != f9111(var1) : var1;
        return var1.getField8();
    }
    
    public static SubLObject f9119(final SubLObject var1) {
        assert NIL != f9111(var1) : var1;
        return var1.getField9();
    }
    
    public static SubLObject f9120(final SubLObject var1, final SubLObject var4) {
        assert NIL != f9111(var1) : var1;
        return var1.setField2(var4);
    }
    
    public static SubLObject f9121(final SubLObject var1, final SubLObject var4) {
        assert NIL != f9111(var1) : var1;
        return var1.setField3(var4);
    }
    
    public static SubLObject f9122(final SubLObject var1, final SubLObject var4) {
        assert NIL != f9111(var1) : var1;
        return var1.setField4(var4);
    }
    
    public static SubLObject f9123(final SubLObject var1, final SubLObject var4) {
        assert NIL != f9111(var1) : var1;
        return var1.setField5(var4);
    }
    
    public static SubLObject f9124(final SubLObject var1, final SubLObject var4) {
        assert NIL != f9111(var1) : var1;
        return var1.setField6(var4);
    }
    
    public static SubLObject f9125(final SubLObject var1, final SubLObject var4) {
        assert NIL != f9111(var1) : var1;
        return var1.setField7(var4);
    }
    
    public static SubLObject f9126(final SubLObject var1, final SubLObject var4) {
        assert NIL != f9111(var1) : var1;
        return var1.setField8(var4);
    }
    
    public static SubLObject f9127(final SubLObject var1, final SubLObject var4) {
        assert NIL != f9111(var1) : var1;
        return var1.setField9(var4);
    }
    
    public static SubLObject f9128(SubLObject var5) {
        if (var5 == UNPROVIDED) {
            var5 = (SubLObject)NIL;
        }
        final SubLObject var6 = (SubLObject)new $sX11398_native();
        SubLObject var7;
        SubLObject var8;
        SubLObject var9;
        SubLObject var10;
        for (var7 = (SubLObject)NIL, var7 = var5; NIL != var7; var7 = conses_high.cddr(var7)) {
            var8 = var7.first();
            var9 = conses_high.cadr(var7);
            var10 = var8;
            if (var10.eql((SubLObject)$ic51$)) {
                f9120(var6, var9);
            }
            else if (var10.eql((SubLObject)$ic52$)) {
                f9121(var6, var9);
            }
            else if (var10.eql((SubLObject)$ic53$)) {
                f9122(var6, var9);
            }
            else if (var10.eql((SubLObject)$ic54$)) {
                f9123(var6, var9);
            }
            else if (var10.eql((SubLObject)$ic55$)) {
                f9124(var6, var9);
            }
            else if (var10.eql((SubLObject)$ic56$)) {
                f9125(var6, var9);
            }
            else if (var10.eql((SubLObject)$ic57$)) {
                f9126(var6, var9);
            }
            else if (var10.eql((SubLObject)$ic58$)) {
                f9127(var6, var9);
            }
            else {
                Errors.error((SubLObject)$ic15$, var8);
            }
        }
        return var6;
    }
    
    public static SubLObject f9129(final SubLObject var11, final SubLObject var12) {
        Functions.funcall(var12, var11, (SubLObject)$ic16$, (SubLObject)$ic59$, (SubLObject)EIGHT_INTEGER);
        Functions.funcall(var12, var11, (SubLObject)$ic18$, (SubLObject)$ic51$, f9112(var11));
        Functions.funcall(var12, var11, (SubLObject)$ic18$, (SubLObject)$ic52$, f9113(var11));
        Functions.funcall(var12, var11, (SubLObject)$ic18$, (SubLObject)$ic53$, f9114(var11));
        Functions.funcall(var12, var11, (SubLObject)$ic18$, (SubLObject)$ic54$, f9115(var11));
        Functions.funcall(var12, var11, (SubLObject)$ic18$, (SubLObject)$ic55$, f9116(var11));
        Functions.funcall(var12, var11, (SubLObject)$ic18$, (SubLObject)$ic56$, f9117(var11));
        Functions.funcall(var12, var11, (SubLObject)$ic18$, (SubLObject)$ic57$, f9118(var11));
        Functions.funcall(var12, var11, (SubLObject)$ic18$, (SubLObject)$ic58$, f9119(var11));
        Functions.funcall(var12, var11, (SubLObject)$ic19$, (SubLObject)$ic59$, (SubLObject)EIGHT_INTEGER);
        return var11;
    }
    
    public static SubLObject f9130(final SubLObject var11, final SubLObject var12) {
        return f9129(var11, var12);
    }
    
    public static SubLObject f9110(final SubLObject var25, final SubLObject var2, final SubLObject var14) {
        final SubLThread var26 = SubLProcess.currentSubLThread();
        if (NIL != print_high.$print_readably$.getDynamicValue(var26)) {
            print_high.print_not_readable(var25, var2);
        }
        else {
            streams_high.write_string((SubLObject)$ic21$, var2, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
            PrintLow.write((SubLObject)Types.type_of(var25), new SubLObject[] { $ic22$, var2 });
            streams_high.write_char((SubLObject)Characters.CHAR_space, var2);
            PrintLow.format(var2, (SubLObject)$ic61$, module0137.f8917(f9113(var25)), f9112(var25));
            streams_high.write_char((SubLObject)Characters.CHAR_space, var2);
            PrintLow.write(Equality.pointer(var25), new SubLObject[] { $ic22$, var2, $ic24$, SIXTEEN_INTEGER });
            streams_high.write_char((SubLObject)Characters.CHAR_greater, var2);
        }
        return var25;
    }
    
    public static SubLObject f9131(final SubLObject var30, final SubLObject var31, final SubLObject var32, final SubLObject var33, final SubLObject var34, final SubLObject var35, final SubLObject var36, SubLObject var37) {
        if (var37 == UNPROVIDED) {
            var37 = (SubLObject)NIL;
        }
        final SubLObject var38 = f9128((SubLObject)UNPROVIDED);
        f9120(var38, var30);
        f9121(var38, var31);
        f9122(var38, var32);
        f9123(var38, var33);
        f9124(var38, var34);
        f9125(var38, var35);
        f9126(var38, var36);
        f9127(var38, var37);
        return var38;
    }
    
    public static SubLObject f9132(final SubLObject var39) {
        return f9112(var39);
    }
    
    public static SubLObject f9133(final SubLObject var39) {
        return f9113(var39);
    }
    
    public static SubLObject f9134(final SubLObject var39) {
        return f9114(var39);
    }
    
    public static SubLObject f9135(final SubLObject var39) {
        return f9115(var39);
    }
    
    public static SubLObject f9136(final SubLObject var39) {
        return f9116(var39);
    }
    
    public static SubLObject f9137(final SubLObject var39) {
        return f9117(var39);
    }
    
    public static SubLObject f9138(final SubLObject var39) {
        return f9118(var39);
    }
    
    public static SubLObject f9139(final SubLObject var39) {
        return f9119(var39);
    }
    
    public static SubLObject f9140(final SubLObject var39, SubLObject var2) {
        if (var2 == UNPROVIDED) {
            var2 = (SubLObject)T;
        }
        PrintLow.format(var2, (SubLObject)$ic62$, f9112(var39));
        PrintLow.format(var2, (SubLObject)$ic63$, f9113(var39));
        PrintLow.format(var2, (SubLObject)$ic64$, f9114(var39));
        PrintLow.format(var2, (SubLObject)$ic65$, f9115(var39));
        PrintLow.format(var2, (SubLObject)$ic66$, f9116(var39));
        PrintLow.format(var2, (SubLObject)$ic67$, f9117(var39));
        PrintLow.format(var2, (SubLObject)$ic68$, f9118(var39));
        PrintLow.format(var2, (SubLObject)$ic69$, f9119(var39));
        return (SubLObject)NIL;
    }
    
    public static SubLObject f9141() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0140", "f9092", "S#11400", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0140", "f9094", "S#10999", 1, 0, false);
        new $f9094$UnaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0140", "f9095", "S#11401", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0140", "f9096", "S#11402", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0140", "f9097", "S#11403", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0140", "f9098", "S#11404", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0140", "f9099", "S#11405", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0140", "f9100", "S#11406", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0140", "f9101", "S#11407", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0140", "f9093", "S#11408", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0140", "f9103", "S#11073", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0140", "f9102", "S#11001", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0140", "f9104", "S#11409", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0140", "f9105", "S#11002", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0140", "f9106", "S#11000", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0140", "f9107", "S#11410", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0140", "f9108", "S#11411", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0140", "f9109", "S#11412", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0140", "f9111", "S#11399", 1, 0, false);
        new $f9111$UnaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0140", "f9112", "S#11413", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0140", "f9113", "S#11414", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0140", "f9114", "S#11415", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0140", "f9115", "S#11416", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0140", "f9116", "S#11417", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0140", "f9117", "S#11418", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0140", "f9118", "S#11419", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0140", "f9119", "S#11420", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0140", "f9120", "S#11421", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0140", "f9121", "S#11422", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0140", "f9122", "S#11423", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0140", "f9123", "S#11424", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0140", "f9124", "S#11425", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0140", "f9125", "S#11426", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0140", "f9126", "S#11427", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0140", "f9127", "S#11428", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0140", "f9128", "S#11429", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0140", "f9129", "S#11430", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0140", "f9130", "S#11431", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0140", "f9110", "S#11432", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0140", "f9131", "S#11433", 7, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0140", "f9132", "S#11434", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0140", "f9133", "S#11435", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0140", "f9134", "S#11436", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0140", "f9135", "S#11437", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0140", "f9136", "S#11438", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0140", "f9137", "S#11439", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0140", "f9138", "S#11440", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0140", "f9139", "S#11441", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0140", "f9140", "S#11442", 1, 1, false);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f9142() {
        $g1661$ = SubLFiles.defconstant("S#11443", (SubLObject)$ic0$);
        $g1662$ = SubLFiles.defconstant("S#11444", (SubLObject)$ic26$);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f9143() {
        Structures.register_method(print_high.$print_object_method_table$.getGlobalValue(), $g1661$.getGlobalValue(), Symbols.symbol_function((SubLObject)$ic7$));
        SubLSpecialOperatorDeclarations.proclaim((SubLObject)$ic8$);
        Structures.def_csetf((SubLObject)$ic9$, (SubLObject)$ic10$);
        Structures.def_csetf((SubLObject)$ic11$, (SubLObject)$ic12$);
        Equality.identity((SubLObject)$ic0$);
        Structures.register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), $g1661$.getGlobalValue(), Symbols.symbol_function((SubLObject)$ic20$));
        Structures.register_method(print_high.$print_object_method_table$.getGlobalValue(), $g1662$.getGlobalValue(), Symbols.symbol_function((SubLObject)$ic33$));
        SubLSpecialOperatorDeclarations.proclaim((SubLObject)$ic34$);
        Structures.def_csetf((SubLObject)$ic35$, (SubLObject)$ic36$);
        Structures.def_csetf((SubLObject)$ic37$, (SubLObject)$ic38$);
        Structures.def_csetf((SubLObject)$ic39$, (SubLObject)$ic40$);
        Structures.def_csetf((SubLObject)$ic41$, (SubLObject)$ic42$);
        Structures.def_csetf((SubLObject)$ic43$, (SubLObject)$ic44$);
        Structures.def_csetf((SubLObject)$ic45$, (SubLObject)$ic46$);
        Structures.def_csetf((SubLObject)$ic47$, (SubLObject)$ic48$);
        Structures.def_csetf((SubLObject)$ic49$, (SubLObject)$ic50$);
        Equality.identity((SubLObject)$ic26$);
        Structures.register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), $g1662$.getGlobalValue(), Symbols.symbol_function((SubLObject)$ic60$));
        return (SubLObject)NIL;
    }
    
    public void declareFunctions() {
        f9141();
    }
    
    public void initializeVariables() {
        f9142();
    }
    
    public void runTopLevelForms() {
        f9143();
    }
    
    static {
        me = (SubLFile)new module0140();
        $g1661$ = null;
        $g1662$ = null;
        $ic0$ = makeSymbol("S#11397", "CYC");
        $ic1$ = makeSymbol("S#10999", "CYC");
        $ic2$ = ConsesLow.list((SubLObject)makeSymbol("S#1993", "CYC"), (SubLObject)makeSymbol("S#5477", "CYC"));
        $ic3$ = ConsesLow.list((SubLObject)makeKeyword("NUM"), (SubLObject)makeKeyword("ELEMENTS"));
        $ic4$ = ConsesLow.list((SubLObject)makeSymbol("S#11401", "CYC"), (SubLObject)makeSymbol("S#11402", "CYC"));
        $ic5$ = ConsesLow.list((SubLObject)makeSymbol("S#11403", "CYC"), (SubLObject)makeSymbol("S#11404", "CYC"));
        $ic6$ = makeSymbol("S#11408", "CYC");
        $ic7$ = makeSymbol("S#11400", "CYC");
        $ic8$ = ConsesLow.list((SubLObject)makeSymbol("OPTIMIZE-FUNCALL"), (SubLObject)makeSymbol("S#10999", "CYC"));
        $ic9$ = makeSymbol("S#11401", "CYC");
        $ic10$ = makeSymbol("S#11403", "CYC");
        $ic11$ = makeSymbol("S#11402", "CYC");
        $ic12$ = makeSymbol("S#11404", "CYC");
        $ic13$ = makeKeyword("NUM");
        $ic14$ = makeKeyword("ELEMENTS");
        $ic15$ = makeString("Invalid slot ~S for construction function");
        $ic16$ = makeKeyword("BEGIN");
        $ic17$ = makeSymbol("S#11405", "CYC");
        $ic18$ = makeKeyword("SLOT");
        $ic19$ = makeKeyword("END");
        $ic20$ = makeSymbol("S#11407", "CYC");
        $ic21$ = makeString("#<");
        $ic22$ = makeKeyword("STREAM");
        $ic23$ = makeString("size=");
        $ic24$ = makeKeyword("BASE");
        $ic25$ = makeSymbol("POSITIVE-INTEGER-P");
        $ic26$ = makeSymbol("S#11398", "CYC");
        $ic27$ = makeSymbol("S#11399", "CYC");
        $ic28$ = ConsesLow.list((SubLObject)makeSymbol("S#9182", "CYC"), (SubLObject)makeSymbol("S#205", "CYC"), (SubLObject)makeSymbol("S#5432", "CYC"), (SubLObject)makeSymbol("S#11445", "CYC"), (SubLObject)makeSymbol("S#10995", "CYC"), (SubLObject)makeSymbol("S#11446", "CYC"), (SubLObject)makeSymbol("S#11447", "CYC"), (SubLObject)makeSymbol("S#11448", "CYC"));
        $ic29$ = ConsesLow.list((SubLObject)makeKeyword("NODE"), (SubLObject)makeKeyword("MODULE"), (SubLObject)makeKeyword("DIRECTION"), (SubLObject)makeKeyword("MT"), (SubLObject)makeKeyword("TV"), (SubLObject)makeKeyword("PARENT-NODE"), (SubLObject)makeKeyword("GENL-INVERSE-MODE?"), (SubLObject)makeKeyword("LINK-GENERATOR"));
        $ic30$ = ConsesLow.list((SubLObject)makeSymbol("S#11413", "CYC"), (SubLObject)makeSymbol("S#11414", "CYC"), (SubLObject)makeSymbol("S#11415", "CYC"), (SubLObject)makeSymbol("S#11416", "CYC"), (SubLObject)makeSymbol("S#11417", "CYC"), (SubLObject)makeSymbol("S#11418", "CYC"), (SubLObject)makeSymbol("S#11419", "CYC"), (SubLObject)makeSymbol("S#11420", "CYC"));
        $ic31$ = ConsesLow.list((SubLObject)makeSymbol("S#11421", "CYC"), (SubLObject)makeSymbol("S#11422", "CYC"), (SubLObject)makeSymbol("S#11423", "CYC"), (SubLObject)makeSymbol("S#11424", "CYC"), (SubLObject)makeSymbol("S#11425", "CYC"), (SubLObject)makeSymbol("S#11426", "CYC"), (SubLObject)makeSymbol("S#11427", "CYC"), (SubLObject)makeSymbol("S#11428", "CYC"));
        $ic32$ = makeSymbol("S#11432", "CYC");
        $ic33$ = makeSymbol("S#11412", "CYC");
        $ic34$ = ConsesLow.list((SubLObject)makeSymbol("OPTIMIZE-FUNCALL"), (SubLObject)makeSymbol("S#11399", "CYC"));
        $ic35$ = makeSymbol("S#11413", "CYC");
        $ic36$ = makeSymbol("S#11421", "CYC");
        $ic37$ = makeSymbol("S#11414", "CYC");
        $ic38$ = makeSymbol("S#11422", "CYC");
        $ic39$ = makeSymbol("S#11415", "CYC");
        $ic40$ = makeSymbol("S#11423", "CYC");
        $ic41$ = makeSymbol("S#11416", "CYC");
        $ic42$ = makeSymbol("S#11424", "CYC");
        $ic43$ = makeSymbol("S#11417", "CYC");
        $ic44$ = makeSymbol("S#11425", "CYC");
        $ic45$ = makeSymbol("S#11418", "CYC");
        $ic46$ = makeSymbol("S#11426", "CYC");
        $ic47$ = makeSymbol("S#11419", "CYC");
        $ic48$ = makeSymbol("S#11427", "CYC");
        $ic49$ = makeSymbol("S#11420", "CYC");
        $ic50$ = makeSymbol("S#11428", "CYC");
        $ic51$ = makeKeyword("NODE");
        $ic52$ = makeKeyword("MODULE");
        $ic53$ = makeKeyword("DIRECTION");
        $ic54$ = makeKeyword("MT");
        $ic55$ = makeKeyword("TV");
        $ic56$ = makeKeyword("PARENT-NODE");
        $ic57$ = makeKeyword("GENL-INVERSE-MODE?");
        $ic58$ = makeKeyword("LINK-GENERATOR");
        $ic59$ = makeSymbol("S#11429", "CYC");
        $ic60$ = makeSymbol("S#11431", "CYC");
        $ic61$ = makeString("(~a : ~a)");
        $ic62$ = makeString("Node:             ~a~%");
        $ic63$ = makeString("Module:           ~a~%");
        $ic64$ = makeString("Direction:        ~a~%");
        $ic65$ = makeString("Mt:               ~a~%");
        $ic66$ = makeString("TV:               ~a~%");
        $ic67$ = makeString("Parent Node:      ~a~%");
        $ic68$ = makeString("genlInverse mode: ~a~%");
        $ic69$ = makeString("Link Generator:   ~a~%");
    }
    
    public static final class $sX11397_native extends SubLStructNative
    {
        public SubLObject $num;
        public SubLObject $elements;
        public static final SubLStructDeclNative structDecl;
        
        public $sX11397_native() {
            this.$num = (SubLObject)CommonSymbols.NIL;
            this.$elements = (SubLObject)CommonSymbols.NIL;
        }
        
        public SubLStructDecl getStructDecl() {
            return (SstructDecl;
        }
        
        public SubLObject getField2() {
            return this.$num;
        }
        
        public SubLObject getField3() {
            return this.$elements;
        }
        
        public SubLObject setField2(final SubLObject value) {
            return this.$num = value;
        }
        
        public SubLObject setField3(final SubLObject value) {
            return this.$elements = value;
        }
        
        static {
            structDecl = Structures.makeStructDeclNative((Class)$sX11397_native.class, $ic0$, $ic1$, $ic2$, $ic3$, new String[] { "$num", "$elements" }, $ic4$, $ic5$, $ic6$);
        }
    }
    
    public static final class $f9094$UnaryFunction extends UnaryFunction
    {
        public $f9094$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("S#10999"));
        }
        
        public SubLObject processItem(final SubLObject var3) {
            return f9094(var3);
        }
    }
    
    public static final class $sX11398_native extends SubLStructNative
    {
        public SubLObject $node;
        public SubLObject $module;
        public SubLObject $direction;
        public SubLObject $mt;
        public SubLObject $tv;
        public SubLObject $parent_node;
        public SubLObject $genl_inverse_modeP;
        public SubLObject $link_generator;
        public static final SubLStructDeclNative structDecl;
        
        public $sX11398_native() {
            this.$node = (SubLObject)CommonSymbols.NIL;
            this.$module = (SubLObject)CommonSymbols.NIL;
            this.$direction = (SubLObject)CommonSymbols.NIL;
            this.$mt = (SubLObject)CommonSymbols.NIL;
            this.$tv = (SubLObject)CommonSymbols.NIL;
            this.$parent_node = (SubLObject)CommonSymbols.NIL;
            this.$genl_inverse_modeP = (SubLObject)CommonSymbols.NIL;
            this.$link_generator = (SubLObject)CommonSymbols.NIL;
        }
        
        public SubLStructDecl getStructDecl() {
            return (SstructDecl;
        }
        
        public SubLObject getField2() {
            return this.$node;
        }
        
        public SubLObject getField3() {
            return this.$module;
        }
        
        public SubLObject getField4() {
            return this.$direction;
        }
        
        public SubLObject getField5() {
            return this.$mt;
        }
        
        public SubLObject getField6() {
            return this.$tv;
        }
        
        public SubLObject getField7() {
            return this.$parent_node;
        }
        
        public SubLObject getField8() {
            return this.$genl_inverse_modeP;
        }
        
        public SubLObject getField9() {
            return this.$link_generator;
        }
        
        public SubLObject setField2(final SubLObject value) {
            return this.$node = value;
        }
        
        public SubLObject setField3(final SubLObject value) {
            return this.$module = value;
        }
        
        public SubLObject setField4(final SubLObject value) {
            return this.$direction = value;
        }
        
        public SubLObject setField5(final SubLObject value) {
            return this.$mt = value;
        }
        
        public SubLObject setField6(final SubLObject value) {
            return this.$tv = value;
        }
        
        public SubLObject setField7(final SubLObject value) {
            return this.$parent_node = value;
        }
        
        public SubLObject setField8(final SubLObject value) {
            return this.$genl_inverse_modeP = value;
        }
        
        public SubLObject setField9(final SubLObject value) {
            return this.$link_generator = value;
        }
        
        static {
            structDecl = Structures.makeStructDeclNative((Class)$sX11398_native.class, $ic26$, $ic27$, $ic28$, $ic29$, new String[] { "$node", "$module", "$direction", "$mt", "$tv", "$parent_node", "$genl_inverse_modeP", "$link_generator" }, $ic30$, $ic31$, $ic32$);
        }
    }
    
    public static final class $f9111$UnaryFunction extends UnaryFunction
    {
        public $f9111$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("S#11399"));
        }
        
        public SubLObject processItem(final SubLObject var3) {
            return f9111(var3);
        }
    }
}

/*
	DECOMPILATION REPORT

	Decompiled from: G:\opt\CYC_JRTL_with_CommonLisp\platform\lib\cyc-oc4.0-unzipped/com/cyc/cycjava/cycl/class
	Total time: 144 ms
	
	Decompiled with Procyon 0.5.32.
*/