package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.StreamsLow;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Time;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Strings;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.compatibility;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Filesys;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class module0572 extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.module0572";
    public static final String myFingerPrint = "04eb4b37e6efa89c0f1892cea402228f7dcb1651cb20bc0ece6bbd31591e927e";
    public static SubLSymbol $g4151$;
    public static SubLSymbol $g4152$;
    public static SubLSymbol $g4153$;
    public static SubLSymbol $g4154$;
    public static SubLSymbol $g4155$;
    public static SubLSymbol $g4156$;
    public static SubLSymbol $g4157$;
    public static SubLSymbol $g4158$;
    public static SubLSymbol $g4159$;
    public static SubLSymbol $g4160$;
    public static SubLSymbol $g4161$;
    public static SubLSymbol $g4162$;
    public static SubLSymbol $g4163$;
    private static SubLSymbol $g4164$;
    private static SubLSymbol $g4165$;
    private static final SubLSymbol $ic0$;
    private static final SubLSymbol $ic1$;
    private static final SubLString $ic2$;
    private static final SubLSymbol $ic3$;
    private static final SubLSymbol $ic4$;
    private static final SubLSymbol $ic5$;
    private static final SubLSymbol $ic6$;
    private static final SubLSymbol $ic7$;
    private static final SubLInteger $ic8$;
    private static final SubLSymbol $ic9$;
    private static final SubLString $ic10$;
    private static final SubLSymbol $ic11$;
    private static final SubLSymbol $ic12$;
    private static final SubLString $ic13$;
    private static final SubLString $ic14$;
    private static final SubLSymbol $ic15$;
    private static final SubLSymbol $ic16$;
    private static final SubLSymbol $ic17$;
    private static final SubLString $ic18$;
    private static final SubLString $ic19$;
    private static final SubLString $ic20$;
    private static final SubLString $ic21$;
    private static final SubLString $ic22$;
    private static final SubLSymbol $ic23$;
    private static final SubLString $ic24$;
    private static final SubLString $ic25$;
    private static final SubLString $ic26$;
    private static final SubLSymbol $ic27$;
    private static final SubLSymbol $ic28$;
    private static final SubLSymbol $ic29$;
    private static final SubLSymbol $ic30$;
    private static final SubLInteger $ic31$;
    private static final SubLString $ic32$;
    private static final SubLString $ic33$;
    private static final SubLString $ic34$;
    private static final SubLSymbol $ic35$;
    private static final SubLString $ic36$;
    private static final SubLList $ic37$;
    private static final SubLSymbol $ic38$;
    private static final SubLList $ic39$;
    private static final SubLSymbol $ic40$;
    private static final SubLList $ic41$;
    private static final SubLSymbol $ic42$;
    private static final SubLList $ic43$;
    private static final SubLString $ic44$;
    private static final SubLString $ic45$;
    private static final SubLString $ic46$;
    private static final SubLString $ic47$;
    private static final SubLString $ic48$;
    private static final SubLList $ic49$;
    private static final SubLString $ic50$;
    private static final SubLList $ic51$;
    private static final SubLString $ic52$;
    private static final SubLString $ic53$;
    private static final SubLList $ic54$;
    private static final SubLString $ic55$;
    private static final SubLString $ic56$;
    private static final SubLSymbol $ic57$;
    private static final SubLInteger $ic58$;
    private static final SubLSymbol $ic59$;
    private static final SubLSymbol $ic60$;
    private static final SubLSymbol $ic61$;
    private static final SubLString $ic62$;
    private static final SubLString $ic63$;
    private static final SubLSymbol $ic64$;
    private static final SubLList $ic65$;
    private static final SubLString $ic66$;
    private static final SubLList $ic67$;
    private static final SubLSymbol $ic68$;
    private static final SubLSymbol $ic69$;
    private static final SubLString $ic70$;
    private static final SubLString $ic71$;
    private static final SubLList $ic72$;
    private static final SubLString $ic73$;
    private static final SubLString $ic74$;
    private static final SubLSymbol $ic75$;
    private static final SubLList $ic76$;
    private static final SubLString $ic77$;
    private static final SubLString $ic78$;
    private static final SubLSymbol $ic79$;
    private static final SubLSymbol $ic80$;
    private static final SubLSymbol $ic81$;
    private static final SubLSymbol $ic82$;
    private static final SubLString $ic83$;
    private static final SubLString $ic84$;
    private static final SubLSymbol $ic85$;
    private static final SubLString $ic86$;
    private static final SubLSymbol $ic87$;
    private static final SubLString $ic88$;
    private static final SubLString $ic89$;
    private static final SubLSymbol $ic90$;
    private static final SubLString $ic91$;
    private static final SubLObject $ic92$;
    private static final SubLSymbol $ic93$;
    private static final SubLString $ic94$;
    private static final SubLSymbol $ic95$;
    private static final SubLString $ic96$;
    private static final SubLSymbol $ic97$;
    private static final SubLString $ic98$;
    private static final SubLSymbol $ic99$;
    private static final SubLString $ic100$;
    private static final SubLSymbol $ic101$;
    private static final SubLString $ic102$;
    private static final SubLString $ic103$;
    private static final SubLString $ic104$;
    private static final SubLSymbol $ic105$;
    private static final SubLSymbol $ic106$;
    private static final SubLSymbol $ic107$;
    private static final SubLString $ic108$;
    private static final SubLString $ic109$;
    private static final SubLString $ic110$;
    private static final SubLString $ic111$;
    private static final SubLString $ic112$;
    private static final SubLString $ic113$;
    private static final SubLSymbol $ic114$;
    private static final SubLSymbol $ic115$;
    private static final SubLString $ic116$;
    private static final SubLString $ic117$;
    private static final SubLString $ic118$;
    private static final SubLSymbol $ic119$;
    private static final SubLString $ic120$;
    private static final SubLString $ic121$;
    private static final SubLString $ic122$;
    
    public static SubLObject f35011(final SubLObject var1, SubLObject var2) {
        if (var2 == UNPROVIDED) {
            var2 = (SubLObject)NIL;
        }
        return f35012(var1, (SubLObject)T, var2);
    }
    
    public static SubLObject f35013(final SubLObject var1, SubLObject var2) {
        if (var2 == UNPROVIDED) {
            var2 = (SubLObject)NIL;
        }
        return f35012(var1, (SubLObject)NIL, var2);
    }
    
    public static SubLObject f35012(SubLObject var1, final SubLObject var3, final SubLObject var2) {
        final SubLThread var4 = SubLProcess.currentSubLThread();
        SubLObject var5 = (SubLObject)T;
        SubLObject var6 = (SubLObject)NIL;
        var1 = module0280.f18631(var1);
        final SubLObject var7 = module0539.$g3936$.currentBinding(var4);
        try {
            module0539.$g3936$.bind((NIL != var2) ? var2 : module0539.f33492(), var4);
            if (NIL != var3) {
                SubLObject var8 = (SubLObject)NIL;
                try {
                    var4.throwStack.push($ic0$);
                    final SubLObject var7_9 = Errors.$error_handler$.currentBinding(var4);
                    try {
                        Errors.$error_handler$.bind(Symbols.symbol_function((SubLObject)$ic1$), var4);
                        try {
                            var5 = (SubLObject)NIL;
                            var6 = module0112.f7688(var1);
                            var5 = (SubLObject)T;
                        }
                        catch (Throwable var9) {
                            Errors.handleThrowable(var9, (SubLObject)NIL);
                        }
                    }
                    finally {
                        Errors.$error_handler$.rebind(var7_9, var4);
                    }
                }
                catch (Throwable var10) {
                    var8 = Errors.handleThrowable(var10, (SubLObject)$ic0$);
                }
                finally {
                    var4.throwStack.pop();
                }
            }
            if (NIL != var5) {
                final SubLObject var11 = f35014(var1);
                module0575.f35295(var11);
            }
        }
        finally {
            module0539.$g3936$.rebind(var7, var4);
        }
        return var6;
    }
    
    public static SubLObject f35014(final SubLObject var1) {
        return module0575.f35285(var1);
    }
    
    public static SubLObject f35015() {
        f35016((SubLObject)NIL);
        f35017();
        f35018((SubLObject)UNPROVIDED);
        f35019(f35020());
        if (NIL != module0573.f35083()) {
            module0018.$g682$.setGlobalValue((SubLObject)T);
        }
        return (SubLObject)T;
    }
    
    public static SubLObject f35021() {
        final SubLThread var4 = SubLProcess.currentSubLThread();
        return $g4151$.getDynamicValue(var4);
    }
    
    public static SubLObject f35022() {
        final SubLThread var4 = SubLProcess.currentSubLThread();
        return $g4152$.getDynamicValue(var4);
    }
    
    public static SubLObject f35016(final SubLObject var13) {
        final SubLThread var14 = SubLProcess.currentSubLThread();
        $g4152$.setDynamicValue(var13, var14);
        return $g4152$.getDynamicValue(var14);
    }
    
    public static SubLObject f35023() {
        return $g4153$.getGlobalValue();
    }
    
    public static SubLObject f35024() {
        $g4153$.setGlobalValue(Numbers.add($g4153$.getGlobalValue(), (SubLObject)ONE_INTEGER));
        return $g4153$.getGlobalValue();
    }
    
    public static SubLObject f35025() {
        return $g4154$.getGlobalValue();
    }
    
    public static SubLObject f35026(final SubLObject var14) {
        $g4154$.setGlobalValue((SubLObject)ConsesLow.cons(var14, $g4154$.getGlobalValue()));
        return (SubLObject)NIL;
    }
    
    public static SubLObject f35027() {
        return $g4155$.getGlobalValue();
    }
    
    public static SubLObject f35028() {
        $g4155$.setGlobalValue(Numbers.add($g4155$.getGlobalValue(), (SubLObject)ONE_INTEGER));
        return $g4155$.getGlobalValue();
    }
    
    public static SubLObject f35029() {
        return $g4156$.getGlobalValue();
    }
    
    public static SubLObject f35030(final SubLObject var14) {
        $g4156$.setGlobalValue((SubLObject)ConsesLow.cons(var14, $g4156$.getGlobalValue()));
        return (SubLObject)NIL;
    }
    
    public static SubLObject f35031() {
        return $g4157$.getGlobalValue();
    }
    
    public static SubLObject f35032(final SubLObject var13) {
        $g4157$.setGlobalValue(var13);
        return $g4157$.getGlobalValue();
    }
    
    public static SubLObject f35033() {
        final SubLThread var4 = SubLProcess.currentSubLThread();
        return $g4158$.getDynamicValue(var4);
    }
    
    public static SubLObject f35034(final SubLObject var13) {
        final SubLThread var14 = SubLProcess.currentSubLThread();
        $g4158$.setDynamicValue(var13, var14);
        return $g4158$.getDynamicValue(var14);
    }
    
    public static SubLObject f35035() {
        return $g4159$.getGlobalValue();
    }
    
    public static SubLObject f35036(final SubLObject var15) {
        final SubLObject var16 = $g4159$.getGlobalValue();
        if (NIL != var16) {
            final SubLObject var17 = f35037(var16, var15);
            if (NIL != Filesys.probe_file(var16)) {
                Filesys.rename_file(var16, var17);
            }
            $g4159$.setGlobalValue(var17);
            return var17;
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f35038() {
        f35036((SubLObject)$ic10$);
        $g4159$.setGlobalValue((SubLObject)NIL);
        f35039();
        if (NIL == module0575.f35278()) {
            SubLObject var18 = (SubLObject)NIL;
            try {
                var18 = compatibility.open_text(f35035(), (SubLObject)((NIL != Filesys.probe_file(f35035())) ? $ic11$ : $ic12$));
                if (!var18.isStream()) {
                    Errors.error((SubLObject)$ic13$, f35035());
                }
                final SubLObject var19_20 = var18;
                SubLObject var19 = module0575.f35282();
                SubLObject var20 = (SubLObject)NIL;
                var20 = var19.first();
                while (NIL != var19) {
                    PrintLow.format(var19_20, (SubLObject)$ic14$, var20);
                    var19 = var19.rest();
                    var20 = var19.first();
                }
            }
            finally {
                final SubLObject var21 = Dynamic.currentBinding(Threads.$is_thread_performing_cleanupP$);
                try {
                    Dynamic.bind(Threads.$is_thread_performing_cleanupP$, (SubLObject)T);
                    if (var18.isStream()) {
                        streams_high.close(var18, (SubLObject)UNPROVIDED);
                    }
                }
                finally {
                    Dynamic.rebind(Threads.$is_thread_performing_cleanupP$, var21);
                }
            }
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f35017() {
        module0575.f35279();
        return f35039();
    }
    
    public static SubLObject f35039() {
        if (NIL != $g4159$.getGlobalValue() && NIL != Filesys.probe_file($g4159$.getGlobalValue())) {
            f35026($g4159$.getGlobalValue());
            f35024();
        }
        $g4159$.setGlobalValue(f35040(f35041(f35023())));
        return $g4159$.getGlobalValue();
    }
    
    public static SubLObject f35042() {
        return $g4160$.getGlobalValue();
    }
    
    public static SubLObject f35019(final SubLObject var23) {
        $g4160$.setGlobalValue(var23);
        return $g4160$.getGlobalValue();
    }
    
    public static SubLObject f35020() {
        return $g4161$.getGlobalValue();
    }
    
    public static SubLObject f35018(SubLObject var24) {
        if (var24 == UNPROVIDED) {
            var24 = f35043((SubLObject)UNPROVIDED);
        }
        if (NIL == module0573.f35083()) {
            $g4161$.setGlobalValue(f35040(var24));
        }
        return $g4161$.getGlobalValue();
    }
    
    public static SubLObject f35044() {
        if (NIL != Filesys.probe_file(f35035())) {
            return (SubLObject)ConsesLow.cons(f35035(), f35025());
        }
        return f35025();
    }
    
    public static SubLObject f35045() {
        return $g4162$.getGlobalValue();
    }
    
    public static SubLObject f35046(final SubLObject var15) {
        final SubLObject var16 = $g4162$.getGlobalValue();
        if (NIL != var16) {
            final SubLObject var17 = f35037(var16, var15);
            if (NIL != Filesys.probe_file(var16)) {
                Filesys.rename_file(var16, var17);
            }
            $g4162$.setGlobalValue(var17);
            return var17;
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f35047() {
        f35046((SubLObject)$ic10$);
        $g4162$.setGlobalValue((SubLObject)NIL);
        f35048();
        if (NIL == module0575.f35278()) {
            SubLObject var25 = (SubLObject)NIL;
            try {
                var25 = compatibility.open_text(f35045(), (SubLObject)((NIL != Filesys.probe_file(f35045())) ? $ic11$ : $ic12$));
                if (!var25.isStream()) {
                    Errors.error((SubLObject)$ic13$, f35045());
                }
                final SubLObject var19_26 = var25;
                SubLObject var26 = module0575.f35282();
                SubLObject var27 = (SubLObject)NIL;
                var27 = var26.first();
                while (NIL != var26) {
                    PrintLow.format(var19_26, (SubLObject)$ic14$, var27);
                    var26 = var26.rest();
                    var27 = var26.first();
                }
            }
            finally {
                final SubLObject var28 = Dynamic.currentBinding(Threads.$is_thread_performing_cleanupP$);
                try {
                    Dynamic.bind(Threads.$is_thread_performing_cleanupP$, (SubLObject)T);
                    if (var25.isStream()) {
                        streams_high.close(var25, (SubLObject)UNPROVIDED);
                    }
                }
                finally {
                    Dynamic.rebind(Threads.$is_thread_performing_cleanupP$, var28);
                }
            }
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f35049() {
        module0575.f35279();
        return f35048();
    }
    
    public static SubLObject f35048() {
        if (NIL != $g4162$.getGlobalValue() && NIL != Filesys.probe_file($g4162$.getGlobalValue())) {
            f35030($g4162$.getGlobalValue());
            f35028();
        }
        $g4162$.setGlobalValue(f35040(f35050(f35027())));
        return $g4162$.getGlobalValue();
    }
    
    public static SubLObject f35043(SubLObject var27) {
        if (var27 == UNPROVIDED) {
            var27 = module0018.f971();
        }
        final SubLObject var28 = PrintLow.format((SubLObject)NIL, (SubLObject)$ic18$, var27);
        return var28;
    }
    
    public static SubLObject f35041(final SubLObject var28) {
        if (NIL == module0018.f967()) {
            module0018.f966();
        }
        final SubLObject var29 = PrintLow.format((SubLObject)NIL, (SubLObject)$ic19$, module0018.f967(), var28);
        return var29;
    }
    
    public static SubLObject f35050(final SubLObject var28) {
        if (NIL == module0018.f967()) {
            module0018.f966();
        }
        final SubLObject var29 = PrintLow.format((SubLObject)NIL, (SubLObject)$ic20$, module0018.f967(), var28);
        return var29;
    }
    
    public static SubLObject f35040(final SubLObject var24) {
        final SubLObject var25 = Sequences.cconcatenate(f35051(), new SubLObject[] { var24, $ic21$, f35021() });
        return var25;
    }
    
    public static SubLObject f35051() {
        return f35052(module0018.f971());
    }
    
    public static SubLObject f35053() {
        return f35052(Numbers.add((SubLObject)ONE_INTEGER, module0018.f971()));
    }
    
    public static SubLObject f35052(final SubLObject var29) {
        final SubLObject var30 = module0075.f5177((SubLObject)ConsesLow.list((SubLObject)$ic22$, module0574.f35166(var29)));
        if (NIL == Filesys.directory_p(var30)) {
            module0075.f5241(var30, (SubLObject)T, (SubLObject)UNPROVIDED);
        }
        return var30;
    }
    
    public static SubLObject f35037(final SubLObject var14, final SubLObject var15) {
        assert NIL != Types.stringp(var14) : var14;
        assert NIL != Types.stringp(var15) : var15;
        if (NIL != module0038.f2668((SubLObject)$ic24$, var14, Symbols.symbol_function((SubLObject)EQUAL), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)) {
            return module0038.f2669(var14, (SubLObject)$ic24$, Sequences.cconcatenate((SubLObject)$ic25$, new SubLObject[] { Strings.string_upcase(var15, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED), $ic24$ }));
        }
        return module0038.f2669(var14, (SubLObject)$ic26$, Sequences.cconcatenate((SubLObject)$ic25$, new SubLObject[] { Strings.string_downcase(var15, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED), $ic26$ }));
    }
    
    public static SubLObject f35054(final SubLObject var31) {
        final SubLObject var32 = conses_high.assoc(var31, $g4163$.getGlobalValue(), Symbols.symbol_function((SubLObject)EQUALP), (SubLObject)UNPROVIDED);
        if (NIL != var32) {
            return var32;
        }
        return (SubLObject)ConsesLow.list(var31, (SubLObject)ZERO_INTEGER, (SubLObject)ZERO_INTEGER);
    }
    
    public static SubLObject f35055(final SubLObject var31) {
        return conses_high.second(f35054(var31));
    }
    
    public static SubLObject f35056(final SubLObject var31) {
        return conses_high.third(f35054(var31));
    }
    
    public static SubLObject f35057(final SubLObject var31, final SubLObject var33, final SubLObject var34) {
        SubLObject var35 = Sequences.remove(var31, $g4163$.getGlobalValue(), Symbols.symbol_function((SubLObject)EQUALP), Symbols.symbol_function((SubLObject)$ic28$), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        var35 = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(var31, var33, var34), var35);
        $g4163$.setGlobalValue(var35);
        return $g4163$.getGlobalValue();
    }
    
    public static SubLObject f35058(final SubLObject var31) {
        SubLObject var32 = (SubLObject)ZERO_INTEGER;
        if (var31.isString() && NIL != Filesys.probe_file(var31)) {
            SubLObject var33 = (SubLObject)NIL;
            try {
                var33 = compatibility.open_text(var31, (SubLObject)$ic29$);
                if (!var33.isStream()) {
                    Errors.error((SubLObject)$ic13$, var31);
                }
                SubLObject var34;
                SubLObject var35;
                for (var34 = var33, var35 = (SubLObject)NIL, var35 = reader.read_ignoring_errors(var34, (SubLObject)NIL, (SubLObject)NIL); NIL != var35; var35 = reader.read_ignoring_errors(var34, (SubLObject)NIL, (SubLObject)NIL)) {
                    if (NIL != var35) {
                        var32 = Numbers.add(var32, (SubLObject)ONE_INTEGER);
                    }
                }
            }
            finally {
                final SubLObject var36 = Dynamic.currentBinding(Threads.$is_thread_performing_cleanupP$);
                try {
                    Dynamic.bind(Threads.$is_thread_performing_cleanupP$, (SubLObject)T);
                    if (var33.isStream()) {
                        streams_high.close(var33, (SubLObject)UNPROVIDED);
                    }
                }
                finally {
                    Dynamic.rebind(Threads.$is_thread_performing_cleanupP$, var36);
                }
            }
        }
        return var32;
    }
    
    public static SubLObject f35059(final SubLObject var31) {
        SubLObject var32 = f35055(var31);
        SubLObject var33 = f35056(var31);
        SubLObject var34 = (SubLObject)ZERO_INTEGER;
        SubLObject var35 = (SubLObject)ZERO_INTEGER;
        SubLObject var36 = (SubLObject)NIL;
        SubLObject var37 = (SubLObject)NIL;
        if (var31.isString() && NIL != Filesys.probe_file(var31)) {
            SubLObject var38 = (SubLObject)NIL;
            try {
                var38 = compatibility.open_text(var31, (SubLObject)$ic29$);
                if (!var38.isStream()) {
                    Errors.error((SubLObject)$ic13$, var31);
                }
                final SubLObject var39 = var38;
                final SubLObject var40 = streams_high.file_length(var39);
                compatibility.set_file_position(var39, var33);
                SubLObject var41;
                for (var41 = (SubLObject)NIL, var41 = streams_high.read_char(var39, (SubLObject)NIL, (SubLObject)$ic30$, (SubLObject)UNPROVIDED); var41 != $ic30$; var41 = streams_high.read_char(var39, (SubLObject)NIL, (SubLObject)$ic30$, (SubLObject)UNPROVIDED)) {
                    if (NIL != Characters.charE((SubLObject)Characters.CHAR_quotation, var41) && !var37.eql((SubLObject)Characters.CHAR_backslash)) {
                        var36 = (SubLObject)makeBoolean(NIL == var36);
                    }
                    if (NIL == var36) {
                        if (NIL != Characters.charE((SubLObject)Characters.CHAR_lparen, var41)) {
                            var34 = Numbers.add(var34, (SubLObject)ONE_INTEGER);
                        }
                        if (NIL != Characters.charE((SubLObject)Characters.CHAR_rparen, var41)) {
                            var35 = Numbers.add(var35, (SubLObject)ONE_INTEGER);
                            if (var35.numG((SubLObject)ZERO_INTEGER) && var35.numE(var34)) {
                                var32 = Numbers.add(var32, (SubLObject)ONE_INTEGER);
                            }
                        }
                    }
                    var37 = var41;
                }
                var33 = compatibility.get_file_position(var39);
                if (var40.numG((SubLObject)$ic31$) && var31.equalp(f35020())) {
                    f35034(Numbers.integerDivide(var40, var32));
                }
            }
            finally {
                final SubLObject var42 = Dynamic.currentBinding(Threads.$is_thread_performing_cleanupP$);
                try {
                    Dynamic.bind(Threads.$is_thread_performing_cleanupP$, (SubLObject)T);
                    if (var38.isStream()) {
                        streams_high.close(var38, (SubLObject)UNPROVIDED);
                    }
                }
                finally {
                    Dynamic.rebind(Threads.$is_thread_performing_cleanupP$, var42);
                }
            }
        }
        f35057(var31, var32, var33);
        return var32;
    }
    
    public static SubLObject f35060(final SubLObject var23) {
        final SubLObject var24 = module0075.f5249(var23);
        return Numbers.integerDivide(var24, f35033());
    }
    
    public static SubLObject f35061(final SubLObject var49, final SubLObject var50, SubLObject var51, SubLObject var52) {
        if (var51 == UNPROVIDED) {
            var51 = (SubLObject)NIL;
        }
        if (var52 == UNPROVIDED) {
            var52 = (SubLObject)T;
        }
        SubLObject var53 = (SubLObject)ZERO_INTEGER;
        SubLObject var54 = (SubLObject)NIL;
        if (var49.isString() && NIL != Filesys.probe_file(var49)) {
            SubLObject var55 = (SubLObject)NIL;
            try {
                var55 = compatibility.open_text(var49, (SubLObject)$ic29$);
                if (!var55.isStream()) {
                    Errors.error((SubLObject)$ic13$, var49);
                }
                SubLObject var56;
                SubLObject var57;
                for (var56 = var55, var57 = (SubLObject)NIL, var57 = reader.read_ignoring_errors(var56, (SubLObject)NIL, (SubLObject)$ic30$); var57 != $ic30$ && (!var51.isInteger() || !var53.numGE(var51)); var57 = reader.read_ignoring_errors(var56, (SubLObject)NIL, (SubLObject)$ic30$)) {
                    if (NIL != var57) {
                        var53 = Numbers.add(var53, (SubLObject)ONE_INTEGER);
                    }
                    if (var53.numGE(var50) && (NIL == var51 || var53.numLE(var51))) {
                        var54 = (SubLObject)ConsesLow.cons(var57, var54);
                    }
                }
            }
            finally {
                final SubLObject var58 = Dynamic.currentBinding(Threads.$is_thread_performing_cleanupP$);
                try {
                    Dynamic.bind(Threads.$is_thread_performing_cleanupP$, (SubLObject)T);
                    if (var55.isStream()) {
                        streams_high.close(var55, (SubLObject)UNPROVIDED);
                    }
                }
                finally {
                    Dynamic.rebind(Threads.$is_thread_performing_cleanupP$, var58);
                }
            }
            var54 = Sequences.nreverse(var54);
            if (var52.isString()) {
                SubLObject var56_57 = (SubLObject)NIL;
                try {
                    var56_57 = compatibility.open_text(var52, (SubLObject)$ic12$);
                    if (!var56_57.isStream()) {
                        Errors.error((SubLObject)$ic13$, var52);
                    }
                    final SubLObject var59 = var56_57;
                    SubLObject var60 = var54;
                    SubLObject var61 = (SubLObject)NIL;
                    var61 = var60.first();
                    while (NIL != var60) {
                        PrintLow.format(var59, (SubLObject)$ic32$, var61);
                        var60 = var60.rest();
                        var61 = var60.first();
                    }
                }
                finally {
                    final SubLObject var62 = Dynamic.currentBinding(Threads.$is_thread_performing_cleanupP$);
                    try {
                        Dynamic.bind(Threads.$is_thread_performing_cleanupP$, (SubLObject)T);
                        if (var56_57.isStream()) {
                            streams_high.close(var56_57, (SubLObject)UNPROVIDED);
                        }
                    }
                    finally {
                        Dynamic.rebind(Threads.$is_thread_performing_cleanupP$, var62);
                    }
                }
            }
            else if (var52.isStream() || var52 == T) {
                SubLObject var63 = var54;
                SubLObject var64 = (SubLObject)NIL;
                var64 = var63.first();
                while (NIL != var63) {
                    PrintLow.format(var52, (SubLObject)$ic32$, var64);
                    var63 = var63.rest();
                    var64 = var63.first();
                }
            }
            else {
                Errors.error((SubLObject)$ic33$, var52);
            }
            return Sequences.length(var54);
        }
        PrintLow.format((SubLObject)T, (SubLObject)$ic34$, var49);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f35062(SubLObject var59) {
        if (var59 == UNPROVIDED) {
            var59 = module0018.f971();
        }
        final SubLThread var60 = SubLProcess.currentSubLThread();
        if (NIL != module0573.f35083()) {
            return module0573.f35109(var59);
        }
        if (!f35020().isString()) {
            return (SubLObject)ZERO_INTEGER;
        }
        if (NIL != module0110.$g1375$.getDynamicValue(var60)) {
            return f35059(f35020());
        }
        return f35060(f35020());
    }
    
    public static SubLObject f35063(final SubLObject var60) {
        final SubLThread var61 = SubLProcess.currentSubLThread();
        assert NIL != Types.stringp(var60) : var60;
        f35064();
        f35065();
        final SubLObject var62 = module0075.f5249(var60);
        SubLObject var63 = (SubLObject)NIL;
        SubLObject var64 = (SubLObject)NIL;
        SubLObject var65 = (SubLObject)NIL;
        SubLObject var66 = (SubLObject)ZERO_INTEGER;
        SubLObject var67 = (SubLObject)NIL;
        try {
            var61.throwStack.push(module0003.$g3$.getGlobalValue());
            final SubLObject var68 = Errors.$error_handler$.currentBinding(var61);
            try {
                Errors.$error_handler$.bind((SubLObject)$ic35$, var61);
                try {
                    if (NIL != Filesys.probe_file(var60)) {
                        SubLObject var69 = (SubLObject)NIL;
                        try {
                            var69 = compatibility.open_text(var60, (SubLObject)$ic29$);
                            if (!var69.isStream()) {
                                Errors.error((SubLObject)$ic13$, var60);
                            }
                            final SubLObject var70 = var69;
                            final SubLObject var7_68 = module0012.$g75$.currentBinding(var61);
                            final SubLObject var71 = module0012.$g76$.currentBinding(var61);
                            final SubLObject var72 = module0012.$g77$.currentBinding(var61);
                            final SubLObject var73 = module0012.$g78$.currentBinding(var61);
                            try {
                                module0012.$g75$.bind((SubLObject)ZERO_INTEGER, var61);
                                module0012.$g76$.bind((SubLObject)NIL, var61);
                                module0012.$g77$.bind((SubLObject)T, var61);
                                module0012.$g78$.bind(Time.get_universal_time(), var61);
                                module0012.f478(PrintLow.format((SubLObject)NIL, (SubLObject)$ic36$, var60));
                                SubLObject var74;
                                SubLObject var76;
                                SubLObject var75;
                                SubLObject var77;
                                SubLObject var78;
                                SubLObject var79;
                                SubLObject var80;
                                SubLObject var81;
                                SubLObject var82;
                                SubLObject var83;
                                SubLObject var84;
                                SubLObject var85_86;
                                SubLObject var83_84;
                                SubLObject var85;
                                SubLObject var86;
                                SubLObject var90_91;
                                SubLObject var88_89;
                                SubLObject var87;
                                SubLObject var88;
                                SubLObject var89;
                                SubLObject var90;
                                SubLObject var97_98;
                                SubLObject var95_96;
                                SubLObject var91;
                                SubLObject var92;
                                for (var74 = (SubLObject)NIL, var74 = module0574.f35212(var70); NIL != var74; var74 = module0574.f35212(var70)) {
                                    var66 = Numbers.add(var66, (SubLObject)ONE_INTEGER);
                                    module0012.note_percent_progress(compatibility.get_file_position(var70), var62);
                                    var75 = (var76 = var74);
                                    var77 = (SubLObject)NIL;
                                    var78 = (SubLObject)NIL;
                                    var79 = (SubLObject)NIL;
                                    cdestructuring_bind.destructuring_bind_must_consp(var76, var75, (SubLObject)$ic37$);
                                    var77 = var76.first();
                                    var76 = var76.rest();
                                    cdestructuring_bind.destructuring_bind_must_consp(var76, var75, (SubLObject)$ic37$);
                                    var78 = var76.first();
                                    var76 = var76.rest();
                                    cdestructuring_bind.destructuring_bind_must_consp(var76, var75, (SubLObject)$ic37$);
                                    var79 = var76.first();
                                    var76 = var76.rest();
                                    cdestructuring_bind.destructuring_bind_must_consp(var76, var75, (SubLObject)$ic37$);
                                    var80 = var76.rest();
                                    var76 = var76.first();
                                    var81 = (SubLObject)NIL;
                                    var82 = (SubLObject)NIL;
                                    cdestructuring_bind.destructuring_bind_must_consp(var76, var75, (SubLObject)$ic37$);
                                    var81 = var76.first();
                                    var76 = (var82 = var76.rest());
                                    var76 = var80;
                                    if (NIL == var76) {
                                        var83 = f35066(var77);
                                        var84 = var81;
                                        if (var84.eql((SubLObject)$ic38$)) {
                                            var83_84 = (var85_86 = var82);
                                            var85 = (SubLObject)NIL;
                                            var86 = (SubLObject)NIL;
                                            cdestructuring_bind.destructuring_bind_must_consp(var85_86, var83_84, (SubLObject)$ic39$);
                                            var85 = var85_86.first();
                                            var85_86 = var85_86.rest();
                                            cdestructuring_bind.destructuring_bind_must_consp(var85_86, var83_84, (SubLObject)$ic39$);
                                            var86 = var85_86.first();
                                            var85_86 = var85_86.rest();
                                            if (NIL == var85_86) {
                                                var85 = module0035.f2242(var85);
                                                var86 = module0035.f2242(var86);
                                                if (var85.isString()) {
                                                    f35067(var66, var86, var85, var83, var79);
                                                }
                                            }
                                            else {
                                                cdestructuring_bind.cdestructuring_bind_error(var83_84, (SubLObject)$ic39$);
                                            }
                                        }
                                        else if (var84.eql((SubLObject)$ic40$)) {
                                            var88_89 = (var90_91 = var82);
                                            var87 = (SubLObject)NIL;
                                            var88 = (SubLObject)NIL;
                                            cdestructuring_bind.destructuring_bind_must_consp(var90_91, var88_89, (SubLObject)$ic41$);
                                            var87 = var90_91.first();
                                            var90_91 = var90_91.rest();
                                            cdestructuring_bind.destructuring_bind_must_consp(var90_91, var88_89, (SubLObject)$ic41$);
                                            var88 = var90_91.first();
                                            var90_91 = var90_91.rest();
                                            if (NIL == var90_91) {
                                                var87 = module0035.f2242(var87);
                                                var88 = module0035.f2242(var88);
                                                var89 = conses_high.second(var87);
                                                var90 = conses_high.third(var87);
                                                if (var89.isString() && var88.isString()) {
                                                    f35068(var66, var90, var89, var88, var83, var79);
                                                }
                                            }
                                            else {
                                                cdestructuring_bind.cdestructuring_bind_error(var88_89, (SubLObject)$ic41$);
                                            }
                                        }
                                        else if (var84.eql((SubLObject)$ic42$)) {
                                            var95_96 = (var97_98 = var82);
                                            var87 = (SubLObject)NIL;
                                            cdestructuring_bind.destructuring_bind_must_consp(var97_98, var95_96, (SubLObject)$ic43$);
                                            var87 = var97_98.first();
                                            var97_98 = var97_98.rest();
                                            if (NIL == var97_98) {
                                                var87 = module0035.f2242(var87);
                                                var91 = conses_high.second(var87);
                                                var92 = conses_high.third(var87);
                                                if (var91.isString()) {
                                                    f35069(var92);
                                                    if (NIL != f35070(var92)) {
                                                        f35071(var92);
                                                    }
                                                    else {
                                                        var65 = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(var66, var92, var91, var83, var79), var65);
                                                    }
                                                }
                                            }
                                            else {
                                                cdestructuring_bind.cdestructuring_bind_error(var95_96, (SubLObject)$ic43$);
                                            }
                                        }
                                    }
                                    else {
                                        cdestructuring_bind.cdestructuring_bind_error(var75, (SubLObject)$ic37$);
                                    }
                                }
                                module0012.f479();
                            }
                            finally {
                                module0012.$g78$.rebind(var73, var61);
                                module0012.$g77$.rebind(var72, var61);
                                module0012.$g76$.rebind(var71, var61);
                                module0012.$g75$.rebind(var7_68, var61);
                            }
                        }
                        finally {
                            final SubLObject var7_69 = Threads.$is_thread_performing_cleanupP$.currentBinding(var61);
                            try {
                                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)T, var61);
                                if (var69.isStream()) {
                                    streams_high.close(var69, (SubLObject)UNPROVIDED);
                                }
                            }
                            finally {
                                Threads.$is_thread_performing_cleanupP$.rebind(var7_69, var61);
                            }
                        }
                    }
                }
                catch (Throwable var93) {
                    Errors.handleThrowable(var93, (SubLObject)NIL);
                }
            }
            finally {
                Errors.$error_handler$.rebind(var68, var61);
            }
        }
        catch (Throwable var94) {
            var67 = Errors.handleThrowable(var94, module0003.$g3$.getGlobalValue());
        }
        finally {
            var61.throwStack.pop();
        }
        if (NIL != var67) {
            return (SubLObject)ConsesLow.list(var66, var67);
        }
        var65 = Sequences.nreverse(var65);
        var64 = f35072();
        var63 = f35073();
        return (SubLObject)ConsesLow.list(var66, var63, var64, var65);
    }
    
    public static SubLObject f35074(SubLObject var60, SubLObject var19) {
        if (var60 == UNPROVIDED) {
            var60 = (SubLObject)NIL;
        }
        if (var19 == UNPROVIDED) {
            var19 = StreamsLow.$standard_output$.getDynamicValue();
        }
        final SubLThread var61 = SubLProcess.currentSubLThread();
        if (NIL == var60) {
            var60 = f35040(f35043((SubLObject)UNPROVIDED));
        }
        if (var60.isString() && NIL != Filesys.probe_file(var60)) {
            final SubLObject var62 = f35063(var60);
            final SubLObject var63 = var62.first();
            if (var19.eql(StreamsLow.$standard_output$.getDynamicValue(var61))) {
                streams_high.terpri(var19);
            }
            PrintLow.format(var19, (SubLObject)$ic44$, var60);
            PrintLow.format(var19, (SubLObject)$ic45$, module0051.f3552((SubLObject)UNPROVIDED));
            PrintLow.format(var19, (SubLObject)$ic46$, var63);
            if (Sequences.length(var62).numE((SubLObject)TWO_INTEGER)) {
                PrintLow.format(var19, (SubLObject)$ic47$, var63);
                PrintLow.format(var19, (SubLObject)$ic48$, conses_high.second(var62));
            }
            else {
                SubLObject var65;
                final SubLObject var64 = var65 = var62.rest();
                SubLObject var66 = (SubLObject)NIL;
                SubLObject var67 = (SubLObject)NIL;
                SubLObject var68 = (SubLObject)NIL;
                cdestructuring_bind.destructuring_bind_must_consp(var65, var64, (SubLObject)$ic49$);
                var66 = var65.first();
                var65 = var65.rest();
                cdestructuring_bind.destructuring_bind_must_consp(var65, var64, (SubLObject)$ic49$);
                var67 = var65.first();
                var65 = var65.rest();
                cdestructuring_bind.destructuring_bind_must_consp(var65, var64, (SubLObject)$ic49$);
                var68 = var65.first();
                var65 = var65.rest();
                if (NIL == var65) {
                    if (NIL != var68) {
                        streams_high.terpri(var19);
                        PrintLow.format(var19, (SubLObject)$ic50$, Sequences.length(var68));
                        SubLObject var69 = var68;
                        SubLObject var70 = (SubLObject)NIL;
                        var70 = var69.first();
                        while (NIL != var69) {
                            SubLObject var106_107;
                            final SubLObject var104_105 = var106_107 = var70;
                            SubLObject var71 = (SubLObject)NIL;
                            SubLObject var72 = (SubLObject)NIL;
                            SubLObject var73 = (SubLObject)NIL;
                            SubLObject var74 = (SubLObject)NIL;
                            SubLObject var75 = (SubLObject)NIL;
                            cdestructuring_bind.destructuring_bind_must_consp(var106_107, var104_105, (SubLObject)$ic51$);
                            var71 = var106_107.first();
                            var106_107 = var106_107.rest();
                            cdestructuring_bind.destructuring_bind_must_consp(var106_107, var104_105, (SubLObject)$ic51$);
                            var72 = var106_107.first();
                            var106_107 = var106_107.rest();
                            cdestructuring_bind.destructuring_bind_must_consp(var106_107, var104_105, (SubLObject)$ic51$);
                            var73 = var106_107.first();
                            var106_107 = var106_107.rest();
                            cdestructuring_bind.destructuring_bind_must_consp(var106_107, var104_105, (SubLObject)$ic51$);
                            var74 = var106_107.first();
                            var106_107 = var106_107.rest();
                            cdestructuring_bind.destructuring_bind_must_consp(var106_107, var104_105, (SubLObject)$ic51$);
                            var75 = var106_107.first();
                            var106_107 = var106_107.rest();
                            if (NIL == var106_107) {
                                PrintLow.format(var19, (SubLObject)$ic52$, new SubLObject[] { var72, var73, var74, var75 });
                            }
                            else {
                                cdestructuring_bind.cdestructuring_bind_error(var104_105, (SubLObject)$ic51$);
                            }
                            var69 = var69.rest();
                            var70 = var69.first();
                        }
                    }
                    if (NIL != var67) {
                        streams_high.terpri(var19);
                        PrintLow.format(var19, (SubLObject)$ic53$, Sequences.length(var67));
                        SubLObject var69 = var67;
                        SubLObject var70 = (SubLObject)NIL;
                        var70 = var69.first();
                        while (NIL != var69) {
                            SubLObject var111_112;
                            final SubLObject var109_110 = var111_112 = var70;
                            SubLObject var71 = (SubLObject)NIL;
                            SubLObject var72 = (SubLObject)NIL;
                            SubLObject var76 = (SubLObject)NIL;
                            SubLObject var77 = (SubLObject)NIL;
                            SubLObject var78 = (SubLObject)NIL;
                            SubLObject var79 = (SubLObject)NIL;
                            cdestructuring_bind.destructuring_bind_must_consp(var111_112, var109_110, (SubLObject)$ic54$);
                            var71 = var111_112.first();
                            var111_112 = var111_112.rest();
                            cdestructuring_bind.destructuring_bind_must_consp(var111_112, var109_110, (SubLObject)$ic54$);
                            var72 = var111_112.first();
                            var111_112 = var111_112.rest();
                            cdestructuring_bind.destructuring_bind_must_consp(var111_112, var109_110, (SubLObject)$ic54$);
                            var76 = var111_112.first();
                            var111_112 = var111_112.rest();
                            cdestructuring_bind.destructuring_bind_must_consp(var111_112, var109_110, (SubLObject)$ic54$);
                            var77 = var111_112.first();
                            var111_112 = var111_112.rest();
                            cdestructuring_bind.destructuring_bind_must_consp(var111_112, var109_110, (SubLObject)$ic54$);
                            var78 = var111_112.first();
                            var111_112 = var111_112.rest();
                            cdestructuring_bind.destructuring_bind_must_consp(var111_112, var109_110, (SubLObject)$ic54$);
                            var79 = var111_112.first();
                            var111_112 = var111_112.rest();
                            if (NIL == var111_112) {
                                PrintLow.format(var19, (SubLObject)$ic55$, new SubLObject[] { var72, var76, var77, var78, var79 });
                            }
                            else {
                                cdestructuring_bind.cdestructuring_bind_error(var109_110, (SubLObject)$ic54$);
                            }
                            var69 = var69.rest();
                            var70 = var69.first();
                        }
                    }
                    if (NIL != var66) {
                        streams_high.terpri(var19);
                        PrintLow.format(var19, (SubLObject)$ic56$, Sequences.length(var66));
                        SubLObject var69 = var66;
                        SubLObject var70 = (SubLObject)NIL;
                        var70 = var69.first();
                        while (NIL != var69) {
                            SubLObject var115_116;
                            final SubLObject var113_114 = var115_116 = var70;
                            SubLObject var71 = (SubLObject)NIL;
                            SubLObject var72 = (SubLObject)NIL;
                            SubLObject var73 = (SubLObject)NIL;
                            SubLObject var74 = (SubLObject)NIL;
                            SubLObject var75 = (SubLObject)NIL;
                            cdestructuring_bind.destructuring_bind_must_consp(var115_116, var113_114, (SubLObject)$ic51$);
                            var71 = var115_116.first();
                            var115_116 = var115_116.rest();
                            cdestructuring_bind.destructuring_bind_must_consp(var115_116, var113_114, (SubLObject)$ic51$);
                            var72 = var115_116.first();
                            var115_116 = var115_116.rest();
                            cdestructuring_bind.destructuring_bind_must_consp(var115_116, var113_114, (SubLObject)$ic51$);
                            var73 = var115_116.first();
                            var115_116 = var115_116.rest();
                            cdestructuring_bind.destructuring_bind_must_consp(var115_116, var113_114, (SubLObject)$ic51$);
                            var74 = var115_116.first();
                            var115_116 = var115_116.rest();
                            cdestructuring_bind.destructuring_bind_must_consp(var115_116, var113_114, (SubLObject)$ic51$);
                            var75 = var115_116.first();
                            var115_116 = var115_116.rest();
                            if (NIL == var115_116) {
                                PrintLow.format(var19, (SubLObject)$ic52$, new SubLObject[] { var72, var73, var74, var75 });
                            }
                            else {
                                cdestructuring_bind.cdestructuring_bind_error(var113_114, (SubLObject)$ic51$);
                            }
                            var69 = var69.rest();
                            var70 = var69.first();
                        }
                    }
                    return (SubLObject)T;
                }
                cdestructuring_bind.cdestructuring_bind_error(var64, (SubLObject)$ic49$);
            }
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f35075(final SubLObject var117, SubLObject var60) {
        if (var60 == UNPROVIDED) {
            var60 = (SubLObject)NIL;
        }
        assert NIL != Types.stringp(var117) : var117;
        SubLObject var118 = (SubLObject)NIL;
        try {
            var118 = compatibility.open_text(var117, (SubLObject)$ic12$);
            if (!var118.isStream()) {
                Errors.error((SubLObject)$ic13$, var117);
            }
            final SubLObject var19_119 = var118;
            f35074(var60, var19_119);
        }
        finally {
            final SubLObject var119 = Dynamic.currentBinding(Threads.$is_thread_performing_cleanupP$);
            try {
                Dynamic.bind(Threads.$is_thread_performing_cleanupP$, (SubLObject)T);
                if (var118.isStream()) {
                    streams_high.close(var118, (SubLObject)UNPROVIDED);
                }
            }
            finally {
                Dynamic.rebind(Threads.$is_thread_performing_cleanupP$, var119);
            }
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f35066(final SubLObject var120) {
        final SubLObject var121 = module0571.f34996(var120);
        if (NIL != constant_handles_oc.f8449(var121)) {
            return constants_high_oc.f10743(var121);
        }
        return print_high.princ_to_string(var121);
    }
    
    public static SubLObject f35064() {
        if (!$g4164$.getGlobalValue().isHashtable()) {
            $g4164$.setGlobalValue(Hashtables.make_hash_table((SubLObject)$ic58$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED));
        }
        Hashtables.clrhash($g4164$.getGlobalValue());
        return (SubLObject)NIL;
    }
    
    public static SubLObject f35072() {
        return module0030.f1622($g4164$.getGlobalValue(), Symbols.symbol_function((SubLObject)$ic59$), Symbols.symbol_function((SubLObject)$ic60$));
    }
    
    public static SubLObject f35068(final SubLObject var40, final SubLObject var87, final SubLObject var94, final SubLObject var93, final SubLObject var81, final SubLObject var77) {
        Hashtables.sethash(var87, $g4164$.getGlobalValue(), (SubLObject)ConsesLow.list(var40, var87, var94, var93, var81, var77));
        return (SubLObject)NIL;
    }
    
    public static SubLObject f35069(final SubLObject var87) {
        Hashtables.remhash(var87, $g4164$.getGlobalValue());
        return (SubLObject)NIL;
    }
    
    public static SubLObject f35065() {
        if (!$g4165$.getGlobalValue().isHashtable()) {
            $g4165$.setGlobalValue(Hashtables.make_hash_table((SubLObject)$ic58$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED));
        }
        Hashtables.clrhash($g4165$.getGlobalValue());
        return (SubLObject)NIL;
    }
    
    public static SubLObject f35073() {
        return module0030.f1622($g4165$.getGlobalValue(), Symbols.symbol_function((SubLObject)$ic59$), Symbols.symbol_function((SubLObject)$ic60$));
    }
    
    public static SubLObject f35067(final SubLObject var40, final SubLObject var87, final SubLObject var24, final SubLObject var81, final SubLObject var77) {
        Hashtables.sethash(var87, $g4165$.getGlobalValue(), (SubLObject)ConsesLow.list(var40, var87, var24, var81, var77));
        return (SubLObject)NIL;
    }
    
    public static SubLObject f35070(final SubLObject var87) {
        return Types.consp(Hashtables.gethash(var87, $g4165$.getGlobalValue(), (SubLObject)NIL));
    }
    
    public static SubLObject f35071(final SubLObject var87) {
        Hashtables.remhash(var87, $g4165$.getGlobalValue());
        return (SubLObject)NIL;
    }
    
    public static SubLObject f35076(final SubLObject var60, final SubLObject var121) {
        final SubLThread var122 = SubLProcess.currentSubLThread();
        assert NIL != Types.stringp(var60) : var60;
        assert NIL != Types.stringp(var121) : var121;
        if (NIL == Filesys.probe_file(var60)) {
            return (SubLObject)$ic62$;
        }
        SubLObject var123 = (SubLObject)NIL;
        try {
            var122.throwStack.push(module0003.$g3$.getGlobalValue());
            final SubLObject var124 = Errors.$error_handler$.currentBinding(var122);
            try {
                Errors.$error_handler$.bind((SubLObject)$ic35$, var122);
                try {
                    SubLObject var125 = (SubLObject)NIL;
                    try {
                        var125 = compatibility.open_text(var121, (SubLObject)$ic12$);
                        if (!var125.isStream()) {
                            Errors.error((SubLObject)$ic13$, var121);
                        }
                        final SubLObject var126 = var125;
                        SubLObject var127 = f35077(var60);
                        SubLObject var128 = (SubLObject)NIL;
                        var128 = var127.first();
                        while (NIL != var127) {
                            PrintLow.format(var126, (SubLObject)$ic63$, var128);
                            var127 = var127.rest();
                            var128 = var127.first();
                        }
                    }
                    finally {
                        final SubLObject var7_125 = Threads.$is_thread_performing_cleanupP$.currentBinding(var122);
                        try {
                            Threads.$is_thread_performing_cleanupP$.bind((SubLObject)T, var122);
                            if (var125.isStream()) {
                                streams_high.close(var125, (SubLObject)UNPROVIDED);
                            }
                        }
                        finally {
                            Threads.$is_thread_performing_cleanupP$.rebind(var7_125, var122);
                        }
                    }
                }
                catch (Throwable var129) {
                    Errors.handleThrowable(var129, (SubLObject)NIL);
                }
            }
            finally {
                Errors.$error_handler$.rebind(var124, var122);
            }
        }
        catch (Throwable var130) {
            var123 = Errors.handleThrowable(var130, module0003.$g3$.getGlobalValue());
        }
        finally {
            var122.throwStack.pop();
        }
        if (NIL != var123) {
            return var123;
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f35077(final SubLObject var60) {
        final SubLThread var61 = SubLProcess.currentSubLThread();
        SubLObject var62 = module0132.$g1569$.getGlobalValue();
        SubLObject var63 = (SubLObject)NIL;
        SubLObject var64 = (SubLObject)$ic68$;
        SubLObject var65 = (SubLObject)NIL;
        SubLObject var66 = (SubLObject)NIL;
        SubLObject var67 = (SubLObject)NIL;
        SubLObject var68 = (SubLObject)NIL;
        if (!var60.isString() || NIL == Filesys.probe_file(var60)) {
            return (SubLObject)NIL;
        }
        try {
            var61.throwStack.push(module0003.$g3$.getGlobalValue());
            final SubLObject var69 = Errors.$error_handler$.currentBinding(var61);
            try {
                Errors.$error_handler$.bind((SubLObject)$ic35$, var61);
                try {
                    SubLObject var70 = (SubLObject)NIL;
                    try {
                        var70 = compatibility.open_text(var60, (SubLObject)$ic29$);
                        if (!var70.isStream()) {
                            Errors.error((SubLObject)$ic13$, var60);
                        }
                        SubLObject var71;
                        SubLObject var72;
                        SubLObject var74;
                        SubLObject var73;
                        SubLObject var75;
                        SubLObject var76;
                        SubLObject var77;
                        SubLObject var78;
                        SubLObject var79;
                        SubLObject var80;
                        SubLObject var81;
                        SubLObject var138_139;
                        SubLObject var136_137;
                        SubLObject var82;
                        SubLObject var83;
                        SubLObject var142_143;
                        SubLObject var140_141;
                        SubLObject var84;
                        SubLObject var85;
                        SubLObject var146_147;
                        SubLObject var144_145;
                        SubLObject var86;
                        SubLObject var87;
                        SubLObject var152_153;
                        SubLObject var150_151;
                        SubLObject var88;
                        SubLObject var82_154;
                        SubLObject var89;
                        SubLObject var90;
                        SubLObject var91;
                        SubLObject var92;
                        SubLObject var93;
                        SubLObject var94;
                        SubLObject var95;
                        SubLObject var96;
                        SubLObject var97;
                        SubLObject var7_164;
                        SubLObject var82_155;
                        for (var71 = var70, var72 = (SubLObject)NIL, var72 = module0574.f35212(var71); NIL != var72; var72 = module0574.f35212(var71)) {
                            var68 = var72;
                            var73 = (var74 = var72);
                            var75 = (SubLObject)NIL;
                            var76 = (SubLObject)NIL;
                            var77 = (SubLObject)NIL;
                            cdestructuring_bind.destructuring_bind_must_consp(var74, var73, (SubLObject)$ic37$);
                            var75 = var74.first();
                            var74 = var74.rest();
                            cdestructuring_bind.destructuring_bind_must_consp(var74, var73, (SubLObject)$ic37$);
                            var76 = var74.first();
                            var74 = var74.rest();
                            cdestructuring_bind.destructuring_bind_must_consp(var74, var73, (SubLObject)$ic37$);
                            var77 = var74.first();
                            var74 = var74.rest();
                            cdestructuring_bind.destructuring_bind_must_consp(var74, var73, (SubLObject)$ic37$);
                            var78 = var74.rest();
                            var74 = var74.first();
                            var79 = (SubLObject)NIL;
                            var80 = (SubLObject)NIL;
                            cdestructuring_bind.destructuring_bind_must_consp(var74, var73, (SubLObject)$ic37$);
                            var79 = var74.first();
                            var74 = (var80 = var74.rest());
                            var74 = var78;
                            if (NIL == var74) {
                                var81 = var79;
                                if (var81.eql((SubLObject)$ic38$) || var81.eql((SubLObject)$ic69$)) {
                                    var136_137 = (var138_139 = var80);
                                    var82 = (SubLObject)NIL;
                                    var83 = (SubLObject)NIL;
                                    cdestructuring_bind.destructuring_bind_must_consp(var138_139, var136_137, (SubLObject)$ic39$);
                                    var82 = var138_139.first();
                                    var138_139 = var138_139.rest();
                                    cdestructuring_bind.destructuring_bind_must_consp(var138_139, var136_137, (SubLObject)$ic39$);
                                    var83 = var138_139.first();
                                    var138_139 = var138_139.rest();
                                    if (NIL == var138_139) {
                                        var82 = module0035.f2242(var82);
                                        var83 = module0035.f2242(var83);
                                        if (var82.isString()) {
                                            var66 = (SubLObject)ConsesLow.cons((SubLObject)$ic70$, var66);
                                            var66 = (SubLObject)ConsesLow.cons(Sequences.cconcatenate((SubLObject)$ic71$, new SubLObject[] { var82, $ic21$ }), var66);
                                            var65 = var82;
                                            var63 = (SubLObject)T;
                                        }
                                    }
                                    else {
                                        cdestructuring_bind.cdestructuring_bind_error(var136_137, (SubLObject)$ic39$);
                                    }
                                }
                                else if (var81.eql((SubLObject)$ic40$)) {
                                    var140_141 = (var142_143 = var80);
                                    var84 = (SubLObject)NIL;
                                    var85 = (SubLObject)NIL;
                                    cdestructuring_bind.destructuring_bind_must_consp(var142_143, var140_141, (SubLObject)$ic72$);
                                    var84 = var142_143.first();
                                    var142_143 = var142_143.rest();
                                    cdestructuring_bind.destructuring_bind_must_consp(var142_143, var140_141, (SubLObject)$ic72$);
                                    var85 = var142_143.first();
                                    var142_143 = var142_143.rest();
                                    if (NIL == var142_143) {
                                        var84 = f35078(module0035.f2242(var84), (SubLObject)UNPROVIDED);
                                        var85 = f35078(module0035.f2242(var85), (SubLObject)UNPROVIDED);
                                        var66 = (SubLObject)ConsesLow.cons((SubLObject)$ic70$, var66);
                                        var66 = (SubLObject)ConsesLow.cons(Sequences.cconcatenate((SubLObject)$ic73$, new SubLObject[] { var84, $ic74$, var85, $ic21$ }), var66);
                                    }
                                    else {
                                        cdestructuring_bind.cdestructuring_bind_error(var140_141, (SubLObject)$ic72$);
                                    }
                                }
                                else if (var81.eql((SubLObject)$ic75$)) {
                                    var144_145 = (var146_147 = var80);
                                    var86 = (SubLObject)NIL;
                                    var87 = (SubLObject)NIL;
                                    cdestructuring_bind.destructuring_bind_must_consp(var146_147, var144_145, (SubLObject)$ic76$);
                                    var86 = var146_147.first();
                                    var146_147 = var146_147.rest();
                                    cdestructuring_bind.destructuring_bind_must_consp(var146_147, var144_145, (SubLObject)$ic76$);
                                    var87 = var146_147.first();
                                    var146_147 = var146_147.rest();
                                    if (NIL == var146_147) {
                                        var86 = f35078(module0035.f2242(var86), (SubLObject)UNPROVIDED);
                                        var87 = f35078(module0035.f2242(var87), (SubLObject)UNPROVIDED);
                                        var66 = (SubLObject)ConsesLow.cons((SubLObject)$ic70$, var66);
                                        var66 = (SubLObject)ConsesLow.cons(Sequences.cconcatenate((SubLObject)$ic77$, new SubLObject[] { var86, $ic74$, var87, $ic21$ }), var66);
                                    }
                                    else {
                                        cdestructuring_bind.cdestructuring_bind_error(var144_145, (SubLObject)$ic76$);
                                    }
                                }
                                else if (var81.eql((SubLObject)$ic42$)) {
                                    var150_151 = (var152_153 = var80);
                                    var88 = (SubLObject)NIL;
                                    cdestructuring_bind.destructuring_bind_must_consp(var152_153, var150_151, (SubLObject)$ic43$);
                                    var88 = var152_153.first();
                                    var152_153 = var152_153.rest();
                                    if (NIL == var152_153) {
                                        var88 = f35078(module0035.f2242(var88), (SubLObject)UNPROVIDED);
                                        var66 = (SubLObject)ConsesLow.cons((SubLObject)$ic70$, var66);
                                        var66 = (SubLObject)ConsesLow.cons(Sequences.cconcatenate((SubLObject)$ic78$, new SubLObject[] { var88, $ic21$ }), var66);
                                    }
                                    else {
                                        cdestructuring_bind.cdestructuring_bind_error(var150_151, (SubLObject)$ic43$);
                                    }
                                }
                                else if (var81.eql((SubLObject)$ic79$) || var81.eql((SubLObject)$ic80$) || var81.eql((SubLObject)$ic81$) || var81.eql((SubLObject)$ic82$)) {
                                    var82_154 = var79;
                                    if (var82_154.eql((SubLObject)$ic79$)) {
                                        if (!var64.equal((SubLObject)$ic68$)) {
                                            var64 = (SubLObject)$ic68$;
                                            var66 = (SubLObject)ConsesLow.cons((SubLObject)$ic70$, var66);
                                            var66 = (SubLObject)ConsesLow.cons((SubLObject)$ic83$, var66);
                                        }
                                    }
                                    else if (var82_154.eql((SubLObject)$ic80$)) {
                                        if (!var64.equal((SubLObject)$ic68$)) {
                                            var64 = (SubLObject)$ic68$;
                                            var66 = (SubLObject)ConsesLow.cons((SubLObject)$ic70$, var66);
                                            var66 = (SubLObject)ConsesLow.cons((SubLObject)$ic83$, var66);
                                        }
                                        var66 = (SubLObject)ConsesLow.cons((SubLObject)$ic70$, var66);
                                        var66 = (SubLObject)ConsesLow.cons((SubLObject)$ic84$, var66);
                                    }
                                    else if (var82_154.eql((SubLObject)$ic81$)) {
                                        if (!var64.equal((SubLObject)$ic85$)) {
                                            var64 = (SubLObject)$ic85$;
                                            var66 = (SubLObject)ConsesLow.cons((SubLObject)$ic70$, var66);
                                            var66 = (SubLObject)ConsesLow.cons((SubLObject)$ic86$, var66);
                                        }
                                    }
                                    else if (var82_154.eql((SubLObject)$ic82$)) {
                                        var63 = (SubLObject)T;
                                        if (!var64.equal((SubLObject)$ic87$)) {
                                            var64 = (SubLObject)$ic87$;
                                            var66 = (SubLObject)ConsesLow.cons((SubLObject)$ic70$, var66);
                                            var66 = (SubLObject)ConsesLow.cons((SubLObject)$ic88$, var66);
                                        }
                                    }
                                    var89 = module0035.f2242(var80.first());
                                    var90 = f35078(var89.first(), (SubLObject)UNPROVIDED);
                                    var91 = f35078(conses_high.second(var89), (SubLObject)UNPROVIDED);
                                    var92 = conses_high.cddr(var89);
                                    var93 = f35078(module0035.f2242(var80.first()), (SubLObject)UNPROVIDED);
                                    var94 = f35078(module0035.f2242(conses_high.second(var80)), (SubLObject)UNPROVIDED);
                                    var95 = module0035.f2242(conses_high.third(var80));
                                    var96 = module0035.f2242(conses_high.fourth(var80));
                                    if (NIL != var92) {
                                        if (NIL != var92.rest()) {
                                            var92 = f35078(var92, (SubLObject)UNPROVIDED);
                                        }
                                        else {
                                            var92 = f35078(var92.first(), (SubLObject)UNPROVIDED);
                                        }
                                    }
                                    var97 = (SubLObject)NIL;
                                    try {
                                        var61.throwStack.push($ic0$);
                                        var7_164 = Errors.$error_handler$.currentBinding(var61);
                                        try {
                                            Errors.$error_handler$.bind(Symbols.symbol_function((SubLObject)$ic1$), var61);
                                            try {
                                                var89 = module0571.f34996(module0035.f2242(var80.first()));
                                            }
                                            catch (Throwable var98) {
                                                Errors.handleThrowable(var98, (SubLObject)NIL);
                                            }
                                        }
                                        finally {
                                            Errors.$error_handler$.rebind(var7_164, var61);
                                        }
                                    }
                                    catch (Throwable var99) {
                                        var97 = Errors.handleThrowable(var99, (SubLObject)$ic0$);
                                    }
                                    finally {
                                        var61.throwStack.pop();
                                    }
                                    if (NIL != var63 || !var94.equal(var62)) {
                                        var63 = (SubLObject)NIL;
                                        var62 = var94;
                                        var66 = (SubLObject)ConsesLow.cons((SubLObject)$ic70$, var66);
                                        var66 = (SubLObject)ConsesLow.cons(Sequences.cconcatenate((SubLObject)$ic89$, new SubLObject[] { var94, $ic21$ }), var66);
                                    }
                                    if (var95.equal((SubLObject)$ic90$)) {
                                        var66 = (SubLObject)ConsesLow.cons((SubLObject)$ic70$, var66);
                                        var66 = (SubLObject)ConsesLow.cons((SubLObject)$ic91$, var66);
                                    }
                                    else if (NIL != module0259.f16891(var89.first(), $ic92$)) {
                                        if (var95.equal((SubLObject)$ic93$)) {
                                            var66 = (SubLObject)ConsesLow.cons((SubLObject)$ic70$, var66);
                                            var66 = (SubLObject)ConsesLow.cons((SubLObject)$ic94$, var66);
                                        }
                                    }
                                    else if (var95.equal((SubLObject)$ic95$)) {
                                        var66 = (SubLObject)ConsesLow.cons((SubLObject)$ic70$, var66);
                                        var66 = (SubLObject)ConsesLow.cons((SubLObject)$ic96$, var66);
                                    }
                                    var82_155 = var96;
                                    if (var82_155.eql((SubLObject)$ic97$)) {
                                        var66 = (SubLObject)ConsesLow.cons((SubLObject)$ic98$, var66);
                                    }
                                    else if (var82_155.eql((SubLObject)$ic99$)) {
                                        var66 = (SubLObject)ConsesLow.cons((SubLObject)$ic100$, var66);
                                    }
                                    else if (var82_155.eql((SubLObject)$ic101$)) {
                                        var66 = (SubLObject)ConsesLow.cons((SubLObject)$ic102$, var66);
                                    }
                                    if (var91.equal(var65) && NIL != var92) {
                                        var66 = (SubLObject)ConsesLow.cons(PrintLow.format((SubLObject)NIL, (SubLObject)$ic103$, var90, var92), var66);
                                    }
                                    else {
                                        var66 = (SubLObject)ConsesLow.cons(PrintLow.format((SubLObject)NIL, (SubLObject)$ic104$, var93), var66);
                                    }
                                }
                                else if (!var81.eql((SubLObject)$ic105$)) {
                                    if (!var81.eql((SubLObject)$ic106$)) {
                                        if (var81.eql((SubLObject)$ic107$)) {
                                            var66 = (SubLObject)ConsesLow.cons((SubLObject)$ic70$, var66);
                                            var66 = (SubLObject)ConsesLow.cons((SubLObject)$ic108$, var66);
                                            var66 = (SubLObject)ConsesLow.cons(PrintLow.format((SubLObject)NIL, (SubLObject)$ic109$, module0571.f34996(var72)), var66);
                                        }
                                        else {
                                            var66 = (SubLObject)ConsesLow.cons((SubLObject)$ic70$, var66);
                                            var66 = (SubLObject)ConsesLow.cons((SubLObject)$ic110$, var66);
                                            var66 = (SubLObject)ConsesLow.cons(PrintLow.format((SubLObject)NIL, (SubLObject)$ic109$, module0571.f34996(var72)), var66);
                                        }
                                    }
                                }
                            }
                            else {
                                cdestructuring_bind.cdestructuring_bind_error(var73, (SubLObject)$ic37$);
                            }
                        }
                    }
                    finally {
                        final SubLObject var7_165 = Threads.$is_thread_performing_cleanupP$.currentBinding(var61);
                        try {
                            Threads.$is_thread_performing_cleanupP$.bind((SubLObject)T, var61);
                            if (var70.isStream()) {
                                streams_high.close(var70, (SubLObject)UNPROVIDED);
                            }
                        }
                        finally {
                            Threads.$is_thread_performing_cleanupP$.rebind(var7_165, var61);
                        }
                    }
                }
                catch (Throwable var100) {
                    Errors.handleThrowable(var100, (SubLObject)NIL);
                }
            }
            finally {
                Errors.$error_handler$.rebind(var69, var61);
            }
        }
        catch (Throwable var101) {
            var67 = Errors.handleThrowable(var101, module0003.$g3$.getGlobalValue());
        }
        finally {
            var61.throwStack.pop();
        }
        if (NIL != var67) {
            return PrintLow.format((SubLObject)NIL, (SubLObject)$ic111$, var67, var68);
        }
        return Sequences.nreverse(var66);
    }
    
    public static SubLObject f35078(final SubLObject var167, SubLObject var168) {
        if (var168 == UNPROVIDED) {
            var168 = (SubLObject)ZERO_INTEGER;
        }
        if (var167.isKeyword()) {
            return Sequences.cconcatenate((SubLObject)$ic112$, module0038.f2968(var167));
        }
        if (var167.isSymbol()) {
            if (NIL != module0201.f12546(var167)) {
                return Symbols.symbol_name(var167);
            }
            return Sequences.cconcatenate((SubLObject)$ic113$, Symbols.symbol_name(var167));
        }
        else {
            if (var167.isString()) {
                return f35079(var167);
            }
            if (var167.isAtom()) {
                return module0006.f202(var167);
            }
            if (var167.first() == $ic114$ && NIL != module0035.f2014(var167) && Sequences.length(var167).numE((SubLObject)THREE_INTEGER)) {
                return conses_high.second(var167);
            }
            if (var167.first() == $ic115$ && NIL != module0035.f2014(var167) && (Sequences.length(var167).numE((SubLObject)TWO_INTEGER) || Sequences.length(var167).numE((SubLObject)THREE_INTEGER))) {
                return f35078(conses_high.second(var167), (SubLObject)UNPROVIDED);
            }
            SubLObject var169 = (SubLObject)NIL;
            SubLObject var170 = (SubLObject)ZERO_INTEGER;
            if (var168.numG((SubLObject)ZERO_INTEGER)) {
                var169 = (SubLObject)ConsesLow.cons(Strings.make_string((SubLObject)ONE_INTEGER, (SubLObject)Characters.CHAR_newline), var169);
                var169 = (SubLObject)ConsesLow.cons(Strings.make_string(Numbers.add((SubLObject)THREE_INTEGER, var168), (SubLObject)Characters.CHAR_space), var169);
            }
            var169 = (SubLObject)ConsesLow.cons((SubLObject)$ic116$, var169);
            if (NIL != module0035.f1996(var167)) {
                SubLObject var171 = module0035.f2018(var167);
                SubLObject var172 = (SubLObject)NIL;
                var172 = var171.first();
                while (NIL != var171) {
                    if (var170.numG((SubLObject)ZERO_INTEGER)) {
                        var169 = (SubLObject)ConsesLow.cons((SubLObject)$ic74$, var169);
                    }
                    var169 = (SubLObject)ConsesLow.cons(f35078(var172, Numbers.add(var168, (SubLObject)TWO_INTEGER)), var169);
                    var170 = Numbers.add(var170, (SubLObject)ONE_INTEGER);
                    var171 = var171.rest();
                    var172 = var171.first();
                }
                var169 = (SubLObject)ConsesLow.cons((SubLObject)$ic117$, var169);
                var169 = (SubLObject)ConsesLow.cons(f35078(module0035.f2017(var167), Numbers.add(var168, (SubLObject)TWO_INTEGER)), var169);
            }
            else {
                SubLObject var171 = var167;
                SubLObject var172 = (SubLObject)NIL;
                var172 = var171.first();
                while (NIL != var171) {
                    if (var170.numG((SubLObject)ZERO_INTEGER)) {
                        var169 = (SubLObject)ConsesLow.cons((SubLObject)$ic74$, var169);
                    }
                    var169 = (SubLObject)ConsesLow.cons(f35078(var172, Numbers.add(var168, (SubLObject)TWO_INTEGER)), var169);
                    var170 = Numbers.add(var170, (SubLObject)ONE_INTEGER);
                    var171 = var171.rest();
                    var172 = var171.first();
                }
            }
            var169 = (SubLObject)ConsesLow.cons((SubLObject)$ic118$, var169);
            return Functions.apply(Symbols.symbol_function((SubLObject)$ic119$), Sequences.nreverse(var169));
        }
    }
    
    public static SubLObject f35079(final SubLObject var171) {
        return Sequences.cconcatenate((SubLObject)$ic120$, new SubLObject[] { module0006.f203(module0038.f2659((SubLObject)$ic121$, (SubLObject)$ic122$, module0038.f2659((SubLObject)$ic121$, (SubLObject)$ic120$, var171, (SubLObject)UNPROVIDED), (SubLObject)UNPROVIDED)), $ic120$ });
    }
    
    public static SubLObject f35080() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0572", "f35011", "S#36906", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0572", "f35013", "S#38389", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0572", "f35012", "S#38390", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0572", "f35014", "S#38391", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0572", "f35015", "INITIALIZE-TRANSCRIPT-HANDLING", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0572", "f35021", "S#38392", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0572", "f35022", "S#38393", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0572", "f35016", "S#38394", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0572", "f35023", "S#38395", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0572", "f35024", "S#38396", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0572", "f35025", "S#38397", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0572", "f35026", "S#38398", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0572", "f35027", "S#38399", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0572", "f35028", "S#38400", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0572", "f35029", "S#38401", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0572", "f35030", "S#38402", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0572", "f35031", "S#38403", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0572", "f35032", "S#38404", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0572", "f35033", "S#38405", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0572", "f35034", "S#38406", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0572", "f35035", "S#38407", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0572", "f35036", "S#38408", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0572", "f35038", "S#38409", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0572", "f35017", "S#38410", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0572", "f35039", "S#38411", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0572", "f35042", "S#38412", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0572", "f35019", "S#38413", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0572", "f35020", "S#38414", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0572", "f35018", "S#38415", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0572", "f35044", "S#38416", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0572", "f35045", "S#38417", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0572", "f35046", "S#38418", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0572", "f35047", "S#38419", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0572", "f35049", "S#38420", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0572", "f35048", "S#38421", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0572", "f35043", "S#38422", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0572", "f35041", "S#32036", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0572", "f35050", "S#38423", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0572", "f35040", "S#32035", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0572", "f35051", "S#32037", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0572", "f35053", "S#38424", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0572", "f35052", "S#38425", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0572", "f35037", "S#38426", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0572", "f35054", "S#38427", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0572", "f35055", "S#38428", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0572", "f35056", "S#38429", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0572", "f35057", "S#38430", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0572", "f35058", "S#38431", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0572", "f35059", "S#38432", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0572", "f35060", "S#38433", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0572", "f35061", "S#38434", 2, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0572", "f35062", "S#38435", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0572", "f35063", "S#38436", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0572", "f35074", "S#38437", 0, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0572", "f35075", "S#38438", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0572", "f35066", "S#38439", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0572", "f35064", "S#38440", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0572", "f35072", "S#38441", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0572", "f35068", "S#38442", 6, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0572", "f35069", "S#38443", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0572", "f35065", "S#38444", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0572", "f35073", "S#38445", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0572", "f35067", "S#38446", 5, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0572", "f35070", "S#38447", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0572", "f35071", "S#38448", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0572", "f35076", "WRITE-SPECIFIC-TRANSCRIPT-FILE-AS-KE-TEXT", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0572", "f35077", "S#38449", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0572", "f35078", "S#38450", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0572", "f35079", "S#38451", 1, 0, false);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f35081() {
        $g4151$ = SubLFiles.defparameter("S#38452", (SubLObject)$ic2$);
        $g4152$ = SubLFiles.defparameter("S#38453", (SubLObject)NIL);
        $g4153$ = SubLFiles.deflexical("S#38454", (SubLObject)((NIL != Symbols.boundp((SubLObject)$ic3$)) ? $g4153$.getGlobalValue() : ZERO_INTEGER));
        $g4154$ = SubLFiles.deflexical("S#38455", (SubLObject)((NIL != Symbols.boundp((SubLObject)$ic4$)) ? $g4154$.getGlobalValue() : NIL));
        $g4155$ = SubLFiles.deflexical("S#38456", (SubLObject)((NIL != Symbols.boundp((SubLObject)$ic5$)) ? $g4155$.getGlobalValue() : ZERO_INTEGER));
        $g4156$ = SubLFiles.deflexical("S#38457", (SubLObject)((NIL != Symbols.boundp((SubLObject)$ic6$)) ? $g4156$.getGlobalValue() : NIL));
        $g4157$ = SubLFiles.deflexical("S#38458", (SubLObject)((NIL != Symbols.boundp((SubLObject)$ic7$)) ? $g4157$.getGlobalValue() : ZERO_INTEGER));
        $g4158$ = SubLFiles.defparameter("S#38459", (SubLObject)$ic8$);
        $g4159$ = SubLFiles.deflexical("S#38460", (SubLObject)((NIL != Symbols.boundp((SubLObject)$ic9$)) ? $g4159$.getGlobalValue() : NIL));
        $g4160$ = SubLFiles.deflexical("S#38461", (SubLObject)((NIL != Symbols.boundp((SubLObject)$ic15$)) ? $g4160$.getGlobalValue() : NIL));
        $g4161$ = SubLFiles.deflexical("S#38462", (SubLObject)((NIL != Symbols.boundp((SubLObject)$ic16$)) ? $g4161$.getGlobalValue() : NIL));
        $g4162$ = SubLFiles.deflexical("S#38463", (SubLObject)((NIL != Symbols.boundp((SubLObject)$ic17$)) ? $g4162$.getGlobalValue() : NIL));
        $g4163$ = SubLFiles.deflexical("S#38464", (SubLObject)((NIL != Symbols.boundp((SubLObject)$ic27$)) ? $g4163$.getGlobalValue() : NIL));
        $g4164$ = SubLFiles.deflexical("S#38465", (SubLObject)((NIL != Symbols.boundp((SubLObject)$ic57$)) ? $g4164$.getGlobalValue() : NIL));
        $g4165$ = SubLFiles.deflexical("S#38466", (SubLObject)((NIL != Symbols.boundp((SubLObject)$ic61$)) ? $g4165$.getGlobalValue() : NIL));
        return (SubLObject)NIL;
    }
    
    public static SubLObject f35082() {
        module0003.f57((SubLObject)$ic3$);
        module0003.f57((SubLObject)$ic4$);
        module0003.f57((SubLObject)$ic5$);
        module0003.f57((SubLObject)$ic6$);
        module0003.f57((SubLObject)$ic7$);
        module0003.f57((SubLObject)$ic9$);
        module0003.f57((SubLObject)$ic15$);
        module0003.f57((SubLObject)$ic16$);
        module0003.f57((SubLObject)$ic17$);
        module0003.f57((SubLObject)$ic27$);
        module0003.f57((SubLObject)$ic57$);
        module0003.f57((SubLObject)$ic61$);
        module0012.f368((SubLObject)$ic64$, (SubLObject)$ic65$, (SubLObject)$ic66$, (SubLObject)$ic67$, (SubLObject)NIL);
        return (SubLObject)NIL;
    }
    
    public void declareFunctions() {
        f35080();
    }
    
    public void initializeVariables() {
        f35081();
    }
    
    public void runTopLevelForms() {
        f35082();
    }
    
    static {
        me = (SubLFile)new module0572();
        $g4151$ = null;
        $g4152$ = null;
        $g4153$ = null;
        $g4154$ = null;
        $g4155$ = null;
        $g4156$ = null;
        $g4157$ = null;
        $g4158$ = null;
        $g4159$ = null;
        $g4160$ = null;
        $g4161$ = null;
        $g4162$ = null;
        $g4163$ = null;
        $g4164$ = null;
        $g4165$ = null;
        $ic0$ = makeKeyword("IGNORE-ERRORS-TARGET");
        $ic1$ = makeSymbol("IGNORE-ERRORS-HANDLER", "SUBLISP");
        $ic2$ = makeString("ts");
        $ic3$ = makeSymbol("S#38454", "CYC");
        $ic4$ = makeSymbol("S#38455", "CYC");
        $ic5$ = makeSymbol("S#38456", "CYC");
        $ic6$ = makeSymbol("S#38457", "CYC");
        $ic7$ = makeSymbol("S#38458", "CYC");
        $ic8$ = makeInteger(206);
        $ic9$ = makeSymbol("S#38460", "CYC");
        $ic10$ = makeString("ROLLED");
        $ic11$ = makeKeyword("APPEND");
        $ic12$ = makeKeyword("OUTPUT");
        $ic13$ = makeString("Unable to open ~S");
        $ic14$ = makeString("~s~%");
        $ic15$ = makeSymbol("S#38461", "CYC");
        $ic16$ = makeSymbol("S#38462", "CYC");
        $ic17$ = makeSymbol("S#38463", "CYC");
        $ic18$ = makeString("cyc-kb-~a");
        $ic19$ = makeString("~a-local-~a");
        $ic20$ = makeString("~a-local-hl-~a");
        $ic21$ = makeString(".");
        $ic22$ = makeString("transcripts");
        $ic23$ = makeSymbol("STRINGP");
        $ic24$ = makeString(".TS");
        $ic25$ = makeString("-");
        $ic26$ = makeString(".ts");
        $ic27$ = makeSymbol("S#38464", "CYC");
        $ic28$ = makeSymbol("CAR");
        $ic29$ = makeKeyword("INPUT");
        $ic30$ = makeKeyword("EOF");
        $ic31$ = makeInteger(100000);
        $ic32$ = makeString("~%~%~s");
        $ic33$ = makeString("~s is not a stream or pathname string");
        $ic34$ = makeString("~%The file ~s does not exist, or contains no operations.");
        $ic35$ = makeSymbol("S#38", "CYC");
        $ic36$ = makeString("Examining ~A");
        $ic37$ = ConsesLow.list((SubLObject)makeSymbol("S#38467", "CYC"), (SubLObject)makeSymbol("CYC-IMAGE-ID"), (SubLObject)makeSymbol("WHEN"), (SubLObject)ConsesLow.cons((SubLObject)makeSymbol("FUNCTION"), (SubLObject)makeSymbol("S#105", "CYC")));
        $ic38$ = makeSymbol("FI-CREATE");
        $ic39$ = ConsesLow.list((SubLObject)makeSymbol("S#29", "CYC"), (SubLObject)makeSymbol("S#10596", "CYC"));
        $ic40$ = makeSymbol("FI-RENAME");
        $ic41$ = ConsesLow.list((SubLObject)makeSymbol("S#12141", "CYC"), (SubLObject)makeSymbol("S#13498", "CYC"));
        $ic42$ = makeSymbol("FI-KILL");
        $ic43$ = ConsesLow.list((SubLObject)makeSymbol("S#12141", "CYC"));
        $ic44$ = makeString(";;; Transcript:  ~S");
        $ic45$ = makeString("~%;;; Examined:    ~A");
        $ic46$ = makeString("~%;;; Total Ops:   ~S");
        $ic47$ = makeString("~%;;; error during transcript analysis: At operation: ~S");
        $ic48$ = makeString("~%~A");
        $ic49$ = ConsesLow.list((SubLObject)makeSymbol("S#38468", "CYC"), (SubLObject)makeSymbol("S#38469", "CYC"), (SubLObject)makeSymbol("S#38470", "CYC"));
        $ic50$ = makeString("~%;;; ~S KILLED");
        $ic51$ = ConsesLow.list((SubLObject)makeSymbol("S#38471", "CYC"), (SubLObject)makeSymbol("S#10596", "CYC"), (SubLObject)makeSymbol("S#29", "CYC"), (SubLObject)makeSymbol("S#13925", "CYC"), (SubLObject)makeSymbol("WHEN"));
        $ic52$ = makeString("~%EXTERNAL-ID ~S : ~A by ~A at ~A");
        $ic53$ = makeString("~%;;; ~S RENAMED");
        $ic54$ = ConsesLow.list((SubLObject)makeSymbol("S#38471", "CYC"), (SubLObject)makeSymbol("S#10596", "CYC"), (SubLObject)makeSymbol("S#38472", "CYC"), (SubLObject)makeSymbol("S#13498", "CYC"), (SubLObject)makeSymbol("S#13925", "CYC"), (SubLObject)makeSymbol("WHEN"));
        $ic55$ = makeString("~%EXTERNAL-ID ~S : ~A to ~A by ~A at ~A");
        $ic56$ = makeString("~%;;; ~S CREATED");
        $ic57$ = makeSymbol("S#38465", "CYC");
        $ic58$ = makeInteger(100);
        $ic59$ = makeSymbol("<");
        $ic60$ = makeSymbol("FIRST");
        $ic61$ = makeSymbol("S#38466", "CYC");
        $ic62$ = makeString("transcript file not found");
        $ic63$ = makeString("~A~%");
        $ic64$ = makeSymbol("WRITE-SPECIFIC-TRANSCRIPT-FILE-AS-KE-TEXT");
        $ic65$ = ConsesLow.list((SubLObject)makeSymbol("S#33403", "CYC"), (SubLObject)makeSymbol("S#38473", "CYC"));
        $ic66$ = makeString("Generate a KE Text file from a transcript and write it to a file.");
        $ic67$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#33403", "CYC"), (SubLObject)makeSymbol("STRINGP")), (SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#38473", "CYC"), (SubLObject)makeSymbol("STRINGP")));
        $ic68$ = makeKeyword("ENTER");
        $ic69$ = makeSymbol("FI-FIND-OR-CREATE");
        $ic70$ = makeString("");
        $ic71$ = makeString("Constant: ");
        $ic72$ = ConsesLow.list((SubLObject)makeSymbol("S#38472", "CYC"), (SubLObject)makeSymbol("S#13498", "CYC"));
        $ic73$ = makeString("Rename: ");
        $ic74$ = makeString(" ");
        $ic75$ = makeSymbol("FI-MERGE");
        $ic76$ = ConsesLow.list((SubLObject)makeSymbol("S#36926", "CYC"), (SubLObject)makeSymbol("S#36927", "CYC"));
        $ic77$ = makeString("Merge: ");
        $ic78$ = makeString("Kill: ");
        $ic79$ = makeSymbol("FI-ASSERT");
        $ic80$ = makeSymbol("FI-REASSERT");
        $ic81$ = makeSymbol("FI-UNASSERT");
        $ic82$ = makeSymbol("FI-BLAST");
        $ic83$ = makeString("Enter.");
        $ic84$ = makeString(";; The following assertion simulates an fi-reassert. (two of these simulate a repropagate)");
        $ic85$ = makeKeyword("DELETE");
        $ic86$ = makeString("Delete.");
        $ic87$ = makeKeyword("BLAST");
        $ic88$ = makeString("Delete. ;; Simulate an fi-blast.");
        $ic89$ = makeString("In Mt: ");
        $ic90$ = makeKeyword("UNKNOWN");
        $ic91$ = makeString("Truth Value: :unknown.");
        $ic92$ = constant_handles_oc.f8479((SubLObject)makeString("DefaultMonotonicPredicate"));
        $ic93$ = makeKeyword("DEFAULT");
        $ic94$ = makeString("Truth Value: :default.");
        $ic95$ = makeKeyword("MONOTONIC");
        $ic96$ = makeString("Truth Value: :monotonic.");
        $ic97$ = makeKeyword("FORWARD");
        $ic98$ = makeString("Direction: :forward.");
        $ic99$ = makeKeyword("BACKWARD");
        $ic100$ = makeString("Direction: :backward.");
        $ic101$ = makeKeyword("CODE");
        $ic102$ = makeString("Direction: :code.");
        $ic103$ = makeString("~A: ~A.");
        $ic104$ = makeString("f: ~A.");
        $ic105$ = makeSymbol("FI-TIMESTAMP-ASSERTION");
        $ic106$ = makeSymbol("FI-TIMESTAMP-CONSTANT");
        $ic107$ = makeSymbol("FI-CREATE-SKOLEM");
        $ic108$ = makeString(";; This skolem creation should be implicit in the following assertion and can safely be deleted.");
        $ic109$ = makeString(";; ~A");
        $ic110$ = makeString(";; Don't know how convert next line");
        $ic111$ = makeString("Internal Error: \"~A\" for operation: ~S");
        $ic112$ = makeString(":");
        $ic113$ = makeString("'");
        $ic114$ = makeKeyword("HP");
        $ic115$ = makeKeyword("NAT");
        $ic116$ = makeString("(");
        $ic117$ = makeString(" . ");
        $ic118$ = makeString(")");
        $ic119$ = makeSymbol("CCONCATENATE");
        $ic120$ = makeString("\"");
        $ic121$ = makeString("\\\"");
        $ic122$ = makeString("\\\\\"");
    }
}

/*
	DECOMPILATION REPORT

	Decompiled from: G:\opt\CYC_JRTL_with_CommonLisp\platform\lib\cyc-oc4.0-unzipped/com/cyc/cycjava/cycl/class
	Total time: 776 ms
	
	Decompiled with Procyon 0.5.32.
*/