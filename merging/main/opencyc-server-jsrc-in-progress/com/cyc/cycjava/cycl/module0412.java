package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import java.util.Map;
import java.util.Iterator;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Vectors;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLFloat;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class module0412 extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.module0412";
    public static final String myFingerPrint = "a937d3f3a678b99c44eb5e97092941bcc13cf8cba0ea54b5b9c8654d2fd1736a";
    private static SubLSymbol $g3326$;
    private static SubLSymbol $g3327$;
    private static SubLSymbol $g3328$;
    private static SubLSymbol $g3329$;
    private static SubLSymbol $g3330$;
    private static SubLSymbol $g3331$;
    private static SubLSymbol $g3332$;
    private static final SubLSymbol $ic0$;
    private static final SubLSymbol $ic1$;
    private static final SubLObject $ic2$;
    private static final SubLSymbol $ic3$;
    private static final SubLSymbol $ic4$;
    private static final SubLSymbol $ic5$;
    private static final SubLList $ic6$;
    private static final SubLList $ic7$;
    private static final SubLList $ic8$;
    private static final SubLSymbol $ic9$;
    private static final SubLList $ic10$;
    private static final SubLList $ic11$;
    private static final SubLString $ic12$;
    private static final SubLString $ic13$;
    private static final SubLSymbol $ic14$;
    private static final SubLSymbol $ic15$;
    private static final SubLList $ic16$;
    private static final SubLList $ic17$;
    private static final SubLSymbol $ic18$;
    private static final SubLSymbol $ic19$;
    private static final SubLSymbol $ic20$;
    private static final SubLSymbol $ic21$;
    private static final SubLSymbol $ic22$;
    private static final SubLFloat $ic23$;
    private static final SubLSymbol $ic24$;
    private static final SubLSymbol $ic25$;
    private static final SubLSymbol $ic26$;
    private static final SubLSymbol $ic27$;
    private static final SubLFloat $ic28$;
    private static final SubLSymbol $ic29$;
    private static final SubLSymbol $ic30$;
    private static final SubLSymbol $ic31$;
    private static final SubLSymbol $ic32$;
    private static final SubLList $ic33$;
    private static final SubLSymbol $ic34$;
    private static final SubLSymbol $ic35$;
    private static final SubLSymbol $ic36$;
    private static final SubLSymbol $ic37$;
    private static final SubLSymbol $ic38$;
    private static final SubLSymbol $ic39$;
    private static final SubLSymbol $ic40$;
    private static final SubLSymbol $ic41$;
    private static final SubLSymbol $ic42$;
    private static final SubLSymbol $ic43$;
    private static final SubLSymbol $ic44$;
    private static final SubLSymbol $ic45$;
    private static final SubLSymbol $ic46$;
    private static final SubLSymbol $ic47$;
    private static final SubLSymbol $ic48$;
    private static final SubLSymbol $ic49$;
    private static final SubLSymbol $ic50$;
    private static final SubLSymbol $ic51$;
    private static final SubLSymbol $ic52$;
    private static final SubLSymbol $ic53$;
    private static final SubLList $ic54$;
    private static final SubLSymbol $ic55$;
    private static final SubLSymbol $ic56$;
    private static final SubLList $ic57$;
    private static final SubLSymbol $ic58$;
    private static final SubLSymbol $ic59$;
    
    public static SubLObject f28668(final SubLObject var1) {
        final SubLThread var2 = SubLProcess.currentSubLThread();
        SubLObject var3 = (SubLObject)NIL;
        final SubLObject var4 = module0408.f28406(var1);
        SubLObject var5 = module0360.f23785();
        SubLObject var6 = (SubLObject)NIL;
        var6 = var5.first();
        while (NIL != var5) {
            var2.resetMultipleValues();
            final SubLObject var7 = module0360.f23985(var6);
            final SubLObject var8 = var2.secondMultipleValue();
            var2.resetMultipleValues();
            final SubLObject var9 = conses_high.getf(var4, var6, (SubLObject)$ic0$);
            if (var9 != $ic0$) {
                var3 = conses_high.putf(var3, var6, var9);
            }
            else if (NIL != var8) {
                var3 = conses_high.putf(var3, var6, var7);
            }
            var5 = var5.rest();
            var6 = var5.first();
        }
        return var3;
    }
    
    public static SubLObject f28669(final SubLObject var1, final SubLObject var10) {
        final SubLThread var11 = SubLProcess.currentSubLThread();
        SubLObject var12 = (SubLObject)NIL;
        final SubLObject var13 = module0408.f28406(var1);
        SubLObject var14 = module0360.f23785();
        SubLObject var15 = (SubLObject)NIL;
        var15 = var14.first();
        while (NIL != var14) {
            var11.resetMultipleValues();
            SubLObject var16 = module0683.f41877(var15);
            SubLObject var17 = var11.secondMultipleValue();
            var11.resetMultipleValues();
            if ($ic1$ == var15) {
                var11.resetMultipleValues();
                final SubLObject var18 = module0279.f18578(var10, $ic2$);
                final SubLObject var19 = var11.secondMultipleValue();
                var11.resetMultipleValues();
                if (NIL != module0202.f12597(var18)) {
                    var16 = (SubLObject)T;
                    var17 = (SubLObject)T;
                }
            }
            final SubLObject var20 = conses_high.getf(var13, var15, (SubLObject)$ic0$);
            if (var20 != $ic0$) {
                var12 = conses_high.putf(var12, var15, var20);
            }
            else if (NIL != var17) {
                var12 = conses_high.putf(var12, var15, var16);
            }
            var14 = var14.rest();
            var15 = var14.first();
        }
        return var12;
    }
    
    public static SubLObject f28670(final SubLObject var1) {
        SubLObject var2 = (SubLObject)NIL;
        final SubLObject var3 = module0408.f28407(var1);
        SubLObject var4;
        SubLObject var5;
        SubLObject var6;
        for (var4 = (SubLObject)NIL, var4 = var3; NIL != var4; var4 = conses_high.cddr(var4)) {
            var5 = var4.first();
            var6 = conses_high.cadr(var4);
            if (!var6.equal(module0360.f23985(var5))) {
                var2 = conses_high.putf(var2, var5, var6);
            }
        }
        return var2;
    }
    
    public static SubLObject f28671(SubLObject var17, SubLObject var18) {
        assert NIL != module0360.f23784(var17) : var17;
        assert NIL != module0360.f23784(var18) : var18;
        final SubLObject var19 = module0360.f23984(var17, (SubLObject)$ic4$);
        final SubLObject var20 = module0360.f23984(var18, (SubLObject)$ic4$);
        if (!makeBoolean(var19 != $ic5$).eql((SubLObject)makeBoolean(var20 != $ic5$))) {
            var17 = module0408.f28406(var17);
            var18 = module0408.f28406(var18);
        }
        final SubLObject var21 = f28672(var17, var18);
        SubLObject var22 = (SubLObject)NIL;
        SubLObject var23 = var21;
        SubLObject var24 = (SubLObject)NIL;
        var24 = var23.first();
        while (NIL != var23) {
            final SubLObject var25 = module0360.f23984(var17, var24);
            final SubLObject var26 = module0360.f23984(var18, var24);
            final SubLObject var27 = f28673(var24, var25, var26);
            var22 = conses_high.putf(var22, var24, var27);
            var23 = var23.rest();
            var24 = var23.first();
        }
        var22 = module0035.f2343(var22, module0360.f23785(), (SubLObject)UNPROVIDED);
        return var22;
    }
    
    public static SubLObject f28672(final SubLObject var27, final SubLObject var28) {
        return conses_high.nunion(module0035.f2353(var27), module0035.f2353(var28), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f28673(final SubLObject var23, final SubLObject var24, final SubLObject var25) {
        if (NIL != f28674(var23)) {
            return (SubLObject)makeBoolean(NIL != var24 || NIL != var25);
        }
        return (NIL != f28675(var23, var24, var25)) ? var24 : var25;
    }
    
    public static SubLObject f28676(final SubLObject var29) {
        return module0004.f104(var29, $g3326$.getGlobalValue(), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f28677() {
        return conses_high.copy_list($g3326$.getGlobalValue());
    }
    
    public static SubLObject f28674(final SubLObject var23) {
        return module0035.f2169(var23, $g3327$.getGlobalValue());
    }
    
    public static SubLObject f28678(final SubLObject var29) {
        return module0004.f104(var29, $g3328$.getGlobalValue(), Symbols.symbol_function((SubLObject)EQ), Symbols.symbol_function((SubLObject)$ic9$));
    }
    
    public static SubLObject f28679() {
        return conses_high.copy_alist($g3328$.getGlobalValue());
    }
    
    public static SubLObject f28680() {
        return conses_high.copy_list($g3329$.getGlobalValue());
    }
    
    public static SubLObject f28681(final SubLObject var29) {
        return module0035.f2169(var29, $g3329$.getGlobalValue());
    }
    
    public static SubLObject f28682(final SubLObject var30) {
        if (NIL != module0035.f2169(var30, $g3330$.getGlobalValue())) {
            return module0048.f3326();
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f28683(final SubLObject var23, SubLObject var24, SubLObject var25) {
        final SubLThread var26 = SubLProcess.currentSubLThread();
        if (NIL != module0035.f2169(var23, $g3329$.getGlobalValue())) {
            if (NIL == var24) {
                var24 = module0048.f3326();
            }
            if (NIL == var25) {
                var25 = module0048.f3326();
            }
            return module0048.f3333(var24, var25);
        }
        final SubLObject var27 = module0035.f2293($g3328$.getGlobalValue(), var23, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        if (NIL != var27) {
            final SubLObject var28 = Sequences.position(var24, var27, Symbols.symbol_function((SubLObject)EQ), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
            final SubLObject var29 = Sequences.position(var25, var27, Symbols.symbol_function((SubLObject)EQ), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
            if (NIL == Errors.$ignore_mustsP$.getDynamicValue(var26) && NIL == var28) {
                Errors.error((SubLObject)$ic12$, var23, var24);
            }
            if (NIL == Errors.$ignore_mustsP$.getDynamicValue(var26) && NIL == var29) {
                Errors.error((SubLObject)$ic12$, var23, var25);
            }
            return Numbers.numL(var28, var29);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f28684(final SubLObject var23, final SubLObject var24, final SubLObject var25) {
        return f28683(var23, var25, var24);
    }
    
    public static SubLObject f28685(final SubLObject var23, final SubLObject var24, final SubLObject var25) {
        return (SubLObject)makeBoolean(var24.equal(var25) || NIL != f28683(var23, var24, var25));
    }
    
    public static SubLObject f28675(final SubLObject var23, final SubLObject var24, final SubLObject var25) {
        return (SubLObject)makeBoolean(var24.equal(var25) || NIL != f28684(var23, var24, var25));
    }
    
    public static SubLObject f28686(final SubLObject var23) {
        if (NIL != f28678(var23)) {
            final SubLObject var24 = module0035.f2293($g3328$.getGlobalValue(), var23, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
            return var24.first();
        }
        if (NIL != f28681(var23)) {
            return (SubLObject)ZERO_INTEGER;
        }
        return Errors.error((SubLObject)$ic13$, var23);
    }
    
    public static SubLObject f28687(final SubLObject var23, final SubLObject var16) {
        return Equality.equal(var16, f28686(var23));
    }
    
    public static SubLObject f28688(final SubLObject var23) {
        if (NIL != f28678(var23)) {
            final SubLObject var24 = module0035.f2293($g3328$.getGlobalValue(), var23, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
            return module0035.f2114(var24);
        }
        if (NIL != f28681(var23)) {
            return f28682(var23);
        }
        return Errors.error((SubLObject)$ic13$, var23);
    }
    
    public static SubLObject f28689(final SubLObject var23, final SubLObject var16) {
        return Equality.equal(var16, f28688(var23));
    }
    
    public static SubLObject f28690(final SubLObject var35, final SubLObject var1) {
        assert NIL != module0361.f24009(var35) : var35;
        final SubLObject var36 = module0360.f23860(var1);
        SubLObject var37;
        SubLObject var38;
        SubLObject var39;
        for (var37 = (SubLObject)NIL, var37 = var36; NIL != var37; var37 = conses_high.cddr(var37)) {
            var38 = var37.first();
            var39 = conses_high.cadr(var37);
            if (NIL == f28691(var35, var38, var39)) {
                return (SubLObject)NIL;
            }
        }
        return (SubLObject)T;
    }
    
    public static SubLObject f28691(final SubLObject var35, final SubLObject var6, final SubLObject var16) {
        if (NIL != module0360.f23790(var6)) {
            final SubLObject var36 = module0411.f28573(var35, var6, (SubLObject)$ic15$);
            if ($ic15$ != var36 && !var36.equal(var16)) {
                if (NIL != f28674(var6)) {
                    return (SubLObject)makeBoolean(NIL == var16 || NIL != var36);
                }
                if (NIL != f28678(var6)) {
                    return f28675(var6, var36, var16);
                }
            }
        }
        return (SubLObject)T;
    }
    
    public static SubLObject f28692(final SubLObject var38) {
        final SubLObject var39 = f28693(var38);
        if (NIL == var39) {
            return (SubLObject)$ic16$;
        }
        SubLObject var41;
        final SubLObject var40 = var41 = var39;
        SubLObject var42 = (SubLObject)NIL;
        SubLObject var43 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var41, var40, (SubLObject)$ic17$);
        var42 = var41.first();
        var41 = (var43 = var41.rest());
        SubLObject var45;
        final SubLObject var44 = var45 = conses_high.remf(var42, (SubLObject)$ic18$);
        SubLObject var46 = var43;
        SubLObject var47 = (SubLObject)NIL;
        var47 = var46.first();
        while (NIL != var46) {
            final SubLObject var48 = conses_high.remf(var47, (SubLObject)$ic18$);
            var45 = f28671(var45, var48);
            var46 = var46.rest();
            var47 = var46.first();
        }
        final SubLObject var49 = inference_datastructures_inference_oc.f25421(var38);
        final SubLObject var50 = module0361.f24229(var49);
        SubLObject var51 = inference_datastructures_inference_oc.f25626(var38);
        final SubLObject var52 = inference_datastructures_inference_oc.f25627(var38);
        var51 = Numbers.ceiling(var51, (SubLObject)UNPROVIDED);
        var45 = conses_high.putf(var45, (SubLObject)$ic19$, var50);
        var45 = conses_high.putf(var45, (SubLObject)$ic20$, var51);
        var45 = conses_high.putf(var45, (SubLObject)$ic21$, var52);
        var45 = conses_high.putf(var45, (SubLObject)$ic22$, (SubLObject)$ic23$);
        return var45;
    }
    
    public static SubLObject f28694(final SubLObject var38) {
        return f28695(f28693(var38));
    }
    
    public static SubLObject f28696(final SubLObject var38) {
        return f28697(var38, (SubLObject)T);
    }
    
    public static SubLObject f28693(final SubLObject var38) {
        return f28697(var38, (SubLObject)NIL);
    }
    
    public static SubLObject f28698(final SubLObject var51) {
        return f28699(var51, (SubLObject)T);
    }
    
    public static SubLObject f28695(final SubLObject var51) {
        return f28699(var51, (SubLObject)NIL);
    }
    
    public static SubLObject f28699(final SubLObject var51, final SubLObject var52) {
        SubLObject var53 = (SubLObject)NIL;
        SubLObject var54 = (SubLObject)ZERO_INTEGER;
        SubLObject var55 = (SubLObject)ZERO_INTEGER;
        SubLObject var56 = (SubLObject)NIL;
        SubLObject var57 = (SubLObject)NIL;
        SubLObject var58 = conses_high.copy_tree(var51);
        SubLObject var59 = (SubLObject)NIL;
        var59 = var58.first();
        while (NIL != var58) {
            var56 = conses_high.getf(var59, (SubLObject)$ic20$, (SubLObject)ZERO_INTEGER);
            var57 = conses_high.getf(var59, (SubLObject)$ic21$, (SubLObject)ZERO_INTEGER);
            conses_high.remf(var59, (SubLObject)$ic20$);
            conses_high.remf(var59, (SubLObject)$ic21$);
            if (var56.numG(var54)) {
                var54 = var56;
            }
            if (var57.numG(var55)) {
                var55 = var57;
            }
            var53 = ((NIL != var52) ? f28700(var53, var59) : f28701(var53, var59));
            var58 = var58.rest();
            var59 = var58.first();
        }
        conses_high.putf(var53, (SubLObject)$ic20$, var54);
        conses_high.putf(var53, (SubLObject)$ic21$, var55);
        return conses_high.remf(conses_high.copy_list(var53), (SubLObject)$ic18$);
    }
    
    public static SubLObject f28697(final SubLObject var38, final SubLObject var57) {
        SubLObject var58 = (SubLObject)NIL;
        final SubLObject var59 = inference_datastructures_inference_oc.f25492(var38);
        if (NIL == module0065.f4772(var59, (SubLObject)$ic24$)) {
            final SubLObject var60_61 = var59;
            if (NIL == module0065.f4775(var60_61, (SubLObject)$ic24$)) {
                final SubLObject var60 = module0065.f4740(var60_61);
                final SubLObject var61 = (SubLObject)NIL;
                SubLObject var62;
                SubLObject var63;
                SubLObject var64;
                SubLObject var65;
                SubLObject var66;
                for (var62 = Sequences.length(var60), var63 = (SubLObject)NIL, var63 = (SubLObject)ZERO_INTEGER; var63.numL(var62); var63 = Numbers.add(var63, (SubLObject)ONE_INTEGER)) {
                    var64 = ((NIL != var61) ? Numbers.subtract(var62, var63, (SubLObject)ONE_INTEGER) : var63);
                    var65 = Vectors.aref(var60, var64);
                    if (NIL == module0065.f4749(var65) || NIL == module0065.f4773((SubLObject)$ic24$)) {
                        if (NIL != module0065.f4749(var65)) {
                            var65 = (SubLObject)$ic24$;
                        }
                        var66 = f28702(var65, var38, var57);
                        if (NIL != var57) {
                            var58 = ConsesLow.nconc(var66, var58);
                        }
                        else {
                            var58 = (SubLObject)ConsesLow.cons(var66, var58);
                        }
                    }
                }
            }
            final SubLObject var69_70 = var59;
            if (NIL == module0065.f4777(var69_70)) {
                final SubLObject var67 = module0065.f4738(var69_70);
                SubLObject var68 = (SubLObject)NIL;
                SubLObject var69 = (SubLObject)NIL;
                final Iterator var70 = Hashtables.getEntrySetIterator(var67);
                try {
                    while (Hashtables.iteratorHasNext(var70)) {
                        final Map.Entry var71 = Hashtables.iteratorNextEntry(var70);
                        var68 = Hashtables.getEntryKey(var71);
                        var69 = Hashtables.getEntryValue(var71);
                        final SubLObject var72 = f28702(var69, var38, var57);
                        if (NIL != var57) {
                            var58 = ConsesLow.nconc(var72, var58);
                        }
                        else {
                            var58 = (SubLObject)ConsesLow.cons(var72, var58);
                        }
                    }
                }
                finally {
                    Hashtables.releaseEntrySetIterator(var70);
                }
            }
        }
        return Sequences.nreverse(var58);
    }
    
    public static SubLObject f28702(final SubLObject var67, final SubLObject var38, final SubLObject var57) {
        final SubLObject var68 = f28703(var67, var38);
        final SubLObject var69 = f28704(var68, var67);
        if (NIL == var57) {
            return var69;
        }
        return f28705(var69, var68);
    }
    
    public static SubLObject f28704(final SubLObject var74, final SubLObject var67) {
        final SubLThread var75 = SubLProcess.currentSubLThread();
        SubLObject var76 = f28706(var74);
        final SubLObject var77 = inference_datastructures_inference_oc.f25748(var67);
        SubLObject var78 = (SubLObject)NIL;
        SubLObject var79 = (SubLObject)NIL;
        if (NIL != module0361.f24321(var77)) {
            var78 = module0361.f24148(var77);
            SubLObject var80;
            for (var80 = module0066.f4838(module0067.f4891(var78)); NIL == var79 && NIL == module0066.f4841(var80); var80 = module0066.f4840(var80)) {
                var75.resetMultipleValues();
                final SubLObject var81 = module0066.f4839(var80);
                final SubLObject var82 = var75.secondMultipleValue();
                var75.resetMultipleValues();
                if (var82 == $ic25$) {
                    var76 = conses_high.putf(var76, (SubLObject)$ic26$, module0361.f24160(var77));
                    var79 = (SubLObject)T;
                }
            }
            module0066.f4842(var80);
        }
        var76 = conses_high.putf(var76, (SubLObject)$ic27$, Numbers.add((SubLObject)ONE_INTEGER, inference_datastructures_inference_oc.f25629(var67)));
        final SubLObject var83 = Numbers.add((SubLObject)ONE_INTEGER, Numbers.multiply((SubLObject)$ic28$, inference_datastructures_inference_oc.f25623(var67, (SubLObject)NIL)));
        final SubLObject var84 = inference_datastructures_inference_oc.f25649(var83);
        var76 = conses_high.putf(var76, (SubLObject)$ic20$, var83);
        if (NIL != var84) {
            var76 = conses_high.putf(var76, (SubLObject)$ic22$, var84);
        }
        final SubLObject var85 = inference_datastructures_inference_oc.f25625(var67);
        var76 = conses_high.putf(var76, (SubLObject)$ic21$, var85);
        final SubLObject var86 = inference_datastructures_inference_oc.f25687(var67);
        if (NIL != module0408.f28482(var86)) {
            var76 = conses_high.putf(var76, (SubLObject)$ic29$, (SubLObject)T);
        }
        if (NIL != module0408.f28484(var86)) {
            var76 = conses_high.putf(var76, (SubLObject)$ic30$, (SubLObject)$ic31$);
        }
        else {
            var76 = conses_high.putf(var76, (SubLObject)$ic30$, (SubLObject)$ic32$);
        }
        var76 = conses_high.putf(var76, (SubLObject)$ic18$, var86);
        return var76;
    }
    
    public static SubLObject f28705(final SubLObject var68, final SubLObject var74) {
        SubLObject var75 = (SubLObject)NIL;
        SubLObject var76 = var74;
        SubLObject var77 = (SubLObject)NIL;
        var77 = var76.first();
        while (NIL != var76) {
            var77 = conses_high.copy_list(var77);
            SubLObject var5_86 = $g3331$.getGlobalValue();
            SubLObject var78 = (SubLObject)NIL;
            var78 = var5_86.first();
            while (NIL != var5_86) {
                final SubLObject var79 = conses_high.getf(var68, var78, (SubLObject)UNPROVIDED);
                var77 = conses_high.putf(var77, var78, var79);
                var5_86 = var5_86.rest();
                var78 = var5_86.first();
            }
            var75 = (SubLObject)ConsesLow.cons(var77, var75);
            var76 = var76.rest();
            var77 = var76.first();
        }
        return Sequences.nreverse(var75);
    }
    
    public static SubLObject f28703(final SubLObject var67, final SubLObject var38) {
        SubLObject var68 = (SubLObject)NIL;
        SubLObject var69 = inference_datastructures_inference_oc.f25744(var67);
        SubLObject var70 = (SubLObject)NIL;
        var70 = var69.first();
        while (NIL != var69) {
            SubLObject var5_89 = inference_datastructures_inference_oc.f25785(var70);
            SubLObject var71 = (SubLObject)NIL;
            var71 = var5_89.first();
            while (NIL != var5_89) {
                final SubLObject var72 = f28707(var71, f28708(), var38);
                var68 = (SubLObject)ConsesLow.cons(var72, var68);
                var5_89 = var5_89.rest();
                var71 = var5_89.first();
            }
            var69 = var69.rest();
            var70 = var69.first();
        }
        return var68;
    }
    
    public static SubLObject f28707(final SubLObject var78, SubLObject var56, final SubLObject var38) {
        final SubLObject var79 = module0035.f2399(module0366.f24966(var78), Symbols.symbol_function((SubLObject)$ic34$), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        final SubLObject var80 = module0366.f24937(var78);
        SubLObject var81 = (SubLObject)NIL;
        SubLObject var82 = (SubLObject)NIL;
        SubLObject var83 = (SubLObject)NIL;
        SubLObject var84 = (SubLObject)NIL;
        if (NIL != module0373.f26175(var80)) {
            var81 = module0373.f26179(var80);
        }
        else if (NIL != module0373.f26150(var80)) {
            var81 = module0373.f26152(var80);
        }
        var82 = (SubLObject)((NIL != var81) ? module0365.f24850(var81) : NIL);
        var83 = (SubLObject)((NIL != var81) ? module0365.f24865(var81) : NIL);
        var84 = (SubLObject)((NIL != var83) ? module0340.f22825(var83) : NIL);
        if (NIL != var82) {
            final SubLObject var85 = conses_high.getf(var56, (SubLObject)$ic19$, (SubLObject)UNPROVIDED);
            final SubLObject var86 = Numbers.add((SubLObject)TWO_INTEGER, module0363.f24508(var82));
            if (var86.numG(var85)) {
                var56 = conses_high.putf(var56, (SubLObject)$ic19$, var86);
            }
        }
        if (NIL != var81) {
            final SubLObject var87 = conses_high.getf(var56, (SubLObject)$ic35$, (SubLObject)UNPROVIDED);
            final SubLObject var88 = module0365.f24870(var81);
            if (NIL != module0035.f2406(var88, var87)) {
                var56 = conses_high.putf(var56, (SubLObject)$ic35$, var88);
            }
            if (NIL != var82 && NIL != var83 && NIL != module0377.f26771(var81)) {
                SubLObject var89 = module0363.f24517(var82);
                SubLObject var90 = (SubLObject)NIL;
                var90 = var89.first();
                while (NIL != var89) {
                    if (NIL != module0363.f24522(var90, var83) && NIL != module0377.f26771(var90) && NIL == module0377.f26772(var90)) {
                        final SubLObject var91 = conses_high.getf(var56, (SubLObject)$ic35$, (SubLObject)UNPROVIDED);
                        final SubLObject var92 = module0365.f24870(var90);
                        if (var92.numG(var91)) {
                            var56 = conses_high.putf(var56, (SubLObject)$ic35$, var92);
                        }
                    }
                    var89 = var89.rest();
                    var90 = var89.first();
                }
            }
        }
        final SubLObject var93 = module0377.f26746(var80);
        if (NIL != var93 || NIL != module0378.f26860(var80)) {
            var56 = conses_high.putf(var56, (SubLObject)$ic36$, Numbers.add(module0373.f26359(var80, var38), conses_high.getf(var56, (SubLObject)$ic36$, (SubLObject)UNPROVIDED)));
            var56 = conses_high.putf(var56, (SubLObject)$ic37$, (SubLObject)T);
        }
        if (NIL != var93 && NIL != var82 && NIL != module0384.f27335(var82)) {
            var56 = conses_high.putf(var56, (SubLObject)$ic38$, (SubLObject)T);
        }
        if (NIL != module0379.f26926(var80)) {
            var56 = conses_high.putf(var56, (SubLObject)$ic39$, (SubLObject)T);
        }
        if (NIL != var83) {
            if (NIL != module0450.f31010(var84)) {
                var56 = conses_high.putf(var56, (SubLObject)$ic40$, (SubLObject)T);
            }
            if (NIL != module0525.f32786(var84)) {
                var56 = conses_high.putf(var56, (SubLObject)$ic41$, (SubLObject)T);
            }
            if (NIL != module0525.f32803(var84) && ($ic42$ != var84 || NIL == module0384.f27335(var82) || NIL == module0384.f27336(var82))) {
                var56 = conses_high.putf(var56, (SubLObject)$ic43$, (SubLObject)T);
            }
            if (NIL != module0450.f31010(var84)) {
                var56 = conses_high.putf(var56, (SubLObject)$ic40$, (SubLObject)T);
            }
            if ($ic44$ == var84) {
                var56 = conses_high.putf(var56, (SubLObject)$ic45$, inference_datastructures_inference_oc.f25513(var38));
            }
            if (NIL != module0435.f30632(var84)) {
                var56 = conses_high.putf(var56, (SubLObject)$ic46$, (SubLObject)T);
            }
            if (NIL != module0435.f30631(var84)) {
                var56 = conses_high.putf(var56, (SubLObject)$ic47$, (SubLObject)T);
            }
            SubLObject var89 = var79;
            SubLObject var94 = (SubLObject)NIL;
            var94 = var89.first();
            while (NIL != var89) {
                final SubLObject var95 = module0191.f11966(var94);
                if (var95 == $ic48$ && NIL != module0435.f30629(var84)) {
                    var56 = conses_high.putf(var56, (SubLObject)$ic49$, (SubLObject)T);
                }
                if (var95 == $ic50$) {
                    var56 = conses_high.putf(var56, (SubLObject)$ic51$, (SubLObject)T);
                }
                if (NIL != module0435.f30630(var84, var95)) {
                    var56 = conses_high.putf(var56, (SubLObject)$ic52$, (SubLObject)T);
                }
                var89 = var89.rest();
                var94 = var89.first();
            }
        }
        final SubLObject var96 = module0773.f49607(var78);
        if (var96.numG(conses_high.getf(var56, (SubLObject)$ic53$, (SubLObject)UNPROVIDED))) {
            var56 = conses_high.putf(var56, (SubLObject)$ic53$, var96);
        }
        SubLObject var97 = module0366.f24938(var78);
        SubLObject var98 = (SubLObject)NIL;
        var98 = var97.first();
        while (NIL != var97) {
            var56 = f28707(var98, var56, var38);
            var97 = var97.rest();
            var98 = var97.first();
        }
        return var56;
    }
    
    public static SubLObject f28708() {
        SubLObject var85 = (SubLObject)NIL;
        SubLObject var86 = f28680();
        SubLObject var87 = (SubLObject)NIL;
        var87 = var86.first();
        while (NIL != var86) {
            var85 = conses_high.putf(var85, var87, (SubLObject)ZERO_INTEGER);
            var86 = var86.rest();
            var87 = var86.first();
        }
        var85 = conses_high.putf(var85, (SubLObject)$ic22$, (SubLObject)ONE_INTEGER);
        var86 = f28679();
        SubLObject var88 = (SubLObject)NIL;
        var88 = var86.first();
        while (NIL != var86) {
            SubLObject var90;
            final SubLObject var89 = var90 = var88;
            SubLObject var91 = (SubLObject)NIL;
            SubLObject var92 = (SubLObject)NIL;
            cdestructuring_bind.destructuring_bind_must_consp(var90, var89, (SubLObject)$ic54$);
            var91 = var90.first();
            var90 = (var92 = var90.rest());
            var85 = conses_high.putf(var85, var91, var92.first());
            var86 = var86.rest();
            var88 = var86.first();
        }
        return var85;
    }
    
    public static SubLObject f28701(final SubLObject var110, final SubLObject var111) {
        SubLObject var112 = (SubLObject)NIL;
        SubLObject var113 = (SubLObject)NIL;
        if (Sequences.length(var111).numG(Sequences.length(var110))) {
            var112 = var111;
            var113 = var110;
        }
        else {
            var112 = var110;
            var113 = var111;
        }
        if (NIL == var113) {
            return var112;
        }
        if (NIL != f28709(var112, var113)) {
            return var112;
        }
        return var113;
    }
    
    public static SubLObject f28700(final SubLObject var110, final SubLObject var111) {
        SubLObject var112 = (SubLObject)NIL;
        SubLObject var113 = (SubLObject)NIL;
        if (Sequences.length(var111).numG(Sequences.length(var110))) {
            var112 = var111;
            var113 = var110;
        }
        else {
            var112 = var110;
            var113 = var111;
        }
        if (NIL == var113) {
            return var112;
        }
        if (NIL != f28709(var112, var113)) {
            return var113;
        }
        return var112;
    }
    
    public static SubLObject f28709(final SubLObject var112, final SubLObject var113) {
        final SubLThread var114 = SubLProcess.currentSubLThread();
        var114.resetMultipleValues();
        final SubLObject var115 = f28710(var112, var113);
        final SubLObject var116 = var114.secondMultipleValue();
        var114.resetMultipleValues();
        return Numbers.numG(var115, var116);
    }
    
    public static SubLObject f28711(final SubLObject var112, final SubLObject var113) {
        final SubLThread var114 = SubLProcess.currentSubLThread();
        var114.resetMultipleValues();
        final SubLObject var115 = f28710(var112, var113);
        final SubLObject var116 = var114.secondMultipleValue();
        var114.resetMultipleValues();
        return Numbers.numL(var115, var116);
    }
    
    public static SubLObject f28710(final SubLObject var112, final SubLObject var113) {
        SubLObject var114 = (SubLObject)ZERO_INTEGER;
        SubLObject var115 = (SubLObject)ZERO_INTEGER;
        SubLObject var116;
        SubLObject var117;
        SubLObject var118;
        SubLObject var119;
        for (var116 = (SubLObject)NIL, var116 = var112; NIL != var116; var116 = conses_high.cddr(var116)) {
            var117 = var116.first();
            var118 = conses_high.cadr(var116);
            var119 = conses_high.getf(var113, var117, (SubLObject)UNPROVIDED);
            if (!var118.eql(var119)) {
                if (NIL != f28683(var117, var118, var119)) {
                    var114 = Numbers.add(var114, (SubLObject)ONE_INTEGER);
                }
                else {
                    var115 = Numbers.add(var115, (SubLObject)ONE_INTEGER);
                }
            }
        }
        return Values.values(var114, var115);
    }
    
    public static SubLObject f28706(final SubLObject var51) {
        return module0035.f2378(var51, (SubLObject)$ic55$, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f28712(final SubLObject var51) {
        return module0035.f2378(var51, (SubLObject)$ic56$, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f28713(final SubLObject var51) {
        return f28712(var51);
    }
    
    public static SubLObject f28714(final SubLObject var51) {
        return f28706(var51);
    }
    
    public static SubLObject f28715(final SubLObject var116) {
        assert NIL != module0360.f23905(var116) : var116;
        return module0035.f2294($g3332$.getGlobalValue(), var116, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f28716(final SubLObject var116, final SubLObject var6, SubLObject var7) {
        if (var7 == UNPROVIDED) {
            var7 = (SubLObject)NIL;
        }
        return conses_high.getf(f28715(var116), var6, var7);
    }
    
    public static SubLObject f28717(final SubLObject var116) {
        return f28716(var116, (SubLObject)$ic59$, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f28718() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0412", "f28668", "S#31815", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0412", "f28669", "S#31816", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0412", "f28670", "S#31817", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0412", "f28671", "S#26089", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0412", "f28672", "S#31818", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0412", "f28673", "S#31819", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0412", "f28676", "S#31820", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0412", "f28677", "S#31821", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0412", "f28674", "S#31822", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0412", "f28678", "S#31823", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0412", "f28679", "S#31824", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0412", "f28680", "S#31825", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0412", "f28681", "S#31826", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0412", "f28682", "S#31827", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0412", "f28683", "S#31828", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0412", "f28684", "S#31829", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0412", "f28685", "S#31830", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0412", "f28675", "S#31831", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0412", "f28686", "S#31832", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0412", "f28687", "S#31833", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0412", "f28688", "S#31834", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0412", "f28689", "S#31835", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0412", "f28690", "S#31836", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0412", "f28691", "S#31837", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0412", "f28692", "S#31838", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0412", "f28694", "S#31839", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0412", "f28696", "S#28221", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0412", "f28693", "S#28219", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0412", "f28698", "S#28220", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0412", "f28695", "S#28222", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0412", "f28699", "S#31840", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0412", "f28697", "S#31841", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0412", "f28702", "S#31842", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0412", "f28704", "S#31843", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0412", "f28705", "S#31844", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0412", "f28703", "S#31845", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0412", "f28707", "S#31846", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0412", "f28708", "S#31847", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0412", "f28701", "S#31848", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0412", "f28700", "S#31849", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0412", "f28709", "S#31850", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0412", "f28711", "S#31851", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0412", "f28710", "S#31852", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0412", "f28706", "S#31853", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0412", "f28712", "S#31854", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0412", "f28713", "S#31855", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0412", "f28714", "S#31856", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0412", "f28715", "S#31508", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0412", "f28716", "S#31857", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0412", "f28717", "S#31858", 1, 0, false);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f28719() {
        $g3326$ = SubLFiles.deflexical("S#31859", (SubLObject)$ic6$);
        $g3327$ = SubLFiles.deflexical("S#31860", (SubLObject)$ic7$);
        $g3328$ = SubLFiles.deflexical("S#31861", (SubLObject)$ic8$);
        $g3329$ = SubLFiles.deflexical("S#31862", (SubLObject)$ic10$);
        $g3330$ = SubLFiles.deflexical("S#31863", (SubLObject)$ic11$);
        $g3331$ = SubLFiles.deflexical("S#31864", (SubLObject)$ic33$);
        $g3332$ = SubLFiles.deflexical("S#31865", (SubLObject)$ic57$);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f28720() {
        return (SubLObject)NIL;
    }
    
    public void declareFunctions() {
        f28718();
    }
    
    public void initializeVariables() {
        f28719();
    }
    
    public void runTopLevelForms() {
        f28720();
    }
    
    static {
        me = (SubLFile)new module0412();
        $g3326$ = null;
        $g3327$ = null;
        $g3328$ = null;
        $g3329$ = null;
        $g3330$ = null;
        $g3331$ = null;
        $g3332$ = null;
        $ic0$ = makeKeyword("UNSPECIFIED");
        $ic1$ = makeKeyword("CONDITIONAL-SENTENCE?");
        $ic2$ = constant_handles_oc.f8479((SubLObject)makeString("BaseKB"));
        $ic3$ = makeSymbol("S#26487", "CYC");
        $ic4$ = makeKeyword("INFERENCE-MODE");
        $ic5$ = makeKeyword("CUSTOM");
        $ic6$ = ConsesLow.list(new SubLObject[] { makeKeyword("BINDINGS"), makeKeyword("INTERMEDIATE-STEP-VALIDATION-LEVEL"), makeKeyword("MAX-PROBLEM-COUNT"), makeKeyword("TRANSFORMATION-ALLOWED?"), makeKeyword("NEGATION-BY-FAILURE?"), makeKeyword("COMPLETENESS-MINIMIZATION-ALLOWED?"), makeKeyword("EVALUATE-SUBL-ALLOWED?"), makeKeyword("REWRITE-ALLOWED?"), makeKeyword("ABDUCTION-ALLOWED?"), makeKeyword("NEW-TERMS-ALLOWED?"), makeKeyword("ALLOW-HL-PREDICATE-TRANSFORMATION?"), makeKeyword("ALLOW-UNBOUND-PREDICATE-TRANSFORMATION?"), makeKeyword("ALLOW-EVALUATABLE-PREDICATE-TRANSFORMATION?"), makeKeyword("ALLOW-INDETERMINATE-RESULTS?"), makeKeyword("ALLOW-ABNORMALITY-CHECKING?"), makeKeyword("TRANSITIVE-CLOSURE-MODE"), makeKeyword("MAX-PROOF-DEPTH"), makeKeyword("MAX-TRANSFORMATION-DEPTH"), makeKeyword("PROBABLY-APPROXIMATELY-DONE"), makeKeyword("ANSWER-LANGUAGE"), makeKeyword("MAX-NUMBER"), makeKeyword("MAX-TIME"), makeKeyword("MAX-STEP"), makeKeyword("REMOVAL-BACKTRACKING-PRODUCTIVITY-LIMIT"), makeKeyword("PRODUCTIVITY-LIMIT") });
        $ic7$ = ConsesLow.list(new SubLObject[] { makeKeyword("ABDUCTION-ALLOWED?"), makeKeyword("ADD-RESTRICTION-LAYER-OF-INDIRECTION?"), makeKeyword("ALLOW-ABNORMALITY-CHECKING?"), makeKeyword("ALLOW-EVALUATABLE-PREDICATE-TRANSFORMATION?"), makeKeyword("ALLOW-HL-PREDICATE-TRANSFORMATION?"), makeKeyword("ALLOW-INDETERMINATE-RESULTS?"), makeKeyword("ALLOW-UNBOUND-PREDICATE-TRANSFORMATION?"), makeKeyword("COMPLETENESS-MINIMIZATION-ALLOWED?"), makeKeyword("EVALUATE-SUBL-ALLOWED?"), makeKeyword("NEGATION-BY-FAILURE?"), makeKeyword("NEW-TERMS-ALLOWED?"), makeKeyword("REWRITE-ALLOWED?"), makeKeyword("TRANSFORMATION-ALLOWED?") });
        $ic8$ = ConsesLow.list(new SubLObject[] { ConsesLow.list((SubLObject)makeKeyword("ABDUCTION-ALLOWED?"), (SubLObject)NIL, (SubLObject)T), ConsesLow.list((SubLObject)makeKeyword("ADD-RESTRICTION-LAYER-OF-INDIRECTION?"), (SubLObject)NIL, (SubLObject)T), ConsesLow.list((SubLObject)makeKeyword("ALLOW-ABNORMALITY-CHECKING?"), (SubLObject)NIL, (SubLObject)T), ConsesLow.list((SubLObject)makeKeyword("ALLOW-EVALUATABLE-PREDICATE-TRANSFORMATION?"), (SubLObject)NIL, (SubLObject)T), ConsesLow.list((SubLObject)makeKeyword("ALLOW-HL-PREDICATE-TRANSFORMATION?"), (SubLObject)NIL, (SubLObject)T), ConsesLow.list((SubLObject)makeKeyword("ALLOW-INDETERMINATE-RESULTS?"), (SubLObject)T, (SubLObject)NIL), ConsesLow.list((SubLObject)makeKeyword("ALLOW-UNBOUND-PREDICATE-TRANSFORMATION?"), (SubLObject)NIL, (SubLObject)T), ConsesLow.list((SubLObject)makeKeyword("ANSWER-LANGUAGE"), (SubLObject)makeKeyword("HL"), (SubLObject)makeKeyword("EL")), ConsesLow.list((SubLObject)makeKeyword("COMPLETENESS-MINIMIZATION-ALLOWED?"), (SubLObject)T, (SubLObject)NIL), ConsesLow.list((SubLObject)makeKeyword("EVALUATE-SUBL-ALLOWED?"), (SubLObject)NIL, (SubLObject)T), ConsesLow.list((SubLObject)makeKeyword("INFERENCE-MODE"), (SubLObject)makeKeyword("MINIMAL"), (SubLObject)makeKeyword("SHALLOW"), (SubLObject)makeKeyword("EXTENDED"), (SubLObject)makeKeyword("MAXIMAL"), (SubLObject)makeKeyword("CUSTOM")), ConsesLow.list((SubLObject)makeKeyword("INTERMEDIATE-STEP-VALIDATION-LEVEL"), (SubLObject)makeKeyword("NONE"), (SubLObject)makeKeyword("MINIMAL"), (SubLObject)makeKeyword("ARG-TYPE"), (SubLObject)makeKeyword("ALL")), ConsesLow.list((SubLObject)makeKeyword("NEGATION-BY-FAILURE?"), (SubLObject)T, (SubLObject)NIL), ConsesLow.list((SubLObject)makeKeyword("NEW-TERMS-ALLOWED?"), (SubLObject)NIL, (SubLObject)T), ConsesLow.list((SubLObject)makeKeyword("REWRITE-ALLOWED?"), (SubLObject)NIL, (SubLObject)T), ConsesLow.list((SubLObject)makeKeyword("TRANSFORMATION-ALLOWED?"), (SubLObject)NIL, (SubLObject)T), ConsesLow.list((SubLObject)makeKeyword("TRANSITIVE-CLOSURE-MODE"), (SubLObject)makeKeyword("NONE"), (SubLObject)makeKeyword("FOCUSED"), (SubLObject)makeKeyword("ALL")) });
        $ic9$ = makeSymbol("CAR");
        $ic10$ = ConsesLow.list(new SubLObject[] { makeKeyword("MAX-PROBLEM-COUNT"), makeKeyword("MAX-PROOF-DEPTH"), makeKeyword("MAX-TRANSFORMATION-DEPTH"), makeKeyword("PROBABLY-APPROXIMATELY-DONE"), makeKeyword("MAX-NUMBER"), makeKeyword("MAX-TIME"), makeKeyword("MAX-STEP"), makeKeyword("REMOVAL-BACKTRACKING-PRODUCTIVITY-LIMIT"), makeKeyword("PRODUCTIVITY-LIMIT") });
        $ic11$ = ConsesLow.list((SubLObject)makeKeyword("MAX-PROBLEM-COUNT"), (SubLObject)makeKeyword("PRODUCTIVITY-LIMIT"), (SubLObject)makeKeyword("REMOVAL-BACKTRACKING-PRODUCTIVITY-LIMIT"));
        $ic12$ = makeString("Invalid value for the properties ~a : ~a");
        $ic13$ = makeString("unexpected property ~s");
        $ic14$ = makeSymbol("S#26782", "CYC");
        $ic15$ = makeKeyword("UNDETERMINED");
        $ic16$ = ConsesLow.list((SubLObject)makeKeyword("MAX-TIME"), (SubLObject)ZERO_INTEGER);
        $ic17$ = (SubLList)ConsesLow.cons((SubLObject)makeSymbol("FIRST"), (SubLObject)makeSymbol("REST"));
        $ic18$ = makeKeyword("BINDINGS");
        $ic19$ = makeKeyword("MAX-PROBLEM-COUNT");
        $ic20$ = makeKeyword("MAX-TIME");
        $ic21$ = makeKeyword("MAX-STEP");
        $ic22$ = makeKeyword("PROBABLY-APPROXIMATELY-DONE");
        $ic23$ = (SubLFloat)makeDouble(1.0);
        $ic24$ = makeKeyword("SKIP");
        $ic25$ = makeKeyword("ILL-FORMED");
        $ic26$ = makeKeyword("INTERMEDIATE-STEP-VALIDATION-LEVEL");
        $ic27$ = makeKeyword("MAX-NUMBER");
        $ic28$ = (SubLFloat)makeDouble(1.1);
        $ic29$ = makeKeyword("ALLOW-INDETERMINATE-RESULTS?");
        $ic30$ = makeKeyword("ANSWER-LANGUAGE");
        $ic31$ = makeKeyword("HL");
        $ic32$ = makeKeyword("EL");
        $ic33$ = ConsesLow.list((SubLObject)makeKeyword("INTERMEDIATE-STEP-VALIDATION-LEVEL"), (SubLObject)makeKeyword("MAX-TIME"), (SubLObject)makeKeyword("MAX-STEP"), (SubLObject)makeKeyword("PROBABLY-APPROXIMATELY-DONE"), (SubLObject)makeKeyword("ALLOW-INDETERMINATE-RESULTS?"), (SubLObject)makeKeyword("ANSWER-LANGUAGE"), (SubLObject)makeKeyword("BINDINGS"));
        $ic34$ = makeSymbol("HL-SUPPORT-P");
        $ic35$ = makeKeyword("PRODUCTIVITY-LIMIT");
        $ic36$ = makeKeyword("MAX-TRANSFORMATION-DEPTH");
        $ic37$ = makeKeyword("TRANSFORMATION-ALLOWED?");
        $ic38$ = makeKeyword("ALLOW-EVALUATABLE-PREDICATE-TRANSFORMATION?");
        $ic39$ = makeKeyword("REWRITE-ALLOWED?");
        $ic40$ = makeKeyword("ABDUCTION-ALLOWED?");
        $ic41$ = makeKeyword("ALLOW-UNBOUND-PREDICATE-TRANSFORMATION?");
        $ic42$ = makeKeyword("TRANS-ISA-POS");
        $ic43$ = makeKeyword("ALLOW-HL-PREDICATE-TRANSFORMATION?");
        $ic44$ = makeKeyword("REMOVAL-TVA-UNIFY-CLOSURE");
        $ic45$ = makeKeyword("TRANSITIVE-CLOSURE-MODE");
        $ic46$ = makeKeyword("EVALUATE-SUBL-ALLOWED?");
        $ic47$ = makeKeyword("NEW-TERMS-ALLOWED?");
        $ic48$ = makeKeyword("MINIMIZE");
        $ic49$ = makeKeyword("NEGATION-BY-FAILURE?");
        $ic50$ = makeKeyword("ABNORMAL");
        $ic51$ = makeKeyword("ALLOW-ABNORMALITY-CHECKING?");
        $ic52$ = makeKeyword("COMPLETENESS-MINIMIZATION-ALLOWED?");
        $ic53$ = makeKeyword("MAX-PROOF-DEPTH");
        $ic54$ = (SubLList)ConsesLow.cons((SubLObject)makeSymbol("S#137", "CYC"), (SubLObject)makeSymbol("S#10130", "CYC"));
        $ic55$ = makeSymbol("S#31850", "CYC");
        $ic56$ = makeSymbol("S#31851", "CYC");
        $ic57$ = ConsesLow.list((SubLObject)ConsesLow.list(new SubLObject[] { makeKeyword("MINIMAL"), makeKeyword("NEW-TERMS-ALLOWED?"), NIL, makeKeyword("MAX-PROOF-DEPTH"), FIFTEEN_INTEGER, makeKeyword("REMOVAL-BACKTRACKING-PRODUCTIVITY-LIMIT"), ZERO_INTEGER, makeKeyword("ADD-RESTRICTION-LAYER-OF-INDIRECTION?"), T, makeKeyword("TRANSITIVE-CLOSURE-MODE"), makeKeyword("NONE"), makeKeyword("MAX-PROBLEM-COUNT"), makeInteger(100000), makeKeyword("PRODUCTIVITY-LIMIT"), makeInteger(20000000), makeKeyword("ALLOW-UNBOUND-PREDICATE-TRANSFORMATION?"), NIL, makeKeyword("ALLOW-EVALUATABLE-PREDICATE-TRANSFORMATION?"), NIL, makeKeyword("ALLOW-HL-PREDICATE-TRANSFORMATION?"), NIL, makeKeyword("MAX-TRANSFORMATION-DEPTH"), ZERO_INTEGER, makeKeyword("MIN-RULE-UTILITY"), makeInteger(-100), makeKeyword("TRANSFORMATION-ALLOWED?"), NIL }), (SubLObject)ConsesLow.list(new SubLObject[] { makeKeyword("SHALLOW"), makeKeyword("NEW-TERMS-ALLOWED?"), NIL, makeKeyword("MAX-PROOF-DEPTH"), NIL, makeKeyword("REMOVAL-BACKTRACKING-PRODUCTIVITY-LIMIT"), ZERO_INTEGER, makeKeyword("ADD-RESTRICTION-LAYER-OF-INDIRECTION?"), T, makeKeyword("TRANSITIVE-CLOSURE-MODE"), makeKeyword("NONE"), makeKeyword("MAX-PROBLEM-COUNT"), makeInteger(100000), makeKeyword("PRODUCTIVITY-LIMIT"), makeInteger(20000000), makeKeyword("ALLOW-UNBOUND-PREDICATE-TRANSFORMATION?"), NIL, makeKeyword("ALLOW-EVALUATABLE-PREDICATE-TRANSFORMATION?"), T, makeKeyword("ALLOW-HL-PREDICATE-TRANSFORMATION?"), NIL, makeKeyword("MAX-TRANSFORMATION-DEPTH"), ONE_INTEGER, makeKeyword("MIN-RULE-UTILITY"), makeInteger(-100), makeKeyword("TRANSFORMATION-ALLOWED?"), T }), (SubLObject)ConsesLow.list(new SubLObject[] { makeKeyword("EXTENDED"), makeKeyword("NEW-TERMS-ALLOWED?"), T, makeKeyword("MAX-PROOF-DEPTH"), NIL, makeKeyword("REMOVAL-BACKTRACKING-PRODUCTIVITY-LIMIT"), ZERO_INTEGER, makeKeyword("ADD-RESTRICTION-LAYER-OF-INDIRECTION?"), T, makeKeyword("TRANSITIVE-CLOSURE-MODE"), makeKeyword("NONE"), makeKeyword("MAX-PROBLEM-COUNT"), makeInteger(100000), makeKeyword("PRODUCTIVITY-LIMIT"), makeInteger(20000000), makeKeyword("ALLOW-UNBOUND-PREDICATE-TRANSFORMATION?"), NIL, makeKeyword("ALLOW-EVALUATABLE-PREDICATE-TRANSFORMATION?"), T, makeKeyword("ALLOW-HL-PREDICATE-TRANSFORMATION?"), NIL, makeKeyword("MAX-TRANSFORMATION-DEPTH"), TWO_INTEGER, makeKeyword("MIN-RULE-UTILITY"), makeInteger(-100), makeKeyword("TRANSFORMATION-ALLOWED?"), T }), (SubLObject)ConsesLow.list(new SubLObject[] { makeKeyword("MAXIMAL"), makeKeyword("NEW-TERMS-ALLOWED?"), T, makeKeyword("MAX-PROOF-DEPTH"), NIL, makeKeyword("REMOVAL-BACKTRACKING-PRODUCTIVITY-LIMIT"), makeKeyword("POSITIVE-INFINITY"), makeKeyword("ADD-RESTRICTION-LAYER-OF-INDIRECTION?"), T, makeKeyword("TRANSITIVE-CLOSURE-MODE"), makeKeyword("ALL"), makeKeyword("MAX-PROBLEM-COUNT"), makeKeyword("POSITIVE-INFINITY"), makeKeyword("PRODUCTIVITY-LIMIT"), makeKeyword("POSITIVE-INFINITY"), makeKeyword("ALLOW-UNBOUND-PREDICATE-TRANSFORMATION?"), T, makeKeyword("ALLOW-EVALUATABLE-PREDICATE-TRANSFORMATION?"), T, makeKeyword("ALLOW-HL-PREDICATE-TRANSFORMATION?"), T, makeKeyword("MAX-TRANSFORMATION-DEPTH"), NIL, makeKeyword("MIN-RULE-UTILITY"), makeInteger(-100), makeKeyword("TRANSFORMATION-ALLOWED?"), T }));
        $ic58$ = makeSymbol("S#26597", "CYC");
        $ic59$ = makeKeyword("MIN-RULE-UTILITY");
    }
}

/*
	DECOMPILATION REPORT

	Decompiled from: G:\opt\CYC_JRTL_with_CommonLisp\platform\lib\cyc-oc4.0-unzipped/com/cyc/cycjava/cycl/class
	Total time: 367 ms
	
	Decompiled with Procyon 0.5.32.
*/