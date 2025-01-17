package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.BinaryFunction;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.UnaryFunction;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Mapping;
import java.util.Map;
import java.util.Iterator;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Locks;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Strings;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Vectors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class module0756 extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.module0756";
    public static final String myFingerPrint = "696ad287d3e9d89e83179c3afafa36a5a1914201ef5dee3482b49156a445f7af";
    public static SubLSymbol $g6068$;
    public static SubLSymbol $g6069$;
    private static SubLSymbol $g6070$;
    private static SubLSymbol $g6071$;
    private static SubLSymbol $g6072$;
    private static SubLSymbol $g6073$;
    private static SubLSymbol $g6074$;
    private static SubLSymbol $g6075$;
    public static SubLSymbol $g6076$;
    private static SubLSymbol $g6077$;
    public static SubLSymbol $g6078$;
    private static SubLSymbol $g6079$;
    private static SubLSymbol $g6080$;
    private static SubLSymbol $g6081$;
    private static SubLSymbol $g6082$;
    private static SubLSymbol $g6083$;
    private static final SubLString $ic0$;
    private static final SubLString $ic1$;
    private static final SubLList $ic2$;
    private static final SubLSymbol $ic3$;
    private static final SubLList $ic4$;
    private static final SubLSymbol $ic5$;
    private static final SubLSymbol $ic6$;
    private static final SubLSymbol $ic7$;
    private static final SubLSymbol $ic8$;
    private static final SubLSymbol $ic9$;
    private static final SubLString $ic10$;
    private static final SubLString $ic11$;
    private static final SubLString $ic12$;
    private static final SubLList $ic13$;
    private static final SubLList $ic14$;
    private static final SubLSymbol $ic15$;
    private static final SubLString $ic16$;
    private static final SubLString $ic17$;
    private static final SubLString $ic18$;
    private static final SubLString $ic19$;
    private static final SubLString $ic20$;
    private static final SubLString $ic21$;
    private static final SubLString $ic22$;
    private static final SubLString $ic23$;
    private static final SubLString $ic24$;
    private static final SubLSymbol $ic25$;
    private static final SubLString $ic26$;
    private static final SubLInteger $ic27$;
    private static final SubLSymbol $ic28$;
    private static final SubLInteger $ic29$;
    private static final SubLList $ic30$;
    private static final SubLSymbol $ic31$;
    private static final SubLList $ic32$;
    private static final SubLList $ic33$;
    private static final SubLList $ic34$;
    private static final SubLSymbol $ic35$;
    private static final SubLList $ic36$;
    private static final SubLSymbol $ic37$;
    private static final SubLSymbol $ic38$;
    private static final SubLList $ic39$;
    private static final SubLSymbol $ic40$;
    private static final SubLSymbol $ic41$;
    private static final SubLSymbol $ic42$;
    private static final SubLString $ic43$;
    private static final SubLString $ic44$;
    private static final SubLSymbol $ic45$;
    private static final SubLString $ic46$;
    private static final SubLString $ic47$;
    private static final SubLString $ic48$;
    private static final SubLString $ic49$;
    private static final SubLString $ic50$;
    private static final SubLSymbol $ic51$;
    private static final SubLString $ic52$;
    private static final SubLString $ic53$;
    private static final SubLString $ic54$;
    private static final SubLString $ic55$;
    private static final SubLString $ic56$;
    private static final SubLString $ic57$;
    private static final SubLList $ic58$;
    private static final SubLSymbol $ic59$;
    private static final SubLSymbol $ic60$;
    private static final SubLSymbol $ic61$;
    private static final SubLList $ic62$;
    private static final SubLSymbol $ic63$;
    private static final SubLSymbol $ic64$;
    private static final SubLSymbol $ic65$;
    private static final SubLSymbol $ic66$;
    private static final SubLSymbol $ic67$;
    private static final SubLSymbol $ic68$;
    private static final SubLSymbol $ic69$;
    private static final SubLSymbol $ic70$;
    private static final SubLSymbol $ic71$;
    private static final SubLSymbol $ic72$;
    private static final SubLSymbol $ic73$;
    private static final SubLSymbol $ic74$;
    private static final SubLSymbol $ic75$;
    private static final SubLList $ic76$;
    private static final SubLSymbol $ic77$;
    private static final SubLSymbol $ic78$;
    private static final SubLSymbol $ic79$;
    private static final SubLSymbol $ic80$;
    private static final SubLList $ic81$;
    private static final SubLString $ic82$;
    private static final SubLInteger $ic83$;
    private static final SubLList $ic84$;
    private static final SubLSymbol $ic85$;
    private static final SubLSymbol $ic86$;
    private static final SubLSymbol $ic87$;
    private static final SubLList $ic88$;
    private static final SubLSymbol $ic89$;
    private static final SubLString $ic90$;
    private static final SubLList $ic91$;
    private static final SubLObject $ic92$;
    private static final SubLSymbol $ic93$;
    private static final SubLString $ic94$;
    private static final SubLSymbol $ic95$;
    private static final SubLSymbol $ic96$;
    private static final SubLList $ic97$;
    private static final SubLObject $ic98$;
    private static final SubLObject $ic99$;
    private static final SubLObject $ic100$;
    private static final SubLObject $ic101$;
    private static final SubLObject $ic102$;
    private static final SubLSymbol $ic103$;
    private static final SubLObject $ic104$;
    private static final SubLSymbol $ic105$;
    private static final SubLObject $ic106$;
    private static final SubLSymbol $ic107$;
    private static final SubLSymbol $ic108$;
    private static final SubLObject $ic109$;
    private static final SubLObject $ic110$;
    private static final SubLSymbol $ic111$;
    private static final SubLObject $ic112$;
    private static final SubLList $ic113$;
    private static final SubLObject $ic114$;
    private static final SubLObject $ic115$;
    private static final SubLObject $ic116$;
    private static final SubLObject $ic117$;
    private static final SubLSymbol $ic118$;
    private static final SubLObject $ic119$;
    private static final SubLObject $ic120$;
    private static final SubLObject $ic121$;
    private static final SubLObject $ic122$;
    private static final SubLSymbol $ic123$;
    private static final SubLList $ic124$;
    private static final SubLString $ic125$;
    private static final SubLSymbol $ic126$;
    private static final SubLSymbol $ic127$;
    private static final SubLSymbol $ic128$;
    private static final SubLObject $ic129$;
    private static final SubLList $ic130$;
    private static final SubLList $ic131$;
    private static final SubLList $ic132$;
    private static final SubLObject $ic133$;
    private static final SubLObject $ic134$;
    private static final SubLSymbol $ic135$;
    private static final SubLString $ic136$;
    private static final SubLObject $ic137$;
    private static final SubLString $ic138$;
    private static final SubLObject $ic139$;
    private static final SubLString $ic140$;
    private static final SubLString $ic141$;
    private static final SubLSymbol $ic142$;
    private static final SubLSymbol $ic143$;
    private static final SubLSymbol $ic144$;
    private static final SubLSymbol $ic145$;
    private static final SubLSymbol $ic146$;
    private static final SubLSymbol $ic147$;
    private static final SubLSymbol $ic148$;
    private static final SubLSymbol $ic149$;
    private static final SubLSymbol $ic150$;
    private static final SubLSymbol $ic151$;
    private static final SubLSymbol $ic152$;
    private static final SubLSymbol $ic153$;
    private static final SubLSymbol $ic154$;
    private static final SubLSymbol $ic155$;
    private static final SubLSymbol $ic156$;
    private static final SubLSymbol $ic157$;
    private static final SubLString $ic158$;
    private static final SubLSymbol $ic159$;
    private static final SubLString $ic160$;
    private static final SubLSymbol $ic161$;
    private static final SubLObject $ic162$;
    private static final SubLSymbol $ic163$;
    private static final SubLString $ic164$;
    private static final SubLObject $ic165$;
    private static final SubLObject $ic166$;
    private static final SubLString $ic167$;
    private static final SubLSymbol $ic168$;
    private static final SubLList $ic169$;
    private static final SubLString $ic170$;
    private static final SubLString $ic171$;
    private static final SubLString $ic172$;
    private static final SubLString $ic173$;
    private static final SubLString $ic174$;
    private static final SubLInteger $ic175$;
    private static final SubLList $ic176$;
    private static final SubLSymbol $ic177$;
    private static final SubLSymbol $ic178$;
    private static final SubLList $ic179$;
    private static final SubLSymbol $ic180$;
    private static final SubLSymbol $ic181$;
    private static final SubLSymbol $ic182$;
    private static final SubLSymbol $ic183$;
    private static final SubLSymbol $ic184$;
    private static final SubLSymbol $ic185$;
    private static final SubLSymbol $ic186$;
    private static final SubLList $ic187$;
    private static final SubLSymbol $ic188$;
    private static final SubLString $ic189$;
    private static final SubLString $ic190$;
    private static final SubLObject $ic191$;
    private static final SubLString $ic192$;
    private static final SubLString $ic193$;
    private static final SubLSymbol $ic194$;
    private static final SubLSymbol $ic195$;
    private static final SubLSymbol $ic196$;
    private static final SubLSymbol $ic197$;
    private static final SubLSymbol $ic198$;
    private static final SubLObject $ic199$;
    private static final SubLSymbol $ic200$;
    private static final SubLSymbol $ic201$;
    private static final SubLString $ic202$;
    private static final SubLSymbol $ic203$;
    private static final SubLString $ic204$;
    private static final SubLString $ic205$;
    private static final SubLSymbol $ic206$;
    private static final SubLSymbol $ic207$;
    private static final SubLSymbol $ic208$;
    private static final SubLString $ic209$;
    private static final SubLList $ic210$;
    private static final SubLString $ic211$;
    private static final SubLString $ic212$;
    private static final SubLList $ic213$;
    private static final SubLList $ic214$;
    private static final SubLSymbol $ic215$;
    private static final SubLSymbol $ic216$;
    private static final SubLSymbol $ic217$;
    private static final SubLString $ic218$;
    private static final SubLString $ic219$;
    private static final SubLString $ic220$;
    private static final SubLSymbol $ic221$;
    private static final SubLString $ic222$;
    private static final SubLString $ic223$;
    private static final SubLString $ic224$;
    private static final SubLString $ic225$;
    private static final SubLString $ic226$;
    private static final SubLString $ic227$;
    private static final SubLString $ic228$;
    private static final SubLSymbol $ic229$;
    private static final SubLSymbol $ic230$;
    private static final SubLObject $ic231$;
    private static final SubLObject $ic232$;
    private static final SubLObject $ic233$;
    private static final SubLObject $ic234$;
    private static final SubLList $ic235$;
    private static final SubLObject $ic236$;
    private static final SubLObject $ic237$;
    private static final SubLSymbol $ic238$;
    private static final SubLInteger $ic239$;
    private static final SubLString $ic240$;
    private static final SubLString $ic241$;
    private static final SubLString $ic242$;
    private static final SubLString $ic243$;
    private static final SubLString $ic244$;
    private static final SubLList $ic245$;
    private static final SubLList $ic246$;
    private static final SubLString $ic247$;
    private static final SubLSymbol $ic248$;
    private static final SubLObject $ic249$;
    private static final SubLString $ic250$;
    private static final SubLSymbol $ic251$;
    private static final SubLSymbol $ic252$;
    private static final SubLString $ic253$;
    private static final SubLString $ic254$;
    private static final SubLString $ic255$;
    private static final SubLSymbol $ic256$;
    private static final SubLString $ic257$;
    private static final SubLString $ic258$;
    private static final SubLSymbol $ic259$;
    private static final SubLSymbol $ic260$;
    private static final SubLSymbol $ic261$;
    private static final SubLSymbol $ic262$;
    private static final SubLSymbol $ic263$;
    private static final SubLString $ic264$;
    private static final SubLString $ic265$;
    private static final SubLString $ic266$;
    private static final SubLList $ic267$;
    private static final SubLString $ic268$;
    private static final SubLString $ic269$;
    private static final SubLSymbol $ic270$;
    private static final SubLSymbol $ic271$;
    private static final SubLString $ic272$;
    private static final SubLString $ic273$;
    private static final SubLString $ic274$;
    private static final SubLString $ic275$;
    private static final SubLSymbol $ic276$;
    private static final SubLString $ic277$;
    private static final SubLString $ic278$;
    private static final SubLString $ic279$;
    private static final SubLSymbol $ic280$;
    private static final SubLList $ic281$;
    private static final SubLString $ic282$;
    private static final SubLList $ic283$;
    private static final SubLSymbol $ic284$;
    private static final SubLObject $ic285$;
    private static final SubLSymbol $ic286$;
    private static final SubLSymbol $ic287$;
    private static final SubLString $ic288$;
    private static final SubLString $ic289$;
    private static final SubLString $ic290$;
    private static final SubLString $ic291$;
    private static final SubLSymbol $ic292$;
    private static final SubLSymbol $ic293$;
    private static final SubLObject $ic294$;
    private static final SubLString $ic295$;
    private static final SubLString $ic296$;
    private static final SubLString $ic297$;
    private static final SubLString $ic298$;
    private static final SubLString $ic299$;
    private static final SubLString $ic300$;
    private static final SubLString $ic301$;
    private static final SubLString $ic302$;
    
    
    public static SubLObject f47463(final SubLObject var1, SubLObject var2, SubLObject var3) {
        if (var2 == UNPROVIDED) {
            var2 = module0751.f47200();
        }
        if (var3 == UNPROVIDED) {
            var3 = module0579.$g4331$.getDynamicValue();
        }
        final SubLThread var4 = SubLProcess.currentSubLThread();
        if (NIL != module0762.f48210(var1)) {
            SubLObject var5 = (SubLObject)NIL;
            final SubLObject var6 = module0579.$g4331$.currentBinding(var4);
            try {
                module0579.$g4331$.bind(var3, var4);
                var5 = module0763.f48248(var1, var2);
            }
            finally {
                module0579.$g4331$.rebind(var6, var4);
            }
            return var5;
        }
        final SubLObject var7 = module0749.f46494((SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        f47464(var7, var2);
        f47465(var7, var1);
        if (NIL != f47466(f47467(var7))) {
            f47468(var7, var1);
        }
        final SubLObject var8 = module0751.f47211(var2);
        f47469(var7, var8);
        if (NIL != module0751.f46819(var1)) {
            if (NIL != var3) {
                if (NIL != module0578.f35470((SubLObject)ONE_INTEGER)) {
                    PrintLow.format((SubLObject)T, (SubLObject)$ic0$, var1);
                }
                f47464(var7, module0751.f46691());
                module0770.f49065(var7, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
            }
            else if (NIL != module0578.f35470((SubLObject)TWO_INTEGER)) {
                PrintLow.format((SubLObject)T, (SubLObject)$ic1$, var1);
            }
        }
        return var7;
    }
    
    public static SubLObject f47470(final SubLObject var9, final SubLObject var10) {
        SubLObject var12;
        final SubLObject var11 = var12 = var9.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var12, var11, (SubLObject)$ic2$);
        final SubLObject var13 = var12.rest();
        var12 = var12.first();
        SubLObject var14 = (SubLObject)NIL;
        SubLObject var15 = (SubLObject)NIL;
        SubLObject var16 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var12, var11, (SubLObject)$ic2$);
        var14 = var12.first();
        var12 = var12.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var12, var11, (SubLObject)$ic2$);
        var15 = var12.first();
        var12 = var12.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var12, var11, (SubLObject)$ic2$);
        var16 = var12.first();
        var12 = var12.rest();
        if (NIL == var12) {
            final SubLObject var17;
            var12 = (var17 = var13);
            return (SubLObject)ConsesLow.list((SubLObject)$ic3$, (SubLObject)ConsesLow.list(reader.bq_cons(var16, (SubLObject)$ic4$)), (SubLObject)ConsesLow.list((SubLObject)$ic5$, (SubLObject)ConsesLow.list((SubLObject)$ic6$, (SubLObject)ConsesLow.list((SubLObject)$ic7$, var15)), (SubLObject)ConsesLow.listS((SubLObject)$ic8$, (SubLObject)ConsesLow.list(var14, var15), ConsesLow.append(var17, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)$ic9$, var16))))));
        }
        cdestructuring_bind.cdestructuring_bind_error(var11, (SubLObject)$ic2$);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f47471(final SubLObject var7, SubLObject var17) {
        if (var17 == UNPROVIDED) {
            var17 = (SubLObject)T;
        }
        f47472(var7, var17, (SubLObject)T);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f47473(final SubLObject var7, SubLObject var17) {
        if (var17 == UNPROVIDED) {
            var17 = (SubLObject)T;
        }
        f47472(var7, var17, (SubLObject)NIL);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f47472(final SubLObject var7, SubLObject var17, SubLObject var18) {
        if (var17 == UNPROVIDED) {
            var17 = (SubLObject)T;
        }
        if (var18 == UNPROVIDED) {
            var18 = (SubLObject)NIL;
        }
        return f47474(var7, var17, (SubLObject)$ic10$, var18, (SubLObject)ONE_INTEGER);
    }
    
    public static SubLObject f47474(final SubLObject var7, final SubLObject var17, final SubLObject var19, final SubLObject var18, final SubLObject var20) {
        final SubLThread var21 = SubLProcess.currentSubLThread();
        final SubLObject var22 = Equality.eql((SubLObject)ONE_INTEGER, var20);
        SubLObject var23 = (SubLObject)ZERO_INTEGER;
        final SubLObject var24 = (SubLObject)THREE_INTEGER;
        final SubLObject var25 = (SubLObject)((NIL != var18) ? FOUR_INTEGER : ONE_INTEGER);
        SubLObject var26 = (SubLObject)NIL;
        if (NIL == var22) {
            PrintLow.format(var17, (SubLObject)$ic11$, var19);
        }
        PrintLow.format(var17, (SubLObject)$ic12$, f47475(var7));
        SubLObject var27;
        SubLObject var28;
        SubLObject var30;
        SubLObject var29;
        SubLObject var31;
        SubLObject var32;
        SubLObject var33;
        for (var27 = (SubLObject)NIL, var27 = (SubLObject)$ic13$; NIL == var26 && NIL != var27; var27 = var27.rest()) {
            var28 = var27.first();
            var29 = (var30 = var28);
            var31 = (SubLObject)NIL;
            var32 = (SubLObject)NIL;
            cdestructuring_bind.destructuring_bind_must_consp(var30, var29, (SubLObject)$ic14$);
            var31 = var30.first();
            var30 = (var32 = var30.rest());
            if (NIL != Symbols.fboundp(var31)) {
                var33 = Functions.funcall(var31, var7);
                if (NIL != var33 && NIL == f47476(var33) && NIL == module0749.f46385(var33) && $ic15$ != var33) {
                    if (NIL != module0581.f35648(var33)) {
                        var33 = module0581.f35681(var33, (SubLObject)UNPROVIDED);
                    }
                    if (NIL != var18) {
                        PrintLow.format(var17, (SubLObject)$ic16$, var32, var33);
                    }
                    else {
                        PrintLow.format(var17, (SubLObject)$ic17$, var33);
                    }
                    var23 = Numbers.add(var23, (SubLObject)ONE_INTEGER);
                    if (NIL == var18) {
                        var26 = Numbers.numGE(var23, var24);
                    }
                }
            }
        }
        final SubLObject var34 = f47477(var7);
        if (NIL != f47478(var7)) {
            if (var20.numL(var25)) {
                SubLObject var35 = (SubLObject)ZERO_INTEGER;
                if (module0743.f45996(var7).isVector()) {
                    final SubLObject var36 = module0743.f45996(var7);
                    final SubLObject var37 = (SubLObject)NIL;
                    SubLObject var38;
                    SubLObject var39;
                    SubLObject var40;
                    SubLObject var41;
                    SubLObject var42;
                    SubLObject var43;
                    for (var38 = Sequences.length(var36), var39 = (SubLObject)NIL, var39 = (SubLObject)ZERO_INTEGER; var39.numL(var38); var39 = Numbers.add(var39, (SubLObject)ONE_INTEGER)) {
                        var40 = ((NIL != var37) ? Numbers.subtract(var38, var39, (SubLObject)ONE_INTEGER) : var39);
                        var41 = Vectors.aref(var36, var40);
                        var42 = (SubLObject)((NIL != var22) ? module0038.$g916$.getGlobalValue() : $ic18$);
                        var43 = Sequences.cconcatenate(var19, new SubLObject[] { var42, print_high.princ_to_string(var35) });
                        if (var35.eql(var34)) {
                            var43 = Sequences.cconcatenate(var43, (SubLObject)$ic19$);
                        }
                        f47474(var41, var17, var43, var18, module0048.f_1X(var20));
                        var35 = Numbers.add(var35, (SubLObject)ONE_INTEGER);
                    }
                }
            }
            else if (NIL == var26) {
                PrintLow.format(var17, (SubLObject)$ic20$);
                SubLObject var35 = (SubLObject)ZERO_INTEGER;
                if (module0743.f45996(var7).isVector()) {
                    final SubLObject var36 = module0743.f45996(var7);
                    final SubLObject var37 = (SubLObject)NIL;
                    SubLObject var38;
                    SubLObject var39;
                    SubLObject var40;
                    SubLObject var41;
                    for (var38 = Sequences.length(var36), var39 = (SubLObject)NIL, var39 = (SubLObject)ZERO_INTEGER; var39.numL(var38); var39 = Numbers.add(var39, (SubLObject)ONE_INTEGER)) {
                        var40 = ((NIL != var37) ? Numbers.subtract(var38, var39, (SubLObject)ONE_INTEGER) : var39);
                        var41 = Vectors.aref(var36, var40);
                        if (var35.eql(var34)) {
                            print_high.princ((SubLObject)$ic21$, var17);
                        }
                        if (NIL != f47479(var41)) {
                            PrintLow.format(var17, (SubLObject)$ic22$, f47480(var41, (SubLObject)UNPROVIDED));
                        }
                        else if (NIL != $g6068$.getDynamicValue(var21)) {
                            PrintLow.format(var17, (SubLObject)$ic23$, f47481(var41, (SubLObject)UNPROVIDED), f47482(var41));
                        }
                        else {
                            PrintLow.format(var17, (SubLObject)$ic22$, f47481(var41, (SubLObject)UNPROVIDED), f47482(var41));
                        }
                        var35 = Numbers.add(var35, (SubLObject)ONE_INTEGER);
                    }
                }
            }
        }
        print_high.princ((SubLObject)$ic24$, var17);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f47483(final SubLObject var7) {
        final SubLThread var8 = SubLProcess.currentSubLThread();
        final SubLObject var9 = module0749.f46494((SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        final SubLObject var10 = (SubLObject)NIL;
        final SubLObject var11 = module0579.$g4339$.currentBinding(var8);
        try {
            module0579.$g4339$.bind((SubLObject)T, var8);
            f47484(var7, var9, var10);
        }
        finally {
            module0579.$g4339$.rebind(var11, var8);
        }
        return var9;
    }
    
    public static SubLObject f47485(final SubLObject var7, final SubLObject var43) {
        final SubLThread var44 = SubLProcess.currentSubLThread();
        f47486(f47487(var43, (SubLObject)UNPROVIDED), f47481(var43, (SubLObject)UNPROVIDED), f47488(var43, (SubLObject)UNPROVIDED), (SubLObject)UNPROVIDED);
        f47489(var7, var43);
        f47490(var7);
        f47491(var7);
        final SubLObject var45 = module0579.$g4339$.currentBinding(var44);
        try {
            module0579.$g4339$.bind((SubLObject)T, var44);
            f47484(var43, var7, (SubLObject)NIL);
        }
        finally {
            module0579.$g4339$.rebind(var45, var44);
        }
        return var7;
    }
    
    public static SubLObject f47492(final SubLObject var1, final SubLObject var44, final SubLObject var45, SubLObject var46) {
        if (var46 == UNPROVIDED) {
            var46 = $g6069$.getDynamicValue();
        }
        if (NIL != var46) {
            Errors.warn((SubLObject)$ic26$, var1, var44, var45);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f47486(final SubLObject var1, final SubLObject var44, final SubLObject var45, SubLObject var46) {
        if (var46 == UNPROVIDED) {
            var46 = $g6069$.getDynamicValue();
        }
        final SubLThread var47 = SubLProcess.currentSubLThread();
        final SubLObject var48 = module0034.$g879$.getDynamicValue(var47);
        SubLObject var49 = (SubLObject)NIL;
        if (NIL == var48) {
            return f47492(var1, var44, var45, var46);
        }
        var49 = module0034.f1857(var48, (SubLObject)$ic25$, (SubLObject)UNPROVIDED);
        if (NIL == var49) {
            var49 = module0034.f1807(module0034.f1842(var48), (SubLObject)$ic25$, (SubLObject)FOUR_INTEGER, (SubLObject)$ic27$, (SubLObject)EQUAL, (SubLObject)UNPROVIDED);
            module0034.f1860(var48, (SubLObject)$ic25$, var49);
        }
        final SubLObject var50 = module0034.f1780(var1, var44, var45, var46);
        final SubLObject var51 = module0034.f1814(var49, var50, (SubLObject)UNPROVIDED);
        if (var51 != $ic28$) {
            SubLObject var52 = var51;
            SubLObject var53 = (SubLObject)NIL;
            var53 = var52.first();
            while (NIL != var52) {
                SubLObject var54 = var53.first();
                final SubLObject var55 = conses_high.second(var53);
                if (var1.equal(var54.first())) {
                    var54 = var54.rest();
                    if (var44.equal(var54.first())) {
                        var54 = var54.rest();
                        if (var45.equal(var54.first())) {
                            var54 = var54.rest();
                            if (NIL != var54 && NIL == var54.rest() && var46.equal(var54.first())) {
                                return module0034.f1959(var55);
                            }
                        }
                    }
                }
                var52 = var52.rest();
                var53 = var52.first();
            }
        }
        final SubLObject var56 = Values.arg2(var47.resetMultipleValues(), (SubLObject)Values.multiple_value_list(f47492(var1, var44, var45, var46)));
        module0034.f1836(var49, var50, var51, var56, (SubLObject)ConsesLow.list(var1, var44, var45, var46));
        return module0034.f1959(var56);
    }
    
    public static SubLObject f47484(final SubLObject var56, SubLObject var57, SubLObject var42) {
        if (var57 == UNPROVIDED) {
            var57 = (SubLObject)NIL;
        }
        if (var42 == UNPROVIDED) {
            var42 = (SubLObject)T;
        }
        if (NIL != module0759.f48038(var56)) {
            return module0759.f48043(var56, var57);
        }
        return f47493(var56, module0067.f4880((SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED), var57, var42, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f47494(final SubLObject var9, final SubLObject var10) {
        SubLObject var12;
        final SubLObject var11 = var12 = var9.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var12, var11, (SubLObject)$ic30$);
        final SubLObject var13 = var12.rest();
        var12 = var12.first();
        SubLObject var14 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var12, var11, (SubLObject)$ic30$);
        var14 = var12.first();
        var12 = var12.rest();
        if (NIL == var12) {
            final SubLObject var15;
            var12 = (var15 = var13);
            return (SubLObject)ConsesLow.list((SubLObject)$ic31$, (SubLObject)$ic32$, (SubLObject)$ic33$, (SubLObject)ConsesLow.list((SubLObject)$ic3$, (SubLObject)$ic34$, (SubLObject)ConsesLow.listS((SubLObject)$ic35$, var14, (SubLObject)$ic36$), (SubLObject)ConsesLow.listS((SubLObject)$ic37$, reader.bq_cons((SubLObject)$ic38$, ConsesLow.append(var15, (SubLObject)NIL)), (SubLObject)$ic39$)));
        }
        cdestructuring_bind.cdestructuring_bind_error(var11, (SubLObject)$ic30$);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f47495() {
        final SubLThread var4 = SubLProcess.currentSubLThread();
        return (NIL != module0054.f3959($g6070$.getDynamicValue(var4))) ? $g6070$.getDynamicValue(var4) : module0054.f3968();
    }
    
    public static SubLObject f47496(final SubLObject var61) {
        final SubLThread var62 = SubLProcess.currentSubLThread();
        assert NIL != module0054.f3959(module0580.$g4363$.getDynamicValue(var62)) : module0580.$g4363$.getDynamicValue(var62);
        return module0054.f3979(var61, module0580.$g4363$.getDynamicValue(var62), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f47493(final SubLObject var56, final SubLObject var62, SubLObject var57, SubLObject var42, SubLObject var63) {
        if (var57 == UNPROVIDED) {
            var57 = (SubLObject)NIL;
        }
        if (var42 == UNPROVIDED) {
            var42 = (SubLObject)T;
        }
        if (var63 == UNPROVIDED) {
            var63 = (SubLObject)NIL;
        }
        final SubLThread var64 = SubLProcess.currentSubLThread();
        if (NIL != module0578.f35470((SubLObject)THREE_INTEGER)) {
            PrintLow.format((SubLObject)T, (SubLObject)$ic43$, var56);
        }
        if (NIL == f47497(var57, (SubLObject)UNPROVIDED)) {
            final SubLObject var65 = module0067.f4884(var62, var56, (SubLObject)UNPROVIDED);
            if (NIL == f47497(var65, (SubLObject)UNPROVIDED)) {
                var57 = module0749.f46494((SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
            }
            else if (NIL != var63 && NIL == f47496(var65)) {
                if (NIL != module0578.f35470((SubLObject)TWO_INTEGER) && NIL == module0578.f35477()) {
                    Errors.warn((SubLObject)$ic44$, var65);
                }
                var57 = module0749.f46494((SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
            }
            else {
                if (NIL == var42 || NIL == module0749.f46420(var65, (SubLObject)$ic45$, (SubLObject)SIX_INTEGER, (SubLObject)UNPROVIDED)) {
                    if (NIL != module0578.f35470((SubLObject)THREE_INTEGER)) {
                        PrintLow.format((SubLObject)T, (SubLObject)$ic47$, var65);
                    }
                    return var65;
                }
                if (NIL != module0578.f35470((SubLObject)TWO_INTEGER)) {
                    PrintLow.format((SubLObject)T, (SubLObject)$ic46$, var65, var56);
                }
                var57 = var65;
            }
        }
        module0067.f4886(var62, var56, var57);
        final SubLObject var66 = module0749.f46416(var57);
        SubLObject var67;
        SubLObject var68;
        SubLObject var69;
        for (var67 = (SubLObject)NIL, var67 = var66; NIL != var67; var67 = conses_high.cddr(var67)) {
            var68 = var67.first();
            var69 = conses_high.cadr(var67);
            if (NIL != f47498(var68, var42)) {
                module0749.f46427(var57, var68);
            }
        }
        SubLObject var70 = (SubLObject)NIL;
        SubLObject var71 = (SubLObject)NIL;
        SubLObject var72 = (SubLObject)NIL;
        var70 = module0749.f46422();
        var71 = var70.first();
        for (var72 = (SubLObject)ZERO_INTEGER; NIL != var70; var70 = var70.rest(), var71 = var70.first(), var72 = Numbers.add((SubLObject)ONE_INTEGER, var72)) {
            if (NIL != f47498(var71, var42)) {
                module0749.f46500(var57, var72);
            }
        }
        module0749.f46426(var57, (SubLObject)$ic45$, (SubLObject)SIX_INTEGER, (SubLObject)makeBoolean(NIL == var42));
        if (var56.equal(var57)) {
            return var57;
        }
        if (NIL != module0054.f3959($g6070$.getDynamicValue(var64)) && module0054.f3967($g6070$.getDynamicValue(var64)).numG($g6071$.getDynamicValue(var64))) {
            final SubLObject var73 = Sequences.cconcatenate((SubLObject)$ic48$, new SubLObject[] { module0006.f205((SubLObject)ONE_INTEGER), $ic49$, module0006.f203((SubLObject)$ic50$) });
            module0578.f35476(var73, (SubLObject)ConsesLow.list($g6071$.getDynamicValue(var64)));
        }
        else {
            final SubLObject var74 = $g6070$.currentBinding(var64);
            try {
                $g6070$.bind(f47495(), var64);
                module0054.f3973(var56, $g6070$.getDynamicValue(var64));
                try {
                    final SubLObject var75 = f47499(var56);
                    f47500(var57, var75, (SubLObject)$ic51$);
                    if (NIL != module0578.f35470((SubLObject)FOUR_INTEGER)) {
                        PrintLow.format((SubLObject)T, (SubLObject)$ic52$, var75);
                    }
                    f47501(var57, f47502(f47467(var56)), (SubLObject)T);
                    if (NIL != module0578.f35470((SubLObject)FOUR_INTEGER)) {
                        PrintLow.format((SubLObject)T, (SubLObject)$ic53$, f47467(var57));
                    }
                    f47503(var57, f47481(var56, (SubLObject)NIL), (SubLObject)NIL);
                    if (NIL != module0578.f35470((SubLObject)FOUR_INTEGER)) {
                        PrintLow.format((SubLObject)T, (SubLObject)$ic54$, f47481(var57, (SubLObject)NIL));
                    }
                    if (NIL != f47479(var56)) {
                        final SubLObject var76 = f47504(var56, (SubLObject)NIL, (SubLObject)$ic15$);
                        f47505(var57, var76, (SubLObject)NIL);
                        if (NIL != module0578.f35470((SubLObject)ONE_INTEGER)) {
                            PrintLow.format((SubLObject)T, (SubLObject)$ic55$, (NIL != module0581.f35648(var76)) ? module0581.f35681(var76, (SubLObject)UNPROVIDED) : var76);
                        }
                    }
                    if (NIL != var42 && NIL != f47478(var56)) {
                        SubLObject var77 = (SubLObject)NIL;
                        SubLObject var78 = (SubLObject)ZERO_INTEGER;
                        if (module0743.f45996(var56).isVector()) {
                            final SubLObject var79 = module0743.f45996(var56);
                            final SubLObject var80 = (SubLObject)NIL;
                            SubLObject var81;
                            SubLObject var82;
                            SubLObject var83;
                            SubLObject var84;
                            SubLObject var85;
                            SubLObject var86;
                            for (var81 = Sequences.length(var79), var82 = (SubLObject)NIL, var82 = (SubLObject)ZERO_INTEGER; var82.numL(var81); var82 = Numbers.add(var82, (SubLObject)ONE_INTEGER)) {
                                var83 = ((NIL != var80) ? Numbers.subtract(var81, var82, (SubLObject)ONE_INTEGER) : var82);
                                var84 = Vectors.aref(var79, var83);
                                var85 = f47496(var57);
                                var86 = ((NIL != f47497(var84, (SubLObject)UNPROVIDED)) ? f47506(var78, var84, var62, var85) : var84);
                                var77 = (SubLObject)ConsesLow.cons(var86, var77);
                                var78 = Numbers.add(var78, (SubLObject)ONE_INTEGER);
                            }
                        }
                        f47507(var57, Sequences.nreverse(var77), (SubLObject)UNPROVIDED);
                    }
                    else {
                        f47507(var57, (SubLObject)NIL, (SubLObject)UNPROVIDED);
                    }
                    f47465(var57, f47487(var56, (SubLObject)UNPROVIDED));
                    final SubLObject var87 = f47482(var56);
                    if (NIL != module0749.f46374(var87)) {
                        if (NIL != module0578.f35470((SubLObject)FOUR_INTEGER)) {
                            PrintLow.format((SubLObject)T, (SubLObject)$ic56$, var87);
                        }
                        f47508(var57, module0749.f46388(var87, var62), (SubLObject)NIL);
                        if (NIL != module0578.f35470((SubLObject)FOUR_INTEGER)) {
                            PrintLow.format((SubLObject)T, (SubLObject)$ic57$, f47482(var57));
                        }
                    }
                    f47509(var57, conses_high.copy_list(f47510(var56)));
                    f47464(var57, f47511(var56));
                    final SubLObject var88 = module0749.f46416(var56);
                    SubLObject var89;
                    SubLObject var90;
                    SubLObject var91;
                    SubLObject var92;
                    for (var89 = (SubLObject)NIL, var89 = var88; NIL != var89; var89 = conses_high.cddr(var89)) {
                        var90 = var89.first();
                        var91 = conses_high.cadr(var89);
                        if (NIL != f47498(var90, var42)) {
                            var92 = ((NIL != f47497(var91, (SubLObject)UNPROVIDED)) ? f47512(var90, var91, var62, var42) : var91);
                            f47513(var57, var90, var92);
                        }
                    }
                    if (NIL != module0749.f46412(var56)) {
                        SubLObject var93 = (SubLObject)NIL;
                        SubLObject var94 = (SubLObject)NIL;
                        SubLObject var95 = (SubLObject)NIL;
                        var93 = module0749.f46422();
                        var94 = var93.first();
                        for (var95 = (SubLObject)ZERO_INTEGER; NIL != var93; var93 = var93.rest(), var94 = var93.first(), var95 = Numbers.add((SubLObject)ONE_INTEGER, var95)) {
                            if (NIL != f47498(var94, var42)) {
                                if (NIL != module0749.f46421(var56, var94, var95)) {
                                    var91 = module0749.f46420(var56, var94, var95, (SubLObject)UNPROVIDED);
                                    var92 = ((NIL != f47497(var91, (SubLObject)UNPROVIDED)) ? f47512(var94, var91, var62, var42) : var91);
                                    module0749.f46425(var57, var95, var92);
                                }
                                else {
                                    module0749.f46500(var57, var95);
                                }
                            }
                        }
                    }
                }
                finally {
                    final SubLObject var6_80 = Threads.$is_thread_performing_cleanupP$.currentBinding(var64);
                    try {
                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)T, var64);
                        module0054.f3974($g6070$.getDynamicValue(var64));
                    }
                    finally {
                        Threads.$is_thread_performing_cleanupP$.rebind(var6_80, var64);
                    }
                }
            }
            finally {
                $g6070$.rebind(var74, var64);
            }
        }
        return var57;
    }
    
    public static SubLObject f47498(final SubLObject var67, final SubLObject var42) {
        if (var67 == $ic45$) {
            return (SubLObject)NIL;
        }
        if (NIL == var42 && NIL != f47514(var67)) {
            return (SubLObject)NIL;
        }
        return (SubLObject)T;
    }
    
    public static SubLObject f47506(final SubLObject var15, final SubLObject var74, final SubLObject var62, final SubLObject var75) {
        return f47493(var74, var62, (SubLObject)NIL, (SubLObject)T, var75);
    }
    
    public static SubLObject f47512(final SubLObject var67, final SubLObject var78, final SubLObject var62, SubLObject var42) {
        if (var42 == UNPROVIDED) {
            var42 = (SubLObject)T;
        }
        return f47493(var78, var62, (SubLObject)NIL, var42, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f47515(final SubLObject var7) {
        final SubLObject var8 = f47516(var7);
        return (SubLObject)(var8.isVector() ? module0037.f2558(var8, (SubLObject)UNPROVIDED) : NIL);
    }
    
    public static SubLObject f47514(final SubLObject var67) {
        return module0004.f104(var67, $g6072$.getGlobalValue(), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f47517(final SubLObject var7) {
        final SubLObject var8 = f47480(var7, (SubLObject)NIL);
        if (NIL != var8) {
            return f47518(var8);
        }
        if (NIL != f47519(var7)) {
            SubLObject var9 = (SubLObject)ZERO_INTEGER;
            SubLObject var10 = (SubLObject)ZERO_INTEGER;
            if (module0743.f45996(var7).isVector()) {
                final SubLObject var11 = module0743.f45996(var7);
                final SubLObject var12 = (SubLObject)NIL;
                SubLObject var13;
                SubLObject var14;
                SubLObject var15;
                SubLObject var16;
                SubLObject var17;
                for (var13 = Sequences.length(var11), var14 = (SubLObject)NIL, var14 = (SubLObject)ZERO_INTEGER; var14.numL(var13); var14 = Numbers.add(var14, (SubLObject)ONE_INTEGER)) {
                    var15 = ((NIL != var12) ? Numbers.subtract(var13, var14, (SubLObject)ONE_INTEGER) : var14);
                    var16 = Vectors.aref(var11, var15);
                    var17 = f47517(var16);
                    if (var17.numG(var9)) {
                        var9 = var17;
                    }
                    var10 = Numbers.add(var10, (SubLObject)ONE_INTEGER);
                }
            }
            return var9;
        }
        if (NIL != f47478(var7)) {
            SubLObject var9 = (SubLObject)ZERO_INTEGER;
            SubLObject var10 = (SubLObject)ZERO_INTEGER;
            if (module0743.f45996(var7).isVector()) {
                final SubLObject var11 = module0743.f45996(var7);
                final SubLObject var12 = (SubLObject)NIL;
                SubLObject var13;
                SubLObject var14;
                SubLObject var15;
                SubLObject var16;
                for (var13 = Sequences.length(var11), var14 = (SubLObject)NIL, var14 = (SubLObject)ZERO_INTEGER; var14.numL(var13); var14 = Numbers.add(var14, (SubLObject)ONE_INTEGER)) {
                    var15 = ((NIL != var12) ? Numbers.subtract(var13, var14, (SubLObject)ONE_INTEGER) : var14);
                    var16 = Vectors.aref(var11, var15);
                    var9 = Numbers.add(var9, f47517(var16));
                    var10 = Numbers.add(var10, (SubLObject)ONE_INTEGER);
                }
            }
            return var9;
        }
        if (NIL != f47520(var7)) {
            return module0035.f2451(Symbols.symbol_function((SubLObject)$ic59$), f47487(var7, (SubLObject)UNPROVIDED), (SubLObject)UNPROVIDED);
        }
        return (SubLObject)ONE_INTEGER;
    }
    
    public static SubLObject f47518(final SubLObject var31) {
        final SubLObject var32 = module0581.f35666(var31, (SubLObject)UNPROVIDED);
        return Numbers.add(module0035.count_if_not((SubLObject)$ic60$, module0035.remove_if_not((SubLObject)$ic61$, var32, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED), module0035.count_if_not((SubLObject)$ic61$, var32, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED));
    }
    
    public static SubLObject f47521(final SubLObject var61) {
        return module0004.f104(var61, $g6073$.getGlobalValue(), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f47522(final SubLObject var61) {
        return (SubLObject)makeBoolean(NIL == var61 || NIL != f47521(var61));
    }
    
    public static SubLObject f47523(final SubLObject var7) {
        return module0749.f46420(var7, (SubLObject)$ic63$, (SubLObject)NINE_INTEGER, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f47524(final SubLObject var7, final SubLObject var85) {
        module0749.f46426(var7, (SubLObject)$ic63$, (SubLObject)NINE_INTEGER, var85);
        return var7;
    }
    
    public static SubLObject f47525(final SubLObject var7) {
        return f47524(var7, (SubLObject)NIL);
    }
    
    public static SubLObject f47526(final SubLObject var7) {
        return module0749.f46418(var7, (SubLObject)$ic64$, (SubLObject)NIL);
    }
    
    public static SubLObject f47527(final SubLObject var7, final SubLObject var86) {
        module0749.f46424(var7, (SubLObject)$ic64$, var86);
        return var7;
    }
    
    public static SubLObject f47528(final SubLObject var61) {
        return (SubLObject)makeBoolean(NIL != f47497(var61, (SubLObject)UNPROVIDED) && f47523(var61) == $ic65$);
    }
    
    public static SubLObject f47529(final SubLObject var87) {
        final SubLObject var88 = module0749.f46494((SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        f47524(var88, (SubLObject)$ic65$);
        final SubLObject var89 = module0205.f13277(var87, (SubLObject)UNPROVIDED);
        f47465(var88, var89);
        if (NIL == module0751.f46819(var89)) {
            module0758.f47951(var88);
        }
        return var88;
    }
    
    public static SubLObject f47530(final SubLObject var61) {
        return (SubLObject)makeBoolean(NIL != f47497(var61, (SubLObject)UNPROVIDED) && f47523(var61) == $ic66$);
    }
    
    public static SubLObject f47531(final SubLObject var87, SubLObject var2) {
        if (var2 == UNPROVIDED) {
            var2 = (SubLObject)NIL;
        }
        final SubLObject var88 = module0763.f48248(module0205.f13277(var87, (SubLObject)UNPROVIDED), module0751.f46693(var2, (SubLObject)$ic67$));
        final SubLObject var89 = module0763.f48248(module0205.f13368(var87, (SubLObject)UNPROVIDED), module0751.f46693(var2, (SubLObject)$ic68$));
        final SubLObject var90 = module0749.f46494((SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        f47464(var90, var2);
        f47532(var90);
        f47533(var90, (SubLObject)ONE_INTEGER);
        f47507(var90, (SubLObject)ConsesLow.list(var88, var89), (SubLObject)UNPROVIDED);
        final SubLObject var91 = module0751.f47095((SubLObject)ONE_INTEGER, (SubLObject)UNPROVIDED);
        final SubLObject var92 = module0751.f46991((SubLObject)$ic66$, var91);
        f47534(var88, var92, (SubLObject)UNPROVIDED);
        f47535(var90);
        f47535(var88);
        f47524(var88, (SubLObject)$ic66$);
        return var90;
    }
    
    public static SubLObject f47536(final SubLObject var61) {
        return (SubLObject)makeBoolean(NIL != f47497(var61, (SubLObject)UNPROVIDED) && f47523(var61) == $ic69$);
    }
    
    public static SubLObject f47537(final SubLObject var87) {
        final SubLObject var88 = module0749.f46494((SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        f47524(var88, (SubLObject)$ic69$);
        final SubLObject var89 = module0205.f13277(var87, (SubLObject)UNPROVIDED);
        module0749.f46424(var88, (SubLObject)$ic70$, var89);
        module0758.f47951(var88);
        return var88;
    }
    
    public static SubLObject f47538(final SubLObject var61) {
        return (SubLObject)makeBoolean(NIL != f47497(var61, (SubLObject)UNPROVIDED) && f47523(var61) == $ic71$);
    }
    
    public static SubLObject f47539(final SubLObject var87) {
        final SubLObject var88 = module0749.f46494((SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        final SubLObject var89 = module0205.f13277(var87, (SubLObject)UNPROVIDED);
        f47524(var88, (SubLObject)$ic71$);
        f47465(var88, var89);
        if (NIL == module0751.f46819(var89)) {
            module0758.f47951(var88);
        }
        return var88;
    }
    
    public static SubLObject f47540(final SubLObject var61) {
        return (SubLObject)makeBoolean(NIL != f47497(var61, (SubLObject)UNPROVIDED) && NIL != f47478(var61) && f47523(var61) == $ic72$);
    }
    
    public static SubLObject f47541(final SubLObject var87) {
        return f47542(module0763.f48264(module0205.f13277(var87, (SubLObject)UNPROVIDED), (SubLObject)UNPROVIDED));
    }
    
    public static SubLObject f47542(final SubLObject var7) {
        final SubLObject var8 = f47484(var7, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        f47524(var7, (SubLObject)$ic72$);
        f47543(var7, var8);
        return var7;
    }
    
    public static SubLObject f47544(final SubLObject var61) {
        return (SubLObject)makeBoolean(NIL != f47497(var61, (SubLObject)UNPROVIDED) && f47523(var61) == $ic73$);
    }
    
    public static SubLObject f47545(final SubLObject var87) {
        final SubLObject var88 = module0749.f46494((SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        f47524(var88, (SubLObject)$ic73$);
        f47465(var88, module0205.f13277(var87, (SubLObject)UNPROVIDED));
        return var88;
    }
    
    public static SubLObject f47546(final SubLObject var95) {
        return (SubLObject)makeBoolean(NIL != f47497(var95, (SubLObject)UNPROVIDED) && (NIL != f47519(var95) || NIL != f47547(var95) || NIL != f47540(var95) || NIL != f47548(var95) || NIL != f47549(var95) || NIL != f47550(var95) || NIL != f47551(var95) || NIL != f47552(var95)));
    }
    
    public static SubLObject f47550(final SubLObject var61) {
        return (SubLObject)makeBoolean(NIL != f47497(var61, (SubLObject)UNPROVIDED) && NIL != f47478(var61) && f47481(var61, (SubLObject)NIL) == $ic74$);
    }
    
    public static SubLObject f47553(final SubLObject var87, SubLObject var2) {
        if (var2 == UNPROVIDED) {
            var2 = module0751.f47200();
        }
        final SubLObject var88 = module0763.f48281(var87, var2);
        final SubLObject var89 = f47554(var88);
        return var89;
    }
    
    public static SubLObject f47554(final SubLObject var94) {
        final SubLObject var95 = f47484(var94, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        f47503(var95, (SubLObject)$ic74$, (SubLObject)UNPROVIDED);
        f47543(var95, var94);
        return var95;
    }
    
    public static SubLObject f47547(final SubLObject var61) {
        return (SubLObject)makeBoolean(NIL != f47497(var61, (SubLObject)UNPROVIDED) && NIL != f47555(var61) && f47481(var61, (SubLObject)NIL) == $ic75$);
    }
    
    public static SubLObject f47556(final SubLObject var87) {
        SubLObject var89;
        final SubLObject var88 = var89 = module0205.f13304(var87, (SubLObject)UNPROVIDED);
        SubLObject var90 = (SubLObject)NIL;
        SubLObject var91 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var89, var88, (SubLObject)$ic76$);
        var90 = var89.first();
        var89 = var89.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var89, var88, (SubLObject)$ic76$);
        var91 = var89.first();
        var89 = var89.rest();
        if (NIL == var89) {
            final SubLObject var92 = module0749.f46494((SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
            final SubLObject var93 = module0749.f46494((SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
            f47503(var92, (SubLObject)$ic75$, (SubLObject)UNPROVIDED);
            f47557(var92, var90);
            module0749.f46424(var92, (SubLObject)$ic77$, var91);
            f47543(var92, var93);
            if (NIL == module0751.f46788(var90)) {
                f47558(var92);
            }
            return var92;
        }
        cdestructuring_bind.cdestructuring_bind_error(var88, (SubLObject)$ic76$);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f47555(final SubLObject var7) {
        return module0749.f46420(var7, (SubLObject)$ic78$, (SubLObject)EIGHT_INTEGER, (SubLObject)NIL);
    }
    
    public static SubLObject f47559(final SubLObject var100, final SubLObject var101, final SubLObject var102) {
        final SubLObject var103 = f47560(var100);
        SubLObject var104 = (SubLObject)NIL;
        if (NIL != module0205.f13220(var101, var103, (SubLObject)NIL, Symbols.symbol_function((SubLObject)EQUAL), (SubLObject)UNPROVIDED)) {
            f47561(var100, module0205.f13250(var102, var101, var103, Symbols.symbol_function((SubLObject)EQUAL), (SubLObject)UNPROVIDED));
            var104 = (SubLObject)T;
        }
        return var104;
    }
    
    public static SubLObject f47560(final SubLObject var7) {
        return module0749.f46418(var7, (SubLObject)$ic77$, (SubLObject)NIL);
    }
    
    public static SubLObject f47561(final SubLObject var7, final SubLObject var87) {
        return module0749.f46424(var7, (SubLObject)$ic77$, var87);
    }
    
    public static SubLObject f47557(final SubLObject var7, final SubLObject var105) {
        return module0749.f46426(var7, (SubLObject)$ic78$, (SubLObject)EIGHT_INTEGER, var105);
    }
    
    public static SubLObject f47562(final SubLObject var7, final SubLObject var106) {
        final SubLObject var107 = f47555(var7);
        if (NIL != module0751.f46788(var107)) {
            final SubLObject var108 = module0205.f13183(var107, (SubLObject)$ic79$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
            final SubLObject var109 = module0751.f46672(var107, var106);
            final SubLObject var110 = module0205.f13183(var109, (SubLObject)$ic79$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
            if (NIL == conses_high.set_difference(var110, var108, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)) {
                return var109;
            }
            return (SubLObject)NIL;
        }
        else {
            if (NIL != module0202.f12590(var107)) {
                return var107;
            }
            return (SubLObject)NIL;
        }
    }
    
    public static SubLObject f47563(final SubLObject var7, final SubLObject var106) {
        final SubLObject var107 = f47562(var7, var106);
        return (NIL != module0202.f12590(var107)) ? f47564(var107, (SubLObject)UNPROVIDED) : Values.values((SubLObject)NIL, (SubLObject)NIL);
    }
    
    public static SubLObject f47565(final SubLObject var98, SubLObject var111) {
        if (var111 == UNPROVIDED) {
            var111 = module0579.$g4262$.getDynamicValue();
        }
        final SubLObject var112 = (SubLObject)$ic81$;
        final SubLObject var113 = module0751.f46868(var98, var111, var112);
        if (NIL == var113 && NIL != module0578.f35470((SubLObject)ONE_INTEGER) && NIL == module0578.f35477()) {
            Errors.warn((SubLObject)$ic82$, var98);
        }
        return Values.values(var113.first(), (SubLObject)makeBoolean(NIL != var113));
    }
    
    public static SubLObject f47564(final SubLObject var98, SubLObject var111) {
        if (var111 == UNPROVIDED) {
            var111 = module0579.$g4262$.getDynamicValue();
        }
        final SubLThread var112 = SubLProcess.currentSubLThread();
        final SubLObject var113 = module0034.$g879$.getDynamicValue(var112);
        SubLObject var114 = (SubLObject)NIL;
        if (NIL == var113) {
            return f47565(var98, var111);
        }
        var114 = module0034.f1857(var113, (SubLObject)$ic80$, (SubLObject)UNPROVIDED);
        if (NIL == var114) {
            var114 = module0034.f1807(module0034.f1842(var113), (SubLObject)$ic80$, (SubLObject)TWO_INTEGER, (SubLObject)$ic83$, (SubLObject)EQUAL, (SubLObject)UNPROVIDED);
            module0034.f1860(var113, (SubLObject)$ic80$, var114);
        }
        final SubLObject var115 = module0034.f1782(var98, var111);
        final SubLObject var116 = module0034.f1814(var114, var115, (SubLObject)UNPROVIDED);
        if (var116 != $ic28$) {
            SubLObject var117 = var116;
            SubLObject var118 = (SubLObject)NIL;
            var118 = var117.first();
            while (NIL != var117) {
                SubLObject var119 = var118.first();
                final SubLObject var120 = conses_high.second(var118);
                if (var98.equal(var119.first())) {
                    var119 = var119.rest();
                    if (NIL != var119 && NIL == var119.rest() && var111.equal(var119.first())) {
                        return module0034.f1959(var120);
                    }
                }
                var117 = var117.rest();
                var118 = var117.first();
            }
        }
        final SubLObject var121 = Values.arg2(var112.resetMultipleValues(), (SubLObject)Values.multiple_value_list(f47565(var98, var111)));
        module0034.f1836(var114, var115, var116, var121, (SubLObject)ConsesLow.list(var98, var111));
        return module0034.f1959(var121);
    }
    
    public static SubLObject f47566(final SubLObject var7) {
        final SubLThread var8 = SubLProcess.currentSubLThread();
        final SubLObject var9 = module0233.f15362($g6074$.getDynamicValue(var8), f47487(var7, (SubLObject)UNPROVIDED));
        f47465(var7, var9);
        if (NIL != f47478(var7)) {
            SubLObject var10 = (SubLObject)ZERO_INTEGER;
            if (module0743.f45996(var7).isVector()) {
                final SubLObject var11 = module0743.f45996(var7);
                final SubLObject var12 = (SubLObject)NIL;
                SubLObject var13;
                SubLObject var14;
                SubLObject var15;
                SubLObject var16;
                for (var13 = Sequences.length(var11), var14 = (SubLObject)NIL, var14 = (SubLObject)ZERO_INTEGER; var14.numL(var13); var14 = Numbers.add(var14, (SubLObject)ONE_INTEGER)) {
                    var15 = ((NIL != var12) ? Numbers.subtract(var13, var14, (SubLObject)ONE_INTEGER) : var14);
                    var16 = Vectors.aref(var11, var15);
                    f47566(var16);
                    var10 = Numbers.add(var10, (SubLObject)ONE_INTEGER);
                }
            }
        }
        return var7;
    }
    
    public static SubLObject f47567(final SubLObject var7) {
        SubLObject var8 = (SubLObject)NIL;
        if (NIL != f47547(var7)) {
            f47558(var7);
            var8 = f47547(var7);
        }
        if (NIL != f47478(var7)) {
            SubLObject var9 = (SubLObject)ZERO_INTEGER;
            if (module0743.f45996(var7).isVector()) {
                final SubLObject var10 = module0743.f45996(var7);
                final SubLObject var11 = (SubLObject)NIL;
                SubLObject var12;
                SubLObject var13;
                SubLObject var14;
                SubLObject var15;
                for (var12 = Sequences.length(var10), var13 = (SubLObject)NIL, var13 = (SubLObject)ZERO_INTEGER; var13.numL(var12); var13 = Numbers.add(var13, (SubLObject)ONE_INTEGER)) {
                    var14 = ((NIL != var11) ? Numbers.subtract(var12, var13, (SubLObject)ONE_INTEGER) : var13);
                    var15 = Vectors.aref(var10, var14);
                    if (NIL == var8) {
                        var8 = f47567(var15);
                    }
                    var9 = Numbers.add(var9, (SubLObject)ONE_INTEGER);
                }
            }
        }
        return var8;
    }
    
    public static SubLObject f47558(final SubLObject var7) {
        final SubLThread var8 = SubLProcess.currentSubLThread();
        final SubLObject var9 = f47568(var7);
        SubLObject var10 = module0749.f46418(var7, (SubLObject)$ic77$, (SubLObject)UNPROVIDED);
        final SubLObject var11 = f47511(var7);
        var8.resetMultipleValues();
        final SubLObject var12 = f47563(var7, var9);
        final SubLObject var13 = var8.secondMultipleValue();
        var8.resetMultipleValues();
        if (NIL != var13) {
            SubLObject var15;
            final SubLObject var14 = var15 = var12;
            final SubLObject var16 = $g6074$.currentBinding(var8);
            try {
                $g6074$.bind((SubLObject)NIL, var8);
                SubLObject var17 = (SubLObject)NIL;
                cdestructuring_bind.destructuring_bind_must_consp(var15, var14, (SubLObject)$ic84$);
                $g6074$.setDynamicValue(var15.first(), var8);
                var15 = var15.rest();
                cdestructuring_bind.destructuring_bind_must_consp(var15, var14, (SubLObject)$ic84$);
                var17 = var15.first();
                var15 = var15.rest();
                if (NIL == var15) {
                    var10 = module0233.f15362($g6074$.getDynamicValue(var8), var10);
                    f47484(module0763.f48248(var10, var11), var7, (SubLObject)UNPROVIDED);
                    SubLObject var18 = var17;
                    SubLObject var19 = (SubLObject)NIL;
                    var19 = var18.first();
                    while (NIL != var18) {
                        f47569(var7, var19);
                        var18 = var18.rest();
                        var19 = var18.first();
                    }
                }
                else {
                    cdestructuring_bind.cdestructuring_bind_error(var14, (SubLObject)$ic84$);
                }
            }
            finally {
                $g6074$.rebind(var16, var8);
            }
        }
        return var7;
    }
    
    public static SubLObject f47548(final SubLObject var61) {
        return (SubLObject)makeBoolean(NIL != f47497(var61, (SubLObject)UNPROVIDED) && NIL != f47478(var61) && f47481(var61, (SubLObject)NIL) == $ic85$);
    }
    
    public static SubLObject f47570(final SubLObject var87) {
        final SubLObject var88 = module0763.f48264(module0205.f13277(var87, (SubLObject)UNPROVIDED), (SubLObject)UNPROVIDED);
        final SubLObject var89 = f47484(var88, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        f47503(var88, (SubLObject)$ic85$, (SubLObject)UNPROVIDED);
        f47543(var88, var89);
        return var88;
    }
    
    public static SubLObject f47549(final SubLObject var61) {
        return (SubLObject)makeBoolean(NIL != f47497(var61, (SubLObject)UNPROVIDED) && NIL != f47478(var61) && f47481(var61, (SubLObject)NIL) == $ic86$);
    }
    
    public static SubLObject f47571(final SubLObject var87, SubLObject var2) {
        if (var2 == UNPROVIDED) {
            var2 = module0751.f47200();
        }
        final SubLObject var88 = module0205.f13277(var87, (SubLObject)UNPROVIDED);
        final SubLObject var89 = f47463(var88, var2, (SubLObject)UNPROVIDED);
        final SubLObject var90 = f47484(var89, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        f47503(var89, (SubLObject)$ic86$, (SubLObject)UNPROVIDED);
        f47543(var89, var90);
        return var89;
    }
    
    public static SubLObject f47572(final SubLObject var61) {
        return (SubLObject)makeBoolean(NIL != f47497(var61, (SubLObject)UNPROVIDED) && NIL != f47478(var61) && f47481(var61, (SubLObject)NIL) == $ic87$);
    }
    
    public static SubLObject f47573(final SubLObject var87) {
        SubLObject var89;
        final SubLObject var88 = var89 = module0205.f13304(var87, (SubLObject)UNPROVIDED);
        SubLObject var90 = (SubLObject)NIL;
        SubLObject var91 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var89, var88, (SubLObject)$ic88$);
        var90 = var89.first();
        var89 = var89.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var89, var88, (SubLObject)$ic88$);
        var91 = var89.first();
        var89 = var89.rest();
        if (NIL == var89) {
            final SubLObject var92 = f47463(var90, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
            final SubLObject var93 = f47463(var91, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
            final SubLObject var94 = module0749.f46494((SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
            f47503(var94, (SubLObject)$ic87$, (SubLObject)UNPROVIDED);
            f47507(var94, (SubLObject)ConsesLow.list(var92, var93), (SubLObject)UNPROVIDED);
            return var94;
        }
        cdestructuring_bind.cdestructuring_bind_error(var88, (SubLObject)$ic88$);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f47519(final SubLObject var61) {
        SubLObject var62 = (SubLObject)NIL;
        if (NIL != f47497(var61, (SubLObject)UNPROVIDED)) {
            final SubLObject var63 = f47481(var61, (SubLObject)NIL);
            var62 = (SubLObject)makeBoolean(NIL != module0035.f2014(var63) && NIL != module0035.f1995(var63, (SubLObject)TWO_INTEGER, (SubLObject)UNPROVIDED) && var63.first() == $ic89$);
        }
        return var62;
    }
    
    public static SubLObject f47574(final SubLObject var87, SubLObject var2) {
        if (var2 == UNPROVIDED) {
            var2 = module0751.f46691();
        }
        final SubLObject var88 = module0749.f46494((SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        final SubLObject var89 = module0205.f13304(var87, (SubLObject)UNPROVIDED);
        if (!module0205.f13360(var87, (SubLObject)UNPROVIDED).numGE((SubLObject)TWO_INTEGER)) {
            final SubLObject var90 = Sequences.cconcatenate((SubLObject)$ic48$, new SubLObject[] { module0006.f205((SubLObject)ONE_INTEGER), $ic49$, module0006.f203((SubLObject)$ic90$) });
            module0578.f35476(var90, (SubLObject)ConsesLow.list(var87));
        }
        SubLObject var92;
        final SubLObject var91 = var92 = var89;
        SubLObject var93 = (SubLObject)NIL;
        SubLObject var94 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var92, var91, (SubLObject)$ic91$);
        var93 = var92.first();
        var92 = var92.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var92, var91, (SubLObject)$ic91$);
        var94 = var92.first();
        var92 = var92.rest();
        final SubLObject var95 = (SubLObject)(var92.isCons() ? var92.first() : ConsesLow.list($ic92$, module0038.$g916$.getGlobalValue()));
        cdestructuring_bind.destructuring_bind_must_listp(var92, var91, (SubLObject)$ic91$);
        var92 = var92.rest();
        if (NIL == var92) {
            final SubLObject var96 = module0751.f46693(var2, (SubLObject)$ic68$);
            final SubLObject var97 = module0751.f46693(var2, (SubLObject)$ic93$);
            if (NIL == module0751.f46853(var93)) {
                if (NIL != module0578.f35470((SubLObject)ONE_INTEGER) && NIL == module0578.f35477()) {
                    Errors.warn((SubLObject)$ic94$, var93);
                }
                return module0763.f48264(var95, var97);
            }
            f47503(var88, (SubLObject)ConsesLow.list((SubLObject)$ic89$, var93), (SubLObject)UNPROVIDED);
            final SubLObject var98 = module0763.f48264(var94, var96);
            final SubLObject var99 = module0763.f48264(var95, var97);
            f47507(var88, (SubLObject)ConsesLow.list(var98, var99), (SubLObject)UNPROVIDED);
        }
        else {
            cdestructuring_bind.cdestructuring_bind_error(var91, (SubLObject)$ic91$);
        }
        return var88;
    }
    
    public static SubLObject f47575(final SubLObject var7) {
        return conses_high.second(f47481(var7, (SubLObject)NIL));
    }
    
    public static SubLObject f47576(final SubLObject var7, final SubLObject var133) {
        f47503(var7, (SubLObject)ConsesLow.list((SubLObject)$ic89$, var133), (SubLObject)NIL);
        return f47575(var7);
    }
    
    public static SubLObject f47577(final SubLObject var7) {
        return f47515(var7);
    }
    
    public static SubLObject f47551(final SubLObject var61) {
        final SubLObject var62 = f47481(var61, (SubLObject)NIL);
        if (NIL != f47478(var61) && NIL != module0035.f2014(var62) && var62.first() == $ic95$) {
            return Types.keywordp(conses_high.second(var62));
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f47578(final SubLObject var87) {
        final SubLObject var88 = module0205.f13304(var87, (SubLObject)UNPROVIDED);
        final SubLObject var89 = f47579(module0205.f13276(var87));
        final SubLObject var90 = (SubLObject)$ic96$;
        SubLObject var91 = (SubLObject)NIL;
        SubLObject var92 = var88;
        SubLObject var93 = (SubLObject)NIL;
        var93 = var92.first();
        while (NIL != var92) {
            var91 = (SubLObject)ConsesLow.cons(module0763.f48264(var93, (SubLObject)UNPROVIDED), var91);
            var92 = var92.rest();
            var93 = var92.first();
        }
        return f47580(Sequences.nreverse(var91), var89, var90);
    }
    
    public static SubLObject f47580(final SubLObject var145, final SubLObject var141, final SubLObject var142) {
        final SubLObject var146 = module0749.f46494((SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        f47503(var146, (SubLObject)ConsesLow.list((SubLObject)$ic95$, var141, var142), (SubLObject)UNPROVIDED);
        f47507(var146, var145, (SubLObject)UNPROVIDED);
        return var146;
    }
    
    public static SubLObject f47581(final SubLObject var87) {
        SubLObject var89;
        final SubLObject var88 = var89 = module0205.f13304(var87, (SubLObject)UNPROVIDED);
        SubLObject var90 = (SubLObject)NIL;
        SubLObject var91 = (SubLObject)NIL;
        SubLObject var92 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var89, var88, (SubLObject)$ic97$);
        var90 = var89.first();
        var89 = var89.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var89, var88, (SubLObject)$ic97$);
        var91 = var89.first();
        var89 = var89.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var89, var88, (SubLObject)$ic97$);
        var92 = var89.first();
        var89 = var89.rest();
        if (NIL == var89) {
            final SubLObject var93 = module0749.f46494((SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
            final SubLObject var94 = f47579(module0205.f13276(var87));
            final SubLObject var95 = f47582(var92);
            f47503(var93, (SubLObject)ConsesLow.list((SubLObject)$ic95$, var94, var95), (SubLObject)UNPROVIDED);
            final SubLObject var96 = module0763.f48264((SubLObject)ConsesLow.list($ic98$, (SubLObject)ConsesLow.list($ic99$, (SubLObject)ONE_INTEGER, var91), (SubLObject)ConsesLow.list($ic100$, var90, (SubLObject)ConsesLow.list($ic101$, (SubLObject)ConsesLow.list($ic99$, (SubLObject)ONE_INTEGER, var91)))), (SubLObject)UNPROVIDED);
            f47543(var93, var96);
            return var93;
        }
        cdestructuring_bind.cdestructuring_bind_error(var88, (SubLObject)$ic97$);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f47579(final SubLObject var151) {
        if (var151.eql($ic102$)) {
            return (SubLObject)$ic103$;
        }
        if (var151.eql($ic104$)) {
            return (SubLObject)$ic105$;
        }
        if (var151.eql($ic106$)) {
            return (SubLObject)$ic107$;
        }
        return (SubLObject)$ic108$;
    }
    
    public static SubLObject f47583(final SubLObject var153) {
        if (var153.eql($ic109$)) {
            return (SubLObject)$ic103$;
        }
        if (var153.eql($ic110$)) {
            return (SubLObject)$ic107$;
        }
        return (SubLObject)$ic108$;
    }
    
    public static SubLObject f47582(final SubLObject var142) {
        final SubLObject var143 = module0751.f46770((SubLObject)$ic111$, (SubLObject)ConsesLow.listS($ic112$, var142, (SubLObject)$ic113$), $ic114$, (SubLObject)NIL, (SubLObject)ONE_INTEGER).first();
        return (SubLObject)((NIL != var143) ? var143 : $ic96$);
    }
    
    public static SubLObject f47584(final SubLObject var7) {
        return (SubLObject)makeBoolean(NIL != module0749.f46385(f47482(var7)) && NIL == f47520(var7) && NIL == f47478(var7) && NIL != module0035.f1997(f47467(var7)) && NIL != f47585(f47467(var7).first(), (SubLObject)T));
    }
    
    public static SubLObject f47586(final SubLObject var7, SubLObject var155) {
        if (var155 == UNPROVIDED) {
            var155 = (SubLObject)NIL;
        }
        if (NIL != f47587(var7, $ic115$)) {
            return (SubLObject)NIL;
        }
        final SubLObject var156 = f47588(var7);
        if (!var156.numG((SubLObject)TWO_INTEGER)) {
            return (SubLObject)NIL;
        }
        final SubLObject var157 = f47589(var7);
        final SubLObject var158 = (SubLObject)((NIL != module0751.f46661((SubLObject)UNPROVIDED)) ? f47590(var7, Numbers.subtract(f47588(var7), (SubLObject)TWO_INTEGER)) : NIL);
        SubLObject var159 = $ic116$;
        SubLObject var160 = $ic117$;
        if (NIL == f47497(var158, (SubLObject)UNPROVIDED) || NIL == f47591(var157)) {
            return (SubLObject)NIL;
        }
        if (NIL == module0751.f47114(f47481(var158, (SubLObject)UNPROVIDED), $ic115$, (SubLObject)UNPROVIDED) && (NIL == f47480(var158, (SubLObject)UNPROVIDED) || NIL == module0754.f47343(f47480(var158, (SubLObject)UNPROVIDED), $ic115$, (SubLObject)$ic118$, (SubLObject)UNPROVIDED))) {
            return (SubLObject)NIL;
        }
        if (NIL == var155) {
            SubLObject var161 = (SubLObject)ZERO_INTEGER;
            if (module0743.f45996(var7).isVector()) {
                final SubLObject var162 = module0743.f45996(var7);
                final SubLObject var163 = (SubLObject)NIL;
                SubLObject var164;
                SubLObject var165;
                SubLObject var166;
                SubLObject var167;
                for (var164 = Sequences.length(var162), var165 = (SubLObject)NIL, var165 = (SubLObject)ZERO_INTEGER; var165.numL(var164); var165 = Numbers.add(var165, (SubLObject)ONE_INTEGER)) {
                    var166 = ((NIL != var163) ? Numbers.subtract(var164, var165, (SubLObject)ONE_INTEGER) : var165);
                    var167 = Vectors.aref(var162, var166);
                    if (!var167.equal(var158)) {
                        if (NIL == module0751.f47119(f47481(var167, (SubLObject)UNPROVIDED))) {
                            return (SubLObject)NIL;
                        }
                        var160 = module0767.f48979(var160, f47592(var167));
                        var159 = module0767.f48977(var159, f47593(var167));
                    }
                    var161 = Numbers.add(var161, (SubLObject)ONE_INTEGER);
                }
            }
        }
        return module0764.f48485(var160, $ic119$, var159);
    }
    
    public static SubLObject f47593(final SubLObject var7) {
        return module0767.f48968(f47487(var7, (SubLObject)UNPROVIDED));
    }
    
    public static SubLObject f47592(final SubLObject var7) {
        return module0767.f48987(f47487(var7, (SubLObject)UNPROVIDED));
    }
    
    public static SubLObject f47594(final SubLObject var7) {
        return module0767.f48971(f47487(var7, (SubLObject)UNPROVIDED));
    }
    
    public static SubLObject f47595(final SubLObject var7) {
        final SubLObject var8 = f47586(var7, (SubLObject)UNPROVIDED);
        if (NIL == var8) {
            return (SubLObject)NIL;
        }
        if (module0764.f48487(var8).eql($ic120$)) {
            return $ic121$;
        }
        return $ic122$;
    }
    
    public static SubLObject f47552(final SubLObject var61) {
        return (SubLObject)makeBoolean(NIL != f47497(var61, (SubLObject)UNPROVIDED) && NIL != f47478(var61) && f47481(var61, (SubLObject)NIL).isCons() && f47481(var61, (SubLObject)NIL).first() == $ic123$);
    }
    
    public static SubLObject f47596(final SubLObject var162) {
        final SubLObject var163 = f47481(var162, (SubLObject)NIL).rest();
        if (var163.isInteger()) {
            return (SubLObject)ConsesLow.list(var163);
        }
        if (NIL != module0751.f46819(var163)) {
            return module0751.f46825(var163);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f47597(final SubLObject var7, final SubLObject var164) {
        final SubLObject var165 = module0751.f46825(var164);
        final SubLObject var166 = f47596(var7);
        return Numbers.numLE(var166.first(), var165.first());
    }
    
    public static SubLObject f47598(final SubLObject var87) {
        final SubLObject var88 = module0749.f46494((SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        SubLObject var90;
        final SubLObject var89 = var90 = module0205.f13304(var87, (SubLObject)UNPROVIDED);
        SubLObject var91 = (SubLObject)NIL;
        SubLObject var92 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var90, var89, (SubLObject)$ic124$);
        var91 = var90.first();
        var90 = var90.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var90, var89, (SubLObject)$ic124$);
        var92 = var90.first();
        var90 = var90.rest();
        if (NIL == var90) {
            f47503(var88, (SubLObject)ConsesLow.cons((SubLObject)$ic123$, var91), (SubLObject)UNPROVIDED);
            f47543(var88, module0763.f48264(var92, (SubLObject)UNPROVIDED));
        }
        else {
            cdestructuring_bind.cdestructuring_bind_error(var89, (SubLObject)$ic124$);
        }
        return var88;
    }
    
    public static SubLObject f47497(final SubLObject var61, SubLObject var169) {
        if (var169 == UNPROVIDED) {
            var169 = (SubLObject)NIL;
        }
        return (SubLObject)makeBoolean(NIL != module0743.f45991(var61) && NIL != module0749.f46396(module0743.f45994(var61)) && (NIL == var169 || NIL != f47599(var61)));
    }
    
    public static SubLObject f47599(final SubLObject var7) {
        SubLObject var8 = (SubLObject)ZERO_INTEGER;
        if (module0743.f45996(var7).isVector()) {
            final SubLObject var9 = module0743.f45996(var7);
            final SubLObject var10 = (SubLObject)NIL;
            SubLObject var11;
            SubLObject var12;
            SubLObject var13;
            SubLObject var14;
            SubLObject var15;
            for (var11 = Sequences.length(var9), var12 = (SubLObject)NIL, var12 = (SubLObject)ZERO_INTEGER; var12.numL(var11); var12 = Numbers.add(var12, (SubLObject)ONE_INTEGER)) {
                var13 = ((NIL != var10) ? Numbers.subtract(var11, var12, (SubLObject)ONE_INTEGER) : var12);
                var14 = Vectors.aref(var9, var13);
                if (NIL != f47497(var14, (SubLObject)UNPROVIDED)) {
                    f47599(var14);
                }
                else {
                    var15 = Sequences.cconcatenate((SubLObject)$ic48$, new SubLObject[] { module0006.f205((SubLObject)ONE_INTEGER), $ic49$, module0006.f203((SubLObject)$ic125$) });
                    module0578.f35476(var15, (SubLObject)ConsesLow.list(var14));
                }
                var8 = Numbers.add(var8, (SubLObject)ONE_INTEGER);
            }
        }
        return (SubLObject)$ic126$;
    }
    
    public static SubLObject f47466(final SubLObject var61) {
        return (SubLObject)makeBoolean(NIL != var61 && NIL != f47600(var61));
    }
    
    public static SubLObject f47600(final SubLObject var61) {
        return module0751.f46999((SubLObject)$ic127$, var61);
    }
    
    public static SubLObject f47601(final SubLObject var61) {
        return (SubLObject)makeBoolean(NIL == var61 || NIL != Types.sublisp_true());
    }
    
    public static SubLObject f47602(final SubLObject var61) {
        return (SubLObject)makeBoolean(NIL == var61 || NIL != module0751.f46646(var61));
    }
    
    public static SubLObject f47603(final SubLObject var61) {
        final SubLThread var62 = SubLProcess.currentSubLThread();
        if (NIL != module0304.f20296(var61)) {
            return (SubLObject)T;
        }
        SubLObject var63 = Types.sublisp_null(var61);
        final SubLObject var64 = module0147.$g2094$.currentBinding(var62);
        final SubLObject var65 = module0147.$g2095$.currentBinding(var62);
        try {
            module0147.$g2094$.bind((SubLObject)$ic128$, var62);
            module0147.$g2095$.bind($ic129$, var62);
            if (NIL != module0212.f13762(var61) && NIL == var63) {
                SubLObject var66;
                SubLObject var67;
                for (var66 = (SubLObject)$ic130$, var67 = (SubLObject)NIL, var67 = var66.first(); NIL == var63 && NIL != var66; var63 = module0220.f14544(var61, var67, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED), var66 = var66.rest(), var67 = var66.first()) {}
            }
        }
        finally {
            module0147.$g2095$.rebind(var65, var62);
            module0147.$g2094$.rebind(var64, var62);
        }
        return var63;
    }
    
    public static SubLObject f47604(final SubLObject var61) {
        return (SubLObject)makeBoolean(NIL == var61 || var61.isInteger());
    }
    
    public static SubLObject f47605(final SubLObject var7) {
        return (SubLObject)makeBoolean((NIL != module0751.f46661((SubLObject)UNPROVIDED) && NIL != conses_high.member(f47606(var7, (SubLObject)UNPROVIDED), (SubLObject)$ic131$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)) || NIL != conses_high.member(f47487(var7, (SubLObject)UNPROVIDED), (SubLObject)$ic132$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED));
    }
    
    public static SubLObject f47607(final SubLObject var7) {
        return (SubLObject)makeBoolean((NIL != module0751.f46661((SubLObject)UNPROVIDED) && f47606(var7, (SubLObject)UNPROVIDED).eql($ic133$)) || f47487(var7, (SubLObject)UNPROVIDED).eql($ic134$));
    }
    
    public static SubLObject f47608(final SubLObject var7) {
        f47609(var7, (SubLObject)T);
        module0758.f47890(var7);
        return var7;
    }
    
    public static SubLObject f47535(final SubLObject var7) {
        f47609(var7, (SubLObject)NIL);
        return var7;
    }
    
    public static SubLObject f47609(final SubLObject var7, final SubLObject var174) {
        module0749.f46426(var7, (SubLObject)$ic135$, (SubLObject)SEVEN_INTEGER, var174);
        return var7;
    }
    
    public static SubLObject f47479(final SubLObject var7) {
        final SubLThread var8 = SubLProcess.currentSubLThread();
        final SubLObject var9 = module0749.f46420(var7, (SubLObject)$ic135$, (SubLObject)SEVEN_INTEGER, (SubLObject)NIL);
        if (NIL == var9 && NIL != $g6075$.getDynamicValue(var8) && NIL != f47610(var7) && NIL != module0038.f2653(f47480(var7, (SubLObject)NIL)) && NIL != module0578.f35470((SubLObject)ONE_INTEGER) && NIL == module0578.f35477()) {
            Errors.warn((SubLObject)$ic136$, var7);
        }
        return var9;
    }
    
    public static SubLObject f47610(final SubLObject var7) {
        SubLObject var8 = f47467(var7);
        SubLObject var9 = (SubLObject)NIL;
        var9 = var8.first();
        while (NIL != var8) {
            if (NIL != module0581.f35648(module0749.f46455(var9))) {
                return (SubLObject)T;
            }
            var8 = var8.rest();
            var9 = var8.first();
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f47611(final SubLObject var7, SubLObject var176) {
        if (var176 == UNPROVIDED) {
            var176 = (SubLObject)T;
        }
        SubLObject var177 = (SubLObject)ZERO_INTEGER;
        if (module0743.f45996(var7).isVector()) {
            final SubLObject var178 = module0743.f45996(var7);
            final SubLObject var179 = (SubLObject)NIL;
            SubLObject var180;
            SubLObject var181;
            SubLObject var182;
            SubLObject var183;
            for (var180 = Sequences.length(var178), var181 = (SubLObject)NIL, var181 = (SubLObject)ZERO_INTEGER; var181.numL(var180); var181 = Numbers.add(var181, (SubLObject)ONE_INTEGER)) {
                var182 = ((NIL != var179) ? Numbers.subtract(var180, var181, (SubLObject)ONE_INTEGER) : var181);
                var183 = Vectors.aref(var178, var182);
                if (f47606(var183, (SubLObject)UNPROVIDED).eql($ic137$) || (NIL != f47480(var183, (SubLObject)UNPROVIDED) && NIL != Strings.string_equal(f47480(var183, (SubLObject)UNPROVIDED), (SubLObject)$ic138$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED))) {
                    return (SubLObject)T;
                }
                if (var177.eql((SubLObject)ONE_INTEGER) && NIL != f47536(var183) && $ic139$.eql(module0749.f46418(var183, (SubLObject)$ic70$, (SubLObject)UNPROVIDED))) {
                    return (SubLObject)T;
                }
                if (NIL != var176 && NIL != f47611(f47590(var7, (SubLObject)ZERO_INTEGER), (SubLObject)NIL)) {
                    return (SubLObject)T;
                }
                var177 = Numbers.add(var177, (SubLObject)ONE_INTEGER);
            }
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f47490(final SubLObject var100) {
        if (NIL != f47478(var100)) {
            if (NIL != module0578.f35470((SubLObject)ONE_INTEGER)) {
                PrintLow.format((SubLObject)T, (SubLObject)$ic140$, var100);
            }
            final SubLObject var101 = module0749.f46503();
            final SubLObject var102 = f47612(var100, (SubLObject)UNPROVIDED);
            final SubLObject var103 = module0749.f46503();
            if (NIL != module0578.f35470((SubLObject)ONE_INTEGER)) {
                PrintLow.format((SubLObject)T, (SubLObject)$ic141$, var101, var103);
            }
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f47613(final SubLObject var100, SubLObject var182) {
        if (var182 == UNPROVIDED) {
            var182 = (SubLObject)NIL;
        }
        final SubLThread var183 = SubLProcess.currentSubLThread();
        if ((NIL == module0580.$g4367$.getDynamicValue(var183) || NIL != f47496(var100)) && NIL != f47497(var100, (SubLObject)UNPROVIDED)) {
            final SubLObject var184 = f47475(var100);
            try {
                f47614(var100, var182);
            }
            finally {
                final SubLObject var185 = Threads.$is_thread_performing_cleanupP$.currentBinding(var183);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)T, var183);
                    if (var184.isInteger()) {
                        module0749.f46506(var184);
                    }
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(var185, var183);
                }
            }
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f47615() {
        final SubLObject var184 = module0749.f46501();
        SubLObject var185 = (SubLObject)NIL;
        final SubLObject var186 = module0749.$g5981$.getGlobalValue();
        SubLObject var187 = (SubLObject)NIL;
        try {
            var187 = Locks.seize_lock(var186);
            final SubLObject var188 = var184;
            if (NIL == module0065.f4772(var188, (SubLObject)$ic142$)) {
                final SubLObject var189_190 = var188;
                if (NIL == module0065.f4775(var189_190, (SubLObject)$ic142$)) {
                    final SubLObject var189 = module0065.f4740(var189_190);
                    final SubLObject var190 = (SubLObject)NIL;
                    SubLObject var191;
                    SubLObject var192;
                    SubLObject var193;
                    SubLObject var194;
                    for (var191 = Sequences.length(var189), var192 = (SubLObject)NIL, var192 = (SubLObject)ZERO_INTEGER; var192.numL(var191); var192 = Numbers.add(var192, (SubLObject)ONE_INTEGER)) {
                        var193 = ((NIL != var190) ? Numbers.subtract(var191, var192, (SubLObject)ONE_INTEGER) : var192);
                        var194 = Vectors.aref(var189, var193);
                        if (NIL == module0065.f4749(var194) || NIL == module0065.f4773((SubLObject)$ic142$)) {
                            if (NIL != module0065.f4749(var194)) {
                                var194 = (SubLObject)$ic142$;
                            }
                            var185 = (SubLObject)ConsesLow.cons(var194, var185);
                        }
                    }
                }
                final SubLObject var191_192 = var188;
                if (NIL == module0065.f4777(var191_192)) {
                    final SubLObject var195 = module0065.f4738(var191_192);
                    SubLObject var196 = (SubLObject)NIL;
                    SubLObject var197 = (SubLObject)NIL;
                    final Iterator var198 = Hashtables.getEntrySetIterator(var195);
                    try {
                        while (Hashtables.iteratorHasNext(var198)) {
                            final Map.Entry var199 = Hashtables.iteratorNextEntry(var198);
                            var196 = Hashtables.getEntryKey(var199);
                            var197 = Hashtables.getEntryValue(var199);
                            var185 = (SubLObject)ConsesLow.cons(var197, var185);
                        }
                    }
                    finally {
                        Hashtables.releaseEntrySetIterator(var198);
                    }
                }
            }
            SubLObject var200 = var185;
            SubLObject var201 = (SubLObject)NIL;
            var201 = var200.first();
            while (NIL != var200) {
                f47613(var201, (SubLObject)UNPROVIDED);
                var200 = var200.rest();
                var201 = var200.first();
            }
        }
        finally {
            if (NIL != var187) {
                Locks.release_lock(var186);
            }
        }
        return module0749.f46511();
    }
    
    public static SubLObject f47614(final SubLObject var100, final SubLObject var182) {
        module0755.f47451(var100, (SubLObject)UNPROVIDED);
        if (NIL != f47478(var100)) {
            f47612(var100, var182);
        }
        f47616(var100);
        f47617(var100);
        f47618(var100);
        f47619(var100);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f47619(final SubLObject var100) {
        final SubLObject var101 = module0743.f45994(var100);
        module0749.f46403(var101, (SubLObject)$ic143$);
        module0749.f46404(var101, (SubLObject)$ic143$);
        module0749.f46405(var101, (SubLObject)$ic143$);
        module0749.f46406(var101, (SubLObject)$ic143$);
        module0749.f46407(var101, (SubLObject)$ic143$);
        module0749.f46408(var101, (SubLObject)$ic143$);
        module0743.f46001(var100, (SubLObject)$ic143$);
        return (SubLObject)$ic144$;
    }
    
    public static SubLObject f47612(final SubLObject var100, SubLObject var182) {
        if (var182 == UNPROVIDED) {
            var182 = (SubLObject)NIL;
        }
        SubLObject var183 = (SubLObject)ZERO_INTEGER;
        if (module0743.f45996(var100).isVector()) {
            final SubLObject var184 = module0743.f45996(var100);
            final SubLObject var185 = (SubLObject)NIL;
            SubLObject var186;
            SubLObject var187;
            SubLObject var188;
            SubLObject var189;
            for (var186 = Sequences.length(var184), var187 = (SubLObject)NIL, var187 = (SubLObject)ZERO_INTEGER; var187.numL(var186); var187 = Numbers.add(var187, (SubLObject)ONE_INTEGER)) {
                var188 = ((NIL != var185) ? Numbers.subtract(var186, var187, (SubLObject)ONE_INTEGER) : var187);
                var189 = Vectors.aref(var184, var188);
                if (NIL != f47497(var189, (SubLObject)UNPROVIDED) && NIL == Sequences.find(var189, var182, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)) {
                    f47613(var189, var182);
                }
                var183 = Numbers.add(var183, (SubLObject)ONE_INTEGER);
            }
        }
        module0743.f46003(var100, (SubLObject)$ic143$);
        return var100;
    }
    
    public static SubLObject f47513(final SubLObject var7, final SubLObject var67, final SubLObject var197) {
        if (var67.eql((SubLObject)$ic145$)) {
            return f47500(var7, var197, (SubLObject)UNPROVIDED);
        }
        if (var67.eql((SubLObject)$ic146$)) {
            return f47620(var7, var197, (SubLObject)UNPROVIDED);
        }
        if (var67.eql((SubLObject)$ic147$)) {
            return f47621(var7, var197);
        }
        if (var67.eql((SubLObject)$ic148$)) {
            return f47622(var7, var197);
        }
        if (var67.eql((SubLObject)$ic149$)) {
            return f47623(var7, var197);
        }
        if (var67.eql((SubLObject)$ic150$)) {
            return f47624(var7, var197);
        }
        if (var67.eql((SubLObject)$ic151$)) {
            return f47625(var7, var197);
        }
        if (var67.eql((SubLObject)$ic152$)) {
            return f47533(var7, var197);
        }
        if (var67.eql((SubLObject)$ic153$)) {
            return module0758.f47943(var7, var197);
        }
        if (var67.eql((SubLObject)$ic154$)) {
            return f47626(var7, var197);
        }
        if (var67.eql((SubLObject)$ic150$)) {
            return f47624(var7, var197);
        }
        if (var67.eql((SubLObject)$ic135$)) {
            if (NIL != var197) {
                return f47608(var7);
            }
            return module0749.f46426(var7, var67, (SubLObject)SEVEN_INTEGER, var197);
        }
        else {
            if (var67.eql((SubLObject)$ic78$)) {
                return module0749.f46426(var7, var67, (SubLObject)EIGHT_INTEGER, var197);
            }
            if (var67.eql((SubLObject)$ic63$)) {
                return f47524(var7, var197);
            }
            if (var67.eql((SubLObject)$ic155$) || var67.eql((SubLObject)$ic45$)) {
                return module0749.f46426(var7, var67, (SubLObject)ONE_INTEGER, var197);
            }
            if (var67.eql((SubLObject)$ic45$)) {
                return module0749.f46426(var7, var67, (SubLObject)SIX_INTEGER, var197);
            }
            return module0749.f46424(var7, var67, var197);
        }
    }
    
    public static SubLObject f47627(final SubLObject var7) {
        SubLObject var8 = f47499(var7);
        SubLObject var9 = (SubLObject)ZERO_INTEGER;
        if (module0743.f45996(var7).isVector()) {
            final SubLObject var10 = module0743.f45996(var7);
            final SubLObject var11 = (SubLObject)NIL;
            SubLObject var12;
            SubLObject var13;
            SubLObject var14;
            SubLObject var15;
            SubLObject var16;
            for (var12 = Sequences.length(var10), var13 = (SubLObject)NIL, var13 = (SubLObject)ZERO_INTEGER; var13.numL(var12); var13 = Numbers.add(var13, (SubLObject)ONE_INTEGER)) {
                var14 = ((NIL != var11) ? Numbers.subtract(var12, var13, (SubLObject)ONE_INTEGER) : var13);
                var15 = Vectors.aref(var10, var14);
                var16 = f47627(var15);
                if (var16.isPositive()) {
                    var8 = Numbers.add(var8, var16);
                }
                var9 = Numbers.add(var9, (SubLObject)ONE_INTEGER);
            }
        }
        return var8;
    }
    
    public static SubLObject f47628(final SubLObject var7) {
        return f47627(f47629(var7));
    }
    
    public static SubLObject f47499(final SubLObject var7) {
        return module0749.f46420(var7, (SubLObject)$ic145$, (SubLObject)TEN_INTEGER, (SubLObject)ZERO_INTEGER);
    }
    
    public static SubLObject f47500(final SubLObject var7, final SubLObject var200, SubLObject var201) {
        if (var201 == UNPROVIDED) {
            var201 = (SubLObject)NIL;
        }
        assert NIL != module0004.f106(var200) : var200;
        return module0749.f46426(var7, (SubLObject)$ic145$, (SubLObject)TEN_INTEGER, var200);
    }
    
    public static SubLObject f47630(final SubLObject var7, SubLObject var202, SubLObject var201) {
        if (var202 == UNPROVIDED) {
            var202 = (SubLObject)ONE_INTEGER;
        }
        if (var201 == UNPROVIDED) {
            var201 = (SubLObject)NIL;
        }
        f47500(var7, module0048.f3381((SubLObject)ConsesLow.list((SubLObject)ZERO_INTEGER, Numbers.add(var202, f47499(var7))), (SubLObject)UNPROVIDED), var201);
        return f47499(var7);
    }
    
    public static SubLObject f47631(final SubLObject var7) {
        SubLObject var8 = f47632(var7);
        for (SubLObject var9 = var7; NIL == module0004.f105(var8) && NIL != f47497(f47633(var9), (SubLObject)UNPROVIDED); var9 = f47633(var9), var8 = f47632(var9)) {}
        return var8;
    }
    
    public static SubLObject f47632(final SubLObject var7) {
        return module0749.f46418(var7, (SubLObject)$ic157$, (SubLObject)ZERO_INTEGER);
    }
    
    public static SubLObject f47634(final SubLObject var7, final SubLObject var203) {
        return module0749.f46424(var7, (SubLObject)$ic157$, var203);
    }
    
    public static SubLObject f47635(final SubLObject var7) {
        return module0749.f46420(var7, (SubLObject)$ic146$, (SubLObject)ZERO_INTEGER, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f47620(final SubLObject var7, final SubLObject var205, SubLObject var206) {
        if (var206 == UNPROVIDED) {
            var206 = (SubLObject)T;
        }
        if (NIL != f47546(var7) && NIL != var206) {
            SubLObject var207 = (SubLObject)ZERO_INTEGER;
            if (module0743.f45996(var7).isVector()) {
                final SubLObject var208 = module0743.f45996(var7);
                final SubLObject var209 = (SubLObject)NIL;
                SubLObject var210;
                SubLObject var211;
                SubLObject var212;
                SubLObject var213;
                for (var210 = Sequences.length(var208), var211 = (SubLObject)NIL, var211 = (SubLObject)ZERO_INTEGER; var211.numL(var210); var211 = Numbers.add(var211, (SubLObject)ONE_INTEGER)) {
                    var212 = ((NIL != var209) ? Numbers.subtract(var210, var211, (SubLObject)ONE_INTEGER) : var211);
                    var213 = Vectors.aref(var208, var212);
                    f47620(var213, var205, var206);
                    var207 = Numbers.add(var207, (SubLObject)ONE_INTEGER);
                }
            }
        }
        else {
            f47636(var7, var205);
        }
        return var7;
    }
    
    public static SubLObject f47636(final SubLObject var7, final SubLObject var205) {
        return module0749.f46426(var7, (SubLObject)$ic146$, (SubLObject)ZERO_INTEGER, var205);
    }
    
    public static SubLObject f47637(final SubLObject var7) {
        f47638(var7);
        f47639(var7);
        f47640(var7);
        return var7;
    }
    
    public static SubLObject f47638(final SubLObject var7) {
        SubLObject var8 = f47641(var7);
        SubLObject var9 = (SubLObject)NIL;
        var9 = var8.first();
        while (NIL != var8) {
            if (NIL != f47497(var9, (SubLObject)UNPROVIDED)) {
                if (NIL != module0578.f35470((SubLObject)ONE_INTEGER)) {
                    PrintLow.format((SubLObject)T, (SubLObject)$ic158$);
                }
                f47620(var9, (SubLObject)$ic159$, (SubLObject)UNPROVIDED);
            }
            var8 = var8.rest();
            var9 = var8.first();
        }
        return var7;
    }
    
    public static SubLObject f47640(final SubLObject var7) {
        SubLObject var8 = f47642(var7);
        SubLObject var9 = (SubLObject)NIL;
        var9 = var8.first();
        while (NIL != var8) {
            if (NIL != f47497(var9, (SubLObject)UNPROVIDED)) {
                if (NIL != module0578.f35470((SubLObject)ONE_INTEGER)) {
                    PrintLow.format((SubLObject)T, (SubLObject)$ic160$);
                }
                f47620(var9, (SubLObject)$ic161$, (SubLObject)UNPROVIDED);
            }
            var8 = var8.rest();
            var9 = var8.first();
        }
        return var7;
    }
    
    public static SubLObject f47641(final SubLObject var7) {
        SubLObject var8 = conses_high.union(f47643(var7), f47644(var7), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        if (NIL != f47478(var7)) {
            SubLObject var9 = (SubLObject)ZERO_INTEGER;
            if (module0743.f45996(var7).isVector()) {
                final SubLObject var10 = module0743.f45996(var7);
                final SubLObject var11 = (SubLObject)NIL;
                SubLObject var12;
                SubLObject var13;
                SubLObject var14;
                SubLObject var15;
                for (var12 = Sequences.length(var10), var13 = (SubLObject)NIL, var13 = (SubLObject)ZERO_INTEGER; var13.numL(var12); var13 = Numbers.add(var13, (SubLObject)ONE_INTEGER)) {
                    var14 = ((NIL != var11) ? Numbers.subtract(var12, var13, (SubLObject)ONE_INTEGER) : var13);
                    var15 = Vectors.aref(var10, var14);
                    var8 = ConsesLow.append(var8, f47641(var15));
                    var9 = Numbers.add(var9, (SubLObject)ONE_INTEGER);
                }
            }
        }
        return var8;
    }
    
    public static SubLObject f47642(final SubLObject var7) {
        SubLObject var8 = module0035.f2109($ic162$, f47515(var7), Symbols.symbol_function((SubLObject)EQL), Symbols.symbol_function((SubLObject)$ic163$));
        if (NIL != f47478(var7)) {
            SubLObject var9 = (SubLObject)ZERO_INTEGER;
            if (module0743.f45996(var7).isVector()) {
                final SubLObject var10 = module0743.f45996(var7);
                final SubLObject var11 = (SubLObject)NIL;
                SubLObject var12;
                SubLObject var13;
                SubLObject var14;
                SubLObject var15;
                for (var12 = Sequences.length(var10), var13 = (SubLObject)NIL, var13 = (SubLObject)ZERO_INTEGER; var13.numL(var12); var13 = Numbers.add(var13, (SubLObject)ONE_INTEGER)) {
                    var14 = ((NIL != var11) ? Numbers.subtract(var12, var13, (SubLObject)ONE_INTEGER) : var13);
                    var15 = Vectors.aref(var10, var14);
                    var8 = ConsesLow.append(var8, f47642(var15));
                    var9 = Numbers.add(var9, (SubLObject)ONE_INTEGER);
                }
            }
        }
        return var8;
    }
    
    public static SubLObject f47643(final SubLObject var7) {
        SubLObject var8 = (SubLObject)NIL;
        if (NIL != f47645(var7) && TWO_INTEGER.eql(f47588(var7))) {
            var8 = (SubLObject)ConsesLow.cons(f47590(var7, (SubLObject)ONE_INTEGER), var8);
        }
        return var8;
    }
    
    public static SubLObject f47644(final SubLObject var7) {
        SubLObject var8 = (SubLObject)NIL;
        if (NIL != module0751.f46661((SubLObject)UNPROVIDED) && NIL != f47646(var7) && THREE_INTEGER.eql(f47588(var7)) && NIL != f47591(f47590(var7, (SubLObject)ZERO_INTEGER)) && ONE_INTEGER.eql(f47477(var7)) && NIL != f47647(f47648(var7)) && NIL != f47591(f47590(var7, (SubLObject)TWO_INTEGER))) {
            if (NIL != module0578.f35470((SubLObject)ONE_INTEGER)) {
                PrintLow.format((SubLObject)T, (SubLObject)$ic164$, f47606(f47648(var7), (SubLObject)UNPROVIDED), var7);
            }
            var8 = (SubLObject)ConsesLow.cons(f47590(var7, (SubLObject)TWO_INTEGER), var8);
        }
        return var8;
    }
    
    public static SubLObject f47647(final SubLObject var7) {
        final SubLObject var8 = f47606(var7, (SubLObject)UNPROVIDED);
        return (SubLObject)makeBoolean(NIL != f47603(var8) && NIL != module0751.f46669(f47481(var7, (SubLObject)UNPROVIDED), $ic165$, (SubLObject)UNPROVIDED) && NIL != module0004.f104($ic166$, module0731.f44832(var8, $ic165$), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED));
    }
    
    public static SubLObject f47639(final SubLObject var7) {
        final SubLObject var8 = f47649(var7);
        if (NIL != f47497(var8, (SubLObject)UNPROVIDED)) {
            if (NIL != module0578.f35470((SubLObject)ONE_INTEGER)) {
                PrintLow.format((SubLObject)T, (SubLObject)$ic167$);
            }
            f47620(var8, (SubLObject)$ic168$, (SubLObject)UNPROVIDED);
        }
        return var7;
    }
    
    public static SubLObject f47649(final SubLObject var7) {
        if (NIL == f47478(var7)) {
            return (SubLObject)NIL;
        }
        final SubLObject var8 = f47477(var7);
        final SubLObject var9 = (SubLObject)(var8.isInteger() ? f47590(var7, var8) : NIL);
        if (NIL == var9) {
            final SubLObject var10 = f47590(var7, (SubLObject)ZERO_INTEGER);
            if (NIL != f47591(var10) && f47588(var7).numG((SubLObject)ONE_INTEGER) && NIL != f47650(f47590(var7, (SubLObject)ONE_INTEGER))) {
                return var10;
            }
        }
        else {
            if (NIL != f47651(var9)) {
                return module0758.f47914(var9, var7);
            }
            if (NIL != f47652(var9)) {
                return f47649(var9);
            }
        }
        SubLObject var11 = (SubLObject)ZERO_INTEGER;
        if (module0743.f45996(var7).isVector()) {
            final SubLObject var12 = module0743.f45996(var7);
            final SubLObject var13 = (SubLObject)NIL;
            SubLObject var14;
            SubLObject var15;
            SubLObject var16;
            SubLObject var17;
            for (var14 = Sequences.length(var12), var15 = (SubLObject)NIL, var15 = (SubLObject)ZERO_INTEGER; var15.numL(var14); var15 = Numbers.add(var15, (SubLObject)ONE_INTEGER)) {
                var16 = ((NIL != var13) ? Numbers.subtract(var14, var15, (SubLObject)ONE_INTEGER) : var15);
                var17 = Vectors.aref(var12, var16);
                if (f47635(var17).eql((SubLObject)$ic168$)) {
                    return var17;
                }
                var11 = Numbers.add(var11, (SubLObject)ONE_INTEGER);
            }
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f47650(final SubLObject var7) {
        if (NIL != f47653(var7)) {
            return (SubLObject)T;
        }
        if (NIL != f47479(var7) && NIL != module0751.f46661((SubLObject)UNPROVIDED) && NIL != module0754.f47343(module0581.f35666(f47480(var7, (SubLObject)UNPROVIDED), (SubLObject)UNPROVIDED).first(), $ic165$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)) {
            return (SubLObject)T;
        }
        if (NIL != f47478(var7) && NIL != f47650(f47590(var7, (SubLObject)ZERO_INTEGER))) {
            return (SubLObject)T;
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f47654(final SubLObject var7) {
        if (NIL != f47497(var7, (SubLObject)UNPROVIDED)) {
            final SubLObject var8 = f47633(var7);
            if (NIL != var8) {
                return Equality.equal(var7, f47649(var8));
            }
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f47655(final SubLObject var7) {
        return module0749.f46418(var7, (SubLObject)$ic147$, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f47656(final SubLObject var7) {
        SubLObject var8 = f47655(var7);
        if (NIL == module0067.f4852(var8)) {
            var8 = module0067.f4880(Symbols.symbol_function((SubLObject)EQL), (SubLObject)UNPROVIDED);
            f47621(var7, var8);
        }
        return var8;
    }
    
    public static SubLObject f47621(final SubLObject var7, final SubLObject var216) {
        module0749.f46424(var7, (SubLObject)$ic147$, var216);
        return f47655(var7);
    }
    
    public static SubLObject f47657(final SubLObject var7, SubLObject var217) {
        if (var217 == UNPROVIDED) {
            var217 = (SubLObject)NIL;
        }
        final SubLThread var218 = SubLProcess.currentSubLThread();
        if (NIL != module0067.f4852(module0579.$g4338$.getDynamicValue(var218))) {
            f47658(var7, var217);
        }
        return module0579.$g4338$.getDynamicValue(var218);
    }
    
    public static SubLObject f47489(final SubLObject var218, final SubLObject var219) {
        final SubLObject var220 = f47656(var219);
        final SubLObject var221 = f47659(var218);
        f47660(var221, var220);
        return var219;
    }
    
    public static SubLObject f47658(final SubLObject var7, final SubLObject var217) {
        final SubLThread var218 = SubLProcess.currentSubLThread();
        final SubLObject var219 = (NIL != var217) ? f47655(var7) : f47659(var7);
        f47660(var219, module0579.$g4338$.getDynamicValue(var218));
        return var7;
    }
    
    public static SubLObject f47659(final SubLObject var100) {
        final SubLObject var101 = f47655(var100);
        final SubLObject var102 = (NIL != module0067.f4852(var101)) ? module0084.f5760(var101) : module0067.f4880(Symbols.symbol_function((SubLObject)EQ), (SubLObject)UNPROVIDED);
        SubLObject var103 = (SubLObject)ZERO_INTEGER;
        if (module0743.f45996(var100).isVector()) {
            final SubLObject var104 = module0743.f45996(var100);
            final SubLObject var105 = (SubLObject)NIL;
            SubLObject var106;
            SubLObject var107;
            SubLObject var108;
            SubLObject var109;
            SubLObject var110;
            for (var106 = Sequences.length(var104), var107 = (SubLObject)NIL, var107 = (SubLObject)ZERO_INTEGER; var107.numL(var106); var107 = Numbers.add(var107, (SubLObject)ONE_INTEGER)) {
                var108 = ((NIL != var105) ? Numbers.subtract(var106, var107, (SubLObject)ONE_INTEGER) : var107);
                var109 = Vectors.aref(var104, var108);
                var110 = f47659(var109);
                f47660(var110, var102);
                var103 = Numbers.add(var103, (SubLObject)ONE_INTEGER);
            }
        }
        return var102;
    }
    
    public static SubLObject f47660(final SubLObject var226, final SubLObject var227) {
        final SubLThread var228 = SubLProcess.currentSubLThread();
        SubLObject var229;
        for (var229 = module0066.f4838(module0067.f4891(var226)); NIL == module0066.f4841(var229); var229 = module0066.f4840(var229)) {
            var228.resetMultipleValues();
            final SubLObject var230 = module0066.f4839(var229);
            final SubLObject var231 = var228.secondMultipleValue();
            var228.resetMultipleValues();
            SubLObject var232 = var231;
            SubLObject var233 = (SubLObject)NIL;
            var233 = var232.first();
            while (NIL != var232) {
                f47661(var227, var230, var233);
                var232 = var232.rest();
                var233 = var232.first();
            }
        }
        module0066.f4842(var229);
        return var227;
    }
    
    public static SubLObject f47662(final SubLObject var7, final SubLObject var229) {
        final SubLObject var230 = f47655(var7);
        SubLObject var231 = (SubLObject)NIL;
        if (NIL != module0067.f4852(var230)) {
            var231 = module0067.f4884(var230, var229, (SubLObject)NIL);
        }
        return var231;
    }
    
    public static SubLObject f47663(final SubLObject var7, final SubLObject var229, final SubLObject var234, SubLObject var235) {
        if (var235 == UNPROVIDED) {
            var235 = (SubLObject)NIL;
        }
        if (NIL != module0579.f35513()) {
            f47664(var7, var229, var234, var235);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f47664(final SubLObject var7, final SubLObject var229, final SubLObject var234, final SubLObject var235) {
        SubLObject var236 = f47655(var7);
        if (NIL == module0067.f4852(var236)) {
            var236 = module0067.f4880(Symbols.symbol_function((SubLObject)EQ), (SubLObject)UNPROVIDED);
            f47621(var7, var236);
        }
        return f47665(var236, var229, var234, var235);
    }
    
    public static SubLObject f47665(final SubLObject var232, final SubLObject var229, final SubLObject var234, final SubLObject var235) {
        final SubLObject var236 = f47666(var234, var235);
        return f47661(var232, var229, var236);
    }
    
    public static SubLObject f47661(final SubLObject var232, final SubLObject var229, final SubLObject var236) {
        module0084.f5765(var232, var229, var236, Symbols.symbol_function((SubLObject)EQUAL), (SubLObject)UNPROVIDED);
        return Values.values(var236, var232);
    }
    
    public static SubLObject f47667(final SubLObject var61) {
        return (SubLObject)makeBoolean(var61.isCons() && NIL != f47668(var61.first()));
    }
    
    public static SubLObject f47669(final SubLObject var229, final SubLObject var231) {
        SubLObject var232 = (SubLObject)NIL;
        SubLObject var233 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var231, var231, (SubLObject)$ic169$);
        var232 = var231.first();
        final SubLObject var234 = var233 = var231.rest();
        return Sequences.cconcatenate(module0006.f205(var229), new SubLObject[] { $ic170$, module0006.f205(var232), $ic171$, module0006.f203((SubLObject)((NIL != var233) ? Sequences.cconcatenate((SubLObject)$ic172$, new SubLObject[] { module0006.$g11$.getGlobalValue(), $ic173$, module0006.f205(var233) }) : $ic174$)) });
    }
    
    public static SubLObject f47666(final SubLObject var239, SubLObject var235) {
        if (var235 == UNPROVIDED) {
            var235 = (SubLObject)NIL;
        }
        return (SubLObject)ConsesLow.cons(var239, var235);
    }
    
    public static SubLObject f47668(final SubLObject var61) {
        return Types.keywordp(var61);
    }
    
    public static SubLObject f47475(final SubLObject var7) {
        return module0743.f45997(var7);
    }
    
    public static SubLObject f47622(final SubLObject var7, final SubLObject var240) {
        if (NIL != var240) {}
        if (var240.isInteger()) {
            module0749.f46505(var7, var240);
        }
        return f47670(var7, var240);
    }
    
    public static SubLObject f47670(final SubLObject var7, final SubLObject var240) {
        module0743.f46004(var7, var240);
        return var240;
    }
    
    public static SubLObject f47616(final SubLObject var7) {
        return f47670(var7, (SubLObject)$ic143$);
    }
    
    public static SubLObject f47671(final SubLObject var9, final SubLObject var10) {
        SubLObject var12;
        final SubLObject var11 = var12 = var9.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var12, var11, (SubLObject)$ic176$);
        final SubLObject var13 = var12.rest();
        var12 = var12.first();
        SubLObject var14 = (SubLObject)NIL;
        SubLObject var15 = (SubLObject)NIL;
        SubLObject var16 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var12, var11, (SubLObject)$ic176$);
        var14 = var12.first();
        var12 = var12.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var12, var11, (SubLObject)$ic176$);
        var15 = var12.first();
        var12 = var12.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var12, var11, (SubLObject)$ic176$);
        var16 = var12.first();
        var12 = var12.rest();
        if (NIL == var12) {
            final SubLObject var17;
            var12 = (var17 = var13);
            final SubLObject var18 = (SubLObject)$ic177$;
            final SubLObject var19 = (SubLObject)$ic178$;
            return (SubLObject)ConsesLow.list((SubLObject)$ic3$, (SubLObject)ConsesLow.list(reader.bq_cons(var18, (SubLObject)$ic179$), reader.bq_cons(var19, (SubLObject)$ic4$)), (SubLObject)ConsesLow.list((SubLObject)$ic180$, var16, var18), (SubLObject)ConsesLow.list((SubLObject)$ic181$, (SubLObject)ConsesLow.list((SubLObject)$ic182$, var18), (SubLObject)ConsesLow.list((SubLObject)$ic3$, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(var15, (SubLObject)ConsesLow.list((SubLObject)$ic183$, var18))), (SubLObject)ConsesLow.listS((SubLObject)$ic184$, (SubLObject)ConsesLow.list(var14, (SubLObject)ConsesLow.list((SubLObject)$ic185$, var15)), ConsesLow.append(var17, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)$ic9$, var19), (SubLObject)ConsesLow.list((SubLObject)$ic5$, (SubLObject)ConsesLow.listS((SubLObject)$ic186$, var19, (SubLObject)$ic187$), (SubLObject)ConsesLow.list((SubLObject)$ic188$, (SubLObject)ONE_INTEGER, (SubLObject)$ic189$, var19, var16)), (SubLObject)ConsesLow.list((SubLObject)$ic180$, var14, var18)))))));
        }
        cdestructuring_bind.cdestructuring_bind_error(var11, (SubLObject)$ic176$);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f47672(final SubLObject var7) {
        final SubLThread var8 = SubLProcess.currentSubLThread();
        SubLObject var9 = (SubLObject)NIL;
        final SubLObject var10 = module0055.f4017();
        SubLObject var11 = (SubLObject)ZERO_INTEGER;
        module0055.f4021(var7, var10);
        while (NIL == module0055.f4019(var10)) {
            final SubLObject var12 = module0055.f4023(var10);
            SubLObject var13 = f47673(var12);
            SubLObject var14 = (SubLObject)NIL;
            var14 = var13.first();
            while (NIL != var13) {
                final SubLObject var15 = var14;
                if (NIL == conses_high.member(var15, var9, Symbols.symbol_function((SubLObject)EQ), Symbols.symbol_function((SubLObject)IDENTITY))) {
                    var9 = (SubLObject)ConsesLow.cons(var15, var9);
                }
                var11 = Numbers.add(var11, (SubLObject)ONE_INTEGER);
                if (var11.numGE($g6076$.getDynamicValue(var8))) {
                    final SubLObject var16 = Sequences.cconcatenate((SubLObject)$ic48$, new SubLObject[] { module0006.f205((SubLObject)ONE_INTEGER), $ic49$, module0006.f203((SubLObject)$ic189$) });
                    module0578.f35476(var16, (SubLObject)ConsesLow.list(var11, var7));
                }
                module0055.f4021(var14, var10);
                var13 = var13.rest();
                var14 = var13.first();
            }
        }
        return Sequences.nreverse(var9);
    }
    
    public static SubLObject f47673(final SubLObject var7) {
        if (NIL != f47546(var7)) {
            return f47673(f47590(var7, (SubLObject)ZERO_INTEGER));
        }
        return module0749.f46420(var7, (SubLObject)$ic154$, (SubLObject)TWO_INTEGER, (SubLObject)NIL);
    }
    
    public static SubLObject f47626(final SubLObject var7, final SubLObject var249) {
        return f47674(var7, var249);
    }
    
    public static SubLObject f47674(final SubLObject var7, final SubLObject var249) {
        return module0749.f46426(var7, (SubLObject)$ic154$, (SubLObject)TWO_INTEGER, var249);
    }
    
    public static SubLObject f47675(final SubLObject var7, final SubLObject var245) {
        f47626(var7, (SubLObject)ConsesLow.cons(var245, f47673(var7)));
        f47623(var245, var7);
        module0758.f47890(var245);
        return var245;
    }
    
    public static SubLObject f47676(final SubLObject var7, final SubLObject var245) {
        f47626(var7, Sequences.remove(var245, f47673(var7), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED));
        return var245;
    }
    
    public static SubLObject f47617(final SubLObject var7) {
        return f47674(var7, (SubLObject)$ic143$);
    }
    
    public static SubLObject f47633(final SubLObject var7) {
        return module0743.f45998(var7);
    }
    
    public static SubLObject f47623(final SubLObject var7, final SubLObject var215) {
        if (NIL != var215 && var7.eql(var215) && NIL != module0578.f35470((SubLObject)ONE_INTEGER) && NIL == module0578.f35477()) {
            Errors.warn((SubLObject)$ic190$);
        }
        f47677(var7, var215);
        return var7;
    }
    
    public static SubLObject f47618(final SubLObject var7) {
        return f47677(var7, (SubLObject)$ic143$);
    }
    
    public static SubLObject f47677(final SubLObject var7, final SubLObject var215) {
        module0743.f46005(var7, var215);
        return var7;
    }
    
    public static SubLObject f47678(final SubLObject var7) {
        SubLObject var8 = f47633(var7);
        for (SubLObject var9 = module0077.f5313((SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED); NIL != f47546(var8) && NIL == module0077.f5320(var8, var9); var8 = f47633(var8)) {
            module0077.f5326(var8, var9);
        }
        return var8;
    }
    
    public static SubLObject f47679(final SubLObject var7) {
        SubLObject var8 = var7;
        SubLObject var9 = f47633(var7);
        final SubLObject var10 = module0077.f5313((SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        while (NIL != f47680(var8, var9)) {
            module0077.f5326(var9, var10);
            var8 = var9;
            var9 = f47633(var8);
        }
        return var8;
    }
    
    public static SubLObject f47681(final SubLObject var7) {
        SubLObject var8 = f47678(var7);
        for (SubLObject var9 = module0077.f5313((SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED); NIL != f47497(var8, (SubLObject)UNPROVIDED) && NIL == module0077.f5320(var8, var9) && NIL != f47481(var8, (SubLObject)UNPROVIDED) && !$ic191$.eql(f47481(var8, (SubLObject)UNPROVIDED)); var8 = f47678(var8)) {
            module0077.f5326(var8, var9);
        }
        if (NIL == var8) {
            var8 = f47678(var7);
        }
        return var8;
    }
    
    public static SubLObject f47629(final SubLObject var7) {
        final SubLThread var8 = SubLProcess.currentSubLThread();
        SubLObject var9 = (SubLObject)NIL;
        final SubLObject var10 = $g6077$.currentBinding(var8);
        try {
            $g6077$.bind((SubLObject)NIL, var8);
            var9 = f47682(var7);
        }
        finally {
            $g6077$.rebind(var10, var8);
        }
        return var9;
    }
    
    public static SubLObject f47682(final SubLObject var7) {
        final SubLThread var8 = SubLProcess.currentSubLThread();
        final SubLObject var9 = f47633(var7);
        if (NIL != conses_high.member(var9, $g6077$.getDynamicValue(var8), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)) {
            if (NIL != module0578.f35470((SubLObject)ONE_INTEGER) && NIL == module0578.f35477()) {
                Errors.warn((SubLObject)$ic192$, var9);
            }
            return var9;
        }
        if (NIL != f47497(var9, (SubLObject)UNPROVIDED)) {
            $g6077$.setDynamicValue((SubLObject)ConsesLow.cons(var9, $g6077$.getDynamicValue(var8)), var8);
            return f47682(var9);
        }
        return var7;
    }
    
    public static SubLObject f47568(final SubLObject var7) {
        final SubLObject var8 = f47629(var7);
        return f47487(var8, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f47683(final SubLObject var258, final SubLObject var259) {
        final SubLObject var260 = f47633(var259);
        if (NIL == f47497(var260, (SubLObject)UNPROVIDED)) {
            return (SubLObject)NIL;
        }
        if (var258.eql(var260)) {
            return (SubLObject)T;
        }
        if (NIL != f47683(var258, var260)) {
            return (SubLObject)T;
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f47684(final SubLObject var259, final SubLObject var258) {
        return f47683(var258, var259);
    }
    
    public static SubLObject f47685(final SubLObject var7, final SubLObject var44) {
        final SubLObject var45 = f47633(var7);
        if (NIL == f47497(var45, (SubLObject)UNPROVIDED)) {
            return (SubLObject)NIL;
        }
        if (var44.equal(f47481(var45, (SubLObject)T))) {
            return (SubLObject)T;
        }
        return f47685(var45, var44);
    }
    
    public static SubLObject f47510(final SubLObject var7) {
        return module0749.f46399(module0743.f45994(var7));
    }
    
    public static SubLObject f47509(final SubLObject var7, final SubLObject var260) {
        module0749.f46405(module0743.f45994(var7), var260);
        return var7;
    }
    
    public static SubLObject f47569(final SubLObject var7, final SubLObject var260) {
        if (NIL == var260) {
            final SubLObject var261 = Sequences.cconcatenate((SubLObject)$ic48$, new SubLObject[] { module0006.f205((SubLObject)ONE_INTEGER), $ic49$, module0006.f203((SubLObject)$ic193$) });
            module0578.f35476(var261, (SubLObject)ConsesLow.list(EMPTY_SUBL_OBJECT_ARRAY));
        }
        SubLObject var262 = f47510(var7);
        if (NIL == conses_high.member(var260, var262, Symbols.symbol_function((SubLObject)EQUAL), Symbols.symbol_function((SubLObject)IDENTITY))) {
            var262 = (SubLObject)ConsesLow.cons(var260, var262);
        }
        f47509(var7, Sequences.nreverse(var262));
        return var7;
    }
    
    public static SubLObject f47686(final SubLObject var262, final SubLObject var263) {
        SubLObject var264 = f47510(var263);
        SubLObject var265 = (SubLObject)NIL;
        var265 = var264.first();
        while (NIL != var264) {
            f47569(var262, var265);
            var264 = var264.rest();
            var265 = var264.first();
        }
        return var262;
    }
    
    public static SubLObject f47687(final SubLObject var262, final SubLObject var264) {
        SubLObject var265 = module0749.f46483(var264);
        SubLObject var266 = (SubLObject)NIL;
        var266 = var265.first();
        while (NIL != var265) {
            f47569(var262, var266);
            var265 = var265.rest();
            var266 = var265.first();
        }
        return var262;
    }
    
    public static SubLObject f47688(final SubLObject var265, SubLObject var266) {
        if (var266 == UNPROVIDED) {
            var266 = (SubLObject)NIL;
        }
        assert NIL != Types.symbolp(var265) : var265;
        assert NIL != Types.listp(var266) : var266;
        return (SubLObject)ConsesLow.cons((SubLObject)$ic196$, (SubLObject)ConsesLow.cons(var265, var266));
    }
    
    public static SubLObject f47689() {
        return f47688((SubLObject)$ic197$, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f47690(final SubLObject var7) {
        final SubLThread var8 = SubLProcess.currentSubLThread();
        if (NIL == f47479(var7)) {
            return (SubLObject)NIL;
        }
        SubLObject var9 = module0035.remove_if_not((SubLObject)$ic198$, f47510(var7), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        SubLObject var10 = (SubLObject)ZERO_INTEGER;
        if (module0743.f45996(var7).isVector()) {
            final SubLObject var11 = module0743.f45996(var7);
            final SubLObject var12 = (SubLObject)NIL;
            SubLObject var13;
            SubLObject var14;
            SubLObject var15;
            SubLObject var16;
            for (var13 = Sequences.length(var11), var14 = (SubLObject)NIL, var14 = (SubLObject)ZERO_INTEGER; var14.numL(var13); var14 = Numbers.add(var14, (SubLObject)ONE_INTEGER)) {
                var15 = ((NIL != var12) ? Numbers.subtract(var13, var14, (SubLObject)ONE_INTEGER) : var14);
                var16 = Vectors.aref(var11, var15);
                var9 = ConsesLow.nconc(var9, f47690(var16));
                var10 = Numbers.add(var10, (SubLObject)ONE_INTEGER);
            }
        }
        if (NIL != module0035.f2012(var9) && NIL != module0762.f48200(f47606(var7, (SubLObject)UNPROVIDED))) {
            final SubLObject var17 = module0147.f9540(module0162.f10628((SubLObject)ConsesLow.list($ic199$, module0579.$g4260$.getDynamicValue(var8), module0579.$g4262$.getDynamicValue(var8))));
            final SubLObject var18 = module0147.$g2095$.currentBinding(var8);
            final SubLObject var19 = module0147.$g2094$.currentBinding(var8);
            final SubLObject var20 = module0147.$g2096$.currentBinding(var8);
            try {
                module0147.$g2095$.bind(module0147.f9545(var17), var8);
                module0147.$g2094$.bind(module0147.f9546(var17), var8);
                module0147.$g2096$.bind(module0147.f9549(var17), var8);
                var9 = (SubLObject)ConsesLow.cons(module0735.f45229(module0202.f12768(f47691(var7), f47606(var7, (SubLObject)UNPROVIDED), f47480(var7, (SubLObject)NIL))), var9);
            }
            finally {
                module0147.$g2096$.rebind(var20, var8);
                module0147.$g2094$.rebind(var19, var8);
                module0147.$g2095$.rebind(var18, var8);
            }
        }
        return Sequences.delete_duplicates(var9, Symbols.symbol_function((SubLObject)EQUAL), Symbols.symbol_function((SubLObject)$ic200$), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f47692(final SubLObject var7, SubLObject var269, SubLObject var270) {
        if (var269 == UNPROVIDED) {
            var269 = (SubLObject)$ic201$;
        }
        if (var270 == UNPROVIDED) {
            var270 = (SubLObject)NIL;
        }
        final SubLThread var271 = SubLProcess.currentSubLThread();
        SubLObject var272 = (SubLObject)NIL;
        SubLObject var273 = (SubLObject)NIL;
        final SubLObject var274 = $g6078$.getDynamicValue(var271);
        if (NIL == module0580.f35596()) {
            SubLObject var275 = (SubLObject)ZERO_INTEGER;
            if (module0743.f45996(var7).isVector()) {
                final SubLObject var276 = module0743.f45996(var7);
                final SubLObject var277 = (SubLObject)NIL;
                SubLObject var278;
                SubLObject var279;
                SubLObject var280;
                SubLObject var281;
                SubLObject var282;
                SubLObject var283;
                SubLObject var284;
                SubLObject var285;
                SubLObject var286;
                SubLObject var287;
                SubLObject var51_279;
                SubLObject var288;
                SubLObject var289;
                SubLObject var290;
                for (var278 = Sequences.length(var276), var279 = (SubLObject)NIL, var279 = (SubLObject)ZERO_INTEGER; var279.numL(var278); var279 = Numbers.add(var279, (SubLObject)ONE_INTEGER)) {
                    var280 = ((NIL != var277) ? Numbers.subtract(var278, var279, (SubLObject)ONE_INTEGER) : var279);
                    var281 = Vectors.aref(var276, var280);
                    var282 = (SubLObject)NIL;
                    if (NIL != f47550(var281)) {
                        var283 = f47692(var281, var269, (SubLObject)T);
                        var284 = (SubLObject)NIL;
                        var285 = var283;
                        var286 = (SubLObject)NIL;
                        var286 = var285.first();
                        while (NIL != var285) {
                            var287 = (SubLObject)NIL;
                            var51_279 = var286;
                            var288 = (SubLObject)NIL;
                            var288 = var51_279.first();
                            while (NIL != var51_279) {
                                var287 = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.cons((SubLObject)$ic74$, var288), var287);
                                var51_279 = var51_279.rest();
                                var288 = var51_279.first();
                            }
                            var284 = (SubLObject)ConsesLow.cons(Sequences.nreverse(var287), var284);
                            var285 = var285.rest();
                            var286 = var285.first();
                        }
                        var282 = Sequences.nreverse(var284);
                    }
                    else if (NIL != f47546(var281)) {
                        if (NIL != module0578.f35470((SubLObject)ONE_INTEGER) && NIL == module0578.f35477()) {
                            Errors.warn((SubLObject)$ic202$, var281);
                        }
                        var272 = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(var281), var272);
                    }
                    else {
                        var289 = (SubLObject)ConsesLow.cons(var281, f47672(var281));
                        var290 = (SubLObject)NIL;
                        var290 = var289.first();
                        while (NIL != var289) {
                            if (NIL != f47479(var290)) {
                                if (NIL != f47478(var290)) {
                                    var282 = ConsesLow.append(var282, f47692(var290, var269, (SubLObject)T));
                                }
                                else {
                                    var282 = (SubLObject)ConsesLow.cons(var290, var282);
                                }
                            }
                            var289 = var289.rest();
                            var290 = var289.first();
                        }
                    }
                    var272 = (SubLObject)ConsesLow.cons(module0035.f2156(var282, var269, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED), var272);
                    var275 = Numbers.add(var275, (SubLObject)ONE_INTEGER);
                }
            }
        }
        if (NIL == var270) {
            SubLObject var291 = (SubLObject)NIL;
            SubLObject var292 = var272;
            SubLObject var293 = (SubLObject)NIL;
            var293 = var292.first();
            while (NIL != var292) {
                var291 = (SubLObject)ConsesLow.cons(Sequences.remove_if((SubLObject)$ic203$, var293, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED), var291);
                var292 = var292.rest();
                var293 = var292.first();
            }
            var272 = Sequences.nreverse(var291);
        }
        SubLObject var292;
        final SubLObject var294 = var292 = module0035.f2489(Sequences.nreverse(var272), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        SubLObject var295 = (SubLObject)NIL;
        var295 = var292.first();
        while (NIL != var292) {
            var273 = (SubLObject)ConsesLow.cons(var295, var273);
            var292 = var292.rest();
            var295 = var292.first();
        }
        f47693(var273, var274, var7);
        return Sequences.subseq(var273, (SubLObject)ZERO_INTEGER, var274);
    }
    
    public static SubLObject f47693(final SubLObject var272, final SubLObject var273, final SubLObject var7) {
        if ((NIL == var273 || var273.numG((SubLObject)TEN_INTEGER)) && NIL != module0035.f2002(var272, (SubLObject)TEN_INTEGER, (SubLObject)UNPROVIDED)) {
            SubLObject var274;
            SubLObject var275;
            for (var274 = var7, var275 = f47487(var274, (SubLObject)UNPROVIDED); NIL == f47694(var275) && NIL != f47633(var274); var274 = f47633(var274), var275 = f47487(var274, (SubLObject)UNPROVIDED)) {}
            Errors.warn((SubLObject)$ic204$, Sequences.length(var272), (SubLObject)((NIL != f47694(var275)) ? var275 : $ic205$));
            module0006.f215(Mapping.mapcar((SubLObject)$ic206$, module0035.f2124((SubLObject)TEN_INTEGER, var272)), (SubLObject)UNPROVIDED);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f47695(final SubLObject var280, SubLObject var277) {
        if (var277 == UNPROVIDED) {
            var277 = var280;
        }
        SubLObject var281 = (SubLObject)NIL;
        if (NIL != f47497(var280, (SubLObject)UNPROVIDED)) {
            if (NIL != f47696(var280, var277)) {
                var281 = (SubLObject)T;
            }
        }
        else if (var280.isList() && NIL == var281) {
            SubLObject var282 = var280;
            SubLObject var283 = (SubLObject)NIL;
            var283 = var282.first();
            while (NIL == var281 && NIL != var282) {
                if (NIL != f47695(var283, var277)) {
                    var281 = (SubLObject)T;
                }
                var282 = var282.rest();
                var283 = var282.first();
            }
        }
        return var281;
    }
    
    public static SubLObject f47696(final SubLObject var280, final SubLObject var277) {
        final SubLObject var281 = (SubLObject)makeBoolean(NIL != f47497(module0758.f47990(var280), (SubLObject)UNPROVIDED) && NIL == module0035.f2428(module0758.f47990(var280), var277, (SubLObject)$ic207$, (SubLObject)UNPROVIDED));
        return var281;
    }
    
    public static SubLObject f47697(final SubLObject var258, final SubLObject var259) {
        return (SubLObject)makeBoolean(NIL != f47497(var259, (SubLObject)UNPROVIDED) && (var259.eql(var258) || NIL != f47683(var258, var259)));
    }
    
    public static SubLObject f47698(final SubLObject var7, SubLObject var287) {
        if (var287 == UNPROVIDED) {
            var287 = (SubLObject)T;
        }
        final SubLThread var288 = SubLProcess.currentSubLThread();
        SubLObject var289 = (SubLObject)NIL;
        if (NIL != f47479(var7)) {
            if (NIL != f47550(var7) || (NIL != f47478(var7) && NIL == f47546(var7))) {
                final SubLObject var290 = f47550(var7);
                SubLObject var291 = f47692(var7, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                SubLObject var292 = (SubLObject)NIL;
                var292 = var291.first();
                while (NIL != var291) {
                    SubLObject var293 = (SubLObject)NIL;
                    SubLObject var51_291 = var292;
                    SubLObject var294 = (SubLObject)NIL;
                    var294 = var51_291.first();
                    while (NIL != var51_291) {
                        final SubLObject var295 = f47699(var294, var287, var7);
                        var293 = (SubLObject)ConsesLow.cons(var295, var293);
                        var51_291 = var51_291.rest();
                        var294 = var51_291.first();
                    }
                    final SubLObject var296 = module0751.f46722(var293, (SubLObject)makeBoolean(NIL == var290));
                    if (NIL != module0107.f7629(module0579.$g4297$.getDynamicValue(var288))) {
                        SubLObject var297 = module0035.remove_if_not((SubLObject)$ic198$, f47510(var7), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                        SubLObject var51_292 = module0035.f2399(var292, (SubLObject)$ic208$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                        SubLObject var298 = (SubLObject)NIL;
                        var298 = var51_292.first();
                        while (NIL != var51_292) {
                            final SubLObject var299 = f47690(var298);
                            if (var299.isVector()) {
                                final SubLObject var300 = var299;
                                final SubLObject var301 = (SubLObject)NIL;
                                SubLObject var302;
                                SubLObject var303;
                                SubLObject var304;
                                SubLObject var305;
                                for (var302 = Sequences.length(var300), var303 = (SubLObject)NIL, var303 = (SubLObject)ZERO_INTEGER; var303.numL(var302); var303 = Numbers.add(var303, (SubLObject)ONE_INTEGER)) {
                                    var304 = ((NIL != var301) ? Numbers.subtract(var302, var303, (SubLObject)ONE_INTEGER) : var303);
                                    var305 = Vectors.aref(var300, var304);
                                    var297 = (SubLObject)ConsesLow.cons(var305, var297);
                                }
                            }
                            else {
                                SubLObject var51_293 = var299;
                                SubLObject var306 = (SubLObject)NIL;
                                var306 = var51_293.first();
                                while (NIL != var51_293) {
                                    var297 = (SubLObject)ConsesLow.cons(var306, var297);
                                    var51_293 = var51_293.rest();
                                    var306 = var51_293.first();
                                }
                            }
                            var51_292 = var51_292.rest();
                            var298 = var51_292.first();
                        }
                        module0758.f47891(f47487(var7, (SubLObject)UNPROVIDED), var296, f47488(var7, (SubLObject)UNPROVIDED), Sequences.delete_duplicates(var297, Symbols.symbol_function((SubLObject)EQUAL), Symbols.symbol_function((SubLObject)$ic200$), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED));
                    }
                    final SubLObject var307 = var296;
                    if (NIL == conses_high.member(var307, var289, Symbols.symbol_function((SubLObject)EQUAL), Symbols.symbol_function((SubLObject)IDENTITY))) {
                        var289 = (SubLObject)ConsesLow.cons(var307, var289);
                    }
                    var291 = var291.rest();
                    var292 = var291.first();
                }
            }
            final SubLObject var308 = module0055.f4017();
            SubLObject var309 = (SubLObject)ZERO_INTEGER;
            module0055.f4021(var7, var308);
            while (NIL == module0055.f4019(var308)) {
                final SubLObject var310 = module0055.f4023(var308);
                SubLObject var311 = f47673(var310);
                SubLObject var312 = (SubLObject)NIL;
                var312 = var311.first();
                while (NIL != var311) {
                    SubLObject var51_294 = f47700(var312, var287);
                    SubLObject var313 = (SubLObject)NIL;
                    var313 = var51_294.first();
                    while (NIL != var51_294) {
                        final SubLObject var314 = var313;
                        if (NIL == conses_high.member(var314, var289, Symbols.symbol_function((SubLObject)EQUAL), Symbols.symbol_function((SubLObject)IDENTITY))) {
                            var289 = (SubLObject)ConsesLow.cons(var314, var289);
                        }
                        var51_294 = var51_294.rest();
                        var313 = var51_294.first();
                    }
                    var309 = Numbers.add(var309, (SubLObject)ONE_INTEGER);
                    if (var309.numGE($g6076$.getDynamicValue(var288))) {
                        final SubLObject var315 = Sequences.cconcatenate((SubLObject)$ic48$, new SubLObject[] { module0006.f205((SubLObject)ONE_INTEGER), $ic49$, module0006.f203((SubLObject)$ic189$) });
                        module0578.f35476(var315, (SubLObject)ConsesLow.list(var309, var7));
                    }
                    module0055.f4021(var312, var308);
                    var311 = var311.rest();
                    var312 = var311.first();
                }
            }
            final SubLObject var316 = f47480(var7, var287);
            if (NIL == conses_high.member(var316, var289, Symbols.symbol_function((SubLObject)EQUAL), Symbols.symbol_function((SubLObject)IDENTITY))) {
                var289 = (SubLObject)ConsesLow.cons(var316, var289);
            }
        }
        return Sequences.nreverse(var289);
    }
    
    public static SubLObject f47701(final SubLObject var299, final SubLObject var300) {
        return Equality.equal(f47699(var299, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED), f47699(var300, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED));
    }
    
    public static SubLObject f47702(final SubLObject var299, final SubLObject var300) {
        final SubLThread var301 = SubLProcess.currentSubLThread();
        final SubLObject var302 = module0034.$g879$.getDynamicValue(var301);
        SubLObject var303 = (SubLObject)NIL;
        if (NIL == var302) {
            return f47701(var299, var300);
        }
        var303 = module0034.f1857(var302, (SubLObject)$ic201$, (SubLObject)UNPROVIDED);
        if (NIL == var303) {
            var303 = module0034.f1807(module0034.f1842(var302), (SubLObject)$ic201$, (SubLObject)TWO_INTEGER, (SubLObject)NIL, (SubLObject)EQUAL, (SubLObject)UNPROVIDED);
            module0034.f1860(var302, (SubLObject)$ic201$, var303);
        }
        final SubLObject var304 = module0034.f1782(var299, var300);
        final SubLObject var305 = module0034.f1814(var303, var304, (SubLObject)UNPROVIDED);
        if (var305 != $ic28$) {
            SubLObject var306 = var305;
            SubLObject var307 = (SubLObject)NIL;
            var307 = var306.first();
            while (NIL != var306) {
                SubLObject var308 = var307.first();
                final SubLObject var309 = conses_high.second(var307);
                if (var299.equal(var308.first())) {
                    var308 = var308.rest();
                    if (NIL != var308 && NIL == var308.rest() && var300.equal(var308.first())) {
                        return module0034.f1959(var309);
                    }
                }
                var306 = var306.rest();
                var307 = var306.first();
            }
        }
        final SubLObject var310 = Values.arg2(var301.resetMultipleValues(), (SubLObject)Values.multiple_value_list(f47701(var299, var300)));
        module0034.f1836(var303, var304, var305, var310, (SubLObject)ConsesLow.list(var299, var300));
        return module0034.f1959(var310);
    }
    
    public static SubLObject f47703(final SubLObject var280, SubLObject var287, SubLObject var301) {
        if (var287 == UNPROVIDED) {
            var287 = (SubLObject)NIL;
        }
        if (var301 == UNPROVIDED) {
            var301 = (SubLObject)NIL;
        }
        if (NIL != f47497(var280, (SubLObject)UNPROVIDED)) {
            if (NIL == f47479(var280)) {
                module0758.f47878(var280, f47487(var280, (SubLObject)UNPROVIDED), var301);
            }
            final SubLObject var302 = f47480(var280, var287);
            if (NIL == module0581.f35648(var302)) {
                final SubLObject var303 = Sequences.cconcatenate((SubLObject)$ic48$, new SubLObject[] { module0006.f205((SubLObject)ONE_INTEGER), $ic49$, module0006.f203((SubLObject)$ic209$) });
                module0578.f35476(var303, (SubLObject)ConsesLow.list(var280));
            }
            module0758.f47890(var280);
            return var302;
        }
        if (NIL != module0062.f4492(var280, (SubLObject)$ic210$)) {
            SubLObject var304 = (SubLObject)$ic10$;
            SubLObject var305 = var280.rest();
            SubLObject var306 = (SubLObject)NIL;
            var306 = var305.first();
            while (NIL != var305) {
                var304 = module0581.f35665(var304, f47699(var306, var287, (SubLObject)UNPROVIDED));
                var305 = var305.rest();
                var306 = var305.first();
            }
            return var304;
        }
        if (var280.first().eql(var280)) {
            final SubLObject var307 = Sequences.cconcatenate((SubLObject)$ic48$, new SubLObject[] { module0006.f205((SubLObject)ONE_INTEGER), $ic49$, module0006.f203((SubLObject)$ic211$) });
            module0578.f35476(var307, (SubLObject)ConsesLow.list(var301));
        }
        else if (NIL != f47704(var280, (SubLObject)TEN_INTEGER)) {
            final SubLObject var307 = Sequences.cconcatenate((SubLObject)$ic48$, new SubLObject[] { module0006.f205((SubLObject)ONE_INTEGER), $ic49$, module0006.f203((SubLObject)$ic212$) });
            module0578.f35476(var307, (SubLObject)ConsesLow.list(var301));
        }
        else {
            if (NIL != module0035.f1997(var280)) {
                return f47699(module0035.f2113(var280), var287, var301);
            }
            SubLObject var308 = f47699(var280.first(), var287, (SubLObject)NIL);
            final SubLObject var309 = f47699(var280.rest(), var287, (SubLObject)NIL);
            final SubLObject var310 = f47550(var301);
            if (NIL != module0751.f46661((SubLObject)UNPROVIDED) && NIL != module0004.f104(var308, (SubLObject)$ic213$, Symbols.symbol_function((SubLObject)EQUALP), (SubLObject)UNPROVIDED)) {
                final SubLObject var311 = var308 = module0751.f46638((SubLObject)$ic214$, var309, $ic121$);
            }
            return (NIL != var310) ? module0581.f35665(var308, var309) : module0581.f35672((SubLObject)ConsesLow.list(var308, var309));
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f47699(final SubLObject var280, SubLObject var287, SubLObject var301) {
        if (var287 == UNPROVIDED) {
            var287 = (SubLObject)NIL;
        }
        if (var301 == UNPROVIDED) {
            var301 = (SubLObject)NIL;
        }
        final SubLThread var302 = SubLProcess.currentSubLThread();
        final SubLObject var303 = module0034.$g879$.getDynamicValue(var302);
        SubLObject var304 = (SubLObject)NIL;
        if (NIL == var303) {
            return f47703(var280, var287, var301);
        }
        var304 = module0034.f1857(var303, (SubLObject)$ic206$, (SubLObject)UNPROVIDED);
        if (NIL == var304) {
            var304 = module0034.f1807(module0034.f1842(var303), (SubLObject)$ic206$, (SubLObject)THREE_INTEGER, (SubLObject)NIL, (SubLObject)EQUAL, (SubLObject)UNPROVIDED);
            module0034.f1860(var303, (SubLObject)$ic206$, var304);
        }
        final SubLObject var305 = module0034.f1781(var280, var287, var301);
        final SubLObject var306 = module0034.f1814(var304, var305, (SubLObject)UNPROVIDED);
        if (var306 != $ic28$) {
            SubLObject var307 = var306;
            SubLObject var308 = (SubLObject)NIL;
            var308 = var307.first();
            while (NIL != var307) {
                SubLObject var309 = var308.first();
                final SubLObject var310 = conses_high.second(var308);
                if (var280.equal(var309.first())) {
                    var309 = var309.rest();
                    if (var287.equal(var309.first())) {
                        var309 = var309.rest();
                        if (NIL != var309 && NIL == var309.rest() && var301.equal(var309.first())) {
                            return module0034.f1959(var310);
                        }
                    }
                }
                var307 = var307.rest();
                var308 = var307.first();
            }
        }
        final SubLObject var311 = Values.arg2(var302.resetMultipleValues(), (SubLObject)Values.multiple_value_list(f47703(var280, var287, var301)));
        module0034.f1836(var304, var305, var306, var311, (SubLObject)ConsesLow.list(var280, var287, var301));
        return module0034.f1959(var311);
    }
    
    public static SubLObject f47704(SubLObject var95, final SubLObject var70) {
        SubLObject var96;
        for (var96 = (SubLObject)ZERO_INTEGER; var95.isCons() && var96.numLE(var70); var95 = var95.first(), var96 = Numbers.add(var96, (SubLObject)ONE_INTEGER)) {}
        return Numbers.numG(var96, var70);
    }
    
    public static SubLObject f47700(final SubLObject var306, SubLObject var287) {
        if (var287 == UNPROVIDED) {
            var287 = (SubLObject)T;
        }
        return f47698(var306, var287);
    }
    
    public static SubLObject f47705(final SubLObject var7) {
        return f47706(var7, (SubLObject)T);
    }
    
    public static SubLObject f47706(final SubLObject var7, final SubLObject var21) {
        SubLObject var22 = (SubLObject)NIL;
        if (NIL != f47479(var7)) {
            if (NIL != f47546(var7) || NIL != var21 || NIL == f47478(var7)) {
                final SubLObject var23 = f47467(var7);
                if (NIL == conses_high.member(var23, var22, Symbols.symbol_function((SubLObject)EQUALP), Symbols.symbol_function((SubLObject)IDENTITY))) {
                    var22 = (SubLObject)ConsesLow.cons(var23, var22);
                }
                SubLObject var24 = f47672(var7);
                SubLObject var25 = (SubLObject)NIL;
                var25 = var24.first();
                while (NIL != var24) {
                    SubLObject var51_308 = f47706(var25, (SubLObject)NIL);
                    SubLObject var26 = (SubLObject)NIL;
                    var26 = var51_308.first();
                    while (NIL != var51_308) {
                        final SubLObject var27 = var26;
                        if (NIL == conses_high.member(var27, var22, Symbols.symbol_function((SubLObject)EQUALP), Symbols.symbol_function((SubLObject)IDENTITY))) {
                            var22 = (SubLObject)ConsesLow.cons(var27, var22);
                        }
                        var51_308 = var51_308.rest();
                        var26 = var51_308.first();
                    }
                    var24 = var24.rest();
                    var25 = var24.first();
                }
            }
            else {
                final SubLObject var28 = f47550(var7);
                SubLObject var29 = f47692(var7, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                SubLObject var30 = (SubLObject)NIL;
                var30 = var29.first();
                while (NIL != var29) {
                    SubLObject var31 = (SubLObject)NIL;
                    SubLObject var51_309 = var30;
                    SubLObject var32 = (SubLObject)NIL;
                    var32 = var51_309.first();
                    while (NIL != var51_309) {
                        final SubLObject var34;
                        final SubLObject var33 = var34 = f47707(var32);
                        if (NIL == conses_high.member(var34, var31, Symbols.symbol_function((SubLObject)EQUALP), Symbols.symbol_function((SubLObject)IDENTITY))) {
                            var31 = (SubLObject)ConsesLow.cons(var34, var31);
                        }
                        var51_309 = var51_309.rest();
                        var32 = var51_309.first();
                    }
                    final SubLObject var35 = Sequences.nreverse(var31);
                    final SubLObject var37;
                    final SubLObject var36 = var37 = (SubLObject)((NIL != var28) ? ConsesLow.list(module0749.f46485(var35)) : Functions.apply(Symbols.symbol_function((SubLObject)$ic215$), var35));
                    if (NIL == conses_high.member(var37, var22, Symbols.symbol_function((SubLObject)EQUALP), Symbols.symbol_function((SubLObject)IDENTITY))) {
                        var22 = (SubLObject)ConsesLow.cons(var37, var22);
                    }
                    var29 = var29.rest();
                    var30 = var29.first();
                }
            }
        }
        return Sequences.nreverse(var22);
    }
    
    public static SubLObject f47707(final SubLObject var280) {
        if (NIL != f47497(var280, (SubLObject)UNPROVIDED)) {
            return f47467(var280);
        }
        if (NIL != module0062.f4492(var280, (SubLObject)$ic210$)) {
            SubLObject var281 = (SubLObject)NIL;
            SubLObject var282 = var280.rest();
            SubLObject var283 = (SubLObject)NIL;
            var283 = var282.first();
            while (NIL != var282) {
                var281 = (SubLObject)ConsesLow.cons(f47707(var283), var281);
                var282 = var282.rest();
                var283 = var282.first();
            }
            return (SubLObject)ConsesLow.list(module0749.f46485(Sequences.nreverse(var281)));
        }
        SubLObject var281 = (SubLObject)NIL;
        SubLObject var282 = var280;
        SubLObject var283 = (SubLObject)NIL;
        var283 = var282.first();
        while (NIL != var282) {
            var281 = ConsesLow.append(var281, f47707(var283));
            var282 = var282.rest();
            var283 = var282.first();
        }
        return var281;
    }
    
    public static SubLObject f47708(final SubLObject var7) {
        SubLObject var8 = (SubLObject)NIL;
        if (NIL != f47479(var7)) {
            if (NIL != f47546(var7) || NIL == f47478(var7)) {
                f47709(var7, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                final SubLObject var9 = module0035.f2113(f47467(var7));
                if (NIL == conses_high.member(var9, var8, Symbols.symbol_function((SubLObject)EQUALP), Symbols.symbol_function((SubLObject)IDENTITY))) {
                    var8 = (SubLObject)ConsesLow.cons(var9, var8);
                }
                SubLObject var10 = f47672(var7);
                SubLObject var11 = (SubLObject)NIL;
                var11 = var10.first();
                while (NIL != var10) {
                    SubLObject var51_316 = f47708(var11);
                    SubLObject var12 = (SubLObject)NIL;
                    var12 = var51_316.first();
                    while (NIL != var51_316) {
                        final SubLObject var13 = var12;
                        if (NIL == conses_high.member(var13, var8, Symbols.symbol_function((SubLObject)EQUALP), Symbols.symbol_function((SubLObject)IDENTITY))) {
                            var8 = (SubLObject)ConsesLow.cons(var13, var8);
                        }
                        var51_316 = var51_316.rest();
                        var12 = var51_316.first();
                    }
                    var10 = var10.rest();
                    var11 = var10.first();
                }
            }
            else {
                final SubLObject var14 = f47550(var7);
                final SubLObject var15 = f47648(var7);
                final SubLObject var16 = (SubLObject)((NIL != f47497(var15, (SubLObject)UNPROVIDED)) ? f47691(var15) : NIL);
                SubLObject var17 = f47692(var7, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                SubLObject var18 = (SubLObject)NIL;
                var18 = var17.first();
                while (NIL != var17) {
                    SubLObject var19 = (SubLObject)NIL;
                    SubLObject var51_317 = var18;
                    SubLObject var20 = (SubLObject)NIL;
                    var20 = var51_317.first();
                    while (NIL != var51_317) {
                        var19 = (SubLObject)ConsesLow.cons(f47710(var20), var19);
                        var51_317 = var51_317.rest();
                        var20 = var51_317.first();
                    }
                    final SubLObject var21 = module0751.f46722(Mapping.mapcar((SubLObject)$ic216$, var19), (SubLObject)makeBoolean(NIL == var14));
                    final SubLObject var22 = f47487(var7, (SubLObject)UNPROVIDED);
                    final SubLObject var23 = f47711(var7);
                    final SubLObject var24 = (SubLObject)NIL;
                    final SubLObject var25 = (SubLObject)NIL;
                    final SubLObject var26 = f47712(Sequences.nreverse(var19), var21, var22, var23, var24, var25, var16, (SubLObject)UNPROVIDED);
                    if (NIL == conses_high.member(var26, var8, Symbols.symbol_function((SubLObject)EQUALP), Symbols.symbol_function((SubLObject)IDENTITY))) {
                        var8 = (SubLObject)ConsesLow.cons(var26, var8);
                    }
                    var17 = var17.rest();
                    var18 = var17.first();
                }
            }
        }
        return Sequences.nreverse(var8);
    }
    
    public static SubLObject f47710(final SubLObject var280) {
        if (NIL != f47497(var280, (SubLObject)UNPROVIDED)) {
            return module0035.f2113(f47709(var280, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED));
        }
        if (NIL != module0062.f4492(var280, (SubLObject)$ic210$)) {
            SubLObject var281 = (SubLObject)NIL;
            SubLObject var282 = var280.rest();
            SubLObject var283 = (SubLObject)NIL;
            var283 = var282.first();
            while (NIL != var282) {
                var281 = (SubLObject)ConsesLow.cons(f47710(var283), var281);
                var282 = var282.rest();
                var283 = var282.first();
            }
            return module0749.f46484(Sequences.nreverse(var281));
        }
        SubLObject var281 = (SubLObject)NIL;
        SubLObject var282 = var280.rest();
        SubLObject var283 = (SubLObject)NIL;
        var283 = var282.first();
        while (NIL != var282) {
            var281 = (SubLObject)ConsesLow.cons(f47710(var283), var281);
            var282 = var282.rest();
            var283 = var282.first();
        }
        return f47712(Sequences.nreverse(var281), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f47480(final SubLObject var7, SubLObject var287) {
        if (var287 == UNPROVIDED) {
            var287 = (SubLObject)T;
        }
        final SubLObject var288 = f47479(var7);
        SubLObject var289 = (SubLObject)((NIL != var288) ? f47504(var7, var287, (SubLObject)UNPROVIDED) : NIL);
        if (NIL == module0581.f35648(var289) && NIL != var288) {
            var289 = f47713(f47467(var7), var287);
            f47505(var7, var289, var287);
        }
        return var289;
    }
    
    public static SubLObject f47714(final SubLObject var7) {
        module0749.f46427(var7, (SubLObject)$ic217$);
        module0743.f45999(var7, (SubLObject)NIL);
        return var7;
    }
    
    public static SubLObject f47505(final SubLObject var7, final SubLObject var31, final SubLObject var324) {
        if (NIL != var324) {
            module0749.f46424(var7, (SubLObject)$ic217$, var31);
        }
        else {
            module0743.f45999(var7, var31);
        }
        final SubLObject var325 = f47504(var7, var324, (SubLObject)UNPROVIDED);
        if (NIL != module0581.f35648(var31) && NIL == module0581.f35663(var31, var325)) {
            final SubLObject var326 = Sequences.cconcatenate((SubLObject)$ic48$, new SubLObject[] { module0006.f205((SubLObject)ONE_INTEGER), $ic49$, module0006.f203((SubLObject)$ic218$) });
            module0578.f35476(var326, (SubLObject)ConsesLow.list(var31, var7, var325));
        }
        return var325;
    }
    
    public static SubLObject f47504(final SubLObject var7, SubLObject var324, SubLObject var326) {
        if (var324 == UNPROVIDED) {
            var324 = (SubLObject)NIL;
        }
        if (var326 == UNPROVIDED) {
            var326 = (SubLObject)$ic15$;
        }
        if (NIL != var324) {
            return module0749.f46418(var7, (SubLObject)$ic217$, var326);
        }
        final SubLObject var327 = module0743.f45992(var7);
        return (NIL != module0581.f35648(var327)) ? var327 : var326;
    }
    
    public static SubLObject f47715(final SubLObject var7) {
        final SubLThread var8 = SubLProcess.currentSubLThread();
        if (NIL == f47716(var7)) {
            final SubLObject var9 = f47717(var7);
            final SubLObject var10 = f47711(var7);
            if (NIL != module0769.f49012(var9) && NIL != module0769.f49013(var10)) {
                var8.resetMultipleValues();
                final SubLObject var11 = module0769.f49014(var9);
                final SubLObject var12 = var8.secondMultipleValue();
                var8.resetMultipleValues();
                if (var11.isString() && var12.isString()) {
                    f47718(var7, var11, var12);
                }
            }
        }
        return f47467(var7);
    }
    
    public static SubLObject f47719(final SubLObject var264, final SubLObject var329) {
        final SubLThread var330 = SubLProcess.currentSubLThread();
        if (NIL != module0769.f49012(var329)) {
            var330.resetMultipleValues();
            final SubLObject var331 = module0769.f49014(var329);
            final SubLObject var332 = var330.secondMultipleValue();
            var330.resetMultipleValues();
            if (var331.isString() && var332.isString()) {
                module0749.f46479(var264, var331, var332);
            }
        }
        return var264;
    }
    
    public static SubLObject f47716(final SubLObject var7) {
        SubLObject var8 = (SubLObject)NIL;
        if (NIL == var8) {
            SubLObject var9;
            SubLObject var10;
            for (var9 = f47467(var7), var10 = (SubLObject)NIL, var10 = var9.first(); NIL == var8 && NIL != var9; var8 = (SubLObject)makeBoolean(NIL != module0769.f49020(module0749.f46474(var10)) || NIL != module0769.f49021(module0749.f46476(var10))), var9 = var9.rest(), var10 = var9.first()) {}
        }
        return var8;
    }
    
    public static SubLObject f47720(final SubLObject var312) {
        return f47713(var312, (SubLObject)NIL);
    }
    
    public static SubLObject f47713(final SubLObject var312, SubLObject var287) {
        if (var287 == UNPROVIDED) {
            var287 = (SubLObject)T;
        }
        SubLObject var313 = (SubLObject)NIL;
        SubLObject var314 = (SubLObject)NIL;
        SubLObject var315 = var312;
        SubLObject var316 = (SubLObject)NIL;
        var316 = var315.first();
        while (NIL != var315) {
            SubLObject var317 = f47721(var316, var287);
            if (NIL != var287) {
                final SubLObject var318 = module0749.f46474(var316);
                final SubLObject var319 = (SubLObject)(var318.isString() ? module0038.f2668((SubLObject)$ic219$, var318, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED) : NIL);
                final SubLObject var320 = module0749.f46476(var316);
                final SubLObject var321 = module0035.sublisp_boolean(Types.stringp(var320));
                if (NIL != var317 && NIL != var314 && NIL != var319) {
                    final SubLObject var322 = Sequences.cconcatenate((SubLObject)$ic48$, new SubLObject[] { module0006.f205((SubLObject)ONE_INTEGER), $ic49$, module0006.f203((SubLObject)$ic220$) });
                    module0578.f35476(var322, (SubLObject)ConsesLow.list(EMPTY_SUBL_OBJECT_ARRAY));
                    var317 = Sequences.cconcatenate(var320, var317);
                }
                var314 = (SubLObject)makeBoolean(NIL != var319 && NIL == var321);
            }
            final SubLObject var323 = var317;
            if (NIL != var323) {
                var313 = (SubLObject)ConsesLow.cons(var323, var313);
            }
            var315 = var315.rest();
            var316 = var315.first();
        }
        if (NIL != var287 && NIL != var314) {
            var313 = (SubLObject)ConsesLow.cons(module0015.$g382$.getGlobalValue(), var313);
        }
        SubLObject var324 = f47722(var313);
        if (NIL == var287) {
            var324 = module0751.f46648(var324, (SubLObject)UNPROVIDED);
        }
        return var324;
    }
    
    public static SubLObject f47722(final SubLObject var84) {
        SubLObject var85 = (SubLObject)NIL;
        if (NIL != var84) {
            if (NIL != module0035.f1997(var84)) {
                var85 = var84.first();
            }
            else {
                var85 = module0751.f46722(var84, (SubLObject)UNPROVIDED);
            }
        }
        return var85;
    }
    
    public static SubLObject f47721(final SubLObject var175, final SubLObject var287) {
        final SubLThread var288 = SubLProcess.currentSubLThread();
        SubLObject var289 = (SubLObject)NIL;
        if (NIL != module0749.f46430(var175)) {
            final SubLObject var290 = module0749.f46474(var175);
            final SubLObject var291 = (NIL != var290) ? var290 : module0038.$g916$.getGlobalValue();
            final SubLObject var292 = module0749.f46476(var175);
            final SubLObject var293 = (NIL != var292) ? var292 : module0038.$g916$.getGlobalValue();
            final SubLObject var294 = module0749.f46455(var175);
            final SubLObject var295 = (module0579.$g4259$.getDynamicValue(var288) == $ic221$ && NIL != var287) ? module0751.f46651(var294) : var294;
            if (NIL != module0581.f35648(var295) || (NIL != var287 && (NIL != module0035.f2002(var291, (SubLObject)ZERO_INTEGER, (SubLObject)UNPROVIDED) || NIL != module0035.f2002(var293, (SubLObject)ZERO_INTEGER, (SubLObject)UNPROVIDED)))) {
                if (NIL != module0581.f35648(var295)) {
                    var289 = var295;
                }
                if (NIL != var287 && var291.isString()) {
                    var289 = ((NIL != module0581.f35648(var289)) ? module0581.f35665(var291, var289) : var291);
                }
                if (NIL != var287 && var293.isString()) {
                    var289 = ((NIL != module0581.f35648(var289)) ? module0581.f35665(var289, var293) : var293);
                }
            }
        }
        else if (NIL != module0749.f46448(var175)) {
            var289 = module0749.f46486(var175, var287);
        }
        else if (NIL != module0749.f46450(var175)) {
            var289 = f47721(module0749.f46452(var175), var287);
        }
        if (NIL == var287) {
            var289 = module0751.f46648(var289, (SubLObject)UNPROVIDED);
        }
        return var289;
    }
    
    public static SubLObject f47723(final SubLObject var7, SubLObject var31) {
        if (NIL != module0578.f35470((SubLObject)ONE_INTEGER)) {
            PrintLow.format((SubLObject)T, (SubLObject)$ic222$, var31);
        }
        if (NIL != var31) {
            var31 = module0751.f46648(var31, (SubLObject)UNPROVIDED);
        }
        final SubLObject var32 = f47487(var7, (SubLObject)UNPROVIDED);
        if (NIL != f47694(var32) && NIL != module0579.f35493(var32, var31)) {
            final SubLObject var33 = Sequences.cconcatenate((SubLObject)$ic48$, new SubLObject[] { module0006.f205((SubLObject)TWO_INTEGER), $ic49$, module0006.f203((SubLObject)$ic223$) });
            module0578.f35476(var33, (SubLObject)ConsesLow.list(var31, var32));
        }
        f47505(var7, var31, (SubLObject)NIL);
        if (NIL != module0581.f35648(var31)) {
            final SubLObject var34 = f47467(var7);
            SubLObject var35 = (SubLObject)NIL;
            if (NIL != module0578.f35470((SubLObject)ONE_INTEGER)) {
                PrintLow.format((SubLObject)T, (SubLObject)$ic224$, var34);
            }
            final SubLObject var36 = Sequences.length(var34);
            if (var36.eql((SubLObject)ZERO_INTEGER)) {
                var35 = module0749.f46446(var31, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
            }
            else if (var36.eql((SubLObject)ONE_INTEGER)) {
                var35 = module0749.f46447(var34.first());
                module0749.f46457(var35, var31);
            }
            else {
                f47709(var7, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                f47723(var7, var31);
            }
            if (NIL != module0578.f35470((SubLObject)ONE_INTEGER)) {
                PrintLow.format((SubLObject)T, (SubLObject)$ic225$, var35);
            }
            if (NIL != module0749.f46482(var35)) {
                module0749.f46468(var35, f47487(var7, (SubLObject)UNPROVIDED));
                if (NIL != module0578.f35470((SubLObject)ONE_INTEGER)) {
                    PrintLow.format((SubLObject)T, (SubLObject)$ic226$, var35);
                }
                module0749.f46472(var35, f47691(var7));
                if (NIL != module0578.f35470((SubLObject)ONE_INTEGER)) {
                    PrintLow.format((SubLObject)T, (SubLObject)$ic227$, var35);
                }
                if (NIL == module0751.f46924(module0749.f46462(var35)) && NIL == f47476(module0749.f46466(var35))) {
                    final SubLObject var37 = f47511(var7);
                    final SubLObject var38 = module0751.f46982((SubLObject)NIL, var37);
                    module0749.f46464(var35, var38);
                }
                if (NIL != module0578.f35470((SubLObject)ONE_INTEGER)) {
                    PrintLow.format((SubLObject)T, (SubLObject)$ic228$, var35);
                }
                f47501(var7, (SubLObject)ConsesLow.list(var35), (SubLObject)T);
                f47608(var7);
            }
        }
        else {
            f47501(var7, (SubLObject)NIL, (SubLObject)UNPROVIDED);
        }
        return f47467(var7);
    }
    
    public static SubLObject f47711(final SubLObject var7) {
        final SubLObject var8 = f47467(var7);
        SubLObject var9 = module0751.f46705();
        if (NIL != module0035.f1997(var8)) {
            var9 = module0749.f46462(var8.first());
        }
        if (NIL != module0751.f46829(var9) && NIL == f47497(f47633(var7), (SubLObject)UNPROVIDED)) {
            var9 = module0751.f47211(f47511(var7));
        }
        return var9;
    }
    
    public static SubLObject f47469(final SubLObject var7, final SubLObject var342) {
        final SubLObject var343 = f47467(var7);
        SubLObject var344 = (SubLObject)NIL;
        final SubLObject var345 = Sequences.length(var343);
        if (var345.eql((SubLObject)ZERO_INTEGER)) {
            var344 = module0749.f46446(module0038.$g916$.getGlobalValue(), var342, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        }
        else if (var345.eql((SubLObject)ONE_INTEGER)) {
            var344 = module0749.f46447(var343.first());
            module0749.f46464(var344, var342);
        }
        else {
            f47709(var7, var342, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        }
        if (NIL != var344) {
            f47501(var7, (SubLObject)ConsesLow.list(var344), (SubLObject)UNPROVIDED);
        }
        return var7;
    }
    
    public static SubLObject f47502(final SubLObject var343) {
        return Mapping.mapcar((SubLObject)$ic229$, var343);
    }
    
    public static SubLObject f47468(final SubLObject var7, final SubLObject var1) {
        final SubLObject var8 = f47467(var7);
        SubLObject var9 = (SubLObject)NIL;
        final SubLObject var10 = Sequences.length(var8);
        if (var10.eql((SubLObject)ZERO_INTEGER)) {
            final SubLObject var11 = f47711(var7);
            var9 = module0749.f46446(module0038.$g916$.getGlobalValue(), var11, var1, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        }
        else if (var10.eql((SubLObject)ONE_INTEGER)) {
            var9 = module0749.f46447(var8.first());
            module0749.f46468(var9, var1);
        }
        else {
            f47465(var7, var1);
            f47709(var7, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        }
        if (NIL != var9) {
            f47501(var7, (SubLObject)ConsesLow.list(var9), (SubLObject)UNPROVIDED);
        }
        return f47467(var7);
    }
    
    public static SubLObject f47724(final SubLObject var7) {
        return var7;
    }
    
    public static SubLObject f47725(final SubLObject var7, final SubLObject var327, final SubLObject var328) {
        if (NIL != var327) {}
        if (NIL != var328) {}
        final SubLObject var329 = f47467(var7);
        final SubLObject var330 = Sequences.length(var329);
        if (var330.eql((SubLObject)ZERO_INTEGER)) {
            final SubLObject var331 = module0749.f46446(module0038.$g916$.getGlobalValue(), (SubLObject)NIL, (SubLObject)NIL, var327, var328, (SubLObject)UNPROVIDED);
            f47501(var7, (SubLObject)ConsesLow.list(var331), (SubLObject)UNPROVIDED);
        }
        else if (var330.eql((SubLObject)ONE_INTEGER)) {
            final SubLObject var331 = module0749.f46447(var329.first());
            module0749.f46479(var331, var327, var328);
            f47501(var7, (SubLObject)ConsesLow.list(var331), (SubLObject)UNPROVIDED);
        }
        else {
            final SubLObject var332 = module0749.f46447(var329.first());
            final SubLObject var333 = module0749.f46447(module0035.f2114(var329));
            module0749.f46479(var332, var327, (SubLObject)NIL);
            module0749.f46479(var333, (SubLObject)NIL, var328);
            final SubLObject var334 = conses_high.butlast(var329.rest(), (SubLObject)UNPROVIDED);
            final SubLObject var335 = (SubLObject)ConsesLow.cons(var332, ConsesLow.append(var334, (SubLObject)ConsesLow.list(var333)));
            f47501(var7, var335, (SubLObject)UNPROVIDED);
        }
        return var7;
    }
    
    public static SubLObject f47718(final SubLObject var7, final SubLObject var327, final SubLObject var328) {
        final SubLObject var329 = f47467(var7);
        final SubLObject var330 = var329.first();
        final SubLObject var331 = (SubLObject)((NIL != module0749.f46482(var330)) ? module0749.f46474(var330) : NIL);
        final SubLObject var332 = module0035.f2114(var329);
        final SubLObject var333 = (SubLObject)((NIL != module0749.f46482(var332)) ? module0749.f46476(var332) : NIL);
        final SubLObject var334 = var331.isString() ? Sequences.cconcatenate(var327, var331) : var327;
        final SubLObject var335 = var333.isString() ? Sequences.cconcatenate(var333, var328) : var328;
        f47725(var7, var334, var335);
        return var7;
    }
    
    public static SubLObject f47726(final SubLObject var7) {
        if (NIL == f47481(var7, (SubLObject)UNPROVIDED)) {
            final SubLObject var8 = f47691(var7);
            if ($ic230$ == f47488(var7, (SubLObject)UNPROVIDED)) {
                f47503(var7, (SubLObject)$ic230$, (SubLObject)UNPROVIDED);
            }
            else if (NIL != module0751.f47030(var8)) {
                f47503(var7, module0731.f44691(var8), (SubLObject)UNPROVIDED);
            }
            else if (NIL != module0751.f47107(var8)) {
                f47532(var7);
            }
        }
        return f47481(var7, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f47532(final SubLObject var7) {
        f47503(var7, module0751.f47118(), (SubLObject)UNPROVIDED);
        return f47481(var7, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f47591(final SubLObject var7) {
        return module0751.f47119(f47481(var7, (SubLObject)UNPROVIDED));
    }
    
    public static SubLObject f47652(final SubLObject var7) {
        return module0751.f47120(f47481(var7, (SubLObject)UNPROVIDED));
    }
    
    public static SubLObject f47727(final SubLObject var7) {
        return module0751.f47126(f47481(var7, (SubLObject)UNPROVIDED));
    }
    
    public static SubLObject f47728(final SubLObject var7) {
        return module0751.f46640(f47729(var7), $ic231$, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f47730(final SubLObject var7) {
        return module0751.f46640(f47481(var7, (SubLObject)UNPROVIDED), $ic162$, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f47653(final SubLObject var7) {
        return module0751.f47121(f47481(var7, (SubLObject)UNPROVIDED));
    }
    
    public static SubLObject f47731(final SubLObject var7) {
        f47503(var7, module0751.f47122(), (SubLObject)UNPROVIDED);
        return f47481(var7, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f47645(final SubLObject var7) {
        return module0751.f47123(f47481(var7, (SubLObject)UNPROVIDED));
    }
    
    public static SubLObject f47646(final SubLObject var7) {
        return module0751.f47124(f47481(var7, (SubLObject)UNPROVIDED));
    }
    
    public static SubLObject f47732(final SubLObject var7) {
        return (SubLObject)makeBoolean(NIL != f47497(var7, (SubLObject)UNPROVIDED) && f47606(var7, (SubLObject)UNPROVIDED).eql($ic232$));
    }
    
    public static SubLObject f47733(final SubLObject var7) {
        final SubLThread var8 = SubLProcess.currentSubLThread();
        SubLObject var9 = (SubLObject)NIL;
        if (NIL != f47497(var7, (SubLObject)UNPROVIDED)) {
            var9 = module0751.f46640(f47481(var7, (SubLObject)UNPROVIDED), $ic233$, (SubLObject)UNPROVIDED);
            if (NIL == var9 && NIL != module0751.f46842((SubLObject)ConsesLow.listS($ic234$, f47606(var7, (SubLObject)UNPROVIDED), (SubLObject)$ic235$), module0579.$g4260$.getDynamicValue(var8))) {
                final SubLObject var10 = f47633(var7);
                final SubLObject var11 = f47477(var10);
                final SubLObject var12 = module0048.f_1X(var11);
                final SubLObject var13 = f47590(var10, var12);
                if (NIL != f47497(var13, (SubLObject)UNPROVIDED)) {
                    final SubLObject var14 = f47480(var13, (SubLObject)UNPROVIDED);
                    if (NIL != module0581.f35648(var14) && NIL != conses_high.member($ic236$, module0581.f35668(module0581.f35666(var14, (SubLObject)UNPROVIDED).first(), (SubLObject)UNPROVIDED), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)) {
                        var9 = (SubLObject)T;
                    }
                }
            }
        }
        return var9;
    }
    
    public static SubLObject f47734(final SubLObject var7) {
        final SubLObject var8 = f47606(var7, (SubLObject)UNPROVIDED);
        final SubLObject var9 = f47480(var7, (SubLObject)UNPROVIDED);
        return (SubLObject)makeBoolean((NIL != var8 && NIL != conses_high.member(var8, module0772.f49253(), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)) || (NIL != var9 && NIL != conses_high.member(var9, module0772.f49249(), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)));
    }
    
    public static SubLObject f47735(final SubLObject var7) {
        return module0751.f46640(f47481(f47736(var7), (SubLObject)UNPROVIDED), $ic237$, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f47481(final SubLObject var7, SubLObject var359) {
        if (var359 == UNPROVIDED) {
            var359 = (SubLObject)T;
        }
        final SubLThread var360 = SubLProcess.currentSubLThread();
        final SubLObject var361 = module0743.f45995(var7);
        SubLObject var362 = (SubLObject)NIL;
        final SubLObject var363 = $g6079$.currentBinding(var360);
        try {
            $g6079$.bind(module0048.f_1X($g6079$.getDynamicValue(var360)), var360);
            if ($g6079$.getDynamicValue(var360).numG($g6080$.getGlobalValue())) {
                final SubLObject var364 = Sequences.cconcatenate((SubLObject)$ic48$, new SubLObject[] { module0006.f205((SubLObject)ONE_INTEGER), $ic49$, module0006.f203((SubLObject)$ic240$) });
                module0578.f35476(var364, (SubLObject)ConsesLow.list($g6079$.getDynamicValue(var360)));
            }
            else if (NIL != var359 && NIL != f47546(var7)) {
                var362 = f47481(f47590(var7, (SubLObject)ZERO_INTEGER), (SubLObject)UNPROVIDED);
            }
            else if (NIL != var361) {
                var362 = var361;
            }
            else if (NIL != var359) {
                if (NIL != f47737(var7)) {
                    var362 = f47481(f47648(var7), (SubLObject)UNPROVIDED);
                }
            }
        }
        finally {
            $g6079$.rebind(var363, var360);
        }
        return var362;
    }
    
    public static SubLObject f47729(final SubLObject var7) {
        return module0751.f47113(f47481(var7, (SubLObject)T), (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f47503(final SubLObject var7, SubLObject var44, SubLObject var206) {
        if (var206 == UNPROVIDED) {
            var206 = (SubLObject)T;
        }
        var44 = module0751.f46735(var44);
        if (NIL != f47538(var7) && var44 != $ic71$ && NIL != module0578.f35470((SubLObject)ONE_INTEGER) && NIL == module0578.f35477()) {
            Errors.warn((SubLObject)$ic241$, var44);
        }
        if (NIL != f47546(var7) && NIL != var206) {
            SubLObject var207 = (SubLObject)ZERO_INTEGER;
            if (module0743.f45996(var7).isVector()) {
                final SubLObject var208 = module0743.f45996(var7);
                final SubLObject var209 = (SubLObject)NIL;
                SubLObject var210;
                SubLObject var211;
                SubLObject var212;
                SubLObject var213;
                for (var210 = Sequences.length(var208), var211 = (SubLObject)NIL, var211 = (SubLObject)ZERO_INTEGER; var211.numL(var210); var211 = Numbers.add(var211, (SubLObject)ONE_INTEGER)) {
                    var212 = ((NIL != var209) ? Numbers.subtract(var210, var211, (SubLObject)ONE_INTEGER) : var211);
                    var213 = Vectors.aref(var208, var212);
                    f47503(var213, var44, var206);
                    var207 = Numbers.add(var207, (SubLObject)ONE_INTEGER);
                }
            }
        }
        else {
            module0743.f46002(var7, var44);
        }
        return var7;
    }
    
    public static SubLObject f47738(final SubLObject var7, final SubLObject var44, SubLObject var206, SubLObject var361) {
        if (var206 == UNPROVIDED) {
            var206 = (SubLObject)T;
        }
        if (var361 == UNPROVIDED) {
            var361 = (SubLObject)NIL;
        }
        if (NIL == module0759.f48038(var7)) {
            if (NIL != f47546(var7) && NIL != var206) {
                SubLObject var362 = (SubLObject)ZERO_INTEGER;
                if (module0743.f45996(var7).isVector()) {
                    final SubLObject var363 = module0743.f45996(var7);
                    final SubLObject var364 = (SubLObject)NIL;
                    SubLObject var365;
                    SubLObject var366;
                    SubLObject var367;
                    SubLObject var368;
                    for (var365 = Sequences.length(var363), var366 = (SubLObject)NIL, var366 = (SubLObject)ZERO_INTEGER; var366.numL(var365); var366 = Numbers.add(var366, (SubLObject)ONE_INTEGER)) {
                        var367 = ((NIL != var364) ? Numbers.subtract(var365, var366, (SubLObject)ONE_INTEGER) : var366);
                        var368 = Vectors.aref(var363, var367);
                        f47738(var368, var44, var206, (SubLObject)UNPROVIDED);
                        var362 = Numbers.add(var362, (SubLObject)ONE_INTEGER);
                    }
                }
            }
            else if ($ic162$.eql(var44) && NIL != f47591(var7)) {
                if (NIL != module0578.f35470((SubLObject)ONE_INTEGER)) {
                    PrintLow.format((SubLObject)T, (SubLObject)$ic242$);
                }
                final SubLObject var369 = f47484(var7, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                f47543(var7, var369);
                f47503(var7, var44, (SubLObject)NIL);
            }
            else if (NIL != module0751.f47114($ic162$, f47481(var7, (SubLObject)UNPROVIDED), (SubLObject)UNPROVIDED) && NIL != module0751.f47119(var44)) {
                if (NIL != module0578.f35470((SubLObject)ONE_INTEGER)) {
                    PrintLow.format((SubLObject)T, (SubLObject)$ic243$);
                }
                final SubLObject var369 = f47484(var7, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                f47543(var7, var369);
                f47503(var7, var44, (SubLObject)NIL);
            }
            else {
                final SubLObject var370 = f47481(var7, var206);
                final SubLObject var371 = (SubLObject)makeBoolean(NIL == var361);
                final SubLObject var372 = f47739(var370, var44, var371);
                f47740(var7, var44, var370);
                f47503(var7, var372, var206);
            }
        }
        return f47481(var7, var206);
    }
    
    public static SubLObject f47740(final SubLObject var7, final SubLObject var44, final SubLObject var362) {
        if (NIL != module0751.f46661((SubLObject)UNPROVIDED) && NIL != module0751.f47126(var44) && NIL != module0751.f47119(var362)) {
            final SubLObject var363 = f47487(var7, (SubLObject)UNPROVIDED);
            final SubLObject var364 = (SubLObject)((NIL != f47741(var7)) ? f47487(f47590(var7, (SubLObject)ONE_INTEGER), (SubLObject)UNPROVIDED) : NIL);
            if (NIL != module0751.f46877(var363) || NIL != module0751.f46877(var364)) {
                f47742(var7);
            }
        }
        return var7;
    }
    
    public static SubLObject f47742(final SubLObject var7) {
        if (NIL != module0578.f35470((SubLObject)ONE_INTEGER)) {
            PrintLow.format((SubLObject)T, (SubLObject)$ic244$, var7);
        }
        final SubLObject var8 = module0763.f48248((SubLObject)$ic245$, (SubLObject)UNPROVIDED);
        final SubLObject var9 = module0763.f48248((SubLObject)$ic246$, (SubLObject)UNPROVIDED);
        final SubLObject var10 = module0749.f46494((SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        final SubLObject var11 = module0749.f46494((SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        f47507(var10, (SubLObject)ConsesLow.list(var9, var7), (SubLObject)ZERO_INTEGER);
        f47503(var10, module0751.f47122(), (SubLObject)UNPROVIDED);
        f47507(var11, (SubLObject)ConsesLow.list(var8, var10), (SubLObject)ZERO_INTEGER);
        f47503(var11, module0751.f47125(), (SubLObject)UNPROVIDED);
        f47484(var11, var7, (SubLObject)UNPROVIDED);
        if (NIL != module0578.f35470((SubLObject)TWO_INTEGER)) {
            PrintLow.format((SubLObject)T, (SubLObject)$ic247$, var7);
        }
        return var7;
    }
    
    public static SubLObject f47739(final SubLObject var362, final SubLObject var44, SubLObject var363) {
        if (var363 == UNPROVIDED) {
            var363 = (SubLObject)T;
        }
        SubLObject var364 = var44;
        if (NIL != var362) {
            if (NIL == module0205.f13145((SubLObject)$ic248$, var362, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)) {
                var364 = var362;
            }
            else if (!var362.equal(var44)) {
                if (NIL != module0751.f46640(module0751.f47113(var362, (SubLObject)UNPROVIDED), $ic249$, (SubLObject)UNPROVIDED) && NIL != module0751.f46640(var44, $ic231$, (SubLObject)UNPROVIDED)) {
                    var364 = var362;
                }
                else if (NIL != module0751.f46640(var44, $ic191$, (SubLObject)UNPROVIDED) && NIL != module0751.f46640(module0751.f47113(var362, (SubLObject)UNPROVIDED), $ic165$, (SubLObject)UNPROVIDED)) {
                    var364 = var44;
                }
                else {
                    final SubLObject var365 = module0751.f47113(var362, (SubLObject)UNPROVIDED);
                    final SubLObject var366 = f47743(module0751.f47113(var44, (SubLObject)UNPROVIDED), var365, var363);
                    final SubLObject var367 = module0732.f44965(var362, var44);
                    final SubLObject var368 = module0732.f44978(var366, var367);
                    var364 = ((var365.equal(var366) && module0732.f44966(var362, (SubLObject)UNPROVIDED).eql(var367)) ? f47743(var362, var368, (SubLObject)UNPROVIDED) : var368);
                }
            }
        }
        return var364;
    }
    
    public static SubLObject f47743(final SubLObject var375, final SubLObject var376, SubLObject var363) {
        if (var363 == UNPROVIDED) {
            var363 = (SubLObject)T;
        }
        if (var375.equal(var376)) {
            return var375;
        }
        if (NIL != f47744(var375, var376)) {
            return var375;
        }
        if (NIL != f47744(var376, var375)) {
            return var376;
        }
        if (module0732.f44966(var376, (SubLObject)UNPROVIDED).numE((SubLObject)TWO_INTEGER) && NIL != module0751.f46669(module0751.f47113(var375, (SubLObject)UNPROVIDED), module0751.f47113(var376, (SubLObject)UNPROVIDED), (SubLObject)UNPROVIDED)) {
            return var376;
        }
        if (module0732.f44966(var375, (SubLObject)UNPROVIDED).numE((SubLObject)TWO_INTEGER) && NIL != module0751.f46669(module0751.f47113(var376, (SubLObject)UNPROVIDED), module0751.f47113(var375, (SubLObject)UNPROVIDED), (SubLObject)UNPROVIDED)) {
            return var375;
        }
        if (NIL != var363) {
            final SubLObject var377 = Sequences.cconcatenate((SubLObject)$ic48$, new SubLObject[] { module0006.f205((SubLObject)ONE_INTEGER), $ic49$, module0006.f203((SubLObject)$ic250$) });
            module0578.f35476(var377, (SubLObject)ConsesLow.list(var375, var376));
        }
        return var375;
    }
    
    public static SubLObject f47744(final SubLObject var375, final SubLObject var376) {
        final SubLThread var377 = SubLProcess.currentSubLThread();
        return (SubLObject)makeBoolean(NIL == var376 || var375.isKeyword() || (NIL != module0212.f13762(var375) && NIL != module0212.f13762(var376) && NIL != module0751.f46640(var375, var376, module0579.$g4260$.getDynamicValue(var377))));
    }
    
    public static SubLObject f47465(final SubLObject var7, final SubLObject var1) {
        if (NIL != module0579.f35492() && NIL != f47694(var1)) {
            final SubLObject var8 = f47504(var7, (SubLObject)NIL, (SubLObject)UNPROVIDED);
            if (NIL != module0581.f35648(var8) && NIL != module0579.f35493(var1, var8)) {
                final SubLObject var9 = Sequences.cconcatenate((SubLObject)$ic48$, new SubLObject[] { module0006.f205((SubLObject)TWO_INTEGER), $ic49$, module0006.f203((SubLObject)$ic223$) });
                module0578.f35476(var9, (SubLObject)ConsesLow.list(f47504(var7, (SubLObject)NIL, (SubLObject)UNPROVIDED), var1));
            }
        }
        module0749.f46403(module0743.f45994(var7), var1);
        return var7;
    }
    
    public static SubLObject f47745(final SubLObject var7, final SubLObject var107) {
        if (NIL == module0751.f46703(var107)) {
            final SubLObject var108 = f47487(var7, (SubLObject)UNPROVIDED);
            final SubLObject var109 = f47511(var7);
            f47465(var7, var107);
            module0758.f47898(var7, var108, var109);
        }
        return Values.values(f47487(var7, (SubLObject)UNPROVIDED), f47511(var7));
    }
    
    public static SubLObject f47746() {
        return $g6081$.getGlobalValue();
    }
    
    public static SubLObject f47476(final SubLObject var95) {
        return Equality.eq(var95, $g6081$.getGlobalValue());
    }
    
    public static SubLObject f47694(final SubLObject var95) {
        return (SubLObject)makeBoolean(NIL == f47476(var95) && NIL == f47747(var95));
    }
    
    public static SubLObject f47748() {
        return $g6082$.getGlobalValue();
    }
    
    public static SubLObject f47747(final SubLObject var95) {
        return Equality.eq(var95, $g6082$.getGlobalValue());
    }
    
    public static SubLObject f47624(final SubLObject var7, final SubLObject var1) {
        return module0749.f46426(var7, (SubLObject)$ic150$, (SubLObject)THREE_INTEGER, var1);
    }
    
    public static SubLObject f47717(final SubLObject var7) {
        final SubLObject var8 = module0749.f46420(var7, (SubLObject)$ic150$, (SubLObject)THREE_INTEGER, f47746());
        if (NIL != f47476(var8)) {
            return f47487(var7, (SubLObject)UNPROVIDED);
        }
        return var8;
    }
    
    public static SubLObject f47487(final SubLObject var7, SubLObject var378) {
        if (var378 == UNPROVIDED) {
            var378 = (SubLObject)NIL;
        }
        if (NIL != f47519(var7) && NIL != module0202.f12590(var378)) {
            module0758.f47879(var7, var378, f47633(var7));
            return f47487(var7, var378);
        }
        return module0749.f46397(module0743.f45994(var7));
    }
    
    public static SubLObject f47520(final SubLObject var7) {
        return f47694(f47487(var7, (SubLObject)UNPROVIDED));
    }
    
    public static SubLObject f47749(final SubLObject var7, final SubLObject var354) {
        SubLObject var355 = module0205.f13145(var354, f47487(var7, (SubLObject)UNPROVIDED), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        if (NIL == var355 && NIL != f47478(var7)) {
            SubLObject var356 = (SubLObject)ZERO_INTEGER;
            if (module0743.f45996(var7).isVector()) {
                final SubLObject var357 = module0743.f45996(var7);
                final SubLObject var358 = (SubLObject)NIL;
                SubLObject var359;
                SubLObject var360;
                SubLObject var361;
                SubLObject var362;
                for (var359 = Sequences.length(var357), var360 = (SubLObject)NIL, var360 = (SubLObject)ZERO_INTEGER; var360.numL(var359); var360 = Numbers.add(var360, (SubLObject)ONE_INTEGER)) {
                    var361 = ((NIL != var358) ? Numbers.subtract(var359, var360, (SubLObject)ONE_INTEGER) : var360);
                    var362 = Vectors.aref(var357, var361);
                    if (NIL == var355) {
                        var355 = f47749(var362, var354);
                    }
                    var356 = Numbers.add(var356, (SubLObject)ONE_INTEGER);
                }
            }
        }
        return var355;
    }
    
    public static SubLObject f47750(final SubLObject var7, final SubLObject var354, SubLObject var133) {
        if (var133 == UNPROVIDED) {
            var133 = Symbols.symbol_function((SubLObject)EQL);
        }
        SubLObject var355 = module0205.f13183(f47487(var7, (SubLObject)UNPROVIDED), var354, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        if (NIL != f47478(var7)) {
            SubLObject var356 = (SubLObject)ZERO_INTEGER;
            if (module0743.f45996(var7).isVector()) {
                final SubLObject var357 = module0743.f45996(var7);
                final SubLObject var358 = (SubLObject)NIL;
                SubLObject var359;
                SubLObject var360;
                SubLObject var361;
                SubLObject var362;
                for (var359 = Sequences.length(var357), var360 = (SubLObject)NIL, var360 = (SubLObject)ZERO_INTEGER; var360.numL(var359); var360 = Numbers.add(var360, (SubLObject)ONE_INTEGER)) {
                    var361 = ((NIL != var358) ? Numbers.subtract(var359, var360, (SubLObject)ONE_INTEGER) : var360);
                    var362 = Vectors.aref(var357, var361);
                    var355 = ConsesLow.append(var355, f47750(var362, var354, (SubLObject)UNPROVIDED));
                    var356 = Numbers.add(var356, (SubLObject)ONE_INTEGER);
                }
            }
        }
        return module0035.f2269(var355, var133, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f47751(final SubLObject var7, final SubLObject var1) {
        final SubLObject var8 = f47633(var7);
        final SubLObject var9 = f47752(var8, var1, var7, (SubLObject)UNPROVIDED);
        if (NIL == var9 && NIL != module0578.f35470((SubLObject)ONE_INTEGER)) {
            PrintLow.format((SubLObject)T, (SubLObject)$ic253$, var1, var7);
        }
        return Types.sublisp_null(var9);
    }
    
    public static SubLObject f47752(final SubLObject var7, final SubLObject var1, final SubLObject var380, SubLObject var381) {
        if (var381 == UNPROVIDED) {
            var381 = module0077.f5313((SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        }
        final SubLObject var382 = (SubLObject)makeBoolean(NIL == f47478(var7));
        SubLObject var383 = (SubLObject)NIL;
        if (var7.eql(var380)) {
            var383 = (SubLObject)NIL;
        }
        else if (NIL != module0077.f5320(var7, var381)) {
            var383 = (SubLObject)NIL;
        }
        else if (NIL != var382 && var1.equal(f47487(var7, (SubLObject)UNPROVIDED))) {
            var383 = f47753(var7, var1, var380);
        }
        else if (NIL != var382 && NIL != module0205.f13220(var1, f47487(var7, (SubLObject)UNPROVIDED), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED) && NIL == f47683(var7, var380)) {
            var383 = f47753(var7, var1, var380);
        }
        if (NIL == var383) {
            module0077.f5326(var7, var381);
            if (NIL == var382) {
                SubLObject var384 = (SubLObject)ZERO_INTEGER;
                if (module0743.f45996(var7).isVector()) {
                    final SubLObject var385 = module0743.f45996(var7);
                    final SubLObject var386 = (SubLObject)NIL;
                    SubLObject var387;
                    SubLObject var388;
                    SubLObject var389;
                    SubLObject var390;
                    SubLObject var391;
                    for (var387 = Sequences.length(var385), var388 = (SubLObject)NIL, var388 = (SubLObject)ZERO_INTEGER; var388.numL(var387); var388 = Numbers.add(var388, (SubLObject)ONE_INTEGER)) {
                        var389 = ((NIL != var386) ? Numbers.subtract(var387, var388, (SubLObject)ONE_INTEGER) : var388);
                        var390 = Vectors.aref(var385, var389);
                        if (NIL == module0077.f5320(var390, var381) && var7.eql(f47633(var390))) {
                            var391 = f47752(var390, var1, var380, var381);
                            if (NIL != var391) {
                                var383 = var391;
                            }
                        }
                        var384 = Numbers.add(var384, (SubLObject)ONE_INTEGER);
                    }
                }
            }
            if (NIL == var383) {
                final SubLObject var392 = f47633(var7);
                if (NIL != f47497(var392, (SubLObject)UNPROVIDED) && NIL == module0077.f5320(var392, var381)) {
                    if (NIL != Sequences.find(var7, f47516(var392), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)) {
                        final SubLObject var393 = f47752(var392, var1, var380, var381);
                        if (NIL != var393) {
                            var383 = var393;
                        }
                    }
                    else if (NIL != module0578.f35470((SubLObject)ONE_INTEGER) && NIL == module0578.f35477()) {
                        Errors.warn((SubLObject)$ic254$, var7, var392);
                    }
                }
            }
        }
        return var383;
    }
    
    public static SubLObject f47753(final SubLObject var7, final SubLObject var1, final SubLObject var380) {
        if (NIL != module0578.f35470((SubLObject)ONE_INTEGER)) {
            PrintLow.format((SubLObject)T, (SubLObject)$ic255$, new SubLObject[] { var1, var380, var7 });
        }
        return var7;
    }
    
    public static SubLObject f47754(final SubLObject var384, final SubLObject var385, final SubLObject var7, SubLObject var133, SubLObject var386) {
        if (var133 == UNPROVIDED) {
            var133 = Symbols.symbol_function((SubLObject)EQL);
        }
        if (var386 == UNPROVIDED) {
            var386 = (SubLObject)$ic256$;
        }
        SubLObject var387 = (SubLObject)NIL;
        final SubLObject var388 = (SubLObject)NIL;
        if (NIL != module0205.f13220(var385, f47487(var7, (SubLObject)UNPROVIDED), var388, var133, (SubLObject)UNPROVIDED)) {
            f47465(var7, module0205.f13250(var384, var385, f47487(var7, (SubLObject)UNPROVIDED), var133, (SubLObject)UNPROVIDED));
            final SubLObject var389 = f47487(var7, (SubLObject)UNPROVIDED);
            f47755(var7, var384, var385, var389, var386);
            var387 = (SubLObject)T;
        }
        if (NIL != f47519(var7)) {
            f47576(var7, module0205.f13250(var384, var385, f47575(var7), var133, (SubLObject)UNPROVIDED));
            var387 = module0205.f13220(var384, f47575(var7), var133, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        }
        if (NIL != f47478(var7)) {
            SubLObject var390 = (SubLObject)ZERO_INTEGER;
            if (module0743.f45996(var7).isVector()) {
                final SubLObject var391 = module0743.f45996(var7);
                final SubLObject var392 = (SubLObject)NIL;
                SubLObject var393;
                SubLObject var394;
                SubLObject var395;
                SubLObject var396;
                SubLObject var397;
                for (var393 = Sequences.length(var391), var394 = (SubLObject)NIL, var394 = (SubLObject)ZERO_INTEGER; var394.numL(var393); var394 = Numbers.add(var394, (SubLObject)ONE_INTEGER)) {
                    var395 = ((NIL != var392) ? Numbers.subtract(var393, var394, (SubLObject)ONE_INTEGER) : var394);
                    var396 = Vectors.aref(var391, var395);
                    var397 = f47754(var384, var385, var396, var133, var386);
                    if (NIL != var397) {
                        var387 = (SubLObject)T;
                    }
                    var390 = Numbers.add(var390, (SubLObject)ONE_INTEGER);
                }
            }
        }
        if (NIL != f47547(var7)) {
            final SubLObject var398 = f47555(var7);
            final SubLObject var399 = module0205.f13250(var384, var385, var398, var133, (SubLObject)UNPROVIDED);
            final SubLObject var400 = f47560(var7);
            final SubLObject var401 = (SubLObject)((NIL != module0751.f46924(var386)) ? module0751.f46604(var386) : NIL);
            final SubLObject var402 = (NIL != var401) ? module0205.f13250(var401, var385, var400, var133, (SubLObject)UNPROVIDED) : var400;
            if (!var398.equal(var399)) {
                f47557(var7, var399);
                var387 = (SubLObject)T;
            }
            if (!var400.equal(var402)) {
                f47561(var7, var402);
                var387 = (SubLObject)T;
            }
        }
        return var387;
    }
    
    public static SubLObject f47755(final SubLObject var7, final SubLObject var384, final SubLObject var385, final SubLObject var388, final SubLObject var386) {
        if (NIL != module0751.f46943(var386)) {
            f47756(var7, var384, var388, var386);
            f47757(var7, var384, var388, var386);
        }
        f47758(var7, var384, var385);
        return var7;
    }
    
    public static SubLObject f47756(final SubLObject var7, final SubLObject var384, final SubLObject var388, final SubLObject var386) {
        if (var388.equal(var384)) {
            if (NIL != module0578.f35470((SubLObject)ONE_INTEGER)) {
                PrintLow.format((SubLObject)T, (SubLObject)$ic257$, var384, var386);
            }
            f47469(var7, var386);
        }
        return f47711(var7);
    }
    
    public static SubLObject f47757(final SubLObject var7, final SubLObject var384, final SubLObject var388, final SubLObject var386) {
        final SubLObject var389 = module0751.f47197(var386);
        final SubLObject var390 = (SubLObject)((NIL != module0202.f12590(var388)) ? module0205.f13397(var384, var388, (SubLObject)UNPROVIDED).first() : NIL);
        final SubLObject var391 = module0751.f46695(var390, var389);
        f47464(var7, var391);
        return f47511(var7);
    }
    
    public static SubLObject f47758(final SubLObject var7, final SubLObject var384, final SubLObject var385) {
        SubLObject var386 = f47467(var7);
        SubLObject var387 = (SubLObject)NIL;
        var387 = var386.first();
        while (NIL != var386) {
            module0749.f46468(var387, module0205.f13250(var384, var385, module0749.f46466(var387), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED));
            var386 = var386.rest();
            var387 = var386.first();
        }
        return f47467(var7);
    }
    
    public static SubLObject f47759(final SubLObject var396) {
        SubLObject var397 = (SubLObject)NIL;
        SubLObject var398 = var396;
        SubLObject var399 = (SubLObject)NIL;
        var399 = var398.first();
        while (NIL != var398) {
            if (NIL != f47497(var399, (SubLObject)UNPROVIDED)) {
                var397 = (SubLObject)ConsesLow.cons(f47487(var399, (SubLObject)UNPROVIDED), var397);
            }
            else if (NIL != module0749.f46430(var399)) {
                var397 = (SubLObject)ConsesLow.cons(module0749.f46466(var399), var397);
            }
            else if (NIL != module0578.f35470((SubLObject)TWO_INTEGER)) {
                PrintLow.format((SubLObject)T, (SubLObject)$ic258$, var399);
            }
            var398 = var398.rest();
            var399 = var398.first();
        }
        return Sequences.reverse(var397);
    }
    
    public static SubLObject f47467(final SubLObject var7) {
        return module0749.f46400(module0743.f45994(var7));
    }
    
    public static SubLObject f47760(final SubLObject var7) {
        SubLObject var8 = (SubLObject)NIL;
        SubLObject var9 = (SubLObject)ZERO_INTEGER;
        if (module0743.f45996(var7).isVector()) {
            final SubLObject var10 = module0743.f45996(var7);
            final SubLObject var11 = (SubLObject)NIL;
            SubLObject var12;
            SubLObject var13;
            SubLObject var14;
            SubLObject var15;
            for (var12 = Sequences.length(var10), var13 = (SubLObject)NIL, var13 = (SubLObject)ZERO_INTEGER; var13.numL(var12); var13 = Numbers.add(var13, (SubLObject)ONE_INTEGER)) {
                var14 = ((NIL != var11) ? Numbers.subtract(var12, var13, (SubLObject)ONE_INTEGER) : var13);
                var15 = Vectors.aref(var10, var14);
                var8 = (SubLObject)ConsesLow.cons(f47467(var15), var8);
                var9 = Numbers.add(var9, (SubLObject)ONE_INTEGER);
            }
        }
        return Sequences.nreverse(var8);
    }
    
    public static SubLObject f47501(final SubLObject var7, SubLObject var312, SubLObject var400) {
        if (var400 == UNPROVIDED) {
            var400 = (SubLObject)NIL;
        }
        if (NIL == var400) {
            var312 = f47761(var312);
        }
        module0749.f46406(module0743.f45994(var7), var312);
        f47714(var7);
        return var7;
    }
    
    public static SubLObject f47761(final SubLObject var312) {
        if (NIL == module0035.f2002(var312, (SubLObject)ONE_INTEGER, (SubLObject)UNPROVIDED)) {
            return var312;
        }
        return f47762(var312);
    }
    
    public static SubLObject f47762(final SubLObject var312) {
        SubLObject var313 = (SubLObject)NIL;
        SubLObject var314 = (SubLObject)NIL;
        SubLObject var315 = (SubLObject)NIL;
        SubLObject var316 = var312;
        SubLObject var317 = (SubLObject)NIL;
        var317 = var316.first();
        while (NIL != var316) {
            if (NIL != module0751.f47062(module0749.f46466(var317)) || NIL != module0304.f20296(module0749.f46466(var317))) {
                final SubLObject var318 = module0749.f46447(var317);
                module0749.f46468(var318, f47746());
                var317 = var318;
            }
            final SubLObject var319 = module0749.f46455(var317);
            if (NIL != var314 && NIL != f47763(var314, var317)) {
                if (NIL != module0581.f35648(var319)) {
                    var315 = (SubLObject)ConsesLow.cons(var319, var315);
                }
                var314 = f47764(var317, var314);
            }
            else {
                if (NIL != var314) {
                    if (NIL != module0035.f2002(var315, (SubLObject)ZERO_INTEGER, (SubLObject)UNPROVIDED) && NIL == module0749.f46448(var314)) {
                        var314 = f47765(var314, var315);
                    }
                    var313 = (SubLObject)ConsesLow.cons(var314, var313);
                }
                var314 = var317;
                var315 = (SubLObject)((NIL != module0581.f35648(var319)) ? ConsesLow.list(var319) : NIL);
            }
            var316 = var316.rest();
            var317 = var316.first();
        }
        if (NIL != var314) {
            if (NIL != module0035.f2002(var315, (SubLObject)ONE_INTEGER, (SubLObject)UNPROVIDED)) {
                var314 = f47765(var314, var315);
            }
            var313 = (SubLObject)ConsesLow.cons(var314, var313);
        }
        return Sequences.nreverse(var313);
    }
    
    public static SubLObject f47765(final SubLObject var401, final SubLObject var402) {
        final SubLObject var403 = module0749.f46447(var401);
        final SubLObject var404 = module0751.f46711(module0751.f46722(var402, (SubLObject)UNPROVIDED));
        module0749.f46457(var403, var404);
        return var403;
    }
    
    public static SubLObject f47764(final SubLObject var175, final SubLObject var401) {
        final SubLObject var402 = module0749.f46447(var401);
        final SubLObject var403 = (NIL != module0751.f46829(module0749.f46462(var401))) ? module0749.f46462(var175) : module0749.f46462(var401);
        final SubLObject var404 = (NIL != f47476(module0749.f46466(var401))) ? module0749.f46466(var175) : module0749.f46466(var401);
        final SubLObject var405 = (NIL != module0749.f46474(var401)) ? module0749.f46474(var401) : module0749.f46474(var175);
        final SubLObject var406 = (NIL != module0749.f46476(var401)) ? module0749.f46476(var401) : module0749.f46476(var175);
        final SubLObject var407 = (NIL != module0749.f46470(var401)) ? module0749.f46470(var401) : module0749.f46470(var175);
        module0749.f46464(var402, var403);
        module0749.f46468(var402, var404);
        module0749.f46479(var402, var405, var406);
        module0749.f46472(var402, var407);
        return var402;
    }
    
    public static SubLObject f47763(final SubLObject var406, final SubLObject var407) {
        if (NIL != f47766(var406, var407)) {
            return (SubLObject)NIL;
        }
        if (NIL != module0749.f46448(var406) || NIL != module0749.f46448(var407)) {
            return (SubLObject)NIL;
        }
        return (SubLObject)makeBoolean((module0749.f46455(var407).isString() && NIL != module0035.f1995(module0749.f46455(var407), (SubLObject)ONE_INTEGER, (SubLObject)UNPROVIDED) && NIL != module0751.f46717(module0749.f46455(var407), (SubLObject)UNPROVIDED) && NIL == module0749.f46462(var406) && NIL == module0749.f46474(var406) && NIL == module0749.f46474(var407) && NIL == module0749.f46476(var407)) || (NIL != f47585(var407, (SubLObject)NIL) && NIL != f47767(var406)) || (NIL != f47585(var406, (SubLObject)NIL) && NIL != f47767(var407)) || (((NIL != module0751.f46829(module0749.f46462(var406)) && NIL != module0751.f46829(module0749.f46462(var407))) || NIL != f47767(var406) || NIL != f47767(var407) || module0749.f46462(var406).equal(module0749.f46462(var407))) && (NIL != f47476(module0749.f46466(var406)) || NIL != f47476(module0749.f46466(var407)) || module0749.f46466(var406).equal(module0749.f46466(var407))) && ((NIL == module0749.f46474(var406) && NIL == module0749.f46474(var407)) || module0749.f46474(var406).equal(module0749.f46474(var407))) && ((NIL == module0749.f46476(var406) && NIL == module0749.f46476(var407)) || module0749.f46476(var406).equal(module0749.f46476(var407)))));
    }
    
    public static SubLObject f47766(final SubLObject var406, final SubLObject var407) {
        SubLObject var408 = (SubLObject)T;
        if (NIL != f47768(var406, var407)) {
            var408 = (SubLObject)T;
        }
        else if (NIL != f47769(var406) || NIL != f47769(var407)) {
            var408 = (SubLObject)NIL;
        }
        else if (NIL != module0749.f46474(var406) && NIL != module0749.f46474(var407)) {
            var408 = (SubLObject)NIL;
        }
        else if (NIL != module0749.f46476(var406) && NIL != module0749.f46476(var407)) {
            var408 = (SubLObject)NIL;
        }
        else if (NIL == module0579.f35497() && (NIL != f47767(var406) || NIL != f47767(var407))) {
            var408 = (SubLObject)NIL;
        }
        return (SubLObject)makeBoolean(NIL == var408);
    }
    
    public static SubLObject f47769(final SubLObject var175) {
        return (SubLObject)makeBoolean((module0749.f46474(var175).isString() && NIL != module0038.f2611(module0751.f46648(module0749.f46474(var175), (SubLObject)T))) || (module0749.f46476(var175).isString() && NIL != module0038.f2611(module0751.f46648(module0749.f46476(var175), (SubLObject)T))));
    }
    
    public static SubLObject f47768(final SubLObject var406, final SubLObject var407) {
        final SubLObject var408 = module0749.f46474(var406);
        final SubLObject var409 = module0749.f46474(var407);
        final SubLObject var410 = module0749.f46476(var406);
        final SubLObject var411 = module0749.f46476(var407);
        return f47770(var408, var409, var410, var411);
    }
    
    public static SubLObject f47770(final SubLObject var409, final SubLObject var410, final SubLObject var411, final SubLObject var412) {
        return (SubLObject)makeBoolean(NIL != module0038.f2653(var409) && NIL != module0038.f2653(var410) && NIL != module0038.f2653(var411) && NIL != module0038.f2653(var412) && var409.equalp(var410) && var411.equalp(var412) && NIL != module0751.f47183(var409, var411));
    }
    
    public static SubLObject f47771() {
        final SubLThread var4 = SubLProcess.currentSubLThread();
        final SubLObject var5 = (NIL != f47772()) ? module0579.$g4336$.getDynamicValue(var4) : f47746();
        return var5;
    }
    
    public static SubLObject f47772() {
        final SubLThread var4 = SubLProcess.currentSubLThread();
        return module0205.f13145(Symbols.symbol_function((SubLObject)$ic248$), module0579.$g4336$.getDynamicValue(var4), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f47773() {
        final SubLThread var4 = SubLProcess.currentSubLThread();
        return (SubLObject)((NIL != module0751.f46943(module0579.$g4335$.getDynamicValue(var4))) ? module0579.$g4335$.getDynamicValue(var4) : NIL);
    }
    
    public static SubLObject f47774(final SubLObject var7) {
        final SubLObject var8 = f47487(var7, (SubLObject)UNPROVIDED);
        if (NIL == module0751.f46819(var8) && NIL == f47478(var7)) {
            module0758.f47951(var7);
        }
        return var7;
    }
    
    public static SubLObject f47775(final SubLObject var7) {
        if (NIL == f47772()) {
            f47465(var7, f47771());
            f47468(var7, f47771());
        }
        return var7;
    }
    
    public static SubLObject f47767(final SubLObject var175) {
        return f47776(module0749.f46462(var175));
    }
    
    public static SubLObject f47776(final SubLObject var8) {
        return (SubLObject)makeBoolean(NIL == module0751.f46829(var8) && conses_high.last(var8, (SubLObject)UNPROVIDED).equal((SubLObject)$ic4$));
    }
    
    public static SubLObject f47585(final SubLObject var175, final SubLObject var415) {
        return (SubLObject)makeBoolean((NIL != var415 || NIL == module0581.f35648(module0749.f46455(var175)) || NIL != module0581.f35673((SubLObject)$ic259$, module0749.f46455(var175))) && NIL == module0749.f46474(var175) && NIL == module0749.f46476(var175) && NIL != module0751.f46829(module0749.f46462(var175)) && NIL != f47476(module0749.f46466(var175)));
    }
    
    public static SubLObject f47777(final SubLObject var7, final SubLObject var312) {
        f47501(var7, var312, (SubLObject)UNPROVIDED);
        final SubLObject var313 = f47511(var7);
        SubLObject var314 = f47467(var7);
        SubLObject var315 = (SubLObject)NIL;
        var315 = var314.first();
        while (NIL != var314) {
            module0749.f46464(var315, module0751.f46982(module0749.f46462(var315), var313));
            var314 = var314.rest();
            var315 = var314.first();
        }
        return f47467(var7);
    }
    
    public static SubLObject f47709(final SubLObject var7, SubLObject var8, SubLObject var321, SubLObject var322, SubLObject var405) {
        if (var8 == UNPROVIDED) {
            var8 = module0751.f46705();
        }
        if (var321 == UNPROVIDED) {
            var321 = (SubLObject)NIL;
        }
        if (var322 == UNPROVIDED) {
            var322 = (SubLObject)NIL;
        }
        if (var405 == UNPROVIDED) {
            var405 = f47691(var7);
        }
        final SubLObject var406 = f47627(var7);
        final SubLObject var407 = f47510(var7);
        SubLObject var408 = (SubLObject)NIL;
        if (NIL != module0035.f1997(f47467(var7))) {
            final SubLObject var409 = f47467(var7).first();
            final SubLObject var410 = (NIL != module0749.f46450(var409)) ? var409 : module0749.f46451(var409, var406, var407);
            if (NIL != module0749.f46450(var409)) {
                module0749.f46487(var410, var406);
                module0749.f46488(var410, var407);
            }
            module0749.f46464(var410, var8);
            module0749.f46479(var410, var321, var322);
            module0749.f46472(var410, var405);
            var408 = (SubLObject)ConsesLow.list(var410);
        }
        else {
            final SubLObject var411 = f47480(var7, (SubLObject)NIL);
            final SubLObject var412 = f47487(var7, (SubLObject)UNPROVIDED);
            final SubLObject var413 = (NIL != module0581.f35648(var411)) ? var411 : module0038.$g916$.getGlobalValue();
            final SubLObject var414 = module0749.f46451(module0749.f46446(var413, var8, var412, var321, var322, var405), var406, var407);
            var408 = (SubLObject)ConsesLow.list(var414);
        }
        f47501(var7, var408, (SubLObject)UNPROVIDED);
        return f47467(var7);
    }
    
    public static SubLObject f47712(final SubLObject var419, SubLObject var31, SubLObject var1, SubLObject var8, SubLObject var321, SubLObject var322, SubLObject var405, SubLObject var288) {
        if (var31 == UNPROVIDED) {
            var31 = (SubLObject)$ic260$;
        }
        if (var1 == UNPROVIDED) {
            var1 = f47746();
        }
        if (var8 == UNPROVIDED) {
            var8 = module0751.f46705();
        }
        if (var321 == UNPROVIDED) {
            var321 = (SubLObject)NIL;
        }
        if (var322 == UNPROVIDED) {
            var322 = (SubLObject)NIL;
        }
        if (var405 == UNPROVIDED) {
            var405 = (SubLObject)NIL;
        }
        if (var288 == UNPROVIDED) {
            var288 = (SubLObject)NIL;
        }
        if (NIL != module0035.f1997(var419)) {
            final SubLObject var420 = var419.first();
            module0749.f46464(var420, var8);
            module0749.f46479(var420, var321, var322);
            module0749.f46472(var420, var405);
            return var420;
        }
        final SubLObject var421 = (NIL != module0581.f35648(var31)) ? var31 : module0751.f46722(Mapping.mapcar((SubLObject)$ic216$, Sequences.reverse(var419), new SubLObject[] { var288 }), (SubLObject)UNPROVIDED);
        return module0749.f46446(var421, var8, var1, var321, var322, var405);
    }
    
    public static SubLObject f47778(final SubLObject var31, SubLObject var327, SubLObject var328, SubLObject var405) {
        if (var327 == UNPROVIDED) {
            var327 = (SubLObject)NIL;
        }
        if (var328 == UNPROVIDED) {
            var328 = (SubLObject)NIL;
        }
        if (var405 == UNPROVIDED) {
            var405 = (SubLObject)NIL;
        }
        return (SubLObject)ConsesLow.list(module0749.f46446(var31, module0751.f46705(), f47746(), var327, var328, var405));
    }
    
    public static SubLObject f47482(final SubLObject var7) {
        final SubLObject var8 = module0749.f46398(module0743.f45994(var7));
        if (NIL != f47519(var7)) {
            SubLObject var9 = (SubLObject)NIL;
            SubLObject var10 = (SubLObject)NIL;
            SubLObject var11 = (SubLObject)ZERO_INTEGER;
            if (module0743.f45996(var7).isVector()) {
                final SubLObject var12 = module0743.f45996(var7);
                final SubLObject var13 = (SubLObject)NIL;
                SubLObject var14;
                SubLObject var15;
                SubLObject var16;
                SubLObject var17;
                for (var14 = Sequences.length(var12), var15 = (SubLObject)NIL, var15 = (SubLObject)ZERO_INTEGER; var15.numL(var14); var15 = Numbers.add(var15, (SubLObject)ONE_INTEGER)) {
                    var16 = ((NIL != var13) ? Numbers.subtract(var14, var15, (SubLObject)ONE_INTEGER) : var15);
                    var17 = Vectors.aref(var12, var16);
                    if (NIL == module0749.f46374(var10)) {
                        var10 = f47482(var17);
                    }
                    else if (!var10.equalp(f47482(var17))) {
                        var9 = (SubLObject)T;
                    }
                    var11 = Numbers.add(var11, (SubLObject)ONE_INTEGER);
                }
            }
            return (SubLObject)((NIL != var9) ? NIL : var10);
        }
        if (NIL != module0749.f46374(var8)) {
            return var8;
        }
        if (NIL == f47737(var7)) {
            return (SubLObject)NIL;
        }
        final SubLObject var18 = f47482(f47648(var7));
        if (NIL != module0749.f46374(var18)) {
            final SubLObject var19 = module0749.f46375(var18);
            final SubLObject var420_425 = module0749.f46382(var19, (SubLObject)UNPROVIDED);
            f47508(var7, var420_425, (SubLObject)NIL);
            return var420_425;
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f47779(final SubLObject var7) {
        if (NIL != f47780(var7, (SubLObject)$ic261$)) {
            return (SubLObject)ConsesLow.list(f47781(var7, (SubLObject)$ic261$));
        }
        if (NIL != f47780(var7, (SubLObject)$ic262$)) {
            return f47781(var7, (SubLObject)$ic262$);
        }
        if (NIL != f47780(var7, (SubLObject)$ic263$)) {
            return (SubLObject)$ic230$;
        }
        if (NIL != module0578.f35470((SubLObject)ONE_INTEGER) && NIL == module0578.f35477()) {
            Errors.warn((SubLObject)$ic264$, f47482(var7));
        }
        return (SubLObject)$ic230$;
    }
    
    public static SubLObject f47508(final SubLObject var7, final SubLObject var318, SubLObject var206) {
        if (var206 == UNPROVIDED) {
            var206 = (SubLObject)T;
        }
        final SubLObject var319 = module0749.f46376(var318);
        if (NIL != module0751.f47172(var319) && NIL != f47496(module0751.f47173(var319)) && NIL == f47496(var7)) {
            final SubLObject var320 = Sequences.cconcatenate((SubLObject)$ic48$, new SubLObject[] { module0006.f205((SubLObject)ONE_INTEGER), $ic49$, module0006.f203((SubLObject)$ic265$) });
            module0578.f35476(var320, (SubLObject)ConsesLow.list(module0751.f47173(var319), var7));
        }
        if (NIL != f47546(var7) && NIL != var206) {
            SubLObject var321 = (SubLObject)ZERO_INTEGER;
            if (module0743.f45996(var7).isVector()) {
                final SubLObject var322 = module0743.f45996(var7);
                final SubLObject var323 = (SubLObject)NIL;
                SubLObject var324;
                SubLObject var325;
                SubLObject var326;
                SubLObject var327;
                for (var324 = Sequences.length(var322), var325 = (SubLObject)NIL, var325 = (SubLObject)ZERO_INTEGER; var325.numL(var324); var325 = Numbers.add(var325, (SubLObject)ONE_INTEGER)) {
                    var326 = ((NIL != var323) ? Numbers.subtract(var324, var325, (SubLObject)ONE_INTEGER) : var325);
                    var327 = Vectors.aref(var322, var326);
                    f47508(var327, var318, (SubLObject)UNPROVIDED);
                    var321 = Numbers.add(var321, (SubLObject)ONE_INTEGER);
                }
            }
        }
        else {
            if (NIL != f47482(var7) && NIL == module0749.f46385(f47482(var7)) && NIL != module0749.f46385(var318) && NIL != module0578.f35470((SubLObject)ONE_INTEGER)) {
                PrintLow.format((SubLObject)T, (SubLObject)$ic266$, var7);
            }
            module0749.f46404(module0743.f45994(var7), var318);
        }
        return var7;
    }
    
    public static SubLObject f47782(final SubLObject var7, SubLObject var206) {
        if (var206 == UNPROVIDED) {
            var206 = (SubLObject)T;
        }
        final SubLObject var207 = f47482(var7);
        final SubLObject var208 = module0749.f46388(var207, (SubLObject)UNPROVIDED);
        module0749.f46387(var208, (SubLObject)NIL);
        f47508(var7, var208, var206);
        return f47482(var7);
    }
    
    public static SubLObject f47534(final SubLObject var7, final SubLObject var427, SubLObject var206) {
        if (var206 == UNPROVIDED) {
            var206 = (SubLObject)T;
        }
        if (NIL == module0751.f47169(var427) && NIL == module0751.f47171(var427) && NIL != conses_high.member(module0751.f47173(var427), (SubLObject)$ic267$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)) {
            final SubLObject var428 = Sequences.cconcatenate((SubLObject)$ic48$, new SubLObject[] { module0006.f205((SubLObject)ONE_INTEGER), $ic49$, module0006.f203((SubLObject)$ic268$) });
            module0578.f35476(var428, (SubLObject)ConsesLow.list(var427));
        }
        if (NIL != module0035.f1997(module0751.f47173(var427))) {
            final SubLObject var428 = Sequences.cconcatenate((SubLObject)$ic48$, new SubLObject[] { module0006.f205((SubLObject)ONE_INTEGER), $ic49$, module0006.f203((SubLObject)$ic269$) });
            module0578.f35476(var428, (SubLObject)ConsesLow.list(var427));
        }
        final SubLObject var429 = f47482(var7);
        if (NIL != module0751.f47167(var427)) {
            if (NIL != module0749.f46374(var429)) {
                module0749.f46386(var429, var427);
            }
            else {
                f47508(var7, module0749.f46382(var427, (SubLObject)UNPROVIDED), var206);
            }
        }
        else if (NIL != module0749.f46374(var429)) {
            module0749.f46387(var429, var427);
        }
        else if (NIL == f47546(var7)) {
            f47508(var7, module0749.f46382((SubLObject)NIL, var427), (SubLObject)UNPROVIDED);
        }
        if (NIL != f47546(var7) && NIL != var206) {
            SubLObject var430 = (SubLObject)ZERO_INTEGER;
            if (module0743.f45996(var7).isVector()) {
                final SubLObject var431 = module0743.f45996(var7);
                final SubLObject var432 = (SubLObject)NIL;
                SubLObject var433;
                SubLObject var434;
                SubLObject var435;
                SubLObject var436;
                for (var433 = Sequences.length(var431), var434 = (SubLObject)NIL, var434 = (SubLObject)ZERO_INTEGER; var434.numL(var433); var434 = Numbers.add(var434, (SubLObject)ONE_INTEGER)) {
                    var435 = ((NIL != var432) ? Numbers.subtract(var433, var434, (SubLObject)ONE_INTEGER) : var434);
                    var436 = Vectors.aref(var431, var435);
                    f47534(var436, var427, (SubLObject)UNPROVIDED);
                    var430 = Numbers.add(var430, (SubLObject)ONE_INTEGER);
                }
            }
        }
        return var7;
    }
    
    public static SubLObject f47783(final SubLObject var7, final SubLObject var354, SubLObject var206) {
        if (var206 == UNPROVIDED) {
            var206 = (SubLObject)T;
        }
        final SubLObject var355 = f47467(var7);
        if (NIL != module0035.f1997(var355)) {
            final SubLObject var356 = module0749.f46447(var355.first());
            module0749.f46472(var356, var354);
            f47501(var7, (SubLObject)ConsesLow.list(var356), (SubLObject)UNPROVIDED);
        }
        if (NIL != module0731.f44690(var354, (SubLObject)UNPROVIDED) && !$ic249$.eql(module0751.f47113(f47481(var7, (SubLObject)UNPROVIDED), (SubLObject)UNPROVIDED))) {
            final SubLObject var206_428 = (SubLObject)T;
            final SubLObject var357 = (SubLObject)T;
            f47738(var7, module0731.f44691(var354), var206_428, var357);
        }
        return f47784(var7, (SubLObject)ConsesLow.list(var354), var206);
    }
    
    public static SubLObject f47785(final SubLObject var7, final SubLObject var405) {
        if (NIL != var405) {
            f47783(var7, var405, (SubLObject)UNPROVIDED);
        }
        return var7;
    }
    
    public static SubLObject f47786(final SubLObject var7, final SubLObject var405) {
        return f47787(var7, (SubLObject)ConsesLow.list(var405), (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f47787(final SubLObject var7, final SubLObject var45, SubLObject var206) {
        if (var206 == UNPROVIDED) {
            var206 = (SubLObject)T;
        }
        if (NIL != var206 && NIL != f47546(var7)) {
            SubLObject var207 = (SubLObject)ZERO_INTEGER;
            if (module0743.f45996(var7).isVector()) {
                final SubLObject var208 = module0743.f45996(var7);
                final SubLObject var209 = (SubLObject)NIL;
                SubLObject var210;
                SubLObject var211;
                SubLObject var212;
                SubLObject var213;
                for (var210 = Sequences.length(var208), var211 = (SubLObject)NIL, var211 = (SubLObject)ZERO_INTEGER; var211.numL(var210); var211 = Numbers.add(var211, (SubLObject)ONE_INTEGER)) {
                    var212 = ((NIL != var209) ? Numbers.subtract(var210, var211, (SubLObject)ONE_INTEGER) : var211);
                    var213 = Vectors.aref(var208, var212);
                    f47787(var213, var45, (SubLObject)T);
                    var207 = Numbers.add(var207, (SubLObject)ONE_INTEGER);
                }
            }
        }
        else {
            f47788(var45, f47482(var7));
        }
        return var7;
    }
    
    public static SubLObject f47788(final SubLObject var45, final SubLObject var420) {
        final SubLObject var421 = module0749.f46375(var420);
        final SubLObject var422 = f47789(var45, var421);
        module0749.f46386(var420, var422);
        return var420;
    }
    
    public static SubLObject f47789(final SubLObject var45, final SubLObject var429) {
        if (NIL != module0751.f47169(var429)) {
            return f47790(var45);
        }
        if ($ic230$ == var45) {
            return var429;
        }
        final SubLObject var431;
        final SubLObject var430 = var431 = module0751.f47170(var429);
        if (var431.eql((SubLObject)$ic263$)) {
            return var429;
        }
        if (var431.eql((SubLObject)$ic262$)) {
            return f47791(var429, var45);
        }
        if (var431.eql((SubLObject)$ic261$)) {
            return f47792(var429, var45);
        }
        if (var431.eql((SubLObject)$ic270$)) {
            return f47793(var429, var45);
        }
        if (var431.eql((SubLObject)$ic271$)) {
            return f47794(var429, var45);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f47793(final SubLObject var427, final SubLObject var45) {
        return f47795(var427, var45);
    }
    
    public static SubLObject f47794(final SubLObject var427, final SubLObject var45) {
        return f47795(var427, var45);
    }
    
    public static SubLObject f47795(final SubLObject var427, final SubLObject var45) {
        final SubLObject var428 = module0751.f47173(var427);
        if (NIL != module0751.f47087(var428)) {
            return module0751.f46991(module0751.f47170(var427), module0751.f47098(var428, var45));
        }
        final SubLObject var429 = Sequences.cconcatenate((SubLObject)$ic48$, new SubLObject[] { module0006.f205((SubLObject)ONE_INTEGER), $ic49$, module0006.f203((SubLObject)$ic272$) });
        module0578.f35476(var429, (SubLObject)ConsesLow.list(var45, var427));
        return var427;
    }
    
    public static SubLObject f47791(final SubLObject var427, final SubLObject var45) {
        return module0751.f46991(module0751.f47170(var427), ConsesLow.append(module0751.f47173(var427), var45));
    }
    
    public static SubLObject f47792(final SubLObject var427, final SubLObject var45) {
        final SubLObject var428 = module0751.f47099((SubLObject)ConsesLow.list(module0751.f47173(var427)), var45, (SubLObject)UNPROVIDED);
        if (NIL != module0035.f1997(var428)) {
            return module0751.f46991((SubLObject)$ic261$, var428.first());
        }
        return module0751.f46991((SubLObject)$ic262$, var428);
    }
    
    public static SubLObject f47796(final SubLObject var7, final SubLObject var432) {
        final SubLObject var433 = f47482(var7);
        final SubLObject var434 = module0749.f46375(var433);
        if (NIL != module0751.f47087(module0751.f47173(var434))) {
            module0751.f47097(module0751.f47173(var434), var432);
        }
        else {
            f47784(var7, var432, (SubLObject)UNPROVIDED);
        }
        return var7;
    }
    
    public static SubLObject f47797(final SubLObject var7, final SubLObject var432, SubLObject var206) {
        if (var206 == UNPROVIDED) {
            var206 = (SubLObject)T;
        }
        if (var432.isList()) {
            if (NIL != f47519(var7)) {
                SubLObject var433 = f47577(var7);
                SubLObject var434 = (SubLObject)NIL;
                var434 = var433.first();
                while (NIL != var433) {
                    f47797(var434, var432, var206);
                    var433 = var433.rest();
                    var434 = var433.first();
                }
            }
            else {
                final SubLObject var435 = f47488(var7, (SubLObject)UNPROVIDED);
                final SubLObject var436 = module0751.f47099(var432, var435, (SubLObject)UNPROVIDED);
                f47784(var7, var436, var206);
                if (!var435.equal(var436) && NIL != module0578.f35470((SubLObject)ONE_INTEGER)) {
                    PrintLow.format((SubLObject)T, (SubLObject)$ic273$, var435, f47488(var7, (SubLObject)UNPROVIDED));
                }
            }
        }
        return var7;
    }
    
    public static SubLObject f47784(final SubLObject var7, final SubLObject var432, SubLObject var206) {
        if (var206 == UNPROVIDED) {
            var206 = (SubLObject)T;
        }
        f47534(var7, f47790(var432), var206);
        final SubLObject var433 = f47467(var7);
        if (NIL != module0035.f1997(var433) && NIL != module0035.f1997(var432)) {
            module0749.f46472(var433.first(), var432.first());
        }
        return var433;
    }
    
    public static SubLObject f47798(final SubLObject var7, final SubLObject var57) {
        final SubLObject var58 = f47482(var7);
        final SubLObject var59 = module0749.f46376(var58);
        final SubLObject var60 = module0751.f47170(var59);
        if (NIL != module0751.f47165(var59)) {
            f47534(var7, module0751.f46991(var60, var57), (SubLObject)UNPROVIDED);
        }
        return var7;
    }
    
    public static SubLObject f47790(final SubLObject var432) {
        if (var432 == $ic230$) {
            return module0751.f47163();
        }
        if (!var432.isList()) {
            final SubLObject var433 = Sequences.cconcatenate((SubLObject)$ic48$, new SubLObject[] { module0006.f205((SubLObject)ONE_INTEGER), $ic49$, module0006.f203((SubLObject)$ic274$) });
            module0578.f35476(var433, (SubLObject)ConsesLow.list(var432));
            return (SubLObject)NIL;
        }
        if (NIL != module0035.f1997(var432)) {
            return module0751.f46991((SubLObject)$ic261$, var432.first());
        }
        if (NIL == var432) {
            return module0751.f47164();
        }
        if (var432.isList()) {
            return module0751.f46991((SubLObject)$ic262$, var432);
        }
        return module0751.f47163();
    }
    
    public static SubLObject f47799(final SubLObject var7, SubLObject var436) {
        if (var436 == UNPROVIDED) {
            var436 = (SubLObject)T;
        }
        if (NIL != f47800(var7, var436) && NIL != module0578.f35470((SubLObject)ONE_INTEGER) && NIL == module0578.f35477()) {
            Errors.warn((SubLObject)$ic275$, var7);
        }
        return var7;
    }
    
    public static SubLObject f47800(final SubLObject var7, SubLObject var436) {
        if (var436 == UNPROVIDED) {
            var436 = (SubLObject)T;
        }
        if (NIL != f47479(var7)) {
            return (SubLObject)NIL;
        }
        if (NIL != f47523(var7)) {
            return (SubLObject)NIL;
        }
        if (NIL != module0751.f47171(f47801(var7, (SubLObject)$ic276$))) {
            if (NIL != module0578.f35470((SubLObject)ONE_INTEGER) && NIL == module0578.f35477()) {
                Errors.warn((SubLObject)$ic277$, var7);
            }
            return (SubLObject)T;
        }
        if (NIL != f47520(var7)) {
            return (SubLObject)NIL;
        }
        if (NIL != f47606(var7, (SubLObject)UNPROVIDED)) {
            return (SubLObject)NIL;
        }
        if (NIL != f47478(var7)) {
            if (NIL != var436) {
                if (NIL == f47547(var7)) {
                    if (NIL == f47552(var7)) {
                        if (NIL != f47519(var7)) {
                            SubLObject var437 = (SubLObject)NIL;
                            SubLObject var438 = (SubLObject)ZERO_INTEGER;
                            if (module0743.f45996(var7).isVector()) {
                                final SubLObject var439 = module0743.f45996(var7);
                                final SubLObject var440 = (SubLObject)NIL;
                                SubLObject var441;
                                SubLObject var442;
                                SubLObject var443;
                                SubLObject var444;
                                for (var441 = Sequences.length(var439), var442 = (SubLObject)NIL, var442 = (SubLObject)ZERO_INTEGER; var442.numL(var441); var442 = Numbers.add(var442, (SubLObject)ONE_INTEGER)) {
                                    var443 = ((NIL != var440) ? Numbers.subtract(var441, var442, (SubLObject)ONE_INTEGER) : var442);
                                    var444 = Vectors.aref(var439, var443);
                                    if (NIL == var437 && NIL == f47800(var444, var436)) {
                                        var437 = var444;
                                    }
                                    var438 = Numbers.add(var438, (SubLObject)ONE_INTEGER);
                                }
                            }
                            return (SubLObject)makeBoolean(NIL == var437);
                        }
                        SubLObject var445 = (SubLObject)ZERO_INTEGER;
                        if (module0743.f45996(var7).isVector()) {
                            final SubLObject var446 = module0743.f45996(var7);
                            final SubLObject var447 = (SubLObject)NIL;
                            SubLObject var448;
                            SubLObject var449;
                            SubLObject var450;
                            SubLObject var451;
                            for (var448 = Sequences.length(var446), var449 = (SubLObject)NIL, var449 = (SubLObject)ZERO_INTEGER; var449.numL(var448); var449 = Numbers.add(var449, (SubLObject)ONE_INTEGER)) {
                                var450 = ((NIL != var447) ? Numbers.subtract(var448, var449, (SubLObject)ONE_INTEGER) : var449);
                                var451 = Vectors.aref(var446, var450);
                                if (NIL != f47800(var451, (SubLObject)UNPROVIDED)) {
                                    return (SubLObject)T;
                                }
                                var445 = Numbers.add(var445, (SubLObject)ONE_INTEGER);
                            }
                        }
                    }
                }
            }
            return (SubLObject)NIL;
        }
        return (SubLObject)T;
    }
    
    public static SubLObject f47802(final SubLObject var7) {
        final SubLObject var8 = f47488(var7, (SubLObject)UNPROVIDED);
        return f47790(var8);
    }
    
    public static SubLObject f47803(final SubLObject var7) {
        final SubLObject var8 = f47802(var7);
        final SubLObject var9 = (SubLObject)NIL;
        f47534(var7, var8, var9);
        return f47779(var7);
    }
    
    public static SubLObject f47780(final SubLObject var7, final SubLObject var435) {
        final SubLObject var436 = f47482(var7);
        if (NIL == module0749.f46374(var436)) {
            return (SubLObject)NIL;
        }
        if (NIL != module0751.f47160(var435)) {
            return Equality.eq(var435, module0751.f47170(module0749.f46375(var436)));
        }
        return Equality.eq(var435, module0751.f47170(module0749.f46376(var436)));
    }
    
    public static SubLObject f47801(final SubLObject var7, final SubLObject var435) {
        final SubLObject var436 = module0749.f46398(module0743.f45994(var7));
        if (NIL != f47519(var7)) {
            SubLObject var437 = (SubLObject)NIL;
            SubLObject var438 = (SubLObject)NIL;
            SubLObject var439 = (SubLObject)ZERO_INTEGER;
            if (module0743.f45996(var7).isVector()) {
                final SubLObject var440 = module0743.f45996(var7);
                final SubLObject var441 = (SubLObject)NIL;
                SubLObject var442;
                SubLObject var443;
                SubLObject var444;
                SubLObject var445;
                for (var442 = Sequences.length(var440), var443 = (SubLObject)NIL, var443 = (SubLObject)ZERO_INTEGER; var443.numL(var442); var443 = Numbers.add(var443, (SubLObject)ONE_INTEGER)) {
                    var444 = ((NIL != var441) ? Numbers.subtract(var442, var443, (SubLObject)ONE_INTEGER) : var443);
                    var445 = Vectors.aref(var440, var444);
                    if (NIL == module0749.f46374(var438)) {
                        var438 = f47801(var445, var435);
                    }
                    else if (!var438.equal(f47801(var445, var435))) {
                        var437 = (SubLObject)T;
                    }
                    var439 = Numbers.add(var439, (SubLObject)ONE_INTEGER);
                }
            }
            return (SubLObject)((NIL != var437) ? NIL : var438);
        }
        if (NIL != module0749.f46374(var436)) {
            final SubLObject var446 = (NIL != module0751.f47160(var435)) ? module0749.f46375(var436) : module0749.f46376(var436);
            return (SubLObject)((NIL != module0751.f47165(var446) && module0751.f47170(var446).eql(var435)) ? var446 : NIL);
        }
        if (NIL != module0751.f47159(var435) && NIL != f47737(var7)) {
            final SubLObject var447 = f47801(f47648(var7), var435);
            return var447;
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f47781(final SubLObject var7, final SubLObject var435) {
        if (NIL != f47519(var7)) {
            SubLObject var436 = (SubLObject)NIL;
            SubLObject var437 = (SubLObject)NIL;
            SubLObject var438 = (SubLObject)ZERO_INTEGER;
            if (module0743.f45996(var7).isVector()) {
                final SubLObject var439 = module0743.f45996(var7);
                final SubLObject var440 = (SubLObject)NIL;
                SubLObject var441;
                SubLObject var442;
                SubLObject var443;
                SubLObject var444;
                for (var441 = Sequences.length(var439), var442 = (SubLObject)NIL, var442 = (SubLObject)ZERO_INTEGER; var442.numL(var441); var442 = Numbers.add(var442, (SubLObject)ONE_INTEGER)) {
                    var443 = ((NIL != var440) ? Numbers.subtract(var441, var442, (SubLObject)ONE_INTEGER) : var442);
                    var444 = Vectors.aref(var439, var443);
                    if (NIL == var437) {
                        var437 = f47781(var444, var435);
                    }
                    else if (!var437.equal(f47781(var444, var435))) {
                        var436 = (SubLObject)T;
                    }
                    var438 = Numbers.add(var438, (SubLObject)ONE_INTEGER);
                }
            }
            return (SubLObject)((NIL != var436) ? NIL : var437);
        }
        final SubLObject var445 = f47801(var7, var435);
        return (SubLObject)((NIL != module0751.f47165(var445)) ? module0751.f47173(var445) : NIL);
    }
    
    public static SubLObject f47691(final SubLObject var7) {
        final SubLObject var8 = f47801(var7, (SubLObject)$ic261$);
        SubLObject var9 = (SubLObject)((NIL != module0751.f47165(var8)) ? module0751.f47173(var8) : NIL);
        if (NIL == var9 && NIL != f47737(var7)) {
            var9 = f47691(f47648(var7));
        }
        return var9;
    }
    
    public static SubLObject f47804(final SubLObject var7) {
        final SubLObject var8 = f47481(var7, (SubLObject)UNPROVIDED);
        return (SubLObject)makeBoolean(NIL == var8 || $ic230$ == var8);
    }
    
    public static SubLObject f47488(final SubLObject var7, SubLObject var446) {
        if (var446 == UNPROVIDED) {
            var446 = module0579.$g4289$.getDynamicValue();
        }
        if (NIL != f47519(var7)) {
            return f47805(var7);
        }
        final SubLObject var447 = f47806(var7);
        final SubLObject var448 = f47481(var7, (SubLObject)UNPROVIDED);
        final SubLObject var449 = (SubLObject)makeBoolean(NIL != var446 && (NIL != f47804(var7) || (ZERO_INTEGER.eql(module0732.f44966(var448, (SubLObject)UNPROVIDED)) && NIL == module0731.f44712(var448, (SubLObject)UNPROVIDED))));
        final SubLObject var450 = (SubLObject)((NIL != var449) ? $ic230$ : f47807(var7));
        final SubLObject var451 = f47808(var7);
        final SubLObject var452 = module0751.f47099(var447, var451, (SubLObject)UNPROVIDED);
        final SubLObject var453 = module0751.f47099(var452, var450, (SubLObject)UNPROVIDED);
        if (var452.isList() && !var453.equal(var452) && NIL != module0578.f35470((SubLObject)ONE_INTEGER)) {
            PrintLow.format((SubLObject)T, (SubLObject)$ic278$, new SubLObject[] { conses_high.set_difference(var452, var453, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED), var452, f47481(var7, (SubLObject)UNPROVIDED), var453 });
        }
        if (NIL == var453 && NIL != module0578.f35470((SubLObject)ONE_INTEGER) && NIL == module0578.f35477()) {
            Errors.warn((SubLObject)$ic279$, new SubLObject[] { var447, var451, var450, var7 });
        }
        return var453;
    }
    
    public static SubLObject f47806(final SubLObject var7) {
        final SubLObject var8 = f47482(var7);
        final SubLObject var9 = module0749.f46375(var8);
        final SubLObject var10 = module0749.f46376(var8);
        SubLObject var11 = (SubLObject)$ic230$;
        SubLObject var12 = (SubLObject)$ic230$;
        if (NIL != module0751.f47165(var9)) {
            final SubLObject var13 = module0751.f47170(var9);
            if (var13.eql((SubLObject)$ic261$)) {
                var11 = module0751.f47173(var9);
                if (NIL != var11 && !var11.isList()) {
                    var11 = (SubLObject)ConsesLow.list(var11);
                }
            }
            else if (var13.eql((SubLObject)$ic262$)) {
                var11 = module0751.f47173(var9);
            }
        }
        if (NIL != module0751.f47165(var10) && $ic280$ == module0751.f47170(var10)) {
            final SubLObject var14 = module0751.f47173(var10);
            if (NIL != f47497(var14, (SubLObject)UNPROVIDED)) {
                var12 = module0751.f47024(f47488(var14, (SubLObject)UNPROVIDED), (SubLObject)UNPROVIDED);
            }
        }
        return module0751.f47099(var11, var12, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f47809(final SubLObject var7, final SubLObject var455) {
        return module0035.sublisp_boolean(module0751.f47099(f47488(var7, (SubLObject)UNPROVIDED), var455, (SubLObject)UNPROVIDED));
    }
    
    public static SubLObject f47807(final SubLObject var7) {
        SubLObject var8 = (SubLObject)$ic230$;
        final SubLObject var9 = f47481(var7, (SubLObject)UNPROVIDED);
        final SubLObject var10 = f47480(var7, (SubLObject)NIL);
        var8 = (SubLObject)((NIL != module0751.f47119(var9) && NIL == module0206.f13497(f47487(var7, (SubLObject)UNPROVIDED)) && NIL == module0206.f13453(f47487(var7, (SubLObject)UNPROVIDED)) && NIL == f47478(var7)) ? $ic281$ : f47810(var9, var10));
        return var8;
    }
    
    public static SubLObject f47810(final SubLObject var44, final SubLObject var456) {
        final SubLThread var457 = SubLProcess.currentSubLThread();
        SubLObject var458 = (SubLObject)$ic230$;
        if (NIL != var44) {
            if (NIL != module0731.f44713(module0751.f47113(var44, (SubLObject)UNPROVIDED), $ic249$, (SubLObject)UNPROVIDED)) {
                final SubLObject var459 = module0147.f9540(module0579.$g4260$.getDynamicValue(var457));
                final SubLObject var460 = module0147.$g2095$.currentBinding(var457);
                final SubLObject var461 = module0147.$g2094$.currentBinding(var457);
                final SubLObject var462 = module0147.$g2096$.currentBinding(var457);
                try {
                    module0147.$g2095$.bind(module0147.f9545(var459), var457);
                    module0147.$g2094$.bind(module0147.f9546(var459), var457);
                    module0147.$g2096$.bind(module0147.f9549(var459), var457);
                    final SubLObject var463 = module0580.f35545();
                    final SubLObject var6_458 = module0034.$g879$.currentBinding(var457);
                    try {
                        module0034.$g879$.bind(var463, var457);
                        SubLObject var464 = (SubLObject)NIL;
                        if (NIL != var463 && NIL == module0034.f1842(var463)) {
                            var464 = module0034.f1869(var463);
                            final SubLObject var465 = Threads.current_process();
                            if (NIL == var464) {
                                module0034.f1873(var463, var465);
                            }
                            else if (!var464.eql(var465)) {
                                Errors.error((SubLObject)$ic282$);
                            }
                        }
                        try {
                            final SubLObject var466 = var458 = (SubLObject)(var456.isString() ? module0731.f44868(var456) : $ic283$);
                        }
                        finally {
                            final SubLObject var6_459 = Threads.$is_thread_performing_cleanupP$.currentBinding(var457);
                            try {
                                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)T, var457);
                                if (NIL != var463 && NIL == var464) {
                                    module0034.f1873(var463, (SubLObject)NIL);
                                }
                            }
                            finally {
                                Threads.$is_thread_performing_cleanupP$.rebind(var6_459, var457);
                            }
                        }
                    }
                    finally {
                        module0034.$g879$.rebind(var6_458, var457);
                    }
                }
                finally {
                    module0147.$g2096$.rebind(var462, var457);
                    module0147.$g2094$.rebind(var461, var457);
                    module0147.$g2095$.rebind(var460, var457);
                }
            }
            else {
                var458 = f47811(var44, (SubLObject)UNPROVIDED);
            }
        }
        return var458;
    }
    
    public static SubLObject f47812() {
        final SubLObject var463 = $g6083$.getGlobalValue();
        if (NIL != var463) {
            module0034.f1818(var463);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f47813(final SubLObject var44, SubLObject var464) {
        if (var464 == UNPROVIDED) {
            var464 = module0579.$g4260$.getDynamicValue();
        }
        return module0034.f1829($g6083$.getGlobalValue(), (SubLObject)ConsesLow.list(var44, var464), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f47814(final SubLObject var44, final SubLObject var464) {
        final SubLThread var465 = SubLProcess.currentSubLThread();
        SubLObject var466 = (SubLObject)$ic230$;
        final SubLObject var467 = module0579.$g4260$.currentBinding(var465);
        try {
            module0579.$g4260$.bind(var464, var465);
            if (NIL != module0731.f44656(var44, (SubLObject)UNPROVIDED)) {
                final SubLObject var468 = module0731.f44659(var44);
                final SubLObject var469 = module0035.f2220(module0731.f44659(var44), var468, (SubLObject)UNPROVIDED);
                final SubLObject var470 = ConsesLow.append(var468, var469);
                if (NIL != var470) {
                    var466 = var470;
                }
            }
            else if ($ic162$.eql(var44) || NIL != module0751.f47119(var44)) {
                var466 = (SubLObject)ConsesLow.cons($ic285$, module0731.f44659($ic231$));
            }
            else if (NIL != module0212.f13762(var44)) {
                final SubLObject var471 = module0751.f47113(var44, (SubLObject)UNPROVIDED);
                if (NIL != var471) {
                    var466 = module0731.f44659(var471);
                }
            }
        }
        finally {
            module0579.$g4260$.rebind(var467, var465);
        }
        return var466;
    }
    
    public static SubLObject f47811(final SubLObject var44, SubLObject var464) {
        if (var464 == UNPROVIDED) {
            var464 = module0579.$g4260$.getDynamicValue();
        }
        SubLObject var465 = $g6083$.getGlobalValue();
        if (NIL == var465) {
            var465 = module0034.f1934((SubLObject)$ic284$, (SubLObject)$ic286$, (SubLObject)NIL, (SubLObject)EQUAL, (SubLObject)TWO_INTEGER, (SubLObject)ZERO_INTEGER);
            module0034.f1940((SubLObject)$ic287$);
        }
        final SubLObject var466 = module0034.f1782(var44, var464);
        final SubLObject var467 = module0034.f1814(var465, var466, (SubLObject)UNPROVIDED);
        if (var467 != $ic28$) {
            SubLObject var468 = var467;
            SubLObject var469 = (SubLObject)NIL;
            var469 = var468.first();
            while (NIL != var468) {
                SubLObject var470 = var469.first();
                final SubLObject var471 = conses_high.second(var469);
                if (var44.equal(var470.first())) {
                    var470 = var470.rest();
                    if (NIL != var470 && NIL == var470.rest() && var464.equal(var470.first())) {
                        return module0034.f1959(var471);
                    }
                }
                var468 = var468.rest();
                var469 = var468.first();
            }
        }
        final SubLObject var472 = Values.arg2(Values.resetMultipleValues(), (SubLObject)Values.multiple_value_list(f47814(var44, var464)));
        module0034.f1836(var465, var466, var467, var472, (SubLObject)ConsesLow.list(var44, var464));
        return module0034.f1959(var472);
    }
    
    public static SubLObject f47808(final SubLObject var7) {
        SubLObject var8 = (SubLObject)$ic230$;
        if (NIL != f47737(var7)) {
            var8 = f47488(f47648(var7), (SubLObject)UNPROVIDED);
        }
        return var8;
    }
    
    public static SubLObject f47805(final SubLObject var7) {
        SubLObject var8 = (SubLObject)NIL;
        SubLObject var9 = (SubLObject)ZERO_INTEGER;
        if (module0743.f45996(var7).isVector()) {
            final SubLObject var10 = module0743.f45996(var7);
            final SubLObject var11 = (SubLObject)NIL;
            SubLObject var12;
            SubLObject var13;
            SubLObject var14;
            SubLObject var15;
            for (var12 = Sequences.length(var10), var13 = (SubLObject)NIL, var13 = (SubLObject)ZERO_INTEGER; var13.numL(var12); var13 = Numbers.add(var13, (SubLObject)ONE_INTEGER)) {
                var14 = ((NIL != var11) ? Numbers.subtract(var12, var13, (SubLObject)ONE_INTEGER) : var13);
                var15 = Vectors.aref(var10, var14);
                var8 = module0751.f47136(var8, f47488(var15, (SubLObject)UNPROVIDED));
                var9 = Numbers.add(var9, (SubLObject)ONE_INTEGER);
            }
        }
        return var8;
    }
    
    public static SubLObject f47815(final SubLObject var7) {
        return f47488(var7, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f47606(final SubLObject var7, SubLObject var206) {
        if (var206 == UNPROVIDED) {
            var206 = (SubLObject)T;
        }
        if (NIL != var206 && NIL != f47546(var7)) {
            return f47606(f47590(var7, (SubLObject)ZERO_INTEGER), (SubLObject)UNPROVIDED);
        }
        return module0749.f46420(var7, (SubLObject)$ic151$, (SubLObject)FOUR_INTEGER, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f47625(final SubLObject var7, final SubLObject var211) {
        return module0749.f46426(var7, (SubLObject)$ic151$, (SubLObject)FOUR_INTEGER, var211);
    }
    
    public static SubLObject f47816(final SubLObject var7) {
        return (SubLObject)makeBoolean(NIL != f47606(var7, (SubLObject)UNPROVIDED) && NIL == f47480(var7, (SubLObject)UNPROVIDED) && NIL == f47487(var7, (SubLObject)UNPROVIDED));
    }
    
    public static SubLObject f47511(final SubLObject var7) {
        return module0749.f46401(module0743.f45994(var7));
    }
    
    public static SubLObject f47817(final SubLObject var7) {
        return module0751.f47211(f47511(var7));
    }
    
    public static SubLObject f47464(final SubLObject var7, final SubLObject var2) {
        module0749.f46407(module0743.f45994(var7), var2);
        return var7;
    }
    
    public static SubLObject f47818(final SubLObject var7, final SubLObject var473) {
        final SubLObject var474 = f47487(var7, (SubLObject)UNPROVIDED);
        final SubLObject var475 = module0751.f46693(var473, var474);
        f47464(var7, var475);
        return var475;
    }
    
    public static SubLObject f47516(final SubLObject var7) {
        return module0743.f45996(var7);
    }
    
    public static SubLObject f47588(final SubLObject var7) {
        return module0743.f46013(var7);
    }
    
    public static SubLObject f47819(final SubLObject var7) {
        SubLObject var8 = (SubLObject)ZERO_INTEGER;
        SubLObject var9 = (SubLObject)ZERO_INTEGER;
        if (module0743.f45996(var7).isVector()) {
            final SubLObject var10 = module0743.f45996(var7);
            final SubLObject var11 = (SubLObject)NIL;
            SubLObject var12;
            SubLObject var13;
            SubLObject var14;
            SubLObject var15;
            for (var12 = Sequences.length(var10), var13 = (SubLObject)NIL, var13 = (SubLObject)ZERO_INTEGER; var13.numL(var12); var13 = Numbers.add(var13, (SubLObject)ONE_INTEGER)) {
                var14 = ((NIL != var11) ? Numbers.subtract(var12, var13, (SubLObject)ONE_INTEGER) : var13);
                var15 = Vectors.aref(var10, var14);
                if (NIL == f47479(var15)) {
                    if (NIL != module0578.f35470((SubLObject)TWO_INTEGER)) {
                        PrintLow.format((SubLObject)T, (SubLObject)$ic288$, f47475(var15));
                    }
                    var8 = Numbers.add(var8, (SubLObject)ONE_INTEGER);
                }
                var9 = Numbers.add(var9, (SubLObject)ONE_INTEGER);
            }
        }
        return var8;
    }
    
    public static SubLObject f47478(final SubLObject var7) {
        return (SubLObject)makeBoolean(f47516(var7).isVector() && f47588(var7).isPositive());
    }
    
    public static SubLObject f47820(final SubLObject var7, final SubLObject var143) {
        if (NIL == f47497(var7, (SubLObject)NIL)) {
            final SubLObject var144 = Sequences.cconcatenate((SubLObject)$ic48$, new SubLObject[] { module0006.f205((SubLObject)ONE_INTEGER), $ic49$, module0006.f203((SubLObject)$ic289$) });
            module0578.f35476(var144, (SubLObject)ConsesLow.list(var7));
        }
        if (NIL != var143) {}
        module0743.f46003(var7, var143);
        final SubLObject var145 = (SubLObject)NIL;
        final SubLObject var146 = (SubLObject)makeBoolean(NIL != var145 && NIL != f47496(var7));
        SubLObject var147 = (SubLObject)ZERO_INTEGER;
        if (module0743.f45996(var7).isVector()) {
            final SubLObject var148 = module0743.f45996(var7);
            final SubLObject var149 = (SubLObject)NIL;
            SubLObject var150;
            SubLObject var151;
            SubLObject var152;
            SubLObject var153;
            SubLObject var154;
            for (var150 = Sequences.length(var148), var151 = (SubLObject)NIL, var151 = (SubLObject)ZERO_INTEGER; var151.numL(var150); var151 = Numbers.add(var151, (SubLObject)ONE_INTEGER)) {
                var152 = ((NIL != var149) ? Numbers.subtract(var150, var151, (SubLObject)ONE_INTEGER) : var151);
                var153 = Vectors.aref(var148, var152);
                if (NIL != var146 && NIL == f47496(var153)) {
                    var154 = Sequences.cconcatenate((SubLObject)$ic48$, new SubLObject[] { module0006.f205((SubLObject)ONE_INTEGER), $ic49$, module0006.f203((SubLObject)$ic290$) });
                    module0578.f35476(var154, (SubLObject)ConsesLow.list(var7, var153));
                }
                f47623(var153, var7);
                var147 = Numbers.add(var147, (SubLObject)ONE_INTEGER);
            }
        }
        return var7;
    }
    
    public static SubLObject f47543(final SubLObject var7, final SubLObject var14) {
        final SubLObject var15 = Vectors.make_vector((SubLObject)ONE_INTEGER, (SubLObject)UNPROVIDED);
        Vectors.set_aref(var15, (SubLObject)ZERO_INTEGER, var14);
        f47820(var7, var15);
        return var7;
    }
    
    public static SubLObject f47821(final SubLObject var7, final SubLObject var14) {
        if (NIL != f47478(var7)) {
            final SubLObject var15 = Sequences.cconcatenate((SubLObject)$ic48$, new SubLObject[] { module0006.f205((SubLObject)ONE_INTEGER), $ic49$, module0006.f203((SubLObject)$ic291$) });
            module0578.f35476(var15, (SubLObject)ConsesLow.list(var7));
        }
        f47623(var14, var7);
        f47543(var7, var14);
        return var7;
    }
    
    public static SubLObject f47589(final SubLObject var7) {
        if (NIL == f47478(var7)) {
            return (SubLObject)NIL;
        }
        return f47590(var7, Numbers.subtract(f47588(var7), (SubLObject)ONE_INTEGER));
    }
    
    public static SubLObject f47822(final SubLObject var7) {
        return Numbers.numGE(f47823(var7, (SubLObject)TWO_INTEGER), (SubLObject)TWO_INTEGER);
    }
    
    public static SubLObject f47823(final SubLObject var7, SubLObject var479) {
        if (var479 == UNPROVIDED) {
            var479 = (SubLObject)NIL;
        }
        return f47824(var7, (SubLObject)$ic292$, var479);
    }
    
    public static SubLObject f47824(final SubLObject var7, final SubLObject var133, SubLObject var479) {
        if (var479 == UNPROVIDED) {
            var479 = (SubLObject)NIL;
        }
        if (NIL != var479 && !areAssertionsDisabledFor(me) && NIL == module0004.f105(var479)) {
            throw new AssertionError(var479);
        }
        return f47825(var7, var133, var479);
    }
    
    public static SubLObject f47825(final SubLObject var7, final SubLObject var133, final SubLObject var479) {
        SubLObject var480 = (SubLObject)((NIL != Functions.funcall(var133, var7)) ? ONE_INTEGER : ZERO_INTEGER);
        if (NIL != f47478(var7)) {
            SubLObject var481 = (SubLObject)((NIL != var479) ? Numbers.subtract(var479, var480) : NIL);
            if (NIL != var481 && var481.numLE((SubLObject)ZERO_INTEGER)) {
                return var480;
            }
            SubLObject var482 = (SubLObject)ZERO_INTEGER;
            if (module0743.f45996(var7).isVector()) {
                final SubLObject var483 = module0743.f45996(var7);
                final SubLObject var484 = (SubLObject)NIL;
                SubLObject var485;
                SubLObject var486;
                SubLObject var487;
                SubLObject var488;
                SubLObject var489;
                for (var485 = Sequences.length(var483), var486 = (SubLObject)NIL, var486 = (SubLObject)ZERO_INTEGER; var486.numL(var485); var486 = Numbers.add(var486, (SubLObject)ONE_INTEGER)) {
                    var487 = ((NIL != var484) ? Numbers.subtract(var485, var486, (SubLObject)ONE_INTEGER) : var486);
                    var488 = Vectors.aref(var483, var487);
                    var489 = f47825(var488, var133, var481);
                    var480 = Numbers.add(var480, var489);
                    if (NIL != var481) {
                        var481 = Numbers.subtract(var481, var489);
                        if (var481.numLE((SubLObject)ZERO_INTEGER)) {
                            return var480;
                        }
                    }
                    var482 = Numbers.add(var482, (SubLObject)ONE_INTEGER);
                }
            }
        }
        return var480;
    }
    
    public static SubLObject f47826(final SubLObject var7, final SubLObject var481, SubLObject var482) {
        if (var482 == UNPROVIDED) {
            var482 = (SubLObject)NIL;
        }
        SubLObject var483 = (SubLObject)ZERO_INTEGER;
        if (module0743.f45996(var7).isVector()) {
            final SubLObject var484 = module0743.f45996(var7);
            final SubLObject var485 = (SubLObject)NIL;
            SubLObject var486;
            SubLObject var487;
            SubLObject var488;
            SubLObject var489;
            SubLObject var490;
            for (var486 = Sequences.length(var484), var487 = (SubLObject)NIL, var487 = (SubLObject)ZERO_INTEGER; var487.numL(var486); var487 = Numbers.add(var487, (SubLObject)ONE_INTEGER)) {
                var488 = ((NIL != var485) ? Numbers.subtract(var486, var487, (SubLObject)ONE_INTEGER) : var487);
                var489 = Vectors.aref(var484, var488);
                if (var489.eql(var481)) {
                    return module0035.f2083(var483, var482);
                }
                if (NIL != f47478(var489)) {
                    var490 = f47826(var489, var481, module0035.f2083(var483, var482));
                    if (NIL != var490) {
                        return var490;
                    }
                }
                var483 = Numbers.add(var483, (SubLObject)ONE_INTEGER);
            }
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f47477(final SubLObject var7) {
        if (NIL != module0035.f1995(f47516(var7), (SubLObject)ONE_INTEGER, (SubLObject)UNPROVIDED)) {
            return (SubLObject)ZERO_INTEGER;
        }
        return module0749.f46420(var7, (SubLObject)$ic152$, (SubLObject)FIVE_INTEGER, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f47737(final SubLObject var7) {
        return f47497(f47648(var7), (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f47827(final SubLObject var7, final SubLObject var15) {
        return Equality.eql(f47477(var7), var15);
    }
    
    public static SubLObject f47533(final SubLObject var7, final SubLObject var33) {
        module0749.f46426(var7, (SubLObject)$ic152$, (SubLObject)FIVE_INTEGER, var33);
        return var7;
    }
    
    public static SubLObject f47590(final SubLObject var7, final SubLObject var70) {
        if (module0743.f45996(var7).isVector() && NIL != module0035.f2002(module0743.f45996(var7), var70, (SubLObject)UNPROVIDED)) {
            return module0743.f46014(var7, var70);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f47648(final SubLObject var7) {
        final SubLObject var8 = f47477(var7);
        if (var8.isInteger()) {
            return f47590(var7, var8);
        }
        if (ONE_INTEGER.eql(f47588(var7))) {
            return f47590(var7, (SubLObject)ZERO_INTEGER);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f47828(final SubLObject var7, final SubLObject var468) {
        final SubLObject var469 = f47648(var7);
        if (NIL != var469) {
            return module0751.f46669(var468, f47481(var469, (SubLObject)UNPROVIDED), (SubLObject)UNPROVIDED);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f47587(final SubLObject var7, final SubLObject var468) {
        final SubLObject var469 = f47648(var7);
        if (NIL != var469) {
            return (SubLObject)makeBoolean(NIL == module0751.f46669(var468, f47481(var469, (SubLObject)UNPROVIDED), (SubLObject)UNPROVIDED));
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f47736(final SubLObject var7) {
        if (NIL != f47737(var7)) {
            return f47736(f47648(var7));
        }
        return var7;
    }
    
    public static SubLObject f47680(final SubLObject var484, SubLObject var485) {
        if (var485 == UNPROVIDED) {
            var485 = (SubLObject)NIL;
        }
        if (NIL == var485) {
            var485 = f47678(var484);
        }
        return (SubLObject)makeBoolean(NIL != f47497(var485, (SubLObject)UNPROVIDED) && NIL != f47829(var484, f47648(var485)));
    }
    
    public static SubLObject f47830(final SubLObject var7, final SubLObject var70, final SubLObject var486) {
        f47623(var486, var7);
        return module0743.f46015(var7, var70, var486);
    }
    
    public static SubLObject f47831(final SubLObject var7, final SubLObject var485, final SubLObject var487) {
        return Equality.eq(var7, f47590(var485, var487));
    }
    
    public static SubLObject f47651(final SubLObject var7) {
        if (NIL != f47780(var7, (SubLObject)$ic270$)) {
            return (SubLObject)T;
        }
        if (NIL != f47519(var7) || NIL != f47551(var7)) {
            SubLObject var8 = (SubLObject)NIL;
            SubLObject var9 = (SubLObject)ZERO_INTEGER;
            if (module0743.f45996(var7).isVector()) {
                final SubLObject var10 = module0743.f45996(var7);
                final SubLObject var11 = (SubLObject)NIL;
                SubLObject var12;
                SubLObject var13;
                SubLObject var14;
                SubLObject var15;
                for (var12 = Sequences.length(var10), var13 = (SubLObject)NIL, var13 = (SubLObject)ZERO_INTEGER; var13.numL(var12); var13 = Numbers.add(var13, (SubLObject)ONE_INTEGER)) {
                    var14 = ((NIL != var11) ? Numbers.subtract(var12, var13, (SubLObject)ONE_INTEGER) : var13);
                    var15 = Vectors.aref(var10, var14);
                    if (NIL == f47651(var15)) {
                        var8 = (SubLObject)T;
                    }
                    var9 = Numbers.add(var9, (SubLObject)ONE_INTEGER);
                }
            }
            return (SubLObject)makeBoolean(NIL == var8);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f47741(final SubLObject var7) {
        return (SubLObject)makeBoolean(NIL != module0758.f48024(var7) || NIL != module0758.f48025(var7));
    }
    
    public static SubLObject f47832(final SubLObject var7) {
        return (SubLObject)ConsesLow.list(f47480(var7, (SubLObject)UNPROVIDED), f47487(var7, (SubLObject)UNPROVIDED), f47510(var7));
    }
    
    public static SubLObject f47829(final SubLObject var488, final SubLObject var489) {
        return Equality.equal(var488, var489);
    }
    
    public static SubLObject f47833(final SubLObject var490) {
        final SubLObject var491 = module0749.f46494((SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        f47507(var491, var490, (SubLObject)UNPROVIDED);
        return var491;
    }
    
    public static SubLObject f47507(final SubLObject var7, final SubLObject var490, SubLObject var33) {
        if (var33 == UNPROVIDED) {
            var33 = (SubLObject)NIL;
        }
        final SubLObject var491 = Sequences.length(var490);
        final SubLObject var492 = Vectors.make_vector(var491, (SubLObject)UNPROVIDED);
        SubLObject var493 = (SubLObject)NIL;
        SubLObject var494 = (SubLObject)NIL;
        SubLObject var495 = (SubLObject)NIL;
        var493 = var490;
        var494 = var493.first();
        for (var495 = (SubLObject)ZERO_INTEGER; NIL != var493; var493 = var493.rest(), var494 = var493.first(), var495 = Numbers.add((SubLObject)ONE_INTEGER, var495)) {
            Vectors.set_aref(var492, var495, var494);
        }
        f47820(var7, var492);
        if (var33.isInteger()) {
            f47533(var7, var33);
        }
        return var7;
    }
    
    public static SubLObject f47491(final SubLObject var7) {
        if (NIL != f47478(var7)) {
            SubLObject var8 = (SubLObject)ZERO_INTEGER;
            if (module0743.f45996(var7).isVector()) {
                final SubLObject var9 = module0743.f45996(var7);
                final SubLObject var10 = (SubLObject)NIL;
                SubLObject var11;
                SubLObject var12;
                SubLObject var13;
                SubLObject var14;
                for (var11 = Sequences.length(var9), var12 = (SubLObject)NIL, var12 = (SubLObject)ZERO_INTEGER; var12.numL(var11); var12 = Numbers.add(var12, (SubLObject)ONE_INTEGER)) {
                    var13 = ((NIL != var10) ? Numbers.subtract(var11, var12, (SubLObject)ONE_INTEGER) : var12);
                    var14 = Vectors.aref(var9, var13);
                    f47623(var14, (SubLObject)NIL);
                    var8 = Numbers.add(var8, (SubLObject)ONE_INTEGER);
                }
            }
            f47820(var7, $ic294$);
        }
        return var7;
    }
    
    public static SubLObject f47834(final SubLObject var14, final SubLObject var7) {
        final SubLObject var15 = (SubLObject)((NIL != f47478(var7)) ? f47515(var7) : NIL);
        final SubLObject var16 = (SubLObject)ConsesLow.cons(var14, var15);
        f47507(var7, var16, (SubLObject)UNPROVIDED);
        f47835(var7);
        f47686(var7, var14);
        return var7;
    }
    
    public static SubLObject f47836(final SubLObject var14, final SubLObject var7) {
        final SubLObject var15 = (SubLObject)((NIL != f47478(var7)) ? f47515(var7) : NIL);
        final SubLObject var16 = ConsesLow.append(var15, (SubLObject)ConsesLow.list(var14));
        f47507(var7, var16, (SubLObject)UNPROVIDED);
        f47686(var7, var14);
        return var7;
    }
    
    public static SubLObject f47837(final SubLObject var7, final SubLObject var493, final SubLObject var487) {
        SubLObject var494 = (SubLObject)NIL;
        SubLObject var495 = (SubLObject)ZERO_INTEGER;
        if (module0743.f45996(var7).isVector()) {
            final SubLObject var496 = module0743.f45996(var7);
            final SubLObject var497 = (SubLObject)NIL;
            SubLObject var498;
            SubLObject var499;
            SubLObject var500;
            SubLObject var501;
            for (var498 = Sequences.length(var496), var499 = (SubLObject)NIL, var499 = (SubLObject)ZERO_INTEGER; var499.numL(var498); var499 = Numbers.add(var499, (SubLObject)ONE_INTEGER)) {
                var500 = ((NIL != var497) ? Numbers.subtract(var498, var499, (SubLObject)ONE_INTEGER) : var499);
                var501 = Vectors.aref(var496, var500);
                if (var487.eql(var495)) {
                    var494 = (SubLObject)ConsesLow.cons(var493, var494);
                }
                var494 = (SubLObject)ConsesLow.cons(var501, var494);
                var495 = Numbers.add(var495, (SubLObject)ONE_INTEGER);
            }
        }
        return f47507(var7, Sequences.reverse(var494), (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f47838(final SubLObject var7) {
        return f47839((SubLObject)ConsesLow.list(f47477(var7)), f47648(var7), var7);
    }
    
    public static SubLObject f47839(final SubLObject var494, final SubLObject var495, final SubLObject var7) {
        SubLObject var496 = var7;
        final SubLObject var497 = f47680(var495, var7);
        SubLObject var498 = conses_high.butlast(var494, (SubLObject)UNPROVIDED);
        SubLObject var499 = (SubLObject)NIL;
        var499 = var498.first();
        while (NIL != var498) {
            var496 = f47590(var496, var499);
            var498 = var498.rest();
            var499 = var498.first();
        }
        final SubLObject var500 = f47840(module0035.f2114(var494), var496);
        if (!var500.eql(var495)) {
            final SubLObject var501 = Sequences.cconcatenate((SubLObject)$ic48$, new SubLObject[] { module0006.f205((SubLObject)ONE_INTEGER), $ic49$, module0006.f203((SubLObject)$ic295$) });
            module0578.f35476(var501, (SubLObject)ConsesLow.list(var495, var500));
        }
        f47834(var495, var7);
        if (NIL != var497) {
            if (NIL != module0578.f35470((SubLObject)ONE_INTEGER)) {
                PrintLow.format((SubLObject)T, (SubLObject)$ic296$, var7);
            }
            f47533(var7, (SubLObject)ZERO_INTEGER);
        }
        return var7;
    }
    
    public static SubLObject f47841(final SubLObject var7, final SubLObject var499) {
        final SubLObject var500 = Sequences.remove(var499, f47515(var7), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        return f47507(var7, var500, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f47840(final SubLObject var501, final SubLObject var7) {
        final SubLObject var502 = f47590(var7, var501);
        final SubLObject var503 = Sequences.remove(var502, f47515(var7), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        f47507(var7, var503, (SubLObject)UNPROVIDED);
        if (NIL != module0578.f35470((SubLObject)ONE_INTEGER)) {
            PrintLow.format((SubLObject)T, (SubLObject)$ic297$, f47477(var7));
        }
        f47842(var7, var501);
        if (NIL != module0578.f35470((SubLObject)ONE_INTEGER)) {
            PrintLow.format((SubLObject)T, (SubLObject)$ic298$, f47477(var7));
        }
        return var502;
    }
    
    public static SubLObject f47842(final SubLObject var7, final SubLObject var502) {
        if (NIL != f47477(var7)) {
            if (var502.eql(f47477(var7))) {
                if (NIL != module0578.f35470((SubLObject)ONE_INTEGER) && NIL == module0578.f35477()) {
                    Errors.warn((SubLObject)$ic299$, var7);
                }
                f47533(var7, (SubLObject)NIL);
            }
            else if (f47477(var7).numG(var502)) {
                f47843(var7);
            }
        }
        return f47477(var7);
    }
    
    public static SubLObject f47843(final SubLObject var7) {
        final SubLObject var8 = f47477(var7);
        if (var8.isInteger()) {
            f47533(var7, module0048.f_1_(var8));
        }
        return var7;
    }
    
    public static SubLObject f47835(final SubLObject var7) {
        final SubLObject var8 = f47477(var7);
        if (var8.isInteger()) {
            f47533(var7, module0048.f_1X(var8));
        }
        return var7;
    }
    
    public static SubLObject f47844(final SubLObject var7, SubLObject var503) {
        if (var503 == UNPROVIDED) {
            var503 = (SubLObject)NIL;
        }
        final SubLObject var504 = f47588(var7);
        SubLObject var505 = (SubLObject)ZERO_INTEGER;
        if (module0743.f45996(var7).isVector()) {
            final SubLObject var506 = module0743.f45996(var7);
            final SubLObject var507 = (SubLObject)NIL;
            SubLObject var508;
            SubLObject var509;
            SubLObject var510;
            SubLObject var511;
            SubLObject var512;
            SubLObject var513;
            SubLObject var514;
            SubLObject var515;
            SubLObject var516;
            SubLObject var517;
            for (var508 = Sequences.length(var506), var509 = (SubLObject)NIL, var509 = (SubLObject)ZERO_INTEGER; var509.numL(var508); var509 = Numbers.add(var509, (SubLObject)ONE_INTEGER)) {
                var510 = ((NIL != var507) ? Numbers.subtract(var508, var509, (SubLObject)ONE_INTEGER) : var509);
                var511 = Vectors.aref(var506, var510);
                var512 = f47482(var511);
                var513 = module0751.f47173(var512);
                if (NIL != module0751.f47087(var513)) {
                    var514 = module0751.f47088(var513);
                    var515 = f47845(var514, var503);
                    if (!var514.eql(var515)) {
                        if (var505.eql(var515)) {
                            var516 = Sequences.cconcatenate((SubLObject)$ic48$, new SubLObject[] { module0006.f205((SubLObject)ONE_INTEGER), $ic49$, module0006.f203((SubLObject)$ic300$) });
                            module0578.f35476(var516, (SubLObject)ConsesLow.list(EMPTY_SUBL_OBJECT_ARRAY));
                        }
                        else if (var515.numGE(var504)) {
                            var516 = Sequences.cconcatenate((SubLObject)$ic48$, new SubLObject[] { module0006.f205((SubLObject)ONE_INTEGER), $ic49$, module0006.f203((SubLObject)$ic301$) });
                            module0578.f35476(var516, (SubLObject)ConsesLow.list(EMPTY_SUBL_OBJECT_ARRAY));
                        }
                        else {
                            var517 = f47846(var513, var515);
                            f47798(var511, var517);
                            if (NIL != module0578.f35470((SubLObject)ONE_INTEGER)) {
                                PrintLow.format((SubLObject)T, (SubLObject)$ic302$, new SubLObject[] { var505, var514, module0751.f47088(var513) });
                            }
                        }
                    }
                }
                var505 = Numbers.add(var505, (SubLObject)ONE_INTEGER);
            }
        }
        return var7;
    }
    
    public static SubLObject f47845(final SubLObject var505, final SubLObject var503) {
        if (var505.eql(var503)) {
            return (SubLObject)ZERO_INTEGER;
        }
        if (NIL == var503) {
            return module0048.f_1X(var505);
        }
        if (var503.numG(var505)) {
            return module0048.f_1X(var505);
        }
        return var505;
    }
    
    public static SubLObject f47846(final SubLObject var508, final SubLObject var509) {
        return module0751.f47095(var509, module0751.f47089(var508));
    }
    
    public static SubLObject f47847(final SubLObject var7) {
        final SubLObject var8 = module0205.f13136(f47487(var7, (SubLObject)UNPROVIDED));
        final SubLObject var9 = f47510(var7);
        return (SubLObject)((NIL != var8 && NIL != assertion_handles_oc.f11035(var9)) ? makeBoolean(!var8.equal(module0178.f11334(var9))) : NIL);
    }
    
    public static SubLObject f47848(final SubLObject var7, SubLObject var511) {
        if (var511 == UNPROVIDED) {
            var511 = (SubLObject)NIL;
        }
        if (NIL != f47478(var7)) {
            SubLObject var512 = (SubLObject)ZERO_INTEGER;
            if (module0743.f45996(var7).isVector()) {
                final SubLObject var513 = module0743.f45996(var7);
                final SubLObject var514 = (SubLObject)NIL;
                SubLObject var515;
                SubLObject var516;
                SubLObject var517;
                SubLObject var518;
                for (var515 = Sequences.length(var513), var516 = (SubLObject)NIL, var516 = (SubLObject)ZERO_INTEGER; var516.numL(var515); var516 = Numbers.add(var516, (SubLObject)ONE_INTEGER)) {
                    var517 = ((NIL != var514) ? Numbers.subtract(var515, var516, (SubLObject)ONE_INTEGER) : var516);
                    var518 = Vectors.aref(var513, var517);
                    var511 = ConsesLow.append(f47848(var518, (SubLObject)UNPROVIDED), var511);
                    var512 = Numbers.add(var512, (SubLObject)ONE_INTEGER);
                }
            }
        }
        if (NIL != f47847(var7)) {
            var511 = (SubLObject)ConsesLow.cons(f47832(var7), var511);
        }
        return var511;
    }
    
    public static SubLObject f47849(final SubLObject var7, SubLObject var512) {
        if (var512 == UNPROVIDED) {
            var512 = (SubLObject)NIL;
        }
        if (NIL != f47478(var7)) {
            SubLObject var513 = (SubLObject)ZERO_INTEGER;
            if (module0743.f45996(var7).isVector()) {
                final SubLObject var514 = module0743.f45996(var7);
                final SubLObject var515 = (SubLObject)NIL;
                SubLObject var516;
                SubLObject var517;
                SubLObject var518;
                SubLObject var519;
                for (var516 = Sequences.length(var514), var517 = (SubLObject)NIL, var517 = (SubLObject)ZERO_INTEGER; var517.numL(var516); var517 = Numbers.add(var517, (SubLObject)ONE_INTEGER)) {
                    var518 = ((NIL != var515) ? Numbers.subtract(var516, var517, (SubLObject)ONE_INTEGER) : var517);
                    var519 = Vectors.aref(var514, var518);
                    var512 = ConsesLow.append(f47849(var519, (SubLObject)UNPROVIDED), var512);
                    var513 = Numbers.add(var513, (SubLObject)ONE_INTEGER);
                }
            }
        }
        if (NIL != f47510(var7)) {
            var512 = (SubLObject)ConsesLow.cons(f47832(var7), var512);
        }
        return var512;
    }
    
    public static SubLObject f47850() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0756", "f47463", "S#39109", 1, 2, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0756", "f47470", "S#51953");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0756", "f47471", "S#50244", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0756", "f47473", "S#50245", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0756", "f47472", "S#51954", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0756", "f47474", "S#51955", 5, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0756", "f47483", "S#51956", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0756", "f47485", "S#51957", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0756", "f47492", "S#51958", 3, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0756", "f47486", "S#51959", 3, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0756", "f47484", "S#51960", 1, 2, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0756", "f47494", "S#51961");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0756", "f47495", "S#51962", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0756", "f47496", "S#51963", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0756", "f47493", "S#50685", 2, 3, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0756", "f47498", "S#51964", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0756", "f47506", "S#51965", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0756", "f47512", "S#51966", 3, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0756", "f47515", "S#51967", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0756", "f47514", "S#51968", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0756", "f47517", "S#51969", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0756", "f47518", "S#51970", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0756", "f47521", "S#51971", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0756", "f47522", "S#51972", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0756", "f47523", "S#51973", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0756", "f47524", "S#51974", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0756", "f47525", "S#51975", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0756", "f47526", "S#51976", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0756", "f47527", "S#51977", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0756", "f47528", "S#51978", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0756", "f47529", "S#51979", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0756", "f47530", "S#51980", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0756", "f47531", "S#51981", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0756", "f47536", "S#51982", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0756", "f47537", "S#51983", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0756", "f47538", "S#51984", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0756", "f47539", "S#51985", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0756", "f47540", "S#50979", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0756", "f47541", "S#51986", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0756", "f47542", "S#50981", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0756", "f47544", "S#51987", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0756", "f47545", "S#51988", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0756", "f47546", "S#51989", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0756", "f47550", "S#51990", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0756", "f47553", "S#51991", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0756", "f47554", "S#51992", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0756", "f47547", "S#51993", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0756", "f47556", "S#51994", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0756", "f47555", "S#51995", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0756", "f47559", "S#51996", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0756", "f47560", "S#51997", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0756", "f47561", "S#51998", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0756", "f47557", "S#51999", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0756", "f47562", "S#52000", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0756", "f47563", "S#52001", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0756", "f47565", "S#52002", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0756", "f47564", "S#52003", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0756", "f47566", "S#52004", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0756", "f47567", "S#52005", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0756", "f47558", "S#52006", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0756", "f47548", "S#52007", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0756", "f47570", "S#52008", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0756", "f47549", "S#52009", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0756", "f47571", "S#52010", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0756", "f47572", "S#52011", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0756", "f47573", "S#52012", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0756", "f47519", "S#52013", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0756", "f47574", "S#52014", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0756", "f47575", "S#52015", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0756", "f47576", "S#52016", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0756", "f47577", "S#52017", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0756", "f47551", "S#52018", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0756", "f47578", "S#52019", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0756", "f47580", "S#52020", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0756", "f47581", "S#52021", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0756", "f47579", "S#52022", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0756", "f47583", "S#52023", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0756", "f47582", "S#52024", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0756", "f47584", "S#52025", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0756", "f47586", "S#52026", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0756", "f47593", "S#52027", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0756", "f47592", "S#52028", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0756", "f47594", "S#52029", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0756", "f47595", "S#52030", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0756", "f47552", "S#52031", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0756", "f47596", "S#52032", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0756", "f47597", "S#52033", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0756", "f47598", "S#52034", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0756", "f47497", "S#39064", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0756", "f47599", "S#52035", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0756", "f47466", "S#52036", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0756", "f47600", "S#39267", 1, 0, false);
        new $f47600$UnaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0756", "f47601", "S#52037", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0756", "f47602", "S#52038", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0756", "f47603", "S#52039", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0756", "f47604", "S#52040", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0756", "f47605", "S#52041", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0756", "f47607", "S#52042", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0756", "f47608", "S#52043", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0756", "f47535", "S#52044", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0756", "f47609", "S#52045", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0756", "f47479", "S#39091", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0756", "f47610", "S#52046", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0756", "f47611", "S#52047", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0756", "f47490", "S#52048", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0756", "f47613", "S#39065", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0756", "f47615", "S#50669", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0756", "f47614", "S#52049", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0756", "f47619", "S#52050", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0756", "f47612", "S#52051", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0756", "f47513", "S#52052", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0756", "f47627", "S#52053", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0756", "f47628", "S#52054", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0756", "f47499", "S#52055", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0756", "f47500", "S#52056", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0756", "f47630", "S#52057", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0756", "f47631", "S#52058", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0756", "f47632", "S#52059", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0756", "f47634", "S#52060", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0756", "f47635", "S#52061", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0756", "f47620", "S#52062", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0756", "f47636", "S#52063", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0756", "f47637", "S#52064", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0756", "f47638", "S#52065", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0756", "f47640", "S#52066", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0756", "f47641", "S#52067", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0756", "f47642", "S#52068", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0756", "f47643", "S#52069", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0756", "f47644", "S#52070", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0756", "f47647", "S#52071", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0756", "f47639", "S#52072", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0756", "f47649", "S#52073", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0756", "f47650", "S#52074", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0756", "f47654", "S#51850", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0756", "f47655", "S#52075", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0756", "f47656", "S#52076", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0756", "f47621", "S#52077", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0756", "f47657", "S#52078", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0756", "f47489", "S#52079", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0756", "f47658", "S#52080", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0756", "f47659", "S#52081", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0756", "f47660", "S#39287", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0756", "f47662", "S#52082", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0756", "f47663", "S#52083", 3, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0756", "f47664", "S#52084", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0756", "f47665", "S#52085", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0756", "f47661", "S#52086", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0756", "f47667", "S#52087", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0756", "f47669", "S#52088", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0756", "f47666", "S#52089", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0756", "f47668", "S#52090", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0756", "f47475", "S#41498", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0756", "f47622", "S#50694", 2, 0, false);
        new $f47622$BinaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0756", "f47670", "S#52091", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0756", "f47616", "S#52092", 1, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0756", "f47671", "S#52093");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0756", "f47672", "S#52094", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0756", "f47673", "S#52095", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0756", "f47626", "S#52096", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0756", "f47674", "S#52097", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0756", "f47675", "S#52098", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0756", "f47676", "S#52099", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0756", "f47617", "S#52100", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0756", "f47633", "S#50698", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0756", "f47623", "S#52101", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0756", "f47618", "S#52102", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0756", "f47677", "S#52103", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0756", "f47678", "S#52104", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0756", "f47679", "S#52105", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0756", "f47681", "S#52106", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0756", "f47629", "S#52107", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0756", "f47682", "S#52108", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0756", "f47568", "S#52109", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0756", "f47683", "S#52110", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0756", "f47684", "S#52111", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0756", "f47685", "S#52112", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0756", "f47510", "S#50675", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0756", "f47509", "S#52113", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0756", "f47569", "S#50956", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0756", "f47686", "S#52114", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0756", "f47687", "S#52115", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0756", "f47688", "S#50959", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0756", "f47689", "S#50170", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0756", "f47690", "S#52116", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0756", "f47692", "S#52117", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0756", "f47693", "S#52118", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0756", "f47695", "S#52119", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0756", "f47696", "S#52120", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0756", "f47697", "S#51941", 2, 0, false);
        new $f47697$BinaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0756", "f47698", "S#52121", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0756", "f47701", "S#52122", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0756", "f47702", "S#52123", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0756", "f47703", "S#52124", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0756", "f47699", "S#52125", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0756", "f47704", "S#52126", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0756", "f47700", "S#52127", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0756", "f47705", "S#52128", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0756", "f47706", "S#52129", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0756", "f47707", "S#52130", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0756", "f47708", "S#52131", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0756", "f47710", "S#52132", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0756", "f47480", "S#51739", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0756", "f47714", "S#52133", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0756", "f47505", "S#52134", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0756", "f47504", "S#52135", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0756", "f47715", "S#52136", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0756", "f47719", "S#52137", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0756", "f47716", "S#52138", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0756", "f47720", "S#51733", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0756", "f47713", "PPH-PHRASE-OUTPUT-LIST-STRING", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0756", "f47722", "S#52139", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0756", "f47721", "S#39272", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0756", "f47723", "S#50696", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0756", "f47711", "S#52140", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0756", "f47469", "S#52141", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0756", "f47502", "S#52142", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0756", "f47468", "S#52143", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0756", "f47724", "S#52144", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0756", "f47725", "S#52145", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0756", "f47718", "S#52146", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0756", "f47726", "S#52147", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0756", "f47532", "S#52148", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0756", "f47591", "S#52149", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0756", "f47652", "S#52150", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0756", "f47727", "S#52151", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0756", "f47728", "S#52152", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0756", "f47730", "S#52153", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0756", "f47653", "S#52154", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0756", "f47731", "S#52155", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0756", "f47645", "S#52156", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0756", "f47646", "S#52157", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0756", "f47732", "S#50988", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0756", "f47733", "S#50989", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0756", "f47734", "S#52158", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0756", "f47735", "S#52159", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0756", "f47481", "S#51848", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0756", "f47729", "S#50973", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0756", "f47503", "S#52160", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0756", "f47738", "S#52161", 2, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0756", "f47740", "S#52162", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0756", "f47742", "S#52163", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0756", "f47739", "S#52164", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0756", "f47743", "S#52165", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0756", "f47744", "S#52166", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0756", "f47465", "S#39110", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0756", "f47745", "S#39086", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0756", "f47746", "S#50695", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0756", "f47476", "S#50971", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0756", "f47694", "S#38928", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0756", "f47748", "S#39274", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0756", "f47747", "S#52167", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0756", "f47624", "S#52168", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0756", "f47717", "S#52169", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0756", "f47487", "S#39085", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0756", "f47520", "S#52170", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0756", "f47749", "S#52171", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0756", "f47750", "S#52172", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0756", "f47751", "S#52173", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0756", "f47752", "S#52174", 3, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0756", "f47753", "S#52175", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0756", "f47754", "S#52176", 3, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0756", "f47755", "S#52177", 5, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0756", "f47756", "S#52178", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0756", "f47757", "S#52179", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0756", "f47758", "S#52180", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0756", "f47759", "S#52181", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0756", "f47467", "S#39096", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0756", "f47760", "S#39093", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0756", "f47501", "S#39097", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0756", "f47761", "S#52182", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0756", "f47762", "S#52183", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0756", "f47765", "S#52184", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0756", "f47764", "S#52185", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0756", "f47763", "S#52186", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0756", "f47766", "S#52187", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0756", "f47769", "S#52188", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0756", "f47768", "S#52189", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0756", "f47770", "S#52190", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0756", "f47771", "S#52191", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0756", "f47772", "S#52192", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0756", "f47773", "S#52193", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0756", "f47774", "S#52194", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0756", "f47775", "S#52195", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0756", "f47767", "S#52196", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0756", "f47776", "S#50985", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0756", "f47585", "S#52197", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0756", "f47777", "S#52198", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0756", "f47709", "S#52199", 1, 4, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0756", "f47712", "S#52200", 1, 7, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0756", "f47778", "S#52201", 1, 3, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0756", "f47482", "S#39306", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0756", "f47779", "S#52202", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0756", "f47508", "S#52203", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0756", "f47782", "S#50993", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0756", "f47534", "S#50991", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0756", "f47783", "S#50980", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0756", "f47785", "S#52204", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0756", "f47786", "S#52205", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0756", "f47787", "S#52206", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0756", "f47788", "S#52207", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0756", "f47789", "S#52208", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0756", "f47793", "S#52209", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0756", "f47794", "S#52210", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0756", "f47795", "S#52211", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0756", "f47791", "S#52212", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0756", "f47792", "S#52213", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0756", "f47796", "S#52214", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0756", "f47797", "S#52215", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0756", "f47784", "S#39090", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0756", "f47798", "S#52216", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0756", "f47790", "S#52217", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0756", "f47799", "S#52218", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0756", "f47800", "S#52219", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0756", "f47802", "S#52220", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0756", "f47803", "S#52221", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0756", "f47780", "S#52222", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0756", "f47801", "S#52223", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0756", "f47781", "S#52224", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0756", "f47691", "S#50972", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0756", "f47804", "S#52225", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0756", "f47488", "S#39088", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0756", "f47806", "S#52226", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0756", "f47809", "S#52227", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0756", "f47807", "S#52228", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0756", "f47810", "S#52229", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0756", "f47812", "S#52230", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0756", "f47813", "S#52231", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0756", "f47814", "S#52232", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0756", "f47811", "S#52233", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0756", "f47808", "S#52234", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0756", "f47805", "S#52235", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0756", "f47815", "S#52236", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0756", "f47606", "S#52237", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0756", "f47625", "S#50992", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0756", "f47816", "S#52238", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0756", "f47511", "S#50957", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0756", "f47817", "S#50978", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0756", "f47464", "S#50697", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0756", "f47818", "S#52239", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0756", "f47516", "S#52240", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0756", "f47588", "S#52241", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0756", "f47819", "S#52242", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0756", "f47478", "S#39098", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0756", "f47820", "S#52243", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0756", "f47543", "S#52244", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0756", "f47821", "S#52245", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0756", "f47589", "S#52246", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0756", "f47822", "S#39102", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0756", "f47823", "S#52247", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0756", "f47824", "S#52248", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0756", "f47825", "S#52249", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0756", "f47826", "S#52250", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0756", "f47477", "S#50994", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0756", "f47737", "S#52251", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0756", "f47827", "S#52252", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0756", "f47533", "S#50996", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0756", "f47590", "S#50990", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0756", "f47648", "S#50987", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0756", "f47828", "S#52253", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0756", "f47587", "S#52254", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0756", "f47736", "S#52255", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0756", "f47680", "S#52256", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0756", "f47830", "S#52257", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0756", "f47831", "S#52258", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0756", "f47651", "S#52259", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0756", "f47741", "S#52260", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0756", "f47832", "S#52261", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0756", "f47829", "S#52262", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0756", "f47833", "S#52263", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0756", "f47507", "S#52264", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0756", "f47491", "S#52265", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0756", "f47834", "S#39100", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0756", "f47836", "S#39099", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0756", "f47837", "S#50995", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0756", "f47838", "S#52266", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0756", "f47839", "S#52267", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0756", "f47841", "S#52268", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0756", "f47840", "S#52269", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0756", "f47842", "S#52270", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0756", "f47843", "S#52271", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0756", "f47835", "S#52272", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0756", "f47844", "S#52273", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0756", "f47845", "S#52274", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0756", "f47846", "S#52275", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0756", "f47847", "S#52276", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0756", "f47848", "S#52277", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0756", "f47849", "S#52278", 1, 1, false);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f47851() {
        $g6068$ = SubLFiles.defparameter("S#52279", (SubLObject)NIL);
        $g6069$ = SubLFiles.defparameter("S#52280", (SubLObject)NIL);
        $g6070$ = SubLFiles.defparameter("S#52281", (SubLObject)NIL);
        $g6071$ = SubLFiles.defparameter("S#52282", (SubLObject)$ic29$);
        $g6072$ = SubLFiles.deflexical("S#52283", (SubLObject)$ic58$);
        $g6073$ = SubLFiles.deflexical("S#52284", (SubLObject)$ic62$);
        $g6074$ = SubLFiles.defparameter("S#52285", (SubLObject)NIL);
        $g6075$ = SubLFiles.defparameter("S#52286", (SubLObject)NIL);
        $g6076$ = SubLFiles.defparameter("S#52287", (SubLObject)$ic175$);
        $g6077$ = SubLFiles.defparameter("S#52288", (SubLObject)NIL);
        $g6078$ = SubLFiles.defparameter("S#52289", (SubLObject)TEN_INTEGER);
        $g6079$ = SubLFiles.defparameter("S#52290", (SubLObject)ZERO_INTEGER);
        $g6080$ = SubLFiles.deflexical("S#52291", (SubLObject)((NIL != Symbols.boundp((SubLObject)$ic238$)) ? $g6080$.getGlobalValue() : $ic239$));
        $g6081$ = SubLFiles.defconstant("S#52292", (SubLObject)$ic251$);
        $g6082$ = SubLFiles.defconstant("S#52293", (SubLObject)$ic252$);
        $g6083$ = SubLFiles.deflexical("S#52294", (SubLObject)NIL);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f47852() {
        module0034.f1895((SubLObject)$ic25$);
        module0002.f50((SubLObject)$ic40$, (SubLObject)$ic41$);
        module0034.f1895((SubLObject)$ic80$);
        module0034.f1895((SubLObject)$ic201$);
        module0034.f1895((SubLObject)$ic206$);
        module0003.f57((SubLObject)$ic238$);
        module0034.f1909((SubLObject)$ic284$);
        return (SubLObject)NIL;
    }
    
    public void declareFunctions() {
        f47850();
    }
    
    public void initializeVariables() {
        f47851();
    }
    
    public void runTopLevelForms() {
        f47852();
    }
    
    static {
        me = (SubLFile)new module0756();
        $g6068$ = null;
        $g6069$ = null;
        $g6070$ = null;
        $g6071$ = null;
        $g6072$ = null;
        $g6073$ = null;
        $g6074$ = null;
        $g6075$ = null;
        $g6076$ = null;
        $g6077$ = null;
        $g6078$ = null;
        $g6079$ = null;
        $g6080$ = null;
        $g6081$ = null;
        $g6082$ = null;
        $g6083$ = null;
        $ic0$ = makeString("Keeping generic arg ~S.");
        $ic1$ = makeString("Not keeping generic arg ~S.");
        $ic2$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#52295", "CYC"), (SubLObject)makeSymbol("S#39298", "CYC"), (SubLObject)makeSymbol("S#52296", "CYC")), (SubLObject)makeSymbol("&BODY"), (SubLObject)makeSymbol("S#5", "CYC"));
        $ic3$ = makeSymbol("CLET");
        $ic4$ = ConsesLow.list((SubLObject)ZERO_INTEGER);
        $ic5$ = makeSymbol("PWHEN");
        $ic6$ = makeSymbol("VECTORP");
        $ic7$ = makeSymbol("S#50259", "CYC");
        $ic8$ = makeSymbol("S#50280", "CYC");
        $ic9$ = makeSymbol("CINC");
        $ic10$ = makeString("");
        $ic11$ = makeString("~% Dtr #~A: ");
        $ic12$ = makeString("~%<PPH-PHRASE ~S");
        $ic13$ = ConsesLow.list((SubLObject)ConsesLow.cons((SubLObject)makeSymbol("S#52135", "CYC"), (SubLObject)makeString("string")), (SubLObject)ConsesLow.cons((SubLObject)makeSymbol("S#50258", "CYC"), (SubLObject)makeString("category")), (SubLObject)ConsesLow.cons((SubLObject)makeSymbol("S#39085", "CYC"), (SubLObject)makeString("cycl")), (SubLObject)ConsesLow.cons((SubLObject)makeSymbol("S#39306", "CYC"), (SubLObject)makeString("agr")), (SubLObject)ConsesLow.cons((SubLObject)makeSymbol("S#52237", "CYC"), (SubLObject)makeString("wu")), (SubLObject)ConsesLow.cons((SubLObject)makeSymbol("S#52061", "CYC"), (SubLObject)makeString("case")), (SubLObject)ConsesLow.cons((SubLObject)makeSymbol("S#39096", "CYC"), (SubLObject)makeString("output list")), (SubLObject)ConsesLow.cons((SubLObject)makeSymbol("S#50675", "CYC"), (SubLObject)makeString("justification")));
        $ic14$ = (SubLList)ConsesLow.cons((SubLObject)makeSymbol("S#52297", "CYC"), (SubLObject)makeSymbol("STRING"));
        $ic15$ = makeKeyword("NOT-FOUND");
        $ic16$ = makeString(" ~A: ~S~%");
        $ic17$ = makeString(" ~S~%");
        $ic18$ = makeString("-");
        $ic19$ = makeString(" (head)");
        $ic20$ = makeString("~& Dtrs:");
        $ic21$ = makeString(" Head:");
        $ic22$ = makeString(" ~S");
        $ic23$ = makeString(" (~S ~A)");
        $ic24$ = makeString(">");
        $ic25$ = makeSymbol("S#51959", "CYC");
        $ic26$ = makeString("Failed to paraphrase ~S~% category: ~S preds: ~S");
        $ic27$ = makeInteger(128);
        $ic28$ = makeKeyword("&MEMOIZED-ITEM-NOT-FOUND&");
        $ic29$ = makeInteger(60);
        $ic30$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#39298", "CYC")), (SubLObject)makeSymbol("&BODY"), (SubLObject)makeSymbol("S#5", "CYC"));
        $ic31$ = makeSymbol("PIF");
        $ic32$ = ConsesLow.list((SubLObject)makeSymbol("CAND"), (SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#5434", "CYC"), (SubLObject)makeSymbol("S#52281", "CYC")), (SubLObject)ConsesLow.list((SubLObject)makeSymbol(">"), (SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#5448", "CYC"), (SubLObject)makeSymbol("S#52281", "CYC")), (SubLObject)makeSymbol("S#52282", "CYC")));
        $ic33$ = ConsesLow.list((SubLObject)makeSymbol("S#38912", "CYC"), (SubLObject)ONE_INTEGER, (SubLObject)makeString("~&Recursion limit (~S) exceeded in PPH-PHRASE-COPY."), (SubLObject)makeSymbol("S#52282", "CYC"));
        $ic34$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#52281", "CYC"), (SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#51962", "CYC"))));
        $ic35$ = makeSymbol("S#3953", "CYC");
        $ic36$ = ConsesLow.list((SubLObject)makeSymbol("S#52281", "CYC"));
        $ic37$ = makeSymbol("CUNWIND-PROTECT");
        $ic38$ = makeSymbol("PROGN");
        $ic39$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#3955", "CYC"), (SubLObject)makeSymbol("S#52281", "CYC")));
        $ic40$ = makeSymbol("S#51962", "CYC");
        $ic41$ = makeSymbol("S#51961", "CYC");
        $ic42$ = makeSymbol("S#5434", "CYC");
        $ic43$ = makeString("~&Copying phrase~% ~S");
        $ic44$ = makeString("Can't reuse old phrase:~% ~S~%");
        $ic45$ = makeKeyword("NON-LOCAL-FEATURES-IGNORED?");
        $ic46$ = makeString("~&Copying nonlocal features of~% ~S from~% ~S");
        $ic47$ = makeString("~&Reusing copy of phrase:~% ~S~%");
        $ic48$ = makeString("(PPH error level ");
        $ic49$ = makeString(") ");
        $ic50$ = makeString("~&Recursion limit (~S) exceeded in PPH-PHRASE-COPY.");
        $ic51$ = makeKeyword("COPYING-PHRASE");
        $ic52$ = makeString("~&Set top-level demerits to ~S");
        $ic53$ = makeString("~&Set output list to ~S");
        $ic54$ = makeString("~&Set category to ~S");
        $ic55$ = makeString("~&Copied noted string ~S");
        $ic56$ = makeString("~&Setting agr to ~S");
        $ic57$ = makeString("~&Set agr to ~S");
        $ic58$ = ConsesLow.list((SubLObject)makeKeyword("MOTHER"), (SubLObject)makeKeyword("ALTERNATIVES"));
        $ic59$ = makeSymbol("ATOM");
        $ic60$ = makeSymbol("S#3944", "CYC");
        $ic61$ = makeSymbol("STRINGP");
        $ic62$ = ConsesLow.list((SubLObject)makeKeyword("PERCENT-PHRASE"), (SubLObject)makeKeyword("SYMBOL-PHRASE"), (SubLObject)makeKeyword("CYCL-PHRASE"), (SubLObject)makeKeyword("QUOTED-PARAPHRASE"), (SubLObject)makeKeyword("STRING-MENTION"), (SubLObject)makeKeyword("CLARIFYING"));
        $ic63$ = makeKeyword("SPECIAL-TYPE");
        $ic64$ = makeKeyword("FOCUS-ARG");
        $ic65$ = makeKeyword("PERCENT-PHRASE");
        $ic66$ = makeKeyword("CLARIFYING");
        $ic67$ = makeKeyword("ARG1");
        $ic68$ = makeKeyword("ARG2");
        $ic69$ = makeKeyword("SYMBOL-PHRASE");
        $ic70$ = makeKeyword("SYMBOL");
        $ic71$ = makeKeyword("CYCL-PHRASE");
        $ic72$ = makeKeyword("QUOTED-PARAPHRASE");
        $ic73$ = makeKeyword("STRING-MENTION");
        $ic74$ = makeKeyword("NOSPACE");
        $ic75$ = makeKeyword("VARIABLE-BINDING");
        $ic76$ = ConsesLow.list((SubLObject)makeSymbol("S#45612", "CYC"), (SubLObject)makeSymbol("S#52298", "CYC"));
        $ic77$ = makeKeyword("PHRASE-NAUT");
        $ic78$ = makeKeyword("QUERY-EL-FORMULA");
        $ic79$ = makeSymbol("EL-VAR?");
        $ic80$ = makeSymbol("S#52003", "CYC");
        $ic81$ = ConsesLow.list((SubLObject)makeKeyword("MAX-NUMBER"), (SubLObject)ONE_INTEGER, (SubLObject)makeKeyword("FORGET-EXTRA-RESULTS?"), (SubLObject)T, (SubLObject)makeKeyword("ANSWER-LANGUAGE"), (SubLObject)makeKeyword("HL"), (SubLObject)makeKeyword("RETURN"), (SubLObject)makeKeyword("BINDINGS-AND-SUPPORTS"));
        $ic82$ = makeString("Couldn't find bindings for ~S");
        $ic83$ = makeInteger(24);
        $ic84$ = ConsesLow.list((SubLObject)makeSymbol("S#52285", "CYC"), (SubLObject)makeSymbol("S#14510", "CYC"));
        $ic85$ = makeKeyword("TERSE-PARAPHRASE");
        $ic86$ = makeKeyword("PRECISE-PARAPHRASE");
        $ic87$ = makeKeyword("CHEMICAL-FORMULA-FROM-LISTS");
        $ic88$ = ConsesLow.list((SubLObject)makeSymbol("S#52299", "CYC"), (SubLObject)makeSymbol("S#52300", "CYC"));
        $ic89$ = makeKeyword("CONDITIONAL-PHRASE");
        $ic90$ = makeString("NEW-PPH-CONDITIONAL-PHRASE passed bogus phrase-naut: ~S");
        $ic91$ = ConsesLow.list((SubLObject)makeSymbol("S#122", "CYC"), (SubLObject)makeSymbol("S#52301", "CYC"), (SubLObject)makeSymbol("&OPTIONAL"), (SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#52302", "CYC"), (SubLObject)ConsesLow.list((SubLObject)makeSymbol("BQ-LIST"), constant_handles_oc.f8479((SubLObject)makeString("BestNLPhraseOfStringFn")), (SubLObject)makeSymbol("S#1647", "CYC"))));
        $ic92$ = constant_handles_oc.f8479((SubLObject)makeString("BestNLPhraseOfStringFn"));
        $ic93$ = makeKeyword("ARG3");
        $ic94$ = makeString("#$ConditionalPhraseFn expects a closed formula for its arg1, not ~S");
        $ic95$ = makeKeyword("COORDINATION");
        $ic96$ = makeKeyword("UNORDERED");
        $ic97$ = ConsesLow.list((SubLObject)makeSymbol("S#43350", "CYC"), (SubLObject)makeSymbol("LIST"), (SubLObject)makeSymbol("S#3842", "CYC"));
        $ic98$ = constant_handles_oc.f8479((SubLObject)makeString("RepeatForSubsequentArgsFn"));
        $ic99$ = constant_handles_oc.f8479((SubLObject)makeString("FormulaArgFn"));
        $ic100$ = constant_handles_oc.f8479((SubLObject)makeString("PhraseFormFn"));
        $ic101$ = constant_handles_oc.f8479((SubLObject)makeString("TermParaphraseFn"));
        $ic102$ = constant_handles_oc.f8479((SubLObject)makeString("NLConjunctionFn"));
        $ic103$ = makeKeyword("AND");
        $ic104$ = constant_handles_oc.f8479((SubLObject)makeString("NLConjunctionFn-But"));
        $ic105$ = makeKeyword("BUT");
        $ic106$ = constant_handles_oc.f8479((SubLObject)makeString("NLDisjunctionFn"));
        $ic107$ = makeKeyword("OR");
        $ic108$ = makeKeyword("NONE");
        $ic109$ = constant_handles_oc.f8479((SubLObject)makeString("and"));
        $ic110$ = constant_handles_oc.f8479((SubLObject)makeString("or"));
        $ic111$ = makeSymbol("?ID-STRING");
        $ic112$ = constant_handles_oc.f8479((SubLObject)makeString("htmlListTypeIdentifierString"));
        $ic113$ = ConsesLow.list((SubLObject)makeSymbol("?ID-STRING"));
        $ic114$ = constant_handles_oc.f8479((SubLObject)makeString("HTMLRepresentationMt"));
        $ic115$ = constant_handles_oc.f8479((SubLObject)makeString("CoordinatingConjunction"));
        $ic116$ = constant_handles_oc.f8479((SubLObject)makeString("Feminine-NLAttr"));
        $ic117$ = constant_handles_oc.f8479((SubLObject)makeString("ThirdPerson-NLAttr"));
        $ic118$ = makeKeyword("NEVER");
        $ic119$ = constant_handles_oc.f8479((SubLObject)makeString("Plural-NLAttr"));
        $ic120$ = constant_handles_oc.f8479((SubLObject)makeString("Singular-NLAttr"));
        $ic121$ = constant_handles_oc.f8479((SubLObject)makeString("singular-Generic"));
        $ic122$ = constant_handles_oc.f8479((SubLObject)makeString("plural-Generic"));
        $ic123$ = makeKeyword("REPEATED");
        $ic124$ = ConsesLow.list((SubLObject)makeSymbol("S#52303", "CYC"), (SubLObject)makeSymbol("S#52304", "CYC"));
        $ic125$ = makeString("Found non-phrase dtr: ~S");
        $ic126$ = makeKeyword("VERIFIED");
        $ic127$ = makeSymbol("S#50692", "CYC");
        $ic128$ = makeSymbol("S#12274", "CYC");
        $ic129$ = constant_handles_oc.f8479((SubLObject)makeString("EverythingPSC"));
        $ic130$ = ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("posForms")), constant_handles_oc.f8479((SubLObject)makeString("posBaseForms")));
        $ic131$ = ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("A-TheWord")), constant_handles_oc.f8479((SubLObject)makeString("An-TheWord")));
        $ic132$ = ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("Indefinite-NLAttr")));
        $ic133$ = constant_handles_oc.f8479((SubLObject)makeString("The-TheWord"));
        $ic134$ = constant_handles_oc.f8479((SubLObject)makeString("Definite-NLAttr"));
        $ic135$ = makeKeyword("DONE?");
        $ic136$ = makeString("~S not considered done.");
        $ic137$ = constant_handles_oc.f8479((SubLObject)makeString("Between-TheWord"));
        $ic138$ = makeString("between");
        $ic139$ = constant_handles_oc.f8479((SubLObject)makeString("EnDash-TheSymbol"));
        $ic140$ = makeString("Destroying dtrs of ~S");
        $ic141$ = makeString("Destroyed failed phrase dtrs.~% New PPH phrase count went from ~S to ~S.~%");
        $ic142$ = makeKeyword("SKIP");
        $ic143$ = makeKeyword("FREE");
        $ic144$ = makeKeyword("DESTROYED");
        $ic145$ = makeKeyword("DEMERITS");
        $ic146$ = makeKeyword("CASE");
        $ic147$ = makeKeyword("PROBLEM-DICTIONARY");
        $ic148$ = makeKeyword("SUID");
        $ic149$ = makeKeyword("MOTHER");
        $ic150$ = makeKeyword("LINK-CYCL");
        $ic151$ = makeKeyword("WU");
        $ic152$ = makeKeyword("HEAD-DTR-NUM");
        $ic153$ = makeKeyword("SOURCE-POS");
        $ic154$ = makeKeyword("ALTERNATIVES");
        $ic155$ = makeKeyword("RESERVED-FOR-MATRIX-ARG0");
        $ic156$ = makeSymbol("NON-NEGATIVE-INTEGER-P");
        $ic157$ = makeKeyword("MAX-ALTERNATIVES");
        $ic158$ = makeString("~&Setting object dtr agr to accusative case.~%");
        $ic159$ = makeKeyword("ACCUSATIVE");
        $ic160$ = makeString("~&Setting possessive dtr agr to genitive case.~%");
        $ic161$ = makeKeyword("GENITIVE");
        $ic162$ = constant_handles_oc.f8479((SubLObject)makeString("PossessivePhrase"));
        $ic163$ = makeSymbol("S#51848", "CYC");
        $ic164$ = makeString("Dtr 2 of phrase is object of ~S:~% ~S~%");
        $ic165$ = constant_handles_oc.f8479((SubLObject)makeString("Verb"));
        $ic166$ = constant_handles_oc.f8479((SubLObject)makeString("TransitiveNPFrame"));
        $ic167$ = makeString("~&Setting subject dtr agr to nominative case.~%");
        $ic168$ = makeKeyword("NOMINATIVE");
        $ic169$ = (SubLList)ConsesLow.cons((SubLObject)makeSymbol("S#52305", "CYC"), (SubLObject)makeSymbol("S#52306", "CYC"));
        $ic170$ = makeString(" reported a ");
        $ic171$ = makeString(" problem");
        $ic172$ = makeString(" with this additional info:");
        $ic173$ = makeString(" ");
        $ic174$ = makeString(".");
        $ic175$ = makeInteger(500);
        $ic176$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#52307", "CYC"), (SubLObject)makeSymbol("S#52308", "CYC"), (SubLObject)makeSymbol("S#39298", "CYC")), (SubLObject)makeSymbol("&BODY"), (SubLObject)makeSymbol("S#5", "CYC"));
        $ic177$ = makeUninternedSymbol("US#356AA47");
        $ic178$ = makeUninternedSymbol("US#4CFB471");
        $ic179$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#4669", "CYC")));
        $ic180$ = makeSymbol("S#4670", "CYC");
        $ic181$ = makeSymbol("UNTIL");
        $ic182$ = makeSymbol("S#4672", "CYC");
        $ic183$ = makeSymbol("S#4671", "CYC");
        $ic184$ = makeSymbol("CDOLIST");
        $ic185$ = makeSymbol("S#52095", "CYC");
        $ic186$ = makeSymbol(">=");
        $ic187$ = ConsesLow.list((SubLObject)makeSymbol("S#52287", "CYC"));
        $ic188$ = makeSymbol("S#38912", "CYC");
        $ic189$ = makeString("Done ~S alternatives of ~S");
        $ic190$ = makeString("Setting phrase's mother to itself.");
        $ic191$ = constant_handles_oc.f8479((SubLObject)makeString("NLSentence"));
        $ic192$ = makeString("Mother is part of cycle: ~S");
        $ic193$ = makeString("PPH-PHRASE-ADD-JUSTIFICATION passed NIL.");
        $ic194$ = makeSymbol("SYMBOLP");
        $ic195$ = makeSymbol("LISTP");
        $ic196$ = makeKeyword("CODE");
        $ic197$ = makeSymbol("S#50606", "CYC");
        $ic198$ = makeSymbol("SUPPORT-P");
        $ic199$ = constant_handles_oc.f8479((SubLObject)makeString("MtUnionFn"));
        $ic200$ = makeSymbol("SUPPORT-SENTENCE");
        $ic201$ = makeSymbol("S#52123", "CYC");
        $ic202$ = makeString("Ignoring possible variants for meta phrase~% ~S");
        $ic203$ = makeSymbol("S#52119", "CYC");
        $ic204$ = makeString("Generated ~D dtr variant lists for ~A.");
        $ic205$ = makeString("current phrase");
        $ic206$ = makeSymbol("S#52125", "CYC");
        $ic207$ = makeSymbol("S#51941", "CYC");
        $ic208$ = makeSymbol("S#39064", "CYC");
        $ic209$ = makeString("Failed to get string for variant~% ~S");
        $ic210$ = (SubLList)ConsesLow.cons((SubLObject)makeKeyword("NOSPACE"), (SubLObject)makeKeyword("ANYTHING"));
        $ic211$ = makeString("Auto-nested PPH phrase variant. Matrix phrase: ~S");
        $ic212$ = makeString("PPH phrase variant with nesting depth > 10. Matrix phrase: ~S");
        $ic213$ = ConsesLow.list((SubLObject)makeString("a"), (SubLObject)makeString("an"));
        $ic214$ = ConsesLow.list((SubLObject)makeKeyword("A"), (SubLObject)NIL);
        $ic215$ = makeSymbol("APPEND");
        $ic216$ = makeSymbol("S#50691", "CYC");
        $ic217$ = makeKeyword("HTML-STRING");
        $ic218$ = makeString("Failed to note ~S on ~S~% Noted string: ~S.");
        $ic219$ = makeString("href");
        $ic220$ = makeString("~&Adding new tag inside old.~%");
        $ic221$ = makeKeyword("HTML");
        $ic222$ = makeString("~&Setting string to ~S");
        $ic223$ = makeString("~S is a forbidden paraphrase for ~S");
        $ic224$ = makeString("~&Output list 1: ~S");
        $ic225$ = makeString("~&Output item : ~S");
        $ic226$ = makeString("~&output item 2 : ~S");
        $ic227$ = makeString("~&output item 3 : ~S");
        $ic228$ = makeString("~&output item 4 : ~S");
        $ic229$ = makeSymbol("S#50800", "CYC");
        $ic230$ = makeKeyword("ANY");
        $ic231$ = constant_handles_oc.f8479((SubLObject)makeString("Noun"));
        $ic232$ = constant_handles_oc.f8479((SubLObject)makeString("Be-TheWord"));
        $ic233$ = constant_handles_oc.f8479((SubLObject)makeString("AuxVerb"));
        $ic234$ = constant_handles_oc.f8479((SubLObject)makeString("posForms"));
        $ic235$ = ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("AuxVerb")));
        $ic236$ = constant_handles_oc.f8479((SubLObject)makeString("perfect"));
        $ic237$ = constant_handles_oc.f8479((SubLObject)makeString("OrdinalAdjective"));
        $ic238$ = makeSymbol("S#52291", "CYC");
        $ic239$ = makeInteger(99);
        $ic240$ = makeString("Excessive recursion (~S) in PPH-PHRASE-CATEGORY.");
        $ic241$ = makeString("~&Setting CycL phrase's category to ~S.~%");
        $ic242$ = makeString("Possessivizing NP.");
        $ic243$ = makeString("Nominalizing a possessive.");
        $ic244$ = makeString("Converting NP to 'instance of' Nbar: ~S");
        $ic245$ = ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("BestNLWordFormOfLexemeFn-Constrained")), constant_handles_oc.f8479((SubLObject)makeString("CountNoun")), constant_handles_oc.f8479((SubLObject)makeString("Instance-TheWord")));
        $ic246$ = ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("BestNLWordFormOfLexemeFn-Constrained")), constant_handles_oc.f8479((SubLObject)makeString("Preposition")), constant_handles_oc.f8479((SubLObject)makeString("Of-TheWord")));
        $ic247$ = makeString("New Nbar: ~S");
        $ic248$ = makeSymbol("FORT-P");
        $ic249$ = constant_handles_oc.f8479((SubLObject)makeString("Determiner"));
        $ic250$ = makeString("Don't know how to reconcile ~S and ~S.");
        $ic251$ = makeKeyword("PPH-UNKNOWN-CYCL");
        $ic252$ = makeKeyword("PPH-EMPTY-CYCL");
        $ic253$ = makeString("Couldn't find another reference to ~S other than~% ~S");
        $ic254$ = makeString("~S is not a dtr of its mother~% ~S");
        $ic255$ = makeString("~&Found another reference to ~S:~% Besides: ~S~% Found: ~S~%");
        $ic256$ = makeKeyword("KEEP-OLD-ARG-POSITION");
        $ic257$ = makeString("~&Setting arg-position of ~S to ~S~%");
        $ic258$ = makeString("cycls-of-phrases doesn't know what to do with ~S");
        $ic259$ = makeSymbol("S#4061", "CYC");
        $ic260$ = makeKeyword("COMPUTE");
        $ic261$ = makeKeyword("POS-PRED");
        $ic262$ = makeKeyword("NL-PREDS");
        $ic263$ = makeKeyword("DONT-CARE");
        $ic264$ = makeString("Bad agr value ~S~%");
        $ic265$ = makeString("New target ~S~% for non-new phrase ~S");
        $ic266$ = makeString("Don't-careifying ~S");
        $ic267$ = ConsesLow.list((SubLObject)NIL);
        $ic268$ = makeString("Bad agr-constraint: ~S");
        $ic269$ = makeString("Singleton agr-constraint target: ~S");
        $ic270$ = makeKeyword("SUBJECT-VERB");
        $ic271$ = makeKeyword("DET-NBAR");
        $ic272$ = makeString("~&Can't add new constraints ~S to agr-constraint ~S~%");
        $ic273$ = makeString("~&Updated agr preds from ~S to ~S.");
        $ic274$ = makeString("~S should be a list of speech-part or name-string preds.~%");
        $ic275$ = makeString("Impossible phrase:~% ~S~%");
        $ic276$ = makeKeyword("IMPOSSIBLE");
        $ic277$ = makeString("Impossible because of agr constraint:~% ~S");
        $ic278$ = makeString("Removed ~S from ~S~% based on category ~S, leaving ~S");
        $ic279$ = makeString("Can't reconcile ~S and ~S and ~S~% on ~S~%");
        $ic280$ = makeKeyword("PEER");
        $ic281$ = ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("pronounStrings")), constant_handles_oc.f8479((SubLObject)makeString("nonSingular-Generic")), constant_handles_oc.f8479((SubLObject)makeString("nameString")));
        $ic282$ = makeString("Invalid attempt to reuse memoization state in multiple threads simultaneously.");
        $ic283$ = ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("nounStrings")));
        $ic284$ = makeSymbol("S#52233", "CYC");
        $ic285$ = constant_handles_oc.f8479((SubLObject)makeString("pronounStrings"));
        $ic286$ = makeSymbol("S#52294", "CYC");
        $ic287$ = makeSymbol("S#52230", "CYC");
        $ic288$ = makeString("~&Phrase ~D is unfinished.");
        $ic289$ = makeString("Can't set dtrs of non-phrase ~S");
        $ic290$ = makeString("Adding old dtr to new mother.~% Mother: ~S~% Dtr: ~S~%");
        $ic291$ = makeString("~S is not terminal");
        $ic292$ = makeSymbol("S#52154", "CYC");
        $ic293$ = makeSymbol("POSITIVE-INTEGER-P");
        $ic294$ = Vectors.vector(EMPTY_SUBL_OBJECT_ARRAY);
        $ic295$ = makeString("Extraction disparity.~%Expected~% ~S~%Extracted~% ~S~%");
        $ic296$ = makeString("Setting head dtr to initial dtr:~% ~S~%");
        $ic297$ = makeString("~&Setting head dtr num from ~S");
        $ic298$ = makeString(" to ~S~%");
        $ic299$ = makeString("Phrase has lost its head:~% ~S~%");
        $ic300$ = makeString("Setting agr target to itself!");
        $ic301$ = makeString("Setting agr target to non-existent phrase!");
        $ic302$ = makeString("~&Setting agr target num of dtr ~S from ~S to ~S~%");
    }
    
    public static final class $f47600$UnaryFunction extends UnaryFunction
    {
        public $f47600$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("S#39267"));
        }
        
        public SubLObject processItem(final SubLObject var170) {
            return f47600(var170);
        }
    }
    
    public static final class $f47622$BinaryFunction extends BinaryFunction
    {
        public $f47622$BinaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("S#50694"));
        }
        
        public SubLObject processItem(final SubLObject var170, final SubLObject var241) {
            return f47622(var170, var241);
        }
    }
    
    public static final class $f47697$BinaryFunction extends BinaryFunction
    {
        public $f47697$BinaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("S#51941"));
        }
        
        public SubLObject processItem(final SubLObject var170, final SubLObject var241) {
            return f47697(var170, var241);
        }
    }
}

/*
	DECOMPILATION REPORT

	Decompiled from: G:\opt\CYC_JRTL_with_CommonLisp\platform\lib\cyc-oc4.0-unzipped/com/cyc/cycjava/cycl/class
	Total time: 2435 ms
	 synthetic 
	Decompiled with Procyon 0.5.32.
*/