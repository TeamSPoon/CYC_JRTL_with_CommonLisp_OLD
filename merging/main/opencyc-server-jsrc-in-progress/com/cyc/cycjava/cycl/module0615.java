package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class module0615 extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.module0615";
    public static final String myFingerPrint = "11ae0a46d08dbcf0b46ab97325d41437c9fe320bdd792d76c7e93ed840f9e62e";
    public static SubLSymbol $g4732$;
    public static SubLSymbol $g4731$;
    public static SubLSymbol $g4733$;
    private static final SubLObject $ic0$;
    private static final SubLObject $ic1$;
    private static final SubLObject $ic2$;
    private static final SubLSymbol $ic3$;
    private static final SubLObject $ic4$;
    private static final SubLList $ic5$;
    private static final SubLObject $ic6$;
    private static final SubLObject $ic7$;
    private static final SubLObject $ic8$;
    private static final SubLObject $ic9$;
    private static final SubLObject $ic10$;
    private static final SubLObject $ic11$;
    private static final SubLObject $ic12$;
    private static final SubLObject $ic13$;
    private static final SubLObject $ic14$;
    private static final SubLList $ic15$;
    private static final SubLList $ic16$;
    private static final SubLSymbol $ic17$;
    private static final SubLObject $ic18$;
    private static final SubLObject $ic19$;
    private static final SubLInteger $ic20$;
    private static final SubLObject $ic21$;
    private static final SubLObject $ic22$;
    private static final SubLInteger $ic23$;
    private static final SubLObject $ic24$;
    private static final SubLObject $ic25$;
    private static final SubLObject $ic26$;
    private static final SubLObject $ic27$;
    private static final SubLObject $ic28$;
    private static final SubLObject $ic29$;
    private static final SubLObject $ic30$;
    private static final SubLList $ic31$;
    private static final SubLList $ic32$;
    private static final SubLString $ic33$;
    private static final SubLString $ic34$;
    private static final SubLObject $ic35$;
    private static final SubLObject $ic36$;
    private static final SubLObject $ic37$;
    private static final SubLObject $ic38$;
    private static final SubLObject $ic39$;
    private static final SubLObject $ic40$;
    private static final SubLObject $ic41$;
    private static final SubLObject $ic42$;
    private static final SubLObject $ic43$;
    private static final SubLObject $ic44$;
    private static final SubLObject $ic45$;
    private static final SubLObject $ic46$;
    private static final SubLObject $ic47$;
    private static final SubLObject $ic48$;
    private static final SubLInteger $ic49$;
    private static final SubLObject $ic50$;
    private static final SubLInteger $ic51$;
    private static final SubLObject $ic52$;
    private static final SubLInteger $ic53$;
    private static final SubLString $ic54$;
    private static final SubLObject $ic55$;
    private static final SubLList $ic56$;
    private static final SubLObject $ic57$;
    private static final SubLSymbol $ic58$;
    private static final SubLSymbol $ic59$;
    private static final SubLSymbol $ic60$;
    private static final SubLInteger $ic61$;
    private static final SubLInteger $ic62$;
    private static final SubLObject $ic63$;
    private static final SubLInteger $ic64$;
    private static final SubLString $ic65$;
    private static final SubLObject $ic66$;
    private static final SubLObject $ic67$;
    private static final SubLList $ic68$;
    private static final SubLObject $ic69$;
    private static final SubLObject $ic70$;
    private static final SubLList $ic71$;
    private static final SubLObject $ic72$;
    private static final SubLObject $ic73$;
    private static final SubLObject $ic74$;
    private static final SubLList $ic75$;
    
    public static SubLObject f37680(final SubLObject var1) {
        return Equality.eql(var1, $ic0$);
    }
    
    public static SubLObject f37681(final SubLObject var1) {
        final SubLThread var2 = SubLProcess.currentSubLThread();
        if (NIL != f37682(var1)) {
            return (SubLObject)T;
        }
        SubLObject var3 = (SubLObject)NIL;
        final SubLObject var4 = module0139.$g1644$.currentBinding(var2);
        try {
            module0139.$g1644$.bind((SubLObject)NIL, var2);
            var3 = module0259.f16854(var1, $ic1$, $ic2$, (SubLObject)UNPROVIDED);
        }
        finally {
            module0139.$g1644$.rebind(var4, var2);
        }
        return var3;
    }
    
    public static SubLObject f37683(final SubLObject var1) {
        return (NIL != f37682(var1) && NIL == f37684(var1)) ? f37685(var1) : f37686(f37687(var1));
    }
    
    public static SubLObject f37688(final SubLObject var1) {
        if (NIL != f37682(var1)) {
            return f37689(var1);
        }
        if (NIL != f37684(var1)) {
            return f37687(var1);
        }
        module0347.f23344((SubLObject)$ic3$, (SubLObject)ConsesLow.listS($ic4$, var1, (SubLObject)$ic5$), $ic2$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED).first();
        return (SubLObject)NIL;
    }
    
    public static SubLObject f37682(final SubLObject var1) {
        final SubLThread var2 = SubLProcess.currentSubLThread();
        SubLObject var3 = (SubLObject)NIL;
        final SubLObject var4 = module0139.$g1644$.currentBinding(var2);
        try {
            module0139.$g1644$.bind((SubLObject)NIL, var2);
            var3 = module0259.f16854(var1, $ic6$, $ic2$, (SubLObject)UNPROVIDED);
        }
        finally {
            module0139.$g1644$.rebind(var4, var2);
        }
        return var3;
    }
    
    public static SubLObject f37685(final SubLObject var5) {
        return (SubLObject)((NIL != module0173.f10955(var5)) ? module0612.f37476(var5) : NIL);
    }
    
    public static SubLObject f37689(final SubLObject var1) {
        return f37690(var1, (SubLObject)ONE_INTEGER);
    }
    
    public static SubLObject f37690(final SubLObject var1, final SubLObject var6) {
        final SubLObject var7 = f37685(var1);
        return (SubLObject)((NIL != var7) ? module0202.f12643(var7, var6) : NIL);
    }
    
    public static SubLObject f37684(final SubLObject var1) {
        final SubLThread var2 = SubLProcess.currentSubLThread();
        SubLObject var3 = (SubLObject)NIL;
        final SubLObject var4 = module0139.$g1644$.currentBinding(var2);
        try {
            module0139.$g1644$.bind((SubLObject)NIL, var2);
            var3 = module0259.f16854(var1, $ic7$, $ic2$, (SubLObject)UNPROVIDED);
        }
        finally {
            module0139.$g1644$.rebind(var4, var2);
        }
        return var3;
    }
    
    public static SubLObject f37691(final SubLObject var1) {
        return module0347.f23344((SubLObject)$ic3$, (SubLObject)ConsesLow.listS($ic8$, var1, (SubLObject)$ic5$), $ic2$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED).first();
    }
    
    public static SubLObject f37687(final SubLObject var1) {
        return module0347.f23344((SubLObject)$ic3$, (SubLObject)ConsesLow.listS($ic4$, var1, (SubLObject)$ic5$), $ic2$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED).first();
    }
    
    public static SubLObject f37692(final SubLObject var1) {
        return module0259.f16854(var1, $ic9$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f37693(final SubLObject var1) {
        return module0259.f16854(var1, $ic10$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f37694(final SubLObject var1) {
        return module0259.f16854(var1, $ic11$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f37695(final SubLObject var1) {
        return module0259.f16854(var1, $ic12$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f37696(final SubLObject var8) {
        return (SubLObject)makeBoolean(NIL != module0202.f12590(var8) && module0205.f13276(var8).eql($ic13$) && NIL != module0004.f104(f37697(var8), $g4731$.getGlobalValue(), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED) && NIL != module0048.f3293(f37698(var8)));
    }
    
    public static SubLObject f37699(final SubLObject var9) {
        return module0205.f13203(var9, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f37697(final SubLObject var9) {
        return module0205.f13136(module0205.f13203(var9, (SubLObject)UNPROVIDED));
    }
    
    public static SubLObject f37698(final SubLObject var9) {
        return module0205.f13203(module0205.f13203(var9, (SubLObject)UNPROVIDED), (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f37700(final SubLObject var7) {
        if (NIL != f37701(var7)) {
            return $ic14$;
        }
        return (SubLObject)ConsesLow.list($ic13$, var7);
    }
    
    public static SubLObject f37702(final SubLObject var10) {
        return module0004.f104(var10, $g4731$.getGlobalValue(), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f37703(final SubLObject var10) {
        return (SubLObject)makeBoolean(NIL != f37701(var10) || (NIL != module0202.f12590(var10) && NIL != module0193.f12105(var10) && NIL != f37702(module0205.f13132(var10))));
    }
    
    public static SubLObject f37704(final SubLObject var10) {
        return (SubLObject)makeBoolean(NIL != f37703(var10) && f37705(var10).isZero());
    }
    
    public static SubLObject f37706(final SubLObject var11, final SubLObject var12) {
        return Numbers.numL(Sequences.position(var11, $g4731$.getGlobalValue(), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED), Sequences.position(var12, $g4731$.getGlobalValue(), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED));
    }
    
    public static SubLObject f37686(final SubLObject var7) {
        return var7.first();
    }
    
    public static SubLObject f37705(final SubLObject var7) {
        return conses_high.second(var7);
    }
    
    public static SubLObject f37707(final SubLObject var7) {
        return f37686(var7);
    }
    
    public static SubLObject f37701(final SubLObject var7) {
        return Equality.eql(var7, $g4733$.getGlobalValue());
    }
    
    public static SubLObject f37708(final SubLObject var13, final SubLObject var14) {
        final SubLObject var15 = f37686(var13);
        final SubLObject var16 = f37705(var13);
        final SubLObject var17 = f37686(var14);
        final SubLObject var18 = f37705(var14);
        if (var15.eql(var17)) {
            return Numbers.numL(var16, var18);
        }
        if (NIL != f37706(var15, var17)) {
            return Numbers.numL(var16, Numbers.multiply(f37709(var15, var17, (SubLObject)UNPROVIDED), var18));
        }
        return Numbers.numL(Numbers.multiply(f37709(var17, var15, (SubLObject)UNPROVIDED), var16), var18);
    }
    
    public static SubLObject f37710(final SubLObject var13, final SubLObject var14) {
        final SubLObject var15 = f37686(var13);
        final SubLObject var16 = f37705(var13);
        final SubLObject var17 = f37686(var14);
        final SubLObject var18 = f37705(var14);
        if (var15.eql(var17)) {
            return Numbers.numLE(var16, var18);
        }
        if (NIL != f37706(var15, var17)) {
            return Numbers.numLE(var16, Numbers.multiply(f37709(var15, var17, (SubLObject)UNPROVIDED), var18));
        }
        return Numbers.numLE(Numbers.multiply(f37709(var17, var15, (SubLObject)UNPROVIDED), var16), var18);
    }
    
    public static SubLObject f37711(final SubLObject var13, final SubLObject var14) {
        final SubLObject var15 = f37686(var13);
        final SubLObject var16 = f37705(var13);
        final SubLObject var17 = f37686(var14);
        final SubLObject var18 = f37705(var14);
        if (var15.eql(var17)) {
            return Numbers.numE(var16, var18);
        }
        if (NIL != f37706(var15, var17)) {
            return Numbers.numE(var16, Numbers.multiply(f37709(var15, var17, (SubLObject)UNPROVIDED), var18));
        }
        return Numbers.numE(Numbers.multiply(f37709(var17, var15, (SubLObject)UNPROVIDED), var16), var18);
    }
    
    public static SubLObject f37712(final SubLObject var13, final SubLObject var14) {
        final SubLObject var15 = f37686(var13);
        final SubLObject var16 = f37705(var13);
        final SubLObject var17 = f37686(var14);
        final SubLObject var18 = f37705(var14);
        if (var15.eql(var17)) {
            return (SubLObject)ConsesLow.list(var15, Numbers.add(var16, var18));
        }
        if (NIL != f37706(var15, var17)) {
            return (SubLObject)ConsesLow.list(var15, Numbers.add(var16, Numbers.multiply(f37709(var15, var17, (SubLObject)UNPROVIDED), var18)));
        }
        return (SubLObject)ConsesLow.list(var17, Numbers.add(var18, Numbers.multiply(f37709(var17, var15, (SubLObject)UNPROVIDED), var16)));
    }
    
    public static SubLObject f37713(final SubLObject var7, final SubLObject var19) {
        return (SubLObject)ConsesLow.list(f37686(var7), Numbers.multiply(var19, f37705(var7)));
    }
    
    public static SubLObject f37709(final SubLObject var11, final SubLObject var12, SubLObject var20) {
        if (var20 == UNPROVIDED) {
            var20 = (SubLObject)ONE_INTEGER;
        }
        if (var11.eql(var12)) {
            return var20;
        }
        if (var11.eql($ic18$)) {
            return f37709($ic19$, var12, Numbers.multiply((SubLObject)$ic20$, var20));
        }
        if (var11.eql($ic19$)) {
            return f37709($ic21$, var12, Numbers.multiply((SubLObject)$ic20$, var20));
        }
        if (var11.eql($ic21$)) {
            return f37709($ic22$, var12, Numbers.multiply((SubLObject)$ic23$, var20));
        }
        if (var11.eql($ic22$)) {
            return f37709($ic24$, var12, Numbers.multiply((SubLObject)SEVEN_INTEGER, var20));
        }
        if (var11.eql($ic24$)) {
            return f37709($ic25$, var12, Numbers.multiply((SubLObject)FOUR_INTEGER, var20));
        }
        if (var11.eql($ic25$)) {
            return f37709($ic26$, var12, Numbers.multiply((SubLObject)THREE_INTEGER, var20));
        }
        if (var11.eql($ic26$)) {
            return f37709($ic27$, var12, Numbers.multiply((SubLObject)FOUR_INTEGER, var20));
        }
        if (var11.eql($ic27$)) {
            return f37709($ic28$, var12, Numbers.multiply((SubLObject)TEN_INTEGER, var20));
        }
        if (var11.eql($ic28$)) {
            return f37709($ic29$, var12, Numbers.multiply((SubLObject)TEN_INTEGER, var20));
        }
        if (var11.eql($ic29$)) {
            return f37709($ic30$, var12, Numbers.multiply((SubLObject)TEN_INTEGER, var20));
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f37714(final SubLObject var22, final SubLObject var1) {
        if (NIL != f37701(f37715(var22))) {
            return (SubLObject)T;
        }
        if (NIL == f37696(var1)) {
            final SubLObject var23 = f37717(var22, var1, (SubLObject)ZERO_INTEGER);
            return (SubLObject)((NIL != var23) ? module0267.f17564(var23, var22) : NIL);
        }
        final SubLObject var24 = f37716(var1);
        if (NIL != var24) {
            final SubLObject var25 = module0614.f37641(var22);
            final SubLObject var26 = module0614.f37626(module0612.f37453(module0614.f37640(var22), var24));
            return module0612.f37485(var26, var25);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f37718(final SubLObject var22, final SubLObject var1) {
        if (NIL != f37701(f37715(var22))) {
            return (SubLObject)NIL;
        }
        final SubLObject var23 = f37719(var1);
        if (NIL == var23) {
            return (SubLObject)NIL;
        }
        if (NIL != f37701(f37719(var1))) {
            return (SubLObject)T;
        }
        if (NIL != f37696(var1)) {
            final SubLObject var24 = module0614.f37641(var22);
            final SubLObject var25 = module0614.f37626(module0612.f37453(module0614.f37640(var22), f37716(var1)));
            return module0612.f37485(var24, var25);
        }
        final SubLObject var26 = f37720(var22, var1, (SubLObject)ZERO_INTEGER);
        return (SubLObject)((NIL != var26) ? module0267.f17564(var22, var26) : NIL);
    }
    
    public static SubLObject f37721(final SubLObject var28, final SubLObject var1) {
        final SubLObject var29 = f37716(var1);
        return (SubLObject)((NIL != var29) ? module0612.f37453(var28, var29) : NIL);
    }
    
    public static SubLObject f37716(final SubLObject var1) {
        SubLObject var2 = (SubLObject)NIL;
        if (var1.eql($ic14$)) {
            return $g4733$.getGlobalValue();
        }
        if (var1.eql($ic0$)) {
            return (SubLObject)$ic31$;
        }
        if (NIL != f37684(var1)) {
            var2 = f37687(var1);
        }
        else if (NIL != f37682(var1)) {
            final SubLObject var3 = f37683(var1);
            if (NIL != var3) {
                var2 = (SubLObject)ConsesLow.list(var3, (SubLObject)ONE_INTEGER);
            }
        }
        else {
            var2 = f37699(var1);
        }
        return var2;
    }
    
    public static SubLObject f37722(final SubLObject var22) {
        if (NIL != module0612.f37382(var22)) {
            return reader.bq_cons(f37683(module0612.f37425(var22)), (SubLObject)$ic32$);
        }
        if (NIL == module0614.f37618(var22) && NIL == module0612.f37387(var22)) {
            return (SubLObject)ConsesLow.list($ic18$, f37715(var22));
        }
        final SubLObject var23 = module0614.f37640(var22);
        final SubLObject var24 = module0614.f37641(var22);
        if (NIL != module0612.f37389(var23) || NIL != module0612.f37388(var24)) {
            return $g4733$.getGlobalValue();
        }
        return (SubLObject)ConsesLow.list($ic18$, module0048.f_1X(conses_high.second(module0612.f37500(var23, var24, (SubLObject)UNPROVIDED))));
    }
    
    public static SubLObject f37715(final SubLObject var31) {
        final SubLThread var32 = SubLProcess.currentSubLThread();
        if (NIL != module0612.f37382(var31)) {
            var32.resetMultipleValues();
            final SubLObject var33 = module0612.f37398(var31);
            final SubLObject var34 = var32.secondMultipleValue();
            final SubLObject var35 = var32.thirdMultipleValue();
            final SubLObject var36 = var32.fourthMultipleValue();
            final SubLObject var37 = var32.fifthMultipleValue();
            final SubLObject var38 = var32.sixthMultipleValue();
            final SubLObject var39 = var32.seventhMultipleValue();
            var32.resetMultipleValues();
            if (NIL != var39) {
                return (SubLObject)ONE_INTEGER;
            }
            if (NIL != var38) {
                return module0051.$g81$.getGlobalValue();
            }
            if (NIL != var37) {
                return module0051.$g996$.getGlobalValue();
            }
            if (NIL != var36) {
                return module0051.$g995$.getGlobalValue();
            }
            if (NIL != var35) {
                return Numbers.multiply(module0051.$g995$.getGlobalValue(), module0051.f3545(var35, var34));
            }
            if (NIL != var34) {
                if (NIL != module0051.f3655(var34)) {
                    return module0051.$g992$.getGlobalValue();
                }
                return module0051.$g993$.getGlobalValue();
            }
        }
        else if (NIL != module0614.f37618(var31)) {
            final SubLObject var40 = module0614.f37640(var31);
            final SubLObject var41 = module0614.f37641(var31);
            if (NIL != module0612.f37389(var40) || NIL != module0612.f37388(var41)) {
                return $g4733$.getGlobalValue();
            }
            return module0048.f_1X(conses_high.second(module0612.f37500(var40, var41, (SubLObject)UNPROVIDED)));
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f37719(final SubLObject var1) {
        if (var1.eql($ic14$)) {
            return $g4733$.getGlobalValue();
        }
        final SubLObject var2 = f37716(var1);
        if (NIL != var2) {
            final SubLObject var3 = f37709($ic18$, f37686(var2), (SubLObject)UNPROVIDED);
            if (NIL != var3) {
                return Numbers.multiply(f37705(var2), var3);
            }
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f37723(final SubLObject var1, final SubLObject var6, final SubLObject var22) {
        if (NIL != module0614.f37617(var22)) {
            if (NIL != f37682(var1)) {
                final SubLObject var23 = f37690(var1, var6);
                final SubLObject var24 = module0612.f37450(var22, var23);
                return Values.values(var24, module0035.sublisp_boolean(var24));
            }
            if (NIL != f37687(var1)) {
                return Values.values(var22, (SubLObject)NIL);
            }
            Errors.error((SubLObject)$ic33$, var1);
        }
        else {
            Errors.error((SubLObject)$ic34$);
        }
        return Values.values((SubLObject)NIL, (SubLObject)NIL);
    }
    
    public static SubLObject f37724(final SubLObject var1, final SubLObject var6, final SubLObject var22) {
        if (NIL != module0614.f37617(var22)) {
            if (NIL != f37682(var1)) {
                final SubLObject var23 = f37690(var1, var6);
                final SubLObject var24 = module0612.f37453(var22, var23);
                return Values.values(var24, module0035.sublisp_boolean(var24));
            }
            if (NIL != f37687(var1)) {
                return Values.values(var22, (SubLObject)NIL);
            }
            Errors.error((SubLObject)$ic33$, var1);
        }
        else {
            Errors.error((SubLObject)$ic34$);
        }
        return Values.values((SubLObject)NIL, (SubLObject)NIL);
    }
    
    public static SubLObject f37725(final SubLObject var22, final SubLObject var1) {
        if (var1.eql($ic14$)) {
            return (SubLObject)ConsesLow.list($ic35$, var22);
        }
        if (NIL == module0614.f37617(var22)) {
            return (SubLObject)NIL;
        }
        if (NIL != module0614.f37673(var22) && NIL != f37680(var1)) {
            return $ic36$;
        }
        if (NIL != module0614.f37619(var22)) {
            return (SubLObject)((NIL != f37680(var1)) ? ConsesLow.list($ic35$, var22) : NIL);
        }
        if (NIL == module0267.f17566(var22, var1)) {
            return (SubLObject)NIL;
        }
        final SubLObject var23 = f37726(var22, var1, (SubLObject)ZERO_INTEGER);
        return module0614.f37645((SubLObject)ConsesLow.list($ic35$, var23));
    }
    
    public static SubLObject f37727(final SubLObject var22, final SubLObject var1) {
        if (var1.eql($ic14$)) {
            return (SubLObject)ConsesLow.list($ic37$, var22);
        }
        if (NIL == module0614.f37617(var22)) {
            return (SubLObject)NIL;
        }
        if (NIL != module0614.f37672(var22) && NIL != f37680(var1)) {
            return $ic36$;
        }
        if (NIL != module0614.f37619(var22)) {
            return (SubLObject)((NIL != f37680(var1)) ? ConsesLow.list($ic37$, var22) : NIL);
        }
        if (NIL == module0267.f17566(var22, var1)) {
            return (SubLObject)NIL;
        }
        final SubLObject var23 = f37717(var22, var1, (SubLObject)ZERO_INTEGER);
        return module0614.f37645((SubLObject)ConsesLow.list($ic37$, var23));
    }
    
    public static SubLObject f37728(final SubLObject var10) {
        return (SubLObject)makeBoolean(NIL != module0206.f13453(var10) && module0205.f13276(var10).eql($ic38$));
    }
    
    public static SubLObject f37729(final SubLObject var1, final SubLObject var28) {
        if (NIL == module0612.f37382(var28)) {
            return (SubLObject)NIL;
        }
        if (var1.eql($ic39$) || var1.eql($ic40$) || var1.eql($ic41$) || var1.eql($ic42$) || var1.eql($ic43$) || var1.eql($ic44$)) {
            return f37730(var1, var28);
        }
        if (var1.eql($ic45$)) {
            return (SubLObject)makeBoolean(NIL != module0612.f37421(module0612.f37444(var28), $ic45$) && NIL != f37730($ic42$, var28));
        }
        if (var1.eql($ic46$)) {
            return (SubLObject)makeBoolean(NIL != module0048.f3275(Numbers.mod(module0612.f37403(var28), (SubLObject)FOUR_INTEGER)) && NIL != f37730($ic43$, var28));
        }
        if (var1.eql($ic47$)) {
            return (SubLObject)makeBoolean(Numbers.mod(module0612.f37400(var28), (SubLObject)TEN_INTEGER).isZero() && NIL != f37730($ic44$, var28));
        }
        if (var1.eql($ic48$)) {
            return (SubLObject)makeBoolean(NIL != module0048.f3275(Numbers.mod(module0612.f37400(var28), (SubLObject)$ic49$)) && NIL != f37730($ic44$, var28));
        }
        if (var1.eql($ic50$)) {
            return (SubLObject)makeBoolean(NIL != module0048.f3275(Numbers.mod(module0612.f37400(var28), (SubLObject)$ic51$)) && NIL != f37730($ic44$, var28));
        }
        if (var1.eql($ic52$)) {
            return (SubLObject)makeBoolean(NIL != module0048.f3275(Numbers.mod(module0612.f37400(var28), (SubLObject)$ic53$)) && NIL != f37730($ic44$, var28));
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f37730(final SubLObject var1, final SubLObject var28) {
        SubLObject var29 = (SubLObject)NIL;
        SubLObject var30 = (SubLObject)T;
        if (NIL == var29) {
            SubLObject var31 = module0612.$g4714$.getGlobalValue();
            SubLObject var32 = (SubLObject)NIL;
            var32 = var31.first();
            while (NIL == var29 && NIL != var31) {
                final SubLObject var33 = module0612.f37411(var28, var32);
                if (var32.eql(var1)) {
                    var29 = (SubLObject)T;
                }
                else if (NIL == module0612.f37421(var33, var32)) {
                    var30 = (SubLObject)NIL;
                    var29 = (SubLObject)T;
                }
                var31 = var31.rest();
                var32 = var31.first();
            }
        }
        return var30;
    }
    
    public static SubLObject f37731(final SubLObject var1, final SubLObject var28) {
        if (NIL == module0612.f37382(var28)) {
            return (SubLObject)NIL;
        }
        if (var1.eql($ic39$) || var1.eql($ic40$) || var1.eql($ic41$) || var1.eql($ic42$) || var1.eql($ic43$) || var1.eql($ic44$)) {
            return f37732(var1, var28);
        }
        if (var1.eql($ic45$)) {
            return (SubLObject)makeBoolean(NIL != module0612.f37423(module0612.f37444(var28), $ic45$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED) && NIL != f37730($ic42$, var28));
        }
        if (var1.eql($ic46$)) {
            return (SubLObject)makeBoolean(Numbers.mod(module0612.f37403(var28), (SubLObject)FOUR_INTEGER).isZero() && NIL != f37732($ic43$, var28));
        }
        if (var1.eql($ic47$)) {
            return (SubLObject)makeBoolean(NINE_INTEGER.numE(Numbers.mod(module0612.f37400(var28), (SubLObject)TEN_INTEGER)) && NIL != f37732($ic44$, var28));
        }
        if (var1.eql($ic48$)) {
            return (SubLObject)makeBoolean(Numbers.mod(module0612.f37400(var28), (SubLObject)$ic49$).isZero() && NIL != f37732($ic44$, var28));
        }
        if (var1.eql($ic50$)) {
            return (SubLObject)makeBoolean(Numbers.mod(module0612.f37400(var28), (SubLObject)$ic51$).isZero() && NIL != f37732($ic44$, var28));
        }
        if (var1.eql($ic52$)) {
            return (SubLObject)makeBoolean(Numbers.mod(module0612.f37400(var28), (SubLObject)$ic53$).isZero() && NIL != f37732($ic44$, var28));
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f37732(final SubLObject var1, final SubLObject var28) {
        SubLObject var29 = (SubLObject)NIL;
        SubLObject var30 = (SubLObject)T;
        if (NIL == var29) {
            SubLObject var31 = module0612.$g4714$.getGlobalValue();
            SubLObject var32 = (SubLObject)NIL;
            var32 = var31.first();
            while (NIL == var29 && NIL != var31) {
                final SubLObject var33 = module0612.f37411(var28, var32);
                if (var32.eql(var1)) {
                    var29 = (SubLObject)T;
                }
                else if (NIL == module0612.f37423(var33, var32, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)) {
                    var30 = (SubLObject)NIL;
                    var29 = (SubLObject)T;
                }
                var31 = var31.rest();
                var32 = var31.first();
            }
        }
        return var30;
    }
    
    public static SubLObject f37733(final SubLObject var22, final SubLObject var1, final SubLObject var46) {
        final SubLObject var47 = module0614.f37640(var22);
        return f37734(var47, var1, var46);
    }
    
    public static SubLObject f37720(final SubLObject var22, final SubLObject var1, final SubLObject var46) {
        final SubLObject var47 = module0614.f37640(var22);
        return f37735(var47, var1, var46);
    }
    
    public static SubLObject f37736(final SubLObject var22, final SubLObject var1, final SubLObject var46) {
        final SubLObject var47 = module0614.f37640(var22);
        return f37737(var47, var1, var46);
    }
    
    public static SubLObject f37717(final SubLObject var22, final SubLObject var1, final SubLObject var46) {
        final SubLObject var47 = module0614.f37640(var22);
        return f37738(var47, var1, var46);
    }
    
    public static SubLObject f37739(final SubLObject var22, final SubLObject var1, final SubLObject var46) {
        final SubLObject var47 = module0614.f37641(var22);
        return f37734(var47, var1, var46);
    }
    
    public static SubLObject f37740(final SubLObject var22, final SubLObject var1, final SubLObject var46) {
        final SubLObject var47 = module0614.f37641(var22);
        return f37735(var47, var1, var46);
    }
    
    public static SubLObject f37741(final SubLObject var22, final SubLObject var1, final SubLObject var46) {
        final SubLObject var47 = module0614.f37641(var22);
        return f37737(var47, var1, var46);
    }
    
    public static SubLObject f37742(final SubLObject var22, final SubLObject var1, final SubLObject var46) {
        final SubLObject var47 = module0614.f37641(var22);
        return f37738(var47, var1, var46);
    }
    
    public static SubLObject f37743(final SubLObject var22, final SubLObject var1, final SubLObject var46) {
        final SubLObject var47 = module0614.f37640(var22);
        return f37744(var47, var1, var46);
    }
    
    public static SubLObject f37745(final SubLObject var22, final SubLObject var1, final SubLObject var46) {
        final SubLObject var47 = module0614.f37640(var22);
        return f37735(var47, var1, var46);
    }
    
    public static SubLObject f37746(final SubLObject var22, final SubLObject var1, final SubLObject var46) {
        final SubLObject var47 = module0614.f37640(var22);
        return f37747(var47, var1, var46);
    }
    
    public static SubLObject f37748(final SubLObject var22, final SubLObject var1, final SubLObject var46) {
        final SubLObject var47 = module0614.f37640(var22);
        return f37749(var47, var1, var46);
    }
    
    public static SubLObject f37750(final SubLObject var22, final SubLObject var1, final SubLObject var46) {
        final SubLObject var47 = module0614.f37641(var22);
        return f37744(var47, var1, var46);
    }
    
    public static SubLObject f37726(final SubLObject var22, final SubLObject var1, final SubLObject var46) {
        final SubLObject var47 = module0614.f37641(var22);
        return f37751(var47, var1, var46);
    }
    
    public static SubLObject f37752(final SubLObject var22, final SubLObject var1, final SubLObject var46) {
        final SubLObject var47 = module0614.f37641(var22);
        return f37747(var47, var1, var46);
    }
    
    public static SubLObject f37753(final SubLObject var22, final SubLObject var1, final SubLObject var46) {
        final SubLObject var47 = module0614.f37641(var22);
        return f37749(var47, var1, var46);
    }
    
    public static SubLObject f37734(final SubLObject var47, final SubLObject var1, final SubLObject var46) {
        final SubLObject var48 = module0614.f37626(var47);
        return f37735(var48, var1, var46);
    }
    
    public static SubLObject f37735(final SubLObject var47, final SubLObject var1, final SubLObject var46) {
        if (NIL != f37680(var1)) {
            return f37754(var47, var46);
        }
        if (NIL != f37682(var1)) {
            return f37755(var47, var1, var46);
        }
        if (NIL != f37684(var1)) {
            return f37756(var47, var1, var46);
        }
        return Errors.error((SubLObject)$ic54$, var1);
    }
    
    public static SubLObject f37737(final SubLObject var47, final SubLObject var1, final SubLObject var46) {
        final SubLObject var48 = module0614.f37625(var47);
        return f37738(var48, var1, var46);
    }
    
    public static SubLObject f37738(final SubLObject var47, final SubLObject var1, final SubLObject var46) {
        if (NIL != f37680(var1)) {
            return f37757(var47, var46);
        }
        if (NIL != f37682(var1)) {
            return f37758(var47, var1, var46);
        }
        if (NIL != f37684(var1)) {
            return f37759(var47, var1, var46);
        }
        return Errors.error((SubLObject)$ic54$, var1);
    }
    
    public static SubLObject f37744(final SubLObject var47, final SubLObject var1, final SubLObject var46) {
        final SubLObject var48 = module0614.f37626(var47);
        return f37751(var48, var1, var46);
    }
    
    public static SubLObject f37751(final SubLObject var47, final SubLObject var1, final SubLObject var46) {
        if (NIL != f37680(var1)) {
            return f37754(var47, var46);
        }
        if (NIL != f37682(var1)) {
            return f37760(var47, var1, var46);
        }
        if (NIL != f37684(var1)) {
            return f37761(var47, var1, var46);
        }
        return Errors.error((SubLObject)$ic54$, var1);
    }
    
    public static SubLObject f37747(final SubLObject var47, final SubLObject var1, final SubLObject var46) {
        final SubLObject var48 = module0614.f37625(var47);
        return f37749(var48, var1, var46);
    }
    
    public static SubLObject f37749(final SubLObject var47, final SubLObject var1, final SubLObject var46) {
        if (NIL != f37680(var1)) {
            return f37757(var47, var46);
        }
        if (NIL != f37682(var1)) {
            return f37762(var47, var1, var46);
        }
        if (NIL != f37684(var1)) {
            return f37763(var47, var1, var46);
        }
        return Errors.error((SubLObject)$ic54$, var1);
    }
    
    public static SubLObject f37754(final SubLObject var47, final SubLObject var46) {
        return module0612.f37450(var47, (SubLObject)ConsesLow.list($ic18$, var46));
    }
    
    public static SubLObject f37757(final SubLObject var47, final SubLObject var46) {
        return module0612.f37453(var47, (SubLObject)ConsesLow.list($ic18$, var46));
    }
    
    public static SubLObject f37755(final SubLObject var47, final SubLObject var1, final SubLObject var46) {
        if (var1.eql($ic39$)) {
            return module0612.f37450(var47, (SubLObject)ConsesLow.list($ic18$, var46));
        }
        if (var1.eql($ic40$) || var1.eql($ic41$) || var1.eql($ic42$) || var1.eql($ic43$) || var1.eql($ic44$)) {
            return module0612.f37450(module0612.f37424(var47, var1, (SubLObject)UNPROVIDED), f37713(f37689(var1), var46));
        }
        if (var1.eql($ic45$)) {
            final SubLObject var48 = f37756(var47, $ic55$, var46);
            final SubLObject var49 = module0612.f37453(var48, (SubLObject)$ic56$);
            return (SubLObject)ConsesLow.list($ic57$, var48, var49);
        }
        if (var1.eql($ic46$)) {
            return module0612.f37450(module0612.f37468(var47, (SubLObject)$ic58$), f37713(f37689(var1), var46));
        }
        if (var1.eql($ic47$)) {
            return module0612.f37450(module0612.f37468(var47, (SubLObject)$ic59$), f37713(f37689(var1), var46));
        }
        if (var1.eql($ic50$)) {
            return module0612.f37450(module0612.f37468(var47, (SubLObject)$ic60$), f37713(f37689(var1), var46));
        }
        if (var1.eql($ic48$)) {
            final SubLObject var50 = Numbers.subtract(module0205.f13277(module0612.f37468(var47, (SubLObject)$ic60$), (SubLObject)UNPROVIDED), (SubLObject)ONE_INTEGER);
            final SubLObject var51 = Numbers.mod(module0612.f37400(var47), (SubLObject)$ic51$);
            final SubLObject var52 = Numbers.multiply((SubLObject)$ic49$, var46);
            final SubLObject var53 = (var51.isZero() || var51.numG((SubLObject)$ic49$)) ? Numbers.subtract(Numbers.add(Numbers.multiply(var50, (SubLObject)$ic51$), (SubLObject)$ic61$), var52) : Numbers.subtract(Numbers.add(Numbers.multiply(var50, (SubLObject)$ic51$), (SubLObject)ONE_INTEGER), var52);
            final SubLObject var54 = Numbers.add(var53, (SubLObject)$ic62$);
            return (SubLObject)ConsesLow.list($ic57$, (SubLObject)ConsesLow.list($ic63$, var53), (SubLObject)ConsesLow.list($ic63$, var54));
        }
        if (var1.eql($ic52$)) {
            final SubLObject var55 = module0612.f37400(var47);
            final SubLObject var56 = Numbers.integerDivide(Numbers.subtract(var55, (SubLObject)ONE_INTEGER), (SubLObject)$ic53$);
            final SubLObject var52 = Numbers.multiply((SubLObject)$ic53$, var46);
            final SubLObject var53 = Numbers.subtract(Numbers.add(Numbers.multiply(var56, (SubLObject)$ic53$), (SubLObject)ONE_INTEGER), var52);
            final SubLObject var54 = Numbers.add(var53, (SubLObject)$ic64$);
            return (SubLObject)ConsesLow.list($ic57$, (SubLObject)ConsesLow.list($ic63$, var53), (SubLObject)ConsesLow.list($ic63$, var54));
        }
        return Errors.error((SubLObject)$ic65$, var1);
    }
    
    public static SubLObject f37758(final SubLObject var47, final SubLObject var1, final SubLObject var46) {
        if (var1.eql($ic39$)) {
            return module0612.f37453(var47, (SubLObject)ConsesLow.list($ic18$, var46));
        }
        if (var1.eql($ic40$) || var1.eql($ic41$) || var1.eql($ic42$) || var1.eql($ic43$) || var1.eql($ic44$)) {
            return (NIL != f37729(var1, var47)) ? module0612.f37453(module0612.f37424(var47, var1, (SubLObject)UNPROVIDED), f37713(f37689(var1), var46)) : module0612.f37453(module0612.f37424(var47, var1, (SubLObject)UNPROVIDED), f37713(f37689(var1), module0048.f_1X(var46)));
        }
        if (var1.eql($ic45$)) {
            final SubLObject var48 = f37759(var47, $ic55$, var46);
            final SubLObject var49 = module0612.f37453(var48, (SubLObject)$ic56$);
            return (SubLObject)ConsesLow.list($ic57$, var48, var49);
        }
        if (var1.eql($ic46$)) {
            return (NIL != f37729(var1, var47)) ? module0612.f37453(module0612.f37468(var47, (SubLObject)$ic58$), f37713(f37689(var1), var46)) : module0612.f37453(module0612.f37468(var47, (SubLObject)$ic58$), f37713(f37689(var1), module0048.f_1X(var46)));
        }
        if (var1.eql($ic47$)) {
            return (NIL != f37729(var1, var47)) ? module0612.f37453(module0612.f37468(var47, (SubLObject)$ic59$), f37713(f37689(var1), var46)) : module0612.f37453(module0612.f37468(var47, (SubLObject)$ic59$), f37713(f37689(var1), module0048.f_1X(var46)));
        }
        if (var1.eql($ic50$)) {
            return (NIL != f37729(var1, var47)) ? module0612.f37453(module0612.f37468(var47, (SubLObject)$ic60$), f37713(f37689(var1), var46)) : module0612.f37453(module0612.f37468(var47, (SubLObject)$ic60$), f37713(f37689(var1), module0048.f_1X(var46)));
        }
        if (var1.eql($ic48$)) {
            final SubLObject var50 = f37729($ic44$, var47);
            final SubLObject var51 = Numbers.subtract(module0205.f13277(module0612.f37468(var47, (SubLObject)$ic60$), (SubLObject)UNPROVIDED), (SubLObject)ONE_INTEGER);
            final SubLObject var52 = Numbers.mod(module0612.f37400(var47), (SubLObject)$ic51$);
            final SubLObject var53 = Numbers.multiply((SubLObject)$ic49$, (var52.numE((SubLObject)ONE_INTEGER) && NIL != var50) ? var46 : ((var52.numL((SubLObject)$ic61$) || (var52.numE((SubLObject)$ic61$) && NIL != var50)) ? Numbers.add(var46, (SubLObject)ONE_INTEGER) : Numbers.add(var46, (SubLObject)TWO_INTEGER)));
            final SubLObject var54 = Numbers.add(Numbers.multiply(var51, (SubLObject)$ic51$), (SubLObject)ONE_INTEGER, var53);
            final SubLObject var55 = Numbers.add(var54, (SubLObject)$ic62$);
            return (SubLObject)ConsesLow.list($ic57$, (SubLObject)ConsesLow.list($ic63$, var54), (SubLObject)ConsesLow.list($ic63$, var55));
        }
        if (var1.eql($ic52$)) {
            final SubLObject var50 = f37729($ic44$, var47);
            final SubLObject var56 = module0612.f37400(var47);
            final SubLObject var57 = Numbers.integerDivide(Numbers.subtract(var56, (SubLObject)ONE_INTEGER), (SubLObject)$ic53$);
            final SubLObject var53 = Numbers.multiply((SubLObject)$ic53$, (Numbers.mod(var56, (SubLObject)$ic53$).numE((SubLObject)ONE_INTEGER) && NIL != var50) ? var46 : Numbers.add(var46, (SubLObject)ONE_INTEGER));
            final SubLObject var54 = Numbers.add(Numbers.multiply(var57, (SubLObject)$ic53$), (SubLObject)ONE_INTEGER, var53);
            final SubLObject var55 = Numbers.add(var54, (SubLObject)$ic64$);
            return (SubLObject)ConsesLow.list($ic57$, (SubLObject)ConsesLow.list($ic63$, var54), (SubLObject)ConsesLow.list($ic63$, var55));
        }
        return Errors.error((SubLObject)$ic65$, var1);
    }
    
    public static SubLObject f37760(final SubLObject var47, final SubLObject var1, final SubLObject var46) {
        final SubLObject var48 = f37755(var47, var1, (SubLObject)ZERO_INTEGER);
        return (NIL != module0612.f37487(var47, module0614.f37641(var48))) ? f37755(var47, var1, Numbers.add(var46, (SubLObject)ONE_INTEGER)) : f37755(var47, var1, var46);
    }
    
    public static SubLObject f37762(final SubLObject var47, final SubLObject var1, final SubLObject var46) {
        final SubLObject var48 = f37755(var47, var1, (SubLObject)ZERO_INTEGER);
        return (NIL != module0612.f37487(module0614.f37641(var48), var47)) ? f37758(var47, var1, var46) : f37758(var47, var1, Numbers.subtract(var46, (SubLObject)ONE_INTEGER));
    }
    
    public static SubLObject f37756(final SubLObject var47, final SubLObject var1, final SubLObject var46) {
        if (NIL != f37692(var1)) {
            return f37764(var47, var1, var46);
        }
        if (NIL != f37694(var1)) {
            return f37765(var47, var1, var46);
        }
        if (NIL != f37695(var1)) {
            return f37766(var47, var1, var46);
        }
        if (NIL != f37693(var1)) {
            return f37767(var47, var1, var46);
        }
        if (var1.eql($ic66$)) {
            final SubLObject var48 = f37756(var47, $ic67$, var46);
            final SubLObject var49 = module0612.f37453(var48, (SubLObject)$ic68$);
            return (SubLObject)ConsesLow.list($ic57$, var48, var49);
        }
        if (var1.eql($ic69$)) {
            final SubLObject var48 = f37756(var47, $ic70$, var46);
            final SubLObject var49 = module0612.f37453(var48, (SubLObject)$ic71$);
            return (SubLObject)ConsesLow.list($ic57$, var48, var49);
        }
        if (var1.eql($ic72$)) {
            return f37768(var47, var46);
        }
        return Errors.error((SubLObject)$ic65$, var1);
    }
    
    public static SubLObject f37759(final SubLObject var47, final SubLObject var1, final SubLObject var46) {
        if (NIL != f37692(var1)) {
            return f37769(var47, var1, var46);
        }
        if (NIL != f37694(var1)) {
            return f37770(var47, var1, var46);
        }
        if (NIL != f37695(var1)) {
            return f37771(var47, var1, var46);
        }
        if (NIL != f37693(var1)) {
            return f37772(var47, var1, var46);
        }
        if (var1.eql($ic66$)) {
            final SubLObject var48 = f37759(var47, $ic67$, var46);
            final SubLObject var49 = module0612.f37453(var48, (SubLObject)$ic68$);
            return (SubLObject)ConsesLow.list($ic57$, var48, var49);
        }
        if (var1.eql($ic69$)) {
            final SubLObject var48 = f37759(var47, $ic70$, var46);
            final SubLObject var49 = module0612.f37453(var48, (SubLObject)$ic71$);
            return (SubLObject)ConsesLow.list($ic57$, var48, var49);
        }
        if (var1.eql($ic72$)) {
            return f37773(var47, var46);
        }
        return Errors.error((SubLObject)$ic65$, var1);
    }
    
    public static SubLObject f37761(final SubLObject var47, final SubLObject var1, final SubLObject var46) {
        final SubLObject var48 = f37756(var47, var1, (SubLObject)ZERO_INTEGER);
        return (NIL != module0612.f37487(var47, module0614.f37641(var48))) ? f37756(var47, var1, Numbers.add(var46, (SubLObject)ONE_INTEGER)) : f37756(var47, var1, var46);
    }
    
    public static SubLObject f37763(final SubLObject var47, final SubLObject var1, final SubLObject var46) {
        final SubLObject var48 = f37756(var47, var1, (SubLObject)ZERO_INTEGER);
        return (NIL != module0612.f37487(module0614.f37641(var48), var47)) ? f37759(var47, var1, var46) : f37759(var47, var1, Numbers.subtract(var46, (SubLObject)ONE_INTEGER));
    }
    
    public static SubLObject f37764(final SubLObject var47, final SubLObject var1, final SubLObject var46) {
        if (NIL == module0612.f37437(var1)) {
            return Errors.error((SubLObject)$ic65$, var1);
        }
        final SubLObject var48 = module0612.f37403(var47);
        final SubLObject var49 = module0612.f37400(var47);
        final SubLObject var50 = module0612.f37417(var1);
        final SubLObject var51 = var50.numG(var48) ? module0048.f_1X(var46) : var46;
        return module0612.f37428(Numbers.subtract(var49, var51), var50, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f37769(final SubLObject var47, final SubLObject var1, final SubLObject var46) {
        if (NIL == module0612.f37437(var1)) {
            return Errors.error((SubLObject)$ic65$, var1);
        }
        final SubLObject var48 = f37729($ic43$, var47);
        final SubLObject var49 = module0612.f37403(var47);
        final SubLObject var50 = module0612.f37400(var47);
        final SubLObject var51 = module0612.f37417(var1);
        final SubLObject var52 = (var51.numG(var49) || (var51.numE(var49) && NIL != var48)) ? var46 : module0048.f_1X(var46);
        return module0612.f37428(Numbers.add(var50, var52), var51, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f37765(final SubLObject var47, final SubLObject var1, final SubLObject var46) {
        final SubLObject var48 = module0612.f37444(var47);
        final SubLObject var49 = module0612.f37442(var48);
        final SubLObject var50 = module0612.f37442(var1);
        final SubLObject var51 = var50.numG(var49) ? Numbers.add(Numbers.multiply(module0048.f_1X(var46), (SubLObject)SEVEN_INTEGER), Numbers.subtract(var49, var50)) : Numbers.add(Numbers.multiply(var46, (SubLObject)SEVEN_INTEGER), Numbers.subtract(var49, var50));
        return module0612.f37450(module0612.f37424(var47, $ic42$, (SubLObject)UNPROVIDED), (SubLObject)ConsesLow.list($ic22$, var51));
    }
    
    public static SubLObject f37770(final SubLObject var47, final SubLObject var1, final SubLObject var46) {
        final SubLObject var48 = f37729($ic42$, var47);
        final SubLObject var49 = module0612.f37444(var47);
        final SubLObject var50 = module0612.f37442(var49);
        final SubLObject var51 = module0612.f37442(var1);
        final SubLObject var52 = (var51.numG(var50) || (var51.numE(var50) && NIL != var48)) ? Numbers.add(Numbers.multiply(var46, (SubLObject)SEVEN_INTEGER), Numbers.subtract(var51, var50)) : Numbers.add(Numbers.multiply(module0048.f_1X(var46), (SubLObject)SEVEN_INTEGER), Numbers.subtract(var51, var50));
        return module0612.f37453(module0612.f37424(var47, $ic42$, (SubLObject)UNPROVIDED), (SubLObject)ConsesLow.list($ic22$, var52));
    }
    
    public static SubLObject f37766(final SubLObject var47, final SubLObject var1, final SubLObject var46) {
        final SubLObject var48 = module0612.f37405(var47);
        final SubLObject var49 = module0612.f37461(var1);
        final SubLObject var50 = var49.numG(var48) ? module0048.f_1X(var46) : var46;
        final SubLObject var51 = module0612.f37450(module0612.f37424(var47, $ic42$, (SubLObject)UNPROVIDED), (SubLObject)ConsesLow.list($ic22$, var50));
        return (SubLObject)ConsesLow.list($ic73$, var49, var51);
    }
    
    public static SubLObject f37771(final SubLObject var47, final SubLObject var1, final SubLObject var46) {
        final SubLObject var48 = f37729($ic41$, var47);
        final SubLObject var49 = module0612.f37405(var47);
        final SubLObject var50 = module0612.f37461(var1);
        final SubLObject var51 = (var50.numG(var49) || (var50.numE(var49) && NIL != var48)) ? var46 : module0048.f_1X(var46);
        final SubLObject var52 = module0612.f37453(module0612.f37424(var47, $ic42$, (SubLObject)UNPROVIDED), (SubLObject)ConsesLow.list($ic22$, var51));
        return (SubLObject)ConsesLow.list($ic73$, var50, var52);
    }
    
    public static SubLObject f37767(final SubLObject var47, final SubLObject var1, final SubLObject var46) {
        if (NIL == f37728(var1)) {
            return Errors.error((SubLObject)$ic65$, var1);
        }
        final SubLObject var48 = module0205.f13368(var1, (SubLObject)UNPROVIDED);
        final SubLObject var49 = module0612.f37417(module0205.f13277(var1, (SubLObject)UNPROVIDED));
        final SubLObject var50 = module0612.f37404(var47);
        final SubLObject var51 = module0612.f37403(var47);
        final SubLObject var52 = module0612.f37400(var47);
        final SubLObject var53 = (var49.numG(var51) || (var49.numE(var51) && var48.numG(var50))) ? module0048.f_1X(var46) : var46;
        final SubLObject var54 = Numbers.subtract(var52, var53);
        return module0612.f37428(var54, var49, var48, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f37772(final SubLObject var47, final SubLObject var1, final SubLObject var46) {
        if (NIL == f37728(var1)) {
            return Errors.error((SubLObject)$ic65$, var1);
        }
        final SubLObject var48 = f37729($ic42$, var47);
        final SubLObject var49 = module0205.f13368(var1, (SubLObject)UNPROVIDED);
        final SubLObject var50 = module0612.f37417(module0205.f13277(var1, (SubLObject)UNPROVIDED));
        final SubLObject var51 = module0612.f37404(var47);
        final SubLObject var52 = module0612.f37403(var47);
        final SubLObject var53 = module0612.f37400(var47);
        final SubLObject var54 = (var50.numG(var52) || (var50.numE(var52) && var49.numG(var51)) || (var50.numE(var52) && NIL != var48)) ? var46 : module0048.f_1X(var46);
        final SubLObject var55 = Numbers.add(var53, var54);
        return module0612.f37428(var55, var50, var49, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f37768(final SubLObject var47, final SubLObject var46) {
        final SubLObject var48 = module0612.f37424(var47, $ic42$, (SubLObject)UNPROVIDED);
        final SubLObject var49 = module0612.f37444(var48);
        SubLObject var50 = (SubLObject)NIL;
        SubLObject var51 = (SubLObject)NIL;
        final SubLObject var52 = var49;
        if (var52.eql($ic70$)) {
            var50 = module0612.f37450(var48, (SubLObject)$ic71$);
            var51 = $ic74$;
        }
        else if (var52.eql($ic55$)) {
            var50 = module0612.f37450(var48, (SubLObject)$ic75$);
            var51 = $ic74$;
        }
        else {
            var50 = var48;
            var51 = var49;
        }
        if (var46.isZero()) {
            return var50;
        }
        final SubLObject var53 = Numbers.integerDivide(var46, (SubLObject)FIVE_INTEGER);
        final SubLObject var54 = Numbers.mod(var46, (SubLObject)FIVE_INTEGER);
        final SubLObject var55 = module0612.f37450(var50, (SubLObject)ConsesLow.list($ic24$, var53));
        final SubLObject var56 = Numbers.subtract(module0612.f37442(var51), (SubLObject)ONE_INTEGER);
        if (var54.isZero()) {
            return var55;
        }
        if (var54.numLE(var56)) {
            return module0612.f37450(var55, (SubLObject)ConsesLow.list($ic22$, var54));
        }
        return module0612.f37450(var55, (SubLObject)ConsesLow.list($ic22$, Numbers.add((SubLObject)TWO_INTEGER, var54)));
    }
    
    public static SubLObject f37773(final SubLObject var47, final SubLObject var46) {
        final SubLObject var48 = f37729($ic42$, var47);
        SubLObject var49 = module0612.f37424(var47, $ic42$, (SubLObject)UNPROVIDED);
        final SubLObject var50 = module0612.f37444(var49);
        SubLObject var51 = (SubLObject)NIL;
        SubLObject var52 = (SubLObject)NIL;
        if (NIL == var48) {
            var49 = module0612.f37453(var49, (SubLObject)$ic71$);
        }
        final SubLObject var53 = var50;
        if (var53.eql($ic70$)) {
            var51 = module0612.f37453(var49, (SubLObject)$ic75$);
            var52 = $ic67$;
        }
        else if (var53.eql($ic55$)) {
            var51 = module0612.f37453(var49, (SubLObject)$ic71$);
            var52 = $ic67$;
        }
        else {
            var51 = var49;
            var52 = var50;
        }
        if (var46.isZero()) {
            return var51;
        }
        final SubLObject var54 = Numbers.integerDivide(var46, (SubLObject)FIVE_INTEGER);
        final SubLObject var55 = Numbers.mod(var46, (SubLObject)FIVE_INTEGER);
        final SubLObject var56 = module0612.f37453(var51, (SubLObject)ConsesLow.list($ic24$, var54));
        final SubLObject var57 = Numbers.subtract(module0612.f37442(var52), (SubLObject)ONE_INTEGER);
        if (var55.isZero()) {
            return var56;
        }
        if (Numbers.add(var55, var57).numLE((SubLObject)FOUR_INTEGER)) {
            return module0612.f37453(var56, (SubLObject)ConsesLow.list($ic22$, var55));
        }
        return module0612.f37453(var56, (SubLObject)ConsesLow.list($ic22$, Numbers.add((SubLObject)TWO_INTEGER, var55)));
    }
    
    public static SubLObject f37774() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0615", "f37680", "S#20095", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0615", "f37681", "S#20086", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0615", "f37683", "S#20118", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0615", "f37688", "S#41091", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0615", "f37682", "S#41090", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0615", "f37685", "S#41322", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0615", "f37689", "S#41323", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0615", "f37690", "S#41324", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0615", "f37684", "S#20092", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0615", "f37691", "S#20113", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0615", "f37687", "S#20112", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0615", "f37692", "S#41276", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0615", "f37693", "S#41279", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0615", "f37694", "S#41277", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0615", "f37695", "S#41278", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0615", "f37696", "S#20085", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0615", "f37699", "S#35866", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0615", "f37697", "S#20087", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0615", "f37698", "S#20088", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0615", "f37700", "S#20115", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0615", "f37702", "S#34853", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0615", "f37703", "S#20114", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0615", "f37704", "S#41275", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0615", "f37706", "S#20089", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0615", "f37686", "S#34898", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0615", "f37705", "S#34899", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0615", "f37707", "S#34855", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0615", "f37701", "S#34895", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0615", "f37708", "S#34896", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0615", "f37710", "S#41325", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0615", "f37711", "S#34897", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0615", "f37712", "S#20116", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0615", "f37713", "S#41326", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0615", "f37709", "S#20090", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0615", "f37714", "S#20096", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0615", "f37718", "S#20097", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0615", "f37721", "S#41327", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0615", "f37716", "S#34893", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0615", "f37722", "S#34894", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0615", "f37715", "S#41328", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0615", "f37719", "S#41329", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0615", "f37723", "S#41330", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0615", "f37724", "S#41331", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0615", "f37725", "S#13444", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0615", "f37727", "S#13445", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0615", "f37728", "S#41332", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0615", "f37729", "S#41333", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0615", "f37730", "S#41334", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0615", "f37731", "S#41335", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0615", "f37732", "S#41336", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0615", "f37733", "S#41337", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0615", "f37720", "S#13451", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0615", "f37736", "S#13450", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0615", "f37717", "S#24875", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0615", "f37739", "S#41338", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0615", "f37740", "S#41339", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0615", "f37741", "S#13452", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0615", "f37742", "S#41340", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0615", "f37743", "S#13448", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0615", "f37745", "S#41341", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0615", "f37746", "S#41342", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0615", "f37748", "S#41343", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0615", "f37750", "S#41344", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0615", "f37726", "S#13449", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0615", "f37752", "S#41345", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0615", "f37753", "S#24874", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0615", "f37734", "S#41346", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0615", "f37735", "S#41347", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0615", "f37737", "S#41348", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0615", "f37738", "S#41349", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0615", "f37744", "S#41350", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0615", "f37751", "S#41351", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0615", "f37747", "S#41352", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0615", "f37749", "S#41353", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0615", "f37754", "S#41354", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0615", "f37757", "S#41355", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0615", "f37755", "S#41356", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0615", "f37758", "S#41357", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0615", "f37760", "S#41358", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0615", "f37762", "S#41359", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0615", "f37756", "S#41360", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0615", "f37759", "S#41361", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0615", "f37761", "S#41362", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0615", "f37763", "S#41363", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0615", "f37764", "S#41364", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0615", "f37769", "S#41365", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0615", "f37765", "S#41366", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0615", "f37770", "S#41367", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0615", "f37766", "S#41368", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0615", "f37771", "S#41369", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0615", "f37767", "S#41370", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0615", "f37772", "S#41371", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0615", "f37768", "S#41372", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0615", "f37773", "S#41373", 2, 0, false);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f37775() {
        $g4732$ = SubLFiles.defconstant("S#41374", (SubLObject)$ic15$);
        $g4731$ = SubLFiles.defconstant("S#41375", (SubLObject)$ic16$);
        $g4733$ = SubLFiles.defconstant("S#41376", (SubLObject)$ic17$);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f37776() {
        return (SubLObject)NIL;
    }
    
    public void declareFunctions() {
        f37774();
    }
    
    public void initializeVariables() {
        f37775();
    }
    
    public void runTopLevelForms() {
        f37776();
    }
    
    static {
        me = (SubLFile)new module0615();
        $g4732$ = null;
        $g4731$ = null;
        $g4733$ = null;
        $ic0$ = constant_handles_oc.f8479((SubLObject)makeString("TimePoint"));
        $ic1$ = constant_handles_oc.f8479((SubLObject)makeString("ConventionallyClassifiedTimeIntervalSeries"));
        $ic2$ = constant_handles_oc.f8479((SubLObject)makeString("UniversalVocabularyMt"));
        $ic3$ = makeKeyword("PERIOD");
        $ic4$ = constant_handles_oc.f8479((SubLObject)makeString("durationOfType"));
        $ic5$ = ConsesLow.list((SubLObject)makeKeyword("PERIOD"));
        $ic6$ = constant_handles_oc.f8479((SubLObject)makeString("CalendarCoveringType"));
        $ic7$ = constant_handles_oc.f8479((SubLObject)makeString("ConventionallyClassifiedTimeIntervalSeries-DisjointWithGaps"));
        $ic8$ = constant_handles_oc.f8479((SubLObject)makeString("periodOfTimeIntervalSeries"));
        $ic9$ = constant_handles_oc.f8479((SubLObject)makeString("MonthOfYearType"));
        $ic10$ = constant_handles_oc.f8479((SubLObject)makeString("DayOfYearType"));
        $ic11$ = constant_handles_oc.f8479((SubLObject)makeString("DayOfWeekType"));
        $ic12$ = constant_handles_oc.f8479((SubLObject)makeString("HourOfDayType"));
        $ic13$ = constant_handles_oc.f8479((SubLObject)makeString("SameLengthTimeIntervalTypeFn"));
        $ic14$ = constant_handles_oc.f8479((SubLObject)makeString("Null-TimeParameter"));
        $ic15$ = ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("SecondsDuration")), (SubLObject)ONE_INTEGER);
        $ic16$ = ConsesLow.list(new SubLObject[] { constant_handles_oc.f8479((SubLObject)makeString("SecondsDuration")), constant_handles_oc.f8479((SubLObject)makeString("MinutesDuration")), constant_handles_oc.f8479((SubLObject)makeString("HoursDuration")), constant_handles_oc.f8479((SubLObject)makeString("DaysDuration")), constant_handles_oc.f8479((SubLObject)makeString("WeeksDuration")), constant_handles_oc.f8479((SubLObject)makeString("MonthsDuration")), constant_handles_oc.f8479((SubLObject)makeString("QuartersDuration")), constant_handles_oc.f8479((SubLObject)makeString("YearsDuration")), constant_handles_oc.f8479((SubLObject)makeString("DecadesDuration")), constant_handles_oc.f8479((SubLObject)makeString("CenturiesDuration")), constant_handles_oc.f8479((SubLObject)makeString("MillenniaDuration")) });
        $ic17$ = makeKeyword("A-LONG-TIME");
        $ic18$ = constant_handles_oc.f8479((SubLObject)makeString("SecondsDuration"));
        $ic19$ = constant_handles_oc.f8479((SubLObject)makeString("MinutesDuration"));
        $ic20$ = makeInteger(60);
        $ic21$ = constant_handles_oc.f8479((SubLObject)makeString("HoursDuration"));
        $ic22$ = constant_handles_oc.f8479((SubLObject)makeString("DaysDuration"));
        $ic23$ = makeInteger(24);
        $ic24$ = constant_handles_oc.f8479((SubLObject)makeString("WeeksDuration"));
        $ic25$ = constant_handles_oc.f8479((SubLObject)makeString("MonthsDuration"));
        $ic26$ = constant_handles_oc.f8479((SubLObject)makeString("QuartersDuration"));
        $ic27$ = constant_handles_oc.f8479((SubLObject)makeString("YearsDuration"));
        $ic28$ = constant_handles_oc.f8479((SubLObject)makeString("DecadesDuration"));
        $ic29$ = constant_handles_oc.f8479((SubLObject)makeString("CenturiesDuration"));
        $ic30$ = constant_handles_oc.f8479((SubLObject)makeString("MillenniaDuration"));
        $ic31$ = ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("SecondsDuration")), (SubLObject)ZERO_INTEGER);
        $ic32$ = ConsesLow.list((SubLObject)ONE_INTEGER);
        $ic33$ = makeString("Type ~a is not a proper ConventionallyClassifiedTimeIntervalSeries.");
        $ic34$ = makeString("Interval ~a is not a proper interval for offset calculations.");
        $ic35$ = constant_handles_oc.f8479((SubLObject)makeString("IntervalEndedByFn"));
        $ic36$ = constant_handles_oc.f8479((SubLObject)makeString("Always-TimeInterval"));
        $ic37$ = constant_handles_oc.f8479((SubLObject)makeString("IntervalStartedByFn"));
        $ic38$ = constant_handles_oc.f8479((SubLObject)makeString("DayOfYearFn"));
        $ic39$ = constant_handles_oc.f8479((SubLObject)makeString("CalendarSecond"));
        $ic40$ = constant_handles_oc.f8479((SubLObject)makeString("CalendarMinute"));
        $ic41$ = constant_handles_oc.f8479((SubLObject)makeString("CalendarHour"));
        $ic42$ = constant_handles_oc.f8479((SubLObject)makeString("CalendarDay"));
        $ic43$ = constant_handles_oc.f8479((SubLObject)makeString("CalendarMonth"));
        $ic44$ = constant_handles_oc.f8479((SubLObject)makeString("CalendarYear"));
        $ic45$ = constant_handles_oc.f8479((SubLObject)makeString("CalendarWeek"));
        $ic46$ = constant_handles_oc.f8479((SubLObject)makeString("CalendarQuarter"));
        $ic47$ = constant_handles_oc.f8479((SubLObject)makeString("CalendarDecade"));
        $ic48$ = constant_handles_oc.f8479((SubLObject)makeString("CalendarHalfCentury"));
        $ic49$ = makeInteger(50);
        $ic50$ = constant_handles_oc.f8479((SubLObject)makeString("CalendarCentury"));
        $ic51$ = makeInteger(100);
        $ic52$ = constant_handles_oc.f8479((SubLObject)makeString("CalendarMillennium"));
        $ic53$ = makeInteger(1000);
        $ic54$ = makeString("Unknown time type ~a.");
        $ic55$ = constant_handles_oc.f8479((SubLObject)makeString("Sunday"));
        $ic56$ = ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("DaysDuration")), (SubLObject)SIX_INTEGER);
        $ic57$ = constant_handles_oc.f8479((SubLObject)makeString("TimeIntervalInclusiveFn"));
        $ic58$ = makeKeyword("QUARTER");
        $ic59$ = makeKeyword("DECADE");
        $ic60$ = makeKeyword("CENTURY");
        $ic61$ = makeInteger(51);
        $ic62$ = makeInteger(49);
        $ic63$ = constant_handles_oc.f8479((SubLObject)makeString("YearFn"));
        $ic64$ = makeInteger(999);
        $ic65$ = makeString("No support for type ~a.");
        $ic66$ = constant_handles_oc.f8479((SubLObject)makeString("CalendarWorkWeek"));
        $ic67$ = constant_handles_oc.f8479((SubLObject)makeString("Monday"));
        $ic68$ = ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("DaysDuration")), (SubLObject)FOUR_INTEGER);
        $ic69$ = constant_handles_oc.f8479((SubLObject)makeString("CalendarWeekend"));
        $ic70$ = constant_handles_oc.f8479((SubLObject)makeString("Saturday"));
        $ic71$ = ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("DaysDuration")), (SubLObject)ONE_INTEGER);
        $ic72$ = constant_handles_oc.f8479((SubLObject)makeString("Weekday"));
        $ic73$ = constant_handles_oc.f8479((SubLObject)makeString("HourFn"));
        $ic74$ = constant_handles_oc.f8479((SubLObject)makeString("Friday"));
        $ic75$ = ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("DaysDuration")), (SubLObject)TWO_INTEGER);
    }
}

/*
	DECOMPILATION REPORT

	Decompiled from: G:\opt\CYC_JRTL_with_CommonLisp\platform\lib\cyc-oc4.0-unzipped/com/cyc/cycjava/cycl/class
	Total time: 321 ms
	
	Decompiled with Procyon 0.5.32.
*/