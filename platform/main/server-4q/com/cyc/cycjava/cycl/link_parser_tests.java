package com.cyc.cycjava.cycl;


import static com.cyc.cycjava.cycl.cyc_testing.generic_testing.define_test_case_table_int;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.list;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality.equal;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.symbol_function;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Vectors.vector;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeString;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeSymbol;
import static com.cyc.tool.subl.util.SubLFiles.declareFunction;

import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;


public final class link_parser_tests extends SubLTranslatedFile {
    public static final SubLFile me = new link_parser_tests();

    public static final String myName = "com.cyc.cycjava.cycl.link_parser_tests";

    public static final String myFingerPrint = "466e7f58a7318a411800ae22f2ef4c19e4b49453737c14583074e5a42d827e0c";

    // Internal Constants
    public static final SubLSymbol LINK_PARSE = makeSymbol("LINK-PARSE");













    private static final SubLObject $list7 = _constant_7_initializer();





    private static final SubLSymbol TEST_GET_LINK_PHRASE = makeSymbol("TEST-GET-LINK-PHRASE");

    private static final SubLList $list11 = list(new SubLObject[]{ list(list(makeString("This luxurious carpet from Kashmir is expensive"), makeString("carpet"), makeString("this luxurious carpet from Kashmir")), T), list(list(makeString("She knows."), makeString("she"), makeString("she")), T), list(list(makeString("A set of tubes is located inside the muffler."), makeString("muffler"), makeString("the muffler")), T), list(list(makeString("Many retired soldiers are speaking out about fairness in reporting on the war in Iraq"), makeString("soldiers"), makeString("many retired soldiers")), T), list(list(makeString("A lovestruck teen personally delivers his declaration of love"), makeString("declaration"), makeString("his declaration of love")), T), list(list(makeString("The man who tried to kill the Pope is released"), makeString("man"), makeString("the man who tried to kill the Pope")), T), list(list(makeString("The velvet dress by Versace was a big hit"), makeString("dress"), makeString("the velvet dress by Versace")), T), list(list(makeString("They specialize in the sale of antique porcelains"), makeString("porcelains"), makeString("antique porcelains")), T), list(list(makeString("Graceful ballerinas with good postures were seen everywhere"), makeString("ballerinas"), makeString("graceful ballerinas with good postures")), T) });

    public static SubLObject test_get_link_phrase(final SubLObject sent, final SubLObject head, final SubLObject ans_phrase) {
        final SubLObject v_linkage = linkage.new_linkage(sent, UNPROVIDED);
        final SubLObject lp = linkage.get_link_phrase(list(methods.funcall_instance_method_with_1_args(v_linkage, SEARCH, head)));
        return equal(methods.funcall_instance_method_with_0_args(lp, GET_STRING), ans_phrase);
    }

    public static SubLObject declare_link_parser_tests_file() {
        declareFunction(me, "test_get_link_phrase", "TEST-GET-LINK-PHRASE", 3, 0, false);
        return NIL;
    }

    public static SubLObject init_link_parser_tests_file() {
        return NIL;
    }

    public static SubLObject setup_link_parser_tests_file() {
        define_test_case_table_int(LINK_PARSE, list(new SubLObject[]{ $TEST, symbol_function(EQUALP), $OWNER, NIL, $CLASSES, NIL, $KB, $FULL, $WORKING_, T }), $list7);
        define_test_case_table_int(TEST_GET_LINK_PHRASE, list(new SubLObject[]{ $TEST, EQ, $OWNER, NIL, $CLASSES, NIL, $KB, $FULL, $WORKING_, T }), $list11);
        return NIL;
    }

