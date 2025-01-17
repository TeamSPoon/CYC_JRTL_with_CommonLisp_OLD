package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.UnaryFunction;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLStructDecl;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLStructDeclNative;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLStructNative;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.visitation;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLSpecialOperatorDeclarations;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Structures;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sort;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.stream_macros;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Vectors;
import java.util.Map;
import java.util.Iterator;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Time;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.StreamsLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Locks;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Filesys;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.compatibility;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class module0093 extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.module0093";
    public static final String myFingerPrint = "ce460276ad9c06ffac72a63493f830b4e1875fd74db197a564fe28197b18d544";
    public static SubLSymbol $g1210$;
    public static SubLSymbol $g1211$;
    public static SubLSymbol $g1212$;
    public static SubLSymbol $g1213$;
    public static SubLSymbol $g1214$;
    public static SubLSymbol $g1215$;
    public static SubLSymbol $g1216$;
    public static SubLSymbol $g1217$;
    private static SubLSymbol $g1218$;
    private static SubLSymbol $g1219$;
    private static SubLSymbol $g1220$;
    public static SubLSymbol $g1221$;
    public static SubLSymbol $g1222$;
    private static SubLSymbol $g1223$;
    private static SubLSymbol $g1224$;
    private static SubLSymbol $g1225$;
    private static SubLSymbol $g1226$;
    private static SubLSymbol $g1227$;
    private static SubLSymbol $g1228$;
    public static SubLSymbol $g1229$;
    private static SubLSymbol $g1230$;
    public static SubLSymbol $g1231$;
    private static SubLSymbol $g1232$;
    private static SubLSymbol $g1233$;
    private static SubLSymbol $g1235$;
    private static SubLSymbol $g1236$;
    public static SubLSymbol $g1237$;
    private static SubLSymbol $g1238$;
    private static SubLSymbol $g1239$;
    private static SubLSymbol $g1240$;
    private static SubLSymbol $g1241$;
    private static SubLSymbol $g1242$;
    private static SubLSymbol $g1243$;
    private static SubLSymbol $g1244$;
    private static SubLSymbol $g1234$;
    public static SubLSymbol $g1245$;
    private static SubLSymbol $g1246$;
    public static SubLSymbol $g1247$;
    public static SubLSymbol $g1248$;
    private static SubLSymbol $g1249$;
    private static SubLSymbol $g1250$;
    public static SubLSymbol $g1251$;
    public static SubLSymbol $g1252$;
    private static SubLSymbol $g1253$;
    private static SubLSymbol $g1254$;
    public static SubLSymbol $g1255$;
    private static SubLSymbol $g1256$;
    private static final SubLSymbol $ic0$;
    private static final SubLSymbol $ic1$;
    private static final SubLList $ic2$;
    private static final SubLList $ic3$;
    private static final SubLList $ic4$;
    private static final SubLList $ic5$;
    private static final SubLSymbol $ic6$;
    private static final SubLSymbol $ic7$;
    private static final SubLList $ic8$;
    private static final SubLSymbol $ic9$;
    private static final SubLSymbol $ic10$;
    private static final SubLSymbol $ic11$;
    private static final SubLSymbol $ic12$;
    private static final SubLSymbol $ic13$;
    private static final SubLSymbol $ic14$;
    private static final SubLSymbol $ic15$;
    private static final SubLSymbol $ic16$;
    private static final SubLSymbol $ic17$;
    private static final SubLSymbol $ic18$;
    private static final SubLSymbol $ic19$;
    private static final SubLSymbol $ic20$;
    private static final SubLSymbol $ic21$;
    private static final SubLSymbol $ic22$;
    private static final SubLSymbol $ic23$;
    private static final SubLSymbol $ic24$;
    private static final SubLSymbol $ic25$;
    private static final SubLSymbol $ic26$;
    private static final SubLSymbol $ic27$;
    private static final SubLSymbol $ic28$;
    private static final SubLSymbol $ic29$;
    private static final SubLSymbol $ic30$;
    private static final SubLSymbol $ic31$;
    private static final SubLSymbol $ic32$;
    private static final SubLSymbol $ic33$;
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
    private static final SubLString $ic48$;
    private static final SubLSymbol $ic49$;
    private static final SubLSymbol $ic50$;
    private static final SubLSymbol $ic51$;
    private static final SubLSymbol $ic52$;
    private static final SubLSymbol $ic53$;
    private static final SubLString $ic54$;
    private static final SubLString $ic55$;
    private static final SubLString $ic56$;
    private static final SubLString $ic57$;
    private static final SubLString $ic58$;
    private static final SubLString $ic59$;
    private static final SubLString $ic60$;
    private static final SubLSymbol $ic61$;
    private static final SubLSymbol $ic62$;
    private static final SubLList $ic63$;
    private static final SubLList $ic64$;
    private static final SubLList $ic65$;
    private static final SubLList $ic66$;
    private static final SubLSymbol $ic67$;
    private static final SubLList $ic68$;
    private static final SubLSymbol $ic69$;
    private static final SubLSymbol $ic70$;
    private static final SubLSymbol $ic71$;
    private static final SubLSymbol $ic72$;
    private static final SubLSymbol $ic73$;
    private static final SubLSymbol $ic74$;
    private static final SubLSymbol $ic75$;
    private static final SubLSymbol $ic76$;
    private static final SubLSymbol $ic77$;
    private static final SubLSymbol $ic78$;
    private static final SubLSymbol $ic79$;
    private static final SubLSymbol $ic80$;
    private static final SubLSymbol $ic81$;
    private static final SubLSymbol $ic82$;
    private static final SubLSymbol $ic83$;
    private static final SubLSymbol $ic84$;
    private static final SubLSymbol $ic85$;
    private static final SubLSymbol $ic86$;
    private static final SubLSymbol $ic87$;
    private static final SubLSymbol $ic88$;
    private static final SubLSymbol $ic89$;
    private static final SubLSymbol $ic90$;
    private static final SubLSymbol $ic91$;
    private static final SubLSymbol $ic92$;
    private static final SubLSymbol $ic93$;
    private static final SubLSymbol $ic94$;
    private static final SubLSymbol $ic95$;
    private static final SubLSymbol $ic96$;
    private static final SubLSymbol $ic97$;
    private static final SubLSymbol $ic98$;
    private static final SubLSymbol $ic99$;
    private static final SubLSymbol $ic100$;
    private static final SubLSymbol $ic101$;
    private static final SubLSymbol $ic102$;
    private static final SubLSymbol $ic103$;
    private static final SubLSymbol $ic104$;
    private static final SubLSymbol $ic105$;
    private static final SubLSymbol $ic106$;
    private static final SubLSymbol $ic107$;
    private static final SubLSymbol $ic108$;
    private static final SubLSymbol $ic109$;
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
    private static final SubLSymbol $ic121$;
    private static final SubLSymbol $ic122$;
    private static final SubLList $ic123$;
    private static final SubLList $ic124$;
    private static final SubLList $ic125$;
    private static final SubLList $ic126$;
    private static final SubLSymbol $ic127$;
    private static final SubLList $ic128$;
    private static final SubLSymbol $ic129$;
    private static final SubLSymbol $ic130$;
    private static final SubLSymbol $ic131$;
    private static final SubLSymbol $ic132$;
    private static final SubLSymbol $ic133$;
    private static final SubLSymbol $ic134$;
    private static final SubLSymbol $ic135$;
    private static final SubLSymbol $ic136$;
    private static final SubLSymbol $ic137$;
    private static final SubLSymbol $ic138$;
    private static final SubLSymbol $ic139$;
    private static final SubLSymbol $ic140$;
    private static final SubLSymbol $ic141$;
    private static final SubLSymbol $ic142$;
    private static final SubLSymbol $ic143$;
    private static final SubLSymbol $ic144$;
    private static final SubLSymbol $ic145$;
    private static final SubLSymbol $ic146$;
    private static final SubLSymbol $ic147$;
    private static final SubLSymbol $ic148$;
    private static final SubLSymbol $ic149$;
    private static final SubLList $ic150$;
    private static final SubLList $ic151$;
    private static final SubLList $ic152$;
    private static final SubLList $ic153$;
    private static final SubLSymbol $ic154$;
    private static final SubLList $ic155$;
    private static final SubLSymbol $ic156$;
    private static final SubLSymbol $ic157$;
    private static final SubLSymbol $ic158$;
    private static final SubLSymbol $ic159$;
    private static final SubLSymbol $ic160$;
    private static final SubLSymbol $ic161$;
    private static final SubLSymbol $ic162$;
    private static final SubLSymbol $ic163$;
    private static final SubLSymbol $ic164$;
    private static final SubLInteger $ic165$;
    private static final SubLInteger $ic166$;
    private static final SubLInteger $ic167$;
    private static final SubLSymbol $ic168$;
    private static final SubLString $ic169$;
    private static final SubLString $ic170$;
    private static final SubLInteger $ic171$;
    private static final SubLSymbol $ic172$;
    private static final SubLSymbol $ic173$;
    private static final SubLList $ic174$;
    private static final SubLList $ic175$;
    private static final SubLList $ic176$;
    private static final SubLList $ic177$;
    private static final SubLSymbol $ic178$;
    private static final SubLSymbol $ic179$;
    private static final SubLList $ic180$;
    private static final SubLSymbol $ic181$;
    private static final SubLSymbol $ic182$;
    private static final SubLSymbol $ic183$;
    private static final SubLSymbol $ic184$;
    private static final SubLSymbol $ic185$;
    private static final SubLSymbol $ic186$;
    private static final SubLSymbol $ic187$;
    private static final SubLSymbol $ic188$;
    private static final SubLSymbol $ic189$;
    private static final SubLSymbol $ic190$;
    private static final SubLSymbol $ic191$;
    private static final SubLSymbol $ic192$;
    private static final SubLSymbol $ic193$;
    private static final SubLSymbol $ic194$;
    private static final SubLString $ic195$;
    private static final SubLString $ic196$;
    private static final SubLString $ic197$;
    private static final SubLString $ic198$;
    private static final SubLString $ic199$;
    private static final SubLString $ic200$;
    private static final SubLString $ic201$;
    private static final SubLSymbol $ic202$;
    private static final SubLList $ic203$;
    private static final SubLList $ic204$;
    private static final SubLSymbol $ic205$;
    private static final SubLSymbol $ic206$;
    private static final SubLSymbol $ic207$;
    private static final SubLList $ic208$;
    private static final SubLSymbol $ic209$;
    private static final SubLList $ic210$;
    private static final SubLSymbol $ic211$;
    private static final SubLList $ic212$;
    private static final SubLList $ic213$;
    private static final SubLSymbol $ic214$;
    private static final SubLList $ic215$;
    private static final SubLSymbol $ic216$;
    private static final SubLSymbol $ic217$;
    private static final SubLSymbol $ic218$;
    private static final SubLSymbol $ic219$;
    private static final SubLSymbol $ic220$;
    private static final SubLSymbol $ic221$;
    private static final SubLSymbol $ic222$;
    private static final SubLSymbol $ic223$;
    private static final SubLSymbol $ic224$;
    private static final SubLSymbol $ic225$;
    private static final SubLSymbol $ic226$;
    private static final SubLSymbol $ic227$;
    private static final SubLString $ic228$;
    private static final SubLSymbol $ic229$;
    private static final SubLString $ic230$;
    private static final SubLString $ic231$;
    private static final SubLString $ic232$;
    private static final SubLString $ic233$;
    private static final SubLSymbol $ic234$;
    private static final SubLString $ic235$;
    private static final SubLString $ic236$;
    private static final SubLString $ic237$;
    private static final SubLList $ic238$;
    private static final SubLSymbol $ic239$;
    private static final SubLSymbol $ic240$;
    private static final SubLSymbol $ic241$;
    private static final SubLSymbol $ic242$;
    private static final SubLSymbol $ic243$;
    private static final SubLSymbol $ic244$;
    private static final SubLList $ic245$;
    private static final SubLSymbol $ic246$;
    private static final SubLSymbol $ic247$;
    private static final SubLSymbol $ic248$;
    private static final SubLSymbol $ic249$;
    private static final SubLSymbol $ic250$;
    private static final SubLSymbol $ic251$;
    private static final SubLSymbol $ic252$;
    private static final SubLSymbol $ic253$;
    private static final SubLSymbol $ic254$;
    private static final SubLSymbol $ic255$;
    private static final SubLSymbol $ic256$;
    private static final SubLSymbol $ic257$;
    private static final SubLSymbol $ic258$;
    private static final SubLSymbol $ic259$;
    private static final SubLList $ic260$;
    private static final SubLList $ic261$;
    private static final SubLSymbol $ic262$;
    private static final SubLSymbol $ic263$;
    private static final SubLSymbol $ic264$;
    private static final SubLList $ic265$;
    private static final SubLSymbol $ic266$;
    private static final SubLSymbol $ic267$;
    private static final SubLList $ic268$;
    private static final SubLSymbol $ic269$;
    private static final SubLSymbol $ic270$;
    private static final SubLList $ic271$;
    private static final SubLList $ic272$;
    private static final SubLSymbol $ic273$;
    private static final SubLSymbol $ic274$;
    private static final SubLSymbol $ic275$;
    private static final SubLString $ic276$;
    private static final SubLList $ic277$;
    private static final SubLString $ic278$;
    private static final SubLSymbol $ic279$;
    private static final SubLList $ic280$;
    private static final SubLList $ic281$;
    private static final SubLSymbol $ic282$;
    private static final SubLList $ic283$;
    private static final SubLSymbol $ic284$;
    private static final SubLList $ic285$;
    private static final SubLSymbol $ic286$;
    private static final SubLSymbol $ic287$;
    private static final SubLList $ic288$;
    private static final SubLSymbol $ic289$;
    private static final SubLSymbol $ic290$;
    private static final SubLSymbol $ic291$;
    private static final SubLList $ic292$;
    private static final SubLString $ic293$;
    private static final SubLSymbol $ic294$;
    private static final SubLSymbol $ic295$;
    private static final SubLSymbol $ic296$;
    private static final SubLString $ic297$;
    private static final SubLString $ic298$;
    private static final SubLString $ic299$;
    private static final SubLSymbol $ic300$;
    private static final SubLSymbol $ic301$;
    private static final SubLSymbol $ic302$;
    private static final SubLSymbol $ic303$;
    private static final SubLList $ic304$;
    private static final SubLSymbol $ic305$;
    private static final SubLString $ic306$;
    private static final SubLString $ic307$;
    private static final SubLSymbol $ic308$;
    private static final SubLString $ic309$;
    private static final SubLString $ic310$;
    private static final SubLSymbol $ic311$;
    private static final SubLSymbol $ic312$;
    private static final SubLSymbol $ic313$;
    private static final SubLInteger $ic314$;
    private static final SubLSymbol $ic315$;
    private static final SubLSymbol $ic316$;
    private static final SubLSymbol $ic317$;
    private static final SubLSymbol $ic318$;
    private static final SubLString $ic319$;
    private static final SubLString $ic320$;
    private static final SubLSymbol $ic321$;
    private static final SubLString $ic322$;
    private static final SubLString $ic323$;
    private static final SubLSymbol $ic324$;
    private static final SubLSymbol $ic325$;
    private static final SubLList $ic326$;
    private static final SubLList $ic327$;
    private static final SubLList $ic328$;
    private static final SubLList $ic329$;
    private static final SubLSymbol $ic330$;
    private static final SubLSymbol $ic331$;
    private static final SubLList $ic332$;
    private static final SubLSymbol $ic333$;
    private static final SubLSymbol $ic334$;
    private static final SubLSymbol $ic335$;
    private static final SubLSymbol $ic336$;
    private static final SubLSymbol $ic337$;
    private static final SubLSymbol $ic338$;
    private static final SubLSymbol $ic339$;
    private static final SubLString $ic340$;
    private static final SubLString $ic341$;
    private static final SubLString $ic342$;
    private static final SubLString $ic343$;
    private static final SubLString $ic344$;
    private static final SubLString $ic345$;
    private static final SubLString $ic346$;
    private static final SubLInteger $ic347$;
    private static final SubLString $ic348$;
    private static final SubLString $ic349$;
    private static final SubLString $ic350$;
    private static final SubLString $ic351$;
    private static final SubLString $ic352$;
    private static final SubLString $ic353$;
    private static final SubLInteger $ic354$;
    private static final SubLList $ic355$;
    private static final SubLSymbol $ic356$;
    private static final SubLSymbol $ic357$;
    private static final SubLSymbol $ic358$;
    private static final SubLSymbol $ic359$;
    private static final SubLString $ic360$;
    private static final SubLSymbol $ic361$;
    private static final SubLString $ic362$;
    private static final SubLString $ic363$;
    private static final SubLString $ic364$;
    private static final SubLString $ic365$;
    private static final SubLString $ic366$;
    private static final SubLSymbol $ic367$;
    private static final SubLList $ic368$;
    private static final SubLSymbol $ic369$;
    private static final SubLSymbol $ic370$;
    private static final SubLSymbol $ic371$;
    private static final SubLSymbol $ic372$;
    private static final SubLInteger $ic373$;
    private static final SubLInteger $ic374$;
    private static final SubLInteger $ic375$;
    private static final SubLInteger $ic376$;
    private static final SubLInteger $ic377$;
    private static final SubLInteger $ic378$;
    private static final SubLInteger $ic379$;
    private static final SubLInteger $ic380$;
    private static final SubLString $ic381$;
    private static final SubLString $ic382$;
    private static final SubLSymbol $ic383$;
    private static final SubLString $ic384$;
    private static final SubLSymbol $ic385$;
    private static final SubLSymbol $ic386$;
    private static final SubLSymbol $ic387$;
    private static final SubLString $ic388$;
    private static final SubLSymbol $ic389$;
    private static final SubLSymbol $ic390$;
    private static final SubLList $ic391$;
    private static final SubLList $ic392$;
    private static final SubLList $ic393$;
    private static final SubLList $ic394$;
    private static final SubLSymbol $ic395$;
    private static final SubLList $ic396$;
    private static final SubLSymbol $ic397$;
    private static final SubLSymbol $ic398$;
    private static final SubLSymbol $ic399$;
    private static final SubLSymbol $ic400$;
    private static final SubLSymbol $ic401$;
    private static final SubLSymbol $ic402$;
    private static final SubLSymbol $ic403$;
    private static final SubLSymbol $ic404$;
    private static final SubLSymbol $ic405$;
    private static final SubLSymbol $ic406$;
    private static final SubLSymbol $ic407$;
    private static final SubLSymbol $ic408$;
    private static final SubLSymbol $ic409$;
    private static final SubLSymbol $ic410$;
    private static final SubLInteger $ic411$;
    private static final SubLSymbol $ic412$;
    private static final SubLString $ic413$;
    private static final SubLList $ic414$;
    private static final SubLString $ic415$;
    private static final SubLSymbol $ic416$;
    private static final SubLSymbol $ic417$;
    private static final SubLString $ic418$;
    private static final SubLString $ic419$;
    private static final SubLString $ic420$;
    private static final SubLString $ic421$;
    private static final SubLString $ic422$;
    private static final SubLString $ic423$;
    private static final SubLString $ic424$;
    private static final SubLString $ic425$;
    private static final SubLString $ic426$;
    private static final SubLSymbol $ic427$;
    private static final SubLSymbol $ic428$;
    private static final SubLSymbol $ic429$;
    private static final SubLList $ic430$;
    private static final SubLList $ic431$;
    private static final SubLList $ic432$;
    private static final SubLList $ic433$;
    private static final SubLSymbol $ic434$;
    private static final SubLList $ic435$;
    private static final SubLSymbol $ic436$;
    private static final SubLSymbol $ic437$;
    private static final SubLSymbol $ic438$;
    private static final SubLSymbol $ic439$;
    private static final SubLSymbol $ic440$;
    private static final SubLSymbol $ic441$;
    private static final SubLSymbol $ic442$;
    private static final SubLSymbol $ic443$;
    private static final SubLSymbol $ic444$;
    private static final SubLSymbol $ic445$;
    private static final SubLString $ic446$;
    private static final SubLString $ic447$;
    private static final SubLSymbol $ic448$;
    private static final SubLString $ic449$;
    private static final SubLString $ic450$;
    private static final SubLString $ic451$;
    private static final SubLString $ic452$;
    private static final SubLString $ic453$;
    private static final SubLString $ic454$;
    private static final SubLString $ic455$;
    private static final SubLSymbol $ic456$;
    private static final SubLSymbol $ic457$;
    private static final SubLSymbol $ic458$;
    private static final SubLSymbol $ic459$;
    private static final SubLSymbol $ic460$;
    private static final SubLList $ic461$;
    private static final SubLString $ic462$;
    private static final SubLString $ic463$;
    private static final SubLString $ic464$;
    private static final SubLString $ic465$;
    private static final SubLSymbol $ic466$;
    private static final SubLList $ic467$;
    private static final SubLSymbol $ic468$;
    private static final SubLSymbol $ic469$;
    private static final SubLSymbol $ic470$;
    private static final SubLSymbol $ic471$;
    private static final SubLSymbol $ic472$;
    private static final SubLList $ic473$;
    private static final SubLSymbol $ic474$;
    private static final SubLSymbol $ic475$;
    private static final SubLSymbol $ic476$;
    private static final SubLSymbol $ic477$;
    private static final SubLString $ic478$;
    private static final SubLString $ic479$;
    private static final SubLString $ic480$;
    private static final SubLString $ic481$;
    private static final SubLString $ic482$;
    private static final SubLSymbol $ic483$;
    private static final SubLSymbol $ic484$;
    private static final SubLSymbol $ic485$;
    private static final SubLSymbol $ic486$;
    private static final SubLSymbol $ic487$;
    private static final SubLSymbol $ic488$;
    private static final SubLSymbol $ic489$;
    private static final SubLSymbol $ic490$;
    private static final SubLSymbol $ic491$;
    private static final SubLList $ic492$;
    private static final SubLSymbol $ic493$;
    private static final SubLList $ic494$;
    private static final SubLList $ic495$;
    private static final SubLSymbol $ic496$;
    private static final SubLSymbol $ic497$;
    private static final SubLSymbol $ic498$;
    private static final SubLSymbol $ic499$;
    private static final SubLSymbol $ic500$;
    private static final SubLSymbol $ic501$;
    private static final SubLSymbol $ic502$;
    private static final SubLSymbol $ic503$;
    private static final SubLList $ic504$;
    private static final SubLList $ic505$;
    private static final SubLSymbol $ic506$;
    private static final SubLSymbol $ic507$;
    private static final SubLSymbol $ic508$;
    private static final SubLList $ic509$;
    private static final SubLList $ic510$;
    private static final SubLSymbol $ic511$;
    private static final SubLSymbol $ic512$;
    private static final SubLSymbol $ic513$;
    private static final SubLSymbol $ic514$;
    private static final SubLSymbol $ic515$;
    private static final SubLList $ic516$;
    private static final SubLString $ic517$;
    private static final SubLSymbol $ic518$;
    private static final SubLSymbol $ic519$;
    private static final SubLString $ic520$;
    private static final SubLString $ic521$;
    private static final SubLList $ic522$;
    private static final SubLString $ic523$;
    private static final SubLString $ic524$;
    private static final SubLString $ic525$;
    private static final SubLString $ic526$;
    private static final SubLString $ic527$;
    private static final SubLString $ic528$;
    private static final SubLSymbol $ic529$;
    private static final SubLList $ic530$;
    private static final SubLSymbol $ic531$;
    
    public static SubLObject f6456(final SubLObject var1, final SubLObject var2) {
        compatibility.default_struct_print_function(var1, var2, (SubLObject)ZERO_INTEGER);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f6457(final SubLObject var1) {
        return (SubLObject)((var1.getClass() == $sX8138_native.class) ? T : NIL);
    }
    
    public static SubLObject f6458(final SubLObject var1) {
        assert NIL != f6457(var1) : var1;
        return var1.getField2();
    }
    
    public static SubLObject f6459(final SubLObject var1) {
        assert NIL != f6457(var1) : var1;
        return var1.getField3();
    }
    
    public static SubLObject f6460(final SubLObject var1) {
        assert NIL != f6457(var1) : var1;
        return var1.getField4();
    }
    
    public static SubLObject f6461(final SubLObject var1) {
        assert NIL != f6457(var1) : var1;
        return var1.getField5();
    }
    
    public static SubLObject f6462(final SubLObject var1) {
        assert NIL != f6457(var1) : var1;
        return var1.getField6();
    }
    
    public static SubLObject f6463(final SubLObject var1) {
        assert NIL != f6457(var1) : var1;
        return var1.getField7();
    }
    
    public static SubLObject f6464(final SubLObject var1) {
        assert NIL != f6457(var1) : var1;
        return var1.getField8();
    }
    
    public static SubLObject f6465(final SubLObject var1) {
        assert NIL != f6457(var1) : var1;
        return var1.getField9();
    }
    
    public static SubLObject f6466(final SubLObject var1) {
        assert NIL != f6457(var1) : var1;
        return var1.getField10();
    }
    
    public static SubLObject f6467(final SubLObject var1) {
        assert NIL != f6457(var1) : var1;
        return var1.getField11();
    }
    
    public static SubLObject f6468(final SubLObject var1) {
        assert NIL != f6457(var1) : var1;
        return var1.getField12();
    }
    
    public static SubLObject f6469(final SubLObject var1) {
        assert NIL != f6457(var1) : var1;
        return var1.getField13();
    }
    
    public static SubLObject f6470(final SubLObject var1) {
        assert NIL != f6457(var1) : var1;
        return var1.getField14();
    }
    
    public static SubLObject f6471(final SubLObject var1, final SubLObject var4) {
        assert NIL != f6457(var1) : var1;
        return var1.setField2(var4);
    }
    
    public static SubLObject f6472(final SubLObject var1, final SubLObject var4) {
        assert NIL != f6457(var1) : var1;
        return var1.setField3(var4);
    }
    
    public static SubLObject f6473(final SubLObject var1, final SubLObject var4) {
        assert NIL != f6457(var1) : var1;
        return var1.setField4(var4);
    }
    
    public static SubLObject f6474(final SubLObject var1, final SubLObject var4) {
        assert NIL != f6457(var1) : var1;
        return var1.setField5(var4);
    }
    
    public static SubLObject f6475(final SubLObject var1, final SubLObject var4) {
        assert NIL != f6457(var1) : var1;
        return var1.setField6(var4);
    }
    
    public static SubLObject f6476(final SubLObject var1, final SubLObject var4) {
        assert NIL != f6457(var1) : var1;
        return var1.setField7(var4);
    }
    
    public static SubLObject f6477(final SubLObject var1, final SubLObject var4) {
        assert NIL != f6457(var1) : var1;
        return var1.setField8(var4);
    }
    
    public static SubLObject f6478(final SubLObject var1, final SubLObject var4) {
        assert NIL != f6457(var1) : var1;
        return var1.setField9(var4);
    }
    
    public static SubLObject f6479(final SubLObject var1, final SubLObject var4) {
        assert NIL != f6457(var1) : var1;
        return var1.setField10(var4);
    }
    
    public static SubLObject f6480(final SubLObject var1, final SubLObject var4) {
        assert NIL != f6457(var1) : var1;
        return var1.setField11(var4);
    }
    
    public static SubLObject f6481(final SubLObject var1, final SubLObject var4) {
        assert NIL != f6457(var1) : var1;
        return var1.setField12(var4);
    }
    
    public static SubLObject f6482(final SubLObject var1, final SubLObject var4) {
        assert NIL != f6457(var1) : var1;
        return var1.setField13(var4);
    }
    
    public static SubLObject f6483(final SubLObject var1, final SubLObject var4) {
        assert NIL != f6457(var1) : var1;
        return var1.setField14(var4);
    }
    
    public static SubLObject f6484(SubLObject var5) {
        if (var5 == UNPROVIDED) {
            var5 = (SubLObject)NIL;
        }
        final SubLObject var6 = (SubLObject)new $sX8138_native();
        SubLObject var7;
        SubLObject var8;
        SubLObject var9;
        SubLObject var10;
        for (var7 = (SubLObject)NIL, var7 = var5; NIL != var7; var7 = conses_high.cddr(var7)) {
            var8 = var7.first();
            var9 = conses_high.cadr(var7);
            var10 = var8;
            if (var10.eql((SubLObject)$ic35$)) {
                f6471(var6, var9);
            }
            else if (var10.eql((SubLObject)$ic36$)) {
                f6472(var6, var9);
            }
            else if (var10.eql((SubLObject)$ic37$)) {
                f6473(var6, var9);
            }
            else if (var10.eql((SubLObject)$ic38$)) {
                f6474(var6, var9);
            }
            else if (var10.eql((SubLObject)$ic39$)) {
                f6475(var6, var9);
            }
            else if (var10.eql((SubLObject)$ic40$)) {
                f6476(var6, var9);
            }
            else if (var10.eql((SubLObject)$ic41$)) {
                f6477(var6, var9);
            }
            else if (var10.eql((SubLObject)$ic42$)) {
                f6478(var6, var9);
            }
            else if (var10.eql((SubLObject)$ic43$)) {
                f6479(var6, var9);
            }
            else if (var10.eql((SubLObject)$ic44$)) {
                f6480(var6, var9);
            }
            else if (var10.eql((SubLObject)$ic45$)) {
                f6481(var6, var9);
            }
            else if (var10.eql((SubLObject)$ic46$)) {
                f6482(var6, var9);
            }
            else if (var10.eql((SubLObject)$ic47$)) {
                f6483(var6, var9);
            }
            else {
                Errors.error((SubLObject)$ic48$, var8);
            }
        }
        return var6;
    }
    
    public static SubLObject f6485(final SubLObject var11, final SubLObject var12) {
        Functions.funcall(var12, var11, (SubLObject)$ic49$, (SubLObject)$ic50$, (SubLObject)THIRTEEN_INTEGER);
        Functions.funcall(var12, var11, (SubLObject)$ic51$, (SubLObject)$ic35$, f6458(var11));
        Functions.funcall(var12, var11, (SubLObject)$ic51$, (SubLObject)$ic36$, f6459(var11));
        Functions.funcall(var12, var11, (SubLObject)$ic51$, (SubLObject)$ic37$, f6460(var11));
        Functions.funcall(var12, var11, (SubLObject)$ic51$, (SubLObject)$ic38$, f6461(var11));
        Functions.funcall(var12, var11, (SubLObject)$ic51$, (SubLObject)$ic39$, f6462(var11));
        Functions.funcall(var12, var11, (SubLObject)$ic51$, (SubLObject)$ic40$, f6463(var11));
        Functions.funcall(var12, var11, (SubLObject)$ic51$, (SubLObject)$ic41$, f6464(var11));
        Functions.funcall(var12, var11, (SubLObject)$ic51$, (SubLObject)$ic42$, f6465(var11));
        Functions.funcall(var12, var11, (SubLObject)$ic51$, (SubLObject)$ic43$, f6466(var11));
        Functions.funcall(var12, var11, (SubLObject)$ic51$, (SubLObject)$ic44$, f6467(var11));
        Functions.funcall(var12, var11, (SubLObject)$ic51$, (SubLObject)$ic45$, f6468(var11));
        Functions.funcall(var12, var11, (SubLObject)$ic51$, (SubLObject)$ic46$, f6469(var11));
        Functions.funcall(var12, var11, (SubLObject)$ic51$, (SubLObject)$ic47$, f6470(var11));
        Functions.funcall(var12, var11, (SubLObject)$ic52$, (SubLObject)$ic50$, (SubLObject)THIRTEEN_INTEGER);
        return var11;
    }
    
    public static SubLObject f6486(final SubLObject var11, final SubLObject var12) {
        return f6485(var11, var12);
    }
    
    public static SubLObject f6487(final SubLObject var13, SubLObject var2) {
        if (var2 == UNPROVIDED) {
            var2 = (SubLObject)T;
        }
        PrintLow.format(var2, (SubLObject)$ic54$, f6458(var13), f6460(var13));
        PrintLow.format(var2, (SubLObject)$ic55$, f6466(var13));
        f6488(f6459(var13), var2);
        PrintLow.format(var2, (SubLObject)$ic56$, new SubLObject[] { f6461(var13), f6462(var13), f6463(var13) });
        PrintLow.format(var2, (SubLObject)$ic57$, f6464(var13), f6465(var13));
        PrintLow.format(var2, (SubLObject)$ic58$, f6467(var13));
        PrintLow.format(var2, (SubLObject)$ic59$, f6468(var13), f6469(var13));
        PrintLow.format(var2, (SubLObject)$ic60$, f6470(var13));
        return var13;
    }
    
    public static SubLObject f6489(final SubLObject var14) {
        return (SubLObject)makeBoolean(NIL != f6457(var14) && NIL != f6490(var14));
    }
    
    public static SubLObject f6491(final SubLObject var14) {
        return (SubLObject)makeBoolean(NIL != f6457(var14) && NIL == f6490(var14));
    }
    
    public static SubLObject f6490(final SubLObject var13) {
        assert NIL != f6457(var13) : var13;
        final SubLObject var14 = f6458(var13);
        return (SubLObject)makeBoolean(NIL == streams_high.output_stream_p(var14));
    }
    
    public static SubLObject f6492(final SubLObject var13) {
        assert NIL != f6457(var13) : var13;
        return module0038.f2624(Filesys.probe_file(f6458(var13)));
    }
    
    public static SubLObject f6493(final SubLObject var13) {
        assert NIL != f6457(var13) : var13;
        final SubLObject var14 = f6461(var13);
        final SubLObject var15 = f6462(var13);
        final SubLObject var16 = f6463(var13);
        final SubLObject var17 = f6467(var13);
        final SubLObject var18 = f6464(var13);
        final SubLObject var19 = f6465(var13);
        return f6494(var14, var15, var16, var17, var18, var19);
    }
    
    public static SubLObject f6495(final SubLObject var13, final SubLObject var22) {
        final SubLObject var23 = f6460(var13);
        SubLObject var24 = (SubLObject)NIL;
        try {
            var24 = Locks.seize_lock(var23);
            f6471(var13, module0075.f5279(f6458(var13), var22));
        }
        finally {
            if (NIL != var24) {
                Locks.release_lock(var23);
            }
        }
        return var13;
    }
    
    public static SubLObject f6496(final SubLObject var13) {
        final SubLObject var14 = f6460(var13);
        SubLObject var15 = (SubLObject)NIL;
        try {
            var15 = Locks.seize_lock(var14);
            f6471(var13, module0075.f5283(f6458(var13)));
        }
        finally {
            if (NIL != var15) {
                Locks.release_lock(var14);
            }
        }
        return var13;
    }
    
    public static SubLObject f6497(final SubLObject var13) {
        SubLObject var14 = (SubLObject)NIL;
        final SubLObject var15 = f6460(var13);
        SubLObject var16 = (SubLObject)NIL;
        try {
            var16 = Locks.seize_lock(var15);
            var14 = module0075.f5282(f6458(var13));
        }
        finally {
            if (NIL != var16) {
                Locks.release_lock(var15);
            }
        }
        return var14;
    }
    
    public static SubLObject f6498(final SubLObject var1, final SubLObject var2) {
        compatibility.default_struct_print_function(var1, var2, (SubLObject)ZERO_INTEGER);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f6499(final SubLObject var1) {
        return (SubLObject)((var1.getClass() == $sX8140_native.class) ? T : NIL);
    }
    
    public static SubLObject f6500(final SubLObject var1) {
        assert NIL != f6499(var1) : var1;
        return var1.getField2();
    }
    
    public static SubLObject f6501(final SubLObject var1) {
        assert NIL != f6499(var1) : var1;
        return var1.getField3();
    }
    
    public static SubLObject f6502(final SubLObject var1) {
        assert NIL != f6499(var1) : var1;
        return var1.getField4();
    }
    
    public static SubLObject f6503(final SubLObject var1) {
        assert NIL != f6499(var1) : var1;
        return var1.getField5();
    }
    
    public static SubLObject f6504(final SubLObject var1) {
        assert NIL != f6499(var1) : var1;
        return var1.getField6();
    }
    
    public static SubLObject f6505(final SubLObject var1) {
        assert NIL != f6499(var1) : var1;
        return var1.getField7();
    }
    
    public static SubLObject f6506(final SubLObject var1) {
        assert NIL != f6499(var1) : var1;
        return var1.getField8();
    }
    
    public static SubLObject f6507(final SubLObject var1) {
        assert NIL != f6499(var1) : var1;
        return var1.getField9();
    }
    
    public static SubLObject f6508(final SubLObject var1) {
        assert NIL != f6499(var1) : var1;
        return var1.getField10();
    }
    
    public static SubLObject f6509(final SubLObject var1) {
        assert NIL != f6499(var1) : var1;
        return var1.getField11();
    }
    
    public static SubLObject f6510(final SubLObject var1) {
        assert NIL != f6499(var1) : var1;
        return var1.getField12();
    }
    
    public static SubLObject f6511(final SubLObject var1) {
        assert NIL != f6499(var1) : var1;
        return var1.getField13();
    }
    
    public static SubLObject f6512(final SubLObject var1) {
        assert NIL != f6499(var1) : var1;
        return var1.getField14();
    }
    
    public static SubLObject f6513(final SubLObject var1, final SubLObject var4) {
        assert NIL != f6499(var1) : var1;
        return var1.setField2(var4);
    }
    
    public static SubLObject f6514(final SubLObject var1, final SubLObject var4) {
        assert NIL != f6499(var1) : var1;
        return var1.setField3(var4);
    }
    
    public static SubLObject f6515(final SubLObject var1, final SubLObject var4) {
        assert NIL != f6499(var1) : var1;
        return var1.setField4(var4);
    }
    
    public static SubLObject f6516(final SubLObject var1, final SubLObject var4) {
        assert NIL != f6499(var1) : var1;
        return var1.setField5(var4);
    }
    
    public static SubLObject f6517(final SubLObject var1, final SubLObject var4) {
        assert NIL != f6499(var1) : var1;
        return var1.setField6(var4);
    }
    
    public static SubLObject f6518(final SubLObject var1, final SubLObject var4) {
        assert NIL != f6499(var1) : var1;
        return var1.setField7(var4);
    }
    
    public static SubLObject f6519(final SubLObject var1, final SubLObject var4) {
        assert NIL != f6499(var1) : var1;
        return var1.setField8(var4);
    }
    
    public static SubLObject f6520(final SubLObject var1, final SubLObject var4) {
        assert NIL != f6499(var1) : var1;
        return var1.setField9(var4);
    }
    
    public static SubLObject f6521(final SubLObject var1, final SubLObject var4) {
        assert NIL != f6499(var1) : var1;
        return var1.setField10(var4);
    }
    
    public static SubLObject f6522(final SubLObject var1, final SubLObject var4) {
        assert NIL != f6499(var1) : var1;
        return var1.setField11(var4);
    }
    
    public static SubLObject f6523(final SubLObject var1, final SubLObject var4) {
        assert NIL != f6499(var1) : var1;
        return var1.setField12(var4);
    }
    
    public static SubLObject f6524(final SubLObject var1, final SubLObject var4) {
        assert NIL != f6499(var1) : var1;
        return var1.setField13(var4);
    }
    
    public static SubLObject f6525(final SubLObject var1, final SubLObject var4) {
        assert NIL != f6499(var1) : var1;
        return var1.setField14(var4);
    }
    
    public static SubLObject f6526(SubLObject var5) {
        if (var5 == UNPROVIDED) {
            var5 = (SubLObject)NIL;
        }
        final SubLObject var6 = (SubLObject)new $sX8140_native();
        SubLObject var7;
        SubLObject var8;
        SubLObject var9;
        SubLObject var10;
        for (var7 = (SubLObject)NIL, var7 = var5; NIL != var7; var7 = conses_high.cddr(var7)) {
            var8 = var7.first();
            var9 = conses_high.cadr(var7);
            var10 = var8;
            if (var10.eql((SubLObject)$ic95$)) {
                f6513(var6, var9);
            }
            else if (var10.eql((SubLObject)$ic96$)) {
                f6514(var6, var9);
            }
            else if (var10.eql((SubLObject)$ic97$)) {
                f6515(var6, var9);
            }
            else if (var10.eql((SubLObject)$ic98$)) {
                f6516(var6, var9);
            }
            else if (var10.eql((SubLObject)$ic99$)) {
                f6517(var6, var9);
            }
            else if (var10.eql((SubLObject)$ic100$)) {
                f6518(var6, var9);
            }
            else if (var10.eql((SubLObject)$ic101$)) {
                f6519(var6, var9);
            }
            else if (var10.eql((SubLObject)$ic102$)) {
                f6520(var6, var9);
            }
            else if (var10.eql((SubLObject)$ic103$)) {
                f6521(var6, var9);
            }
            else if (var10.eql((SubLObject)$ic104$)) {
                f6522(var6, var9);
            }
            else if (var10.eql((SubLObject)$ic105$)) {
                f6523(var6, var9);
            }
            else if (var10.eql((SubLObject)$ic106$)) {
                f6524(var6, var9);
            }
            else if (var10.eql((SubLObject)$ic107$)) {
                f6525(var6, var9);
            }
            else {
                Errors.error((SubLObject)$ic48$, var8);
            }
        }
        return var6;
    }
    
    public static SubLObject f6527(final SubLObject var11, final SubLObject var12) {
        Functions.funcall(var12, var11, (SubLObject)$ic49$, (SubLObject)$ic108$, (SubLObject)THIRTEEN_INTEGER);
        Functions.funcall(var12, var11, (SubLObject)$ic51$, (SubLObject)$ic95$, f6500(var11));
        Functions.funcall(var12, var11, (SubLObject)$ic51$, (SubLObject)$ic96$, f6501(var11));
        Functions.funcall(var12, var11, (SubLObject)$ic51$, (SubLObject)$ic97$, f6502(var11));
        Functions.funcall(var12, var11, (SubLObject)$ic51$, (SubLObject)$ic98$, f6503(var11));
        Functions.funcall(var12, var11, (SubLObject)$ic51$, (SubLObject)$ic99$, f6504(var11));
        Functions.funcall(var12, var11, (SubLObject)$ic51$, (SubLObject)$ic100$, f6505(var11));
        Functions.funcall(var12, var11, (SubLObject)$ic51$, (SubLObject)$ic101$, f6506(var11));
        Functions.funcall(var12, var11, (SubLObject)$ic51$, (SubLObject)$ic102$, f6507(var11));
        Functions.funcall(var12, var11, (SubLObject)$ic51$, (SubLObject)$ic103$, f6508(var11));
        Functions.funcall(var12, var11, (SubLObject)$ic51$, (SubLObject)$ic104$, f6509(var11));
        Functions.funcall(var12, var11, (SubLObject)$ic51$, (SubLObject)$ic105$, f6510(var11));
        Functions.funcall(var12, var11, (SubLObject)$ic51$, (SubLObject)$ic106$, f6511(var11));
        Functions.funcall(var12, var11, (SubLObject)$ic51$, (SubLObject)$ic107$, f6512(var11));
        Functions.funcall(var12, var11, (SubLObject)$ic52$, (SubLObject)$ic108$, (SubLObject)THIRTEEN_INTEGER);
        return var11;
    }
    
    public static SubLObject f6528(final SubLObject var11, final SubLObject var12) {
        return f6527(var11, var12);
    }
    
    public static SubLObject f6488(final SubLObject var33, SubLObject var2) {
        if (var2 == UNPROVIDED) {
            var2 = (SubLObject)T;
        }
        PrintLow.format(var2, (SubLObject)$ic110$, new SubLObject[] { f6500(var33), f6501(var33), f6502(var33) });
        PrintLow.format(var2, (SubLObject)$ic111$, new SubLObject[] { f6503(var33), f6503(var33), f6504(var33), f6504(var33), f6505(var33), f6505(var33) });
        PrintLow.format(var2, (SubLObject)$ic112$, f6506(var33), f6507(var33));
        if (NIL != f6508(var33)) {
            PrintLow.format(var2, (SubLObject)$ic113$, f6508(var33));
        }
        else {
            streams_high.write_string((SubLObject)$ic114$, var2, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        }
        if (NIL != f6509(var33)) {
            PrintLow.format(var2, (SubLObject)$ic115$, f6509(var33));
        }
        else {
            streams_high.write_string((SubLObject)$ic116$, var2, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        }
        if (NIL != f6510(var33)) {
            PrintLow.format(var2, (SubLObject)$ic117$, f6510(var33));
        }
        else {
            streams_high.write_string((SubLObject)$ic118$, var2, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        }
        streams_high.terpri(var2);
        PrintLow.format(var2, (SubLObject)$ic119$, f6511(var33), f6512(var33));
        streams_high.write_string((SubLObject)$ic120$, var2, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        return var33;
    }
    
    public static SubLObject f6529(final SubLObject var1, final SubLObject var2) {
        compatibility.default_struct_print_function(var1, var2, (SubLObject)ZERO_INTEGER);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f6530(final SubLObject var1) {
        return (SubLObject)((var1.getClass() == $sX8142_native.class) ? T : NIL);
    }
    
    public static SubLObject f6531(final SubLObject var1) {
        assert NIL != f6530(var1) : var1;
        return var1.getField2();
    }
    
    public static SubLObject f6532(final SubLObject var1) {
        assert NIL != f6530(var1) : var1;
        return var1.getField3();
    }
    
    public static SubLObject f6533(final SubLObject var1) {
        assert NIL != f6530(var1) : var1;
        return var1.getField4();
    }
    
    public static SubLObject f6534(final SubLObject var1) {
        assert NIL != f6530(var1) : var1;
        return var1.getField5();
    }
    
    public static SubLObject f6535(final SubLObject var1) {
        assert NIL != f6530(var1) : var1;
        return var1.getField6();
    }
    
    public static SubLObject f6536(final SubLObject var1) {
        assert NIL != f6530(var1) : var1;
        return var1.getField7();
    }
    
    public static SubLObject f6537(final SubLObject var1, final SubLObject var4) {
        assert NIL != f6530(var1) : var1;
        return var1.setField2(var4);
    }
    
    public static SubLObject f6538(final SubLObject var1, final SubLObject var4) {
        assert NIL != f6530(var1) : var1;
        return var1.setField3(var4);
    }
    
    public static SubLObject f6539(final SubLObject var1, final SubLObject var4) {
        assert NIL != f6530(var1) : var1;
        return var1.setField4(var4);
    }
    
    public static SubLObject f6540(final SubLObject var1, final SubLObject var4) {
        assert NIL != f6530(var1) : var1;
        return var1.setField5(var4);
    }
    
    public static SubLObject f6541(final SubLObject var1, final SubLObject var4) {
        assert NIL != f6530(var1) : var1;
        return var1.setField6(var4);
    }
    
    public static SubLObject f6542(final SubLObject var1, final SubLObject var4) {
        assert NIL != f6530(var1) : var1;
        return var1.setField7(var4);
    }
    
    public static SubLObject f6543(SubLObject var5) {
        if (var5 == UNPROVIDED) {
            var5 = (SubLObject)NIL;
        }
        final SubLObject var6 = (SubLObject)new $sX8142_native();
        SubLObject var7;
        SubLObject var8;
        SubLObject var9;
        SubLObject var10;
        for (var7 = (SubLObject)NIL, var7 = var5; NIL != var7; var7 = conses_high.cddr(var7)) {
            var8 = var7.first();
            var9 = conses_high.cadr(var7);
            var10 = var8;
            if (var10.eql((SubLObject)$ic95$)) {
                f6537(var6, var9);
            }
            else if (var10.eql((SubLObject)$ic141$)) {
                f6538(var6, var9);
            }
            else if (var10.eql((SubLObject)$ic142$)) {
                f6539(var6, var9);
            }
            else if (var10.eql((SubLObject)$ic143$)) {
                f6540(var6, var9);
            }
            else if (var10.eql((SubLObject)$ic144$)) {
                f6541(var6, var9);
            }
            else if (var10.eql((SubLObject)$ic145$)) {
                f6542(var6, var9);
            }
            else {
                Errors.error((SubLObject)$ic48$, var8);
            }
        }
        return var6;
    }
    
    public static SubLObject f6544(final SubLObject var11, final SubLObject var12) {
        Functions.funcall(var12, var11, (SubLObject)$ic49$, (SubLObject)$ic146$, (SubLObject)SIX_INTEGER);
        Functions.funcall(var12, var11, (SubLObject)$ic51$, (SubLObject)$ic95$, f6531(var11));
        Functions.funcall(var12, var11, (SubLObject)$ic51$, (SubLObject)$ic141$, f6532(var11));
        Functions.funcall(var12, var11, (SubLObject)$ic51$, (SubLObject)$ic142$, f6533(var11));
        Functions.funcall(var12, var11, (SubLObject)$ic51$, (SubLObject)$ic143$, f6534(var11));
        Functions.funcall(var12, var11, (SubLObject)$ic51$, (SubLObject)$ic144$, f6535(var11));
        Functions.funcall(var12, var11, (SubLObject)$ic51$, (SubLObject)$ic145$, f6536(var11));
        Functions.funcall(var12, var11, (SubLObject)$ic52$, (SubLObject)$ic146$, (SubLObject)SIX_INTEGER);
        return var11;
    }
    
    public static SubLObject f6545(final SubLObject var11, final SubLObject var12) {
        return f6544(var11, var12);
    }
    
    public static SubLObject f6546(final SubLObject var1, final SubLObject var2) {
        compatibility.default_struct_print_function(var1, var2, (SubLObject)ZERO_INTEGER);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f6547(final SubLObject var1) {
        return (SubLObject)((var1.getClass() == $sX8144_native.class) ? T : NIL);
    }
    
    public static SubLObject f6548(final SubLObject var1) {
        assert NIL != f6547(var1) : var1;
        return var1.getField2();
    }
    
    public static SubLObject f6549(final SubLObject var1) {
        assert NIL != f6547(var1) : var1;
        return var1.getField3();
    }
    
    public static SubLObject f6550(final SubLObject var1, final SubLObject var4) {
        assert NIL != f6547(var1) : var1;
        return var1.setField2(var4);
    }
    
    public static SubLObject f6551(final SubLObject var1, final SubLObject var4) {
        assert NIL != f6547(var1) : var1;
        return var1.setField3(var4);
    }
    
    public static SubLObject f6552(SubLObject var5) {
        if (var5 == UNPROVIDED) {
            var5 = (SubLObject)NIL;
        }
        final SubLObject var6 = (SubLObject)new $sX8144_native();
        SubLObject var7;
        SubLObject var8;
        SubLObject var9;
        SubLObject var10;
        for (var7 = (SubLObject)NIL, var7 = var5; NIL != var7; var7 = conses_high.cddr(var7)) {
            var8 = var7.first();
            var9 = conses_high.cadr(var7);
            var10 = var8;
            if (var10.eql((SubLObject)$ic160$)) {
                f6550(var6, var9);
            }
            else if (var10.eql((SubLObject)$ic161$)) {
                f6551(var6, var9);
            }
            else {
                Errors.error((SubLObject)$ic48$, var8);
            }
        }
        return var6;
    }
    
    public static SubLObject f6553(final SubLObject var11, final SubLObject var12) {
        Functions.funcall(var12, var11, (SubLObject)$ic49$, (SubLObject)$ic162$, (SubLObject)TWO_INTEGER);
        Functions.funcall(var12, var11, (SubLObject)$ic51$, (SubLObject)$ic160$, f6548(var11));
        Functions.funcall(var12, var11, (SubLObject)$ic51$, (SubLObject)$ic161$, f6549(var11));
        Functions.funcall(var12, var11, (SubLObject)$ic52$, (SubLObject)$ic162$, (SubLObject)TWO_INTEGER);
        return var11;
    }
    
    public static SubLObject f6554(final SubLObject var11, final SubLObject var12) {
        return f6553(var11, var12);
    }
    
    public static SubLObject f6555() {
        return $g1214$.getGlobalValue();
    }
    
    public static SubLObject f6556() {
        return $g1215$.getGlobalValue();
    }
    
    public static SubLObject f6557() {
        final SubLObject var40 = f6526((SubLObject)UNPROVIDED);
        f6514(var40, $g1218$.getGlobalValue());
        f6515(var40, $g1219$.getGlobalValue());
        return var40;
    }
    
    public static SubLObject f6558(final SubLObject var41, SubLObject var42) {
        if (var42 == UNPROVIDED) {
            var42 = $g1222$.getGlobalValue();
        }
        final SubLObject var43 = f6559(var42);
        final SubLObject var44 = f6557();
        f6513(var44, $g1220$.getGlobalValue());
        f6519(var44, (SubLObject)ZERO_INTEGER);
        f6520(var44, f6560(var41));
        f6521(var44, (SubLObject)ZERO_INTEGER);
        f6522(var44, (SubLObject)ZERO_INTEGER);
        f6523(var44, (SubLObject)ZERO_INTEGER);
        f6524(var44, (SubLObject)ZERO_INTEGER);
        f6525(var44, (SubLObject)ZERO_INTEGER);
        SubLObject var45 = $g1220$.getGlobalValue();
        final SubLObject var46 = Numbers.multiply(var41, var43);
        var45 = Numbers.add(var45, f6511(var44));
        f6516(var44, var45);
        f6518(var44, var45);
        f6517(var44, Numbers.add(var45, var46));
        return var44;
    }
    
    public static SubLObject f6559(final SubLObject var42) {
        return Numbers.add(f6561(), var42);
    }
    
    public static SubLObject f6561() {
        return Numbers.add(f6562(), f6563());
    }
    
    public static SubLObject f6564(final SubLObject var16, final SubLObject var17, final SubLObject var18, final SubLObject var20, final SubLObject var21, SubLObject var46, SubLObject var47, SubLObject var19) {
        if (var46 == UNPROVIDED) {
            var46 = $g1216$.getDynamicValue();
        }
        if (var47 == UNPROVIDED) {
            var47 = $g1214$.getGlobalValue();
        }
        if (var19 == UNPROVIDED) {
            var19 = (SubLObject)$ic168$;
        }
        final SubLObject var48 = f6484((SubLObject)UNPROVIDED);
        f6471(var48, (SubLObject)NIL);
        f6472(var48, (SubLObject)NIL);
        f6473(var48, Locks.make_lock((SubLObject)$ic169$));
        f6474(var48, var16);
        f6475(var48, var17);
        f6476(var48, var18);
        f6479(var48, var47);
        f6480(var48, var19);
        f6477(var48, var20);
        f6478(var48, var21);
        if (NIL != var46) {
            f6565(var48, var46);
        }
        return var48;
    }
    
    public static SubLObject f6566(final SubLObject var44, final SubLObject var16, final SubLObject var17, final SubLObject var18, final SubLObject var20, final SubLObject var21, SubLObject var46, SubLObject var42, SubLObject var47, SubLObject var19) {
        if (var46 == UNPROVIDED) {
            var46 = $g1216$.getDynamicValue();
        }
        if (var42 == UNPROVIDED) {
            var42 = $g1222$.getGlobalValue();
        }
        if (var47 == UNPROVIDED) {
            var47 = $g1214$.getGlobalValue();
        }
        if (var19 == UNPROVIDED) {
            var19 = (SubLObject)$ic168$;
        }
        final SubLObject var48 = f6564(var16, var17, var18, var20, var21, var46, var47, var19);
        f6472(var48, f6558(var44, var42));
        return var48;
    }
    
    public static SubLObject f6567(final SubLObject var48, SubLObject var49) {
        if (var49 == UNPROVIDED) {
            var49 = (SubLObject)ZERO_INTEGER;
        }
        final SubLObject var50 = f6552((SubLObject)UNPROVIDED);
        f6550(var50, var49);
        f6551(var50, var48);
        return var50;
    }
    
    public static SubLObject f6568() {
        return f6567($g1225$.getGlobalValue(), $g1224$.getGlobalValue());
    }
    
    public static SubLObject f6569(final SubLObject var50) {
        return Equality.equalp(var50, $g1226$.getGlobalValue());
    }
    
    public static SubLObject f6570() {
        return f6567($g1225$.getGlobalValue(), $g1223$.getGlobalValue());
    }
    
    public static SubLObject f6571(final SubLObject var50) {
        return Equality.equalp(var50, $g1227$.getGlobalValue());
    }
    
    public static SubLObject f6572(final SubLObject var50, final SubLObject var13) {
        return (SubLObject)makeBoolean(NIL != f6571(var50) || (NIL != f6573(f6549(var50)) && NIL != f6574(f6548(var50), var13)));
    }
    
    public static SubLObject f6575(final SubLObject var13, final SubLObject var51) {
        final SubLObject var52 = f6467(var13);
        return f6576(var51, var52);
    }
    
    public static SubLObject f6576(final SubLObject var51, final SubLObject var19) {
        final SubLObject var52 = Numbers.abs(Functions.funcall(var19, var51));
        if (NIL == f6573(var52)) {
            Errors.warn((SubLObject)$ic170$, var51, var52);
        }
        return var52;
    }
    
    public static SubLObject f6573(final SubLObject var48) {
        return (SubLObject)makeBoolean(NIL != module0004.f106(var48) && var48.numL($g1228$.getGlobalValue()));
    }
    
    public static SubLObject f6577(final SubLObject var52, final SubLObject var14) {
        final SubLObject var53 = f6543((SubLObject)UNPROVIDED);
        f6540(var53, var52);
        f6542(var53, var14);
        return var53;
    }
    
    public static SubLObject f6578(final SubLObject var1, final SubLObject var2) {
        f6579(var1, var2, (SubLObject)ZERO_INTEGER);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f6580(final SubLObject var1) {
        return (SubLObject)((var1.getClass() == $sX8146_native.class) ? T : NIL);
    }
    
    public static SubLObject f6581(final SubLObject var1) {
        assert NIL != f6580(var1) : var1;
        return var1.getField2();
    }
    
    public static SubLObject f6582(final SubLObject var1) {
        assert NIL != f6580(var1) : var1;
        return var1.getField3();
    }
    
    public static SubLObject f6583(final SubLObject var1) {
        assert NIL != f6580(var1) : var1;
        return var1.getField4();
    }
    
    public static SubLObject f6584(final SubLObject var1) {
        assert NIL != f6580(var1) : var1;
        return var1.getField5();
    }
    
    public static SubLObject f6585(final SubLObject var1) {
        assert NIL != f6580(var1) : var1;
        return var1.getField6();
    }
    
    public static SubLObject f6586(final SubLObject var1) {
        assert NIL != f6580(var1) : var1;
        return var1.getField7();
    }
    
    public static SubLObject f6587(final SubLObject var1, final SubLObject var4) {
        assert NIL != f6580(var1) : var1;
        return var1.setField2(var4);
    }
    
    public static SubLObject f6588(final SubLObject var1, final SubLObject var4) {
        assert NIL != f6580(var1) : var1;
        return var1.setField3(var4);
    }
    
    public static SubLObject f6589(final SubLObject var1, final SubLObject var4) {
        assert NIL != f6580(var1) : var1;
        return var1.setField4(var4);
    }
    
    public static SubLObject f6590(final SubLObject var1, final SubLObject var4) {
        assert NIL != f6580(var1) : var1;
        return var1.setField5(var4);
    }
    
    public static SubLObject f6591(final SubLObject var1, final SubLObject var4) {
        assert NIL != f6580(var1) : var1;
        return var1.setField6(var4);
    }
    
    public static SubLObject f6592(final SubLObject var1, final SubLObject var4) {
        assert NIL != f6580(var1) : var1;
        return var1.setField7(var4);
    }
    
    public static SubLObject f6593(SubLObject var5) {
        if (var5 == UNPROVIDED) {
            var5 = (SubLObject)NIL;
        }
        final SubLObject var6 = (SubLObject)new $sX8146_native();
        SubLObject var7;
        SubLObject var8;
        SubLObject var9;
        SubLObject var10;
        for (var7 = (SubLObject)NIL, var7 = var5; NIL != var7; var7 = conses_high.cddr(var7)) {
            var8 = var7.first();
            var9 = conses_high.cadr(var7);
            var10 = var8;
            if (var10.eql((SubLObject)$ic38$)) {
                f6587(var6, var9);
            }
            else if (var10.eql((SubLObject)$ic39$)) {
                f6588(var6, var9);
            }
            else if (var10.eql((SubLObject)$ic40$)) {
                f6589(var6, var9);
            }
            else if (var10.eql((SubLObject)$ic44$)) {
                f6590(var6, var9);
            }
            else if (var10.eql((SubLObject)$ic41$)) {
                f6591(var6, var9);
            }
            else if (var10.eql((SubLObject)$ic42$)) {
                f6592(var6, var9);
            }
            else {
                Errors.error((SubLObject)$ic48$, var8);
            }
        }
        return var6;
    }
    
    public static SubLObject f6594(final SubLObject var11, final SubLObject var12) {
        Functions.funcall(var12, var11, (SubLObject)$ic49$, (SubLObject)$ic193$, (SubLObject)SIX_INTEGER);
        Functions.funcall(var12, var11, (SubLObject)$ic51$, (SubLObject)$ic38$, f6581(var11));
        Functions.funcall(var12, var11, (SubLObject)$ic51$, (SubLObject)$ic39$, f6582(var11));
        Functions.funcall(var12, var11, (SubLObject)$ic51$, (SubLObject)$ic40$, f6583(var11));
        Functions.funcall(var12, var11, (SubLObject)$ic51$, (SubLObject)$ic44$, f6584(var11));
        Functions.funcall(var12, var11, (SubLObject)$ic51$, (SubLObject)$ic41$, f6585(var11));
        Functions.funcall(var12, var11, (SubLObject)$ic51$, (SubLObject)$ic42$, f6586(var11));
        Functions.funcall(var12, var11, (SubLObject)$ic52$, (SubLObject)$ic193$, (SubLObject)SIX_INTEGER);
        return var11;
    }
    
    public static SubLObject f6595(final SubLObject var11, final SubLObject var12) {
        return f6594(var11, var12);
    }
    
    public static SubLObject f6579(final SubLObject var57, final SubLObject var2, final SubLObject var58) {
        PrintLow.format(var2, (SubLObject)$ic195$, f6581(var57));
        PrintLow.format(var2, (SubLObject)$ic196$, f6582(var57));
        PrintLow.format(var2, (SubLObject)$ic197$, f6583(var57));
        PrintLow.format(var2, (SubLObject)$ic198$, f6584(var57));
        if (IDENTITY != f6585(var57) && !Symbols.symbol_function((SubLObject)IDENTITY).eql(f6585(var57))) {
            PrintLow.format(var2, (SubLObject)$ic199$, f6585(var57));
        }
        if (IDENTITY != f6586(var57) && !Symbols.symbol_function((SubLObject)IDENTITY).eql(f6586(var57))) {
            PrintLow.format(var2, (SubLObject)$ic200$, f6586(var57));
        }
        streams_high.write_string((SubLObject)$ic201$, var2, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        return var57;
    }
    
    public static SubLObject f6596(final SubLObject var59) {
        final SubLObject var60 = f6593((SubLObject)UNPROVIDED);
        final SubLObject var61 = conses_high.getf(var59, (SubLObject)$ic38$, (SubLObject)UNPROVIDED);
        final SubLObject var62 = conses_high.getf(var59, (SubLObject)$ic39$, (SubLObject)UNPROVIDED);
        final SubLObject var63 = conses_high.getf(var59, (SubLObject)$ic40$, (SubLObject)UNPROVIDED);
        final SubLObject var64 = conses_high.getf(var59, (SubLObject)$ic44$, (SubLObject)UNPROVIDED);
        final SubLObject var65 = conses_high.getf(var59, (SubLObject)$ic41$, (SubLObject)IDENTITY);
        final SubLObject var66 = conses_high.getf(var59, (SubLObject)$ic42$, (SubLObject)IDENTITY);
        f6587(var60, var61);
        f6588(var60, var62);
        f6589(var60, var63);
        f6590(var60, var64);
        f6591(var60, var65);
        f6592(var60, var66);
        return var60;
    }
    
    public static SubLObject f6597(final SubLObject var65, final SubLObject var59) {
        final SubLObject var66 = f6596(var59);
        module0067.f4886($g1230$.getGlobalValue(), var65, var66);
        return var66;
    }
    
    public static SubLObject f6598(final SubLObject var65) {
        return module0067.f4884($g1230$.getGlobalValue(), var65, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f6599(final SubLObject var65) {
        final SubLObject var66 = f6598(var65);
        if (NIL != f6580(var66)) {
            return f6581(var66);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f6600(final SubLObject var65) {
        final SubLObject var66 = f6598(var65);
        if (NIL != f6580(var66)) {
            return f6582(var66);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f6601(final SubLObject var65) {
        final SubLObject var66 = f6598(var65);
        if (NIL != f6580(var66)) {
            return f6583(var66);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f6602(final SubLObject var65) {
        final SubLObject var66 = f6598(var65);
        if (NIL != f6580(var66)) {
            return f6584(var66);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f6603(final SubLObject var65) {
        final SubLObject var66 = f6598(var65);
        if (NIL != f6580(var66)) {
            return f6585(var66);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f6604(final SubLObject var65) {
        final SubLObject var66 = f6598(var65);
        if (NIL != f6580(var66)) {
            return f6586(var66);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f6605(final SubLObject var66, final SubLObject var67) {
        SubLObject var69;
        final SubLObject var68 = var69 = var66.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var69, var68, (SubLObject)$ic203$);
        final SubLObject var70 = var69.rest();
        var69 = var69.first();
        SubLObject var71 = (SubLObject)NIL;
        SubLObject var72 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var69, var68, (SubLObject)$ic203$);
        var71 = var69.first();
        var69 = var69.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var69, var68, (SubLObject)$ic203$);
        var72 = var69.first();
        var69 = var69.rest();
        SubLObject var73 = (SubLObject)NIL;
        SubLObject var74 = var69;
        SubLObject var75 = (SubLObject)NIL;
        SubLObject var74_75 = (SubLObject)NIL;
        while (NIL != var74) {
            cdestructuring_bind.destructuring_bind_must_consp(var74, var68, (SubLObject)$ic203$);
            var74_75 = var74.first();
            var74 = var74.rest();
            cdestructuring_bind.destructuring_bind_must_consp(var74, var68, (SubLObject)$ic203$);
            if (NIL == conses_high.member(var74_75, (SubLObject)$ic204$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)) {
                var75 = (SubLObject)T;
            }
            if (var74_75 == $ic205$) {
                var73 = var74.first();
            }
            var74 = var74.rest();
        }
        if (NIL != var75 && NIL == var73) {
            cdestructuring_bind.cdestructuring_bind_error(var68, (SubLObject)$ic203$);
        }
        final SubLObject var76 = cdestructuring_bind.property_list_member((SubLObject)$ic206$, var69);
        final SubLObject var77 = (SubLObject)((NIL != var76) ? conses_high.cadr(var76) : NIL);
        final SubLObject var78;
        var69 = (var78 = var70);
        return (SubLObject)ConsesLow.listS((SubLObject)$ic207$, (SubLObject)ConsesLow.list(var71, var72, (SubLObject)$ic202$, var77), ConsesLow.append(var78, (SubLObject)NIL));
    }
    
    public static SubLObject f6494(final SubLObject var16, final SubLObject var17, final SubLObject var18, final SubLObject var19, SubLObject var20, SubLObject var21) {
        if (var20 == UNPROVIDED) {
            var20 = (SubLObject)IDENTITY;
        }
        if (var21 == UNPROVIDED) {
            var21 = (SubLObject)IDENTITY;
        }
        final SubLThread var22 = SubLProcess.currentSubLThread();
        SubLObject var23;
        SubLObject var24;
        for (var23 = (SubLObject)NIL, var24 = module0066.f4838(module0067.f4891($g1230$.getGlobalValue())); NIL == var23 && NIL == module0066.f4841(var24); var24 = module0066.f4840(var24)) {
            var22.resetMultipleValues();
            final SubLObject var25 = module0066.f4839(var24);
            final SubLObject var26 = var22.secondMultipleValue();
            var22.resetMultipleValues();
            if (var16.eql(f6581(var26)) && var17.eql(f6582(var26)) && var18.eql(f6583(var26)) && var19.eql(f6584(var26)) && var20.eql(f6585(var26)) && var21.eql(f6586(var26))) {
                var23 = var25;
            }
        }
        module0066.f4842(var24);
        return var23;
    }
    
    public static SubLObject f6606(final SubLObject var66, final SubLObject var67) {
        SubLObject var69;
        final SubLObject var68 = var69 = var66.rest();
        SubLObject var70 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var69, var68, (SubLObject)$ic213$);
        var70 = var69.first();
        final SubLObject var71;
        var69 = (var71 = var69.rest());
        return (SubLObject)ConsesLow.list((SubLObject)$ic214$, (SubLObject)$ic215$, (SubLObject)ConsesLow.listS((SubLObject)$ic216$, (SubLObject)$ic217$, var70, ConsesLow.append(var71, (SubLObject)NIL)));
    }
    
    public static SubLObject f6607(final SubLObject var86, final SubLObject var44, SubLObject var42, SubLObject var47, SubLObject var65) {
        if (var42 == UNPROVIDED) {
            var42 = $g1222$.getGlobalValue();
        }
        if (var47 == UNPROVIDED) {
            var47 = $g1214$.getGlobalValue();
        }
        if (var65 == UNPROVIDED) {
            var65 = $g1215$.getGlobalValue();
        }
        final SubLObject var87 = f6566(var44, f6599(var65), f6600(var65), f6601(var65), f6603(var65), f6604(var65), f6608(var44), var42, var47, f6602(var65));
        f6471(var87, compatibility.open_binary(var86, (SubLObject)$ic218$));
        f6609(var87);
        return var87;
    }
    
    public static SubLObject f6610(final SubLObject var86, SubLObject var47, SubLObject var65) {
        if (var47 == UNPROVIDED) {
            var47 = $g1214$.getGlobalValue();
        }
        if (var65 == UNPROVIDED) {
            var65 = $g1215$.getGlobalValue();
        }
        final SubLObject var87 = f6564(f6599(var65), f6600(var65), f6601(var65), f6603(var65), f6604(var65), (SubLObject)NIL, var47, f6602(var65));
        f6471(var87, StreamsLow.open(var86, new SubLObject[] { $ic219$, $ic218$, $ic220$, $ic221$, $ic222$, $ic223$, $ic224$, $ic225$ }));
        f6472(var87, f6526((SubLObject)UNPROVIDED));
        f6611(var87);
        f6565(var87, f6608(f6612(var87)));
        return var87;
    }
    
    public static SubLObject f6613(final SubLObject var86, SubLObject var47, SubLObject var65) {
        if (var47 == UNPROVIDED) {
            var47 = $g1214$.getGlobalValue();
        }
        if (var65 == UNPROVIDED) {
            var65 = $g1215$.getGlobalValue();
        }
        final SubLObject var87 = f6564(f6599(var65), f6600(var65), f6601(var65), f6603(var65), f6604(var65), (SubLObject)NIL, var47, f6602(var65));
        f6471(var87, StreamsLow.open(var86, new SubLObject[] { $ic219$, $ic226$, $ic222$, $ic223$, $ic224$, $ic225$ }));
        f6472(var87, f6526((SubLObject)UNPROVIDED));
        f6611(var87);
        f6565(var87, f6608(f6612(var87)));
        return var87;
    }
    
    public static SubLObject f6614(final SubLObject var13) {
        assert NIL != f6457(var13) : var13;
        return streams_high.open_stream_p(f6458(var13));
    }
    
    public static SubLObject f6615(final SubLObject var13) {
        assert NIL != f6457(var13) : var13;
        final SubLObject var14 = f6460(var13);
        SubLObject var15 = (SubLObject)NIL;
        try {
            var15 = Locks.seize_lock(var14);
            final SubLObject var16 = f6458(var13);
            if (NIL != streams_high.output_stream_p(var16)) {
                streams_high.force_output(var16);
                f6616(var13);
            }
            streams_high.close(var16, (SubLObject)UNPROVIDED);
        }
        finally {
            if (NIL != var15) {
                Locks.release_lock(var14);
            }
        }
        return var13;
    }
    
    public static SubLObject f6612(final SubLObject var13) {
        assert NIL != f6457(var13) : var13;
        SubLObject var14 = (SubLObject)NIL;
        final SubLObject var15 = f6460(var13);
        SubLObject var16 = (SubLObject)NIL;
        try {
            var16 = Locks.seize_lock(var15);
            final SubLObject var17 = f6459(var13);
            var14 = f6506(var17);
        }
        finally {
            if (NIL != var16) {
                Locks.release_lock(var15);
            }
        }
        return var14;
    }
    
    public static SubLObject f6617(final SubLObject var13) {
        assert NIL != f6457(var13) : var13;
        SubLObject var14 = (SubLObject)NIL;
        final SubLObject var15 = f6460(var13);
        SubLObject var16 = (SubLObject)NIL;
        try {
            var16 = Locks.seize_lock(var15);
            final SubLObject var17 = f6459(var13);
            var14 = f6507(var17);
        }
        finally {
            if (NIL != var16) {
                Locks.release_lock(var15);
            }
        }
        return var14;
    }
    
    public static SubLObject f6618(final SubLObject var52, final SubLObject var13, final SubLObject var94) {
        assert NIL != f6457(var13) : var13;
        final SubLObject var95 = f6465(var13);
        final SubLObject var96 = Functions.funcall(var95, var52);
        final SubLObject var97 = f6460(var13);
        SubLObject var98 = (SubLObject)NIL;
        try {
            var98 = Locks.seize_lock(var97);
            f6619(var13, var96, var94);
        }
        finally {
            if (NIL != var98) {
                Locks.release_lock(var97);
            }
        }
        f6620(var13, var52, var94);
        return var52;
    }
    
    public static SubLObject f6621(final SubLObject var52, final SubLObject var13, SubLObject var98) {
        if (var98 == UNPROVIDED) {
            var98 = (SubLObject)NIL;
        }
        final SubLThread var99 = SubLProcess.currentSubLThread();
        assert NIL != f6457(var13) : var13;
        var99.resetMultipleValues();
        SubLObject var100 = f6622(var13, var52);
        final SubLObject var101 = var99.secondMultipleValue();
        var99.resetMultipleValues();
        if (NIL != var101) {
            if (var100.eql($g1233$.getGlobalValue())) {
                if (NIL != $g1231$.getDynamicValue(var99)) {
                    PrintLow.format($g1231$.getDynamicValue(var99), (SubLObject)$ic231$, var52);
                }
                return Values.values(var98, (SubLObject)NIL);
            }
            if (NIL != $g1231$.getDynamicValue(var99)) {
                PrintLow.format($g1231$.getDynamicValue(var99), (SubLObject)$ic232$, var52);
            }
            return Values.values(var100, (SubLObject)T);
        }
        else {
            if (NIL != $g1231$.getDynamicValue(var99)) {
                PrintLow.format($g1231$.getDynamicValue(var99), (SubLObject)$ic233$, var52);
            }
            final SubLObject var102 = f6465(var13);
            final SubLObject var103 = Functions.funcall(var102, var52);
            SubLObject var104 = (SubLObject)NIL;
            final SubLObject var105 = f6460(var13);
            SubLObject var106 = (SubLObject)NIL;
            try {
                var106 = Locks.seize_lock(var105);
                var99.resetMultipleValues();
                final SubLObject var102_103 = f6623(var13, var103);
                final SubLObject var104_105 = var99.secondMultipleValue();
                var99.resetMultipleValues();
                var100 = var102_103;
                var104 = var104_105;
            }
            finally {
                if (NIL != var106) {
                    Locks.release_lock(var105);
                }
            }
            if (var104 == $ic234$) {
                f6620(var13, var52, var100);
                if (NIL != $g1231$.getDynamicValue(var99)) {
                    PrintLow.format($g1231$.getDynamicValue(var99), (SubLObject)$ic235$, var52);
                }
                return Values.values(var100, (SubLObject)T);
            }
            f6620(var13, var52, $g1233$.getGlobalValue());
            if (NIL != $g1231$.getDynamicValue(var99)) {
                PrintLow.format($g1231$.getDynamicValue(var99), (SubLObject)$ic236$, var52);
            }
            return Values.values(var98, (SubLObject)NIL);
        }
    }
    
    public static SubLObject f6624(final SubLObject var52, final SubLObject var13) {
        assert NIL != f6457(var13) : var13;
        final SubLObject var53 = f6464(var13);
        final SubLObject var54 = Functions.funcall(var53, var52);
        final SubLObject var55 = f6460(var13);
        SubLObject var56 = (SubLObject)NIL;
        try {
            var56 = Locks.seize_lock(var55);
            f6625(var13, var54);
        }
        finally {
            if (NIL != var56) {
                Locks.release_lock(var55);
            }
        }
        f6620(var13, var52, $g1233$.getGlobalValue());
        return var52;
    }
    
    public static SubLObject f6626(final SubLObject var52, final SubLObject var13, SubLObject var108, SubLObject var109) {
        if (var108 == UNPROVIDED) {
            var108 = (SubLObject)ONE_INTEGER;
        }
        if (var109 == UNPROVIDED) {
            var109 = var108;
        }
        final SubLThread var110 = SubLProcess.currentSubLThread();
        assert NIL != f6457(var13) : var13;
        final SubLObject var111 = f6621(var52, var13, (SubLObject)UNPROVIDED);
        if (NIL != var111 && NIL == Errors.$ignore_mustsP$.getDynamicValue(var110) && !var111.isNumber()) {
            Errors.error((SubLObject)$ic237$, var52, var111, var13);
        }
        return f6618(var52, var13, (NIL != var111) ? Numbers.add(var111, var108) : var109);
    }
    
    public static SubLObject f6627(final SubLObject var66, final SubLObject var67) {
        SubLObject var69;
        final SubLObject var68 = var69 = var66.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var69, var68, (SubLObject)$ic238$);
        final SubLObject var70 = var69.rest();
        var69 = var69.first();
        SubLObject var71 = (SubLObject)NIL;
        SubLObject var72 = (SubLObject)NIL;
        SubLObject var73 = (SubLObject)NIL;
        SubLObject var74 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var69, var68, (SubLObject)$ic238$);
        var71 = var69.first();
        var69 = var69.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var69, var68, (SubLObject)$ic238$);
        var72 = var69.first();
        var69 = var69.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var69, var68, (SubLObject)$ic238$);
        var73 = var69.first();
        var69 = var69.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var69, var68, (SubLObject)$ic238$);
        var74 = var69.first();
        var69 = var69.rest();
        final SubLObject var75 = (SubLObject)(var69.isCons() ? var69.first() : NIL);
        cdestructuring_bind.destructuring_bind_must_listp(var69, var68, (SubLObject)$ic238$);
        var69 = var69.rest();
        if (NIL == var69) {
            final SubLObject var76;
            var69 = (var76 = var70);
            final SubLObject var77 = (SubLObject)$ic239$;
            final SubLObject var78 = (SubLObject)$ic240$;
            final SubLObject var79 = (SubLObject)$ic241$;
            final SubLObject var80 = (SubLObject)$ic242$;
            final SubLObject var81 = (SubLObject)$ic243$;
            return (SubLObject)ConsesLow.list((SubLObject)$ic244$, (SubLObject)ConsesLow.list(reader.bq_cons(var79, (SubLObject)$ic245$), reader.bq_cons(var81, (SubLObject)$ic245$)), (SubLObject)ConsesLow.list((SubLObject)$ic246$, (SubLObject)ConsesLow.list((SubLObject)$ic247$, (SubLObject)ConsesLow.list((SubLObject)$ic248$, var74), (SubLObject)ConsesLow.list((SubLObject)$ic248$, var81)), (SubLObject)ConsesLow.list((SubLObject)$ic249$, (SubLObject)ConsesLow.list(var77, var78, var80), (SubLObject)ConsesLow.list((SubLObject)$ic250$, var73, var79, var75), (SubLObject)ConsesLow.list((SubLObject)$ic214$, (SubLObject)ConsesLow.list((SubLObject)$ic251$, var80), (SubLObject)ConsesLow.list((SubLObject)$ic244$, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(var71, var77), (SubLObject)ConsesLow.list(var72, var78)), reader.bq_cons((SubLObject)$ic252$, ConsesLow.append(var76, (SubLObject)NIL)))), (SubLObject)ConsesLow.list((SubLObject)$ic253$, var79, var80, var81, (SubLObject)ConsesLow.list((SubLObject)$ic251$, var80)))));
        }
        cdestructuring_bind.cdestructuring_bind_error(var68, (SubLObject)$ic238$);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f6628(final SubLObject var66, final SubLObject var67) {
        SubLObject var69;
        final SubLObject var68 = var69 = var66.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var69, var68, (SubLObject)$ic238$);
        final SubLObject var70 = var69.rest();
        var69 = var69.first();
        SubLObject var71 = (SubLObject)NIL;
        SubLObject var72 = (SubLObject)NIL;
        SubLObject var73 = (SubLObject)NIL;
        SubLObject var74 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var69, var68, (SubLObject)$ic238$);
        var71 = var69.first();
        var69 = var69.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var69, var68, (SubLObject)$ic238$);
        var72 = var69.first();
        var69 = var69.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var69, var68, (SubLObject)$ic238$);
        var73 = var69.first();
        var69 = var69.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var69, var68, (SubLObject)$ic238$);
        var74 = var69.first();
        var69 = var69.rest();
        final SubLObject var75 = (SubLObject)(var69.isCons() ? var69.first() : NIL);
        cdestructuring_bind.destructuring_bind_must_listp(var69, var68, (SubLObject)$ic238$);
        var69 = var69.rest();
        if (NIL == var69) {
            final SubLObject var76;
            var69 = (var76 = var70);
            final SubLObject var77 = (SubLObject)$ic254$;
            final SubLObject var78 = (SubLObject)$ic255$;
            final SubLObject var79 = (SubLObject)$ic256$;
            final SubLObject var80 = (SubLObject)$ic257$;
            final SubLObject var81 = (SubLObject)$ic258$;
            return (SubLObject)ConsesLow.list((SubLObject)$ic244$, (SubLObject)ConsesLow.list(reader.bq_cons(var79, (SubLObject)$ic245$), reader.bq_cons(var81, (SubLObject)$ic245$)), (SubLObject)ConsesLow.list((SubLObject)$ic246$, (SubLObject)ConsesLow.list((SubLObject)$ic247$, (SubLObject)ConsesLow.list((SubLObject)$ic248$, var74), (SubLObject)ConsesLow.list((SubLObject)$ic248$, var81)), (SubLObject)ConsesLow.list((SubLObject)$ic249$, (SubLObject)ConsesLow.list(var77, var78, var80), (SubLObject)ConsesLow.list((SubLObject)$ic259$, var73, var79, var75), (SubLObject)ConsesLow.list((SubLObject)$ic214$, (SubLObject)ConsesLow.list((SubLObject)$ic251$, var80), (SubLObject)ConsesLow.list((SubLObject)$ic244$, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(var71, var77), (SubLObject)ConsesLow.list(var72, var78)), reader.bq_cons((SubLObject)$ic252$, ConsesLow.append(var76, (SubLObject)NIL)))), (SubLObject)ConsesLow.list((SubLObject)$ic253$, var79, var80, var81, (SubLObject)ConsesLow.list((SubLObject)$ic251$, var80)))));
        }
        cdestructuring_bind.cdestructuring_bind_error(var68, (SubLObject)$ic238$);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f6629(final SubLObject var66, final SubLObject var67) {
        SubLObject var69;
        final SubLObject var68 = var69 = var66.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var69, var68, (SubLObject)$ic260$);
        final SubLObject var70 = var69.rest();
        var69 = var69.first();
        SubLObject var71 = (SubLObject)NIL;
        SubLObject var72 = (SubLObject)NIL;
        SubLObject var73 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var69, var68, (SubLObject)$ic260$);
        var71 = var69.first();
        var69 = var69.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var69, var68, (SubLObject)$ic260$);
        var72 = var69.first();
        var69 = var69.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var69, var68, (SubLObject)$ic260$);
        var73 = var69.first();
        var69 = var69.rest();
        SubLObject var74 = (SubLObject)NIL;
        SubLObject var75 = var69;
        SubLObject var76 = (SubLObject)NIL;
        SubLObject var130_131 = (SubLObject)NIL;
        while (NIL != var75) {
            cdestructuring_bind.destructuring_bind_must_consp(var75, var68, (SubLObject)$ic260$);
            var130_131 = var75.first();
            var75 = var75.rest();
            cdestructuring_bind.destructuring_bind_must_consp(var75, var68, (SubLObject)$ic260$);
            if (NIL == conses_high.member(var130_131, (SubLObject)$ic261$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)) {
                var76 = (SubLObject)T;
            }
            if (var130_131 == $ic205$) {
                var74 = var75.first();
            }
            var75 = var75.rest();
        }
        if (NIL != var76 && NIL == var74) {
            cdestructuring_bind.cdestructuring_bind_error(var68, (SubLObject)$ic260$);
        }
        final SubLObject var77 = cdestructuring_bind.property_list_member((SubLObject)$ic262$, var69);
        final SubLObject var78 = (SubLObject)((NIL != var77) ? conses_high.cadr(var77) : NIL);
        final SubLObject var79 = cdestructuring_bind.property_list_member((SubLObject)$ic206$, var69);
        final SubLObject var80 = (SubLObject)((NIL != var79) ? conses_high.cadr(var79) : NIL);
        final SubLObject var81;
        var69 = (var81 = var70);
        if (NIL != var78) {
            final SubLObject var82 = (SubLObject)$ic263$;
            return (SubLObject)ConsesLow.list((SubLObject)$ic244$, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(var82, var73)), (SubLObject)ConsesLow.list((SubLObject)$ic253$, (SubLObject)$ic264$, var78), (SubLObject)$ic265$, (SubLObject)ConsesLow.list((SubLObject)$ic253$, (SubLObject)$ic266$, (SubLObject)ConsesLow.list((SubLObject)$ic267$, var82)), (SubLObject)$ic268$, (SubLObject)ConsesLow.list((SubLObject)$ic269$, (SubLObject)$ic264$, (SubLObject)ConsesLow.listS((SubLObject)$ic270$, (SubLObject)ConsesLow.list(var71, var72, var82, (SubLObject)$ic206$, var80), (SubLObject)$ic271$, (SubLObject)$ic272$, ConsesLow.append(var81, (SubLObject)NIL))));
        }
        return (SubLObject)ConsesLow.listS((SubLObject)$ic273$, (SubLObject)ConsesLow.listS(var71, var72, var73, var80, (SubLObject)$ic245$), ConsesLow.append(var81, (SubLObject)NIL));
    }
    
    public static SubLObject f6630(final SubLObject var66, final SubLObject var67) {
        SubLObject var69;
        final SubLObject var68 = var69 = var66.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var69, var68, (SubLObject)$ic260$);
        final SubLObject var70 = var69.rest();
        var69 = var69.first();
        SubLObject var71 = (SubLObject)NIL;
        SubLObject var72 = (SubLObject)NIL;
        SubLObject var73 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var69, var68, (SubLObject)$ic260$);
        var71 = var69.first();
        var69 = var69.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var69, var68, (SubLObject)$ic260$);
        var72 = var69.first();
        var69 = var69.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var69, var68, (SubLObject)$ic260$);
        var73 = var69.first();
        var69 = var69.rest();
        SubLObject var74 = (SubLObject)NIL;
        SubLObject var75 = var69;
        SubLObject var76 = (SubLObject)NIL;
        SubLObject var142_143 = (SubLObject)NIL;
        while (NIL != var75) {
            cdestructuring_bind.destructuring_bind_must_consp(var75, var68, (SubLObject)$ic260$);
            var142_143 = var75.first();
            var75 = var75.rest();
            cdestructuring_bind.destructuring_bind_must_consp(var75, var68, (SubLObject)$ic260$);
            if (NIL == conses_high.member(var142_143, (SubLObject)$ic261$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)) {
                var76 = (SubLObject)T;
            }
            if (var142_143 == $ic205$) {
                var74 = var75.first();
            }
            var75 = var75.rest();
        }
        if (NIL != var76 && NIL == var74) {
            cdestructuring_bind.cdestructuring_bind_error(var68, (SubLObject)$ic260$);
        }
        final SubLObject var77 = cdestructuring_bind.property_list_member((SubLObject)$ic262$, var69);
        final SubLObject var78 = (SubLObject)((NIL != var77) ? conses_high.cadr(var77) : NIL);
        final SubLObject var79 = cdestructuring_bind.property_list_member((SubLObject)$ic206$, var69);
        final SubLObject var80 = (SubLObject)((NIL != var79) ? conses_high.cadr(var79) : NIL);
        final SubLObject var81;
        var69 = (var81 = var70);
        if (NIL != var78) {
            final SubLObject var82 = (SubLObject)$ic274$;
            return (SubLObject)ConsesLow.list((SubLObject)$ic244$, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(var82, var73)), (SubLObject)ConsesLow.list((SubLObject)$ic253$, (SubLObject)$ic264$, var78), (SubLObject)$ic265$, (SubLObject)ConsesLow.list((SubLObject)$ic253$, (SubLObject)$ic266$, (SubLObject)ConsesLow.list((SubLObject)$ic267$, var82)), (SubLObject)$ic268$, (SubLObject)ConsesLow.list((SubLObject)$ic269$, (SubLObject)$ic264$, (SubLObject)ConsesLow.listS((SubLObject)$ic270$, (SubLObject)ConsesLow.list(var71, var72, var82, (SubLObject)$ic206$, var80), (SubLObject)$ic271$, (SubLObject)$ic272$, ConsesLow.append(var81, (SubLObject)NIL))));
        }
        return (SubLObject)ConsesLow.listS((SubLObject)$ic275$, (SubLObject)ConsesLow.listS(var71, var72, var73, var80, (SubLObject)$ic245$), ConsesLow.append(var81, (SubLObject)NIL));
    }
    
    public static SubLObject f6631(final SubLObject var13) {
        final SubLThread var14 = SubLProcess.currentSubLThread();
        SubLObject var15 = (SubLObject)NIL;
        SubLObject var19;
        for (SubLObject var16 = (SubLObject)NIL; NIL == var16; var16 = Types.sublisp_null(var19)) {
            var14.resetMultipleValues();
            final SubLObject var17 = f6632(var13, var15, (SubLObject)NIL);
            final SubLObject var18 = var14.secondMultipleValue();
            var19 = var14.thirdMultipleValue();
            var14.resetMultipleValues();
            if (NIL != var19) {
                final SubLObject var20 = var17;
                final SubLObject var21 = var18;
                PrintLow.format((SubLObject)T, (SubLObject)$ic276$, var20, var21);
            }
            var15 = var19;
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f6633(final SubLObject var66, final SubLObject var67) {
        SubLObject var69;
        final SubLObject var68 = var69 = var66.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var69, var68, (SubLObject)$ic277$);
        final SubLObject var70 = var69.rest();
        var69 = var69.first();
        SubLObject var71 = (SubLObject)NIL;
        SubLObject var72 = (SubLObject)NIL;
        SubLObject var73 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var69, var68, (SubLObject)$ic277$);
        var71 = var69.first();
        var69 = var69.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var69, var68, (SubLObject)$ic277$);
        var72 = var69.first();
        var69 = var69.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var69, var68, (SubLObject)$ic277$);
        var73 = var69.first();
        var69 = var69.rest();
        final SubLObject var74 = (SubLObject)(var69.isCons() ? var69.first() : $ic278$);
        cdestructuring_bind.destructuring_bind_must_listp(var69, var68, (SubLObject)$ic277$);
        var69 = var69.rest();
        if (NIL == var69) {
            final SubLObject var75;
            var69 = (var75 = var70);
            module0002.f37((SubLObject)$ic279$, (SubLObject)$ic280$);
            return (SubLObject)ConsesLow.listS((SubLObject)$ic270$, (SubLObject)ConsesLow.list(var71, var72, var73, (SubLObject)$ic262$, var74), ConsesLow.append(var75, (SubLObject)NIL));
        }
        cdestructuring_bind.cdestructuring_bind_error(var68, (SubLObject)$ic277$);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f6634(final SubLObject var66, final SubLObject var67) {
        SubLObject var69;
        final SubLObject var68 = var69 = var66.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var69, var68, (SubLObject)$ic281$);
        final SubLObject var70 = var69.rest();
        var69 = var69.first();
        SubLObject var71 = (SubLObject)NIL;
        SubLObject var72 = (SubLObject)NIL;
        SubLObject var73 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var69, var68, (SubLObject)$ic281$);
        var71 = var69.first();
        var69 = var69.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var69, var68, (SubLObject)$ic281$);
        var72 = var69.first();
        var69 = var69.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var69, var68, (SubLObject)$ic281$);
        var73 = var69.first();
        var69 = var69.rest();
        if (NIL == var69) {
            final SubLObject var74;
            var69 = (var74 = var70);
            module0002.f37((SubLObject)$ic282$, (SubLObject)$ic283$);
            return (SubLObject)ConsesLow.listS((SubLObject)$ic284$, (SubLObject)ConsesLow.list(var71, var72, (SubLObject)$ic206$, var73), ConsesLow.append(var74, (SubLObject)NIL));
        }
        cdestructuring_bind.cdestructuring_bind_error(var68, (SubLObject)$ic281$);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f6635(final SubLObject var66, final SubLObject var67) {
        SubLObject var69;
        final SubLObject var68 = var69 = var66.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var69, var68, (SubLObject)$ic285$);
        final SubLObject var70 = var69.rest();
        var69 = var69.first();
        SubLObject var71 = (SubLObject)NIL;
        SubLObject var72 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var69, var68, (SubLObject)$ic285$);
        var71 = var69.first();
        var69 = var69.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var69, var68, (SubLObject)$ic285$);
        var72 = var69.first();
        var69 = var69.rest();
        SubLObject var73 = (SubLObject)NIL;
        SubLObject var74 = var69;
        SubLObject var75 = (SubLObject)NIL;
        SubLObject var163_164 = (SubLObject)NIL;
        while (NIL != var74) {
            cdestructuring_bind.destructuring_bind_must_consp(var74, var68, (SubLObject)$ic285$);
            var163_164 = var74.first();
            var74 = var74.rest();
            cdestructuring_bind.destructuring_bind_must_consp(var74, var68, (SubLObject)$ic285$);
            if (NIL == conses_high.member(var163_164, (SubLObject)$ic261$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)) {
                var75 = (SubLObject)T;
            }
            if (var163_164 == $ic205$) {
                var73 = var74.first();
            }
            var74 = var74.rest();
        }
        if (NIL != var75 && NIL == var73) {
            cdestructuring_bind.cdestructuring_bind_error(var68, (SubLObject)$ic285$);
        }
        final SubLObject var76 = cdestructuring_bind.property_list_member((SubLObject)$ic262$, var69);
        final SubLObject var77 = (SubLObject)((NIL != var76) ? conses_high.cadr(var76) : NIL);
        final SubLObject var78 = cdestructuring_bind.property_list_member((SubLObject)$ic206$, var69);
        final SubLObject var79 = (SubLObject)((NIL != var78) ? conses_high.cadr(var78) : NIL);
        final SubLObject var80;
        var69 = (var80 = var70);
        if (NIL != var77) {
            final SubLObject var81 = (SubLObject)$ic286$;
            return (SubLObject)ConsesLow.list((SubLObject)$ic244$, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(var81, var72)), (SubLObject)ConsesLow.list((SubLObject)$ic253$, (SubLObject)$ic264$, var77), (SubLObject)$ic265$, (SubLObject)ConsesLow.list((SubLObject)$ic253$, (SubLObject)$ic266$, (SubLObject)ConsesLow.list((SubLObject)$ic267$, var81)), (SubLObject)$ic268$, (SubLObject)ConsesLow.list((SubLObject)$ic269$, (SubLObject)$ic264$, (SubLObject)ConsesLow.listS((SubLObject)$ic284$, (SubLObject)ConsesLow.list(var71, var81, (SubLObject)$ic206$, var79), (SubLObject)$ic271$, (SubLObject)$ic272$, ConsesLow.append(var80, (SubLObject)NIL))));
        }
        final SubLObject var82 = (SubLObject)$ic287$;
        return (SubLObject)ConsesLow.listS((SubLObject)$ic273$, (SubLObject)ConsesLow.listS(var71, var82, var72, var79, (SubLObject)$ic288$), (SubLObject)ConsesLow.list((SubLObject)$ic289$, var82), ConsesLow.append(var80, (SubLObject)NIL));
    }
    
    public static SubLObject f6636(final SubLObject var66, final SubLObject var67) {
        SubLObject var69;
        final SubLObject var68 = var69 = var66.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var69, var68, (SubLObject)$ic285$);
        final SubLObject var70 = var69.rest();
        var69 = var69.first();
        SubLObject var71 = (SubLObject)NIL;
        SubLObject var72 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var69, var68, (SubLObject)$ic285$);
        var71 = var69.first();
        var69 = var69.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var69, var68, (SubLObject)$ic285$);
        var72 = var69.first();
        var69 = var69.rest();
        SubLObject var73 = (SubLObject)NIL;
        SubLObject var74 = var69;
        SubLObject var75 = (SubLObject)NIL;
        SubLObject var174_175 = (SubLObject)NIL;
        while (NIL != var74) {
            cdestructuring_bind.destructuring_bind_must_consp(var74, var68, (SubLObject)$ic285$);
            var174_175 = var74.first();
            var74 = var74.rest();
            cdestructuring_bind.destructuring_bind_must_consp(var74, var68, (SubLObject)$ic285$);
            if (NIL == conses_high.member(var174_175, (SubLObject)$ic261$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)) {
                var75 = (SubLObject)T;
            }
            if (var174_175 == $ic205$) {
                var73 = var74.first();
            }
            var74 = var74.rest();
        }
        if (NIL != var75 && NIL == var73) {
            cdestructuring_bind.cdestructuring_bind_error(var68, (SubLObject)$ic285$);
        }
        final SubLObject var76 = cdestructuring_bind.property_list_member((SubLObject)$ic262$, var69);
        final SubLObject var77 = (SubLObject)((NIL != var76) ? conses_high.cadr(var76) : NIL);
        final SubLObject var78 = cdestructuring_bind.property_list_member((SubLObject)$ic206$, var69);
        final SubLObject var79 = (SubLObject)((NIL != var78) ? conses_high.cadr(var78) : NIL);
        final SubLObject var80;
        var69 = (var80 = var70);
        if (NIL != var77) {
            final SubLObject var81 = (SubLObject)$ic290$;
            return (SubLObject)ConsesLow.list((SubLObject)$ic244$, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(var81, var72)), (SubLObject)ConsesLow.list((SubLObject)$ic253$, (SubLObject)$ic264$, var77), (SubLObject)$ic265$, (SubLObject)ConsesLow.list((SubLObject)$ic253$, (SubLObject)$ic266$, (SubLObject)ConsesLow.list((SubLObject)$ic267$, var81)), (SubLObject)$ic268$, (SubLObject)ConsesLow.list((SubLObject)$ic269$, (SubLObject)$ic264$, (SubLObject)ConsesLow.listS((SubLObject)$ic284$, (SubLObject)ConsesLow.list(var71, var81, (SubLObject)$ic206$, var79), (SubLObject)$ic271$, (SubLObject)$ic272$, ConsesLow.append(var80, (SubLObject)NIL))));
        }
        final SubLObject var82 = (SubLObject)$ic291$;
        return (SubLObject)ConsesLow.listS((SubLObject)$ic275$, (SubLObject)ConsesLow.listS(var71, var82, var72, var79, (SubLObject)$ic288$), (SubLObject)ConsesLow.list((SubLObject)$ic289$, var82), ConsesLow.append(var80, (SubLObject)NIL));
    }
    
    public static SubLObject f6637(final SubLObject var66, final SubLObject var67) {
        SubLObject var69;
        final SubLObject var68 = var69 = var66.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var69, var68, (SubLObject)$ic292$);
        final SubLObject var70 = var69.rest();
        var69 = var69.first();
        SubLObject var71 = (SubLObject)NIL;
        SubLObject var72 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var69, var68, (SubLObject)$ic292$);
        var71 = var69.first();
        var69 = var69.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var69, var68, (SubLObject)$ic292$);
        var72 = var69.first();
        var69 = var69.rest();
        final SubLObject var73 = (SubLObject)(var69.isCons() ? var69.first() : $ic293$);
        cdestructuring_bind.destructuring_bind_must_listp(var69, var68, (SubLObject)$ic292$);
        var69 = var69.rest();
        if (NIL == var69) {
            final SubLObject var74;
            var69 = (var74 = var70);
            module0002.f37((SubLObject)$ic294$, (SubLObject)$ic283$);
            return (SubLObject)ConsesLow.listS((SubLObject)$ic284$, (SubLObject)ConsesLow.list(var71, var72, (SubLObject)$ic262$, var73), ConsesLow.append(var74, (SubLObject)NIL));
        }
        cdestructuring_bind.cdestructuring_bind_error(var68, (SubLObject)$ic292$);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f6638(final SubLObject var13) {
        final SubLThread var14 = SubLProcess.currentSubLThread();
        SubLObject var15 = (SubLObject)NIL;
        SubLObject var16 = (SubLObject)NIL;
        SubLObject var20;
        for (SubLObject var17 = (SubLObject)NIL; NIL == var17; var17 = Types.sublisp_null(var20)) {
            var14.resetMultipleValues();
            final SubLObject var18 = f6632(var13, var16, (SubLObject)T);
            final SubLObject var19 = var14.secondMultipleValue();
            var20 = var14.thirdMultipleValue();
            var14.resetMultipleValues();
            if (NIL != var20) {
                final SubLObject var21 = var18;
                final SubLObject var22 = var19;
                var15 = (SubLObject)ConsesLow.cons(var21, var15);
            }
            var16 = var20;
        }
        return Sequences.nreverse(var15);
    }
    
    public static SubLObject f6639(final SubLObject var13, final SubLObject var182, SubLObject var115) {
        if (var115 == UNPROVIDED) {
            var115 = (SubLObject)NIL;
        }
        final SubLThread var183 = SubLProcess.currentSubLThread();
        assert NIL != f6457(var13) : var13;
        assert NIL != module0004.f106(var182) : var182;
        final SubLObject var184 = f6612(var13);
        if (!var182.numGE(var184)) {
            SubLObject var185 = module0048.f3453(var182, var184, Symbols.symbol_function((SubLObject)$ic296$));
            SubLObject var186 = (SubLObject)NIL;
            SubLObject var187 = (SubLObject)ZERO_INTEGER;
            SubLObject var188 = (SubLObject)NIL;
            SubLObject var189 = (SubLObject)NIL;
            SubLObject var193;
            for (SubLObject var190 = (SubLObject)NIL; NIL == var188 && NIL == var190; var190 = Types.sublisp_null(var193)) {
                var183.resetMultipleValues();
                final SubLObject var191 = f6632(var13, var189, var115);
                final SubLObject var192 = var183.secondMultipleValue();
                var193 = var183.thirdMultipleValue();
                var183.resetMultipleValues();
                if (NIL != var193) {
                    final SubLObject var194 = var191;
                    final SubLObject var195 = var192;
                    if (NIL != module0035.f2012(var185)) {
                        var188 = (SubLObject)T;
                    }
                    else {
                        final SubLObject var196 = var185.first();
                        if (var187.numE(var196)) {
                            if (NIL != var115) {
                                var186 = (SubLObject)ConsesLow.cons(var194, var186);
                            }
                            else {
                                var186 = conses_high.acons(var194, var195, var186);
                            }
                            var185 = var185.rest();
                        }
                    }
                    var187 = module0048.f_1X(var187);
                }
                var189 = var193;
            }
            return var186;
        }
        if (NIL != var115) {
            return f6638(var13);
        }
        return f6640(var13);
    }
    
    public static SubLObject f6641(final SubLObject var13, SubLObject var187) {
        if (var187 == UNPROVIDED) {
            var187 = (SubLObject)T;
        }
        SubLObject var188 = (SubLObject)ZERO_INTEGER;
        final SubLObject var189 = f6617(var13);
        final SubLObject var190 = f6552((SubLObject)UNPROVIDED);
        SubLObject var191;
        for (var191 = (SubLObject)NIL, var191 = (SubLObject)ZERO_INTEGER; var191.numL(var189); var191 = Numbers.add(var191, (SubLObject)ONE_INTEGER)) {
            f6642(var13, var191, var190);
            if (NIL == f6572(var190, var13)) {
                var188 = Numbers.add(var188, (SubLObject)ONE_INTEGER);
                PrintLow.format(var187, (SubLObject)$ic297$, new SubLObject[] { var191, f6548(var190), f6548(var190), f6549(var190) });
            }
        }
        return Numbers.numE(var188, (SubLObject)ZERO_INTEGER);
    }
    
    public static SubLObject f6643(final SubLObject var13, SubLObject var187) {
        if (var187 == UNPROVIDED) {
            var187 = StreamsLow.$standard_output$.getDynamicValue();
        }
        final SubLObject var188 = f6459(var13);
        final SubLObject var189 = f6617(var13);
        final SubLObject var190 = f6503(var188);
        final SubLObject var191 = f6505(var188);
        final SubLObject var192 = f6458(var13);
        SubLObject var193 = (SubLObject)ZERO_INTEGER;
        compatibility.set_file_position(var192, var190);
        while (streams_high.file_position(var192, (SubLObject)UNPROVIDED).numL(var191) && var193.numL(var189)) {
            final SubLObject var194 = f6644(var192);
            final SubLObject var195 = f6644(var192);
            final SubLObject var196 = f6644(var192);
            if (NIL != Numbers.numNE(var194, Numbers.add(Numbers.add(var195, var196), $g1234$.getGlobalValue()))) {
                Errors.error((SubLObject)$ic298$, new SubLObject[] { var194, var195, var196, $g1234$.getGlobalValue() });
            }
            else if (NIL != streams_high.output_stream_p(var187)) {
                PrintLow.format(var187, (SubLObject)$ic299$, new SubLObject[] { var193, var194, var195, var196, $g1234$.getGlobalValue() });
            }
            var193 = Numbers.add(var193, (SubLObject)ONE_INTEGER);
            final SubLObject var197 = streams_high.file_position(var192, (SubLObject)UNPROVIDED);
            compatibility.set_file_position(var192, Numbers.add(Numbers.subtract(var194, $g1234$.getGlobalValue()), var197));
        }
        return var193;
    }
    
    public static SubLObject f6645(final SubLObject var13, SubLObject var199) {
        if (var199 == UNPROVIDED) {
            var199 = (SubLObject)NIL;
        }
        assert NIL != f6457(var13) : var13;
        return f6646(var13, (SubLObject)NIL, var199);
    }
    
    public static SubLObject f6647(final SubLObject var13, SubLObject var199) {
        if (var199 == UNPROVIDED) {
            var199 = (SubLObject)NIL;
        }
        assert NIL != f6457(var13) : var13;
        return f6646(var13, (SubLObject)T, var199);
    }
    
    public static SubLObject f6648(final SubLObject var13, SubLObject var199) {
        if (var199 == UNPROVIDED) {
            var199 = (SubLObject)NIL;
        }
        assert NIL != f6457(var13) : var13;
        return module0052.f3689(f6649(var13, (SubLObject)NIL, var199), (SubLObject)$ic300$, (SubLObject)$ic301$, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f6650(final SubLObject var200) {
        final SubLThread var201 = SubLProcess.currentSubLThread();
        var201.resetMultipleValues();
        final SubLObject var202 = f6651(var200);
        final SubLObject var203 = var201.secondMultipleValue();
        final SubLObject var204 = var201.thirdMultipleValue();
        var201.resetMultipleValues();
        return Values.values(f6652(var202), var203, var204);
    }
    
    public static SubLObject f6646(final SubLObject var13, final SubLObject var115, final SubLObject var199) {
        return module0052.f3689(f6649(var13, var115, var199), (SubLObject)$ic300$, (SubLObject)$ic302$, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f6649(final SubLObject var13, final SubLObject var115, final SubLObject var199) {
        final SubLObject var200 = (SubLObject)$ic303$;
        return (SubLObject)ConsesLow.list(var200, var13, var115, var199);
    }
    
    public static SubLObject f6653(final SubLObject var200) {
        SubLObject var198_205 = (SubLObject)NIL;
        SubLObject var201 = (SubLObject)NIL;
        SubLObject var202 = (SubLObject)NIL;
        SubLObject var203 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var200, var200, (SubLObject)$ic304$);
        var198_205 = var200.first();
        SubLObject var204 = var200.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var204, var200, (SubLObject)$ic304$);
        var201 = var204.first();
        var204 = var204.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var204, var200, (SubLObject)$ic304$);
        var202 = var204.first();
        var204 = var204.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var204, var200, (SubLObject)$ic304$);
        var203 = var204.first();
        var204 = var204.rest();
        if (NIL != var204) {
            cdestructuring_bind.cdestructuring_bind_error(var200, (SubLObject)$ic304$);
            return (SubLObject)NIL;
        }
        if ($ic206$ == var198_205) {
            if (NIL != var203) {
                f6615(var201);
            }
            return (SubLObject)T;
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f6651(final SubLObject var200) {
        final SubLThread var201 = SubLProcess.currentSubLThread();
        SubLObject var198_208 = (SubLObject)NIL;
        SubLObject var202 = (SubLObject)NIL;
        SubLObject var203 = (SubLObject)NIL;
        SubLObject var204 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var200, var200, (SubLObject)$ic304$);
        var198_208 = var200.first();
        SubLObject var205 = var200.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var205, var200, (SubLObject)$ic304$);
        var202 = var205.first();
        var205 = var205.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var205, var200, (SubLObject)$ic304$);
        var203 = var205.first();
        var205 = var205.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var205, var200, (SubLObject)$ic304$);
        var204 = var205.first();
        var205 = var205.rest();
        if (NIL != var205) {
            cdestructuring_bind.cdestructuring_bind_error(var200, (SubLObject)$ic304$);
            return (SubLObject)NIL;
        }
        final SubLObject var206 = (SubLObject)(($ic303$ == var198_208) ? NIL : var198_208);
        var201.resetMultipleValues();
        final SubLObject var207 = f6632(var202, var206, var203);
        final SubLObject var208 = var201.secondMultipleValue();
        final SubLObject var209 = var201.thirdMultipleValue();
        var201.resetMultipleValues();
        final SubLObject var210 = (SubLObject)makeBoolean(NIL != var209);
        if (NIL == var210) {
            final SubLObject var211 = (SubLObject)$ic206$;
            if (NIL != var204) {
                f6615(var202);
            }
            else {
                ConsesLow.set_nth((SubLObject)ONE_INTEGER, var200, (SubLObject)$ic305$);
            }
            ConsesLow.rplaca(var200, var211);
            return Values.values((SubLObject)NIL, var200, (SubLObject)T);
        }
        final SubLObject var212 = f6654(var203, var207, var208);
        final SubLObject var213 = var209;
        ConsesLow.rplaca(var200, var213);
        return Values.values(var212, var200, (SubLObject)NIL);
    }
    
    public static SubLObject f6654(final SubLObject var115, final SubLObject var209, final SubLObject var210) {
        return (SubLObject)((NIL != var115) ? var209 : ConsesLow.list(var209, var210));
    }
    
    public static SubLObject f6652(final SubLObject var119) {
        return (SubLObject)(var119.isList() ? conses_high.second(var119) : NIL);
    }
    
    public static SubLObject f6640(final SubLObject var13) {
        final SubLThread var14 = SubLProcess.currentSubLThread();
        SubLObject var15 = (SubLObject)NIL;
        module0012.$g82$.setDynamicValue((SubLObject)$ic306$, var14);
        module0012.$g73$.setDynamicValue(Time.get_universal_time(), var14);
        module0012.$g83$.setDynamicValue(f6612(var13), var14);
        module0012.$g84$.setDynamicValue((SubLObject)ZERO_INTEGER, var14);
        final SubLObject var16 = module0012.$g75$.currentBinding(var14);
        final SubLObject var17 = module0012.$g76$.currentBinding(var14);
        final SubLObject var18 = module0012.$g77$.currentBinding(var14);
        final SubLObject var19 = module0012.$g78$.currentBinding(var14);
        try {
            module0012.$g75$.bind((SubLObject)ZERO_INTEGER, var14);
            module0012.$g76$.bind((SubLObject)NIL, var14);
            module0012.$g77$.bind((SubLObject)T, var14);
            module0012.$g78$.bind(Time.get_universal_time(), var14);
            module0012.f478(module0012.$g82$.getDynamicValue(var14));
            SubLObject var20 = (SubLObject)NIL;
            SubLObject var24;
            for (SubLObject var21 = (SubLObject)NIL; NIL == var21; var21 = Types.sublisp_null(var24)) {
                var14.resetMultipleValues();
                final SubLObject var22 = f6632(var13, var20, (SubLObject)NIL);
                final SubLObject var23 = var14.secondMultipleValue();
                var24 = var14.thirdMultipleValue();
                var14.resetMultipleValues();
                if (NIL != var24) {
                    final SubLObject var25 = var22;
                    final SubLObject var26 = var23;
                    module0012.note_percent_progress(module0012.$g84$.getDynamicValue(var14), module0012.$g83$.getDynamicValue(var14));
                    module0012.$g84$.setDynamicValue(Numbers.add(module0012.$g84$.getDynamicValue(var14), (SubLObject)ONE_INTEGER), var14);
                    var15 = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.cons(var25, var26), var15);
                }
                var20 = var24;
            }
            module0012.f479();
        }
        finally {
            module0012.$g78$.rebind(var19, var14);
            module0012.$g77$.rebind(var18, var14);
            module0012.$g76$.rebind(var17, var14);
            module0012.$g75$.rebind(var16, var14);
        }
        return Sequences.nreverse(var15);
    }
    
    public static SubLObject f6655(final SubLObject var220, final SubLObject var86, SubLObject var221, SubLObject var47, SubLObject var65, SubLObject var222) {
        if (var221 == UNPROVIDED) {
            var221 = (SubLObject)$ic307$;
        }
        if (var47 == UNPROVIDED) {
            var47 = $g1214$.getGlobalValue();
        }
        if (var65 == UNPROVIDED) {
            var65 = $g1215$.getGlobalValue();
        }
        if (var222 == UNPROVIDED) {
            var222 = (SubLObject)NIL;
        }
        final SubLThread var223 = SubLProcess.currentSubLThread();
        assert NIL != Types.hash_table_p(var220) : var220;
        final SubLObject var224 = f6656(var86, var221, var47, var65);
        final SubLObject var225 = var222;
        final SubLObject var226 = module0012.$silent_progressP$.getDynamicValue(var223);
        final SubLObject var227 = module0012.$silent_progressP$.currentBinding(var223);
        final SubLObject var228 = module0012.$g75$.currentBinding(var223);
        final SubLObject var229 = module0012.$g76$.currentBinding(var223);
        final SubLObject var230 = module0012.$g77$.currentBinding(var223);
        final SubLObject var231 = module0012.$g78$.currentBinding(var223);
        try {
            module0012.$silent_progressP$.bind((SubLObject)makeBoolean(NIL != var226 || NIL == var225), var223);
            module0012.$g75$.bind((SubLObject)ZERO_INTEGER, var223);
            module0012.$g76$.bind((SubLObject)NIL, var223);
            module0012.$g77$.bind((SubLObject)T, var223);
            module0012.$g78$.bind(Time.get_universal_time(), var223);
            module0012.f478((SubLObject)((NIL != var225) ? var225 : $ic309$));
            SubLObject var232 = (SubLObject)ZERO_INTEGER;
            final SubLObject var233 = Hashtables.hash_table_count(var220);
            SubLObject var234 = (SubLObject)NIL;
            SubLObject var235 = (SubLObject)NIL;
            final Iterator var236 = Hashtables.getEntrySetIterator(var220);
            try {
                while (Hashtables.iteratorHasNext(var236)) {
                    final Map.Entry var237 = Hashtables.iteratorNextEntry(var236);
                    var234 = Hashtables.getEntryKey(var237);
                    var235 = Hashtables.getEntryValue(var237);
                    final SubLObject var216_232 = module0012.$silent_progressP$.currentBinding(var223);
                    try {
                        module0012.$silent_progressP$.bind(var226, var223);
                        f6657(var234, var224, var235);
                    }
                    finally {
                        module0012.$silent_progressP$.rebind(var216_232, var223);
                    }
                    var232 = module0048.f_1X(var232);
                    module0012.note_percent_progress(var232, var233);
                }
            }
            finally {
                Hashtables.releaseEntrySetIterator(var236);
            }
            module0012.f479();
        }
        finally {
            module0012.$g78$.rebind(var231, var223);
            module0012.$g77$.rebind(var230, var223);
            module0012.$g76$.rebind(var229, var223);
            module0012.$g75$.rebind(var228, var223);
            module0012.$silent_progressP$.rebind(var227, var223);
        }
        f6658(var224, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f6659(final SubLObject var214, final SubLObject var233, SubLObject var47, SubLObject var65, SubLObject var221) {
        if (var47 == UNPROVIDED) {
            var47 = $g1214$.getGlobalValue();
        }
        if (var65 == UNPROVIDED) {
            var65 = $g1215$.getGlobalValue();
        }
        if (var221 == UNPROVIDED) {
            var221 = (SubLObject)$ic310$;
        }
        assert NIL != Types.listp(var214) : var214;
        assert NIL != Types.stringp(var233) : var233;
        final SubLObject var234 = f6656(var233, var221, var47, var65);
        SubLObject var235 = Sequences.reverse(var214);
        SubLObject var236 = (SubLObject)NIL;
        var236 = var235.first();
        while (NIL != var235) {
            f6657(var236.first(), var234, var236.rest());
            var235 = var235.rest();
            var236 = var235.first();
        }
        f6658(var234, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        return var233;
    }
    
    public static SubLObject f6660(final SubLObject var236, final SubLObject var237, SubLObject var238, SubLObject var239, SubLObject var47, SubLObject var65, SubLObject var222) {
        if (var238 == UNPROVIDED) {
            var238 = $g1214$.getGlobalValue();
        }
        if (var239 == UNPROVIDED) {
            var239 = $g1215$.getGlobalValue();
        }
        if (var47 == UNPROVIDED) {
            var47 = $g1214$.getGlobalValue();
        }
        if (var65 == UNPROVIDED) {
            var65 = $g1215$.getGlobalValue();
        }
        if (var222 == UNPROVIDED) {
            var222 = (SubLObject)NIL;
        }
        final SubLThread var240 = SubLProcess.currentSubLThread();
        final SubLObject var241 = f6607(var237, var47, var65, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        final SubLObject var243;
        final SubLObject var242 = var243 = f6613(var236, var238, var239);
        module0012.$g82$.setDynamicValue(var222, var240);
        module0012.$g73$.setDynamicValue(Time.get_universal_time(), var240);
        module0012.$g83$.setDynamicValue(f6612(var243), var240);
        module0012.$g84$.setDynamicValue((SubLObject)ZERO_INTEGER, var240);
        final SubLObject var244 = module0012.$g75$.currentBinding(var240);
        final SubLObject var245 = module0012.$g76$.currentBinding(var240);
        final SubLObject var246 = module0012.$g77$.currentBinding(var240);
        final SubLObject var247 = module0012.$g78$.currentBinding(var240);
        try {
            module0012.$g75$.bind((SubLObject)ZERO_INTEGER, var240);
            module0012.$g76$.bind((SubLObject)NIL, var240);
            module0012.$g77$.bind((SubLObject)T, var240);
            module0012.$g78$.bind(Time.get_universal_time(), var240);
            module0012.f478(module0012.$g82$.getDynamicValue(var240));
            SubLObject var248 = (SubLObject)NIL;
            SubLObject var252;
            for (SubLObject var249 = (SubLObject)NIL; NIL == var249; var249 = Types.sublisp_null(var252)) {
                var240.resetMultipleValues();
                final SubLObject var250 = f6632(var243, var248, (SubLObject)NIL);
                final SubLObject var251 = var240.secondMultipleValue();
                var252 = var240.thirdMultipleValue();
                var240.resetMultipleValues();
                if (NIL != var252) {
                    final SubLObject var253 = var250;
                    final SubLObject var254 = var251;
                    module0012.note_percent_progress(module0012.$g84$.getDynamicValue(var240), module0012.$g83$.getDynamicValue(var240));
                    module0012.$g84$.setDynamicValue(Numbers.add(module0012.$g84$.getDynamicValue(var240), (SubLObject)ONE_INTEGER), var240);
                    f6618(var253, var241, var254);
                }
                var248 = var252;
            }
            module0012.f479();
        }
        finally {
            module0012.$g78$.rebind(var247, var240);
            module0012.$g77$.rebind(var246, var240);
            module0012.$g76$.rebind(var245, var240);
            module0012.$g75$.rebind(var244, var240);
        }
        f6615(var241);
        f6615(var242);
        return var237;
    }
    
    public static SubLObject f6661(final SubLObject var13) {
        return conses_high.getf(f6470(var13), (SubLObject)$ic313$, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f6662(final SubLObject var13, SubLObject var94) {
        if (var94 == UNPROVIDED) {
            var94 = (SubLObject)T;
        }
        f6483(var13, conses_high.putf(f6470(var13), (SubLObject)$ic313$, var94));
        return var13;
    }
    
    public static SubLObject f6663(final SubLObject var13) {
        return f6661(var13);
    }
    
    public static SubLObject f6608(final SubLObject var44) {
        final SubLThread var45 = SubLProcess.currentSubLThread();
        return Numbers.max($g1216$.getDynamicValue(var45), Numbers.round(Numbers.multiply(Numbers.divide(var44, (SubLObject)$ic314$), $g1217$.getDynamicValue(var45)), (SubLObject)UNPROVIDED));
    }
    
    public static SubLObject f6565(final SubLObject var13, final SubLObject var189) {
        f6482(var13, module0089.f6070(var189, f6466(var13)));
        return (SubLObject)NIL;
    }
    
    public static SubLObject f6620(final SubLObject var13, final SubLObject var52, final SubLObject var94) {
        return module0089.f6082(f6469(var13), var52, var94);
    }
    
    public static SubLObject f6622(final SubLObject var13, final SubLObject var52) {
        return module0089.f6077(f6469(var13), var52);
    }
    
    public static SubLObject f6664(final SubLObject var13, final SubLObject var52) {
        return module0089.f6087(f6469(var13), var52);
    }
    
    public static SubLObject f6665(final SubLObject var13, SubLObject var118, SubLObject var241) {
        if (var118 == UNPROVIDED) {
            var118 = (SubLObject)NIL;
        }
        if (var241 == UNPROVIDED) {
            var241 = (SubLObject)NIL;
        }
        assert NIL != f6457(var13) : var13;
        final SubLObject var242 = f6459(var13);
        final SubLObject var243 = f6505(var242);
        final SubLObject var244 = f6543((SubLObject)UNPROVIDED);
        final SubLObject var245 = (SubLObject)((NIL != var241) ? $ic315$ : $ic316$);
        SubLObject var246 = (SubLObject)NIL;
        SubLObject var247 = (SubLObject)NIL;
        if (NIL == var118) {
            var118 = f6503(var242);
        }
        final SubLObject var248 = var118;
        f6666(var13, var244, var248, var245);
        final SubLObject var249 = f6464(var13);
        final SubLObject var250 = f6534(var244);
        var246 = (SubLObject)((NIL == var250) ? NIL : Functions.funcall(var249, var250));
        var247 = f6536(var244);
        var118 = Numbers.add(var248, f6531(var244));
        if (var118.numGE(var243)) {
            var118 = (SubLObject)NIL;
        }
        return Values.values(var246, var247, var118);
    }
    
    public static SubLObject f6632(final SubLObject var13, SubLObject var118, SubLObject var241) {
        if (var118 == UNPROVIDED) {
            var118 = (SubLObject)NIL;
        }
        if (var241 == UNPROVIDED) {
            var241 = (SubLObject)NIL;
        }
        assert NIL != f6457(var13) : var13;
        final SubLObject var242 = f6459(var13);
        final SubLObject var243 = f6464(var13);
        final SubLObject var244 = f6507(var242);
        SubLObject var245 = (SubLObject)(var118.isNumber() ? var118 : ZERO_INTEGER);
        SubLObject var246 = (SubLObject)makeBoolean(var245.numG(var244) || var245.numE(var244));
        final SubLObject var247 = f6552((SubLObject)UNPROVIDED);
        final SubLObject var248 = f6543((SubLObject)UNPROVIDED);
        final SubLObject var249 = (SubLObject)((NIL != var241) ? $ic315$ : $ic316$);
        if (NIL != var246) {
            var245 = (SubLObject)NIL;
        }
        while (NIL == var246) {
            f6642(var13, var245, var247);
            if (NIL == f6571(var247)) {
                var246 = (SubLObject)T;
                f6667(var13, var247, var248, var249);
                var245 = Numbers.add(var245, (SubLObject)ONE_INTEGER);
            }
            else {
                var245 = Numbers.add(var245, (SubLObject)ONE_INTEGER);
                if (var245.numL(var244)) {
                    continue;
                }
                var246 = (SubLObject)T;
                var245 = (SubLObject)NIL;
            }
        }
        final SubLObject var250 = f6534(var248);
        final SubLObject var251 = (SubLObject)((NIL == var250) ? NIL : Functions.funcall(var243, var250));
        final SubLObject var252 = f6536(var248);
        return Values.values(var251, var252, var245);
    }
    
    public static SubLObject f6619(final SubLObject var13, final SubLObject var52, final SubLObject var94) {
        final SubLThread var95 = SubLProcess.currentSubLThread();
        var95.resetMultipleValues();
        final SubLObject var96 = f6668(var13, var52, (SubLObject)UNPROVIDED);
        final SubLObject var97 = var95.secondMultipleValue();
        final SubLObject var98 = var95.thirdMultipleValue();
        final SubLObject var99 = var95.fourthMultipleValue();
        var95.resetMultipleValues();
        final SubLObject var100 = var96;
        if (var100.eql((SubLObject)$ic317$)) {
            f6669(var13, var52, var94, var97, var98, var99, (SubLObject)UNPROVIDED);
        }
        else if (var100.eql((SubLObject)$ic234$)) {
            f6670(var13, var52, var94, var97, var98, var99);
        }
        else if (var100.eql((SubLObject)$ic318$)) {
            Errors.error((SubLObject)$ic319$);
        }
        else {
            Errors.error((SubLObject)$ic320$, var96, var52, var97);
        }
        return var13;
    }
    
    public static SubLObject f6669(final SubLObject var13, final SubLObject var52, final SubLObject var94, final SubLObject var185, final SubLObject var190, final SubLObject var53, SubLObject var245) {
        if (var245 == UNPROVIDED) {
            var245 = (SubLObject)T;
        }
        final SubLObject var246 = f6463(var13);
        SubLObject var247 = (SubLObject)NIL;
        f6671(var52, var94, var246, var53);
        var247 = f6672(var13, var53);
        f6673(var13, var247, var53);
        f6550(var190, var247);
        if (NIL != var245) {
            f6674(var13, var185, var190, (SubLObject)UNPROVIDED);
        }
        f6675(var13, (SubLObject)makeBoolean(NIL == var245));
        return var13;
    }
    
    public static SubLObject f6670(final SubLObject var13, final SubLObject var52, final SubLObject var94, final SubLObject var185, final SubLObject var190, final SubLObject var53) {
        final SubLObject var191 = f6463(var13);
        final SubLObject var192 = f6543((SubLObject)UNPROVIDED);
        SubLObject var193 = (SubLObject)NIL;
        f6666(var13, var192, f6548(var190), (SubLObject)UNPROVIDED);
        if (!var94.equalp(f6536(var192))) {
            f6671(var52, var94, var191, var53);
            if (f6531(var192).numE(f6531(var53))) {
                var193 = f6548(var190);
            }
            else {
                if (NIL != f6663(var13)) {
                    f6676(var13, f6548(var190), f6531(var192));
                }
                var193 = f6672(var13, var53);
            }
            f6673(var13, var193, var53);
            if (!var193.numE(f6548(var190))) {
                f6550(var190, var193);
                f6674(var13, var185, var190, (SubLObject)UNPROVIDED);
            }
        }
        return var13;
    }
    
    public static SubLObject f6625(final SubLObject var13, final SubLObject var52) {
        final SubLThread var53 = SubLProcess.currentSubLThread();
        var53.resetMultipleValues();
        final SubLObject var54 = f6668(var13, var52, (SubLObject)UNPROVIDED);
        final SubLObject var55 = var53.secondMultipleValue();
        final SubLObject var56 = var53.thirdMultipleValue();
        final SubLObject var57 = var53.fourthMultipleValue();
        var53.resetMultipleValues();
        final SubLObject var58 = var54;
        if (var58.eql((SubLObject)$ic234$)) {
            f6677(var13, var55, var56, var57);
        }
        else {
            if (var58.eql((SubLObject)$ic321$) || var58.eql((SubLObject)$ic318$) || var58.eql((SubLObject)$ic317$)) {
                return (SubLObject)NIL;
            }
            Errors.error((SubLObject)$ic320$, var54, var52, var55);
        }
        return var13;
    }
    
    public static SubLObject f6677(final SubLObject var13, final SubLObject var185, final SubLObject var190, final SubLObject var53) {
        if (NIL == f6571(var190) && NIL == f6569(var190)) {
            if (NIL != f6663(var13)) {
                f6676(var13, f6548(var190), f6531(var53));
            }
            f6678(var13);
            f6679(var13, var185);
            f6680(var13, var185);
            return var13;
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f6679(final SubLObject var13, final SubLObject var247) {
        return f6674(var13, var247, f6570(), (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f6680(final SubLObject var13, SubLObject var248) {
        final SubLObject var249 = f6552((SubLObject)UNPROVIDED);
        final SubLObject var250 = f6543((SubLObject)UNPROVIDED);
        SubLObject var251 = var248;
        SubLObject var252 = (SubLObject)NIL;
        while (NIL == var252) {
            var248 = f6681(var248, var13);
            f6642(var13, var248, var249);
            if (NIL != f6571(var249)) {
                var252 = (SubLObject)T;
            }
            else {
                final SubLObject var253 = f6549(var249);
                final SubLObject var254 = f6548(var249);
                SubLObject var255 = (SubLObject)NIL;
                f6666(var13, var250, var254, (SubLObject)$ic315$);
                var255 = f6682(var13, f6534(var250), var253);
                if (!var255.numE(var251)) {
                    continue;
                }
                f6674(var13, var251, var249, (SubLObject)UNPROVIDED);
                var251 = var248;
                f6679(var13, var251);
            }
        }
        return var13;
    }
    
    public static SubLObject f6682(final SubLObject var13, final SubLObject var52, final SubLObject var252) {
        final SubLThread var253 = SubLProcess.currentSubLThread();
        var253.resetMultipleValues();
        final SubLObject var254 = f6668(var13, var52, var252);
        final SubLObject var255 = var253.secondMultipleValue();
        final SubLObject var256 = var253.thirdMultipleValue();
        final SubLObject var257 = var253.fourthMultipleValue();
        var253.resetMultipleValues();
        return var255;
    }
    
    public static SubLObject f6675(final SubLObject var13, SubLObject var253) {
        if (var253 == UNPROVIDED) {
            var253 = (SubLObject)NIL;
        }
        final SubLObject var254 = f6459(var13);
        SubLObject var255 = f6506(var254);
        var255 = Numbers.add(var255, (SubLObject)ONE_INTEGER);
        f6519(var254, var255);
        if (NIL == var253) {
            f6616(var13);
            f6683(var13);
        }
        return var13;
    }
    
    public static SubLObject f6678(final SubLObject var13) {
        final SubLObject var14 = f6459(var13);
        SubLObject var15 = f6506(var14);
        var15 = Numbers.subtract(var15, (SubLObject)ONE_INTEGER);
        f6519(var14, var15);
        f6616(var13);
        return var13;
    }
    
    public static SubLObject f6623(final SubLObject var13, final SubLObject var52) {
        final SubLThread var53 = SubLProcess.currentSubLThread();
        var53.resetMultipleValues();
        final SubLObject var54 = f6668(var13, var52, (SubLObject)UNPROVIDED);
        final SubLObject var55 = var53.secondMultipleValue();
        final SubLObject var56 = var53.thirdMultipleValue();
        final SubLObject var57 = var53.fourthMultipleValue();
        var53.resetMultipleValues();
        final SubLObject var58 = var54;
        if (var58.eql((SubLObject)$ic317$)) {
            return Values.values((SubLObject)NIL, var54);
        }
        if (var58.eql((SubLObject)$ic234$)) {
            f6667(var13, var56, var57, (SubLObject)UNPROVIDED);
            return Values.values(f6536(var57), var54);
        }
        if (var58.eql((SubLObject)$ic318$)) {
            Errors.error((SubLObject)$ic322$, new SubLObject[] { var52, var55, var54, var56 });
        }
        else {
            Errors.error((SubLObject)$ic323$, new SubLObject[] { var52, var55, var54, var56 });
        }
        return var13;
    }
    
    public static SubLObject f6684(final SubLObject var1, final SubLObject var2) {
        f6685(var1, var2, (SubLObject)ZERO_INTEGER);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f6686(final SubLObject var1) {
        return (SubLObject)((var1.getClass() == $sX8148_native.class) ? T : NIL);
    }
    
    public static SubLObject f6687(final SubLObject var1) {
        assert NIL != f6686(var1) : var1;
        return var1.getField2();
    }
    
    public static SubLObject f6688(final SubLObject var1) {
        assert NIL != f6686(var1) : var1;
        return var1.getField3();
    }
    
    public static SubLObject f6689(final SubLObject var1, final SubLObject var4) {
        assert NIL != f6686(var1) : var1;
        return var1.setField2(var4);
    }
    
    public static SubLObject f6690(final SubLObject var1, final SubLObject var4) {
        assert NIL != f6686(var1) : var1;
        return var1.setField3(var4);
    }
    
    public static SubLObject f6691(SubLObject var5) {
        if (var5 == UNPROVIDED) {
            var5 = (SubLObject)NIL;
        }
        final SubLObject var6 = (SubLObject)new $sX8148_native();
        SubLObject var7;
        SubLObject var8;
        SubLObject var9;
        SubLObject var10;
        for (var7 = (SubLObject)NIL, var7 = var5; NIL != var7; var7 = conses_high.cddr(var7)) {
            var8 = var7.first();
            var9 = conses_high.cadr(var7);
            var10 = var8;
            if (var10.eql((SubLObject)$ic95$)) {
                f6689(var6, var9);
            }
            else if (var10.eql((SubLObject)$ic337$)) {
                f6690(var6, var9);
            }
            else {
                Errors.error((SubLObject)$ic48$, var8);
            }
        }
        return var6;
    }
    
    public static SubLObject f6692(final SubLObject var11, final SubLObject var12) {
        Functions.funcall(var12, var11, (SubLObject)$ic49$, (SubLObject)$ic338$, (SubLObject)TWO_INTEGER);
        Functions.funcall(var12, var11, (SubLObject)$ic51$, (SubLObject)$ic95$, f6687(var11));
        Functions.funcall(var12, var11, (SubLObject)$ic51$, (SubLObject)$ic337$, f6688(var11));
        Functions.funcall(var12, var11, (SubLObject)$ic52$, (SubLObject)$ic338$, (SubLObject)TWO_INTEGER);
        return var11;
    }
    
    public static SubLObject f6693(final SubLObject var11, final SubLObject var12) {
        return f6692(var11, var12);
    }
    
    public static SubLObject f6694(SubLObject var44) {
        if (var44 == UNPROVIDED) {
            var44 = (SubLObject)NIL;
        }
        final SubLObject var45 = f6691((SubLObject)UNPROVIDED);
        f6689(var45, var44);
        f6690(var45, (SubLObject)ZERO_INTEGER);
        return var45;
    }
    
    public static SubLObject f6685(final SubLObject var14, final SubLObject var2, final SubLObject var58) {
        PrintLow.format(var2, (SubLObject)$ic340$, f6687(var14), f6688(var14));
        return (SubLObject)NIL;
    }
    
    public static SubLObject f6695(final SubLObject var258, final SubLObject var259) {
        f6689(var259, f6687(var258));
        f6690(var259, f6688(var258));
        return var259;
    }
    
    public static SubLObject f6696(final SubLObject var13, final SubLObject var260, final SubLObject var244) {
        final SubLObject var261 = f6458(var13);
        streams_high.file_position(var261, var244);
        if (!streams_high.file_position(var261, (SubLObject)UNPROVIDED).numE(var244)) {
            Errors.error((SubLObject)$ic341$, var244, streams_high.file_position(var261, (SubLObject)UNPROVIDED));
        }
        f6697(var261, f6687(var260));
        f6698(var261, f6688(var260));
        streams_high.force_output(var261);
        return var13;
    }
    
    public static SubLObject f6699(final SubLObject var13, final SubLObject var260, final SubLObject var244) {
        final SubLObject var261 = f6458(var13);
        streams_high.file_position(var261, var244);
        if (!streams_high.file_position(var261, (SubLObject)UNPROVIDED).numE(var244)) {
            Errors.error((SubLObject)$ic342$, var244, streams_high.file_position(var261, (SubLObject)UNPROVIDED));
        }
        f6689(var260, f6644(var261));
        f6690(var260, f6700(var261));
        return var260;
    }
    
    public static SubLObject f6676(final SubLObject var13, final SubLObject var244, final SubLObject var261) {
        if (!var261.numGE($g1236$.getGlobalValue())) {
            return var13;
        }
        final SubLObject var262 = f6459(var13);
        final SubLObject var263 = f6508(var262);
        final SubLObject var264 = f6694(var261);
        if (var263.isPositive()) {
            final SubLObject var265 = f6701(var13, var263, var264, var244);
            f6521(var262, var265);
        }
        else {
            f6521(var262, var244);
            f6696(var13, var264, var244);
        }
        return var13;
    }
    
    public static SubLObject f6701(final SubLObject var13, final SubLObject var263, final SubLObject var257, SubLObject var265) {
        SubLObject var266 = f6694((SubLObject)UNPROVIDED);
        SubLObject var267 = var263;
        final SubLObject var268 = f6694((SubLObject)UNPROVIDED);
        SubLObject var269 = (SubLObject)NIL;
        if (var265.numL(var263)) {
            if (Numbers.add(var265, f6687(var257)).numE(var263)) {
                f6699(var13, var268, var263);
                f6689(var257, Numbers.add(f6687(var257), f6687(var268)));
                f6690(var257, f6688(var268));
            }
            else {
                f6690(var257, var263);
            }
            f6696(var13, var257, var265);
            return var265;
        }
        while (NIL == var269 && var267.numL(var265)) {
            f6699(var13, var266, var267);
            if (f6688(var266).isPositive() && f6688(var266).numL(var265)) {
                var267 = f6688(var266);
            }
            else {
                var269 = (SubLObject)T;
            }
        }
        f6690(var257, f6688(var266));
        f6690(var266, var265);
        if (Numbers.add(var267, f6687(var266)).numE(var265)) {
            f6689(var257, Numbers.add(f6687(var266), f6687(var257)));
            var265 = var267;
            var266 = (SubLObject)NIL;
        }
        if (Numbers.add(var265, f6687(var257)).numE(f6688(var257))) {
            f6699(var13, var268, f6688(var257));
            f6689(var257, Numbers.add(f6687(var268), f6687(var257)));
            f6690(var257, f6688(var268));
        }
        if (NIL != f6686(var266)) {
            f6696(var13, var266, var267);
        }
        if (NIL != f6686(var257)) {
            f6696(var13, var257, var265);
        }
        return var263;
    }
    
    public static SubLObject f6702(final SubLObject var13, final SubLObject var269) {
        final SubLObject var270 = f6459(var13);
        final SubLObject var271 = f6508(var270);
        final SubLObject var272 = f6694((SubLObject)UNPROVIDED);
        final SubLObject var273 = f6694((SubLObject)UNPROVIDED);
        SubLObject var274 = var271;
        SubLObject var275 = (SubLObject)NIL;
        SubLObject var276 = (SubLObject)NIL;
        SubLObject var277 = (SubLObject)NIL;
        SubLObject var278 = (SubLObject)NIL;
        f6699(var13, var272, var274);
        if (f6687(var272).numGE(var269)) {
            var278 = var274;
            var276 = Numbers.subtract(f6687(var272), var269);
            if (var276.numL($g1236$.getGlobalValue())) {
                f6521(var270, f6688(var272));
            }
            else {
                f6689(var272, var276);
                var274 = Numbers.add(var274, var269);
                f6696(var13, var272, var274);
                f6521(var270, var274);
            }
            return var278;
        }
        var275 = f6688(var272);
        if (!var275.isPositive()) {
            return (SubLObject)NIL;
        }
        f6699(var13, var273, var275);
        while (NIL == var277 && f6687(var273).numL(var269)) {
            var274 = var275;
            f6695(var273, var272);
            var275 = f6688(var272);
            if (var275.isPositive()) {
                f6699(var13, var273, var275);
            }
            else {
                var277 = (SubLObject)T;
            }
        }
        if (NIL == var277) {
            var278 = var275;
            var276 = Numbers.subtract(f6687(var273), var269);
            if (var276.numL($g1236$.getGlobalValue())) {
                f6690(var272, f6688(var273));
                f6696(var13, var272, var274);
            }
            else {
                f6689(var273, var276);
                var275 = Numbers.add(var275, var269);
                f6690(var272, var275);
                f6696(var13, var272, var274);
                f6696(var13, var273, var275);
            }
        }
        return var278;
    }
    
    public static SubLObject f6609(final SubLObject var13) {
        f6616(var13);
        f6703(var13);
        f6704(var13, (SubLObject)UNPROVIDED);
        return var13;
    }
    
    public static SubLObject f6703(final SubLObject var13) {
        final SubLObject var14 = f6458(var13);
        final SubLObject var15 = f6459(var13);
        final SubLObject var16 = f6503(var15);
        final SubLObject var17 = f6504(var15);
        compatibility.set_file_position(var14, var16);
        streams_high.force_output(var14);
        compatibility.set_file_position(var14, var17);
        streams_high.force_output(var14);
        return var13;
    }
    
    public static SubLObject f6704(final SubLObject var13, SubLObject var189) {
        if (var189 == UNPROVIDED) {
            var189 = (SubLObject)NIL;
        }
        final SubLObject var190 = f6458(var13);
        final SubLObject var191 = f6459(var13);
        if (!var189.isInteger()) {
            var189 = f6507(var191);
        }
        SubLObject var192;
        for (var192 = (SubLObject)NIL, var192 = (SubLObject)ZERO_INTEGER; var192.numL(var189); var192 = Numbers.add(var192, (SubLObject)ONE_INTEGER)) {
            f6705(var190, $g1227$.getGlobalValue());
        }
        streams_high.force_output(var190);
        return var13;
    }
    
    public static SubLObject f6562() {
        return $g1238$.getGlobalValue();
    }
    
    public static SubLObject f6706(final SubLObject var185) {
        return Numbers.multiply(var185, $g1238$.getGlobalValue());
    }
    
    public static SubLObject f6707(final SubLObject var189) {
        return f6706(var189);
    }
    
    public static SubLObject f6708(final SubLObject var49, final SubLObject var192, final SubLObject var193) {
        return (SubLObject)makeBoolean(!var49.numL(var192) && var49.numL(var193));
    }
    
    public static SubLObject f6574(final SubLObject var49, final SubLObject var13) {
        final SubLObject var50 = f6459(var13);
        return f6708(var49, f6503(var50), f6504(var50));
    }
    
    public static SubLObject f6709(final SubLObject var49, final SubLObject var279, final SubLObject var189) {
        return (SubLObject)makeBoolean(!var49.numL(var279) && var49.numL(Numbers.add(var279, f6707(var189))));
    }
    
    public static SubLObject f6710(final SubLObject var13) {
        final SubLObject var14 = f6459(var13);
        return f6707(f6507(var14));
    }
    
    public static SubLObject f6711(final SubLObject var13, final SubLObject var280) {
        return Numbers.add(var280, f6504(f6459(var13)));
    }
    
    public static SubLObject f6712(final SubLObject var13, final SubLObject var185) {
        final SubLObject var186 = f6706(var185);
        return f6711(var13, var186);
    }
    
    public static SubLObject f6713(final SubLObject var13, final SubLObject var185) {
        final SubLThread var186 = SubLProcess.currentSubLThread();
        final SubLObject var187 = f6507(f6459(var13));
        if (NIL == Errors.$ignore_mustsP$.getDynamicValue(var186) && (!var185.isInteger() || var185.isNegative() || !var185.numL(var187))) {
            Errors.error((SubLObject)$ic343$, var185, var187);
        }
        return var13;
    }
    
    public static SubLObject f6714(final SubLObject var13, final SubLObject var190) {
        final SubLThread var191 = SubLProcess.currentSubLThread();
        final SubLObject var192 = f6504(f6459(var13));
        final SubLObject var193 = f6548(var190);
        if (NIL == Errors.$ignore_mustsP$.getDynamicValue(var191) && (NIL == module0004.f106(var193) || !var193.numL(var192))) {
            Errors.error((SubLObject)$ic344$, var193, var192);
        }
        return var13;
    }
    
    public static SubLObject f6705(final SubLObject var2, final SubLObject var190) {
        f6698(var2, f6548(var190));
        f6697(var2, f6549(var190));
        return var2;
    }
    
    public static SubLObject f6715(final SubLObject var2, final SubLObject var190) {
        f6550(var190, f6700(var2));
        f6551(var190, f6644(var2));
        return var190;
    }
    
    public static SubLObject f6642(final SubLObject var13, final SubLObject var185, final SubLObject var190) {
        f6713(var13, var185);
        final SubLObject var191 = f6712(var13, var185);
        final SubLObject var192 = f6458(var13);
        streams_high.file_position(var192, var191);
        f6715(var192, var190);
        if (NIL == f6549(var190)) {
            Errors.warn((SubLObject)$ic345$, var185);
            f6551(var190, f6549($g1227$.getGlobalValue()));
        }
        if (NIL == f6548(var190)) {
            Errors.warn((SubLObject)$ic346$, var185);
            f6550(var190, f6548($g1227$.getGlobalValue()));
        }
        f6714(var13, var190);
        return var190;
    }
    
    public static SubLObject f6674(final SubLObject var13, final SubLObject var185, final SubLObject var190, SubLObject var284) {
        if (var284 == UNPROVIDED) {
            var284 = (SubLObject)T;
        }
        f6713(var13, var185);
        f6714(var13, var190);
        final SubLObject var285 = f6712(var13, var185);
        final SubLObject var286 = f6458(var13);
        streams_high.file_position(var286, var285);
        f6705(var286, var190);
        if (NIL != var284) {
            streams_high.force_output(var286);
        }
        return var190;
    }
    
    public static SubLObject f6716(final SubLObject var252, final SubLObject var13) {
        final SubLObject var253 = f6507(f6459(var13));
        final SubLObject var254 = Numbers.subtract(var253, (SubLObject)ONE_INTEGER);
        return Numbers.logand(Numbers.multiply(var252, $g1239$.getGlobalValue()), var254);
    }
    
    public static SubLObject f6560(SubLObject var44) {
        if (var44.numL($g1240$.getGlobalValue())) {
            var44 = $g1240$.getGlobalValue();
        }
        SubLObject var45 = $g1241$.getGlobalValue();
        for (SubLObject var46 = Numbers.integerDivide(Numbers.multiply(var45, (SubLObject)THREE_INTEGER), (SubLObject)FOUR_INTEGER); var46.numL(var44); var46 = Numbers.integerDivide(Numbers.multiply(var45, (SubLObject)THREE_INTEGER), (SubLObject)FOUR_INTEGER)) {
            var45 = Numbers.add(var45, var45);
        }
        return var45;
    }
    
    public static SubLObject f6717(SubLObject var185, final SubLObject var13) {
        SubLObject var186;
        for (var186 = f6507(f6459(var13)), var185 = Numbers.add(var185, $g1240$.getGlobalValue()); var185.numGE(var186); var185 = Numbers.subtract(var185, var186)) {}
        return var185;
    }
    
    public static SubLObject f6681(SubLObject var185, final SubLObject var13) {
        SubLObject var186;
        for (var186 = f6507(f6459(var13)), var185 = Numbers.subtract(var185, $g1240$.getGlobalValue()); var185.isNegative(); var185 = Numbers.add(var185, var186)) {}
        return var185;
    }
    
    public static SubLObject f6668(final SubLObject var13, final SubLObject var52, SubLObject var286) {
        if (var286 == UNPROVIDED) {
            var286 = (SubLObject)NIL;
        }
        final SubLThread var287 = SubLProcess.currentSubLThread();
        final SubLObject var288 = f6552((SubLObject)UNPROVIDED);
        final SubLObject var289 = f6543((SubLObject)UNPROVIDED);
        final SubLObject var290 = f6467(var13);
        final SubLObject var291 = var286.isNumber() ? var286 : f6576(var52, var290);
        SubLObject var292 = f6716(var291, var13);
        final SubLObject var293 = f6717(var292, var13);
        SubLObject var294 = (SubLObject)ZERO_INTEGER;
        final SubLObject var295 = (SubLObject)NIL;
        if (NIL != $g1231$.getDynamicValue(var287)) {
            PrintLow.format($g1231$.getDynamicValue(var287), (SubLObject)$ic348$, new SubLObject[] { var52, var292, var291 });
        }
        while (NIL == var295) {
            f6642(var13, var292, var288);
            var294 = Numbers.add(var294, (SubLObject)ONE_INTEGER);
            if (NIL != f6571(var288)) {
                f6551(var288, var291);
                if (NIL != $g1231$.getDynamicValue(var287)) {
                    PrintLow.format($g1231$.getDynamicValue(var287), (SubLObject)$ic349$, var294, var292);
                }
                return Values.values((SubLObject)$ic317$, var292, var288, var289, var294);
            }
            if (NIL != f6718(var13, var52, var291, var288, var289)) {
                if (NIL != $g1231$.getDynamicValue(var287)) {
                    PrintLow.format($g1231$.getDynamicValue(var287), (SubLObject)$ic350$, var294, var292);
                }
                return Values.values((SubLObject)$ic234$, var292, var288, var289, var294);
            }
            if (var292.numE(var293)) {
                if (NIL != $g1231$.getDynamicValue(var287)) {
                    PrintLow.format($g1231$.getDynamicValue(var287), (SubLObject)$ic351$, var294, var292);
                }
                return Values.values((SubLObject)$ic318$, var292, var288, var289, var294);
            }
            var292 = f6681(var292, var13);
            if (NIL == $g1231$.getDynamicValue(var287)) {
                continue;
            }
            PrintLow.format($g1231$.getDynamicValue(var287), (SubLObject)$ic352$, var292);
        }
        if (NIL != $g1231$.getDynamicValue(var287)) {
            PrintLow.format($g1231$.getDynamicValue(var287), (SubLObject)$ic353$, var294, var292);
        }
        return Values.values((SubLObject)$ic223$, var292, var288, var289, var294);
    }
    
    public static SubLObject f6718(final SubLObject var13, final SubLObject var52, final SubLObject var48, final SubLObject var190, final SubLObject var53) {
        final SubLObject var191 = f6466(var13);
        final SubLObject var192 = f6548(var190);
        if (!var48.numE(f6549(var190))) {
            return (SubLObject)NIL;
        }
        f6666(var13, var53, var192, (SubLObject)$ic315$);
        return Functions.funcall(var191, var52, f6534(var53));
    }
    
    public static SubLObject f6667(final SubLObject var13, final SubLObject var190, final SubLObject var53, SubLObject var289) {
        if (var289 == UNPROVIDED) {
            var289 = (SubLObject)$ic316$;
        }
        final SubLObject var290 = f6548(var190);
        f6666(var13, var53, var290, var289);
        return var53;
    }
    
    public static SubLObject f6683(final SubLObject var13) {
        if (NIL != f6719(var13)) {
            f6720(var13);
        }
        return var13;
    }
    
    public static SubLObject f6720(final SubLObject var13) {
        final SubLThread var14 = SubLProcess.currentSubLThread();
        final SubLObject var15 = f6459(var13);
        var14.resetMultipleValues();
        final SubLObject var16 = f6721(var13);
        final SubLObject var17 = var14.secondMultipleValue();
        var14.resetMultipleValues();
        f6722(var13, var16, var17);
        f6723(var13, var16, var17);
        f6517(var15, var16);
        f6520(var15, var17);
        f6616(var13);
        return var13;
    }
    
    public static SubLObject f6719(final SubLObject var13) {
        final SubLObject var14 = f6459(var13);
        final SubLObject var15 = f6506(var14);
        final SubLObject var16 = f6507(var14);
        return Numbers.numG(var15, Numbers.integerDivide(Numbers.multiply(var16, $g1242$.getGlobalValue()), (SubLObject)$ic314$));
    }
    
    public static SubLObject f6721(final SubLObject var13) {
        final SubLThread var14 = SubLProcess.currentSubLThread();
        final SubLObject var15 = f6459(var13);
        SubLObject var16 = f6507(var15);
        var16 = Numbers.add(var16, var16);
        var14.resetMultipleValues();
        final SubLObject var17 = f6724(var13, (SubLObject)UNPROVIDED);
        final SubLObject var18 = var14.secondMultipleValue();
        var14.resetMultipleValues();
        return Values.values(var18, var16);
    }
    
    public static SubLObject f6722(final SubLObject var13, final SubLObject var290, final SubLObject var291) {
        final SubLObject var292 = f6458(var13);
        streams_high.file_position(var292, var290);
        f6704(var13, var291);
        return var13;
    }
    
    public static SubLObject f6725(final SubLObject var13, SubLObject var294, SubLObject var295) {
        final SubLObject var296 = f6458(var13);
        final SubLObject var297 = Vectors.make_vector($g1243$.getGlobalValue(), (SubLObject)UNPROVIDED);
        final SubLObject var298 = f6710(var13);
        final SubLObject var299 = Numbers.integerDivide(var298, $g1243$.getGlobalValue());
        final SubLObject var300 = Numbers.mod(var298, $g1243$.getGlobalValue());
        SubLObject var301;
        for (var301 = (SubLObject)NIL, var301 = (SubLObject)ZERO_INTEGER; var301.numL(var299); var301 = Numbers.add(var301, (SubLObject)ONE_INTEGER)) {
            f6726(var296, var297, $g1243$.getGlobalValue(), var294, var295);
            var294 = Numbers.add(var294, $g1243$.getGlobalValue());
            var295 = Numbers.add(var295, $g1243$.getGlobalValue());
        }
        if (var300.isPositive()) {
            f6726(var296, var297, var300, var294, var295);
        }
        return var13;
    }
    
    public static SubLObject f6723(final SubLObject var13, final SubLObject var290, final SubLObject var291) {
        final SubLObject var292 = f6459(var13);
        final SubLObject var293 = f6552((SubLObject)UNPROVIDED);
        final SubLObject var294 = Vectors.make_vector($g1244$.getGlobalValue(), (SubLObject)UNPROVIDED);
        final SubLObject var295 = Vectors.make_vector($g1244$.getGlobalValue(), (SubLObject)UNPROVIDED);
        SubLObject var296 = (SubLObject)ZERO_INTEGER;
        SubLObject var297;
        SubLObject var298;
        for (var297 = f6507(var292), var298 = (SubLObject)NIL, var298 = (SubLObject)ZERO_INTEGER; var298.numL(var297); var298 = Numbers.add(var298, (SubLObject)ONE_INTEGER)) {
            f6642(var13, var298, var293);
            if (NIL == f6571(var293)) {
                Vectors.set_aref(var294, var296, f6549(var293));
                Vectors.set_aref(var295, var296, f6548(var293));
                var296 = Numbers.add(var296, (SubLObject)ONE_INTEGER);
            }
            if (var296.numE(Sequences.length(var294))) {
                f6727(var13, var294, var295, var296, var290, var291);
                var296 = (SubLObject)ZERO_INTEGER;
            }
        }
        if (!var296.isZero()) {
            f6727(var13, var294, var295, var296, var290, var291);
        }
        return var13;
    }
    
    public static SubLObject f6728(final SubLObject var66, final SubLObject var67) {
        SubLObject var69;
        final SubLObject var68 = var69 = var66.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var69, var68, (SubLObject)$ic355$);
        final SubLObject var70 = var69.rest();
        var69 = var69.first();
        SubLObject var71 = (SubLObject)NIL;
        SubLObject var72 = (SubLObject)NIL;
        SubLObject var73 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var69, var68, (SubLObject)$ic355$);
        var71 = var69.first();
        var69 = var69.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var69, var68, (SubLObject)$ic355$);
        var72 = var69.first();
        var69 = var69.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var69, var68, (SubLObject)$ic355$);
        var73 = var69.first();
        var69 = var69.rest();
        if (NIL == var69) {
            final SubLObject var74;
            var69 = (var74 = var70);
            final SubLObject var75 = (SubLObject)$ic356$;
            final SubLObject var76 = (SubLObject)$ic357$;
            final SubLObject var77 = (SubLObject)$ic358$;
            return (SubLObject)ConsesLow.listS((SubLObject)$ic244$, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(var75, (SubLObject)ConsesLow.list((SubLObject)$ic11$, var71)), (SubLObject)ConsesLow.list(var76, (SubLObject)ConsesLow.list((SubLObject)$ic77$, var75)), (SubLObject)ConsesLow.list(var77, (SubLObject)ConsesLow.list((SubLObject)$ic83$, var75))), (SubLObject)ConsesLow.list((SubLObject)$ic359$, (SubLObject)ConsesLow.list((SubLObject)$ic77$, var75), var72), (SubLObject)ConsesLow.list((SubLObject)$ic359$, (SubLObject)ConsesLow.list((SubLObject)$ic83$, var75), var73), ConsesLow.append(var74, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)$ic359$, (SubLObject)ConsesLow.list((SubLObject)$ic77$, var75), var76), (SubLObject)ConsesLow.list((SubLObject)$ic359$, (SubLObject)ConsesLow.list((SubLObject)$ic83$, var75), var77))));
        }
        cdestructuring_bind.cdestructuring_bind_error(var68, (SubLObject)$ic355$);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f6727(final SubLObject var13, final SubLObject var312, final SubLObject var313, final SubLObject var183, final SubLObject var290, final SubLObject var291) {
        final SubLThread var314 = SubLProcess.currentSubLThread();
        final SubLObject var315 = f6543((SubLObject)UNPROVIDED);
        final SubLObject var316 = f6459(var13);
        final SubLObject var317 = f6504(var316);
        final SubLObject var318 = f6507(var316);
        f6517(var316, var290);
        f6520(var316, var291);
        SubLObject var319;
        SubLObject var320;
        SubLObject var321;
        SubLObject var322;
        SubLObject var323;
        SubLObject var324;
        SubLObject var325;
        SubLObject var326;
        for (var319 = (SubLObject)NIL, var319 = (SubLObject)ZERO_INTEGER; var319.numL(var183); var319 = Numbers.add(var319, (SubLObject)ONE_INTEGER)) {
            var320 = Vectors.aref(var312, var319);
            var321 = Vectors.aref(var313, var319);
            var322 = (SubLObject)NIL;
            f6666(var13, var315, var321, (SubLObject)$ic315$);
            var322 = f6534(var315);
            var314.resetMultipleValues();
            var323 = f6668(var13, var322, var320);
            var324 = var314.secondMultipleValue();
            var325 = var314.thirdMultipleValue();
            var326 = var314.fourthMultipleValue();
            var314.resetMultipleValues();
            f6729(var13, var323, var324, var325, var321);
        }
        f6517(var316, var317);
        f6520(var316, var318);
        return var13;
    }
    
    public static SubLObject f6729(final SubLObject var13, final SubLObject var99, final SubLObject var185, final SubLObject var190, final SubLObject var49) {
        if (var99 != $ic317$) {
            Errors.error((SubLObject)$ic360$, var99);
        }
        f6550(var190, var49);
        f6674(var13, var185, var190, (SubLObject)UNPROVIDED);
        return var13;
    }
    
    public static SubLObject f6563() {
        return $g1234$.getGlobalValue();
    }
    
    public static SubLObject f6671(final SubLObject var52, final SubLObject var14, final SubLObject var18, SubLObject var53) {
        if (var53 == UNPROVIDED) {
            var53 = (SubLObject)NIL;
        }
        if (NIL == f6530(var53)) {
            var53 = f6577(var52, var14);
        }
        f6540(var53, var52);
        f6542(var53, var14);
        f6538(var53, (SubLObject)$ic361$);
        f6730(var53, var18);
        return var53;
    }
    
    public static SubLObject f6730(final SubLObject var53, final SubLObject var18) {
        f6539(var53, Functions.funcall(var18, f6534(var53)));
        f6541(var53, Functions.funcall(var18, f6536(var53)));
        f6537(var53, Numbers.add($g1234$.getGlobalValue(), f6533(var53), f6535(var53)));
        return var53;
    }
    
    public static SubLObject f6672(final SubLObject var13, final SubLObject var53) {
        final SubLObject var54 = f6459(var13);
        final SubLObject var55 = f6531(var53);
        SubLObject var56 = (SubLObject)NIL;
        SubLObject var57 = (SubLObject)NIL;
        if (NIL != f6663(var13) && f6508(var54).isPositive()) {
            var56 = f6702(var13, var55);
            if (NIL != var56) {
                return var56;
            }
        }
        var56 = f6505(var54);
        var57 = Numbers.add(var55, var56);
        if (var57.numG(f6504(var54))) {
            f6731(var13, var57);
            var56 = f6505(var54);
            var57 = Numbers.add(var55, var56);
        }
        f6518(var54, var57);
        return var56;
    }
    
    public static SubLObject f6673(final SubLObject var13, final SubLObject var244, final SubLObject var53) {
        return f6732(var13, var53, var244);
    }
    
    public static SubLObject f6732(final SubLObject var13, final SubLObject var53, final SubLObject var244) {
        final SubLThread var245 = SubLProcess.currentSubLThread();
        final SubLObject var246 = f6458(var13);
        final SubLObject var247 = f6462(var13);
        if (!var244.numE(streams_high.file_position(var246, (SubLObject)UNPROVIDED))) {
            streams_high.file_position(var246, var244);
            if (!streams_high.file_position(var246, (SubLObject)UNPROVIDED).numE(var244)) {
                Errors.error((SubLObject)$ic341$, var244, streams_high.file_position(var246, (SubLObject)UNPROVIDED));
            }
        }
        f6697(var246, f6531(var53));
        f6697(var246, f6533(var53));
        f6697(var246, f6535(var53));
        Functions.funcall(var247, f6534(var53), var246);
        Functions.funcall(var247, f6536(var53), var246);
        if (NIL == $g1235$.getDynamicValue(var245)) {
            streams_high.force_output(var246);
        }
        final SubLObject var248 = streams_high.file_position(var246, (SubLObject)UNPROVIDED);
        if (!var248.isInteger()) {
            Errors.error((SubLObject)$ic362$, var244);
        }
        if (var248.numL(var244)) {
            Errors.error((SubLObject)$ic363$, var248, var244);
        }
        final SubLObject var249 = f6531(var53);
        final SubLObject var250 = Numbers.subtract(var248, var244);
        if (!var249.numE(var250)) {
            if (var249.numL(var250)) {
                Errors.error((SubLObject)$ic364$, var249, var250);
            }
            else if (var249.numG(var250)) {
                Errors.error((SubLObject)$ic365$, var250, var249);
            }
        }
        return var13;
    }
    
    public static SubLObject f6666(final SubLObject var13, final SubLObject var53, final SubLObject var244, SubLObject var289) {
        if (var289 == UNPROVIDED) {
            var289 = (SubLObject)$ic316$;
        }
        final SubLObject var290 = f6458(var13);
        final SubLObject var291 = f6461(var13);
        streams_high.file_position(var290, var244);
        if (!streams_high.file_position(var290, (SubLObject)UNPROVIDED).numE(var244)) {
            Errors.error((SubLObject)$ic342$, var244, streams_high.file_position(var290, (SubLObject)UNPROVIDED));
        }
        f6537(var53, f6644(var290));
        f6539(var53, f6644(var290));
        f6541(var53, f6644(var290));
        f6540(var53, Functions.funcall(var291, var290));
        if (var289 != $ic315$) {
            f6542(var53, Functions.funcall(var291, var290));
            final SubLObject var292 = streams_high.file_position(var290, (SubLObject)UNPROVIDED);
            final SubLObject var293 = f6531(var53);
            final SubLObject var294 = Numbers.subtract(var292, var244);
            if (!var293.numE(var294)) {
                Errors.error((SubLObject)$ic366$, var293, var294);
            }
        }
        return var53;
    }
    
    public static SubLObject f6731(final SubLObject var13, final SubLObject var325) {
        final SubLThread var326 = SubLProcess.currentSubLThread();
        final SubLObject var327 = f6459(var13);
        var326.resetMultipleValues();
        final SubLObject var328 = f6724(var13, var325);
        final SubLObject var329 = var326.secondMultipleValue();
        var326.resetMultipleValues();
        f6725(var13, var328, var329);
        f6517(var327, var329);
        return var13;
    }
    
    public static SubLObject f6724(final SubLObject var13, SubLObject var325) {
        if (var325 == UNPROVIDED) {
            var325 = (SubLObject)NIL;
        }
        final SubLObject var326 = f6459(var13);
        final SubLObject var327 = f6504(var326);
        SubLObject var328 = Numbers.add(var327, var327);
        if (NIL == var325) {
            var325 = var328;
        }
        else {
            while (var328.numL(var325)) {
                var328 = Numbers.add(var328, var328);
            }
        }
        return Values.values(var327, var328);
    }
    
    public static SubLObject f6733(final SubLObject var66, final SubLObject var67) {
        SubLObject var69;
        final SubLObject var68 = var69 = var66.rest();
        SubLObject var70 = (SubLObject)NIL;
        SubLObject var71 = (SubLObject)NIL;
        SubLObject var72 = (SubLObject)NIL;
        SubLObject var73 = (SubLObject)NIL;
        SubLObject var74 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var69, var68, (SubLObject)$ic368$);
        var70 = var69.first();
        var69 = var69.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var69, var68, (SubLObject)$ic368$);
        var71 = var69.first();
        var69 = var69.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var69, var68, (SubLObject)$ic368$);
        var72 = var69.first();
        var69 = var69.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var69, var68, (SubLObject)$ic368$);
        var73 = var69.first();
        var69 = var69.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var69, var68, (SubLObject)$ic368$);
        var74 = var69.first();
        var69 = var69.rest();
        if (NIL == var69) {
            final SubLObject var75 = (SubLObject)ConsesLow.cons(var70, var71);
            SubLObject var76 = (SubLObject)NIL;
            var76 = conses_high.acons((SubLObject)$ic369$, var72, var76);
            var76 = conses_high.acons((SubLObject)$ic370$, var73, var76);
            var76 = conses_high.acons((SubLObject)$ic371$, var74, var76);
            return (SubLObject)ConsesLow.list((SubLObject)$ic372$, var75, (SubLObject)$ic367$, var76);
        }
        cdestructuring_bind.cdestructuring_bind_error(var68, (SubLObject)$ic368$);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f6611(final SubLObject var13) {
        final SubLObject var14 = f6458(var13);
        final SubLObject var15 = f6459(var13);
        streams_high.file_position(var14, $g1245$.getGlobalValue());
        f6513(var15, f6644(var14));
        f6514(var15, f6644(var14));
        f6515(var15, f6644(var14));
        f6734(var13);
        return var13;
    }
    
    public static SubLObject f6616(final SubLObject var13) {
        final SubLObject var14 = f6458(var13);
        final SubLObject var15 = f6459(var13);
        streams_high.file_position(var14, $g1245$.getGlobalValue());
        f6697(var14, f6500(var15));
        f6697(var14, f6501(var15));
        f6697(var14, f6502(var15));
        f6735(var13);
        streams_high.force_output(var14);
        return var13;
    }
    
    public static SubLObject f6734(final SubLObject var13) {
        final SubLObject var14 = f6458(var13);
        final SubLObject var15 = f6459(var13);
        f6516(var15, f6700(var14));
        f6517(var15, f6700(var14));
        f6518(var15, f6700(var14));
        f6519(var15, f6700(var14));
        f6520(var15, f6700(var14));
        f6521(var15, f6700(var14));
        f6522(var15, f6700(var14));
        f6523(var15, f6700(var14));
        f6524(var15, f6700(var14));
        if (f6511(var15).isPositive()) {
            f6736(var13);
        }
        else {
            f6525(var15, Vectors.make_vector((SubLObject)ZERO_INTEGER, (SubLObject)UNPROVIDED));
        }
        f6737(var13);
        return var13;
    }
    
    public static SubLObject f6735(final SubLObject var13) {
        final SubLObject var14 = f6458(var13);
        final SubLObject var15 = f6459(var13);
        f6698(var14, f6503(var15));
        f6698(var14, f6504(var15));
        f6698(var14, f6505(var15));
        f6698(var14, f6506(var15));
        f6698(var14, f6507(var15));
        f6698(var14, f6508(var15));
        f6698(var14, f6509(var15));
        f6698(var14, f6510(var15));
        f6698(var14, f6511(var15));
        f6738(var13);
        return var13;
    }
    
    public static SubLObject f6736(final SubLObject var13) {
        return var13;
    }
    
    public static SubLObject f6738(final SubLObject var13) {
        return var13;
    }
    
    public static SubLObject f6737(final SubLObject var13) {
        return var13;
    }
    
    public static SubLObject f6644(final SubLObject var2) {
        return streams_high.read_byte_sequence_to_positive_integer((SubLObject)FOUR_INTEGER, var2, (SubLObject)T, (SubLObject)NIL, (SubLObject)T);
    }
    
    public static SubLObject f6697(final SubLObject var2, final SubLObject var94) {
        return streams_high.write_positive_integer_as_byte_sequence(var94, (SubLObject)FOUR_INTEGER, var2, (SubLObject)T);
    }
    
    public static SubLObject f6700(final SubLObject var2) {
        return streams_high.read_byte_sequence_to_positive_integer((SubLObject)EIGHT_INTEGER, var2, (SubLObject)T, (SubLObject)NIL, (SubLObject)T);
    }
    
    public static SubLObject f6698(final SubLObject var2, final SubLObject var94) {
        return streams_high.write_positive_integer_as_byte_sequence(var94, (SubLObject)EIGHT_INTEGER, var2, (SubLObject)T);
    }
    
    public static SubLObject f6739(final SubLObject var2, final SubLObject var183) {
        SubLObject var184;
        for (var184 = (SubLObject)NIL, var184 = (SubLObject)ZERO_INTEGER; var184.numL(var183); var184 = Numbers.add(var184, (SubLObject)ONE_INTEGER)) {
            streams_high.write_byte((SubLObject)ZERO_INTEGER, var2);
        }
        return (SubLObject)ZERO_INTEGER;
    }
    
    public static SubLObject f6740(final SubLObject var2, final SubLObject var16) {
        SubLObject var17 = (SubLObject)NIL;
        SubLObject var18 = (SubLObject)NIL;
        SubLObject var19 = (SubLObject)NIL;
        var17 = f6644(var2);
        var18 = streams_high.file_position(var2, (SubLObject)UNPROVIDED);
        var19 = Functions.funcall(var16, var2);
        final SubLObject var20 = Numbers.add(var17, var18);
        final SubLObject var21 = streams_high.file_position(var2, (SubLObject)UNPROVIDED);
        if (!var20.numE(var21)) {
            Errors.error((SubLObject)$ic381$, var20, var21);
        }
        return Values.values(var17, var19);
    }
    
    public static SubLObject f6741(final SubLObject var2, final SubLObject var14, final SubLObject var17, final SubLObject var18) {
        final SubLObject var19 = Functions.funcall(var18, var14);
        SubLObject var20 = (SubLObject)NIL;
        f6697(var2, var19);
        var20 = streams_high.file_position(var2, (SubLObject)UNPROVIDED);
        Functions.funcall(var17, var14);
        final SubLObject var21 = streams_high.file_position(var2, (SubLObject)UNPROVIDED);
        final SubLObject var22 = Numbers.subtract(var21, var20);
        if (!var22.numE(var19)) {
            Errors.error((SubLObject)$ic382$, var19, var22);
        }
        return var14;
    }
    
    public static SubLObject f6742(final SubLObject var2, final SubLObject var296, final SubLObject var44) {
        SubLObject var297;
        SubLObject var298;
        for (var297 = (SubLObject)NIL, var297 = (SubLObject)ZERO_INTEGER; var297.numL(var44); var297 = Numbers.add(var297, (SubLObject)ONE_INTEGER)) {
            var298 = streams_high.read_byte(var2, (SubLObject)NIL, (SubLObject)$ic383$);
            if (var298 == $ic383$) {
                return var297;
            }
            Vectors.set_aref(var296, var297, var298);
        }
        return var44;
    }
    
    public static SubLObject f6743(final SubLObject var2, final SubLObject var296, final SubLObject var44) {
        SubLObject var297;
        for (var297 = (SubLObject)NIL, var297 = (SubLObject)ZERO_INTEGER; var297.numL(var44); var297 = Numbers.add(var297, (SubLObject)ONE_INTEGER)) {
            streams_high.write_byte(Vectors.aref(var296, var297), var2);
        }
        streams_high.force_output(var2);
        return var2;
    }
    
    public static SubLObject f6726(final SubLObject var2, final SubLObject var296, final SubLObject var44, final SubLObject var294, final SubLObject var295) {
        streams_high.file_position(var2, var294);
        final SubLObject var297 = f6742(var2, var296, var44);
        if (!var297.numE(var44)) {
            Errors.error((SubLObject)$ic384$, var44, var294, var295);
        }
        streams_high.file_position(var2, var295);
        f6743(var2, var296, var44);
        return var2;
    }
    
    public static SubLObject f6744() {
        final SubLThread var79 = SubLProcess.currentSubLThread();
        return Equality.eq((SubLObject)$ic385$, $g1247$.getDynamicValue(var79));
    }
    
    public static SubLObject f6745() {
        final SubLThread var79 = SubLProcess.currentSubLThread();
        return Equality.eq((SubLObject)$ic386$, $g1247$.getDynamicValue(var79));
    }
    
    public static SubLObject f6746() {
        final SubLThread var79 = SubLProcess.currentSubLThread();
        return Equality.eq((SubLObject)$ic387$, $g1247$.getDynamicValue(var79));
    }
    
    public static SubLObject f6747() {
        final SubLThread var79 = SubLProcess.currentSubLThread();
        return Errors.error((SubLObject)$ic388$, $g1247$.getDynamicValue(var79));
    }
    
    public static SubLObject f6748(final SubLObject var1, final SubLObject var2) {
        compatibility.default_struct_print_function(var1, var2, (SubLObject)ZERO_INTEGER);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f6749(final SubLObject var1) {
        return (SubLObject)((var1.getClass() == $sX8150_native.class) ? T : NIL);
    }
    
    public static SubLObject f6750(final SubLObject var1) {
        assert NIL != f6749(var1) : var1;
        return var1.getField2();
    }
    
    public static SubLObject f6751(final SubLObject var1) {
        assert NIL != f6749(var1) : var1;
        return var1.getField3();
    }
    
    public static SubLObject f6752(final SubLObject var1) {
        assert NIL != f6749(var1) : var1;
        return var1.getField4();
    }
    
    public static SubLObject f6753(final SubLObject var1) {
        assert NIL != f6749(var1) : var1;
        return var1.getField5();
    }
    
    public static SubLObject f6754(final SubLObject var1, final SubLObject var4) {
        assert NIL != f6749(var1) : var1;
        return var1.setField2(var4);
    }
    
    public static SubLObject f6755(final SubLObject var1, final SubLObject var4) {
        assert NIL != f6749(var1) : var1;
        return var1.setField3(var4);
    }
    
    public static SubLObject f6756(final SubLObject var1, final SubLObject var4) {
        assert NIL != f6749(var1) : var1;
        return var1.setField4(var4);
    }
    
    public static SubLObject f6757(final SubLObject var1, final SubLObject var4) {
        assert NIL != f6749(var1) : var1;
        return var1.setField5(var4);
    }
    
    public static SubLObject f6758(SubLObject var5) {
        if (var5 == UNPROVIDED) {
            var5 = (SubLObject)NIL;
        }
        final SubLObject var6 = (SubLObject)new $sX8150_native();
        SubLObject var7;
        SubLObject var8;
        SubLObject var9;
        SubLObject var10;
        for (var7 = (SubLObject)NIL, var7 = var5; NIL != var7; var7 = conses_high.cddr(var7)) {
            var8 = var7.first();
            var9 = conses_high.cadr(var7);
            var10 = var8;
            if (var10.eql((SubLObject)$ic405$)) {
                f6754(var6, var9);
            }
            else if (var10.eql((SubLObject)$ic406$)) {
                f6755(var6, var9);
            }
            else if (var10.eql((SubLObject)$ic407$)) {
                f6756(var6, var9);
            }
            else if (var10.eql((SubLObject)$ic408$)) {
                f6757(var6, var9);
            }
            else {
                Errors.error((SubLObject)$ic48$, var8);
            }
        }
        return var6;
    }
    
    public static SubLObject f6759(final SubLObject var11, final SubLObject var12) {
        Functions.funcall(var12, var11, (SubLObject)$ic49$, (SubLObject)$ic409$, (SubLObject)FOUR_INTEGER);
        Functions.funcall(var12, var11, (SubLObject)$ic51$, (SubLObject)$ic405$, f6750(var11));
        Functions.funcall(var12, var11, (SubLObject)$ic51$, (SubLObject)$ic406$, f6751(var11));
        Functions.funcall(var12, var11, (SubLObject)$ic51$, (SubLObject)$ic407$, f6752(var11));
        Functions.funcall(var12, var11, (SubLObject)$ic51$, (SubLObject)$ic408$, f6753(var11));
        Functions.funcall(var12, var11, (SubLObject)$ic52$, (SubLObject)$ic409$, (SubLObject)FOUR_INTEGER);
        return var11;
    }
    
    public static SubLObject f6760(final SubLObject var11, final SubLObject var12) {
        return f6759(var11, var12);
    }
    
    public static SubLObject f6656(final SubLObject var86, SubLObject var221, SubLObject var47, SubLObject var65) {
        if (var221 == UNPROVIDED) {
            var221 = (SubLObject)$ic307$;
        }
        if (var47 == UNPROVIDED) {
            var47 = $g1214$.getGlobalValue();
        }
        if (var65 == UNPROVIDED) {
            var65 = $g1215$.getGlobalValue();
        }
        final SubLThread var222 = SubLProcess.currentSubLThread();
        final SubLObject var223 = StreamsLow.$stream_initial_input_buffer_size$.currentBinding(var222);
        final SubLObject var224 = StreamsLow.$stream_initial_output_buffer_size$.currentBinding(var222);
        try {
            StreamsLow.$stream_initial_input_buffer_size$.bind($g1249$.getGlobalValue(), var222);
            StreamsLow.$stream_initial_output_buffer_size$.bind(StreamsLow.$stream_initial_input_buffer_size$.getDynamicValue(var222), var222);
            final SubLObject var225 = f6758((SubLObject)UNPROVIDED);
            final SubLObject var226 = f6607(var86, (SubLObject)ONE_INTEGER, (SubLObject)ONE_INTEGER, var47, var65);
            f6754(var225, var226);
            f6755(var225, var221);
            f6761(var225);
            f6762(var225);
            return var225;
        }
        finally {
            StreamsLow.$stream_initial_output_buffer_size$.rebind(var224, var222);
            StreamsLow.$stream_initial_input_buffer_size$.rebind(var223, var222);
        }
    }
    
    public static SubLObject f6761(final SubLObject var223) {
        final SubLObject var224 = module0075.f5185((SubLObject)$ic413$, f6751(var223));
        final SubLObject var225 = compatibility.open_binary(var224, (SubLObject)$ic218$);
        f6756(var223, var224);
        f6757(var223, var225);
        return var223;
    }
    
    public static SubLObject f6762(final SubLObject var223) {
        final SubLObject var224 = f6750(var223);
        final SubLObject var225 = f6459(var224);
        f6517(var225, Numbers.subtract(Numbers.expt((SubLObject)TWO_INTEGER, Numbers.multiply((SubLObject)EIGHT_INTEGER, (SubLObject)EIGHT_INTEGER)), (SubLObject)ONE_INTEGER));
        return var223;
    }
    
    public static SubLObject f6657(final SubLObject var52, final SubLObject var223, final SubLObject var94) {
        final SubLThread var224 = SubLProcess.currentSubLThread();
        final SubLObject var225 = f6750(var223);
        final SubLObject var226 = f6465(var225);
        final SubLObject var227 = Functions.funcall(var226, var52);
        var224.resetMultipleValues();
        final SubLObject var228 = f6763(var225, var227, var94);
        final SubLObject var229 = var224.secondMultipleValue();
        var224.resetMultipleValues();
        f6764(var223, var227, var228);
        return var223;
    }
    
    public static SubLObject f6763(final SubLObject var13, final SubLObject var52, final SubLObject var94) {
        final SubLThread var95 = SubLProcess.currentSubLThread();
        final SubLObject var96 = f6552((SubLObject)UNPROVIDED);
        final SubLObject var97 = f6543((SubLObject)UNPROVIDED);
        f6551(var96, f6575(var13, var52));
        final SubLObject var98 = $g1235$.currentBinding(var95);
        try {
            $g1235$.bind((SubLObject)T, var95);
            f6669(var13, var52, var94, (SubLObject)MINUS_ONE_INTEGER, var96, var97, (SubLObject)NIL);
        }
        finally {
            $g1235$.rebind(var98, var95);
        }
        return Values.values(var96, var97);
    }
    
    public static SubLObject f6764(final SubLObject var223, final SubLObject var52, final SubLObject var190) {
        final SubLObject var224 = f6753(var223);
        module0021.f1038(f6549(var190), var224);
        module0021.f1038(f6548(var190), var224);
        if (NIL == f6744()) {
            module0021.f1038(var52, var224);
        }
        return var223;
    }
    
    public static SubLObject f6658(final SubLObject var223, SubLObject var347, SubLObject var348) {
        if (var347 == UNPROVIDED) {
            var347 = (SubLObject)NIL;
        }
        if (var348 == UNPROVIDED) {
            var348 = (SubLObject)$ic223$;
        }
        final SubLThread var349 = SubLProcess.currentSubLThread();
        if (NIL == Errors.$ignore_mustsP$.getDynamicValue(var349) && NIL == conses_high.member(var348, (SubLObject)$ic414$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)) {
            Errors.error((SubLObject)$ic415$, var348);
        }
        f6765(var223);
        f6495(f6750(var223), (SubLObject)$ic411$);
        var349.resetMultipleValues();
        final SubLObject var350 = f6766(var223, var347, var348);
        final SubLObject var351 = var349.secondMultipleValue();
        var349.resetMultipleValues();
        f6767(var223, (SubLObject)makeBoolean(NIL == var347));
        if (NIL == var347) {
            SubLObject var352 = (SubLObject)NIL;
            try {
                var349.throwStack.push($ic416$);
                final SubLObject var353 = Errors.$error_handler$.currentBinding(var349);
                try {
                    Errors.$error_handler$.bind(Symbols.symbol_function((SubLObject)$ic417$), var349);
                    try {
                        Filesys.delete_file(var350);
                    }
                    catch (Throwable var354) {
                        Errors.handleThrowable(var354, (SubLObject)NIL);
                    }
                }
                finally {
                    Errors.$error_handler$.rebind(var353, var349);
                }
            }
            catch (Throwable var355) {
                var352 = Errors.handleThrowable(var355, (SubLObject)$ic416$);
            }
            finally {
                var349.throwStack.pop();
            }
            SubLObject var356 = (SubLObject)NIL;
            try {
                var349.throwStack.push($ic416$);
                final SubLObject var353 = Errors.$error_handler$.currentBinding(var349);
                try {
                    Errors.$error_handler$.bind(Symbols.symbol_function((SubLObject)$ic417$), var349);
                    try {
                        Filesys.delete_file(var351);
                    }
                    catch (Throwable var354) {
                        Errors.handleThrowable(var354, (SubLObject)NIL);
                    }
                }
                finally {
                    Errors.$error_handler$.rebind(var353, var349);
                }
            }
            catch (Throwable var355) {
                var356 = Errors.handleThrowable(var355, (SubLObject)$ic416$);
            }
            finally {
                var349.throwStack.pop();
            }
        }
        return var223;
    }
    
    public static SubLObject f6765(final SubLObject var223) {
        final SubLObject var224 = f6750(var223);
        f6768(var224);
        f6769(var224);
        f6770(var224);
        return var223;
    }
    
    public static SubLObject f6768(final SubLObject var13) {
        final SubLThread var14 = SubLProcess.currentSubLThread();
        final SubLObject var15 = f6459(var13);
        final SubLObject var16 = Numbers.expt((SubLObject)TWO_INTEGER, $g1251$.getDynamicValue(var14));
        SubLObject var17 = f6505(var15);
        var17 = Numbers.add(var17, var16);
        var17 = Numbers.multiply(Numbers.add(Numbers.integerDivide(var17, var16), (SubLObject)ONE_INTEGER), var16);
        f6517(var15, var17);
        return var13;
    }
    
    public static SubLObject f6769(final SubLObject var13) {
        final SubLObject var14 = f6459(var13);
        f6520(var14, f6560(f6506(var14)));
        return var13;
    }
    
    public static SubLObject f6770(final SubLObject var13) {
        final SubLObject var14 = f6459(var13);
        final SubLObject var15 = f6504(var14);
        final SubLObject var16 = f6507(var14);
        if (NIL == f6744()) {
            f6722(var13, var15, var16);
        }
        f6616(var13);
        return var13;
    }
    
    public static SubLObject f6766(final SubLObject var223, SubLObject var347, SubLObject var348) {
        if (var347 == UNPROVIDED) {
            var347 = (SubLObject)NIL;
        }
        if (var348 == UNPROVIDED) {
            var348 = (SubLObject)$ic223$;
        }
        final SubLThread var349 = SubLProcess.currentSubLThread();
        final SubLObject var350 = f6750(var223);
        final SubLObject var351 = f6612(var350);
        final SubLObject var352 = f6753(var223);
        streams_high.force_output(var352);
        compatibility.set_file_position(var352, (SubLObject)ZERO_INTEGER);
        try {
            final SubLObject var353 = StreamsLow.$stream_initial_input_buffer_size$.currentBinding(var349);
            final SubLObject var354 = StreamsLow.$stream_initial_output_buffer_size$.currentBinding(var349);
            try {
                StreamsLow.$stream_initial_input_buffer_size$.bind($g1249$.getGlobalValue(), var349);
                StreamsLow.$stream_initial_output_buffer_size$.bind(StreamsLow.$stream_initial_input_buffer_size$.getDynamicValue(var349), var349);
                if (NIL != f6746()) {
                    f6771(var223, var352, (SubLObject)$ic418$, var348);
                    return Values.values((SubLObject)NIL, (SubLObject)NIL);
                }
                if (NIL != f6745() || NIL != f6744()) {
                    var349.resetMultipleValues();
                    final SubLObject var355 = f6772(var350, var352, var351, f6751(var223), (SubLObject)makeBoolean(NIL == var347));
                    final SubLObject var356 = var349.secondMultipleValue();
                    var349.resetMultipleValues();
                    SubLObject var357 = (SubLObject)NIL;
                    try {
                        final SubLObject var216_357 = stream_macros.$stream_requires_locking$.currentBinding(var349);
                        try {
                            stream_macros.$stream_requires_locking$.bind((SubLObject)NIL, var349);
                            var357 = compatibility.open_binary(var355, (SubLObject)$ic226$);
                        }
                        finally {
                            stream_macros.$stream_requires_locking$.rebind(var216_357, var349);
                        }
                        if (!var357.isStream()) {
                            Errors.error((SubLObject)$ic419$, var355);
                        }
                        final SubLObject var2_358 = var357;
                        if (NIL != f6745()) {
                            f6771(var223, var2_358, (SubLObject)$ic420$, var348);
                        }
                        else if (NIL != f6744()) {
                            f6773(var223, var2_358);
                        }
                        else {
                            f6747();
                        }
                    }
                    finally {
                        final SubLObject var216_358 = Threads.$is_thread_performing_cleanupP$.currentBinding(var349);
                        try {
                            Threads.$is_thread_performing_cleanupP$.bind((SubLObject)T, var349);
                            if (var357.isStream()) {
                                streams_high.close(var357, (SubLObject)UNPROVIDED);
                            }
                        }
                        finally {
                            Threads.$is_thread_performing_cleanupP$.rebind(var216_358, var349);
                        }
                    }
                    f6496(f6750(var223));
                    SubLObject var358 = (SubLObject)NIL;
                    try {
                        final SubLObject var216_359 = stream_macros.$stream_requires_locking$.currentBinding(var349);
                        try {
                            stream_macros.$stream_requires_locking$.bind((SubLObject)NIL, var349);
                            var358 = compatibility.open_binary(var356, (SubLObject)$ic226$);
                        }
                        finally {
                            stream_macros.$stream_requires_locking$.rebind(var216_359, var349);
                        }
                        if (!var358.isStream()) {
                            Errors.error((SubLObject)$ic419$, var356);
                        }
                        final SubLObject var2_359 = var358;
                        f6771(var223, var2_359, (SubLObject)$ic418$, var348);
                    }
                    finally {
                        final SubLObject var216_360 = Threads.$is_thread_performing_cleanupP$.currentBinding(var349);
                        try {
                            Threads.$is_thread_performing_cleanupP$.bind((SubLObject)T, var349);
                            if (var358.isStream()) {
                                streams_high.close(var358, (SubLObject)UNPROVIDED);
                            }
                        }
                        finally {
                            Threads.$is_thread_performing_cleanupP$.rebind(var216_360, var349);
                        }
                    }
                    return Values.values(var355, var356);
                }
                f6747();
            }
            finally {
                StreamsLow.$stream_initial_output_buffer_size$.rebind(var354, var349);
                StreamsLow.$stream_initial_input_buffer_size$.rebind(var353, var349);
            }
        }
        finally {
            final SubLObject var359 = Threads.$is_thread_performing_cleanupP$.currentBinding(var349);
            try {
                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)T, var349);
                f6495(f6750(var223), $g1250$.getGlobalValue());
            }
            finally {
                Threads.$is_thread_performing_cleanupP$.rebind(var359, var349);
            }
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f6773(final SubLObject var223, final SubLObject var346) {
        final SubLThread var347 = SubLProcess.currentSubLThread();
        if (NIL == Errors.$ignore_mustsP$.getDynamicValue(var347) && NIL == f6744()) {
            Errors.error((SubLObject)$ic421$, $g1247$.getDynamicValue(var347));
        }
        final SubLObject var348 = f6750(var223);
        final SubLObject var349 = streams_high.file_length(var346);
        final SubLObject var350 = (SubLObject)$ic422$;
        SubLObject var351 = (SubLObject)NIL;
        f6495(var348, $g1249$.getGlobalValue());
        final SubLObject var352 = module0012.$g75$.currentBinding(var347);
        final SubLObject var353 = module0012.$g76$.currentBinding(var347);
        final SubLObject var354 = module0012.$g77$.currentBinding(var347);
        final SubLObject var355 = module0012.$g78$.currentBinding(var347);
        try {
            module0012.$g75$.bind((SubLObject)ZERO_INTEGER, var347);
            module0012.$g76$.bind((SubLObject)NIL, var347);
            module0012.$g77$.bind((SubLObject)T, var347);
            module0012.$g78$.bind(Time.get_universal_time(), var347);
            module0012.f478(var350);
            final SubLObject var356 = f6459(var348);
            final SubLObject var357 = f6458(var348);
            final SubLObject var358 = f6567((SubLObject)ZERO_INTEGER, (SubLObject)UNPROVIDED);
            SubLObject var359 = (SubLObject)MINUS_ONE_INTEGER;
            final SubLObject var360 = f6504(var356);
            compatibility.set_file_position(var357, var360);
            while (NIL == var351) {
                module0012.note_percent_progress(streams_high.file_position(var346, (SubLObject)UNPROVIDED), var349);
                final SubLObject var361 = module0021.f1060(var346, (SubLObject)NIL, (SubLObject)$ic383$);
                final SubLObject var362 = module0021.f1060(var346, (SubLObject)NIL, (SubLObject)$ic383$);
                if ($ic383$ == var361) {
                    var351 = (SubLObject)T;
                }
                else {
                    final SubLObject var363 = f6716(var361, var348);
                    if (NIL == Errors.$ignore_mustsP$.getDynamicValue(var347) && !var359.numL(var363)) {
                        Errors.error((SubLObject)$ic423$, var359, var363);
                    }
                    for (var359 = Numbers.add(var359, (SubLObject)ONE_INTEGER); var359.numL(var363); var359 = Numbers.add(var359, (SubLObject)ONE_INTEGER)) {
                        f6705(var357, $g1227$.getGlobalValue());
                    }
                    f6551(var358, var361);
                    f6550(var358, var362);
                    f6705(var357, var358);
                }
            }
            for (SubLObject var364 = f6507(var356); var359.numL(var364); var359 = Numbers.add(var359, (SubLObject)ONE_INTEGER)) {
                f6705(var357, $g1227$.getGlobalValue());
            }
            streams_high.force_output(var357);
            module0012.f479();
        }
        finally {
            module0012.$g78$.rebind(var355, var347);
            module0012.$g77$.rebind(var354, var347);
            module0012.$g76$.rebind(var353, var347);
            module0012.$g75$.rebind(var352, var347);
        }
        return var223;
    }
    
    public static SubLObject f6771(final SubLObject var223, final SubLObject var346, final SubLObject var369, final SubLObject var348) {
        final SubLThread var370 = SubLProcess.currentSubLThread();
        final SubLObject var371 = f6750(var223);
        final SubLObject var372 = streams_high.file_length(var346);
        final SubLObject var373 = Sequences.cconcatenate((SubLObject)$ic424$, new SubLObject[] { module0006.f203(var369), $ic425$ });
        SubLObject var374 = (SubLObject)NIL;
        final SubLObject var375 = module0012.$g75$.currentBinding(var370);
        final SubLObject var376 = module0012.$g76$.currentBinding(var370);
        final SubLObject var377 = module0012.$g77$.currentBinding(var370);
        final SubLObject var378 = module0012.$g78$.currentBinding(var370);
        try {
            module0012.$g75$.bind((SubLObject)ZERO_INTEGER, var370);
            module0012.$g76$.bind((SubLObject)NIL, var370);
            module0012.$g77$.bind((SubLObject)T, var370);
            module0012.$g78$.bind(Time.get_universal_time(), var370);
            module0012.f478(var373);
            while (NIL == var374) {
                module0012.note_percent_progress(streams_high.file_position(var346, (SubLObject)UNPROVIDED), var372);
                final SubLObject var379 = module0021.f1060(var346, (SubLObject)NIL, (SubLObject)$ic383$);
                final SubLObject var380 = module0021.f1060(var346, (SubLObject)NIL, (SubLObject)$ic383$);
                final SubLObject var381 = module0021.f1060(var346, (SubLObject)NIL, (SubLObject)$ic383$);
                if ($ic383$ == var380) {
                    var374 = (SubLObject)T;
                }
                else {
                    var370.resetMultipleValues();
                    final SubLObject var382 = f6668(var371, var381, var379);
                    final SubLObject var383 = var370.secondMultipleValue();
                    final SubLObject var384 = var370.thirdMultipleValue();
                    final SubLObject var385 = var370.fourthMultipleValue();
                    var370.resetMultipleValues();
                    if (var382 == $ic317$) {
                        f6550(var384, var380);
                        f6674(var371, var383, var384, (SubLObject)NIL);
                    }
                    else {
                        final SubLObject var386 = (SubLObject)$ic426$;
                        if (var348.eql((SubLObject)$ic223$)) {
                            Errors.error(var386, var381);
                        }
                        else {
                            if (!var348.eql((SubLObject)$ic427$)) {
                                continue;
                            }
                            Errors.warn(var386, var381);
                        }
                    }
                }
            }
            module0012.f479();
        }
        finally {
            module0012.$g78$.rebind(var378, var370);
            module0012.$g77$.rebind(var377, var370);
            module0012.$g76$.rebind(var376, var370);
            module0012.$g75$.rebind(var375, var370);
        }
        streams_high.force_output(f6458(var371));
        return var223;
    }
    
    public static SubLObject f6767(final SubLObject var223, SubLObject var370) {
        if (var370 == UNPROVIDED) {
            var370 = (SubLObject)NIL;
        }
        streams_high.close(f6753(var223), (SubLObject)UNPROVIDED);
        if (NIL != var370) {
            Filesys.delete_file(f6752(var223));
        }
        f6615(f6750(var223));
        return var223;
    }
    
    public static SubLObject f6774(final SubLObject var1, final SubLObject var2) {
        compatibility.default_struct_print_function(var1, var2, (SubLObject)ZERO_INTEGER);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f6775(final SubLObject var1) {
        return (SubLObject)((var1.getClass() == $sX8152_native.class) ? T : NIL);
    }
    
    public static SubLObject f6776(final SubLObject var1) {
        assert NIL != f6775(var1) : var1;
        return var1.getField2();
    }
    
    public static SubLObject f6777(final SubLObject var1) {
        assert NIL != f6775(var1) : var1;
        return var1.getField3();
    }
    
    public static SubLObject f6778(final SubLObject var1) {
        assert NIL != f6775(var1) : var1;
        return var1.getField4();
    }
    
    public static SubLObject f6779(final SubLObject var1, final SubLObject var4) {
        assert NIL != f6775(var1) : var1;
        return var1.setField2(var4);
    }
    
    public static SubLObject f6780(final SubLObject var1, final SubLObject var4) {
        assert NIL != f6775(var1) : var1;
        return var1.setField3(var4);
    }
    
    public static SubLObject f6781(final SubLObject var1, final SubLObject var4) {
        assert NIL != f6775(var1) : var1;
        return var1.setField4(var4);
    }
    
    public static SubLObject f6782(SubLObject var5) {
        if (var5 == UNPROVIDED) {
            var5 = (SubLObject)NIL;
        }
        final SubLObject var6 = (SubLObject)new $sX8152_native();
        SubLObject var7;
        SubLObject var8;
        SubLObject var9;
        SubLObject var10;
        for (var7 = (SubLObject)NIL, var7 = var5; NIL != var7; var7 = conses_high.cddr(var7)) {
            var8 = var7.first();
            var9 = conses_high.cadr(var7);
            var10 = var8;
            if (var10.eql((SubLObject)$ic406$)) {
                f6779(var6, var9);
            }
            else if (var10.eql((SubLObject)$ic442$)) {
                f6780(var6, var9);
            }
            else if (var10.eql((SubLObject)$ic443$)) {
                f6781(var6, var9);
            }
            else {
                Errors.error((SubLObject)$ic48$, var8);
            }
        }
        return var6;
    }
    
    public static SubLObject f6783(final SubLObject var11, final SubLObject var12) {
        Functions.funcall(var12, var11, (SubLObject)$ic49$, (SubLObject)$ic444$, (SubLObject)THREE_INTEGER);
        Functions.funcall(var12, var11, (SubLObject)$ic51$, (SubLObject)$ic406$, f6776(var11));
        Functions.funcall(var12, var11, (SubLObject)$ic51$, (SubLObject)$ic442$, f6777(var11));
        Functions.funcall(var12, var11, (SubLObject)$ic51$, (SubLObject)$ic443$, f6778(var11));
        Functions.funcall(var12, var11, (SubLObject)$ic52$, (SubLObject)$ic444$, (SubLObject)THREE_INTEGER);
        return var11;
    }
    
    public static SubLObject f6784(final SubLObject var11, final SubLObject var12) {
        return f6783(var11, var12);
    }
    
    public static SubLObject f6772(final SubLObject var13, final SubLObject var346, final SubLObject var183, SubLObject var374, SubLObject var370) {
        if (var374 == UNPROVIDED) {
            var374 = module0075.f5180();
        }
        if (var370 == UNPROVIDED) {
            var370 = (SubLObject)NIL;
        }
        final SubLThread var375 = SubLProcess.currentSubLThread();
        SubLObject var376 = Numbers.ceiling(Numbers.log(var183, (SubLObject)TWO_INTEGER), (SubLObject)UNPROVIDED);
        final SubLObject var377 = f6785(var374);
        SubLObject var378 = (SubLObject)NIL;
        SubLObject var379 = (SubLObject)$ic446$;
        SubLObject var380 = module0012.$g73$.currentBinding(var375);
        SubLObject var381 = module0012.$g65$.currentBinding(var375);
        SubLObject var382 = module0012.$g67$.currentBinding(var375);
        SubLObject var383 = module0012.$g68$.currentBinding(var375);
        SubLObject var384 = module0012.$g66$.currentBinding(var375);
        SubLObject var385 = module0012.$g69$.currentBinding(var375);
        SubLObject var386 = module0012.$g70$.currentBinding(var375);
        SubLObject var387 = module0012.$silent_progressP$.currentBinding(var375);
        try {
            module0012.$g73$.bind(Time.get_universal_time(), var375);
            module0012.$g65$.bind(module0012.$g73$.getDynamicValue(var375), var375);
            module0012.$g67$.bind((SubLObject)ONE_INTEGER, var375);
            module0012.$g68$.bind((SubLObject)ZERO_INTEGER, var375);
            module0012.$g66$.bind((SubLObject)ZERO_INTEGER, var375);
            module0012.$g69$.bind((SubLObject)ZERO_INTEGER, var375);
            module0012.$g70$.bind((SubLObject)T, var375);
            module0012.$silent_progressP$.bind((SubLObject)((NIL != var379) ? module0012.$silent_progressP$.getDynamicValue(var375) : T), var375);
            module0012.f474(var379);
            var378 = f6786(var377, var346, var13);
            module0012.f475();
        }
        finally {
            module0012.$silent_progressP$.rebind(var387, var375);
            module0012.$g70$.rebind(var386, var375);
            module0012.$g69$.rebind(var385, var375);
            module0012.$g66$.rebind(var384, var375);
            module0012.$g68$.rebind(var383, var375);
            module0012.$g67$.rebind(var382, var375);
            module0012.$g65$.rebind(var381, var375);
            module0012.$g73$.rebind(var380, var375);
        }
        if (var378.numL((SubLObject)THREE_INTEGER)) {
            var379 = (SubLObject)$ic447$;
            var380 = module0012.$g73$.currentBinding(var375);
            var381 = module0012.$g65$.currentBinding(var375);
            var382 = module0012.$g67$.currentBinding(var375);
            var383 = module0012.$g68$.currentBinding(var375);
            var384 = module0012.$g66$.currentBinding(var375);
            var385 = module0012.$g69$.currentBinding(var375);
            var386 = module0012.$g70$.currentBinding(var375);
            var387 = module0012.$silent_progressP$.currentBinding(var375);
            try {
                module0012.$g73$.bind(Time.get_universal_time(), var375);
                module0012.$g65$.bind(module0012.$g73$.getDynamicValue(var375), var375);
                module0012.$g67$.bind((SubLObject)ONE_INTEGER, var375);
                module0012.$g68$.bind((SubLObject)ZERO_INTEGER, var375);
                module0012.$g66$.bind((SubLObject)ZERO_INTEGER, var375);
                module0012.$g69$.bind((SubLObject)ZERO_INTEGER, var375);
                module0012.$g70$.bind((SubLObject)T, var375);
                module0012.$silent_progressP$.bind((SubLObject)((NIL != var379) ? module0012.$silent_progressP$.getDynamicValue(var375) : T), var375);
                module0012.f474(var379);
                final SubLObject var388 = f6778(var377);
                f6781(var377, f6777(var377));
                f6780(var377, var388);
                module0012.f475();
            }
            finally {
                module0012.$silent_progressP$.rebind(var387, var375);
                module0012.$g70$.rebind(var386, var375);
                module0012.$g69$.rebind(var385, var375);
                module0012.$g66$.rebind(var384, var375);
                module0012.$g68$.rebind(var383, var375);
                module0012.$g67$.rebind(var382, var375);
                module0012.$g65$.rebind(var381, var375);
                module0012.$g73$.rebind(var380, var375);
            }
            if (var378.numE((SubLObject)ONE_INTEGER)) {
                final SubLObject var389 = f6778(var377);
                final SubLObject var390 = var389.first();
                final SubLObject var391 = conses_high.second(var389);
                final SubLObject var392 = (NIL != module0075.f5240(var390)) ? var390 : var391;
                SubLObject var393 = (SubLObject)NIL;
                try {
                    final SubLObject var394 = stream_macros.$stream_requires_locking$.currentBinding(var375);
                    try {
                        stream_macros.$stream_requires_locking$.bind((SubLObject)NIL, var375);
                        var393 = compatibility.open_binary(var392, (SubLObject)$ic448$);
                    }
                    finally {
                        stream_macros.$stream_requires_locking$.rebind(var394, var375);
                    }
                    if (!var393.isStream()) {
                        Errors.error((SubLObject)$ic419$, var392);
                    }
                    final SubLObject var395 = var393;
                    f6787(var395);
                }
                finally {
                    final SubLObject var396 = Threads.$is_thread_performing_cleanupP$.currentBinding(var375);
                    try {
                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)T, var375);
                        if (var393.isStream()) {
                            streams_high.close(var393, (SubLObject)UNPROVIDED);
                        }
                    }
                    finally {
                        Threads.$is_thread_performing_cleanupP$.rebind(var396, var375);
                    }
                }
            }
        }
        else {
            var376 = Numbers.subtract(var376, $g1255$.getDynamicValue(var375));
            final SubLObject var398;
            final SubLObject var397 = var398 = Sequences.cconcatenate((SubLObject)$ic449$, new SubLObject[] { module0006.f203(var378), $ic450$, module0006.f203(var376), $ic451$ });
            final SubLObject var399 = module0012.$g73$.currentBinding(var375);
            final SubLObject var400 = module0012.$g65$.currentBinding(var375);
            final SubLObject var401 = module0012.$g67$.currentBinding(var375);
            final SubLObject var402 = module0012.$g68$.currentBinding(var375);
            final SubLObject var403 = module0012.$g66$.currentBinding(var375);
            final SubLObject var404 = module0012.$g69$.currentBinding(var375);
            final SubLObject var405 = module0012.$g70$.currentBinding(var375);
            final SubLObject var406 = module0012.$silent_progressP$.currentBinding(var375);
            try {
                module0012.$g73$.bind(Time.get_universal_time(), var375);
                module0012.$g65$.bind(module0012.$g73$.getDynamicValue(var375), var375);
                module0012.$g67$.bind((SubLObject)ONE_INTEGER, var375);
                module0012.$g68$.bind((SubLObject)ZERO_INTEGER, var375);
                module0012.$g66$.bind((SubLObject)ZERO_INTEGER, var375);
                module0012.$g69$.bind((SubLObject)ZERO_INTEGER, var375);
                module0012.$g70$.bind((SubLObject)T, var375);
                module0012.$silent_progressP$.bind((SubLObject)((NIL != var398) ? module0012.$silent_progressP$.getDynamicValue(var375) : T), var375);
                module0012.f474(var398);
                var376 = Numbers.subtract(var376, (SubLObject)ONE_INTEGER);
                f6788(var13, var377, var376);
                module0012.f475();
            }
            finally {
                module0012.$silent_progressP$.rebind(var406, var375);
                module0012.$g70$.rebind(var405, var375);
                module0012.$g69$.rebind(var404, var375);
                module0012.$g66$.rebind(var403, var375);
                module0012.$g68$.rebind(var402, var375);
                module0012.$g67$.rebind(var401, var375);
                module0012.$g65$.rebind(var400, var375);
                module0012.$g73$.rebind(var399, var375);
            }
        }
        var379 = (SubLObject)$ic452$;
        var380 = module0012.$g73$.currentBinding(var375);
        var381 = module0012.$g65$.currentBinding(var375);
        var382 = module0012.$g67$.currentBinding(var375);
        var383 = module0012.$g68$.currentBinding(var375);
        var384 = module0012.$g66$.currentBinding(var375);
        var385 = module0012.$g69$.currentBinding(var375);
        var386 = module0012.$g70$.currentBinding(var375);
        var387 = module0012.$silent_progressP$.currentBinding(var375);
        try {
            module0012.$g73$.bind(Time.get_universal_time(), var375);
            module0012.$g65$.bind(module0012.$g73$.getDynamicValue(var375), var375);
            module0012.$g67$.bind((SubLObject)ONE_INTEGER, var375);
            module0012.$g68$.bind((SubLObject)ZERO_INTEGER, var375);
            module0012.$g66$.bind((SubLObject)ZERO_INTEGER, var375);
            module0012.$g69$.bind((SubLObject)ZERO_INTEGER, var375);
            module0012.$g70$.bind((SubLObject)T, var375);
            module0012.$silent_progressP$.bind((SubLObject)((NIL != var379) ? module0012.$silent_progressP$.getDynamicValue(var375) : T), var375);
            module0012.f474(var379);
            f6789(var13, var377);
            module0012.f475();
        }
        finally {
            module0012.$silent_progressP$.rebind(var387, var375);
            module0012.$g70$.rebind(var386, var375);
            module0012.$g69$.rebind(var385, var375);
            module0012.$g66$.rebind(var384, var375);
            module0012.$g68$.rebind(var383, var375);
            module0012.$g67$.rebind(var382, var375);
            module0012.$g65$.rebind(var381, var375);
            module0012.$g73$.rebind(var380, var375);
        }
        if (NIL != var370) {
            SubLObject var407 = f6778(var377);
            SubLObject var408 = (SubLObject)NIL;
            var408 = var407.first();
            while (NIL != var407) {
                Filesys.delete_file(var408);
                var407 = var407.rest();
                var408 = var407.first();
            }
        }
        final SubLObject var409 = f6777(var377);
        return Values.values(var409.first(), conses_high.second(var409));
    }
    
    public static SubLObject f6785(final SubLObject var374) {
        final SubLObject var375 = f6782((SubLObject)UNPROVIDED);
        f6779(var375, var374);
        f6780(var375, f6790((SubLObject)TWO_INTEGER, (SubLObject)$ic453$, var374));
        f6781(var375, f6790((SubLObject)TWO_INTEGER, (SubLObject)$ic454$, var374));
        return var375;
    }
    
    public static SubLObject f6790(final SubLObject var182, final SubLObject var391, final SubLObject var374) {
        SubLObject var392 = (SubLObject)NIL;
        SubLObject var393;
        for (var393 = (SubLObject)NIL, var393 = (SubLObject)ZERO_INTEGER; var393.numL(var182); var393 = Numbers.add(var393, (SubLObject)ONE_INTEGER)) {
            var392 = (SubLObject)ConsesLow.cons(module0075.f5185(var391, var374), var392);
        }
        return var392;
    }
    
    public static SubLObject f6786(final SubLObject var376, final SubLObject var346, final SubLObject var13) {
        final SubLThread var377 = SubLProcess.currentSubLThread();
        final SubLObject var378 = module0055.f4017();
        SubLObject var379 = (SubLObject)ZERO_INTEGER;
        SubLObject var380 = (SubLObject)NIL;
        SubLObject var381 = (SubLObject)NIL;
        if (NIL == Errors.$ignore_mustsP$.getDynamicValue(var377) && !streams_high.file_position(var346, (SubLObject)UNPROVIDED).isZero()) {
            Errors.error((SubLObject)$ic455$, var346);
        }
        final SubLObject var382 = Numbers.expt((SubLObject)TWO_INTEGER, $g1255$.getDynamicValue(var377));
        var380 = Vectors.make_vector(var382, (SubLObject)NIL);
        SubLObject var383 = f6777(var376);
        SubLObject var384 = (SubLObject)NIL;
        var384 = var383.first();
        while (NIL != var383) {
            module0075.f5239(var384);
            module0055.f4021(var384, var378);
            var383 = var383.rest();
            var384 = var383.first();
        }
        while (NIL == var381) {
            SubLObject var385;
            SubLObject var386;
            SubLObject var387;
            SubLObject var388;
            for (var385 = Sequences.length(var380), var386 = (SubLObject)NIL, var386 = (SubLObject)ZERO_INTEGER; var386.numL(var385); var386 = Numbers.add(var386, (SubLObject)ONE_INTEGER)) {
                var387 = Vectors.aref(var380, var386);
                var388 = f6791(var346, var13, var387);
                Vectors.set_aref(var380, var386, var388);
                var381 = Equality.eq((SubLObject)$ic383$, var388.first());
            }
            Sort.sort(var380, (SubLObject)$ic456$, (SubLObject)UNPROVIDED);
            final SubLObject var389 = module0055.f4025(var378);
            f6792(var389, var380);
            var379 = Numbers.add(var379, (SubLObject)ONE_INTEGER);
        }
        return var379;
    }
    
    public static SubLObject f6791(final SubLObject var346, final SubLObject var13, SubLObject var27) {
        if (var27 == UNPROVIDED) {
            var27 = (SubLObject)NIL;
        }
        var27 = f6793(var27);
        final SubLObject var347 = module0021.f1060(var346, (SubLObject)NIL, (SubLObject)$ic383$);
        if (var347.isNumber()) {
            if ($g1253$.getGlobalValue().numE(var347)) {
                ConsesLow.set_nth((SubLObject)ZERO_INTEGER, var27, $g1254$.getGlobalValue());
            }
            else {
                ConsesLow.set_nth((SubLObject)ZERO_INTEGER, var27, f6716(var347, var13));
            }
            ConsesLow.set_nth((SubLObject)ONE_INTEGER, var27, var347);
            ConsesLow.set_nth((SubLObject)TWO_INTEGER, var27, module0021.f1060(var346, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED));
            if (NIL == f6744()) {
                ConsesLow.set_nth((SubLObject)THREE_INTEGER, var27, module0021.f1060(var346, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED));
            }
        }
        return var27;
    }
    
    public static SubLObject f6794(SubLObject var27) {
        if (var27 == UNPROVIDED) {
            var27 = (SubLObject)NIL;
        }
        if (!var27.isCons()) {
            final SubLObject var28 = (SubLObject)((NIL != f6744()) ? THREE_INTEGER : FOUR_INTEGER);
            var27 = (SubLObject)ConsesLow.make_list(var28, (SubLObject)UNPROVIDED);
        }
        ConsesLow.set_nth((SubLObject)ZERO_INTEGER, var27, $g1254$.getGlobalValue());
        ConsesLow.set_nth((SubLObject)ONE_INTEGER, var27, $g1253$.getGlobalValue());
        ConsesLow.set_nth((SubLObject)TWO_INTEGER, var27, $g1253$.getGlobalValue());
        if (NIL == f6744()) {
            ConsesLow.set_nth((SubLObject)THREE_INTEGER, var27, $g1253$.getGlobalValue());
        }
        return var27;
    }
    
    public static SubLObject f6793(SubLObject var27) {
        if (var27 == UNPROVIDED) {
            var27 = (SubLObject)NIL;
        }
        final SubLObject var28 = (SubLObject)((NIL != f6744()) ? THREE_INTEGER : FOUR_INTEGER);
        if (!var27.isCons()) {
            var27 = (SubLObject)ConsesLow.make_list(var28, (SubLObject)UNPROVIDED);
        }
        SubLObject var29;
        for (var29 = (SubLObject)NIL, var29 = (SubLObject)ZERO_INTEGER; var29.numL(var28); var29 = Numbers.add(var29, (SubLObject)ONE_INTEGER)) {
            ConsesLow.set_nth(var29, var27, (SubLObject)$ic383$);
        }
        return var27;
    }
    
    public static SubLObject f6795(final SubLObject var401, final SubLObject var402) {
        final SubLObject var403 = var401.first();
        final SubLObject var404 = var402.first();
        if (var403 == $ic383$) {
            return (SubLObject)((var404 == $ic383$) ? $ic457$ : $ic458$);
        }
        if (var404 == $ic383$) {
            return (SubLObject)$ic459$;
        }
        if (var403.numL(var404)) {
            return (SubLObject)$ic459$;
        }
        if (var404.numL(var403)) {
            return (SubLObject)$ic458$;
        }
        final SubLObject var405 = ConsesLow.nth((SubLObject)TWO_INTEGER, var401);
        final SubLObject var406 = ConsesLow.nth((SubLObject)TWO_INTEGER, var402);
        if (var405.numL(var406)) {
            return (SubLObject)$ic459$;
        }
        if (var406.numL(var405)) {
            return (SubLObject)$ic458$;
        }
        return (SubLObject)$ic457$;
    }
    
    public static SubLObject f6796(final SubLObject var401, final SubLObject var402) {
        return Equality.eq((SubLObject)$ic459$, f6795(var401, var402));
    }
    
    public static SubLObject f6792(final SubLObject var400, final SubLObject var395) {
        final SubLObject var401 = compatibility.open_binary(var400, (SubLObject)$ic460$);
        SubLObject var402 = (SubLObject)NIL;
        final SubLObject var403 = (SubLObject)NIL;
        final SubLObject var404 = Sequences.length(var395);
        SubLObject var406;
        final SubLObject var405 = var406 = (SubLObject)((NIL != var403) ? ConsesLow.list(Numbers.subtract(var404, (SubLObject)ONE_INTEGER), (SubLObject)MINUS_ONE_INTEGER, (SubLObject)MINUS_ONE_INTEGER) : ConsesLow.list((SubLObject)ZERO_INTEGER, var404, (SubLObject)ONE_INTEGER));
        SubLObject var407 = (SubLObject)NIL;
        SubLObject var408 = (SubLObject)NIL;
        SubLObject var409 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var406, var405, (SubLObject)$ic461$);
        var407 = var406.first();
        var406 = var406.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var406, var405, (SubLObject)$ic461$);
        var408 = var406.first();
        var406 = var406.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var406, var405, (SubLObject)$ic461$);
        var409 = var406.first();
        var406 = var406.rest();
        if (NIL == var406) {
            if (NIL == var402) {
                SubLObject var410;
                SubLObject var411;
                SubLObject var412;
                for (var410 = var408, var411 = (SubLObject)NIL, var411 = var407; NIL == var402 && NIL == module0005.f124(var411, var409, var410); var411 = Numbers.add(var411, var409)) {
                    var412 = Vectors.aref(var395, var411);
                    if (NIL != f6797(var412)) {
                        var402 = (SubLObject)T;
                    }
                    else {
                        f6798(var401, var412);
                    }
                }
            }
        }
        else {
            cdestructuring_bind.cdestructuring_bind_error(var405, (SubLObject)$ic461$);
        }
        f6787(var401);
        streams_high.close(var401, (SubLObject)UNPROVIDED);
        return var400;
    }
    
    public static SubLObject f6799(final SubLObject var50) {
        final SubLObject var51 = var50.first();
        return (SubLObject)makeBoolean(var51.isNumber() && $g1254$.getGlobalValue().numE(var51));
    }
    
    public static SubLObject f6797(final SubLObject var50) {
        return Equality.eq((SubLObject)$ic383$, var50.first());
    }
    
    public static SubLObject f6787(final SubLObject var2) {
        final SubLObject var3 = $g1253$.getGlobalValue();
        f6800(var2, var3, var3, var3);
        return var2;
    }
    
    public static SubLObject f6800(final SubLObject var2, final SubLObject var368, final SubLObject var49, SubLObject var52) {
        if (var52 == UNPROVIDED) {
            var52 = (SubLObject)NIL;
        }
        module0021.f1038(var368, var2);
        module0021.f1038(var49, var2);
        if (NIL == f6744()) {
            module0021.f1038(var52, var2);
        }
        return var2;
    }
    
    public static SubLObject f6798(final SubLObject var2, final SubLObject var50) {
        return f6800(var2, ConsesLow.nth((SubLObject)ONE_INTEGER, var50), ConsesLow.nth((SubLObject)TWO_INTEGER, var50), (SubLObject)((NIL != f6744()) ? NIL : ConsesLow.nth((SubLObject)THREE_INTEGER, var50)));
    }
    
    public static SubLObject f6801(final SubLObject var13, final SubLObject var418, final SubLObject var50) {
        if (NIL != f6744()) {
            final SubLObject var419 = ConsesLow.nth((SubLObject)TWO_INTEGER, var50);
            final SubLObject var420 = f6543((SubLObject)UNPROVIDED);
            f6666(var13, var420, var419, (SubLObject)$ic315$);
            module0021.f1038(ConsesLow.nth((SubLObject)ONE_INTEGER, var50), var418);
            module0021.f1038(ConsesLow.nth((SubLObject)TWO_INTEGER, var50), var418);
            module0021.f1038(f6534(var420), var418);
        }
        else {
            f6798(var418, var50);
        }
        return var13;
    }
    
    public static SubLObject f6788(final SubLObject var13, final SubLObject var376, SubLObject var419) {
        if (var419 == UNPROVIDED) {
            var419 = (SubLObject)NIL;
        }
        final SubLThread var420 = SubLProcess.currentSubLThread();
        SubLObject var421 = f6777(var376);
        SubLObject var422 = f6778(var376);
        final SubLObject var423 = Numbers.$most_positive_fixnum$.getGlobalValue();
        final SubLObject var424 = (SubLObject)(var419.isNumber() ? Sequences.cconcatenate((SubLObject)$ic462$, module0006.f203(var419)) : $ic309$);
        SubLObject var425 = (SubLObject)ZERO_INTEGER;
        SubLObject var426 = (SubLObject)NIL;
        while (NIL == var426) {
            var425 = Numbers.add(var425, (SubLObject)ONE_INTEGER);
            final SubLObject var427 = Sequences.cconcatenate((SubLObject)$ic463$, new SubLObject[] { module0006.f203(var425), module0006.f203(var424) });
            SubLObject var428 = (SubLObject)NIL;
            final SubLObject var429 = var427;
            final SubLObject var430 = module0012.$g73$.currentBinding(var420);
            final SubLObject var431 = module0012.$g65$.currentBinding(var420);
            final SubLObject var432 = module0012.$g67$.currentBinding(var420);
            final SubLObject var433 = module0012.$g68$.currentBinding(var420);
            final SubLObject var434 = module0012.$g66$.currentBinding(var420);
            final SubLObject var435 = module0012.$g69$.currentBinding(var420);
            final SubLObject var436 = module0012.$g70$.currentBinding(var420);
            final SubLObject var437 = module0012.$silent_progressP$.currentBinding(var420);
            try {
                module0012.$g73$.bind(Time.get_universal_time(), var420);
                module0012.$g65$.bind(module0012.$g73$.getDynamicValue(var420), var420);
                module0012.$g67$.bind((SubLObject)ONE_INTEGER, var420);
                module0012.$g68$.bind((SubLObject)ZERO_INTEGER, var420);
                module0012.$g66$.bind((SubLObject)ZERO_INTEGER, var420);
                module0012.$g69$.bind((SubLObject)ZERO_INTEGER, var420);
                module0012.$g70$.bind((SubLObject)T, var420);
                module0012.$silent_progressP$.bind((SubLObject)((NIL != var429) ? module0012.$silent_progressP$.getDynamicValue(var420) : T), var420);
                module0012.f474(var429);
                var428 = f6802(var13, var421, var422);
                module0012.f475();
            }
            finally {
                module0012.$silent_progressP$.rebind(var437, var420);
                module0012.$g70$.rebind(var436, var420);
                module0012.$g69$.rebind(var435, var420);
                module0012.$g66$.rebind(var434, var420);
                module0012.$g68$.rebind(var433, var420);
                module0012.$g67$.rebind(var432, var420);
                module0012.$g65$.rebind(var431, var420);
                module0012.$g73$.rebind(var430, var420);
            }
            if (NIL == Errors.$ignore_mustsP$.getDynamicValue(var420) && !var428.numL(var423)) {
                Errors.error((SubLObject)$ic464$, var428, var423);
            }
            if (TWO_INTEGER.numE(var428)) {
                var426 = (SubLObject)T;
            }
            else {
                final SubLObject var438 = var421;
                var421 = var422;
                var422 = var438;
            }
        }
        f6780(var376, var421);
        f6781(var376, var422);
        return var422;
    }
    
    public static SubLObject f6802(final SubLObject var13, final SubLObject var420, final SubLObject var383) {
        final SubLThread var421 = SubLProcess.currentSubLThread();
        final SubLObject var422 = module0055.f4017();
        SubLObject var423 = (SubLObject)ZERO_INTEGER;
        SubLObject var424 = (SubLObject)NIL;
        SubLObject var425 = var383;
        SubLObject var426 = (SubLObject)NIL;
        var426 = var425.first();
        while (NIL != var425) {
            module0075.f5239(var426);
            module0055.f4021(var426, var422);
            var425 = var425.rest();
            var426 = var425.first();
        }
        final SubLObject var427 = var420.first();
        final SubLObject var428 = conses_high.second(var420);
        SubLObject var429 = (SubLObject)NIL;
        try {
            final SubLObject var430 = stream_macros.$stream_requires_locking$.currentBinding(var421);
            try {
                stream_macros.$stream_requires_locking$.bind((SubLObject)NIL, var421);
                var429 = compatibility.open_binary(var427, (SubLObject)$ic226$);
            }
            finally {
                stream_macros.$stream_requires_locking$.rebind(var430, var421);
            }
            if (!var429.isStream()) {
                Errors.error((SubLObject)$ic419$, var427);
            }
            final SubLObject var431 = var429;
            SubLObject var431_432 = (SubLObject)NIL;
            try {
                final SubLObject var432 = stream_macros.$stream_requires_locking$.currentBinding(var421);
                try {
                    stream_macros.$stream_requires_locking$.bind((SubLObject)NIL, var421);
                    var431_432 = compatibility.open_binary(var428, (SubLObject)$ic226$);
                }
                finally {
                    stream_macros.$stream_requires_locking$.rebind(var432, var421);
                }
                if (!var431_432.isStream()) {
                    Errors.error((SubLObject)$ic419$, var428);
                }
                final SubLObject var433 = var431_432;
                while (NIL == var424) {
                    final SubLObject var434 = module0055.f4025(var422);
                    SubLObject var435 = (SubLObject)NIL;
                    try {
                        var435 = compatibility.open_binary(var434, (SubLObject)$ic460$);
                        final SubLObject var436 = f6803(var13, var431, var433, var435);
                        if ($ic383$ == var436) {
                            var424 = (SubLObject)T;
                        }
                        else {
                            var423 = Numbers.add(var423, (SubLObject)ONE_INTEGER);
                        }
                    }
                    finally {
                        final SubLObject var437 = Threads.$is_thread_performing_cleanupP$.currentBinding(var421);
                        try {
                            Threads.$is_thread_performing_cleanupP$.bind((SubLObject)T, var421);
                            streams_high.close(var435, (SubLObject)UNPROVIDED);
                        }
                        finally {
                            Threads.$is_thread_performing_cleanupP$.rebind(var437, var421);
                        }
                    }
                }
            }
            finally {
                final SubLObject var438 = Threads.$is_thread_performing_cleanupP$.currentBinding(var421);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)T, var421);
                    if (var431_432.isStream()) {
                        streams_high.close(var431_432, (SubLObject)UNPROVIDED);
                    }
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(var438, var421);
                }
            }
        }
        finally {
            final SubLObject var439 = Threads.$is_thread_performing_cleanupP$.currentBinding(var421);
            try {
                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)T, var421);
                if (var429.isStream()) {
                    streams_high.close(var429, (SubLObject)UNPROVIDED);
                }
            }
            finally {
                Threads.$is_thread_performing_cleanupP$.rebind(var439, var421);
            }
        }
        return var423;
    }
    
    public static SubLObject f6803(final SubLObject var13, final SubLObject var430, final SubLObject var433, final SubLObject var435) {
        final SubLThread var436 = SubLProcess.currentSubLThread();
        SubLObject var437 = (SubLObject)NIL;
        SubLObject var438 = (SubLObject)NIL;
        var437 = f6791(var430, var13, var437);
        var438 = f6791(var433, var13, var438);
        if (NIL != f6797(var437) && NIL != f6797(var438)) {
            return (SubLObject)$ic383$;
        }
        if (NIL != f6797(var437)) {
            f6794(var437);
        }
        if (NIL != f6797(var438)) {
            f6794(var438);
        }
        SubLObject var439 = (SubLObject)NIL;
        while (NIL == var439) {
            final SubLObject var441;
            final SubLObject var440 = var441 = f6795(var437, var438);
            if (var441.eql((SubLObject)$ic459$)) {
                f6798(var435, var437);
                var437 = f6791(var430, var13, var437);
            }
            else if (var441.eql((SubLObject)$ic458$)) {
                f6798(var435, var438);
                var438 = f6791(var433, var13, var438);
            }
            else {
                if (!var441.eql((SubLObject)$ic457$)) {
                    continue;
                }
                if (NIL == Errors.$ignore_mustsP$.getDynamicValue(var436) && (NIL == f6799(var437) || NIL == f6799(var438))) {
                    Errors.error((SubLObject)$ic465$, var437, var438);
                }
                var439 = (SubLObject)T;
            }
        }
        f6787(var435);
        return (SubLObject)$ic466$;
    }
    
    public static SubLObject f6804(final SubLObject var66, final SubLObject var67) {
        SubLObject var69;
        final SubLObject var68 = var69 = var66.rest();
        SubLObject var70 = (SubLObject)NIL;
        SubLObject var71 = (SubLObject)NIL;
        SubLObject var72 = (SubLObject)NIL;
        SubLObject var73 = (SubLObject)NIL;
        SubLObject var74 = (SubLObject)NIL;
        SubLObject var75 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var69, var68, (SubLObject)$ic467$);
        var70 = var69.first();
        var69 = var69.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var69, var68, (SubLObject)$ic467$);
        var71 = var69.first();
        var69 = var69.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var69, var68, (SubLObject)$ic467$);
        var72 = var69.first();
        var69 = var69.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var69, var68, (SubLObject)$ic467$);
        var73 = var69.first();
        var69 = var69.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var69, var68, (SubLObject)$ic467$);
        var74 = var69.first();
        var69 = var69.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var69, var68, (SubLObject)$ic467$);
        var75 = var69.first();
        var69 = var69.rest();
        if (NIL == var69) {
            return (SubLObject)ConsesLow.list((SubLObject)$ic246$, (SubLObject)ConsesLow.list((SubLObject)$ic468$, var71, (SubLObject)ConsesLow.list((SubLObject)$ic469$, var72)), (SubLObject)ConsesLow.list((SubLObject)$ic470$, var70, var75, var72), (SubLObject)ConsesLow.list((SubLObject)$ic253$, var72, (SubLObject)ConsesLow.list((SubLObject)$ic471$, var73, var70, var72)), (SubLObject)ConsesLow.list((SubLObject)$ic472$, var74));
        }
        cdestructuring_bind.cdestructuring_bind_error(var68, (SubLObject)$ic467$);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f6805(final SubLObject var66, final SubLObject var67) {
        SubLObject var69;
        final SubLObject var68 = var69 = var66.rest();
        SubLObject var70 = (SubLObject)NIL;
        SubLObject var71 = (SubLObject)NIL;
        SubLObject var72 = (SubLObject)NIL;
        SubLObject var73 = (SubLObject)NIL;
        SubLObject var74 = (SubLObject)NIL;
        SubLObject var75 = (SubLObject)NIL;
        SubLObject var76 = (SubLObject)NIL;
        SubLObject var77 = (SubLObject)NIL;
        SubLObject var78 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var69, var68, (SubLObject)$ic473$);
        var70 = var69.first();
        var69 = var69.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var69, var68, (SubLObject)$ic473$);
        var71 = var69.first();
        var69 = var69.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var69, var68, (SubLObject)$ic473$);
        var72 = var69.first();
        var69 = var69.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var69, var68, (SubLObject)$ic473$);
        var73 = var69.first();
        var69 = var69.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var69, var68, (SubLObject)$ic473$);
        var74 = var69.first();
        var69 = var69.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var69, var68, (SubLObject)$ic473$);
        var75 = var69.first();
        var69 = var69.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var69, var68, (SubLObject)$ic473$);
        var76 = var69.first();
        var69 = var69.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var69, var68, (SubLObject)$ic473$);
        var77 = var69.first();
        var69 = var69.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var69, var68, (SubLObject)$ic473$);
        var78 = var69.first();
        var69 = var69.rest();
        if (NIL == var69) {
            final SubLObject var79 = (SubLObject)$ic474$;
            final SubLObject var80 = (SubLObject)$ic475$;
            return (SubLObject)ConsesLow.list((SubLObject)$ic244$, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(var79, (SubLObject)ConsesLow.list((SubLObject)$ic469$, var71)), (SubLObject)ConsesLow.list(var80, (SubLObject)ConsesLow.list((SubLObject)$ic469$, var72))), (SubLObject)ConsesLow.list((SubLObject)$ic476$, var77, var71), (SubLObject)ConsesLow.list((SubLObject)$ic472$, var75), (SubLObject)ConsesLow.list((SubLObject)$ic253$, var71, (SubLObject)ConsesLow.list((SubLObject)$ic471$, var73, var70, var71)), (SubLObject)ConsesLow.list((SubLObject)$ic477$, var70, var79, var71, var73, var76, var78), (SubLObject)ConsesLow.list((SubLObject)$ic477$, var70, var80, var72, var74, var76, var78));
        }
        cdestructuring_bind.cdestructuring_bind_error(var68, (SubLObject)$ic473$);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f6789(final SubLObject var13, final SubLObject var376) {
        final SubLThread var377 = SubLProcess.currentSubLThread();
        final SubLObject var378 = f6777(var376);
        final SubLObject var379 = var378.first();
        final SubLObject var380 = conses_high.second(var378);
        final SubLObject var381 = f6778(var376);
        final SubLObject var382 = var381.first();
        final SubLObject var383 = conses_high.second(var381);
        SubLObject var384 = (SubLObject)ZERO_INTEGER;
        SubLObject var385 = (SubLObject)ZERO_INTEGER;
        final SubLObject var386 = StreamsLow.$stream_initial_input_buffer_size$.currentBinding(var377);
        final SubLObject var387 = StreamsLow.$stream_initial_output_buffer_size$.currentBinding(var377);
        try {
            StreamsLow.$stream_initial_input_buffer_size$.bind($g1249$.getGlobalValue(), var377);
            StreamsLow.$stream_initial_output_buffer_size$.bind(StreamsLow.$stream_initial_input_buffer_size$.getDynamicValue(var377), var377);
            SubLObject var388 = (SubLObject)NIL;
            try {
                final SubLObject var216_456 = stream_macros.$stream_requires_locking$.currentBinding(var377);
                try {
                    stream_macros.$stream_requires_locking$.bind((SubLObject)NIL, var377);
                    var388 = compatibility.open_binary(var382, (SubLObject)$ic226$);
                }
                finally {
                    stream_macros.$stream_requires_locking$.rebind(var216_456, var377);
                }
                if (!var388.isStream()) {
                    Errors.error((SubLObject)$ic419$, var382);
                }
                final SubLObject var389 = var388;
                SubLObject var457_458 = (SubLObject)NIL;
                try {
                    final SubLObject var216_457 = stream_macros.$stream_requires_locking$.currentBinding(var377);
                    try {
                        stream_macros.$stream_requires_locking$.bind((SubLObject)NIL, var377);
                        var457_458 = compatibility.open_binary(var383, (SubLObject)$ic226$);
                    }
                    finally {
                        stream_macros.$stream_requires_locking$.rebind(var216_457, var377);
                    }
                    if (!var457_458.isStream()) {
                        Errors.error((SubLObject)$ic419$, var383);
                    }
                    final SubLObject var390 = var457_458;
                    SubLObject var460_461 = (SubLObject)NIL;
                    try {
                        final SubLObject var216_458 = stream_macros.$stream_requires_locking$.currentBinding(var377);
                        try {
                            stream_macros.$stream_requires_locking$.bind((SubLObject)NIL, var377);
                            var460_461 = compatibility.open_binary(var379, (SubLObject)$ic448$);
                        }
                        finally {
                            stream_macros.$stream_requires_locking$.rebind(var216_458, var377);
                        }
                        if (!var460_461.isStream()) {
                            Errors.error((SubLObject)$ic419$, var379);
                        }
                        final SubLObject var391 = var460_461;
                        SubLObject var463_464 = (SubLObject)NIL;
                        try {
                            final SubLObject var216_459 = stream_macros.$stream_requires_locking$.currentBinding(var377);
                            try {
                                stream_macros.$stream_requires_locking$.bind((SubLObject)NIL, var377);
                                var463_464 = compatibility.open_binary(var380, (SubLObject)$ic448$);
                            }
                            finally {
                                stream_macros.$stream_requires_locking$.rebind(var216_459, var377);
                            }
                            if (!var463_464.isStream()) {
                                Errors.error((SubLObject)$ic419$, var380);
                            }
                            final SubLObject var392 = var463_464;
                            SubLObject var393 = (SubLObject)NIL;
                            SubLObject var394 = (SubLObject)NIL;
                            var393 = f6791(var389, var13, var393);
                            var394 = f6791(var390, var13, var394);
                            while (NIL == f6799(var393) || NIL == f6799(var394)) {
                                final SubLObject var395 = f6806(var393);
                                final SubLObject var396 = f6806(var394);
                                if (var395.numL(var396)) {
                                    f6798(var391, var393);
                                    var384 = Numbers.add(var384, (SubLObject)ONE_INTEGER);
                                    for (var393 = f6791(var389, var13, var393); var395.numE(f6806(var393)); var393 = f6791(var389, var13, var393), var385 = Numbers.add(var385, (SubLObject)ONE_INTEGER)) {
                                        f6801(var13, var392, var393);
                                    }
                                }
                                else if (var396.numL(var395)) {
                                    f6798(var391, var394);
                                    var384 = Numbers.add(var384, (SubLObject)ONE_INTEGER);
                                    for (var394 = f6791(var390, var13, var394); var396.numE(f6806(var394)); var394 = f6791(var390, var13, var394), var385 = Numbers.add(var385, (SubLObject)ONE_INTEGER)) {
                                        f6801(var13, var392, var394);
                                    }
                                }
                                else if (NIL != f6796(var393, var394)) {
                                    final SubLObject var397 = f6806(var393);
                                    final SubLObject var398 = f6806(var394);
                                    f6798(var391, var393);
                                    var384 = Numbers.add(var384, (SubLObject)ONE_INTEGER);
                                    for (var393 = f6791(var389, var13, var393); var397.numE(f6806(var393)); var393 = f6791(var389, var13, var393), var385 = Numbers.add(var385, (SubLObject)ONE_INTEGER)) {
                                        f6801(var13, var392, var393);
                                    }
                                    while (var398.numE(f6806(var394))) {
                                        f6801(var13, var392, var394);
                                        var394 = f6791(var390, var13, var394);
                                        var385 = Numbers.add(var385, (SubLObject)ONE_INTEGER);
                                    }
                                }
                                else if (NIL != f6796(var394, var393)) {
                                    final SubLObject var397 = f6806(var394);
                                    final SubLObject var398 = f6806(var393);
                                    f6798(var391, var394);
                                    var384 = Numbers.add(var384, (SubLObject)ONE_INTEGER);
                                    for (var394 = f6791(var390, var13, var394); var397.numE(f6806(var394)); var394 = f6791(var390, var13, var394), var385 = Numbers.add(var385, (SubLObject)ONE_INTEGER)) {
                                        f6801(var13, var392, var394);
                                    }
                                    while (var398.numE(f6806(var393))) {
                                        f6801(var13, var392, var393);
                                        var393 = f6791(var389, var13, var393);
                                        var385 = Numbers.add(var385, (SubLObject)ONE_INTEGER);
                                    }
                                }
                                else {
                                    Errors.error((SubLObject)$ic465$, var393, var394);
                                }
                            }
                        }
                        finally {
                            final SubLObject var216_460 = Threads.$is_thread_performing_cleanupP$.currentBinding(var377);
                            try {
                                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)T, var377);
                                if (var463_464.isStream()) {
                                    streams_high.close(var463_464, (SubLObject)UNPROVIDED);
                                }
                            }
                            finally {
                                Threads.$is_thread_performing_cleanupP$.rebind(var216_460, var377);
                            }
                        }
                    }
                    finally {
                        final SubLObject var216_461 = Threads.$is_thread_performing_cleanupP$.currentBinding(var377);
                        try {
                            Threads.$is_thread_performing_cleanupP$.bind((SubLObject)T, var377);
                            if (var460_461.isStream()) {
                                streams_high.close(var460_461, (SubLObject)UNPROVIDED);
                            }
                        }
                        finally {
                            Threads.$is_thread_performing_cleanupP$.rebind(var216_461, var377);
                        }
                    }
                }
                finally {
                    final SubLObject var216_462 = Threads.$is_thread_performing_cleanupP$.currentBinding(var377);
                    try {
                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)T, var377);
                        if (var457_458.isStream()) {
                            streams_high.close(var457_458, (SubLObject)UNPROVIDED);
                        }
                    }
                    finally {
                        Threads.$is_thread_performing_cleanupP$.rebind(var216_462, var377);
                    }
                }
            }
            finally {
                final SubLObject var216_463 = Threads.$is_thread_performing_cleanupP$.currentBinding(var377);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)T, var377);
                    if (var388.isStream()) {
                        streams_high.close(var388, (SubLObject)UNPROVIDED);
                    }
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(var216_463, var377);
                }
            }
        }
        finally {
            StreamsLow.$stream_initial_output_buffer_size$.rebind(var387, var377);
            StreamsLow.$stream_initial_input_buffer_size$.rebind(var386, var377);
        }
        if (NIL == module0012.$silent_progressP$.getDynamicValue(var377)) {
            PrintLow.format((SubLObject)T, (SubLObject)$ic478$, new SubLObject[] { var384, ONE_INTEGER.numE(var384) ? $ic309$ : $ic479$, var385, ONE_INTEGER.numE(var385) ? $ic309$ : $ic479$ });
        }
        return Values.values(var384, var385);
    }
    
    public static SubLObject f6806(final SubLObject var50) {
        SubLObject var51 = var50.first();
        if (!var51.isNumber()) {
            var51 = $g1254$.getGlobalValue();
        }
        return var51;
    }
    
    public static SubLObject f6807(final SubLObject var346, final SubLObject var13, SubLObject var2) {
        if (var2 == UNPROVIDED) {
            var2 = StreamsLow.$standard_output$.getDynamicValue();
        }
        SubLObject var347 = (SubLObject)NIL;
        SubLObject var348 = (SubLObject)NIL;
        while (NIL == var347) {
            var348 = f6791(var346, var13, var348);
            if (NIL != f6797(var348)) {
                var347 = (SubLObject)T;
            }
            else if (NIL != f6799(var348)) {
                streams_high.write_string((SubLObject)$ic480$, var2, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                streams_high.terpri(var2);
            }
            else {
                print_high.princ(var348, var2);
                streams_high.terpri(var2);
            }
        }
        return var13;
    }
    
    public static SubLObject f6808(final SubLObject var472, final SubLObject var13, SubLObject var2) {
        if (var2 == UNPROVIDED) {
            var2 = StreamsLow.$standard_output$.getDynamicValue();
        }
        final SubLThread var473 = SubLProcess.currentSubLThread();
        SubLObject var474 = var472;
        SubLObject var475 = (SubLObject)NIL;
        var475 = var474.first();
        while (NIL != var474) {
            PrintLow.format(var2, (SubLObject)$ic481$, var475);
            SubLObject var473_474 = (SubLObject)NIL;
            try {
                final SubLObject var476 = stream_macros.$stream_requires_locking$.currentBinding(var473);
                try {
                    stream_macros.$stream_requires_locking$.bind((SubLObject)NIL, var473);
                    var473_474 = compatibility.open_binary(var475, (SubLObject)$ic226$);
                }
                finally {
                    stream_macros.$stream_requires_locking$.rebind(var476, var473);
                }
                if (!var473_474.isStream()) {
                    Errors.error((SubLObject)$ic419$, var475);
                }
                final SubLObject var477 = var473_474;
                f6807(var477, var13, (SubLObject)UNPROVIDED);
            }
            finally {
                final SubLObject var478 = Threads.$is_thread_performing_cleanupP$.currentBinding(var473);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)T, var473);
                    if (var473_474.isStream()) {
                        streams_high.close(var473_474, (SubLObject)UNPROVIDED);
                    }
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(var478, var473);
                }
            }
            var474 = var474.rest();
            var475 = var474.first();
        }
        return var13;
    }
    
    public static SubLObject f6809(final SubLObject var472, final SubLObject var13) {
        final SubLThread var473 = SubLProcess.currentSubLThread();
        SubLObject var474 = var472;
        SubLObject var475 = (SubLObject)NIL;
        var475 = var474.first();
        while (NIL != var474) {
            SubLObject var476 = (SubLObject)NIL;
            try {
                final SubLObject var477 = stream_macros.$stream_requires_locking$.currentBinding(var473);
                try {
                    stream_macros.$stream_requires_locking$.bind((SubLObject)NIL, var473);
                    var476 = compatibility.open_binary(var475, (SubLObject)$ic226$);
                }
                finally {
                    stream_macros.$stream_requires_locking$.rebind(var477, var473);
                }
                if (!var476.isStream()) {
                    Errors.error((SubLObject)$ic419$, var475);
                }
                final SubLObject var478 = var476;
                var473.resetMultipleValues();
                final SubLObject var479 = f6810(var478, var13);
                final SubLObject var480 = var473.secondMultipleValue();
                var473.resetMultipleValues();
                if (NIL == Errors.$ignore_mustsP$.getDynamicValue(var473) && NIL == var479) {
                    Errors.error((SubLObject)$ic482$, var475, var480);
                }
            }
            finally {
                final SubLObject var481 = Threads.$is_thread_performing_cleanupP$.currentBinding(var473);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)T, var473);
                    if (var476.isStream()) {
                        streams_high.close(var476, (SubLObject)UNPROVIDED);
                    }
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(var481, var473);
                }
            }
            var474 = var474.rest();
            var475 = var474.first();
        }
        return var13;
    }
    
    public static SubLObject f6810(final SubLObject var346, final SubLObject var13) {
        SubLObject var347 = Numbers.$most_negative_fixnum$.getGlobalValue();
        SubLObject var348 = (SubLObject)ZERO_INTEGER;
        SubLObject var349 = (SubLObject)ZERO_INTEGER;
        SubLObject var350 = (SubLObject)NIL;
        SubLObject var351 = (SubLObject)NIL;
        while (NIL == var350) {
            var351 = f6791(var346, var13, var351);
            if (NIL != f6797(var351)) {
                if (!var349.isZero()) {
                    return Values.values((SubLObject)NIL, (SubLObject)ConsesLow.list((SubLObject)$ic483$, var348, var349));
                }
                var350 = (SubLObject)T;
            }
            else if (NIL != f6799(var351)) {
                var348 = Numbers.add(var348, (SubLObject)ONE_INTEGER);
                var349 = (SubLObject)ZERO_INTEGER;
                var347 = Numbers.$most_negative_fixnum$.getGlobalValue();
            }
            else {
                final SubLObject var352 = var351.first();
                if (!var347.numLE(var352)) {
                    return Values.values((SubLObject)NIL, (SubLObject)ConsesLow.list((SubLObject)$ic484$, var348, var349));
                }
                var349 = Numbers.add(var349, (SubLObject)ONE_INTEGER);
                var347 = var352;
            }
        }
        return Values.values((SubLObject)T, (SubLObject)NIL);
    }
    
    public static SubLObject f6811(final SubLObject var401, final SubLObject var402) {
        final SubLThread var403 = SubLProcess.currentSubLThread();
        SubLObject var404 = (SubLObject)NIL;
        final SubLObject var405 = $g1247$.currentBinding(var403);
        try {
            $g1247$.bind((SubLObject)$ic386$, var403);
            var404 = f6795(f6812(var401), f6812(var402));
        }
        finally {
            $g1247$.rebind(var405, var403);
        }
        return var404;
    }
    
    public static SubLObject f6812(final SubLObject var480) {
        if ($ic493$ == var480) {
            return f6794((SubLObject)UNPROVIDED);
        }
        if ($ic383$ == var480) {
            return f6793((SubLObject)UNPROVIDED);
        }
        return var480;
    }
    
    public static SubLObject f6813(final SubLObject var66, final SubLObject var67) {
        SubLObject var69;
        final SubLObject var68 = var69 = var66.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var69, var68, (SubLObject)$ic494$);
        final SubLObject var70 = var69.rest();
        var69 = var69.first();
        SubLObject var71 = (SubLObject)NIL;
        SubLObject var72 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var69, var68, (SubLObject)$ic494$);
        var71 = var69.first();
        var69 = var69.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var69, var68, (SubLObject)$ic494$);
        var72 = var69.first();
        var69 = var69.rest();
        SubLObject var73 = (SubLObject)NIL;
        SubLObject var74 = var69;
        SubLObject var75 = (SubLObject)NIL;
        SubLObject var487_488 = (SubLObject)NIL;
        while (NIL != var74) {
            cdestructuring_bind.destructuring_bind_must_consp(var74, var68, (SubLObject)$ic494$);
            var487_488 = var74.first();
            var74 = var74.rest();
            cdestructuring_bind.destructuring_bind_must_consp(var74, var68, (SubLObject)$ic494$);
            if (NIL == conses_high.member(var487_488, (SubLObject)$ic495$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)) {
                var75 = (SubLObject)T;
            }
            if (var487_488 == $ic205$) {
                var73 = var74.first();
            }
            var74 = var74.rest();
        }
        if (NIL != var75 && NIL == var73) {
            cdestructuring_bind.cdestructuring_bind_error(var68, (SubLObject)$ic494$);
        }
        final SubLObject var76 = cdestructuring_bind.property_list_member((SubLObject)$ic496$, var69);
        final SubLObject var77 = (SubLObject)((NIL != var76) ? conses_high.cadr(var76) : $ic497$);
        final SubLObject var78 = cdestructuring_bind.property_list_member((SubLObject)$ic498$, var69);
        final SubLObject var79 = (NIL != var78) ? conses_high.cadr(var78) : $g1215$.getGlobalValue();
        final SubLObject var80;
        var69 = (var80 = var70);
        return (SubLObject)ConsesLow.list((SubLObject)$ic244$, (SubLObject)ConsesLow.list(var71), (SubLObject)ConsesLow.list((SubLObject)$ic499$, (SubLObject)ConsesLow.listS((SubLObject)$ic252$, (SubLObject)ConsesLow.list((SubLObject)$ic253$, var71, (SubLObject)ConsesLow.list((SubLObject)$ic500$, var72, var77, var79)), ConsesLow.append(var80, (SubLObject)NIL)), (SubLObject)ConsesLow.list((SubLObject)$ic501$, (SubLObject)ConsesLow.list((SubLObject)$ic1$, var71), (SubLObject)ConsesLow.list((SubLObject)$ic502$, var71))));
    }
    
    public static SubLObject f6814(final SubLObject var66, final SubLObject var67) {
        SubLObject var69;
        final SubLObject var68 = var69 = var66.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var69, var68, (SubLObject)$ic494$);
        final SubLObject var70 = var69.rest();
        var69 = var69.first();
        SubLObject var71 = (SubLObject)NIL;
        SubLObject var72 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var69, var68, (SubLObject)$ic494$);
        var71 = var69.first();
        var69 = var69.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var69, var68, (SubLObject)$ic494$);
        var72 = var69.first();
        var69 = var69.rest();
        SubLObject var73 = (SubLObject)NIL;
        SubLObject var74 = var69;
        SubLObject var75 = (SubLObject)NIL;
        SubLObject var499_500 = (SubLObject)NIL;
        while (NIL != var74) {
            cdestructuring_bind.destructuring_bind_must_consp(var74, var68, (SubLObject)$ic494$);
            var499_500 = var74.first();
            var74 = var74.rest();
            cdestructuring_bind.destructuring_bind_must_consp(var74, var68, (SubLObject)$ic494$);
            if (NIL == conses_high.member(var499_500, (SubLObject)$ic495$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)) {
                var75 = (SubLObject)T;
            }
            if (var499_500 == $ic205$) {
                var73 = var74.first();
            }
            var74 = var74.rest();
        }
        if (NIL != var75 && NIL == var73) {
            cdestructuring_bind.cdestructuring_bind_error(var68, (SubLObject)$ic494$);
        }
        final SubLObject var76 = cdestructuring_bind.property_list_member((SubLObject)$ic496$, var69);
        final SubLObject var77 = (SubLObject)((NIL != var76) ? conses_high.cadr(var76) : $ic497$);
        final SubLObject var78 = cdestructuring_bind.property_list_member((SubLObject)$ic498$, var69);
        final SubLObject var79 = (NIL != var78) ? conses_high.cadr(var78) : $g1215$.getGlobalValue();
        final SubLObject var80;
        var69 = (var80 = var70);
        return (SubLObject)ConsesLow.list((SubLObject)$ic244$, (SubLObject)ConsesLow.list(var71), (SubLObject)ConsesLow.list((SubLObject)$ic499$, (SubLObject)ConsesLow.listS((SubLObject)$ic252$, (SubLObject)ConsesLow.list((SubLObject)$ic253$, var71, (SubLObject)ConsesLow.list((SubLObject)$ic503$, var72, var77, var79)), ConsesLow.append(var80, (SubLObject)NIL)), (SubLObject)ConsesLow.list((SubLObject)$ic501$, (SubLObject)ConsesLow.list((SubLObject)$ic1$, var71), (SubLObject)ConsesLow.list((SubLObject)$ic502$, var71))));
    }
    
    public static SubLObject f6815(final SubLObject var66, final SubLObject var67) {
        SubLObject var69;
        final SubLObject var68 = var69 = var66.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var69, var68, (SubLObject)$ic504$);
        final SubLObject var70 = var69.rest();
        var69 = var69.first();
        SubLObject var71 = (SubLObject)NIL;
        SubLObject var72 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var69, var68, (SubLObject)$ic504$);
        var71 = var69.first();
        var69 = var69.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var69, var68, (SubLObject)$ic504$);
        var72 = var69.first();
        var69 = var69.rest();
        SubLObject var73 = (SubLObject)NIL;
        SubLObject var74 = var69;
        SubLObject var75 = (SubLObject)NIL;
        SubLObject var509_510 = (SubLObject)NIL;
        while (NIL != var74) {
            cdestructuring_bind.destructuring_bind_must_consp(var74, var68, (SubLObject)$ic504$);
            var509_510 = var74.first();
            var74 = var74.rest();
            cdestructuring_bind.destructuring_bind_must_consp(var74, var68, (SubLObject)$ic504$);
            if (NIL == conses_high.member(var509_510, (SubLObject)$ic505$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)) {
                var75 = (SubLObject)T;
            }
            if (var509_510 == $ic205$) {
                var73 = var74.first();
            }
            var74 = var74.rest();
        }
        if (NIL != var75 && NIL == var73) {
            cdestructuring_bind.cdestructuring_bind_error(var68, (SubLObject)$ic504$);
        }
        final SubLObject var76 = cdestructuring_bind.property_list_member((SubLObject)$ic506$, var69);
        final SubLObject var77 = (NIL != var76) ? conses_high.cadr(var76) : $g1221$.getGlobalValue();
        final SubLObject var78 = cdestructuring_bind.property_list_member((SubLObject)$ic507$, var69);
        final SubLObject var79 = (NIL != var78) ? conses_high.cadr(var78) : $g1222$.getGlobalValue();
        final SubLObject var80 = cdestructuring_bind.property_list_member((SubLObject)$ic496$, var69);
        final SubLObject var81 = (SubLObject)((NIL != var80) ? conses_high.cadr(var80) : $ic497$);
        final SubLObject var82 = cdestructuring_bind.property_list_member((SubLObject)$ic498$, var69);
        final SubLObject var83 = (NIL != var82) ? conses_high.cadr(var82) : $g1215$.getGlobalValue();
        final SubLObject var84;
        var69 = (var84 = var70);
        return (SubLObject)ConsesLow.list((SubLObject)$ic244$, (SubLObject)ConsesLow.list(var71), (SubLObject)ConsesLow.list((SubLObject)$ic499$, (SubLObject)ConsesLow.listS((SubLObject)$ic252$, (SubLObject)ConsesLow.list((SubLObject)$ic253$, var71, (SubLObject)ConsesLow.list((SubLObject)$ic508$, var72, var77, var79, var81, var83)), ConsesLow.append(var84, (SubLObject)NIL)), (SubLObject)ConsesLow.list((SubLObject)$ic501$, (SubLObject)ConsesLow.list((SubLObject)$ic1$, var71), (SubLObject)ConsesLow.list((SubLObject)$ic502$, var71))));
    }
    
    public static SubLObject f6816(final SubLObject var66, final SubLObject var67) {
        SubLObject var69;
        final SubLObject var68 = var69 = var66.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var69, var68, (SubLObject)$ic509$);
        final SubLObject var70 = var69.rest();
        var69 = var69.first();
        SubLObject var71 = (SubLObject)NIL;
        SubLObject var72 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var69, var68, (SubLObject)$ic509$);
        var71 = var69.first();
        var69 = var69.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var69, var68, (SubLObject)$ic509$);
        var72 = var69.first();
        var69 = var69.rest();
        SubLObject var73 = (SubLObject)NIL;
        SubLObject var74 = var69;
        SubLObject var75 = (SubLObject)NIL;
        SubLObject var522_523 = (SubLObject)NIL;
        while (NIL != var74) {
            cdestructuring_bind.destructuring_bind_must_consp(var74, var68, (SubLObject)$ic509$);
            var522_523 = var74.first();
            var74 = var74.rest();
            cdestructuring_bind.destructuring_bind_must_consp(var74, var68, (SubLObject)$ic509$);
            if (NIL == conses_high.member(var522_523, (SubLObject)$ic510$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)) {
                var75 = (SubLObject)T;
            }
            if (var522_523 == $ic205$) {
                var73 = var74.first();
            }
            var74 = var74.rest();
        }
        if (NIL != var75 && NIL == var73) {
            cdestructuring_bind.cdestructuring_bind_error(var68, (SubLObject)$ic509$);
        }
        final SubLObject var76 = cdestructuring_bind.property_list_member((SubLObject)$ic511$, var69);
        final SubLObject var77 = (NIL != var76) ? conses_high.cadr(var76) : module0075.f5180();
        final SubLObject var78 = cdestructuring_bind.property_list_member((SubLObject)$ic496$, var69);
        final SubLObject var79 = (SubLObject)((NIL != var78) ? conses_high.cadr(var78) : $ic497$);
        final SubLObject var80 = cdestructuring_bind.property_list_member((SubLObject)$ic498$, var69);
        final SubLObject var81 = (NIL != var80) ? conses_high.cadr(var80) : $g1215$.getGlobalValue();
        final SubLObject var82 = cdestructuring_bind.property_list_member((SubLObject)$ic512$, var69);
        final SubLObject var83 = (SubLObject)((NIL != var82) ? conses_high.cadr(var82) : NIL);
        final SubLObject var84;
        var69 = (var84 = var70);
        return (SubLObject)ConsesLow.list((SubLObject)$ic244$, (SubLObject)ConsesLow.list(var71), (SubLObject)ConsesLow.list((SubLObject)$ic499$, (SubLObject)ConsesLow.listS((SubLObject)$ic252$, (SubLObject)ConsesLow.list((SubLObject)$ic253$, var71, (SubLObject)ConsesLow.list((SubLObject)$ic513$, var72, var77, var79, var81)), ConsesLow.append(var84, (SubLObject)NIL)), (SubLObject)ConsesLow.list((SubLObject)$ic501$, (SubLObject)ConsesLow.list((SubLObject)$ic390$, var71), (SubLObject)ConsesLow.list((SubLObject)$ic514$, var71, var83))));
    }
    
    public static SubLObject f6817(final SubLObject var302, final SubLObject var530, final SubLObject var531) {
        final SubLThread var532 = SubLProcess.currentSubLThread();
        final SubLObject var533 = $g1247$.currentBinding(var532);
        final SubLObject var534 = $g1255$.currentBinding(var532);
        try {
            $g1247$.bind(var531, var532);
            $g1255$.bind(var530, var532);
            final SubLObject var535 = Hashtables.make_hash_table(var302, (SubLObject)EQUAL, (SubLObject)UNPROVIDED);
            SubLObject var536;
            for (var536 = (SubLObject)NIL, var536 = (SubLObject)ZERO_INTEGER; var536.numL(var302); var536 = Numbers.add(var536, (SubLObject)ONE_INTEGER)) {
                module0079.f5412(var535, module0038.f2624(var536), Sequences.cconcatenate((SubLObject)$ic517$, module0006.f203(var536)));
            }
            final SubLObject var537 = f6818(var535, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
            SubLObject var538 = (SubLObject)NIL;
            try {
                var532.throwStack.push($ic416$);
                final SubLObject var216_535 = Errors.$error_handler$.currentBinding(var532);
                try {
                    Errors.$error_handler$.bind(Symbols.symbol_function((SubLObject)$ic417$), var532);
                    try {
                        Filesys.delete_file(var537);
                    }
                    catch (Throwable var539) {
                        Errors.handleThrowable(var539, (SubLObject)NIL);
                    }
                }
                finally {
                    Errors.$error_handler$.rebind(var216_535, var532);
                }
            }
            catch (Throwable var540) {
                var538 = Errors.handleThrowable(var540, (SubLObject)$ic416$);
            }
            finally {
                var532.throwStack.pop();
            }
        }
        finally {
            $g1255$.rebind(var534, var532);
            $g1247$.rebind(var533, var532);
        }
        return (SubLObject)$ic518$;
    }
    
    public static SubLObject f6818(final SubLObject var532, SubLObject var65, SubLObject var536) {
        if (var65 == UNPROVIDED) {
            var65 = (SubLObject)$ic164$;
        }
        if (var536 == UNPROVIDED) {
            var536 = (SubLObject)$ic519$;
        }
        final SubLThread var537 = SubLProcess.currentSubLThread();
        final SubLObject var538 = module0079.f5408(var532);
        final SubLObject var539 = module0075.f5185((SubLObject)$ic520$, (SubLObject)UNPROVIDED);
        if (!var536.isFunctionSpec()) {
            var536 = var538;
        }
        final SubLObject var540 = f6656(var539, module0075.f5180(), var538, var65);
        final SubLObject var541 = (SubLObject)$ic521$;
        SubLObject var542 = (SubLObject)ZERO_INTEGER;
        final SubLObject var543 = module0079.f5406(var532);
        assert NIL != Types.stringp(var541) : var541;
        final SubLObject var544 = module0012.$g75$.currentBinding(var537);
        final SubLObject var545 = module0012.$g76$.currentBinding(var537);
        final SubLObject var546 = module0012.$g77$.currentBinding(var537);
        final SubLObject var547 = module0012.$g78$.currentBinding(var537);
        try {
            module0012.$g75$.bind((SubLObject)ZERO_INTEGER, var537);
            module0012.$g76$.bind((SubLObject)NIL, var537);
            module0012.$g77$.bind((SubLObject)T, var537);
            module0012.$g78$.bind(Time.get_universal_time(), var537);
            module0012.f478(var541);
            final SubLObject var548 = module0079.f5424(var532);
            SubLObject var551;
            for (SubLObject var549 = (SubLObject)NIL; NIL == var549; var549 = (SubLObject)makeBoolean(NIL == var551)) {
                var537.resetMultipleValues();
                final SubLObject var550 = module0052.f3693(var548);
                var551 = var537.secondMultipleValue();
                var537.resetMultipleValues();
                if (NIL != var551) {
                    SubLObject var553;
                    final SubLObject var552 = var553 = var550;
                    SubLObject var554 = (SubLObject)NIL;
                    SubLObject var555 = (SubLObject)NIL;
                    cdestructuring_bind.destructuring_bind_must_consp(var553, var552, (SubLObject)$ic522$);
                    var554 = var553.first();
                    var553 = var553.rest();
                    cdestructuring_bind.destructuring_bind_must_consp(var553, var552, (SubLObject)$ic522$);
                    var555 = var553.first();
                    var553 = var553.rest();
                    if (NIL == var553) {
                        module0012.note_percent_progress(var542, var543);
                        var542 = Numbers.add(var542, (SubLObject)ONE_INTEGER);
                        f6657(var554, var540, var555);
                    }
                    else {
                        cdestructuring_bind.cdestructuring_bind_error(var552, (SubLObject)$ic522$);
                    }
                }
            }
            module0012.f479();
        }
        finally {
            module0012.$g78$.rebind(var547, var537);
            module0012.$g77$.rebind(var546, var537);
            module0012.$g76$.rebind(var545, var537);
            module0012.$g75$.rebind(var544, var537);
        }
        f6658(var540, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        SubLObject var557;
        SubLObject var556 = var557 = f6613(var539, var538, var65);
        SubLObject var558 = (SubLObject)ZERO_INTEGER;
        if (NIL == Errors.$ignore_mustsP$.getDynamicValue(var537) && !module0079.f5406(var532).numE(f6612(var556))) {
            Errors.error((SubLObject)$ic523$, module0079.f5406(var532), f6612(var556));
        }
        final SubLObject var559 = (SubLObject)$ic524$;
        SubLObject var560 = (SubLObject)ZERO_INTEGER;
        final SubLObject var561 = module0079.f5406(var532);
        assert NIL != Types.stringp(var559) : var559;
        final SubLObject var562 = module0012.$g75$.currentBinding(var537);
        final SubLObject var563 = module0012.$g76$.currentBinding(var537);
        final SubLObject var564 = module0012.$g77$.currentBinding(var537);
        final SubLObject var565 = module0012.$g78$.currentBinding(var537);
        try {
            module0012.$g75$.bind((SubLObject)ZERO_INTEGER, var537);
            module0012.$g76$.bind((SubLObject)NIL, var537);
            module0012.$g77$.bind((SubLObject)T, var537);
            module0012.$g78$.bind(Time.get_universal_time(), var537);
            module0012.f478(var559);
            final SubLObject var566 = module0079.f5424(var532);
            SubLObject var569;
            for (SubLObject var567 = (SubLObject)NIL; NIL == var567; var567 = (SubLObject)makeBoolean(NIL == var569)) {
                var537.resetMultipleValues();
                final SubLObject var568 = module0052.f3693(var566);
                var569 = var537.secondMultipleValue();
                var537.resetMultipleValues();
                if (NIL != var569) {
                    SubLObject var571;
                    final SubLObject var570 = var571 = var568;
                    SubLObject var572 = (SubLObject)NIL;
                    SubLObject var573 = (SubLObject)NIL;
                    cdestructuring_bind.destructuring_bind_must_consp(var571, var570, (SubLObject)$ic522$);
                    var572 = var571.first();
                    var571 = var571.rest();
                    cdestructuring_bind.destructuring_bind_must_consp(var571, var570, (SubLObject)$ic522$);
                    var573 = var571.first();
                    var571 = var571.rest();
                    if (NIL == var571) {
                        module0012.note_percent_progress(var560, var561);
                        var560 = Numbers.add(var560, (SubLObject)ONE_INTEGER);
                        final SubLObject var574 = f6621(var572, var556, var557);
                        if (NIL == Errors.$ignore_mustsP$.getDynamicValue(var537) && NIL == Functions.funcall(var536, var573, var574)) {
                            Errors.error((SubLObject)$ic525$, var572, var573, var574);
                        }
                        var558 = Numbers.add(var558, (SubLObject)ONE_INTEGER);
                    }
                    else {
                        cdestructuring_bind.cdestructuring_bind_error(var570, (SubLObject)$ic522$);
                    }
                }
            }
            module0012.f479();
        }
        finally {
            module0012.$g78$.rebind(var565, var537);
            module0012.$g77$.rebind(var564, var537);
            module0012.$g76$.rebind(var563, var537);
            module0012.$g75$.rebind(var562, var537);
        }
        if (NIL == Errors.$ignore_mustsP$.getDynamicValue(var537) && !var558.numE(module0079.f5406(var532))) {
            Errors.error((SubLObject)$ic526$, var558, module0079.f5406(var532));
        }
        f6615(var556);
        var556 = (var557 = f6613(var539, var538, var65));
        var558 = (SubLObject)ZERO_INTEGER;
        final SubLObject var575 = var556;
        module0012.$g82$.setDynamicValue((SubLObject)$ic527$, var537);
        module0012.$g73$.setDynamicValue(Time.get_universal_time(), var537);
        module0012.$g83$.setDynamicValue(f6612(var575), var537);
        module0012.$g84$.setDynamicValue((SubLObject)ZERO_INTEGER, var537);
        final SubLObject var576 = module0012.$g75$.currentBinding(var537);
        final SubLObject var577 = module0012.$g76$.currentBinding(var537);
        final SubLObject var578 = module0012.$g77$.currentBinding(var537);
        final SubLObject var579 = module0012.$g78$.currentBinding(var537);
        try {
            module0012.$g75$.bind((SubLObject)ZERO_INTEGER, var537);
            module0012.$g76$.bind((SubLObject)NIL, var537);
            module0012.$g77$.bind((SubLObject)T, var537);
            module0012.$g78$.bind(Time.get_universal_time(), var537);
            module0012.f478(module0012.$g82$.getDynamicValue(var537));
            SubLObject var580 = (SubLObject)NIL;
            SubLObject var584;
            for (SubLObject var581 = (SubLObject)NIL; NIL == var581; var581 = Types.sublisp_null(var584)) {
                var537.resetMultipleValues();
                final SubLObject var582 = f6632(var575, var580, (SubLObject)NIL);
                final SubLObject var583 = var537.secondMultipleValue();
                var584 = var537.thirdMultipleValue();
                var537.resetMultipleValues();
                if (NIL != var584) {
                    final SubLObject var585 = var582;
                    final SubLObject var586 = var583;
                    module0012.note_percent_progress(module0012.$g84$.getDynamicValue(var537), module0012.$g83$.getDynamicValue(var537));
                    module0012.$g84$.setDynamicValue(Numbers.add(module0012.$g84$.getDynamicValue(var537), (SubLObject)ONE_INTEGER), var537);
                    final SubLObject var587 = module0079.f5414(var532, var585, var557);
                    if (NIL == Errors.$ignore_mustsP$.getDynamicValue(var537) && NIL == Functions.funcall(var536, var586, var587)) {
                        Errors.error((SubLObject)$ic528$, var585, var586, var587);
                    }
                    var558 = Numbers.add(var558, (SubLObject)ONE_INTEGER);
                }
                var580 = var584;
            }
            module0012.f479();
        }
        finally {
            module0012.$g78$.rebind(var579, var537);
            module0012.$g77$.rebind(var578, var537);
            module0012.$g76$.rebind(var577, var537);
            module0012.$g75$.rebind(var576, var537);
        }
        if (NIL == Errors.$ignore_mustsP$.getDynamicValue(var537) && !var558.numE(module0079.f5406(var532))) {
            Errors.error((SubLObject)$ic526$, var558, module0079.f5406(var532));
        }
        f6615(var556);
        return var539;
    }
    
    public static SubLObject f6819(final SubLObject var183, final SubLObject var555, final SubLObject var556, final SubLObject var557, SubLObject var537, SubLObject var536, SubLObject var65) {
        if (var537 == UNPROVIDED) {
            var537 = (SubLObject)EQL;
        }
        if (var536 == UNPROVIDED) {
            var536 = (SubLObject)EQUALP;
        }
        if (var65 == UNPROVIDED) {
            var65 = (SubLObject)$ic164$;
        }
        final SubLThread var558 = SubLProcess.currentSubLThread();
        final SubLObject var559 = $g1256$.currentBinding(var558);
        try {
            $g1256$.bind((SubLObject)NIL, var558);
            final SubLObject var560 = Hashtables.make_hash_table(var183, var537, (SubLObject)UNPROVIDED);
            SubLObject var561;
            SubLObject var562;
            SubLObject var563;
            SubLObject var564;
            for (var561 = (SubLObject)NIL, var561 = (SubLObject)ZERO_INTEGER; var561.numL(var183); var561 = Numbers.add(var561, (SubLObject)ONE_INTEGER)) {
                var562 = Functions.funcall(var555);
                var563 = Functions.funcall(var556, var562);
                var564 = Functions.funcall(var557, var562);
                module0079.f5412(var560, var563, var564);
            }
            final SubLObject var565 = f6818(var560, var65, var536);
            SubLObject var566 = (SubLObject)NIL;
            try {
                var558.throwStack.push($ic416$);
                final SubLObject var216_560 = Errors.$error_handler$.currentBinding(var558);
                try {
                    Errors.$error_handler$.bind(Symbols.symbol_function((SubLObject)$ic417$), var558);
                    try {
                        Filesys.delete_file(var565);
                    }
                    catch (Throwable var567) {
                        Errors.handleThrowable(var567, (SubLObject)NIL);
                    }
                }
                finally {
                    Errors.$error_handler$.rebind(var216_560, var558);
                }
            }
            catch (Throwable var568) {
                var566 = Errors.handleThrowable(var568, (SubLObject)$ic416$);
            }
            finally {
                var558.throwStack.pop();
            }
        }
        finally {
            $g1256$.rebind(var559, var558);
        }
        return (SubLObject)$ic518$;
    }
    
    public static SubLObject f6820() {
        final SubLThread var79 = SubLProcess.currentSubLThread();
        if (NIL == $g1256$.getDynamicValue(var79)) {
            final SubLObject var80 = constants_high_oc.f10773((SubLObject)UNPROVIDED);
            final SubLObject var81 = constant_handles_oc.f8440(var80);
            final SubLObject var82 = constants_high_oc.f10744(var80);
            final SubLObject var83 = constants_high_oc.f10743(var80);
            $g1256$.setDynamicValue((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)$ic143$, (SubLObject)ConsesLow.cons((SubLObject)Characters.CHAR_I, var81), (SubLObject)$ic531$, var82), (SubLObject)ConsesLow.list((SubLObject)$ic143$, (SubLObject)ConsesLow.cons((SubLObject)Characters.CHAR_G, var82), (SubLObject)$ic531$, var81), (SubLObject)ConsesLow.list((SubLObject)$ic143$, (SubLObject)ConsesLow.cons((SubLObject)Characters.CHAR_T, var83), (SubLObject)$ic531$, var81), (SubLObject)ConsesLow.list((SubLObject)$ic143$, (SubLObject)ConsesLow.cons((SubLObject)Characters.CHAR_S, var81), (SubLObject)$ic531$, var83)), var79);
        }
        return $g1256$.getDynamicValue(var79);
    }
    
    public static SubLObject f6821(final SubLObject var200) {
        final SubLObject var201 = var200.first();
        return conses_high.getf(var201, (SubLObject)$ic143$, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f6822(final SubLObject var200) {
        final SubLThread var201 = SubLProcess.currentSubLThread();
        final SubLObject var202 = var200.first();
        final SubLObject var203 = conses_high.getf(var202, (SubLObject)$ic531$, (SubLObject)UNPROVIDED);
        $g1256$.setDynamicValue($g1256$.getDynamicValue(var201).rest(), var201);
        return var203;
    }
    
    public static SubLObject f6823() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0093", "f6456", "S#8154", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0093", "f6457", "S#8139", 1, 0, false);
        new $f6457$UnaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0093", "f6458", "S#8155", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0093", "f6459", "S#8156", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0093", "f6460", "S#8157", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0093", "f6461", "S#8158", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0093", "f6462", "S#8159", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0093", "f6463", "S#8160", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0093", "f6464", "S#8161", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0093", "f6465", "S#8162", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0093", "f6466", "S#8163", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0093", "f6467", "S#8164", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0093", "f6468", "S#8165", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0093", "f6469", "S#8166", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0093", "f6470", "S#8167", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0093", "f6471", "S#8168", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0093", "f6472", "S#8169", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0093", "f6473", "S#8170", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0093", "f6474", "S#8171", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0093", "f6475", "S#8172", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0093", "f6476", "S#8173", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0093", "f6477", "S#8174", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0093", "f6478", "S#8175", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0093", "f6479", "S#8176", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0093", "f6480", "S#8177", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0093", "f6481", "S#8178", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0093", "f6482", "S#8179", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0093", "f6483", "S#8180", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0093", "f6484", "S#8181", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0093", "f6485", "S#8182", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0093", "f6486", "S#8183", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0093", "f6487", "S#8184", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0093", "f6489", "S#8185", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0093", "f6491", "S#8186", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0093", "f6490", "S#8187", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0093", "f6492", "S#8188", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0093", "f6493", "S#8189", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0093", "f6495", "S#8190", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0093", "f6496", "S#8191", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0093", "f6497", "S#8192", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0093", "f6498", "S#8193", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0093", "f6499", "S#8141", 1, 0, false);
        new $f6499$UnaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0093", "f6500", "S#8194", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0093", "f6501", "S#8195", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0093", "f6502", "S#8196", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0093", "f6503", "S#8197", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0093", "f6504", "S#8198", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0093", "f6505", "S#8199", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0093", "f6506", "S#8200", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0093", "f6507", "S#8201", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0093", "f6508", "S#8202", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0093", "f6509", "S#8203", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0093", "f6510", "S#8204", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0093", "f6511", "S#8205", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0093", "f6512", "S#8206", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0093", "f6513", "S#8207", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0093", "f6514", "S#8208", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0093", "f6515", "S#8209", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0093", "f6516", "S#8210", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0093", "f6517", "S#8211", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0093", "f6518", "S#8212", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0093", "f6519", "S#8213", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0093", "f6520", "S#8214", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0093", "f6521", "S#8215", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0093", "f6522", "S#8216", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0093", "f6523", "S#8217", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0093", "f6524", "S#8218", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0093", "f6525", "S#8219", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0093", "f6526", "S#8220", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0093", "f6527", "S#8221", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0093", "f6528", "S#8222", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0093", "f6488", "S#8223", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0093", "f6529", "S#8224", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0093", "f6530", "S#8143", 1, 0, false);
        new $f6530$UnaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0093", "f6531", "S#8225", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0093", "f6532", "S#8226", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0093", "f6533", "S#8227", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0093", "f6534", "S#8228", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0093", "f6535", "S#8229", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0093", "f6536", "S#8230", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0093", "f6537", "S#8231", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0093", "f6538", "S#8232", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0093", "f6539", "S#8233", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0093", "f6540", "S#8234", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0093", "f6541", "S#8235", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0093", "f6542", "S#8236", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0093", "f6543", "S#8237", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0093", "f6544", "S#8238", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0093", "f6545", "S#8239", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0093", "f6546", "S#8240", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0093", "f6547", "S#8145", 1, 0, false);
        new $f6547$UnaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0093", "f6548", "S#8241", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0093", "f6549", "S#8242", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0093", "f6550", "S#8243", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0093", "f6551", "S#8244", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0093", "f6552", "S#8245", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0093", "f6553", "S#8246", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0093", "f6554", "S#8247", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0093", "f6555", "S#8248", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0093", "f6556", "S#8249", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0093", "f6557", "S#8250", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0093", "f6558", "S#8251", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0093", "f6559", "S#8252", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0093", "f6561", "S#8253", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0093", "f6564", "S#8254", 5, 3, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0093", "f6566", "S#8255", 6, 4, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0093", "f6567", "S#8256", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0093", "f6568", "S#8257", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0093", "f6569", "S#8258", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0093", "f6570", "S#8259", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0093", "f6571", "S#8260", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0093", "f6572", "S#8261", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0093", "f6575", "S#8262", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0093", "f6576", "S#8263", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0093", "f6573", "S#8264", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0093", "f6577", "S#8265", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0093", "f6578", "S#8266", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0093", "f6580", "S#8147", 1, 0, false);
        new $f6580$UnaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0093", "f6581", "S#8267", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0093", "f6582", "S#8268", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0093", "f6583", "S#8269", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0093", "f6584", "S#8270", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0093", "f6585", "S#8271", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0093", "f6586", "S#8272", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0093", "f6587", "S#8273", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0093", "f6588", "S#8274", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0093", "f6589", "S#8275", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0093", "f6590", "S#8276", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0093", "f6591", "S#8277", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0093", "f6592", "S#8278", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0093", "f6593", "S#8279", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0093", "f6594", "S#8280", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0093", "f6595", "S#8281", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0093", "f6579", "S#8282", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0093", "f6596", "S#8283", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0093", "f6597", "S#8284", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0093", "f6598", "S#8146", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0093", "f6599", "S#8285", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0093", "f6600", "S#8286", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0093", "f6601", "S#8287", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0093", "f6602", "S#8288", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0093", "f6603", "S#8289", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0093", "f6604", "S#8290", 1, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0093", "f6605", "S#8291");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0093", "f6494", "S#8292", 4, 2, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0093", "f6606", "S#8293");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0093", "f6607", "S#8294", 2, 3, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0093", "f6610", "S#8295", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0093", "f6613", "S#8296", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0093", "f6614", "S#8297", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0093", "f6615", "S#8298", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0093", "f6612", "S#8299", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0093", "f6617", "S#8300", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0093", "f6618", "S#8301", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0093", "f6621", "S#8302", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0093", "f6624", "S#8303", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0093", "f6626", "S#8304", 2, 2, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0093", "f6627", "S#8305");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0093", "f6628", "S#8306");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0093", "f6629", "S#8307");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0093", "f6630", "S#8308");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0093", "f6631", "S#8309", 1, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0093", "f6633", "S#8310");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0093", "f6634", "S#8311");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0093", "f6635", "S#8312");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0093", "f6636", "S#8313");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0093", "f6637", "S#8314");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0093", "f6638", "S#8315", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0093", "f6639", "S#8316", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0093", "f6641", "S#8317", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0093", "f6643", "S#8318", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0093", "f6645", "S#8319", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0093", "f6647", "S#8320", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0093", "f6648", "S#8321", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0093", "f6650", "S#8322", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0093", "f6646", "S#8323", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0093", "f6649", "S#8324", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0093", "f6653", "S#8325", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0093", "f6651", "S#8326", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0093", "f6654", "S#8327", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0093", "f6652", "S#8328", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0093", "f6640", "S#8329", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0093", "f6655", "S#8330", 2, 4, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0093", "f6659", "S#8331", 2, 3, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0093", "f6660", "S#8332", 2, 5, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0093", "f6661", "S#8333", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0093", "f6662", "S#8334", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0093", "f6663", "S#8335", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0093", "f6608", "S#8336", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0093", "f6565", "S#8337", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0093", "f6620", "S#8338", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0093", "f6622", "S#8339", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0093", "f6664", "S#8340", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0093", "f6665", "S#8341", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0093", "f6632", "S#8342", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0093", "f6619", "S#8343", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0093", "f6669", "S#8344", 6, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0093", "f6670", "S#8345", 6, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0093", "f6625", "S#8346", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0093", "f6677", "S#8347", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0093", "f6679", "S#8348", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0093", "f6680", "S#8349", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0093", "f6682", "S#8350", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0093", "f6675", "S#8351", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0093", "f6678", "S#8352", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0093", "f6623", "S#8353", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0093", "f6684", "S#8354", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0093", "f6686", "S#8149", 1, 0, false);
        new $f6686$UnaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0093", "f6687", "S#8355", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0093", "f6688", "S#8356", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0093", "f6689", "S#8357", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0093", "f6690", "S#8358", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0093", "f6691", "S#8359", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0093", "f6692", "S#8360", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0093", "f6693", "S#8361", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0093", "f6694", "S#8362", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0093", "f6685", "S#8363", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0093", "f6695", "S#8364", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0093", "f6696", "S#8365", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0093", "f6699", "S#8366", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0093", "f6676", "S#8367", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0093", "f6701", "S#8368", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0093", "f6702", "S#8369", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0093", "f6609", "S#8370", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0093", "f6703", "S#8371", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0093", "f6704", "S#8372", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0093", "f6562", "S#8373", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0093", "f6706", "S#8374", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0093", "f6707", "S#8375", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0093", "f6708", "S#8376", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0093", "f6574", "S#8377", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0093", "f6709", "S#8378", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0093", "f6710", "S#8379", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0093", "f6711", "S#8380", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0093", "f6712", "S#8381", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0093", "f6713", "S#8382", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0093", "f6714", "S#8383", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0093", "f6705", "S#8384", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0093", "f6715", "S#8385", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0093", "f6642", "S#8386", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0093", "f6674", "S#8387", 3, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0093", "f6716", "S#8388", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0093", "f6560", "S#8389", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0093", "f6717", "S#8390", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0093", "f6681", "S#8391", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0093", "f6668", "S#8392", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0093", "f6718", "S#8393", 5, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0093", "f6667", "S#8394", 3, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0093", "f6683", "S#8395", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0093", "f6720", "S#8396", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0093", "f6719", "S#8397", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0093", "f6721", "S#8398", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0093", "f6722", "S#8399", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0093", "f6725", "S#8400", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0093", "f6723", "S#8401", 3, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0093", "f6728", "S#8402");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0093", "f6727", "S#8403", 6, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0093", "f6729", "S#8404", 5, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0093", "f6563", "S#8405", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0093", "f6671", "S#8406", 3, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0093", "f6730", "S#8407", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0093", "f6672", "S#8408", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0093", "f6673", "S#8409", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0093", "f6732", "S#8410", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0093", "f6666", "S#8411", 3, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0093", "f6731", "S#8412", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0093", "f6724", "S#8413", 1, 1, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0093", "f6733", "S#8414");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0093", "f6611", "S#8415", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0093", "f6616", "S#8416", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0093", "f6734", "S#8417", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0093", "f6735", "S#8418", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0093", "f6736", "S#8419", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0093", "f6738", "S#8420", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0093", "f6737", "S#8421", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0093", "f6644", "S#8422", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0093", "f6697", "S#8423", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0093", "f6700", "S#8424", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0093", "f6698", "S#8425", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0093", "f6739", "S#8426", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0093", "f6740", "S#8427", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0093", "f6741", "S#8428", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0093", "f6742", "S#8429", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0093", "f6743", "S#8430", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0093", "f6726", "S#8431", 5, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0093", "f6744", "S#8432", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0093", "f6745", "S#8433", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0093", "f6746", "S#8434", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0093", "f6747", "S#8435", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0093", "f6748", "S#8436", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0093", "f6749", "S#8151", 1, 0, false);
        new $f6749$UnaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0093", "f6750", "S#8437", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0093", "f6751", "S#8438", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0093", "f6752", "S#8439", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0093", "f6753", "S#8440", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0093", "f6754", "S#8441", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0093", "f6755", "S#8442", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0093", "f6756", "S#8443", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0093", "f6757", "S#8444", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0093", "f6758", "S#8445", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0093", "f6759", "S#8446", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0093", "f6760", "S#8447", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0093", "f6656", "S#8448", 1, 3, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0093", "f6761", "S#8449", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0093", "f6762", "S#8450", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0093", "f6657", "S#8451", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0093", "f6763", "S#8452", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0093", "f6764", "S#8453", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0093", "f6658", "S#8454", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0093", "f6765", "S#8455", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0093", "f6768", "S#8456", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0093", "f6769", "S#8457", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0093", "f6770", "S#8458", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0093", "f6766", "S#8459", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0093", "f6773", "S#8460", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0093", "f6771", "S#8461", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0093", "f6767", "S#8462", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0093", "f6774", "S#8463", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0093", "f6775", "S#8153", 1, 0, false);
        new $f6775$UnaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0093", "f6776", "S#8464", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0093", "f6777", "S#8465", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0093", "f6778", "S#8466", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0093", "f6779", "S#8467", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0093", "f6780", "S#8468", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0093", "f6781", "S#8469", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0093", "f6782", "S#8470", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0093", "f6783", "S#8471", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0093", "f6784", "S#8472", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0093", "f6772", "S#8473", 3, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0093", "f6785", "S#8474", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0093", "f6790", "S#8475", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0093", "f6786", "S#8476", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0093", "f6791", "S#8477", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0093", "f6794", "S#8478", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0093", "f6793", "S#8479", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0093", "f6795", "S#8480", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0093", "f6796", "S#8481", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0093", "f6792", "S#8482", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0093", "f6799", "S#8483", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0093", "f6797", "S#8484", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0093", "f6787", "S#8485", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0093", "f6800", "S#8486", 3, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0093", "f6798", "S#8487", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0093", "f6801", "S#8488", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0093", "f6788", "S#8489", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0093", "f6802", "S#8490", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0093", "f6803", "S#8491", 4, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0093", "f6804", "S#8492");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0093", "f6805", "S#8493");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0093", "f6789", "S#8494", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0093", "f6806", "S#8495", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0093", "f6807", "S#8496", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0093", "f6808", "S#8497", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0093", "f6809", "S#8498", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0093", "f6810", "S#8499", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0093", "f6811", "S#8500", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0093", "f6812", "S#8501", 1, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0093", "f6813", "S#8502");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0093", "f6814", "S#8503");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0093", "f6815", "S#8504");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0093", "f6816", "S#8505");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0093", "f6817", "S#8506", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0093", "f6818", "S#8507", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0093", "f6819", "S#8508", 4, 3, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0093", "f6820", "S#8509", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0093", "f6821", "S#8510", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0093", "f6822", "S#8511", 1, 0, false);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f6824() {
        $g1210$ = SubLFiles.defconstant("S#8512", (SubLObject)$ic0$);
        $g1211$ = SubLFiles.defconstant("S#8513", (SubLObject)$ic61$);
        $g1212$ = SubLFiles.defconstant("S#8514", (SubLObject)$ic121$);
        $g1213$ = SubLFiles.defconstant("S#8515", (SubLObject)$ic148$);
        $g1214$ = SubLFiles.deflexical("S#8516", Symbols.symbol_function((SubLObject)EQL));
        $g1215$ = SubLFiles.deflexical("S#8517", (SubLObject)$ic164$);
        $g1216$ = SubLFiles.defparameter("S#8518", (SubLObject)$ic165$);
        $g1217$ = SubLFiles.defparameter("S#8519", (SubLObject)FOUR_INTEGER);
        $g1218$ = SubLFiles.defconstant("S#8520", (SubLObject)ONE_INTEGER);
        $g1219$ = SubLFiles.defconstant("S#8521", (SubLObject)THREE_INTEGER);
        $g1220$ = SubLFiles.defconstant("S#8522", (SubLObject)$ic166$);
        $g1221$ = SubLFiles.defconstant("S#8523", (SubLObject)$ic167$);
        $g1222$ = SubLFiles.defconstant("S#8524", (SubLObject)$ic167$);
        $g1223$ = SubLFiles.defconstant("S#8525", (SubLObject)ZERO_INTEGER);
        $g1224$ = SubLFiles.defconstant("S#8526", (SubLObject)ONE_INTEGER);
        $g1225$ = SubLFiles.defconstant("S#8527", (SubLObject)ZERO_INTEGER);
        $g1226$ = SubLFiles.deflexical("S#8528", f6568());
        $g1227$ = SubLFiles.deflexical("S#8529", f6570());
        $g1228$ = SubLFiles.deflexical("S#8530", Numbers.subtract(Numbers.expt((SubLObject)TWO_INTEGER, (SubLObject)$ic171$), (SubLObject)ONE_INTEGER));
        $g1229$ = SubLFiles.defconstant("S#8531", (SubLObject)$ic172$);
        $g1230$ = SubLFiles.deflexical("S#8532", (NIL != Symbols.boundp((SubLObject)$ic202$)) ? $g1230$.getGlobalValue() : module0067.f4880((SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED));
        $g1231$ = SubLFiles.defparameter("S#8533", (SubLObject)NIL);
        $g1232$ = SubLFiles.deflexical("S#8534", (NIL != Symbols.boundp((SubLObject)$ic227$)) ? $g1232$.getGlobalValue() : Symbols.make_symbol((SubLObject)$ic228$));
        $g1233$ = SubLFiles.deflexical("S#8535", (NIL != Symbols.boundp((SubLObject)$ic229$)) ? $g1233$.getGlobalValue() : Symbols.make_symbol((SubLObject)$ic230$));
        $g1235$ = SubLFiles.defparameter("S#8536", (SubLObject)NIL);
        $g1236$ = SubLFiles.defconstant("S#8537", (SubLObject)TWELVE_INTEGER);
        $g1237$ = SubLFiles.defconstant("S#8538", (SubLObject)$ic324$);
        $g1238$ = SubLFiles.defconstant("S#8539", (SubLObject)TWELVE_INTEGER);
        $g1239$ = SubLFiles.defconstant("S#8540", (SubLObject)$ic347$);
        $g1240$ = SubLFiles.defconstant("S#8541", (SubLObject)THIRTEEN_INTEGER);
        $g1241$ = SubLFiles.defconstant("S#8542", (SubLObject)SIXTEEN_INTEGER);
        $g1242$ = SubLFiles.defconstant("S#8543", (SubLObject)$ic354$);
        $g1243$ = SubLFiles.deflexical("S#8544", Numbers.expt((SubLObject)TWO_INTEGER, (SubLObject)SIXTEEN_INTEGER));
        $g1244$ = SubLFiles.deflexical("S#8545", Numbers.integerDivide($g1243$.getGlobalValue(), $g1238$.getGlobalValue()));
        $g1234$ = SubLFiles.defconstant("S#8546", (SubLObject)TWELVE_INTEGER);
        $g1245$ = SubLFiles.defconstant("S#8547", (SubLObject)ZERO_INTEGER);
        $g1246$ = SubLFiles.deflexical("S#8548", (NIL != Symbols.boundp((SubLObject)$ic367$)) ? $g1246$.getGlobalValue() : Hashtables.make_hash_table((SubLObject)TEN_INTEGER, Symbols.symbol_function((SubLObject)EQUAL), (SubLObject)UNPROVIDED));
        $g1247$ = SubLFiles.defparameter("S#8549", (SubLObject)$ic385$);
        $g1248$ = SubLFiles.defconstant("S#8550", (SubLObject)$ic389$);
        $g1249$ = SubLFiles.deflexical("S#8551", Numbers.multiply((SubLObject)FOUR_INTEGER, (SubLObject)$ic411$, (SubLObject)$ic411$));
        $g1250$ = SubLFiles.deflexical("S#8552", Numbers.multiply((SubLObject)FOUR_INTEGER, (SubLObject)$ic411$));
        $g1251$ = SubLFiles.defparameter("S#8553", (SubLObject)SIXTEEN_INTEGER);
        $g1252$ = SubLFiles.defconstant("S#8554", (SubLObject)$ic428$);
        $g1253$ = SubLFiles.defconstant("S#8555", (SubLObject)MINUS_ONE_INTEGER);
        $g1254$ = SubLFiles.defconstant("S#8556", Numbers.expt((SubLObject)TWO_INTEGER, (SubLObject)$ic411$));
        $g1255$ = SubLFiles.defparameter("S#8557", (SubLObject)SIXTEEN_INTEGER);
        $g1256$ = SubLFiles.defparameter("S#8558", (SubLObject)NIL);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f6825() {
        Structures.register_method(print_high.$print_object_method_table$.getGlobalValue(), $g1210$.getGlobalValue(), Symbols.symbol_function((SubLObject)$ic7$));
        SubLSpecialOperatorDeclarations.proclaim((SubLObject)$ic8$);
        Structures.def_csetf((SubLObject)$ic9$, (SubLObject)$ic10$);
        Structures.def_csetf((SubLObject)$ic11$, (SubLObject)$ic12$);
        Structures.def_csetf((SubLObject)$ic13$, (SubLObject)$ic14$);
        Structures.def_csetf((SubLObject)$ic15$, (SubLObject)$ic16$);
        Structures.def_csetf((SubLObject)$ic17$, (SubLObject)$ic18$);
        Structures.def_csetf((SubLObject)$ic19$, (SubLObject)$ic20$);
        Structures.def_csetf((SubLObject)$ic21$, (SubLObject)$ic22$);
        Structures.def_csetf((SubLObject)$ic23$, (SubLObject)$ic24$);
        Structures.def_csetf((SubLObject)$ic25$, (SubLObject)$ic26$);
        Structures.def_csetf((SubLObject)$ic27$, (SubLObject)$ic28$);
        Structures.def_csetf((SubLObject)$ic29$, (SubLObject)$ic30$);
        Structures.def_csetf((SubLObject)$ic31$, (SubLObject)$ic32$);
        Structures.def_csetf((SubLObject)$ic33$, (SubLObject)$ic34$);
        Equality.identity((SubLObject)$ic0$);
        Structures.register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), $g1210$.getGlobalValue(), Symbols.symbol_function((SubLObject)$ic53$));
        Structures.register_method(print_high.$print_object_method_table$.getGlobalValue(), $g1211$.getGlobalValue(), Symbols.symbol_function((SubLObject)$ic67$));
        SubLSpecialOperatorDeclarations.proclaim((SubLObject)$ic68$);
        Structures.def_csetf((SubLObject)$ic69$, (SubLObject)$ic70$);
        Structures.def_csetf((SubLObject)$ic71$, (SubLObject)$ic72$);
        Structures.def_csetf((SubLObject)$ic73$, (SubLObject)$ic74$);
        Structures.def_csetf((SubLObject)$ic75$, (SubLObject)$ic76$);
        Structures.def_csetf((SubLObject)$ic77$, (SubLObject)$ic78$);
        Structures.def_csetf((SubLObject)$ic79$, (SubLObject)$ic80$);
        Structures.def_csetf((SubLObject)$ic81$, (SubLObject)$ic82$);
        Structures.def_csetf((SubLObject)$ic83$, (SubLObject)$ic84$);
        Structures.def_csetf((SubLObject)$ic85$, (SubLObject)$ic86$);
        Structures.def_csetf((SubLObject)$ic87$, (SubLObject)$ic88$);
        Structures.def_csetf((SubLObject)$ic89$, (SubLObject)$ic90$);
        Structures.def_csetf((SubLObject)$ic91$, (SubLObject)$ic92$);
        Structures.def_csetf((SubLObject)$ic93$, (SubLObject)$ic94$);
        Equality.identity((SubLObject)$ic61$);
        Structures.register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), $g1211$.getGlobalValue(), Symbols.symbol_function((SubLObject)$ic109$));
        Structures.register_method(print_high.$print_object_method_table$.getGlobalValue(), $g1212$.getGlobalValue(), Symbols.symbol_function((SubLObject)$ic127$));
        SubLSpecialOperatorDeclarations.proclaim((SubLObject)$ic128$);
        Structures.def_csetf((SubLObject)$ic129$, (SubLObject)$ic130$);
        Structures.def_csetf((SubLObject)$ic131$, (SubLObject)$ic132$);
        Structures.def_csetf((SubLObject)$ic133$, (SubLObject)$ic134$);
        Structures.def_csetf((SubLObject)$ic135$, (SubLObject)$ic136$);
        Structures.def_csetf((SubLObject)$ic137$, (SubLObject)$ic138$);
        Structures.def_csetf((SubLObject)$ic139$, (SubLObject)$ic140$);
        Equality.identity((SubLObject)$ic121$);
        Structures.register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), $g1212$.getGlobalValue(), Symbols.symbol_function((SubLObject)$ic147$));
        Structures.register_method(print_high.$print_object_method_table$.getGlobalValue(), $g1213$.getGlobalValue(), Symbols.symbol_function((SubLObject)$ic154$));
        SubLSpecialOperatorDeclarations.proclaim((SubLObject)$ic155$);
        Structures.def_csetf((SubLObject)$ic156$, (SubLObject)$ic157$);
        Structures.def_csetf((SubLObject)$ic158$, (SubLObject)$ic159$);
        Equality.identity((SubLObject)$ic148$);
        Structures.register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), $g1213$.getGlobalValue(), Symbols.symbol_function((SubLObject)$ic163$));
        Structures.register_method(print_high.$print_object_method_table$.getGlobalValue(), $g1229$.getGlobalValue(), Symbols.symbol_function((SubLObject)$ic179$));
        SubLSpecialOperatorDeclarations.proclaim((SubLObject)$ic180$);
        Structures.def_csetf((SubLObject)$ic181$, (SubLObject)$ic182$);
        Structures.def_csetf((SubLObject)$ic183$, (SubLObject)$ic184$);
        Structures.def_csetf((SubLObject)$ic185$, (SubLObject)$ic186$);
        Structures.def_csetf((SubLObject)$ic187$, (SubLObject)$ic188$);
        Structures.def_csetf((SubLObject)$ic189$, (SubLObject)$ic190$);
        Structures.def_csetf((SubLObject)$ic191$, (SubLObject)$ic192$);
        Equality.identity((SubLObject)$ic172$);
        Structures.register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), $g1229$.getGlobalValue(), Symbols.symbol_function((SubLObject)$ic194$));
        module0003.f57((SubLObject)$ic202$);
        f6597((SubLObject)$ic164$, (SubLObject)$ic208$);
        f6597((SubLObject)$ic209$, (SubLObject)$ic210$);
        f6597((SubLObject)$ic211$, (SubLObject)$ic212$);
        module0003.f57((SubLObject)$ic227$);
        module0003.f57((SubLObject)$ic229$);
        Structures.register_method(print_high.$print_object_method_table$.getGlobalValue(), $g1237$.getGlobalValue(), Symbols.symbol_function((SubLObject)$ic331$));
        SubLSpecialOperatorDeclarations.proclaim((SubLObject)$ic332$);
        Structures.def_csetf((SubLObject)$ic333$, (SubLObject)$ic334$);
        Structures.def_csetf((SubLObject)$ic335$, (SubLObject)$ic336$);
        Equality.identity((SubLObject)$ic324$);
        Structures.register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), $g1237$.getGlobalValue(), Symbols.symbol_function((SubLObject)$ic339$));
        module0003.f57((SubLObject)$ic367$);
        Structures.register_method(print_high.$print_object_method_table$.getGlobalValue(), $g1248$.getGlobalValue(), Symbols.symbol_function((SubLObject)$ic395$));
        SubLSpecialOperatorDeclarations.proclaim((SubLObject)$ic396$);
        Structures.def_csetf((SubLObject)$ic397$, (SubLObject)$ic398$);
        Structures.def_csetf((SubLObject)$ic399$, (SubLObject)$ic400$);
        Structures.def_csetf((SubLObject)$ic401$, (SubLObject)$ic402$);
        Structures.def_csetf((SubLObject)$ic403$, (SubLObject)$ic404$);
        Equality.identity((SubLObject)$ic389$);
        Structures.register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), $g1248$.getGlobalValue(), Symbols.symbol_function((SubLObject)$ic410$));
        Structures.register_method(print_high.$print_object_method_table$.getGlobalValue(), $g1252$.getGlobalValue(), Symbols.symbol_function((SubLObject)$ic434$));
        SubLSpecialOperatorDeclarations.proclaim((SubLObject)$ic435$);
        Structures.def_csetf((SubLObject)$ic436$, (SubLObject)$ic437$);
        Structures.def_csetf((SubLObject)$ic438$, (SubLObject)$ic439$);
        Structures.def_csetf((SubLObject)$ic440$, (SubLObject)$ic441$);
        Equality.identity((SubLObject)$ic428$);
        Structures.register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), $g1252$.getGlobalValue(), Symbols.symbol_function((SubLObject)$ic445$));
        module0027.f1449((SubLObject)$ic485$, (SubLObject)ConsesLow.list(new SubLObject[] { $ic486$, EQ, $ic487$, NIL, $ic488$, NIL, $ic489$, $ic490$, $ic491$, T }), (SubLObject)$ic492$);
        module0027.f1449((SubLObject)$ic515$, (SubLObject)ConsesLow.list(new SubLObject[] { $ic486$, EQ, $ic487$, NIL, $ic488$, NIL, $ic489$, $ic490$, $ic491$, T }), (SubLObject)$ic516$);
        module0027.f1449((SubLObject)$ic529$, (SubLObject)ConsesLow.list(new SubLObject[] { $ic486$, NIL, $ic487$, NIL, $ic488$, NIL, $ic489$, $ic316$, $ic491$, T }), (SubLObject)$ic530$);
        return (SubLObject)NIL;
    }
    
    public void declareFunctions() {
        f6823();
    }
    
    public void initializeVariables() {
        f6824();
    }
    
    public void runTopLevelForms() {
        f6825();
    }
    
    static {
        me = (SubLFile)new module0093();
        $g1210$ = null;
        $g1211$ = null;
        $g1212$ = null;
        $g1213$ = null;
        $g1214$ = null;
        $g1215$ = null;
        $g1216$ = null;
        $g1217$ = null;
        $g1218$ = null;
        $g1219$ = null;
        $g1220$ = null;
        $g1221$ = null;
        $g1222$ = null;
        $g1223$ = null;
        $g1224$ = null;
        $g1225$ = null;
        $g1226$ = null;
        $g1227$ = null;
        $g1228$ = null;
        $g1229$ = null;
        $g1230$ = null;
        $g1231$ = null;
        $g1232$ = null;
        $g1233$ = null;
        $g1235$ = null;
        $g1236$ = null;
        $g1237$ = null;
        $g1238$ = null;
        $g1239$ = null;
        $g1240$ = null;
        $g1241$ = null;
        $g1242$ = null;
        $g1243$ = null;
        $g1244$ = null;
        $g1234$ = null;
        $g1245$ = null;
        $g1246$ = null;
        $g1247$ = null;
        $g1248$ = null;
        $g1249$ = null;
        $g1250$ = null;
        $g1251$ = null;
        $g1252$ = null;
        $g1253$ = null;
        $g1254$ = null;
        $g1255$ = null;
        $g1256$ = null;
        $ic0$ = makeSymbol("S#8138", "CYC");
        $ic1$ = makeSymbol("S#8139", "CYC");
        $ic2$ = ConsesLow.list(new SubLObject[] { makeSymbol("STREAM"), makeSymbol("S#8559", "CYC"), makeSymbol("S#672", "CYC"), makeSymbol("S#8560", "CYC"), makeSymbol("S#8561", "CYC"), makeSymbol("S#8562", "CYC"), makeSymbol("S#8563", "CYC"), makeSymbol("S#8564", "CYC"), makeSymbol("S#8565", "CYC"), makeSymbol("S#8566", "CYC"), makeSymbol("S#8567", "CYC"), makeSymbol("S#8568", "CYC"), makeSymbol("S#8569", "CYC") });
        $ic3$ = ConsesLow.list(new SubLObject[] { makeKeyword("STREAM"), makeKeyword("HEADER"), makeKeyword("LOCK"), makeKeyword("ENCODING-INPUT-FN"), makeKeyword("ENCODING-OUTPUT-FN"), makeKeyword("ENCODING-SIZE-FN"), makeKeyword("ENCODING-KEY-INPUT-FN"), makeKeyword("ENCODING-KEY-OUTPUT-FN"), makeKeyword("TESTFN"), makeKeyword("HASH-FN"), makeKeyword("INPUT-CACHE"), makeKeyword("OUTPUT-CACHE"), makeKeyword("PROPERTY-LIST") });
        $ic4$ = ConsesLow.list(new SubLObject[] { makeSymbol("S#8155", "CYC"), makeSymbol("S#8156", "CYC"), makeSymbol("S#8157", "CYC"), makeSymbol("S#8158", "CYC"), makeSymbol("S#8159", "CYC"), makeSymbol("S#8160", "CYC"), makeSymbol("S#8161", "CYC"), makeSymbol("S#8162", "CYC"), makeSymbol("S#8163", "CYC"), makeSymbol("S#8164", "CYC"), makeSymbol("S#8165", "CYC"), makeSymbol("S#8166", "CYC"), makeSymbol("S#8167", "CYC") });
        $ic5$ = ConsesLow.list(new SubLObject[] { makeSymbol("S#8168", "CYC"), makeSymbol("S#8169", "CYC"), makeSymbol("S#8170", "CYC"), makeSymbol("S#8171", "CYC"), makeSymbol("S#8172", "CYC"), makeSymbol("S#8173", "CYC"), makeSymbol("S#8174", "CYC"), makeSymbol("S#8175", "CYC"), makeSymbol("S#8176", "CYC"), makeSymbol("S#8177", "CYC"), makeSymbol("S#8178", "CYC"), makeSymbol("S#8179", "CYC"), makeSymbol("S#8180", "CYC") });
        $ic6$ = makeSymbol("DEFAULT-STRUCT-PRINT-FUNCTION");
        $ic7$ = makeSymbol("S#8154", "CYC");
        $ic8$ = ConsesLow.list((SubLObject)makeSymbol("OPTIMIZE-FUNCALL"), (SubLObject)makeSymbol("S#8139", "CYC"));
        $ic9$ = makeSymbol("S#8155", "CYC");
        $ic10$ = makeSymbol("S#8168", "CYC");
        $ic11$ = makeSymbol("S#8156", "CYC");
        $ic12$ = makeSymbol("S#8169", "CYC");
        $ic13$ = makeSymbol("S#8157", "CYC");
        $ic14$ = makeSymbol("S#8170", "CYC");
        $ic15$ = makeSymbol("S#8158", "CYC");
        $ic16$ = makeSymbol("S#8171", "CYC");
        $ic17$ = makeSymbol("S#8159", "CYC");
        $ic18$ = makeSymbol("S#8172", "CYC");
        $ic19$ = makeSymbol("S#8160", "CYC");
        $ic20$ = makeSymbol("S#8173", "CYC");
        $ic21$ = makeSymbol("S#8161", "CYC");
        $ic22$ = makeSymbol("S#8174", "CYC");
        $ic23$ = makeSymbol("S#8162", "CYC");
        $ic24$ = makeSymbol("S#8175", "CYC");
        $ic25$ = makeSymbol("S#8163", "CYC");
        $ic26$ = makeSymbol("S#8176", "CYC");
        $ic27$ = makeSymbol("S#8164", "CYC");
        $ic28$ = makeSymbol("S#8177", "CYC");
        $ic29$ = makeSymbol("S#8165", "CYC");
        $ic30$ = makeSymbol("S#8178", "CYC");
        $ic31$ = makeSymbol("S#8166", "CYC");
        $ic32$ = makeSymbol("S#8179", "CYC");
        $ic33$ = makeSymbol("S#8167", "CYC");
        $ic34$ = makeSymbol("S#8180", "CYC");
        $ic35$ = makeKeyword("STREAM");
        $ic36$ = makeKeyword("HEADER");
        $ic37$ = makeKeyword("LOCK");
        $ic38$ = makeKeyword("ENCODING-INPUT-FN");
        $ic39$ = makeKeyword("ENCODING-OUTPUT-FN");
        $ic40$ = makeKeyword("ENCODING-SIZE-FN");
        $ic41$ = makeKeyword("ENCODING-KEY-INPUT-FN");
        $ic42$ = makeKeyword("ENCODING-KEY-OUTPUT-FN");
        $ic43$ = makeKeyword("TESTFN");
        $ic44$ = makeKeyword("HASH-FN");
        $ic45$ = makeKeyword("INPUT-CACHE");
        $ic46$ = makeKeyword("OUTPUT-CACHE");
        $ic47$ = makeKeyword("PROPERTY-LIST");
        $ic48$ = makeString("Invalid slot ~S for construction function");
        $ic49$ = makeKeyword("BEGIN");
        $ic50$ = makeSymbol("S#8181", "CYC");
        $ic51$ = makeKeyword("SLOT");
        $ic52$ = makeKeyword("END");
        $ic53$ = makeSymbol("S#8183", "CYC");
        $ic54$ = makeString("#<FHT: Stream: ~A Lock: ~A ~%");
        $ic55$ = makeString(" Test: ~A~%");
        $ic56$ = makeString(" Encoding: Input ~A Output ~A Sizing ~A~%");
        $ic57$ = makeString(" Key Encoding: Input ~A Output ~A~%");
        $ic58$ = makeString(" Hashing: ~A~%");
        $ic59$ = makeString(" Caches: Input ~A Output ~A >~%");
        $ic60$ = makeString(" Properties: ~A~%");
        $ic61$ = makeSymbol("S#8140", "CYC");
        $ic62$ = makeSymbol("S#8141", "CYC");
        $ic63$ = ConsesLow.list(new SubLObject[] { makeSymbol("S#1534", "CYC"), makeSymbol("S#8570", "CYC"), makeSymbol("S#8571", "CYC"), makeSymbol("S#8572", "CYC"), makeSymbol("S#8573", "CYC"), makeSymbol("S#8574", "CYC"), makeSymbol("S#6910", "CYC"), makeSymbol("S#2959", "CYC"), makeSymbol("S#8575", "CYC"), makeSymbol("S#8576", "CYC"), makeSymbol("S#8577", "CYC"), makeSymbol("S#8578", "CYC"), makeSymbol("S#8579", "CYC") });
        $ic64$ = ConsesLow.list(new SubLObject[] { makeKeyword("SIZE"), makeKeyword("VERSION-MAJOR"), makeKeyword("VERSION-MINOR"), makeKeyword("OBJECT-SPACE-OFFSET"), makeKeyword("KEY-SPACE-OFFSET"), makeKeyword("CURRENT-HEAP-TOP"), makeKeyword("ITEM-COUNT"), makeKeyword("CAPACITY"), makeKeyword("FREE-LIST-HEAD"), makeKeyword("DELETION-COUNT"), makeKeyword("HEADER-CRC"), makeKeyword("EXTENSION-SPACE-SIZE"), makeKeyword("EXTENSION-SPACE") });
        $ic65$ = ConsesLow.list(new SubLObject[] { makeSymbol("S#8194", "CYC"), makeSymbol("S#8195", "CYC"), makeSymbol("S#8196", "CYC"), makeSymbol("S#8197", "CYC"), makeSymbol("S#8198", "CYC"), makeSymbol("S#8199", "CYC"), makeSymbol("S#8200", "CYC"), makeSymbol("S#8201", "CYC"), makeSymbol("S#8202", "CYC"), makeSymbol("S#8203", "CYC"), makeSymbol("S#8204", "CYC"), makeSymbol("S#8205", "CYC"), makeSymbol("S#8206", "CYC") });
        $ic66$ = ConsesLow.list(new SubLObject[] { makeSymbol("S#8207", "CYC"), makeSymbol("S#8208", "CYC"), makeSymbol("S#8209", "CYC"), makeSymbol("S#8210", "CYC"), makeSymbol("S#8211", "CYC"), makeSymbol("S#8212", "CYC"), makeSymbol("S#8213", "CYC"), makeSymbol("S#8214", "CYC"), makeSymbol("S#8215", "CYC"), makeSymbol("S#8216", "CYC"), makeSymbol("S#8217", "CYC"), makeSymbol("S#8218", "CYC"), makeSymbol("S#8219", "CYC") });
        $ic67$ = makeSymbol("S#8193", "CYC");
        $ic68$ = ConsesLow.list((SubLObject)makeSymbol("OPTIMIZE-FUNCALL"), (SubLObject)makeSymbol("S#8141", "CYC"));
        $ic69$ = makeSymbol("S#8194", "CYC");
        $ic70$ = makeSymbol("S#8207", "CYC");
        $ic71$ = makeSymbol("S#8195", "CYC");
        $ic72$ = makeSymbol("S#8208", "CYC");
        $ic73$ = makeSymbol("S#8196", "CYC");
        $ic74$ = makeSymbol("S#8209", "CYC");
        $ic75$ = makeSymbol("S#8197", "CYC");
        $ic76$ = makeSymbol("S#8210", "CYC");
        $ic77$ = makeSymbol("S#8198", "CYC");
        $ic78$ = makeSymbol("S#8211", "CYC");
        $ic79$ = makeSymbol("S#8199", "CYC");
        $ic80$ = makeSymbol("S#8212", "CYC");
        $ic81$ = makeSymbol("S#8200", "CYC");
        $ic82$ = makeSymbol("S#8213", "CYC");
        $ic83$ = makeSymbol("S#8201", "CYC");
        $ic84$ = makeSymbol("S#8214", "CYC");
        $ic85$ = makeSymbol("S#8202", "CYC");
        $ic86$ = makeSymbol("S#8215", "CYC");
        $ic87$ = makeSymbol("S#8203", "CYC");
        $ic88$ = makeSymbol("S#8216", "CYC");
        $ic89$ = makeSymbol("S#8204", "CYC");
        $ic90$ = makeSymbol("S#8217", "CYC");
        $ic91$ = makeSymbol("S#8205", "CYC");
        $ic92$ = makeSymbol("S#8218", "CYC");
        $ic93$ = makeSymbol("S#8206", "CYC");
        $ic94$ = makeSymbol("S#8219", "CYC");
        $ic95$ = makeKeyword("SIZE");
        $ic96$ = makeKeyword("VERSION-MAJOR");
        $ic97$ = makeKeyword("VERSION-MINOR");
        $ic98$ = makeKeyword("OBJECT-SPACE-OFFSET");
        $ic99$ = makeKeyword("KEY-SPACE-OFFSET");
        $ic100$ = makeKeyword("CURRENT-HEAP-TOP");
        $ic101$ = makeKeyword("ITEM-COUNT");
        $ic102$ = makeKeyword("CAPACITY");
        $ic103$ = makeKeyword("FREE-LIST-HEAD");
        $ic104$ = makeKeyword("DELETION-COUNT");
        $ic105$ = makeKeyword("HEADER-CRC");
        $ic106$ = makeKeyword("EXTENSION-SPACE-SIZE");
        $ic107$ = makeKeyword("EXTENSION-SPACE");
        $ic108$ = makeSymbol("S#8220", "CYC");
        $ic109$ = makeSymbol("S#8222", "CYC");
        $ic110$ = makeString("#<HTFile-Header: Size=~A Format-Version ~A.~A~%");
        $ic111$ = makeString(" ObjSpace Offset: 0x~X (~D)  KeySpace Offset: 0x~X (~D) HeapTop: 0x~X (~D)~%");
        $ic112$ = makeString(" Item Count: ~A  Capacity: ~A~%");
        $ic113$ = makeString(" FreeListHead: ~A ");
        $ic114$ = makeString(" no free-list ");
        $ic115$ = makeString(" Deletions: ~A ");
        $ic116$ = makeString(" no deletions ");
        $ic117$ = makeString(" CRC: ~A ");
        $ic118$ = makeString(" no CRC support ");
        $ic119$ = makeString(" Extension Space: (~A) |~A| ~%");
        $ic120$ = makeString("> ");
        $ic121$ = makeSymbol("S#8142", "CYC");
        $ic122$ = makeSymbol("S#8143", "CYC");
        $ic123$ = ConsesLow.list((SubLObject)makeSymbol("S#1534", "CYC"), (SubLObject)makeSymbol("TYPE"), (SubLObject)makeSymbol("S#8580", "CYC"), (SubLObject)makeSymbol("S#131", "CYC"), (SubLObject)makeSymbol("S#8581", "CYC"), (SubLObject)makeSymbol("S#1625", "CYC"));
        $ic124$ = ConsesLow.list((SubLObject)makeKeyword("SIZE"), (SubLObject)makeKeyword("TYPE"), (SubLObject)makeKeyword("KEY-SIZE"), (SubLObject)makeKeyword("KEY"), (SubLObject)makeKeyword("DATA-SIZE"), (SubLObject)makeKeyword("DATA"));
        $ic125$ = ConsesLow.list((SubLObject)makeSymbol("S#8225", "CYC"), (SubLObject)makeSymbol("S#8226", "CYC"), (SubLObject)makeSymbol("S#8227", "CYC"), (SubLObject)makeSymbol("S#8228", "CYC"), (SubLObject)makeSymbol("S#8229", "CYC"), (SubLObject)makeSymbol("S#8230", "CYC"));
        $ic126$ = ConsesLow.list((SubLObject)makeSymbol("S#8231", "CYC"), (SubLObject)makeSymbol("S#8232", "CYC"), (SubLObject)makeSymbol("S#8233", "CYC"), (SubLObject)makeSymbol("S#8234", "CYC"), (SubLObject)makeSymbol("S#8235", "CYC"), (SubLObject)makeSymbol("S#8236", "CYC"));
        $ic127$ = makeSymbol("S#8224", "CYC");
        $ic128$ = ConsesLow.list((SubLObject)makeSymbol("OPTIMIZE-FUNCALL"), (SubLObject)makeSymbol("S#8143", "CYC"));
        $ic129$ = makeSymbol("S#8225", "CYC");
        $ic130$ = makeSymbol("S#8231", "CYC");
        $ic131$ = makeSymbol("S#8226", "CYC");
        $ic132$ = makeSymbol("S#8232", "CYC");
        $ic133$ = makeSymbol("S#8227", "CYC");
        $ic134$ = makeSymbol("S#8233", "CYC");
        $ic135$ = makeSymbol("S#8228", "CYC");
        $ic136$ = makeSymbol("S#8234", "CYC");
        $ic137$ = makeSymbol("S#8229", "CYC");
        $ic138$ = makeSymbol("S#8235", "CYC");
        $ic139$ = makeSymbol("S#8230", "CYC");
        $ic140$ = makeSymbol("S#8236", "CYC");
        $ic141$ = makeKeyword("TYPE");
        $ic142$ = makeKeyword("KEY-SIZE");
        $ic143$ = makeKeyword("KEY");
        $ic144$ = makeKeyword("DATA-SIZE");
        $ic145$ = makeKeyword("DATA");
        $ic146$ = makeSymbol("S#8237", "CYC");
        $ic147$ = makeSymbol("S#8239", "CYC");
        $ic148$ = makeSymbol("S#8144", "CYC");
        $ic149$ = makeSymbol("S#8145", "CYC");
        $ic150$ = ConsesLow.list((SubLObject)makeSymbol("S#8582", "CYC"), (SubLObject)makeSymbol("S#8583", "CYC"));
        $ic151$ = ConsesLow.list((SubLObject)makeKeyword("KEY-OFFSET"), (SubLObject)makeKeyword("HASH-CODE"));
        $ic152$ = ConsesLow.list((SubLObject)makeSymbol("S#8241", "CYC"), (SubLObject)makeSymbol("S#8242", "CYC"));
        $ic153$ = ConsesLow.list((SubLObject)makeSymbol("S#8243", "CYC"), (SubLObject)makeSymbol("S#8244", "CYC"));
        $ic154$ = makeSymbol("S#8240", "CYC");
        $ic155$ = ConsesLow.list((SubLObject)makeSymbol("OPTIMIZE-FUNCALL"), (SubLObject)makeSymbol("S#8145", "CYC"));
        $ic156$ = makeSymbol("S#8241", "CYC");
        $ic157$ = makeSymbol("S#8243", "CYC");
        $ic158$ = makeSymbol("S#8242", "CYC");
        $ic159$ = makeSymbol("S#8244", "CYC");
        $ic160$ = makeKeyword("KEY-OFFSET");
        $ic161$ = makeKeyword("HASH-CODE");
        $ic162$ = makeSymbol("S#8245", "CYC");
        $ic163$ = makeSymbol("S#8247", "CYC");
        $ic164$ = makeKeyword("IMAGE-DEPENDENT-CFASL");
        $ic165$ = makeInteger(2000);
        $ic166$ = makeInteger(84);
        $ic167$ = makeInteger(256);
        $ic168$ = makeSymbol("SXHASH");
        $ic169$ = makeString("File Hash Table Lock");
        $ic170$ = makeString("Sorry, ~A hashed to ~A, which is not a valid hash code.");
        $ic171$ = makeInteger(32);
        $ic172$ = makeSymbol("S#8146", "CYC");
        $ic173$ = makeSymbol("S#8147", "CYC");
        $ic174$ = ConsesLow.list((SubLObject)makeSymbol("S#8560", "CYC"), (SubLObject)makeSymbol("S#8561", "CYC"), (SubLObject)makeSymbol("S#8562", "CYC"), (SubLObject)makeSymbol("S#8566", "CYC"), (SubLObject)makeSymbol("S#8563", "CYC"), (SubLObject)makeSymbol("S#8564", "CYC"));
        $ic175$ = ConsesLow.list((SubLObject)makeKeyword("ENCODING-INPUT-FN"), (SubLObject)makeKeyword("ENCODING-OUTPUT-FN"), (SubLObject)makeKeyword("ENCODING-SIZE-FN"), (SubLObject)makeKeyword("HASH-FN"), (SubLObject)makeKeyword("ENCODING-KEY-INPUT-FN"), (SubLObject)makeKeyword("ENCODING-KEY-OUTPUT-FN"));
        $ic176$ = ConsesLow.list((SubLObject)makeSymbol("S#8267", "CYC"), (SubLObject)makeSymbol("S#8268", "CYC"), (SubLObject)makeSymbol("S#8269", "CYC"), (SubLObject)makeSymbol("S#8270", "CYC"), (SubLObject)makeSymbol("S#8271", "CYC"), (SubLObject)makeSymbol("S#8272", "CYC"));
        $ic177$ = ConsesLow.list((SubLObject)makeSymbol("S#8273", "CYC"), (SubLObject)makeSymbol("S#8274", "CYC"), (SubLObject)makeSymbol("S#8275", "CYC"), (SubLObject)makeSymbol("S#8276", "CYC"), (SubLObject)makeSymbol("S#8277", "CYC"), (SubLObject)makeSymbol("S#8278", "CYC"));
        $ic178$ = makeSymbol("S#8282", "CYC");
        $ic179$ = makeSymbol("S#8266", "CYC");
        $ic180$ = ConsesLow.list((SubLObject)makeSymbol("OPTIMIZE-FUNCALL"), (SubLObject)makeSymbol("S#8147", "CYC"));
        $ic181$ = makeSymbol("S#8267", "CYC");
        $ic182$ = makeSymbol("S#8273", "CYC");
        $ic183$ = makeSymbol("S#8268", "CYC");
        $ic184$ = makeSymbol("S#8274", "CYC");
        $ic185$ = makeSymbol("S#8269", "CYC");
        $ic186$ = makeSymbol("S#8275", "CYC");
        $ic187$ = makeSymbol("S#8270", "CYC");
        $ic188$ = makeSymbol("S#8276", "CYC");
        $ic189$ = makeSymbol("S#8271", "CYC");
        $ic190$ = makeSymbol("S#8277", "CYC");
        $ic191$ = makeSymbol("S#8272", "CYC");
        $ic192$ = makeSymbol("S#8278", "CYC");
        $ic193$ = makeSymbol("S#8279", "CYC");
        $ic194$ = makeSymbol("S#8281", "CYC");
        $ic195$ = makeString("#<FHT-Serialization: Input Fn:    ~S~%");
        $ic196$ = makeString("                     Output Fn:   ~S~%");
        $ic197$ = makeString("                     Size Fn:     ~S~%");
        $ic198$ = makeString("                     Hash Fn:     ~S~%");
        $ic199$ = makeString("                     Key Input    ~S~%");
        $ic200$ = makeString("                     Key Output    ~S~%");
        $ic201$ = makeString(">");
        $ic202$ = makeSymbol("S#8532", "CYC");
        $ic203$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#8584", "CYC"), (SubLObject)makeSymbol("S#8585", "CYC"), (SubLObject)makeSymbol("&KEY"), (SubLObject)makeSymbol("S#127", "CYC")), (SubLObject)makeSymbol("&BODY"), (SubLObject)makeSymbol("S#5", "CYC"));
        $ic204$ = ConsesLow.list((SubLObject)makeKeyword("DONE"));
        $ic205$ = makeKeyword("ALLOW-OTHER-KEYS");
        $ic206$ = makeKeyword("DONE");
        $ic207$ = makeSymbol("DO-DICTIONARY");
        $ic208$ = ConsesLow.list((SubLObject)makeKeyword("ENCODING-INPUT-FN"), (SubLObject)makeSymbol("S#2100", "CYC"), (SubLObject)makeKeyword("ENCODING-OUTPUT-FN"), (SubLObject)makeSymbol("S#2094", "CYC"), (SubLObject)makeKeyword("ENCODING-SIZE-FN"), (SubLObject)makeSymbol("S#2091", "CYC"), (SubLObject)makeKeyword("HASH-FN"), (SubLObject)makeSymbol("SXHASH"));
        $ic209$ = makeKeyword("IMAGE-INDEPENDENT-CFASL");
        $ic210$ = ConsesLow.list((SubLObject)makeKeyword("ENCODING-INPUT-FN"), (SubLObject)makeSymbol("S#2100", "CYC"), (SubLObject)makeKeyword("ENCODING-OUTPUT-FN"), (SubLObject)makeSymbol("S#2095", "CYC"), (SubLObject)makeKeyword("ENCODING-SIZE-FN"), (SubLObject)makeSymbol("S#2092", "CYC"), (SubLObject)makeKeyword("HASH-FN"), (SubLObject)makeSymbol("S#2281", "CYC"));
        $ic211$ = makeKeyword("HL-EXTERNALIZED-KEYS");
        $ic212$ = ConsesLow.list(new SubLObject[] { makeKeyword("ENCODING-INPUT-FN"), makeSymbol("S#2100", "CYC"), makeKeyword("ENCODING-OUTPUT-FN"), makeSymbol("S#2095", "CYC"), makeKeyword("ENCODING-SIZE-FN"), makeSymbol("S#2092", "CYC"), makeKeyword("HASH-FN"), makeSymbol("S#2281", "CYC"), makeKeyword("ENCODING-KEY-INPUT-FN"), makeSymbol("FIND-OBJECT-BY-HL-EXTERNAL-ID-STRING"), makeKeyword("ENCODING-KEY-OUTPUT-FN"), makeSymbol("HL-EXTERNAL-ID-STRING") });
        $ic213$ = ConsesLow.list((SubLObject)makeSymbol("S#159", "CYC"), (SubLObject)makeSymbol("&REST"), (SubLObject)makeSymbol("S#105", "CYC"));
        $ic214$ = makeSymbol("PUNLESS");
        $ic215$ = ConsesLow.list((SubLObject)makeSymbol("NULL"), (SubLObject)makeSymbol("S#8533", "CYC"));
        $ic216$ = makeSymbol("FORMAT");
        $ic217$ = makeSymbol("S#8533", "CYC");
        $ic218$ = makeKeyword("IO");
        $ic219$ = makeKeyword("DIRECTION");
        $ic220$ = makeKeyword("IF-EXISTS");
        $ic221$ = makeKeyword("OVERWRITE");
        $ic222$ = makeKeyword("IF-DOES-NOT-EXIST");
        $ic223$ = makeKeyword("ERROR");
        $ic224$ = makeKeyword("ELEMENT-TYPE");
        $ic225$ = makeKeyword("BINARY");
        $ic226$ = makeKeyword("INPUT");
        $ic227$ = makeSymbol("S#8534", "CYC");
        $ic228$ = makeString("FileHashTable Not Found");
        $ic229$ = makeSymbol("S#8535", "CYC");
        $ic230$ = makeString("Not In FHT");
        $ic231$ = makeString("GET-FILE-HASH-TABLE ~A has cache hit of ABSENT.~%");
        $ic232$ = makeString("GET-FILE-HASH-TABLE ~A has cache hit with good value.~%");
        $ic233$ = makeString("GET-FILE-HASH-TABLE ~A has to go to the FHT.~%");
        $ic234$ = makeKeyword("FOUND");
        $ic235$ = makeString("GET-FILE-HASH-TABLE ~A updated cache with hit.~%");
        $ic236$ = makeString("GET-FILE-HASH-TABLE ~A updated cache with ABSENT.~%");
        $ic237$ = makeString("The key ~S maps to the non-numeric value ~S in the file-hash-table ~A.");
        $ic238$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#131", "CYC"), (SubLObject)makeSymbol("S#704", "CYC"), (SubLObject)makeSymbol("S#8586", "CYC"), (SubLObject)makeSymbol("S#8587", "CYC"), (SubLObject)makeSymbol("&OPTIONAL"), (SubLObject)makeSymbol("S#8588", "CYC")), (SubLObject)makeSymbol("&BODY"), (SubLObject)makeSymbol("S#5", "CYC"));
        $ic239$ = makeUninternedSymbol("US#13C51E");
        $ic240$ = makeUninternedSymbol("US#2B2C9E3");
        $ic241$ = makeUninternedSymbol("US#1129AAD");
        $ic242$ = makeUninternedSymbol("US#11670C1");
        $ic243$ = makeUninternedSymbol("US#1AF7E7C");
        $ic244$ = makeSymbol("CLET");
        $ic245$ = ConsesLow.list((SubLObject)NIL);
        $ic246$ = makeSymbol("WHILE");
        $ic247$ = makeSymbol("CAND");
        $ic248$ = makeSymbol("CNOT");
        $ic249$ = makeSymbol("CMULTIPLE-VALUE-BIND");
        $ic250$ = makeSymbol("S#8342", "CYC");
        $ic251$ = makeSymbol("NULL");
        $ic252$ = makeSymbol("PROGN");
        $ic253$ = makeSymbol("CSETQ");
        $ic254$ = makeUninternedSymbol("US#13C51E");
        $ic255$ = makeUninternedSymbol("US#2B2C9E3");
        $ic256$ = makeUninternedSymbol("US#1129AAD");
        $ic257$ = makeUninternedSymbol("US#11670C1");
        $ic258$ = makeUninternedSymbol("US#1AF7E7C");
        $ic259$ = makeSymbol("S#8341", "CYC");
        $ic260$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#131", "CYC"), (SubLObject)makeSymbol("S#132", "CYC"), (SubLObject)makeSymbol("S#8586", "CYC"), (SubLObject)makeSymbol("&KEY"), (SubLObject)makeSymbol("S#295", "CYC"), (SubLObject)makeSymbol("S#127", "CYC")), (SubLObject)makeSymbol("&BODY"), (SubLObject)makeSymbol("S#5", "CYC"));
        $ic261$ = ConsesLow.list((SubLObject)makeKeyword("MESSAGE"), (SubLObject)makeKeyword("DONE"));
        $ic262$ = makeKeyword("MESSAGE");
        $ic263$ = makeUninternedSymbol("US#7C5C08F");
        $ic264$ = makeSymbol("S#638", "CYC");
        $ic265$ = ConsesLow.list((SubLObject)makeSymbol("CSETQ"), (SubLObject)makeSymbol("S#639", "CYC"), (SubLObject)ConsesLow.list((SubLObject)makeSymbol("GET-UNIVERSAL-TIME")));
        $ic266$ = makeSymbol("S#640", "CYC");
        $ic267$ = makeSymbol("S#8299", "CYC");
        $ic268$ = ConsesLow.list((SubLObject)makeSymbol("CSETQ"), (SubLObject)makeSymbol("S#641", "CYC"), (SubLObject)ZERO_INTEGER);
        $ic269$ = makeSymbol("NOTING-PERCENT-PROGRESS");
        $ic270$ = makeSymbol("S#8307", "CYC");
        $ic271$ = ConsesLow.list((SubLObject)makeSymbol("NOTE-PERCENT-PROGRESS"), (SubLObject)makeSymbol("S#641", "CYC"), (SubLObject)makeSymbol("S#640", "CYC"));
        $ic272$ = ConsesLow.list((SubLObject)makeSymbol("CINC"), (SubLObject)makeSymbol("S#641", "CYC"));
        $ic273$ = makeSymbol("S#8305", "CYC");
        $ic274$ = makeUninternedSymbol("US#7C5C08F");
        $ic275$ = makeSymbol("S#8306", "CYC");
        $ic276$ = makeString("~S -> ~S~%");
        $ic277$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#131", "CYC"), (SubLObject)makeSymbol("S#132", "CYC"), (SubLObject)makeSymbol("S#8586", "CYC"), (SubLObject)makeSymbol("&OPTIONAL"), (SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#295", "CYC"), (SubLObject)makeString("do-file-hash-table"))), (SubLObject)makeSymbol("&BODY"), (SubLObject)makeSymbol("S#5", "CYC"));
        $ic278$ = makeString("do-file-hash-table");
        $ic279$ = makeSymbol("S#8310", "CYC");
        $ic280$ = ConsesLow.list((SubLObject)makeSymbol("S#8307", "CYC"));
        $ic281$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#131", "CYC"), (SubLObject)makeSymbol("S#8586", "CYC"), (SubLObject)makeSymbol("S#8587", "CYC")), (SubLObject)makeSymbol("&BODY"), (SubLObject)makeSymbol("S#5", "CYC"));
        $ic282$ = makeSymbol("S#8311", "CYC");
        $ic283$ = ConsesLow.list((SubLObject)makeSymbol("S#8312", "CYC"));
        $ic284$ = makeSymbol("S#8312", "CYC");
        $ic285$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#131", "CYC"), (SubLObject)makeSymbol("S#8586", "CYC"), (SubLObject)makeSymbol("&KEY"), (SubLObject)makeSymbol("S#295", "CYC"), (SubLObject)makeSymbol("S#127", "CYC")), (SubLObject)makeSymbol("&BODY"), (SubLObject)makeSymbol("S#5", "CYC"));
        $ic286$ = makeUninternedSymbol("US#3725B9A");
        $ic287$ = makeUninternedSymbol("US#1069245");
        $ic288$ = ConsesLow.list((SubLObject)T);
        $ic289$ = makeSymbol("IGNORE");
        $ic290$ = makeUninternedSymbol("US#3725B9A");
        $ic291$ = makeUninternedSymbol("US#1069245");
        $ic292$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#131", "CYC"), (SubLObject)makeSymbol("S#8586", "CYC"), (SubLObject)makeSymbol("&OPTIONAL"), (SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#295", "CYC"), (SubLObject)makeString("do-file-hash-table-keys"))), (SubLObject)makeSymbol("&BODY"), (SubLObject)makeSymbol("S#5", "CYC"));
        $ic293$ = makeString("do-file-hash-table-keys");
        $ic294$ = makeSymbol("S#8314", "CYC");
        $ic295$ = makeSymbol("NON-NEGATIVE-INTEGER-P");
        $ic296$ = makeSymbol("<");
        $ic297$ = makeString("Invalid key entry ~A: Offset 0x~X (~A) HashCode ~A~%");
        $ic298$ = makeString("FHT for ~A corrupted; ~A != ~A+~A+ -- cannot recover in this fashion.~%");
        $ic299$ = makeString("Entry ~A: ~A bytes total, ~A bytes key size, ~A bytes object size (+ ~A bytes header).~%");
        $ic300$ = makeSymbol("S#8325", "CYC");
        $ic301$ = makeSymbol("S#8322", "CYC");
        $ic302$ = makeSymbol("S#8326", "CYC");
        $ic303$ = makeKeyword("START");
        $ic304$ = ConsesLow.list((SubLObject)makeSymbol("S#5232", "CYC"), (SubLObject)makeSymbol("S#8586", "CYC"), (SubLObject)makeSymbol("S#8588", "CYC"), (SubLObject)makeSymbol("S#8589", "CYC"));
        $ic305$ = makeKeyword("UNINITIALIZED");
        $ic306$ = makeString("converting file-hash-table to alist");
        $ic307$ = makeString("tmp/");
        $ic308$ = makeSymbol("HASH-TABLE-P");
        $ic309$ = makeString("");
        $ic310$ = makeString("/tmp/");
        $ic311$ = makeSymbol("LISTP");
        $ic312$ = makeSymbol("STRINGP");
        $ic313$ = makeKeyword("STORAGE-RESOURCING");
        $ic314$ = makeInteger(100);
        $ic315$ = makeKeyword("KEY-ONLY");
        $ic316$ = makeKeyword("FULL");
        $ic317$ = makeKeyword("NOT-FOUND");
        $ic318$ = makeKeyword("TABLE-FULL");
        $ic319$ = makeString("Cannot put into table; table is full and cannot grow.");
        $ic320$ = makeString("Implementation Error: Unexpected status ~A returned by FHT-LOOKUP-KEY. (KEY = ~A, INDEX = ~A.)");
        $ic321$ = makeSymbol("COR");
        $ic322$ = makeString("Can neither find key ~S nor prove its non-presence. Ensure that your encoding function and your test function work correctly together, i.e. (funcall testfn <OBJ> (cfasl-decoding (cfasl-encoding <OBJ))) -> T. If they are, then this is an implementation error. (INDEX = ~A, STATUS = ~A, KEY-ENTRY = ~A)");
        $ic323$ = makeString("Cannot get key ~S from table: Implementation error (INDEX = ~A, STATUS = ~A, KEY-ENTRY = ~A).");
        $ic324$ = makeSymbol("S#8148", "CYC");
        $ic325$ = makeSymbol("S#8149", "CYC");
        $ic326$ = ConsesLow.list((SubLObject)makeSymbol("S#1534", "CYC"), (SubLObject)makeSymbol("S#5217", "CYC"));
        $ic327$ = ConsesLow.list((SubLObject)makeKeyword("SIZE"), (SubLObject)makeKeyword("NEXT"));
        $ic328$ = ConsesLow.list((SubLObject)makeSymbol("S#8355", "CYC"), (SubLObject)makeSymbol("S#8356", "CYC"));
        $ic329$ = ConsesLow.list((SubLObject)makeSymbol("S#8357", "CYC"), (SubLObject)makeSymbol("S#8358", "CYC"));
        $ic330$ = makeSymbol("S#8363", "CYC");
        $ic331$ = makeSymbol("S#8354", "CYC");
        $ic332$ = ConsesLow.list((SubLObject)makeSymbol("OPTIMIZE-FUNCALL"), (SubLObject)makeSymbol("S#8149", "CYC"));
        $ic333$ = makeSymbol("S#8355", "CYC");
        $ic334$ = makeSymbol("S#8357", "CYC");
        $ic335$ = makeSymbol("S#8356", "CYC");
        $ic336$ = makeSymbol("S#8358", "CYC");
        $ic337$ = makeKeyword("NEXT");
        $ic338$ = makeSymbol("S#8359", "CYC");
        $ic339$ = makeSymbol("S#8361", "CYC");
        $ic340$ = makeString("#<FILE-BLOCK-ENTRY:~s:~s>");
        $ic341$ = makeString("Unable to position to file-pos ~D; true position is.");
        $ic342$ = makeString("Unable to position to file-pos ~A; true position is ~A.");
        $ic343$ = makeString("Invalid key index ~D into key space [0,~D).");
        $ic344$ = makeString("Invalid key offset ~A, points past key space start ~A.");
        $ic345$ = makeString("Index ~A has null hash-code.");
        $ic346$ = makeString("Index ~A has null key offset.");
        $ic347$ = makeInteger(10009);
        $ic348$ = makeString("~&FHT-LOOKUP ~A I=~A (H=~A)~%");
        $ic349$ = makeString("~&FHT-LOOKUP :empty-key iter=~A LastI=~A~%");
        $ic350$ = makeString("~&FHT-LOOKUP :found iter=~A LastI=~A~%");
        $ic351$ = makeString("~&FHT-LOOKUP :table-full iter=~A LastI=~A~%");
        $ic352$ = makeString("~&FHT-LOOKUP probe I=~A~%");
        $ic353$ = makeString("~&FHT-LOOKUP :error iter=~A LastI=~A~%");
        $ic354$ = makeInteger(66);
        $ic355$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#8586", "CYC"), (SubLObject)makeSymbol("S#8590", "CYC"), (SubLObject)makeSymbol("S#8591", "CYC")), (SubLObject)makeSymbol("&BODY"), (SubLObject)makeSymbol("S#5", "CYC"));
        $ic356$ = makeUninternedSymbol("US#621EC6A");
        $ic357$ = makeUninternedSymbol("US#6ED60B3");
        $ic358$ = makeUninternedSymbol("US#61F293F");
        $ic359$ = makeSymbol("CSETF");
        $ic360$ = makeString("Internal error ~S during table rehashing; file might be corrupted.");
        $ic361$ = makeKeyword("VALID");
        $ic362$ = makeString("Cannot correctly determine file position after writing object entry to ~D.");
        $ic363$ = makeString("New file position ~D is smaller than starting position ~D ... disk full?");
        $ic364$ = makeString("Instead of ~D bytes, object took ~D to write; object modified during write?");
        $ic365$ = makeString("Only ~D of the expected ~D bytes were written; object modified during write? Disk full?");
        $ic366$ = makeString("Claimed object size ~D did not match I/O size ~D; file might be corrupted.");
        $ic367$ = makeSymbol("S#8548", "CYC");
        $ic368$ = ConsesLow.list((SubLObject)makeSymbol("S#8592", "CYC"), (SubLObject)makeSymbol("S#8593", "CYC"), (SubLObject)makeSymbol("S#1643", "CYC"), (SubLObject)makeSymbol("S#6909", "CYC"), (SubLObject)makeSymbol("S#8594", "CYC"));
        $ic369$ = makeKeyword("READER");
        $ic370$ = makeKeyword("WRITER");
        $ic371$ = makeKeyword("VERIFIER");
        $ic372$ = makeSymbol("SETHASH");
        $ic373$ = makeInteger(32792);
        $ic374$ = makeInteger(32784);
        $ic375$ = makeInteger(32776);
        $ic376$ = makeInteger(32768);
        $ic377$ = makeInteger(32824);
        $ic378$ = makeInteger(32816);
        $ic379$ = makeInteger(32808);
        $ic380$ = makeInteger(32800);
        $ic381$ = makeString("After reading ~S, computed position ~D /= actual file position ~D.");
        $ic382$ = makeString("Predicted object size ~D did not match I/O size ~D; file might be corrupted.");
        $ic383$ = makeKeyword("EOF");
        $ic384$ = makeString("Premature end-of-file when moving block (~D bytes) from ~D to ~D.");
        $ic385$ = makeKeyword("AGGRESSIVE");
        $ic386$ = makeKeyword("MODERATE");
        $ic387$ = makeKeyword("CONSERVATIVE");
        $ic388$ = makeString("Invalid Fast-FHT optimization mode ~A.");
        $ic389$ = makeSymbol("S#8150", "CYC");
        $ic390$ = makeSymbol("S#8151", "CYC");
        $ic391$ = ConsesLow.list((SubLObject)makeSymbol("S#8586", "CYC"), (SubLObject)makeSymbol("S#8595", "CYC"), (SubLObject)makeSymbol("S#8596", "CYC"), (SubLObject)makeSymbol("S#8597", "CYC"));
        $ic392$ = ConsesLow.list((SubLObject)makeKeyword("FHT"), (SubLObject)makeKeyword("TEMPSTEM"), (SubLObject)makeKeyword("TEMPFILE"), (SubLObject)makeKeyword("KEYSTREAM"));
        $ic393$ = ConsesLow.list((SubLObject)makeSymbol("S#8437", "CYC"), (SubLObject)makeSymbol("S#8438", "CYC"), (SubLObject)makeSymbol("S#8439", "CYC"), (SubLObject)makeSymbol("S#8440", "CYC"));
        $ic394$ = ConsesLow.list((SubLObject)makeSymbol("S#8441", "CYC"), (SubLObject)makeSymbol("S#8442", "CYC"), (SubLObject)makeSymbol("S#8443", "CYC"), (SubLObject)makeSymbol("S#8444", "CYC"));
        $ic395$ = makeSymbol("S#8436", "CYC");
        $ic396$ = ConsesLow.list((SubLObject)makeSymbol("OPTIMIZE-FUNCALL"), (SubLObject)makeSymbol("S#8151", "CYC"));
        $ic397$ = makeSymbol("S#8437", "CYC");
        $ic398$ = makeSymbol("S#8441", "CYC");
        $ic399$ = makeSymbol("S#8438", "CYC");
        $ic400$ = makeSymbol("S#8442", "CYC");
        $ic401$ = makeSymbol("S#8439", "CYC");
        $ic402$ = makeSymbol("S#8443", "CYC");
        $ic403$ = makeSymbol("S#8440", "CYC");
        $ic404$ = makeSymbol("S#8444", "CYC");
        $ic405$ = makeKeyword("FHT");
        $ic406$ = makeKeyword("TEMPSTEM");
        $ic407$ = makeKeyword("TEMPFILE");
        $ic408$ = makeKeyword("KEYSTREAM");
        $ic409$ = makeSymbol("S#8445", "CYC");
        $ic410$ = makeSymbol("S#8447", "CYC");
        $ic411$ = makeInteger(1024);
        $ic412$ = makeSymbol("S#5859", "CYC");
        $ic413$ = makeString("keystream-");
        $ic414$ = ConsesLow.list((SubLObject)makeKeyword("ERROR"), (SubLObject)makeKeyword("USE-FIRST"));
        $ic415$ = makeString("Unknown NON-UNIQUE-KEY-HANDLING value ~S");
        $ic416$ = makeKeyword("IGNORE-ERRORS-TARGET");
        $ic417$ = makeSymbol("IGNORE-ERRORS-HANDLER", "SUBLISP");
        $ic418$ = makeString("ambiguous");
        $ic419$ = makeString("Unable to open ~S");
        $ic420$ = makeString("unambiguous");
        $ic421$ = makeString("Cannot call this method in mode ~A.");
        $ic422$ = makeString("Seeding keyspace with unambiguous keys ....");
        $ic423$ = makeString("Run in index of keystream (prev=~A curr=~A). Fix FAST-FHT-UNIQUIFY-KEYSTREAM");
        $ic424$ = makeString("Inserting ");
        $ic425$ = makeString(" keys into keyspace ....");
        $ic426$ = makeString("Sorry, key ~A appears not to be unique within the set; fast hash table create only works for already unique sets.");
        $ic427$ = makeKeyword("USE-FIRST");
        $ic428$ = makeSymbol("S#8152", "CYC");
        $ic429$ = makeSymbol("S#8153", "CYC");
        $ic430$ = ConsesLow.list((SubLObject)makeSymbol("S#8595", "CYC"), (SubLObject)makeSymbol("S#8598", "CYC"), (SubLObject)makeSymbol("S#8599", "CYC"));
        $ic431$ = ConsesLow.list((SubLObject)makeKeyword("TEMPSTEM"), (SubLObject)makeKeyword("IN-FILES"), (SubLObject)makeKeyword("OUT-FILES"));
        $ic432$ = ConsesLow.list((SubLObject)makeSymbol("S#8464", "CYC"), (SubLObject)makeSymbol("S#8465", "CYC"), (SubLObject)makeSymbol("S#8466", "CYC"));
        $ic433$ = ConsesLow.list((SubLObject)makeSymbol("S#8467", "CYC"), (SubLObject)makeSymbol("S#8468", "CYC"), (SubLObject)makeSymbol("S#8469", "CYC"));
        $ic434$ = makeSymbol("S#8463", "CYC");
        $ic435$ = ConsesLow.list((SubLObject)makeSymbol("OPTIMIZE-FUNCALL"), (SubLObject)makeSymbol("S#8153", "CYC"));
        $ic436$ = makeSymbol("S#8464", "CYC");
        $ic437$ = makeSymbol("S#8467", "CYC");
        $ic438$ = makeSymbol("S#8465", "CYC");
        $ic439$ = makeSymbol("S#8468", "CYC");
        $ic440$ = makeSymbol("S#8466", "CYC");
        $ic441$ = makeSymbol("S#8469", "CYC");
        $ic442$ = makeKeyword("IN-FILES");
        $ic443$ = makeKeyword("OUT-FILES");
        $ic444$ = makeSymbol("S#8470", "CYC");
        $ic445$ = makeSymbol("S#8472", "CYC");
        $ic446$ = makeString("Prepare tiled input files ....");
        $ic447$ = makeString("Less than 3 tiles, no sort needed ....");
        $ic448$ = makeKeyword("OUTPUT");
        $ic449$ = makeString("Merge-sorting keystream of ");
        $ic450$ = makeString(" tiles in ");
        $ic451$ = makeString(" passes....");
        $ic452$ = makeString("Generate set and activity files ....");
        $ic453$ = makeString("in-");
        $ic454$ = makeString("out-");
        $ic455$ = makeString("Can only work from a rewound keystream ~A.");
        $ic456$ = makeSymbol("S#8481", "CYC");
        $ic457$ = makeKeyword("EQ");
        $ic458$ = makeKeyword("GT");
        $ic459$ = makeKeyword("LT");
        $ic460$ = makeKeyword("APPEND");
        $ic461$ = ConsesLow.list((SubLObject)makeUninternedSymbol("US#352B2C1"), (SubLObject)makeUninternedSymbol("US#13A2892"), (SubLObject)makeUninternedSymbol("US#1160044"));
        $ic462$ = makeString(" of ");
        $ic463$ = makeString("Merge Pass ");
        $ic464$ = makeString("The chunk count should have declined, but did not: ~A >= ~A.");
        $ic465$ = makeString("Only sentinels or :EOF can be equal, but ~A and ~A are.");
        $ic466$ = makeKeyword("MORE");
        $ic467$ = ConsesLow.list((SubLObject)makeSymbol("S#8586", "CYC"), (SubLObject)makeSymbol("S#134", "CYC"), (SubLObject)makeSymbol("S#8600", "CYC"), (SubLObject)makeSymbol("S#6009", "CYC"), (SubLObject)makeSymbol("S#8601", "CYC"), (SubLObject)makeSymbol("S#8602", "CYC"));
        $ic468$ = makeSymbol("=");
        $ic469$ = makeSymbol("S#8495", "CYC");
        $ic470$ = makeSymbol("S#8488", "CYC");
        $ic471$ = makeSymbol("S#8477", "CYC");
        $ic472$ = makeSymbol("CINC");
        $ic473$ = ConsesLow.list(new SubLObject[] { makeSymbol("S#8586", "CYC"), makeSymbol("S#8603", "CYC"), makeSymbol("S#8604", "CYC"), makeSymbol("S#8605", "CYC"), makeSymbol("S#8606", "CYC"), makeSymbol("S#8607", "CYC"), makeSymbol("S#8601", "CYC"), makeSymbol("S#8608", "CYC"), makeSymbol("S#8602", "CYC") });
        $ic474$ = makeUninternedSymbol("US#2D266B1");
        $ic475$ = makeUninternedSymbol("US#1C3201");
        $ic476$ = makeSymbol("S#8487", "CYC");
        $ic477$ = makeSymbol("S#8492", "CYC");
        $ic478$ = makeString(" ~A set item~A, ~A activity item~A ");
        $ic479$ = makeString("s");
        $ic480$ = makeString("=========================");
        $ic481$ = makeString("~&<<<<File ~A>>>>~%");
        $ic482$ = makeString("File ~A no does not contain a valid keystream: problem at ~A.");
        $ic483$ = makeKeyword("MID-STREAM-EOF");
        $ic484$ = makeKeyword("UNSORTED-INDEX");
        $ic485$ = makeSymbol("S#8500", "CYC");
        $ic486$ = makeKeyword("TEST");
        $ic487$ = makeKeyword("OWNER");
        $ic488$ = makeKeyword("CLASSES");
        $ic489$ = makeKeyword("KB");
        $ic490$ = makeKeyword("TINY");
        $ic491$ = makeKeyword("WORKING?");
        $ic492$ = ConsesLow.list(new SubLObject[] { ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeKeyword("SENTINEL"), (SubLObject)makeKeyword("SENTINEL")), (SubLObject)makeKeyword("EQ")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeKeyword("EOF"), (SubLObject)makeKeyword("EOF")), (SubLObject)makeKeyword("EQ")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeKeyword("SENTINEL"), (SubLObject)makeKeyword("EOF")), (SubLObject)makeKeyword("LT")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeKeyword("EOF"), (SubLObject)makeKeyword("SENTINEL")), (SubLObject)makeKeyword("GT")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeInteger(104), (SubLObject)makeInteger(168), (SubLObject)makeInteger(12850), (SubLObject)makeString("137")), (SubLObject)makeKeyword("SENTINEL")), (SubLObject)makeKeyword("LT")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeKeyword("SENTINEL"), (SubLObject)ConsesLow.list((SubLObject)makeInteger(104), (SubLObject)makeInteger(168), (SubLObject)makeInteger(12850), (SubLObject)makeString("137"))), (SubLObject)makeKeyword("GT")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeInteger(104), (SubLObject)makeInteger(168), (SubLObject)makeInteger(12850), (SubLObject)makeString("137")), (SubLObject)makeKeyword("EOF")), (SubLObject)makeKeyword("LT")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeKeyword("EOF"), (SubLObject)ConsesLow.list((SubLObject)makeInteger(104), (SubLObject)makeInteger(168), (SubLObject)makeInteger(12850), (SubLObject)makeString("137"))), (SubLObject)makeKeyword("GT")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeInteger(128), (SubLObject)makeInteger(128), (SubLObject)makeInteger(13062), (SubLObject)makeString("97")), (SubLObject)ConsesLow.list((SubLObject)makeInteger(104), (SubLObject)makeInteger(168), (SubLObject)makeInteger(12850), (SubLObject)makeString("137"))), (SubLObject)makeKeyword("GT")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeInteger(104), (SubLObject)makeInteger(168), (SubLObject)makeInteger(12850), (SubLObject)makeString("137")), (SubLObject)ConsesLow.list((SubLObject)makeInteger(128), (SubLObject)makeInteger(128), (SubLObject)makeInteger(13062), (SubLObject)makeString("97"))), (SubLObject)makeKeyword("LT")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeInteger(104), (SubLObject)makeInteger(168), (SubLObject)makeInteger(12850), (SubLObject)makeString("137")), (SubLObject)ConsesLow.list((SubLObject)makeInteger(104), (SubLObject)makeInteger(168), (SubLObject)makeInteger(12850), (SubLObject)makeString("137"))), (SubLObject)makeKeyword("EQ")) });
        $ic493$ = makeKeyword("SENTINEL");
        $ic494$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#8586", "CYC"), (SubLObject)makeSymbol("S#885", "CYC"), (SubLObject)makeSymbol("&KEY"), (SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#8609", "CYC"), (SubLObject)ConsesLow.list((SubLObject)makeSymbol("QUOTE"), (SubLObject)makeSymbol("S#8516", "CYC"))), (SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#8610", "CYC"), (SubLObject)makeSymbol("S#8517", "CYC"))), (SubLObject)makeSymbol("&BODY"), (SubLObject)makeSymbol("S#5", "CYC"));
        $ic495$ = ConsesLow.list((SubLObject)makeKeyword("TEST-FN"), (SubLObject)makeKeyword("SERIALIZATION-FN"));
        $ic496$ = makeKeyword("TEST-FN");
        $ic497$ = makeSymbol("S#8516", "CYC");
        $ic498$ = makeKeyword("SERIALIZATION-FN");
        $ic499$ = makeSymbol("CUNWIND-PROTECT");
        $ic500$ = makeSymbol("S#8296", "CYC");
        $ic501$ = makeSymbol("PWHEN");
        $ic502$ = makeSymbol("S#8298", "CYC");
        $ic503$ = makeSymbol("S#8295", "CYC");
        $ic504$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#8586", "CYC"), (SubLObject)makeSymbol("S#885", "CYC"), (SubLObject)makeSymbol("&KEY"), (SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#8611", "CYC"), (SubLObject)makeSymbol("S#8523", "CYC")), (SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#8612", "CYC"), (SubLObject)makeSymbol("S#8524", "CYC")), (SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#8609", "CYC"), (SubLObject)ConsesLow.list((SubLObject)makeSymbol("QUOTE"), (SubLObject)makeSymbol("S#8516", "CYC"))), (SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#8610", "CYC"), (SubLObject)makeSymbol("S#8517", "CYC"))), (SubLObject)makeSymbol("&BODY"), (SubLObject)makeSymbol("S#5", "CYC"));
        $ic505$ = ConsesLow.list((SubLObject)makeKeyword("EXPECTED-ITEMS"), (SubLObject)makeKeyword("AVERAGE-SIZE"), (SubLObject)makeKeyword("TEST-FN"), (SubLObject)makeKeyword("SERIALIZATION-FN"));
        $ic506$ = makeKeyword("EXPECTED-ITEMS");
        $ic507$ = makeKeyword("AVERAGE-SIZE");
        $ic508$ = makeSymbol("S#8294", "CYC");
        $ic509$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#8613", "CYC"), (SubLObject)makeSymbol("S#885", "CYC"), (SubLObject)makeSymbol("&KEY"), (SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#8614", "CYC"), (SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#6790", "CYC"))), (SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#8609", "CYC"), (SubLObject)ConsesLow.list((SubLObject)makeSymbol("QUOTE"), (SubLObject)makeSymbol("S#8516", "CYC"))), (SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#8610", "CYC"), (SubLObject)makeSymbol("S#8517", "CYC")), (SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#8615", "CYC"))), (SubLObject)makeSymbol("&BODY"), (SubLObject)makeSymbol("S#5", "CYC"));
        $ic510$ = ConsesLow.list((SubLObject)makeKeyword("TEMPDIR"), (SubLObject)makeKeyword("TEST-FN"), (SubLObject)makeKeyword("SERIALIZATION-FN"), (SubLObject)makeKeyword("KEEP-TEMPORARY-KEYFILE"));
        $ic511$ = makeKeyword("TEMPDIR");
        $ic512$ = makeKeyword("KEEP-TEMPORARY-KEYFILE");
        $ic513$ = makeSymbol("S#8448", "CYC");
        $ic514$ = makeSymbol("S#8454", "CYC");
        $ic515$ = makeSymbol("S#8506", "CYC");
        $ic516$ = ConsesLow.list(new SubLObject[] { ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeInteger(31), (SubLObject)THREE_INTEGER, (SubLObject)makeKeyword("MODERATE")), (SubLObject)makeKeyword("SUCCESS")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeInteger(23), (SubLObject)THREE_INTEGER, (SubLObject)makeKeyword("MODERATE")), (SubLObject)makeKeyword("SUCCESS")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)FIFTEEN_INTEGER, (SubLObject)THREE_INTEGER, (SubLObject)makeKeyword("MODERATE")), (SubLObject)makeKeyword("SUCCESS")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SEVEN_INTEGER, (SubLObject)THREE_INTEGER, (SubLObject)makeKeyword("MODERATE")), (SubLObject)makeKeyword("SUCCESS")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeInteger(31), (SubLObject)THREE_INTEGER, (SubLObject)makeKeyword("AGGRESSIVE")), (SubLObject)makeKeyword("SUCCESS")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeInteger(23), (SubLObject)THREE_INTEGER, (SubLObject)makeKeyword("AGGRESSIVE")), (SubLObject)makeKeyword("SUCCESS")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)FIFTEEN_INTEGER, (SubLObject)THREE_INTEGER, (SubLObject)makeKeyword("AGGRESSIVE")), (SubLObject)makeKeyword("SUCCESS")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SEVEN_INTEGER, (SubLObject)THREE_INTEGER, (SubLObject)makeKeyword("AGGRESSIVE")), (SubLObject)makeKeyword("SUCCESS")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeInteger(31), (SubLObject)THREE_INTEGER, (SubLObject)makeKeyword("CONSERVATIVE")), (SubLObject)makeKeyword("SUCCESS")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeInteger(23), (SubLObject)THREE_INTEGER, (SubLObject)makeKeyword("CONSERVATIVE")), (SubLObject)makeKeyword("SUCCESS")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)FIFTEEN_INTEGER, (SubLObject)THREE_INTEGER, (SubLObject)makeKeyword("CONSERVATIVE")), (SubLObject)makeKeyword("SUCCESS")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SEVEN_INTEGER, (SubLObject)THREE_INTEGER, (SubLObject)makeKeyword("CONSERVATIVE")), (SubLObject)makeKeyword("SUCCESS")) });
        $ic517$ = makeString("My String ");
        $ic518$ = makeKeyword("SUCCESS");
        $ic519$ = makeKeyword("UNPROVIDED");
        $ic520$ = makeString("fht-");
        $ic521$ = makeString("Writing out FHT ....");
        $ic522$ = ConsesLow.list((SubLObject)makeSymbol("S#131", "CYC"), (SubLObject)makeSymbol("VALUES"));
        $ic523$ = makeString("Error, expected ~A items, got ~A.");
        $ic524$ = makeString("Checking map against FHT ....");
        $ic525$ = makeString("For ~S, expected ~S, got ~S instead.");
        $ic526$ = makeString("We checked ~A of ~A entries.");
        $ic527$ = makeString("Checking FHT against map ...");
        $ic528$ = makeString("For ~S, epxected ~S, got ~S instead.");
        $ic529$ = makeSymbol("S#8508", "CYC");
        $ic530$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeInteger(100), (SubLObject)makeSymbol("RANDOM-CONSTANT"), (SubLObject)makeSymbol("CONSTANT-SUID"), (SubLObject)makeSymbol("CONSTANT-NAME"), (SubLObject)EQL, (SubLObject)makeSymbol("STRING-EQUAL")), (SubLObject)makeKeyword("SUCCESS")), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeInteger(100), (SubLObject)makeSymbol("RANDOM-ASSERTION"), (SubLObject)makeSymbol("ASSERTION-ID"), (SubLObject)makeSymbol("COMPACT-HL-EXTERNAL-ID-STRING"), (SubLObject)EQL, (SubLObject)makeSymbol("STRING-EQUAL")), (SubLObject)makeKeyword("SUCCESS")), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeInteger(100), (SubLObject)makeSymbol("S#8509", "CYC"), (SubLObject)makeSymbol("S#8510", "CYC"), (SubLObject)makeSymbol("S#8511", "CYC"), (SubLObject)EQUALP, (SubLObject)EQUALP, (SubLObject)makeKeyword("IMAGE-INDEPENDENT-CFASL")), (SubLObject)makeKeyword("SUCCESS")));
        $ic531$ = makeKeyword("VALUE");
    }
    
    public static final class $sX8138_native extends SubLStructNative
    {
        public SubLObject $stream;
        public SubLObject $header;
        public SubLObject $lock;
        public SubLObject $encoding_input_fn;
        public SubLObject $encoding_output_fn;
        public SubLObject $encoding_size_fn;
        public SubLObject $encoding_key_input_fn;
        public SubLObject $encoding_key_output_fn;
        public SubLObject $testfn;
        public SubLObject $hash_fn;
        public SubLObject $input_cache;
        public SubLObject $output_cache;
        public SubLObject $property_list;
        public static final SubLStructDeclNative structDecl;
        
        public $sX8138_native() {
            this.$stream = (SubLObject)CommonSymbols.NIL;
            this.$header = (SubLObject)CommonSymbols.NIL;
            this.$lock = (SubLObject)CommonSymbols.NIL;
            this.$encoding_input_fn = (SubLObject)CommonSymbols.NIL;
            this.$encoding_output_fn = (SubLObject)CommonSymbols.NIL;
            this.$encoding_size_fn = (SubLObject)CommonSymbols.NIL;
            this.$encoding_key_input_fn = (SubLObject)CommonSymbols.NIL;
            this.$encoding_key_output_fn = (SubLObject)CommonSymbols.NIL;
            this.$testfn = (SubLObject)CommonSymbols.NIL;
            this.$hash_fn = (SubLObject)CommonSymbols.NIL;
            this.$input_cache = (SubLObject)CommonSymbols.NIL;
            this.$output_cache = (SubLObject)CommonSymbols.NIL;
            this.$property_list = (SubLObject)CommonSymbols.NIL;
        }
        
        public SubLStructDecl getStructDecl() {
            return (SstructDecl;
        }
        
        public SubLObject getField2() {
            return this.$stream;
        }
        
        public SubLObject getField3() {
            return this.$header;
        }
        
        public SubLObject getField4() {
            return this.$lock;
        }
        
        public SubLObject getField5() {
            return this.$encoding_input_fn;
        }
        
        public SubLObject getField6() {
            return this.$encoding_output_fn;
        }
        
        public SubLObject getField7() {
            return this.$encoding_size_fn;
        }
        
        public SubLObject getField8() {
            return this.$encoding_key_input_fn;
        }
        
        public SubLObject getField9() {
            return this.$encoding_key_output_fn;
        }
        
        public SubLObject getField10() {
            return this.$testfn;
        }
        
        public SubLObject getField11() {
            return this.$hash_fn;
        }
        
        public SubLObject getField12() {
            return this.$input_cache;
        }
        
        public SubLObject getField13() {
            return this.$output_cache;
        }
        
        public SubLObject getField14() {
            return this.$property_list;
        }
        
        public SubLObject setField2(final SubLObject value) {
            return this.$stream = value;
        }
        
        public SubLObject setField3(final SubLObject value) {
            return this.$header = value;
        }
        
        public SubLObject setField4(final SubLObject value) {
            return this.$lock = value;
        }
        
        public SubLObject setField5(final SubLObject value) {
            return this.$encoding_input_fn = value;
        }
        
        public SubLObject setField6(final SubLObject value) {
            return this.$encoding_output_fn = value;
        }
        
        public SubLObject setField7(final SubLObject value) {
            return this.$encoding_size_fn = value;
        }
        
        public SubLObject setField8(final SubLObject value) {
            return this.$encoding_key_input_fn = value;
        }
        
        public SubLObject setField9(final SubLObject value) {
            return this.$encoding_key_output_fn = value;
        }
        
        public SubLObject setField10(final SubLObject value) {
            return this.$testfn = value;
        }
        
        public SubLObject setField11(final SubLObject value) {
            return this.$hash_fn = value;
        }
        
        public SubLObject setField12(final SubLObject value) {
            return this.$input_cache = value;
        }
        
        public SubLObject setField13(final SubLObject value) {
            return this.$output_cache = value;
        }
        
        public SubLObject setField14(final SubLObject value) {
            return this.$property_list = value;
        }
        
        static {
            structDecl = Structures.makeStructDeclNative((Class)$sX8138_native.class, $ic0$, $ic1$, $ic2$, $ic3$, new String[] { "$stream", "$header", "$lock", "$encoding_input_fn", "$encoding_output_fn", "$encoding_size_fn", "$encoding_key_input_fn", "$encoding_key_output_fn", "$testfn", "$hash_fn", "$input_cache", "$output_cache", "$property_list" }, $ic4$, $ic5$, $ic6$);
        }
    }
    
    public static final class $f6457$UnaryFunction extends UnaryFunction
    {
        public $f6457$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("S#8139"));
        }
        
        public SubLObject processItem(final SubLObject var3) {
            return f6457(var3);
        }
    }
    
    public static final class $sX8140_native extends SubLStructNative
    {
        public SubLObject $size;
        public SubLObject $version_major;
        public SubLObject $version_minor;
        public SubLObject $object_space_offset;
        public SubLObject $key_space_offset;
        public SubLObject $current_heap_top;
        public SubLObject $item_count;
        public SubLObject $capacity;
        public SubLObject $free_list_head;
        public SubLObject $deletion_count;
        public SubLObject $header_crc;
        public SubLObject $extension_space_size;
        public SubLObject $extension_space;
        public static final SubLStructDeclNative structDecl;
        
        public $sX8140_native() {
            this.$size = (SubLObject)CommonSymbols.NIL;
            this.$version_major = (SubLObject)CommonSymbols.NIL;
            this.$version_minor = (SubLObject)CommonSymbols.NIL;
            this.$object_space_offset = (SubLObject)CommonSymbols.NIL;
            this.$key_space_offset = (SubLObject)CommonSymbols.NIL;
            this.$current_heap_top = (SubLObject)CommonSymbols.NIL;
            this.$item_count = (SubLObject)CommonSymbols.NIL;
            this.$capacity = (SubLObject)CommonSymbols.NIL;
            this.$free_list_head = (SubLObject)CommonSymbols.NIL;
            this.$deletion_count = (SubLObject)CommonSymbols.NIL;
            this.$header_crc = (SubLObject)CommonSymbols.NIL;
            this.$extension_space_size = (SubLObject)CommonSymbols.NIL;
            this.$extension_space = (SubLObject)CommonSymbols.NIL;
        }
        
        public SubLStructDecl getStructDecl() {
            return (SstructDecl;
        }
        
        public SubLObject getField2() {
            return this.$size;
        }
        
        public SubLObject getField3() {
            return this.$version_major;
        }
        
        public SubLObject getField4() {
            return this.$version_minor;
        }
        
        public SubLObject getField5() {
            return this.$object_space_offset;
        }
        
        public SubLObject getField6() {
            return this.$key_space_offset;
        }
        
        public SubLObject getField7() {
            return this.$current_heap_top;
        }
        
        public SubLObject getField8() {
            return this.$item_count;
        }
        
        public SubLObject getField9() {
            return this.$capacity;
        }
        
        public SubLObject getField10() {
            return this.$free_list_head;
        }
        
        public SubLObject getField11() {
            return this.$deletion_count;
        }
        
        public SubLObject getField12() {
            return this.$header_crc;
        }
        
        public SubLObject getField13() {
            return this.$extension_space_size;
        }
        
        public SubLObject getField14() {
            return this.$extension_space;
        }
        
        public SubLObject setField2(final SubLObject value) {
            return this.$size = value;
        }
        
        public SubLObject setField3(final SubLObject value) {
            return this.$version_major = value;
        }
        
        public SubLObject setField4(final SubLObject value) {
            return this.$version_minor = value;
        }
        
        public SubLObject setField5(final SubLObject value) {
            return this.$object_space_offset = value;
        }
        
        public SubLObject setField6(final SubLObject value) {
            return this.$key_space_offset = value;
        }
        
        public SubLObject setField7(final SubLObject value) {
            return this.$current_heap_top = value;
        }
        
        public SubLObject setField8(final SubLObject value) {
            return this.$item_count = value;
        }
        
        public SubLObject setField9(final SubLObject value) {
            return this.$capacity = value;
        }
        
        public SubLObject setField10(final SubLObject value) {
            return this.$free_list_head = value;
        }
        
        public SubLObject setField11(final SubLObject value) {
            return this.$deletion_count = value;
        }
        
        public SubLObject setField12(final SubLObject value) {
            return this.$header_crc = value;
        }
        
        public SubLObject setField13(final SubLObject value) {
            return this.$extension_space_size = value;
        }
        
        public SubLObject setField14(final SubLObject value) {
            return this.$extension_space = value;
        }
        
        static {
            structDecl = Structures.makeStructDeclNative((Class)$sX8140_native.class, $ic61$, $ic62$, $ic63$, $ic64$, new String[] { "$size", "$version_major", "$version_minor", "$object_space_offset", "$key_space_offset", "$current_heap_top", "$item_count", "$capacity", "$free_list_head", "$deletion_count", "$header_crc", "$extension_space_size", "$extension_space" }, $ic65$, $ic66$, $ic6$);
        }
    }
    
    public static final class $f6499$UnaryFunction extends UnaryFunction
    {
        public $f6499$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("S#8141"));
        }
        
        public SubLObject processItem(final SubLObject var3) {
            return f6499(var3);
        }
    }
    
    public static final class $sX8142_native extends SubLStructNative
    {
        public SubLObject $size;
        public SubLObject $type;
        public SubLObject $key_size;
        public SubLObject $key;
        public SubLObject $data_size;
        public SubLObject $data;
        public static final SubLStructDeclNative structDecl;
        
        public $sX8142_native() {
            this.$size = (SubLObject)CommonSymbols.NIL;
            this.$type = (SubLObject)CommonSymbols.NIL;
            this.$key_size = (SubLObject)CommonSymbols.NIL;
            this.$key = (SubLObject)CommonSymbols.NIL;
            this.$data_size = (SubLObject)CommonSymbols.NIL;
            this.$data = (SubLObject)CommonSymbols.NIL;
        }
        
        public SubLStructDecl getStructDecl() {
            return (SstructDecl;
        }
        
        public SubLObject getField2() {
            return this.$size;
        }
        
        public SubLObject getField3() {
            return this.$type;
        }
        
        public SubLObject getField4() {
            return this.$key_size;
        }
        
        public SubLObject getField5() {
            return this.$key;
        }
        
        public SubLObject getField6() {
            return this.$data_size;
        }
        
        public SubLObject getField7() {
            return this.$data;
        }
        
        public SubLObject setField2(final SubLObject value) {
            return this.$size = value;
        }
        
        public SubLObject setField3(final SubLObject value) {
            return this.$type = value;
        }
        
        public SubLObject setField4(final SubLObject value) {
            return this.$key_size = value;
        }
        
        public SubLObject setField5(final SubLObject value) {
            return this.$key = value;
        }
        
        public SubLObject setField6(final SubLObject value) {
            return this.$data_size = value;
        }
        
        public SubLObject setField7(final SubLObject value) {
            return this.$data = value;
        }
        
        static {
            structDecl = Structures.makeStructDeclNative((Class)$sX8142_native.class, $ic121$, $ic122$, $ic123$, $ic124$, new String[] { "$size", "$type", "$key_size", "$key", "$data_size", "$data" }, $ic125$, $ic126$, $ic6$);
        }
    }
    
    public static final class $f6530$UnaryFunction extends UnaryFunction
    {
        public $f6530$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("S#8143"));
        }
        
        public SubLObject processItem(final SubLObject var3) {
            return f6530(var3);
        }
    }
    
    public static final class $sX8144_native extends SubLStructNative
    {
        public SubLObject $key_offset;
        public SubLObject $hash_code;
        public static final SubLStructDeclNative structDecl;
        
        public $sX8144_native() {
            this.$key_offset = (SubLObject)CommonSymbols.NIL;
            this.$hash_code = (SubLObject)CommonSymbols.NIL;
        }
        
        public SubLStructDecl getStructDecl() {
            return (SstructDecl;
        }
        
        public SubLObject getField2() {
            return this.$key_offset;
        }
        
        public SubLObject getField3() {
            return this.$hash_code;
        }
        
        public SubLObject setField2(final SubLObject value) {
            return this.$key_offset = value;
        }
        
        public SubLObject setField3(final SubLObject value) {
            return this.$hash_code = value;
        }
        
        static {
            structDecl = Structures.makeStructDeclNative((Class)$sX8144_native.class, $ic148$, $ic149$, $ic150$, $ic151$, new String[] { "$key_offset", "$hash_code" }, $ic152$, $ic153$, $ic6$);
        }
    }
    
    public static final class $f6547$UnaryFunction extends UnaryFunction
    {
        public $f6547$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("S#8145"));
        }
        
        public SubLObject processItem(final SubLObject var3) {
            return f6547(var3);
        }
    }
    
    public static final class $sX8146_native extends SubLStructNative
    {
        public SubLObject $encoding_input_fn;
        public SubLObject $encoding_output_fn;
        public SubLObject $encoding_size_fn;
        public SubLObject $hash_fn;
        public SubLObject $encoding_key_input_fn;
        public SubLObject $encoding_key_output_fn;
        public static final SubLStructDeclNative structDecl;
        
        public $sX8146_native() {
            this.$encoding_input_fn = (SubLObject)CommonSymbols.NIL;
            this.$encoding_output_fn = (SubLObject)CommonSymbols.NIL;
            this.$encoding_size_fn = (SubLObject)CommonSymbols.NIL;
            this.$hash_fn = (SubLObject)CommonSymbols.NIL;
            this.$encoding_key_input_fn = (SubLObject)CommonSymbols.NIL;
            this.$encoding_key_output_fn = (SubLObject)CommonSymbols.NIL;
        }
        
        public SubLStructDecl getStructDecl() {
            return (SstructDecl;
        }
        
        public SubLObject getField2() {
            return this.$encoding_input_fn;
        }
        
        public SubLObject getField3() {
            return this.$encoding_output_fn;
        }
        
        public SubLObject getField4() {
            return this.$encoding_size_fn;
        }
        
        public SubLObject getField5() {
            return this.$hash_fn;
        }
        
        public SubLObject getField6() {
            return this.$encoding_key_input_fn;
        }
        
        public SubLObject getField7() {
            return this.$encoding_key_output_fn;
        }
        
        public SubLObject setField2(final SubLObject value) {
            return this.$encoding_input_fn = value;
        }
        
        public SubLObject setField3(final SubLObject value) {
            return this.$encoding_output_fn = value;
        }
        
        public SubLObject setField4(final SubLObject value) {
            return this.$encoding_size_fn = value;
        }
        
        public SubLObject setField5(final SubLObject value) {
            return this.$hash_fn = value;
        }
        
        public SubLObject setField6(final SubLObject value) {
            return this.$encoding_key_input_fn = value;
        }
        
        public SubLObject setField7(final SubLObject value) {
            return this.$encoding_key_output_fn = value;
        }
        
        static {
            structDecl = Structures.makeStructDeclNative((Class)$sX8146_native.class, $ic172$, $ic173$, $ic174$, $ic175$, new String[] { "$encoding_input_fn", "$encoding_output_fn", "$encoding_size_fn", "$hash_fn", "$encoding_key_input_fn", "$encoding_key_output_fn" }, $ic176$, $ic177$, $ic178$);
        }
    }
    
    public static final class $f6580$UnaryFunction extends UnaryFunction
    {
        public $f6580$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("S#8147"));
        }
        
        public SubLObject processItem(final SubLObject var3) {
            return f6580(var3);
        }
    }
    
    public static final class $sX8148_native extends SubLStructNative
    {
        public SubLObject $size;
        public SubLObject $next;
        public static final SubLStructDeclNative structDecl;
        
        public $sX8148_native() {
            this.$size = (SubLObject)CommonSymbols.NIL;
            this.$next = (SubLObject)CommonSymbols.NIL;
        }
        
        public SubLStructDecl getStructDecl() {
            return (SstructDecl;
        }
        
        public SubLObject getField2() {
            return this.$size;
        }
        
        public SubLObject getField3() {
            return this.$next;
        }
        
        public SubLObject setField2(final SubLObject value) {
            return this.$size = value;
        }
        
        public SubLObject setField3(final SubLObject value) {
            return this.$next = value;
        }
        
        static {
            structDecl = Structures.makeStructDeclNative((Class)$sX8148_native.class, $ic324$, $ic325$, $ic326$, $ic327$, new String[] { "$size", "$next" }, $ic328$, $ic329$, $ic330$);
        }
    }
    
    public static final class $f6686$UnaryFunction extends UnaryFunction
    {
        public $f6686$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("S#8149"));
        }
        
        public SubLObject processItem(final SubLObject var3) {
            return f6686(var3);
        }
    }
    
    public static final class $sX8150_native extends SubLStructNative
    {
        public SubLObject $fht;
        public SubLObject $tempstem;
        public SubLObject $tempfile;
        public SubLObject $keystream;
        public static final SubLStructDeclNative structDecl;
        
        public $sX8150_native() {
            this.$fht = (SubLObject)CommonSymbols.NIL;
            this.$tempstem = (SubLObject)CommonSymbols.NIL;
            this.$tempfile = (SubLObject)CommonSymbols.NIL;
            this.$keystream = (SubLObject)CommonSymbols.NIL;
        }
        
        public SubLStructDecl getStructDecl() {
            return (SstructDecl;
        }
        
        public SubLObject getField2() {
            return this.$fht;
        }
        
        public SubLObject getField3() {
            return this.$tempstem;
        }
        
        public SubLObject getField4() {
            return this.$tempfile;
        }
        
        public SubLObject getField5() {
            return this.$keystream;
        }
        
        public SubLObject setField2(final SubLObject value) {
            return this.$fht = value;
        }
        
        public SubLObject setField3(final SubLObject value) {
            return this.$tempstem = value;
        }
        
        public SubLObject setField4(final SubLObject value) {
            return this.$tempfile = value;
        }
        
        public SubLObject setField5(final SubLObject value) {
            return this.$keystream = value;
        }
        
        static {
            structDecl = Structures.makeStructDeclNative((Class)$sX8150_native.class, $ic389$, $ic390$, $ic391$, $ic392$, new String[] { "$fht", "$tempstem", "$tempfile", "$keystream" }, $ic393$, $ic394$, $ic6$);
        }
    }
    
    public static final class $f6749$UnaryFunction extends UnaryFunction
    {
        public $f6749$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("S#8151"));
        }
        
        public SubLObject processItem(final SubLObject var3) {
            return f6749(var3);
        }
    }
    
    public static final class $sX8152_native extends SubLStructNative
    {
        public SubLObject $tempstem;
        public SubLObject $in_files;
        public SubLObject $out_files;
        public static final SubLStructDeclNative structDecl;
        
        public $sX8152_native() {
            this.$tempstem = (SubLObject)CommonSymbols.NIL;
            this.$in_files = (SubLObject)CommonSymbols.NIL;
            this.$out_files = (SubLObject)CommonSymbols.NIL;
        }
        
        public SubLStructDecl getStructDecl() {
            return (SstructDecl;
        }
        
        public SubLObject getField2() {
            return this.$tempstem;
        }
        
        public SubLObject getField3() {
            return this.$in_files;
        }
        
        public SubLObject getField4() {
            return this.$out_files;
        }
        
        public SubLObject setField2(final SubLObject value) {
            return this.$tempstem = value;
        }
        
        public SubLObject setField3(final SubLObject value) {
            return this.$in_files = value;
        }
        
        public SubLObject setField4(final SubLObject value) {
            return this.$out_files = value;
        }
        
        static {
            structDecl = Structures.makeStructDeclNative((Class)$sX8152_native.class, $ic428$, $ic429$, $ic430$, $ic431$, new String[] { "$tempstem", "$in_files", "$out_files" }, $ic432$, $ic433$, $ic6$);
        }
    }
    
    public static final class $f6775$UnaryFunction extends UnaryFunction
    {
        public $f6775$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("S#8153"));
        }
        
        public SubLObject processItem(final SubLObject var3) {
            return f6775(var3);
        }
    }
}

/*
	DECOMPILATION REPORT

	Decompiled from: G:\opt\CYC_JRTL_with_CommonLisp\platform\lib\cyc-oc4.0-unzipped/com/cyc/cycjava/cycl/class
	Total time: 3196 ms
	
	Decompiled with Procyon 0.5.32.
*/