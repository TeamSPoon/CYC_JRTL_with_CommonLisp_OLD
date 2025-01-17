package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Vectors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Time;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class module0566 extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.module0566";
    public static final String myFingerPrint = "89c1808003801a3723dded26027942a24d517e424f24cd751badf370e066450a";
    private static SubLSymbol $g4133$;
    private static SubLSymbol $g4134$;
    private static SubLSymbol $g4135$;
    private static SubLSymbol $g4136$;
    private static final SubLList $ic0$;
    private static final SubLString $ic1$;
    private static final SubLString $ic2$;
    private static final SubLSymbol $ic3$;
    private static final SubLSymbol $ic4$;
    private static final SubLObject $ic5$;
    private static final SubLObject $ic6$;
    private static final SubLObject $ic7$;
    private static final SubLString $ic8$;
    private static final SubLString $ic9$;
    private static final SubLSymbol $ic10$;
    private static final SubLString $ic11$;
    private static final SubLSymbol $ic12$;
    private static final SubLSymbol $ic13$;
    private static final SubLSymbol $ic14$;
    private static final SubLString $ic15$;
    private static final SubLObject $ic16$;
    private static final SubLString $ic17$;
    private static final SubLSymbol $ic18$;
    private static final SubLObject $ic19$;
    private static final SubLObject $ic20$;
    private static final SubLString $ic21$;
    private static final SubLObject $ic22$;
    private static final SubLString $ic23$;
    private static final SubLObject $ic24$;
    private static final SubLString $ic25$;
    private static final SubLString $ic26$;
    private static final SubLObject $ic27$;
    private static final SubLString $ic28$;
    private static final SubLList $ic29$;
    private static final SubLString $ic30$;
    private static final SubLString $ic31$;
    private static final SubLString $ic32$;
    private static final SubLString $ic33$;
    private static final SubLString $ic34$;
    private static final SubLSymbol $ic35$;
    private static final SubLSymbol $ic36$;
    private static final SubLSymbol $ic37$;
    private static final SubLString $ic38$;
    private static final SubLString $ic39$;
    private static final SubLObject $ic40$;
    private static final SubLSymbol $ic41$;
    private static final SubLSymbol $ic42$;
    private static final SubLSymbol $ic43$;
    private static final SubLSymbol $ic44$;
    private static final SubLSymbol $ic45$;
    private static final SubLString $ic46$;
    private static final SubLSymbol $ic47$;
    private static final SubLSymbol $ic48$;
    private static final SubLString $ic49$;
    private static final SubLSymbol $ic50$;
    private static final SubLString $ic51$;
    private static final SubLString $ic52$;
    private static final SubLString $ic53$;
    private static final SubLString $ic54$;
    private static final SubLString $ic55$;
    private static final SubLList $ic56$;
    private static final SubLString $ic57$;
    private static final SubLString $ic58$;
    private static final SubLString $ic59$;
    private static final SubLSymbol $ic60$;
    private static final SubLList $ic61$;
    private static final SubLSymbol $ic62$;
    
    public static SubLObject f34860() {
        f34861();
        f34862();
        f34863();
        f34864();
        f34865();
        f34866();
        f34867();
        module0305.f20520();
        module0305.f20616();
        module0287.f19238((SubLObject)T, (SubLObject)NIL);
        f34868();
        if ($ic1$.equal(module0562.f34634())) {
            f34869();
        }
        f34870();
        return (SubLObject)NIL;
    }
    
    public static SubLObject f34870() {
        final SubLThread var1 = SubLProcess.currentSubLThread();
        SubLObject var2 = (SubLObject)ZERO_INTEGER;
        final SubLObject var3 = constant_handles_oc.f8425();
        final SubLObject var4 = (SubLObject)$ic2$;
        final SubLObject var5_6 = module0065.f4733(var3);
        SubLObject var5 = (SubLObject)ZERO_INTEGER;
        assert NIL != Types.stringp(var4) : var4;
        final SubLObject var6 = module0012.$g75$.currentBinding(var1);
        final SubLObject var7 = module0012.$g76$.currentBinding(var1);
        final SubLObject var8 = module0012.$g77$.currentBinding(var1);
        final SubLObject var9 = module0012.$g78$.currentBinding(var1);
        try {
            module0012.$g75$.bind((SubLObject)ZERO_INTEGER, var1);
            module0012.$g76$.bind((SubLObject)NIL, var1);
            module0012.$g77$.bind((SubLObject)T, var1);
            module0012.$g78$.bind(Time.get_universal_time(), var1);
            module0012.f478(var4);
            final SubLObject var12_13 = var3;
            if (NIL == module0065.f4772(var12_13, (SubLObject)$ic4$)) {
                final SubLObject var14_15 = var12_13;
                if (NIL == module0065.f4775(var14_15, (SubLObject)$ic4$)) {
                    final SubLObject var10 = module0065.f4740(var14_15);
                    final SubLObject var11 = (SubLObject)NIL;
                    SubLObject var12;
                    SubLObject var13;
                    SubLObject var14;
                    SubLObject var15;
                    SubLObject var16;
                    SubLObject var17;
                    for (var12 = Sequences.length(var10), var13 = (SubLObject)NIL, var13 = (SubLObject)ZERO_INTEGER; var13.numL(var12); var13 = Numbers.add(var13, (SubLObject)ONE_INTEGER)) {
                        var14 = ((NIL != var11) ? Numbers.subtract(var12, var13, (SubLObject)ONE_INTEGER) : var13);
                        var15 = Vectors.aref(var10, var14);
                        if (NIL == module0065.f4749(var15) || NIL == module0065.f4773((SubLObject)$ic4$)) {
                            if (NIL != module0065.f4749(var15)) {
                                var15 = (SubLObject)$ic4$;
                            }
                            module0012.note_percent_progress(var5, var5_6);
                            var5 = Numbers.add(var5, (SubLObject)ONE_INTEGER);
                            var16 = module0617.f37871(var15, (SubLObject)UNPROVIDED);
                            if (NIL != var16 && NIL != module0173.f10971(var16) && NIL != module0617.f37818($ic5$, var15, var16, $ic6$)) {
                                var2 = Numbers.add(var2, (SubLObject)ONE_INTEGER);
                            }
                            var17 = module0617.f37874(var15, (SubLObject)UNPROVIDED);
                            if (NIL != var17 && NIL != module0173.f10971(var17) && NIL != module0617.f37818($ic7$, var15, var17, $ic6$)) {
                                var2 = Numbers.add(var2, (SubLObject)ONE_INTEGER);
                            }
                        }
                    }
                }
                final SubLObject var24_25 = var12_13;
                if (NIL == module0065.f4777(var24_25) || NIL == module0065.f4773((SubLObject)$ic4$)) {
                    final SubLObject var18 = module0065.f4738(var24_25);
                    SubLObject var19 = module0065.f4739(var24_25);
                    final SubLObject var20 = module0065.f4734(var24_25);
                    final SubLObject var21 = (SubLObject)((NIL != module0065.f4773((SubLObject)$ic4$)) ? NIL : $ic4$);
                    while (var19.numL(var20)) {
                        final SubLObject var22 = Hashtables.gethash_without_values(var19, var18, var21);
                        if (NIL == module0065.f4773((SubLObject)$ic4$) || NIL == module0065.f4749(var22)) {
                            module0012.note_percent_progress(var5, var5_6);
                            var5 = Numbers.add(var5, (SubLObject)ONE_INTEGER);
                            final SubLObject var23 = module0617.f37871(var22, (SubLObject)UNPROVIDED);
                            if (NIL != var23 && NIL != module0173.f10971(var23) && NIL != module0617.f37818($ic5$, var22, var23, $ic6$)) {
                                var2 = Numbers.add(var2, (SubLObject)ONE_INTEGER);
                            }
                            final SubLObject var24 = module0617.f37874(var22, (SubLObject)UNPROVIDED);
                            if (NIL != var24 && NIL != module0173.f10971(var24) && NIL != module0617.f37818($ic7$, var22, var24, $ic6$)) {
                                var2 = Numbers.add(var2, (SubLObject)ONE_INTEGER);
                            }
                        }
                        var19 = Numbers.add(var19, (SubLObject)ONE_INTEGER);
                    }
                }
            }
            module0012.f479();
        }
        finally {
            module0012.$g78$.rebind(var9, var1);
            module0012.$g77$.rebind(var8, var1);
            module0012.$g76$.rebind(var7, var1);
            module0012.$g75$.rebind(var6, var1);
        }
        return var2;
    }
    
    public static SubLObject f34861() {
        final SubLThread var1 = SubLProcess.currentSubLThread();
        final SubLObject var2 = module0131.$g1531$.currentBinding(var1);
        final SubLObject var3 = Errors.$continue_cerrorP$.currentBinding(var1);
        try {
            module0131.$g1531$.bind((SubLObject)NIL, var1);
            Errors.$continue_cerrorP$.bind((SubLObject)T, var1);
            final SubLObject var4 = deduction_handles_oc.f11634();
            final SubLObject var5 = (SubLObject)$ic8$;
            final SubLObject var6 = module0065.f4733(var4);
            SubLObject var7 = (SubLObject)ZERO_INTEGER;
            assert NIL != Types.stringp(var5) : var5;
            final SubLObject var8_29 = module0012.$g75$.currentBinding(var1);
            final SubLObject var9_30 = module0012.$g76$.currentBinding(var1);
            final SubLObject var8 = module0012.$g77$.currentBinding(var1);
            final SubLObject var9 = module0012.$g78$.currentBinding(var1);
            try {
                module0012.$g75$.bind((SubLObject)ZERO_INTEGER, var1);
                module0012.$g76$.bind((SubLObject)NIL, var1);
                module0012.$g77$.bind((SubLObject)T, var1);
                module0012.$g78$.bind(Time.get_universal_time(), var1);
                module0012.f478(var5);
                final SubLObject var12_31 = var4;
                if (NIL == module0065.f4772(var12_31, (SubLObject)$ic4$)) {
                    final SubLObject var14_32 = var12_31;
                    if (NIL == module0065.f4775(var14_32, (SubLObject)$ic4$)) {
                        final SubLObject var10 = module0065.f4740(var14_32);
                        final SubLObject var11 = (SubLObject)NIL;
                        SubLObject var12;
                        SubLObject var13;
                        SubLObject var14;
                        SubLObject var15;
                        for (var12 = Sequences.length(var10), var13 = (SubLObject)NIL, var13 = (SubLObject)ZERO_INTEGER; var13.numL(var12); var13 = Numbers.add(var13, (SubLObject)ONE_INTEGER)) {
                            var14 = ((NIL != var11) ? Numbers.subtract(var12, var13, (SubLObject)ONE_INTEGER) : var13);
                            var15 = Vectors.aref(var10, var14);
                            if (NIL == module0065.f4749(var15) || NIL == module0065.f4773((SubLObject)$ic4$)) {
                                if (NIL != module0065.f4749(var15)) {
                                    var15 = (SubLObject)$ic4$;
                                }
                                module0012.note_percent_progress(var7, var6);
                                var7 = Numbers.add(var7, (SubLObject)ONE_INTEGER);
                                if (NIL == deduction_handles_oc.f11665(var15, (SubLObject)T)) {
                                    if (NIL != $g4134$.getDynamicValue(var1)) {
                                        Errors.warn((SubLObject)$ic9$, deduction_handles_oc.f11649(var15));
                                    }
                                    f34871(var15);
                                }
                            }
                        }
                    }
                    final SubLObject var24_34 = var12_31;
                    if (NIL == module0065.f4777(var24_34) || NIL == module0065.f4773((SubLObject)$ic4$)) {
                        final SubLObject var16 = module0065.f4738(var24_34);
                        SubLObject var17 = module0065.f4739(var24_34);
                        final SubLObject var18 = module0065.f4734(var24_34);
                        final SubLObject var19 = (SubLObject)((NIL != module0065.f4773((SubLObject)$ic4$)) ? NIL : $ic4$);
                        while (var17.numL(var18)) {
                            final SubLObject var20 = Hashtables.gethash_without_values(var17, var16, var19);
                            if (NIL == module0065.f4773((SubLObject)$ic4$) || NIL == module0065.f4749(var20)) {
                                module0012.note_percent_progress(var7, var6);
                                var7 = Numbers.add(var7, (SubLObject)ONE_INTEGER);
                                if (NIL == deduction_handles_oc.f11665(var20, (SubLObject)T)) {
                                    if (NIL != $g4134$.getDynamicValue(var1)) {
                                        Errors.warn((SubLObject)$ic9$, deduction_handles_oc.f11649(var20));
                                    }
                                    f34871(var20);
                                }
                            }
                            var17 = Numbers.add(var17, (SubLObject)ONE_INTEGER);
                        }
                    }
                }
                module0012.f479();
            }
            finally {
                module0012.$g78$.rebind(var9, var1);
                module0012.$g77$.rebind(var8, var1);
                module0012.$g76$.rebind(var9_30, var1);
                module0012.$g75$.rebind(var8_29, var1);
            }
        }
        finally {
            Errors.$continue_cerrorP$.rebind(var3, var1);
            module0131.$g1531$.rebind(var2, var1);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f34871(final SubLObject var33) {
        assert NIL != deduction_handles_oc.f11659(var33) : var33;
        final SubLObject var34 = module0188.f11781(var33);
        return module0342.f23121(var33, var34, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f34862() {
        final SubLThread var1 = SubLProcess.currentSubLThread();
        SubLObject var2 = $g4133$.getDynamicValue(var1);
        SubLObject var3 = (SubLObject)NIL;
        var3 = var2.first();
        while (NIL != var2) {
            final SubLObject var4 = PrintLow.format((SubLObject)NIL, (SubLObject)$ic11$, var3);
            final SubLObject var5 = module0217.f14247(var3, (SubLObject)UNPROVIDED);
            SubLObject var6 = (SubLObject)ZERO_INTEGER;
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
                final SubLObject var11 = var3;
                if (NIL != module0158.f10038(var11)) {
                    final SubLObject var12 = (SubLObject)NIL;
                    final SubLObject var8_42 = module0012.$g73$.currentBinding(var1);
                    final SubLObject var9_43 = module0012.$g65$.currentBinding(var1);
                    final SubLObject var10_44 = module0012.$g67$.currentBinding(var1);
                    final SubLObject var11_45 = module0012.$g68$.currentBinding(var1);
                    final SubLObject var13 = module0012.$g66$.currentBinding(var1);
                    final SubLObject var14 = module0012.$g69$.currentBinding(var1);
                    final SubLObject var15 = module0012.$g70$.currentBinding(var1);
                    final SubLObject var16 = module0012.$silent_progressP$.currentBinding(var1);
                    try {
                        module0012.$g73$.bind(Time.get_universal_time(), var1);
                        module0012.$g65$.bind(module0012.$g73$.getDynamicValue(var1), var1);
                        module0012.$g67$.bind((SubLObject)ONE_INTEGER, var1);
                        module0012.$g68$.bind((SubLObject)ZERO_INTEGER, var1);
                        module0012.$g66$.bind((SubLObject)ZERO_INTEGER, var1);
                        module0012.$g69$.bind((SubLObject)ZERO_INTEGER, var1);
                        module0012.$g70$.bind((SubLObject)T, var1);
                        module0012.$silent_progressP$.bind((SubLObject)((NIL != var12) ? module0012.$silent_progressP$.getDynamicValue(var1) : T), var1);
                        module0012.f474(var12);
                        final SubLObject var17 = module0158.f10039(var11);
                        SubLObject var18 = (SubLObject)NIL;
                        final SubLObject var19 = (SubLObject)NIL;
                        while (NIL == var18) {
                            final SubLObject var20 = module0052.f3695(var17, var19);
                            final SubLObject var21 = (SubLObject)makeBoolean(!var19.eql(var20));
                            if (NIL != var21) {
                                module0012.f476();
                                SubLObject var22 = (SubLObject)NIL;
                                try {
                                    var22 = module0158.f10316(var20, (SubLObject)$ic12$, (SubLObject)NIL, (SubLObject)NIL);
                                    SubLObject var51_56 = (SubLObject)NIL;
                                    final SubLObject var52_57 = (SubLObject)NIL;
                                    while (NIL == var51_56) {
                                        final SubLObject var23 = module0052.f3695(var22, var52_57);
                                        final SubLObject var54_59 = (SubLObject)makeBoolean(!var52_57.eql(var23));
                                        if (NIL != var54_59) {
                                            var6 = Numbers.add(var6, (SubLObject)ONE_INTEGER);
                                            module0012.note_percent_progress(var6, var5);
                                            SubLObject var24 = (SubLObject)NIL;
                                            try {
                                                var1.throwStack.push($ic13$);
                                                final SubLObject var8_43 = Errors.$error_handler$.currentBinding(var1);
                                                try {
                                                    Errors.$error_handler$.bind(Symbols.symbol_function((SubLObject)$ic14$), var1);
                                                    try {
                                                        module0342.f23126(var23);
                                                    }
                                                    catch (Throwable var25) {
                                                        Errors.handleThrowable(var25, (SubLObject)NIL);
                                                    }
                                                }
                                                finally {
                                                    Errors.$error_handler$.rebind(var8_43, var1);
                                                }
                                            }
                                            catch (Throwable var26) {
                                                var24 = Errors.handleThrowable(var26, (SubLObject)$ic13$);
                                            }
                                            finally {
                                                var1.throwStack.pop();
                                            }
                                        }
                                        var51_56 = (SubLObject)makeBoolean(NIL == var54_59);
                                    }
                                }
                                finally {
                                    final SubLObject var8_44 = Threads.$is_thread_performing_cleanupP$.currentBinding(var1);
                                    try {
                                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)T, var1);
                                        if (NIL != var22) {
                                            module0158.f10319(var22);
                                        }
                                    }
                                    finally {
                                        Threads.$is_thread_performing_cleanupP$.rebind(var8_44, var1);
                                    }
                                }
                            }
                            var18 = (SubLObject)makeBoolean(NIL == var21);
                        }
                        module0012.f475();
                    }
                    finally {
                        module0012.$silent_progressP$.rebind(var16, var1);
                        module0012.$g70$.rebind(var15, var1);
                        module0012.$g69$.rebind(var14, var1);
                        module0012.$g66$.rebind(var13, var1);
                        module0012.$g68$.rebind(var11_45, var1);
                        module0012.$g67$.rebind(var10_44, var1);
                        module0012.$g65$.rebind(var9_43, var1);
                        module0012.$g73$.rebind(var8_42, var1);
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
            var2 = var2.rest();
            var3 = var2.first();
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f34863() {
        final SubLThread var1 = SubLProcess.currentSubLThread();
        final SubLObject var2 = module0131.$g1531$.currentBinding(var1);
        final SubLObject var3 = Errors.$continue_cerrorP$.currentBinding(var1);
        try {
            module0131.$g1531$.bind((SubLObject)NIL, var1);
            Errors.$continue_cerrorP$.bind((SubLObject)T, var1);
            final SubLObject var4 = (SubLObject)$ic15$;
            final SubLObject var5 = module0173.f10962();
            SubLObject var6 = (SubLObject)ZERO_INTEGER;
            final SubLObject var8_68 = module0012.$g75$.currentBinding(var1);
            final SubLObject var9_69 = module0012.$g76$.currentBinding(var1);
            final SubLObject var7 = module0012.$g77$.currentBinding(var1);
            final SubLObject var8 = module0012.$g78$.currentBinding(var1);
            try {
                module0012.$g75$.bind((SubLObject)ZERO_INTEGER, var1);
                module0012.$g76$.bind((SubLObject)NIL, var1);
                module0012.$g77$.bind((SubLObject)T, var1);
                module0012.$g78$.bind(Time.get_universal_time(), var1);
                module0012.f478(var4);
                SubLObject var9 = module0173.f10961();
                SubLObject var10 = (SubLObject)NIL;
                var10 = var9.first();
                while (NIL != var9) {
                    final SubLObject var11 = var10;
                    if (NIL == module0065.f4772(var11, (SubLObject)$ic4$)) {
                        final SubLObject var14_71 = var11;
                        if (NIL == module0065.f4775(var14_71, (SubLObject)$ic4$)) {
                            final SubLObject var12 = module0065.f4740(var14_71);
                            final SubLObject var13 = (SubLObject)NIL;
                            SubLObject var14;
                            SubLObject var15;
                            SubLObject var16;
                            SubLObject var17;
                            SubLObject var2_73;
                            for (var14 = Sequences.length(var12), var15 = (SubLObject)NIL, var15 = (SubLObject)ZERO_INTEGER; var15.numL(var14); var15 = Numbers.add(var15, (SubLObject)ONE_INTEGER)) {
                                var16 = ((NIL != var13) ? Numbers.subtract(var14, var15, (SubLObject)ONE_INTEGER) : var15);
                                var17 = Vectors.aref(var12, var16);
                                if (NIL == module0065.f4749(var17) || NIL == module0065.f4773((SubLObject)$ic4$)) {
                                    if (NIL != module0065.f4749(var17)) {
                                        var17 = (SubLObject)$ic4$;
                                    }
                                    var6 = Numbers.add(var6, (SubLObject)ONE_INTEGER);
                                    module0012.note_percent_progress(var6, var5);
                                    if (NIL != module0173.f10969(var17) && !module0217.f14221(var17, (SubLObject)ONE_INTEGER, $ic16$, (SubLObject)UNPROVIDED).isPositive()) {
                                        if (NIL != $g4134$.getDynamicValue(var1)) {
                                            var2_73 = module0217.f14357(var17);
                                            Errors.warn((SubLObject)$ic17$, var17, var2_73);
                                        }
                                        module0540.f33510(var17);
                                    }
                                }
                            }
                        }
                        final SubLObject var24_74 = var11;
                        if (NIL == module0065.f4777(var24_74) || NIL == module0065.f4773((SubLObject)$ic4$)) {
                            final SubLObject var18 = module0065.f4738(var24_74);
                            SubLObject var19 = module0065.f4739(var24_74);
                            final SubLObject var20 = module0065.f4734(var24_74);
                            final SubLObject var21 = (SubLObject)((NIL != module0065.f4773((SubLObject)$ic4$)) ? NIL : $ic4$);
                            while (var19.numL(var20)) {
                                final SubLObject var22 = Hashtables.gethash_without_values(var19, var18, var21);
                                if (NIL == module0065.f4773((SubLObject)$ic4$) || NIL == module0065.f4749(var22)) {
                                    var6 = Numbers.add(var6, (SubLObject)ONE_INTEGER);
                                    module0012.note_percent_progress(var6, var5);
                                    if (NIL != module0173.f10969(var22) && !module0217.f14221(var22, (SubLObject)ONE_INTEGER, $ic16$, (SubLObject)UNPROVIDED).isPositive()) {
                                        if (NIL != $g4134$.getDynamicValue(var1)) {
                                            final SubLObject var2_74 = module0217.f14357(var22);
                                            Errors.warn((SubLObject)$ic17$, var22, var2_74);
                                        }
                                        module0540.f33510(var22);
                                    }
                                }
                                var19 = Numbers.add(var19, (SubLObject)ONE_INTEGER);
                            }
                        }
                    }
                    var9 = var9.rest();
                    var10 = var9.first();
                }
                module0012.f479();
            }
            finally {
                module0012.$g78$.rebind(var8, var1);
                module0012.$g77$.rebind(var7, var1);
                module0012.$g76$.rebind(var9_69, var1);
                module0012.$g75$.rebind(var8_68, var1);
            }
        }
        finally {
            Errors.$continue_cerrorP$.rebind(var3, var1);
            module0131.$g1531$.rebind(var2, var1);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f34865() {
        final SubLThread var1 = SubLProcess.currentSubLThread();
        final SubLObject var2 = module0131.$g1531$.currentBinding(var1);
        final SubLObject var3 = Errors.$continue_cerrorP$.currentBinding(var1);
        try {
            module0131.$g1531$.bind((SubLObject)NIL, var1);
            Errors.$continue_cerrorP$.bind((SubLObject)T, var1);
            SubLObject var4 = (SubLObject)NIL;
            final SubLObject var8_77 = module0147.$g2094$.currentBinding(var1);
            final SubLObject var9_78 = module0147.$g2095$.currentBinding(var1);
            try {
                module0147.$g2094$.bind((SubLObject)$ic18$, var1);
                module0147.$g2095$.bind($ic19$, var1);
                var4 = module0259.f16985($ic20$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
            }
            finally {
                module0147.$g2095$.rebind(var9_78, var1);
                module0147.$g2094$.rebind(var8_77, var1);
            }
            final SubLObject var5 = var4;
            module0012.$g82$.setDynamicValue((SubLObject)$ic21$, var1);
            module0012.$g73$.setDynamicValue(Time.get_universal_time(), var1);
            module0012.$g83$.setDynamicValue(Sequences.length(var5), var1);
            module0012.$g84$.setDynamicValue((SubLObject)ZERO_INTEGER, var1);
            final SubLObject var8_78 = module0012.$g75$.currentBinding(var1);
            final SubLObject var9_79 = module0012.$g76$.currentBinding(var1);
            final SubLObject var6 = module0012.$g77$.currentBinding(var1);
            final SubLObject var7 = module0012.$g78$.currentBinding(var1);
            try {
                module0012.$g75$.bind((SubLObject)ZERO_INTEGER, var1);
                module0012.$g76$.bind((SubLObject)NIL, var1);
                module0012.$g77$.bind((SubLObject)T, var1);
                module0012.$g78$.bind(Time.get_universal_time(), var1);
                module0012.f478(module0012.$g82$.getDynamicValue(var1));
                SubLObject var8 = var5;
                SubLObject var9 = (SubLObject)NIL;
                var9 = var8.first();
                while (NIL != var8) {
                    module0012.note_percent_progress(module0012.$g84$.getDynamicValue(var1), module0012.$g83$.getDynamicValue(var1));
                    module0012.$g84$.setDynamicValue(Numbers.add(module0012.$g84$.getDynamicValue(var1), (SubLObject)ONE_INTEGER), var1);
                    if (NIL != module0173.f10955(var9) && !module0217.f14221(var9, (SubLObject)ONE_INTEGER, $ic22$, (SubLObject)UNPROVIDED).isPositive() && NIL != $g4134$.getDynamicValue(var1)) {
                        Errors.warn((SubLObject)$ic23$, var9);
                        module0540.f33510(var9);
                    }
                    var8 = var8.rest();
                    var9 = var8.first();
                }
                module0012.f479();
            }
            finally {
                module0012.$g78$.rebind(var7, var1);
                module0012.$g77$.rebind(var6, var1);
                module0012.$g76$.rebind(var9_79, var1);
                module0012.$g75$.rebind(var8_78, var1);
            }
        }
        finally {
            Errors.$continue_cerrorP$.rebind(var3, var1);
            module0131.$g1531$.rebind(var2, var1);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f34864() {
        final SubLThread var1 = SubLProcess.currentSubLThread();
        final SubLObject var2 = module0131.$g1531$.currentBinding(var1);
        final SubLObject var3 = Errors.$continue_cerrorP$.currentBinding(var1);
        try {
            module0131.$g1531$.bind((SubLObject)NIL, var1);
            Errors.$continue_cerrorP$.bind((SubLObject)T, var1);
            SubLObject var4 = (SubLObject)NIL;
            final SubLObject var8_85 = module0147.$g2094$.currentBinding(var1);
            final SubLObject var9_86 = module0147.$g2095$.currentBinding(var1);
            try {
                module0147.$g2094$.bind((SubLObject)$ic18$, var1);
                module0147.$g2095$.bind($ic19$, var1);
                var4 = module0259.f16848($ic24$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
            }
            finally {
                module0147.$g2095$.rebind(var9_86, var1);
                module0147.$g2094$.rebind(var8_85, var1);
            }
            final SubLObject var5 = var4;
            module0012.$g82$.setDynamicValue((SubLObject)$ic25$, var1);
            module0012.$g73$.setDynamicValue(Time.get_universal_time(), var1);
            module0012.$g83$.setDynamicValue(Sequences.length(var5), var1);
            module0012.$g84$.setDynamicValue((SubLObject)ZERO_INTEGER, var1);
            final SubLObject var8_86 = module0012.$g75$.currentBinding(var1);
            final SubLObject var9_87 = module0012.$g76$.currentBinding(var1);
            final SubLObject var6 = module0012.$g77$.currentBinding(var1);
            final SubLObject var7 = module0012.$g78$.currentBinding(var1);
            try {
                module0012.$g75$.bind((SubLObject)ZERO_INTEGER, var1);
                module0012.$g76$.bind((SubLObject)NIL, var1);
                module0012.$g77$.bind((SubLObject)T, var1);
                module0012.$g78$.bind(Time.get_universal_time(), var1);
                module0012.f478(module0012.$g82$.getDynamicValue(var1));
                SubLObject var8 = var5;
                SubLObject var9 = (SubLObject)NIL;
                var9 = var8.first();
                while (NIL != var8) {
                    module0012.note_percent_progress(module0012.$g84$.getDynamicValue(var1), module0012.$g83$.getDynamicValue(var1));
                    module0012.$g84$.setDynamicValue(Numbers.add(module0012.$g84$.getDynamicValue(var1), (SubLObject)ONE_INTEGER), var1);
                    if (NIL != module0287.f19205(var9)) {
                        if (NIL != $g4134$.getDynamicValue(var1)) {
                            Errors.warn((SubLObject)$ic23$, var9);
                        }
                        module0540.f33510(var9);
                    }
                    var8 = var8.rest();
                    var9 = var8.first();
                }
                module0012.f479();
            }
            finally {
                module0012.$g78$.rebind(var7, var1);
                module0012.$g77$.rebind(var6, var1);
                module0012.$g76$.rebind(var9_87, var1);
                module0012.$g75$.rebind(var8_86, var1);
            }
        }
        finally {
            Errors.$continue_cerrorP$.rebind(var3, var1);
            module0131.$g1531$.rebind(var2, var1);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f34866() {
        final SubLThread var1 = SubLProcess.currentSubLThread();
        final SubLObject var2 = module0012.$g75$.currentBinding(var1);
        final SubLObject var3 = module0012.$g76$.currentBinding(var1);
        final SubLObject var4 = module0012.$g77$.currentBinding(var1);
        final SubLObject var5 = module0012.$g78$.currentBinding(var1);
        try {
            module0012.$g75$.bind((SubLObject)ZERO_INTEGER, var1);
            module0012.$g76$.bind((SubLObject)NIL, var1);
            module0012.$g77$.bind((SubLObject)T, var1);
            module0012.$g78$.bind(Time.get_universal_time(), var1);
            module0012.f478((SubLObject)$ic26$);
            final SubLObject var8_90 = module0147.$g2094$.currentBinding(var1);
            final SubLObject var9_91 = module0147.$g2095$.currentBinding(var1);
            try {
                module0147.$g2094$.bind((SubLObject)$ic18$, var1);
                module0147.$g2095$.bind($ic19$, var1);
                final SubLObject var6 = module0217.f14247($ic27$, (SubLObject)UNPROVIDED);
                SubLObject var7 = (SubLObject)ZERO_INTEGER;
                final SubLObject var8 = $ic27$;
                if (NIL != module0158.f10038(var8)) {
                    final SubLObject var9 = (SubLObject)NIL;
                    final SubLObject var8_91 = module0012.$g73$.currentBinding(var1);
                    final SubLObject var9_92 = module0012.$g65$.currentBinding(var1);
                    final SubLObject var10_96 = module0012.$g67$.currentBinding(var1);
                    final SubLObject var11_97 = module0012.$g68$.currentBinding(var1);
                    final SubLObject var10 = module0012.$g66$.currentBinding(var1);
                    final SubLObject var11 = module0012.$g69$.currentBinding(var1);
                    final SubLObject var12 = module0012.$g70$.currentBinding(var1);
                    final SubLObject var13 = module0012.$silent_progressP$.currentBinding(var1);
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
                        final SubLObject var14 = module0158.f10039(var8);
                        SubLObject var15 = (SubLObject)NIL;
                        final SubLObject var16 = (SubLObject)NIL;
                        while (NIL == var15) {
                            final SubLObject var17 = module0052.f3695(var14, var16);
                            final SubLObject var18 = (SubLObject)makeBoolean(!var16.eql(var17));
                            if (NIL != var18) {
                                module0012.f476();
                                SubLObject var19 = (SubLObject)NIL;
                                try {
                                    var19 = module0158.f10316(var17, (SubLObject)$ic12$, (SubLObject)NIL, (SubLObject)NIL);
                                    SubLObject var51_98 = (SubLObject)NIL;
                                    final SubLObject var52_99 = (SubLObject)NIL;
                                    while (NIL == var51_98) {
                                        final SubLObject var20 = module0052.f3695(var19, var52_99);
                                        final SubLObject var54_101 = (SubLObject)makeBoolean(!var52_99.eql(var20));
                                        if (NIL != var54_101) {
                                            if (NIL == module0569.f34969(var20)) {
                                                if (NIL != $g4134$.getDynamicValue(var1)) {
                                                    Errors.warn((SubLObject)$ic28$, var20);
                                                }
                                                module0178.f11369(var20);
                                            }
                                            var7 = Numbers.add(var7, (SubLObject)ONE_INTEGER);
                                            module0012.note_percent_progress(var7, var6);
                                        }
                                        var51_98 = (SubLObject)makeBoolean(NIL == var54_101);
                                    }
                                }
                                finally {
                                    final SubLObject var8_92 = Threads.$is_thread_performing_cleanupP$.currentBinding(var1);
                                    try {
                                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)T, var1);
                                        if (NIL != var19) {
                                            module0158.f10319(var19);
                                        }
                                    }
                                    finally {
                                        Threads.$is_thread_performing_cleanupP$.rebind(var8_92, var1);
                                    }
                                }
                            }
                            var15 = (SubLObject)makeBoolean(NIL == var18);
                        }
                        module0012.f475();
                    }
                    finally {
                        module0012.$silent_progressP$.rebind(var13, var1);
                        module0012.$g70$.rebind(var12, var1);
                        module0012.$g69$.rebind(var11, var1);
                        module0012.$g66$.rebind(var10, var1);
                        module0012.$g68$.rebind(var11_97, var1);
                        module0012.$g67$.rebind(var10_96, var1);
                        module0012.$g65$.rebind(var9_92, var1);
                        module0012.$g73$.rebind(var8_91, var1);
                    }
                }
            }
            finally {
                module0147.$g2095$.rebind(var9_91, var1);
                module0147.$g2094$.rebind(var8_90, var1);
            }
            module0012.f479();
        }
        finally {
            module0012.$g78$.rebind(var5, var1);
            module0012.$g77$.rebind(var4, var1);
            module0012.$g76$.rebind(var3, var1);
            module0012.$g75$.rebind(var2, var1);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f34867() {
        final SubLThread var1 = SubLProcess.currentSubLThread();
        SubLObject var2 = (SubLObject)ZERO_INTEGER;
        final SubLObject var3 = module0131.$g1531$.currentBinding(var1);
        final SubLObject var4 = Errors.$continue_cerrorP$.currentBinding(var1);
        try {
            module0131.$g1531$.bind((SubLObject)NIL, var1);
            Errors.$continue_cerrorP$.bind((SubLObject)T, var1);
            final SubLObject var5 = module0167.f10788();
            final SubLObject var6 = (SubLObject)$ic30$;
            final SubLObject var7 = module0065.f4733(var5);
            SubLObject var8 = (SubLObject)ZERO_INTEGER;
            assert NIL != Types.stringp(var6) : var6;
            final SubLObject var8_104 = module0012.$g75$.currentBinding(var1);
            final SubLObject var9_105 = module0012.$g76$.currentBinding(var1);
            final SubLObject var9 = module0012.$g77$.currentBinding(var1);
            final SubLObject var10 = module0012.$g78$.currentBinding(var1);
            try {
                module0012.$g75$.bind((SubLObject)ZERO_INTEGER, var1);
                module0012.$g76$.bind((SubLObject)NIL, var1);
                module0012.$g77$.bind((SubLObject)T, var1);
                module0012.$g78$.bind(Time.get_universal_time(), var1);
                module0012.f478(var6);
                final SubLObject var12_106 = var5;
                if (NIL == module0065.f4772(var12_106, (SubLObject)$ic4$)) {
                    final SubLObject var14_107 = var12_106;
                    if (NIL == module0065.f4775(var14_107, (SubLObject)$ic4$)) {
                        final SubLObject var11 = module0065.f4740(var14_107);
                        final SubLObject var12 = (SubLObject)NIL;
                        SubLObject var13;
                        SubLObject var14;
                        SubLObject var15;
                        SubLObject var16;
                        SubLObject var2_109;
                        SubLObject var17;
                        SubLObject var18;
                        SubLObject var19;
                        for (var13 = Sequences.length(var11), var14 = (SubLObject)NIL, var14 = (SubLObject)ZERO_INTEGER; var14.numL(var13); var14 = Numbers.add(var14, (SubLObject)ONE_INTEGER)) {
                            var15 = ((NIL != var12) ? Numbers.subtract(var13, var14, (SubLObject)ONE_INTEGER) : var14);
                            var16 = Vectors.aref(var11, var15);
                            if (NIL == module0065.f4749(var16) || NIL == module0065.f4773((SubLObject)$ic4$)) {
                                if (NIL != module0065.f4749(var16)) {
                                    var16 = (SubLObject)$ic4$;
                                }
                                module0012.note_percent_progress(var8, var7);
                                var8 = Numbers.add(var8, (SubLObject)ONE_INTEGER);
                                if (NIL != module0167.f10824(var16, (SubLObject)UNPROVIDED)) {
                                    var2_109 = module0217.f14357(var16);
                                    var17 = (SubLObject)ZERO_INTEGER;
                                    var18 = $g4135$.getDynamicValue(var1);
                                    var19 = (SubLObject)NIL;
                                    var19 = var18.first();
                                    while (NIL != var18) {
                                        var17 = Numbers.add(var17, module0217.f14221(var16, (SubLObject)ONE_INTEGER, var19, (SubLObject)UNPROVIDED));
                                        var18 = var18.rest();
                                        var19 = var18.first();
                                    }
                                    if (var2_109.numG(var17)) {
                                        if (NIL != $g4134$.getDynamicValue(var1)) {
                                            Errors.warn((SubLObject)$ic31$, var16, Numbers.subtract(var2_109, var17));
                                        }
                                    }
                                    else {
                                        module0540.f33510(var16);
                                        var2 = Numbers.add(var2, (SubLObject)ONE_INTEGER);
                                    }
                                }
                            }
                        }
                    }
                    final SubLObject var24_112 = var12_106;
                    if (NIL == module0065.f4777(var24_112) || NIL == module0065.f4773((SubLObject)$ic4$)) {
                        final SubLObject var20 = module0065.f4738(var24_112);
                        SubLObject var21 = module0065.f4739(var24_112);
                        final SubLObject var22 = module0065.f4734(var24_112);
                        final SubLObject var23 = (SubLObject)((NIL != module0065.f4773((SubLObject)$ic4$)) ? NIL : $ic4$);
                        while (var21.numL(var22)) {
                            final SubLObject var24 = Hashtables.gethash_without_values(var21, var20, var23);
                            if (NIL == module0065.f4773((SubLObject)$ic4$) || NIL == module0065.f4749(var24)) {
                                module0012.note_percent_progress(var8, var7);
                                var8 = Numbers.add(var8, (SubLObject)ONE_INTEGER);
                                if (NIL != module0167.f10824(var24, (SubLObject)UNPROVIDED)) {
                                    final SubLObject var2_110 = module0217.f14357(var24);
                                    SubLObject var25 = (SubLObject)ZERO_INTEGER;
                                    SubLObject var26 = $g4135$.getDynamicValue(var1);
                                    SubLObject var27 = (SubLObject)NIL;
                                    var27 = var26.first();
                                    while (NIL != var26) {
                                        var25 = Numbers.add(var25, module0217.f14221(var24, (SubLObject)ONE_INTEGER, var27, (SubLObject)UNPROVIDED));
                                        var26 = var26.rest();
                                        var27 = var26.first();
                                    }
                                    if (var2_110.numG(var25)) {
                                        if (NIL != $g4134$.getDynamicValue(var1)) {
                                            Errors.warn((SubLObject)$ic31$, var24, Numbers.subtract(var2_110, var25));
                                        }
                                    }
                                    else {
                                        module0540.f33510(var24);
                                        var2 = Numbers.add(var2, (SubLObject)ONE_INTEGER);
                                    }
                                }
                            }
                            var21 = Numbers.add(var21, (SubLObject)ONE_INTEGER);
                        }
                    }
                }
                module0012.f479();
            }
            finally {
                module0012.$g78$.rebind(var10, var1);
                module0012.$g77$.rebind(var9, var1);
                module0012.$g76$.rebind(var9_105, var1);
                module0012.$g75$.rebind(var8_104, var1);
            }
        }
        finally {
            Errors.$continue_cerrorP$.rebind(var4, var1);
            module0131.$g1531$.rebind(var3, var1);
        }
        return var2;
    }
    
    public static SubLObject f34872() {
        final SubLThread var1 = SubLProcess.currentSubLThread();
        SubLObject var2 = (SubLObject)ZERO_INTEGER;
        final SubLObject var3 = module0131.$g1531$.currentBinding(var1);
        final SubLObject var4 = Errors.$continue_cerrorP$.currentBinding(var1);
        try {
            module0131.$g1531$.bind((SubLObject)NIL, var1);
            Errors.$continue_cerrorP$.bind((SubLObject)T, var1);
            final SubLObject var5 = assertion_handles_oc.f11010();
            final SubLObject var6 = (SubLObject)$ic32$;
            final SubLObject var5_114 = module0065.f4733(var5);
            SubLObject var7 = (SubLObject)ZERO_INTEGER;
            assert NIL != Types.stringp(var6) : var6;
            final SubLObject var8_115 = module0012.$g75$.currentBinding(var1);
            final SubLObject var9_116 = module0012.$g76$.currentBinding(var1);
            final SubLObject var8 = module0012.$g77$.currentBinding(var1);
            final SubLObject var9 = module0012.$g78$.currentBinding(var1);
            try {
                module0012.$g75$.bind((SubLObject)ZERO_INTEGER, var1);
                module0012.$g76$.bind((SubLObject)NIL, var1);
                module0012.$g77$.bind((SubLObject)T, var1);
                module0012.$g78$.bind(Time.get_universal_time(), var1);
                module0012.f478(var6);
                final SubLObject var12_117 = var5;
                if (NIL == module0065.f4772(var12_117, (SubLObject)$ic4$)) {
                    final SubLObject var14_118 = var12_117;
                    if (NIL == module0065.f4775(var14_118, (SubLObject)$ic4$)) {
                        final SubLObject var10 = module0065.f4740(var14_118);
                        final SubLObject var11 = (SubLObject)NIL;
                        SubLObject var12;
                        SubLObject var13;
                        SubLObject var14;
                        SubLObject var15;
                        SubLObject var119_120;
                        for (var12 = Sequences.length(var10), var13 = (SubLObject)NIL, var13 = (SubLObject)ZERO_INTEGER; var13.numL(var12); var13 = Numbers.add(var13, (SubLObject)ONE_INTEGER)) {
                            var14 = ((NIL != var11) ? Numbers.subtract(var12, var13, (SubLObject)ONE_INTEGER) : var13);
                            var15 = Vectors.aref(var10, var14);
                            if (NIL == module0065.f4749(var15) || NIL == module0065.f4773((SubLObject)$ic4$)) {
                                if (NIL != module0065.f4749(var15)) {
                                    var15 = (SubLObject)$ic4$;
                                }
                                module0012.note_percent_progress(var7, var5_114);
                                var7 = Numbers.add(var7, (SubLObject)ONE_INTEGER);
                                if (NIL != module0178.f11361(var15, (SubLObject)UNPROVIDED)) {
                                    var119_120 = assertion_handles_oc.f11025(var15);
                                    if (NIL != module0342.f23162(var15)) {
                                        if (NIL != $g4134$.getDynamicValue(var1)) {
                                            Errors.warn((SubLObject)$ic33$, var119_120);
                                        }
                                        var2 = Numbers.add(var2, (SubLObject)ONE_INTEGER);
                                    }
                                }
                            }
                        }
                    }
                    final SubLObject var24_121 = var12_117;
                    if (NIL == module0065.f4777(var24_121) || NIL == module0065.f4773((SubLObject)$ic4$)) {
                        final SubLObject var16 = module0065.f4738(var24_121);
                        SubLObject var17 = module0065.f4739(var24_121);
                        final SubLObject var18 = module0065.f4734(var24_121);
                        final SubLObject var19 = (SubLObject)((NIL != module0065.f4773((SubLObject)$ic4$)) ? NIL : $ic4$);
                        while (var17.numL(var18)) {
                            final SubLObject var20 = Hashtables.gethash_without_values(var17, var16, var19);
                            if (NIL == module0065.f4773((SubLObject)$ic4$) || NIL == module0065.f4749(var20)) {
                                module0012.note_percent_progress(var7, var5_114);
                                var7 = Numbers.add(var7, (SubLObject)ONE_INTEGER);
                                if (NIL != module0178.f11361(var20, (SubLObject)UNPROVIDED)) {
                                    final SubLObject var119_121 = assertion_handles_oc.f11025(var20);
                                    if (NIL != module0342.f23162(var20)) {
                                        if (NIL != $g4134$.getDynamicValue(var1)) {
                                            Errors.warn((SubLObject)$ic33$, var119_121);
                                        }
                                        var2 = Numbers.add(var2, (SubLObject)ONE_INTEGER);
                                    }
                                }
                            }
                            var17 = Numbers.add(var17, (SubLObject)ONE_INTEGER);
                        }
                    }
                }
                module0012.f479();
            }
            finally {
                module0012.$g78$.rebind(var9, var1);
                module0012.$g77$.rebind(var8, var1);
                module0012.$g76$.rebind(var9_116, var1);
                module0012.$g75$.rebind(var8_115, var1);
            }
        }
        finally {
            Errors.$continue_cerrorP$.rebind(var4, var1);
            module0131.$g1531$.rebind(var3, var1);
        }
        return var2;
    }
    
    public static SubLObject f34873() {
        final SubLThread var1 = SubLProcess.currentSubLThread();
        SubLObject var2 = (SubLObject)ZERO_INTEGER;
        final SubLObject var3 = module0131.$g1531$.currentBinding(var1);
        final SubLObject var4 = Errors.$continue_cerrorP$.currentBinding(var1);
        try {
            module0131.$g1531$.bind((SubLObject)NIL, var1);
            Errors.$continue_cerrorP$.bind((SubLObject)T, var1);
            final SubLObject var5 = assertion_handles_oc.f11010();
            final SubLObject var6 = (SubLObject)$ic34$;
            final SubLObject var5_123 = module0065.f4733(var5);
            SubLObject var7 = (SubLObject)ZERO_INTEGER;
            assert NIL != Types.stringp(var6) : var6;
            final SubLObject var8_124 = module0012.$g75$.currentBinding(var1);
            final SubLObject var9_125 = module0012.$g76$.currentBinding(var1);
            final SubLObject var8 = module0012.$g77$.currentBinding(var1);
            final SubLObject var9 = module0012.$g78$.currentBinding(var1);
            try {
                module0012.$g75$.bind((SubLObject)ZERO_INTEGER, var1);
                module0012.$g76$.bind((SubLObject)NIL, var1);
                module0012.$g77$.bind((SubLObject)T, var1);
                module0012.$g78$.bind(Time.get_universal_time(), var1);
                module0012.f478(var6);
                final SubLObject var12_126 = var5;
                if (NIL == module0065.f4772(var12_126, (SubLObject)$ic4$)) {
                    final SubLObject var14_127 = var12_126;
                    if (NIL == module0065.f4775(var14_127, (SubLObject)$ic4$)) {
                        final SubLObject var10 = module0065.f4740(var14_127);
                        final SubLObject var11 = (SubLObject)NIL;
                        SubLObject var12;
                        SubLObject var13;
                        SubLObject var14;
                        SubLObject var15;
                        SubLObject var16;
                        SubLObject var17;
                        SubLObject var18;
                        for (var12 = Sequences.length(var10), var13 = (SubLObject)NIL, var13 = (SubLObject)ZERO_INTEGER; var13.numL(var12); var13 = Numbers.add(var13, (SubLObject)ONE_INTEGER)) {
                            var14 = ((NIL != var11) ? Numbers.subtract(var12, var13, (SubLObject)ONE_INTEGER) : var13);
                            var15 = Vectors.aref(var10, var14);
                            if (NIL == module0065.f4749(var15) || NIL == module0065.f4773((SubLObject)$ic4$)) {
                                if (NIL != module0065.f4749(var15)) {
                                    var15 = (SubLObject)$ic4$;
                                }
                                module0012.note_percent_progress(var7, var5_123);
                                var7 = Numbers.add(var7, (SubLObject)ONE_INTEGER);
                                if (NIL != module0178.f11361(var15, (SubLObject)UNPROVIDED) && NIL != module0178.f11284(var15) && NIL != module0178.f11375(var15) && NIL == module0178.f11382(var15) && NIL != module0178.f11343(var15, (SubLObject)$ic35$)) {
                                    var16 = module0178.f11299(var15);
                                    if (NIL == module0035.f1997(var16) && NIL == Sequences.find((SubLObject)$ic36$, var16, Symbols.symbol_function((SubLObject)EQL), Symbols.symbol_function((SubLObject)$ic37$), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)) {
                                        var17 = module0178.f11378(var15);
                                        if (NIL != var17) {
                                            var2 = Numbers.add(var2, (SubLObject)ONE_INTEGER);
                                            var18 = module0342.f23121(var17, var15, (SubLObject)UNPROVIDED);
                                            if (NIL != var18 && NIL != $g4134$.getDynamicValue(var1)) {
                                                Errors.warn((SubLObject)$ic38$);
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                    final SubLObject var24_131 = var12_126;
                    if (NIL == module0065.f4777(var24_131) || NIL == module0065.f4773((SubLObject)$ic4$)) {
                        final SubLObject var19 = module0065.f4738(var24_131);
                        SubLObject var20 = module0065.f4739(var24_131);
                        final SubLObject var21 = module0065.f4734(var24_131);
                        final SubLObject var22 = (SubLObject)((NIL != module0065.f4773((SubLObject)$ic4$)) ? NIL : $ic4$);
                        while (var20.numL(var21)) {
                            final SubLObject var23 = Hashtables.gethash_without_values(var20, var19, var22);
                            if (NIL == module0065.f4773((SubLObject)$ic4$) || NIL == module0065.f4749(var23)) {
                                module0012.note_percent_progress(var7, var5_123);
                                var7 = Numbers.add(var7, (SubLObject)ONE_INTEGER);
                                if (NIL != module0178.f11361(var23, (SubLObject)UNPROVIDED) && NIL != module0178.f11284(var23) && NIL != module0178.f11375(var23) && NIL == module0178.f11382(var23) && NIL != module0178.f11343(var23, (SubLObject)$ic35$)) {
                                    final SubLObject var24 = module0178.f11299(var23);
                                    if (NIL == module0035.f1997(var24) && NIL == Sequences.find((SubLObject)$ic36$, var24, Symbols.symbol_function((SubLObject)EQL), Symbols.symbol_function((SubLObject)$ic37$), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)) {
                                        final SubLObject var25 = module0178.f11378(var23);
                                        if (NIL != var25) {
                                            var2 = Numbers.add(var2, (SubLObject)ONE_INTEGER);
                                            final SubLObject var26 = module0342.f23121(var25, var23, (SubLObject)UNPROVIDED);
                                            if (NIL != var26 && NIL != $g4134$.getDynamicValue(var1)) {
                                                Errors.warn((SubLObject)$ic38$);
                                            }
                                        }
                                    }
                                }
                            }
                            var20 = Numbers.add(var20, (SubLObject)ONE_INTEGER);
                        }
                    }
                }
                module0012.f479();
            }
            finally {
                module0012.$g78$.rebind(var9, var1);
                module0012.$g77$.rebind(var8, var1);
                module0012.$g76$.rebind(var9_125, var1);
                module0012.$g75$.rebind(var8_124, var1);
            }
        }
        finally {
            Errors.$continue_cerrorP$.rebind(var4, var1);
            module0131.$g1531$.rebind(var3, var1);
        }
        return var2;
    }
    
    public static SubLObject f34868() {
        final SubLThread var1 = SubLProcess.currentSubLThread();
        SubLObject var2 = (SubLObject)ZERO_INTEGER;
        PrintLow.format((SubLObject)T, (SubLObject)$ic39$);
        final SubLObject var3 = module0147.$g2094$.currentBinding(var1);
        final SubLObject var4 = module0147.$g2095$.currentBinding(var1);
        try {
            module0147.$g2094$.bind((SubLObject)$ic18$, var1);
            module0147.$g2095$.bind($ic19$, var1);
            final SubLObject var5 = $ic40$;
            final SubLObject var8_133 = module0137.$g1605$.currentBinding(var1);
            final SubLObject var9_134 = module0139.$g1636$.currentBinding(var1);
            try {
                module0137.$g1605$.bind(module0137.f8955($ic16$), var1);
                module0139.$g1636$.bind(module0139.f9007(), var1);
                SubLObject var135_136 = var5;
                final SubLObject var6 = (SubLObject)$ic43$;
                final SubLObject var7 = module0056.f4145(var6);
                final SubLObject var8_134 = module0139.$g1635$.currentBinding(var1);
                try {
                    module0139.$g1635$.bind(module0139.f9007(), var1);
                    final SubLObject var8 = (SubLObject)NIL;
                    final SubLObject var8_135 = module0141.$g1714$.currentBinding(var1);
                    final SubLObject var9_135 = module0141.$g1715$.currentBinding(var1);
                    try {
                        module0141.$g1714$.bind((NIL != var8) ? var8 : module0141.f9283(), var1);
                        module0141.$g1715$.bind((SubLObject)((NIL != var8) ? $ic44$ : module0141.$g1715$.getDynamicValue(var1)), var1);
                        if (NIL != var8 && NIL != module0136.f8864() && NIL == module0141.f9279(var8)) {
                            final SubLObject var9 = module0136.$g1591$.getDynamicValue(var1);
                            if (var9.eql((SubLObject)$ic45$)) {
                                module0136.f8870((SubLObject)ONE_INTEGER, (SubLObject)$ic46$, var8, (SubLObject)$ic47$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                            }
                            else if (var9.eql((SubLObject)$ic48$)) {
                                module0136.f8871((SubLObject)ONE_INTEGER, (SubLObject)$ic49$, (SubLObject)$ic46$, var8, (SubLObject)$ic47$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                            }
                            else if (var9.eql((SubLObject)$ic50$)) {
                                Errors.warn((SubLObject)$ic46$, var8, (SubLObject)$ic47$);
                            }
                            else {
                                Errors.warn((SubLObject)$ic51$, module0136.$g1591$.getDynamicValue(var1));
                                Errors.cerror((SubLObject)$ic49$, (SubLObject)$ic46$, var8, (SubLObject)$ic47$);
                            }
                        }
                        final SubLObject var8_136 = module0141.$g1670$.currentBinding(var1);
                        final SubLObject var9_136 = module0141.$g1671$.currentBinding(var1);
                        final SubLObject var10 = module0141.$g1672$.currentBinding(var1);
                        final SubLObject var11 = module0141.$g1674$.currentBinding(var1);
                        final SubLObject var12 = module0137.$g1605$.currentBinding(var1);
                        try {
                            module0141.$g1670$.bind(module0244.f15771(module0137.f8955($ic16$)), var1);
                            module0141.$g1671$.bind(module0244.f15739(module0244.f15771(module0137.f8955($ic16$))), var1);
                            module0141.$g1672$.bind(module0244.f15746(module0244.f15771(module0137.f8955($ic16$))), var1);
                            module0141.$g1674$.bind((SubLObject)NIL, var1);
                            module0137.$g1605$.bind(module0244.f15771(module0137.f8955($ic16$)), var1);
                            if (NIL != module0136.f8865() || NIL != module0244.f15795(var5, module0137.f8955((SubLObject)UNPROVIDED))) {
                                final SubLObject var8_137 = module0141.$g1677$.currentBinding(var1);
                                final SubLObject var9_137 = module0138.$g1619$.currentBinding(var1);
                                final SubLObject var10_148 = module0141.$g1674$.currentBinding(var1);
                                try {
                                    module0141.$g1677$.bind(module0141.f9210(), var1);
                                    module0138.$g1619$.bind(module0244.f15782(module0141.f9210(), module0244.f15771(module0137.f8955($ic16$))), var1);
                                    module0141.$g1674$.bind((SubLObject)NIL, var1);
                                    module0249.f16055(var135_136, (SubLObject)UNPROVIDED);
                                    while (NIL != var135_136) {
                                        final SubLObject var13 = var135_136;
                                        SubLObject var15;
                                        final SubLObject var14 = var15 = module0200.f12443(module0137.f8955($ic16$));
                                        SubLObject var16 = (SubLObject)NIL;
                                        var16 = var15.first();
                                        while (NIL != var15) {
                                            final SubLObject var8_138 = module0137.$g1605$.currentBinding(var1);
                                            final SubLObject var9_138 = module0141.$g1674$.currentBinding(var1);
                                            try {
                                                module0137.$g1605$.bind(var16, var1);
                                                module0141.$g1674$.bind((SubLObject)((NIL != module0141.f9205((SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)) ? makeBoolean(NIL == module0141.$g1674$.getDynamicValue(var1)) : module0141.$g1674$.getDynamicValue(var1)), var1);
                                                final SubLObject var17 = module0228.f15229(var13);
                                                if (NIL != module0138.f8992(var17)) {
                                                    final SubLObject var18 = module0242.f15664(var17, module0137.f8955((SubLObject)UNPROVIDED));
                                                    if (NIL != var18) {
                                                        final SubLObject var19 = module0245.f15834(var18, module0244.f15780(module0137.f8955($ic16$)), module0137.f8955((SubLObject)UNPROVIDED));
                                                        if (NIL != var19) {
                                                            SubLObject var20;
                                                            for (var20 = module0066.f4838(module0067.f4891(var19)); NIL == module0066.f4841(var20); var20 = module0066.f4840(var20)) {
                                                                var1.resetMultipleValues();
                                                                final SubLObject var21 = module0066.f4839(var20);
                                                                final SubLObject var22 = var1.secondMultipleValue();
                                                                var1.resetMultipleValues();
                                                                if (NIL != module0147.f9507(var21)) {
                                                                    final SubLObject var8_139 = module0138.$g1623$.currentBinding(var1);
                                                                    try {
                                                                        module0138.$g1623$.bind(var21, var1);
                                                                        SubLObject var157_161;
                                                                        for (var157_161 = module0066.f4838(module0067.f4891(var22)); NIL == module0066.f4841(var157_161); var157_161 = module0066.f4840(var157_161)) {
                                                                            var1.resetMultipleValues();
                                                                            final SubLObject var23 = module0066.f4839(var157_161);
                                                                            final SubLObject var24 = var1.secondMultipleValue();
                                                                            var1.resetMultipleValues();
                                                                            if (NIL != module0141.f9289(var23)) {
                                                                                final SubLObject var8_140 = module0138.$g1624$.currentBinding(var1);
                                                                                try {
                                                                                    module0138.$g1624$.bind(var23, var1);
                                                                                    final SubLObject var25 = var24;
                                                                                    if (NIL != module0077.f5302(var25)) {
                                                                                        final SubLObject var26 = module0077.f5333(var25);
                                                                                        SubLObject var27;
                                                                                        SubLObject var28;
                                                                                        SubLObject var29;
                                                                                        SubLObject var30;
                                                                                        SubLObject var31;
                                                                                        SubLObject var32;
                                                                                        for (var27 = module0032.f1741(var26), var28 = (SubLObject)NIL, var28 = module0032.f1742(var27, var26); NIL == module0032.f1744(var27, var28); var28 = module0032.f1743(var28)) {
                                                                                            var29 = module0032.f1745(var27, var28);
                                                                                            if (NIL != module0032.f1746(var28, var29) && NIL == module0249.f16059(var29, module0139.$g1636$.getDynamicValue(var1))) {
                                                                                                module0249.f16055(var29, module0139.$g1636$.getDynamicValue(var1));
                                                                                                if (NIL != module0173.f10955(var29)) {
                                                                                                    var30 = module0633.f38713(var29, (SubLObject)UNPROVIDED);
                                                                                                    if (NIL == var30) {
                                                                                                        Errors.warn((SubLObject)$ic52$, var29);
                                                                                                    }
                                                                                                    else if (NIL == module0423.f29593(var30)) {
                                                                                                        var1.resetMultipleValues();
                                                                                                        var31 = module0423.f29595(var30, (SubLObject)UNPROVIDED);
                                                                                                        var32 = var1.secondMultipleValue();
                                                                                                        var1.resetMultipleValues();
                                                                                                        Errors.warn((SubLObject)$ic53$, var29, var32);
                                                                                                        module0540.f33510(var29);
                                                                                                        var2 = Numbers.add(var2, (SubLObject)ONE_INTEGER);
                                                                                                    }
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                    else if (var25.isList()) {
                                                                                        SubLObject var33 = var25;
                                                                                        SubLObject var34 = (SubLObject)NIL;
                                                                                        var34 = var33.first();
                                                                                        while (NIL != var33) {
                                                                                            if (NIL == module0249.f16059(var34, module0139.$g1636$.getDynamicValue(var1))) {
                                                                                                module0249.f16055(var34, module0139.$g1636$.getDynamicValue(var1));
                                                                                                if (NIL != module0173.f10955(var34)) {
                                                                                                    final SubLObject var35 = module0633.f38713(var34, (SubLObject)UNPROVIDED);
                                                                                                    if (NIL == var35) {
                                                                                                        Errors.warn((SubLObject)$ic52$, var34);
                                                                                                    }
                                                                                                    else if (NIL == module0423.f29593(var35)) {
                                                                                                        var1.resetMultipleValues();
                                                                                                        final SubLObject var36 = module0423.f29595(var35, (SubLObject)UNPROVIDED);
                                                                                                        final SubLObject var37 = var1.secondMultipleValue();
                                                                                                        var1.resetMultipleValues();
                                                                                                        Errors.warn((SubLObject)$ic53$, var34, var37);
                                                                                                        module0540.f33510(var34);
                                                                                                        var2 = Numbers.add(var2, (SubLObject)ONE_INTEGER);
                                                                                                    }
                                                                                                }
                                                                                            }
                                                                                            var33 = var33.rest();
                                                                                            var34 = var33.first();
                                                                                        }
                                                                                    }
                                                                                    else {
                                                                                        Errors.error((SubLObject)$ic54$, var25);
                                                                                    }
                                                                                }
                                                                                finally {
                                                                                    module0138.$g1624$.rebind(var8_140, var1);
                                                                                }
                                                                            }
                                                                        }
                                                                        module0066.f4842(var157_161);
                                                                    }
                                                                    finally {
                                                                        module0138.$g1623$.rebind(var8_139, var1);
                                                                    }
                                                                }
                                                            }
                                                            module0066.f4842(var20);
                                                        }
                                                    }
                                                    else {
                                                        module0136.f8870((SubLObject)FIVE_INTEGER, (SubLObject)$ic55$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                                                    }
                                                    if (NIL != module0200.f12419(var17, module0137.f8955((SubLObject)UNPROVIDED))) {
                                                        SubLObject var38 = module0248.f15995(var17);
                                                        SubLObject var39 = (SubLObject)NIL;
                                                        var39 = var38.first();
                                                        while (NIL != var38) {
                                                            SubLObject var41;
                                                            final SubLObject var40 = var41 = var39;
                                                            SubLObject var42 = (SubLObject)NIL;
                                                            SubLObject var43 = (SubLObject)NIL;
                                                            SubLObject var44 = (SubLObject)NIL;
                                                            cdestructuring_bind.destructuring_bind_must_consp(var41, var40, (SubLObject)$ic56$);
                                                            var42 = var41.first();
                                                            var41 = var41.rest();
                                                            cdestructuring_bind.destructuring_bind_must_consp(var41, var40, (SubLObject)$ic56$);
                                                            var43 = var41.first();
                                                            var41 = var41.rest();
                                                            cdestructuring_bind.destructuring_bind_must_consp(var41, var40, (SubLObject)$ic56$);
                                                            var44 = var41.first();
                                                            var41 = var41.rest();
                                                            if (NIL == var41) {
                                                                if (NIL != module0147.f9507(var43)) {
                                                                    final SubLObject var8_141 = module0138.$g1623$.currentBinding(var1);
                                                                    try {
                                                                        module0138.$g1623$.bind(var43, var1);
                                                                        if (NIL != module0141.f9289(var44)) {
                                                                            final SubLObject var8_142 = module0138.$g1624$.currentBinding(var1);
                                                                            try {
                                                                                module0138.$g1624$.bind(var44, var1);
                                                                                final SubLObject var25;
                                                                                final SubLObject var45 = var25 = (SubLObject)ConsesLow.list(var42);
                                                                                if (NIL != module0077.f5302(var25)) {
                                                                                    final SubLObject var26 = module0077.f5333(var25);
                                                                                    SubLObject var27;
                                                                                    SubLObject var28;
                                                                                    SubLObject var29;
                                                                                    SubLObject var30;
                                                                                    SubLObject var31;
                                                                                    SubLObject var32;
                                                                                    for (var27 = module0032.f1741(var26), var28 = (SubLObject)NIL, var28 = module0032.f1742(var27, var26); NIL == module0032.f1744(var27, var28); var28 = module0032.f1743(var28)) {
                                                                                        var29 = module0032.f1745(var27, var28);
                                                                                        if (NIL != module0032.f1746(var28, var29) && NIL == module0249.f16059(var29, module0139.$g1636$.getDynamicValue(var1))) {
                                                                                            module0249.f16055(var29, module0139.$g1636$.getDynamicValue(var1));
                                                                                            if (NIL != module0173.f10955(var29)) {
                                                                                                var30 = module0633.f38713(var29, (SubLObject)UNPROVIDED);
                                                                                                if (NIL == var30) {
                                                                                                    Errors.warn((SubLObject)$ic52$, var29);
                                                                                                }
                                                                                                else if (NIL == module0423.f29593(var30)) {
                                                                                                    var1.resetMultipleValues();
                                                                                                    var31 = module0423.f29595(var30, (SubLObject)UNPROVIDED);
                                                                                                    var32 = var1.secondMultipleValue();
                                                                                                    var1.resetMultipleValues();
                                                                                                    Errors.warn((SubLObject)$ic53$, var29, var32);
                                                                                                    module0540.f33510(var29);
                                                                                                    var2 = Numbers.add(var2, (SubLObject)ONE_INTEGER);
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                }
                                                                                else if (var25.isList()) {
                                                                                    SubLObject var82_181 = var25;
                                                                                    SubLObject var34 = (SubLObject)NIL;
                                                                                    var34 = var82_181.first();
                                                                                    while (NIL != var82_181) {
                                                                                        if (NIL == module0249.f16059(var34, module0139.$g1636$.getDynamicValue(var1))) {
                                                                                            module0249.f16055(var34, module0139.$g1636$.getDynamicValue(var1));
                                                                                            if (NIL != module0173.f10955(var34)) {
                                                                                                final SubLObject var35 = module0633.f38713(var34, (SubLObject)UNPROVIDED);
                                                                                                if (NIL == var35) {
                                                                                                    Errors.warn((SubLObject)$ic52$, var34);
                                                                                                }
                                                                                                else if (NIL == module0423.f29593(var35)) {
                                                                                                    var1.resetMultipleValues();
                                                                                                    final SubLObject var36 = module0423.f29595(var35, (SubLObject)UNPROVIDED);
                                                                                                    final SubLObject var37 = var1.secondMultipleValue();
                                                                                                    var1.resetMultipleValues();
                                                                                                    Errors.warn((SubLObject)$ic53$, var34, var37);
                                                                                                    module0540.f33510(var34);
                                                                                                    var2 = Numbers.add(var2, (SubLObject)ONE_INTEGER);
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                        var82_181 = var82_181.rest();
                                                                                        var34 = var82_181.first();
                                                                                    }
                                                                                }
                                                                                else {
                                                                                    Errors.error((SubLObject)$ic54$, var25);
                                                                                }
                                                                            }
                                                                            finally {
                                                                                module0138.$g1624$.rebind(var8_142, var1);
                                                                            }
                                                                        }
                                                                    }
                                                                    finally {
                                                                        module0138.$g1623$.rebind(var8_141, var1);
                                                                    }
                                                                }
                                                            }
                                                            else {
                                                                cdestructuring_bind.cdestructuring_bind_error(var40, (SubLObject)$ic56$);
                                                            }
                                                            var38 = var38.rest();
                                                            var39 = var38.first();
                                                        }
                                                    }
                                                }
                                                else if (NIL != module0155.f9785(var17, (SubLObject)UNPROVIDED)) {
                                                    SubLObject var36_183;
                                                    final SubLObject var46 = var36_183 = ((NIL != module0138.f8995()) ? module0035.f2097(module0244.f15760(module0244.f15780(module0137.f8955($ic16$)), module0141.$g1714$.getDynamicValue(var1), module0137.f8955((SubLObject)UNPROVIDED))) : module0244.f15760(module0244.f15780(module0137.f8955($ic16$)), module0141.$g1714$.getDynamicValue(var1), module0137.f8955((SubLObject)UNPROVIDED)));
                                                    SubLObject var47 = (SubLObject)NIL;
                                                    var47 = var36_183.first();
                                                    while (NIL != var36_183) {
                                                        final SubLObject var8_143 = module0138.$g1625$.currentBinding(var1);
                                                        try {
                                                            module0138.$g1625$.bind(var47, var1);
                                                            final SubLObject var49;
                                                            final SubLObject var48 = var49 = Functions.funcall(var47, var17);
                                                            if (NIL != module0077.f5302(var49)) {
                                                                final SubLObject var50 = module0077.f5333(var49);
                                                                SubLObject var51;
                                                                SubLObject var52;
                                                                SubLObject var53;
                                                                SubLObject var54;
                                                                SubLObject var55;
                                                                SubLObject var56;
                                                                for (var51 = module0032.f1741(var50), var52 = (SubLObject)NIL, var52 = module0032.f1742(var51, var50); NIL == module0032.f1744(var51, var52); var52 = module0032.f1743(var52)) {
                                                                    var53 = module0032.f1745(var51, var52);
                                                                    if (NIL != module0032.f1746(var52, var53) && NIL == module0249.f16059(var53, module0139.$g1636$.getDynamicValue(var1))) {
                                                                        module0249.f16055(var53, module0139.$g1636$.getDynamicValue(var1));
                                                                        if (NIL != module0173.f10955(var53)) {
                                                                            var54 = module0633.f38713(var53, (SubLObject)UNPROVIDED);
                                                                            if (NIL == var54) {
                                                                                Errors.warn((SubLObject)$ic52$, var53);
                                                                            }
                                                                            else if (NIL == module0423.f29593(var54)) {
                                                                                var1.resetMultipleValues();
                                                                                var55 = module0423.f29595(var54, (SubLObject)UNPROVIDED);
                                                                                var56 = var1.secondMultipleValue();
                                                                                var1.resetMultipleValues();
                                                                                Errors.warn((SubLObject)$ic53$, var53, var56);
                                                                                module0540.f33510(var53);
                                                                                var2 = Numbers.add(var2, (SubLObject)ONE_INTEGER);
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                            else if (var49.isList()) {
                                                                SubLObject var57 = var49;
                                                                SubLObject var58 = (SubLObject)NIL;
                                                                var58 = var57.first();
                                                                while (NIL != var57) {
                                                                    if (NIL == module0249.f16059(var58, module0139.$g1636$.getDynamicValue(var1))) {
                                                                        module0249.f16055(var58, module0139.$g1636$.getDynamicValue(var1));
                                                                        if (NIL != module0173.f10955(var58)) {
                                                                            final SubLObject var59 = module0633.f38713(var58, (SubLObject)UNPROVIDED);
                                                                            if (NIL == var59) {
                                                                                Errors.warn((SubLObject)$ic52$, var58);
                                                                            }
                                                                            else if (NIL == module0423.f29593(var59)) {
                                                                                var1.resetMultipleValues();
                                                                                final SubLObject var60 = module0423.f29595(var59, (SubLObject)UNPROVIDED);
                                                                                final SubLObject var61 = var1.secondMultipleValue();
                                                                                var1.resetMultipleValues();
                                                                                Errors.warn((SubLObject)$ic53$, var58, var61);
                                                                                module0540.f33510(var58);
                                                                                var2 = Numbers.add(var2, (SubLObject)ONE_INTEGER);
                                                                            }
                                                                        }
                                                                    }
                                                                    var57 = var57.rest();
                                                                    var58 = var57.first();
                                                                }
                                                            }
                                                            else {
                                                                Errors.error((SubLObject)$ic54$, var49);
                                                            }
                                                        }
                                                        finally {
                                                            module0138.$g1625$.rebind(var8_143, var1);
                                                        }
                                                        var36_183 = var36_183.rest();
                                                        var47 = var36_183.first();
                                                    }
                                                }
                                            }
                                            finally {
                                                module0141.$g1674$.rebind(var9_138, var1);
                                                module0137.$g1605$.rebind(var8_138, var1);
                                            }
                                            var15 = var15.rest();
                                            var16 = var15.first();
                                        }
                                        SubLObject var63;
                                        final SubLObject var62 = var63 = module0200.f12443(module0244.f15771(module0137.f8955($ic16$)));
                                        SubLObject var64 = (SubLObject)NIL;
                                        var64 = var63.first();
                                        while (NIL != var63) {
                                            final SubLObject var8_144 = module0137.$g1605$.currentBinding(var1);
                                            final SubLObject var9_139 = module0141.$g1674$.currentBinding(var1);
                                            try {
                                                module0137.$g1605$.bind(var64, var1);
                                                module0141.$g1674$.bind((SubLObject)((NIL != module0141.f9205((SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)) ? makeBoolean(NIL == module0141.$g1674$.getDynamicValue(var1)) : module0141.$g1674$.getDynamicValue(var1)), var1);
                                                final SubLObject var65 = module0228.f15229(var135_136);
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
                                                                    final SubLObject var8_145 = module0138.$g1623$.currentBinding(var1);
                                                                    try {
                                                                        module0138.$g1623$.bind(var69, var1);
                                                                        SubLObject var157_162;
                                                                        for (var157_162 = module0066.f4838(module0067.f4891(var70)); NIL == module0066.f4841(var157_162); var157_162 = module0066.f4840(var157_162)) {
                                                                            var1.resetMultipleValues();
                                                                            final SubLObject var71 = module0066.f4839(var157_162);
                                                                            final SubLObject var72 = var1.secondMultipleValue();
                                                                            var1.resetMultipleValues();
                                                                            if (NIL != module0141.f9289(var71)) {
                                                                                final SubLObject var8_146 = module0138.$g1624$.currentBinding(var1);
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
                                                                                                module0056.f4149(var77, var7);
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
                                                                                                module0056.f4149(var79, var7);
                                                                                            }
                                                                                            var78 = var78.rest();
                                                                                            var79 = var78.first();
                                                                                        }
                                                                                    }
                                                                                    else {
                                                                                        Errors.error((SubLObject)$ic54$, var73);
                                                                                    }
                                                                                }
                                                                                finally {
                                                                                    module0138.$g1624$.rebind(var8_146, var1);
                                                                                }
                                                                            }
                                                                        }
                                                                        module0066.f4842(var157_162);
                                                                    }
                                                                    finally {
                                                                        module0138.$g1623$.rebind(var8_145, var1);
                                                                    }
                                                                }
                                                            }
                                                            module0066.f4842(var68);
                                                        }
                                                    }
                                                    else {
                                                        module0136.f8870((SubLObject)FIVE_INTEGER, (SubLObject)$ic55$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                                                    }
                                                }
                                                else if (NIL != module0155.f9785(var65, (SubLObject)UNPROVIDED)) {
                                                    SubLObject var36_184;
                                                    final SubLObject var80 = var36_184 = ((NIL != module0138.f8995()) ? module0035.f2097(module0244.f15760(module0138.f8979(), module0141.$g1714$.getDynamicValue(var1), module0137.f8955((SubLObject)UNPROVIDED))) : module0244.f15760(module0138.f8979(), module0141.$g1714$.getDynamicValue(var1), module0137.f8955((SubLObject)UNPROVIDED)));
                                                    SubLObject var81 = (SubLObject)NIL;
                                                    var81 = var36_184.first();
                                                    while (NIL != var36_184) {
                                                        final SubLObject var8_147 = module0138.$g1625$.currentBinding(var1);
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
                                                                        module0056.f4149(var87, var7);
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
                                                                        module0056.f4149(var89, var7);
                                                                    }
                                                                    var88 = var88.rest();
                                                                    var89 = var88.first();
                                                                }
                                                            }
                                                            else {
                                                                Errors.error((SubLObject)$ic54$, var83);
                                                            }
                                                        }
                                                        finally {
                                                            module0138.$g1625$.rebind(var8_147, var1);
                                                        }
                                                        var36_184 = var36_184.rest();
                                                        var81 = var36_184.first();
                                                    }
                                                }
                                            }
                                            finally {
                                                module0141.$g1674$.rebind(var9_139, var1);
                                                module0137.$g1605$.rebind(var8_144, var1);
                                            }
                                            var63 = var63.rest();
                                            var64 = var63.first();
                                        }
                                        var135_136 = module0056.f4150(var7);
                                    }
                                }
                                finally {
                                    module0141.$g1674$.rebind(var10_148, var1);
                                    module0138.$g1619$.rebind(var9_137, var1);
                                    module0141.$g1677$.rebind(var8_137, var1);
                                }
                            }
                            else {
                                module0136.f8872((SubLObject)TWO_INTEGER, (SubLObject)$ic57$, var5, module0244.f15748(module0137.f8955((SubLObject)UNPROVIDED)), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                            }
                        }
                        finally {
                            module0137.$g1605$.rebind(var12, var1);
                            module0141.$g1674$.rebind(var11, var1);
                            module0141.$g1672$.rebind(var10, var1);
                            module0141.$g1671$.rebind(var9_136, var1);
                            module0141.$g1670$.rebind(var8_136, var1);
                        }
                    }
                    finally {
                        module0141.$g1715$.rebind(var9_135, var1);
                        module0141.$g1714$.rebind(var8_135, var1);
                    }
                    module0139.f9011(module0139.$g1635$.getDynamicValue(var1));
                }
                finally {
                    module0139.$g1635$.rebind(var8_134, var1);
                }
                module0139.f9011(module0139.$g1636$.getDynamicValue(var1));
            }
            finally {
                module0139.$g1636$.rebind(var9_134, var1);
                module0137.$g1605$.rebind(var8_133, var1);
            }
        }
        finally {
            module0147.$g2095$.rebind(var4, var1);
            module0147.$g2094$.rebind(var3, var1);
        }
        return var2;
    }
    
    public static SubLObject f34869() {
        SubLObject var196 = (SubLObject)ZERO_INTEGER;
        for (SubLObject var197 = (SubLObject)ONE_INTEGER; var197.numG((SubLObject)ZERO_INTEGER); var197 = f34874()) {
            var196 = Numbers.add(var196, (SubLObject)ONE_INTEGER);
        }
        return var196;
    }
    
    public static SubLObject f34874() {
        return module0569.f34924(f34875(), (SubLObject)$ic58$);
    }
    
    public static SubLObject f34875() {
        final SubLThread var1 = SubLProcess.currentSubLThread();
        SubLObject var2 = (SubLObject)NIL;
        final SubLObject var3 = module0167.f10788();
        final SubLObject var4 = (SubLObject)$ic59$;
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
            final SubLObject var12_198 = var3;
            if (NIL == module0065.f4772(var12_198, (SubLObject)$ic4$)) {
                final SubLObject var14_199 = var12_198;
                if (NIL == module0065.f4775(var14_199, (SubLObject)$ic4$)) {
                    final SubLObject var11 = module0065.f4740(var14_199);
                    final SubLObject var12 = (SubLObject)NIL;
                    SubLObject var13;
                    SubLObject var14;
                    SubLObject var15;
                    SubLObject var16;
                    SubLObject var17;
                    SubLObject var8_201;
                    for (var13 = Sequences.length(var11), var14 = (SubLObject)NIL, var14 = (SubLObject)ZERO_INTEGER; var14.numL(var13); var14 = Numbers.add(var14, (SubLObject)ONE_INTEGER)) {
                        var15 = ((NIL != var12) ? Numbers.subtract(var13, var14, (SubLObject)ONE_INTEGER) : var14);
                        var16 = Vectors.aref(var11, var15);
                        if (NIL == module0065.f4749(var16) || NIL == module0065.f4773((SubLObject)$ic4$)) {
                            if (NIL != module0065.f4749(var16)) {
                                var16 = (SubLObject)$ic4$;
                            }
                            module0012.note_percent_progress(var6, var5);
                            var6 = Numbers.add(var6, (SubLObject)ONE_INTEGER);
                            var17 = (SubLObject)NIL;
                            try {
                                var1.throwStack.push($ic13$);
                                var8_201 = Errors.$error_handler$.currentBinding(var1);
                                try {
                                    Errors.$error_handler$.bind(Symbols.symbol_function((SubLObject)$ic14$), var1);
                                    try {
                                        if (NIL == f34876(var16)) {
                                            var2 = (SubLObject)ConsesLow.cons(var16, var2);
                                        }
                                    }
                                    catch (Throwable var18) {
                                        Errors.handleThrowable(var18, (SubLObject)NIL);
                                    }
                                }
                                finally {
                                    Errors.$error_handler$.rebind(var8_201, var1);
                                }
                            }
                            catch (Throwable var19) {
                                var17 = Errors.handleThrowable(var19, (SubLObject)$ic13$);
                            }
                            finally {
                                var1.throwStack.pop();
                            }
                        }
                    }
                }
                final SubLObject var24_202 = var12_198;
                if (NIL == module0065.f4777(var24_202) || NIL == module0065.f4773((SubLObject)$ic4$)) {
                    final SubLObject var20 = module0065.f4738(var24_202);
                    SubLObject var21 = module0065.f4739(var24_202);
                    final SubLObject var22 = module0065.f4734(var24_202);
                    final SubLObject var23 = (SubLObject)((NIL != module0065.f4773((SubLObject)$ic4$)) ? NIL : $ic4$);
                    while (var21.numL(var22)) {
                        final SubLObject var24 = Hashtables.gethash_without_values(var21, var20, var23);
                        if (NIL == module0065.f4773((SubLObject)$ic4$) || NIL == module0065.f4749(var24)) {
                            module0012.note_percent_progress(var6, var5);
                            var6 = Numbers.add(var6, (SubLObject)ONE_INTEGER);
                            SubLObject var25 = (SubLObject)NIL;
                            try {
                                var1.throwStack.push($ic13$);
                                final SubLObject var8_202 = Errors.$error_handler$.currentBinding(var1);
                                try {
                                    Errors.$error_handler$.bind(Symbols.symbol_function((SubLObject)$ic14$), var1);
                                    try {
                                        if (NIL == f34876(var24)) {
                                            var2 = (SubLObject)ConsesLow.cons(var24, var2);
                                        }
                                    }
                                    catch (Throwable var26) {
                                        Errors.handleThrowable(var26, (SubLObject)NIL);
                                    }
                                }
                                finally {
                                    Errors.$error_handler$.rebind(var8_202, var1);
                                }
                            }
                            catch (Throwable var27) {
                                var25 = Errors.handleThrowable(var27, (SubLObject)$ic13$);
                            }
                            finally {
                                var1.throwStack.pop();
                            }
                        }
                        var21 = Numbers.add(var21, (SubLObject)ONE_INTEGER);
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
        return Sequences.nreverse(var2);
    }
    
    public static SubLObject f34876(final SubLObject var108) {
        assert NIL != module0167.f10813(var108) : var108;
        final SubLObject var109 = module0172.f10943(var108);
        SubLObject var110 = (SubLObject)NIL;
        if (NIL == var110) {
            SubLObject var111 = var109;
            SubLObject var112 = (SubLObject)NIL;
            var112 = var111.first();
            while (NIL == var110 && NIL != var111) {
                if (NIL != f34877(var112)) {
                    var110 = var112;
                }
                var111 = var111.rest();
                var112 = var111.first();
            }
        }
        return var110;
    }
    
    public static SubLObject f34877(final SubLObject var100) {
        assert NIL != assertion_handles_oc.f11035(var100) : var100;
        return (SubLObject)makeBoolean(NIL != module0178.f11290(var100) || NIL == module0035.f2169(module0178.f11332(var100), $g4136$.getGlobalValue()));
    }
    
    public static SubLObject f34878() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0566", "f34860", "S#37957", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0566", "f34870", "S#38234", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0566", "f34861", "S#38235", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0566", "f34871", "S#38236", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0566", "f34862", "S#38237", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0566", "f34863", "S#38238", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0566", "f34865", "S#38239", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0566", "f34864", "S#38240", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0566", "f34866", "S#38241", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0566", "f34867", "S#38242", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0566", "f34872", "S#38243", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0566", "f34873", "S#38244", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0566", "f34868", "S#38245", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0566", "f34869", "S#38246", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0566", "f34874", "S#38247", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0566", "f34875", "S#38248", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0566", "f34876", "S#38249", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0566", "f34877", "S#38250", 1, 0, false);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f34879() {
        $g4133$ = SubLFiles.defvar("S#38251", (SubLObject)$ic0$);
        $g4134$ = SubLFiles.defparameter("S#38252", (SubLObject)NIL);
        $g4135$ = SubLFiles.defparameter("S#38253", (SubLObject)$ic29$);
        $g4136$ = SubLFiles.deflexical("S#38254", (SubLObject)$ic61$);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f34880() {
        return (SubLObject)NIL;
    }
    
    public void declareFunctions() {
        f34878();
    }
    
    public void initializeVariables() {
        f34879();
    }
    
    public void runTopLevelForms() {
        f34880();
    }
    
    static {
        me = (SubLFile)new module0566();
        $g4133$ = null;
        $g4134$ = null;
        $g4135$ = null;
        $g4136$ = null;
        $ic0$ = ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("cyclistNotes")));
        $ic1$ = makeString("opencyc");
        $ic2$ = makeString("Clearing invalid bookkeeping assertions");
        $ic3$ = makeSymbol("STRINGP");
        $ic4$ = makeKeyword("SKIP");
        $ic5$ = constant_handles_oc.f8479((SubLObject)makeString("myCreator"));
        $ic6$ = constant_handles_oc.f8479((SubLObject)makeString("BookkeepingMt"));
        $ic7$ = constant_handles_oc.f8479((SubLObject)makeString("myCreationPurpose"));
        $ic8$ = makeString("Fixing invalid deductions");
        $ic9$ = makeString("invalid deduction: ~S");
        $ic10$ = makeSymbol("DEDUCTION-P");
        $ic11$ = makeString("clearing extent of ~S");
        $ic12$ = makeKeyword("GAF");
        $ic13$ = makeKeyword("IGNORE-ERRORS-TARGET");
        $ic14$ = makeSymbol("IGNORE-ERRORS-HANDLER", "SUBLISP");
        $ic15$ = makeString("Killing terms without isa assertions (this message will appear twice (constants then NARTs))");
        $ic16$ = constant_handles_oc.f8479((SubLObject)makeString("isa"));
        $ic17$ = makeString("Killing ~S (~S)");
        $ic18$ = makeSymbol("S#12274", "CYC");
        $ic19$ = constant_handles_oc.f8479((SubLObject)makeString("EverythingPSC"));
        $ic20$ = constant_handles_oc.f8479((SubLObject)makeString("HLPrototypicalTerm"));
        $ic21$ = makeString("Killing naked prototypicals");
        $ic22$ = constant_handles_oc.f8479((SubLObject)makeString("hlPrototypicalInstance"));
        $ic23$ = makeString("Killing ~S");
        $ic24$ = constant_handles_oc.f8479((SubLObject)makeString("SkolemFunction"));
        $ic25$ = makeString("Killing empty skolems");
        $ic26$ = makeString("Removing bad #$termOfUnit assertions...");
        $ic27$ = constant_handles_oc.f8479((SubLObject)makeString("termOfUnit"));
        $ic28$ = makeString("Removing ~A");
        $ic29$ = ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("termOfUnit")), constant_handles_oc.f8479((SubLObject)makeString("isa")), constant_handles_oc.f8479((SubLObject)makeString("genls")));
        $ic30$ = makeString("Killing NARTs with only definitional info");
        $ic31$ = makeString("Keeping ~S (~S)");
        $ic32$ = makeString("Removing invalid arguments");
        $ic33$ = makeString("Assertion ~S removed!");
        $ic34$ = makeString("Removing redundant true asserted arguments");
        $ic35$ = makeKeyword("TRUE");
        $ic36$ = makeKeyword("FALSE");
        $ic37$ = makeSymbol("ARGUMENT-TRUTH");
        $ic38$ = makeString("Assertion removed!");
        $ic39$ = makeString("Removing invalid KB queries");
        $ic40$ = constant_handles_oc.f8479((SubLObject)makeString("KBContentTest-FullySpecified"));
        $ic41$ = makeKeyword("BREADTH");
        $ic42$ = makeKeyword("QUEUE");
        $ic43$ = makeKeyword("STACK");
        $ic44$ = makeSymbol("S#11450", "CYC");
        $ic45$ = makeKeyword("ERROR");
        $ic46$ = makeString("~A is not a ~A");
        $ic47$ = makeSymbol("S#11592", "CYC");
        $ic48$ = makeKeyword("CERROR");
        $ic49$ = makeString("continue anyway");
        $ic50$ = makeKeyword("WARN");
        $ic51$ = makeString("~A is not a valid *sbhl-type-error-action* value");
        $ic52$ = makeString("Killing query ~A because it has no query specification.");
        $ic53$ = makeString("Killing invalid query ~A because: ~A");
        $ic54$ = makeString("~A is neither SET-P nor LISTP.");
        $ic55$ = makeString("attempting to bind direction link variable, to NIL. macro body not executed.");
        $ic56$ = ConsesLow.list((SubLObject)makeUninternedSymbol("US#4D5E436"), (SubLObject)makeUninternedSymbol("US#1526883"), (SubLObject)makeUninternedSymbol("US#15AA083"));
        $ic57$ = makeString("Node ~a does not pass sbhl-type-test ~a~%");
        $ic58$ = makeString("Forgetting useless NARTs wrt OpenCyc");
        $ic59$ = makeString("Gathering useless NARTs wrt OpenCyc");
        $ic60$ = makeSymbol("NART-P");
        $ic61$ = ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("prettyString")), constant_handles_oc.f8479((SubLObject)makeString("prettyString-Canonical")), constant_handles_oc.f8479((SubLObject)makeString("isa")), constant_handles_oc.f8479((SubLObject)makeString("quotedIsa")));
        $ic62$ = makeSymbol("ASSERTION-P");
    }
}

/*
	DECOMPILATION REPORT

	Decompiled from: G:\opt\CYC_JRTL_with_CommonLisp\platform\lib\cyc-oc4.0-unzipped/com/cyc/cycjava/cycl/class
	Total time: 1533 ms
	
	Decompiled with Procyon 0.5.32.
*/