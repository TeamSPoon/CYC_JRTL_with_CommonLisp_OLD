package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.random;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Vectors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Time;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Mapping;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Guids;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sort;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Strings;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class module0669 extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.module0669";
    public static final String myFingerPrint = "47e7b301d75833db998937fd5c65ae6056b4cab1b04ef48ebe03eedbe81a5e8c";
    private static SubLSymbol $g5278$;
    private static SubLSymbol $g5279$;
    private static SubLSymbol $g5280$;
    private static SubLSymbol $g5281$;
    private static SubLSymbol $g5282$;
    private static SubLSymbol $g5283$;
    private static SubLSymbol $g5284$;
    private static SubLSymbol $g5285$;
    public static SubLSymbol $g5286$;
    public static SubLSymbol $g5287$;
    private static SubLSymbol $g5288$;
    private static SubLSymbol $g5289$;
    private static SubLSymbol $g5290$;
    private static SubLSymbol $g5291$;
    private static SubLSymbol $g5292$;
    private static SubLSymbol $g5293$;
    private static SubLSymbol $g5294$;
    private static SubLSymbol $g5295$;
    private static SubLSymbol $g5296$;
    private static SubLSymbol $g5297$;
    private static final SubLString $ic0$;
    private static final SubLSymbol $ic1$;
    private static final SubLString $ic2$;
    private static final SubLString $ic3$;
    private static final SubLSymbol $ic4$;
    private static final SubLString $ic5$;
    private static final SubLSymbol $ic6$;
    private static final SubLSymbol $ic7$;
    private static final SubLSymbol $ic8$;
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
    private static final SubLString $ic20$;
    private static final SubLSymbol $ic21$;
    private static final SubLString $ic22$;
    private static final SubLSymbol $ic23$;
    private static final SubLString $ic24$;
    private static final SubLSymbol $ic25$;
    private static final SubLInteger $ic26$;
    private static final SubLSymbol $ic27$;
    private static final SubLSymbol $ic28$;
    private static final SubLString $ic29$;
    private static final SubLSymbol $ic30$;
    private static final SubLSymbol $ic31$;
    private static final SubLSymbol $ic32$;
    private static final SubLSymbol $ic33$;
    private static final SubLSymbol $ic34$;
    private static final SubLSymbol $ic35$;
    private static final SubLString $ic36$;
    private static final SubLSymbol $ic37$;
    private static final SubLString $ic38$;
    private static final SubLSymbol $ic39$;
    private static final SubLSymbol $ic40$;
    private static final SubLString $ic41$;
    private static final SubLSymbol $ic42$;
    private static final SubLString $ic43$;
    private static final SubLSymbol $ic44$;
    private static final SubLSymbol $ic45$;
    private static final SubLSymbol $ic46$;
    private static final SubLSymbol $ic47$;
    private static final SubLSymbol $ic48$;
    private static final SubLSymbol $ic49$;
    private static final SubLString $ic50$;
    private static final SubLString $ic51$;
    private static final SubLSymbol $ic52$;
    private static final SubLString $ic53$;
    private static final SubLSymbol $ic54$;
    private static final SubLSymbol $ic55$;
    private static final SubLString $ic56$;
    private static final SubLSymbol $ic57$;
    private static final SubLSymbol $ic58$;
    private static final SubLSymbol $ic59$;
    private static final SubLSymbol $ic60$;
    private static final SubLSymbol $ic61$;
    private static final SubLString $ic62$;
    private static final SubLString $ic63$;
    private static final SubLSymbol $ic64$;
    private static final SubLString $ic65$;
    private static final SubLSymbol $ic66$;
    private static final SubLString $ic67$;
    private static final SubLSymbol $ic68$;
    private static final SubLString $ic69$;
    private static final SubLSymbol $ic70$;
    private static final SubLString $ic71$;
    private static final SubLSymbol $ic72$;
    private static final SubLString $ic73$;
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
    private static final SubLList $ic87$;
    private static final SubLString $ic88$;
    private static final SubLString $ic89$;
    private static final SubLSymbol $ic90$;
    private static final SubLString $ic91$;
    private static final SubLString $ic92$;
    private static final SubLSymbol $ic93$;
    private static final SubLSymbol $ic94$;
    private static final SubLString $ic95$;
    private static final SubLString $ic96$;
    private static final SubLSymbol $ic97$;
    private static final SubLList $ic98$;
    private static final SubLString $ic99$;
    private static final SubLSymbol $ic100$;
    private static final SubLString $ic101$;
    private static final SubLString $ic102$;
    private static final SubLSymbol $ic103$;
    private static final SubLSymbol $ic104$;
    private static final SubLSymbol $ic105$;
    private static final SubLInteger $ic106$;
    private static final SubLSymbol $ic107$;
    private static final SubLList $ic108$;
    private static final SubLSymbol $ic109$;
    private static final SubLString $ic110$;
    private static final SubLSymbol $ic111$;
    private static final SubLString $ic112$;
    private static final SubLString $ic113$;
    private static final SubLString $ic114$;
    private static final SubLList $ic115$;
    private static final SubLSymbol $ic116$;
    private static final SubLSymbol $ic117$;
    private static final SubLString $ic118$;
    private static final SubLObject $ic119$;
    private static final SubLSymbol $ic120$;
    private static final SubLSymbol $ic121$;
    private static final SubLSymbol $ic122$;
    private static final SubLObject $ic123$;
    private static final SubLList $ic124$;
    private static final SubLList $ic125$;
    private static final SubLList $ic126$;
    private static final SubLString $ic127$;
    private static final SubLString $ic128$;
    private static final SubLSymbol $ic129$;
    private static final SubLSymbol $ic130$;
    private static final SubLString $ic131$;
    private static final SubLString $ic132$;
    private static final SubLObject $ic133$;
    private static final SubLSymbol $ic134$;
    private static final SubLObject $ic135$;
    private static final SubLObject $ic136$;
    private static final SubLSymbol $ic137$;
    private static final SubLString $ic138$;
    private static final SubLString $ic139$;
    private static final SubLString $ic140$;
    private static final SubLString $ic141$;
    private static final SubLString $ic142$;
    private static final SubLObject $ic143$;
    private static final SubLObject $ic144$;
    private static final SubLObject $ic145$;
    private static final SubLObject $ic146$;
    private static final SubLObject $ic147$;
    private static final SubLString $ic148$;
    private static final SubLString $ic149$;
    private static final SubLString $ic150$;
    private static final SubLString $ic151$;
    private static final SubLString $ic152$;
    private static final SubLString $ic153$;
    private static final SubLString $ic154$;
    private static final SubLString $ic155$;
    private static final SubLString $ic156$;
    private static final SubLSymbol $ic157$;
    private static final SubLString $ic158$;
    private static final SubLSymbol $ic159$;
    private static final SubLObject $ic160$;
    private static final SubLString $ic161$;
    private static final SubLSymbol $ic162$;
    private static final SubLString $ic163$;
    private static final SubLString $ic164$;
    private static final SubLList $ic165$;
    private static final SubLSymbol $ic166$;
    private static final SubLString $ic167$;
    private static final SubLString $ic168$;
    private static final SubLSymbol $ic169$;
    private static final SubLSymbol $ic170$;
    private static final SubLString $ic171$;
    private static final SubLString $ic172$;
    private static final SubLObject $ic173$;
    private static final SubLSymbol $ic174$;
    private static final SubLString $ic175$;
    private static final SubLString $ic176$;
    private static final SubLString $ic177$;
    private static final SubLString $ic178$;
    private static final SubLSymbol $ic179$;
    private static final SubLString $ic180$;
    private static final SubLString $ic181$;
    private static final SubLString $ic182$;
    private static final SubLString $ic183$;
    private static final SubLString $ic184$;
    private static final SubLString $ic185$;
    private static final SubLString $ic186$;
    private static final SubLString $ic187$;
    private static final SubLString $ic188$;
    private static final SubLString $ic189$;
    private static final SubLString $ic190$;
    private static final SubLSymbol $ic191$;
    private static final SubLString $ic192$;
    private static final SubLString $ic193$;
    private static final SubLSymbol $ic194$;
    private static final SubLSymbol $ic195$;
    private static final SubLString $ic196$;
    private static final SubLString $ic197$;
    private static final SubLString $ic198$;
    private static final SubLString $ic199$;
    private static final SubLString $ic200$;
    private static final SubLString $ic201$;
    private static final SubLString $ic202$;
    private static final SubLString $ic203$;
    private static final SubLString $ic204$;
    private static final SubLSymbol $ic205$;
    private static final SubLString $ic206$;
    private static final SubLSymbol $ic207$;
    private static final SubLString $ic208$;
    private static final SubLSymbol $ic209$;
    private static final SubLString $ic210$;
    private static final SubLSymbol $ic211$;
    private static final SubLString $ic212$;
    private static final SubLSymbol $ic213$;
    private static final SubLString $ic214$;
    private static final SubLSymbol $ic215$;
    private static final SubLString $ic216$;
    private static final SubLString $ic217$;
    private static final SubLString $ic218$;
    private static final SubLString $ic219$;
    private static final SubLSymbol $ic220$;
    private static final SubLString $ic221$;
    private static final SubLSymbol $ic222$;
    private static final SubLString $ic223$;
    private static final SubLString $ic224$;
    private static final SubLSymbol $ic225$;
    private static final SubLSymbol $ic226$;
    private static final SubLString $ic227$;
    private static final SubLString $ic228$;
    private static final SubLSymbol $ic229$;
    private static final SubLString $ic230$;
    private static final SubLString $ic231$;
    private static final SubLSymbol $ic232$;
    private static final SubLString $ic233$;
    private static final SubLSymbol $ic234$;
    private static final SubLString $ic235$;
    private static final SubLSymbol $ic236$;
    private static final SubLSymbol $ic237$;
    private static final SubLList $ic238$;
    private static final SubLString $ic239$;
    private static final SubLString $ic240$;
    private static final SubLSymbol $ic241$;
    private static final SubLString $ic242$;
    private static final SubLString $ic243$;
    private static final SubLString $ic244$;
    private static final SubLString $ic245$;
    private static final SubLString $ic246$;
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
    private static final SubLSymbol $ic260$;
    private static final SubLList $ic261$;
    private static final SubLString $ic262$;
    private static final SubLSymbol $ic263$;
    private static final SubLString $ic264$;
    private static final SubLString $ic265$;
    private static final SubLSymbol $ic266$;
    private static final SubLSymbol $ic267$;
    private static final SubLSymbol $ic268$;
    private static final SubLSymbol $ic269$;
    private static final SubLString $ic270$;
    private static final SubLString $ic271$;
    private static final SubLString $ic272$;
    private static final SubLObject $ic273$;
    private static final SubLString $ic274$;
    private static final SubLSymbol $ic275$;
    private static final SubLString $ic276$;
    private static final SubLObject $ic277$;
    private static final SubLString $ic278$;
    private static final SubLString $ic279$;
    private static final SubLSymbol $ic280$;
    private static final SubLString $ic281$;
    private static final SubLString $ic282$;
    private static final SubLString $ic283$;
    private static final SubLString $ic284$;
    private static final SubLString $ic285$;
    private static final SubLString $ic286$;
    private static final SubLString $ic287$;
    private static final SubLString $ic288$;
    private static final SubLString $ic289$;
    private static final SubLString $ic290$;
    private static final SubLList $ic291$;
    private static final SubLSymbol $ic292$;
    private static final SubLString $ic293$;
    private static final SubLString $ic294$;
    private static final SubLSymbol $ic295$;
    private static final SubLString $ic296$;
    private static final SubLString $ic297$;
    private static final SubLSymbol $ic298$;
    private static final SubLString $ic299$;
    private static final SubLString $ic300$;
    private static final SubLSymbol $ic301$;
    private static final SubLList $ic302$;
    private static final SubLString $ic303$;
    private static final SubLString $ic304$;
    private static final SubLString $ic305$;
    private static final SubLSymbol $ic306$;
    private static final SubLString $ic307$;
    private static final SubLString $ic308$;
    private static final SubLString $ic309$;
    private static final SubLString $ic310$;
    private static final SubLString $ic311$;
    private static final SubLSymbol $ic312$;
    private static final SubLList $ic313$;
    private static final SubLList $ic314$;
    private static final SubLString $ic315$;
    private static final SubLSymbol $ic316$;
    private static final SubLString $ic317$;
    private static final SubLString $ic318$;
    private static final SubLSymbol $ic319$;
    private static final SubLString $ic320$;
    private static final SubLSymbol $ic321$;
    private static final SubLString $ic322$;
    private static final SubLString $ic323$;
    private static final SubLSymbol $ic324$;
    private static final SubLString $ic325$;
    private static final SubLString $ic326$;
    private static final SubLSymbol $ic327$;
    private static final SubLString $ic328$;
    private static final SubLString $ic329$;
    private static final SubLSymbol $ic330$;
    private static final SubLString $ic331$;
    private static final SubLString $ic332$;
    private static final SubLSymbol $ic333$;
    private static final SubLString $ic334$;
    private static final SubLString $ic335$;
    private static final SubLSymbol $ic336$;
    private static final SubLString $ic337$;
    private static final SubLString $ic338$;
    private static final SubLSymbol $ic339$;
    private static final SubLString $ic340$;
    private static final SubLString $ic341$;
    private static final SubLSymbol $ic342$;
    private static final SubLString $ic343$;
    private static final SubLList $ic344$;
    private static final SubLString $ic345$;
    private static final SubLSymbol $ic346$;
    private static final SubLString $ic347$;
    private static final SubLString $ic348$;
    private static final SubLSymbol $ic349$;
    private static final SubLString $ic350$;
    private static final SubLList $ic351$;
    private static final SubLString $ic352$;
    private static final SubLString $ic353$;
    private static final SubLSymbol $ic354$;
    private static final SubLString $ic355$;
    private static final SubLSymbol $ic356$;
    private static final SubLString $ic357$;
    private static final SubLString $ic358$;
    private static final SubLString $ic359$;
    private static final SubLString $ic360$;
    private static final SubLString $ic361$;
    private static final SubLSymbol $ic362$;
    private static final SubLString $ic363$;
    private static final SubLString $ic364$;
    private static final SubLSymbol $ic365$;
    private static final SubLString $ic366$;
    private static final SubLSymbol $ic367$;
    private static final SubLString $ic368$;
    private static final SubLString $ic369$;
    private static final SubLSymbol $ic370$;
    private static final SubLString $ic371$;
    private static final SubLString $ic372$;
    private static final SubLString $ic373$;
    private static final SubLSymbol $ic374$;
    private static final SubLString $ic375$;
    private static final SubLSymbol $ic376$;
    private static final SubLSymbol $ic377$;
    private static final SubLSymbol $ic378$;
    private static final SubLString $ic379$;
    private static final SubLSymbol $ic380$;
    private static final SubLSymbol $ic381$;
    private static final SubLSymbol $ic382$;
    private static final SubLSymbol $ic383$;
    private static final SubLString $ic384$;
    private static final SubLSymbol $ic385$;
    private static final SubLString $ic386$;
    private static final SubLString $ic387$;
    private static final SubLSymbol $ic388$;
    private static final SubLString $ic389$;
    private static final SubLSymbol $ic390$;
    private static final SubLString $ic391$;
    private static final SubLSymbol $ic392$;
    private static final SubLString $ic393$;
    private static final SubLString $ic394$;
    private static final SubLSymbol $ic395$;
    private static final SubLString $ic396$;
    private static final SubLSymbol $ic397$;
    private static final SubLSymbol $ic398$;
    private static final SubLSymbol $ic399$;
    private static final SubLSymbol $ic400$;
    private static final SubLString $ic401$;
    private static final SubLString $ic402$;
    private static final SubLSymbol $ic403$;
    private static final SubLSymbol $ic404$;
    private static final SubLString $ic405$;
    private static final SubLString $ic406$;
    private static final SubLSymbol $ic407$;
    private static final SubLString $ic408$;
    private static final SubLString $ic409$;
    private static final SubLSymbol $ic410$;
    private static final SubLString $ic411$;
    private static final SubLString $ic412$;
    private static final SubLString $ic413$;
    private static final SubLString $ic414$;
    private static final SubLSymbol $ic415$;
    private static final SubLSymbol $ic416$;
    private static final SubLString $ic417$;
    private static final SubLSymbol $ic418$;
    private static final SubLInteger $ic419$;
    private static final SubLString $ic420$;
    private static final SubLSymbol $ic421$;
    private static final SubLSymbol $ic422$;
    private static final SubLSymbol $ic423$;
    private static final SubLSymbol $ic424$;
    private static final SubLSymbol $ic425$;
    private static final SubLString $ic426$;
    private static final SubLString $ic427$;
    private static final SubLString $ic428$;
    private static final SubLString $ic429$;
    private static final SubLSymbol $ic430$;
    private static final SubLSymbol $ic431$;
    private static final SubLSymbol $ic432$;
    private static final SubLString $ic433$;
    private static final SubLString $ic434$;
    private static final SubLString $ic435$;
    private static final SubLSymbol $ic436$;
    private static final SubLString $ic437$;
    private static final SubLString $ic438$;
    private static final SubLSymbol $ic439$;
    private static final SubLInteger $ic440$;
    private static final SubLString $ic441$;
    private static final SubLSymbol $ic442$;
    private static final SubLSymbol $ic443$;
    private static final SubLString $ic444$;
    private static final SubLString $ic445$;
    private static final SubLSymbol $ic446$;
    private static final SubLSymbol $ic447$;
    private static final SubLSymbol $ic448$;
    private static final SubLSymbol $ic449$;
    private static final SubLString $ic450$;
    private static final SubLString $ic451$;
    private static final SubLSymbol $ic452$;
    private static final SubLSymbol $ic453$;
    private static final SubLSymbol $ic454$;
    private static final SubLSymbol $ic455$;
    private static final SubLString $ic456$;
    private static final SubLString $ic457$;
    private static final SubLSymbol $ic458$;
    private static final SubLSymbol $ic459$;
    private static final SubLString $ic460$;
    private static final SubLString $ic461$;
    private static final SubLString $ic462$;
    private static final SubLSymbol $ic463$;
    private static final SubLString $ic464$;
    private static final SubLString $ic465$;
    private static final SubLSymbol $ic466$;
    private static final SubLString $ic467$;
    private static final SubLString $ic468$;
    private static final SubLString $ic469$;
    private static final SubLSymbol $ic470$;
    private static final SubLString $ic471$;
    private static final SubLSymbol $ic472$;
    private static final SubLSymbol $ic473$;
    private static final SubLString $ic474$;
    private static final SubLString $ic475$;
    private static final SubLString $ic476$;
    private static final SubLString $ic477$;
    private static final SubLObject $ic478$;
    private static final SubLString $ic479$;
    private static final SubLInteger $ic480$;
    private static final SubLString $ic481$;
    private static final SubLObject $ic482$;
    private static final SubLString $ic483$;
    private static final SubLString $ic484$;
    private static final SubLSymbol $ic485$;
    private static final SubLObject $ic486$;
    private static final SubLString $ic487$;
    private static final SubLString $ic488$;
    private static final SubLSymbol $ic489$;
    private static final SubLSymbol $ic490$;
    private static final SubLSymbol $ic491$;
    private static final SubLSymbol $ic492$;
    private static final SubLSymbol $ic493$;
    private static final SubLSymbol $ic494$;
    private static final SubLString $ic495$;
    private static final SubLSymbol $ic496$;
    private static final SubLString $ic497$;
    private static final SubLSymbol $ic498$;
    private static final SubLString $ic499$;
    private static final SubLSymbol $ic500$;
    private static final SubLString $ic501$;
    private static final SubLString $ic502$;
    private static final SubLString $ic503$;
    private static final SubLString $ic504$;
    private static final SubLString $ic505$;
    private static final SubLString $ic506$;
    private static final SubLString $ic507$;
    private static final SubLString $ic508$;
    private static final SubLString $ic509$;
    private static final SubLString $ic510$;
    private static final SubLString $ic511$;
    private static final SubLString $ic512$;
    private static final SubLString $ic513$;
    private static final SubLString $ic514$;
    private static final SubLSymbol $ic515$;
    private static final SubLObject $ic516$;
    private static final SubLObject $ic517$;
    private static final SubLList $ic518$;
    private static final SubLSymbol $ic519$;
    private static final SubLString $ic520$;
    private static final SubLSymbol $ic521$;
    private static final SubLString $ic522$;
    private static final SubLSymbol $ic523$;

    public static SubLObject f40606(final SubLObject var1) {
        final SubLThread var2 = SubLProcess.currentSubLThread();
        module0642.f39020((SubLObject)$ic0$);
        module0642.f39029((SubLObject)UNPROVIDED);
        module0642.f39020(module0015.$g155$.getGlobalValue());
        SubLObject var3 = module0016.$g568$.currentBinding(var2);
        try {
            module0016.$g568$.bind((SubLObject)ZERO_INTEGER, var2);
            module0016.f936();
            module0642.f39020(module0016.$g569$.getGlobalValue());
            module0642.f39020(module0015.$g153$.getGlobalValue());
            module0015.f718();
            module0655.f39766();
            module0642.f39064(module0655.$g5143$.getDynamicValue(var2), module0655.$g5142$.getDynamicValue(var2));
            final SubLObject var4 = module0014.f672((SubLObject)$ic1$);
            module0642.f39029((SubLObject)UNPROVIDED);
            module0642.f39020(module0015.$g175$.getGlobalValue());
            module0642.f39020(module0015.$g176$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
            module0642.f39020((SubLObject)$ic2$);
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
            if (NIL != var4) {
                module0642.f39020(module0015.$g178$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                module0642.f39020(var4);
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
            }
            module0642.f39020(module0015.$g177$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
            module0642.f39020((SubLObject)$ic3$);
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
            module0016.f892();
            module0016.f895();
            module0016.f893();
            module0642.f39020(module0015.$g154$.getGlobalValue());
            module0642.f39029((SubLObject)UNPROVIDED);
        }
        finally {
            module0016.$g568$.rebind(var3, var2);
        }
        var3 = module0015.$g535$.currentBinding(var2);
        try {
            module0015.$g535$.bind((SubLObject)T, var2);
            module0642.f39020(module0015.$g133$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
            final SubLObject var3_5 = module0015.$g533$.currentBinding(var2);
            try {
                module0015.$g533$.bind((SubLObject)T, var2);
                f40607(var1);
                module0642.f39029((SubLObject)UNPROVIDED);
            }
            finally {
                module0015.$g533$.rebind(var3_5, var2);
            }
            module0642.f39020(module0015.$g134$.getGlobalValue());
            module0642.f39029((SubLObject)UNPROVIDED);
        }
        finally {
            module0015.$g535$.rebind(var3, var2);
        }
        module0642.f39020(module0015.$g156$.getGlobalValue());
        module0642.f39029((SubLObject)UNPROVIDED);
        return (SubLObject)NIL;
    }

    public static SubLObject f40608(final SubLObject var1) {
        if (NIL != var1) {
            return f40607(var1);
        }
        return module0660.f40183();
    }

    public static SubLObject f40607(final SubLObject var1) {
        final SubLThread var2 = SubLProcess.currentSubLThread();
        if (NIL != module0223.f14667(var1)) {
            module0642.f39020(module0015.$g234$.getGlobalValue());
            module0642.f39020(module0015.$g207$.getGlobalValue());
            module0656.f39837((SubLObject)$ic6$, var1, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
            module0642.f39020(module0015.$g208$.getGlobalValue());
            module0642.f39020(module0015.$g235$.getGlobalValue());
            module0642.f39051((SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
            module0656.f39870((SubLObject)$ic4$, (SubLObject)$ic7$, (SubLObject)UNPROVIDED);
        }
        else if (NIL != module0173.f10955(var1)) {
            f40609(var1, (SubLObject)$ic8$);
            module0642.f39051((SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
            module0656.f39870((SubLObject)$ic4$, (SubLObject)$ic7$, (SubLObject)UNPROVIDED);
        }
        if (NIL != module0223.f14667(var1)) {
            if (f40610(var1).numG((SubLObject)ZERO_INTEGER) && $ic9$ == module0018.$g707$.getDynamicValue(var2)) {
                f40611(var1);
                module0642.f39051((SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
            }
            module0642.f39020(module0015.$g459$.getGlobalValue());
            module0642.f39032((SubLObject)ZERO_INTEGER);
            module0656.f39837((SubLObject)$ic10$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
            module0642.f39020(module0015.$g460$.getGlobalValue());
        }
        else if (NIL != module0173.f10955(var1)) {
            module0673.f41080(var1);
            module0642.f39051((SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
            module0642.f39020(module0015.$g459$.getGlobalValue());
            module0642.f39032((SubLObject)ZERO_INTEGER);
            module0656.f39837((SubLObject)$ic11$, var1, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
            module0642.f39020(module0015.$g460$.getGlobalValue());
            module0642.f39026((SubLObject)UNPROVIDED);
            module0642.f39020(module0015.$g459$.getGlobalValue());
            module0642.f39032((SubLObject)ZERO_INTEGER);
            module0656.f39837((SubLObject)$ic12$, var1, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
            module0642.f39020(module0015.$g460$.getGlobalValue());
            module0656.f39837((SubLObject)$ic13$, var1, (SubLObject)T, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
            module0642.f39026((SubLObject)UNPROVIDED);
            module0642.f39020(module0015.$g459$.getGlobalValue());
            module0642.f39032((SubLObject)ZERO_INTEGER);
            if (NIL != module0167.f10813(var1)) {
                module0656.f39837((SubLObject)$ic14$, var1, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
            }
            else if (NIL != constant_handles_oc.f8449(var1)) {
                module0656.f39837((SubLObject)$ic15$, var1, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
            }
            module0642.f39020(module0015.$g460$.getGlobalValue());
            module0642.f39026((SubLObject)UNPROVIDED);
            module0642.f39020(module0015.$g459$.getGlobalValue());
            module0642.f39032((SubLObject)ZERO_INTEGER);
            module0656.f39837((SubLObject)$ic16$, var1, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
            module0642.f39020(module0015.$g460$.getGlobalValue());
            module0642.f39026((SubLObject)UNPROVIDED);
            module0642.f39020(module0015.$g459$.getGlobalValue());
            module0642.f39032((SubLObject)ZERO_INTEGER);
            f40612(var1, (SubLObject)UNPROVIDED);
            module0642.f39020(module0015.$g460$.getGlobalValue());
            if (NIL == module0677.f41295()) {
                module0016.f939((SubLObject)ConsesLow.list(new SubLObject[] { $ic17$, $ic18$, $ic19$, ConsesLow.list(reader.bq_cons((SubLObject)$ic20$, var1)), $ic21$, $ic22$, $ic23$, $ic24$, $ic25$, $ic26$ }));
            }
        }
        module0642.f39051((SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        if (NIL == module0223.f14667(var1)) {
            final SubLObject var3 = module0617.f37893(var1);
            module0642.f39020(module0015.$g459$.getGlobalValue());
            module0642.f39032((SubLObject)ZERO_INTEGER);
            module0656.f39837((SubLObject)$ic27$, var1, var3, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
            module0642.f39020(module0015.$g460$.getGlobalValue());
            f40613(var1);
            module0642.f39026((SubLObject)UNPROVIDED);
            module0642.f39020(module0015.$g459$.getGlobalValue());
            module0642.f39032((SubLObject)ZERO_INTEGER);
            module0656.f39837((SubLObject)$ic28$, var1, (SubLObject)$ic29$, (SubLObject)$ic30$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
            module0642.f39020(module0015.$g460$.getGlobalValue());
            module0642.f39051((SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        }
        f40614(var1);
        module0642.f39051((SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        return (SubLObject)NIL;
    }

    public static SubLObject f40609(final SubLObject var8, SubLObject var9) {
        if (var9 == UNPROVIDED) {
            var9 = (SubLObject)NIL;
        }
        final SubLThread var10 = SubLProcess.currentSubLThread();
        module0642.f39020(module0015.$g346$.getGlobalValue());
        module0642.f39046(module0015.$g348$.getGlobalValue());
        module0642.f39046(module0015.$g349$.getGlobalValue());
        module0642.f39020(module0015.$g352$.getGlobalValue());
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        module0642.f39020((SubLObject)ZERO_INTEGER);
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
        final SubLObject var11 = module0015.$g533$.currentBinding(var10);
        try {
            module0015.$g533$.bind((SubLObject)T, var10);
            module0642.f39020(module0015.$g364$.getGlobalValue());
            module0642.f39020(module0015.$g370$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
            module0642.f39020((SubLObject)$ic34$);
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
            module0642.f39020(module0015.$g373$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
            module0642.f39020(module0642.f39049((SubLObject)$ic35$));
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
            final SubLObject var3_10 = module0015.$g533$.currentBinding(var10);
            try {
                module0015.$g533$.bind((SubLObject)T, var10);
                module0642.f39020(module0015.$g360$.getGlobalValue());
                module0642.f39046(module0015.$g369$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                final SubLObject var3_11 = module0015.$g533$.currentBinding(var10);
                try {
                    module0015.$g533$.bind((SubLObject)T, var10);
                    if (NIL != constant_handles_oc.f8449(var8)) {
                        module0642.f39020(module0015.$g234$.getGlobalValue());
                        module0656.f39915(var8, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                        module0642.f39020(module0015.$g235$.getGlobalValue());
                    }
                    else {
                        module0642.f39020(module0015.$g234$.getGlobalValue());
                        module0642.f39020(module0015.$g230$.getGlobalValue());
                        module0642.f39020(module0015.$g459$.getGlobalValue());
                        module0656.f39915(var8, (SubLObject)ZERO_INTEGER, (SubLObject)T);
                        module0642.f39020(module0015.$g460$.getGlobalValue());
                        module0642.f39020(module0015.$g231$.getGlobalValue());
                        module0642.f39020(module0015.$g235$.getGlobalValue());
                    }
                }
                finally {
                    module0015.$g533$.rebind(var3_11, var10);
                }
                module0642.f39020(module0015.$g361$.getGlobalValue());
            }
            finally {
                module0015.$g533$.rebind(var3_10, var10);
            }
            module0642.f39020(module0015.$g365$.getGlobalValue());
            module0642.f39029((SubLObject)UNPROVIDED);
            module0642.f39020(module0015.$g364$.getGlobalValue());
            module0642.f39020(module0015.$g370$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
            module0642.f39020((SubLObject)$ic34$);
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
            module0642.f39020(module0015.$g373$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
            module0642.f39020(module0642.f39049((SubLObject)$ic35$));
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
            final SubLObject var3_12 = module0015.$g533$.currentBinding(var10);
            try {
                module0015.$g533$.bind((SubLObject)T, var10);
                module0642.f39020(module0015.$g360$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                final SubLObject var3_13 = module0015.$g533$.currentBinding(var10);
                try {
                    module0015.$g533$.bind((SubLObject)T, var10);
                }
                finally {
                    module0015.$g533$.rebind(var3_13, var10);
                }
                module0642.f39020(module0015.$g361$.getGlobalValue());
            }
            finally {
                module0015.$g533$.rebind(var3_12, var10);
            }
            module0642.f39020(module0015.$g365$.getGlobalValue());
            module0642.f39029((SubLObject)UNPROVIDED);
            module0642.f39020(module0015.$g364$.getGlobalValue());
            module0642.f39020(module0015.$g370$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
            module0642.f39020((SubLObject)$ic34$);
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
            module0642.f39020(module0015.$g373$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
            module0642.f39020(module0642.f39049((SubLObject)$ic35$));
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
            final SubLObject var3_14 = module0015.$g533$.currentBinding(var10);
            try {
                module0015.$g533$.bind((SubLObject)T, var10);
                module0642.f39020(module0015.$g360$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                final SubLObject var3_15 = module0015.$g533$.currentBinding(var10);
                try {
                    module0015.$g533$.bind((SubLObject)T, var10);
                    module0642.f39020(module0015.$g346$.getGlobalValue());
                    module0642.f39020(module0015.$g353$.getGlobalValue());
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                    module0642.f39020((SubLObject)ZERO_INTEGER);
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                    module0642.f39020(module0015.$g354$.getGlobalValue());
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                    module0642.f39020((SubLObject)ZERO_INTEGER);
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                    module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                    final SubLObject var3_16 = module0015.$g533$.currentBinding(var10);
                    try {
                        module0015.$g533$.bind((SubLObject)T, var10);
                        module0642.f39020(module0015.$g364$.getGlobalValue());
                        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                        final SubLObject var3_17 = module0015.$g533$.currentBinding(var10);
                        try {
                            module0015.$g533$.bind((SubLObject)T, var10);
                            SubLObject var12 = $g5278$.getGlobalValue();
                            SubLObject var13 = (SubLObject)NIL;
                            var13 = var12.first();
                            while (NIL != var12) {
                                final SubLObject var14 = module0659.f40104(var13);
                                if (NIL != module0659.f40068(var14)) {
                                    if (var13.eql(var9)) {
                                        module0642.f39020(module0015.$g360$.getGlobalValue());
                                        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                                        final SubLObject var3_18 = module0015.$g533$.currentBinding(var10);
                                        try {
                                            module0015.$g533$.bind((SubLObject)T, var10);
                                            module0642.f39020(module0015.$g346$.getGlobalValue());
                                            module0642.f39020(module0015.$g352$.getGlobalValue());
                                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                                            module0642.f39020((SubLObject)ONE_INTEGER);
                                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                                            module0642.f39020(module0015.$g353$.getGlobalValue());
                                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                                            module0642.f39020((SubLObject)ONE_INTEGER);
                                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                                            module0642.f39020(module0015.$g354$.getGlobalValue());
                                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                                            module0642.f39020((SubLObject)ZERO_INTEGER);
                                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                                            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                                            final SubLObject var3_19 = module0015.$g533$.currentBinding(var10);
                                            try {
                                                module0015.$g533$.bind((SubLObject)T, var10);
                                                module0642.f39020(module0015.$g364$.getGlobalValue());
                                                module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                                                final SubLObject var3_20 = module0015.$g533$.currentBinding(var10);
                                                try {
                                                    module0015.$g533$.bind((SubLObject)T, var10);
                                                    module0642.f39020(module0015.$g360$.getGlobalValue());
                                                    module0642.f39020(module0015.$g374$.getGlobalValue());
                                                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                                                    module0642.f39020((SubLObject)$ic36$);
                                                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                                                    module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                                                    final SubLObject var3_21 = module0015.$g533$.currentBinding(var10);
                                                    try {
                                                        module0015.$g533$.bind((SubLObject)T, var10);
                                                        module0659.f40112(var14, (SubLObject)$ic7$, var8, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                                                    }
                                                    finally {
                                                        module0015.$g533$.rebind(var3_21, var10);
                                                    }
                                                    module0642.f39020(module0015.$g361$.getGlobalValue());
                                                }
                                                finally {
                                                    module0015.$g533$.rebind(var3_20, var10);
                                                }
                                                module0642.f39020(module0015.$g365$.getGlobalValue());
                                                module0642.f39029((SubLObject)UNPROVIDED);
                                            }
                                            finally {
                                                module0015.$g533$.rebind(var3_19, var10);
                                            }
                                            module0642.f39020(module0015.$g347$.getGlobalValue());
                                        }
                                        finally {
                                            module0015.$g533$.rebind(var3_18, var10);
                                        }
                                        module0642.f39020(module0015.$g361$.getGlobalValue());
                                    }
                                    else if (NIL != module0659.f40114(var14, var8, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)) {
                                        module0642.f39020(module0015.$g360$.getGlobalValue());
                                        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                                        final SubLObject var3_22 = module0015.$g533$.currentBinding(var10);
                                        try {
                                            module0015.$g533$.bind((SubLObject)T, var10);
                                            module0659.f40112(var14, (SubLObject)$ic7$, var8, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                                        }
                                        finally {
                                            module0015.$g533$.rebind(var3_22, var10);
                                        }
                                        module0642.f39020(module0015.$g361$.getGlobalValue());
                                    }
                                    else {
                                        module0642.f39020(module0015.$g360$.getGlobalValue());
                                        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                                        final SubLObject var3_23 = module0015.$g533$.currentBinding(var10);
                                        try {
                                            module0015.$g533$.bind((SubLObject)T, var10);
                                            module0659.f40111(var14, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                                        }
                                        finally {
                                            module0015.$g533$.rebind(var3_23, var10);
                                        }
                                        module0642.f39020(module0015.$g361$.getGlobalValue());
                                    }
                                    module0642.f39020(module0015.$g360$.getGlobalValue());
                                    module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                                    final SubLObject var3_24 = module0015.$g533$.currentBinding(var10);
                                    try {
                                        module0015.$g533$.bind((SubLObject)T, var10);
                                        module0642.f39027((SubLObject)$ic37$, (SubLObject)UNPROVIDED);
                                    }
                                    finally {
                                        module0015.$g533$.rebind(var3_24, var10);
                                    }
                                    module0642.f39020(module0015.$g361$.getGlobalValue());
                                }
                                var12 = var12.rest();
                                var13 = var12.first();
                            }
                        }
                        finally {
                            module0015.$g533$.rebind(var3_17, var10);
                        }
                        module0642.f39020(module0015.$g365$.getGlobalValue());
                        module0642.f39029((SubLObject)UNPROVIDED);
                    }
                    finally {
                        module0015.$g533$.rebind(var3_16, var10);
                    }
                    module0642.f39020(module0015.$g347$.getGlobalValue());
                }
                finally {
                    module0015.$g533$.rebind(var3_15, var10);
                }
                module0642.f39020(module0015.$g361$.getGlobalValue());
            }
            finally {
                module0015.$g533$.rebind(var3_14, var10);
            }
            module0642.f39020(module0015.$g365$.getGlobalValue());
            module0642.f39029((SubLObject)UNPROVIDED);
        }
        finally {
            module0015.$g533$.rebind(var11, var10);
        }
        module0642.f39020(module0015.$g347$.getGlobalValue());
        return (SubLObject)NIL;
    }

    public static SubLObject f40612(final SubLObject var1, SubLObject var28) {
        if (var28 == UNPROVIDED) {
            var28 = (SubLObject)$ic38$;
        }
        return (SubLObject)NIL;
    }

    public static SubLObject f40613(final SubLObject var1) {
        f40615(var1);
        return (SubLObject)NIL;
    }

    public static SubLObject f40615(final SubLObject var1) {
        final SubLObject var2 = module0617.f37889(var1);
        if (var2.isPositive()) {
            module0642.f39026((SubLObject)UNPROVIDED);
            module0642.f39020(module0015.$g459$.getGlobalValue());
            module0642.f39032((SubLObject)ZERO_INTEGER);
            module0656.f39837((SubLObject)$ic39$, var1, var2, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
            module0642.f39020(module0015.$g460$.getGlobalValue());
        }
        return (SubLObject)NIL;
    }

    public static SubLObject f40614(final SubLObject var1) {
        module0656.f39837((SubLObject)$ic40$, var1, f40610(var1), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        if (NIL != module0223.f14667(var1)) {
            f40616(var1);
        }
        else if (NIL != module0173.f10955(var1)) {
            f40617(var1);
        }
        else if (NIL != module0210.f13595(var1, (SubLObject)UNPROVIDED)) {
            module0663.f40342(var1);
        }
        return (SubLObject)NIL;
    }

    public static SubLObject f40616(final SubLObject var1) {
        if (var1.eql(module0223.f14674())) {
            f40618();
        }
        else {
            module0656.f39789((SubLObject)$ic41$, var1, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        }
        return (SubLObject)NIL;
    }

    public static SubLObject f40617(final SubLObject var6) {
        f40619(var6);
        f40620(var6);
        return (SubLObject)NIL;
    }

    public static SubLObject f40620(final SubLObject var8) {
        f40621(var8);
        if (NIL != module0269.f17715(var8)) {
            f40622(var8);
            f40623(var8);
            f40624(var8);
        }
        else if (NIL != module0269.f17723(var8)) {
            f40625(var8);
            f40626(var8);
        }
        else if (NIL != module0269.f17709(var8)) {
            f40627(var8);
            f40628(var8);
            f40629(var8);
        }
        else if (NIL != module0269.f17730(var8)) {
            f40630(var8);
        }
        f40631(var8);
        if (NIL != module0269.f17730(var8)) {
            f40632(var8);
        }
        return (SubLObject)NIL;
    }

    public static SubLObject f40619(final SubLObject var1) {
        final SubLObject var2 = f40633(var1, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        if (var2.numG((SubLObject)ZERO_INTEGER)) {
            module0642.f39026((SubLObject)UNPROVIDED);
            module0642.f39020(module0015.$g459$.getGlobalValue());
            module0642.f39032((SubLObject)ZERO_INTEGER);
            module0656.f39837((SubLObject)$ic42$, var1, var2, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
            module0642.f39020(module0015.$g460$.getGlobalValue());
            module0642.f39026((SubLObject)UNPROVIDED);
            SubLObject var4;
            final SubLObject var3 = var4 = f40634(var1, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
            SubLObject var5 = (SubLObject)NIL;
            var5 = var4.first();
            while (NIL != var4) {
                f40635(var1, var5);
                var4 = var4.rest();
                var5 = var4.first();
            }
        }
        return (SubLObject)NIL;
    }

    public static SubLObject f40635(final SubLObject var1, final SubLObject var32) {
        final SubLThread var33 = SubLProcess.currentSubLThread();
        final SubLObject var34 = f40633(var1, var32, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        if (var34.numG((SubLObject)ZERO_INTEGER)) {
            final SubLObject var35 = f40636(var32, (SubLObject)UNPROVIDED);
            module0642.f39020(module0015.$g459$.getGlobalValue());
            module0642.f39032((SubLObject)ZERO_INTEGER);
            module0016.f923(var35, (SubLObject)$ic43$);
            module0656.f39837((SubLObject)$ic42$, var1, var34, var32, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
            module0642.f39020(module0015.$g460$.getGlobalValue());
            module0642.f39026((SubLObject)UNPROVIDED);
            final SubLObject var36 = f40634(var1, var32, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
            module0016.f908(var35, (SubLObject)$ic44$, (SubLObject)$ic45$);
            module0642.f39020(module0015.$g144$.getGlobalValue());
            if (NIL != var35) {
                module0642.f39020(module0015.$g157$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                module0642.f39020(var35);
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
            }
            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
            final SubLObject var37 = module0015.$g533$.currentBinding(var33);
            try {
                module0015.$g533$.bind((SubLObject)T, var33);
                SubLObject var38 = var36;
                SubLObject var39 = (SubLObject)NIL;
                var39 = var38.first();
                while (NIL != var38) {
                    f40637(var1, var32, var39);
                    var38 = var38.rest();
                    var39 = var38.first();
                }
            }
            finally {
                module0015.$g533$.rebind(var37, var33);
            }
            module0642.f39020(module0015.$g145$.getGlobalValue());
            module0642.f39029((SubLObject)UNPROVIDED);
        }
        return (SubLObject)NIL;
    }

    public static SubLObject f40637(final SubLObject var1, final SubLObject var32, final SubLObject var35) {
        final SubLThread var36 = SubLProcess.currentSubLThread();
        final SubLObject var37 = f40633(var1, var32, var35, (SubLObject)UNPROVIDED);
        if (var37.numG((SubLObject)ZERO_INTEGER)) {
            final SubLObject var38 = f40634(var1, var32, var35, (SubLObject)UNPROVIDED);
            final SubLObject var39 = f40636(var32, var35);
            module0642.f39020(module0015.$g459$.getGlobalValue());
            module0642.f39032((SubLObject)TWO_INTEGER);
            if (Sequences.length(var38).numLE((SubLObject)ONE_INTEGER)) {
                module0016.f927();
            }
            else {
                module0016.f923(var39, (SubLObject)$ic43$);
            }
            module0656.f39837((SubLObject)$ic42$, var1, var37, var32, var35, (SubLObject)UNPROVIDED);
            module0659.f40116((SubLObject)$ic46$, (SubLObject)$ic7$, var1, var32, var35, (SubLObject)NIL);
            module0659.f40116((SubLObject)$ic47$, (SubLObject)$ic48$, var1, var32, var35, (SubLObject)NIL);
            module0642.f39020(module0015.$g460$.getGlobalValue());
            module0642.f39026((SubLObject)UNPROVIDED);
            if (!Sequences.length(var38).numLE((SubLObject)ONE_INTEGER)) {
                module0016.f908(var39, (SubLObject)$ic49$, (SubLObject)$ic45$);
                module0642.f39020(module0015.$g144$.getGlobalValue());
                if (NIL != var39) {
                    module0642.f39020(module0015.$g157$.getGlobalValue());
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                    module0642.f39020(var39);
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                }
                module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                final SubLObject var40 = module0015.$g533$.currentBinding(var36);
                try {
                    module0015.$g533$.bind((SubLObject)T, var36);
                    SubLObject var41 = var38;
                    SubLObject var42 = (SubLObject)NIL;
                    var42 = var41.first();
                    while (NIL != var41) {
                        f40638(var1, var32, var35, var42);
                        var41 = var41.rest();
                        var42 = var41.first();
                    }
                }
                finally {
                    module0015.$g533$.rebind(var40, var36);
                }
                module0642.f39020(module0015.$g145$.getGlobalValue());
                module0642.f39029((SubLObject)UNPROVIDED);
            }
        }
        return (SubLObject)NIL;
    }

    public static SubLObject f40636(final SubLObject var32, SubLObject var35) {
        if (var35 == UNPROVIDED) {
            var35 = (SubLObject)NIL;
        }
        if (NIL != var35) {
            return PrintLow.format((SubLObject)NIL, (SubLObject)$ic50$, module0656.f39842(var35), var32);
        }
        return PrintLow.format((SubLObject)NIL, (SubLObject)$ic51$, var32);
    }

    public static SubLObject f40638(final SubLObject var1, final SubLObject var32, final SubLObject var35, final SubLObject var37) {
        final SubLObject var38 = f40633(var1, var32, var35, var37);
        if (var38.numG((SubLObject)ZERO_INTEGER)) {
            module0642.f39020(module0015.$g459$.getGlobalValue());
            module0642.f39032((SubLObject)SIX_INTEGER);
            module0642.f39020(module0015.$g230$.getGlobalValue());
            module0656.f39837((SubLObject)$ic42$, var1, var38, var32, var35, var37);
            module0642.f39020(module0015.$g231$.getGlobalValue());
            module0659.f40116((SubLObject)$ic46$, (SubLObject)$ic7$, var1, var32, var35, var37);
            module0659.f40116((SubLObject)$ic47$, (SubLObject)$ic48$, var1, var32, var35, var37);
            module0642.f39020(module0015.$g460$.getGlobalValue());
            module0642.f39026((SubLObject)UNPROVIDED);
        }
        return (SubLObject)NIL;
    }

    public static SubLObject f40621(final SubLObject var1) {
        final SubLObject var2 = f40639(var1, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        if (var2.numG((SubLObject)ZERO_INTEGER)) {
            module0642.f39051((SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
            module0642.f39020(module0015.$g459$.getGlobalValue());
            module0642.f39032((SubLObject)ZERO_INTEGER);
            module0656.f39837((SubLObject)$ic52$, var1, var2, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
            module0642.f39020(module0015.$g460$.getGlobalValue());
            module0642.f39026((SubLObject)UNPROVIDED);
            SubLObject var4;
            final SubLObject var3 = var4 = f40640(var1, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
            SubLObject var5 = (SubLObject)NIL;
            var5 = var4.first();
            while (NIL != var4) {
                f40641(var1, var5);
                var4 = var4.rest();
                var5 = var4.first();
            }
        }
        return (SubLObject)NIL;
    }

    public static SubLObject f40641(final SubLObject var1, final SubLObject var32) {
        final SubLThread var33 = SubLProcess.currentSubLThread();
        final SubLObject var34 = f40639(var1, var32, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        if (var34.numG((SubLObject)ZERO_INTEGER)) {
            final SubLObject var35 = f40642(var32);
            module0642.f39020(module0015.$g459$.getGlobalValue());
            module0642.f39032((SubLObject)ZERO_INTEGER);
            module0016.f923(var35, (SubLObject)$ic43$);
            module0656.f39837((SubLObject)$ic52$, var1, var34, var32, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
            module0642.f39020(module0015.$g460$.getGlobalValue());
            module0642.f39026((SubLObject)UNPROVIDED);
            final SubLObject var36 = f40640(var1, var32, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
            module0016.f908(var35, (SubLObject)$ic49$, (SubLObject)$ic45$);
            module0642.f39020(module0015.$g144$.getGlobalValue());
            if (NIL != var35) {
                module0642.f39020(module0015.$g157$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                module0642.f39020(var35);
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
            }
            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
            final SubLObject var37 = module0015.$g533$.currentBinding(var33);
            try {
                module0015.$g533$.bind((SubLObject)T, var33);
                SubLObject var38 = var36;
                SubLObject var39 = (SubLObject)NIL;
                var39 = var38.first();
                while (NIL != var38) {
                    f40643(var1, var32, var39);
                    var38 = var38.rest();
                    var39 = var38.first();
                }
            }
            finally {
                module0015.$g533$.rebind(var37, var33);
            }
            module0642.f39020(module0015.$g145$.getGlobalValue());
            module0642.f39029((SubLObject)UNPROVIDED);
        }
        return (SubLObject)NIL;
    }

    public static SubLObject f40642(final SubLObject var32) {
        return PrintLow.format((SubLObject)NIL, (SubLObject)$ic53$, var32);
    }

    public static SubLObject f40643(final SubLObject var1, final SubLObject var32, final SubLObject var40) {
        final SubLObject var41 = f40639(var1, var32, var40, (SubLObject)UNPROVIDED);
        if (var41.numG((SubLObject)ZERO_INTEGER)) {
            module0642.f39020(module0015.$g459$.getGlobalValue());
            module0642.f39032((SubLObject)FOUR_INTEGER);
            module0656.f39837((SubLObject)$ic52$, var1, var41, var32, var40, (SubLObject)UNPROVIDED);
            module0659.f40116((SubLObject)$ic54$, (SubLObject)$ic7$, var1, var32, var40, module0132.$g1558$.getGlobalValue());
            module0659.f40116((SubLObject)$ic55$, (SubLObject)$ic48$, var1, var32, var40, module0132.$g1558$.getGlobalValue());
            module0642.f39020(module0015.$g460$.getGlobalValue());
            module0642.f39026((SubLObject)UNPROVIDED);
        }
        return (SubLObject)NIL;
    }

    public static SubLObject f40622(final SubLObject var41) {
        final SubLThread var42 = SubLProcess.currentSubLThread();
        final SubLObject var43 = f40644(var41, (SubLObject)UNPROVIDED);
        if (var43.numG((SubLObject)ZERO_INTEGER)) {
            module0642.f39051((SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
            final SubLObject var44 = (SubLObject)$ic56$;
            module0642.f39020(module0015.$g459$.getGlobalValue());
            module0642.f39032((SubLObject)ZERO_INTEGER);
            module0016.f923(var44, (SubLObject)$ic43$);
            module0656.f39837((SubLObject)$ic57$, var41, var43, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
            module0642.f39020(module0015.$g460$.getGlobalValue());
            module0642.f39026((SubLObject)UNPROVIDED);
            final SubLObject var45 = f40645(var41);
            module0016.f908(var44, (SubLObject)$ic49$, (SubLObject)$ic45$);
            module0642.f39020(module0015.$g144$.getGlobalValue());
            if (NIL != var44) {
                module0642.f39020(module0015.$g157$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                module0642.f39020(var44);
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
            }
            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
            final SubLObject var46 = module0015.$g533$.currentBinding(var42);
            try {
                module0015.$g533$.bind((SubLObject)T, var42);
                if (NIL != var45.rest()) {
                    SubLObject var47 = var45;
                    SubLObject var48 = (SubLObject)NIL;
                    var48 = var47.first();
                    while (NIL != var47) {
                        f40646(var41, var48);
                        var47 = var47.rest();
                        var48 = var47.first();
                    }
                }
            }
            finally {
                module0015.$g533$.rebind(var46, var42);
            }
            module0642.f39020(module0015.$g145$.getGlobalValue());
            module0642.f39029((SubLObject)UNPROVIDED);
        }
        return (SubLObject)NIL;
    }

    public static SubLObject f40646(final SubLObject var41, final SubLObject var37) {
        final SubLObject var42 = module0217.f14247(var41, var37);
        if (var42.numG((SubLObject)ZERO_INTEGER)) {
            module0642.f39020(module0015.$g459$.getGlobalValue());
            module0642.f39032((SubLObject)FOUR_INTEGER);
            module0656.f39837((SubLObject)$ic57$, var41, var42, var37, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
            module0642.f39020(module0015.$g460$.getGlobalValue());
            module0642.f39026((SubLObject)UNPROVIDED);
        }
        return (SubLObject)NIL;
    }

    public static SubLObject f40625(final SubLObject var42) {
        final SubLObject var43 = f40647(var42, (SubLObject)UNPROVIDED);
        if (var43.numG((SubLObject)ZERO_INTEGER)) {
            module0642.f39051((SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
            module0642.f39020(module0015.$g459$.getGlobalValue());
            module0642.f39032((SubLObject)ZERO_INTEGER);
            module0656.f39837((SubLObject)$ic58$, var42, var43, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
            module0642.f39020(module0015.$g460$.getGlobalValue());
        }
        return (SubLObject)NIL;
    }

    public static SubLObject f40623(final SubLObject var41) {
        final SubLObject var42 = f40648(var41, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        if (var42.numG((SubLObject)ZERO_INTEGER)) {
            module0642.f39051((SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
            module0642.f39020(module0015.$g459$.getGlobalValue());
            module0642.f39032((SubLObject)ZERO_INTEGER);
            module0656.f39837((SubLObject)$ic59$, var41, var42, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
            module0642.f39020(module0015.$g460$.getGlobalValue());
            module0642.f39026((SubLObject)UNPROVIDED);
            f40649(var41, (SubLObject)$ic60$);
            f40649(var41, (SubLObject)$ic61$);
        }
        return (SubLObject)NIL;
    }

    public static SubLObject f40649(final SubLObject var41, final SubLObject var44) {
        final SubLThread var45 = SubLProcess.currentSubLThread();
        final SubLObject var46 = f40648(var41, var44, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        if (var46.numG((SubLObject)ZERO_INTEGER)) {
            final SubLObject var47 = PrintLow.format((SubLObject)NIL, (SubLObject)$ic62$, var44);
            module0642.f39020(module0015.$g459$.getGlobalValue());
            module0642.f39032((SubLObject)ZERO_INTEGER);
            module0016.f923(var47, (SubLObject)$ic43$);
            module0656.f39837((SubLObject)$ic59$, var41, var46, var44, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
            module0642.f39020(module0015.$g460$.getGlobalValue());
            module0642.f39026((SubLObject)UNPROVIDED);
            final SubLObject var48 = f40650(var41, var44, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
            module0016.f908(var47, (SubLObject)$ic49$, (SubLObject)$ic45$);
            module0642.f39020(module0015.$g144$.getGlobalValue());
            if (NIL != var47) {
                module0642.f39020(module0015.$g157$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                module0642.f39020(var47);
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
            }
            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
            final SubLObject var49 = module0015.$g533$.currentBinding(var45);
            try {
                module0015.$g533$.bind((SubLObject)T, var45);
                SubLObject var50 = var48;
                SubLObject var51 = (SubLObject)NIL;
                var51 = var50.first();
                while (NIL != var50) {
                    f40651(var41, var44, var51);
                    var50 = var50.rest();
                    var51 = var50.first();
                }
            }
            finally {
                module0015.$g533$.rebind(var49, var45);
            }
            module0642.f39020(module0015.$g145$.getGlobalValue());
            module0642.f39029((SubLObject)UNPROVIDED);
        }
        return (SubLObject)NIL;
    }

    public static SubLObject f40651(final SubLObject var41, final SubLObject var44, final SubLObject var37) {
        final SubLThread var45 = SubLProcess.currentSubLThread();
        final SubLObject var46 = f40648(var41, var44, var37, (SubLObject)UNPROVIDED);
        if (var46.numG((SubLObject)ZERO_INTEGER)) {
            final SubLObject var47 = f40650(var41, var44, var37, (SubLObject)UNPROVIDED);
            final SubLObject var48 = f40652(var41, var44, var37);
            module0642.f39020(module0015.$g459$.getGlobalValue());
            module0642.f39032((SubLObject)TWO_INTEGER);
            if (Sequences.length(var47).numLE((SubLObject)ONE_INTEGER)) {
                module0016.f927();
            }
            else {
                module0016.f923(var48, (SubLObject)$ic43$);
            }
            module0656.f39837((SubLObject)$ic59$, var41, var46, var44, var37, (SubLObject)UNPROVIDED);
            module0642.f39020(module0015.$g460$.getGlobalValue());
            module0642.f39026((SubLObject)UNPROVIDED);
            if (NIL != var47.rest()) {
                module0016.f908(var48, (SubLObject)$ic49$, (SubLObject)$ic45$);
                module0642.f39020(module0015.$g144$.getGlobalValue());
                if (NIL != var48) {
                    module0642.f39020(module0015.$g157$.getGlobalValue());
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                    module0642.f39020(var48);
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                }
                module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                final SubLObject var49 = module0015.$g533$.currentBinding(var45);
                try {
                    module0015.$g533$.bind((SubLObject)T, var45);
                    SubLObject var50 = var47;
                    SubLObject var51 = (SubLObject)NIL;
                    var51 = var50.first();
                    while (NIL != var50) {
                        f40653(var41, var44, var37, var51);
                        var50 = var50.rest();
                        var51 = var50.first();
                    }
                }
                finally {
                    module0015.$g533$.rebind(var49, var45);
                }
                module0642.f39020(module0015.$g145$.getGlobalValue());
                module0642.f39029((SubLObject)UNPROVIDED);
            }
        }
        return (SubLObject)NIL;
    }

    public static SubLObject f40652(final SubLObject var41, final SubLObject var44, final SubLObject var37) {
        return PrintLow.format((SubLObject)NIL, (SubLObject)$ic63$, new SubLObject[] { module0656.f39842(var41), var44, module0656.f39842(var37) });
    }

    public static SubLObject f40653(final SubLObject var41, final SubLObject var44, final SubLObject var37, final SubLObject var46) {
        final SubLObject var47 = f40648(var41, var44, var37, var46);
        if (var47.numG((SubLObject)ZERO_INTEGER)) {
            module0642.f39020(module0015.$g459$.getGlobalValue());
            module0642.f39032((SubLObject)SIX_INTEGER);
            module0642.f39020(module0015.$g230$.getGlobalValue());
            module0656.f39837((SubLObject)$ic59$, var41, var47, var44, var37, var46);
            module0642.f39020(module0015.$g231$.getGlobalValue());
            module0642.f39020(module0015.$g460$.getGlobalValue());
            module0642.f39026((SubLObject)UNPROVIDED);
        }
        return (SubLObject)NIL;
    }

    public static SubLObject f40624(final SubLObject var41) {
        final SubLObject var42 = f40654(var41, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        if (var42.numG((SubLObject)ZERO_INTEGER)) {
            module0642.f39051((SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
            module0642.f39020(module0015.$g459$.getGlobalValue());
            module0642.f39032((SubLObject)ZERO_INTEGER);
            module0656.f39837((SubLObject)$ic64$, var41, var42, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
            module0642.f39020(module0015.$g460$.getGlobalValue());
            module0642.f39026((SubLObject)UNPROVIDED);
            f40655(var41, (SubLObject)$ic60$);
            f40655(var41, (SubLObject)$ic61$);
        }
        return (SubLObject)NIL;
    }

    public static SubLObject f40655(final SubLObject var41, final SubLObject var44) {
        final SubLThread var45 = SubLProcess.currentSubLThread();
        final SubLObject var46 = f40654(var41, var44, (SubLObject)UNPROVIDED);
        if (var46.numG((SubLObject)ZERO_INTEGER)) {
            final SubLObject var47 = PrintLow.format((SubLObject)NIL, (SubLObject)$ic65$, var44);
            module0642.f39020(module0015.$g459$.getGlobalValue());
            module0642.f39032((SubLObject)ZERO_INTEGER);
            module0016.f923(var47, (SubLObject)$ic43$);
            module0656.f39837((SubLObject)$ic64$, var41, var46, var44, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
            module0642.f39020(module0015.$g460$.getGlobalValue());
            module0642.f39026((SubLObject)UNPROVIDED);
            final SubLObject var48 = f40656(var41, var44, (SubLObject)UNPROVIDED);
            module0016.f908(var47, (SubLObject)$ic49$, (SubLObject)$ic45$);
            module0642.f39020(module0015.$g144$.getGlobalValue());
            if (NIL != var47) {
                module0642.f39020(module0015.$g157$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                module0642.f39020(var47);
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
            }
            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
            final SubLObject var49 = module0015.$g533$.currentBinding(var45);
            try {
                module0015.$g533$.bind((SubLObject)T, var45);
                SubLObject var50 = var48;
                SubLObject var51 = (SubLObject)NIL;
                var51 = var50.first();
                while (NIL != var50) {
                    f40657(var41, var44, var51);
                    var50 = var50.rest();
                    var51 = var50.first();
                }
            }
            finally {
                module0015.$g533$.rebind(var49, var45);
            }
            module0642.f39020(module0015.$g145$.getGlobalValue());
            module0642.f39029((SubLObject)UNPROVIDED);
        }
        return (SubLObject)NIL;
    }

    public static SubLObject f40657(final SubLObject var41, final SubLObject var44, final SubLObject var46) {
        final SubLObject var47 = f40654(var41, var44, var46);
        if (var47.numG((SubLObject)ZERO_INTEGER)) {
            module0642.f39020(module0015.$g459$.getGlobalValue());
            module0642.f39032((SubLObject)SIX_INTEGER);
            module0642.f39020(module0015.$g230$.getGlobalValue());
            module0656.f39837((SubLObject)$ic64$, var41, var47, var44, var46, (SubLObject)UNPROVIDED);
            module0642.f39020(module0015.$g231$.getGlobalValue());
            module0642.f39020(module0015.$g460$.getGlobalValue());
            module0642.f39026((SubLObject)UNPROVIDED);
        }
        return (SubLObject)NIL;
    }

    public static SubLObject f40627(final SubLObject var47) {
        final SubLObject var48 = f40658(var47, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        if (var48.numG((SubLObject)ZERO_INTEGER)) {
            module0642.f39051((SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
            module0642.f39020(module0015.$g459$.getGlobalValue());
            module0642.f39032((SubLObject)ZERO_INTEGER);
            module0656.f39837((SubLObject)$ic66$, var47, var48, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
            module0642.f39020(module0015.$g460$.getGlobalValue());
            module0642.f39026((SubLObject)UNPROVIDED);
            f40659(var47, (SubLObject)$ic60$);
            f40659(var47, (SubLObject)$ic61$);
        }
        return (SubLObject)NIL;
    }

    public static SubLObject f40659(final SubLObject var47, final SubLObject var44) {
        final SubLThread var48 = SubLProcess.currentSubLThread();
        final SubLObject var49 = f40658(var47, var44, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        if (var49.numG((SubLObject)ZERO_INTEGER)) {
            final SubLObject var50 = PrintLow.format((SubLObject)NIL, (SubLObject)$ic67$, var44);
            module0642.f39020(module0015.$g459$.getGlobalValue());
            module0642.f39032((SubLObject)ZERO_INTEGER);
            module0016.f923(var50, (SubLObject)$ic43$);
            module0656.f39837((SubLObject)$ic66$, var47, var49, var44, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
            module0642.f39020(module0015.$g460$.getGlobalValue());
            module0642.f39026((SubLObject)UNPROVIDED);
            final SubLObject var51 = f40660(var47, var44, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
            module0016.f908(var50, (SubLObject)$ic49$, (SubLObject)$ic45$);
            module0642.f39020(module0015.$g144$.getGlobalValue());
            if (NIL != var50) {
                module0642.f39020(module0015.$g157$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                module0642.f39020(var50);
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
            }
            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
            final SubLObject var52 = module0015.$g533$.currentBinding(var48);
            try {
                module0015.$g533$.bind((SubLObject)T, var48);
                SubLObject var53 = var51;
                SubLObject var54 = (SubLObject)NIL;
                var54 = var53.first();
                while (NIL != var53) {
                    f40661(var47, var44, var54);
                    var53 = var53.rest();
                    var54 = var53.first();
                }
            }
            finally {
                module0015.$g533$.rebind(var52, var48);
            }
            module0642.f39020(module0015.$g145$.getGlobalValue());
            module0642.f39029((SubLObject)UNPROVIDED);
        }
        return (SubLObject)NIL;
    }

    public static SubLObject f40661(final SubLObject var47, final SubLObject var44, final SubLObject var37) {
        final SubLObject var48 = f40658(var47, var44, var37, (SubLObject)UNPROVIDED);
        if (var48.numG((SubLObject)ZERO_INTEGER)) {
            module0642.f39020(module0015.$g459$.getGlobalValue());
            module0642.f39032((SubLObject)FOUR_INTEGER);
            module0656.f39837((SubLObject)$ic66$, var47, var48, var44, var37, (SubLObject)UNPROVIDED);
            module0642.f39020(module0015.$g460$.getGlobalValue());
            module0642.f39026((SubLObject)UNPROVIDED);
            final SubLObject var49 = f40660(var47, var44, var37, (SubLObject)UNPROVIDED);
            if (NIL != var49.rest()) {
                SubLObject var50 = var49;
                SubLObject var51 = (SubLObject)NIL;
                var51 = var50.first();
                while (NIL != var50) {
                    f40662(var47, var44, var37, var51);
                    var50 = var50.rest();
                    var51 = var50.first();
                }
            }
        }
        return (SubLObject)NIL;
    }

    public static SubLObject f40662(final SubLObject var47, final SubLObject var44, final SubLObject var37, final SubLObject var46) {
        final SubLObject var48 = f40658(var47, var44, var37, var46);
        if (var48.numG((SubLObject)ZERO_INTEGER)) {
            module0642.f39020(module0015.$g459$.getGlobalValue());
            module0642.f39032((SubLObject)SIX_INTEGER);
            module0642.f39020(module0015.$g230$.getGlobalValue());
            module0656.f39837((SubLObject)$ic66$, var47, var48, var44, var37, var46);
            module0642.f39020(module0015.$g231$.getGlobalValue());
            module0642.f39020(module0015.$g460$.getGlobalValue());
            module0642.f39026((SubLObject)UNPROVIDED);
        }
        return (SubLObject)NIL;
    }

    public static SubLObject f40628(final SubLObject var47) {
        final SubLObject var48 = f40663(var47, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        if (var48.numG((SubLObject)ZERO_INTEGER)) {
            module0642.f39051((SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
            module0642.f39020(module0015.$g459$.getGlobalValue());
            module0642.f39032((SubLObject)ZERO_INTEGER);
            module0656.f39837((SubLObject)$ic68$, var47, var48, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
            module0642.f39020(module0015.$g460$.getGlobalValue());
            module0642.f39026((SubLObject)UNPROVIDED);
            f40664(var47, (SubLObject)$ic60$);
            f40664(var47, (SubLObject)$ic61$);
        }
        return (SubLObject)NIL;
    }

    public static SubLObject f40664(final SubLObject var47, final SubLObject var44) {
        final SubLThread var48 = SubLProcess.currentSubLThread();
        final SubLObject var49 = f40663(var47, var44, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        if (var49.numG((SubLObject)ZERO_INTEGER)) {
            final SubLObject var50 = PrintLow.format((SubLObject)NIL, (SubLObject)$ic69$, var44);
            module0642.f39020(module0015.$g459$.getGlobalValue());
            module0642.f39032((SubLObject)ZERO_INTEGER);
            module0016.f923(var50, (SubLObject)$ic43$);
            module0656.f39837((SubLObject)$ic68$, var47, var49, var44, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
            module0642.f39020(module0015.$g460$.getGlobalValue());
            module0642.f39026((SubLObject)UNPROVIDED);
            final SubLObject var51 = f40665(var47, var44, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
            module0016.f908(var50, (SubLObject)$ic49$, (SubLObject)$ic45$);
            module0642.f39020(module0015.$g144$.getGlobalValue());
            if (NIL != var50) {
                module0642.f39020(module0015.$g157$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                module0642.f39020(var50);
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
            }
            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
            final SubLObject var52 = module0015.$g533$.currentBinding(var48);
            try {
                module0015.$g533$.bind((SubLObject)T, var48);
                SubLObject var53 = var51;
                SubLObject var54 = (SubLObject)NIL;
                var54 = var53.first();
                while (NIL != var53) {
                    f40666(var47, var44, var54);
                    var53 = var53.rest();
                    var54 = var53.first();
                }
            }
            finally {
                module0015.$g533$.rebind(var52, var48);
            }
            module0642.f39020(module0015.$g145$.getGlobalValue());
            module0642.f39029((SubLObject)UNPROVIDED);
        }
        return (SubLObject)NIL;
    }

    public static SubLObject f40666(final SubLObject var47, final SubLObject var44, final SubLObject var37) {
        final SubLObject var48 = f40663(var47, var44, var37, (SubLObject)UNPROVIDED);
        if (var48.numG((SubLObject)ZERO_INTEGER)) {
            module0642.f39020(module0015.$g459$.getGlobalValue());
            module0642.f39032((SubLObject)FOUR_INTEGER);
            module0656.f39837((SubLObject)$ic68$, var47, var48, var44, var37, (SubLObject)UNPROVIDED);
            module0642.f39020(module0015.$g460$.getGlobalValue());
            module0642.f39026((SubLObject)UNPROVIDED);
            final SubLObject var49 = f40665(var47, var44, var37, (SubLObject)UNPROVIDED);
            if (NIL != var49.rest()) {
                SubLObject var50 = var49;
                SubLObject var51 = (SubLObject)NIL;
                var51 = var50.first();
                while (NIL != var50) {
                    f40667(var47, var44, var37, var51);
                    var50 = var50.rest();
                    var51 = var50.first();
                }
            }
        }
        return (SubLObject)NIL;
    }

    public static SubLObject f40667(final SubLObject var47, final SubLObject var44, final SubLObject var37, final SubLObject var46) {
        final SubLObject var48 = f40663(var47, var44, var37, var46);
        if (var48.numG((SubLObject)ZERO_INTEGER)) {
            module0642.f39020(module0015.$g459$.getGlobalValue());
            module0642.f39032((SubLObject)SIX_INTEGER);
            module0642.f39020(module0015.$g230$.getGlobalValue());
            module0656.f39837((SubLObject)$ic68$, var47, var48, var44, var37, var46);
            module0642.f39020(module0015.$g231$.getGlobalValue());
            module0642.f39020(module0015.$g460$.getGlobalValue());
            module0642.f39026((SubLObject)UNPROVIDED);
        }
        return (SubLObject)NIL;
    }

    public static SubLObject f40629(final SubLObject var47) {
        final SubLObject var48 = f40668(var47, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        if (var48.numG((SubLObject)ZERO_INTEGER)) {
            module0642.f39051((SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
            module0642.f39020(module0015.$g459$.getGlobalValue());
            module0642.f39032((SubLObject)ZERO_INTEGER);
            module0656.f39837((SubLObject)$ic70$, var47, var48, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
            module0642.f39020(module0015.$g460$.getGlobalValue());
            module0642.f39026((SubLObject)UNPROVIDED);
            f40669(var47, (SubLObject)$ic60$);
            f40669(var47, (SubLObject)$ic61$);
        }
        return (SubLObject)NIL;
    }

    public static SubLObject f40669(final SubLObject var47, final SubLObject var44) {
        final SubLThread var48 = SubLProcess.currentSubLThread();
        final SubLObject var49 = f40668(var47, var44, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        if (var49.numG((SubLObject)ZERO_INTEGER)) {
            final SubLObject var50 = PrintLow.format((SubLObject)NIL, (SubLObject)$ic71$, var44);
            module0642.f39020(module0015.$g459$.getGlobalValue());
            module0642.f39032((SubLObject)ZERO_INTEGER);
            module0016.f923(var50, (SubLObject)$ic43$);
            module0656.f39837((SubLObject)$ic70$, var47, var49, var44, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
            module0642.f39020(module0015.$g460$.getGlobalValue());
            module0642.f39026((SubLObject)UNPROVIDED);
            final SubLObject var51 = f40670(var47, var44, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
            module0016.f908(var50, (SubLObject)$ic49$, (SubLObject)$ic45$);
            module0642.f39020(module0015.$g144$.getGlobalValue());
            if (NIL != var50) {
                module0642.f39020(module0015.$g157$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                module0642.f39020(var50);
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
            }
            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
            final SubLObject var52 = module0015.$g533$.currentBinding(var48);
            try {
                module0015.$g533$.bind((SubLObject)T, var48);
                SubLObject var53 = var51;
                SubLObject var54 = (SubLObject)NIL;
                var54 = var53.first();
                while (NIL != var53) {
                    f40671(var47, var44, var54);
                    var53 = var53.rest();
                    var54 = var53.first();
                }
            }
            finally {
                module0015.$g533$.rebind(var52, var48);
            }
            module0642.f39020(module0015.$g145$.getGlobalValue());
            module0642.f39029((SubLObject)UNPROVIDED);
        }
        return (SubLObject)NIL;
    }

    public static SubLObject f40671(final SubLObject var47, final SubLObject var44, final SubLObject var37) {
        final SubLObject var48 = f40668(var47, var44, var37, (SubLObject)UNPROVIDED);
        if (var48.numG((SubLObject)ZERO_INTEGER)) {
            module0642.f39020(module0015.$g459$.getGlobalValue());
            module0642.f39032((SubLObject)FOUR_INTEGER);
            module0656.f39837((SubLObject)$ic70$, var47, var48, var44, var37, (SubLObject)UNPROVIDED);
            module0642.f39020(module0015.$g460$.getGlobalValue());
            module0642.f39026((SubLObject)UNPROVIDED);
            final SubLObject var49 = f40670(var47, var44, var37, (SubLObject)UNPROVIDED);
            if (NIL != var49.rest()) {
                SubLObject var50 = var49;
                SubLObject var51 = (SubLObject)NIL;
                var51 = var50.first();
                while (NIL != var50) {
                    f40672(var47, var44, var37, var51);
                    var50 = var50.rest();
                    var51 = var50.first();
                }
            }
        }
        return (SubLObject)NIL;
    }

    public static SubLObject f40672(final SubLObject var47, final SubLObject var44, final SubLObject var37, final SubLObject var46) {
        final SubLObject var48 = f40668(var47, var44, var37, var46);
        if (var48.numG((SubLObject)ZERO_INTEGER)) {
            module0642.f39020(module0015.$g459$.getGlobalValue());
            module0642.f39032((SubLObject)SIX_INTEGER);
            module0642.f39020(module0015.$g230$.getGlobalValue());
            module0656.f39837((SubLObject)$ic70$, var47, var48, var44, var37, var46);
            module0642.f39020(module0015.$g231$.getGlobalValue());
            module0642.f39020(module0015.$g460$.getGlobalValue());
            module0642.f39026((SubLObject)UNPROVIDED);
        }
        return (SubLObject)NIL;
    }

    public static SubLObject f40630(final SubLObject var48) {
        final SubLObject var49 = f40673(var48, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        if (var49.numG((SubLObject)ZERO_INTEGER)) {
            module0642.f39051((SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
            module0642.f39020(module0015.$g459$.getGlobalValue());
            module0642.f39032((SubLObject)ZERO_INTEGER);
            module0656.f39837((SubLObject)$ic72$, var48, var49, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
            module0642.f39020(module0015.$g460$.getGlobalValue());
            module0642.f39026((SubLObject)UNPROVIDED);
            f40674(var48, (SubLObject)$ic60$);
            f40674(var48, (SubLObject)$ic61$);
        }
        return (SubLObject)NIL;
    }

    public static SubLObject f40674(final SubLObject var48, final SubLObject var44) {
        final SubLThread var49 = SubLProcess.currentSubLThread();
        final SubLObject var50 = f40673(var48, var44, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        if (var50.numG((SubLObject)ZERO_INTEGER)) {
            final SubLObject var51 = PrintLow.format((SubLObject)NIL, (SubLObject)$ic73$, var44);
            module0642.f39020(module0015.$g459$.getGlobalValue());
            module0642.f39032((SubLObject)ZERO_INTEGER);
            module0016.f923(var51, (SubLObject)$ic43$);
            module0656.f39837((SubLObject)$ic72$, var48, var50, var44, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
            module0642.f39020(module0015.$g460$.getGlobalValue());
            module0642.f39026((SubLObject)UNPROVIDED);
            final SubLObject var52 = f40675(var48, var44, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
            module0016.f908(var51, (SubLObject)$ic49$, (SubLObject)$ic45$);
            module0642.f39020(module0015.$g144$.getGlobalValue());
            if (NIL != var51) {
                module0642.f39020(module0015.$g157$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                module0642.f39020(var51);
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
            }
            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
            final SubLObject var53 = module0015.$g533$.currentBinding(var49);
            try {
                module0015.$g533$.bind((SubLObject)T, var49);
                SubLObject var54 = var52;
                SubLObject var55 = (SubLObject)NIL;
                var55 = var54.first();
                while (NIL != var54) {
                    f40676(var48, var44, var55);
                    var54 = var54.rest();
                    var55 = var54.first();
                }
            }
            finally {
                module0015.$g533$.rebind(var53, var49);
            }
            module0642.f39020(module0015.$g145$.getGlobalValue());
            module0642.f39029((SubLObject)UNPROVIDED);
        }
        return (SubLObject)NIL;
    }

    public static SubLObject f40676(final SubLObject var48, final SubLObject var44, final SubLObject var49) {
        final SubLObject var50 = f40673(var48, var44, var49, (SubLObject)UNPROVIDED);
        if (var50.numG((SubLObject)ZERO_INTEGER)) {
            module0642.f39020(module0015.$g459$.getGlobalValue());
            module0642.f39032((SubLObject)FOUR_INTEGER);
            module0656.f39837((SubLObject)$ic72$, var48, var50, var44, var49, (SubLObject)UNPROVIDED);
            module0642.f39020(module0015.$g460$.getGlobalValue());
            module0642.f39026((SubLObject)UNPROVIDED);
            final SubLObject var51 = f40675(var48, var44, var49, (SubLObject)UNPROVIDED);
            if (NIL != var51.rest()) {
                SubLObject var52 = var51;
                SubLObject var53 = (SubLObject)NIL;
                var53 = var52.first();
                while (NIL != var52) {
                    f40677(var48, var44, var49, var53);
                    var52 = var52.rest();
                    var53 = var52.first();
                }
            }
        }
        return (SubLObject)NIL;
    }

    public static SubLObject f40677(final SubLObject var48, final SubLObject var44, final SubLObject var49, final SubLObject var46) {
        final SubLObject var50 = f40673(var48, var44, var49, var46);
        if (var50.numG((SubLObject)ZERO_INTEGER)) {
            module0642.f39020(module0015.$g459$.getGlobalValue());
            module0642.f39032((SubLObject)SIX_INTEGER);
            module0642.f39020(module0015.$g230$.getGlobalValue());
            module0656.f39837((SubLObject)$ic72$, var48, var50, var44, var49, var46);
            module0642.f39020(module0015.$g231$.getGlobalValue());
            module0642.f39020(module0015.$g460$.getGlobalValue());
            module0642.f39026((SubLObject)UNPROVIDED);
        }
        return (SubLObject)NIL;
    }

    public static SubLObject f40626(final SubLObject var42) {
        final SubLObject var43 = f40678(var42, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        if (var43.numG((SubLObject)ZERO_INTEGER)) {
            module0642.f39051((SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
            module0642.f39020(module0015.$g459$.getGlobalValue());
            module0642.f39032((SubLObject)ZERO_INTEGER);
            module0656.f39837((SubLObject)$ic74$, var42, var43, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
            module0642.f39020(module0015.$g460$.getGlobalValue());
            SubLObject var45;
            final SubLObject var44 = var45 = f40679(var42, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
            SubLObject var46 = (SubLObject)NIL;
            var46 = var45.first();
            while (NIL != var45) {
                f40680(var42, var46);
                var45 = var45.rest();
                var46 = var45.first();
            }
        }
        return (SubLObject)NIL;
    }

    public static SubLObject f40680(final SubLObject var42, final SubLObject var37) {
        final SubLObject var43 = f40678(var42, var37, (SubLObject)UNPROVIDED);
        if (var43.numG((SubLObject)ZERO_INTEGER)) {
            module0642.f39026((SubLObject)UNPROVIDED);
            module0642.f39020(module0015.$g459$.getGlobalValue());
            module0642.f39032((SubLObject)TWO_INTEGER);
            module0656.f39837((SubLObject)$ic74$, var42, var43, var37, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
            module0642.f39020(module0015.$g460$.getGlobalValue());
            final SubLObject var44 = f40679(var42, var37, (SubLObject)UNPROVIDED);
            if (NIL != var44.rest()) {
                SubLObject var45 = var44;
                SubLObject var46 = (SubLObject)NIL;
                var46 = var45.first();
                while (NIL != var45) {
                    f40681(var42, var37, var46);
                    var45 = var45.rest();
                    var46 = var45.first();
                }
            }
        }
        return (SubLObject)NIL;
    }

    public static SubLObject f40681(final SubLObject var42, final SubLObject var37, final SubLObject var46) {
        final SubLObject var47 = f40678(var42, var37, var46);
        if (var47.numG((SubLObject)ZERO_INTEGER)) {
            module0642.f39026((SubLObject)UNPROVIDED);
            module0642.f39020(module0015.$g459$.getGlobalValue());
            module0642.f39032((SubLObject)THREE_INTEGER);
            module0642.f39020(module0015.$g230$.getGlobalValue());
            module0656.f39837((SubLObject)$ic74$, var42, var47, var37, var46, (SubLObject)UNPROVIDED);
            module0642.f39020(module0015.$g231$.getGlobalValue());
            module0642.f39020(module0015.$g460$.getGlobalValue());
        }
        return (SubLObject)NIL;
    }

    public static SubLObject f40618() {
        final SubLObject var43 = f40682((SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        if (var43.numG((SubLObject)ZERO_INTEGER)) {
            module0642.f39051((SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
            module0642.f39020(module0015.$g459$.getGlobalValue());
            module0642.f39032((SubLObject)ZERO_INTEGER);
            module0656.f39837((SubLObject)$ic75$, var43, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
            module0642.f39020(module0015.$g460$.getGlobalValue());
            f40683((SubLObject)$ic60$);
            f40683((SubLObject)$ic61$);
        }
        return (SubLObject)NIL;
    }

    public static SubLObject f40683(final SubLObject var44) {
        final SubLObject var45 = f40682(var44, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        if (var45.numG((SubLObject)ZERO_INTEGER)) {
            module0642.f39026((SubLObject)UNPROVIDED);
            module0642.f39020(module0015.$g459$.getGlobalValue());
            module0642.f39032((SubLObject)TWO_INTEGER);
            module0656.f39837((SubLObject)$ic75$, var45, var44, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
            module0642.f39020(module0015.$g460$.getGlobalValue());
            SubLObject var47;
            final SubLObject var46 = var47 = f40684(var44, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
            SubLObject var48 = (SubLObject)NIL;
            var48 = var47.first();
            while (NIL != var47) {
                f40685(var44, var48);
                var47 = var47.rest();
                var48 = var47.first();
            }
        }
        return (SubLObject)NIL;
    }

    public static SubLObject f40685(final SubLObject var44, final SubLObject var37) {
        final SubLObject var45 = f40682(var44, var37, (SubLObject)UNPROVIDED);
        if (var45.numG((SubLObject)ZERO_INTEGER)) {
            module0642.f39026((SubLObject)UNPROVIDED);
            module0642.f39020(module0015.$g459$.getGlobalValue());
            module0642.f39032((SubLObject)THREE_INTEGER);
            module0656.f39837((SubLObject)$ic75$, var45, var44, var37, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
            module0642.f39020(module0015.$g460$.getGlobalValue());
            final SubLObject var46 = f40684(var44, var37, (SubLObject)UNPROVIDED);
            if (NIL != var46.rest()) {
                SubLObject var47 = var46;
                SubLObject var48 = (SubLObject)NIL;
                var48 = var47.first();
                while (NIL != var47) {
                    f40686(var44, var37, var48);
                    var47 = var47.rest();
                    var48 = var47.first();
                }
            }
        }
        return (SubLObject)NIL;
    }

    public static SubLObject f40686(final SubLObject var44, final SubLObject var37, final SubLObject var46) {
        final SubLObject var47 = f40682(var44, var37, var46);
        if (var47.numG((SubLObject)ZERO_INTEGER)) {
            module0642.f39026((SubLObject)UNPROVIDED);
            module0642.f39020(module0015.$g459$.getGlobalValue());
            module0642.f39032((SubLObject)FOUR_INTEGER);
            module0642.f39020(module0015.$g230$.getGlobalValue());
            module0656.f39837((SubLObject)$ic75$, var47, var44, var37, var46, (SubLObject)UNPROVIDED);
            module0642.f39020(module0015.$g231$.getGlobalValue());
            module0642.f39020(module0015.$g460$.getGlobalValue());
        }
        return (SubLObject)NIL;
    }

    public static SubLObject f40631(final SubLObject var1) {
        final SubLObject var2 = f40687(var1);
        if (var2.numG((SubLObject)ZERO_INTEGER)) {
            module0642.f39051((SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
            module0642.f39020(module0015.$g459$.getGlobalValue());
            module0642.f39032((SubLObject)ZERO_INTEGER);
            module0656.f39837((SubLObject)$ic76$, var1, var2, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
            module0642.f39020(module0015.$g460$.getGlobalValue());
        }
        return (SubLObject)NIL;
    }

    public static SubLObject f40632(final SubLObject var1) {
        if (NIL != module0173.f10955(var1) && NIL != module0217.f14342(var1)) {
            module0642.f39051((SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
            module0642.f39020(module0015.$g459$.getGlobalValue());
            module0642.f39032((SubLObject)ZERO_INTEGER);
            module0656.f39837((SubLObject)$ic77$, var1, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
            module0642.f39020(module0015.$g460$.getGlobalValue());
        }
        else {
            final SubLObject var2 = (NIL != module0161.f10503(var1)) ? f40688(var1) : f40689(var1);
            if (var2.numG((SubLObject)ZERO_INTEGER)) {
                module0642.f39051((SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                module0642.f39020(module0015.$g459$.getGlobalValue());
                module0642.f39032((SubLObject)ZERO_INTEGER);
                module0656.f39837((SubLObject)$ic78$, var1, var2, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                module0642.f39020(module0015.$g460$.getGlobalValue());
                module0642.f39026((SubLObject)UNPROVIDED);
                module0642.f39020(module0015.$g459$.getGlobalValue());
                module0642.f39032((SubLObject)TWO_INTEGER);
                module0656.f39837((SubLObject)$ic79$, var1, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                module0642.f39020(module0015.$g460$.getGlobalValue());
                module0642.f39026((SubLObject)UNPROVIDED);
                module0642.f39020(module0015.$g459$.getGlobalValue());
                module0642.f39032((SubLObject)TWO_INTEGER);
                module0656.f39837((SubLObject)$ic80$, var1, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                module0642.f39020(module0015.$g460$.getGlobalValue());
            }
        }
        return (SubLObject)NIL;
    }

    public static SubLObject f40611(final SubLObject var1) {
        final SubLThread var2 = SubLProcess.currentSubLThread();
        if (!module0655.$g5128$.getDynamicValue(var2).eql(var1)) {
            module0655.$g5128$.setDynamicValue((SubLObject)NIL, var2);
        }
        module0642.f39032((SubLObject)UNPROVIDED);
        module0642.f39020(module0015.$g459$.getGlobalValue());
        if (NIL != f40690(var1)) {
            module0656.f39837((SubLObject)$ic81$, var1, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        }
        else {
            module0656.f39837((SubLObject)$ic82$, var1, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        }
        module0642.f39020(module0015.$g460$.getGlobalValue());
        return (SubLObject)NIL;
    }

    public static SubLObject f40690(final SubLObject var1) {
        final SubLThread var2 = SubLProcess.currentSubLThread();
        if (NIL != assertion_handles_oc.f11035(var1)) {
            return (SubLObject)NIL;
        }
        final SubLObject var3 = module0655.$g5081$.getDynamicValue(var2);
        if (var3.eql((SubLObject)$ic83$)) {
            return f40691(var1);
        }
        if (var3.eql((SubLObject)$ic84$)) {
            return (SubLObject)makeBoolean(NIL == f40691(var1));
        }
        if (var3.eql((SubLObject)$ic85$)) {
            return (SubLObject)((NIL != module0210.f13584(var1)) ? f40691(var1) : makeBoolean(NIL == f40691(var1)));
        }
        return (SubLObject)NIL;
    }

    public static SubLObject f40691(final SubLObject var1) {
        final SubLThread var2 = SubLProcess.currentSubLThread();
        return Equality.eql(module0655.$g5128$.getDynamicValue(var2), var1);
    }

    public static SubLObject f40692(final SubLObject var51) {
        final SubLThread var52 = SubLProcess.currentSubLThread();
        if (NIL != module0656.f39930(var51)) {
            return f40690(var51);
        }
        if (NIL != module0210.f13595(var51, (SubLObject)UNPROVIDED)) {
            return f40690(var51);
        }
        if (var51 == $ic86$) {
            return module0655.$g5090$.getDynamicValue(var52);
        }
        return (SubLObject)NIL;
    }

    public static SubLObject f40693(final SubLObject var52) {
        final SubLThread var53 = SubLProcess.currentSubLThread();
        SubLObject var54 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var52, var52, (SubLObject)$ic87$);
        var54 = var52.first();
        final SubLObject var55 = var52.rest();
        if (NIL == var55) {
            SubLObject var56 = module0656.f39969(var54);
            if (NIL == module0656.f39930(var56)) {
                var56 = module0656.f39951(var54);
            }
            if (NIL == var56) {
                return module0656.f39789((SubLObject)$ic88$, var54, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
            }
            final SubLObject var57 = module0655.$g5081$.getDynamicValue(var53);
            if (var57.eql((SubLObject)$ic83$)) {
                module0655.$g5128$.setDynamicValue(var56, var53);
            }
            else if (var57.eql((SubLObject)$ic84$)) {
                module0655.$g5128$.setDynamicValue((SubLObject)NIL, var53);
            }
            else if (var57.eql((SubLObject)$ic85$)) {
                module0655.$g5128$.setDynamicValue((SubLObject)((NIL != module0210.f13584(var56)) ? var56 : NIL), var53);
            }
            if (NIL != module0223.f14667(var56)) {
                f40694((SubLObject)ConsesLow.list(Sequences.cconcatenate((SubLObject)$ic89$, Strings.string(var56))));
            }
            else if (NIL != module0173.f10955(var56)) {
                module0660.f40154(var56);
            }
            else if (NIL != module0210.f13595(var56, (SubLObject)UNPROVIDED)) {
                module0660.f40154(var56);
            }
        }
        else {
            cdestructuring_bind.cdestructuring_bind_error(var52, (SubLObject)$ic87$);
        }
        return (SubLObject)NIL;
    }

    public static SubLObject f40695(final SubLObject var1, SubLObject var56) {
        if (var56 == UNPROVIDED) {
            var56 = (SubLObject)NIL;
        }
        final SubLThread var57 = SubLProcess.currentSubLThread();
        if (NIL == var56) {
            var56 = (SubLObject)$ic91$;
        }
        final SubLObject var58 = module0656.f39832((SubLObject)$ic7$);
        module0642.f39020(module0015.$g381$.getGlobalValue());
        module0642.f39020(module0015.$g383$.getGlobalValue());
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        module0655.f39768();
        if (NIL != module0656.f39930(var1)) {
            PrintLow.format(module0015.$g131$.getDynamicValue(var57), (SubLObject)$ic92$, module0656.f39931(var1));
        }
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        if (NIL != var58) {
            module0642.f39020(module0015.$g387$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
            module0642.f39020(var58);
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        }
        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
        final SubLObject var59 = module0015.$g533$.currentBinding(var57);
        try {
            module0015.$g533$.bind((SubLObject)T, var57);
            module0642.f39019(var56);
        }
        finally {
            module0015.$g533$.rebind(var59, var57);
        }
        module0642.f39020(module0015.$g382$.getGlobalValue());
        return var1;
    }

    public static SubLObject f40696(final SubLObject var52) {
        final SubLThread var53 = SubLProcess.currentSubLThread();
        SubLObject var54 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var52, var52, (SubLObject)$ic87$);
        var54 = var52.first();
        final SubLObject var55 = var52.rest();
        if (NIL == var55) {
            SubLObject var56 = module0656.f39969(var54);
            if (NIL == module0656.f39930(var56)) {
                var56 = module0656.f39951(var54);
            }
            if (NIL == var56) {
                return module0656.f39789((SubLObject)$ic88$, var54, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
            }
            final SubLObject var57 = module0655.$g5081$.getDynamicValue(var53);
            if (var57.eql((SubLObject)$ic83$)) {
                module0655.$g5128$.setDynamicValue((SubLObject)NIL, var53);
            }
            else if (var57.eql((SubLObject)$ic84$)) {
                module0655.$g5128$.setDynamicValue(var56, var53);
            }
            else if (var57.eql((SubLObject)$ic85$)) {
                module0655.$g5128$.setDynamicValue((SubLObject)((NIL != module0210.f13584(var56)) ? NIL : var56), var53);
            }
            if (NIL != module0223.f14667(var56)) {
                f40694((SubLObject)ConsesLow.list(Sequences.cconcatenate((SubLObject)$ic89$, Strings.string(var56))));
            }
            else if (NIL != module0173.f10955(var56)) {
                module0660.f40154(var56);
            }
            else if (NIL != module0210.f13595(var56, (SubLObject)UNPROVIDED)) {
                module0660.f40154(var56);
            }
        }
        else {
            cdestructuring_bind.cdestructuring_bind_error(var52, (SubLObject)$ic87$);
        }
        return (SubLObject)NIL;
    }

    public static SubLObject f40697(final SubLObject var1, SubLObject var56) {
        if (var56 == UNPROVIDED) {
            var56 = (SubLObject)NIL;
        }
        final SubLThread var57 = SubLProcess.currentSubLThread();
        if (NIL == var56) {
            var56 = (SubLObject)$ic95$;
        }
        final SubLObject var58 = module0656.f39832((SubLObject)$ic7$);
        module0642.f39020(module0015.$g381$.getGlobalValue());
        module0642.f39020(module0015.$g383$.getGlobalValue());
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        module0655.f39768();
        if (NIL != module0656.f39930(var1)) {
            PrintLow.format(module0015.$g131$.getDynamicValue(var57), (SubLObject)$ic96$, module0656.f39931(var1));
        }
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        if (NIL != var58) {
            module0642.f39020(module0015.$g387$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
            module0642.f39020(var58);
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        }
        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
        final SubLObject var59 = module0015.$g533$.currentBinding(var57);
        try {
            module0015.$g533$.bind((SubLObject)T, var57);
            module0642.f39019(var56);
        }
        finally {
            module0015.$g533$.rebind(var59, var57);
        }
        module0642.f39020(module0015.$g382$.getGlobalValue());
        return var1;
    }

    public static SubLObject f40698(final SubLObject var52) {
        if (NIL != module0173.f10955(var52)) {
            SubLObject var53 = (SubLObject)NIL;
            cdestructuring_bind.destructuring_bind_must_consp(var52, var52, (SubLObject)$ic98$);
            var53 = var52.first();
            final SubLObject var54 = var52.rest();
            if (NIL == var54) {
                final SubLObject var55 = module0656.f39943(var53, (SubLObject)UNPROVIDED);
                if (NIL == module0173.f10955(var55)) {
                    return module0656.f39789((SubLObject)$ic99$, var53, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                }
                f40699(var55);
            }
            else {
                cdestructuring_bind.cdestructuring_bind_error(var52, (SubLObject)$ic98$);
            }
        }
        else {
            f40699(module0656.f39957(var52, (SubLObject)UNPROVIDED));
        }
        return (SubLObject)NIL;
    }

    public static SubLObject f40700(final SubLObject var8, SubLObject var56) {
        if (var56 == UNPROVIDED) {
            var56 = (SubLObject)NIL;
        }
        final SubLThread var57 = SubLProcess.currentSubLThread();
        if (NIL == var56) {
            var56 = (SubLObject)$ic101$;
        }
        final SubLObject var58 = module0656.f39832((SubLObject)$ic48$);
        module0642.f39020(module0015.$g381$.getGlobalValue());
        module0642.f39020(module0015.$g383$.getGlobalValue());
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        module0655.f39768();
        PrintLow.format(module0015.$g131$.getDynamicValue(var57), (SubLObject)$ic102$, module0656.f39932(var8));
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        if (NIL != var58) {
            module0642.f39020(module0015.$g387$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
            module0642.f39020(var58);
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        }
        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
        final SubLObject var59 = module0015.$g533$.currentBinding(var57);
        try {
            module0015.$g533$.bind((SubLObject)T, var57);
            module0642.f39019(var56);
        }
        finally {
            module0015.$g533$.rebind(var59, var57);
        }
        module0642.f39020(module0015.$g382$.getGlobalValue());
        return var8;
    }

    public static SubLObject f40701() {
        final SubLObject var63 = $g5279$.getGlobalValue();
        if (NIL != var63) {
            module0034.f1818(var63);
        }
        return (SubLObject)NIL;
    }

    public static SubLObject f40702(final SubLObject var64) {
        return module0034.f1829($g5279$.getGlobalValue(), (SubLObject)ConsesLow.list(var64), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
    }

    public static SubLObject f40703(final SubLObject var64) {
        return module0226.f14802(var64);
    }

    public static SubLObject f40704(final SubLObject var64) {
        SubLObject var65 = $g5279$.getGlobalValue();
        if (NIL == var65) {
            var65 = module0034.f1934((SubLObject)$ic104$, (SubLObject)$ic105$, (SubLObject)$ic106$, (SubLObject)EQL, (SubLObject)ONE_INTEGER, (SubLObject)TWENTY_INTEGER);
        }
        SubLObject var66 = module0034.f1814(var65, var64, (SubLObject)$ic107$);
        if (var66 == $ic107$) {
            var66 = Values.arg2(Values.resetMultipleValues(), (SubLObject)Values.multiple_value_list(f40703(var64)));
            module0034.f1816(var65, var64, var66, (SubLObject)UNPROVIDED);
        }
        return module0034.f1959(var66);
    }

    public static SubLObject f40705(final SubLObject var6, SubLObject var67) {
        if (var67 == UNPROVIDED) {
            var67 = (SubLObject)NIL;
        }
        final SubLThread var68 = SubLProcess.currentSubLThread();
        assert NIL != module0173.f10955(var6) : var6;
        module0642.f39020(module0015.$g234$.getGlobalValue());
        module0642.f39020(module0015.$g219$.getGlobalValue());
        module0642.f39020(module0015.$g221$.getGlobalValue());
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        module0642.f39020((SubLObject)FIVE_INTEGER);
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
        final SubLObject var69 = module0015.$g533$.currentBinding(var68);
        try {
            module0015.$g533$.bind((SubLObject)T, var68);
            module0656.f39915(var6, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
            module0642.f39019((SubLObject)$ic110$);
        }
        finally {
            module0015.$g533$.rebind(var69, var68);
        }
        module0642.f39020(module0015.$g220$.getGlobalValue());
        module0642.f39020(module0015.$g235$.getGlobalValue());
        module0642.f39026((SubLObject)TWO_INTEGER);
        if (NIL == var67) {
            if (NIL != f40706(var6)) {
                module0642.f39026((SubLObject)UNPROVIDED);
            }
            if (NIL != module0127.f8414(var6)) {
                final SubLObject var70 = (SubLObject)$ic111$;
                module0642.f39020(module0015.$g219$.getGlobalValue());
                if (NIL != var70) {
                    module0642.f39020(module0015.$g222$.getGlobalValue());
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                    module0642.f39020(module0642.f39042(var70));
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                }
                module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                final SubLObject var71 = module0015.$g533$.currentBinding(var68);
                try {
                    module0015.$g533$.bind((SubLObject)T, var68);
                    module0656.f39915(var6, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                    module0642.f39019((SubLObject)$ic112$);
                }
                finally {
                    module0015.$g533$.rebind(var71, var68);
                }
                module0642.f39020(module0015.$g220$.getGlobalValue());
                module0642.f39026((SubLObject)UNPROVIDED);
            }
            f40707(var6);
            f40708(var6);
            f40709(var6);
        }
        f40710(var6);
        return (SubLObject)NIL;
    }

    public static SubLObject f40707(final SubLObject var6) {
        final SubLThread var7 = SubLProcess.currentSubLThread();
        final SubLObject var8 = (SubLObject)$ic113$;
        module0642.f39026((SubLObject)UNPROVIDED);
        module0016.f923(var8, (SubLObject)$ic43$);
        module0642.f39021((SubLObject)$ic114$);
        module0016.f908(var8, (SubLObject)$ic49$, (SubLObject)$ic45$);
        module0642.f39020(module0015.$g144$.getGlobalValue());
        if (NIL != var8) {
            module0642.f39020(module0015.$g157$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
            module0642.f39020(var8);
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        }
        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
        final SubLObject var9 = module0015.$g533$.currentBinding(var7);
        try {
            module0015.$g533$.bind((SubLObject)T, var7);
            module0642.f39020(module0015.$g346$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
            final SubLObject var3_69 = module0015.$g533$.currentBinding(var7);
            try {
                module0015.$g533$.bind((SubLObject)T, var7);
                SubLObject var10 = $g5280$.getGlobalValue();
                SubLObject var11 = (SubLObject)NIL;
                var11 = var10.first();
                while (NIL != var10) {
                    SubLObject var13;
                    final SubLObject var12 = var13 = var11;
                    SubLObject var14 = (SubLObject)NIL;
                    SubLObject var15 = (SubLObject)NIL;
                    cdestructuring_bind.destructuring_bind_must_consp(var13, var12, (SubLObject)$ic115$);
                    var14 = var13.first();
                    var13 = (var15 = var13.rest());
                    module0642.f39020(module0015.$g364$.getGlobalValue());
                    module0642.f39020(module0015.$g373$.getGlobalValue());
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                    module0642.f39020(module0642.f39049((SubLObject)$ic35$));
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                    module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                    final SubLObject var3_70 = module0015.$g533$.currentBinding(var7);
                    try {
                        module0015.$g533$.bind((SubLObject)T, var7);
                        module0642.f39020(module0015.$g360$.getGlobalValue());
                        module0642.f39020(module0015.$g370$.getGlobalValue());
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                        module0642.f39020(module0642.f39049((SubLObject)$ic116$));
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                        final SubLObject var3_71 = module0015.$g533$.currentBinding(var7);
                        try {
                            module0015.$g533$.bind((SubLObject)T, var7);
                            module0642.f39019(var14);
                        }
                        finally {
                            module0015.$g533$.rebind(var3_71, var7);
                        }
                        module0642.f39020(module0015.$g361$.getGlobalValue());
                        module0642.f39020(module0015.$g360$.getGlobalValue());
                        module0642.f39020(module0015.$g370$.getGlobalValue());
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                        module0642.f39020(module0642.f39049((SubLObject)$ic117$));
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                        final SubLObject var3_72 = module0015.$g533$.currentBinding(var7);
                        try {
                            module0015.$g533$.bind((SubLObject)T, var7);
                            module0642.f39019((SubLObject)$ic118$);
                        }
                        finally {
                            module0015.$g533$.rebind(var3_72, var7);
                        }
                        module0642.f39020(module0015.$g361$.getGlobalValue());
                        final SubLObject var16 = Functions.funcall(var15, var6);
                        module0642.f39020(module0015.$g360$.getGlobalValue());
                        module0642.f39020(module0015.$g370$.getGlobalValue());
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                        module0642.f39020(module0642.f39049((SubLObject)$ic34$));
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                        final SubLObject var3_73 = module0015.$g533$.currentBinding(var7);
                        try {
                            module0015.$g533$.bind((SubLObject)T, var7);
                            module0642.f39020(module0015.$g381$.getGlobalValue());
                            module0642.f39020(module0015.$g383$.getGlobalValue());
                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                            module0642.f39020(var16);
                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                            final SubLObject var3_74 = module0015.$g533$.currentBinding(var7);
                            try {
                                module0015.$g533$.bind((SubLObject)T, var7);
                                module0642.f39019(var16);
                            }
                            finally {
                                module0015.$g533$.rebind(var3_74, var7);
                            }
                            module0642.f39020(module0015.$g382$.getGlobalValue());
                        }
                        finally {
                            module0015.$g533$.rebind(var3_73, var7);
                        }
                        module0642.f39020(module0015.$g361$.getGlobalValue());
                    }
                    finally {
                        module0015.$g533$.rebind(var3_70, var7);
                    }
                    module0642.f39020(module0015.$g365$.getGlobalValue());
                    module0642.f39029((SubLObject)UNPROVIDED);
                    var10 = var10.rest();
                    var11 = var10.first();
                }
            }
            finally {
                module0015.$g533$.rebind(var3_69, var7);
            }
            module0642.f39020(module0015.$g347$.getGlobalValue());
        }
        finally {
            module0015.$g533$.rebind(var9, var7);
        }
        module0642.f39020(module0015.$g145$.getGlobalValue());
        module0642.f39029((SubLObject)UNPROVIDED);
        return var6;
    }

    public static SubLObject f40708(final SubLObject var6) {
        final SubLThread var7 = SubLProcess.currentSubLThread();
        final SubLObject var8 = module0067.f4880(Symbols.symbol_function((SubLObject)EQUAL), (SubLObject)UNPROVIDED);
        if (NIL != constant_handles_oc.f8463($ic119$, (SubLObject)UNPROVIDED)) {
            SubLObject var9 = module0423.f29608($ic119$, (SubLObject)UNPROVIDED);
            SubLObject var10 = (SubLObject)NIL;
            var10 = var9.first();
            while (NIL != var9) {
                final SubLObject var11 = module0233.f15369((SubLObject)$ic120$, var10);
                final SubLObject var12 = module0233.f15369((SubLObject)$ic121$, var10);
                final SubLObject var13 = module0233.f15369((SubLObject)$ic122$, var10);
                final SubLObject var14 = $ic123$;
                final SubLObject var15 = module0423.f29563($ic123$);
                final SubLObject var16 = module0205.f13250(var6, (SubLObject)$ic124$, module0205.f13250(var12, (SubLObject)$ic125$, module0205.f13250(var11, (SubLObject)$ic126$, var15, Symbols.symbol_function((SubLObject)EQUAL), (SubLObject)UNPROVIDED), Symbols.symbol_function((SubLObject)EQUAL), (SubLObject)UNPROVIDED), Symbols.symbol_function((SubLObject)EQUAL), (SubLObject)UNPROVIDED);
                final SubLObject var17 = module0423.f29569(var14);
                SubLObject var18_90 = module0409.f28506(var16, var17, module0423.f29573(var14));
                SubLObject var18 = (SubLObject)NIL;
                var18 = var18_90.first();
                while (NIL != var18_90) {
                    if (NIL != module0035.f1997(var18)) {
                        module0084.f5765(var8, var13, module0233.f15370(module0035.f2113(var18)), Symbols.symbol_function((SubLObject)EQUAL), (SubLObject)UNPROVIDED);
                    }
                    var18_90 = var18_90.rest();
                    var18 = var18_90.first();
                }
                var9 = var9.rest();
                var10 = var9.first();
            }
        }
        if (NIL == module0067.f4882(var8)) {
            final SubLObject var19 = (SubLObject)$ic127$;
            module0642.f39026((SubLObject)UNPROVIDED);
            module0016.f923(var19, (SubLObject)$ic43$);
            module0642.f39021((SubLObject)$ic128$);
            module0016.f908(var19, (SubLObject)$ic49$, (SubLObject)$ic45$);
            module0642.f39020(module0015.$g144$.getGlobalValue());
            if (NIL != var19) {
                module0642.f39020(module0015.$g157$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                module0642.f39020(var19);
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
            }
            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
            final SubLObject var20 = module0015.$g533$.currentBinding(var7);
            try {
                module0015.$g533$.bind((SubLObject)T, var7);
                module0642.f39020(module0015.$g346$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                final SubLObject var3_92 = module0015.$g533$.currentBinding(var7);
                try {
                    module0015.$g533$.bind((SubLObject)T, var7);
                    SubLObject var21;
                    for (var21 = module0066.f4838(module0067.f4891(var8)); NIL == module0066.f4841(var21); var21 = module0066.f4840(var21)) {
                        var7.resetMultipleValues();
                        final SubLObject var13 = module0066.f4839(var21);
                        final SubLObject var22 = var7.secondMultipleValue();
                        var7.resetMultipleValues();
                        module0642.f39020(module0015.$g364$.getGlobalValue());
                        module0642.f39020(module0015.$g373$.getGlobalValue());
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                        module0642.f39020(module0642.f39049((SubLObject)$ic35$));
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                        final SubLObject var3_93 = module0015.$g533$.currentBinding(var7);
                        try {
                            module0015.$g533$.bind((SubLObject)T, var7);
                            module0642.f39020(module0015.$g360$.getGlobalValue());
                            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                            final SubLObject var3_94 = module0015.$g533$.currentBinding(var7);
                            try {
                                module0015.$g533$.bind((SubLObject)T, var7);
                                module0642.f39032((SubLObject)THREE_INTEGER);
                            }
                            finally {
                                module0015.$g533$.rebind(var3_94, var7);
                            }
                            module0642.f39020(module0015.$g361$.getGlobalValue());
                            module0642.f39020(module0015.$g360$.getGlobalValue());
                            module0642.f39020(module0015.$g370$.getGlobalValue());
                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                            module0642.f39020(module0642.f39049((SubLObject)$ic116$));
                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                            final SubLObject var3_95 = module0015.$g533$.currentBinding(var7);
                            try {
                                module0015.$g533$.bind((SubLObject)T, var7);
                                module0642.f39019(var13);
                            }
                            finally {
                                module0015.$g533$.rebind(var3_95, var7);
                            }
                            module0642.f39020(module0015.$g361$.getGlobalValue());
                            module0642.f39020(module0015.$g360$.getGlobalValue());
                            module0642.f39020(module0015.$g370$.getGlobalValue());
                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                            module0642.f39020(module0642.f39049((SubLObject)$ic117$));
                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                            final SubLObject var3_96 = module0015.$g533$.currentBinding(var7);
                            try {
                                module0015.$g533$.bind((SubLObject)T, var7);
                                module0642.f39019((SubLObject)$ic118$);
                            }
                            finally {
                                module0015.$g533$.rebind(var3_96, var7);
                            }
                            module0642.f39020(module0015.$g361$.getGlobalValue());
                            module0642.f39020(module0015.$g360$.getGlobalValue());
                            module0642.f39020(module0015.$g370$.getGlobalValue());
                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                            module0642.f39020(module0642.f39049((SubLObject)$ic34$));
                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                            final SubLObject var3_97 = module0015.$g533$.currentBinding(var7);
                            try {
                                module0015.$g533$.bind((SubLObject)T, var7);
                                SubLObject var23 = (SubLObject)NIL;
                                SubLObject var24 = (SubLObject)NIL;
                                SubLObject var25 = (SubLObject)NIL;
                                var23 = var22;
                                var24 = var23.first();
                                for (var25 = (SubLObject)ZERO_INTEGER; NIL != var23; var23 = var23.rest(), var24 = var23.first(), var25 = Numbers.add((SubLObject)ONE_INTEGER, var25)) {
                                    if (!var25.eql((SubLObject)ZERO_INTEGER)) {
                                        module0642.f39026((SubLObject)UNPROVIDED);
                                    }
                                    module0642.f39020(module0015.$g381$.getGlobalValue());
                                    module0642.f39020(module0015.$g383$.getGlobalValue());
                                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                                    module0642.f39020(var24);
                                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                                    module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                                    final SubLObject var3_98 = module0015.$g533$.currentBinding(var7);
                                    try {
                                        module0015.$g533$.bind((SubLObject)T, var7);
                                        module0642.f39019(module0589.f35872(var24));
                                    }
                                    finally {
                                        module0015.$g533$.rebind(var3_98, var7);
                                    }
                                    module0642.f39020(module0015.$g382$.getGlobalValue());
                                }
                            }
                            finally {
                                module0015.$g533$.rebind(var3_97, var7);
                            }
                            module0642.f39020(module0015.$g361$.getGlobalValue());
                        }
                        finally {
                            module0015.$g533$.rebind(var3_93, var7);
                        }
                        module0642.f39020(module0015.$g365$.getGlobalValue());
                        module0642.f39029((SubLObject)UNPROVIDED);
                    }
                    module0066.f4842(var21);
                }
                finally {
                    module0015.$g533$.rebind(var3_92, var7);
                }
                module0642.f39020(module0015.$g347$.getGlobalValue());
            }
            finally {
                module0015.$g533$.rebind(var20, var7);
            }
            module0642.f39020(module0015.$g145$.getGlobalValue());
            module0642.f39029((SubLObject)UNPROVIDED);
        }
        return var6;
    }

    public static SubLObject f40709(final SubLObject var6) {
        final SubLThread var7 = SubLProcess.currentSubLThread();
        SubLObject var8 = f40711(var6);
        if (NIL != var8) {
            module0642.f39026((SubLObject)UNPROVIDED);
            var8 = Sort.sort(var8, Symbols.symbol_function((SubLObject)$ic129$), Symbols.symbol_function((SubLObject)$ic130$));
            final SubLObject var9 = (SubLObject)$ic131$;
            module0016.f923(var9, (SubLObject)$ic43$);
            module0642.f39021((SubLObject)$ic132$);
            module0016.f908(var9, (SubLObject)$ic49$, (SubLObject)$ic45$);
            module0642.f39020(module0015.$g144$.getGlobalValue());
            if (NIL != var9) {
                module0642.f39020(module0015.$g157$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                module0642.f39020(var9);
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
            }
            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
            final SubLObject var10 = module0015.$g533$.currentBinding(var7);
            try {
                module0015.$g533$.bind((SubLObject)T, var7);
                SubLObject var11 = var8;
                SubLObject var12 = (SubLObject)NIL;
                var12 = var11.first();
                while (NIL != var11) {
                    final SubLObject var13 = module0217.f14425((SubLObject)ConsesLow.list($ic133$, var6, var12));
                    module0642.f39032((SubLObject)ONE_INTEGER);
                    if (NIL != var13) {
                        SubLObject var18_107 = var13;
                        SubLObject var14 = (SubLObject)NIL;
                        var14 = var18_107.first();
                        while (NIL != var18_107) {
                            module0656.f39921(var14, (SubLObject)T);
                            var18_107 = var18_107.rest();
                            var14 = var18_107.first();
                        }
                    }
                    else {
                        module0656.f39915(var12, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                    }
                    var11 = var11.rest();
                    var12 = var11.first();
                }
            }
            finally {
                module0015.$g533$.rebind(var10, var7);
            }
            module0642.f39020(module0015.$g145$.getGlobalValue());
            module0642.f39029((SubLObject)UNPROVIDED);
        }
        return var6;
    }

    public static SubLObject f40711(final SubLObject var6) {
        final SubLThread var7 = SubLProcess.currentSubLThread();
        SubLObject var8 = (SubLObject)NIL;
        final SubLObject var9 = module0147.$g2094$.currentBinding(var7);
        final SubLObject var10 = module0147.$g2095$.currentBinding(var7);
        try {
            module0147.$g2094$.bind((SubLObject)$ic134$, var7);
            module0147.$g2095$.bind($ic135$, var7);
            var8 = module0259.f16994(var6, $ic136$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        }
        finally {
            module0147.$g2095$.rebind(var10, var7);
            module0147.$g2094$.rebind(var9, var7);
        }
        var8 = Sort.sort(var8, Symbols.symbol_function((SubLObject)$ic137$), (SubLObject)UNPROVIDED);
        return var8;
    }

    public static SubLObject f40706(final SubLObject var6) {
        if (NIL != module0173.f10955(var6)) {
            final SubLObject var7 = module0617.f37871(var6, (SubLObject)UNPROVIDED);
            final SubLObject var8 = module0617.f37872(var6, (SubLObject)UNPROVIDED);
            final SubLObject var9 = module0617.f37874(var6, (SubLObject)UNPROVIDED);
            final SubLObject var10 = module0617.f37875(var6, (SubLObject)UNPROVIDED);
            if (NIL != var7 || NIL != var8 || NIL != var10 || NIL != var9) {
                module0642.f39019((SubLObject)$ic138$);
                if (NIL != var7) {
                    module0642.f39019((SubLObject)$ic139$);
                    module0656.f39802(var7);
                }
                if (NIL != var8) {
                    module0642.f39019((SubLObject)$ic140$);
                    module0656.f39800(var8);
                }
                if (NIL != var10) {
                    module0642.f39019((SubLObject)$ic141$);
                    module0656.f39801(var10);
                }
                if (NIL != var9) {
                    module0642.f39019((SubLObject)$ic142$);
                    module0656.f39915(var9, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                }
                return (SubLObject)T;
            }
        }
        return (SubLObject)NIL;
    }

    public static SubLObject f40712(final SubLObject var6) {
        if (NIL != module0173.f10955(var6)) {
            final SubLObject var7 = module0617.f37871(var6, (SubLObject)UNPROVIDED);
            final SubLObject var8 = module0617.f37872(var6, (SubLObject)UNPROVIDED);
            final SubLObject var9 = module0617.f37874(var6, (SubLObject)UNPROVIDED);
            final SubLObject var10 = module0617.f37875(var6, (SubLObject)UNPROVIDED);
            if (NIL != var7 || NIL != var8 || NIL != var10 || NIL != var9) {
                f40713();
                if (NIL != var7) {
                    f40714($ic143$, var6, var7);
                    module0642.f39026((SubLObject)UNPROVIDED);
                }
                if (NIL != var9) {
                    f40714($ic144$, var6, var9);
                    module0642.f39026((SubLObject)UNPROVIDED);
                }
                if (NIL != var8) {
                    f40714($ic145$, var6, var8);
                    module0642.f39026((SubLObject)UNPROVIDED);
                }
                if (NIL != var10) {
                    f40714($ic146$, var6, var10);
                    module0642.f39026((SubLObject)UNPROVIDED);
                }
                return (SubLObject)T;
            }
        }
        return (SubLObject)NIL;
    }

    public static SubLObject f40714(final SubLObject var35, final SubLObject var115, final SubLObject var116) {
        final SubLObject var117 = module0202.f12768(var35, var115, var116);
        module0672.f41050(var117, $ic147$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        return (SubLObject)NIL;
    }

    public static SubLObject f40713() {
        final SubLThread var2 = SubLProcess.currentSubLThread();
        module0642.f39020(module0015.$g234$.getGlobalValue());
        module0642.f39020(module0015.$g207$.getGlobalValue());
        PrintLow.format(module0015.$g131$.getDynamicValue(var2), (SubLObject)$ic148$);
        module0642.f39020(module0015.$g208$.getGlobalValue());
        module0642.f39020(module0015.$g235$.getGlobalValue());
        module0642.f39026((SubLObject)TWO_INTEGER);
        return (SubLObject)NIL;
    }

    public static SubLObject f40699(final SubLObject var8) {
        final SubLThread var9 = SubLProcess.currentSubLThread();
        final SubLObject var11;
        final SubLObject var10 = var11 = PrintLow.format((SubLObject)NIL, (SubLObject)$ic149$, var8);
        final SubLObject var12 = module0015.$g538$.currentBinding(var9);
        try {
            module0015.$g538$.bind((NIL != module0057.f4158(module0015.$g538$.getDynamicValue(var9))) ? module0015.$g538$.getDynamicValue(var9) : module0057.f4173((SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED), var9);
            module0642.f39020((SubLObject)$ic0$);
            module0642.f39029((SubLObject)UNPROVIDED);
            module0642.f39020(module0015.$g155$.getGlobalValue());
            module0642.f39020(module0015.$g153$.getGlobalValue());
            module0015.f718();
            module0655.f39766();
            module0642.f39064(module0655.$g5143$.getDynamicValue(var9), module0655.$g5142$.getDynamicValue(var9));
            final SubLObject var13 = module0014.f672((SubLObject)$ic1$);
            module0642.f39029((SubLObject)UNPROVIDED);
            module0642.f39020(module0015.$g175$.getGlobalValue());
            module0642.f39020(module0015.$g176$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
            module0642.f39020((SubLObject)$ic2$);
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
            if (NIL != var13) {
                module0642.f39020(module0015.$g178$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                module0642.f39020(var13);
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
            }
            module0642.f39020(module0015.$g177$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
            module0642.f39020((SubLObject)$ic3$);
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
            if (NIL != var11) {
                module0642.f39029((SubLObject)UNPROVIDED);
                module0642.f39020(module0015.$g173$.getGlobalValue());
                module0642.f39019(var11);
                module0642.f39020(module0015.$g174$.getGlobalValue());
            }
            module0016.f941();
            module0016.f892();
            module0016.f895();
            module0642.f39020(module0015.$g154$.getGlobalValue());
            module0642.f39029((SubLObject)UNPROVIDED);
            final SubLObject var3_120 = module0015.$g535$.currentBinding(var9);
            try {
                module0015.$g535$.bind((SubLObject)T, var9);
                module0642.f39020(module0015.$g133$.getGlobalValue());
                if (NIL != module0015.$g132$.getDynamicValue(var9)) {
                    module0642.f39020(module0015.$g135$.getGlobalValue());
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                    module0642.f39020(module0642.f39042(module0015.$g132$.getDynamicValue(var9)));
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                }
                module0642.f39020(module0015.$g137$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                module0642.f39020((SubLObject)$ic150$);
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                final SubLObject var3_121 = module0015.$g533$.currentBinding(var9);
                try {
                    module0015.$g533$.bind((SubLObject)T, var9);
                    module0642.f39020(module0015.$g144$.getGlobalValue());
                    module0642.f39020(module0015.$g157$.getGlobalValue());
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                    module0642.f39020((SubLObject)$ic151$);
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                    module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                    final SubLObject var3_122 = module0015.$g533$.currentBinding(var9);
                    try {
                        module0015.$g533$.bind((SubLObject)T, var9);
                        module0642.f39020(module0015.$g295$.getGlobalValue());
                        module0642.f39020(module0015.$g305$.getGlobalValue());
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                        module0642.f39020((SubLObject)$ic152$);
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                        module0642.f39020(module0015.$g302$.getGlobalValue());
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                        module0642.f39020((SubLObject)$ic153$);
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                        module0642.f39020(module0015.$g307$.getGlobalValue());
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                        module0642.f39019((SubLObject)$ic154$);
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                        module0642.f39020(module0015.$g160$.getGlobalValue());
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                        module0642.f39020((SubLObject)$ic155$);
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                    }
                    finally {
                        module0015.$g533$.rebind(var3_122, var9);
                    }
                    module0642.f39020(module0015.$g145$.getGlobalValue());
                    final SubLObject var3_123 = module0016.$g568$.currentBinding(var9);
                    try {
                        module0016.$g568$.bind((SubLObject)ZERO_INTEGER, var9);
                        module0016.f936();
                        module0642.f39020(module0016.$g569$.getGlobalValue());
                        final SubLObject var3_124 = module0580.$g4361$.currentBinding(var9);
                        try {
                            module0580.$g4361$.bind((SubLObject)NIL, var9);
                            var9.resetMultipleValues();
                            final SubLObject var3_125 = module0580.$g4362$.currentBinding(var9);
                            try {
                                module0580.$g4362$.bind(module0580.f35560(), var9);
                                final SubLObject var14 = var9.secondMultipleValue();
                                var9.resetMultipleValues();
                                try {
                                    var9.resetMultipleValues();
                                    final SubLObject var3_126 = module0580.$g4358$.currentBinding(var9);
                                    try {
                                        module0580.$g4358$.bind(module0580.f35544(), var9);
                                        final SubLObject var15 = var9.secondMultipleValue();
                                        var9.resetMultipleValues();
                                        final SubLObject var3_127 = module0580.$g4359$.currentBinding(var9);
                                        try {
                                            module0580.$g4359$.bind(module0580.f35545(), var9);
                                            final SubLObject var16 = module0580.$g4358$.getDynamicValue(var9);
                                            final SubLObject var3_128 = module0034.$g879$.currentBinding(var9);
                                            try {
                                                module0034.$g879$.bind(var16, var9);
                                                SubLObject var17 = (SubLObject)NIL;
                                                if (NIL != var16 && NIL == module0034.f1842(var16)) {
                                                    var17 = module0034.f1869(var16);
                                                    final SubLObject var18 = Threads.current_process();
                                                    if (NIL == var17) {
                                                        module0034.f1873(var16, var18);
                                                    }
                                                    else if (!var17.eql(var18)) {
                                                        Errors.error((SubLObject)$ic156$);
                                                    }
                                                }
                                                try {
                                                    final SubLObject var3_129 = module0579.$g4260$.currentBinding(var9);
                                                    final SubLObject var19 = module0579.$g4259$.currentBinding(var9);
                                                    try {
                                                        module0579.$g4260$.bind(module0677.f41312(), var9);
                                                        module0579.$g4259$.bind((SubLObject)$ic157$, var9);
                                                        if (NIL != module0173.f10955(var8)) {
                                                            f40705(var8, (SubLObject)UNPROVIDED);
                                                        }
                                                        else if (NIL != module0210.f13595(var8, (SubLObject)UNPROVIDED)) {
                                                            module0663.f40331(var8);
                                                        }
                                                        else {
                                                            Errors.warn((SubLObject)$ic158$, var8);
                                                        }
                                                    }
                                                    finally {
                                                        module0579.$g4259$.rebind(var19, var9);
                                                        module0579.$g4260$.rebind(var3_129, var9);
                                                    }
                                                }
                                                finally {
                                                    final SubLObject var3_130 = Threads.$is_thread_performing_cleanupP$.currentBinding(var9);
                                                    try {
                                                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)T, var9);
                                                        if (NIL != var16 && NIL == var17) {
                                                            module0034.f1873(var16, (SubLObject)NIL);
                                                        }
                                                    }
                                                    finally {
                                                        Threads.$is_thread_performing_cleanupP$.rebind(var3_130, var9);
                                                    }
                                                }
                                            }
                                            finally {
                                                module0034.$g879$.rebind(var3_128, var9);
                                            }
                                        }
                                        finally {
                                            module0580.$g4359$.rebind(var3_127, var9);
                                        }
                                        if (var15 == $ic159$ && NIL != module0034.f1839(module0580.$g4358$.getDynamicValue(var9))) {
                                            module0034.f1891(module0580.$g4358$.getDynamicValue(var9));
                                        }
                                    }
                                    finally {
                                        module0580.$g4358$.rebind(var3_126, var9);
                                    }
                                }
                                finally {
                                    final SubLObject var3_131 = Threads.$is_thread_performing_cleanupP$.currentBinding(var9);
                                    try {
                                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)T, var9);
                                        if (NIL == var14) {
                                            module0580.f35554(module0580.$g4362$.getDynamicValue(var9));
                                        }
                                    }
                                    finally {
                                        Threads.$is_thread_performing_cleanupP$.rebind(var3_131, var9);
                                    }
                                }
                            }
                            finally {
                                module0580.$g4362$.rebind(var3_125, var9);
                            }
                        }
                        finally {
                            module0580.$g4361$.rebind(var3_124, var9);
                        }
                    }
                    finally {
                        module0016.$g568$.rebind(var3_123, var9);
                    }
                    module0642.f39029((SubLObject)UNPROVIDED);
                    module0642.f39050();
                }
                finally {
                    module0015.$g533$.rebind(var3_121, var9);
                }
                module0642.f39020(module0015.$g134$.getGlobalValue());
                module0642.f39029((SubLObject)UNPROVIDED);
            }
            finally {
                module0015.$g535$.rebind(var3_120, var9);
            }
            module0642.f39020(module0015.$g156$.getGlobalValue());
            module0642.f39029((SubLObject)UNPROVIDED);
        }
        finally {
            module0015.$g538$.rebind(var12, var9);
        }
        return (SubLObject)NIL;
    }

    public static SubLObject f40710(final SubLObject var6) {
        final SubLThread var7 = SubLProcess.currentSubLThread();
        final SubLObject var8 = module0655.$g5125$.currentBinding(var7);
        try {
            module0655.$g5125$.bind((SubLObject)NIL, var7);
            SubLObject var9 = (SubLObject)NIL;
            SubLObject var10 = (SubLObject)NIL;
            SubLObject var11 = module0217.f14228(var6, (SubLObject)ONE_INTEGER, (SubLObject)UNPROVIDED);
            SubLObject var12 = (SubLObject)NIL;
            var12 = var11.first();
            while (NIL != var11) {
                if (NIL != f40704(var12)) {
                    var10 = (SubLObject)ConsesLow.cons(var12, var10);
                }
                var11 = var11.rest();
                var12 = var11.first();
            }
            var10 = module0656.f39826(var6, var10, (SubLObject)UNPROVIDED);
            module0642.f39026((SubLObject)TWO_INTEGER);
            if (NIL != var10) {
                var11 = var10;
                var12 = (SubLObject)NIL;
                var12 = var11.first();
                while (NIL != var11) {
                    SubLObject var13 = (SubLObject)NIL;
                    final SubLObject var3_140 = module0147.$g2094$.currentBinding(var7);
                    final SubLObject var14 = module0147.$g2095$.currentBinding(var7);
                    try {
                        module0147.$g2094$.bind((SubLObject)$ic134$, var7);
                        module0147.$g2095$.bind($ic135$, var7);
                        var13 = module0219.f14509(var6, (SubLObject)ONE_INTEGER, var12, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                    }
                    finally {
                        module0147.$g2095$.rebind(var14, var7);
                        module0147.$g2094$.rebind(var3_140, var7);
                    }
                    if (NIL != var13) {
                        SubLObject var18_141 = var13;
                        SubLObject var15 = (SubLObject)NIL;
                        var15 = var18_141.first();
                        while (NIL != var18_141) {
                            var9 = f40715(var15, var9, (SubLObject)UNPROVIDED);
                            if (var12.eql($ic160$)) {
                                final SubLObject var16 = module0178.f11335(var15);
                                SubLObject var17 = (SubLObject)NIL;
                                SubLObject var18_142 = module0217.f14228(var16, (SubLObject)ONE_INTEGER, (SubLObject)UNPROVIDED);
                                SubLObject var18 = (SubLObject)NIL;
                                var18 = var18_142.first();
                                while (NIL != var18_142) {
                                    if (NIL != f40704(var18)) {
                                        final SubLObject var3_141 = module0147.$g2094$.currentBinding(var7);
                                        final SubLObject var19 = module0147.$g2095$.currentBinding(var7);
                                        try {
                                            module0147.$g2094$.bind((SubLObject)$ic134$, var7);
                                            module0147.$g2095$.bind($ic135$, var7);
                                            var17 = module0219.f14509(var16, (SubLObject)ONE_INTEGER, var18, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                                        }
                                        finally {
                                            module0147.$g2095$.rebind(var19, var7);
                                            module0147.$g2094$.rebind(var3_141, var7);
                                        }
                                        if (NIL != var17) {
                                            SubLObject var18_143 = var17;
                                            SubLObject var20 = (SubLObject)NIL;
                                            var20 = var18_143.first();
                                            while (NIL != var18_143) {
                                                var9 = f40715(var20, var9, (SubLObject)NIL);
                                                var18_143 = var18_143.rest();
                                                var20 = var18_143.first();
                                            }
                                        }
                                    }
                                    var18_142 = var18_142.rest();
                                    var18 = var18_142.first();
                                }
                            }
                            module0642.f39026((SubLObject)UNPROVIDED);
                            var18_141 = var18_141.rest();
                            var15 = var18_141.first();
                        }
                    }
                    var11 = var11.rest();
                    var12 = var11.first();
                }
            }
            else {
                module0642.f39020(module0015.$g234$.getGlobalValue());
                module0642.f39019((SubLObject)$ic161$);
                module0656.f39915(var6, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                module0642.f39026((SubLObject)UNPROVIDED);
                module0642.f39020(module0015.$g235$.getGlobalValue());
            }
        }
        finally {
            module0655.$g5125$.rebind(var8, var7);
        }
        return (SubLObject)NIL;
    }

    public static SubLObject f40715(final SubLObject var108, SubLObject var137, SubLObject var150) {
        if (var137 == UNPROVIDED) {
            var137 = (SubLObject)NIL;
        }
        if (var150 == UNPROVIDED) {
            var150 = (SubLObject)T;
        }
        final SubLThread var151 = SubLProcess.currentSubLThread();
        assert NIL != assertion_handles_oc.f11035(var108) : var108;
        final SubLObject var152 = module0178.f11287(var108);
        if (NIL == module0161.f10513(var152, var137)) {
            module0642.f39020(module0015.$g209$.getGlobalValue());
            if (NIL != module0655.$g5112$.getDynamicValue(var151)) {
                module0642.f39019((SubLObject)$ic163$);
            }
            else {
                module0642.f39019((SubLObject)$ic164$);
            }
            module0656.f39915(var152, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
            module0642.f39020(module0015.$g210$.getGlobalValue());
            module0642.f39026((SubLObject)UNPROVIDED);
        }
        if (NIL != var150 && NIL != module0226.f14807(module0178.f11333(var108))) {
            module0656.f39915(module0178.f11333(var108), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
            module0642.f39019((SubLObject)$ic118$);
            module0656.f39921(var108, (SubLObject)T);
        }
        else {
            module0656.f39804(var108, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        }
        module0642.f39026((SubLObject)UNPROVIDED);
        return var152;
    }

    public static SubLObject f40716(final SubLObject var152) {
        module0656.f39915(var152, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        return (SubLObject)NIL;
    }

    public static SubLObject f40717(final SubLObject var52) {
        SubLObject var53 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var52, var52, (SubLObject)$ic165$);
        var53 = var52.first();
        final SubLObject var54 = var52.rest();
        if (NIL == var54) {
            final SubLObject var55 = module0656.f39957(var53, (SubLObject)UNPROVIDED);
            if (NIL != module0173.f10955(var55)) {
                f40718(var55);
            }
            else {
                if (NIL == module0210.f13595(var55, (SubLObject)UNPROVIDED)) {
                    return module0656.f39789((SubLObject)$ic99$, var53, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                }
                module0663.f40335(var55);
            }
        }
        else {
            cdestructuring_bind.cdestructuring_bind_error(var52, (SubLObject)$ic165$);
        }
        return (SubLObject)NIL;
    }

    public static SubLObject f40719(final SubLObject var8, SubLObject var56) {
        if (var56 == UNPROVIDED) {
            var56 = (SubLObject)NIL;
        }
        final SubLThread var57 = SubLProcess.currentSubLThread();
        if (NIL == var56) {
            var56 = (SubLObject)$ic167$;
        }
        final SubLObject var58 = module0656.f39832((SubLObject)$ic48$);
        module0642.f39020(module0015.$g381$.getGlobalValue());
        module0642.f39020(module0015.$g383$.getGlobalValue());
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        module0655.f39768();
        PrintLow.format(module0015.$g131$.getDynamicValue(var57), (SubLObject)$ic168$, module0656.f39932(var8));
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        if (NIL != var58) {
            module0642.f39020(module0015.$g387$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
            module0642.f39020(var58);
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        }
        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
        final SubLObject var59 = module0015.$g533$.currentBinding(var57);
        try {
            module0015.$g533$.bind((SubLObject)T, var57);
            module0642.f39019(var56);
        }
        finally {
            module0015.$g533$.rebind(var59, var57);
        }
        module0642.f39020(module0015.$g382$.getGlobalValue());
        return var8;
    }

    public static SubLObject f40718(final SubLObject var6) {
        final SubLThread var7 = SubLProcess.currentSubLThread();
        if ($ic170$ == module0660.$cb_default_index_view$.getDynamicValue(var7)) {
            return module0670.f40959(var6);
        }
        f40720(var6);
        final SubLObject var9;
        final SubLObject var8 = var9 = PrintLow.format((SubLObject)NIL, (SubLObject)$ic171$, var6);
        final SubLObject var10 = module0015.$g538$.currentBinding(var7);
        try {
            module0015.$g538$.bind((NIL != module0057.f4158(module0015.$g538$.getDynamicValue(var7))) ? module0015.$g538$.getDynamicValue(var7) : module0057.f4173((SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED), var7);
            module0642.f39020((SubLObject)$ic0$);
            module0642.f39029((SubLObject)UNPROVIDED);
            module0642.f39020(module0015.$g155$.getGlobalValue());
            module0642.f39020(module0015.$g153$.getGlobalValue());
            module0015.f718();
            module0655.f39766();
            module0642.f39064(module0655.$g5143$.getDynamicValue(var7), module0655.$g5142$.getDynamicValue(var7));
            final SubLObject var11 = module0014.f672((SubLObject)$ic1$);
            module0642.f39029((SubLObject)UNPROVIDED);
            module0642.f39020(module0015.$g175$.getGlobalValue());
            module0642.f39020(module0015.$g176$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
            module0642.f39020((SubLObject)$ic2$);
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
            if (NIL != var11) {
                module0642.f39020(module0015.$g178$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                module0642.f39020(var11);
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
            }
            module0642.f39020(module0015.$g177$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
            module0642.f39020((SubLObject)$ic3$);
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
            if (NIL != var9) {
                module0642.f39029((SubLObject)UNPROVIDED);
                module0642.f39020(module0015.$g173$.getGlobalValue());
                module0642.f39019(var9);
                module0642.f39020(module0015.$g174$.getGlobalValue());
            }
            module0016.f941();
            module0642.f39020(module0015.$g154$.getGlobalValue());
            module0642.f39029((SubLObject)UNPROVIDED);
            final SubLObject var3_156 = module0015.$g535$.currentBinding(var7);
            try {
                module0015.$g535$.bind((SubLObject)T, var7);
                module0642.f39020(module0015.$g133$.getGlobalValue());
                if (NIL != module0015.$g132$.getDynamicValue(var7)) {
                    module0642.f39020(module0015.$g135$.getGlobalValue());
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                    module0642.f39020(module0642.f39042(module0015.$g132$.getDynamicValue(var7)));
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                }
                module0642.f39020(module0015.$g137$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                module0642.f39020((SubLObject)$ic150$);
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                final SubLObject var3_157 = module0015.$g533$.currentBinding(var7);
                try {
                    module0015.$g533$.bind((SubLObject)T, var7);
                    module0642.f39020(module0015.$g144$.getGlobalValue());
                    module0642.f39020(module0015.$g157$.getGlobalValue());
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                    module0642.f39020((SubLObject)$ic151$);
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                    module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                    final SubLObject var3_158 = module0015.$g533$.currentBinding(var7);
                    try {
                        module0015.$g533$.bind((SubLObject)T, var7);
                        module0642.f39020(module0015.$g295$.getGlobalValue());
                        module0642.f39020(module0015.$g305$.getGlobalValue());
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                        module0642.f39020((SubLObject)$ic152$);
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                        module0642.f39020(module0015.$g302$.getGlobalValue());
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                        module0642.f39020((SubLObject)$ic153$);
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                        module0642.f39020(module0015.$g307$.getGlobalValue());
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                        module0642.f39019((SubLObject)$ic154$);
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                        module0642.f39020(module0015.$g160$.getGlobalValue());
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                        module0642.f39020((SubLObject)$ic155$);
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                    }
                    finally {
                        module0015.$g533$.rebind(var3_158, var7);
                    }
                    module0642.f39020(module0015.$g145$.getGlobalValue());
                    f40721(var6);
                    module0642.f39029((SubLObject)UNPROVIDED);
                    module0642.f39050();
                }
                finally {
                    module0015.$g533$.rebind(var3_157, var7);
                }
                module0642.f39020(module0015.$g134$.getGlobalValue());
                module0642.f39029((SubLObject)UNPROVIDED);
            }
            finally {
                module0015.$g535$.rebind(var3_156, var7);
            }
            module0642.f39020(module0015.$g156$.getGlobalValue());
            module0642.f39029((SubLObject)UNPROVIDED);
        }
        finally {
            module0015.$g538$.rebind(var10, var7);
        }
        return (SubLObject)NIL;
    }

    public static SubLObject f40720(final SubLObject var6) {
        return (SubLObject)NIL;
    }

    public static SubLObject f40721(final SubLObject var6) {
        f40722(var6);
        module0642.f39026((SubLObject)TWO_INTEGER);
        f40723(var6);
        return (SubLObject)NIL;
    }

    public static SubLObject f40723(final SubLObject var6) {
        final SubLThread var7 = SubLProcess.currentSubLThread();
        module0642.f39020(module0015.$g144$.getGlobalValue());
        module0642.f39020(module0015.$g157$.getGlobalValue());
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        module0642.f39020((SubLObject)$ic151$);
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
        SubLObject var8 = module0015.$g533$.currentBinding(var7);
        try {
            module0015.$g533$.bind((SubLObject)T, var7);
            module0642.f39020(module0015.$g295$.getGlobalValue());
            module0642.f39020(module0015.$g305$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
            module0642.f39020((SubLObject)$ic152$);
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
            module0642.f39020(module0015.$g302$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
            module0642.f39020((SubLObject)$ic153$);
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
            module0642.f39020(module0015.$g307$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
            module0642.f39019((SubLObject)$ic172$);
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
        }
        finally {
            module0015.$g533$.rebind(var8, var7);
        }
        module0642.f39020(module0015.$g145$.getGlobalValue());
        var8 = module0661.$g5224$.currentBinding(var7);
        try {
            module0661.$g5224$.bind((SubLObject)NIL, var7);
            f40724((SubLObject)ONE_INTEGER);
            final SubLObject var3_159 = module0655.$g5125$.currentBinding(var7);
            try {
                module0655.$g5125$.bind((SubLObject)NIL, var7);
                SubLObject var10;
                final SubLObject var9 = var10 = module0656.f39825(var6);
                SubLObject var11 = (SubLObject)NIL;
                var11 = var10.first();
                while (NIL != var10) {
                    f40725(var6, (SubLObject)ONE_INTEGER, var11);
                    var10 = var10.rest();
                    var11 = var10.first();
                }
                f40725(var6, (SubLObject)ONE_INTEGER, $ic173$);
            }
            finally {
                module0655.$g5125$.rebind(var3_159, var7);
            }
        }
        finally {
            module0661.$g5224$.rebind(var8, var7);
        }
        return (SubLObject)NIL;
    }

    public static SubLObject f40726(final SubLObject var52) {
        final SubLThread var53 = SubLProcess.currentSubLThread();
        if (NIL != module0543.f33698()) {
            module0667.f40583((SubLObject)$ic176$);
            return (SubLObject)NIL;
        }
        final SubLObject var54 = module0656.f39937(var52);
        if (NIL == constant_handles_oc.f8449(var54)) {
            module0656.f39789((SubLObject)$ic177$, var52, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
            return (SubLObject)NIL;
        }
        final SubLObject var55 = (SubLObject)$ic178$;
        final SubLObject var56 = module0015.$g538$.currentBinding(var53);
        try {
            module0015.$g538$.bind((NIL != module0057.f4158(module0015.$g538$.getDynamicValue(var53))) ? module0015.$g538$.getDynamicValue(var53) : module0057.f4173((SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED), var53);
            module0642.f39020((SubLObject)$ic0$);
            module0642.f39029((SubLObject)UNPROVIDED);
            module0642.f39020(module0015.$g155$.getGlobalValue());
            module0642.f39020(module0015.$g153$.getGlobalValue());
            module0015.f718();
            module0655.f39766();
            module0642.f39064(module0655.$g5143$.getDynamicValue(var53), module0655.$g5142$.getDynamicValue(var53));
            final SubLObject var57 = module0014.f672((SubLObject)$ic1$);
            module0642.f39029((SubLObject)UNPROVIDED);
            module0642.f39020(module0015.$g175$.getGlobalValue());
            module0642.f39020(module0015.$g176$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
            module0642.f39020((SubLObject)$ic2$);
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
            if (NIL != var57) {
                module0642.f39020(module0015.$g178$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                module0642.f39020(var57);
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
            }
            module0642.f39020(module0015.$g177$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
            module0642.f39020((SubLObject)$ic3$);
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
            module0016.f941();
            if (NIL != var55) {
                module0642.f39029((SubLObject)UNPROVIDED);
                module0642.f39020(module0015.$g173$.getGlobalValue());
                module0642.f39019(var55);
                module0642.f39020(module0015.$g174$.getGlobalValue());
            }
            module0642.f39020(module0015.$g154$.getGlobalValue());
            module0642.f39029((SubLObject)UNPROVIDED);
            final SubLObject var3_162 = module0015.$g535$.currentBinding(var53);
            try {
                module0015.$g535$.bind((SubLObject)T, var53);
                module0642.f39020(module0015.$g133$.getGlobalValue());
                if (NIL != module0015.$g132$.getDynamicValue(var53)) {
                    module0642.f39020(module0015.$g135$.getGlobalValue());
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                    module0642.f39020(module0642.f39042(module0015.$g132$.getDynamicValue(var53)));
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                }
                module0642.f39020(module0015.$g137$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                module0642.f39020((SubLObject)$ic150$);
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                final SubLObject var3_163 = module0015.$g533$.currentBinding(var53);
                try {
                    module0015.$g533$.bind((SubLObject)T, var53);
                    module0642.f39020(module0015.$g144$.getGlobalValue());
                    module0642.f39020(module0015.$g157$.getGlobalValue());
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                    module0642.f39020((SubLObject)$ic151$);
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                    module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                    final SubLObject var3_164 = module0015.$g533$.currentBinding(var53);
                    try {
                        module0015.$g533$.bind((SubLObject)T, var53);
                        module0642.f39020(module0015.$g295$.getGlobalValue());
                        module0642.f39020(module0015.$g305$.getGlobalValue());
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                        module0642.f39020((SubLObject)$ic152$);
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                        module0642.f39020(module0015.$g302$.getGlobalValue());
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                        module0642.f39020((SubLObject)$ic153$);
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                        module0642.f39020(module0015.$g307$.getGlobalValue());
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                        module0642.f39019((SubLObject)$ic172$);
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                    }
                    finally {
                        module0015.$g533$.rebind(var3_164, var53);
                    }
                    module0642.f39020(module0015.$g145$.getGlobalValue());
                    if (NIL != var55) {
                        module0642.f39020(module0015.$g189$.getGlobalValue());
                        module0642.f39020((SubLObject)TWO_INTEGER);
                        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                        module0642.f39019(var55);
                        module0642.f39020(module0015.$g190$.getGlobalValue());
                        module0642.f39020((SubLObject)TWO_INTEGER);
                        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                    }
                    module0642.f39020(module0015.$g282$.getGlobalValue());
                    module0642.f39020(module0015.$g284$.getGlobalValue());
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                    module0642.f39020(module0110.$g570$.getDynamicValue(var53));
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                    module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                    final SubLObject var3_165 = module0015.$g533$.currentBinding(var53);
                    final SubLObject var58 = module0015.$g541$.currentBinding(var53);
                    final SubLObject var59 = module0015.$g539$.currentBinding(var53);
                    try {
                        module0015.$g533$.bind((SubLObject)T, var53);
                        module0015.$g541$.bind((SubLObject)T, var53);
                        module0015.$g539$.bind(module0015.f797(), var53);
                        module0656.f39870((SubLObject)$ic174$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                        module0642.f39020(module0015.$g234$.getGlobalValue());
                        module0642.f39019((SubLObject)$ic181$);
                        module0642.f39032((SubLObject)UNPROVIDED);
                        module0656.f39915(var54, (SubLObject)ZERO_INTEGER, (SubLObject)T);
                        module0642.f39026((SubLObject)TWO_INTEGER);
                        module0642.f39020(module0015.$g235$.getGlobalValue());
                        module0642.f39020(module0015.$g346$.getGlobalValue());
                        module0642.f39020(module0015.$g352$.getGlobalValue());
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                        module0642.f39020((SubLObject)ZERO_INTEGER);
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                        final SubLObject var3_166 = module0015.$g533$.currentBinding(var53);
                        try {
                            module0015.$g533$.bind((SubLObject)T, var53);
                            module0642.f39020(module0015.$g364$.getGlobalValue());
                            module0642.f39020(module0015.$g373$.getGlobalValue());
                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                            module0642.f39020(module0642.f39049((SubLObject)$ic35$));
                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                            final SubLObject var3_167 = module0015.$g533$.currentBinding(var53);
                            try {
                                module0015.$g533$.bind((SubLObject)T, var53);
                                module0642.f39020(module0015.$g360$.getGlobalValue());
                                module0642.f39046(module0015.$g369$.getGlobalValue());
                                module0642.f39020(module0015.$g370$.getGlobalValue());
                                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                                module0642.f39020(module0642.f39049((SubLObject)$ic116$));
                                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                                module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                                final SubLObject var3_168 = module0015.$g533$.currentBinding(var53);
                                try {
                                    module0015.$g533$.bind((SubLObject)T, var53);
                                    module0642.f39020(module0015.$g234$.getGlobalValue());
                                    module0642.f39019((SubLObject)$ic182$);
                                    module0642.f39020(module0015.$g235$.getGlobalValue());
                                }
                                finally {
                                    module0015.$g533$.rebind(var3_168, var53);
                                }
                                module0642.f39020(module0015.$g361$.getGlobalValue());
                                module0642.f39020(module0015.$g360$.getGlobalValue());
                                module0642.f39020(module0015.$g370$.getGlobalValue());
                                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                                module0642.f39020(module0642.f39049((SubLObject)$ic34$));
                                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                                module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                                final SubLObject var3_169 = module0015.$g533$.currentBinding(var53);
                                try {
                                    module0015.$g533$.bind((SubLObject)T, var53);
                                    module0656.f39804(constants_high_oc.f10743(var54), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                                }
                                finally {
                                    module0015.$g533$.rebind(var3_169, var53);
                                }
                                module0642.f39020(module0015.$g361$.getGlobalValue());
                            }
                            finally {
                                module0015.$g533$.rebind(var3_167, var53);
                            }
                            module0642.f39020(module0015.$g365$.getGlobalValue());
                            module0642.f39029((SubLObject)UNPROVIDED);
                            module0642.f39020(module0015.$g364$.getGlobalValue());
                            module0642.f39020(module0015.$g373$.getGlobalValue());
                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                            module0642.f39020(module0642.f39049((SubLObject)$ic35$));
                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                            final SubLObject var3_170 = module0015.$g533$.currentBinding(var53);
                            try {
                                module0015.$g533$.bind((SubLObject)T, var53);
                                module0642.f39020(module0015.$g360$.getGlobalValue());
                                module0642.f39046(module0015.$g369$.getGlobalValue());
                                module0642.f39020(module0015.$g370$.getGlobalValue());
                                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                                module0642.f39020(module0642.f39049((SubLObject)$ic116$));
                                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                                module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                                final SubLObject var3_171 = module0015.$g533$.currentBinding(var53);
                                try {
                                    module0015.$g533$.bind((SubLObject)T, var53);
                                    module0642.f39020(module0015.$g230$.getGlobalValue());
                                    module0642.f39020(module0015.$g224$.getGlobalValue());
                                    module0642.f39019((SubLObject)$ic183$);
                                    module0642.f39020(module0015.$g225$.getGlobalValue());
                                    module0642.f39020(module0015.$g231$.getGlobalValue());
                                    module0642.f39020(module0015.$g234$.getGlobalValue());
                                    module0642.f39019((SubLObject)$ic184$);
                                    module0642.f39020(module0015.$g235$.getGlobalValue());
                                }
                                finally {
                                    module0015.$g533$.rebind(var3_171, var53);
                                }
                                module0642.f39020(module0015.$g361$.getGlobalValue());
                                module0642.f39020(module0015.$g360$.getGlobalValue());
                                module0642.f39020(module0015.$g370$.getGlobalValue());
                                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                                module0642.f39020(module0642.f39049((SubLObject)$ic34$));
                                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                                module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                                final SubLObject var3_172 = module0015.$g533$.currentBinding(var53);
                                try {
                                    module0015.$g533$.bind((SubLObject)T, var53);
                                    module0656.f39804(constant_handles_oc.f8440(var54), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                                }
                                finally {
                                    module0015.$g533$.rebind(var3_172, var53);
                                }
                                module0642.f39020(module0015.$g361$.getGlobalValue());
                            }
                            finally {
                                module0015.$g533$.rebind(var3_170, var53);
                            }
                            module0642.f39020(module0015.$g365$.getGlobalValue());
                            module0642.f39029((SubLObject)UNPROVIDED);
                            module0642.f39020(module0015.$g364$.getGlobalValue());
                            module0642.f39020(module0015.$g373$.getGlobalValue());
                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                            module0642.f39020(module0642.f39049((SubLObject)$ic35$));
                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                            final SubLObject var3_173 = module0015.$g533$.currentBinding(var53);
                            try {
                                module0015.$g533$.bind((SubLObject)T, var53);
                                module0642.f39020(module0015.$g360$.getGlobalValue());
                                module0642.f39046(module0015.$g369$.getGlobalValue());
                                module0642.f39020(module0015.$g370$.getGlobalValue());
                                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                                module0642.f39020(module0642.f39049((SubLObject)$ic116$));
                                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                                module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                                final SubLObject var3_174 = module0015.$g533$.currentBinding(var53);
                                try {
                                    module0015.$g533$.bind((SubLObject)T, var53);
                                    module0642.f39020(module0015.$g230$.getGlobalValue());
                                    module0642.f39020(module0015.$g224$.getGlobalValue());
                                    module0642.f39019((SubLObject)$ic185$);
                                    module0642.f39020(module0015.$g225$.getGlobalValue());
                                    module0642.f39020(module0015.$g231$.getGlobalValue());
                                    module0642.f39020(module0015.$g234$.getGlobalValue());
                                    module0642.f39019((SubLObject)$ic186$);
                                    module0642.f39020(module0015.$g235$.getGlobalValue());
                                }
                                finally {
                                    module0015.$g533$.rebind(var3_174, var53);
                                }
                                module0642.f39020(module0015.$g361$.getGlobalValue());
                                module0642.f39020(module0015.$g360$.getGlobalValue());
                                module0642.f39020(module0015.$g370$.getGlobalValue());
                                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                                module0642.f39020(module0642.f39049((SubLObject)$ic34$));
                                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                                module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                                final SubLObject var3_175 = module0015.$g533$.currentBinding(var53);
                                try {
                                    module0015.$g533$.bind((SubLObject)T, var53);
                                    module0656.f39804(Guids.guid_to_string(constants_high_oc.f10744(var54)), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                                }
                                finally {
                                    module0015.$g533$.rebind(var3_175, var53);
                                }
                                module0642.f39020(module0015.$g361$.getGlobalValue());
                            }
                            finally {
                                module0015.$g533$.rebind(var3_173, var53);
                            }
                            module0642.f39020(module0015.$g365$.getGlobalValue());
                            module0642.f39029((SubLObject)UNPROVIDED);
                            module0642.f39020(module0015.$g364$.getGlobalValue());
                            module0642.f39020(module0015.$g373$.getGlobalValue());
                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                            module0642.f39020(module0642.f39049((SubLObject)$ic35$));
                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                            final SubLObject var3_176 = module0015.$g533$.currentBinding(var53);
                            try {
                                module0015.$g533$.bind((SubLObject)T, var53);
                                module0642.f39020(module0015.$g360$.getGlobalValue());
                                module0642.f39046(module0015.$g369$.getGlobalValue());
                                module0642.f39020(module0015.$g370$.getGlobalValue());
                                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                                module0642.f39020(module0642.f39049((SubLObject)$ic116$));
                                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                                module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                                final SubLObject var3_177 = module0015.$g533$.currentBinding(var53);
                                try {
                                    module0015.$g533$.bind((SubLObject)T, var53);
                                    module0642.f39020(module0015.$g230$.getGlobalValue());
                                    module0642.f39020(module0015.$g224$.getGlobalValue());
                                    module0642.f39019((SubLObject)$ic187$);
                                    module0642.f39020(module0015.$g225$.getGlobalValue());
                                    module0642.f39020(module0015.$g231$.getGlobalValue());
                                    module0642.f39020(module0015.$g234$.getGlobalValue());
                                    module0642.f39019((SubLObject)$ic188$);
                                    module0642.f39020(module0015.$g235$.getGlobalValue());
                                }
                                finally {
                                    module0015.$g533$.rebind(var3_177, var53);
                                }
                                module0642.f39020(module0015.$g361$.getGlobalValue());
                                module0642.f39020(module0015.$g360$.getGlobalValue());
                                module0642.f39020(module0015.$g370$.getGlobalValue());
                                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                                module0642.f39020(module0642.f39049((SubLObject)$ic34$));
                                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                                module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                                final SubLObject var3_178 = module0015.$g533$.currentBinding(var53);
                                try {
                                    module0015.$g533$.bind((SubLObject)T, var53);
                                    module0656.f39804(module0213.f13918(var54), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                                }
                                finally {
                                    module0015.$g533$.rebind(var3_178, var53);
                                }
                                module0642.f39020(module0015.$g361$.getGlobalValue());
                            }
                            finally {
                                module0015.$g533$.rebind(var3_176, var53);
                            }
                            module0642.f39020(module0015.$g365$.getGlobalValue());
                            module0642.f39029((SubLObject)UNPROVIDED);
                        }
                        finally {
                            module0015.$g533$.rebind(var3_166, var53);
                        }
                        module0642.f39020(module0015.$g347$.getGlobalValue());
                        f40727(var54);
                        module0642.f39026((SubLObject)TWO_INTEGER);
                        module0642.f39020(module0015.$g234$.getGlobalValue());
                        module0642.f39019((SubLObject)$ic189$);
                        module0642.f39020(module0015.$g235$.getGlobalValue());
                        module0642.f39026((SubLObject)UNPROVIDED);
                        module0642.f39020(module0015.$g185$.getGlobalValue());
                        module0015.f741();
                        module0642.f39020(module0015.$g203$.getGlobalValue());
                        final SubLObject var3_179 = module0015.$g537$.currentBinding(var53);
                        try {
                            module0015.$g537$.bind((SubLObject)T, var53);
                            PrintLow.format(module0015.$g131$.getDynamicValue(var53), (SubLObject)$ic190$, constants_high_oc.f10743(var54), Guids.guid_to_string(constants_high_oc.f10744(var54)));
                        }
                        finally {
                            module0015.$g537$.rebind(var3_179, var53);
                        }
                        module0642.f39020(module0015.$g204$.getGlobalValue());
                        module0642.f39020(module0015.$g186$.getGlobalValue());
                        module0015.f799(module0015.$g539$.getDynamicValue(var53));
                    }
                    finally {
                        module0015.$g539$.rebind(var59, var53);
                        module0015.$g541$.rebind(var58, var53);
                        module0015.$g533$.rebind(var3_165, var53);
                    }
                    module0642.f39020(module0015.$g283$.getGlobalValue());
                    module0642.f39029((SubLObject)UNPROVIDED);
                    module0642.f39050();
                }
                finally {
                    module0015.$g533$.rebind(var3_163, var53);
                }
                module0642.f39020(module0015.$g134$.getGlobalValue());
                module0642.f39029((SubLObject)UNPROVIDED);
            }
            finally {
                module0015.$g535$.rebind(var3_162, var53);
            }
            module0642.f39020(module0015.$g156$.getGlobalValue());
            module0642.f39029((SubLObject)UNPROVIDED);
        }
        finally {
            module0015.$g538$.rebind(var56, var53);
        }
        return (SubLObject)NIL;
    }

    public static SubLObject f40728(final SubLObject var160) {
        final SubLThread var161 = SubLProcess.currentSubLThread();
        final SubLObject var162 = module0656.f39832((SubLObject)$ic48$);
        module0642.f39020(module0015.$g381$.getGlobalValue());
        module0642.f39020(module0015.$g383$.getGlobalValue());
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        module0655.f39768();
        PrintLow.format(module0015.$g131$.getDynamicValue(var161), (SubLObject)$ic192$, module0656.f39842(var160));
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        if (NIL != var162) {
            module0642.f39020(module0015.$g387$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
            module0642.f39020(var162);
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        }
        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
        final SubLObject var163 = module0015.$g533$.currentBinding(var161);
        try {
            module0015.$g533$.bind((SubLObject)T, var161);
            module0642.f39019((SubLObject)$ic193$);
        }
        finally {
            module0015.$g533$.rebind(var163, var161);
        }
        module0642.f39020(module0015.$g382$.getGlobalValue());
        return var160;
    }

    public static SubLObject f40729(final SubLObject var52) {
        final SubLThread var53 = SubLProcess.currentSubLThread();
        if (NIL != module0543.f33698()) {
            module0667.f40583((SubLObject)$ic197$);
            return (SubLObject)NIL;
        }
        final SubLObject var54 = module0656.f39943(var52, (SubLObject)UNPROVIDED);
        if (NIL == module0167.f10813(var54)) {
            module0656.f39789((SubLObject)$ic198$, var52, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
            return (SubLObject)NIL;
        }
        final SubLObject var55 = (SubLObject)$ic199$;
        final SubLObject var56 = module0015.$g538$.currentBinding(var53);
        try {
            module0015.$g538$.bind((NIL != module0057.f4158(module0015.$g538$.getDynamicValue(var53))) ? module0015.$g538$.getDynamicValue(var53) : module0057.f4173((SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED), var53);
            module0642.f39020((SubLObject)$ic0$);
            module0642.f39029((SubLObject)UNPROVIDED);
            module0642.f39020(module0015.$g155$.getGlobalValue());
            module0642.f39020(module0015.$g153$.getGlobalValue());
            module0015.f718();
            module0655.f39766();
            module0642.f39064(module0655.$g5143$.getDynamicValue(var53), module0655.$g5142$.getDynamicValue(var53));
            final SubLObject var57 = module0014.f672((SubLObject)$ic1$);
            module0642.f39029((SubLObject)UNPROVIDED);
            module0642.f39020(module0015.$g175$.getGlobalValue());
            module0642.f39020(module0015.$g176$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
            module0642.f39020((SubLObject)$ic2$);
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
            if (NIL != var57) {
                module0642.f39020(module0015.$g178$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                module0642.f39020(var57);
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
            }
            module0642.f39020(module0015.$g177$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
            module0642.f39020((SubLObject)$ic3$);
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
            module0016.f941();
            if (NIL != var55) {
                module0642.f39029((SubLObject)UNPROVIDED);
                module0642.f39020(module0015.$g173$.getGlobalValue());
                module0642.f39019(var55);
                module0642.f39020(module0015.$g174$.getGlobalValue());
            }
            module0642.f39020(module0015.$g154$.getGlobalValue());
            module0642.f39029((SubLObject)UNPROVIDED);
            final SubLObject var3_182 = module0015.$g535$.currentBinding(var53);
            try {
                module0015.$g535$.bind((SubLObject)T, var53);
                module0642.f39020(module0015.$g133$.getGlobalValue());
                if (NIL != module0015.$g132$.getDynamicValue(var53)) {
                    module0642.f39020(module0015.$g135$.getGlobalValue());
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                    module0642.f39020(module0642.f39042(module0015.$g132$.getDynamicValue(var53)));
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                }
                module0642.f39020(module0015.$g137$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                module0642.f39020((SubLObject)$ic150$);
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                final SubLObject var3_183 = module0015.$g533$.currentBinding(var53);
                try {
                    module0015.$g533$.bind((SubLObject)T, var53);
                    module0642.f39020(module0015.$g144$.getGlobalValue());
                    module0642.f39020(module0015.$g157$.getGlobalValue());
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                    module0642.f39020((SubLObject)$ic151$);
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                    module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                    final SubLObject var3_184 = module0015.$g533$.currentBinding(var53);
                    try {
                        module0015.$g533$.bind((SubLObject)T, var53);
                        module0642.f39020(module0015.$g295$.getGlobalValue());
                        module0642.f39020(module0015.$g305$.getGlobalValue());
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                        module0642.f39020((SubLObject)$ic152$);
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                        module0642.f39020(module0015.$g302$.getGlobalValue());
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                        module0642.f39020((SubLObject)$ic153$);
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                        module0642.f39020(module0015.$g307$.getGlobalValue());
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                        module0642.f39019((SubLObject)$ic172$);
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                    }
                    finally {
                        module0015.$g533$.rebind(var3_184, var53);
                    }
                    module0642.f39020(module0015.$g145$.getGlobalValue());
                    if (NIL != var55) {
                        module0642.f39020(module0015.$g189$.getGlobalValue());
                        module0642.f39020((SubLObject)TWO_INTEGER);
                        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                        module0642.f39019(var55);
                        module0642.f39020(module0015.$g190$.getGlobalValue());
                        module0642.f39020((SubLObject)TWO_INTEGER);
                        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                    }
                    module0642.f39020(module0015.$g282$.getGlobalValue());
                    module0642.f39020(module0015.$g284$.getGlobalValue());
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                    module0642.f39020(module0110.$g570$.getDynamicValue(var53));
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                    module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                    final SubLObject var3_185 = module0015.$g533$.currentBinding(var53);
                    final SubLObject var58 = module0015.$g541$.currentBinding(var53);
                    final SubLObject var59 = module0015.$g539$.currentBinding(var53);
                    try {
                        module0015.$g533$.bind((SubLObject)T, var53);
                        module0015.$g541$.bind((SubLObject)T, var53);
                        module0015.$g539$.bind(module0015.f797(), var53);
                        module0656.f39870((SubLObject)$ic195$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                        module0642.f39020(module0015.$g234$.getGlobalValue());
                        module0642.f39019((SubLObject)$ic200$);
                        module0642.f39032((SubLObject)UNPROVIDED);
                        module0656.f39915(var54, (SubLObject)ZERO_INTEGER, (SubLObject)T);
                        module0642.f39026((SubLObject)TWO_INTEGER);
                        module0642.f39020(module0015.$g235$.getGlobalValue());
                        module0642.f39020(module0015.$g346$.getGlobalValue());
                        module0642.f39020(module0015.$g352$.getGlobalValue());
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                        module0642.f39020((SubLObject)ZERO_INTEGER);
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                        final SubLObject var3_186 = module0015.$g533$.currentBinding(var53);
                        try {
                            module0015.$g533$.bind((SubLObject)T, var53);
                            module0642.f39020(module0015.$g364$.getGlobalValue());
                            module0642.f39020(module0015.$g373$.getGlobalValue());
                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                            module0642.f39020(module0642.f39049((SubLObject)$ic35$));
                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                            final SubLObject var3_187 = module0015.$g533$.currentBinding(var53);
                            try {
                                module0015.$g533$.bind((SubLObject)T, var53);
                                module0642.f39020(module0015.$g360$.getGlobalValue());
                                module0642.f39046(module0015.$g369$.getGlobalValue());
                                module0642.f39020(module0015.$g370$.getGlobalValue());
                                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                                module0642.f39020(module0642.f39049((SubLObject)$ic116$));
                                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                                module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                                final SubLObject var3_188 = module0015.$g533$.currentBinding(var53);
                                try {
                                    module0015.$g533$.bind((SubLObject)T, var53);
                                    module0642.f39019((SubLObject)$ic183$);
                                    module0642.f39020(module0015.$g234$.getGlobalValue());
                                    module0642.f39019((SubLObject)$ic201$);
                                    module0642.f39020(module0015.$g235$.getGlobalValue());
                                }
                                finally {
                                    module0015.$g533$.rebind(var3_188, var53);
                                }
                                module0642.f39020(module0015.$g361$.getGlobalValue());
                                module0642.f39020(module0015.$g360$.getGlobalValue());
                                module0642.f39020(module0015.$g370$.getGlobalValue());
                                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                                module0642.f39020(module0642.f39049((SubLObject)$ic34$));
                                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                                module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                                final SubLObject var3_189 = module0015.$g533$.currentBinding(var53);
                                try {
                                    module0015.$g533$.bind((SubLObject)T, var53);
                                    module0656.f39804(module0167.f10803(var54), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                                }
                                finally {
                                    module0015.$g533$.rebind(var3_189, var53);
                                }
                                module0642.f39020(module0015.$g361$.getGlobalValue());
                            }
                            finally {
                                module0015.$g533$.rebind(var3_187, var53);
                            }
                            module0642.f39020(module0015.$g365$.getGlobalValue());
                            module0642.f39029((SubLObject)UNPROVIDED);
                            module0642.f39020(module0015.$g364$.getGlobalValue());
                            module0642.f39020(module0015.$g373$.getGlobalValue());
                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                            module0642.f39020(module0642.f39049((SubLObject)$ic35$));
                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                            final SubLObject var3_190 = module0015.$g533$.currentBinding(var53);
                            try {
                                module0015.$g533$.bind((SubLObject)T, var53);
                                module0642.f39020(module0015.$g360$.getGlobalValue());
                                module0642.f39046(module0015.$g369$.getGlobalValue());
                                module0642.f39020(module0015.$g370$.getGlobalValue());
                                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                                module0642.f39020(module0642.f39049((SubLObject)$ic116$));
                                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                                module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                                final SubLObject var3_191 = module0015.$g533$.currentBinding(var53);
                                try {
                                    module0015.$g533$.bind((SubLObject)T, var53);
                                    module0642.f39020(module0015.$g234$.getGlobalValue());
                                    module0642.f39019((SubLObject)$ic202$);
                                    module0642.f39020(module0015.$g235$.getGlobalValue());
                                }
                                finally {
                                    module0015.$g533$.rebind(var3_191, var53);
                                }
                                module0642.f39020(module0015.$g361$.getGlobalValue());
                                module0642.f39020(module0015.$g360$.getGlobalValue());
                                module0642.f39020(module0015.$g370$.getGlobalValue());
                                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                                module0642.f39020(module0642.f39049((SubLObject)$ic34$));
                                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                                module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                                final SubLObject var3_192 = module0015.$g533$.currentBinding(var53);
                                try {
                                    module0015.$g533$.bind((SubLObject)T, var53);
                                    module0656.f39915(module0172.f10915(var54), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                                }
                                finally {
                                    module0015.$g533$.rebind(var3_192, var53);
                                }
                                module0642.f39020(module0015.$g361$.getGlobalValue());
                            }
                            finally {
                                module0015.$g533$.rebind(var3_190, var53);
                            }
                            module0642.f39020(module0015.$g365$.getGlobalValue());
                            module0642.f39029((SubLObject)UNPROVIDED);
                        }
                        finally {
                            module0015.$g533$.rebind(var3_186, var53);
                        }
                        module0642.f39020(module0015.$g347$.getGlobalValue());
                        module0642.f39020(module0015.$g459$.getGlobalValue());
                        module0642.f39019((SubLObject)$ic203$);
                        module0642.f39020(module0015.$g234$.getGlobalValue());
                        module0642.f39019((SubLObject)$ic204$);
                        module0642.f39020(module0015.$g235$.getGlobalValue());
                        module0642.f39019(module0213.f13918(var54));
                        module0642.f39020(module0015.$g460$.getGlobalValue());
                        f40727(var54);
                        module0015.f799(module0015.$g539$.getDynamicValue(var53));
                    }
                    finally {
                        module0015.$g539$.rebind(var59, var53);
                        module0015.$g541$.rebind(var58, var53);
                        module0015.$g533$.rebind(var3_185, var53);
                    }
                    module0642.f39020(module0015.$g283$.getGlobalValue());
                    module0642.f39029((SubLObject)UNPROVIDED);
                    module0642.f39050();
                }
                finally {
                    module0015.$g533$.rebind(var3_183, var53);
                }
                module0642.f39020(module0015.$g134$.getGlobalValue());
                module0642.f39029((SubLObject)UNPROVIDED);
            }
            finally {
                module0015.$g535$.rebind(var3_182, var53);
            }
            module0642.f39020(module0015.$g156$.getGlobalValue());
            module0642.f39029((SubLObject)UNPROVIDED);
        }
        finally {
            module0015.$g538$.rebind(var56, var53);
        }
        return (SubLObject)NIL;
    }

    public static SubLObject f40730(final SubLObject var181) {
        final SubLThread var182 = SubLProcess.currentSubLThread();
        final SubLObject var183 = module0656.f39832((SubLObject)$ic48$);
        module0642.f39020(module0015.$g381$.getGlobalValue());
        module0642.f39020(module0015.$g383$.getGlobalValue());
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        module0655.f39768();
        PrintLow.format(module0015.$g131$.getDynamicValue(var182), (SubLObject)$ic206$, module0656.f39842(var181));
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        if (NIL != var183) {
            module0642.f39020(module0015.$g387$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
            module0642.f39020(var183);
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        }
        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
        final SubLObject var184 = module0015.$g533$.currentBinding(var182);
        try {
            module0015.$g533$.bind((SubLObject)T, var182);
            module0642.f39019((SubLObject)$ic193$);
        }
        finally {
            module0015.$g533$.rebind(var184, var182);
        }
        module0642.f39020(module0015.$g382$.getGlobalValue());
        return var181;
    }

    public static SubLObject f40731(final SubLObject var193) {
        if (NIL == module0212.f13773(var193)) {
            return module0656.f39804(var193, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        }
        SubLObject var194 = var193;
        SubLObject var195 = (SubLObject)NIL;
        var195 = var194.first();
        while (NIL != var194) {
            if (!var195.eql(var193.first())) {
                module0642.f39026((SubLObject)UNPROVIDED);
            }
            module0656.f39916(var195, (SubLObject)T, (SubLObject)UNPROVIDED);
            var194 = var194.rest();
            var195 = var194.first();
        }
        return (SubLObject)NIL;
    }

    public static SubLObject f40727(final SubLObject var6) {
        final SubLObject var7 = module0340.f22929(var6);
        final SubLObject var8 = module0195.f12142(var6);
        if (NIL != var7 || NIL != var8 || NIL != var6) {
            module0642.f39026((SubLObject)UNPROVIDED);
            module0642.f39020(module0015.$g187$.getGlobalValue());
            module0642.f39021((SubLObject)$ic208$);
            module0642.f39020(module0015.$g188$.getGlobalValue());
            if (NIL != var7) {
                module0656.f39837((SubLObject)$ic209$, var6, (SubLObject)$ic210$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                module0642.f39026((SubLObject)UNPROVIDED);
            }
            if (NIL != module0358.f23700(var6)) {
                module0656.f39837((SubLObject)$ic211$, var6, (SubLObject)$ic212$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                module0642.f39026((SubLObject)UNPROVIDED);
            }
            if (NIL != module0195.f12142(var6)) {
                module0656.f39837((SubLObject)$ic213$, var6, (SubLObject)$ic214$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                module0642.f39026((SubLObject)UNPROVIDED);
            }
        }
        return (SubLObject)NIL;
    }

    public static SubLObject f40732(final SubLObject var52) {
        SubLObject var53 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var52, var52, (SubLObject)$ic87$);
        var53 = var52.first();
        final SubLObject var54 = var52.rest();
        if (NIL != var54) {
            cdestructuring_bind.cdestructuring_bind_error(var52, (SubLObject)$ic87$);
            return (SubLObject)NIL;
        }
        final SubLObject var55 = module0656.f39969(var53);
        if (NIL == module0656.f39930(var55)) {
            return module0656.f39789((SubLObject)$ic88$, var53, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        }
        return f40733(var55);
    }

    public static SubLObject f40733(final SubLObject var1) {
        final SubLThread var2 = SubLProcess.currentSubLThread();
        if (NIL != module0173.f10955(var1) && $ic170$ == module0660.$cb_default_index_view$.getDynamicValue(var2)) {
            return module0670.f40951(var1, var1, (SubLObject)NIL, (SubLObject)NIL);
        }
        final SubLObject var4;
        final SubLObject var3 = var4 = PrintLow.format((SubLObject)NIL, (SubLObject)$ic216$, var1);
        final SubLObject var5 = module0015.$g538$.currentBinding(var2);
        try {
            module0015.$g538$.bind((NIL != module0057.f4158(module0015.$g538$.getDynamicValue(var2))) ? module0015.$g538$.getDynamicValue(var2) : module0057.f4173((SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED), var2);
            module0642.f39020((SubLObject)$ic0$);
            module0642.f39029((SubLObject)UNPROVIDED);
            module0642.f39020(module0015.$g155$.getGlobalValue());
            module0642.f39020(module0015.$g153$.getGlobalValue());
            module0015.f718();
            module0655.f39766();
            module0642.f39064(module0655.$g5143$.getDynamicValue(var2), module0655.$g5142$.getDynamicValue(var2));
            final SubLObject var6 = module0014.f672((SubLObject)$ic1$);
            module0642.f39029((SubLObject)UNPROVIDED);
            module0642.f39020(module0015.$g175$.getGlobalValue());
            module0642.f39020(module0015.$g176$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
            module0642.f39020((SubLObject)$ic2$);
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
            if (NIL != var6) {
                module0642.f39020(module0015.$g178$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                module0642.f39020(var6);
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
            }
            module0642.f39020(module0015.$g177$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
            module0642.f39020((SubLObject)$ic3$);
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
            if (NIL != var4) {
                module0642.f39029((SubLObject)UNPROVIDED);
                module0642.f39020(module0015.$g173$.getGlobalValue());
                module0642.f39019(var4);
                module0642.f39020(module0015.$g174$.getGlobalValue());
            }
            module0016.f941();
            module0642.f39020(module0015.$g154$.getGlobalValue());
            module0642.f39029((SubLObject)UNPROVIDED);
            final SubLObject var3_199 = module0015.$g535$.currentBinding(var2);
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
                module0642.f39020((SubLObject)$ic150$);
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                final SubLObject var3_200 = module0015.$g533$.currentBinding(var2);
                try {
                    module0015.$g533$.bind((SubLObject)T, var2);
                    module0642.f39020(module0015.$g144$.getGlobalValue());
                    module0642.f39020(module0015.$g157$.getGlobalValue());
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                    module0642.f39020((SubLObject)$ic151$);
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                    module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                    final SubLObject var3_201 = module0015.$g533$.currentBinding(var2);
                    try {
                        module0015.$g533$.bind((SubLObject)T, var2);
                        module0642.f39020(module0015.$g295$.getGlobalValue());
                        module0642.f39020(module0015.$g305$.getGlobalValue());
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                        module0642.f39020((SubLObject)$ic152$);
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                        module0642.f39020(module0015.$g302$.getGlobalValue());
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                        module0642.f39020((SubLObject)$ic153$);
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                        module0642.f39020(module0015.$g307$.getGlobalValue());
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                        module0642.f39019((SubLObject)$ic154$);
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                        module0642.f39020(module0015.$g160$.getGlobalValue());
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                        module0642.f39020((SubLObject)$ic155$);
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                    }
                    finally {
                        module0015.$g533$.rebind(var3_201, var2);
                    }
                    module0642.f39020(module0015.$g145$.getGlobalValue());
                    f40720(var1);
                    f40722(var1);
                    module0642.f39026((SubLObject)TWO_INTEGER);
                    if (NIL != f40712(var1)) {
                        module0642.f39026((SubLObject)UNPROVIDED);
                    }
                    f40734(var1);
                    module0642.f39029((SubLObject)UNPROVIDED);
                    module0642.f39050();
                }
                finally {
                    module0015.$g533$.rebind(var3_200, var2);
                }
                module0642.f39020(module0015.$g134$.getGlobalValue());
                module0642.f39029((SubLObject)UNPROVIDED);
            }
            finally {
                module0015.$g535$.rebind(var3_199, var2);
            }
            module0642.f39020(module0015.$g156$.getGlobalValue());
            module0642.f39029((SubLObject)UNPROVIDED);
        }
        finally {
            module0015.$g538$.rebind(var5, var2);
        }
        return (SubLObject)NIL;
    }

    public static SubLObject f40735(final SubLObject var1, final SubLObject var29, SubLObject var56) {
        if (var56 == UNPROVIDED) {
            var56 = (SubLObject)NIL;
        }
        final SubLThread var57 = SubLProcess.currentSubLThread();
        final SubLObject var58 = module0656.f39832((SubLObject)$ic48$);
        module0642.f39020(module0015.$g381$.getGlobalValue());
        module0642.f39020(module0015.$g383$.getGlobalValue());
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        module0655.f39768();
        PrintLow.format(module0015.$g131$.getDynamicValue(var57), (SubLObject)$ic217$, module0656.f39931(var1));
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        if (NIL != var58) {
            module0642.f39020(module0015.$g387$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
            module0642.f39020(var58);
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        }
        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
        final SubLObject var59 = module0015.$g533$.currentBinding(var57);
        try {
            module0015.$g533$.bind((SubLObject)T, var57);
            if (NIL != var56) {
                module0642.f39019(var56);
            }
            else {
                module0642.f39019((SubLObject)$ic218$);
            }
        }
        finally {
            module0015.$g533$.rebind(var59, var57);
        }
        module0642.f39020(module0015.$g382$.getGlobalValue());
        if (var29.isPositive()) {
            PrintLow.format(module0015.$g131$.getDynamicValue(var57), (SubLObject)$ic219$, var29);
        }
        return var1;
    }

    public static SubLObject f40736(final SubLObject var52) {
        final SubLThread var53 = SubLProcess.currentSubLThread();
        SubLObject var54 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var52, var52, (SubLObject)$ic87$);
        var54 = var52.first();
        final SubLObject var55 = var52.rest();
        if (NIL == var55) {
            final SubLObject var56 = module0656.f39969(var54);
            if (NIL == module0656.f39930(var56)) {
                return module0656.f39789((SubLObject)$ic88$, var54, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
            }
            final SubLObject var58;
            final SubLObject var57 = var58 = PrintLow.format((SubLObject)NIL, (SubLObject)$ic221$, var56);
            final SubLObject var59 = module0015.$g538$.currentBinding(var53);
            try {
                module0015.$g538$.bind((NIL != module0057.f4158(module0015.$g538$.getDynamicValue(var53))) ? module0015.$g538$.getDynamicValue(var53) : module0057.f4173((SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED), var53);
                module0642.f39020((SubLObject)$ic0$);
                module0642.f39029((SubLObject)UNPROVIDED);
                module0642.f39020(module0015.$g155$.getGlobalValue());
                module0642.f39020(module0015.$g153$.getGlobalValue());
                module0015.f718();
                module0655.f39766();
                module0642.f39064(module0655.$g5143$.getDynamicValue(var53), module0655.$g5142$.getDynamicValue(var53));
                final SubLObject var60 = module0014.f672((SubLObject)$ic1$);
                module0642.f39029((SubLObject)UNPROVIDED);
                module0642.f39020(module0015.$g175$.getGlobalValue());
                module0642.f39020(module0015.$g176$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                module0642.f39020((SubLObject)$ic2$);
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                if (NIL != var60) {
                    module0642.f39020(module0015.$g178$.getGlobalValue());
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                    module0642.f39020(var60);
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                }
                module0642.f39020(module0015.$g177$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                module0642.f39020((SubLObject)$ic3$);
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                if (NIL != var58) {
                    module0642.f39029((SubLObject)UNPROVIDED);
                    module0642.f39020(module0015.$g173$.getGlobalValue());
                    module0642.f39019(var58);
                    module0642.f39020(module0015.$g174$.getGlobalValue());
                }
                module0016.f941();
                module0642.f39020(module0015.$g154$.getGlobalValue());
                module0642.f39029((SubLObject)UNPROVIDED);
                final SubLObject var3_204 = module0015.$g535$.currentBinding(var53);
                try {
                    module0015.$g535$.bind((SubLObject)T, var53);
                    module0642.f39020(module0015.$g133$.getGlobalValue());
                    if (NIL != module0015.$g132$.getDynamicValue(var53)) {
                        module0642.f39020(module0015.$g135$.getGlobalValue());
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                        module0642.f39020(module0642.f39042(module0015.$g132$.getDynamicValue(var53)));
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                    }
                    module0642.f39020(module0015.$g137$.getGlobalValue());
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                    module0642.f39020((SubLObject)$ic150$);
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                    module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                    final SubLObject var3_205 = module0015.$g533$.currentBinding(var53);
                    try {
                        module0015.$g533$.bind((SubLObject)T, var53);
                        module0642.f39020(module0015.$g144$.getGlobalValue());
                        module0642.f39020(module0015.$g157$.getGlobalValue());
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                        module0642.f39020((SubLObject)$ic151$);
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                        final SubLObject var3_206 = module0015.$g533$.currentBinding(var53);
                        try {
                            module0015.$g533$.bind((SubLObject)T, var53);
                            module0642.f39020(module0015.$g295$.getGlobalValue());
                            module0642.f39020(module0015.$g305$.getGlobalValue());
                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                            module0642.f39020((SubLObject)$ic152$);
                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                            module0642.f39020(module0015.$g302$.getGlobalValue());
                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                            module0642.f39020((SubLObject)$ic153$);
                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                            module0642.f39020(module0015.$g307$.getGlobalValue());
                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                            module0642.f39019((SubLObject)$ic154$);
                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                            module0642.f39020(module0015.$g160$.getGlobalValue());
                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                            module0642.f39020((SubLObject)$ic155$);
                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                        }
                        finally {
                            module0015.$g533$.rebind(var3_206, var53);
                        }
                        module0642.f39020(module0015.$g145$.getGlobalValue());
                        f40722(var56);
                        module0642.f39026((SubLObject)TWO_INTEGER);
                        f40712(var56);
                        module0642.f39029((SubLObject)UNPROVIDED);
                        module0642.f39050();
                    }
                    finally {
                        module0015.$g533$.rebind(var3_205, var53);
                    }
                    module0642.f39020(module0015.$g134$.getGlobalValue());
                    module0642.f39029((SubLObject)UNPROVIDED);
                }
                finally {
                    module0015.$g535$.rebind(var3_204, var53);
                }
                module0642.f39020(module0015.$g156$.getGlobalValue());
                module0642.f39029((SubLObject)UNPROVIDED);
            }
            finally {
                module0015.$g538$.rebind(var59, var53);
            }
        }
        else {
            cdestructuring_bind.cdestructuring_bind_error(var52, (SubLObject)$ic87$);
        }
        return (SubLObject)NIL;
    }

    public static SubLObject f40737(final SubLObject var1, final SubLObject var29, SubLObject var56) {
        if (var56 == UNPROVIDED) {
            var56 = (SubLObject)NIL;
        }
        final SubLThread var57 = SubLProcess.currentSubLThread();
        final SubLObject var58 = module0656.f39832((SubLObject)$ic48$);
        module0642.f39020(module0015.$g381$.getGlobalValue());
        module0642.f39020(module0015.$g383$.getGlobalValue());
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        module0655.f39768();
        PrintLow.format(module0015.$g131$.getDynamicValue(var57), (SubLObject)$ic223$, module0656.f39931(var1));
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        if (NIL != var58) {
            module0642.f39020(module0015.$g387$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
            module0642.f39020(var58);
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        }
        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
        final SubLObject var59 = module0015.$g533$.currentBinding(var57);
        try {
            module0015.$g533$.bind((SubLObject)T, var57);
            if (NIL != var56) {
                module0642.f39019(var56);
            }
            else {
                module0642.f39019((SubLObject)$ic224$);
            }
        }
        finally {
            module0015.$g533$.rebind(var59, var57);
        }
        module0642.f39020(module0015.$g382$.getGlobalValue());
        if (var29.isPositive()) {
            PrintLow.format(module0015.$g131$.getDynamicValue(var57), (SubLObject)$ic219$, var29);
        }
        return var1;
    }

    public static SubLObject f40738(final SubLObject var52) {
        SubLObject var53 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var52, var52, (SubLObject)$ic87$);
        var53 = var52.first();
        final SubLObject var54 = var52.rest();
        if (NIL != var54) {
            cdestructuring_bind.cdestructuring_bind_error(var52, (SubLObject)$ic87$);
            return (SubLObject)NIL;
        }
        SubLObject var55 = module0656.f39969(var53);
        if (NIL == module0656.f39930(var55)) {
            var55 = module0656.f39950(var53, (SubLObject)UNPROVIDED);
        }
        if (NIL == var55) {
            return module0656.f39789((SubLObject)$ic88$, var53, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        }
        return f40739(var55);
    }

    public static SubLObject f40739(final SubLObject var1) {
        final SubLThread var2 = SubLProcess.currentSubLThread();
        if (NIL != module0173.f10955(var1) && $ic170$ == module0660.$cb_default_index_view$.getDynamicValue(var2)) {
            return module0670.f40951(var1, var1, (SubLObject)NIL, (SubLObject)NIL);
        }
        final SubLObject var4;
        final SubLObject var3 = var4 = PrintLow.format((SubLObject)NIL, (SubLObject)$ic216$, var1);
        final SubLObject var5 = module0015.$g538$.currentBinding(var2);
        try {
            module0015.$g538$.bind((NIL != module0057.f4158(module0015.$g538$.getDynamicValue(var2))) ? module0015.$g538$.getDynamicValue(var2) : module0057.f4173((SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED), var2);
            module0642.f39020((SubLObject)$ic0$);
            module0642.f39029((SubLObject)UNPROVIDED);
            module0642.f39020(module0015.$g155$.getGlobalValue());
            module0642.f39020(module0015.$g153$.getGlobalValue());
            module0015.f718();
            module0655.f39766();
            module0642.f39064(module0655.$g5143$.getDynamicValue(var2), module0655.$g5142$.getDynamicValue(var2));
            final SubLObject var6 = module0014.f672((SubLObject)$ic1$);
            module0642.f39029((SubLObject)UNPROVIDED);
            module0642.f39020(module0015.$g175$.getGlobalValue());
            module0642.f39020(module0015.$g176$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
            module0642.f39020((SubLObject)$ic2$);
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
            if (NIL != var6) {
                module0642.f39020(module0015.$g178$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                module0642.f39020(var6);
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
            }
            module0642.f39020(module0015.$g177$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
            module0642.f39020((SubLObject)$ic3$);
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
            if (NIL != var4) {
                module0642.f39029((SubLObject)UNPROVIDED);
                module0642.f39020(module0015.$g173$.getGlobalValue());
                module0642.f39019(var4);
                module0642.f39020(module0015.$g174$.getGlobalValue());
            }
            module0016.f941();
            module0642.f39020(module0015.$g154$.getGlobalValue());
            module0642.f39029((SubLObject)UNPROVIDED);
            final SubLObject var3_209 = module0015.$g535$.currentBinding(var2);
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
                module0642.f39020((SubLObject)$ic150$);
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                final SubLObject var3_210 = module0015.$g533$.currentBinding(var2);
                try {
                    module0015.$g533$.bind((SubLObject)T, var2);
                    module0642.f39020(module0015.$g144$.getGlobalValue());
                    module0642.f39020(module0015.$g157$.getGlobalValue());
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                    module0642.f39020((SubLObject)$ic151$);
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                    module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                    final SubLObject var3_211 = module0015.$g533$.currentBinding(var2);
                    try {
                        module0015.$g533$.bind((SubLObject)T, var2);
                        module0642.f39020(module0015.$g295$.getGlobalValue());
                        module0642.f39020(module0015.$g305$.getGlobalValue());
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                        module0642.f39020((SubLObject)$ic152$);
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                        module0642.f39020(module0015.$g302$.getGlobalValue());
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                        module0642.f39020((SubLObject)$ic153$);
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                        module0642.f39020(module0015.$g307$.getGlobalValue());
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                        module0642.f39019((SubLObject)$ic154$);
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                        module0642.f39020(module0015.$g160$.getGlobalValue());
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                        module0642.f39020((SubLObject)$ic155$);
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                    }
                    finally {
                        module0015.$g533$.rebind(var3_211, var2);
                    }
                    module0642.f39020(module0015.$g145$.getGlobalValue());
                    f40720(var1);
                    f40722(var1);
                    module0642.f39026((SubLObject)UNPROVIDED);
                    module0642.f39026((SubLObject)UNPROVIDED);
                    if (NIL != module0656.f39930(var1)) {
                        f40734(var1);
                    }
                    else if (NIL != module0210.f13595(var1, (SubLObject)UNPROVIDED)) {
                        module0663.f40339(var1);
                    }
                    module0642.f39029((SubLObject)UNPROVIDED);
                    module0642.f39050();
                }
                finally {
                    module0015.$g533$.rebind(var3_210, var2);
                }
                module0642.f39020(module0015.$g134$.getGlobalValue());
                module0642.f39029((SubLObject)UNPROVIDED);
            }
            finally {
                module0015.$g535$.rebind(var3_209, var2);
            }
            module0642.f39020(module0015.$g156$.getGlobalValue());
            module0642.f39029((SubLObject)UNPROVIDED);
        }
        finally {
            module0015.$g538$.rebind(var5, var2);
        }
        return (SubLObject)NIL;
    }

    public static SubLObject f40740(final SubLObject var1, final SubLObject var29, SubLObject var56) {
        if (var56 == UNPROVIDED) {
            var56 = (SubLObject)NIL;
        }
        final SubLThread var57 = SubLProcess.currentSubLThread();
        final SubLObject var58 = module0656.f39832((SubLObject)$ic48$);
        module0642.f39020(module0015.$g381$.getGlobalValue());
        module0642.f39020(module0015.$g383$.getGlobalValue());
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        module0655.f39768();
        PrintLow.format(module0015.$g131$.getDynamicValue(var57), (SubLObject)$ic227$, module0656.f39931(var1));
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        if (NIL != var58) {
            module0642.f39020(module0015.$g387$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
            module0642.f39020(var58);
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        }
        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
        final SubLObject var59 = module0015.$g533$.currentBinding(var57);
        try {
            module0015.$g533$.bind((SubLObject)T, var57);
            if (NIL != var56) {
                module0642.f39019(var56);
            }
            else {
                module0642.f39019((SubLObject)$ic228$);
            }
        }
        finally {
            module0015.$g533$.rebind(var59, var57);
        }
        module0642.f39020(module0015.$g382$.getGlobalValue());
        if (var29.numG((SubLObject)ONE_INTEGER)) {
            PrintLow.format(module0015.$g131$.getDynamicValue(var57), (SubLObject)$ic219$, var29);
        }
        return var1;
    }

    public static SubLObject f40734(final SubLObject var1) {
        if (module0217.f14221(var1, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED).numG((SubLObject)ZERO_INTEGER)) {
            f40741(var1, (SubLObject)NIL, (SubLObject)NIL, (SubLObject)NIL);
        }
        if (module0217.f14238(var1, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED).numG((SubLObject)ZERO_INTEGER)) {
            module0642.f39051((SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
            f40742(var1, (SubLObject)NIL, (SubLObject)NIL);
        }
        if (module0217.f14247(var1, (SubLObject)UNPROVIDED).numG((SubLObject)ZERO_INTEGER)) {
            module0642.f39051((SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
            f40743(var1, (SubLObject)NIL);
        }
        if (module0217.f14257(var1).numG((SubLObject)ZERO_INTEGER)) {
            module0642.f39051((SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
            f40744(var1);
        }
        if (module0217.f14264(var1, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED).numG((SubLObject)ZERO_INTEGER)) {
            module0642.f39051((SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
            f40745(var1, (SubLObject)NIL, (SubLObject)NIL, (SubLObject)NIL);
        }
        if (module0217.f14272(var1, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED).numG((SubLObject)ZERO_INTEGER)) {
            module0642.f39051((SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
            f40746(var1, (SubLObject)NIL, (SubLObject)NIL);
        }
        if (module0217.f14277(var1, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED).numG((SubLObject)ZERO_INTEGER)) {
            module0642.f39051((SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
            f40747(var1, (SubLObject)NIL, (SubLObject)NIL, (SubLObject)NIL);
        }
        if (module0217.f14293(var1, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED).numG((SubLObject)ZERO_INTEGER)) {
            module0642.f39051((SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
            f40748(var1, (SubLObject)NIL, (SubLObject)NIL, (SubLObject)NIL);
        }
        if (module0217.f14301(var1, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED).numG((SubLObject)ZERO_INTEGER)) {
            module0642.f39051((SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
            f40749(var1, (SubLObject)NIL, (SubLObject)NIL, (SubLObject)NIL);
        }
        if (module0217.f14309(var1, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED).numG((SubLObject)ZERO_INTEGER)) {
            module0642.f39051((SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
            f40750(var1, (SubLObject)NIL, (SubLObject)NIL);
        }
        if (module0217.f14350(var1).numG((SubLObject)ZERO_INTEGER)) {
            module0642.f39051((SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
            f40751(var1);
        }
        if (NIL != module0173.f10955(var1) && NIL == module0217.f14342(var1) && module0217.f14336(var1).numG((SubLObject)ZERO_INTEGER)) {
            module0642.f39051((SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
            f40752(var1);
        }
        return (SubLObject)NIL;
    }

    public static SubLObject f40753(final SubLObject var1, SubLObject var56) {
        if (var56 == UNPROVIDED) {
            var56 = (SubLObject)NIL;
        }
        final SubLThread var57 = SubLProcess.currentSubLThread();
        final SubLObject var58 = module0656.f39832((SubLObject)$ic48$);
        module0642.f39020(module0015.$g381$.getGlobalValue());
        module0642.f39020(module0015.$g383$.getGlobalValue());
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        module0655.f39768();
        PrintLow.format(module0015.$g131$.getDynamicValue(var57), (SubLObject)$ic230$, module0656.f39931(var1));
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        if (NIL != var58) {
            module0642.f39020(module0015.$g387$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
            module0642.f39020(var58);
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        }
        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
        final SubLObject var59 = module0015.$g533$.currentBinding(var57);
        try {
            module0015.$g533$.bind((SubLObject)T, var57);
            if (NIL != var56) {
                module0642.f39019(var56);
            }
            else {
                module0642.f39019((SubLObject)$ic231$);
            }
        }
        finally {
            module0015.$g533$.rebind(var59, var57);
        }
        module0642.f39020(module0015.$g382$.getGlobalValue());
        return var1;
    }

    public static SubLObject f40754(final SubLObject var52) {
        final SubLThread var53 = SubLProcess.currentSubLThread();
        final SubLObject var54 = module0656.f39943(var52, (SubLObject)UNPROVIDED);
        if (NIL != module0173.f10955(var54)) {
            final SubLObject var55 = (SubLObject)$ic233$;
            final SubLObject var56 = module0015.$g538$.currentBinding(var53);
            try {
                module0015.$g538$.bind((NIL != module0057.f4158(module0015.$g538$.getDynamicValue(var53))) ? module0015.$g538$.getDynamicValue(var53) : module0057.f4173((SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED), var53);
                module0642.f39020((SubLObject)$ic0$);
                module0642.f39029((SubLObject)UNPROVIDED);
                module0642.f39020(module0015.$g155$.getGlobalValue());
                module0642.f39020(module0015.$g153$.getGlobalValue());
                module0015.f718();
                module0655.f39766();
                module0642.f39064(module0655.$g5143$.getDynamicValue(var53), module0655.$g5142$.getDynamicValue(var53));
                final SubLObject var57 = module0014.f672((SubLObject)$ic1$);
                module0642.f39029((SubLObject)UNPROVIDED);
                module0642.f39020(module0015.$g175$.getGlobalValue());
                module0642.f39020(module0015.$g176$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                module0642.f39020((SubLObject)$ic2$);
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                if (NIL != var57) {
                    module0642.f39020(module0015.$g178$.getGlobalValue());
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                    module0642.f39020(var57);
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                }
                module0642.f39020(module0015.$g177$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                module0642.f39020((SubLObject)$ic3$);
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                if (NIL != var55) {
                    module0642.f39029((SubLObject)UNPROVIDED);
                    module0642.f39020(module0015.$g173$.getGlobalValue());
                    module0642.f39019(var55);
                    module0642.f39020(module0015.$g174$.getGlobalValue());
                }
                module0016.f941();
                module0642.f39020(module0015.$g154$.getGlobalValue());
                module0642.f39029((SubLObject)UNPROVIDED);
                final SubLObject var3_212 = module0015.$g535$.currentBinding(var53);
                try {
                    module0015.$g535$.bind((SubLObject)T, var53);
                    module0642.f39020(module0015.$g133$.getGlobalValue());
                    if (NIL != module0015.$g132$.getDynamicValue(var53)) {
                        module0642.f39020(module0015.$g135$.getGlobalValue());
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                        module0642.f39020(module0642.f39042(module0015.$g132$.getDynamicValue(var53)));
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                    }
                    module0642.f39020(module0015.$g137$.getGlobalValue());
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                    module0642.f39020((SubLObject)$ic150$);
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                    module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                    final SubLObject var3_213 = module0015.$g533$.currentBinding(var53);
                    try {
                        module0015.$g533$.bind((SubLObject)T, var53);
                        module0642.f39020(module0015.$g144$.getGlobalValue());
                        module0642.f39020(module0015.$g157$.getGlobalValue());
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                        module0642.f39020((SubLObject)$ic151$);
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                        final SubLObject var3_214 = module0015.$g533$.currentBinding(var53);
                        try {
                            module0015.$g533$.bind((SubLObject)T, var53);
                            module0642.f39020(module0015.$g295$.getGlobalValue());
                            module0642.f39020(module0015.$g305$.getGlobalValue());
                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                            module0642.f39020((SubLObject)$ic152$);
                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                            module0642.f39020(module0015.$g302$.getGlobalValue());
                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                            module0642.f39020((SubLObject)$ic153$);
                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                            module0642.f39020(module0015.$g307$.getGlobalValue());
                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                            module0642.f39019((SubLObject)$ic154$);
                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                            module0642.f39020(module0015.$g160$.getGlobalValue());
                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                            module0642.f39020((SubLObject)$ic155$);
                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                        }
                        finally {
                            module0015.$g533$.rebind(var3_214, var53);
                        }
                        module0642.f39020(module0015.$g145$.getGlobalValue());
                        f40755(var54);
                        module0642.f39029((SubLObject)UNPROVIDED);
                        module0642.f39050();
                    }
                    finally {
                        module0015.$g533$.rebind(var3_213, var53);
                    }
                    module0642.f39020(module0015.$g134$.getGlobalValue());
                    module0642.f39029((SubLObject)UNPROVIDED);
                }
                finally {
                    module0015.$g535$.rebind(var3_212, var53);
                }
                module0642.f39020(module0015.$g156$.getGlobalValue());
                module0642.f39029((SubLObject)UNPROVIDED);
            }
            finally {
                module0015.$g538$.rebind(var56, var53);
            }
        }
        return (SubLObject)NIL;
    }

    public static SubLObject f40755(final SubLObject var6) {
        final SubLThread var7 = SubLProcess.currentSubLThread();
        final SubLObject var8 = f40756(var6);
        SubLObject var9 = (SubLObject)NIL;
        module0642.f39020(module0015.$g346$.getGlobalValue());
        module0642.f39020(module0015.$g352$.getGlobalValue());
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        module0642.f39020((SubLObject)ZERO_INTEGER);
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
        final SubLObject var10 = module0015.$g533$.currentBinding(var7);
        try {
            module0015.$g533$.bind((SubLObject)T, var7);
            SubLObject var11 = var8;
            SubLObject var12 = (SubLObject)NIL;
            var12 = var11.first();
            while (NIL != var11) {
                final SubLObject var13 = module0178.f11296(var12);
                final SubLObject var14 = module0178.f11298(var12);
                final SubLObject var15 = module0178.f11295(var12);
                final SubLObject var16 = (SubLObject)makeBoolean(!var9.equal(var13));
                if (NIL != var16) {
                    module0642.f39020(module0015.$g364$.getGlobalValue());
                    module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                    final SubLObject var3_220 = module0015.$g533$.currentBinding(var7);
                    try {
                        module0015.$g533$.bind((SubLObject)T, var7);
                        module0642.f39020(module0015.$g360$.getGlobalValue());
                        module0642.f39020(module0015.$g370$.getGlobalValue());
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                        module0642.f39020(module0642.f39049((SubLObject)$ic116$));
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                        module0642.f39020(module0015.$g373$.getGlobalValue());
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                        module0642.f39020(module0642.f39049((SubLObject)$ic35$));
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                        final SubLObject var3_221 = module0015.$g533$.currentBinding(var7);
                        try {
                            module0015.$g533$.bind((SubLObject)T, var7);
                            var9 = var13;
                            module0642.f39020(module0015.$g209$.getGlobalValue());
                            module0642.f39019((SubLObject)((NIL != var13) ? module0051.f3617(var13) : $ic235$));
                            module0642.f39020(module0015.$g210$.getGlobalValue());
                        }
                        finally {
                            module0015.$g533$.rebind(var3_221, var7);
                        }
                        module0642.f39020(module0015.$g361$.getGlobalValue());
                        module0642.f39020(module0015.$g360$.getGlobalValue());
                        module0642.f39020(module0015.$g370$.getGlobalValue());
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                        module0642.f39020(module0642.f39049((SubLObject)$ic116$));
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                        module0642.f39020(module0015.$g373$.getGlobalValue());
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                        module0642.f39020(module0642.f39049((SubLObject)$ic35$));
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                        final SubLObject var3_222 = module0015.$g533$.currentBinding(var7);
                        try {
                            module0015.$g533$.bind((SubLObject)T, var7);
                        }
                        finally {
                            module0015.$g533$.rebind(var3_222, var7);
                        }
                        module0642.f39020(module0015.$g361$.getGlobalValue());
                    }
                    finally {
                        module0015.$g533$.rebind(var3_220, var7);
                    }
                    module0642.f39020(module0015.$g365$.getGlobalValue());
                    module0642.f39029((SubLObject)UNPROVIDED);
                }
                module0642.f39020(module0015.$g364$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                final SubLObject var3_223 = module0015.$g533$.currentBinding(var7);
                try {
                    module0015.$g533$.bind((SubLObject)T, var7);
                    module0642.f39020(module0015.$g360$.getGlobalValue());
                    module0642.f39020(module0015.$g370$.getGlobalValue());
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                    module0642.f39020(module0642.f39049((SubLObject)$ic116$));
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                    module0642.f39020(module0015.$g373$.getGlobalValue());
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                    module0642.f39020(module0642.f39049((SubLObject)$ic35$));
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                    module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                    final SubLObject var3_224 = module0015.$g533$.currentBinding(var7);
                    try {
                        module0015.$g533$.bind((SubLObject)T, var7);
                        if (NIL != var14) {
                            module0642.f39019(module0051.f3634(var14));
                        }
                    }
                    finally {
                        module0015.$g533$.rebind(var3_224, var7);
                    }
                    module0642.f39020(module0015.$g361$.getGlobalValue());
                    module0642.f39020(module0015.$g360$.getGlobalValue());
                    module0642.f39020(module0015.$g370$.getGlobalValue());
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                    module0642.f39020(module0642.f39049((SubLObject)$ic34$));
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                    module0642.f39020(module0015.$g373$.getGlobalValue());
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                    module0642.f39020(module0642.f39049((SubLObject)$ic35$));
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                    module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                    final SubLObject var3_225 = module0015.$g533$.currentBinding(var7);
                    try {
                        module0015.$g533$.bind((SubLObject)T, var7);
                        module0656.f39916(var12, (SubLObject)T, (SubLObject)NIL);
                        if (NIL != var15) {
                            module0642.f39020(module0015.$g459$.getGlobalValue());
                            module0642.f39019((SubLObject)$ic139$);
                            module0656.f39915(var15, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                            module0642.f39020(module0015.$g460$.getGlobalValue());
                        }
                    }
                    finally {
                        module0015.$g533$.rebind(var3_225, var7);
                    }
                    module0642.f39020(module0015.$g361$.getGlobalValue());
                }
                finally {
                    module0015.$g533$.rebind(var3_223, var7);
                }
                module0642.f39020(module0015.$g365$.getGlobalValue());
                module0642.f39029((SubLObject)UNPROVIDED);
                var11 = var11.rest();
                var12 = var11.first();
            }
        }
        finally {
            module0015.$g533$.rebind(var10, var7);
        }
        module0642.f39020(module0015.$g347$.getGlobalValue());
        return var6;
    }

    public static SubLObject f40756(final SubLObject var8) {
        final SubLThread var9 = SubLProcess.currentSubLThread();
        SubLObject var10 = (SubLObject)NIL;
        final SubLObject var11 = module0147.$g2094$.currentBinding(var9);
        final SubLObject var12 = module0147.$g2095$.currentBinding(var9);
        try {
            module0147.$g2094$.bind((SubLObject)$ic134$, var9);
            module0147.$g2095$.bind($ic135$, var9);
            final SubLObject var13 = module0067.f4880((SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
            if (NIL != module0158.f10282(var8, (SubLObject)NIL)) {
                final SubLObject var14 = module0158.f10283(var8, (SubLObject)NIL);
                SubLObject var15 = (SubLObject)NIL;
                final SubLObject var16 = (SubLObject)NIL;
                while (NIL == var15) {
                    final SubLObject var17 = module0052.f3695(var14, var16);
                    final SubLObject var18 = (SubLObject)makeBoolean(!var16.eql(var17));
                    if (NIL != var18) {
                        SubLObject var19 = (SubLObject)NIL;
                        try {
                            var19 = module0158.f10316(var17, (SubLObject)NIL, (SubLObject)NIL, (SubLObject)NIL);
                            SubLObject var228_233 = (SubLObject)NIL;
                            final SubLObject var229_234 = (SubLObject)NIL;
                            while (NIL == var228_233) {
                                final SubLObject var20 = module0052.f3695(var19, var229_234);
                                final SubLObject var231_236 = (SubLObject)makeBoolean(!var229_234.eql(var20));
                                if (NIL != var231_236 && NIL != module0158.f10284(var20, var17) && NIL != module0178.f11375(var20)) {
                                    module0067.f4886(var13, var20, var20);
                                }
                                var228_233 = (SubLObject)makeBoolean(NIL == var231_236);
                            }
                        }
                        finally {
                            final SubLObject var3_237 = Threads.$is_thread_performing_cleanupP$.currentBinding(var9);
                            try {
                                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)T, var9);
                                if (NIL != var19) {
                                    module0158.f10319(var19);
                                }
                            }
                            finally {
                                Threads.$is_thread_performing_cleanupP$.rebind(var3_237, var9);
                            }
                        }
                    }
                    var15 = (SubLObject)makeBoolean(NIL == var18);
                }
            }
            final SubLObject var21 = module0067.f4902(var13);
            final SubLObject var22 = Sort.sort(var21, (SubLObject)$ic129$, (SubLObject)$ic236$);
            final SubLObject var23 = Sort.stable_sort(var22, (SubLObject)$ic237$, (SubLObject)UNPROVIDED);
            var10 = Sequences.nreverse(var23);
        }
        finally {
            module0147.$g2095$.rebind(var12, var9);
            module0147.$g2094$.rebind(var11, var9);
        }
        return var10;
    }

    public static SubLObject f40757(final SubLObject var52) {
        SubLObject var53 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var52, var52, (SubLObject)$ic238$);
        var53 = var52.first();
        SubLObject var54 = var52.rest();
        final SubLObject var55 = (SubLObject)(var54.isCons() ? var54.first() : NIL);
        cdestructuring_bind.destructuring_bind_must_listp(var54, var52, (SubLObject)$ic238$);
        var54 = var54.rest();
        final SubLObject var56 = (SubLObject)(var54.isCons() ? var54.first() : NIL);
        cdestructuring_bind.destructuring_bind_must_listp(var54, var52, (SubLObject)$ic238$);
        var54 = var54.rest();
        final SubLObject var57 = (SubLObject)(var54.isCons() ? var54.first() : NIL);
        cdestructuring_bind.destructuring_bind_must_listp(var54, var52, (SubLObject)$ic238$);
        var54 = var54.rest();
        if (NIL == var54) {
            final SubLObject var58 = module0656.f39969(var53);
            SubLObject var59 = (SubLObject)NIL;
            SubLObject var60 = (SubLObject)NIL;
            SubLObject var61 = (SubLObject)NIL;
            if (NIL == module0656.f39930(var58)) {
                return module0656.f39789((SubLObject)$ic88$, var53, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
            }
            if (NIL != var55) {
                var59 = reader.read_from_string_ignoring_errors(var55, (SubLObject)NIL, (SubLObject)NIL, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                if (!var59.isFixnum()) {
                    return module0656.f39789((SubLObject)$ic239$, var55, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                }
                if (NIL != var56) {
                    var60 = module0656.f39943(var56, (SubLObject)UNPROVIDED);
                    if (NIL == module0173.f10955(var60)) {
                        return module0656.f39789((SubLObject)$ic99$, var56, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                    }
                    if (NIL != var57) {
                        var61 = module0656.f39959(var57);
                        if (NIL == module0161.f10481(var61)) {
                            return module0656.f39789((SubLObject)$ic240$, var57, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                        }
                    }
                }
            }
            f40758(var58, var59, var60, var61);
        }
        else {
            cdestructuring_bind.cdestructuring_bind_error(var52, (SubLObject)$ic238$);
        }
        return (SubLObject)NIL;
    }

    public static SubLObject f40758(final SubLObject var1, final SubLObject var32, final SubLObject var41, final SubLObject var37) {
        final SubLThread var42 = SubLProcess.currentSubLThread();
        if (NIL == var37 && NIL != module0173.f10955(var1) && $ic170$ == module0660.$cb_default_index_view$.getDynamicValue(var42)) {
            return module0670.f40951(var1, var1, var32, var41);
        }
        final SubLObject var44;
        final SubLObject var43 = var44 = PrintLow.format((SubLObject)NIL, (SubLObject)$ic242$, var1);
        final SubLObject var45 = module0015.$g538$.currentBinding(var42);
        try {
            module0015.$g538$.bind((NIL != module0057.f4158(module0015.$g538$.getDynamicValue(var42))) ? module0015.$g538$.getDynamicValue(var42) : module0057.f4173((SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED), var42);
            module0642.f39020((SubLObject)$ic0$);
            module0642.f39029((SubLObject)UNPROVIDED);
            module0642.f39020(module0015.$g155$.getGlobalValue());
            module0642.f39020(module0015.$g153$.getGlobalValue());
            module0015.f718();
            module0655.f39766();
            module0642.f39064(module0655.$g5143$.getDynamicValue(var42), module0655.$g5142$.getDynamicValue(var42));
            final SubLObject var46 = module0014.f672((SubLObject)$ic1$);
            module0642.f39029((SubLObject)UNPROVIDED);
            module0642.f39020(module0015.$g175$.getGlobalValue());
            module0642.f39020(module0015.$g176$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
            module0642.f39020((SubLObject)$ic2$);
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
            if (NIL != var46) {
                module0642.f39020(module0015.$g178$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                module0642.f39020(var46);
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
            }
            module0642.f39020(module0015.$g177$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
            module0642.f39020((SubLObject)$ic3$);
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
            if (NIL != var44) {
                module0642.f39029((SubLObject)UNPROVIDED);
                module0642.f39020(module0015.$g173$.getGlobalValue());
                module0642.f39019(var44);
                module0642.f39020(module0015.$g174$.getGlobalValue());
            }
            module0016.f941();
            module0642.f39020(module0015.$g154$.getGlobalValue());
            module0642.f39029((SubLObject)UNPROVIDED);
            final SubLObject var3_246 = module0015.$g535$.currentBinding(var42);
            try {
                module0015.$g535$.bind((SubLObject)T, var42);
                module0642.f39020(module0015.$g133$.getGlobalValue());
                if (NIL != module0015.$g132$.getDynamicValue(var42)) {
                    module0642.f39020(module0015.$g135$.getGlobalValue());
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                    module0642.f39020(module0642.f39042(module0015.$g132$.getDynamicValue(var42)));
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                }
                module0642.f39020(module0015.$g137$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                module0642.f39020((SubLObject)$ic150$);
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                final SubLObject var3_247 = module0015.$g533$.currentBinding(var42);
                try {
                    module0015.$g533$.bind((SubLObject)T, var42);
                    module0642.f39020(module0015.$g144$.getGlobalValue());
                    module0642.f39020(module0015.$g157$.getGlobalValue());
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                    module0642.f39020((SubLObject)$ic151$);
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                    module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                    final SubLObject var3_248 = module0015.$g533$.currentBinding(var42);
                    try {
                        module0015.$g533$.bind((SubLObject)T, var42);
                        module0642.f39020(module0015.$g295$.getGlobalValue());
                        module0642.f39020(module0015.$g305$.getGlobalValue());
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                        module0642.f39020((SubLObject)$ic152$);
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                        module0642.f39020(module0015.$g302$.getGlobalValue());
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                        module0642.f39020((SubLObject)$ic153$);
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                        module0642.f39020(module0015.$g307$.getGlobalValue());
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                        module0642.f39019((SubLObject)$ic154$);
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                        module0642.f39020(module0015.$g160$.getGlobalValue());
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                        module0642.f39020((SubLObject)$ic155$);
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                    }
                    finally {
                        module0015.$g533$.rebind(var3_248, var42);
                    }
                    module0642.f39020(module0015.$g145$.getGlobalValue());
                    f40720(var1);
                    f40722(var1);
                    module0642.f39026((SubLObject)TWO_INTEGER);
                    f40741(var1, var32, var41, var37);
                    module0642.f39029((SubLObject)UNPROVIDED);
                    module0642.f39050();
                }
                finally {
                    module0015.$g533$.rebind(var3_247, var42);
                }
                module0642.f39020(module0015.$g134$.getGlobalValue());
                module0642.f39029((SubLObject)UNPROVIDED);
            }
            finally {
                module0015.$g535$.rebind(var3_246, var42);
            }
            module0642.f39020(module0015.$g156$.getGlobalValue());
            module0642.f39029((SubLObject)UNPROVIDED);
        }
        finally {
            module0015.$g538$.rebind(var45, var42);
        }
        return (SubLObject)NIL;
    }

    public static SubLObject f40759(final SubLObject var1, final SubLObject var29, SubLObject var32, SubLObject var41, SubLObject var37) {
        if (var32 == UNPROVIDED) {
            var32 = (SubLObject)NIL;
        }
        if (var41 == UNPROVIDED) {
            var41 = (SubLObject)NIL;
        }
        if (var37 == UNPROVIDED) {
            var37 = (SubLObject)NIL;
        }
        final SubLThread var42 = SubLProcess.currentSubLThread();
        final SubLObject var43 = module0656.f39832((SubLObject)$ic48$);
        module0642.f39020(module0015.$g381$.getGlobalValue());
        module0642.f39020(module0015.$g383$.getGlobalValue());
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        module0655.f39768();
        PrintLow.format(module0015.$g131$.getDynamicValue(var42), (SubLObject)$ic243$, module0656.f39931(var1));
        if (NIL != var32) {
            PrintLow.format(module0015.$g131$.getDynamicValue(var42), (SubLObject)$ic244$, var32);
            if (NIL != var41) {
                PrintLow.format(module0015.$g131$.getDynamicValue(var42), (SubLObject)$ic244$, module0656.f39842(var41));
                if (NIL != var37) {
                    PrintLow.format(module0015.$g131$.getDynamicValue(var42), (SubLObject)$ic244$, module0656.f39934(var37));
                }
            }
        }
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        if (NIL != var43) {
            module0642.f39020(module0015.$g387$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
            module0642.f39020(var43);
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        }
        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
        final SubLObject var44 = module0015.$g533$.currentBinding(var42);
        try {
            module0015.$g533$.bind((SubLObject)T, var42);
            if (NIL != var37) {
                module0656.f39964(var37);
            }
            else if (NIL != var41) {
                module0642.f39019(module0656.f39941(var41));
            }
            else if (NIL != var32) {
                PrintLow.format(module0015.$g131$.getDynamicValue(var42), (SubLObject)$ic245$, var32);
            }
            else {
                PrintLow.format(module0015.$g131$.getDynamicValue(var42), (SubLObject)$ic246$);
            }
        }
        finally {
            module0015.$g533$.rebind(var44, var42);
        }
        module0642.f39020(module0015.$g382$.getGlobalValue());
        if (var29.numG((SubLObject)ONE_INTEGER)) {
            PrintLow.format(module0015.$g131$.getDynamicValue(var42), (SubLObject)$ic219$, var29);
        }
        return var1;
    }

    public static SubLObject f40741(final SubLObject var1, final SubLObject var32, final SubLObject var41, SubLObject var37) {
        final SubLThread var42 = SubLProcess.currentSubLThread();
        final SubLObject var43 = module0655.$g5125$.currentBinding(var42);
        final SubLObject var44 = module0656.$g5172$.currentBinding(var42);
        final SubLObject var45 = module0580.$g4361$.currentBinding(var42);
        try {
            module0655.$g5125$.bind((SubLObject)NIL, var42);
            module0656.$g5172$.bind(module0661.f40305(), var42);
            module0580.$g4361$.bind((SubLObject)NIL, var42);
            var42.resetMultipleValues();
            final SubLObject var3_249 = module0580.$g4362$.currentBinding(var42);
            try {
                module0580.$g4362$.bind(module0580.f35560(), var42);
                final SubLObject var46 = var42.secondMultipleValue();
                var42.resetMultipleValues();
                try {
                    var42.resetMultipleValues();
                    final SubLObject var3_250 = module0580.$g4358$.currentBinding(var42);
                    try {
                        module0580.$g4358$.bind(module0580.f35544(), var42);
                        final SubLObject var47 = var42.secondMultipleValue();
                        var42.resetMultipleValues();
                        final SubLObject var3_251 = module0580.$g4359$.currentBinding(var42);
                        try {
                            module0580.$g4359$.bind(module0580.f35545(), var42);
                            final SubLObject var48 = module0580.$g4358$.getDynamicValue(var42);
                            final SubLObject var3_252 = module0034.$g879$.currentBinding(var42);
                            try {
                                module0034.$g879$.bind(var48, var42);
                                SubLObject var49 = (SubLObject)NIL;
                                if (NIL != var48 && NIL == module0034.f1842(var48)) {
                                    var49 = module0034.f1869(var48);
                                    final SubLObject var50 = Threads.current_process();
                                    if (NIL == var49) {
                                        module0034.f1873(var48, var50);
                                    }
                                    else if (!var49.eql(var50)) {
                                        Errors.error((SubLObject)$ic156$);
                                    }
                                }
                                try {
                                    final SubLObject var3_253 = module0579.$g4260$.currentBinding(var42);
                                    final SubLObject var110_254 = module0579.$g4259$.currentBinding(var42);
                                    try {
                                        module0579.$g4260$.bind(module0677.f41312(), var42);
                                        module0579.$g4259$.bind((SubLObject)$ic157$, var42);
                                        if (NIL == var32) {
                                            f40760(var1);
                                        }
                                        else if (NIL == var41) {
                                            f40761(var1, var32);
                                        }
                                        else {
                                            f40724(var32);
                                            if (NIL == var37) {
                                                final SubLObject var51 = module0217.f14228(var1, var32, var41);
                                                if (NIL != module0035.f1997(var51)) {
                                                    var37 = var51.first();
                                                }
                                            }
                                            if (NIL == var37) {
                                                f40725(var1, var32, var41);
                                            }
                                            else {
                                                final SubLObject var3_254 = module0655.$g5126$.currentBinding(var42);
                                                try {
                                                    module0655.$g5126$.bind((SubLObject)makeBoolean(NIL != module0655.$g5126$.getDynamicValue(var42) && NIL == module0223.f14667(var1) && var32.eql((SubLObject)ONE_INTEGER)), var42);
                                                    if (NIL != module0655.$g5126$.getDynamicValue(var42)) {
                                                        final SubLObject var3_255 = module0147.$g2094$.currentBinding(var42);
                                                        final SubLObject var110_255 = module0147.$g2095$.currentBinding(var42);
                                                        try {
                                                            module0147.$g2094$.bind((SubLObject)$ic134$, var42);
                                                            module0147.$g2095$.bind($ic135$, var42);
                                                            module0655.$g5126$.setDynamicValue(module0225.f14781(var41), var42);
                                                        }
                                                        finally {
                                                            module0147.$g2095$.rebind(var110_255, var42);
                                                            module0147.$g2094$.rebind(var3_255, var42);
                                                        }
                                                    }
                                                    f40762(var1, var32, var41, var37);
                                                    module0659.f40117((SubLObject)$ic46$, (SubLObject)$ic248$, (SubLObject)$ic7$, var1, var32, var41, var37);
                                                }
                                                finally {
                                                    module0655.$g5126$.rebind(var3_254, var42);
                                                }
                                            }
                                        }
                                    }
                                    finally {
                                        module0579.$g4259$.rebind(var110_254, var42);
                                        module0579.$g4260$.rebind(var3_253, var42);
                                    }
                                }
                                finally {
                                    final SubLObject var3_256 = Threads.$is_thread_performing_cleanupP$.currentBinding(var42);
                                    try {
                                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)T, var42);
                                        if (NIL != var48 && NIL == var49) {
                                            module0034.f1873(var48, (SubLObject)NIL);
                                        }
                                    }
                                    finally {
                                        Threads.$is_thread_performing_cleanupP$.rebind(var3_256, var42);
                                    }
                                }
                            }
                            finally {
                                module0034.$g879$.rebind(var3_252, var42);
                            }
                        }
                        finally {
                            module0580.$g4359$.rebind(var3_251, var42);
                        }
                        if (var47 == $ic159$ && NIL != module0034.f1839(module0580.$g4358$.getDynamicValue(var42))) {
                            module0034.f1891(module0580.$g4358$.getDynamicValue(var42));
                        }
                    }
                    finally {
                        module0580.$g4358$.rebind(var3_250, var42);
                    }
                }
                finally {
                    final SubLObject var3_257 = Threads.$is_thread_performing_cleanupP$.currentBinding(var42);
                    try {
                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)T, var42);
                        if (NIL == var46) {
                            module0580.f35554(module0580.$g4362$.getDynamicValue(var42));
                        }
                    }
                    finally {
                        Threads.$is_thread_performing_cleanupP$.rebind(var3_257, var42);
                    }
                }
            }
            finally {
                module0580.$g4362$.rebind(var3_249, var42);
            }
        }
        finally {
            module0580.$g4361$.rebind(var45, var42);
            module0656.$g5172$.rebind(var44, var42);
            module0655.$g5125$.rebind(var43, var42);
        }
        return (SubLObject)NIL;
    }

    public static SubLObject f40760(final SubLObject var1) {
        SubLObject var2 = (SubLObject)NIL;
        SubLObject var4;
        final SubLObject var3 = var4 = f40634(var1, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        SubLObject var5 = (SubLObject)NIL;
        var5 = var4.first();
        while (NIL != var4) {
            if (NIL != var2) {
                module0642.f39051((SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
            }
            f40761(var1, var5);
            var2 = (SubLObject)T;
            var4 = var4.rest();
            var5 = var4.first();
        }
        return (SubLObject)NIL;
    }

    public static SubLObject f40761(final SubLObject var1, final SubLObject var32) {
        f40724(var32);
        final SubLObject var33 = f40634(var1, var32, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        module0655.$g5125$.setDynamicValue((SubLObject)NIL);
        SubLObject var34 = var33;
        SubLObject var35 = (SubLObject)NIL;
        var35 = var34.first();
        while (NIL != var34) {
            f40725(var1, var32, var35);
            var34 = var34.rest();
            var35 = var34.first();
        }
        return (SubLObject)NIL;
    }

    public static SubLObject f40725(final SubLObject var1, final SubLObject var32, final SubLObject var41) {
        final SubLThread var42 = SubLProcess.currentSubLThread();
        final SubLObject var43 = module0655.$g5126$.currentBinding(var42);
        try {
            module0655.$g5126$.bind((SubLObject)makeBoolean(NIL != module0655.$g5126$.getDynamicValue(var42) && NIL == module0223.f14667(var1) && var32.eql((SubLObject)ONE_INTEGER)), var42);
            final SubLObject var44 = f40634(var1, var32, var41, (SubLObject)UNPROVIDED);
            if (NIL != module0655.$g5126$.getDynamicValue(var42)) {
                final SubLObject var3_262 = module0147.$g2094$.currentBinding(var42);
                final SubLObject var45 = module0147.$g2095$.currentBinding(var42);
                try {
                    module0147.$g2094$.bind((SubLObject)$ic134$, var42);
                    module0147.$g2095$.bind($ic135$, var42);
                    module0655.$g5126$.setDynamicValue(module0225.f14781(var41), var42);
                }
                finally {
                    module0147.$g2095$.rebind(var45, var42);
                    module0147.$g2094$.rebind(var3_262, var42);
                }
            }
            SubLObject var46 = var44;
            SubLObject var47 = (SubLObject)NIL;
            var47 = var46.first();
            while (NIL != var46) {
                f40762(var1, var32, var41, var47);
                var46 = var46.rest();
                var47 = var46.first();
            }
        }
        finally {
            module0655.$g5126$.rebind(var43, var42);
        }
        return (SubLObject)NIL;
    }

    public static SubLObject f40762(final SubLObject var1, final SubLObject var32, final SubLObject var41, final SubLObject var37) {
        final SubLThread var42 = SubLProcess.currentSubLThread();
        f40763(var37, module0655.$g5125$.getDynamicValue(var42), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        module0655.$g5125$.setDynamicValue(var37, var42);
        if (NIL != f40764()) {
            f40765(var1, var32, var41, var37);
        }
        else {
            f40766(var1, var32, var41, var37);
        }
        return (SubLObject)NIL;
    }

    public static SubLObject f40767(final SubLObject var108) {
        final SubLThread var109 = SubLProcess.currentSubLThread();
        $g5281$.setDynamicValue((SubLObject)ConsesLow.cons(var108, $g5281$.getDynamicValue(var109)), var109);
        return var108;
    }

    public static SubLObject f40764() {
        final SubLThread var2 = SubLProcess.currentSubLThread();
        return (SubLObject)makeBoolean(NIL != module0655.$g5126$.getDynamicValue(var2) && NIL != f40768((SubLObject)UNPROVIDED));
    }

    public static SubLObject f40768(SubLObject var263) {
        if (var263 == UNPROVIDED) {
            var263 = module0018.$g707$.getDynamicValue();
        }
        final SubLObject var264 = var263;
        if (var264.eql((SubLObject)$ic249$)) {
            return (SubLObject)NIL;
        }
        if (var264.eql((SubLObject)$ic250$) || var264.eql((SubLObject)$ic9$)) {
            return (SubLObject)T;
        }
        return (SubLObject)NIL;
    }

    public static SubLObject f40769(final SubLObject var108, SubLObject var264) {
        if (var264 == UNPROVIDED) {
            var264 = (SubLObject)NIL;
        }
        final SubLThread var265 = SubLProcess.currentSubLThread();
        if (NIL == module0656.$g5172$.getDynamicValue(var265) || NIL != Functions.funcall(module0656.$g5172$.getDynamicValue(var265), var108)) {
            if (NIL == var264 && $ic251$ == module0178.f11292(var108)) {
                return f40767(var108);
            }
            $g5282$.setDynamicValue((SubLObject)ConsesLow.cons(var108, $g5282$.getDynamicValue(var265)), var265);
        }
        return (SubLObject)NIL;
    }

    public static SubLObject f40770(final SubLObject var108, SubLObject var264) {
        if (var264 == UNPROVIDED) {
            var264 = (SubLObject)NIL;
        }
        final SubLThread var265 = SubLProcess.currentSubLThread();
        if (NIL == module0656.$g5172$.getDynamicValue(var265) || NIL != Functions.funcall(module0656.$g5172$.getDynamicValue(var265), var108)) {
            if (NIL == var264 && $ic251$ == module0178.f11292(var108)) {
                return f40767(var108);
            }
            final SubLObject var266 = module0538.f33367(var108, (SubLObject)UNPROVIDED);
            final SubLObject var267 = module0205.f13204(var266, (SubLObject)UNPROVIDED);
            SubLObject var268 = (SubLObject)NIL;
            if (NIL == assertion_handles_oc.f11035(var267) || NIL != module0035.f2439(Symbols.symbol_function((SubLObject)$ic252$), module0172.f10930(Sequences.remove(var267, var266, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)), (SubLObject)UNPROVIDED)) {
                var268 = module0656.f39925(var108, var266);
            }
            if (NIL == var268 || module0538.f33483(module0172.f10930(var268)).equal(module0538.f33483(module0172.f10930(var266)))) {
                $g5282$.setDynamicValue((SubLObject)ConsesLow.cons(var108, $g5282$.getDynamicValue(var265)), var265);
            }
            else {
                $g5283$.setDynamicValue((SubLObject)ConsesLow.cons(var108, $g5283$.getDynamicValue(var265)), var265);
            }
        }
        return (SubLObject)NIL;
    }

    public static SubLObject f40765(final SubLObject var1, final SubLObject var32, final SubLObject var41, final SubLObject var37) {
        final SubLThread var42 = SubLProcess.currentSubLThread();
        final SubLObject var43 = $g5281$.currentBinding(var42);
        final SubLObject var44 = $g5282$.currentBinding(var42);
        final SubLObject var45 = $g5283$.currentBinding(var42);
        try {
            $g5281$.bind((SubLObject)NIL, var42);
            $g5282$.bind((SubLObject)NIL, var42);
            $g5283$.bind((SubLObject)NIL, var42);
            final SubLObject var46 = (NIL != f40690(var1)) ? Symbols.symbol_function((SubLObject)$ic253$) : Symbols.symbol_function((SubLObject)$ic254$);
            if (NIL != module0210.f13595(var1, (SubLObject)UNPROVIDED)) {
                module0213.f13998(var46, var1, var32, var41, (SubLObject)NIL, var37);
            }
            else {
                module0219.f14477(var46, var1, var32, var41, (SubLObject)NIL, var37);
            }
            if (NIL != $g5282$.getDynamicValue(var42)) {
                module0642.f39020(module0015.$g346$.getGlobalValue());
                module0642.f39046(module0015.$g348$.getGlobalValue());
                module0642.f39020(module0015.$g352$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                module0642.f39020((SubLObject)ZERO_INTEGER);
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                module0642.f39020(module0015.$g353$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                module0642.f39020((SubLObject)ZERO_INTEGER);
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                module0642.f39020(module0015.$g354$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                module0642.f39020((SubLObject)ZERO_INTEGER);
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                final SubLObject var3_268 = module0015.$g533$.currentBinding(var42);
                try {
                    module0015.$g533$.bind((SubLObject)T, var42);
                    module0642.f39020(module0015.$g364$.getGlobalValue());
                    module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                    final SubLObject var3_269 = module0015.$g533$.currentBinding(var42);
                    try {
                        module0015.$g533$.bind((SubLObject)T, var42);
                        module0642.f39020(module0015.$g360$.getGlobalValue());
                        module0642.f39046(module0015.$g369$.getGlobalValue());
                        module0642.f39020(module0015.$g373$.getGlobalValue());
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                        module0642.f39020(module0642.f39049((SubLObject)$ic35$));
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                        final SubLObject var3_270 = module0015.$g533$.currentBinding(var42);
                        try {
                            module0015.$g533$.bind((SubLObject)T, var42);
                            f40771(var41, (SubLObject)UNPROVIDED);
                        }
                        finally {
                            module0015.$g533$.rebind(var3_270, var42);
                        }
                        module0642.f39020(module0015.$g361$.getGlobalValue());
                        module0642.f39020(module0015.$g360$.getGlobalValue());
                        module0642.f39020(module0015.$g373$.getGlobalValue());
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                        module0642.f39020(module0642.f39049((SubLObject)$ic35$));
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                        final SubLObject var3_271 = module0015.$g533$.currentBinding(var42);
                        try {
                            module0015.$g533$.bind((SubLObject)T, var42);
                            final SubLObject var47 = (NIL != f40692(var1)) ? Symbols.symbol_function((SubLObject)$ic255$) : Symbols.symbol_function((SubLObject)$ic256$);
                            final SubLObject var3_272 = module0655.$g5129$.currentBinding(var42);
                            final SubLObject var110_274 = module0655.$g5130$.currentBinding(var42);
                            try {
                                module0655.$g5129$.bind((SubLObject)NIL, var42);
                                module0655.$g5130$.bind((SubLObject)NIL, var42);
                                Mapping.mapcar(var47, Sequences.nreverse($g5282$.getDynamicValue(var42)));
                            }
                            finally {
                                module0655.$g5130$.rebind(var110_274, var42);
                                module0655.$g5129$.rebind(var3_272, var42);
                            }
                        }
                        finally {
                            module0015.$g533$.rebind(var3_271, var42);
                        }
                        module0642.f39020(module0015.$g361$.getGlobalValue());
                    }
                    finally {
                        module0015.$g533$.rebind(var3_269, var42);
                    }
                    module0642.f39020(module0015.$g365$.getGlobalValue());
                    module0642.f39029((SubLObject)UNPROVIDED);
                }
                finally {
                    module0015.$g533$.rebind(var3_268, var42);
                }
                module0642.f39020(module0015.$g347$.getGlobalValue());
            }
            if (NIL != $g5283$.getDynamicValue(var42)) {
                final SubLObject var48 = (NIL != f40692(var1)) ? Symbols.symbol_function((SubLObject)$ic258$) : Symbols.symbol_function((SubLObject)$ic260$);
                final SubLObject var3_273 = module0655.$g5129$.currentBinding(var42);
                final SubLObject var110_275 = module0655.$g5130$.currentBinding(var42);
                try {
                    module0655.$g5129$.bind((SubLObject)NIL, var42);
                    module0655.$g5130$.bind((SubLObject)NIL, var42);
                    Mapping.mapcar(var48, Sequences.nreverse($g5283$.getDynamicValue(var42)));
                }
                finally {
                    module0655.$g5130$.rebind(var110_275, var42);
                    module0655.$g5129$.rebind(var3_273, var42);
                }
            }
            if (NIL != $g5281$.getDynamicValue(var42)) {
                $g5282$.setDynamicValue((SubLObject)NIL, var42);
                $g5283$.setDynamicValue((SubLObject)NIL, var42);
                SubLObject var49 = $g5281$.getDynamicValue(var42);
                SubLObject var50 = (SubLObject)NIL;
                var50 = var49.first();
                while (NIL != var49) {
                    Functions.funcall(var46, var50, (SubLObject)T);
                    var49 = var49.rest();
                    var50 = var49.first();
                }
                if (NIL != $g5282$.getDynamicValue(var42)) {
                    module0642.f39020(module0015.$g346$.getGlobalValue());
                    module0642.f39046(module0015.$g348$.getGlobalValue());
                    module0642.f39020(module0015.$g352$.getGlobalValue());
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                    module0642.f39020((SubLObject)ZERO_INTEGER);
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                    module0642.f39020(module0015.$g353$.getGlobalValue());
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                    module0642.f39020((SubLObject)ZERO_INTEGER);
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                    module0642.f39020(module0015.$g354$.getGlobalValue());
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                    module0642.f39020((SubLObject)ZERO_INTEGER);
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                    module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                    final SubLObject var3_274 = module0015.$g533$.currentBinding(var42);
                    try {
                        module0015.$g533$.bind((SubLObject)T, var42);
                        module0642.f39020(module0015.$g364$.getGlobalValue());
                        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                        final SubLObject var3_275 = module0015.$g533$.currentBinding(var42);
                        try {
                            module0015.$g533$.bind((SubLObject)T, var42);
                            module0642.f39020(module0015.$g360$.getGlobalValue());
                            module0642.f39046(module0015.$g369$.getGlobalValue());
                            module0642.f39020(module0015.$g373$.getGlobalValue());
                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                            module0642.f39020(module0642.f39049((SubLObject)$ic35$));
                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                            final SubLObject var3_276 = module0015.$g533$.currentBinding(var42);
                            try {
                                module0015.$g533$.bind((SubLObject)T, var42);
                                f40771(var41, (SubLObject)T);
                            }
                            finally {
                                module0015.$g533$.rebind(var3_276, var42);
                            }
                            module0642.f39020(module0015.$g361$.getGlobalValue());
                            module0642.f39020(module0015.$g360$.getGlobalValue());
                            module0642.f39020(module0015.$g373$.getGlobalValue());
                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                            module0642.f39020(module0642.f39049((SubLObject)$ic35$));
                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                            final SubLObject var3_277 = module0015.$g533$.currentBinding(var42);
                            try {
                                module0015.$g533$.bind((SubLObject)T, var42);
                                final SubLObject var47 = (NIL != f40692(var1)) ? Symbols.symbol_function((SubLObject)$ic255$) : Symbols.symbol_function((SubLObject)$ic256$);
                                final SubLObject var3_278 = module0655.$g5129$.currentBinding(var42);
                                final SubLObject var110_276 = module0655.$g5130$.currentBinding(var42);
                                try {
                                    module0655.$g5129$.bind((SubLObject)NIL, var42);
                                    module0655.$g5130$.bind((SubLObject)NIL, var42);
                                    SubLObject var51 = $g5282$.getDynamicValue(var42);
                                    SubLObject var52 = (SubLObject)NIL;
                                    var52 = var51.first();
                                    while (NIL != var51) {
                                        Functions.funcall(var47, var52, (SubLObject)T);
                                        var51 = var51.rest();
                                        var52 = var51.first();
                                    }
                                }
                                finally {
                                    module0655.$g5130$.rebind(var110_276, var42);
                                    module0655.$g5129$.rebind(var3_278, var42);
                                }
                            }
                            finally {
                                module0015.$g533$.rebind(var3_277, var42);
                            }
                            module0642.f39020(module0015.$g361$.getGlobalValue());
                        }
                        finally {
                            module0015.$g533$.rebind(var3_275, var42);
                        }
                        module0642.f39020(module0015.$g365$.getGlobalValue());
                        module0642.f39029((SubLObject)UNPROVIDED);
                    }
                    finally {
                        module0015.$g533$.rebind(var3_274, var42);
                    }
                    module0642.f39020(module0015.$g347$.getGlobalValue());
                }
                if (NIL != $g5283$.getDynamicValue(var42)) {
                    final SubLObject var48 = (NIL != f40692(var1)) ? Symbols.symbol_function((SubLObject)$ic258$) : Symbols.symbol_function((SubLObject)$ic260$);
                    final SubLObject var3_279 = module0655.$g5129$.currentBinding(var42);
                    final SubLObject var110_277 = module0655.$g5130$.currentBinding(var42);
                    try {
                        module0655.$g5129$.bind((SubLObject)NIL, var42);
                        module0655.$g5130$.bind((SubLObject)NIL, var42);
                        Mapping.mapcar(var48, $g5283$.getDynamicValue(var42));
                    }
                    finally {
                        module0655.$g5130$.rebind(var110_277, var42);
                        module0655.$g5129$.rebind(var3_279, var42);
                    }
                }
            }
        }
        finally {
            $g5283$.rebind(var45, var42);
            $g5282$.rebind(var44, var42);
            $g5281$.rebind(var43, var42);
        }
        return (SubLObject)NIL;
    }

    public static SubLObject f40766(final SubLObject var1, final SubLObject var32, final SubLObject var41, final SubLObject var37) {
        final SubLThread var42 = SubLProcess.currentSubLThread();
        final SubLObject var43 = (NIL != f40692(var1)) ? Symbols.symbol_function((SubLObject)$ic258$) : Symbols.symbol_function((SubLObject)$ic260$);
        final SubLObject var44 = module0655.$g5129$.currentBinding(var42);
        final SubLObject var45 = module0655.$g5130$.currentBinding(var42);
        try {
            module0655.$g5129$.bind((SubLObject)NIL, var42);
            module0655.$g5130$.bind((SubLObject)NIL, var42);
            if (NIL != module0210.f13595(var1, (SubLObject)UNPROVIDED)) {
                module0213.f13998(var43, var1, var32, var41, (SubLObject)NIL, var37);
            }
            else {
                module0219.f14477(var43, var1, var32, var41, (SubLObject)NIL, var37);
            }
        }
        finally {
            module0655.$g5130$.rebind(var45, var42);
            module0655.$g5129$.rebind(var44, var42);
        }
        return (SubLObject)NIL;
    }

    public static SubLObject f40772(final SubLObject var52) {
        final SubLThread var53 = SubLProcess.currentSubLThread();
        SubLObject var54 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var52, var52, (SubLObject)$ic261$);
        var54 = var52.first();
        SubLObject var55 = var52.rest();
        final SubLObject var56 = (SubLObject)(var55.isCons() ? var55.first() : NIL);
        cdestructuring_bind.destructuring_bind_must_listp(var55, var52, (SubLObject)$ic261$);
        var55 = var55.rest();
        final SubLObject var57 = (SubLObject)(var55.isCons() ? var55.first() : NIL);
        cdestructuring_bind.destructuring_bind_must_listp(var55, var52, (SubLObject)$ic261$);
        var55 = var55.rest();
        if (NIL == var55) {
            final SubLObject var58 = module0656.f39969(var54);
            SubLObject var59 = (SubLObject)NIL;
            SubLObject var60 = (SubLObject)NIL;
            if (NIL == module0656.f39930(var58)) {
                return module0656.f39789((SubLObject)$ic88$, var54, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
            }
            if (NIL != var56) {
                var59 = reader.read_from_string_ignoring_errors(var56, (SubLObject)NIL, (SubLObject)NIL, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                if (!var59.isFixnum()) {
                    return module0656.f39789((SubLObject)$ic239$, var56, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                }
                if (NIL != var57) {
                    var60 = module0656.f39943(var57, (SubLObject)UNPROVIDED);
                    if (NIL == module0173.f10955(var60)) {
                        return module0656.f39789((SubLObject)$ic99$, var57, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                    }
                }
            }
            final SubLObject var62;
            final SubLObject var61 = var62 = PrintLow.format((SubLObject)NIL, (SubLObject)$ic262$, var58);
            final SubLObject var63 = module0015.$g538$.currentBinding(var53);
            try {
                module0015.$g538$.bind((NIL != module0057.f4158(module0015.$g538$.getDynamicValue(var53))) ? module0015.$g538$.getDynamicValue(var53) : module0057.f4173((SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED), var53);
                module0642.f39020((SubLObject)$ic0$);
                module0642.f39029((SubLObject)UNPROVIDED);
                module0642.f39020(module0015.$g155$.getGlobalValue());
                module0642.f39020(module0015.$g153$.getGlobalValue());
                module0015.f718();
                module0655.f39766();
                module0642.f39064(module0655.$g5143$.getDynamicValue(var53), module0655.$g5142$.getDynamicValue(var53));
                final SubLObject var64 = module0014.f672((SubLObject)$ic1$);
                module0642.f39029((SubLObject)UNPROVIDED);
                module0642.f39020(module0015.$g175$.getGlobalValue());
                module0642.f39020(module0015.$g176$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                module0642.f39020((SubLObject)$ic2$);
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                if (NIL != var64) {
                    module0642.f39020(module0015.$g178$.getGlobalValue());
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                    module0642.f39020(var64);
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                }
                module0642.f39020(module0015.$g177$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                module0642.f39020((SubLObject)$ic3$);
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                if (NIL != var62) {
                    module0642.f39029((SubLObject)UNPROVIDED);
                    module0642.f39020(module0015.$g173$.getGlobalValue());
                    module0642.f39019(var62);
                    module0642.f39020(module0015.$g174$.getGlobalValue());
                }
                module0016.f941();
                module0642.f39020(module0015.$g154$.getGlobalValue());
                module0642.f39029((SubLObject)UNPROVIDED);
                final SubLObject var3_289 = module0015.$g535$.currentBinding(var53);
                try {
                    module0015.$g535$.bind((SubLObject)T, var53);
                    module0642.f39020(module0015.$g133$.getGlobalValue());
                    if (NIL != module0015.$g132$.getDynamicValue(var53)) {
                        module0642.f39020(module0015.$g135$.getGlobalValue());
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                        module0642.f39020(module0642.f39042(module0015.$g132$.getDynamicValue(var53)));
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                    }
                    module0642.f39020(module0015.$g137$.getGlobalValue());
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                    module0642.f39020((SubLObject)$ic150$);
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                    module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                    final SubLObject var3_290 = module0015.$g533$.currentBinding(var53);
                    try {
                        module0015.$g533$.bind((SubLObject)T, var53);
                        module0642.f39020(module0015.$g144$.getGlobalValue());
                        module0642.f39020(module0015.$g157$.getGlobalValue());
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                        module0642.f39020((SubLObject)$ic151$);
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                        final SubLObject var3_291 = module0015.$g533$.currentBinding(var53);
                        try {
                            module0015.$g533$.bind((SubLObject)T, var53);
                            module0642.f39020(module0015.$g295$.getGlobalValue());
                            module0642.f39020(module0015.$g305$.getGlobalValue());
                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                            module0642.f39020((SubLObject)$ic152$);
                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                            module0642.f39020(module0015.$g302$.getGlobalValue());
                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                            module0642.f39020((SubLObject)$ic153$);
                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                            module0642.f39020(module0015.$g307$.getGlobalValue());
                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                            module0642.f39019((SubLObject)$ic154$);
                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                            module0642.f39020(module0015.$g160$.getGlobalValue());
                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                            module0642.f39020((SubLObject)$ic155$);
                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                        }
                        finally {
                            module0015.$g533$.rebind(var3_291, var53);
                        }
                        module0642.f39020(module0015.$g145$.getGlobalValue());
                        f40722(var58);
                        module0642.f39026((SubLObject)TWO_INTEGER);
                        f40742(var58, var59, var60);
                        module0642.f39029((SubLObject)UNPROVIDED);
                        module0642.f39050();
                    }
                    finally {
                        module0015.$g533$.rebind(var3_290, var53);
                    }
                    module0642.f39020(module0015.$g134$.getGlobalValue());
                    module0642.f39029((SubLObject)UNPROVIDED);
                }
                finally {
                    module0015.$g535$.rebind(var3_289, var53);
                }
                module0642.f39020(module0015.$g156$.getGlobalValue());
                module0642.f39029((SubLObject)UNPROVIDED);
            }
            finally {
                module0015.$g538$.rebind(var63, var53);
            }
        }
        else {
            cdestructuring_bind.cdestructuring_bind_error(var52, (SubLObject)$ic261$);
        }
        return (SubLObject)NIL;
    }

    public static SubLObject f40773(final SubLObject var1, final SubLObject var29, SubLObject var32, SubLObject var42) {
        if (var32 == UNPROVIDED) {
            var32 = (SubLObject)NIL;
        }
        if (var42 == UNPROVIDED) {
            var42 = (SubLObject)NIL;
        }
        final SubLThread var43 = SubLProcess.currentSubLThread();
        final SubLObject var44 = module0656.f39832((SubLObject)$ic48$);
        module0642.f39020(module0015.$g381$.getGlobalValue());
        module0642.f39020(module0015.$g383$.getGlobalValue());
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        module0655.f39768();
        PrintLow.format(module0015.$g131$.getDynamicValue(var43), (SubLObject)$ic264$, module0656.f39931(var1));
        if (NIL != var32) {
            PrintLow.format(module0015.$g131$.getDynamicValue(var43), (SubLObject)$ic244$, var32);
            if (NIL != var42) {
                PrintLow.format(module0015.$g131$.getDynamicValue(var43), (SubLObject)$ic244$, module0656.f39842(var42));
            }
        }
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        if (NIL != var44) {
            module0642.f39020(module0015.$g387$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
            module0642.f39020(var44);
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        }
        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
        final SubLObject var45 = module0015.$g533$.currentBinding(var43);
        try {
            module0015.$g533$.bind((SubLObject)T, var43);
            if (NIL != var42) {
                module0642.f39019(module0656.f39941(var42));
            }
            else if (NIL != var32) {
                PrintLow.format(module0015.$g131$.getDynamicValue(var43), (SubLObject)$ic245$, var32);
            }
            else {
                PrintLow.format(module0015.$g131$.getDynamicValue(var43), (SubLObject)$ic265$);
            }
        }
        finally {
            module0015.$g533$.rebind(var45, var43);
        }
        module0642.f39020(module0015.$g382$.getGlobalValue());
        if (var29.numG((SubLObject)ONE_INTEGER)) {
            PrintLow.format(module0015.$g131$.getDynamicValue(var43), (SubLObject)$ic219$, var29);
        }
        return var1;
    }

    public static SubLObject f40742(final SubLObject var1, final SubLObject var32, final SubLObject var42) {
        final SubLThread var43 = SubLProcess.currentSubLThread();
        final SubLObject var44 = module0656.$g5172$.currentBinding(var43);
        final SubLObject var45 = module0580.$g4361$.currentBinding(var43);
        try {
            module0656.$g5172$.bind(module0661.f40305(), var43);
            module0580.$g4361$.bind((SubLObject)NIL, var43);
            var43.resetMultipleValues();
            final SubLObject var3_292 = module0580.$g4362$.currentBinding(var43);
            try {
                module0580.$g4362$.bind(module0580.f35560(), var43);
                final SubLObject var46 = var43.secondMultipleValue();
                var43.resetMultipleValues();
                try {
                    var43.resetMultipleValues();
                    final SubLObject var3_293 = module0580.$g4358$.currentBinding(var43);
                    try {
                        module0580.$g4358$.bind(module0580.f35544(), var43);
                        final SubLObject var47 = var43.secondMultipleValue();
                        var43.resetMultipleValues();
                        final SubLObject var3_294 = module0580.$g4359$.currentBinding(var43);
                        try {
                            module0580.$g4359$.bind(module0580.f35545(), var43);
                            final SubLObject var48 = module0580.$g4358$.getDynamicValue(var43);
                            final SubLObject var3_295 = module0034.$g879$.currentBinding(var43);
                            try {
                                module0034.$g879$.bind(var48, var43);
                                SubLObject var49 = (SubLObject)NIL;
                                if (NIL != var48 && NIL == module0034.f1842(var48)) {
                                    var49 = module0034.f1869(var48);
                                    final SubLObject var50 = Threads.current_process();
                                    if (NIL == var49) {
                                        module0034.f1873(var48, var50);
                                    }
                                    else if (!var49.eql(var50)) {
                                        Errors.error((SubLObject)$ic156$);
                                    }
                                }
                                try {
                                    final SubLObject var3_296 = module0579.$g4260$.currentBinding(var43);
                                    final SubLObject var110_297 = module0579.$g4259$.currentBinding(var43);
                                    try {
                                        module0579.$g4260$.bind(module0677.f41312(), var43);
                                        module0579.$g4259$.bind((SubLObject)$ic157$, var43);
                                        if (NIL == var32) {
                                            f40774(var1);
                                        }
                                        else if (NIL == var42) {
                                            f40775(var1, var32);
                                        }
                                        else {
                                            f40776(var32);
                                            final SubLObject var3_297 = module0655.$g5127$.currentBinding(var43);
                                            try {
                                                module0655.$g5127$.bind((SubLObject)makeBoolean(NIL != module0655.$g5127$.getDynamicValue(var43) && NIL == module0223.f14667(var1) && var32.eql((SubLObject)ONE_INTEGER)), var43);
                                                if (NIL != module0655.$g5127$.getDynamicValue(var43)) {
                                                    final SubLObject var3_298 = module0147.$g2094$.currentBinding(var43);
                                                    final SubLObject var110_298 = module0147.$g2095$.currentBinding(var43);
                                                    try {
                                                        module0147.$g2094$.bind((SubLObject)$ic134$, var43);
                                                        module0147.$g2095$.bind($ic135$, var43);
                                                        module0655.$g5127$.setDynamicValue(module0225.f14781(var42), var43);
                                                    }
                                                    finally {
                                                        module0147.$g2095$.rebind(var110_298, var43);
                                                        module0147.$g2094$.rebind(var3_298, var43);
                                                    }
                                                }
                                                f40777(var1, var32, var42);
                                                module0659.f40117((SubLObject)$ic54$, (SubLObject)$ic248$, (SubLObject)$ic7$, var1, var32, var42, (SubLObject)UNPROVIDED);
                                            }
                                            finally {
                                                module0655.$g5127$.rebind(var3_297, var43);
                                            }
                                        }
                                    }
                                    finally {
                                        module0579.$g4259$.rebind(var110_297, var43);
                                        module0579.$g4260$.rebind(var3_296, var43);
                                    }
                                }
                                finally {
                                    final SubLObject var3_299 = Threads.$is_thread_performing_cleanupP$.currentBinding(var43);
                                    try {
                                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)T, var43);
                                        if (NIL != var48 && NIL == var49) {
                                            module0034.f1873(var48, (SubLObject)NIL);
                                        }
                                    }
                                    finally {
                                        Threads.$is_thread_performing_cleanupP$.rebind(var3_299, var43);
                                    }
                                }
                            }
                            finally {
                                module0034.$g879$.rebind(var3_295, var43);
                            }
                        }
                        finally {
                            module0580.$g4359$.rebind(var3_294, var43);
                        }
                        if (var47 == $ic159$ && NIL != module0034.f1839(module0580.$g4358$.getDynamicValue(var43))) {
                            module0034.f1891(module0580.$g4358$.getDynamicValue(var43));
                        }
                    }
                    finally {
                        module0580.$g4358$.rebind(var3_293, var43);
                    }
                }
                finally {
                    final SubLObject var3_300 = Threads.$is_thread_performing_cleanupP$.currentBinding(var43);
                    try {
                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)T, var43);
                        if (NIL == var46) {
                            module0580.f35554(module0580.$g4362$.getDynamicValue(var43));
                        }
                    }
                    finally {
                        Threads.$is_thread_performing_cleanupP$.rebind(var3_300, var43);
                    }
                }
            }
            finally {
                module0580.$g4362$.rebind(var3_292, var43);
            }
        }
        finally {
            module0580.$g4361$.rebind(var45, var43);
            module0656.$g5172$.rebind(var44, var43);
        }
        return (SubLObject)NIL;
    }

    public static SubLObject f40774(final SubLObject var1) {
        SubLObject var2 = (SubLObject)NIL;
        SubLObject var4;
        final SubLObject var3 = var4 = f40640(var1, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        SubLObject var5 = (SubLObject)NIL;
        var5 = var4.first();
        while (NIL != var4) {
            if (NIL != var2) {
                module0642.f39051((SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
            }
            f40775(var1, var5);
            var2 = (SubLObject)T;
            var4 = var4.rest();
            var5 = var4.first();
        }
        return (SubLObject)NIL;
    }

    public static SubLObject f40775(final SubLObject var1, final SubLObject var32) {
        f40776(var32);
        SubLObject var34;
        final SubLObject var33 = var34 = f40640(var1, var32, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        SubLObject var35 = (SubLObject)NIL;
        var35 = var34.first();
        while (NIL != var34) {
            f40777(var1, var32, var35);
            var34 = var34.rest();
            var35 = var34.first();
        }
        return (SubLObject)NIL;
    }

    public static SubLObject f40777(final SubLObject var1, final SubLObject var32, final SubLObject var42) {
        if (NIL != f40778()) {
            f40779(var1, var32, var42);
        }
        else {
            f40780(var1, var32, var42);
        }
        return (SubLObject)NIL;
    }

    public static SubLObject f40778() {
        final SubLThread var2 = SubLProcess.currentSubLThread();
        return (SubLObject)makeBoolean(NIL != module0655.$g5127$.getDynamicValue(var2) && $ic9$ == module0018.$g707$.getDynamicValue(var2));
    }

    public static SubLObject f40781(final SubLObject var108) {
        final SubLThread var109 = SubLProcess.currentSubLThread();
        if (NIL == module0656.$g5172$.getDynamicValue(var109) || NIL != Functions.funcall(module0656.$g5172$.getDynamicValue(var109), var108)) {
            $g5284$.setDynamicValue((SubLObject)ConsesLow.cons(var108, $g5284$.getDynamicValue(var109)), var109);
        }
        return (SubLObject)NIL;
    }

    public static SubLObject f40782(final SubLObject var108) {
        final SubLThread var109 = SubLProcess.currentSubLThread();
        if (NIL == module0656.$g5172$.getDynamicValue(var109) || NIL != Functions.funcall(module0656.$g5172$.getDynamicValue(var109), var108)) {
            final SubLObject var110 = module0538.f33367(var108, (SubLObject)UNPROVIDED);
            final SubLObject var111 = module0205.f13204(var110, (SubLObject)UNPROVIDED);
            SubLObject var112 = (SubLObject)NIL;
            if (NIL == assertion_handles_oc.f11035(var111) || NIL != module0035.f2439(Symbols.symbol_function((SubLObject)$ic252$), module0172.f10930(Sequences.remove(var111, var110, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)), (SubLObject)UNPROVIDED)) {
                var112 = module0656.f39925(var108, var110);
            }
            if (NIL == var112 || module0538.f33483(module0172.f10930(var112)).equal(module0538.f33483(module0172.f10930(var110)))) {
                $g5284$.setDynamicValue((SubLObject)ConsesLow.cons(var108, $g5284$.getDynamicValue(var109)), var109);
            }
            else {
                $g5285$.setDynamicValue((SubLObject)ConsesLow.cons(var108, $g5285$.getDynamicValue(var109)), var109);
            }
        }
        return (SubLObject)NIL;
    }

    public static SubLObject f40779(final SubLObject var1, final SubLObject var32, final SubLObject var42) {
        final SubLThread var43 = SubLProcess.currentSubLThread();
        final SubLObject var44 = $g5284$.currentBinding(var43);
        final SubLObject var45 = $g5285$.currentBinding(var43);
        try {
            $g5284$.bind((SubLObject)NIL, var43);
            $g5285$.bind((SubLObject)NIL, var43);
            final SubLObject var46 = (NIL != f40690(var1)) ? Symbols.symbol_function((SubLObject)$ic267$) : Symbols.symbol_function((SubLObject)$ic268$);
            module0219.f14479(var46, var1, var32, var42);
            if (NIL != $g5284$.getDynamicValue(var43)) {
                module0642.f39020(module0015.$g346$.getGlobalValue());
                module0642.f39046(module0015.$g348$.getGlobalValue());
                module0642.f39020(module0015.$g352$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                module0642.f39020((SubLObject)ZERO_INTEGER);
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                module0642.f39020(module0015.$g353$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                module0642.f39020((SubLObject)ZERO_INTEGER);
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                module0642.f39020(module0015.$g354$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                module0642.f39020((SubLObject)ZERO_INTEGER);
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                final SubLObject var3_304 = module0015.$g533$.currentBinding(var43);
                try {
                    module0015.$g533$.bind((SubLObject)T, var43);
                    module0642.f39020(module0015.$g364$.getGlobalValue());
                    module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                    final SubLObject var3_305 = module0015.$g533$.currentBinding(var43);
                    try {
                        module0015.$g533$.bind((SubLObject)T, var43);
                        module0642.f39020(module0015.$g360$.getGlobalValue());
                        module0642.f39020(module0015.$g373$.getGlobalValue());
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                        module0642.f39020(module0642.f39049((SubLObject)$ic35$));
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                        final SubLObject var3_306 = module0015.$g533$.currentBinding(var43);
                        try {
                            module0015.$g533$.bind((SubLObject)T, var43);
                            Mapping.mapcar(Symbols.symbol_function((SubLObject)$ic269$), Sequences.nreverse($g5284$.getDynamicValue(var43)));
                        }
                        finally {
                            module0015.$g533$.rebind(var3_306, var43);
                        }
                        module0642.f39020(module0015.$g361$.getGlobalValue());
                    }
                    finally {
                        module0015.$g533$.rebind(var3_305, var43);
                    }
                    module0642.f39020(module0015.$g365$.getGlobalValue());
                    module0642.f39029((SubLObject)UNPROVIDED);
                }
                finally {
                    module0015.$g533$.rebind(var3_304, var43);
                }
                module0642.f39020(module0015.$g347$.getGlobalValue());
            }
            if (NIL != $g5285$.getDynamicValue(var43)) {
                final SubLObject var47 = (NIL != f40692(var1)) ? Symbols.symbol_function((SubLObject)$ic258$) : Symbols.symbol_function((SubLObject)$ic260$);
                final SubLObject var3_307 = module0655.$g5129$.currentBinding(var43);
                final SubLObject var110_308 = module0655.$g5130$.currentBinding(var43);
                try {
                    module0655.$g5129$.bind((SubLObject)NIL, var43);
                    module0655.$g5130$.bind((SubLObject)NIL, var43);
                    Mapping.mapcar(var47, Sequences.nreverse($g5285$.getDynamicValue(var43)));
                }
                finally {
                    module0655.$g5130$.rebind(var110_308, var43);
                    module0655.$g5129$.rebind(var3_307, var43);
                }
            }
        }
        finally {
            $g5285$.rebind(var45, var43);
            $g5284$.rebind(var44, var43);
        }
        return (SubLObject)NIL;
    }

    public static SubLObject f40780(final SubLObject var1, final SubLObject var32, final SubLObject var42) {
        final SubLThread var43 = SubLProcess.currentSubLThread();
        final SubLObject var44 = (NIL != f40692(var1)) ? Symbols.symbol_function((SubLObject)$ic258$) : Symbols.symbol_function((SubLObject)$ic260$);
        final SubLObject var45 = module0655.$g5129$.currentBinding(var43);
        final SubLObject var46 = module0655.$g5130$.currentBinding(var43);
        try {
            module0655.$g5129$.bind((SubLObject)NIL, var43);
            module0655.$g5130$.bind((SubLObject)NIL, var43);
            module0219.f14479(var44, var1, var32, var42);
        }
        finally {
            module0655.$g5130$.rebind(var46, var43);
            module0655.$g5129$.rebind(var45, var43);
        }
        return (SubLObject)NIL;
    }

    public static SubLObject f40783(final SubLObject var1) {
        final SubLThread var2 = SubLProcess.currentSubLThread();
        if (NIL != module0173.f10955(var1)) {
            SubLObject var3 = (SubLObject)NIL;
            final SubLObject var4 = module0147.$g2094$.currentBinding(var2);
            final SubLObject var5 = module0147.$g2095$.currentBinding(var2);
            try {
                module0147.$g2094$.bind((SubLObject)$ic134$, var2);
                module0147.$g2095$.bind($ic135$, var2);
                var3 = module0269.f17701(var1, (SubLObject)NIL);
            }
            finally {
                module0147.$g2095$.rebind(var5, var2);
                module0147.$g2094$.rebind(var4, var2);
            }
            if (NIL != var3) {
                module0642.f39019(f40784(var3));
            }
            else {
                module0642.f39019((SubLObject)$ic270$);
            }
        }
        else if (NIL != module0223.f14667(var1)) {
            module0642.f39019((SubLObject)$ic271$);
        }
        else if (NIL != module0210.f13595(var1, (SubLObject)UNPROVIDED)) {
            module0642.f39019((SubLObject)$ic272$);
        }
        return var1;
    }

    public static SubLObject f40784(final SubLObject var309) {
        if (var309.eql($ic273$)) {
            return (SubLObject)$ic274$;
        }
        return module0597.f36628(var309);
    }

    public static SubLObject f40785(final SubLObject var6) {
        final SubLThread var7 = SubLProcess.currentSubLThread();
        if (NIL != module0259.f16976(var6, $ic277$)) {
            module0642.f39020(module0015.$g219$.getGlobalValue());
            if (NIL != module0015.$g495$.getGlobalValue()) {
                module0642.f39020(module0015.$g222$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                module0642.f39020(module0642.f39042(module0015.$g495$.getGlobalValue()));
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
            }
            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
            final SubLObject var8 = module0015.$g533$.currentBinding(var7);
            try {
                module0015.$g533$.bind((SubLObject)T, var7);
                module0642.f39026((SubLObject)TWO_INTEGER);
                module0656.f39915(var6, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                module0642.f39019((SubLObject)$ic278$);
                module0642.f39027((SubLObject)$ic37$, (SubLObject)UNPROVIDED);
                module0642.f39020(module0015.$g219$.getGlobalValue());
                module0642.f39020(module0015.$g221$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                module0642.f39020((SubLObject)$ic279$);
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                final SubLObject var3_310 = module0015.$g533$.currentBinding(var7);
                try {
                    module0015.$g533$.bind((SubLObject)T, var7);
                    final SubLObject var9 = module0014.f690((SubLObject)$ic275$);
                    final SubLObject var10 = module0656.f39832((SubLObject)((NIL != module0655.$g5109$.getDynamicValue(var7)) ? $ic280$ : $ic7$));
                    module0642.f39020(module0015.$g381$.getGlobalValue());
                    module0642.f39020(module0015.$g383$.getGlobalValue());
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                    module0642.f39020(var9);
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                    if (NIL != var10) {
                        module0642.f39020(module0015.$g387$.getGlobalValue());
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                        module0642.f39020(var10);
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                    }
                    module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                    final SubLObject var3_311 = module0015.$g533$.currentBinding(var7);
                    try {
                        module0015.$g533$.bind((SubLObject)T, var7);
                        module0642.f39019((SubLObject)$ic281$);
                    }
                    finally {
                        module0015.$g533$.rebind(var3_311, var7);
                    }
                    module0642.f39020(module0015.$g382$.getGlobalValue());
                }
                finally {
                    module0015.$g533$.rebind(var3_310, var7);
                }
                module0642.f39020(module0015.$g220$.getGlobalValue());
            }
            finally {
                module0015.$g533$.rebind(var8, var7);
            }
            module0642.f39020(module0015.$g220$.getGlobalValue());
        }
        return (SubLObject)NIL;
    }

    public static SubLObject f40722(final SubLObject var1) {
        final SubLThread var2 = SubLProcess.currentSubLThread();
        module0642.f39020(module0015.$g234$.getGlobalValue());
        SubLObject var3 = (SubLObject)FIVE_INTEGER;
        module0642.f39020(module0015.$g219$.getGlobalValue());
        if (NIL != var3) {
            module0642.f39020(module0015.$g221$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
            module0642.f39020(var3);
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        }
        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
        SubLObject var4 = module0015.$g533$.currentBinding(var2);
        try {
            module0015.$g533$.bind((SubLObject)T, var2);
            f40783(var1);
            module0642.f39019((SubLObject)$ic118$);
        }
        finally {
            module0015.$g533$.rebind(var4, var2);
        }
        module0642.f39020(module0015.$g220$.getGlobalValue());
        module0642.f39020(module0015.$g235$.getGlobalValue());
        if (NIL != module0173.f10955(var1)) {
            module0642.f39020(module0015.$g234$.getGlobalValue());
            if (NIL != module0167.f10813(var1)) {
                module0642.f39026((SubLObject)UNPROVIDED);
                module0642.f39020(module0015.$g230$.getGlobalValue());
                module0642.f39020(module0015.$g459$.getGlobalValue());
                module0656.f39915(var1, (SubLObject)ZERO_INTEGER, (SubLObject)T);
                module0642.f39020(module0015.$g460$.getGlobalValue());
                module0642.f39020(module0015.$g231$.getGlobalValue());
            }
            else {
                final SubLObject var5 = (SubLObject)FIVE_INTEGER;
                module0642.f39020(module0015.$g219$.getGlobalValue());
                if (NIL != var5) {
                    module0642.f39020(module0015.$g221$.getGlobalValue());
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                    module0642.f39020(var5);
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                }
                module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                final SubLObject var6 = module0015.$g533$.currentBinding(var2);
                try {
                    module0015.$g533$.bind((SubLObject)T, var2);
                    module0656.f39915(var1, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                }
                finally {
                    module0015.$g533$.rebind(var6, var2);
                }
                module0642.f39020(module0015.$g220$.getGlobalValue());
            }
            module0642.f39020(module0015.$g235$.getGlobalValue());
            f40785(var1);
        }
        else if (NIL != module0223.f14667(var1)) {
            module0642.f39020(module0015.$g234$.getGlobalValue());
            var3 = (SubLObject)FIVE_INTEGER;
            module0642.f39020(module0015.$g219$.getGlobalValue());
            if (NIL != var3) {
                module0642.f39020(module0015.$g221$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                module0642.f39020(var3);
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
            }
            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
            var4 = module0015.$g533$.currentBinding(var2);
            try {
                module0015.$g533$.bind((SubLObject)T, var2);
                module0656.f39837((SubLObject)$ic6$, var1, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
            }
            finally {
                module0015.$g533$.rebind(var4, var2);
            }
            module0642.f39020(module0015.$g220$.getGlobalValue());
            module0642.f39020(module0015.$g235$.getGlobalValue());
        }
        else if (NIL != module0210.f13595(var1, (SubLObject)UNPROVIDED)) {
            module0642.f39026((SubLObject)UNPROVIDED);
            module0642.f39020(module0015.$g234$.getGlobalValue());
            module0642.f39020(module0015.$g230$.getGlobalValue());
            module0642.f39020(module0015.$g459$.getGlobalValue());
            module0656.f39915(var1, (SubLObject)ZERO_INTEGER, (SubLObject)T);
            module0642.f39020(module0015.$g460$.getGlobalValue());
            module0642.f39020(module0015.$g231$.getGlobalValue());
            module0642.f39020(module0015.$g235$.getGlobalValue());
        }
        else {
            module0642.f39020(module0015.$g234$.getGlobalValue());
            module0642.f39019(var1);
            module0642.f39020(module0015.$g235$.getGlobalValue());
        }
        return (SubLObject)NIL;
    }

    public static SubLObject f40724(final SubLObject var32) {
        final SubLThread var33 = SubLProcess.currentSubLThread();
        if (NIL != $g5286$.getDynamicValue(var33)) {
            module0642.f39020(module0015.$g234$.getGlobalValue());
            module0642.f39020(module0015.$g207$.getGlobalValue());
            PrintLow.format(module0015.$g131$.getDynamicValue(var33), (SubLObject)$ic282$, var32);
            module0642.f39020(module0015.$g208$.getGlobalValue());
            module0642.f39020(module0015.$g235$.getGlobalValue());
            module0642.f39026((SubLObject)UNPROVIDED);
        }
        return (SubLObject)NIL;
    }

    public static SubLObject f40776(final SubLObject var32) {
        final SubLThread var33 = SubLProcess.currentSubLThread();
        module0642.f39020(module0015.$g234$.getGlobalValue());
        module0642.f39020(module0015.$g207$.getGlobalValue());
        PrintLow.format(module0015.$g131$.getDynamicValue(var33), (SubLObject)$ic283$, var32);
        module0642.f39020(module0015.$g208$.getGlobalValue());
        module0642.f39020(module0015.$g235$.getGlobalValue());
        module0642.f39026((SubLObject)UNPROVIDED);
        return (SubLObject)NIL;
    }

    public static SubLObject f40763(final SubLObject var37, SubLObject var315, SubLObject var316, SubLObject var317) {
        if (var315 == UNPROVIDED) {
            var315 = (SubLObject)NIL;
        }
        if (var316 == UNPROVIDED) {
            var316 = (SubLObject)T;
        }
        if (var317 == UNPROVIDED) {
            var317 = (SubLObject)T;
        }
        final SubLThread var318 = SubLProcess.currentSubLThread();
        if (NIL != $g5287$.getDynamicValue(var318) && NIL == module0161.f10513(var37, var315)) {
            module0642.f39026((SubLObject)UNPROVIDED);
            if (NIL != var316) {
                module0642.f39020(module0015.$g234$.getGlobalValue());
                f40786(var37, var315);
                module0642.f39020(module0015.$g235$.getGlobalValue());
            }
            else {
                f40786(var37, var315);
            }
            if (NIL != var317) {
                module0642.f39026((SubLObject)UNPROVIDED);
            }
        }
        return (SubLObject)NIL;
    }

    public static SubLObject f40786(final SubLObject var37, final SubLObject var315) {
        final SubLThread var316 = SubLProcess.currentSubLThread();
        if (NIL != module0655.$g5112$.getDynamicValue(var316)) {
            module0642.f39021((SubLObject)$ic163$);
            module0656.f39804(var37, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        }
        else if (NIL == module0161.f10471()) {
            module0642.f39021((SubLObject)$ic164$);
            module0656.f39915(var37, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        }
        else {
            final SubLObject var317 = module0161.f10557(var37);
            SubLObject var318 = (SubLObject)NIL;
            SubLObject var319 = (SubLObject)NIL;
            var316.resetMultipleValues();
            final SubLObject var321_322 = module0161.f10583(var37);
            final SubLObject var323_324 = var316.secondMultipleValue();
            var316.resetMultipleValues();
            var318 = var321_322;
            var319 = var323_324;
            if (NIL != module0161.f10581(var318) && NIL != module0161.f10582(var319)) {
                module0642.f39021((SubLObject)$ic164$);
                module0656.f39915(var317, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
            }
            else {
                module0642.f39021((SubLObject)$ic284$);
                module0656.f39915(var317, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                module0642.f39026((SubLObject)UNPROVIDED);
                module0642.f39021((SubLObject)$ic285$);
                module0656.f39915(var318, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                module0642.f39026((SubLObject)UNPROVIDED);
                module0642.f39021((SubLObject)$ic286$);
                module0656.f39915(var319, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
            }
        }
        return (SubLObject)NIL;
    }

    public static SubLObject f40787(final SubLObject var35) {
        module0642.f39026((SubLObject)UNPROVIDED);
        module0642.f39020(module0015.$g234$.getGlobalValue());
        module0642.f39019((SubLObject)$ic287$);
        module0656.f39915(var35, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        module0642.f39020(module0015.$g235$.getGlobalValue());
        module0642.f39026((SubLObject)UNPROVIDED);
        return (SubLObject)NIL;
    }

    public static SubLObject f40771(final SubLObject var41, SubLObject var325) {
        if (var325 == UNPROVIDED) {
            var325 = (SubLObject)NIL;
        }
        final SubLThread var326 = SubLProcess.currentSubLThread();
        module0642.f39020(module0015.$g234$.getGlobalValue());
        if (NIL != var325) {
            final SubLObject var327 = (SubLObject)(($ic250$ == module0018.$g707$.getDynamicValue(var326)) ? $ic288$ : $ic289$);
            final SubLObject var328 = (SubLObject)$ic111$;
            module0642.f39020(module0015.$g219$.getGlobalValue());
            if (NIL != var328) {
                module0642.f39020(module0015.$g222$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                module0642.f39020(module0642.f39042(var328));
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
            }
            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
            final SubLObject var329 = module0015.$g533$.currentBinding(var326);
            try {
                module0015.$g533$.bind((SubLObject)T, var326);
                module0642.f39019(var327);
                module0642.f39032((SubLObject)UNPROVIDED);
            }
            finally {
                module0015.$g533$.rebind(var329, var326);
            }
            module0642.f39020(module0015.$g220$.getGlobalValue());
        }
        module0656.f39915(var41, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        module0642.f39019((SubLObject)$ic118$);
        module0642.f39020(module0015.$g235$.getGlobalValue());
        return (SubLObject)NIL;
    }

    public static SubLObject f40788(final SubLObject var52) {
        SubLObject var53 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var52, var52, (SubLObject)$ic238$);
        var53 = var52.first();
        SubLObject var54 = var52.rest();
        final SubLObject var55 = (SubLObject)(var54.isCons() ? var54.first() : NIL);
        cdestructuring_bind.destructuring_bind_must_listp(var54, var52, (SubLObject)$ic238$);
        var54 = var54.rest();
        final SubLObject var56 = (SubLObject)(var54.isCons() ? var54.first() : NIL);
        cdestructuring_bind.destructuring_bind_must_listp(var54, var52, (SubLObject)$ic238$);
        var54 = var54.rest();
        final SubLObject var57 = (SubLObject)(var54.isCons() ? var54.first() : NIL);
        cdestructuring_bind.destructuring_bind_must_listp(var54, var52, (SubLObject)$ic238$);
        var54 = var54.rest();
        if (NIL != var54) {
            cdestructuring_bind.cdestructuring_bind_error(var52, (SubLObject)$ic238$);
            return (SubLObject)NIL;
        }
        final SubLObject var58 = module0656.f39969(var53);
        SubLObject var59 = (SubLObject)NIL;
        SubLObject var60 = (SubLObject)NIL;
        SubLObject var61 = (SubLObject)NIL;
        if (NIL == module0656.f39930(var58)) {
            return module0656.f39789((SubLObject)$ic88$, var53, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        }
        if (NIL != var55) {
            var59 = reader.read_from_string_ignoring_errors(var55, (SubLObject)NIL, (SubLObject)NIL, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
            if (!var59.isFixnum()) {
                return module0656.f39789((SubLObject)$ic239$, var55, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
            }
            if (NIL != var56) {
                var60 = module0656.f39943(var56, (SubLObject)UNPROVIDED);
                if (NIL == module0173.f10955(var60)) {
                    return module0656.f39789((SubLObject)$ic99$, var56, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                }
                if (NIL != var57) {
                    var61 = module0656.f39959(var57);
                    if (NIL == module0161.f10481(var61)) {
                        return module0656.f39789((SubLObject)$ic240$, var57, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                    }
                }
            }
        }
        return f40789(var58, var59, var60, var61);
    }

    public static SubLObject f40789(final SubLObject var1, final SubLObject var32, final SubLObject var41, final SubLObject var37) {
        final SubLThread var42 = SubLProcess.currentSubLThread();
        if (NIL != module0173.f10955(var1) && NIL == var37 && $ic170$ == module0660.$cb_default_index_view$.getDynamicValue(var42)) {
            return module0670.f40951(var1, var1, var32, var41);
        }
        final SubLObject var44;
        final SubLObject var43 = var44 = PrintLow.format((SubLObject)NIL, (SubLObject)$ic290$, var1);
        final SubLObject var45 = module0015.$g538$.currentBinding(var42);
        try {
            module0015.$g538$.bind((NIL != module0057.f4158(module0015.$g538$.getDynamicValue(var42))) ? module0015.$g538$.getDynamicValue(var42) : module0057.f4173((SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED), var42);
            module0642.f39020((SubLObject)$ic0$);
            module0642.f39029((SubLObject)UNPROVIDED);
            module0642.f39020(module0015.$g155$.getGlobalValue());
            module0642.f39020(module0015.$g153$.getGlobalValue());
            module0015.f718();
            module0655.f39766();
            module0642.f39064(module0655.$g5143$.getDynamicValue(var42), module0655.$g5142$.getDynamicValue(var42));
            final SubLObject var46 = module0014.f672((SubLObject)$ic1$);
            module0642.f39029((SubLObject)UNPROVIDED);
            module0642.f39020(module0015.$g175$.getGlobalValue());
            module0642.f39020(module0015.$g176$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
            module0642.f39020((SubLObject)$ic2$);
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
            if (NIL != var46) {
                module0642.f39020(module0015.$g178$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                module0642.f39020(var46);
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
            }
            module0642.f39020(module0015.$g177$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
            module0642.f39020((SubLObject)$ic3$);
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
            if (NIL != var44) {
                module0642.f39029((SubLObject)UNPROVIDED);
                module0642.f39020(module0015.$g173$.getGlobalValue());
                module0642.f39019(var44);
                module0642.f39020(module0015.$g174$.getGlobalValue());
            }
            module0016.f941();
            module0642.f39020(module0015.$g154$.getGlobalValue());
            module0642.f39029((SubLObject)UNPROVIDED);
            final SubLObject var3_329 = module0015.$g535$.currentBinding(var42);
            try {
                module0015.$g535$.bind((SubLObject)T, var42);
                module0642.f39020(module0015.$g133$.getGlobalValue());
                if (NIL != module0015.$g132$.getDynamicValue(var42)) {
                    module0642.f39020(module0015.$g135$.getGlobalValue());
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                    module0642.f39020(module0642.f39042(module0015.$g132$.getDynamicValue(var42)));
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                }
                module0642.f39020(module0015.$g137$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                module0642.f39020((SubLObject)$ic150$);
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                final SubLObject var3_330 = module0015.$g533$.currentBinding(var42);
                try {
                    module0015.$g533$.bind((SubLObject)T, var42);
                    module0642.f39020(module0015.$g144$.getGlobalValue());
                    module0642.f39020(module0015.$g157$.getGlobalValue());
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                    module0642.f39020((SubLObject)$ic151$);
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                    module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                    final SubLObject var3_331 = module0015.$g533$.currentBinding(var42);
                    try {
                        module0015.$g533$.bind((SubLObject)T, var42);
                        module0642.f39020(module0015.$g295$.getGlobalValue());
                        module0642.f39020(module0015.$g305$.getGlobalValue());
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                        module0642.f39020((SubLObject)$ic152$);
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                        module0642.f39020(module0015.$g302$.getGlobalValue());
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                        module0642.f39020((SubLObject)$ic153$);
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                        module0642.f39020(module0015.$g307$.getGlobalValue());
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                        module0642.f39019((SubLObject)$ic154$);
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                        module0642.f39020(module0015.$g160$.getGlobalValue());
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                        module0642.f39020((SubLObject)$ic155$);
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                    }
                    finally {
                        module0015.$g533$.rebind(var3_331, var42);
                    }
                    module0642.f39020(module0015.$g145$.getGlobalValue());
                    f40720(var1);
                    f40722(var1);
                    module0642.f39026((SubLObject)TWO_INTEGER);
                    f40741(var1, var32, var41, var37);
                    module0642.f39051((SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                    if (NIL != module0269.f17715(var1)) {
                        f40743(var1, var37);
                    }
                    else if (NIL != module0269.f17723(var1)) {
                        f40744(var1);
                    }
                    module0642.f39029((SubLObject)UNPROVIDED);
                    module0642.f39050();
                }
                finally {
                    module0015.$g533$.rebind(var3_330, var42);
                }
                module0642.f39020(module0015.$g134$.getGlobalValue());
                module0642.f39029((SubLObject)UNPROVIDED);
            }
            finally {
                module0015.$g535$.rebind(var3_329, var42);
            }
            module0642.f39020(module0015.$g156$.getGlobalValue());
            module0642.f39029((SubLObject)UNPROVIDED);
        }
        finally {
            module0015.$g538$.rebind(var45, var42);
        }
        return (SubLObject)NIL;
    }

    public static SubLObject f40790(final SubLObject var52) {
        final SubLThread var53 = SubLProcess.currentSubLThread();
        SubLObject var54 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var52, var52, (SubLObject)$ic291$);
        var54 = var52.first();
        SubLObject var55 = var52.rest();
        final SubLObject var56 = (SubLObject)(var55.isCons() ? var55.first() : NIL);
        cdestructuring_bind.destructuring_bind_must_listp(var55, var52, (SubLObject)$ic291$);
        var55 = var55.rest();
        if (NIL == var55) {
            final SubLObject var57 = module0656.f39969(var54);
            SubLObject var58 = (SubLObject)NIL;
            if (NIL == module0656.f39930(var57)) {
                return module0656.f39789((SubLObject)$ic88$, var54, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
            }
            if (NIL != var56) {
                var58 = module0656.f39959(var56);
                if (NIL == module0161.f10481(var58)) {
                    return module0656.f39789((SubLObject)$ic99$, var56, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                }
            }
            final SubLObject var60;
            final SubLObject var59 = var60 = PrintLow.format((SubLObject)NIL, (SubLObject)$ic290$, var57);
            final SubLObject var61 = module0015.$g538$.currentBinding(var53);
            try {
                module0015.$g538$.bind((NIL != module0057.f4158(module0015.$g538$.getDynamicValue(var53))) ? module0015.$g538$.getDynamicValue(var53) : module0057.f4173((SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED), var53);
                module0642.f39020((SubLObject)$ic0$);
                module0642.f39029((SubLObject)UNPROVIDED);
                module0642.f39020(module0015.$g155$.getGlobalValue());
                module0642.f39020(module0015.$g153$.getGlobalValue());
                module0015.f718();
                module0655.f39766();
                module0642.f39064(module0655.$g5143$.getDynamicValue(var53), module0655.$g5142$.getDynamicValue(var53));
                final SubLObject var62 = module0014.f672((SubLObject)$ic1$);
                module0642.f39029((SubLObject)UNPROVIDED);
                module0642.f39020(module0015.$g175$.getGlobalValue());
                module0642.f39020(module0015.$g176$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                module0642.f39020((SubLObject)$ic2$);
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                if (NIL != var62) {
                    module0642.f39020(module0015.$g178$.getGlobalValue());
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                    module0642.f39020(var62);
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                }
                module0642.f39020(module0015.$g177$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                module0642.f39020((SubLObject)$ic3$);
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                if (NIL != var60) {
                    module0642.f39029((SubLObject)UNPROVIDED);
                    module0642.f39020(module0015.$g173$.getGlobalValue());
                    module0642.f39019(var60);
                    module0642.f39020(module0015.$g174$.getGlobalValue());
                }
                module0016.f941();
                module0642.f39020(module0015.$g154$.getGlobalValue());
                module0642.f39029((SubLObject)UNPROVIDED);
                final SubLObject var3_334 = module0015.$g535$.currentBinding(var53);
                try {
                    module0015.$g535$.bind((SubLObject)T, var53);
                    module0642.f39020(module0015.$g133$.getGlobalValue());
                    if (NIL != module0015.$g132$.getDynamicValue(var53)) {
                        module0642.f39020(module0015.$g135$.getGlobalValue());
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                        module0642.f39020(module0642.f39042(module0015.$g132$.getDynamicValue(var53)));
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                    }
                    module0642.f39020(module0015.$g137$.getGlobalValue());
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                    module0642.f39020((SubLObject)$ic150$);
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                    module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                    final SubLObject var3_335 = module0015.$g533$.currentBinding(var53);
                    try {
                        module0015.$g533$.bind((SubLObject)T, var53);
                        module0642.f39020(module0015.$g144$.getGlobalValue());
                        module0642.f39020(module0015.$g157$.getGlobalValue());
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                        module0642.f39020((SubLObject)$ic151$);
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                        final SubLObject var3_336 = module0015.$g533$.currentBinding(var53);
                        try {
                            module0015.$g533$.bind((SubLObject)T, var53);
                            module0642.f39020(module0015.$g295$.getGlobalValue());
                            module0642.f39020(module0015.$g305$.getGlobalValue());
                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                            module0642.f39020((SubLObject)$ic152$);
                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                            module0642.f39020(module0015.$g302$.getGlobalValue());
                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                            module0642.f39020((SubLObject)$ic153$);
                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                            module0642.f39020(module0015.$g307$.getGlobalValue());
                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                            module0642.f39019((SubLObject)$ic154$);
                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                            module0642.f39020(module0015.$g160$.getGlobalValue());
                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                            module0642.f39020((SubLObject)$ic155$);
                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                        }
                        finally {
                            module0015.$g533$.rebind(var3_336, var53);
                        }
                        module0642.f39020(module0015.$g145$.getGlobalValue());
                        f40722(var57);
                        module0642.f39026((SubLObject)TWO_INTEGER);
                        f40743(var57, var58);
                        module0642.f39029((SubLObject)UNPROVIDED);
                        module0642.f39050();
                    }
                    finally {
                        module0015.$g533$.rebind(var3_335, var53);
                    }
                    module0642.f39020(module0015.$g134$.getGlobalValue());
                    module0642.f39029((SubLObject)UNPROVIDED);
                }
                finally {
                    module0015.$g535$.rebind(var3_334, var53);
                }
                module0642.f39020(module0015.$g156$.getGlobalValue());
                module0642.f39029((SubLObject)UNPROVIDED);
            }
            finally {
                module0015.$g538$.rebind(var61, var53);
            }
        }
        else {
            cdestructuring_bind.cdestructuring_bind_error(var52, (SubLObject)$ic291$);
        }
        return (SubLObject)NIL;
    }

    public static SubLObject f40791(final SubLObject var1, final SubLObject var29, SubLObject var37) {
        if (var37 == UNPROVIDED) {
            var37 = (SubLObject)NIL;
        }
        final SubLThread var38 = SubLProcess.currentSubLThread();
        final SubLObject var39 = module0656.f39832((SubLObject)$ic48$);
        module0642.f39020(module0015.$g381$.getGlobalValue());
        module0642.f39020(module0015.$g383$.getGlobalValue());
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        module0655.f39768();
        PrintLow.format(module0015.$g131$.getDynamicValue(var38), (SubLObject)$ic293$, module0656.f39931(var1));
        if (NIL != var37) {
            PrintLow.format(module0015.$g131$.getDynamicValue(var38), (SubLObject)$ic244$, module0656.f39934(var37));
        }
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        if (NIL != var39) {
            module0642.f39020(module0015.$g387$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
            module0642.f39020(var39);
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        }
        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
        final SubLObject var40 = module0015.$g533$.currentBinding(var38);
        try {
            module0015.$g533$.bind((SubLObject)T, var38);
            if (NIL != var37) {
                module0656.f39964(var37);
            }
            else {
                module0642.f39019((SubLObject)$ic294$);
            }
        }
        finally {
            module0015.$g533$.rebind(var40, var38);
        }
        module0642.f39020(module0015.$g382$.getGlobalValue());
        if (var29.numG((SubLObject)ONE_INTEGER)) {
            PrintLow.format(module0015.$g131$.getDynamicValue(var38), (SubLObject)$ic219$, var29);
        }
        return var1;
    }

    public static SubLObject f40743(final SubLObject var1, final SubLObject var37) {
        final SubLThread var38 = SubLProcess.currentSubLThread();
        final SubLObject var39 = module0656.$g5172$.currentBinding(var38);
        try {
            module0656.$g5172$.bind(module0661.f40305(), var38);
            module0642.f39020(module0015.$g234$.getGlobalValue());
            module0642.f39020(module0015.$g207$.getGlobalValue());
            f40783(var1);
            module0642.f39019((SubLObject)$ic296$);
            module0642.f39020(module0015.$g208$.getGlobalValue());
            module0642.f39020(module0015.$g235$.getGlobalValue());
            module0642.f39026((SubLObject)UNPROVIDED);
            final SubLObject var3_337 = module0580.$g4361$.currentBinding(var38);
            try {
                module0580.$g4361$.bind((SubLObject)NIL, var38);
                var38.resetMultipleValues();
                final SubLObject var3_338 = module0580.$g4362$.currentBinding(var38);
                try {
                    module0580.$g4362$.bind(module0580.f35560(), var38);
                    final SubLObject var40 = var38.secondMultipleValue();
                    var38.resetMultipleValues();
                    try {
                        var38.resetMultipleValues();
                        final SubLObject var3_339 = module0580.$g4358$.currentBinding(var38);
                        try {
                            module0580.$g4358$.bind(module0580.f35544(), var38);
                            final SubLObject var41 = var38.secondMultipleValue();
                            var38.resetMultipleValues();
                            final SubLObject var3_340 = module0580.$g4359$.currentBinding(var38);
                            try {
                                module0580.$g4359$.bind(module0580.f35545(), var38);
                                final SubLObject var42 = module0580.$g4358$.getDynamicValue(var38);
                                final SubLObject var3_341 = module0034.$g879$.currentBinding(var38);
                                try {
                                    module0034.$g879$.bind(var42, var38);
                                    SubLObject var43 = (SubLObject)NIL;
                                    if (NIL != var42 && NIL == module0034.f1842(var42)) {
                                        var43 = module0034.f1869(var42);
                                        final SubLObject var44 = Threads.current_process();
                                        if (NIL == var43) {
                                            module0034.f1873(var42, var44);
                                        }
                                        else if (!var43.eql(var44)) {
                                            Errors.error((SubLObject)$ic156$);
                                        }
                                    }
                                    try {
                                        final SubLObject var3_342 = module0579.$g4260$.currentBinding(var38);
                                        final SubLObject var45 = module0579.$g4259$.currentBinding(var38);
                                        try {
                                            module0579.$g4260$.bind(module0677.f41312(), var38);
                                            module0579.$g4259$.bind((SubLObject)$ic157$, var38);
                                            if (NIL != var37) {
                                                f40792(var1, var37);
                                            }
                                            else {
                                                f40793(var1);
                                            }
                                        }
                                        finally {
                                            module0579.$g4259$.rebind(var45, var38);
                                            module0579.$g4260$.rebind(var3_342, var38);
                                        }
                                    }
                                    finally {
                                        final SubLObject var3_343 = Threads.$is_thread_performing_cleanupP$.currentBinding(var38);
                                        try {
                                            Threads.$is_thread_performing_cleanupP$.bind((SubLObject)T, var38);
                                            if (NIL != var42 && NIL == var43) {
                                                module0034.f1873(var42, (SubLObject)NIL);
                                            }
                                        }
                                        finally {
                                            Threads.$is_thread_performing_cleanupP$.rebind(var3_343, var38);
                                        }
                                    }
                                }
                                finally {
                                    module0034.$g879$.rebind(var3_341, var38);
                                }
                            }
                            finally {
                                module0580.$g4359$.rebind(var3_340, var38);
                            }
                            if (var41 == $ic159$ && NIL != module0034.f1839(module0580.$g4358$.getDynamicValue(var38))) {
                                module0034.f1891(module0580.$g4358$.getDynamicValue(var38));
                            }
                        }
                        finally {
                            module0580.$g4358$.rebind(var3_339, var38);
                        }
                    }
                    finally {
                        final SubLObject var3_344 = Threads.$is_thread_performing_cleanupP$.currentBinding(var38);
                        try {
                            Threads.$is_thread_performing_cleanupP$.bind((SubLObject)T, var38);
                            if (NIL == var40) {
                                module0580.f35554(module0580.$g4362$.getDynamicValue(var38));
                            }
                        }
                        finally {
                            Threads.$is_thread_performing_cleanupP$.rebind(var3_344, var38);
                        }
                    }
                }
                finally {
                    module0580.$g4362$.rebind(var3_338, var38);
                }
            }
            finally {
                module0580.$g4361$.rebind(var3_337, var38);
            }
        }
        finally {
            module0656.$g5172$.rebind(var39, var38);
        }
        return (SubLObject)NIL;
    }

    public static SubLObject f40793(final SubLObject var1) {
        SubLObject var3;
        final SubLObject var2 = var3 = f40645(var1);
        SubLObject var4 = (SubLObject)NIL;
        var4 = var3.first();
        while (NIL != var3) {
            f40792(var1, var4);
            var3 = var3.rest();
            var4 = var3.first();
        }
        return (SubLObject)NIL;
    }

    public static SubLObject f40792(final SubLObject var1, final SubLObject var37) {
        final SubLThread var38 = SubLProcess.currentSubLThread();
        f40763(var37, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        final SubLObject var39 = (NIL != f40692(var1)) ? Symbols.symbol_function((SubLObject)$ic258$) : Symbols.symbol_function((SubLObject)$ic260$);
        final SubLObject var40 = module0655.$g5129$.currentBinding(var38);
        final SubLObject var41 = module0655.$g5130$.currentBinding(var38);
        try {
            module0655.$g5129$.bind((SubLObject)NIL, var38);
            module0655.$g5130$.bind((SubLObject)NIL, var38);
            module0219.f14478(var39, var1, (SubLObject)NIL, var37);
        }
        finally {
            module0655.$g5130$.rebind(var41, var38);
            module0655.$g5129$.rebind(var40, var38);
        }
        return (SubLObject)NIL;
    }

    public static SubLObject f40794(final SubLObject var52) {
        final SubLThread var53 = SubLProcess.currentSubLThread();
        SubLObject var54 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var52, var52, (SubLObject)$ic87$);
        var54 = var52.first();
        final SubLObject var55 = var52.rest();
        if (NIL == var55) {
            final SubLObject var56 = module0656.f39969(var54);
            if (NIL == module0656.f39930(var56)) {
                return module0656.f39789((SubLObject)$ic88$, var54, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
            }
            final SubLObject var58;
            final SubLObject var57 = var58 = PrintLow.format((SubLObject)NIL, (SubLObject)$ic297$, var56);
            final SubLObject var59 = module0015.$g538$.currentBinding(var53);
            try {
                module0015.$g538$.bind((NIL != module0057.f4158(module0015.$g538$.getDynamicValue(var53))) ? module0015.$g538$.getDynamicValue(var53) : module0057.f4173((SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED), var53);
                module0642.f39020((SubLObject)$ic0$);
                module0642.f39029((SubLObject)UNPROVIDED);
                module0642.f39020(module0015.$g155$.getGlobalValue());
                module0642.f39020(module0015.$g153$.getGlobalValue());
                module0015.f718();
                module0655.f39766();
                module0642.f39064(module0655.$g5143$.getDynamicValue(var53), module0655.$g5142$.getDynamicValue(var53));
                final SubLObject var60 = module0014.f672((SubLObject)$ic1$);
                module0642.f39029((SubLObject)UNPROVIDED);
                module0642.f39020(module0015.$g175$.getGlobalValue());
                module0642.f39020(module0015.$g176$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                module0642.f39020((SubLObject)$ic2$);
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                if (NIL != var60) {
                    module0642.f39020(module0015.$g178$.getGlobalValue());
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                    module0642.f39020(var60);
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                }
                module0642.f39020(module0015.$g177$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                module0642.f39020((SubLObject)$ic3$);
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                if (NIL != var58) {
                    module0642.f39029((SubLObject)UNPROVIDED);
                    module0642.f39020(module0015.$g173$.getGlobalValue());
                    module0642.f39019(var58);
                    module0642.f39020(module0015.$g174$.getGlobalValue());
                }
                module0016.f941();
                module0642.f39020(module0015.$g154$.getGlobalValue());
                module0642.f39029((SubLObject)UNPROVIDED);
                final SubLObject var3_347 = module0015.$g535$.currentBinding(var53);
                try {
                    module0015.$g535$.bind((SubLObject)T, var53);
                    module0642.f39020(module0015.$g133$.getGlobalValue());
                    if (NIL != module0015.$g132$.getDynamicValue(var53)) {
                        module0642.f39020(module0015.$g135$.getGlobalValue());
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                        module0642.f39020(module0642.f39042(module0015.$g132$.getDynamicValue(var53)));
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                    }
                    module0642.f39020(module0015.$g137$.getGlobalValue());
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                    module0642.f39020((SubLObject)$ic150$);
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                    module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                    final SubLObject var3_348 = module0015.$g533$.currentBinding(var53);
                    try {
                        module0015.$g533$.bind((SubLObject)T, var53);
                        module0642.f39020(module0015.$g144$.getGlobalValue());
                        module0642.f39020(module0015.$g157$.getGlobalValue());
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                        module0642.f39020((SubLObject)$ic151$);
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                        final SubLObject var3_349 = module0015.$g533$.currentBinding(var53);
                        try {
                            module0015.$g533$.bind((SubLObject)T, var53);
                            module0642.f39020(module0015.$g295$.getGlobalValue());
                            module0642.f39020(module0015.$g305$.getGlobalValue());
                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                            module0642.f39020((SubLObject)$ic152$);
                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                            module0642.f39020(module0015.$g302$.getGlobalValue());
                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                            module0642.f39020((SubLObject)$ic153$);
                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                            module0642.f39020(module0015.$g307$.getGlobalValue());
                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                            module0642.f39019((SubLObject)$ic154$);
                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                            module0642.f39020(module0015.$g160$.getGlobalValue());
                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                            module0642.f39020((SubLObject)$ic155$);
                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                        }
                        finally {
                            module0015.$g533$.rebind(var3_349, var53);
                        }
                        module0642.f39020(module0015.$g145$.getGlobalValue());
                        f40722(var56);
                        module0642.f39026((SubLObject)TWO_INTEGER);
                        f40744(var56);
                        module0642.f39029((SubLObject)UNPROVIDED);
                        module0642.f39050();
                    }
                    finally {
                        module0015.$g533$.rebind(var3_348, var53);
                    }
                    module0642.f39020(module0015.$g134$.getGlobalValue());
                    module0642.f39029((SubLObject)UNPROVIDED);
                }
                finally {
                    module0015.$g535$.rebind(var3_347, var53);
                }
                module0642.f39020(module0015.$g156$.getGlobalValue());
                module0642.f39029((SubLObject)UNPROVIDED);
            }
            finally {
                module0015.$g538$.rebind(var59, var53);
            }
        }
        else {
            cdestructuring_bind.cdestructuring_bind_error(var52, (SubLObject)$ic87$);
        }
        return (SubLObject)NIL;
    }

    public static SubLObject f40795(final SubLObject var1, final SubLObject var29) {
        final SubLThread var30 = SubLProcess.currentSubLThread();
        final SubLObject var31 = module0656.f39832((SubLObject)$ic48$);
        module0642.f39020(module0015.$g381$.getGlobalValue());
        module0642.f39020(module0015.$g383$.getGlobalValue());
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        module0655.f39768();
        PrintLow.format(module0015.$g131$.getDynamicValue(var30), (SubLObject)$ic299$, module0656.f39931(var1));
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        if (NIL != var31) {
            module0642.f39020(module0015.$g387$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
            module0642.f39020(var31);
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        }
        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
        final SubLObject var32 = module0015.$g533$.currentBinding(var30);
        try {
            module0015.$g533$.bind((SubLObject)T, var30);
            module0642.f39019((SubLObject)$ic300$);
        }
        finally {
            module0015.$g533$.rebind(var32, var30);
        }
        module0642.f39020(module0015.$g382$.getGlobalValue());
        if (var29.numG((SubLObject)ONE_INTEGER)) {
            PrintLow.format(module0015.$g131$.getDynamicValue(var30), (SubLObject)$ic219$, var29);
        }
        return var1;
    }

    public static SubLObject f40744(final SubLObject var1) {
        final SubLThread var2 = SubLProcess.currentSubLThread();
        final SubLObject var3 = module0656.$g5172$.currentBinding(var2);
        try {
            module0656.$g5172$.bind(module0661.f40305(), var2);
            module0642.f39020(module0015.$g234$.getGlobalValue());
            module0642.f39020(module0015.$g207$.getGlobalValue());
            f40783(var1);
            module0642.f39019((SubLObject)$ic296$);
            module0642.f39020(module0015.$g208$.getGlobalValue());
            module0642.f39020(module0015.$g235$.getGlobalValue());
            module0642.f39026((SubLObject)TWO_INTEGER);
            final SubLObject var3_350 = module0580.$g4361$.currentBinding(var2);
            try {
                module0580.$g4361$.bind((SubLObject)NIL, var2);
                var2.resetMultipleValues();
                final SubLObject var3_351 = module0580.$g4362$.currentBinding(var2);
                try {
                    module0580.$g4362$.bind(module0580.f35560(), var2);
                    final SubLObject var4 = var2.secondMultipleValue();
                    var2.resetMultipleValues();
                    try {
                        var2.resetMultipleValues();
                        final SubLObject var3_352 = module0580.$g4358$.currentBinding(var2);
                        try {
                            module0580.$g4358$.bind(module0580.f35544(), var2);
                            final SubLObject var5 = var2.secondMultipleValue();
                            var2.resetMultipleValues();
                            final SubLObject var3_353 = module0580.$g4359$.currentBinding(var2);
                            try {
                                module0580.$g4359$.bind(module0580.f35545(), var2);
                                final SubLObject var6 = module0580.$g4358$.getDynamicValue(var2);
                                final SubLObject var3_354 = module0034.$g879$.currentBinding(var2);
                                try {
                                    module0034.$g879$.bind(var6, var2);
                                    SubLObject var7 = (SubLObject)NIL;
                                    if (NIL != var6 && NIL == module0034.f1842(var6)) {
                                        var7 = module0034.f1869(var6);
                                        final SubLObject var8 = Threads.current_process();
                                        if (NIL == var7) {
                                            module0034.f1873(var6, var8);
                                        }
                                        else if (!var7.eql(var8)) {
                                            Errors.error((SubLObject)$ic156$);
                                        }
                                    }
                                    try {
                                        final SubLObject var3_355 = module0579.$g4260$.currentBinding(var2);
                                        final SubLObject var9 = module0579.$g4259$.currentBinding(var2);
                                        try {
                                            module0579.$g4260$.bind(module0677.f41312(), var2);
                                            module0579.$g4259$.bind((SubLObject)$ic157$, var2);
                                            f40796(var1);
                                        }
                                        finally {
                                            module0579.$g4259$.rebind(var9, var2);
                                            module0579.$g4260$.rebind(var3_355, var2);
                                        }
                                    }
                                    finally {
                                        final SubLObject var3_356 = Threads.$is_thread_performing_cleanupP$.currentBinding(var2);
                                        try {
                                            Threads.$is_thread_performing_cleanupP$.bind((SubLObject)T, var2);
                                            if (NIL != var6 && NIL == var7) {
                                                module0034.f1873(var6, (SubLObject)NIL);
                                            }
                                        }
                                        finally {
                                            Threads.$is_thread_performing_cleanupP$.rebind(var3_356, var2);
                                        }
                                    }
                                }
                                finally {
                                    module0034.$g879$.rebind(var3_354, var2);
                                }
                            }
                            finally {
                                module0580.$g4359$.rebind(var3_353, var2);
                            }
                            if (var5 == $ic159$ && NIL != module0034.f1839(module0580.$g4358$.getDynamicValue(var2))) {
                                module0034.f1891(module0580.$g4358$.getDynamicValue(var2));
                            }
                        }
                        finally {
                            module0580.$g4358$.rebind(var3_352, var2);
                        }
                    }
                    finally {
                        final SubLObject var3_357 = Threads.$is_thread_performing_cleanupP$.currentBinding(var2);
                        try {
                            Threads.$is_thread_performing_cleanupP$.bind((SubLObject)T, var2);
                            if (NIL == var4) {
                                module0580.f35554(module0580.$g4362$.getDynamicValue(var2));
                            }
                        }
                        finally {
                            Threads.$is_thread_performing_cleanupP$.rebind(var3_357, var2);
                        }
                    }
                }
                finally {
                    module0580.$g4362$.rebind(var3_351, var2);
                }
            }
            finally {
                module0580.$g4361$.rebind(var3_350, var2);
            }
        }
        finally {
            module0656.$g5172$.rebind(var3, var2);
        }
        return (SubLObject)NIL;
    }

    public static SubLObject f40796(final SubLObject var1) {
        module0219.f14480(Symbols.symbol_function((SubLObject)$ic269$), var1);
        return (SubLObject)NIL;
    }

    public static SubLObject f40797(final SubLObject var52) {
        final SubLThread var53 = SubLProcess.currentSubLThread();
        SubLObject var54 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var52, var52, (SubLObject)$ic302$);
        var54 = var52.first();
        SubLObject var55 = var52.rest();
        final SubLObject var56 = (SubLObject)(var55.isCons() ? var55.first() : NIL);
        cdestructuring_bind.destructuring_bind_must_listp(var55, var52, (SubLObject)$ic302$);
        var55 = var55.rest();
        final SubLObject var57 = (SubLObject)(var55.isCons() ? var55.first() : NIL);
        cdestructuring_bind.destructuring_bind_must_listp(var55, var52, (SubLObject)$ic302$);
        var55 = var55.rest();
        final SubLObject var58 = (SubLObject)(var55.isCons() ? var55.first() : NIL);
        cdestructuring_bind.destructuring_bind_must_listp(var55, var52, (SubLObject)$ic302$);
        var55 = var55.rest();
        if (NIL == var55) {
            final SubLObject var59 = module0656.f39969(var54);
            SubLObject var60 = (SubLObject)NIL;
            SubLObject var61 = (SubLObject)NIL;
            SubLObject var62 = (SubLObject)NIL;
            if (NIL == module0656.f39930(var59)) {
                return module0656.f39789((SubLObject)$ic88$, var54, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
            }
            if (NIL != var56) {
                var60 = reader.read_from_string_ignoring_errors(var56, (SubLObject)NIL, (SubLObject)NIL, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                if (NIL == module0130.f8516(var60)) {
                    return module0656.f39789((SubLObject)$ic303$, var56, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                }
                if (NIL != var57) {
                    var61 = module0656.f39959(var57);
                    if (NIL == module0161.f10481(var61)) {
                        return module0656.f39789((SubLObject)$ic99$, var57, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                    }
                    if (NIL != var58) {
                        var62 = reader.read_from_string_ignoring_errors(var58, (SubLObject)NIL, (SubLObject)NIL, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                        if (NIL == module0130.f8503(var62)) {
                            return module0656.f39789((SubLObject)$ic304$, var58, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                        }
                    }
                }
            }
            final SubLObject var64;
            final SubLObject var63 = var64 = PrintLow.format((SubLObject)NIL, (SubLObject)$ic305$, var59);
            final SubLObject var65 = module0015.$g538$.currentBinding(var53);
            try {
                module0015.$g538$.bind((NIL != module0057.f4158(module0015.$g538$.getDynamicValue(var53))) ? module0015.$g538$.getDynamicValue(var53) : module0057.f4173((SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED), var53);
                module0642.f39020((SubLObject)$ic0$);
                module0642.f39029((SubLObject)UNPROVIDED);
                module0642.f39020(module0015.$g155$.getGlobalValue());
                module0642.f39020(module0015.$g153$.getGlobalValue());
                module0015.f718();
                module0655.f39766();
                module0642.f39064(module0655.$g5143$.getDynamicValue(var53), module0655.$g5142$.getDynamicValue(var53));
                final SubLObject var66 = module0014.f672((SubLObject)$ic1$);
                module0642.f39029((SubLObject)UNPROVIDED);
                module0642.f39020(module0015.$g175$.getGlobalValue());
                module0642.f39020(module0015.$g176$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                module0642.f39020((SubLObject)$ic2$);
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                if (NIL != var66) {
                    module0642.f39020(module0015.$g178$.getGlobalValue());
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                    module0642.f39020(var66);
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                }
                module0642.f39020(module0015.$g177$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                module0642.f39020((SubLObject)$ic3$);
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                if (NIL != var64) {
                    module0642.f39029((SubLObject)UNPROVIDED);
                    module0642.f39020(module0015.$g173$.getGlobalValue());
                    module0642.f39019(var64);
                    module0642.f39020(module0015.$g174$.getGlobalValue());
                }
                module0016.f941();
                module0642.f39020(module0015.$g154$.getGlobalValue());
                module0642.f39029((SubLObject)UNPROVIDED);
                final SubLObject var3_362 = module0015.$g535$.currentBinding(var53);
                try {
                    module0015.$g535$.bind((SubLObject)T, var53);
                    module0642.f39020(module0015.$g133$.getGlobalValue());
                    if (NIL != module0015.$g132$.getDynamicValue(var53)) {
                        module0642.f39020(module0015.$g135$.getGlobalValue());
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                        module0642.f39020(module0642.f39042(module0015.$g132$.getDynamicValue(var53)));
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                    }
                    module0642.f39020(module0015.$g137$.getGlobalValue());
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                    module0642.f39020((SubLObject)$ic150$);
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                    module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                    final SubLObject var3_363 = module0015.$g533$.currentBinding(var53);
                    try {
                        module0015.$g533$.bind((SubLObject)T, var53);
                        module0642.f39020(module0015.$g144$.getGlobalValue());
                        module0642.f39020(module0015.$g157$.getGlobalValue());
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                        module0642.f39020((SubLObject)$ic151$);
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                        final SubLObject var3_364 = module0015.$g533$.currentBinding(var53);
                        try {
                            module0015.$g533$.bind((SubLObject)T, var53);
                            module0642.f39020(module0015.$g295$.getGlobalValue());
                            module0642.f39020(module0015.$g305$.getGlobalValue());
                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                            module0642.f39020((SubLObject)$ic152$);
                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                            module0642.f39020(module0015.$g302$.getGlobalValue());
                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                            module0642.f39020((SubLObject)$ic153$);
                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                            module0642.f39020(module0015.$g307$.getGlobalValue());
                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                            module0642.f39019((SubLObject)$ic154$);
                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                            module0642.f39020(module0015.$g160$.getGlobalValue());
                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                            module0642.f39020((SubLObject)$ic155$);
                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                        }
                        finally {
                            module0015.$g533$.rebind(var3_364, var53);
                        }
                        module0642.f39020(module0015.$g145$.getGlobalValue());
                        f40722(var59);
                        module0642.f39026((SubLObject)TWO_INTEGER);
                        f40745(var59, var60, var61, var62);
                        module0642.f39029((SubLObject)UNPROVIDED);
                        module0642.f39050();
                    }
                    finally {
                        module0015.$g533$.rebind(var3_363, var53);
                    }
                    module0642.f39020(module0015.$g134$.getGlobalValue());
                    module0642.f39029((SubLObject)UNPROVIDED);
                }
                finally {
                    module0015.$g535$.rebind(var3_362, var53);
                }
                module0642.f39020(module0015.$g156$.getGlobalValue());
                module0642.f39029((SubLObject)UNPROVIDED);
            }
            finally {
                module0015.$g538$.rebind(var65, var53);
            }
        }
        else {
            cdestructuring_bind.cdestructuring_bind_error(var52, (SubLObject)$ic302$);
        }
        return (SubLObject)NIL;
    }

    public static SubLObject f40798(final SubLObject var1, final SubLObject var29, SubLObject var44, SubLObject var37, SubLObject var46) {
        if (var44 == UNPROVIDED) {
            var44 = (SubLObject)NIL;
        }
        if (var37 == UNPROVIDED) {
            var37 = (SubLObject)NIL;
        }
        if (var46 == UNPROVIDED) {
            var46 = (SubLObject)NIL;
        }
        final SubLThread var47 = SubLProcess.currentSubLThread();
        final SubLObject var48 = module0656.f39832((SubLObject)$ic48$);
        module0642.f39020(module0015.$g381$.getGlobalValue());
        module0642.f39020(module0015.$g383$.getGlobalValue());
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        module0655.f39768();
        PrintLow.format(module0015.$g131$.getDynamicValue(var47), (SubLObject)$ic307$, module0656.f39931(var1));
        if (NIL != var44) {
            PrintLow.format(module0015.$g131$.getDynamicValue(var47), (SubLObject)$ic308$, var44);
            if (NIL != var37) {
                PrintLow.format(module0015.$g131$.getDynamicValue(var47), (SubLObject)$ic244$, module0656.f39934(var37));
                if (NIL != var46) {
                    PrintLow.format(module0015.$g131$.getDynamicValue(var47), (SubLObject)$ic308$, var46);
                }
            }
        }
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        if (NIL != var48) {
            module0642.f39020(module0015.$g387$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
            module0642.f39020(var48);
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        }
        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
        final SubLObject var49 = module0015.$g533$.currentBinding(var47);
        try {
            module0015.$g533$.bind((SubLObject)T, var47);
            if (NIL != var46) {
                module0656.f39797(var46);
            }
            else if (NIL != var37) {
                module0656.f39964(var37);
            }
            else if (NIL != var44) {
                final SubLObject var50 = var44;
                if (var50.eql((SubLObject)$ic60$)) {
                    module0642.f39019((SubLObject)$ic309$);
                }
                else if (var50.eql((SubLObject)$ic61$)) {
                    module0642.f39019((SubLObject)$ic310$);
                }
                else {
                    module0642.f39019(var44);
                }
            }
            else {
                PrintLow.format(module0015.$g131$.getDynamicValue(var47), (SubLObject)$ic311$);
            }
        }
        finally {
            module0015.$g533$.rebind(var49, var47);
        }
        module0642.f39020(module0015.$g382$.getGlobalValue());
        if (var29.numG((SubLObject)ONE_INTEGER)) {
            PrintLow.format(module0015.$g131$.getDynamicValue(var47), (SubLObject)$ic219$, var29);
        }
        return var1;
    }

    public static SubLObject f40745(final SubLObject var1, final SubLObject var44, final SubLObject var37, final SubLObject var46) {
        final SubLThread var47 = SubLProcess.currentSubLThread();
        final SubLObject var48 = module0580.$g4361$.currentBinding(var47);
        try {
            module0580.$g4361$.bind((SubLObject)NIL, var47);
            var47.resetMultipleValues();
            final SubLObject var3_365 = module0580.$g4362$.currentBinding(var47);
            try {
                module0580.$g4362$.bind(module0580.f35560(), var47);
                final SubLObject var49 = var47.secondMultipleValue();
                var47.resetMultipleValues();
                try {
                    var47.resetMultipleValues();
                    final SubLObject var3_366 = module0580.$g4358$.currentBinding(var47);
                    try {
                        module0580.$g4358$.bind(module0580.f35544(), var47);
                        final SubLObject var50 = var47.secondMultipleValue();
                        var47.resetMultipleValues();
                        final SubLObject var3_367 = module0580.$g4359$.currentBinding(var47);
                        try {
                            module0580.$g4359$.bind(module0580.f35545(), var47);
                            final SubLObject var51 = module0580.$g4358$.getDynamicValue(var47);
                            final SubLObject var3_368 = module0034.$g879$.currentBinding(var47);
                            try {
                                module0034.$g879$.bind(var51, var47);
                                SubLObject var52 = (SubLObject)NIL;
                                if (NIL != var51 && NIL == module0034.f1842(var51)) {
                                    var52 = module0034.f1869(var51);
                                    final SubLObject var53 = Threads.current_process();
                                    if (NIL == var52) {
                                        module0034.f1873(var51, var53);
                                    }
                                    else if (!var52.eql(var53)) {
                                        Errors.error((SubLObject)$ic156$);
                                    }
                                }
                                try {
                                    final SubLObject var3_369 = module0579.$g4260$.currentBinding(var47);
                                    final SubLObject var54 = module0579.$g4259$.currentBinding(var47);
                                    final SubLObject var55 = module0579.$g4238$.currentBinding(var47);
                                    final SubLObject var56 = module0656.$g5172$.currentBinding(var47);
                                    try {
                                        module0579.$g4260$.bind(module0677.f41312(), var47);
                                        module0579.$g4259$.bind((SubLObject)$ic157$, var47);
                                        module0579.$g4238$.bind((SubLObject)T, var47);
                                        module0656.$g5172$.bind(module0661.f40305(), var47);
                                        if (NIL == var44) {
                                            f40799(var1);
                                        }
                                        else if (NIL == var37) {
                                            f40800(var1, var44);
                                        }
                                        else {
                                            f40801(var44, (SubLObject)UNPROVIDED);
                                            if (NIL == var46) {
                                                f40802(var1, var44, var37);
                                            }
                                            else {
                                                f40763(var37, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                                                f40803(var1, var44, var37, var46);
                                            }
                                        }
                                    }
                                    finally {
                                        module0656.$g5172$.rebind(var56, var47);
                                        module0579.$g4238$.rebind(var55, var47);
                                        module0579.$g4259$.rebind(var54, var47);
                                        module0579.$g4260$.rebind(var3_369, var47);
                                    }
                                }
                                finally {
                                    final SubLObject var3_370 = Threads.$is_thread_performing_cleanupP$.currentBinding(var47);
                                    try {
                                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)T, var47);
                                        if (NIL != var51 && NIL == var52) {
                                            module0034.f1873(var51, (SubLObject)NIL);
                                        }
                                    }
                                    finally {
                                        Threads.$is_thread_performing_cleanupP$.rebind(var3_370, var47);
                                    }
                                }
                            }
                            finally {
                                module0034.$g879$.rebind(var3_368, var47);
                            }
                        }
                        finally {
                            module0580.$g4359$.rebind(var3_367, var47);
                        }
                        if (var50 == $ic159$ && NIL != module0034.f1839(module0580.$g4358$.getDynamicValue(var47))) {
                            module0034.f1891(module0580.$g4358$.getDynamicValue(var47));
                        }
                    }
                    finally {
                        module0580.$g4358$.rebind(var3_366, var47);
                    }
                }
                finally {
                    final SubLObject var3_371 = Threads.$is_thread_performing_cleanupP$.currentBinding(var47);
                    try {
                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)T, var47);
                        if (NIL == var49) {
                            module0580.f35554(module0580.$g4362$.getDynamicValue(var47));
                        }
                    }
                    finally {
                        Threads.$is_thread_performing_cleanupP$.rebind(var3_371, var47);
                    }
                }
            }
            finally {
                module0580.$g4362$.rebind(var3_365, var47);
            }
        }
        finally {
            module0580.$g4361$.rebind(var48, var47);
        }
        return (SubLObject)NIL;
    }

    public static SubLObject f40799(final SubLObject var1) {
        SubLObject var2 = (SubLObject)NIL;
        SubLObject var3 = (SubLObject)$ic313$;
        SubLObject var4 = (SubLObject)NIL;
        var4 = var3.first();
        while (NIL != var3) {
            if (f40648(var1, var4, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED).numG((SubLObject)ZERO_INTEGER)) {
                if (NIL != var2) {
                    module0642.f39051((SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                }
                f40800(var1, var4);
                var2 = (SubLObject)T;
            }
            var3 = var3.rest();
            var4 = var3.first();
        }
        return (SubLObject)NIL;
    }

    public static SubLObject f40800(final SubLObject var1, final SubLObject var44) {
        f40801(var44, (SubLObject)UNPROVIDED);
        SubLObject var46;
        final SubLObject var45 = var46 = f40650(var1, var44, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        SubLObject var47 = (SubLObject)NIL;
        var47 = var46.first();
        while (NIL != var46) {
            f40802(var1, var44, var47);
            var46 = var46.rest();
            var47 = var46.first();
        }
        return (SubLObject)NIL;
    }

    public static SubLObject f40802(final SubLObject var1, final SubLObject var44, final SubLObject var37) {
        f40763(var37, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        SubLObject var46;
        final SubLObject var45 = var46 = f40650(var1, var44, var37, (SubLObject)UNPROVIDED);
        SubLObject var47 = (SubLObject)NIL;
        var47 = var46.first();
        while (NIL != var46) {
            f40803(var1, var44, var37, var47);
            var46 = var46.rest();
            var47 = var46.first();
        }
        return (SubLObject)NIL;
    }

    public static SubLObject f40803(final SubLObject var1, final SubLObject var44, final SubLObject var37, final SubLObject var46) {
        final SubLThread var47 = SubLProcess.currentSubLThread();
        f40804(var46);
        final SubLObject var48 = (NIL != f40692(var1)) ? Symbols.symbol_function((SubLObject)$ic258$) : Symbols.symbol_function((SubLObject)$ic260$);
        final SubLObject var49 = module0655.$g5129$.currentBinding(var47);
        final SubLObject var50 = module0655.$g5130$.currentBinding(var47);
        try {
            module0655.$g5129$.bind((SubLObject)NIL, var47);
            module0655.$g5130$.bind((SubLObject)NIL, var47);
            module0219.f14481(var48, var1, var44, var46, var37);
        }
        finally {
            module0655.$g5130$.rebind(var50, var47);
            module0655.$g5129$.rebind(var49, var47);
        }
        return (SubLObject)NIL;
    }

    public static SubLObject f40805(final SubLObject var52) {
        final SubLThread var53 = SubLProcess.currentSubLThread();
        SubLObject var54 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var52, var52, (SubLObject)$ic314$);
        var54 = var52.first();
        SubLObject var55 = var52.rest();
        final SubLObject var56 = (SubLObject)(var55.isCons() ? var55.first() : NIL);
        cdestructuring_bind.destructuring_bind_must_listp(var55, var52, (SubLObject)$ic314$);
        var55 = var55.rest();
        final SubLObject var57 = (SubLObject)(var55.isCons() ? var55.first() : NIL);
        cdestructuring_bind.destructuring_bind_must_listp(var55, var52, (SubLObject)$ic314$);
        var55 = var55.rest();
        if (NIL == var55) {
            final SubLObject var58 = module0656.f39969(var54);
            SubLObject var59 = (SubLObject)NIL;
            SubLObject var60 = (SubLObject)NIL;
            if (NIL == module0656.f39930(var58)) {
                return module0656.f39789((SubLObject)$ic88$, var54, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
            }
            if (NIL != var56) {
                var59 = reader.read_from_string_ignoring_errors(var56, (SubLObject)NIL, (SubLObject)NIL, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                if (NIL == module0130.f8516(var59)) {
                    return module0656.f39789((SubLObject)$ic303$, var56, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                }
                if (NIL != var57) {
                    var60 = reader.read_from_string_ignoring_errors(var57, (SubLObject)NIL, (SubLObject)NIL, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                    if (NIL == module0130.f8503(var60)) {
                        return module0656.f39789((SubLObject)$ic304$, var57, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                    }
                }
            }
            final SubLObject var62;
            final SubLObject var61 = var62 = PrintLow.format((SubLObject)NIL, (SubLObject)$ic315$, var58);
            final SubLObject var63 = module0015.$g538$.currentBinding(var53);
            try {
                module0015.$g538$.bind((NIL != module0057.f4158(module0015.$g538$.getDynamicValue(var53))) ? module0015.$g538$.getDynamicValue(var53) : module0057.f4173((SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED), var53);
                module0642.f39020((SubLObject)$ic0$);
                module0642.f39029((SubLObject)UNPROVIDED);
                module0642.f39020(module0015.$g155$.getGlobalValue());
                module0642.f39020(module0015.$g153$.getGlobalValue());
                module0015.f718();
                module0655.f39766();
                module0642.f39064(module0655.$g5143$.getDynamicValue(var53), module0655.$g5142$.getDynamicValue(var53));
                final SubLObject var64 = module0014.f672((SubLObject)$ic1$);
                module0642.f39029((SubLObject)UNPROVIDED);
                module0642.f39020(module0015.$g175$.getGlobalValue());
                module0642.f39020(module0015.$g176$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                module0642.f39020((SubLObject)$ic2$);
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                if (NIL != var64) {
                    module0642.f39020(module0015.$g178$.getGlobalValue());
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                    module0642.f39020(var64);
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                }
                module0642.f39020(module0015.$g177$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                module0642.f39020((SubLObject)$ic3$);
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                if (NIL != var62) {
                    module0642.f39029((SubLObject)UNPROVIDED);
                    module0642.f39020(module0015.$g173$.getGlobalValue());
                    module0642.f39019(var62);
                    module0642.f39020(module0015.$g174$.getGlobalValue());
                }
                module0016.f941();
                module0642.f39020(module0015.$g154$.getGlobalValue());
                module0642.f39029((SubLObject)UNPROVIDED);
                final SubLObject var3_376 = module0015.$g535$.currentBinding(var53);
                try {
                    module0015.$g535$.bind((SubLObject)T, var53);
                    module0642.f39020(module0015.$g133$.getGlobalValue());
                    if (NIL != module0015.$g132$.getDynamicValue(var53)) {
                        module0642.f39020(module0015.$g135$.getGlobalValue());
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                        module0642.f39020(module0642.f39042(module0015.$g132$.getDynamicValue(var53)));
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                    }
                    module0642.f39020(module0015.$g137$.getGlobalValue());
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                    module0642.f39020((SubLObject)$ic150$);
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                    module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                    final SubLObject var3_377 = module0015.$g533$.currentBinding(var53);
                    try {
                        module0015.$g533$.bind((SubLObject)T, var53);
                        module0642.f39020(module0015.$g144$.getGlobalValue());
                        module0642.f39020(module0015.$g157$.getGlobalValue());
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                        module0642.f39020((SubLObject)$ic151$);
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                        final SubLObject var3_378 = module0015.$g533$.currentBinding(var53);
                        try {
                            module0015.$g533$.bind((SubLObject)T, var53);
                            module0642.f39020(module0015.$g295$.getGlobalValue());
                            module0642.f39020(module0015.$g305$.getGlobalValue());
                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                            module0642.f39020((SubLObject)$ic152$);
                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                            module0642.f39020(module0015.$g302$.getGlobalValue());
                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                            module0642.f39020((SubLObject)$ic153$);
                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                            module0642.f39020(module0015.$g307$.getGlobalValue());
                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                            module0642.f39019((SubLObject)$ic154$);
                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                            module0642.f39020(module0015.$g160$.getGlobalValue());
                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                            module0642.f39020((SubLObject)$ic155$);
                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                        }
                        finally {
                            module0015.$g533$.rebind(var3_378, var53);
                        }
                        module0642.f39020(module0015.$g145$.getGlobalValue());
                        f40722(var58);
                        module0642.f39026((SubLObject)TWO_INTEGER);
                        f40746(var58, var59, var60);
                        module0642.f39029((SubLObject)UNPROVIDED);
                        module0642.f39050();
                    }
                    finally {
                        module0015.$g533$.rebind(var3_377, var53);
                    }
                    module0642.f39020(module0015.$g134$.getGlobalValue());
                    module0642.f39029((SubLObject)UNPROVIDED);
                }
                finally {
                    module0015.$g535$.rebind(var3_376, var53);
                }
                module0642.f39020(module0015.$g156$.getGlobalValue());
                module0642.f39029((SubLObject)UNPROVIDED);
            }
            finally {
                module0015.$g538$.rebind(var63, var53);
            }
        }
        else {
            cdestructuring_bind.cdestructuring_bind_error(var52, (SubLObject)$ic314$);
        }
        return (SubLObject)NIL;
    }

    public static SubLObject f40806(final SubLObject var1, final SubLObject var29, SubLObject var44, SubLObject var46) {
        if (var44 == UNPROVIDED) {
            var44 = (SubLObject)NIL;
        }
        if (var46 == UNPROVIDED) {
            var46 = (SubLObject)NIL;
        }
        final SubLThread var47 = SubLProcess.currentSubLThread();
        final SubLObject var48 = module0656.f39832((SubLObject)$ic48$);
        module0642.f39020(module0015.$g381$.getGlobalValue());
        module0642.f39020(module0015.$g383$.getGlobalValue());
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        module0655.f39768();
        PrintLow.format(module0015.$g131$.getDynamicValue(var47), (SubLObject)$ic317$, module0656.f39931(var1));
        if (NIL != var44) {
            PrintLow.format(module0015.$g131$.getDynamicValue(var47), (SubLObject)$ic308$, var44);
            if (NIL != var46) {
                PrintLow.format(module0015.$g131$.getDynamicValue(var47), (SubLObject)$ic308$, var46);
            }
        }
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        if (NIL != var48) {
            module0642.f39020(module0015.$g387$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
            module0642.f39020(var48);
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        }
        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
        final SubLObject var49 = module0015.$g533$.currentBinding(var47);
        try {
            module0015.$g533$.bind((SubLObject)T, var47);
            if (NIL != var46) {
                module0656.f39797(var46);
            }
            else if (NIL != var44) {
                final SubLObject var50 = var44;
                if (var50.eql((SubLObject)$ic60$)) {
                    module0642.f39019((SubLObject)$ic309$);
                }
                else if (var50.eql((SubLObject)$ic61$)) {
                    module0642.f39019((SubLObject)$ic310$);
                }
                else {
                    module0642.f39019(var44);
                }
            }
            else {
                PrintLow.format(module0015.$g131$.getDynamicValue(var47), (SubLObject)$ic318$);
            }
        }
        finally {
            module0015.$g533$.rebind(var49, var47);
        }
        module0642.f39020(module0015.$g382$.getGlobalValue());
        if (var29.numG((SubLObject)ONE_INTEGER)) {
            PrintLow.format(module0015.$g131$.getDynamicValue(var47), (SubLObject)$ic219$, var29);
        }
        return var1;
    }

    public static SubLObject f40746(final SubLObject var1, final SubLObject var44, final SubLObject var46) {
        final SubLThread var47 = SubLProcess.currentSubLThread();
        final SubLObject var48 = module0580.$g4361$.currentBinding(var47);
        try {
            module0580.$g4361$.bind((SubLObject)NIL, var47);
            var47.resetMultipleValues();
            final SubLObject var3_379 = module0580.$g4362$.currentBinding(var47);
            try {
                module0580.$g4362$.bind(module0580.f35560(), var47);
                final SubLObject var49 = var47.secondMultipleValue();
                var47.resetMultipleValues();
                try {
                    var47.resetMultipleValues();
                    final SubLObject var3_380 = module0580.$g4358$.currentBinding(var47);
                    try {
                        module0580.$g4358$.bind(module0580.f35544(), var47);
                        final SubLObject var50 = var47.secondMultipleValue();
                        var47.resetMultipleValues();
                        final SubLObject var3_381 = module0580.$g4359$.currentBinding(var47);
                        try {
                            module0580.$g4359$.bind(module0580.f35545(), var47);
                            final SubLObject var51 = module0580.$g4358$.getDynamicValue(var47);
                            final SubLObject var3_382 = module0034.$g879$.currentBinding(var47);
                            try {
                                module0034.$g879$.bind(var51, var47);
                                SubLObject var52 = (SubLObject)NIL;
                                if (NIL != var51 && NIL == module0034.f1842(var51)) {
                                    var52 = module0034.f1869(var51);
                                    final SubLObject var53 = Threads.current_process();
                                    if (NIL == var52) {
                                        module0034.f1873(var51, var53);
                                    }
                                    else if (!var52.eql(var53)) {
                                        Errors.error((SubLObject)$ic156$);
                                    }
                                }
                                try {
                                    final SubLObject var3_383 = module0579.$g4260$.currentBinding(var47);
                                    final SubLObject var54 = module0579.$g4259$.currentBinding(var47);
                                    final SubLObject var55 = module0579.$g4238$.currentBinding(var47);
                                    final SubLObject var56 = module0656.$g5172$.currentBinding(var47);
                                    try {
                                        module0579.$g4260$.bind(module0677.f41312(), var47);
                                        module0579.$g4259$.bind((SubLObject)$ic157$, var47);
                                        module0579.$g4238$.bind((SubLObject)T, var47);
                                        module0656.$g5172$.bind(module0661.f40305(), var47);
                                        if (NIL == var44) {
                                            f40807(var1);
                                        }
                                        else if (NIL == var46) {
                                            f40808(var1, var44);
                                        }
                                        else {
                                            f40809(var1, var44, var46);
                                        }
                                    }
                                    finally {
                                        module0656.$g5172$.rebind(var56, var47);
                                        module0579.$g4238$.rebind(var55, var47);
                                        module0579.$g4259$.rebind(var54, var47);
                                        module0579.$g4260$.rebind(var3_383, var47);
                                    }
                                }
                                finally {
                                    final SubLObject var3_384 = Threads.$is_thread_performing_cleanupP$.currentBinding(var47);
                                    try {
                                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)T, var47);
                                        if (NIL != var51 && NIL == var52) {
                                            module0034.f1873(var51, (SubLObject)NIL);
                                        }
                                    }
                                    finally {
                                        Threads.$is_thread_performing_cleanupP$.rebind(var3_384, var47);
                                    }
                                }
                            }
                            finally {
                                module0034.$g879$.rebind(var3_382, var47);
                            }
                        }
                        finally {
                            module0580.$g4359$.rebind(var3_381, var47);
                        }
                        if (var50 == $ic159$ && NIL != module0034.f1839(module0580.$g4358$.getDynamicValue(var47))) {
                            module0034.f1891(module0580.$g4358$.getDynamicValue(var47));
                        }
                    }
                    finally {
                        module0580.$g4358$.rebind(var3_380, var47);
                    }
                }
                finally {
                    final SubLObject var3_385 = Threads.$is_thread_performing_cleanupP$.currentBinding(var47);
                    try {
                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)T, var47);
                        if (NIL == var49) {
                            module0580.f35554(module0580.$g4362$.getDynamicValue(var47));
                        }
                    }
                    finally {
                        Threads.$is_thread_performing_cleanupP$.rebind(var3_385, var47);
                    }
                }
            }
            finally {
                module0580.$g4362$.rebind(var3_379, var47);
            }
        }
        finally {
            module0580.$g4361$.rebind(var48, var47);
        }
        return (SubLObject)NIL;
    }

    public static SubLObject f40807(final SubLObject var1) {
        SubLObject var2 = (SubLObject)NIL;
        SubLObject var3 = (SubLObject)$ic313$;
        SubLObject var4 = (SubLObject)NIL;
        var4 = var3.first();
        while (NIL != var3) {
            if (f40654(var1, var4, (SubLObject)UNPROVIDED).numG((SubLObject)ZERO_INTEGER)) {
                if (NIL != var2) {
                    module0642.f39051((SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                }
                f40808(var1, var4);
                var2 = (SubLObject)T;
            }
            var3 = var3.rest();
            var4 = var3.first();
        }
        return (SubLObject)NIL;
    }

    public static SubLObject f40808(final SubLObject var1, final SubLObject var44) {
        f40801(var44, (SubLObject)UNPROVIDED);
        SubLObject var46;
        final SubLObject var45 = var46 = f40656(var1, var44, (SubLObject)UNPROVIDED);
        SubLObject var47 = (SubLObject)NIL;
        var47 = var46.first();
        while (NIL != var46) {
            f40809(var1, var44, var47);
            var46 = var46.rest();
            var47 = var46.first();
        }
        return (SubLObject)NIL;
    }

    public static SubLObject f40809(final SubLObject var1, final SubLObject var44, final SubLObject var46) {
        final SubLThread var47 = SubLProcess.currentSubLThread();
        f40804(var46);
        final SubLObject var48 = (NIL != f40692(var1)) ? Symbols.symbol_function((SubLObject)$ic257$) : Symbols.symbol_function((SubLObject)$ic259$);
        final SubLObject var49 = module0655.$g5129$.currentBinding(var47);
        final SubLObject var50 = module0655.$g5130$.currentBinding(var47);
        final SubLObject var51 = module0147.$g2094$.currentBinding(var47);
        final SubLObject var52 = module0147.$g2095$.currentBinding(var47);
        try {
            module0655.$g5129$.bind((SubLObject)NIL, var47);
            module0655.$g5130$.bind((SubLObject)NIL, var47);
            module0147.$g2094$.bind((SubLObject)$ic134$, var47);
            module0147.$g2095$.bind($ic135$, var47);
            module0219.f14482(var48, var1, var44, var46);
        }
        finally {
            module0147.$g2095$.rebind(var52, var47);
            module0147.$g2094$.rebind(var51, var47);
            module0655.$g5130$.rebind(var50, var47);
            module0655.$g5129$.rebind(var49, var47);
        }
        return (SubLObject)NIL;
    }

    public static SubLObject f40810(final SubLObject var52) {
        final SubLThread var53 = SubLProcess.currentSubLThread();
        SubLObject var54 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var52, var52, (SubLObject)$ic302$);
        var54 = var52.first();
        SubLObject var55 = var52.rest();
        final SubLObject var56 = (SubLObject)(var55.isCons() ? var55.first() : NIL);
        cdestructuring_bind.destructuring_bind_must_listp(var55, var52, (SubLObject)$ic302$);
        var55 = var55.rest();
        final SubLObject var57 = (SubLObject)(var55.isCons() ? var55.first() : NIL);
        cdestructuring_bind.destructuring_bind_must_listp(var55, var52, (SubLObject)$ic302$);
        var55 = var55.rest();
        final SubLObject var58 = (SubLObject)(var55.isCons() ? var55.first() : NIL);
        cdestructuring_bind.destructuring_bind_must_listp(var55, var52, (SubLObject)$ic302$);
        var55 = var55.rest();
        if (NIL == var55) {
            final SubLObject var59 = module0656.f39969(var54);
            SubLObject var60 = (SubLObject)NIL;
            SubLObject var61 = (SubLObject)NIL;
            SubLObject var62 = (SubLObject)NIL;
            if (NIL == module0656.f39930(var59)) {
                return module0656.f39789((SubLObject)$ic88$, var54, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
            }
            if (NIL != var56) {
                var60 = reader.read_from_string_ignoring_errors(var56, (SubLObject)NIL, (SubLObject)NIL, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                if (NIL == module0130.f8516(var60)) {
                    return module0656.f39789((SubLObject)$ic303$, var56, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                }
                if (NIL != var57) {
                    var61 = module0656.f39959(var57);
                    if (NIL == module0161.f10481(var61)) {
                        return module0656.f39789((SubLObject)$ic99$, var57, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                    }
                    if (NIL != var58) {
                        var62 = reader.read_from_string_ignoring_errors(var58, (SubLObject)NIL, (SubLObject)NIL, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                        if (NIL == module0130.f8503(var62)) {
                            return module0656.f39789((SubLObject)$ic304$, var58, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                        }
                    }
                }
            }
            final SubLObject var64;
            final SubLObject var63 = var64 = PrintLow.format((SubLObject)NIL, (SubLObject)$ic320$, var59);
            final SubLObject var65 = module0015.$g538$.currentBinding(var53);
            try {
                module0015.$g538$.bind((NIL != module0057.f4158(module0015.$g538$.getDynamicValue(var53))) ? module0015.$g538$.getDynamicValue(var53) : module0057.f4173((SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED), var53);
                module0642.f39020((SubLObject)$ic0$);
                module0642.f39029((SubLObject)UNPROVIDED);
                module0642.f39020(module0015.$g155$.getGlobalValue());
                module0642.f39020(module0015.$g153$.getGlobalValue());
                module0015.f718();
                module0655.f39766();
                module0642.f39064(module0655.$g5143$.getDynamicValue(var53), module0655.$g5142$.getDynamicValue(var53));
                final SubLObject var66 = module0014.f672((SubLObject)$ic1$);
                module0642.f39029((SubLObject)UNPROVIDED);
                module0642.f39020(module0015.$g175$.getGlobalValue());
                module0642.f39020(module0015.$g176$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                module0642.f39020((SubLObject)$ic2$);
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                if (NIL != var66) {
                    module0642.f39020(module0015.$g178$.getGlobalValue());
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                    module0642.f39020(var66);
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                }
                module0642.f39020(module0015.$g177$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                module0642.f39020((SubLObject)$ic3$);
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                if (NIL != var64) {
                    module0642.f39029((SubLObject)UNPROVIDED);
                    module0642.f39020(module0015.$g173$.getGlobalValue());
                    module0642.f39019(var64);
                    module0642.f39020(module0015.$g174$.getGlobalValue());
                }
                module0016.f941();
                module0642.f39020(module0015.$g154$.getGlobalValue());
                module0642.f39029((SubLObject)UNPROVIDED);
                final SubLObject var3_388 = module0015.$g535$.currentBinding(var53);
                try {
                    module0015.$g535$.bind((SubLObject)T, var53);
                    module0642.f39020(module0015.$g133$.getGlobalValue());
                    if (NIL != module0015.$g132$.getDynamicValue(var53)) {
                        module0642.f39020(module0015.$g135$.getGlobalValue());
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                        module0642.f39020(module0642.f39042(module0015.$g132$.getDynamicValue(var53)));
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                    }
                    module0642.f39020(module0015.$g137$.getGlobalValue());
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                    module0642.f39020((SubLObject)$ic150$);
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                    module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                    final SubLObject var3_389 = module0015.$g533$.currentBinding(var53);
                    try {
                        module0015.$g533$.bind((SubLObject)T, var53);
                        module0642.f39020(module0015.$g144$.getGlobalValue());
                        module0642.f39020(module0015.$g157$.getGlobalValue());
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                        module0642.f39020((SubLObject)$ic151$);
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                        final SubLObject var3_390 = module0015.$g533$.currentBinding(var53);
                        try {
                            module0015.$g533$.bind((SubLObject)T, var53);
                            module0642.f39020(module0015.$g295$.getGlobalValue());
                            module0642.f39020(module0015.$g305$.getGlobalValue());
                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                            module0642.f39020((SubLObject)$ic152$);
                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                            module0642.f39020(module0015.$g302$.getGlobalValue());
                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                            module0642.f39020((SubLObject)$ic153$);
                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                            module0642.f39020(module0015.$g307$.getGlobalValue());
                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                            module0642.f39019((SubLObject)$ic154$);
                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                            module0642.f39020(module0015.$g160$.getGlobalValue());
                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                            module0642.f39020((SubLObject)$ic155$);
                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                        }
                        finally {
                            module0015.$g533$.rebind(var3_390, var53);
                        }
                        module0642.f39020(module0015.$g145$.getGlobalValue());
                        f40722(var59);
                        module0642.f39026((SubLObject)TWO_INTEGER);
                        f40747(var59, var60, var61, var62);
                        module0642.f39029((SubLObject)UNPROVIDED);
                        module0642.f39050();
                    }
                    finally {
                        module0015.$g533$.rebind(var3_389, var53);
                    }
                    module0642.f39020(module0015.$g134$.getGlobalValue());
                    module0642.f39029((SubLObject)UNPROVIDED);
                }
                finally {
                    module0015.$g535$.rebind(var3_388, var53);
                }
                module0642.f39020(module0015.$g156$.getGlobalValue());
                module0642.f39029((SubLObject)UNPROVIDED);
            }
            finally {
                module0015.$g538$.rebind(var65, var53);
            }
        }
        else {
            cdestructuring_bind.cdestructuring_bind_error(var52, (SubLObject)$ic302$);
        }
        return (SubLObject)NIL;
    }

    public static SubLObject f40811(final SubLObject var1, final SubLObject var29, SubLObject var44, SubLObject var37, SubLObject var46) {
        if (var44 == UNPROVIDED) {
            var44 = (SubLObject)NIL;
        }
        if (var37 == UNPROVIDED) {
            var37 = (SubLObject)NIL;
        }
        if (var46 == UNPROVIDED) {
            var46 = (SubLObject)NIL;
        }
        final SubLThread var47 = SubLProcess.currentSubLThread();
        final SubLObject var48 = module0656.f39832((SubLObject)$ic48$);
        module0642.f39020(module0015.$g381$.getGlobalValue());
        module0642.f39020(module0015.$g383$.getGlobalValue());
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        module0655.f39768();
        PrintLow.format(module0015.$g131$.getDynamicValue(var47), (SubLObject)$ic322$, module0656.f39931(var1));
        if (NIL != var44) {
            PrintLow.format(module0015.$g131$.getDynamicValue(var47), (SubLObject)$ic308$, var44);
            if (NIL != var37) {
                PrintLow.format(module0015.$g131$.getDynamicValue(var47), (SubLObject)$ic244$, module0656.f39934(var37));
                if (NIL != var46) {
                    PrintLow.format(module0015.$g131$.getDynamicValue(var47), (SubLObject)$ic308$, var46);
                }
            }
        }
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        if (NIL != var48) {
            module0642.f39020(module0015.$g387$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
            module0642.f39020(var48);
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        }
        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
        final SubLObject var49 = module0015.$g533$.currentBinding(var47);
        try {
            module0015.$g533$.bind((SubLObject)T, var47);
            if (NIL != var46) {
                module0656.f39797(var46);
            }
            else if (NIL != var37) {
                module0656.f39964(var37);
            }
            else if (NIL != var44) {
                final SubLObject var50 = var44;
                if (var50.eql((SubLObject)$ic60$)) {
                    module0642.f39019((SubLObject)$ic309$);
                }
                else if (var50.eql((SubLObject)$ic61$)) {
                    module0642.f39019((SubLObject)$ic310$);
                }
                else {
                    module0642.f39019(var44);
                }
            }
            else {
                PrintLow.format(module0015.$g131$.getDynamicValue(var47), (SubLObject)$ic323$);
            }
        }
        finally {
            module0015.$g533$.rebind(var49, var47);
        }
        module0642.f39020(module0015.$g382$.getGlobalValue());
        if (var29.numG((SubLObject)ONE_INTEGER)) {
            PrintLow.format(module0015.$g131$.getDynamicValue(var47), (SubLObject)$ic219$, var29);
        }
        return var1;
    }

    public static SubLObject f40747(final SubLObject var1, final SubLObject var44, final SubLObject var37, final SubLObject var46) {
        final SubLThread var47 = SubLProcess.currentSubLThread();
        final SubLObject var48 = module0580.$g4361$.currentBinding(var47);
        try {
            module0580.$g4361$.bind((SubLObject)NIL, var47);
            var47.resetMultipleValues();
            final SubLObject var3_391 = module0580.$g4362$.currentBinding(var47);
            try {
                module0580.$g4362$.bind(module0580.f35560(), var47);
                final SubLObject var49 = var47.secondMultipleValue();
                var47.resetMultipleValues();
                try {
                    var47.resetMultipleValues();
                    final SubLObject var3_392 = module0580.$g4358$.currentBinding(var47);
                    try {
                        module0580.$g4358$.bind(module0580.f35544(), var47);
                        final SubLObject var50 = var47.secondMultipleValue();
                        var47.resetMultipleValues();
                        final SubLObject var3_393 = module0580.$g4359$.currentBinding(var47);
                        try {
                            module0580.$g4359$.bind(module0580.f35545(), var47);
                            final SubLObject var51 = module0580.$g4358$.getDynamicValue(var47);
                            final SubLObject var3_394 = module0034.$g879$.currentBinding(var47);
                            try {
                                module0034.$g879$.bind(var51, var47);
                                SubLObject var52 = (SubLObject)NIL;
                                if (NIL != var51 && NIL == module0034.f1842(var51)) {
                                    var52 = module0034.f1869(var51);
                                    final SubLObject var53 = Threads.current_process();
                                    if (NIL == var52) {
                                        module0034.f1873(var51, var53);
                                    }
                                    else if (!var52.eql(var53)) {
                                        Errors.error((SubLObject)$ic156$);
                                    }
                                }
                                try {
                                    final SubLObject var3_395 = module0579.$g4260$.currentBinding(var47);
                                    final SubLObject var54 = module0579.$g4259$.currentBinding(var47);
                                    final SubLObject var55 = module0656.$g5172$.currentBinding(var47);
                                    try {
                                        module0579.$g4260$.bind(module0677.f41312(), var47);
                                        module0579.$g4259$.bind((SubLObject)$ic157$, var47);
                                        module0656.$g5172$.bind(module0661.f40305(), var47);
                                        if (NIL == var44) {
                                            f40812(var1);
                                        }
                                        else if (NIL == var37) {
                                            f40813(var1, var44);
                                        }
                                        else {
                                            f40801(var44, (SubLObject)$ic325$);
                                            if (NIL == var46) {
                                                f40814(var1, var44, var37);
                                            }
                                            else {
                                                f40763(var37, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                                                f40815(var1, var44, var37, var46);
                                            }
                                        }
                                    }
                                    finally {
                                        module0656.$g5172$.rebind(var55, var47);
                                        module0579.$g4259$.rebind(var54, var47);
                                        module0579.$g4260$.rebind(var3_395, var47);
                                    }
                                }
                                finally {
                                    final SubLObject var3_396 = Threads.$is_thread_performing_cleanupP$.currentBinding(var47);
                                    try {
                                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)T, var47);
                                        if (NIL != var51 && NIL == var52) {
                                            module0034.f1873(var51, (SubLObject)NIL);
                                        }
                                    }
                                    finally {
                                        Threads.$is_thread_performing_cleanupP$.rebind(var3_396, var47);
                                    }
                                }
                            }
                            finally {
                                module0034.$g879$.rebind(var3_394, var47);
                            }
                        }
                        finally {
                            module0580.$g4359$.rebind(var3_393, var47);
                        }
                        if (var50 == $ic159$ && NIL != module0034.f1839(module0580.$g4358$.getDynamicValue(var47))) {
                            module0034.f1891(module0580.$g4358$.getDynamicValue(var47));
                        }
                    }
                    finally {
                        module0580.$g4358$.rebind(var3_392, var47);
                    }
                }
                finally {
                    final SubLObject var3_397 = Threads.$is_thread_performing_cleanupP$.currentBinding(var47);
                    try {
                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)T, var47);
                        if (NIL == var49) {
                            module0580.f35554(module0580.$g4362$.getDynamicValue(var47));
                        }
                    }
                    finally {
                        Threads.$is_thread_performing_cleanupP$.rebind(var3_397, var47);
                    }
                }
            }
            finally {
                module0580.$g4362$.rebind(var3_391, var47);
            }
        }
        finally {
            module0580.$g4361$.rebind(var48, var47);
        }
        return (SubLObject)NIL;
    }

    public static SubLObject f40812(final SubLObject var1) {
        SubLObject var2 = (SubLObject)NIL;
        SubLObject var3 = (SubLObject)$ic313$;
        SubLObject var4 = (SubLObject)NIL;
        var4 = var3.first();
        while (NIL != var3) {
            if (f40658(var1, var4, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED).numG((SubLObject)ZERO_INTEGER)) {
                if (NIL != var2) {
                    module0642.f39051((SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                }
                f40813(var1, var4);
                var2 = (SubLObject)T;
            }
            var3 = var3.rest();
            var4 = var3.first();
        }
        return (SubLObject)NIL;
    }

    public static SubLObject f40813(final SubLObject var1, final SubLObject var44) {
        f40801(var44, (SubLObject)$ic325$);
        SubLObject var46;
        final SubLObject var45 = var46 = f40660(var1, var44, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        SubLObject var47 = (SubLObject)NIL;
        var47 = var46.first();
        while (NIL != var46) {
            f40814(var1, var44, var47);
            var46 = var46.rest();
            var47 = var46.first();
        }
        return (SubLObject)NIL;
    }

    public static SubLObject f40814(final SubLObject var1, final SubLObject var44, final SubLObject var37) {
        f40763(var37, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        SubLObject var46;
        final SubLObject var45 = var46 = f40660(var1, var44, var37, (SubLObject)UNPROVIDED);
        SubLObject var47 = (SubLObject)NIL;
        var47 = var46.first();
        while (NIL != var46) {
            f40815(var1, var44, var37, var47);
            var46 = var46.rest();
            var47 = var46.first();
        }
        return (SubLObject)NIL;
    }

    public static SubLObject f40815(final SubLObject var1, final SubLObject var44, final SubLObject var37, final SubLObject var46) {
        final SubLThread var47 = SubLProcess.currentSubLThread();
        f40804(var46);
        final SubLObject var48 = (NIL != f40692(var1)) ? Symbols.symbol_function((SubLObject)$ic258$) : Symbols.symbol_function((SubLObject)$ic260$);
        final SubLObject var49 = module0655.$g5129$.currentBinding(var47);
        final SubLObject var50 = module0655.$g5130$.currentBinding(var47);
        try {
            module0655.$g5129$.bind((SubLObject)NIL, var47);
            module0655.$g5130$.bind((SubLObject)NIL, var47);
            module0219.f14483(var48, var1, var44, var46, var37);
        }
        finally {
            module0655.$g5130$.rebind(var50, var47);
            module0655.$g5129$.rebind(var49, var47);
        }
        return (SubLObject)NIL;
    }

    public static SubLObject f40816(final SubLObject var52) {
        final SubLThread var53 = SubLProcess.currentSubLThread();
        SubLObject var54 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var52, var52, (SubLObject)$ic302$);
        var54 = var52.first();
        SubLObject var55 = var52.rest();
        final SubLObject var56 = (SubLObject)(var55.isCons() ? var55.first() : NIL);
        cdestructuring_bind.destructuring_bind_must_listp(var55, var52, (SubLObject)$ic302$);
        var55 = var55.rest();
        final SubLObject var57 = (SubLObject)(var55.isCons() ? var55.first() : NIL);
        cdestructuring_bind.destructuring_bind_must_listp(var55, var52, (SubLObject)$ic302$);
        var55 = var55.rest();
        final SubLObject var58 = (SubLObject)(var55.isCons() ? var55.first() : NIL);
        cdestructuring_bind.destructuring_bind_must_listp(var55, var52, (SubLObject)$ic302$);
        var55 = var55.rest();
        if (NIL == var55) {
            final SubLObject var59 = module0656.f39969(var54);
            SubLObject var60 = (SubLObject)NIL;
            SubLObject var61 = (SubLObject)NIL;
            SubLObject var62 = (SubLObject)NIL;
            if (NIL == module0656.f39930(var59)) {
                return module0656.f39789((SubLObject)$ic88$, var54, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
            }
            if (NIL != var56) {
                var60 = reader.read_from_string_ignoring_errors(var56, (SubLObject)NIL, (SubLObject)NIL, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                if (NIL == module0130.f8516(var60)) {
                    return module0656.f39789((SubLObject)$ic303$, var56, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                }
                if (NIL != var57) {
                    var61 = module0656.f39959(var57);
                    if (NIL == module0161.f10481(var61)) {
                        return module0656.f39789((SubLObject)$ic99$, var57, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                    }
                    if (NIL != var58) {
                        var62 = reader.read_from_string_ignoring_errors(var58, (SubLObject)NIL, (SubLObject)NIL, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                        if (NIL == module0130.f8503(var62)) {
                            return module0656.f39789((SubLObject)$ic304$, var58, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                        }
                    }
                }
            }
            final SubLObject var64;
            final SubLObject var63 = var64 = PrintLow.format((SubLObject)NIL, (SubLObject)$ic326$, var59);
            final SubLObject var65 = module0015.$g538$.currentBinding(var53);
            try {
                module0015.$g538$.bind((NIL != module0057.f4158(module0015.$g538$.getDynamicValue(var53))) ? module0015.$g538$.getDynamicValue(var53) : module0057.f4173((SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED), var53);
                module0642.f39020((SubLObject)$ic0$);
                module0642.f39029((SubLObject)UNPROVIDED);
                module0642.f39020(module0015.$g155$.getGlobalValue());
                module0642.f39020(module0015.$g153$.getGlobalValue());
                module0015.f718();
                module0655.f39766();
                module0642.f39064(module0655.$g5143$.getDynamicValue(var53), module0655.$g5142$.getDynamicValue(var53));
                final SubLObject var66 = module0014.f672((SubLObject)$ic1$);
                module0642.f39029((SubLObject)UNPROVIDED);
                module0642.f39020(module0015.$g175$.getGlobalValue());
                module0642.f39020(module0015.$g176$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                module0642.f39020((SubLObject)$ic2$);
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                if (NIL != var66) {
                    module0642.f39020(module0015.$g178$.getGlobalValue());
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                    module0642.f39020(var66);
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                }
                module0642.f39020(module0015.$g177$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                module0642.f39020((SubLObject)$ic3$);
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                if (NIL != var64) {
                    module0642.f39029((SubLObject)UNPROVIDED);
                    module0642.f39020(module0015.$g173$.getGlobalValue());
                    module0642.f39019(var64);
                    module0642.f39020(module0015.$g174$.getGlobalValue());
                }
                module0016.f941();
                module0642.f39020(module0015.$g154$.getGlobalValue());
                module0642.f39029((SubLObject)UNPROVIDED);
                final SubLObject var3_400 = module0015.$g535$.currentBinding(var53);
                try {
                    module0015.$g535$.bind((SubLObject)T, var53);
                    module0642.f39020(module0015.$g133$.getGlobalValue());
                    if (NIL != module0015.$g132$.getDynamicValue(var53)) {
                        module0642.f39020(module0015.$g135$.getGlobalValue());
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                        module0642.f39020(module0642.f39042(module0015.$g132$.getDynamicValue(var53)));
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                    }
                    module0642.f39020(module0015.$g137$.getGlobalValue());
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                    module0642.f39020((SubLObject)$ic150$);
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                    module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                    final SubLObject var3_401 = module0015.$g533$.currentBinding(var53);
                    try {
                        module0015.$g533$.bind((SubLObject)T, var53);
                        module0642.f39020(module0015.$g144$.getGlobalValue());
                        module0642.f39020(module0015.$g157$.getGlobalValue());
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                        module0642.f39020((SubLObject)$ic151$);
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                        final SubLObject var3_402 = module0015.$g533$.currentBinding(var53);
                        try {
                            module0015.$g533$.bind((SubLObject)T, var53);
                            module0642.f39020(module0015.$g295$.getGlobalValue());
                            module0642.f39020(module0015.$g305$.getGlobalValue());
                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                            module0642.f39020((SubLObject)$ic152$);
                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                            module0642.f39020(module0015.$g302$.getGlobalValue());
                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                            module0642.f39020((SubLObject)$ic153$);
                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                            module0642.f39020(module0015.$g307$.getGlobalValue());
                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                            module0642.f39019((SubLObject)$ic154$);
                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                            module0642.f39020(module0015.$g160$.getGlobalValue());
                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                            module0642.f39020((SubLObject)$ic155$);
                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                        }
                        finally {
                            module0015.$g533$.rebind(var3_402, var53);
                        }
                        module0642.f39020(module0015.$g145$.getGlobalValue());
                        f40722(var59);
                        module0642.f39026((SubLObject)TWO_INTEGER);
                        f40817(var59, var60, var61, var62);
                        module0642.f39029((SubLObject)UNPROVIDED);
                        module0642.f39050();
                    }
                    finally {
                        module0015.$g533$.rebind(var3_401, var53);
                    }
                    module0642.f39020(module0015.$g134$.getGlobalValue());
                    module0642.f39029((SubLObject)UNPROVIDED);
                }
                finally {
                    module0015.$g535$.rebind(var3_400, var53);
                }
                module0642.f39020(module0015.$g156$.getGlobalValue());
                module0642.f39029((SubLObject)UNPROVIDED);
            }
            finally {
                module0015.$g538$.rebind(var65, var53);
            }
        }
        else {
            cdestructuring_bind.cdestructuring_bind_error(var52, (SubLObject)$ic302$);
        }
        return (SubLObject)NIL;
    }

    public static SubLObject f40818(final SubLObject var1, final SubLObject var29, SubLObject var44, SubLObject var37, SubLObject var46) {
        if (var44 == UNPROVIDED) {
            var44 = (SubLObject)NIL;
        }
        if (var37 == UNPROVIDED) {
            var37 = (SubLObject)NIL;
        }
        if (var46 == UNPROVIDED) {
            var46 = (SubLObject)NIL;
        }
        final SubLThread var47 = SubLProcess.currentSubLThread();
        final SubLObject var48 = module0656.f39832((SubLObject)$ic48$);
        module0642.f39020(module0015.$g381$.getGlobalValue());
        module0642.f39020(module0015.$g383$.getGlobalValue());
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        module0655.f39768();
        PrintLow.format(module0015.$g131$.getDynamicValue(var47), (SubLObject)$ic328$, module0656.f39931(var1));
        if (NIL != var44) {
            PrintLow.format(module0015.$g131$.getDynamicValue(var47), (SubLObject)$ic308$, var44);
            if (NIL != var37) {
                PrintLow.format(module0015.$g131$.getDynamicValue(var47), (SubLObject)$ic244$, module0656.f39934(var37));
                if (NIL != var46) {
                    PrintLow.format(module0015.$g131$.getDynamicValue(var47), (SubLObject)$ic308$, var46);
                }
            }
        }
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        if (NIL != var48) {
            module0642.f39020(module0015.$g387$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
            module0642.f39020(var48);
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        }
        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
        final SubLObject var49 = module0015.$g533$.currentBinding(var47);
        try {
            module0015.$g533$.bind((SubLObject)T, var47);
            if (NIL != var46) {
                module0656.f39797(var46);
            }
            else if (NIL != var37) {
                module0656.f39964(var37);
            }
            else if (NIL != var44) {
                final SubLObject var50 = var44;
                if (var50.eql((SubLObject)$ic60$)) {
                    module0642.f39019((SubLObject)$ic309$);
                }
                else if (var50.eql((SubLObject)$ic61$)) {
                    module0642.f39019((SubLObject)$ic310$);
                }
                else {
                    module0642.f39019(var44);
                }
            }
            else {
                PrintLow.format(module0015.$g131$.getDynamicValue(var47), (SubLObject)$ic329$);
            }
        }
        finally {
            module0015.$g533$.rebind(var49, var47);
        }
        module0642.f39020(module0015.$g382$.getGlobalValue());
        if (var29.numG((SubLObject)ONE_INTEGER)) {
            PrintLow.format(module0015.$g131$.getDynamicValue(var47), (SubLObject)$ic219$, var29);
        }
        return var1;
    }

    public static SubLObject f40817(final SubLObject var1, final SubLObject var44, final SubLObject var37, final SubLObject var46) {
        final SubLThread var47 = SubLProcess.currentSubLThread();
        final SubLObject var48 = module0580.$g4361$.currentBinding(var47);
        try {
            module0580.$g4361$.bind((SubLObject)NIL, var47);
            var47.resetMultipleValues();
            final SubLObject var3_403 = module0580.$g4362$.currentBinding(var47);
            try {
                module0580.$g4362$.bind(module0580.f35560(), var47);
                final SubLObject var49 = var47.secondMultipleValue();
                var47.resetMultipleValues();
                try {
                    var47.resetMultipleValues();
                    final SubLObject var3_404 = module0580.$g4358$.currentBinding(var47);
                    try {
                        module0580.$g4358$.bind(module0580.f35544(), var47);
                        final SubLObject var50 = var47.secondMultipleValue();
                        var47.resetMultipleValues();
                        final SubLObject var3_405 = module0580.$g4359$.currentBinding(var47);
                        try {
                            module0580.$g4359$.bind(module0580.f35545(), var47);
                            final SubLObject var51 = module0580.$g4358$.getDynamicValue(var47);
                            final SubLObject var3_406 = module0034.$g879$.currentBinding(var47);
                            try {
                                module0034.$g879$.bind(var51, var47);
                                SubLObject var52 = (SubLObject)NIL;
                                if (NIL != var51 && NIL == module0034.f1842(var51)) {
                                    var52 = module0034.f1869(var51);
                                    final SubLObject var53 = Threads.current_process();
                                    if (NIL == var52) {
                                        module0034.f1873(var51, var53);
                                    }
                                    else if (!var52.eql(var53)) {
                                        Errors.error((SubLObject)$ic156$);
                                    }
                                }
                                try {
                                    final SubLObject var3_407 = module0579.$g4260$.currentBinding(var47);
                                    final SubLObject var54 = module0579.$g4259$.currentBinding(var47);
                                    final SubLObject var55 = module0656.$g5172$.currentBinding(var47);
                                    try {
                                        module0579.$g4260$.bind(module0677.f41312(), var47);
                                        module0579.$g4259$.bind((SubLObject)$ic157$, var47);
                                        module0656.$g5172$.bind(module0661.f40305(), var47);
                                        if (NIL == var44) {
                                            f40819(var1);
                                        }
                                        else if (NIL == var37) {
                                            f40820(var1, var44);
                                        }
                                        else {
                                            f40801(var44, (SubLObject)$ic331$);
                                            if (NIL == var46) {
                                                f40821(var1, var44, var37);
                                            }
                                            else {
                                                f40763(var37, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                                                f40822(var1, var44, var37, var46);
                                            }
                                        }
                                    }
                                    finally {
                                        module0656.$g5172$.rebind(var55, var47);
                                        module0579.$g4259$.rebind(var54, var47);
                                        module0579.$g4260$.rebind(var3_407, var47);
                                    }
                                }
                                finally {
                                    final SubLObject var3_408 = Threads.$is_thread_performing_cleanupP$.currentBinding(var47);
                                    try {
                                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)T, var47);
                                        if (NIL != var51 && NIL == var52) {
                                            module0034.f1873(var51, (SubLObject)NIL);
                                        }
                                    }
                                    finally {
                                        Threads.$is_thread_performing_cleanupP$.rebind(var3_408, var47);
                                    }
                                }
                            }
                            finally {
                                module0034.$g879$.rebind(var3_406, var47);
                            }
                        }
                        finally {
                            module0580.$g4359$.rebind(var3_405, var47);
                        }
                        if (var50 == $ic159$ && NIL != module0034.f1839(module0580.$g4358$.getDynamicValue(var47))) {
                            module0034.f1891(module0580.$g4358$.getDynamicValue(var47));
                        }
                    }
                    finally {
                        module0580.$g4358$.rebind(var3_404, var47);
                    }
                }
                finally {
                    final SubLObject var3_409 = Threads.$is_thread_performing_cleanupP$.currentBinding(var47);
                    try {
                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)T, var47);
                        if (NIL == var49) {
                            module0580.f35554(module0580.$g4362$.getDynamicValue(var47));
                        }
                    }
                    finally {
                        Threads.$is_thread_performing_cleanupP$.rebind(var3_409, var47);
                    }
                }
            }
            finally {
                module0580.$g4362$.rebind(var3_403, var47);
            }
        }
        finally {
            module0580.$g4361$.rebind(var48, var47);
        }
        return (SubLObject)NIL;
    }

    public static SubLObject f40819(final SubLObject var1) {
        SubLObject var2 = (SubLObject)NIL;
        SubLObject var3 = (SubLObject)$ic313$;
        SubLObject var4 = (SubLObject)NIL;
        var4 = var3.first();
        while (NIL != var3) {
            if (f40663(var1, var4, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED).numG((SubLObject)ZERO_INTEGER)) {
                if (NIL != var2) {
                    module0642.f39051((SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                }
                f40820(var1, var4);
                var2 = (SubLObject)T;
            }
            var3 = var3.rest();
            var4 = var3.first();
        }
        return (SubLObject)NIL;
    }

    public static SubLObject f40820(final SubLObject var1, final SubLObject var44) {
        f40801(var44, (SubLObject)$ic331$);
        SubLObject var46;
        final SubLObject var45 = var46 = f40665(var1, var44, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        SubLObject var47 = (SubLObject)NIL;
        var47 = var46.first();
        while (NIL != var46) {
            f40821(var1, var44, var47);
            var46 = var46.rest();
            var47 = var46.first();
        }
        return (SubLObject)NIL;
    }

    public static SubLObject f40821(final SubLObject var1, final SubLObject var44, final SubLObject var37) {
        f40763(var37, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        SubLObject var46;
        final SubLObject var45 = var46 = f40665(var1, var44, var37, (SubLObject)UNPROVIDED);
        SubLObject var47 = (SubLObject)NIL;
        var47 = var46.first();
        while (NIL != var46) {
            f40822(var1, var44, var37, var47);
            var46 = var46.rest();
            var47 = var46.first();
        }
        return (SubLObject)NIL;
    }

    public static SubLObject f40822(final SubLObject var1, final SubLObject var44, final SubLObject var37, final SubLObject var46) {
        final SubLThread var47 = SubLProcess.currentSubLThread();
        f40804(var46);
        final SubLObject var48 = (NIL != f40692(var1)) ? Symbols.symbol_function((SubLObject)$ic258$) : Symbols.symbol_function((SubLObject)$ic260$);
        final SubLObject var49 = module0655.$g5129$.currentBinding(var47);
        final SubLObject var50 = module0655.$g5130$.currentBinding(var47);
        try {
            module0655.$g5129$.bind((SubLObject)NIL, var47);
            module0655.$g5130$.bind((SubLObject)NIL, var47);
            module0219.f14484(var48, var1, var44, var46, var37);
        }
        finally {
            module0655.$g5130$.rebind(var50, var47);
            module0655.$g5129$.rebind(var49, var47);
        }
        return (SubLObject)NIL;
    }

    public static SubLObject f40823(final SubLObject var52) {
        final SubLThread var53 = SubLProcess.currentSubLThread();
        SubLObject var54 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var52, var52, (SubLObject)$ic302$);
        var54 = var52.first();
        SubLObject var55 = var52.rest();
        final SubLObject var56 = (SubLObject)(var55.isCons() ? var55.first() : NIL);
        cdestructuring_bind.destructuring_bind_must_listp(var55, var52, (SubLObject)$ic302$);
        var55 = var55.rest();
        final SubLObject var57 = (SubLObject)(var55.isCons() ? var55.first() : NIL);
        cdestructuring_bind.destructuring_bind_must_listp(var55, var52, (SubLObject)$ic302$);
        var55 = var55.rest();
        final SubLObject var58 = (SubLObject)(var55.isCons() ? var55.first() : NIL);
        cdestructuring_bind.destructuring_bind_must_listp(var55, var52, (SubLObject)$ic302$);
        var55 = var55.rest();
        if (NIL == var55) {
            final SubLObject var59 = module0656.f39969(var54);
            SubLObject var60 = (SubLObject)NIL;
            SubLObject var61 = (SubLObject)NIL;
            SubLObject var62 = (SubLObject)NIL;
            if (NIL == module0656.f39930(var59)) {
                return module0656.f39789((SubLObject)$ic88$, var54, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
            }
            if (NIL != var56) {
                var60 = reader.read_from_string_ignoring_errors(var56, (SubLObject)NIL, (SubLObject)NIL, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                if (NIL == module0130.f8516(var60)) {
                    return module0656.f39789((SubLObject)$ic303$, var56, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                }
                if (NIL != var57) {
                    var61 = module0656.f39959(var57);
                    if (NIL == module0161.f10481(var61)) {
                        return module0656.f39789((SubLObject)$ic99$, var57, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                    }
                    if (NIL != var58) {
                        var62 = reader.read_from_string_ignoring_errors(var58, (SubLObject)NIL, (SubLObject)NIL, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                        if (NIL == module0130.f8503(var62)) {
                            return module0656.f39789((SubLObject)$ic304$, var58, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                        }
                    }
                }
            }
            final SubLObject var64;
            final SubLObject var63 = var64 = PrintLow.format((SubLObject)NIL, (SubLObject)$ic332$, var59);
            final SubLObject var65 = module0015.$g538$.currentBinding(var53);
            try {
                module0015.$g538$.bind((NIL != module0057.f4158(module0015.$g538$.getDynamicValue(var53))) ? module0015.$g538$.getDynamicValue(var53) : module0057.f4173((SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED), var53);
                module0642.f39020((SubLObject)$ic0$);
                module0642.f39029((SubLObject)UNPROVIDED);
                module0642.f39020(module0015.$g155$.getGlobalValue());
                module0642.f39020(module0015.$g153$.getGlobalValue());
                module0015.f718();
                module0655.f39766();
                module0642.f39064(module0655.$g5143$.getDynamicValue(var53), module0655.$g5142$.getDynamicValue(var53));
                final SubLObject var66 = module0014.f672((SubLObject)$ic1$);
                module0642.f39029((SubLObject)UNPROVIDED);
                module0642.f39020(module0015.$g175$.getGlobalValue());
                module0642.f39020(module0015.$g176$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                module0642.f39020((SubLObject)$ic2$);
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                if (NIL != var66) {
                    module0642.f39020(module0015.$g178$.getGlobalValue());
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                    module0642.f39020(var66);
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                }
                module0642.f39020(module0015.$g177$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                module0642.f39020((SubLObject)$ic3$);
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                if (NIL != var64) {
                    module0642.f39029((SubLObject)UNPROVIDED);
                    module0642.f39020(module0015.$g173$.getGlobalValue());
                    module0642.f39019(var64);
                    module0642.f39020(module0015.$g174$.getGlobalValue());
                }
                module0016.f941();
                module0642.f39020(module0015.$g154$.getGlobalValue());
                module0642.f39029((SubLObject)UNPROVIDED);
                final SubLObject var3_412 = module0015.$g535$.currentBinding(var53);
                try {
                    module0015.$g535$.bind((SubLObject)T, var53);
                    module0642.f39020(module0015.$g133$.getGlobalValue());
                    if (NIL != module0015.$g132$.getDynamicValue(var53)) {
                        module0642.f39020(module0015.$g135$.getGlobalValue());
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                        module0642.f39020(module0642.f39042(module0015.$g132$.getDynamicValue(var53)));
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                    }
                    module0642.f39020(module0015.$g137$.getGlobalValue());
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                    module0642.f39020((SubLObject)$ic150$);
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                    module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                    final SubLObject var3_413 = module0015.$g533$.currentBinding(var53);
                    try {
                        module0015.$g533$.bind((SubLObject)T, var53);
                        module0642.f39020(module0015.$g144$.getGlobalValue());
                        module0642.f39020(module0015.$g157$.getGlobalValue());
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                        module0642.f39020((SubLObject)$ic151$);
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                        final SubLObject var3_414 = module0015.$g533$.currentBinding(var53);
                        try {
                            module0015.$g533$.bind((SubLObject)T, var53);
                            module0642.f39020(module0015.$g295$.getGlobalValue());
                            module0642.f39020(module0015.$g305$.getGlobalValue());
                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                            module0642.f39020((SubLObject)$ic152$);
                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                            module0642.f39020(module0015.$g302$.getGlobalValue());
                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                            module0642.f39020((SubLObject)$ic153$);
                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                            module0642.f39020(module0015.$g307$.getGlobalValue());
                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                            module0642.f39019((SubLObject)$ic154$);
                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                            module0642.f39020(module0015.$g160$.getGlobalValue());
                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                            module0642.f39020((SubLObject)$ic155$);
                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                        }
                        finally {
                            module0015.$g533$.rebind(var3_414, var53);
                        }
                        module0642.f39020(module0015.$g145$.getGlobalValue());
                        f40722(var59);
                        module0642.f39026((SubLObject)TWO_INTEGER);
                        f40748(var59, var60, var61, var62);
                        module0642.f39029((SubLObject)UNPROVIDED);
                        module0642.f39050();
                    }
                    finally {
                        module0015.$g533$.rebind(var3_413, var53);
                    }
                    module0642.f39020(module0015.$g134$.getGlobalValue());
                    module0642.f39029((SubLObject)UNPROVIDED);
                }
                finally {
                    module0015.$g535$.rebind(var3_412, var53);
                }
                module0642.f39020(module0015.$g156$.getGlobalValue());
                module0642.f39029((SubLObject)UNPROVIDED);
            }
            finally {
                module0015.$g538$.rebind(var65, var53);
            }
        }
        else {
            cdestructuring_bind.cdestructuring_bind_error(var52, (SubLObject)$ic302$);
        }
        return (SubLObject)NIL;
    }

    public static SubLObject f40824(final SubLObject var1, final SubLObject var29, SubLObject var44, SubLObject var37, SubLObject var46) {
        if (var44 == UNPROVIDED) {
            var44 = (SubLObject)NIL;
        }
        if (var37 == UNPROVIDED) {
            var37 = (SubLObject)NIL;
        }
        if (var46 == UNPROVIDED) {
            var46 = (SubLObject)NIL;
        }
        final SubLThread var47 = SubLProcess.currentSubLThread();
        final SubLObject var48 = module0656.f39832((SubLObject)$ic48$);
        module0642.f39020(module0015.$g381$.getGlobalValue());
        module0642.f39020(module0015.$g383$.getGlobalValue());
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        module0655.f39768();
        PrintLow.format(module0015.$g131$.getDynamicValue(var47), (SubLObject)$ic334$, module0656.f39931(var1));
        if (NIL != var44) {
            PrintLow.format(module0015.$g131$.getDynamicValue(var47), (SubLObject)$ic308$, var44);
            if (NIL != var37) {
                PrintLow.format(module0015.$g131$.getDynamicValue(var47), (SubLObject)$ic244$, module0656.f39934(var37));
                if (NIL != var46) {
                    PrintLow.format(module0015.$g131$.getDynamicValue(var47), (SubLObject)$ic308$, var46);
                }
            }
        }
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        if (NIL != var48) {
            module0642.f39020(module0015.$g387$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
            module0642.f39020(var48);
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        }
        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
        final SubLObject var49 = module0015.$g533$.currentBinding(var47);
        try {
            module0015.$g533$.bind((SubLObject)T, var47);
            if (NIL != var46) {
                module0656.f39797(var46);
            }
            else if (NIL != var37) {
                module0656.f39964(var37);
            }
            else if (NIL != var44) {
                final SubLObject var50 = var44;
                if (var50.eql((SubLObject)$ic60$)) {
                    module0642.f39019((SubLObject)$ic309$);
                }
                else if (var50.eql((SubLObject)$ic61$)) {
                    module0642.f39019((SubLObject)$ic310$);
                }
                else {
                    module0642.f39019(var44);
                }
            }
            else {
                PrintLow.format(module0015.$g131$.getDynamicValue(var47), (SubLObject)$ic335$);
            }
        }
        finally {
            module0015.$g533$.rebind(var49, var47);
        }
        module0642.f39020(module0015.$g382$.getGlobalValue());
        if (var29.numG((SubLObject)ONE_INTEGER)) {
            PrintLow.format(module0015.$g131$.getDynamicValue(var47), (SubLObject)$ic219$, var29);
        }
        return var1;
    }

    public static SubLObject f40748(final SubLObject var1, final SubLObject var44, final SubLObject var37, final SubLObject var46) {
        final SubLThread var47 = SubLProcess.currentSubLThread();
        final SubLObject var48 = module0580.$g4361$.currentBinding(var47);
        try {
            module0580.$g4361$.bind((SubLObject)NIL, var47);
            var47.resetMultipleValues();
            final SubLObject var3_415 = module0580.$g4362$.currentBinding(var47);
            try {
                module0580.$g4362$.bind(module0580.f35560(), var47);
                final SubLObject var49 = var47.secondMultipleValue();
                var47.resetMultipleValues();
                try {
                    var47.resetMultipleValues();
                    final SubLObject var3_416 = module0580.$g4358$.currentBinding(var47);
                    try {
                        module0580.$g4358$.bind(module0580.f35544(), var47);
                        final SubLObject var50 = var47.secondMultipleValue();
                        var47.resetMultipleValues();
                        final SubLObject var3_417 = module0580.$g4359$.currentBinding(var47);
                        try {
                            module0580.$g4359$.bind(module0580.f35545(), var47);
                            final SubLObject var51 = module0580.$g4358$.getDynamicValue(var47);
                            final SubLObject var3_418 = module0034.$g879$.currentBinding(var47);
                            try {
                                module0034.$g879$.bind(var51, var47);
                                SubLObject var52 = (SubLObject)NIL;
                                if (NIL != var51 && NIL == module0034.f1842(var51)) {
                                    var52 = module0034.f1869(var51);
                                    final SubLObject var53 = Threads.current_process();
                                    if (NIL == var52) {
                                        module0034.f1873(var51, var53);
                                    }
                                    else if (!var52.eql(var53)) {
                                        Errors.error((SubLObject)$ic156$);
                                    }
                                }
                                try {
                                    final SubLObject var3_419 = module0579.$g4260$.currentBinding(var47);
                                    final SubLObject var54 = module0579.$g4259$.currentBinding(var47);
                                    final SubLObject var55 = module0656.$g5172$.currentBinding(var47);
                                    try {
                                        module0579.$g4260$.bind(module0677.f41312(), var47);
                                        module0579.$g4259$.bind((SubLObject)$ic157$, var47);
                                        module0656.$g5172$.bind(module0661.f40305(), var47);
                                        if (NIL == var44) {
                                            f40825(var1);
                                        }
                                        else if (NIL == var37) {
                                            f40826(var1, var44);
                                        }
                                        else {
                                            f40801(var44, (SubLObject)$ic337$);
                                            if (NIL == var46) {
                                                f40827(var1, var44, var37);
                                            }
                                            else {
                                                f40763(var37, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                                                f40828(var1, var44, var37, var46);
                                            }
                                        }
                                    }
                                    finally {
                                        module0656.$g5172$.rebind(var55, var47);
                                        module0579.$g4259$.rebind(var54, var47);
                                        module0579.$g4260$.rebind(var3_419, var47);
                                    }
                                }
                                finally {
                                    final SubLObject var3_420 = Threads.$is_thread_performing_cleanupP$.currentBinding(var47);
                                    try {
                                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)T, var47);
                                        if (NIL != var51 && NIL == var52) {
                                            module0034.f1873(var51, (SubLObject)NIL);
                                        }
                                    }
                                    finally {
                                        Threads.$is_thread_performing_cleanupP$.rebind(var3_420, var47);
                                    }
                                }
                            }
                            finally {
                                module0034.$g879$.rebind(var3_418, var47);
                            }
                        }
                        finally {
                            module0580.$g4359$.rebind(var3_417, var47);
                        }
                        if (var50 == $ic159$ && NIL != module0034.f1839(module0580.$g4358$.getDynamicValue(var47))) {
                            module0034.f1891(module0580.$g4358$.getDynamicValue(var47));
                        }
                    }
                    finally {
                        module0580.$g4358$.rebind(var3_416, var47);
                    }
                }
                finally {
                    final SubLObject var3_421 = Threads.$is_thread_performing_cleanupP$.currentBinding(var47);
                    try {
                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)T, var47);
                        if (NIL == var49) {
                            module0580.f35554(module0580.$g4362$.getDynamicValue(var47));
                        }
                    }
                    finally {
                        Threads.$is_thread_performing_cleanupP$.rebind(var3_421, var47);
                    }
                }
            }
            finally {
                module0580.$g4362$.rebind(var3_415, var47);
            }
        }
        finally {
            module0580.$g4361$.rebind(var48, var47);
        }
        return (SubLObject)NIL;
    }

    public static SubLObject f40825(final SubLObject var1) {
        SubLObject var2 = (SubLObject)NIL;
        SubLObject var3 = (SubLObject)$ic313$;
        SubLObject var4 = (SubLObject)NIL;
        var4 = var3.first();
        while (NIL != var3) {
            if (f40668(var1, var4, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED).numG((SubLObject)ZERO_INTEGER)) {
                if (NIL != var2) {
                    module0642.f39051((SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                }
                f40826(var1, var4);
                var2 = (SubLObject)T;
            }
            var3 = var3.rest();
            var4 = var3.first();
        }
        return (SubLObject)NIL;
    }

    public static SubLObject f40826(final SubLObject var1, final SubLObject var44) {
        f40801(var44, (SubLObject)$ic337$);
        SubLObject var46;
        final SubLObject var45 = var46 = f40670(var1, var44, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        SubLObject var47 = (SubLObject)NIL;
        var47 = var46.first();
        while (NIL != var46) {
            f40827(var1, var44, var47);
            var46 = var46.rest();
            var47 = var46.first();
        }
        return (SubLObject)NIL;
    }

    public static SubLObject f40827(final SubLObject var1, final SubLObject var44, final SubLObject var37) {
        f40763(var37, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        SubLObject var46;
        final SubLObject var45 = var46 = f40670(var1, var44, var37, (SubLObject)UNPROVIDED);
        SubLObject var47 = (SubLObject)NIL;
        var47 = var46.first();
        while (NIL != var46) {
            f40828(var1, var44, var37, var47);
            var46 = var46.rest();
            var47 = var46.first();
        }
        return (SubLObject)NIL;
    }

    public static SubLObject f40828(final SubLObject var1, final SubLObject var44, final SubLObject var37, final SubLObject var46) {
        final SubLThread var47 = SubLProcess.currentSubLThread();
        f40804(var46);
        final SubLObject var48 = (NIL != f40692(var1)) ? Symbols.symbol_function((SubLObject)$ic258$) : Symbols.symbol_function((SubLObject)$ic260$);
        final SubLObject var49 = module0655.$g5129$.currentBinding(var47);
        final SubLObject var50 = module0655.$g5130$.currentBinding(var47);
        try {
            module0655.$g5129$.bind((SubLObject)NIL, var47);
            module0655.$g5130$.bind((SubLObject)NIL, var47);
            module0219.f14485(var48, var1, var44, var46, var37);
        }
        finally {
            module0655.$g5130$.rebind(var50, var47);
            module0655.$g5129$.rebind(var49, var47);
        }
        return (SubLObject)NIL;
    }

    public static SubLObject f40829(final SubLObject var52) {
        final SubLThread var53 = SubLProcess.currentSubLThread();
        SubLObject var54 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var52, var52, (SubLObject)$ic302$);
        var54 = var52.first();
        SubLObject var55 = var52.rest();
        final SubLObject var56 = (SubLObject)(var55.isCons() ? var55.first() : NIL);
        cdestructuring_bind.destructuring_bind_must_listp(var55, var52, (SubLObject)$ic302$);
        var55 = var55.rest();
        final SubLObject var57 = (SubLObject)(var55.isCons() ? var55.first() : NIL);
        cdestructuring_bind.destructuring_bind_must_listp(var55, var52, (SubLObject)$ic302$);
        var55 = var55.rest();
        final SubLObject var58 = (SubLObject)(var55.isCons() ? var55.first() : NIL);
        cdestructuring_bind.destructuring_bind_must_listp(var55, var52, (SubLObject)$ic302$);
        var55 = var55.rest();
        if (NIL == var55) {
            final SubLObject var59 = module0656.f39969(var54);
            SubLObject var60 = (SubLObject)NIL;
            SubLObject var61 = (SubLObject)NIL;
            SubLObject var62 = (SubLObject)NIL;
            if (NIL == module0656.f39930(var59)) {
                return module0656.f39789((SubLObject)$ic88$, var54, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
            }
            if (NIL != var56) {
                var60 = reader.read_from_string_ignoring_errors(var56, (SubLObject)NIL, (SubLObject)NIL, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                if (NIL == module0130.f8516(var60)) {
                    return module0656.f39789((SubLObject)$ic303$, var56, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                }
                if (NIL != var57) {
                    var61 = module0656.f39959(var57);
                    if (NIL == module0161.f10481(var61)) {
                        return module0656.f39789((SubLObject)$ic99$, var57, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                    }
                    if (NIL != var58) {
                        var62 = reader.read_from_string_ignoring_errors(var58, (SubLObject)NIL, (SubLObject)NIL, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                        if (NIL == module0130.f8503(var62)) {
                            return module0656.f39789((SubLObject)$ic304$, var58, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                        }
                    }
                }
            }
            final SubLObject var64;
            final SubLObject var63 = var64 = PrintLow.format((SubLObject)NIL, (SubLObject)$ic338$, var59);
            final SubLObject var65 = module0015.$g538$.currentBinding(var53);
            try {
                module0015.$g538$.bind((NIL != module0057.f4158(module0015.$g538$.getDynamicValue(var53))) ? module0015.$g538$.getDynamicValue(var53) : module0057.f4173((SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED), var53);
                module0642.f39020((SubLObject)$ic0$);
                module0642.f39029((SubLObject)UNPROVIDED);
                module0642.f39020(module0015.$g155$.getGlobalValue());
                module0642.f39020(module0015.$g153$.getGlobalValue());
                module0015.f718();
                module0655.f39766();
                module0642.f39064(module0655.$g5143$.getDynamicValue(var53), module0655.$g5142$.getDynamicValue(var53));
                final SubLObject var66 = module0014.f672((SubLObject)$ic1$);
                module0642.f39029((SubLObject)UNPROVIDED);
                module0642.f39020(module0015.$g175$.getGlobalValue());
                module0642.f39020(module0015.$g176$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                module0642.f39020((SubLObject)$ic2$);
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                if (NIL != var66) {
                    module0642.f39020(module0015.$g178$.getGlobalValue());
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                    module0642.f39020(var66);
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                }
                module0642.f39020(module0015.$g177$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                module0642.f39020((SubLObject)$ic3$);
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                if (NIL != var64) {
                    module0642.f39029((SubLObject)UNPROVIDED);
                    module0642.f39020(module0015.$g173$.getGlobalValue());
                    module0642.f39019(var64);
                    module0642.f39020(module0015.$g174$.getGlobalValue());
                }
                module0016.f941();
                module0642.f39020(module0015.$g154$.getGlobalValue());
                module0642.f39029((SubLObject)UNPROVIDED);
                final SubLObject var3_424 = module0015.$g535$.currentBinding(var53);
                try {
                    module0015.$g535$.bind((SubLObject)T, var53);
                    module0642.f39020(module0015.$g133$.getGlobalValue());
                    if (NIL != module0015.$g132$.getDynamicValue(var53)) {
                        module0642.f39020(module0015.$g135$.getGlobalValue());
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                        module0642.f39020(module0642.f39042(module0015.$g132$.getDynamicValue(var53)));
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                    }
                    module0642.f39020(module0015.$g137$.getGlobalValue());
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                    module0642.f39020((SubLObject)$ic150$);
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                    module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                    final SubLObject var3_425 = module0015.$g533$.currentBinding(var53);
                    try {
                        module0015.$g533$.bind((SubLObject)T, var53);
                        module0642.f39020(module0015.$g144$.getGlobalValue());
                        module0642.f39020(module0015.$g157$.getGlobalValue());
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                        module0642.f39020((SubLObject)$ic151$);
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                        final SubLObject var3_426 = module0015.$g533$.currentBinding(var53);
                        try {
                            module0015.$g533$.bind((SubLObject)T, var53);
                            module0642.f39020(module0015.$g295$.getGlobalValue());
                            module0642.f39020(module0015.$g305$.getGlobalValue());
                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                            module0642.f39020((SubLObject)$ic152$);
                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                            module0642.f39020(module0015.$g302$.getGlobalValue());
                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                            module0642.f39020((SubLObject)$ic153$);
                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                            module0642.f39020(module0015.$g307$.getGlobalValue());
                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                            module0642.f39019((SubLObject)$ic154$);
                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                            module0642.f39020(module0015.$g160$.getGlobalValue());
                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                            module0642.f39020((SubLObject)$ic155$);
                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                        }
                        finally {
                            module0015.$g533$.rebind(var3_426, var53);
                        }
                        module0642.f39020(module0015.$g145$.getGlobalValue());
                        f40722(var59);
                        module0642.f39026((SubLObject)TWO_INTEGER);
                        f40749(var59, var60, var61, var62);
                        module0642.f39029((SubLObject)UNPROVIDED);
                        module0642.f39050();
                    }
                    finally {
                        module0015.$g533$.rebind(var3_425, var53);
                    }
                    module0642.f39020(module0015.$g134$.getGlobalValue());
                    module0642.f39029((SubLObject)UNPROVIDED);
                }
                finally {
                    module0015.$g535$.rebind(var3_424, var53);
                }
                module0642.f39020(module0015.$g156$.getGlobalValue());
                module0642.f39029((SubLObject)UNPROVIDED);
            }
            finally {
                module0015.$g538$.rebind(var65, var53);
            }
        }
        else {
            cdestructuring_bind.cdestructuring_bind_error(var52, (SubLObject)$ic302$);
        }
        return (SubLObject)NIL;
    }

    public static SubLObject f40830(final SubLObject var1, final SubLObject var29, SubLObject var44, SubLObject var37, SubLObject var46) {
        if (var44 == UNPROVIDED) {
            var44 = (SubLObject)NIL;
        }
        if (var37 == UNPROVIDED) {
            var37 = (SubLObject)NIL;
        }
        if (var46 == UNPROVIDED) {
            var46 = (SubLObject)NIL;
        }
        final SubLThread var47 = SubLProcess.currentSubLThread();
        final SubLObject var48 = module0656.f39832((SubLObject)$ic48$);
        module0642.f39020(module0015.$g381$.getGlobalValue());
        module0642.f39020(module0015.$g383$.getGlobalValue());
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        module0655.f39768();
        PrintLow.format(module0015.$g131$.getDynamicValue(var47), (SubLObject)$ic340$, module0656.f39931(var1));
        if (NIL != var44) {
            PrintLow.format(module0015.$g131$.getDynamicValue(var47), (SubLObject)$ic308$, var44);
            if (NIL != var37) {
                PrintLow.format(module0015.$g131$.getDynamicValue(var47), (SubLObject)$ic244$, module0656.f39934(var37));
                if (NIL != var46) {
                    PrintLow.format(module0015.$g131$.getDynamicValue(var47), (SubLObject)$ic308$, var46);
                }
            }
        }
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        if (NIL != var48) {
            module0642.f39020(module0015.$g387$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
            module0642.f39020(var48);
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        }
        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
        final SubLObject var49 = module0015.$g533$.currentBinding(var47);
        try {
            module0015.$g533$.bind((SubLObject)T, var47);
            if (NIL != var46) {
                module0656.f39797(var46);
            }
            else if (NIL != var37) {
                module0656.f39964(var37);
            }
            else if (NIL != var44) {
                final SubLObject var50 = var44;
                if (var50.eql((SubLObject)$ic60$)) {
                    module0642.f39019((SubLObject)$ic309$);
                }
                else if (var50.eql((SubLObject)$ic61$)) {
                    module0642.f39019((SubLObject)$ic310$);
                }
                else {
                    module0642.f39019(var44);
                }
            }
            else {
                PrintLow.format(module0015.$g131$.getDynamicValue(var47), (SubLObject)$ic341$);
            }
        }
        finally {
            module0015.$g533$.rebind(var49, var47);
        }
        module0642.f39020(module0015.$g382$.getGlobalValue());
        if (var29.numG((SubLObject)ONE_INTEGER)) {
            PrintLow.format(module0015.$g131$.getDynamicValue(var47), (SubLObject)$ic219$, var29);
        }
        return var1;
    }

    public static SubLObject f40749(final SubLObject var1, final SubLObject var44, final SubLObject var37, final SubLObject var46) {
        final SubLThread var47 = SubLProcess.currentSubLThread();
        final SubLObject var48 = module0580.$g4361$.currentBinding(var47);
        try {
            module0580.$g4361$.bind((SubLObject)NIL, var47);
            var47.resetMultipleValues();
            final SubLObject var3_427 = module0580.$g4362$.currentBinding(var47);
            try {
                module0580.$g4362$.bind(module0580.f35560(), var47);
                final SubLObject var49 = var47.secondMultipleValue();
                var47.resetMultipleValues();
                try {
                    var47.resetMultipleValues();
                    final SubLObject var3_428 = module0580.$g4358$.currentBinding(var47);
                    try {
                        module0580.$g4358$.bind(module0580.f35544(), var47);
                        final SubLObject var50 = var47.secondMultipleValue();
                        var47.resetMultipleValues();
                        final SubLObject var3_429 = module0580.$g4359$.currentBinding(var47);
                        try {
                            module0580.$g4359$.bind(module0580.f35545(), var47);
                            final SubLObject var51 = module0580.$g4358$.getDynamicValue(var47);
                            final SubLObject var3_430 = module0034.$g879$.currentBinding(var47);
                            try {
                                module0034.$g879$.bind(var51, var47);
                                SubLObject var52 = (SubLObject)NIL;
                                if (NIL != var51 && NIL == module0034.f1842(var51)) {
                                    var52 = module0034.f1869(var51);
                                    final SubLObject var53 = Threads.current_process();
                                    if (NIL == var52) {
                                        module0034.f1873(var51, var53);
                                    }
                                    else if (!var52.eql(var53)) {
                                        Errors.error((SubLObject)$ic156$);
                                    }
                                }
                                try {
                                    final SubLObject var3_431 = module0579.$g4260$.currentBinding(var47);
                                    final SubLObject var54 = module0579.$g4259$.currentBinding(var47);
                                    final SubLObject var55 = module0656.$g5172$.currentBinding(var47);
                                    try {
                                        module0579.$g4260$.bind(module0677.f41312(), var47);
                                        module0579.$g4259$.bind((SubLObject)$ic157$, var47);
                                        module0656.$g5172$.bind(module0661.f40305(), var47);
                                        if (NIL == var44) {
                                            f40831(var1);
                                        }
                                        else if (NIL == var37) {
                                            f40832(var1, var44);
                                        }
                                        else {
                                            f40801(var44, (SubLObject)$ic343$);
                                            if (NIL == var46) {
                                                f40833(var1, var44, var37);
                                            }
                                            else {
                                                f40763(var37, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                                                f40834(var1, var44, var37, var46);
                                            }
                                        }
                                    }
                                    finally {
                                        module0656.$g5172$.rebind(var55, var47);
                                        module0579.$g4259$.rebind(var54, var47);
                                        module0579.$g4260$.rebind(var3_431, var47);
                                    }
                                }
                                finally {
                                    final SubLObject var3_432 = Threads.$is_thread_performing_cleanupP$.currentBinding(var47);
                                    try {
                                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)T, var47);
                                        if (NIL != var51 && NIL == var52) {
                                            module0034.f1873(var51, (SubLObject)NIL);
                                        }
                                    }
                                    finally {
                                        Threads.$is_thread_performing_cleanupP$.rebind(var3_432, var47);
                                    }
                                }
                            }
                            finally {
                                module0034.$g879$.rebind(var3_430, var47);
                            }
                        }
                        finally {
                            module0580.$g4359$.rebind(var3_429, var47);
                        }
                        if (var50 == $ic159$ && NIL != module0034.f1839(module0580.$g4358$.getDynamicValue(var47))) {
                            module0034.f1891(module0580.$g4358$.getDynamicValue(var47));
                        }
                    }
                    finally {
                        module0580.$g4358$.rebind(var3_428, var47);
                    }
                }
                finally {
                    final SubLObject var3_433 = Threads.$is_thread_performing_cleanupP$.currentBinding(var47);
                    try {
                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)T, var47);
                        if (NIL == var49) {
                            module0580.f35554(module0580.$g4362$.getDynamicValue(var47));
                        }
                    }
                    finally {
                        Threads.$is_thread_performing_cleanupP$.rebind(var3_433, var47);
                    }
                }
            }
            finally {
                module0580.$g4362$.rebind(var3_427, var47);
            }
        }
        finally {
            module0580.$g4361$.rebind(var48, var47);
        }
        return (SubLObject)NIL;
    }

    public static SubLObject f40831(final SubLObject var1) {
        SubLObject var2 = (SubLObject)NIL;
        SubLObject var3 = (SubLObject)$ic313$;
        SubLObject var4 = (SubLObject)NIL;
        var4 = var3.first();
        while (NIL != var3) {
            if (f40673(var1, var4, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED).numG((SubLObject)ZERO_INTEGER)) {
                if (NIL != var2) {
                    module0642.f39051((SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                }
                f40832(var1, var4);
                var2 = (SubLObject)T;
            }
            var3 = var3.rest();
            var4 = var3.first();
        }
        return (SubLObject)NIL;
    }

    public static SubLObject f40832(final SubLObject var1, final SubLObject var44) {
        f40801(var44, (SubLObject)$ic343$);
        SubLObject var46;
        final SubLObject var45 = var46 = f40675(var1, var44, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        SubLObject var47 = (SubLObject)NIL;
        var47 = var46.first();
        while (NIL != var46) {
            f40833(var1, var44, var47);
            var46 = var46.rest();
            var47 = var46.first();
        }
        return (SubLObject)NIL;
    }

    public static SubLObject f40833(final SubLObject var1, final SubLObject var44, final SubLObject var37) {
        f40763(var37, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        SubLObject var46;
        final SubLObject var45 = var46 = f40675(var1, var44, var37, (SubLObject)UNPROVIDED);
        SubLObject var47 = (SubLObject)NIL;
        var47 = var46.first();
        while (NIL != var46) {
            f40834(var1, var44, var37, var47);
            var46 = var46.rest();
            var47 = var46.first();
        }
        return (SubLObject)NIL;
    }

    public static SubLObject f40834(final SubLObject var1, final SubLObject var44, final SubLObject var37, final SubLObject var46) {
        final SubLThread var47 = SubLProcess.currentSubLThread();
        f40804(var46);
        final SubLObject var48 = (NIL != f40692(var1)) ? Symbols.symbol_function((SubLObject)$ic258$) : Symbols.symbol_function((SubLObject)$ic260$);
        final SubLObject var49 = module0655.$g5129$.currentBinding(var47);
        final SubLObject var50 = module0655.$g5130$.currentBinding(var47);
        try {
            module0655.$g5129$.bind((SubLObject)NIL, var47);
            module0655.$g5130$.bind((SubLObject)NIL, var47);
            module0219.f14486(var48, var1, var44, var46, var37);
        }
        finally {
            module0655.$g5130$.rebind(var50, var47);
            module0655.$g5129$.rebind(var49, var47);
        }
        return (SubLObject)NIL;
    }

    public static SubLObject f40835(final SubLObject var52) {
        final SubLThread var53 = SubLProcess.currentSubLThread();
        SubLObject var54 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var52, var52, (SubLObject)$ic344$);
        var54 = var52.first();
        SubLObject var55 = var52.rest();
        final SubLObject var56 = (SubLObject)(var55.isCons() ? var55.first() : NIL);
        cdestructuring_bind.destructuring_bind_must_listp(var55, var52, (SubLObject)$ic344$);
        var55 = var55.rest();
        final SubLObject var57 = (SubLObject)(var55.isCons() ? var55.first() : NIL);
        cdestructuring_bind.destructuring_bind_must_listp(var55, var52, (SubLObject)$ic344$);
        var55 = var55.rest();
        if (NIL == var55) {
            final SubLObject var58 = module0656.f39969(var54);
            SubLObject var59 = (SubLObject)NIL;
            SubLObject var60 = (SubLObject)NIL;
            if (NIL == module0656.f39930(var58)) {
                return module0656.f39789((SubLObject)$ic88$, var54, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
            }
            if (NIL != var56) {
                var59 = module0656.f39959(var56);
                if (NIL == module0161.f10481(var59)) {
                    return module0656.f39789((SubLObject)$ic99$, var56, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                }
                if (NIL != var57) {
                    var60 = reader.read_from_string_ignoring_errors(var57, (SubLObject)NIL, (SubLObject)NIL, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                    if (NIL == module0130.f8503(var60)) {
                        return module0656.f39789((SubLObject)$ic304$, var57, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                    }
                }
            }
            final SubLObject var62;
            final SubLObject var61 = var62 = PrintLow.format((SubLObject)NIL, (SubLObject)$ic345$, var58);
            final SubLObject var63 = module0015.$g538$.currentBinding(var53);
            try {
                module0015.$g538$.bind((NIL != module0057.f4158(module0015.$g538$.getDynamicValue(var53))) ? module0015.$g538$.getDynamicValue(var53) : module0057.f4173((SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED), var53);
                module0642.f39020((SubLObject)$ic0$);
                module0642.f39029((SubLObject)UNPROVIDED);
                module0642.f39020(module0015.$g155$.getGlobalValue());
                module0642.f39020(module0015.$g153$.getGlobalValue());
                module0015.f718();
                module0655.f39766();
                module0642.f39064(module0655.$g5143$.getDynamicValue(var53), module0655.$g5142$.getDynamicValue(var53));
                final SubLObject var64 = module0014.f672((SubLObject)$ic1$);
                module0642.f39029((SubLObject)UNPROVIDED);
                module0642.f39020(module0015.$g175$.getGlobalValue());
                module0642.f39020(module0015.$g176$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                module0642.f39020((SubLObject)$ic2$);
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                if (NIL != var64) {
                    module0642.f39020(module0015.$g178$.getGlobalValue());
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                    module0642.f39020(var64);
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                }
                module0642.f39020(module0015.$g177$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                module0642.f39020((SubLObject)$ic3$);
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                if (NIL != var62) {
                    module0642.f39029((SubLObject)UNPROVIDED);
                    module0642.f39020(module0015.$g173$.getGlobalValue());
                    module0642.f39019(var62);
                    module0642.f39020(module0015.$g174$.getGlobalValue());
                }
                module0016.f941();
                module0642.f39020(module0015.$g154$.getGlobalValue());
                module0642.f39029((SubLObject)UNPROVIDED);
                final SubLObject var3_436 = module0015.$g535$.currentBinding(var53);
                try {
                    module0015.$g535$.bind((SubLObject)T, var53);
                    module0642.f39020(module0015.$g133$.getGlobalValue());
                    if (NIL != module0015.$g132$.getDynamicValue(var53)) {
                        module0642.f39020(module0015.$g135$.getGlobalValue());
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                        module0642.f39020(module0642.f39042(module0015.$g132$.getDynamicValue(var53)));
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                    }
                    module0642.f39020(module0015.$g137$.getGlobalValue());
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                    module0642.f39020((SubLObject)$ic150$);
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                    module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                    final SubLObject var3_437 = module0015.$g533$.currentBinding(var53);
                    try {
                        module0015.$g533$.bind((SubLObject)T, var53);
                        module0642.f39020(module0015.$g144$.getGlobalValue());
                        module0642.f39020(module0015.$g157$.getGlobalValue());
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                        module0642.f39020((SubLObject)$ic151$);
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                        final SubLObject var3_438 = module0015.$g533$.currentBinding(var53);
                        try {
                            module0015.$g533$.bind((SubLObject)T, var53);
                            module0642.f39020(module0015.$g295$.getGlobalValue());
                            module0642.f39020(module0015.$g305$.getGlobalValue());
                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                            module0642.f39020((SubLObject)$ic152$);
                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                            module0642.f39020(module0015.$g302$.getGlobalValue());
                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                            module0642.f39020((SubLObject)$ic153$);
                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                            module0642.f39020(module0015.$g307$.getGlobalValue());
                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                            module0642.f39019((SubLObject)$ic154$);
                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                            module0642.f39020(module0015.$g160$.getGlobalValue());
                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                            module0642.f39020((SubLObject)$ic155$);
                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                        }
                        finally {
                            module0015.$g533$.rebind(var3_438, var53);
                        }
                        module0642.f39020(module0015.$g145$.getGlobalValue());
                        f40722(var58);
                        module0642.f39026((SubLObject)TWO_INTEGER);
                        f40750(var58, var59, var60);
                        module0642.f39029((SubLObject)UNPROVIDED);
                        module0642.f39050();
                    }
                    finally {
                        module0015.$g533$.rebind(var3_437, var53);
                    }
                    module0642.f39020(module0015.$g134$.getGlobalValue());
                    module0642.f39029((SubLObject)UNPROVIDED);
                }
                finally {
                    module0015.$g535$.rebind(var3_436, var53);
                }
                module0642.f39020(module0015.$g156$.getGlobalValue());
                module0642.f39029((SubLObject)UNPROVIDED);
            }
            finally {
                module0015.$g538$.rebind(var63, var53);
            }
        }
        else {
            cdestructuring_bind.cdestructuring_bind_error(var52, (SubLObject)$ic344$);
        }
        return (SubLObject)NIL;
    }

    public static SubLObject f40836(final SubLObject var1, final SubLObject var29, SubLObject var37, SubLObject var46) {
        if (var37 == UNPROVIDED) {
            var37 = (SubLObject)NIL;
        }
        if (var46 == UNPROVIDED) {
            var46 = (SubLObject)NIL;
        }
        final SubLThread var47 = SubLProcess.currentSubLThread();
        final SubLObject var48 = module0656.f39832((SubLObject)$ic48$);
        module0642.f39020(module0015.$g381$.getGlobalValue());
        module0642.f39020(module0015.$g383$.getGlobalValue());
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        module0655.f39768();
        PrintLow.format(module0015.$g131$.getDynamicValue(var47), (SubLObject)$ic347$, module0656.f39931(var1));
        if (NIL != var37) {
            PrintLow.format(module0015.$g131$.getDynamicValue(var47), (SubLObject)$ic244$, module0656.f39934(var37));
            if (NIL != var46) {
                PrintLow.format(module0015.$g131$.getDynamicValue(var47), (SubLObject)$ic308$, var46);
            }
        }
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        if (NIL != var48) {
            module0642.f39020(module0015.$g387$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
            module0642.f39020(var48);
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        }
        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
        final SubLObject var49 = module0015.$g533$.currentBinding(var47);
        try {
            module0015.$g533$.bind((SubLObject)T, var47);
            if (NIL != var46) {
                module0656.f39797(var46);
            }
            else if (NIL != var37) {
                module0656.f39964(var37);
            }
            else {
                PrintLow.format(module0015.$g131$.getDynamicValue(var47), (SubLObject)$ic348$);
            }
        }
        finally {
            module0015.$g533$.rebind(var49, var47);
        }
        module0642.f39020(module0015.$g382$.getGlobalValue());
        if (var29.numG((SubLObject)ONE_INTEGER)) {
            PrintLow.format(module0015.$g131$.getDynamicValue(var47), (SubLObject)$ic219$, var29);
        }
        return var1;
    }

    public static SubLObject f40750(final SubLObject var1, final SubLObject var37, final SubLObject var46) {
        final SubLThread var47 = SubLProcess.currentSubLThread();
        module0642.f39020(module0015.$g234$.getGlobalValue());
        module0642.f39020(module0015.$g207$.getGlobalValue());
        f40783(var1);
        module0642.f39019((SubLObject)$ic350$);
        module0642.f39020(module0015.$g208$.getGlobalValue());
        module0642.f39020(module0015.$g235$.getGlobalValue());
        module0642.f39026((SubLObject)UNPROVIDED);
        final SubLObject var48 = module0580.$g4361$.currentBinding(var47);
        try {
            module0580.$g4361$.bind((SubLObject)NIL, var47);
            var47.resetMultipleValues();
            final SubLObject var3_439 = module0580.$g4362$.currentBinding(var47);
            try {
                module0580.$g4362$.bind(module0580.f35560(), var47);
                final SubLObject var49 = var47.secondMultipleValue();
                var47.resetMultipleValues();
                try {
                    var47.resetMultipleValues();
                    final SubLObject var3_440 = module0580.$g4358$.currentBinding(var47);
                    try {
                        module0580.$g4358$.bind(module0580.f35544(), var47);
                        final SubLObject var50 = var47.secondMultipleValue();
                        var47.resetMultipleValues();
                        final SubLObject var3_441 = module0580.$g4359$.currentBinding(var47);
                        try {
                            module0580.$g4359$.bind(module0580.f35545(), var47);
                            final SubLObject var51 = module0580.$g4358$.getDynamicValue(var47);
                            final SubLObject var3_442 = module0034.$g879$.currentBinding(var47);
                            try {
                                module0034.$g879$.bind(var51, var47);
                                SubLObject var52 = (SubLObject)NIL;
                                if (NIL != var51 && NIL == module0034.f1842(var51)) {
                                    var52 = module0034.f1869(var51);
                                    final SubLObject var53 = Threads.current_process();
                                    if (NIL == var52) {
                                        module0034.f1873(var51, var53);
                                    }
                                    else if (!var52.eql(var53)) {
                                        Errors.error((SubLObject)$ic156$);
                                    }
                                }
                                try {
                                    final SubLObject var3_443 = module0579.$g4260$.currentBinding(var47);
                                    final SubLObject var54 = module0579.$g4259$.currentBinding(var47);
                                    final SubLObject var55 = module0656.$g5172$.currentBinding(var47);
                                    try {
                                        module0579.$g4260$.bind(module0677.f41312(), var47);
                                        module0579.$g4259$.bind((SubLObject)$ic157$, var47);
                                        module0656.$g5172$.bind(module0661.f40305(), var47);
                                        if (NIL == var37) {
                                            f40837(var1);
                                        }
                                        else if (NIL == var46) {
                                            f40838(var1, var37);
                                        }
                                        else {
                                            f40763(var37, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                                            f40839(var1, var37, var46);
                                        }
                                    }
                                    finally {
                                        module0656.$g5172$.rebind(var55, var47);
                                        module0579.$g4259$.rebind(var54, var47);
                                        module0579.$g4260$.rebind(var3_443, var47);
                                    }
                                }
                                finally {
                                    final SubLObject var3_444 = Threads.$is_thread_performing_cleanupP$.currentBinding(var47);
                                    try {
                                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)T, var47);
                                        if (NIL != var51 && NIL == var52) {
                                            module0034.f1873(var51, (SubLObject)NIL);
                                        }
                                    }
                                    finally {
                                        Threads.$is_thread_performing_cleanupP$.rebind(var3_444, var47);
                                    }
                                }
                            }
                            finally {
                                module0034.$g879$.rebind(var3_442, var47);
                            }
                        }
                        finally {
                            module0580.$g4359$.rebind(var3_441, var47);
                        }
                        if (var50 == $ic159$ && NIL != module0034.f1839(module0580.$g4358$.getDynamicValue(var47))) {
                            module0034.f1891(module0580.$g4358$.getDynamicValue(var47));
                        }
                    }
                    finally {
                        module0580.$g4358$.rebind(var3_440, var47);
                    }
                }
                finally {
                    final SubLObject var3_445 = Threads.$is_thread_performing_cleanupP$.currentBinding(var47);
                    try {
                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)T, var47);
                        if (NIL == var49) {
                            module0580.f35554(module0580.$g4362$.getDynamicValue(var47));
                        }
                    }
                    finally {
                        Threads.$is_thread_performing_cleanupP$.rebind(var3_445, var47);
                    }
                }
            }
            finally {
                module0580.$g4362$.rebind(var3_439, var47);
            }
        }
        finally {
            module0580.$g4361$.rebind(var48, var47);
        }
        return (SubLObject)NIL;
    }

    public static SubLObject f40837(final SubLObject var1) {
        SubLObject var3;
        final SubLObject var2 = var3 = f40679(var1, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        SubLObject var4 = (SubLObject)NIL;
        var4 = var3.first();
        while (NIL != var3) {
            f40838(var1, var4);
            var3 = var3.rest();
            var4 = var3.first();
        }
        return (SubLObject)NIL;
    }

    public static SubLObject f40838(final SubLObject var1, final SubLObject var37) {
        f40763(var37, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        SubLObject var39;
        final SubLObject var38 = var39 = f40679(var1, var37, (SubLObject)UNPROVIDED);
        SubLObject var40 = (SubLObject)NIL;
        var40 = var39.first();
        while (NIL != var39) {
            f40839(var1, var37, var40);
            var39 = var39.rest();
            var40 = var39.first();
        }
        return (SubLObject)NIL;
    }

    public static SubLObject f40839(final SubLObject var1, final SubLObject var37, final SubLObject var46) {
        final SubLThread var47 = SubLProcess.currentSubLThread();
        f40804(var46);
        final SubLObject var48 = (NIL != f40692(var1)) ? Symbols.symbol_function((SubLObject)$ic258$) : Symbols.symbol_function((SubLObject)$ic260$);
        final SubLObject var49 = module0655.$g5129$.currentBinding(var47);
        final SubLObject var50 = module0655.$g5130$.currentBinding(var47);
        try {
            module0655.$g5129$.bind((SubLObject)NIL, var47);
            module0655.$g5130$.bind((SubLObject)NIL, var47);
            module0219.f14487(var48, var1, var46, var37);
        }
        finally {
            module0655.$g5130$.rebind(var50, var47);
            module0655.$g5129$.rebind(var49, var47);
        }
        return (SubLObject)NIL;
    }

    public static SubLObject f40840(final SubLObject var52) {
        final SubLThread var53 = SubLProcess.currentSubLThread();
        final SubLObject var54 = (SubLObject)(var52.isCons() ? var52.first() : NIL);
        cdestructuring_bind.destructuring_bind_must_listp(var52, var52, (SubLObject)$ic351$);
        SubLObject var55 = var52.rest();
        final SubLObject var56 = (SubLObject)(var55.isCons() ? var55.first() : NIL);
        cdestructuring_bind.destructuring_bind_must_listp(var55, var52, (SubLObject)$ic351$);
        var55 = var55.rest();
        final SubLObject var57 = (SubLObject)(var55.isCons() ? var55.first() : NIL);
        cdestructuring_bind.destructuring_bind_must_listp(var55, var52, (SubLObject)$ic351$);
        var55 = var55.rest();
        if (NIL == var55) {
            final SubLObject var58 = module0223.f14674();
            SubLObject var59 = (SubLObject)NIL;
            SubLObject var60 = (SubLObject)NIL;
            SubLObject var61 = (SubLObject)NIL;
            if (NIL == module0656.f39930(var58)) {
                return module0656.f39789((SubLObject)$ic352$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
            }
            if (NIL != var54) {
                var59 = reader.read_from_string_ignoring_errors(var54, (SubLObject)NIL, (SubLObject)NIL, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                if (NIL == module0130.f8516(var59)) {
                    return module0656.f39789((SubLObject)$ic303$, var54, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                }
                if (NIL != var56) {
                    var60 = module0656.f39959(var56);
                    if (NIL == module0161.f10481(var60)) {
                        return module0656.f39789((SubLObject)$ic99$, var56, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                    }
                    if (NIL != var57) {
                        var61 = reader.read_from_string_ignoring_errors(var57, (SubLObject)NIL, (SubLObject)NIL, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                        if (NIL == module0130.f8503(var61)) {
                            return module0656.f39789((SubLObject)$ic304$, var57, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                        }
                    }
                }
            }
            final SubLObject var63;
            final SubLObject var62 = var63 = PrintLow.format((SubLObject)NIL, (SubLObject)$ic353$);
            final SubLObject var64 = module0015.$g538$.currentBinding(var53);
            try {
                module0015.$g538$.bind((NIL != module0057.f4158(module0015.$g538$.getDynamicValue(var53))) ? module0015.$g538$.getDynamicValue(var53) : module0057.f4173((SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED), var53);
                module0642.f39020((SubLObject)$ic0$);
                module0642.f39029((SubLObject)UNPROVIDED);
                module0642.f39020(module0015.$g155$.getGlobalValue());
                module0642.f39020(module0015.$g153$.getGlobalValue());
                module0015.f718();
                module0655.f39766();
                module0642.f39064(module0655.$g5143$.getDynamicValue(var53), module0655.$g5142$.getDynamicValue(var53));
                final SubLObject var65 = module0014.f672((SubLObject)$ic1$);
                module0642.f39029((SubLObject)UNPROVIDED);
                module0642.f39020(module0015.$g175$.getGlobalValue());
                module0642.f39020(module0015.$g176$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                module0642.f39020((SubLObject)$ic2$);
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                if (NIL != var65) {
                    module0642.f39020(module0015.$g178$.getGlobalValue());
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                    module0642.f39020(var65);
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                }
                module0642.f39020(module0015.$g177$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                module0642.f39020((SubLObject)$ic3$);
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
                final SubLObject var3_448 = module0015.$g535$.currentBinding(var53);
                try {
                    module0015.$g535$.bind((SubLObject)T, var53);
                    module0642.f39020(module0015.$g133$.getGlobalValue());
                    if (NIL != module0015.$g132$.getDynamicValue(var53)) {
                        module0642.f39020(module0015.$g135$.getGlobalValue());
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                        module0642.f39020(module0642.f39042(module0015.$g132$.getDynamicValue(var53)));
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                    }
                    module0642.f39020(module0015.$g137$.getGlobalValue());
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                    module0642.f39020((SubLObject)$ic150$);
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                    module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                    final SubLObject var3_449 = module0015.$g533$.currentBinding(var53);
                    try {
                        module0015.$g533$.bind((SubLObject)T, var53);
                        module0642.f39020(module0015.$g144$.getGlobalValue());
                        module0642.f39020(module0015.$g157$.getGlobalValue());
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                        module0642.f39020((SubLObject)$ic151$);
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                        final SubLObject var3_450 = module0015.$g533$.currentBinding(var53);
                        try {
                            module0015.$g533$.bind((SubLObject)T, var53);
                            module0642.f39020(module0015.$g295$.getGlobalValue());
                            module0642.f39020(module0015.$g305$.getGlobalValue());
                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                            module0642.f39020((SubLObject)$ic152$);
                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                            module0642.f39020(module0015.$g302$.getGlobalValue());
                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                            module0642.f39020((SubLObject)$ic153$);
                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                            module0642.f39020(module0015.$g307$.getGlobalValue());
                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                            module0642.f39019((SubLObject)$ic154$);
                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                            module0642.f39020(module0015.$g160$.getGlobalValue());
                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                            module0642.f39020((SubLObject)$ic155$);
                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                        }
                        finally {
                            module0015.$g533$.rebind(var3_450, var53);
                        }
                        module0642.f39020(module0015.$g145$.getGlobalValue());
                        f40722(var58);
                        module0642.f39026((SubLObject)TWO_INTEGER);
                        f40841(var59, var60, var61);
                        module0642.f39029((SubLObject)UNPROVIDED);
                        module0642.f39050();
                    }
                    finally {
                        module0015.$g533$.rebind(var3_449, var53);
                    }
                    module0642.f39020(module0015.$g134$.getGlobalValue());
                    module0642.f39029((SubLObject)UNPROVIDED);
                }
                finally {
                    module0015.$g535$.rebind(var3_448, var53);
                }
                module0642.f39020(module0015.$g156$.getGlobalValue());
                module0642.f39029((SubLObject)UNPROVIDED);
            }
            finally {
                module0015.$g538$.rebind(var64, var53);
            }
        }
        else {
            cdestructuring_bind.cdestructuring_bind_error(var52, (SubLObject)$ic351$);
        }
        return (SubLObject)NIL;
    }

    public static SubLObject f40842(final SubLObject var29, SubLObject var44, SubLObject var37, SubLObject var46) {
        if (var44 == UNPROVIDED) {
            var44 = (SubLObject)NIL;
        }
        if (var37 == UNPROVIDED) {
            var37 = (SubLObject)NIL;
        }
        if (var46 == UNPROVIDED) {
            var46 = (SubLObject)NIL;
        }
        final SubLThread var47 = SubLProcess.currentSubLThread();
        final SubLObject var48 = module0656.f39832((SubLObject)$ic48$);
        module0642.f39020(module0015.$g381$.getGlobalValue());
        module0642.f39020(module0015.$g383$.getGlobalValue());
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        module0655.f39768();
        PrintLow.format(module0015.$g131$.getDynamicValue(var47), (SubLObject)$ic355$);
        if (NIL != var44) {
            PrintLow.format(module0015.$g131$.getDynamicValue(var47), (SubLObject)$ic308$, var44);
            if (NIL != var37) {
                PrintLow.format(module0015.$g131$.getDynamicValue(var47), (SubLObject)$ic244$, module0656.f39934(var37));
                if (NIL != var46) {
                    PrintLow.format(module0015.$g131$.getDynamicValue(var47), (SubLObject)$ic308$, var46);
                }
            }
        }
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        if (NIL != var48) {
            module0642.f39020(module0015.$g387$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
            module0642.f39020(var48);
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        }
        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
        final SubLObject var49 = module0015.$g533$.currentBinding(var47);
        try {
            module0015.$g533$.bind((SubLObject)T, var47);
            if (NIL != var46) {
                module0656.f39797(var46);
            }
            else if (NIL != var37) {
                module0656.f39964(var37);
            }
            else if (NIL != var44) {
                final SubLObject var50 = var44;
                if (var50.eql((SubLObject)$ic60$)) {
                    module0642.f39019((SubLObject)$ic309$);
                }
                else if (var50.eql((SubLObject)$ic61$)) {
                    module0642.f39019((SubLObject)$ic310$);
                }
                else {
                    module0642.f39019(var44);
                }
            }
            else {
                PrintLow.format(module0015.$g131$.getDynamicValue(var47), (SubLObject)$ic311$);
            }
        }
        finally {
            module0015.$g533$.rebind(var49, var47);
        }
        module0642.f39020(module0015.$g382$.getGlobalValue());
        if (var29.numG((SubLObject)ONE_INTEGER)) {
            PrintLow.format(module0015.$g131$.getDynamicValue(var47), (SubLObject)$ic219$, var29);
        }
        return module0223.f14674();
    }

    public static SubLObject f40841(final SubLObject var44, final SubLObject var37, final SubLObject var46) {
        final SubLThread var47 = SubLProcess.currentSubLThread();
        final SubLObject var48 = module0580.$g4361$.currentBinding(var47);
        try {
            module0580.$g4361$.bind((SubLObject)NIL, var47);
            var47.resetMultipleValues();
            final SubLObject var3_451 = module0580.$g4362$.currentBinding(var47);
            try {
                module0580.$g4362$.bind(module0580.f35560(), var47);
                final SubLObject var49 = var47.secondMultipleValue();
                var47.resetMultipleValues();
                try {
                    var47.resetMultipleValues();
                    final SubLObject var3_452 = module0580.$g4358$.currentBinding(var47);
                    try {
                        module0580.$g4358$.bind(module0580.f35544(), var47);
                        final SubLObject var50 = var47.secondMultipleValue();
                        var47.resetMultipleValues();
                        final SubLObject var3_453 = module0580.$g4359$.currentBinding(var47);
                        try {
                            module0580.$g4359$.bind(module0580.f35545(), var47);
                            final SubLObject var51 = module0580.$g4358$.getDynamicValue(var47);
                            final SubLObject var3_454 = module0034.$g879$.currentBinding(var47);
                            try {
                                module0034.$g879$.bind(var51, var47);
                                SubLObject var52 = (SubLObject)NIL;
                                if (NIL != var51 && NIL == module0034.f1842(var51)) {
                                    var52 = module0034.f1869(var51);
                                    final SubLObject var53 = Threads.current_process();
                                    if (NIL == var52) {
                                        module0034.f1873(var51, var53);
                                    }
                                    else if (!var52.eql(var53)) {
                                        Errors.error((SubLObject)$ic156$);
                                    }
                                }
                                try {
                                    final SubLObject var3_455 = module0579.$g4260$.currentBinding(var47);
                                    final SubLObject var54 = module0579.$g4259$.currentBinding(var47);
                                    final SubLObject var55 = module0656.$g5172$.currentBinding(var47);
                                    try {
                                        module0579.$g4260$.bind(module0677.f41312(), var47);
                                        module0579.$g4259$.bind((SubLObject)$ic157$, var47);
                                        module0656.$g5172$.bind(module0661.f40305(), var47);
                                        if (NIL == var44) {
                                            f40843();
                                        }
                                        else if (NIL == var37) {
                                            f40844(var44);
                                        }
                                        else {
                                            f40801(var44, (SubLObject)UNPROVIDED);
                                            if (NIL == var46) {
                                                f40845(var44, var37);
                                            }
                                            else {
                                                f40763(var37, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                                                f40846(var44, var37, var46);
                                            }
                                        }
                                    }
                                    finally {
                                        module0656.$g5172$.rebind(var55, var47);
                                        module0579.$g4259$.rebind(var54, var47);
                                        module0579.$g4260$.rebind(var3_455, var47);
                                    }
                                }
                                finally {
                                    final SubLObject var3_456 = Threads.$is_thread_performing_cleanupP$.currentBinding(var47);
                                    try {
                                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)T, var47);
                                        if (NIL != var51 && NIL == var52) {
                                            module0034.f1873(var51, (SubLObject)NIL);
                                        }
                                    }
                                    finally {
                                        Threads.$is_thread_performing_cleanupP$.rebind(var3_456, var47);
                                    }
                                }
                            }
                            finally {
                                module0034.$g879$.rebind(var3_454, var47);
                            }
                        }
                        finally {
                            module0580.$g4359$.rebind(var3_453, var47);
                        }
                        if (var50 == $ic159$ && NIL != module0034.f1839(module0580.$g4358$.getDynamicValue(var47))) {
                            module0034.f1891(module0580.$g4358$.getDynamicValue(var47));
                        }
                    }
                    finally {
                        module0580.$g4358$.rebind(var3_452, var47);
                    }
                }
                finally {
                    final SubLObject var3_457 = Threads.$is_thread_performing_cleanupP$.currentBinding(var47);
                    try {
                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)T, var47);
                        if (NIL == var49) {
                            module0580.f35554(module0580.$g4362$.getDynamicValue(var47));
                        }
                    }
                    finally {
                        Threads.$is_thread_performing_cleanupP$.rebind(var3_457, var47);
                    }
                }
            }
            finally {
                module0580.$g4362$.rebind(var3_451, var47);
            }
        }
        finally {
            module0580.$g4361$.rebind(var48, var47);
        }
        return (SubLObject)NIL;
    }

    public static SubLObject f40843() {
        SubLObject var373 = (SubLObject)NIL;
        SubLObject var374 = (SubLObject)$ic313$;
        SubLObject var375 = (SubLObject)NIL;
        var375 = var374.first();
        while (NIL != var374) {
            if (f40682(var375, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED).numG((SubLObject)ZERO_INTEGER)) {
                if (NIL != var373) {
                    module0642.f39051((SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                }
                f40844(var375);
                var373 = (SubLObject)T;
            }
            var374 = var374.rest();
            var375 = var374.first();
        }
        return (SubLObject)NIL;
    }

    public static SubLObject f40844(final SubLObject var44) {
        f40801(var44, (SubLObject)UNPROVIDED);
        SubLObject var46;
        final SubLObject var45 = var46 = f40684(var44, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        SubLObject var47 = (SubLObject)NIL;
        var47 = var46.first();
        while (NIL != var46) {
            f40845(var44, var47);
            var46 = var46.rest();
            var47 = var46.first();
        }
        return (SubLObject)NIL;
    }

    public static SubLObject f40845(final SubLObject var44, final SubLObject var37) {
        f40763(var37, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        SubLObject var46;
        final SubLObject var45 = var46 = f40684(var44, var37, (SubLObject)UNPROVIDED);
        SubLObject var47 = (SubLObject)NIL;
        var47 = var46.first();
        while (NIL != var46) {
            f40846(var44, var37, var47);
            var46 = var46.rest();
            var47 = var46.first();
        }
        return (SubLObject)NIL;
    }

    public static SubLObject f40846(final SubLObject var44, final SubLObject var37, final SubLObject var46) {
        final SubLThread var47 = SubLProcess.currentSubLThread();
        f40804(var46);
        final SubLObject var48 = (NIL != f40692(module0223.f14674())) ? Symbols.symbol_function((SubLObject)$ic258$) : Symbols.symbol_function((SubLObject)$ic260$);
        final SubLObject var49 = module0655.$g5129$.currentBinding(var47);
        final SubLObject var50 = module0655.$g5130$.currentBinding(var47);
        try {
            module0655.$g5129$.bind((SubLObject)NIL, var47);
            module0655.$g5130$.bind((SubLObject)NIL, var47);
            module0223.f14682(var48, var44, var37, var46);
        }
        finally {
            module0655.$g5130$.rebind(var50, var47);
            module0655.$g5129$.rebind(var49, var47);
        }
        return (SubLObject)NIL;
    }

    public static SubLObject f40801(final SubLObject var44, SubLObject var458) {
        if (var458 == UNPROVIDED) {
            var458 = (SubLObject)NIL;
        }
        module0642.f39020(module0015.$g207$.getGlobalValue());
        module0642.f39020(module0015.$g234$.getGlobalValue());
        if (NIL != var458) {
            module0642.f39019(var458);
            module0642.f39019((SubLObject)$ic357$);
        }
        if (var44.eql((SubLObject)$ic60$)) {
            module0642.f39019((SubLObject)$ic358$);
        }
        else if (var44.eql((SubLObject)$ic61$)) {
            module0642.f39019((SubLObject)$ic359$);
        }
        else {
            module0642.f39019(var44);
        }
        module0642.f39020(module0015.$g235$.getGlobalValue());
        module0642.f39020(module0015.$g208$.getGlobalValue());
        module0642.f39026((SubLObject)UNPROVIDED);
        return (SubLObject)NIL;
    }

    public static SubLObject f40804(final SubLObject var46) {
        module0642.f39020(module0015.$g234$.getGlobalValue());
        module0642.f39019((SubLObject)$ic360$);
        module0656.f39797(var46);
        module0642.f39020(module0015.$g235$.getGlobalValue());
        module0642.f39026((SubLObject)UNPROVIDED);
        return (SubLObject)NIL;
    }

    public static SubLObject f40847(final SubLObject var52) {
        final SubLThread var53 = SubLProcess.currentSubLThread();
        SubLObject var54 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var52, var52, (SubLObject)$ic87$);
        var54 = var52.first();
        final SubLObject var55 = var52.rest();
        if (NIL == var55) {
            final SubLObject var56 = module0656.f39957(var54, (SubLObject)UNPROVIDED);
            if (NIL == module0161.f10481(var56)) {
                return module0656.f39789((SubLObject)$ic99$, var54, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
            }
            final SubLObject var58;
            final SubLObject var57 = var58 = PrintLow.format((SubLObject)NIL, (SubLObject)$ic361$, var56);
            final SubLObject var59 = module0015.$g538$.currentBinding(var53);
            try {
                module0015.$g538$.bind((NIL != module0057.f4158(module0015.$g538$.getDynamicValue(var53))) ? module0015.$g538$.getDynamicValue(var53) : module0057.f4173((SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED), var53);
                module0642.f39020((SubLObject)$ic0$);
                module0642.f39029((SubLObject)UNPROVIDED);
                module0642.f39020(module0015.$g155$.getGlobalValue());
                module0642.f39020(module0015.$g153$.getGlobalValue());
                module0015.f718();
                module0655.f39766();
                module0642.f39064(module0655.$g5143$.getDynamicValue(var53), module0655.$g5142$.getDynamicValue(var53));
                final SubLObject var60 = module0014.f672((SubLObject)$ic1$);
                module0642.f39029((SubLObject)UNPROVIDED);
                module0642.f39020(module0015.$g175$.getGlobalValue());
                module0642.f39020(module0015.$g176$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                module0642.f39020((SubLObject)$ic2$);
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                if (NIL != var60) {
                    module0642.f39020(module0015.$g178$.getGlobalValue());
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                    module0642.f39020(var60);
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                }
                module0642.f39020(module0015.$g177$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                module0642.f39020((SubLObject)$ic3$);
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                if (NIL != var58) {
                    module0642.f39029((SubLObject)UNPROVIDED);
                    module0642.f39020(module0015.$g173$.getGlobalValue());
                    module0642.f39019(var58);
                    module0642.f39020(module0015.$g174$.getGlobalValue());
                }
                module0016.f941();
                module0642.f39020(module0015.$g154$.getGlobalValue());
                module0642.f39029((SubLObject)UNPROVIDED);
                final SubLObject var3_461 = module0015.$g535$.currentBinding(var53);
                try {
                    module0015.$g535$.bind((SubLObject)T, var53);
                    module0642.f39020(module0015.$g133$.getGlobalValue());
                    if (NIL != module0015.$g132$.getDynamicValue(var53)) {
                        module0642.f39020(module0015.$g135$.getGlobalValue());
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                        module0642.f39020(module0642.f39042(module0015.$g132$.getDynamicValue(var53)));
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                    }
                    module0642.f39020(module0015.$g137$.getGlobalValue());
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                    module0642.f39020((SubLObject)$ic150$);
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                    module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                    final SubLObject var3_462 = module0015.$g533$.currentBinding(var53);
                    try {
                        module0015.$g533$.bind((SubLObject)T, var53);
                        module0642.f39020(module0015.$g144$.getGlobalValue());
                        module0642.f39020(module0015.$g157$.getGlobalValue());
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                        module0642.f39020((SubLObject)$ic151$);
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                        final SubLObject var3_463 = module0015.$g533$.currentBinding(var53);
                        try {
                            module0015.$g533$.bind((SubLObject)T, var53);
                            module0642.f39020(module0015.$g295$.getGlobalValue());
                            module0642.f39020(module0015.$g305$.getGlobalValue());
                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                            module0642.f39020((SubLObject)$ic152$);
                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                            module0642.f39020(module0015.$g302$.getGlobalValue());
                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                            module0642.f39020((SubLObject)$ic153$);
                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                            module0642.f39020(module0015.$g307$.getGlobalValue());
                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                            module0642.f39019((SubLObject)$ic154$);
                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                            module0642.f39020(module0015.$g160$.getGlobalValue());
                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                            module0642.f39020((SubLObject)$ic155$);
                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                        }
                        finally {
                            module0015.$g533$.rebind(var3_463, var53);
                        }
                        module0642.f39020(module0015.$g145$.getGlobalValue());
                        f40722(var56);
                        module0642.f39026((SubLObject)TWO_INTEGER);
                        f40752(var56);
                        module0642.f39029((SubLObject)UNPROVIDED);
                        module0642.f39050();
                    }
                    finally {
                        module0015.$g533$.rebind(var3_462, var53);
                    }
                    module0642.f39020(module0015.$g134$.getGlobalValue());
                    module0642.f39029((SubLObject)UNPROVIDED);
                }
                finally {
                    module0015.$g535$.rebind(var3_461, var53);
                }
                module0642.f39020(module0015.$g156$.getGlobalValue());
                module0642.f39029((SubLObject)UNPROVIDED);
            }
            finally {
                module0015.$g538$.rebind(var59, var53);
            }
        }
        else {
            cdestructuring_bind.cdestructuring_bind_error(var52, (SubLObject)$ic87$);
        }
        return (SubLObject)NIL;
    }

    public static SubLObject f40848(final SubLObject var1, final SubLObject var29) {
        final SubLThread var30 = SubLProcess.currentSubLThread();
        final SubLObject var31 = module0656.f39832((SubLObject)$ic48$);
        module0642.f39020(module0015.$g381$.getGlobalValue());
        module0642.f39020(module0015.$g383$.getGlobalValue());
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        module0655.f39768();
        PrintLow.format(module0015.$g131$.getDynamicValue(var30), (SubLObject)$ic363$, module0656.f39931(var1));
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        if (NIL != var31) {
            module0642.f39020(module0015.$g387$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
            module0642.f39020(var31);
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        }
        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
        final SubLObject var32 = module0015.$g533$.currentBinding(var30);
        try {
            module0015.$g533$.bind((SubLObject)T, var30);
            module0642.f39019((SubLObject)$ic364$);
        }
        finally {
            module0015.$g533$.rebind(var32, var30);
        }
        module0642.f39020(module0015.$g382$.getGlobalValue());
        if (var29.numG((SubLObject)ONE_INTEGER)) {
            PrintLow.format(module0015.$g131$.getDynamicValue(var30), (SubLObject)$ic219$, var29);
        }
        return var1;
    }

    public static SubLObject f40849(final SubLObject var1) {
        final SubLThread var2 = SubLProcess.currentSubLThread();
        final SubLObject var3 = module0656.f39832((SubLObject)$ic48$);
        module0642.f39020(module0015.$g381$.getGlobalValue());
        module0642.f39020(module0015.$g383$.getGlobalValue());
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        module0655.f39768();
        PrintLow.format(module0015.$g131$.getDynamicValue(var2), (SubLObject)$ic363$, module0656.f39931(var1));
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        if (NIL != var3) {
            module0642.f39020(module0015.$g387$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
            module0642.f39020(var3);
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        }
        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
        final SubLObject var4 = module0015.$g533$.currentBinding(var2);
        try {
            module0015.$g533$.bind((SubLObject)T, var2);
            module0642.f39019((SubLObject)$ic364$);
        }
        finally {
            module0015.$g533$.rebind(var4, var2);
        }
        module0642.f39020(module0015.$g382$.getGlobalValue());
        module0642.f39019((SubLObject)$ic366$);
        return var1;
    }

    public static SubLObject f40752(final SubLObject var1) {
        final SubLThread var2 = SubLProcess.currentSubLThread();
        module0642.f39020(module0015.$g234$.getGlobalValue());
        module0642.f39020(module0015.$g207$.getGlobalValue());
        module0642.f39019((SubLObject)$ic368$);
        module0642.f39020(module0015.$g208$.getGlobalValue());
        module0642.f39020(module0015.$g235$.getGlobalValue());
        module0642.f39026((SubLObject)TWO_INTEGER);
        final SubLObject var3 = (NIL != f40692(var1)) ? Symbols.symbol_function((SubLObject)$ic258$) : Symbols.symbol_function((SubLObject)$ic260$);
        final SubLObject var4 = module0655.$g5129$.currentBinding(var2);
        final SubLObject var5 = module0655.$g5130$.currentBinding(var2);
        final SubLObject var6 = module0147.$g2094$.currentBinding(var2);
        final SubLObject var7 = module0147.$g2095$.currentBinding(var2);
        try {
            module0655.$g5129$.bind((SubLObject)NIL, var2);
            module0655.$g5130$.bind((SubLObject)NIL, var2);
            module0147.$g2094$.bind((SubLObject)$ic134$, var2);
            module0147.$g2095$.bind($ic135$, var2);
            if (NIL != module0161.f10489(var1)) {
                module0219.f14500(var3, var1, (SubLObject)NIL, (SubLObject)NIL);
            }
            else {
                module0219.f14496(var3, var1, (SubLObject)NIL, (SubLObject)NIL);
            }
        }
        finally {
            module0147.$g2095$.rebind(var7, var2);
            module0147.$g2094$.rebind(var6, var2);
            module0655.$g5130$.rebind(var5, var2);
            module0655.$g5129$.rebind(var4, var2);
        }
        return (SubLObject)NIL;
    }

    public static SubLObject f40850(final SubLObject var52) {
        final SubLThread var53 = SubLProcess.currentSubLThread();
        SubLObject var54 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var52, var52, (SubLObject)$ic87$);
        var54 = var52.first();
        final SubLObject var55 = var52.rest();
        if (NIL == var55) {
            final SubLObject var56 = module0656.f39957(var54, (SubLObject)UNPROVIDED);
            if (NIL == module0161.f10481(var56)) {
                return module0656.f39789((SubLObject)$ic99$, var54, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
            }
            final SubLObject var58;
            final SubLObject var57 = var58 = PrintLow.format((SubLObject)NIL, (SubLObject)$ic369$, var56);
            final SubLObject var59 = module0015.$g538$.currentBinding(var53);
            try {
                module0015.$g538$.bind((NIL != module0057.f4158(module0015.$g538$.getDynamicValue(var53))) ? module0015.$g538$.getDynamicValue(var53) : module0057.f4173((SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED), var53);
                module0642.f39020((SubLObject)$ic0$);
                module0642.f39029((SubLObject)UNPROVIDED);
                module0642.f39020(module0015.$g155$.getGlobalValue());
                module0642.f39020(module0015.$g153$.getGlobalValue());
                module0015.f718();
                module0655.f39766();
                module0642.f39064(module0655.$g5143$.getDynamicValue(var53), module0655.$g5142$.getDynamicValue(var53));
                final SubLObject var60 = module0014.f672((SubLObject)$ic1$);
                module0642.f39029((SubLObject)UNPROVIDED);
                module0642.f39020(module0015.$g175$.getGlobalValue());
                module0642.f39020(module0015.$g176$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                module0642.f39020((SubLObject)$ic2$);
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                if (NIL != var60) {
                    module0642.f39020(module0015.$g178$.getGlobalValue());
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                    module0642.f39020(var60);
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                }
                module0642.f39020(module0015.$g177$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                module0642.f39020((SubLObject)$ic3$);
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                if (NIL != var58) {
                    module0642.f39029((SubLObject)UNPROVIDED);
                    module0642.f39020(module0015.$g173$.getGlobalValue());
                    module0642.f39019(var58);
                    module0642.f39020(module0015.$g174$.getGlobalValue());
                }
                module0016.f941();
                module0642.f39020(module0015.$g154$.getGlobalValue());
                module0642.f39029((SubLObject)UNPROVIDED);
                final SubLObject var3_466 = module0015.$g535$.currentBinding(var53);
                try {
                    module0015.$g535$.bind((SubLObject)T, var53);
                    module0642.f39020(module0015.$g133$.getGlobalValue());
                    if (NIL != module0015.$g132$.getDynamicValue(var53)) {
                        module0642.f39020(module0015.$g135$.getGlobalValue());
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                        module0642.f39020(module0642.f39042(module0015.$g132$.getDynamicValue(var53)));
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                    }
                    module0642.f39020(module0015.$g137$.getGlobalValue());
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                    module0642.f39020((SubLObject)$ic150$);
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                    module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                    final SubLObject var3_467 = module0015.$g533$.currentBinding(var53);
                    try {
                        module0015.$g533$.bind((SubLObject)T, var53);
                        module0642.f39020(module0015.$g144$.getGlobalValue());
                        module0642.f39020(module0015.$g157$.getGlobalValue());
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                        module0642.f39020((SubLObject)$ic151$);
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                        final SubLObject var3_468 = module0015.$g533$.currentBinding(var53);
                        try {
                            module0015.$g533$.bind((SubLObject)T, var53);
                            module0642.f39020(module0015.$g295$.getGlobalValue());
                            module0642.f39020(module0015.$g305$.getGlobalValue());
                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                            module0642.f39020((SubLObject)$ic152$);
                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                            module0642.f39020(module0015.$g302$.getGlobalValue());
                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                            module0642.f39020((SubLObject)$ic153$);
                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                            module0642.f39020(module0015.$g307$.getGlobalValue());
                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                            module0642.f39019((SubLObject)$ic154$);
                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                            module0642.f39020(module0015.$g160$.getGlobalValue());
                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                            module0642.f39020((SubLObject)$ic155$);
                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                        }
                        finally {
                            module0015.$g533$.rebind(var3_468, var53);
                        }
                        module0642.f39020(module0015.$g145$.getGlobalValue());
                        f40722(var56);
                        module0642.f39026((SubLObject)TWO_INTEGER);
                        f40851(var56);
                        module0642.f39029((SubLObject)UNPROVIDED);
                        module0642.f39050();
                    }
                    finally {
                        module0015.$g533$.rebind(var3_467, var53);
                    }
                    module0642.f39020(module0015.$g134$.getGlobalValue());
                    module0642.f39029((SubLObject)UNPROVIDED);
                }
                finally {
                    module0015.$g535$.rebind(var3_466, var53);
                }
                module0642.f39020(module0015.$g156$.getGlobalValue());
                module0642.f39029((SubLObject)UNPROVIDED);
            }
            finally {
                module0015.$g538$.rebind(var59, var53);
            }
        }
        else {
            cdestructuring_bind.cdestructuring_bind_error(var52, (SubLObject)$ic87$);
        }
        return (SubLObject)NIL;
    }

    public static SubLObject f40852(final SubLObject var37) {
        final SubLThread var38 = SubLProcess.currentSubLThread();
        final SubLObject var39 = module0656.f39832((SubLObject)$ic48$);
        module0642.f39020(module0015.$g381$.getGlobalValue());
        module0642.f39020(module0015.$g383$.getGlobalValue());
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        module0655.f39768();
        PrintLow.format(module0015.$g131$.getDynamicValue(var38), (SubLObject)$ic371$, module0656.f39931(var37));
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        if (NIL != var39) {
            module0642.f39020(module0015.$g387$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
            module0642.f39020(var39);
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        }
        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
        final SubLObject var40 = module0015.$g533$.currentBinding(var38);
        try {
            module0015.$g533$.bind((SubLObject)T, var38);
            module0642.f39019((SubLObject)$ic372$);
        }
        finally {
            module0015.$g533$.rebind(var40, var38);
        }
        module0642.f39020(module0015.$g382$.getGlobalValue());
        module0642.f39019((SubLObject)$ic373$);
        return (SubLObject)NIL;
    }

    public static SubLObject f40851(final SubLObject var37) {
        final SubLThread var38 = SubLProcess.currentSubLThread();
        module0642.f39020(module0015.$g234$.getGlobalValue());
        module0642.f39020(module0015.$g207$.getGlobalValue());
        module0642.f39019((SubLObject)$ic375$);
        module0642.f39020(module0015.$g208$.getGlobalValue());
        module0642.f39020(module0015.$g235$.getGlobalValue());
        module0642.f39026((SubLObject)UNPROVIDED);
        final SubLObject var39 = (NIL != module0161.f10489(var37)) ? f40853(var37) : f40854(var37);
        final SubLObject var40 = (NIL != f40692(var37)) ? Symbols.symbol_function((SubLObject)$ic258$) : Symbols.symbol_function((SubLObject)$ic260$);
        final SubLObject var41 = module0655.$g5129$.currentBinding(var38);
        final SubLObject var42 = module0655.$g5130$.currentBinding(var38);
        try {
            module0655.$g5129$.bind((SubLObject)NIL, var38);
            module0655.$g5130$.bind((SubLObject)NIL, var38);
            SubLObject var43 = (SubLObject)NIL;
            SubLObject var44 = var39;
            SubLObject var45 = (SubLObject)NIL;
            var45 = var44.first();
            while (NIL != var44) {
                final SubLObject var46 = module0178.f11334(var45);
                if (!var46.eql(var43)) {
                    module0642.f39026((SubLObject)UNPROVIDED);
                }
                var43 = var46;
                Functions.funcall(var40, var45);
                var44 = var44.rest();
                var45 = var44.first();
            }
        }
        finally {
            module0655.$g5130$.rebind(var42, var38);
            module0655.$g5129$.rebind(var41, var38);
        }
        return (SubLObject)NIL;
    }

    public static SubLObject f40854(final SubLObject var37) {
        final SubLThread var38 = SubLProcess.currentSubLThread();
        SubLObject var39 = (SubLObject)NIL;
        final SubLObject var40 = module0158.f10289(var37);
        if (var40.eql((SubLObject)$ic376$)) {
            if (NIL != module0158.f10270(var37, (SubLObject)$ic377$)) {
                final SubLObject var41 = module0158.f10271(var37);
                SubLObject var42 = (SubLObject)NIL;
                try {
                    var42 = module0158.f10316(var41, (SubLObject)$ic377$, (SubLObject)NIL, (SubLObject)NIL);
                    SubLObject var43 = (SubLObject)NIL;
                    final SubLObject var44 = (SubLObject)NIL;
                    while (NIL == var43) {
                        final SubLObject var45 = module0052.f3695(var42, var44);
                        final SubLObject var46 = (SubLObject)makeBoolean(!var44.eql(var45));
                        if (NIL != var46) {
                            var39 = (SubLObject)ConsesLow.cons(var45, var39);
                        }
                        var43 = (SubLObject)makeBoolean(NIL == var46);
                    }
                }
                finally {
                    final SubLObject var47 = Threads.$is_thread_performing_cleanupP$.currentBinding(var38);
                    try {
                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)T, var38);
                        if (NIL != var42) {
                            module0158.f10319(var42);
                        }
                    }
                    finally {
                        Threads.$is_thread_performing_cleanupP$.rebind(var47, var38);
                    }
                }
            }
        }
        else if (var40.eql((SubLObject)$ic378$) && NIL != module0158.f10286(var37, (SubLObject)$ic377$)) {
            final SubLObject var48 = assertion_handles_oc.f11010();
            final SubLObject var49 = (SubLObject)$ic379$;
            final SubLObject var50 = module0065.f4733(var48);
            SubLObject var51 = (SubLObject)ZERO_INTEGER;
            assert NIL != Types.stringp(var49) : var49;
            final SubLObject var52 = module0012.$g75$.currentBinding(var38);
            final SubLObject var53 = module0012.$g76$.currentBinding(var38);
            final SubLObject var54 = module0012.$g77$.currentBinding(var38);
            final SubLObject var55 = module0012.$g78$.currentBinding(var38);
            try {
                module0012.$g75$.bind((SubLObject)ZERO_INTEGER, var38);
                module0012.$g76$.bind((SubLObject)NIL, var38);
                module0012.$g77$.bind((SubLObject)T, var38);
                module0012.$g78$.bind(Time.get_universal_time(), var38);
                module0012.f478(var49);
                final SubLObject var479_480 = var48;
                if (NIL == module0065.f4772(var479_480, (SubLObject)$ic381$)) {
                    final SubLObject var481_482 = var479_480;
                    if (NIL == module0065.f4775(var481_482, (SubLObject)$ic381$)) {
                        final SubLObject var56 = module0065.f4740(var481_482);
                        final SubLObject var57 = (SubLObject)NIL;
                        SubLObject var58;
                        SubLObject var59;
                        SubLObject var60;
                        SubLObject var61;
                        for (var58 = Sequences.length(var56), var59 = (SubLObject)NIL, var59 = (SubLObject)ZERO_INTEGER; var59.numL(var58); var59 = Numbers.add(var59, (SubLObject)ONE_INTEGER)) {
                            var60 = ((NIL != var57) ? Numbers.subtract(var58, var59, (SubLObject)ONE_INTEGER) : var59);
                            var61 = Vectors.aref(var56, var60);
                            if (NIL == module0065.f4749(var61) || NIL == module0065.f4773((SubLObject)$ic381$)) {
                                if (NIL != module0065.f4749(var61)) {
                                    var61 = (SubLObject)$ic381$;
                                }
                                module0012.note_percent_progress(var51, var50);
                                var51 = Numbers.add(var51, (SubLObject)ONE_INTEGER);
                                if (NIL != module0158.f10287(var61, var37, (SubLObject)$ic377$, (SubLObject)NIL)) {
                                    var39 = (SubLObject)ConsesLow.cons(var61, var39);
                                }
                            }
                        }
                    }
                    final SubLObject var488_489 = var479_480;
                    if (NIL == module0065.f4777(var488_489) || NIL == module0065.f4773((SubLObject)$ic381$)) {
                        final SubLObject var62 = module0065.f4738(var488_489);
                        SubLObject var63 = module0065.f4739(var488_489);
                        final SubLObject var64 = module0065.f4734(var488_489);
                        final SubLObject var65 = (SubLObject)((NIL != module0065.f4773((SubLObject)$ic381$)) ? NIL : $ic381$);
                        while (var63.numL(var64)) {
                            final SubLObject var66 = Hashtables.gethash_without_values(var63, var62, var65);
                            if (NIL == module0065.f4773((SubLObject)$ic381$) || NIL == module0065.f4749(var66)) {
                                module0012.note_percent_progress(var51, var50);
                                var51 = Numbers.add(var51, (SubLObject)ONE_INTEGER);
                                if (NIL != module0158.f10287(var66, var37, (SubLObject)$ic377$, (SubLObject)NIL)) {
                                    var39 = (SubLObject)ConsesLow.cons(var66, var39);
                                }
                            }
                            var63 = Numbers.add(var63, (SubLObject)ONE_INTEGER);
                        }
                    }
                }
                module0012.f479();
            }
            finally {
                module0012.$g78$.rebind(var55, var38);
                module0012.$g77$.rebind(var54, var38);
                module0012.$g76$.rebind(var53, var38);
                module0012.$g75$.rebind(var52, var38);
            }
        }
        return module0211.f13709(var39, (SubLObject)$ic382$, (SubLObject)$ic383$);
    }

    public static SubLObject f40853(final SubLObject var37) {
        final SubLThread var38 = SubLProcess.currentSubLThread();
        SubLObject var39 = (SubLObject)NIL;
        final SubLObject var40 = module0147.$g2094$.currentBinding(var38);
        final SubLObject var41 = module0147.$g2095$.currentBinding(var38);
        try {
            module0147.$g2094$.bind((SubLObject)$ic134$, var38);
            module0147.$g2095$.bind($ic135$, var38);
            SubLObject var42 = module0218.f14453(module0035.f2119(var37), (SubLObject)UNPROVIDED);
            SubLObject var43 = (SubLObject)NIL;
            var43 = var42.first();
            while (NIL != var42) {
                if (NIL != module0161.f10513(module0178.f11287(var43), var37)) {
                    var39 = (SubLObject)ConsesLow.cons(var43, var39);
                }
                var42 = var42.rest();
                var43 = var42.first();
            }
        }
        finally {
            module0147.$g2095$.rebind(var41, var38);
            module0147.$g2094$.rebind(var40, var38);
        }
        return module0211.f13709(var39, (SubLObject)$ic382$, (SubLObject)$ic383$);
    }

    public static SubLObject f40855(final SubLObject var493, final SubLObject var494) {
        return module0213.f13927(var493, var494, (SubLObject)T, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
    }

    public static SubLObject f40856(final SubLObject var495, final SubLObject var146) {
        return module0213.f13938(var495, var146, (SubLObject)T);
    }

    public static SubLObject f40857(final SubLObject var52) {
        final SubLThread var53 = SubLProcess.currentSubLThread();
        SubLObject var54 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var52, var52, (SubLObject)$ic87$);
        var54 = var52.first();
        final SubLObject var55 = var52.rest();
        if (NIL == var55) {
            final SubLObject var56 = module0656.f39943(var54, (SubLObject)UNPROVIDED);
            if (NIL == module0656.f39930(var56)) {
                return module0656.f39789((SubLObject)$ic99$, var54, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
            }
            final SubLObject var58;
            final SubLObject var57 = var58 = PrintLow.format((SubLObject)NIL, (SubLObject)$ic384$, var56);
            final SubLObject var59 = module0015.$g538$.currentBinding(var53);
            try {
                module0015.$g538$.bind((NIL != module0057.f4158(module0015.$g538$.getDynamicValue(var53))) ? module0015.$g538$.getDynamicValue(var53) : module0057.f4173((SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED), var53);
                module0642.f39020((SubLObject)$ic0$);
                module0642.f39029((SubLObject)UNPROVIDED);
                module0642.f39020(module0015.$g155$.getGlobalValue());
                module0642.f39020(module0015.$g153$.getGlobalValue());
                module0015.f718();
                module0655.f39766();
                module0642.f39064(module0655.$g5143$.getDynamicValue(var53), module0655.$g5142$.getDynamicValue(var53));
                final SubLObject var60 = module0014.f672((SubLObject)$ic1$);
                module0642.f39029((SubLObject)UNPROVIDED);
                module0642.f39020(module0015.$g175$.getGlobalValue());
                module0642.f39020(module0015.$g176$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                module0642.f39020((SubLObject)$ic2$);
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                if (NIL != var60) {
                    module0642.f39020(module0015.$g178$.getGlobalValue());
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                    module0642.f39020(var60);
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                }
                module0642.f39020(module0015.$g177$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                module0642.f39020((SubLObject)$ic3$);
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                if (NIL != var58) {
                    module0642.f39029((SubLObject)UNPROVIDED);
                    module0642.f39020(module0015.$g173$.getGlobalValue());
                    module0642.f39019(var58);
                    module0642.f39020(module0015.$g174$.getGlobalValue());
                }
                module0016.f941();
                module0642.f39020(module0015.$g154$.getGlobalValue());
                module0642.f39029((SubLObject)UNPROVIDED);
                final SubLObject var3_498 = module0015.$g535$.currentBinding(var53);
                try {
                    module0015.$g535$.bind((SubLObject)T, var53);
                    module0642.f39020(module0015.$g133$.getGlobalValue());
                    if (NIL != module0015.$g132$.getDynamicValue(var53)) {
                        module0642.f39020(module0015.$g135$.getGlobalValue());
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                        module0642.f39020(module0642.f39042(module0015.$g132$.getDynamicValue(var53)));
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                    }
                    module0642.f39020(module0015.$g137$.getGlobalValue());
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                    module0642.f39020((SubLObject)$ic150$);
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                    module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                    final SubLObject var3_499 = module0015.$g533$.currentBinding(var53);
                    try {
                        module0015.$g533$.bind((SubLObject)T, var53);
                        module0642.f39020(module0015.$g144$.getGlobalValue());
                        module0642.f39020(module0015.$g157$.getGlobalValue());
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                        module0642.f39020((SubLObject)$ic151$);
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                        final SubLObject var3_500 = module0015.$g533$.currentBinding(var53);
                        try {
                            module0015.$g533$.bind((SubLObject)T, var53);
                            module0642.f39020(module0015.$g295$.getGlobalValue());
                            module0642.f39020(module0015.$g305$.getGlobalValue());
                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                            module0642.f39020((SubLObject)$ic152$);
                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                            module0642.f39020(module0015.$g302$.getGlobalValue());
                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                            module0642.f39020((SubLObject)$ic153$);
                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                            module0642.f39020(module0015.$g307$.getGlobalValue());
                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                            module0642.f39019((SubLObject)$ic154$);
                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                            module0642.f39020(module0015.$g160$.getGlobalValue());
                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                            module0642.f39020((SubLObject)$ic155$);
                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                        }
                        finally {
                            module0015.$g533$.rebind(var3_500, var53);
                        }
                        module0642.f39020(module0015.$g145$.getGlobalValue());
                        f40722(var56);
                        module0642.f39026((SubLObject)TWO_INTEGER);
                        f40858(var56);
                        module0642.f39029((SubLObject)UNPROVIDED);
                        module0642.f39050();
                    }
                    finally {
                        module0015.$g533$.rebind(var3_499, var53);
                    }
                    module0642.f39020(module0015.$g134$.getGlobalValue());
                    module0642.f39029((SubLObject)UNPROVIDED);
                }
                finally {
                    module0015.$g535$.rebind(var3_498, var53);
                }
                module0642.f39020(module0015.$g156$.getGlobalValue());
                module0642.f39029((SubLObject)UNPROVIDED);
            }
            finally {
                module0015.$g538$.rebind(var59, var53);
            }
        }
        else {
            cdestructuring_bind.cdestructuring_bind_error(var52, (SubLObject)$ic87$);
        }
        return (SubLObject)NIL;
    }

    public static SubLObject f40859(final SubLObject var37) {
        final SubLThread var38 = SubLProcess.currentSubLThread();
        final SubLObject var39 = module0656.f39832((SubLObject)$ic48$);
        module0642.f39020(module0015.$g381$.getGlobalValue());
        module0642.f39020(module0015.$g383$.getGlobalValue());
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        module0655.f39768();
        PrintLow.format(module0015.$g131$.getDynamicValue(var38), (SubLObject)$ic386$, module0656.f39931(var37));
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        if (NIL != var39) {
            module0642.f39020(module0015.$g387$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
            module0642.f39020(var39);
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        }
        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
        final SubLObject var40 = module0015.$g533$.currentBinding(var38);
        try {
            module0015.$g533$.bind((SubLObject)T, var38);
            module0642.f39019((SubLObject)$ic387$);
        }
        finally {
            module0015.$g533$.rebind(var40, var38);
        }
        module0642.f39020(module0015.$g382$.getGlobalValue());
        module0642.f39019((SubLObject)$ic373$);
        return (SubLObject)NIL;
    }

    public static SubLObject f40858(final SubLObject var37) {
        final SubLThread var38 = SubLProcess.currentSubLThread();
        module0642.f39020(module0015.$g234$.getGlobalValue());
        module0642.f39020(module0015.$g207$.getGlobalValue());
        module0642.f39019((SubLObject)$ic389$);
        module0642.f39020(module0015.$g208$.getGlobalValue());
        module0642.f39020(module0015.$g235$.getGlobalValue());
        module0642.f39026((SubLObject)TWO_INTEGER);
        final SubLObject var39 = f40860(var37);
        final SubLObject var40 = (NIL != f40692(var37)) ? Symbols.symbol_function((SubLObject)$ic258$) : Symbols.symbol_function((SubLObject)$ic260$);
        final SubLObject var41 = module0655.$g5129$.currentBinding(var38);
        final SubLObject var42 = module0655.$g5130$.currentBinding(var38);
        try {
            module0655.$g5129$.bind((SubLObject)NIL, var38);
            module0655.$g5130$.bind((SubLObject)NIL, var38);
            SubLObject var43 = var39;
            SubLObject var44 = (SubLObject)NIL;
            var44 = var43.first();
            while (NIL != var43) {
                Functions.funcall(var40, var44);
                var43 = var43.rest();
                var44 = var43.first();
            }
        }
        finally {
            module0655.$g5130$.rebind(var42, var38);
            module0655.$g5129$.rebind(var41, var38);
        }
        return (SubLObject)NIL;
    }

    public static SubLObject f40860(final SubLObject var37) {
        final SubLThread var38 = SubLProcess.currentSubLThread();
        SubLObject var39 = (SubLObject)NIL;
        final SubLObject var40 = module0158.f10289(var37);
        if (var40.eql((SubLObject)$ic376$)) {
            if (NIL != module0158.f10270(var37, (SubLObject)$ic390$)) {
                final SubLObject var41 = module0158.f10271(var37);
                SubLObject var42 = (SubLObject)NIL;
                try {
                    var42 = module0158.f10316(var41, (SubLObject)$ic390$, (SubLObject)NIL, (SubLObject)NIL);
                    SubLObject var43 = (SubLObject)NIL;
                    final SubLObject var44 = (SubLObject)NIL;
                    while (NIL == var43) {
                        final SubLObject var45 = module0052.f3695(var42, var44);
                        final SubLObject var46 = (SubLObject)makeBoolean(!var44.eql(var45));
                        if (NIL != var46) {
                            var39 = (SubLObject)ConsesLow.cons(var45, var39);
                        }
                        var43 = (SubLObject)makeBoolean(NIL == var46);
                    }
                }
                finally {
                    final SubLObject var47 = Threads.$is_thread_performing_cleanupP$.currentBinding(var38);
                    try {
                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)T, var38);
                        if (NIL != var42) {
                            module0158.f10319(var42);
                        }
                    }
                    finally {
                        Threads.$is_thread_performing_cleanupP$.rebind(var47, var38);
                    }
                }
            }
        }
        else if (var40.eql((SubLObject)$ic378$) && NIL != module0158.f10286(var37, (SubLObject)$ic390$)) {
            final SubLObject var48 = assertion_handles_oc.f11010();
            final SubLObject var49 = (SubLObject)$ic379$;
            final SubLObject var50 = module0065.f4733(var48);
            SubLObject var51 = (SubLObject)ZERO_INTEGER;
            assert NIL != Types.stringp(var49) : var49;
            final SubLObject var52 = module0012.$g75$.currentBinding(var38);
            final SubLObject var53 = module0012.$g76$.currentBinding(var38);
            final SubLObject var54 = module0012.$g77$.currentBinding(var38);
            final SubLObject var55 = module0012.$g78$.currentBinding(var38);
            try {
                module0012.$g75$.bind((SubLObject)ZERO_INTEGER, var38);
                module0012.$g76$.bind((SubLObject)NIL, var38);
                module0012.$g77$.bind((SubLObject)T, var38);
                module0012.$g78$.bind(Time.get_universal_time(), var38);
                module0012.f478(var49);
                final SubLObject var479_504 = var48;
                if (NIL == module0065.f4772(var479_504, (SubLObject)$ic381$)) {
                    final SubLObject var481_505 = var479_504;
                    if (NIL == module0065.f4775(var481_505, (SubLObject)$ic381$)) {
                        final SubLObject var56 = module0065.f4740(var481_505);
                        final SubLObject var57 = (SubLObject)NIL;
                        SubLObject var58;
                        SubLObject var59;
                        SubLObject var60;
                        SubLObject var61;
                        for (var58 = Sequences.length(var56), var59 = (SubLObject)NIL, var59 = (SubLObject)ZERO_INTEGER; var59.numL(var58); var59 = Numbers.add(var59, (SubLObject)ONE_INTEGER)) {
                            var60 = ((NIL != var57) ? Numbers.subtract(var58, var59, (SubLObject)ONE_INTEGER) : var59);
                            var61 = Vectors.aref(var56, var60);
                            if (NIL == module0065.f4749(var61) || NIL == module0065.f4773((SubLObject)$ic381$)) {
                                if (NIL != module0065.f4749(var61)) {
                                    var61 = (SubLObject)$ic381$;
                                }
                                module0012.note_percent_progress(var51, var50);
                                var51 = Numbers.add(var51, (SubLObject)ONE_INTEGER);
                                if (NIL != module0158.f10287(var61, var37, (SubLObject)$ic390$, (SubLObject)NIL)) {
                                    var39 = (SubLObject)ConsesLow.cons(var61, var39);
                                }
                            }
                        }
                    }
                    final SubLObject var488_506 = var479_504;
                    if (NIL == module0065.f4777(var488_506) || NIL == module0065.f4773((SubLObject)$ic381$)) {
                        final SubLObject var62 = module0065.f4738(var488_506);
                        SubLObject var63 = module0065.f4739(var488_506);
                        final SubLObject var64 = module0065.f4734(var488_506);
                        final SubLObject var65 = (SubLObject)((NIL != module0065.f4773((SubLObject)$ic381$)) ? NIL : $ic381$);
                        while (var63.numL(var64)) {
                            final SubLObject var66 = Hashtables.gethash_without_values(var63, var62, var65);
                            if (NIL == module0065.f4773((SubLObject)$ic381$) || NIL == module0065.f4749(var66)) {
                                module0012.note_percent_progress(var51, var50);
                                var51 = Numbers.add(var51, (SubLObject)ONE_INTEGER);
                                if (NIL != module0158.f10287(var66, var37, (SubLObject)$ic390$, (SubLObject)NIL)) {
                                    var39 = (SubLObject)ConsesLow.cons(var66, var39);
                                }
                            }
                            var63 = Numbers.add(var63, (SubLObject)ONE_INTEGER);
                        }
                    }
                }
                module0012.f479();
            }
            finally {
                module0012.$g78$.rebind(var55, var38);
                module0012.$g77$.rebind(var54, var38);
                module0012.$g76$.rebind(var53, var38);
                module0012.$g75$.rebind(var52, var38);
            }
        }
        return Sort.sort(var39, Symbols.symbol_function((SubLObject)$ic129$), (SubLObject)$ic236$);
    }

    public static SubLObject f40861(final SubLObject var52) {
        final SubLThread var53 = SubLProcess.currentSubLThread();
        SubLObject var54 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var52, var52, (SubLObject)$ic87$);
        var54 = var52.first();
        final SubLObject var55 = var52.rest();
        if (NIL == var55) {
            final SubLObject var56 = module0656.f39969(var54);
            if (NIL == module0656.f39930(var56)) {
                return module0656.f39789((SubLObject)$ic88$, var54, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
            }
            final SubLObject var58;
            final SubLObject var57 = var58 = PrintLow.format((SubLObject)NIL, (SubLObject)$ic391$, var56);
            final SubLObject var59 = module0015.$g538$.currentBinding(var53);
            try {
                module0015.$g538$.bind((NIL != module0057.f4158(module0015.$g538$.getDynamicValue(var53))) ? module0015.$g538$.getDynamicValue(var53) : module0057.f4173((SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED), var53);
                module0642.f39020((SubLObject)$ic0$);
                module0642.f39029((SubLObject)UNPROVIDED);
                module0642.f39020(module0015.$g155$.getGlobalValue());
                module0642.f39020(module0015.$g153$.getGlobalValue());
                module0015.f718();
                module0655.f39766();
                module0642.f39064(module0655.$g5143$.getDynamicValue(var53), module0655.$g5142$.getDynamicValue(var53));
                final SubLObject var60 = module0014.f672((SubLObject)$ic1$);
                module0642.f39029((SubLObject)UNPROVIDED);
                module0642.f39020(module0015.$g175$.getGlobalValue());
                module0642.f39020(module0015.$g176$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                module0642.f39020((SubLObject)$ic2$);
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                if (NIL != var60) {
                    module0642.f39020(module0015.$g178$.getGlobalValue());
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                    module0642.f39020(var60);
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                }
                module0642.f39020(module0015.$g177$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                module0642.f39020((SubLObject)$ic3$);
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                if (NIL != var58) {
                    module0642.f39029((SubLObject)UNPROVIDED);
                    module0642.f39020(module0015.$g173$.getGlobalValue());
                    module0642.f39019(var58);
                    module0642.f39020(module0015.$g174$.getGlobalValue());
                }
                module0016.f941();
                module0642.f39020(module0015.$g154$.getGlobalValue());
                module0642.f39029((SubLObject)UNPROVIDED);
                final SubLObject var3_509 = module0015.$g535$.currentBinding(var53);
                try {
                    module0015.$g535$.bind((SubLObject)T, var53);
                    module0642.f39020(module0015.$g133$.getGlobalValue());
                    if (NIL != module0015.$g132$.getDynamicValue(var53)) {
                        module0642.f39020(module0015.$g135$.getGlobalValue());
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                        module0642.f39020(module0642.f39042(module0015.$g132$.getDynamicValue(var53)));
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                    }
                    module0642.f39020(module0015.$g137$.getGlobalValue());
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                    module0642.f39020((SubLObject)$ic150$);
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                    module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                    final SubLObject var3_510 = module0015.$g533$.currentBinding(var53);
                    try {
                        module0015.$g533$.bind((SubLObject)T, var53);
                        module0642.f39020(module0015.$g144$.getGlobalValue());
                        module0642.f39020(module0015.$g157$.getGlobalValue());
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                        module0642.f39020((SubLObject)$ic151$);
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                        final SubLObject var3_511 = module0015.$g533$.currentBinding(var53);
                        try {
                            module0015.$g533$.bind((SubLObject)T, var53);
                            module0642.f39020(module0015.$g295$.getGlobalValue());
                            module0642.f39020(module0015.$g305$.getGlobalValue());
                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                            module0642.f39020((SubLObject)$ic152$);
                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                            module0642.f39020(module0015.$g302$.getGlobalValue());
                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                            module0642.f39020((SubLObject)$ic153$);
                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                            module0642.f39020(module0015.$g307$.getGlobalValue());
                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                            module0642.f39019((SubLObject)$ic154$);
                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                            module0642.f39020(module0015.$g160$.getGlobalValue());
                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                            module0642.f39020((SubLObject)$ic155$);
                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                        }
                        finally {
                            module0015.$g533$.rebind(var3_511, var53);
                        }
                        module0642.f39020(module0015.$g145$.getGlobalValue());
                        f40722(var56);
                        module0642.f39026((SubLObject)TWO_INTEGER);
                        f40751(var56);
                        module0642.f39029((SubLObject)UNPROVIDED);
                        module0642.f39050();
                    }
                    finally {
                        module0015.$g533$.rebind(var3_510, var53);
                    }
                    module0642.f39020(module0015.$g134$.getGlobalValue());
                    module0642.f39029((SubLObject)UNPROVIDED);
                }
                finally {
                    module0015.$g535$.rebind(var3_509, var53);
                }
                module0642.f39020(module0015.$g156$.getGlobalValue());
                module0642.f39029((SubLObject)UNPROVIDED);
            }
            finally {
                module0015.$g538$.rebind(var59, var53);
            }
        }
        else {
            cdestructuring_bind.cdestructuring_bind_error(var52, (SubLObject)$ic87$);
        }
        return (SubLObject)NIL;
    }

    public static SubLObject f40862(final SubLObject var1, final SubLObject var29) {
        final SubLThread var30 = SubLProcess.currentSubLThread();
        final SubLObject var31 = module0656.f39832((SubLObject)$ic48$);
        module0642.f39020(module0015.$g381$.getGlobalValue());
        module0642.f39020(module0015.$g383$.getGlobalValue());
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        module0655.f39768();
        PrintLow.format(module0015.$g131$.getDynamicValue(var30), (SubLObject)$ic393$, module0656.f39931(var1));
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        if (NIL != var31) {
            module0642.f39020(module0015.$g387$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
            module0642.f39020(var31);
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        }
        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
        final SubLObject var32 = module0015.$g533$.currentBinding(var30);
        try {
            module0015.$g533$.bind((SubLObject)T, var30);
            module0642.f39019((SubLObject)$ic394$);
        }
        finally {
            module0015.$g533$.rebind(var32, var30);
        }
        module0642.f39020(module0015.$g382$.getGlobalValue());
        if (var29.numG((SubLObject)ONE_INTEGER)) {
            PrintLow.format(module0015.$g131$.getDynamicValue(var30), (SubLObject)$ic219$, var29);
        }
        return var1;
    }

    public static SubLObject f40751(final SubLObject var1) {
        final SubLThread var2 = SubLProcess.currentSubLThread();
        final SubLObject var3 = module0656.$g5172$.currentBinding(var2);
        try {
            module0656.$g5172$.bind(module0661.f40305(), var2);
            if (f40687(var1).numG((SubLObject)ZERO_INTEGER)) {
                module0642.f39020(module0015.$g234$.getGlobalValue());
                module0642.f39020(module0015.$g207$.getGlobalValue());
                module0642.f39020(module0015.$g459$.getGlobalValue());
                module0642.f39019((SubLObject)$ic396$);
                module0642.f39020(module0015.$g460$.getGlobalValue());
                module0642.f39020(module0015.$g208$.getGlobalValue());
                module0642.f39020(module0015.$g235$.getGlobalValue());
                module0642.f39026((SubLObject)TWO_INTEGER);
                final SubLObject var4 = (NIL != f40692(var1)) ? Symbols.symbol_function((SubLObject)$ic257$) : Symbols.symbol_function((SubLObject)$ic259$);
                final SubLObject var3_512 = module0655.$g5129$.currentBinding(var2);
                final SubLObject var5 = module0655.$g5130$.currentBinding(var2);
                final SubLObject var6 = module0147.$g2094$.currentBinding(var2);
                final SubLObject var7 = module0147.$g2095$.currentBinding(var2);
                try {
                    module0655.$g5129$.bind((SubLObject)NIL, var2);
                    module0655.$g5130$.bind((SubLObject)NIL, var2);
                    module0147.$g2094$.bind((SubLObject)$ic134$, var2);
                    module0147.$g2095$.bind($ic135$, var2);
                    f40863(var4, var1, (SubLObject)NIL, (SubLObject)NIL);
                }
                finally {
                    module0147.$g2095$.rebind(var7, var2);
                    module0147.$g2094$.rebind(var6, var2);
                    module0655.$g5130$.rebind(var5, var2);
                    module0655.$g5129$.rebind(var3_512, var2);
                }
            }
        }
        finally {
            module0656.$g5172$.rebind(var3, var2);
        }
        return (SubLObject)NIL;
    }

    public static SubLObject f40863(final SubLObject var42, final SubLObject var8, final SubLObject var513, final SubLObject var473) {
        final SubLThread var514 = SubLProcess.currentSubLThread();
        SubLObject var515 = (SubLObject)NIL;
        final SubLObject var516 = module0580.$g4361$.currentBinding(var514);
        try {
            module0580.$g4361$.bind((SubLObject)NIL, var514);
            var514.resetMultipleValues();
            final SubLObject var3_515 = module0580.$g4362$.currentBinding(var514);
            try {
                module0580.$g4362$.bind(module0580.f35560(), var514);
                final SubLObject var517 = var514.secondMultipleValue();
                var514.resetMultipleValues();
                try {
                    var514.resetMultipleValues();
                    final SubLObject var3_516 = module0580.$g4358$.currentBinding(var514);
                    try {
                        module0580.$g4358$.bind(module0580.f35544(), var514);
                        final SubLObject var518 = var514.secondMultipleValue();
                        var514.resetMultipleValues();
                        final SubLObject var3_517 = module0580.$g4359$.currentBinding(var514);
                        try {
                            module0580.$g4359$.bind(module0580.f35545(), var514);
                            final SubLObject var519 = module0580.$g4358$.getDynamicValue(var514);
                            final SubLObject var3_518 = module0034.$g879$.currentBinding(var514);
                            try {
                                module0034.$g879$.bind(var519, var514);
                                SubLObject var520 = (SubLObject)NIL;
                                if (NIL != var519 && NIL == module0034.f1842(var519)) {
                                    var520 = module0034.f1869(var519);
                                    final SubLObject var521 = Threads.current_process();
                                    if (NIL == var520) {
                                        module0034.f1873(var519, var521);
                                    }
                                    else if (!var520.eql(var521)) {
                                        Errors.error((SubLObject)$ic156$);
                                    }
                                }
                                try {
                                    final SubLObject var3_519 = module0579.$g4260$.currentBinding(var514);
                                    final SubLObject var522 = module0579.$g4259$.currentBinding(var514);
                                    final SubLObject var523 = module0656.$g5172$.currentBinding(var514);
                                    try {
                                        module0579.$g4260$.bind(module0677.f41312(), var514);
                                        module0579.$g4259$.bind((SubLObject)$ic157$, var514);
                                        module0656.$g5172$.bind(module0661.f40305(), var514);
                                        if (NIL != module0661.f40245((SubLObject)$ic397$)) {
                                            if (NIL != module0655.f39751()) {
                                                final SubLObject var3_520 = module0147.$g2094$.currentBinding(var514);
                                                final SubLObject var110_521 = module0147.$g2096$.currentBinding(var514);
                                                try {
                                                    module0147.$g2094$.bind((SubLObject)$ic398$, var514);
                                                    module0147.$g2096$.bind(module0661.f40271(), var514);
                                                    var515 = module0219.f14502(var42, var8, var513, var473);
                                                }
                                                finally {
                                                    module0147.$g2096$.rebind(var110_521, var514);
                                                    module0147.$g2094$.rebind(var3_520, var514);
                                                }
                                            }
                                            else {
                                                final SubLObject var3_521 = module0147.$g2094$.currentBinding(var514);
                                                final SubLObject var110_522 = module0147.$g2096$.currentBinding(var514);
                                                try {
                                                    module0147.$g2094$.bind((SubLObject)$ic399$, var514);
                                                    module0147.$g2096$.bind(module0661.f40271(), var514);
                                                    var515 = module0219.f14502(var42, var8, var513, var473);
                                                }
                                                finally {
                                                    module0147.$g2096$.rebind(var110_522, var514);
                                                    module0147.$g2094$.rebind(var3_521, var514);
                                                }
                                            }
                                        }
                                        else {
                                            var515 = module0219.f14502(var42, var8, var513, var473);
                                        }
                                    }
                                    finally {
                                        module0656.$g5172$.rebind(var523, var514);
                                        module0579.$g4259$.rebind(var522, var514);
                                        module0579.$g4260$.rebind(var3_519, var514);
                                    }
                                }
                                finally {
                                    final SubLObject var3_522 = Threads.$is_thread_performing_cleanupP$.currentBinding(var514);
                                    try {
                                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)T, var514);
                                        if (NIL != var519 && NIL == var520) {
                                            module0034.f1873(var519, (SubLObject)NIL);
                                        }
                                    }
                                    finally {
                                        Threads.$is_thread_performing_cleanupP$.rebind(var3_522, var514);
                                    }
                                }
                            }
                            finally {
                                module0034.$g879$.rebind(var3_518, var514);
                            }
                        }
                        finally {
                            module0580.$g4359$.rebind(var3_517, var514);
                        }
                        if (var518 == $ic159$ && NIL != module0034.f1839(module0580.$g4358$.getDynamicValue(var514))) {
                            module0034.f1891(module0580.$g4358$.getDynamicValue(var514));
                        }
                    }
                    finally {
                        module0580.$g4358$.rebind(var3_516, var514);
                    }
                }
                finally {
                    final SubLObject var3_523 = Threads.$is_thread_performing_cleanupP$.currentBinding(var514);
                    try {
                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)T, var514);
                        if (NIL == var517) {
                            module0580.f35554(module0580.$g4362$.getDynamicValue(var514));
                        }
                    }
                    finally {
                        Threads.$is_thread_performing_cleanupP$.rebind(var3_523, var514);
                    }
                }
            }
            finally {
                module0580.$g4362$.rebind(var3_515, var514);
            }
        }
        finally {
            module0580.$g4361$.rebind(var516, var514);
        }
        return var515;
    }

    public static SubLObject f40864(SubLObject var52) {
        if (var52 == UNPROVIDED) {
            var52 = (SubLObject)NIL;
        }
        final SubLThread var53 = SubLProcess.currentSubLThread();
        SubLObject var54 = module0223.f14665();
        if (NIL != var54) {
            final SubLObject var55 = (SubLObject)$ic402$;
            final SubLObject var56 = module0015.$g538$.currentBinding(var53);
            try {
                module0015.$g538$.bind((NIL != module0057.f4158(module0015.$g538$.getDynamicValue(var53))) ? module0015.$g538$.getDynamicValue(var53) : module0057.f4173((SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED), var53);
                module0642.f39020((SubLObject)$ic0$);
                module0642.f39029((SubLObject)UNPROVIDED);
                module0642.f39020(module0015.$g155$.getGlobalValue());
                module0642.f39020(module0015.$g153$.getGlobalValue());
                module0015.f718();
                module0655.f39766();
                module0642.f39064(module0655.$g5143$.getDynamicValue(var53), module0655.$g5142$.getDynamicValue(var53));
                final SubLObject var57 = module0014.f672((SubLObject)$ic1$);
                module0642.f39029((SubLObject)UNPROVIDED);
                module0642.f39020(module0015.$g175$.getGlobalValue());
                module0642.f39020(module0015.$g176$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                module0642.f39020((SubLObject)$ic2$);
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                if (NIL != var57) {
                    module0642.f39020(module0015.$g178$.getGlobalValue());
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                    module0642.f39020(var57);
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                }
                module0642.f39020(module0015.$g177$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                module0642.f39020((SubLObject)$ic3$);
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                module0016.f941();
                if (NIL != var55) {
                    module0642.f39029((SubLObject)UNPROVIDED);
                    module0642.f39020(module0015.$g173$.getGlobalValue());
                    module0642.f39019(var55);
                    module0642.f39020(module0015.$g174$.getGlobalValue());
                }
                module0642.f39020(module0015.$g154$.getGlobalValue());
                module0642.f39029((SubLObject)UNPROVIDED);
                final SubLObject var3_527 = module0015.$g535$.currentBinding(var53);
                try {
                    module0015.$g535$.bind((SubLObject)T, var53);
                    module0642.f39020(module0015.$g133$.getGlobalValue());
                    if (NIL != module0015.$g132$.getDynamicValue(var53)) {
                        module0642.f39020(module0015.$g135$.getGlobalValue());
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                        module0642.f39020(module0642.f39042(module0015.$g132$.getDynamicValue(var53)));
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                    }
                    module0642.f39020(module0015.$g137$.getGlobalValue());
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                    module0642.f39020((SubLObject)$ic150$);
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                    module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                    final SubLObject var3_528 = module0015.$g533$.currentBinding(var53);
                    try {
                        module0015.$g533$.bind((SubLObject)T, var53);
                        module0642.f39020(module0015.$g144$.getGlobalValue());
                        module0642.f39020(module0015.$g157$.getGlobalValue());
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                        module0642.f39020((SubLObject)$ic151$);
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                        final SubLObject var3_529 = module0015.$g533$.currentBinding(var53);
                        try {
                            module0015.$g533$.bind((SubLObject)T, var53);
                            module0642.f39020(module0015.$g295$.getGlobalValue());
                            module0642.f39020(module0015.$g305$.getGlobalValue());
                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                            module0642.f39020((SubLObject)$ic152$);
                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                            module0642.f39020(module0015.$g302$.getGlobalValue());
                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                            module0642.f39020((SubLObject)$ic153$);
                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                            module0642.f39020(module0015.$g307$.getGlobalValue());
                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                            module0642.f39019((SubLObject)$ic172$);
                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                        }
                        finally {
                            module0015.$g533$.rebind(var3_529, var53);
                        }
                        module0642.f39020(module0015.$g145$.getGlobalValue());
                        if (NIL != var55) {
                            module0642.f39020(module0015.$g189$.getGlobalValue());
                            module0642.f39020((SubLObject)TWO_INTEGER);
                            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                            module0642.f39019(var55);
                            module0642.f39020(module0015.$g190$.getGlobalValue());
                            module0642.f39020((SubLObject)TWO_INTEGER);
                            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                        }
                        module0642.f39020(module0015.$g282$.getGlobalValue());
                        module0642.f39020(module0015.$g284$.getGlobalValue());
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                        module0642.f39020(module0110.$g570$.getDynamicValue(var53));
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                        final SubLObject var3_530 = module0015.$g533$.currentBinding(var53);
                        final SubLObject var58 = module0015.$g541$.currentBinding(var53);
                        final SubLObject var59 = module0015.$g539$.currentBinding(var53);
                        try {
                            module0015.$g533$.bind((SubLObject)T, var53);
                            module0015.$g541$.bind((SubLObject)T, var53);
                            module0015.$g539$.bind(module0015.f797(), var53);
                            module0656.f39870((SubLObject)$ic400$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                            module0642.f39026((SubLObject)TWO_INTEGER);
                            var54 = Sort.sort(var54, Symbols.symbol_function((SubLObject)$ic403$), Symbols.symbol_function((SubLObject)$ic404$));
                            module0642.f39020(module0015.$g234$.getGlobalValue());
                            module0642.f39019((SubLObject)$ic405$);
                            module0642.f39020(module0015.$g235$.getGlobalValue());
                            module0642.f39020(module0015.$g264$.getGlobalValue());
                            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                            final SubLObject var3_531 = module0015.$g533$.currentBinding(var53);
                            try {
                                module0015.$g533$.bind((SubLObject)T, var53);
                                SubLObject var60 = var54;
                                SubLObject var61 = (SubLObject)NIL;
                                var61 = var60.first();
                                while (NIL != var60) {
                                    module0642.f39020(module0015.$g275$.getGlobalValue());
                                    module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                                    final SubLObject var3_532 = module0015.$g533$.currentBinding(var53);
                                    try {
                                        module0015.$g533$.bind((SubLObject)T, var53);
                                        module0656.f39837((SubLObject)$ic6$, var61, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                                    }
                                    finally {
                                        module0015.$g533$.rebind(var3_532, var53);
                                    }
                                    module0642.f39020(module0015.$g276$.getGlobalValue());
                                    var60 = var60.rest();
                                    var61 = var60.first();
                                }
                            }
                            finally {
                                module0015.$g533$.rebind(var3_531, var53);
                            }
                            module0642.f39020(module0015.$g265$.getGlobalValue());
                            module0015.f799(module0015.$g539$.getDynamicValue(var53));
                        }
                        finally {
                            module0015.$g539$.rebind(var59, var53);
                            module0015.$g541$.rebind(var58, var53);
                            module0015.$g533$.rebind(var3_530, var53);
                        }
                        module0642.f39020(module0015.$g283$.getGlobalValue());
                        module0642.f39029((SubLObject)UNPROVIDED);
                        module0642.f39050();
                    }
                    finally {
                        module0015.$g533$.rebind(var3_528, var53);
                    }
                    module0642.f39020(module0015.$g134$.getGlobalValue());
                    module0642.f39029((SubLObject)UNPROVIDED);
                }
                finally {
                    module0015.$g535$.rebind(var3_527, var53);
                }
                module0642.f39020(module0015.$g156$.getGlobalValue());
                module0642.f39029((SubLObject)UNPROVIDED);
            }
            finally {
                module0015.$g538$.rebind(var56, var53);
            }
        }
        else {
            module0656.f39789((SubLObject)$ic406$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        }
        return (SubLObject)NIL;
    }

    public static SubLObject f40865(SubLObject var56) {
        if (var56 == UNPROVIDED) {
            var56 = (SubLObject)NIL;
        }
        final SubLThread var57 = SubLProcess.currentSubLThread();
        if (NIL == var56) {
            var56 = (SubLObject)$ic408$;
        }
        final SubLObject var58 = module0656.f39832((SubLObject)$ic7$);
        module0642.f39020(module0015.$g381$.getGlobalValue());
        module0642.f39020(module0015.$g383$.getGlobalValue());
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        module0655.f39768();
        module0642.f39019((SubLObject)$ic409$);
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        if (NIL != var58) {
            module0642.f39020(module0015.$g387$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
            module0642.f39020(var58);
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        }
        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
        final SubLObject var59 = module0015.$g533$.currentBinding(var57);
        try {
            module0015.$g533$.bind((SubLObject)T, var57);
            module0642.f39019(var56);
        }
        finally {
            module0015.$g533$.rebind(var59, var57);
        }
        module0642.f39020(module0015.$g382$.getGlobalValue());
        return (SubLObject)NIL;
    }

    public static SubLObject f40694(SubLObject var52) {
        if (var52 == UNPROVIDED) {
            var52 = (SubLObject)NIL;
        }
        final SubLThread var53 = SubLProcess.currentSubLThread();
        final SubLObject var54 = module0656.f39969(var52.first());
        if (NIL == module0223.f14667(var54)) {
            module0656.f39789((SubLObject)$ic411$, var54, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        }
        else if (!module0217.f14357(var54).numG((SubLObject)ZERO_INTEGER)) {
            final SubLObject var55 = PrintLow.format((SubLObject)NIL, (SubLObject)$ic412$, module0223.f14672(var54));
            module0656.f39792(var55, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        }
        else {
            module0642.f39020((SubLObject)$ic0$);
            module0642.f39029((SubLObject)UNPROVIDED);
            module0642.f39020(module0015.$g155$.getGlobalValue());
            module0642.f39020(module0015.$g153$.getGlobalValue());
            module0015.f718();
            module0655.f39766();
            module0642.f39064(module0655.$g5143$.getDynamicValue(var53), module0655.$g5142$.getDynamicValue(var53));
            final SubLObject var56 = module0014.f672((SubLObject)$ic1$);
            module0642.f39029((SubLObject)UNPROVIDED);
            module0642.f39020(module0015.$g175$.getGlobalValue());
            module0642.f39020(module0015.$g176$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
            module0642.f39020((SubLObject)$ic2$);
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
            if (NIL != var56) {
                module0642.f39020(module0015.$g178$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                module0642.f39020(var56);
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
            }
            module0642.f39020(module0015.$g177$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
            module0642.f39020((SubLObject)$ic3$);
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
            module0642.f39020(module0015.$g154$.getGlobalValue());
            module0642.f39029((SubLObject)UNPROVIDED);
            if (NIL != module0015.f713()) {
                Errors.error((SubLObject)$ic413$);
            }
            module0642.f39020(module0015.$g415$.getGlobalValue());
            module0642.f39020(module0015.$g417$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
            module0642.f39020((SubLObject)$ic414$);
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
            final SubLObject var57 = module0015.$g533$.currentBinding(var53);
            try {
                module0015.$g533$.bind((SubLObject)T, var53);
                module0656.f39836((SubLObject)$ic415$, var54, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                module0656.f39836((SubLObject)$ic48$, var54, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
            }
            finally {
                module0015.$g533$.rebind(var57, var53);
            }
            module0642.f39020(module0015.$g416$.getGlobalValue());
            module0642.f39029((SubLObject)UNPROVIDED);
            module0642.f39020(module0015.$g156$.getGlobalValue());
            module0642.f39029((SubLObject)UNPROVIDED);
        }
        return (SubLObject)NIL;
    }

    public static SubLObject f40866(final SubLObject var534, SubLObject var56) {
        if (var56 == UNPROVIDED) {
            var56 = (SubLObject)NIL;
        }
        final SubLThread var535 = SubLProcess.currentSubLThread();
        if (NIL != module0223.f14667(var534)) {
            if (NIL == var56) {
                var56 = module0223.f14672(var534);
            }
            final SubLObject var536 = module0656.f39832((SubLObject)$ic7$);
            module0642.f39020(module0015.$g381$.getGlobalValue());
            module0642.f39020(module0015.$g383$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
            module0655.f39768();
            PrintLow.format(module0015.$g131$.getDynamicValue(var535), (SubLObject)$ic417$, var534);
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
            if (NIL != var536) {
                module0642.f39020(module0015.$g387$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                module0642.f39020(var536);
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
            }
            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
            final SubLObject var537 = module0015.$g533$.currentBinding(var535);
            try {
                module0015.$g533$.bind((SubLObject)T, var535);
                module0642.f39019(var56);
            }
            finally {
                module0015.$g533$.rebind(var537, var535);
            }
            module0642.f39020(module0015.$g382$.getGlobalValue());
            return var534;
        }
        return (SubLObject)NIL;
    }

    public static SubLObject f40867(final SubLObject var52) {
        final SubLThread var53 = SubLProcess.currentSubLThread();
        final SubLObject var54 = var52.first();
        final SubLObject var55 = module0656.f39957(var54, (SubLObject)UNPROVIDED);
        final SubLObject var56 = (NIL != var55) ? module0038.f2889(var55) : var54;
        final SubLObject var57 = PrintLow.format((SubLObject)NIL, (SubLObject)$ic420$, var56);
        SubLObject var58 = (SubLObject)$ic421$;
        var53.resetMultipleValues();
        SubLObject var59 = f40868(var56, $g5288$.getDynamicValue(var53), $g5289$.getDynamicValue(var53));
        final SubLObject var60 = var53.secondMultipleValue();
        final SubLObject var61 = var53.thirdMultipleValue();
        var53.resetMultipleValues();
        if (NIL == var59) {
            var58 = (SubLObject)$ic422$;
            var59 = var56;
        }
        f40869(var58, var57, (SubLObject)NIL, var60, var59, var61);
        return (SubLObject)NIL;
    }

    public static SubLObject f40870(final SubLObject var52) {
        return f40867(var52);
    }

    public static SubLObject f40871(final SubLObject var540, SubLObject var56) {
        if (var56 == UNPROVIDED) {
            var56 = (SubLObject)NIL;
        }
        final SubLThread var541 = SubLProcess.currentSubLThread();
        SubLObject var542 = (SubLObject)NIL;
        if (NIL != module0167.f10813(var540)) {
            return (SubLObject)NIL;
        }
        if (NIL != constant_handles_oc.f8449(var540)) {
            var542 = constants_high_oc.f10743(var540);
        }
        else if (var540.isString()) {
            var542 = var540;
        }
        else if (var540.isChar()) {
            var542 = var540;
        }
        else {
            var542 = PrintLow.format((SubLObject)NIL, (SubLObject)$ic428$, var540);
        }
        if (NIL == var56) {
            var56 = var542;
        }
        final SubLObject var543 = module0656.f39832((SubLObject)$ic7$);
        module0642.f39020(module0015.$g381$.getGlobalValue());
        module0642.f39020(module0015.$g383$.getGlobalValue());
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        module0655.f39768();
        PrintLow.format(module0015.$g131$.getDynamicValue(var541), (SubLObject)$ic429$, var542);
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        if (NIL != var543) {
            module0642.f39020(module0015.$g387$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
            module0642.f39020(var543);
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        }
        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
        final SubLObject var544 = module0015.$g533$.currentBinding(var541);
        try {
            module0015.$g533$.bind((SubLObject)T, var541);
            if (NIL != constant_handles_oc.f8449(var540)) {
                final SubLObject var545 = module0014.f697((SubLObject)$ic425$);
                final SubLObject var546 = (SubLObject)$ic35$;
                final SubLObject var547 = module0014.f694((SubLObject)$ic425$);
                final SubLObject var548 = (SubLObject)ZERO_INTEGER;
                module0642.f39020(module0015.$g431$.getGlobalValue());
                module0642.f39020(module0015.$g440$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                module0642.f39020(var545);
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                if (NIL != var547) {
                    module0642.f39020(module0015.$g437$.getGlobalValue());
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                    module0642.f39020(var547);
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                }
                if (NIL != var546) {
                    module0642.f39020(module0015.$g438$.getGlobalValue());
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                    module0642.f39020(module0642.f39049(var546));
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                }
                if (NIL != var548) {
                    module0642.f39020(module0015.$g439$.getGlobalValue());
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                    module0642.f39020(var548);
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                }
                module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                final SubLObject var3_545 = module0015.$g533$.currentBinding(var541);
                try {
                    module0015.$g533$.bind((SubLObject)T, var541);
                }
                finally {
                    module0015.$g533$.rebind(var3_545, var541);
                }
                module0642.f39020(module0015.$g432$.getGlobalValue());
            }
            else {
                module0642.f39019(var56);
            }
        }
        finally {
            module0015.$g533$.rebind(var544, var541);
        }
        module0642.f39020(module0015.$g382$.getGlobalValue());
        return var540;
    }

    public static SubLObject f40872(SubLObject var52) {
        if (var52 == UNPROVIDED) {
            var52 = (SubLObject)NIL;
        }
        final SubLThread var53 = SubLProcess.currentSubLThread();
        final SubLObject var54 = (SubLObject)$ic435$;
        var53.resetMultipleValues();
        final SubLObject var55 = f40868($g5291$.getDynamicValue(var53), (SubLObject)ZERO_INTEGER, $g5290$.getDynamicValue(var53));
        final SubLObject var56 = var53.secondMultipleValue();
        final SubLObject var57 = var53.thirdMultipleValue();
        var53.resetMultipleValues();
        f40869((SubLObject)$ic35$, var54, (SubLObject)NIL, var56, var55, var57);
        return (SubLObject)NIL;
    }

    public static SubLObject f40873(SubLObject var56) {
        if (var56 == UNPROVIDED) {
            var56 = (SubLObject)NIL;
        }
        final SubLThread var57 = SubLProcess.currentSubLThread();
        if (NIL == var56) {
            var56 = (SubLObject)$ic437$;
        }
        final SubLObject var58 = module0656.f39832((SubLObject)$ic7$);
        module0642.f39020(module0015.$g381$.getGlobalValue());
        module0642.f39020(module0015.$g383$.getGlobalValue());
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        module0655.f39768();
        module0642.f39019((SubLObject)$ic438$);
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        if (NIL != var58) {
            module0642.f39020(module0015.$g387$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
            module0642.f39020(var58);
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        }
        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
        final SubLObject var59 = module0015.$g533$.currentBinding(var57);
        try {
            module0015.$g533$.bind((SubLObject)T, var57);
            module0642.f39019(var56);
        }
        finally {
            module0015.$g533$.rebind(var59, var57);
        }
        module0642.f39020(module0015.$g382$.getGlobalValue());
        return (SubLObject)NIL;
    }

    public static SubLObject f40874(SubLObject var52) {
        if (var52 == UNPROVIDED) {
            var52 = (SubLObject)NIL;
        }
        final SubLThread var53 = SubLProcess.currentSubLThread();
        final SubLObject var54 = (SubLObject)$ic441$;
        var53.resetMultipleValues();
        final SubLObject var55 = f40868($g5292$.getDynamicValue(var53), $g5290$.getDynamicValue(var53), (SubLObject)ZERO_INTEGER);
        final SubLObject var56 = var53.secondMultipleValue();
        final SubLObject var57 = var53.thirdMultipleValue();
        var53.resetMultipleValues();
        f40869((SubLObject)$ic442$, var54, (SubLObject)NIL, var56, var55, var57);
        return (SubLObject)NIL;
    }

    public static SubLObject f40875(SubLObject var56) {
        if (var56 == UNPROVIDED) {
            var56 = (SubLObject)NIL;
        }
        final SubLThread var57 = SubLProcess.currentSubLThread();
        if (NIL == var56) {
            var56 = (SubLObject)$ic444$;
        }
        final SubLObject var58 = module0656.f39832((SubLObject)$ic7$);
        module0642.f39020(module0015.$g381$.getGlobalValue());
        module0642.f39020(module0015.$g383$.getGlobalValue());
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        module0655.f39768();
        module0642.f39019((SubLObject)$ic445$);
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        if (NIL != var58) {
            module0642.f39020(module0015.$g387$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
            module0642.f39020(var58);
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        }
        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
        final SubLObject var59 = module0015.$g533$.currentBinding(var57);
        try {
            module0015.$g533$.bind((SubLObject)T, var57);
            module0642.f39019(var56);
        }
        finally {
            module0015.$g533$.rebind(var59, var57);
        }
        module0642.f39020(module0015.$g382$.getGlobalValue());
        return (SubLObject)NIL;
    }

    public static SubLObject f40876(final SubLObject var52) {
        final SubLThread var53 = SubLProcess.currentSubLThread();
        return f40877((SubLObject)$ic448$, Numbers.subtract($g5290$.getDynamicValue(var53), (SubLObject)ONE_INTEGER), (SubLObject)ONE_INTEGER, var52);
    }

    public static SubLObject f40878(final SubLObject var152, SubLObject var56) {
        if (var56 == UNPROVIDED) {
            var56 = (SubLObject)NIL;
        }
        final SubLThread var153 = SubLProcess.currentSubLThread();
        if (NIL == var56) {
            var56 = (SubLObject)$ic450$;
        }
        final SubLObject var154 = module0656.f39832((SubLObject)$ic7$);
        module0642.f39020(module0015.$g381$.getGlobalValue());
        module0642.f39020(module0015.$g383$.getGlobalValue());
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        module0655.f39768();
        PrintLow.format(module0015.$g131$.getDynamicValue(var153), (SubLObject)$ic451$, var152);
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        if (NIL != var154) {
            module0642.f39020(module0015.$g387$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
            module0642.f39020(var154);
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        }
        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
        final SubLObject var155 = module0015.$g533$.currentBinding(var153);
        try {
            module0015.$g533$.bind((SubLObject)T, var153);
            module0642.f39019(var56);
        }
        finally {
            module0015.$g533$.rebind(var155, var153);
        }
        module0642.f39020(module0015.$g382$.getGlobalValue());
        return var152;
    }

    public static SubLObject f40879(final SubLObject var52) {
        final SubLThread var53 = SubLProcess.currentSubLThread();
        return f40877((SubLObject)$ic454$, (SubLObject)ZERO_INTEGER, $g5290$.getDynamicValue(var53), var52);
    }

    public static SubLObject f40880(final SubLObject var152, SubLObject var56) {
        if (var56 == UNPROVIDED) {
            var56 = (SubLObject)NIL;
        }
        final SubLThread var153 = SubLProcess.currentSubLThread();
        if (NIL == var56) {
            var56 = (SubLObject)$ic456$;
        }
        final SubLObject var154 = module0656.f39832((SubLObject)$ic7$);
        module0642.f39020(module0015.$g381$.getGlobalValue());
        module0642.f39020(module0015.$g383$.getGlobalValue());
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        module0655.f39768();
        PrintLow.format(module0015.$g131$.getDynamicValue(var153), (SubLObject)$ic457$, var152);
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        if (NIL != var154) {
            module0642.f39020(module0015.$g387$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
            module0642.f39020(var154);
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        }
        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
        final SubLObject var155 = module0015.$g533$.currentBinding(var153);
        try {
            module0015.$g533$.bind((SubLObject)T, var153);
            module0642.f39019(var56);
        }
        finally {
            module0015.$g533$.rebind(var155, var153);
        }
        module0642.f39020(module0015.$g382$.getGlobalValue());
        return var152;
    }

    public static SubLObject f40877(final SubLObject var536, final SubLObject var546, final SubLObject var547, final SubLObject var52) {
        final SubLThread var548 = SubLProcess.currentSubLThread();
        final SubLObject var549 = var52.first();
        final SubLObject var550 = (SubLObject)$ic460$;
        var548.resetMultipleValues();
        SubLObject var551 = f40868(var549, var546, var547);
        final SubLObject var552 = var548.secondMultipleValue();
        SubLObject var553 = var548.thirdMultipleValue();
        var548.resetMultipleValues();
        if (NIL != var551) {
            var553 = (SubLObject)ConsesLow.cons(var551, var553);
            var551 = (SubLObject)NIL;
        }
        f40869(var536, var550, (SubLObject)NIL, var552, (SubLObject)NIL, var553);
        return (SubLObject)NIL;
    }

    public static SubLObject f40869(final SubLObject var536, final SubLObject var118, final SubLObject var533, final SubLObject var538, final SubLObject var548, final SubLObject var539) {
        final SubLThread var549 = SubLProcess.currentSubLThread();
        final SubLObject var550 = module0015.$g538$.currentBinding(var549);
        try {
            module0015.$g538$.bind((NIL != module0057.f4158(module0015.$g538$.getDynamicValue(var549))) ? module0015.$g538$.getDynamicValue(var549) : module0057.f4173((SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED), var549);
            module0642.f39020((SubLObject)$ic0$);
            module0642.f39029((SubLObject)UNPROVIDED);
            module0642.f39020(module0015.$g155$.getGlobalValue());
            module0642.f39020(module0015.$g153$.getGlobalValue());
            module0015.f718();
            module0655.f39766();
            module0642.f39064(module0655.$g5143$.getDynamicValue(var549), module0655.$g5142$.getDynamicValue(var549));
            final SubLObject var551 = module0014.f672((SubLObject)$ic1$);
            module0642.f39029((SubLObject)UNPROVIDED);
            module0642.f39020(module0015.$g175$.getGlobalValue());
            module0642.f39020(module0015.$g176$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
            module0642.f39020((SubLObject)$ic2$);
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
            if (NIL != var551) {
                module0642.f39020(module0015.$g178$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                module0642.f39020(var551);
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
            }
            module0642.f39020(module0015.$g177$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
            module0642.f39020((SubLObject)$ic3$);
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
            module0016.f941();
            if (NIL != var118) {
                module0642.f39029((SubLObject)UNPROVIDED);
                module0642.f39020(module0015.$g173$.getGlobalValue());
                module0642.f39019(var118);
                module0642.f39020(module0015.$g174$.getGlobalValue());
            }
            module0642.f39020(module0015.$g154$.getGlobalValue());
            module0642.f39029((SubLObject)UNPROVIDED);
            final SubLObject var3_549 = module0015.$g535$.currentBinding(var549);
            try {
                module0015.$g535$.bind((SubLObject)T, var549);
                module0642.f39020(module0015.$g133$.getGlobalValue());
                if (NIL != module0015.$g132$.getDynamicValue(var549)) {
                    module0642.f39020(module0015.$g135$.getGlobalValue());
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                    module0642.f39020(module0642.f39042(module0015.$g132$.getDynamicValue(var549)));
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                }
                module0642.f39020(module0015.$g137$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                module0642.f39020((SubLObject)$ic150$);
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                final SubLObject var3_550 = module0015.$g533$.currentBinding(var549);
                try {
                    module0015.$g533$.bind((SubLObject)T, var549);
                    module0642.f39020(module0015.$g144$.getGlobalValue());
                    module0642.f39020(module0015.$g157$.getGlobalValue());
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                    module0642.f39020((SubLObject)$ic151$);
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                    module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                    final SubLObject var3_551 = module0015.$g533$.currentBinding(var549);
                    try {
                        module0015.$g533$.bind((SubLObject)T, var549);
                        module0642.f39020(module0015.$g295$.getGlobalValue());
                        module0642.f39020(module0015.$g305$.getGlobalValue());
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                        module0642.f39020((SubLObject)$ic152$);
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                        module0642.f39020(module0015.$g302$.getGlobalValue());
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                        module0642.f39020((SubLObject)$ic153$);
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                        module0642.f39020(module0015.$g307$.getGlobalValue());
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                        module0642.f39019((SubLObject)$ic172$);
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                    }
                    finally {
                        module0015.$g533$.rebind(var3_551, var549);
                    }
                    module0642.f39020(module0015.$g145$.getGlobalValue());
                    if (NIL != var118) {
                        module0642.f39020(module0015.$g189$.getGlobalValue());
                        module0642.f39020((SubLObject)TWO_INTEGER);
                        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                        module0642.f39019(var118);
                        module0642.f39020(module0015.$g190$.getGlobalValue());
                        module0642.f39020((SubLObject)TWO_INTEGER);
                        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                    }
                    module0642.f39020(module0015.$g282$.getGlobalValue());
                    module0642.f39020(module0015.$g284$.getGlobalValue());
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                    module0642.f39020(module0110.$g570$.getDynamicValue(var549));
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                    module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                    final SubLObject var3_552 = module0015.$g533$.currentBinding(var549);
                    final SubLObject var552 = module0015.$g541$.currentBinding(var549);
                    final SubLObject var553 = module0015.$g539$.currentBinding(var549);
                    try {
                        module0015.$g533$.bind((SubLObject)T, var549);
                        module0015.$g541$.bind((SubLObject)T, var549);
                        module0015.$g539$.bind(module0015.f797(), var549);
                        if (NIL != var533) {
                            module0642.f39019(var533);
                        }
                        module0642.f39051((SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                        f40881(var536, var538, var539);
                        module0642.f39051((SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                        module0642.f39020(module0015.$g346$.getGlobalValue());
                        module0642.f39046(module0015.$g348$.getGlobalValue());
                        module0642.f39020(module0015.$g352$.getGlobalValue());
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                        module0642.f39020((SubLObject)ZERO_INTEGER);
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                        module0642.f39020(module0015.$g353$.getGlobalValue());
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                        module0642.f39020((SubLObject)ZERO_INTEGER);
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                        module0642.f39020(module0015.$g354$.getGlobalValue());
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                        module0642.f39020((SubLObject)ZERO_INTEGER);
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                        final SubLObject var3_553 = module0015.$g533$.currentBinding(var549);
                        try {
                            module0015.$g533$.bind((SubLObject)T, var549);
                            SubLObject var554 = var538;
                            SubLObject var555 = (SubLObject)NIL;
                            var555 = var554.first();
                            while (NIL != var554) {
                                f40882(var555, (SubLObject)UNPROVIDED);
                                var554 = var554.rest();
                                var555 = var554.first();
                            }
                            if (NIL != var548) {
                                f40883(var536, var548);
                            }
                            var554 = var539;
                            var555 = (SubLObject)NIL;
                            var555 = var554.first();
                            while (NIL != var554) {
                                f40882(var555, (SubLObject)UNPROVIDED);
                                var554 = var554.rest();
                                var555 = var554.first();
                            }
                            module0642.f39020(module0015.$g364$.getGlobalValue());
                            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                            final SubLObject var3_554 = module0015.$g533$.currentBinding(var549);
                            try {
                                module0015.$g533$.bind((SubLObject)T, var549);
                                module0642.f39020(module0015.$g360$.getGlobalValue());
                                module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                                final SubLObject var3_555 = module0015.$g533$.currentBinding(var549);
                                try {
                                    module0015.$g533$.bind((SubLObject)T, var549);
                                    module0642.f39032((SubLObject)FIVE_INTEGER);
                                }
                                finally {
                                    module0015.$g533$.rebind(var3_555, var549);
                                }
                                module0642.f39020(module0015.$g361$.getGlobalValue());
                                module0642.f39020(module0015.$g360$.getGlobalValue());
                                module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                                final SubLObject var3_556 = module0015.$g533$.currentBinding(var549);
                                try {
                                    module0015.$g533$.bind((SubLObject)T, var549);
                                    module0642.f39032((SubLObject)FIVE_INTEGER);
                                }
                                finally {
                                    module0015.$g533$.rebind(var3_556, var549);
                                }
                                module0642.f39020(module0015.$g361$.getGlobalValue());
                            }
                            finally {
                                module0015.$g533$.rebind(var3_554, var549);
                            }
                            module0642.f39020(module0015.$g365$.getGlobalValue());
                            module0642.f39029((SubLObject)UNPROVIDED);
                        }
                        finally {
                            module0015.$g533$.rebind(var3_553, var549);
                        }
                        module0642.f39020(module0015.$g347$.getGlobalValue());
                        module0015.f799(module0015.$g539$.getDynamicValue(var549));
                    }
                    finally {
                        module0015.$g539$.rebind(var553, var549);
                        module0015.$g541$.rebind(var552, var549);
                        module0015.$g533$.rebind(var3_552, var549);
                    }
                    module0642.f39020(module0015.$g283$.getGlobalValue());
                    module0642.f39029((SubLObject)UNPROVIDED);
                    module0642.f39050();
                }
                finally {
                    module0015.$g533$.rebind(var3_550, var549);
                }
                module0642.f39020(module0015.$g134$.getGlobalValue());
                module0642.f39029((SubLObject)UNPROVIDED);
            }
            finally {
                module0015.$g535$.rebind(var3_549, var549);
            }
            module0642.f39020(module0015.$g156$.getGlobalValue());
            module0642.f39029((SubLObject)UNPROVIDED);
        }
        finally {
            module0015.$g538$.rebind(var550, var549);
        }
        return (SubLObject)NIL;
    }

    public static SubLObject f40881(final SubLObject var536, final SubLObject var538, final SubLObject var539) {
        final SubLThread var540 = SubLProcess.currentSubLThread();
        SubLObject var541 = (SubLObject)NIL;
        SubLObject var542 = (SubLObject)NIL;
        SubLObject var543 = (SubLObject)NIL;
        SubLObject var544 = (SubLObject)NIL;
        if (var536.eql((SubLObject)$ic448$)) {
            var541 = Numbers.numE(Sequences.length(var538), Numbers.subtract($g5290$.getDynamicValue(var540), (SubLObject)ONE_INTEGER));
            var543 = (SubLObject)T;
        }
        else if (var536.eql((SubLObject)$ic454$)) {
            var541 = (SubLObject)T;
            var543 = Numbers.numE(Sequences.length(var539), $g5290$.getDynamicValue(var540));
        }
        else if (var536.eql((SubLObject)$ic421$)) {
            var541 = Numbers.numE(Sequences.length(var538), $g5288$.getDynamicValue(var540));
            var543 = Numbers.numE(Sequences.length(var539), Numbers.subtract($g5289$.getDynamicValue(var540), (SubLObject)ONE_INTEGER));
        }
        else if (var536.eql((SubLObject)$ic35$)) {
            var541 = (SubLObject)NIL;
            var543 = Numbers.numE(Sequences.length(var539), $g5290$.getDynamicValue(var540));
        }
        else if (var536.eql((SubLObject)$ic442$)) {
            var541 = Numbers.numE(Sequences.length(var538), $g5290$.getDynamicValue(var540));
            var543 = (SubLObject)NIL;
        }
        else {
            var541 = Numbers.numE(Sequences.length(var538), $g5288$.getDynamicValue(var540));
            var543 = Numbers.numE(Sequences.length(var539), $g5289$.getDynamicValue(var540));
        }
        if (NIL != var541) {
            if (NIL != var538) {
                var542 = constants_high_oc.f10743(var538.first());
            }
            else if (NIL != var539) {
                var542 = constants_high_oc.f10743(var539.first());
            }
        }
        if (NIL != var543) {
            if (NIL != var539) {
                var544 = constants_high_oc.f10743(conses_high.last(var539, (SubLObject)UNPROVIDED).first());
            }
            else if (NIL != var538) {
                var544 = constants_high_oc.f10743(conses_high.last(var538, (SubLObject)UNPROVIDED).first());
            }
        }
        module0642.f39020(module0015.$g346$.getGlobalValue());
        module0642.f39046(module0015.$g348$.getGlobalValue());
        module0642.f39046(module0015.$g349$.getGlobalValue());
        module0642.f39020(module0015.$g352$.getGlobalValue());
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        module0642.f39020((SubLObject)ZERO_INTEGER);
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        module0642.f39020(module0015.$g353$.getGlobalValue());
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        module0642.f39020((SubLObject)ZERO_INTEGER);
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        module0642.f39020(module0015.$g354$.getGlobalValue());
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        module0642.f39020((SubLObject)ZERO_INTEGER);
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
        final SubLObject var545 = module0015.$g533$.currentBinding(var540);
        try {
            module0015.$g533$.bind((SubLObject)T, var540);
            module0642.f39020(module0015.$g364$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
            final SubLObject var3_562 = module0015.$g533$.currentBinding(var540);
            try {
                module0015.$g533$.bind((SubLObject)T, var540);
                module0642.f39020(module0015.$g360$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                final SubLObject var3_563 = module0015.$g533$.currentBinding(var540);
                try {
                    module0015.$g533$.bind((SubLObject)T, var540);
                    module0656.f39870((SubLObject)$ic463$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                }
                finally {
                    module0015.$g533$.rebind(var3_563, var540);
                }
                module0642.f39020(module0015.$g361$.getGlobalValue());
                module0642.f39020(module0015.$g360$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                final SubLObject var3_564 = module0015.$g533$.currentBinding(var540);
                try {
                    module0015.$g533$.bind((SubLObject)T, var540);
                    module0642.f39020(module0015.$g346$.getGlobalValue());
                    module0642.f39046(module0015.$g348$.getGlobalValue());
                    module0642.f39046(module0015.$g349$.getGlobalValue());
                    module0642.f39020(module0015.$g352$.getGlobalValue());
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                    module0642.f39020((SubLObject)ZERO_INTEGER);
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                    module0642.f39020(module0015.$g353$.getGlobalValue());
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                    module0642.f39020((SubLObject)ZERO_INTEGER);
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                    module0642.f39020(module0015.$g354$.getGlobalValue());
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                    module0642.f39020((SubLObject)ZERO_INTEGER);
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                    module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                    final SubLObject var3_565 = module0015.$g533$.currentBinding(var540);
                    try {
                        module0015.$g533$.bind((SubLObject)T, var540);
                        module0642.f39020(module0015.$g364$.getGlobalValue());
                        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                        final SubLObject var3_566 = module0015.$g533$.currentBinding(var540);
                        try {
                            module0015.$g533$.bind((SubLObject)T, var540);
                            module0642.f39020(module0015.$g360$.getGlobalValue());
                            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                            final SubLObject var3_567 = module0015.$g533$.currentBinding(var540);
                            try {
                                module0015.$g533$.bind((SubLObject)T, var540);
                                if (NIL != var541) {
                                    module0656.f39837((SubLObject)$ic452$, var542, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                                    module0642.f39032((SubLObject)TWO_INTEGER);
                                }
                            }
                            finally {
                                module0015.$g533$.rebind(var3_567, var540);
                            }
                            module0642.f39020(module0015.$g361$.getGlobalValue());
                            module0642.f39020(module0015.$g360$.getGlobalValue());
                            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                            final SubLObject var3_568 = module0015.$g533$.currentBinding(var540);
                            try {
                                module0015.$g533$.bind((SubLObject)T, var540);
                                module0656.f39837((SubLObject)$ic432$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                                module0642.f39032((SubLObject)TWO_INTEGER);
                            }
                            finally {
                                module0015.$g533$.rebind(var3_568, var540);
                            }
                            module0642.f39020(module0015.$g361$.getGlobalValue());
                            module0642.f39020(module0015.$g360$.getGlobalValue());
                            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                            final SubLObject var3_569 = module0015.$g533$.currentBinding(var540);
                            try {
                                module0015.$g533$.bind((SubLObject)T, var540);
                                final SubLObject var546 = (SubLObject)TWO_INTEGER;
                                module0642.f39020(module0015.$g219$.getGlobalValue());
                                if (NIL != var546) {
                                    module0642.f39020(module0015.$g221$.getGlobalValue());
                                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                                    module0642.f39020(var546);
                                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                                }
                                module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                                final SubLObject var3_570 = module0015.$g533$.currentBinding(var540);
                                try {
                                    module0015.$g533$.bind((SubLObject)T, var540);
                                    module0642.f39020(module0015.$g240$.getGlobalValue());
                                    final SubLObject var547 = $g5293$.getDynamicValue(var540);
                                    SubLObject var573_574;
                                    SubLObject var548;
                                    SubLObject var549;
                                    SubLObject var550;
                                    for (var548 = (var573_574 = Sequences.length(var547)), var549 = (SubLObject)NIL, var549 = (SubLObject)ZERO_INTEGER; !var549.numGE(var573_574); var549 = module0048.f_1X(var549)) {
                                        var550 = Strings.sublisp_char(var547, var549);
                                        if (!var549.numE((SubLObject)ZERO_INTEGER)) {
                                            module0642.f39019((SubLObject)$ic465$);
                                        }
                                        module0656.f39837((SubLObject)$ic430$, var550, var550, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                                    }
                                    module0642.f39020(module0015.$g241$.getGlobalValue());
                                }
                                finally {
                                    module0015.$g533$.rebind(var3_570, var540);
                                }
                                module0642.f39020(module0015.$g220$.getGlobalValue());
                            }
                            finally {
                                module0015.$g533$.rebind(var3_569, var540);
                            }
                            module0642.f39020(module0015.$g361$.getGlobalValue());
                        }
                        finally {
                            module0015.$g533$.rebind(var3_566, var540);
                        }
                        module0642.f39020(module0015.$g365$.getGlobalValue());
                        module0642.f39029((SubLObject)UNPROVIDED);
                        module0642.f39020(module0015.$g364$.getGlobalValue());
                        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                        final SubLObject var3_571 = module0015.$g533$.currentBinding(var540);
                        try {
                            module0015.$g533$.bind((SubLObject)T, var540);
                            module0642.f39020(module0015.$g360$.getGlobalValue());
                            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                            final SubLObject var3_572 = module0015.$g533$.currentBinding(var540);
                            try {
                                module0015.$g533$.bind((SubLObject)T, var540);
                                if (NIL != var543) {
                                    module0656.f39837((SubLObject)$ic458$, var544, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                                    module0642.f39032((SubLObject)TWO_INTEGER);
                                }
                            }
                            finally {
                                module0015.$g533$.rebind(var3_572, var540);
                            }
                            module0642.f39020(module0015.$g361$.getGlobalValue());
                            module0642.f39020(module0015.$g360$.getGlobalValue());
                            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                            final SubLObject var3_573 = module0015.$g533$.currentBinding(var540);
                            try {
                                module0015.$g533$.bind((SubLObject)T, var540);
                                module0656.f39837((SubLObject)$ic446$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                                module0642.f39032((SubLObject)TWO_INTEGER);
                            }
                            finally {
                                module0015.$g533$.rebind(var3_573, var540);
                            }
                            module0642.f39020(module0015.$g361$.getGlobalValue());
                            module0642.f39020(module0015.$g360$.getGlobalValue());
                            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                            final SubLObject var3_574 = module0015.$g533$.currentBinding(var540);
                            try {
                                module0015.$g533$.bind((SubLObject)T, var540);
                                final SubLObject var546 = (SubLObject)TWO_INTEGER;
                                module0642.f39020(module0015.$g219$.getGlobalValue());
                                if (NIL != var546) {
                                    module0642.f39020(module0015.$g221$.getGlobalValue());
                                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                                    module0642.f39020(var546);
                                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                                }
                                module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                                final SubLObject var3_575 = module0015.$g533$.currentBinding(var540);
                                try {
                                    module0015.$g533$.bind((SubLObject)T, var540);
                                    module0642.f39020(module0015.$g240$.getGlobalValue());
                                    final SubLObject var547 = $g5294$.getDynamicValue(var540);
                                    SubLObject var548;
                                    SubLObject var549;
                                    SubLObject var550;
                                    SubLObject var573_575;
                                    for (var548 = (var573_575 = Sequences.length(var547)), var549 = (SubLObject)NIL, var549 = (SubLObject)ZERO_INTEGER; !var549.numGE(var573_575); var549 = module0048.f_1X(var549)) {
                                        var550 = Strings.sublisp_char(var547, var549);
                                        if (!var549.numE((SubLObject)ZERO_INTEGER)) {
                                            module0642.f39019((SubLObject)$ic465$);
                                        }
                                        module0656.f39837((SubLObject)$ic430$, var550, var550, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                                    }
                                    module0642.f39020(module0015.$g241$.getGlobalValue());
                                }
                                finally {
                                    module0015.$g533$.rebind(var3_575, var540);
                                }
                                module0642.f39020(module0015.$g220$.getGlobalValue());
                            }
                            finally {
                                module0015.$g533$.rebind(var3_574, var540);
                            }
                            module0642.f39020(module0015.$g361$.getGlobalValue());
                        }
                        finally {
                            module0015.$g533$.rebind(var3_571, var540);
                        }
                        module0642.f39020(module0015.$g365$.getGlobalValue());
                        module0642.f39029((SubLObject)UNPROVIDED);
                    }
                    finally {
                        module0015.$g533$.rebind(var3_565, var540);
                    }
                    module0642.f39020(module0015.$g347$.getGlobalValue());
                }
                finally {
                    module0015.$g533$.rebind(var3_564, var540);
                }
                module0642.f39020(module0015.$g361$.getGlobalValue());
            }
            finally {
                module0015.$g533$.rebind(var3_562, var540);
            }
            module0642.f39020(module0015.$g365$.getGlobalValue());
            module0642.f39029((SubLObject)UNPROVIDED);
        }
        finally {
            module0015.$g533$.rebind(var545, var540);
        }
        module0642.f39020(module0015.$g347$.getGlobalValue());
        return (SubLObject)NIL;
    }

    public static SubLObject f40883(final SubLObject var536, final SubLObject var548) {
        final SubLThread var549 = SubLProcess.currentSubLThread();
        if (var548.isString()) {
            module0642.f39020(module0015.$g364$.getGlobalValue());
            module0642.f39020(module0015.$g373$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
            module0642.f39020(module0642.f39049((SubLObject)$ic466$));
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
            final SubLObject var550 = module0015.$g533$.currentBinding(var549);
            try {
                module0015.$g533$.bind((SubLObject)T, var549);
                module0642.f39020(module0015.$g360$.getGlobalValue());
                module0642.f39020(module0015.$g370$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                module0642.f39020(module0642.f39049((SubLObject)$ic116$));
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                final SubLObject var3_582 = module0015.$g533$.currentBinding(var549);
                try {
                    module0015.$g533$.bind((SubLObject)T, var549);
                    module0642.f39020(module0015.$g234$.getGlobalValue());
                    module0642.f39020(module0015.$g219$.getGlobalValue());
                    module0642.f39020(module0015.$g221$.getGlobalValue());
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                    module0642.f39020((SubLObject)FIVE_INTEGER);
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                    module0642.f39020(module0015.$g222$.getGlobalValue());
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                    module0642.f39020(module0642.f39042((SubLObject)$ic111$));
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                    module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                    final SubLObject var3_583 = module0015.$g533$.currentBinding(var549);
                    try {
                        module0015.$g533$.bind((SubLObject)T, var549);
                        module0642.f39019((SubLObject)$ic467$);
                    }
                    finally {
                        module0015.$g533$.rebind(var3_583, var549);
                    }
                    module0642.f39020(module0015.$g220$.getGlobalValue());
                    module0642.f39020(module0015.$g235$.getGlobalValue());
                }
                finally {
                    module0015.$g533$.rebind(var3_582, var549);
                }
                module0642.f39020(module0015.$g361$.getGlobalValue());
                module0642.f39020(module0015.$g360$.getGlobalValue());
                module0642.f39020(module0015.$g370$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                module0642.f39020(module0642.f39049((SubLObject)$ic34$));
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                final SubLObject var3_584 = module0015.$g533$.currentBinding(var549);
                try {
                    module0015.$g533$.bind((SubLObject)T, var549);
                    module0642.f39020(module0015.$g234$.getGlobalValue());
                    SubLObject var551 = (SubLObject)FIVE_INTEGER;
                    module0642.f39020(module0015.$g219$.getGlobalValue());
                    if (NIL != var551) {
                        module0642.f39020(module0015.$g221$.getGlobalValue());
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                        module0642.f39020(var551);
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                    }
                    module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                    final SubLObject var3_585 = module0015.$g533$.currentBinding(var549);
                    try {
                        module0015.$g533$.bind((SubLObject)T, var549);
                        PrintLow.format(module0015.$g131$.getDynamicValue(var549), (SubLObject)$ic468$, var548);
                    }
                    finally {
                        module0015.$g533$.rebind(var3_585, var549);
                    }
                    module0642.f39020(module0015.$g220$.getGlobalValue());
                    if (var536 == $ic422$) {
                        var551 = (SubLObject)FOUR_INTEGER;
                        module0642.f39020(module0015.$g219$.getGlobalValue());
                        if (NIL != var551) {
                            module0642.f39020(module0015.$g221$.getGlobalValue());
                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                            module0642.f39020(var551);
                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                        }
                        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                        final SubLObject var3_586 = module0015.$g533$.currentBinding(var549);
                        try {
                            module0015.$g533$.bind((SubLObject)T, var549);
                            module0642.f39019((SubLObject)$ic469$);
                        }
                        finally {
                            module0015.$g533$.rebind(var3_586, var549);
                        }
                        module0642.f39020(module0015.$g220$.getGlobalValue());
                    }
                    module0642.f39020(module0015.$g235$.getGlobalValue());
                }
                finally {
                    module0015.$g533$.rebind(var3_584, var549);
                }
                module0642.f39020(module0015.$g361$.getGlobalValue());
            }
            finally {
                module0015.$g533$.rebind(var550, var549);
            }
            module0642.f39020(module0015.$g365$.getGlobalValue());
            module0642.f39029((SubLObject)UNPROVIDED);
        }
        else {
            f40882(var548, (SubLObject)T);
        }
        return (SubLObject)NIL;
    }

    public static SubLObject f40882(final SubLObject var160, SubLObject var587) {
        if (var587 == UNPROVIDED) {
            var587 = (SubLObject)NIL;
        }
        final SubLThread var588 = SubLProcess.currentSubLThread();
        module0642.f39020(module0015.$g364$.getGlobalValue());
        module0642.f39020(module0015.$g373$.getGlobalValue());
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        module0642.f39020(module0642.f39049((SubLObject)$ic466$));
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
        final SubLObject var589 = module0015.$g533$.currentBinding(var588);
        try {
            module0015.$g533$.bind((SubLObject)T, var588);
            module0642.f39020(module0015.$g360$.getGlobalValue());
            module0642.f39020(module0015.$g370$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
            module0642.f39020(module0642.f39049((SubLObject)$ic116$));
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
            final SubLObject var3_588 = module0015.$g533$.currentBinding(var588);
            try {
                module0015.$g533$.bind((SubLObject)T, var588);
                module0642.f39032((SubLObject)UNPROVIDED);
            }
            finally {
                module0015.$g533$.rebind(var3_588, var588);
            }
            module0642.f39020(module0015.$g361$.getGlobalValue());
            module0642.f39020(module0015.$g360$.getGlobalValue());
            module0642.f39046(module0015.$g369$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
            final SubLObject var3_589 = module0015.$g533$.currentBinding(var588);
            try {
                module0015.$g533$.bind((SubLObject)T, var588);
                if (NIL != var587) {
                    module0642.f39020(module0015.$g234$.getGlobalValue());
                    final SubLObject var590 = (SubLObject)FIVE_INTEGER;
                    module0642.f39020(module0015.$g219$.getGlobalValue());
                    if (NIL != var590) {
                        module0642.f39020(module0015.$g221$.getGlobalValue());
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                        module0642.f39020(var590);
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                    }
                    module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                    final SubLObject var3_590 = module0015.$g533$.currentBinding(var588);
                    try {
                        module0015.$g533$.bind((SubLObject)T, var588);
                        module0656.f39915(var160, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                    }
                    finally {
                        module0015.$g533$.rebind(var3_590, var588);
                    }
                    module0642.f39020(module0015.$g220$.getGlobalValue());
                    module0642.f39020(module0015.$g235$.getGlobalValue());
                }
                else {
                    module0656.f39915(var160, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                }
            }
            finally {
                module0015.$g533$.rebind(var3_589, var588);
            }
            module0642.f39020(module0015.$g361$.getGlobalValue());
        }
        finally {
            module0015.$g533$.rebind(var589, var588);
        }
        module0642.f39020(module0015.$g365$.getGlobalValue());
        module0642.f39029((SubLObject)UNPROVIDED);
        return (SubLObject)NIL;
    }

    public static SubLObject f40868(final SubLObject var152, final SubLObject var591, final SubLObject var592) {
        final SubLThread var593 = SubLProcess.currentSubLThread();
        var593.resetMultipleValues();
        final SubLObject var594 = f40884(var152, var591, var592);
        final SubLObject var595 = var593.secondMultipleValue();
        var593.resetMultipleValues();
        if (NIL != var595 && constants_high_oc.f10743(var595.first()).equal(var152)) {
            return Values.values(var595.first(), var594, var595.rest());
        }
        return Values.values((SubLObject)NIL, var594, var595);
    }

    public static SubLObject f40884(final SubLObject var152, final SubLObject var591, final SubLObject var592) {
        assert NIL != Types.stringp(var152) : var152;
        assert NIL != Types.fixnump(var591) : var591;
        assert NIL != Types.fixnump(var592) : var592;
        final SubLObject var593 = module0126.f8402(var591, var152, (SubLObject)T, (SubLObject)ZERO_INTEGER, (SubLObject)NIL, (SubLObject)T);
        final SubLObject var594 = module0126.f8403(var592, var152, (SubLObject)T, (SubLObject)ZERO_INTEGER, (SubLObject)NIL, (SubLObject)NIL);
        return Values.values(Sequences.nreverse(var593), var594);
    }

    public static SubLObject f40885(final SubLObject var160) {
        final SubLThread var161 = SubLProcess.currentSubLThread();
        if (NIL != constant_handles_oc.f8463(var160, (SubLObject)UNPROVIDED)) {
            $g5296$.setDynamicValue(Numbers.add($g5296$.getDynamicValue(var161), (SubLObject)ONE_INTEGER), var161);
            $g5297$.setDynamicValue((SubLObject)ConsesLow.cons(var160, $g5297$.getDynamicValue(var161)), var161);
            if ($g5296$.getDynamicValue(var161).numGE($g5295$.getDynamicValue(var161))) {
                module0012.f425();
            }
        }
        return (SubLObject)NIL;
    }

    public static SubLObject f40610(final SubLObject var8) {
        final SubLThread var9 = SubLProcess.currentSubLThread();
        SubLObject var10 = (SubLObject)NIL;
        final SubLObject var11 = module0656.$g5172$.currentBinding(var9);
        try {
            module0656.$g5172$.bind(module0661.f40305(), var9);
            if (NIL != module0661.f40245((SubLObject)$ic397$)) {
                var10 = Numbers.add(new SubLObject[] { f40633(var8, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED), f40639(var8, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED), f40644(var8, (SubLObject)UNPROVIDED), f40647(var8, (SubLObject)UNPROVIDED), f40648(var8, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED), f40654(var8, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED), f40658(var8, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED), f40668(var8, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED), f40673(var8, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED), f40678(var8, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED), f40688(var8), f40687(var8) });
            }
            else {
                var10 = module0217.f14357(var8);
            }
        }
        finally {
            module0656.$g5172$.rebind(var11, var9);
        }
        return var10;
    }

    public static SubLObject f40633(final SubLObject var8, SubLObject var596, SubLObject var35, SubLObject var37) {
        if (var596 == UNPROVIDED) {
            var596 = (SubLObject)NIL;
        }
        if (var35 == UNPROVIDED) {
            var35 = (SubLObject)NIL;
        }
        if (var37 == UNPROVIDED) {
            var37 = (SubLObject)NIL;
        }
        final SubLThread var597 = SubLProcess.currentSubLThread();
        SubLObject var598 = (SubLObject)ZERO_INTEGER;
        final SubLObject var599 = module0656.$g5172$.currentBinding(var597);
        try {
            module0656.$g5172$.bind(module0661.f40305(), var597);
            if (NIL != module0661.f40245((SubLObject)$ic397$) && NIL == var37) {
                if (NIL != module0655.f39751()) {
                    final SubLObject var3_597 = module0147.$g2094$.currentBinding(var597);
                    final SubLObject var600 = module0147.$g2096$.currentBinding(var597);
                    try {
                        module0147.$g2094$.bind((SubLObject)$ic398$, var597);
                        module0147.$g2096$.bind(module0661.f40271(), var597);
                        var598 = module0217.f14223(var8, var596, var35);
                    }
                    finally {
                        module0147.$g2096$.rebind(var600, var597);
                        module0147.$g2094$.rebind(var3_597, var597);
                    }
                }
                else {
                    final SubLObject var3_598 = module0147.$g2094$.currentBinding(var597);
                    final SubLObject var600 = module0147.$g2096$.currentBinding(var597);
                    try {
                        module0147.$g2094$.bind((SubLObject)$ic399$, var597);
                        module0147.$g2096$.bind(module0661.f40271(), var597);
                        var598 = module0217.f14223(var8, var596, var35);
                    }
                    finally {
                        module0147.$g2096$.rebind(var600, var597);
                        module0147.$g2094$.rebind(var3_598, var597);
                    }
                }
            }
            else {
                var598 = module0217.f14221(var8, var596, var35, var37);
            }
        }
        finally {
            module0656.$g5172$.rebind(var599, var597);
        }
        return var598;
    }

    public static SubLObject f40639(final SubLObject var8, SubLObject var596, SubLObject var40, SubLObject var37) {
        if (var596 == UNPROVIDED) {
            var596 = (SubLObject)NIL;
        }
        if (var40 == UNPROVIDED) {
            var40 = (SubLObject)NIL;
        }
        if (var37 == UNPROVIDED) {
            var37 = (SubLObject)NIL;
        }
        final SubLThread var597 = SubLProcess.currentSubLThread();
        SubLObject var598 = (SubLObject)ZERO_INTEGER;
        final SubLObject var599 = module0656.$g5172$.currentBinding(var597);
        try {
            module0656.$g5172$.bind(module0661.f40305(), var597);
            if (NIL != module0661.f40245((SubLObject)$ic397$) && NIL == var37) {
                if (NIL != module0655.f39751()) {
                    final SubLObject var3_599 = module0147.$g2094$.currentBinding(var597);
                    final SubLObject var600 = module0147.$g2096$.currentBinding(var597);
                    try {
                        module0147.$g2094$.bind((SubLObject)$ic398$, var597);
                        module0147.$g2096$.bind(module0661.f40271(), var597);
                        var598 = module0217.f14240(var8, var596, var40);
                    }
                    finally {
                        module0147.$g2096$.rebind(var600, var597);
                        module0147.$g2094$.rebind(var3_599, var597);
                    }
                }
                else {
                    final SubLObject var3_600 = module0147.$g2094$.currentBinding(var597);
                    final SubLObject var600 = module0147.$g2096$.currentBinding(var597);
                    try {
                        module0147.$g2094$.bind((SubLObject)$ic399$, var597);
                        module0147.$g2096$.bind(module0661.f40271(), var597);
                        var598 = module0217.f14240(var8, var596, var40);
                    }
                    finally {
                        module0147.$g2096$.rebind(var600, var597);
                        module0147.$g2094$.rebind(var3_600, var597);
                    }
                }
            }
            else {
                var598 = module0217.f14238(var8, var596, var40);
            }
        }
        finally {
            module0656.$g5172$.rebind(var599, var597);
        }
        return var598;
    }

    public static SubLObject f40644(final SubLObject var35, SubLObject var37) {
        if (var37 == UNPROVIDED) {
            var37 = (SubLObject)NIL;
        }
        final SubLThread var38 = SubLProcess.currentSubLThread();
        SubLObject var39 = (SubLObject)ZERO_INTEGER;
        final SubLObject var40 = module0656.$g5172$.currentBinding(var38);
        try {
            module0656.$g5172$.bind(module0661.f40305(), var38);
            if (NIL != module0661.f40245((SubLObject)$ic397$) && NIL == var37) {
                if (NIL != module0655.f39751()) {
                    final SubLObject var3_601 = module0147.$g2094$.currentBinding(var38);
                    final SubLObject var41 = module0147.$g2096$.currentBinding(var38);
                    try {
                        module0147.$g2094$.bind((SubLObject)$ic398$, var38);
                        module0147.$g2096$.bind(module0661.f40271(), var38);
                        var39 = module0217.f14249(var35);
                    }
                    finally {
                        module0147.$g2096$.rebind(var41, var38);
                        module0147.$g2094$.rebind(var3_601, var38);
                    }
                }
                else {
                    final SubLObject var3_602 = module0147.$g2094$.currentBinding(var38);
                    final SubLObject var41 = module0147.$g2096$.currentBinding(var38);
                    try {
                        module0147.$g2094$.bind((SubLObject)$ic399$, var38);
                        module0147.$g2096$.bind(module0661.f40271(), var38);
                        var39 = module0217.f14249(var35);
                    }
                    finally {
                        module0147.$g2096$.rebind(var41, var38);
                        module0147.$g2094$.rebind(var3_602, var38);
                    }
                }
            }
            else {
                var39 = module0217.f14247(var35, var37);
            }
        }
        finally {
            module0656.$g5172$.rebind(var40, var38);
        }
        return var39;
    }

    public static SubLObject f40647(final SubLObject var40, SubLObject var37) {
        if (var37 == UNPROVIDED) {
            var37 = (SubLObject)NIL;
        }
        final SubLThread var41 = SubLProcess.currentSubLThread();
        SubLObject var42 = (SubLObject)ZERO_INTEGER;
        final SubLObject var43 = module0656.$g5172$.currentBinding(var41);
        try {
            module0656.$g5172$.bind(module0661.f40305(), var41);
            if (NIL != module0661.f40245((SubLObject)$ic397$) && NIL == var37) {
                if (NIL != module0655.f39751()) {
                    final SubLObject var3_603 = module0147.$g2094$.currentBinding(var41);
                    final SubLObject var44 = module0147.$g2096$.currentBinding(var41);
                    try {
                        module0147.$g2094$.bind((SubLObject)$ic398$, var41);
                        module0147.$g2096$.bind(module0661.f40271(), var41);
                        var42 = module0217.f14259(var40);
                    }
                    finally {
                        module0147.$g2096$.rebind(var44, var41);
                        module0147.$g2094$.rebind(var3_603, var41);
                    }
                }
                else {
                    final SubLObject var3_604 = module0147.$g2094$.currentBinding(var41);
                    final SubLObject var44 = module0147.$g2096$.currentBinding(var41);
                    try {
                        module0147.$g2094$.bind((SubLObject)$ic399$, var41);
                        module0147.$g2096$.bind(module0661.f40271(), var41);
                        var42 = module0217.f14259(var40);
                    }
                    finally {
                        module0147.$g2096$.rebind(var44, var41);
                        module0147.$g2094$.rebind(var3_604, var41);
                    }
                }
            }
            else {
                var42 = module0217.f14257(var40);
            }
        }
        finally {
            module0656.$g5172$.rebind(var43, var41);
        }
        return var42;
    }

    public static SubLObject f40648(final SubLObject var35, SubLObject var44, SubLObject var37, SubLObject var46) {
        if (var44 == UNPROVIDED) {
            var44 = (SubLObject)NIL;
        }
        if (var37 == UNPROVIDED) {
            var37 = (SubLObject)NIL;
        }
        if (var46 == UNPROVIDED) {
            var46 = (SubLObject)NIL;
        }
        final SubLThread var47 = SubLProcess.currentSubLThread();
        SubLObject var48 = (SubLObject)ZERO_INTEGER;
        final SubLObject var49 = module0656.$g5172$.currentBinding(var47);
        try {
            module0656.$g5172$.bind(module0661.f40305(), var47);
            if (NIL != module0661.f40245((SubLObject)$ic397$) && NIL == var37) {
                if (NIL != module0655.f39751()) {
                    final SubLObject var3_605 = module0147.$g2094$.currentBinding(var47);
                    final SubLObject var50 = module0147.$g2096$.currentBinding(var47);
                    try {
                        module0147.$g2094$.bind((SubLObject)$ic398$, var47);
                        module0147.$g2096$.bind(module0661.f40271(), var47);
                        var48 = module0217.f14266(var35, var44);
                    }
                    finally {
                        module0147.$g2096$.rebind(var50, var47);
                        module0147.$g2094$.rebind(var3_605, var47);
                    }
                }
                else {
                    final SubLObject var3_606 = module0147.$g2094$.currentBinding(var47);
                    final SubLObject var50 = module0147.$g2096$.currentBinding(var47);
                    try {
                        module0147.$g2094$.bind((SubLObject)$ic399$, var47);
                        module0147.$g2096$.bind(module0661.f40271(), var47);
                        var48 = module0217.f14266(var35, var44);
                    }
                    finally {
                        module0147.$g2096$.rebind(var50, var47);
                        module0147.$g2094$.rebind(var3_606, var47);
                    }
                }
            }
            else {
                var48 = module0217.f14264(var35, var44, var37, var46);
            }
        }
        finally {
            module0656.$g5172$.rebind(var49, var47);
        }
        return var48;
    }

    public static SubLObject f40654(final SubLObject var35, SubLObject var44, SubLObject var46) {
        if (var44 == UNPROVIDED) {
            var44 = (SubLObject)NIL;
        }
        if (var46 == UNPROVIDED) {
            var46 = (SubLObject)NIL;
        }
        final SubLThread var47 = SubLProcess.currentSubLThread();
        SubLObject var48 = (SubLObject)ZERO_INTEGER;
        final SubLObject var49 = module0656.$g5172$.currentBinding(var47);
        try {
            module0656.$g5172$.bind(module0661.f40305(), var47);
            if (NIL != module0661.f40245((SubLObject)$ic397$)) {
                if (NIL != module0655.f39751()) {
                    final SubLObject var3_607 = module0147.$g2094$.currentBinding(var47);
                    final SubLObject var50 = module0147.$g2096$.currentBinding(var47);
                    try {
                        module0147.$g2094$.bind((SubLObject)$ic398$, var47);
                        module0147.$g2096$.bind(module0661.f40271(), var47);
                        var48 = module0217.f14272(var35, var44, (SubLObject)UNPROVIDED);
                    }
                    finally {
                        module0147.$g2096$.rebind(var50, var47);
                        module0147.$g2094$.rebind(var3_607, var47);
                    }
                }
                else {
                    final SubLObject var3_608 = module0147.$g2094$.currentBinding(var47);
                    final SubLObject var50 = module0147.$g2096$.currentBinding(var47);
                    try {
                        module0147.$g2094$.bind((SubLObject)$ic399$, var47);
                        module0147.$g2096$.bind(module0661.f40271(), var47);
                        var48 = module0217.f14272(var35, var44, (SubLObject)UNPROVIDED);
                    }
                    finally {
                        module0147.$g2096$.rebind(var50, var47);
                        module0147.$g2094$.rebind(var3_608, var47);
                    }
                }
            }
            else {
                var48 = module0217.f14272(var35, var44, var46);
            }
        }
        finally {
            module0656.$g5172$.rebind(var49, var47);
        }
        return var48;
    }

    public static SubLObject f40658(final SubLObject var609, SubLObject var44, SubLObject var37, SubLObject var46) {
        if (var44 == UNPROVIDED) {
            var44 = (SubLObject)NIL;
        }
        if (var37 == UNPROVIDED) {
            var37 = (SubLObject)NIL;
        }
        if (var46 == UNPROVIDED) {
            var46 = (SubLObject)NIL;
        }
        final SubLThread var610 = SubLProcess.currentSubLThread();
        SubLObject var611 = (SubLObject)ZERO_INTEGER;
        final SubLObject var612 = module0656.$g5172$.currentBinding(var610);
        try {
            module0656.$g5172$.bind(module0661.f40305(), var610);
            if (NIL != module0661.f40245((SubLObject)$ic397$) && NIL == var37) {
                if (NIL != module0655.f39751()) {
                    final SubLObject var3_610 = module0147.$g2094$.currentBinding(var610);
                    final SubLObject var613 = module0147.$g2096$.currentBinding(var610);
                    try {
                        module0147.$g2094$.bind((SubLObject)$ic398$, var610);
                        module0147.$g2096$.bind(module0661.f40271(), var610);
                        var611 = module0217.f14279(var609, var44);
                    }
                    finally {
                        module0147.$g2096$.rebind(var613, var610);
                        module0147.$g2094$.rebind(var3_610, var610);
                    }
                }
                else {
                    final SubLObject var3_611 = module0147.$g2094$.currentBinding(var610);
                    final SubLObject var613 = module0147.$g2096$.currentBinding(var610);
                    try {
                        module0147.$g2094$.bind((SubLObject)$ic399$, var610);
                        module0147.$g2096$.bind(module0661.f40271(), var610);
                        var611 = module0217.f14279(var609, var44);
                    }
                    finally {
                        module0147.$g2096$.rebind(var613, var610);
                        module0147.$g2094$.rebind(var3_611, var610);
                    }
                }
            }
            else {
                var611 = module0217.f14277(var609, var44, var37, var46);
            }
        }
        finally {
            module0656.$g5172$.rebind(var612, var610);
        }
        return var611;
    }

    public static SubLObject f40663(final SubLObject var609, SubLObject var44, SubLObject var37, SubLObject var46) {
        if (var44 == UNPROVIDED) {
            var44 = (SubLObject)NIL;
        }
        if (var37 == UNPROVIDED) {
            var37 = (SubLObject)NIL;
        }
        if (var46 == UNPROVIDED) {
            var46 = (SubLObject)NIL;
        }
        final SubLThread var610 = SubLProcess.currentSubLThread();
        SubLObject var611 = (SubLObject)ZERO_INTEGER;
        final SubLObject var612 = module0656.$g5172$.currentBinding(var610);
        try {
            module0656.$g5172$.bind(module0661.f40305(), var610);
            if (NIL != module0661.f40245((SubLObject)$ic397$) && NIL == var37) {
                if (NIL != module0655.f39751()) {
                    final SubLObject var3_612 = module0147.$g2094$.currentBinding(var610);
                    final SubLObject var613 = module0147.$g2096$.currentBinding(var610);
                    try {
                        module0147.$g2094$.bind((SubLObject)$ic398$, var610);
                        module0147.$g2096$.bind(module0661.f40271(), var610);
                        var611 = module0217.f14287(var609, var44);
                    }
                    finally {
                        module0147.$g2096$.rebind(var613, var610);
                        module0147.$g2094$.rebind(var3_612, var610);
                    }
                }
                else {
                    final SubLObject var3_613 = module0147.$g2094$.currentBinding(var610);
                    final SubLObject var613 = module0147.$g2096$.currentBinding(var610);
                    try {
                        module0147.$g2094$.bind((SubLObject)$ic399$, var610);
                        module0147.$g2096$.bind(module0661.f40271(), var610);
                        var611 = module0217.f14287(var609, var44);
                    }
                    finally {
                        module0147.$g2096$.rebind(var613, var610);
                        module0147.$g2094$.rebind(var3_613, var610);
                    }
                }
            }
            else {
                var611 = module0217.f14285(var609, var44, var37, var46);
            }
        }
        finally {
            module0656.$g5172$.rebind(var612, var610);
        }
        return var611;
    }

    public static SubLObject f40668(final SubLObject var609, SubLObject var44, SubLObject var37, SubLObject var46) {
        if (var44 == UNPROVIDED) {
            var44 = (SubLObject)NIL;
        }
        if (var37 == UNPROVIDED) {
            var37 = (SubLObject)NIL;
        }
        if (var46 == UNPROVIDED) {
            var46 = (SubLObject)NIL;
        }
        final SubLThread var610 = SubLProcess.currentSubLThread();
        SubLObject var611 = (SubLObject)ZERO_INTEGER;
        final SubLObject var612 = module0656.$g5172$.currentBinding(var610);
        try {
            module0656.$g5172$.bind(module0661.f40305(), var610);
            if (NIL != module0661.f40245((SubLObject)$ic397$) && NIL == var37) {
                if (NIL != module0655.f39751()) {
                    final SubLObject var3_614 = module0147.$g2094$.currentBinding(var610);
                    final SubLObject var613 = module0147.$g2096$.currentBinding(var610);
                    try {
                        module0147.$g2094$.bind((SubLObject)$ic398$, var610);
                        module0147.$g2096$.bind(module0661.f40271(), var610);
                        var611 = module0217.f14295(var609, var44);
                    }
                    finally {
                        module0147.$g2096$.rebind(var613, var610);
                        module0147.$g2094$.rebind(var3_614, var610);
                    }
                }
                else {
                    final SubLObject var3_615 = module0147.$g2094$.currentBinding(var610);
                    final SubLObject var613 = module0147.$g2096$.currentBinding(var610);
                    try {
                        module0147.$g2094$.bind((SubLObject)$ic399$, var610);
                        module0147.$g2096$.bind(module0661.f40271(), var610);
                        var611 = module0217.f14295(var609, var44);
                    }
                    finally {
                        module0147.$g2096$.rebind(var613, var610);
                        module0147.$g2094$.rebind(var3_615, var610);
                    }
                }
            }
            else {
                var611 = module0217.f14293(var609, var44, var37, var46);
            }
        }
        finally {
            module0656.$g5172$.rebind(var612, var610);
        }
        return var611;
    }

    public static SubLObject f40673(final SubLObject var48, SubLObject var44, SubLObject var49, SubLObject var46) {
        if (var44 == UNPROVIDED) {
            var44 = (SubLObject)NIL;
        }
        if (var49 == UNPROVIDED) {
            var49 = (SubLObject)NIL;
        }
        if (var46 == UNPROVIDED) {
            var46 = (SubLObject)NIL;
        }
        final SubLThread var50 = SubLProcess.currentSubLThread();
        SubLObject var51 = (SubLObject)ZERO_INTEGER;
        final SubLObject var52 = module0656.$g5172$.currentBinding(var50);
        try {
            module0656.$g5172$.bind(module0661.f40305(), var50);
            if (NIL != module0661.f40245((SubLObject)$ic397$) && NIL == var49) {
                if (NIL != module0655.f39751()) {
                    final SubLObject var3_616 = module0147.$g2094$.currentBinding(var50);
                    final SubLObject var53 = module0147.$g2096$.currentBinding(var50);
                    try {
                        module0147.$g2094$.bind((SubLObject)$ic398$, var50);
                        module0147.$g2096$.bind(module0661.f40271(), var50);
                        var51 = module0217.f14303(var48, var44);
                    }
                    finally {
                        module0147.$g2096$.rebind(var53, var50);
                        module0147.$g2094$.rebind(var3_616, var50);
                    }
                }
                else {
                    final SubLObject var3_617 = module0147.$g2094$.currentBinding(var50);
                    final SubLObject var53 = module0147.$g2096$.currentBinding(var50);
                    try {
                        module0147.$g2094$.bind((SubLObject)$ic399$, var50);
                        module0147.$g2096$.bind(module0661.f40271(), var50);
                        var51 = module0217.f14303(var48, var44);
                    }
                    finally {
                        module0147.$g2096$.rebind(var53, var50);
                        module0147.$g2094$.rebind(var3_617, var50);
                    }
                }
            }
            else {
                var51 = module0217.f14301(var48, var44, var49, var46);
            }
        }
        finally {
            module0656.$g5172$.rebind(var52, var50);
        }
        return var51;
    }

    public static SubLObject f40678(final SubLObject var40, SubLObject var37, SubLObject var46) {
        if (var37 == UNPROVIDED) {
            var37 = (SubLObject)NIL;
        }
        if (var46 == UNPROVIDED) {
            var46 = (SubLObject)NIL;
        }
        final SubLThread var47 = SubLProcess.currentSubLThread();
        SubLObject var48 = (SubLObject)ZERO_INTEGER;
        final SubLObject var49 = module0656.$g5172$.currentBinding(var47);
        try {
            module0656.$g5172$.bind(module0661.f40305(), var47);
            if (NIL != module0661.f40245((SubLObject)$ic397$) && NIL == var37) {
                if (NIL != module0655.f39751()) {
                    final SubLObject var3_618 = module0147.$g2094$.currentBinding(var47);
                    final SubLObject var50 = module0147.$g2096$.currentBinding(var47);
                    try {
                        module0147.$g2094$.bind((SubLObject)$ic398$, var47);
                        module0147.$g2096$.bind(module0661.f40271(), var47);
                        var48 = module0217.f14311(var40);
                    }
                    finally {
                        module0147.$g2096$.rebind(var50, var47);
                        module0147.$g2094$.rebind(var3_618, var47);
                    }
                }
                else {
                    final SubLObject var3_619 = module0147.$g2094$.currentBinding(var47);
                    final SubLObject var50 = module0147.$g2096$.currentBinding(var47);
                    try {
                        module0147.$g2094$.bind((SubLObject)$ic399$, var47);
                        module0147.$g2096$.bind(module0661.f40271(), var47);
                        var48 = module0217.f14311(var40);
                    }
                    finally {
                        module0147.$g2096$.rebind(var50, var47);
                        module0147.$g2094$.rebind(var3_619, var47);
                    }
                }
            }
            else {
                var48 = module0217.f14309(var40, var37, var46);
            }
        }
        finally {
            module0656.$g5172$.rebind(var49, var47);
        }
        return var48;
    }

    public static SubLObject f40886(final SubLObject var502, SubLObject var37, SubLObject var46) {
        if (var37 == UNPROVIDED) {
            var37 = (SubLObject)NIL;
        }
        if (var46 == UNPROVIDED) {
            var46 = (SubLObject)NIL;
        }
        final SubLThread var503 = SubLProcess.currentSubLThread();
        SubLObject var504 = (SubLObject)ZERO_INTEGER;
        final SubLObject var505 = module0656.$g5172$.currentBinding(var503);
        try {
            module0656.$g5172$.bind(module0661.f40305(), var503);
            if (NIL != module0661.f40245((SubLObject)$ic397$) && NIL == var37) {
                if (NIL != module0655.f39751()) {
                    final SubLObject var3_620 = module0147.$g2094$.currentBinding(var503);
                    final SubLObject var506 = module0147.$g2096$.currentBinding(var503);
                    try {
                        module0147.$g2094$.bind((SubLObject)$ic398$, var503);
                        module0147.$g2096$.bind(module0661.f40271(), var503);
                        var504 = module0217.f14320(var502);
                    }
                    finally {
                        module0147.$g2096$.rebind(var506, var503);
                        module0147.$g2094$.rebind(var3_620, var503);
                    }
                }
                else {
                    final SubLObject var3_621 = module0147.$g2094$.currentBinding(var503);
                    final SubLObject var506 = module0147.$g2096$.currentBinding(var503);
                    try {
                        module0147.$g2094$.bind((SubLObject)$ic399$, var503);
                        module0147.$g2096$.bind(module0661.f40271(), var503);
                        var504 = module0217.f14320(var502);
                    }
                    finally {
                        module0147.$g2096$.rebind(var506, var503);
                        module0147.$g2094$.rebind(var3_621, var503);
                    }
                }
            }
            else {
                var504 = module0217.f14318(var502, var37, var46);
            }
        }
        finally {
            module0656.$g5172$.rebind(var505, var503);
        }
        return var504;
    }

    public static SubLObject f40887(final SubLObject var502, SubLObject var37, SubLObject var46) {
        if (var37 == UNPROVIDED) {
            var37 = (SubLObject)NIL;
        }
        if (var46 == UNPROVIDED) {
            var46 = (SubLObject)NIL;
        }
        final SubLThread var503 = SubLProcess.currentSubLThread();
        SubLObject var504 = (SubLObject)ZERO_INTEGER;
        final SubLObject var505 = module0656.$g5172$.currentBinding(var503);
        try {
            module0656.$g5172$.bind(module0661.f40305(), var503);
            if (NIL != module0661.f40245((SubLObject)$ic397$) && NIL == var37) {
                if (NIL != module0655.f39751()) {
                    final SubLObject var3_622 = module0147.$g2094$.currentBinding(var503);
                    final SubLObject var506 = module0147.$g2096$.currentBinding(var503);
                    try {
                        module0147.$g2094$.bind((SubLObject)$ic398$, var503);
                        module0147.$g2096$.bind(module0661.f40271(), var503);
                        var504 = module0217.f14329(var502);
                    }
                    finally {
                        module0147.$g2096$.rebind(var506, var503);
                        module0147.$g2094$.rebind(var3_622, var503);
                    }
                }
                else {
                    final SubLObject var3_623 = module0147.$g2094$.currentBinding(var503);
                    final SubLObject var506 = module0147.$g2096$.currentBinding(var503);
                    try {
                        module0147.$g2094$.bind((SubLObject)$ic399$, var503);
                        module0147.$g2096$.bind(module0661.f40271(), var503);
                        var504 = module0217.f14329(var502);
                    }
                    finally {
                        module0147.$g2096$.rebind(var506, var503);
                        module0147.$g2094$.rebind(var3_623, var503);
                    }
                }
            }
            else {
                var504 = module0217.f14327(var502, var37, var46);
            }
        }
        finally {
            module0656.$g5172$.rebind(var505, var503);
        }
        return var504;
    }

    public static SubLObject f40682(SubLObject var44, SubLObject var37, SubLObject var46) {
        if (var44 == UNPROVIDED) {
            var44 = (SubLObject)NIL;
        }
        if (var37 == UNPROVIDED) {
            var37 = (SubLObject)NIL;
        }
        if (var46 == UNPROVIDED) {
            var46 = (SubLObject)NIL;
        }
        final SubLThread var47 = SubLProcess.currentSubLThread();
        SubLObject var48 = (SubLObject)ZERO_INTEGER;
        final SubLObject var49 = module0656.$g5172$.currentBinding(var47);
        try {
            module0656.$g5172$.bind(module0661.f40305(), var47);
            if (NIL != module0661.f40245((SubLObject)$ic397$) && NIL == var37) {
                if (NIL != module0655.f39751()) {
                    final SubLObject var3_624 = module0147.$g2094$.currentBinding(var47);
                    final SubLObject var50 = module0147.$g2096$.currentBinding(var47);
                    try {
                        module0147.$g2094$.bind((SubLObject)$ic398$, var47);
                        module0147.$g2096$.bind(module0661.f40271(), var47);
                        var48 = module0223.f14676(var44);
                    }
                    finally {
                        module0147.$g2096$.rebind(var50, var47);
                        module0147.$g2094$.rebind(var3_624, var47);
                    }
                }
                else {
                    final SubLObject var3_625 = module0147.$g2094$.currentBinding(var47);
                    final SubLObject var50 = module0147.$g2096$.currentBinding(var47);
                    try {
                        module0147.$g2094$.bind((SubLObject)$ic399$, var47);
                        module0147.$g2096$.bind(module0661.f40271(), var47);
                        var48 = module0223.f14676(var44);
                    }
                    finally {
                        module0147.$g2096$.rebind(var50, var47);
                        module0147.$g2094$.rebind(var3_625, var47);
                    }
                }
            }
            else {
                var48 = module0223.f14673(var44, var37, var46);
            }
        }
        finally {
            module0656.$g5172$.rebind(var49, var47);
        }
        return var48;
    }

    public static SubLObject f40687(final SubLObject var8) {
        final SubLThread var9 = SubLProcess.currentSubLThread();
        SubLObject var10 = (SubLObject)ZERO_INTEGER;
        final SubLObject var11 = module0656.$g5172$.currentBinding(var9);
        try {
            module0656.$g5172$.bind(module0661.f40305(), var9);
            if (NIL != module0661.f40245((SubLObject)$ic397$)) {
                if (NIL != module0655.f39751()) {
                    final SubLObject var3_626 = module0147.$g2094$.currentBinding(var9);
                    final SubLObject var12 = module0147.$g2096$.currentBinding(var9);
                    try {
                        module0147.$g2094$.bind((SubLObject)$ic398$, var9);
                        module0147.$g2096$.bind(module0661.f40271(), var9);
                        var10 = module0217.f14352(var8);
                    }
                    finally {
                        module0147.$g2096$.rebind(var12, var9);
                        module0147.$g2094$.rebind(var3_626, var9);
                    }
                }
                else {
                    final SubLObject var3_627 = module0147.$g2094$.currentBinding(var9);
                    final SubLObject var12 = module0147.$g2096$.currentBinding(var9);
                    try {
                        module0147.$g2094$.bind((SubLObject)$ic399$, var9);
                        module0147.$g2096$.bind(module0661.f40271(), var9);
                        var10 = module0217.f14352(var8);
                    }
                    finally {
                        module0147.$g2096$.rebind(var12, var9);
                        module0147.$g2094$.rebind(var3_627, var9);
                    }
                }
            }
            else {
                var10 = module0217.f14350(var8);
            }
        }
        finally {
            module0656.$g5172$.rebind(var11, var9);
        }
        return var10;
    }

    public static SubLObject f40688(final SubLObject var8) {
        final SubLThread var9 = SubLProcess.currentSubLThread();
        SubLObject var10 = (SubLObject)ZERO_INTEGER;
        final SubLObject var11 = module0656.$g5172$.currentBinding(var9);
        try {
            module0656.$g5172$.bind(module0661.f40305(), var9);
            if (NIL != module0661.f40245((SubLObject)$ic397$)) {
                if (NIL != module0655.f39751()) {
                    final SubLObject var3_628 = module0147.$g2094$.currentBinding(var9);
                    final SubLObject var12 = module0147.$g2096$.currentBinding(var9);
                    try {
                        module0147.$g2094$.bind((SubLObject)$ic398$, var9);
                        module0147.$g2096$.bind(module0661.f40271(), var9);
                        var10 = module0217.f14338(var8);
                    }
                    finally {
                        module0147.$g2096$.rebind(var12, var9);
                        module0147.$g2094$.rebind(var3_628, var9);
                    }
                }
                else {
                    final SubLObject var3_629 = module0147.$g2094$.currentBinding(var9);
                    final SubLObject var12 = module0147.$g2096$.currentBinding(var9);
                    try {
                        module0147.$g2094$.bind((SubLObject)$ic399$, var9);
                        module0147.$g2096$.bind(module0661.f40271(), var9);
                        var10 = module0217.f14338(var8);
                    }
                    finally {
                        module0147.$g2096$.rebind(var12, var9);
                        module0147.$g2094$.rebind(var3_629, var9);
                    }
                }
            }
            else {
                var10 = module0217.f14336(var8);
            }
        }
        finally {
            module0656.$g5172$.rebind(var11, var9);
        }
        return var10;
    }

    public static SubLObject f40689(final SubLObject var8) {
        final SubLThread var9 = SubLProcess.currentSubLThread();
        SubLObject var10 = (SubLObject)ZERO_INTEGER;
        final SubLObject var11 = module0656.$g5172$.currentBinding(var9);
        try {
            module0656.$g5172$.bind(module0661.f40305(), var9);
            if (NIL != module0661.f40245((SubLObject)$ic397$)) {
                if (NIL != module0655.f39751()) {
                    final SubLObject var3_630 = module0147.$g2094$.currentBinding(var9);
                    final SubLObject var12 = module0147.$g2096$.currentBinding(var9);
                    try {
                        module0147.$g2094$.bind((SubLObject)$ic398$, var9);
                        module0147.$g2096$.bind(module0661.f40271(), var9);
                        var10 = module0217.f14347(var8);
                    }
                    finally {
                        module0147.$g2096$.rebind(var12, var9);
                        module0147.$g2094$.rebind(var3_630, var9);
                    }
                }
                else {
                    final SubLObject var3_631 = module0147.$g2094$.currentBinding(var9);
                    final SubLObject var12 = module0147.$g2096$.currentBinding(var9);
                    try {
                        module0147.$g2094$.bind((SubLObject)$ic399$, var9);
                        module0147.$g2096$.bind(module0661.f40271(), var9);
                        var10 = module0217.f14347(var8);
                    }
                    finally {
                        module0147.$g2096$.rebind(var12, var9);
                        module0147.$g2094$.rebind(var3_631, var9);
                    }
                }
            }
            else {
                var10 = module0217.f14346(var8);
            }
        }
        finally {
            module0656.$g5172$.rebind(var11, var9);
        }
        return var10;
    }

    public static SubLObject f40634(final SubLObject var8, SubLObject var32, SubLObject var35, SubLObject var37) {
        if (var32 == UNPROVIDED) {
            var32 = (SubLObject)NIL;
        }
        if (var35 == UNPROVIDED) {
            var35 = (SubLObject)NIL;
        }
        if (var37 == UNPROVIDED) {
            var37 = (SubLObject)NIL;
        }
        final SubLThread var38 = SubLProcess.currentSubLThread();
        SubLObject var39 = (SubLObject)NIL;
        SubLObject var40 = (SubLObject)NIL;
        final SubLObject var41 = module0656.$g5172$.currentBinding(var38);
        try {
            module0656.$g5172$.bind(module0661.f40305(), var38);
            if (NIL != module0661.f40245((SubLObject)$ic397$) && NIL == var37) {
                if (NIL != module0655.f39751()) {
                    final SubLObject var3_633 = module0147.$g2094$.currentBinding(var38);
                    final SubLObject var42 = module0147.$g2096$.currentBinding(var38);
                    try {
                        module0147.$g2094$.bind((SubLObject)$ic398$, var38);
                        module0147.$g2096$.bind(module0661.f40271(), var38);
                        var39 = module0217.f14232(var8, var32, var35);
                    }
                    finally {
                        module0147.$g2096$.rebind(var42, var38);
                        module0147.$g2094$.rebind(var3_633, var38);
                    }
                }
                else {
                    final SubLObject var3_634 = module0147.$g2094$.currentBinding(var38);
                    final SubLObject var42 = module0147.$g2096$.currentBinding(var38);
                    try {
                        module0147.$g2094$.bind((SubLObject)$ic399$, var38);
                        module0147.$g2096$.bind(module0661.f40271(), var38);
                        var39 = module0217.f14232(var8, var32, var35);
                    }
                    finally {
                        module0147.$g2096$.rebind(var42, var38);
                        module0147.$g2094$.rebind(var3_634, var38);
                    }
                }
            }
            else {
                var39 = module0217.f14228(var8, var32, var35);
            }
        }
        finally {
            module0656.$g5172$.rebind(var41, var38);
        }
        if (NIL == var35) {
            if (NIL == var32) {
                var40 = module0656.f39830(var39);
            }
            else {
                var40 = module0656.f39826(var8, var39, (SubLObject)UNPROVIDED);
            }
        }
        else {
            var40 = module0656.f39827(var39);
        }
        return var40;
    }

    public static SubLObject f40640(final SubLObject var8, SubLObject var32, SubLObject var40, SubLObject var37) {
        if (var32 == UNPROVIDED) {
            var32 = (SubLObject)NIL;
        }
        if (var40 == UNPROVIDED) {
            var40 = (SubLObject)NIL;
        }
        if (var37 == UNPROVIDED) {
            var37 = (SubLObject)NIL;
        }
        final SubLThread var41 = SubLProcess.currentSubLThread();
        SubLObject var42 = (SubLObject)NIL;
        SubLObject var43 = (SubLObject)NIL;
        final SubLObject var44 = module0656.$g5172$.currentBinding(var41);
        try {
            module0656.$g5172$.bind(module0661.f40305(), var41);
            if (NIL != module0661.f40245((SubLObject)$ic397$) && NIL == var37) {
                if (NIL != module0655.f39751()) {
                    final SubLObject var3_635 = module0147.$g2094$.currentBinding(var41);
                    final SubLObject var45 = module0147.$g2096$.currentBinding(var41);
                    try {
                        module0147.$g2094$.bind((SubLObject)$ic398$, var41);
                        module0147.$g2096$.bind(module0661.f40271(), var41);
                        var42 = module0217.f14243(var8, var32, var40);
                    }
                    finally {
                        module0147.$g2096$.rebind(var45, var41);
                        module0147.$g2094$.rebind(var3_635, var41);
                    }
                }
                else {
                    final SubLObject var3_636 = module0147.$g2094$.currentBinding(var41);
                    final SubLObject var45 = module0147.$g2096$.currentBinding(var41);
                    try {
                        module0147.$g2094$.bind((SubLObject)$ic399$, var41);
                        module0147.$g2096$.bind(module0661.f40271(), var41);
                        var42 = module0217.f14243(var8, var32, var40);
                    }
                    finally {
                        module0147.$g2096$.rebind(var45, var41);
                        module0147.$g2094$.rebind(var3_636, var41);
                    }
                }
            }
            else {
                var42 = module0217.f14242(var8, var32, var40);
            }
        }
        finally {
            module0656.$g5172$.rebind(var44, var41);
        }
        if (NIL == var40) {
            if (NIL == var32) {
                var43 = module0656.f39830(var42);
            }
            else {
                var43 = module0656.f39826(var8, var42, (SubLObject)UNPROVIDED);
            }
        }
        else {
            var43 = module0656.f39827(var42);
        }
        return var43;
    }

    public static SubLObject f40645(final SubLObject var8) {
        final SubLThread var9 = SubLProcess.currentSubLThread();
        SubLObject var10 = (SubLObject)NIL;
        SubLObject var11 = (SubLObject)NIL;
        final SubLObject var12 = module0656.$g5172$.currentBinding(var9);
        try {
            module0656.$g5172$.bind(module0661.f40305(), var9);
            if (NIL != module0661.f40245((SubLObject)$ic397$)) {
                if (NIL != module0655.f39751()) {
                    final SubLObject var3_637 = module0147.$g2094$.currentBinding(var9);
                    final SubLObject var13 = module0147.$g2096$.currentBinding(var9);
                    try {
                        module0147.$g2094$.bind((SubLObject)$ic398$, var9);
                        module0147.$g2096$.bind(module0661.f40271(), var9);
                        var10 = module0217.f14253(var8);
                    }
                    finally {
                        module0147.$g2096$.rebind(var13, var9);
                        module0147.$g2094$.rebind(var3_637, var9);
                    }
                }
                else {
                    final SubLObject var3_638 = module0147.$g2094$.currentBinding(var9);
                    final SubLObject var13 = module0147.$g2096$.currentBinding(var9);
                    try {
                        module0147.$g2094$.bind((SubLObject)$ic399$, var9);
                        module0147.$g2096$.bind(module0661.f40271(), var9);
                        var10 = module0217.f14253(var8);
                    }
                    finally {
                        module0147.$g2096$.rebind(var13, var9);
                        module0147.$g2094$.rebind(var3_638, var9);
                    }
                }
            }
            else {
                var10 = module0217.f14252(var8);
            }
        }
        finally {
            module0656.$g5172$.rebind(var12, var9);
        }
        var11 = module0656.f39827(var10);
        return var11;
    }

    public static SubLObject f40650(final SubLObject var8, SubLObject var44, SubLObject var37, SubLObject var46) {
        if (var44 == UNPROVIDED) {
            var44 = (SubLObject)NIL;
        }
        if (var37 == UNPROVIDED) {
            var37 = (SubLObject)NIL;
        }
        if (var46 == UNPROVIDED) {
            var46 = (SubLObject)NIL;
        }
        final SubLThread var47 = SubLProcess.currentSubLThread();
        SubLObject var48 = (SubLObject)NIL;
        SubLObject var49 = (SubLObject)NIL;
        final SubLObject var50 = module0656.$g5172$.currentBinding(var47);
        try {
            module0656.$g5172$.bind(module0661.f40305(), var47);
            if (NIL != module0661.f40245((SubLObject)$ic397$) && NIL == var37) {
                if (NIL != module0655.f39751()) {
                    final SubLObject var3_639 = module0147.$g2094$.currentBinding(var47);
                    final SubLObject var51 = module0147.$g2096$.currentBinding(var47);
                    try {
                        module0147.$g2094$.bind((SubLObject)$ic398$, var47);
                        module0147.$g2096$.bind(module0661.f40271(), var47);
                        var48 = module0217.f14269(var8, var44);
                    }
                    finally {
                        module0147.$g2096$.rebind(var51, var47);
                        module0147.$g2094$.rebind(var3_639, var47);
                    }
                }
                else {
                    final SubLObject var3_640 = module0147.$g2094$.currentBinding(var47);
                    final SubLObject var51 = module0147.$g2096$.currentBinding(var47);
                    try {
                        module0147.$g2094$.bind((SubLObject)$ic399$, var47);
                        module0147.$g2096$.bind(module0661.f40271(), var47);
                        var48 = module0217.f14269(var8, var44);
                    }
                    finally {
                        module0147.$g2096$.rebind(var51, var47);
                        module0147.$g2094$.rebind(var3_640, var47);
                    }
                }
            }
            else {
                var48 = module0217.f14268(var8, var44, var37);
            }
        }
        finally {
            module0656.$g5172$.rebind(var50, var47);
        }
        if (NIL != var44 && NIL == var37) {
            var49 = module0656.f39827(var48);
        }
        else {
            var49 = var48;
        }
        return var49;
    }

    public static SubLObject f40656(final SubLObject var8, SubLObject var44, SubLObject var46) {
        if (var44 == UNPROVIDED) {
            var44 = (SubLObject)NIL;
        }
        if (var46 == UNPROVIDED) {
            var46 = (SubLObject)NIL;
        }
        final SubLThread var47 = SubLProcess.currentSubLThread();
        SubLObject var48 = (SubLObject)NIL;
        final SubLObject var49 = module0656.$g5172$.currentBinding(var47);
        try {
            module0656.$g5172$.bind(module0661.f40305(), var47);
            if (NIL != module0661.f40245((SubLObject)$ic397$)) {
                if (NIL != module0655.f39751()) {
                    final SubLObject var3_641 = module0147.$g2094$.currentBinding(var47);
                    final SubLObject var50 = module0147.$g2096$.currentBinding(var47);
                    try {
                        module0147.$g2094$.bind((SubLObject)$ic398$, var47);
                        module0147.$g2096$.bind(module0661.f40271(), var47);
                        var48 = module0217.f14274(var8, var44);
                    }
                    finally {
                        module0147.$g2096$.rebind(var50, var47);
                        module0147.$g2094$.rebind(var3_641, var47);
                    }
                }
                else {
                    final SubLObject var3_642 = module0147.$g2094$.currentBinding(var47);
                    final SubLObject var50 = module0147.$g2096$.currentBinding(var47);
                    try {
                        module0147.$g2094$.bind((SubLObject)$ic399$, var47);
                        module0147.$g2096$.bind(module0661.f40271(), var47);
                        var48 = module0217.f14274(var8, var44);
                    }
                    finally {
                        module0147.$g2096$.rebind(var50, var47);
                        module0147.$g2094$.rebind(var3_642, var47);
                    }
                }
            }
            else {
                var48 = module0217.f14274(var8, var44);
            }
        }
        finally {
            module0656.$g5172$.rebind(var49, var47);
        }
        return var48;
    }

    public static SubLObject f40660(final SubLObject var8, SubLObject var44, SubLObject var37, SubLObject var46) {
        if (var44 == UNPROVIDED) {
            var44 = (SubLObject)NIL;
        }
        if (var37 == UNPROVIDED) {
            var37 = (SubLObject)NIL;
        }
        if (var46 == UNPROVIDED) {
            var46 = (SubLObject)NIL;
        }
        final SubLThread var47 = SubLProcess.currentSubLThread();
        SubLObject var48 = (SubLObject)NIL;
        SubLObject var49 = (SubLObject)NIL;
        final SubLObject var50 = module0656.$g5172$.currentBinding(var47);
        try {
            module0656.$g5172$.bind(module0661.f40305(), var47);
            if (NIL != module0661.f40245((SubLObject)$ic397$) && NIL == var37) {
                if (NIL != module0655.f39751()) {
                    final SubLObject var3_643 = module0147.$g2094$.currentBinding(var47);
                    final SubLObject var51 = module0147.$g2096$.currentBinding(var47);
                    try {
                        module0147.$g2094$.bind((SubLObject)$ic398$, var47);
                        module0147.$g2096$.bind(module0661.f40271(), var47);
                        var48 = module0217.f14282(var8, var44);
                    }
                    finally {
                        module0147.$g2096$.rebind(var51, var47);
                        module0147.$g2094$.rebind(var3_643, var47);
                    }
                }
                else {
                    final SubLObject var3_644 = module0147.$g2094$.currentBinding(var47);
                    final SubLObject var51 = module0147.$g2096$.currentBinding(var47);
                    try {
                        module0147.$g2094$.bind((SubLObject)$ic399$, var47);
                        module0147.$g2096$.bind(module0661.f40271(), var47);
                        var48 = module0217.f14282(var8, var44);
                    }
                    finally {
                        module0147.$g2096$.rebind(var51, var47);
                        module0147.$g2094$.rebind(var3_644, var47);
                    }
                }
            }
            else {
                var48 = module0217.f14281(var8, var44, var37);
            }
        }
        finally {
            module0656.$g5172$.rebind(var50, var47);
        }
        if (NIL != var44 && NIL == var37) {
            var49 = module0656.f39827(var48);
        }
        else {
            var49 = var48;
        }
        return var49;
    }

    public static SubLObject f40665(final SubLObject var8, SubLObject var44, SubLObject var37, SubLObject var46) {
        if (var44 == UNPROVIDED) {
            var44 = (SubLObject)NIL;
        }
        if (var37 == UNPROVIDED) {
            var37 = (SubLObject)NIL;
        }
        if (var46 == UNPROVIDED) {
            var46 = (SubLObject)NIL;
        }
        final SubLThread var47 = SubLProcess.currentSubLThread();
        SubLObject var48 = (SubLObject)NIL;
        SubLObject var49 = (SubLObject)NIL;
        final SubLObject var50 = module0656.$g5172$.currentBinding(var47);
        try {
            module0656.$g5172$.bind(module0661.f40305(), var47);
            if (NIL != module0661.f40245((SubLObject)$ic397$) && NIL == var37) {
                if (NIL != module0655.f39751()) {
                    final SubLObject var3_645 = module0147.$g2094$.currentBinding(var47);
                    final SubLObject var51 = module0147.$g2096$.currentBinding(var47);
                    try {
                        module0147.$g2094$.bind((SubLObject)$ic398$, var47);
                        module0147.$g2096$.bind(module0661.f40271(), var47);
                        var48 = module0217.f14290(var8, var44);
                    }
                    finally {
                        module0147.$g2096$.rebind(var51, var47);
                        module0147.$g2094$.rebind(var3_645, var47);
                    }
                }
                else {
                    final SubLObject var3_646 = module0147.$g2094$.currentBinding(var47);
                    final SubLObject var51 = module0147.$g2096$.currentBinding(var47);
                    try {
                        module0147.$g2094$.bind((SubLObject)$ic399$, var47);
                        module0147.$g2096$.bind(module0661.f40271(), var47);
                        var48 = module0217.f14290(var8, var44);
                    }
                    finally {
                        module0147.$g2096$.rebind(var51, var47);
                        module0147.$g2094$.rebind(var3_646, var47);
                    }
                }
            }
            else {
                var48 = module0217.f14289(var8, var44, var37);
            }
        }
        finally {
            module0656.$g5172$.rebind(var50, var47);
        }
        if (NIL != var44 && NIL == var37) {
            var49 = module0656.f39827(var48);
        }
        else {
            var49 = var48;
        }
        return var49;
    }

    public static SubLObject f40670(final SubLObject var8, SubLObject var44, SubLObject var37, SubLObject var46) {
        if (var44 == UNPROVIDED) {
            var44 = (SubLObject)NIL;
        }
        if (var37 == UNPROVIDED) {
            var37 = (SubLObject)NIL;
        }
        if (var46 == UNPROVIDED) {
            var46 = (SubLObject)NIL;
        }
        final SubLThread var47 = SubLProcess.currentSubLThread();
        SubLObject var48 = (SubLObject)NIL;
        SubLObject var49 = (SubLObject)NIL;
        final SubLObject var50 = module0656.$g5172$.currentBinding(var47);
        try {
            module0656.$g5172$.bind(module0661.f40305(), var47);
            if (NIL != module0661.f40245((SubLObject)$ic397$) && NIL == var37) {
                if (NIL != module0655.f39751()) {
                    final SubLObject var3_647 = module0147.$g2094$.currentBinding(var47);
                    final SubLObject var51 = module0147.$g2096$.currentBinding(var47);
                    try {
                        module0147.$g2094$.bind((SubLObject)$ic398$, var47);
                        module0147.$g2096$.bind(module0661.f40271(), var47);
                        var48 = module0217.f14298(var8, var44);
                    }
                    finally {
                        module0147.$g2096$.rebind(var51, var47);
                        module0147.$g2094$.rebind(var3_647, var47);
                    }
                }
                else {
                    final SubLObject var3_648 = module0147.$g2094$.currentBinding(var47);
                    final SubLObject var51 = module0147.$g2096$.currentBinding(var47);
                    try {
                        module0147.$g2094$.bind((SubLObject)$ic399$, var47);
                        module0147.$g2096$.bind(module0661.f40271(), var47);
                        var48 = module0217.f14298(var8, var44);
                    }
                    finally {
                        module0147.$g2096$.rebind(var51, var47);
                        module0147.$g2094$.rebind(var3_648, var47);
                    }
                }
            }
            else {
                var48 = module0217.f14297(var8, var44, var37);
            }
        }
        finally {
            module0656.$g5172$.rebind(var50, var47);
        }
        if (NIL != var44 && NIL == var37) {
            var49 = module0656.f39827(var48);
        }
        else {
            var49 = var48;
        }
        return var49;
    }

    public static SubLObject f40675(final SubLObject var8, SubLObject var44, SubLObject var37, SubLObject var46) {
        if (var44 == UNPROVIDED) {
            var44 = (SubLObject)NIL;
        }
        if (var37 == UNPROVIDED) {
            var37 = (SubLObject)NIL;
        }
        if (var46 == UNPROVIDED) {
            var46 = (SubLObject)NIL;
        }
        final SubLThread var47 = SubLProcess.currentSubLThread();
        SubLObject var48 = (SubLObject)NIL;
        SubLObject var49 = (SubLObject)NIL;
        final SubLObject var50 = module0656.$g5172$.currentBinding(var47);
        try {
            module0656.$g5172$.bind(module0661.f40305(), var47);
            if (NIL != module0661.f40245((SubLObject)$ic397$) && NIL == var37) {
                if (NIL != module0655.f39751()) {
                    final SubLObject var3_649 = module0147.$g2094$.currentBinding(var47);
                    final SubLObject var51 = module0147.$g2096$.currentBinding(var47);
                    try {
                        module0147.$g2094$.bind((SubLObject)$ic398$, var47);
                        module0147.$g2096$.bind(module0661.f40271(), var47);
                        var48 = module0217.f14306(var8, var44);
                    }
                    finally {
                        module0147.$g2096$.rebind(var51, var47);
                        module0147.$g2094$.rebind(var3_649, var47);
                    }
                }
                else {
                    final SubLObject var3_650 = module0147.$g2094$.currentBinding(var47);
                    final SubLObject var51 = module0147.$g2096$.currentBinding(var47);
                    try {
                        module0147.$g2094$.bind((SubLObject)$ic399$, var47);
                        module0147.$g2096$.bind(module0661.f40271(), var47);
                        var48 = module0217.f14306(var8, var44);
                    }
                    finally {
                        module0147.$g2096$.rebind(var51, var47);
                        module0147.$g2094$.rebind(var3_650, var47);
                    }
                }
            }
            else {
                var48 = module0217.f14305(var8, var44, var37);
            }
        }
        finally {
            module0656.$g5172$.rebind(var50, var47);
        }
        if (NIL != var44 && NIL == var37) {
            var49 = module0656.f39827(var48);
        }
        else {
            var49 = var48;
        }
        return var49;
    }

    public static SubLObject f40679(final SubLObject var8, SubLObject var37, SubLObject var46) {
        if (var37 == UNPROVIDED) {
            var37 = (SubLObject)NIL;
        }
        if (var46 == UNPROVIDED) {
            var46 = (SubLObject)NIL;
        }
        final SubLThread var47 = SubLProcess.currentSubLThread();
        SubLObject var48 = (SubLObject)NIL;
        SubLObject var49 = (SubLObject)NIL;
        final SubLObject var50 = module0656.$g5172$.currentBinding(var47);
        try {
            module0656.$g5172$.bind(module0661.f40305(), var47);
            if (NIL != module0661.f40245((SubLObject)$ic397$) && NIL == var37) {
                if (NIL != module0655.f39751()) {
                    final SubLObject var3_651 = module0147.$g2094$.currentBinding(var47);
                    final SubLObject var51 = module0147.$g2096$.currentBinding(var47);
                    try {
                        module0147.$g2094$.bind((SubLObject)$ic398$, var47);
                        module0147.$g2096$.bind(module0661.f40271(), var47);
                        var48 = module0217.f14314(var8);
                    }
                    finally {
                        module0147.$g2096$.rebind(var51, var47);
                        module0147.$g2094$.rebind(var3_651, var47);
                    }
                }
                else {
                    final SubLObject var3_652 = module0147.$g2094$.currentBinding(var47);
                    final SubLObject var51 = module0147.$g2096$.currentBinding(var47);
                    try {
                        module0147.$g2094$.bind((SubLObject)$ic399$, var47);
                        module0147.$g2096$.bind(module0661.f40271(), var47);
                        var48 = module0217.f14314(var8);
                    }
                    finally {
                        module0147.$g2096$.rebind(var51, var47);
                        module0147.$g2094$.rebind(var3_652, var47);
                    }
                }
            }
            else {
                var48 = module0217.f14313(var8, var37);
            }
        }
        finally {
            module0656.$g5172$.rebind(var50, var47);
        }
        if (NIL == var37) {
            var49 = module0656.f39827(var48);
        }
        else {
            var49 = var48;
        }
        return var49;
    }

    public static SubLObject f40684(SubLObject var44, SubLObject var37, SubLObject var46) {
        if (var44 == UNPROVIDED) {
            var44 = (SubLObject)NIL;
        }
        if (var37 == UNPROVIDED) {
            var37 = (SubLObject)NIL;
        }
        if (var46 == UNPROVIDED) {
            var46 = (SubLObject)NIL;
        }
        final SubLThread var47 = SubLProcess.currentSubLThread();
        SubLObject var48 = (SubLObject)NIL;
        SubLObject var49 = (SubLObject)NIL;
        final SubLObject var50 = module0656.$g5172$.currentBinding(var47);
        try {
            module0656.$g5172$.bind(module0661.f40305(), var47);
            if (NIL != module0661.f40245((SubLObject)$ic397$) && NIL == var37) {
                if (NIL != module0655.f39751()) {
                    final SubLObject var3_653 = module0147.$g2094$.currentBinding(var47);
                    final SubLObject var51 = module0147.$g2096$.currentBinding(var47);
                    try {
                        module0147.$g2094$.bind((SubLObject)$ic398$, var47);
                        module0147.$g2096$.bind(module0661.f40271(), var47);
                        var48 = module0223.f14678(var44);
                    }
                    finally {
                        module0147.$g2096$.rebind(var51, var47);
                        module0147.$g2094$.rebind(var3_653, var47);
                    }
                }
                else {
                    final SubLObject var3_654 = module0147.$g2094$.currentBinding(var47);
                    final SubLObject var51 = module0147.$g2096$.currentBinding(var47);
                    try {
                        module0147.$g2094$.bind((SubLObject)$ic399$, var47);
                        module0147.$g2096$.bind(module0661.f40271(), var47);
                        var48 = module0223.f14678(var44);
                    }
                    finally {
                        module0147.$g2096$.rebind(var51, var47);
                        module0147.$g2094$.rebind(var3_654, var47);
                    }
                }
            }
            else {
                var48 = module0223.f14677(var44, var37);
            }
        }
        finally {
            module0656.$g5172$.rebind(var50, var47);
        }
        if (NIL != var44 && NIL == var37) {
            var49 = module0656.f39827(var48);
        }
        else {
            var49 = var48;
        }
        return var49;
    }

    public static SubLObject f40888(final SubLObject var6) {
        return module0617.f37871(var6, (SubLObject)UNPROVIDED);
    }

    public static SubLObject f40889(final SubLObject var6) {
        return module0617.f37872(var6, (SubLObject)UNPROVIDED);
    }

    public static SubLObject f40890(final SubLObject var6) {
        return module0617.f37874(var6, (SubLObject)UNPROVIDED);
    }

    public static SubLObject f40891(final SubLObject var6) {
        return module0617.f37875(var6, (SubLObject)UNPROVIDED);
    }

    public static SubLObject f40892(final SubLObject var8, SubLObject var655) {
        if (var655 == UNPROVIDED) {
            var655 = (SubLObject)NIL;
        }
        final SubLThread var656 = SubLProcess.currentSubLThread();
        if (NIL != f40893(var8)) {
            if (NIL != var655) {
                module0642.f39026((SubLObject)UNPROVIDED);
            }
            final SubLObject var657 = module0656.f39832((SubLObject)$ic48$);
            module0642.f39020(module0015.$g381$.getGlobalValue());
            module0642.f39020(module0015.$g383$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
            module0655.f39768();
            PrintLow.format(module0015.$g131$.getDynamicValue(var656), (SubLObject)$ic471$, module0656.f39932(var8));
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
            if (NIL != var657) {
                module0642.f39020(module0015.$g387$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                module0642.f39020(var657);
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
            }
            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
            final SubLObject var658 = module0015.$g533$.currentBinding(var656);
            try {
                module0015.$g533$.bind((SubLObject)T, var656);
                module0642.f39019(f40894(var8));
            }
            finally {
                module0015.$g533$.rebind(var658, var656);
            }
            module0642.f39020(module0015.$g382$.getGlobalValue());
        }
        return var8;
    }

    public static SubLObject f40895(final SubLObject var52) {
        SubLObject var53 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var52, var52, (SubLObject)$ic165$);
        var53 = var52.first();
        final SubLObject var54 = var52.rest();
        if (NIL == var54) {
            final SubLObject var55 = module0656.f39957(var53, (SubLObject)UNPROVIDED);
            f40896(var55);
        }
        else {
            cdestructuring_bind.cdestructuring_bind_error(var52, (SubLObject)$ic165$);
        }
        return (SubLObject)NIL;
    }

    public static SubLObject f40896(final SubLObject var8) {
        final SubLThread var9 = SubLProcess.currentSubLThread();
        final SubLObject var10 = PrintLow.format((SubLObject)NIL, (SubLObject)$ic474$, var8);
        module0642.f39020((SubLObject)$ic0$);
        module0642.f39029((SubLObject)UNPROVIDED);
        module0642.f39020(module0015.$g155$.getGlobalValue());
        final SubLObject var11 = module0016.$g568$.currentBinding(var9);
        try {
            module0016.$g568$.bind((SubLObject)ZERO_INTEGER, var9);
            module0016.f936();
            module0642.f39020(module0016.$g569$.getGlobalValue());
            module0642.f39020(module0015.$g153$.getGlobalValue());
            module0015.f718();
            module0655.f39766();
            module0642.f39064(module0655.$g5143$.getDynamicValue(var9), module0655.$g5142$.getDynamicValue(var9));
            final SubLObject var12 = module0014.f672((SubLObject)$ic1$);
            module0642.f39029((SubLObject)UNPROVIDED);
            module0642.f39020(module0015.$g175$.getGlobalValue());
            module0642.f39020(module0015.$g176$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
            module0642.f39020((SubLObject)$ic2$);
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
            if (NIL != var12) {
                module0642.f39020(module0015.$g178$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                module0642.f39020(var12);
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
            }
            module0642.f39020(module0015.$g177$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
            module0642.f39020((SubLObject)$ic3$);
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
            module0642.f39029((SubLObject)UNPROVIDED);
            module0642.f39020(module0015.$g173$.getGlobalValue());
            module0642.f39019(var10);
            module0642.f39020(module0015.$g174$.getGlobalValue());
            module0016.f892();
            module0016.f895();
            module0016.f893();
            module0642.f39020(module0015.$g154$.getGlobalValue());
            module0642.f39029((SubLObject)UNPROVIDED);
            final SubLObject var3_658 = module0015.$g535$.currentBinding(var9);
            try {
                module0015.$g535$.bind((SubLObject)T, var9);
                module0642.f39020(module0015.$g133$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                final SubLObject var3_659 = module0015.$g533$.currentBinding(var9);
                try {
                    module0015.$g533$.bind((SubLObject)T, var9);
                    module0642.f39020(module0015.$g209$.getGlobalValue());
                    module0656.f39915(var8, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                    module0642.f39019((SubLObject)$ic475$);
                    module0642.f39020(module0015.$g210$.getGlobalValue());
                    f40897(var8);
                    module0642.f39029((SubLObject)UNPROVIDED);
                    module0642.f39050();
                }
                finally {
                    module0015.$g533$.rebind(var3_659, var9);
                }
                module0642.f39020(module0015.$g134$.getGlobalValue());
                module0642.f39029((SubLObject)UNPROVIDED);
            }
            finally {
                module0015.$g535$.rebind(var3_658, var9);
            }
        }
        finally {
            module0016.$g568$.rebind(var11, var9);
        }
        module0642.f39020(module0015.$g156$.getGlobalValue());
        module0642.f39029((SubLObject)UNPROVIDED);
        return (SubLObject)NIL;
    }

    public static SubLObject f40894(final SubLObject var8) {
        if (NIL != f40898(var8)) {
            return (SubLObject)$ic476$;
        }
        return (SubLObject)$ic477$;
    }

    public static SubLObject f40897(final SubLObject var8) {
        if (NIL != f40898(var8)) {
            f40899(var8);
        }
        return (SubLObject)NIL;
    }

    public static SubLObject f40893(final SubLObject var8) {
        return f40898(var8);
    }

    public static SubLObject f40898(final SubLObject var8) {
        return (SubLObject)makeBoolean(NIL != module0173.f10955(var8) && NIL != module0256.f16598(var8, $ic478$));
    }

    public static SubLObject f40899(final SubLObject var8) {
        final SubLThread var9 = SubLProcess.currentSubLThread();
        module0642.f39026((SubLObject)TWO_INTEGER);
        final SubLObject var10 = PrintLow.format((SubLObject)NIL, (SubLObject)$ic479$, random.random(Numbers.expt((SubLObject)TWO_INTEGER, (SubLObject)$ic480$)));
        final SubLObject var11 = module0226.f15152(var8);
        if (NIL == var11) {
            module0642.f39020(module0015.$g224$.getGlobalValue());
            module0642.f39019((SubLObject)$ic481$);
            module0656.f39915($ic482$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
            module0642.f39019((SubLObject)$ic483$);
            module0642.f39020(module0015.$g225$.getGlobalValue());
            module0642.f39026((SubLObject)UNPROVIDED);
        }
        if (NIL != constants_high_oc.f10737((SubLObject)$ic484$) && NIL == module0434.f30577((SubLObject)$ic485$, (SubLObject)ConsesLow.list($ic486$, var8, (SubLObject)$ic485$), (NIL != var11) ? var11 : $ic135$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)) {
            module0642.f39020(module0015.$g224$.getGlobalValue());
            module0642.f39019((SubLObject)$ic487$);
            module0642.f39020(module0015.$g225$.getGlobalValue());
            module0642.f39026((SubLObject)UNPROVIDED);
        }
        module0691.f42322(var10, (SubLObject)ConsesLow.list((SubLObject)$ic488$, (SubLObject)ConsesLow.list(new SubLObject[] { $ic489$, $ic490$, $ic491$, NIL, $ic492$, ConsesLow.list(var8), $ic376$, NIL, $ic493$, ONE_INTEGER })));
        module0692.f42403((SubLObject)ConsesLow.list((SubLObject)$ic494$, (SubLObject)$ic495$, (SubLObject)$ic496$, (SubLObject)$ic497$, (SubLObject)$ic498$, (SubLObject)$ic499$, (SubLObject)$ic500$, var10));
        module0642.f39026((SubLObject)UNPROVIDED);
        final SubLObject var12 = (SubLObject)$ic501$;
        module0642.f39020(module0015.$g459$.getGlobalValue());
        module0016.f923(var12, (SubLObject)$ic43$);
        module0642.f39019((SubLObject)$ic502$);
        module0642.f39020(module0015.$g460$.getGlobalValue());
        module0016.f908(var12, (SubLObject)$ic49$, (SubLObject)$ic45$);
        module0642.f39020(module0015.$g144$.getGlobalValue());
        if (NIL != var12) {
            module0642.f39020(module0015.$g157$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
            module0642.f39020(var12);
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        }
        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
        final SubLObject var13 = module0015.$g533$.currentBinding(var9);
        try {
            module0015.$g533$.bind((SubLObject)T, var9);
            module0642.f39026((SubLObject)UNPROVIDED);
            module0642.f39020(module0015.$g209$.getGlobalValue());
            module0642.f39019((SubLObject)$ic503$);
            module0642.f39020(module0015.$g210$.getGlobalValue());
            module0642.f39026((SubLObject)TWO_INTEGER);
            module0642.f39019((SubLObject)$ic504$);
            module0015.f741();
            module0642.f39020(module0015.$g203$.getGlobalValue());
            final SubLObject var3_662 = module0015.$g537$.currentBinding(var9);
            try {
                module0015.$g537$.bind((SubLObject)T, var9);
                module0642.f39019((SubLObject)$ic505$);
            }
            finally {
                module0015.$g537$.rebind(var3_662, var9);
            }
            module0642.f39020(module0015.$g204$.getGlobalValue());
            module0642.f39019((SubLObject)$ic506$);
            module0642.f39020(module0015.$g213$.getGlobalValue());
            module0642.f39019((SubLObject)$ic507$);
            module0642.f39020(module0015.$g214$.getGlobalValue());
            module0642.f39019((SubLObject)$ic508$);
            module0642.f39020(module0015.$g381$.getGlobalValue());
            module0642.f39020(module0015.$g383$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
            module0642.f39020((SubLObject)$ic509$);
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
            module0642.f39020(module0015.$g387$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
            module0642.f39020((SubLObject)$ic7$);
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
            final SubLObject var3_663 = module0015.$g533$.currentBinding(var9);
            try {
                module0015.$g533$.bind((SubLObject)T, var9);
                module0642.f39019((SubLObject)$ic510$);
            }
            finally {
                module0015.$g533$.rebind(var3_663, var9);
            }
            module0642.f39020(module0015.$g382$.getGlobalValue());
            module0642.f39019((SubLObject)$ic511$);
            module0642.f39026((SubLObject)TWO_INTEGER);
            module0642.f39020(module0015.$g209$.getGlobalValue());
            module0642.f39019((SubLObject)$ic512$);
            module0642.f39020(module0015.$g210$.getGlobalValue());
            module0642.f39026((SubLObject)TWO_INTEGER);
            module0642.f39019((SubLObject)$ic513$);
        }
        finally {
            module0015.$g533$.rebind(var13, var9);
        }
        module0642.f39020(module0015.$g145$.getGlobalValue());
        module0642.f39029((SubLObject)UNPROVIDED);
        return (SubLObject)NIL;
    }

    public static SubLObject f40900(final SubLObject var52) {
        final SubLObject var53 = module0656.f39957(module0642.f39104((SubLObject)$ic20$, var52), (SubLObject)UNPROVIDED);
        return f40901(var53);
    }

    public static SubLObject f40901(final SubLObject var8) {
        final SubLThread var9 = SubLProcess.currentSubLThread();
        final SubLObject var10 = f40902(var8);
        if (NIL != var10) {
            final SubLObject var11 = (SubLObject)$ic501$;
            module0642.f39020(module0015.$g459$.getGlobalValue());
            module0642.f39032((SubLObject)ZERO_INTEGER);
            module0642.f39051((SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
            module0642.f39020(module0015.$g459$.getGlobalValue());
            module0016.f923(var11, (SubLObject)$ic43$);
            PrintLow.format(module0015.$g131$.getDynamicValue(var9), (SubLObject)$ic514$, Sequences.length(var10));
            module0642.f39020(module0015.$g460$.getGlobalValue());
            module0642.f39020(module0015.$g460$.getGlobalValue());
            module0642.f39026((SubLObject)UNPROVIDED);
            module0016.f908(var11, (SubLObject)$ic49$, (SubLObject)$ic45$);
            module0642.f39020(module0015.$g144$.getGlobalValue());
            if (NIL != var11) {
                module0642.f39020(module0015.$g157$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                module0642.f39020(var11);
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
            }
            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
            final SubLObject var12 = module0015.$g533$.currentBinding(var9);
            try {
                module0015.$g533$.bind((SubLObject)T, var9);
                SubLObject var13 = module0213.f13926(var10, (SubLObject)NIL, (SubLObject)NIL, (SubLObject)T, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                SubLObject var14 = (SubLObject)NIL;
                var14 = var13.first();
                while (NIL != var13) {
                    f40903(var8, var14);
                    var13 = var13.rest();
                    var14 = var13.first();
                }
            }
            finally {
                module0015.$g533$.rebind(var12, var9);
            }
            module0642.f39020(module0015.$g145$.getGlobalValue());
            module0642.f39029((SubLObject)UNPROVIDED);
        }
        return (SubLObject)NIL;
    }

    public static SubLObject f40902(final SubLObject var8) {
        return module0434.f30578((SubLObject)$ic515$, (SubLObject)ConsesLow.list($ic516$, (SubLObject)$ic515$, var8), $ic517$, (SubLObject)$ic518$);
    }

    public static SubLObject f40903(final SubLObject var8, final SubLObject var665) {
        module0656.f39837((SubLObject)$ic519$, var8, var665, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        module0642.f39026((SubLObject)UNPROVIDED);
        return (SubLObject)NIL;
    }

    public static SubLObject f40904(final SubLObject var8, final SubLObject var665) {
        final SubLThread var666 = SubLProcess.currentSubLThread();
        module0642.f39020(module0015.$g459$.getGlobalValue());
        module0642.f39032((SubLObject)TWO_INTEGER);
        final SubLObject var667 = module0656.f39832((SubLObject)$ic7$);
        module0642.f39020(module0015.$g381$.getGlobalValue());
        module0642.f39020(module0015.$g383$.getGlobalValue());
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        module0655.f39768();
        PrintLow.format(module0015.$g131$.getDynamicValue(var666), (SubLObject)$ic520$, module0656.f39932(var8), module0656.f39932(var665));
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        if (NIL != var667) {
            module0642.f39020(module0015.$g387$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
            module0642.f39020(var667);
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        }
        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
        final SubLObject var668 = module0015.$g533$.currentBinding(var666);
        try {
            module0015.$g533$.bind((SubLObject)T, var666);
            module0642.f39019(module0597.f36628(var665));
        }
        finally {
            module0015.$g533$.rebind(var668, var666);
        }
        module0642.f39020(module0015.$g382$.getGlobalValue());
        module0642.f39020(module0015.$g460$.getGlobalValue());
        return (SubLObject)NIL;
    }

    public static SubLObject f40905(final SubLObject var52) {
        final SubLObject var53 = module0656.f39957(module0642.f39104((SubLObject)$ic20$, var52), (SubLObject)UNPROVIDED);
        final SubLObject var54 = module0656.f39957(module0642.f39104((SubLObject)$ic522$, var52), (SubLObject)UNPROVIDED);
        final SubLObject var55 = module0423.f29563(var54);
        final SubLObject var56 = module0595.f36375(var53, var55);
        final SubLObject var57 = module0423.f29569(var54);
        final SubLObject var58 = module0595.f36375(var53, var57);
        final SubLObject var59 = module0423.f29566(var54);
        final SubLObject var60 = module0412.f28668(module0423.f29573(var54));
        if (NIL != var59) {
            return module0683.f41815(var56, var58, var60, var54, var59);
        }
        return module0683.f41815(var56, var58, var60, var54, (SubLObject)UNPROVIDED);
    }

    public static SubLObject f40906() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0669", "f40606", "S#44190", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0669", "f40608", "S#44727", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0669", "f40607", "S#44728", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0669", "f40609", "S#44411", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0669", "f40612", "S#44729", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0669", "f40613", "S#44730", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0669", "f40615", "S#44731", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0669", "f40614", "S#44413", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0669", "f40616", "S#44732", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0669", "f40617", "S#44733", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0669", "f40620", "S#44734", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0669", "f40619", "S#44735", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0669", "f40635", "S#44736", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0669", "f40637", "S#44737", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0669", "f40636", "S#44738", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0669", "f40638", "S#44739", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0669", "f40621", "S#44740", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0669", "f40641", "S#44741", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0669", "f40642", "S#44742", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0669", "f40643", "S#44743", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0669", "f40622", "S#44744", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0669", "f40646", "S#44745", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0669", "f40625", "S#44746", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0669", "f40623", "S#44747", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0669", "f40649", "S#44748", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0669", "f40651", "S#44749", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0669", "f40652", "S#44750", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0669", "f40653", "S#44751", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0669", "f40624", "S#44752", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0669", "f40655", "S#44753", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0669", "f40657", "S#44754", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0669", "f40627", "S#44755", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0669", "f40659", "S#44756", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0669", "f40661", "S#44757", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0669", "f40662", "S#44758", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0669", "f40628", "S#44759", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0669", "f40664", "S#44760", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0669", "f40666", "S#44761", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0669", "f40667", "S#44762", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0669", "f40629", "S#44763", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0669", "f40669", "S#44764", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0669", "f40671", "S#44765", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0669", "f40672", "S#44766", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0669", "f40630", "S#44767", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0669", "f40674", "S#44768", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0669", "f40676", "S#44769", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0669", "f40677", "S#44770", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0669", "f40626", "S#44771", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0669", "f40680", "S#44772", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0669", "f40681", "S#44773", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0669", "f40618", "S#44774", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0669", "f40683", "S#44775", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0669", "f40685", "S#44776", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0669", "f40686", "S#44777", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0669", "f40631", "S#44778", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0669", "f40632", "S#44417", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0669", "f40611", "S#44412", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0669", "f40690", "S#44779", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0669", "f40691", "S#44780", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0669", "f40692", "S#43750", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0669", "f40693", "CB-C-EL", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0669", "f40695", "S#44781", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0669", "f40696", "CB-C-HL", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0669", "f40697", "S#44782", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0669", "f40698", "CB-C-DOCUMENTATION", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0669", "f40700", "S#44783", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0669", "f40701", "S#44784", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0669", "f40702", "S#44785", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0669", "f40703", "S#44786", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0669", "f40704", "S#44787", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0669", "f40705", "S#44788", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0669", "f40707", "S#44789", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0669", "f40708", "S#44790", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0669", "f40709", "S#44791", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0669", "f40711", "S#44792", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0669", "f40706", "S#44793", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0669", "f40712", "S#44794", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0669", "f40714", "S#44795", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0669", "f40713", "S#44796", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0669", "f40699", "S#44196", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0669", "f40710", "S#44415", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0669", "f40715", "S#44797", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0669", "f40716", "S#44798", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0669", "f40717", "CB-C-DEFINITIONAL", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0669", "f40719", "S#44799", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0669", "f40718", "S#44195", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0669", "f40720", "S#44800", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0669", "f40721", "S#44801", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0669", "f40723", "S#44802", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0669", "f40726", "CB-DESCRIBE-CONSTANT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0669", "f40728", "S#44803", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0669", "f40729", "CB-DESCRIBE-NART", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0669", "f40730", "S#44804", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0669", "f40731", "S#44805", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0669", "f40727", "S#44806", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0669", "f40732", "CB-C-ALL-ASSERTED-KNOWLEDGE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0669", "f40733", "S#44807", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0669", "f40735", "S#44808", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0669", "f40736", "CB-C-BOOKKEEPING-ASSERTIONS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0669", "f40737", "S#44809", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0669", "f40738", "CB-C-TOTAL", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0669", "f40739", "S#44810", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0669", "f40740", "S#44811", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0669", "f40734", "S#44812", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0669", "f40753", "S#44813", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0669", "f40754", "CB-ASSERTION-CHRONOLOGY", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0669", "f40755", "S#44814", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0669", "f40756", "S#44815", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0669", "f40757", "CB-C-GAF-ARG", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0669", "f40758", "S#44816", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0669", "f40759", "S#44817", 2, 3, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0669", "f40741", "S#44818", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0669", "f40760", "S#44819", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0669", "f40761", "S#44820", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0669", "f40725", "S#44821", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0669", "f40762", "S#44418", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0669", "f40767", "S#43766", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0669", "f40764", "S#44822", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0669", "f40768", "S#44823", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0669", "f40769", "S#44824", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0669", "f40770", "S#44825", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0669", "f40765", "S#44826", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0669", "f40766", "S#44827", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0669", "f40772", "CB-C-NART-ARG", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0669", "f40773", "S#44828", 2, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0669", "f40742", "S#44829", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0669", "f40774", "S#44830", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0669", "f40775", "S#44831", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0669", "f40777", "S#44832", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0669", "f40778", "S#44833", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0669", "f40781", "S#44834", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0669", "f40782", "S#44835", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0669", "f40779", "S#44836", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0669", "f40780", "S#44837", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0669", "f40783", "S#44838", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0669", "f40784", "S#44839", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0669", "f40785", "S#44840", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0669", "f40722", "S#44414", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0669", "f40724", "S#44416", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0669", "f40776", "S#44841", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0669", "f40763", "S#44842", 1, 3, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0669", "f40786", "S#44843", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0669", "f40787", "S#44844", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0669", "f40771", "S#44845", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0669", "f40788", "S#44197", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0669", "f40789", "S#44846", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0669", "f40790", "CB-C-PREDICATE-EXTENT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0669", "f40791", "S#44847", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0669", "f40743", "S#44848", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0669", "f40793", "S#44849", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0669", "f40792", "S#44850", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0669", "f40794", "CB-C-FUNCTION-EXTENT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0669", "f40795", "S#44851", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0669", "f40744", "S#44852", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0669", "f40796", "S#44853", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0669", "f40797", "CB-C-PREDICATE-RULE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0669", "f40798", "S#44854", 2, 3, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0669", "f40745", "S#44855", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0669", "f40799", "S#44856", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0669", "f40800", "S#44857", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0669", "f40802", "S#44858", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0669", "f40803", "S#44859", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0669", "f40805", "CB-C-DECONTEXTUALIZED-IST-PREDICATE-RULE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0669", "f40806", "S#44860", 2, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0669", "f40746", "S#44861", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0669", "f40807", "S#44862", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0669", "f40808", "S#44863", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0669", "f40809", "S#44864", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0669", "f40810", "CB-C-ISA-RULE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0669", "f40811", "S#44865", 2, 3, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0669", "f40747", "S#44866", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0669", "f40812", "S#44867", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0669", "f40813", "S#44868", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0669", "f40814", "S#44869", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0669", "f40815", "S#44870", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0669", "f40816", "CB-C-QUOTED-ISA-RULE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0669", "f40818", "S#44871", 2, 3, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0669", "f40817", "S#44872", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0669", "f40819", "S#44873", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0669", "f40820", "S#44874", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0669", "f40821", "S#44875", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0669", "f40822", "S#44876", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0669", "f40823", "CB-C-GENLS-RULE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0669", "f40824", "S#44877", 2, 3, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0669", "f40748", "S#44878", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0669", "f40825", "S#44879", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0669", "f40826", "S#44880", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0669", "f40827", "S#44881", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0669", "f40828", "S#44882", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0669", "f40829", "CB-C-GENL-MT-RULE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0669", "f40830", "S#44883", 2, 3, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0669", "f40749", "S#44884", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0669", "f40831", "S#44885", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0669", "f40832", "S#44886", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0669", "f40833", "S#44887", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0669", "f40834", "S#44888", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0669", "f40835", "CB-C-FUNCTION-RULE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0669", "f40836", "S#44889", 2, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0669", "f40750", "S#44890", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0669", "f40837", "S#44891", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0669", "f40838", "S#44892", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0669", "f40839", "S#44893", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0669", "f40840", "CB-C-UNBOUND-RULE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0669", "f40842", "S#44894", 1, 3, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0669", "f40841", "S#44895", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0669", "f40843", "S#44896", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0669", "f40844", "S#44897", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0669", "f40845", "S#44898", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0669", "f40846", "S#44899", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0669", "f40801", "S#44900", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0669", "f40804", "S#44901", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0669", "f40847", "CB-C-IST", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0669", "f40848", "S#44902", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0669", "f40849", "S#44903", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0669", "f40752", "S#44904", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0669", "f40850", "CB-C-MT-GAFS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0669", "f40852", "S#44905", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0669", "f40851", "S#44906", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0669", "f40854", "S#44907", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0669", "f40853", "S#44908", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0669", "f40855", "S#44909", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0669", "f40856", "S#44910", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0669", "f40857", "CB-C-MT-RULES", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0669", "f40859", "S#44911", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0669", "f40858", "S#44912", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0669", "f40860", "S#44913", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0669", "f40861", "CB-C-OTHER", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0669", "f40862", "S#44914", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0669", "f40751", "S#44915", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0669", "f40863", "S#44916", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0669", "f40864", "CB-AUXILIARY-INDICES", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0669", "f40865", "S#44917", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0669", "f40694", "CB-AUXILIARY-INDEX", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0669", "f40866", "S#44918", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0669", "f40867", "CB-ALPHA", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0669", "f40870", "CB-AD", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0669", "f40871", "S#44919", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0669", "f40872", "CB-ALPHA-TOP", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0669", "f40873", "S#44920", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0669", "f40874", "CB-ALPHA-BOTTOM", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0669", "f40875", "S#44921", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0669", "f40876", "CB-ALPHA-PAGEUP", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0669", "f40878", "S#44922", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0669", "f40879", "CB-ALPHA-PAGEDN", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0669", "f40880", "S#44923", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0669", "f40877", "S#44924", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0669", "f40869", "S#44925", 6, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0669", "f40881", "S#44926", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0669", "f40883", "S#44927", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0669", "f40882", "S#44928", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0669", "f40868", "S#44929", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0669", "f40884", "S#44930", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0669", "f40885", "S#44931", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0669", "f40610", "S#44932", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0669", "f40633", "S#44933", 1, 3, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0669", "f40639", "S#44934", 1, 3, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0669", "f40644", "S#44935", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0669", "f40647", "S#44936", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0669", "f40648", "S#44937", 1, 3, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0669", "f40654", "S#44938", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0669", "f40658", "S#44939", 1, 3, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0669", "f40663", "S#44940", 1, 3, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0669", "f40668", "S#44941", 1, 3, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0669", "f40673", "S#44942", 1, 3, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0669", "f40678", "S#44943", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0669", "f40886", "S#44944", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0669", "f40887", "S#44945", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0669", "f40682", "S#44946", 0, 3, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0669", "f40687", "S#44947", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0669", "f40688", "S#44948", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0669", "f40689", "S#44949", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0669", "f40634", "S#44950", 1, 3, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0669", "f40640", "S#44951", 1, 3, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0669", "f40645", "S#44952", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0669", "f40650", "S#44953", 1, 3, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0669", "f40656", "S#44954", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0669", "f40660", "S#44955", 1, 3, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0669", "f40665", "S#44956", 1, 3, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0669", "f40670", "S#44957", 1, 3, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0669", "f40675", "S#44958", 1, 3, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0669", "f40679", "S#44959", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0669", "f40684", "S#44960", 0, 3, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0669", "f40888", "S#44961", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0669", "f40889", "S#44962", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0669", "f40890", "S#44963", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0669", "f40891", "S#44964", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0669", "f40892", "S#44965", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0669", "f40895", "CB-C-GRAPH", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0669", "f40896", "S#44966", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0669", "f40894", "S#44967", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0669", "f40897", "S#44968", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0669", "f40893", "S#44969", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0669", "f40898", "S#44970", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0669", "f40899", "S#44971", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0669", "f40900", "CB-C-PERTINENT-QUERY-LINKS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0669", "f40901", "S#44972", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0669", "f40902", "S#44973", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0669", "f40903", "S#44974", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0669", "f40904", "S#44975", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0669", "f40905", "CB-C-PERTINENT-QUERY", 1, 0, false);
        return (SubLObject)NIL;
    }

    public static SubLObject f40907() {
        $g5278$ = SubLFiles.deflexical("S#44976", (SubLObject)ConsesLow.list((SubLObject)$ic8$, (SubLObject)$ic31$, (SubLObject)$ic32$, (SubLObject)NIL, (SubLObject)$ic33$));
        $g5279$ = SubLFiles.deflexical("S#44977", (SubLObject)NIL);
        $g5280$ = SubLFiles.deflexical("S#44978", (SubLObject)$ic108$);
        $g5281$ = SubLFiles.defparameter("S#44979", (SubLObject)NIL);
        $g5282$ = SubLFiles.defparameter("S#44980", (SubLObject)NIL);
        $g5283$ = SubLFiles.defparameter("S#44981", (SubLObject)NIL);
        $g5284$ = SubLFiles.defparameter("S#44982", (SubLObject)NIL);
        $g5285$ = SubLFiles.defparameter("S#44983", (SubLObject)NIL);
        $g5286$ = SubLFiles.defvar("S#44984", (SubLObject)T);
        $g5287$ = SubLFiles.defvar("S#44985", (SubLObject)T);
        $g5288$ = SubLFiles.defparameter("S#44986", (SubLObject)FIVE_INTEGER);
        $g5289$ = SubLFiles.defparameter("S#44987", (SubLObject)$ic419$);
        $g5290$ = SubLFiles.defparameter("S#44988", Numbers.add($g5288$.getDynamicValue(), $g5289$.getDynamicValue()));
        $g5291$ = SubLFiles.defparameter("S#44989", (SubLObject)$ic43$);
        $g5292$ = SubLFiles.defparameter("S#44990", Strings.string(Characters.code_char((SubLObject)$ic440$)));
        $g5293$ = SubLFiles.defparameter("S#44991", (SubLObject)$ic461$);
        $g5294$ = SubLFiles.defparameter("S#44992", (SubLObject)$ic462$);
        $g5295$ = SubLFiles.defparameter("S#44993", (SubLObject)NIL);
        $g5296$ = SubLFiles.defparameter("S#44994", (SubLObject)NIL);
        $g5297$ = SubLFiles.defparameter("S#44995", (SubLObject)NIL);
        return (SubLObject)NIL;
    }

    public static SubLObject f40908() {
        Hashtables.sethash((SubLObject)$ic4$, module0014.$g125$.getGlobalValue(), (SubLObject)ConsesLow.list((SubLObject)$ic5$, (SubLObject)NIL));
        module0015.f873((SubLObject)$ic90$);
        module0656.f39840((SubLObject)$ic82$, (SubLObject)$ic93$, (SubLObject)TWO_INTEGER);
        module0015.f873((SubLObject)$ic94$);
        module0656.f39840((SubLObject)$ic81$, (SubLObject)$ic97$, (SubLObject)TWO_INTEGER);
        module0015.f873((SubLObject)$ic100$);
        module0656.f39840((SubLObject)$ic11$, (SubLObject)$ic103$, (SubLObject)TWO_INTEGER);
        module0034.f1909((SubLObject)$ic104$);
        module0015.f873((SubLObject)$ic166$);
        module0656.f39840((SubLObject)$ic12$, (SubLObject)$ic169$, (SubLObject)TWO_INTEGER);
        Hashtables.sethash((SubLObject)$ic174$, module0014.$g125$.getGlobalValue(), (SubLObject)ConsesLow.list((SubLObject)$ic175$, (SubLObject)NIL));
        module0015.f873((SubLObject)$ic191$);
        module0656.f39840((SubLObject)$ic15$, (SubLObject)$ic194$, (SubLObject)ONE_INTEGER);
        Hashtables.sethash((SubLObject)$ic195$, module0014.$g125$.getGlobalValue(), (SubLObject)ConsesLow.list((SubLObject)$ic196$, (SubLObject)NIL));
        module0015.f873((SubLObject)$ic205$);
        module0656.f39840((SubLObject)$ic14$, (SubLObject)$ic207$, (SubLObject)ONE_INTEGER);
        module0015.f873((SubLObject)$ic215$);
        module0656.f39840((SubLObject)$ic27$, (SubLObject)$ic220$, (SubLObject)THREE_INTEGER);
        module0015.f873((SubLObject)$ic222$);
        module0656.f39840((SubLObject)$ic39$, (SubLObject)$ic225$, (SubLObject)THREE_INTEGER);
        module0015.f873((SubLObject)$ic226$);
        module0656.f39840((SubLObject)$ic40$, (SubLObject)$ic229$, (SubLObject)THREE_INTEGER);
        module0656.f39840((SubLObject)$ic16$, (SubLObject)$ic232$, (SubLObject)TWO_INTEGER);
        module0015.f873((SubLObject)$ic234$);
        module0015.f873((SubLObject)$ic241$);
        module0656.f39840((SubLObject)$ic42$, (SubLObject)$ic247$, (SubLObject)FIVE_INTEGER);
        module0015.f873((SubLObject)$ic263$);
        module0656.f39840((SubLObject)$ic52$, (SubLObject)$ic266$, (SubLObject)FOUR_INTEGER);
        Hashtables.sethash((SubLObject)$ic275$, module0014.$g125$.getGlobalValue(), (SubLObject)ConsesLow.list((SubLObject)$ic276$, (SubLObject)NIL));
        module0015.f873((SubLObject)$ic292$);
        module0656.f39840((SubLObject)$ic57$, (SubLObject)$ic295$, (SubLObject)THREE_INTEGER);
        module0015.f873((SubLObject)$ic298$);
        module0656.f39840((SubLObject)$ic58$, (SubLObject)$ic301$, (SubLObject)TWO_INTEGER);
        module0015.f873((SubLObject)$ic306$);
        module0656.f39840((SubLObject)$ic59$, (SubLObject)$ic312$, (SubLObject)FIVE_INTEGER);
        module0015.f873((SubLObject)$ic316$);
        module0656.f39840((SubLObject)$ic64$, (SubLObject)$ic319$, (SubLObject)FOUR_INTEGER);
        module0015.f873((SubLObject)$ic321$);
        module0656.f39840((SubLObject)$ic66$, (SubLObject)$ic324$, (SubLObject)FIVE_INTEGER);
        module0015.f873((SubLObject)$ic327$);
        module0656.f39840((SubLObject)$ic68$, (SubLObject)$ic330$, (SubLObject)FIVE_INTEGER);
        module0015.f873((SubLObject)$ic333$);
        module0656.f39840((SubLObject)$ic70$, (SubLObject)$ic336$, (SubLObject)FIVE_INTEGER);
        module0015.f873((SubLObject)$ic339$);
        module0656.f39840((SubLObject)$ic72$, (SubLObject)$ic342$, (SubLObject)FIVE_INTEGER);
        module0015.f873((SubLObject)$ic346$);
        module0656.f39840((SubLObject)$ic74$, (SubLObject)$ic349$, (SubLObject)FOUR_INTEGER);
        module0015.f873((SubLObject)$ic354$);
        module0656.f39840((SubLObject)$ic75$, (SubLObject)$ic356$, (SubLObject)FOUR_INTEGER);
        module0015.f873((SubLObject)$ic362$);
        module0656.f39840((SubLObject)$ic78$, (SubLObject)$ic365$, (SubLObject)TWO_INTEGER);
        module0656.f39840((SubLObject)$ic77$, (SubLObject)$ic367$, (SubLObject)ONE_INTEGER);
        module0015.f873((SubLObject)$ic370$);
        module0656.f39840((SubLObject)$ic79$, (SubLObject)$ic374$, (SubLObject)ONE_INTEGER);
        module0015.f873((SubLObject)$ic385$);
        module0656.f39840((SubLObject)$ic80$, (SubLObject)$ic388$, (SubLObject)ONE_INTEGER);
        module0015.f873((SubLObject)$ic392$);
        module0656.f39840((SubLObject)$ic76$, (SubLObject)$ic395$, (SubLObject)TWO_INTEGER);
        Hashtables.sethash((SubLObject)$ic400$, module0014.$g125$.getGlobalValue(), (SubLObject)ConsesLow.list((SubLObject)$ic401$, (SubLObject)NIL));
        module0015.f873((SubLObject)$ic407$);
        module0656.f39840((SubLObject)$ic10$, (SubLObject)$ic410$, (SubLObject)ONE_INTEGER);
        module0015.f873((SubLObject)$ic416$);
        module0656.f39840((SubLObject)$ic6$, (SubLObject)$ic418$, (SubLObject)TWO_INTEGER);
        module0015.f873((SubLObject)$ic423$);
        module0015.f873((SubLObject)$ic424$);
        Hashtables.sethash((SubLObject)$ic425$, module0014.$g128$.getGlobalValue(), (SubLObject)ConsesLow.list((SubLObject)$ic426$, (SubLObject)$ic427$));
        module0656.f39840((SubLObject)$ic430$, (SubLObject)$ic431$, (SubLObject)TWO_INTEGER);
        module0656.f39821((SubLObject)$ic432$, (SubLObject)$ic433$, (SubLObject)$ic433$, (SubLObject)$ic434$);
        module0015.f873((SubLObject)$ic436$);
        module0656.f39840((SubLObject)$ic432$, (SubLObject)$ic439$, (SubLObject)ONE_INTEGER);
        module0015.f873((SubLObject)$ic443$);
        module0656.f39840((SubLObject)$ic446$, (SubLObject)$ic447$, (SubLObject)ONE_INTEGER);
        module0015.f873((SubLObject)$ic449$);
        module0656.f39840((SubLObject)$ic452$, (SubLObject)$ic453$, (SubLObject)TWO_INTEGER);
        module0015.f873((SubLObject)$ic455$);
        module0656.f39840((SubLObject)$ic458$, (SubLObject)$ic459$, (SubLObject)TWO_INTEGER);
        Hashtables.sethash((SubLObject)$ic463$, module0014.$g125$.getGlobalValue(), (SubLObject)ConsesLow.list((SubLObject)$ic464$, (SubLObject)NIL));
        module0656.f39840((SubLObject)$ic13$, (SubLObject)$ic472$, (SubLObject)TWO_INTEGER);
        module0015.f873((SubLObject)$ic473$);
        module0015.f873((SubLObject)$ic18$);
        module0656.f39840((SubLObject)$ic519$, (SubLObject)$ic521$, (SubLObject)TWO_INTEGER);
        module0015.f873((SubLObject)$ic523$);
        return (SubLObject)NIL;
    }

    @Override
    public void declareFunctions() {
        f40906();
    }

    @Override
    public void initializeVariables() {
        f40907();
    }

    @Override
    public void runTopLevelForms() {
        f40908();
    }

    static {
        me = (SubLFile)new module0669();
        $g5278$ = null;
        $g5279$ = null;
        $g5280$ = null;
        $g5281$ = null;
        $g5282$ = null;
        $g5283$ = null;
        $g5284$ = null;
        $g5285$ = null;
        $g5286$ = null;
        $g5287$ = null;
        $g5288$ = null;
        $g5289$ = null;
        $g5290$ = null;
        $g5291$ = null;
        $g5292$ = null;
        $g5293$ = null;
        $g5294$ = null;
        $g5295$ = null;
        $g5296$ = null;
        $g5297$ = null;
        $ic0$ = makeString("<!DOCTYPE html PUBLIC \"-//W3C//DTD XHTML 1.0 Transitional//EN\" \"http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd\">");
        $ic1$ = makeKeyword("CB-CYC");
        $ic2$ = makeString("stylesheet");
        $ic3$ = makeString("text/css");
        $ic4$ = makeKeyword("CB-C-INDEX");
        $ic5$ = makeString("cb-c-index.html");
        $ic6$ = makeKeyword("AUXILIARY-INDEX");
        $ic7$ = makeKeyword("MAIN");
        $ic8$ = makeSymbol("S#44179", "CYC");
        $ic9$ = makeKeyword("CYCL");
        $ic10$ = makeKeyword("AUXILIARY-INDICES");
        $ic11$ = makeKeyword("DOCUMENTATION");
        $ic12$ = makeKeyword("DEFINITIONAL");
        $ic13$ = makeKeyword("GRAPH");
        $ic14$ = makeKeyword("DESCRIBE-NART");
        $ic15$ = makeKeyword("DESCRIBE-CONSTANT");
        $ic16$ = makeKeyword("CHRONOLOGICAL-ORDER");
        $ic17$ = makeKeyword("HANDLER");
        $ic18$ = makeSymbol("CB-C-PERTINENT-QUERY-LINKS");
        $ic19$ = makeKeyword("ARGS");
        $ic20$ = makeString("term");
        $ic21$ = makeKeyword("MESSAGE");
        $ic22$ = makeString("Checking for Pertinent Queries...");
        $ic23$ = makeKeyword("TAG");
        $ic24$ = makeString("div");
        $ic25$ = makeKeyword("DELAY");
        $ic26$ = makeInteger(50);
        $ic27$ = makeKeyword("ALL-ASSERTED-KNOWLEDGE");
        $ic28$ = makeKeyword("INFERRED-INDEX");
        $ic29$ = makeString("Inferred Index");
        $ic30$ = makeKeyword("SELF");
        $ic31$ = makeSymbol("S#44161", "CYC");
        $ic32$ = makeSymbol("S#44159", "CYC");
        $ic33$ = makeSymbol("S#44158", "CYC");
        $ic34$ = makeKeyword("LEFT");
        $ic35$ = makeKeyword("TOP");
        $ic36$ = makeString("lightyellow");
        $ic37$ = makeKeyword("NBSP");
        $ic38$ = makeString("Viewpoint Filters");
        $ic39$ = makeKeyword("BOOKKEEPING-ASSERTIONS");
        $ic40$ = makeKeyword("CONSTANT-TOTAL");
        $ic41$ = makeString("Unknown auxiliary index ~a");
        $ic42$ = makeKeyword("GAF-ARG");
        $ic43$ = makeString("");
        $ic44$ = makeKeyword("VISIBLE");
        $ic45$ = makeKeyword("TEXT");
        $ic46$ = makeKeyword("GAF-ARG-PREDICATE");
        $ic47$ = makeKeyword("GAF-ARG-PREDICATE-CONTENT");
        $ic48$ = makeKeyword("CONTENT");
        $ic49$ = makeKeyword("INVISIBLE");
        $ic50$ = makeString("~A_arg_~A");
        $ic51$ = makeString("arg_~A");
        $ic52$ = makeKeyword("NART-ARG");
        $ic53$ = makeString("nart_arg_~A");
        $ic54$ = makeKeyword("NART-ARG-FUNCTION");
        $ic55$ = makeKeyword("NART-ARG-FUNCTION-CONTENT");
        $ic56$ = makeString("pred_extent");
        $ic57$ = makeKeyword("PREDICATE-EXTENT");
        $ic58$ = makeKeyword("FUNCTION-EXTENT");
        $ic59$ = makeKeyword("PREDICATE-RULE");
        $ic60$ = makeKeyword("NEG");
        $ic61$ = makeKeyword("POS");
        $ic62$ = makeString("pred_rule_~A");
        $ic63$ = makeString("rule_~A_~A_~A");
        $ic64$ = makeKeyword("DECONTEXTUALIZED-IST-PREDICATE-RULE");
        $ic65$ = makeString("decontextualized_ist_pred_rule_~A");
        $ic66$ = makeKeyword("ISA-RULE");
        $ic67$ = makeString("isa_rule_~A");
        $ic68$ = makeKeyword("QUOTED-ISA-RULE");
        $ic69$ = makeString("quoted_isa_rule_~A");
        $ic70$ = makeKeyword("GENLS-RULE");
        $ic71$ = makeString("genl_rule_~A");
        $ic72$ = makeKeyword("GENL-MT-RULE");
        $ic73$ = makeString("genl_mt_rule_~A");
        $ic74$ = makeKeyword("FUNCTION-RULE");
        $ic75$ = makeKeyword("UNBOUND-RULE");
        $ic76$ = makeKeyword("OTHER");
        $ic77$ = makeKeyword("IST-BROAD");
        $ic78$ = makeKeyword("IST");
        $ic79$ = makeKeyword("MT-GAFS");
        $ic80$ = makeKeyword("MT-RULES");
        $ic81$ = makeKeyword("HL-FORMULAS-FOR-INDEX-HOOK");
        $ic82$ = makeKeyword("EL-FORMULAS-FOR-INDEX-HOOK");
        $ic83$ = makeKeyword("HL-FORMULAS");
        $ic84$ = makeKeyword("EL-FORMULAS");
        $ic85$ = makeKeyword("EL-FORMULAS-EXCEPT-WHEN-BROWSING-SKOLEMS");
        $ic86$ = makeKeyword("HISTORY");
        $ic87$ = ConsesLow.list((SubLObject)makeSymbol("S#44182", "CYC"));
        $ic88$ = makeString("Could not determine an index-hook from ~a");
        $ic89$ = makeString(":");
        $ic90$ = makeSymbol("CB-C-EL");
        $ic91$ = makeString("[EL Formulas]");
        $ic92$ = makeString("cb-c-el&~A");
        $ic93$ = makeSymbol("S#44781", "CYC");
        $ic94$ = makeSymbol("CB-C-HL");
        $ic95$ = makeString("[HL Formulas]");
        $ic96$ = makeString("cb-c-hl&~A");
        $ic97$ = makeSymbol("S#44782", "CYC");
        $ic98$ = ConsesLow.list((SubLObject)makeSymbol("S#44996", "CYC"));
        $ic99$ = makeString("Could not determine a term from ~a");
        $ic100$ = makeSymbol("CB-C-DOCUMENTATION");
        $ic101$ = makeString("Documentation");
        $ic102$ = makeString("cb-c-documentation&~A");
        $ic103$ = makeSymbol("S#44783", "CYC");
        $ic104$ = makeSymbol("S#44787", "CYC");
        $ic105$ = makeSymbol("S#44977", "CYC");
        $ic106$ = makeInteger(64);
        $ic107$ = makeKeyword("&MEMOIZED-ITEM-NOT-FOUND&");
        $ic108$ = ConsesLow.list((SubLObject)ConsesLow.cons((SubLObject)makeString("latest OpenCyc"), (SubLObject)makeSymbol("S#44997", "CYC")), (SubLObject)ConsesLow.cons((SubLObject)makeString("versioned OpenCyc"), (SubLObject)makeSymbol("S#44998", "CYC")), (SubLObject)ConsesLow.cons((SubLObject)makeString("readable OpenCyc"), (SubLObject)makeSymbol("S#44999", "CYC")), (SubLObject)ConsesLow.cons((SubLObject)makeString("latest Cyc"), (SubLObject)makeSymbol("S#45000", "CYC")), (SubLObject)ConsesLow.cons((SubLObject)makeString("versioned Cyc"), (SubLObject)makeSymbol("S#45001", "CYC")), (SubLObject)ConsesLow.cons((SubLObject)makeString("readable Cyc"), (SubLObject)makeSymbol("S#45002", "CYC")));
        $ic109$ = makeSymbol("FORT-P");
        $ic110$ = makeString(" documentation :");
        $ic111$ = makeKeyword("RED");
        $ic112$ = makeString(" is mentioned in code.");
        $ic113$ = makeString("semantic_web_uris");
        $ic114$ = makeString("Semantic Web URIs");
        $ic115$ = (SubLList)ConsesLow.cons((SubLObject)makeSymbol("S#1572", "CYC"), (SubLObject)makeSymbol("METHOD"));
        $ic116$ = makeKeyword("RIGHT");
        $ic117$ = makeKeyword("CENTER");
        $ic118$ = makeString(" : ");
        $ic119$ = constant_handles_oc.f8479((SubLObject)makeString("GetPredsAndMetaDataForExternalDocumentationURL"));
        $ic120$ = makeSymbol("?MT");
        $ic121$ = makeSymbol("?PRED");
        $ic122$ = makeSymbol("?DISPLAY-STRING");
        $ic123$ = constant_handles_oc.f8479((SubLObject)makeString("GetURLsFromExternalURLPred"));
        $ic124$ = ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("TheFn")), constant_handles_oc.f8479((SubLObject)makeString("Thing")));
        $ic125$ = ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("TheFn")), constant_handles_oc.f8479((SubLObject)makeString("DocumentationPageExternalURLPredicate")));
        $ic126$ = ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("TheFn")), constant_handles_oc.f8479((SubLObject)makeString("Microtheory")));
        $ic127$ = makeString("external_links");
        $ic128$ = makeString("External Links");
        $ic129$ = makeSymbol("<");
        $ic130$ = makeSymbol("S#17476", "CYC");
        $ic131$ = makeString("kb_subsets");
        $ic132$ = makeString("Relevant KB Subsets");
        $ic133$ = constant_handles_oc.f8479((SubLObject)makeString("quotedIsa"));
        $ic134$ = makeSymbol("S#12274", "CYC");
        $ic135$ = constant_handles_oc.f8479((SubLObject)makeString("EverythingPSC"));
        $ic136$ = constant_handles_oc.f8479((SubLObject)makeString("CycKBSubsetCollection"));
        $ic137$ = makeSymbol("S#17515", "CYC");
        $ic138$ = makeString("Created");
        $ic139$ = makeString(" by ");
        $ic140$ = makeString(" on ");
        $ic141$ = makeString(" at ");
        $ic142$ = makeString(" for ");
        $ic143$ = constant_handles_oc.f8479((SubLObject)makeString("myCreator"));
        $ic144$ = constant_handles_oc.f8479((SubLObject)makeString("myCreationPurpose"));
        $ic145$ = constant_handles_oc.f8479((SubLObject)makeString("myCreationTime"));
        $ic146$ = constant_handles_oc.f8479((SubLObject)makeString("myCreationSecond"));
        $ic147$ = constant_handles_oc.f8479((SubLObject)makeString("BookkeepingMt"));
        $ic148$ = makeString("Bookkeeping Assertions : ");
        $ic149$ = makeString("Documentation for ~S");
        $ic150$ = makeString("yui-skin-sam");
        $ic151$ = makeString("reloadFrameButton");
        $ic152$ = makeString("button");
        $ic153$ = makeString("reload");
        $ic154$ = makeString("Refresh");
        $ic155$ = makeString("reloadCurrentFrame('reloadFrameButton');");
        $ic156$ = makeString("Invalid attempt to reuse memoization state in multiple threads simultaneously.");
        $ic157$ = makeKeyword("HTML");
        $ic158$ = makeString("Bad type of term ~A~%");
        $ic159$ = makeKeyword("NEW");
        $ic160$ = constant_handles_oc.f8479((SubLObject)makeString("sharedNotes"));
        $ic161$ = makeString("No documentation assertions for ");
        $ic162$ = makeSymbol("ASSERTION-P");
        $ic163$ = makeString("In Mt : ");
        $ic164$ = makeString("Mt : ");
        $ic165$ = ConsesLow.list((SubLObject)makeSymbol("S#37820", "CYC"));
        $ic166$ = makeSymbol("CB-C-DEFINITIONAL");
        $ic167$ = makeString("Definitional Info");
        $ic168$ = makeString("cb-c-definitional&~A");
        $ic169$ = makeSymbol("S#44799", "CYC");
        $ic170$ = makeKeyword("INFERRED");
        $ic171$ = makeString("Definitional info for ~S");
        $ic172$ = makeString("Refresh Frames");
        $ic173$ = constant_handles_oc.f8479((SubLObject)makeString("salientAssertions"));
        $ic174$ = makeKeyword("CB-DESCRIBE-CONSTANT");
        $ic175$ = makeString("cb-describe-constant.html");
        $ic176$ = makeString("the Constant Internal Data page");
        $ic177$ = makeString("~a does not specify a Cyc constant");
        $ic178$ = makeString("Constant Internal Data");
        $ic179$ = makeKeyword("SHA1");
        $ic180$ = makeString("text/javascript");
        $ic181$ = makeString("Internal data for constant :");
        $ic182$ = makeString("Name :");
        $ic183$ = makeString("(ephemeral, internal) ");
        $ic184$ = makeString("SUID :");
        $ic185$ = makeString("(permanent, external) ");
        $ic186$ = makeString("GUID :");
        $ic187$ = makeString("(compact external) ");
        $ic188$ = makeString("HL ID :");
        $ic189$ = makeString("To use in Java OpenCYC API:");
        $ic190$ = makeString("new CycConstant(~S, new Guid(~S))");
        $ic191$ = makeSymbol("CB-DESCRIBE-CONSTANT");
        $ic192$ = makeString("cb-describe-constant&~A");
        $ic193$ = makeString("Internal Data");
        $ic194$ = makeSymbol("S#44803", "CYC");
        $ic195$ = makeKeyword("CB-DESCRIBE-NAT");
        $ic196$ = makeString("cb-describe-nat.html");
        $ic197$ = makeString("the Reified NAT Internal Data page");
        $ic198$ = makeString("~a does not specify a Cyc reified NAT");
        $ic199$ = makeString("Reified NAT Internal Data");
        $ic200$ = makeString("Internal data for Reified NAT :");
        $ic201$ = makeString("ID Number :");
        $ic202$ = makeString("HL Formula :");
        $ic203$ = makeString("(compact, external) ");
        $ic204$ = makeString("HL ID String : ");
        $ic205$ = makeSymbol("CB-DESCRIBE-NART");
        $ic206$ = makeString("cb-describe-nart&~A");
        $ic207$ = makeSymbol("S#44804", "CYC");
        $ic208$ = makeString("Inference Data");
        $ic209$ = makeKeyword("PREDICATE-SPECIFIC-REMOVAL-MODULES");
        $ic210$ = makeString("[Removal Modules]");
        $ic211$ = makeKeyword("PREDICATE-SPECIFIC-PREFERENCE-MODULES");
        $ic212$ = makeString("[Preference Modules]");
        $ic213$ = makeKeyword("PREDICATE-SPECIFIC-HL-STORAGE-MODULES");
        $ic214$ = makeString("[Storage Modules]");
        $ic215$ = makeSymbol("CB-C-ALL-ASSERTED-KNOWLEDGE");
        $ic216$ = makeString("All assertions for ~S");
        $ic217$ = makeString("cb-c-all-asserted-knowledge&~A");
        $ic218$ = makeString("All Asserted Knowledge");
        $ic219$ = makeString(" (~a)");
        $ic220$ = makeSymbol("S#44808", "CYC");
        $ic221$ = makeString("All bookeeping assertions for ~S");
        $ic222$ = makeSymbol("CB-C-BOOKKEEPING-ASSERTIONS");
        $ic223$ = makeString("cb-c-bookkeeping-assertions&~A");
        $ic224$ = makeString("Bookkeeping Info");
        $ic225$ = makeSymbol("S#44809", "CYC");
        $ic226$ = makeSymbol("CB-C-TOTAL");
        $ic227$ = makeString("cb-c-total&~A");
        $ic228$ = makeString("All KB Assertions");
        $ic229$ = makeSymbol("S#44811", "CYC");
        $ic230$ = makeString("cb-assertion-chronology&~A");
        $ic231$ = makeString("Assertions History");
        $ic232$ = makeSymbol("S#44813", "CYC");
        $ic233$ = makeString("Assertion History");
        $ic234$ = makeSymbol("CB-ASSERTION-CHRONOLOGY");
        $ic235$ = makeString("unknown");
        $ic236$ = makeSymbol("ASSERTION-ID");
        $ic237$ = makeSymbol("S#16795", "CYC");
        $ic238$ = ConsesLow.list((SubLObject)makeSymbol("S#44182", "CYC"), (SubLObject)makeSymbol("&OPTIONAL"), (SubLObject)makeSymbol("S#44449", "CYC"), (SubLObject)makeSymbol("S#13108", "CYC"), (SubLObject)makeSymbol("S#13109", "CYC"));
        $ic239$ = makeString("Could not determine an arg from ~a");
        $ic240$ = makeString("Could not determine a microtheory from ~a");
        $ic241$ = makeSymbol("CB-C-GAF-ARG");
        $ic242$ = makeString("GAF index for ~S");
        $ic243$ = makeString("cb-c-gaf-arg&~A");
        $ic244$ = makeString("&~a");
        $ic245$ = makeString("Arg ~a");
        $ic246$ = makeString("All GAFs");
        $ic247$ = makeSymbol("S#44817", "CYC");
        $ic248$ = makeSymbol("S#44163", "CYC");
        $ic249$ = makeKeyword("NL");
        $ic250$ = makeKeyword("SILK");
        $ic251$ = makeKeyword("FALSE");
        $ic252$ = makeSymbol("S#22003", "CYC");
        $ic253$ = makeSymbol("S#44825", "CYC");
        $ic254$ = makeSymbol("S#44824", "CYC");
        $ic255$ = makeSymbol("S#43755", "CYC");
        $ic256$ = makeSymbol("S#43756", "CYC");
        $ic257$ = makeSymbol("S#43751", "CYC");
        $ic258$ = makeSymbol("S#43752", "CYC");
        $ic259$ = makeSymbol("S#43753", "CYC");
        $ic260$ = makeSymbol("S#43754", "CYC");
        $ic261$ = ConsesLow.list((SubLObject)makeSymbol("S#44182", "CYC"), (SubLObject)makeSymbol("&OPTIONAL"), (SubLObject)makeSymbol("S#44449", "CYC"), (SubLObject)makeSymbol("S#45003", "CYC"));
        $ic262$ = makeString("NART index for ~S");
        $ic263$ = makeSymbol("CB-C-NART-ARG");
        $ic264$ = makeString("cb-c-nart-arg&~A");
        $ic265$ = makeString("All NARTs");
        $ic266$ = makeSymbol("S#44828", "CYC");
        $ic267$ = makeSymbol("S#44835", "CYC");
        $ic268$ = makeSymbol("S#44834", "CYC");
        $ic269$ = makeSymbol("S#43887", "CYC");
        $ic270$ = makeString("Individual");
        $ic271$ = makeString("Index");
        $ic272$ = makeString("NAUT");
        $ic273$ = constant_handles_oc.f8479((SubLObject)makeString("Function-Denotational"));
        $ic274$ = makeString("Function");
        $ic275$ = makeKeyword("IMPLEMENTATION-CONSTANTS");
        $ic276$ = makeString("implementation-constants.html");
        $ic277$ = constant_handles_oc.f8479((SubLObject)makeString("ImplementationConstant"));
        $ic278$ = makeString(" is not used to represent common sense knowledge.");
        $ic279$ = makeString("-1");
        $ic280$ = makeKeyword("DOC");
        $ic281$ = makeString("[Explain]");
        $ic282$ = makeString("GAF Arg : ~A");
        $ic283$ = makeString("NART Arg : ~A");
        $ic284$ = makeString("Monadic Mt : ");
        $ic285$ = makeString("Time Interval : ");
        $ic286$ = makeString("Time Parameter : ");
        $ic287$ = makeString("Predicate : ");
        $ic288$ = makeString("neg");
        $ic289$ = makeString("not");
        $ic290$ = makeString("Predicate extent index for ~S");
        $ic291$ = ConsesLow.list((SubLObject)makeSymbol("S#44182", "CYC"), (SubLObject)makeSymbol("&OPTIONAL"), (SubLObject)makeSymbol("S#13109", "CYC"));
        $ic292$ = makeSymbol("CB-C-PREDICATE-EXTENT");
        $ic293$ = makeString("cb-c-predicate-extent&~A");
        $ic294$ = makeString("Predicate Extent");
        $ic295$ = makeSymbol("S#44847", "CYC");
        $ic296$ = makeString(" Extent :");
        $ic297$ = makeString("Function extent index for ~S");
        $ic298$ = makeSymbol("CB-C-FUNCTION-EXTENT");
        $ic299$ = makeString("cb-c-function-extent&~A");
        $ic300$ = makeString("Function Extent");
        $ic301$ = makeSymbol("S#44851", "CYC");
        $ic302$ = ConsesLow.list((SubLObject)makeSymbol("S#44182", "CYC"), (SubLObject)makeSymbol("&OPTIONAL"), (SubLObject)makeSymbol("S#45004", "CYC"), (SubLObject)makeSymbol("S#13109", "CYC"), (SubLObject)makeSymbol("S#45005", "CYC"));
        $ic303$ = makeString("Could not determine a literal sense ~S");
        $ic304$ = makeString("Could not determine a direction from ~S");
        $ic305$ = makeString("Predicate rule index for ~S");
        $ic306$ = makeSymbol("CB-C-PREDICATE-RULE");
        $ic307$ = makeString("cb-c-predicate-rule&~A");
        $ic308$ = makeString("&~s");
        $ic309$ = makeString("Antecedent");
        $ic310$ = makeString("Consequent");
        $ic311$ = makeString("All Rules");
        $ic312$ = makeSymbol("S#44854", "CYC");
        $ic313$ = ConsesLow.list((SubLObject)makeKeyword("NEG"), (SubLObject)makeKeyword("POS"));
        $ic314$ = ConsesLow.list((SubLObject)makeSymbol("S#44182", "CYC"), (SubLObject)makeSymbol("&OPTIONAL"), (SubLObject)makeSymbol("S#45004", "CYC"), (SubLObject)makeSymbol("S#45005", "CYC"));
        $ic315$ = makeString("ist Predicate rule index for ~S");
        $ic316$ = makeSymbol("CB-C-DECONTEXTUALIZED-IST-PREDICATE-RULE");
        $ic317$ = makeString("cb-c-decontextualized-ist-predicate-rule&~A");
        $ic318$ = makeString("All Lifting Rules");
        $ic319$ = makeSymbol("S#44860", "CYC");
        $ic320$ = makeString("isa rule index for ~S");
        $ic321$ = makeSymbol("CB-C-ISA-RULE");
        $ic322$ = makeString("cb-c-isa-rule&~A");
        $ic323$ = makeString("All isa Rules");
        $ic324$ = makeSymbol("S#44865", "CYC");
        $ic325$ = makeString("isa");
        $ic326$ = makeString("quoted isa rule index for ~S");
        $ic327$ = makeSymbol("CB-C-QUOTED-ISA-RULE");
        $ic328$ = makeString("cb-c-quoted-isa-rule&~A");
        $ic329$ = makeString("All quoted isa Rules");
        $ic330$ = makeSymbol("S#44871", "CYC");
        $ic331$ = makeString("quoted isa");
        $ic332$ = makeString("genls rule index for ~S");
        $ic333$ = makeSymbol("CB-C-GENLS-RULE");
        $ic334$ = makeString("cb-c-genls-rule&~A");
        $ic335$ = makeString("All genls Rules");
        $ic336$ = makeSymbol("S#44877", "CYC");
        $ic337$ = makeString("genls");
        $ic338$ = makeString("genlMt rule index for ~S");
        $ic339$ = makeSymbol("CB-C-GENL-MT-RULE");
        $ic340$ = makeString("cb-c-genl-mt-rule&~A");
        $ic341$ = makeString("All genlMt Rules");
        $ic342$ = makeSymbol("S#44883", "CYC");
        $ic343$ = makeString("genlMt");
        $ic344$ = ConsesLow.list((SubLObject)makeSymbol("S#44182", "CYC"), (SubLObject)makeSymbol("&OPTIONAL"), (SubLObject)makeSymbol("S#13109", "CYC"), (SubLObject)makeSymbol("S#45005", "CYC"));
        $ic345$ = makeString("Function rule index for ~S");
        $ic346$ = makeSymbol("CB-C-FUNCTION-RULE");
        $ic347$ = makeString("cb-c-function-rule&~A");
        $ic348$ = makeString("Function Rules");
        $ic349$ = makeSymbol("S#44889", "CYC");
        $ic350$ = makeString(" Rules :");
        $ic351$ = ConsesLow.list((SubLObject)makeSymbol("&OPTIONAL"), (SubLObject)makeSymbol("S#45004", "CYC"), (SubLObject)makeSymbol("S#13109", "CYC"), (SubLObject)makeSymbol("S#45005", "CYC"));
        $ic352$ = makeString("Could not determine an index-hook");
        $ic353$ = makeString("Unbound rule index");
        $ic354$ = makeSymbol("CB-C-UNBOUND-RULE");
        $ic355$ = makeString("cb-c-unbound-rule");
        $ic356$ = makeSymbol("S#44894", "CYC");
        $ic357$ = makeString(" ");
        $ic358$ = makeString("Antecedent Rules");
        $ic359$ = makeString("Consequent Rules");
        $ic360$ = makeString("Direction : ");
        $ic361$ = makeString("MT index for ~S");
        $ic362$ = makeSymbol("CB-C-IST");
        $ic363$ = makeString("cb-c-ist&~A");
        $ic364$ = makeString("Microtheory Contents");
        $ic365$ = makeSymbol("S#44902", "CYC");
        $ic366$ = makeString(" (expensive!)");
        $ic367$ = makeSymbol("S#44903", "CYC");
        $ic368$ = makeString("Microtheory Contents :");
        $ic369$ = makeString("MT GAFs for ~S");
        $ic370$ = makeSymbol("CB-C-MT-GAFS");
        $ic371$ = makeString("cb-c-mt-gafs&~A");
        $ic372$ = makeString("Microtheory GAFs");
        $ic373$ = makeString(" (?)");
        $ic374$ = makeSymbol("S#44905", "CYC");
        $ic375$ = makeString("Microtheory GAFs :");
        $ic376$ = makeKeyword("MT");
        $ic377$ = makeKeyword("GAF");
        $ic378$ = makeKeyword("BROAD-MT");
        $ic379$ = makeString("do-broad-mt-index");
        $ic380$ = makeSymbol("STRINGP");
        $ic381$ = makeKeyword("SKIP");
        $ic382$ = makeSymbol("S#44909", "CYC");
        $ic383$ = makeSymbol("S#44910", "CYC");
        $ic384$ = makeString("MT Rules for ~S");
        $ic385$ = makeSymbol("CB-C-MT-RULES");
        $ic386$ = makeString("cb-c-mt-rules&~A");
        $ic387$ = makeString("Microtheory Rules");
        $ic388$ = makeSymbol("S#44911", "CYC");
        $ic389$ = makeString("Microtheory Rules :");
        $ic390$ = makeKeyword("RULE");
        $ic391$ = makeString("OTHER index for ~S");
        $ic392$ = makeSymbol("CB-C-OTHER");
        $ic393$ = makeString("cb-c-other&~A");
        $ic394$ = makeString("Miscellaneous");
        $ic395$ = makeSymbol("S#44914", "CYC");
        $ic396$ = makeString("Miscellaneous References :");
        $ic397$ = makeSymbol("S#12701", "CYC");
        $ic398$ = makeSymbol("S#12280", "CYC");
        $ic399$ = makeSymbol("S#12277", "CYC");
        $ic400$ = makeKeyword("CB-AUXILIARY-INDICES");
        $ic401$ = makeString("cb-auxiliary-indices.html");
        $ic402$ = makeString("Auxiliary Indices");
        $ic403$ = makeSymbol("STRING-LESSP");
        $ic404$ = makeSymbol("S#17452", "CYC");
        $ic405$ = makeString("Choose an auxiliary index : ");
        $ic406$ = makeString("No auxiliary indexes exist.");
        $ic407$ = makeSymbol("CB-AUXILIARY-INDICES");
        $ic408$ = makeString("Auxiliary Index List");
        $ic409$ = makeString("cb-auxiliary-indices");
        $ic410$ = makeSymbol("S#44917", "CYC");
        $ic411$ = makeString("~S did not specify an auxiliary index.");
        $ic412$ = makeString("The auxiliary index ~S is currently empty.");
        $ic413$ = makeString("Cannot have a FRAMESET tag inside a BODY tag.");
        $ic414$ = makeString("30%,*");
        $ic415$ = makeKeyword("INDEX");
        $ic416$ = makeSymbol("CB-AUXILIARY-INDEX");
        $ic417$ = makeString("cb-auxiliary-index&~A");
        $ic418$ = makeSymbol("S#44918", "CYC");
        $ic419$ = makeInteger(25);
        $ic420$ = makeString("Alphabetical search for `~A'");
        $ic421$ = makeKeyword("ALPHA-TERM");
        $ic422$ = makeKeyword("MISSING");
        $ic423$ = makeSymbol("CB-ALPHA");
        $ic424$ = makeSymbol("CB-AD");
        $ic425$ = makeKeyword("ALPHA");
        $ic426$ = makeString("alpha.gif");
        $ic427$ = makeString("[Alpha]");
        $ic428$ = makeString("~A");
        $ic429$ = makeString("cb-ad|~A");
        $ic430$ = makeKeyword("ALPHABETICAL");
        $ic431$ = makeSymbol("S#44919", "CYC");
        $ic432$ = makeKeyword("ALPHA-TOP");
        $ic433$ = makeString("Alph");
        $ic434$ = makeString("The Alphabetical Browser");
        $ic435$ = makeString("Top of Alphabetical Index");
        $ic436$ = makeSymbol("CB-ALPHA-TOP");
        $ic437$ = makeString("Top");
        $ic438$ = makeString("cb-alpha-top");
        $ic439$ = makeSymbol("S#44920", "CYC");
        $ic440$ = makeInteger(127);
        $ic441$ = makeString("Bottom of Alphabetical Index");
        $ic442$ = makeKeyword("BOTTOM");
        $ic443$ = makeSymbol("CB-ALPHA-BOTTOM");
        $ic444$ = makeString("Bottom");
        $ic445$ = makeString("cb-alpha-bottom");
        $ic446$ = makeKeyword("ALPHA-BOTTOM");
        $ic447$ = makeSymbol("S#44921", "CYC");
        $ic448$ = makeKeyword("PAGEUP");
        $ic449$ = makeSymbol("CB-ALPHA-PAGEUP");
        $ic450$ = makeString("Page Up");
        $ic451$ = makeString("cb-alpha-pageup|~A");
        $ic452$ = makeKeyword("ALPHA-PAGEUP");
        $ic453$ = makeSymbol("S#44922", "CYC");
        $ic454$ = makeKeyword("PAGEDN");
        $ic455$ = makeSymbol("CB-ALPHA-PAGEDN");
        $ic456$ = makeString("Page Down");
        $ic457$ = makeString("cb-alpha-pagedn|~A");
        $ic458$ = makeKeyword("ALPHA-PAGEDN");
        $ic459$ = makeSymbol("S#44923", "CYC");
        $ic460$ = makeString("Alphabetical index scroll");
        $ic461$ = makeString("ABCDEFGHIJKLMNOPQRSTUVWXYZ");
        $ic462$ = makeString("abcdefghijklmnopqrstuvwxyz");
        $ic463$ = makeKeyword("CB-ALPHA-INDEX");
        $ic464$ = makeString("cb-alpha-index.html");
        $ic465$ = makeString("|");
        $ic466$ = makeKeyword("MIDDLE");
        $ic467$ = makeString("---> ");
        $ic468$ = makeString(" ~A ");
        $ic469$ = makeString("would be here.");
        $ic470$ = makeSymbol("FIXNUMP");
        $ic471$ = makeString("cb-c-graph&~A");
        $ic472$ = makeSymbol("S#44965", "CYC");
        $ic473$ = makeSymbol("CB-C-GRAPH");
        $ic474$ = makeString("Assertion Graph for ~S");
        $ic475$ = makeString(" assertion graph");
        $ic476$ = makeString("Script Graph");
        $ic477$ = makeString("Unknown Graph");
        $ic478$ = constant_handles_oc.f8479((SubLObject)makeString("Situation"));
        $ic479$ = makeString("~a");
        $ic480$ = makeInteger(30);
        $ic481$ = makeString("Graphical editing of this script will not work until this term has a ");
        $ic482$ = constant_handles_oc.f8479((SubLObject)makeString("definingMt"));
        $ic483$ = makeString(" assertion.");
        $ic484$ = makeString("candidateProperSubSituationTypes");
        $ic485$ = makeSymbol("?ARG2");
        $ic486$ = constant_handles_oc.f8479((SubLObject)makeString("candidateProperSubSituationTypes"));
        $ic487$ = makeString("Note that since no scenes were found the editor will start blank.");
        $ic488$ = makeString("com.cyc.framework.ui.scriptEditor.command.AddGraphScriptCommand");
        $ic489$ = makeKeyword("BUILDER-FN");
        $ic490$ = makeSymbol("BBF-SCRIPT");
        $ic491$ = makeKeyword("PREDS");
        $ic492$ = makeKeyword("FORTS");
        $ic493$ = makeKeyword("DEPTH");
        $ic494$ = makeKeyword("CLASS-FILE");
        $ic495$ = makeString("com.cyc.framework.ui.scriptEditor.ScriptEditorApplet");
        $ic496$ = makeKeyword("WIDTH");
        $ic497$ = makeString("100%");
        $ic498$ = makeKeyword("HEIGHT");
        $ic499$ = makeString("90%");
        $ic500$ = makeKeyword("SIGNATURE");
        $ic501$ = makeString("pertinent_queries");
        $ic502$ = makeString("Troubleshooting");
        $ic503$ = makeString("Java Profile");
        $ic504$ = makeString("In order for the Grapher applet to contact the Cyc image, your java profile file needs to enable the following permissions:");
        $ic505$ = makeString("\ngrant codeBase \"http://localhost\" {\n  permission java.net.SocketPermission \"*:3600-3700\", \"accept, listen, connect, resolve\";\n};\n\ngrant codeBase \"http://127.0.0.1\" {\n  permission java.net.SocketPermission \"*:3600-3700\", \"accept, listen, connect, resolve\";\n};\n\ngrant codeBase \"http://$HOST\" {\n  permission java.net.SocketPermission \"*:3600-3700\", \"accept, listen, connect, resolve\";\n};\n\ngrant codeBase \"http://$HOSTNAME\" {\n  permission java.net.SocketPermission \"*:3600-3700\", \"accept, listen, connect, resolve\";\n};\n\ngrant {\n permission java.util.PropertyPermission \"*\", \"read\";\n permission java.util.logging.LoggingPermission \"control\";\n};");
        $ic506$ = makeString("On Linux systems this file should be located at ");
        $ic507$ = makeString("$HOME/.java.policy");
        $ic508$ = makeString(" .  See ");
        $ic509$ = makeString("http://download.oracle.com/javase/1.3/docs/guide/security/PolicyFiles.html#DefaultLocs");
        $ic510$ = makeString("the Oracle documentation");
        $ic511$ = makeString(" for other OS's.");
        $ic512$ = makeString("It worked once but then stopped working");
        $ic513$ = makeString("In your Java console, clear the classloader cache by hitting 'x'.  If that doesn't work you may need need to restart your browser.");
        $ic514$ = makeString("Pertinent Queries (~S)");
        $ic515$ = makeSymbol("?QUERY");
        $ic516$ = constant_handles_oc.f8479((SubLObject)makeString("queryHasVeryHighPertinenceForThing"));
        $ic517$ = constant_handles_oc.f8479((SubLObject)makeString("InferencePSC"));
        $ic518$ = ConsesLow.list((SubLObject)makeKeyword("ANSWER-LANGUAGE"), (SubLObject)makeKeyword("HL"), (SubLObject)makeKeyword("INFERENCE-MODE"), (SubLObject)makeKeyword("SHALLOW"));
        $ic519$ = makeKeyword("PERTINENT-QUERY");
        $ic520$ = makeString("cb-c-pertinent-query&term=~A&query=~A");
        $ic521$ = makeSymbol("S#44975", "CYC");
        $ic522$ = makeString("query");
        $ic523$ = makeSymbol("CB-C-PERTINENT-QUERY");
    }
}

/*
	DECOMPILATION REPORT

	Decompiled from: G:\opt\CYC_JRTL_with_CommonLisp\platform\lib\cyc-oc4.0-unzipped/com/cyc/cycjava/cycl/class
	Total time: 7488 ms

	Decompiled with Procyon 0.5.32.
*/