    private static SubLObject _constant_7_initializer() {
        return list(new SubLObject[]{ list(list(makeString("John loves Mary")), list(vector(new SubLObject[]{ vector(new SubLObject[]{ makeString("LEFT-WALL"), makeString("John.n"), makeString("loves"), makeString("Mary"), makeString("RIGHT-WALL") }), vector(new SubLObject[]{ list(makeString("RW"), ZERO_INTEGER, FOUR_INTEGER), list(makeString("Wd"), ZERO_INTEGER, ONE_INTEGER), list(makeString("Ss"), ONE_INTEGER, TWO_INTEGER), list(makeString("Os"), TWO_INTEGER, THREE_INTEGER) }), makeString("\n   +--Ss-+--Os-+\n   |     |     |\nJohn.n loves Mary \n\n"), makeString("(:S (:NP \"John\")\n   (:VP \"loves\"\n       (:NP \"Mary\")))\n") }))), list(list(makeString("The fact that he smiled at me gives me hope")), list(vector(new SubLObject[]{ vector(new SubLObject[]{ makeString("LEFT-WALL"), makeString("the"), makeString("fact.n"), makeString("that.c"), makeString("he"), makeString("smiled.v"), makeString("at"), makeString("me"), makeString("gives.v"), makeString("me"), makeString("hope.n"), makeString("RIGHT-WALL") }), vector(new SubLObject[]{ list(makeString("RW"), ZERO_INTEGER, ELEVEN_INTEGER), list(makeString("Wd"), ZERO_INTEGER, TWO_INTEGER), list(makeString("D*u"), ONE_INTEGER, TWO_INTEGER), list(makeString("Ss*t"), TWO_INTEGER, EIGHT_INTEGER), list(makeString("TH"), TWO_INTEGER, THREE_INTEGER), list(makeString("Cet"), THREE_INTEGER, FOUR_INTEGER), list(makeString("Ss"), FOUR_INTEGER, FIVE_INTEGER), list(makeString("MVp"), FIVE_INTEGER, SIX_INTEGER), list(makeString("J"), SIX_INTEGER, SEVEN_INTEGER), list(makeString("Osn"), EIGHT_INTEGER, TEN_INTEGER), list(makeString("Ox"), EIGHT_INTEGER, NINE_INTEGER) }), makeString("\n       +--------------Ss*t-------------+----Osn---+\n +-D*u-+--TH--+-Cet+--Ss-+-MVp-+-J+    +--Ox-+    |\n |     |      |    |     |     |  |    |     |    |\nthe fact.n that.c he smiled.v at me gives.v me hope.n \n\n"), makeString("(:S (:NP \"The\" \"fact\"\n       (:SBAR \"that\"\n             (:S (:NP \"he\")\n                (:VP \"smiled\"\n                    (:PP \"at\"\n                        (:NP \"me\"))))))\n   (:VP \"gives\"\n       (:NP \"me\")\n       (:NP \"hope\")))\n") }))), list(list(makeString("Many people were angered by the hearings")), list(vector(new SubLObject[]{ vector(new SubLObject[]{ makeString("LEFT-WALL"), makeString("many"), makeString("people.p"), makeString("were.v"), makeString("angered.v"), makeString("by"), makeString("the"), makeString("hearings.n"), makeString("RIGHT-WALL") }), vector(new SubLObject[]{ list(makeString("RW"), ZERO_INTEGER, EIGHT_INTEGER), list(makeString("Wd"), ZERO_INTEGER, TWO_INTEGER), list(makeString("Dmc"), ONE_INTEGER, TWO_INTEGER), list(makeString("Spx"), TWO_INTEGER, THREE_INTEGER), list(makeString("Pv"), THREE_INTEGER, FOUR_INTEGER), list(makeString("MVp"), FOUR_INTEGER, FIVE_INTEGER), list(makeString("Jp"), FIVE_INTEGER, SEVEN_INTEGER), list(makeString("Dmc"), SIX_INTEGER, SEVEN_INTEGER) }), makeString("\n                                +----Jp----+\n  +--Dmc-+--Spx--+---Pv--+--MVp-+  +--Dmc--+\n  |      |       |       |      |  |       |\nmany people.p were.v angered.v by the hearings.n \n\n"), makeString("(:S (:NP \"Many\" \"people\")\n   (:VP \"were\"\n       (:VP \"angered\"\n           (:PP \"by\"\n               (:NP \"the\" \"hearings\")))))\n") }))), list(list(makeString("2 million attended")), list(vector(new SubLObject[]{ vector(new SubLObject[]{ makeString("LEFT-WALL"), makeString("2"), makeString("million"), makeString("attended.v"), makeString("RIGHT-WALL") }), vector(new SubLObject[]{ list(makeString("RW"), ZERO_INTEGER, FOUR_INTEGER), list(makeString("Wd"), ZERO_INTEGER, TWO_INTEGER), list(makeString("NN"), ONE_INTEGER, TWO_INTEGER), list(makeString("Sp"), TWO_INTEGER, THREE_INTEGER) }), makeString("\n+-NN-+----Sp---+\n|    |         |\n2 million attended.v \n\n"), makeString("(:S (:NP \"2\" \"million\")\n   (:VP \"attended\"))\n") }))), list(list(makeString("We're thinking about going to a movie this evening")), list(vector(new SubLObject[]{ vector(new SubLObject[]{ makeString("LEFT-WALL"), makeString("we"), makeString("'re"), makeString("thinking.v"), makeString("about"), makeString("going.v"), makeString("to"), makeString("a"), makeString("movie.n"), makeString("this.d"), makeString("evening.t"), makeString("RIGHT-WALL") }), vector(new SubLObject[]{ list(makeString("RW"), ZERO_INTEGER, ELEVEN_INTEGER), list(makeString("Wd"), ZERO_INTEGER, ONE_INTEGER), list(makeString("Spx"), ONE_INTEGER, TWO_INTEGER), list(makeString("Pg"), TWO_INTEGER, THREE_INTEGER), list(makeString("MVp"), THREE_INTEGER, FOUR_INTEGER), list(makeString("Mgp"), FOUR_INTEGER, FIVE_INTEGER), list(makeString("MVpn"), FIVE_INTEGER, TEN_INTEGER), list(makeString("MVp"), FIVE_INTEGER, SIX_INTEGER), list(makeString("Js"), SIX_INTEGER, EIGHT_INTEGER), list(makeString("Ds"), SEVEN_INTEGER, EIGHT_INTEGER), list(makeString("DTn"), NINE_INTEGER, TEN_INTEGER) }), makeString("\n                           +------------MVpn------------+\n                           |     +--Js--+               |\n +Sp+---Pg--+--MVp--+--Mgp-+-MVp-+ +-Ds-+       +--DTn--+\n |  |       |       |      |     | |    |       |       |\nwe \'re thinking.v about going.v to a movie.n this.d evening.t \n\n"), makeString("(:S (:NP \"We\")\n   (:VP \"\'re\"\n       (:VP \"thinking\"\n           (:PP \"about\"\n               (:S (:VP \"going\"\n                      (:PP \"to\"\n                          (:NP \"a\" \"movie\"))\n                      (:NP \"this\" \"evening\")))))))\n") }))), list(list(makeString("Abrams does like programming")), list(vector(new SubLObject[]{ vector(new SubLObject[]{ makeString("LEFT-WALL"), makeString("Abrams"), makeString("does.v"), makeString("like.v"), makeString("programming.n"), makeString("RIGHT-WALL") }), vector(new SubLObject[]{ list(makeString("RW"), ZERO_INTEGER, FIVE_INTEGER), list(makeString("Wd"), ZERO_INTEGER, ONE_INTEGER), list(makeString("Ss"), ONE_INTEGER, TWO_INTEGER), list(makeString("I*d"), TWO_INTEGER, THREE_INTEGER), list(makeString("Os"), THREE_INTEGER, FOUR_INTEGER) }), makeString("\n   +--Ss--+--I*d-+----Os---+\n   |      |      |         |\nAbrams does.v like.v programming.n \n\n"), makeString("(:S (:NP \"Abrams\")\n   (:VP \"does\"\n       (:VP \"like\"\n           (:NP \"programming\"))))\n") }))), list(list(makeString("I have doubts about inviting him")), list(vector(new SubLObject[]{ vector(new SubLObject[]{ makeString("LEFT-WALL"), makeString("I.p"), makeString("have.v"), makeString("doubts.n"), makeString("about"), makeString("inviting.v"), makeString("him"), makeString("RIGHT-WALL") }), vector(new SubLObject[]{ list(makeString("RW"), ZERO_INTEGER, SEVEN_INTEGER), list(makeString("Wd"), ZERO_INTEGER, ONE_INTEGER), list(makeString("Sp*i"), ONE_INTEGER, TWO_INTEGER), list(makeString("MVp"), TWO_INTEGER, FOUR_INTEGER), list(makeString("Op"), TWO_INTEGER, THREE_INTEGER), list(makeString("Mgp"), FOUR_INTEGER, FIVE_INTEGER), list(makeString("Ox"), FIVE_INTEGER, SIX_INTEGER) }), makeString("\n       +------MVp-----+                \n +-Sp*i+---Op--+      +---Mgp--+--Ox--+\n |     |       |      |        |      |\nI.p have.v doubts.n about inviting.v him \n\n"), makeString("(:S (:NP \"I\")\n   (:VP \"have\"\n       (:NP \"doubts\")\n       (:PP \"about\"\n           (:S (:VP \"inviting\"\n                  (:NP \"him\"))))))\n") }))), list(list(makeString("You are lucky that there is no exam today")), list(vector(new SubLObject[]{ vector(new SubLObject[]{ makeString("LEFT-WALL"), makeString("you"), makeString("are.v"), makeString("lucky.a"), makeString("that.c"), makeString("there"), makeString("is.v"), makeString("no.d"), makeString("exam.n"), makeString("today"), makeString("RIGHT-WALL") }), vector(new SubLObject[]{ list(makeString("RW"), ZERO_INTEGER, TEN_INTEGER), list(makeString("Wd"), ZERO_INTEGER, ONE_INTEGER), list(makeString("Spx"), ONE_INTEGER, TWO_INTEGER), list(makeString("Pa"), TWO_INTEGER, THREE_INTEGER), list(makeString("TH"), THREE_INTEGER, FOUR_INTEGER), list(makeString("Cet"), FOUR_INTEGER, FIVE_INTEGER), list(makeString("SFst"), FIVE_INTEGER, SIX_INTEGER), list(makeString("MVpn"), SIX_INTEGER, NINE_INTEGER), list(makeString("Ost"), SIX_INTEGER, EIGHT_INTEGER), list(makeString("Ds"), SEVEN_INTEGER, EIGHT_INTEGER) }), makeString("\n                                 +------MVpn------+\n                                 +----Ost---+     |\n +-Spx+--Pa--+---TH--+-Cet-+-SFst+    +--Ds-+     |\n |    |      |       |     |     |    |     |     |\nyou are.v lucky.a that.c there is.v no.d exam.n today \n\n"), makeString("(:S (:NP \"You\")\n   (:VP \"are\"\n       (:ADJP \"lucky\"\n             (:SBAR \"that\"\n                   (:S (:NP \"there\")\n                      (:VP \"is\"\n                          (:NP \"no\" \"exam\")\n                          (:NP \"today\")))))))\n") }))), list(list(makeString("He is apparently an expert on dogs")), list(vector(new SubLObject[]{ vector(new SubLObject[]{ makeString("LEFT-WALL"), makeString("he"), makeString("is.v"), makeString("apparently"), makeString("an"), makeString("expert.n"), makeString("on"), makeString("dogs.n"), makeString("RIGHT-WALL") }), vector(new SubLObject[]{ list(makeString("RW"), ZERO_INTEGER, EIGHT_INTEGER), list(makeString("Wd"), ZERO_INTEGER, ONE_INTEGER), list(makeString("Ss"), ONE_INTEGER, TWO_INTEGER), list(makeString("MVp"), TWO_INTEGER, SIX_INTEGER), list(makeString("Ost"), TWO_INTEGER, FIVE_INTEGER), list(makeString("EBm"), TWO_INTEGER, THREE_INTEGER), list(makeString("Ds"), FOUR_INTEGER, FIVE_INTEGER), list(makeString("Jp"), SIX_INTEGER, SEVEN_INTEGER) }), makeString("\n     +------------MVp-----------+     \n     +---------Ost--------+     |     \n +-Ss+--EBm--+      +--Ds-+     +-Jp-+\n |   |       |      |     |     |    |\nhe is.v apparently an expert.n on dogs.n \n\n"), makeString("(:S (:NP \"He\")\n   (:VP \"is\" \"apparently\"\n       (:NP \"an\" \"expert\")\n       (:PP \"on\"\n           (:NP \"dogs\"))))\n") }))), list(list(makeString("Which dog did you chase")), list(vector(new SubLObject[]{ vector(new SubLObject[]{ makeString("LEFT-WALL"), makeString("which"), makeString("dog.n"), makeString("did.v"), makeString("you"), makeString("chase.v"), makeString("RIGHT-WALL") }), vector(new SubLObject[]{ list(makeString("RW"), ZERO_INTEGER, SIX_INTEGER), list(makeString("Wq"), ZERO_INTEGER, ONE_INTEGER), list(makeString("Ds*w"), ONE_INTEGER, TWO_INTEGER), list(makeString("Bsm"), TWO_INTEGER, FIVE_INTEGER), list(makeString("I*d"), THREE_INTEGER, FIVE_INTEGER), list(makeString("SIp"), THREE_INTEGER, FOUR_INTEGER) }), makeString("\n                  +-------Bsm------+\n                  |     +----I*d---+\n    +---Wq--+-Ds*w+     +-SIp+     |\n    |       |     |     |    |     |\nLEFT-WALL which dog.n did.v you chase.v \n\n"), makeString("(:S \"Which\" \"dog\" \"did\"\n   (:NP \"you\")\n   (:VP \"chase\"))\n") }))) });
    }

    @Override
    public void declareFunctions() {
        declare_link_parser_tests_file();
    }

    @Override
    public void initializeVariables() {
        init_link_parser_tests_file();
    }

    @Override
    public void runTopLevelForms() {
        setup_link_parser_tests_file();
    }

    
}

/**
 * Total time: 163 ms
 */
