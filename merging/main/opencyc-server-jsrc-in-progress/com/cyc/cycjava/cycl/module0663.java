package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class module0663 extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.module0663";
    public static final String myFingerPrint = "2a4521f91287f379e8db94a3c50d6c469fd248cb33710715ed3fe4bfeaa338d3";
    private static final SubLString $ic0$;
    private static final SubLString $ic1$;
    private static final SubLSymbol $ic2$;
    private static final SubLString $ic3$;
    private static final SubLString $ic4$;
    private static final SubLSymbol $ic5$;
    private static final SubLString $ic6$;
    private static final SubLString $ic7$;
    private static final SubLString $ic8$;
    private static final SubLString $ic9$;
    private static final SubLString $ic10$;
    private static final SubLString $ic11$;
    private static final SubLSymbol $ic12$;
    private static final SubLSymbol $ic13$;
    private static final SubLSymbol $ic14$;
    private static final SubLSymbol $ic15$;
    private static final SubLSymbol $ic16$;
    private static final SubLSymbol $ic17$;
    private static final SubLSymbol $ic18$;
    private static final SubLString $ic19$;
    private static final SubLSymbol $ic20$;
    private static final SubLString $ic21$;
    private static final SubLSymbol $ic22$;
    private static final SubLString $ic23$;
    private static final SubLSymbol $ic24$;
    private static final SubLInteger $ic25$;
    private static final SubLSymbol $ic26$;
    private static final SubLString $ic27$;
    private static final SubLString $ic28$;
    private static final SubLString $ic29$;
    private static final SubLString $ic30$;
    private static final SubLString $ic31$;
    private static final SubLString $ic32$;
    private static final SubLString $ic33$;
    private static final SubLObject $ic34$;
    private static final SubLObject $ic35$;
    private static final SubLObject $ic36$;
    private static final SubLString $ic37$;
    private static final SubLString $ic38$;
    private static final SubLString $ic39$;
    private static final SubLString $ic40$;
    private static final SubLObject $ic41$;
    private static final SubLList $ic42$;
    private static final SubLString $ic43$;
    private static final SubLSymbol $ic44$;
    private static final SubLObject $ic45$;
    private static final SubLString $ic46$;
    private static final SubLString $ic47$;
    private static final SubLString $ic48$;
    private static final SubLObject $ic49$;
    private static final SubLSymbol $ic50$;
    private static final SubLSymbol $ic51$;
    private static final SubLList $ic52$;
    private static final SubLString $ic53$;
    private static final SubLString $ic54$;
    private static final SubLString $ic55$;
    private static final SubLString $ic56$;
    private static final SubLString $ic57$;
    private static final SubLSymbol $ic58$;
    private static final SubLSymbol $ic59$;
    private static final SubLString $ic60$;
    private static final SubLString $ic61$;
    private static final SubLString $ic62$;
    private static final SubLString $ic63$;
    private static final SubLString $ic64$;
    private static final SubLSymbol $ic65$;
    private static final SubLString $ic66$;
    private static final SubLSymbol $ic67$;
    private static final SubLSymbol $ic68$;
    private static final SubLString $ic69$;
    private static final SubLSymbol $ic70$;
    private static final SubLList $ic71$;
    private static final SubLString $ic72$;
    private static final SubLSymbol $ic73$;
    private static final SubLString $ic74$;
    private static final SubLString $ic75$;
    private static final SubLSymbol $ic76$;
    private static final SubLString $ic77$;
    private static final SubLSymbol $ic78$;
    private static final SubLSymbol $ic79$;
    private static final SubLSymbol $ic80$;
    private static final SubLSymbol $ic81$;
    
    public static SubLObject f40325(final SubLObject var1) {
        final SubLThread var2 = SubLProcess.currentSubLThread();
        final SubLObject var3 = (SubLObject)$ic0$;
        final SubLObject var4 = module0015.$g538$.currentBinding(var2);
        try {
            module0015.$g538$.bind((NIL != module0057.f4158(module0015.$g538$.getDynamicValue(var2))) ? module0015.$g538$.getDynamicValue(var2) : module0057.f4173((SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED), var2);
            module0642.f39020((SubLObject)$ic1$);
            module0642.f39029((SubLObject)UNPROVIDED);
            module0642.f39020(module0015.$g155$.getGlobalValue());
            module0642.f39020(module0015.$g153$.getGlobalValue());
            module0015.f718();
            module0655.f39766();
            module0642.f39064(module0655.$g5143$.getDynamicValue(var2), module0655.$g5142$.getDynamicValue(var2));
            final SubLObject var5 = module0014.f672((SubLObject)$ic2$);
            module0642.f39029((SubLObject)UNPROVIDED);
            module0642.f39020(module0015.$g175$.getGlobalValue());
            module0642.f39020(module0015.$g176$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
            module0642.f39020((SubLObject)$ic3$);
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
            if (NIL != var5) {
                module0642.f39020(module0015.$g178$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                module0642.f39020(var5);
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
            }
            module0642.f39020(module0015.$g177$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
            module0642.f39020((SubLObject)$ic4$);
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
            module0016.f941();
            if (NIL != var3) {
                module0642.f39029((SubLObject)UNPROVIDED);
                module0642.f39020(module0015.$g173$.getGlobalValue());
                module0642.f39019(var3);
                module0642.f39020(module0015.$g174$.getGlobalValue());
            }
            module0642.f39020(module0015.$g154$.getGlobalValue());
            module0642.f39029((SubLObject)UNPROVIDED);
            final SubLObject var4_6 = module0015.$g535$.currentBinding(var2);
            try {
                module0015.$g535$.bind((SubLObject)T, var2);
                module0642.f39020(module0015.$g133$.getGlobalValue());
                if (NIL != module0015.$g132$.getDynamicValue(var2)) {
                    module0642.f39020(module0015.$g135$.getGlobalValue());
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                    module0642.f39020(module0642.f39042(module0015.$g132$.getDynamicValue(var2)));
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                }
                module0642.f39020(module0015.$g137$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                module0642.f39020((SubLObject)$ic7$);
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                final SubLObject var4_7 = module0015.$g533$.currentBinding(var2);
                try {
                    module0015.$g533$.bind((SubLObject)T, var2);
                    module0642.f39020(module0015.$g144$.getGlobalValue());
                    module0642.f39020(module0015.$g157$.getGlobalValue());
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                    module0642.f39020((SubLObject)$ic8$);
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                    module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                    final SubLObject var4_8 = module0015.$g533$.currentBinding(var2);
                    try {
                        module0015.$g533$.bind((SubLObject)T, var2);
                        module0642.f39020(module0015.$g295$.getGlobalValue());
                        module0642.f39020(module0015.$g305$.getGlobalValue());
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                        module0642.f39020((SubLObject)$ic9$);
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                        module0642.f39020(module0015.$g302$.getGlobalValue());
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                        module0642.f39020((SubLObject)$ic10$);
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                        module0642.f39020(module0015.$g307$.getGlobalValue());
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                        module0642.f39019((SubLObject)$ic11$);
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                    }
                    finally {
                        module0015.$g533$.rebind(var4_8, var2);
                    }
                    module0642.f39020(module0015.$g145$.getGlobalValue());
                    if (NIL != var3) {
                        module0642.f39020(module0015.$g189$.getGlobalValue());
                        module0642.f39020((SubLObject)TWO_INTEGER);
                        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                        module0642.f39019(var3);
                        module0642.f39020(module0015.$g190$.getGlobalValue());
                        module0642.f39020((SubLObject)TWO_INTEGER);
                        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                    }
                    module0016.f892();
                    module0016.f895();
                    final SubLObject var4_9 = module0016.$g568$.currentBinding(var2);
                    try {
                        module0016.$g568$.bind((SubLObject)ZERO_INTEGER, var2);
                        module0016.f936();
                        module0642.f39020(module0016.$g569$.getGlobalValue());
                        f40326(var1);
                    }
                    finally {
                        module0016.$g568$.rebind(var4_9, var2);
                    }
                    module0642.f39029((SubLObject)UNPROVIDED);
                    module0642.f39050();
                }
                finally {
                    module0015.$g533$.rebind(var4_7, var2);
                }
                module0642.f39020(module0015.$g134$.getGlobalValue());
                module0642.f39029((SubLObject)UNPROVIDED);
            }
            finally {
                module0015.$g535$.rebind(var4_6, var2);
            }
            module0642.f39020(module0015.$g156$.getGlobalValue());
            module0642.f39029((SubLObject)UNPROVIDED);
        }
        finally {
            module0015.$g538$.rebind(var4, var2);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f40327(final SubLObject var10) {
        return (SubLObject)NIL;
    }
    
    public static SubLObject f40326(final SubLObject var1) {
        final SubLThread var2 = SubLProcess.currentSubLThread();
        module0642.f39020(module0015.$g282$.getGlobalValue());
        module0642.f39020(module0015.$g284$.getGlobalValue());
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        module0642.f39020(module0110.$g570$.getDynamicValue(var2));
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
        final SubLObject var3 = module0015.$g533$.currentBinding(var2);
        final SubLObject var4 = module0015.$g541$.currentBinding(var2);
        final SubLObject var5 = module0015.$g539$.currentBinding(var2);
        try {
            module0015.$g533$.bind((SubLObject)T, var2);
            module0015.$g541$.bind((SubLObject)T, var2);
            module0015.$g539$.bind(module0015.f797(), var2);
            module0669.f40609(var1, (SubLObject)$ic12$);
            module0642.f39051((SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
            if (NIL != module0172.f10917(var1)) {
                f40327(var1);
                if ($ic13$ == module0018.$g707$.getDynamicValue(var2)) {
                    module0669.f40611(var1);
                }
                module0642.f39026((SubLObject)UNPROVIDED);
                module0642.f39026((SubLObject)UNPROVIDED);
                module0642.f39020(module0015.$g459$.getGlobalValue());
                module0642.f39032((SubLObject)ZERO_INTEGER);
                module0656.f39837((SubLObject)$ic14$, var1, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                module0642.f39020(module0015.$g460$.getGlobalValue());
                module0642.f39026((SubLObject)UNPROVIDED);
                module0642.f39020(module0015.$g459$.getGlobalValue());
                module0642.f39032((SubLObject)ZERO_INTEGER);
                module0656.f39837((SubLObject)$ic15$, var1, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                module0642.f39020(module0015.$g460$.getGlobalValue());
                module0016.f939((SubLObject)ConsesLow.list(new SubLObject[] { $ic16$, $ic17$, $ic18$, ConsesLow.list(reader.bq_cons((SubLObject)$ic19$, var1)), $ic20$, $ic21$, $ic22$, $ic23$, $ic24$, $ic25$ }));
            }
            module0642.f39051((SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
            module0669.f40614(var1);
            module0015.f799(module0015.$g539$.getDynamicValue(var2));
        }
        finally {
            module0015.$g539$.rebind(var5, var2);
            module0015.$g541$.rebind(var4, var2);
            module0015.$g533$.rebind(var3, var2);
        }
        module0642.f39020(module0015.$g283$.getGlobalValue());
        return (SubLObject)NIL;
    }
    
    public static SubLObject f40328(final SubLObject var10) {
        final SubLThread var11 = SubLProcess.currentSubLThread();
        if (module0655.$g5079$.getDynamicValue(var11) == $ic26$) {
            return module0660.f40186(var10);
        }
        f40329(var10);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f40329(final SubLObject var10) {
        final SubLThread var11 = SubLProcess.currentSubLThread();
        final SubLObject var13;
        final SubLObject var12 = var13 = PrintLow.format((SubLObject)NIL, (SubLObject)$ic27$, var10);
        final SubLObject var14 = module0015.$g538$.currentBinding(var11);
        try {
            module0015.$g538$.bind((NIL != module0057.f4158(module0015.$g538$.getDynamicValue(var11))) ? module0015.$g538$.getDynamicValue(var11) : module0057.f4173((SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED), var11);
            module0642.f39020((SubLObject)$ic1$);
            module0642.f39029((SubLObject)UNPROVIDED);
            module0642.f39020(module0015.$g155$.getGlobalValue());
            module0642.f39020(module0015.$g153$.getGlobalValue());
            module0015.f718();
            module0655.f39766();
            module0642.f39064(module0655.$g5143$.getDynamicValue(var11), module0655.$g5142$.getDynamicValue(var11));
            final SubLObject var15 = module0014.f672((SubLObject)$ic2$);
            module0642.f39029((SubLObject)UNPROVIDED);
            module0642.f39020(module0015.$g175$.getGlobalValue());
            module0642.f39020(module0015.$g176$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
            module0642.f39020((SubLObject)$ic3$);
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
            if (NIL != var15) {
                module0642.f39020(module0015.$g178$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                module0642.f39020(var15);
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
            }
            module0642.f39020(module0015.$g177$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
            module0642.f39020((SubLObject)$ic4$);
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
            if (NIL != var13) {
                module0642.f39029((SubLObject)UNPROVIDED);
                module0642.f39020(module0015.$g173$.getGlobalValue());
                module0642.f39019(var13);
                module0642.f39020(module0015.$g174$.getGlobalValue());
            }
            module0016.f941();
            module0642.f39020(module0015.$g154$.getGlobalValue());
            module0642.f39029((SubLObject)UNPROVIDED);
            final SubLObject var4_15 = module0015.$g535$.currentBinding(var11);
            try {
                module0015.$g535$.bind((SubLObject)T, var11);
                module0642.f39020(module0015.$g133$.getGlobalValue());
                if (NIL != module0015.$g132$.getDynamicValue(var11)) {
                    module0642.f39020(module0015.$g135$.getGlobalValue());
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                    module0642.f39020(module0642.f39042(module0015.$g132$.getDynamicValue(var11)));
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                }
                module0642.f39020(module0015.$g137$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                module0642.f39020((SubLObject)$ic7$);
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                final SubLObject var4_16 = module0015.$g533$.currentBinding(var11);
                try {
                    module0015.$g533$.bind((SubLObject)T, var11);
                    module0642.f39020(module0015.$g144$.getGlobalValue());
                    module0642.f39020(module0015.$g157$.getGlobalValue());
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                    module0642.f39020((SubLObject)$ic8$);
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                    module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                    final SubLObject var4_17 = module0015.$g533$.currentBinding(var11);
                    try {
                        module0015.$g533$.bind((SubLObject)T, var11);
                        module0642.f39020(module0015.$g295$.getGlobalValue());
                        module0642.f39020(module0015.$g305$.getGlobalValue());
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                        module0642.f39020((SubLObject)$ic9$);
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                        module0642.f39020(module0015.$g302$.getGlobalValue());
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                        module0642.f39020((SubLObject)$ic10$);
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                        module0642.f39020(module0015.$g307$.getGlobalValue());
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                        module0642.f39019((SubLObject)$ic28$);
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                        module0642.f39020(module0015.$g160$.getGlobalValue());
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                        module0642.f39020((SubLObject)$ic29$);
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                    }
                    finally {
                        module0015.$g533$.rebind(var4_17, var11);
                    }
                    module0642.f39020(module0015.$g145$.getGlobalValue());
                    module0669.f40722(var10);
                    module0642.f39067();
                    module0642.f39067();
                    f40330(var10);
                    module0642.f39067();
                    module0642.f39051((SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                    module0642.f39067();
                    f40331(var10);
                    module0642.f39029((SubLObject)UNPROVIDED);
                    module0642.f39050();
                }
                finally {
                    module0015.$g533$.rebind(var4_16, var11);
                }
                module0642.f39020(module0015.$g134$.getGlobalValue());
                module0642.f39029((SubLObject)UNPROVIDED);
            }
            finally {
                module0015.$g535$.rebind(var4_15, var11);
            }
            module0642.f39020(module0015.$g156$.getGlobalValue());
            module0642.f39029((SubLObject)UNPROVIDED);
        }
        finally {
            module0015.$g538$.rebind(var14, var11);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f40332(final SubLObject var13, final SubLObject var18, SubLObject var19, SubLObject var20) {
        if (var19 == UNPROVIDED) {
            var19 = (SubLObject)FOUR_INTEGER;
        }
        if (var20 == UNPROVIDED) {
            var20 = (SubLObject)T;
        }
        final SubLThread var21 = SubLProcess.currentSubLThread();
        module0642.f39020(module0015.$g234$.getGlobalValue());
        SubLObject var22 = var19;
        module0642.f39020(module0015.$g219$.getGlobalValue());
        if (NIL != var22) {
            module0642.f39020(module0015.$g221$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
            module0642.f39020(var22);
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        }
        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
        SubLObject var23 = module0015.$g533$.currentBinding(var21);
        try {
            module0015.$g533$.bind((SubLObject)T, var21);
            module0642.f39019(var13);
        }
        finally {
            module0015.$g533$.rebind(var23, var21);
        }
        module0642.f39020(module0015.$g220$.getGlobalValue());
        module0642.f39020(module0015.$g235$.getGlobalValue());
        module0642.f39067();
        if (NIL != var18) {
            module0642.f39020(module0015.$g234$.getGlobalValue());
            var22 = (SubLObject)(var19.numE((SubLObject)ONE_INTEGER) ? ONE_INTEGER : Numbers.subtract(var19, (SubLObject)ONE_INTEGER));
            module0642.f39020(module0015.$g219$.getGlobalValue());
            if (NIL != var22) {
                module0642.f39020(module0015.$g221$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                module0642.f39020(var22);
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
            }
            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
            var23 = module0015.$g533$.currentBinding(var21);
            try {
                module0015.$g533$.bind((SubLObject)T, var21);
                module0642.f39020(module0015.$g459$.getGlobalValue());
                module0656.f39804(var18, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                module0642.f39020(module0015.$g460$.getGlobalValue());
            }
            finally {
                module0015.$g533$.rebind(var23, var21);
            }
            module0642.f39020(module0015.$g220$.getGlobalValue());
            module0642.f39020(module0015.$g235$.getGlobalValue());
            module0642.f39067();
        }
        if (NIL != var20) {
            module0642.f39067();
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f40331(final SubLObject var10) {
        f40332((SubLObject)$ic30$, var10, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        final SubLObject var11 = module0205.f13289(var10);
        if (NIL != module0173.f10955(var11)) {
            module0669.f40710(var11);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f40333(final SubLObject var23, final SubLObject var24) {
        if (NIL != var23) {
            module0642.f39020(module0015.$g209$.getGlobalValue());
            module0656.f39804(var24, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
            module0642.f39020(module0015.$g210$.getGlobalValue());
            module0642.f39019((SubLObject)$ic31$);
            SubLObject var25 = var23;
            SubLObject var26 = (SubLObject)NIL;
            var26 = var25.first();
            while (NIL != var25) {
                module0656.f39804(var26, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                module0642.f39032((SubLObject)UNPROVIDED);
                var25 = var25.rest();
                var26 = var25.first();
            }
            module0642.f39026((SubLObject)UNPROVIDED);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f40334(final SubLObject var10, final SubLObject var27) {
        module0642.f39067();
        f40332((SubLObject)$ic32$, (SubLObject)NIL, (SubLObject)FOUR_INTEGER, (SubLObject)UNPROVIDED);
        module0642.f39020(module0015.$g234$.getGlobalValue());
        module0642.f39019((SubLObject)$ic33$);
        module0656.f39804($ic34$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        module0642.f39020(module0015.$g235$.getGlobalValue());
        module0642.f39026((SubLObject)UNPROVIDED);
        if (NIL != module0004.f104($ic35$, var27, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)) {
            final SubLObject var28 = module0259.f16822(var10, $ic34$, (SubLObject)UNPROVIDED);
            f40333(var28, $ic35$);
        }
        if (NIL != module0004.f104($ic36$, var27, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)) {
            final SubLObject var29 = module0256.f16525(var10, $ic34$, (SubLObject)UNPROVIDED);
            f40333(var29, $ic36$);
        }
        module0642.f39026((SubLObject)UNPROVIDED);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f40335(final SubLObject var10) {
        final SubLThread var11 = SubLProcess.currentSubLThread();
        final SubLObject var13;
        final SubLObject var12 = var13 = PrintLow.format((SubLObject)NIL, (SubLObject)$ic37$, var10);
        final SubLObject var14 = module0015.$g538$.currentBinding(var11);
        try {
            module0015.$g538$.bind((NIL != module0057.f4158(module0015.$g538$.getDynamicValue(var11))) ? module0015.$g538$.getDynamicValue(var11) : module0057.f4173((SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED), var11);
            module0642.f39020((SubLObject)$ic1$);
            module0642.f39029((SubLObject)UNPROVIDED);
            module0642.f39020(module0015.$g155$.getGlobalValue());
            module0642.f39020(module0015.$g153$.getGlobalValue());
            module0015.f718();
            module0655.f39766();
            module0642.f39064(module0655.$g5143$.getDynamicValue(var11), module0655.$g5142$.getDynamicValue(var11));
            final SubLObject var15 = module0014.f672((SubLObject)$ic2$);
            module0642.f39029((SubLObject)UNPROVIDED);
            module0642.f39020(module0015.$g175$.getGlobalValue());
            module0642.f39020(module0015.$g176$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
            module0642.f39020((SubLObject)$ic3$);
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
            if (NIL != var15) {
                module0642.f39020(module0015.$g178$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                module0642.f39020(var15);
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
            }
            module0642.f39020(module0015.$g177$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
            module0642.f39020((SubLObject)$ic4$);
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
            if (NIL != var13) {
                module0642.f39029((SubLObject)UNPROVIDED);
                module0642.f39020(module0015.$g173$.getGlobalValue());
                module0642.f39019(var13);
                module0642.f39020(module0015.$g174$.getGlobalValue());
            }
            module0016.f941();
            module0642.f39020(module0015.$g154$.getGlobalValue());
            module0642.f39029((SubLObject)UNPROVIDED);
            final SubLObject var4_30 = module0015.$g535$.currentBinding(var11);
            try {
                module0015.$g535$.bind((SubLObject)T, var11);
                module0642.f39020(module0015.$g133$.getGlobalValue());
                if (NIL != module0015.$g132$.getDynamicValue(var11)) {
                    module0642.f39020(module0015.$g135$.getGlobalValue());
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                    module0642.f39020(module0642.f39042(module0015.$g132$.getDynamicValue(var11)));
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                }
                module0642.f39020(module0015.$g137$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                module0642.f39020((SubLObject)$ic7$);
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                final SubLObject var4_31 = module0015.$g533$.currentBinding(var11);
                try {
                    module0015.$g533$.bind((SubLObject)T, var11);
                    module0642.f39020(module0015.$g144$.getGlobalValue());
                    module0642.f39020(module0015.$g157$.getGlobalValue());
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                    module0642.f39020((SubLObject)$ic8$);
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                    module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                    final SubLObject var4_32 = module0015.$g533$.currentBinding(var11);
                    try {
                        module0015.$g533$.bind((SubLObject)T, var11);
                        module0642.f39020(module0015.$g295$.getGlobalValue());
                        module0642.f39020(module0015.$g305$.getGlobalValue());
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                        module0642.f39020((SubLObject)$ic9$);
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                        module0642.f39020(module0015.$g302$.getGlobalValue());
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                        module0642.f39020((SubLObject)$ic10$);
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                        module0642.f39020(module0015.$g307$.getGlobalValue());
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                        module0642.f39019((SubLObject)$ic28$);
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                        module0642.f39020(module0015.$g160$.getGlobalValue());
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                        module0642.f39020((SubLObject)$ic29$);
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                    }
                    finally {
                        module0015.$g533$.rebind(var4_32, var11);
                    }
                    module0642.f39020(module0015.$g145$.getGlobalValue());
                    f40330(var10);
                    module0642.f39029((SubLObject)UNPROVIDED);
                    module0642.f39050();
                }
                finally {
                    module0015.$g533$.rebind(var4_31, var11);
                }
                module0642.f39020(module0015.$g134$.getGlobalValue());
                module0642.f39029((SubLObject)UNPROVIDED);
            }
            finally {
                module0015.$g535$.rebind(var4_30, var11);
            }
            module0642.f39020(module0015.$g156$.getGlobalValue());
            module0642.f39029((SubLObject)UNPROVIDED);
        }
        finally {
            module0015.$g538$.rebind(var14, var11);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f40336(final SubLObject var10) {
        final SubLObject var11 = (SubLObject)NIL;
        if (NIL != var11) {
            f40332((SubLObject)$ic38$, (SubLObject)NIL, (SubLObject)FOUR_INTEGER, (SubLObject)NIL);
            SubLObject var12 = var11;
            SubLObject var13 = (SubLObject)NIL;
            var13 = var12.first();
            while (NIL != var12) {
                module0656.f39804(var13, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                module0642.f39032((SubLObject)UNPROVIDED);
                var12 = var12.rest();
                var13 = var12.first();
            }
            module0642.f39026((SubLObject)TWO_INTEGER);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f40337(final SubLObject var10, final SubLObject var27) {
        return (SubLObject)NIL;
    }
    
    public static SubLObject f40330(final SubLObject var10) {
        final SubLThread var11 = SubLProcess.currentSubLThread();
        f40332((SubLObject)$ic39$, var10, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        final SubLObject var12 = module0172.f10921(var10);
        SubLObject var13 = (SubLObject)NIL;
        final SubLObject var14 = module0661.$g5224$.currentBinding(var11);
        try {
            module0661.$g5224$.bind((SubLObject)NIL, var11);
            if (NIL != module0167.f10813(var12)) {
                f40332((SubLObject)$ic40$, var12, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                module0642.f39026((SubLObject)UNPROVIDED);
            }
            else {
                final SubLObject var15 = module0220.f14601(module0205.f13276(var10), $ic41$, (SubLObject)ONE_INTEGER, (SubLObject)$ic42$, (SubLObject)UNPROVIDED);
                if (NIL != var15) {
                    f40332((SubLObject)$ic43$, (SubLObject)NIL, (SubLObject)FOUR_INTEGER, (SubLObject)NIL);
                    SubLObject var16 = var15;
                    SubLObject var17 = (SubLObject)NIL;
                    var17 = var16.first();
                    while (NIL != var16) {
                        final SubLObject var18 = var17.first();
                        final SubLObject var19 = conses_high.second(var17);
                        SubLObject var20 = ConsesLow.append((SubLObject)ConsesLow.list(var18), conses_high.copy_list(module0205.f13304(var10, (SubLObject)UNPROVIDED)));
                        var20 = module0035.f2139(conses_high.copy_list(var10), var20, var19);
                        final SubLObject var4_41 = module0147.$g2094$.currentBinding(var11);
                        final SubLObject var21 = module0147.$g2095$.currentBinding(var11);
                        try {
                            module0147.$g2094$.bind((SubLObject)$ic44$, var11);
                            module0147.$g2095$.bind($ic45$, var11);
                            if (NIL == module0274.f18063(var20, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)) {
                                module0642.f39020(module0015.$g219$.getGlobalValue());
                                module0642.f39020(module0015.$g222$.getGlobalValue());
                                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                                module0642.f39020(module0642.f39042((SubLObject)$ic46$));
                                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                                module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                                final SubLObject var4_42 = module0015.$g533$.currentBinding(var11);
                                try {
                                    module0015.$g533$.bind((SubLObject)T, var11);
                                    module0642.f39020(module0015.$g209$.getGlobalValue());
                                    module0642.f39019((SubLObject)$ic47$);
                                    module0642.f39026((SubLObject)UNPROVIDED);
                                    module0642.f39020(module0015.$g210$.getGlobalValue());
                                }
                                finally {
                                    module0015.$g533$.rebind(var4_42, var11);
                                }
                                module0642.f39020(module0015.$g220$.getGlobalValue());
                            }
                        }
                        finally {
                            module0147.$g2095$.rebind(var21, var11);
                            module0147.$g2094$.rebind(var4_41, var11);
                        }
                        module0656.f39804(var20, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                        module0642.f39026((SubLObject)TWO_INTEGER);
                        var16 = var16.rest();
                        var17 = var16.first();
                    }
                }
            }
            f40336(var10);
            final SubLObject var4_43 = module0147.$g2094$.currentBinding(var11);
            final SubLObject var22 = module0147.$g2095$.currentBinding(var11);
            try {
                module0147.$g2094$.bind((SubLObject)$ic44$, var11);
                module0147.$g2095$.bind($ic45$, var11);
                var13 = module0213.f13995(var10);
            }
            finally {
                module0147.$g2095$.rebind(var22, var11);
                module0147.$g2094$.rebind(var4_43, var11);
            }
            module0669.f40724((SubLObject)ONE_INTEGER);
            final SubLObject var4_44 = module0655.$g5125$.currentBinding(var11);
            try {
                module0655.$g5125$.bind((SubLObject)NIL, var11);
                final SubLObject var23 = module0656.f39824(var13);
                f40334(var10, var23);
                f40332((SubLObject)$ic48$, (SubLObject)NIL, (SubLObject)FOUR_INTEGER, (SubLObject)NIL);
                SubLObject var24 = var23;
                SubLObject var25 = (SubLObject)NIL;
                var25 = var24.first();
                while (NIL != var24) {
                    f40338(var10, (SubLObject)ONE_INTEGER, var25);
                    var24 = var24.rest();
                    var25 = var24.first();
                }
                f40338(var10, (SubLObject)ONE_INTEGER, $ic49$);
                f40337(var10, var23);
            }
            finally {
                module0655.$g5125$.rebind(var4_44, var11);
            }
        }
        finally {
            module0661.$g5224$.rebind(var14, var11);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f40339(final SubLObject var10) {
        f40340(var10, (SubLObject)NIL, (SubLObject)NIL, (SubLObject)NIL);
        module0642.f39051((SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        f40341(var10);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f40342(final SubLObject var10) {
        f40343(var10);
        f40344(var10);
        if (NIL != module0161.f10499(var10)) {
            module0669.f40632(var10);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f40343(final SubLObject var1) {
        final SubLObject var2 = f40345(var1, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        if (var2.numG((SubLObject)ZERO_INTEGER)) {
            module0642.f39026((SubLObject)UNPROVIDED);
            module0642.f39020(module0015.$g459$.getGlobalValue());
            module0642.f39032((SubLObject)ZERO_INTEGER);
            module0656.f39837((SubLObject)$ic50$, var1, var2, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
            module0642.f39020(module0015.$g460$.getGlobalValue());
            SubLObject var4;
            final SubLObject var3 = var4 = f40346(var1, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
            SubLObject var5 = (SubLObject)NIL;
            var5 = var4.first();
            while (NIL != var4) {
                f40347(var1, var5);
                var4 = var4.rest();
                var5 = var4.first();
            }
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f40347(final SubLObject var1, final SubLObject var47) {
        final SubLObject var48 = f40345(var1, var47, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        if (var48.numG((SubLObject)ZERO_INTEGER)) {
            module0642.f39026((SubLObject)UNPROVIDED);
            module0642.f39020(module0015.$g459$.getGlobalValue());
            module0642.f39032((SubLObject)ONE_INTEGER);
            module0656.f39837((SubLObject)$ic50$, var1, var48, var47, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
            module0642.f39020(module0015.$g460$.getGlobalValue());
            SubLObject var50;
            final SubLObject var49 = var50 = f40346(var1, var47, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
            SubLObject var51 = (SubLObject)NIL;
            var51 = var50.first();
            while (NIL != var50) {
                f40348(var1, var47, var51);
                var50 = var50.rest();
                var51 = var50.first();
            }
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f40348(final SubLObject var1, final SubLObject var47, final SubLObject var24) {
        final SubLObject var48 = f40345(var1, var47, var24, (SubLObject)UNPROVIDED);
        if (var48.numG((SubLObject)ZERO_INTEGER)) {
            final SubLObject var49 = f40346(var1, var47, var24, (SubLObject)UNPROVIDED);
            module0642.f39026((SubLObject)UNPROVIDED);
            module0642.f39020(module0015.$g459$.getGlobalValue());
            module0642.f39032((SubLObject)TWO_INTEGER);
            module0656.f39837((SubLObject)$ic50$, var1, var48, var47, var24, (SubLObject)UNPROVIDED);
            if (!Sequences.length(var49).numLE((SubLObject)ONE_INTEGER)) {
                SubLObject var50 = var49;
                SubLObject var51 = (SubLObject)NIL;
                var51 = var50.first();
                while (NIL != var50) {
                    f40349(var1, var47, var24, var51);
                    var50 = var50.rest();
                    var51 = var50.first();
                }
            }
            module0642.f39020(module0015.$g460$.getGlobalValue());
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f40349(final SubLObject var1, final SubLObject var47, final SubLObject var24, final SubLObject var50) {
        final SubLObject var51 = f40345(var1, var47, var24, var50);
        if (var51.numG((SubLObject)ZERO_INTEGER)) {
            module0642.f39026((SubLObject)UNPROVIDED);
            module0642.f39020(module0015.$g459$.getGlobalValue());
            module0642.f39032((SubLObject)THREE_INTEGER);
            module0642.f39020(module0015.$g230$.getGlobalValue());
            module0656.f39837((SubLObject)$ic50$, var1, var51, var47, var24, var50);
            module0642.f39020(module0015.$g231$.getGlobalValue());
            module0642.f39020(module0015.$g460$.getGlobalValue());
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f40344(final SubLObject var1) {
        final SubLObject var2 = f40350(var1, (SubLObject)UNPROVIDED);
        if (var2.numG((SubLObject)ZERO_INTEGER)) {
            module0642.f39051((SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
            module0642.f39020(module0015.$g459$.getGlobalValue());
            module0642.f39032((SubLObject)ZERO_INTEGER);
            module0656.f39837((SubLObject)$ic51$, var1, var2, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
            module0642.f39020(module0015.$g460$.getGlobalValue());
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f40351(final SubLObject var51) {
        final SubLThread var52 = SubLProcess.currentSubLThread();
        SubLObject var53 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var51, var51, (SubLObject)$ic52$);
        var53 = var51.first();
        SubLObject var54 = var51.rest();
        final SubLObject var55 = (SubLObject)(var54.isCons() ? var54.first() : NIL);
        cdestructuring_bind.destructuring_bind_must_listp(var54, var51, (SubLObject)$ic52$);
        var54 = var54.rest();
        final SubLObject var56 = (SubLObject)(var54.isCons() ? var54.first() : NIL);
        cdestructuring_bind.destructuring_bind_must_listp(var54, var51, (SubLObject)$ic52$);
        var54 = var54.rest();
        final SubLObject var57 = (SubLObject)(var54.isCons() ? var54.first() : NIL);
        cdestructuring_bind.destructuring_bind_must_listp(var54, var51, (SubLObject)$ic52$);
        var54 = var54.rest();
        if (NIL == var54) {
            final SubLObject var58 = module0656.f39950(var53, (SubLObject)UNPROVIDED);
            SubLObject var59 = (SubLObject)NIL;
            SubLObject var60 = (SubLObject)NIL;
            SubLObject var61 = (SubLObject)NIL;
            if (NIL == module0210.f13595(var58, (SubLObject)UNPROVIDED)) {
                return module0656.f39789((SubLObject)$ic53$, var53, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
            }
            if (NIL != var55) {
                var59 = reader.read_from_string_ignoring_errors(var55, (SubLObject)NIL, (SubLObject)NIL, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                if (!var59.isFixnum()) {
                    return module0656.f39789((SubLObject)$ic54$, var55, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                }
                if (NIL != var56) {
                    var60 = module0656.f39943(var56, (SubLObject)UNPROVIDED);
                    if (NIL == module0173.f10955(var60)) {
                        return module0656.f39789((SubLObject)$ic55$, var56, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                    }
                    if (NIL != var57) {
                        var61 = module0656.f39959(var57);
                        if (NIL == module0161.f10481(var61)) {
                            return module0656.f39789((SubLObject)$ic56$, var57, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                        }
                    }
                }
            }
            final SubLObject var63;
            final SubLObject var62 = var63 = PrintLow.format((SubLObject)NIL, (SubLObject)$ic57$, var58);
            final SubLObject var64 = module0015.$g538$.currentBinding(var52);
            try {
                module0015.$g538$.bind((NIL != module0057.f4158(module0015.$g538$.getDynamicValue(var52))) ? module0015.$g538$.getDynamicValue(var52) : module0057.f4173((SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED), var52);
                module0642.f39020((SubLObject)$ic1$);
                module0642.f39029((SubLObject)UNPROVIDED);
                module0642.f39020(module0015.$g155$.getGlobalValue());
                module0642.f39020(module0015.$g153$.getGlobalValue());
                module0015.f718();
                module0655.f39766();
                module0642.f39064(module0655.$g5143$.getDynamicValue(var52), module0655.$g5142$.getDynamicValue(var52));
                final SubLObject var65 = module0014.f672((SubLObject)$ic2$);
                module0642.f39029((SubLObject)UNPROVIDED);
                module0642.f39020(module0015.$g175$.getGlobalValue());
                module0642.f39020(module0015.$g176$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                module0642.f39020((SubLObject)$ic3$);
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                if (NIL != var65) {
                    module0642.f39020(module0015.$g178$.getGlobalValue());
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                    module0642.f39020(var65);
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                }
                module0642.f39020(module0015.$g177$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                module0642.f39020((SubLObject)$ic4$);
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                if (NIL != var63) {
                    module0642.f39029((SubLObject)UNPROVIDED);
                    module0642.f39020(module0015.$g173$.getGlobalValue());
                    module0642.f39019(var63);
                    module0642.f39020(module0015.$g174$.getGlobalValue());
                }
                module0016.f941();
                module0642.f39020(module0015.$g154$.getGlobalValue());
                module0642.f39029((SubLObject)UNPROVIDED);
                final SubLObject var4_59 = module0015.$g535$.currentBinding(var52);
                try {
                    module0015.$g535$.bind((SubLObject)T, var52);
                    module0642.f39020(module0015.$g133$.getGlobalValue());
                    if (NIL != module0015.$g132$.getDynamicValue(var52)) {
                        module0642.f39020(module0015.$g135$.getGlobalValue());
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                        module0642.f39020(module0642.f39042(module0015.$g132$.getDynamicValue(var52)));
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                    }
                    module0642.f39020(module0015.$g137$.getGlobalValue());
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                    module0642.f39020((SubLObject)$ic7$);
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                    module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                    final SubLObject var4_60 = module0015.$g533$.currentBinding(var52);
                    try {
                        module0015.$g533$.bind((SubLObject)T, var52);
                        module0642.f39020(module0015.$g144$.getGlobalValue());
                        module0642.f39020(module0015.$g157$.getGlobalValue());
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                        module0642.f39020((SubLObject)$ic8$);
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                        final SubLObject var4_61 = module0015.$g533$.currentBinding(var52);
                        try {
                            module0015.$g533$.bind((SubLObject)T, var52);
                            module0642.f39020(module0015.$g295$.getGlobalValue());
                            module0642.f39020(module0015.$g305$.getGlobalValue());
                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                            module0642.f39020((SubLObject)$ic9$);
                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                            module0642.f39020(module0015.$g302$.getGlobalValue());
                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                            module0642.f39020((SubLObject)$ic10$);
                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                            module0642.f39020(module0015.$g307$.getGlobalValue());
                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                            module0642.f39019((SubLObject)$ic28$);
                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                            module0642.f39020(module0015.$g160$.getGlobalValue());
                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                            module0642.f39020((SubLObject)$ic29$);
                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                        }
                        finally {
                            module0015.$g533$.rebind(var4_61, var52);
                        }
                        module0642.f39020(module0015.$g145$.getGlobalValue());
                        module0669.f40722(var58);
                        module0642.f39026((SubLObject)TWO_INTEGER);
                        f40340(var58, var59, var60, var61);
                        module0642.f39029((SubLObject)UNPROVIDED);
                        module0642.f39050();
                    }
                    finally {
                        module0015.$g533$.rebind(var4_60, var52);
                    }
                    module0642.f39020(module0015.$g134$.getGlobalValue());
                    module0642.f39029((SubLObject)UNPROVIDED);
                }
                finally {
                    module0015.$g535$.rebind(var4_59, var52);
                }
                module0642.f39020(module0015.$g156$.getGlobalValue());
                module0642.f39029((SubLObject)UNPROVIDED);
            }
            finally {
                module0015.$g538$.rebind(var64, var52);
            }
        }
        else {
            cdestructuring_bind.cdestructuring_bind_error(var51, (SubLObject)$ic52$);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f40352(final SubLObject var1, final SubLObject var48, SubLObject var47, SubLObject var58, SubLObject var50) {
        if (var47 == UNPROVIDED) {
            var47 = (SubLObject)NIL;
        }
        if (var58 == UNPROVIDED) {
            var58 = (SubLObject)NIL;
        }
        if (var50 == UNPROVIDED) {
            var50 = (SubLObject)NIL;
        }
        final SubLThread var59 = SubLProcess.currentSubLThread();
        final SubLObject var60 = module0656.f39832((SubLObject)$ic59$);
        module0642.f39020(module0015.$g381$.getGlobalValue());
        module0642.f39020(module0015.$g383$.getGlobalValue());
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        module0655.f39768();
        PrintLow.format(module0015.$g131$.getDynamicValue(var59), (SubLObject)$ic60$, module0656.f39931(var1));
        if (NIL != var47) {
            PrintLow.format(module0015.$g131$.getDynamicValue(var59), (SubLObject)$ic61$, var47);
            if (NIL != var58) {
                PrintLow.format(module0015.$g131$.getDynamicValue(var59), (SubLObject)$ic61$, module0656.f39842(var58));
                if (NIL != var50) {
                    PrintLow.format(module0015.$g131$.getDynamicValue(var59), (SubLObject)$ic61$, module0656.f39934(var50));
                }
            }
        }
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        if (NIL != var60) {
            module0642.f39020(module0015.$g387$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
            module0642.f39020(var60);
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        }
        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
        final SubLObject var61 = module0015.$g533$.currentBinding(var59);
        try {
            module0015.$g533$.bind((SubLObject)T, var59);
            if (NIL != var50) {
                module0656.f39964(var50);
            }
            else if (NIL != var58) {
                module0642.f39019(module0656.f39941(var58));
            }
            else if (NIL != var47) {
                PrintLow.format(module0015.$g131$.getDynamicValue(var59), (SubLObject)$ic62$, var47);
            }
            else {
                PrintLow.format(module0015.$g131$.getDynamicValue(var59), (SubLObject)$ic63$);
            }
        }
        finally {
            module0015.$g533$.rebind(var61, var59);
        }
        module0642.f39020(module0015.$g382$.getGlobalValue());
        if (var48.numG((SubLObject)ONE_INTEGER)) {
            PrintLow.format(module0015.$g131$.getDynamicValue(var59), (SubLObject)$ic64$, var48);
        }
        return var1;
    }
    
    public static SubLObject f40340(final SubLObject var1, final SubLObject var47, final SubLObject var58, final SubLObject var50) {
        final SubLThread var59 = SubLProcess.currentSubLThread();
        final SubLObject var60 = module0655.$g5125$.currentBinding(var59);
        final SubLObject var61 = module0656.$g5172$.currentBinding(var59);
        final SubLObject var62 = module0580.$g4361$.currentBinding(var59);
        try {
            module0655.$g5125$.bind((SubLObject)NIL, var59);
            module0656.$g5172$.bind(module0661.f40305(), var59);
            module0580.$g4361$.bind((SubLObject)NIL, var59);
            var59.resetMultipleValues();
            final SubLObject var4_63 = module0580.$g4362$.currentBinding(var59);
            try {
                module0580.$g4362$.bind(module0580.f35560(), var59);
                final SubLObject var63 = var59.secondMultipleValue();
                var59.resetMultipleValues();
                try {
                    var59.resetMultipleValues();
                    final SubLObject var4_64 = module0580.$g4358$.currentBinding(var59);
                    try {
                        module0580.$g4358$.bind(module0580.f35544(), var59);
                        final SubLObject var64 = var59.secondMultipleValue();
                        var59.resetMultipleValues();
                        final SubLObject var4_65 = module0580.$g4359$.currentBinding(var59);
                        try {
                            module0580.$g4359$.bind(module0580.f35545(), var59);
                            final SubLObject var65 = module0580.$g4358$.getDynamicValue(var59);
                            final SubLObject var4_66 = module0034.$g879$.currentBinding(var59);
                            try {
                                module0034.$g879$.bind(var65, var59);
                                SubLObject var66 = (SubLObject)NIL;
                                if (NIL != var65 && NIL == module0034.f1842(var65)) {
                                    var66 = module0034.f1869(var65);
                                    final SubLObject var67 = Threads.current_process();
                                    if (NIL == var66) {
                                        module0034.f1873(var65, var67);
                                    }
                                    else if (!var66.eql(var67)) {
                                        Errors.error((SubLObject)$ic66$);
                                    }
                                }
                                try {
                                    final SubLObject var4_67 = module0579.$g4260$.currentBinding(var59);
                                    final SubLObject var11_73 = module0579.$g4259$.currentBinding(var59);
                                    try {
                                        module0579.$g4260$.bind(module0677.f41312(), var59);
                                        module0579.$g4259$.bind((SubLObject)$ic67$, var59);
                                        if (NIL == var47) {
                                            f40353(var1);
                                        }
                                        else if (NIL == var58) {
                                            f40354(var1, var47);
                                        }
                                        else {
                                            module0669.f40724(var47);
                                            if (NIL == var50) {
                                                f40338(var1, var47, var58);
                                            }
                                            else {
                                                final SubLObject var4_68 = module0655.$g5126$.currentBinding(var59);
                                                try {
                                                    module0655.$g5126$.bind((SubLObject)makeBoolean(NIL != module0655.$g5126$.getDynamicValue(var59) && var47.eql((SubLObject)ONE_INTEGER)), var59);
                                                    if (NIL != module0655.$g5126$.getDynamicValue(var59)) {
                                                        final SubLObject var4_69 = module0147.$g2094$.currentBinding(var59);
                                                        final SubLObject var11_74 = module0147.$g2095$.currentBinding(var59);
                                                        try {
                                                            module0147.$g2094$.bind((SubLObject)$ic44$, var59);
                                                            module0147.$g2095$.bind($ic45$, var59);
                                                            module0655.$g5126$.setDynamicValue(module0225.f14781(var58), var59);
                                                        }
                                                        finally {
                                                            module0147.$g2095$.rebind(var11_74, var59);
                                                            module0147.$g2094$.rebind(var4_69, var59);
                                                        }
                                                    }
                                                    module0669.f40762(var1, var47, var58, var50);
                                                }
                                                finally {
                                                    module0655.$g5126$.rebind(var4_68, var59);
                                                }
                                            }
                                        }
                                    }
                                    finally {
                                        module0579.$g4259$.rebind(var11_73, var59);
                                        module0579.$g4260$.rebind(var4_67, var59);
                                    }
                                }
                                finally {
                                    final SubLObject var4_70 = Threads.$is_thread_performing_cleanupP$.currentBinding(var59);
                                    try {
                                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)T, var59);
                                        if (NIL != var65 && NIL == var66) {
                                            module0034.f1873(var65, (SubLObject)NIL);
                                        }
                                    }
                                    finally {
                                        Threads.$is_thread_performing_cleanupP$.rebind(var4_70, var59);
                                    }
                                }
                            }
                            finally {
                                module0034.$g879$.rebind(var4_66, var59);
                            }
                        }
                        finally {
                            module0580.$g4359$.rebind(var4_65, var59);
                        }
                        if (var64 == $ic68$ && NIL != module0034.f1839(module0580.$g4358$.getDynamicValue(var59))) {
                            module0034.f1891(module0580.$g4358$.getDynamicValue(var59));
                        }
                    }
                    finally {
                        module0580.$g4358$.rebind(var4_64, var59);
                    }
                }
                finally {
                    final SubLObject var4_71 = Threads.$is_thread_performing_cleanupP$.currentBinding(var59);
                    try {
                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)T, var59);
                        if (NIL == var63) {
                            module0580.f35554(module0580.$g4362$.getDynamicValue(var59));
                        }
                    }
                    finally {
                        Threads.$is_thread_performing_cleanupP$.rebind(var4_71, var59);
                    }
                }
            }
            finally {
                module0580.$g4362$.rebind(var4_63, var59);
            }
        }
        finally {
            module0580.$g4361$.rebind(var62, var59);
            module0656.$g5172$.rebind(var61, var59);
            module0655.$g5125$.rebind(var60, var59);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f40353(final SubLObject var1) {
        SubLObject var2 = (SubLObject)NIL;
        SubLObject var4;
        final SubLObject var3 = var4 = f40346(var1, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        SubLObject var5 = (SubLObject)NIL;
        var5 = var4.first();
        while (NIL != var4) {
            if (NIL != var2) {
                module0642.f39051((SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
            }
            f40354(var1, var5);
            var2 = (SubLObject)T;
            var4 = var4.rest();
            var5 = var4.first();
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f40354(final SubLObject var1, final SubLObject var47) {
        module0669.f40724(var47);
        final SubLObject var48 = f40346(var1, var47, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        module0655.$g5125$.setDynamicValue((SubLObject)NIL);
        SubLObject var49 = var48;
        SubLObject var50 = (SubLObject)NIL;
        var50 = var49.first();
        while (NIL != var49) {
            f40338(var1, var47, var50);
            var49 = var49.rest();
            var50 = var49.first();
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f40338(final SubLObject var1, final SubLObject var47, final SubLObject var58) {
        final SubLThread var59 = SubLProcess.currentSubLThread();
        final SubLObject var60 = module0655.$g5126$.currentBinding(var59);
        try {
            module0655.$g5126$.bind((SubLObject)makeBoolean(NIL != module0655.$g5126$.getDynamicValue(var59) && var47.eql((SubLObject)ONE_INTEGER)), var59);
            final SubLObject var61 = f40346(var1, var47, var58, (SubLObject)UNPROVIDED);
            if (NIL != module0655.$g5126$.getDynamicValue(var59)) {
                final SubLObject var4_81 = module0147.$g2094$.currentBinding(var59);
                final SubLObject var62 = module0147.$g2095$.currentBinding(var59);
                try {
                    module0147.$g2094$.bind((SubLObject)$ic44$, var59);
                    module0147.$g2095$.bind($ic45$, var59);
                    module0655.$g5126$.setDynamicValue(module0225.f14781(var58), var59);
                }
                finally {
                    module0147.$g2095$.rebind(var62, var59);
                    module0147.$g2094$.rebind(var4_81, var59);
                }
            }
            SubLObject var63 = var61;
            SubLObject var64 = (SubLObject)NIL;
            var64 = var63.first();
            while (NIL != var63) {
                module0669.f40762(var1, var47, var58, var64);
                var63 = var63.rest();
                var64 = var63.first();
            }
        }
        finally {
            module0655.$g5126$.rebind(var60, var59);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f40355(final SubLObject var82, final SubLObject var24, final SubLObject var50) {
        if (NIL != var50) {
            return (SubLObject)makeBoolean(NIL != var82 && NIL != var24);
        }
        if (NIL != var24) {
            return module0035.sublisp_boolean(var82);
        }
        return (SubLObject)T;
    }
    
    public static SubLObject f40346(final SubLObject var18, SubLObject var82, SubLObject var24, SubLObject var50) {
        if (var82 == UNPROVIDED) {
            var82 = (SubLObject)NIL;
        }
        if (var24 == UNPROVIDED) {
            var24 = (SubLObject)NIL;
        }
        if (var50 == UNPROVIDED) {
            var50 = (SubLObject)NIL;
        }
        final SubLThread var83 = SubLProcess.currentSubLThread();
        if (NIL == f40355(var82, var24, var50)) {
            Errors.error((SubLObject)$ic69$, var82, var24, var50);
        }
        SubLObject var84 = (SubLObject)NIL;
        if (NIL == var82) {
            if (NIL != var50) {
                final SubLObject var85 = var50;
                final SubLObject var86 = module0147.$g2094$.currentBinding(var83);
                final SubLObject var87 = module0147.$g2095$.currentBinding(var83);
                try {
                    module0147.$g2094$.bind(module0147.f9536(var85), var83);
                    module0147.$g2095$.bind(module0147.f9537(var85), var83);
                    SubLObject var88 = module0205.f13183(var18, (SubLObject)$ic70$, (SubLObject)NIL, Symbols.symbol_function((SubLObject)EQUAL), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                    if (NIL != module0212.f13762(var24)) {
                        var88 = (SubLObject)ConsesLow.cons(var24, var88);
                    }
                    SubLObject var89 = module0218.f14453(var88, (SubLObject)UNPROVIDED);
                    SubLObject var90 = (SubLObject)NIL;
                    var90 = var89.first();
                    while (NIL != var89) {
                        if ((NIL == var24 || var24.equal(module0205.f13136(module0178.f11303(var90)))) && NIL != module0202.f12962(var18, module0178.f11303(var90))) {
                            var84 = (SubLObject)ConsesLow.cons(module0202.f12962(var18, module0178.f11303(var90)), var84);
                        }
                        var89 = var89.rest();
                        var90 = var89.first();
                    }
                }
                finally {
                    module0147.$g2095$.rebind(var87, var83);
                    module0147.$g2094$.rebind(var86, var83);
                }
            }
            else {
                final SubLObject var91 = module0147.$g2094$.currentBinding(var83);
                final SubLObject var92 = module0147.$g2095$.currentBinding(var83);
                try {
                    module0147.$g2094$.bind((SubLObject)$ic44$, var83);
                    module0147.$g2095$.bind($ic45$, var83);
                    SubLObject var93 = module0205.f13183(var18, (SubLObject)$ic70$, (SubLObject)NIL, Symbols.symbol_function((SubLObject)EQUAL), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                    if (NIL != module0212.f13762(var24)) {
                        var93 = (SubLObject)ConsesLow.cons(var24, var93);
                    }
                    SubLObject var94 = module0218.f14453(var93, (SubLObject)UNPROVIDED);
                    SubLObject var95 = (SubLObject)NIL;
                    var95 = var94.first();
                    while (NIL != var94) {
                        if ((NIL == var24 || var24.equal(module0205.f13136(module0178.f11303(var95)))) && NIL != module0202.f12962(var18, module0178.f11303(var95))) {
                            var84 = (SubLObject)ConsesLow.cons(module0202.f12962(var18, module0178.f11303(var95)), var84);
                        }
                        var94 = var94.rest();
                        var95 = var94.first();
                    }
                }
                finally {
                    module0147.$g2095$.rebind(var92, var83);
                    module0147.$g2094$.rebind(var91, var83);
                }
            }
        }
        else if (NIL == var24) {
            if (NIL != var50) {
                final SubLObject var85 = var50;
                final SubLObject var86 = module0147.$g2094$.currentBinding(var83);
                final SubLObject var87 = module0147.$g2095$.currentBinding(var83);
                try {
                    module0147.$g2094$.bind(module0147.f9536(var85), var83);
                    module0147.$g2095$.bind(module0147.f9537(var85), var83);
                    SubLObject var88 = module0205.f13183(var18, (SubLObject)$ic70$, (SubLObject)NIL, Symbols.symbol_function((SubLObject)EQUAL), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                    if (NIL != module0212.f13762((SubLObject)NIL)) {
                        var88 = (SubLObject)ConsesLow.cons((SubLObject)NIL, var88);
                    }
                    SubLObject var89 = module0218.f14453(var88, (SubLObject)UNPROVIDED);
                    SubLObject var90 = (SubLObject)NIL;
                    var90 = var89.first();
                    while (NIL != var89) {
                        if (NIL != ((NIL != var82) ? Equality.equal(var18, module0205.f13134(module0178.f11303(var90), var82, (SubLObject)UNPROVIDED)) : module0202.f12962(var18, module0178.f11303(var90)))) {
                            var84 = (SubLObject)ConsesLow.cons(module0205.f13136(module0178.f11303(var90)), var84);
                        }
                        var89 = var89.rest();
                        var90 = var89.first();
                    }
                }
                finally {
                    module0147.$g2095$.rebind(var87, var83);
                    module0147.$g2094$.rebind(var86, var83);
                }
            }
            else {
                final SubLObject var91 = module0147.$g2094$.currentBinding(var83);
                final SubLObject var92 = module0147.$g2095$.currentBinding(var83);
                try {
                    module0147.$g2094$.bind((SubLObject)$ic44$, var83);
                    module0147.$g2095$.bind($ic45$, var83);
                    SubLObject var93 = module0205.f13183(var18, (SubLObject)$ic70$, (SubLObject)NIL, Symbols.symbol_function((SubLObject)EQUAL), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                    if (NIL != module0212.f13762((SubLObject)NIL)) {
                        var93 = (SubLObject)ConsesLow.cons((SubLObject)NIL, var93);
                    }
                    SubLObject var94 = module0218.f14453(var93, (SubLObject)UNPROVIDED);
                    SubLObject var95 = (SubLObject)NIL;
                    var95 = var94.first();
                    while (NIL != var94) {
                        if (NIL != ((NIL != var82) ? Equality.equal(var18, module0205.f13134(module0178.f11303(var95), var82, (SubLObject)UNPROVIDED)) : module0202.f12962(var18, module0178.f11303(var95)))) {
                            var84 = (SubLObject)ConsesLow.cons(module0205.f13136(module0178.f11303(var95)), var84);
                        }
                        var94 = var94.rest();
                        var95 = var94.first();
                    }
                }
                finally {
                    module0147.$g2095$.rebind(var92, var83);
                    module0147.$g2094$.rebind(var91, var83);
                }
            }
        }
        else if (NIL == var50) {
            final SubLObject var91 = module0147.$g2094$.currentBinding(var83);
            final SubLObject var92 = module0147.$g2095$.currentBinding(var83);
            try {
                module0147.$g2094$.bind((SubLObject)$ic44$, var83);
                module0147.$g2095$.bind($ic45$, var83);
                SubLObject var93 = module0205.f13183(var18, (SubLObject)$ic70$, (SubLObject)NIL, Symbols.symbol_function((SubLObject)EQUAL), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                if (NIL != module0212.f13762(var24)) {
                    var93 = (SubLObject)ConsesLow.cons(var24, var93);
                }
                SubLObject var94 = module0218.f14453(var93, (SubLObject)UNPROVIDED);
                SubLObject var95 = (SubLObject)NIL;
                var95 = var94.first();
                while (NIL != var94) {
                    if ((NIL == var24 || var24.equal(module0205.f13136(module0178.f11303(var95)))) && NIL != ((NIL != var82) ? Equality.equal(var18, module0205.f13134(module0178.f11303(var95), var82, (SubLObject)UNPROVIDED)) : module0202.f12962(var18, module0178.f11303(var95)))) {
                        var84 = (SubLObject)ConsesLow.cons(module0178.f11287(var95), var84);
                    }
                    var94 = var94.rest();
                    var95 = var94.first();
                }
            }
            finally {
                module0147.$g2095$.rebind(var92, var83);
                module0147.$g2094$.rebind(var91, var83);
            }
        }
        var84 = Sequences.nreverse(module0035.f2269(var84, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED));
        if (NIL == var82) {
            var84 = module0656.f39830(var84);
        }
        else if (NIL == var24) {
            var84 = module0656.f39826(var18, var84, (SubLObject)UNPROVIDED);
        }
        else if (NIL == var50) {
            var84 = module0656.f39827(var84);
        }
        return var84;
    }
    
    public static SubLObject f40345(final SubLObject var18, SubLObject var82, SubLObject var24, SubLObject var50) {
        if (var82 == UNPROVIDED) {
            var82 = (SubLObject)NIL;
        }
        if (var24 == UNPROVIDED) {
            var24 = (SubLObject)NIL;
        }
        if (var50 == UNPROVIDED) {
            var50 = (SubLObject)NIL;
        }
        final SubLThread var83 = SubLProcess.currentSubLThread();
        if (NIL == f40355(var82, var24, var50)) {
            Errors.error((SubLObject)$ic69$, var82, var24, var50);
        }
        SubLObject var84 = (SubLObject)ZERO_INTEGER;
        if (NIL != var50) {
            final SubLObject var85 = var50;
            final SubLObject var86 = module0147.$g2094$.currentBinding(var83);
            final SubLObject var87 = module0147.$g2095$.currentBinding(var83);
            try {
                module0147.$g2094$.bind(module0147.f9536(var85), var83);
                module0147.$g2095$.bind(module0147.f9537(var85), var83);
                SubLObject var88 = module0205.f13183(var18, (SubLObject)$ic70$, (SubLObject)NIL, Symbols.symbol_function((SubLObject)EQUAL), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                if (NIL != module0212.f13762(var24)) {
                    var88 = (SubLObject)ConsesLow.cons(var24, var88);
                }
                SubLObject var89 = module0218.f14453(var88, (SubLObject)UNPROVIDED);
                SubLObject var90 = (SubLObject)NIL;
                var90 = var89.first();
                while (NIL != var89) {
                    if ((NIL == var24 || var24.equal(module0205.f13136(module0178.f11303(var90)))) && NIL != ((NIL != var82) ? Equality.equal(var18, module0205.f13134(module0178.f11303(var90), var82, (SubLObject)UNPROVIDED)) : module0202.f12962(var18, module0178.f11303(var90)))) {
                        var84 = Numbers.add(var84, (SubLObject)ONE_INTEGER);
                    }
                    var89 = var89.rest();
                    var90 = var89.first();
                }
            }
            finally {
                module0147.$g2095$.rebind(var87, var83);
                module0147.$g2094$.rebind(var86, var83);
            }
        }
        else {
            final SubLObject var91 = module0147.$g2094$.currentBinding(var83);
            final SubLObject var92 = module0147.$g2095$.currentBinding(var83);
            try {
                module0147.$g2094$.bind((SubLObject)$ic44$, var83);
                module0147.$g2095$.bind($ic45$, var83);
                SubLObject var93 = module0205.f13183(var18, (SubLObject)$ic70$, (SubLObject)NIL, Symbols.symbol_function((SubLObject)EQUAL), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                if (NIL != module0212.f13762(var24)) {
                    var93 = (SubLObject)ConsesLow.cons(var24, var93);
                }
                SubLObject var94 = module0218.f14453(var93, (SubLObject)UNPROVIDED);
                SubLObject var95 = (SubLObject)NIL;
                var95 = var94.first();
                while (NIL != var94) {
                    if ((NIL == var24 || var24.equal(module0205.f13136(module0178.f11303(var95)))) && NIL != ((NIL != var82) ? Equality.equal(var18, module0205.f13134(module0178.f11303(var95), var82, (SubLObject)UNPROVIDED)) : module0202.f12962(var18, module0178.f11303(var95)))) {
                        var84 = Numbers.add(var84, (SubLObject)ONE_INTEGER);
                    }
                    var94 = var94.rest();
                    var95 = var94.first();
                }
            }
            finally {
                module0147.$g2095$.rebind(var92, var83);
                module0147.$g2094$.rebind(var91, var83);
            }
        }
        return var84;
    }
    
    public static SubLObject f40356(final SubLObject var51) {
        final SubLThread var52 = SubLProcess.currentSubLThread();
        SubLObject var53 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var51, var51, (SubLObject)$ic71$);
        var53 = var51.first();
        final SubLObject var54 = var51.rest();
        if (NIL == var54) {
            final SubLObject var55 = module0656.f39950(var53, (SubLObject)UNPROVIDED);
            if (NIL == module0210.f13595(var55, (SubLObject)UNPROVIDED)) {
                return module0656.f39789((SubLObject)$ic53$, var53, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
            }
            final SubLObject var57;
            final SubLObject var56 = var57 = PrintLow.format((SubLObject)NIL, (SubLObject)$ic72$, var55);
            final SubLObject var58 = module0015.$g538$.currentBinding(var52);
            try {
                module0015.$g538$.bind((NIL != module0057.f4158(module0015.$g538$.getDynamicValue(var52))) ? module0015.$g538$.getDynamicValue(var52) : module0057.f4173((SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED), var52);
                module0642.f39020((SubLObject)$ic1$);
                module0642.f39029((SubLObject)UNPROVIDED);
                module0642.f39020(module0015.$g155$.getGlobalValue());
                module0642.f39020(module0015.$g153$.getGlobalValue());
                module0015.f718();
                module0655.f39766();
                module0642.f39064(module0655.$g5143$.getDynamicValue(var52), module0655.$g5142$.getDynamicValue(var52));
                final SubLObject var59 = module0014.f672((SubLObject)$ic2$);
                module0642.f39029((SubLObject)UNPROVIDED);
                module0642.f39020(module0015.$g175$.getGlobalValue());
                module0642.f39020(module0015.$g176$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                module0642.f39020((SubLObject)$ic3$);
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                if (NIL != var59) {
                    module0642.f39020(module0015.$g178$.getGlobalValue());
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                    module0642.f39020(var59);
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                }
                module0642.f39020(module0015.$g177$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                module0642.f39020((SubLObject)$ic4$);
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                if (NIL != var57) {
                    module0642.f39029((SubLObject)UNPROVIDED);
                    module0642.f39020(module0015.$g173$.getGlobalValue());
                    module0642.f39019(var57);
                    module0642.f39020(module0015.$g174$.getGlobalValue());
                }
                module0016.f941();
                module0642.f39020(module0015.$g154$.getGlobalValue());
                module0642.f39029((SubLObject)UNPROVIDED);
                final SubLObject var4_89 = module0015.$g535$.currentBinding(var52);
                try {
                    module0015.$g535$.bind((SubLObject)T, var52);
                    module0642.f39020(module0015.$g133$.getGlobalValue());
                    if (NIL != module0015.$g132$.getDynamicValue(var52)) {
                        module0642.f39020(module0015.$g135$.getGlobalValue());
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                        module0642.f39020(module0642.f39042(module0015.$g132$.getDynamicValue(var52)));
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                    }
                    module0642.f39020(module0015.$g137$.getGlobalValue());
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                    module0642.f39020((SubLObject)$ic7$);
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                    module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                    final SubLObject var4_90 = module0015.$g533$.currentBinding(var52);
                    try {
                        module0015.$g533$.bind((SubLObject)T, var52);
                        module0642.f39020(module0015.$g144$.getGlobalValue());
                        module0642.f39020(module0015.$g157$.getGlobalValue());
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                        module0642.f39020((SubLObject)$ic8$);
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                        final SubLObject var4_91 = module0015.$g533$.currentBinding(var52);
                        try {
                            module0015.$g533$.bind((SubLObject)T, var52);
                            module0642.f39020(module0015.$g295$.getGlobalValue());
                            module0642.f39020(module0015.$g305$.getGlobalValue());
                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                            module0642.f39020((SubLObject)$ic9$);
                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                            module0642.f39020(module0015.$g302$.getGlobalValue());
                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                            module0642.f39020((SubLObject)$ic10$);
                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                            module0642.f39020(module0015.$g307$.getGlobalValue());
                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                            module0642.f39019((SubLObject)$ic28$);
                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                            module0642.f39020(module0015.$g160$.getGlobalValue());
                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                            module0642.f39020((SubLObject)$ic29$);
                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                        }
                        finally {
                            module0015.$g533$.rebind(var4_91, var52);
                        }
                        module0642.f39020(module0015.$g145$.getGlobalValue());
                        module0669.f40722(var55);
                        module0642.f39026((SubLObject)TWO_INTEGER);
                        f40341(var55);
                        module0642.f39029((SubLObject)UNPROVIDED);
                        module0642.f39050();
                    }
                    finally {
                        module0015.$g533$.rebind(var4_90, var52);
                    }
                    module0642.f39020(module0015.$g134$.getGlobalValue());
                    module0642.f39029((SubLObject)UNPROVIDED);
                }
                finally {
                    module0015.$g535$.rebind(var4_89, var52);
                }
                module0642.f39020(module0015.$g156$.getGlobalValue());
                module0642.f39029((SubLObject)UNPROVIDED);
            }
            finally {
                module0015.$g538$.rebind(var58, var52);
            }
        }
        else {
            cdestructuring_bind.cdestructuring_bind_error(var51, (SubLObject)$ic71$);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f40357(final SubLObject var1, final SubLObject var48) {
        final SubLThread var49 = SubLProcess.currentSubLThread();
        final SubLObject var50 = module0656.f39832((SubLObject)$ic59$);
        module0642.f39020(module0015.$g381$.getGlobalValue());
        module0642.f39020(module0015.$g383$.getGlobalValue());
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        module0655.f39768();
        PrintLow.format(module0015.$g131$.getDynamicValue(var49), (SubLObject)$ic74$, module0656.f39844(var1));
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        if (NIL != var50) {
            module0642.f39020(module0015.$g387$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
            module0642.f39020(var50);
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        }
        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
        final SubLObject var51 = module0015.$g533$.currentBinding(var49);
        try {
            module0015.$g533$.bind((SubLObject)T, var49);
            module0642.f39019((SubLObject)$ic75$);
        }
        finally {
            module0015.$g533$.rebind(var51, var49);
        }
        module0642.f39020(module0015.$g382$.getGlobalValue());
        if (var48.numG((SubLObject)ONE_INTEGER)) {
            PrintLow.format(module0015.$g131$.getDynamicValue(var49), (SubLObject)$ic64$, var48);
        }
        return var1;
    }
    
    public static SubLObject f40341(final SubLObject var1) {
        final SubLThread var2 = SubLProcess.currentSubLThread();
        final SubLObject var3 = module0656.$g5172$.currentBinding(var2);
        try {
            module0656.$g5172$.bind(module0661.f40305(), var2);
            if (f40350(var1, (SubLObject)UNPROVIDED).numG((SubLObject)ZERO_INTEGER)) {
                module0642.f39020(module0015.$g234$.getGlobalValue());
                module0642.f39020(module0015.$g207$.getGlobalValue());
                module0642.f39020(module0015.$g459$.getGlobalValue());
                module0642.f39019((SubLObject)$ic77$);
                module0642.f39020(module0015.$g460$.getGlobalValue());
                module0642.f39020(module0015.$g208$.getGlobalValue());
                module0642.f39020(module0015.$g235$.getGlobalValue());
                module0642.f39026((SubLObject)TWO_INTEGER);
                final SubLObject var4 = (NIL != module0669.f40692(var1)) ? Symbols.symbol_function((SubLObject)$ic78$) : Symbols.symbol_function((SubLObject)$ic80$);
                final SubLObject var4_93 = module0655.$g5129$.currentBinding(var2);
                final SubLObject var5 = module0655.$g5130$.currentBinding(var2);
                final SubLObject var6 = module0147.$g2094$.currentBinding(var2);
                final SubLObject var7 = module0147.$g2095$.currentBinding(var2);
                try {
                    module0655.$g5129$.bind((SubLObject)NIL, var2);
                    module0655.$g5130$.bind((SubLObject)NIL, var2);
                    module0147.$g2094$.bind((SubLObject)$ic44$, var2);
                    module0147.$g2095$.bind($ic45$, var2);
                    f40358(var4, var1, (SubLObject)NIL);
                }
                finally {
                    module0147.$g2095$.rebind(var7, var2);
                    module0147.$g2094$.rebind(var6, var2);
                    module0655.$g5130$.rebind(var5, var2);
                    module0655.$g5129$.rebind(var4_93, var2);
                }
            }
        }
        finally {
            module0656.$g5172$.rebind(var3, var2);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f40358(final SubLObject var22, final SubLObject var18, final SubLObject var95) {
        module0213.f13999(var22, var18, var95);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f40350(final SubLObject var18, SubLObject var95) {
        if (var95 == UNPROVIDED) {
            var95 = (SubLObject)NIL;
        }
        SubLObject var96 = (SubLObject)ZERO_INTEGER;
        final SubLObject var97 = module0205.f13183(var18, (SubLObject)$ic70$, (SubLObject)NIL, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        SubLObject var98 = module0218.f14453(var97, (SubLObject)UNPROVIDED);
        SubLObject var99 = (SubLObject)NIL;
        var99 = var98.first();
        while (NIL != var98) {
            if ((NIL == var95 || NIL != module0178.f11343(var99, var95)) && NIL == module0202.f12962(var18, module0178.f11303(var99)) && (NIL != module0205.f13220(var18, module0178.f11303(var99), (SubLObject)T, Symbols.symbol_function((SubLObject)EQUAL), (SubLObject)UNPROVIDED) || NIL != module0205.f13220(var18, module0178.f11287(var99), (SubLObject)T, Symbols.symbol_function((SubLObject)EQUAL), (SubLObject)UNPROVIDED))) {
                var96 = Numbers.add(var96, (SubLObject)ONE_INTEGER);
            }
            var98 = var98.rest();
            var99 = var98.first();
        }
        return var96;
    }
    
    public static SubLObject f40359() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0663", "f40325", "S#44192", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0663", "f40327", "S#44419", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0663", "f40326", "S#44420", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0663", "f40328", "S#44193", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0663", "f40329", "S#44421", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0663", "f40332", "S#44422", 2, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0663", "f40331", "S#44423", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0663", "f40333", "S#44424", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0663", "f40334", "S#44425", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0663", "f40335", "S#44426", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0663", "f40336", "S#44427", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0663", "f40337", "S#44428", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0663", "f40330", "S#44429", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0663", "f40339", "S#44430", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0663", "f40342", "S#44431", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0663", "f40343", "S#44432", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0663", "f40347", "S#44433", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0663", "f40348", "S#44434", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0663", "f40349", "S#44435", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0663", "f40344", "S#44436", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0663", "f40351", "CB-C-GAF-ARG-NAUT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0663", "f40352", "S#44437", 2, 3, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0663", "f40340", "S#44438", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0663", "f40353", "S#44439", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0663", "f40354", "S#44440", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0663", "f40338", "S#44441", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0663", "f40355", "S#44442", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0663", "f40346", "S#44443", 1, 3, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0663", "f40345", "S#44444", 1, 3, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0663", "f40356", "CB-C-OTHER-NAUT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0663", "f40357", "S#44445", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0663", "f40341", "S#44446", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0663", "f40358", "S#44447", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0663", "f40350", "S#44448", 1, 1, false);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f40360() {
        return (SubLObject)NIL;
    }
    
    public static SubLObject f40361() {
        module0015.f873((SubLObject)$ic58$);
        module0656.f39840((SubLObject)$ic50$, (SubLObject)$ic65$, (SubLObject)FIVE_INTEGER);
        module0015.f873((SubLObject)$ic73$);
        module0656.f39840((SubLObject)$ic51$, (SubLObject)$ic76$, (SubLObject)TWO_INTEGER);
        return (SubLObject)NIL;
    }
    
    public void declareFunctions() {
        f40359();
    }
    
    public void initializeVariables() {
        f40360();
    }
    
    public void runTopLevelForms() {
        f40361();
    }
    
    static {
        me = (SubLFile)new module0663();
        $ic0$ = makeString("NAUT");
        $ic1$ = makeString("<!DOCTYPE html PUBLIC \"-//W3C//DTD XHTML 1.0 Transitional//EN\" \"http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd\">");
        $ic2$ = makeKeyword("CB-CYC");
        $ic3$ = makeString("stylesheet");
        $ic4$ = makeString("text/css");
        $ic5$ = makeKeyword("SHA1");
        $ic6$ = makeString("text/javascript");
        $ic7$ = makeString("yui-skin-sam");
        $ic8$ = makeString("reloadFrameButton");
        $ic9$ = makeString("button");
        $ic10$ = makeString("reload");
        $ic11$ = makeString("Refresh Frames");
        $ic12$ = makeSymbol("S#44179", "CYC");
        $ic13$ = makeKeyword("CYCL");
        $ic14$ = makeKeyword("DOCUMENTATION");
        $ic15$ = makeKeyword("DEFINITIONAL");
        $ic16$ = makeKeyword("HANDLER");
        $ic17$ = makeSymbol("CB-C-PERTINENT-QUERY-LINKS");
        $ic18$ = makeKeyword("ARGS");
        $ic19$ = makeString("term");
        $ic20$ = makeKeyword("MESSAGE");
        $ic21$ = makeString("Checking for Pertinent Queries...");
        $ic22$ = makeKeyword("TAG");
        $ic23$ = makeString("div");
        $ic24$ = makeKeyword("DELAY");
        $ic25$ = makeInteger(50);
        $ic26$ = makeKeyword("NONE");
        $ic27$ = makeString("Definitional and Documentation Info for ~S");
        $ic28$ = makeString("Refresh");
        $ic29$ = makeString("reloadCurrentFrame('reloadFrameButton');");
        $ic30$ = makeString("Documentation for NAUT: ");
        $ic31$ = makeString(" : ");
        $ic32$ = makeString("Derived SBHL Assertions:");
        $ic33$ = makeString("Mt: ");
        $ic34$ = constant_handles_oc.f8479((SubLObject)makeString("UniversalVocabularyMt"));
        $ic35$ = constant_handles_oc.f8479((SubLObject)makeString("isa"));
        $ic36$ = constant_handles_oc.f8479((SubLObject)makeString("genls"));
        $ic37$ = makeString("Definitional info for ~A");
        $ic38$ = makeString("Corresponding Cyc terms:");
        $ic39$ = makeString("Definitional Information for NAUT: ");
        $ic40$ = makeString("Corresponding HL NART: ");
        $ic41$ = constant_handles_oc.f8479((SubLObject)makeString("functionCorrespondingPredicate-Canonical"));
        $ic42$ = ConsesLow.list((SubLObject)TWO_INTEGER, (SubLObject)THREE_INTEGER);
        $ic43$ = makeString("Corresponding formula via #$functionCorrespondingPredicate-Canonical:");
        $ic44$ = makeSymbol("S#12274", "CYC");
        $ic45$ = constant_handles_oc.f8479((SubLObject)makeString("EverythingPSC"));
        $ic46$ = makeString("#ff0000");
        $ic47$ = makeString("(NOT STRICTLY WFF)");
        $ic48$ = makeString("KB Assertions:");
        $ic49$ = constant_handles_oc.f8479((SubLObject)makeString("salientAssertions"));
        $ic50$ = makeKeyword("GAF-ARG-NAUT");
        $ic51$ = makeKeyword("OTHER-NAUT");
        $ic52$ = ConsesLow.list((SubLObject)makeSymbol("S#44182", "CYC"), (SubLObject)makeSymbol("&OPTIONAL"), (SubLObject)makeSymbol("S#44449", "CYC"), (SubLObject)makeSymbol("S#13108", "CYC"), (SubLObject)makeSymbol("S#13109", "CYC"));
        $ic53$ = makeString("Could not determine a NAUT from ~a");
        $ic54$ = makeString("Could not determine an arg from ~a");
        $ic55$ = makeString("Could not determine a term from ~a");
        $ic56$ = makeString("Could not determine a microtheory from ~a");
        $ic57$ = makeString("GAF index for ~S");
        $ic58$ = makeSymbol("CB-C-GAF-ARG-NAUT");
        $ic59$ = makeKeyword("CONTENT");
        $ic60$ = makeString("cb-c-gaf-arg-naut&~A");
        $ic61$ = makeString("&~a");
        $ic62$ = makeString("Arg ~a");
        $ic63$ = makeString("All GAFs");
        $ic64$ = makeString(" (~a)");
        $ic65$ = makeSymbol("S#44437", "CYC");
        $ic66$ = makeString("Invalid attempt to reuse memoization state in multiple threads simultaneously.");
        $ic67$ = makeKeyword("HTML");
        $ic68$ = makeKeyword("NEW");
        $ic69$ = makeString("Got invalid args ARGNUM: ~A, PRED: ~A, MT: ~A.~%");
        $ic70$ = makeSymbol("INDEXED-TERM-P");
        $ic71$ = ConsesLow.list((SubLObject)makeSymbol("S#44182", "CYC"));
        $ic72$ = makeString("OTHER index for ~A");
        $ic73$ = makeSymbol("CB-C-OTHER-NAUT");
        $ic74$ = makeString("cb-c-other-naut&~A");
        $ic75$ = makeString("Miscellaneous");
        $ic76$ = makeSymbol("S#44445", "CYC");
        $ic77$ = makeString("Miscellaneous References:");
        $ic78$ = makeSymbol("S#43751", "CYC");
        $ic79$ = makeSymbol("S#43752", "CYC");
        $ic80$ = makeSymbol("S#43753", "CYC");
        $ic81$ = makeSymbol("S#43754", "CYC");
    }
}

/*
	DECOMPILATION REPORT

	Decompiled from: G:\opt\CYC_JRTL_with_CommonLisp\platform\lib\cyc-oc4.0-unzipped/com/cyc/cycjava/cycl/class
	Total time: 710 ms
	
	Decompiled with Procyon 0.5.32.
*/