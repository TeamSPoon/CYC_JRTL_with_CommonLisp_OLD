package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Vectors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Time;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Mapping;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class module0533 extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.module0533";
    public static final String myFingerPrint = "78eae47169c48b16922ac4658732607371a1a981be7f57f2d32e3114c8621363";
    private static SubLSymbol $g3908$;
    private static SubLSymbol $g3909$;
    private static SubLSymbol $g3910$;
    private static SubLSymbol $g3911$;
    private static SubLSymbol $g3912$;
    private static SubLSymbol $g3913$;
    private static final SubLSymbol $ic0$;
    private static final SubLSymbol $ic1$;
    private static final SubLSymbol $ic2$;
    private static final SubLSymbol $ic3$;
    private static final SubLSymbol $ic4$;
    private static final SubLSymbol $ic5$;
    private static final SubLObject $ic6$;
    private static final SubLList $ic7$;
    private static final SubLObject $ic8$;
    private static final SubLObject $ic9$;
    private static final SubLSymbol $ic10$;
    private static final SubLSymbol $ic11$;
    private static final SubLObject $ic12$;
    private static final SubLObject $ic13$;
    private static final SubLSymbol $ic14$;
    private static final SubLSymbol $ic15$;
    private static final SubLString $ic16$;
    private static final SubLSymbol $ic17$;
    private static final SubLString $ic18$;
    private static final SubLString $ic19$;
    private static final SubLString $ic20$;
    private static final SubLString $ic21$;
    private static final SubLSymbol $ic22$;
    private static final SubLSymbol $ic23$;
    private static final SubLString $ic24$;
    private static final SubLSymbol $ic25$;
    private static final SubLSymbol $ic26$;
    private static final SubLSymbol $ic27$;
    private static final SubLSymbol $ic28$;
    
    public static SubLObject f33201() {
        final SubLThread var1 = SubLProcess.currentSubLThread();
        return $g3908$.getDynamicValue(var1);
    }
    
    public static SubLObject f33202(final SubLObject var2) {
        final SubLThread var3 = SubLProcess.currentSubLThread();
        if (NIL != f33201() && NIL != module0035.f1997(var2)) {
            final SubLObject var4 = var2.first();
            if (NIL != f33203(var4)) {
                final SubLObject var5 = module0178.f11335(var4);
                final SubLObject var6 = f33204(var5, (SubLObject)UNPROVIDED);
                final SubLObject var7 = f33205(var6);
                if (NIL != $g3909$.getDynamicValue(var3)) {
                    $g3910$.setGlobalValue(Numbers.add($g3910$.getGlobalValue(), (SubLObject)ONE_INTEGER));
                    module0084.f5775($g3911$.getGlobalValue(), var5, (SubLObject)UNPROVIDED);
                }
                return var7;
            }
        }
        if (NIL != $g3909$.getDynamicValue(var3)) {
            $g3912$.setGlobalValue(Numbers.add($g3912$.getGlobalValue(), (SubLObject)ONE_INTEGER));
        }
        return module0528.f32946();
    }
    
    public static SubLObject f33206(final SubLObject var3, final SubLObject var7) {
        return (SubLObject)NIL;
    }
    
    public static SubLObject f33207(final SubLObject var3, final SubLObject var7) {
        return (SubLObject)NIL;
    }
    
    public static SubLObject f33208() {
        final SubLObject var8 = $g3913$.getGlobalValue();
        if (NIL != var8) {
            module0034.f1818(var8);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f33209() {
        return module0034.f1829($g3913$.getGlobalValue(), (SubLObject)ConsesLow.list(EMPTY_SUBL_OBJECT_ARRAY), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f33210() {
        return module0217.f14415((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)ConsesLow.listS($ic6$, module0193.f12079((SubLObject)ZERO_INTEGER), (SubLObject)$ic7$)), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list($ic8$, module0193.f12079((SubLObject)ZERO_INTEGER)))), $ic9$);
    }
    
    public static SubLObject f33211() {
        SubLObject var9 = $g3913$.getGlobalValue();
        if (NIL == var9) {
            var9 = module0034.f1934((SubLObject)$ic5$, (SubLObject)$ic10$, (SubLObject)NIL, (SubLObject)EQ, (SubLObject)ZERO_INTEGER, (SubLObject)ZERO_INTEGER);
        }
        SubLObject var10 = module0034.f1810(var9, (SubLObject)UNPROVIDED);
        if (var10 == $ic11$) {
            var10 = Values.arg2(Values.resetMultipleValues(), (SubLObject)Values.multiple_value_list(f33210()));
            module0034.f1812(var9, var10, (SubLObject)UNPROVIDED);
        }
        return module0034.f1959(var10);
    }
    
    public static SubLObject f33205(final SubLObject var11) {
        final SubLObject var12 = module0211.f13721(var11);
        return Sequences.remove(f33211(), var12, Symbols.symbol_function((SubLObject)EQL), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f33212() {
        f33208();
        return (SubLObject)NIL;
    }
    
    public static SubLObject f33203(final SubLObject var3) {
        if (NIL != module0211.f13649(var3, $ic12$)) {
            final SubLObject var4 = module0178.f11287(var3);
            if (var4.eql(module0132.$g1555$.getGlobalValue()) || var4.eql(module0132.$g1547$.getGlobalValue())) {
                final SubLObject var5 = module0178.f11334(var3);
                if (NIL != module0048.f3275(module0217.f14357(var5))) {
                    return (SubLObject)T;
                }
            }
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f33204(final SubLObject var4, SubLObject var14) {
        if (var14 == UNPROVIDED) {
            var14 = (SubLObject)NIL;
        }
        final SubLObject var15 = f33213(var4);
        return (NIL != var15) ? var15 : f33214(var4, var14);
    }
    
    public static SubLObject f33213(final SubLObject var4) {
        return module0220.f14553(var4, $ic13$, (SubLObject)TWO_INTEGER, (SubLObject)ONE_INTEGER, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f33214(final SubLObject var4, SubLObject var14) {
        if (var14 == UNPROVIDED) {
            var14 = (SubLObject)NIL;
        }
        final SubLThread var15 = SubLProcess.currentSubLThread();
        final SubLObject var16 = f33215(var4);
        final SubLObject var17 = (NIL != var14) ? module0543.f33623(var16, (SubLObject)UNPROVIDED) : module0540.f33504(var16);
        final SubLObject var18 = module0528.f32898();
        assert NIL != module0055.f4006(var18) : var18;
        final SubLObject var19 = module0131.$g1538$.currentBinding(var15);
        final SubLObject var20 = $g3908$.currentBinding(var15);
        try {
            module0131.$g1538$.bind(var18, var15);
            $g3908$.bind((SubLObject)NIL, var15);
            final SubLObject var18_20 = module0131.$g1537$.currentBinding(var15);
            try {
                module0131.$g1537$.bind(module0435.f30615(f33211()), var15);
                if (NIL != var14) {
                    module0543.f33631((SubLObject)ConsesLow.listS($ic6$, var17, (SubLObject)$ic7$), module0132.$g1555$.getGlobalValue(), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                }
                else {
                    module0540.f33517((SubLObject)ConsesLow.listS($ic6$, var17, (SubLObject)$ic7$), module0132.$g1555$.getGlobalValue(), (SubLObject)UNPROVIDED);
                }
            }
            finally {
                module0131.$g1537$.rebind(var18_20, var15);
            }
            final SubLObject var18_21 = module0131.$g1537$.currentBinding(var15);
            try {
                module0131.$g1537$.bind((SubLObject)NIL, var15);
                if (NIL != var14) {
                    module0543.f33631((SubLObject)ConsesLow.list($ic13$, var17, var4), module0132.$g1555$.getGlobalValue(), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                }
                else {
                    module0540.f33517((SubLObject)ConsesLow.list($ic13$, var17, var4), module0132.$g1555$.getGlobalValue(), (SubLObject)UNPROVIDED);
                }
            }
            finally {
                module0131.$g1537$.rebind(var18_21, var15);
            }
            final SubLObject var18_22 = module0131.$g1537$.currentBinding(var15);
            try {
                module0131.$g1537$.bind((SubLObject)$ic15$, var15);
                if (NIL != var14) {
                    module0543.f33631((SubLObject)ConsesLow.list($ic12$, var17, var4), module0132.$g1555$.getGlobalValue(), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                }
                else {
                    module0540.f33517((SubLObject)ConsesLow.list($ic12$, var17, var4), module0132.$g1555$.getGlobalValue(), (SubLObject)UNPROVIDED);
                }
            }
            finally {
                module0131.$g1537$.rebind(var18_22, var15);
            }
        }
        finally {
            $g3908$.rebind(var20, var15);
            module0131.$g1538$.rebind(var19, var15);
        }
        return var17;
    }
    
    public static SubLObject f33215(final SubLObject var4) {
        return module0038.f2867(Sequences.cconcatenate((SubLObject)$ic16$, module0597.f36628(var4)), (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f33216() {
        return Mapping.mapcar((SubLObject)$ic17$, module0219.f14512($ic13$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED));
    }
    
    public static SubLObject f33217(final SubLObject var5) {
        return (SubLObject)((NIL != module0212.f13762(var5)) ? module0220.f14553(var5, $ic13$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED) : NIL);
    }
    
    public static SubLObject f33218(final SubLObject var23) {
        return module0035.sublisp_boolean(f33217(var23));
    }
    
    public static SubLObject f33219() {
        module0084.f5789($g3911$.getGlobalValue(), (SubLObject)UNPROVIDED);
        PrintLow.format((SubLObject)T, (SubLObject)$ic18$, $g3910$.getGlobalValue());
        PrintLow.format((SubLObject)T, (SubLObject)$ic19$, $g3912$.getGlobalValue());
        final SubLObject var24 = Numbers.add($g3910$.getGlobalValue(), $g3912$.getGlobalValue());
        if (var24.isPositive()) {
            final SubLObject var25 = module0048.f3314(Numbers.divide($g3910$.getGlobalValue(), var24), (SubLObject)ONE_INTEGER, (SubLObject)FOUR_INTEGER);
            PrintLow.format((SubLObject)T, (SubLObject)$ic20$, var25);
            return var25;
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f33220() {
        $g3912$.setGlobalValue((SubLObject)ZERO_INTEGER);
        $g3910$.setGlobalValue((SubLObject)ZERO_INTEGER);
        module0067.f4881($g3911$.getGlobalValue());
        return (SubLObject)ZERO_INTEGER;
    }
    
    public static SubLObject f33221(final SubLObject var26, SubLObject var27) {
        if (var27 == UNPROVIDED) {
            var27 = f33222();
        }
        final SubLThread var28 = SubLProcess.currentSubLThread();
        final SubLObject var29 = f33223(var26, var27);
        module0012.$g82$.setDynamicValue((SubLObject)$ic21$, var28);
        module0012.$g73$.setDynamicValue(Time.get_universal_time(), var28);
        module0012.$g83$.setDynamicValue(Sequences.length(var29), var28);
        module0012.$g84$.setDynamicValue((SubLObject)ZERO_INTEGER, var28);
        final SubLObject var30 = module0012.$g75$.currentBinding(var28);
        final SubLObject var31 = module0012.$g76$.currentBinding(var28);
        final SubLObject var32 = module0012.$g77$.currentBinding(var28);
        final SubLObject var33 = module0012.$g78$.currentBinding(var28);
        try {
            module0012.$g75$.bind((SubLObject)ZERO_INTEGER, var28);
            module0012.$g76$.bind((SubLObject)NIL, var28);
            module0012.$g77$.bind((SubLObject)T, var28);
            module0012.$g78$.bind(Time.get_universal_time(), var28);
            module0012.f478(module0012.$g82$.getDynamicValue(var28));
            SubLObject var34 = var29;
            SubLObject var35 = (SubLObject)NIL;
            var35 = var34.first();
            while (NIL != var34) {
                module0012.note_percent_progress(module0012.$g84$.getDynamicValue(var28), module0012.$g83$.getDynamicValue(var28));
                module0012.$g84$.setDynamicValue(Numbers.add(module0012.$g84$.getDynamicValue(var28), (SubLObject)ONE_INTEGER), var28);
                f33204(var35, (SubLObject)T);
                var34 = var34.rest();
                var35 = var34.first();
            }
            module0012.f479();
        }
        finally {
            module0012.$g78$.rebind(var33, var28);
            module0012.$g77$.rebind(var32, var28);
            module0012.$g76$.rebind(var31, var28);
            module0012.$g75$.rebind(var30, var28);
        }
        return var26;
    }
    
    public static SubLObject f33223(final SubLObject var26, SubLObject var27) {
        if (var27 == UNPROVIDED) {
            var27 = f33222();
        }
        return module0035.f2124(var26, Mapping.mapcar(Symbols.symbol_function((SubLObject)$ic22$), module0084.f5795(var27, Symbols.symbol_function((SubLObject)$ic23$))));
    }
    
    public static SubLObject f33222() {
        final SubLThread var1 = SubLProcess.currentSubLThread();
        final SubLObject var2 = module0067.f4880(Symbols.symbol_function((SubLObject)EQL), (SubLObject)UNPROVIDED);
        final SubLObject var3 = constant_handles_oc.f8425();
        final SubLObject var4 = (SubLObject)$ic24$;
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
            final SubLObject var36_37 = var3;
            if (NIL == module0065.f4772(var36_37, (SubLObject)$ic26$)) {
                final SubLObject var38_39 = var36_37;
                if (NIL == module0065.f4775(var38_39, (SubLObject)$ic26$)) {
                    final SubLObject var11 = module0065.f4740(var38_39);
                    final SubLObject var12 = (SubLObject)NIL;
                    SubLObject var13;
                    SubLObject var14;
                    SubLObject var15;
                    SubLObject var16;
                    SubLObject var17;
                    for (var13 = Sequences.length(var11), var14 = (SubLObject)NIL, var14 = (SubLObject)ZERO_INTEGER; var14.numL(var13); var14 = Numbers.add(var14, (SubLObject)ONE_INTEGER)) {
                        var15 = ((NIL != var12) ? Numbers.subtract(var13, var14, (SubLObject)ONE_INTEGER) : var14);
                        var16 = Vectors.aref(var11, var15);
                        if (NIL == module0065.f4749(var16) || NIL == module0065.f4773((SubLObject)$ic26$)) {
                            if (NIL != module0065.f4749(var16)) {
                                var16 = (SubLObject)$ic26$;
                            }
                            module0012.note_percent_progress(var6, var5);
                            var6 = Numbers.add(var6, (SubLObject)ONE_INTEGER);
                            var17 = f33224(var16);
                            if (NIL != var17) {
                                module0084.f5775(var2, var17, (SubLObject)UNPROVIDED);
                            }
                        }
                    }
                }
                final SubLObject var46_47 = var36_37;
                if (NIL == module0065.f4777(var46_47) || NIL == module0065.f4773((SubLObject)$ic26$)) {
                    final SubLObject var18 = module0065.f4738(var46_47);
                    SubLObject var19 = module0065.f4739(var46_47);
                    final SubLObject var20 = module0065.f4734(var46_47);
                    final SubLObject var21 = (SubLObject)((NIL != module0065.f4773((SubLObject)$ic26$)) ? NIL : $ic26$);
                    while (var19.numL(var20)) {
                        final SubLObject var22 = Hashtables.gethash_without_values(var19, var18, var21);
                        if (NIL == module0065.f4773((SubLObject)$ic26$) || NIL == module0065.f4749(var22)) {
                            module0012.note_percent_progress(var6, var5);
                            var6 = Numbers.add(var6, (SubLObject)ONE_INTEGER);
                            final SubLObject var23 = f33224(var22);
                            if (NIL != var23) {
                                module0084.f5775(var2, var23, (SubLObject)UNPROVIDED);
                            }
                        }
                        var19 = Numbers.add(var19, (SubLObject)ONE_INTEGER);
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
        return var2;
    }
    
    public static SubLObject f33224(final SubLObject var16) {
        final SubLThread var17 = SubLProcess.currentSubLThread();
        SubLObject var18 = (SubLObject)NIL;
        final SubLObject var19 = module0147.f9540(module0132.$g1555$.getGlobalValue());
        final SubLObject var20 = module0147.$g2095$.currentBinding(var17);
        final SubLObject var21 = module0147.$g2094$.currentBinding(var17);
        final SubLObject var22 = module0147.$g2096$.currentBinding(var17);
        try {
            module0147.$g2095$.bind(module0147.f9545(var19), var17);
            module0147.$g2094$.bind(module0147.f9546(var19), var17);
            module0147.$g2096$.bind(module0147.f9549(var19), var17);
            final SubLObject var23 = module0219.f14509(var16, (SubLObject)ONE_INTEGER, $ic12$, (SubLObject)NIL, (SubLObject)$ic27$);
            final SubLObject var24 = f33225(var23);
            final SubLObject var25 = var18 = (SubLObject)((NIL != var24) ? module0178.f11335(var24) : NIL);
        }
        finally {
            module0147.$g2096$.rebind(var22, var17);
            module0147.$g2094$.rebind(var21, var17);
            module0147.$g2095$.rebind(var20, var17);
        }
        return var18;
    }
    
    public static SubLObject f33225(SubLObject var53) {
        var53 = module0035.remove_if_not((SubLObject)$ic28$, var53, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        final SubLObject var54 = module0211.f13683(var53);
        return (NIL != var54) ? var54 : module0035.f2099(var53);
    }
    
    public static SubLObject f33226() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0533", "f33201", "S#36659", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0533", "f33202", "S#36660", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0533", "f33206", "HL-PROTOTYPICAL-INSTANCE-AFTER-ADDING", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0533", "f33207", "HL-PROTOTYPICAL-INSTANCE-AFTER-REMOVING", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0533", "f33208", "S#36661", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0533", "f33209", "S#36662", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0533", "f33210", "S#36663", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0533", "f33211", "S#36664", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0533", "f33205", "S#36665", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0533", "f33212", "S#36666", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0533", "f33203", "S#36667", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0533", "f33204", "S#36668", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0533", "f33213", "S#36669", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0533", "f33214", "S#36670", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0533", "f33215", "S#36671", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0533", "f33216", "S#36672", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0533", "f33217", "S#36673", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0533", "f33218", "S#19639", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0533", "f33219", "S#36674", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0533", "f33220", "S#36675", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0533", "f33221", "S#36676", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0533", "f33223", "S#36677", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0533", "f33222", "S#36678", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0533", "f33224", "S#36679", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0533", "f33225", "S#36680", 1, 0, false);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f33227() {
        $g3908$ = SubLFiles.defparameter("S#36681", (SubLObject)T);
        $g3909$ = SubLFiles.defparameter("S#36682", (SubLObject)T);
        $g3910$ = SubLFiles.deflexical("S#36683", (SubLObject)((NIL != Symbols.boundp((SubLObject)$ic0$)) ? $g3910$.getGlobalValue() : ZERO_INTEGER));
        $g3911$ = SubLFiles.deflexical("S#36684", (NIL != Symbols.boundp((SubLObject)$ic1$)) ? $g3911$.getGlobalValue() : module0067.f4880(Symbols.symbol_function((SubLObject)EQ), (SubLObject)UNPROVIDED));
        $g3912$ = SubLFiles.deflexical("S#36685", (SubLObject)((NIL != Symbols.boundp((SubLObject)$ic2$)) ? $g3912$.getGlobalValue() : ZERO_INTEGER));
        $g3913$ = SubLFiles.deflexical("S#36686", (SubLObject)NIL);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f33228() {
        module0003.f57((SubLObject)$ic0$);
        module0003.f57((SubLObject)$ic1$);
        module0003.f57((SubLObject)$ic2$);
        module0012.f416((SubLObject)$ic3$);
        module0012.f416((SubLObject)$ic4$);
        module0034.f1909((SubLObject)$ic5$);
        return (SubLObject)NIL;
    }
    
    public void declareFunctions() {
        f33226();
    }
    
    public void initializeVariables() {
        f33227();
    }
    
    public void runTopLevelForms() {
        f33228();
    }
    
    static {
        me = (SubLFile)new module0533();
        $g3908$ = null;
        $g3909$ = null;
        $g3910$ = null;
        $g3911$ = null;
        $g3912$ = null;
        $g3913$ = null;
        $ic0$ = makeSymbol("S#36683", "CYC");
        $ic1$ = makeSymbol("S#36684", "CYC");
        $ic2$ = makeSymbol("S#36685", "CYC");
        $ic3$ = makeSymbol("HL-PROTOTYPICAL-INSTANCE-AFTER-ADDING");
        $ic4$ = makeSymbol("HL-PROTOTYPICAL-INSTANCE-AFTER-REMOVING");
        $ic5$ = makeSymbol("S#36664", "CYC");
        $ic6$ = constant_handles_oc.f8479((SubLObject)makeString("quotedIsa"));
        $ic7$ = ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("HLPrototypicalTerm")));
        $ic8$ = constant_handles_oc.f8479((SubLObject)makeString("keIrrelevantTerm"));
        $ic9$ = constant_handles_oc.f8479((SubLObject)makeString("UniversalVocabularyMt"));
        $ic10$ = makeSymbol("S#36686", "CYC");
        $ic11$ = makeKeyword("&MEMOIZED-ITEM-NOT-FOUND&");
        $ic12$ = constant_handles_oc.f8479((SubLObject)makeString("isa"));
        $ic13$ = constant_handles_oc.f8479((SubLObject)makeString("hlPrototypicalInstance"));
        $ic14$ = makeSymbol("S#690", "CYC");
        $ic15$ = makeKeyword("ALL");
        $ic16$ = makeString("ThePrototypical");
        $ic17$ = makeSymbol("GAF-ARG2");
        $ic18$ = makeString("Hits:   ~a~%");
        $ic19$ = makeString("Misses: ~a~%");
        $ic20$ = makeString("Ratio:  ~a%~%");
        $ic21$ = makeString("cdolist");
        $ic22$ = makeSymbol("CAR");
        $ic23$ = makeSymbol(">");
        $ic24$ = makeString("mapping Cyc constants");
        $ic25$ = makeSymbol("STRINGP");
        $ic26$ = makeKeyword("SKIP");
        $ic27$ = makeKeyword("TRUE");
        $ic28$ = makeSymbol("ASSERTED-ASSERTION?");
    }
}

/*
	DECOMPILATION REPORT

	Decompiled from: G:\opt\CYC_JRTL_with_CommonLisp\platform\lib\cyc-oc4.0-unzipped/com/cyc/cycjava/cycl/class
	Total time: 212 ms
	
	Decompiled with Procyon 0.5.32.
*/