package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Mapping;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Vectors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class module0759 extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.module0759";
    public static final String myFingerPrint = "2003141b96ff84b6546b117288d912b4fc6ce620140e59ddd98cc00e25135172";
    private static final SubLSymbol $ic0$;
    private static final SubLSymbol $ic1$;
    private static final SubLSymbol $ic2$;
    private static final SubLSymbol $ic3$;
    private static final SubLObject $ic4$;
    private static final SubLSymbol $ic5$;
    private static final SubLSymbol $ic6$;
    private static final SubLSymbol $ic7$;
    private static final SubLSymbol $ic8$;
    private static final SubLObject $ic9$;
    private static final SubLSymbol $ic10$;
    private static final SubLSymbol $ic11$;
    private static final SubLSymbol $ic12$;
    private static final SubLList $ic13$;
    private static final SubLSymbol $ic14$;
    private static final SubLSymbol $ic15$;
    private static final SubLSymbol $ic16$;
    private static final SubLSymbol $ic17$;
    private static final SubLString $ic18$;
    private static final SubLString $ic19$;
    private static final SubLString $ic20$;
    private static final SubLString $ic21$;
    private static final SubLSymbol $ic22$;
    private static final SubLString $ic23$;
    
    public static SubLObject f48038(final SubLObject var1) {
        return (SubLObject)makeBoolean(NIL != module0756.f47497(var1, (SubLObject)UNPROVIDED) && module0743.f45993(var1) == $ic0$);
    }
    
    public static SubLObject f48039(SubLObject var2, SubLObject var3, SubLObject var4) {
        if (var2 == UNPROVIDED) {
            var2 = (SubLObject)NIL;
        }
        if (var3 == UNPROVIDED) {
            var3 = (SubLObject)$ic1$;
        }
        if (var4 == UNPROVIDED) {
            var4 = (SubLObject)$ic2$;
        }
        final SubLObject var5 = module0749.f46494((SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        module0743.f46000(var5, (SubLObject)$ic0$);
        if (NIL != var3) {
            f48040(var5, var3);
        }
        f48041(var5, var2);
        f48042(var5, var4, (SubLObject)UNPROVIDED);
        module0743.f46016(var5, (SubLObject)ConsesLow.list((SubLObject)$ic3$, $ic4$));
        return var5;
    }
    
    public static SubLObject f48043(final SubLObject var6, SubLObject var7) {
        if (var7 == UNPROVIDED) {
            var7 = (SubLObject)NIL;
        }
        if (NIL == var7) {
            var7 = f48039((SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        }
        if (var6.equalp(var7)) {
            return var7;
        }
        f48044(var7, f48045(var6));
        if (NIL != module0756.f47516(var6)) {
            SubLObject var8 = (SubLObject)NIL;
            SubLObject var9 = (SubLObject)ZERO_INTEGER;
            if (module0743.f45996(var6).isVector()) {
                final SubLObject var10 = module0743.f45996(var6);
                final SubLObject var11 = (SubLObject)NIL;
                SubLObject var12;
                SubLObject var13;
                SubLObject var14;
                SubLObject var15;
                SubLObject var16;
                for (var12 = Sequences.length(var10), var13 = (SubLObject)NIL, var13 = (SubLObject)ZERO_INTEGER; var13.numL(var12); var13 = Numbers.add(var13, (SubLObject)ONE_INTEGER)) {
                    var14 = ((NIL != var11) ? Numbers.subtract(var12, var13, (SubLObject)ONE_INTEGER) : var13);
                    var15 = Vectors.aref(var10, var14);
                    var16 = ((NIL != f48038(var15)) ? f48043(var15, (SubLObject)UNPROVIDED) : var15);
                    var8 = (SubLObject)ConsesLow.cons(var16, var8);
                    var9 = Numbers.add(var9, (SubLObject)ONE_INTEGER);
                }
            }
            module0756.f47507(var7, Sequences.nreverse(var8), (SubLObject)UNPROVIDED);
        }
        else {
            module0756.f47820(var7, (SubLObject)NIL);
        }
        f48041(var7, f48046(var6));
        module0756.f47508(var7, module0756.f47482(var6), (SubLObject)NIL);
        f48040(var7, f48047(var6));
        f48048(var7, f48049(var6));
        module0756.f47533(var7, module0756.f47477(var6));
        module0756.f47464(var7, module0756.f47511(var6));
        return var7;
    }
    
    public static SubLObject f48040(final SubLObject var5, SubLObject var3) {
        if (var3 == $ic5$) {
            var3 = (SubLObject)$ic1$;
        }
        return module0749.f46424(var5, (SubLObject)$ic6$, var3);
    }
    
    public static SubLObject f48047(final SubLObject var5) {
        return module0749.f46418(var5, (SubLObject)$ic6$, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f48050(final SubLObject var5, final SubLObject var17, SubLObject var18) {
        if (var18 == UNPROVIDED) {
            var18 = (SubLObject)T;
        }
        module0756.f47783(var5, var17, var18);
        return var5;
    }
    
    public static SubLObject f48042(final SubLObject var5, final SubLObject var4, SubLObject var18) {
        if (var18 == UNPROVIDED) {
            var18 = (SubLObject)T;
        }
        module0756.f47784(var5, var4, var18);
        return var5;
    }
    
    public static SubLObject f48051(final SubLObject var5) {
        return module0756.f47691(var5);
    }
    
    public static SubLObject f48052(final SubLObject var5) {
        return module0756.f47488(var5, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f48053(final SubLObject var5, final SubLObject var19) {
        module0756.f47723(var5, var19);
        return var5;
    }
    
    public static SubLObject f48054(final SubLObject var5, SubLObject var20) {
        if (var20 == UNPROVIDED) {
            var20 = (SubLObject)T;
        }
        return module0756.f47480(var5, var20);
    }
    
    public static SubLObject f48048(final SubLObject var5, final SubLObject var21) {
        module0756.f47509(var5, var21);
        return var5;
    }
    
    public static SubLObject f48049(final SubLObject var5) {
        return module0756.f47510(var5);
    }
    
    public static SubLObject f48055(final SubLObject var5, final SubLObject var22) {
        module0756.f47500(var5, var22, (SubLObject)UNPROVIDED);
        return var5;
    }
    
    public static SubLObject f48056(final SubLObject var5) {
        return module0756.f47627(var5);
    }
    
    public static SubLObject f48044(final SubLObject var5, final SubLObject var23) {
        module0756.f47501(var5, var23, (SubLObject)UNPROVIDED);
        return var5;
    }
    
    public static SubLObject f48045(final SubLObject var5) {
        return module0756.f47467(var5);
    }
    
    public static SubLObject f48041(final SubLObject var5, final SubLObject var2) {
        module0756.f47465(var5, var2);
        return var5;
    }
    
    public static SubLObject f48046(final SubLObject var5) {
        return module0756.f47487(var5, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f48057(final SubLObject var5, final SubLObject var24) {
        return module0749.f46424(var5, (SubLObject)$ic7$, var24);
    }
    
    public static SubLObject f48058(final SubLObject var5) {
        return module0749.f46418(var5, (SubLObject)$ic7$, module0756.f47746());
    }
    
    public static SubLObject f48059(final SubLObject var5) {
        SubLObject var6 = module0756.f47526(var5);
        if (NIL == var6) {
            final SubLObject var7 = f48046(var5);
            final SubLObject var8 = f48058(var5);
            SubLObject var9 = (SubLObject)NIL;
            if (NIL != module0206.f13425(var7) && NIL != module0756.f47694(var8)) {
                SubLObject var10 = (SubLObject)ZERO_INTEGER;
                final SubLObject var11 = module0205.f13207(var7, (SubLObject)$ic8$);
                SubLObject var12;
                SubLObject var13;
                for (var12 = (SubLObject)NIL, var12 = var11; NIL == var9 && NIL != var12; var12 = var12.rest()) {
                    var13 = var12.first();
                    var10 = Numbers.add(var10, (SubLObject)ONE_INTEGER);
                    if (var13.equal(var8)) {
                        if (NIL != module0004.f106(var6)) {
                            var9 = (SubLObject)T;
                            var6 = (SubLObject)NIL;
                        }
                        else {
                            var6 = var10;
                        }
                    }
                }
            }
        }
        return var6;
    }
    
    public static SubLObject f48060(final SubLObject var5) {
        return module0756.f47479(var5);
    }
    
    public static SubLObject f48061(final SubLObject var5) {
        final SubLObject var6 = f48062(var5);
        final SubLObject var7 = var6.first();
        return (SubLObject)((NIL != var7 && NIL != module0756.f47591(var7)) ? var7 : NIL);
    }
    
    public static SubLObject f48062(final SubLObject var5) {
        if (NIL == module0756.f47478(var5)) {
            return (SubLObject)NIL;
        }
        SubLObject var6;
        SubLObject var7;
        for (var6 = module0756.f47515(var5), var7 = var6.first(); NIL != module0756.f47478(var7) && (NIL != module0756.f47652(var7) || ONE_INTEGER.eql(module0756.f47588(module0756.f47633(var7)))); var7 = var6.first()) {
            var6 = module0756.f47515(var7);
        }
        return (SubLObject)((NIL != module0756.f47591(var7)) ? var6 : NIL);
    }
    
    public static SubLObject f48063(final SubLObject var5) {
        final SubLObject var6 = f48062(var5);
        final SubLObject var7 = (SubLObject)((NIL != var6) ? module0756.f47633(var6.first()) : NIL);
        final SubLObject var8 = (SubLObject)((NIL != var7) ? module0756.f47633(var7) : NIL);
        SubLObject var9 = (SubLObject)NIL;
        if (NIL != var8) {
            SubLObject var10 = (SubLObject)NIL;
            SubLObject var11 = (SubLObject)ZERO_INTEGER;
            if (module0743.f45996(var8).isVector()) {
                final SubLObject var12 = module0743.f45996(var8);
                final SubLObject var13 = (SubLObject)NIL;
                SubLObject var14;
                SubLObject var15;
                SubLObject var16;
                SubLObject var17;
                for (var14 = Sequences.length(var12), var15 = (SubLObject)NIL, var15 = (SubLObject)ZERO_INTEGER; var15.numL(var14); var15 = Numbers.add(var15, (SubLObject)ONE_INTEGER)) {
                    var16 = ((NIL != var13) ? Numbers.subtract(var14, var15, (SubLObject)ONE_INTEGER) : var15);
                    var17 = Vectors.aref(var12, var16);
                    if (NIL != var10) {
                        var9 = (SubLObject)ConsesLow.cons(var17, var9);
                    }
                    else if (var17.eql(var7)) {
                        var10 = (SubLObject)T;
                    }
                    var11 = Numbers.add(var11, (SubLObject)ONE_INTEGER);
                }
            }
        }
        return Sequences.nreverse(var9);
    }
    
    public static SubLObject f48064(final SubLObject var40, final SubLObject var41) {
        final SubLObject var42 = f48061(var40);
        final SubLObject var43 = f48061(var41);
        return (SubLObject)makeBoolean(NIL != var42 && NIL != var43 && NIL != module0581.f35663(module0756.f47480(var42, (SubLObject)NIL), module0756.f47480(var43, (SubLObject)NIL)));
    }
    
    public static SubLObject f48065(final SubLObject var44, final SubLObject var45) {
        if (NIL != module0581.f35663(f48054(var44, (SubLObject)UNPROVIDED), f48054(var45, (SubLObject)UNPROVIDED))) {
            return (SubLObject)T;
        }
        if (NIL == module0035.f2004(f48062(var44), f48062(var45))) {
            return (SubLObject)NIL;
        }
        SubLObject var46 = (SubLObject)NIL;
        SubLObject var47_48 = (SubLObject)NIL;
        SubLObject var47 = (SubLObject)NIL;
        SubLObject var50_51 = (SubLObject)NIL;
        var46 = f48062(var44);
        var47_48 = var46.first();
        var47 = f48062(var45);
        var50_51 = var47.first();
        while (NIL != var47 || NIL != var46) {
            final SubLObject var48 = module0756.f47480(var47_48, (SubLObject)UNPROVIDED);
            final SubLObject var49 = module0756.f47480(var50_51, (SubLObject)UNPROVIDED);
            if (NIL == module0581.f35663(var48, var49) && NIL == module0754.f47343(var48, $ic9$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED) && NIL == module0754.f47343(var49, $ic9$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)) {
                return (SubLObject)NIL;
            }
            var46 = var46.rest();
            var47_48 = var46.first();
            var47 = var47.rest();
            var50_51 = var47.first();
        }
        return module0581.f35663(module0581.f35672(Mapping.mapcar((SubLObject)$ic10$, f48063(var44))), module0581.f35672(Mapping.mapcar((SubLObject)$ic10$, f48063(var45))));
    }
    
    public static SubLObject f48066(final SubLObject var5, SubLObject var54, SubLObject var55, SubLObject var56) {
        if (var54 == UNPROVIDED) {
            var54 = module0579.$g4260$.getDynamicValue();
        }
        if (var55 == UNPROVIDED) {
            var55 = module0579.$g4262$.getDynamicValue();
        }
        if (var56 == UNPROVIDED) {
            var56 = (SubLObject)$ic11$;
        }
        final SubLThread var57 = SubLProcess.currentSubLThread();
        if (NIL == module0756.f47479(var5)) {
            final SubLObject var58 = module0579.$g4252$.currentBinding(var57);
            try {
                module0579.$g4252$.bind(var5, var57);
                final SubLObject var59 = f48047(var5);
                final SubLObject var60 = f48046(var5);
                final SubLObject var61 = f48052(var5);
                final SubLObject var62 = f48059(var5);
                SubLObject var63 = (SubLObject)NIL;
                SubLObject var64 = (SubLObject)NIL;
                SubLObject var65 = (SubLObject)NIL;
                SubLObject var66 = (SubLObject)NIL;
                SubLObject var67 = (SubLObject)NIL;
                if (NIL == module0756.f47476(var60)) {
                    final SubLObject var68 = var59;
                    if (var68.eql((SubLObject)$ic1$)) {
                        module0770.f49065(var5, var54, var55, var56);
                        if (NIL != f48060(var5)) {
                            var66 = module0758.f47886(module0756.f47467(var5), var59);
                            var64 = f48051(var5);
                            var63 = f48054(var5, (SubLObject)UNPROVIDED);
                            var65 = f48049(var5);
                            var67 = f48056(var5);
                            f48044(var5, var66);
                        }
                    }
                    else if (var68.eql((SubLObject)$ic12$)) {
                        var57.resetMultipleValues();
                        final SubLObject var65_66 = module0770.f49095(var60, (SubLObject)$ic13$, var54, var55, var56, var62);
                        final SubLObject var67_68 = var57.secondMultipleValue();
                        final SubLObject var69_70 = var57.thirdMultipleValue();
                        final SubLObject var71_72 = var57.fourthMultipleValue();
                        final SubLObject var73_74 = var57.fifthMultipleValue();
                        var57.resetMultipleValues();
                        var63 = var65_66;
                        var64 = var67_68;
                        var65 = var69_70;
                        var66 = var71_72;
                        var67 = var73_74;
                    }
                    else if (var68.eql((SubLObject)$ic14$) || var68.eql((SubLObject)$ic15$)) {
                        var57.resetMultipleValues();
                        final SubLObject var75_76 = module0772.f49137(var60, var54, var55, var56, var61);
                        final SubLObject var77_78 = var57.secondMultipleValue();
                        final SubLObject var79_80 = var57.thirdMultipleValue();
                        final SubLObject var81_82 = var57.fourthMultipleValue();
                        final SubLObject var83_84 = var57.fifthMultipleValue();
                        var57.resetMultipleValues();
                        var63 = var75_76;
                        var64 = var77_78;
                        var65 = var79_80;
                        var66 = var81_82;
                        var67 = var83_84;
                    }
                    else if (var68.eql((SubLObject)$ic16$)) {
                        var57.resetMultipleValues();
                        final SubLObject var85_86 = module0770.f49050(var60, var61, (SubLObject)NIL, var54, var55, var56, (SubLObject)NIL, var62);
                        final SubLObject var87_88 = var57.secondMultipleValue();
                        final SubLObject var89_90 = var57.thirdMultipleValue();
                        final SubLObject var91_92 = var57.fourthMultipleValue();
                        final SubLObject var93_94 = var57.fifthMultipleValue();
                        var57.resetMultipleValues();
                        var63 = var85_86;
                        var64 = var87_88;
                        var65 = var89_90;
                        var66 = var91_92;
                        var67 = var93_94;
                    }
                    if (NIL != module0209.f13550(var63)) {
                        var63 = module0581.f35652(var63);
                    }
                    if (NIL != module0581.f35648(var63)) {
                        if (NIL != var64) {
                            f48050(var5, var64, (SubLObject)UNPROVIDED);
                        }
                        f48048(var5, var65);
                        if (NIL != module0004.f106(var67)) {
                            f48055(var5, var67);
                        }
                        final SubLObject var58_95 = module0579.$g4305$.currentBinding(var57);
                        try {
                            module0579.$g4305$.bind((SubLObject)makeBoolean(NIL != module0579.f35497() && NIL == Sequences.find_if((SubLObject)$ic17$, var65, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)), var57);
                            f48044(var5, var66);
                        }
                        finally {
                            module0579.$g4305$.rebind(var58_95, var57);
                        }
                        module0756.f47608(var5);
                    }
                }
            }
            finally {
                module0579.$g4252$.rebind(var58, var57);
            }
        }
        return f48054(var5, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f48067(final SubLObject var96) {
        final SubLThread var97 = SubLProcess.currentSubLThread();
        final SubLObject var98 = module0756.f47484(var96, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        module0756.f47675(module0579.$g4252$.getDynamicValue(var97), var98);
        return var98;
    }
    
    public static SubLObject f48068(final SubLObject var40, final SubLObject var41) {
        if (NIL == module0751.f46661((SubLObject)UNPROVIDED)) {
            final SubLObject var42 = Sequences.cconcatenate((SubLObject)$ic18$, new SubLObject[] { module0006.f205((SubLObject)ONE_INTEGER), $ic19$, module0006.f203((SubLObject)$ic20$) });
            module0578.f35476(var42, (SubLObject)ConsesLow.list(EMPTY_SUBL_OBJECT_ARRAY));
        }
        final SubLObject var43 = f48062(var41).rest();
        final SubLObject var44 = (SubLObject)$ic21$;
        final SubLObject var45 = Sequences.find(var44, f48062(var40).rest(), Symbols.symbol_function((SubLObject)$ic22$), Symbols.symbol_function((SubLObject)$ic10$), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        if (NIL != var45) {
            module0756.f47723(var45, (SubLObject)$ic23$);
        }
        f48069(module0749.f46494(var44, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED), var40);
        SubLObject var46 = var43;
        SubLObject var47 = (SubLObject)NIL;
        var47 = var46.first();
        while (NIL != var46) {
            f48069(var47, var40);
            var46 = var46.rest();
            var47 = var46.first();
        }
        var46 = f48063(var41);
        var47 = (SubLObject)NIL;
        var47 = var46.first();
        while (NIL != var46) {
            f48069(var47, var40);
            var46 = var46.rest();
            var47 = var46.first();
        }
        module0756.f47535(var40);
        f48066(var40, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        return module0581.f35685(f48054(var40, (SubLObject)UNPROVIDED));
    }
    
    public static SubLObject f48069(final SubLObject var16, final SubLObject var5) {
        final SubLObject var17 = module0756.f47633(f48061(var5));
        module0756.f47836(var16, var17);
        module0756.f47535(var17);
        return var5;
    }
    
    public static SubLObject f48070() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0759", "f48038", "S#51928", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0759", "f48039", "S#52512", 0, 3, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0759", "f48043", "S#51929", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0759", "f48040", "S#52513", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0759", "f48047", "S#52514", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0759", "f48050", "S#52515", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0759", "f48042", "S#52516", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0759", "f48051", "S#52517", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0759", "f48052", "S#52518", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0759", "f48053", "S#52519", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0759", "f48054", "S#52520", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0759", "f48048", "S#52521", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0759", "f48049", "S#52522", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0759", "f48055", "S#52523", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0759", "f48056", "S#52524", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0759", "f48044", "S#52525", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0759", "f48045", "S#52526", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0759", "f48041", "S#52527", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0759", "f48046", "S#52528", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0759", "f48057", "S#52529", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0759", "f48058", "S#52530", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0759", "f48059", "S#52531", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0759", "f48060", "S#52532", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0759", "f48061", "S#52533", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0759", "f48062", "S#52534", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0759", "f48063", "S#52535", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0759", "f48064", "S#52536", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0759", "f48065", "S#52537", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0759", "f48066", "S#52538", 1, 3, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0759", "f48067", "S#52539", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0759", "f48068", "S#52540", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0759", "f48069", "S#52541", 2, 0, false);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f48071() {
        return (SubLObject)NIL;
    }
    
    public static SubLObject f48072() {
        return (SubLObject)NIL;
    }
    
    public void declareFunctions() {
        f48070();
    }
    
    public void initializeVariables() {
        f48071();
    }
    
    public void runTopLevelForms() {
        f48072();
    }
    
    static {
        me = (SubLFile)new module0759();
        $ic0$ = makeKeyword("S");
        $ic1$ = makeKeyword("DECLARATIVE");
        $ic2$ = makeKeyword("ANY");
        $ic3$ = makeKeyword("CATEGORY");
        $ic4$ = constant_handles_oc.f8479((SubLObject)makeString("NLSentence"));
        $ic5$ = makeKeyword("DEFAULT");
        $ic6$ = makeKeyword("FORCE");
        $ic7$ = makeKeyword("TOPIC");
        $ic8$ = makeKeyword("IGNORE");
        $ic9$ = constant_handles_oc.f8479((SubLObject)makeString("Pronoun"));
        $ic10$ = makeSymbol("S#51739", "CYC");
        $ic11$ = makeKeyword("TEXT");
        $ic12$ = makeKeyword("IMPERATIVE");
        $ic13$ = ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("infinitive")));
        $ic14$ = makeKeyword("INTERROGATIVE");
        $ic15$ = makeKeyword("QUESTION");
        $ic16$ = makeKeyword("NONE");
        $ic17$ = makeSymbol("S#52542", "CYC");
        $ic18$ = makeString("(PPH error level ");
        $ic19$ = makeString(") ");
        $ic20$ = makeString("Can't conjoin non-English sentence main VPs.");
        $ic21$ = makeString(", and");
        $ic22$ = makeSymbol("S#39341", "CYC");
        $ic23$ = makeString(",");
    }
}

/*
	DECOMPILATION REPORT

	Decompiled from: G:\opt\CYC_JRTL_with_CommonLisp\platform\lib\cyc-oc4.0-unzipped/com/cyc/cycjava/cycl/class
	Total time: 202 ms
	
	Decompiled with Procyon 0.5.32.
*/