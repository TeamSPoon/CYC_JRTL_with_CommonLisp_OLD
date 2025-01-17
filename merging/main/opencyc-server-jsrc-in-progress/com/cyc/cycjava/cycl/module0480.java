package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Time;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sort;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class module0480 extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.module0480";
    public static final String myFingerPrint = "a33045c12a715bc7eae56796bd2098f7788709aacf17730db25677f6cf80c7b5";
    private static final SubLObject $ic0$;
    private static final SubLSymbol $ic1$;
    private static final SubLSymbol $ic2$;
    private static final SubLSymbol $ic3$;
    private static final SubLList $ic4$;
    private static final SubLSymbol $ic5$;
    private static final SubLSymbol $ic6$;
    private static final SubLList $ic7$;
    private static final SubLList $ic8$;
    private static final SubLInteger $ic9$;
    private static final SubLSymbol $ic10$;
    private static final SubLSymbol $ic11$;
    private static final SubLSymbol $ic12$;
    private static final SubLSymbol $ic13$;
    private static final SubLList $ic14$;
    private static final SubLSymbol $ic15$;
    private static final SubLSymbol $ic16$;
    private static final SubLSymbol $ic17$;
    private static final SubLSymbol $ic18$;
    private static final SubLSymbol $ic19$;
    private static final SubLList $ic20$;
    private static final SubLObject $ic21$;
    private static final SubLSymbol $ic22$;
    private static final SubLSymbol $ic23$;
    private static final SubLObject $ic24$;
    private static final SubLObject $ic25$;
    private static final SubLSymbol $ic26$;
    private static final SubLSymbol $ic27$;
    private static final SubLList $ic28$;
    private static final SubLSymbol $ic29$;
    private static final SubLList $ic30$;
    private static final SubLList $ic31$;
    private static final SubLSymbol $ic32$;
    private static final SubLList $ic33$;
    private static final SubLObject $ic34$;
    private static final SubLSymbol $ic35$;
    private static final SubLList $ic36$;
    private static final SubLSymbol $ic37$;
    private static final SubLSymbol $ic38$;
    private static final SubLList $ic39$;
    private static final SubLList $ic40$;
    private static final SubLInteger $ic41$;
    private static final SubLObject $ic42$;
    private static final SubLObject $ic43$;
    private static final SubLObject $ic44$;
    private static final SubLSymbol $ic45$;
    private static final SubLObject $ic46$;
    private static final SubLObject $ic47$;
    private static final SubLList $ic48$;
    private static final SubLSymbol $ic49$;
    private static final SubLObject $ic50$;
    private static final SubLSymbol $ic51$;
    private static final SubLList $ic52$;
    private static final SubLList $ic53$;
    private static final SubLSymbol $ic54$;
    private static final SubLList $ic55$;
    private static final SubLList $ic56$;
    private static final SubLSymbol $ic57$;
    private static final SubLList $ic58$;
    private static final SubLList $ic59$;
    private static final SubLList $ic60$;
    private static final SubLSymbol $ic61$;
    private static final SubLList $ic62$;
    private static final SubLList $ic63$;
    private static final SubLSymbol $ic64$;
    private static final SubLSymbol $ic65$;
    private static final SubLSymbol $ic66$;
    private static final SubLSymbol $ic67$;
    private static final SubLSymbol $ic68$;
    private static final SubLString $ic69$;
    private static final SubLSymbol $ic70$;
    private static final SubLSymbol $ic71$;
    private static final SubLString $ic72$;
    private static final SubLSymbol $ic73$;
    private static final SubLString $ic74$;
    private static final SubLString $ic75$;
    private static final SubLString $ic76$;
    private static final SubLList $ic77$;
    private static final SubLString $ic78$;
    private static final SubLSymbol $ic79$;
    private static final SubLList $ic80$;
    private static final SubLObject $ic81$;
    private static final SubLSymbol $ic82$;
    private static final SubLList $ic83$;
    private static final SubLSymbol $ic84$;
    private static final SubLSymbol $ic85$;
    private static final SubLList $ic86$;
    private static final SubLSymbol $ic87$;
    private static final SubLSymbol $ic88$;
    private static final SubLSymbol $ic89$;
    private static final SubLSymbol $ic90$;
    private static final SubLObject $ic91$;
    private static final SubLList $ic92$;
    private static final SubLSymbol $ic93$;
    private static final SubLList $ic94$;
    private static final SubLList $ic95$;
    private static final SubLList $ic96$;
    private static final SubLList $ic97$;
    private static final SubLSymbol $ic98$;
    private static final SubLSymbol $ic99$;
    private static final SubLSymbol $ic100$;
    private static final SubLList $ic101$;
    private static final SubLSymbol $ic102$;
    private static final SubLList $ic103$;
    private static final SubLObject $ic104$;
    private static final SubLSymbol $ic105$;
    private static final SubLList $ic106$;
    private static final SubLList $ic107$;
    private static final SubLSymbol $ic108$;
    private static final SubLList $ic109$;
    private static final SubLObject $ic110$;
    private static final SubLObject $ic111$;
    private static final SubLSymbol $ic112$;
    private static final SubLObject $ic113$;
    private static final SubLSymbol $ic114$;
    private static final SubLList $ic115$;
    private static final SubLList $ic116$;
    private static final SubLObject $ic117$;
    private static final SubLSymbol $ic118$;
    private static final SubLSymbol $ic119$;
    private static final SubLList $ic120$;
    private static final SubLList $ic121$;
    private static final SubLList $ic122$;
    private static final SubLSymbol $ic123$;
    private static final SubLSymbol $ic124$;
    private static final SubLList $ic125$;
    private static final SubLList $ic126$;
    private static final SubLInteger $ic127$;
    private static final SubLSymbol $ic128$;
    private static final SubLList $ic129$;
    private static final SubLList $ic130$;
    private static final SubLList $ic131$;
    private static final SubLSymbol $ic132$;
    private static final SubLSymbol $ic133$;
    private static final SubLList $ic134$;
    private static final SubLList $ic135$;
    private static final SubLList $ic136$;
    
    public static SubLObject f31754(final SubLObject var1, SubLObject var2) {
        if (var2 == UNPROVIDED) {
            var2 = (SubLObject)NIL;
        }
        return f31755(var1);
    }
    
    public static SubLObject f31756(final SubLObject var1, SubLObject var2) {
        if (var2 == UNPROVIDED) {
            var2 = (SubLObject)NIL;
        }
        final SubLObject var3 = f31757(var1);
        if (NIL != var3) {
            final SubLObject var4 = f31758(var1);
            module0347.f23330(var4, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f31755(final SubLObject var1) {
        final SubLObject var2 = module0205.f13387(var1, (SubLObject)UNPROVIDED);
        return f31759(Numbers.min((SubLObject)ONE_INTEGER, module0549.f33895(var2)));
    }
    
    public static SubLObject f31760(final SubLObject var1, SubLObject var2) {
        if (var2 == UNPROVIDED) {
            var2 = (SubLObject)NIL;
        }
        return module0435.f30613(f31755(var1));
    }
    
    public static SubLObject f31761(final SubLObject var1, SubLObject var2) {
        if (var2 == UNPROVIDED) {
            var2 = (SubLObject)NIL;
        }
        if (NIL == f31757(var1)) {
            module0347.f23330(module0191.f11990((SubLObject)$ic5$, module0205.f13338(var1), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f31762(final SubLObject var1, SubLObject var2) {
        if (var2 == UNPROVIDED) {
            var2 = (SubLObject)NIL;
        }
        final SubLObject var3 = module0205.f13387(var1, (SubLObject)UNPROVIDED);
        return module0549.f33895(var3);
    }
    
    public static SubLObject f31763(final SubLObject var6, final SubLObject var7) {
        SubLObject var9;
        final SubLObject var8 = var9 = var6.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var9, var8, (SubLObject)$ic8$);
        final SubLObject var10 = var9.rest();
        var9 = var9.first();
        SubLObject var11 = (SubLObject)NIL;
        SubLObject var12 = (SubLObject)NIL;
        SubLObject var13 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var9, var8, (SubLObject)$ic8$);
        var11 = var9.first();
        var9 = var9.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var9, var8, (SubLObject)$ic8$);
        var12 = var9.first();
        var9 = var9.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var9, var8, (SubLObject)$ic8$);
        var13 = var9.first();
        var9 = var9.rest();
        final SubLObject var14 = (SubLObject)(var9.isCons() ? var9.first() : $ic9$);
        cdestructuring_bind.destructuring_bind_must_listp(var9, var8, (SubLObject)$ic8$);
        var9 = var9.rest();
        if (NIL == var9) {
            final SubLObject var15;
            var9 = (var15 = var10);
            final SubLObject var16 = (SubLObject)$ic10$;
            final SubLObject var17 = (SubLObject)$ic11$;
            return (SubLObject)ConsesLow.list((SubLObject)$ic12$, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(var16, (SubLObject)ConsesLow.listS((SubLObject)$ic13$, var12, (SubLObject)$ic14$))), (SubLObject)ConsesLow.list((SubLObject)$ic15$, var13, (SubLObject)ConsesLow.list((SubLObject)$ic16$, var16, var14)), (SubLObject)ConsesLow.list((SubLObject)$ic12$, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(var17, (SubLObject)ConsesLow.list((SubLObject)$ic17$, var13, var16, (SubLObject)ConsesLow.list((SubLObject)$ic18$, var14, var16)))), (SubLObject)ConsesLow.listS((SubLObject)$ic19$, (SubLObject)ConsesLow.list(var11, var17), ConsesLow.append(var15, (SubLObject)NIL))));
        }
        cdestructuring_bind.cdestructuring_bind_error(var8, (SubLObject)$ic8$);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f31764(final SubLObject var1, SubLObject var2) {
        if (var2 == UNPROVIDED) {
            var2 = (SubLObject)NIL;
        }
        final SubLThread var3 = SubLProcess.currentSubLThread();
        SubLObject var5;
        final SubLObject var4 = var5 = module0205.f13385(var1, (SubLObject)UNPROVIDED);
        SubLObject var6 = (SubLObject)NIL;
        SubLObject var7 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var5, var4, (SubLObject)$ic20$);
        var6 = var5.first();
        var5 = var5.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var5, var4, (SubLObject)$ic20$);
        var7 = var5.first();
        var5 = var5.rest();
        if (NIL == var5) {
            final SubLObject var8 = $ic21$;
            final SubLObject var9 = module0141.f9295(var8);
            SubLObject var10 = (SubLObject)NIL;
            SubLObject var11 = (SubLObject)NIL;
            final SubLObject var12 = module0259.f16848(var6, (SubLObject)NIL, $ic21$);
            var11 = module0035.f1994(var12, (SubLObject)$ic9$, (SubLObject)UNPROVIDED);
            SubLObject var14;
            final SubLObject var13 = var14 = ((NIL != var11) ? var12 : module0035.f2101((SubLObject)$ic9$, var12));
            SubLObject var15 = (SubLObject)NIL;
            var15 = var14.first();
            while (NIL != var14) {
                SubLObject var26_28;
                final SubLObject var16 = var26_28 = module0349.f23459(var15, (SubLObject)ONE_INTEGER, (SubLObject)UNPROVIDED);
                SubLObject var17 = (SubLObject)NIL;
                var17 = var26_28.first();
                while (NIL != var26_28) {
                    if (NIL == module0004.f104(var17, var10, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED) && NIL != module0226.f14807(var17) && NIL != f31765(var15, var17, (SubLObject)ONE_INTEGER, var9)) {
                        var3.resetMultipleValues();
                        final SubLObject var18 = module0235.f15474(var7, var17, (SubLObject)T, (SubLObject)T);
                        final SubLObject var19 = var3.secondMultipleValue();
                        var3.resetMultipleValues();
                        if (NIL != var18) {
                            final SubLObject var20 = module0202.f12817((SubLObject)TWO_INTEGER, var17, var1);
                            final SubLObject var21 = f31758(var20);
                            module0347.f23330(var21, var18, var19);
                            var10 = (SubLObject)ConsesLow.cons(var17, var10);
                        }
                    }
                    var26_28 = var26_28.rest();
                    var17 = var26_28.first();
                }
                var14 = var14.rest();
                var15 = var14.first();
            }
        }
        else {
            cdestructuring_bind.cdestructuring_bind_error(var4, (SubLObject)$ic20$);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f31765(final SubLObject var34, final SubLObject var29, final SubLObject var35, final SubLObject var36) {
        SubLObject var37 = (SubLObject)NIL;
        if (NIL != module0158.f10010(var34, var35, var29)) {
            final SubLObject var38 = module0158.f10011(var34, var35, var29);
            SubLObject var39 = var37;
            final SubLObject var40 = (SubLObject)NIL;
            while (NIL == var39) {
                final SubLObject var41 = module0052.f3695(var38, var40);
                final SubLObject var42 = (SubLObject)makeBoolean(!var40.eql(var41));
                if (NIL != var42) {
                    SubLObject var43 = (SubLObject)NIL;
                    try {
                        var43 = module0158.f10316(var41, (SubLObject)$ic22$, var36, (SubLObject)NIL);
                        SubLObject var40_45 = var37;
                        final SubLObject var41_46 = (SubLObject)NIL;
                        while (NIL == var40_45) {
                            final SubLObject var44 = module0052.f3695(var43, var41_46);
                            final SubLObject var43_48 = (SubLObject)makeBoolean(!var41_46.eql(var44));
                            if (NIL != var43_48) {
                                var37 = module0178.f11375(var44);
                            }
                            var40_45 = (SubLObject)makeBoolean(NIL == var43_48 || NIL != var37);
                        }
                    }
                    finally {
                        final SubLObject var45 = Dynamic.currentBinding(Threads.$is_thread_performing_cleanupP$);
                        try {
                            Dynamic.bind(Threads.$is_thread_performing_cleanupP$, (SubLObject)T);
                            if (NIL != var43) {
                                module0158.f10319(var43);
                            }
                        }
                        finally {
                            Dynamic.rebind(Threads.$is_thread_performing_cleanupP$, var45);
                        }
                    }
                }
                var39 = (SubLObject)makeBoolean(NIL == var42 || NIL != var37);
            }
        }
        return var37;
    }
    
    public static SubLObject f31766(final SubLObject var1, final SubLObject var50) {
        final SubLThread var51 = SubLProcess.currentSubLThread();
        SubLObject var52 = (SubLObject)NIL;
        final SubLObject var53 = module0205.f13387(var1, (SubLObject)UNPROVIDED);
        final SubLObject var54 = module0147.f9540(var50);
        final SubLObject var55 = module0147.$g2095$.currentBinding(var51);
        final SubLObject var56 = module0147.$g2094$.currentBinding(var51);
        final SubLObject var57 = module0147.$g2096$.currentBinding(var51);
        try {
            module0147.$g2095$.bind(module0147.f9545(var54), var51);
            module0147.$g2094$.bind(module0147.f9546(var54), var51);
            module0147.$g2096$.bind(module0147.f9549(var54), var51);
            final SubLObject var58 = f31757(var1);
            if (NIL != var58) {
                final SubLObject var59 = f31767();
                final SubLObject var60 = module0178.f11334(var58);
                final SubLObject var61 = module0191.f11990((SubLObject)$ic23$, module0202.f12768($ic24$, var60, var53), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                final SubLObject var62 = module0202.f12643($ic25$, module0178.f11285(var58));
                final SubLObject var63 = module0191.f11990((SubLObject)$ic26$, var62, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                var52 = (SubLObject)ConsesLow.list(var61, var58, var63, var59);
            }
        }
        finally {
            module0147.$g2096$.rebind(var57, var51);
            module0147.$g2094$.rebind(var56, var51);
            module0147.$g2095$.rebind(var55, var51);
        }
        return var52;
    }
    
    public static SubLObject f31767() {
        return module0191.f11990((SubLObject)$ic27$, (SubLObject)$ic28$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f31768(final SubLObject var1, SubLObject var2) {
        if (var2 == UNPROVIDED) {
            var2 = (SubLObject)NIL;
        }
        final SubLObject var3 = module0205.f13388(var1, (SubLObject)UNPROVIDED);
        return module0217.f14247(var3, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f31769(final SubLObject var1, SubLObject var2) {
        if (var2 == UNPROVIDED) {
            var2 = (SubLObject)NIL;
        }
        final SubLThread var3 = SubLProcess.currentSubLThread();
        SubLObject var5;
        final SubLObject var4 = var5 = module0205.f13385(var1, (SubLObject)UNPROVIDED);
        SubLObject var6 = (SubLObject)NIL;
        SubLObject var7 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var5, var4, (SubLObject)$ic31$);
        var6 = var5.first();
        var5 = var5.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var5, var4, (SubLObject)$ic31$);
        var7 = var5.first();
        var5 = var5.rest();
        if (NIL == var5) {
            if (NIL != module0226.f14807(var7)) {
                final SubLObject var8 = $ic21$;
                final SubLObject var9 = module0141.f9295(var8);
                SubLObject var10 = (SubLObject)NIL;
                SubLObject var11 = f31770(var7, (SubLObject)ONE_INTEGER, var9);
                SubLObject var12 = (SubLObject)NIL;
                var12 = var11.first();
                while (NIL != var11) {
                    SubLObject var26_64 = module0259.f16821(var12, module0147.$g2095$.getDynamicValue(var3), var8);
                    SubLObject var13 = (SubLObject)NIL;
                    var13 = var26_64.first();
                    while (NIL != var26_64) {
                        if (NIL == module0004.f104(var13, var10, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)) {
                            var3.resetMultipleValues();
                            final SubLObject var14 = module0235.f15474(var6, var13, (SubLObject)T, (SubLObject)T);
                            final SubLObject var15 = var3.secondMultipleValue();
                            var3.resetMultipleValues();
                            if (NIL != var14) {
                                final SubLObject var16 = module0202.f12817((SubLObject)ONE_INTEGER, var13, var1);
                                final SubLObject var17 = f31758(var16);
                                module0347.f23330(var17, var14, var15);
                                var10 = (SubLObject)ConsesLow.cons(var13, var10);
                            }
                        }
                        var26_64 = var26_64.rest();
                        var13 = var26_64.first();
                    }
                    var11 = var11.rest();
                    var12 = var11.first();
                }
            }
        }
        else {
            cdestructuring_bind.cdestructuring_bind_error(var4, (SubLObject)$ic31$);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f31771(final SubLObject var1, SubLObject var2) {
        if (var2 == UNPROVIDED) {
            var2 = (SubLObject)NIL;
        }
        return f31772(var1);
    }
    
    public static SubLObject f31773(final SubLObject var1, SubLObject var2) {
        if (var2 == UNPROVIDED) {
            var2 = (SubLObject)NIL;
        }
        final SubLObject var3 = f31774(var1);
        if ($ic37$ == var3) {
            final SubLObject var4 = f31758(var1);
            module0347.f23330(var4, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f31772(final SubLObject var1) {
        SubLObject var3;
        final SubLObject var2 = var3 = module0205.f13385(var1, (SubLObject)UNPROVIDED);
        SubLObject var4 = (SubLObject)NIL;
        SubLObject var5 = (SubLObject)NIL;
        SubLObject var6 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var3, var2, (SubLObject)$ic40$);
        var4 = var3.first();
        var3 = var3.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var3, var2, (SubLObject)$ic40$);
        var5 = var3.first();
        var3 = var3.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var3, var2, (SubLObject)$ic40$);
        var6 = var3.first();
        var3 = var3.rest();
        if (NIL == var3) {
            return f31759(module0048.f3382((SubLObject)ConsesLow.list(module0549.f33895(var4), var6, module0217.f14247(var5, (SubLObject)UNPROVIDED)), (SubLObject)UNPROVIDED));
        }
        cdestructuring_bind.cdestructuring_bind_error(var2, (SubLObject)$ic40$);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f31759(final SubLObject var69) {
        if (var69.numL((SubLObject)TEN_INTEGER)) {
            return module0018.$g659$.getGlobalValue();
        }
        if (var69.numG((SubLObject)$ic41$)) {
            return module0018.$g661$.getGlobalValue();
        }
        return module0018.$g660$.getGlobalValue();
    }
    
    public static SubLObject f31774(final SubLObject var1) {
        SubLObject var3;
        final SubLObject var2 = var3 = module0205.f13385(var1, (SubLObject)UNPROVIDED);
        SubLObject var4 = (SubLObject)NIL;
        SubLObject var5 = (SubLObject)NIL;
        SubLObject var6 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var3, var2, (SubLObject)$ic40$);
        var4 = var3.first();
        var3 = var3.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var3, var2, (SubLObject)$ic40$);
        var5 = var3.first();
        var3 = var3.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var3, var2, (SubLObject)$ic40$);
        var6 = var3.first();
        var3 = var3.rest();
        if (NIL == var3) {
            return f31775(var4, var5, var6);
        }
        cdestructuring_bind.cdestructuring_bind_error(var2, (SubLObject)$ic40$);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f31776(final SubLObject var1, final SubLObject var50) {
        final SubLThread var51 = SubLProcess.currentSubLThread();
        SubLObject var52 = (SubLObject)NIL;
        final SubLObject var53 = module0147.f9540(var50);
        final SubLObject var54 = module0147.$g2095$.currentBinding(var51);
        final SubLObject var55 = module0147.$g2094$.currentBinding(var51);
        final SubLObject var56 = module0147.$g2096$.currentBinding(var51);
        try {
            module0147.$g2095$.bind(module0147.f9545(var53), var51);
            module0147.$g2094$.bind(module0147.f9546(var53), var51);
            module0147.$g2096$.bind(module0147.f9549(var53), var51);
            final SubLObject var57 = f31774(var1);
            if (var57 == $ic37$) {
                SubLObject var59;
                final SubLObject var58 = var59 = module0205.f13385(var1, (SubLObject)UNPROVIDED);
                SubLObject var60 = (SubLObject)NIL;
                SubLObject var61 = (SubLObject)NIL;
                SubLObject var62 = (SubLObject)NIL;
                cdestructuring_bind.destructuring_bind_must_consp(var59, var58, (SubLObject)$ic40$);
                var60 = var59.first();
                var59 = var59.rest();
                cdestructuring_bind.destructuring_bind_must_consp(var59, var58, (SubLObject)$ic40$);
                var61 = var59.first();
                var59 = var59.rest();
                cdestructuring_bind.destructuring_bind_must_consp(var59, var58, (SubLObject)$ic40$);
                var62 = var59.first();
                var59 = var59.rest();
                if (NIL == var59) {
                    final SubLObject var63 = f31777();
                    final SubLObject var64 = module0191.f11990((SubLObject)$ic23$, module0202.f12768($ic24$, var61, $ic42$), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                    final SubLObject var65 = module0202.f12768($ic43$, (SubLObject)ConsesLow.list($ic44$, (SubLObject)$ic45$, (SubLObject)ConsesLow.list($ic46$, (SubLObject)ConsesLow.list($ic24$, (SubLObject)$ic45$, var60), (SubLObject)ConsesLow.list($ic47$, (SubLObject)$ic45$, (SubLObject)ONE_INTEGER, var61))), var62);
                    final SubLObject var66 = module0191.f11990((SubLObject)$ic26$, var65, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                    var52 = (SubLObject)ConsesLow.list(var64, var66, var63);
                }
                else {
                    cdestructuring_bind.cdestructuring_bind_error(var58, (SubLObject)$ic40$);
                }
            }
        }
        finally {
            module0147.$g2096$.rebind(var56, var51);
            module0147.$g2094$.rebind(var55, var51);
            module0147.$g2095$.rebind(var54, var51);
        }
        return var52;
    }
    
    public static SubLObject f31777() {
        final SubLThread var17 = SubLProcess.currentSubLThread();
        final SubLObject var18 = (SubLObject)$ic48$;
        SubLObject var19 = (SubLObject)NIL;
        final SubLObject var20 = module0147.$g2094$.currentBinding(var17);
        final SubLObject var21 = module0147.$g2095$.currentBinding(var17);
        try {
            module0147.$g2094$.bind((SubLObject)$ic49$, var17);
            module0147.$g2095$.bind($ic50$, var17);
            final SubLObject var22 = module0288.f19338(var18, (SubLObject)UNPROVIDED);
            var19 = ((NIL != var22) ? var22 : module0191.f11990((SubLObject)$ic27$, var18, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED));
        }
        finally {
            module0147.$g2095$.rebind(var21, var17);
            module0147.$g2094$.rebind(var20, var17);
        }
        return var19;
    }
    
    public static SubLObject f31778(final SubLObject var1, SubLObject var2) {
        if (var2 == UNPROVIDED) {
            var2 = (SubLObject)NIL;
        }
        return module0435.f30613(f31772(var1));
    }
    
    public static SubLObject f31779(final SubLObject var1, SubLObject var2) {
        if (var2 == UNPROVIDED) {
            var2 = (SubLObject)NIL;
        }
        if ($ic37$ != f31774(var1)) {
            module0347.f23330(module0191.f11990((SubLObject)$ic5$, module0205.f13338(var1), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f31780(final SubLObject var1, SubLObject var2) {
        if (var2 == UNPROVIDED) {
            var2 = (SubLObject)NIL;
        }
        return (SubLObject)ONE_INTEGER;
    }
    
    public static SubLObject f31781(final SubLObject var1, SubLObject var2) {
        if (var2 == UNPROVIDED) {
            var2 = (SubLObject)NIL;
        }
        final SubLThread var3 = SubLProcess.currentSubLThread();
        SubLObject var5;
        final SubLObject var4 = var5 = module0205.f13385(var1, (SubLObject)UNPROVIDED);
        SubLObject var6 = (SubLObject)NIL;
        SubLObject var7 = (SubLObject)NIL;
        SubLObject var8 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var5, var4, (SubLObject)$ic53$);
        var6 = var5.first();
        var5 = var5.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var5, var4, (SubLObject)$ic53$);
        var7 = var5.first();
        var5 = var5.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var5, var4, (SubLObject)$ic53$);
        var8 = var5.first();
        var5 = var5.rest();
        if (NIL == var5) {
            final SubLObject var9 = f31775(var6, var7, var8);
            var3.resetMultipleValues();
            final SubLObject var10 = module0235.f15474(var8, var9, (SubLObject)T, (SubLObject)T);
            final SubLObject var11 = var3.secondMultipleValue();
            var3.resetMultipleValues();
            if (NIL != var10) {
                final SubLObject var12 = module0202.f12817((SubLObject)THREE_INTEGER, var9, var1);
                final SubLObject var13 = f31758(var12);
                module0347.f23330(var13, var10, var11);
            }
        }
        else {
            cdestructuring_bind.cdestructuring_bind_error(var4, (SubLObject)$ic53$);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f31782(final SubLObject var1, SubLObject var2) {
        if (var2 == UNPROVIDED) {
            var2 = (SubLObject)NIL;
        }
        final SubLObject var3 = module0205.f13387(var1, (SubLObject)UNPROVIDED);
        return module0549.f33895(var3);
    }
    
    public static SubLObject f31783(final SubLObject var1, SubLObject var2) {
        if (var2 == UNPROVIDED) {
            var2 = (SubLObject)NIL;
        }
        final SubLThread var3 = SubLProcess.currentSubLThread();
        SubLObject var5;
        final SubLObject var4 = var5 = module0205.f13385(var1, (SubLObject)UNPROVIDED);
        SubLObject var6 = (SubLObject)NIL;
        SubLObject var7 = (SubLObject)NIL;
        SubLObject var8 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var5, var4, (SubLObject)$ic56$);
        var6 = var5.first();
        var5 = var5.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var5, var4, (SubLObject)$ic56$);
        var7 = var5.first();
        var5 = var5.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var5, var4, (SubLObject)$ic56$);
        var8 = var5.first();
        var5 = var5.rest();
        if (NIL == var5) {
            SubLObject var9 = (SubLObject)NIL;
            SubLObject var10 = (SubLObject)NIL;
            final SubLObject var11 = module0259.f16848(var6, (SubLObject)NIL, $ic21$);
            var10 = module0035.f1994(var11, (SubLObject)$ic9$, (SubLObject)UNPROVIDED);
            SubLObject var13;
            final SubLObject var12 = var13 = ((NIL != var10) ? var11 : module0035.f2101((SubLObject)$ic9$, var11));
            SubLObject var14 = (SubLObject)NIL;
            var14 = var13.first();
            while (NIL != var13) {
                SubLObject var26_83;
                final SubLObject var15 = var26_83 = module0349.f23459(var14, (SubLObject)ONE_INTEGER, (SubLObject)UNPROVIDED);
                SubLObject var16 = (SubLObject)NIL;
                var16 = var26_83.first();
                while (NIL != var26_83) {
                    if (NIL == module0004.f104(var16, var9, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)) {
                        var9 = (SubLObject)ConsesLow.cons(var16, var9);
                        if ($ic37$ == f31775(var6, var16, var8)) {
                            var3.resetMultipleValues();
                            final SubLObject var17 = module0235.f15474(var7, var16, (SubLObject)T, (SubLObject)T);
                            final SubLObject var18 = var3.secondMultipleValue();
                            var3.resetMultipleValues();
                            if (NIL != var17) {
                                final SubLObject var19 = module0202.f12817((SubLObject)TWO_INTEGER, var16, var1);
                                final SubLObject var20 = f31758(var19);
                                module0347.f23330(var20, var17, var18);
                            }
                        }
                    }
                    var26_83 = var26_83.rest();
                    var16 = var26_83.first();
                }
                var13 = var13.rest();
                var14 = var13.first();
            }
        }
        else {
            cdestructuring_bind.cdestructuring_bind_error(var4, (SubLObject)$ic56$);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f31784(final SubLObject var1, SubLObject var2) {
        if (var2 == UNPROVIDED) {
            var2 = (SubLObject)NIL;
        }
        SubLObject var4;
        final SubLObject var3 = var4 = module0205.f13385(var1, (SubLObject)UNPROVIDED);
        SubLObject var5 = (SubLObject)NIL;
        SubLObject var6 = (SubLObject)NIL;
        SubLObject var7 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic59$);
        var5 = var4.first();
        var4 = var4.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic59$);
        var6 = var4.first();
        var4 = var4.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic59$);
        var7 = var4.first();
        var4 = var4.rest();
        if (NIL == var4) {
            return module0048.f3382((SubLObject)ConsesLow.list(var7, module0217.f14247(var6, (SubLObject)UNPROVIDED)), (SubLObject)UNPROVIDED);
        }
        cdestructuring_bind.cdestructuring_bind_error(var3, (SubLObject)$ic59$);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f31785(final SubLObject var1, SubLObject var2) {
        if (var2 == UNPROVIDED) {
            var2 = (SubLObject)NIL;
        }
        return f31786(var1, (SubLObject)$ic60$);
    }
    
    public static SubLObject f31787(final SubLObject var1, SubLObject var2) {
        if (var2 == UNPROVIDED) {
            var2 = (SubLObject)NIL;
        }
        final SubLObject var3 = module0205.f13387(var1, (SubLObject)UNPROVIDED);
        return module0549.f33895(var3);
    }
    
    public static SubLObject f31788(final SubLObject var1, SubLObject var2) {
        if (var2 == UNPROVIDED) {
            var2 = (SubLObject)NIL;
        }
        final SubLThread var3 = SubLProcess.currentSubLThread();
        SubLObject var5;
        final SubLObject var4 = var5 = module0205.f13385(var1, (SubLObject)UNPROVIDED);
        SubLObject var6 = (SubLObject)NIL;
        SubLObject var7 = (SubLObject)NIL;
        SubLObject var8 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var5, var4, (SubLObject)$ic63$);
        var6 = var5.first();
        var5 = var5.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var5, var4, (SubLObject)$ic63$);
        var7 = var5.first();
        var5 = var5.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var5, var4, (SubLObject)$ic63$);
        var8 = var5.first();
        var5 = var5.rest();
        if (NIL == var5) {
            final SubLObject var9 = $ic21$;
            SubLObject var10 = (SubLObject)NIL;
            final SubLObject var11 = var6;
            final SubLObject var12 = module0137.$g1605$.currentBinding(var3);
            final SubLObject var13 = module0139.$g1636$.currentBinding(var3);
            try {
                module0137.$g1605$.bind(module0137.f8955($ic24$), var3);
                module0139.$g1636$.bind(module0139.f9007(), var3);
                SubLObject var90_91 = var11;
                final SubLObject var14 = (SubLObject)$ic66$;
                final SubLObject var15 = module0056.f4145(var14);
                final SubLObject var49_94 = module0139.$g1635$.currentBinding(var3);
                try {
                    module0139.$g1635$.bind(module0139.f9007(), var3);
                    final SubLObject var16 = var9;
                    final SubLObject var49_95 = module0141.$g1714$.currentBinding(var3);
                    final SubLObject var53_97 = module0141.$g1715$.currentBinding(var3);
                    try {
                        module0141.$g1714$.bind((NIL != var16) ? var16 : module0141.f9283(), var3);
                        module0141.$g1715$.bind((SubLObject)((NIL != var16) ? $ic67$ : module0141.$g1715$.getDynamicValue(var3)), var3);
                        if (NIL != var16 && NIL != module0136.f8864() && NIL == module0141.f9279(var16)) {
                            final SubLObject var17 = module0136.$g1591$.getDynamicValue(var3);
                            if (var17.eql((SubLObject)$ic68$)) {
                                module0136.f8870((SubLObject)ONE_INTEGER, (SubLObject)$ic69$, var16, (SubLObject)$ic70$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                            }
                            else if (var17.eql((SubLObject)$ic71$)) {
                                module0136.f8871((SubLObject)ONE_INTEGER, (SubLObject)$ic72$, (SubLObject)$ic69$, var16, (SubLObject)$ic70$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                            }
                            else if (var17.eql((SubLObject)$ic73$)) {
                                Errors.warn((SubLObject)$ic69$, var16, (SubLObject)$ic70$);
                            }
                            else {
                                Errors.warn((SubLObject)$ic74$, module0136.$g1591$.getDynamicValue(var3));
                                Errors.cerror((SubLObject)$ic72$, (SubLObject)$ic69$, var16, (SubLObject)$ic70$);
                            }
                        }
                        final SubLObject var49_96 = module0141.$g1670$.currentBinding(var3);
                        final SubLObject var53_98 = module0141.$g1671$.currentBinding(var3);
                        final SubLObject var18 = module0141.$g1672$.currentBinding(var3);
                        final SubLObject var19 = module0141.$g1674$.currentBinding(var3);
                        final SubLObject var20 = module0137.$g1605$.currentBinding(var3);
                        try {
                            module0141.$g1670$.bind(module0244.f15771(module0137.f8955($ic24$)), var3);
                            module0141.$g1671$.bind(module0244.f15739(module0244.f15771(module0137.f8955($ic24$))), var3);
                            module0141.$g1672$.bind(module0244.f15746(module0244.f15771(module0137.f8955($ic24$))), var3);
                            module0141.$g1674$.bind((SubLObject)NIL, var3);
                            module0137.$g1605$.bind(module0244.f15771(module0137.f8955($ic24$)), var3);
                            if (NIL != module0136.f8865() || NIL != module0244.f15795(var11, module0137.f8955((SubLObject)UNPROVIDED))) {
                                final SubLObject var49_97 = module0141.$g1677$.currentBinding(var3);
                                final SubLObject var53_99 = module0138.$g1619$.currentBinding(var3);
                                final SubLObject var54_105 = module0141.$g1674$.currentBinding(var3);
                                try {
                                    module0141.$g1677$.bind(module0141.f9210(), var3);
                                    module0138.$g1619$.bind(module0244.f15782(module0141.f9210(), module0244.f15771(module0137.f8955($ic24$))), var3);
                                    module0141.$g1674$.bind((SubLObject)NIL, var3);
                                    module0249.f16055(var90_91, (SubLObject)UNPROVIDED);
                                    while (NIL != var90_91) {
                                        final SubLObject var21 = var90_91;
                                        SubLObject var23;
                                        final SubLObject var22 = var23 = module0200.f12443(module0137.f8955($ic24$));
                                        SubLObject var24 = (SubLObject)NIL;
                                        var24 = var23.first();
                                        while (NIL != var23) {
                                            final SubLObject var49_98 = module0137.$g1605$.currentBinding(var3);
                                            final SubLObject var53_100 = module0141.$g1674$.currentBinding(var3);
                                            try {
                                                module0137.$g1605$.bind(var24, var3);
                                                module0141.$g1674$.bind((SubLObject)((NIL != module0141.f9205((SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)) ? makeBoolean(NIL == module0141.$g1674$.getDynamicValue(var3)) : module0141.$g1674$.getDynamicValue(var3)), var3);
                                                final SubLObject var25 = module0228.f15229(var21);
                                                if (NIL != module0138.f8992(var25)) {
                                                    final SubLObject var26 = module0242.f15664(var25, module0137.f8955((SubLObject)UNPROVIDED));
                                                    if (NIL != var26) {
                                                        final SubLObject var27 = module0245.f15834(var26, module0244.f15780(module0137.f8955($ic24$)), module0137.f8955((SubLObject)UNPROVIDED));
                                                        if (NIL != var27) {
                                                            SubLObject var28;
                                                            for (var28 = module0066.f4838(module0067.f4891(var27)); NIL == module0066.f4841(var28); var28 = module0066.f4840(var28)) {
                                                                var3.resetMultipleValues();
                                                                final SubLObject var29 = module0066.f4839(var28);
                                                                final SubLObject var30 = var3.secondMultipleValue();
                                                                var3.resetMultipleValues();
                                                                if (NIL != module0147.f9507(var29)) {
                                                                    final SubLObject var49_99 = module0138.$g1623$.currentBinding(var3);
                                                                    try {
                                                                        module0138.$g1623$.bind(var29, var3);
                                                                        SubLObject var114_118;
                                                                        for (var114_118 = module0066.f4838(module0067.f4891(var30)); NIL == module0066.f4841(var114_118); var114_118 = module0066.f4840(var114_118)) {
                                                                            var3.resetMultipleValues();
                                                                            final SubLObject var31 = module0066.f4839(var114_118);
                                                                            final SubLObject var32 = var3.secondMultipleValue();
                                                                            var3.resetMultipleValues();
                                                                            if (NIL != module0141.f9289(var31)) {
                                                                                final SubLObject var49_100 = module0138.$g1624$.currentBinding(var3);
                                                                                try {
                                                                                    module0138.$g1624$.bind(var31, var3);
                                                                                    final SubLObject var33 = var32;
                                                                                    if (NIL != module0077.f5302(var33)) {
                                                                                        final SubLObject var34 = module0077.f5333(var33);
                                                                                        SubLObject var35;
                                                                                        SubLObject var36;
                                                                                        SubLObject var37;
                                                                                        SubLObject var26_126;
                                                                                        SubLObject var38;
                                                                                        SubLObject var39;
                                                                                        SubLObject var40;
                                                                                        SubLObject var41;
                                                                                        SubLObject var42;
                                                                                        SubLObject var43;
                                                                                        SubLObject var44;
                                                                                        SubLObject var45;
                                                                                        for (var35 = module0032.f1741(var34), var36 = (SubLObject)NIL, var36 = module0032.f1742(var35, var34); NIL == module0032.f1744(var35, var36); var36 = module0032.f1743(var36)) {
                                                                                            var37 = module0032.f1745(var35, var36);
                                                                                            if (NIL != module0032.f1746(var36, var37) && NIL == module0249.f16059(var37, module0139.$g1636$.getDynamicValue(var3))) {
                                                                                                module0249.f16055(var37, module0139.$g1636$.getDynamicValue(var3));
                                                                                                if (NIL != module0173.f10955(var37)) {
                                                                                                    var38 = (var26_126 = module0349.f23459(var37, (SubLObject)ONE_INTEGER, (SubLObject)UNPROVIDED));
                                                                                                    var39 = (SubLObject)NIL;
                                                                                                    var39 = var26_126.first();
                                                                                                    while (NIL != var26_126) {
                                                                                                        var10 = (SubLObject)ConsesLow.cons(var39, var10);
                                                                                                        var40 = f31775(var6, var39, var8);
                                                                                                        if (var40.isPositive()) {
                                                                                                            var41 = module0202.f12817((SubLObject)TWO_INTEGER, var39, module0202.f12817((SubLObject)THREE_INTEGER, var40, var1));
                                                                                                            var3.resetMultipleValues();
                                                                                                            var42 = module0235.f15476(var1, var41, (SubLObject)T, (SubLObject)T);
                                                                                                            var43 = var3.secondMultipleValue();
                                                                                                            var44 = var3.thirdMultipleValue();
                                                                                                            var3.resetMultipleValues();
                                                                                                            if (NIL != var42) {
                                                                                                                var45 = f31758(var41);
                                                                                                                module0347.f23330(var45, var42, var44);
                                                                                                            }
                                                                                                        }
                                                                                                        var26_126 = var26_126.rest();
                                                                                                        var39 = var26_126.first();
                                                                                                    }
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                    else if (var33.isList()) {
                                                                                        SubLObject var46 = var33;
                                                                                        SubLObject var47 = (SubLObject)NIL;
                                                                                        var47 = var46.first();
                                                                                        while (NIL != var46) {
                                                                                            if (NIL == module0249.f16059(var47, module0139.$g1636$.getDynamicValue(var3))) {
                                                                                                module0249.f16055(var47, module0139.$g1636$.getDynamicValue(var3));
                                                                                                if (NIL != module0173.f10955(var47)) {
                                                                                                    SubLObject var26_127;
                                                                                                    final SubLObject var48 = var26_127 = module0349.f23459(var47, (SubLObject)ONE_INTEGER, (SubLObject)UNPROVIDED);
                                                                                                    SubLObject var49 = (SubLObject)NIL;
                                                                                                    var49 = var26_127.first();
                                                                                                    while (NIL != var26_127) {
                                                                                                        var10 = (SubLObject)ConsesLow.cons(var49, var10);
                                                                                                        final SubLObject var50 = f31775(var6, var49, var8);
                                                                                                        if (var50.isPositive()) {
                                                                                                            final SubLObject var51 = module0202.f12817((SubLObject)TWO_INTEGER, var49, module0202.f12817((SubLObject)THREE_INTEGER, var50, var1));
                                                                                                            var3.resetMultipleValues();
                                                                                                            final SubLObject var52 = module0235.f15476(var1, var51, (SubLObject)T, (SubLObject)T);
                                                                                                            final SubLObject var53 = var3.secondMultipleValue();
                                                                                                            final SubLObject var54 = var3.thirdMultipleValue();
                                                                                                            var3.resetMultipleValues();
                                                                                                            if (NIL != var52) {
                                                                                                                final SubLObject var55 = f31758(var51);
                                                                                                                module0347.f23330(var55, var52, var54);
                                                                                                            }
                                                                                                        }
                                                                                                        var26_127 = var26_127.rest();
                                                                                                        var49 = var26_127.first();
                                                                                                    }
                                                                                                }
                                                                                            }
                                                                                            var46 = var46.rest();
                                                                                            var47 = var46.first();
                                                                                        }
                                                                                    }
                                                                                    else {
                                                                                        Errors.error((SubLObject)$ic75$, var33);
                                                                                    }
                                                                                }
                                                                                finally {
                                                                                    module0138.$g1624$.rebind(var49_100, var3);
                                                                                }
                                                                            }
                                                                        }
                                                                        module0066.f4842(var114_118);
                                                                    }
                                                                    finally {
                                                                        module0138.$g1623$.rebind(var49_99, var3);
                                                                    }
                                                                }
                                                            }
                                                            module0066.f4842(var28);
                                                        }
                                                    }
                                                    else {
                                                        module0136.f8870((SubLObject)FIVE_INTEGER, (SubLObject)$ic76$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                                                    }
                                                    if (NIL != module0200.f12419(var25, module0137.f8955((SubLObject)UNPROVIDED))) {
                                                        SubLObject var56 = module0248.f15995(var25);
                                                        SubLObject var57 = (SubLObject)NIL;
                                                        var57 = var56.first();
                                                        while (NIL != var56) {
                                                            SubLObject var134_135;
                                                            final SubLObject var132_133 = var134_135 = var57;
                                                            SubLObject var58 = (SubLObject)NIL;
                                                            SubLObject var59 = (SubLObject)NIL;
                                                            SubLObject var60 = (SubLObject)NIL;
                                                            cdestructuring_bind.destructuring_bind_must_consp(var134_135, var132_133, (SubLObject)$ic77$);
                                                            var58 = var134_135.first();
                                                            var134_135 = var134_135.rest();
                                                            cdestructuring_bind.destructuring_bind_must_consp(var134_135, var132_133, (SubLObject)$ic77$);
                                                            var59 = var134_135.first();
                                                            var134_135 = var134_135.rest();
                                                            cdestructuring_bind.destructuring_bind_must_consp(var134_135, var132_133, (SubLObject)$ic77$);
                                                            var60 = var134_135.first();
                                                            var134_135 = var134_135.rest();
                                                            if (NIL == var134_135) {
                                                                if (NIL != module0147.f9507(var59)) {
                                                                    final SubLObject var49_101 = module0138.$g1623$.currentBinding(var3);
                                                                    try {
                                                                        module0138.$g1623$.bind(var59, var3);
                                                                        if (NIL != module0141.f9289(var60)) {
                                                                            final SubLObject var49_102 = module0138.$g1624$.currentBinding(var3);
                                                                            try {
                                                                                module0138.$g1624$.bind(var60, var3);
                                                                                final SubLObject var33;
                                                                                final SubLObject var61 = var33 = (SubLObject)ConsesLow.list(var58);
                                                                                if (NIL != module0077.f5302(var33)) {
                                                                                    final SubLObject var34 = module0077.f5333(var33);
                                                                                    SubLObject var35;
                                                                                    SubLObject var36;
                                                                                    SubLObject var37;
                                                                                    SubLObject var38;
                                                                                    SubLObject var39;
                                                                                    SubLObject var40;
                                                                                    SubLObject var41;
                                                                                    SubLObject var42;
                                                                                    SubLObject var43;
                                                                                    SubLObject var44;
                                                                                    SubLObject var45;
                                                                                    SubLObject var26_128;
                                                                                    for (var35 = module0032.f1741(var34), var36 = (SubLObject)NIL, var36 = module0032.f1742(var35, var34); NIL == module0032.f1744(var35, var36); var36 = module0032.f1743(var36)) {
                                                                                        var37 = module0032.f1745(var35, var36);
                                                                                        if (NIL != module0032.f1746(var36, var37) && NIL == module0249.f16059(var37, module0139.$g1636$.getDynamicValue(var3))) {
                                                                                            module0249.f16055(var37, module0139.$g1636$.getDynamicValue(var3));
                                                                                            if (NIL != module0173.f10955(var37)) {
                                                                                                var38 = (var26_128 = module0349.f23459(var37, (SubLObject)ONE_INTEGER, (SubLObject)UNPROVIDED));
                                                                                                var39 = (SubLObject)NIL;
                                                                                                var39 = var26_128.first();
                                                                                                while (NIL != var26_128) {
                                                                                                    var10 = (SubLObject)ConsesLow.cons(var39, var10);
                                                                                                    var40 = f31775(var6, var39, var8);
                                                                                                    if (var40.isPositive()) {
                                                                                                        var41 = module0202.f12817((SubLObject)TWO_INTEGER, var39, module0202.f12817((SubLObject)THREE_INTEGER, var40, var1));
                                                                                                        var3.resetMultipleValues();
                                                                                                        var42 = module0235.f15476(var1, var41, (SubLObject)T, (SubLObject)T);
                                                                                                        var43 = var3.secondMultipleValue();
                                                                                                        var44 = var3.thirdMultipleValue();
                                                                                                        var3.resetMultipleValues();
                                                                                                        if (NIL != var42) {
                                                                                                            var45 = f31758(var41);
                                                                                                            module0347.f23330(var45, var42, var44);
                                                                                                        }
                                                                                                    }
                                                                                                    var26_128 = var26_128.rest();
                                                                                                    var39 = var26_128.first();
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                }
                                                                                else if (var33.isList()) {
                                                                                    SubLObject var129_142 = var33;
                                                                                    SubLObject var47 = (SubLObject)NIL;
                                                                                    var47 = var129_142.first();
                                                                                    while (NIL != var129_142) {
                                                                                        if (NIL == module0249.f16059(var47, module0139.$g1636$.getDynamicValue(var3))) {
                                                                                            module0249.f16055(var47, module0139.$g1636$.getDynamicValue(var3));
                                                                                            if (NIL != module0173.f10955(var47)) {
                                                                                                SubLObject var26_129;
                                                                                                final SubLObject var48 = var26_129 = module0349.f23459(var47, (SubLObject)ONE_INTEGER, (SubLObject)UNPROVIDED);
                                                                                                SubLObject var49 = (SubLObject)NIL;
                                                                                                var49 = var26_129.first();
                                                                                                while (NIL != var26_129) {
                                                                                                    var10 = (SubLObject)ConsesLow.cons(var49, var10);
                                                                                                    final SubLObject var50 = f31775(var6, var49, var8);
                                                                                                    if (var50.isPositive()) {
                                                                                                        final SubLObject var51 = module0202.f12817((SubLObject)TWO_INTEGER, var49, module0202.f12817((SubLObject)THREE_INTEGER, var50, var1));
                                                                                                        var3.resetMultipleValues();
                                                                                                        final SubLObject var52 = module0235.f15476(var1, var51, (SubLObject)T, (SubLObject)T);
                                                                                                        final SubLObject var53 = var3.secondMultipleValue();
                                                                                                        final SubLObject var54 = var3.thirdMultipleValue();
                                                                                                        var3.resetMultipleValues();
                                                                                                        if (NIL != var52) {
                                                                                                            final SubLObject var55 = f31758(var51);
                                                                                                            module0347.f23330(var55, var52, var54);
                                                                                                        }
                                                                                                    }
                                                                                                    var26_129 = var26_129.rest();
                                                                                                    var49 = var26_129.first();
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                        var129_142 = var129_142.rest();
                                                                                        var47 = var129_142.first();
                                                                                    }
                                                                                }
                                                                                else {
                                                                                    Errors.error((SubLObject)$ic75$, var33);
                                                                                }
                                                                            }
                                                                            finally {
                                                                                module0138.$g1624$.rebind(var49_102, var3);
                                                                            }
                                                                        }
                                                                    }
                                                                    finally {
                                                                        module0138.$g1623$.rebind(var49_101, var3);
                                                                    }
                                                                }
                                                            }
                                                            else {
                                                                cdestructuring_bind.cdestructuring_bind_error(var132_133, (SubLObject)$ic77$);
                                                            }
                                                            var56 = var56.rest();
                                                            var57 = var56.first();
                                                        }
                                                    }
                                                }
                                                else if (NIL != module0155.f9785(var25, (SubLObject)UNPROVIDED)) {
                                                    SubLObject var26_130;
                                                    final SubLObject var62 = var26_130 = ((NIL != module0138.f8995()) ? module0035.f2097(module0244.f15760(module0244.f15780(module0137.f8955($ic24$)), module0141.$g1714$.getDynamicValue(var3), module0137.f8955((SubLObject)UNPROVIDED))) : module0244.f15760(module0244.f15780(module0137.f8955($ic24$)), module0141.$g1714$.getDynamicValue(var3), module0137.f8955((SubLObject)UNPROVIDED)));
                                                    SubLObject var63 = (SubLObject)NIL;
                                                    var63 = var26_130.first();
                                                    while (NIL != var26_130) {
                                                        final SubLObject var49_103 = module0138.$g1625$.currentBinding(var3);
                                                        try {
                                                            module0138.$g1625$.bind(var63, var3);
                                                            final SubLObject var65;
                                                            final SubLObject var64 = var65 = Functions.funcall(var63, var25);
                                                            if (NIL != module0077.f5302(var65)) {
                                                                final SubLObject var66 = module0077.f5333(var65);
                                                                SubLObject var67;
                                                                SubLObject var68;
                                                                SubLObject var69;
                                                                SubLObject var26_131;
                                                                SubLObject var70;
                                                                SubLObject var71;
                                                                SubLObject var72;
                                                                SubLObject var73;
                                                                SubLObject var74;
                                                                SubLObject var75;
                                                                SubLObject var76;
                                                                SubLObject var77;
                                                                for (var67 = module0032.f1741(var66), var68 = (SubLObject)NIL, var68 = module0032.f1742(var67, var66); NIL == module0032.f1744(var67, var68); var68 = module0032.f1743(var68)) {
                                                                    var69 = module0032.f1745(var67, var68);
                                                                    if (NIL != module0032.f1746(var68, var69) && NIL == module0249.f16059(var69, module0139.$g1636$.getDynamicValue(var3))) {
                                                                        module0249.f16055(var69, module0139.$g1636$.getDynamicValue(var3));
                                                                        if (NIL != module0173.f10955(var69)) {
                                                                            var70 = (var26_131 = module0349.f23459(var69, (SubLObject)ONE_INTEGER, (SubLObject)UNPROVIDED));
                                                                            var71 = (SubLObject)NIL;
                                                                            var71 = var26_131.first();
                                                                            while (NIL != var26_131) {
                                                                                var10 = (SubLObject)ConsesLow.cons(var71, var10);
                                                                                var72 = f31775(var6, var71, var8);
                                                                                if (var72.isPositive()) {
                                                                                    var73 = module0202.f12817((SubLObject)TWO_INTEGER, var71, module0202.f12817((SubLObject)THREE_INTEGER, var72, var1));
                                                                                    var3.resetMultipleValues();
                                                                                    var74 = module0235.f15476(var1, var73, (SubLObject)T, (SubLObject)T);
                                                                                    var75 = var3.secondMultipleValue();
                                                                                    var76 = var3.thirdMultipleValue();
                                                                                    var3.resetMultipleValues();
                                                                                    if (NIL != var74) {
                                                                                        var77 = f31758(var73);
                                                                                        module0347.f23330(var77, var74, var76);
                                                                                    }
                                                                                }
                                                                                var26_131 = var26_131.rest();
                                                                                var71 = var26_131.first();
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                            else if (var65.isList()) {
                                                                SubLObject var78 = var65;
                                                                SubLObject var79 = (SubLObject)NIL;
                                                                var79 = var78.first();
                                                                while (NIL != var78) {
                                                                    if (NIL == module0249.f16059(var79, module0139.$g1636$.getDynamicValue(var3))) {
                                                                        module0249.f16055(var79, module0139.$g1636$.getDynamicValue(var3));
                                                                        if (NIL != module0173.f10955(var79)) {
                                                                            SubLObject var26_132;
                                                                            final SubLObject var80 = var26_132 = module0349.f23459(var79, (SubLObject)ONE_INTEGER, (SubLObject)UNPROVIDED);
                                                                            SubLObject var81 = (SubLObject)NIL;
                                                                            var81 = var26_132.first();
                                                                            while (NIL != var26_132) {
                                                                                var10 = (SubLObject)ConsesLow.cons(var81, var10);
                                                                                final SubLObject var82 = f31775(var6, var81, var8);
                                                                                if (var82.isPositive()) {
                                                                                    final SubLObject var83 = module0202.f12817((SubLObject)TWO_INTEGER, var81, module0202.f12817((SubLObject)THREE_INTEGER, var82, var1));
                                                                                    var3.resetMultipleValues();
                                                                                    final SubLObject var84 = module0235.f15476(var1, var83, (SubLObject)T, (SubLObject)T);
                                                                                    final SubLObject var85 = var3.secondMultipleValue();
                                                                                    final SubLObject var86 = var3.thirdMultipleValue();
                                                                                    var3.resetMultipleValues();
                                                                                    if (NIL != var84) {
                                                                                        final SubLObject var87 = f31758(var83);
                                                                                        module0347.f23330(var87, var84, var86);
                                                                                    }
                                                                                }
                                                                                var26_132 = var26_132.rest();
                                                                                var81 = var26_132.first();
                                                                            }
                                                                        }
                                                                    }
                                                                    var78 = var78.rest();
                                                                    var79 = var78.first();
                                                                }
                                                            }
                                                            else {
                                                                Errors.error((SubLObject)$ic75$, var65);
                                                            }
                                                        }
                                                        finally {
                                                            module0138.$g1625$.rebind(var49_103, var3);
                                                        }
                                                        var26_130 = var26_130.rest();
                                                        var63 = var26_130.first();
                                                    }
                                                }
                                            }
                                            finally {
                                                module0141.$g1674$.rebind(var53_100, var3);
                                                module0137.$g1605$.rebind(var49_98, var3);
                                            }
                                            var23 = var23.rest();
                                            var24 = var23.first();
                                        }
                                        SubLObject var89;
                                        final SubLObject var88 = var89 = module0200.f12443(module0244.f15771(module0137.f8955($ic24$)));
                                        SubLObject var90 = (SubLObject)NIL;
                                        var90 = var89.first();
                                        while (NIL != var89) {
                                            final SubLObject var49_104 = module0137.$g1605$.currentBinding(var3);
                                            final SubLObject var53_101 = module0141.$g1674$.currentBinding(var3);
                                            try {
                                                module0137.$g1605$.bind(var90, var3);
                                                module0141.$g1674$.bind((SubLObject)((NIL != module0141.f9205((SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)) ? makeBoolean(NIL == module0141.$g1674$.getDynamicValue(var3)) : module0141.$g1674$.getDynamicValue(var3)), var3);
                                                final SubLObject var91 = module0228.f15229(var90_91);
                                                if (NIL != module0138.f8992(var91)) {
                                                    final SubLObject var92 = module0242.f15664(var91, module0137.f8955((SubLObject)UNPROVIDED));
                                                    if (NIL != var92) {
                                                        final SubLObject var93 = module0245.f15834(var92, module0138.f8979(), module0137.f8955((SubLObject)UNPROVIDED));
                                                        if (NIL != var93) {
                                                            SubLObject var94;
                                                            for (var94 = module0066.f4838(module0067.f4891(var93)); NIL == module0066.f4841(var94); var94 = module0066.f4840(var94)) {
                                                                var3.resetMultipleValues();
                                                                final SubLObject var95 = module0066.f4839(var94);
                                                                final SubLObject var96 = var3.secondMultipleValue();
                                                                var3.resetMultipleValues();
                                                                if (NIL != module0147.f9507(var95)) {
                                                                    final SubLObject var49_105 = module0138.$g1623$.currentBinding(var3);
                                                                    try {
                                                                        module0138.$g1623$.bind(var95, var3);
                                                                        SubLObject var114_119;
                                                                        for (var114_119 = module0066.f4838(module0067.f4891(var96)); NIL == module0066.f4841(var114_119); var114_119 = module0066.f4840(var114_119)) {
                                                                            var3.resetMultipleValues();
                                                                            final SubLObject var97 = module0066.f4839(var114_119);
                                                                            final SubLObject var98 = var3.secondMultipleValue();
                                                                            var3.resetMultipleValues();
                                                                            if (NIL != module0141.f9289(var97)) {
                                                                                final SubLObject var49_106 = module0138.$g1624$.currentBinding(var3);
                                                                                try {
                                                                                    module0138.$g1624$.bind(var97, var3);
                                                                                    final SubLObject var99 = var98;
                                                                                    if (NIL != module0077.f5302(var99)) {
                                                                                        final SubLObject var100 = module0077.f5333(var99);
                                                                                        SubLObject var101;
                                                                                        SubLObject var102;
                                                                                        SubLObject var103;
                                                                                        for (var101 = module0032.f1741(var100), var102 = (SubLObject)NIL, var102 = module0032.f1742(var101, var100); NIL == module0032.f1744(var101, var102); var102 = module0032.f1743(var102)) {
                                                                                            var103 = module0032.f1745(var101, var102);
                                                                                            if (NIL != module0032.f1746(var102, var103) && NIL == module0249.f16059(var103, (SubLObject)UNPROVIDED)) {
                                                                                                module0249.f16055(var103, (SubLObject)UNPROVIDED);
                                                                                                module0056.f4149(var103, var15);
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                    else if (var99.isList()) {
                                                                                        SubLObject var104 = var99;
                                                                                        SubLObject var105 = (SubLObject)NIL;
                                                                                        var105 = var104.first();
                                                                                        while (NIL != var104) {
                                                                                            if (NIL == module0249.f16059(var105, (SubLObject)UNPROVIDED)) {
                                                                                                module0249.f16055(var105, (SubLObject)UNPROVIDED);
                                                                                                module0056.f4149(var105, var15);
                                                                                            }
                                                                                            var104 = var104.rest();
                                                                                            var105 = var104.first();
                                                                                        }
                                                                                    }
                                                                                    else {
                                                                                        Errors.error((SubLObject)$ic75$, var99);
                                                                                    }
                                                                                }
                                                                                finally {
                                                                                    module0138.$g1624$.rebind(var49_106, var3);
                                                                                }
                                                                            }
                                                                        }
                                                                        module0066.f4842(var114_119);
                                                                    }
                                                                    finally {
                                                                        module0138.$g1623$.rebind(var49_105, var3);
                                                                    }
                                                                }
                                                            }
                                                            module0066.f4842(var94);
                                                        }
                                                    }
                                                    else {
                                                        module0136.f8870((SubLObject)FIVE_INTEGER, (SubLObject)$ic76$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                                                    }
                                                }
                                                else if (NIL != module0155.f9785(var91, (SubLObject)UNPROVIDED)) {
                                                    SubLObject var26_133;
                                                    final SubLObject var106 = var26_133 = ((NIL != module0138.f8995()) ? module0035.f2097(module0244.f15760(module0138.f8979(), module0141.$g1714$.getDynamicValue(var3), module0137.f8955((SubLObject)UNPROVIDED))) : module0244.f15760(module0138.f8979(), module0141.$g1714$.getDynamicValue(var3), module0137.f8955((SubLObject)UNPROVIDED)));
                                                    SubLObject var107 = (SubLObject)NIL;
                                                    var107 = var26_133.first();
                                                    while (NIL != var26_133) {
                                                        final SubLObject var49_107 = module0138.$g1625$.currentBinding(var3);
                                                        try {
                                                            module0138.$g1625$.bind(var107, var3);
                                                            final SubLObject var109;
                                                            final SubLObject var108 = var109 = Functions.funcall(var107, var91);
                                                            if (NIL != module0077.f5302(var109)) {
                                                                final SubLObject var110 = module0077.f5333(var109);
                                                                SubLObject var111;
                                                                SubLObject var112;
                                                                SubLObject var113;
                                                                for (var111 = module0032.f1741(var110), var112 = (SubLObject)NIL, var112 = module0032.f1742(var111, var110); NIL == module0032.f1744(var111, var112); var112 = module0032.f1743(var112)) {
                                                                    var113 = module0032.f1745(var111, var112);
                                                                    if (NIL != module0032.f1746(var112, var113) && NIL == module0249.f16059(var113, (SubLObject)UNPROVIDED)) {
                                                                        module0249.f16055(var113, (SubLObject)UNPROVIDED);
                                                                        module0056.f4149(var113, var15);
                                                                    }
                                                                }
                                                            }
                                                            else if (var109.isList()) {
                                                                SubLObject var114 = var109;
                                                                SubLObject var115 = (SubLObject)NIL;
                                                                var115 = var114.first();
                                                                while (NIL != var114) {
                                                                    if (NIL == module0249.f16059(var115, (SubLObject)UNPROVIDED)) {
                                                                        module0249.f16055(var115, (SubLObject)UNPROVIDED);
                                                                        module0056.f4149(var115, var15);
                                                                    }
                                                                    var114 = var114.rest();
                                                                    var115 = var114.first();
                                                                }
                                                            }
                                                            else {
                                                                Errors.error((SubLObject)$ic75$, var109);
                                                            }
                                                        }
                                                        finally {
                                                            module0138.$g1625$.rebind(var49_107, var3);
                                                        }
                                                        var26_133 = var26_133.rest();
                                                        var107 = var26_133.first();
                                                    }
                                                }
                                            }
                                            finally {
                                                module0141.$g1674$.rebind(var53_101, var3);
                                                module0137.$g1605$.rebind(var49_104, var3);
                                            }
                                            var89 = var89.rest();
                                            var90 = var89.first();
                                        }
                                        var90_91 = module0056.f4150(var15);
                                    }
                                }
                                finally {
                                    module0141.$g1674$.rebind(var54_105, var3);
                                    module0138.$g1619$.rebind(var53_99, var3);
                                    module0141.$g1677$.rebind(var49_97, var3);
                                }
                            }
                            else {
                                module0136.f8872((SubLObject)TWO_INTEGER, (SubLObject)$ic78$, var11, module0244.f15748(module0137.f8955((SubLObject)UNPROVIDED)), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                            }
                        }
                        finally {
                            module0137.$g1605$.rebind(var20, var3);
                            module0141.$g1674$.rebind(var19, var3);
                            module0141.$g1672$.rebind(var18, var3);
                            module0141.$g1671$.rebind(var53_98, var3);
                            module0141.$g1670$.rebind(var49_96, var3);
                        }
                    }
                    finally {
                        module0141.$g1715$.rebind(var53_97, var3);
                        module0141.$g1714$.rebind(var49_95, var3);
                    }
                    module0139.f9011(module0139.$g1635$.getDynamicValue(var3));
                }
                finally {
                    module0139.$g1635$.rebind(var49_94, var3);
                }
                module0139.f9011(module0139.$g1636$.getDynamicValue(var3));
            }
            finally {
                module0139.$g1636$.rebind(var13, var3);
                module0137.$g1605$.rebind(var12, var3);
            }
        }
        else {
            cdestructuring_bind.cdestructuring_bind_error(var4, (SubLObject)$ic63$);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f31789(final SubLObject var1, SubLObject var2) {
        if (var2 == UNPROVIDED) {
            var2 = (SubLObject)NIL;
        }
        return f31772(var1);
    }
    
    public static SubLObject f31790(final SubLObject var1, SubLObject var2) {
        if (var2 == UNPROVIDED) {
            var2 = (SubLObject)NIL;
        }
        final SubLObject var3 = f31774(var1);
        if ($ic37$ == var3 || $ic84$ == var3) {
            final SubLObject var4 = f31758(var1);
            module0347.f23330(var4, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f31791(final SubLObject var1, final SubLObject var50) {
        final SubLThread var51 = SubLProcess.currentSubLThread();
        SubLObject var52 = (SubLObject)NIL;
        final SubLObject var53 = module0147.f9540(var50);
        final SubLObject var54 = module0147.$g2095$.currentBinding(var51);
        final SubLObject var55 = module0147.$g2094$.currentBinding(var51);
        final SubLObject var56 = module0147.$g2096$.currentBinding(var51);
        try {
            module0147.$g2095$.bind(module0147.f9545(var53), var51);
            module0147.$g2094$.bind(module0147.f9546(var53), var51);
            module0147.$g2096$.bind(module0147.f9549(var53), var51);
            final SubLObject var57 = f31774(var1);
            if (var57 == $ic37$ || var57 == $ic84$) {
                SubLObject var59;
                final SubLObject var58 = var59 = module0205.f13385(var1, (SubLObject)UNPROVIDED);
                SubLObject var60 = (SubLObject)NIL;
                SubLObject var61 = (SubLObject)NIL;
                SubLObject var62 = (SubLObject)NIL;
                cdestructuring_bind.destructuring_bind_must_consp(var59, var58, (SubLObject)$ic40$);
                var60 = var59.first();
                var59 = var59.rest();
                cdestructuring_bind.destructuring_bind_must_consp(var59, var58, (SubLObject)$ic40$);
                var61 = var59.first();
                var59 = var59.rest();
                cdestructuring_bind.destructuring_bind_must_consp(var59, var58, (SubLObject)$ic40$);
                var62 = var59.first();
                var59 = var59.rest();
                if (NIL == var59) {
                    final SubLObject var63 = f31792();
                    final SubLObject var64 = module0191.f11990((SubLObject)$ic23$, module0202.f12768($ic24$, var61, $ic42$), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                    final SubLObject var65 = f31793(var60, var61, var62);
                    final SubLObject var66 = module0191.f11990((SubLObject)$ic87$, var65, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                    var52 = (SubLObject)ConsesLow.list(var64, var66, var63);
                }
                else {
                    cdestructuring_bind.cdestructuring_bind_error(var58, (SubLObject)$ic40$);
                }
            }
        }
        finally {
            module0147.$g2096$.rebind(var56, var51);
            module0147.$g2094$.rebind(var55, var51);
            module0147.$g2095$.rebind(var54, var51);
        }
        return var52;
    }
    
    public static SubLObject f31792() {
        final SubLThread var17 = SubLProcess.currentSubLThread();
        final SubLObject var18 = (SubLObject)$ic88$;
        final SubLObject var19 = f31793((SubLObject)$ic89$, (SubLObject)$ic90$, var18);
        final SubLObject var20 = (SubLObject)ConsesLow.list($ic91$, (SubLObject)ConsesLow.list($ic46$, (SubLObject)$ic92$, var19), (SubLObject)ConsesLow.list($ic81$, (SubLObject)$ic89$, (SubLObject)$ic90$, var18));
        SubLObject var21 = (SubLObject)NIL;
        final SubLObject var22 = module0147.$g2094$.currentBinding(var17);
        final SubLObject var23 = module0147.$g2095$.currentBinding(var17);
        try {
            module0147.$g2094$.bind((SubLObject)$ic49$, var17);
            module0147.$g2095$.bind($ic50$, var17);
            final SubLObject var24 = module0288.f19338(var20, (SubLObject)UNPROVIDED);
            var21 = ((NIL != var24) ? var24 : module0191.f11990((SubLObject)$ic27$, var20, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED));
        }
        finally {
            module0147.$g2095$.rebind(var23, var17);
            module0147.$g2094$.rebind(var22, var17);
        }
        return var21;
    }
    
    public static SubLObject f31794(final SubLObject var1, SubLObject var2) {
        if (var2 == UNPROVIDED) {
            var2 = (SubLObject)NIL;
        }
        return module0435.f30613(f31755(var1));
    }
    
    public static SubLObject f31795(final SubLObject var1, SubLObject var2) {
        if (var2 == UNPROVIDED) {
            var2 = (SubLObject)NIL;
        }
        if ($ic37$ != f31774(var1)) {
            module0347.f23330(module0191.f11990((SubLObject)$ic5$, module0205.f13338(var1), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f31796(final SubLObject var1, SubLObject var2) {
        if (var2 == UNPROVIDED) {
            var2 = (SubLObject)NIL;
        }
        SubLObject var4;
        final SubLObject var3 = var4 = module0205.f13385(var1, (SubLObject)UNPROVIDED);
        SubLObject var5 = (SubLObject)NIL;
        SubLObject var6 = (SubLObject)NIL;
        SubLObject var7 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic95$);
        var5 = var4.first();
        var4 = var4.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic95$);
        var6 = var4.first();
        var4 = var4.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic95$);
        var7 = var4.first();
        var4 = var4.rest();
        if (NIL != var4) {
            cdestructuring_bind.cdestructuring_bind_error(var3, (SubLObject)$ic95$);
            return (SubLObject)NIL;
        }
        if (var7.isZero()) {
            return module0259.f16876($ic42$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        }
        final SubLObject var8 = module0259.f16876(var5, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        return f31797(var8, var7);
    }
    
    public static SubLObject f31798(final SubLObject var1, SubLObject var2) {
        if (var2 == UNPROVIDED) {
            var2 = (SubLObject)NIL;
        }
        final SubLThread var3 = SubLProcess.currentSubLThread();
        SubLObject var5;
        final SubLObject var4 = var5 = module0205.f13385(var1, (SubLObject)UNPROVIDED);
        SubLObject var6 = (SubLObject)NIL;
        SubLObject var7 = (SubLObject)NIL;
        SubLObject var8 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var5, var4, (SubLObject)$ic56$);
        var6 = var5.first();
        var5 = var5.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var5, var4, (SubLObject)$ic56$);
        var7 = var5.first();
        var5 = var5.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var5, var4, (SubLObject)$ic56$);
        var8 = var5.first();
        var5 = var5.rest();
        if (NIL == var5) {
            SubLObject var9 = (SubLObject)NIL;
            SubLObject var10 = (SubLObject)NIL;
            final SubLObject var11 = module0259.f16848(var6, (SubLObject)NIL, $ic21$);
            var10 = module0035.f1994(var11, (SubLObject)$ic9$, (SubLObject)UNPROVIDED);
            SubLObject var13;
            final SubLObject var12 = var13 = ((NIL != var10) ? var11 : module0035.f2101((SubLObject)$ic9$, var11));
            SubLObject var14 = (SubLObject)NIL;
            var14 = var13.first();
            while (NIL != var13) {
                SubLObject var26_169;
                final SubLObject var15 = var26_169 = module0349.f23459(var14, (SubLObject)ONE_INTEGER, (SubLObject)UNPROVIDED);
                SubLObject var16 = (SubLObject)NIL;
                var16 = var26_169.first();
                while (NIL != var26_169) {
                    final SubLObject var17 = module0035.f2293(var9, var16, Symbols.symbol_function((SubLObject)EQL), (SubLObject)ZERO_INTEGER);
                    var9 = module0035.f2063(var9, var16, module0048.f_1X(var17), (SubLObject)UNPROVIDED);
                    var26_169 = var26_169.rest();
                    var16 = var26_169.first();
                }
                var13 = var13.rest();
                var14 = var13.first();
            }
            SubLObject var18 = Sort.sort(var9, Symbols.symbol_function((SubLObject)$ic98$), Symbols.symbol_function((SubLObject)$ic99$));
            SubLObject var19 = (SubLObject)NIL;
            var19 = var18.first();
            while (NIL != var18) {
                SubLObject var174_175;
                final SubLObject var172_173 = var174_175 = var19;
                SubLObject var20 = (SubLObject)NIL;
                SubLObject var21 = (SubLObject)NIL;
                cdestructuring_bind.destructuring_bind_must_consp(var174_175, var172_173, (SubLObject)$ic96$);
                var20 = var174_175.first();
                var174_175 = (var21 = var174_175.rest());
                if (var21.numGE(var8) || (NIL == var10 && NIL != conses_high.member(f31775(var6, var20, var8), (SubLObject)$ic97$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED))) {
                    var3.resetMultipleValues();
                    final SubLObject var22 = module0235.f15474(var7, var20, (SubLObject)T, (SubLObject)T);
                    final SubLObject var23 = var3.secondMultipleValue();
                    var3.resetMultipleValues();
                    if (NIL != var22) {
                        final SubLObject var24 = module0202.f12817((SubLObject)TWO_INTEGER, var20, var1);
                        final SubLObject var25 = f31758(var24);
                        module0347.f23330(var25, var22, var23);
                    }
                }
                var18 = var18.rest();
                var19 = var18.first();
            }
        }
        else {
            cdestructuring_bind.cdestructuring_bind_error(var4, (SubLObject)$ic56$);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f31799(final SubLObject var1, SubLObject var2) {
        if (var2 == UNPROVIDED) {
            var2 = (SubLObject)NIL;
        }
        SubLObject var4;
        final SubLObject var3 = var4 = module0205.f13385(var1, (SubLObject)UNPROVIDED);
        SubLObject var5 = (SubLObject)NIL;
        SubLObject var6 = (SubLObject)NIL;
        SubLObject var7 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic59$);
        var5 = var4.first();
        var4 = var4.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic59$);
        var6 = var4.first();
        var4 = var4.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic59$);
        var7 = var4.first();
        var4 = var4.rest();
        if (NIL == var4) {
            return module0048.f3382((SubLObject)ConsesLow.list(var7, module0217.f14247(var6, (SubLObject)UNPROVIDED)), (SubLObject)UNPROVIDED);
        }
        cdestructuring_bind.cdestructuring_bind_error(var3, (SubLObject)$ic59$);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f31800(final SubLObject var1, SubLObject var2) {
        if (var2 == UNPROVIDED) {
            var2 = (SubLObject)NIL;
        }
        return f31786(var1, (SubLObject)$ic97$);
    }
    
    public static SubLObject f31801(final SubLObject var1, SubLObject var2) {
        if (var2 == UNPROVIDED) {
            var2 = (SubLObject)NIL;
        }
        return f31772(var1);
    }
    
    public static SubLObject f31802(final SubLObject var1, SubLObject var2) {
        if (var2 == UNPROVIDED) {
            var2 = (SubLObject)NIL;
        }
        if (NIL != f31803(var1)) {
            final SubLObject var3 = f31758(var1);
            module0347.f23330(var3, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f31803(final SubLObject var1) {
        final SubLThread var2 = SubLProcess.currentSubLThread();
        SubLObject var4;
        final SubLObject var3 = var4 = module0205.f13385(var1, (SubLObject)UNPROVIDED);
        SubLObject var5 = (SubLObject)NIL;
        SubLObject var6 = (SubLObject)NIL;
        SubLObject var7 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic107$);
        var5 = var4.first();
        var4 = var4.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic107$);
        var6 = var4.first();
        var4 = var4.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic107$);
        var7 = var4.first();
        var4 = var4.rest();
        if (NIL == var4) {
            var2.resetMultipleValues();
            final SubLObject var8 = f31804(var5, var7);
            final SubLObject var9 = var2.secondMultipleValue();
            var2.resetMultipleValues();
            final SubLObject var10 = module0202.f12769($ic81$, var5, var6, var8);
            final SubLObject var11 = f31774(var10);
            return Values.values((SubLObject)makeBoolean($ic37$ == var11 || $ic84$ == var11), var9);
        }
        cdestructuring_bind.cdestructuring_bind_error(var3, (SubLObject)$ic107$);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f31804(final SubLObject var5, final SubLObject var181) {
        final SubLObject var182 = module0549.f33895(var5);
        final SubLObject var183 = Numbers.multiply(var181, var182);
        final SubLObject var184 = var183.isInteger() ? var183 : Numbers.floor(module0048.f_1X(var183), (SubLObject)UNPROVIDED);
        return Values.values(var184, var183);
    }
    
    public static SubLObject f31805(final SubLObject var1, final SubLObject var50) {
        final SubLThread var51 = SubLProcess.currentSubLThread();
        SubLObject var52 = (SubLObject)NIL;
        final SubLObject var53 = module0147.f9540(var50);
        final SubLObject var54 = module0147.$g2095$.currentBinding(var51);
        final SubLObject var55 = module0147.$g2094$.currentBinding(var51);
        final SubLObject var56 = module0147.$g2096$.currentBinding(var51);
        try {
            module0147.$g2095$.bind(module0147.f9545(var53), var51);
            module0147.$g2094$.bind(module0147.f9546(var53), var51);
            module0147.$g2096$.bind(module0147.f9549(var53), var51);
            var51.resetMultipleValues();
            final SubLObject var57 = f31803(var1);
            final SubLObject var58 = var51.secondMultipleValue();
            var51.resetMultipleValues();
            if (NIL != var57) {
                SubLObject var60;
                final SubLObject var59 = var60 = module0205.f13385(var1, (SubLObject)UNPROVIDED);
                SubLObject var61 = (SubLObject)NIL;
                SubLObject var62 = (SubLObject)NIL;
                SubLObject var63 = (SubLObject)NIL;
                cdestructuring_bind.destructuring_bind_must_consp(var60, var59, (SubLObject)$ic107$);
                var61 = var60.first();
                var60 = var60.rest();
                cdestructuring_bind.destructuring_bind_must_consp(var60, var59, (SubLObject)$ic107$);
                var62 = var60.first();
                var60 = var60.rest();
                cdestructuring_bind.destructuring_bind_must_consp(var60, var59, (SubLObject)$ic107$);
                var63 = var60.first();
                var60 = var60.rest();
                if (NIL == var60) {
                    final SubLObject var64 = f31806();
                    final SubLObject var65 = module0191.f11990((SubLObject)$ic23$, module0202.f12768($ic24$, var62, $ic42$), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                    final SubLObject var66 = module0549.f33895(var61);
                    final SubLObject var67 = module0202.f12768($ic110$, (SubLObject)ConsesLow.list($ic111$, var61), var66);
                    final SubLObject var68 = module0191.f11990((SubLObject)$ic112$, var67, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                    final SubLObject var69 = module0202.f12768($ic110$, (SubLObject)ConsesLow.list($ic113$, var63, var66), var58);
                    final SubLObject var70 = module0191.f11990((SubLObject)$ic112$, var69, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                    final SubLObject var71 = f31793(var61, var62, var58);
                    final SubLObject var72 = module0191.f11990((SubLObject)$ic26$, var71, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                    var52 = (SubLObject)ConsesLow.list(var65, var68, var70, var72, var64);
                }
                else {
                    cdestructuring_bind.cdestructuring_bind_error(var59, (SubLObject)$ic107$);
                }
            }
        }
        finally {
            module0147.$g2096$.rebind(var56, var51);
            module0147.$g2094$.rebind(var55, var51);
            module0147.$g2095$.rebind(var54, var51);
        }
        return var52;
    }
    
    public static SubLObject f31806() {
        final SubLThread var17 = SubLProcess.currentSubLThread();
        final SubLObject var18 = (SubLObject)$ic114$;
        final SubLObject var19 = f31793((SubLObject)$ic89$, (SubLObject)$ic90$, var18);
        final SubLObject var20 = (SubLObject)ConsesLow.listS($ic91$, (SubLObject)ConsesLow.list($ic46$, (SubLObject)$ic92$, var19, (SubLObject)ConsesLow.listS($ic110$, var18, (SubLObject)$ic115$)), (SubLObject)$ic116$);
        SubLObject var21 = (SubLObject)NIL;
        final SubLObject var22 = module0147.$g2094$.currentBinding(var17);
        final SubLObject var23 = module0147.$g2095$.currentBinding(var17);
        try {
            module0147.$g2094$.bind((SubLObject)$ic49$, var17);
            module0147.$g2095$.bind($ic50$, var17);
            final SubLObject var24 = module0288.f19338(var20, (SubLObject)UNPROVIDED);
            var21 = ((NIL != var24) ? var24 : module0191.f11990((SubLObject)$ic27$, var20, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED));
        }
        finally {
            module0147.$g2095$.rebind(var23, var17);
            module0147.$g2094$.rebind(var22, var17);
        }
        return var21;
    }
    
    public static SubLObject f31793(final SubLObject var5, final SubLObject var29, final SubLObject var68) {
        return module0202.f12768($ic117$, (SubLObject)ConsesLow.list($ic44$, (SubLObject)$ic45$, (SubLObject)ConsesLow.list($ic46$, (SubLObject)ConsesLow.list($ic24$, (SubLObject)$ic45$, var5), (SubLObject)ConsesLow.list($ic47$, (SubLObject)$ic45$, (SubLObject)ONE_INTEGER, var29))), var68);
    }
    
    public static SubLObject f31807(final SubLObject var1, final SubLObject var50) {
        final SubLThread var51 = SubLProcess.currentSubLThread();
        SubLObject var52 = (SubLObject)NIL;
        if (NIL != module0337.f22630(var1, f31793((SubLObject)$ic118$, (SubLObject)$ic118$, (SubLObject)$ic119$))) {
            final SubLObject var53 = module0205.f13394(var1, (SubLObject)$ic120$, (SubLObject)UNPROVIDED);
            final SubLObject var54 = module0205.f13394(var1, (SubLObject)$ic121$, (SubLObject)UNPROVIDED);
            final SubLObject var55 = module0205.f13394(var1, (SubLObject)$ic122$, (SubLObject)UNPROVIDED);
            var51.resetMultipleValues();
            final SubLObject var56 = f31808(var53, var54, var55, (SubLObject)T);
            final SubLObject var57 = var51.secondMultipleValue();
            var51.resetMultipleValues();
            if (var56 == $ic37$ || var56 == $ic84$) {
                SubLObject var58 = var57;
                SubLObject var59 = (SubLObject)NIL;
                var59 = var58.first();
                while (NIL != var58) {
                    final SubLObject var60 = module0147.f9540(var50);
                    final SubLObject var61 = module0147.$g2095$.currentBinding(var51);
                    final SubLObject var62 = module0147.$g2094$.currentBinding(var51);
                    final SubLObject var63 = module0147.$g2096$.currentBinding(var51);
                    try {
                        module0147.$g2095$.bind(module0147.f9545(var60), var51);
                        module0147.$g2094$.bind(module0147.f9546(var60), var51);
                        module0147.$g2096$.bind(module0147.f9549(var60), var51);
                        final SubLObject var64 = module0202.f12776((SubLObject)$ic123$, module0202.f12768(var54, var59, (SubLObject)$ic123$));
                        final SubLObject var65 = module0202.f12768($ic24$, var59, var53);
                        var52 = ConsesLow.append(var52, f31809(var65, var50), f31809(var64, var50));
                    }
                    finally {
                        module0147.$g2096$.rebind(var63, var51);
                        module0147.$g2094$.rebind(var62, var51);
                        module0147.$g2095$.rebind(var61, var51);
                    }
                    var58 = var58.rest();
                    var59 = var58.first();
                }
            }
        }
        return var52;
    }
    
    public static SubLObject f31809(final SubLObject var197, final SubLObject var50) {
        final SubLObject var198 = module0434.f30575(var197, var50, (SubLObject)NIL, (SubLObject)ONE_INTEGER, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        final SubLObject var199 = var198.first();
        final SubLObject var200 = conses_high.second(var199);
        return var200;
    }
    
    public static SubLObject f31810(final SubLObject var1, SubLObject var2) {
        if (var2 == UNPROVIDED) {
            var2 = (SubLObject)NIL;
        }
        return module0435.f30613(f31772(var1));
    }
    
    public static SubLObject f31811(final SubLObject var1, SubLObject var2) {
        if (var2 == UNPROVIDED) {
            var2 = (SubLObject)NIL;
        }
        if (NIL == f31803(var1)) {
            module0347.f23330(module0191.f11990((SubLObject)$ic5$, module0205.f13338(var1), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f31812(final SubLObject var1, SubLObject var2) {
        if (var2 == UNPROVIDED) {
            var2 = (SubLObject)NIL;
        }
        SubLObject var4;
        final SubLObject var3 = var4 = module0205.f13385(var1, (SubLObject)UNPROVIDED);
        SubLObject var5 = (SubLObject)NIL;
        SubLObject var6 = (SubLObject)NIL;
        SubLObject var7 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic126$);
        var5 = var4.first();
        var4 = var4.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic126$);
        var6 = var4.first();
        var4 = var4.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic126$);
        var7 = var4.first();
        var4 = var4.rest();
        if (NIL != var4) {
            cdestructuring_bind.cdestructuring_bind_error(var3, (SubLObject)$ic126$);
            return (SubLObject)NIL;
        }
        if (var7.isZero()) {
            return module0259.f16876($ic42$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        }
        final SubLObject var8 = module0259.f16876(var5, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        final SubLObject var9 = Numbers.floor(Numbers.multiply(var7, var8), (SubLObject)UNPROVIDED);
        return f31797(var8, var9);
    }
    
    public static SubLObject f31797(final SubLObject var166, final SubLObject var165) {
        if (var165.isZero()) {
            return module0259.f16876($ic42$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        }
        final SubLObject var167 = (SubLObject)$ic127$;
        return Numbers.integerDivide(var166, Numbers.multiply(var165, var167));
    }
    
    public static SubLObject f31813(final SubLObject var1, SubLObject var2) {
        if (var2 == UNPROVIDED) {
            var2 = (SubLObject)NIL;
        }
        final SubLThread var3 = SubLProcess.currentSubLThread();
        SubLObject var5;
        final SubLObject var4 = var5 = module0205.f13385(var1, (SubLObject)UNPROVIDED);
        SubLObject var6 = (SubLObject)NIL;
        SubLObject var7 = (SubLObject)NIL;
        SubLObject var8 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var5, var4, (SubLObject)$ic126$);
        var6 = var5.first();
        var5 = var5.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var5, var4, (SubLObject)$ic126$);
        var7 = var5.first();
        var5 = var5.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var5, var4, (SubLObject)$ic126$);
        var8 = var5.first();
        var5 = var5.rest();
        if (NIL == var5) {
            final SubLObject var9 = f31804(var6, var8);
            SubLObject var10 = (SubLObject)NIL;
            SubLObject var11 = (SubLObject)NIL;
            final SubLObject var12 = module0259.f16848(var6, (SubLObject)NIL, $ic21$);
            var10 = module0035.f1994(var12, (SubLObject)$ic9$, (SubLObject)UNPROVIDED);
            SubLObject var14;
            final SubLObject var13 = var14 = ((NIL != var10) ? var12 : module0035.f2101((SubLObject)$ic9$, var12));
            SubLObject var15 = (SubLObject)NIL;
            var15 = var14.first();
            while (NIL != var14) {
                SubLObject var26_205;
                final SubLObject var16 = var26_205 = module0349.f23459(var15, (SubLObject)ONE_INTEGER, (SubLObject)UNPROVIDED);
                SubLObject var17 = (SubLObject)NIL;
                var17 = var26_205.first();
                while (NIL != var26_205) {
                    if (NIL == module0004.f104(var17, var11, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)) {
                        var11 = (SubLObject)ConsesLow.cons(var17, var11);
                        if (NIL != module0004.f104(f31775(var6, var17, var9), (SubLObject)$ic97$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)) {
                            var3.resetMultipleValues();
                            final SubLObject var18 = module0235.f15474(var7, var17, (SubLObject)T, (SubLObject)T);
                            final SubLObject var19 = var3.secondMultipleValue();
                            var3.resetMultipleValues();
                            if (NIL != var18) {
                                final SubLObject var20 = module0202.f12817((SubLObject)TWO_INTEGER, var17, var1);
                                final SubLObject var21 = f31758(var20);
                                module0347.f23330(var21, var18, var19);
                            }
                        }
                    }
                    var26_205 = var26_205.rest();
                    var17 = var26_205.first();
                }
                var14 = var14.rest();
                var15 = var14.first();
            }
        }
        else {
            cdestructuring_bind.cdestructuring_bind_error(var4, (SubLObject)$ic126$);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f31814(final SubLObject var1, SubLObject var2) {
        if (var2 == UNPROVIDED) {
            var2 = (SubLObject)NIL;
        }
        SubLObject var4;
        final SubLObject var3 = var4 = module0205.f13385(var1, (SubLObject)UNPROVIDED);
        SubLObject var5 = (SubLObject)NIL;
        SubLObject var6 = (SubLObject)NIL;
        SubLObject var7 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic130$);
        var5 = var4.first();
        var4 = var4.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic130$);
        var6 = var4.first();
        var4 = var4.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic130$);
        var7 = var4.first();
        var4 = var4.rest();
        if (NIL == var4) {
            return module0217.f14247(var6, (SubLObject)UNPROVIDED);
        }
        cdestructuring_bind.cdestructuring_bind_error(var3, (SubLObject)$ic130$);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f31815(final SubLObject var1, SubLObject var2) {
        if (var2 == UNPROVIDED) {
            var2 = (SubLObject)NIL;
        }
        final SubLThread var3 = SubLProcess.currentSubLThread();
        SubLObject var5;
        final SubLObject var4 = var5 = module0205.f13385(var1, (SubLObject)UNPROVIDED);
        SubLObject var6 = (SubLObject)NIL;
        SubLObject var7 = (SubLObject)NIL;
        SubLObject var8 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var5, var4, (SubLObject)$ic131$);
        var6 = var5.first();
        var5 = var5.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var5, var4, (SubLObject)$ic131$);
        var7 = var5.first();
        var5 = var5.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var5, var4, (SubLObject)$ic131$);
        var8 = var5.first();
        var5 = var5.rest();
        if (NIL == var5) {
            if (NIL != module0226.f14807(var7)) {
                final SubLObject var9 = $ic21$;
                final SubLObject var10 = module0141.f9295(var9);
                SubLObject var11 = (SubLObject)NIL;
                SubLObject var12 = (SubLObject)NIL;
                SubLObject var13 = f31770(var7, (SubLObject)ONE_INTEGER, var10);
                SubLObject var14 = (SubLObject)NIL;
                var14 = var13.first();
                while (NIL != var13) {
                    SubLObject var26_212 = module0259.f16821(var14, module0147.$g2095$.getDynamicValue(var3), var9);
                    SubLObject var15 = (SubLObject)NIL;
                    var15 = var26_212.first();
                    while (NIL != var26_212) {
                        if (NIL != conses_high.member(var15, var12, Symbols.symbol_function((SubLObject)$ic132$), (SubLObject)UNPROVIDED)) {
                            final SubLObject var16 = var15;
                            if (NIL == conses_high.member(var16, var12, Symbols.symbol_function((SubLObject)EQL), Symbols.symbol_function((SubLObject)IDENTITY))) {
                                var12 = (SubLObject)ConsesLow.cons(var16, var12);
                            }
                        }
                        else if (NIL != conses_high.member(var15, var11, Symbols.symbol_function((SubLObject)$ic132$), (SubLObject)UNPROVIDED)) {
                            final SubLObject var16 = var15;
                            if (NIL == conses_high.member(var16, var11, Symbols.symbol_function((SubLObject)EQL), Symbols.symbol_function((SubLObject)IDENTITY))) {
                                var11 = (SubLObject)ConsesLow.cons(var16, var11);
                            }
                        }
                        else if (NIL != conses_high.member(f31775(var15, var7, f31804(var15, var8)), (SubLObject)$ic97$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)) {
                            var12 = (SubLObject)ConsesLow.cons(var15, var12);
                            var3.resetMultipleValues();
                            final SubLObject var17 = module0235.f15474(var6, var15, (SubLObject)T, (SubLObject)T);
                            final SubLObject var18 = var3.secondMultipleValue();
                            var3.resetMultipleValues();
                            if (NIL != var17) {
                                final SubLObject var19 = module0202.f12817((SubLObject)ONE_INTEGER, var15, var1);
                                final SubLObject var20 = f31758(var19);
                                module0347.f23330(var20, var17, var18);
                            }
                        }
                        else {
                            var11 = (SubLObject)ConsesLow.cons(var15, var11);
                        }
                        var26_212 = var26_212.rest();
                        var15 = var26_212.first();
                    }
                    var13 = var13.rest();
                    var14 = var13.first();
                }
            }
        }
        else {
            cdestructuring_bind.cdestructuring_bind_error(var4, (SubLObject)$ic131$);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f31816(final SubLObject var1, final SubLObject var50) {
        final SubLObject var51 = module0205.f13386(var1);
        if (var51.eql($ic0$)) {
            return f31766(var1, var50);
        }
        if (var51.eql($ic34$)) {
            return f31776(var1, var50);
        }
        if (var51.eql($ic81$)) {
            return f31791(var1, var50);
        }
        if (var51.eql($ic104$)) {
            return f31805(var1, var50);
        }
        if (var51.eql($ic117$)) {
            return f31807(var1, var50);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f31817(final SubLObject var1, final SubLObject var50) {
        final SubLThread var51 = SubLProcess.currentSubLThread();
        SubLObject var52 = (SubLObject)NIL;
        final SubLObject var53 = module0147.f9540(var50);
        final SubLObject var54 = module0147.$g2095$.currentBinding(var51);
        final SubLObject var55 = module0147.$g2094$.currentBinding(var51);
        final SubLObject var56 = module0147.$g2096$.currentBinding(var51);
        try {
            module0147.$g2095$.bind(module0147.f9545(var53), var51);
            module0147.$g2094$.bind(module0147.f9546(var53), var51);
            module0147.$g2096$.bind(module0147.f9549(var53), var51);
            final SubLObject var57 = module0205.f13386(var1);
            if (var57.eql($ic0$)) {
                var52 = f31757(var1);
            }
            else if (var57.eql($ic34$)) {
                SubLObject var59;
                final SubLObject var58 = var59 = module0205.f13385(var1, (SubLObject)UNPROVIDED);
                SubLObject var60 = (SubLObject)NIL;
                SubLObject var61 = (SubLObject)NIL;
                SubLObject var62 = (SubLObject)NIL;
                cdestructuring_bind.destructuring_bind_must_consp(var59, var58, (SubLObject)$ic40$);
                var60 = var59.first();
                var59 = var59.rest();
                cdestructuring_bind.destructuring_bind_must_consp(var59, var58, (SubLObject)$ic40$);
                var61 = var59.first();
                var59 = var59.rest();
                cdestructuring_bind.destructuring_bind_must_consp(var59, var58, (SubLObject)$ic40$);
                var62 = var59.first();
                var59 = var59.rest();
                if (NIL == var59) {
                    var52 = Equality.eq((SubLObject)$ic37$, f31775(var60, var61, var62));
                }
                else {
                    cdestructuring_bind.cdestructuring_bind_error(var58, (SubLObject)$ic40$);
                }
            }
            else if (var57.eql($ic81$)) {
                SubLObject var64;
                final SubLObject var63 = var64 = module0205.f13385(var1, (SubLObject)UNPROVIDED);
                SubLObject var60 = (SubLObject)NIL;
                SubLObject var61 = (SubLObject)NIL;
                SubLObject var62 = (SubLObject)NIL;
                cdestructuring_bind.destructuring_bind_must_consp(var64, var63, (SubLObject)$ic40$);
                var60 = var64.first();
                var64 = var64.rest();
                cdestructuring_bind.destructuring_bind_must_consp(var64, var63, (SubLObject)$ic40$);
                var61 = var64.first();
                var64 = var64.rest();
                cdestructuring_bind.destructuring_bind_must_consp(var64, var63, (SubLObject)$ic40$);
                var62 = var64.first();
                var64 = var64.rest();
                if (NIL == var64) {
                    var52 = conses_high.member(f31775(var60, var61, var62), (SubLObject)$ic97$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                }
                else {
                    cdestructuring_bind.cdestructuring_bind_error(var63, (SubLObject)$ic40$);
                }
            }
        }
        finally {
            module0147.$g2096$.rebind(var56, var51);
            module0147.$g2094$.rebind(var55, var51);
            module0147.$g2095$.rebind(var54, var51);
        }
        return var52;
    }
    
    public static SubLObject f31757(final SubLObject var1) {
        final SubLThread var2 = SubLProcess.currentSubLThread();
        SubLObject var4;
        final SubLObject var3 = var4 = module0205.f13385(var1, (SubLObject)UNPROVIDED);
        SubLObject var5 = (SubLObject)NIL;
        SubLObject var6 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic135$);
        var5 = var4.first();
        var4 = var4.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic135$);
        var6 = var4.first();
        var4 = var4.rest();
        if (NIL == var4) {
            final SubLObject var7 = $ic21$;
            final SubLObject var8 = module0141.f9295(var7);
            SubLObject var9 = (SubLObject)NIL;
            if (NIL != module0226.f14807(var6) && NIL != module0269.f17705(var5)) {
                final SubLObject var10 = var5;
                final SubLObject var11 = module0137.$g1605$.currentBinding(var2);
                final SubLObject var12 = module0139.$g1636$.currentBinding(var2);
                try {
                    module0137.$g1605$.bind(module0137.f8955($ic24$), var2);
                    module0139.$g1636$.bind(module0139.f9007(), var2);
                    if (NIL == var9) {
                        SubLObject var90_220 = var10;
                        final SubLObject var13 = (SubLObject)$ic66$;
                        final SubLObject var14 = module0056.f4145(var13);
                        final SubLObject var49_221 = module0139.$g1635$.currentBinding(var2);
                        try {
                            module0139.$g1635$.bind(module0139.f9007(), var2);
                            final SubLObject var15 = var7;
                            final SubLObject var49_222 = module0141.$g1714$.currentBinding(var2);
                            final SubLObject var53_223 = module0141.$g1715$.currentBinding(var2);
                            try {
                                module0141.$g1714$.bind((NIL != var15) ? var15 : module0141.f9283(), var2);
                                module0141.$g1715$.bind((SubLObject)((NIL != var15) ? $ic67$ : module0141.$g1715$.getDynamicValue(var2)), var2);
                                if (NIL != var15 && NIL != module0136.f8864() && NIL == module0141.f9279(var15)) {
                                    final SubLObject var16 = module0136.$g1591$.getDynamicValue(var2);
                                    if (var16.eql((SubLObject)$ic68$)) {
                                        module0136.f8870((SubLObject)ONE_INTEGER, (SubLObject)$ic69$, var15, (SubLObject)$ic70$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                                    }
                                    else if (var16.eql((SubLObject)$ic71$)) {
                                        module0136.f8871((SubLObject)ONE_INTEGER, (SubLObject)$ic72$, (SubLObject)$ic69$, var15, (SubLObject)$ic70$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                                    }
                                    else if (var16.eql((SubLObject)$ic73$)) {
                                        Errors.warn((SubLObject)$ic69$, var15, (SubLObject)$ic70$);
                                    }
                                    else {
                                        Errors.warn((SubLObject)$ic74$, module0136.$g1591$.getDynamicValue(var2));
                                        Errors.cerror((SubLObject)$ic72$, (SubLObject)$ic69$, var15, (SubLObject)$ic70$);
                                    }
                                }
                                final SubLObject var49_223 = module0141.$g1670$.currentBinding(var2);
                                final SubLObject var53_224 = module0141.$g1671$.currentBinding(var2);
                                final SubLObject var17 = module0141.$g1672$.currentBinding(var2);
                                final SubLObject var18 = module0141.$g1674$.currentBinding(var2);
                                final SubLObject var19 = module0137.$g1605$.currentBinding(var2);
                                try {
                                    module0141.$g1670$.bind(module0244.f15771(module0137.f8955($ic24$)), var2);
                                    module0141.$g1671$.bind(module0244.f15739(module0244.f15771(module0137.f8955($ic24$))), var2);
                                    module0141.$g1672$.bind(module0244.f15746(module0244.f15771(module0137.f8955($ic24$))), var2);
                                    module0141.$g1674$.bind((SubLObject)NIL, var2);
                                    module0137.$g1605$.bind(module0244.f15771(module0137.f8955($ic24$)), var2);
                                    if (NIL != module0136.f8865() || NIL != module0244.f15795(var10, module0137.f8955((SubLObject)UNPROVIDED))) {
                                        final SubLObject var49_224 = module0141.$g1677$.currentBinding(var2);
                                        final SubLObject var53_225 = module0138.$g1619$.currentBinding(var2);
                                        final SubLObject var54_228 = module0141.$g1674$.currentBinding(var2);
                                        try {
                                            module0141.$g1677$.bind(module0141.f9210(), var2);
                                            module0138.$g1619$.bind(module0244.f15782(module0141.f9210(), module0244.f15771(module0137.f8955($ic24$))), var2);
                                            module0141.$g1674$.bind((SubLObject)NIL, var2);
                                            module0249.f16055(var90_220, (SubLObject)UNPROVIDED);
                                            while (NIL != var90_220 && NIL == var9) {
                                                final SubLObject var20 = var90_220;
                                                final SubLObject var21 = module0200.f12443(module0137.f8955($ic24$));
                                                SubLObject var22;
                                                SubLObject var23;
                                                SubLObject var49_225;
                                                SubLObject var53_226;
                                                SubLObject var24;
                                                SubLObject var25;
                                                SubLObject var26;
                                                SubLObject var27;
                                                SubLObject var28;
                                                SubLObject var29;
                                                SubLObject var49_226;
                                                SubLObject var114_233;
                                                SubLObject var30;
                                                SubLObject var31;
                                                SubLObject var49_227;
                                                SubLObject var32;
                                                SubLObject var33;
                                                SubLObject var34;
                                                SubLObject var35;
                                                SubLObject var36;
                                                SubLObject var37;
                                                SubLObject var38;
                                                SubLObject var39;
                                                SubLObject var40;
                                                SubLObject var41;
                                                SubLObject var42;
                                                SubLObject var43;
                                                SubLObject var40_235;
                                                SubLObject var41_236;
                                                SubLObject var44;
                                                SubLObject var43_237;
                                                SubLObject var49_228;
                                                SubLObject var45;
                                                SubLObject var46;
                                                SubLObject var47;
                                                SubLObject var48;
                                                SubLObject var49;
                                                SubLObject var50;
                                                SubLObject var51;
                                                SubLObject var52;
                                                SubLObject var53;
                                                SubLObject var40_236;
                                                SubLObject var41_237;
                                                SubLObject var54;
                                                SubLObject var43_238;
                                                SubLObject var49_229;
                                                SubLObject var55;
                                                SubLObject var56;
                                                SubLObject var245_246;
                                                SubLObject var243_244;
                                                SubLObject var57;
                                                SubLObject var58;
                                                SubLObject var59;
                                                SubLObject var49_230;
                                                SubLObject var49_231;
                                                SubLObject var60;
                                                SubLObject var40_237;
                                                SubLObject var41_238;
                                                SubLObject var43_239;
                                                SubLObject var49_232;
                                                SubLObject var129_253;
                                                SubLObject var40_238;
                                                SubLObject var41_239;
                                                SubLObject var43_240;
                                                SubLObject var49_233;
                                                SubLObject var61;
                                                SubLObject var229_258;
                                                SubLObject var62;
                                                SubLObject var49_234;
                                                SubLObject var64;
                                                SubLObject var63;
                                                SubLObject var65;
                                                SubLObject var66;
                                                SubLObject var67;
                                                SubLObject var68;
                                                SubLObject var69;
                                                SubLObject var70;
                                                SubLObject var71;
                                                SubLObject var72;
                                                SubLObject var73;
                                                SubLObject var74;
                                                SubLObject var75;
                                                SubLObject var40_239;
                                                SubLObject var41_240;
                                                SubLObject var76;
                                                SubLObject var43_241;
                                                SubLObject var49_235;
                                                SubLObject var77;
                                                SubLObject var78;
                                                SubLObject var79;
                                                SubLObject var80;
                                                SubLObject var81;
                                                SubLObject var82;
                                                SubLObject var83;
                                                SubLObject var84;
                                                SubLObject var85;
                                                SubLObject var40_240;
                                                SubLObject var41_241;
                                                SubLObject var86;
                                                SubLObject var43_242;
                                                SubLObject var49_236;
                                                for (var22 = (SubLObject)NIL, var22 = var21; NIL == var9 && NIL != var22; var22 = var22.rest()) {
                                                    var23 = var22.first();
                                                    var49_225 = module0137.$g1605$.currentBinding(var2);
                                                    var53_226 = module0141.$g1674$.currentBinding(var2);
                                                    try {
                                                        module0137.$g1605$.bind(var23, var2);
                                                        module0141.$g1674$.bind((SubLObject)((NIL != module0141.f9205((SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)) ? makeBoolean(NIL == module0141.$g1674$.getDynamicValue(var2)) : module0141.$g1674$.getDynamicValue(var2)), var2);
                                                        var24 = module0228.f15229(var20);
                                                        if (NIL != module0138.f8992(var24)) {
                                                            var25 = module0242.f15664(var24, module0137.f8955((SubLObject)UNPROVIDED));
                                                            if (NIL != var25) {
                                                                var26 = module0245.f15834(var25, module0244.f15780(module0137.f8955($ic24$)), module0137.f8955((SubLObject)UNPROVIDED));
                                                                if (NIL != var26) {
                                                                    for (var27 = module0066.f4838(module0067.f4891(var26)); NIL == var9 && NIL == module0066.f4841(var27); var27 = module0066.f4840(var27)) {
                                                                        var2.resetMultipleValues();
                                                                        var28 = module0066.f4839(var27);
                                                                        var29 = var2.secondMultipleValue();
                                                                        var2.resetMultipleValues();
                                                                        if (NIL != module0147.f9507(var28)) {
                                                                            var49_226 = module0138.$g1623$.currentBinding(var2);
                                                                            try {
                                                                                module0138.$g1623$.bind(var28, var2);
                                                                                for (var114_233 = module0066.f4838(module0067.f4891(var29)); NIL == var9 && NIL == module0066.f4841(var114_233); var114_233 = module0066.f4840(var114_233)) {
                                                                                    var2.resetMultipleValues();
                                                                                    var30 = module0066.f4839(var114_233);
                                                                                    var31 = var2.secondMultipleValue();
                                                                                    var2.resetMultipleValues();
                                                                                    if (NIL != module0141.f9289(var30)) {
                                                                                        var49_227 = module0138.$g1624$.currentBinding(var2);
                                                                                        try {
                                                                                            module0138.$g1624$.bind(var30, var2);
                                                                                            var32 = var31;
                                                                                            if (NIL != module0077.f5302(var32)) {
                                                                                                var33 = module0077.f5333(var32);
                                                                                                for (var34 = module0032.f1741(var33), var35 = (SubLObject)NIL, var35 = module0032.f1742(var34, var33); NIL == var9 && NIL == module0032.f1744(var34, var35); var35 = module0032.f1743(var35)) {
                                                                                                    var36 = module0032.f1745(var34, var35);
                                                                                                    if (NIL != module0032.f1746(var35, var36) && NIL == module0249.f16059(var36, module0139.$g1636$.getDynamicValue(var2))) {
                                                                                                        module0249.f16055(var36, module0139.$g1636$.getDynamicValue(var2));
                                                                                                        if (NIL != module0173.f10955(var36)) {
                                                                                                            var37 = var6;
                                                                                                            if (NIL != module0158.f10010(var36, (SubLObject)NIL, var37)) {
                                                                                                                var38 = module0158.f10011(var36, (SubLObject)NIL, var37);
                                                                                                                var39 = var9;
                                                                                                                var40 = (SubLObject)NIL;
                                                                                                                while (NIL == var39) {
                                                                                                                    var41 = module0052.f3695(var38, var40);
                                                                                                                    var42 = (SubLObject)makeBoolean(!var40.eql(var41));
                                                                                                                    if (NIL != var42) {
                                                                                                                        var43 = (SubLObject)NIL;
                                                                                                                        try {
                                                                                                                            var43 = module0158.f10316(var41, (SubLObject)$ic22$, var8, (SubLObject)NIL);
                                                                                                                            var40_235 = var9;
                                                                                                                            var41_236 = (SubLObject)NIL;
                                                                                                                            while (NIL == var40_235) {
                                                                                                                                var44 = module0052.f3695(var43, var41_236);
                                                                                                                                var43_237 = (SubLObject)makeBoolean(!var41_236.eql(var44));
                                                                                                                                if (NIL != var43_237) {
                                                                                                                                    var9 = var44;
                                                                                                                                }
                                                                                                                                var40_235 = (SubLObject)makeBoolean(NIL == var43_237 || NIL != var9);
                                                                                                                            }
                                                                                                                        }
                                                                                                                        finally {
                                                                                                                            var49_228 = Threads.$is_thread_performing_cleanupP$.currentBinding(var2);
                                                                                                                            try {
                                                                                                                                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)T, var2);
                                                                                                                                if (NIL != var43) {
                                                                                                                                    module0158.f10319(var43);
                                                                                                                                }
                                                                                                                            }
                                                                                                                            finally {
                                                                                                                                Threads.$is_thread_performing_cleanupP$.rebind(var49_228, var2);
                                                                                                                            }
                                                                                                                        }
                                                                                                                    }
                                                                                                                    var39 = (SubLObject)makeBoolean(NIL == var42 || NIL != var9);
                                                                                                                }
                                                                                                            }
                                                                                                        }
                                                                                                    }
                                                                                                }
                                                                                            }
                                                                                            else if (var32.isList()) {
                                                                                                if (NIL == var9) {
                                                                                                    var45 = var32;
                                                                                                    var46 = (SubLObject)NIL;
                                                                                                    var46 = var45.first();
                                                                                                    while (NIL == var9 && NIL != var45) {
                                                                                                        if (NIL == module0249.f16059(var46, module0139.$g1636$.getDynamicValue(var2))) {
                                                                                                            module0249.f16055(var46, module0139.$g1636$.getDynamicValue(var2));
                                                                                                            if (NIL != module0173.f10955(var46)) {
                                                                                                                var47 = var6;
                                                                                                                if (NIL != module0158.f10010(var46, (SubLObject)NIL, var47)) {
                                                                                                                    var48 = module0158.f10011(var46, (SubLObject)NIL, var47);
                                                                                                                    var49 = var9;
                                                                                                                    var50 = (SubLObject)NIL;
                                                                                                                    while (NIL == var49) {
                                                                                                                        var51 = module0052.f3695(var48, var50);
                                                                                                                        var52 = (SubLObject)makeBoolean(!var50.eql(var51));
                                                                                                                        if (NIL != var52) {
                                                                                                                            var53 = (SubLObject)NIL;
                                                                                                                            try {
                                                                                                                                var53 = module0158.f10316(var51, (SubLObject)$ic22$, var8, (SubLObject)NIL);
                                                                                                                                var40_236 = var9;
                                                                                                                                var41_237 = (SubLObject)NIL;
                                                                                                                                while (NIL == var40_236) {
                                                                                                                                    var54 = module0052.f3695(var53, var41_237);
                                                                                                                                    var43_238 = (SubLObject)makeBoolean(!var41_237.eql(var54));
                                                                                                                                    if (NIL != var43_238) {
                                                                                                                                        var9 = var54;
                                                                                                                                    }
                                                                                                                                    var40_236 = (SubLObject)makeBoolean(NIL == var43_238 || NIL != var9);
                                                                                                                                }
                                                                                                                            }
                                                                                                                            finally {
                                                                                                                                var49_229 = Threads.$is_thread_performing_cleanupP$.currentBinding(var2);
                                                                                                                                try {
                                                                                                                                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)T, var2);
                                                                                                                                    if (NIL != var53) {
                                                                                                                                        module0158.f10319(var53);
                                                                                                                                    }
                                                                                                                                }
                                                                                                                                finally {
                                                                                                                                    Threads.$is_thread_performing_cleanupP$.rebind(var49_229, var2);
                                                                                                                                }
                                                                                                                            }
                                                                                                                        }
                                                                                                                        var49 = (SubLObject)makeBoolean(NIL == var52 || NIL != var9);
                                                                                                                    }
                                                                                                                }
                                                                                                            }
                                                                                                        }
                                                                                                        var45 = var45.rest();
                                                                                                        var46 = var45.first();
                                                                                                    }
                                                                                                }
                                                                                            }
                                                                                            else {
                                                                                                Errors.error((SubLObject)$ic75$, var32);
                                                                                            }
                                                                                        }
                                                                                        finally {
                                                                                            module0138.$g1624$.rebind(var49_227, var2);
                                                                                        }
                                                                                    }
                                                                                }
                                                                                module0066.f4842(var114_233);
                                                                            }
                                                                            finally {
                                                                                module0138.$g1623$.rebind(var49_226, var2);
                                                                            }
                                                                        }
                                                                    }
                                                                    module0066.f4842(var27);
                                                                }
                                                            }
                                                            else {
                                                                module0136.f8870((SubLObject)FIVE_INTEGER, (SubLObject)$ic76$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                                                            }
                                                            if (NIL != module0200.f12419(var24, module0137.f8955((SubLObject)UNPROVIDED)) && NIL == var9) {
                                                                var55 = module0248.f15995(var24);
                                                                var56 = (SubLObject)NIL;
                                                                var56 = var55.first();
                                                                while (NIL == var9 && NIL != var55) {
                                                                    var243_244 = (var245_246 = var56);
                                                                    var57 = (SubLObject)NIL;
                                                                    var58 = (SubLObject)NIL;
                                                                    var59 = (SubLObject)NIL;
                                                                    cdestructuring_bind.destructuring_bind_must_consp(var245_246, var243_244, (SubLObject)$ic77$);
                                                                    var57 = var245_246.first();
                                                                    var245_246 = var245_246.rest();
                                                                    cdestructuring_bind.destructuring_bind_must_consp(var245_246, var243_244, (SubLObject)$ic77$);
                                                                    var58 = var245_246.first();
                                                                    var245_246 = var245_246.rest();
                                                                    cdestructuring_bind.destructuring_bind_must_consp(var245_246, var243_244, (SubLObject)$ic77$);
                                                                    var59 = var245_246.first();
                                                                    var245_246 = var245_246.rest();
                                                                    if (NIL == var245_246) {
                                                                        if (NIL != module0147.f9507(var58)) {
                                                                            var49_230 = module0138.$g1623$.currentBinding(var2);
                                                                            try {
                                                                                module0138.$g1623$.bind(var58, var2);
                                                                                if (NIL != module0141.f9289(var59)) {
                                                                                    var49_231 = module0138.$g1624$.currentBinding(var2);
                                                                                    try {
                                                                                        module0138.$g1624$.bind(var59, var2);
                                                                                        var60 = (var32 = (SubLObject)ConsesLow.list(var57));
                                                                                        if (NIL != module0077.f5302(var32)) {
                                                                                            var33 = module0077.f5333(var32);
                                                                                            for (var34 = module0032.f1741(var33), var35 = (SubLObject)NIL, var35 = module0032.f1742(var34, var33); NIL == var9 && NIL == module0032.f1744(var34, var35); var35 = module0032.f1743(var35)) {
                                                                                                var36 = module0032.f1745(var34, var35);
                                                                                                if (NIL != module0032.f1746(var35, var36) && NIL == module0249.f16059(var36, module0139.$g1636$.getDynamicValue(var2))) {
                                                                                                    module0249.f16055(var36, module0139.$g1636$.getDynamicValue(var2));
                                                                                                    if (NIL != module0173.f10955(var36)) {
                                                                                                        var37 = var6;
                                                                                                        if (NIL != module0158.f10010(var36, (SubLObject)NIL, var37)) {
                                                                                                            var38 = module0158.f10011(var36, (SubLObject)NIL, var37);
                                                                                                            var39 = var9;
                                                                                                            var40 = (SubLObject)NIL;
                                                                                                            while (NIL == var39) {
                                                                                                                var41 = module0052.f3695(var38, var40);
                                                                                                                var42 = (SubLObject)makeBoolean(!var40.eql(var41));
                                                                                                                if (NIL != var42) {
                                                                                                                    var43 = (SubLObject)NIL;
                                                                                                                    try {
                                                                                                                        var43 = module0158.f10316(var41, (SubLObject)$ic22$, var8, (SubLObject)NIL);
                                                                                                                        var40_237 = var9;
                                                                                                                        var41_238 = (SubLObject)NIL;
                                                                                                                        while (NIL == var40_237) {
                                                                                                                            var44 = module0052.f3695(var43, var41_238);
                                                                                                                            var43_239 = (SubLObject)makeBoolean(!var41_238.eql(var44));
                                                                                                                            if (NIL != var43_239) {
                                                                                                                                var9 = var44;
                                                                                                                            }
                                                                                                                            var40_237 = (SubLObject)makeBoolean(NIL == var43_239 || NIL != var9);
                                                                                                                        }
                                                                                                                    }
                                                                                                                    finally {
                                                                                                                        var49_232 = Threads.$is_thread_performing_cleanupP$.currentBinding(var2);
                                                                                                                        try {
                                                                                                                            Threads.$is_thread_performing_cleanupP$.bind((SubLObject)T, var2);
                                                                                                                            if (NIL != var43) {
                                                                                                                                module0158.f10319(var43);
                                                                                                                            }
                                                                                                                        }
                                                                                                                        finally {
                                                                                                                            Threads.$is_thread_performing_cleanupP$.rebind(var49_232, var2);
                                                                                                                        }
                                                                                                                    }
                                                                                                                }
                                                                                                                var39 = (SubLObject)makeBoolean(NIL == var42 || NIL != var9);
                                                                                                            }
                                                                                                        }
                                                                                                    }
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                        else if (var32.isList()) {
                                                                                            if (NIL == var9) {
                                                                                                var129_253 = var32;
                                                                                                var46 = (SubLObject)NIL;
                                                                                                var46 = var129_253.first();
                                                                                                while (NIL == var9 && NIL != var129_253) {
                                                                                                    if (NIL == module0249.f16059(var46, module0139.$g1636$.getDynamicValue(var2))) {
                                                                                                        module0249.f16055(var46, module0139.$g1636$.getDynamicValue(var2));
                                                                                                        if (NIL != module0173.f10955(var46)) {
                                                                                                            var47 = var6;
                                                                                                            if (NIL != module0158.f10010(var46, (SubLObject)NIL, var47)) {
                                                                                                                var48 = module0158.f10011(var46, (SubLObject)NIL, var47);
                                                                                                                var49 = var9;
                                                                                                                var50 = (SubLObject)NIL;
                                                                                                                while (NIL == var49) {
                                                                                                                    var51 = module0052.f3695(var48, var50);
                                                                                                                    var52 = (SubLObject)makeBoolean(!var50.eql(var51));
                                                                                                                    if (NIL != var52) {
                                                                                                                        var53 = (SubLObject)NIL;
                                                                                                                        try {
                                                                                                                            var53 = module0158.f10316(var51, (SubLObject)$ic22$, var8, (SubLObject)NIL);
                                                                                                                            var40_238 = var9;
                                                                                                                            var41_239 = (SubLObject)NIL;
                                                                                                                            while (NIL == var40_238) {
                                                                                                                                var54 = module0052.f3695(var53, var41_239);
                                                                                                                                var43_240 = (SubLObject)makeBoolean(!var41_239.eql(var54));
                                                                                                                                if (NIL != var43_240) {
                                                                                                                                    var9 = var54;
                                                                                                                                }
                                                                                                                                var40_238 = (SubLObject)makeBoolean(NIL == var43_240 || NIL != var9);
                                                                                                                            }
                                                                                                                        }
                                                                                                                        finally {
                                                                                                                            var49_233 = Threads.$is_thread_performing_cleanupP$.currentBinding(var2);
                                                                                                                            try {
                                                                                                                                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)T, var2);
                                                                                                                                if (NIL != var53) {
                                                                                                                                    module0158.f10319(var53);
                                                                                                                                }
                                                                                                                            }
                                                                                                                            finally {
                                                                                                                                Threads.$is_thread_performing_cleanupP$.rebind(var49_233, var2);
                                                                                                                            }
                                                                                                                        }
                                                                                                                    }
                                                                                                                    var49 = (SubLObject)makeBoolean(NIL == var52 || NIL != var9);
                                                                                                                }
                                                                                                            }
                                                                                                        }
                                                                                                    }
                                                                                                    var129_253 = var129_253.rest();
                                                                                                    var46 = var129_253.first();
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                        else {
                                                                                            Errors.error((SubLObject)$ic75$, var32);
                                                                                        }
                                                                                    }
                                                                                    finally {
                                                                                        module0138.$g1624$.rebind(var49_231, var2);
                                                                                    }
                                                                                }
                                                                            }
                                                                            finally {
                                                                                module0138.$g1623$.rebind(var49_230, var2);
                                                                            }
                                                                        }
                                                                    }
                                                                    else {
                                                                        cdestructuring_bind.cdestructuring_bind_error(var243_244, (SubLObject)$ic77$);
                                                                    }
                                                                    var55 = var55.rest();
                                                                    var56 = var55.first();
                                                                }
                                                            }
                                                        }
                                                        else if (NIL != module0155.f9785(var24, (SubLObject)UNPROVIDED)) {
                                                            var61 = ((NIL != module0138.f8995()) ? module0035.f2097(module0244.f15760(module0244.f15780(module0137.f8955($ic24$)), module0141.$g1714$.getDynamicValue(var2), module0137.f8955((SubLObject)UNPROVIDED))) : module0244.f15760(module0244.f15780(module0137.f8955($ic24$)), module0141.$g1714$.getDynamicValue(var2), module0137.f8955((SubLObject)UNPROVIDED)));
                                                            for (var229_258 = (SubLObject)NIL, var229_258 = var61; NIL == var9 && NIL != var229_258; var229_258 = var229_258.rest()) {
                                                                var62 = var229_258.first();
                                                                var49_234 = module0138.$g1625$.currentBinding(var2);
                                                                try {
                                                                    module0138.$g1625$.bind(var62, var2);
                                                                    var63 = (var64 = Functions.funcall(var62, var24));
                                                                    if (NIL != module0077.f5302(var64)) {
                                                                        var65 = module0077.f5333(var64);
                                                                        for (var66 = module0032.f1741(var65), var67 = (SubLObject)NIL, var67 = module0032.f1742(var66, var65); NIL == var9 && NIL == module0032.f1744(var66, var67); var67 = module0032.f1743(var67)) {
                                                                            var68 = module0032.f1745(var66, var67);
                                                                            if (NIL != module0032.f1746(var67, var68) && NIL == module0249.f16059(var68, module0139.$g1636$.getDynamicValue(var2))) {
                                                                                module0249.f16055(var68, module0139.$g1636$.getDynamicValue(var2));
                                                                                if (NIL != module0173.f10955(var68)) {
                                                                                    var69 = var6;
                                                                                    if (NIL != module0158.f10010(var68, (SubLObject)NIL, var69)) {
                                                                                        var70 = module0158.f10011(var68, (SubLObject)NIL, var69);
                                                                                        var71 = var9;
                                                                                        var72 = (SubLObject)NIL;
                                                                                        while (NIL == var71) {
                                                                                            var73 = module0052.f3695(var70, var72);
                                                                                            var74 = (SubLObject)makeBoolean(!var72.eql(var73));
                                                                                            if (NIL != var74) {
                                                                                                var75 = (SubLObject)NIL;
                                                                                                try {
                                                                                                    var75 = module0158.f10316(var73, (SubLObject)$ic22$, var8, (SubLObject)NIL);
                                                                                                    var40_239 = var9;
                                                                                                    var41_240 = (SubLObject)NIL;
                                                                                                    while (NIL == var40_239) {
                                                                                                        var76 = module0052.f3695(var75, var41_240);
                                                                                                        var43_241 = (SubLObject)makeBoolean(!var41_240.eql(var76));
                                                                                                        if (NIL != var43_241) {
                                                                                                            var9 = var76;
                                                                                                        }
                                                                                                        var40_239 = (SubLObject)makeBoolean(NIL == var43_241 || NIL != var9);
                                                                                                    }
                                                                                                }
                                                                                                finally {
                                                                                                    var49_235 = Threads.$is_thread_performing_cleanupP$.currentBinding(var2);
                                                                                                    try {
                                                                                                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)T, var2);
                                                                                                        if (NIL != var75) {
                                                                                                            module0158.f10319(var75);
                                                                                                        }
                                                                                                    }
                                                                                                    finally {
                                                                                                        Threads.$is_thread_performing_cleanupP$.rebind(var49_235, var2);
                                                                                                    }
                                                                                                }
                                                                                            }
                                                                                            var71 = (SubLObject)makeBoolean(NIL == var74 || NIL != var9);
                                                                                        }
                                                                                    }
                                                                                }
                                                                            }
                                                                        }
                                                                    }
                                                                    else if (var64.isList()) {
                                                                        if (NIL == var9) {
                                                                            var77 = var64;
                                                                            var78 = (SubLObject)NIL;
                                                                            var78 = var77.first();
                                                                            while (NIL == var9 && NIL != var77) {
                                                                                if (NIL == module0249.f16059(var78, module0139.$g1636$.getDynamicValue(var2))) {
                                                                                    module0249.f16055(var78, module0139.$g1636$.getDynamicValue(var2));
                                                                                    if (NIL != module0173.f10955(var78)) {
                                                                                        var79 = var6;
                                                                                        if (NIL != module0158.f10010(var78, (SubLObject)NIL, var79)) {
                                                                                            var80 = module0158.f10011(var78, (SubLObject)NIL, var79);
                                                                                            var81 = var9;
                                                                                            var82 = (SubLObject)NIL;
                                                                                            while (NIL == var81) {
                                                                                                var83 = module0052.f3695(var80, var82);
                                                                                                var84 = (SubLObject)makeBoolean(!var82.eql(var83));
                                                                                                if (NIL != var84) {
                                                                                                    var85 = (SubLObject)NIL;
                                                                                                    try {
                                                                                                        var85 = module0158.f10316(var83, (SubLObject)$ic22$, var8, (SubLObject)NIL);
                                                                                                        var40_240 = var9;
                                                                                                        var41_241 = (SubLObject)NIL;
                                                                                                        while (NIL == var40_240) {
                                                                                                            var86 = module0052.f3695(var85, var41_241);
                                                                                                            var43_242 = (SubLObject)makeBoolean(!var41_241.eql(var86));
                                                                                                            if (NIL != var43_242) {
                                                                                                                var9 = var86;
                                                                                                            }
                                                                                                            var40_240 = (SubLObject)makeBoolean(NIL == var43_242 || NIL != var9);
                                                                                                        }
                                                                                                    }
                                                                                                    finally {
                                                                                                        var49_236 = Threads.$is_thread_performing_cleanupP$.currentBinding(var2);
                                                                                                        try {
                                                                                                            Threads.$is_thread_performing_cleanupP$.bind((SubLObject)T, var2);
                                                                                                            if (NIL != var85) {
                                                                                                                module0158.f10319(var85);
                                                                                                            }
                                                                                                        }
                                                                                                        finally {
                                                                                                            Threads.$is_thread_performing_cleanupP$.rebind(var49_236, var2);
                                                                                                        }
                                                                                                    }
                                                                                                }
                                                                                                var81 = (SubLObject)makeBoolean(NIL == var84 || NIL != var9);
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                }
                                                                                var77 = var77.rest();
                                                                                var78 = var77.first();
                                                                            }
                                                                        }
                                                                    }
                                                                    else {
                                                                        Errors.error((SubLObject)$ic75$, var64);
                                                                    }
                                                                }
                                                                finally {
                                                                    module0138.$g1625$.rebind(var49_234, var2);
                                                                }
                                                            }
                                                        }
                                                    }
                                                    finally {
                                                        module0141.$g1674$.rebind(var53_226, var2);
                                                        module0137.$g1605$.rebind(var49_225, var2);
                                                    }
                                                }
                                                final SubLObject var87 = module0200.f12443(module0244.f15771(module0137.f8955($ic24$)));
                                                SubLObject var88;
                                                SubLObject var89;
                                                SubLObject var49_237;
                                                SubLObject var53_227;
                                                SubLObject var90;
                                                SubLObject var91;
                                                SubLObject var92;
                                                SubLObject var93;
                                                SubLObject var94;
                                                SubLObject var95;
                                                SubLObject var49_238;
                                                SubLObject var114_234;
                                                SubLObject var96;
                                                SubLObject var97;
                                                SubLObject var49_239;
                                                SubLObject var98;
                                                SubLObject var99;
                                                SubLObject var100;
                                                SubLObject var101;
                                                SubLObject var102;
                                                SubLObject var103;
                                                SubLObject var104;
                                                SubLObject var105;
                                                SubLObject var229_259;
                                                SubLObject var106;
                                                SubLObject var49_240;
                                                SubLObject var108;
                                                SubLObject var107;
                                                SubLObject var109;
                                                SubLObject var110;
                                                SubLObject var111;
                                                SubLObject var112;
                                                SubLObject var113;
                                                SubLObject var114;
                                                for (var88 = (SubLObject)NIL, var88 = var87; NIL == var9 && NIL != var88; var88 = var88.rest()) {
                                                    var89 = var88.first();
                                                    var49_237 = module0137.$g1605$.currentBinding(var2);
                                                    var53_227 = module0141.$g1674$.currentBinding(var2);
                                                    try {
                                                        module0137.$g1605$.bind(var89, var2);
                                                        module0141.$g1674$.bind((SubLObject)((NIL != module0141.f9205((SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)) ? makeBoolean(NIL == module0141.$g1674$.getDynamicValue(var2)) : module0141.$g1674$.getDynamicValue(var2)), var2);
                                                        var90 = module0228.f15229(var90_220);
                                                        if (NIL != module0138.f8992(var90)) {
                                                            var91 = module0242.f15664(var90, module0137.f8955((SubLObject)UNPROVIDED));
                                                            if (NIL != var91) {
                                                                var92 = module0245.f15834(var91, module0138.f8979(), module0137.f8955((SubLObject)UNPROVIDED));
                                                                if (NIL != var92) {
                                                                    for (var93 = module0066.f4838(module0067.f4891(var92)); NIL == var9 && NIL == module0066.f4841(var93); var93 = module0066.f4840(var93)) {
                                                                        var2.resetMultipleValues();
                                                                        var94 = module0066.f4839(var93);
                                                                        var95 = var2.secondMultipleValue();
                                                                        var2.resetMultipleValues();
                                                                        if (NIL != module0147.f9507(var94)) {
                                                                            var49_238 = module0138.$g1623$.currentBinding(var2);
                                                                            try {
                                                                                module0138.$g1623$.bind(var94, var2);
                                                                                for (var114_234 = module0066.f4838(module0067.f4891(var95)); NIL == var9 && NIL == module0066.f4841(var114_234); var114_234 = module0066.f4840(var114_234)) {
                                                                                    var2.resetMultipleValues();
                                                                                    var96 = module0066.f4839(var114_234);
                                                                                    var97 = var2.secondMultipleValue();
                                                                                    var2.resetMultipleValues();
                                                                                    if (NIL != module0141.f9289(var96)) {
                                                                                        var49_239 = module0138.$g1624$.currentBinding(var2);
                                                                                        try {
                                                                                            module0138.$g1624$.bind(var96, var2);
                                                                                            var98 = var97;
                                                                                            if (NIL != module0077.f5302(var98)) {
                                                                                                var99 = module0077.f5333(var98);
                                                                                                for (var100 = module0032.f1741(var99), var101 = (SubLObject)NIL, var101 = module0032.f1742(var100, var99); NIL == var9 && NIL == module0032.f1744(var100, var101); var101 = module0032.f1743(var101)) {
                                                                                                    var102 = module0032.f1745(var100, var101);
                                                                                                    if (NIL != module0032.f1746(var101, var102) && NIL == module0249.f16059(var102, (SubLObject)UNPROVIDED)) {
                                                                                                        module0249.f16055(var102, (SubLObject)UNPROVIDED);
                                                                                                        module0056.f4149(var102, var14);
                                                                                                    }
                                                                                                }
                                                                                            }
                                                                                            else if (var98.isList()) {
                                                                                                if (NIL == var9) {
                                                                                                    var103 = var98;
                                                                                                    var104 = (SubLObject)NIL;
                                                                                                    var104 = var103.first();
                                                                                                    while (NIL == var9 && NIL != var103) {
                                                                                                        if (NIL == module0249.f16059(var104, (SubLObject)UNPROVIDED)) {
                                                                                                            module0249.f16055(var104, (SubLObject)UNPROVIDED);
                                                                                                            module0056.f4149(var104, var14);
                                                                                                        }
                                                                                                        var103 = var103.rest();
                                                                                                        var104 = var103.first();
                                                                                                    }
                                                                                                }
                                                                                            }
                                                                                            else {
                                                                                                Errors.error((SubLObject)$ic75$, var98);
                                                                                            }
                                                                                        }
                                                                                        finally {
                                                                                            module0138.$g1624$.rebind(var49_239, var2);
                                                                                        }
                                                                                    }
                                                                                }
                                                                                module0066.f4842(var114_234);
                                                                            }
                                                                            finally {
                                                                                module0138.$g1623$.rebind(var49_238, var2);
                                                                            }
                                                                        }
                                                                    }
                                                                    module0066.f4842(var93);
                                                                }
                                                            }
                                                            else {
                                                                module0136.f8870((SubLObject)FIVE_INTEGER, (SubLObject)$ic76$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                                                            }
                                                        }
                                                        else if (NIL != module0155.f9785(var90, (SubLObject)UNPROVIDED)) {
                                                            var105 = ((NIL != module0138.f8995()) ? module0035.f2097(module0244.f15760(module0138.f8979(), module0141.$g1714$.getDynamicValue(var2), module0137.f8955((SubLObject)UNPROVIDED))) : module0244.f15760(module0138.f8979(), module0141.$g1714$.getDynamicValue(var2), module0137.f8955((SubLObject)UNPROVIDED)));
                                                            for (var229_259 = (SubLObject)NIL, var229_259 = var105; NIL == var9 && NIL != var229_259; var229_259 = var229_259.rest()) {
                                                                var106 = var229_259.first();
                                                                var49_240 = module0138.$g1625$.currentBinding(var2);
                                                                try {
                                                                    module0138.$g1625$.bind(var106, var2);
                                                                    var107 = (var108 = Functions.funcall(var106, var90));
                                                                    if (NIL != module0077.f5302(var108)) {
                                                                        var109 = module0077.f5333(var108);
                                                                        for (var110 = module0032.f1741(var109), var111 = (SubLObject)NIL, var111 = module0032.f1742(var110, var109); NIL == var9 && NIL == module0032.f1744(var110, var111); var111 = module0032.f1743(var111)) {
                                                                            var112 = module0032.f1745(var110, var111);
                                                                            if (NIL != module0032.f1746(var111, var112) && NIL == module0249.f16059(var112, (SubLObject)UNPROVIDED)) {
                                                                                module0249.f16055(var112, (SubLObject)UNPROVIDED);
                                                                                module0056.f4149(var112, var14);
                                                                            }
                                                                        }
                                                                    }
                                                                    else if (var108.isList()) {
                                                                        if (NIL == var9) {
                                                                            var113 = var108;
                                                                            var114 = (SubLObject)NIL;
                                                                            var114 = var113.first();
                                                                            while (NIL == var9 && NIL != var113) {
                                                                                if (NIL == module0249.f16059(var114, (SubLObject)UNPROVIDED)) {
                                                                                    module0249.f16055(var114, (SubLObject)UNPROVIDED);
                                                                                    module0056.f4149(var114, var14);
                                                                                }
                                                                                var113 = var113.rest();
                                                                                var114 = var113.first();
                                                                            }
                                                                        }
                                                                    }
                                                                    else {
                                                                        Errors.error((SubLObject)$ic75$, var108);
                                                                    }
                                                                }
                                                                finally {
                                                                    module0138.$g1625$.rebind(var49_240, var2);
                                                                }
                                                            }
                                                        }
                                                    }
                                                    finally {
                                                        module0141.$g1674$.rebind(var53_227, var2);
                                                        module0137.$g1605$.rebind(var49_237, var2);
                                                    }
                                                }
                                                var90_220 = module0056.f4150(var14);
                                            }
                                        }
                                        finally {
                                            module0141.$g1674$.rebind(var54_228, var2);
                                            module0138.$g1619$.rebind(var53_225, var2);
                                            module0141.$g1677$.rebind(var49_224, var2);
                                        }
                                    }
                                    else {
                                        module0136.f8872((SubLObject)TWO_INTEGER, (SubLObject)$ic78$, var10, module0244.f15748(module0137.f8955((SubLObject)UNPROVIDED)), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                                    }
                                }
                                finally {
                                    module0137.$g1605$.rebind(var19, var2);
                                    module0141.$g1674$.rebind(var18, var2);
                                    module0141.$g1672$.rebind(var17, var2);
                                    module0141.$g1671$.rebind(var53_224, var2);
                                    module0141.$g1670$.rebind(var49_223, var2);
                                }
                            }
                            finally {
                                module0141.$g1715$.rebind(var53_223, var2);
                                module0141.$g1714$.rebind(var49_222, var2);
                            }
                            module0139.f9011(module0139.$g1635$.getDynamicValue(var2));
                        }
                        finally {
                            module0139.$g1635$.rebind(var49_221, var2);
                        }
                    }
                    module0139.f9011(module0139.$g1636$.getDynamicValue(var2));
                }
                finally {
                    module0139.$g1636$.rebind(var12, var2);
                    module0137.$g1605$.rebind(var11, var2);
                }
            }
            return var9;
        }
        cdestructuring_bind.cdestructuring_bind_error(var3, (SubLObject)$ic135$);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f31775(final SubLObject var5, final SubLObject var29, final SubLObject var68) {
        return (SubLObject)((NIL != module0226.f14807(var29) && NIL != module0269.f17705(var5) && (!var68.isInteger() || module0217.f14247(var29, (SubLObject)UNPROVIDED).numGE(var68))) ? f31808(var5, var29, var68, (SubLObject)UNPROVIDED) : ZERO_INTEGER);
    }
    
    public static SubLObject f31808(final SubLObject var5, final SubLObject var29, SubLObject var68, SubLObject var275) {
        if (var275 == UNPROVIDED) {
            var275 = (SubLObject)NIL;
        }
        final SubLThread var276 = SubLProcess.currentSubLThread();
        SubLObject var277 = (SubLObject)NIL;
        SubLObject var278 = (SubLObject)NIL;
        SubLObject var279 = (SubLObject)NIL;
        final SubLObject var280 = module0139.$g1630$.getDynamicValue(var276);
        final SubLObject var281 = module0139.$g1631$.currentBinding(var276);
        final SubLObject var282 = module0139.$g1632$.currentBinding(var276);
        final SubLObject var283 = module0139.$g1630$.currentBinding(var276);
        try {
            module0139.$g1631$.bind(module0139.f9015(var280, (SubLObject)SIX_INTEGER), var276);
            module0139.$g1632$.bind(module0139.f9016(var280), var276);
            module0139.$g1630$.bind((SubLObject)T, var276);
            var276.resetMultipleValues();
            final SubLObject var278_279 = f31818(var5, var29, var68, var275);
            final SubLObject var280_281 = var276.secondMultipleValue();
            final SubLObject var282_283 = var276.thirdMultipleValue();
            final SubLObject var284_285 = var276.fourthMultipleValue();
            var276.resetMultipleValues();
            var68 = var278_279;
            var278 = var280_281;
            var277 = var282_283;
            var279 = var284_285;
        }
        finally {
            module0139.$g1630$.rebind(var283, var276);
            module0139.$g1632$.rebind(var282, var276);
            module0139.$g1631$.rebind(var281, var276);
        }
        if (NIL != var278) {
            return Values.values((SubLObject)$ic84$, var279);
        }
        if (var277.eql(var68)) {
            return Values.values((SubLObject)$ic37$, var279);
        }
        return Values.values(var277, var279);
    }
    
    public static SubLObject f31818(final SubLObject var5, final SubLObject var29, final SubLObject var68, final SubLObject var275) {
        final SubLThread var276 = SubLProcess.currentSubLThread();
        final SubLObject var277 = $ic21$;
        final SubLObject var278 = module0141.f9295(var277);
        SubLObject var279 = (SubLObject)ZERO_INTEGER;
        SubLObject var280 = (SubLObject)NIL;
        SubLObject var281 = (SubLObject)NIL;
        final SubLObject var282 = module0137.$g1605$.currentBinding(var276);
        final SubLObject var283 = module0139.$g1636$.currentBinding(var276);
        try {
            module0137.$g1605$.bind(module0137.f8955($ic24$), var276);
            module0139.$g1636$.bind(module0139.f9007(), var276);
            if (NIL == var280) {
                SubLObject var90_286 = var5;
                final SubLObject var284 = (SubLObject)$ic66$;
                final SubLObject var285 = module0056.f4145(var284);
                final SubLObject var49_287 = module0139.$g1635$.currentBinding(var276);
                try {
                    module0139.$g1635$.bind(module0139.f9007(), var276);
                    final SubLObject var286 = var277;
                    final SubLObject var49_288 = module0141.$g1714$.currentBinding(var276);
                    final SubLObject var53_289 = module0141.$g1715$.currentBinding(var276);
                    try {
                        module0141.$g1714$.bind((NIL != var286) ? var286 : module0141.f9283(), var276);
                        module0141.$g1715$.bind((SubLObject)((NIL != var286) ? $ic67$ : module0141.$g1715$.getDynamicValue(var276)), var276);
                        if (NIL != var286 && NIL != module0136.f8864() && NIL == module0141.f9279(var286)) {
                            final SubLObject var287 = module0136.$g1591$.getDynamicValue(var276);
                            if (var287.eql((SubLObject)$ic68$)) {
                                module0136.f8870((SubLObject)ONE_INTEGER, (SubLObject)$ic69$, var286, (SubLObject)$ic70$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                            }
                            else if (var287.eql((SubLObject)$ic71$)) {
                                module0136.f8871((SubLObject)ONE_INTEGER, (SubLObject)$ic72$, (SubLObject)$ic69$, var286, (SubLObject)$ic70$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                            }
                            else if (var287.eql((SubLObject)$ic73$)) {
                                Errors.warn((SubLObject)$ic69$, var286, (SubLObject)$ic70$);
                            }
                            else {
                                Errors.warn((SubLObject)$ic74$, module0136.$g1591$.getDynamicValue(var276));
                                Errors.cerror((SubLObject)$ic72$, (SubLObject)$ic69$, var286, (SubLObject)$ic70$);
                            }
                        }
                        final SubLObject var49_289 = module0141.$g1670$.currentBinding(var276);
                        final SubLObject var53_290 = module0141.$g1671$.currentBinding(var276);
                        final SubLObject var288 = module0141.$g1672$.currentBinding(var276);
                        final SubLObject var289 = module0141.$g1674$.currentBinding(var276);
                        final SubLObject var290 = module0137.$g1605$.currentBinding(var276);
                        try {
                            module0141.$g1670$.bind(module0244.f15771(module0137.f8955($ic24$)), var276);
                            module0141.$g1671$.bind(module0244.f15739(module0244.f15771(module0137.f8955($ic24$))), var276);
                            module0141.$g1672$.bind(module0244.f15746(module0244.f15771(module0137.f8955($ic24$))), var276);
                            module0141.$g1674$.bind((SubLObject)NIL, var276);
                            module0137.$g1605$.bind(module0244.f15771(module0137.f8955($ic24$)), var276);
                            if (NIL != module0136.f8865() || NIL != module0244.f15795(var5, module0137.f8955((SubLObject)UNPROVIDED))) {
                                final SubLObject var49_290 = module0141.$g1677$.currentBinding(var276);
                                final SubLObject var53_291 = module0138.$g1619$.currentBinding(var276);
                                final SubLObject var54_294 = module0141.$g1674$.currentBinding(var276);
                                try {
                                    module0141.$g1677$.bind(module0141.f9210(), var276);
                                    module0138.$g1619$.bind(module0244.f15782(module0141.f9210(), module0244.f15771(module0137.f8955($ic24$))), var276);
                                    module0141.$g1674$.bind((SubLObject)NIL, var276);
                                    module0249.f16055(var90_286, (SubLObject)UNPROVIDED);
                                    while (NIL != var90_286 && NIL == var280) {
                                        final SubLObject var291 = var90_286;
                                        final SubLObject var292 = module0200.f12443(module0137.f8955($ic24$));
                                        SubLObject var293;
                                        SubLObject var294;
                                        SubLObject var49_291;
                                        SubLObject var53_292;
                                        SubLObject var295;
                                        SubLObject var296;
                                        SubLObject var297;
                                        SubLObject var298;
                                        SubLObject var299;
                                        SubLObject var300;
                                        SubLObject var49_292;
                                        SubLObject var114_298;
                                        SubLObject var301;
                                        SubLObject var302;
                                        SubLObject var49_293;
                                        SubLObject var303;
                                        SubLObject var304;
                                        SubLObject var305;
                                        SubLObject var306;
                                        SubLObject var307;
                                        SubLObject var308;
                                        SubLObject var309;
                                        SubLObject var310;
                                        SubLObject var311;
                                        SubLObject var313;
                                        SubLObject var312;
                                        SubLObject var314;
                                        SubLObject var315;
                                        SubLObject var316;
                                        SubLObject var49_294;
                                        SubLObject var49_295;
                                        SubLObject var317;
                                        SubLObject var129_304;
                                        SubLObject var318;
                                        SubLObject var229_305;
                                        SubLObject var319;
                                        SubLObject var49_296;
                                        SubLObject var321;
                                        SubLObject var320;
                                        SubLObject var322;
                                        SubLObject var323;
                                        SubLObject var324;
                                        SubLObject var325;
                                        SubLObject var326;
                                        SubLObject var327;
                                        for (var293 = (SubLObject)NIL, var293 = var292; NIL == var280 && NIL != var293; var293 = var293.rest()) {
                                            var294 = var293.first();
                                            var49_291 = module0137.$g1605$.currentBinding(var276);
                                            var53_292 = module0141.$g1674$.currentBinding(var276);
                                            try {
                                                module0137.$g1605$.bind(var294, var276);
                                                module0141.$g1674$.bind((SubLObject)((NIL != module0141.f9205((SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)) ? makeBoolean(NIL == module0141.$g1674$.getDynamicValue(var276)) : module0141.$g1674$.getDynamicValue(var276)), var276);
                                                var295 = module0228.f15229(var291);
                                                if (NIL != module0138.f8992(var295)) {
                                                    var296 = module0242.f15664(var295, module0137.f8955((SubLObject)UNPROVIDED));
                                                    if (NIL != var296) {
                                                        var297 = module0245.f15834(var296, module0244.f15780(module0137.f8955($ic24$)), module0137.f8955((SubLObject)UNPROVIDED));
                                                        if (NIL != var297) {
                                                            for (var298 = module0066.f4838(module0067.f4891(var297)); NIL == var280 && NIL == module0066.f4841(var298); var298 = module0066.f4840(var298)) {
                                                                var276.resetMultipleValues();
                                                                var299 = module0066.f4839(var298);
                                                                var300 = var276.secondMultipleValue();
                                                                var276.resetMultipleValues();
                                                                if (NIL != module0147.f9507(var299)) {
                                                                    var49_292 = module0138.$g1623$.currentBinding(var276);
                                                                    try {
                                                                        module0138.$g1623$.bind(var299, var276);
                                                                        for (var114_298 = module0066.f4838(module0067.f4891(var300)); NIL == var280 && NIL == module0066.f4841(var114_298); var114_298 = module0066.f4840(var114_298)) {
                                                                            var276.resetMultipleValues();
                                                                            var301 = module0066.f4839(var114_298);
                                                                            var302 = var276.secondMultipleValue();
                                                                            var276.resetMultipleValues();
                                                                            if (NIL != module0141.f9289(var301)) {
                                                                                var49_293 = module0138.$g1624$.currentBinding(var276);
                                                                                try {
                                                                                    module0138.$g1624$.bind(var301, var276);
                                                                                    var303 = var302;
                                                                                    if (NIL != module0077.f5302(var303)) {
                                                                                        var304 = module0077.f5333(var303);
                                                                                        for (var305 = module0032.f1741(var304), var306 = (SubLObject)NIL, var306 = module0032.f1742(var305, var304); NIL == var280 && NIL == module0032.f1744(var305, var306); var306 = module0032.f1743(var306)) {
                                                                                            var307 = module0032.f1745(var305, var306);
                                                                                            if (NIL != module0032.f1746(var306, var307) && NIL == module0249.f16059(var307, module0139.$g1636$.getDynamicValue(var276))) {
                                                                                                module0249.f16055(var307, module0139.$g1636$.getDynamicValue(var276));
                                                                                                if (NIL != module0173.f10955(var307) && NIL != f31765(var307, var29, (SubLObject)ONE_INTEGER, var278)) {
                                                                                                    if (NIL != var275) {
                                                                                                        var281 = (SubLObject)ConsesLow.cons(var307, var281);
                                                                                                    }
                                                                                                    var279 = Numbers.add(var279, (SubLObject)ONE_INTEGER);
                                                                                                    var280 = (SubLObject)makeBoolean(var68.isInteger() && var279.numG(var68));
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                    else if (var303.isList()) {
                                                                                        if (NIL == var280) {
                                                                                            var308 = var303;
                                                                                            var309 = (SubLObject)NIL;
                                                                                            var309 = var308.first();
                                                                                            while (NIL == var280 && NIL != var308) {
                                                                                                if (NIL == module0249.f16059(var309, module0139.$g1636$.getDynamicValue(var276))) {
                                                                                                    module0249.f16055(var309, module0139.$g1636$.getDynamicValue(var276));
                                                                                                    if (NIL != module0173.f10955(var309) && NIL != f31765(var309, var29, (SubLObject)ONE_INTEGER, var278)) {
                                                                                                        if (NIL != var275) {
                                                                                                            var281 = (SubLObject)ConsesLow.cons(var309, var281);
                                                                                                        }
                                                                                                        var279 = Numbers.add(var279, (SubLObject)ONE_INTEGER);
                                                                                                        var280 = (SubLObject)makeBoolean(var68.isInteger() && var279.numG(var68));
                                                                                                    }
                                                                                                }
                                                                                                var308 = var308.rest();
                                                                                                var309 = var308.first();
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                    else {
                                                                                        Errors.error((SubLObject)$ic75$, var303);
                                                                                    }
                                                                                }
                                                                                finally {
                                                                                    module0138.$g1624$.rebind(var49_293, var276);
                                                                                }
                                                                            }
                                                                        }
                                                                        module0066.f4842(var114_298);
                                                                    }
                                                                    finally {
                                                                        module0138.$g1623$.rebind(var49_292, var276);
                                                                    }
                                                                }
                                                            }
                                                            module0066.f4842(var298);
                                                        }
                                                    }
                                                    else {
                                                        module0136.f8870((SubLObject)FIVE_INTEGER, (SubLObject)$ic76$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                                                    }
                                                    if (NIL != module0200.f12419(var295, module0137.f8955((SubLObject)UNPROVIDED)) && NIL == var280) {
                                                        var310 = module0248.f15995(var295);
                                                        var311 = (SubLObject)NIL;
                                                        var311 = var310.first();
                                                        while (NIL == var280 && NIL != var310) {
                                                            var312 = (var313 = var311);
                                                            var314 = (SubLObject)NIL;
                                                            var315 = (SubLObject)NIL;
                                                            var316 = (SubLObject)NIL;
                                                            cdestructuring_bind.destructuring_bind_must_consp(var313, var312, (SubLObject)$ic77$);
                                                            var314 = var313.first();
                                                            var313 = var313.rest();
                                                            cdestructuring_bind.destructuring_bind_must_consp(var313, var312, (SubLObject)$ic77$);
                                                            var315 = var313.first();
                                                            var313 = var313.rest();
                                                            cdestructuring_bind.destructuring_bind_must_consp(var313, var312, (SubLObject)$ic77$);
                                                            var316 = var313.first();
                                                            var313 = var313.rest();
                                                            if (NIL == var313) {
                                                                if (NIL != module0147.f9507(var315)) {
                                                                    var49_294 = module0138.$g1623$.currentBinding(var276);
                                                                    try {
                                                                        module0138.$g1623$.bind(var315, var276);
                                                                        if (NIL != module0141.f9289(var316)) {
                                                                            var49_295 = module0138.$g1624$.currentBinding(var276);
                                                                            try {
                                                                                module0138.$g1624$.bind(var316, var276);
                                                                                var317 = (var303 = (SubLObject)ConsesLow.list(var314));
                                                                                if (NIL != module0077.f5302(var303)) {
                                                                                    var304 = module0077.f5333(var303);
                                                                                    for (var305 = module0032.f1741(var304), var306 = (SubLObject)NIL, var306 = module0032.f1742(var305, var304); NIL == var280 && NIL == module0032.f1744(var305, var306); var306 = module0032.f1743(var306)) {
                                                                                        var307 = module0032.f1745(var305, var306);
                                                                                        if (NIL != module0032.f1746(var306, var307) && NIL == module0249.f16059(var307, module0139.$g1636$.getDynamicValue(var276))) {
                                                                                            module0249.f16055(var307, module0139.$g1636$.getDynamicValue(var276));
                                                                                            if (NIL != module0173.f10955(var307) && NIL != f31765(var307, var29, (SubLObject)ONE_INTEGER, var278)) {
                                                                                                if (NIL != var275) {
                                                                                                    var281 = (SubLObject)ConsesLow.cons(var307, var281);
                                                                                                }
                                                                                                var279 = Numbers.add(var279, (SubLObject)ONE_INTEGER);
                                                                                                var280 = (SubLObject)makeBoolean(var68.isInteger() && var279.numG(var68));
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                }
                                                                                else if (var303.isList()) {
                                                                                    if (NIL == var280) {
                                                                                        var129_304 = var303;
                                                                                        var309 = (SubLObject)NIL;
                                                                                        var309 = var129_304.first();
                                                                                        while (NIL == var280 && NIL != var129_304) {
                                                                                            if (NIL == module0249.f16059(var309, module0139.$g1636$.getDynamicValue(var276))) {
                                                                                                module0249.f16055(var309, module0139.$g1636$.getDynamicValue(var276));
                                                                                                if (NIL != module0173.f10955(var309) && NIL != f31765(var309, var29, (SubLObject)ONE_INTEGER, var278)) {
                                                                                                    if (NIL != var275) {
                                                                                                        var281 = (SubLObject)ConsesLow.cons(var309, var281);
                                                                                                    }
                                                                                                    var279 = Numbers.add(var279, (SubLObject)ONE_INTEGER);
                                                                                                    var280 = (SubLObject)makeBoolean(var68.isInteger() && var279.numG(var68));
                                                                                                }
                                                                                            }
                                                                                            var129_304 = var129_304.rest();
                                                                                            var309 = var129_304.first();
                                                                                        }
                                                                                    }
                                                                                }
                                                                                else {
                                                                                    Errors.error((SubLObject)$ic75$, var303);
                                                                                }
                                                                            }
                                                                            finally {
                                                                                module0138.$g1624$.rebind(var49_295, var276);
                                                                            }
                                                                        }
                                                                    }
                                                                    finally {
                                                                        module0138.$g1623$.rebind(var49_294, var276);
                                                                    }
                                                                }
                                                            }
                                                            else {
                                                                cdestructuring_bind.cdestructuring_bind_error(var312, (SubLObject)$ic77$);
                                                            }
                                                            var310 = var310.rest();
                                                            var311 = var310.first();
                                                        }
                                                    }
                                                }
                                                else if (NIL != module0155.f9785(var295, (SubLObject)UNPROVIDED)) {
                                                    var318 = ((NIL != module0138.f8995()) ? module0035.f2097(module0244.f15760(module0244.f15780(module0137.f8955($ic24$)), module0141.$g1714$.getDynamicValue(var276), module0137.f8955((SubLObject)UNPROVIDED))) : module0244.f15760(module0244.f15780(module0137.f8955($ic24$)), module0141.$g1714$.getDynamicValue(var276), module0137.f8955((SubLObject)UNPROVIDED)));
                                                    for (var229_305 = (SubLObject)NIL, var229_305 = var318; NIL == var280 && NIL != var229_305; var229_305 = var229_305.rest()) {
                                                        var319 = var229_305.first();
                                                        var49_296 = module0138.$g1625$.currentBinding(var276);
                                                        try {
                                                            module0138.$g1625$.bind(var319, var276);
                                                            var320 = (var321 = Functions.funcall(var319, var295));
                                                            if (NIL != module0077.f5302(var321)) {
                                                                var322 = module0077.f5333(var321);
                                                                for (var323 = module0032.f1741(var322), var324 = (SubLObject)NIL, var324 = module0032.f1742(var323, var322); NIL == var280 && NIL == module0032.f1744(var323, var324); var324 = module0032.f1743(var324)) {
                                                                    var325 = module0032.f1745(var323, var324);
                                                                    if (NIL != module0032.f1746(var324, var325) && NIL == module0249.f16059(var325, module0139.$g1636$.getDynamicValue(var276))) {
                                                                        module0249.f16055(var325, module0139.$g1636$.getDynamicValue(var276));
                                                                        if (NIL != module0173.f10955(var325) && NIL != f31765(var325, var29, (SubLObject)ONE_INTEGER, var278)) {
                                                                            if (NIL != var275) {
                                                                                var281 = (SubLObject)ConsesLow.cons(var325, var281);
                                                                            }
                                                                            var279 = Numbers.add(var279, (SubLObject)ONE_INTEGER);
                                                                            var280 = (SubLObject)makeBoolean(var68.isInteger() && var279.numG(var68));
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                            else if (var321.isList()) {
                                                                if (NIL == var280) {
                                                                    var326 = var321;
                                                                    var327 = (SubLObject)NIL;
                                                                    var327 = var326.first();
                                                                    while (NIL == var280 && NIL != var326) {
                                                                        if (NIL == module0249.f16059(var327, module0139.$g1636$.getDynamicValue(var276))) {
                                                                            module0249.f16055(var327, module0139.$g1636$.getDynamicValue(var276));
                                                                            if (NIL != module0173.f10955(var327) && NIL != f31765(var327, var29, (SubLObject)ONE_INTEGER, var278)) {
                                                                                if (NIL != var275) {
                                                                                    var281 = (SubLObject)ConsesLow.cons(var327, var281);
                                                                                }
                                                                                var279 = Numbers.add(var279, (SubLObject)ONE_INTEGER);
                                                                                var280 = (SubLObject)makeBoolean(var68.isInteger() && var279.numG(var68));
                                                                            }
                                                                        }
                                                                        var326 = var326.rest();
                                                                        var327 = var326.first();
                                                                    }
                                                                }
                                                            }
                                                            else {
                                                                Errors.error((SubLObject)$ic75$, var321);
                                                            }
                                                        }
                                                        finally {
                                                            module0138.$g1625$.rebind(var49_296, var276);
                                                        }
                                                    }
                                                }
                                            }
                                            finally {
                                                module0141.$g1674$.rebind(var53_292, var276);
                                                module0137.$g1605$.rebind(var49_291, var276);
                                            }
                                        }
                                        final SubLObject var328 = module0200.f12443(module0244.f15771(module0137.f8955($ic24$)));
                                        SubLObject var329;
                                        SubLObject var330;
                                        SubLObject var49_297;
                                        SubLObject var53_293;
                                        SubLObject var331;
                                        SubLObject var332;
                                        SubLObject var333;
                                        SubLObject var334;
                                        SubLObject var335;
                                        SubLObject var336;
                                        SubLObject var49_298;
                                        SubLObject var114_299;
                                        SubLObject var337;
                                        SubLObject var338;
                                        SubLObject var49_299;
                                        SubLObject var339;
                                        SubLObject var340;
                                        SubLObject var341;
                                        SubLObject var342;
                                        SubLObject var343;
                                        SubLObject var344;
                                        SubLObject var345;
                                        SubLObject var346;
                                        SubLObject var229_306;
                                        SubLObject var347;
                                        SubLObject var49_300;
                                        SubLObject var349;
                                        SubLObject var348;
                                        SubLObject var350;
                                        SubLObject var351;
                                        SubLObject var352;
                                        SubLObject var353;
                                        SubLObject var354;
                                        SubLObject var355;
                                        for (var329 = (SubLObject)NIL, var329 = var328; NIL == var280 && NIL != var329; var329 = var329.rest()) {
                                            var330 = var329.first();
                                            var49_297 = module0137.$g1605$.currentBinding(var276);
                                            var53_293 = module0141.$g1674$.currentBinding(var276);
                                            try {
                                                module0137.$g1605$.bind(var330, var276);
                                                module0141.$g1674$.bind((SubLObject)((NIL != module0141.f9205((SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)) ? makeBoolean(NIL == module0141.$g1674$.getDynamicValue(var276)) : module0141.$g1674$.getDynamicValue(var276)), var276);
                                                var331 = module0228.f15229(var90_286);
                                                if (NIL != module0138.f8992(var331)) {
                                                    var332 = module0242.f15664(var331, module0137.f8955((SubLObject)UNPROVIDED));
                                                    if (NIL != var332) {
                                                        var333 = module0245.f15834(var332, module0138.f8979(), module0137.f8955((SubLObject)UNPROVIDED));
                                                        if (NIL != var333) {
                                                            for (var334 = module0066.f4838(module0067.f4891(var333)); NIL == var280 && NIL == module0066.f4841(var334); var334 = module0066.f4840(var334)) {
                                                                var276.resetMultipleValues();
                                                                var335 = module0066.f4839(var334);
                                                                var336 = var276.secondMultipleValue();
                                                                var276.resetMultipleValues();
                                                                if (NIL != module0147.f9507(var335)) {
                                                                    var49_298 = module0138.$g1623$.currentBinding(var276);
                                                                    try {
                                                                        module0138.$g1623$.bind(var335, var276);
                                                                        for (var114_299 = module0066.f4838(module0067.f4891(var336)); NIL == var280 && NIL == module0066.f4841(var114_299); var114_299 = module0066.f4840(var114_299)) {
                                                                            var276.resetMultipleValues();
                                                                            var337 = module0066.f4839(var114_299);
                                                                            var338 = var276.secondMultipleValue();
                                                                            var276.resetMultipleValues();
                                                                            if (NIL != module0141.f9289(var337)) {
                                                                                var49_299 = module0138.$g1624$.currentBinding(var276);
                                                                                try {
                                                                                    module0138.$g1624$.bind(var337, var276);
                                                                                    var339 = var338;
                                                                                    if (NIL != module0077.f5302(var339)) {
                                                                                        var340 = module0077.f5333(var339);
                                                                                        for (var341 = module0032.f1741(var340), var342 = (SubLObject)NIL, var342 = module0032.f1742(var341, var340); NIL == var280 && NIL == module0032.f1744(var341, var342); var342 = module0032.f1743(var342)) {
                                                                                            var343 = module0032.f1745(var341, var342);
                                                                                            if (NIL != module0032.f1746(var342, var343) && NIL == module0249.f16059(var343, (SubLObject)UNPROVIDED)) {
                                                                                                module0249.f16055(var343, (SubLObject)UNPROVIDED);
                                                                                                module0056.f4149(var343, var285);
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                    else if (var339.isList()) {
                                                                                        if (NIL == var280) {
                                                                                            var344 = var339;
                                                                                            var345 = (SubLObject)NIL;
                                                                                            var345 = var344.first();
                                                                                            while (NIL == var280 && NIL != var344) {
                                                                                                if (NIL == module0249.f16059(var345, (SubLObject)UNPROVIDED)) {
                                                                                                    module0249.f16055(var345, (SubLObject)UNPROVIDED);
                                                                                                    module0056.f4149(var345, var285);
                                                                                                }
                                                                                                var344 = var344.rest();
                                                                                                var345 = var344.first();
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                    else {
                                                                                        Errors.error((SubLObject)$ic75$, var339);
                                                                                    }
                                                                                }
                                                                                finally {
                                                                                    module0138.$g1624$.rebind(var49_299, var276);
                                                                                }
                                                                            }
                                                                        }
                                                                        module0066.f4842(var114_299);
                                                                    }
                                                                    finally {
                                                                        module0138.$g1623$.rebind(var49_298, var276);
                                                                    }
                                                                }
                                                            }
                                                            module0066.f4842(var334);
                                                        }
                                                    }
                                                    else {
                                                        module0136.f8870((SubLObject)FIVE_INTEGER, (SubLObject)$ic76$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                                                    }
                                                }
                                                else if (NIL != module0155.f9785(var331, (SubLObject)UNPROVIDED)) {
                                                    var346 = ((NIL != module0138.f8995()) ? module0035.f2097(module0244.f15760(module0138.f8979(), module0141.$g1714$.getDynamicValue(var276), module0137.f8955((SubLObject)UNPROVIDED))) : module0244.f15760(module0138.f8979(), module0141.$g1714$.getDynamicValue(var276), module0137.f8955((SubLObject)UNPROVIDED)));
                                                    for (var229_306 = (SubLObject)NIL, var229_306 = var346; NIL == var280 && NIL != var229_306; var229_306 = var229_306.rest()) {
                                                        var347 = var229_306.first();
                                                        var49_300 = module0138.$g1625$.currentBinding(var276);
                                                        try {
                                                            module0138.$g1625$.bind(var347, var276);
                                                            var348 = (var349 = Functions.funcall(var347, var331));
                                                            if (NIL != module0077.f5302(var349)) {
                                                                var350 = module0077.f5333(var349);
                                                                for (var351 = module0032.f1741(var350), var352 = (SubLObject)NIL, var352 = module0032.f1742(var351, var350); NIL == var280 && NIL == module0032.f1744(var351, var352); var352 = module0032.f1743(var352)) {
                                                                    var353 = module0032.f1745(var351, var352);
                                                                    if (NIL != module0032.f1746(var352, var353) && NIL == module0249.f16059(var353, (SubLObject)UNPROVIDED)) {
                                                                        module0249.f16055(var353, (SubLObject)UNPROVIDED);
                                                                        module0056.f4149(var353, var285);
                                                                    }
                                                                }
                                                            }
                                                            else if (var349.isList()) {
                                                                if (NIL == var280) {
                                                                    var354 = var349;
                                                                    var355 = (SubLObject)NIL;
                                                                    var355 = var354.first();
                                                                    while (NIL == var280 && NIL != var354) {
                                                                        if (NIL == module0249.f16059(var355, (SubLObject)UNPROVIDED)) {
                                                                            module0249.f16055(var355, (SubLObject)UNPROVIDED);
                                                                            module0056.f4149(var355, var285);
                                                                        }
                                                                        var354 = var354.rest();
                                                                        var355 = var354.first();
                                                                    }
                                                                }
                                                            }
                                                            else {
                                                                Errors.error((SubLObject)$ic75$, var349);
                                                            }
                                                        }
                                                        finally {
                                                            module0138.$g1625$.rebind(var49_300, var276);
                                                        }
                                                    }
                                                }
                                            }
                                            finally {
                                                module0141.$g1674$.rebind(var53_293, var276);
                                                module0137.$g1605$.rebind(var49_297, var276);
                                            }
                                        }
                                        var90_286 = module0056.f4150(var285);
                                    }
                                }
                                finally {
                                    module0141.$g1674$.rebind(var54_294, var276);
                                    module0138.$g1619$.rebind(var53_291, var276);
                                    module0141.$g1677$.rebind(var49_290, var276);
                                }
                            }
                            else {
                                module0136.f8872((SubLObject)TWO_INTEGER, (SubLObject)$ic78$, var5, module0244.f15748(module0137.f8955((SubLObject)UNPROVIDED)), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                            }
                        }
                        finally {
                            module0137.$g1605$.rebind(var290, var276);
                            module0141.$g1674$.rebind(var289, var276);
                            module0141.$g1672$.rebind(var288, var276);
                            module0141.$g1671$.rebind(var53_290, var276);
                            module0141.$g1670$.rebind(var49_289, var276);
                        }
                    }
                    finally {
                        module0141.$g1715$.rebind(var53_289, var276);
                        module0141.$g1714$.rebind(var49_288, var276);
                    }
                    module0139.f9011(module0139.$g1635$.getDynamicValue(var276));
                }
                finally {
                    module0139.$g1635$.rebind(var49_287, var276);
                }
            }
            module0139.f9011(module0139.$g1636$.getDynamicValue(var276));
        }
        finally {
            module0139.$g1636$.rebind(var283, var276);
            module0137.$g1605$.rebind(var282, var276);
        }
        return Values.values(var68, var280, var279, var281);
    }
    
    public static SubLObject f31770(final SubLObject var29, final SubLObject var314, final SubLObject var36) {
        final SubLThread var315 = SubLProcess.currentSubLThread();
        SubLObject var316 = (SubLObject)NIL;
        if (NIL != module0158.f10038(var29)) {
            final SubLObject var317 = (SubLObject)NIL;
            final SubLObject var318 = module0012.$g73$.currentBinding(var315);
            final SubLObject var319 = module0012.$g65$.currentBinding(var315);
            final SubLObject var320 = module0012.$g67$.currentBinding(var315);
            final SubLObject var321 = module0012.$g68$.currentBinding(var315);
            final SubLObject var322 = module0012.$g66$.currentBinding(var315);
            final SubLObject var323 = module0012.$g69$.currentBinding(var315);
            final SubLObject var324 = module0012.$g70$.currentBinding(var315);
            final SubLObject var325 = module0012.$silent_progressP$.currentBinding(var315);
            try {
                module0012.$g73$.bind(Time.get_universal_time(), var315);
                module0012.$g65$.bind(module0012.$g73$.getDynamicValue(var315), var315);
                module0012.$g67$.bind((SubLObject)ONE_INTEGER, var315);
                module0012.$g68$.bind((SubLObject)ZERO_INTEGER, var315);
                module0012.$g66$.bind((SubLObject)ZERO_INTEGER, var315);
                module0012.$g69$.bind((SubLObject)ZERO_INTEGER, var315);
                module0012.$g70$.bind((SubLObject)T, var315);
                module0012.$silent_progressP$.bind((SubLObject)((NIL != var317) ? module0012.$silent_progressP$.getDynamicValue(var315) : T), var315);
                module0012.f474(var317);
                final SubLObject var326 = module0158.f10039(var29);
                SubLObject var327 = (SubLObject)NIL;
                final SubLObject var328 = (SubLObject)NIL;
                while (NIL == var327) {
                    final SubLObject var329 = module0052.f3695(var326, var328);
                    final SubLObject var330 = (SubLObject)makeBoolean(!var328.eql(var329));
                    if (NIL != var330) {
                        module0012.f476();
                        SubLObject var331 = (SubLObject)NIL;
                        try {
                            var331 = module0158.f10316(var329, (SubLObject)$ic22$, var36, (SubLObject)NIL);
                            SubLObject var40_322 = (SubLObject)NIL;
                            final SubLObject var41_323 = (SubLObject)NIL;
                            while (NIL == var40_322) {
                                final SubLObject var332 = module0052.f3695(var331, var41_323);
                                final SubLObject var43_324 = (SubLObject)makeBoolean(!var41_323.eql(var332));
                                if (NIL != var43_324) {
                                    final SubLObject var333 = module0178.f11331(var332, var314);
                                    if (NIL == conses_high.member(var333, var316, Symbols.symbol_function((SubLObject)EQL), Symbols.symbol_function((SubLObject)IDENTITY))) {
                                        var316 = (SubLObject)ConsesLow.cons(var333, var316);
                                    }
                                }
                                var40_322 = (SubLObject)makeBoolean(NIL == var43_324);
                            }
                        }
                        finally {
                            final SubLObject var49_325 = Threads.$is_thread_performing_cleanupP$.currentBinding(var315);
                            try {
                                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)T, var315);
                                if (NIL != var331) {
                                    module0158.f10319(var331);
                                }
                            }
                            finally {
                                Threads.$is_thread_performing_cleanupP$.rebind(var49_325, var315);
                            }
                        }
                    }
                    var327 = (SubLObject)makeBoolean(NIL == var330);
                }
                module0012.f475();
            }
            finally {
                module0012.$silent_progressP$.rebind(var325, var315);
                module0012.$g70$.rebind(var324, var315);
                module0012.$g69$.rebind(var323, var315);
                module0012.$g66$.rebind(var322, var315);
                module0012.$g68$.rebind(var321, var315);
                module0012.$g67$.rebind(var320, var315);
                module0012.$g65$.rebind(var319, var315);
                module0012.$g73$.rebind(var318, var315);
            }
        }
        return var316;
    }
    
    public static SubLObject f31786(final SubLObject var1, final SubLObject var326) {
        final SubLThread var327 = SubLProcess.currentSubLThread();
        SubLObject var329;
        final SubLObject var328 = var329 = module0205.f13385(var1, (SubLObject)UNPROVIDED);
        SubLObject var330 = (SubLObject)NIL;
        SubLObject var331 = (SubLObject)NIL;
        SubLObject var332 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var329, var328, (SubLObject)$ic136$);
        var330 = var329.first();
        var329 = var329.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var329, var328, (SubLObject)$ic136$);
        var331 = var329.first();
        var329 = var329.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var329, var328, (SubLObject)$ic136$);
        var332 = var329.first();
        var329 = var329.rest();
        if (NIL == var329) {
            if (NIL != module0226.f14807(var331)) {
                final SubLObject var333 = $ic21$;
                final SubLObject var334 = module0141.f9295(var333);
                SubLObject var335 = (SubLObject)NIL;
                SubLObject var336 = (SubLObject)NIL;
                SubLObject var337 = f31770(var331, (SubLObject)ONE_INTEGER, var334);
                SubLObject var338 = (SubLObject)NIL;
                var338 = var337.first();
                while (NIL != var337) {
                    SubLObject var26_329 = module0259.f16821(var338, module0147.$g2095$.getDynamicValue(var327), var333);
                    SubLObject var339 = (SubLObject)NIL;
                    var339 = var26_329.first();
                    while (NIL != var26_329) {
                        if (NIL != conses_high.member(var339, var336, Symbols.symbol_function((SubLObject)$ic132$), (SubLObject)UNPROVIDED)) {
                            final SubLObject var340 = var339;
                            if (NIL == conses_high.member(var340, var336, Symbols.symbol_function((SubLObject)EQL), Symbols.symbol_function((SubLObject)IDENTITY))) {
                                var336 = (SubLObject)ConsesLow.cons(var340, var336);
                            }
                        }
                        else if (NIL != conses_high.member(var339, var335, Symbols.symbol_function((SubLObject)$ic132$), (SubLObject)UNPROVIDED)) {
                            final SubLObject var340 = var339;
                            if (NIL == conses_high.member(var340, var335, Symbols.symbol_function((SubLObject)EQL), Symbols.symbol_function((SubLObject)IDENTITY))) {
                                var335 = (SubLObject)ConsesLow.cons(var340, var335);
                            }
                        }
                        else if (NIL != conses_high.member(f31775(var339, var331, var332), var326, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)) {
                            var336 = (SubLObject)ConsesLow.cons(var339, var336);
                            var327.resetMultipleValues();
                            final SubLObject var341 = module0235.f15474(var330, var339, (SubLObject)T, (SubLObject)T);
                            final SubLObject var342 = var327.secondMultipleValue();
                            var327.resetMultipleValues();
                            if (NIL != var341) {
                                final SubLObject var343 = module0202.f12817((SubLObject)ONE_INTEGER, var339, var1);
                                final SubLObject var344 = f31758(var343);
                                module0347.f23330(var344, var341, var342);
                            }
                        }
                        else {
                            var335 = (SubLObject)ConsesLow.cons(var339, var335);
                        }
                        var26_329 = var26_329.rest();
                        var339 = var26_329.first();
                    }
                    var337 = var337.rest();
                    var338 = var337.first();
                }
            }
        }
        else {
            cdestructuring_bind.cdestructuring_bind_error(var328, (SubLObject)$ic136$);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f31758(final SubLObject var1) {
        final SubLObject var2 = module0191.f11990((SubLObject)$ic87$, var1, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        return var2;
    }
    
    public static SubLObject f31819() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0480", "f31754", "S#35093", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0480", "f31756", "S#35094", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0480", "f31755", "S#35095", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0480", "f31760", "S#35096", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0480", "f31761", "S#35097", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0480", "f31762", "S#35098", 1, 1, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0480", "f31763", "S#35099");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0480", "f31764", "S#35100", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0480", "f31765", "S#35101", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0480", "f31766", "S#35102", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0480", "f31767", "S#35103", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0480", "f31768", "S#35104", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0480", "f31769", "S#35105", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0480", "f31771", "S#35106", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0480", "f31773", "S#35107", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0480", "f31772", "S#35108", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0480", "f31759", "S#35109", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0480", "f31774", "S#35110", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0480", "f31776", "S#35111", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0480", "f31777", "S#35112", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0480", "f31778", "S#35113", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0480", "f31779", "S#35114", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0480", "f31780", "S#35115", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0480", "f31781", "S#35116", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0480", "f31782", "S#35117", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0480", "f31783", "S#35118", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0480", "f31784", "S#35119", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0480", "f31785", "S#35120", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0480", "f31787", "S#35121", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0480", "f31788", "S#35122", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0480", "f31789", "S#35123", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0480", "f31790", "S#35124", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0480", "f31791", "S#35125", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0480", "f31792", "S#35126", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0480", "f31794", "S#35127", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0480", "f31795", "S#35128", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0480", "f31796", "S#35129", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0480", "f31798", "S#35130", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0480", "f31799", "S#35131", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0480", "f31800", "S#35132", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0480", "f31801", "S#35133", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0480", "f31802", "S#35134", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0480", "f31803", "S#35135", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0480", "f31804", "S#35136", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0480", "f31805", "S#35137", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0480", "f31806", "S#35138", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0480", "f31793", "S#35139", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0480", "f31807", "S#35140", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0480", "f31809", "S#35141", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0480", "f31810", "S#35142", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0480", "f31811", "S#35143", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0480", "f31812", "S#35144", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0480", "f31797", "S#35145", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0480", "f31813", "S#35146", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0480", "f31814", "S#35147", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0480", "f31815", "S#35148", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0480", "f31816", "S#24970", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0480", "f31817", "S#24969", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0480", "f31757", "S#35149", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0480", "f31775", "S#35150", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0480", "f31808", "S#35151", 3, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0480", "f31818", "S#35152", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0480", "f31770", "S#35153", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0480", "f31786", "S#35154", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0480", "f31758", "S#35155", 1, 0, false);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f31820() {
        return (SubLObject)NIL;
    }
    
    public static SubLObject f31821() {
        module0340.f22938($ic0$);
        module0358.f23774((SubLObject)$ic1$, $ic0$);
        module0358.f23773((SubLObject)$ic2$, $ic0$);
        module0340.f22941((SubLObject)$ic3$, (SubLObject)$ic4$);
        module0340.f22941((SubLObject)$ic6$, (SubLObject)$ic7$);
        module0340.f22941((SubLObject)$ic29$, (SubLObject)$ic30$);
        module0340.f22941((SubLObject)$ic32$, (SubLObject)$ic33$);
        module0340.f22938($ic34$);
        module0358.f23730((SubLObject)$ic35$, (SubLObject)$ic36$);
        module0358.f23773((SubLObject)$ic2$, $ic34$);
        module0340.f22941((SubLObject)$ic38$, (SubLObject)$ic39$);
        module0340.f22941((SubLObject)$ic51$, (SubLObject)$ic52$);
        module0340.f22941((SubLObject)$ic54$, (SubLObject)$ic55$);
        module0340.f22941((SubLObject)$ic57$, (SubLObject)$ic58$);
        module0340.f22941((SubLObject)$ic61$, (SubLObject)$ic62$);
        module0340.f22941((SubLObject)$ic79$, (SubLObject)$ic80$);
        module0340.f22938($ic81$);
        module0358.f23771((SubLObject)$ic1$, $ic81$, (SubLObject)THREE_INTEGER);
        module0358.f23730((SubLObject)$ic82$, (SubLObject)$ic83$);
        module0358.f23773((SubLObject)$ic2$, $ic81$);
        module0340.f22941((SubLObject)$ic85$, (SubLObject)$ic86$);
        module0340.f22941((SubLObject)$ic93$, (SubLObject)$ic94$);
        module0340.f22941((SubLObject)$ic100$, (SubLObject)$ic101$);
        module0340.f22941((SubLObject)$ic102$, (SubLObject)$ic103$);
        module0340.f22938($ic104$);
        module0358.f23771((SubLObject)$ic1$, $ic104$, (SubLObject)THREE_INTEGER);
        module0358.f23730((SubLObject)$ic105$, (SubLObject)$ic106$);
        module0358.f23773((SubLObject)$ic2$, $ic104$);
        module0340.f22941((SubLObject)$ic108$, (SubLObject)$ic109$);
        module0340.f22941((SubLObject)$ic124$, (SubLObject)$ic125$);
        module0340.f22941((SubLObject)$ic128$, (SubLObject)$ic129$);
        module0340.f22941((SubLObject)$ic133$, (SubLObject)$ic134$);
        return (SubLObject)NIL;
    }
    
    public void declareFunctions() {
        f31819();
    }
    
    public void initializeVariables() {
        f31820();
    }
    
    public void runTopLevelForms() {
        f31821();
    }
    
    static {
        me = (SubLFile)new module0480();
        $ic0$ = constant_handles_oc.f8479((SubLObject)makeString("assertedArg1BinaryPreds"));
        $ic1$ = makeKeyword("POS");
        $ic2$ = makeKeyword("NEG");
        $ic3$ = makeKeyword("REMOVAL-ASSERTED-ARG1-BINARY-PREDS-POS-CHECK");
        $ic4$ = ConsesLow.list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), constant_handles_oc.f8479((SubLObject)makeString("assertedArg1BinaryPreds")), makeKeyword("REQUIRED-PATTERN"), ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("assertedArg1BinaryPreds")), (SubLObject)makeKeyword("FORT"), (SubLObject)makeKeyword("FORT")), makeKeyword("COST"), makeSymbol("S#35093", "CYC"), makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("EXPAND"), makeSymbol("S#35094", "CYC"), makeKeyword("DOCUMENTATION"), makeString("(#$assertedArg1BinaryPreds <fort> <fort>)\n    using only the KB GAF indexing and explicit assertions"), makeKeyword("EXAMPLE"), makeString("(#$assertedArg1BinaryPreds #$Predicate #$genlPreds)") });
        $ic5$ = makeKeyword("MINIMIZE");
        $ic6$ = makeKeyword("REMOVAL-ASSERTED-ARG1-BINARY-PREDS-NEG-CHECK");
        $ic7$ = ConsesLow.list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("NEG"), makeKeyword("PREDICATE"), constant_handles_oc.f8479((SubLObject)makeString("assertedArg1BinaryPreds")), makeKeyword("REQUIRED-PATTERN"), ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("assertedArg1BinaryPreds")), (SubLObject)makeKeyword("FORT"), (SubLObject)makeKeyword("FORT")), makeKeyword("COST"), makeSymbol("S#35096", "CYC"), makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("EXPAND"), makeSymbol("S#35097", "CYC"), makeKeyword("DOCUMENTATION"), makeString("(#$not (#$assertedArg1BinaryPreds <fort> <fort>))\n     using only the KB GAF indexing and explicit assertions"), makeKeyword("EXAMPLE"), makeString("(#$not (#$assertedArg1BinaryPreds #$Collection #$arity))") });
        $ic8$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#10388", "CYC"), (SubLObject)makeSymbol("S#12455", "CYC"), (SubLObject)makeSymbol("S#35156", "CYC"), (SubLObject)makeSymbol("&OPTIONAL"), (SubLObject)ConsesLow.list((SubLObject)makeSymbol("NUMBER"), (SubLObject)makeInteger(200))), (SubLObject)makeSymbol("&BODY"), (SubLObject)makeSymbol("S#5", "CYC"));
        $ic9$ = makeInteger(200);
        $ic10$ = makeUninternedSymbol("US#4C51EB7");
        $ic11$ = makeUninternedSymbol("US#368B71C");
        $ic12$ = makeSymbol("CLET");
        $ic13$ = makeSymbol("ALL-FORT-INSTANCES");
        $ic14$ = ConsesLow.list((SubLObject)NIL, constant_handles_oc.f8479((SubLObject)makeString("True-JustificationTruth")));
        $ic15$ = makeSymbol("CSETQ");
        $ic16$ = makeSymbol("S#3329", "CYC");
        $ic17$ = makeSymbol("FIF");
        $ic18$ = makeSymbol("S#3413", "CYC");
        $ic19$ = makeSymbol("CDOLIST");
        $ic20$ = ConsesLow.list((SubLObject)makeSymbol("S#12455", "CYC"), (SubLObject)makeSymbol("S#11208", "CYC"));
        $ic21$ = constant_handles_oc.f8479((SubLObject)makeString("True-JustificationTruth"));
        $ic22$ = makeKeyword("GAF");
        $ic23$ = makeKeyword("ISA");
        $ic24$ = constant_handles_oc.f8479((SubLObject)makeString("isa"));
        $ic25$ = constant_handles_oc.f8479((SubLObject)makeString("assertedSentence"));
        $ic26$ = makeKeyword("OPAQUE");
        $ic27$ = makeKeyword("CODE");
        $ic28$ = ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("implies")), (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("and")), (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("isa")), (SubLObject)makeSymbol("?INSTANCE"), (SubLObject)makeSymbol("?COL")), (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("assertedSentence")), (SubLObject)ConsesLow.list((SubLObject)makeSymbol("?PRED"), (SubLObject)makeSymbol("?INSTANCE"), (SubLObject)makeSymbol("?VALUE")))), (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("assertedArg1BinaryPreds")), (SubLObject)makeSymbol("?COL"), (SubLObject)makeSymbol("?PRED")));
        $ic29$ = makeKeyword("REMOVAL-ASSERTED-ARG1-BINARY-PREDS-PRED-VAR");
        $ic30$ = ConsesLow.list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), constant_handles_oc.f8479((SubLObject)makeString("assertedArg1BinaryPreds")), makeKeyword("REQUIRED-PATTERN"), ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("assertedArg1BinaryPreds")), (SubLObject)makeKeyword("FORT"), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("NOT"), (SubLObject)makeKeyword("FORT"))), makeKeyword("COST"), makeSymbol("S#35098", "CYC"), makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("EXPAND"), makeSymbol("S#35100", "CYC"), makeKeyword("DOCUMENTATION"), makeString("(#$assertedArg1BinaryPreds <fort> <non-fort>)\n    using only the KB GAF indexing and explicit assertions"), makeKeyword("EXAMPLE"), makeString("(#$assertedArg1BinaryPreds #$Predicate ?WHAT)") });
        $ic31$ = ConsesLow.list((SubLObject)makeSymbol("S#732", "CYC"), (SubLObject)makeSymbol("S#155", "CYC"));
        $ic32$ = makeKeyword("REMOVAL-ASSERTED-ARG1-BINARY-PREDS-COLLECTION-VAR");
        $ic33$ = ConsesLow.list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), constant_handles_oc.f8479((SubLObject)makeString("assertedArg1BinaryPreds")), makeKeyword("REQUIRED-PATTERN"), ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("assertedArg1BinaryPreds")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("NOT"), (SubLObject)makeKeyword("FORT")), (SubLObject)makeKeyword("FORT")), makeKeyword("COST"), makeSymbol("S#35104", "CYC"), makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("EXPAND"), makeSymbol("S#35105", "CYC"), makeKeyword("DOCUMENTATION"), makeString("(#$assertedArg1BinaryPreds <non-fort> <fort>)\n    using only the KB GAF indexing and explicit assertions"), makeKeyword("EXAMPLE"), makeString("(#$assertedArg1BinaryPreds ?WHAT #$arity)") });
        $ic34$ = constant_handles_oc.f8479((SubLObject)makeString("assertedArg1BinaryPreds-Count"));
        $ic35$ = makeKeyword("ASSERTED-ARG1-BINARY-PREDS-COUNT-POS");
        $ic36$ = ConsesLow.list((SubLObject)makeKeyword("SENSE"), (SubLObject)makeKeyword("POS"), (SubLObject)makeKeyword("PREDICATE"), constant_handles_oc.f8479((SubLObject)makeString("assertedArg1BinaryPreds-Count")), (SubLObject)makeKeyword("REQUIRED-PATTERN"), (SubLObject)ConsesLow.list((SubLObject)makeSymbol("QUOTE"), (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("assertedArg1BinaryPreds-Count")), (SubLObject)makeKeyword("NOT-FULLY-BOUND"), (SubLObject)makeKeyword("NOT-FULLY-BOUND"), (SubLObject)makeKeyword("ANYTHING"))), (SubLObject)makeKeyword("PREFERENCE"), (SubLObject)makeSymbol("S#26435", "CYC"));
        $ic37$ = makeKeyword("VERIFIED");
        $ic38$ = makeKeyword("REMOVAL-ASSERTED-ARG1-BINARY-PREDS-COUNT-POS-CHECK");
        $ic39$ = ConsesLow.list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), constant_handles_oc.f8479((SubLObject)makeString("assertedArg1BinaryPreds-Count")), makeKeyword("REQUIRED-PATTERN"), ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("assertedArg1BinaryPreds-Count")), (SubLObject)makeKeyword("FORT"), (SubLObject)makeKeyword("FORT"), (SubLObject)makeKeyword("INTEGER")), makeKeyword("COST"), makeSymbol("S#35106", "CYC"), makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("EXPAND"), makeSymbol("S#35107", "CYC"), makeKeyword("DOCUMENTATION"), makeString("(#$assertedArg1BinaryPreds-Count <fort> <fort> <integer>)\n    using only the KB GAF indexing and explicit assertions"), makeKeyword("EXAMPLE"), makeString("(#$assertedArg1BinaryPreds-Count #$Predicate #$genlPreds 99)") });
        $ic40$ = ConsesLow.list((SubLObject)makeSymbol("S#12455", "CYC"), (SubLObject)makeSymbol("S#155", "CYC"), (SubLObject)makeSymbol("COUNT"));
        $ic41$ = makeInteger(1000);
        $ic42$ = constant_handles_oc.f8479((SubLObject)makeString("BinaryPredicate"));
        $ic43$ = constant_handles_oc.f8479((SubLObject)makeString("cardinality"));
        $ic44$ = constant_handles_oc.f8479((SubLObject)makeString("TheSetOf"));
        $ic45$ = makeSymbol("?INSTANCE");
        $ic46$ = constant_handles_oc.f8479((SubLObject)makeString("and"));
        $ic47$ = constant_handles_oc.f8479((SubLObject)makeString("assertedPredicateArg"));
        $ic48$ = ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("implies")), (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("and")), (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("isa")), (SubLObject)makeSymbol("?PRED"), constant_handles_oc.f8479((SubLObject)makeString("BinaryPredicate"))), (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("cardinality")), (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("TheSetOf")), (SubLObject)makeSymbol("?INSTANCE"), (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("and")), (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("isa")), (SubLObject)makeSymbol("?INSTANCE"), (SubLObject)makeSymbol("?COL")), (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("assertedPredicateArg")), (SubLObject)makeSymbol("?INSTANCE"), (SubLObject)ONE_INTEGER, (SubLObject)makeSymbol("?PRED")))), (SubLObject)makeSymbol("?N"))), (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("assertedArg1BinaryPreds-Count")), (SubLObject)makeSymbol("?COL"), (SubLObject)makeSymbol("?PRED"), (SubLObject)makeSymbol("?N")));
        $ic49$ = makeSymbol("S#12274", "CYC");
        $ic50$ = constant_handles_oc.f8479((SubLObject)makeString("EverythingPSC"));
        $ic51$ = makeKeyword("REMOVAL-ASSERTED-ARG1-BINARY-PREDS-COUNT-NEG-CHECK");
        $ic52$ = ConsesLow.list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("NEG"), makeKeyword("PREDICATE"), constant_handles_oc.f8479((SubLObject)makeString("assertedArg1BinaryPreds-Count")), makeKeyword("REQUIRED-PATTERN"), ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("assertedArg1BinaryPreds-Count")), (SubLObject)makeKeyword("FORT"), (SubLObject)makeKeyword("FORT"), (SubLObject)makeKeyword("INTEGER")), makeKeyword("COST"), makeSymbol("S#35113", "CYC"), makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("EXPAND"), makeSymbol("S#35114", "CYC"), makeKeyword("DOCUMENTATION"), makeString("(#$not (#$assertedArg1BinaryPreds-Count <fort> <fort> <integer>))\n     using only the KB GAF indexing and explicit assertions"), makeKeyword("EXAMPLE"), makeString("(#$not (#$assertedArg1BinaryPreds-Count #$Predicate #$arity 2))") });
        $ic53$ = ConsesLow.list((SubLObject)makeSymbol("S#12455", "CYC"), (SubLObject)makeSymbol("S#155", "CYC"), (SubLObject)makeSymbol("S#17134", "CYC"));
        $ic54$ = makeKeyword("REMOVAL-ASSERTED-ARG1-BINARY-PREDS-COUNT-COUNT-VAR");
        $ic55$ = ConsesLow.list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), constant_handles_oc.f8479((SubLObject)makeString("assertedArg1BinaryPreds-Count")), makeKeyword("REQUIRED-PATTERN"), ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("assertedArg1BinaryPreds-Count")), (SubLObject)makeKeyword("FORT"), (SubLObject)makeKeyword("FORT"), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("NOT"), (SubLObject)makeKeyword("INTEGER"))), makeKeyword("COST"), makeSymbol("S#35115", "CYC"), makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("EXPAND"), makeSymbol("S#35116", "CYC"), makeKeyword("DOCUMENTATION"), makeString("(#$assertedArg1BinaryPreds-Count <fort> <fort> <non-integer>)\n    using only the KB GAF indexing and explicit assertions"), makeKeyword("EXAMPLE"), makeString("(#$assertedArg1BinaryPreds-Count #$Predicate #$arity ?N)") });
        $ic56$ = ConsesLow.list((SubLObject)makeSymbol("S#12455", "CYC"), (SubLObject)makeSymbol("S#11208", "CYC"), (SubLObject)makeSymbol("COUNT"));
        $ic57$ = makeKeyword("REMOVAL-ASSERTED-ARG1-BINARY-PREDS-COUNT-PRED-VAR");
        $ic58$ = ConsesLow.list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), constant_handles_oc.f8479((SubLObject)makeString("assertedArg1BinaryPreds-Count")), makeKeyword("REQUIRED-PATTERN"), ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("assertedArg1BinaryPreds-Count")), (SubLObject)makeKeyword("FORT"), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("NOT"), (SubLObject)makeKeyword("FORT")), (SubLObject)makeKeyword("INTEGER")), makeKeyword("COST"), makeSymbol("S#35117", "CYC"), makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("EXPAND"), makeSymbol("S#35118", "CYC"), makeKeyword("DOCUMENTATION"), makeString("(#$assertedArg1BinaryPreds-Count <fort> <non-fort> <integer>)\n    using only the KB GAF indexing and explicit assertions"), makeKeyword("EXAMPLE"), makeString("(#$assertedArg1BinaryPreds-Count #$Predicate ?WHAT 3)") });
        $ic59$ = ConsesLow.list((SubLObject)makeSymbol("S#18767", "CYC"), (SubLObject)makeSymbol("S#155", "CYC"), (SubLObject)makeSymbol("COUNT"));
        $ic60$ = ConsesLow.list((SubLObject)makeKeyword("VERIFIED"));
        $ic61$ = makeKeyword("REMOVAL-ASSERTED-ARG1-BINARY-PREDS-COUNT-COLLECTION-VAR");
        $ic62$ = ConsesLow.list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), constant_handles_oc.f8479((SubLObject)makeString("assertedArg1BinaryPreds-Count")), makeKeyword("REQUIRED-PATTERN"), ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("assertedArg1BinaryPreds-Count")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("NOT"), (SubLObject)makeKeyword("FORT")), (SubLObject)makeKeyword("FORT"), (SubLObject)makeKeyword("INTEGER")), makeKeyword("COST"), makeSymbol("S#35119", "CYC"), makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("EXPAND"), makeSymbol("S#35120", "CYC"), makeKeyword("DOCUMENTATION"), makeString("(#$assertedArg1BinaryPreds-Count <non-fort> <fort> <integer>)\n    using only the KB GAF indexing and explicit assertions"), makeKeyword("EXAMPLE"), makeString("(#$assertedArg1BinaryPreds-Count ?WHAT #$arity 2)") });
        $ic63$ = ConsesLow.list((SubLObject)makeSymbol("S#12455", "CYC"), (SubLObject)makeSymbol("S#11208", "CYC"), (SubLObject)makeSymbol("S#17134", "CYC"));
        $ic64$ = makeKeyword("BREADTH");
        $ic65$ = makeKeyword("QUEUE");
        $ic66$ = makeKeyword("STACK");
        $ic67$ = makeSymbol("S#11450", "CYC");
        $ic68$ = makeKeyword("ERROR");
        $ic69$ = makeString("~A is not a ~A");
        $ic70$ = makeSymbol("S#11592", "CYC");
        $ic71$ = makeKeyword("CERROR");
        $ic72$ = makeString("continue anyway");
        $ic73$ = makeKeyword("WARN");
        $ic74$ = makeString("~A is not a valid *sbhl-type-error-action* value");
        $ic75$ = makeString("~A is neither SET-P nor LISTP.");
        $ic76$ = makeString("attempting to bind direction link variable, to NIL. macro body not executed.");
        $ic77$ = ConsesLow.list((SubLObject)makeUninternedSymbol("US#4D5E436"), (SubLObject)makeUninternedSymbol("US#1526883"), (SubLObject)makeUninternedSymbol("US#15AA083"));
        $ic78$ = makeString("Node ~a does not pass sbhl-type-test ~a~%");
        $ic79$ = makeKeyword("REMOVAL-ASSERTED-ARG1-BINARY-PREDS-COUNT-PRED-AND-COUNT-VAR");
        $ic80$ = ConsesLow.list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), constant_handles_oc.f8479((SubLObject)makeString("assertedArg1BinaryPreds-Count")), makeKeyword("REQUIRED-PATTERN"), ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("assertedArg1BinaryPreds-Count")), (SubLObject)makeKeyword("FORT"), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("NOT"), (SubLObject)makeKeyword("FORT")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("NOT"), (SubLObject)makeKeyword("INTEGER"))), makeKeyword("COST"), makeSymbol("S#35121", "CYC"), makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("EXPAND"), makeSymbol("S#35122", "CYC"), makeKeyword("DOCUMENTATION"), makeString("(#$assertedArg1BinaryPreds-Count <fort> <non-fort> <non-integer>)\n    using only the KB GAF indexing and explicit assertions"), makeKeyword("EXAMPLE"), makeString("(#$assertedArg1BinaryPreds-Count ?WHAT #$arity 2)") });
        $ic81$ = constant_handles_oc.f8479((SubLObject)makeString("assertedArg1BinaryPreds-CountMin"));
        $ic82$ = makeKeyword("ASSERTED-ARG1-BINARY-PREDS-COUNT-MIN-ARG1-OR-ARG2-POS");
        $ic83$ = ConsesLow.list((SubLObject)makeKeyword("SENSE"), (SubLObject)makeKeyword("POS"), (SubLObject)makeKeyword("PREDICATE"), constant_handles_oc.f8479((SubLObject)makeString("assertedArg1BinaryPreds-CountMin")), (SubLObject)makeKeyword("REQUIRED-PATTERN"), (SubLObject)ConsesLow.list((SubLObject)makeSymbol("QUOTE"), (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("assertedArg1BinaryPreds-CountMin")), (SubLObject)makeKeyword("NOT-FULLY-BOUND"), (SubLObject)makeKeyword("NOT-FULLY-BOUND"), (SubLObject)makeKeyword("ANYTHING"))), (SubLObject)makeKeyword("PREFERENCE"), (SubLObject)makeSymbol("S#26435", "CYC"));
        $ic84$ = makeKeyword("OVER");
        $ic85$ = makeKeyword("REMOVAL-ASSERTED-ARG1-BINARY-PREDS-COUNT-MIN-POS-CHECK");
        $ic86$ = ConsesLow.list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), constant_handles_oc.f8479((SubLObject)makeString("assertedArg1BinaryPreds-CountMin")), makeKeyword("REQUIRED-PATTERN"), ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("assertedArg1BinaryPreds-CountMin")), (SubLObject)makeKeyword("FORT"), (SubLObject)makeKeyword("FORT"), (SubLObject)makeKeyword("INTEGER")), makeKeyword("COST"), makeSymbol("S#35123", "CYC"), makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("EXPAND"), makeSymbol("S#35124", "CYC"), makeKeyword("DOCUMENTATION"), makeString("(#$assertedArg1BinaryPreds-CountMin <fort> <fort> <integer>)\n    using only the KB GAF indexing and explicit assertions"), makeKeyword("EXAMPLE"), makeString("(#$assertedArg1BinaryPreds-CountMin #$Predicate #$genlPreds 99)") });
        $ic87$ = makeKeyword("ASSERTED-ARG1-BINARY-PREDS");
        $ic88$ = makeSymbol("?N");
        $ic89$ = makeSymbol("?COL");
        $ic90$ = makeSymbol("?PRED");
        $ic91$ = constant_handles_oc.f8479((SubLObject)makeString("implies"));
        $ic92$ = ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("isa")), (SubLObject)makeSymbol("?PRED"), constant_handles_oc.f8479((SubLObject)makeString("BinaryPredicate")));
        $ic93$ = makeKeyword("REMOVAL-ASSERTED-ARG1-BINARY-PREDS-COUNT-MIN-NEG-CHECK");
        $ic94$ = ConsesLow.list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("NEG"), makeKeyword("PREDICATE"), constant_handles_oc.f8479((SubLObject)makeString("assertedArg1BinaryPreds-CountMin")), makeKeyword("REQUIRED-PATTERN"), ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("assertedArg1BinaryPreds-CountMin")), (SubLObject)makeKeyword("FORT"), (SubLObject)makeKeyword("FORT"), (SubLObject)makeKeyword("INTEGER")), makeKeyword("COST"), makeSymbol("S#35127", "CYC"), makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("EXPAND"), makeSymbol("S#35128", "CYC"), makeKeyword("DOCUMENTATION"), makeString("(#$not (#$assertedArg1BinaryPreds-CountMin <fort> <fort> <integer>))\n     using only the KB GAF indexing and explicit assertions"), makeKeyword("EXAMPLE"), makeString("(#$not (#$assertedArg1BinaryPreds-CountMin #$Predicate #$arity 2))") });
        $ic95$ = ConsesLow.list((SubLObject)makeSymbol("S#12455", "CYC"), (SubLObject)makeSymbol("S#11208", "CYC"), (SubLObject)makeSymbol("S#35157", "CYC"));
        $ic96$ = (SubLList)ConsesLow.cons((SubLObject)makeSymbol("S#155", "CYC"), (SubLObject)makeSymbol("S#35158", "CYC"));
        $ic97$ = ConsesLow.list((SubLObject)makeKeyword("VERIFIED"), (SubLObject)makeKeyword("OVER"));
        $ic98$ = makeSymbol(">");
        $ic99$ = makeSymbol("CDR");
        $ic100$ = makeKeyword("REMOVAL-ASSERTED-ARG1-BINARY-PREDS-COUNT-MIN-PRED-VAR");
        $ic101$ = ConsesLow.list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), constant_handles_oc.f8479((SubLObject)makeString("assertedArg1BinaryPreds-CountMin")), makeKeyword("REQUIRED-PATTERN"), ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("assertedArg1BinaryPreds-CountMin")), (SubLObject)makeKeyword("FORT"), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("NOT"), (SubLObject)makeKeyword("FORT")), (SubLObject)makeKeyword("INTEGER")), makeKeyword("COST"), makeSymbol("S#35129", "CYC"), makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("EXPAND"), makeSymbol("S#35130", "CYC"), makeKeyword("DOCUMENTATION"), makeString("(#$assertedArg1BinaryPreds-CountMin <fort> <non-fort> <integer>)\n    using only the KB GAF indexing and explicit assertions"), makeKeyword("EXAMPLE"), makeString("(#$assertedArg1BinaryPreds-CountMin #$Predicate ?WHAT 3)") });
        $ic102$ = makeKeyword("REMOVAL-ASSERTED-ARG1-BINARY-PREDS-COUNT-MIN-COLLECTION-VAR");
        $ic103$ = ConsesLow.list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), constant_handles_oc.f8479((SubLObject)makeString("assertedArg1BinaryPreds-CountMin")), makeKeyword("REQUIRED-PATTERN"), ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("assertedArg1BinaryPreds-CountMin")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("NOT"), (SubLObject)makeKeyword("FORT")), (SubLObject)makeKeyword("FORT"), (SubLObject)makeKeyword("INTEGER")), makeKeyword("COST"), makeSymbol("S#35131", "CYC"), makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("EXPAND"), makeSymbol("S#35132", "CYC"), makeKeyword("DOCUMENTATION"), makeString("(#$assertedArg1BinaryPreds-CountMin <non-fort> <fort> <integer>)\n    using only the KB GAF indexing and explicit assertions"), makeKeyword("EXAMPLE"), makeString("(#$assertedArg1BinaryPreds-CountMin ?WHAT #$arity 2)") });
        $ic104$ = constant_handles_oc.f8479((SubLObject)makeString("assertedArg1BinaryPreds-PercentMin"));
        $ic105$ = makeKeyword("ASSERTED-ARG1-BINARY-PREDS-PERCENT-MIN-ARG1-OR-ARG2-POS");
        $ic106$ = ConsesLow.list((SubLObject)makeKeyword("SENSE"), (SubLObject)makeKeyword("POS"), (SubLObject)makeKeyword("PREDICATE"), constant_handles_oc.f8479((SubLObject)makeString("assertedArg1BinaryPreds-PercentMin")), (SubLObject)makeKeyword("REQUIRED-PATTERN"), (SubLObject)ConsesLow.list((SubLObject)makeSymbol("QUOTE"), (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("assertedArg1BinaryPreds-PercentMin")), (SubLObject)makeKeyword("NOT-FULLY-BOUND"), (SubLObject)makeKeyword("NOT-FULLY-BOUND"), (SubLObject)makeKeyword("ANYTHING"))), (SubLObject)makeKeyword("PREFERENCE"), (SubLObject)makeSymbol("S#26435", "CYC"));
        $ic107$ = ConsesLow.list((SubLObject)makeSymbol("S#12455", "CYC"), (SubLObject)makeSymbol("S#155", "CYC"), (SubLObject)makeSymbol("S#4706", "CYC"));
        $ic108$ = makeKeyword("REMOVAL-ASSERTED-ARG1-BINARY-PREDS-PERCENT-MIN-POS-CHECK");
        $ic109$ = ConsesLow.list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), constant_handles_oc.f8479((SubLObject)makeString("assertedArg1BinaryPreds-PercentMin")), makeKeyword("REQUIRED-PATTERN"), ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("assertedArg1BinaryPreds-PercentMin")), (SubLObject)makeKeyword("FORT"), (SubLObject)makeKeyword("FORT"), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("TEST"), (SubLObject)makeSymbol("NUMBERP"))), makeKeyword("COST"), makeSymbol("S#35133", "CYC"), makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("EXPAND"), makeSymbol("S#35134", "CYC"), makeKeyword("DOCUMENTATION"), makeString("(#$assertedArg1BinaryPreds-PercentMin <fort> <fort> <float>)\n    using only the KB GAF indexing and explicit assertions"), makeKeyword("EXAMPLE"), makeString("(#$assertedArg1BinaryPreds-PercentMin #$Predicate #$genlPreds .25)") });
        $ic110$ = constant_handles_oc.f8479((SubLObject)makeString("evaluate"));
        $ic111$ = constant_handles_oc.f8479((SubLObject)makeString("CardinalityOfFn"));
        $ic112$ = makeKeyword("EVAL");
        $ic113$ = constant_handles_oc.f8479((SubLObject)makeString("TimesFn"));
        $ic114$ = makeSymbol("?TIMESFN");
        $ic115$ = ConsesLow.list((SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("TimesFn")), (SubLObject)makeSymbol("?P"), (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("CardinalityOfFn")), (SubLObject)makeSymbol("?COL"))));
        $ic116$ = ConsesLow.list((SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("assertedArg1BinaryPreds-PercentMin")), (SubLObject)makeSymbol("?COL"), (SubLObject)makeSymbol("?PRED"), (SubLObject)makeSymbol("?P")));
        $ic117$ = constant_handles_oc.f8479((SubLObject)makeString("cardinalityAtLeast"));
        $ic118$ = makeKeyword("FORT");
        $ic119$ = makeKeyword("INTEGER");
        $ic120$ = ConsesLow.list((SubLObject)ONE_INTEGER, (SubLObject)TWO_INTEGER, (SubLObject)ONE_INTEGER, (SubLObject)TWO_INTEGER);
        $ic121$ = ConsesLow.list((SubLObject)ONE_INTEGER, (SubLObject)TWO_INTEGER, (SubLObject)TWO_INTEGER, (SubLObject)THREE_INTEGER);
        $ic122$ = ConsesLow.list((SubLObject)TWO_INTEGER);
        $ic123$ = makeSymbol("?VALUE");
        $ic124$ = makeKeyword("REMOVAL-ASSERTED-ARG1-BINARY-PREDS-PERCENT-MIN-NEG-CHECK");
        $ic125$ = ConsesLow.list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("NEG"), makeKeyword("PREDICATE"), constant_handles_oc.f8479((SubLObject)makeString("assertedArg1BinaryPreds-PercentMin")), makeKeyword("REQUIRED-PATTERN"), ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("assertedArg1BinaryPreds-PercentMin")), (SubLObject)makeKeyword("FORT"), (SubLObject)makeKeyword("FORT"), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("TEST"), (SubLObject)makeSymbol("NUMBERP"))), makeKeyword("COST"), makeSymbol("S#35142", "CYC"), makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("EXPAND"), makeSymbol("S#35143", "CYC"), makeKeyword("DOCUMENTATION"), makeString("(#$not (#$assertedArg1BinaryPreds-PercentMin <fort> <fort> <float>))\n     using only the KB GAF indexing and explicit assertions"), makeKeyword("EXAMPLE"), makeString("(#$not (#$assertedArg1BinaryPreds-PercentMin #$Predicate #$arity .25))") });
        $ic126$ = ConsesLow.list((SubLObject)makeSymbol("S#12455", "CYC"), (SubLObject)makeSymbol("S#11208", "CYC"), (SubLObject)makeSymbol("S#4706", "CYC"));
        $ic127$ = makeInteger(100);
        $ic128$ = makeKeyword("REMOVAL-ASSERTED-ARG1-BINARY-PREDS-PERCENT-MIN-PRED-VAR");
        $ic129$ = ConsesLow.list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), constant_handles_oc.f8479((SubLObject)makeString("assertedArg1BinaryPreds-PercentMin")), makeKeyword("REQUIRED-PATTERN"), ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("assertedArg1BinaryPreds-PercentMin")), (SubLObject)makeKeyword("FORT"), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("NOT"), (SubLObject)makeKeyword("FORT")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("TEST"), (SubLObject)makeSymbol("NUMBERP"))), makeKeyword("COST"), makeSymbol("S#35144", "CYC"), makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("EXPAND"), makeSymbol("S#35146", "CYC"), makeKeyword("DOCUMENTATION"), makeString("(#$assertedArg1BinaryPreds-PercentMin <fort> <non-fort> <float>)\n    using only the KB GAF indexing and explicit assertions"), makeKeyword("EXAMPLE"), makeString("(#$assertedArg1BinaryPreds-PercentMin #$Predicate ?WHAT .3)") });
        $ic130$ = ConsesLow.list((SubLObject)makeSymbol("S#18767", "CYC"), (SubLObject)makeSymbol("S#155", "CYC"), (SubLObject)makeSymbol("S#4706", "CYC"));
        $ic131$ = ConsesLow.list((SubLObject)makeSymbol("S#732", "CYC"), (SubLObject)makeSymbol("S#155", "CYC"), (SubLObject)makeSymbol("S#4706", "CYC"));
        $ic132$ = makeSymbol("SPEC?");
        $ic133$ = makeKeyword("REMOVAL-ASSERTED-ARG1-BINARY-PREDS-PERCENT-MIN-COLLECTION-VAR");
        $ic134$ = ConsesLow.list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), constant_handles_oc.f8479((SubLObject)makeString("assertedArg1BinaryPreds-PercentMin")), makeKeyword("REQUIRED-PATTERN"), ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("assertedArg1BinaryPreds-PercentMin")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("NOT"), (SubLObject)makeKeyword("FORT")), (SubLObject)makeKeyword("FORT"), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("TEST"), (SubLObject)makeSymbol("NUMBERP"))), makeKeyword("COST"), makeSymbol("S#35147", "CYC"), makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("EXPAND"), makeSymbol("S#35148", "CYC"), makeKeyword("DOCUMENTATION"), makeString("(#$assertedArg1BinaryPreds-PercentMin <non-fort> <fort> <number>)\n    using only the KB GAF indexing and explicit assertions"), makeKeyword("EXAMPLE"), makeString("(#$assertedArg1BinaryPreds-PercentMin ?WHAT #$arity .25)") });
        $ic135$ = ConsesLow.list((SubLObject)makeSymbol("S#12455", "CYC"), (SubLObject)makeSymbol("S#155", "CYC"));
        $ic136$ = ConsesLow.list((SubLObject)makeSymbol("S#732", "CYC"), (SubLObject)makeSymbol("S#155", "CYC"), (SubLObject)makeSymbol("COUNT"));
    }
}

/*
	DECOMPILATION REPORT

	Decompiled from: G:\opt\CYC_JRTL_with_CommonLisp\platform\lib\cyc-oc4.0-unzipped/com/cyc/cycjava/cycl/class
	Total time: 4544 ms
	
	Decompiled with Procyon 0.5.32.
*/