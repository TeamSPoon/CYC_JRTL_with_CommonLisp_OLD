package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sort;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Mapping;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Strings;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.StreamsLow;
import java.util.Map;
import java.util.Iterator;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Time;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Vectors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class module0563 extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.module0563";
    public static final String myFingerPrint = "dfd01f91dd1f5089da49b712e9ca29a27f4ea7fb5321af39a2db52a9de4b0475";
    private static SubLSymbol $g4101$;
    private static SubLSymbol $g4102$;
    private static SubLSymbol $g4103$;
    private static SubLSymbol $g4104$;
    private static SubLSymbol $g4105$;
    private static SubLSymbol $g4106$;
    private static SubLSymbol $g4107$;
    private static SubLSymbol $g4108$;
    private static SubLSymbol $g4109$;
    private static SubLSymbol $g4110$;
    private static SubLSymbol $g4111$;
    private static SubLSymbol $g4112$;
    private static SubLSymbol $g4113$;
    private static SubLSymbol $g4114$;
    private static SubLSymbol $g4115$;
    private static SubLSymbol $g4116$;
    private static SubLSymbol $g4117$;
    public static SubLSymbol $g4118$;
    public static SubLSymbol $g4119$;
    private static final SubLSymbol $ic0$;
    private static final SubLObject $ic1$;
    private static final SubLObject $ic2$;
    private static final SubLString $ic3$;
    private static final SubLObject $ic4$;
    private static final SubLString $ic5$;
    private static final SubLObject $ic6$;
    private static final SubLSymbol $ic7$;
    private static final SubLSymbol $ic8$;
    private static final SubLObject $ic9$;
    private static final SubLInteger $ic10$;
    private static final SubLSymbol $ic11$;
    private static final SubLSymbol $ic12$;
    private static final SubLSymbol $ic13$;
    private static final SubLSymbol $ic14$;
    private static final SubLSymbol $ic15$;
    private static final SubLString $ic16$;
    private static final SubLSymbol $ic17$;
    private static final SubLSymbol $ic18$;
    private static final SubLString $ic19$;
    private static final SubLSymbol $ic20$;
    private static final SubLString $ic21$;
    private static final SubLString $ic22$;
    private static final SubLString $ic23$;
    private static final SubLList $ic24$;
    private static final SubLString $ic25$;
    private static final SubLSymbol $ic26$;
    private static final SubLString $ic27$;
    private static final SubLSymbol $ic28$;
    private static final SubLSymbol $ic29$;
    private static final SubLObject $ic30$;
    private static final SubLSymbol $ic31$;
    private static final SubLString $ic32$;
    private static final SubLObject $ic33$;
    private static final SubLObject $ic34$;
    private static final SubLString $ic35$;
    private static final SubLString $ic36$;
    private static final SubLString $ic37$;
    private static final SubLString $ic38$;
    private static final SubLString $ic39$;
    private static final SubLString $ic40$;
    private static final SubLString $ic41$;
    private static final SubLString $ic42$;
    private static final SubLString $ic43$;
    private static final SubLString $ic44$;
    private static final SubLString $ic45$;
    private static final SubLSymbol $ic46$;
    private static final SubLObject $ic47$;
    private static final SubLSymbol $ic48$;
    private static final SubLObject $ic49$;
    private static final SubLSymbol $ic50$;
    private static final SubLObject $ic51$;
    private static final SubLList $ic52$;
    private static final SubLInteger $ic53$;
    private static final SubLSymbol $ic54$;
    private static final SubLSymbol $ic55$;
    private static final SubLString $ic56$;
    private static final SubLString $ic57$;
    private static final SubLString $ic58$;
    private static final SubLObject $ic59$;
    private static final SubLString $ic60$;
    private static final SubLString $ic61$;
    private static final SubLSymbol $ic62$;
    private static final SubLString $ic63$;
    private static final SubLObject $ic64$;
    private static final SubLObject $ic65$;
    private static final SubLString $ic66$;
    private static final SubLObject $ic67$;
    private static final SubLObject $ic68$;
    private static final SubLObject $ic69$;
    private static final SubLObject $ic70$;
    private static final SubLObject $ic71$;
    private static final SubLObject $ic72$;
    private static final SubLString $ic73$;
    private static final SubLSymbol $ic74$;
    private static final SubLString $ic75$;
    private static final SubLString $ic76$;
    private static final SubLString $ic77$;
    private static final SubLString $ic78$;
    private static final SubLSymbol $ic79$;
    private static final SubLSymbol $ic80$;
    private static final SubLString $ic81$;
    private static final SubLSymbol $ic82$;
    private static final SubLSymbol $ic83$;
    private static final SubLSymbol $ic84$;
    private static final SubLSymbol $ic85$;
    private static final SubLSymbol $ic86$;
    private static final SubLSymbol $ic87$;
    private static final SubLString $ic88$;
    private static final SubLString $ic89$;
    private static final SubLString $ic90$;
    private static final SubLString $ic91$;
    private static final SubLString $ic92$;
    private static final SubLString $ic93$;
    private static final SubLString $ic94$;
    private static final SubLString $ic95$;
    private static final SubLString $ic96$;
    private static final SubLSymbol $ic97$;
    private static final SubLString $ic98$;
    private static final SubLSymbol $ic99$;
    private static final SubLList $ic100$;
    private static final SubLString $ic101$;
    private static final SubLString $ic102$;
    private static final SubLString $ic103$;
    private static final SubLString $ic104$;
    private static final SubLString $ic105$;
    private static final SubLString $ic106$;
    private static final SubLString $ic107$;
    private static final SubLString $ic108$;
    private static final SubLString $ic109$;
    private static final SubLString $ic110$;
    private static final SubLString $ic111$;
    private static final SubLString $ic112$;
    private static final SubLString $ic113$;
    private static final SubLString $ic114$;
    private static final SubLString $ic115$;
    private static final SubLString $ic116$;
    private static final SubLString $ic117$;
    private static final SubLString $ic118$;
    private static final SubLString $ic119$;
    private static final SubLString $ic120$;
    private static final SubLString $ic121$;
    private static final SubLString $ic122$;
    private static final SubLString $ic123$;
    private static final SubLString $ic124$;
    private static final SubLString $ic125$;
    private static final SubLString $ic126$;
    private static final SubLString $ic127$;
    private static final SubLString $ic128$;
    private static final SubLString $ic129$;
    private static final SubLString $ic130$;
    private static final SubLString $ic131$;
    private static final SubLString $ic132$;
    private static final SubLSymbol $ic133$;
    private static final SubLString $ic134$;
    private static final SubLSymbol $ic135$;
    private static final SubLSymbol $ic136$;
    private static final SubLString $ic137$;
    
    public static SubLObject f34702() {
        final SubLThread var1 = SubLProcess.currentSubLThread();
        return $g4101$.getDynamicValue(var1);
    }
    
    public static SubLObject f34703(final SubLObject var2) {
        final SubLThread var3 = SubLProcess.currentSubLThread();
        return (SubLObject)makeBoolean(NIL != constant_handles_oc.f8449(var2) && NIL != Hashtables.gethash(var2, $g4102$.getDynamicValue(var3), (SubLObject)UNPROVIDED));
    }
    
    public static SubLObject f34704(final SubLObject var2) {
        final SubLThread var3 = SubLProcess.currentSubLThread();
        SubLObject var4 = (SubLObject)NIL;
        if (NIL != f34703(var2)) {
            SubLObject var6;
            final SubLObject var5 = var6 = Hashtables.gethash(var2, $g4102$.getDynamicValue(var3), (SubLObject)UNPROVIDED);
            SubLObject var7 = (SubLObject)NIL;
            var7 = var6.first();
            while (NIL != var6) {
                var4 = (SubLObject)ConsesLow.cons(module0191.f11990((SubLObject)$ic0$, module0202.f12768($ic1$, var2, var7), $ic2$, (SubLObject)UNPROVIDED), var4);
                var6 = var6.rest();
                var7 = var6.first();
            }
        }
        return Sequences.nreverse(var4);
    }
    
    public static SubLObject f34705(final SubLObject var2) {
        return (SubLObject)makeBoolean(NIL != constant_handles_oc.f8449(var2) && NIL == f34703(var2));
    }
    
    public static SubLObject f34706(final SubLObject var2) {
        final SubLThread var3 = SubLProcess.currentSubLThread();
        SubLObject var4 = (SubLObject)NIL;
        if (NIL != f34705(var2)) {
            SubLObject var6;
            final SubLObject var5 = var6 = Hashtables.gethash(var2, $g4103$.getDynamicValue(var3), (SubLObject)UNPROVIDED);
            SubLObject var7 = (SubLObject)NIL;
            var7 = var6.first();
            while (NIL != var6) {
                final SubLObject var8 = var7.first();
                final SubLObject var9 = conses_high.second(var7);
                var4 = (SubLObject)ConsesLow.cons((SubLObject)$ic3$, var4);
                SubLObject var5_11 = var8;
                SubLObject var10 = (SubLObject)NIL;
                var10 = var5_11.first();
                while (NIL != var5_11) {
                    var4 = (SubLObject)ConsesLow.cons(module0191.f11990((SubLObject)$ic0$, module0202.f12768($ic4$, var2, var10), $ic2$, (SubLObject)UNPROVIDED), var4);
                    var5_11 = var5_11.rest();
                    var10 = var5_11.first();
                }
                var4 = (SubLObject)ConsesLow.cons((SubLObject)$ic5$, var4);
                SubLObject var5_12 = var9;
                SubLObject var11 = (SubLObject)NIL;
                var11 = var5_12.first();
                while (NIL != var5_12) {
                    var4 = (SubLObject)ConsesLow.cons(module0191.f11990((SubLObject)$ic0$, module0202.f12768($ic4$, var2, var11), $ic2$, (SubLObject)UNPROVIDED), var4);
                    var5_12 = var5_12.rest();
                    var11 = var5_12.first();
                }
                var6 = var6.rest();
                var7 = var6.first();
            }
        }
        if (NIL == var4) {
            SubLObject var12 = module0562.f34635();
            SubLObject var13 = (SubLObject)NIL;
            var13 = var12.first();
            while (NIL != var12) {
                SubLObject var5_13 = module0562.f34641(var13);
                SubLObject var14 = (SubLObject)NIL;
                var14 = var5_13.first();
                while (NIL != var5_13) {
                    var4 = (SubLObject)ConsesLow.cons(module0191.f11990((SubLObject)$ic0$, module0202.f12643($ic6$, module0202.f12768($ic4$, var2, var14)), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED), var4);
                    var5_13 = var5_13.rest();
                    var14 = var5_13.first();
                }
                var12 = var12.rest();
                var13 = var12.first();
            }
        }
        return Sequences.nreverse(var4);
    }
    
    public static SubLObject f34707(final SubLObject var16) {
        final SubLThread var17 = SubLProcess.currentSubLThread();
        if (NIL != $g4103$.getDynamicValue(var17)) {
            return Hashtables.gethash(var16, $g4103$.getDynamicValue(var17), (SubLObject)UNPROVIDED);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f34708(final SubLObject var17) {
        return (SubLObject)makeBoolean(NIL == f34709(var17));
    }
    
    public static SubLObject f34709(final SubLObject var17) {
        return module0035.f2439(Symbols.symbol_function((SubLObject)$ic7$), var17, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f34710() {
        final SubLThread var1 = SubLProcess.currentSubLThread();
        final SubLObject var2 = module0147.$g2094$.currentBinding(var1);
        final SubLObject var3 = module0147.$g2095$.currentBinding(var1);
        try {
            module0147.$g2094$.bind((SubLObject)$ic8$, var1);
            module0147.$g2095$.bind($ic9$, var1);
            SubLObject var4 = (SubLObject)ZERO_INTEGER;
            SubLObject var5 = (SubLObject)ZERO_INTEGER;
            SubLObject var6 = module0562.f34635();
            SubLObject var7 = (SubLObject)NIL;
            var7 = var6.first();
            while (NIL != var6) {
                final SubLObject var8 = module0562.f34641(var7);
                final SubLObject var9 = module0562.f34644(var7);
                final SubLObject var10 = module0562.f34643(var7);
                SubLObject var5_25 = var8;
                SubLObject var11 = (SubLObject)NIL;
                var11 = var5_25.first();
                while (NIL != var5_25) {
                    var4 = Numbers.add(var4, module0549.f33895(var11));
                    var4 = Numbers.add(var4, module0549.f33897(var11));
                    var5_25 = var5_25.rest();
                    var11 = var5_25.first();
                }
                if (NIL != module0269.f17706(var9)) {
                    var5 = Numbers.add(var5, module0217.f14247(var9, (SubLObject)UNPROVIDED));
                }
                SubLObject var5_26 = var10;
                SubLObject var12 = (SubLObject)NIL;
                var12 = var5_26.first();
                while (NIL != var5_26) {
                    var5 = Numbers.add(var5, module0549.f33895(var12));
                    var5 = Numbers.add(var5, module0549.f33897(var12));
                    var5_26 = var5_26.rest();
                    var12 = var5_26.first();
                }
                var6 = var6.rest();
                var7 = var6.first();
            }
            $g4102$.setDynamicValue(Hashtables.make_hash_table(var4, Symbols.symbol_function((SubLObject)EQ), (SubLObject)UNPROVIDED), var1);
            $g4104$.setDynamicValue(Hashtables.make_hash_table(var4, Symbols.symbol_function((SubLObject)EQ), (SubLObject)UNPROVIDED), var1);
            $g4103$.setDynamicValue(Hashtables.make_hash_table(var5, Symbols.symbol_function((SubLObject)EQ), (SubLObject)UNPROVIDED), var1);
            $g4101$.setDynamicValue((SubLObject)NIL, var1);
        }
        finally {
            module0147.$g2095$.rebind(var3, var1);
            module0147.$g2094$.rebind(var2, var1);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f34711() {
        final SubLThread var1 = SubLProcess.currentSubLThread();
        f34710();
        final SubLObject var2 = module0147.$g2094$.currentBinding(var1);
        final SubLObject var3 = module0147.$g2095$.currentBinding(var1);
        try {
            module0147.$g2094$.bind((SubLObject)$ic8$, var1);
            module0147.$g2095$.bind($ic9$, var1);
            SubLObject var4 = module0562.f34635();
            SubLObject var5 = (SubLObject)NIL;
            var5 = var4.first();
            while (NIL != var4) {
                final SubLObject var6 = module0562.f34641(var5);
                final SubLObject var7 = module0562.f34642(var5);
                final SubLObject var8 = module0562.f34643(var5);
                final SubLObject var9 = module0562.f34644(var5);
                final SubLObject var10 = module0562.f34645(var5);
                final SubLObject var11 = module0562.f34647(var5);
                final SubLObject var12 = module0562.f34650(var5);
                final SubLObject var13 = module0562.f34648(var5);
                final SubLObject var14 = Hashtables.make_hash_table((SubLObject)$ic10$, Symbols.symbol_function((SubLObject)EQ), (SubLObject)UNPROVIDED);
                final SubLObject var15 = Hashtables.make_hash_table((SubLObject)$ic10$, Symbols.symbol_function((SubLObject)EQ), (SubLObject)UNPROVIDED);
                SubLObject var16 = (SubLObject)ZERO_INTEGER;
                SubLObject var17 = (SubLObject)ZERO_INTEGER;
                if (NIL != module0035.f2013(var6)) {
                    SubLObject var5_39 = var6;
                    SubLObject var18 = (SubLObject)NIL;
                    var18 = var5_39.first();
                    while (NIL != var5_39) {
                        final SubLObject var19 = var18;
                        final SubLObject var18_42 = module0137.$g1605$.currentBinding(var1);
                        final SubLObject var19_43 = module0139.$g1636$.currentBinding(var1);
                        try {
                            module0137.$g1605$.bind(module0137.f8955($ic4$), var1);
                            module0139.$g1636$.bind(module0139.f9007(), var1);
                            SubLObject var44_45 = var19;
                            final SubLObject var20 = (SubLObject)$ic13$;
                            final SubLObject var21 = module0056.f4145(var20);
                            final SubLObject var18_43 = module0139.$g1635$.currentBinding(var1);
                            try {
                                module0139.$g1635$.bind(module0139.f9007(), var1);
                                final SubLObject var22 = (SubLObject)NIL;
                                final SubLObject var18_44 = module0141.$g1714$.currentBinding(var1);
                                final SubLObject var19_44 = module0141.$g1715$.currentBinding(var1);
                                try {
                                    module0141.$g1714$.bind((NIL != var22) ? var22 : module0141.f9283(), var1);
                                    module0141.$g1715$.bind((SubLObject)((NIL != var22) ? $ic14$ : module0141.$g1715$.getDynamicValue(var1)), var1);
                                    if (NIL != var22 && NIL != module0136.f8864() && NIL == module0141.f9279(var22)) {
                                        final SubLObject var23 = module0136.$g1591$.getDynamicValue(var1);
                                        if (var23.eql((SubLObject)$ic15$)) {
                                            module0136.f8870((SubLObject)ONE_INTEGER, (SubLObject)$ic16$, var22, (SubLObject)$ic17$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                                        }
                                        else if (var23.eql((SubLObject)$ic18$)) {
                                            module0136.f8871((SubLObject)ONE_INTEGER, (SubLObject)$ic19$, (SubLObject)$ic16$, var22, (SubLObject)$ic17$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                                        }
                                        else if (var23.eql((SubLObject)$ic20$)) {
                                            Errors.warn((SubLObject)$ic16$, var22, (SubLObject)$ic17$);
                                        }
                                        else {
                                            Errors.warn((SubLObject)$ic21$, module0136.$g1591$.getDynamicValue(var1));
                                            Errors.cerror((SubLObject)$ic19$, (SubLObject)$ic16$, var22, (SubLObject)$ic17$);
                                        }
                                    }
                                    final SubLObject var18_45 = module0141.$g1670$.currentBinding(var1);
                                    final SubLObject var19_45 = module0141.$g1671$.currentBinding(var1);
                                    final SubLObject var24 = module0141.$g1672$.currentBinding(var1);
                                    final SubLObject var25 = module0141.$g1674$.currentBinding(var1);
                                    final SubLObject var26 = module0137.$g1605$.currentBinding(var1);
                                    try {
                                        module0141.$g1670$.bind(module0244.f15771(module0137.f8955($ic4$)), var1);
                                        module0141.$g1671$.bind(module0244.f15739(module0244.f15771(module0137.f8955($ic4$))), var1);
                                        module0141.$g1672$.bind(module0244.f15746(module0244.f15771(module0137.f8955($ic4$))), var1);
                                        module0141.$g1674$.bind((SubLObject)NIL, var1);
                                        module0137.$g1605$.bind(module0244.f15771(module0137.f8955($ic4$)), var1);
                                        if (NIL != module0136.f8865() || NIL != module0244.f15795(var19, module0137.f8955((SubLObject)UNPROVIDED))) {
                                            final SubLObject var18_46 = module0141.$g1677$.currentBinding(var1);
                                            final SubLObject var19_46 = module0138.$g1619$.currentBinding(var1);
                                            final SubLObject var55_60 = module0141.$g1674$.currentBinding(var1);
                                            try {
                                                module0141.$g1677$.bind(module0141.f9210(), var1);
                                                module0138.$g1619$.bind(module0244.f15782(module0141.f9210(), module0244.f15771(module0137.f8955($ic4$))), var1);
                                                module0141.$g1674$.bind((SubLObject)NIL, var1);
                                                module0249.f16055(var44_45, (SubLObject)UNPROVIDED);
                                                while (NIL != var44_45) {
                                                    final SubLObject var27 = var44_45;
                                                    SubLObject var5_40;
                                                    final SubLObject var28 = var5_40 = module0200.f12443(module0137.f8955($ic4$));
                                                    SubLObject var29 = (SubLObject)NIL;
                                                    var29 = var5_40.first();
                                                    while (NIL != var5_40) {
                                                        final SubLObject var18_47 = module0137.$g1605$.currentBinding(var1);
                                                        final SubLObject var19_47 = module0141.$g1674$.currentBinding(var1);
                                                        try {
                                                            module0137.$g1605$.bind(var29, var1);
                                                            module0141.$g1674$.bind((SubLObject)((NIL != module0141.f9205((SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)) ? makeBoolean(NIL == module0141.$g1674$.getDynamicValue(var1)) : module0141.$g1674$.getDynamicValue(var1)), var1);
                                                            final SubLObject var30 = module0228.f15229(var27);
                                                            if (NIL != module0138.f8992(var30)) {
                                                                final SubLObject var31 = module0242.f15664(var30, module0137.f8955((SubLObject)UNPROVIDED));
                                                                if (NIL != var31) {
                                                                    final SubLObject var32 = module0245.f15834(var31, module0244.f15780(module0137.f8955($ic4$)), module0137.f8955((SubLObject)UNPROVIDED));
                                                                    if (NIL != var32) {
                                                                        SubLObject var33;
                                                                        for (var33 = module0066.f4838(module0067.f4891(var32)); NIL == module0066.f4841(var33); var33 = module0066.f4840(var33)) {
                                                                            var1.resetMultipleValues();
                                                                            final SubLObject var34 = module0066.f4839(var33);
                                                                            final SubLObject var35 = var1.secondMultipleValue();
                                                                            var1.resetMultipleValues();
                                                                            if (NIL != module0147.f9507(var34)) {
                                                                                final SubLObject var18_48 = module0138.$g1623$.currentBinding(var1);
                                                                                try {
                                                                                    module0138.$g1623$.bind(var34, var1);
                                                                                    SubLObject var70_74;
                                                                                    for (var70_74 = module0066.f4838(module0067.f4891(var35)); NIL == module0066.f4841(var70_74); var70_74 = module0066.f4840(var70_74)) {
                                                                                        var1.resetMultipleValues();
                                                                                        final SubLObject var36 = module0066.f4839(var70_74);
                                                                                        final SubLObject var37 = var1.secondMultipleValue();
                                                                                        var1.resetMultipleValues();
                                                                                        if (NIL != module0141.f9289(var36)) {
                                                                                            final SubLObject var18_49 = module0138.$g1624$.currentBinding(var1);
                                                                                            try {
                                                                                                module0138.$g1624$.bind(var36, var1);
                                                                                                final SubLObject var38 = var37;
                                                                                                if (NIL != module0077.f5302(var38)) {
                                                                                                    final SubLObject var39 = module0077.f5333(var38);
                                                                                                    SubLObject var40;
                                                                                                    SubLObject var41;
                                                                                                    SubLObject var42;
                                                                                                    for (var40 = module0032.f1741(var39), var41 = (SubLObject)NIL, var41 = module0032.f1742(var40, var39); NIL == module0032.f1744(var40, var41); var41 = module0032.f1743(var41)) {
                                                                                                        var42 = module0032.f1745(var40, var41);
                                                                                                        if (NIL != module0032.f1746(var41, var42) && NIL == module0249.f16059(var42, module0139.$g1636$.getDynamicValue(var1))) {
                                                                                                            module0249.f16055(var42, module0139.$g1636$.getDynamicValue(var1));
                                                                                                            if (NIL != module0173.f10955(var42) && NIL != constant_handles_oc.f8449(var42)) {
                                                                                                                module0030.f1600(var42, var18, var14, (SubLObject)UNPROVIDED);
                                                                                                            }
                                                                                                        }
                                                                                                    }
                                                                                                }
                                                                                                else if (var38.isList()) {
                                                                                                    SubLObject var43 = var38;
                                                                                                    SubLObject var44 = (SubLObject)NIL;
                                                                                                    var44 = var43.first();
                                                                                                    while (NIL != var43) {
                                                                                                        if (NIL == module0249.f16059(var44, module0139.$g1636$.getDynamicValue(var1))) {
                                                                                                            module0249.f16055(var44, module0139.$g1636$.getDynamicValue(var1));
                                                                                                            if (NIL != module0173.f10955(var44) && NIL != constant_handles_oc.f8449(var44)) {
                                                                                                                module0030.f1600(var44, var18, var14, (SubLObject)UNPROVIDED);
                                                                                                            }
                                                                                                        }
                                                                                                        var43 = var43.rest();
                                                                                                        var44 = var43.first();
                                                                                                    }
                                                                                                }
                                                                                                else {
                                                                                                    Errors.error((SubLObject)$ic22$, var38);
                                                                                                }
                                                                                            }
                                                                                            finally {
                                                                                                module0138.$g1624$.rebind(var18_49, var1);
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                    module0066.f4842(var70_74);
                                                                                }
                                                                                finally {
                                                                                    module0138.$g1623$.rebind(var18_48, var1);
                                                                                }
                                                                            }
                                                                        }
                                                                        module0066.f4842(var33);
                                                                    }
                                                                }
                                                                else {
                                                                    module0136.f8870((SubLObject)FIVE_INTEGER, (SubLObject)$ic23$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                                                                }
                                                                if (NIL != module0200.f12419(var30, module0137.f8955((SubLObject)UNPROVIDED))) {
                                                                    SubLObject var45 = module0248.f15995(var30);
                                                                    SubLObject var46 = (SubLObject)NIL;
                                                                    var46 = var45.first();
                                                                    while (NIL != var45) {
                                                                        SubLObject var48;
                                                                        final SubLObject var47 = var48 = var46;
                                                                        SubLObject var49 = (SubLObject)NIL;
                                                                        SubLObject var50 = (SubLObject)NIL;
                                                                        SubLObject var51 = (SubLObject)NIL;
                                                                        cdestructuring_bind.destructuring_bind_must_consp(var48, var47, (SubLObject)$ic24$);
                                                                        var49 = var48.first();
                                                                        var48 = var48.rest();
                                                                        cdestructuring_bind.destructuring_bind_must_consp(var48, var47, (SubLObject)$ic24$);
                                                                        var50 = var48.first();
                                                                        var48 = var48.rest();
                                                                        cdestructuring_bind.destructuring_bind_must_consp(var48, var47, (SubLObject)$ic24$);
                                                                        var51 = var48.first();
                                                                        var48 = var48.rest();
                                                                        if (NIL == var48) {
                                                                            if (NIL != module0147.f9507(var50)) {
                                                                                final SubLObject var18_50 = module0138.$g1623$.currentBinding(var1);
                                                                                try {
                                                                                    module0138.$g1623$.bind(var50, var1);
                                                                                    if (NIL != module0141.f9289(var51)) {
                                                                                        final SubLObject var18_51 = module0138.$g1624$.currentBinding(var1);
                                                                                        try {
                                                                                            module0138.$g1624$.bind(var51, var1);
                                                                                            final SubLObject var38;
                                                                                            final SubLObject var52 = var38 = (SubLObject)ConsesLow.list(var49);
                                                                                            if (NIL != module0077.f5302(var38)) {
                                                                                                final SubLObject var39 = module0077.f5333(var38);
                                                                                                SubLObject var40;
                                                                                                SubLObject var41;
                                                                                                SubLObject var42;
                                                                                                for (var40 = module0032.f1741(var39), var41 = (SubLObject)NIL, var41 = module0032.f1742(var40, var39); NIL == module0032.f1744(var40, var41); var41 = module0032.f1743(var41)) {
                                                                                                    var42 = module0032.f1745(var40, var41);
                                                                                                    if (NIL != module0032.f1746(var41, var42) && NIL == module0249.f16059(var42, module0139.$g1636$.getDynamicValue(var1))) {
                                                                                                        module0249.f16055(var42, module0139.$g1636$.getDynamicValue(var1));
                                                                                                        if (NIL != module0173.f10955(var42) && NIL != constant_handles_oc.f8449(var42)) {
                                                                                                            module0030.f1600(var42, var18, var14, (SubLObject)UNPROVIDED);
                                                                                                        }
                                                                                                    }
                                                                                                }
                                                                                            }
                                                                                            else if (var38.isList()) {
                                                                                                SubLObject var82_91 = var38;
                                                                                                SubLObject var44 = (SubLObject)NIL;
                                                                                                var44 = var82_91.first();
                                                                                                while (NIL != var82_91) {
                                                                                                    if (NIL == module0249.f16059(var44, module0139.$g1636$.getDynamicValue(var1))) {
                                                                                                        module0249.f16055(var44, module0139.$g1636$.getDynamicValue(var1));
                                                                                                        if (NIL != module0173.f10955(var44) && NIL != constant_handles_oc.f8449(var44)) {
                                                                                                            module0030.f1600(var44, var18, var14, (SubLObject)UNPROVIDED);
                                                                                                        }
                                                                                                    }
                                                                                                    var82_91 = var82_91.rest();
                                                                                                    var44 = var82_91.first();
                                                                                                }
                                                                                            }
                                                                                            else {
                                                                                                Errors.error((SubLObject)$ic22$, var38);
                                                                                            }
                                                                                        }
                                                                                        finally {
                                                                                            module0138.$g1624$.rebind(var18_51, var1);
                                                                                        }
                                                                                    }
                                                                                }
                                                                                finally {
                                                                                    module0138.$g1623$.rebind(var18_50, var1);
                                                                                }
                                                                            }
                                                                        }
                                                                        else {
                                                                            cdestructuring_bind.cdestructuring_bind_error(var47, (SubLObject)$ic24$);
                                                                        }
                                                                        var45 = var45.rest();
                                                                        var46 = var45.first();
                                                                    }
                                                                }
                                                            }
                                                            else if (NIL != module0155.f9785(var30, (SubLObject)UNPROVIDED)) {
                                                                SubLObject var5_41;
                                                                final SubLObject var53 = var5_41 = ((NIL != module0138.f8995()) ? module0035.f2097(module0244.f15760(module0244.f15780(module0137.f8955($ic4$)), module0141.$g1714$.getDynamicValue(var1), module0137.f8955((SubLObject)UNPROVIDED))) : module0244.f15760(module0244.f15780(module0137.f8955($ic4$)), module0141.$g1714$.getDynamicValue(var1), module0137.f8955((SubLObject)UNPROVIDED)));
                                                                SubLObject var54 = (SubLObject)NIL;
                                                                var54 = var5_41.first();
                                                                while (NIL != var5_41) {
                                                                    final SubLObject var18_52 = module0138.$g1625$.currentBinding(var1);
                                                                    try {
                                                                        module0138.$g1625$.bind(var54, var1);
                                                                        final SubLObject var56;
                                                                        final SubLObject var55 = var56 = Functions.funcall(var54, var30);
                                                                        if (NIL != module0077.f5302(var56)) {
                                                                            final SubLObject var57 = module0077.f5333(var56);
                                                                            SubLObject var58;
                                                                            SubLObject var59;
                                                                            SubLObject var60;
                                                                            for (var58 = module0032.f1741(var57), var59 = (SubLObject)NIL, var59 = module0032.f1742(var58, var57); NIL == module0032.f1744(var58, var59); var59 = module0032.f1743(var59)) {
                                                                                var60 = module0032.f1745(var58, var59);
                                                                                if (NIL != module0032.f1746(var59, var60) && NIL == module0249.f16059(var60, module0139.$g1636$.getDynamicValue(var1))) {
                                                                                    module0249.f16055(var60, module0139.$g1636$.getDynamicValue(var1));
                                                                                    if (NIL != module0173.f10955(var60) && NIL != constant_handles_oc.f8449(var60)) {
                                                                                        module0030.f1600(var60, var18, var14, (SubLObject)UNPROVIDED);
                                                                                    }
                                                                                }
                                                                            }
                                                                        }
                                                                        else if (var56.isList()) {
                                                                            SubLObject var61 = var56;
                                                                            SubLObject var62 = (SubLObject)NIL;
                                                                            var62 = var61.first();
                                                                            while (NIL != var61) {
                                                                                if (NIL == module0249.f16059(var62, module0139.$g1636$.getDynamicValue(var1))) {
                                                                                    module0249.f16055(var62, module0139.$g1636$.getDynamicValue(var1));
                                                                                    if (NIL != module0173.f10955(var62) && NIL != constant_handles_oc.f8449(var62)) {
                                                                                        module0030.f1600(var62, var18, var14, (SubLObject)UNPROVIDED);
                                                                                    }
                                                                                }
                                                                                var61 = var61.rest();
                                                                                var62 = var61.first();
                                                                            }
                                                                        }
                                                                        else {
                                                                            Errors.error((SubLObject)$ic22$, var56);
                                                                        }
                                                                    }
                                                                    finally {
                                                                        module0138.$g1625$.rebind(var18_52, var1);
                                                                    }
                                                                    var5_41 = var5_41.rest();
                                                                    var54 = var5_41.first();
                                                                }
                                                            }
                                                        }
                                                        finally {
                                                            module0141.$g1674$.rebind(var19_47, var1);
                                                            module0137.$g1605$.rebind(var18_47, var1);
                                                        }
                                                        var5_40 = var5_40.rest();
                                                        var29 = var5_40.first();
                                                    }
                                                    SubLObject var5_42;
                                                    final SubLObject var63 = var5_42 = module0200.f12443(module0244.f15771(module0137.f8955($ic4$)));
                                                    SubLObject var64 = (SubLObject)NIL;
                                                    var64 = var5_42.first();
                                                    while (NIL != var5_42) {
                                                        final SubLObject var18_53 = module0137.$g1605$.currentBinding(var1);
                                                        final SubLObject var19_48 = module0141.$g1674$.currentBinding(var1);
                                                        try {
                                                            module0137.$g1605$.bind(var64, var1);
                                                            module0141.$g1674$.bind((SubLObject)((NIL != module0141.f9205((SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)) ? makeBoolean(NIL == module0141.$g1674$.getDynamicValue(var1)) : module0141.$g1674$.getDynamicValue(var1)), var1);
                                                            final SubLObject var65 = module0228.f15229(var44_45);
                                                            if (NIL != module0138.f8992(var65)) {
                                                                final SubLObject var66 = module0242.f15664(var65, module0137.f8955((SubLObject)UNPROVIDED));
                                                                if (NIL != var66) {
                                                                    final SubLObject var67 = module0245.f15834(var66, module0138.f8979(), module0137.f8955((SubLObject)UNPROVIDED));
                                                                    if (NIL != var67) {
                                                                        SubLObject var68;
                                                                        for (var68 = module0066.f4838(module0067.f4891(var67)); NIL == module0066.f4841(var68); var68 = module0066.f4840(var68)) {
                                                                            var1.resetMultipleValues();
                                                                            final SubLObject var69 = module0066.f4839(var68);
                                                                            final SubLObject var70 = var1.secondMultipleValue();
                                                                            var1.resetMultipleValues();
                                                                            if (NIL != module0147.f9507(var69)) {
                                                                                final SubLObject var18_54 = module0138.$g1623$.currentBinding(var1);
                                                                                try {
                                                                                    module0138.$g1623$.bind(var69, var1);
                                                                                    SubLObject var70_75;
                                                                                    for (var70_75 = module0066.f4838(module0067.f4891(var70)); NIL == module0066.f4841(var70_75); var70_75 = module0066.f4840(var70_75)) {
                                                                                        var1.resetMultipleValues();
                                                                                        final SubLObject var71 = module0066.f4839(var70_75);
                                                                                        final SubLObject var72 = var1.secondMultipleValue();
                                                                                        var1.resetMultipleValues();
                                                                                        if (NIL != module0141.f9289(var71)) {
                                                                                            final SubLObject var18_55 = module0138.$g1624$.currentBinding(var1);
                                                                                            try {
                                                                                                module0138.$g1624$.bind(var71, var1);
                                                                                                final SubLObject var73 = var72;
                                                                                                if (NIL != module0077.f5302(var73)) {
                                                                                                    final SubLObject var74 = module0077.f5333(var73);
                                                                                                    SubLObject var75;
                                                                                                    SubLObject var76;
                                                                                                    SubLObject var77;
                                                                                                    for (var75 = module0032.f1741(var74), var76 = (SubLObject)NIL, var76 = module0032.f1742(var75, var74); NIL == module0032.f1744(var75, var76); var76 = module0032.f1743(var76)) {
                                                                                                        var77 = module0032.f1745(var75, var76);
                                                                                                        if (NIL != module0032.f1746(var76, var77) && NIL == module0249.f16059(var77, (SubLObject)UNPROVIDED)) {
                                                                                                            module0249.f16055(var77, (SubLObject)UNPROVIDED);
                                                                                                            module0056.f4149(var77, var21);
                                                                                                        }
                                                                                                    }
                                                                                                }
                                                                                                else if (var73.isList()) {
                                                                                                    SubLObject var78 = var73;
                                                                                                    SubLObject var79 = (SubLObject)NIL;
                                                                                                    var79 = var78.first();
                                                                                                    while (NIL != var78) {
                                                                                                        if (NIL == module0249.f16059(var79, (SubLObject)UNPROVIDED)) {
                                                                                                            module0249.f16055(var79, (SubLObject)UNPROVIDED);
                                                                                                            module0056.f4149(var79, var21);
                                                                                                        }
                                                                                                        var78 = var78.rest();
                                                                                                        var79 = var78.first();
                                                                                                    }
                                                                                                }
                                                                                                else {
                                                                                                    Errors.error((SubLObject)$ic22$, var73);
                                                                                                }
                                                                                            }
                                                                                            finally {
                                                                                                module0138.$g1624$.rebind(var18_55, var1);
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                    module0066.f4842(var70_75);
                                                                                }
                                                                                finally {
                                                                                    module0138.$g1623$.rebind(var18_54, var1);
                                                                                }
                                                                            }
                                                                        }
                                                                        module0066.f4842(var68);
                                                                    }
                                                                }
                                                                else {
                                                                    module0136.f8870((SubLObject)FIVE_INTEGER, (SubLObject)$ic23$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                                                                }
                                                            }
                                                            else if (NIL != module0155.f9785(var65, (SubLObject)UNPROVIDED)) {
                                                                SubLObject var5_43;
                                                                final SubLObject var80 = var5_43 = ((NIL != module0138.f8995()) ? module0035.f2097(module0244.f15760(module0138.f8979(), module0141.$g1714$.getDynamicValue(var1), module0137.f8955((SubLObject)UNPROVIDED))) : module0244.f15760(module0138.f8979(), module0141.$g1714$.getDynamicValue(var1), module0137.f8955((SubLObject)UNPROVIDED)));
                                                                SubLObject var81 = (SubLObject)NIL;
                                                                var81 = var5_43.first();
                                                                while (NIL != var5_43) {
                                                                    final SubLObject var18_56 = module0138.$g1625$.currentBinding(var1);
                                                                    try {
                                                                        module0138.$g1625$.bind(var81, var1);
                                                                        final SubLObject var83;
                                                                        final SubLObject var82 = var83 = Functions.funcall(var81, var65);
                                                                        if (NIL != module0077.f5302(var83)) {
                                                                            final SubLObject var84 = module0077.f5333(var83);
                                                                            SubLObject var85;
                                                                            SubLObject var86;
                                                                            SubLObject var87;
                                                                            for (var85 = module0032.f1741(var84), var86 = (SubLObject)NIL, var86 = module0032.f1742(var85, var84); NIL == module0032.f1744(var85, var86); var86 = module0032.f1743(var86)) {
                                                                                var87 = module0032.f1745(var85, var86);
                                                                                if (NIL != module0032.f1746(var86, var87) && NIL == module0249.f16059(var87, (SubLObject)UNPROVIDED)) {
                                                                                    module0249.f16055(var87, (SubLObject)UNPROVIDED);
                                                                                    module0056.f4149(var87, var21);
                                                                                }
                                                                            }
                                                                        }
                                                                        else if (var83.isList()) {
                                                                            SubLObject var88 = var83;
                                                                            SubLObject var89 = (SubLObject)NIL;
                                                                            var89 = var88.first();
                                                                            while (NIL != var88) {
                                                                                if (NIL == module0249.f16059(var89, (SubLObject)UNPROVIDED)) {
                                                                                    module0249.f16055(var89, (SubLObject)UNPROVIDED);
                                                                                    module0056.f4149(var89, var21);
                                                                                }
                                                                                var88 = var88.rest();
                                                                                var89 = var88.first();
                                                                            }
                                                                        }
                                                                        else {
                                                                            Errors.error((SubLObject)$ic22$, var83);
                                                                        }
                                                                    }
                                                                    finally {
                                                                        module0138.$g1625$.rebind(var18_56, var1);
                                                                    }
                                                                    var5_43 = var5_43.rest();
                                                                    var81 = var5_43.first();
                                                                }
                                                            }
                                                        }
                                                        finally {
                                                            module0141.$g1674$.rebind(var19_48, var1);
                                                            module0137.$g1605$.rebind(var18_53, var1);
                                                        }
                                                        var5_42 = var5_42.rest();
                                                        var64 = var5_42.first();
                                                    }
                                                    var44_45 = module0056.f4150(var21);
                                                }
                                            }
                                            finally {
                                                module0141.$g1674$.rebind(var55_60, var1);
                                                module0138.$g1619$.rebind(var19_46, var1);
                                                module0141.$g1677$.rebind(var18_46, var1);
                                            }
                                        }
                                        else {
                                            module0136.f8872((SubLObject)TWO_INTEGER, (SubLObject)$ic25$, var19, module0244.f15748(module0137.f8955((SubLObject)UNPROVIDED)), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                                        }
                                    }
                                    finally {
                                        module0137.$g1605$.rebind(var26, var1);
                                        module0141.$g1674$.rebind(var25, var1);
                                        module0141.$g1672$.rebind(var24, var1);
                                        module0141.$g1671$.rebind(var19_45, var1);
                                        module0141.$g1670$.rebind(var18_45, var1);
                                    }
                                }
                                finally {
                                    module0141.$g1715$.rebind(var19_44, var1);
                                    module0141.$g1714$.rebind(var18_44, var1);
                                }
                                module0139.f9011(module0139.$g1635$.getDynamicValue(var1));
                            }
                            finally {
                                module0139.$g1635$.rebind(var18_43, var1);
                            }
                            module0139.f9011(module0139.$g1636$.getDynamicValue(var1));
                        }
                        finally {
                            module0139.$g1636$.rebind(var19_43, var1);
                            module0137.$g1605$.rebind(var18_42, var1);
                        }
                        SubLObject var5_44 = module0562.f34692(var18, (SubLObject)NIL);
                        SubLObject var90 = (SubLObject)NIL;
                        var90 = var5_44.first();
                        while (NIL != var5_44) {
                            if (NIL != constant_handles_oc.f8449(var90)) {
                                module0030.f1600(var90, var18, var14, (SubLObject)UNPROVIDED);
                            }
                            var5_44 = var5_44.rest();
                            var90 = var5_44.first();
                        }
                        var5_39 = var5_39.rest();
                        var18 = var5_39.first();
                    }
                }
                else if (NIL != module0035.f2013(var7)) {
                    SubLObject var5_45 = var7;
                    SubLObject var91 = (SubLObject)NIL;
                    var91 = var5_45.first();
                    while (NIL != var5_45) {
                        final SubLObject var92 = module0077.f5333(var91);
                        SubLObject var93;
                        SubLObject var94;
                        SubLObject var95;
                        for (var93 = module0032.f1741(var92), var94 = (SubLObject)NIL, var94 = module0032.f1742(var93, var92); NIL == module0032.f1744(var93, var94); var94 = module0032.f1743(var94)) {
                            var95 = module0032.f1745(var93, var94);
                            if (NIL != module0032.f1746(var94, var95) && NIL != constant_handles_oc.f8449(var95)) {
                                module0030.f1600(var95, var91, var14, (SubLObject)UNPROVIDED);
                            }
                        }
                        var5_45 = var5_45.rest();
                        var91 = var5_45.first();
                    }
                }
                else if (NIL != module0035.f2013(var11)) {
                    SubLObject var5_46 = var11;
                    SubLObject var96 = (SubLObject)NIL;
                    var96 = var5_46.first();
                    while (NIL != var5_46) {
                        final SubLObject var97 = module0031.f1696(f34712(var96));
                        final SubLObject var98 = (SubLObject)NIL;
                        SubLObject var99;
                        SubLObject var100;
                        SubLObject var101;
                        SubLObject var102;
                        SubLObject var5_47;
                        SubLObject var103;
                        for (var99 = Sequences.length(var97), var100 = (SubLObject)NIL, var100 = (SubLObject)ZERO_INTEGER; var100.numL(var99); var100 = Numbers.add(var100, (SubLObject)ONE_INTEGER)) {
                            var101 = ((NIL != var98) ? Numbers.subtract(var99, var100, (SubLObject)ONE_INTEGER) : var100);
                            var102 = Vectors.aref(var97, var101);
                            if (NIL != module0031.f1697(var102)) {
                                if (NIL != constant_handles_oc.f8449(var102)) {
                                    module0030.f1600(var102, var96, var14, (SubLObject)UNPROVIDED);
                                }
                                else if (NIL != module0167.f10813(var102)) {
                                    var5_47 = module0035.f2110((SubLObject)$ic26$, module0172.f10920(var102), (SubLObject)UNPROVIDED);
                                    var103 = (SubLObject)NIL;
                                    var103 = var5_47.first();
                                    while (NIL != var5_47) {
                                        module0030.f1600(var103, var96, var14, (SubLObject)UNPROVIDED);
                                        var5_47 = var5_47.rest();
                                        var103 = var5_47.first();
                                    }
                                }
                            }
                        }
                        var5_46 = var5_46.rest();
                        var96 = var5_46.first();
                    }
                }
                else {
                    final SubLObject var104 = constant_handles_oc.f8425();
                    final SubLObject var105 = (SubLObject)$ic27$;
                    final SubLObject var106 = module0065.f4733(var104);
                    SubLObject var107 = (SubLObject)ZERO_INTEGER;
                    assert NIL != Types.stringp(var105) : var105;
                    final SubLObject var18_57 = module0012.$g75$.currentBinding(var1);
                    final SubLObject var19_49 = module0012.$g76$.currentBinding(var1);
                    final SubLObject var108 = module0012.$g77$.currentBinding(var1);
                    final SubLObject var109 = module0012.$g78$.currentBinding(var1);
                    try {
                        module0012.$g75$.bind((SubLObject)ZERO_INTEGER, var1);
                        module0012.$g76$.bind((SubLObject)NIL, var1);
                        module0012.$g77$.bind((SubLObject)T, var1);
                        module0012.$g78$.bind(Time.get_universal_time(), var1);
                        module0012.f478(var105);
                        final SubLObject var124_125 = var104;
                        if (NIL == module0065.f4772(var124_125, (SubLObject)$ic29$)) {
                            final SubLObject var126_127 = var124_125;
                            if (NIL == module0065.f4775(var126_127, (SubLObject)$ic29$)) {
                                final SubLObject var110 = module0065.f4740(var126_127);
                                final SubLObject var111 = (SubLObject)NIL;
                                SubLObject var112;
                                SubLObject var113;
                                SubLObject var114;
                                SubLObject var115;
                                for (var112 = Sequences.length(var110), var113 = (SubLObject)NIL, var113 = (SubLObject)ZERO_INTEGER; var113.numL(var112); var113 = Numbers.add(var113, (SubLObject)ONE_INTEGER)) {
                                    var114 = ((NIL != var111) ? Numbers.subtract(var112, var113, (SubLObject)ONE_INTEGER) : var113);
                                    var115 = Vectors.aref(var110, var114);
                                    if (NIL == module0065.f4749(var115) || NIL == module0065.f4773((SubLObject)$ic29$)) {
                                        if (NIL != module0065.f4749(var115)) {
                                            var115 = (SubLObject)$ic29$;
                                        }
                                        module0012.note_percent_progress(var107, var106);
                                        var107 = Numbers.add(var107, (SubLObject)ONE_INTEGER);
                                        module0030.f1600(var115, $ic30$, var14, (SubLObject)UNPROVIDED);
                                    }
                                }
                            }
                            final SubLObject var129_130 = var124_125;
                            if (NIL == module0065.f4777(var129_130) || NIL == module0065.f4773((SubLObject)$ic29$)) {
                                final SubLObject var116 = module0065.f4738(var129_130);
                                SubLObject var117 = module0065.f4739(var129_130);
                                final SubLObject var118 = module0065.f4734(var129_130);
                                final SubLObject var119 = (SubLObject)((NIL != module0065.f4773((SubLObject)$ic29$)) ? NIL : $ic29$);
                                while (var117.numL(var118)) {
                                    final SubLObject var120 = Hashtables.gethash_without_values(var117, var116, var119);
                                    if (NIL == module0065.f4773((SubLObject)$ic29$) || NIL == module0065.f4749(var120)) {
                                        module0012.note_percent_progress(var107, var106);
                                        var107 = Numbers.add(var107, (SubLObject)ONE_INTEGER);
                                        module0030.f1600(var120, $ic30$, var14, (SubLObject)UNPROVIDED);
                                    }
                                    var117 = Numbers.add(var117, (SubLObject)ONE_INTEGER);
                                }
                            }
                        }
                        module0012.f479();
                    }
                    finally {
                        module0012.$g78$.rebind(var109, var1);
                        module0012.$g77$.rebind(var108, var1);
                        module0012.$g76$.rebind(var19_49, var1);
                        module0012.$g75$.rebind(var18_57, var1);
                    }
                }
                SubLObject var5_48 = var8;
                SubLObject var121 = (SubLObject)NIL;
                var121 = var5_48.first();
                while (NIL != var5_48) {
                    final SubLObject var19 = var121;
                    final SubLObject var18_58 = module0137.$g1605$.currentBinding(var1);
                    final SubLObject var19_50 = module0139.$g1636$.currentBinding(var1);
                    try {
                        module0137.$g1605$.bind(module0137.f8955($ic4$), var1);
                        module0139.$g1636$.bind(module0139.f9007(), var1);
                        SubLObject var44_46 = var19;
                        final SubLObject var20 = (SubLObject)$ic13$;
                        final SubLObject var21 = module0056.f4145(var20);
                        final SubLObject var18_59 = module0139.$g1635$.currentBinding(var1);
                        try {
                            module0139.$g1635$.bind(module0139.f9007(), var1);
                            final SubLObject var22 = (SubLObject)NIL;
                            final SubLObject var18_60 = module0141.$g1714$.currentBinding(var1);
                            final SubLObject var19_51 = module0141.$g1715$.currentBinding(var1);
                            try {
                                module0141.$g1714$.bind((NIL != var22) ? var22 : module0141.f9283(), var1);
                                module0141.$g1715$.bind((SubLObject)((NIL != var22) ? $ic14$ : module0141.$g1715$.getDynamicValue(var1)), var1);
                                if (NIL != var22 && NIL != module0136.f8864() && NIL == module0141.f9279(var22)) {
                                    final SubLObject var23 = module0136.$g1591$.getDynamicValue(var1);
                                    if (var23.eql((SubLObject)$ic15$)) {
                                        module0136.f8870((SubLObject)ONE_INTEGER, (SubLObject)$ic16$, var22, (SubLObject)$ic17$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                                    }
                                    else if (var23.eql((SubLObject)$ic18$)) {
                                        module0136.f8871((SubLObject)ONE_INTEGER, (SubLObject)$ic19$, (SubLObject)$ic16$, var22, (SubLObject)$ic17$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                                    }
                                    else if (var23.eql((SubLObject)$ic20$)) {
                                        Errors.warn((SubLObject)$ic16$, var22, (SubLObject)$ic17$);
                                    }
                                    else {
                                        Errors.warn((SubLObject)$ic21$, module0136.$g1591$.getDynamicValue(var1));
                                        Errors.cerror((SubLObject)$ic19$, (SubLObject)$ic16$, var22, (SubLObject)$ic17$);
                                    }
                                }
                                final SubLObject var18_61 = module0141.$g1670$.currentBinding(var1);
                                final SubLObject var19_52 = module0141.$g1671$.currentBinding(var1);
                                final SubLObject var24 = module0141.$g1672$.currentBinding(var1);
                                final SubLObject var25 = module0141.$g1674$.currentBinding(var1);
                                final SubLObject var26 = module0137.$g1605$.currentBinding(var1);
                                try {
                                    module0141.$g1670$.bind(module0244.f15771(module0137.f8955($ic4$)), var1);
                                    module0141.$g1671$.bind(module0244.f15739(module0244.f15771(module0137.f8955($ic4$))), var1);
                                    module0141.$g1672$.bind(module0244.f15746(module0244.f15771(module0137.f8955($ic4$))), var1);
                                    module0141.$g1674$.bind((SubLObject)NIL, var1);
                                    module0137.$g1605$.bind(module0244.f15771(module0137.f8955($ic4$)), var1);
                                    if (NIL != module0136.f8865() || NIL != module0244.f15795(var19, module0137.f8955((SubLObject)UNPROVIDED))) {
                                        final SubLObject var18_62 = module0141.$g1677$.currentBinding(var1);
                                        final SubLObject var19_53 = module0138.$g1619$.currentBinding(var1);
                                        final SubLObject var55_61 = module0141.$g1674$.currentBinding(var1);
                                        try {
                                            module0141.$g1677$.bind(module0141.f9210(), var1);
                                            module0138.$g1619$.bind(module0244.f15782(module0141.f9210(), module0244.f15771(module0137.f8955($ic4$))), var1);
                                            module0141.$g1674$.bind((SubLObject)NIL, var1);
                                            module0249.f16055(var44_46, (SubLObject)UNPROVIDED);
                                            while (NIL != var44_46) {
                                                final SubLObject var27 = var44_46;
                                                SubLObject var5_49;
                                                final SubLObject var28 = var5_49 = module0200.f12443(module0137.f8955($ic4$));
                                                SubLObject var29 = (SubLObject)NIL;
                                                var29 = var5_49.first();
                                                while (NIL != var5_49) {
                                                    final SubLObject var18_63 = module0137.$g1605$.currentBinding(var1);
                                                    final SubLObject var19_54 = module0141.$g1674$.currentBinding(var1);
                                                    try {
                                                        module0137.$g1605$.bind(var29, var1);
                                                        module0141.$g1674$.bind((SubLObject)((NIL != module0141.f9205((SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)) ? makeBoolean(NIL == module0141.$g1674$.getDynamicValue(var1)) : module0141.$g1674$.getDynamicValue(var1)), var1);
                                                        final SubLObject var30 = module0228.f15229(var27);
                                                        if (NIL != module0138.f8992(var30)) {
                                                            final SubLObject var31 = module0242.f15664(var30, module0137.f8955((SubLObject)UNPROVIDED));
                                                            if (NIL != var31) {
                                                                final SubLObject var32 = module0245.f15834(var31, module0244.f15780(module0137.f8955($ic4$)), module0137.f8955((SubLObject)UNPROVIDED));
                                                                if (NIL != var32) {
                                                                    SubLObject var33;
                                                                    for (var33 = module0066.f4838(module0067.f4891(var32)); NIL == module0066.f4841(var33); var33 = module0066.f4840(var33)) {
                                                                        var1.resetMultipleValues();
                                                                        final SubLObject var34 = module0066.f4839(var33);
                                                                        final SubLObject var35 = var1.secondMultipleValue();
                                                                        var1.resetMultipleValues();
                                                                        if (NIL != module0147.f9507(var34)) {
                                                                            final SubLObject var18_64 = module0138.$g1623$.currentBinding(var1);
                                                                            try {
                                                                                module0138.$g1623$.bind(var34, var1);
                                                                                SubLObject var70_76;
                                                                                for (var70_76 = module0066.f4838(module0067.f4891(var35)); NIL == module0066.f4841(var70_76); var70_76 = module0066.f4840(var70_76)) {
                                                                                    var1.resetMultipleValues();
                                                                                    final SubLObject var36 = module0066.f4839(var70_76);
                                                                                    final SubLObject var37 = var1.secondMultipleValue();
                                                                                    var1.resetMultipleValues();
                                                                                    if (NIL != module0141.f9289(var36)) {
                                                                                        final SubLObject var18_65 = module0138.$g1624$.currentBinding(var1);
                                                                                        try {
                                                                                            module0138.$g1624$.bind(var36, var1);
                                                                                            final SubLObject var38 = var37;
                                                                                            if (NIL != module0077.f5302(var38)) {
                                                                                                final SubLObject var39 = module0077.f5333(var38);
                                                                                                SubLObject var40;
                                                                                                SubLObject var41;
                                                                                                SubLObject var42;
                                                                                                for (var40 = module0032.f1741(var39), var41 = (SubLObject)NIL, var41 = module0032.f1742(var40, var39); NIL == module0032.f1744(var40, var41); var41 = module0032.f1743(var41)) {
                                                                                                    var42 = module0032.f1745(var40, var41);
                                                                                                    if (NIL != module0032.f1746(var41, var42) && NIL == module0249.f16059(var42, module0139.$g1636$.getDynamicValue(var1))) {
                                                                                                        module0249.f16055(var42, module0139.$g1636$.getDynamicValue(var1));
                                                                                                        if (NIL != module0173.f10955(var42) && NIL != constant_handles_oc.f8449(var42)) {
                                                                                                            module0030.f1600(var42, var121, var15, (SubLObject)UNPROVIDED);
                                                                                                        }
                                                                                                    }
                                                                                                }
                                                                                            }
                                                                                            else if (var38.isList()) {
                                                                                                SubLObject var43 = var38;
                                                                                                SubLObject var44 = (SubLObject)NIL;
                                                                                                var44 = var43.first();
                                                                                                while (NIL != var43) {
                                                                                                    if (NIL == module0249.f16059(var44, module0139.$g1636$.getDynamicValue(var1))) {
                                                                                                        module0249.f16055(var44, module0139.$g1636$.getDynamicValue(var1));
                                                                                                        if (NIL != module0173.f10955(var44) && NIL != constant_handles_oc.f8449(var44)) {
                                                                                                            module0030.f1600(var44, var121, var15, (SubLObject)UNPROVIDED);
                                                                                                        }
                                                                                                    }
                                                                                                    var43 = var43.rest();
                                                                                                    var44 = var43.first();
                                                                                                }
                                                                                            }
                                                                                            else {
                                                                                                Errors.error((SubLObject)$ic22$, var38);
                                                                                            }
                                                                                        }
                                                                                        finally {
                                                                                            module0138.$g1624$.rebind(var18_65, var1);
                                                                                        }
                                                                                    }
                                                                                }
                                                                                module0066.f4842(var70_76);
                                                                            }
                                                                            finally {
                                                                                module0138.$g1623$.rebind(var18_64, var1);
                                                                            }
                                                                        }
                                                                    }
                                                                    module0066.f4842(var33);
                                                                }
                                                            }
                                                            else {
                                                                module0136.f8870((SubLObject)FIVE_INTEGER, (SubLObject)$ic23$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                                                            }
                                                            if (NIL != module0200.f12419(var30, module0137.f8955((SubLObject)UNPROVIDED))) {
                                                                SubLObject var45 = module0248.f15995(var30);
                                                                SubLObject var46 = (SubLObject)NIL;
                                                                var46 = var45.first();
                                                                while (NIL != var45) {
                                                                    SubLObject var123;
                                                                    final SubLObject var122 = var123 = var46;
                                                                    SubLObject var49 = (SubLObject)NIL;
                                                                    SubLObject var50 = (SubLObject)NIL;
                                                                    SubLObject var51 = (SubLObject)NIL;
                                                                    cdestructuring_bind.destructuring_bind_must_consp(var123, var122, (SubLObject)$ic24$);
                                                                    var49 = var123.first();
                                                                    var123 = var123.rest();
                                                                    cdestructuring_bind.destructuring_bind_must_consp(var123, var122, (SubLObject)$ic24$);
                                                                    var50 = var123.first();
                                                                    var123 = var123.rest();
                                                                    cdestructuring_bind.destructuring_bind_must_consp(var123, var122, (SubLObject)$ic24$);
                                                                    var51 = var123.first();
                                                                    var123 = var123.rest();
                                                                    if (NIL == var123) {
                                                                        if (NIL != module0147.f9507(var50)) {
                                                                            final SubLObject var18_66 = module0138.$g1623$.currentBinding(var1);
                                                                            try {
                                                                                module0138.$g1623$.bind(var50, var1);
                                                                                if (NIL != module0141.f9289(var51)) {
                                                                                    final SubLObject var18_67 = module0138.$g1624$.currentBinding(var1);
                                                                                    try {
                                                                                        module0138.$g1624$.bind(var51, var1);
                                                                                        final SubLObject var38;
                                                                                        final SubLObject var52 = var38 = (SubLObject)ConsesLow.list(var49);
                                                                                        if (NIL != module0077.f5302(var38)) {
                                                                                            final SubLObject var39 = module0077.f5333(var38);
                                                                                            SubLObject var40;
                                                                                            SubLObject var41;
                                                                                            SubLObject var42;
                                                                                            for (var40 = module0032.f1741(var39), var41 = (SubLObject)NIL, var41 = module0032.f1742(var40, var39); NIL == module0032.f1744(var40, var41); var41 = module0032.f1743(var41)) {
                                                                                                var42 = module0032.f1745(var40, var41);
                                                                                                if (NIL != module0032.f1746(var41, var42) && NIL == module0249.f16059(var42, module0139.$g1636$.getDynamicValue(var1))) {
                                                                                                    module0249.f16055(var42, module0139.$g1636$.getDynamicValue(var1));
                                                                                                    if (NIL != module0173.f10955(var42) && NIL != constant_handles_oc.f8449(var42)) {
                                                                                                        module0030.f1600(var42, var121, var15, (SubLObject)UNPROVIDED);
                                                                                                    }
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                        else if (var38.isList()) {
                                                                                            SubLObject var82_92 = var38;
                                                                                            SubLObject var44 = (SubLObject)NIL;
                                                                                            var44 = var82_92.first();
                                                                                            while (NIL != var82_92) {
                                                                                                if (NIL == module0249.f16059(var44, module0139.$g1636$.getDynamicValue(var1))) {
                                                                                                    module0249.f16055(var44, module0139.$g1636$.getDynamicValue(var1));
                                                                                                    if (NIL != module0173.f10955(var44) && NIL != constant_handles_oc.f8449(var44)) {
                                                                                                        module0030.f1600(var44, var121, var15, (SubLObject)UNPROVIDED);
                                                                                                    }
                                                                                                }
                                                                                                var82_92 = var82_92.rest();
                                                                                                var44 = var82_92.first();
                                                                                            }
                                                                                        }
                                                                                        else {
                                                                                            Errors.error((SubLObject)$ic22$, var38);
                                                                                        }
                                                                                    }
                                                                                    finally {
                                                                                        module0138.$g1624$.rebind(var18_67, var1);
                                                                                    }
                                                                                }
                                                                            }
                                                                            finally {
                                                                                module0138.$g1623$.rebind(var18_66, var1);
                                                                            }
                                                                        }
                                                                    }
                                                                    else {
                                                                        cdestructuring_bind.cdestructuring_bind_error(var122, (SubLObject)$ic24$);
                                                                    }
                                                                    var45 = var45.rest();
                                                                    var46 = var45.first();
                                                                }
                                                            }
                                                        }
                                                        else if (NIL != module0155.f9785(var30, (SubLObject)UNPROVIDED)) {
                                                            SubLObject var5_50;
                                                            final SubLObject var53 = var5_50 = ((NIL != module0138.f8995()) ? module0035.f2097(module0244.f15760(module0244.f15780(module0137.f8955($ic4$)), module0141.$g1714$.getDynamicValue(var1), module0137.f8955((SubLObject)UNPROVIDED))) : module0244.f15760(module0244.f15780(module0137.f8955($ic4$)), module0141.$g1714$.getDynamicValue(var1), module0137.f8955((SubLObject)UNPROVIDED)));
                                                            SubLObject var54 = (SubLObject)NIL;
                                                            var54 = var5_50.first();
                                                            while (NIL != var5_50) {
                                                                final SubLObject var18_68 = module0138.$g1625$.currentBinding(var1);
                                                                try {
                                                                    module0138.$g1625$.bind(var54, var1);
                                                                    final SubLObject var56;
                                                                    final SubLObject var55 = var56 = Functions.funcall(var54, var30);
                                                                    if (NIL != module0077.f5302(var56)) {
                                                                        final SubLObject var57 = module0077.f5333(var56);
                                                                        SubLObject var58;
                                                                        SubLObject var59;
                                                                        SubLObject var60;
                                                                        for (var58 = module0032.f1741(var57), var59 = (SubLObject)NIL, var59 = module0032.f1742(var58, var57); NIL == module0032.f1744(var58, var59); var59 = module0032.f1743(var59)) {
                                                                            var60 = module0032.f1745(var58, var59);
                                                                            if (NIL != module0032.f1746(var59, var60) && NIL == module0249.f16059(var60, module0139.$g1636$.getDynamicValue(var1))) {
                                                                                module0249.f16055(var60, module0139.$g1636$.getDynamicValue(var1));
                                                                                if (NIL != module0173.f10955(var60) && NIL != constant_handles_oc.f8449(var60)) {
                                                                                    module0030.f1600(var60, var121, var15, (SubLObject)UNPROVIDED);
                                                                                }
                                                                            }
                                                                        }
                                                                    }
                                                                    else if (var56.isList()) {
                                                                        SubLObject var61 = var56;
                                                                        SubLObject var62 = (SubLObject)NIL;
                                                                        var62 = var61.first();
                                                                        while (NIL != var61) {
                                                                            if (NIL == module0249.f16059(var62, module0139.$g1636$.getDynamicValue(var1))) {
                                                                                module0249.f16055(var62, module0139.$g1636$.getDynamicValue(var1));
                                                                                if (NIL != module0173.f10955(var62) && NIL != constant_handles_oc.f8449(var62)) {
                                                                                    module0030.f1600(var62, var121, var15, (SubLObject)UNPROVIDED);
                                                                                }
                                                                            }
                                                                            var61 = var61.rest();
                                                                            var62 = var61.first();
                                                                        }
                                                                    }
                                                                    else {
                                                                        Errors.error((SubLObject)$ic22$, var56);
                                                                    }
                                                                }
                                                                finally {
                                                                    module0138.$g1625$.rebind(var18_68, var1);
                                                                }
                                                                var5_50 = var5_50.rest();
                                                                var54 = var5_50.first();
                                                            }
                                                        }
                                                    }
                                                    finally {
                                                        module0141.$g1674$.rebind(var19_54, var1);
                                                        module0137.$g1605$.rebind(var18_63, var1);
                                                    }
                                                    var5_49 = var5_49.rest();
                                                    var29 = var5_49.first();
                                                }
                                                SubLObject var5_51;
                                                final SubLObject var63 = var5_51 = module0200.f12443(module0244.f15771(module0137.f8955($ic4$)));
                                                SubLObject var64 = (SubLObject)NIL;
                                                var64 = var5_51.first();
                                                while (NIL != var5_51) {
                                                    final SubLObject var18_69 = module0137.$g1605$.currentBinding(var1);
                                                    final SubLObject var19_55 = module0141.$g1674$.currentBinding(var1);
                                                    try {
                                                        module0137.$g1605$.bind(var64, var1);
                                                        module0141.$g1674$.bind((SubLObject)((NIL != module0141.f9205((SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)) ? makeBoolean(NIL == module0141.$g1674$.getDynamicValue(var1)) : module0141.$g1674$.getDynamicValue(var1)), var1);
                                                        final SubLObject var65 = module0228.f15229(var44_46);
                                                        if (NIL != module0138.f8992(var65)) {
                                                            final SubLObject var66 = module0242.f15664(var65, module0137.f8955((SubLObject)UNPROVIDED));
                                                            if (NIL != var66) {
                                                                final SubLObject var67 = module0245.f15834(var66, module0138.f8979(), module0137.f8955((SubLObject)UNPROVIDED));
                                                                if (NIL != var67) {
                                                                    SubLObject var68;
                                                                    for (var68 = module0066.f4838(module0067.f4891(var67)); NIL == module0066.f4841(var68); var68 = module0066.f4840(var68)) {
                                                                        var1.resetMultipleValues();
                                                                        final SubLObject var69 = module0066.f4839(var68);
                                                                        final SubLObject var70 = var1.secondMultipleValue();
                                                                        var1.resetMultipleValues();
                                                                        if (NIL != module0147.f9507(var69)) {
                                                                            final SubLObject var18_70 = module0138.$g1623$.currentBinding(var1);
                                                                            try {
                                                                                module0138.$g1623$.bind(var69, var1);
                                                                                SubLObject var70_77;
                                                                                for (var70_77 = module0066.f4838(module0067.f4891(var70)); NIL == module0066.f4841(var70_77); var70_77 = module0066.f4840(var70_77)) {
                                                                                    var1.resetMultipleValues();
                                                                                    final SubLObject var71 = module0066.f4839(var70_77);
                                                                                    final SubLObject var72 = var1.secondMultipleValue();
                                                                                    var1.resetMultipleValues();
                                                                                    if (NIL != module0141.f9289(var71)) {
                                                                                        final SubLObject var18_71 = module0138.$g1624$.currentBinding(var1);
                                                                                        try {
                                                                                            module0138.$g1624$.bind(var71, var1);
                                                                                            final SubLObject var73 = var72;
                                                                                            if (NIL != module0077.f5302(var73)) {
                                                                                                final SubLObject var74 = module0077.f5333(var73);
                                                                                                SubLObject var75;
                                                                                                SubLObject var76;
                                                                                                SubLObject var77;
                                                                                                for (var75 = module0032.f1741(var74), var76 = (SubLObject)NIL, var76 = module0032.f1742(var75, var74); NIL == module0032.f1744(var75, var76); var76 = module0032.f1743(var76)) {
                                                                                                    var77 = module0032.f1745(var75, var76);
                                                                                                    if (NIL != module0032.f1746(var76, var77) && NIL == module0249.f16059(var77, (SubLObject)UNPROVIDED)) {
                                                                                                        module0249.f16055(var77, (SubLObject)UNPROVIDED);
                                                                                                        module0056.f4149(var77, var21);
                                                                                                    }
                                                                                                }
                                                                                            }
                                                                                            else if (var73.isList()) {
                                                                                                SubLObject var78 = var73;
                                                                                                SubLObject var79 = (SubLObject)NIL;
                                                                                                var79 = var78.first();
                                                                                                while (NIL != var78) {
                                                                                                    if (NIL == module0249.f16059(var79, (SubLObject)UNPROVIDED)) {
                                                                                                        module0249.f16055(var79, (SubLObject)UNPROVIDED);
                                                                                                        module0056.f4149(var79, var21);
                                                                                                    }
                                                                                                    var78 = var78.rest();
                                                                                                    var79 = var78.first();
                                                                                                }
                                                                                            }
                                                                                            else {
                                                                                                Errors.error((SubLObject)$ic22$, var73);
                                                                                            }
                                                                                        }
                                                                                        finally {
                                                                                            module0138.$g1624$.rebind(var18_71, var1);
                                                                                        }
                                                                                    }
                                                                                }
                                                                                module0066.f4842(var70_77);
                                                                            }
                                                                            finally {
                                                                                module0138.$g1623$.rebind(var18_70, var1);
                                                                            }
                                                                        }
                                                                    }
                                                                    module0066.f4842(var68);
                                                                }
                                                            }
                                                            else {
                                                                module0136.f8870((SubLObject)FIVE_INTEGER, (SubLObject)$ic23$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                                                            }
                                                        }
                                                        else if (NIL != module0155.f9785(var65, (SubLObject)UNPROVIDED)) {
                                                            SubLObject var5_52;
                                                            final SubLObject var80 = var5_52 = ((NIL != module0138.f8995()) ? module0035.f2097(module0244.f15760(module0138.f8979(), module0141.$g1714$.getDynamicValue(var1), module0137.f8955((SubLObject)UNPROVIDED))) : module0244.f15760(module0138.f8979(), module0141.$g1714$.getDynamicValue(var1), module0137.f8955((SubLObject)UNPROVIDED)));
                                                            SubLObject var81 = (SubLObject)NIL;
                                                            var81 = var5_52.first();
                                                            while (NIL != var5_52) {
                                                                final SubLObject var18_72 = module0138.$g1625$.currentBinding(var1);
                                                                try {
                                                                    module0138.$g1625$.bind(var81, var1);
                                                                    final SubLObject var83;
                                                                    final SubLObject var82 = var83 = Functions.funcall(var81, var65);
                                                                    if (NIL != module0077.f5302(var83)) {
                                                                        final SubLObject var84 = module0077.f5333(var83);
                                                                        SubLObject var85;
                                                                        SubLObject var86;
                                                                        SubLObject var87;
                                                                        for (var85 = module0032.f1741(var84), var86 = (SubLObject)NIL, var86 = module0032.f1742(var85, var84); NIL == module0032.f1744(var85, var86); var86 = module0032.f1743(var86)) {
                                                                            var87 = module0032.f1745(var85, var86);
                                                                            if (NIL != module0032.f1746(var86, var87) && NIL == module0249.f16059(var87, (SubLObject)UNPROVIDED)) {
                                                                                module0249.f16055(var87, (SubLObject)UNPROVIDED);
                                                                                module0056.f4149(var87, var21);
                                                                            }
                                                                        }
                                                                    }
                                                                    else if (var83.isList()) {
                                                                        SubLObject var88 = var83;
                                                                        SubLObject var89 = (SubLObject)NIL;
                                                                        var89 = var88.first();
                                                                        while (NIL != var88) {
                                                                            if (NIL == module0249.f16059(var89, (SubLObject)UNPROVIDED)) {
                                                                                module0249.f16055(var89, (SubLObject)UNPROVIDED);
                                                                                module0056.f4149(var89, var21);
                                                                            }
                                                                            var88 = var88.rest();
                                                                            var89 = var88.first();
                                                                        }
                                                                    }
                                                                    else {
                                                                        Errors.error((SubLObject)$ic22$, var83);
                                                                    }
                                                                }
                                                                finally {
                                                                    module0138.$g1625$.rebind(var18_72, var1);
                                                                }
                                                                var5_52 = var5_52.rest();
                                                                var81 = var5_52.first();
                                                            }
                                                        }
                                                    }
                                                    finally {
                                                        module0141.$g1674$.rebind(var19_55, var1);
                                                        module0137.$g1605$.rebind(var18_69, var1);
                                                    }
                                                    var5_51 = var5_51.rest();
                                                    var64 = var5_51.first();
                                                }
                                                var44_46 = module0056.f4150(var21);
                                            }
                                        }
                                        finally {
                                            module0141.$g1674$.rebind(var55_61, var1);
                                            module0138.$g1619$.rebind(var19_53, var1);
                                            module0141.$g1677$.rebind(var18_62, var1);
                                        }
                                    }
                                    else {
                                        module0136.f8872((SubLObject)TWO_INTEGER, (SubLObject)$ic25$, var19, module0244.f15748(module0137.f8955((SubLObject)UNPROVIDED)), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                                    }
                                }
                                finally {
                                    module0137.$g1605$.rebind(var26, var1);
                                    module0141.$g1674$.rebind(var25, var1);
                                    module0141.$g1672$.rebind(var24, var1);
                                    module0141.$g1671$.rebind(var19_52, var1);
                                    module0141.$g1670$.rebind(var18_61, var1);
                                }
                            }
                            finally {
                                module0141.$g1715$.rebind(var19_51, var1);
                                module0141.$g1714$.rebind(var18_60, var1);
                            }
                            module0139.f9011(module0139.$g1635$.getDynamicValue(var1));
                        }
                        finally {
                            module0139.$g1635$.rebind(var18_59, var1);
                        }
                        module0139.f9011(module0139.$g1636$.getDynamicValue(var1));
                    }
                    finally {
                        module0139.$g1636$.rebind(var19_50, var1);
                        module0137.$g1605$.rebind(var18_58, var1);
                    }
                    SubLObject var5_53 = module0562.f34692(var121, (SubLObject)NIL);
                    SubLObject var90 = (SubLObject)NIL;
                    var90 = var5_53.first();
                    while (NIL != var5_53) {
                        if (NIL != constant_handles_oc.f8449(var90)) {
                            module0030.f1600(var90, var121, var15, (SubLObject)UNPROVIDED);
                        }
                        var5_53 = var5_53.rest();
                        var90 = var5_53.first();
                    }
                    var5_48 = var5_48.rest();
                    var121 = var5_48.first();
                }
                if (NIL != module0269.f17706(var9)) {
                    final SubLObject var124 = var9;
                    if (NIL != module0158.f10038(var124)) {
                        final SubLObject var125 = (SubLObject)NIL;
                        final SubLObject var18_73 = module0012.$g73$.currentBinding(var1);
                        final SubLObject var19_56 = module0012.$g65$.currentBinding(var1);
                        final SubLObject var126 = module0012.$g67$.currentBinding(var1);
                        final SubLObject var127 = module0012.$g68$.currentBinding(var1);
                        final SubLObject var128 = module0012.$g66$.currentBinding(var1);
                        final SubLObject var129 = module0012.$g69$.currentBinding(var1);
                        final SubLObject var130 = module0012.$g70$.currentBinding(var1);
                        final SubLObject var131 = module0012.$silent_progressP$.currentBinding(var1);
                        try {
                            module0012.$g73$.bind(Time.get_universal_time(), var1);
                            module0012.$g65$.bind(module0012.$g73$.getDynamicValue(var1), var1);
                            module0012.$g67$.bind((SubLObject)ONE_INTEGER, var1);
                            module0012.$g68$.bind((SubLObject)ZERO_INTEGER, var1);
                            module0012.$g66$.bind((SubLObject)ZERO_INTEGER, var1);
                            module0012.$g69$.bind((SubLObject)ZERO_INTEGER, var1);
                            module0012.$g70$.bind((SubLObject)T, var1);
                            module0012.$silent_progressP$.bind((SubLObject)((NIL != var125) ? module0012.$silent_progressP$.getDynamicValue(var1) : T), var1);
                            module0012.f474(var125);
                            final SubLObject var132 = module0158.f10039(var124);
                            SubLObject var133 = (SubLObject)NIL;
                            final SubLObject var134 = (SubLObject)NIL;
                            while (NIL == var133) {
                                final SubLObject var135 = module0052.f3695(var132, var134);
                                final SubLObject var136 = (SubLObject)makeBoolean(!var134.eql(var135));
                                if (NIL != var136) {
                                    module0012.f476();
                                    SubLObject var137 = (SubLObject)NIL;
                                    try {
                                        var137 = module0158.f10316(var135, (SubLObject)$ic31$, (SubLObject)NIL, (SubLObject)NIL);
                                        SubLObject var176_181 = (SubLObject)NIL;
                                        final SubLObject var177_182 = (SubLObject)NIL;
                                        while (NIL == var176_181) {
                                            final SubLObject var138 = module0052.f3695(var137, var177_182);
                                            final SubLObject var179_184 = (SubLObject)makeBoolean(!var177_182.eql(var138));
                                            if (NIL != var179_184) {
                                                final SubLObject var139 = module0178.f11334(var138);
                                                if (NIL != constant_handles_oc.f8449(var139)) {
                                                    module0030.f1600(var139, var9, var15, (SubLObject)UNPROVIDED);
                                                }
                                            }
                                            var176_181 = (SubLObject)makeBoolean(NIL == var179_184);
                                        }
                                    }
                                    finally {
                                        final SubLObject var18_74 = Threads.$is_thread_performing_cleanupP$.currentBinding(var1);
                                        try {
                                            Threads.$is_thread_performing_cleanupP$.bind((SubLObject)T, var1);
                                            if (NIL != var137) {
                                                module0158.f10319(var137);
                                            }
                                        }
                                        finally {
                                            Threads.$is_thread_performing_cleanupP$.rebind(var18_74, var1);
                                        }
                                    }
                                }
                                var133 = (SubLObject)makeBoolean(NIL == var136);
                            }
                            module0012.f475();
                        }
                        finally {
                            module0012.$silent_progressP$.rebind(var131, var1);
                            module0012.$g70$.rebind(var130, var1);
                            module0012.$g69$.rebind(var129, var1);
                            module0012.$g66$.rebind(var128, var1);
                            module0012.$g68$.rebind(var127, var1);
                            module0012.$g67$.rebind(var126, var1);
                            module0012.$g65$.rebind(var19_56, var1);
                            module0012.$g73$.rebind(var18_73, var1);
                        }
                    }
                }
                SubLObject var5_54 = var12;
                SubLObject var140 = (SubLObject)NIL;
                var140 = var5_54.first();
                while (NIL != var5_54) {
                    if (NIL != Hashtables.gethash(var140, var15, (SubLObject)UNPROVIDED)) {
                        Errors.warn((SubLObject)$ic32$, var140, Hashtables.gethash(var140, var15, (SubLObject)UNPROVIDED));
                        Hashtables.remhash(var140, var15);
                    }
                    module0030.f1600(var140, $ic33$, var14, (SubLObject)UNPROVIDED);
                    var5_54 = var5_54.rest();
                    var140 = var5_54.first();
                }
                SubLObject var5_55 = var13;
                SubLObject var141 = (SubLObject)NIL;
                var141 = var5_55.first();
                while (NIL != var5_55) {
                    module0030.f1600(var141, $ic34$, var15, (SubLObject)UNPROVIDED);
                    var5_55 = var5_55.rest();
                    var141 = var5_55.first();
                }
                SubLObject var142 = (SubLObject)NIL;
                SubLObject var143 = (SubLObject)NIL;
                final Iterator var144 = Hashtables.getEntrySetIterator(var14);
                try {
                    while (Hashtables.iteratorHasNext(var144)) {
                        final Map.Entry var145 = Hashtables.iteratorNextEntry(var144);
                        var142 = Hashtables.getEntryKey(var145);
                        var143 = Hashtables.getEntryValue(var145);
                        final SubLObject var146 = Hashtables.gethash(var142, var15, (SubLObject)UNPROVIDED);
                        if (NIL != var146) {
                            if (NIL == Hashtables.gethash(var142, $g4102$.getDynamicValue(var1), (SubLObject)UNPROVIDED) && NIL == Hashtables.gethash(var142, $g4103$.getDynamicValue(var1), (SubLObject)UNPROVIDED)) {
                                module0030.f1600(var142, (SubLObject)ConsesLow.list(var143, var146), $g4103$.getDynamicValue(var1), (SubLObject)UNPROVIDED);
                                Hashtables.remhash(var142, $g4102$.getDynamicValue(var1));
                            }
                            var17 = Numbers.add(var17, (SubLObject)ONE_INTEGER);
                        }
                        else {
                            if (NIL != var10 && NIL == Hashtables.gethash(var142, $g4102$.getDynamicValue(var1), (SubLObject)UNPROVIDED)) {
                                Hashtables.sethash(var142, $g4104$.getDynamicValue(var1), var10);
                            }
                            SubLObject var5_56 = var143;
                            SubLObject var147 = (SubLObject)NIL;
                            var147 = var5_56.first();
                            while (NIL != var5_56) {
                                module0030.f1600(var142, var147, $g4102$.getDynamicValue(var1), (SubLObject)UNPROVIDED);
                                var5_56 = var5_56.rest();
                                var147 = var5_56.first();
                            }
                            var16 = Numbers.add(var16, (SubLObject)ONE_INTEGER);
                        }
                    }
                }
                finally {
                    Hashtables.releaseEntrySetIterator(var144);
                }
                PrintLow.format((SubLObject)T, (SubLObject)$ic35$, var16, var6);
                if (NIL != var8 || NIL != var9) {
                    PrintLow.format((SubLObject)T, (SubLObject)$ic36$, new SubLObject[] { var17, (NIL != var8) ? $ic37$ : $ic38$, (NIL != var9) ? $ic39$ : $ic38$, (NIL != var8) ? var8 : $ic38$, (NIL != var9) ? var9 : $ic38$ });
                }
                var4 = var4.rest();
                var5 = var4.first();
            }
        }
        finally {
            module0147.$g2095$.rebind(var3, var1);
            module0147.$g2094$.rebind(var2, var1);
        }
        PrintLow.format((SubLObject)T, (SubLObject)$ic40$, Hashtables.hash_table_count($g4102$.getDynamicValue(var1)));
        PrintLow.format((SubLObject)T, (SubLObject)$ic41$, Hashtables.hash_table_count($g4103$.getDynamicValue(var1)));
        if (!$ic10$.numL(Hashtables.hash_table_count($g4103$.getDynamicValue(var1)))) {
            PrintLow.format((SubLObject)T, (SubLObject)$ic42$);
            final SubLObject var148 = $g4103$.getDynamicValue(var1);
            SubLObject var149 = (SubLObject)NIL;
            SubLObject var150 = (SubLObject)NIL;
            final Iterator var151 = Hashtables.getEntrySetIterator(var148);
            try {
                while (Hashtables.iteratorHasNext(var151)) {
                    final Map.Entry var152 = Hashtables.iteratorNextEntry(var151);
                    var149 = Hashtables.getEntryKey(var152);
                    var150 = Hashtables.getEntryValue(var152);
                    PrintLow.format((SubLObject)T, (SubLObject)$ic43$, var149);
                }
            }
            finally {
                Hashtables.releaseEntrySetIterator(var151);
            }
            PrintLow.format((SubLObject)T, (SubLObject)$ic44$);
        }
        final SubLObject var148 = $g4102$.getDynamicValue(var1);
        SubLObject var149 = (SubLObject)NIL;
        SubLObject var153 = (SubLObject)NIL;
        final Iterator var151 = Hashtables.getEntrySetIterator(var148);
        try {
            while (Hashtables.iteratorHasNext(var151)) {
                final Map.Entry var152 = Hashtables.iteratorNextEntry(var151);
                var149 = Hashtables.getEntryKey(var152);
                var153 = Hashtables.getEntryValue(var152);
                if (NIL == Hashtables.gethash(var149, $g4103$.getDynamicValue(var1), (SubLObject)UNPROVIDED)) {
                    $g4101$.setDynamicValue((SubLObject)ConsesLow.cons(var149, $g4101$.getDynamicValue(var1)), var1);
                }
            }
        }
        finally {
            Hashtables.releaseEntrySetIterator(var151);
        }
        PrintLow.format((SubLObject)T, (SubLObject)$ic45$, Sequences.length($g4101$.getDynamicValue(var1)));
        return $g4101$.getDynamicValue(var1);
    }
    
    public static SubLObject f34713() {
        final SubLObject var199 = $g4105$.getGlobalValue();
        if (NIL != var199) {
            module0034.f1818(var199);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f34714(final SubLObject var111) {
        return module0034.f1829($g4105$.getGlobalValue(), (SubLObject)ConsesLow.list(var111), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f34715(final SubLObject var111) {
        final SubLThread var112 = SubLProcess.currentSubLThread();
        return module0411.f28661((SubLObject)ConsesLow.list($ic47$, (SubLObject)$ic48$, (SubLObject)ConsesLow.list($ic49$, (SubLObject)$ic50$, (SubLObject)ConsesLow.listS($ic51$, (SubLObject)ConsesLow.list($ic4$, (SubLObject)$ic50$, var111), (SubLObject)$ic52$))), (SubLObject)$ic53$, (SubLObject)NIL, StreamsLow.$standard_output$.getDynamicValue(var112));
    }
    
    public static SubLObject f34712(final SubLObject var111) {
        SubLObject var112 = $g4105$.getGlobalValue();
        if (NIL == var112) {
            var112 = module0034.f1934((SubLObject)$ic46$, (SubLObject)$ic54$, (SubLObject)FIFTEEN_INTEGER, (SubLObject)EQL, (SubLObject)ONE_INTEGER, (SubLObject)ZERO_INTEGER);
        }
        SubLObject var113 = module0034.f1814(var112, var111, (SubLObject)$ic55$);
        if (var113 == $ic55$) {
            var113 = Values.arg2(Values.resetMultipleValues(), (SubLObject)Values.multiple_value_list(f34715(var111)));
            module0034.f1816(var112, var111, var113, (SubLObject)UNPROVIDED);
        }
        return module0034.f1959(var113);
    }
    
    public static SubLObject f34716() {
        final SubLThread var1 = SubLProcess.currentSubLThread();
        return $g4106$.getDynamicValue(var1);
    }
    
    public static SubLObject f34717(final SubLObject var202) {
        final SubLThread var203 = SubLProcess.currentSubLThread();
        return module0004.f104(var202, $g4106$.getDynamicValue(var203), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f34718() {
        final SubLThread var1 = SubLProcess.currentSubLThread();
        final SubLObject var3;
        final SubLObject var2 = var3 = module0034.f1854((SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        final SubLObject var4 = module0034.$g879$.currentBinding(var1);
        try {
            module0034.$g879$.bind(var3, var1);
            SubLObject var5 = (SubLObject)NIL;
            if (NIL != var3 && NIL == module0034.f1842(var3)) {
                var5 = module0034.f1869(var3);
                final SubLObject var6 = Threads.current_process();
                if (NIL == var5) {
                    module0034.f1873(var3, var6);
                }
                else if (!var5.eql(var6)) {
                    Errors.error((SubLObject)$ic56$);
                }
            }
            try {
                if (NIL == $g4101$.getDynamicValue(var1) || !$g4102$.getDynamicValue(var1).isHashtable() || !$g4103$.getDynamicValue(var1).isHashtable() || !$g4104$.getDynamicValue(var1).isHashtable()) {
                    Errors.cerror((SubLObject)$ic57$, (SubLObject)$ic58$);
                }
            }
            finally {
                final SubLObject var18_207 = Threads.$is_thread_performing_cleanupP$.currentBinding(var1);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)T, var1);
                    SubLObject var7 = (SubLObject)NIL;
                    SubLObject var8 = (SubLObject)NIL;
                    final SubLObject var18_208 = module0147.$g2094$.currentBinding(var1);
                    final SubLObject var9 = module0147.$g2095$.currentBinding(var1);
                    try {
                        module0147.$g2094$.bind((SubLObject)$ic8$, var1);
                        module0147.$g2095$.bind($ic9$, var1);
                        var7 = module0259.f16848($ic59$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                    }
                    finally {
                        module0147.$g2095$.rebind(var9, var1);
                        module0147.$g2094$.rebind(var18_208, var1);
                    }
                    final SubLObject var10 = var7;
                    module0012.$g82$.setDynamicValue((SubLObject)$ic60$, var1);
                    module0012.$g73$.setDynamicValue(Time.get_universal_time(), var1);
                    module0012.$g83$.setDynamicValue(Sequences.length(var10), var1);
                    module0012.$g84$.setDynamicValue((SubLObject)ZERO_INTEGER, var1);
                    final SubLObject var18_209 = module0012.$g75$.currentBinding(var1);
                    final SubLObject var11 = module0012.$g76$.currentBinding(var1);
                    final SubLObject var12 = module0012.$g77$.currentBinding(var1);
                    final SubLObject var13 = module0012.$g78$.currentBinding(var1);
                    try {
                        module0012.$g75$.bind((SubLObject)ZERO_INTEGER, var1);
                        module0012.$g76$.bind((SubLObject)NIL, var1);
                        module0012.$g77$.bind((SubLObject)T, var1);
                        module0012.$g78$.bind(Time.get_universal_time(), var1);
                        module0012.f478(module0012.$g82$.getDynamicValue(var1));
                        SubLObject var14 = var10;
                        SubLObject var15 = (SubLObject)NIL;
                        var15 = var14.first();
                        while (NIL != var14) {
                            module0012.note_percent_progress(module0012.$g84$.getDynamicValue(var1), module0012.$g83$.getDynamicValue(var1));
                            module0012.$g84$.setDynamicValue(Numbers.add(module0012.$g84$.getDynamicValue(var1), (SubLObject)ONE_INTEGER), var1);
                            if (NIL != f34719(var15)) {
                                var8 = (SubLObject)ConsesLow.cons(var15, var8);
                            }
                            var14 = var14.rest();
                            var15 = var14.first();
                        }
                        module0012.f479();
                    }
                    finally {
                        module0012.$g78$.rebind(var13, var1);
                        module0012.$g77$.rebind(var12, var1);
                        module0012.$g76$.rebind(var11, var1);
                        module0012.$g75$.rebind(var18_209, var1);
                    }
                    $g4106$.setDynamicValue(var8, var1);
                    PrintLow.format((SubLObject)T, (SubLObject)$ic61$, Sequences.length($g4106$.getDynamicValue(var1)));
                    if (NIL != var3 && NIL == var5) {
                        module0034.f1873(var3, (SubLObject)NIL);
                    }
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(var18_207, var1);
                }
            }
        }
        finally {
            module0034.$g879$.rebind(var4, var1);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f34719(final SubLObject var213) {
        final SubLThread var214 = SubLProcess.currentSubLThread();
        SubLObject var215 = (SubLObject)NIL;
        if (NIL != constant_handles_oc.f8449(var213)) {
            final SubLObject var216 = module0287.f19204(var213, (SubLObject)UNPROVIDED);
            if (NIL != var216) {
                final SubLObject var217 = module0147.$g2094$.currentBinding(var214);
                final SubLObject var218 = module0147.$g2095$.currentBinding(var214);
                try {
                    module0147.$g2094$.bind((SubLObject)$ic8$, var214);
                    module0147.$g2095$.bind($ic9$, var214);
                    SubLObject var219;
                    SubLObject var220;
                    SubLObject var221;
                    for (var219 = (SubLObject)NIL, var220 = (SubLObject)NIL, var220 = var216; NIL == var219 && NIL != var220; var219 = (SubLObject)makeBoolean(NIL == f34720(var213, var221)), var220 = var220.rest()) {
                        var221 = var220.first();
                    }
                    var215 = (SubLObject)makeBoolean(NIL == var219);
                }
                finally {
                    module0147.$g2095$.rebind(var218, var214);
                    module0147.$g2094$.rebind(var217, var214);
                }
            }
        }
        return var215;
    }
    
    public static SubLObject f34720(final SubLObject var213, final SubLObject var217) {
        final SubLThread var218 = SubLProcess.currentSubLThread();
        if (NIL != module0035.f2439(Symbols.symbol_function((SubLObject)$ic62$), module0178.f11289(var217), (SubLObject)UNPROVIDED)) {
            return (SubLObject)NIL;
        }
        var218.resetMultipleValues();
        final SubLObject var219 = module0289.f19397(var217);
        final SubLObject var220 = var218.secondMultipleValue();
        var218.resetMultipleValues();
        if (NIL == var219 || NIL != module0035.f2428(var213, var219, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED) || NIL != f34709(var220) || NIL != f34709(var219)) {
            return (SubLObject)NIL;
        }
        return (SubLObject)T;
    }
    
    public static SubLObject f34721(final SubLObject var202) {
        return (SubLObject)makeBoolean(NIL != constant_handles_oc.f8449(var202) && NIL == f34703(var202) && NIL == module0269.f17801(var202));
    }
    
    public static SubLObject f34722() {
        final SubLThread var1 = SubLProcess.currentSubLThread();
        return $g4107$.getDynamicValue(var1);
    }
    
    public static SubLObject f34723(final SubLObject var2) {
        final SubLThread var3 = SubLProcess.currentSubLThread();
        return module0031.f1688(var2, $g4108$.getDynamicValue(var3));
    }
    
    public static SubLObject f34724(final SubLObject var2) {
        return (SubLObject)makeBoolean(NIL != constant_handles_oc.f8449(var2) && NIL == f34723(var2));
    }
    
    public static SubLObject f34725() {
        final SubLThread var1 = SubLProcess.currentSubLThread();
        final SubLObject var2 = f34722();
        $g4108$.setDynamicValue(module0076.f5288(var2, Symbols.symbol_function((SubLObject)EQ), (SubLObject)UNPROVIDED), var1);
        return module0031.f1670($g4108$.getDynamicValue(var1));
    }
    
    public static SubLObject f34726() {
        f34711();
        f34718();
        final SubLObject var221 = module0561.f34538();
        final SubLObject var222 = f34702();
        final SubLObject var223 = f34716();
        $g4107$.setDynamicValue(module0035.f2272(Sequences.cconcatenate(var221, new SubLObject[] { var222, var223 })));
        f34725();
        return (SubLObject)NIL;
    }
    
    public static SubLObject f34727() {
        final SubLThread var1 = SubLProcess.currentSubLThread();
        return $g4109$.getDynamicValue(var1);
    }
    
    public static SubLObject f34728(final SubLObject var223) {
        return (SubLObject)makeBoolean(NIL != f34729(module0172.f10920(var223)) && NIL == module0035.f2171(var223, module0562.f34648(module0562.f34635().first())) && NIL != ((NIL != Strings.stringE((SubLObject)$ic63$, module0562.f34634(), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)) ? makeBoolean((NIL == module0562.f34686(var223, $ic64$) && NIL == module0259.f16891(var223, $ic64$)) || NIL != module0562.f34686(var223, $ic65$) || NIL != module0259.f16891(var223, $ic65$)) : ((NIL != Strings.stringE((SubLObject)$ic66$, module0562.f34634(), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)) ? makeBoolean(NIL != module0562.f34686(var223, $ic67$) || NIL != module0259.f16891(var223, $ic67$) || (NIL == module0562.f34686(var223, $ic68$) && NIL == module0259.f16891(var223, $ic68$) && NIL == module0562.f34686(var223, $ic69$) && NIL == module0259.f16891(var223, $ic69$)) || NIL != module0562.f34686(var223, $ic65$) || NIL != module0259.f16891(var223, $ic65$) || NIL != module0562.f34686(var223, $ic70$) || NIL != module0259.f16891(var223, $ic70$) || NIL != module0562.f34686(var223, $ic71$) || NIL != module0259.f16891(var223, $ic71$) || NIL != module0562.f34686(var223, $ic72$) || NIL != module0259.f16891(var223, $ic72$)) : ((NIL != Strings.stringE((SubLObject)$ic73$, module0562.f34634(), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)) ? makeBoolean(NIL == module0562.f34686(var223, $ic65$) && NIL == module0259.f16891(var223, $ic65$) && NIL == module0562.f34686(var223, $ic70$) && NIL == module0259.f16891(var223, $ic70$) && NIL == module0562.f34686(var223, $ic71$) && NIL == module0259.f16891(var223, $ic71$) && NIL == module0562.f34686(var223, $ic72$) && NIL == module0259.f16891(var223, $ic72$)) : T))));
    }
    
    public static SubLObject f34729(final SubLObject var224) {
        return (SubLObject)makeBoolean(var224.isCons() && NIL == module0035.f2439(Symbols.symbol_function((SubLObject)$ic74$), var224, (SubLObject)UNPROVIDED));
    }
    
    public static SubLObject f34730() {
        final SubLThread var1 = SubLProcess.currentSubLThread();
        SubLObject var2 = (SubLObject)NIL;
        final SubLObject var3 = module0167.f10788();
        final SubLObject var4 = (SubLObject)$ic75$;
        final SubLObject var5 = module0065.f4733(var3);
        SubLObject var6 = (SubLObject)ZERO_INTEGER;
        assert NIL != Types.stringp(var4) : var4;
        final SubLObject var7 = module0012.$g75$.currentBinding(var1);
        final SubLObject var8 = module0012.$g76$.currentBinding(var1);
        final SubLObject var9 = module0012.$g77$.currentBinding(var1);
        final SubLObject var10 = module0012.$g78$.currentBinding(var1);
        try {
            module0012.$g75$.bind((SubLObject)ZERO_INTEGER, var1);
            module0012.$g76$.bind((SubLObject)NIL, var1);
            module0012.$g77$.bind((SubLObject)T, var1);
            module0012.$g78$.bind(Time.get_universal_time(), var1);
            module0012.f478(var4);
            final SubLObject var124_226 = var3;
            if (NIL == module0065.f4772(var124_226, (SubLObject)$ic29$)) {
                final SubLObject var126_227 = var124_226;
                if (NIL == module0065.f4775(var126_227, (SubLObject)$ic29$)) {
                    final SubLObject var11 = module0065.f4740(var126_227);
                    final SubLObject var12 = (SubLObject)NIL;
                    SubLObject var13;
                    SubLObject var14;
                    SubLObject var15;
                    SubLObject var16;
                    for (var13 = Sequences.length(var11), var14 = (SubLObject)NIL, var14 = (SubLObject)ZERO_INTEGER; var14.numL(var13); var14 = Numbers.add(var14, (SubLObject)ONE_INTEGER)) {
                        var15 = ((NIL != var12) ? Numbers.subtract(var13, var14, (SubLObject)ONE_INTEGER) : var14);
                        var16 = Vectors.aref(var11, var15);
                        if (NIL == module0065.f4749(var16) || NIL == module0065.f4773((SubLObject)$ic29$)) {
                            if (NIL != module0065.f4749(var16)) {
                                var16 = (SubLObject)$ic29$;
                            }
                            module0012.note_percent_progress(var6, var5);
                            var6 = Numbers.add(var6, (SubLObject)ONE_INTEGER);
                            if (NIL != f34728(var16)) {
                                var2 = (SubLObject)ConsesLow.cons(var16, var2);
                            }
                        }
                    }
                }
                final SubLObject var129_228 = var124_226;
                if (NIL == module0065.f4777(var129_228) || NIL == module0065.f4773((SubLObject)$ic29$)) {
                    final SubLObject var17 = module0065.f4738(var129_228);
                    SubLObject var18 = module0065.f4739(var129_228);
                    final SubLObject var19 = module0065.f4734(var129_228);
                    final SubLObject var20 = (SubLObject)((NIL != module0065.f4773((SubLObject)$ic29$)) ? NIL : $ic29$);
                    while (var18.numL(var19)) {
                        final SubLObject var21 = Hashtables.gethash_without_values(var18, var17, var20);
                        if (NIL == module0065.f4773((SubLObject)$ic29$) || NIL == module0065.f4749(var21)) {
                            module0012.note_percent_progress(var6, var5);
                            var6 = Numbers.add(var6, (SubLObject)ONE_INTEGER);
                            if (NIL != f34728(var21)) {
                                var2 = (SubLObject)ConsesLow.cons(var21, var2);
                            }
                        }
                        var18 = Numbers.add(var18, (SubLObject)ONE_INTEGER);
                    }
                }
            }
            module0012.f479();
        }
        finally {
            module0012.$g78$.rebind(var10, var1);
            module0012.$g77$.rebind(var9, var1);
            module0012.$g76$.rebind(var8, var1);
            module0012.$g75$.rebind(var7, var1);
        }
        $g4109$.setDynamicValue(var2, var1);
        PrintLow.format((SubLObject)T, (SubLObject)$ic76$, Sequences.length($g4109$.getDynamicValue(var1)));
        return (SubLObject)NIL;
    }
    
    public static SubLObject f34731() {
        final SubLThread var1 = SubLProcess.currentSubLThread();
        return $g4110$.getDynamicValue(var1);
    }
    
    public static SubLObject f34732(final SubLObject var229) {
        final SubLThread var230 = SubLProcess.currentSubLThread();
        return module0031.f1688(var229, $g4111$.getDynamicValue(var230));
    }
    
    public static SubLObject f34733(final SubLObject var229) {
        SubLObject var230 = (SubLObject)NIL;
        if (NIL != constant_handles_oc.f8449(var229)) {
            SubLObject var231 = f34704(var229);
            SubLObject var232 = (SubLObject)NIL;
            var232 = var231.first();
            while (NIL != var231) {
                var230 = (SubLObject)ConsesLow.cons(var232, var230);
                var231 = var231.rest();
                var232 = var231.first();
            }
        }
        else {
            var230 = (SubLObject)ConsesLow.cons((SubLObject)$ic77$, var230);
        }
        final SubLObject var233 = module0564.f34817(var229);
        if (NIL != var233) {
            var230 = (SubLObject)ConsesLow.cons((SubLObject)$ic38$, var230);
            var230 = (SubLObject)ConsesLow.cons((SubLObject)$ic78$, var230);
            SubLObject var234 = var233;
            SubLObject var235 = (SubLObject)NIL;
            var235 = var234.first();
            while (NIL != var234) {
                final SubLObject var236 = var235.first();
                final SubLObject var237 = conses_high.second(var235);
                var230 = (SubLObject)ConsesLow.cons(module0191.f11990((SubLObject)$ic79$, var236, var237, (SubLObject)UNPROVIDED), var230);
                var234 = var234.rest();
                var235 = var234.first();
            }
        }
        return Sequences.nreverse(var230);
    }
    
    public static SubLObject f34734(final SubLObject var229) {
        return (SubLObject)makeBoolean(NIL != module0173.f10955(var229) && NIL == f34732(var229));
    }
    
    public static SubLObject f34735(final SubLObject var229) {
        if (NIL != constant_handles_oc.f8449(var229)) {
            return f34706(var229);
        }
        final SubLObject var230 = module0173.f10958(var229);
        final SubLObject var231 = module0035.f2272(module0035.f2259((SubLObject)$ic80$, var230, (SubLObject)UNPROVIDED));
        SubLObject var232 = (SubLObject)NIL;
        var232 = (SubLObject)ConsesLow.cons((SubLObject)$ic81$, var232);
        SubLObject var233 = var231;
        SubLObject var234 = (SubLObject)NIL;
        var234 = var233.first();
        while (NIL != var233) {
            var232 = (SubLObject)ConsesLow.cons(var234, var232);
            var233 = var233.rest();
            var234 = var233.first();
        }
        return Sequences.nreverse(var232);
    }
    
    public static SubLObject f34736(final SubLObject var229) {
        if (NIL != constant_handles_oc.f8449(var229)) {
            return f34737(var229);
        }
        if (NIL != module0167.f10813(var229)) {
            return module0035.f2439((SubLObject)$ic82$, module0172.f10920(var229), (SubLObject)UNPROVIDED);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f34738(final SubLObject var229) {
        return (SubLObject)makeBoolean(NIL == f34736(var229));
    }
    
    public static SubLObject f34739() {
        final SubLThread var1 = SubLProcess.currentSubLThread();
        final SubLObject var2 = f34731();
        $g4111$.setDynamicValue(module0076.f5288(var2, Symbols.symbol_function((SubLObject)EQ), (SubLObject)UNPROVIDED), var1);
        return module0031.f1670($g4111$.getDynamicValue(var1));
    }
    
    public static SubLObject f34740(final SubLObject var229) {
        final SubLThread var230 = SubLProcess.currentSubLThread();
        return module0031.f1691(var229, $g4111$.getDynamicValue(var230));
    }
    
    public static SubLObject f34741(final SubLObject var229) {
        SubLObject var230 = (SubLObject)ZERO_INTEGER;
        SubLObject var231 = (SubLObject)ZERO_INTEGER;
        if (NIL != f34732(var229)) {
            f34740(var229);
            var231 = Numbers.add(var231, (SubLObject)ONE_INTEGER);
            if (NIL != module0158.f10282(var229, (SubLObject)NIL)) {
                final SubLObject var232 = module0158.f10283(var229, (SubLObject)NIL);
                SubLObject var233 = (SubLObject)NIL;
                final SubLObject var234 = (SubLObject)NIL;
                while (NIL == var233) {
                    final SubLObject var235 = module0052.f3695(var232, var234);
                    final SubLObject var236 = (SubLObject)makeBoolean(!var234.eql(var235));
                    if (NIL != var236) {
                        SubLObject var237 = (SubLObject)NIL;
                        try {
                            var237 = module0158.f10316(var235, (SubLObject)NIL, (SubLObject)NIL, (SubLObject)NIL);
                            SubLObject var176_241 = (SubLObject)NIL;
                            final SubLObject var177_242 = (SubLObject)NIL;
                            while (NIL == var176_241) {
                                final SubLObject var238 = module0052.f3695(var237, var177_242);
                                final SubLObject var179_244 = (SubLObject)makeBoolean(!var177_242.eql(var238));
                                if (NIL != var179_244 && NIL != module0158.f10284(var238, var235)) {
                                    if (NIL != module0228.f15209(var238)) {
                                        f34741(module0178.f11334(var238));
                                    }
                                    if (NIL != f34742(var238)) {
                                        f34743(var238);
                                        var230 = Numbers.add(var230, (SubLObject)ONE_INTEGER);
                                    }
                                }
                                var176_241 = (SubLObject)makeBoolean(NIL == var179_244);
                            }
                        }
                        finally {
                            final SubLObject var239 = Dynamic.currentBinding(Threads.$is_thread_performing_cleanupP$);
                            try {
                                Dynamic.bind(Threads.$is_thread_performing_cleanupP$, (SubLObject)T);
                                if (NIL != var237) {
                                    module0158.f10319(var237);
                                }
                            }
                            finally {
                                Dynamic.rebind(Threads.$is_thread_performing_cleanupP$, var239);
                            }
                        }
                    }
                    var233 = (SubLObject)makeBoolean(NIL == var236);
                }
            }
        }
        return Values.values(var231, var230);
    }
    
    public static SubLObject f34744() {
        f34730();
        final SubLObject var220 = f34722();
        final SubLObject var221 = f34727();
        $g4110$.setDynamicValue(Sequences.cconcatenate(var220, var221));
        f34739();
        return (SubLObject)NIL;
    }
    
    public static SubLObject f34745(final SubLObject var2) {
        final SubLThread var3 = SubLProcess.currentSubLThread();
        if (NIL != constant_handles_oc.f8449(var2)) {
            return Hashtables.gethash(var2, $g4104$.getDynamicValue(var3), (SubLObject)UNPROVIDED);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f34746(final SubLObject var229) {
        if (NIL != constant_handles_oc.f8449(var229)) {
            return f34745(var229);
        }
        if (NIL != module0167.f10813(var229)) {
            return module0035.f2272(Sequences.remove_if(Symbols.symbol_function((SubLObject)$ic83$), Mapping.mapcar((SubLObject)$ic84$, module0172.f10915(var229)), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED));
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f34737(final SubLObject var2) {
        return module0035.sublisp_boolean(f34745(var2));
    }
    
    public static SubLObject f34747(final SubLObject var2) {
        return (SubLObject)makeBoolean(NIL != constant_handles_oc.f8449(var2) && NIL == f34745(var2));
    }
    
    public static SubLObject f34748(final SubLObject var246) {
        final SubLThread var247 = SubLProcess.currentSubLThread();
        if ($g4104$.getDynamicValue(var247).isHashtable()) {
            final SubLObject var248 = module0035.f2269(module0035.f2399(var246, (SubLObject)$ic85$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
            final SubLObject var249 = Sequences.remove_if(Symbols.symbol_function((SubLObject)$ic83$), Mapping.mapcar((SubLObject)$ic84$, var248), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
            final SubLObject var250 = module0035.f2269(module0035.f2399(var249, (SubLObject)$ic85$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
            final SubLObject var251 = Sort.sort(var250, (SubLObject)$ic86$, (SubLObject)UNPROVIDED);
            return var251;
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f34749(final SubLObject var202) {
        final SubLThread var203 = SubLProcess.currentSubLThread();
        return module0004.f104(var202, $g4112$.getDynamicValue(var203), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f34750(final SubLObject var251, final SubLObject var252) {
        final SubLThread var253 = SubLProcess.currentSubLThread();
        assert NIL != f34749(var251) : var251;
        assert NIL != f34749(var252) : var252;
        return Numbers.numG(Sequences.position(var251, $g4112$.getDynamicValue(var253), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED), Sequences.position(var252, $g4112$.getDynamicValue(var253), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED));
    }
    
    public static SubLObject f34751(final SubLObject var253) {
        final SubLThread var254 = SubLProcess.currentSubLThread();
        if (NIL != module0269.f17716(var253)) {
            return Hashtables.gethash(var253, $g4113$.getDynamicValue(var254), (SubLObject)UNPROVIDED);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f34752() {
        final SubLThread var1 = SubLProcess.currentSubLThread();
        return module0030.f1625($g4113$.getDynamicValue(var1));
    }
    
    public static SubLObject f34753(final SubLObject var202) {
        final SubLThread var203 = SubLProcess.currentSubLThread();
        return module0035.sublisp_boolean(Hashtables.gethash_without_values(var202, $g4113$.getDynamicValue(var203), (SubLObject)NIL));
    }
    
    public static SubLObject f34754() {
        $g4113$.setDynamicValue(Hashtables.make_hash_table((SubLObject)$ic10$, Symbols.symbol_function((SubLObject)EQUAL), (SubLObject)UNPROVIDED));
        return (SubLObject)NIL;
    }
    
    public static SubLObject f34755() {
        final SubLThread var1 = SubLProcess.currentSubLThread();
        f34754();
        final SubLObject var2 = module0147.$g2094$.currentBinding(var1);
        final SubLObject var3 = module0147.$g2095$.currentBinding(var1);
        try {
            module0147.$g2094$.bind((SubLObject)$ic8$, var1);
            module0147.$g2095$.bind($ic9$, var1);
            SubLObject var4 = module0562.f34635();
            SubLObject var5 = (SubLObject)NIL;
            var5 = var4.first();
            while (NIL != var4) {
                final SubLObject var6 = module0562.f34645(var5);
                if (NIL != var6) {
                    final SubLObject var7 = var6;
                    if (NIL == conses_high.member(var7, $g4112$.getDynamicValue(var1), Symbols.symbol_function((SubLObject)EQL), Symbols.symbol_function((SubLObject)IDENTITY))) {
                        $g4112$.setDynamicValue((SubLObject)ConsesLow.cons(var7, $g4112$.getDynamicValue(var1)), var1);
                    }
                    SubLObject var5_255 = module0562.f34692(var6, (SubLObject)UNPROVIDED);
                    SubLObject var8 = (SubLObject)NIL;
                    var8 = var5_255.first();
                    while (NIL != var5_255) {
                        final SubLObject var9 = Hashtables.gethash(var8, $g4113$.getDynamicValue(var1), (SubLObject)UNPROVIDED);
                        final SubLObject var10 = (SubLObject)ConsesLow.cons(var6, var9);
                        Hashtables.sethash(var8, $g4113$.getDynamicValue(var1), var10);
                        var5_255 = var5_255.rest();
                        var8 = var5_255.first();
                    }
                }
                var4 = var4.rest();
                var5 = var4.first();
            }
        }
        finally {
            module0147.$g2095$.rebind(var3, var1);
            module0147.$g2094$.rebind(var2, var1);
        }
        return Hashtables.hash_table_count($g4113$.getDynamicValue(var1));
    }
    
    public static SubLObject f34756() {
        f34755();
        return (SubLObject)NIL;
    }
    
    public static SubLObject f34757(final SubLObject var259) {
        final SubLThread var260 = SubLProcess.currentSubLThread();
        return Hashtables.gethash(var259, $g4114$.getDynamicValue(var260), (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f34758() {
        $g4114$.setDynamicValue(Hashtables.make_hash_table((SubLObject)$ic10$, Symbols.symbol_function((SubLObject)EQ), (SubLObject)UNPROVIDED));
        return (SubLObject)NIL;
    }
    
    public static SubLObject f34759() {
        final SubLThread var1 = SubLProcess.currentSubLThread();
        f34758();
        final SubLObject var2 = module0147.$g2094$.currentBinding(var1);
        final SubLObject var3 = module0147.$g2095$.currentBinding(var1);
        try {
            module0147.$g2094$.bind((SubLObject)$ic8$, var1);
            module0147.$g2095$.bind($ic9$, var1);
            SubLObject var4 = module0562.f34635();
            SubLObject var5 = (SubLObject)NIL;
            var5 = var4.first();
            while (NIL != var4) {
                final SubLObject var6 = module0562.f34645(var5);
                final SubLObject var7 = module0562.f34646(var5);
                if (NIL != var7) {
                    final SubLObject var8 = var7;
                    if (NIL != module0158.f10038(var8)) {
                        final SubLObject var9 = (SubLObject)NIL;
                        final SubLObject var18_261 = module0012.$g73$.currentBinding(var1);
                        final SubLObject var19_262 = module0012.$g65$.currentBinding(var1);
                        final SubLObject var10 = module0012.$g67$.currentBinding(var1);
                        final SubLObject var11 = module0012.$g68$.currentBinding(var1);
                        final SubLObject var12 = module0012.$g66$.currentBinding(var1);
                        final SubLObject var13 = module0012.$g69$.currentBinding(var1);
                        final SubLObject var14 = module0012.$g70$.currentBinding(var1);
                        final SubLObject var15 = module0012.$silent_progressP$.currentBinding(var1);
                        try {
                            module0012.$g73$.bind(Time.get_universal_time(), var1);
                            module0012.$g65$.bind(module0012.$g73$.getDynamicValue(var1), var1);
                            module0012.$g67$.bind((SubLObject)ONE_INTEGER, var1);
                            module0012.$g68$.bind((SubLObject)ZERO_INTEGER, var1);
                            module0012.$g66$.bind((SubLObject)ZERO_INTEGER, var1);
                            module0012.$g69$.bind((SubLObject)ZERO_INTEGER, var1);
                            module0012.$g70$.bind((SubLObject)T, var1);
                            module0012.$silent_progressP$.bind((SubLObject)((NIL != var9) ? module0012.$silent_progressP$.getDynamicValue(var1) : T), var1);
                            module0012.f474(var9);
                            final SubLObject var16 = module0158.f10039(var8);
                            SubLObject var17 = (SubLObject)NIL;
                            final SubLObject var18 = (SubLObject)NIL;
                            while (NIL == var17) {
                                final SubLObject var19 = module0052.f3695(var16, var18);
                                final SubLObject var20 = (SubLObject)makeBoolean(!var18.eql(var19));
                                if (NIL != var20) {
                                    module0012.f476();
                                    SubLObject var21 = (SubLObject)NIL;
                                    try {
                                        var21 = module0158.f10316(var19, (SubLObject)$ic31$, (SubLObject)NIL, (SubLObject)NIL);
                                        SubLObject var176_263 = (SubLObject)NIL;
                                        final SubLObject var177_264 = (SubLObject)NIL;
                                        while (NIL == var176_263) {
                                            final SubLObject var22 = module0052.f3695(var21, var177_264);
                                            final SubLObject var179_266 = (SubLObject)makeBoolean(!var177_264.eql(var22));
                                            if (NIL != var179_266) {
                                                final SubLObject var23 = module0178.f11334(var22);
                                                final SubLObject var24 = Hashtables.gethash(var23, $g4114$.getDynamicValue(var1), (SubLObject)UNPROVIDED);
                                                final SubLObject var25 = (SubLObject)ConsesLow.cons(var6, var24);
                                                Hashtables.sethash(var23, $g4114$.getDynamicValue(var1), var25);
                                            }
                                            var176_263 = (SubLObject)makeBoolean(NIL == var179_266);
                                        }
                                    }
                                    finally {
                                        final SubLObject var18_262 = Threads.$is_thread_performing_cleanupP$.currentBinding(var1);
                                        try {
                                            Threads.$is_thread_performing_cleanupP$.bind((SubLObject)T, var1);
                                            if (NIL != var21) {
                                                module0158.f10319(var21);
                                            }
                                        }
                                        finally {
                                            Threads.$is_thread_performing_cleanupP$.rebind(var18_262, var1);
                                        }
                                    }
                                }
                                var17 = (SubLObject)makeBoolean(NIL == var20);
                            }
                            module0012.f475();
                        }
                        finally {
                            module0012.$silent_progressP$.rebind(var15, var1);
                            module0012.$g70$.rebind(var14, var1);
                            module0012.$g69$.rebind(var13, var1);
                            module0012.$g66$.rebind(var12, var1);
                            module0012.$g68$.rebind(var11, var1);
                            module0012.$g67$.rebind(var10, var1);
                            module0012.$g65$.rebind(var19_262, var1);
                            module0012.$g73$.rebind(var18_261, var1);
                        }
                    }
                }
                var4 = var4.rest();
                var5 = var4.first();
            }
        }
        finally {
            module0147.$g2095$.rebind(var3, var1);
            module0147.$g2094$.rebind(var2, var1);
        }
        return Hashtables.hash_table_count($g4114$.getDynamicValue(var1));
    }
    
    public static SubLObject f34760() {
        f34759();
        return (SubLObject)NIL;
    }
    
    public static SubLObject f34761() {
        final SubLThread var1 = SubLProcess.currentSubLThread();
        return $g4115$.getDynamicValue(var1);
    }
    
    public static SubLObject f34742(final SubLObject var217) {
        final SubLThread var218 = SubLProcess.currentSubLThread();
        return module0031.f1688(var217, $g4115$.getDynamicValue(var218));
    }
    
    public static SubLObject f34762(final SubLObject var217) {
        SubLObject var218 = (SubLObject)NIL;
        var218 = (SubLObject)ConsesLow.cons((SubLObject)$ic77$, var218);
        return Sequences.nreverse(var218);
    }
    
    public static SubLObject f34763(final SubLObject var217) {
        return (SubLObject)makeBoolean(NIL != assertion_handles_oc.f11035(var217) && NIL == f34742(var217));
    }
    
    public static SubLObject f34764(final SubLObject var217) {
        if (NIL != assertion_handles_oc.f11035(var217)) {
            final SubLObject var218 = module0178.f11287(var217);
            final SubLObject var219 = module0178.f11282(var217);
            SubLObject var220 = (SubLObject)NIL;
            if (NIL != f34734(var218)) {
                var220 = (SubLObject)ConsesLow.cons((SubLObject)$ic88$, var220);
                SubLObject var221 = f34735(var218);
                SubLObject var222 = (SubLObject)NIL;
                var222 = var221.first();
                while (NIL != var221) {
                    var220 = (SubLObject)ConsesLow.cons(var222, var220);
                    var221 = var221.rest();
                    var222 = var221.first();
                }
            }
            else if (NIL != module0004.f104(var217, module0562.f34649(module0562.f34635().first()), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)) {
                var220 = (SubLObject)ConsesLow.cons((SubLObject)$ic89$, var220);
            }
            else {
                final SubLObject var223 = module0035.f2272(module0035.f2259(Symbols.symbol_function((SubLObject)$ic80$), var219, (SubLObject)UNPROVIDED));
                if (NIL != var223) {
                    var220 = (SubLObject)ConsesLow.cons((SubLObject)$ic90$, var220);
                    SubLObject var224 = var223;
                    SubLObject var225 = (SubLObject)NIL;
                    var225 = var224.first();
                    while (NIL != var224) {
                        SubLObject var5_272 = f34735(var225);
                        SubLObject var226 = (SubLObject)NIL;
                        var226 = var5_272.first();
                        while (NIL != var5_272) {
                            var220 = (SubLObject)ConsesLow.cons(var226, var220);
                            var5_272 = var5_272.rest();
                            var226 = var5_272.first();
                        }
                        var224 = var224.rest();
                        var225 = var224.first();
                    }
                }
                else if (NIL != module0178.f11284(var217)) {
                    final SubLObject var227 = module0178.f11332(var217);
                    final SubLObject var228 = f34751(var227);
                    final SubLObject var229 = f34748(var219);
                    if (NIL == module0035.f2206(var229, var228, (SubLObject)UNPROVIDED)) {
                        var220 = (SubLObject)ConsesLow.cons((SubLObject)$ic91$, var220);
                        if (NIL != var228) {
                            var220 = (SubLObject)ConsesLow.cons((SubLObject)$ic92$, var220);
                            SubLObject var230 = var228;
                            SubLObject var231 = (SubLObject)NIL;
                            var231 = var230.first();
                            while (NIL != var230) {
                                var220 = (SubLObject)ConsesLow.cons(module0191.f11990((SubLObject)$ic0$, module0202.f12768($ic4$, var227, var231), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED), var220);
                                var230 = var230.rest();
                                var231 = var230.first();
                            }
                        }
                        else {
                            var220 = (SubLObject)ConsesLow.cons((SubLObject)$ic93$, var220);
                        }
                        var220 = (SubLObject)ConsesLow.cons((SubLObject)$ic94$, var220);
                        SubLObject var230 = var229;
                        SubLObject var232 = (SubLObject)NIL;
                        var232 = var230.first();
                        while (NIL != var230) {
                            var220 = (SubLObject)ConsesLow.cons(var232, var220);
                            var230 = var230.rest();
                            var232 = var230.first();
                        }
                    }
                }
                else {
                    final SubLObject var233 = f34748(var219);
                    var220 = (SubLObject)ConsesLow.cons((SubLObject)$ic95$, var220);
                    SubLObject var234 = var233;
                    SubLObject var235 = (SubLObject)NIL;
                    var235 = var234.first();
                    while (NIL != var234) {
                        var220 = (SubLObject)ConsesLow.cons(var235, var220);
                        var234 = var234.rest();
                        var235 = var234.first();
                    }
                }
            }
            return Sequences.nreverse(var220);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f34765(final SubLObject var277) {
        final SubLThread var278 = SubLProcess.currentSubLThread();
        $g4115$.setDynamicValue((SubLObject)NIL, var278);
        $g4115$.setDynamicValue(module0076.f5288(var277, Symbols.symbol_function((SubLObject)EQ), (SubLObject)UNPROVIDED), var278);
        return module0031.f1670($g4115$.getDynamicValue(var278));
    }
    
    public static SubLObject f34766(final SubLObject var217) {
        final SubLThread var218 = SubLProcess.currentSubLThread();
        return module0031.f1690(var217, $g4115$.getDynamicValue(var218));
    }
    
    public static SubLObject f34743(final SubLObject var217) {
        final SubLThread var218 = SubLProcess.currentSubLThread();
        return module0031.f1691(var217, $g4115$.getDynamicValue(var218));
    }
    
    public static SubLObject f34767() {
        final SubLThread var1 = SubLProcess.currentSubLThread();
        SubLObject var2 = (SubLObject)NIL;
        final SubLObject var3 = assertion_handles_oc.f11010();
        final SubLObject var4 = (SubLObject)$ic96$;
        final SubLObject var5 = module0065.f4733(var3);
        SubLObject var6 = (SubLObject)ZERO_INTEGER;
        assert NIL != Types.stringp(var4) : var4;
        final SubLObject var7 = module0012.$g75$.currentBinding(var1);
        final SubLObject var8 = module0012.$g76$.currentBinding(var1);
        final SubLObject var9 = module0012.$g77$.currentBinding(var1);
        final SubLObject var10 = module0012.$g78$.currentBinding(var1);
        try {
            module0012.$g75$.bind((SubLObject)ZERO_INTEGER, var1);
            module0012.$g76$.bind((SubLObject)NIL, var1);
            module0012.$g77$.bind((SubLObject)T, var1);
            module0012.$g78$.bind(Time.get_universal_time(), var1);
            module0012.f478(var4);
            final SubLObject var124_279 = var3;
            if (NIL == module0065.f4772(var124_279, (SubLObject)$ic29$)) {
                final SubLObject var126_280 = var124_279;
                if (NIL == module0065.f4775(var126_280, (SubLObject)$ic29$)) {
                    final SubLObject var11 = module0065.f4740(var126_280);
                    final SubLObject var12 = (SubLObject)NIL;
                    SubLObject var13;
                    SubLObject var14;
                    SubLObject var15;
                    SubLObject var16;
                    for (var13 = Sequences.length(var11), var14 = (SubLObject)NIL, var14 = (SubLObject)ZERO_INTEGER; var14.numL(var13); var14 = Numbers.add(var14, (SubLObject)ONE_INTEGER)) {
                        var15 = ((NIL != var12) ? Numbers.subtract(var13, var14, (SubLObject)ONE_INTEGER) : var14);
                        var16 = Vectors.aref(var11, var15);
                        if (NIL == module0065.f4749(var16) || NIL == module0065.f4773((SubLObject)$ic29$)) {
                            if (NIL != module0065.f4749(var16)) {
                                var16 = (SubLObject)$ic29$;
                            }
                            module0012.note_percent_progress(var6, var5);
                            var6 = Numbers.add(var6, (SubLObject)ONE_INTEGER);
                            if (NIL != f34768(var16)) {
                                var2 = (SubLObject)ConsesLow.cons(var16, var2);
                            }
                        }
                    }
                }
                final SubLObject var129_281 = var124_279;
                if (NIL == module0065.f4777(var129_281) || NIL == module0065.f4773((SubLObject)$ic29$)) {
                    final SubLObject var17 = module0065.f4738(var129_281);
                    SubLObject var18 = module0065.f4739(var129_281);
                    final SubLObject var19 = module0065.f4734(var129_281);
                    final SubLObject var20 = (SubLObject)((NIL != module0065.f4773((SubLObject)$ic29$)) ? NIL : $ic29$);
                    while (var18.numL(var19)) {
                        final SubLObject var21 = Hashtables.gethash_without_values(var18, var17, var20);
                        if (NIL == module0065.f4773((SubLObject)$ic29$) || NIL == module0065.f4749(var21)) {
                            module0012.note_percent_progress(var6, var5);
                            var6 = Numbers.add(var6, (SubLObject)ONE_INTEGER);
                            if (NIL != f34768(var21)) {
                                var2 = (SubLObject)ConsesLow.cons(var21, var2);
                            }
                        }
                        var18 = Numbers.add(var18, (SubLObject)ONE_INTEGER);
                    }
                }
            }
            module0012.f479();
        }
        finally {
            module0012.$g78$.rebind(var10, var1);
            module0012.$g77$.rebind(var9, var1);
            module0012.$g76$.rebind(var8, var1);
            module0012.$g75$.rebind(var7, var1);
        }
        f34765(var2);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f34768(final SubLObject var217) {
        final SubLThread var218 = SubLProcess.currentSubLThread();
        SubLObject var219 = (SubLObject)NIL;
        final SubLObject var220 = module0147.$g2094$.currentBinding(var218);
        final SubLObject var221 = module0147.$g2095$.currentBinding(var218);
        try {
            module0147.$g2094$.bind((SubLObject)$ic8$, var218);
            module0147.$g2095$.bind($ic9$, var218);
            if (NIL != assertion_handles_oc.f11035(var217)) {
                if (NIL == f34769(var217) && NIL == f34770(var217)) {
                    var219 = (SubLObject)T;
                }
                if (NIL != module0178.f11284(var217) && (NIL != module0260.f17099(module0178.f11332(var217), module0562.f34652(module0562.f34635().first()), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED) || NIL != module0260.f17101(module0178.f11332(var217), module0562.f34652(module0562.f34635().first()), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)) && NIL == module0004.f104(var217, module0562.f34651(module0562.f34635().first()), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)) {
                    var219 = (SubLObject)NIL;
                }
                if (NIL != var219 && NIL != module0004.f104(var217, module0562.f34649(module0562.f34635().first()), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)) {
                    var219 = (SubLObject)NIL;
                }
            }
        }
        finally {
            module0147.$g2095$.rebind(var221, var218);
            module0147.$g2094$.rebind(var220, var218);
        }
        return var219;
    }
    
    public static SubLObject f34771(final SubLObject var217) {
        return (SubLObject)makeBoolean(NIL != assertion_handles_oc.f11035(var217) && NIL == f34768(var217));
    }
    
    public static SubLObject f34769(final SubLObject var217) {
        final SubLObject var218 = module0178.f11287(var217);
        final SubLObject var219 = module0178.f11282(var217);
        return (SubLObject)makeBoolean(NIL != f34734(var218) || NIL != module0035.f2439(Symbols.symbol_function((SubLObject)$ic80$), var219, (SubLObject)UNPROVIDED) || NIL != ((NIL != module0173.f10955(var218)) ? f34734(var218) : module0035.f2439(Symbols.symbol_function((SubLObject)$ic80$), var218, (SubLObject)UNPROVIDED)) || NIL != module0035.f2439(Symbols.symbol_function((SubLObject)$ic97$), var219, (SubLObject)UNPROVIDED));
    }
    
    public static SubLObject f34770(final SubLObject var217) {
        final SubLThread var218 = SubLProcess.currentSubLThread();
        if (NIL != module0030.f1594($g4104$.getDynamicValue(var218))) {
            return (SubLObject)NIL;
        }
        final SubLObject var219 = module0178.f11287(var217);
        final SubLObject var220 = module0178.f11282(var217);
        if (NIL == module0035.f2439((SubLObject)$ic82$, var220, (SubLObject)UNPROVIDED)) {
            return (SubLObject)NIL;
        }
        final SubLObject var221 = f34748(var220);
        if (NIL != module0178.f11290(var217)) {
            final SubLObject var222 = f34757(var217);
            return (SubLObject)makeBoolean(NIL == module0035.f2206(var221, var222, (SubLObject)UNPROVIDED));
        }
        final SubLObject var223 = module0178.f11332(var217);
        final SubLObject var224 = f34751(var223);
        return (SubLObject)makeBoolean(NIL == module0035.f2206(var221, var224, (SubLObject)UNPROVIDED));
    }
    
    public static SubLObject f34772(final SubLObject var284) {
        final SubLThread var285 = SubLProcess.currentSubLThread();
        return module0031.f1688(var284, $g4116$.getDynamicValue(var285));
    }
    
    public static SubLObject f34773(final SubLObject var284) {
        return (SubLObject)makeBoolean(NIL != deduction_handles_oc.f11659(var284) && NIL == f34772(var284));
    }
    
    public static SubLObject f34774(final SubLObject var285) {
        final SubLThread var286 = SubLProcess.currentSubLThread();
        $g4116$.setDynamicValue((SubLObject)NIL, var286);
        $g4116$.setDynamicValue(module0076.f5288(var285, Symbols.symbol_function((SubLObject)EQ), (SubLObject)UNPROVIDED), var286);
        return module0031.f1670($g4116$.getDynamicValue(var286));
    }
    
    public static SubLObject f34775() {
        final SubLThread var1 = SubLProcess.currentSubLThread();
        SubLObject var2 = (SubLObject)NIL;
        final SubLObject var3 = module0076.f5287(f34761());
        module0012.$g82$.setDynamicValue((SubLObject)$ic98$, var1);
        module0012.$g73$.setDynamicValue(Time.get_universal_time(), var1);
        module0012.$g83$.setDynamicValue(Sequences.length(var3), var1);
        module0012.$g84$.setDynamicValue((SubLObject)ZERO_INTEGER, var1);
        final SubLObject var4 = module0012.$g75$.currentBinding(var1);
        final SubLObject var5 = module0012.$g76$.currentBinding(var1);
        final SubLObject var6 = module0012.$g77$.currentBinding(var1);
        final SubLObject var7 = module0012.$g78$.currentBinding(var1);
        try {
            module0012.$g75$.bind((SubLObject)ZERO_INTEGER, var1);
            module0012.$g76$.bind((SubLObject)NIL, var1);
            module0012.$g77$.bind((SubLObject)T, var1);
            module0012.$g78$.bind(Time.get_universal_time(), var1);
            module0012.f478(module0012.$g82$.getDynamicValue(var1));
            SubLObject var8 = var3;
            SubLObject var9 = (SubLObject)NIL;
            var9 = var8.first();
            while (NIL != var8) {
                module0012.note_percent_progress(module0012.$g84$.getDynamicValue(var1), module0012.$g83$.getDynamicValue(var1));
                module0012.$g84$.setDynamicValue(Numbers.add(module0012.$g84$.getDynamicValue(var1), (SubLObject)ONE_INTEGER), var1);
                SubLObject var10 = module0178.f11299(var9);
                SubLObject var11 = (SubLObject)NIL;
                var11 = var10.first();
                while (NIL != var10) {
                    if (NIL != f34776(var11)) {
                        var2 = (SubLObject)ConsesLow.cons(var11, var2);
                    }
                    var10 = var10.rest();
                    var11 = var10.first();
                }
                var8 = var8.rest();
                var9 = var8.first();
            }
            module0012.f479();
        }
        finally {
            module0012.$g78$.rebind(var7, var1);
            module0012.$g77$.rebind(var6, var1);
            module0012.$g76$.rebind(var5, var1);
            module0012.$g75$.rebind(var4, var1);
        }
        f34774(var2);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f34776(final SubLObject var284) {
        SubLObject var285 = (SubLObject)NIL;
        if (NIL != deduction_handles_oc.f11659(var284) && NIL != f34742(module0188.f11781(var284))) {
            SubLObject var286;
            SubLObject var287;
            SubLObject var288;
            for (var286 = (SubLObject)NIL, var287 = (SubLObject)NIL, var287 = module0188.f11770(var284); NIL == var286 && NIL != var287; var286 = (SubLObject)makeBoolean(NIL == f34777(var288)), var287 = var287.rest()) {
                var288 = var287.first();
            }
            var285 = (SubLObject)makeBoolean(NIL == var286);
        }
        return var285;
    }
    
    public static SubLObject f34777(final SubLObject var230) {
        if (NIL != module0191.f11950(var230)) {
            if (NIL != assertion_handles_oc.f11035(var230)) {
                return f34742(var230);
            }
            final SubLObject var231 = module0191.f11976(var230);
            if (NIL == f34734(var231) && NIL == f34707(var231)) {
                final SubLObject var232 = module0191.f11969(var230);
                if (NIL == module0035.f2439(Symbols.symbol_function((SubLObject)$ic80$), var232, (SubLObject)UNPROVIDED) && NIL == module0035.f2439(Symbols.symbol_function((SubLObject)$ic99$), var232, (SubLObject)UNPROVIDED)) {
                    return (SubLObject)T;
                }
            }
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f34778() {
        final SubLThread var1 = SubLProcess.currentSubLThread();
        return $g4117$.getDynamicValue(var1);
    }
    
    public static SubLObject f34779(SubLObject var289) {
        if (var289 == UNPROVIDED) {
            var289 = (SubLObject)NIL;
        }
        final SubLThread var290 = SubLProcess.currentSubLThread();
        SubLObject var292;
        final SubLObject var291 = var292 = module0562.f34637();
        SubLObject var293 = (SubLObject)NIL;
        var293 = var292.first();
        while (NIL != var292) {
            if (NIL != module0173.f10955(var293)) {
                final SubLObject var294 = var293;
                final SubLObject var295 = module0147.$g2094$.currentBinding(var290);
                final SubLObject var296 = module0147.$g2095$.currentBinding(var290);
                try {
                    module0147.$g2094$.bind((SubLObject)$ic8$, var290);
                    module0147.$g2095$.bind($ic9$, var290);
                    final SubLObject var297 = var294;
                    if (NIL != module0158.f10038(var297)) {
                        final SubLObject var298 = (SubLObject)NIL;
                        final SubLObject var18_292 = module0012.$g73$.currentBinding(var290);
                        final SubLObject var19_293 = module0012.$g65$.currentBinding(var290);
                        final SubLObject var299 = module0012.$g67$.currentBinding(var290);
                        final SubLObject var300 = module0012.$g68$.currentBinding(var290);
                        final SubLObject var301 = module0012.$g66$.currentBinding(var290);
                        final SubLObject var302 = module0012.$g69$.currentBinding(var290);
                        final SubLObject var303 = module0012.$g70$.currentBinding(var290);
                        final SubLObject var304 = module0012.$silent_progressP$.currentBinding(var290);
                        try {
                            module0012.$g73$.bind(Time.get_universal_time(), var290);
                            module0012.$g65$.bind(module0012.$g73$.getDynamicValue(var290), var290);
                            module0012.$g67$.bind((SubLObject)ONE_INTEGER, var290);
                            module0012.$g68$.bind((SubLObject)ZERO_INTEGER, var290);
                            module0012.$g66$.bind((SubLObject)ZERO_INTEGER, var290);
                            module0012.$g69$.bind((SubLObject)ZERO_INTEGER, var290);
                            module0012.$g70$.bind((SubLObject)T, var290);
                            module0012.$silent_progressP$.bind((SubLObject)((NIL != var298) ? module0012.$silent_progressP$.getDynamicValue(var290) : T), var290);
                            module0012.f474(var298);
                            final SubLObject var305 = module0158.f10039(var297);
                            SubLObject var306 = (SubLObject)NIL;
                            final SubLObject var307 = (SubLObject)NIL;
                            while (NIL == var306) {
                                final SubLObject var308 = module0052.f3695(var305, var307);
                                final SubLObject var309 = (SubLObject)makeBoolean(!var307.eql(var308));
                                if (NIL != var309) {
                                    module0012.f476();
                                    SubLObject var310 = (SubLObject)NIL;
                                    try {
                                        var310 = module0158.f10316(var308, (SubLObject)$ic31$, (SubLObject)NIL, (SubLObject)NIL);
                                        SubLObject var176_294 = (SubLObject)NIL;
                                        final SubLObject var177_295 = (SubLObject)NIL;
                                        while (NIL == var176_294) {
                                            final SubLObject var311 = module0052.f3695(var310, var177_295);
                                            final SubLObject var179_297 = (SubLObject)makeBoolean(!var177_295.eql(var311));
                                            if (NIL != var179_297) {
                                                final SubLObject var312 = module0178.f11334(var311);
                                                f34780(var312, var294);
                                            }
                                            var176_294 = (SubLObject)makeBoolean(NIL == var179_297);
                                        }
                                    }
                                    finally {
                                        final SubLObject var18_293 = Threads.$is_thread_performing_cleanupP$.currentBinding(var290);
                                        try {
                                            Threads.$is_thread_performing_cleanupP$.bind((SubLObject)T, var290);
                                            if (NIL != var310) {
                                                module0158.f10319(var310);
                                            }
                                        }
                                        finally {
                                            Threads.$is_thread_performing_cleanupP$.rebind(var18_293, var290);
                                        }
                                    }
                                }
                                var306 = (SubLObject)makeBoolean(NIL == var309);
                            }
                            module0012.f475();
                        }
                        finally {
                            module0012.$silent_progressP$.rebind(var304, var290);
                            module0012.$g70$.rebind(var303, var290);
                            module0012.$g69$.rebind(var302, var290);
                            module0012.$g66$.rebind(var301, var290);
                            module0012.$g68$.rebind(var300, var290);
                            module0012.$g67$.rebind(var299, var290);
                            module0012.$g65$.rebind(var19_293, var290);
                            module0012.$g73$.rebind(var18_292, var290);
                        }
                    }
                }
                finally {
                    module0147.$g2095$.rebind(var296, var290);
                    module0147.$g2094$.rebind(var295, var290);
                }
            }
            else if (NIL != module0202.f12895(var293)) {
                final SubLObject var313 = var293;
                if (NIL == Errors.$ignore_mustsP$.getDynamicValue(var290) && !ONE_INTEGER.numE(module0202.f12897(var313))) {
                    Errors.error((SubLObject)$ic101$, var313);
                }
                final SubLObject var314 = f34781(var313);
                if (NIL == var314) {
                    Errors.warn((SubLObject)$ic102$, var313);
                }
                else {
                    Errors.warn((SubLObject)$ic103$, var313);
                    final SubLObject var315 = var314;
                    module0012.$g82$.setDynamicValue(Sequences.cconcatenate((SubLObject)$ic104$, new SubLObject[] { module0006.f203(Sequences.length(var314)), $ic105$ }), var290);
                    module0012.$g73$.setDynamicValue(Time.get_universal_time(), var290);
                    module0012.$g83$.setDynamicValue(Sequences.length(var315), var290);
                    module0012.$g84$.setDynamicValue((SubLObject)ZERO_INTEGER, var290);
                    final SubLObject var316 = module0012.$g75$.currentBinding(var290);
                    final SubLObject var317 = module0012.$g76$.currentBinding(var290);
                    final SubLObject var318 = module0012.$g77$.currentBinding(var290);
                    final SubLObject var319 = module0012.$g78$.currentBinding(var290);
                    try {
                        module0012.$g75$.bind((SubLObject)ZERO_INTEGER, var290);
                        module0012.$g76$.bind((SubLObject)NIL, var290);
                        module0012.$g77$.bind((SubLObject)T, var290);
                        module0012.$g78$.bind(Time.get_universal_time(), var290);
                        module0012.f478(module0012.$g82$.getDynamicValue(var290));
                        SubLObject var320 = var315;
                        SubLObject var321 = (SubLObject)NIL;
                        var321 = var320.first();
                        while (NIL != var320) {
                            module0012.note_percent_progress(module0012.$g84$.getDynamicValue(var290), module0012.$g83$.getDynamicValue(var290));
                            module0012.$g84$.setDynamicValue(Numbers.add(module0012.$g84$.getDynamicValue(var290), (SubLObject)ONE_INTEGER), var290);
                            f34780(var321, (SubLObject)UNPROVIDED);
                            var320 = var320.rest();
                            var321 = var320.first();
                        }
                        module0012.f479();
                    }
                    finally {
                        module0012.$g78$.rebind(var319, var290);
                        module0012.$g77$.rebind(var318, var290);
                        module0012.$g76$.rebind(var317, var290);
                        module0012.$g75$.rebind(var316, var290);
                    }
                    Errors.warn((SubLObject)$ic106$, var313);
                }
            }
            else {
                Errors.error((SubLObject)$ic107$, var293);
            }
            var292 = var292.rest();
            var293 = var292.first();
        }
        if (NIL == var289) {
            f34782();
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f34781(final SubLObject var299) {
        final SubLThread var300 = SubLProcess.currentSubLThread();
        final SubLObject var301 = module0202.f12898(var299);
        final SubLObject var302 = module0202.f12896(var299).first();
        final SubLObject var303 = module0434.f30578(var302, var301, $ic2$, $g4119$.getDynamicValue(var300));
        return var303;
    }
    
    public static SubLObject f34780(final SubLObject var243, SubLObject var303) {
        if (var303 == UNPROVIDED) {
            var303 = (SubLObject)NIL;
        }
        if (NIL != assertion_handles_oc.f11035(var243)) {
            Errors.warn((SubLObject)$ic108$, (SubLObject)((NIL != module0173.f10955(var303)) ? var303 : $ic109$), var243);
            module0540.f33518(module0290.f19497(var243), module0178.f11287(var243));
        }
        return var243;
    }
    
    public static SubLObject f34782() {
        SubLObject var5 = module0562.f34636();
        SubLObject var6 = (SubLObject)NIL;
        var6 = var5.first();
        while (NIL != var5) {
            if (var6.isFunctionSpec()) {
                module0006.f218((SubLObject)T, (SubLObject)$ic110$, var6, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                Functions.funcall(var6);
            }
            var5 = var5.rest();
            var6 = var5.first();
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f34783() {
        f34784();
        f34779((SubLObject)T);
        f34785();
        f34786();
        f34787();
        $g4117$.setDynamicValue((SubLObject)T);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f34785() {
        final SubLThread var1 = SubLProcess.currentSubLThread();
        f34784();
        SubLObject var2 = module0139.f9019((SubLObject)TEN_INTEGER);
        final SubLObject var3 = module0139.$g1632$.currentBinding(var1);
        final SubLObject var4 = module0139.$g1630$.currentBinding(var1);
        final SubLObject var5 = module0139.$g1631$.currentBinding(var1);
        try {
            module0139.$g1632$.bind(var2, var1);
            module0139.$g1630$.bind((SubLObject)T, var1);
            module0139.$g1631$.bind(module0139.f9023(module0139.$g1632$.getDynamicValue(var1)), var1);
            f34726();
            f34744();
            f34756();
            f34760();
            var2 = module0139.$g1632$.getDynamicValue(var1);
        }
        finally {
            module0139.$g1631$.rebind(var5, var1);
            module0139.$g1630$.rebind(var4, var1);
            module0139.$g1632$.rebind(var3, var1);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f34788() {
        SubLObject var5 = module0562.f34638();
        SubLObject var6 = (SubLObject)NIL;
        var6 = var5.first();
        while (NIL != var5) {
            if (var6.isFunctionSpec()) {
                module0006.f218((SubLObject)T, (SubLObject)$ic111$, var6, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                Functions.funcall(var6);
            }
            var5 = var5.rest();
            var6 = var5.first();
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f34786() {
        final SubLThread var1 = SubLProcess.currentSubLThread();
        SubLObject var2 = module0139.f9019((SubLObject)TEN_INTEGER);
        final SubLObject var3 = module0139.$g1632$.currentBinding(var1);
        final SubLObject var4 = module0139.$g1630$.currentBinding(var1);
        final SubLObject var5 = module0139.$g1631$.currentBinding(var1);
        try {
            module0139.$g1632$.bind(var2, var1);
            module0139.$g1630$.bind((SubLObject)T, var1);
            module0139.$g1631$.bind(module0139.f9023(module0139.$g1632$.getDynamicValue(var1)), var1);
            f34767();
            var2 = module0139.$g1632$.getDynamicValue(var1);
        }
        finally {
            module0139.$g1631$.rebind(var5, var1);
            module0139.$g1630$.rebind(var4, var1);
            module0139.$g1632$.rebind(var3, var1);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f34789() {
        SubLObject var5 = module0562.f34639();
        SubLObject var6 = (SubLObject)NIL;
        var6 = var5.first();
        while (NIL != var5) {
            if (var6.isFunctionSpec()) {
                module0006.f218((SubLObject)T, (SubLObject)$ic112$, var6, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                Functions.funcall(var6);
            }
            var5 = var5.rest();
            var6 = var5.first();
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f34787() {
        final SubLThread var1 = SubLProcess.currentSubLThread();
        SubLObject var2 = module0139.f9019((SubLObject)TEN_INTEGER);
        final SubLObject var3 = module0139.$g1632$.currentBinding(var1);
        final SubLObject var4 = module0139.$g1630$.currentBinding(var1);
        final SubLObject var5 = module0139.$g1631$.currentBinding(var1);
        try {
            module0139.$g1632$.bind(var2, var1);
            module0139.$g1630$.bind((SubLObject)T, var1);
            module0139.$g1631$.bind(module0139.f9023(module0139.$g1632$.getDynamicValue(var1)), var1);
            f34775();
            var2 = module0139.$g1632$.getDynamicValue(var1);
        }
        finally {
            module0139.$g1631$.rebind(var5, var1);
            module0139.$g1630$.rebind(var4, var1);
            module0139.$g1632$.rebind(var3, var1);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f34784() {
        $g4117$.setDynamicValue((SubLObject)NIL);
        $g4101$.setDynamicValue((SubLObject)NIL);
        $g4102$.setDynamicValue((SubLObject)NIL);
        $g4103$.setDynamicValue((SubLObject)NIL);
        $g4106$.setDynamicValue((SubLObject)NIL);
        $g4107$.setDynamicValue((SubLObject)NIL);
        $g4108$.setDynamicValue((SubLObject)NIL);
        $g4109$.setDynamicValue((SubLObject)NIL);
        $g4110$.setDynamicValue((SubLObject)NIL);
        $g4111$.setDynamicValue((SubLObject)NIL);
        $g4104$.setDynamicValue((SubLObject)NIL);
        $g4113$.setDynamicValue((SubLObject)NIL);
        $g4115$.setDynamicValue((SubLObject)NIL);
        $g4116$.setDynamicValue((SubLObject)NIL);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f34790() {
        final SubLThread var1 = SubLProcess.currentSubLThread();
        if (NIL == $g4101$.getDynamicValue(var1)) {
            Errors.warn((SubLObject)$ic113$);
        }
        if (!$g4102$.getDynamicValue(var1).isHashtable()) {
            Errors.warn((SubLObject)$ic114$);
        }
        if (!$g4103$.getDynamicValue(var1).isHashtable()) {
            Errors.warn((SubLObject)$ic115$);
        }
        if (NIL == $g4106$.getDynamicValue(var1)) {
            Errors.warn((SubLObject)$ic116$);
        }
        if (NIL == $g4107$.getDynamicValue(var1)) {
            Errors.warn((SubLObject)$ic117$);
        }
        if (NIL == module0031.f1646($g4108$.getDynamicValue(var1))) {
            Errors.warn((SubLObject)$ic118$);
        }
        if (NIL == $g4109$.getDynamicValue(var1)) {
            Errors.warn((SubLObject)$ic119$);
        }
        if (NIL == $g4110$.getDynamicValue(var1)) {
            Errors.warn((SubLObject)$ic120$);
        }
        if (NIL == module0031.f1646($g4111$.getDynamicValue(var1))) {
            Errors.warn((SubLObject)$ic121$);
        }
        if (!$g4104$.getDynamicValue(var1).isHashtable()) {
            Errors.warn((SubLObject)$ic122$);
        }
        if (!$g4113$.getDynamicValue(var1).isHashtable()) {
            Errors.warn((SubLObject)$ic123$);
        }
        if (NIL == module0031.f1646($g4115$.getDynamicValue(var1))) {
            Errors.warn((SubLObject)$ic124$);
        }
        if (NIL == module0031.f1646($g4116$.getDynamicValue(var1))) {
            Errors.warn((SubLObject)$ic125$);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f34791(SubLObject var308) {
        if (var308 == UNPROVIDED) {
            var308 = StreamsLow.$standard_output$.getDynamicValue();
        }
        final SubLObject var309 = f34792();
        final SubLObject var310 = f34793();
        final SubLObject var311 = f34794();
        final SubLObject var312 = f34795();
        final SubLObject var313 = f34796();
        final SubLObject var314 = f34797();
        PrintLow.format(var308, (SubLObject)$ic126$, module0018.f971());
        PrintLow.format(var308, (SubLObject)$ic127$, var309);
        PrintLow.format(var308, (SubLObject)$ic128$, var310);
        if (var314.isPositive()) {
            PrintLow.format(var308, (SubLObject)$ic129$, var314);
        }
        PrintLow.format(var308, (SubLObject)$ic130$, var311);
        PrintLow.format(var308, (SubLObject)$ic131$, var312);
        PrintLow.format(var308, (SubLObject)$ic132$, var313);
        streams_high.terpri(var308);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f34792() {
        final SubLThread var1 = SubLProcess.currentSubLThread();
        if (NIL != $g4111$.getDynamicValue(var1)) {
            return module0031.f1670($g4111$.getDynamicValue(var1));
        }
        return (SubLObject)ZERO_INTEGER;
    }
    
    public static SubLObject f34793() {
        final SubLThread var1 = SubLProcess.currentSubLThread();
        if (NIL != $g4108$.getDynamicValue(var1)) {
            return module0031.f1670($g4108$.getDynamicValue(var1));
        }
        return (SubLObject)ZERO_INTEGER;
    }
    
    public static SubLObject f34794() {
        return Numbers.subtract(f34792(), f34793());
    }
    
    public static SubLObject f34797() {
        final SubLThread var1 = SubLProcess.currentSubLThread();
        if (NIL != $g4104$.getDynamicValue(var1)) {
            return Hashtables.hash_table_count($g4104$.getDynamicValue(var1));
        }
        return (SubLObject)ZERO_INTEGER;
    }
    
    public static SubLObject f34795() {
        final SubLThread var1 = SubLProcess.currentSubLThread();
        if (NIL != $g4115$.getDynamicValue(var1)) {
            return module0031.f1670($g4115$.getDynamicValue(var1));
        }
        return (SubLObject)ZERO_INTEGER;
    }
    
    public static SubLObject f34796() {
        final SubLThread var1 = SubLProcess.currentSubLThread();
        if (NIL != $g4116$.getDynamicValue(var1)) {
            return module0031.f1670($g4116$.getDynamicValue(var1));
        }
        return (SubLObject)ZERO_INTEGER;
    }
    
    public static SubLObject f34798(final SubLObject var233, SubLObject var313) {
        if (var313 == UNPROVIDED) {
            var313 = (SubLObject)NIL;
        }
        final SubLThread var314 = SubLProcess.currentSubLThread();
        assert NIL != module0269.f17732(var233, (SubLObject)UNPROVIDED) : var233;
        if (NIL == f34778()) {
            Errors.warn((SubLObject)$ic134$);
            return (SubLObject)NIL;
        }
        SubLObject var315 = (SubLObject)ZERO_INTEGER;
        final SubLObject var316 = module0158.f10289(module0228.f15229(var233));
        if (var316.eql((SubLObject)$ic135$)) {
            if (NIL != module0158.f10270(module0228.f15229(var233), var313)) {
                final SubLObject var317 = module0158.f10271(module0228.f15229(var233));
                SubLObject var318 = (SubLObject)NIL;
                try {
                    var318 = module0158.f10316(var317, var313, (SubLObject)NIL, (SubLObject)NIL);
                    SubLObject var319 = (SubLObject)NIL;
                    final SubLObject var320 = (SubLObject)NIL;
                    while (NIL == var319) {
                        final SubLObject var321 = module0052.f3695(var318, var320);
                        final SubLObject var322 = (SubLObject)makeBoolean(!var320.eql(var321));
                        if (NIL != var322 && NIL != f34742(var321)) {
                            var315 = Numbers.add(var315, (SubLObject)ONE_INTEGER);
                        }
                        var319 = (SubLObject)makeBoolean(NIL == var322);
                    }
                }
                finally {
                    final SubLObject var323 = Threads.$is_thread_performing_cleanupP$.currentBinding(var314);
                    try {
                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)T, var314);
                        if (NIL != var318) {
                            module0158.f10319(var318);
                        }
                    }
                    finally {
                        Threads.$is_thread_performing_cleanupP$.rebind(var323, var314);
                    }
                }
            }
        }
        else if (var316.eql((SubLObject)$ic136$) && NIL != module0158.f10286(module0228.f15229(var233), var313)) {
            final SubLObject var324 = assertion_handles_oc.f11010();
            final SubLObject var325 = (SubLObject)$ic137$;
            final SubLObject var326 = module0065.f4733(var324);
            SubLObject var327 = (SubLObject)ZERO_INTEGER;
            assert NIL != Types.stringp(var325) : var325;
            final SubLObject var328 = module0012.$g75$.currentBinding(var314);
            final SubLObject var329 = module0012.$g76$.currentBinding(var314);
            final SubLObject var330 = module0012.$g77$.currentBinding(var314);
            final SubLObject var331 = module0012.$g78$.currentBinding(var314);
            try {
                module0012.$g75$.bind((SubLObject)ZERO_INTEGER, var314);
                module0012.$g76$.bind((SubLObject)NIL, var314);
                module0012.$g77$.bind((SubLObject)T, var314);
                module0012.$g78$.bind(Time.get_universal_time(), var314);
                module0012.f478(var325);
                final SubLObject var124_316 = var324;
                if (NIL == module0065.f4772(var124_316, (SubLObject)$ic29$)) {
                    final SubLObject var126_317 = var124_316;
                    if (NIL == module0065.f4775(var126_317, (SubLObject)$ic29$)) {
                        final SubLObject var332 = module0065.f4740(var126_317);
                        final SubLObject var333 = (SubLObject)NIL;
                        SubLObject var334;
                        SubLObject var335;
                        SubLObject var336;
                        SubLObject var337;
                        for (var334 = Sequences.length(var332), var335 = (SubLObject)NIL, var335 = (SubLObject)ZERO_INTEGER; var335.numL(var334); var335 = Numbers.add(var335, (SubLObject)ONE_INTEGER)) {
                            var336 = ((NIL != var333) ? Numbers.subtract(var334, var335, (SubLObject)ONE_INTEGER) : var335);
                            var337 = Vectors.aref(var332, var336);
                            if (NIL == module0065.f4749(var337) || NIL == module0065.f4773((SubLObject)$ic29$)) {
                                if (NIL != module0065.f4749(var337)) {
                                    var337 = (SubLObject)$ic29$;
                                }
                                module0012.note_percent_progress(var327, var326);
                                var327 = Numbers.add(var327, (SubLObject)ONE_INTEGER);
                                if (NIL != module0158.f10287(var337, module0228.f15229(var233), var313, (SubLObject)NIL) && NIL != f34742(var337)) {
                                    var315 = Numbers.add(var315, (SubLObject)ONE_INTEGER);
                                }
                            }
                        }
                    }
                    final SubLObject var129_318 = var124_316;
                    if (NIL == module0065.f4777(var129_318) || NIL == module0065.f4773((SubLObject)$ic29$)) {
                        final SubLObject var338 = module0065.f4738(var129_318);
                        SubLObject var339 = module0065.f4739(var129_318);
                        final SubLObject var340 = module0065.f4734(var129_318);
                        final SubLObject var341 = (SubLObject)((NIL != module0065.f4773((SubLObject)$ic29$)) ? NIL : $ic29$);
                        while (var339.numL(var340)) {
                            final SubLObject var342 = Hashtables.gethash_without_values(var339, var338, var341);
                            if (NIL == module0065.f4773((SubLObject)$ic29$) || NIL == module0065.f4749(var342)) {
                                module0012.note_percent_progress(var327, var326);
                                var327 = Numbers.add(var327, (SubLObject)ONE_INTEGER);
                                if (NIL != module0158.f10287(var342, module0228.f15229(var233), var313, (SubLObject)NIL) && NIL != f34742(var342)) {
                                    var315 = Numbers.add(var315, (SubLObject)ONE_INTEGER);
                                }
                            }
                            var339 = Numbers.add(var339, (SubLObject)ONE_INTEGER);
                        }
                    }
                }
                module0012.f479();
            }
            finally {
                module0012.$g78$.rebind(var331, var314);
                module0012.$g77$.rebind(var330, var314);
                module0012.$g76$.rebind(var329, var314);
                module0012.$g75$.rebind(var328, var314);
            }
        }
        return var315;
    }
    
    public static SubLObject f34799() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0563", "f34702", "S#38074", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0563", "f34703", "S#38075", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0563", "f34704", "S#38076", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0563", "f34705", "S#38077", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0563", "f34706", "S#38078", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0563", "f34707", "S#38079", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0563", "f34708", "S#38080", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0563", "f34709", "S#38081", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0563", "f34710", "S#38082", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0563", "f34711", "S#38083", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0563", "f34713", "S#38084", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0563", "f34714", "S#38085", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0563", "f34715", "S#38086", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0563", "f34712", "S#38087", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0563", "f34716", "S#38088", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0563", "f34717", "S#38089", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0563", "f34718", "S#38090", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0563", "f34719", "S#38091", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0563", "f34720", "S#38092", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0563", "f34721", "S#38093", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0563", "f34722", "S#38094", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0563", "f34723", "S#37977", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0563", "f34724", "S#38095", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0563", "f34725", "S#38096", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0563", "f34726", "S#38097", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0563", "f34727", "S#38098", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0563", "f34728", "S#38099", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0563", "f34729", "S#38100", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0563", "f34730", "S#38101", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0563", "f34731", "S#37943", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0563", "f34732", "S#37969", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0563", "f34733", "S#38102", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0563", "f34734", "S#38103", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0563", "f34735", "S#38104", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0563", "f34736", "S#38105", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0563", "f34738", "S#38106", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0563", "f34739", "S#38107", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0563", "f34740", "S#37974", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0563", "f34741", "S#37971", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0563", "f34744", "S#38108", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0563", "f34745", "S#38109", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0563", "f34746", "S#38110", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0563", "f34737", "S#38111", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0563", "f34747", "S#38112", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0563", "f34748", "S#38113", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0563", "f34749", "S#38114", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0563", "f34750", "S#38115", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0563", "f34751", "S#38116", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0563", "f34752", "S#38117", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0563", "f34753", "S#38118", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0563", "f34754", "S#38119", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0563", "f34755", "S#38120", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0563", "f34756", "S#38121", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0563", "f34757", "S#38122", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0563", "f34758", "S#38123", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0563", "f34759", "S#38124", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0563", "f34760", "S#38125", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0563", "f34761", "S#37975", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0563", "f34742", "S#37970", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0563", "f34762", "S#38126", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0563", "f34763", "S#38127", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0563", "f34764", "S#38128", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0563", "f34765", "S#38129", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0563", "f34766", "S#37978", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0563", "f34743", "S#37976", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0563", "f34767", "S#38130", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0563", "f34768", "S#38131", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0563", "f34771", "S#38132", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0563", "f34769", "S#38133", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0563", "f34770", "S#38134", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0563", "f34772", "S#38135", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0563", "f34773", "S#38136", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0563", "f34774", "S#38137", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0563", "f34775", "S#38138", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0563", "f34776", "S#38139", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0563", "f34777", "S#38140", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0563", "f34778", "S#38141", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0563", "f34779", "S#37942", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0563", "f34781", "S#38142", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0563", "f34780", "S#38143", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0563", "f34782", "S#38144", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0563", "f34783", "S#38145", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0563", "f34785", "S#37944", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0563", "f34788", "S#37945", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0563", "f34786", "S#37947", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0563", "f34789", "S#37948", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0563", "f34787", "S#37949", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0563", "f34784", "S#37941", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0563", "f34790", "S#38146", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0563", "f34791", "S#38147", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0563", "f34792", "S#37972", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0563", "f34793", "S#38148", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0563", "f34794", "S#38149", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0563", "f34797", "S#38150", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0563", "f34795", "S#38151", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0563", "f34796", "S#38152", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0563", "f34798", "S#38153", 1, 1, false);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f34800() {
        $g4101$ = SubLFiles.defvar("S#38154", (SubLObject)NIL);
        $g4102$ = SubLFiles.defvar("S#38155", (SubLObject)NIL);
        $g4103$ = SubLFiles.defvar("S#38156", (SubLObject)NIL);
        $g4104$ = SubLFiles.defvar("S#38157", (SubLObject)NIL);
        $g4105$ = SubLFiles.deflexical("S#38158", (SubLObject)NIL);
        $g4106$ = SubLFiles.defvar("S#38159", (SubLObject)NIL);
        $g4107$ = SubLFiles.defvar("S#38160", (SubLObject)NIL);
        $g4108$ = SubLFiles.defvar("S#38161", Hashtables.make_hash_table((SubLObject)$ic10$, Symbols.symbol_function((SubLObject)EQ), (SubLObject)UNPROVIDED));
        $g4109$ = SubLFiles.defvar("S#38162", (SubLObject)NIL);
        $g4110$ = SubLFiles.defvar("S#38163", (SubLObject)NIL);
        $g4111$ = SubLFiles.defvar("S#38164", (SubLObject)NIL);
        $g4112$ = SubLFiles.defvar("S#38165", (SubLObject)NIL);
        $g4113$ = SubLFiles.defvar("S#38166", (SubLObject)NIL);
        $g4114$ = SubLFiles.defvar("S#38167", (SubLObject)NIL);
        $g4115$ = SubLFiles.defvar("S#38168", (SubLObject)NIL);
        $g4116$ = SubLFiles.defvar("S#38169", (SubLObject)NIL);
        $g4117$ = SubLFiles.defvar("S#38170", (SubLObject)NIL);
        $g4118$ = SubLFiles.deflexical("S#38171", (SubLObject)$ic100$);
        $g4119$ = SubLFiles.defparameter("S#38172", $g4118$.getGlobalValue());
        return (SubLObject)NIL;
    }
    
    public static SubLObject f34801() {
        module0034.f1909((SubLObject)$ic46$);
        return (SubLObject)NIL;
    }
    
    public void declareFunctions() {
        f34799();
    }
    
    public void initializeVariables() {
        f34800();
    }
    
    public void runTopLevelForms() {
        f34801();
    }
    
    static {
        me = (SubLFile)new module0563();
        $g4101$ = null;
        $g4102$ = null;
        $g4103$ = null;
        $g4104$ = null;
        $g4105$ = null;
        $g4106$ = null;
        $g4107$ = null;
        $g4108$ = null;
        $g4109$ = null;
        $g4110$ = null;
        $g4111$ = null;
        $g4112$ = null;
        $g4113$ = null;
        $g4114$ = null;
        $g4115$ = null;
        $g4116$ = null;
        $g4117$ = null;
        $g4118$ = null;
        $g4119$ = null;
        $ic0$ = makeKeyword("ISA");
        $ic1$ = constant_handles_oc.f8479((SubLObject)makeString("quotedIsa"));
        $ic2$ = constant_handles_oc.f8479((SubLObject)makeString("InferencePSC"));
        $ic3$ = makeString("Even though explicitly included via:");
        $ic4$ = constant_handles_oc.f8479((SubLObject)makeString("isa"));
        $ic5$ = makeString("The constant is also excluded because:");
        $ic6$ = constant_handles_oc.f8479((SubLObject)makeString("not"));
        $ic7$ = makeSymbol("S#38077", "CYC");
        $ic8$ = makeSymbol("S#12274", "CYC");
        $ic9$ = constant_handles_oc.f8479((SubLObject)makeString("EverythingPSC"));
        $ic10$ = makeInteger(1000);
        $ic11$ = makeKeyword("BREADTH");
        $ic12$ = makeKeyword("QUEUE");
        $ic13$ = makeKeyword("STACK");
        $ic14$ = makeSymbol("S#11450", "CYC");
        $ic15$ = makeKeyword("ERROR");
        $ic16$ = makeString("~A is not a ~A");
        $ic17$ = makeSymbol("S#11592", "CYC");
        $ic18$ = makeKeyword("CERROR");
        $ic19$ = makeString("continue anyway");
        $ic20$ = makeKeyword("WARN");
        $ic21$ = makeString("~A is not a valid *sbhl-type-error-action* value");
        $ic22$ = makeString("~A is neither SET-P nor LISTP.");
        $ic23$ = makeString("attempting to bind direction link variable, to NIL. macro body not executed.");
        $ic24$ = ConsesLow.list((SubLObject)makeUninternedSymbol("US#4D5E436"), (SubLObject)makeUninternedSymbol("US#1526883"), (SubLObject)makeUninternedSymbol("US#15AA083"));
        $ic25$ = makeString("Node ~a does not pass sbhl-type-test ~a~%");
        $ic26$ = makeSymbol("CONSTANT-P");
        $ic27$ = makeString("mapping Cyc constants");
        $ic28$ = makeSymbol("STRINGP");
        $ic29$ = makeKeyword("SKIP");
        $ic30$ = constant_handles_oc.f8479((SubLObject)makeString("CycLConstant"));
        $ic31$ = makeKeyword("GAF");
        $ic32$ = makeString("Overriding constant ~A omission (~S) due to #$kbsProfileRetainTerm");
        $ic33$ = constant_handles_oc.f8479((SubLObject)makeString("kbsProfileRetainTerm"));
        $ic34$ = constant_handles_oc.f8479((SubLObject)makeString("kbsProfileRemoveFORT"));
        $ic35$ = makeString("~&~S constants included via the collections : ~S~%");
        $ic36$ = makeString("~&~S constants omitted via the ~A ~A: ~A ~A~%");
        $ic37$ = makeString("collections ");
        $ic38$ = makeString("");
        $ic39$ = makeString("/predicate ");
        $ic40$ = makeString("~&~S total constants included.~%");
        $ic41$ = makeString("~&~S total constants omitted.~%");
        $ic42$ = makeString("~&Omitted constants: ");
        $ic43$ = makeString("~A ");
        $ic44$ = makeString("~%");
        $ic45$ = makeString(" ~&~S total raw KBS constants identified.~%");
        $ic46$ = makeSymbol("S#38087", "CYC");
        $ic47$ = constant_handles_oc.f8479((SubLObject)makeString("TheSetOf"));
        $ic48$ = makeSymbol("?Q");
        $ic49$ = constant_handles_oc.f8479((SubLObject)makeString("thereExists"));
        $ic50$ = makeSymbol("?T");
        $ic51$ = constant_handles_oc.f8479((SubLObject)makeString("and"));
        $ic52$ = ConsesLow.list((SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("testQuery")), (SubLObject)makeSymbol("?T"), (SubLObject)makeSymbol("?Q")));
        $ic53$ = makeInteger(300);
        $ic54$ = makeSymbol("S#38158", "CYC");
        $ic55$ = makeKeyword("&MEMOIZED-ITEM-NOT-FOUND&");
        $ic56$ = makeString("Invalid attempt to reuse memoization state in multiple threads simultaneously.");
        $ic57$ = makeString("Continue");
        $ic58$ = makeString("compute-kbs-skolems requirements not met.");
        $ic59$ = constant_handles_oc.f8479((SubLObject)makeString("SkolemFunction"));
        $ic60$ = makeString("Computing KBS skolems");
        $ic61$ = makeString(" ~&~S total KBS skolems identified.");
        $ic62$ = makeSymbol("S#38093", "CYC");
        $ic63$ = makeString("akb");
        $ic64$ = constant_handles_oc.f8479((SubLObject)makeString("TKBTerm-Proprietary"));
        $ic65$ = constant_handles_oc.f8479((SubLObject)makeString("ProprietaryTerm"));
        $ic66$ = makeString("cyfi");
        $ic67$ = constant_handles_oc.f8479((SubLObject)makeString("Cy-FiProprietaryTerm"));
        $ic68$ = constant_handles_oc.f8479((SubLObject)makeString("ResearchCycConstant"));
        $ic69$ = constant_handles_oc.f8479((SubLObject)makeString("ScaffoldingConstant"));
        $ic70$ = constant_handles_oc.f8479((SubLObject)makeString("TerroristAgent"));
        $ic71$ = constant_handles_oc.f8479((SubLObject)makeString("TerroristAct"));
        $ic72$ = constant_handles_oc.f8479((SubLObject)makeString("HostileSocialAction"));
        $ic73$ = makeString("research");
        $ic74$ = makeSymbol("S#38095", "CYC");
        $ic75$ = makeString("Computing KBS narts");
        $ic76$ = makeString(" ~&~S total KBS NARTs identified.~%");
        $ic77$ = makeString("All KB subset requirements met.");
        $ic78$ = makeString("Also, the following GAFs will be spliced in:");
        $ic79$ = makeKeyword("OPAQUE");
        $ic80$ = makeSymbol("S#38103", "CYC");
        $ic81$ = makeString("The term contains terms not in the KB subset:");
        $ic82$ = makeSymbol("S#38105", "CYC");
        $ic83$ = makeSymbol("NULL");
        $ic84$ = makeSymbol("S#38110", "CYC");
        $ic85$ = makeSymbol("FORT-P");
        $ic86$ = makeSymbol("S#38115", "CYC");
        $ic87$ = makeSymbol("S#38114", "CYC");
        $ic88$ = makeString("The assertion's microtheory is not in the KB subset:");
        $ic89$ = makeString("The assertion was explicitly omitted via #$kbsProfileRemoveAssertion");
        $ic90$ = makeString("The assertion's formula contains FORTs not in the KB subset:");
        $ic91$ = makeString("The assertion is definitional because:");
        $ic92$ = makeString("- The predicate is definitional:");
        $ic93$ = makeString("- The predicate is not definitional.");
        $ic94$ = makeString("- But the assertion contains definitional terms for the KBS sections with the predicate sets:");
        $ic95$ = makeString("The assertion is a rule containing definitional FORTs:");
        $ic96$ = makeString("Computing KBS assertions");
        $ic97$ = makeSymbol("S#38132", "CYC");
        $ic98$ = makeString("Computing KBS deductions");
        $ic99$ = makeSymbol("S#38079", "CYC");
        $ic100$ = ConsesLow.list(new SubLObject[] { makeKeyword("CONTINUABLE?"), NIL, makeKeyword("MAX-NUMBER"), NIL, makeKeyword("COMPUTE-ANSWER-JUSTIFICATIONS?"), NIL, makeKeyword("INFERENCE-MODE"), makeKeyword("MINIMAL"), makeKeyword("RESULT-UNIQUENESS"), makeKeyword("BINDINGS"), makeKeyword("PRODUCTIVITY-LIMIT"), makeKeyword("POSITIVE-INFINITY"), makeKeyword("MAX-PROBLEM-COUNT"), makeKeyword("POSITIVE-INFINITY"), makeKeyword("ANSWER-LANGUAGE"), makeKeyword("HL") });
        $ic101$ = makeString("Only unary KAPPA predicates supported, not ~A.");
        $ic102$ = makeString(":PREREMOVED-ASSERTIONS specification ~A picked out no assertions.~%");
        $ic103$ = makeString("Applying :PREREMOVED-ASSERTIONS specification ~A .....~%");
        $ic104$ = makeString("Preremoving ");
        $ic105$ = makeString(" assertions");
        $ic106$ = makeString("Finished applying ~A.~%");
        $ic107$ = makeString("Invalid pre-removal specification ~A.");
        $ic108$ = makeString("Killing ~A assertion for KB subset: ~A~%");
        $ic109$ = makeString("an");
        $ic110$ = makeString("prerun: Calling ~A~%");
        $ic111$ = makeString("post-kbs-forts: Calling ~A.~%");
        $ic112$ = makeString("post-kbs-assertions: Calling ~A~%");
        $ic113$ = makeString("*kbs-raw-constants* is null.");
        $ic114$ = makeString("*kbs-raw-constants-table* is null.");
        $ic115$ = makeString("*kbs-raw-constants-omission-table* is null.");
        $ic116$ = makeString("*kbs-skolems* is null.");
        $ic117$ = makeString("*kbs-constants* is null.");
        $ic118$ = makeString("*kbs-constant-table* is null.");
        $ic119$ = makeString("*kbs-narts* is null.");
        $ic120$ = makeString("*kbs-forts* is null.");
        $ic121$ = makeString("*kbs-fort-table* is null.");
        $ic122$ = makeString("*kbs-definitional-constant-table* is null.");
        $ic123$ = makeString("*kbs-definitional-predicate-table* is null.");
        $ic124$ = makeString("*kbs-assertion-table* is null.");
        $ic125$ = makeString("*kbs-deduction-table* is null.");
        $ic126$ = makeString("~&;;; KB ~S KBS statistics~%");
        $ic127$ = makeString("~&FORTs        : ~7,' D~%");
        $ic128$ = makeString("~& Constants   : ~7,' D~%");
        $ic129$ = makeString("~&  (def only) : ~7,' D~%");
        $ic130$ = makeString("~& NARTs       : ~7,' D~%");
        $ic131$ = makeString("~&Assertions   : ~7,' D~%");
        $ic132$ = makeString("~&Deductions   : ~7,' D~%");
        $ic133$ = makeSymbol("S#18501", "CYC");
        $ic134$ = makeString("No valid KBS available!");
        $ic135$ = makeKeyword("MT");
        $ic136$ = makeKeyword("BROAD-MT");
        $ic137$ = makeString("do-broad-mt-index");
    }
}

/*
	DECOMPILATION REPORT

	Decompiled from: G:\opt\CYC_JRTL_with_CommonLisp\platform\lib\cyc-oc4.0-unzipped/com/cyc/cycjava/cycl/class
	Total time: 5698 ms
	
	Decompiled with Procyon 0.5.32.
*/