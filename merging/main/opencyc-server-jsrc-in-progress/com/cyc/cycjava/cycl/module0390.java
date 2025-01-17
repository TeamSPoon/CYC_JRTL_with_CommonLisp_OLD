package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.UnaryFunction;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLStructDecl;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLStructDeclNative;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLStructNative;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.visitation;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLSpecialOperatorDeclarations;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Structures;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.compatibility;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class module0390 extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.module0390";
    public static final String myFingerPrint = "5fb8b01bbda1752bdaa8ef6dccabb0c7b32984e18807a495aba1720392333e03";
    public static SubLSymbol $g3265$;
    private static SubLSymbol $g3266$;
    private static SubLSymbol $g3267$;
    public static SubLSymbol $g3268$;
    private static SubLSymbol $g3269$;
    private static SubLSymbol $g3270$;
    private static final SubLSymbol $ic0$;
    private static final SubLList $ic1$;
    private static final SubLSymbol $ic2$;
    private static final SubLSymbol $ic3$;
    private static final SubLList $ic4$;
    private static final SubLList $ic5$;
    private static final SubLList $ic6$;
    private static final SubLList $ic7$;
    private static final SubLSymbol $ic8$;
    private static final SubLSymbol $ic9$;
    private static final SubLList $ic10$;
    private static final SubLSymbol $ic11$;
    private static final SubLSymbol $ic12$;
    private static final SubLSymbol $ic13$;
    private static final SubLSymbol $ic14$;
    private static final SubLSymbol $ic15$;
    private static final SubLSymbol $ic16$;
    private static final SubLSymbol $ic17$;
    private static final SubLSymbol $ic18$;
    private static final SubLSymbol $ic19$;
    private static final SubLString $ic20$;
    private static final SubLSymbol $ic21$;
    private static final SubLSymbol $ic22$;
    private static final SubLSymbol $ic23$;
    private static final SubLSymbol $ic24$;
    private static final SubLSymbol $ic25$;
    private static final SubLList $ic26$;
    private static final SubLList $ic27$;
    private static final SubLList $ic28$;
    private static final SubLSymbol $ic29$;
    private static final SubLSymbol $ic30$;
    private static final SubLSymbol $ic31$;
    private static final SubLSymbol $ic32$;
    private static final SubLSymbol $ic33$;
    private static final SubLSymbol $ic34$;
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
    private static final SubLString $ic48$;
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
    private static final SubLSymbol $ic61$;
    private static final SubLSymbol $ic62$;
    private static final SubLSymbol $ic63$;
    private static final SubLSymbol $ic64$;
    private static final SubLSymbol $ic65$;
    private static final SubLSymbol $ic66$;
    private static final SubLSymbol $ic67$;
    private static final SubLSymbol $ic68$;
    private static final SubLSymbol $ic69$;
    private static final SubLSymbol $ic70$;
    private static final SubLSymbol $ic71$;
    private static final SubLSymbol $ic72$;
    private static final SubLSymbol $ic73$;
    private static final SubLSymbol $ic74$;
    private static final SubLSymbol $ic75$;
    private static final SubLSymbol $ic76$;
    private static final SubLSymbol $ic77$;
    private static final SubLSymbol $ic78$;
    private static final SubLSymbol $ic79$;
    private static final SubLSymbol $ic80$;
    private static final SubLSymbol $ic81$;
    private static final SubLSymbol $ic82$;
    private static final SubLSymbol $ic83$;
    private static final SubLSymbol $ic84$;
    private static final SubLSymbol $ic85$;
    private static final SubLSymbol $ic86$;
    
    public static SubLObject f27698(final SubLObject var1, final SubLObject var2) {
        compatibility.default_struct_print_function(var1, var2, (SubLObject)ZERO_INTEGER);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f27699(final SubLObject var1) {
        return (SubLObject)((var1.getClass() == $sX30810_native.class) ? T : NIL);
    }
    
    public static SubLObject f27700(final SubLObject var1) {
        assert NIL != f27699(var1) : var1;
        return var1.getField2();
    }
    
    public static SubLObject f27701(final SubLObject var1) {
        assert NIL != f27699(var1) : var1;
        return var1.getField3();
    }
    
    public static SubLObject f27702(final SubLObject var1) {
        assert NIL != f27699(var1) : var1;
        return var1.getField4();
    }
    
    public static SubLObject f27703(final SubLObject var1, final SubLObject var4) {
        assert NIL != f27699(var1) : var1;
        return var1.setField2(var4);
    }
    
    public static SubLObject f27704(final SubLObject var1, final SubLObject var4) {
        assert NIL != f27699(var1) : var1;
        return var1.setField3(var4);
    }
    
    public static SubLObject f27705(final SubLObject var1, final SubLObject var4) {
        assert NIL != f27699(var1) : var1;
        return var1.setField4(var4);
    }
    
    public static SubLObject f27706(SubLObject var5) {
        if (var5 == UNPROVIDED) {
            var5 = (SubLObject)NIL;
        }
        final SubLObject var6 = (SubLObject)new $sX30810_native();
        SubLObject var7;
        SubLObject var8;
        SubLObject var9;
        SubLObject var10;
        for (var7 = (SubLObject)NIL, var7 = var5; NIL != var7; var7 = conses_high.cddr(var7)) {
            var8 = var7.first();
            var9 = conses_high.cadr(var7);
            var10 = var8;
            if (var10.eql((SubLObject)$ic17$)) {
                f27703(var6, var9);
            }
            else if (var10.eql((SubLObject)$ic18$)) {
                f27704(var6, var9);
            }
            else if (var10.eql((SubLObject)$ic19$)) {
                f27705(var6, var9);
            }
            else {
                Errors.error((SubLObject)$ic20$, var8);
            }
        }
        return var6;
    }
    
    public static SubLObject f27707(final SubLObject var11, final SubLObject var12) {
        Functions.funcall(var12, var11, (SubLObject)$ic21$, (SubLObject)$ic22$, (SubLObject)THREE_INTEGER);
        Functions.funcall(var12, var11, (SubLObject)$ic23$, (SubLObject)$ic17$, f27700(var11));
        Functions.funcall(var12, var11, (SubLObject)$ic23$, (SubLObject)$ic18$, f27701(var11));
        Functions.funcall(var12, var11, (SubLObject)$ic23$, (SubLObject)$ic19$, f27702(var11));
        Functions.funcall(var12, var11, (SubLObject)$ic24$, (SubLObject)$ic22$, (SubLObject)THREE_INTEGER);
        return var11;
    }
    
    public static SubLObject f27708(final SubLObject var11, final SubLObject var12) {
        return f27707(var11, var12);
    }
    
    public static SubLObject f27709(final SubLObject var13) {
        return (SubLObject)makeBoolean(NIL != module0367.f24997(var13) && NIL != module0035.f2169(module0367.f25035(var13), (SubLObject)$ic26$));
    }
    
    public static SubLObject f27710(final SubLObject var14, final SubLObject var15) {
        SubLObject var17;
        final SubLObject var16 = var17 = var14.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var17, var16, (SubLObject)$ic27$);
        final SubLObject var18 = var17.rest();
        var17 = var17.first();
        SubLObject var19 = (SubLObject)NIL;
        SubLObject var20 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var17, var16, (SubLObject)$ic27$);
        var19 = var17.first();
        var17 = var17.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var17, var16, (SubLObject)$ic27$);
        var20 = var17.first();
        var17 = var17.rest();
        SubLObject var21 = (SubLObject)NIL;
        SubLObject var22 = var17;
        SubLObject var23 = (SubLObject)NIL;
        SubLObject var24_25 = (SubLObject)NIL;
        while (NIL != var22) {
            cdestructuring_bind.destructuring_bind_must_consp(var22, var16, (SubLObject)$ic27$);
            var24_25 = var22.first();
            var22 = var22.rest();
            cdestructuring_bind.destructuring_bind_must_consp(var22, var16, (SubLObject)$ic27$);
            if (NIL == conses_high.member(var24_25, (SubLObject)$ic28$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)) {
                var23 = (SubLObject)T;
            }
            if (var24_25 == $ic29$) {
                var21 = var22.first();
            }
            var22 = var22.rest();
        }
        if (NIL != var23 && NIL == var21) {
            cdestructuring_bind.cdestructuring_bind_error(var16, (SubLObject)$ic27$);
        }
        final SubLObject var24 = cdestructuring_bind.property_list_member((SubLObject)$ic30$, var17);
        final SubLObject var25 = (SubLObject)((NIL != var24) ? conses_high.cadr(var24) : NIL);
        final SubLObject var26;
        var17 = (var26 = var18);
        return (SubLObject)ConsesLow.listS((SubLObject)$ic31$, (SubLObject)ConsesLow.list(var19, (SubLObject)ConsesLow.list((SubLObject)$ic32$, var20), var25), ConsesLow.append(var26, (SubLObject)NIL));
    }
    
    public static SubLObject f27711(final SubLObject var14, final SubLObject var15) {
        SubLObject var17;
        final SubLObject var16 = var17 = var14.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var17, var16, (SubLObject)$ic27$);
        final SubLObject var18 = var17.rest();
        var17 = var17.first();
        SubLObject var19 = (SubLObject)NIL;
        SubLObject var20 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var17, var16, (SubLObject)$ic27$);
        var19 = var17.first();
        var17 = var17.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var17, var16, (SubLObject)$ic27$);
        var20 = var17.first();
        var17 = var17.rest();
        SubLObject var21 = (SubLObject)NIL;
        SubLObject var22 = var17;
        SubLObject var23 = (SubLObject)NIL;
        SubLObject var35_36 = (SubLObject)NIL;
        while (NIL != var22) {
            cdestructuring_bind.destructuring_bind_must_consp(var22, var16, (SubLObject)$ic27$);
            var35_36 = var22.first();
            var22 = var22.rest();
            cdestructuring_bind.destructuring_bind_must_consp(var22, var16, (SubLObject)$ic27$);
            if (NIL == conses_high.member(var35_36, (SubLObject)$ic28$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)) {
                var23 = (SubLObject)T;
            }
            if (var35_36 == $ic29$) {
                var21 = var22.first();
            }
            var22 = var22.rest();
        }
        if (NIL != var23 && NIL == var21) {
            cdestructuring_bind.cdestructuring_bind_error(var16, (SubLObject)$ic27$);
        }
        final SubLObject var24 = cdestructuring_bind.property_list_member((SubLObject)$ic30$, var17);
        final SubLObject var25 = (SubLObject)((NIL != var24) ? conses_high.cadr(var24) : NIL);
        final SubLObject var26;
        var17 = (var26 = var18);
        return (SubLObject)ConsesLow.list((SubLObject)$ic33$, (SubLObject)ConsesLow.list(var19, var20, (SubLObject)$ic30$, var25), (SubLObject)ConsesLow.listS((SubLObject)$ic34$, (SubLObject)ConsesLow.list((SubLObject)$ic35$, var19), ConsesLow.append(var26, (SubLObject)NIL)));
    }
    
    public static SubLObject f27712(final SubLObject var38, final SubLObject var39, final SubLObject var40) {
        final SubLObject var41 = f27706((SubLObject)UNPROVIDED);
        f27703(var41, var38);
        f27704(var41, var39);
        f27705(var41, var40);
        return var41;
    }
    
    public static SubLObject f27713(final SubLObject var20) {
        module0367.f25070(var20, f27714(module0367.f25037(var20)));
        return var20;
    }
    
    public static SubLObject f27714(final SubLObject var42) {
        final SubLObject var43 = module0367.f25039((SubLObject)$ic37$, var42);
        final SubLObject var44 = module0367.f25039((SubLObject)$ic38$, var42);
        final SubLObject var45 = module0367.f25039((SubLObject)$ic39$, var42);
        return f27712(var43, var44, (SubLObject)ConsesLow.list(var45));
    }
    
    public static SubLObject f27715(final SubLObject var20) {
        assert NIL != f27709(var20) : var20;
        final SubLObject var21 = module0367.f25056(var20);
        return f27700(var21);
    }
    
    public static SubLObject f27716(final SubLObject var20) {
        assert NIL != f27709(var20) : var20;
        final SubLObject var21 = module0367.f25056(var20);
        return f27701(var21);
    }
    
    public static SubLObject f27717(final SubLObject var20) {
        assert NIL != f27709(var20) : var20;
        final SubLObject var21 = module0367.f25056(var20);
        return f27702(var21);
    }
    
    public static SubLObject f27718(final SubLObject var20) {
        assert NIL != f27709(var20) : var20;
        return module0035.f2113(f27717(var20));
    }
    
    public static SubLObject f27719(final SubLObject var20) {
        return (SubLObject)ConsesLow.listS(f27715(var20), f27716(var20), f27717(var20));
    }
    
    public static SubLObject f27720(final SubLObject var20, final SubLObject var44) {
        return module0367.f25083(var44, f27715(var20));
    }
    
    public static SubLObject f27721(final SubLObject var20, final SubLObject var44) {
        return module0367.f25083(var44, f27718(var20));
    }
    
    public static SubLObject f27722(final SubLObject var20, final SubLObject var44) {
        return module0367.f25083(var44, f27716(var20));
    }
    
    public static SubLObject f27723(final SubLObject var20, final SubLObject var45) {
        return module0387.f27572(f27718(var20), var45);
    }
    
    public static SubLObject f27724(final SubLObject var13) {
        return (SubLObject)makeBoolean(NIL != module0367.f24997(var13) && NIL != f27709(module0387.f27481(var13)));
    }
    
    public static SubLObject f27725(final SubLObject var13) {
        return (SubLObject)makeBoolean(NIL != module0367.f24997(var13) && NIL == f27709(var13) && NIL != f27709(module0387.f27481(var13)));
    }
    
    public static SubLObject f27726(final SubLObject var13) {
        return module0406.f28343(var13);
    }
    
    public static SubLObject f27727(final SubLObject var20) {
        SubLObject var21 = (SubLObject)NIL;
        if (NIL == var21) {
            SubLObject var22 = f27719(var20);
            SubLObject var23 = (SubLObject)NIL;
            var23 = var22.first();
            while (NIL == var21 && NIL != var22) {
                if (NIL == module0387.f27469(var23)) {
                    var21 = (SubLObject)T;
                }
                var22 = var22.rest();
                var23 = var22.first();
            }
        }
        return (SubLObject)makeBoolean(NIL == var21);
    }
    
    public static SubLObject f27728(final SubLObject var20) {
        SubLObject var21;
        for (var21 = (SubLObject)$ic42$; $ic42$ == var21; var21 = f27729(var20)) {}
        return Equality.eq((SubLObject)$ic30$, var21);
    }
    
    public static SubLObject f27729(final SubLObject var20) {
        final SubLThread var21 = SubLProcess.currentSubLThread();
        SubLObject var22 = (SubLObject)NIL;
        SubLObject var23 = (SubLObject)NIL;
        if (NIL != f27730(var20)) {
            f27731(var20);
            var23 = (SubLObject)$ic44$;
            var22 = (SubLObject)$ic42$;
        }
        else if (NIL != module0367.f25079(var20)) {
            final SubLObject var24 = inference_datastructures_inference_oc.f25474(module0367.f25037(var20));
            final SubLObject var25 = module0374.f26538(var24);
            final SubLObject var26 = f27715(var20);
            module0387.f27570(var26, var25);
            module0373.f26349(var24);
            var23 = (SubLObject)$ic45$;
            var22 = (SubLObject)$ic46$;
        }
        else if (NIL == module0387.f27469(f27718(var20))) {
            var23 = f27718(var20);
            var22 = f27732(module0387.f27568(f27718(var20)));
        }
        else if (NIL == module0387.f27469(f27715(var20))) {
            final SubLObject var27 = f27715(var20);
            final SubLObject var28 = f27718(var20);
            final SubLObject var29 = f27716(var20);
            final SubLObject var30 = module0387.f27569(var27);
            var23 = var27;
            var22 = module0387.f27568(var27);
            SubLObject var31 = (SubLObject)NIL;
            if (NIL == f27721(var20, var30)) {
                var31 = (SubLObject)T;
                var23 = (SubLObject)ConsesLow.list((SubLObject)$ic47$, var28, var30);
                module0387.f27570(var28, var30);
            }
            else if (NIL == f27722(var20, var30) && NIL == module0387.f27516(var29)) {
                var31 = (SubLObject)T;
                var23 = (SubLObject)ConsesLow.list((SubLObject)$ic47$, var29, var30);
                module0387.f27570(var29, var30);
            }
            if (NIL != var31) {
                module0387.f27571(var27, var30);
            }
        }
        else if (NIL == module0387.f27469(f27716(var20))) {
            var23 = f27716(var20);
            var22 = f27732(module0387.f27568(f27716(var20)));
        }
        if (module0018.$g630$.getDynamicValue(var21).numGE((SubLObject)ONE_INTEGER)) {
            module0006.f218((SubLObject)T, (SubLObject)$ic48$, var20, var23, (SubLObject)NIL, (SubLObject)NIL, (SubLObject)NIL, (SubLObject)NIL, (SubLObject)NIL, (SubLObject)NIL);
        }
        return var22;
    }
    
    public static SubLObject f27730(final SubLObject var20) {
        SubLObject var21 = f27719(var20);
        SubLObject var22 = (SubLObject)NIL;
        var22 = var21.first();
        while (NIL != var21) {
            if (NIL != module0367.f25060(var22)) {
                return (SubLObject)T;
            }
            var21 = var21.rest();
            var22 = var21.first();
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f27731(final SubLObject var20) {
        SubLObject var21 = (SubLObject)ZERO_INTEGER;
        SubLObject var22 = f27719(var20);
        SubLObject var23 = (SubLObject)NIL;
        var23 = var22.first();
        while (NIL != var22) {
            var21 = Numbers.add(var21, module0387.f27567(var23));
            var22 = var22.rest();
            var23 = var22.first();
        }
        return var21;
    }
    
    public static SubLObject f27732(final SubLObject var60) {
        return (SubLObject)((NIL != var60) ? $ic42$ : $ic46$);
    }
    
    public static SubLObject f27733(final SubLObject var20) {
        SubLObject var21 = (SubLObject)NIL;
        if (NIL == var21) {
            SubLObject var22 = f27719(var20);
            SubLObject var23 = (SubLObject)NIL;
            var23 = var22.first();
            while (NIL == var21 && NIL != var22) {
                if (NIL != module0387.f27518(var23)) {
                    var21 = (SubLObject)T;
                }
                var22 = var22.rest();
                var23 = var22.first();
            }
        }
        return var21;
    }
    
    public static SubLObject f27734(final SubLObject var20, final SubLObject var44) {
        SubLObject var45 = (SubLObject)NIL;
        if (NIL == var45) {
            SubLObject var46 = f27719(var20);
            SubLObject var47 = (SubLObject)NIL;
            var47 = var46.first();
            while (NIL == var45 && NIL != var46) {
                if (NIL == f27726(var47)) {
                    var45 = (SubLObject)makeBoolean(NIL == module0384.f27273(var47, var44, (SubLObject)UNPROVIDED));
                }
                var46 = var46.rest();
                var47 = var46.first();
            }
        }
        return (SubLObject)makeBoolean(NIL == var45);
    }
    
    public static SubLObject f27735(final SubLObject var20, final SubLObject var44) {
        SubLObject var45 = (SubLObject)NIL;
        if (NIL == var45) {
            SubLObject var46 = f27719(var20);
            SubLObject var47 = (SubLObject)NIL;
            var47 = var46.first();
            while (NIL == var45 && NIL != var46) {
                if (NIL == f27726(var47)) {
                    var45 = (SubLObject)makeBoolean(NIL == module0384.f27281(var47, var44));
                }
                var46 = var46.rest();
                var47 = var46.first();
            }
        }
        return (SubLObject)makeBoolean(NIL == var45);
    }
    
    public static SubLObject f27736(final SubLObject var20, final SubLObject var65, final SubLObject var66, final SubLObject var67) {
        SubLObject var68 = (SubLObject)NIL;
        if (NIL == var68) {
            SubLObject var69 = f27719(var20);
            SubLObject var70 = (SubLObject)NIL;
            var70 = var69.first();
            while (NIL == var68 && NIL != var69) {
                if (NIL == f27726(var70)) {
                    var68 = (SubLObject)makeBoolean(NIL == module0384.f27275(var70, var65, var66, var67));
                }
                var69 = var69.rest();
                var70 = var69.first();
            }
        }
        return (SubLObject)makeBoolean(NIL == var68);
    }
    
    public static SubLObject f27737(final SubLObject var20, final SubLObject var65, final SubLObject var66, final SubLObject var67) {
        SubLObject var68 = (SubLObject)NIL;
        if (NIL == var68) {
            SubLObject var69 = f27719(var20);
            SubLObject var70 = (SubLObject)NIL;
            var70 = var69.first();
            while (NIL == var68 && NIL != var69) {
                if (NIL == f27726(var70)) {
                    var68 = (SubLObject)makeBoolean(NIL == module0384.f27283(var70, var65, var66, var67));
                }
                var69 = var69.rest();
                var70 = var69.first();
            }
        }
        return (SubLObject)makeBoolean(NIL == var68);
    }
    
    public static SubLObject f27738(final SubLObject var20) {
        SubLObject var21 = (SubLObject)ZERO_INTEGER;
        SubLObject var22 = f27719(var20);
        SubLObject var23 = (SubLObject)NIL;
        var23 = var22.first();
        while (NIL != var22) {
            var21 = Numbers.add(var21, module0387.f27515(var23));
            var22 = var22.rest();
            var23 = var22.first();
        }
        return var21;
    }
    
    public static SubLObject f27739(final SubLObject var20) {
        SubLObject var21 = f27719(var20);
        SubLObject var22 = (SubLObject)NIL;
        var22 = var21.first();
        while (NIL != var21) {
            module0387.f27557(var22);
            var21 = var21.rest();
            var22 = var21.first();
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f27740(final SubLObject var20, final SubLObject var68) {
        module0367.f25097(var20, var68);
        SubLObject var69 = f27719(var20);
        SubLObject var70 = (SubLObject)NIL;
        var70 = var69.first();
        while (NIL != var69) {
            module0387.f27553(var70, var68);
            var69 = var69.rest();
            var70 = var69.first();
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f27741(final SubLObject var20, final SubLObject var69) {
        module0367.f25097(var20, var69);
        SubLObject var70 = f27719(var20);
        SubLObject var71 = (SubLObject)NIL;
        var71 = var70.first();
        while (NIL != var70) {
            module0387.f27555(var71, var69);
            var70 = var70.rest();
            var71 = var70.first();
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f27742(final SubLObject var20) {
        return f27719(var20);
    }
    
    public static SubLObject f27743(final SubLObject var20, final SubLObject var44) {
        if (NIL == module0387.f27516(var20)) {
            if (NIL != f27744(var20, var44)) {
                f27745(var20, var44);
            }
            else if (NIL != f27746(var20, var44)) {
                f27745(var20, var44);
            }
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f27744(final SubLObject var20, final SubLObject var44) {
        final SubLObject var45 = module0363.f24530(var44);
        SubLObject var46;
        SubLObject var47;
        SubLObject var48;
        SubLObject var49;
        SubLObject var70_75;
        SubLObject var71_76;
        SubLObject var72_77;
        SubLObject var50;
        for (var46 = module0032.f1741(var45), var47 = (SubLObject)NIL, var47 = module0032.f1742(var46, var45); NIL == module0032.f1744(var46, var47); var47 = module0032.f1743(var47)) {
            var48 = module0032.f1745(var46, var47);
            if (NIL != module0032.f1746(var47, var48) && NIL != module0364.f24748(var48, (SubLObject)$ic60$)) {
                var49 = module0364.f24725(var48);
                var70_75 = module0363.f24530(var49);
                for (var71_76 = module0032.f1741(var70_75), var72_77 = (SubLObject)NIL, var72_77 = module0032.f1742(var71_76, var70_75); NIL == module0032.f1744(var71_76, var72_77); var72_77 = module0032.f1743(var72_77)) {
                    var50 = module0032.f1745(var71_76, var72_77);
                    if (NIL != module0032.f1746(var72_77, var50) && NIL != module0364.f24748(var50, (SubLObject)$ic61$) && NIL != module0381.f27056(var50, var48) && var49.eql(module0381.f27051(var50)) && NIL != f27747(var20, var44, var50)) {
                        return (SubLObject)T;
                    }
                }
            }
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f27747(final SubLObject var20, final SubLObject var44, final SubLObject var78) {
        if (NIL != f27748(var20, var78)) {
            return (SubLObject)T;
        }
        if (NIL != f27749(var20, var78)) {
            return (SubLObject)T;
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f27748(final SubLObject var20, final SubLObject var78) {
        return (SubLObject)makeBoolean(NIL != module0381.f27154(var78) || NIL != module0381.f27155(var78));
    }
    
    public static SubLObject f27749(final SubLObject var20, final SubLObject var79) {
        assert NIL != f27709(var20) : var20;
        assert NIL != module0364.f24699(var79) : var79;
        final SubLObject var80 = f27718(var20);
        return (SubLObject)makeBoolean(NIL != module0381.f27029(var79) && NIL != module0364.f24759(var79) && NIL != f27750(var80, var79) && NIL != f27720(var20, module0364.f24725(var79)) && $ic63$ == module0373.f26193(module0381.f27095(module0381.f27034(var79)), var80) && NIL != module0387.f27505(var79, var20));
    }
    
    public static SubLObject f27750(final SubLObject var48, final SubLObject var80) {
        final SubLObject var81 = module0373.f26152(var80);
        return module0387.f27572(var48, var81);
    }
    
    public static SubLObject f27746(final SubLObject var20, final SubLObject var44) {
        if (NIL != module0375.f26588(var44)) {
            final SubLObject var45 = module0363.f24530(var44);
            SubLObject var46;
            SubLObject var47;
            SubLObject var48;
            for (var46 = module0032.f1741(var45), var47 = (SubLObject)NIL, var47 = module0032.f1742(var46, var45); NIL == module0032.f1744(var46, var47); var47 = module0032.f1743(var47)) {
                var48 = module0032.f1745(var46, var47);
                if (NIL != module0032.f1746(var47, var48) && NIL != module0364.f24748(var48, (SubLObject)$ic64$) && NIL != f27720(var20, module0364.f24725(var48))) {
                    return (SubLObject)T;
                }
            }
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f27751(final SubLObject var20, final SubLObject var79) {
        if (NIL != module0378.f26860(var79)) {
            final SubLObject var80 = f27716(var20);
            final SubLObject var81 = module0378.f26873(var79);
            if (NIL != module0387.f27572(var80, var81)) {
                f27752(var20, var80, var81);
            }
            return (SubLObject)NIL;
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f27753(final SubLObject var20) {
        final SubLThread var21 = SubLProcess.currentSubLThread();
        return $g3266$.getDynamicValue(var21);
    }
    
    public static SubLObject f27754(final SubLObject var20, final SubLObject var48, final SubLObject var84) {
        if (NIL != module0363.f24478(var84)) {
            return f27755(var20, var48, var84);
        }
        if (NIL != module0364.f24699(var84)) {
            return f27752(var20, var48, var84);
        }
        if (NIL != module0365.f24819(var84)) {
            return f27756(var20, var48, var84);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f27755(final SubLObject var20, final SubLObject var48, final SubLObject var44) {
        module0367.f25099(var20, var44);
        if (NIL != module0406.f28343(var48)) {
            SubLObject var49 = module0363.f24527(var44);
            SubLObject var50;
            SubLObject var51;
            SubLObject var52;
            for (var50 = module0032.f1741(var49), var51 = (SubLObject)NIL, var51 = module0032.f1742(var50, var49); NIL == module0032.f1744(var50, var51); var51 = module0032.f1743(var51)) {
                var52 = module0032.f1745(var50, var51);
                if (NIL != module0032.f1746(var51, var52) && NIL != module0364.f24748(var52, (SubLObject)$ic68$)) {
                    f27757(var20, var52);
                }
            }
            var49 = module0363.f24527(var44);
            SubLObject var53;
            for (var50 = module0032.f1741(var49), var51 = (SubLObject)NIL, var51 = module0032.f1742(var50, var49); NIL == module0032.f1744(var50, var51); var51 = module0032.f1743(var51)) {
                var53 = module0032.f1745(var50, var51);
                if (NIL != module0032.f1746(var51, var53) && NIL != module0364.f24748(var53, (SubLObject)$ic69$)) {
                    f27758(var20, var53);
                }
            }
            var49 = module0363.f24527(var44);
            SubLObject var54;
            SubLObject var55;
            SubLObject var70_88;
            SubLObject var71_89;
            SubLObject var72_90;
            SubLObject var56;
            SubLObject var57;
            for (var50 = module0032.f1741(var49), var51 = (SubLObject)NIL, var51 = module0032.f1742(var50, var49); NIL == module0032.f1744(var50, var51); var51 = module0032.f1743(var51)) {
                var54 = module0032.f1745(var50, var51);
                if (NIL != module0032.f1746(var51, var54) && NIL != module0364.f24748(var54, (SubLObject)$ic61$) && NIL != f27749(var20, var54)) {
                    var55 = var54;
                    var70_88 = module0363.f24527(module0381.f27051(var55));
                    for (var71_89 = module0032.f1741(var70_88), var72_90 = (SubLObject)NIL, var72_90 = module0032.f1742(var71_89, var70_88); NIL == module0032.f1744(var71_89, var72_90); var72_90 = module0032.f1743(var72_90)) {
                        var56 = module0032.f1745(var71_89, var72_90);
                        if (NIL != module0032.f1746(var72_90, var56) && NIL != module0364.f24748(var56, (SubLObject)$ic60$) && NIL != module0381.f27133(var56, var55)) {
                            var57 = module0364.f24757(var56);
                            f27745(var20, var57);
                        }
                    }
                }
            }
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f27752(final SubLObject var20, final SubLObject var48, final SubLObject var79) {
        assert NIL != module0398.f28152(var48) : var48;
        assert NIL != module0364.f24699(var79) : var79;
        if (NIL != module0377.f26746(var79)) {
            if (NIL == f27759(var20, var79)) {
                SubLObject var80 = (SubLObject)ZERO_INTEGER;
                SubLObject var81 = f27760(var20, var79);
                SubLObject var82 = (SubLObject)NIL;
                var82 = var81.first();
                while (NIL != var81) {
                    if (NIL != f27745(var20, var82)) {
                        var80 = Numbers.add(var80, (SubLObject)ONE_INTEGER);
                    }
                    var81 = var81.rest();
                    var82 = var81.first();
                }
                return var80;
            }
            if (NIL != f27721(var20, module0364.f24725(var79))) {
                final SubLObject var83 = module0377.f26758(var79);
                return f27745(var20, var83);
            }
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f27759(final SubLObject var20, final SubLObject var83) {
        return Types.sublisp_null(f27761(var20, var83));
    }
    
    public static SubLObject f27761(final SubLObject var20, final SubLObject var83) {
        final SubLThread var84 = SubLProcess.currentSubLThread();
        final SubLObject var85 = f27716(var20);
        SubLObject var86 = (SubLObject)NIL;
        if (NIL == $g3267$.getDynamicValue(var84) || NIL == module0211.f13716(module0377.f26749(var83))) {
            final SubLObject var87 = module0364.f24725(var83);
            final SubLObject var88 = module0363.f24530(var87);
            SubLObject var89;
            SubLObject var90;
            SubLObject var91;
            SubLObject var99_100;
            SubLObject var92;
            SubLObject var70_102;
            SubLObject var71_103;
            SubLObject var72_104;
            SubLObject var93;
            SubLObject var94;
            SubLObject var95;
            SubLObject var96;
            for (var89 = module0032.f1741(var88), var90 = (SubLObject)NIL, var90 = module0032.f1742(var89, var88); NIL == module0032.f1744(var89, var90); var90 = module0032.f1743(var90)) {
                var91 = module0032.f1745(var89, var90);
                if (NIL != module0032.f1746(var90, var91) && NIL != module0364.f24748(var91, (SubLObject)$ic61$)) {
                    var99_100 = var91;
                    var92 = module0364.f24725(var99_100);
                    var70_102 = module0363.f24527(var92);
                    for (var71_103 = module0032.f1741(var70_102), var72_104 = (SubLObject)NIL, var72_104 = module0032.f1742(var71_103, var70_102); NIL == module0032.f1744(var71_103, var72_104); var72_104 = module0032.f1743(var72_104)) {
                        var93 = module0032.f1745(var71_103, var72_104);
                        if (NIL != module0032.f1746(var72_104, var93) && NIL != module0364.f24748(var93, (SubLObject)$ic71$) && NIL != module0378.f26866(var93, var99_100) && NIL != module0378.f26868(var93, var83)) {
                            var94 = module0378.f26870(var93);
                            if (NIL != module0363.f24586(var94, var85) || NIL != module0367.f25083(var94, var85)) {
                                var95 = module0378.f26872(var93);
                                var96 = module0381.f27034(var95);
                                if (NIL == $g3268$.getDynamicValue(var84) || NIL != module0387.f27572(var85, var96)) {
                                    var86 = (SubLObject)ConsesLow.cons(var94, var86);
                                }
                            }
                        }
                    }
                }
            }
        }
        return Sequences.nreverse(var86);
    }
    
    public static SubLObject f27760(final SubLObject var20, final SubLObject var83) {
        if (NIL != module0387.f27520(var83)) {
            return module0387.f27523(var83);
        }
        return f27761(var20, var83);
    }
    
    public static SubLObject f27745(final SubLObject var20, final SubLObject var44) {
        return module0387.f27570(f27715(var20), var44);
    }
    
    public static SubLObject f27756(final SubLObject var20, final SubLObject var48, final SubLObject var65) {
        if (NIL != module0373.f26151(var65)) {
            return f27762(var20, var48, var65);
        }
        if (NIL != module0380.f26969(var65)) {
            return f27763(var20, var48, var65);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f27762(final SubLObject var20, final SubLObject var48, final SubLObject var108) {
        final SubLThread var109 = SubLProcess.currentSubLThread();
        assert NIL != module0398.f28152(var48) : var48;
        assert NIL != module0373.f26151(var108) : var108;
        if (NIL != $g3269$.getDynamicValue(var109)) {
            final SubLObject var110 = module0373.f26153(var108);
            if (NIL != module0381.f27029(var110)) {
                final SubLObject var111 = var110;
                final SubLObject var112 = module0364.f24725(var111);
                final SubLObject var113 = module0363.f24527(var112);
                SubLObject var114;
                SubLObject var115;
                SubLObject var116;
                for (var114 = module0032.f1741(var113), var115 = (SubLObject)NIL, var115 = module0032.f1742(var114, var113); NIL == module0032.f1744(var114, var115); var115 = module0032.f1743(var115)) {
                    var116 = module0032.f1745(var114, var115);
                    if (NIL != module0032.f1746(var115, var116) && NIL != module0364.f24748(var116, (SubLObject)$ic71$) && NIL != module0378.f26866(var116, var111)) {
                        f27764(var20, var116);
                    }
                }
            }
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f27764(final SubLObject var20, final SubLObject var82) {
        final SubLObject var83 = f27716(var20);
        final SubLObject var84 = module0378.f26873(var82);
        if (NIL != module0387.f27572(var83, var84)) {
            return f27752(var20, var83, var84);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f27763(final SubLObject var20, final SubLObject var48, final SubLObject var109) {
        assert NIL != module0398.f28152(var48) : var48;
        assert NIL != module0380.f26969(var109) : var109;
        f27757(var20, module0380.f26972(var109));
        final SubLObject var110 = f27718(var20);
        if (NIL != module0367.f25083(module0365.f24850(var109), var110)) {
            return module0387.f27573(var110, var109);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f27757(final SubLObject var20, final SubLObject var85) {
        SubLObject var86 = (SubLObject)ZERO_INTEGER;
        if (NIL != f27720(var20, module0364.f24725(var85))) {
            SubLObject var87 = module0364.f24735(var85);
            SubLObject var88 = (SubLObject)NIL;
            var88 = var87.first();
            while (NIL != var87) {
                if (NIL != module0339.f22743((SubLObject)NIL, var85, var88)) {
                    final SubLObject var89 = module0364.f24736(var88);
                    final SubLObject var90 = module0364.f24737(var88);
                    if (NIL != f27722(var20, var89) && NIL != module0387.f27570(f27715(var20), var89)) {
                        var86 = Numbers.add(var86, (SubLObject)ONE_INTEGER);
                    }
                }
                var87 = var87.rest();
                var88 = var87.first();
            }
        }
        return var86;
    }
    
    public static SubLObject f27765(final SubLObject var20, final SubLObject var48, final SubLObject var114) {
        if (NIL != module0398.f28152(var48)) {
            return f27758(var20, module0383.f27238(var114));
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f27758(final SubLObject var20, final SubLObject var86) {
        if (NIL != f27720(var20, module0364.f24725(var86))) {
            final SubLObject var87 = module0364.f24757(var86);
            if (NIL != f27722(var20, var87)) {
                return f27745(var20, var87);
            }
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f27766(final SubLObject var20, final SubLObject var48, final SubLObject var109) {
        assert NIL != module0397.f28129(var48) : var48;
        return (SubLObject)makeBoolean(NIL == module0387.f27572(f27716(var20), var109));
    }
    
    public static SubLObject f27767(final SubLObject var20, final SubLObject var48, final SubLObject var65, final SubLObject var66, final SubLObject var67) {
        return f27736(var20, var65, var66, var67);
    }
    
    public static SubLObject f27768(final SubLObject var20, final SubLObject var48, final SubLObject var44, final SubLObject var115, final SubLObject var116) {
        f27769(var20, var44);
        if (NIL != module0397.f28129(var48) && NIL != module0384.f27297(var44, var48) && NIL == module0360.f23889(var115) && NIL != module0360.f23889(var116)) {
            f27770(var20, var44);
            return (SubLObject)$ic77$;
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f27769(final SubLObject var20, final SubLObject var44) {
        final SubLThread var45 = SubLProcess.currentSubLThread();
        SubLObject var46 = (SubLObject)$ic79$;
        SubLObject var47 = (SubLObject)$ic80$;
        SubLObject var48 = f27719(var20);
        SubLObject var49 = (SubLObject)NIL;
        var49 = var48.first();
        while (NIL != var48) {
            if (NIL == f27726(var49)) {
                final SubLObject var50 = module0367.f25144(var44, var49);
                if (NIL != module0360.f23883(var50, var46)) {
                    var46 = var50;
                }
                final SubLObject var52;
                final SubLObject var51 = var52 = module0367.f25147(var44, var49);
                if (!var52.eql((SubLObject)$ic80$)) {
                    if (var52.eql((SubLObject)$ic81$)) {
                        var47 = (SubLObject)$ic82$;
                    }
                    else if (var52.eql((SubLObject)$ic82$)) {
                        var47 = (SubLObject)$ic82$;
                    }
                }
            }
            var48 = var48.rest();
            var49 = var48.first();
        }
        if ($ic83$ == var46 && $ic80$ == var47) {
            var46 = (SubLObject)$ic84$;
        }
        final SubLObject var53 = module0360.f23885(var46, var47);
        module0367.f25148(var44, var20, var53);
        if (NIL != $g3270$.getDynamicValue(var45) && NIL != module0387.f27484(var20) && NIL == module0367.f25081(var20)) {
            f27771(var44, var47, var46);
        }
        return var53;
    }
    
    public static SubLObject f27771(final SubLObject var44, final SubLObject var118, final SubLObject var117) {
        if ($ic80$ == var118) {
            module0373.f26244(var44, (SubLObject)NIL, (SubLObject)$ic85$);
        }
        if ($ic84$ == var117) {
            module0373.f26391(var44);
            module0373.f26293(var44, (SubLObject)$ic85$);
        }
        if ($ic79$ == var117) {
            module0373.f26313(var44, (SubLObject)$ic85$);
        }
        return var44;
    }
    
    public static SubLObject f27770(final SubLObject var20, final SubLObject var44) {
        module0373.f26244(var44, (SubLObject)NIL, var20);
        SubLObject var45 = f27719(var20);
        SubLObject var46 = (SubLObject)NIL;
        var46 = var45.first();
        while (NIL != var45) {
            module0373.f26244(var44, (SubLObject)NIL, var46);
            var45 = var45.rest();
            var46 = var45.first();
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f27772(final SubLObject var20, final SubLObject var44) {
        SubLObject var45 = f27719(var20);
        SubLObject var46 = (SubLObject)NIL;
        var46 = var45.first();
        while (NIL != var45) {
            module0373.f26293(var44, var46);
            var45 = var45.rest();
            var46 = var45.first();
        }
        final SubLObject var47 = module0363.f24530(var44);
        SubLObject var48;
        SubLObject var49;
        SubLObject var50;
        for (var48 = module0032.f1741(var47), var49 = (SubLObject)NIL, var49 = module0032.f1742(var48, var47); NIL == module0032.f1744(var48, var49); var49 = module0032.f1743(var49)) {
            var50 = module0032.f1745(var48, var49);
            if (NIL != module0032.f1746(var49, var50) && NIL != module0364.f24748(var50, (SubLObject)$ic86$)) {
                f27772(var20, module0364.f24725(var50));
            }
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f27773() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0390", "f27698", "S#30812", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0390", "f27699", "S#30811", 1, 0, false);
        new $f27699$UnaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0390", "f27700", "S#30813", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0390", "f27701", "S#30814", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0390", "f27702", "S#30815", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0390", "f27703", "S#30816", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0390", "f27704", "S#30817", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0390", "f27705", "S#30818", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0390", "f27706", "S#30819", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0390", "f27707", "S#30820", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0390", "f27708", "S#30821", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0390", "f27709", "S#26792", 1, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0390", "f27710", "S#30822");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0390", "f27711", "S#30823");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0390", "f27712", "S#30824", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0390", "f27713", "S#30825", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0390", "f27714", "S#30826", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0390", "f27715", "S#30827", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0390", "f27716", "S#29289", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0390", "f27717", "S#30828", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0390", "f27718", "S#29330", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0390", "f27719", "S#30829", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0390", "f27720", "S#30830", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0390", "f27721", "S#30831", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0390", "f27722", "S#30832", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0390", "f27723", "S#30833", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0390", "f27724", "S#30834", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0390", "f27725", "S#30835", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0390", "f27726", "S#30836", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0390", "f27727", "S#30837", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0390", "f27728", "S#30838", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0390", "f27729", "S#30839", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0390", "f27730", "S#30840", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0390", "f27731", "S#30841", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0390", "f27732", "S#30842", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0390", "f27733", "S#30843", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0390", "f27734", "S#30844", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0390", "f27735", "S#30845", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0390", "f27736", "S#30846", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0390", "f27737", "S#30847", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0390", "f27738", "S#30848", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0390", "f27739", "S#30849", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0390", "f27740", "S#30850", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0390", "f27741", "S#30851", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0390", "f27742", "S#30852", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0390", "f27743", "S#30853", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0390", "f27744", "S#30854", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0390", "f27747", "S#30855", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0390", "f27748", "S#30856", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0390", "f27749", "S#30857", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0390", "f27750", "S#30858", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0390", "f27746", "S#30859", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0390", "f27751", "S#30860", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0390", "f27753", "S#30861", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0390", "f27754", "S#30862", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0390", "f27755", "S#30863", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0390", "f27752", "S#30864", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0390", "f27759", "S#30865", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0390", "f27761", "S#30866", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0390", "f27760", "S#30867", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0390", "f27745", "S#30868", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0390", "f27756", "S#30869", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0390", "f27762", "S#30870", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0390", "f27764", "S#30871", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0390", "f27763", "S#30872", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0390", "f27757", "S#30873", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0390", "f27765", "S#30874", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0390", "f27758", "S#30875", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0390", "f27766", "S#30876", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0390", "f27767", "S#30877", 5, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0390", "f27768", "S#30878", 5, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0390", "f27769", "S#30879", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0390", "f27771", "S#30880", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0390", "f27770", "S#30881", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0390", "f27772", "S#30882", 2, 0, false);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f27774() {
        $g3265$ = SubLFiles.defconstant("S#30883", (SubLObject)$ic2$);
        $g3266$ = SubLFiles.defvar("S#30884", module0360.f23935(module0347.$g2967$.getDynamicValue()));
        $g3267$ = SubLFiles.defparameter("S#30885", (SubLObject)T);
        $g3268$ = SubLFiles.defvar("S#30886", (SubLObject)T);
        $g3269$ = SubLFiles.defparameter("S#30887", (SubLObject)T);
        $g3270$ = SubLFiles.defparameter("S#30888", (SubLObject)NIL);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f27775() {
        module0387.f27534((SubLObject)$ic0$, (SubLObject)$ic1$);
        Structures.register_method(print_high.$print_object_method_table$.getGlobalValue(), $g3265$.getGlobalValue(), Symbols.symbol_function((SubLObject)$ic9$));
        SubLSpecialOperatorDeclarations.proclaim((SubLObject)$ic10$);
        Structures.def_csetf((SubLObject)$ic11$, (SubLObject)$ic12$);
        Structures.def_csetf((SubLObject)$ic13$, (SubLObject)$ic14$);
        Structures.def_csetf((SubLObject)$ic15$, (SubLObject)$ic16$);
        Equality.identity((SubLObject)$ic2$);
        Structures.register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), $g3265$.getGlobalValue(), Symbols.symbol_function((SubLObject)$ic25$));
        module0012.f419((SubLObject)$ic36$);
        module0012.f419((SubLObject)$ic41$);
        module0012.f419((SubLObject)$ic43$);
        module0012.f419((SubLObject)$ic49$);
        module0012.f419((SubLObject)$ic50$);
        module0012.f419((SubLObject)$ic51$);
        module0012.f419((SubLObject)$ic52$);
        module0012.f419((SubLObject)$ic53$);
        module0012.f419((SubLObject)$ic54$);
        module0012.f419((SubLObject)$ic55$);
        module0012.f419((SubLObject)$ic56$);
        module0012.f419((SubLObject)$ic57$);
        module0012.f419((SubLObject)$ic58$);
        module0012.f419((SubLObject)$ic59$);
        module0012.f419((SubLObject)$ic65$);
        module0012.f419((SubLObject)$ic66$);
        module0012.f419((SubLObject)$ic67$);
        module0012.f419((SubLObject)$ic75$);
        module0012.f419((SubLObject)$ic76$);
        module0012.f419((SubLObject)$ic78$);
        return (SubLObject)NIL;
    }
    
    public void declareFunctions() {
        f27773();
    }
    
    public void initializeVariables() {
        f27774();
    }
    
    public void runTopLevelForms() {
        f27775();
    }
    
    static {
        me = (SubLFile)new module0390();
        $g3265$ = null;
        $g3266$ = null;
        $g3267$ = null;
        $g3268$ = null;
        $g3269$ = null;
        $g3270$ = null;
        $ic0$ = makeKeyword("BALANCING");
        $ic1$ = ConsesLow.list(new SubLObject[] { makeKeyword("NAME"), makeString("Balancing Tactician"), makeKeyword("COMMENT"), makeString("A balancing tactician type which delegates to a new-root tactician,\n a transformation tactician, and a single removal tactician."), makeKeyword("CONSTRUCTOR"), makeSymbol("S#30825", "CYC"), makeKeyword("DONE?"), makeSymbol("S#30837", "CYC"), makeKeyword("DO-ONE-STEP"), makeSymbol("S#30838", "CYC"), makeKeyword("INITIAL-RELEVANT-STRATEGIES"), makeSymbol("S#30852", "CYC"), makeKeyword("INITIALIZE-PROPERTIES"), makeSymbol("S#30850", "CYC"), makeKeyword("UPDATE-PROPERTIES"), makeSymbol("S#30851", "CYC"), makeKeyword("INFERENCE-DYNAMIC-PROPERTIES-UPDATED"), makeSymbol("S#30849", "CYC"), makeKeyword("CONTINUATION-POSSIBLE?"), makeSymbol("S#30843", "CYC"), makeKeyword("THROW-AWAY-UNINTERESTING-SET-ASIDES"), makeSymbol("S#30848", "CYC"), makeKeyword("EARLY-REMOVAL-PRODUCTIVITY-LIMIT"), makeSymbol("S#30861", "CYC"), makeKeyword("POSSIBLY-ACTIVATE-PROBLEM"), makeSymbol("S#30853", "CYC"), makeKeyword("THROW-AWAY-PROBLEM"), makeSymbol("S#30844", "CYC"), makeKeyword("SET-ASIDE-PROBLEM"), makeSymbol("S#30845", "CYC"), makeKeyword("THROW-AWAY-TACTIC"), makeSymbol("S#30846", "CYC"), makeKeyword("SET-ASIDE-TACTIC"), makeSymbol("S#30847", "CYC"), makeKeyword("NEW-ARGUMENT-LINK"), makeSymbol("S#30860", "CYC"), makeKeyword("NEW-TACTIC"), makeSymbol("IGNORE"), makeKeyword("SPLIT-TACTICS-POSSIBLE"), makeSymbol("IGNORE"), makeKeyword("PROBLEM-COULD-BE-PENDING"), makeSymbol("IGNORE"), makeKeyword("LINK-HEAD-MOTIVATED?"), makeSymbol("FALSE"), makeKeyword("PROBLEM-NOTHING-TO-DO?"), makeSymbol("FALSE"), makeKeyword("SUBSTRATEGY-STRATEGEM-MOTIVATED"), makeSymbol("S#30862", "CYC"), makeKeyword("SUBSTRATEGY-TOTALLY-THROW-AWAY-TACTIC"), makeSymbol("S#30877", "CYC"), makeKeyword("SUBSTRATEGY-ALLOW-SPLIT-TACTIC-SET-ASIDE-WRT-REMOVAL"), makeSymbol("S#30876", "CYC"), makeKeyword("SUBSTRATEGY-PROBLEM-STATUS-CHANGE"), makeSymbol("S#30878", "CYC") });
        $ic2$ = makeSymbol("S#30810", "CYC");
        $ic3$ = makeSymbol("S#30811", "CYC");
        $ic4$ = ConsesLow.list((SubLObject)makeSymbol("S#30889", "CYC"), (SubLObject)makeSymbol("S#30890", "CYC"), (SubLObject)makeSymbol("S#30891", "CYC"));
        $ic5$ = ConsesLow.list((SubLObject)makeKeyword("NEW-ROOT-SUBSTRATEGY"), (SubLObject)makeKeyword("TRANSFORMATION-SUBSTRATEGY"), (SubLObject)makeKeyword("REMOVAL-SUBSTRATEGIES"));
        $ic6$ = ConsesLow.list((SubLObject)makeSymbol("S#30813", "CYC"), (SubLObject)makeSymbol("S#30814", "CYC"), (SubLObject)makeSymbol("S#30815", "CYC"));
        $ic7$ = ConsesLow.list((SubLObject)makeSymbol("S#30816", "CYC"), (SubLObject)makeSymbol("S#30817", "CYC"), (SubLObject)makeSymbol("S#30818", "CYC"));
        $ic8$ = makeSymbol("DEFAULT-STRUCT-PRINT-FUNCTION");
        $ic9$ = makeSymbol("S#30812", "CYC");
        $ic10$ = ConsesLow.list((SubLObject)makeSymbol("OPTIMIZE-FUNCALL"), (SubLObject)makeSymbol("S#30811", "CYC"));
        $ic11$ = makeSymbol("S#30813", "CYC");
        $ic12$ = makeSymbol("S#30816", "CYC");
        $ic13$ = makeSymbol("S#30814", "CYC");
        $ic14$ = makeSymbol("S#30817", "CYC");
        $ic15$ = makeSymbol("S#30815", "CYC");
        $ic16$ = makeSymbol("S#30818", "CYC");
        $ic17$ = makeKeyword("NEW-ROOT-SUBSTRATEGY");
        $ic18$ = makeKeyword("TRANSFORMATION-SUBSTRATEGY");
        $ic19$ = makeKeyword("REMOVAL-SUBSTRATEGIES");
        $ic20$ = makeString("Invalid slot ~S for construction function");
        $ic21$ = makeKeyword("BEGIN");
        $ic22$ = makeSymbol("S#30819", "CYC");
        $ic23$ = makeKeyword("SLOT");
        $ic24$ = makeKeyword("END");
        $ic25$ = makeSymbol("S#30821", "CYC");
        $ic26$ = ConsesLow.list((SubLObject)makeKeyword("BALANCING"), (SubLObject)makeKeyword("STRIPING"), (SubLObject)makeKeyword("ABDUCTIVE"));
        $ic27$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#30892", "CYC"), (SubLObject)makeSymbol("S#8816", "CYC"), (SubLObject)makeSymbol("&KEY"), (SubLObject)makeSymbol("S#127", "CYC")), (SubLObject)makeSymbol("&BODY"), (SubLObject)makeSymbol("S#5", "CYC"));
        $ic28$ = ConsesLow.list((SubLObject)makeKeyword("DONE"));
        $ic29$ = makeKeyword("ALLOW-OTHER-KEYS");
        $ic30$ = makeKeyword("DONE");
        $ic31$ = makeSymbol("CSOME");
        $ic32$ = makeSymbol("S#30829", "CYC");
        $ic33$ = makeSymbol("S#30822", "CYC");
        $ic34$ = makeSymbol("PUNLESS");
        $ic35$ = makeSymbol("S#30836", "CYC");
        $ic36$ = makeSymbol("S#30825", "CYC");
        $ic37$ = makeKeyword("NEW-ROOT");
        $ic38$ = makeKeyword("TRANSFORMATION");
        $ic39$ = makeKeyword("REMOVAL");
        $ic40$ = makeSymbol("S#26792", "CYC");
        $ic41$ = makeSymbol("S#30837", "CYC");
        $ic42$ = makeKeyword("UNINTERESTING");
        $ic43$ = makeSymbol("S#30838", "CYC");
        $ic44$ = makeKeyword("RECONSIDER-SET-ASIDES");
        $ic45$ = makeKeyword("PROPAGATE-ANSWER-LINK");
        $ic46$ = makeKeyword("INTERESTING");
        $ic47$ = makeKeyword("MOTIVATION");
        $ic48$ = makeString("~a do-one-step: ~a~%");
        $ic49$ = makeSymbol("S#30843", "CYC");
        $ic50$ = makeSymbol("S#30844", "CYC");
        $ic51$ = makeSymbol("S#30845", "CYC");
        $ic52$ = makeSymbol("S#30846", "CYC");
        $ic53$ = makeSymbol("S#30847", "CYC");
        $ic54$ = makeSymbol("S#30848", "CYC");
        $ic55$ = makeSymbol("S#30849", "CYC");
        $ic56$ = makeSymbol("S#30850", "CYC");
        $ic57$ = makeSymbol("S#30851", "CYC");
        $ic58$ = makeSymbol("S#30852", "CYC");
        $ic59$ = makeSymbol("S#30853", "CYC");
        $ic60$ = makeKeyword("RESTRICTION");
        $ic61$ = makeKeyword("JOIN-ORDERED");
        $ic62$ = makeSymbol("S#27381", "CYC");
        $ic63$ = makeKeyword("COMPLETE");
        $ic64$ = makeKeyword("SIMPLIFICATION");
        $ic65$ = makeSymbol("S#30860", "CYC");
        $ic66$ = makeSymbol("S#30861", "CYC");
        $ic67$ = makeSymbol("S#30862", "CYC");
        $ic68$ = makeKeyword("SPLIT");
        $ic69$ = makeKeyword("UNION");
        $ic70$ = makeSymbol("S#30356", "CYC");
        $ic71$ = makeKeyword("RESIDUAL-TRANSFORMATION");
        $ic72$ = makeSymbol("S#27343", "CYC");
        $ic73$ = makeSymbol("S#27351", "CYC");
        $ic74$ = makeSymbol("S#29327", "CYC");
        $ic75$ = makeSymbol("S#30876", "CYC");
        $ic76$ = makeSymbol("S#30877", "CYC");
        $ic77$ = makeKeyword("COMPLETE-REMOVAL-TACTIC-NO-GOOD");
        $ic78$ = makeSymbol("S#30878", "CYC");
        $ic79$ = makeKeyword("FINISHED");
        $ic80$ = makeKeyword("NO-GOOD");
        $ic81$ = makeKeyword("GOOD");
        $ic82$ = makeKeyword("NEUTRAL");
        $ic83$ = makeKeyword("POSSIBLE");
        $ic84$ = makeKeyword("PENDING");
        $ic85$ = makeKeyword("TACTICAL");
        $ic86$ = makeKeyword("CONNECTED-CONJUNCTION");
    }
    
    public static final class $sX30810_native extends SubLStructNative
    {
        public SubLObject $new_root_substrategy;
        public SubLObject $transformation_substrategy;
        public SubLObject $removal_substrategies;
        public static final SubLStructDeclNative structDecl;
        
        public $sX30810_native() {
            this.$new_root_substrategy = (SubLObject)CommonSymbols.NIL;
            this.$transformation_substrategy = (SubLObject)CommonSymbols.NIL;
            this.$removal_substrategies = (SubLObject)CommonSymbols.NIL;
        }
        
        public SubLStructDecl getStructDecl() {
            return (SstructDecl;
        }
        
        public SubLObject getField2() {
            return this.$new_root_substrategy;
        }
        
        public SubLObject getField3() {
            return this.$transformation_substrategy;
        }
        
        public SubLObject getField4() {
            return this.$removal_substrategies;
        }
        
        public SubLObject setField2(final SubLObject value) {
            return this.$new_root_substrategy = value;
        }
        
        public SubLObject setField3(final SubLObject value) {
            return this.$transformation_substrategy = value;
        }
        
        public SubLObject setField4(final SubLObject value) {
            return this.$removal_substrategies = value;
        }
        
        static {
            structDecl = Structures.makeStructDeclNative((Class)$sX30810_native.class, $ic2$, $ic3$, $ic4$, $ic5$, new String[] { "$new_root_substrategy", "$transformation_substrategy", "$removal_substrategies" }, $ic6$, $ic7$, $ic8$);
        }
    }
    
    public static final class $f27699$UnaryFunction extends UnaryFunction
    {
        public $f27699$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("S#30811"));
        }
        
        public SubLObject processItem(final SubLObject var3) {
            return f27699(var3);
        }
    }
}

/*
	DECOMPILATION REPORT

	Decompiled from: G:\opt\CYC_JRTL_with_CommonLisp\platform\lib\cyc-oc4.0-unzipped/com/cyc/cycjava/cycl/class
	Total time: 340 ms
	
	Decompiled with Procyon 0.5.32.
*/