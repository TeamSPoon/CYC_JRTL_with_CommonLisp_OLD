package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Time;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class module0455 extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.module0455";
    public static final String myFingerPrint = "98a64ca3dab6338fb1b2bf952ba73ce04c95926ef9b62684609f631e557f4a8f";
    private static final SubLObject $ic0$;
    private static final SubLSymbol $ic1$;
    private static final SubLSymbol $ic2$;
    private static final SubLSymbol $ic3$;
    private static final SubLSymbol $ic4$;
    private static final SubLList $ic5$;
    private static final SubLSymbol $ic6$;
    private static final SubLList $ic7$;
    private static final SubLSymbol $ic8$;
    private static final SubLList $ic9$;
    private static final SubLSymbol $ic10$;
    private static final SubLList $ic11$;
    private static final SubLObject $ic12$;
    private static final SubLObject $ic13$;
    private static final SubLObject $ic14$;
    private static final SubLObject $ic15$;
    private static final SubLSymbol $ic16$;
    private static final SubLSymbol $ic17$;
    private static final SubLSymbol $ic18$;
    private static final SubLSymbol $ic19$;
    private static final SubLSymbol $ic20$;
    private static final SubLList $ic21$;
    private static final SubLSymbol $ic22$;
    private static final SubLList $ic23$;
    private static final SubLSymbol $ic24$;
    private static final SubLList $ic25$;
    private static final SubLObject $ic26$;
    private static final SubLObject $ic27$;
    private static final SubLObject $ic28$;
    private static final SubLSymbol $ic29$;
    private static final SubLList $ic30$;
    private static final SubLSymbol $ic31$;
    private static final SubLList $ic32$;
    private static final SubLSymbol $ic33$;
    private static final SubLList $ic34$;
    private static final SubLSymbol $ic35$;
    private static final SubLList $ic36$;
    private static final SubLSymbol $ic37$;
    private static final SubLList $ic38$;
    private static final SubLSymbol $ic39$;
    private static final SubLList $ic40$;
    private static final SubLSymbol $ic41$;
    private static final SubLList $ic42$;
    private static final SubLSymbol $ic43$;
    private static final SubLList $ic44$;
    private static final SubLSymbol $ic45$;
    private static final SubLList $ic46$;
    private static final SubLSymbol $ic47$;
    private static final SubLList $ic48$;
    private static final SubLSymbol $ic49$;
    private static final SubLList $ic50$;
    private static final SubLSymbol $ic51$;
    private static final SubLList $ic52$;
    
    public static SubLObject f31173(final SubLObject var1) {
        return module0191.f11990((SubLObject)$ic10$, var1, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f31174(final SubLObject var1, SubLObject var2) {
        if (var2 == UNPROVIDED) {
            var2 = (SubLObject)NIL;
        }
        final SubLThread var3 = SubLProcess.currentSubLThread();
        final SubLObject var4 = module0205.f13387(var1, (SubLObject)UNPROVIDED);
        if (NIL != module0206.f13470(var4)) {
            return module0018.$g658$.getDynamicValue(var3);
        }
        return f31175(var1, (SubLObject)$ic2$);
    }
    
    public static SubLObject f31175(final SubLObject var1, final SubLObject var2) {
        SubLObject var3 = module0349.f23451(var1, var2);
        if ($ic0$.eql(module0205.f13333(var1))) {
            final SubLObject var4 = module0205.f13387(var1, (SubLObject)UNPROVIDED);
            final SubLObject var5 = module0205.f13388(var1, (SubLObject)UNPROVIDED);
            SubLObject var6 = (SubLObject)$ic11$;
            SubLObject var7 = (SubLObject)NIL;
            var7 = var6.first();
            while (NIL != var6) {
                var3 = Numbers.add(var3, module0349.f23451((SubLObject)ConsesLow.list(var7, var4, var5), var2));
                var6 = var6.rest();
                var7 = var6.first();
            }
        }
        return var3;
    }
    
    public static SubLObject f31176(final SubLObject var9, final SubLObject var6) {
        if (var9.eql($ic0$)) {
            return module0206.f13450(var6);
        }
        if (var9.eql($ic12$)) {
            return module0206.f13425(var6);
        }
        if (var9.eql($ic13$)) {
            return module0206.f13444(var6);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f31177(final SubLObject var1, SubLObject var2) {
        if (var2 == UNPROVIDED) {
            var2 = (SubLObject)NIL;
        }
        final SubLObject var3 = module0205.f13333(var1);
        final SubLObject var4 = module0205.f13387(var1, (SubLObject)UNPROVIDED);
        final SubLObject var5 = module0205.f13388(var1, (SubLObject)UNPROVIDED);
        if (NIL == f31176(var3, var5)) {
            return (SubLObject)NIL;
        }
        if (NIL != module0206.f13470(var4)) {
            return f31178(var3, var4, var5, (SubLObject)NIL);
        }
        return f31179(var1, (SubLObject)$ic2$);
    }
    
    public static SubLObject f31178(final SubLObject var9, final SubLObject var4, final SubLObject var6, final SubLObject var11) {
        final SubLThread var12 = SubLProcess.currentSubLThread();
        final SubLObject var13 = (NIL != module0193.f12067(var4)) ? var4 : module0285.f18931(var4, (SubLObject)T);
        final SubLObject var14 = (SubLObject)((NIL != var11) ? ConsesLow.list($ic14$, var6) : ConsesLow.list($ic15$, var6));
        var12.resetMultipleValues();
        final SubLObject var15 = module0235.f15474(var13, var14, (SubLObject)T, (SubLObject)T);
        final SubLObject var16 = var12.secondMultipleValue();
        var12.resetMultipleValues();
        if (NIL != var15) {
            final SubLObject var17 = module0233.f15361(var15, var13);
            final SubLObject var18 = (SubLObject)ConsesLow.list(var9, var17, var6);
            return module0347.f23330(f31173(var18), var15, var16);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f31179(final SubLObject var1, final SubLObject var2) {
        final SubLThread var3 = SubLProcess.currentSubLThread();
        final SubLObject var4 = module0349.f23449(var1, var2);
        final SubLObject var6;
        final SubLObject var5 = var6 = module0158.f10294(var4);
        if (var6.eql((SubLObject)$ic16$)) {
            var3.resetMultipleValues();
            final SubLObject var7 = module0158.f10297(var4);
            final SubLObject var8 = var3.secondMultipleValue();
            final SubLObject var9 = var3.thirdMultipleValue();
            var3.resetMultipleValues();
            if (NIL != var8) {
                if (NIL != var9) {
                    final SubLObject var10 = var9;
                    if (NIL != module0158.f10010(var7, var8, var10)) {
                        final SubLObject var11 = module0158.f10011(var7, var8, var10);
                        SubLObject var12 = (SubLObject)NIL;
                        final SubLObject var13 = (SubLObject)NIL;
                        while (NIL == var12) {
                            final SubLObject var14 = module0052.f3695(var11, var13);
                            final SubLObject var15 = (SubLObject)makeBoolean(!var13.eql(var14));
                            if (NIL != var15) {
                                SubLObject var16 = (SubLObject)NIL;
                                try {
                                    var16 = module0158.f10316(var14, (SubLObject)$ic17$, module0130.f8518(var2), (SubLObject)NIL);
                                    SubLObject var25_30 = (SubLObject)NIL;
                                    final SubLObject var26_31 = (SubLObject)NIL;
                                    while (NIL == var25_30) {
                                        final SubLObject var17 = module0052.f3695(var16, var26_31);
                                        final SubLObject var28_33 = (SubLObject)makeBoolean(!var26_31.eql(var17));
                                        if (NIL != var28_33) {
                                            module0436.f30642(var17, var1);
                                        }
                                        var25_30 = (SubLObject)makeBoolean(NIL == var28_33);
                                    }
                                }
                                finally {
                                    final SubLObject var18 = Threads.$is_thread_performing_cleanupP$.currentBinding(var3);
                                    try {
                                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)T, var3);
                                        if (NIL != var16) {
                                            module0158.f10319(var16);
                                        }
                                    }
                                    finally {
                                        Threads.$is_thread_performing_cleanupP$.rebind(var18, var3);
                                    }
                                }
                            }
                            var12 = (SubLObject)makeBoolean(NIL == var15);
                        }
                    }
                }
                else {
                    final SubLObject var10 = (SubLObject)NIL;
                    if (NIL != module0158.f10010(var7, var8, var10)) {
                        final SubLObject var11 = module0158.f10011(var7, var8, var10);
                        SubLObject var12 = (SubLObject)NIL;
                        final SubLObject var13 = (SubLObject)NIL;
                        while (NIL == var12) {
                            final SubLObject var14 = module0052.f3695(var11, var13);
                            final SubLObject var15 = (SubLObject)makeBoolean(!var13.eql(var14));
                            if (NIL != var15) {
                                SubLObject var16 = (SubLObject)NIL;
                                try {
                                    var16 = module0158.f10316(var14, (SubLObject)$ic17$, module0130.f8518(var2), (SubLObject)NIL);
                                    SubLObject var25_31 = (SubLObject)NIL;
                                    final SubLObject var26_32 = (SubLObject)NIL;
                                    while (NIL == var25_31) {
                                        final SubLObject var17 = module0052.f3695(var16, var26_32);
                                        final SubLObject var28_34 = (SubLObject)makeBoolean(!var26_32.eql(var17));
                                        if (NIL != var28_34) {
                                            module0436.f30642(var17, var1);
                                        }
                                        var25_31 = (SubLObject)makeBoolean(NIL == var28_34);
                                    }
                                }
                                finally {
                                    final SubLObject var19 = Threads.$is_thread_performing_cleanupP$.currentBinding(var3);
                                    try {
                                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)T, var3);
                                        if (NIL != var16) {
                                            module0158.f10319(var16);
                                        }
                                    }
                                    finally {
                                        Threads.$is_thread_performing_cleanupP$.rebind(var19, var3);
                                    }
                                }
                            }
                            var12 = (SubLObject)makeBoolean(NIL == var15);
                        }
                    }
                }
            }
            else if (NIL != var9) {
                final SubLObject var10 = var9;
                if (NIL != module0158.f10010(var7, (SubLObject)NIL, var10)) {
                    final SubLObject var11 = module0158.f10011(var7, (SubLObject)NIL, var10);
                    SubLObject var12 = (SubLObject)NIL;
                    final SubLObject var13 = (SubLObject)NIL;
                    while (NIL == var12) {
                        final SubLObject var14 = module0052.f3695(var11, var13);
                        final SubLObject var15 = (SubLObject)makeBoolean(!var13.eql(var14));
                        if (NIL != var15) {
                            SubLObject var16 = (SubLObject)NIL;
                            try {
                                var16 = module0158.f10316(var14, (SubLObject)$ic17$, module0130.f8518(var2), (SubLObject)NIL);
                                SubLObject var25_32 = (SubLObject)NIL;
                                final SubLObject var26_33 = (SubLObject)NIL;
                                while (NIL == var25_32) {
                                    final SubLObject var17 = module0052.f3695(var16, var26_33);
                                    final SubLObject var28_35 = (SubLObject)makeBoolean(!var26_33.eql(var17));
                                    if (NIL != var28_35) {
                                        module0436.f30642(var17, var1);
                                    }
                                    var25_32 = (SubLObject)makeBoolean(NIL == var28_35);
                                }
                            }
                            finally {
                                final SubLObject var20 = Threads.$is_thread_performing_cleanupP$.currentBinding(var3);
                                try {
                                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)T, var3);
                                    if (NIL != var16) {
                                        module0158.f10319(var16);
                                    }
                                }
                                finally {
                                    Threads.$is_thread_performing_cleanupP$.rebind(var20, var3);
                                }
                            }
                        }
                        var12 = (SubLObject)makeBoolean(NIL == var15);
                    }
                }
            }
            else {
                final SubLObject var10 = (SubLObject)NIL;
                if (NIL != module0158.f10010(var7, (SubLObject)NIL, var10)) {
                    final SubLObject var11 = module0158.f10011(var7, (SubLObject)NIL, var10);
                    SubLObject var12 = (SubLObject)NIL;
                    final SubLObject var13 = (SubLObject)NIL;
                    while (NIL == var12) {
                        final SubLObject var14 = module0052.f3695(var11, var13);
                        final SubLObject var15 = (SubLObject)makeBoolean(!var13.eql(var14));
                        if (NIL != var15) {
                            SubLObject var16 = (SubLObject)NIL;
                            try {
                                var16 = module0158.f10316(var14, (SubLObject)$ic17$, module0130.f8518(var2), (SubLObject)NIL);
                                SubLObject var25_33 = (SubLObject)NIL;
                                final SubLObject var26_34 = (SubLObject)NIL;
                                while (NIL == var25_33) {
                                    final SubLObject var17 = module0052.f3695(var16, var26_34);
                                    final SubLObject var28_36 = (SubLObject)makeBoolean(!var26_34.eql(var17));
                                    if (NIL != var28_36) {
                                        module0436.f30642(var17, var1);
                                    }
                                    var25_33 = (SubLObject)makeBoolean(NIL == var28_36);
                                }
                            }
                            finally {
                                final SubLObject var21 = Threads.$is_thread_performing_cleanupP$.currentBinding(var3);
                                try {
                                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)T, var3);
                                    if (NIL != var16) {
                                        module0158.f10319(var16);
                                    }
                                }
                                finally {
                                    Threads.$is_thread_performing_cleanupP$.rebind(var21, var3);
                                }
                            }
                        }
                        var12 = (SubLObject)makeBoolean(NIL == var15);
                    }
                }
            }
        }
        else if (var6.eql((SubLObject)$ic18$)) {
            final SubLObject var22 = module0158.f10299(var4);
            if (NIL != module0158.f10038(var22)) {
                final SubLObject var23 = (SubLObject)NIL;
                final SubLObject var24 = module0012.$g73$.currentBinding(var3);
                final SubLObject var25 = module0012.$g65$.currentBinding(var3);
                final SubLObject var26 = module0012.$g67$.currentBinding(var3);
                final SubLObject var27 = module0012.$g68$.currentBinding(var3);
                final SubLObject var28 = module0012.$g66$.currentBinding(var3);
                final SubLObject var29 = module0012.$g69$.currentBinding(var3);
                final SubLObject var30 = module0012.$g70$.currentBinding(var3);
                final SubLObject var31 = module0012.$silent_progressP$.currentBinding(var3);
                try {
                    module0012.$g73$.bind(Time.get_universal_time(), var3);
                    module0012.$g65$.bind(module0012.$g73$.getDynamicValue(var3), var3);
                    module0012.$g67$.bind((SubLObject)ONE_INTEGER, var3);
                    module0012.$g68$.bind((SubLObject)ZERO_INTEGER, var3);
                    module0012.$g66$.bind((SubLObject)ZERO_INTEGER, var3);
                    module0012.$g69$.bind((SubLObject)ZERO_INTEGER, var3);
                    module0012.$g70$.bind((SubLObject)T, var3);
                    module0012.$silent_progressP$.bind((SubLObject)((NIL != var23) ? module0012.$silent_progressP$.getDynamicValue(var3) : T), var3);
                    module0012.f474(var23);
                    final SubLObject var32 = module0158.f10039(var22);
                    SubLObject var33 = (SubLObject)NIL;
                    final SubLObject var34 = (SubLObject)NIL;
                    while (NIL == var33) {
                        final SubLObject var35 = module0052.f3695(var32, var34);
                        final SubLObject var36 = (SubLObject)makeBoolean(!var34.eql(var35));
                        if (NIL != var36) {
                            module0012.f476();
                            SubLObject var37 = (SubLObject)NIL;
                            try {
                                var37 = module0158.f10316(var35, (SubLObject)$ic17$, module0130.f8518(var2), (SubLObject)NIL);
                                SubLObject var25_34 = (SubLObject)NIL;
                                final SubLObject var26_35 = (SubLObject)NIL;
                                while (NIL == var25_34) {
                                    final SubLObject var38 = module0052.f3695(var37, var26_35);
                                    final SubLObject var28_37 = (SubLObject)makeBoolean(!var26_35.eql(var38));
                                    if (NIL != var28_37) {
                                        module0436.f30642(var38, var1);
                                    }
                                    var25_34 = (SubLObject)makeBoolean(NIL == var28_37);
                                }
                            }
                            finally {
                                final SubLObject var34_57 = Threads.$is_thread_performing_cleanupP$.currentBinding(var3);
                                try {
                                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)T, var3);
                                    if (NIL != var37) {
                                        module0158.f10319(var37);
                                    }
                                }
                                finally {
                                    Threads.$is_thread_performing_cleanupP$.rebind(var34_57, var3);
                                }
                            }
                        }
                        var33 = (SubLObject)makeBoolean(NIL == var36);
                    }
                    module0012.f475();
                }
                finally {
                    module0012.$silent_progressP$.rebind(var31, var3);
                    module0012.$g70$.rebind(var30, var3);
                    module0012.$g69$.rebind(var29, var3);
                    module0012.$g66$.rebind(var28, var3);
                    module0012.$g68$.rebind(var27, var3);
                    module0012.$g67$.rebind(var26, var3);
                    module0012.$g65$.rebind(var25, var3);
                    module0012.$g73$.rebind(var24, var3);
                }
            }
        }
        else if (var6.eql((SubLObject)$ic19$)) {
            SubLObject var39 = module0218.f14453(module0158.f10301(var4), (SubLObject)UNPROVIDED);
            SubLObject var40 = (SubLObject)NIL;
            var40 = var39.first();
            while (NIL != var39) {
                if (NIL == module0130.f8518(var2) || NIL != module0178.f11343(var40, module0130.f8518(var2))) {
                    module0436.f30642(var40, var1);
                }
                var39 = var39.rest();
                var40 = var39.first();
            }
        }
        else {
            module0158.f10295(var4, var5);
        }
        final SubLObject var41 = module0205.f13333(var1);
        SubLObject var42 = (SubLObject)NIL;
        SubLObject var43 = (SubLObject)NIL;
        if ($ic0$.eql(var41)) {
            var42 = module0205.f13387(var1, (SubLObject)UNPROVIDED);
            var43 = module0205.f13388(var1, (SubLObject)UNPROVIDED);
            SubLObject var39 = (SubLObject)$ic11$;
            SubLObject var44 = (SubLObject)NIL;
            var44 = var39.first();
            while (NIL != var39) {
                final SubLObject var45 = (SubLObject)ConsesLow.list(var44, var42, var43);
                final SubLObject var46 = module0349.f23449(var45, var2);
                final SubLObject var48;
                final SubLObject var47 = var48 = module0158.f10294(var46);
                if (var48.eql((SubLObject)$ic16$)) {
                    var3.resetMultipleValues();
                    final SubLObject var49 = module0158.f10297(var46);
                    final SubLObject var50 = var3.secondMultipleValue();
                    final SubLObject var51 = var3.thirdMultipleValue();
                    var3.resetMultipleValues();
                    if (NIL != var50) {
                        if (NIL != var51) {
                            final SubLObject var52 = var51;
                            if (NIL != module0158.f10010(var49, var50, var52)) {
                                final SubLObject var32 = module0158.f10011(var49, var50, var52);
                                SubLObject var33 = (SubLObject)NIL;
                                final SubLObject var34 = (SubLObject)NIL;
                                while (NIL == var33) {
                                    final SubLObject var53 = module0052.f3695(var32, var34);
                                    final SubLObject var36 = (SubLObject)makeBoolean(!var34.eql(var53));
                                    if (NIL != var36) {
                                        SubLObject var37 = (SubLObject)NIL;
                                        try {
                                            var37 = module0158.f10316(var53, (SubLObject)$ic17$, module0130.f8518(var2), (SubLObject)NIL);
                                            SubLObject var25_35 = (SubLObject)NIL;
                                            final SubLObject var26_36 = (SubLObject)NIL;
                                            while (NIL == var25_35) {
                                                final SubLObject var38 = module0052.f3695(var37, var26_36);
                                                final SubLObject var28_38 = (SubLObject)makeBoolean(!var26_36.eql(var38));
                                                if (NIL != var28_38) {
                                                    module0436.f30642(var38, var45);
                                                }
                                                var25_35 = (SubLObject)makeBoolean(NIL == var28_38);
                                            }
                                        }
                                        finally {
                                            final SubLObject var54 = Threads.$is_thread_performing_cleanupP$.currentBinding(var3);
                                            try {
                                                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)T, var3);
                                                if (NIL != var37) {
                                                    module0158.f10319(var37);
                                                }
                                            }
                                            finally {
                                                Threads.$is_thread_performing_cleanupP$.rebind(var54, var3);
                                            }
                                        }
                                    }
                                    var33 = (SubLObject)makeBoolean(NIL == var36);
                                }
                            }
                        }
                        else {
                            final SubLObject var52 = (SubLObject)NIL;
                            if (NIL != module0158.f10010(var49, var50, var52)) {
                                final SubLObject var32 = module0158.f10011(var49, var50, var52);
                                SubLObject var33 = (SubLObject)NIL;
                                final SubLObject var34 = (SubLObject)NIL;
                                while (NIL == var33) {
                                    final SubLObject var53 = module0052.f3695(var32, var34);
                                    final SubLObject var36 = (SubLObject)makeBoolean(!var34.eql(var53));
                                    if (NIL != var36) {
                                        SubLObject var37 = (SubLObject)NIL;
                                        try {
                                            var37 = module0158.f10316(var53, (SubLObject)$ic17$, module0130.f8518(var2), (SubLObject)NIL);
                                            SubLObject var25_36 = (SubLObject)NIL;
                                            final SubLObject var26_37 = (SubLObject)NIL;
                                            while (NIL == var25_36) {
                                                final SubLObject var38 = module0052.f3695(var37, var26_37);
                                                final SubLObject var28_39 = (SubLObject)makeBoolean(!var26_37.eql(var38));
                                                if (NIL != var28_39) {
                                                    module0436.f30642(var38, var45);
                                                }
                                                var25_36 = (SubLObject)makeBoolean(NIL == var28_39);
                                            }
                                        }
                                        finally {
                                            final SubLObject var55 = Threads.$is_thread_performing_cleanupP$.currentBinding(var3);
                                            try {
                                                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)T, var3);
                                                if (NIL != var37) {
                                                    module0158.f10319(var37);
                                                }
                                            }
                                            finally {
                                                Threads.$is_thread_performing_cleanupP$.rebind(var55, var3);
                                            }
                                        }
                                    }
                                    var33 = (SubLObject)makeBoolean(NIL == var36);
                                }
                            }
                        }
                    }
                    else if (NIL != var51) {
                        final SubLObject var52 = var51;
                        if (NIL != module0158.f10010(var49, (SubLObject)NIL, var52)) {
                            final SubLObject var32 = module0158.f10011(var49, (SubLObject)NIL, var52);
                            SubLObject var33 = (SubLObject)NIL;
                            final SubLObject var34 = (SubLObject)NIL;
                            while (NIL == var33) {
                                final SubLObject var53 = module0052.f3695(var32, var34);
                                final SubLObject var36 = (SubLObject)makeBoolean(!var34.eql(var53));
                                if (NIL != var36) {
                                    SubLObject var37 = (SubLObject)NIL;
                                    try {
                                        var37 = module0158.f10316(var53, (SubLObject)$ic17$, module0130.f8518(var2), (SubLObject)NIL);
                                        SubLObject var25_37 = (SubLObject)NIL;
                                        final SubLObject var26_38 = (SubLObject)NIL;
                                        while (NIL == var25_37) {
                                            final SubLObject var38 = module0052.f3695(var37, var26_38);
                                            final SubLObject var28_40 = (SubLObject)makeBoolean(!var26_38.eql(var38));
                                            if (NIL != var28_40) {
                                                module0436.f30642(var38, var45);
                                            }
                                            var25_37 = (SubLObject)makeBoolean(NIL == var28_40);
                                        }
                                    }
                                    finally {
                                        final SubLObject var56 = Threads.$is_thread_performing_cleanupP$.currentBinding(var3);
                                        try {
                                            Threads.$is_thread_performing_cleanupP$.bind((SubLObject)T, var3);
                                            if (NIL != var37) {
                                                module0158.f10319(var37);
                                            }
                                        }
                                        finally {
                                            Threads.$is_thread_performing_cleanupP$.rebind(var56, var3);
                                        }
                                    }
                                }
                                var33 = (SubLObject)makeBoolean(NIL == var36);
                            }
                        }
                    }
                    else {
                        final SubLObject var52 = (SubLObject)NIL;
                        if (NIL != module0158.f10010(var49, (SubLObject)NIL, var52)) {
                            final SubLObject var32 = module0158.f10011(var49, (SubLObject)NIL, var52);
                            SubLObject var33 = (SubLObject)NIL;
                            final SubLObject var34 = (SubLObject)NIL;
                            while (NIL == var33) {
                                final SubLObject var53 = module0052.f3695(var32, var34);
                                final SubLObject var36 = (SubLObject)makeBoolean(!var34.eql(var53));
                                if (NIL != var36) {
                                    SubLObject var37 = (SubLObject)NIL;
                                    try {
                                        var37 = module0158.f10316(var53, (SubLObject)$ic17$, module0130.f8518(var2), (SubLObject)NIL);
                                        SubLObject var25_38 = (SubLObject)NIL;
                                        final SubLObject var26_39 = (SubLObject)NIL;
                                        while (NIL == var25_38) {
                                            final SubLObject var38 = module0052.f3695(var37, var26_39);
                                            final SubLObject var28_41 = (SubLObject)makeBoolean(!var26_39.eql(var38));
                                            if (NIL != var28_41) {
                                                module0436.f30642(var38, var45);
                                            }
                                            var25_38 = (SubLObject)makeBoolean(NIL == var28_41);
                                        }
                                    }
                                    finally {
                                        final SubLObject var57 = Threads.$is_thread_performing_cleanupP$.currentBinding(var3);
                                        try {
                                            Threads.$is_thread_performing_cleanupP$.bind((SubLObject)T, var3);
                                            if (NIL != var37) {
                                                module0158.f10319(var37);
                                            }
                                        }
                                        finally {
                                            Threads.$is_thread_performing_cleanupP$.rebind(var57, var3);
                                        }
                                    }
                                }
                                var33 = (SubLObject)makeBoolean(NIL == var36);
                            }
                        }
                    }
                }
                else if (var48.eql((SubLObject)$ic18$)) {
                    final SubLObject var58 = module0158.f10299(var46);
                    if (NIL != module0158.f10038(var58)) {
                        final SubLObject var59 = (SubLObject)NIL;
                        final SubLObject var60 = module0012.$g73$.currentBinding(var3);
                        final SubLObject var61 = module0012.$g65$.currentBinding(var3);
                        final SubLObject var62 = module0012.$g67$.currentBinding(var3);
                        final SubLObject var63 = module0012.$g68$.currentBinding(var3);
                        final SubLObject var64 = module0012.$g66$.currentBinding(var3);
                        final SubLObject var65 = module0012.$g69$.currentBinding(var3);
                        final SubLObject var66 = module0012.$g70$.currentBinding(var3);
                        final SubLObject var67 = module0012.$silent_progressP$.currentBinding(var3);
                        try {
                            module0012.$g73$.bind(Time.get_universal_time(), var3);
                            module0012.$g65$.bind(module0012.$g73$.getDynamicValue(var3), var3);
                            module0012.$g67$.bind((SubLObject)ONE_INTEGER, var3);
                            module0012.$g68$.bind((SubLObject)ZERO_INTEGER, var3);
                            module0012.$g66$.bind((SubLObject)ZERO_INTEGER, var3);
                            module0012.$g69$.bind((SubLObject)ZERO_INTEGER, var3);
                            module0012.$g70$.bind((SubLObject)T, var3);
                            module0012.$silent_progressP$.bind((SubLObject)((NIL != var59) ? module0012.$silent_progressP$.getDynamicValue(var3) : T), var3);
                            module0012.f474(var59);
                            final SubLObject var68 = module0158.f10039(var58);
                            SubLObject var69 = (SubLObject)NIL;
                            final SubLObject var70 = (SubLObject)NIL;
                            while (NIL == var69) {
                                final SubLObject var71 = module0052.f3695(var68, var70);
                                final SubLObject var72 = (SubLObject)makeBoolean(!var70.eql(var71));
                                if (NIL != var72) {
                                    module0012.f476();
                                    SubLObject var73 = (SubLObject)NIL;
                                    try {
                                        var73 = module0158.f10316(var71, (SubLObject)$ic17$, module0130.f8518(var2), (SubLObject)NIL);
                                        SubLObject var25_39 = (SubLObject)NIL;
                                        final SubLObject var26_40 = (SubLObject)NIL;
                                        while (NIL == var25_39) {
                                            final SubLObject var74 = module0052.f3695(var73, var26_40);
                                            final SubLObject var28_42 = (SubLObject)makeBoolean(!var26_40.eql(var74));
                                            if (NIL != var28_42) {
                                                module0436.f30642(var74, var45);
                                            }
                                            var25_39 = (SubLObject)makeBoolean(NIL == var28_42);
                                        }
                                    }
                                    finally {
                                        final SubLObject var34_58 = Threads.$is_thread_performing_cleanupP$.currentBinding(var3);
                                        try {
                                            Threads.$is_thread_performing_cleanupP$.bind((SubLObject)T, var3);
                                            if (NIL != var73) {
                                                module0158.f10319(var73);
                                            }
                                        }
                                        finally {
                                            Threads.$is_thread_performing_cleanupP$.rebind(var34_58, var3);
                                        }
                                    }
                                }
                                var69 = (SubLObject)makeBoolean(NIL == var72);
                            }
                            module0012.f475();
                        }
                        finally {
                            module0012.$silent_progressP$.rebind(var67, var3);
                            module0012.$g70$.rebind(var66, var3);
                            module0012.$g69$.rebind(var65, var3);
                            module0012.$g66$.rebind(var64, var3);
                            module0012.$g68$.rebind(var63, var3);
                            module0012.$g67$.rebind(var62, var3);
                            module0012.$g65$.rebind(var61, var3);
                            module0012.$g73$.rebind(var60, var3);
                        }
                    }
                }
                else if (var48.eql((SubLObject)$ic19$)) {
                    SubLObject var7_75 = module0218.f14453(module0158.f10301(var46), (SubLObject)UNPROVIDED);
                    SubLObject var75 = (SubLObject)NIL;
                    var75 = var7_75.first();
                    while (NIL != var7_75) {
                        if (NIL == module0130.f8518(var2) || NIL != module0178.f11343(var75, module0130.f8518(var2))) {
                            module0436.f30642(var75, var45);
                        }
                        var7_75 = var7_75.rest();
                        var75 = var7_75.first();
                    }
                }
                else {
                    module0158.f10295(var46, var47);
                }
                var39 = var39.rest();
                var44 = var39.first();
            }
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f31180(final SubLObject var1, SubLObject var2) {
        if (var2 == UNPROVIDED) {
            var2 = (SubLObject)NIL;
        }
        final SubLObject var3 = module0205.f13387(var1, (SubLObject)UNPROVIDED);
        if (NIL != module0206.f13470(var3)) {
            return (SubLObject)ONE_INTEGER;
        }
        return Numbers.add((SubLObject)ONE_INTEGER, f31175(var1, (SubLObject)$ic2$));
    }
    
    public static SubLObject f31181(final SubLObject var1, SubLObject var2) {
        if (var2 == UNPROVIDED) {
            var2 = (SubLObject)NIL;
        }
        final SubLObject var3 = module0205.f13333(var1);
        final SubLObject var4 = module0205.f13387(var1, (SubLObject)UNPROVIDED);
        final SubLObject var5 = module0205.f13388(var1, (SubLObject)UNPROVIDED);
        if (NIL == f31176(var3, var5)) {
            return (SubLObject)NIL;
        }
        if (NIL != module0206.f13470(var4)) {
            f31178(var3, var4, var5, (SubLObject)NIL);
        }
        else {
            if (NIL != module0193.f12067(var4)) {
                f31178(var3, var4, var5, (SubLObject)NIL);
            }
            else {
                f31178(var3, var4, var5, (SubLObject)T);
            }
            f31179(var1, (SubLObject)$ic2$);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f31182(final SubLObject var1, SubLObject var2) {
        if (var2 == UNPROVIDED) {
            var2 = (SubLObject)NIL;
        }
        final SubLObject var3 = module0205.f13333(var1);
        final SubLObject var4 = module0205.f13387(var1, (SubLObject)UNPROVIDED);
        final SubLObject var5 = module0205.f13388(var1, (SubLObject)UNPROVIDED);
        if (NIL != module0206.f13470(var4)) {
            return f31183(var3, var4, var5);
        }
        return f31179(var1, (SubLObject)$ic2$);
    }
    
    public static SubLObject f31183(final SubLObject var9, final SubLObject var4, final SubLObject var6) {
        final SubLThread var10 = SubLProcess.currentSubLThread();
        final SubLObject var11 = module0205.f13203(module0285.f18931(var4, (SubLObject)UNPROVIDED), (SubLObject)UNPROVIDED);
        var10.resetMultipleValues();
        final SubLObject var12 = module0235.f15474(var11, var6, (SubLObject)T, (SubLObject)T);
        final SubLObject var13 = var10.secondMultipleValue();
        var10.resetMultipleValues();
        if (NIL != var12) {
            final SubLObject var14 = module0233.f15361(var12, var6);
            SubLObject var15 = (SubLObject)NIL;
            if (NIL != f31176(var9, var14)) {
                var15 = (SubLObject)ConsesLow.list(var9, var4, var14);
                return module0347.f23330(f31173(var15), var12, var13);
            }
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f31184(final SubLObject var9, final SubLObject var4) {
        if (var9.eql($ic0$)) {
            return module0259.f16854(var4, $ic26$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        }
        if (var9.eql($ic13$)) {
            return module0259.f16854(var4, $ic27$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        }
        if (var9.eql($ic12$)) {
            return module0259.f16854(var4, $ic28$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f31185(final SubLObject var1, SubLObject var2) {
        if (var2 == UNPROVIDED) {
            var2 = (SubLObject)NIL;
        }
        final SubLObject var3 = module0205.f13333(var1);
        final SubLObject var4 = module0205.f13387(var1, (SubLObject)UNPROVIDED);
        final SubLObject var5 = module0205.f13388(var1, (SubLObject)UNPROVIDED);
        if (NIL != module0193.f12105(var4) && NIL == f31176(var3, var5)) {
            return module0347.f23330(f31173(module0205.f13338(var1)), (SubLObject)NIL, (SubLObject)UNPROVIDED);
        }
        if (NIL != module0206.f13470(var4)) {
            return f31186(var1, var4, var5);
        }
        if (NIL != f31184(var3, var4)) {
            return f31179(var1, (SubLObject)$ic3$);
        }
        return module0347.f23330(f31173(module0205.f13338(var1)), (SubLObject)NIL, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f31186(final SubLObject var1, final SubLObject var4, final SubLObject var6) {
        final SubLThread var7 = SubLProcess.currentSubLThread();
        final SubLObject var8 = module0285.f18931(var4, (SubLObject)UNPROVIDED);
        var7.resetMultipleValues();
        final SubLObject var9 = module0235.f15474(var8, (SubLObject)ConsesLow.list($ic15$, var6), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        final SubLObject var10 = var7.secondMultipleValue();
        var7.resetMultipleValues();
        if (NIL == var9) {
            return module0347.f23330(f31173(module0205.f13338(var1)), (SubLObject)NIL, (SubLObject)UNPROVIDED);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f31187(final SubLObject var1, SubLObject var2) {
        if (var2 == UNPROVIDED) {
            var2 = (SubLObject)NIL;
        }
        return f31174(var1, var2);
    }
    
    public static SubLObject f31188(final SubLObject var1, SubLObject var2) {
        if (var2 == UNPROVIDED) {
            var2 = (SubLObject)NIL;
        }
        return f31177(var1, var2);
    }
    
    public static SubLObject f31189(final SubLObject var1, SubLObject var2) {
        if (var2 == UNPROVIDED) {
            var2 = (SubLObject)NIL;
        }
        return f31180(var1, var2);
    }
    
    public static SubLObject f31190(final SubLObject var1, SubLObject var2) {
        if (var2 == UNPROVIDED) {
            var2 = (SubLObject)NIL;
        }
        return f31181(var1, var2);
    }
    
    public static SubLObject f31191(final SubLObject var1, SubLObject var2) {
        if (var2 == UNPROVIDED) {
            var2 = (SubLObject)NIL;
        }
        return f31182(var1, var2);
    }
    
    public static SubLObject f31192(final SubLObject var1, SubLObject var2) {
        if (var2 == UNPROVIDED) {
            var2 = (SubLObject)NIL;
        }
        return f31185(var1, var2);
    }
    
    public static SubLObject f31193(final SubLObject var1, SubLObject var2) {
        if (var2 == UNPROVIDED) {
            var2 = (SubLObject)NIL;
        }
        return f31174(var1, var2);
    }
    
    public static SubLObject f31194(final SubLObject var1, SubLObject var2) {
        if (var2 == UNPROVIDED) {
            var2 = (SubLObject)NIL;
        }
        return f31177(var1, var2);
    }
    
    public static SubLObject f31195(final SubLObject var1, SubLObject var2) {
        if (var2 == UNPROVIDED) {
            var2 = (SubLObject)NIL;
        }
        return f31180(var1, var2);
    }
    
    public static SubLObject f31196(final SubLObject var1, SubLObject var2) {
        if (var2 == UNPROVIDED) {
            var2 = (SubLObject)NIL;
        }
        return f31181(var1, var2);
    }
    
    public static SubLObject f31197(final SubLObject var1, SubLObject var2) {
        if (var2 == UNPROVIDED) {
            var2 = (SubLObject)NIL;
        }
        return f31182(var1, var2);
    }
    
    public static SubLObject f31198(final SubLObject var1, SubLObject var2) {
        if (var2 == UNPROVIDED) {
            var2 = (SubLObject)NIL;
        }
        return f31185(var1, var2);
    }
    
    public static SubLObject f31199() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0455", "f31173", "S#34453", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0455", "f31174", "S#34454", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0455", "f31175", "S#34455", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0455", "f31176", "S#34456", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0455", "f31177", "S#34457", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0455", "f31178", "S#34458", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0455", "f31179", "S#34459", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0455", "f31180", "S#34460", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0455", "f31181", "S#34461", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0455", "f31182", "S#34462", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0455", "f31183", "S#34463", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0455", "f31184", "S#34464", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0455", "f31185", "S#34465", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0455", "f31186", "S#34466", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0455", "f31187", "S#34467", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0455", "f31188", "S#34468", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0455", "f31189", "S#34469", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0455", "f31190", "S#34470", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0455", "f31191", "S#34471", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0455", "f31192", "S#34472", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0455", "f31193", "S#34473", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0455", "f31194", "S#34474", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0455", "f31195", "S#34475", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0455", "f31196", "S#34476", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0455", "f31197", "S#34477", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0455", "f31198", "S#34478", 1, 1, false);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f31200() {
        return (SubLObject)NIL;
    }
    
    public static SubLObject f31201() {
        module0340.f22938($ic0$);
        module0340.f22947($ic0$, (SubLObject)$ic1$);
        module0358.f23774((SubLObject)$ic2$, $ic0$);
        module0358.f23771((SubLObject)$ic3$, $ic0$, (SubLObject)TWO_INTEGER);
        module0358.f23730((SubLObject)$ic4$, (SubLObject)$ic5$);
        module0358.f23730((SubLObject)$ic6$, (SubLObject)$ic7$);
        module0340.f22941((SubLObject)$ic8$, (SubLObject)$ic9$);
        module0340.f22941((SubLObject)$ic20$, (SubLObject)$ic21$);
        module0340.f22941((SubLObject)$ic22$, (SubLObject)$ic23$);
        module0340.f22941((SubLObject)$ic24$, (SubLObject)$ic25$);
        module0340.f22938($ic13$);
        module0340.f22947($ic13$, (SubLObject)$ic1$);
        module0358.f23774((SubLObject)$ic2$, $ic13$);
        module0358.f23771((SubLObject)$ic3$, $ic13$, (SubLObject)TWO_INTEGER);
        module0358.f23730((SubLObject)$ic29$, (SubLObject)$ic30$);
        module0358.f23730((SubLObject)$ic31$, (SubLObject)$ic32$);
        module0340.f22941((SubLObject)$ic33$, (SubLObject)$ic34$);
        module0340.f22941((SubLObject)$ic35$, (SubLObject)$ic36$);
        module0340.f22941((SubLObject)$ic37$, (SubLObject)$ic38$);
        module0340.f22941((SubLObject)$ic39$, (SubLObject)$ic40$);
        module0340.f22938($ic12$);
        module0340.f22947($ic12$, (SubLObject)$ic1$);
        module0358.f23774((SubLObject)$ic2$, $ic12$);
        module0358.f23771((SubLObject)$ic3$, $ic12$, (SubLObject)TWO_INTEGER);
        module0358.f23730((SubLObject)$ic41$, (SubLObject)$ic42$);
        module0358.f23730((SubLObject)$ic43$, (SubLObject)$ic44$);
        module0340.f22941((SubLObject)$ic45$, (SubLObject)$ic46$);
        module0340.f22941((SubLObject)$ic47$, (SubLObject)$ic48$);
        module0340.f22941((SubLObject)$ic49$, (SubLObject)$ic50$);
        module0340.f22941((SubLObject)$ic51$, (SubLObject)$ic52$);
        return (SubLObject)NIL;
    }
    
    public void declareFunctions() {
        f31199();
    }
    
    public void initializeVariables() {
        f31200();
    }
    
    public void runTopLevelForms() {
        f31201();
    }
    
    static {
        me = (SubLFile)new module0455();
        $ic0$ = constant_handles_oc.f8479((SubLObject)makeString("means"));
        $ic1$ = makeKeyword("REMOVAL-NON-WFF-CHECK-NEG");
        $ic2$ = makeKeyword("POS");
        $ic3$ = makeKeyword("NEG");
        $ic4$ = makeKeyword("MEANS-UNIFY-ARG1-POS");
        $ic5$ = ConsesLow.list((SubLObject)makeKeyword("SENSE"), (SubLObject)makeKeyword("POS"), (SubLObject)makeKeyword("PREDICATE"), constant_handles_oc.f8479((SubLObject)makeString("means")), (SubLObject)makeKeyword("REQUIRED-PATTERN"), (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("means")), (SubLObject)makeKeyword("NOT-FULLY-BOUND"), (SubLObject)makeKeyword("FULLY-BOUND")), (SubLObject)makeKeyword("PREFERENCE-LEVEL"), (SubLObject)makeKeyword("DISPREFERRED"));
        $ic6$ = makeKeyword("MEANS-UNIFY-ARG1-NEG");
        $ic7$ = ConsesLow.list((SubLObject)makeKeyword("SENSE"), (SubLObject)makeKeyword("NEG"), (SubLObject)makeKeyword("PREDICATE"), constant_handles_oc.f8479((SubLObject)makeString("means")), (SubLObject)makeKeyword("REQUIRED-PATTERN"), (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("means")), (SubLObject)makeKeyword("NOT-FULLY-BOUND"), (SubLObject)makeKeyword("FULLY-BOUND")), (SubLObject)makeKeyword("PREFERENCE-LEVEL"), (SubLObject)makeKeyword("DISPREFERRED"));
        $ic8$ = makeKeyword("REMOVAL-MEANS-CHECK-POS");
        $ic9$ = ConsesLow.list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), constant_handles_oc.f8479((SubLObject)makeString("means")), makeKeyword("REQUIRED-PATTERN"), ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("means")), (SubLObject)makeKeyword("FULLY-BOUND"), (SubLObject)makeKeyword("FULLY-BOUND")), makeKeyword("COST"), makeSymbol("S#34454", "CYC"), makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("EXPAND"), makeSymbol("S#34457", "CYC"), makeKeyword("DOCUMENTATION"), makeString("(#$means <fully-bound quoted term> <fully-bound>)"), makeKeyword("EXAMPLE"), makeString("(#$means (#$Quote #$Dog) #$Dog)\n(#$means #$MyFavoriteConstant #$Dog)\n(#$means (#$Quote (#$isa #$Muffet #$Dog)) (#$isa #$Muffet #$Dog))\n(#$means #$MyFavoriteSentence (#$isa #$Muffet #$Dog))") });
        $ic10$ = makeKeyword("OPAQUE");
        $ic11$ = ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("denotes")), constant_handles_oc.f8479((SubLObject)makeString("expresses")));
        $ic12$ = constant_handles_oc.f8479((SubLObject)makeString("expresses"));
        $ic13$ = constant_handles_oc.f8479((SubLObject)makeString("denotes"));
        $ic14$ = constant_handles_oc.f8479((SubLObject)makeString("QuasiQuote"));
        $ic15$ = constant_handles_oc.f8479((SubLObject)makeString("Quote"));
        $ic16$ = makeKeyword("GAF-ARG");
        $ic17$ = makeKeyword("GAF");
        $ic18$ = makeKeyword("PREDICATE-EXTENT");
        $ic19$ = makeKeyword("OVERLAP");
        $ic20$ = makeKeyword("REMOVAL-MEANS-UNIFY-ARG1-POS");
        $ic21$ = ConsesLow.list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), constant_handles_oc.f8479((SubLObject)makeString("means")), makeKeyword("REQUIRED-PATTERN"), ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("means")), (SubLObject)makeKeyword("NOT-FULLY-BOUND"), (SubLObject)makeKeyword("FULLY-BOUND")), makeKeyword("COST"), makeSymbol("S#34460", "CYC"), makeKeyword("COMPLETENESS"), makeKeyword("INCOMPLETE"), makeKeyword("EXPAND"), makeSymbol("S#34461", "CYC"), makeKeyword("DOCUMENTATION"), makeString("(#$means <not-fully-bound> <fully-bound>) from asserted sentences\n    (#$means <variable> <fully-bound>) by unifying variable with (#$Quote <fully-bound>)"), makeKeyword("EXAMPLE"), makeString("(#$means ?X #$Dog)\n    from assertion (#$denotes #$MyFavoriteConstant #$Dog)\n(#$means ?X (#$isa #$Muffet #$Dog))\n    from assertion (#$expresses #$MyFavoriteSentence (#$isa #$Muffet #$Dog))\n(#$means ?X #$Dog)\n    as (#$denotes (#$Quote #$Dog) #$Dog)\n(#$means ?X (#$isa #$Muffet #$Dog))\n    as (#$expresses (#$Quote (#$isa #$Muffet #$Dog)) (#$isa #$Muffet #$Dog))\n") });
        $ic22$ = makeKeyword("REMOVAL-MEANS-UNIFY-ARG2-POS");
        $ic23$ = ConsesLow.list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), constant_handles_oc.f8479((SubLObject)makeString("means")), makeKeyword("REQUIRED-PATTERN"), ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("means")), (SubLObject)makeKeyword("FULLY-BOUND"), (SubLObject)makeKeyword("NOT-FULLY-BOUND")), makeKeyword("COST-EXPRESSION"), ONE_INTEGER, makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("EXPAND"), makeSymbol("S#34462", "CYC"), makeKeyword("DOCUMENTATION"), makeString("(#$means <fully-bound quoted-term> <fully-bound>)"), makeKeyword("EXAMPLE"), makeString("(#$means (#$Quote #$Dog) ?X)\n(#$means #$MyFavoriteConstant ?X)\n(#$means (#$Quote (#$isa #$Muffet #$Dog)) ?X)\n(#$means #$MyFavoriteSentence ?X)") });
        $ic24$ = makeKeyword("REMOVAL-MEANS-NEG");
        $ic25$ = ConsesLow.list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("NEG"), makeKeyword("PREDICATE"), constant_handles_oc.f8479((SubLObject)makeString("means")), makeKeyword("REQUIRED-PATTERN"), ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("means")), (SubLObject)makeKeyword("ANYTHING"), (SubLObject)makeKeyword("FULLY-BOUND")), makeKeyword("COST-EXPRESSION"), ONE_INTEGER, makeKeyword("COMPLETENESS"), makeKeyword("INCOMPLETE"), makeKeyword("EXPAND"), makeSymbol("S#34465", "CYC"), makeKeyword("DOCUMENTATION"), makeString("(#$not (#$means <anything> <fully-bound>))"), makeKeyword("EXAMPLE"), makeString("(#$not (#$means #$Cat #$Dog))\n(#$not (#$means (#$Quote ?X) #$Dog))\n(#$not (#$means (#$Quote (#$EscapeQuote #$Cat)) #$Dog))\n(#$not (#$means #$Cat (#$isa #$Muffet #$Dog)))\n(#$not (#$means (#$isa #$Muffet #$Cat) (#$isa #$Muffet #$Dog)))\n(#$not (#$means (#$Quote ?X) (#$isa #$Muffet #$Dog)))\n(#$not (#$means (#$Quote (#$EscapeQuote (#$isa #$Muffet #$Cat))) (#$isa #$Muffet #$Dog)))") });
        $ic26$ = constant_handles_oc.f8479((SubLObject)makeString("CycLTerm"));
        $ic27$ = constant_handles_oc.f8479((SubLObject)makeString("CycLDenotationalTerm"));
        $ic28$ = constant_handles_oc.f8479((SubLObject)makeString("CycLSentence"));
        $ic29$ = makeKeyword("DENOTES-UNIFY-ARG1-POS");
        $ic30$ = ConsesLow.list((SubLObject)makeKeyword("SENSE"), (SubLObject)makeKeyword("POS"), (SubLObject)makeKeyword("PREDICATE"), constant_handles_oc.f8479((SubLObject)makeString("denotes")), (SubLObject)makeKeyword("REQUIRED-PATTERN"), (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("denotes")), (SubLObject)makeKeyword("NOT-FULLY-BOUND"), (SubLObject)makeKeyword("FULLY-BOUND")), (SubLObject)makeKeyword("PREFERENCE-LEVEL"), (SubLObject)makeKeyword("DISPREFERRED"));
        $ic31$ = makeKeyword("DENOTES-UNIFY-ARG1-NEG");
        $ic32$ = ConsesLow.list((SubLObject)makeKeyword("SENSE"), (SubLObject)makeKeyword("NEG"), (SubLObject)makeKeyword("PREDICATE"), constant_handles_oc.f8479((SubLObject)makeString("denotes")), (SubLObject)makeKeyword("REQUIRED-PATTERN"), (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("denotes")), (SubLObject)makeKeyword("NOT-FULLY-BOUND"), (SubLObject)makeKeyword("FULLY-BOUND")), (SubLObject)makeKeyword("PREFERENCE-LEVEL"), (SubLObject)makeKeyword("DISPREFERRED"));
        $ic33$ = makeKeyword("REMOVAL-DENOTES-CHECK-POS");
        $ic34$ = ConsesLow.list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), constant_handles_oc.f8479((SubLObject)makeString("denotes")), makeKeyword("REQUIRED-PATTERN"), ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("denotes")), (SubLObject)makeKeyword("FULLY-BOUND"), (SubLObject)makeKeyword("FULLY-BOUND")), makeKeyword("COST"), makeSymbol("S#34467", "CYC"), makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("EXPAND"), makeSymbol("S#34468", "CYC"), makeKeyword("DOCUMENTATION"), makeString("(#$denotes <fully-bound quoted term> <fully-bound>)"), makeKeyword("EXAMPLE"), makeString("(#$denotes (#$Quote #$Dog) #$Dog)\n(#$denotes #$MyFavoriteConstant #$Dog)") });
        $ic35$ = makeKeyword("REMOVAL-DENOTES-UNIFY-ARG1-POS");
        $ic36$ = ConsesLow.list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), constant_handles_oc.f8479((SubLObject)makeString("denotes")), makeKeyword("REQUIRED-PATTERN"), ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("denotes")), (SubLObject)makeKeyword("NOT-FULLY-BOUND"), (SubLObject)makeKeyword("FULLY-BOUND")), makeKeyword("COST"), makeSymbol("S#34469", "CYC"), makeKeyword("COMPLETENESS"), makeKeyword("INCOMPLETE"), makeKeyword("EXPAND"), makeSymbol("S#34470", "CYC"), makeKeyword("DOCUMENTATION"), makeString("(#$denotes <not-fully-bound> <fully-bound>) from asserted sentences\n    (#$denotes <variable> <fully-bound>) by unifying variable with (#$Quote <fully-bound>)"), makeKeyword("EXAMPLE"), makeString("(#$denotes ?X #$Dog)\n    from assertion (#$denotes #$MyFavoriteConstant #$Dog)\n\n    (#$denotes ?X #$Dog)\n    as (#$denotes (#$Quote #$Dog) #$Dog)") });
        $ic37$ = makeKeyword("REMOVAL-DENOTES-UNIFY-ARG2-POS");
        $ic38$ = ConsesLow.list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), constant_handles_oc.f8479((SubLObject)makeString("denotes")), makeKeyword("REQUIRED-PATTERN"), ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("denotes")), (SubLObject)makeKeyword("FULLY-BOUND"), (SubLObject)makeKeyword("NOT-FULLY-BOUND")), makeKeyword("COST-EXPRESSION"), ONE_INTEGER, makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("EXPAND"), makeSymbol("S#34471", "CYC"), makeKeyword("DOCUMENTATION"), makeString("(#$denotes <fully-bound quoted-term> <fully-bound>)"), makeKeyword("EXAMPLE"), makeString("(#$denotes (#$Quote #$Dog) ?X)\n    (#$denotes #$MyFavoriteConstant ?X)") });
        $ic39$ = makeKeyword("REMOVAL-DENOTES-NEG");
        $ic40$ = ConsesLow.list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("NEG"), makeKeyword("PREDICATE"), constant_handles_oc.f8479((SubLObject)makeString("denotes")), makeKeyword("REQUIRED-PATTERN"), ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("denotes")), (SubLObject)makeKeyword("ANYTHING"), (SubLObject)makeKeyword("FULLY-BOUND")), makeKeyword("COST-EXPRESSION"), ONE_INTEGER, makeKeyword("COMPLETENESS"), makeKeyword("INCOMPLETE"), makeKeyword("EXPAND"), makeSymbol("S#34472", "CYC"), makeKeyword("DOCUMENTATION"), makeString("(#$not (#$denotes <anything> <fully-bound>))"), makeKeyword("EXAMPLE"), makeString("(#$not (#$denotes #$Cat #$Dog))\n(#$not (#$denotes #$Cat (#$isa #$Muffet #$Dog)))\n(#$not (#$denotes (#$Quote ?X) #$Dog))\n(#$not (#$denotes (#$Quote (#$EscapeQuote #$Cat)) #$Dog))") });
        $ic41$ = makeKeyword("EXPRESSES-UNIFY-ARG1-POS");
        $ic42$ = ConsesLow.list((SubLObject)makeKeyword("SENSE"), (SubLObject)makeKeyword("POS"), (SubLObject)makeKeyword("PREDICATE"), constant_handles_oc.f8479((SubLObject)makeString("expresses")), (SubLObject)makeKeyword("REQUIRED-PATTERN"), (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("expresses")), (SubLObject)makeKeyword("NOT-FULLY-BOUND"), (SubLObject)makeKeyword("FULLY-BOUND")), (SubLObject)makeKeyword("PREFERENCE-LEVEL"), (SubLObject)makeKeyword("DISPREFERRED"));
        $ic43$ = makeKeyword("EXPRESSES-UNIFY-ARG1-NEG");
        $ic44$ = ConsesLow.list((SubLObject)makeKeyword("SENSE"), (SubLObject)makeKeyword("NEG"), (SubLObject)makeKeyword("PREDICATE"), constant_handles_oc.f8479((SubLObject)makeString("expresses")), (SubLObject)makeKeyword("REQUIRED-PATTERN"), (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("expresses")), (SubLObject)makeKeyword("NOT-FULLY-BOUND"), (SubLObject)makeKeyword("FULLY-BOUND")), (SubLObject)makeKeyword("PREFERENCE-LEVEL"), (SubLObject)makeKeyword("DISPREFERRED"));
        $ic45$ = makeKeyword("REMOVAL-EXPRESSES-CHECK-POS");
        $ic46$ = ConsesLow.list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), constant_handles_oc.f8479((SubLObject)makeString("expresses")), makeKeyword("REQUIRED-PATTERN"), ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("expresses")), (SubLObject)makeKeyword("FULLY-BOUND"), (SubLObject)makeKeyword("FULLY-BOUND")), makeKeyword("COST"), makeSymbol("S#34473", "CYC"), makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("EXPAND"), makeSymbol("S#34474", "CYC"), makeKeyword("DOCUMENTATION"), makeString("(#$expresses <fully-bound quoted term> <fully-bound>)"), makeKeyword("EXAMPLE"), makeString("(#$expresses (#$Quote (#$isa #$Muffet #$Dog)) (#$isa #$Muffet #$Dog))\n(#$expresses #$MyFavoriteSentence (#$isa #$Muffet #$Dog))") });
        $ic47$ = makeKeyword("REMOVAL-EXPRESSES-UNIFY-ARG1-POS");
        $ic48$ = ConsesLow.list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), constant_handles_oc.f8479((SubLObject)makeString("expresses")), makeKeyword("REQUIRED-PATTERN"), ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("expresses")), (SubLObject)makeKeyword("NOT-FULLY-BOUND"), (SubLObject)makeKeyword("FULLY-BOUND")), makeKeyword("COST"), makeSymbol("S#34475", "CYC"), makeKeyword("COMPLETENESS"), makeKeyword("INCOMPLETE"), makeKeyword("EXPAND"), makeSymbol("S#34476", "CYC"), makeKeyword("DOCUMENTATION"), makeString("(#$expresses <not-fully-bound> <fully-bound>) from asserted sentences\n    (#$expresses <variable> <fully-bound>) by unifying variable with (#$Quote <fully-bound>)"), makeKeyword("EXAMPLE"), makeString("(#$expresses ?X (#$isa #$Muffet #$Dog))\n    from assertion (#$expresses #$MyFavoriteSentence (#$isa #$Muffet #$Dog))\n\n(#$expresses ?X (#$isa #$Muffet #$Dog))\n    as (#$expresses (#$Quote (#$isa #$Muffet #$Dog)) (#$isa #$Muffet #$Dog))") });
        $ic49$ = makeKeyword("REMOVAL-EXPRESSES-UNIFY-ARG2-POS");
        $ic50$ = ConsesLow.list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), constant_handles_oc.f8479((SubLObject)makeString("expresses")), makeKeyword("REQUIRED-PATTERN"), ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("expresses")), (SubLObject)makeKeyword("FULLY-BOUND"), (SubLObject)makeKeyword("NOT-FULLY-BOUND")), makeKeyword("COST-EXPRESSION"), ONE_INTEGER, makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("EXPAND"), makeSymbol("S#34477", "CYC"), makeKeyword("DOCUMENTATION"), makeString("(#$expresses <fully-bound quoted-term> <fully-bound>)"), makeKeyword("EXAMPLE"), makeString("(#$expresses (#$Quote (#$isa #$Muffet #$Dog)) ?X)\n(#$expresses #$MyFavoriteSentence ?X)") });
        $ic51$ = makeKeyword("REMOVAL-EXPRESSES-NEG");
        $ic52$ = ConsesLow.list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("NEG"), makeKeyword("PREDICATE"), constant_handles_oc.f8479((SubLObject)makeString("expresses")), makeKeyword("REQUIRED-PATTERN"), ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("expresses")), (SubLObject)makeKeyword("ANYTHING"), (SubLObject)makeKeyword("FULLY-BOUND")), makeKeyword("COST-EXPRESSION"), ONE_INTEGER, makeKeyword("COMPLETENESS"), makeKeyword("INCOMPLETE"), makeKeyword("EXPAND"), makeSymbol("S#34478", "CYC"), makeKeyword("DOCUMENTATION"), makeString("(#$not (#$expresses <anything> <fully-bound>))"), makeKeyword("EXAMPLE"), makeString("(#$not (#$expresses #$Cat (#$isa #$Muffet #$Dog)))\n(#$not (#$expresses (#$isa #$Muffet #$Cat) (#$isa #$Muffet #$Dog)))\n(#$not (#$expresses (#$Quote ?X) (#$isa #$Muffet #$Dog)))\n(#$not (#$expresses (#$Quote (#$EscapeQuote (#$isa #$Muffet #$Cat))) (#$isa #$Muffet #$Dog)))") });
    }
}

/*
	DECOMPILATION REPORT

	Decompiled from: G:\opt\CYC_JRTL_with_CommonLisp\platform\lib\cyc-oc4.0-unzipped/com/cyc/cycjava/cycl/class
	Total time: 1048 ms
	
	Decompiled with Procyon 0.5.32.
*/