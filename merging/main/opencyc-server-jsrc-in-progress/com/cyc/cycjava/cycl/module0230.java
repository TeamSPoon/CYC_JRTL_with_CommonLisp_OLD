package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sort;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class module0230 extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.module0230";
    public static final String myFingerPrint = "88f4a21cb2fd217da19012b4d2c91a17f5699cbbd441d10e2ad652b745042364";
    private static SubLSymbol $g2425$;
    private static final SubLSymbol $ic0$;
    private static final SubLObject $ic1$;
    private static final SubLSymbol $ic2$;
    private static final SubLSymbol $ic3$;
    private static final SubLSymbol $ic4$;
    private static final SubLInteger $ic5$;
    private static final SubLSymbol $ic6$;
    private static final SubLSymbol $ic7$;
    private static final SubLSymbol $ic8$;
    private static final SubLSymbol $ic9$;
    private static final SubLObject $ic10$;
    private static final SubLObject $ic11$;
    private static final SubLObject $ic12$;
    
    public static SubLObject f15275(final SubLObject var1) {
        final SubLThread var2 = SubLProcess.currentSubLThread();
        SubLObject var3 = (SubLObject)NIL;
        final SubLObject var4 = module0147.$g2094$.currentBinding(var2);
        final SubLObject var5 = module0147.$g2095$.currentBinding(var2);
        try {
            module0147.$g2094$.bind((SubLObject)$ic0$, var2);
            module0147.$g2095$.bind($ic1$, var2);
            var3 = f15276(var1, (SubLObject)UNPROVIDED);
        }
        finally {
            module0147.$g2095$.rebind(var5, var2);
            module0147.$g2094$.rebind(var4, var2);
        }
        return var3;
    }
    
    public static SubLObject f15276(final SubLObject var1, SubLObject var6) {
        if (var6 == UNPROVIDED) {
            var6 = (SubLObject)NIL;
        }
        final SubLThread var7 = SubLProcess.currentSubLThread();
        SubLObject var8 = (SubLObject)NIL;
        if (NIL != module0178.f11290(var1)) {
            final SubLObject var9 = var6;
            final SubLObject var10 = module0147.$g2095$.currentBinding(var7);
            final SubLObject var11 = module0147.$g2094$.currentBinding(var7);
            final SubLObject var12 = module0147.$g2096$.currentBinding(var7);
            try {
                module0147.$g2095$.bind(module0147.f9545(var9), var7);
                module0147.$g2094$.bind(module0147.f9546(var9), var7);
                module0147.$g2096$.bind(module0147.f9549(var9), var7);
                if (NIL != module0158.f10221(var1, (SubLObject)NIL)) {
                    final SubLObject var13 = module0158.f10222(var1, (SubLObject)NIL);
                    SubLObject var14 = var8;
                    final SubLObject var15 = (SubLObject)NIL;
                    while (NIL == var14) {
                        final SubLObject var16 = module0052.f3695(var13, var15);
                        final SubLObject var17 = (SubLObject)makeBoolean(!var15.eql(var16));
                        if (NIL != var17) {
                            SubLObject var18 = (SubLObject)NIL;
                            try {
                                var18 = module0158.f10316(var16, (SubLObject)$ic2$, (SubLObject)NIL, (SubLObject)NIL);
                                SubLObject var11_16 = var8;
                                final SubLObject var12_17 = (SubLObject)NIL;
                                while (NIL == var11_16) {
                                    final SubLObject var19 = module0052.f3695(var18, var12_17);
                                    final SubLObject var14_19 = (SubLObject)makeBoolean(!var12_17.eql(var19));
                                    if (NIL != var14_19) {
                                        var8 = (SubLObject)T;
                                    }
                                    var11_16 = (SubLObject)makeBoolean(NIL == var14_19 || NIL != var8);
                                }
                            }
                            finally {
                                final SubLObject var4_20 = Threads.$is_thread_performing_cleanupP$.currentBinding(var7);
                                try {
                                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)T, var7);
                                    if (NIL != var18) {
                                        module0158.f10319(var18);
                                    }
                                }
                                finally {
                                    Threads.$is_thread_performing_cleanupP$.rebind(var4_20, var7);
                                }
                            }
                        }
                        var14 = (SubLObject)makeBoolean(NIL == var17 || NIL != var8);
                    }
                }
            }
            finally {
                module0147.$g2096$.rebind(var12, var7);
                module0147.$g2094$.rebind(var11, var7);
                module0147.$g2095$.rebind(var10, var7);
            }
        }
        return var8;
    }
    
    public static SubLObject f15277(final SubLObject var1, SubLObject var6) {
        if (var6 == UNPROVIDED) {
            var6 = (SubLObject)NIL;
        }
        final SubLThread var7 = SubLProcess.currentSubLThread();
        SubLObject var8 = (SubLObject)NIL;
        if (NIL != module0178.f11290(var1)) {
            final SubLObject var9 = var6;
            final SubLObject var10 = module0147.$g2095$.currentBinding(var7);
            final SubLObject var11 = module0147.$g2094$.currentBinding(var7);
            final SubLObject var12 = module0147.$g2096$.currentBinding(var7);
            try {
                module0147.$g2095$.bind(module0147.f9545(var9), var7);
                module0147.$g2094$.bind(module0147.f9546(var9), var7);
                module0147.$g2096$.bind(module0147.f9549(var9), var7);
                if (NIL != module0158.f10221(var1, (SubLObject)NIL)) {
                    final SubLObject var13 = module0158.f10222(var1, (SubLObject)NIL);
                    SubLObject var14 = var8;
                    final SubLObject var15 = (SubLObject)NIL;
                    while (NIL == var14) {
                        final SubLObject var16 = module0052.f3695(var13, var15);
                        final SubLObject var17 = (SubLObject)makeBoolean(!var15.eql(var16));
                        if (NIL != var17) {
                            SubLObject var18 = (SubLObject)NIL;
                            try {
                                var18 = module0158.f10316(var16, (SubLObject)$ic2$, (SubLObject)NIL, (SubLObject)NIL);
                                SubLObject var11_21 = var8;
                                final SubLObject var12_22 = (SubLObject)NIL;
                                while (NIL == var11_21) {
                                    final SubLObject var19 = module0052.f3695(var18, var12_22);
                                    final SubLObject var14_23 = (SubLObject)makeBoolean(!var12_22.eql(var19));
                                    if (NIL != var14_23) {
                                        var8 = module0211.f13668(var19);
                                    }
                                    var11_21 = (SubLObject)makeBoolean(NIL == var14_23 || NIL != var8);
                                }
                            }
                            finally {
                                final SubLObject var4_24 = Threads.$is_thread_performing_cleanupP$.currentBinding(var7);
                                try {
                                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)T, var7);
                                    if (NIL != var18) {
                                        module0158.f10319(var18);
                                    }
                                }
                                finally {
                                    Threads.$is_thread_performing_cleanupP$.rebind(var4_24, var7);
                                }
                            }
                        }
                        var14 = (SubLObject)makeBoolean(NIL == var17 || NIL != var8);
                    }
                }
            }
            finally {
                module0147.$g2096$.rebind(var12, var7);
                module0147.$g2094$.rebind(var11, var7);
                module0147.$g2095$.rebind(var10, var7);
            }
        }
        return var8;
    }
    
    public static SubLObject f15278(final SubLObject var25, final SubLObject var6) {
        final SubLThread var26 = SubLProcess.currentSubLThread();
        final SubLObject var27 = module0217.f14420(var25);
        SubLObject var28 = (SubLObject)NIL;
        final SubLObject var29 = module0147.f9540(var6);
        final SubLObject var30 = module0147.$g2095$.currentBinding(var26);
        final SubLObject var31 = module0147.$g2094$.currentBinding(var26);
        final SubLObject var32 = module0147.$g2096$.currentBinding(var26);
        try {
            module0147.$g2095$.bind(module0147.f9545(var29), var26);
            module0147.$g2094$.bind(module0147.f9546(var29), var26);
            module0147.$g2096$.bind(module0147.f9549(var29), var26);
            SubLObject var33 = var27;
            SubLObject var34 = (SubLObject)NIL;
            var34 = var33.first();
            while (NIL != var33) {
                if (NIL != module0147.f9507(module0178.f11287(var34))) {
                    var28 = (SubLObject)ConsesLow.cons(var34, var28);
                }
                var33 = var33.rest();
                var34 = var33.first();
            }
        }
        finally {
            module0147.$g2096$.rebind(var32, var26);
            module0147.$g2094$.rebind(var31, var26);
            module0147.$g2095$.rebind(var30, var26);
        }
        return Sequences.nreverse(var28);
    }
    
    public static SubLObject f15279(final SubLObject var30) {
        final SubLThread var31 = SubLProcess.currentSubLThread();
        assert NIL != module0173.f10955(var30) : var30;
        SubLObject var32 = (SubLObject)NIL;
        final SubLObject var33 = module0147.f9540(module0132.$g1558$.getGlobalValue());
        final SubLObject var34 = module0147.$g2095$.currentBinding(var31);
        final SubLObject var35 = module0147.$g2094$.currentBinding(var31);
        final SubLObject var36 = module0147.$g2096$.currentBinding(var31);
        try {
            module0147.$g2095$.bind(module0147.f9545(var33), var31);
            module0147.$g2094$.bind(module0147.f9546(var33), var31);
            module0147.$g2096$.bind(module0147.f9549(var33), var31);
            if (NIL != module0158.f10054(var30, (SubLObject)NIL, (SubLObject)NIL)) {
                final SubLObject var37 = module0158.f10055(var30, (SubLObject)NIL, (SubLObject)NIL);
                SubLObject var38 = (SubLObject)NIL;
                final SubLObject var39 = (SubLObject)NIL;
                while (NIL == var38) {
                    final SubLObject var40 = module0052.f3695(var37, var39);
                    final SubLObject var41 = (SubLObject)makeBoolean(!var39.eql(var40));
                    if (NIL != var41) {
                        SubLObject var42 = (SubLObject)NIL;
                        try {
                            var42 = module0158.f10316(var40, (SubLObject)$ic4$, (SubLObject)NIL, (SubLObject)NIL);
                            SubLObject var11_33 = (SubLObject)NIL;
                            final SubLObject var12_34 = (SubLObject)NIL;
                            while (NIL == var11_33) {
                                final SubLObject var43 = module0052.f3695(var42, var12_34);
                                final SubLObject var14_36 = (SubLObject)makeBoolean(!var12_34.eql(var43));
                                if (NIL != var14_36) {
                                    var32 = (SubLObject)ConsesLow.cons(module0178.f11334(var43), var32);
                                }
                                var11_33 = (SubLObject)makeBoolean(NIL == var14_36);
                            }
                        }
                        finally {
                            final SubLObject var4_37 = Threads.$is_thread_performing_cleanupP$.currentBinding(var31);
                            try {
                                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)T, var31);
                                if (NIL != var42) {
                                    module0158.f10319(var42);
                                }
                            }
                            finally {
                                Threads.$is_thread_performing_cleanupP$.rebind(var4_37, var31);
                            }
                        }
                    }
                    var38 = (SubLObject)makeBoolean(NIL == var41);
                }
            }
            if (NIL != module0158.f10078(var30)) {
                final SubLObject var44 = module0158.f10080(var30);
                SubLObject var45 = (SubLObject)NIL;
                try {
                    var45 = module0158.f10316(var44, (SubLObject)$ic4$, (SubLObject)NIL, (SubLObject)NIL);
                    SubLObject var46 = (SubLObject)NIL;
                    final SubLObject var47 = (SubLObject)NIL;
                    while (NIL == var46) {
                        final SubLObject var48 = module0052.f3695(var45, var47);
                        final SubLObject var49 = (SubLObject)makeBoolean(!var47.eql(var48));
                        if (NIL != var49) {
                            var32 = (SubLObject)ConsesLow.cons(module0178.f11334(var48), var32);
                        }
                        var46 = (SubLObject)makeBoolean(NIL == var49);
                    }
                }
                finally {
                    final SubLObject var4_38 = Threads.$is_thread_performing_cleanupP$.currentBinding(var31);
                    try {
                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)T, var31);
                        if (NIL != var45) {
                            module0158.f10319(var45);
                        }
                    }
                    finally {
                        Threads.$is_thread_performing_cleanupP$.rebind(var4_38, var31);
                    }
                }
            }
            if (NIL != module0158.f10274(var30, (SubLObject)NIL)) {
                final SubLObject var50 = module0158.f10275(var30);
                SubLObject var45 = (SubLObject)NIL;
                try {
                    var45 = module0158.f10316(var50, (SubLObject)NIL, (SubLObject)NIL, (SubLObject)NIL);
                    SubLObject var46 = (SubLObject)NIL;
                    final SubLObject var47 = (SubLObject)NIL;
                    while (NIL == var46) {
                        final SubLObject var48 = module0052.f3695(var45, var47);
                        final SubLObject var49 = (SubLObject)makeBoolean(!var47.eql(var48));
                        if (NIL != var49 && NIL != module0158.f10280(var48) && NIL != f15280(var48, var30)) {
                            var32 = (SubLObject)ConsesLow.cons(module0178.f11334(var48), var32);
                        }
                        var46 = (SubLObject)makeBoolean(NIL == var49);
                    }
                }
                finally {
                    final SubLObject var4_39 = Threads.$is_thread_performing_cleanupP$.currentBinding(var31);
                    try {
                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)T, var31);
                        if (NIL != var45) {
                            module0158.f10319(var45);
                        }
                    }
                    finally {
                        Threads.$is_thread_performing_cleanupP$.rebind(var4_39, var31);
                    }
                }
            }
        }
        finally {
            module0147.$g2096$.rebind(var36, var31);
            module0147.$g2094$.rebind(var35, var31);
            module0147.$g2095$.rebind(var34, var31);
        }
        return module0035.f2269(var32, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f15280(final SubLObject var35, final SubLObject var30) {
        return (SubLObject)makeBoolean(NIL != module0228.f15209(var35) && NIL != module0205.f13220(var30, module0178.f11335(var35), (SubLObject)T, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED));
    }
    
    public static SubLObject f15281(final SubLObject var42, SubLObject var43) {
        if (var43 == UNPROVIDED) {
            var43 = (SubLObject)$ic5$;
        }
        SubLObject var44 = (SubLObject)NIL;
        if (NIL != module0178.f11290(var42)) {
            if (var43.numGE((SubLObject)ZERO_INTEGER) && NIL == conses_high.member(var42, var44, (SubLObject)EQUAL, Symbols.symbol_function((SubLObject)IDENTITY))) {
                var44 = (SubLObject)ConsesLow.cons(var42, var44);
            }
            SubLObject var45 = module0232.f15306(module0178.f11282(var42));
            SubLObject var46 = (SubLObject)NIL;
            var46 = var45.first();
            while (NIL != var45) {
                if (var43.numGE((SubLObject)MINUS_ONE_INTEGER)) {
                    final SubLObject var47 = var46;
                    if (NIL == conses_high.member(var47, var44, (SubLObject)EQUAL, Symbols.symbol_function((SubLObject)IDENTITY))) {
                        var44 = (SubLObject)ConsesLow.cons(var47, var44);
                    }
                }
                SubLObject var28_46 = f15281(var46, var43);
                SubLObject var48 = (SubLObject)NIL;
                var48 = var28_46.first();
                while (NIL != var28_46) {
                    final SubLObject var49 = var48;
                    if (NIL == conses_high.member(var49, var44, (SubLObject)EQUAL, Symbols.symbol_function((SubLObject)IDENTITY))) {
                        var44 = (SubLObject)ConsesLow.cons(var49, var44);
                    }
                    var28_46 = var28_46.rest();
                    var48 = var28_46.first();
                }
                var45 = var45.rest();
                var46 = var45.first();
            }
            var45 = module0232.f15308(module0178.f11282(var42));
            var46 = (SubLObject)NIL;
            var46 = var45.first();
            while (NIL != var45) {
                if (var43.numGE((SubLObject)MINUS_ONE_INTEGER)) {
                    final SubLObject var47 = var46;
                    if (NIL == conses_high.member(var47, var44, (SubLObject)EQUAL, Symbols.symbol_function((SubLObject)IDENTITY))) {
                        var44 = (SubLObject)ConsesLow.cons(var47, var44);
                    }
                }
                SubLObject var28_47 = f15281(var46, var43);
                SubLObject var48 = (SubLObject)NIL;
                var48 = var28_47.first();
                while (NIL != var28_47) {
                    final SubLObject var49 = var48;
                    if (NIL == conses_high.member(var49, var44, (SubLObject)EQUAL, Symbols.symbol_function((SubLObject)IDENTITY))) {
                        var44 = (SubLObject)ConsesLow.cons(var49, var44);
                    }
                    var28_47 = var28_47.rest();
                    var48 = var28_47.first();
                }
                var45 = var45.rest();
                var46 = var45.first();
            }
        }
        else if (NIL != module0178.f11284(var42)) {
            if (var43.numGE((SubLObject)ZERO_INTEGER) && NIL == conses_high.member(var42, var44, (SubLObject)EQUAL, Symbols.symbol_function((SubLObject)IDENTITY))) {
                var44 = (SubLObject)ConsesLow.cons(var42, var44);
            }
            SubLObject var51;
            final SubLObject var50 = var51 = module0205.f13207(module0178.f11328(var42), (SubLObject)$ic6$);
            SubLObject var52 = (SubLObject)NIL;
            var52 = var51.first();
            while (NIL != var51) {
                SubLObject var28_48 = f15281(var52, Numbers.add(var43, (SubLObject)ONE_INTEGER));
                SubLObject var53 = (SubLObject)NIL;
                var53 = var28_48.first();
                while (NIL != var28_48) {
                    final SubLObject var54 = var53;
                    if (NIL == conses_high.member(var54, var44, (SubLObject)EQUAL, Symbols.symbol_function((SubLObject)IDENTITY))) {
                        var44 = (SubLObject)ConsesLow.cons(var54, var44);
                    }
                    var28_48 = var28_48.rest();
                    var53 = var28_48.first();
                }
                var51 = var51.rest();
                var52 = var51.first();
            }
        }
        else if (NIL != module0167.f10813(var42)) {
            if (var43.numGE((SubLObject)ZERO_INTEGER) && NIL == conses_high.member(var42, var44, (SubLObject)EQUAL, Symbols.symbol_function((SubLObject)IDENTITY))) {
                var44 = (SubLObject)ConsesLow.cons(var42, var44);
            }
            SubLObject var51;
            final SubLObject var50 = var51 = module0205.f13207(module0172.f10915(var42), (SubLObject)$ic6$);
            SubLObject var55 = (SubLObject)NIL;
            var55 = var51.first();
            while (NIL != var51) {
                SubLObject var28_49 = f15281(var55, Numbers.add(var43, (SubLObject)ONE_INTEGER));
                SubLObject var53 = (SubLObject)NIL;
                var53 = var28_49.first();
                while (NIL != var28_49) {
                    final SubLObject var54 = var53;
                    if (NIL == conses_high.member(var54, var44, (SubLObject)EQUAL, Symbols.symbol_function((SubLObject)IDENTITY))) {
                        var44 = (SubLObject)ConsesLow.cons(var54, var44);
                    }
                    var28_49 = var28_49.rest();
                    var53 = var28_49.first();
                }
                var51 = var51.rest();
                var55 = var51.first();
            }
        }
        else if (var42.isCons()) {
            if (var43.numGE((SubLObject)ZERO_INTEGER) && NIL == conses_high.member(var42, var44, (SubLObject)EQUAL, Symbols.symbol_function((SubLObject)IDENTITY))) {
                var44 = (SubLObject)ConsesLow.cons(var42, var44);
            }
            SubLObject var51;
            final SubLObject var50 = var51 = module0205.f13207(var42, (SubLObject)$ic6$);
            SubLObject var52 = (SubLObject)NIL;
            var52 = var51.first();
            while (NIL != var51) {
                SubLObject var28_50 = f15281(var52, Numbers.add(var43, (SubLObject)ONE_INTEGER));
                SubLObject var53 = (SubLObject)NIL;
                var53 = var28_50.first();
                while (NIL != var28_50) {
                    final SubLObject var54 = var53;
                    if (NIL == conses_high.member(var54, var44, (SubLObject)EQUAL, Symbols.symbol_function((SubLObject)IDENTITY))) {
                        var44 = (SubLObject)ConsesLow.cons(var54, var44);
                    }
                    var28_50 = var28_50.rest();
                    var53 = var28_50.first();
                }
                var51 = var51.rest();
                var52 = var51.first();
            }
        }
        return var44;
    }
    
    public static SubLObject f15282(final SubLObject var55, final SubLObject var56) {
        final SubLThread var57 = SubLProcess.currentSubLThread();
        final SubLObject var58 = $g2425$.currentBinding(var57);
        try {
            $g2425$.bind(var56, var57);
            return Sort.sort(var55, (SubLObject)$ic9$, (SubLObject)UNPROVIDED);
        }
        finally {
            $g2425$.rebind(var58, var57);
        }
    }
    
    public static SubLObject f15283(final SubLObject var57, final SubLObject var58) {
        return Numbers.numL(f15284(var57), f15284(var58));
    }
    
    public static SubLObject f15284(final SubLObject var59) {
        final SubLThread var60 = SubLProcess.currentSubLThread();
        final SubLObject var61 = module0178.f11334(var59);
        if (NIL == module0213.f14081(var61, $g2425$.getDynamicValue(var60))) {
            return (SubLObject)ONE_INTEGER;
        }
        final SubLObject var63;
        final SubLObject var62 = var63 = module0178.f11332(var59);
        if (var63.eql($ic10$)) {
            return (SubLObject)FIVE_INTEGER;
        }
        if (var63.eql($ic11$)) {
            return (SubLObject)FOUR_INTEGER;
        }
        if (var63.eql($ic12$)) {
            return (SubLObject)THREE_INTEGER;
        }
        return (SubLObject)TWO_INTEGER;
    }
    
    public static SubLObject f15285() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0230", "f15275", "S#18032", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0230", "f15276", "S#18033", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0230", "f15277", "S#18034", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0230", "f15278", "S#18035", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0230", "f15279", "DEPENDENT-NARTS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0230", "f15280", "S#18036", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0230", "f15281", "S#18037", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0230", "f15282", "S#18038", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0230", "f15283", "S#18039", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0230", "f15284", "S#18040", 1, 0, false);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f15286() {
        $g2425$ = SubLFiles.defparameter("S#18041", (SubLObject)$ic7$);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f15287() {
        return (SubLObject)NIL;
    }
    
    public void declareFunctions() {
        f15285();
    }
    
    public void initializeVariables() {
        f15286();
    }
    
    public void runTopLevelForms() {
        f15287();
    }
    
    static {
        me = (SubLFile)new module0230();
        $g2425$ = null;
        $ic0$ = makeSymbol("S#12274", "CYC");
        $ic1$ = constant_handles_oc.f8479((SubLObject)makeString("EverythingPSC"));
        $ic2$ = makeKeyword("RULE");
        $ic3$ = makeSymbol("FORT-P");
        $ic4$ = makeKeyword("GAF");
        $ic5$ = makeInteger(-2);
        $ic6$ = makeKeyword("IGNORE");
        $ic7$ = makeKeyword("UNINITIALIZED");
        $ic8$ = makeSymbol("S#5859", "CYC");
        $ic9$ = makeSymbol("S#18039", "CYC");
        $ic10$ = constant_handles_oc.f8479((SubLObject)makeString("termOfUnit"));
        $ic11$ = constant_handles_oc.f8479((SubLObject)makeString("isa"));
        $ic12$ = constant_handles_oc.f8479((SubLObject)makeString("genls"));
    }
}

/*
	DECOMPILATION REPORT

	Decompiled from: G:\opt\CYC_JRTL_with_CommonLisp\platform\lib\cyc-oc4.0-unzipped/com/cyc/cycjava/cycl/class
	Total time: 264 ms
	
	Decompiled with Procyon 0.5.32.
*/